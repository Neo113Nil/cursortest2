package ru.yandex.tankerapp.fintech.models.results;

import android.os.Parcelable;
import defpackage.jl40;
import defpackage.ysq0;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.Serializable;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B#\u0012\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0012\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003J6\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00018\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u001a\u0010\u0004\u001a\u0004\u0018\u00018\u00008\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, d2 = {"Lru/yandex/tankerapp/fintech/models/results/FintechDataResult;", "T", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", Constants.KEY_DATA, ACSPConstants.STATUS, "Lru/yandex/tankerapp/fintech/models/results/FintechStatusResult;", "error", "Lru/yandex/tankerapp/fintech/models/results/FintechError;", "<init>", "(Landroid/os/Parcelable;Lru/yandex/tankerapp/fintech/models/results/FintechStatusResult;Lru/yandex/tankerapp/fintech/models/results/FintechError;)V", "getData", "()Landroid/os/Parcelable;", "Landroid/os/Parcelable;", "getStatus", "()Lru/yandex/tankerapp/fintech/models/results/FintechStatusResult;", "getError", "()Lru/yandex/tankerapp/fintech/models/results/FintechError;", "component1", "component2", "component3", "copy", "(Landroid/os/Parcelable;Lru/yandex/tankerapp/fintech/models/results/FintechStatusResult;Lru/yandex/tankerapp/fintech/models/results/FintechError;)Lru/yandex/tankerapp/fintech/models/results/FintechDataResult;", "equals", "", "other", "", "hashCode", "", "toString", "", "fintech_sdk_interface_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FintechDataResult<T extends Parcelable> implements Serializable {

    @ysq0(Constants.KEY_DATA)
    private final T data;

    @ysq0("error")
    private final FintechError error;

    @ysq0(ACSPConstants.STATUS)
    private final FintechStatusResult status;

    public FintechDataResult(T t, FintechStatusResult fintechStatusResult, FintechError fintechError) {
        this.data = t;
        this.status = fintechStatusResult;
        this.error = fintechError;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FintechDataResult copy$default(FintechDataResult fintechDataResult, Parcelable parcelable, FintechStatusResult fintechStatusResult, FintechError fintechError, int i, Object obj) {
        if ((i & 1) != 0) {
            parcelable = fintechDataResult.data;
        }
        if ((i & 2) != 0) {
            fintechStatusResult = fintechDataResult.status;
        }
        if ((i & 4) != 0) {
            fintechError = fintechDataResult.error;
        }
        return fintechDataResult.copy(parcelable, fintechStatusResult, fintechError);
    }

    public final T component1() {
        return this.data;
    }

    /* renamed from: component2, reason: from getter */
    public final FintechStatusResult getStatus() {
        return this.status;
    }

    /* renamed from: component3, reason: from getter */
    public final FintechError getError() {
        return this.error;
    }

    public final FintechDataResult<T> copy(T data, FintechStatusResult status, FintechError error) {
        return new FintechDataResult<>(data, status, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FintechDataResult)) {
            return false;
        }
        FintechDataResult fintechDataResult = (FintechDataResult) other;
        return jl40.l(this.data, fintechDataResult.data) && this.status == fintechDataResult.status && jl40.l(this.error, fintechDataResult.error);
    }

    public final T getData() {
        return this.data;
    }

    public final FintechError getError() {
        return this.error;
    }

    public final FintechStatusResult getStatus() {
        return this.status;
    }

    public int hashCode() {
        T t = this.data;
        int hashCode = (this.status.hashCode() + ((t == null ? 0 : t.hashCode()) * 31)) * 31;
        FintechError fintechError = this.error;
        return hashCode + (fintechError != null ? fintechError.hashCode() : 0);
    }

    public String toString() {
        return "FintechDataResult(data=" + this.data + ", status=" + this.status + ", error=" + this.error + Extension.C_BRAKE;
    }
}
