package defpackage;

import com.ybsdk.feature.transfer.version2.api.entities.TransferResultPageEntity;
import com.ybsdk.feature.transfer.version2.internal.entities.ResultStatus;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class yr01 {
    public final ResultStatus a;
    public final TransferResultPageEntity b;
    public final mw3 c;
    public final List d;
    public final p39 e;
    public final v9j0 f;

    public yr01(ResultStatus resultStatus, TransferResultPageEntity transferResultPageEntity, mw3 mw3Var, List list, p39 p39Var, v9j0 v9j0Var) {
        this.a = resultStatus;
        this.b = transferResultPageEntity;
        this.c = mw3Var;
        this.d = list;
        this.e = p39Var;
        this.f = v9j0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yr01)) {
            return false;
        }
        yr01 yr01Var = (yr01) obj;
        return this.a == yr01Var.a && jl40.l(this.b, yr01Var.b) && jl40.l(this.c, yr01Var.c) && jl40.l(this.d, yr01Var.d) && jl40.l(this.e, yr01Var.e) && jl40.l(this.f, yr01Var.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        TransferResultPageEntity transferResultPageEntity = this.b;
        int hashCode2 = (hashCode + (transferResultPageEntity == null ? 0 : transferResultPageEntity.hashCode())) * 31;
        mw3 mw3Var = this.c;
        int c = unr0.c((hashCode2 + (mw3Var == null ? 0 : mw3Var.hashCode())) * 31, 31, this.d);
        p39 p39Var = this.e;
        int hashCode3 = (c + (p39Var == null ? 0 : p39Var.hashCode())) * 31;
        v9j0 v9j0Var = this.f;
        return hashCode3 + (v9j0Var != null ? v9j0Var.a.hashCode() : 0);
    }

    public final String toString() {
        return "TransferResultEntity(status=" + this.a + ", resultPage=" + this.b + ", widgets=" + this.c + ", divkitWidgets=" + this.d + ", cashback=" + this.e + ", required3ds=" + this.f + Extension.C_BRAKE;
    }

    public /* synthetic */ yr01(ResultStatus resultStatus) {
        this(resultStatus, null, null, EmptyList.a, null, null);
    }
}
