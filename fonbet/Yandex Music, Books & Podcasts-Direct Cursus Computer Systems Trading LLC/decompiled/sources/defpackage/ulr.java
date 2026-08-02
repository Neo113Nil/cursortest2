package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import ru.yandex.video.m3.player.tracking.LoadError;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class ulr implements k6e, uyi {
    public final String a;
    public final k6e b;
    public final nnk c;
    public final bjq d;
    public final iwe e;
    public Uri f;
    public long g;
    public long h;

    public ulr(String str, k6e k6eVar, nnk nnkVar, bjq bjqVar, iwe iweVar) {
        k6eVar.getClass();
        iweVar.getClass();
        this.a = str;
        this.b = k6eVar;
        this.c = nnkVar;
        this.d = bjqVar;
        this.e = iweVar;
        Uri uri = Uri.EMPTY;
        uri.getClass();
        this.f = uri;
        this.h = -1L;
    }

    @Override // defpackage.db7
    public final long a(nb7 nb7Var) {
        nb7Var.getClass();
        return ((Number) c(new gcp(9, this, nb7Var))).longValue();
    }

    @Override // defpackage.k6e, defpackage.db7
    public final Map b() {
        Map b = this.b.b();
        b.getClass();
        return b;
    }

    public final Object c(Function1 function1) {
        Object t7oVar;
        HashSet u0;
        Object t7oVar2;
        try {
            r7o r7oVar = z7o.b;
            t7oVar = function1.invoke(this.b);
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        Throwable a = z7o.a(t7oVar);
        if (a != null) {
            nnk nnkVar = this.c;
            Uri uri = this.f;
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.h;
            long j = this.g;
            Continuation continuation = null;
            Integer valueOf = a instanceof i6e ? Integer.valueOf(((i6e) a).d) : null;
            String host = uri != null ? uri.getHost() : null;
            if (host == null) {
                host = "";
            }
            LoadError loadError = new LoadError(host, String.valueOf(uri), elapsedRealtime, j, a.getClass().getName(), a.getMessage(), valueOf, null, null, (Throwable) new az6(4, a).s, null, null, null, null, null);
            if (((yjj) nnkVar.b).a.isEmpty()) {
                x3n x3nVar = (x3n) nnkVar.a;
                x97.y((tf6) x3nVar.d, null, null, new n6p(loadError, x3nVar, continuation, 7), 3);
            } else {
                yjj yjjVar = (yjj) nnkVar.b;
                synchronized (yjjVar.a) {
                    u0 = CollectionsKt.u0(yjjVar.a);
                }
                Iterator it = u0.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    try {
                        r7o r7oVar3 = z7o.b;
                        ((zbl) next).I(loadError);
                        t7oVar2 = Unit.a;
                    } catch (Throwable th2) {
                        r7o r7oVar4 = z7o.b;
                        t7oVar2 = new t7o(th2);
                    }
                    Throwable a2 = z7o.a(t7oVar2);
                    if (a2 != null) {
                        Timber.INSTANCE.e(a2, "notifyObservers", new Object[0]);
                    }
                }
            }
            this.g = 0L;
            this.h = -1L;
            this.e.B(this);
        }
        qgg.h0(t7oVar);
        return t7oVar;
    }

    @Override // defpackage.db7
    public final void close() {
        c(new hxo(15, this));
    }

    @Override // defpackage.db7
    public final Uri getUri() {
        return this.f;
    }

    @Override // defpackage.db7
    public final void q(t6t t6tVar) {
        t6tVar.getClass();
        this.b.q(t6tVar);
    }

    @Override // defpackage.ma7
    public final int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        return ((Number) c(new q30(bArr, i, i2, this))).intValue();
    }
}
