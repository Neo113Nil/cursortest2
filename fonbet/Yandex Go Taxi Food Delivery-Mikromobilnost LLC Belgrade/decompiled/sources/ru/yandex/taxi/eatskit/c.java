package ru.yandex.taxi.eatskit;

import android.net.Uri;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import defpackage.abb1;
import defpackage.adn;
import defpackage.aen;
import defpackage.ben;
import defpackage.bgc;
import defpackage.ccn;
import defpackage.cen;
import defpackage.d6j0;
import defpackage.d6w0;
import defpackage.ecn;
import defpackage.evu0;
import defpackage.f8o;
import defpackage.fen;
import defpackage.fho;
import defpackage.g8e;
import defpackage.h1p;
import defpackage.h6w0;
import defpackage.hcn;
import defpackage.i3y;
import defpackage.icn;
import defpackage.iti0;
import defpackage.j0w0;
import defpackage.jcn;
import defpackage.jfn;
import defpackage.jiu;
import defpackage.jqr;
import defpackage.kcn;
import defpackage.kdx;
import defpackage.lcn;
import defpackage.loj;
import defpackage.mcn;
import defpackage.msv0;
import defpackage.ncn;
import defpackage.ny61;
import defpackage.ocn;
import defpackage.odn;
import defpackage.ozv0;
import defpackage.p32;
import defpackage.pcn;
import defpackage.pdn;
import defpackage.pwy0;
import defpackage.qcn;
import defpackage.rcn;
import defpackage.ren;
import defpackage.rme;
import defpackage.rnc;
import defpackage.rsi0;
import defpackage.scn;
import defpackage.t020;
import defpackage.tcn;
import defpackage.tls;
import defpackage.tmx;
import defpackage.tx2;
import defpackage.ucn;
import defpackage.udn;
import defpackage.ut9;
import defpackage.vcn;
import defpackage.vdn;
import defpackage.viw0;
import defpackage.vom;
import defpackage.vs4;
import defpackage.wcn;
import defpackage.wrm;
import defpackage.wrv0;
import defpackage.xcn;
import defpackage.xrv0;
import defpackage.xz4;
import defpackage.ycn;
import defpackage.ymj;
import defpackage.yrv0;
import defpackage.zcn;
import defpackage.zdn;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import ru.yandex.taxi.eatskit.dto.ErrorSource;
import ru.yandex.taxi.eatskit.dto.ErrorType;
import ru.yandex.taxi.eatskit.internal.e;
import ru.yandex.taxi.eatskit.internal.nativeapi.EatsNativeApi;
import ru.yandex.taxi.eatskit.internal.nativeapi.NativeApi;
import ru.yandex.taxi.superapp.g;
import ru.yandex.taxi.superapp.h;
import ru.yandex.taxi.superapp.i;
import ru.yandex.taxi.superapp.j;
import ru.yandex.taxi.superapp.l;
import ru.yandex.taxi.superapp.m;
import ru.yandex.taxi.superapp.q;
import ru.yandex.taxi.superapp.r;
import ru.yandex.taxi.superapp.u;
import ru.yandex.taxi.superapp.v;

/* loaded from: classes5.dex */
public final class c extends rme {
    public final h1p n;
    public final adn o;
    public final pdn p;
    public final e q;
    public final com.yandex.go.order.external.tracking.c r;
    public final pwy0 s;
    public final EatsNativeApi t;
    public final ecn u;
    public boolean v;
    public jfn w;
    public tls x;
    public final udn y;

    public c(h1p h1pVar, fen fenVar, adn adnVar, pdn pdnVar, e eVar, com.yandex.go.order.external.tracking.c cVar, pwy0 pwy0Var, List list) {
        super(fenVar, adnVar);
        this.n = h1pVar;
        this.o = adnVar;
        this.p = pdnVar;
        this.q = eVar;
        this.r = cVar;
        this.s = pwy0Var;
        this.t = new EatsNativeApi(new a(this), list);
        this.u = new ecn(new cen(this, 0), "edaWebView");
        this.x = new jiu(13);
        this.y = new udn();
    }

