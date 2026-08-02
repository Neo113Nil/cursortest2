package defpackage;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.yandex.media.ynison.service.e0;
import com.yandex.passport.api.j2;
import com.yandex.passport.api.k2;
import com.yandex.passport.api.l2;
import com.yandex.passport.api.m2;
import com.yandex.passport.api.n;
import com.yandex.passport.api.n2;
import com.yandex.passport.api.o2;
import com.yandex.passport.api.p2;
import com.yandex.passport.api.q0;
import com.yandex.passport.api.q2;
import com.yandex.passport.api.r2;
import com.yandex.passport.api.t2;
import com.yandex.passport.api.u2;
import com.yandex.passport.internal.account.f;
import com.yandex.passport.internal.autologin.ui.m;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.properties.a0;
import com.yandex.passport.internal.properties.g;
import com.yandex.passport.internal.properties.j0;
import com.yandex.passport.internal.properties.k0;
import com.yandex.passport.internal.properties.l;
import com.yandex.passport.internal.properties.v;
import com.yandex.passport.internal.report.reporters.n1;
import com.yandex.passport.internal.report.reporters.o1;
import com.yandex.passport.internal.report.we;
import com.yandex.passport.internal.ui.bouncer.BouncerActivity;
import com.yandex.passport.internal.ui.bouncer.model.e2;
import com.yandex.passport.internal.ui.bouncer.model.t1;
import com.yandex.passport.internal.ui.bouncer.model.w1;
import com.yandex.passport.internal.ui.bouncer.roundabout.k;
import com.yandex.passport.internal.ui.challenge.delete.x;
import com.yandex.passport.internal.ui.challenge.vpn.q;
import com.yandex.passport.internal.ui.challenge.vpn.w;
import com.yandex.passport.internal.ui.challenge.vpn.y;
import com.yandex.passport.internal.ui.sloth.StandaloneSlothComposeActivity;
import com.yandex.passport.internal.ui.sloth.menu.UserMenuActivity;
import com.yandex.passport.internal.ui.sloth.menu.t;
import com.yandex.passport.internal.ui.sloth.webcard.z;
import com.yandex.passport.sloth.h0;
import com.yandex.passport.sloth.ui.dependencies.p;
import com.yandex.passport.sloth.ui.y1;
import com.yandex.plus.acquisition.sdk.button.section.ui.api.h;
import com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.product.icons.ProductIconView;
import com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.product.icons.ProductIconsLayout;
import com.yandex.plus.bdui.action.i;
import com.yandex.plus.bdui.plus.action.d;
import com.yandex.plus.bdui.plus.action.e;
import com.yandex.plus.bdui.plus.analytics.c;
import com.yandex.plus.log.api.a;
import com.yandex.plus.log.api.b;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.j;
import com.yandex.pulse.metrics.o;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import ru.yandex.music.R;
import ru.yandex.music.catalog.info.FullInfoActivity;
import ru.yandex.music.cover.upload.UploadCoverService;

/* loaded from: classes3.dex */
public final class l1p extends aur implements Function2 {
    public final /* synthetic */ int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1p(Activity activity, y yVar, aqi aqiVar, Continuation continuation) {
        super(2, continuation);
        this.j = 16;
        this.k = activity;
        this.m = yVar;
        this.l = aqiVar;
    }

