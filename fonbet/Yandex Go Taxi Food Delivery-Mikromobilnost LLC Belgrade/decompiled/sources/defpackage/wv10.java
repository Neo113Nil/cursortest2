package defpackage;

import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.entities.MessageReactions;
import com.yandex.passport.internal.warm.WarmUpWebViewActivity;
import com.yandex.passport.internal.warm.a;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes15.dex */
public final /* synthetic */ class wv10 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ wv10(xv10 xv10Var, ServerMessageRef serverMessageRef, long j, MessageReactions messageReactions) {
        this.c = xv10Var;
        this.w = serverMessageRef;
        this.b = j;
        this.x = messageReactions;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        long j = this.b;
        Object obj = this.x;
        Object obj2 = this.w;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ServerMessageRef serverMessageRef = (ServerMessageRef) obj2;
                MessageReactions messageReactions = (MessageReactions) obj;
                cbi0 cbi0Var = (cbi0) ((xv10) obj3).b;
                if (cbi0Var != null) {
                    cbi0Var.c(serverMessageRef, j, messageReactions);
                    break;
                }
                break;
            default:
                WarmUpWebViewActivity.onCreate$lambda$1((WarmUpWebViewActivity) obj3, (a) obj2, (Ref$ObjectRef) obj, j);
                break;
        }
    }

    public /* synthetic */ wv10(WarmUpWebViewActivity warmUpWebViewActivity, a aVar, Ref$ObjectRef ref$ObjectRef, long j) {
        this.c = warmUpWebViewActivity;
        this.w = aVar;
        this.x = ref$ObjectRef;
        this.b = j;
    }
}
