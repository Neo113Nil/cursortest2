package o1;

import I0.j;
import O.C0349t;
import a.AbstractC0426a;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bumptech.glide.manager.n;
import com.google.android.gms.internal.ads.RunnableC4050v0;
import com.google.android.gms.internal.ads.W4;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l4.q;
import m.R0;
import n1.i;
import w.AbstractC5128c;

/* renamed from: o1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4800d implements Comparable {

    /* renamed from: A, reason: collision with root package name */
    public boolean f39730A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f39731B;

    /* renamed from: C, reason: collision with root package name */
    public final C0349t f39732C;

    /* renamed from: D, reason: collision with root package name */
    public W4 f39733D;

    /* renamed from: E, reason: collision with root package name */
    public q f39734E;

    /* renamed from: F, reason: collision with root package name */
    public final Object f39735F;

    /* renamed from: G, reason: collision with root package name */
    public final q f39736G;

    /* renamed from: n, reason: collision with root package name */
    public final i f39737n;

    /* renamed from: u, reason: collision with root package name */
    public final String f39738u;

    /* renamed from: v, reason: collision with root package name */
    public final int f39739v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f39740w;

    /* renamed from: x, reason: collision with root package name */
    public final j f39741x;

    /* renamed from: y, reason: collision with root package name */
    public Integer f39742y;

    /* renamed from: z, reason: collision with root package name */
    public S0.q f39743z;

    public C4800d(String str, q qVar, j jVar) {
        Uri parse;
        String host;
        this.f39737n = i.f39636c ? new i() : null;
        this.f39740w = new Object();
        this.f39730A = true;
        int i = 0;
        this.f39731B = false;
        this.f39733D = null;
        this.f39738u = str;
        this.f39741x = jVar;
        C0349t c0349t = new C0349t();
        c0349t.f2221a = com.anythink.basead.exoplayer.d.f7550c;
        this.f39732C = c0349t;
        if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && (host = parse.getHost()) != null) {
            i = host.hashCode();
        }
        this.f39739v = i;
        this.f39735F = new Object();
        this.f39736G = qVar;
    }

    public static n f(n nVar) {
        String str;
        long j6;
        boolean z6;
        long j9;
        long j10;
        long j11;
        long j12;
        W4 w42;
        Map map = (Map) nVar.f24250v;
        byte[] bArr = (byte[]) nVar.f24249u;
        try {
            str = new String(bArr, AbstractC0426a.k(map));
        } catch (UnsupportedEncodingException unused) {
            str = new String(bArr);
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (map != null) {
            String str2 = (String) map.get("Date");
            long l9 = str2 != null ? AbstractC0426a.l(str2) : 0L;
            String str3 = (String) map.get("Cache-Control");
            int i = 0;
            if (str3 != null) {
                String[] split = str3.split(",", 0);
                z6 = false;
                j9 = 0;
                j10 = 0;
                while (i < split.length) {
                    String trim = split[i].trim();
                    if (!trim.equals("no-cache") && !trim.equals("no-store")) {
                        if (trim.startsWith("max-age=")) {
                            try {
                                j9 = Long.parseLong(trim.substring(8));
                            } catch (Exception unused2) {
                            }
                        } else if (trim.startsWith("stale-while-revalidate=")) {
                            j10 = Long.parseLong(trim.substring(23));
                        } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                            z6 = true;
                        }
                        i++;
                    }
                }
                j6 = 0;
                i = 1;
            } else {
                j6 = 0;
                z6 = false;
                j9 = 0;
                j10 = 0;
            }
            String str4 = (String) map.get("Expires");
            long l10 = str4 != null ? AbstractC0426a.l(str4) : j6;
            String str5 = (String) map.get("Last-Modified");
            long l11 = str5 != null ? AbstractC0426a.l(str5) : j6;
            String str6 = (String) map.get("ETag");
            if (i != 0) {
                long j13 = (j9 * 1000) + currentTimeMillis;
                j11 = j13;
                j12 = z6 ? j13 : (j10 * 1000) + j13;
            } else {
                j11 = (l9 <= j6 || l10 < l9) ? j6 : (l10 - l9) + currentTimeMillis;
                j12 = j11;
            }
            W4 w43 = new W4(1);
            w43.f29111a = bArr;
            w43.f29112b = str6;
            w43.f29116f = j11;
            w43.f29115e = j12;
            w43.f29113c = l9;
            w43.f29114d = l11;
            w43.f29117g = map;
            w43.f29118h = (List) nVar.f24251w;
            w42 = w43;
            return new n(str, w42);
        }
        w42 = null;
        return new n(str, w42);
    }

    public final void a(String str) {
        if (i.f39636c) {
            this.f39737n.a(str, Thread.currentThread().getId());
        }
    }

    public final void b(String str) {
        S0.q qVar = this.f39743z;
        if (qVar != null) {
            synchronized (((HashSet) qVar.f2957b)) {
                ((HashSet) qVar.f2957b).remove(this);
            }
            synchronized (((ArrayList) qVar.f2964j)) {
                Iterator it = ((ArrayList) qVar.f2964j).iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            }
            qVar.j();
        }
        if (i.f39636c) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new RunnableC4050v0(this, str, id));
            } else {
                this.f39737n.a(str, id);
                this.f39737n.b(toString());
            }
        }
    }

    public final boolean c() {
        boolean z6;
        synchronized (this.f39740w) {
            z6 = this.f39731B;
        }
        return z6;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C4800d c4800d = (C4800d) obj;
        c4800d.getClass();
        return this.f39742y.intValue() - c4800d.f39742y.intValue();
    }

    public final void d() {
        q qVar;
        synchronized (this.f39740w) {
            qVar = this.f39734E;
        }
        if (qVar != null) {
            qVar.m(this);
        }
    }

    public final void e(n nVar) {
        q qVar;
        List list;
        synchronized (this.f39740w) {
            qVar = this.f39734E;
        }
        if (qVar != null) {
            W4 w42 = (W4) nVar.f24250v;
            if (w42 != null) {
                if (w42.f29115e >= System.currentTimeMillis()) {
                    String str = this.f39738u;
                    synchronized (qVar) {
                        list = (List) ((HashMap) qVar.f38945n).remove(str);
                    }
                    if (list != null) {
                        if (n1.j.f39639a) {
                            n1.j.d("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), str);
                        }
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((R0) qVar.f38946u).c((C4800d) it.next(), nVar, null);
                        }
                        return;
                    }
                    return;
                }
            }
            qVar.m(this);
        }
    }

    public final void g() {
        S0.q qVar = this.f39743z;
        if (qVar != null) {
            qVar.j();
        }
    }

    public final String toString() {
        String str = "0x" + Integer.toHexString(this.f39739v);
        StringBuilder sb = new StringBuilder("[ ] ");
        synchronized (this.f39740w) {
        }
        AbstractC5128c.h(sb, this.f39738u, " ", str, " ");
        sb.append("NORMAL");
        sb.append(" ");
        sb.append(this.f39742y);
        return sb.toString();
    }
}
