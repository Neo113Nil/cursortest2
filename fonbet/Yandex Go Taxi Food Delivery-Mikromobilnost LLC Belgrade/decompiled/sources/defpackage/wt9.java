package defpackage;

/* loaded from: classes12.dex */
public final class wt9 implements zls {
    public static final wt9 a = new wt9();

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        fid fidVar = (fid) obj2;
        int intValue = ((Number) obj3).intValue();
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
            sya1.a(vza1.c(), null, ohb1.e(btsVar, xxh0.common_back), null, btsVar, 0, 10);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }
}
