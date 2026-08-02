package defpackage;

import android.os.Parcelable;
import com.yandex.fintechsdk.flows.payment.kit.internal.di.paymentkit.features.bdui.action.finish.FinishFlowStatus;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class q3a0 {
    public final FinishFlowStatus a;
    public final Map b;
    public final Parcelable c;

    public q3a0(FinishFlowStatus finishFlowStatus, Map map, Parcelable parcelable) {
        this.a = finishFlowStatus;
        this.b = map;
        this.c = parcelable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q3a0)) {
            return false;
        }
        q3a0 q3a0Var = (q3a0) obj;
        return this.a == q3a0Var.a && jl40.l(this.b, q3a0Var.b) && jl40.l(this.c, q3a0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Map map = this.b;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        Parcelable parcelable = this.c;
        return hashCode2 + (parcelable != null ? parcelable.hashCode() : 0);
    }

    public final String toString() {
        return "PaymentKitResult(status=" + this.a + ", params=" + this.b + ", parcelableData=" + this.c + Extension.C_BRAKE;
    }
}
