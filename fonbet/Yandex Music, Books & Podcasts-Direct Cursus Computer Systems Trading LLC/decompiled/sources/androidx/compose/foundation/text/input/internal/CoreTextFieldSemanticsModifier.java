package androidx.compose.foundation.text.input.internal;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.axf;
import defpackage.edi;
import defpackage.ide;
import defpackage.k5r;
import defpackage.l7t;
import defpackage.mnj;
import defpackage.neg;
import defpackage.qbs;
import defpackage.rds;
import defpackage.vl6;
import defpackage.xci;
import defpackage.xl6;
import defpackage.ybs;
import defpackage.yoc;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;", "Ledi;", "Lxl6;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
public final /* data */ class CoreTextFieldSemanticsModifier extends edi {
    public final l7t a;
    public final ybs b;
    public final axf c;
    public final boolean d;
    public final mnj e;
    public final qbs f;
    public final ide g;
    public final yoc h;

    public CoreTextFieldSemanticsModifier(l7t l7tVar, ybs ybsVar, axf axfVar, boolean z, mnj mnjVar, qbs qbsVar, ide ideVar, yoc yocVar) {
        this.a = l7tVar;
        this.b = ybsVar;
        this.c = axfVar;
        this.d = z;
        this.e = mnjVar;
        this.f = qbsVar;
        this.g = ideVar;
        this.h = yocVar;
    }

    @Override // defpackage.edi
    public final xci e() {
        xl6 xl6Var = new xl6();
        xl6Var.q = this.a;
        xl6Var.r = this.b;
        xl6Var.s = this.c;
        xl6Var.t = this.d;
        xl6Var.u = this.e;
        qbs qbsVar = this.f;
        xl6Var.v = qbsVar;
        xl6Var.w = this.g;
        xl6Var.x = this.h;
        qbsVar.g = new vl6(xl6Var, 0);
        return xl6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoreTextFieldSemanticsModifier)) {
            return false;
        }
        CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier = (CoreTextFieldSemanticsModifier) obj;
        return this.a.equals(coreTextFieldSemanticsModifier.a) && Intrinsics.d(this.b, coreTextFieldSemanticsModifier.b) && this.c.equals(coreTextFieldSemanticsModifier.c) && this.d == coreTextFieldSemanticsModifier.d && Intrinsics.d(this.e, coreTextFieldSemanticsModifier.e) && this.f.equals(coreTextFieldSemanticsModifier.f) && Intrinsics.d(this.g, coreTextFieldSemanticsModifier.g) && Intrinsics.d(this.h, coreTextFieldSemanticsModifier.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + k5r.e(k5r.e(k5r.e((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, false), 31, this.d), 31, false)) * 31)) * 31)) * 31);
    }

    @Override // defpackage.edi
    public final void j(xci xciVar) {
        xl6 xl6Var = (xl6) xciVar;
        boolean z = xl6Var.t;
        ide ideVar = xl6Var.w;
        qbs qbsVar = xl6Var.v;
        xl6Var.q = this.a;
        ybs ybsVar = this.b;
        xl6Var.r = ybsVar;
        xl6Var.s = this.c;
        boolean z2 = this.d;
        xl6Var.t = z2;
        xl6Var.u = this.e;
        qbs qbsVar2 = this.f;
        xl6Var.v = qbsVar2;
        ide ideVar2 = this.g;
        xl6Var.w = ideVar2;
        xl6Var.x = this.h;
        if (z2 != z || z2 != z || !Intrinsics.d(ideVar2, ideVar) || !rds.b(ybsVar.b)) {
            neg.w(xl6Var);
        }
        if (qbsVar2.equals(qbsVar)) {
            return;
        }
        qbsVar2.g = new vl6(xl6Var, 7);
    }

    public final String toString() {
        return "CoreTextFieldSemanticsModifier(transformedText=" + this.a + ", value=" + this.b + ", state=" + this.c + ", readOnly=false, enabled=" + this.d + ", isPassword=false, offsetMapping=" + this.e + ", manager=" + this.f + ", imeOptions=" + this.g + ", focusRequester=" + this.h + ')';
    }
}
