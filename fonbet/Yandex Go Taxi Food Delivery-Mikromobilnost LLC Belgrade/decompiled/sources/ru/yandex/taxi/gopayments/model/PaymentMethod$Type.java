package ru.yandex.taxi.gopayments.model;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.b4a0;
import defpackage.e4a0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.ks90;
import java.util.Locale;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u001e\b\u0087\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&¨\u0006'"}, d2 = {"ru/yandex/taxi/gopayments/model/PaymentMethod$Type", "Le4a0;", "", "Lru/yandex/taxi/gopayments/model/PaymentMethod$Type;", "", "id", CA20Status.STATUS_USER_I, "getId", "()I", "", AuthSdkActivity.RESPONSE_TYPE_CODE, "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Companion", "b4a0", "CASH", "CARD", "CORP", "GOOGLE_PAY", "PERSONAL_WALLET", "SHARED", "YB_WALLET", "CARGO_CORP", "SBP_TOKEN", "YANGO_PAY", "CASH_LIKE", "MBANK_ACCOUNT", "TRANSPORT_CARD", "BIRBONUS_WALLET", "YAPE_TOKEN", "TRANSPORT_EXTERNAL", "NEQUI_TOKEN", "SBP_BIND_TOKEN", "KASPI", "CLICK_WALLET", "EASYPAISA_WALLET", "JAZZCASH_WALLET", "FASTSHIFT_ACCOUNT", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class PaymentMethod$Type implements e4a0 {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PaymentMethod$Type[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final PaymentMethod$Type BIRBONUS_WALLET;
    public static final PaymentMethod$Type CARD;
    public static final PaymentMethod$Type CARGO_CORP;
    public static final PaymentMethod$Type CASH;
    public static final PaymentMethod$Type CASH_LIKE;
    public static final PaymentMethod$Type CLICK_WALLET;
    public static final PaymentMethod$Type CORP;
    public static final b4a0 Companion;
    public static final PaymentMethod$Type EASYPAISA_WALLET;
    public static final PaymentMethod$Type FASTSHIFT_ACCOUNT;
    public static final PaymentMethod$Type GOOGLE_PAY;
    public static final PaymentMethod$Type JAZZCASH_WALLET;
    public static final PaymentMethod$Type KASPI;
    public static final PaymentMethod$Type MBANK_ACCOUNT;
    public static final PaymentMethod$Type NEQUI_TOKEN;
    public static final PaymentMethod$Type PERSONAL_WALLET;
    public static final PaymentMethod$Type SBP_BIND_TOKEN;
    public static final PaymentMethod$Type SBP_TOKEN;
    public static final PaymentMethod$Type SHARED;
    public static final PaymentMethod$Type TRANSPORT_CARD;
    public static final PaymentMethod$Type TRANSPORT_EXTERNAL;
    public static final PaymentMethod$Type YANGO_PAY;
    public static final PaymentMethod$Type YAPE_TOKEN;
    public static final PaymentMethod$Type YB_WALLET;
    private final String code;
    private final int id;

    static {
        PaymentMethod$Type paymentMethod$Type = new PaymentMethod$Type("CASH", 0, 0, "cash");
        CASH = paymentMethod$Type;
        PaymentMethod$Type paymentMethod$Type2 = new PaymentMethod$Type("CARD", 1, 1, "card");
        CARD = paymentMethod$Type2;
        PaymentMethod$Type paymentMethod$Type3 = new PaymentMethod$Type("CORP", 2, 2, "corp");
        CORP = paymentMethod$Type3;
        PaymentMethod$Type paymentMethod$Type4 = new PaymentMethod$Type("GOOGLE_PAY", 3, 3, "googlepay");
        GOOGLE_PAY = paymentMethod$Type4;
        PaymentMethod$Type paymentMethod$Type5 = new PaymentMethod$Type("PERSONAL_WALLET", 4, 4, "personal_wallet");
        PERSONAL_WALLET = paymentMethod$Type5;
        PaymentMethod$Type paymentMethod$Type6 = new PaymentMethod$Type("SHARED", 5, 5, "coop_account");
        SHARED = paymentMethod$Type6;
        PaymentMethod$Type paymentMethod$Type7 = new PaymentMethod$Type("YB_WALLET", 6, 6, "yandex_card");
        YB_WALLET = paymentMethod$Type7;
        PaymentMethod$Type paymentMethod$Type8 = new PaymentMethod$Type("CARGO_CORP", 7, 7, "cargocorp");
        CARGO_CORP = paymentMethod$Type8;
        PaymentMethod$Type paymentMethod$Type9 = new PaymentMethod$Type("SBP_TOKEN", 8, 9, "sbp_token");
        SBP_TOKEN = paymentMethod$Type9;
        PaymentMethod$Type paymentMethod$Type10 = new PaymentMethod$Type("YANGO_PAY", 9, 10, "yango_pay");
        YANGO_PAY = paymentMethod$Type10;
        PaymentMethod$Type paymentMethod$Type11 = new PaymentMethod$Type("CASH_LIKE", 10, 11, "cash_like");
        CASH_LIKE = paymentMethod$Type11;
        PaymentMethod$Type paymentMethod$Type12 = new PaymentMethod$Type("MBANK_ACCOUNT", 11, 12, "mbank_account");
        MBANK_ACCOUNT = paymentMethod$Type12;
        PaymentMethod$Type paymentMethod$Type13 = new PaymentMethod$Type("TRANSPORT_CARD", 12, 13, "transport_card");
        TRANSPORT_CARD = paymentMethod$Type13;
        PaymentMethod$Type paymentMethod$Type14 = new PaymentMethod$Type("BIRBONUS_WALLET", 13, 14, "birbonus_wallet");
        BIRBONUS_WALLET = paymentMethod$Type14;
        PaymentMethod$Type paymentMethod$Type15 = new PaymentMethod$Type("YAPE_TOKEN", 14, 15, "yape_token");
        YAPE_TOKEN = paymentMethod$Type15;
        PaymentMethod$Type paymentMethod$Type16 = new PaymentMethod$Type("TRANSPORT_EXTERNAL", 15, 16, "transport_external");
        TRANSPORT_EXTERNAL = paymentMethod$Type16;
        PaymentMethod$Type paymentMethod$Type17 = new PaymentMethod$Type("NEQUI_TOKEN", 16, 17, "nequi_token");
        NEQUI_TOKEN = paymentMethod$Type17;
        PaymentMethod$Type paymentMethod$Type18 = new PaymentMethod$Type("SBP_BIND_TOKEN", 17, 18, "sbp");
        SBP_BIND_TOKEN = paymentMethod$Type18;
        PaymentMethod$Type paymentMethod$Type19 = new PaymentMethod$Type("KASPI", 18, 19, "kaspi");
        KASPI = paymentMethod$Type19;
        PaymentMethod$Type paymentMethod$Type20 = new PaymentMethod$Type("CLICK_WALLET", 19, 20, "click_wallet");
        CLICK_WALLET = paymentMethod$Type20;
        PaymentMethod$Type paymentMethod$Type21 = new PaymentMethod$Type("EASYPAISA_WALLET", 20, 21, "easypaisa_wallet");
        EASYPAISA_WALLET = paymentMethod$Type21;
        PaymentMethod$Type paymentMethod$Type22 = new PaymentMethod$Type("JAZZCASH_WALLET", 21, 22, "jazzcash_wallet");
        JAZZCASH_WALLET = paymentMethod$Type22;
        PaymentMethod$Type paymentMethod$Type23 = new PaymentMethod$Type("FASTSHIFT_ACCOUNT", 22, 23, "fastshift_account");
        FASTSHIFT_ACCOUNT = paymentMethod$Type23;
        PaymentMethod$Type[] paymentMethod$TypeArr = {paymentMethod$Type, paymentMethod$Type2, paymentMethod$Type3, paymentMethod$Type4, paymentMethod$Type5, paymentMethod$Type6, paymentMethod$Type7, paymentMethod$Type8, paymentMethod$Type9, paymentMethod$Type10, paymentMethod$Type11, paymentMethod$Type12, paymentMethod$Type13, paymentMethod$Type14, paymentMethod$Type15, paymentMethod$Type16, paymentMethod$Type17, paymentMethod$Type18, paymentMethod$Type19, paymentMethod$Type20, paymentMethod$Type21, paymentMethod$Type22, paymentMethod$Type23};
        $VALUES = paymentMethod$TypeArr;
        $ENTRIES = a.a(paymentMethod$TypeArr);
        Companion = new b4a0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ks90(11));
    }

    public PaymentMethod$Type(String str, int i, int i2, String str2) {
        this.id = i2;
        this.code = str2;
    }

    public static k4o f() {
        return $ENTRIES;
    }

    public static PaymentMethod$Type valueOf(String str) {
        return (PaymentMethod$Type) Enum.valueOf(PaymentMethod$Type.class, str);
    }

    public static PaymentMethod$Type[] values() {
        return (PaymentMethod$Type[]) $VALUES.clone();
    }

    @Override // defpackage.e4a0
    public final PaymentMethod$Type a() {
        return this;
    }

    /* renamed from: c, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @Override // defpackage.e4a0
    public final int getId() {
        return this.id;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return super.toString().toLowerCase(Locale.US);
    }
}
