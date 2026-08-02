package ru.yandex.taxi.masstransit.paymentcards;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.yandex.go.payments.payment.TransportCardPayment$CardStatusDomain;
import defpackage.a111;
import defpackage.bia0;
import defpackage.bvf0;
import defpackage.d111;
import defpackage.d610;
import defpackage.evu0;
import defpackage.g610;
import defpackage.g8e;
import defpackage.h111;
import defpackage.ike;
import defpackage.jl40;
import defpackage.kdc;
import defpackage.lz30;
import defpackage.m6a0;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.p011;
import defpackage.pdc;
import defpackage.pkf;
import defpackage.pwy0;
import defpackage.pzt0;
import defpackage.q111;
import defpackage.q2h0;
import defpackage.qy90;
import defpackage.r011;
import defpackage.sjh;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.ufu;
import defpackage.uyj;
import defpackage.v011;
import defpackage.vng;
import defpackage.w011;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.internal.g;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.payment_options.model.PaymentIconType;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes6.dex */
public final class d implements v011 {
    public final Context a;
    public final e b;
    public final ru.yandex.taxi.widget.c c;
    public final pdc d;
    public final g610 e;
    public final pwy0 f;
    public final com.yandex.go.payments.transport.domain.a g;
    public final lz30 h;
    public final bia0 i;
    public final ike j;
    public pzt0 k;

    public d(Context context, e eVar, ru.yandex.taxi.widget.c cVar, pdc pdcVar, g610 g610Var, pwy0 pwy0Var, com.yandex.go.payments.transport.domain.a aVar, lz30 lz30Var, bia0 bia0Var, tt2 tt2Var) {
        this.a = context;
        this.b = eVar;
        this.c = cVar;
        this.d = pdcVar;
        this.e = g610Var;
        this.f = pwy0Var;
        this.g = aVar;
        this.h = lz30Var;
        this.i = bia0Var;
        tt2Var.getClass();
        sjh sjhVar = uyj.a;
        this.j = bvf0.a(mdh.b.plus(jl40.a()));
    }

