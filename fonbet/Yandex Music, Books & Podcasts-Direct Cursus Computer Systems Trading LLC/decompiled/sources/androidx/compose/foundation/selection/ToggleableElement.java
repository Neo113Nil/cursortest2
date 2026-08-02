package androidx.compose.foundation.selection;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.cje;
import defpackage.edi;
import defpackage.f1d;
import defpackage.k5r;
import defpackage.meo;
import defpackage.neg;
import defpackage.rls;
import defpackage.uoi;
import defpackage.xci;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/selection/ToggleableElement;", "Ledi;", "Lrls;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
final class ToggleableElement extends edi {
    public final boolean a;
    public final uoi b;
    public final cje c;
    public final boolean d;
    public final meo e;
    public final Function1 f;

    public ToggleableElement(boolean z, uoi uoiVar, cje cjeVar, boolean z2, meo meoVar, Function1 function1) {
        this.a = z;
        this.b = uoiVar;
        this.c = cjeVar;
        this.d = z2;
        this.e = meoVar;
        this.f = function1;
    }

    @Override // defpackage.edi
    public final xci e() {
        return new rls(this.a, this.b, this.c, this.d, this.e, this.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ToggleableElement.class != obj.getClass()) {
            return false;
        }
        ToggleableElement toggleableElement = (ToggleableElement) obj;
        return this.a == toggleableElement.a && Intrinsics.d(this.b, toggleableElement.b) && Intrinsics.d(this.c, toggleableElement.c) && this.d == toggleableElement.d && this.e.equals(toggleableElement.e) && this.f == toggleableElement.f;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        uoi uoiVar = this.b;
        int hashCode2 = (hashCode + (uoiVar != null ? uoiVar.hashCode() : 0)) * 31;
        cje cjeVar = this.c;
        return this.f.hashCode() + f1d.a(this.e.a, k5r.e((hashCode2 + (cjeVar != null ? cjeVar.hashCode() : 0)) * 31, 31, this.d), 31);
    }

    @Override // defpackage.edi
    public final void j(xci xciVar) {
        rls rlsVar = (rls) xciVar;
        boolean z = rlsVar.H;
        boolean z2 = this.a;
        if (z != z2) {
            rlsVar.H = z2;
            neg.w(rlsVar);
        }
        rlsVar.I = this.f;
        rlsVar.c1(this.b, this.c, this.d, null, this.e, rlsVar.J);
    }
}
