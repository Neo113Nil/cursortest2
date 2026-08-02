package defpackage;

import com.ybsdk.core.common.domain.entities.CommonSheetEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class qv5 {
    public final String a;
    public final CommonSheetEntity b;

    public qv5(String str, CommonSheetEntity commonSheetEntity) {
        this.a = str;
        this.b = commonSheetEntity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qv5)) {
            return false;
        }
        qv5 qv5Var = (qv5) obj;
        return jl40.l(this.a, qv5Var.a) && this.b.equals(qv5Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "BindSbpAccountEntity(deeplink=" + this.a + ", appNotFoundSheet=" + this.b + Extension.C_BRAKE;
    }
}
