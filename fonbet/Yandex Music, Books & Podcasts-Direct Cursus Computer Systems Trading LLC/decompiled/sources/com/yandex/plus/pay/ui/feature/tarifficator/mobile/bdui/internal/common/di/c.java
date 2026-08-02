package com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di;

import android.content.Context;
import androidx.core.app.q;
import com.yandex.plus.bdui.r;
import com.yandex.plus.home.internal.di.y;
import com.yandex.plus.metrica.utils.z;
import defpackage.cdk;
import defpackage.gdk;
import defpackage.k5r;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c {
    public final gdk A;
    public final com.yandex.plus.pay.internal.g B;
    public final q C;
    public final r a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Context f;
    public final com.yandex.plus.core.strings.a g;
    public final com.yandex.plus.core.config.a h;
    public final com.yandex.plus.domain.auth.impl.i i;
    public final com.yandex.plus.pay.ui.design.api.api.a j;
    public final com.yandex.plus.core.locale.a k;
    public final com.yandex.plus.pay.log.impl.b l;
    public final com.yandex.plus.pay.reporter.api.f m;
    public final com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.e n;
    public final z o;
    public final com.yandex.plus.core.imageloader.b p;
    public final com.yandex.plus.home.plaque.plugin.internal.proxy.a q;
    public final com.yandex.plus.paymentsdk.internal.method.e r;
    public final com.yandex.plus.divkit.api.f s;
    public final Map t;
    public final Map u;
    public final List v;
    public final List w;
    public final y x;
    public final com.yandex.plus.pay.ui.core.internal.di.g y;
    public final cdk z;

    public c(r rVar, String str, String str2, String str3, String str4, Context context, com.yandex.plus.core.strings.a aVar, com.yandex.plus.core.config.a aVar2, com.yandex.plus.domain.auth.impl.i iVar, com.yandex.plus.pay.ui.design.api.api.a aVar3, com.yandex.plus.core.locale.a aVar4, com.yandex.plus.pay.log.impl.b bVar, com.yandex.plus.pay.reporter.api.f fVar, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.e eVar, z zVar, com.yandex.plus.core.imageloader.b bVar2, com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar5, com.yandex.plus.paymentsdk.internal.method.e eVar2, com.yandex.plus.divkit.api.f fVar2, Map map, Map map2, List list, List list2, y yVar, com.yandex.plus.pay.ui.core.internal.di.g gVar, cdk cdkVar, gdk gdkVar, com.yandex.plus.pay.internal.g gVar2, q qVar) {
        rVar.getClass();
        str.getClass();
        str2.getClass();
        context.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        aVar4.getClass();
        bVar.getClass();
        fVar.getClass();
        zVar.getClass();
        bVar2.getClass();
        eVar2.getClass();
        gVar.getClass();
        cdkVar.getClass();
        gdkVar.getClass();
        this.a = rVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = context;
        this.g = aVar;
        this.h = aVar2;
        this.i = iVar;
        this.j = aVar3;
        this.k = aVar4;
        this.l = bVar;
        this.m = fVar;
        this.n = eVar;
        this.o = zVar;
        this.p = bVar2;
        this.q = aVar5;
        this.r = eVar2;
        this.s = fVar2;
        this.t = map;
        this.u = map2;
        this.v = list;
        this.w = list2;
        this.x = yVar;
        this.y = gVar;
        this.z = cdkVar;
        this.A = gdkVar;
        this.B = gVar2;
        this.C = qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.a, cVar.a) && Intrinsics.d(this.b, cVar.b) && Intrinsics.d(this.c, cVar.c) && this.d.equals(cVar.d) && this.e.equals(cVar.e) && Intrinsics.d(this.f, cVar.f) && this.g == cVar.g && this.h == cVar.h && this.i.equals(cVar.i) && Intrinsics.d(this.j, cVar.j) && Intrinsics.d(this.k, cVar.k) && Intrinsics.d(this.l, cVar.l) && Intrinsics.d(this.m, cVar.m) && this.n.equals(cVar.n) && Intrinsics.d(this.o, cVar.o) && Intrinsics.d(this.p, cVar.p) && this.q.equals(cVar.q) && Intrinsics.d(this.r, cVar.r) && Intrinsics.d(this.s, cVar.s) && Intrinsics.d(this.t, cVar.t) && Intrinsics.d(this.u, cVar.u) && Intrinsics.d(this.v, cVar.v) && Intrinsics.d(this.w, cVar.w) && this.x.equals(cVar.x) && Intrinsics.d(this.y, cVar.y) && Intrinsics.d(this.z, cVar.z) && Intrinsics.d(this.A, cVar.A) && this.B.equals(cVar.B) && this.C.equals(cVar.C);
    }

    public final int hashCode() {
        int hashCode = (this.r.hashCode() + ((this.q.hashCode() + ((this.p.hashCode() + ((this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((((this.e.hashCode() + k5r.c(k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31) + 1986582804) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        com.yandex.plus.divkit.api.f fVar = this.s;
        int hashCode2 = (hashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
        Map map = this.t;
        int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        Map map2 = this.u;
        int hashCode4 = (hashCode3 + (map2 == null ? 0 : map2.hashCode())) * 31;
        List list = this.v;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.w;
        return this.C.hashCode() + ((this.B.hashCode() + ((this.A.hashCode() + ((this.z.hashCode() + ((this.y.hashCode() + ((this.x.hashCode() + ((hashCode5 + (list2 != null ? list2.hashCode() : 0)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ExternalModule(engineFactory=" + this.a + ", serviceName=" + this.b + ", serviceChannel=" + this.c + ", clientAppPackage=" + this.d + ", clientAppVersion=" + this.e + ", sdkVersion=110.0.0, context=" + this.f + ", brandType=" + this.g + ", environment=" + this.h + ", authSession=" + this.i + ", designSystem=" + this.j + ", localeProvider=" + this.k + ", logger=" + this.l + ", reporter=" + this.m + ", featureFlags=" + this.n + ", sessionControllerProvider=" + this.o + ", imageLoader=" + this.p + ", stringsProvider=" + this.q + ", paymentMethodsFacade=" + this.r + ", divKitProvider=" + this.s + ", divAdditionalTypefaceProviders=" + this.t + ", customViewAdapterFactories=" + this.u + ", handlerDescriptors=" + this.v + ", analyticsTransportDescriptors=" + this.w + ", urlLauncher=" + this.x + ", sslErrorResolverFactory=" + this.y + ", evgenAnalytics=" + this.z + ", evgenDiagnostic=" + this.A + ", plusPayInternal=" + this.B + ", contentScaleFactorProvider=" + this.C + ')';
    }
}
