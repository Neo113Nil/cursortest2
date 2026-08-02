package androidx.compose.foundation.layout;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.cma;
import defpackage.edi;
import defpackage.eta;
import defpackage.n0k;
import defpackage.qme;
import defpackage.xci;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/PaddingElement;", "Ledi;", "Ln0k;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
final class PaddingElement extends edi {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public PaddingElement(float f, float f2, float f3, float f4, Function1 function1) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        boolean z = true;
        boolean z2 = (f >= 0.0f || Float.isNaN(f)) & (f2 >= 0.0f || Float.isNaN(f2)) & (f3 >= 0.0f || Float.isNaN(f3));
        if (f4 < 0.0f && !Float.isNaN(f4)) {
            z = false;
        }
        if (!z2 || !z) {
            qme.a("Padding must be non-negative");
        }
    }

    @Override // defpackage.edi
    public final xci e() {
        n0k n0kVar = new n0k();
        n0kVar.o = this.a;
        n0kVar.p = this.b;
        n0kVar.q = this.c;
        n0kVar.r = this.d;
        n0kVar.s = true;
        return n0kVar;
    }

    public final boolean equals(Object obj) {
        PaddingElement paddingElement = obj instanceof PaddingElement ? (PaddingElement) obj : null;
        return paddingElement != null && cma.a(this.a, paddingElement.a) && cma.a(this.b, paddingElement.b) && cma.a(this.c, paddingElement.c) && cma.a(this.d, paddingElement.d);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + eta.a(eta.a(eta.a(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31);
    }

    @Override // defpackage.edi
    public final void j(xci xciVar) {
        n0k n0kVar = (n0k) xciVar;
        n0kVar.o = this.a;
        n0kVar.p = this.b;
        n0kVar.q = this.c;
        n0kVar.r = this.d;
        n0kVar.s = true;
    }
}
