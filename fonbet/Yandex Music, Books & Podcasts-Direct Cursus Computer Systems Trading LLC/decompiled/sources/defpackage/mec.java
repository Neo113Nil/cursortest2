package defpackage;

import com.google.firebase.messaging.FirebaseMessaging;

/* loaded from: classes3.dex */
public final /* synthetic */ class mec implements tqj {
    public final /* synthetic */ int a;
    public final /* synthetic */ FirebaseMessaging b;

    public /* synthetic */ mec(FirebaseMessaging firebaseMessaging, int i) {
        this.a = i;
        this.b = firebaseMessaging;
    }

    @Override // defpackage.tqj
    public final void onSuccess(Object obj) {
        boolean z;
        switch (this.a) {
            case 0:
                rps rpsVar = (rps) obj;
                if (!this.b.e.U() || rpsVar.h.a() == null) {
                    return;
                }
                synchronized (rpsVar) {
                    z = rpsVar.g;
                }
                if (z) {
                    return;
                }
                rpsVar.f(0L);
                return;
            default:
                FirebaseMessaging firebaseMessaging = this.b;
                kq4 kq4Var = (kq4) obj;
                if (kq4Var != null) {
                    v5g.I(kq4Var.a);
                    firebaseMessaging.f();
                    return;
                }
                return;
        }
    }
}
