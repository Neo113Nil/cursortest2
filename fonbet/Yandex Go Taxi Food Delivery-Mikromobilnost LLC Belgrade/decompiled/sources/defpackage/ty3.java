package defpackage;

import com.ybsdk.core.common.domain.entities.ActionButtonEntity;
import com.ybsdk.core.common.domain.entities.CommonSheetEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ty3 {
    public final String a;
    public final ActionButtonEntity b;
    public final CommonSheetEntity c;
    public final sy3 d;
    public final boolean e;

    public ty3(String str, ActionButtonEntity actionButtonEntity, CommonSheetEntity commonSheetEntity, sy3 sy3Var, boolean z) {
        this.a = str;
        this.b = actionButtonEntity;
        this.c = commonSheetEntity;
        this.d = sy3Var;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ty3)) {
            return false;
        }
        ty3 ty3Var = (ty3) obj;
        return jl40.l(this.a, ty3Var.a) && jl40.l(this.b, ty3Var.b) && jl40.l(this.c, ty3Var.c) && jl40.l(this.d, ty3Var.d) && this.e == ty3Var.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ActionButtonEntity actionButtonEntity = this.b;
        int hashCode2 = (hashCode + (actionButtonEntity == null ? 0 : actionButtonEntity.hashCode())) * 31;
        CommonSheetEntity commonSheetEntity = this.c;
        int hashCode3 = (hashCode2 + (commonSheetEntity == null ? 0 : commonSheetEntity.hashCode())) * 31;
        sy3 sy3Var = this.d;
        return Boolean.hashCode(this.e) + ((hashCode3 + (sy3Var != null ? sy3Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AutoTopupRequestEntity(id=");
        sb.append(this.a);
        sb.append(", button=");
        sb.append(this.b);
        sb.append(", appNotFoundSheet=");
        sb.append(this.c);
        sb.append(", resultScreen=");
        sb.append(this.d);
        sb.append(", isV2RequestStatusEnabled=");
        return x4e.i(sb, this.e, Extension.C_BRAKE);
    }

    public /* synthetic */ ty3(String str, ActionButtonEntity actionButtonEntity, CommonSheetEntity commonSheetEntity) {
        this(str, actionButtonEntity, commonSheetEntity, null, true);
    }
}
