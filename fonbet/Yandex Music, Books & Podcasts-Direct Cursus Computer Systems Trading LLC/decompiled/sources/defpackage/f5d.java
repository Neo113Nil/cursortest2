package defpackage;

import kotlin.coroutines.Continuation;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes6.dex */
public final class f5d implements eiw {
    public final u4d a;
    public final boolean b;

    public f5d(u4d u4dVar, boolean z) {
        this.a = u4dVar;
        this.b = z;
    }

    @Override // defpackage.eiw
    public final Object a(rcr rcrVar) {
        l18 l18Var = l18.b;
        bdt I = hag.I(zzp.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        zzp zzpVar = (zzp) qdcVar.C(I);
        u4d u4dVar = this.a;
        StationId stationId = u4dVar.d.a;
        stationId.getClass();
        gxc gxcVar = u4dVar.e;
        Continuation continuation = null;
        return x97.V(dm6.b, new ak1(new yk3(zzpVar, new hv0(this, continuation, 11), stationId, this.b, gxcVar), continuation, 14), rcrVar);
    }
}
