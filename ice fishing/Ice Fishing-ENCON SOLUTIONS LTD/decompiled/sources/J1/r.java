package J1;

import F.C0038n;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.util.ArrayList;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final C0038n f915a = new C0038n(2);

    /* renamed from: b, reason: collision with root package name */
    public final C.j f916b = new C.j(9);

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f917c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f918d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final H0.b f919e = new H0.b(22);

    /* renamed from: f, reason: collision with root package name */
    public final boolean f920f = true;

    /* renamed from: g, reason: collision with root package name */
    public final C0051b f921g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f922h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f923i;

    /* renamed from: j, reason: collision with root package name */
    public final C0051b f924j;

    /* renamed from: k, reason: collision with root package name */
    public final C0051b f925k;

    /* renamed from: l, reason: collision with root package name */
    public final C0051b f926l;

    /* renamed from: m, reason: collision with root package name */
    public final SocketFactory f927m;

    /* renamed from: n, reason: collision with root package name */
    public SSLSocketFactory f928n;

    /* renamed from: o, reason: collision with root package name */
    public X509TrustManager f929o;

    /* renamed from: p, reason: collision with root package name */
    public final List f930p;

    /* renamed from: q, reason: collision with root package name */
    public List f931q;

    /* renamed from: r, reason: collision with root package name */
    public final V1.c f932r;

    /* renamed from: s, reason: collision with root package name */
    public final e f933s;
    public R1.l t;

    /* renamed from: u, reason: collision with root package name */
    public int f934u;

    /* renamed from: v, reason: collision with root package name */
    public int f935v;

    /* renamed from: w, reason: collision with root package name */
    public final int f936w;

    public r() {
        C0051b c0051b = C0051b.f823a;
        this.f921g = c0051b;
        this.f922h = true;
        this.f923i = true;
        this.f924j = C0051b.f824b;
        this.f925k = C0051b.f825c;
        this.f926l = c0051b;
        SocketFactory socketFactory = SocketFactory.getDefault();
        kotlin.jvm.internal.i.d(socketFactory, "getDefault()");
        this.f927m = socketFactory;
        this.f930p = s.f937A;
        this.f931q = s.f938z;
        this.f932r = V1.c.f1831a;
        this.f933s = e.f844c;
        this.f934u = AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND;
        this.f935v = AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND;
        this.f936w = AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND;
    }
}
