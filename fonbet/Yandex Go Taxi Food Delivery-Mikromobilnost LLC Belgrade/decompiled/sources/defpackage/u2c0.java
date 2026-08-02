package defpackage;

import android.os.Handler;
import android.os.Looper;
import androidx.room.util.a;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.ServerMessageRef;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes15.dex */
public final class u2c0 implements e1k, kab {
    public final /* synthetic */ int a;
    public final Object b;
    public Object c;
    public e1k w;
    public Object x;
    public final /* synthetic */ Object y;

    public u2c0(oy80 oy80Var, md6 md6Var) {
        this.a = 0;
        this.y = oy80Var;
        this.b = md6Var;
        w2c0 w2c0Var = (w2c0) oy80Var.c;
        z83.g(null, w2c0Var.f, Looper.myLooper());
        oy80 oy80Var2 = w2c0Var.e;
        x2c0 D = ((at2) oy80Var2.c).D();
        naz0 naz0Var = (naz0) oy80Var2.b;
        long longValue = ((Number) a.b(D.a, true, false, new vh10(naz0Var.a.a, 20))).longValue();
        ServerMessageRef serverMessageRef = longValue > 0 ? new ServerMessageRef(naz0Var.a.b, longValue) : null;
        if (serverMessageRef != null) {
            a(serverMessageRef);
        }
        this.x = new v2c0(w2c0Var, this);
    }

    public void a(ServerMessageRef serverMessageRef) {
        lab labVar = (lab) this.w;
        Object obj = null;
        if (labVar != null) {
            labVar.close();
            this.w = null;
        }
        this.c = serverMessageRef;
        if (serverMessageRef != null) {
            this.w = ((oab) ((oy80) this.y).b).m(this, serverMessageRef);
        } else {
            md6 md6Var = (md6) this.b;
            ((Handler) md6Var.b).post(new l7a(4, md6Var, obj));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.a) {
            case 0:
                lab labVar = (lab) this.w;
                if (labVar != null) {
                    labVar.close();
                    this.w = null;
                }
                v2c0 v2c0Var = (v2c0) this.x;
                if (v2c0Var != null) {
                    v2c0Var.close();
                    this.x = null;
                    break;
                }
                break;
            default:
                tje.e();
                this.x = null;
                ct21 ct21Var = (ct21) this.w;
                if (ct21Var != null) {
                    ct21Var.close();
                    this.w = null;
                }
                HashMap hashMap = (HashMap) this.b;
                Iterator it = hashMap.values().iterator();
                while (it.hasNext()) {
                    ((e1k) it.next()).close();
                }
                hashMap.clear();
                ((HashMap) this.c).clear();
                break;
        }
    }

    @Override // defpackage.kab
    public void v(r3z r3zVar) {
        Objects.requireNonNull((ServerMessageRef) this.c);
        md6 md6Var = (md6) this.b;
        ((Handler) md6Var.b).post(new l7a(4, md6Var, new y4a0(r3zVar, (ServerMessageRef) this.c, false, 10)));
    }

    public u2c0(zp11 zp11Var, ChatRequest chatRequest, yp11 yp11Var) {
        this.a = 1;
        this.y = zp11Var;
        this.b = new HashMap();
        this.c = new HashMap();
        this.x = yp11Var;
        this.w = zp11Var.c.a.e(chatRequest, new xp11(this));
    }
}
