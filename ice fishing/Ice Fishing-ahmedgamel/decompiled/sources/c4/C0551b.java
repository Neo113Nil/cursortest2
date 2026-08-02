package c4;

import E2.M;
import T3.r;
import android.content.Context;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import java.util.concurrent.Executor;

/* renamed from: c4.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0551b implements T3.e {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f5731n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r f5732u;

    public /* synthetic */ C0551b(r rVar, int i) {
        this.f5731n = i;
        this.f5732u = rVar;
    }

    @Override // T3.e
    public final Object c(M m9) {
        FirebaseMessaging lambda$getComponents$0;
        switch (this.f5731n) {
            case 0:
                return new C0553d((Context) m9.a(Context.class), ((Q3.g) m9.a(Q3.g.class)).d(), m9.f(r.a(e.class)), m9.e(n4.b.class), (Executor) m9.b(this.f5732u));
            default:
                lambda$getComponents$0 = FirebaseMessagingRegistrar.lambda$getComponents$0(this.f5732u, m9);
                return lambda$getComponents$0;
        }
    }
}
