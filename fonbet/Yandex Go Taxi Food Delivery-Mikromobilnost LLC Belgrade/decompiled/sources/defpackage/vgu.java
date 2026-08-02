package defpackage;

import android.os.Looper;
import com.yandex.messaging.core.net.entities.HiddenPrivateChatsBucket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes15.dex */
public final class vgu {
    public final Looper a;
    public final to3 b;
    public final k020 c;
    public final p370 d;
    public xo3 e;
    public xo3 f;
    public boolean g;

    public vgu(Looper looper, to3 to3Var, k020 k020Var, at2 at2Var, ouf0 ouf0Var, wff0 wff0Var) {
        this.a = looper;
        this.b = to3Var;
        this.c = k020Var;
        this.d = new p370(at2Var, "hidden_chat_local_changes", new sue0(6, ouf0Var));
        wff0Var.a(new fn3(5, this));
    }

    public static final void a(vgu vguVar, HiddenPrivateChatsBucket hiddenPrivateChatsBucket) {
        z83.g(null, vguVar.a, Looper.myLooper());
        l020 C = vguVar.c.C();
        try {
            vguVar.d(C, hiddenPrivateChatsBucket);
            C.s();
            C.close();
        } finally {
        }
    }

    public static void b(HiddenPrivateChatsBucket hiddenPrivateChatsBucket, tgu tguVar) {
        sgu sguVar = tguVar.hideChat;
        if (sguVar != null) {
            Long l = hiddenPrivateChatsBucket.bucketValue.get(sguVar.userId);
            long j = sguVar.hideTimestamp;
            if (l != null) {
                j = Math.max(l.longValue(), j);
            }
            hiddenPrivateChatsBucket.bucketValue.put(sguVar.userId, Long.valueOf(j));
        }
    }

    public final void c() {
        z83.g(null, this.a, Looper.myLooper());
        if (this.g) {
            return;
        }
        xo3 xo3Var = this.e;
        if (xo3Var != null) {
            xo3Var.cancel();
        }
        this.e = null;
        xo3 xo3Var2 = this.f;
        if (xo3Var2 != null) {
            xo3Var2.cancel();
        }
        this.f = null;
        k020 k020Var = this.c;
        k020Var.getClass();
        HiddenPrivateChatsBucket hiddenPrivateChatsBucket = new HiddenPrivateChatsBucket();
        at2 at2Var = k020Var.b;
        hiddenPrivateChatsBucket.bucketValue = at2Var.l0().c();
        hiddenPrivateChatsBucket.version = at2Var.S().a("local_hidden_private_chats");
        ArrayList arrayList = new ArrayList();
        Iterator it = this.d.k().iterator();
        while (it.hasNext()) {
            arrayList.add(((u2b0) it.next()).a);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.e = this.b.d(HiddenPrivateChatsBucket.class, new rgu(this, arrayList), hiddenPrivateChatsBucket);
    }

    public final void d(l020 l020Var, HiddenPrivateChatsBucket hiddenPrivateChatsBucket) {
        z83.g(null, this.a, Looper.myLooper());
        long j = hiddenPrivateChatsBucket.version;
        ro6 ro6Var = l020Var.E.g;
        if (j <= ro6Var.a("remote_hidden_private_chats")) {
            return;
        }
        ro6Var.b(j, "remote_hidden_private_chats");
        HiddenPrivateChatsBucket hiddenPrivateChatsBucket2 = new HiddenPrivateChatsBucket();
        hiddenPrivateChatsBucket2.version = hiddenPrivateChatsBucket.version;
        hiddenPrivateChatsBucket2.bucketValue = new HashMap(hiddenPrivateChatsBucket.bucketValue);
        Iterator it = this.d.k().iterator();
        while (it.hasNext()) {
            b(hiddenPrivateChatsBucket2, (tgu) ((u2b0) it.next()).b);
        }
        l020Var.D(hiddenPrivateChatsBucket2);
    }
}
