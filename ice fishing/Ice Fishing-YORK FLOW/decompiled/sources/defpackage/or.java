package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class or implements java.lang.Comparable {
    public final float WDYagTQQm9ns;

    public static int ZpBGe2uQfcn8(float f, float f2) {
        if (java.lang.Float.isNaN(f) || java.lang.Float.isNaN(f2)) {
            return 0;
        }
        return java.lang.Float.compare(f, f2);
    }

    public static java.lang.String fWTAfUmVKrZq(float f) {
        if (java.lang.Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    public static final boolean giKS3J6vZuNy(float f, float f2) {
        return java.lang.Float.compare(f, f2) == 0;
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object obj) {
        return ZpBGe2uQfcn8(this.WDYagTQQm9ns, ((defpackage.or) obj).WDYagTQQm9ns);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.or) {
            return java.lang.Float.compare(this.WDYagTQQm9ns, ((defpackage.or) obj).WDYagTQQm9ns) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.WDYagTQQm9ns);
    }

    public final java.lang.String toString() {
        return fWTAfUmVKrZq(this.WDYagTQQm9ns);
    }
}