    public final void a(tpr tprVar) {
        pzt0 pzt0Var = this.k;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.k = null;
        this.k = tje.N(this.j, null, null, new TransportCardInteractorImpl$attach$1(this, tprVar, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.CharSequence] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(q111 q111Var, ThemeType themeType, ContinuationImpl continuationImpl) {
        TransportCardInteractorImpl$mapTransportCardAdvertisementState$1 transportCardInteractorImpl$mapTransportCardAdvertisementState$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        q111 q111Var2;
        d610.a aVar;
        ThemeType themeType2;
        Object f;
        BitmapDrawable bitmapDrawable;
        UiStateDrawableWrapper g;
        UiStateDrawableWrapper g2;
        String str;
        String str2;
        int i2;
        q111 q111Var3;
        if (continuationImpl instanceof TransportCardInteractorImpl$mapTransportCardAdvertisementState$1) {
            transportCardInteractorImpl$mapTransportCardAdvertisementState$1 = (TransportCardInteractorImpl$mapTransportCardAdvertisementState$1) continuationImpl;
            int i3 = transportCardInteractorImpl$mapTransportCardAdvertisementState$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                transportCardInteractorImpl$mapTransportCardAdvertisementState$1.label = i3 - Integer.MIN_VALUE;
                Object obj = transportCardInteractorImpl$mapTransportCardAdvertisementState$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transportCardInteractorImpl$mapTransportCardAdvertisementState$1.label;
                e eVar = this.b;
                if (i != 0) {
                    kotlin.b.b(obj);
                    d610.a aVar2 = q111Var.b;
                    String str3 = aVar2.b;
                    transportCardInteractorImpl$mapTransportCardAdvertisementState$1.L$0 = q111Var;
                    transportCardInteractorImpl$mapTransportCardAdvertisementState$1.L$1 = themeType;
                    transportCardInteractorImpl$mapTransportCardAdvertisementState$1.L$2 = aVar2;
                    transportCardInteractorImpl$mapTransportCardAdvertisementState$1.label = 1;
                    Object f2 = e.f(eVar, str3, null, transportCardInteractorImpl$mapTransportCardAdvertisementState$1, 6);
                    if (f2 != coroutineSingletons) {
                        q111Var2 = q111Var;
                        aVar = aVar2;
                        obj = f2;
                        themeType2 = themeType;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i2 = transportCardInteractorImpl$mapTransportCardAdvertisementState$1.I$0;
                        ?? r1 = (CharSequence) transportCardInteractorImpl$mapTransportCardAdvertisementState$1.L$8;
                        ?? r4 = (CharSequence) transportCardInteractorImpl$mapTransportCardAdvertisementState$1.L$7;
                        g2 = (UiStateDrawableWrapper) transportCardInteractorImpl$mapTransportCardAdvertisementState$1.L$6;
                        g = (UiStateDrawableWrapper) transportCardInteractorImpl$mapTransportCardAdvertisementState$1.L$5;
                        q111Var3 = (q111) transportCardInteractorImpl$mapTransportCardAdvertisementState$1.L$0;
                        kotlin.b.b(obj);
                        str2 = r1;
                        str = r4;
                        return new h111(g, g2, str, str2, null, i2 == 0, (CharSequence) obj, TransportCardAction.ADD_TRANSPORT_CARD, q111Var3.b.d, new p011(null, TransportCardStatus.Advertisement, null, EmptyList.a));
                    }
                    bitmapDrawable = (BitmapDrawable) transportCardInteractorImpl$mapTransportCardAdvertisementState$1.L$3;
                    themeType2 = (ThemeType) transportCardInteractorImpl$mapTransportCardAdvertisementState$1.L$1;
                    q111 q111Var4 = (q111) transportCardInteractorImpl$mapTransportCardAdvertisementState$1.L$0;
                    kotlin.b.b(obj);
                    q111Var2 = q111Var4;
                    g = pkf.g((BitmapDrawable) obj, "card_drawable", null);
                    g2 = pkf.g(bitmapDrawable, "card_status_icon", themeType2);
                    String str4 = q111Var2.c;
                    FormattedText formattedText = q111Var2.d;
                    transportCardInteractorImpl$mapTransportCardAdvertisementState$1.L$0 = q111Var2;
                    transportCardInteractorImpl$mapTransportCardAdvertisementState$1.L$1 = null;
                    transportCardInteractorImpl$mapTransportCardAdvertisementState$1.L$2 = null;
                    transportCardInteractorImpl$mapTransportCardAdvertisementState$1.L$3 = null;
                    transportCardInteractorImpl$mapTransportCardAdvertisementState$1.L$4 = null;
                    transportCardInteractorImpl$mapTransportCardAdvertisementState$1.L$5 = g;
                    transportCardInteractorImpl$mapTransportCardAdvertisementState$1.L$6 = g2;
                    transportCardInteractorImpl$mapTransportCardAdvertisementState$1.L$7 = str4;
                    transportCardInteractorImpl$mapTransportCardAdvertisementState$1.L$8 = str4;
                    transportCardInteractorImpl$mapTransportCardAdvertisementState$1.I$0 = 0;
                    transportCardInteractorImpl$mapTransportCardAdvertisementState$1.label = 3;
                    obj = ru.yandex.taxi.widget.c.i(this.c, formattedText, null, transportCardInteractorImpl$mapTransportCardAdvertisementState$1, 30);
                    if (obj != coroutineSingletons) {
                        str = str4;
                        str2 = str;
                        i2 = 0;
                        q111Var3 = q111Var2;
                        return new h111(g, g2, str, str2, null, i2 == 0, (CharSequence) obj, TransportCardAction.ADD_TRANSPORT_CARD, q111Var3.b.d, new p011(null, TransportCardStatus.Advertisement, null, EmptyList.a));
                    }
                    return coroutineSingletons;
                }
                aVar = (d610.a) transportCardInteractorImpl$mapTransportCardAdvertisementState$1.L$2;
                themeType2 = (ThemeType) transportCardInteractorImpl$mapTransportCardAdvertisementState$1.L$1;
                q111Var2 = (q111) transportCardInteractorImpl$mapTransportCardAdvertisementState$1.L$0;
                kotlin.b.b(obj);
                BitmapDrawable bitmapDrawable2 = (BitmapDrawable) obj;
                String str5 = aVar.a;
                transportCardInteractorImpl$mapTransportCardAdvertisementState$1.L$0 = q111Var2;
                transportCardInteractorImpl$mapTransportCardAdvertisementState$1.L$1 = themeType2;
                transportCardInteractorImpl$mapTransportCardAdvertisementState$1.L$2 = null;
                transportCardInteractorImpl$mapTransportCardAdvertisementState$1.L$3 = bitmapDrawable2;
                transportCardInteractorImpl$mapTransportCardAdvertisementState$1.label = 2;
                f = e.f(eVar, str5, null, transportCardInteractorImpl$mapTransportCardAdvertisementState$1, 6);
                if (f != coroutineSingletons) {
                    obj = f;
                    bitmapDrawable = bitmapDrawable2;
                    g = pkf.g((BitmapDrawable) obj, "card_drawable", null);
                    g2 = pkf.g(bitmapDrawable, "card_status_icon", themeType2);
                    String str42 = q111Var2.c;
                    FormattedText formattedText2 = q111Var2.d;
                    transportCardInteractorImpl$mapTransportCardAdvertisementState$1.L$0 = q111Var2;
                    transportCardInteractorImpl$mapTransportCardAdvertisementState$1.L$1 = null;
                    transportCardInteractorImpl$mapTransportCardAdvertisementState$1.L$2 = null;
                    transportCardInteractorImpl$mapTransportCardAdvertisementState$1.L$3 = null;
                    transportCardInteractorImpl$mapTransportCardAdvertisementState$1.L$4 = null;
                    transportCardInteractorImpl$mapTransportCardAdvertisementState$1.L$5 = g;
                    transportCardInteractorImpl$mapTransportCardAdvertisementState$1.L$6 = g2;
                    transportCardInteractorImpl$mapTransportCardAdvertisementState$1.L$7 = str42;
                    transportCardInteractorImpl$mapTransportCardAdvertisementState$1.L$8 = str42;
                    transportCardInteractorImpl$mapTransportCardAdvertisementState$1.I$0 = 0;
                    transportCardInteractorImpl$mapTransportCardAdvertisementState$1.label = 3;
                    obj = ru.yandex.taxi.widget.c.i(this.c, formattedText2, null, transportCardInteractorImpl$mapTransportCardAdvertisementState$1, 30);
                    if (obj != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
        }
        transportCardInteractorImpl$mapTransportCardAdvertisementState$1 = new TransportCardInteractorImpl$mapTransportCardAdvertisementState$1(this, continuationImpl);
        Object obj2 = transportCardInteractorImpl$mapTransportCardAdvertisementState$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transportCardInteractorImpl$mapTransportCardAdvertisementState$1.label;
        e eVar2 = this.b;
        if (i != 0) {
        }
        BitmapDrawable bitmapDrawable22 = (BitmapDrawable) obj2;
        String str52 = aVar.a;
        transportCardInteractorImpl$mapTransportCardAdvertisementState$1.L$0 = q111Var2;
        transportCardInteractorImpl$mapTransportCardAdvertisementState$1.L$1 = themeType2;
        transportCardInteractorImpl$mapTransportCardAdvertisementState$1.L$2 = null;
        transportCardInteractorImpl$mapTransportCardAdvertisementState$1.L$3 = bitmapDrawable22;
        transportCardInteractorImpl$mapTransportCardAdvertisementState$1.label = 2;
        f = e.f(eVar2, str52, null, transportCardInteractorImpl$mapTransportCardAdvertisementState$1, 6);
        if (f != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01c6  */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.CharSequence] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(q111 q111Var, ThemeType themeType, ArrayList arrayList, ContinuationImpl continuationImpl) {
        TransportCardInteractorImpl$mapTransportCardExistingState$1 transportCardInteractorImpl$mapTransportCardExistingState$1;
        int i;
        d111 d111Var;
        a111 a111Var;
        String str;
        String str2;
        String str3;
        a111 a111Var2;
        Drawable t;
        Object i2;
        UiStateDrawableWrapper uiStateDrawableWrapper;
        UiStateDrawableWrapper uiStateDrawableWrapper2;
        String str4;
        String str5;
        kdc kdcVar;
        int i3;
        List list;
        int i4;
        String str6;
        Object obj;
        if (continuationImpl instanceof TransportCardInteractorImpl$mapTransportCardExistingState$1) {
            transportCardInteractorImpl$mapTransportCardExistingState$1 = (TransportCardInteractorImpl$mapTransportCardExistingState$1) continuationImpl;
            int i5 = transportCardInteractorImpl$mapTransportCardExistingState$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                transportCardInteractorImpl$mapTransportCardExistingState$1.label = i5 - Integer.MIN_VALUE;
                Object obj2 = transportCardInteractorImpl$mapTransportCardExistingState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transportCardInteractorImpl$mapTransportCardExistingState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    m6a0 a = this.h.a();
                    String str7 = (a != null ? a.a : null) == PaymentMethod$Type.TRANSPORT_CARD ? a.b : null;
                    if (str7 != null) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (jl40.l(((d111) obj).a, str7)) {
                                break;
                            }
                        }
                        d111 d111Var2 = (d111) obj;
                        if (d111Var2 != null) {
                            d111Var = d111Var2;
                            a111Var = d111Var == null ? d111Var.g : null;
                            PaymentIconType paymentIconType = !jl40.l(d111Var == null ? d111Var.k : null, "TROIKA CARD") ? PaymentIconType.TROYKA : PaymentIconType.TRANSPORT_CARD;
                            ((qy90) this.i).getClass();
                            int b = qy90.b(paymentIconType);
                            Context context = this.a;
                            Drawable y = tje.y(b, context);
                            str = "";
                            if (a111Var != null || (str2 = a111Var.a) == null) {
                                if (d111Var != null || (str2 = d111Var.d) == null) {
                                    str2 = null;
                                } else if (str2.length() > q111Var.e) {
                                    str2 = "";
                                }
                                if (str2 == null) {
                                    str2 = "";
                                }
                            }
                            if (d111Var != null || (str3 = d111Var.d) == null) {
                                str3 = null;
                            } else if (str3.length() > q111Var.e) {
                                str3 = "";
                            }
                            if (str3 == null) {
                                str3 = "";
                            }
                            if (a111Var != null && (str6 = a111Var.a) != null) {
                                str = str6;
                            }
                            String p = g8e.p(str3, " ", str);
                            a111Var2 = d111Var == null ? d111Var.g : null;
                            if (a111Var2 != null) {
                                if (a111Var2.b || a111Var2.d) {
                                    t = vng.t(q2h0.ic_await_badge_16, context);
                                } else if (a111Var2.c) {
                                    t = vng.t(q2h0.ic_error_badge_16, context);
                                }
                                kdc i6 = ((ufu) this.d).i(d111Var != null ? d111Var.j : null);
                                int i7 = (d111Var != null ? d111Var.l : null) == TransportCardPayment$CardStatusDomain.ACTIVE ? 1 : 0;
                                UiStateDrawableWrapper g = pkf.g(y, "card_drawable", null);
                                UiStateDrawableWrapper g2 = pkf.g(t, "card_status_icon", themeType);
                                String obj3 = evu0.k0(p).toString();
                                FormattedText formattedText = q111Var.d;
                                transportCardInteractorImpl$mapTransportCardExistingState$1.L$0 = null;
                                transportCardInteractorImpl$mapTransportCardExistingState$1.L$1 = null;
                                transportCardInteractorImpl$mapTransportCardExistingState$1.L$2 = arrayList;
                                transportCardInteractorImpl$mapTransportCardExistingState$1.L$3 = null;
                                transportCardInteractorImpl$mapTransportCardExistingState$1.L$4 = d111Var;
                                transportCardInteractorImpl$mapTransportCardExistingState$1.L$5 = a111Var;
                                transportCardInteractorImpl$mapTransportCardExistingState$1.L$6 = null;
                                transportCardInteractorImpl$mapTransportCardExistingState$1.L$7 = null;
                                transportCardInteractorImpl$mapTransportCardExistingState$1.L$8 = null;
                                transportCardInteractorImpl$mapTransportCardExistingState$1.L$9 = null;
                                transportCardInteractorImpl$mapTransportCardExistingState$1.L$10 = null;
                                transportCardInteractorImpl$mapTransportCardExistingState$1.L$11 = null;
                                transportCardInteractorImpl$mapTransportCardExistingState$1.L$12 = null;
                                transportCardInteractorImpl$mapTransportCardExistingState$1.L$13 = g;
                                transportCardInteractorImpl$mapTransportCardExistingState$1.L$14 = g2;
                                transportCardInteractorImpl$mapTransportCardExistingState$1.L$15 = str2;
                                transportCardInteractorImpl$mapTransportCardExistingState$1.L$16 = obj3;
                                transportCardInteractorImpl$mapTransportCardExistingState$1.L$17 = i6;
                                transportCardInteractorImpl$mapTransportCardExistingState$1.I$0 = i7;
                                transportCardInteractorImpl$mapTransportCardExistingState$1.I$1 = i7;
                                transportCardInteractorImpl$mapTransportCardExistingState$1.label = 1;
                                i2 = ru.yandex.taxi.widget.c.i(this.c, formattedText, null, transportCardInteractorImpl$mapTransportCardExistingState$1, 30);
                                if (i2 == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                uiStateDrawableWrapper = g;
                                uiStateDrawableWrapper2 = g2;
                                str4 = obj3;
                                str5 = str2;
                                kdcVar = i6;
                                i3 = i7;
                                obj2 = i2;
                                list = arrayList;
                                i4 = i3;
                            }
                            t = null;
                            kdc i62 = ((ufu) this.d).i(d111Var != null ? d111Var.j : null);
                            if ((d111Var != null ? d111Var.l : null) == TransportCardPayment$CardStatusDomain.ACTIVE) {
                            }
                            UiStateDrawableWrapper g3 = pkf.g(y, "card_drawable", null);
                            UiStateDrawableWrapper g22 = pkf.g(t, "card_status_icon", themeType);
                            String obj32 = evu0.k0(p).toString();
                            FormattedText formattedText2 = q111Var.d;
                            transportCardInteractorImpl$mapTransportCardExistingState$1.L$0 = null;
                            transportCardInteractorImpl$mapTransportCardExistingState$1.L$1 = null;
                            transportCardInteractorImpl$mapTransportCardExistingState$1.L$2 = arrayList;
                            transportCardInteractorImpl$mapTransportCardExistingState$1.L$3 = null;
                            transportCardInteractorImpl$mapTransportCardExistingState$1.L$4 = d111Var;
                            transportCardInteractorImpl$mapTransportCardExistingState$1.L$5 = a111Var;
                            transportCardInteractorImpl$mapTransportCardExistingState$1.L$6 = null;
                            transportCardInteractorImpl$mapTransportCardExistingState$1.L$7 = null;
                            transportCardInteractorImpl$mapTransportCardExistingState$1.L$8 = null;
                            transportCardInteractorImpl$mapTransportCardExistingState$1.L$9 = null;
                            transportCardInteractorImpl$mapTransportCardExistingState$1.L$10 = null;
                            transportCardInteractorImpl$mapTransportCardExistingState$1.L$11 = null;
                            transportCardInteractorImpl$mapTransportCardExistingState$1.L$12 = null;
                            transportCardInteractorImpl$mapTransportCardExistingState$1.L$13 = g3;
                            transportCardInteractorImpl$mapTransportCardExistingState$1.L$14 = g22;
                            transportCardInteractorImpl$mapTransportCardExistingState$1.L$15 = str2;
                            transportCardInteractorImpl$mapTransportCardExistingState$1.L$16 = obj32;
                            transportCardInteractorImpl$mapTransportCardExistingState$1.L$17 = i62;
                            transportCardInteractorImpl$mapTransportCardExistingState$1.I$0 = i7;
                            transportCardInteractorImpl$mapTransportCardExistingState$1.I$1 = i7;
                            transportCardInteractorImpl$mapTransportCardExistingState$1.label = 1;
                            i2 = ru.yandex.taxi.widget.c.i(this.c, formattedText2, null, transportCardInteractorImpl$mapTransportCardExistingState$1, 30);
                            if (i2 == coroutineSingletons) {
                            }
                        }
                    }
                    d111Var = (d111) kotlin.collections.a.R(arrayList);
                    if (d111Var == null) {
                    }
                    if (!jl40.l(d111Var == null ? d111Var.k : null, "TROIKA CARD")) {
                    }
                    ((qy90) this.i).getClass();
                    int b2 = qy90.b(paymentIconType);
                    Context context2 = this.a;
                    Drawable y2 = tje.y(b2, context2);
                    str = "";
                    if (a111Var != null) {
                    }
                    if (d111Var != null) {
                    }
                    str2 = null;
                    if (str2 == null) {
                    }
                    if (d111Var != null) {
                    }
                    str3 = null;
                    if (str3 == null) {
                    }
                    if (a111Var != null) {
                        str = str6;
                    }
                    String p2 = g8e.p(str3, " ", str);
                    if (d111Var == null) {
                    }
                    if (a111Var2 != null) {
                    }
                    t = null;
                    kdc i622 = ((ufu) this.d).i(d111Var != null ? d111Var.j : null);
                    if ((d111Var != null ? d111Var.l : null) == TransportCardPayment$CardStatusDomain.ACTIVE) {
                    }
                    UiStateDrawableWrapper g32 = pkf.g(y2, "card_drawable", null);
                    UiStateDrawableWrapper g222 = pkf.g(t, "card_status_icon", themeType);
                    String obj322 = evu0.k0(p2).toString();
                    FormattedText formattedText22 = q111Var.d;
                    transportCardInteractorImpl$mapTransportCardExistingState$1.L$0 = null;
                    transportCardInteractorImpl$mapTransportCardExistingState$1.L$1 = null;
                    transportCardInteractorImpl$mapTransportCardExistingState$1.L$2 = arrayList;
                    transportCardInteractorImpl$mapTransportCardExistingState$1.L$3 = null;
                    transportCardInteractorImpl$mapTransportCardExistingState$1.L$4 = d111Var;
                    transportCardInteractorImpl$mapTransportCardExistingState$1.L$5 = a111Var;
                    transportCardInteractorImpl$mapTransportCardExistingState$1.L$6 = null;
                    transportCardInteractorImpl$mapTransportCardExistingState$1.L$7 = null;
                    transportCardInteractorImpl$mapTransportCardExistingState$1.L$8 = null;
                    transportCardInteractorImpl$mapTransportCardExistingState$1.L$9 = null;
                    transportCardInteractorImpl$mapTransportCardExistingState$1.L$10 = null;
                    transportCardInteractorImpl$mapTransportCardExistingState$1.L$11 = null;
                    transportCardInteractorImpl$mapTransportCardExistingState$1.L$12 = null;
                    transportCardInteractorImpl$mapTransportCardExistingState$1.L$13 = g32;
                    transportCardInteractorImpl$mapTransportCardExistingState$1.L$14 = g222;
                    transportCardInteractorImpl$mapTransportCardExistingState$1.L$15 = str2;
                    transportCardInteractorImpl$mapTransportCardExistingState$1.L$16 = obj322;
                    transportCardInteractorImpl$mapTransportCardExistingState$1.L$17 = i622;
                    transportCardInteractorImpl$mapTransportCardExistingState$1.I$0 = i7;
                    transportCardInteractorImpl$mapTransportCardExistingState$1.I$1 = i7;
                    transportCardInteractorImpl$mapTransportCardExistingState$1.label = 1;
                    i2 = ru.yandex.taxi.widget.c.i(this.c, formattedText22, null, transportCardInteractorImpl$mapTransportCardExistingState$1, 30);
                    if (i2 == coroutineSingletons) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i4 = transportCardInteractorImpl$mapTransportCardExistingState$1.I$1;
                    i3 = transportCardInteractorImpl$mapTransportCardExistingState$1.I$0;
                    kdc kdcVar2 = (kdc) transportCardInteractorImpl$mapTransportCardExistingState$1.L$17;
                    ?? r5 = (CharSequence) transportCardInteractorImpl$mapTransportCardExistingState$1.L$16;
                    ?? r9 = (CharSequence) transportCardInteractorImpl$mapTransportCardExistingState$1.L$15;
                    UiStateDrawableWrapper uiStateDrawableWrapper3 = (UiStateDrawableWrapper) transportCardInteractorImpl$mapTransportCardExistingState$1.L$14;
                    UiStateDrawableWrapper uiStateDrawableWrapper4 = (UiStateDrawableWrapper) transportCardInteractorImpl$mapTransportCardExistingState$1.L$13;
                    a111Var = (a111) transportCardInteractorImpl$mapTransportCardExistingState$1.L$5;
                    d111Var = (d111) transportCardInteractorImpl$mapTransportCardExistingState$1.L$4;
                    list = (List) transportCardInteractorImpl$mapTransportCardExistingState$1.L$2;
                    kotlin.b.b(obj2);
                    kdcVar = kdcVar2;
                    str4 = r5;
                    str5 = r9;
                    uiStateDrawableWrapper2 = uiStateDrawableWrapper3;
                    uiStateDrawableWrapper = uiStateDrawableWrapper4;
                }
                CharSequence charSequence = (CharSequence) obj2;
                TransportCardAction transportCardAction = TransportCardAction.OPEN_TRANSPORT_CARDS;
                String str8 = d111Var == null ? d111Var.a : null;
                TransportCardStatus transportCardStatus = i3 == 0 ? TransportCardStatus.Active : TransportCardStatus.Blocked;
                r011 r011Var = a111Var == null ? new r011(a111Var.b, a111Var.c, a111Var.d) : null;
                List<d111> list2 = list;
                ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
                for (d111 d111Var3 : list2) {
                    String str9 = d111Var3.a;
                    TransportCardStatus transportCardStatus2 = d111Var3.l == TransportCardPayment$CardStatusDomain.ACTIVE ? TransportCardStatus.Active : TransportCardStatus.Blocked;
                    a111 a111Var3 = d111Var3.g;
                    arrayList2.add(new w011(str9, transportCardStatus2, a111Var3 != null ? new r011(a111Var3.b, a111Var3.c, a111Var3.d) : null));
                }
                return new h111(uiStateDrawableWrapper, uiStateDrawableWrapper2, str5, str4, kdcVar, i4 == 0, charSequence, transportCardAction, null, new p011(str8, transportCardStatus, r011Var, arrayList2));
            }
        }
        transportCardInteractorImpl$mapTransportCardExistingState$1 = new TransportCardInteractorImpl$mapTransportCardExistingState$1(this, continuationImpl);
        Object obj22 = transportCardInteractorImpl$mapTransportCardExistingState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transportCardInteractorImpl$mapTransportCardExistingState$1.label;
        if (i != 0) {
        }
        CharSequence charSequence2 = (CharSequence) obj22;
        TransportCardAction transportCardAction2 = TransportCardAction.OPEN_TRANSPORT_CARDS;
        if (d111Var == null) {
        }
        if (i3 == 0) {
        }
        if (a111Var == null) {
        }
        List<d111> list22 = list;
        ArrayList arrayList22 = new ArrayList(tcc.n(list22, 10));
        while (r5.hasNext()) {
        }
        return new h111(uiStateDrawableWrapper, uiStateDrawableWrapper2, str5, str4, kdcVar, i4 == 0, charSequence2, transportCardAction2, null, new p011(str8, transportCardStatus, r011Var, arrayList22));
    }

    public final g d(zzs zzsVar) {
        g610 g610Var = this.e;
        return kotlinx.coroutines.flow.e.X(new ru.yandex.taxi.masstransit.paymentcards.experiment.d(new ru.yandex.taxi.masstransit.paymentcards.experiment.b(ru.yandex.taxi.experiments.d.a(g610Var.b), g610Var), g610Var), new TransportCardInteractorImpl$stateFlow$$inlined$flatMapLatest$1(null, this, zzsVar));
    }
}
