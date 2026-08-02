package com.yandex.plus.home.internal.di;

import android.content.Context;
import com.yandex.plus.pay.adapter.api.g0;
import defpackage.btf;
import defpackage.e5b;
import defpackage.f1d;
import defpackage.fkn;
import defpackage.joj;
import defpackage.jyr;
import defpackage.k5r;
import defpackage.msa;
import defpackage.nsa;
import defpackage.tlm;
import defpackage.vdr;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u {
    public final jyr A;
    public final jyr B;
    public final Context a;
    public final com.yandex.plus.core.config.a b;
    public final fkn c;
    public final com.yandex.plus.adapter.auth.passport750.i d;
    public final com.yandex.plus.core.imageloader.b e;
    public final com.yandex.plus.pay.adapter.api.a f;
    public final String g;
    public final joj h;
    public final com.yandex.plus.bdui.plus.webview.navigation.a i;
    public final Map j;
    public final int k;
    public final com.yandex.plus.home.network.hosts.a l;
    public final vdr m;
    public final com.yandex.plus.ui.core.theme.provider.c n;
    public final com.yandex.plus.core.locale.a o;
    public final com.yandex.plus.home.api.payment.google.c p;
    public final com.yandex.plus.home.featureflags.g q;
    public final String r;
    public final String s;
    public final long t;
    public final long u;
    public final androidx.core.app.q v;
    public final com.yandex.plus.core.dispatcher.b w;
    public final com.yandex.plus.core.analytics.logging.d x;
    public final com.yandex.plus.acquisition.adapter.api.a y;
    public final jyr z;

    public u(Context context, com.yandex.plus.core.config.a aVar, fkn fknVar, com.yandex.plus.adapter.auth.passport750.i iVar, com.yandex.plus.core.imageloader.b bVar, com.yandex.plus.pay.adapter.api.a aVar2, String str, joj jojVar, com.yandex.plus.bdui.plus.webview.navigation.a aVar3, e5b e5bVar, int i, com.yandex.plus.home.network.hosts.a aVar4, vdr vdrVar, com.yandex.plus.ui.core.theme.provider.c cVar, com.yandex.plus.core.locale.a aVar5, com.yandex.plus.home.api.payment.google.c cVar2, com.yandex.plus.home.featureflags.g gVar, String str2, String str3, long j, long j2, androidx.core.app.q qVar, com.yandex.plus.core.dispatcher.b bVar2, com.yandex.plus.core.analytics.logging.d dVar, com.yandex.plus.acquisition.adapter.api.a aVar6) {
        com.yandex.plus.metrica.api.b bVar3 = com.yandex.plus.metrica.api.b.a;
        iVar.getClass();
        e5bVar.getClass();
        cVar.getClass();
        gVar.getClass();
        bVar2.getClass();
        this.a = context;
        this.b = aVar;
        this.c = fknVar;
        this.d = iVar;
        this.e = bVar;
        this.f = aVar2;
        this.g = str;
        this.h = jojVar;
        this.i = aVar3;
        this.j = e5bVar;
        this.k = i;
        this.l = aVar4;
        this.m = vdrVar;
        this.n = cVar;
        this.o = aVar5;
        this.p = cVar2;
        this.q = gVar;
        this.r = str2;
        this.s = str3;
        this.t = j;
        this.u = j2;
        this.v = qVar;
        this.w = bVar2;
        this.x = dVar;
        this.y = aVar6;
        this.z = btf.b(new com.yandex.plus.home.e(this, 4));
        this.A = btf.b(new com.yandex.plus.home.e(this, 5));
        this.B = btf.b(new com.yandex.plus.home.e(this, 6));
    }

    public final g0 a() {
        return (g0) this.z.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (!this.a.equals(uVar.a) || this.b != uVar.b || !this.c.equals(uVar.c) || !Intrinsics.d(this.d, uVar.d) || !this.e.equals(uVar.e) || !this.f.equals(uVar.f)) {
            return false;
        }
        Object obj2 = com.yandex.plus.metrica.api.b.a;
        if (!obj2.equals(obj2) || !Intrinsics.d(this.g, uVar.g) || !Intrinsics.d(this.h, uVar.h) || !this.i.equals(uVar.i) || !Intrinsics.d(this.j, uVar.j) || this.k != uVar.k || !this.l.equals(uVar.l) || !this.m.equals(uVar.m) || !Intrinsics.d(this.n, uVar.n) || !this.o.equals(uVar.o) || !this.p.equals(uVar.p) || !Intrinsics.d(this.q, uVar.q)) {
            return false;
        }
        Object obj3 = com.yandex.plus.home.feature.webviews.internalapi.animation.animator.b.a;
        return obj3.equals(obj3) && this.r.equals(uVar.r) && this.s.equals(uVar.s) && nsa.e(this.t, uVar.t) && nsa.e(this.u, uVar.u) && this.v.equals(uVar.v) && Intrinsics.d(this.w, uVar.w) && this.x.equals(uVar.x) && this.y.equals(uVar.y);
    }

    public final int hashCode() {
        int hashCode = (com.yandex.plus.metrica.api.b.a.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((((((this.b.hashCode() + (this.a.hashCode() * 31)) * 31) + 104263205) * 31) - 350524204) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        String str = this.g;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 29791;
        joj jojVar = this.h;
        int c = k5r.c(k5r.c((com.yandex.plus.home.feature.webviews.internalapi.animation.animator.b.a.hashCode() + ((this.q.hashCode() + ((this.p.hashCode() + ((this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + f1d.a(this.k, f1d.b(this.j, (this.i.hashCode() + ((hashCode2 + (jojVar != null ? jojVar.hashCode() : 0)) * 31)) * 31, 31), 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31)) * 29791, 31, this.r), 31, this.s);
        msa msaVar = nsa.b;
        return this.y.hashCode() + ((this.x.hashCode() + ((this.w.hashCode() + ((this.v.hashCode() + tlm.c(this.u, tlm.c(this.t, c, 31), 31)) * 31)) * 29791)) * 31);
    }

    public final String toString() {
        return "SdkDependenciesModule(appContext=" + this.a + ", environment=" + this.b + ", serviceName=music, hostScheme=yandexmusic, themeStateFlow=" + this.c + ", authAdapter=" + this.d + ", imageLoader=" + this.e + ", paySdkAdapterProvider=" + this.f + ", metricaProvider=" + com.yandex.plus.metrica.api.b.a + ", source=" + this.g + ", geoLocationStateFlow=null, localSettingCallback=null, okHttpClientBuilder=" + this.h + ", prepareApolloClient=" + this.i + ", analyticsParams=" + this.j + ", maxLogCapacity=" + this.k + ", weblinksProvider=" + this.l + ", offlineModeStateFlow=" + this.m + ", stylesProvider=" + this.n + ", localeProvider=" + this.o + ", treasuryAdapter=null, detectGPPermissionMode=" + this.p + ", sdkFlags=" + this.q + ", viewVisibilityAnimator=" + com.yandex.plus.home.feature.webviews.internalapi.animation.animator.b.a + ", overriddenTestIds=null, overriddenFlags=null, packageName=" + this.r + ", versionName=" + this.s + ", updateSdkConfigPeriod=" + ((Object) nsa.t(this.t)) + ", updateExperimentsPeriod=" + ((Object) nsa.t(this.u)) + ", timeSource=" + this.v + ", dispatchersProvider=" + this.w + ", testableBreakpoint=null, resourcesProvider=null, logger=" + this.x + ", plusAcqAdapterProvider=" + this.y + ')';
    }
}
