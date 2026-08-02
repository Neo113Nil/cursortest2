package defpackage;

import com.connectsdk.service.command.ServiceCommand;
import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.OkHttpClient;

/* loaded from: classes5.dex */
public final class n56 implements bse {
    public static final n56 b = new n56(0);
    public final /* synthetic */ int a;

    public n56() {
        this.a = 1;
        yyf yyfVar = yyf.a;
    }

    public static l3o a(ukn uknVar, IOException iOException) {
        if (!n7w.R(q6c.y)) {
            throw iOException;
        }
        yyf yyfVar = yyf.a;
        if (yyf.b) {
            throw iOException;
        }
        Thread.sleep(500L);
        return c(uknVar);
    }

    public static l3o c(ukn uknVar) {
        try {
            return uknVar.f((d0o) uknVar.i);
        } catch (ConnectException e) {
            return a(uknVar, e);
        } catch (SocketTimeoutException e2) {
            return a(uknVar, e2);
        } catch (UnknownHostException e3) {
            return a(uknVar, e3);
        }
    }

    @Override // defpackage.bse
    public final l3o b(ukn uknVar) {
        l3o l3oVar;
        Long r0;
        switch (this.a) {
            case 0:
                mkn mknVar = (mkn) uknVar.g;
                synchronized (mknVar) {
                    try {
                        if (!mknVar.o) {
                            throw new IllegalStateException("released");
                        }
                        if (mknVar.n) {
                            throw new IllegalStateException("Check failed.");
                        }
                        if (mknVar.m) {
                            throw new IllegalStateException("Check failed.");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                job jobVar = mknVar.i;
                jobVar.getClass();
                OkHttpClient okHttpClient = mknVar.a;
                okHttpClient.getClass();
                try {
                    evj evjVar = new evj(mknVar, mknVar.e, jobVar, jobVar.a(uknVar.c, uknVar.d, uknVar.e, okHttpClient.f, !Intrinsics.d(((d0o) uknVar.i).b, ServiceCommand.TYPE_GET)).j(okHttpClient, uknVar));
                    mknVar.l = evjVar;
                    mknVar.q = evjVar;
                    synchronized (mknVar) {
                        mknVar.m = true;
                        mknVar.n = true;
                    }
                    if (!mknVar.p) {
                        return ukn.a(uknVar, 0, evjVar, null, 0, 0, 0, 61).f((d0o) uknVar.i);
                    }
                    kac.f("Canceled");
                    return null;
                } catch (cho e) {
                    jobVar.b(e.b);
                    throw e;
                } catch (IOException e2) {
                    jobVar.b(e2);
                    throw new cho(e2);
                }
            case 1:
                return c(uknVar);
            case 2:
                d0o d0oVar = (d0o) uknVar.i;
                if (b2c.class.cast(d0oVar.e.get(b2c.class)) != null) {
                    su4.s(2, null, "don't retry with external interceptor", null);
                }
                b0o b2 = d0oVar.b();
                b2.f(b2c.class, b2c.a);
                return uknVar.f(b2.b());
            case 3:
                d0o d0oVar2 = (d0o) uknVar.i;
                b0o b3 = d0oVar2.b();
                b3.c.I("Max-Size");
                l3o f = uknVar.f(b3.b());
                o3o o3oVar = f.g;
                o3oVar.getClass();
                List r = d0oVar2.c.r("Max-Size");
                r.getClass();
                String str = (String) CollectionsKt.firstOrNull(r);
                if (str == null || (r0 = StringsKt.r0(10, str)) == null) {
                    l3oVar = null;
                } else {
                    ikn iknVar = new ikn(fxf.T(new t5g(o3oVar.z().E0(), r0.longValue())));
                    k3o g = f.g();
                    g.g = new wkn(o3oVar.o(), o3oVar.g(), iknVar, 1);
                    l3oVar = g.a();
                }
                return l3oVar == null ? f : l3oVar;
            default:
                try {
                    return uknVar.f((d0o) uknVar.i);
                } catch (IllegalArgumentException e3) {
                    String message = e3.getMessage();
                    if (message == null || !StringsKt.M(message, "port out of range", true)) {
                        throw e3;
                    }
                    throw new IOException(e3);
                }
        }
    }

    public /* synthetic */ n56(int i) {
        this.a = i;
    }
}
