package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class wy {
    public final int ZpBGe2uQfcn8;

    public static java.lang.String ZpBGe2uQfcn8(int i) {
        return i == 1 ? "Next" : i == 2 ? "Previous" : i == 3 ? "Left" : i == 4 ? "Right" : i == 5 ? "Up" : i == 6 ? "Down" : i == 7 ? "Enter" : i == 8 ? "Exit" : "Invalid FocusDirection";
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.wy) {
            return this.ZpBGe2uQfcn8 == ((defpackage.wy) obj).ZpBGe2uQfcn8;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.ZpBGe2uQfcn8);
    }

    public final java.lang.String toString() {
        return ZpBGe2uQfcn8(this.ZpBGe2uQfcn8);
    }
}
