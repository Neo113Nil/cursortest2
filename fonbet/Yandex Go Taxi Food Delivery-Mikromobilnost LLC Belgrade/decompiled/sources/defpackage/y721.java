package defpackage;

import android.os.Looper;
import androidx.room.util.a;
import com.yandex.messaging.ChatRequest;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes15.dex */
public final class y721 extends ky4 {
    public static final /* synthetic */ int A = 0;
    public final abz0 y;
    public final g720 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y721(ChatRequest chatRequest, abz0 abz0Var, g720 g720Var, int i) {
        super(chatRequest);
        abz0Var = (i & 2) != 0 ? null : abz0Var;
        g720Var = (i & 4) != 0 ? null : g720Var;
        this.y = abz0Var;
        this.z = g720Var;
    }

    @Override // defpackage.hr
    public final boolean f(hr hrVar) {
        if (hrVar instanceof y721) {
            return jl40.l(((y721) hrVar).w, this.w);
        }
        return false;
    }

    @Override // defpackage.hr
    public final boolean g(hr hrVar) {
        if (hrVar instanceof tw00) {
            return jl40.l(((tw00) hrVar).w, this.w);
        }
        return false;
    }

    @Override // defpackage.b9b
    public final void k(j3b j3bVar, s020 s020Var) {
        Long l = null;
        abz0 abz0Var = this.y;
        if (abz0Var != null) {
            s9b s9bVar = (s9b) ((m8g) s020Var).f0.get();
            z83.g(null, s9bVar.a, Looper.myLooper());
            if (!jl40.l(s9bVar.E.c(s9bVar.b.a, abz0Var.a), Boolean.TRUE)) {
                s9bVar.F.c(abz0Var, false);
            }
        } else {
            s9b s9bVar2 = (s9b) ((m8g) s020Var).f0.get();
            o1b0 o1b0Var = s9bVar2.b;
            z83.g(null, s9bVar2.a, Looper.myLooper());
            g720 g720Var = this.z;
            if (g720Var != null) {
                y221 y221Var = s9bVar2.B;
                long j = o1b0Var.a;
                y221Var.getClass();
                y221Var.a.reportEvent("chat_mark_read", b.n(g720Var.a(), gw00.e(new Pair("chatId", Long.valueOf(j)))));
            }
            by10 by10Var = s9bVar2.E;
            meb mebVar = s9bVar2.D;
            long j2 = o1b0Var.a;
            Long l2 = (Long) a.b(mebVar.a, true, false, new hcb(j2, 14));
            if (l2 != null) {
                long longValue = l2.longValue();
                if (jl40.l(by10Var.c(j2, longValue), Boolean.TRUE)) {
                    Long l3 = (Long) a.b(by10Var.a, true, false, new j2b(10, j2, longValue));
                    if (l3 != null) {
                        longValue = l3.longValue();
                    }
                    l = Long.valueOf(longValue);
                } else {
                    l = l2;
                }
            }
            if (l != null) {
                s9bVar2.F.c(new abz0(l.longValue()), true);
            }
        }
        h();
    }
}
