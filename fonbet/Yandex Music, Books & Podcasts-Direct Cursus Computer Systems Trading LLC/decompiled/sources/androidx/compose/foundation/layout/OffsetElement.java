package androidx.compose.foundation.layout;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.bcx;
import defpackage.cma;
import defpackage.edi;
import defpackage.eta;
import defpackage.nnj;
import defpackage.u8b;
import defpackage.vz1;
import defpackage.xci;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/OffsetElement;", "Ledi;", "Lnnj;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
final class OffsetElement extends edi {
    public final float a;
    public final float b;

    public OffsetElement(float f, float f2, u8b u8bVar) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.edi
    public final xci e() {
        nnj nnjVar = new nnj();
        nnjVar.o = this.a;
        nnjVar.p = this.b;
        nnjVar.q = true;
        return nnjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetElement offsetElement = obj instanceof OffsetElement ? (OffsetElement) obj : null;
        return offsetElement != null && cma.a(this.a, offsetElement.a) && cma.a(this.b, offsetElement.b);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + eta.a(Float.hashCode(this.a) * 31, this.b, 31);
    }

    @Override // defpackage.edi
    public final void j(xci xciVar) {
        nnj nnjVar = (nnj) xciVar;
        float f = nnjVar.o;
        float f2 = this.a;
        boolean a = cma.a(f, f2);
        float f3 = this.b;
        if (!a || !cma.a(nnjVar.p, f3) || !nnjVar.q) {
            bcx.F(nnjVar).V(false);
        }
        nnjVar.o = f2;
        nnjVar.p = f3;
        nnjVar.q = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OffsetModifierElement(x=");
        vz1.z(this.a, ", y=", sb);
        sb.append((Object) cma.b(this.b));
        sb.append(", rtlAware=true)");
        return sb.toString();
    }
}
