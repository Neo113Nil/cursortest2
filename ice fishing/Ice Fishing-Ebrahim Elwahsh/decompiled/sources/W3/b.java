package W3;

import B2.N;
import N3.r;
import android.content.Context;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements N3.e {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f3450n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r f3451u;

    public /* synthetic */ b(r rVar, int i) {
        this.f3450n = i;
        this.f3451u = rVar;
    }

    @Override // N3.e
    public final Object b(N n9) {
        FirebaseMessaging lambda$getComponents$0;
        switch (this.f3450n) {
            case 0:
                return new d((Context) n9.a(Context.class), ((K3.g) n9.a(K3.g.class)).d(), n9.b(r.a(e.class)), n9.c(h4.b.class), (Executor) n9.e(this.f3451u));
            default:
                lambda$getComponents$0 = FirebaseMessagingRegistrar.lambda$getComponents$0(this.f3451u, n9);
                return lambda$getComponents$0;
        }
    }
}
