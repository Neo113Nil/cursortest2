package defpackage;

import android.os.Parcelable;

/* loaded from: classes4.dex */
public abstract class q9o implements Parcelable {
    public static String e(bfk bfkVar, String str) {
        String bfkVar2 = bfkVar != null ? bfkVar.toString() : null;
        return bfkVar2 != null ? ouj.o(str, ": ", bfkVar2) : str;
    }

    public final String d() {
        if (equals(n8o.a)) {
            return "cardInputScreenLoading";
        }
        if (equals(o8o.a)) {
            return "challengerScreenLoading";
        }
        if (equals(g9o.a)) {
            return "sbpChooserScreenLoading";
        }
        if (equals(l9o.a)) {
            return "selectMethodScreenLoading";
        }
        if (equals(j9o.a)) {
            return "sbpPaymentLoading";
        }
        if (equals(c9o.a)) {
            return "sbpBankOpeningLoading";
        }
        if (this instanceof h9o) {
            return e(((h9o) this).a, "sbpFailure");
        }
        if (equals(i9o.a)) {
            return "sbpNoAppsResult";
        }
        if (equals(b9o.a)) {
            return "sbpBankOpenFailed";
        }
        if (equals(m9o.a)) {
            return "startPayment";
        }
        if (equals(w8o.a)) {
            return "prepareForPayment";
        }
        if (equals(v8o.a)) {
            return "paymentSuccess";
        }
        if (this instanceof t8o) {
            return e(((t8o) this).a, "paymentFailure");
        }
        if (this instanceof u8o) {
            String str = ((u8o) this).a;
            return str != null ? "paymentMethodNotFound: ".concat(str) : "paymentMethodNotFound";
        }
        if (equals(m8o.a)) {
            return "cardBindingSuccess";
        }
        if (this instanceof k8o) {
            return e(((k8o) this).a, "cardBindingFailure");
        }
        if (equals(l8o.a)) {
            return "cardBindingLoading";
        }
        if (equals(o9o.a)) {
            return "verificationLoading";
        }
        if (equals(p9o.a)) {
            return "verificationSuccess";
        }
        if (this instanceof n9o) {
            return e(((n9o) this).a, "verificationFailure");
        }
        if (equals(y8o.a)) {
            return "preselectLoading";
        }
        if (this instanceof x8o) {
            return e(((x8o) this).a, "preselectFailure");
        }
        if (equals(s8o.a)) {
            return "newCardPaymentLoading";
        }
        if (this instanceof d9o) {
            return e(((d9o) this).a, "sbpBindingFailure");
        }
        if (equals(e9o.a)) {
            return "sbpBindingLoading";
        }
        if (equals(k9o.a)) {
            return "sbpWaitingForBankResponse";
        }
        if (equals(f9o.a)) {
            return "sbpBindingSuccess";
        }
        if (equals(p8o.a)) {
            return "cvvScreenLoading";
        }
        if (this instanceof a9o) {
            return e(((a9o) this).a, "pspChallengeFailure");
        }
        if (equals(q8o.a)) {
            return "iPaymentLoading";
        }
        if (equals(r8o.a)) {
            return "iPaymentPolling";
        }
        b6e.s();
        return null;
    }
}
