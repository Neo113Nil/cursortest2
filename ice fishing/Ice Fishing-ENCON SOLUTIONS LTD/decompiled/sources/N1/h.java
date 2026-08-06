package N1;

import java.net.Socket;

/* loaded from: classes.dex */
public final class h extends W1.e {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i f1182m;

    public h(i iVar) {
        this.f1182m = iVar;
    }

    @Override // W1.e
    public final void j() {
        Socket socket;
        i iVar = this.f1182m;
        if (iVar.f1195m) {
            return;
        }
        iVar.f1195m = true;
        e eVar = iVar.f1196n;
        if (eVar != null) {
            ((O1.e) eVar.f1170d).cancel();
        }
        k kVar = iVar.f1197o;
        if (kVar == null || (socket = kVar.f1200c) == null) {
            return;
        }
        K1.b.e(socket);
    }
}
