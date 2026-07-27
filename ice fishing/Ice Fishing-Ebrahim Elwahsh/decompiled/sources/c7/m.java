package c7;

import B1.w;
import a4.C0428a;
import android.content.Context;
import com.google.android.gms.internal.ads.AbstractC3212fg;
import com.google.android.gms.internal.ads.C2753Rc;
import com.google.android.gms.internal.ads.C2770Sc;
import com.google.android.gms.internal.ads.C2837Wb;
import com.google.android.gms.internal.ads.C3602mu;
import com.google.android.gms.internal.ads.C4017ue;
import com.google.android.gms.internal.ads.CL;
import com.google.android.gms.internal.ads.MD;
import com.google.android.gms.internal.ads.Vu;
import com.google.android.gms.internal.ads.Vx;
import com.google.android.gms.internal.ads.Zu;
import f7.EnumC4517b;
import h7.C4570a;
import i7.C4585a;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import k7.C4660a;
import k7.C4663d;
import t2.C;
import u.AbstractC5088e;
import u2.C5107a;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5718a;

    /* renamed from: b, reason: collision with root package name */
    public String f5719b;

    /* renamed from: c, reason: collision with root package name */
    public int f5720c;

    /* renamed from: d, reason: collision with root package name */
    public Object f5721d;

    /* renamed from: e, reason: collision with root package name */
    public Object f5722e;

    /* renamed from: f, reason: collision with root package name */
    public Object f5723f;

    /* renamed from: g, reason: collision with root package name */
    public Object f5724g;

    /* renamed from: h, reason: collision with root package name */
    public Object f5725h;

    public /* synthetic */ m() {
        this.f5718a = 1;
    }

    public C0428a a() {
        String str = this.f5720c == 0 ? " registrationStatus" : "";
        if (((Long) this.f5723f) == null) {
            str = str.concat(" expiresInSecs");
        }
        if (((Long) this.f5724g) == null) {
            str = CL.j(str, " tokenCreationEpochInSecs");
        }
        if (str.isEmpty()) {
            return new C0428a(this.f5719b, this.f5720c, (String) this.f5721d, (String) this.f5722e, ((Long) this.f5723f).longValue(), ((Long) this.f5724g).longValue(), (String) this.f5725h);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public a b(w wVar) {
        g7.b c4 = c();
        t tVar = (t) this.f5723f;
        tVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : tVar.f5749e.entrySet()) {
            C4585a c4585a = (C4585a) entry.getKey();
            for (C4660a c4660a : c4585a.f38331b.a(c4, tVar.f5748d)) {
                C4663d c4663d = C4663d.f38820a;
                d dVar = c4660a.f38814b;
                b bVar = dVar.f5715a;
                if (c4663d != bVar) {
                    C4570a c4570a = tVar.f5747c.f38582c;
                    g7.c.a(dVar, EnumC4517b.f37809n, c4);
                    throw null;
                }
            }
        }
        s sVar = arrayList.size() == 1 ? (s) arrayList.get(0) : new s(arrayList);
        switch (wVar.f126n) {
            case 24:
                return new g(c4, sVar);
            case 25:
                return new i(c4, sVar);
            case 26:
                return new l(c4, sVar);
            case 27:
                return new p(c4, sVar);
            case 28:
                return new q(c4, sVar);
            default:
                return new r(c4, sVar);
        }
    }

    public g7.b c() {
        return new g7.b(this.f5719b, (String) this.f5721d, (String) this.f5722e, (n) this.f5724g, this.f5720c, new g7.a(((e8.k) this.f5725h).f37422a));
    }

    public String d(String str) {
        StringBuilder c4 = AbstractC5088e.c(str, "{descriptor=");
        c4.append(c());
        c4.append("}");
        return c4.toString();
    }

    public C2770Sc e() {
        Vu f6 = Vu.f((Context) this.f5722e, 6);
        f6.a();
        C2770Sc c2770Sc = new C2770Sc();
        C.k("loadJavascriptEngine > Before UI_THREAD_EXECUTOR");
        AbstractC3212fg.f30743f.execute(new MD(8, this, c2770Sc));
        C.k("loadNewJavascriptEngine: Promise created");
        c2770Sc.p(new C4017ue(this, c2770Sc, f6), new C3602mu(this, c2770Sc, f6));
        return c2770Sc;
    }

    public C2753Rc f() {
        C.k("getEngine: Trying to acquire lock");
        Object obj = this.f5721d;
        synchronized (obj) {
            try {
                C.k("getEngine: Lock acquired");
                C.k("refreshIfDestroyed: Trying to acquire lock");
                synchronized (obj) {
                    try {
                        C.k("refreshIfDestroyed: Lock acquired");
                        C2770Sc c2770Sc = (C2770Sc) this.f5725h;
                        if (c2770Sc != null && this.f5720c == 0) {
                            c2770Sc.p(new Vx(8, this), C2837Wb.f28395u);
                        }
                    } finally {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C.k("refreshIfDestroyed: Lock released");
        C2770Sc c2770Sc2 = (C2770Sc) this.f5725h;
        if (c2770Sc2 != null && ((AtomicInteger) c2770Sc2.f684v).get() != -1) {
            int i = this.f5720c;
            if (i == 0) {
                C.k("getEngine (NO_UPDATE): Lock released");
                return ((C2770Sc) this.f5725h).s();
            }
            if (i != 1) {
                C.k("getEngine (UPDATING): Lock released");
                return ((C2770Sc) this.f5725h).s();
            }
            this.f5720c = 2;
            e();
            C.k("getEngine (PENDING_UPDATE): Lock released");
            return ((C2770Sc) this.f5725h).s();
        }
        this.f5720c = 2;
        this.f5725h = e();
        C.k("getEngine (NULL or REJECTED): Lock released");
        return ((C2770Sc) this.f5725h).s();
    }

    public String toString() {
        switch (this.f5718a) {
            case 0:
                return d(m.class.getSimpleName());
            default:
                return super.toString();
        }
    }

    public m(Context context, C5107a c5107a, String str, Zu zu) {
        this.f5718a = 2;
        this.f5721d = new Object();
        this.f5720c = 1;
        this.f5719b = str;
        this.f5722e = context.getApplicationContext();
        this.f5723f = c5107a;
        this.f5724g = zu;
    }

    public m(String str, n nVar, int i, t tVar) {
        this.f5718a = 0;
        this.f5725h = new e8.k();
        this.f5721d = "";
        this.f5722e = "";
        this.f5719b = str;
        this.f5724g = nVar;
        this.f5720c = i;
        this.f5723f = tVar;
    }
}
