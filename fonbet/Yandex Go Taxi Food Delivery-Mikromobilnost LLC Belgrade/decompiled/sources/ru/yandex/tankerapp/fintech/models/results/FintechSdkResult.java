package ru.yandex.tankerapp.fintech.models.results;

import defpackage.jl40;
import defpackage.ysq0;
import java.io.Serializable;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/yandex/tankerapp/fintech/models/results/FintechSdkResult;", "Ljava/io/Serializable;", ACSPConstants.STATUS, "Lru/yandex/tankerapp/fintech/models/results/FintechStatusResult;", "error", "Lru/yandex/tankerapp/fintech/models/results/FintechError;", "<init>", "(Lru/yandex/tankerapp/fintech/models/results/FintechStatusResult;Lru/yandex/tankerapp/fintech/models/results/FintechError;)V", "getStatus", "()Lru/yandex/tankerapp/fintech/models/results/FintechStatusResult;", "getError", "()Lru/yandex/tankerapp/fintech/models/results/FintechError;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "fintech_sdk_interface_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FintechSdkResult implements Serializable {

    @ysq0("error")
    private final FintechError error;

    @ysq0(ACSPConstants.STATUS)
    private final FintechStatusResult status;

    public FintechSdkResult(FintechStatusResult fintechStatusResult, FintechError fintechError) {
        this.status = fintechStatusResult;
        this.error = fintechError;
    }

    public static /* synthetic */ FintechSdkResult copy$default(FintechSdkResult fintechSdkResult, FintechStatusResult fintechStatusResult, FintechError fintechError, int i, Object obj) {
        if ((i & 1) != 0) {
            fintechStatusResult = fintechSdkResult.status;
        }
        if ((i & 2) != 0) {
            fintechError = fintechSdkResult.error;
        }
        return fintechSdkResult.copy(fintechStatusResult, fintechError);
    }

    /* renamed from: component1, reason: from getter */
    public final FintechStatusResult getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final FintechError getError() {
        return this.error;
    }

    public final FintechSdkResult copy(FintechStatusResult status, FintechError error) {
        return new FintechSdkResult(status, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FintechSdkResult)) {
            return false;
        }
        FintechSdkResult fintechSdkResult = (FintechSdkResult) other;
        return this.status == fintechSdkResult.status && jl40.l(this.error, fintechSdkResult.error);
    }

    public final FintechError getError() {
        return this.error;
    }

    public final FintechStatusResult getStatus() {
        return this.status;
    }

    public int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        FintechError fintechError = this.error;
        return hashCode + (fintechError == null ? 0 : fintechError.hashCode());
    }

    public String toString() {
        return "FintechSdkResult(status=" + this.status + ", error=" + this.error + Extension.C_BRAKE;
    }
}
