package androidx.compose.ui.draw;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.edi;
import defpackage.eta;
import defpackage.g40;
import defpackage.h4a;
import defpackage.jd6;
import defpackage.k5r;
import defpackage.m85;
import defpackage.nmq;
import defpackage.vq1;
import defpackage.w4k;
import defpackage.x4k;
import defpackage.xci;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/PainterElement;", "Ledi;", "Lx4k;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
final /* data */ class PainterElement extends edi {
    public final w4k a;
    public final g40 b;
    public final jd6 c;
    public final float d;
    public final m85 e;

    public PainterElement(w4k w4kVar, g40 g40Var, jd6 jd6Var, float f, m85 m85Var) {
        this.a = w4kVar;
        this.b = g40Var;
        this.c = jd6Var;
        this.d = f;
        this.e = m85Var;
    }

    @Override // defpackage.edi
    public final xci e() {
        x4k x4kVar = new x4k();
        x4kVar.o = this.a;
        x4kVar.p = true;
        x4kVar.q = this.b;
        x4kVar.r = this.c;
        x4kVar.s = this.d;
        x4kVar.t = this.e;
        return x4kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) obj;
        return Intrinsics.d(this.a, painterElement.a) && Intrinsics.d(this.b, painterElement.b) && Intrinsics.d(this.c, painterElement.c) && Float.compare(this.d, painterElement.d) == 0 && Intrinsics.d(this.e, painterElement.e);
    }

    public final int hashCode() {
        int a = eta.a((this.c.hashCode() + ((this.b.hashCode() + k5r.e(this.a.hashCode() * 31, 31, true)) * 31)) * 31, this.d, 31);
        m85 m85Var = this.e;
        return a + (m85Var == null ? 0 : m85Var.hashCode());
    }

    @Override // defpackage.edi
    public final void j(xci xciVar) {
        x4k x4kVar = (x4k) xciVar;
        boolean z = x4kVar.p;
        w4k w4kVar = this.a;
        boolean z2 = (z && nmq.a(x4kVar.o.i(), w4kVar.i())) ? false : true;
        x4kVar.o = w4kVar;
        x4kVar.p = true;
        x4kVar.q = this.b;
        x4kVar.r = this.c;
        x4kVar.s = this.d;
        x4kVar.t = this.e;
        if (z2) {
            h4a.z(x4kVar);
        }
        vq1.Z(x4kVar);
    }

    public final String toString() {
        return "PainterElement(painter=" + this.a + ", sizeToIntrinsics=true, alignment=" + this.b + ", contentScale=" + this.c + ", alpha=" + this.d + ", colorFilter=" + this.e + ')';
    }
}
