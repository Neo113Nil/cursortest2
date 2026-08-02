package app.cash.local.primitives;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.protos.cash.local.client.v1.LocalPaymentOption;
import com.squareup.protos.cash.local.client.v1.LocalStoredInstrument;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class PaymentMethod {

    public final class Standalone extends PaymentMethod {
        public final LocalPaymentOption paymentOption;
        public final String token;

        public Standalone(LocalPaymentOption localPaymentOption) {
            localPaymentOption.getClass();
            this.paymentOption = localPaymentOption;
            String name = localPaymentOption.name();
            name.getClass();
            this.token = name;
            if (localPaymentOption != LocalPaymentOption.LOCAL_PAYMENT_OPTION_STORED_INSTRUMENT) {
                return;
            }
            a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
            throw null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Standalone) && this.paymentOption == ((Standalone) obj).paymentOption;
        }

        @Override // app.cash.local.primitives.PaymentMethod
        public final LocalPaymentOption getPaymentOption() {
            return this.paymentOption;
        }

        @Override // app.cash.local.primitives.PaymentMethod
        /* renamed from: getToken-3m_AGhc */
        public final String mo1281getToken3m_AGhc() {
            return this.token;
        }

        public final int hashCode() {
            return this.paymentOption.hashCode();
        }

        public final String toString() {
            return "Standalone(paymentOption=" + this.paymentOption + ")";
        }
    }

    public final class StoredInstrument extends PaymentMethod {
        public final String displayBrand;
        public final String displayName;
        public final LocalPaymentOption paymentOption;
        public final String token;

        /* renamed from: type, reason: collision with root package name */
        public final LocalStoredInstrument.Type f912type;

        public StoredInstrument(String str, LocalPaymentOption localPaymentOption, String str2, String str3, LocalStoredInstrument.Type type2) {
            str.getClass();
            localPaymentOption.getClass();
            type2.getClass();
            this.token = str;
            this.paymentOption = localPaymentOption;
            this.displayBrand = str2;
            this.displayName = str3;
            this.f912type = type2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StoredInstrument)) {
                return false;
            }
            StoredInstrument storedInstrument = (StoredInstrument) obj;
            return Intrinsics.areEqual(this.token, storedInstrument.token) && this.paymentOption == storedInstrument.paymentOption && Intrinsics.areEqual(this.displayBrand, storedInstrument.displayBrand) && Intrinsics.areEqual(this.displayName, storedInstrument.displayName) && this.f912type == storedInstrument.f912type;
        }

        @Override // app.cash.local.primitives.PaymentMethod
        public final LocalPaymentOption getPaymentOption() {
            return this.paymentOption;
        }

        @Override // app.cash.local.primitives.PaymentMethod
        /* renamed from: getToken-3m_AGhc */
        public final String mo1281getToken3m_AGhc() {
            return this.token;
        }

        public final int hashCode() {
            int hashCode = (this.paymentOption.hashCode() + (this.token.hashCode() * 31)) * 31;
            String str = this.displayBrand;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.displayName;
            return this.f912type.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            String m1282toStringimpl = PaymentMethodToken.m1282toStringimpl(this.token);
            StringBuilder sb = new StringBuilder("StoredInstrument(token=");
            sb.append(m1282toStringimpl);
            sb.append(", paymentOption=");
            sb.append(this.paymentOption);
            sb.append(", displayBrand=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.displayBrand, ", displayName=", this.displayName, ", type=");
            sb.append(this.f912type);
            sb.append(")");
            return sb.toString();
        }
    }

    public abstract LocalPaymentOption getPaymentOption();

    /* renamed from: getToken-3m_AGhc, reason: not valid java name */
    public abstract String mo1281getToken3m_AGhc();
}
