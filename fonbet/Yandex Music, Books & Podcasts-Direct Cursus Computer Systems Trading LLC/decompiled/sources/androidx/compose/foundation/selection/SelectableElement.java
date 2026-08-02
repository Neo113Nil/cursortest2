package androidx.compose.foundation.selection;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.cje;
import defpackage.edi;
import defpackage.k5r;
import defpackage.ldp;
import defpackage.meo;
import defpackage.neg;
import defpackage.uoi;
import defpackage.xci;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/selection/SelectableElement;", "Ledi;", "Lldp;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
final class SelectableElement extends edi {
    public final boolean a;
    public final uoi b;
    public final cje c;
    public final boolean d;
    public final meo e;
    public final Function0 f;

    public SelectableElement(boolean z, uoi uoiVar, cje cjeVar, boolean z2, meo meoVar, Function0 function0) {
        this.a = z;
        this.b = uoiVar;
        this.c = cjeVar;
        this.d = z2;
        this.e = meoVar;
        this.f = function0;
    }

    @Override // defpackage.edi
    public final xci e() {
        ldp ldpVar = new ldp(this.b, this.c, this.d, null, this.e, this.f);
        ldpVar.H = this.a;
        return ldpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SelectableElement.class != obj.getClass()) {
            return false;
        }
        SelectableElement selectableElement = (SelectableElement) obj;
        return this.a == selectableElement.a && Intrinsics.d(this.b, selectableElement.b) && Intrinsics.d(this.c, selectableElement.c) && this.d == selectableElement.d && Intrinsics.d(this.e, selectableElement.e) && this.f == selectableElement.f;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        uoi uoiVar = this.b;
        int hashCode2 = (hashCode + (uoiVar != null ? uoiVar.hashCode() : 0)) * 31;
        cje cjeVar = this.c;
        int e = k5r.e((hashCode2 + (cjeVar != null ? cjeVar.hashCode() : 0)) * 31, 31, this.d);
        meo meoVar = this.e;
        return this.f.hashCode() + ((e + (meoVar != null ? Integer.hashCode(meoVar.a) : 0)) * 31);
    }

    @Override // defpackage.edi
    public final void j(xci xciVar) {
        ldp ldpVar = (ldp) xciVar;
        boolean z = ldpVar.H;
        boolean z2 = this.a;
        if (z != z2) {
            ldpVar.H = z2;
            neg.w(ldpVar);
        }
        ldpVar.c1(this.b, this.c, this.d, null, this.e, this.f);
    }
}
