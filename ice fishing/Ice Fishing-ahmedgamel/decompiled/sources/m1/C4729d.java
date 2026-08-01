package m1;

import O.C0344t;
import S0.n;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bumptech.glide.manager.o;
import com.google.android.gms.internal.ads.RunnableC4027v0;
import com.google.android.gms.internal.ads.W4;
import com.icefishinggame.icefishinggamemultigames.F;
import g1.C4523c;
import j4.q;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l1.i;
import l1.j;
import u1.h;

/* renamed from: m1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4729d implements Comparable {

    /* renamed from: A, reason: collision with root package name */
    public boolean f39287A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f39288B;

    /* renamed from: C, reason: collision with root package name */
    public final C0344t f39289C;

    /* renamed from: D, reason: collision with root package name */
    public W4 f39290D;

    /* renamed from: E, reason: collision with root package name */
    public n f39291E;

    /* renamed from: F, reason: collision with root package name */
    public final Object f39292F;

    /* renamed from: G, reason: collision with root package name */
    public final q f39293G;

    /* renamed from: n, reason: collision with root package name */
    public final i f39294n;

    /* renamed from: u, reason: collision with root package name */
    public final String f39295u;

    /* renamed from: v, reason: collision with root package name */
    public final int f39296v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f39297w;

    /* renamed from: x, reason: collision with root package name */
    public final F f39298x;

    /* renamed from: y, reason: collision with root package name */
    public Integer f39299y;

    /* renamed from: z, reason: collision with root package name */
    public S0.q f39300z;

    public C4729d(String str, q qVar, F f3) {
        Uri parse;
        String host;
        this.f39294n = i.f38898c ? new i() : null;
        this.f39297w = new Object();
        this.f39287A = true;
        int i = 0;
        this.f39288B = false;
        this.f39290D = null;
        this.f39295u = str;
        this.f39298x = f3;
        C0344t c0344t = new C0344t();
        c0344t.f2133a = com.anythink.basead.exoplayer.d.f6764c;
        this.f39289C = c0344t;
        if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && (host = parse.getHost()) != null) {
            i = host.hashCode();
        }
        this.f39296v = i;
        this.f39292F = new Object();
        this.f39293G = qVar;
    }

    public static o f(o oVar) {
        String str;
        long j6;
        boolean z3;
        long j9;
        long j10;
        long j11;
        long j12;
        W4 w42;
        Map map = (Map) oVar.f23465v;
        byte[] bArr = (byte[]) oVar.f23464u;
        try {
            str = new String(bArr, O3.b.B(map));
        } catch (UnsupportedEncodingException unused) {
            str = new String(bArr);
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (map != null) {
            String str2 = (String) map.get("Date");
            long C8 = str2 != null ? O3.b.C(str2) : 0L;
            String str3 = (String) map.get("Cache-Control");
            int i = 0;
            if (str3 != null) {
                String[] split = str3.split(",", 0);
                z3 = false;
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
                            z3 = true;
                        }
                        i++;
                    }
                }
                j6 = 0;
                i = 1;
            } else {
                j6 = 0;
                z3 = false;
                j9 = 0;
                j10 = 0;
            }
            String str4 = (String) map.get("Expires");
            long C9 = str4 != null ? O3.b.C(str4) : j6;
            String str5 = (String) map.get("Last-Modified");
            long C10 = str5 != null ? O3.b.C(str5) : j6;
            String str6 = (String) map.get("ETag");
            if (i != 0) {
                long j13 = (j9 * 1000) + currentTimeMillis;
                j11 = j13;
                j12 = z3 ? j13 : (j10 * 1000) + j13;
            } else {
                j11 = (C8 <= j6 || C9 < C8) ? j6 : (C9 - C8) + currentTimeMillis;
                j12 = j11;
            }
            W4 w43 = new W4(1);
            w43.f28313a = bArr;
            w43.f28314b = str6;
            w43.f28318f = j11;
            w43.f28317e = j12;
            w43.f28315c = C8;
            w43.f28316d = C10;
            w43.f28319g = map;
            w43.f28320h = (List) oVar.f23466w;
            w42 = w43;
            return new o(str, w42);
        }
        w42 = null;
        return new o(str, w42);
    }

    public final void a(String str) {
        if (i.f38898c) {
            this.f39294n.a(str, Thread.currentThread().getId());
        }
    }

    public final void b(String str) {
        S0.q qVar = this.f39300z;
        if (qVar != null) {
            synchronized (((HashSet) qVar.f2828b)) {
                ((HashSet) qVar.f2828b).remove(this);
            }
            synchronized (((ArrayList) qVar.f2835j)) {
                Iterator it = ((ArrayList) qVar.f2835j).iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            }
            qVar.j();
        }
        if (i.f38898c) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new RunnableC4027v0(this, str, id));
            } else {
                this.f39294n.a(str, id);
                this.f39294n.b(toString());
            }
        }
    }

    public final boolean c() {
        boolean z3;
        synchronized (this.f39297w) {
            z3 = this.f39288B;
        }
        return z3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C4729d c4729d = (C4729d) obj;
        c4729d.getClass();
        return this.f39299y.intValue() - c4729d.f39299y.intValue();
    }

    public final void d() {
        n nVar;
        synchronized (this.f39297w) {
            nVar = this.f39291E;
        }
        if (nVar != null) {
            nVar.q(this);
        }
    }

    public final void e(o oVar) {
        n nVar;
        List list;
        synchronized (this.f39297w) {
            nVar = this.f39291E;
        }
        if (nVar != null) {
            W4 w42 = (W4) oVar.f23465v;
            if (w42 != null) {
                if (w42.f28317e >= System.currentTimeMillis()) {
                    String str = this.f39295u;
                    synchronized (nVar) {
                        list = (List) ((HashMap) nVar.f2802u).remove(str);
                    }
                    if (list != null) {
                        if (j.f38901a) {
                            j.d("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), str);
                        }
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((C4523c) nVar.f2803v).E((C4729d) it.next(), oVar, null);
                        }
                        return;
                    }
                    return;
                }
            }
            nVar.q(this);
        }
    }

    public final void g() {
        S0.q qVar = this.f39300z;
        if (qVar != null) {
            qVar.j();
        }
    }

    public final String toString() {
        String str = "0x" + Integer.toHexString(this.f39296v);
        StringBuilder sb = new StringBuilder("[ ] ");
        synchronized (this.f39297w) {
        }
        h.i(sb, this.f39295u, " ", str, " ");
        sb.append("NORMAL");
        sb.append(" ");
        sb.append(this.f39299y);
        return sb.toString();
    }
}
