package androidx.compose.ui.input.pointer;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.c3x;
import defpackage.edi;
import defpackage.gma;
import defpackage.k5r;
import defpackage.rmr;
import defpackage.uh0;
import defpackage.xci;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/StylusHoverIconModifierElement;", "Ledi;", "Lrmr;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
public final /* data */ class StylusHoverIconModifierElement extends edi {
    public final gma a;

    public StylusHoverIconModifierElement(gma gmaVar) {
        this.a = gmaVar;
    }

    @Override // defpackage.edi
    public final xci e() {
        return new rmr(c3x.i, this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StylusHoverIconModifierElement)) {
            return false;
        }
        StylusHoverIconModifierElement stylusHoverIconModifierElement = (StylusHoverIconModifierElement) obj;
        uh0 uh0Var = c3x.i;
        return uh0Var.equals(uh0Var) && Intrinsics.d(this.a, stylusHoverIconModifierElement.a);
    }

    public final int hashCode() {
        int e = k5r.e(1022 * 31, 31, false);
        gma gmaVar = this.a;
        return e + (gmaVar != null ? gmaVar.hashCode() : 0);
    }

    @Override // defpackage.edi
    public final void j(xci xciVar) {
        rmr rmrVar = (rmr) xciVar;
        uh0 uh0Var = c3x.i;
        if (!Intrinsics.d(rmrVar.p, uh0Var)) {
            rmrVar.p = uh0Var;
            if (rmrVar.q) {
                rmrVar.U0();
            }
        }
        rmrVar.o = this.a;
    }

    public final String toString() {
        return "StylusHoverIconModifierElement(icon=" + c3x.i + ", overrideDescendants=false, touchBoundsExpansion=" + this.a + ')';
    }
}
