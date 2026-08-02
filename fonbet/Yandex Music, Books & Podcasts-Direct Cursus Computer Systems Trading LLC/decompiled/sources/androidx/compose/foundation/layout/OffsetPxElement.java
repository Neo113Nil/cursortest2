package androidx.compose.foundation.layout;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.bcx;
import defpackage.edi;
import defpackage.mp3;
import defpackage.pnj;
import defpackage.xci;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/OffsetPxElement;", "Ledi;", "Lpnj;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
final class OffsetPxElement extends edi {
    public final Function1 a;

    public OffsetPxElement(Function1 function1, mp3 mp3Var) {
        this.a = function1;
    }

    @Override // defpackage.edi
    public final xci e() {
        pnj pnjVar = new pnj();
        pnjVar.o = this.a;
        pnjVar.p = true;
        return pnjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetPxElement offsetPxElement = obj instanceof OffsetPxElement ? (OffsetPxElement) obj : null;
        return offsetPxElement != null && this.a == offsetPxElement.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.a.hashCode() * 31);
    }

    @Override // defpackage.edi
    public final void j(xci xciVar) {
        pnj pnjVar = (pnj) xciVar;
        Function1 function1 = pnjVar.o;
        Function1 function12 = this.a;
        if (function1 != function12 || !pnjVar.p) {
            bcx.F(pnjVar).V(false);
        }
        pnjVar.o = function12;
        pnjVar.p = true;
    }

    public final String toString() {
        return "OffsetPxModifier(offset=" + this.a + ", rtlAware=true)";
    }
}
