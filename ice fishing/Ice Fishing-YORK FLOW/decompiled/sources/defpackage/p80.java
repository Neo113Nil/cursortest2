package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class p80 {
    public final int ZpBGe2uQfcn8;

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.p80) {
            return this.ZpBGe2uQfcn8 == ((defpackage.p80) obj).ZpBGe2uQfcn8;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.ZpBGe2uQfcn8);
    }

    public final java.lang.String toString() {
        int i = this.ZpBGe2uQfcn8;
        return i == 1 ? "Touch" : i == 2 ? "Keyboard" : "Error";
    }
}
