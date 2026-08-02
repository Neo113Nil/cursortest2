package defpackage;

import com.yandex.go.safety.center.SafetyCenterParams$Source;
import com.yandex.go.safety.center.experiment.SafetyCenterExperiment;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class sul0 {
    public final String a;
    public final boolean b;
    public final SafetyCenterExperiment c;
    public final SafetyCenterParams$Source d;

    public sul0(String str, boolean z, SafetyCenterExperiment safetyCenterExperiment, SafetyCenterParams$Source safetyCenterParams$Source) {
        this.a = str;
        this.b = z;
        this.c = safetyCenterExperiment;
        this.d = safetyCenterParams$Source;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sul0)) {
            return false;
        }
        sul0 sul0Var = (sul0) obj;
        return jl40.l(this.a, sul0Var.a) && this.b == sul0Var.b && jl40.l(this.c, sul0Var.c) && this.d == sul0Var.d;
    }

    public final int hashCode() {
        String str = this.a;
        return this.d.hashCode() + ((this.c.hashCode() + unr0.e((str == null ? 0 : str.hashCode()) * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder l = oo31.l("Payload(orderId=", this.a, ", isChecklist=", ", experiment=", this.b);
        l.append(this.c);
        l.append(", source=");
        l.append(this.d);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
