package ru.yandex.tankerapp.fintech.models.results;

import defpackage.jl40;
import defpackage.ysq0;
import java.io.Serializable;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/yandex/tankerapp/fintech/models/results/BindCardResult;", "Ljava/io/Serializable;", "bindingId", "", ACSPConstants.STATUS, "Lru/yandex/tankerapp/fintech/models/results/FintechStatusResult;", "error", "Lru/yandex/tankerapp/fintech/models/results/FintechError;", "<init>", "(Ljava/lang/String;Lru/yandex/tankerapp/fintech/models/results/FintechStatusResult;Lru/yandex/tankerapp/fintech/models/results/FintechError;)V", "getBindingId", "()Ljava/lang/String;", "getStatus", "()Lru/yandex/tankerapp/fintech/models/results/FintechStatusResult;", "getError", "()Lru/yandex/tankerapp/fintech/models/results/FintechError;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "fintech_sdk_interface_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class BindCardResult implements Serializable {

    @ysq0("bindingId")
    private final String bindingId;

    @ysq0("error")
    private final FintechError error;

    @ysq0(ACSPConstants.STATUS)
    private final FintechStatusResult status;

    public BindCardResult(String str, FintechStatusResult fintechStatusResult, FintechError fintechError) {
        this.bindingId = str;
        this.status = fintechStatusResult;
        this.error = fintechError;
    }

    public static /* synthetic */ BindCardResult copy$default(BindCardResult bindCardResult, String str, FintechStatusResult fintechStatusResult, FintechError fintechError, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bindCardResult.bindingId;
        }
        if ((i & 2) != 0) {
            fintechStatusResult = bindCardResult.status;
        }
        if ((i & 4) != 0) {
            fintechError = bindCardResult.error;
        }
        return bindCardResult.copy(str, fintechStatusResult, fintechError);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBindingId() {
        return this.bindingId;
    }

    /* renamed from: component2, reason: from getter */
    public final FintechStatusResult getStatus() {
        return this.status;
    }

    /* renamed from: component3, reason: from getter */
    public final FintechError getError() {
        return this.error;
    }

    public final BindCardResult copy(String bindingId, FintechStatusResult status, FintechError error) {
        return new BindCardResult(bindingId, status, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BindCardResult)) {
            return false;
        }
        BindCardResult bindCardResult = (BindCardResult) other;
        return jl40.l(this.bindingId, bindCardResult.bindingId) && this.status == bindCardResult.status && jl40.l(this.error, bindCardResult.error);
    }

    public final String getBindingId() {
        return this.bindingId;
    }

    public final FintechError getError() {
        return this.error;
    }

    public final FintechStatusResult getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.bindingId;
        int hashCode = (this.status.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        FintechError fintechError = this.error;
        return hashCode + (fintechError != null ? fintechError.hashCode() : 0);
    }

    public String toString() {
        return "BindCardResult(bindingId=" + this.bindingId + ", status=" + this.status + ", error=" + this.error + Extension.C_BRAKE;
    }
}
