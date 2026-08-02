package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.RemoteViews;
import androidx.compose.foundation.gestures.q;
import androidx.compose.foundation.gestures.y;
import androidx.compose.foundation.text.input.internal.a;
import androidx.compose.ui.platform.j;
import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.payments.api.preorder.SuitabilityCheckType;
import com.yandex.go.preorder.deeplinks.route.RouteData$Continuation;
import com.yandex.go.routestats.PriceMeta;
import com.yandex.go.scooters.passes.domain.model.ScootersPassesFromScreen;
import com.yandex.go.scooters.passes.h;
import com.yandex.go.shortcuts.impl.view.adapter.s;
import com.yandex.go.taxi.order.api.change.destination.RouteChangeType;
import com.yandex.go.taxi.order.change.route.RouteChangeWarning;
import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import com.yandex.go.zone.dto.objects.ServiceLevel;
import com.yandex.messaging.core.net.entities.proto.message.AiBotDirective;
import com.yandex.messaging.core.net.entities.proto.message.SuggestButton;
import com.yandex.passport.internal.ui.challenge.logout.LogoutBehaviour;
import com.yandex.passport.internal.ui.challenge.logout.bottomsheet.LogoutBottomsheetWish;
import com.yandex.passport.internal.ui.challenge.logout.bottomsheet.x;
import com.yandex.xplat.payment.sdk.NetworkServiceError;
import com.yandex.xplat.payment.sdk.NetworkServiceRetryingStrategy;
import com.yandex.xplat.payment.sdk.NewCard;
import com.yandex.xplat.payment.sdk.SbpPollingStrategy;
import com.ybsdk.core.formatter.FormatTextWatcher;
import com.ybsdk.feature.card.internal.presentation.carddetails.InitialPosition;
import com.ybsdk.feature.card.internal.presentation.carddetails.b;
import com.ybsdk.feature.card.internal.samsungpay.SamsungPayState;
import com.ybsdk.widgets.common.LoadableInput;
import defpackage.vqj0;
import defpackage.wls;
import java.io.File;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.Result;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.tools.HexString;
import ru.yandex.logistics.care.camera.ui.c;
import ru.yandex.taxi.intercity.IntercityToSummaryNavigationSource;
import ru.yandex.taxi.logistics.sdk.ui.component.drag_drop_column.utils.i;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes10.dex */
public final /* synthetic */ class u50 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ u50(sls slsVar, oz40 oz40Var, oz40 oz40Var2, tse tseVar, zx40 zx40Var) {
        this.a = 27;
        this.b = slsVar;
        this.y = oz40Var;
        this.c = oz40Var2;
        this.w = tseVar;
        this.x = zx40Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:259:0x09b4  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x09ca  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x09fa  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x09f4 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r16v8, types: [T, com.ybsdk.core.formatter.FormatTextWatcher] */
    /* JADX WARN: Type inference failed for: r1v65, types: [T, hb30] */
    /* JADX WARN: Type inference failed for: r7v64, types: [T, android.text.TextWatcher, com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.adapter.TransferRequisiteAdapterDelegateKt$requisiteFieldAdapterDelegate$lambda$11$lambda$9$lambda$8$lambda$5$$inlined$doAfterTextChanged$1] */
    @Override // defpackage.tls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        nhq0 nhq0Var;
        nhq0 nhq0Var2;
        InitialPosition initialPosition;
        String promoId;
        Iterator it;
        Object obj2;
        zd8 zd8Var;
        sls slsVar;
        Object obj3;
        djv0 djv0Var;
        float f;
        char c;
        long j;
        NetworkServiceRetryingStrategy networkServiceRetryingStrategy;
        Object obj4;
        PriceMeta priceMeta;
        dry0 dry0Var;
        int i = this.a;
        int i2 = 3;
        char c2 = HexString.CHAR_SPACE;
        long j2 = _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
        int i3 = 8;
        int i4 = 1;
        switch (i) {
            case 0:
                n50 n50Var = (n50) this.b;
                int i5 = 0;
                n50Var.a = ((t50) this.c).c((String) this.w, (x40) this.x, new v50(i5, (oz40) this.y));
                return new w50(i5, n50Var);
            case 1:
                hoy0 hoy0Var = (hoy0) this.b;
                a aVar = (a) this.c;
                eiv eivVar = (eiv) this.w;
                zjy0 zjy0Var = (zjy0) this.x;
                tls tlsVar = (tls) this.y;
                pay payVar = (pay) obj;
                v9y v9yVar = aVar.a;
                payVar.h = hoy0Var;
                payVar.i = eivVar;
                payVar.c = zjy0Var;
                payVar.d = tlsVar;
                payVar.e = v9yVar != null ? ((g9y) v9yVar).b : null;
                payVar.f = v9yVar != null ? ((g9y) v9yVar).c : null;
                payVar.g = v9yVar != null ? (xp31) npb1.c((g9y) v9yVar, j.t) : null;
                return zy11.a;
            case 2:
                bt5 bt5Var = (bt5) this.b;
                String str = (String) this.w;
                nw70 nw70Var = (nw70) this.c;
                oy80 oy80Var = (oy80) this.x;
                String str2 = (String) this.y;
                rka0 rka0Var = (rka0) obj;
                String str3 = rka0Var.c;
                if (str3 == null) {
                    return bt5Var.b(rka0Var, str, null, nw70Var, oy80Var, str2);
                }
                ps90 ps90Var = bt5Var.f;
                yu5 yu5Var = new yu5(ps90Var.a.b, ps90Var.b.b, str3, str, ps90Var.d);
                rwo rwoVar = ps90Var.e;
                iho f2 = vfc.f(qv90.a, 0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Процесс привязки GooglePay", "bind_google_pay");
                nhj nhjVar = ps90Var.c;
                md51 h = hg91.a("bind_google_pay_token", nhjVar.b, new bmh(19, nhjVar, yu5Var)).h(new bd90(10));
                ((y22) rwoVar).b(f2, h);
                return h.g(new u50((Object) bt5Var, (Object) rka0Var, (Object) nw70Var, (Object) oy80Var, str2, 3));
            case 3:
                return ((bt5) this.b).b((rka0) this.c, null, ((os90) obj).a, (nw70) this.x, (oy80) this.y, (String) this.w);
            case 4:
                rka0 rka0Var2 = (rka0) this.b;
                bt5 bt5Var2 = (bt5) this.c;
                String str4 = (String) this.w;
                r89 r89Var = (r89) this.x;
                us20 us20Var = (us20) this.y;
                String str5 = rka0Var2.a;
                goz0 goz0Var = ((ynz0) obj).b;
                return bt5Var2.e.b(new tu20(str5, goz0Var.b, bt5Var2.q, str4, goz0Var.a)).g(new os5(bt5Var2, rka0Var2, r89Var, us20Var, 2));
            case 5:
                bt5 bt5Var3 = (bt5) this.b;
                NewCard newCard = (NewCard) this.c;
                String str6 = (String) this.w;
                nw70 nw70Var2 = (nw70) this.x;
                oy80 oy80Var2 = (oy80) this.y;
                rka0 rka0Var3 = (rka0) obj;
                if (bt5Var3.p) {
                    return bt5Var3.i.b(new mnz0(newCard.getCardNumber(), newCard.getExpirationMonth(), newCard.getExpirationYear(), null, newCard.getCvn()), bt5Var3.q).g(new at5(rka0Var3, bt5Var3, newCard, str6, nw70Var2, oy80Var2, 0));
                }
                zhw0 zhw0Var = new zhw0(bt5Var3.a.b, newCard.getShouldBeStored(), rka0Var3.a, rka0Var3.b, newCard.getCardNumber(), newCard.getExpirationMonth(), newCard.getExpirationYear(), newCard.getCvn());
                nhj nhjVar2 = bt5Var3.d;
                return hg91.a("supply_new_card", nhjVar2.b, new bmh(24, nhjVar2, zhw0Var)).g(new qs5(bt5Var3, rka0Var3, nw70Var2, oy80Var2, 3));
            case 6:
                final bt5 bt5Var4 = (bt5) this.b;
                String str7 = (String) this.w;
                final SbpPollingStrategy sbpPollingStrategy = (SbpPollingStrategy) this.c;
                final yj70 yj70Var = (yj70) this.x;
                final oy80 oy80Var3 = (oy80) this.y;
                final rka0 rka0Var4 = (rka0) obj;
                String str8 = rka0Var4.a;
                if (bt5Var4.p) {
                    final int i6 = 0;
                    return bt5Var4.e.b(new xu20(str8, str7, i4)).g(new tls() { // from class: vs5
                        @Override // defpackage.tls
                        public final Object invoke(Object obj5) {
                            int i7 = i6;
                            oy80 oy80Var4 = oy80Var3;
                            yj70 yj70Var2 = yj70Var;
                            SbpPollingStrategy sbpPollingStrategy2 = sbpPollingStrategy;
                            rka0 rka0Var5 = rka0Var4;
                            bt5 bt5Var5 = bt5Var4;
                            switch (i7) {
                                case 0:
                                    break;
                                default:
                                    break;
                            }
                            return bt5Var5.e(rka0Var5.a, sbpPollingStrategy2, yj70Var2, oy80Var4);
                        }
                    });
                }
                aiw0 aiw0Var = new aiw0(bt5Var4.a.b, str8, rka0Var4.b, i4);
                nhj nhjVar3 = bt5Var4.d;
                final int i7 = 1;
                return hg91.a("supply_sbp_pay", nhjVar3.b, new bmh(17, nhjVar3, aiw0Var)).g(new tls() { // from class: vs5
                    @Override // defpackage.tls
                    public final Object invoke(Object obj5) {
                        int i72 = i7;
                        oy80 oy80Var4 = oy80Var3;
                        yj70 yj70Var2 = yj70Var;
                        SbpPollingStrategy sbpPollingStrategy2 = sbpPollingStrategy;
                        rka0 rka0Var5 = rka0Var4;
                        bt5 bt5Var5 = bt5Var4;
                        switch (i72) {
                            case 0:
                                break;
                            default:
                                break;
                        }
                        return bt5Var5.e(rka0Var5.a, sbpPollingStrategy2, yj70Var2, oy80Var4);
                    }
                });
            case 7:
                List list = (List) this.b;
                Integer num = (Integer) this.c;
                Integer num2 = (Integer) this.w;
                b bVar = (b) this.x;
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.y;
                bq8 bq8Var = (bq8) obj;
                r8j0 r8j0Var = new r8j0(list, null, 14);
                if (num != null) {
                    nhq0Var = new nhq0(num.intValue(), true);
                } else {
                    if (num2 != null) {
                        nhq0Var2 = new nhq0(num2.intValue(), true);
                        Map map = bq8Var.i;
                        initialPosition = bq8Var.f;
                        bVar.getClass();
                        if (initialPosition != null && (promoId = initialPosition.getPromoId()) != null) {
                            ArrayList arrayList = new ArrayList();
                            for (Object obj5 : list) {
                                if (obj5 instanceof zd8) {
                                    arrayList.add(obj5);
                                }
                            }
                            it = arrayList.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj2 = null;
                                } else {
                                    Object next = it.next();
                                    ArrayList arrayList2 = ((zd8) next).b;
                                    if (!arrayList2.isEmpty()) {
                                        Iterator it2 = arrayList2.iterator();
                                        while (it2.hasNext()) {
                                            if (jl40.l(((gq51) it2.next()).a, promoId)) {
                                                obj2 = next;
                                            }
                                        }
                                    }
                                }
                            }
                            zd8Var = (zd8) obj2;
                            if (zd8Var != null) {
                                Iterator it3 = zd8Var.b.iterator();
                                int i8 = 0;
                                while (true) {
                                    if (!it3.hasNext()) {
                                        i8 = -1;
                                    } else if (!jl40.l(((gq51) it3.next()).a, promoId)) {
                                        i8++;
                                    }
                                }
                                map = kotlin.collections.b.o(map, new Pair(zd8Var.a, Integer.valueOf(i8 < 0 ? 0 : i8)));
                            }
                        }
                        return bq8.a(bq8Var, r8j0Var, null, false, null, nhq0Var2, null, map, SamsungPayState.a(bq8Var.j, null, null, null, false, null, linkedHashMap, 63), null, 14766);
                    }
                    int size = list.size();
                    nhq0Var = bq8Var.e;
                    if (size <= nhq0Var.a) {
                        nhq0Var = new nhq0(0, false);
                    }
                }
                nhq0Var2 = nhq0Var;
                Map map2 = bq8Var.i;
                initialPosition = bq8Var.f;
                bVar.getClass();
                if (initialPosition != null) {
                    ArrayList arrayList3 = new ArrayList();
                    while (r1.hasNext()) {
                    }
                    it = arrayList3.iterator();
                    while (true) {
                        if (it.hasNext()) {
                        }
                    }
                    zd8Var = (zd8) obj2;
                    if (zd8Var != null) {
                    }
                }
                return bq8.a(bq8Var, r8j0Var, null, false, null, nhq0Var2, null, map2, SamsungPayState.a(bq8Var.j, null, null, null, false, null, linkedHashMap, 63), null, 14766);
            case 8:
                w8v w8vVar = (w8v) this.b;
                ExecutorService executorService = (ExecutorService) this.c;
                tls tlsVar2 = (tls) this.w;
                iy40 iy40Var = (iy40) this.x;
                oz40 oz40Var = (oz40) this.y;
                bs8 bs8Var = (bs8) obj;
                if (System.currentTimeMillis() - iy40Var.getLongValue() > 500) {
                    iy40Var.setLongValue(System.currentTimeMillis());
                    c.b(oz40Var, false);
                    if (bs8Var.equals(yr8.a)) {
                        a0 a0Var = new a0(23, tlsVar2);
                        File createTempFile = File.createTempFile("IMG_", ".jpg");
                        w8vVar.O(new r1s(createTempFile, (OutputStream) null, (s8v) null), executorService, new md6(18, a0Var, createTempFile));
                    } else {
                        tlsVar2.invoke(bs8Var);
                    }
                }
                return zy11.a;
            case 9:
                wls wlsVar = (wls) this.b;
                xjj xjjVar = (xjj) this.c;
                wls wlsVar2 = (wls) this.w;
                wls wlsVar3 = (wls) this.x;
                oz40 oz40Var2 = (oz40) this.y;
                hoy0 hoy0Var2 = (hoy0) obj;
                String str9 = (String) wlsVar.invoke(hoy0Var2.a.b, xjjVar.e);
                if (((Boolean) wlsVar2.invoke(str9, xjjVar.e)).booleanValue()) {
                    oz40Var2.setValue(hoy0.b(hoy0Var2, str9, 0L, 6));
                    wlsVar3.invoke(str9, xjjVar.f);
                }
                return zy11.a;
            case 10:
                l9w l9wVar = (l9w) this.b;
                IntercityToSummaryNavigationSource intercityToSummaryNavigationSource = (IntercityToSummaryNavigationSource) this.c;
                String str10 = (String) this.w;
                String str11 = (String) this.x;
                sls slsVar2 = (sls) this.y;
                Object value = ((Result) obj).getValue();
                if (value instanceof Result.Failure) {
                    slsVar = slsVar2;
                    obj3 = value;
                } else {
                    l9wVar.g.b();
                    ZoneAddress f3 = l9wVar.e.f();
                    Address a = l9wVar.e.a();
                    Preorder preorder = l9wVar.e.a;
                    Calendar g = preorder.g();
                    String str12 = preorder.S.c;
                    String str13 = preorder.R;
                    Integer num3 = preorder.S.e;
                    List list2 = preorder.x;
                    String d = preorder.d();
                    if (f3 != null) {
                        int i9 = k9w.a[intercityToSummaryNavigationSource.ordinal()];
                        if (i9 == 1) {
                            djv0Var = djv0.a;
                        } else {
                            if (i9 != 2) {
                                w511.b();
                                return null;
                            }
                            djv0Var = null;
                        }
                        slsVar = slsVar2;
                        obj3 = value;
                        fcj0 fcj0Var = new fcj0(new bov0(true, (khv0) new bhv0(0), (ijv0) djv0Var, 8));
                        fcj0Var.b = str10;
                        fcj0Var.c = str11;
                        k9s0 k9s0Var = new k9s0(fcj0Var);
                        cre0 cre0Var = new cre0();
                        cre0Var.a = str11;
                        cre0Var.b = f3;
                        cre0Var.c = a;
                        cre0Var.d = g;
                        cre0Var.i = num3;
                        cre0Var.e = str12;
                        cre0Var.f = str13;
                        cre0Var.g = !l9wVar.f.a(new SuitabilityCheckType[0]);
                        cre0Var.h = "show summary from intercity";
                        cre0Var.j = list2;
                        cre0Var.k = d;
                        ((pep0) l9wVar.h).f((m950) l9wVar.d.get(), new mre0(cre0Var.a(), k9s0Var), hxx.a);
                    } else {
                        slsVar = slsVar2;
                        obj3 = value;
                        jst.e.s(new IllegalArgumentException("Source addresses is null:"));
                    }
                }
                if (Result.a(obj3) != null) {
                    slsVar.invoke();
                }
                return zy11.a;
            case 11:
                pv0 pv0Var = (pv0) this.b;
                p4l0 p4l0Var = (p4l0) this.c;
                ihv0 ihv0Var = (ihv0) this.w;
                ynv0 ynv0Var = (ynv0) this.x;
                RouteData$Continuation routeData$Continuation = (RouteData$Continuation) this.y;
                sqe0 sqe0Var = (sqe0) obj;
                u1l0 u1l0Var = ((n4l0) p4l0Var).a;
                pv0 pv0Var2 = u1l0Var.b;
                qq80 qq80Var = u1l0Var.q;
                sqe0Var.a.h0.a = true;
                sqe0Var.a.b0(ihv0Var, pv0Var, ynv0Var, routeData$Continuation, true);
                com.yandex.go.preorder.navigation.c.R(sqe0Var.a, pv0Var2, qq80Var);
                return zy11.a;
            case 12:
                ks10 ks10Var = (ks10) this.b;
                SuggestButton suggestButton = (SuggestButton) this.c;
                AiBotDirective aiBotDirective = (AiBotDirective) this.x;
                ks10Var.c.a.reportEvent("ai_bot_suggest_directive_parse_error", kotlin.collections.b.i(new Pair("suggest_text", suggestButton.getText()), new Pair("suggest_elementId", suggestButton.getElementId()), new Pair("suggest_callback_data", suggestButton.getCallbackData()), new Pair("message_id", (String) this.w), new Pair("chat_id", (String) this.y), new Pair("wrong_directive_type", aiBotDirective.getType()), new Pair("wrong_directive_name", aiBotDirective.getName()), new Pair("wrong_directive_payload", aiBotDirective.getPayload()), new Pair("error_message", ((Throwable) obj).getMessage())));
                return zy11.a;
            case 13:
                q qVar = (q) this.b;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.c;
                Ref$FloatRef ref$FloatRef = (Ref$FloatRef) this.w;
                y yVar = (y) this.x;
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) this.y;
                float floatValue = ((Float) obj).floatValue();
                hb30 g2 = q.g(qVar.g);
                if (g2 != null) {
                    kjj kjjVar = qVar.e;
                    long j3 = g2.b;
                    long j4 = g2.a;
                    kjjVar.a.a(Float.intBitsToFloat((int) (j4 >> 32)), j3);
                    kjjVar.b.a(Float.intBitsToFloat((int) (j4 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)), j3);
                    ?? a2 = ((hb30) ref$ObjectRef.element).a(g2);
                    ref$ObjectRef.element = a2;
                    ref$FloatRef.element = yVar.i(yVar.e(a2.a));
                    ref$BooleanRef.element = !iob1.a(r1 - floatValue);
                }
                return Boolean.valueOf(g2 != null);
            case 14:
                Drawable drawable = (Drawable) this.b;
                List list3 = (List) this.c;
                List list4 = (List) this.w;
                xo40 xo40Var = (xo40) this.x;
                ArrayList<h58> arrayList4 = (ArrayList) this.y;
                qam qamVar = (qam) obj;
                float intBitsToFloat = Float.intBitsToFloat((int) (qamVar.c() >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (qamVar.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                if (intBitsToFloat > 0.0f && intBitsToFloat2 > 0.0f && drawable != null) {
                    int intrinsicWidth = drawable.getIntrinsicWidth();
                    Integer valueOf = Integer.valueOf(intrinsicWidth);
                    if (intrinsicWidth <= 0) {
                        valueOf = null;
                    }
                    if (valueOf != null) {
                        int intValue = valueOf.intValue();
                        int intrinsicHeight = drawable.getIntrinsicHeight();
                        Integer valueOf2 = Integer.valueOf(intrinsicHeight);
                        if (intrinsicHeight <= 0) {
                            valueOf2 = null;
                        }
                        if (valueOf2 != null) {
                            float f4 = intValue;
                            float intValue2 = valueOf2.intValue();
                            float min = Math.min(intBitsToFloat / f4, intBitsToFloat2 / intValue2);
                            f = min <= 1.0f ? min : 1.0f;
                            float f5 = f4 * f;
                            float f6 = intValue2 * f;
                            float f7 = (intBitsToFloat - f5) / 2.0f;
                            float f8 = (intBitsToFloat2 - f6) / 2.0f;
                            float f9 = f5 / 1152.0f;
                            float f10 = f6 / 432.0f;
                            Iterator it4 = list3.iterator();
                            while (it4.hasNext()) {
                                hqb1.d(qamVar, (Drawable) it4.next(), f7, f8, f5, f6);
                            }
                            hqb1.d(qamVar, drawable, f7, f8, f5, f6);
                            Iterator it5 = list4.iterator();
                            while (it5.hasNext()) {
                                hqb1.d(qamVar, (Drawable) it5.next(), f7, f8, f5, f6);
                            }
                            l8v l8vVar = xo40Var.b;
                            if (l8vVar != null) {
                                Bitmap bitmap = ((u92) l8vVar).a;
                                int width = bitmap.getWidth();
                                Integer valueOf3 = Integer.valueOf(width);
                                if (width <= 0) {
                                    valueOf3 = null;
                                }
                                int intValue3 = valueOf3 != null ? valueOf3.intValue() : 150;
                                int height = bitmap.getHeight();
                                Integer valueOf4 = height > 0 ? Integer.valueOf(height) : null;
                                qam.S(qamVar, l8vVar, 0L, (((int) ((intBitsToFloat / 2.0f) - (intValue3 / 2.0f))) << 32) | (((int) ((350.0f * f10) - r12)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), (intValue3 << 32) | ((valueOf4 != null ? valueOf4.intValue() : 150) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), 0.0f, null, 0, 998);
                            }
                            for (h58 h58Var : arrayList4) {
                                ywy ywyVar = (ywy) h58Var.b.getValue();
                                if (ywyVar instanceof xwy) {
                                    s78 s78Var = h58Var.a.b;
                                    n8v n8vVar = ((xwy) ywyVar).a;
                                    float f11 = ((s78Var.a * f9) + f7) - 30.0f;
                                    float f12 = ((s78Var.b * f10) + f8) - 60.0f;
                                    nfh N = qamVar.N();
                                    c = c2;
                                    long v = N.v();
                                    N.q().save();
                                    try {
                                        cot cotVar = (cot) N.a;
                                        cotVar.n(f11, f12);
                                        j = j2;
                                        cotVar.j(s78Var.c, (Float.floatToRawIntBits(30.0f) << c) | (Float.floatToRawIntBits(60.0f) & j));
                                        qam.S(qamVar, n8vVar.b, 0L, 0L, 257698037880L, 0.0f, null, 0, 998);
                                    } finally {
                                        b64.C(N, v);
                                    }
                                } else {
                                    c = c2;
                                    j = j2;
                                }
                                c2 = c;
                                j2 = j;
                            }
                        }
                    }
                }
                return zy11.a;
            case 15:
                NetworkServiceRetryingStrategy networkServiceRetryingStrategy2 = (NetworkServiceRetryingStrategy) this.b;
                e100 e100Var = (e100) this.c;
                return (((NetworkServiceRetryingStrategy) obj) != NetworkServiceRetryingStrategy.retryOnce || networkServiceRetryingStrategy2 == (networkServiceRetryingStrategy = NetworkServiceRetryingStrategy.noRetry)) ? zmx.c(((h060) e100Var.w).i((NetworkServiceError) this.y)) : e100Var.f((hz50) this.w, (tls) this.x, networkServiceRetryingStrategy);
            case 16:
                CharSequence charSequence = (CharSequence) this.b;
                CharSequence charSequence2 = (CharSequence) this.c;
                CharSequence charSequence3 = (CharSequence) this.w;
                xk60 xk60Var = (xk60) this.x;
                CharSequence charSequence4 = (CharSequence) this.y;
                RemoteViews remoteViews = (RemoteViews) obj;
                remoteViews.setTextViewText(ueh0.notification_title, charSequence);
                remoteViews.setTextViewText(ueh0.notification_description, charSequence2);
                remoteViews.setTextViewText(ueh0.notification_car_number, charSequence3);
                remoteViews.setTextColor(ueh0.notification_car_number, ((avj0) xk60Var.c).a(rqg0.notification_plates_text));
                if (charSequence4 != null) {
                    remoteViews.setTextViewText(ueh0.notification_car_region, charSequence4);
                    remoteViews.setTextColor(ueh0.notification_car_region, ((avj0) xk60Var.c).a(rqg0.notification_plates_text));
                    remoteViews.setViewVisibility(ueh0.notification_car_region, 0);
                } else {
                    remoteViews.setViewVisibility(ueh0.notification_car_region, 8);
                }
                return zy11.a;
            case 17:
                aia0 aia0Var = (aia0) this.b;
                String str14 = (String) this.w;
                aq80 aq80Var = (aq80) this.c;
                oy80 oy80Var4 = (oy80) this.x;
                String str15 = (String) this.y;
                bt5 bt5Var5 = aia0Var.a;
                rwo rwoVar2 = bt5Var5.g;
                sv90 sv90Var = qv90.a;
                boolean z = bt5Var5.p;
                sv90Var.getClass();
                iho f13 = xvz.f(0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Оплата через Систему Быстрых Платежей с возможностью привязки СБП токена ".concat(z ? "через PSP" : "через Trust"), z ? "new_sbp_payment_v2" : "new_sbp_payment");
                md51 a3 = bt5Var5.a(str14);
                lc0 lc0Var = new lc0(bt5Var5, str15, aq80Var, oy80Var4, 6);
                ymx ymxVar = (ymx) a3;
                ymxVar.getClass();
                md51 j5 = ymx.j(ymxVar, lc0Var, null, 5);
                ((y22) rwoVar2).b(f13, j5);
                return j5;
            case 18:
                yal0 yal0Var = (yal0) this.b;
                sze0 sze0Var = (sze0) this.c;
                Map map3 = (Map) this.w;
                fef fefVar = (fef) this.x;
                Set set = (Set) this.y;
                ServiceLevel.HighlightedTariffs.HighlightedPrice highlightedPrice = (ServiceLevel.HighlightedTariffs.HighlightedPrice) obj;
                Iterator it6 = yal0Var.b.iterator();
                while (true) {
                    if (it6.hasNext()) {
                        obj4 = it6.next();
                        if (jl40.l(((ServiceLevel) obj4).f, highlightedPrice.a)) {
                        }
                    } else {
                        obj4 = null;
                    }
                }
                ServiceLevel serviceLevel = (ServiceLevel) obj4;
                if (serviceLevel == null || (priceMeta = serviceLevel.h) == null) {
                    return null;
                }
                String str16 = highlightedPrice.e;
                HashMap hashMap = new HashMap(priceMeta.a);
                hashMap.putAll(highlightedPrice.f);
                v0f0 h2 = sze0Var.h(map3, new PriceMeta(hashMap, gw00.e(new Pair("selector", str16))), fefVar, str16, set);
                if (h2 == null) {
                    return null;
                }
                return new Pair(highlightedPrice.a, h2);
            case 19:
                k1l0 k1l0Var = (k1l0) this.b;
                o2y0 o2y0Var = (o2y0) this.c;
                RouteChangeWarning routeChangeWarning = (RouteChangeWarning) this.w;
                d1l0 d1l0Var = (d1l0) this.x;
                RouteChangeType routeChangeType = (RouteChangeType) this.y;
                sy60 sy60Var = (sy60) obj;
                ci70 ci70Var = k1l0Var.H;
                String str17 = o2y0Var.b().a;
                ci70Var.getClass();
                int i10 = bi70.e[routeChangeWarning.ordinal()];
                ci70Var.b.a(ci70Var.b(str17), i10 != 1 ? i10 != 2 ? "changeDestination" : "changeMidPoint" : "addMidPoint", "confirmed");
                k1l0Var.F.a(d1l0Var.a, routeChangeType);
                sy60Var.a();
                return zy11.a;
            case 20:
                lbn0 lbn0Var = (lbn0) this.b;
                h hVar = (h) this.c;
                ueo0 ueo0Var = (ueo0) this.x;
                ScootersPassesFromScreen scootersPassesFromScreen = (ScootersPassesFromScreen) this.y;
                String str18 = (String) this.w;
                sco0 sco0Var = (sco0) obj;
                lbn0Var.Fg(sco0Var);
                hVar.Q = true;
                hVar.R(sco0Var, ueo0Var, scootersPassesFromScreen, str18);
                return zy11.a;
            case 21:
                return new s((com.yandex.go.shortcuts.impl.ui.shortcutview.a) this.b, (ru.yandex.taxi.widget.c) this.c, (t4s0) this.w, (View) obj, (j1s0) this.x, (ip11) this.y);
            case 22:
                oz40 oz40Var3 = (oz40) this.y;
                rzx rzxVar = (rzx) this.b;
                ghe gheVar = (ghe) this.c;
                oz40 oz40Var4 = (oz40) this.w;
                oz40 oz40Var5 = (oz40) this.x;
                rzx rzxVar2 = (rzx) obj;
                oz40Var3.setValue(rzxVar2);
                com.yandex.go.settings.presentation.c.b(rzxVar, gheVar, 0.5f, oz40Var4, oz40Var5, rzxVar2);
                return zy11.a;
            case 23:
                t611 t611Var = (t611) this.b;
                List list5 = (List) this.c;
                tls tlsVar3 = (tls) this.w;
                u611 u611Var = (u611) this.x;
                wls wlsVar4 = (wls) this.y;
                u6y u6yVar = (u6y) obj;
                if (t611Var != null) {
                    u6y.b(u6yVar, t611Var.a, new androidx.compose.runtime.internal.a(-1016445366, new hvx0(t611Var, tlsVar3, i4), true), 2);
                }
                ((m6y) u6yVar).f(list5.size(), new pcx0(new pjv0(15), list5), new pcx0(list5, i2), new androidx.compose.runtime.internal.a(2039820996, new yc0(13, list5, u611Var, wlsVar4), true));
                return zy11.a;
            case 24:
                androidx.compose.foundation.text.input.internal.b bVar2 = (androidx.compose.foundation.text.input.internal.b) this.b;
                iv60 iv60Var = (iv60) this.c;
                hoy0 hoy0Var3 = (hoy0) this.w;
                oay oayVar = (oay) this.x;
                ml6 ml6Var = (ml6) this.y;
                c1y c1yVar = (c1y) obj;
                c1yVar.a();
                float floatValue2 = bVar2.c.getFloatValue();
                if (floatValue2 != 0.0f) {
                    long j6 = hoy0Var3.b;
                    int i11 = asy0.c;
                    int r = iv60Var.r((int) (j6 >> 32));
                    ery0 d2 = oayVar.d();
                    zii0 zii0Var = (d2 == null || (dry0Var = d2.a) == null) ? new zii0(0.0f, 0.0f, 0.0f, 0.0f) : dry0Var.c(r);
                    float floor = (float) Math.floor(c1yVar.w0(2.0f));
                    f = floor >= 1.0f ? floor : 1.0f;
                    float f14 = f / 2.0f;
                    float f15 = zii0Var.a + f14;
                    float intBitsToFloat3 = Float.intBitsToFloat((int) (c1yVar.a.c() >> 32)) - f14;
                    if (f15 > intBitsToFloat3) {
                        f15 = intBitsToFloat3;
                    }
                    if (f15 >= f14) {
                        f14 = f15;
                    }
                    float floor2 = ((int) f) % 2 == 1 ? ((float) Math.floor(f14)) + 0.5f : (float) Math.rint(f14);
                    qam.p0(c1yVar, ml6Var, (Float.floatToRawIntBits(floor2) << 32) | (Float.floatToRawIntBits(zii0Var.b) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), (Float.floatToRawIntBits(floor2) << 32) | (Float.floatToRawIntBits(zii0Var.d) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), f, floatValue2, 432);
                }
                return zy11.a;
            case 25:
                final n70 n70Var = (n70) this.b;
                Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) this.c;
                final uq01 uq01Var = (uq01) this.w;
                Ref$ObjectRef ref$ObjectRef3 = (Ref$ObjectRef) this.x;
                uq01 uq01Var2 = (uq01) this.y;
                r961 r961Var = (r961) n70Var.N;
                r961Var.a.getEditTextLayout().setMinimumHeight(rje.d(vvg0.ybsdk_loadable_input_height, n70Var.P));
                LoadableInput loadableInput = r961Var.a;
                loadableInput.setPadding(loadableInput.getPaddingLeft(), ((vqj0) n70Var.Z()).o, loadableInput.getPaddingRight(), loadableInput.getPaddingBottom());
                LoadableInput.render$default(loadableInput, false, new zjy0(9, n70Var, ((vqj0) n70Var.Z()).d ? ((vqj0) n70Var.Z()).e : ((vqj0) n70Var.Z()).g, r961Var), 1, null);
                h9s h9sVar = ((vqj0) n70Var.Z()).h;
                if (h9sVar != null) {
                    if (ref$ObjectRef2.element == 0) {
                        ref$ObjectRef2.element = new FormatTextWatcher(h9sVar, loadableInput.getEditText(), ((vqj0) n70Var.Z()).c, !((vqj0) n70Var.Z()).d, new dl01(i3, uq01Var, n70Var));
                    }
                } else if (ref$ObjectRef3.element == 0) {
                    EditText editText = loadableInput.getEditText();
                    ?? r7 = new TextWatcher() { // from class: com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.adapter.TransferRequisiteAdapterDelegateKt$requisiteFieldAdapterDelegate$lambda$11$lambda$9$lambda$8$lambda$5$$inlined$doAfterTextChanged$1
                        @Override // android.text.TextWatcher
                        public void afterTextChanged(Editable s) {
                            wls.this.invoke(((vqj0) n70Var.Z()).a, String.valueOf(s));
                        }

                        @Override // android.text.TextWatcher
                        public void beforeTextChanged(CharSequence text, int start, int count, int after) {
                        }

                        @Override // android.text.TextWatcher
                        public void onTextChanged(CharSequence text, int start, int before, int count) {
                        }
                    };
                    editText.addTextChangedListener(r7);
                    ref$ObjectRef3.element = r7;
                }
                loadableInput.setOnClickListener(new vmu0(20, n70Var));
                loadableInput.getEditText().setOnFocusChangeListener(new idd0(i4, n70Var, r961Var, uq01Var2));
                return zy11.a;
            case 26:
                Set set2 = (Set) this.b;
                com.yandex.messaging.internal.translator.j jVar = (com.yandex.messaging.internal.translator.j) this.c;
                LinkedHashSet linkedHashSet = (LinkedHashSet) this.w;
                Ref$LongRef ref$LongRef = (Ref$LongRef) this.x;
                Ref$LongRef ref$LongRef2 = (Ref$LongRef) this.y;
                l020 l020Var = (l020) obj;
                Iterator it7 = set2.iterator();
                while (it7.hasNext()) {
                    long longValue = ((Number) it7.next()).longValue();
                    o1b0 o1b0Var = jVar.f;
                    ndz0 ndz0Var = l020Var.D;
                    long j7 = o1b0Var.a;
                    ArrayList i12 = ndz0Var.i(j7, longValue);
                    if (i12 != null) {
                        if ((!i12.isEmpty() ? i12 : null) != null) {
                            l020Var.z.i(j7, i12);
                            linkedHashSet.add(Long.valueOf(longValue));
                        }
                    }
                    ref$LongRef.element = Math.min(ref$LongRef.element, longValue);
                    ref$LongRef2.element = Math.max(ref$LongRef2.element, longValue);
                }
                return zy11.a;
            case 27:
                return new i((sls) this.b, (oz40) this.y, (oz40) this.c, (tse) this.w, (zx40) this.x);
            default:
                LogoutBottomsheetWish logoutBottomsheetWish = (LogoutBottomsheetWish) this.b;
                sls slsVar3 = (sls) this.c;
                tls tlsVar4 = (tls) this.w;
                sls slsVar4 = (sls) this.x;
                oz40 oz40Var6 = (oz40) this.y;
                int i13 = x.a[logoutBottomsheetWish.ordinal()];
                if (i13 == 1 || i13 == 2) {
                    slsVar3.invoke();
                } else if (i13 == 3) {
                    tlsVar4.invoke(LogoutBehaviour.DROP_CLIENT_TOKEN);
                } else if (i13 == 4) {
                    tlsVar4.invoke(LogoutBehaviour.DROP_X_TOKEN);
                } else {
                    if (i13 != 5) {
                        w511.b();
                        return null;
                    }
                    slsVar4.invoke();
                }
                oz40Var6.setValue(Boolean.FALSE);
                return zy11.a;
        }
    }

    public /* synthetic */ u50(ks10 ks10Var, SuggestButton suggestButton, AiBotDirective aiBotDirective, String str, String str2) {
        this.a = 12;
        this.b = ks10Var;
        this.c = suggestButton;
        this.x = aiBotDirective;
        this.w = str;
        this.y = str2;
    }

    public /* synthetic */ u50(oz40 oz40Var, rzx rzxVar, ghe gheVar, oz40 oz40Var2, oz40 oz40Var3) {
        this.a = 22;
        this.y = oz40Var;
        this.b = rzxVar;
        this.c = gheVar;
        this.w = oz40Var2;
        this.x = oz40Var3;
    }

    public /* synthetic */ u50(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
        this.x = obj4;
        this.y = obj5;
    }

    public /* synthetic */ u50(Object obj, Object obj2, Object obj3, Object obj4, String str, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.x = obj3;
        this.y = obj4;
        this.w = str;
    }

    public /* synthetic */ u50(Object obj, String str, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.w = str;
        this.c = obj2;
        this.x = obj3;
        this.y = obj4;
    }
}
