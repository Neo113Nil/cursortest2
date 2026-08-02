package com.squareup.cash.formview.components.arcade;

import com.squareup.protos.franklin.api.FormBlocker;
import java.util.regex.Pattern;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes6.dex */
public final class TemplateConfig {
    public final String formattingChars;
    public final Pattern pattern;
    public final FormBlocker.Element.TextInputElement.Template template;
    public final Integer templateInputLength;

    public TemplateConfig(FormBlocker.Element.TextInputElement.Validation validation) {
        String str;
        validation.getClass();
        String str2 = validation.regex;
        Integer num = null;
        if (str2 == null) {
            Handlers$$ExternalSyntheticBUOutline0.m(validation, "Empty regex in ");
            throw null;
        }
        Regex regex = new Regex(str2);
        FormBlocker.Element.TextInputElement.Template template = validation.template;
        String str3 = template != null ? template.template : null;
        str3 = str3 == null ? "" : str3;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str3.length(); i++) {
            char charAt = str3.charAt(i);
            FormBlocker.Element.TextInputElement.Template template2 = validation.template;
            String str4 = template2 != null ? template2.template_placeholder_character : null;
            if (!StringsKt.contains((CharSequence) (str4 == null ? "" : str4), charAt, false)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        for (int i2 = 0; i2 < sb2.length(); i2++) {
            char charAt2 = sb2.charAt(i2);
            FormBlocker.Element.TextInputElement.Template template3 = validation.template;
            String str5 = template3 != null ? template3.user_insertable_format_characters : null;
            if (!StringsKt.contains((CharSequence) (str5 == null ? "" : str5), charAt2, false)) {
                sb3.append(charAt2);
            }
        }
        String sb4 = sb3.toString();
        Pattern pattern = regex.nativePattern;
        pattern.getClass();
        this.pattern = pattern;
        this.template = template;
        this.formattingChars = sb4;
        if (template != null && (str = template.template) != null) {
            StringBuilder sb5 = new StringBuilder();
            for (int i3 = 0; i3 < str.length(); i3++) {
                char charAt3 = str.charAt(i3);
                if (!StringsKt.contains((CharSequence) this.formattingChars, charAt3, false)) {
                    sb5.append(charAt3);
                }
            }
            num = Integer.valueOf(sb5.toString().length());
        }
        this.templateInputLength = num;
    }

    public final String filterFormattingChars(String str) {
        str.getClass();
        String obj = StringsKt.trimStart(str).toString();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < obj.length(); i++) {
            char charAt = obj.charAt(i);
            if (!StringsKt.contains((CharSequence) this.formattingChars, charAt, false)) {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }
}
