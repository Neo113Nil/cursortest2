package ru.yandex.tankerapp.yb.models;

import defpackage.jl40;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/yandex/tankerapp/yb/models/YbStateModel;", "Ljava/io/Serializable;", ClidProvider.STATE, "Lru/yandex/tankerapp/yb/models/YbState;", "balance", "Lru/yandex/tankerapp/yb/models/YbMoney;", "<init>", "(Lru/yandex/tankerapp/yb/models/YbState;Lru/yandex/tankerapp/yb/models/YbMoney;)V", "getState", "()Lru/yandex/tankerapp/yb/models/YbState;", "getBalance", "()Lru/yandex/tankerapp/yb/models/YbMoney;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "yb_sdk_adapter_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class YbStateModel implements Serializable {
    private final YbMoney balance;
    private final YbState state;

    public /* synthetic */ YbStateModel(YbState ybState, YbMoney ybMoney, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(ybState, (i & 2) != 0 ? null : ybMoney);
    }

    public static /* synthetic */ YbStateModel copy$default(YbStateModel ybStateModel, YbState ybState, YbMoney ybMoney, int i, Object obj) {
        if ((i & 1) != 0) {
            ybState = ybStateModel.state;
        }
        if ((i & 2) != 0) {
            ybMoney = ybStateModel.balance;
        }
        return ybStateModel.copy(ybState, ybMoney);
    }

    /* renamed from: component1, reason: from getter */
    public final YbState getState() {
        return this.state;
    }

    /* renamed from: component2, reason: from getter */
    public final YbMoney getBalance() {
        return this.balance;
    }

    public final YbStateModel copy(YbState state, YbMoney balance) {
        return new YbStateModel(state, balance);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof YbStateModel)) {
            return false;
        }
        YbStateModel ybStateModel = (YbStateModel) other;
        return this.state == ybStateModel.state && jl40.l(this.balance, ybStateModel.balance);
    }

    public final YbMoney getBalance() {
        return this.balance;
    }

    public final YbState getState() {
        return this.state;
    }

    public int hashCode() {
        int hashCode = this.state.hashCode() * 31;
        YbMoney ybMoney = this.balance;
        return hashCode + (ybMoney == null ? 0 : ybMoney.hashCode());
    }

    public String toString() {
        return "YbStateModel(state=" + this.state + ", balance=" + this.balance + Extension.C_BRAKE;
    }

    public YbStateModel(YbState ybState, YbMoney ybMoney) {
        this.state = ybState;
        this.balance = ybMoney;
    }
}
