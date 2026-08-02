package l4;

import com.google.firebase.messaging.FirebaseMessaging;
import i1.C4586c;

/* loaded from: classes2.dex */
public final /* synthetic */ class l implements l3.e {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f38933n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f38934u;

    public /* synthetic */ l(FirebaseMessaging firebaseMessaging, int i) {
        this.f38933n = i;
        this.f38934u = firebaseMessaging;
    }

    @Override // l3.e
    public final void b(Object obj) {
        boolean z6;
        switch (this.f38933n) {
            case 0:
                v vVar = (v) obj;
                if (!this.f38934u.f36964e.e() || vVar.f38973h.a() == null) {
                    return;
                }
                synchronized (vVar) {
                    z6 = vVar.f38972g;
                }
                if (z6) {
                    return;
                }
                vVar.f(0L);
                return;
            default:
                N2.a aVar = (N2.a) obj;
                C4586c c4586c = FirebaseMessaging.f36957k;
                FirebaseMessaging firebaseMessaging = this.f38934u;
                firebaseMessaging.getClass();
                if (aVar != null) {
                    com.bumptech.glide.f.o(aVar.f1909n);
                    firebaseMessaging.e();
                    return;
                }
                return;
        }
    }
}
