package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class va {
    public static final ub qoPGr6Ce;

    static {
        String str;
        ub ubVar;
        int i = eb0.qoPGr6Ce;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null ? Boolean.parseBoolean(str) : false) {
            hb hbVar = ed.qoPGr6Ce;
            em emVar = qq.qoPGr6Ce;
            em emVar2 = emVar.P7K7Inc8;
            ubVar = emVar;
            if (emVar == null) {
                ubVar = ua.ow5vqvCr;
            }
        } else {
            ubVar = ua.ow5vqvCr;
        }
        qoPGr6Ce = ubVar;
    }
}
