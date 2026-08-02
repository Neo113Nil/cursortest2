package defpackage;

/* loaded from: classes12.dex */
public final class rd9 implements zls {
    public static final rd9 a = new rd9();

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        fid fidVar = (fid) obj2;
        int intValue = ((Number) obj3).intValue();
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
            sya1.a(xtb1.c(), null, ohb1.e(btsVar, xxh0.common_close), null, btsVar, 0, 10);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }
}
