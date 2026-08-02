package ru.yandex.tankerapp.fintech.models.results;

import defpackage.jl40;
import defpackage.ysq0;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.tankerapp.fintech.models.dto.FintechPaymentMethod;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lru/yandex/tankerapp/fintech/models/results/SelectMethodResult;", "Ljava/io/Serializable;", ACSPConstants.STATUS, "Lru/yandex/tankerapp/fintech/models/results/FintechStatusResult;", "error", "Lru/yandex/tankerapp/fintech/models/results/FintechError;", "paymentMethod", "Lru/yandex/tankerapp/fintech/models/dto/FintechPaymentMethod;", "<init>", "(Lru/yandex/tankerapp/fintech/models/results/FintechStatusResult;Lru/yandex/tankerapp/fintech/models/results/FintechError;Lru/yandex/tankerapp/fintech/models/dto/FintechPaymentMethod;)V", "getStatus", "()Lru/yandex/tankerapp/fintech/models/results/FintechStatusResult;", "getError", "()Lru/yandex/tankerapp/fintech/models/results/FintechError;", "getPaymentMethod", "()Lru/yandex/tankerapp/fintech/models/dto/FintechPaymentMethod;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "fintech_sdk_interface_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SelectMethodResult implements Serializable {

    @ysq0("error")
    private final FintechError error;

    @ysq0("paymentMethod")
    private final FintechPaymentMethod paymentMethod;

    @ysq0(ACSPConstants.STATUS)
    private final FintechStatusResult status;

    public SelectMethodResult(FintechStatusResult fintechStatusResult, FintechError fintechError, FintechPaymentMethod fintechPaymentMethod) {
        this.status = fintechStatusResult;
        this.error = fintechError;
        this.paymentMethod = fintechPaymentMethod;
    }

    public static /* synthetic */ SelectMethodResult copy$default(SelectMethodResult selectMethodResult, FintechStatusResult fintechStatusResult, FintechError fintechError, FintechPaymentMethod fintechPaymentMethod, int i, Object obj) {
        if ((i & 1) != 0) {
            fintechStatusResult = selectMethodResult.status;
        }
        if ((i & 2) != 0) {
            fintechError = selectMethodResult.error;
        }
        if ((i & 4) != 0) {
            fintechPaymentMethod = selectMethodResult.paymentMethod;
        }
        return selectMethodResult.copy(fintechStatusResult, fintechError, fintechPaymentMethod);
    }

    /* renamed from: component1, reason: from getter */
    public final FintechStatusResult getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final FintechError getError() {
        return this.error;
    }

    /* renamed from: component3, reason: from getter */
    public final FintechPaymentMethod getPaymentMethod() {
        return this.paymentMethod;
    }

    public final SelectMethodResult copy(FintechStatusResult status, FintechError error, FintechPaymentMethod paymentMethod) {
        return new SelectMethodResult(status, error, paymentMethod);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectMethodResult)) {
            return false;
        }
        SelectMethodResult selectMethodResult = (SelectMethodResult) other;
        return this.status == selectMethodResult.status && jl40.l(this.error, selectMethodResult.error) && jl40.l(this.paymentMethod, selectMethodResult.paymentMethod);
    }

    public final FintechError getError() {
        return this.error;
    }

    public final FintechPaymentMethod getPaymentMethod() {
        return this.paymentMethod;
    }

    public final FintechStatusResult getStatus() {
        return this.status;
    }

    public int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        FintechError fintechError = this.error;
        int hashCode2 = (hashCode + (fintechError == null ? 0 : fintechError.hashCode())) * 31;
        FintechPaymentMethod fintechPaymentMethod = this.paymentMethod;
        return hashCode2 + (fintechPaymentMethod != null ? fintechPaymentMethod.hashCode() : 0);
    }

    public String toString() {
        return "SelectMethodResult(status=" + this.status + ", error=" + this.error + ", paymentMethod=" + this.paymentMethod + Extension.C_BRAKE;
    }

    public /* synthetic */ SelectMethodResult(FintechStatusResult fintechStatusResult, FintechError fintechError, FintechPaymentMethod fintechPaymentMethod, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fintechStatusResult, (i & 2) != 0 ? null : fintechError, fintechPaymentMethod);
    }
}
