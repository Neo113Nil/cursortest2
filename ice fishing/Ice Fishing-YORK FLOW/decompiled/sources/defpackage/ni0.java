package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ni0 {
    public final java.util.Locale ZpBGe2uQfcn8;

    public ni0(java.util.Locale locale) {
        this.ZpBGe2uQfcn8 = locale;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null || !(obj instanceof defpackage.ni0)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return defpackage.ma0.QiMR8OkAhezm(this.ZpBGe2uQfcn8.toLanguageTag(), ((defpackage.ni0) obj).ZpBGe2uQfcn8.toLanguageTag());
    }

    public final int hashCode() {
        return this.ZpBGe2uQfcn8.toLanguageTag().hashCode();
    }

    public final java.lang.String toString() {
        return this.ZpBGe2uQfcn8.toLanguageTag();
    }
}
