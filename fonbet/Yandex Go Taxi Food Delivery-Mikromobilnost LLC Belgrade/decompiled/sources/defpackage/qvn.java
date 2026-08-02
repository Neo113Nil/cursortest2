package defpackage;

import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes4.dex */
public final class qvn implements wls {
    public final /* synthetic */ int a;

    public qvn(int i) {
        this.a = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        fid fidVar = (fid) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            bts btsVar = (bts) fidVar;
            if (btsVar.E()) {
                btsVar.Y();
                return zy11.a;
            }
        }
        o4b1.b(mt71.m(this.a, 0, fidVar), null, null, null, null, 0.0f, null, fidVar, 48, HProv.PP_SAME_MEDIA);
        return zy11.a;
    }
}
