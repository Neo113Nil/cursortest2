package ru.yandex.taxi.masstransit.geopayment.checkout;

import android.graphics.Bitmap;
import com.yandex.go.payments.api.transport.TransportPaymentListSource;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.avj0;
import defpackage.aw6;
import defpackage.bdc;
import defpackage.ciu0;
import defpackage.e3n;
import defpackage.evu0;
import defpackage.f4a0;
import defpackage.g8e;
import defpackage.gr30;
import defpackage.hr30;
import defpackage.ir30;
import defpackage.jl40;
import defpackage.jr30;
import defpackage.kp50;
import defpackage.kyh0;
import defpackage.miu0;
import defpackage.mn30;
import defpackage.my6;
import defpackage.nn30;
import defpackage.ny61;
import defpackage.o430;
import defpackage.obv;
import defpackage.oez0;
import defpackage.on30;
import defpackage.onb;
import defpackage.pav;
import defpackage.pnb;
import defpackage.q47;
import defpackage.q8j0;
import defpackage.qcx;
import defpackage.qnb;
import defpackage.r6f;
import defpackage.rnb;
import defpackage.s8o;
import defpackage.t7s;
import defpackage.tlj;
import defpackage.u0f0;
import defpackage.ujb;
import defpackage.ulj;
import defpackage.vjb;
import defpackage.vz01;
import defpackage.w511;
import defpackage.wi30;
import defpackage.wjb;
import defpackage.wnt;
import defpackage.wye;
import defpackage.xi30;
import defpackage.xjb;
import defpackage.xng0;
import defpackage.xnt;
import defpackage.yjb;
import defpackage.zjb;
import defpackage.zuj0;
import defpackage.zy6;
import java.io.BufferedInputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.time.DurationUnit;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.common_models.ui.TextStyle;
import ru.yandex.taxi.masstransit.geopayment.analytics.TransportPaymentAnalytics$CheckoutErrorReason;
import ru.yandex.taxi.masstransit.geopayment.checkout.network.model.CheckoutResponse;
import ru.yandex.taxi.masstransit.geopayment.checkout.network.model.CreatePaymentDto$ErrorType;
import ru.yandex.taxi.masstransit.model.CheckoutUIState$PaymentCheckoutUIState;

/* loaded from: classes6.dex */
public final class b {
    public final ru.yandex.taxi.widget.c a;
    public final pav b;
    public final zuj0 c;
    public final wnt d;

    public b(ru.yandex.taxi.widget.c cVar, pav pavVar, zuj0 zuj0Var, wnt wntVar) {
        this.a = cVar;
        this.b = pavVar;
        this.c = zuj0Var;
        this.d = wntVar;
    }

    public static double a(double d, int i, boolean z) {
        return z ? d : new BigDecimal(String.valueOf(d)).multiply(BigDecimal.valueOf(i)).doubleValue();
    }

    public static Map n(double d, String str) {
        int i = (int) d;
        return kotlin.collections.b.i(new Pair("$VALUE$", (Double.compare(d, (double) i) == 0 ? Integer.valueOf(i) : Double.valueOf(d)).toString()), new Pair("$SIGN$", str), new Pair("$CURRENCY$", ""));
    }

