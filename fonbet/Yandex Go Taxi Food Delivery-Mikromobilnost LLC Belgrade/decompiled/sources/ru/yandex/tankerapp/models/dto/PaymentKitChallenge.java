package ru.yandex.tankerapp.models.dto;

import defpackage.jl40;
import defpackage.oyr;
import defpackage.ysq0;
import java.io.Serializable;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/yandex/tankerapp/models/dto/PaymentKitChallenge;", "Ljava/io/Serializable;", "", "intentId", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "car_tech_payment_sdk_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PaymentKitChallenge implements Serializable {

    @ysq0("intentId")
    private final String intentId;

    public PaymentKitChallenge(String str) {
        this.intentId = str;
    }

    /* renamed from: a, reason: from getter */
    public final String getIntentId() {
        return this.intentId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PaymentKitChallenge) && jl40.l(this.intentId, ((PaymentKitChallenge) obj).intentId);
    }

    public final int hashCode() {
        return this.intentId.hashCode();
    }

    public final String toString() {
        return oyr.p("PaymentKitChallenge(intentId=", this.intentId, Extension.C_BRAKE);
    }
}
