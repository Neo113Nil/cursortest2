package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import i1.AbstractC0253j;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Rk {

    /* renamed from: a, reason: collision with root package name */
    public final X4 f5001a;

    /* renamed from: b, reason: collision with root package name */
    public final Qk f5002b;

    /* renamed from: c, reason: collision with root package name */
    public final W4 f5003c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0418g f5004d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0418g f5005e;

    /* renamed from: f, reason: collision with root package name */
    public Dk f5006f;

    /* renamed from: g, reason: collision with root package name */
    public int f5007g = 0;

    public Rk(X4 x4, Qk qk, W4 w4, C0455ha c0455ha, C0913z2 c0913z2) {
        this.f5001a = x4;
        this.f5003c = w4;
        this.f5004d = c0455ha;
        this.f5005e = c0913z2;
        this.f5002b = qk;
    }

    public final synchronized long a() {
        Dk dk;
        dk = this.f5006f;
        return dk == null ? 10000000000L : dk.f4313d - 1;
    }

    public final void b(Dk dk, P5 p5) {
        if (dk.f4316g && dk.f4313d > 0) {
            W4 w4 = this.f5003c;
            P5 a2 = P5.a(p5, EnumC0301bb.EVENT_TYPE_ALIVE);
            Tk tk = new Tk();
            tk.f5123a = dk.f4313d;
            tk.f5126d = dk.f4312c.f4434a;
            long andIncrement = dk.f4315f.getAndIncrement();
            Uk uk = dk.f4311b;
            uk.a(Uk.f5178g, Long.valueOf(dk.f4315f.get()));
            uk.b();
            tk.f5124b = andIncrement;
            tk.f5125c = TimeUnit.MILLISECONDS.toSeconds(Math.max(dk.f4318i - dk.f4314e, dk.f4319j));
            w4.f5279a.f5359n.a(a2, tk);
            if (dk.f4316g) {
                dk.f4316g = false;
                Uk uk2 = dk.f4311b;
                uk2.a(Uk.f5180i, Boolean.FALSE);
                uk2.b();
            }
        }
        PublicLogger publicLogger = this.f5001a.f5358m;
        int ordinal = dk.f4312c.f4434a.ordinal();
        if (ordinal == 0) {
            publicLogger.info("Finish foreground session", new Object[0]);
        } else if (ordinal == 1) {
            publicLogger.info("Finish background session", new Object[0]);
        }
        synchronized (dk) {
            Uk uk3 = dk.f4311b;
            uk3.getClass();
            uk3.f5183c = new C0404fb();
            uk3.b();
            dk.f4317h = null;
        }
    }

    public final synchronized void c(P5 p5) {
        try {
            if (this.f5007g == 0) {
                Dk b2 = this.f5004d.b();
                if (a(b2, p5)) {
                    this.f5006f = b2;
                    this.f5007g = 3;
                } else {
                    Dk b3 = this.f5005e.b();
                    if (a(b3, p5)) {
                        this.f5006f = b3;
                        this.f5007g = 2;
                    } else {
                        this.f5006f = null;
                        this.f5007g = 1;
                    }
                }
            }
            int a2 = K7.a(this.f5007g);
            if (a2 == 0) {
                this.f5006f = a(p5);
            } else if (a2 == 1) {
                b(this.f5006f, p5);
                this.f5006f = a(p5);
            } else if (a2 == 2) {
                if (a(this.f5006f, p5)) {
                    Dk dk = this.f5006f;
                    long j2 = p5.f4912i;
                    dk.f4318i = j2;
                    Uk uk = dk.f4311b;
                    uk.a(Uk.f5175d, Long.valueOf(j2));
                    uk.b();
                } else {
                    this.f5006f = a(p5);
                }
            }
        } finally {
        }
    }

    public final Dk a(P5 p5) {
        this.f5001a.f5358m.info("Start foreground session", new Object[0]);
        long j2 = p5.f4912i;
        AbstractC0418g abstractC0418g = this.f5004d;
        Ek ek = new Ek(j2, p5.f4913j);
        abstractC0418g.getClass();
        Dk a2 = abstractC0418g.a(ek);
        this.f5007g = 3;
        ((C0527k5) this.f5001a.f5361p).e();
        W4 w4 = this.f5003c;
        w4.f5279a.f5359n.a(P5.a(p5, C0610na.f6575I.i()), a(a2, j2));
        return a2;
    }

    public static Tk a(Dk dk, long j2) {
        Tk tk = new Tk();
        tk.f5123a = dk.f4313d;
        long andIncrement = dk.f4315f.getAndIncrement();
        Uk uk = dk.f4311b;
        uk.a(Uk.f5178g, Long.valueOf(dk.f4315f.get()));
        uk.b();
        tk.f5124b = andIncrement;
        Uk uk2 = dk.f4311b;
        long j3 = j2 - dk.f4314e;
        dk.f4319j = j3;
        uk2.a(Uk.f5176e, Long.valueOf(j3));
        tk.f5125c = TimeUnit.MILLISECONDS.toSeconds(dk.f4319j);
        tk.f5126d = dk.f4312c.f4434a;
        return tk;
    }

    public final synchronized Dk b(P5 p5) {
        try {
            if (this.f5007g == 0) {
                Dk b2 = this.f5004d.b();
                if (a(b2, p5)) {
                    this.f5006f = b2;
                    this.f5007g = 3;
                } else {
                    Dk b3 = this.f5005e.b();
                    if (a(b3, p5)) {
                        this.f5006f = b3;
                        this.f5007g = 2;
                    } else {
                        this.f5006f = null;
                        this.f5007g = 1;
                    }
                }
            }
            if (this.f5007g != 1 && !a(this.f5006f, p5)) {
                this.f5007g = 1;
                this.f5006f = null;
            }
            int a2 = K7.a(this.f5007g);
            if (a2 == 1) {
                Dk dk = this.f5006f;
                long j2 = p5.f4912i;
                dk.f4318i = j2;
                Uk uk = dk.f4311b;
                uk.a(Uk.f5175d, Long.valueOf(j2));
                uk.b();
                return this.f5006f;
            }
            if (a2 != 2) {
                this.f5001a.f5358m.info("Start background session", new Object[0]);
                this.f5007g = 2;
                long j3 = p5.f4912i;
                AbstractC0418g abstractC0418g = this.f5005e;
                Ek ek = new Ek(j3, p5.f4913j);
                abstractC0418g.getClass();
                Dk a3 = abstractC0418g.a(ek);
                if (this.f5001a.t.c()) {
                    W4 w4 = this.f5003c;
                    w4.f5279a.f5359n.a(P5.a(p5, C0610na.f6575I.i()), a(a3, p5.f4912i));
                } else {
                    int i2 = p5.f4907d;
                    EnumC0301bb enumC0301bb = EnumC0301bb.EVENT_TYPE_UNDEFINED;
                    if (i2 == 6145) {
                        W4 w42 = this.f5003c;
                        w42.f5279a.f5359n.a(p5, a(a3, j3));
                        W4 w43 = this.f5003c;
                        w43.f5279a.f5359n.a(P5.a(p5, C0610na.f6575I.i()), a(a3, j3));
                    }
                }
                this.f5006f = a3;
                return a3;
            }
            return this.f5006f;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(Dk dk, P5 p5) {
        boolean z2;
        boolean z3;
        boolean z4;
        if (dk == null) {
            return false;
        }
        long j2 = p5.f4912i;
        boolean z5 = dk.f4313d >= 0;
        if (dk.f4317h == null) {
            synchronized (dk) {
                if (dk.f4317h == null) {
                    try {
                        String asString = dk.f4310a.f5350e.a(dk.f4313d, dk.f4312c.f4434a).getAsString("report_request_parameters");
                        if (!TextUtils.isEmpty(asString)) {
                            dk.f4317h = new Sk(new JSONObject(asString));
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        Sk sk = dk.f4317h;
        if (sk != null) {
            C0539kh c0539kh = (C0539kh) dk.f4310a.f5356k.a();
            List B2 = AbstractC0253j.B(Boolean.valueOf(TextUtils.equals(c0539kh.getAnalyticsSdkVersionName(), sk.f5065a)), Boolean.valueOf(TextUtils.equals(c0539kh.getAnalyticsSdkBuildNumber(), sk.f5066b)), Boolean.valueOf(TextUtils.equals(c0539kh.getAppVersion(), sk.f5067c)), Boolean.valueOf(TextUtils.equals(c0539kh.getAppBuildNumber(), sk.f5068d)), Boolean.valueOf(TextUtils.equals(c0539kh.getOsVersion(), sk.f5069e)), Boolean.valueOf(sk.f5070f == c0539kh.getOsApiLevel()), Boolean.valueOf(sk.f5071g == c0539kh.f6389r));
            if (!B2.isEmpty()) {
                Iterator it = B2.iterator();
                while (it.hasNext()) {
                    if (!((Boolean) it.next()).booleanValue()) {
                    }
                }
            }
            z2 = true;
            long elapsedRealtime = dk.f4320k.elapsedRealtime();
            long j3 = dk.f4318i;
            z3 = elapsedRealtime >= j3;
            long j4 = j2 - j3;
            long j5 = j2 - dk.f4314e;
            if (!z3) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                Gk gk = dk.f4312c;
                int i2 = ((C0539kh) dk.f4310a.f5356k.a()).f6377f;
                Integer num = gk.f4437d;
                if (num != null) {
                    i2 = num.intValue();
                }
                if (j4 < timeUnit.toMillis(i2) && j5 < timeUnit.toMillis(Hk.f4484a)) {
                    z4 = false;
                    if (!z5 && z2 && !z4) {
                        return true;
                    }
                    b(dk, p5);
                    return false;
                }
            }
            z4 = true;
            if (!z5) {
            }
            b(dk, p5);
            return false;
        }
        z2 = false;
        long elapsedRealtime2 = dk.f4320k.elapsedRealtime();
        long j32 = dk.f4318i;
        if (elapsedRealtime2 >= j32) {
        }
        long j42 = j2 - j32;
        long j52 = j2 - dk.f4314e;
        if (!z3) {
        }
        z4 = true;
        if (!z5) {
        }
        b(dk, p5);
        return false;
    }
}
