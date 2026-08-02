package androidx.compose.ui.draw;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.bcx;
import defpackage.cma;
import defpackage.d85;
import defpackage.dfi;
import defpackage.dup;
import defpackage.edi;
import defpackage.f8j;
import defpackage.hxo;
import defpackage.k5r;
import defpackage.met;
import defpackage.net;
import defpackage.tlm;
import defpackage.vz1;
import defpackage.xci;
import defpackage.y43;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;", "Ledi;", "Ly43;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
public final /* data */ class ShadowGraphicsLayerElement extends edi {
    public final float a;
    public final dup b;
    public final boolean c;
    public final long d;
    public final long e;

    public ShadowGraphicsLayerElement(float f, dup dupVar, boolean z, long j, long j2) {
        this.a = f;
        this.b = dupVar;
        this.c = z;
        this.d = j;
        this.e = j2;
    }

    @Override // defpackage.edi
    public final xci e() {
        return new y43(new hxo(7, this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShadowGraphicsLayerElement)) {
            return false;
        }
        ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) obj;
        return cma.a(this.a, shadowGraphicsLayerElement.a) && Intrinsics.d(this.b, shadowGraphicsLayerElement.b) && this.c == shadowGraphicsLayerElement.c && d85.c(this.d, shadowGraphicsLayerElement.d) && d85.c(this.e, shadowGraphicsLayerElement.e);
    }

    public final int hashCode() {
        int e = k5r.e((this.b.hashCode() + (Float.hashCode(this.a) * 31)) * 31, 31, this.c);
        int i = d85.o;
        met metVar = net.b;
        return Long.hashCode(this.e) + tlm.c(this.d, e, 31);
    }

    @Override // defpackage.edi
    public final void j(xci xciVar) {
        y43 y43Var = (y43) xciVar;
        y43Var.o = new hxo(7, this);
        f8j f8jVar = bcx.D(y43Var, 2).m;
        if (f8jVar != null) {
            f8jVar.x1(true, y43Var.o);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        vz1.z(this.a, ", shape=", sb);
        sb.append(this.b);
        sb.append(", clip=");
        sb.append(this.c);
        sb.append(", ambientColor=");
        dfi.q(this.d, ", spotColor=", sb);
        sb.append((Object) d85.i(this.e));
        sb.append(')');
        return sb.toString();
    }
}
