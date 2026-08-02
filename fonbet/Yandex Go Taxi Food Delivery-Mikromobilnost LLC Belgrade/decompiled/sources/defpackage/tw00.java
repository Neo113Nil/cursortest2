package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import androidx.room.util.a;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.authorized.chat.unread.MarkUnreadActionException;
import com.yandex.messaging.internal.net.NoInternetException;
import java.lang.ref.WeakReference;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.b;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes15.dex */
public final class tw00 extends ky4 {
    public final g720 A;
    public x08 B;
    public final WeakReference y;
    public final ServerMessageRef z;

    public tw00(ChatRequest chatRequest, WeakReference weakReference, ServerMessageRef serverMessageRef, g720 g720Var) {
        super(chatRequest);
        this.y = weakReference;
        this.z = serverMessageRef;
        this.A = g720Var;
    }

    @Override // defpackage.ky4, defpackage.xx4, defpackage.hr
    public final void b() {
        super.b();
        x08 x08Var = this.B;
        if (x08Var != null) {
            x08Var.cancel();
            this.B = null;
        }
    }

    @Override // defpackage.hr
    public final boolean f(hr hrVar) {
        boolean z = hrVar instanceof y721;
        ChatRequest chatRequest = this.w;
        if (z) {
            return jl40.l(((y721) hrVar).w, chatRequest);
        }
        if (hrVar instanceof tw00) {
            return jl40.l(((tw00) hrVar).w, chatRequest);
        }
        return false;
    }

    @Override // defpackage.b9b
    public final void k(j3b j3bVar, s020 s020Var) {
        Long valueOf;
        Long l;
        m8g m8gVar = (m8g) s020Var;
        s9b s9bVar = (s9b) m8gVar.f0.get();
        z83.g(null, s9bVar.a, Looper.myLooper());
        r9b r9bVar = s9bVar.F;
        r9bVar.b.removeCallbacksAndMessages(null);
        r9bVar.c = 0L;
        r9bVar.w = -1L;
        r9bVar.a.getClass();
        r9bVar.x = SystemClock.elapsedRealtime();
        hdb hdbVar = (hdb) m8gVar.H0.get();
        k200 k200Var = new k200(12, this);
        meb mebVar = hdbVar.e;
        x08 x08Var = wfz.z;
        o1b0 o1b0Var = hdbVar.a;
        Looper.myLooper();
        z83.i();
        if (hdbVar.d.a()) {
            y221 y221Var = hdbVar.c;
            ServerMessageRef serverMessageRef = this.z;
            g720 g720Var = this.A;
            if (serverMessageRef == null) {
                long j = o1b0Var.a;
                y221Var.getClass();
                y221Var.a.reportEvent("chat_mark_unread", b.n(g720Var.a(), gw00.e(new Pair("chatId", Long.valueOf(j)))));
            } else {
                y221Var.getClass();
                y221Var.a.reportEvent("message_mark_unread", b.n(g720Var.a(), b.i(new Pair("chatId", serverMessageRef.getRequiredChatId()), new Pair(ClidProvider.TIMESTAMP, Long.valueOf(serverMessageRef.getTimestamp())))));
            }
            if (serverMessageRef != null) {
                valueOf = (Long) a.b(hdbVar.f.a, true, false, new j2b(9, o1b0Var.a, serverMessageRef.getTimestamp()));
            } else {
                valueOf = Long.valueOf(((Number) a.b(mebVar.a, true, false, new hcb(o1b0Var.a, 18))).longValue());
            }
            if (valueOf != null) {
                long longValue = valueOf.longValue();
                if (serverMessageRef != null) {
                    l = Long.valueOf(serverMessageRef.getTimestamp());
                } else {
                    l = (Long) a.b(mebVar.a, true, false, new hcb(o1b0Var.a, 14));
                }
                if (l != null) {
                    long longValue2 = l.longValue();
                    x08Var = hdbVar.b.f(new gdb(hdbVar, longValue, ((Number) a.b(mebVar.a, true, false, new hcb(o1b0Var.a, 7))).longValue(), longValue2, k200Var));
                } else {
                    k200Var.invoke(new Result(new Result.Failure(new MarkUnreadActionException())));
                }
            } else {
                k200Var.invoke(new Result(new Result.Failure(new MarkUnreadActionException())));
            }
        } else {
            k200Var.invoke(new Result(new Result.Failure(new NoInternetException())));
        }
        this.B = x08Var;
    }
}
