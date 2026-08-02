package androidx.compose.foundation.gestures;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.bpa;
import defpackage.bxj;
import defpackage.cpa;
import defpackage.edi;
import defpackage.jx9;
import defpackage.k5r;
import defpackage.pyc;
import defpackage.uoi;
import defpackage.xci;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/DraggableElement;", "Ledi;", "Lbpa;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
public final class DraggableElement extends edi {
    public final cpa a;
    public final bxj b;
    public final boolean c;
    public final uoi d;
    public final boolean e;
    public final pyc f;
    public final pyc g;
    public final boolean h;

    public DraggableElement(cpa cpaVar, bxj bxjVar, boolean z, uoi uoiVar, boolean z2, pyc pycVar, pyc pycVar2, boolean z3) {
        this.a = cpaVar;
        this.b = bxjVar;
        this.c = z;
        this.d = uoiVar;
        this.e = z2;
        this.f = pycVar;
        this.g = pycVar2;
        this.h = z3;
    }

    @Override // defpackage.edi
    public final xci e() {
        jx9 jx9Var = jx9.D;
        boolean z = this.c;
        uoi uoiVar = this.d;
        bxj bxjVar = this.b;
        bpa bpaVar = new bpa(jx9Var, z, uoiVar, bxjVar);
        bpaVar.y = this.a;
        bpaVar.z = bxjVar;
        bpaVar.A = this.e;
        bpaVar.B = this.f;
        bpaVar.C = this.g;
        bpaVar.D = this.h;
        return bpaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DraggableElement.class != obj.getClass()) {
            return false;
        }
        DraggableElement draggableElement = (DraggableElement) obj;
        return Intrinsics.d(this.a, draggableElement.a) && this.b == draggableElement.b && this.c == draggableElement.c && Intrinsics.d(this.d, draggableElement.d) && this.e == draggableElement.e && Intrinsics.d(this.f, draggableElement.f) && Intrinsics.d(this.g, draggableElement.g) && this.h == draggableElement.h;
    }

    public final int hashCode() {
        int e = k5r.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        uoi uoiVar = this.d;
        return Boolean.hashCode(this.h) + ((this.g.hashCode() + ((this.f.hashCode() + k5r.e((e + (uoiVar != null ? uoiVar.hashCode() : 0)) * 31, 31, this.e)) * 31)) * 31);
    }

    @Override // defpackage.edi
    public final void j(xci xciVar) {
        boolean z;
        boolean z2;
        bpa bpaVar = (bpa) xciVar;
        jx9 jx9Var = jx9.D;
        cpa cpaVar = bpaVar.y;
        cpa cpaVar2 = this.a;
        if (Intrinsics.d(cpaVar, cpaVar2)) {
            z = false;
        } else {
            bpaVar.y = cpaVar2;
            z = true;
        }
        bxj bxjVar = bpaVar.z;
        bxj bxjVar2 = this.b;
        if (bxjVar != bxjVar2) {
            bpaVar.z = bxjVar2;
            z = true;
        }
        boolean z3 = bpaVar.D;
        boolean z4 = this.h;
        if (z3 != z4) {
            bpaVar.D = z4;
            z2 = true;
        } else {
            z2 = z;
        }
        bpaVar.B = this.f;
        bpaVar.C = this.g;
        bpaVar.A = this.e;
        bpaVar.d1(jx9Var, this.c, this.d, bxjVar2, z2);
    }
}