    public final Object b(String str, ContinuationImpl continuationImpl) {
        if (str.length() == 0) {
            return null;
        }
        return ru.yandex.taxi.utils.a.b(this.b.b().i(new obv(str, null, 6, 0)).c(), continuationImpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(CheckoutResponse.b bVar, int i, boolean z, boolean z2, q8j0 q8j0Var, ContinuationImpl continuationImpl) {
        CheckoutUIStateMapper$mapCounterState$1 checkoutUIStateMapper$mapCounterState$1;
        int i2;
        q8j0 q8j0Var2;
        boolean z3;
        boolean z4;
        int i3;
        Double d;
        long U;
        CheckoutResponse.b bVar2 = bVar;
        if (continuationImpl instanceof CheckoutUIStateMapper$mapCounterState$1) {
            checkoutUIStateMapper$mapCounterState$1 = (CheckoutUIStateMapper$mapCounterState$1) continuationImpl;
            int i4 = checkoutUIStateMapper$mapCounterState$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                checkoutUIStateMapper$mapCounterState$1.label = i4 - Integer.MIN_VALUE;
                CheckoutUIStateMapper$mapCounterState$1 checkoutUIStateMapper$mapCounterState$12 = checkoutUIStateMapper$mapCounterState$1;
                Object obj = checkoutUIStateMapper$mapCounterState$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = checkoutUIStateMapper$mapCounterState$12.label;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    FormattedText formattedText = bVar2.a;
                    checkoutUIStateMapper$mapCounterState$12.L$0 = bVar2;
                    q8j0Var2 = q8j0Var;
                    checkoutUIStateMapper$mapCounterState$12.L$1 = q8j0Var2;
                    checkoutUIStateMapper$mapCounterState$12.L$2 = null;
                    checkoutUIStateMapper$mapCounterState$12.I$0 = i;
                    checkoutUIStateMapper$mapCounterState$12.Z$0 = z;
                    z3 = z2;
                    checkoutUIStateMapper$mapCounterState$12.Z$1 = z3;
                    checkoutUIStateMapper$mapCounterState$12.label = 1;
                    obj = ru.yandex.taxi.widget.c.e(this.a, formattedText, null, false, checkoutUIStateMapper$mapCounterState$12, 30);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    z4 = z;
                    i3 = i;
                } else {
                    if (i2 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z5 = checkoutUIStateMapper$mapCounterState$12.Z$1;
                    boolean z6 = checkoutUIStateMapper$mapCounterState$12.Z$0;
                    int i5 = checkoutUIStateMapper$mapCounterState$12.I$0;
                    q8j0 q8j0Var3 = (q8j0) checkoutUIStateMapper$mapCounterState$12.L$1;
                    CheckoutResponse.b bVar3 = (CheckoutResponse.b) checkoutUIStateMapper$mapCounterState$12.L$0;
                    kotlin.b.b(obj);
                    z3 = z5;
                    z4 = z6;
                    i3 = i5;
                    q8j0Var2 = q8j0Var3;
                    bVar2 = bVar3;
                }
                CharSequence charSequence = (CharSequence) obj;
                d = bVar2.b.c;
                if (d == null) {
                    o430 o430Var = e3n.b;
                    U = kp50.T(d.doubleValue(), DurationUnit.SECONDS);
                } else {
                    o430 o430Var2 = e3n.b;
                    U = kp50.U(1, DurationUnit.SECONDS);
                }
                return new wye(charSequence, i3, U, bVar2.b.a, (z4 || z3) ? false : true, bVar2.c, q8j0Var2.a, q8j0Var2.c, q8j0Var2.e);
            }
        }
        checkoutUIStateMapper$mapCounterState$1 = new CheckoutUIStateMapper$mapCounterState$1(this, continuationImpl);
        CheckoutUIStateMapper$mapCounterState$1 checkoutUIStateMapper$mapCounterState$122 = checkoutUIStateMapper$mapCounterState$1;
        Object obj2 = checkoutUIStateMapper$mapCounterState$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = checkoutUIStateMapper$mapCounterState$122.label;
        if (i2 != 0) {
        }
        CharSequence charSequence2 = (CharSequence) obj2;
        d = bVar2.b.c;
        if (d == null) {
        }
        return new wye(charSequence2, i3, U, bVar2.b.a, (z4 || z3) ? false : true, bVar2.c, q8j0Var2.a, q8j0Var2.c, q8j0Var2.e);
    }

    public final CheckoutUIState$PaymentCheckoutUIState d(q8j0 q8j0Var, f4a0 f4a0Var, boolean z, Throwable th, String str) {
        CheckoutUIState$PaymentCheckoutUIState.PaymentCheckoutErrorState.PaymentCheckoutErrorCode g = g(th);
        int i = kyh0.chargers_something_wrong;
        avj0 avj0Var = (avj0) this.c;
        return new CheckoutUIState$PaymentCheckoutUIState(str, null, null, null, null, null, null, new CheckoutUIState$PaymentCheckoutUIState.PaymentCheckoutErrorState(g, avj0Var.h(i), avj0Var.h(kyh0.mt_error_subtitle), TransportPaymentAnalytics$CheckoutErrorReason.f78HeckoutLoadingError), null, new q47(Collections.singletonList(new my6(avj0Var.h(kyh0.mt_refresh), new bdc(xng0.textOnControl), new bdc(xng0.controlMain), TextStyle.ACCENT, new wi30(q8j0Var.d, q8j0Var.e, q8j0Var.b, q8j0Var.f), null, null, false, false, 16292)), 1), f4a0Var, null, q8j0Var, z, null, 943358);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(yjb yjbVar, r6f r6fVar, int i, f4a0 f4a0Var, boolean z, ContinuationImpl continuationImpl) {
        CheckoutUIStateMapper$mapFailedPaymentCreationCheckoutUiState$1 checkoutUIStateMapper$mapFailedPaymentCreationCheckoutUiState$1;
        int i2;
        double a;
        String str;
        int i3;
        boolean z2;
        double d;
        f4a0 f4a0Var2;
        yjb yjbVar2;
        String str2;
        r6f r6fVar2;
        vz01 vz01Var;
        int i4;
        TransportPaymentAnalytics$CheckoutErrorReason transportPaymentAnalytics$CheckoutErrorReason;
        String str3;
        f4a0 f4a0Var3;
        Object obj;
        int i5;
        jr30 jr30Var;
        CheckoutResponse.CheckoutPaymentMethods checkoutPaymentMethods;
        CheckoutResponse.StopsSelector stopsSelector;
        CheckoutUIState$PaymentCheckoutUIState.PaymentCheckoutErrorState paymentCheckoutErrorState;
        ciu0 ciu0Var;
        boolean z3;
        String str4;
        q47 q47Var;
        String str5;
        String str6;
        yjb yjbVar3;
        f4a0 f4a0Var4;
        vz01 vz01Var2;
        String str7;
        boolean z4;
        CheckoutUIState$PaymentCheckoutUIState.PaymentCheckoutErrorState paymentCheckoutErrorState2;
        q47 q47Var2;
        String str8;
        String str9;
        CheckoutResponse.CheckoutPaymentMethods.Source source;
        if (continuationImpl instanceof CheckoutUIStateMapper$mapFailedPaymentCreationCheckoutUiState$1) {
            checkoutUIStateMapper$mapFailedPaymentCreationCheckoutUiState$1 = (CheckoutUIStateMapper$mapFailedPaymentCreationCheckoutUiState$1) continuationImpl;
            int i6 = checkoutUIStateMapper$mapFailedPaymentCreationCheckoutUiState$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                checkoutUIStateMapper$mapFailedPaymentCreationCheckoutUiState$1.label = i6 - Integer.MIN_VALUE;
                Object obj2 = checkoutUIStateMapper$mapFailedPaymentCreationCheckoutUiState$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = checkoutUIStateMapper$mapFailedPaymentCreationCheckoutUiState$1.label;
                if (i2 != 0) {
                    kotlin.b.b(obj2);
                    CheckoutResponse.c cVar = yjbVar.a.d;
                    if (cVar == null) {
                        a = 0.0d;
                    } else {
                        Double d2 = cVar.c;
                        a = a(d2 != null ? d2.doubleValue() : cVar.a, i, z);
                    }
                    String str10 = yjbVar.c;
                    str = r6fVar.g;
                    CheckoutResponse.TransportItem transportItem = yjbVar.a.h;
                    checkoutUIStateMapper$mapFailedPaymentCreationCheckoutUiState$1.L$0 = yjbVar;
                    checkoutUIStateMapper$mapFailedPaymentCreationCheckoutUiState$1.L$1 = r6fVar;
                    checkoutUIStateMapper$mapFailedPaymentCreationCheckoutUiState$1.L$2 = f4a0Var;
                    checkoutUIStateMapper$mapFailedPaymentCreationCheckoutUiState$1.L$3 = str10;
                    checkoutUIStateMapper$mapFailedPaymentCreationCheckoutUiState$1.L$4 = str;
                    checkoutUIStateMapper$mapFailedPaymentCreationCheckoutUiState$1.I$0 = i;
                    checkoutUIStateMapper$mapFailedPaymentCreationCheckoutUiState$1.Z$0 = z;
                    checkoutUIStateMapper$mapFailedPaymentCreationCheckoutUiState$1.D$0 = a;
                    checkoutUIStateMapper$mapFailedPaymentCreationCheckoutUiState$1.label = 1;
                    Object l = l(transportItem, checkoutUIStateMapper$mapFailedPaymentCreationCheckoutUiState$1);
                    if (l == obj3) {
                        return obj3;
                    }
                    i3 = i;
                    z2 = z;
                    d = a;
                    f4a0Var2 = f4a0Var;
                    yjbVar2 = yjbVar;
                    str2 = str10;
                    obj2 = l;
                    r6fVar2 = r6fVar;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z4 = checkoutUIStateMapper$mapFailedPaymentCreationCheckoutUiState$1.Z$0;
                        q47Var2 = (q47) checkoutUIStateMapper$mapFailedPaymentCreationCheckoutUiState$1.L$8;
                        str7 = (String) checkoutUIStateMapper$mapFailedPaymentCreationCheckoutUiState$1.L$7;
                        paymentCheckoutErrorState2 = (CheckoutUIState$PaymentCheckoutUIState.PaymentCheckoutErrorState) checkoutUIStateMapper$mapFailedPaymentCreationCheckoutUiState$1.L$6;
                        vz01Var = (vz01) checkoutUIStateMapper$mapFailedPaymentCreationCheckoutUiState$1.L$5;
                        str8 = (String) checkoutUIStateMapper$mapFailedPaymentCreationCheckoutUiState$1.L$4;
                        str9 = (String) checkoutUIStateMapper$mapFailedPaymentCreationCheckoutUiState$1.L$3;
                        f4a0Var3 = (f4a0) checkoutUIStateMapper$mapFailedPaymentCreationCheckoutUiState$1.L$2;
                        yjbVar3 = (yjb) checkoutUIStateMapper$mapFailedPaymentCreationCheckoutUiState$1.L$0;
                        kotlin.b.b(obj2);
                        z3 = z4;
                        q47Var = q47Var2;
                        str4 = str7;
                        paymentCheckoutErrorState = paymentCheckoutErrorState2;
                        str5 = str8;
                        str6 = str9;
                        ciu0Var = (ciu0) obj2;
                        vz01Var2 = vz01Var;
                        f4a0Var4 = f4a0Var3;
                        return new CheckoutUIState$PaymentCheckoutUIState(str6, str5, vz01Var2, null, null, str4, ciu0Var, paymentCheckoutErrorState, null, q47Var, f4a0Var4, null, yjbVar3.b, z3, null, 943256);
                    }
                    double d3 = checkoutUIStateMapper$mapFailedPaymentCreationCheckoutUiState$1.D$0;
                    z2 = checkoutUIStateMapper$mapFailedPaymentCreationCheckoutUiState$1.Z$0;
                    int i7 = checkoutUIStateMapper$mapFailedPaymentCreationCheckoutUiState$1.I$0;
                    str = (String) checkoutUIStateMapper$mapFailedPaymentCreationCheckoutUiState$1.L$4;
                    str2 = (String) checkoutUIStateMapper$mapFailedPaymentCreationCheckoutUiState$1.L$3;
                    f4a0 f4a0Var5 = (f4a0) checkoutUIStateMapper$mapFailedPaymentCreationCheckoutUiState$1.L$2;
                    r6fVar2 = (r6f) checkoutUIStateMapper$mapFailedPaymentCreationCheckoutUiState$1.L$1;
                    yjbVar2 = (yjb) checkoutUIStateMapper$mapFailedPaymentCreationCheckoutUiState$1.L$0;
                    kotlin.b.b(obj2);
                    d = d3;
                    i3 = i7;
                    f4a0Var2 = f4a0Var5;
                }
                vz01Var = (vz01) obj2;
                CheckoutUIState$PaymentCheckoutUIState.PaymentCheckoutErrorState.PaymentCheckoutErrorCode g = g(r6fVar2.d);
                int i8 = kyh0.mt_payment_error_title;
                avj0 avj0Var = (avj0) this.c;
                String h = avj0Var.h(i8);
                String h2 = avj0Var.h(kyh0.mt_error_subtitle);
                CreatePaymentDto$ErrorType createPaymentDto$ErrorType = r6fVar2.c;
                i4 = createPaymentDto$ErrorType != null ? -1 : rnb.b[createPaymentDto$ErrorType.ordinal()];
                if (i4 != -1) {
                    transportPaymentAnalytics$CheckoutErrorReason = null;
                } else if (i4 == 1) {
                    transportPaymentAnalytics$CheckoutErrorReason = TransportPaymentAnalytics$CheckoutErrorReason.PaymentFailed;
                } else {
                    if (i4 != 2) {
                        w511.b();
                        return null;
                    }
                    transportPaymentAnalytics$CheckoutErrorReason = TransportPaymentAnalytics$CheckoutErrorReason.PaymentLoadingError;
                }
                CheckoutUIState$PaymentCheckoutUIState.PaymentCheckoutErrorState paymentCheckoutErrorState3 = new CheckoutUIState$PaymentCheckoutUIState.PaymentCheckoutErrorState(g, h, h2, transportPaymentAnalytics$CheckoutErrorReason);
                CheckoutResponse checkoutResponse = yjbVar2.a;
                String str11 = checkoutResponse.b;
                String str12 = checkoutResponse.h.a;
                String str13 = checkoutResponse.f;
                str3 = yjbVar2.b.e;
                boolean z5 = checkoutResponse.g == null;
                Object obj4 = checkoutResponse.m;
                if (str3 != null && z5) {
                    int i9 = i3;
                    obj = obj3;
                    i5 = i9;
                    jr30Var = new ir30(str13, str11);
                    f4a0Var3 = f4a0Var2;
                } else if (z2) {
                    double d4 = d;
                    int i10 = i3;
                    f4a0Var3 = f4a0Var2;
                    d = d4;
                    jr30 gr30Var = new gr30(i10, str12, str11, d, str3);
                    obj = obj3;
                    i5 = i10;
                    str11 = str11;
                    jr30Var = gr30Var;
                } else {
                    double d5 = d;
                    int i11 = i3;
                    jr30 hr30Var = new hr30(d5, str12, i11, str11, str3, f4a0Var2, obj4);
                    f4a0Var3 = f4a0Var2;
                    jr30Var = hr30Var;
                    obj = obj3;
                    i5 = i11;
                    d = d5;
                }
                checkoutPaymentMethods = checkoutResponse.n;
                if (checkoutPaymentMethods != null || (source = checkoutPaymentMethods.a) == null || (r10 = source.getKey()) == null) {
                    String source2 = TransportPaymentListSource.DEFAULT.getSource();
                }
                CheckoutResponse.CheckoutPaymentMethods checkoutPaymentMethods2 = checkoutResponse.n;
                boolean z6 = z2;
                int i12 = i5;
                String str14 = str11;
                List singletonList = Collections.singletonList(new my6(avj0Var.h(kyh0.mt_retry_payment), new bdc(xng0.textOnControl), new bdc(xng0.controlMain), TextStyle.ACCENT, new xi30(jr30Var, source2, checkoutPaymentMethods2 == null ? checkoutPaymentMethods2.b : null, checkoutPaymentMethods2 == null ? checkoutPaymentMethods2.c : null), null, null, false, false, 16292));
                boolean z7 = true;
                q47 q47Var3 = new q47(singletonList, 1);
                stopsSelector = checkoutResponse.g;
                if (stopsSelector != null) {
                    paymentCheckoutErrorState = paymentCheckoutErrorState3;
                    ciu0Var = null;
                    z3 = z6;
                    str4 = str14;
                    q47Var = q47Var3;
                    str5 = str;
                    str6 = str2;
                    yjbVar3 = yjbVar2;
                    f4a0Var4 = f4a0Var3;
                    vz01Var2 = vz01Var;
                    return new CheckoutUIState$PaymentCheckoutUIState(str6, str5, vz01Var2, null, null, str4, ciu0Var, paymentCheckoutErrorState, null, q47Var, f4a0Var4, null, yjbVar3.b, z3, null, 943256);
                }
                if (!r6fVar2.e && !yjbVar2.d) {
                    z7 = false;
                }
                checkoutUIStateMapper$mapFailedPaymentCreationCheckoutUiState$1.L$0 = yjbVar2;
                checkoutUIStateMapper$mapFailedPaymentCreationCheckoutUiState$1.L$1 = null;
                checkoutUIStateMapper$mapFailedPaymentCreationCheckoutUiState$1.L$2 = f4a0Var3;
                checkoutUIStateMapper$mapFailedPaymentCreationCheckoutUiState$1.L$3 = str2;
                checkoutUIStateMapper$mapFailedPaymentCreationCheckoutUiState$1.L$4 = str;
                checkoutUIStateMapper$mapFailedPaymentCreationCheckoutUiState$1.L$5 = vz01Var;
                checkoutUIStateMapper$mapFailedPaymentCreationCheckoutUiState$1.L$6 = paymentCheckoutErrorState3;
                checkoutUIStateMapper$mapFailedPaymentCreationCheckoutUiState$1.L$7 = str14;
                checkoutUIStateMapper$mapFailedPaymentCreationCheckoutUiState$1.L$8 = q47Var3;
                checkoutUIStateMapper$mapFailedPaymentCreationCheckoutUiState$1.L$9 = null;
                checkoutUIStateMapper$mapFailedPaymentCreationCheckoutUiState$1.I$0 = i12;
                checkoutUIStateMapper$mapFailedPaymentCreationCheckoutUiState$1.Z$0 = z6;
                checkoutUIStateMapper$mapFailedPaymentCreationCheckoutUiState$1.D$0 = d;
                checkoutUIStateMapper$mapFailedPaymentCreationCheckoutUiState$1.label = 2;
                Object j = j(stopsSelector, z7, checkoutUIStateMapper$mapFailedPaymentCreationCheckoutUiState$1);
                Object obj5 = obj;
                if (j == obj5) {
                    return obj5;
                }
                str7 = str14;
                yjbVar3 = yjbVar2;
                obj2 = j;
                z4 = z6;
                paymentCheckoutErrorState2 = paymentCheckoutErrorState3;
                q47Var2 = q47Var3;
                str8 = str;
                str9 = str2;
                z3 = z4;
                q47Var = q47Var2;
                str4 = str7;
                paymentCheckoutErrorState = paymentCheckoutErrorState2;
                str5 = str8;
                str6 = str9;
                ciu0Var = (ciu0) obj2;
                vz01Var2 = vz01Var;
                f4a0Var4 = f4a0Var3;
                return new CheckoutUIState$PaymentCheckoutUIState(str6, str5, vz01Var2, null, null, str4, ciu0Var, paymentCheckoutErrorState, null, q47Var, f4a0Var4, null, yjbVar3.b, z3, null, 943256);
            }
        }
        checkoutUIStateMapper$mapFailedPaymentCreationCheckoutUiState$1 = new CheckoutUIStateMapper$mapFailedPaymentCreationCheckoutUiState$1(this, continuationImpl);
        Object obj22 = checkoutUIStateMapper$mapFailedPaymentCreationCheckoutUiState$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = checkoutUIStateMapper$mapFailedPaymentCreationCheckoutUiState$1.label;
        if (i2 != 0) {
        }
        vz01Var = (vz01) obj22;
        CheckoutUIState$PaymentCheckoutUIState.PaymentCheckoutErrorState.PaymentCheckoutErrorCode g2 = g(r6fVar2.d);
        int i82 = kyh0.mt_payment_error_title;
        avj0 avj0Var2 = (avj0) this.c;
        String h3 = avj0Var2.h(i82);
        String h22 = avj0Var2.h(kyh0.mt_error_subtitle);
        CreatePaymentDto$ErrorType createPaymentDto$ErrorType2 = r6fVar2.c;
        if (createPaymentDto$ErrorType2 != null) {
        }
        if (i4 != -1) {
        }
        CheckoutUIState$PaymentCheckoutUIState.PaymentCheckoutErrorState paymentCheckoutErrorState32 = new CheckoutUIState$PaymentCheckoutUIState.PaymentCheckoutErrorState(g2, h3, h22, transportPaymentAnalytics$CheckoutErrorReason);
        CheckoutResponse checkoutResponse2 = yjbVar2.a;
        String str112 = checkoutResponse2.b;
        String str122 = checkoutResponse2.h.a;
        String str132 = checkoutResponse2.f;
        str3 = yjbVar2.b.e;
        if (checkoutResponse2.g == null) {
        }
        Object obj42 = checkoutResponse2.m;
        if (str3 != null) {
        }
        if (z2) {
        }
        checkoutPaymentMethods = checkoutResponse2.n;
        if (checkoutPaymentMethods != null) {
        }
        String source22 = TransportPaymentListSource.DEFAULT.getSource();
        CheckoutResponse.CheckoutPaymentMethods checkoutPaymentMethods22 = checkoutResponse2.n;
        boolean z62 = z2;
        int i122 = i5;
        String str142 = str112;
        List singletonList2 = Collections.singletonList(new my6(avj0Var2.h(kyh0.mt_retry_payment), new bdc(xng0.textOnControl), new bdc(xng0.controlMain), TextStyle.ACCENT, new xi30(jr30Var, source22, checkoutPaymentMethods22 == null ? checkoutPaymentMethods22.b : null, checkoutPaymentMethods22 == null ? checkoutPaymentMethods22.c : null), null, null, false, false, 16292));
        boolean z72 = true;
        q47 q47Var32 = new q47(singletonList2, 1);
        stopsSelector = checkoutResponse2.g;
        if (stopsSelector != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x010e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0163 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x011c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(CheckoutResponse.a aVar, String str, int i, String str2, String str3, boolean z, double d, f4a0 f4a0Var, Object obj, boolean z2, String str4, boolean z3, e3n e3nVar, ContinuationImpl continuationImpl) {
        CheckoutUIStateMapper$mapPayButton$1 checkoutUIStateMapper$mapPayButton$1;
        int i2;
        int i3;
        String str5;
        String str6;
        f4a0 f4a0Var2;
        CheckoutResponse.a aVar2;
        int i4;
        boolean z4;
        String str7;
        boolean z5;
        double d2;
        Object obj2;
        String str8;
        Object obj3;
        boolean z6;
        boolean z7;
        CharSequence charSequence;
        zy6 gr30Var;
        CheckoutResponse.a aVar3 = aVar;
        if (continuationImpl instanceof CheckoutUIStateMapper$mapPayButton$1) {
            checkoutUIStateMapper$mapPayButton$1 = (CheckoutUIStateMapper$mapPayButton$1) continuationImpl;
            int i5 = checkoutUIStateMapper$mapPayButton$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                checkoutUIStateMapper$mapPayButton$1.label = i5 - Integer.MIN_VALUE;
                CheckoutUIStateMapper$mapPayButton$1 checkoutUIStateMapper$mapPayButton$12 = checkoutUIStateMapper$mapPayButton$1;
                Object obj4 = checkoutUIStateMapper$mapPayButton$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = checkoutUIStateMapper$mapPayButton$12.label;
                if (i2 != 0) {
                    kotlin.b.b(obj4);
                    oez0 oez0Var = aVar3.d;
                    i3 = (oez0Var == null || e3nVar == null || !e3n.j(e3nVar.a)) ? 0 : 1;
                    if (i3 != 0) {
                        String p = g8e.p(oez0Var.a, " ", t7s.j(e3n.e(e3nVar.a)));
                        str5 = str;
                        i4 = i;
                        str6 = str2;
                        str8 = str3;
                        z4 = z;
                        d2 = d;
                        f4a0Var2 = f4a0Var;
                        obj2 = obj;
                        str7 = str4;
                        z7 = z3;
                        charSequence = p;
                        z6 = z2;
                        if (str8 != null && z4) {
                            if (z7) {
                                str6 = null;
                            }
                            gr30Var = new ir30(str7, str6);
                        } else if (str8 != null && z4) {
                            gr30Var = new ir30(str7, str6);
                        } else if (z6) {
                            gr30Var = new hr30(d2, str5, i4, str6, str8, f4a0Var2, obj2);
                        } else {
                            gr30Var = new gr30(i4, str5, str6, d2, str8);
                        }
                        return new q47(Collections.singletonList(new my6(charSequence, new bdc(xng0.textOnControl), new bdc(xng0.controlMain), TextStyle.ACCENT, gr30Var, null, null, !aVar3.b && i3 == 0, false, 15268)), 1);
                    }
                    FormattedText formattedText = aVar3.a;
                    checkoutUIStateMapper$mapPayButton$12.L$0 = aVar3;
                    str5 = str;
                    checkoutUIStateMapper$mapPayButton$12.L$1 = str5;
                    str6 = str2;
                    checkoutUIStateMapper$mapPayButton$12.L$2 = str6;
                    checkoutUIStateMapper$mapPayButton$12.L$3 = str3;
                    f4a0Var2 = f4a0Var;
                    checkoutUIStateMapper$mapPayButton$12.L$4 = f4a0Var2;
                    checkoutUIStateMapper$mapPayButton$12.L$5 = obj;
                    checkoutUIStateMapper$mapPayButton$12.L$6 = str4;
                    checkoutUIStateMapper$mapPayButton$12.L$7 = null;
                    checkoutUIStateMapper$mapPayButton$12.L$8 = null;
                    checkoutUIStateMapper$mapPayButton$12.I$0 = i;
                    checkoutUIStateMapper$mapPayButton$12.Z$0 = z;
                    checkoutUIStateMapper$mapPayButton$12.D$0 = d;
                    checkoutUIStateMapper$mapPayButton$12.Z$1 = z2;
                    checkoutUIStateMapper$mapPayButton$12.Z$2 = z3;
                    checkoutUIStateMapper$mapPayButton$12.I$1 = i3;
                    checkoutUIStateMapper$mapPayButton$12.label = 1;
                    Object e = ru.yandex.taxi.widget.c.e(this.a, formattedText, null, false, checkoutUIStateMapper$mapPayButton$12, 30);
                    if (e == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    aVar2 = aVar;
                    i4 = i;
                    z4 = z;
                    str7 = str4;
                    z5 = z3;
                    d2 = d;
                    obj2 = obj;
                    str8 = str3;
                    obj3 = e;
                    z6 = z2;
                } else {
                    if (i2 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i6 = checkoutUIStateMapper$mapPayButton$12.I$1;
                    z5 = checkoutUIStateMapper$mapPayButton$12.Z$2;
                    boolean z8 = checkoutUIStateMapper$mapPayButton$12.Z$1;
                    d2 = checkoutUIStateMapper$mapPayButton$12.D$0;
                    z4 = checkoutUIStateMapper$mapPayButton$12.Z$0;
                    i4 = checkoutUIStateMapper$mapPayButton$12.I$0;
                    str7 = (String) checkoutUIStateMapper$mapPayButton$12.L$6;
                    obj2 = checkoutUIStateMapper$mapPayButton$12.L$5;
                    f4a0Var2 = (f4a0) checkoutUIStateMapper$mapPayButton$12.L$4;
                    str8 = (String) checkoutUIStateMapper$mapPayButton$12.L$3;
                    String str9 = (String) checkoutUIStateMapper$mapPayButton$12.L$2;
                    String str10 = (String) checkoutUIStateMapper$mapPayButton$12.L$1;
                    aVar2 = (CheckoutResponse.a) checkoutUIStateMapper$mapPayButton$12.L$0;
                    kotlin.b.b(obj4);
                    obj3 = obj4;
                    str6 = str9;
                    i3 = i6;
                    z6 = z8;
                    str5 = str10;
                }
                charSequence = (CharSequence) obj3;
                CheckoutResponse.a aVar4 = aVar2;
                z7 = z5;
                aVar3 = aVar4;
                if (str8 != null) {
                }
                if (str8 != null) {
                }
                if (z6) {
                }
                return new q47(Collections.singletonList(new my6(charSequence, new bdc(xng0.textOnControl), new bdc(xng0.controlMain), TextStyle.ACCENT, gr30Var, null, null, !aVar3.b && i3 == 0, false, 15268)), 1);
            }
        }
        checkoutUIStateMapper$mapPayButton$1 = new CheckoutUIStateMapper$mapPayButton$1(this, continuationImpl);
        CheckoutUIStateMapper$mapPayButton$1 checkoutUIStateMapper$mapPayButton$122 = checkoutUIStateMapper$mapPayButton$1;
        Object obj42 = checkoutUIStateMapper$mapPayButton$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = checkoutUIStateMapper$mapPayButton$122.label;
        if (i2 != 0) {
        }
        charSequence = (CharSequence) obj3;
        CheckoutResponse.a aVar42 = aVar2;
        z7 = z5;
        aVar3 = aVar42;
        if (str8 != null) {
        }
        if (str8 != null) {
        }
        if (z6) {
        }
        return new q47(Collections.singletonList(new my6(charSequence, new bdc(xng0.textOnControl), new bdc(xng0.controlMain), TextStyle.ACCENT, gr30Var, null, null, !aVar3.b && i3 == 0, false, 15268)), 1);
    }

    public final CheckoutUIState$PaymentCheckoutUIState.PaymentCheckoutErrorState.PaymentCheckoutErrorCode g(Throwable th) {
        BufferedInputStream N;
        Map map;
        String str = "";
        Integer M = s8o.M(th);
        if (M == null || M.intValue() != 403 || (N = s8o.N(th)) == null) {
            return null;
        }
        try {
            kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) ((kotlinx.serialization.json.c) ((xnt) this.d).b(N, kotlinx.serialization.json.c.Companion.serializer())).get(AuthSdkActivity.RESPONSE_TYPE_CODE);
            if (bVar != null) {
                String g = qcx.g(qcx.n(bVar));
                if (g != null) {
                    str = g;
                }
            }
        } catch (Throwable unused) {
        }
        CheckoutUIState$PaymentCheckoutUIState.PaymentCheckoutErrorState.PaymentCheckoutErrorCode.Companion.getClass();
        map = CheckoutUIState$PaymentCheckoutUIState.PaymentCheckoutErrorState.PaymentCheckoutErrorCode.map;
        return (CheckoutUIState$PaymentCheckoutUIState.PaymentCheckoutErrorState.PaymentCheckoutErrorCode) map.get(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(int i, yjb yjbVar, f4a0 f4a0Var, boolean z, String str, boolean z2, boolean z3, e3n e3nVar, ContinuationImpl continuationImpl) {
        CheckoutUIStateMapper$mapPriceState$1 checkoutUIStateMapper$mapPriceState$1;
        int i2;
        double a;
        CoroutineSingletons coroutineSingletons;
        zjb zjbVar;
        f4a0 f4a0Var2;
        boolean z4;
        boolean z5;
        boolean z6;
        double d;
        int i3;
        String source;
        CheckoutResponse.CheckoutPaymentMethods.Source source2;
        CheckoutResponse.c cVar;
        q47 q47Var;
        boolean z7;
        f4a0 f4a0Var3;
        CoroutineSingletons coroutineSingletons2;
        zjb zjbVar2;
        CheckoutResponse.d dVar;
        CheckoutResponse.c cVar2;
        CharSequence charSequence;
        String str2;
        double d2;
        double d3;
        Object obj;
        CheckoutResponse.c cVar3;
        double d4;
        CheckoutResponse.d dVar2;
        q47 q47Var2;
        String str3;
        int i4;
        double d5;
        String source3;
        CheckoutResponse.CheckoutPaymentMethods.Source source4;
        double d6;
        Double d7;
        zjb zjbVar3;
        boolean z8;
        CharSequence charSequence2;
        CheckoutResponse.d dVar3;
        boolean z9;
        double d8;
        f4a0 f4a0Var4;
        boolean z10;
        q47 q47Var3;
        CharSequence charSequence3;
        zjb zjbVar4;
        double d9;
        CharSequence charSequence4;
        String str4;
        CharSequence charSequence5;
        CharSequence charSequence6;
        f4a0 f4a0Var5;
        FormattedText formattedText;
        CharSequence charSequence7;
        zjb zjbVar5;
        f4a0 f4a0Var6;
        CheckoutResponse.CheckoutPaymentMethods checkoutPaymentMethods;
        CheckoutResponse.CheckoutPaymentMethods.Source source5;
        b bVar = this;
        if (continuationImpl instanceof CheckoutUIStateMapper$mapPriceState$1) {
            checkoutUIStateMapper$mapPriceState$1 = (CheckoutUIStateMapper$mapPriceState$1) continuationImpl;
            int i5 = checkoutUIStateMapper$mapPriceState$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                checkoutUIStateMapper$mapPriceState$1.label = i5 - Integer.MIN_VALUE;
                Object obj2 = checkoutUIStateMapper$mapPriceState$1.result;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = checkoutUIStateMapper$mapPriceState$1.label;
                if (i2 != 0) {
                    kotlin.b.b(obj2);
                    if (yjbVar != null && z) {
                        q47 q47Var4 = new q47(Collections.singletonList(new my6(str, new bdc(xng0.textOnControl), new bdc(xng0.controlMain), TextStyle.ACCENT, null, null, null, false, true, 7140)), 1);
                        CheckoutResponse.CheckoutPaymentMethods checkoutPaymentMethods2 = yjbVar.a.n;
                        if (checkoutPaymentMethods2 == null || (source2 = checkoutPaymentMethods2.a) == null || (source = source2.getKey()) == null) {
                            source = TransportPaymentListSource.DEFAULT.getSource();
                        }
                        return new u0f0((CharSequence) null, (CharSequence) null, (CharSequence) null, q47Var4, f4a0Var, z3, source, (String) null, (String) null, 775);
                    }
                    if (yjbVar == null) {
                        return u0f0.k;
                    }
                    CheckoutResponse checkoutResponse = yjbVar.a;
                    CheckoutResponse.c cVar4 = checkoutResponse.d;
                    if (cVar4 == null) {
                        a = 0.0d;
                    } else {
                        Double d10 = cVar4.c;
                        a = a(d10 != null ? d10.doubleValue() : cVar4.a, i, z2);
                    }
                    double d11 = a;
                    CheckoutResponse.a aVar = checkoutResponse.k;
                    String str5 = checkoutResponse.a;
                    String str6 = checkoutResponse.b;
                    String str7 = yjbVar.b.e;
                    CheckoutResponse.StopsSelector stopsSelector = checkoutResponse.g;
                    boolean z11 = stopsSelector != null;
                    Object obj3 = checkoutResponse.m;
                    String str8 = checkoutResponse.f;
                    boolean z12 = stopsSelector != null ? stopsSelector.a : true;
                    checkoutUIStateMapper$mapPriceState$1.L$0 = yjbVar;
                    checkoutUIStateMapper$mapPriceState$1.L$1 = f4a0Var;
                    checkoutUIStateMapper$mapPriceState$1.L$2 = null;
                    checkoutUIStateMapper$mapPriceState$1.L$3 = null;
                    checkoutUIStateMapper$mapPriceState$1.I$0 = i;
                    checkoutUIStateMapper$mapPriceState$1.Z$0 = z;
                    checkoutUIStateMapper$mapPriceState$1.Z$1 = z2;
                    checkoutUIStateMapper$mapPriceState$1.Z$2 = z3;
                    checkoutUIStateMapper$mapPriceState$1.D$0 = d11;
                    checkoutUIStateMapper$mapPriceState$1.label = 1;
                    CheckoutUIStateMapper$mapPriceState$1 checkoutUIStateMapper$mapPriceState$12 = checkoutUIStateMapper$mapPriceState$1;
                    coroutineSingletons = coroutineSingletons3;
                    obj2 = bVar.f(aVar, str5, i, str6, str7, z11, d11, f4a0Var, obj3, z2, str8, z12, e3nVar, checkoutUIStateMapper$mapPriceState$12);
                    checkoutUIStateMapper$mapPriceState$1 = checkoutUIStateMapper$mapPriceState$12;
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    zjbVar = yjbVar;
                    f4a0Var2 = f4a0Var;
                    z4 = z;
                    z5 = z2;
                    z6 = z3;
                    d = d11;
                    i3 = i;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 != 4) {
                                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                z9 = checkoutUIStateMapper$mapPriceState$1.Z$2;
                                charSequence7 = (CharSequence) checkoutUIStateMapper$mapPriceState$1.L$11;
                                charSequence2 = (CharSequence) checkoutUIStateMapper$mapPriceState$1.L$9;
                                q47Var3 = (q47) checkoutUIStateMapper$mapPriceState$1.L$4;
                                f4a0Var6 = (f4a0) checkoutUIStateMapper$mapPriceState$1.L$1;
                                zjbVar5 = (zjb) checkoutUIStateMapper$mapPriceState$1.L$0;
                                kotlin.b.b(obj2);
                                str4 = null;
                                charSequence5 = charSequence7;
                                zjbVar3 = zjbVar5;
                                f4a0Var5 = f4a0Var6;
                                charSequence6 = (CharSequence) obj2;
                                boolean z13 = z9;
                                CharSequence charSequence8 = charSequence2;
                                q47 q47Var5 = q47Var3;
                                yjb yjbVar2 = (yjb) zjbVar3;
                                checkoutPaymentMethods = yjbVar2.a.n;
                                if (checkoutPaymentMethods != null || (source5 = checkoutPaymentMethods.a) == null || (r0 = source5.getKey()) == null) {
                                    String source6 = TransportPaymentListSource.DEFAULT.getSource();
                                }
                                String str9 = source6;
                                CheckoutResponse.CheckoutPaymentMethods checkoutPaymentMethods3 = yjbVar2.a.n;
                                return new u0f0(charSequence6, charSequence8, charSequence5, q47Var5, f4a0Var5, z13, str9, checkoutPaymentMethods3 != null ? checkoutPaymentMethods3.c : str4, checkoutPaymentMethods3 != null ? checkoutPaymentMethods3.b : str4, 32);
                            }
                            double d12 = checkoutUIStateMapper$mapPriceState$1.D$1;
                            d9 = checkoutUIStateMapper$mapPriceState$1.D$0;
                            boolean z14 = checkoutUIStateMapper$mapPriceState$1.Z$2;
                            z5 = checkoutUIStateMapper$mapPriceState$1.Z$1;
                            z4 = checkoutUIStateMapper$mapPriceState$1.Z$0;
                            int i6 = checkoutUIStateMapper$mapPriceState$1.I$0;
                            charSequence4 = (CharSequence) checkoutUIStateMapper$mapPriceState$1.L$9;
                            dVar3 = (CheckoutResponse.d) checkoutUIStateMapper$mapPriceState$1.L$6;
                            q47Var = (q47) checkoutUIStateMapper$mapPriceState$1.L$4;
                            f4a0Var4 = (f4a0) checkoutUIStateMapper$mapPriceState$1.L$1;
                            zjbVar4 = (zjb) checkoutUIStateMapper$mapPriceState$1.L$0;
                            kotlin.b.b(obj2);
                            d6 = d12;
                            i3 = i6;
                            z7 = z14;
                            d8 = d9;
                            zjbVar3 = zjbVar4;
                            z9 = z7;
                            z10 = z4;
                            q47Var3 = q47Var;
                            charSequence3 = (CharSequence) obj2;
                            z8 = z5;
                            charSequence2 = charSequence4;
                            double d13 = d6;
                            if (dVar3 != null || (formattedText = dVar3.a) == null) {
                                str4 = null;
                                charSequence5 = charSequence3;
                                charSequence6 = null;
                                f4a0Var5 = f4a0Var4;
                                boolean z132 = z9;
                                CharSequence charSequence82 = charSequence2;
                                q47 q47Var52 = q47Var3;
                                yjb yjbVar22 = (yjb) zjbVar3;
                                checkoutPaymentMethods = yjbVar22.a.n;
                                if (checkoutPaymentMethods != null) {
                                }
                                String source62 = TransportPaymentListSource.DEFAULT.getSource();
                                String str92 = source62;
                                CheckoutResponse.CheckoutPaymentMethods checkoutPaymentMethods32 = yjbVar22.a.n;
                                return new u0f0(charSequence6, charSequence82, charSequence5, q47Var52, f4a0Var5, z132, str92, checkoutPaymentMethods32 != null ? checkoutPaymentMethods32.c : str4, checkoutPaymentMethods32 != null ? checkoutPaymentMethods32.b : str4, 32);
                            }
                            checkoutUIStateMapper$mapPriceState$1.L$0 = zjbVar3;
                            checkoutUIStateMapper$mapPriceState$1.L$1 = f4a0Var4;
                            str4 = null;
                            checkoutUIStateMapper$mapPriceState$1.L$2 = null;
                            checkoutUIStateMapper$mapPriceState$1.L$3 = null;
                            checkoutUIStateMapper$mapPriceState$1.L$4 = q47Var3;
                            checkoutUIStateMapper$mapPriceState$1.L$5 = null;
                            checkoutUIStateMapper$mapPriceState$1.L$6 = null;
                            checkoutUIStateMapper$mapPriceState$1.L$7 = null;
                            checkoutUIStateMapper$mapPriceState$1.L$8 = null;
                            checkoutUIStateMapper$mapPriceState$1.L$9 = charSequence2;
                            checkoutUIStateMapper$mapPriceState$1.L$10 = null;
                            checkoutUIStateMapper$mapPriceState$1.L$11 = charSequence3;
                            checkoutUIStateMapper$mapPriceState$1.L$12 = null;
                            checkoutUIStateMapper$mapPriceState$1.I$0 = i3;
                            checkoutUIStateMapper$mapPriceState$1.Z$0 = z10;
                            checkoutUIStateMapper$mapPriceState$1.Z$1 = z8;
                            checkoutUIStateMapper$mapPriceState$1.Z$2 = z9;
                            checkoutUIStateMapper$mapPriceState$1.D$0 = d8;
                            checkoutUIStateMapper$mapPriceState$1.D$1 = d13;
                            checkoutUIStateMapper$mapPriceState$1.label = 4;
                            obj2 = ru.yandex.taxi.widget.c.e(bVar.a, formattedText, null, false, checkoutUIStateMapper$mapPriceState$1, 30);
                            if (obj2 == coroutineSingletons3) {
                                return coroutineSingletons3;
                            }
                            charSequence7 = charSequence3;
                            zjbVar5 = zjbVar3;
                            f4a0Var6 = f4a0Var4;
                            charSequence5 = charSequence7;
                            zjbVar3 = zjbVar5;
                            f4a0Var5 = f4a0Var6;
                            charSequence6 = (CharSequence) obj2;
                            boolean z1322 = z9;
                            CharSequence charSequence822 = charSequence2;
                            q47 q47Var522 = q47Var3;
                            yjb yjbVar222 = (yjb) zjbVar3;
                            checkoutPaymentMethods = yjbVar222.a.n;
                            if (checkoutPaymentMethods != null) {
                            }
                            String source622 = TransportPaymentListSource.DEFAULT.getSource();
                            String str922 = source622;
                            CheckoutResponse.CheckoutPaymentMethods checkoutPaymentMethods322 = yjbVar222.a.n;
                            return new u0f0(charSequence6, charSequence822, charSequence5, q47Var522, f4a0Var5, z1322, str922, checkoutPaymentMethods322 != null ? checkoutPaymentMethods322.c : str4, checkoutPaymentMethods322 != null ? checkoutPaymentMethods322.b : str4, 32);
                        }
                        double d14 = checkoutUIStateMapper$mapPriceState$1.D$1;
                        double d15 = checkoutUIStateMapper$mapPriceState$1.D$0;
                        boolean z15 = checkoutUIStateMapper$mapPriceState$1.Z$2;
                        z5 = checkoutUIStateMapper$mapPriceState$1.Z$1;
                        z4 = checkoutUIStateMapper$mapPriceState$1.Z$0;
                        int i7 = checkoutUIStateMapper$mapPriceState$1.I$0;
                        String str10 = (String) checkoutUIStateMapper$mapPriceState$1.L$7;
                        CheckoutResponse.d dVar4 = (CheckoutResponse.d) checkoutUIStateMapper$mapPriceState$1.L$6;
                        CheckoutResponse.c cVar5 = (CheckoutResponse.c) checkoutUIStateMapper$mapPriceState$1.L$5;
                        q47 q47Var6 = (q47) checkoutUIStateMapper$mapPriceState$1.L$4;
                        f4a0 f4a0Var7 = (f4a0) checkoutUIStateMapper$mapPriceState$1.L$1;
                        zjbVar2 = (zjb) checkoutUIStateMapper$mapPriceState$1.L$0;
                        kotlin.b.b(obj2);
                        obj = obj2;
                        f4a0Var3 = f4a0Var7;
                        cVar3 = cVar5;
                        dVar2 = dVar4;
                        str3 = str10;
                        i4 = i7;
                        d4 = d15;
                        q47Var2 = q47Var6;
                        d5 = d14;
                        z7 = z15;
                        charSequence = (CharSequence) obj;
                        coroutineSingletons2 = coroutineSingletons3;
                        dVar = dVar2;
                        cVar2 = cVar3;
                        str2 = str3;
                        double d16 = d5;
                        q47Var = q47Var2;
                        i3 = i4;
                        d2 = d4;
                        d3 = d16;
                        f4a0 f4a0Var8 = f4a0Var3;
                        Double d17 = cVar2.c;
                        d6 = d3;
                        d7 = d17 != null ? new Double(a(d17.doubleValue(), i3, z5)) : null;
                        if (d7 != null) {
                            if ((dVar != null ? dVar.c : null) != null) {
                                Map n = n(d7.doubleValue(), str2);
                                FormattedText formattedText2 = dVar.c;
                                checkoutUIStateMapper$mapPriceState$1.L$0 = zjbVar2;
                                checkoutUIStateMapper$mapPriceState$1.L$1 = f4a0Var8;
                                checkoutUIStateMapper$mapPriceState$1.L$2 = null;
                                checkoutUIStateMapper$mapPriceState$1.L$3 = null;
                                checkoutUIStateMapper$mapPriceState$1.L$4 = q47Var;
                                checkoutUIStateMapper$mapPriceState$1.L$5 = null;
                                checkoutUIStateMapper$mapPriceState$1.L$6 = dVar;
                                checkoutUIStateMapper$mapPriceState$1.L$7 = null;
                                checkoutUIStateMapper$mapPriceState$1.L$8 = null;
                                checkoutUIStateMapper$mapPriceState$1.L$9 = charSequence;
                                checkoutUIStateMapper$mapPriceState$1.L$10 = null;
                                checkoutUIStateMapper$mapPriceState$1.L$11 = null;
                                checkoutUIStateMapper$mapPriceState$1.I$0 = i3;
                                checkoutUIStateMapper$mapPriceState$1.Z$0 = z4;
                                checkoutUIStateMapper$mapPriceState$1.Z$1 = z5;
                                checkoutUIStateMapper$mapPriceState$1.Z$2 = z7;
                                checkoutUIStateMapper$mapPriceState$1.D$0 = d2;
                                zjb zjbVar6 = zjbVar2;
                                CharSequence charSequence9 = charSequence;
                                checkoutUIStateMapper$mapPriceState$1.D$1 = d6;
                                checkoutUIStateMapper$mapPriceState$1.label = 3;
                                bVar = this;
                                Object e = ru.yandex.taxi.widget.c.e(bVar.a, formattedText2, n, false, checkoutUIStateMapper$mapPriceState$1, 28);
                                coroutineSingletons3 = coroutineSingletons2;
                                if (e == coroutineSingletons3) {
                                    return coroutineSingletons3;
                                }
                                CheckoutResponse.d dVar5 = dVar;
                                obj2 = e;
                                zjbVar4 = zjbVar6;
                                d9 = d2;
                                f4a0Var4 = f4a0Var8;
                                charSequence4 = charSequence9;
                                dVar3 = dVar5;
                                d8 = d9;
                                zjbVar3 = zjbVar4;
                                z9 = z7;
                                z10 = z4;
                                q47Var3 = q47Var;
                                charSequence3 = (CharSequence) obj2;
                                z8 = z5;
                                charSequence2 = charSequence4;
                                double d132 = d6;
                                if (dVar3 != null) {
                                }
                                str4 = null;
                                charSequence5 = charSequence3;
                                charSequence6 = null;
                                f4a0Var5 = f4a0Var4;
                                boolean z13222 = z9;
                                CharSequence charSequence8222 = charSequence2;
                                q47 q47Var5222 = q47Var3;
                                yjb yjbVar2222 = (yjb) zjbVar3;
                                checkoutPaymentMethods = yjbVar2222.a.n;
                                if (checkoutPaymentMethods != null) {
                                }
                                String source6222 = TransportPaymentListSource.DEFAULT.getSource();
                                String str9222 = source6222;
                                CheckoutResponse.CheckoutPaymentMethods checkoutPaymentMethods3222 = yjbVar2222.a.n;
                                return new u0f0(charSequence6, charSequence8222, charSequence5, q47Var5222, f4a0Var5, z13222, str9222, checkoutPaymentMethods3222 != null ? checkoutPaymentMethods3222.c : str4, checkoutPaymentMethods3222 != null ? checkoutPaymentMethods3222.b : str4, 32);
                            }
                        }
                        coroutineSingletons3 = coroutineSingletons2;
                        zjbVar3 = zjbVar2;
                        CharSequence charSequence10 = charSequence;
                        bVar = this;
                        CheckoutResponse.d dVar6 = dVar;
                        z8 = z5;
                        charSequence2 = charSequence10;
                        dVar3 = dVar6;
                        z9 = z7;
                        d8 = d2;
                        f4a0Var4 = f4a0Var8;
                        z10 = z4;
                        q47Var3 = q47Var;
                        charSequence3 = null;
                        double d1322 = d6;
                        if (dVar3 != null) {
                        }
                        str4 = null;
                        charSequence5 = charSequence3;
                        charSequence6 = null;
                        f4a0Var5 = f4a0Var4;
                        boolean z132222 = z9;
                        CharSequence charSequence82222 = charSequence2;
                        q47 q47Var52222 = q47Var3;
                        yjb yjbVar22222 = (yjb) zjbVar3;
                        checkoutPaymentMethods = yjbVar22222.a.n;
                        if (checkoutPaymentMethods != null) {
                        }
                        String source62222 = TransportPaymentListSource.DEFAULT.getSource();
                        String str92222 = source62222;
                        CheckoutResponse.CheckoutPaymentMethods checkoutPaymentMethods32222 = yjbVar22222.a.n;
                        return new u0f0(charSequence6, charSequence82222, charSequence5, q47Var52222, f4a0Var5, z132222, str92222, checkoutPaymentMethods32222 != null ? checkoutPaymentMethods32222.c : str4, checkoutPaymentMethods32222 != null ? checkoutPaymentMethods32222.b : str4, 32);
                    }
                    double d18 = checkoutUIStateMapper$mapPriceState$1.D$0;
                    boolean z16 = checkoutUIStateMapper$mapPriceState$1.Z$2;
                    z5 = checkoutUIStateMapper$mapPriceState$1.Z$1;
                    z4 = checkoutUIStateMapper$mapPriceState$1.Z$0;
                    i3 = checkoutUIStateMapper$mapPriceState$1.I$0;
                    f4a0 f4a0Var9 = (f4a0) checkoutUIStateMapper$mapPriceState$1.L$1;
                    zjbVar = (zjb) checkoutUIStateMapper$mapPriceState$1.L$0;
                    kotlin.b.b(obj2);
                    z6 = z16;
                    coroutineSingletons = coroutineSingletons3;
                    f4a0Var2 = f4a0Var9;
                    d = d18;
                }
                q47 q47Var7 = (q47) obj2;
                yjb yjbVar3 = (yjb) zjbVar;
                CheckoutResponse checkoutResponse2 = yjbVar3.a;
                CheckoutResponse checkoutResponse3 = yjbVar3.a;
                cVar = checkoutResponse2.d;
                if (cVar != null) {
                    CheckoutResponse.CheckoutPaymentMethods checkoutPaymentMethods4 = checkoutResponse3.n;
                    if (checkoutPaymentMethods4 == null || (source4 = checkoutPaymentMethods4.a) == null || (source3 = source4.getKey()) == null) {
                        source3 = TransportPaymentListSource.DEFAULT.getSource();
                    }
                    String str11 = source3;
                    CheckoutResponse.CheckoutPaymentMethods checkoutPaymentMethods5 = checkoutResponse3.n;
                    return new u0f0((CharSequence) null, (CharSequence) null, (CharSequence) null, q47Var7, f4a0Var2, z6, str11, checkoutPaymentMethods5 != null ? checkoutPaymentMethods5.c : null, checkoutPaymentMethods5 != null ? checkoutPaymentMethods5.b : null, 39);
                }
                q47Var = q47Var7;
                f4a0 f4a0Var10 = f4a0Var2;
                z7 = z6;
                CheckoutResponse.d dVar7 = checkoutResponse2.j;
                String str12 = cVar.b.d;
                if (str12 == null) {
                    str12 = "";
                }
                String str13 = str12;
                CoroutineSingletons coroutineSingletons4 = coroutineSingletons;
                double a2 = a(cVar.a, i3, z5);
                Map n2 = n(a2, str13);
                if (dVar7 != null) {
                    FormattedText formattedText3 = dVar7.b;
                    if (formattedText3 != null) {
                        checkoutUIStateMapper$mapPriceState$1.L$0 = zjbVar;
                        checkoutUIStateMapper$mapPriceState$1.L$1 = f4a0Var10;
                        f4a0Var3 = f4a0Var10;
                        checkoutUIStateMapper$mapPriceState$1.L$2 = null;
                        checkoutUIStateMapper$mapPriceState$1.L$3 = null;
                        checkoutUIStateMapper$mapPriceState$1.L$4 = q47Var;
                        checkoutUIStateMapper$mapPriceState$1.L$5 = cVar;
                        checkoutUIStateMapper$mapPriceState$1.L$6 = dVar7;
                        checkoutUIStateMapper$mapPriceState$1.L$7 = str13;
                        checkoutUIStateMapper$mapPriceState$1.L$8 = null;
                        checkoutUIStateMapper$mapPriceState$1.L$9 = null;
                        checkoutUIStateMapper$mapPriceState$1.I$0 = i3;
                        checkoutUIStateMapper$mapPriceState$1.Z$0 = z4;
                        checkoutUIStateMapper$mapPriceState$1.Z$1 = z5;
                        checkoutUIStateMapper$mapPriceState$1.Z$2 = z7;
                        checkoutUIStateMapper$mapPriceState$1.D$0 = d;
                        checkoutUIStateMapper$mapPriceState$1.D$1 = a2;
                        checkoutUIStateMapper$mapPriceState$1.label = 2;
                        Object e2 = ru.yandex.taxi.widget.c.e(this.a, formattedText3, n2, false, checkoutUIStateMapper$mapPriceState$1, 28);
                        coroutineSingletons3 = coroutineSingletons4;
                        if (e2 == coroutineSingletons3) {
                            return coroutineSingletons3;
                        }
                        obj = e2;
                        zjbVar2 = zjbVar;
                        cVar3 = cVar;
                        d4 = d;
                        dVar2 = dVar7;
                        q47Var2 = q47Var;
                        str3 = str13;
                        i4 = i3;
                        d5 = a2;
                        charSequence = (CharSequence) obj;
                        coroutineSingletons2 = coroutineSingletons3;
                        dVar = dVar2;
                        cVar2 = cVar3;
                        str2 = str3;
                        double d162 = d5;
                        q47Var = q47Var2;
                        i3 = i4;
                        d2 = d4;
                        d3 = d162;
                        f4a0 f4a0Var82 = f4a0Var3;
                        Double d172 = cVar2.c;
                        d6 = d3;
                        if (d172 != null) {
                        }
                        if (d7 != null) {
                        }
                        coroutineSingletons3 = coroutineSingletons2;
                        zjbVar3 = zjbVar2;
                        CharSequence charSequence102 = charSequence;
                        bVar = this;
                        CheckoutResponse.d dVar62 = dVar;
                        z8 = z5;
                        charSequence2 = charSequence102;
                        dVar3 = dVar62;
                        z9 = z7;
                        d8 = d2;
                        f4a0Var4 = f4a0Var82;
                        z10 = z4;
                        q47Var3 = q47Var;
                        charSequence3 = null;
                        double d13222 = d6;
                        if (dVar3 != null) {
                        }
                        str4 = null;
                        charSequence5 = charSequence3;
                        charSequence6 = null;
                        f4a0Var5 = f4a0Var4;
                        boolean z1322222 = z9;
                        CharSequence charSequence822222 = charSequence2;
                        q47 q47Var522222 = q47Var3;
                        yjb yjbVar222222 = (yjb) zjbVar3;
                        checkoutPaymentMethods = yjbVar222222.a.n;
                        if (checkoutPaymentMethods != null) {
                        }
                        String source622222 = TransportPaymentListSource.DEFAULT.getSource();
                        String str922222 = source622222;
                        CheckoutResponse.CheckoutPaymentMethods checkoutPaymentMethods322222 = yjbVar222222.a.n;
                        return new u0f0(charSequence6, charSequence822222, charSequence5, q47Var522222, f4a0Var5, z1322222, str922222, checkoutPaymentMethods322222 != null ? checkoutPaymentMethods322222.c : str4, checkoutPaymentMethods322222 != null ? checkoutPaymentMethods322222.b : str4, 32);
                    }
                    coroutineSingletons4 = coroutineSingletons4;
                }
                f4a0Var3 = f4a0Var10;
                coroutineSingletons2 = coroutineSingletons4;
                zjbVar2 = zjbVar;
                dVar = dVar7;
                cVar2 = cVar;
                charSequence = null;
                str2 = str13;
                d2 = d;
                d3 = a2;
                f4a0 f4a0Var822 = f4a0Var3;
                Double d1722 = cVar2.c;
                d6 = d3;
                if (d1722 != null) {
                }
                if (d7 != null) {
                }
                coroutineSingletons3 = coroutineSingletons2;
                zjbVar3 = zjbVar2;
                CharSequence charSequence1022 = charSequence;
                bVar = this;
                CheckoutResponse.d dVar622 = dVar;
                z8 = z5;
                charSequence2 = charSequence1022;
                dVar3 = dVar622;
                z9 = z7;
                d8 = d2;
                f4a0Var4 = f4a0Var822;
                z10 = z4;
                q47Var3 = q47Var;
                charSequence3 = null;
                double d132222 = d6;
                if (dVar3 != null) {
                }
                str4 = null;
                charSequence5 = charSequence3;
                charSequence6 = null;
                f4a0Var5 = f4a0Var4;
                boolean z13222222 = z9;
                CharSequence charSequence8222222 = charSequence2;
                q47 q47Var5222222 = q47Var3;
                yjb yjbVar2222222 = (yjb) zjbVar3;
                checkoutPaymentMethods = yjbVar2222222.a.n;
                if (checkoutPaymentMethods != null) {
                }
                String source6222222 = TransportPaymentListSource.DEFAULT.getSource();
                String str9222222 = source6222222;
                CheckoutResponse.CheckoutPaymentMethods checkoutPaymentMethods3222222 = yjbVar2222222.a.n;
                return new u0f0(charSequence6, charSequence8222222, charSequence5, q47Var5222222, f4a0Var5, z13222222, str9222222, checkoutPaymentMethods3222222 != null ? checkoutPaymentMethods3222222.c : str4, checkoutPaymentMethods3222222 != null ? checkoutPaymentMethods3222222.b : str4, 32);
            }
        }
        checkoutUIStateMapper$mapPriceState$1 = new CheckoutUIStateMapper$mapPriceState$1(bVar, continuationImpl);
        Object obj22 = checkoutUIStateMapper$mapPriceState$1.result;
        CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = checkoutUIStateMapper$mapPriceState$1.label;
        if (i2 != 0) {
        }
        q47 q47Var72 = (q47) obj22;
        yjb yjbVar32 = (yjb) zjbVar;
        CheckoutResponse checkoutResponse22 = yjbVar32.a;
        CheckoutResponse checkoutResponse32 = yjbVar32.a;
        cVar = checkoutResponse22.d;
        if (cVar != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0074, code lost:
    
        if (r12 == r0) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(CheckoutResponse.StopsSelector.c cVar, ContinuationImpl continuationImpl) {
        CheckoutUIStateMapper$mapStopItem$1 checkoutUIStateMapper$mapStopItem$1;
        Object obj;
        int i;
        Bitmap bitmap;
        Object e;
        CheckoutResponse.StopsSelector.c cVar2;
        Bitmap bitmap2;
        CharSequence charSequence;
        FormattedText formattedText;
        CharSequence charSequence2;
        if (continuationImpl instanceof CheckoutUIStateMapper$mapStopItem$1) {
            checkoutUIStateMapper$mapStopItem$1 = (CheckoutUIStateMapper$mapStopItem$1) continuationImpl;
            int i2 = checkoutUIStateMapper$mapStopItem$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                checkoutUIStateMapper$mapStopItem$1.label = i2 - Integer.MIN_VALUE;
                CheckoutUIStateMapper$mapStopItem$1 checkoutUIStateMapper$mapStopItem$12 = checkoutUIStateMapper$mapStopItem$1;
                Object obj2 = checkoutUIStateMapper$mapStopItem$12.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = checkoutUIStateMapper$mapStopItem$12.label;
                CharSequence charSequence3 = null;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    String str = cVar.a;
                    if (str == null) {
                        bitmap = null;
                        FormattedText formattedText2 = cVar.b;
                        checkoutUIStateMapper$mapStopItem$12.L$0 = cVar;
                        checkoutUIStateMapper$mapStopItem$12.L$1 = null;
                        checkoutUIStateMapper$mapStopItem$12.L$2 = bitmap;
                        checkoutUIStateMapper$mapStopItem$12.label = 2;
                        e = ru.yandex.taxi.widget.c.e(this.a, formattedText2, null, false, checkoutUIStateMapper$mapStopItem$12, 30);
                        if (e != obj) {
                            cVar2 = cVar;
                            bitmap2 = bitmap;
                            obj2 = e;
                            charSequence = (CharSequence) obj2;
                            formattedText = cVar2.c;
                            if (formattedText != null) {
                            }
                            return new miu0(bitmap2, charSequence, charSequence3, 8);
                        }
                        return obj;
                    }
                    checkoutUIStateMapper$mapStopItem$12.L$0 = cVar;
                    checkoutUIStateMapper$mapStopItem$12.L$1 = null;
                    checkoutUIStateMapper$mapStopItem$12.label = 1;
                    obj2 = b(str, checkoutUIStateMapper$mapStopItem$12);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            charSequence2 = (CharSequence) checkoutUIStateMapper$mapStopItem$12.L$3;
                            bitmap2 = (Bitmap) checkoutUIStateMapper$mapStopItem$12.L$2;
                            kotlin.b.b(obj2);
                            charSequence3 = (CharSequence) obj2;
                            charSequence = charSequence2;
                            return new miu0(bitmap2, charSequence, charSequence3, 8);
                        }
                        bitmap2 = (Bitmap) checkoutUIStateMapper$mapStopItem$12.L$2;
                        cVar2 = (CheckoutResponse.StopsSelector.c) checkoutUIStateMapper$mapStopItem$12.L$0;
                        kotlin.b.b(obj2);
                        charSequence = (CharSequence) obj2;
                        formattedText = cVar2.c;
                        if (formattedText != null) {
                            checkoutUIStateMapper$mapStopItem$12.L$0 = null;
                            checkoutUIStateMapper$mapStopItem$12.L$1 = null;
                            checkoutUIStateMapper$mapStopItem$12.L$2 = bitmap2;
                            checkoutUIStateMapper$mapStopItem$12.L$3 = charSequence;
                            checkoutUIStateMapper$mapStopItem$12.label = 3;
                            Object e2 = ru.yandex.taxi.widget.c.e(this.a, formattedText, null, false, checkoutUIStateMapper$mapStopItem$12, 30);
                            if (e2 != obj) {
                                obj2 = e2;
                                charSequence2 = charSequence;
                                charSequence3 = (CharSequence) obj2;
                                charSequence = charSequence2;
                            }
                            return obj;
                        }
                        return new miu0(bitmap2, charSequence, charSequence3, 8);
                    }
                    cVar = (CheckoutResponse.StopsSelector.c) checkoutUIStateMapper$mapStopItem$12.L$0;
                    kotlin.b.b(obj2);
                }
                bitmap = (Bitmap) obj2;
                FormattedText formattedText22 = cVar.b;
                checkoutUIStateMapper$mapStopItem$12.L$0 = cVar;
                checkoutUIStateMapper$mapStopItem$12.L$1 = null;
                checkoutUIStateMapper$mapStopItem$12.L$2 = bitmap;
                checkoutUIStateMapper$mapStopItem$12.label = 2;
                e = ru.yandex.taxi.widget.c.e(this.a, formattedText22, null, false, checkoutUIStateMapper$mapStopItem$12, 30);
                if (e != obj) {
                }
                return obj;
            }
        }
        checkoutUIStateMapper$mapStopItem$1 = new CheckoutUIStateMapper$mapStopItem$1(this, continuationImpl);
        CheckoutUIStateMapper$mapStopItem$1 checkoutUIStateMapper$mapStopItem$122 = checkoutUIStateMapper$mapStopItem$1;
        Object obj22 = checkoutUIStateMapper$mapStopItem$122.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = checkoutUIStateMapper$mapStopItem$122.label;
        CharSequence charSequence32 = null;
        if (i != 0) {
        }
        bitmap = (Bitmap) obj22;
        FormattedText formattedText222 = cVar.b;
        checkoutUIStateMapper$mapStopItem$122.L$0 = cVar;
        checkoutUIStateMapper$mapStopItem$122.L$1 = null;
        checkoutUIStateMapper$mapStopItem$122.L$2 = bitmap;
        checkoutUIStateMapper$mapStopItem$122.label = 2;
        e = ru.yandex.taxi.widget.c.e(this.a, formattedText222, null, false, checkoutUIStateMapper$mapStopItem$122, 30);
        if (e != obj) {
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
    
        if (r10 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(CheckoutResponse.StopsSelector stopsSelector, boolean z, ContinuationImpl continuationImpl) {
        CheckoutUIStateMapper$mapStops$1 checkoutUIStateMapper$mapStops$1;
        int i;
        miu0 miu0Var;
        CheckoutResponse.StopsSelector.c cVar;
        boolean z2;
        CheckoutResponse.StopsSelector stopsSelector2;
        miu0 miu0Var2;
        if (continuationImpl instanceof CheckoutUIStateMapper$mapStops$1) {
            checkoutUIStateMapper$mapStops$1 = (CheckoutUIStateMapper$mapStops$1) continuationImpl;
            int i2 = checkoutUIStateMapper$mapStops$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                checkoutUIStateMapper$mapStops$1.label = i2 - Integer.MIN_VALUE;
                Object obj = checkoutUIStateMapper$mapStops$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = checkoutUIStateMapper$mapStops$1.label;
                miu0 miu0Var3 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    CheckoutResponse.StopsSelector.c cVar2 = stopsSelector.b.a;
                    checkoutUIStateMapper$mapStops$1.L$0 = stopsSelector;
                    checkoutUIStateMapper$mapStops$1.Z$0 = z;
                    checkoutUIStateMapper$mapStops$1.label = 1;
                    obj = i(cVar2, checkoutUIStateMapper$mapStops$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z2 = checkoutUIStateMapper$mapStops$1.Z$0;
                        miu0Var2 = (miu0) checkoutUIStateMapper$mapStops$1.L$2;
                        stopsSelector2 = (CheckoutResponse.StopsSelector) checkoutUIStateMapper$mapStops$1.L$0;
                        kotlin.b.b(obj);
                        miu0Var3 = (miu0) obj;
                        miu0Var = miu0Var2;
                        stopsSelector = stopsSelector2;
                        z = z2;
                        return new ciu0(miu0Var, miu0Var3, stopsSelector.c.isEmpty() && !z, stopsSelector.a);
                    }
                    z = checkoutUIStateMapper$mapStops$1.Z$0;
                    stopsSelector = (CheckoutResponse.StopsSelector) checkoutUIStateMapper$mapStops$1.L$0;
                    kotlin.b.b(obj);
                }
                miu0Var = (miu0) obj;
                cVar = stopsSelector.b.b;
                if (cVar != null) {
                    checkoutUIStateMapper$mapStops$1.L$0 = stopsSelector;
                    checkoutUIStateMapper$mapStops$1.L$1 = null;
                    checkoutUIStateMapper$mapStops$1.L$2 = miu0Var;
                    checkoutUIStateMapper$mapStops$1.Z$0 = z;
                    checkoutUIStateMapper$mapStops$1.label = 2;
                    Object i3 = i(cVar, checkoutUIStateMapper$mapStops$1);
                    if (i3 != obj2) {
                        obj = i3;
                        z2 = z;
                        stopsSelector2 = stopsSelector;
                        miu0Var2 = miu0Var;
                        miu0Var3 = (miu0) obj;
                        miu0Var = miu0Var2;
                        stopsSelector = stopsSelector2;
                        z = z2;
                    }
                    return obj2;
                }
                return new ciu0(miu0Var, miu0Var3, stopsSelector.c.isEmpty() && !z, stopsSelector.a);
            }
        }
        checkoutUIStateMapper$mapStops$1 = new CheckoutUIStateMapper$mapStops$1(this, continuationImpl);
        Object obj3 = checkoutUIStateMapper$mapStops$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = checkoutUIStateMapper$mapStops$1.label;
        miu0 miu0Var32 = null;
        if (i != 0) {
        }
        miu0Var = (miu0) obj3;
        cVar = stopsSelector.b.b;
        if (cVar != null) {
        }
        return new ciu0(miu0Var, miu0Var32, stopsSelector.c.isEmpty() && !z, stopsSelector.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(yjb yjbVar, r6f r6fVar, int i, f4a0 f4a0Var, boolean z, on30 on30Var, e3n e3nVar, ContinuationImpl continuationImpl) {
        CheckoutUIStateMapper$mapSuccessPaymentCheckoutUiState$1 checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$1;
        CoroutineSingletons coroutineSingletons;
        int i2;
        String str;
        on30 on30Var2;
        yjb yjbVar2;
        boolean z2;
        r6f r6fVar2;
        int i3;
        f4a0 f4a0Var2;
        e3n e3nVar2;
        Object c;
        int i4;
        f4a0 f4a0Var3;
        r6f r6fVar3;
        String str2;
        e3n e3nVar3;
        yjb yjbVar3;
        on30 on30Var3;
        vz01 vz01Var;
        wye wyeVar;
        CheckoutResponse.c cVar;
        Double d;
        FormattedText formattedText;
        b bVar;
        Double d2;
        vz01 vz01Var2;
        e3n e3nVar4;
        f4a0 f4a0Var4;
        String str3;
        r6f r6fVar4;
        yjb yjbVar4;
        int i5;
        wye wyeVar2;
        boolean z3;
        String str4;
        CharSequence charSequence;
        boolean z4;
        String str5;
        Double d3;
        CheckoutResponse.StopsSelector stopsSelector;
        yjb yjbVar5;
        b bVar2;
        e3n e3nVar5;
        on30 on30Var4;
        String str6;
        wye wyeVar3;
        Double d4;
        boolean z5;
        vz01 vz01Var3;
        String str7;
        f4a0 f4a0Var5;
        CharSequence charSequence2;
        r6f r6fVar5;
        ciu0 ciu0Var;
        wye wyeVar4;
        on30 on30Var5;
        Object h;
        yjb yjbVar6;
        f4a0 f4a0Var6;
        boolean z6;
        ciu0 ciu0Var2;
        CharSequence charSequence3;
        Double d5;
        String str8;
        wye wyeVar5;
        String str9;
        vz01 vz01Var4;
        if (continuationImpl instanceof CheckoutUIStateMapper$mapSuccessPaymentCheckoutUiState$1) {
            checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$1 = (CheckoutUIStateMapper$mapSuccessPaymentCheckoutUiState$1) continuationImpl;
            int i6 = checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$1.label = i6 - Integer.MIN_VALUE;
                CheckoutUIStateMapper$mapSuccessPaymentCheckoutUiState$1 checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12 = checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$1;
                Object obj = checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.label;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    str = yjbVar.c;
                    CheckoutResponse.TransportItem transportItem = yjbVar.a.h;
                    checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$0 = yjbVar;
                    checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$1 = r6fVar;
                    checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$2 = f4a0Var;
                    on30Var2 = on30Var;
                    checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$3 = on30Var2;
                    checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$4 = e3nVar;
                    checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$5 = str;
                    checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.I$0 = i;
                    checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.Z$0 = z;
                    checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.label = 1;
                    obj = l(transportItem, checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12);
                    if (obj != coroutineSingletons) {
                        yjbVar2 = yjbVar;
                        z2 = z;
                        r6fVar2 = r6fVar;
                        i3 = i;
                        f4a0Var2 = f4a0Var;
                        e3nVar2 = e3nVar;
                    }
                    return coroutineSingletons;
                }
                if (i2 == 1) {
                    z2 = checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.Z$0;
                    i3 = checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.I$0;
                    str = (String) checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$5;
                    e3nVar2 = (e3n) checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$4;
                    on30Var2 = (on30) checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$3;
                    f4a0Var2 = (f4a0) checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$2;
                    r6fVar2 = (r6f) checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$1;
                    yjbVar2 = (yjb) checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$0;
                    kotlin.b.b(obj);
                } else {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 != 4) {
                                if (i2 != 5) {
                                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                boolean z7 = checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.Z$0;
                                ciu0 ciu0Var3 = (ciu0) checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$11;
                                CharSequence charSequence4 = (CharSequence) checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$10;
                                Double d6 = (Double) checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$9;
                                String str10 = (String) checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$8;
                                wye wyeVar6 = (wye) checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$7;
                                vz01 vz01Var5 = (vz01) checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$6;
                                String str11 = (String) checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$5;
                                f4a0 f4a0Var7 = (f4a0) checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$2;
                                yjbVar6 = (yjb) checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$0;
                                kotlin.b.b(obj);
                                z6 = z7;
                                ciu0Var2 = ciu0Var3;
                                charSequence3 = charSequence4;
                                d5 = d6;
                                str8 = str10;
                                wyeVar5 = wyeVar6;
                                vz01Var4 = vz01Var5;
                                str9 = str11;
                                f4a0Var6 = f4a0Var7;
                                return new CheckoutUIState$PaymentCheckoutUIState(str9, null, vz01Var4, wyeVar5, (u0f0) obj, str8, ciu0Var2, null, d5, null, f4a0Var6, charSequence3, yjbVar6.b, z6, yjbVar6.a.k.d, 674690);
                            }
                            boolean z8 = checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.Z$0;
                            i5 = checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.I$0;
                            charSequence = (CharSequence) checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$10;
                            d3 = (Double) checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$9;
                            str4 = (String) checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$8;
                            wyeVar4 = (wye) checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$7;
                            vz01Var2 = (vz01) checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$6;
                            str3 = (String) checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$5;
                            e3nVar4 = (e3n) checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$4;
                            on30Var5 = (on30) checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$3;
                            f4a0Var4 = (f4a0) checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$2;
                            r6fVar4 = (r6f) checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$1;
                            yjb yjbVar7 = (yjb) checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$0;
                            kotlin.b.b(obj);
                            yjbVar5 = yjbVar7;
                            bVar2 = this;
                            z3 = z8;
                            e3nVar5 = e3nVar4;
                            on30Var4 = on30Var5;
                            str6 = str3;
                            wyeVar3 = wyeVar4;
                            d4 = d3;
                            z5 = z3;
                            vz01Var3 = vz01Var2;
                            str7 = str4;
                            f4a0Var5 = f4a0Var4;
                            charSequence2 = charSequence;
                            r6fVar5 = r6fVar4;
                            ciu0Var = (ciu0) obj;
                            yjb yjbVar8 = yjbVar5;
                            boolean z9 = r6fVar5.e;
                            boolean z10 = !z9 || yjbVar8.d;
                            zuj0 zuj0Var = bVar2.c;
                            String h2 = z9 ? ((avj0) zuj0Var).h(kyh0.mt_payment_processing) : ((avj0) zuj0Var).h(kyh0.common_loading);
                            boolean z11 = on30Var4 instanceof mn30;
                            checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$0 = yjbVar8;
                            checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$1 = null;
                            checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$2 = f4a0Var5;
                            checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$3 = null;
                            checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$4 = null;
                            checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$5 = str6;
                            checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$6 = vz01Var3;
                            checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$7 = wyeVar3;
                            checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$8 = str7;
                            checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$9 = d4;
                            checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$10 = charSequence2;
                            checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$11 = ciu0Var;
                            checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.I$0 = i5;
                            checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.Z$0 = z5;
                            checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.label = 5;
                            f4a0 f4a0Var8 = f4a0Var5;
                            vz01 vz01Var6 = vz01Var3;
                            String str12 = str6;
                            h = h(i5, yjbVar8, f4a0Var8, z10, h2, z5, z11, e3nVar5, checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12);
                            if (h != coroutineSingletons) {
                                yjbVar6 = yjbVar8;
                                f4a0Var6 = f4a0Var8;
                                z6 = z5;
                                ciu0Var2 = ciu0Var;
                                charSequence3 = charSequence2;
                                d5 = d4;
                                str8 = str7;
                                wyeVar5 = wyeVar3;
                                str9 = str12;
                                vz01Var4 = vz01Var6;
                                obj = h;
                                return new CheckoutUIState$PaymentCheckoutUIState(str9, null, vz01Var4, wyeVar5, (u0f0) obj, str8, ciu0Var2, null, d5, null, f4a0Var6, charSequence3, yjbVar6.b, z6, yjbVar6.a.k.d, 674690);
                            }
                            return coroutineSingletons;
                        }
                        z4 = checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.Z$0;
                        i5 = checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.I$0;
                        Double d7 = (Double) checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$9;
                        str5 = (String) checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$8;
                        wyeVar = (wye) checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$7;
                        vz01Var = (vz01) checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$6;
                        str2 = (String) checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$5;
                        e3nVar3 = (e3n) checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$4;
                        on30Var3 = (on30) checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$3;
                        f4a0Var3 = (f4a0) checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$2;
                        r6fVar3 = (r6f) checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$1;
                        yjbVar3 = (yjb) checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$0;
                        kotlin.b.b(obj);
                        d2 = d7;
                        bVar = this;
                        f4a0 f4a0Var9 = f4a0Var3;
                        vz01Var2 = vz01Var;
                        e3nVar4 = e3nVar3;
                        f4a0Var4 = f4a0Var9;
                        r6f r6fVar6 = r6fVar3;
                        str3 = str2;
                        r6fVar4 = r6fVar6;
                        z3 = z4;
                        yjbVar4 = yjbVar3;
                        charSequence = (CharSequence) obj;
                        wyeVar2 = wyeVar;
                        str4 = str5;
                        d3 = d2;
                        stopsSelector = yjbVar4.a.g;
                        if (stopsSelector == null) {
                            yjbVar5 = yjbVar4;
                            bVar2 = bVar;
                            coroutineSingletons = coroutineSingletons;
                            e3nVar5 = e3nVar4;
                            on30Var4 = on30Var3;
                            str6 = str3;
                            wyeVar3 = wyeVar2;
                            d4 = d3;
                            z5 = z3;
                            vz01Var3 = vz01Var2;
                            str7 = str4;
                            f4a0Var5 = f4a0Var4;
                            charSequence2 = charSequence;
                            r6fVar5 = r6fVar4;
                            ciu0Var = null;
                            yjb yjbVar82 = yjbVar5;
                            boolean z92 = r6fVar5.e;
                            if (z92) {
                            }
                            zuj0 zuj0Var2 = bVar2.c;
                            String h22 = z92 ? ((avj0) zuj0Var2).h(kyh0.mt_payment_processing) : ((avj0) zuj0Var2).h(kyh0.common_loading);
                            boolean z112 = on30Var4 instanceof mn30;
                            checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$0 = yjbVar82;
                            checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$1 = null;
                            checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$2 = f4a0Var5;
                            checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$3 = null;
                            checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$4 = null;
                            checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$5 = str6;
                            checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$6 = vz01Var3;
                            checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$7 = wyeVar3;
                            checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$8 = str7;
                            checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$9 = d4;
                            checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$10 = charSequence2;
                            checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$11 = ciu0Var;
                            checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.I$0 = i5;
                            checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.Z$0 = z5;
                            checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.label = 5;
                            f4a0 f4a0Var82 = f4a0Var5;
                            vz01 vz01Var62 = vz01Var3;
                            String str122 = str6;
                            h = h(i5, yjbVar82, f4a0Var82, z10, h22, z5, z112, e3nVar5, checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12);
                            if (h != coroutineSingletons) {
                            }
                            return coroutineSingletons;
                        }
                        boolean z12 = r6fVar4.e || yjbVar4.d;
                        checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$0 = yjbVar4;
                        checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$1 = r6fVar4;
                        checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$2 = f4a0Var4;
                        checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$3 = on30Var3;
                        checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$4 = e3nVar4;
                        checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$5 = str3;
                        checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$6 = vz01Var2;
                        checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$7 = wyeVar2;
                        checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$8 = str4;
                        checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$9 = d3;
                        checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$10 = charSequence;
                        yjbVar5 = yjbVar4;
                        checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$11 = null;
                        checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.I$0 = i5;
                        checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.Z$0 = z3;
                        checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.label = 4;
                        bVar2 = this;
                        Object j = bVar2.j(stopsSelector, z12, checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12);
                        coroutineSingletons = coroutineSingletons;
                        if (j != coroutineSingletons) {
                            on30 on30Var6 = on30Var3;
                            wyeVar4 = wyeVar2;
                            obj = j;
                            on30Var5 = on30Var6;
                            e3nVar5 = e3nVar4;
                            on30Var4 = on30Var5;
                            str6 = str3;
                            wyeVar3 = wyeVar4;
                            d4 = d3;
                            z5 = z3;
                            vz01Var3 = vz01Var2;
                            str7 = str4;
                            f4a0Var5 = f4a0Var4;
                            charSequence2 = charSequence;
                            r6fVar5 = r6fVar4;
                            ciu0Var = (ciu0) obj;
                            yjb yjbVar822 = yjbVar5;
                            boolean z922 = r6fVar5.e;
                            if (z922) {
                            }
                            zuj0 zuj0Var22 = bVar2.c;
                            String h222 = z922 ? ((avj0) zuj0Var22).h(kyh0.mt_payment_processing) : ((avj0) zuj0Var22).h(kyh0.common_loading);
                            boolean z1122 = on30Var4 instanceof mn30;
                            checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$0 = yjbVar822;
                            checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$1 = null;
                            checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$2 = f4a0Var5;
                            checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$3 = null;
                            checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$4 = null;
                            checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$5 = str6;
                            checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$6 = vz01Var3;
                            checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$7 = wyeVar3;
                            checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$8 = str7;
                            checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$9 = d4;
                            checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$10 = charSequence2;
                            checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$11 = ciu0Var;
                            checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.I$0 = i5;
                            checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.Z$0 = z5;
                            checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.label = 5;
                            f4a0 f4a0Var822 = f4a0Var5;
                            vz01 vz01Var622 = vz01Var3;
                            String str1222 = str6;
                            h = h(i5, yjbVar822, f4a0Var822, z10, h222, z5, z1122, e3nVar5, checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12);
                            if (h != coroutineSingletons) {
                            }
                        }
                        return coroutineSingletons;
                    }
                    z2 = checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.Z$0;
                    int i7 = checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.I$0;
                    vz01 vz01Var7 = (vz01) checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$6;
                    String str13 = (String) checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$5;
                    e3n e3nVar6 = (e3n) checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$4;
                    on30 on30Var7 = (on30) checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$3;
                    f4a0 f4a0Var10 = (f4a0) checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$2;
                    r6f r6fVar7 = (r6f) checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$1;
                    yjb yjbVar9 = (yjb) checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$0;
                    kotlin.b.b(obj);
                    i4 = i7;
                    f4a0Var3 = f4a0Var10;
                    r6fVar3 = r6fVar7;
                    str2 = str13;
                    e3nVar3 = e3nVar6;
                    yjbVar3 = yjbVar9;
                    on30Var3 = on30Var7;
                    vz01Var = vz01Var7;
                    wyeVar = (wye) obj;
                    CheckoutResponse checkoutResponse = yjbVar3.a;
                    String str14 = checkoutResponse.b;
                    cVar = checkoutResponse.d;
                    if (cVar == null) {
                        Double d8 = cVar.c;
                        d = new Double(a(d8 != null ? d8.doubleValue() : cVar.a, i4, z2));
                    } else {
                        d = null;
                    }
                    formattedText = yjbVar3.a.l;
                    if (formattedText == null) {
                        checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$0 = yjbVar3;
                        checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$1 = r6fVar3;
                        checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$2 = f4a0Var3;
                        checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$3 = on30Var3;
                        checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$4 = e3nVar3;
                        checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$5 = str2;
                        checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$6 = vz01Var;
                        checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$7 = wyeVar;
                        checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$8 = str14;
                        checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$9 = d;
                        checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$10 = null;
                        checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.I$0 = i4;
                        checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.Z$0 = z2;
                        checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.label = 3;
                        bVar = this;
                        d2 = d;
                        boolean z13 = z2;
                        Object i8 = ru.yandex.taxi.widget.c.i(bVar.a, formattedText, null, checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12, 30);
                        if (i8 != coroutineSingletons) {
                            obj = i8;
                            i5 = i4;
                            z4 = z13;
                            str5 = str14;
                            f4a0 f4a0Var92 = f4a0Var3;
                            vz01Var2 = vz01Var;
                            e3nVar4 = e3nVar3;
                            f4a0Var4 = f4a0Var92;
                            r6f r6fVar62 = r6fVar3;
                            str3 = str2;
                            r6fVar4 = r6fVar62;
                            z3 = z4;
                            yjbVar4 = yjbVar3;
                            charSequence = (CharSequence) obj;
                            wyeVar2 = wyeVar;
                            str4 = str5;
                            d3 = d2;
                            stopsSelector = yjbVar4.a.g;
                            if (stopsSelector == null) {
                            }
                        }
                        return coroutineSingletons;
                    }
                    bVar = this;
                    d2 = d;
                    boolean z14 = z2;
                    f4a0 f4a0Var11 = f4a0Var3;
                    vz01Var2 = vz01Var;
                    e3nVar4 = e3nVar3;
                    f4a0Var4 = f4a0Var11;
                    r6f r6fVar8 = r6fVar3;
                    str3 = str2;
                    r6fVar4 = r6fVar8;
                    yjbVar4 = yjbVar3;
                    i5 = i4;
                    wyeVar2 = wyeVar;
                    z3 = z14;
                    str4 = str14;
                    charSequence = null;
                    d3 = d2;
                    stopsSelector = yjbVar4.a.g;
                    if (stopsSelector == null) {
                    }
                }
                vz01 vz01Var8 = (vz01) obj;
                CheckoutResponse checkoutResponse2 = yjbVar2.a;
                CheckoutResponse.b bVar3 = checkoutResponse2.i;
                boolean z15 = checkoutResponse2.d == null;
                boolean z16 = !r6fVar2.e || yjbVar2.d;
                q8j0 q8j0Var = yjbVar2.b;
                checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$0 = yjbVar2;
                checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$1 = r6fVar2;
                checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$2 = f4a0Var2;
                checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$3 = on30Var2;
                checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$4 = e3nVar2;
                checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$5 = str;
                checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.L$6 = vz01Var8;
                checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.I$0 = i3;
                checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.Z$0 = z2;
                checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12.label = 2;
                int i9 = i3;
                c = c(bVar3, i9, z15, z16, q8j0Var, checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$12);
                i4 = i9;
                if (c != coroutineSingletons) {
                    f4a0Var3 = f4a0Var2;
                    r6fVar3 = r6fVar2;
                    str2 = str;
                    e3nVar3 = e3nVar2;
                    yjbVar3 = yjbVar2;
                    on30Var3 = on30Var2;
                    vz01Var = vz01Var8;
                    obj = c;
                    wyeVar = (wye) obj;
                    CheckoutResponse checkoutResponse3 = yjbVar3.a;
                    String str142 = checkoutResponse3.b;
                    cVar = checkoutResponse3.d;
                    if (cVar == null) {
                    }
                    formattedText = yjbVar3.a.l;
                    if (formattedText == null) {
                    }
                }
                return coroutineSingletons;
            }
        }
        checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$1 = new CheckoutUIStateMapper$mapSuccessPaymentCheckoutUiState$1(this, continuationImpl);
        CheckoutUIStateMapper$mapSuccessPaymentCheckoutUiState$1 checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$122 = checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$1;
        Object obj2 = checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$122.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$122.label;
        if (i2 != 0) {
        }
        vz01 vz01Var82 = (vz01) obj2;
        CheckoutResponse checkoutResponse22 = yjbVar2.a;
        CheckoutResponse.b bVar32 = checkoutResponse22.i;
        if (checkoutResponse22.d == null) {
        }
        if (r6fVar2.e) {
        }
        q8j0 q8j0Var2 = yjbVar2.b;
        checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$122.L$0 = yjbVar2;
        checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$122.L$1 = r6fVar2;
        checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$122.L$2 = f4a0Var2;
        checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$122.L$3 = on30Var2;
        checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$122.L$4 = e3nVar2;
        checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$122.L$5 = str;
        checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$122.L$6 = vz01Var82;
        checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$122.I$0 = i3;
        checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$122.Z$0 = z2;
        checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$122.label = 2;
        int i92 = i3;
        c = c(bVar32, i92, z15, z16, q8j0Var2, checkoutUIStateMapper$mapSuccessPaymentCheckoutUiState$122);
        i4 = i92;
        if (c != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(CheckoutResponse.TransportItem transportItem, ContinuationImpl continuationImpl) {
        CheckoutUIStateMapper$mapTransportState$1 checkoutUIStateMapper$mapTransportState$1;
        int i;
        String str;
        CheckoutResponse.TransportItem.TransportType transportType;
        CheckoutResponse.TransportItem.a aVar;
        FormattedText formattedText;
        CheckoutResponse.TransportItem.TransportType transportType2;
        CharSequence charSequence;
        CharSequence charSequence2;
        String str2;
        CheckoutResponse.TransportItem.a aVar2;
        String str3;
        CharSequence charSequence3;
        CheckoutResponse.TransportItem.TransportType transportType3;
        String str4;
        CharSequence charSequence4;
        CheckoutResponse.TransportItem.TransportType transportType4;
        String str5;
        CheckoutResponse.TransportItem.a aVar3;
        if (continuationImpl instanceof CheckoutUIStateMapper$mapTransportState$1) {
            checkoutUIStateMapper$mapTransportState$1 = (CheckoutUIStateMapper$mapTransportState$1) continuationImpl;
            int i2 = checkoutUIStateMapper$mapTransportState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                checkoutUIStateMapper$mapTransportState$1.label = i2 - Integer.MIN_VALUE;
                CheckoutUIStateMapper$mapTransportState$1 checkoutUIStateMapper$mapTransportState$12 = checkoutUIStateMapper$mapTransportState$1;
                Object obj = checkoutUIStateMapper$mapTransportState$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = checkoutUIStateMapper$mapTransportState$12.label;
                Bitmap bitmap = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    CheckoutResponse.TransportItem.a aVar4 = transportItem.b;
                    str = transportItem.a;
                    transportType = transportItem.c;
                    if (aVar4 == null) {
                        return new vz01(str, transportType, 28);
                    }
                    FormattedText formattedText2 = aVar4.a;
                    checkoutUIStateMapper$mapTransportState$12.L$0 = null;
                    checkoutUIStateMapper$mapTransportState$12.L$1 = aVar4;
                    checkoutUIStateMapper$mapTransportState$12.L$2 = str;
                    checkoutUIStateMapper$mapTransportState$12.L$3 = transportType;
                    checkoutUIStateMapper$mapTransportState$12.label = 1;
                    Object e = ru.yandex.taxi.widget.c.e(this.a, formattedText2, null, false, checkoutUIStateMapper$mapTransportState$12, 30);
                    if (e != obj2) {
                        aVar = aVar4;
                        obj = e;
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        charSequence4 = (CharSequence) checkoutUIStateMapper$mapTransportState$12.L$6;
                        charSequence = (CharSequence) checkoutUIStateMapper$mapTransportState$12.L$5;
                        transportType4 = (CheckoutResponse.TransportItem.TransportType) checkoutUIStateMapper$mapTransportState$12.L$4;
                        str5 = (String) checkoutUIStateMapper$mapTransportState$12.L$3;
                        aVar3 = (CheckoutResponse.TransportItem.a) checkoutUIStateMapper$mapTransportState$12.L$1;
                        kotlin.b.b(obj);
                        bitmap = (Bitmap) obj;
                        charSequence3 = charSequence4;
                        transportType3 = transportType4;
                        str4 = str5;
                        aVar2 = aVar3;
                        return new vz01(str4, transportType3, charSequence, charSequence3, new aw6(bitmap, aVar2.c.a));
                    }
                    charSequence = (CharSequence) checkoutUIStateMapper$mapTransportState$12.L$5;
                    transportType2 = (CheckoutResponse.TransportItem.TransportType) checkoutUIStateMapper$mapTransportState$12.L$4;
                    str2 = (String) checkoutUIStateMapper$mapTransportState$12.L$3;
                    aVar2 = (CheckoutResponse.TransportItem.a) checkoutUIStateMapper$mapTransportState$12.L$1;
                    kotlin.b.b(obj);
                    charSequence2 = (CharSequence) obj;
                    str3 = aVar2.c.b;
                    if (str3 == null) {
                        charSequence3 = charSequence2;
                        transportType3 = transportType2;
                        str4 = str2;
                        return new vz01(str4, transportType3, charSequence, charSequence3, new aw6(bitmap, aVar2.c.a));
                    }
                    checkoutUIStateMapper$mapTransportState$12.L$0 = null;
                    checkoutUIStateMapper$mapTransportState$12.L$1 = aVar2;
                    checkoutUIStateMapper$mapTransportState$12.L$2 = null;
                    checkoutUIStateMapper$mapTransportState$12.L$3 = str2;
                    checkoutUIStateMapper$mapTransportState$12.L$4 = transportType2;
                    checkoutUIStateMapper$mapTransportState$12.L$5 = charSequence;
                    checkoutUIStateMapper$mapTransportState$12.L$6 = charSequence2;
                    checkoutUIStateMapper$mapTransportState$12.label = 3;
                    Object b = b(str3, checkoutUIStateMapper$mapTransportState$12);
                    if (b != obj2) {
                        CharSequence charSequence5 = charSequence2;
                        obj = b;
                        charSequence4 = charSequence5;
                        transportType4 = transportType2;
                        str5 = str2;
                        aVar3 = aVar2;
                        bitmap = (Bitmap) obj;
                        charSequence3 = charSequence4;
                        transportType3 = transportType4;
                        str4 = str5;
                        aVar2 = aVar3;
                        return new vz01(str4, transportType3, charSequence, charSequence3, new aw6(bitmap, aVar2.c.a));
                    }
                    return obj2;
                }
                transportType = (CheckoutResponse.TransportItem.TransportType) checkoutUIStateMapper$mapTransportState$12.L$3;
                String str6 = (String) checkoutUIStateMapper$mapTransportState$12.L$2;
                CheckoutResponse.TransportItem.a aVar5 = (CheckoutResponse.TransportItem.a) checkoutUIStateMapper$mapTransportState$12.L$1;
                kotlin.b.b(obj);
                str = str6;
                aVar = aVar5;
                CharSequence charSequence6 = (CharSequence) obj;
                formattedText = aVar.b;
                if (formattedText == null) {
                    checkoutUIStateMapper$mapTransportState$12.L$0 = null;
                    checkoutUIStateMapper$mapTransportState$12.L$1 = aVar;
                    checkoutUIStateMapper$mapTransportState$12.L$2 = null;
                    checkoutUIStateMapper$mapTransportState$12.L$3 = str;
                    checkoutUIStateMapper$mapTransportState$12.L$4 = transportType;
                    checkoutUIStateMapper$mapTransportState$12.L$5 = charSequence6;
                    checkoutUIStateMapper$mapTransportState$12.label = 2;
                    Object e2 = ru.yandex.taxi.widget.c.e(this.a, formattedText, null, false, checkoutUIStateMapper$mapTransportState$12, 30);
                    if (e2 != obj2) {
                        transportType2 = transportType;
                        charSequence = charSequence6;
                        obj = e2;
                        str2 = str;
                        aVar2 = aVar;
                        charSequence2 = (CharSequence) obj;
                        str3 = aVar2.c.b;
                        if (str3 == null) {
                        }
                    }
                    return obj2;
                }
                transportType2 = transportType;
                charSequence = charSequence6;
                charSequence2 = null;
                str2 = str;
                aVar2 = aVar;
                str3 = aVar2.c.b;
                if (str3 == null) {
                }
            }
        }
        checkoutUIStateMapper$mapTransportState$1 = new CheckoutUIStateMapper$mapTransportState$1(this, continuationImpl);
        CheckoutUIStateMapper$mapTransportState$1 checkoutUIStateMapper$mapTransportState$122 = checkoutUIStateMapper$mapTransportState$1;
        Object obj3 = checkoutUIStateMapper$mapTransportState$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = checkoutUIStateMapper$mapTransportState$122.label;
        Bitmap bitmap2 = null;
        if (i != 0) {
        }
        CharSequence charSequence62 = (CharSequence) obj3;
        formattedText = aVar.b;
        if (formattedText == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x01ef, code lost:
    
        if (r4 == r9) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(int i, zjb zjbVar, f4a0 f4a0Var, r6f r6fVar, boolean z, boolean z2, on30 on30Var, e3n e3nVar, ContinuationImpl continuationImpl) {
        CheckoutUIStateMapper$mapUiState$1 checkoutUIStateMapper$mapUiState$1;
        int i2;
        boolean z3;
        f4a0 f4a0Var2;
        f4a0 f4a0Var3;
        f4a0 f4a0Var4;
        zjb zjbVar2;
        boolean z4;
        boolean z5;
        Object l;
        boolean z6;
        boolean z7;
        List list;
        vz01 vz01Var;
        zjb zjbVar3;
        int i3 = i;
        if (continuationImpl instanceof CheckoutUIStateMapper$mapUiState$1) {
            checkoutUIStateMapper$mapUiState$1 = (CheckoutUIStateMapper$mapUiState$1) continuationImpl;
            int i4 = checkoutUIStateMapper$mapUiState$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                checkoutUIStateMapper$mapUiState$1.label = i4 - Integer.MIN_VALUE;
                Object obj = checkoutUIStateMapper$mapUiState$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = checkoutUIStateMapper$mapUiState$1.label;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    if (zjbVar instanceof ujb) {
                        List list2 = ((ujb) zjbVar).a.e.b;
                        checkoutUIStateMapper$mapUiState$1.L$0 = zjbVar;
                        f4a0Var4 = f4a0Var;
                        checkoutUIStateMapper$mapUiState$1.L$1 = f4a0Var4;
                        checkoutUIStateMapper$mapUiState$1.L$2 = null;
                        checkoutUIStateMapper$mapUiState$1.L$3 = null;
                        checkoutUIStateMapper$mapUiState$1.L$4 = null;
                        checkoutUIStateMapper$mapUiState$1.I$0 = i3;
                        checkoutUIStateMapper$mapUiState$1.Z$0 = z;
                        checkoutUIStateMapper$mapUiState$1.Z$1 = z2;
                        checkoutUIStateMapper$mapUiState$1.label = 1;
                        obj = o(list2, checkoutUIStateMapper$mapUiState$1);
                        if (obj != obj2) {
                            zjbVar2 = zjbVar;
                            z4 = z2;
                            z5 = z;
                            List list3 = (List) obj;
                            if (z4) {
                            }
                            return d(((ujb) zjbVar2).b, f4a0Var4, z5, null, null);
                        }
                    } else {
                        if (!(zjbVar instanceof yjb)) {
                            if (zjbVar instanceof xjb) {
                                return new CheckoutUIState$PaymentCheckoutUIState(null, null, null, null, null, null, null, null, null, null, f4a0Var, null, null, z, null, 978815);
                            }
                            if (jl40.l(zjbVar, wjb.a)) {
                                return pnb.a;
                            }
                            if (zjbVar instanceof vjb) {
                                vjb vjbVar = (vjb) zjbVar;
                                return d(vjbVar.b, f4a0Var, z, vjbVar.a, vjbVar.c);
                            }
                            w511.b();
                            return null;
                        }
                        yjb yjbVar = (yjb) zjbVar;
                        boolean z8 = r6fVar.b;
                        checkoutUIStateMapper$mapUiState$1.L$0 = null;
                        checkoutUIStateMapper$mapUiState$1.L$1 = null;
                        checkoutUIStateMapper$mapUiState$1.L$2 = null;
                        checkoutUIStateMapper$mapUiState$1.L$3 = null;
                        checkoutUIStateMapper$mapUiState$1.L$4 = null;
                        checkoutUIStateMapper$mapUiState$1.I$0 = i3;
                        checkoutUIStateMapper$mapUiState$1.Z$0 = z;
                        checkoutUIStateMapper$mapUiState$1.Z$1 = z2;
                        checkoutUIStateMapper$mapUiState$1.label = 4;
                        CheckoutResponse.CheckoutPaymentMethods checkoutPaymentMethods = yjbVar.a.n;
                        CheckoutResponse.CheckoutPaymentMethods.Source source = checkoutPaymentMethods != null ? checkoutPaymentMethods.a : null;
                        if ((source == null ? -1 : rnb.a[source.ordinal()]) == 1) {
                            if (on30Var instanceof nn30) {
                                f4a0Var3 = ((nn30) on30Var).b;
                                if (f4a0Var3 == null) {
                                    f4a0Var3 = f4a0.c;
                                }
                            } else {
                                f4a0Var3 = f4a0.c;
                            }
                            f4a0Var2 = f4a0Var3;
                            z3 = z8;
                        } else {
                            z3 = z8;
                            f4a0Var2 = f4a0Var;
                        }
                        obj = z3 ? e(yjbVar, r6fVar, i3, f4a0Var2, z, checkoutUIStateMapper$mapUiState$1) : k(yjbVar, r6fVar, i3, f4a0Var2, z, on30Var, e3nVar, checkoutUIStateMapper$mapUiState$1);
                    }
                    return obj2;
                }
                if (i2 == 1) {
                    z4 = checkoutUIStateMapper$mapUiState$1.Z$1;
                    z5 = checkoutUIStateMapper$mapUiState$1.Z$0;
                    i3 = checkoutUIStateMapper$mapUiState$1.I$0;
                    f4a0 f4a0Var5 = (f4a0) checkoutUIStateMapper$mapUiState$1.L$1;
                    zjbVar2 = (zjb) checkoutUIStateMapper$mapUiState$1.L$0;
                    kotlin.b.b(obj);
                    f4a0Var4 = f4a0Var5;
                    List list32 = (List) obj;
                    if (z4 || list32.isEmpty()) {
                        return d(((ujb) zjbVar2).b, f4a0Var4, z5, null, null);
                    }
                    CheckoutResponse.TransportItem transportItem = ((ujb) zjbVar2).a.h;
                    checkoutUIStateMapper$mapUiState$1.L$0 = zjbVar2;
                    checkoutUIStateMapper$mapUiState$1.L$1 = null;
                    checkoutUIStateMapper$mapUiState$1.L$2 = null;
                    checkoutUIStateMapper$mapUiState$1.L$3 = null;
                    checkoutUIStateMapper$mapUiState$1.L$4 = null;
                    checkoutUIStateMapper$mapUiState$1.L$5 = list32;
                    checkoutUIStateMapper$mapUiState$1.I$0 = i3;
                    checkoutUIStateMapper$mapUiState$1.Z$0 = z5;
                    checkoutUIStateMapper$mapUiState$1.Z$1 = z4;
                    checkoutUIStateMapper$mapUiState$1.label = 2;
                    l = l(transportItem, checkoutUIStateMapper$mapUiState$1);
                    if (l != obj2) {
                        z6 = z5;
                        z7 = z4;
                        list = list32;
                        int i5 = i3;
                        boolean z9 = z6;
                        vz01 vz01Var2 = (vz01) l;
                        FormattedText formattedText = ((ujb) zjbVar2).a.e.a;
                        checkoutUIStateMapper$mapUiState$1.L$0 = zjbVar2;
                        checkoutUIStateMapper$mapUiState$1.L$1 = null;
                        checkoutUIStateMapper$mapUiState$1.L$2 = null;
                        checkoutUIStateMapper$mapUiState$1.L$3 = null;
                        checkoutUIStateMapper$mapUiState$1.L$4 = null;
                        checkoutUIStateMapper$mapUiState$1.L$5 = list;
                        checkoutUIStateMapper$mapUiState$1.L$6 = vz01Var2;
                        checkoutUIStateMapper$mapUiState$1.I$0 = i5;
                        checkoutUIStateMapper$mapUiState$1.Z$0 = z9;
                        checkoutUIStateMapper$mapUiState$1.Z$1 = z7;
                        checkoutUIStateMapper$mapUiState$1.label = 3;
                        obj = ru.yandex.taxi.widget.c.e(this.a, formattedText, null, false, checkoutUIStateMapper$mapUiState$1, 30);
                        if (obj != obj2) {
                        }
                    }
                    return obj2;
                }
                if (i2 == 2) {
                    boolean z10 = checkoutUIStateMapper$mapUiState$1.Z$1;
                    boolean z11 = checkoutUIStateMapper$mapUiState$1.Z$0;
                    i3 = checkoutUIStateMapper$mapUiState$1.I$0;
                    List list4 = (List) checkoutUIStateMapper$mapUiState$1.L$5;
                    zjbVar2 = (zjb) checkoutUIStateMapper$mapUiState$1.L$0;
                    kotlin.b.b(obj);
                    z6 = z11;
                    z7 = z10;
                    list = list4;
                    l = obj;
                    int i52 = i3;
                    boolean z92 = z6;
                    vz01 vz01Var22 = (vz01) l;
                    FormattedText formattedText2 = ((ujb) zjbVar2).a.e.a;
                    checkoutUIStateMapper$mapUiState$1.L$0 = zjbVar2;
                    checkoutUIStateMapper$mapUiState$1.L$1 = null;
                    checkoutUIStateMapper$mapUiState$1.L$2 = null;
                    checkoutUIStateMapper$mapUiState$1.L$3 = null;
                    checkoutUIStateMapper$mapUiState$1.L$4 = null;
                    checkoutUIStateMapper$mapUiState$1.L$5 = list;
                    checkoutUIStateMapper$mapUiState$1.L$6 = vz01Var22;
                    checkoutUIStateMapper$mapUiState$1.I$0 = i52;
                    checkoutUIStateMapper$mapUiState$1.Z$0 = z92;
                    checkoutUIStateMapper$mapUiState$1.Z$1 = z7;
                    checkoutUIStateMapper$mapUiState$1.label = 3;
                    obj = ru.yandex.taxi.widget.c.e(this.a, formattedText2, null, false, checkoutUIStateMapper$mapUiState$1, 30);
                    if (obj != obj2) {
                        vz01Var = vz01Var22;
                        zjbVar3 = zjbVar2;
                    }
                    return obj2;
                }
                if (i2 != 3) {
                    if (i2 != 4) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return (qnb) obj;
                }
                vz01Var = (vz01) checkoutUIStateMapper$mapUiState$1.L$6;
                list = (List) checkoutUIStateMapper$mapUiState$1.L$5;
                zjbVar3 = (zjb) checkoutUIStateMapper$mapUiState$1.L$0;
                kotlin.b.b(obj);
                return new onb(vz01Var, (CharSequence) obj, list, ((ujb) zjbVar3).a.b);
            }
        }
        checkoutUIStateMapper$mapUiState$1 = new CheckoutUIStateMapper$mapUiState$1(this, continuationImpl);
        Object obj3 = checkoutUIStateMapper$mapUiState$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = checkoutUIStateMapper$mapUiState$1.label;
        if (i2 != 0) {
        }
        return new onb(vz01Var, (CharSequence) obj3, list, ((ujb) zjbVar3).a.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0072 -> B:11:0x00a8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x009b -> B:10:0x009f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(List list, ContinuationImpl continuationImpl) {
        CheckoutUIStateMapper$toUiState$1 checkoutUIStateMapper$toUiState$1;
        int i;
        ArrayList arrayList;
        Iterator it;
        CheckoutUIStateMapper$toUiState$1 checkoutUIStateMapper$toUiState$12;
        if (continuationImpl instanceof CheckoutUIStateMapper$toUiState$1) {
            checkoutUIStateMapper$toUiState$1 = (CheckoutUIStateMapper$toUiState$1) continuationImpl;
            int i2 = checkoutUIStateMapper$toUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                checkoutUIStateMapper$toUiState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = checkoutUIStateMapper$toUiState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = checkoutUIStateMapper$toUiState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    arrayList = new ArrayList();
                    it = list.iterator();
                    checkoutUIStateMapper$toUiState$12 = checkoutUIStateMapper$toUiState$1;
                    if (!it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str = (String) checkoutUIStateMapper$toUiState$1.L$9;
                    it = (Iterator) checkoutUIStateMapper$toUiState$1.L$5;
                    ?? r5 = (Collection) checkoutUIStateMapper$toUiState$1.L$3;
                    kotlin.b.b(obj);
                    ArrayList arrayList2 = r5;
                    ulj uljVar = new ulj((CharSequence) obj, str);
                    checkoutUIStateMapper$toUiState$12 = checkoutUIStateMapper$toUiState$1;
                    arrayList = arrayList2;
                    if (uljVar != null) {
                        arrayList.add(uljVar);
                    }
                    if (!it.hasNext()) {
                        tlj tljVar = (tlj) it.next();
                        if (evu0.J(tljVar.a)) {
                            uljVar = null;
                            if (uljVar != null) {
                            }
                            if (!it.hasNext()) {
                                return arrayList;
                            }
                        } else {
                            String str2 = tljVar.a;
                            FormattedText formattedText = tljVar.b;
                            checkoutUIStateMapper$toUiState$12.L$0 = null;
                            checkoutUIStateMapper$toUiState$12.L$1 = null;
                            checkoutUIStateMapper$toUiState$12.L$2 = null;
                            checkoutUIStateMapper$toUiState$12.L$3 = arrayList;
                            checkoutUIStateMapper$toUiState$12.L$4 = null;
                            checkoutUIStateMapper$toUiState$12.L$5 = it;
                            checkoutUIStateMapper$toUiState$12.L$6 = null;
                            checkoutUIStateMapper$toUiState$12.L$7 = null;
                            checkoutUIStateMapper$toUiState$12.L$8 = null;
                            checkoutUIStateMapper$toUiState$12.L$9 = str2;
                            checkoutUIStateMapper$toUiState$12.label = 1;
                            Object e = ru.yandex.taxi.widget.c.e(this.a, formattedText, null, false, checkoutUIStateMapper$toUiState$12, 30);
                            if (e == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            arrayList2 = arrayList;
                            obj = e;
                            str = str2;
                            checkoutUIStateMapper$toUiState$1 = checkoutUIStateMapper$toUiState$12;
                            ulj uljVar2 = new ulj((CharSequence) obj, str);
                            checkoutUIStateMapper$toUiState$12 = checkoutUIStateMapper$toUiState$1;
                            arrayList = arrayList2;
                            if (uljVar2 != null) {
                            }
                            if (!it.hasNext()) {
                            }
                        }
                    }
                }
            }
        }
        checkoutUIStateMapper$toUiState$1 = new CheckoutUIStateMapper$toUiState$1(this, continuationImpl);
        Object obj2 = checkoutUIStateMapper$toUiState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = checkoutUIStateMapper$toUiState$1.label;
        if (i != 0) {
        }
    }
}
