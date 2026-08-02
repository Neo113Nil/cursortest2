package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.kyc.internal.screens.photo.helpers.CameraLens;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class qpx {
    public final Text.Resource a;
    public final Text.Resource b;
    public final Text c;
    public final nbv d;
    public final tr7 e;
    public final ppx f;
    public final rbv g;

    public qpx(Text.Resource resource, Text.Resource resource2, Text text, nbv nbvVar, tr7 tr7Var, ppx ppxVar, nbv nbvVar2) {
        this.a = resource;
        this.b = resource2;
        this.c = text;
        this.d = nbvVar;
        this.e = tr7Var;
        this.f = ppxVar;
        this.g = nbvVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qpx)) {
            return false;
        }
        qpx qpxVar = (qpx) obj;
        return jl40.l(this.a, qpxVar.a) && jl40.l(this.b, qpxVar.b) && jl40.l(this.c, qpxVar.c) && jl40.l(this.d, qpxVar.d) && jl40.l(this.e, qpxVar.e) && jl40.l(this.f, qpxVar.f) && jl40.l(this.g, qpxVar.g);
    }

    public final int hashCode() {
        int hashCode = (this.e.a.hashCode() + ((this.d.hashCode() + n.c(this.c, uw51.b(this.b, this.a.hashCode() * 31, 31), 31)) * 31)) * 31;
        ppx ppxVar = this.f;
        int hashCode2 = (hashCode + (ppxVar == null ? 0 : ppxVar.hashCode())) * 31;
        rbv rbvVar = this.g;
        return hashCode2 + (rbvVar != null ? rbvVar.hashCode() : 0);
    }

    public final String toString() {
        return "Caption(title=" + this.a + ", prompt=" + this.b + ", subtitle=" + this.c + ", photoFrame=" + this.d + ", cameraParameters=" + this.e + ", bottomSheetContent=" + this.f + ", photoFrameLandscape=" + this.g + Extension.C_BRAKE;
    }

    public /* synthetic */ qpx(Text.Resource resource, Text.Resource resource2, Text.Resource resource3, nbv nbvVar) {
        this(resource, resource2, resource3, nbvVar, new tr7(CameraLens.BACK), null, null);
    }
}