    private final Object k(Object obj) {
        i iVar = (i) this.m;
        d dVar = (d) this.l;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        e eVar = (e) this.k;
        b bVar = eVar.b;
        a aVar = a.c;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "PlusAuthorizeActionHandler", "handle()");
        }
        com.yandex.plus.bdui.plus.auth.b bVar2 = (com.yandex.plus.bdui.plus.auth.b) ((j) eVar.c).get();
        if (bVar2 != null) {
            if (bVar.b(aVar)) {
                bVar.c(aVar, "PlusAuthorizeActionHandler", hrg.m(bVar2.a, " already authorized", new StringBuilder("handle(); user with userId = ")));
            }
            e.b(eVar, dVar.a, iVar);
        } else {
            if (bVar.b(aVar)) {
                bVar.c(aVar, "PlusAuthorizeActionHandler", "handle(); start authorize");
            }
            ((com.yandex.plus.bdui.plus.auth.a) eVar.d).a((tf6) eVar.e, new com.yandex.passport.internal.ui.sloth.ebs.i(5, eVar, dVar, iVar));
        }
        return Unit.a;
    }

    private final Object l(Object obj) {
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        b bVar = ((com.yandex.plus.bdui.plus.action.i) this.k).c;
        com.yandex.plus.bdui.action.a aVar = (com.yandex.plus.bdui.action.a) this.m;
        i iVar = (i) this.l;
        Map map = iVar.d;
        a aVar2 = a.c;
        if (bVar.b(aVar2)) {
            bVar.c(aVar2, "PlusMultiActionHandler", "handle(); dispatch action " + aVar + " with payload = " + map);
        }
        iVar.a.a.a(aVar, iVar.b, map);
        return Unit.a;
    }

    private final Object n(Object obj) {
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        b bVar = ((c) this.k).b;
        com.yandex.plus.bdui.analytics.c cVar = (com.yandex.plus.bdui.analytics.c) this.m;
        a aVar = a.c;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "PlusAnalyticsSenderImpl", "sendEvent(); event = " + cVar);
        }
        ((com.yandex.plus.bdui.analytics.a) ((arf) this.l).getValue()).a(cVar);
        return Unit.a;
    }

    private final Object o(Object obj) {
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        com.yandex.plus.bdui.plus.scaffold.controller.b bVar = (com.yandex.plus.bdui.plus.scaffold.controller.b) this.k;
        ArrayList arrayList = (ArrayList) this.l;
        ArrayList arrayList2 = (ArrayList) this.m;
        bVar.getClass();
        com.yandex.plus.bdui.plus.scaffold.controller.a aVar = bVar.a;
        new com.yandex.passport.internal.ui.sloth.ebs.i(6, bVar, arrayList, arrayList2).invoke(aVar);
        aVar.requestLayout();
        aVar.invalidate();
        return Unit.a;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new l1p((yoc) this.k, (aqi) this.l, (aqi) this.m, continuation, 0);
            case 1:
                return new l1p((o7r) this.k, (a8r) this.l, (View) this.m, continuation, 1);
            case 2:
                return new l1p((es3) this.k, (kur) this.l, (String) this.m, continuation, 2);
            case 3:
                l1p l1pVar = new l1p((String) this.l, (crs) this.m, continuation, 3);
                l1pVar.k = obj;
                return l1pVar;
            case 4:
                return new l1p((UploadCoverService) this.k, (pot) this.l, this.m, continuation, 4);
            case 5:
                l1p l1pVar2 = new l1p((dcu) this.l, (paw) this.m, continuation, 5);
                l1pVar2.k = obj;
                return l1pVar2;
            case 6:
                return new l1p((String) this.k, (idv) this.l, (Map) this.m, continuation, 6);
            case 7:
                l1p l1pVar3 = new l1p((fk0) this.l, (fk0) this.m, continuation, 7);
                l1pVar3.k = obj;
                return l1pVar3;
            case 8:
                l1p l1pVar4 = new l1p((rxv) this.l, (cyv) this.m, continuation, 8);
                l1pVar4.k = obj;
                return l1pVar4;
            case 9:
                l1p l1pVar5 = new l1p((lyv) this.l, (bzv) this.m, continuation, 9);
                l1pVar5.k = obj;
                return l1pVar5;
            case 10:
                return new l1p((e0) this.k, (xhw) this.l, (String) this.m, continuation, 10);
            case 11:
                return new l1p((bw1) this.k, (g) this.l, (com.yandex.passport.internal.entities.d) this.m, continuation, 11);
            case 12:
                return new l1p((bw1) this.k, (g) this.l, (f) this.m, continuation, 12);
            case 13:
                return new l1p((Bundle) this.k, (l) this.l, (BouncerActivity) this.m, continuation, 13);
            case 14:
                l1p l1pVar6 = new l1p(this.m, (aqi) this.l, continuation, 14);
                l1pVar6.k = obj;
                return l1pVar6;
            case 15:
                l1p l1pVar7 = new l1p((s7h) this.l, (com.yandex.passport.internal.ui.challenge.delete.b) this.m, continuation, 15);
                l1pVar7.k = obj;
                return l1pVar7;
            case 16:
                return new l1p((Activity) this.k, (y) this.m, (aqi) this.l, continuation);
            case 17:
                l1p l1pVar8 = new l1p((xpi) this.l, (WebView) this.m, continuation, 17);
                l1pVar8.k = obj;
                return l1pVar8;
            case 18:
                l1p l1pVar9 = new l1p((StandaloneSlothComposeActivity) this.l, (o1) this.m, continuation, 18);
                l1pVar9.k = obj;
                return l1pVar9;
            case 19:
                l1p l1pVar10 = new l1p((UserMenuActivity) this.l, (j0) this.m, continuation, 19);
                l1pVar10.k = obj;
                return l1pVar10;
            case 20:
                l1p l1pVar11 = new l1p(this.m, (aqi) this.l, continuation, 20);
                l1pVar11.k = obj;
                return l1pVar11;
            case 21:
                return new l1p((com.yandex.passport.internal.ui.social.authenticators.c) this.k, (String) this.l, (String) this.m, continuation, 21);
            case 22:
                l1p l1pVar12 = new l1p((com.yandex.passport.sloth.ui.a) this.l, (y1) this.m, continuation, 22);
                l1pVar12.k = obj;
                return l1pVar12;
            case 23:
                l1p l1pVar13 = new l1p((WebView) this.l, (com.yandex.passport.sloth.ui.a) this.m, continuation, 23);
                l1pVar13.k = obj;
                return l1pVar13;
            case 24:
                l1p l1pVar14 = new l1p((com.yandex.plus.acquisition.adapter.internal.controller.a) this.l, (k) this.m, continuation, 24);
                l1pVar14.k = obj;
                return l1pVar14;
            case 25:
                return new l1p((e) this.k, (d) this.l, (i) this.m, continuation, 25);
            case 26:
                return new l1p((com.yandex.plus.bdui.plus.action.i) this.k, (i) this.l, (com.yandex.plus.bdui.action.a) this.m, continuation, 26);
            case 27:
                return new l1p((c) this.k, (arf) this.l, (com.yandex.plus.bdui.analytics.c) this.m, continuation, 27);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new l1p((com.yandex.plus.bdui.plus.scaffold.controller.b) this.k, (ArrayList) this.l, (ArrayList) this.m, continuation, 28);
            default:
                return new l1p((com.yandex.plus.core.benchmark.c) this.k, (com.yandex.plus.core.benchmark.l) this.l, (Map) this.m, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
        }
        return ((l1p) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0779  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0785  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0645  */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        byte[] N;
        boolean z;
        n7b n7bVar;
        l2 k2Var;
        u2 u2Var;
        o2 m2Var;
        Object t7oVar;
        Object obj2;
        Throwable a;
        Object obj3;
        com.yandex.plus.acquisition.adapter.internal.controller.a aVar;
        int i;
        int i2;
        int i3;
        int i4 = this.j;
        int i5 = 26;
        int i6 = 2;
        int i7 = 5;
        int i8 = 12;
        int i9 = 6;
        Throwable th = null;
        Object obj4 = this.m;
        Object obj5 = this.l;
        switch (i4) {
            case 0:
                aqi aqiVar = (aqi) obj4;
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                if (((Boolean) ((aqi) obj5).getValue()).booleanValue() && ((Boolean) aqiVar.getValue()).booleanValue()) {
                    yoc.b((yoc) this.k);
                    aqiVar.setValue(Boolean.FALSE);
                }
                return Unit.a;
            case 1:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                ((o7r) this.k).a.O();
                if (((a8r) obj5).b) {
                    ((View) obj4).performHapticFeedback(6);
                }
                return Unit.a;
            case 2:
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                es3 es3Var = (es3) this.k;
                kur kurVar = (kur) obj5;
                if (es3Var != null) {
                    l3o execute = es3Var.execute();
                    if (execute.b()) {
                        o3o o3oVar = execute.g;
                        if (o3oVar != null) {
                            N = o3oVar.a();
                        } else {
                            kac.f("No response body received");
                        }
                    } else {
                        kac.i(execute.d, "Server response code ");
                    }
                    return null;
                }
                try {
                    InputStream open = kurVar.a.getAssets().open(StringsKt.Y((String) obj4, "file:///android_asset/"));
                    try {
                        N = vnj.N(open);
                        open.close();
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            yd5.q(open, th2);
                            throw th3;
                        }
                    }
                } catch (IOException e) {
                    throw new IOException("File not found", e);
                }
                return y5g.Z(new ByteArrayInputStream(N));
            case 3:
                lpi lpiVar = (lpi) this.k;
                nm6 nm6Var4 = nm6.a;
                qgg.h0(obj);
                String str = (String) obj5;
                if (!Intrinsics.d(ec7.a(lpiVar, str), Boolean.TRUE)) {
                    crs crsVar = (crs) obj4;
                    crsVar.d.logEvent(crsVar.c, str, null);
                    ec7.d(lpiVar, str, true);
                }
                return Unit.a;
            case 4:
                Object obj6 = obj4;
                nm6 nm6Var5 = nm6.a;
                qgg.h0(obj);
                UploadCoverService uploadCoverService = (UploadCoverService) this.k;
                pot potVar = (pot) obj5;
                ArrayList arrayList = uploadCoverService.d;
                arrayList.remove(potVar);
                uploadCoverService.c();
                Set<lxc> set = (Set) uploadCoverService.e.get(new Pair(potVar.a, potVar.b));
                if (set != null) {
                    for (lxc lxcVar : set) {
                        iz7 iz7Var = lxcVar.a;
                        r7o r7oVar = z7o.b;
                        Object obj7 = obj6;
                        if (!(obj7 instanceof t7o)) {
                            iz7.d(iz7Var, (cvl) obj7);
                        }
                        if (z7o.a(obj7) == null || (n7bVar = (n7b) iz7Var.b) == null) {
                            z = false;
                        } else {
                            z = false;
                            hag.x((FullInfoActivity) n7bVar.a, R.string.playlist_upload_cover_error_message, 0);
                        }
                        iz7 iz7Var2 = lxcVar.a;
                        iz7Var2.q(z, ((z66) ((jyr) iz7Var2.f).getValue()).g());
                        obj6 = obj7;
                    }
                }
                if (arrayList.isEmpty()) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        uploadCoverService.stopForeground(true);
                    } else {
                        NotificationManager g = l1b.g(uploadCoverService);
                        if (g != null) {
                            try {
                                g.cancel(5);
                            } catch (Throwable th4) {
                                if (!c9g.J(th4)) {
                                    throw th4;
                                }
                                ssg.a(6, null, "Dead system raise", th4);
                            }
                        }
                    }
                    uploadCoverService.stopSelf();
                }
                return Unit.a;
            case 5:
                jtm jtmVar = (jtm) this.k;
                nm6 nm6Var6 = nm6.a;
                qgg.h0(obj);
                ((paw) obj4).I(new hau((dcu) obj5, jtmVar));
                return Unit.a;
            case 6:
                nm6 nm6Var7 = nm6.a;
                qgg.h0(obj);
                String str2 = (String) this.k;
                idv idvVar = (idv) obj5;
                Continuation continuation = null;
                if (StringsKt.U(str2)) {
                    x97.y(idvVar.a, null, null, new zts(idvVar, continuation, i5), 3);
                } else {
                    Map map = (Map) obj4;
                    idvVar.getClass();
                    map.getClass();
                    x97.y(idvVar.a, null, null, new h0t(idvVar, str2, map, continuation, 23), 3);
                }
                return Unit.a;
            case 7:
                mm6 mm6Var = (mm6) this.k;
                nm6 nm6Var8 = nm6.a;
                qgg.h0(obj);
                Continuation continuation2 = null;
                x97.y(mm6Var, null, null, new v41(i7, (fk0) obj5, continuation2), 3);
                x97.y(mm6Var, null, null, new v41(i9, (fk0) obj4, continuation2), 3);
                return Unit.a;
            case 8:
                mm6 mm6Var2 = (mm6) this.k;
                nm6 nm6Var9 = nm6.a;
                qgg.h0(obj);
                rxv rxvVar = (rxv) obj5;
                cyv cyvVar = (cyv) obj4;
                ox6.B(szf.s0(new keh(rxvVar, 3)), mm6Var2, new uxv(cyvVar, 1));
                ox6.B(szf.s0(new keh(rxvVar, 4)), mm6Var2, new uxv(cyvVar, 2));
                ox6.B(szf.s0(new keh(rxvVar, 5)), mm6Var2, new uxv(cyvVar, 3));
                ox6.B(szf.s0(new keh(rxvVar, 6)), mm6Var2, new uxv(cyvVar, 4));
                ox6.B(szf.s0(new keh(rxvVar, 7)), mm6Var2, new uxv(cyvVar, 0));
                return Unit.a;
            case 9:
                mm6 mm6Var3 = (mm6) this.k;
                nm6 nm6Var10 = nm6.a;
                qgg.h0(obj);
                lyv lyvVar = (lyv) obj5;
                Continuation continuation3 = null;
                x97.y(mm6Var3, null, null, new y6v(lyvVar, (bzv) obj4, continuation3, 11), 3);
                x97.y(mm6Var3, null, null, new kyv(lyvVar, continuation3, 0), 3);
                return Unit.a;
            case 10:
                nm6 nm6Var11 = nm6.a;
                qgg.h0(obj);
                b5n s = e0.s((e0) this.k);
                xhw xhwVar = (xhw) obj5;
                String str3 = xhw.w;
                dlr h = dlr.h(xhwVar.f());
                s.d();
                e0.g((e0) s.b, h);
                e0 e0Var = (e0) s.b();
                ssg.a(3, xhw.w, "<-- optimistic response: ".concat((String) obj4), null);
                ghw ghwVar = xhwVar.o;
                if (ghwVar != null) {
                    xdr xdrVar = ghwVar.v;
                    Boolean bool = Boolean.TRUE;
                    xdrVar.getClass();
                    xdrVar.m(null, bool);
                }
                xhw.d(xhwVar, e0Var, new cer(new orw(e0Var, nrw.c)));
                return Unit.a;
            case 11:
                nm6 nm6Var12 = nm6.a;
                qgg.h0(obj);
                ((zh) ((bw1) this.k).j).a(new m((g) obj5, ((com.yandex.passport.internal.entities.d) obj4).a));
                return Unit.a;
            case 12:
                nm6 nm6Var13 = nm6.a;
                qgg.h0(obj);
                ((zh) ((bw1) this.k).j).a(new m((g) obj5, (f) obj4));
                return Unit.a;
            case 13:
                BouncerActivity bouncerActivity = (BouncerActivity) obj4;
                l lVar = (l) obj5;
                a0 a0Var = lVar.B;
                nm6 nm6Var14 = nm6.a;
                qgg.h0(obj);
                if (((Bundle) this.k) != null || a0Var == null) {
                    com.yandex.passport.internal.ui.bouncer.c cVar = bouncerActivity.b;
                    if (cVar == null) {
                        Intrinsics.j("component");
                        throw null;
                    }
                    cVar.getWishSource().a(new w1(lVar));
                } else {
                    com.yandex.passport.internal.ui.bouncer.c cVar2 = bouncerActivity.b;
                    if (cVar2 == null) {
                        Intrinsics.j("component");
                        throw null;
                    }
                    cVar2.getWishSource().a(new e2(com.yandex.plus.pay.ui.core.b.L(a0Var.a), lVar));
                }
                return Unit.a;
            case 14:
                mm6 mm6Var4 = (mm6) this.k;
                nm6 nm6Var15 = nm6.a;
                qgg.h0(obj);
                zsd.r0(mm6Var4, new ub7(i8, zsd.b0(((t1) obj4).b.a), new vnf((aqi) obj5, null)));
                return Unit.a;
            case 15:
                x xVar = (x) this.k;
                nm6 nm6Var16 = nm6.a;
                qgg.h0(obj);
                if (xVar != null) {
                    s7h s7hVar = (s7h) obj5;
                    com.yandex.passport.common.core.f fVar = xVar.a;
                    boolean z2 = xVar.b;
                    com.yandex.passport.common.ui.progress.g gVar = ((com.yandex.passport.internal.ui.challenge.delete.b) obj4).getProperties().b;
                    com.yandex.passport.internal.properties.k kVar = new com.yandex.passport.internal.properties.k();
                    kVar.b(null);
                    com.yandex.passport.internal.entities.j jVar = new com.yandex.passport.internal.entities.j();
                    jVar.N(com.yandex.plus.core.network.api.utils.a.O(fVar.a));
                    if (z2) {
                        jVar.y(n.PHONISH);
                    }
                    kVar.b = jVar.l();
                    q0 q0Var = q0.a;
                    com.yandex.passport.api.e eVar = com.yandex.passport.api.e.a;
                    com.yandex.passport.common.ui.progress.c cVar3 = gVar.a;
                    if (cVar3 instanceof com.yandex.passport.common.ui.progress.a) {
                        k2Var = new j2(((com.yandex.passport.common.ui.progress.a) cVar3).a);
                    } else if (cVar3 instanceof com.yandex.passport.common.ui.progress.b) {
                        k2Var = new k2(((com.yandex.passport.common.ui.progress.b) cVar3).a);
                    } else {
                        b6e.s();
                    }
                    com.yandex.passport.common.ui.progress.n nVar = gVar.b;
                    if (nVar instanceof com.yandex.passport.common.ui.progress.k) {
                        u2Var = q2.a;
                    } else if (nVar instanceof com.yandex.passport.common.ui.progress.j) {
                        com.yandex.passport.common.ui.progress.j jVar2 = (com.yandex.passport.common.ui.progress.j) nVar;
                        u2Var = new p2(jVar2.a, jVar2.b);
                    } else if (nVar instanceof com.yandex.passport.common.ui.progress.l) {
                        u2Var = r2.a;
                    } else if (nVar instanceof com.yandex.passport.common.ui.progress.m) {
                        u2Var = t2.a;
                    } else {
                        b6e.s();
                    }
                    com.yandex.passport.common.ui.progress.f fVar2 = gVar.c;
                    if (fVar2 instanceof com.yandex.passport.common.ui.progress.e) {
                        m2Var = n2.a;
                    } else if (fVar2 instanceof com.yandex.passport.common.ui.progress.d) {
                        m2Var = new m2(((com.yandex.passport.common.ui.progress.d) fVar2).a);
                    } else {
                        b6e.s();
                    }
                    kVar.o = new k0(false, false, false, q0Var, true, null, null, null, null, false, false, null, new com.yandex.passport.internal.properties.a(eVar, com.yandex.passport.api.c.a, true, false), new v(k2Var, u2Var, m2Var, gVar.d), false, true);
                    kVar.h = com.yandex.plus.pay.ui.core.b.J(fVar);
                    s7hVar.a(com.yandex.plus.pay.ui.core.b.t(com.yandex.plus.pay.ui.core.b.t(kVar)));
                    return Unit.a;
                }
                b6e.s();
                return null;
            case 16:
                nm6 nm6Var17 = nm6.a;
                qgg.h0(obj);
                if (!((q) ((aqi) obj5).getValue()).d) {
                    return Unit.a;
                }
                Activity activity = (Activity) this.k;
                if (activity != null) {
                    com.yandex.passport.internal.util.a.a(activity, new Intent("android.settings.SETTINGS"));
                }
                ((y) obj4).a(w.a);
                return Unit.a;
            case 17:
                mm6 mm6Var5 = (mm6) this.k;
                nm6 nm6Var18 = nm6.a;
                qgg.h0(obj);
                zsd.r0(mm6Var5, new ub7(i8, (xpi) obj5, new com.yandex.passport.internal.storage.a((WebView) obj4, null, 14)));
                return Unit.a;
            case 18:
                StandaloneSlothComposeActivity standaloneSlothComposeActivity = (StandaloneSlothComposeActivity) obj5;
                h0 h0Var = (h0) this.k;
                nm6 nm6Var19 = nm6.a;
                qgg.h0(obj);
                if (Intrinsics.d(h0Var, com.yandex.passport.sloth.x.a)) {
                    standaloneSlothComposeActivity.setResult(666);
                    standaloneSlothComposeActivity.finish();
                } else {
                    ((o1) obj4).u(h0Var.toString(), n1.STANDALONE);
                }
                return Unit.a;
            case 19:
                mm6 mm6Var6 = (mm6) this.k;
                nm6 nm6Var20 = nm6.a;
                qgg.h0(obj);
                UserMenuActivity userMenuActivity = (UserMenuActivity) obj5;
                ybf ybfVar = userMenuActivity.c;
                PassportProcessGlobalComponent passportProcessGlobalComponent = userMenuActivity.a;
                Continuation continuation4 = null;
                if (passportProcessGlobalComponent == null) {
                    Intrinsics.j("globalComponent");
                    throw null;
                }
                int i10 = 3;
                x97.y(mm6Var6, null, null, new we(userMenuActivity, (j0) obj4, passportProcessGlobalComponent.getCurrentAccountManager().a(), continuation4, 10), 3);
                PassportProcessGlobalComponent passportProcessGlobalComponent2 = userMenuActivity.a;
                if (passportProcessGlobalComponent2 == null) {
                    Intrinsics.j("globalComponent");
                    throw null;
                }
                o1 webAmReporter = passportProcessGlobalComponent2.getWebAmReporter();
                x97.y(gld.e(getContext()), null, null, new com.yandex.passport.internal.ui.sloth.q(((t) ybfVar.getValue()).k, continuation4, webAmReporter, i6), 3);
                x97.y(gld.e(getContext()), null, null, new we(((t) ybfVar.getValue()).l, continuation4, userMenuActivity, webAmReporter, 11), 3);
                return x97.y(gld.e(getContext()), null, null, new com.yandex.passport.internal.ui.sloth.q(((t) ybfVar.getValue()).m, continuation4, userMenuActivity, i10), 3);
            case 20:
                com.yandex.passport.internal.ui.sloth.webcard.a0 a0Var2 = (com.yandex.passport.internal.ui.sloth.webcard.a0) this.k;
                nm6 nm6Var21 = nm6.a;
                qgg.h0(obj);
                if (a0Var2 instanceof com.yandex.passport.internal.ui.sloth.webcard.y) {
                    ((Function1) obj4).invoke(((com.yandex.passport.internal.ui.sloth.webcard.y) a0Var2).a);
                } else {
                    if (!(a0Var2 instanceof z)) {
                        b6e.s();
                        return null;
                    }
                    ((aqi) obj5).setValue(((z) a0Var2).a);
                }
                return Unit.a;
            case 21:
                nm6 nm6Var22 = nm6.a;
                qgg.h0(obj);
                com.yandex.passport.internal.ui.social.authenticators.c cVar4 = (com.yandex.passport.internal.ui.social.authenticators.c) this.k;
                String str4 = (String) obj5;
                String str5 = (String) obj4;
                try {
                    r7o r7oVar2 = z7o.b;
                    com.yandex.passport.internal.account.d dVar = cVar4.x;
                    com.yandex.passport.internal.a0 a0Var3 = cVar4.l;
                    obj2 = dVar.b(com.yandex.plus.core.network.api.utils.a.L(cVar4.k.d.a), str4, str5, a0Var3.d(), a0Var3.c);
                } catch (wis e2) {
                    r7o r7oVar3 = z7o.b;
                    t7oVar = new t7o(e2);
                    obj2 = t7oVar;
                    if (!(obj2 instanceof t7o)) {
                    }
                    a = z7o.a(obj2);
                    if (a != null) {
                    }
                    return Unit.a;
                } catch (CancellationException e3) {
                    throw e3;
                } catch (Throwable th5) {
                    r7o r7oVar4 = z7o.b;
                    t7oVar = new t7o(th5);
                    obj2 = t7oVar;
                    if (!(obj2 instanceof t7o)) {
                    }
                    a = z7o.a(obj2);
                    if (a != null) {
                    }
                    return Unit.a;
                }
                if (!(obj2 instanceof t7o)) {
                    cVar4.O((com.yandex.passport.internal.l) obj2);
                }
                a = z7o.a(obj2);
                if (a != null) {
                    cVar4.M(a);
                }
                return Unit.a;
            case 22:
                mm6 mm6Var7 = (mm6) this.k;
                nm6 nm6Var23 = nm6.a;
                qgg.h0(obj);
                com.yandex.passport.sloth.ui.l slothNetworkStatus = ((com.yandex.passport.sloth.ui.a) obj5).a.getSlothNetworkStatus();
                a4g.s(slothNetworkStatus);
                zsd.r0(mm6Var7, new ub7(i8, ((com.yandex.passport.internal.sloth.n) slothNetworkStatus).a, new com.yandex.passport.sloth.ui.q((y1) obj4, null, 0)));
                return Unit.a;
            case 23:
                WebView webView = (WebView) obj5;
                com.yandex.passport.sloth.ui.n2 n2Var = (com.yandex.passport.sloth.ui.n2) this.k;
                nm6 nm6Var24 = nm6.a;
                qgg.h0(obj);
                if (n2Var instanceof com.yandex.passport.sloth.ui.m2) {
                    webView.reload();
                } else if (n2Var instanceof com.yandex.passport.sloth.ui.l2) {
                    String str6 = ((com.yandex.passport.sloth.ui.l2) n2Var).a;
                    String m0 = StringsKt.m0('?', StringsKt.k0(str6, "https://localhost/", ""), "");
                    if (StringsKt.U(m0)) {
                        p slothWebViewSettings = ((com.yandex.passport.sloth.ui.a) obj4).a.getSlothWebViewSettings();
                        a4g.s(slothWebViewSettings);
                        webView.loadUrl(str6, ((com.yandex.passport.internal.ui.sloth.j) slothWebViewSettings).a);
                    } else {
                        InputStream open2 = webView.getContext().getAssets().open("webam/".concat(m0));
                        open2.getClass();
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open2, Charsets.UTF_8), RemoteCameraConfig.Notification.ID);
                        try {
                            String F = t7g.F(bufferedReader);
                            bufferedReader.close();
                            ((WebView) obj5).loadDataWithBaseURL(str6, F, "text/html", "UTF-8", "");
                        } catch (Throwable th6) {
                            try {
                                throw th6;
                            } catch (Throwable th7) {
                                yd5.q(bufferedReader, th6);
                                throw th7;
                            }
                        }
                    }
                } else {
                    if (!(n2Var instanceof com.yandex.passport.sloth.ui.k2)) {
                        b6e.s();
                        return null;
                    }
                    webView.evaluateJavascript(((com.yandex.passport.sloth.ui.k2) n2Var).a, null);
                }
                return Unit.a;
            case 24:
                h hVar = (h) this.k;
                nm6 nm6Var25 = nm6.a;
                qgg.h0(obj);
                com.yandex.plus.acquisition.adapter.internal.controller.a aVar2 = (com.yandex.plus.acquisition.adapter.internal.controller.a) obj5;
                com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.controllers.a aVar3 = (com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.controllers.a) aVar2.d.getValue();
                com.yandex.plus.paywall.sdk.analytics.impl.acquisition.analytics.c cVar5 = aVar3.b;
                com.yandex.plus.acquisition.sdk.pay.impl.b bVar = aVar3.c;
                com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.f fVar3 = aVar3.a;
                hVar.getClass();
                mw3 mw3Var = aVar3.m;
                if (mw3Var != null) {
                    mw3Var.g();
                }
                aVar3.m = null;
                if (hVar instanceof com.yandex.plus.acquisition.sdk.button.section.ui.api.c) {
                    com.yandex.plus.acquisition.sdk.button.section.ui.api.c cVar6 = (com.yandex.plus.acquisition.sdk.button.section.ui.api.c) hVar;
                    fVar3.getView().setVisibility(0);
                    fVar3.getContentContainer().setVisibility(8);
                    fVar3.getPurchaseButton().getView().setVisibility(8);
                    fVar3.getLegalsTextView().setVisibility(8);
                    fVar3.getProgressBar().setVisibility(0);
                    String str7 = cVar6.a;
                    String str8 = cVar6.b;
                    cVar5.getClass();
                    str7.getClass();
                    str8.getClass();
                    com.yandex.plus.paywall.sdk.analytics.impl.evgen.analytics.a aVar4 = cVar5.a;
                    List c = t75.c(str8);
                    aVar4.getClass();
                    c.getClass();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put(Constants.KEY_PAGE, str7);
                    linkedHashMap.put("places", c);
                    linkedHashMap.put("_meta", com.yandex.plus.paywall.sdk.analytics.impl.evgen.analytics.a.a(new HashMap()));
                    aVar4.b("OfferSection.Loading", linkedHashMap);
                } else {
                    if (!(hVar instanceof com.yandex.plus.acquisition.sdk.button.section.ui.api.e)) {
                        if (hVar instanceof com.yandex.plus.acquisition.sdk.button.section.ui.api.f) {
                            com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.controllers.success.d dVar2 = new com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.controllers.success.d(fVar3, aVar3.b, bVar, aVar3.l, aVar3.f, aVar3.g, aVar3.h);
                            com.yandex.plus.acquisition.sdk.button.section.ui.api.f fVar4 = (com.yandex.plus.acquisition.sdk.button.section.ui.api.f) hVar;
                            com.yandex.plus.acquisition.sdk.button.section.ui.api.a aVar5 = fVar4.b;
                            Context context = fVar3.getView().getContext();
                            List h2 = u75.h(aVar5, fVar4.c);
                            context.getClass();
                            boolean u = com.yandex.passport.internal.ui.a.u(aVar5);
                            dVar2.h.getClass();
                            com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.radio.group.b bVar2 = new com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.radio.group.b(context, null, 0, 0, 14, null);
                            Context context2 = context;
                            if (u) {
                                Context context3 = bVar2.getGuideline().getContext();
                                context3.getClass();
                                i2 = com.yandex.plus.home.common.utils.a.d(context3, R.dimen.acquisition_sdk_dimension_size_100);
                            } else {
                                i2 = 0;
                            }
                            bVar2.getGuideline().setGuidelineBegin(i2);
                            List list = h2;
                            ArrayList arrayList2 = new ArrayList(v75.o(list, 10));
                            Iterator it = list.iterator();
                            int i11 = 0;
                            while (it.hasNext()) {
                                Object next = it.next();
                                int i12 = i11 + 1;
                                Throwable th8 = th;
                                if (i11 < 0) {
                                    u75.n();
                                    throw th8;
                                }
                                com.yandex.plus.acquisition.sdk.button.section.ui.api.a aVar6 = (com.yandex.plus.acquisition.sdk.button.section.ui.api.a) next;
                                com.yandex.plus.acquisition.sdk.button.section.ui.api.a aVar7 = aVar5;
                                dVar2.k.put(Integer.valueOf(i11), aVar6);
                                evw evwVar = new evw(0, dVar2, com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.controllers.success.d.class, "expand", "expand()V", 0, 25);
                                com.yandex.passport.common.network.n nVar2 = dVar2.j;
                                nVar2.getClass();
                                aVar6.getClass();
                                List list2 = list;
                                com.yandex.plus.acquisition.sdk.pay.common.api.j jVar3 = aVar6.a.g;
                                Context context4 = context2;
                                Iterator it2 = it;
                                String str9 = jVar3.a;
                                com.yandex.plus.core.strings.a aVar8 = (com.yandex.plus.core.strings.a) nVar2.c;
                                Object obj8 = obj4;
                                com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.product.texts.a aVar9 = new com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.product.texts.a(str9, aVar8, jVar3.d, jVar3.e);
                                com.yandex.plus.acquisition.adapter.internal.controller.a aVar10 = aVar2;
                                com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.product.texts.expand.a aVar11 = new com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.product.texts.expand.a(new com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.product.texts.b(jVar3.a, aVar8, jVar3.f), (com.yandex.plus.resources.core.c) nVar2.b, new xal(21, evwVar));
                                String str10 = jVar3.j;
                                String str11 = str10;
                                if (str10 == null || i11 != 0) {
                                    str11 = th8;
                                }
                                String str12 = (String) jVar3.m.getValue();
                                String str13 = str12;
                                if (str12 == null || i11 != 0) {
                                    str13 = th8;
                                }
                                arrayList2.add(new com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.radio.button.a(aVar9, aVar11, new com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.badges.a(str11, str13), com.yandex.passport.internal.ui.a.u(aVar6) && i11 == 0));
                                i11 = i12;
                                th = th8;
                                aVar5 = aVar7;
                                list = list2;
                                context2 = context4;
                                it = it2;
                                obj4 = obj8;
                                aVar2 = aVar10;
                            }
                            com.yandex.plus.acquisition.sdk.button.section.ui.api.a aVar12 = aVar5;
                            List list3 = list;
                            Context context5 = context2;
                            obj3 = obj4;
                            aVar = aVar2;
                            com.yandex.passport.internal.flags.experiments.p pVar = new com.yandex.passport.internal.flags.experiments.p(bVar2, dVar2.i);
                            com.yandex.passport.sloth.ui.c cVar7 = new com.yandex.passport.sloth.ui.c(3, dVar2);
                            Context context6 = bVar2.getContainer().getContext();
                            pVar.d = th;
                            bVar2.getRadioButtonsContainer().removeAllViews();
                            Iterator it3 = arrayList2.iterator();
                            int i13 = 0;
                            while (it3.hasNext()) {
                                Object next2 = it3.next();
                                int i14 = i13 + 1;
                                if (i13 < 0) {
                                    u75.n();
                                    throw null;
                                }
                                com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.radio.button.a aVar13 = (com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.radio.button.a) next2;
                                com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a aVar14 = (com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a) pVar.c;
                                context6.getClass();
                                rt5 rt5Var = new rt5(pVar, i13, aVar13, cVar7);
                                aVar14.getClass();
                                aVar13.getClass();
                                com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.radio.button.c cVar8 = new com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.radio.button.c(context6, null, 0, 0, 14, null);
                                cVar8.setOnTouchListener(new m2e(3, rt5Var, cVar8));
                                com.yandex.plus.pay.ui.core.b.D(cVar8.getProductTexts(), aVar13.a);
                                com.yandex.plus.core.network.api.utils.a.D(cVar8.getBadges(), aVar13.c);
                                if (aVar13.d) {
                                    Context context7 = cVar8.getGuideline().getContext();
                                    context7.getClass();
                                    i3 = com.yandex.plus.home.common.utils.a.d(context7, R.dimen.acquisition_sdk_dimension_size_100);
                                } else {
                                    i3 = 0;
                                }
                                cVar8.getGuideline().setGuidelineBegin(i3);
                                if (i13 == 0) {
                                    pVar.u(i13, cVar8, aVar13, cVar7);
                                }
                                bVar2.getRadioButtonsContainer().addView(cVar8.getView(), i13);
                                i13 = i14;
                            }
                            new com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.animators.c(fVar3, bVar2);
                            dVar2.e = new n20();
                            fVar3.getContentContainer().addView(bVar2.getContainer());
                            if (com.yandex.passport.internal.ui.a.u(aVar12)) {
                                dVar2.d(context5.getResources().getDimensionPixelSize(R.dimen.acquisition_sdk_dimension_size_100));
                            } else {
                                dVar2.d(context5.getResources().getDimensionPixelSize(R.dimen.acquisition_sdk_dimension_size_200));
                            }
                            dVar2.c();
                            ((com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.f) dVar2.a).getLegalsTextView().setTextAppearance(((com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.controllers.success.a) ((jyr) dVar2.g).getValue()).c);
                            dVar2.e();
                            Iterator it4 = list3.iterator();
                            while (it4.hasNext()) {
                                dVar2.h(((com.yandex.plus.acquisition.sdk.button.section.ui.api.a) it4.next()).a, fVar4.a);
                            }
                            aVar3.m = dVar2;
                        } else {
                            obj3 = obj4;
                            aVar = aVar2;
                            if (hVar instanceof com.yandex.plus.acquisition.sdk.button.section.ui.api.d) {
                                com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.controllers.success.b bVar3 = new com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.controllers.success.b(fVar3, aVar3.b, bVar, aVar3.l, aVar3.i, aVar3.j, aVar3.k);
                                com.yandex.plus.acquisition.sdk.button.section.ui.api.d dVar3 = (com.yandex.plus.acquisition.sdk.button.section.ui.api.d) hVar;
                                Context context8 = fVar3.getView().getContext();
                                com.yandex.plus.acquisition.sdk.button.section.ui.api.a aVar15 = dVar3.b;
                                com.yandex.plus.acquisition.sdk.pay.common.api.k kVar2 = aVar15.a;
                                context8.getClass();
                                com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.offer.b bVar4 = bVar3.i;
                                bVar4.getClass();
                                com.yandex.plus.core.strings.a aVar16 = bVar4.a;
                                com.yandex.plus.acquisition.sdk.pay.common.api.k kVar3 = aVar15.a;
                                com.yandex.plus.acquisition.sdk.pay.common.api.j jVar4 = kVar3.g;
                                com.yandex.plus.acquisition.sdk.pay.common.api.i e4 = jVar4.e();
                                com.yandex.plus.acquisition.sdk.pay.common.api.i d = jVar4.d();
                                Drawable drawable = aVar15.c;
                                com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.product.texts.a aVar17 = new com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.product.texts.a(e4.a, aVar16, e4.b, e4.c);
                                Drawable drawable2 = aVar15.d;
                                com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.product.texts.a aVar18 = new com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.product.texts.a(d.a, aVar16, d.b, d.c);
                                com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.product.texts.b bVar5 = new com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.product.texts.b(jVar4.a, aVar16, jVar4.f);
                                List h3 = u75.h(drawable, drawable2);
                                h3.getClass();
                                bVar3.h.getClass();
                                int i15 = 14;
                                DefaultConstructorMarker defaultConstructorMarker = null;
                                com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.b bVar6 = new com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.b(context8, null, 0, 0, i15, defaultConstructorMarker);
                                com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.c cVar9 = new com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.c(context8, null, 0, 0, i15, defaultConstructorMarker);
                                com.yandex.plus.pay.ui.core.b.D(cVar9.getProductTexts(), aVar17);
                                if (drawable != null) {
                                    cVar9.getProductIconView().setImageDrawable(drawable);
                                    cVar9.getProductIconView().setVisibility(0);
                                } else {
                                    cVar9.getProductIconView().setVisibility(8);
                                }
                                View view = cVar9.getView();
                                com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.c cVar10 = new com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.c(context8, null, 0, 0, 14, null);
                                com.yandex.plus.pay.ui.core.b.D(cVar10.getProductTexts(), aVar18);
                                if (drawable2 != null) {
                                    cVar10.getProductIconView().setImageDrawable(drawable2);
                                    i = 0;
                                    cVar10.getProductIconView().setVisibility(0);
                                } else {
                                    i = 0;
                                    cVar10.getProductIconView().setVisibility(8);
                                }
                                View view2 = cVar10.getView();
                                bVar6.getCompositeProductsContainer().addView(view, i);
                                bVar6.getCompositeProductsContainer().addView(view2, 1);
                                com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.offer.a compositeOffer = bVar6.getCompositeOffer();
                                compositeOffer.getClass();
                                com.yandex.plus.pay.ui.core.b.D(compositeOffer.getProductTexts(), bVar5);
                                int size = h3.size() - 1;
                                if (size >= 0) {
                                    int i16 = 0;
                                    while (true) {
                                        Drawable drawable3 = (Drawable) h3.get(i16);
                                        if (drawable3 != null) {
                                            Context context9 = compositeOffer.getView().getContext();
                                            ProductIconsLayout productIconsContainer = compositeOffer.getProductIconsContainer();
                                            context9.getClass();
                                            ProductIconView productIconView = new ProductIconView(context9, null, 0, 6, null);
                                            productIconView.setBackgroundDrawable(y2x.w(context9, R.drawable.acquisition_sdk_bg_product_icon));
                                            productIconView.setImageDrawable(drawable3);
                                            productIconsContainer.addView(productIconView);
                                        }
                                        if (i16 != size) {
                                            i16++;
                                        }
                                    }
                                }
                                new com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.animators.a(fVar3, bVar6, kVar3.f);
                                fVar3.getContentContainer().addView(bVar6.getContainer());
                                TextView readMoreTextView = fVar3.getPurchaseButton().getReadMoreTextView();
                                com.yandex.plus.resources.core.c cVar11 = bVar3.j;
                                cVar11.getClass();
                                String string = context8.getString(cVar11.a(R.string.PlusAcquisition_ButtonSection_Composite_TextForExpand));
                                string.getClass();
                                readMoreTextView.setText(string);
                                bVar3.b(aVar15);
                                bVar3.d(context8.getResources().getDimensionPixelSize(R.dimen.acquisition_sdk_dimension_size_200));
                                bVar3.c();
                                ((com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.f) bVar3.a).getLegalsTextView().setTextAppearance(((com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.controllers.success.a) ((jyr) bVar3.g).getValue()).c);
                                bVar3.e();
                                bVar3.h(kVar2, dVar3.a);
                                bVar3.f = aVar15;
                                aVar3.m = bVar3;
                                hVar = hVar;
                            } else {
                                if (!(hVar instanceof com.yandex.plus.acquisition.sdk.button.section.ui.api.b)) {
                                    b6e.s();
                                    return null;
                                }
                                com.yandex.plus.acquisition.sdk.button.section.ui.api.b bVar7 = (com.yandex.plus.acquisition.sdk.button.section.ui.api.b) hVar;
                                fVar3.getView().setVisibility(8);
                                String str14 = bVar7.a;
                                String str15 = bVar7.b;
                                String message = bVar7.c.getMessage();
                                cVar5.getClass();
                                str14.getClass();
                                str15.getClass();
                                com.yandex.plus.paywall.sdk.analytics.impl.evgen.analytics.a aVar19 = cVar5.a;
                                List c2 = t75.c(str15);
                                if (message == null) {
                                    message = "no_value";
                                }
                                aVar19.getClass();
                                c2.getClass();
                                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                linkedHashMap2.put(Constants.KEY_PAGE, str14);
                                linkedHashMap2.put("places", c2);
                                linkedHashMap2.put(Constants.KEY_MESSAGE, message);
                                linkedHashMap2.put("_meta", com.yandex.plus.paywall.sdk.analytics.impl.evgen.analytics.a.a(new HashMap()));
                                aVar19.b("OfferSection.Error", linkedHashMap2);
                            }
                        }
                        if (hVar instanceof com.yandex.plus.acquisition.sdk.button.section.ui.api.g) {
                            ((k) obj3).invoke(((com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.f) aVar.c.getValue()).getView());
                        }
                        return Unit.a;
                    }
                    com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.controllers.success.c cVar12 = new com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.controllers.success.c(fVar3, aVar3.b, bVar, aVar3.l, aVar3.d, aVar3.e);
                    com.yandex.plus.acquisition.sdk.button.section.ui.api.e eVar2 = (com.yandex.plus.acquisition.sdk.button.section.ui.api.e) hVar;
                    Context context10 = fVar3.getView().getContext();
                    com.yandex.plus.acquisition.sdk.button.section.ui.api.a aVar20 = eVar2.b;
                    com.yandex.plus.acquisition.sdk.pay.common.api.k kVar4 = aVar20.a;
                    FrameLayout contentContainer = fVar3.getContentContainer();
                    context10.getClass();
                    com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.offer.b bVar8 = cVar12.i;
                    bVar8.getClass();
                    com.yandex.plus.acquisition.sdk.pay.common.api.j jVar5 = kVar4.g;
                    com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.product.texts.a aVar21 = new com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.product.texts.a(jVar5.a, bVar8.a, jVar5.d, jVar5.e);
                    com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.badges.a aVar22 = new com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.badges.a(jVar5.j, (String) jVar5.m.getValue());
                    cVar12.h.getClass();
                    com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.product.texts.badges.b bVar9 = new com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.product.texts.badges.b(context10, null, 0, 0, 14, null);
                    com.yandex.plus.pay.ui.core.b.D(bVar9.getProductTexts(), aVar21);
                    com.yandex.plus.core.network.api.utils.a.D(bVar9.getBadges(), aVar22);
                    contentContainer.addView(bVar9.getView());
                    cVar12.b(aVar20);
                    cVar12.d(context10.getResources().getDimensionPixelSize(R.dimen.acquisition_sdk_dimension_size_200));
                    cVar12.c();
                    fVar3.getLegalsTextView().setTextAppearance(((com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.controllers.success.a) ((jyr) cVar12.g).getValue()).c);
                    cVar12.e();
                    cVar12.h(kVar4, eVar2.a);
                    cVar12.f = aVar20;
                    aVar3.m = cVar12;
                }
                obj3 = obj4;
                aVar = aVar2;
                if (hVar instanceof com.yandex.plus.acquisition.sdk.button.section.ui.api.g) {
                }
                return Unit.a;
            case 25:
                return k(obj);
            case 26:
                return l(obj);
            case 27:
                return n(obj);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return o(obj);
            default:
                nm6 nm6Var26 = nm6.a;
                qgg.h0(obj);
                com.yandex.plus.core.benchmark.l lVar2 = (com.yandex.plus.core.benchmark.l) obj5;
                Map map2 = (Map) obj4;
                Iterator it5 = ((List) ((com.yandex.plus.core.benchmark.c) this.k).e.getValue()).iterator();
                while (it5.hasNext()) {
                    ((com.yandex.plus.core.benchmark.v) it5.next()).c(lVar2, map2);
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l1p(Object obj, aqi aqiVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = obj;
        this.l = aqiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l1p(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.k = obj;
        this.l = obj2;
        this.m = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l1p(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
        this.m = obj2;
    }
}
