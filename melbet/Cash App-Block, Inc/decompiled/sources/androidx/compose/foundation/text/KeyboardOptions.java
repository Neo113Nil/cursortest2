package androidx.compose.foundation.text;

import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.intl.LocaleList;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class KeyboardOptions {
    public static final KeyboardOptions Default = new KeyboardOptions(0, (Boolean) null, 0, 0, (Boolean) null, 127);
    public final Boolean autoCorrectEnabled;
    public final int capitalization;
    public final LocaleList hintLocales;
    public final int imeAction;
    public final int keyboardType;
    public final Boolean showKeyboardOnFocus;

    public KeyboardOptions(int i, int i2, boolean z, int i3) {
        this((i3 & 1) != 0 ? -1 : 2, Boolean.valueOf(z), (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? -1 : i2, (Boolean) null, (LocaleList) null);
    }

    /* renamed from: copy-INvB4aQ$default, reason: not valid java name */
    public static KeyboardOptions m359copyINvB4aQ$default(int i, int i2) {
        int i3 = i2 & 1;
        KeyboardOptions keyboardOptions = Default;
        int i4 = i3 != 0 ? keyboardOptions.capitalization : 3;
        Boolean bool = keyboardOptions.autoCorrectEnabled;
        if ((i2 & 4) != 0) {
            i = keyboardOptions.keyboardType;
        }
        return new KeyboardOptions(i4, bool, i, (i2 & 8) != 0 ? keyboardOptions.imeAction : 7, (Boolean) null, (LocaleList) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyboardOptions)) {
            return false;
        }
        KeyboardOptions keyboardOptions = (KeyboardOptions) obj;
        return this.capitalization == keyboardOptions.capitalization && Intrinsics.areEqual(this.autoCorrectEnabled, keyboardOptions.autoCorrectEnabled) && this.keyboardType == keyboardOptions.keyboardType && this.imeAction == keyboardOptions.imeAction && Intrinsics.areEqual(this.showKeyboardOnFocus, keyboardOptions.showKeyboardOnFocus) && Intrinsics.areEqual(this.hintLocales, keyboardOptions.hintLocales);
    }

    public final KeyboardOptions fillUnspecifiedValuesWith$foundation(KeyboardOptions keyboardOptions) {
        if (keyboardOptions == null || keyboardOptions.isCompletelyUnspecified() || keyboardOptions.equals(this)) {
            return this;
        }
        if (isCompletelyUnspecified()) {
            return keyboardOptions;
        }
        int i = this.capitalization;
        KeyboardCapitalization keyboardCapitalization = new KeyboardCapitalization(i);
        if (i == -1) {
            keyboardCapitalization = null;
        }
        int i2 = keyboardCapitalization != null ? keyboardCapitalization.value : keyboardOptions.capitalization;
        Boolean bool = this.autoCorrectEnabled;
        if (bool == null) {
            bool = keyboardOptions.autoCorrectEnabled;
        }
        Boolean bool2 = bool;
        int i3 = this.keyboardType;
        KeyboardType keyboardType = new KeyboardType(i3);
        if (i3 == 0) {
            keyboardType = null;
        }
        int i4 = keyboardType != null ? keyboardType.value : keyboardOptions.keyboardType;
        int i5 = this.imeAction;
        ImeAction imeAction = i5 != -1 ? new ImeAction(i5) : null;
        int i6 = imeAction != null ? imeAction.value : keyboardOptions.imeAction;
        Boolean bool3 = this.showKeyboardOnFocus;
        if (bool3 == null) {
            bool3 = keyboardOptions.showKeyboardOnFocus;
        }
        Boolean bool4 = bool3;
        LocaleList localeList = this.hintLocales;
        if (localeList == null) {
            localeList = keyboardOptions.hintLocales;
        }
        return new KeyboardOptions(i2, bool2, i4, i6, bool4, localeList);
    }

    /* renamed from: getImeActionOrDefault-eUduSuo$foundation, reason: not valid java name */
    public final int m360getImeActionOrDefaulteUduSuo$foundation() {
        int i = this.imeAction;
        ImeAction imeAction = new ImeAction(i);
        if (i == -1) {
            imeAction = null;
        }
        if (imeAction != null) {
            return imeAction.value;
        }
        return 1;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.capitalization) * 31;
        Boolean bool = this.autoCorrectEnabled;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.imeAction, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.keyboardType, (hashCode + (bool != null ? bool.hashCode() : 0)) * 31, 31), 961);
        Boolean bool2 = this.showKeyboardOnFocus;
        int hashCode2 = (m + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        LocaleList localeList = this.hintLocales;
        return hashCode2 + (localeList != null ? localeList.localeList.hashCode() : 0);
    }

    public final boolean isCompletelyUnspecified() {
        return this.capitalization == -1 && this.autoCorrectEnabled == null && this.keyboardType == 0 && this.imeAction == -1 && this.showKeyboardOnFocus == null && this.hintLocales == null;
    }

    public final ImeOptions toImeOptions$foundation(boolean z) {
        int i = this.capitalization;
        KeyboardCapitalization keyboardCapitalization = new KeyboardCapitalization(i);
        if (i == -1) {
            keyboardCapitalization = null;
        }
        int i2 = keyboardCapitalization != null ? keyboardCapitalization.value : 0;
        Boolean bool = this.autoCorrectEnabled;
        boolean booleanValue = bool != null ? bool.booleanValue() : true;
        int i3 = this.keyboardType;
        KeyboardType keyboardType = i3 != 0 ? new KeyboardType(i3) : null;
        int i4 = keyboardType != null ? keyboardType.value : 1;
        int m360getImeActionOrDefaulteUduSuo$foundation = m360getImeActionOrDefaulteUduSuo$foundation();
        LocaleList localeList = this.hintLocales;
        if (localeList == null) {
            localeList = LocaleList.Empty;
        }
        return new ImeOptions(z, i2, booleanValue, i4, m360getImeActionOrDefaulteUduSuo$foundation, localeList);
    }

    public final String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) KeyboardCapitalization.m999toStringimpl(this.capitalization)) + ", autoCorrectEnabled=" + this.autoCorrectEnabled + ", keyboardType=" + ((Object) KeyboardType.m1000toStringimpl(this.keyboardType)) + ", imeAction=" + ((Object) ImeAction.m998toStringimpl(this.imeAction)) + ", platformImeOptions=nullshowKeyboardOnFocus=" + this.showKeyboardOnFocus + ", hintLocales=" + this.hintLocales + ')';
    }

    public /* synthetic */ KeyboardOptions(int i, Boolean bool, int i2, int i3, Boolean bool2, int i4) {
        this((i4 & 1) != 0 ? -1 : i, (i4 & 2) != 0 ? null : bool, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) != 0 ? -1 : i3, (i4 & 32) != 0 ? null : bool2, (LocaleList) null);
    }

    public KeyboardOptions(int i, Boolean bool, int i2, int i3, Boolean bool2, LocaleList localeList) {
        this.capitalization = i;
        this.autoCorrectEnabled = bool;
        this.keyboardType = i2;
        this.imeAction = i3;
        this.showKeyboardOnFocus = bool2;
        this.hintLocales = localeList;
    }
}
