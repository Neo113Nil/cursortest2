package defpackage;

import com.yandex.go.scooters.qr.a;

/* loaded from: classes13.dex */
public final class vpo0 {
    public final /* synthetic */ a a;

    public vpo0(a aVar) {
        this.a = aVar;
    }

    public final void a(n7p0 n7p0Var) {
        a aVar = this.a;
        vdm vdmVar = aVar.N;
        if (vdmVar == null) {
            vdmVar = (vdm) aVar.M.get();
            aVar.N = vdmVar;
        }
        if (vdmVar.u()) {
            return;
        }
        aVar.A(vdmVar, new yqo0(n7p0Var), new wpo0(aVar));
    }
}
