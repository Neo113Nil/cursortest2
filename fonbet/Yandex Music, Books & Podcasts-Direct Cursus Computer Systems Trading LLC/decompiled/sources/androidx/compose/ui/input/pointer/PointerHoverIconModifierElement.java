package androidx.compose.ui.input.pointer;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.edi;
import defpackage.ifm;
import defpackage.uh0;
import defpackage.xci;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerHoverIconModifierElement;", "Ledi;", "Lifm;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
public final /* data */ class PointerHoverIconModifierElement extends edi {
    public final uh0 a;

    public PointerHoverIconModifierElement(uh0 uh0Var) {
        this.a = uh0Var;
    }

    @Override // defpackage.edi
    public final xci e() {
        return new ifm(this.a, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PointerHoverIconModifierElement) && this.a.equals(((PointerHoverIconModifierElement) obj).a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.a.b * 31);
    }

    @Override // defpackage.edi
    public final void j(xci xciVar) {
        ifm ifmVar = (ifm) xciVar;
        uh0 uh0Var = ifmVar.p;
        uh0 uh0Var2 = this.a;
        if (Intrinsics.d(uh0Var, uh0Var2)) {
            return;
        }
        ifmVar.p = uh0Var2;
        if (ifmVar.q) {
            ifmVar.U0();
        }
    }

    public final String toString() {
        return "PointerHoverIconModifierElement(icon=" + this.a + ", overrideDescendants=false)";
    }
}
