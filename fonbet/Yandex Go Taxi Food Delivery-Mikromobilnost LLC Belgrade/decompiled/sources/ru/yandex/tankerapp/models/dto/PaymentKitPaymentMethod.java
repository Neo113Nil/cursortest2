package ru.yandex.tankerapp.models.dto;

import defpackage.jl40;
import defpackage.k4o;
import defpackage.ysq0;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\u0015\u0016B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010¨\u0006\u0017"}, d2 = {"Lru/yandex/tankerapp/models/dto/PaymentKitPaymentMethod;", "Ljava/io/Serializable;", "Lru/yandex/tankerapp/models/dto/PaymentKitPaymentMethod$MethodType;", "type", "", "id", "Lru/yandex/tankerapp/models/dto/PaymentKitPaymentMethod$System;", "system", "account", "<init>", "(Lru/yandex/tankerapp/models/dto/PaymentKitPaymentMethod$MethodType;Ljava/lang/String;Lru/yandex/tankerapp/models/dto/PaymentKitPaymentMethod$System;Ljava/lang/String;)V", "Lru/yandex/tankerapp/models/dto/PaymentKitPaymentMethod$MethodType;", "getType", "()Lru/yandex/tankerapp/models/dto/PaymentKitPaymentMethod$MethodType;", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lru/yandex/tankerapp/models/dto/PaymentKitPaymentMethod$System;", "getSystem", "()Lru/yandex/tankerapp/models/dto/PaymentKitPaymentMethod$System;", "getAccount", "MethodType", "System", "car_tech_payment_sdk_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PaymentKitPaymentMethod implements Serializable {

    @ysq0("account")
    private final String account;

    @ysq0("id")
    private final String id;

    @ysq0("system")
    private final System system;

    @ysq0("type")
    private final MethodType type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000e\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lru/yandex/tankerapp/models/dto/PaymentKitPaymentMethod$MethodType;", "", "<init>", "(Ljava/lang/String;I)V", "Cash", "Card", "GooglePay", "NewCard", "NewSbpToken", "Sbp", "SbpToken", "TinkoffCredit", "YandexBank", "Split", "ChallengePollingMethod", "car_tech_payment_sdk_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MethodType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ MethodType[] $VALUES;

        @ysq0("card")
        public static final MethodType Card;

        @ysq0("cash")
        public static final MethodType Cash;

        @ysq0("challengePollingMethod")
        public static final MethodType ChallengePollingMethod;

        @ysq0("googlePay")
        public static final MethodType GooglePay;

        @ysq0("newCard")
        public static final MethodType NewCard;

        @ysq0("newSbpToken")
        public static final MethodType NewSbpToken;

        @ysq0("sbp")
        public static final MethodType Sbp;

        @ysq0("sbpToken")
        public static final MethodType SbpToken;

        @ysq0("split")
        public static final MethodType Split;

        @ysq0("tinkoffCredit")
        public static final MethodType TinkoffCredit;

        @ysq0("yandexBank")
        public static final MethodType YandexBank;

        static {
            MethodType methodType = new MethodType("Cash", 0);
            Cash = methodType;
            MethodType methodType2 = new MethodType("Card", 1);
            Card = methodType2;
            MethodType methodType3 = new MethodType("GooglePay", 2);
            GooglePay = methodType3;
            MethodType methodType4 = new MethodType("NewCard", 3);
            NewCard = methodType4;
            MethodType methodType5 = new MethodType("NewSbpToken", 4);
            NewSbpToken = methodType5;
            MethodType methodType6 = new MethodType("Sbp", 5);
            Sbp = methodType6;
            MethodType methodType7 = new MethodType("SbpToken", 6);
            SbpToken = methodType7;
            MethodType methodType8 = new MethodType("TinkoffCredit", 7);
            TinkoffCredit = methodType8;
            MethodType methodType9 = new MethodType("YandexBank", 8);
            YandexBank = methodType9;
            MethodType methodType10 = new MethodType("Split", 9);
            Split = methodType10;
            MethodType methodType11 = new MethodType("ChallengePollingMethod", 10);
            ChallengePollingMethod = methodType11;
            MethodType[] methodTypeArr = {methodType, methodType2, methodType3, methodType4, methodType5, methodType6, methodType7, methodType8, methodType9, methodType10, methodType11};
            $VALUES = methodTypeArr;
            $ENTRIES = a.a(methodTypeArr);
        }

        private MethodType(String str, int i) {
        }

        public static MethodType valueOf(String str) {
            return (MethodType) Enum.valueOf(MethodType.class, str);
        }

        public static MethodType[] values() {
            return (MethodType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0010\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lru/yandex/tankerapp/models/dto/PaymentKitPaymentMethod$System;", "", "<init>", "(Ljava/lang/String;I)V", "AmericanExpress", "DinersClub", "DiscoverCard", "JCB", "HUMO", "Maestro", "MasterCard", "MIR", "UnionPay", "Uzcard", "Visa", "VisaElectron", "Unknown", "car_tech_payment_sdk_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class System {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ System[] $VALUES;

        @ysq0("americanExpress")
        public static final System AmericanExpress;

        @ysq0("dinersClub")
        public static final System DinersClub;

        @ysq0("discoverCard")
        public static final System DiscoverCard;

        @ysq0("humo")
        public static final System HUMO;

        @ysq0("jcb")
        public static final System JCB;

        @ysq0("mir")
        public static final System MIR;

        @ysq0("maestro")
        public static final System Maestro;

        @ysq0("masterCard")
        public static final System MasterCard;

        @ysq0("unionPay")
        public static final System UnionPay;

        @ysq0("unknown")
        public static final System Unknown;

        @ysq0("uzcard")
        public static final System Uzcard;

        @ysq0("visa")
        public static final System Visa;

        @ysq0("visaElectron")
        public static final System VisaElectron;

        static {
            System system = new System("AmericanExpress", 0);
            AmericanExpress = system;
            System system2 = new System("DinersClub", 1);
            DinersClub = system2;
            System system3 = new System("DiscoverCard", 2);
            DiscoverCard = system3;
            System system4 = new System("JCB", 3);
            JCB = system4;
            System system5 = new System("HUMO", 4);
            HUMO = system5;
            System system6 = new System("Maestro", 5);
            Maestro = system6;
            System system7 = new System("MasterCard", 6);
            MasterCard = system7;
            System system8 = new System("MIR", 7);
            MIR = system8;
            System system9 = new System("UnionPay", 8);
            UnionPay = system9;
            System system10 = new System("Uzcard", 9);
            Uzcard = system10;
            System system11 = new System("Visa", 10);
            Visa = system11;
            System system12 = new System("VisaElectron", 11);
            VisaElectron = system12;
            System system13 = new System("Unknown", 12);
            Unknown = system13;
            System[] systemArr = {system, system2, system3, system4, system5, system6, system7, system8, system9, system10, system11, system12, system13};
            $VALUES = systemArr;
            $ENTRIES = a.a(systemArr);
        }

        private System(String str, int i) {
        }

        public static System valueOf(String str) {
            return (System) Enum.valueOf(System.class, str);
        }

        public static System[] values() {
            return (System[]) $VALUES.clone();
        }
    }

    public PaymentKitPaymentMethod(MethodType methodType, String str, System system, String str2) {
        this.type = methodType;
        this.id = str;
        this.system = system;
        this.account = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentKitPaymentMethod)) {
            return false;
        }
        PaymentKitPaymentMethod paymentKitPaymentMethod = (PaymentKitPaymentMethod) obj;
        return this.type == paymentKitPaymentMethod.type && jl40.l(this.id, paymentKitPaymentMethod.id) && this.system == paymentKitPaymentMethod.system && jl40.l(this.account, paymentKitPaymentMethod.account);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        String str = this.id;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        System system = this.system;
        int hashCode3 = (hashCode2 + (system == null ? 0 : system.hashCode())) * 31;
        String str2 = this.account;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "PaymentKitPaymentMethod(type=" + this.type + ", id=" + this.id + ", system=" + this.system + ", account=" + this.account + Extension.C_BRAKE;
    }
}
