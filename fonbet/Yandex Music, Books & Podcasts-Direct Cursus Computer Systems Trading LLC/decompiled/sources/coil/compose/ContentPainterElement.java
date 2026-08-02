package coil.compose;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.bd6;
import defpackage.edi;
import defpackage.eta;
import defpackage.g40;
import defpackage.h4a;
import defpackage.jd6;
import defpackage.m85;
import defpackage.nmq;
import defpackage.vq1;
import defpackage.w4k;
import defpackage.xci;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcoil/compose/ContentPainterElement;", "Ledi;", "Lbd6;", "coil-compose-base_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
public final /* data */ class ContentPainterElement extends edi {
    public final w4k a;
    public final g40 b;
    public final jd6 c;
    public final float d;
    public final m85 e;

    public ContentPainterElement(w4k w4kVar, g40 g40Var, jd6 jd6Var, float f, m85 m85Var) {
        this.a = w4kVar;
        this.b = g40Var;
        this.c = jd6Var;
        this.d = f;
        this.e = m85Var;
    }

    @Override // defpackage.edi
    public final xci e() {
        bd6 bd6Var = new bd6();
        bd6Var.o = this.a;
        bd6Var.p = this.b;
        bd6Var.q = this.c;
        bd6Var.r = this.d;
        bd6Var.s = this.e;
        return bd6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentPainterElement)) {
            return false;
        }
        ContentPainterElement contentPainterElement = (ContentPainterElement) obj;
        return Intrinsics.d(this.a, contentPainterElement.a) && Intrinsics.d(this.b, contentPainterElement.b) && Intrinsics.d(this.c, contentPainterElement.c) && Float.compare(this.d, contentPainterElement.d) == 0 && Intrinsics.d(this.e, contentPainterElement.e);
    }

    public final int hashCode() {
        int a = eta.a((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, this.d, 31);
        m85 m85Var = this.e;
        return a + (m85Var == null ? 0 : m85Var.hashCode());
    }

    @Override // defpackage.edi
    public final void j(xci xciVar) {
        bd6 bd6Var = (bd6) xciVar;
        long i = bd6Var.o.i();
        w4k w4kVar = this.a;
        boolean a = nmq.a(i, w4kVar.i());
        bd6Var.o = w4kVar;
        bd6Var.p = this.b;
        bd6Var.q = this.c;
        bd6Var.r = this.d;
        bd6Var.s = this.e;
        if (!a) {
            h4a.z(bd6Var);
        }
        vq1.Z(bd6Var);
    }

    public final String toString() {
        return "ContentPainterElement(painter=" + this.a + ", alignment=" + this.b + ", contentScale=" + this.c + ", alpha=" + this.d + ", colorFilter=" + this.e + ')';
    }
}
