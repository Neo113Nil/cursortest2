package g7;

import android.content.Context;
import com.google.android.gms.internal.ads.AbstractC3413jg;
import com.google.android.gms.internal.ads.C2835Wc;
import com.google.android.gms.internal.ads.C2851Xc;
import com.google.android.gms.internal.ads.C2866Yb;
import com.google.android.gms.internal.ads.C3481ku;
import com.google.android.gms.internal.ads.C4274ze;
import com.google.android.gms.internal.ads.RunnableC3973u0;
import com.google.android.gms.internal.ads.Su;
import com.google.android.gms.internal.ads.Ux;
import com.google.android.gms.internal.ads.Wu;
import com.icefishing.icefishinglive2.AbstractC4404f;
import e4.C4463a;
import j7.EnumC4613b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import l7.C4666a;
import m7.C4741a;
import o7.C4802a;
import o7.C4805d;
import u.AbstractC5049e;
import u2.z;
import v2.C5110a;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37663a;

    /* renamed from: b, reason: collision with root package name */
    public String f37664b;

    /* renamed from: c, reason: collision with root package name */
    public int f37665c;

    /* renamed from: d, reason: collision with root package name */
    public Object f37666d;

    /* renamed from: e, reason: collision with root package name */
    public Object f37667e;

    /* renamed from: f, reason: collision with root package name */
    public Object f37668f;

    /* renamed from: g, reason: collision with root package name */
    public Object f37669g;

    /* renamed from: h, reason: collision with root package name */
    public Object f37670h;

    public /* synthetic */ m() {
        this.f37663a = 2;
    }

    public C4463a a() {
        String str = this.f37665c == 0 ? " registrationStatus" : "";
        if (((Long) this.f37668f) == null) {
            str = str.concat(" expiresInSecs");
        }
        if (((Long) this.f37669g) == null) {
            str = AbstractC4404f.f(str, " tokenCreationEpochInSecs");
        }
        if (str.isEmpty()) {
            return new C4463a(this.f37664b, this.f37665c, (String) this.f37666d, (String) this.f37667e, ((Long) this.f37668f).longValue(), ((Long) this.f37669g).longValue(), (String) this.f37670h);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public a b(d4.f fVar) {
        k7.b c9 = c();
        t tVar = (t) this.f37668f;
        tVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : tVar.f37694e.entrySet()) {
            C4741a c4741a = (C4741a) entry.getKey();
            for (C4802a c4802a : c4741a.f39318b.a(c9, tVar.f37693d)) {
                C4805d c4805d = C4805d.f39641a;
                d dVar = c4802a.f39635b;
                b bVar = dVar.f37660a;
                if (c4805d != bVar) {
                    C4666a c4666a = tVar.f37692c.f39505c;
                    k7.c.a(dVar, EnumC4613b.f38477n, c9);
                    throw null;
                }
            }
        }
        s sVar = arrayList.size() == 1 ? (s) arrayList.get(0) : new s(arrayList);
        switch (fVar.f37063n) {
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
        return new k7.b(this.f37664b, (String) this.f37666d, (String) this.f37667e, (n) this.f37669g, this.f37665c, new k7.a((List) ((F1.a) this.f37670h).f903u));
    }

    public String d(String str) {
        StringBuilder c9 = AbstractC5049e.c(str, "{descriptor=");
        c9.append(c());
        c9.append("}");
        return c9.toString();
    }

    public C2851Xc e() {
        Su g4 = Su.g((Context) this.f37667e, 6);
        g4.c();
        C2851Xc c2851Xc = new C2851Xc();
        z.k("loadJavascriptEngine > Before UI_THREAD_EXECUTOR");
        AbstractC3413jg.f31273f.execute(new RunnableC3973u0(7, this, c2851Xc));
        z.k("loadNewJavascriptEngine: Promise created");
        c2851Xc.p(new C4274ze(this, c2851Xc, g4), new C3481ku(this, c2851Xc, g4));
        return c2851Xc;
    }

    public C2835Wc f() {
        z.k("getEngine: Trying to acquire lock");
        Object obj = this.f37666d;
        synchronized (obj) {
            try {
                z.k("getEngine: Lock acquired");
                z.k("refreshIfDestroyed: Trying to acquire lock");
                synchronized (obj) {
                    try {
                        z.k("refreshIfDestroyed: Lock acquired");
                        C2851Xc c2851Xc = (C2851Xc) this.f37670h;
                        if (c2851Xc != null && this.f37665c == 0) {
                            c2851Xc.p(new Ux(8, this), C2866Yb.f28689u);
                        }
                    } finally {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        z.k("refreshIfDestroyed: Lock released");
        C2851Xc c2851Xc2 = (C2851Xc) this.f37670h;
        if (c2851Xc2 != null && ((AtomicInteger) c2851Xc2.f732v).get() != -1) {
            int i = this.f37665c;
            if (i == 0) {
                z.k("getEngine (NO_UPDATE): Lock released");
                return ((C2851Xc) this.f37670h).s();
            }
            if (i != 1) {
                z.k("getEngine (UPDATING): Lock released");
                return ((C2851Xc) this.f37670h).s();
            }
            this.f37665c = 2;
            e();
            z.k("getEngine (PENDING_UPDATE): Lock released");
            return ((C2851Xc) this.f37670h).s();
        }
        this.f37665c = 2;
        this.f37670h = e();
        z.k("getEngine (NULL or REJECTED): Lock released");
        return ((C2851Xc) this.f37670h).s();
    }

    public String toString() {
        switch (this.f37663a) {
            case 0:
                return d(m.class.getSimpleName());
            default:
                return super.toString();
        }
    }

    public m(Context context, C5110a c5110a, String str, Wu wu) {
        this.f37663a = 1;
        this.f37666d = new Object();
        this.f37665c = 1;
        this.f37664b = str;
        this.f37667e = context.getApplicationContext();
        this.f37668f = c5110a;
        this.f37669g = wu;
    }

    public m(String str, n nVar, int i, t tVar) {
        this.f37663a = 0;
        this.f37670h = new F1.a(22, false);
        this.f37666d = "";
        this.f37667e = "";
        this.f37664b = str;
        this.f37669g = nVar;
        this.f37665c = i;
        this.f37668f = tVar;
    }
}
