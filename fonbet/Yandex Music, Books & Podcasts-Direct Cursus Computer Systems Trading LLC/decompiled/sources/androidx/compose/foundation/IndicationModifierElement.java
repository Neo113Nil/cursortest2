package androidx.compose.foundation;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.bje;
import defpackage.cje;
import defpackage.edi;
import defpackage.sv7;
import defpackage.uoi;
import defpackage.xci;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/IndicationModifierElement;", "Ledi;", "Lbje;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
final class IndicationModifierElement extends edi {
    public final uoi a;
    public final cje b;

    public IndicationModifierElement(uoi uoiVar, cje cjeVar) {
        this.a = uoiVar;
        this.b = cjeVar;
    }

    @Override // defpackage.edi
    public final xci e() {
        sv7 b = this.b.b(this.a);
        bje bjeVar = new bje();
        bjeVar.q = b;
        bjeVar.S0(b);
        return bjeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndicationModifierElement)) {
            return false;
        }
        IndicationModifierElement indicationModifierElement = (IndicationModifierElement) obj;
        return Intrinsics.d(this.a, indicationModifierElement.a) && Intrinsics.d(this.b, indicationModifierElement.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.edi
    public final void j(xci xciVar) {
        bje bjeVar = (bje) xciVar;
        sv7 b = this.b.b(this.a);
        bjeVar.T0(bjeVar.q);
        bjeVar.q = b;
        bjeVar.S0(b);
    }
}
