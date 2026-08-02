package androidx.compose.foundation.layout;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.cma;
import defpackage.edi;
import defpackage.eta;
import defpackage.xci;
import defpackage.zmq;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/SizeElement;", "Ledi;", "Lzmq;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
final class SizeElement extends edi {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final boolean e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ SizeElement(float f, float f2, float f3, float f4, boolean z, int i) {
        this(f, f2, f3, r7, r8);
        boolean z2;
        float f5;
        f = (i & 1) != 0 ? Float.NaN : f;
        f2 = (i & 2) != 0 ? Float.NaN : f2;
        f3 = (i & 4) != 0 ? Float.NaN : f3;
        if ((i & 8) != 0) {
            z2 = z;
            f5 = Float.NaN;
        } else {
            z2 = z;
            f5 = f4;
        }
    }

    @Override // defpackage.edi
    public final xci e() {
        zmq zmqVar = new zmq();
        zmqVar.o = this.a;
        zmqVar.p = this.b;
        zmqVar.q = this.c;
        zmqVar.r = this.d;
        zmqVar.s = this.e;
        return zmqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) obj;
        return cma.a(this.a, sizeElement.a) && cma.a(this.b, sizeElement.b) && cma.a(this.c, sizeElement.c) && cma.a(this.d, sizeElement.d) && this.e == sizeElement.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + eta.a(eta.a(eta.a(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31);
    }

    @Override // defpackage.edi
    public final void j(xci xciVar) {
        zmq zmqVar = (zmq) xciVar;
        zmqVar.o = this.a;
        zmqVar.p = this.b;
        zmqVar.q = this.c;
        zmqVar.r = this.d;
        zmqVar.s = this.e;
    }

    public SizeElement(float f, float f2, float f3, float f4, boolean z) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = z;
    }
}
