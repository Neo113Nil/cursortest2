package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;

/* loaded from: classes10.dex */
public final class r74 extends k590 {
    public final Object a;
    public final dlo b;
    public final int c;
    public final Size d;
    public final Rect e;
    public final int f;
    public final Matrix g;
    public final ap7 h;

    public r74(Object obj, dlo dloVar, int i, Size size, Rect rect, int i2, Matrix matrix, ap7 ap7Var) {
        if (obj == null) {
            ny61.t("Null data");
            throw null;
        }
        this.a = obj;
        this.b = dloVar;
        this.c = i;
        if (size == null) {
            ny61.t("Null size");
            throw null;
        }
        this.d = size;
        if (rect == null) {
            ny61.t("Null cropRect");
            throw null;
        }
        this.e = rect;
        this.f = i2;
        if (matrix == null) {
            ny61.t("Null sensorToBufferTransform");
            throw null;
        }
        this.g = matrix;
        if (ap7Var != null) {
            this.h = ap7Var;
        } else {
            ny61.t("Null cameraCaptureResult");
            throw null;
        }
    }

    @Override // defpackage.k590
    public final ap7 a() {
        return this.h;
    }

    @Override // defpackage.k590
    public final Rect b() {
        return this.e;
    }

    @Override // defpackage.k590
    public final Object c() {
        return this.a;
    }

    @Override // defpackage.k590
    public final dlo d() {
        return this.b;
    }

    @Override // defpackage.k590
    public final int e() {
        return this.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        if (r4.d() == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k590) {
            k590 k590Var = (k590) obj;
            if (this.a.equals(k590Var.c())) {
                dlo dloVar = this.b;
                if (dloVar != null) {
                    if (dloVar != k590Var.d()) {
                        return false;
                    }
                }
                if (this.c == k590Var.e() && this.d.equals(k590Var.h()) && this.e.equals(k590Var.b()) && this.f == k590Var.f() && this.g.equals(k590Var.g()) && this.h.equals(k590Var.a())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.k590
    public final int f() {
        return this.f;
    }

    @Override // defpackage.k590
    public final Matrix g() {
        return this.g;
    }

    @Override // defpackage.k590
    public final Size h() {
        return this.d;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        dlo dloVar = this.b;
        return this.h.hashCode() ^ ((((((((((((hashCode ^ (dloVar == null ? 0 : dloVar.hashCode())) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f) * 1000003) ^ this.g.hashCode()) * 1000003);
    }

    public final String toString() {
        return "Packet{data=" + this.a + ", exif=" + this.b + ", format=" + this.c + ", size=" + this.d + ", cropRect=" + this.e + ", rotationDegrees=" + this.f + ", sensorToBufferTransform=" + this.g + ", cameraCaptureResult=" + this.h + "}";
    }
}
