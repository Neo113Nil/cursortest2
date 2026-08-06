package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class jt implements java.lang.Comparable {
    public static final defpackage.pa1 WDYagTQQm9ns = new defpackage.pa1(29);
    public static final long oh71FJcDz6S2 = defpackage.vx1.BHfvd2J71qpO(4611686018427387903L);
    public static final long QiMR8OkAhezm = defpackage.vx1.BHfvd2J71qpO(-4611686018427387903L);

    public static final long JhCgjQRTAOCT(long j) {
        long j2 = ((-(j >> 1)) << 1) + (((int) j) & 1);
        int i = defpackage.kt.ZpBGe2uQfcn8;
        return j2;
    }

    public static final long ZpBGe2uQfcn8(long j, long j2) {
        long j3 = j2 / 1000000;
        long e6mdH7fiFuta = defpackage.vx1.e6mdH7fiFuta(j, j3);
        if (-4611686018426L > e6mdH7fiFuta || e6mdH7fiFuta >= 4611686018427L) {
            return defpackage.vx1.BHfvd2J71qpO(e6mdH7fiFuta);
        }
        long j4 = ((e6mdH7fiFuta * 1000000) + (j2 - (j3 * 1000000))) << 1;
        int i = defpackage.kt.ZpBGe2uQfcn8;
        return j4;
    }

    public static final long fWTAfUmVKrZq(long j, defpackage.mt mtVar) {
        if (j == oh71FJcDz6S2) {
            return Long.MAX_VALUE;
        }
        if (j == QiMR8OkAhezm) {
            return Long.MIN_VALUE;
        }
        return mtVar.WDYagTQQm9ns.convert(j >> 1, ((((int) j) & 1) == 0 ? defpackage.mt.NANOSECONDS : defpackage.mt.MILLISECONDS).WDYagTQQm9ns);
    }

    public static final long giKS3J6vZuNy(long j, long j2) {
        int i = ((int) j) & 1;
        if (i != (((int) j2) & 1)) {
            return i == 1 ? ZpBGe2uQfcn8(j >> 1, j2 >> 1) : ZpBGe2uQfcn8(j2 >> 1, j >> 1);
        }
        if (i == 0) {
            long j3 = (j >> 1) + (j2 >> 1);
            if (-4611686018426999999L > j3 || j3 >= 4611686018427000000L) {
                return defpackage.vx1.BHfvd2J71qpO(j3 / 1000000);
            }
            long j4 = j3 << 1;
            int i2 = defpackage.kt.ZpBGe2uQfcn8;
            return j4;
        }
        long e6mdH7fiFuta = defpackage.vx1.e6mdH7fiFuta(j >> 1, j2 >> 1);
        if (e6mdH7fiFuta == 9223372036854759646L) {
            defpackage.h7.w7APNrr0aGRc("Summing infinite durations of different signs yields an undefined result.");
            return 0L;
        }
        if (e6mdH7fiFuta == 4611686018427387903L || e6mdH7fiFuta == -4611686018427387903L) {
            return defpackage.vx1.BHfvd2J71qpO(e6mdH7fiFuta);
        }
        if (-4611686018426L > e6mdH7fiFuta || e6mdH7fiFuta >= 4611686018427L) {
            return defpackage.vx1.BHfvd2J71qpO(defpackage.j80.XntWc4eZSQ8j(e6mdH7fiFuta));
        }
        long j5 = (e6mdH7fiFuta * 1000000) << 1;
        int i3 = defpackage.kt.ZpBGe2uQfcn8;
        return j5;
    }
}
