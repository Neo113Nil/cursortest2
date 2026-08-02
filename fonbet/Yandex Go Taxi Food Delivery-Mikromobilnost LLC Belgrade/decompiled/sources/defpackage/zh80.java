package defpackage;

import com.yandex.messaging.analytics.OrganizationChangeReporter$ChangeType;
import com.yandex.messaging.analytics.OrganizationChangeSource;
import com.yandex.messaging.core.net.entities.proto.message.UserReaction;
import com.yandex.messaging.internal.ServerMessageRef;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.idsync.impl.r;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes15.dex */
public final /* synthetic */ class zh80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Serializable x;
    public final /* synthetic */ Object y;

    public /* synthetic */ zh80(r rVar, String str, String str2, IHandlerExecutor iHandlerExecutor, long j) {
        this.a = 2;
        this.c = rVar;
        this.w = str;
        this.x = str2;
        this.y = iHandlerExecutor;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.y;
        Serializable serializable = this.x;
        Object obj2 = this.w;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((ai80) obj3).a.reportEvent("workplace changed", b.i(new Pair("from", (Long) obj2), new Pair("to", Long.valueOf(this.b)), new Pair("change_type", ((OrganizationChangeReporter$ChangeType) serializable).getTag()), new Pair("source", ((OrganizationChangeSource) obj).getTag())));
                break;
            case 1:
                ServerMessageRef serverMessageRef = (ServerMessageRef) obj2;
                ArrayList arrayList = (ArrayList) serializable;
                UserReaction[] userReactionArr = (UserReaction[]) obj;
                rai0 rai0Var = ((sai0) obj3).b;
                if (rai0Var != null) {
                    rai0Var.l(serverMessageRef, this.b, arrayList, userReactionArr);
                    break;
                }
                break;
            default:
                r.a((r) obj3, (String) obj2, (String) serializable, (IHandlerExecutor) obj, this.b);
                break;
        }
    }

    public /* synthetic */ zh80(Object obj, Object obj2, long j, Serializable serializable, Serializable serializable2, int i) {
        this.a = i;
        this.c = obj;
        this.w = obj2;
        this.b = j;
        this.x = serializable;
        this.y = serializable2;
    }
}
