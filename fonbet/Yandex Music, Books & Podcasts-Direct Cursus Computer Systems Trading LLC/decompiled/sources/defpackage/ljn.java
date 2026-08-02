package defpackage;

import com.google.gson.JsonObject;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;

/* loaded from: classes4.dex */
public final class ljn implements bse {
    public final q02 a;
    public final sfm b;
    public final jyr c;
    public volatile int d;
    public final ReentrantLock e = new ReentrantLock();

    public ljn(q02 q02Var, sfm sfmVar, jyr jyrVar) {
        this.a = q02Var;
        this.b = sfmVar;
        this.c = jyrVar;
    }

    public final void a() {
        z98 z98Var = ((OkHttpClient) this.c.getValue()).a;
        synchronized (z98Var) {
            try {
                Iterator it = ((ArrayDeque) z98Var.d).iterator();
                while (it.hasNext()) {
                    ((jkn) it.next()).c.cancel();
                }
                Iterator it2 = ((ArrayDeque) z98Var.e).iterator();
                while (it2.hasNext()) {
                    ((jkn) it2.next()).c.cancel();
                }
                Iterator it3 = ((ArrayDeque) z98Var.f).iterator();
                while (it3.hasNext()) {
                    ((mkn) it3.next()).cancel();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.d = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Boolean] */
    @Override // defpackage.bse
    public final l3o b(ukn uknVar) {
        Continuation continuation;
        d0o d0oVar = (d0o) uknVar.i;
        if (yqq.class.cast(d0oVar.e.get(yqq.class)) != null) {
            return uknVar.f(d0oVar);
        }
        l3o f = uknVar.f(d0oVar);
        bwf bwfVar = bwf.c;
        arf a = btf.a(bwfVar, new iik(29, this, f));
        if (f.d == 401) {
            ReentrantLock reentrantLock = this.e;
            reentrantLock.lock();
            try {
                int i = 13;
                arf a2 = btf.a(bwfVar, new b6n(13, uknVar));
                if (((Boolean) a.getValue()).booleanValue()) {
                    r7o r7oVar = z7o.b;
                    continuation = Boolean.FALSE;
                } else {
                    int i2 = this.d;
                    this.d = i2 + 1;
                    if (i2 >= 3 || ((Boolean) a2.getValue()).booleanValue()) {
                        if (((Boolean) a2.getValue()).booleanValue()) {
                            throw new IOException("Canceled");
                        }
                        a();
                        reentrantLock.unlock();
                        return f;
                    }
                    ?? r2 = ((z7o) x97.D(dm6.b, new s1n(this, d0oVar, r5, i))).a;
                    boolean z = r2 instanceof t7o;
                    continuation = r2;
                    if (!z) {
                        r7o r7oVar2 = z7o.b;
                        continuation = Boolean.TRUE;
                    }
                }
                reentrantLock.unlock();
                r7o r7oVar3 = z7o.b;
                boolean z2 = continuation instanceof t7o;
                if (!z2) {
                    if (weo.G(f.a)) {
                        try {
                            if (f.g != null) {
                                f.close();
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    l3o f2 = uknVar.f(d0oVar);
                    if (Intrinsics.d(z2 ? null : continuation, Boolean.TRUE)) {
                        sfm sfmVar = this.b;
                        String str = d0oVar.a.i;
                        int i3 = this.d;
                        JsonObject jsonObject = new JsonObject();
                        jsonObject.u("url", str);
                        jsonObject.s(Integer.valueOf(i3), "currentRetryCount");
                        b3i b3iVar = (b3i) sfmVar.a;
                        String jsonElement = jsonObject.toString();
                        jsonElement.getClass();
                        b3iVar.P("re_auth_success", jsonElement);
                    }
                    return f2;
                }
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        return f;
    }
}
