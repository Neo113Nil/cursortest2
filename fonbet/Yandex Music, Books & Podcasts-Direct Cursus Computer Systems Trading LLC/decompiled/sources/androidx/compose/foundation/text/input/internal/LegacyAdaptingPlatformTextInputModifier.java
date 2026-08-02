package androidx.compose.foundation.text.input.internal;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.axf;
import defpackage.ch0;
import defpackage.edi;
import defpackage.nwf;
import defpackage.qbs;
import defpackage.vme;
import defpackage.xci;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/input/internal/LegacyAdaptingPlatformTextInputModifier;", "Ledi;", "Lnwf;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
final /* data */ class LegacyAdaptingPlatformTextInputModifier extends edi {
    public final ch0 a;
    public final axf b;
    public final qbs c;

    public LegacyAdaptingPlatformTextInputModifier(ch0 ch0Var, axf axfVar, qbs qbsVar) {
        this.a = ch0Var;
        this.b = axfVar;
        this.c = qbsVar;
    }

    @Override // defpackage.edi
    public final xci e() {
        return new nwf(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegacyAdaptingPlatformTextInputModifier)) {
            return false;
        }
        LegacyAdaptingPlatformTextInputModifier legacyAdaptingPlatformTextInputModifier = (LegacyAdaptingPlatformTextInputModifier) obj;
        return Intrinsics.d(this.a, legacyAdaptingPlatformTextInputModifier.a) && this.b.equals(legacyAdaptingPlatformTextInputModifier.b) && this.c.equals(legacyAdaptingPlatformTextInputModifier.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    @Override // defpackage.edi
    public final void j(xci xciVar) {
        nwf nwfVar = (nwf) xciVar;
        if (nwfVar.n) {
            nwfVar.o.b();
            nwfVar.o.k(nwfVar);
        }
        ch0 ch0Var = this.a;
        nwfVar.o = ch0Var;
        if (nwfVar.n) {
            if (ch0Var.a != null) {
                vme.c("Expected textInputModifierNode to be null");
            }
            ch0Var.a = nwfVar;
        }
        nwfVar.p = this.b;
        nwfVar.q = this.c;
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.a + ", legacyTextFieldState=" + this.b + ", textFieldSelectionManager=" + this.c + ')';
    }
}
