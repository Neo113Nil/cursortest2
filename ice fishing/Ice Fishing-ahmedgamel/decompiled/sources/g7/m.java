package g7;

import android.content.Context;
import com.anythink.core.common.n.b.A;
import com.google.android.gms.internal.ads.AbstractC3436jg;
import com.google.android.gms.internal.ads.C2858Wc;
import com.google.android.gms.internal.ads.C2874Xc;
import com.google.android.gms.internal.ads.C2889Yb;
import com.google.android.gms.internal.ads.C3504ku;
import com.google.android.gms.internal.ads.C4297ze;
import com.google.android.gms.internal.ads.RunnableC3996u0;
import com.google.android.gms.internal.ads.Su;
import com.google.android.gms.internal.ads.Ux;
import com.google.android.gms.internal.ads.Wu;
import com.google.android.gms.internal.ads.Wv;
import g4.C4532a;
import j7.EnumC4623b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import l7.C4678a;
import m7.C4755a;
import o7.C4806a;
import o7.C4809d;
import u.AbstractC5050e;
import w2.z;
import x2.C5189a;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37688a;

    /* renamed from: b, reason: collision with root package name */
    public String f37689b;

    /* renamed from: c, reason: collision with root package name */
    public int f37690c;

    /* renamed from: d, reason: collision with root package name */
    public Object f37691d;

    /* renamed from: e, reason: collision with root package name */
    public Object f37692e;

    /* renamed from: f, reason: collision with root package name */
    public Object f37693f;

    /* renamed from: g, reason: collision with root package name */
    public Object f37694g;

    /* renamed from: h, reason: collision with root package name */
    public Object f37695h;

    public /* synthetic */ m() {
        this.f37688a = 2;
    }

    public C4532a a() {
        String str = this.f37690c == 0 ? " registrationStatus" : "";
        if (((Long) this.f37693f) == null) {
            str = str.concat(" expiresInSecs");
        }
        if (((Long) this.f37694g) == null) {
            str = Wv.g(str, " tokenCreationEpochInSecs");
        }
        if (str.isEmpty()) {
            return new C4532a(this.f37689b, this.f37690c, (String) this.f37691d, (String) this.f37692e, ((Long) this.f37693f).longValue(), ((Long) this.f37694g).longValue(), (String) this.f37695h);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public a b(A a9) {
        k7.b c9 = c();
        t tVar = (t) this.f37693f;
        tVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : tVar.f37719e.entrySet()) {
            C4755a c4755a = (C4755a) entry.getKey();
            for (C4806a c4806a : c4755a.f39477b.a(c9, tVar.f37718d)) {
                C4809d c4809d = C4809d.f39752a;
                d dVar = c4806a.f39746b;
                b bVar = dVar.f37685a;
                if (c4809d != bVar) {
                    C4678a c4678a = tVar.f37717c.f39672c;
                    k7.c.a(dVar, EnumC4623b.f38489n, c9);
                    throw null;
                }
            }
        }
        s sVar = arrayList.size() == 1 ? (s) arrayList.get(0) : new s(arrayList);
        switch (a9.f15645n) {
            case 2:
                return new g(c9, sVar);
            case 3:
                return new i(c9, sVar);
            case 4:
                return new l(c9, sVar);
            case 5:
                return new p(c9, sVar);
            case 6:
                return new q(c9, sVar);
            default:
                return new r(c9, sVar);
        }
    }

    public k7.b c() {
        return new k7.b(this.f37689b, (String) this.f37691d, (String) this.f37692e, (n) this.f37694g, this.f37690c, new k7.a((List) ((I0.j) this.f37695h).f1291u));
    }

    public String d(String str) {
        StringBuilder c9 = AbstractC5050e.c(str, "{descriptor=");
        c9.append(c());
        c9.append("}");
        return c9.toString();
    }

    public C2874Xc e() {
        Su e9 = Su.e((Context) this.f37692e, 6);
        e9.c();
        C2874Xc c2874Xc = new C2874Xc();
        z.k("loadJavascriptEngine > Before UI_THREAD_EXECUTOR");
        AbstractC3436jg.f32060f.execute(new RunnableC3996u0(7, this, c2874Xc));
        z.k("loadNewJavascriptEngine: Promise created");
        c2874Xc.p(new C4297ze(this, c2874Xc, e9), new C3504ku(this, c2874Xc, e9));
        return c2874Xc;
    }

    public C2858Wc f() {
        z.k("getEngine: Trying to acquire lock");
        Object obj = this.f37691d;
        synchronized (obj) {
            try {
                z.k("getEngine: Lock acquired");
                z.k("refreshIfDestroyed: Trying to acquire lock");
                synchronized (obj) {
                    try {
                        z.k("refreshIfDestroyed: Lock acquired");
                        C2874Xc c2874Xc = (C2874Xc) this.f37695h;
                        if (c2874Xc != null && this.f37690c == 0) {
                            c2874Xc.p(new Ux(8, this), C2889Yb.f29464u);
                        }
                    } finally {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        z.k("refreshIfDestroyed: Lock released");
        C2874Xc c2874Xc2 = (C2874Xc) this.f37695h;
        if (c2874Xc2 != null && ((AtomicInteger) c2874Xc2.f257v).get() != -1) {
            int i = this.f37690c;
            if (i == 0) {
                z.k("getEngine (NO_UPDATE): Lock released");
                return ((C2874Xc) this.f37695h).s();
            }
            if (i != 1) {
                z.k("getEngine (UPDATING): Lock released");
                return ((C2874Xc) this.f37695h).s();
            }
            this.f37690c = 2;
            e();
            z.k("getEngine (PENDING_UPDATE): Lock released");
            return ((C2874Xc) this.f37695h).s();
        }
        this.f37690c = 2;
        this.f37695h = e();
        z.k("getEngine (NULL or REJECTED): Lock released");
        return ((C2874Xc) this.f37695h).s();
    }

    public String toString() {
        switch (this.f37688a) {
            case 0:
                return d(m.class.getSimpleName());
            default:
                return super.toString();
        }
    }

    public m(Context context, C5189a c5189a, String str, Wu wu) {
        this.f37688a = 1;
        this.f37691d = new Object();
        this.f37690c = 1;
        this.f37689b = str;
        this.f37692e = context.getApplicationContext();
        this.f37693f = c5189a;
        this.f37694g = wu;
    }

    public m(String str, n nVar, int i, t tVar) {
        this.f37688a = 0;
        this.f37695h = new I0.j(27);
        this.f37691d = "";
        this.f37692e = "";
        this.f37689b = str;
        this.f37694g = nVar;
        this.f37690c = i;
        this.f37693f = tVar;
    }
}
