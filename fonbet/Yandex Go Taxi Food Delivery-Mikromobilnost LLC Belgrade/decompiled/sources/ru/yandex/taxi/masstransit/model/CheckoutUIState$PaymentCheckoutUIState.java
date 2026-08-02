package ru.yandex.taxi.masstransit.model;

import defpackage.b64;
import defpackage.ciu0;
import defpackage.e3n;
import defpackage.f4a0;
import defpackage.gw00;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.kp50;
import defpackage.nnm;
import defpackage.o430;
import defpackage.oez0;
import defpackage.q47;
import defpackage.q8j0;
import defpackage.qnb;
import defpackage.tcc;
import defpackage.u0f0;
import defpackage.unr0;
import defpackage.vz01;
import defpackage.wye;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.time.DurationUnit;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.masstransit.geopayment.analytics.TransportPaymentAnalytics$CheckoutErrorReason;

/* loaded from: classes6.dex */
public final class CheckoutUIState$PaymentCheckoutUIState implements qnb {
    public final String a;
    public final String b;
    public final vz01 c;
    public final wye d;
    public final u0f0 e;
    public final String f;
    public final ciu0 g;
    public final boolean h;
    public final boolean i;
    public final PaymentCheckoutErrorState j;
    public final Double k;
    public final q47 l;
    public final f4a0 m;
    public final CharSequence n;
    public final boolean o;
    public final q8j0 p;
    public final boolean q;
    public final boolean r;
    public final oez0 s;
    public final boolean t;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CheckoutUIState$PaymentCheckoutUIState(String str, String str2, vz01 vz01Var, wye wyeVar, u0f0 u0f0Var, String str3, ciu0 ciu0Var, PaymentCheckoutErrorState paymentCheckoutErrorState, Double d, q47 q47Var, f4a0 f4a0Var, CharSequence charSequence, q8j0 q8j0Var, boolean z, oez0 oez0Var, int i) {
        this(r4, r5, r6, r7, r8, r9, r10, r11, (i & 256) != 0 ? r1 : true, (i & 512) != 0 ? null : paymentCheckoutErrorState, (i & 1024) != 0 ? null : d, (i & 2048) != 0 ? null : q47Var, (i & 4096) != 0 ? f4a0.c : f4a0Var, (i & 8192) != 0 ? null : charSequence, false, (32768 & i) != 0 ? q8j0.g : q8j0Var, (65536 & i) != 0 ? r1 : z, false, (i & 262144) != 0 ? null : oez0Var, false);
        wye wyeVar2;
        boolean z2;
        String str4 = null;
        Object[] objArr = 0;
        String str5 = (i & 1) != 0 ? null : str;
        String str6 = (i & 2) != 0 ? null : str2;
        vz01 vz01Var2 = (i & 4) != 0 ? new vz01(str4, objArr == true ? 1 : 0, 31) : vz01Var;
        if ((i & 8) != 0) {
            o430 o430Var = e3n.b;
            wyeVar2 = new wye("", 1, kp50.U(1, DurationUnit.SECONDS), 1, false, false, "", "", null);
        } else {
            wyeVar2 = wyeVar;
        }
        u0f0 u0f0Var2 = (i & 16) != 0 ? u0f0.k : u0f0Var;
        String str7 = (i & 32) != 0 ? null : str3;
        ciu0 ciu0Var2 = (i & 64) != 0 ? null : ciu0Var;
        boolean z3 = false;
        if ((i & 128) != 0) {
            z2 = false;
        } else {
            z2 = false;
            z3 = true;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutUIState$PaymentCheckoutUIState)) {
            return false;
        }
        CheckoutUIState$PaymentCheckoutUIState checkoutUIState$PaymentCheckoutUIState = (CheckoutUIState$PaymentCheckoutUIState) obj;
        return jl40.l(this.a, checkoutUIState$PaymentCheckoutUIState.a) && jl40.l(this.b, checkoutUIState$PaymentCheckoutUIState.b) && jl40.l(this.c, checkoutUIState$PaymentCheckoutUIState.c) && jl40.l(this.d, checkoutUIState$PaymentCheckoutUIState.d) && jl40.l(this.e, checkoutUIState$PaymentCheckoutUIState.e) && jl40.l(this.f, checkoutUIState$PaymentCheckoutUIState.f) && jl40.l(this.g, checkoutUIState$PaymentCheckoutUIState.g) && this.h == checkoutUIState$PaymentCheckoutUIState.h && this.i == checkoutUIState$PaymentCheckoutUIState.i && jl40.l(this.j, checkoutUIState$PaymentCheckoutUIState.j) && jl40.l(this.k, checkoutUIState$PaymentCheckoutUIState.k) && jl40.l(this.l, checkoutUIState$PaymentCheckoutUIState.l) && jl40.l(this.m, checkoutUIState$PaymentCheckoutUIState.m) && jl40.l(this.n, checkoutUIState$PaymentCheckoutUIState.n) && this.o == checkoutUIState$PaymentCheckoutUIState.o && jl40.l(this.p, checkoutUIState$PaymentCheckoutUIState.p) && this.q == checkoutUIState$PaymentCheckoutUIState.q && this.r == checkoutUIState$PaymentCheckoutUIState.r && jl40.l(this.s, checkoutUIState$PaymentCheckoutUIState.s) && this.t == checkoutUIState$PaymentCheckoutUIState.t;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31)) * 31)) * 31;
        String str3 = this.f;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ciu0 ciu0Var = this.g;
        int e = unr0.e(unr0.e((hashCode3 + (ciu0Var == null ? 0 : ciu0Var.hashCode())) * 31, 31, this.h), 31, this.i);
        PaymentCheckoutErrorState paymentCheckoutErrorState = this.j;
        int hashCode4 = (e + (paymentCheckoutErrorState == null ? 0 : paymentCheckoutErrorState.hashCode())) * 31;
        Double d = this.k;
        int hashCode5 = (hashCode4 + (d == null ? 0 : d.hashCode())) * 31;
        q47 q47Var = this.l;
        int hashCode6 = (this.m.hashCode() + ((hashCode5 + (q47Var == null ? 0 : q47Var.hashCode())) * 31)) * 31;
        CharSequence charSequence = this.n;
        int e2 = unr0.e(unr0.e((this.p.hashCode() + unr0.e((hashCode6 + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31, this.o)) * 31, 31, this.q), 31, this.r);
        oez0 oez0Var = this.s;
        return Boolean.hashCode(this.t) + ((e2 + (oez0Var != null ? oez0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("PaymentCheckoutUIState(checkoutRequestId=", this.a, ", createPaymentRequestId=", this.b, ", transport=");
        v.append(this.c);
        v.append(", counter=");
        v.append(this.d);
        v.append(", priceUIState=");
        v.append(this.e);
        v.append(", startingStopId=");
        v.append(this.f);
        v.append(", stops=");
        v.append(this.g);
        v.append(", isLoading=");
        v.append(this.h);
        v.append(", isError=");
        v.append(this.i);
        v.append(", paymentCheckoutErrorState=");
        v.append(this.j);
        v.append(", priceValue=");
        v.append(this.k);
        v.append(", retryButton=");
        v.append(this.l);
        v.append(", paymentMethod=");
        v.append(this.m);
        v.append(", userAgreement=");
        v.append((Object) this.n);
        v.append(", isPaymentProcessing=");
        v.append(this.o);
        v.append(", requestState=");
        v.append(this.p);
        v.append(", isPaymentMethodsEnabled=");
        nnm.v(", isListPaymentMethodsLoading=", ", timerStateUpdate=", v, this.q, this.r);
        v.append(this.s);
        v.append(", isMosmetroLinkCardExternalAwaiting=");
        v.append(this.t);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public static final class PaymentCheckoutErrorState {
        public final PaymentCheckoutErrorCode a;
        public final String b;
        public final String c;
        public final TransportPaymentAnalytics$CheckoutErrorReason d;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/masstransit/model/CheckoutUIState$PaymentCheckoutUIState$PaymentCheckoutErrorState$PaymentCheckoutErrorCode;", "", "", "type", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "Companion", "ru/yandex/taxi/masstransit/model/a", "MOS_METRO_AUTH_REQUIRED", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final class PaymentCheckoutErrorCode {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ PaymentCheckoutErrorCode[] $VALUES;
            public static final a Companion;
            public static final PaymentCheckoutErrorCode MOS_METRO_AUTH_REQUIRED;
            private static final Map<String, PaymentCheckoutErrorCode> map;
            private final String type = "mosmetro_auth_required";

            static {
                PaymentCheckoutErrorCode paymentCheckoutErrorCode = new PaymentCheckoutErrorCode();
                MOS_METRO_AUTH_REQUIRED = paymentCheckoutErrorCode;
                PaymentCheckoutErrorCode[] paymentCheckoutErrorCodeArr = {paymentCheckoutErrorCode};
                $VALUES = paymentCheckoutErrorCodeArr;
                k4o a = kotlin.enums.a.a(paymentCheckoutErrorCodeArr);
                $ENTRIES = a;
                Companion = new a();
                int d = gw00.d(tcc.n(a, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(d < 16 ? 16 : d);
                for (Object obj : a) {
                    linkedHashMap.put(((PaymentCheckoutErrorCode) obj).type, obj);
                }
                map = linkedHashMap;
            }

            public static PaymentCheckoutErrorCode valueOf(String str) {
                return (PaymentCheckoutErrorCode) Enum.valueOf(PaymentCheckoutErrorCode.class, str);
            }

            public static PaymentCheckoutErrorCode[] values() {
                return (PaymentCheckoutErrorCode[]) $VALUES.clone();
            }
        }

        public PaymentCheckoutErrorState(PaymentCheckoutErrorCode paymentCheckoutErrorCode, String str, String str2, TransportPaymentAnalytics$CheckoutErrorReason transportPaymentAnalytics$CheckoutErrorReason) {
            this.a = paymentCheckoutErrorCode;
            this.b = str;
            this.c = str2;
            this.d = transportPaymentAnalytics$CheckoutErrorReason;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaymentCheckoutErrorState)) {
                return false;
            }
            PaymentCheckoutErrorState paymentCheckoutErrorState = (PaymentCheckoutErrorState) obj;
            return this.a == paymentCheckoutErrorState.a && jl40.l(this.b, paymentCheckoutErrorState.b) && jl40.l(this.c, paymentCheckoutErrorState.c) && this.d == paymentCheckoutErrorState.d;
        }

        public final int hashCode() {
            PaymentCheckoutErrorCode paymentCheckoutErrorCode = this.a;
            int hashCode = (paymentCheckoutErrorCode == null ? 0 : paymentCheckoutErrorCode.hashCode()) * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            TransportPaymentAnalytics$CheckoutErrorReason transportPaymentAnalytics$CheckoutErrorReason = this.d;
            return hashCode3 + (transportPaymentAnalytics$CheckoutErrorReason != null ? transportPaymentAnalytics$CheckoutErrorReason.hashCode() : 0);
        }

        public final String toString() {
            return "PaymentCheckoutErrorState(errorCode=" + this.a + ", errorTitle=" + this.b + ", errorSubtitle=" + this.c + ", errorReason=" + this.d + Extension.C_BRAKE;
        }

        public PaymentCheckoutErrorState() {
            this(null, null, null, null);
        }
    }

    public CheckoutUIState$PaymentCheckoutUIState(String str, String str2, vz01 vz01Var, wye wyeVar, u0f0 u0f0Var, String str3, ciu0 ciu0Var, boolean z, boolean z2, PaymentCheckoutErrorState paymentCheckoutErrorState, Double d, q47 q47Var, f4a0 f4a0Var, CharSequence charSequence, boolean z3, q8j0 q8j0Var, boolean z4, boolean z5, oez0 oez0Var, boolean z6) {
        this.a = str;
        this.b = str2;
        this.c = vz01Var;
        this.d = wyeVar;
        this.e = u0f0Var;
        this.f = str3;
        this.g = ciu0Var;
        this.h = z;
        this.i = z2;
        this.j = paymentCheckoutErrorState;
        this.k = d;
        this.l = q47Var;
        this.m = f4a0Var;
        this.n = charSequence;
        this.o = z3;
        this.p = q8j0Var;
        this.q = z4;
        this.r = z5;
        this.s = oez0Var;
        this.t = z6;
    }

    public CheckoutUIState$PaymentCheckoutUIState() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 1048575);
    }
}
