package a4;

import C2.N;
import R3.r;
import android.content.Context;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import java.util.concurrent.Executor;

/* renamed from: a4.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0434b implements R3.e {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f4338n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r f4339u;

    public /* synthetic */ C0434b(r rVar, int i) {
        this.f4338n = i;
        this.f4339u = rVar;
    }

    @Override // R3.e
    public final Object b(N n9) {
        FirebaseMessaging lambda$getComponents$0;
        switch (this.f4338n) {
            case 0:
                return new C0436d((Context) n9.a(Context.class), ((O3.g) n9.a(O3.g.class)).d(), n9.c(r.a(e.class)), n9.b(l4.b.class), (Executor) n9.d(this.f4339u));
            default:
                lambda$getComponents$0 = FirebaseMessagingRegistrar.lambda$getComponents$0(this.f4339u, n9);
                return lambda$getComponents$0;
        }
    }
}
