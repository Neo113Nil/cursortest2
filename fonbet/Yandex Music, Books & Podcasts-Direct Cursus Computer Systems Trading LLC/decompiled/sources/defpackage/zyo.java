package defpackage;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class zyo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e5p b;
    public final /* synthetic */ dzo c;

    public /* synthetic */ zyo(dzo dzoVar, e5p e5pVar, int i) {
        this.a = i;
        this.c = dzoVar;
        this.b = e5pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                e5p e5pVar = this.b;
                e5pVar.c();
                pwe pweVar = this.c.g;
                dzo dzoVar = (dzo) pweVar.a;
                dzoVar.d--;
                if (!e5pVar.a) {
                    pweVar.onStop();
                    break;
                }
                break;
            default:
                if (this.b.d()) {
                    dzo dzoVar2 = this.c;
                    dzoVar2.g.onStop();
                    tao taoVar = dzoVar2.f;
                    if (taoVar != null) {
                        ArrayList arrayList = (ArrayList) taoVar.e;
                        taoVar.d = Boolean.FALSE;
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((hbr) arrayList.get(i)).f = Boolean.FALSE;
                        }
                        break;
                    }
                }
                break;
        }
    }
}
