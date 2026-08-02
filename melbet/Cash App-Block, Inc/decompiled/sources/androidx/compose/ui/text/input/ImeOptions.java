package androidx.compose.ui.text.input;

import androidx.compose.ui.text.intl.LocaleList;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ImeOptions {
    public static final ImeOptions Default = new ImeOptions(false, 0, true, 1, 1, LocaleList.Empty);
    public final boolean autoCorrect;
    public final int capitalization;
    public final LocaleList hintLocales;
    public final int imeAction;
    public final int keyboardType;
    public final boolean singleLine;

    public ImeOptions(boolean z, int i, boolean z2, int i2, int i3, LocaleList localeList) {
        this.singleLine = z;
        this.capitalization = i;
        this.autoCorrect = z2;
        this.keyboardType = i2;
        this.imeAction = i3;
        this.hintLocales = localeList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImeOptions)) {
            return false;
        }
        ImeOptions imeOptions = (ImeOptions) obj;
        return this.singleLine == imeOptions.singleLine && this.capitalization == imeOptions.capitalization && this.autoCorrect == imeOptions.autoCorrect && this.keyboardType == imeOptions.keyboardType && this.imeAction == imeOptions.imeAction && Intrinsics.areEqual(this.hintLocales, imeOptions.hintLocales);
    }

    public final int hashCode() {
        return this.hintLocales.localeList.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.imeAction, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.keyboardType, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.capitalization, Boolean.hashCode(this.singleLine) * 31, 31), 31, this.autoCorrect), 31), 961);
    }

    public final String toString() {
        return "ImeOptions(singleLine=" + this.singleLine + ", capitalization=" + ((Object) KeyboardCapitalization.m999toStringimpl(this.capitalization)) + ", autoCorrect=" + this.autoCorrect + ", keyboardType=" + ((Object) KeyboardType.m1000toStringimpl(this.keyboardType)) + ", imeAction=" + ((Object) ImeAction.m998toStringimpl(this.imeAction)) + ", platformImeOptions=null, hintLocales=" + this.hintLocales + ')';
    }
}
