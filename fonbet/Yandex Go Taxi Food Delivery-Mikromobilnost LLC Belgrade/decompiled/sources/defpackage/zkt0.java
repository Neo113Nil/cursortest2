package defpackage;

import android.os.Looper;
import androidx.room.util.a;
import com.yandex.messaging.internal.entities.ChatId;
import com.yandex.messaging.internal.entities.ChatNamespaces;

/* loaded from: classes15.dex */
public final class zkt0 {
    public final Looper a;
    public final k020 b;
    public final lqo c;

    public zkt0(Looper looper, k020 k020Var, lqo lqoVar) {
        this.a = looper;
        this.b = k020Var;
        this.c = lqoVar;
        z83.g(null, looper, Looper.myLooper());
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x009b, code lost:
    
        if ((com.yandex.messaging.internal.entities.ChatId.Companion.f(r11) ? r2 != null ? r0.a0().c(r2.longValue()) : false : r0.a0().c(r5)) != false) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(String str) {
        z83.g(null, this.a, Looper.myLooper());
        k020 k020Var = this.b;
        j3b l = k020Var.l(str);
        at2 at2Var = k020Var.b;
        if (l == null) {
            return true;
        }
        String str2 = l.e;
        boolean z = l.G;
        boolean z2 = l.H;
        boolean z3 = l.D;
        boolean z4 = l.C;
        int i = 0;
        if (l.O <= 0 && !z3 && !z2 && !z && !l.J) {
            r96 r96Var = tz10.d;
            lqo lqoVar = this.c;
            if ((lqoVar.a(r96Var) || (z4 && str2 != null)) && ((z4 && str2 != null) || l.L)) {
                if (lqoVar.a(tz10.j)) {
                    long j = l.a;
                    String str3 = l.b;
                    boolean z5 = l.E;
                    Long l2 = l.u;
                    z83.h(null, (z4 && str2 == null) ? false : true);
                    if (z5) {
                        z83.i();
                    }
                    ChatNamespaces.b(str3);
                    ChatId.Companion.b(str3);
                    ChatNamespaces.a(str3);
                }
                if (str2 == null || (!at2Var.C().e(str2) && !((Boolean) a.b(at2Var.d().a, true, false, new lv21(str2, i))).booleanValue())) {
                    return !at2Var.R().b(str);
                }
            }
        }
        return false;
    }
}
