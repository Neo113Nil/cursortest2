package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class cn0 {
    public final defpackage.yn0 ZpBGe2uQfcn8;

    public static final java.lang.Object ZpBGe2uQfcn8(defpackage.yn0 yn0Var) {
        java.lang.Object QiMR8OkAhezm = yn0Var.QiMR8OkAhezm(null);
        if (QiMR8OkAhezm == null) {
            return null;
        }
        if (!(QiMR8OkAhezm instanceof defpackage.sn0)) {
            yn0Var.Ns0WNyEWdPsk(null);
            return QiMR8OkAhezm;
        }
        defpackage.sn0 sn0Var = (defpackage.sn0) QiMR8OkAhezm;
        if (sn0Var.P05cfTpS5W5L()) {
            throw new java.util.NoSuchElementException("List is empty.");
        }
        int i = sn0Var.giKS3J6vZuNy - 1;
        java.lang.Object oh71FJcDz6S2 = sn0Var.oh71FJcDz6S2(i);
        sn0Var.Ns0WNyEWdPsk(i);
        oh71FJcDz6S2.getClass();
        if (sn0Var.P05cfTpS5W5L()) {
            yn0Var.Ns0WNyEWdPsk(null);
        }
        if (sn0Var.giKS3J6vZuNy == 1) {
            yn0Var.h3m55N1URyyK(null, sn0Var.WDYagTQQm9ns());
        }
        return oh71FJcDz6S2;
    }

    public static final defpackage.sn0 giKS3J6vZuNy(defpackage.yn0 yn0Var) {
        if (yn0Var.e6mdH7fiFuta()) {
            defpackage.sn0 sn0Var = defpackage.ns0.giKS3J6vZuNy;
            sn0Var.getClass();
            return sn0Var;
        }
        defpackage.sn0 sn0Var2 = new defpackage.sn0();
        java.lang.Object[] objArr = yn0Var.fWTAfUmVKrZq;
        long[] jArr = yn0Var.ZpBGe2uQfcn8;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            java.lang.Object obj = objArr[(i << 3) + i3];
                            if (obj instanceof defpackage.sn0) {
                                sn0Var2.giKS3J6vZuNy((defpackage.sn0) obj);
                            } else {
                                obj.getClass();
                                sn0Var2.ZpBGe2uQfcn8(obj);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return sn0Var2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.cn0) {
            return this.ZpBGe2uQfcn8.equals(((defpackage.cn0) obj).ZpBGe2uQfcn8);
        }
        return false;
    }

    public final int hashCode() {
        return this.ZpBGe2uQfcn8.hashCode();
    }

    public final java.lang.String toString() {
        return "MultiValueMap(map=" + this.ZpBGe2uQfcn8 + ')';
    }
}
