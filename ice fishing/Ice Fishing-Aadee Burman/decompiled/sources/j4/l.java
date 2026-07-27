package j4;

import com.google.firebase.messaging.FirebaseMessaging;
import g1.C4523c;

/* loaded from: classes2.dex */
public final /* synthetic */ class l implements j3.e {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f38421n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f38422u;

    public /* synthetic */ l(FirebaseMessaging firebaseMessaging, int i) {
        this.f38421n = i;
        this.f38422u = firebaseMessaging;
    }

    @Override // j3.e
    public final void h(Object obj) {
        boolean z3;
        switch (this.f38421n) {
            case 0:
                v vVar = (v) obj;
                if (!this.f38422u.f36197e.e() || vVar.f38461h.a() == null) {
                    return;
                }
                synchronized (vVar) {
                    z3 = vVar.f38460g;
                }
                if (z3) {
                    return;
                }
                vVar.f(0L);
                return;
            default:
                L2.a aVar = (L2.a) obj;
                C4523c c4523c = FirebaseMessaging.f36190k;
                FirebaseMessaging firebaseMessaging = this.f38422u;
                firebaseMessaging.getClass();
                if (aVar != null) {
                    X2.e.K(aVar.f1620n);
                    firebaseMessaging.e();
                    return;
                }
                return;
        }
    }
}
