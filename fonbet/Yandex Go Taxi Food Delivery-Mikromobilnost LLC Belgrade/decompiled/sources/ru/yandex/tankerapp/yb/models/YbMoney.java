package ru.yandex.tankerapp.yb.models;

import defpackage.jl40;
import defpackage.unr0;
import java.io.Serializable;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/yandex/tankerapp/yb/models/YbMoney;", "Ljava/io/Serializable;", "amount", "", "currency", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "getCurrency", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "yb_sdk_adapter_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class YbMoney implements Serializable {
    private final String amount;
    private final String currency;

    public YbMoney(String str, String str2) {
        this.amount = str;
        this.currency = str2;
    }

    public static /* synthetic */ YbMoney copy$default(YbMoney ybMoney, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ybMoney.amount;
        }
        if ((i & 2) != 0) {
            str2 = ybMoney.currency;
        }
        return ybMoney.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    public final YbMoney copy(String amount, String currency) {
        return new YbMoney(amount, currency);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof YbMoney)) {
            return false;
        }
        YbMoney ybMoney = (YbMoney) other;
        return jl40.l(this.amount, ybMoney.amount) && jl40.l(this.currency, ybMoney.currency);
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public int hashCode() {
        return this.currency.hashCode() + (this.amount.hashCode() * 31);
    }

    public String toString() {
        return unr0.p("YbMoney(amount=", this.amount, ", currency=", this.currency, Extension.C_BRAKE);
    }
}
