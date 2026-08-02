package defpackage;

import kotlin.coroutines.Continuation;
import ru.yandex.video.m3.ab.api.AbConfigApiException;
import ru.yandex.video.m3.ab.api.a;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class n1 {
    public final tf6 a;
    public final znk b;
    public final a c;
    public final long d;
    public int e;
    public long f;
    public final xdr g = ydr.a(Boolean.FALSE);
    public final qqi h = rqi.a();
    public rar i = c();

    public n1(tf6 tf6Var, znk znkVar, a aVar, long j) {
        this.a = tf6Var;
        this.b = znkVar;
        this.c = aVar;
        this.d = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0062 A[Catch: all -> 0x008c, TryCatch #0 {all -> 0x008c, blocks: (B:11:0x0046, B:13:0x0062, B:15:0x0069, B:16:0x00b4, B:17:0x008f, B:19:0x0093, B:20:0x00ba, B:22:0x00c0, B:23:0x00d3), top: B:10:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c0 A[Catch: all -> 0x008c, TryCatch #0 {all -> 0x008c, blocks: (B:11:0x0046, B:13:0x0062, B:15:0x0069, B:16:0x00b4, B:17:0x008f, B:19:0x0093, B:20:0x00ba, B:22:0x00c0, B:23:0x00d3), top: B:10:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(n1 n1Var, cg6 cg6Var) {
        m1 m1Var;
        int i;
        qqi qqiVar;
        Object b;
        Throwable a;
        try {
            if (cg6Var instanceof m1) {
                m1Var = (m1) cg6Var;
                int i2 = m1Var.n;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    m1Var.n = i2 - Integer.MIN_VALUE;
                    Object obj = m1Var.l;
                    nm6 nm6Var = nm6.a;
                    i = m1Var.n;
                    if (i != 0) {
                        qgg.h0(obj);
                        qqiVar = n1Var.h;
                        m1Var.j = n1Var;
                        m1Var.k = qqiVar;
                        m1Var.n = 1;
                        if (qqiVar.a(m1Var) == nm6Var) {
                            return nm6Var;
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qqi qqiVar2 = m1Var.k;
                        n1 n1Var2 = m1Var.j;
                        qgg.h0(obj);
                        qqiVar = qqiVar2;
                        n1Var = n1Var2;
                    }
                    znk znkVar = n1Var.b;
                    znk znkVar2 = n1Var.b;
                    q1 config = ((i1) znkVar.b).getConfig();
                    b = n1Var.c.b(config.b);
                    long j = n1Var.d;
                    r7o r7oVar = z7o.b;
                    if (!(b instanceof t7o)) {
                        h1 h1Var = (h1) b;
                        if (h1Var instanceof g1) {
                            yse yseVar = ((g1) h1Var).a;
                            ((i1) znkVar2.b).e(new q1(((g1) h1Var).c, ((g1) h1Var).b, vq2.T(yseVar), vq2.U(yseVar), yseVar));
                        } else if (h1Var instanceof f1) {
                            long j2 = ((f1) h1Var).a;
                            String str = config.b;
                            m2 m2Var = config.c;
                            m2 m2Var2 = config.d;
                            yse yseVar2 = config.e;
                            m2Var.getClass();
                            m2Var2.getClass();
                            yseVar2.getClass();
                            ((i1) znkVar2.b).e(new q1(j2, str, m2Var, m2Var2, yseVar2));
                        }
                        n1Var.f = System.currentTimeMillis();
                    }
                    a = z7o.a(b);
                    if (a != null) {
                        Timber.INSTANCE.tag("AbConfigUpdater").e(z7o.a(b));
                        j = n1Var.b(a);
                    }
                    Long l = new Long(j);
                    qqiVar.b(null);
                    return l;
                }
            }
            znk znkVar3 = n1Var.b;
            znk znkVar22 = n1Var.b;
            q1 config2 = ((i1) znkVar3.b).getConfig();
            b = n1Var.c.b(config2.b);
            long j3 = n1Var.d;
            r7o r7oVar2 = z7o.b;
            if (!(b instanceof t7o)) {
            }
            a = z7o.a(b);
            if (a != null) {
            }
            Long l2 = new Long(j3);
            qqiVar.b(null);
            return l2;
        } catch (Throwable th) {
            qqiVar.b(null);
            throw th;
        }
        m1Var = new m1(n1Var, cg6Var);
        Object obj2 = m1Var.l;
        nm6 nm6Var2 = nm6.a;
        i = m1Var.n;
        if (i != 0) {
        }
    }

    public final long b(Throwable th) {
        long j;
        long j2;
        int i = this.e;
        if (i < 0) {
            xq0.q("Illegal state retryAttemptsCount less then zero. Check the code.");
            return 0L;
        }
        if (i == 3) {
            this.e = 0;
            return this.d;
        }
        if (!(th instanceof AbConfigApiException)) {
            return -1L;
        }
        AbConfigApiException abConfigApiException = (AbConfigApiException) th;
        if (abConfigApiException instanceof AbConfigApiException.UuidUnavailableApiException ? true : abConfigApiException instanceof AbConfigApiException.IncorrectUrlParameters) {
            return -1L;
        }
        if (abConfigApiException instanceof AbConfigApiException.ResponseExtractionApiException) {
            this.e = i + 1;
            phn.a.getClass();
            return phn.b.e(-500, 500) + 2000;
        }
        if (!(abConfigApiException instanceof AbConfigApiException.ResponseIsNotSuccessful)) {
            if (abConfigApiException instanceof AbConfigApiException.AbConfigFetchException) {
                this.e = i + 1;
                return 2000L;
            }
            b6e.s();
            return 0L;
        }
        if (((AbConfigApiException.ResponseIsNotSuccessful) th).getResponseCode() != 429) {
            this.e++;
            phn.a.getClass();
            return phn.b.e(-500, 500) + 2000;
        }
        phn.a.getClass();
        int e = phn.b.e(-500, 500);
        int i2 = this.e;
        if (i2 == 0) {
            j = 1000;
        } else if (i2 == 1) {
            j = 3000;
        } else {
            if (i2 != 2) {
                j2 = 0;
                this.e = i2 + 1;
                return j2;
            }
            j = 7000;
        }
        j2 = j + e;
        this.e = i2 + 1;
        return j2;
    }

    public final rar c() {
        return zsd.r0(this.a, zsd.M0(this.g, new l1((Continuation) null, this, 0)));
    }
}
