package defpackage;

import android.os.Handler;

/* loaded from: classes3.dex */
public final class zpb implements f8l {
    public final /* synthetic */ aqb a;

    public zpb(aqb aqbVar) {
        this.a = aqbVar;
    }

    @Override // defpackage.f8l
    public final void L(hzk hzkVar) {
        ckj ckjVar = this.a.e;
        ckjVar.getClass();
        akj akjVar = new akj(ckjVar);
        while (akjVar.hasNext()) {
            ((re9) akjVar.next()).c(hzkVar);
        }
    }

    @Override // defpackage.f8l
    public final void X(boolean z) {
        aqb aqbVar = this.a;
        Handler handler = aqbVar.f;
        ckj ckjVar = aqbVar.e;
        if (!z) {
            ckjVar.getClass();
            akj akjVar = new akj(ckjVar);
            while (akjVar.hasNext()) {
                ((re9) akjVar.next()).a();
            }
            return;
        }
        ckjVar.getClass();
        akj akjVar2 = new akj(ckjVar);
        while (akjVar2.hasNext()) {
            ((re9) akjVar2.next()).f();
        }
        handler.removeCallbacksAndMessages(null);
        ckjVar.getClass();
        akj akjVar3 = new akj(ckjVar);
        while (akjVar3.hasNext()) {
            ((re9) akjVar3.next()).b(aqbVar.i().J0());
        }
        handler.postDelayed(new sr7(11, aqbVar), 1000L);
    }

    @Override // defpackage.f8l
    public final void p(int i) {
        aqb aqbVar = this.a;
        if (i == 4) {
            aqbVar.g = true;
        }
        ckj ckjVar = aqbVar.e;
        ckjVar.getClass();
        akj akjVar = new akj(ckjVar);
        while (akjVar.hasNext()) {
            re9 re9Var = (re9) akjVar.next();
            if (i == 2) {
                re9Var.e();
            } else if (i == 3) {
                re9Var.onReady();
            } else if (i == 4) {
                re9Var.d();
            }
        }
    }
}
