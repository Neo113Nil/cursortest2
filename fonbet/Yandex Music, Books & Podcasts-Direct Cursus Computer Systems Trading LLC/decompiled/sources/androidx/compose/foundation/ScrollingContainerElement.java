package androidx.compose.foundation;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.bxj;
import defpackage.edi;
import defpackage.eyo;
import defpackage.jic;
import defpackage.k5r;
import defpackage.mxo;
import defpackage.qg0;
import defpackage.sh3;
import defpackage.uoi;
import defpackage.xci;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/ScrollingContainerElement;", "Ledi;", "Leyo;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
final class ScrollingContainerElement extends edi {
    public final mxo a;
    public final bxj b;
    public final boolean c;
    public final boolean d;
    public final jic e;
    public final uoi f;
    public final sh3 g;
    public final boolean h;
    public final qg0 i;

    public ScrollingContainerElement(qg0 qg0Var, sh3 sh3Var, jic jicVar, uoi uoiVar, bxj bxjVar, mxo mxoVar, boolean z, boolean z2, boolean z3) {
        this.a = mxoVar;
        this.b = bxjVar;
        this.c = z;
        this.d = z2;
        this.e = jicVar;
        this.f = uoiVar;
        this.g = sh3Var;
        this.h = z3;
        this.i = qg0Var;
    }

    @Override // defpackage.edi
    public final xci e() {
        eyo eyoVar = new eyo();
        eyoVar.q = this.a;
        eyoVar.r = this.b;
        eyoVar.s = this.c;
        eyoVar.t = this.d;
        eyoVar.u = this.e;
        eyoVar.v = this.f;
        eyoVar.w = this.g;
        eyoVar.x = this.h;
        eyoVar.y = this.i;
        return eyoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ScrollingContainerElement.class != obj.getClass()) {
            return false;
        }
        ScrollingContainerElement scrollingContainerElement = (ScrollingContainerElement) obj;
        return Intrinsics.d(this.a, scrollingContainerElement.a) && this.b == scrollingContainerElement.b && this.c == scrollingContainerElement.c && this.d == scrollingContainerElement.d && Intrinsics.d(this.e, scrollingContainerElement.e) && Intrinsics.d(this.f, scrollingContainerElement.f) && Intrinsics.d(this.g, scrollingContainerElement.g) && this.h == scrollingContainerElement.h && Intrinsics.d(this.i, scrollingContainerElement.i);
    }

    public final int hashCode() {
        int e = k5r.e(k5r.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
        jic jicVar = this.e;
        int hashCode = (e + (jicVar != null ? jicVar.hashCode() : 0)) * 31;
        uoi uoiVar = this.f;
        int hashCode2 = (hashCode + (uoiVar != null ? uoiVar.hashCode() : 0)) * 31;
        sh3 sh3Var = this.g;
        int e2 = k5r.e((hashCode2 + (sh3Var != null ? sh3Var.hashCode() : 0)) * 31, 31, this.h);
        qg0 qg0Var = this.i;
        return e2 + (qg0Var != null ? qg0Var.hashCode() : 0);
    }

    @Override // defpackage.edi
    public final void j(xci xciVar) {
        uoi uoiVar = this.f;
        ((eyo) xciVar).X0(this.i, this.g, this.e, uoiVar, this.b, this.a, this.h, this.c, this.d);
    }
}
