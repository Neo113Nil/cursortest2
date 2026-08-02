package defpackage;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final /* synthetic */ class sm7 implements nn5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m5n b;

    public /* synthetic */ sm7(m5n m5nVar, int i) {
        this.a = i;
        this.b = m5nVar;
    }

    @Override // defpackage.nn5
    public final Object C(rdk rdkVar) {
        FirebaseMessaging lambda$getComponents$0;
        switch (this.a) {
            case 0:
                return new um7((Context) rdkVar.b(Context.class), ((aec) rdkVar.b(aec.class)).f(), rdkVar.l(m5n.a(rwd.class)), rdkVar.n(ht7.class), (Executor) rdkVar.k(this.b));
            default:
                lambda$getComponents$0 = FirebaseMessagingRegistrar.lambda$getComponents$0(this.b, rdkVar);
                return lambda$getComponents$0;
        }
    }
}
