package com.squareup.cash.biometrics;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Biometrics$Info {
    public final CharSequence description;
    public final CharSequence negativeButton;
    public final CharSequence subtitle;
    public final CharSequence title;

    public Biometrics$Info(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4) {
        charSequence.getClass();
        charSequence4.getClass();
        this.title = charSequence;
        this.subtitle = charSequence2;
        this.description = charSequence3;
        this.negativeButton = charSequence4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Biometrics$Info)) {
            return false;
        }
        Biometrics$Info biometrics$Info = (Biometrics$Info) obj;
        return Intrinsics.areEqual(this.title, biometrics$Info.title) && Intrinsics.areEqual(this.subtitle, biometrics$Info.subtitle) && Intrinsics.areEqual(this.description, biometrics$Info.description) && Intrinsics.areEqual(this.negativeButton, biometrics$Info.negativeButton);
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        CharSequence charSequence = this.subtitle;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.description;
        return this.negativeButton.hashCode() + ((hashCode2 + (charSequence2 != null ? charSequence2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Info(title=" + ((Object) this.title) + ", subtitle=" + ((Object) this.subtitle) + ", description=" + ((Object) this.description) + ", negativeButton=" + ((Object) this.negativeButton) + ")";
    }

    public /* synthetic */ Biometrics$Info(String str, int i, String str2, String str3, String str4) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, str4);
    }
}
