package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class tu {
    public final int ZpBGe2uQfcn8;

    public static java.lang.String ZpBGe2uQfcn8(int i) {
        if (i == 0) {
            return "EmojiSupportMatch.Default";
        }
        if (i == 1) {
            return "EmojiSupportMatch.None";
        }
        if (i == 2) {
            return "EmojiSupportMatch.All";
        }
        return "Invalid(value=" + i + ')';
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.tu) {
            return this.ZpBGe2uQfcn8 == ((defpackage.tu) obj).ZpBGe2uQfcn8;
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
