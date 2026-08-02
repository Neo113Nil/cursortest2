package defpackage;

/* loaded from: classes3.dex */
public final class chx extends lex {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ chx(int i, Object obj) {
        this.b = i;
        this.c = obj;
    }

    @Override // defpackage.lex
    public final void a() {
        switch (this.b) {
            case 0:
                zlx zlxVar = (zlx) this.c;
                if (zlxVar.m != null) {
                    zlxVar.b.f("Unbind from service.", new Object[0]);
                    zlxVar.a.unbindService(zlxVar.l);
                    zlxVar.g = false;
                    zlxVar.m = null;
                    zlxVar.l = null;
                }
                zlxVar.b();
                break;
            default:
                zlx zlxVar2 = (zlx) ((fmp) this.c).b;
                zlxVar2.b.f("unlinkToDeath", new Object[0]);
                zlxVar2.m.asBinder().unlinkToDeath(zlxVar2.j, 0);
                zlxVar2.m = null;
                zlxVar2.g = false;
                break;
        }
    }
}
