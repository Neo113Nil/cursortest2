package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.input.TextFieldCharSequence;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes.dex */
public final /* synthetic */ class TextFieldSelectionState$observeTextChanges$3 extends FunctionReferenceImpl implements Function2 {
    public static final TextFieldSelectionState$observeTextChanges$3 INSTANCE = new TextFieldSelectionState$observeTextChanges$3(2, TextFieldCharSequence.class, "contentEquals", "contentEquals(Ljava/lang/CharSequence;)Z", 0);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(StringsKt__StringsJVMKt.contentEquals(((TextFieldCharSequence) obj).text, (CharSequence) obj2));
    }
}
