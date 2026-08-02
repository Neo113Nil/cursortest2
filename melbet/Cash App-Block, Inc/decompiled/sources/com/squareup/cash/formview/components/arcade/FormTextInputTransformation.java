package com.squareup.cash.formview.components.arcade;

import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.internal.PartialGapBuffer;
import com.squareup.protos.franklin.api.FormBlocker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes6.dex */
public final class FormTextInputTransformation implements InputTransformation {
    public final Function0 onInvalidInput;
    public final ArrayList templateConfigs;
    public final List validations;

    public FormTextInputTransformation(List list, Function0 function0) {
        function0.getClass();
        list.getClass();
        this.onInvalidInput = function0;
        this.validations = list;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new TemplateConfig((FormBlocker.Element.TextInputElement.Validation) list.get(i)));
        }
        this.templateConfigs = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FormTextInputTransformation)) {
            return false;
        }
        FormTextInputTransformation formTextInputTransformation = (FormTextInputTransformation) obj;
        return Intrinsics.areEqual(this.onInvalidInput, formTextInputTransformation.onInvalidInput) && Intrinsics.areEqual(this.validations, formTextInputTransformation.validations);
    }

    public final int hashCode() {
        return this.validations.hashCode() + (this.onInvalidInput.hashCode() * 31);
    }

    public final String toString() {
        return "FormTextInputTransformation(onInvalidInput=" + this.onInvalidInput + ", validations=" + this.validations + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d0 A[LOOP:1: B:41:0x00ca->B:43:0x00d0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    @Override // androidx.compose.foundation.text.input.InputTransformation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void transformInput(TextFieldBuffer textFieldBuffer) {
        String filterFormattingChars;
        TemplateConfig findConfigFor;
        FormBlocker.Element.TextInputElement.Template template;
        String str;
        String str2;
        String filterFormattingChars2;
        int i;
        int length;
        int i2;
        Character ch;
        ArrayList arrayList = this.templateConfigs;
        if (arrayList.isEmpty()) {
            return;
        }
        PartialGapBuffer partialGapBuffer = textFieldBuffer.buffer;
        TextFieldCharSequence textFieldCharSequence = textFieldBuffer.originalValue;
        Object[] objArr = partialGapBuffer.length() < textFieldCharSequence.text.length();
        String partialGapBuffer2 = partialGapBuffer.toString();
        TemplateConfig findConfigFor2 = ArcadeFormEmojiPickerKt.findConfigFor(textFieldCharSequence.text.toString(), arrayList);
        if (findConfigFor2 != null) {
            partialGapBuffer2 = findConfigFor2.filterFormattingChars(partialGapBuffer2);
        }
        TemplateConfig findConfigFor3 = ArcadeFormEmojiPickerKt.findConfigFor(partialGapBuffer2, arrayList);
        Function0 function0 = this.onInvalidInput;
        String str3 = null;
        r8 = null;
        Character ch2 = null;
        str3 = null;
        str3 = null;
        str3 = null;
        if (findConfigFor3 != null) {
            filterFormattingChars = findConfigFor3.filterFormattingChars(partialGapBuffer2);
            Integer num = findConfigFor3.templateInputLength;
            if (num != null && filterFormattingChars.length() > num.intValue()) {
                if (objArr == false) {
                    function0.invoke();
                    textFieldBuffer.revertAllChanges();
                }
            }
            if (filterFormattingChars != null && (findConfigFor = ArcadeFormEmojiPickerKt.findConfigFor(filterFormattingChars, arrayList)) != null && (template = findConfigFor.template) != null && (str = template.template) != null) {
                str2 = template.template_placeholder_character;
                if (str2 != null && str2.length() == 1) {
                    ch2 = Character.valueOf(str2.charAt(0));
                }
                filterFormattingChars2 = findConfigFor.filterFormattingChars(filterFormattingChars);
                ArrayList arrayList2 = new ArrayList(filterFormattingChars2.length());
                for (i = 0; i < filterFormattingChars2.length(); i++) {
                    arrayList2.add(Character.valueOf(filterFormattingChars2.charAt(i)));
                }
                StringBuilder sb = new StringBuilder();
                length = str.length();
                for (i2 = 0; i2 < length; i2++) {
                    char charAt = str.charAt(i2);
                    if ((ch2 != null && charAt == ch2.charValue()) || ((ch = (Character) CollectionsKt.firstOrNull((List) arrayList2)) != null && charAt == ch.charValue())) {
                        sb.append(((Character) arrayList2.remove(0)).charValue());
                        if (arrayList2.isEmpty()) {
                            break;
                        }
                    } else {
                        sb.append(charAt);
                    }
                }
                str3 = sb.toString();
            }
            if (str3 != null) {
                return;
            }
            if (str3.length() < partialGapBuffer.length()) {
                textFieldBuffer.replace(str3.length(), partialGapBuffer.length(), "");
            }
            int length2 = str3.length();
            for (int i3 = 0; i3 < length2; i3++) {
                char charAt2 = str3.charAt(i3);
                if (i3 >= partialGapBuffer.length()) {
                    textFieldBuffer.append(charAt2);
                } else if (partialGapBuffer.charAt(i3) != charAt2) {
                    textFieldBuffer.replace(i3, i3 + 1, String.valueOf(charAt2));
                }
            }
            return;
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                TemplateConfig templateConfig = (TemplateConfig) it.next();
                FormBlocker.Element.TextInputElement.Template template2 = templateConfig.template;
                String str4 = template2 != null ? template2.template : null;
                if (str4 == null) {
                    str4 = "";
                }
                if (StringsKt__StringsJVMKt.startsWith(str4, partialGapBuffer2, false) && StringsKt__StringsJVMKt.startsWith(templateConfig.formattingChars, partialGapBuffer2, false)) {
                    break;
                }
            }
        }
        if (objArr == false) {
            function0.invoke();
            textFieldBuffer.revertAllChanges();
        }
        filterFormattingChars = null;
        if (filterFormattingChars != null) {
            str2 = template.template_placeholder_character;
            if (str2 != null) {
                ch2 = Character.valueOf(str2.charAt(0));
            }
            filterFormattingChars2 = findConfigFor.filterFormattingChars(filterFormattingChars);
            ArrayList arrayList22 = new ArrayList(filterFormattingChars2.length());
            while (i < filterFormattingChars2.length()) {
            }
            StringBuilder sb2 = new StringBuilder();
            length = str.length();
            while (i2 < length) {
            }
            str3 = sb2.toString();
        }
        if (str3 != null) {
        }
    }
}
