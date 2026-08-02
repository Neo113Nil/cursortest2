package defpackage;

/* loaded from: classes3.dex */
public final class jkx extends bhx {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jkx(int i, Object obj) {
        this.b = i;
        this.c = obj;
    }

    @Override // defpackage.bhx
    public final void a() {
        switch (this.b) {
            case 0:
                synchronized (((hox) this.c).f) {
                    try {
                        if (((hox) this.c).k.get() > 0 && ((hox) this.c).k.decrementAndGet() > 0) {
                            ((hox) this.c).b.e("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        hox hoxVar = (hox) this.c;
                        if (hoxVar.m != null) {
                            hoxVar.b.e("Unbind from service.", new Object[0]);
                            hox hoxVar2 = (hox) this.c;
                            hoxVar2.a.unbindService(hoxVar2.l);
                            hox hoxVar3 = (hox) this.c;
                            hoxVar3.g = false;
                            hoxVar3.m = null;
                            hoxVar3.l = null;
                        }
                        ((hox) this.c).d();
                        return;
                    } finally {
                    }
                }
            default:
                hox hoxVar4 = (hox) ((fmp) this.c).b;
                hoxVar4.b.e("unlinkToDeath", new Object[0]);
                hoxVar4.m.asBinder().unlinkToDeath(hoxVar4.j, 0);
                hoxVar4.m = null;
                hoxVar4.g = false;
                return;
        }
    }
}
