package androidx.compose.ui.graphics;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.a7t;
import defpackage.bcx;
import defpackage.d85;
import defpackage.dfi;
import defpackage.dup;
import defpackage.edi;
import defpackage.eta;
import defpackage.f8j;
import defpackage.hxo;
import defpackage.k5r;
import defpackage.met;
import defpackage.net;
import defpackage.tlm;
import defpackage.wiq;
import defpackage.xci;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/GraphicsLayerElement;", "Ledi;", "Lwiq;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
final /* data */ class GraphicsLayerElement extends edi {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final long f;
    public final dup g;
    public final boolean h;
    public final long i;
    public final long j;
    public final int k;

    public GraphicsLayerElement(float f, float f2, float f3, float f4, float f5, long j, dup dupVar, boolean z, long j2, long j3, int i) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = j;
        this.g = dupVar;
        this.h = z;
        this.i = j2;
        this.j = j3;
        this.k = i;
    }

    @Override // defpackage.edi
    public final xci e() {
        wiq wiqVar = new wiq();
        wiqVar.o = this.a;
        wiqVar.p = this.b;
        wiqVar.q = this.c;
        wiqVar.r = this.d;
        wiqVar.s = this.e;
        wiqVar.t = 8.0f;
        wiqVar.u = this.f;
        wiqVar.v = this.g;
        wiqVar.w = this.h;
        wiqVar.x = this.i;
        wiqVar.y = this.j;
        wiqVar.z = this.k;
        wiqVar.A = new hxo(8, wiqVar);
        return wiqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphicsLayerElement)) {
            return false;
        }
        GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
        return Float.compare(this.a, graphicsLayerElement.a) == 0 && Float.compare(this.b, graphicsLayerElement.b) == 0 && Float.compare(this.c, graphicsLayerElement.c) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.d, graphicsLayerElement.d) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.e, graphicsLayerElement.e) == 0 && Float.compare(8.0f, 8.0f) == 0 && a7t.a(this.f, graphicsLayerElement.f) && Intrinsics.d(this.g, graphicsLayerElement.g) && this.h == graphicsLayerElement.h && d85.c(this.i, graphicsLayerElement.i) && d85.c(this.j, graphicsLayerElement.j) && this.k == graphicsLayerElement.k;
    }

    public final int hashCode() {
        int a = eta.a(eta.a(eta.a(eta.a(eta.a(eta.a(eta.a(eta.a(eta.a(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31), 0.0f, 31), 0.0f, 31), this.d, 31), 0.0f, 31), 0.0f, 31), this.e, 31), 8.0f, 31);
        int i = a7t.c;
        int e = k5r.e((this.g.hashCode() + tlm.c(this.f, a, 31)) * 31, 961, this.h);
        int i2 = d85.o;
        met metVar = net.b;
        return Integer.hashCode(this.k) + tlm.c(this.j, tlm.c(this.i, e, 31), 31);
    }

    @Override // defpackage.edi
    public final void j(xci xciVar) {
        wiq wiqVar = (wiq) xciVar;
        wiqVar.o = this.a;
        wiqVar.p = this.b;
        wiqVar.q = this.c;
        wiqVar.r = this.d;
        wiqVar.s = this.e;
        wiqVar.t = 8.0f;
        wiqVar.u = this.f;
        wiqVar.v = this.g;
        wiqVar.w = this.h;
        wiqVar.x = this.i;
        wiqVar.y = this.j;
        wiqVar.z = this.k;
        f8j f8jVar = bcx.D(wiqVar, 2).m;
        if (f8jVar != null) {
            f8jVar.x1(true, wiqVar.A);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicsLayerElement(scaleX=");
        sb.append(this.a);
        sb.append(", scaleY=");
        sb.append(this.b);
        sb.append(", alpha=");
        sb.append(this.c);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.d);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=");
        sb.append(this.e);
        sb.append(", cameraDistance=8.0, transformOrigin=");
        sb.append((Object) a7t.d(this.f));
        sb.append(", shape=");
        sb.append(this.g);
        sb.append(", clip=");
        sb.append(this.h);
        sb.append(", renderEffect=null, ambientShadowColor=");
        dfi.q(this.i, ", spotShadowColor=", sb);
        dfi.q(this.j, ", compositingStrategy=", sb);
        sb.append((Object) ("CompositingStrategy(value=" + this.k + ')'));
        sb.append(')');
        return sb.toString();
    }
}
