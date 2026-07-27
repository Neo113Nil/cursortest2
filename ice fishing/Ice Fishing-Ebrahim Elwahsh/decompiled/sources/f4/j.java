package f4;

import com.google.firebase.messaging.FirebaseMessaging;

/* loaded from: classes2.dex */
public final /* synthetic */ class j implements h3.e {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f37750n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f37751u;

    public /* synthetic */ j(FirebaseMessaging firebaseMessaging, int i) {
        this.f37750n = i;
        this.f37751u = firebaseMessaging;
    }

    @Override // h3.e
    public final void l(Object obj) {
        boolean z8;
        switch (this.f37750n) {
            case 0:
                u uVar = (u) obj;
                if (!this.f37751u.f36359e.e() || uVar.f37791h.a() == null) {
                    return;
                }
                synchronized (uVar) {
                    z8 = uVar.f37790g;
                }
                if (z8) {
                    return;
                }
                uVar.f(0L);
                return;
            default:
                K2.a aVar = (K2.a) obj;
                com.icefishing.icefishingliveapp.A a9 = FirebaseMessaging.f36352k;
                FirebaseMessaging firebaseMessaging = this.f37751u;
                firebaseMessaging.getClass();
                if (aVar != null) {
                    com.bumptech.glide.g.P(aVar.f1565n);
                    firebaseMessaging.e();
                    return;
                }
                return;
        }
    }
}
