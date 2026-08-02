package ru.yandex.taxi.analytics;

import android.app.Activity;
import android.app.Application;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.performance_class.a;
import defpackage.bvf0;
import defpackage.evu0;
import defpackage.h3y;
import defpackage.ike;
import defpackage.k52;
import defpackage.kb20;
import defpackage.kx4;
import defpackage.lx4;
import defpackage.ly1;
import defpackage.nbj;
import defpackage.sh41;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.u6;
import defpackage.uyj;
import defpackage.wnt;
import defpackage.ww60;
import defpackage.yb20;
import defpackage.zy11;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class j implements lx4, sh41, ww60 {
    public final Application a;
    public final kb20 b;
    public final h3y c;
    public final s d;
    public final h3y e;
    public final CrashlyticsInteractor f;
    public final h3y g;
    public final wnt h;
    public final ru.yandex.taxi.perf.b i;
    public final h3y j;
    public final Lifecycle k;
    public final tse l;
    public final q m;
    public final ike n;
    public final CopyOnWriteArraySet o;
    public final String p;

    public j(Application application, kb20 kb20Var, h3y h3yVar, s sVar, h3y h3yVar2, CrashlyticsInteractor crashlyticsInteractor, h3y h3yVar3, wnt wntVar, ru.yandex.taxi.perf.b bVar, h3y h3yVar4, Lifecycle lifecycle, tse tseVar, q qVar, tt2 tt2Var) {
        this.a = application;
        this.b = kb20Var;
        this.c = h3yVar;
        this.d = sVar;
        this.e = h3yVar2;
        this.f = crashlyticsInteractor;
        this.g = h3yVar3;
        this.h = wntVar;
        this.i = bVar;
        this.j = h3yVar4;
        this.k = lifecycle;
        this.l = tseVar;
        this.m = qVar;
        tt2Var.getClass();
        this.n = bvf0.a(uyj.a);
        this.o = new CopyOnWriteArraySet();
        qVar.n.add(new kx4() { // from class: ru.yandex.taxi.analytics.h
            @Override // defpackage.kx4
            public final void a(yb20 yb20Var) {
                j jVar = j.this;
                tje.N(jVar.n, null, null, new AnalyticsManager$1$1(jVar, yb20Var, null), 3);
            }
        });
        this.p = "AnalyticsManager";
    }

    public static void m(j jVar, String str, Map map, String str2, boolean z, boolean z2, String str3, int i) {
        tje.N(jVar.n, null, null, new AnalyticsManager$reportAttributedEvent$1(jVar, str, (i & 32) != 0 ? null : str3, map, str2, (i & 8) != 0 ? false : z ? jVar.i.d() : null, (i & 16) == 0 ? z2 : false ? new Pair("perf_class", ((a) ((nbj) jVar.j.get())).d()) : null, null), 3);
    }

    public final i d(String str) {
        return new i(this, str, null);
    }

    @Override // defpackage.ww60
    public final void f() {
        tje.N(this.l, null, null, new AnalyticsManager$onAppConfiguration$1(this, null), 3);
    }

    @Override // defpackage.s150
    public final String getName() {
        return this.p;
    }

    public final u6 i() {
        return (u6) this.c.get();
    }

    public final void j(Activity activity) {
        q qVar = this.m;
        qVar.getClass();
        qVar.a(new MetricaWrapper$pauseSession$1(activity, null));
        i().onPause();
    }

    public final Object k(Activity activity, Continuation continuation) {
        q qVar = this.m;
        qVar.getClass();
        qVar.a(new MetricaWrapper$resumeSession$1(activity, null));
        i().onResume();
        kb20 kb20Var = this.b;
        String b = kb20Var.b();
        String a = kb20Var.a();
        if (!evu0.J(b) && a != null && !evu0.J(a)) {
            return this.f.d(a, (ContinuationImpl) continuation);
        }
        qVar.k(this.a);
        return zy11.a;
    }

    public final void n(String str) {
        m(this, str, null, null, false, false, null, 56);
    }

    public final void o(String str, String str2, Map map) {
        m(this, str, map, str2, false, false, null, 56);
    }

    public final void p(String str, kotlinx.serialization.json.c cVar) {
        tje.N(this.n, null, null, new AnalyticsManager$reportEvent$1(this, cVar, str, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.Map] */
    public final void q(String str, String... strArr) {
        HashMap hashMap;
        HashMap hashMap2;
        if (strArr.length == 0) {
            return;
        }
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (strArr2.length == 0) {
            hashMap2 = kotlin.collections.b.f();
        } else if (strArr2.length == 1) {
            hashMap2 = Collections.singletonMap(strArr2[0], null);
        } else {
            if (strArr2.length != 2) {
                HashMap hashMap3 = new HashMap(1);
                String str2 = strArr2[0];
                int length = strArr2.length - 1;
                HashMap hashMap4 = hashMap3;
                int i = 1;
                while (i < length) {
                    HashMap hashMap5 = new HashMap(1);
                    hashMap4.put(str2, hashMap5);
                    str2 = strArr2[i];
                    i++;
                    hashMap4 = hashMap5;
                }
                hashMap4.put(str2, strArr2[strArr2.length - 1]);
                hashMap = hashMap3;
                m(this, str, hashMap, null, false, false, null, 56);
            }
            hashMap2 = Collections.singletonMap(strArr2[0], strArr2[1]);
        }
        hashMap = hashMap2;
        m(this, str, hashMap, null, false, false, null, 56);
    }

    public final void s(String str) {
        ly1 ly1Var = new ly1(12);
        q qVar = this.m;
        qVar.getClass();
        qVar.a(new MetricaWrapper$reportRtmEvent$1(ly1Var, qVar, str, null));
    }

    public final void t(String str, String str2) {
        n(str + Extension.DOT_CHAR + str2);
    }

    public final void u(k52 k52Var) {
        kotlinx.serialization.json.b b = k52Var.getB();
        boolean z = b instanceof kotlinx.serialization.json.c;
        String a = k52Var.getA();
        if (z) {
            p(a, (kotlinx.serialization.json.c) b);
        } else {
            q(a, String.valueOf(b));
        }
    }

    public final void v(String str) {
        i().f(str);
    }
}
