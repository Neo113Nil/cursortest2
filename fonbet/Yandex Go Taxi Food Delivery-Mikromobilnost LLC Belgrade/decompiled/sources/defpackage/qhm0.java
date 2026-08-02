package defpackage;

import com.ybsdk.core.common.domain.entities.CommonSheetEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class qhm0 {
    public final CommonSheetEntity a;

    public qhm0(CommonSheetEntity commonSheetEntity) {
        this.a = commonSheetEntity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qhm0) && jl40.l(this.a, ((qhm0) obj).a);
    }

    public final int hashCode() {
        CommonSheetEntity commonSheetEntity = this.a;
        if (commonSheetEntity == null) {
            return 0;
        }
        return commonSheetEntity.hashCode();
    }

    public final String toString() {
        return "SbpPartnerPayloadEntity(userWithoutPayCardSheet=" + this.a + Extension.C_BRAKE;
    }
}
