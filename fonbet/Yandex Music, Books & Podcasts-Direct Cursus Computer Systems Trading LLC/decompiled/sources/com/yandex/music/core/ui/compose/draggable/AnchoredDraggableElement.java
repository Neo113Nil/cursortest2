package com.yandex.music.core.ui.compose.draggable;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.bxj;
import defpackage.edi;
import defpackage.ja0;
import defpackage.jic;
import defpackage.k5r;
import defpackage.p90;
import defpackage.tma;
import defpackage.uoi;
import defpackage.xci;
import defpackage.xq0;
import defpackage.zi3;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, d2 = {"Lcom/yandex/music/core/ui/compose/draggable/AnchoredDraggableElement;", "T", "Ledi;", "Lp90;", "shared-core-ui-compose-utils"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
final class AnchoredDraggableElement<T> extends edi {
    public final ja0 a;
    public final bxj b;
    public final boolean c;
    public final uoi d;
    public final jic e;

    public AnchoredDraggableElement(ja0 ja0Var, bxj bxjVar, boolean z, uoi uoiVar, jic jicVar) {
        ja0Var.getClass();
        this.a = ja0Var;
        this.b = bxjVar;
        this.c = z;
        this.d = uoiVar;
        this.e = jicVar;
    }

    @Override // defpackage.edi
    public final xci e() {
        ja0 ja0Var = this.a;
        ja0Var.getClass();
        p90 p90Var = new p90();
        bxj bxjVar = this.b;
        p90Var.q = bxjVar;
        p90Var.r = a.c;
        p90Var.s = this.c;
        p90Var.t = this.d;
        p90Var.E = 9205357640488583168L;
        p90Var.G = 0L;
        p90Var.H = ja0Var;
        p90Var.I = bxjVar;
        p90Var.J = this.e;
        return p90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnchoredDraggableElement)) {
            return false;
        }
        AnchoredDraggableElement anchoredDraggableElement = (AnchoredDraggableElement) obj;
        return Intrinsics.d(this.a, anchoredDraggableElement.a) && this.b == anchoredDraggableElement.b && this.c == anchoredDraggableElement.c && Intrinsics.d(this.d, anchoredDraggableElement.d) && Intrinsics.d(this.e, anchoredDraggableElement.e);
    }

    public final int hashCode() {
        int e = k5r.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 961, this.c);
        uoi uoiVar = this.d;
        int hashCode = (e + (uoiVar != null ? uoiVar.hashCode() : 0)) * 29791;
        jic jicVar = this.e;
        return hashCode + (jicVar != null ? jicVar.hashCode() : 0);
    }

    @Override // defpackage.edi
    public final void j(xci xciVar) {
        boolean z;
        p90 p90Var = (p90) xciVar;
        p90Var.getClass();
        ja0 ja0Var = this.a;
        ja0Var.getClass();
        jic jicVar = this.e;
        p90Var.J = jicVar;
        boolean z2 = true;
        if (Intrinsics.d(p90Var.H, ja0Var)) {
            z = false;
        } else {
            p90Var.H = ja0Var;
            p90Var.h1(jicVar);
            z = true;
        }
        bxj bxjVar = p90Var.I;
        bxj bxjVar2 = this.b;
        if (bxjVar != bxjVar2) {
            p90Var.I = bxjVar2;
            z = true;
        }
        Function1 function1 = p90Var.r;
        function1.getClass();
        p90Var.r = function1;
        boolean z3 = p90Var.s;
        boolean z4 = this.c;
        if (z3 != z4) {
            p90Var.s = z4;
            if (!z4) {
                p90Var.Z0();
            }
            z = true;
        }
        uoi uoiVar = p90Var.t;
        uoi uoiVar2 = this.d;
        if (!Intrinsics.d(uoiVar, uoiVar2)) {
            p90Var.Z0();
            p90Var.t = uoiVar2;
        }
        if (p90Var.q != bxjVar2) {
            p90Var.q = bxjVar2;
        } else {
            z2 = z;
        }
        if (z2 && p90Var.x) {
            p90Var.b1();
            if (p90Var.w) {
                zi3 zi3Var = p90Var.u;
                if (zi3Var == null) {
                    xq0.x("Events channel not initialized.");
                    return;
                }
                zi3Var.c(tma.a);
            }
            p90Var.D = null;
        }
    }
}