    @Override // defpackage.rme
    public final void b() {
        Set set = (Set) this.b.b;
        NativeApi f = f();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            f.registerAppSignal((tx2) it.next());
        }
        adn adnVar = this.o;
        HashMap hashMap = adnVar.w;
        HashMap hashMap2 = adnVar.w;
        r rVar = (r) hashMap.get(r.class);
        int i = 1;
        int i2 = 0;
        EatsNativeApi eatsNativeApi = this.t;
        if (rVar != null) {
            eatsNativeApi.addAsyncMethod(EatsNativeApi.EatsCallMethod.OPEN_STORIES.getMethodName(), new b(new EatsKitServiceController$configure$1$1(2, rVar, r.class, "openStories", "openStories(Lru/yandex/taxi/eatskit/dto/StoriesConfig;Lru/yandex/taxi/eatskit/EatsKitCallback;)V", 0), i2));
            eatsNativeApi.addAsyncMethod(EatsNativeApi.EatsCallMethod.REQUEST_STORIES.getMethodName(), new b(new EatsKitServiceController$configure$1$2(2, rVar, r.class, "requestStories", "requestStories(Lru/yandex/taxi/eatskit/dto/StoriesSource;Lru/yandex/taxi/eatskit/EatsKitCallback;)V", 0), i));
        }
        q qVar = (q) hashMap2.get(q.class);
        int i3 = 6;
        int i4 = 2;
        int i5 = 11;
        if (qVar != null) {
            eatsNativeApi.addAsyncMethod(EatsNativeApi.EatsCallMethod.SAVE_CONTEXT.getMethodName(), new b(new EatsKitServiceController$configure$2$1(2, qVar, q.class, "saveContext", "saveContext(Lru/yandex/taxi/eatskit/dto/SessionContext;Lru/yandex/taxi/eatskit/EatsKitCallback;)V", 0), i4));
            eatsNativeApi.addAsyncMethod(EatsNativeApi.EatsCallMethod.GET_CONTEXT.getMethodName(), new vs4(i3, new loj(i5, qVar)));
        }
        fho m = adnVar.m();
        int i6 = 10;
        if (m != null) {
            eatsNativeApi.addAsyncMethod(EatsNativeApi.EatsCallMethod.SEND_ADJUST_EVENT.getMethodName(), new vs4(i5, new vs4(i6, m)));
        }
        viw0 viw0Var = (viw0) hashMap2.get(viw0.class);
        if (viw0Var != null) {
            eatsNativeApi.addAsyncMethod(EatsNativeApi.EatsCallMethod.OPEN_SUPPORT.getMethodName(), new b(new EatsKitServiceController$configure$4$1(2, viw0Var, viw0.class, "openSupport", "openSupport(Lru/yandex/taxi/eatskit/dto/OpenSupportParam;Lru/yandex/taxi/eatskit/EatsKitCallback;)V", 0), i6));
        }
        if (hashMap2.get(xcn.class) != null) {
            ny61.u();
            return;
        }
        h hVar = (h) hashMap2.get(h.class);
        int i7 = 22;
        int i8 = 3;
        if (hVar != null) {
            eatsNativeApi.addAsyncMethod(EatsNativeApi.EatsCallMethod.REQUEST_CURRENT_POSITION.getMethodName(), new wrm(new vs4(i7, hVar), i8));
        }
        if (hashMap2.get(qcn.class) != null) {
            ny61.u();
            return;
        }
        if (hashMap2.get(tcn.class) != null) {
            ny61.u();
            return;
        }
        ru.yandex.taxi.contacts.h hVar2 = (ru.yandex.taxi.contacts.h) hashMap2.get(ru.yandex.taxi.contacts.h.class);
        int i9 = 23;
        if (hVar2 != null) {
            eatsNativeApi.addAsyncMethod(EatsNativeApi.EatsCallMethod.REQUEST_CONTACT.getMethodName(), new wrm(new vs4(i9, hVar2), i8));
        }
        j jVar = (j) hashMap2.get(j.class);
        int i10 = 21;
        if (jVar != null) {
            eatsNativeApi.addAsyncMethod(EatsNativeApi.EatsCallMethod.ADD_CARD.getMethodName(), new b(new EatsKitServiceController$configure$10$1(2, jVar, j.class, "addCard", "addCard(Lru/yandex/taxi/eatskit/dto/AddCardEatsParams;Lru/yandex/taxi/eatskit/EatsKitCallback;)V", 0), i10));
            eatsNativeApi.addAsyncMethod(EatsNativeApi.EatsCallMethod.REQUEST_GOOGLE_PAY_TOKEN.getMethodName(), new b(new EatsKitServiceController$configure$10$2(2, jVar, j.class, "requestGooglePayToken", "requestGooglePayToken(Lru/yandex/taxi/eatskit/dto/RequestGooglePayTokenParams;Lru/yandex/taxi/eatskit/EatsKitCallback;)V", 0), i7));
            eatsNativeApi.addAsyncMethod(EatsNativeApi.EatsCallMethod.IS_GOOGLE_PAY_SUPPORTED.getMethodName(), new wrm(new ben(jVar, i2), i8));
            int i11 = 24;
            eatsNativeApi.addAsyncMethod(EatsNativeApi.EatsCallMethod.ON_SUCCESS_ORDER.getMethodName(), new vs4(i11, new ben(jVar, i)));
            eatsNativeApi.addAsyncMethod(EatsNativeApi.EatsCallMethod.REQUEST_GOOGLE_PAY_TOKEN_V2.getMethodName(), new b(new EatsKitServiceController$configure$10$5(2, jVar, j.class, "requestGooglePayToken", "requestGooglePayToken(Lru/yandex/taxi/eatskit/dto/RequestGooglePayTokenParams;Lru/yandex/taxi/eatskit/EatsKitCallback;)V", 0), i9));
            eatsNativeApi.addAsyncMethod(EatsNativeApi.EatsCallMethod.HAS_BOUND_CARDS_IN_GOOGLE_PAY.getMethodName(), new b(new EatsKitServiceController$configure$10$6(2, jVar, j.class, "hasBoundCardsInGooglePay", "hasBoundCardsInGooglePay(Lru/yandex/taxi/eatskit/dto/RequestHasBoundCardsInGooglePayParams;Lru/yandex/taxi/eatskit/EatsKitCallback;)V", 0), i11));
        }
        h6w0 h6w0Var = (h6w0) hashMap2.get(h6w0.class);
        if (h6w0Var != null) {
            eatsNativeApi.addAsyncMethod(EatsNativeApi.EatsCallMethod.OPEN_PLUS.getMethodName(), new b(new EatsKitServiceController$configure$11$1(2, h6w0Var, h6w0.class, "openPlus", "openPlus(Lru/yandex/taxi/eatskit/dto/PlusPurchaseParam;Lru/yandex/taxi/eatskit/EatsKitCallback;)V", 0), i8));
        }
        com.yandex.go.order.external.b bVar = (com.yandex.go.order.external.b) hashMap2.get(com.yandex.go.order.external.b.class);
        int i12 = 8;
        int i13 = 7;
        if (bVar != null) {
            eatsNativeApi.addAsyncMethod(EatsNativeApi.EatsCallMethod.SET_ORDER_CLOSED.getMethodName(), new vs4(i12, new vs4(i13, bVar)));
        }
        if (hashMap2.get(jcn.class) != null) {
            ny61.u();
            return;
        }
        msv0 msv0Var = (msv0) hashMap2.get(msv0.class);
        int i14 = 4;
        if (msv0Var != null) {
            eatsNativeApi.addAsyncMethod(EatsNativeApi.EatsCallMethod.OPEN_CHARITY.getMethodName(), new b(new EatsKitServiceController$configure$14$1(2, msv0Var, msv0.class, "openCharity", "openCharity(Ljava/util/Map;Lru/yandex/taxi/eatskit/EatsKitCallback;)V", 0), i14));
        }
        int i15 = 5;
        eatsNativeApi.addAsyncMethod(EatsNativeApi.EatsCallMethod.OPEN_KEYBOARD.getMethodName(), new vs4(i15, new vs4(i14, this)));
        if (hashMap2.get(hcn.class) != null) {
            ny61.u();
            return;
        }
        if (hashMap2.get(icn.class) != null) {
            ny61.u();
            return;
        }
        m mVar = (m) hashMap2.get(m.class);
        if (mVar != null) {
            eatsNativeApi.addAsyncMethod(EatsNativeApi.EatsCallMethod.SHARE_TEXT.getMethodName(), new b(new EatsKitServiceController$configure$18$1(2, mVar, m.class, "shareText", "shareText(Lru/yandex/taxi/eatskit/dto/ShareTextParam;Lru/yandex/taxi/eatskit/EatsKitCallback;)V", 0), i15));
            eatsNativeApi.addAsyncMethod(EatsNativeApi.EatsCallMethod.SHARE_IMAGE_LIST.getMethodName(), new b(new EatsKitServiceController$configure$18$2(2, mVar, m.class, "shareImageList", "shareImageList(Lru/yandex/taxi/eatskit/dto/ShareImageListParam;Lru/yandex/taxi/eatskit/EatsKitCallback;)V", 0), i3));
        }
        if (hashMap2.get(vcn.class) != null) {
            ny61.u();
            return;
        }
        u uVar = (u) hashMap2.get(u.class);
        int i16 = 9;
        if (uVar != null) {
            eatsNativeApi.addAsyncMethod(EatsNativeApi.EatsCallMethod.INSTALLED_APPLICATIONS.getMethodName(), new b(new EatsKitServiceController$configure$20$1(2, uVar, u.class, "installedApplications", "installedApplications(Lru/yandex/taxi/eatskit/dto/InstalledApplicationsRequest;Lru/yandex/taxi/eatskit/EatsKitCallback;)V", 0), i13));
            eatsNativeApi.addAsyncMethod(EatsNativeApi.EatsCallMethod.CHECK_LOCATION_AVAILABILITY.getMethodName(), new wrm(new zdn(uVar, i2), i8));
            eatsNativeApi.addAsyncMethod(EatsNativeApi.EatsCallMethod.REQUEST_LOCATION_AVAILABILITY.getMethodName(), new wrm(new zdn(uVar, i), i8));
            eatsNativeApi.addAsyncMethod(EatsNativeApi.EatsCallMethod.OPEN_APPLICATION_SETTINGS.getMethodName(), new vs4(i16, new zdn(uVar, i4)));
        }
        if (hashMap2.get(lcn.class) != null) {
            ny61.u();
            return;
        }
        v vVar = (v) hashMap2.get(v.class);
        int i17 = 12;
        if (vVar != null) {
            eatsNativeApi.addAsyncMethod(EatsNativeApi.EatsCallMethod.OPEN_BANK.getMethodName(), new b(new EatsKitServiceController$configure$22$1(2, vVar, v.class, "openYb", "openYb(Lru/yandex/taxi/eatskit/dto/OpenYbParams;Lru/yandex/taxi/eatskit/EatsKitCallback;)V", 0), i12));
            eatsNativeApi.addAsyncMethod(EatsNativeApi.EatsCallMethod.GET_BANK_STATE.getMethodName(), new wrm(new vs4(i17, vVar), i8));
            eatsNativeApi.addAsyncMethod(EatsNativeApi.EatsCallMethod.CHECK_PAYMENT.getMethodName(), new b(new EatsKitServiceController$configure$22$3(2, vVar, v.class, "checkPayment", "checkPayment(Lru/yandex/taxi/eatskit/dto/CheckPaymentRequest;Lru/yandex/taxi/eatskit/EatsKitCallback;)V", 0), i16));
        }
        if (hashMap2.get(ocn.class) != null) {
            ny61.u();
            return;
        }
        if (hashMap2.get(ucn.class) != null) {
            ny61.u();
            return;
        }
        if (hashMap2.get(zcn.class) != null) {
            ny61.u();
            return;
        }
        t020 t020Var = (t020) hashMap2.get(t020.class);
        int i18 = 15;
        int i19 = 14;
        int i20 = 13;
        if (t020Var != null) {
            eatsNativeApi.addAsyncMethod(EatsNativeApi.EatsCallMethod.OPEN_MESSENGER_CHAT.getMethodName(), new vs4(i19, new vs4(i20, t020Var)));
            eatsNativeApi.addAsyncMethod(EatsNativeApi.EatsCallMethod.CLOSE_MESSENGER_CHAT.getMethodName(), new vs4(i18, new vom(28, t020Var)));
        }
        if (hashMap2.get(pcn.class) != null) {
            ny61.u();
            return;
        }
        if (hashMap2.get(scn.class) != null) {
            ny61.u();
            return;
        }
        if (hashMap2.get(kcn.class) != null) {
            ny61.u();
            return;
        }
        if (hashMap2.get(rcn.class) != null) {
            ny61.u();
            return;
        }
        l lVar = (l) hashMap2.get(l.class);
        int i21 = 16;
        if (lVar != null) {
            eatsNativeApi.addAsyncMethod(EatsNativeApi.EatsCallMethod.IS_USER_ACCOUNT_PHONISH.getMethodName(), new wrm(new vs4(i21, lVar), i8));
        }
        if (hashMap2.get(mcn.class) != null) {
            ny61.u();
            return;
        }
        ru.yandex.taxi.router.d dVar = (ru.yandex.taxi.router.d) hashMap2.get(ru.yandex.taxi.router.d.class);
        if (dVar != null) {
            eatsNativeApi.addAsyncMethod(EatsNativeApi.EatsCallMethod.OPEN_IN_APP_CALLS.getMethodName(), new b(new EatsKitServiceController$configure$33$1(2, dVar, ru.yandex.taxi.router.d.class, "openInAppCalls", "openInAppCalls(Lru/yandex/taxi/eatskit/dto/OpenInAppCallsParams;Lru/yandex/taxi/eatskit/EatsKitCallback;)V", 0), i5));
        }
        if (hashMap2.get(ncn.class) != null) {
            ny61.u();
            return;
        }
        i iVar = (i) hashMap2.get(i.class);
        if (iVar != null) {
            eatsNativeApi.addAsyncMethod(EatsNativeApi.EatsCallMethod.REQUEST_OAUTH_TOKEN.getMethodName(), new wrm(new vs4(17, iVar), i8));
        }
        g gVar = (g) hashMap2.get(g.class);
        if (gVar != null) {
            eatsNativeApi.addAsyncMethod(EatsNativeApi.EatsCallMethod.ENDPOINT_DESCRIPTION.getMethodName(), new b(new EatsKitServiceController$configure$36$1(2, gVar, g.class, "requestEndpointDescription", "requestEndpointDescription(Lru/yandex/taxi/eatskit/dto/EndpointDescriptionParams;Lru/yandex/taxi/eatskit/EatsKitCallback;)V", 0), i17));
        }
        if (hashMap2.get(wcn.class) != null) {
            ny61.u();
            return;
        }
        ru.yandex.taxi.delegates.b bVar2 = (ru.yandex.taxi.delegates.b) hashMap2.get(ru.yandex.taxi.delegates.b.class);
        int i22 = 19;
        if (bVar2 != null) {
            eatsNativeApi.addAsyncMethod(EatsNativeApi.EatsCallMethod.REQUEST_CONTEXT.getMethodName(), new vs4(18, new ut9(i22, bVar2, this)));
        }
        d6w0 d6w0Var = (d6w0) hashMap2.get(d6w0.class);
        if (d6w0Var != null) {
            eatsNativeApi.addAsyncMethod(EatsNativeApi.EatsCallMethod.REQUEST_KEY_POINTS_TIMESTAMP.getMethodName(), new wrm(new vs4(i22, d6w0Var), i8));
        }
        j0w0 j0w0Var = (j0w0) hashMap2.get(j0w0.class);
        if (j0w0Var != null) {
            eatsNativeApi.addAsyncMethod(EatsNativeApi.EatsCallMethod.TOGGLE_ITEM_LIKE.getMethodName(), new vs4(i10, new vs4(20, j0w0Var)));
        }
        ozv0 ozv0Var = (ozv0) hashMap2.get(ozv0.class);
        if (ozv0Var != null) {
            eatsNativeApi.addAsyncMethod(EatsNativeApi.EatsCallMethod.REQUEST_NAVIGATE_TO.getMethodName(), new b(new EatsKitServiceController$configure$41$1(2, ozv0Var, ozv0.class, "requestNavigateTo", "requestNavigateTo(Lru/yandex/taxi/eatskit/dto/NavigationRequest;Lru/yandex/taxi/eatskit/EatsKitCallback;)V", 0), i20));
            eatsNativeApi.addAsyncMethod(EatsNativeApi.EatsCallMethod.REQUEST_NAVIGATE_BACK.getMethodName(), new b(new EatsKitServiceController$configure$41$2(2, ozv0Var, ozv0.class, "requestNavigateBack", "requestNavigateBack(Lru/yandex/taxi/eatskit/dto/NavigationRequest;Lru/yandex/taxi/eatskit/EatsKitCallback;)V", 0), i19));
        }
        odn odnVar = (odn) hashMap2.get(odn.class);
        if (odnVar != null) {
            eatsNativeApi.addAsyncMethod(EatsNativeApi.EatsCallMethod.GET_PERMISSIONS.getMethodName(), new b(new EatsKitServiceController$configure$42$1(2, odnVar, odn.class, "getPermissions", "getPermissions(Lru/yandex/taxi/eatskit/dto/GetPermissionsRequest;Lru/yandex/taxi/eatskit/EatsKitCallback;)V", 0), i18));
            eatsNativeApi.addAsyncMethod(EatsNativeApi.EatsCallMethod.REQUEST_PERMISSIONS.getMethodName(), new b(new EatsKitServiceController$configure$42$2(2, odnVar, odn.class, "requestPermissions", "requestPermissions(Lru/yandex/taxi/eatskit/dto/RequestPermissionsRequest;Lru/yandex/taxi/eatskit/EatsKitCallback;)V", 0), i21));
        }
        ru.yandex.taxi.delegates.a aVar = (ru.yandex.taxi.delegates.a) hashMap2.get(ru.yandex.taxi.delegates.a.class);
        if (aVar != null) {
            eatsNativeApi.addAsyncMethod(EatsNativeApi.EatsCallMethod.CHECK_BLUETOOTH_STATE.getMethodName(), new wrm(new aen(aVar, i2), i8));
            eatsNativeApi.addAsyncMethod(EatsNativeApi.EatsCallMethod.REQUEST_BLUETOOTH_ENABLE.getMethodName(), new wrm(new aen(aVar, i), i8));
        }
        com.yandex.go.superapp.biometrics.a aVar2 = (com.yandex.go.superapp.biometrics.a) hashMap2.get(com.yandex.go.superapp.biometrics.a.class);
        if (aVar2 != null) {
            eatsNativeApi.addAsyncMethod(EatsNativeApi.EatsCallMethod.CONNECT_TO_COURIER.getMethodName(), new b(new EatsKitServiceController$configure$44$1(2, aVar2, com.yandex.go.superapp.biometrics.a.class, "connectToCourier", "connectToCourier(Lru/yandex/taxi/eatskit/dto/ConnectToCourierRequest;Lru/yandex/taxi/eatskit/EatsKitCallback;)V", 0), 17));
            eatsNativeApi.addAsyncMethod(EatsNativeApi.EatsCallMethod.START_ORDER_VERIFICATION.getMethodName(), new b(new EatsKitServiceController$configure$44$2(2, aVar2, com.yandex.go.superapp.biometrics.a.class, "startOrderVerification", "startOrderVerification(Lru/yandex/taxi/eatskit/dto/StartOrderVerificationRequest;Lru/yandex/taxi/eatskit/EatsKitCallback;)V", 0), 18));
            eatsNativeApi.addAsyncMethod(EatsNativeApi.EatsCallMethod.START_COURIER_VERIFICATION.getMethodName(), new b(new EatsKitServiceController$configure$44$3(2, aVar2, com.yandex.go.superapp.biometrics.a.class, "startCourierVerification", "startCourierVerification(Lru/yandex/taxi/eatskit/dto/StartCourierVerificationRequest;Lru/yandex/taxi/eatskit/EatsKitCallback;)V", 0), i22));
            eatsNativeApi.addAsyncMethod(EatsNativeApi.EatsCallMethod.SEND_VERIFICATION_RESULT_TO_COURIER.getMethodName(), new b(new EatsKitServiceController$configure$44$4(2, aVar2, com.yandex.go.superapp.biometrics.a.class, "sendVerificationResultToCourier", "sendVerificationResultToCourier(Lru/yandex/taxi/eatskit/dto/SendVerificationResultToCourierRequest;Lru/yandex/taxi/eatskit/EatsKitCallback;)V", 0), 20));
        }
    }

    @Override // defpackage.rme
    public final void c() {
        super.c();
        e eVar = this.q;
        eVar.c = null;
        eVar.d = true;
        com.yandex.go.order.external.tracking.c cVar = this.r;
        if (cVar != null) {
            com.yandex.go.order.external.tracking.c.c();
            LinkedHashSet linkedHashSet = cVar.c;
            linkedHashSet.remove(this.y);
            if (linkedHashSet.isEmpty()) {
                cVar.b.b();
            }
        }
    }

    @Override // defpackage.rme
    public final xz4 e() {
        return this.u;
    }

    @Override // defpackage.rme
    public final NativeApi f() {
        return this.t;
    }

    @Override // defpackage.rme
    public final void j(Uri.Builder builder, String str) {
        vdn vdnVar = new vdn(this, 0);
        e eVar = this.q;
        eVar.c = vdnVar;
        eVar.d = true;
        if (str != null && !evu0.J(str)) {
            g();
            eVar.a(new ru.yandex.taxi.eatskit.internal.c(str, true));
        }
        eVar.a(new ru.yandex.taxi.eatskit.internal.a(this.m));
        eVar.a(new ru.yandex.taxi.eatskit.internal.d(this.s.getThemeType().getWireName().toLowerCase(Locale.ROOT)));
        if (this.m) {
            w();
        }
        Iterator it = eVar.b().iterator();
        while (it.hasNext()) {
            ((ccn) it.next()).b(builder);
        }
    }

    @Override // defpackage.rme
    public final void k(Uri.Builder builder) {
        vdn vdnVar = new vdn(this, 0);
        e eVar = this.q;
        eVar.c = vdnVar;
        eVar.d = true;
        eVar.a(new ru.yandex.taxi.eatskit.internal.a(this.m));
        eVar.a(new ru.yandex.taxi.eatskit.internal.d(this.s.getThemeType().getWireName().toLowerCase(Locale.ROOT)));
        if (this.m) {
            w();
        }
        List b = eVar.b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : b) {
            if (!(((ccn) obj) instanceof ru.yandex.taxi.eatskit.internal.c)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ccn) it.next()).b(builder);
        }
    }

    @Override // defpackage.rme
    public final void l() {
        Map z = g8e.z(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, Uri.parse(g().a).getHost());
        fho m = this.o.m();
        if (m != null) {
            kdx kdxVar = new kdx();
            for (Map.Entry entry : z.entrySet()) {
                abb1.d(kdxVar, (String) entry.getKey(), (String) entry.getValue());
            }
            m.a(new p32("eatskit.Captcha.Shown", kdxVar.a()));
        }
    }

    @Override // defpackage.rme
    public final void m(EatsKitDelegates$ClickTarget eatsKitDelegates$ClickTarget) {
        String str;
        super.m(eatsKitDelegates$ClickTarget);
        fho m = this.o.m();
        if (m != null) {
            yrv0 yrv0Var = m.a;
            h1p h1pVar = m.c;
            yrv0Var.getClass();
            int i = xrv0.b[eatsKitDelegates$ClickTarget.ordinal()];
            if (i == 1) {
                str = "close";
            } else if (i != 2) {
                return;
            } else {
                str = "reload";
            }
            wrv0 a = yrv0Var.a(h1pVar);
            ru.yandex.taxi.analytics.i d = ((ru.yandex.taxi.analytics.j) yrv0Var.a).d("Superapp.Showcase.ButtonTapped");
            LinkedHashMap linkedHashMap = d.a;
            linkedHashMap.put("originScreen", yrv0Var.b());
            linkedHashMap.put(Constants.KEY_SERVICE, h1pVar.getValue());
            d.g("is_disabled", true);
            linkedHashMap.put("error_reason", a.d);
            linkedHashMap.put("button", str);
            d.e = true;
            d.m();
        }
    }

    @Override // defpackage.rme
    public final void n(boolean z) {
        ru.yandex.taxi.eatskit.internal.a aVar = new ru.yandex.taxi.eatskit.internal.a(z);
        e eVar = this.q;
        eVar.a(aVar);
        eVar.a(new ru.yandex.taxi.eatskit.internal.d(this.s.getThemeType().getWireName().toLowerCase(Locale.ROOT)));
        if (z) {
            w();
        }
    }

    @Override // defpackage.rme
    public final void o() {
    }

    @Override // defpackage.rme
    public final void p(f8o f8oVar, ErrorSource errorSource) {
        d6j0 d6j0Var;
        Integer num;
        String str;
        i3y i3yVar;
        super.p(f8oVar, errorSource);
        adn adnVar = this.o;
        fho m = adnVar.m();
        String str2 = null;
        if (m != null) {
            d6j0 d6j0Var2 = f8oVar != null ? f8oVar.a : null;
            yrv0 yrv0Var = m.a;
            h1p h1pVar = m.c;
            wrv0 a = yrv0Var.a(h1pVar);
            ErrorType errorType = d6j0Var2 != null ? d6j0Var2.e : null;
            if (errorType != null) {
                ErrorType.Companion.getClass();
                i3yVar = ErrorType.stringConverter$delegate;
                str = ((tmx) i3yVar.getValue()).a(errorType);
            } else {
                str = null;
            }
            a.d = str;
            a.c = d6j0Var2 != null ? d6j0Var2.a : null;
            a.e = d6j0Var2 != null ? d6j0Var2.b : null;
            a.b = errorSource.getRawValue();
            if (a.a) {
                yrv0Var.d(h1pVar, a);
            }
        }
        d6j0 d6j0Var3 = f8oVar != null ? f8oVar.a : null;
        if (g().o && d6j0Var3 != null && (num = d6j0Var3.d) != null && num.intValue() == 418) {
            ((rnc) adnVar.a).a(new ymj(20, this, d6j0Var3), new bgc(12));
        }
        if (this.h != null) {
            rsi0 rsi0Var = this.p.b;
            if (f8oVar != null && (d6j0Var = f8oVar.a) != null) {
                str2 = d6j0Var.b;
            }
            new RuntimeException(str2);
            rsi0Var.getClass();
        }
    }

    @Override // defpackage.rme
    public final void q() {
        super.q();
        e eVar = this.q;
        eVar.d = false;
        LinkedHashMap linkedHashMap = eVar.b;
        for (ccn ccnVar : linkedHashMap.values()) {
            tls tlsVar = eVar.c;
            if (tlsVar != null) {
                tlsVar.invoke(ccnVar);
            }
        }
        linkedHashMap.clear();
        if (this.h != null) {
            this.p.b.getClass();
        }
    }

    @Override // defpackage.rme
    public final void r(iti0 iti0Var, boolean z) {
        if ((iti0Var != null ? iti0Var.c : null) == null || this.o.w.get(ycn.class) == null) {
            super.r(iti0Var, z);
        } else {
            ny61.u();
        }
    }

    public final void v(ContentView contentView) {
        ((EatsKitContentView) contentView).init(this, this.n, this.a, g());
        kotlinx.coroutines.flow.e.H(this.k, new jqr(this.s.a(), new EatsKitServiceController$attachThemeSwitcher$1(this, null), 3));
    }

    public final void w() {
        com.yandex.go.order.external.tracking.c cVar;
        jfn jfnVar = this.w;
        jfn jfnVar2 = null;
        if (jfnVar != null) {
            this.w = null;
        } else {
            if (!this.v && (cVar = this.r) != null) {
                ren b = cVar.b(this.n);
                String g = b != null ? b.g() : null;
                if (g != null) {
                    jfnVar2 = new jfn(g, false);
                }
            }
            jfnVar = jfnVar2;
        }
        if (jfnVar != null) {
            this.q.a(new ru.yandex.taxi.eatskit.internal.b(jfnVar, g().m));
        }
    }
}
