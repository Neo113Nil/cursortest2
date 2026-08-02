package defpackage;

import android.os.Looper;
import androidx.room.util.a;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.LocalMessageRef;
import com.yandex.messaging.internal.entities.EmptyMessageData;
import com.yandex.messaging.internal.entities.MessageData;

/* loaded from: classes15.dex */
public final class qsa0 implements jsa0 {
    public final ChatRequest a;
    public final fta0 b;
    public final yw80 c;
    public c18 d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ rsa0 g;

    public qsa0(rsa0 rsa0Var, ChatRequest chatRequest, fta0 fta0Var, yw80 yw80Var) {
        this.g = rsa0Var;
        this.a = chatRequest;
        this.b = fta0Var;
        this.c = yw80Var;
    }

    public final void a() {
        rsa0 rsa0Var = this.g;
        kse kseVar = rsa0Var.a;
        kse.a(kseVar);
        z83.c(null, this.e);
        z83.c(null, this.f);
        String str = this.c.a;
        kse.a(kseVar);
        z83.h(null, rsa0Var.f.h(str) == 1);
    }

    public final void b() {
        rsa0 rsa0Var = this.g;
        kse kseVar = rsa0Var.a;
        kse.a(kseVar);
        z83.c(null, this.e);
        z83.c(null, this.f);
        this.f = true;
        String str = this.c.a;
        kse.a(kseVar);
        ksa0 ksa0Var = rsa0Var.f;
        ChatRequest chatRequest = this.a;
        ksa0Var.k(chatRequest, str);
        i6f0 i6f0Var = rsa0Var.b;
        i6f0Var.a.a(chatRequest, str);
        i6f0Var.b.remove(str);
    }

    public final void c() {
        LocalMessageRef localMessageRef;
        long j;
        int i;
        LocalMessageRef localMessageRef2;
        i7b i7bVar;
        x08 f;
        c18 c18Var;
        long j2;
        qsa0 qsa0Var = this;
        i7b i7bVar2 = (i7b) qsa0Var.b;
        o1b0 o1b0Var = i7bVar2.b;
        long j3 = o1b0Var.a;
        k020 k020Var = i7bVar2.c;
        z83.g(null, i7bVar2.a, Looper.myLooper());
        yw80 yw80Var = qsa0Var.c;
        String str = yw80Var.a;
        LocalMessageRef.Companion.getClass();
        LocalMessageRef b = t3z.b(str);
        if (i7bVar2.c(yw80Var, qsa0Var)) {
            c18Var = wfz.z;
        } else {
            if (((Boolean) a.b(k020Var.b.b().a, true, false, new qo6(j3, str, 13))).booleanValue()) {
                localMessageRef = b;
                j = -1;
            } else {
                l020 C = k020Var.C();
                try {
                    long i2 = i7bVar2.d.i();
                    MessageData messageData = yw80Var.b;
                    if (messageData instanceof EmptyMessageData) {
                        localMessageRef = b;
                        j2 = i2;
                    } else {
                        C.z.t = yw80Var;
                        j2 = i2;
                        localMessageRef = b;
                        C.v(o1b0Var, j2, yw80Var.a, System.currentTimeMillis() / 1000.0d, messageData, i7bVar2.e(yw80Var.g, yw80Var.l), yw80Var.c, yw80Var.i, yw80Var.k);
                        i7bVar2.l.a(j2, str);
                    }
                    C.s();
                    C.close();
                    j = j2;
                } finally {
                }
            }
            if (o1b0Var.l) {
                i7bVar = i7bVar2;
                localMessageRef2 = localMessageRef;
                qsa0Var = this;
                i = 0;
                f = new c18(0, new k1k(new c7b(i7bVar.v, i7bVar, yw80Var, j, qsa0Var), 0));
            } else {
                i = 0;
                localMessageRef2 = localMessageRef;
                long j4 = j;
                qsa0Var = this;
                i7bVar = i7bVar2;
                if (o1b0Var.p) {
                    f = i7bVar.f(yw80Var, j4, qsa0Var);
                } else if (k020Var.k(j3).H) {
                    String str2 = o1b0Var.c;
                    if (str2 == null) {
                        ny61.r("addresseeId cannot be null");
                        return;
                    } else {
                        f = new d7b(i7bVar, str2, qsa0Var.a, yw80Var, j4, qsa0Var);
                        i7bVar = i7bVar;
                        qsa0Var = qsa0Var;
                    }
                } else {
                    f = i7bVar.f(yw80Var, j4, qsa0Var);
                }
            }
            c18Var = new c18(i, new sb0(14, f, i7bVar, localMessageRef2));
        }
        qsa0Var.d = c18Var;
    }
}
