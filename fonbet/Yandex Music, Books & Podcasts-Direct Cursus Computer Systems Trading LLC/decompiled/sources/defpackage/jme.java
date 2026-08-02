package defpackage;

import android.app.Application;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.a;

/* loaded from: classes5.dex */
public final class jme {
    public final Application a;
    public final y4h b;
    public final a c;
    public final a d;
    public final fs e;
    public final fs f;
    public final h0m g;
    public final fs h;
    public final z0i i;
    public final b5m j;
    public final c5m k;
    public final d5m l;
    public final d5m m;
    public final e5m n;

    public jme(Application application, y4h y4hVar, a aVar, a aVar2, fs fsVar, fs fsVar2, h0m h0mVar, fs fsVar3, z0i z0iVar, b5m b5mVar, c5m c5mVar, d5m d5mVar, d5m d5mVar2, e5m e5mVar) {
        y4hVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        this.a = application;
        this.b = y4hVar;
        this.c = aVar;
        this.d = aVar2;
        this.e = fsVar;
        this.f = fsVar2;
        this.g = h0mVar;
        this.h = fsVar3;
        this.i = z0iVar;
        this.j = b5mVar;
        this.k = c5mVar;
        this.l = d5mVar;
        this.m = d5mVar2;
        this.n = e5mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jme)) {
            return false;
        }
        jme jmeVar = (jme) obj;
        return this.a.equals(jmeVar.a) && Intrinsics.d(this.b, jmeVar.b) && Intrinsics.d(this.c, jmeVar.c) && Intrinsics.d(this.d, jmeVar.d) && this.e.equals(jmeVar.e) && this.f.equals(jmeVar.f) && this.g.equals(jmeVar.g) && this.h.equals(jmeVar.h) && this.i.equals(jmeVar.i) && this.j.equals(jmeVar.j) && this.k.equals(jmeVar.k) && this.l.equals(jmeVar.l) && this.m.equals(jmeVar.m) && this.n.equals(jmeVar.n);
    }

    public final int hashCode() {
        return this.n.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "InitializationParamsImpl(app=" + this.a + ", mainCoroutineDispatcher=" + this.b + ", defaultCoroutineDispatcher=" + this.c + ", ioCoroutineDispatcher=" + this.d + ", isDailyAppWidgetEnabledFlow=" + this.e + ", environmentFlow=" + this.f + ", userIdFlow=" + this.g + ", consumerNameFlow=" + this.h + ", httpResponseProvider=" + this.i + ", authTokenProvider=" + this.j + ", analyticEventCallback=" + this.k + ", diagnosticEventCallback=" + this.l + ", benchmarkEventCallback=" + this.m + ", logEventCallback=" + this.n + ')';
    }
}
