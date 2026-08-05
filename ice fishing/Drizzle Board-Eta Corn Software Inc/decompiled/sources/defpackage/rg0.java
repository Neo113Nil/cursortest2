package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public interface rg0 {
    default ng0 MdtA4re8(p5 p5Var, mt mtVar) {
        Class cls = p5Var.qoPGr6Ce;
        cls.getClass();
        return NCTxEWno(cls, mtVar);
    }

    default ng0 NCTxEWno(Class cls, mt mtVar) {
        return qoPGr6Ce(cls);
    }

    default ng0 qoPGr6Ce(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }
}
