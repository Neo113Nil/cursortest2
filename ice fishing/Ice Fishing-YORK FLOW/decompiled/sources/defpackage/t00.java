package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class t00 {
    public final int ZpBGe2uQfcn8;

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.t00) {
            return this.ZpBGe2uQfcn8 == ((defpackage.t00) obj).ZpBGe2uQfcn8;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.ZpBGe2uQfcn8);
    }

    public final java.lang.String toString() {
        int i = this.ZpBGe2uQfcn8;
        return i == 0 ? "None" : i == 1 ? "Weight" : i == 2 ? "Style" : i == 65535 ? "All" : "Invalid";
    }
}
