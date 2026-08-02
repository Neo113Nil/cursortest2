package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.yandex.messaging.MessengerEnvironment;
import com.yandex.messaging.core.net.entities.proto.message.UserReaction;
import com.yandex.messaging.internal.LocalMessageRef;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.entities.ChatId;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes15.dex */
public final class sai0 implements a9b, g070 {
    public rai0 b;
    public final Object w;
    public final /* synthetic */ int a = 0;
    public final Handler c = new Handler();

    public sai0(LocalMessageRef localMessageRef, rai0 rai0Var) {
        this.w = localMessageRef;
        this.b = rai0Var;
    }

    @Override // defpackage.a9b
    public final void close() {
        switch (this.a) {
            case 0:
                z83.g(null, this.c.getLooper(), Looper.myLooper());
                this.b = null;
                break;
            default:
                this.b = null;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.g070
    public void l(ServerMessageRef serverMessageRef, long j, ArrayList arrayList, UserReaction[] userReactionArr) {
        this.c.post(new zh80(this, serverMessageRef, j, arrayList, userReactionArr, 1));
    }

    @Override // defpackage.a9b
    public final e1k w(s020 s020Var) {
        int i = this.a;
        List list = null;
        Object obj = this.w;
        switch (i) {
            case 0:
                m8g m8gVar = (m8g) s020Var;
                n5t0 e = m8gVar.d.e();
                naz0 f = m8gVar.f();
                vcz0 h = m8gVar.h();
                kdd0 kdd0Var = new kdd0(e, f, h, (fw10) m8gVar.v0.get());
                z83.g(null, (Looper) kdd0Var.d, Looper.myLooper());
                ServerMessageRef g = h.g((LocalMessageRef) obj);
                if (g != null) {
                    return new hai0(kdd0Var, g, this);
                }
                this.c.post(new oxe0(19, this));
                return null;
            default:
                m8g m8gVar2 = (m8g) s020Var;
                o1b0 o1b0Var = m8gVar2.a;
                MessengerEnvironment messengerEnvironment = (MessengerEnvironment) m8gVar2.c.i.get();
                new zai0();
                Map map = (Map) obj;
                List list2 = yai0.e;
                vpp0 vpp0Var = new vpp0();
                vpp0Var.b = this;
                boolean z = messengerEnvironment == MessengerEnvironment.ALPHA_TEAM || messengerEnvironment == MessengerEnvironment.PRODUCTION_TEAM || messengerEnvironment == MessengerEnvironment.TESTING_TEAM;
                String valueOf = String.valueOf(ChatId.Companion.b(o1b0Var.b));
                if (z) {
                    valueOf = valueOf.concat("_team");
                }
                if (map.containsKey(valueOf)) {
                    list = (List) map.get(valueOf);
                } else {
                    String str = z ? "default_team" : "default";
                    if (map.containsKey(str)) {
                        list = (List) map.get(str);
                    }
                }
                sai0 sai0Var = (sai0) vpp0Var.b;
                if (sai0Var != null) {
                    if (list != null) {
                        list2 = list;
                    }
                    sai0Var.c.post(new xmf0(10, sai0Var, list2));
                }
                return vpp0Var;
        }
    }

    public sai0(Map map, rai0 rai0Var) {
        this.w = map;
        this.b = rai0Var;
    }
}
