package ru.yandex.tankerapp.fintech.models.results;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.tse0;
import defpackage.ysq0;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0002'(BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003JV\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020\u0007HÖ\u0001J\t\u0010&\u001a\u00020\tHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016¨\u0006)"}, d2 = {"Lru/yandex/tankerapp/fintech/models/results/FintechError;", "Ljava/io/Serializable;", "kind", "Lru/yandex/tankerapp/fintech/models/results/FintechError$Kind;", "trigger", "Lru/yandex/tankerapp/fintech/models/results/FintechError$Trigger;", AuthSdkActivity.RESPONSE_TYPE_CODE, "", ACSPConstants.STATUS, "", Constants.KEY_MESSAGE, "localizedDescription", "<init>", "(Lru/yandex/tankerapp/fintech/models/results/FintechError$Kind;Lru/yandex/tankerapp/fintech/models/results/FintechError$Trigger;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getKind", "()Lru/yandex/tankerapp/fintech/models/results/FintechError$Kind;", "getTrigger", "()Lru/yandex/tankerapp/fintech/models/results/FintechError$Trigger;", "getCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStatus", "()Ljava/lang/String;", "getMessage", "getLocalizedDescription", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lru/yandex/tankerapp/fintech/models/results/FintechError$Kind;Lru/yandex/tankerapp/fintech/models/results/FintechError$Trigger;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lru/yandex/tankerapp/fintech/models/results/FintechError;", "equals", "", "other", "", "hashCode", "toString", "Kind", "Trigger", "fintech_sdk_interface_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class FintechError implements Serializable {

    @ysq0(AuthSdkActivity.RESPONSE_TYPE_CODE)
    private final Integer code;

    @ysq0("kind")
    private final Kind kind;

    @ysq0("localizedDescription")
    private final String localizedDescription;

    @ysq0(Constants.KEY_MESSAGE)
    private final String message;

    @ysq0(ACSPConstants.STATUS)
    private final String status;

    @ysq0("trigger")
    private final Trigger trigger;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u001b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001c"}, d2 = {"Lru/yandex/tankerapp/fintech/models/results/FintechError$Kind;", "", "<init>", "(Ljava/lang/String;I)V", "Unknown", "InternalError", "Authorization", "Network", "BindingInvalidArgument", "TooManyCards", "ApplePay", "Fail3DS", "ExpiredCard", "InvalidProcessingRequest", "LimitExceeded", "NotEnoughFunds", "PaymentAuthorizationReject", "PaymentCancelled", "PaymentGatewayTechnicalError", "PaymentTimeout", "PromocodeAlreadyUsed", "RestrictedCard", "TransactionNotPermitted", "UserCancelled", "NoEmail", "CreditRejected", "SbpBanksNotFound", "PaymentMethodNotFound", "fintech_sdk_interface_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Kind {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Kind[] $VALUES;

        @ysq0("unknown")
        public static final Kind Unknown = new Kind("Unknown", 0);

        @ysq0("internalError")
        public static final Kind InternalError = new Kind("InternalError", 1);

        @ysq0("authorization")
        public static final Kind Authorization = new Kind("Authorization", 2);

        @ysq0("network")
        public static final Kind Network = new Kind("Network", 3);

        @ysq0("bindingInvalidArgument")
        public static final Kind BindingInvalidArgument = new Kind("BindingInvalidArgument", 4);

        @ysq0("tooManyCards")
        public static final Kind TooManyCards = new Kind("TooManyCards", 5);

        @ysq0("applePay")
        public static final Kind ApplePay = new Kind("ApplePay", 6);

        @ysq0("fail3DS")
        public static final Kind Fail3DS = new Kind("Fail3DS", 7);

        @ysq0("expiredCard")
        public static final Kind ExpiredCard = new Kind("ExpiredCard", 8);

        @ysq0("invalidProcessingRequest")
        public static final Kind InvalidProcessingRequest = new Kind("InvalidProcessingRequest", 9);

        @ysq0("limitExceeded")
        public static final Kind LimitExceeded = new Kind("LimitExceeded", 10);

        @ysq0("notEnoughFunds")
        public static final Kind NotEnoughFunds = new Kind("NotEnoughFunds", 11);

        @ysq0("paymentAuthorizationReject")
        public static final Kind PaymentAuthorizationReject = new Kind("PaymentAuthorizationReject", 12);

        @ysq0("paymentCancelled")
        public static final Kind PaymentCancelled = new Kind("PaymentCancelled", 13);

        @ysq0("paymentGatewayTechnicalError")
        public static final Kind PaymentGatewayTechnicalError = new Kind("PaymentGatewayTechnicalError", 14);

        @ysq0("paymentTimeout")
        public static final Kind PaymentTimeout = new Kind("PaymentTimeout", 15);

        @ysq0("promocodeAlreadyUsed")
        public static final Kind PromocodeAlreadyUsed = new Kind("PromocodeAlreadyUsed", 16);

        @ysq0("restrictedCard")
        public static final Kind RestrictedCard = new Kind("RestrictedCard", 17);

        @ysq0("transactionNotPermitted")
        public static final Kind TransactionNotPermitted = new Kind("TransactionNotPermitted", 18);

        @ysq0("userCancelled")
        public static final Kind UserCancelled = new Kind("UserCancelled", 19);

        @ysq0("noEmail")
        public static final Kind NoEmail = new Kind("NoEmail", 20);

        @ysq0("creditRejected")
        public static final Kind CreditRejected = new Kind("CreditRejected", 21);

        @ysq0("sbpBanksNotFound")
        public static final Kind SbpBanksNotFound = new Kind("SbpBanksNotFound", 22);

        @ysq0("paymentMethodNotFound")
        public static final Kind PaymentMethodNotFound = new Kind("PaymentMethodNotFound", 23);

        private static final /* synthetic */ Kind[] $values() {
            return new Kind[]{Unknown, InternalError, Authorization, Network, BindingInvalidArgument, TooManyCards, ApplePay, Fail3DS, ExpiredCard, InvalidProcessingRequest, LimitExceeded, NotEnoughFunds, PaymentAuthorizationReject, PaymentCancelled, PaymentGatewayTechnicalError, PaymentTimeout, PromocodeAlreadyUsed, RestrictedCard, TransactionNotPermitted, UserCancelled, NoEmail, CreditRejected, SbpBanksNotFound, PaymentMethodNotFound};
        }

        static {
            Kind[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private Kind(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static Kind valueOf(String str) {
            return (Kind) Enum.valueOf(Kind.class, str);
        }

        public static Kind[] values() {
            return (Kind[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/yandex/tankerapp/fintech/models/results/FintechError$Trigger;", "", "<init>", "(Ljava/lang/String;I)V", "Internal", "MobileBackend", "Diehard", "Nspk", "External", "fintech_sdk_interface_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Trigger {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Trigger[] $VALUES;

        @ysq0("internal")
        public static final Trigger Internal = new Trigger("Internal", 0);

        @ysq0("mobileBackend")
        public static final Trigger MobileBackend = new Trigger("MobileBackend", 1);

        @ysq0("diehard")
        public static final Trigger Diehard = new Trigger("Diehard", 2);

        @ysq0("nspk")
        public static final Trigger Nspk = new Trigger("Nspk", 3);

        @ysq0("external")
        public static final Trigger External = new Trigger("External", 4);

        private static final /* synthetic */ Trigger[] $values() {
            return new Trigger[]{Internal, MobileBackend, Diehard, Nspk, External};
        }

        static {
            Trigger[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private Trigger(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static Trigger valueOf(String str) {
            return (Trigger) Enum.valueOf(Trigger.class, str);
        }

        public static Trigger[] values() {
            return (Trigger[]) $VALUES.clone();
        }
    }

    public FintechError(Kind kind, Trigger trigger, Integer num, String str, String str2, String str3) {
        this.kind = kind;
        this.trigger = trigger;
        this.code = num;
        this.status = str;
        this.message = str2;
        this.localizedDescription = str3;
    }

    public static /* synthetic */ FintechError copy$default(FintechError fintechError, Kind kind, Trigger trigger, Integer num, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            kind = fintechError.kind;
        }
        if ((i & 2) != 0) {
            trigger = fintechError.trigger;
        }
        if ((i & 4) != 0) {
            num = fintechError.code;
        }
        if ((i & 8) != 0) {
            str = fintechError.status;
        }
        if ((i & 16) != 0) {
            str2 = fintechError.message;
        }
        if ((i & 32) != 0) {
            str3 = fintechError.localizedDescription;
        }
        String str4 = str2;
        String str5 = str3;
        return fintechError.copy(kind, trigger, num, str, str4, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final Kind getKind() {
        return this.kind;
    }

    /* renamed from: component2, reason: from getter */
    public final Trigger getTrigger() {
        return this.trigger;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getCode() {
        return this.code;
    }

    /* renamed from: component4, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* renamed from: component5, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component6, reason: from getter */
    public final String getLocalizedDescription() {
        return this.localizedDescription;
    }

    public final FintechError copy(Kind kind, Trigger trigger, Integer code, String status, String message, String localizedDescription) {
        return new FintechError(kind, trigger, code, status, message, localizedDescription);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FintechError)) {
            return false;
        }
        FintechError fintechError = (FintechError) other;
        return this.kind == fintechError.kind && this.trigger == fintechError.trigger && jl40.l(this.code, fintechError.code) && jl40.l(this.status, fintechError.status) && jl40.l(this.message, fintechError.message) && jl40.l(this.localizedDescription, fintechError.localizedDescription);
    }

    public final Integer getCode() {
        return this.code;
    }

    public final Kind getKind() {
        return this.kind;
    }

    public final String getLocalizedDescription() {
        return this.localizedDescription;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getStatus() {
        return this.status;
    }

    public final Trigger getTrigger() {
        return this.trigger;
    }

    public int hashCode() {
        Kind kind = this.kind;
        int hashCode = (kind == null ? 0 : kind.hashCode()) * 31;
        Trigger trigger = this.trigger;
        int hashCode2 = (hashCode + (trigger == null ? 0 : trigger.hashCode())) * 31;
        Integer num = this.code;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.status;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.message;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.localizedDescription;
        return hashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        Kind kind = this.kind;
        Trigger trigger = this.trigger;
        Integer num = this.code;
        String str = this.status;
        String str2 = this.message;
        String str3 = this.localizedDescription;
        StringBuilder sb = new StringBuilder("FintechError(kind=");
        sb.append(kind);
        sb.append(", trigger=");
        sb.append(trigger);
        sb.append(", code=");
        tse0.w(num, ", status=", str, ", message=", sb);
        return g8e.r(sb, str2, ", localizedDescription=", str3, Extension.C_BRAKE);
    }
}
