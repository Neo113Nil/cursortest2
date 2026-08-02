package com.yandex.music.payment.screen.promocode.viewmodel;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import defpackage.bfu;
import defpackage.dm6;
import defpackage.hld;
import defpackage.ioi;
import defpackage.jlb;
import defpackage.k5r;
import defpackage.lum;
import defpackage.mm6;
import defpackage.nmb;
import defpackage.qwm;
import defpackage.rwm;
import defpackage.swm;
import defpackage.twm;
import defpackage.uwm;
import defpackage.uz1;
import defpackage.xdr;
import defpackage.ydr;
import defpackage.yiq;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a extends bfu {
    public final uz1 k;
    public final Gson l;
    public final ioi m;
    public final lum n;
    public final mm6 o;
    public final xdr p;

    public a(uz1 uz1Var, Gson gson, ioi ioiVar, lum lumVar) {
        this.k = uz1Var;
        this.l = gson;
        this.m = ioiVar;
        this.n = lumVar;
        yiq yiqVar = new yiq();
        addCloseable((AutoCloseable) yiqVar);
        this.o = hld.r(yiqVar, dm6.b);
        this.p = ydr.a(rwm.a);
    }

    public final void G() {
        xdr xdrVar;
        Object value;
        do {
            xdrVar = this.p;
            value = xdrVar.getValue();
            uwm uwmVar = (uwm) value;
            if (uwmVar instanceof twm) {
                ((twm) uwmVar).a.g(null);
            }
        } while (!xdrVar.k(value, qwm.a));
    }

    public final void H(WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        String str;
        Object value = this.p.getValue();
        String str2 = null;
        swm swmVar = value instanceof swm ? (swm) value : null;
        if (swmVar != null) {
            String str3 = swmVar.a;
            lum lumVar = this.n;
            lumVar.getClass();
            if (webResourceRequest != null && webResourceRequest.isForMainFrame() && str3.equals(webResourceRequest.getUrl().toString())) {
                jlb[] jlbVarArr = jlb.a;
                if (webResourceError != null) {
                    int errorCode = webResourceError.getErrorCode();
                    switch (webResourceError.getErrorCode()) {
                        case -16:
                            str = "ERROR_UNSAFE_RESOURCE";
                            break;
                        case -15:
                            str = "ERROR_TOO_MANY_REQUESTS";
                            break;
                        case -14:
                            str = "ERROR_FILE_NOT_FOUND";
                            break;
                        case -13:
                            str = "ERROR_FILE";
                            break;
                        case -12:
                            str = "ERROR_BAD_URL";
                            break;
                        case -11:
                            str = "ERROR_FAILED_SSL_HANDSHAKE";
                            break;
                        case -10:
                            str = "ERROR_UNSUPPORTED_SCHEME";
                            break;
                        case -9:
                            str = "ERROR_REDIRECT_LOOP";
                            break;
                        case -8:
                            str = "ERROR_TIMEOUT";
                            break;
                        case -7:
                            str = "ERROR_IO";
                            break;
                        case -6:
                            str = "ERROR_CONNECT";
                            break;
                        case -5:
                            str = "ERROR_PROXY_AUTHENTICATION";
                            break;
                        case -4:
                            str = "ERROR_AUTHENTICATION";
                            break;
                        case -3:
                            str = "ERROR_UNSUPPORTED_AUTH_SCHEME";
                            break;
                        case -2:
                            str = "ERROR_HOST_LOOKUP";
                            break;
                        default:
                            str = "ERROR_UNKNOWN";
                            break;
                    }
                    CharSequence description = webResourceError.getDescription();
                    StringBuilder r = k5r.r(errorCode, "WebResourceError[errorCode=", ", error=", str, ", description=\"");
                    r.append((Object) description);
                    r.append("\"]");
                    str2 = r.toString();
                }
                lumVar.X(str2);
            }
        }
    }

    public final void J(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        Object value = this.p.getValue();
        swm swmVar = value instanceof swm ? (swm) value : null;
        if (swmVar != null) {
            String str = swmVar.a;
            lum lumVar = this.n;
            lumVar.getClass();
            if (webResourceRequest.isForMainFrame() && str.equals(webResourceRequest.getUrl().toString())) {
                jlb[] jlbVarArr = jlb.a;
                lumVar.X("WebResourceResponse[statusCode=" + webResourceResponse.getStatusCode() + ", description=\"" + webResourceResponse.getReasonPhrase() + "\"]");
            }
        }
    }

    public final void K(String str) {
        Object value = this.p.getValue();
        swm swmVar = value instanceof swm ? (swm) value : null;
        if (swmVar != null) {
            String str2 = swmVar.a;
            lum lumVar = this.n;
            lumVar.getClass();
            nmb nmbVar = (nmb) lumVar.a;
            if (str2.equals(str)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("_meta", nmb.u(1));
                nmbVar.C("PayWallScreen.PromoCode.Loaded", linkedHashMap);
            }
            if (str2.equals(str)) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("_meta", nmb.u(1));
                nmbVar.C("PayWallScreen.PromoCode.Showed", linkedHashMap2);
            }
        }
    }

    public final void L(String str) {
        str.getClass();
        try {
            PromoCodeViewModel$Message promoCodeViewModel$Message = (PromoCodeViewModel$Message) this.l.d(str, PromoCodeViewModel$Message.class);
            if (promoCodeViewModel$Message == null) {
                return;
            }
            M(promoCodeViewModel$Message);
        } catch (JsonSyntaxException unused) {
        }
    }

    public final void M(PromoCodeViewModel$Message promoCodeViewModel$Message) {
        String type = promoCodeViewModel$Message.getType();
        if (!Intrinsics.d(type, "PURCHASE_SUCCESS_DATA")) {
            if (Intrinsics.d(type, "SUCCESS")) {
                G();
                return;
            }
            return;
        }
        List purchasedItems = promoCodeViewModel$Message.getData().getPurchasedItems();
        if (purchasedItems == null || purchasedItems.isEmpty()) {
            nmb nmbVar = (nmb) this.n.a;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("_meta", nmb.u(1));
            nmbVar.C("PayWallScreen.PromoCode.Succeeded", linkedHashMap);
        }
    }
}
