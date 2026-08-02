package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class z84 extends b8x0 {
    public final Executor c;
    public final t8v d;
    public final u8v e;
    public final r1s f;
    public final Rect g;
    public final Matrix h;
    public final int i;
    public final int j;
    public final int k;
    public final boolean l;
    public final List m;

    public z84(Executor executor, t8v t8vVar, u8v u8vVar, r1s r1sVar, Rect rect, Matrix matrix, int i, int i2, int i3, boolean z, List list) {
        if (executor == null) {
            ny61.t("Null appExecutor");
            throw null;
        }
        this.c = executor;
        this.d = t8vVar;
        this.e = u8vVar;
        this.f = r1sVar;
        this.g = rect;
        if (matrix == null) {
            ny61.t("Null sensorToBufferTransform");
            throw null;
        }
        this.h = matrix;
        this.i = i;
        this.j = i2;
        this.k = i3;
        this.l = z;
        if (list != null) {
            this.m = list;
        } else {
            ny61.t("Null sessionConfigCameraCaptureCallbacks");
            throw null;
        }
    }

    @Override // defpackage.b8x0
    public final Executor a() {
        return this.c;
    }

    @Override // defpackage.b8x0
    public final int b() {
        return this.k;
    }

    @Override // defpackage.b8x0
    public final Rect c() {
        return this.g;
    }

    @Override // defpackage.b8x0
    public final t8v d() {
        return this.d;
    }

    @Override // defpackage.b8x0
    public final int e() {
        return this.j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        if (r4.g() == null) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        t8v t8vVar;
        u8v u8vVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof b8x0) {
            b8x0 b8x0Var = (b8x0) obj;
            if (this.c.equals(b8x0Var.a()) && ((t8vVar = this.d) != null ? t8vVar.equals(b8x0Var.d()) : b8x0Var.d() == null) && ((u8vVar = this.e) != null ? u8vVar.equals(b8x0Var.f()) : b8x0Var.f() == null)) {
                r1s r1sVar = this.f;
                if (r1sVar != null) {
                    if (r1sVar != b8x0Var.g()) {
                        return false;
                    }
                }
                if (b8x0Var.i() == null && this.g.equals(b8x0Var.c()) && this.h.equals(b8x0Var.j()) && this.i == b8x0Var.h() && this.j == b8x0Var.e() && this.k == b8x0Var.b() && this.l == b8x0Var.m() && this.m.equals(b8x0Var.k())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.b8x0
    public final u8v f() {
        return this.e;
    }

    @Override // defpackage.b8x0
    public final r1s g() {
        return this.f;
    }

    @Override // defpackage.b8x0
    public final int h() {
        return this.i;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() ^ 1000003) * 1000003;
        t8v t8vVar = this.d;
        int hashCode2 = (hashCode ^ (t8vVar == null ? 0 : t8vVar.hashCode())) * 1000003;
        u8v u8vVar = this.e;
        int hashCode3 = (hashCode2 ^ (u8vVar == null ? 0 : u8vVar.hashCode())) * 1000003;
        r1s r1sVar = this.f;
        return this.m.hashCode() ^ ((((((((((((((hashCode3 ^ (r1sVar != null ? r1sVar.hashCode() : 0)) * (-721379959)) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i) * 1000003) ^ this.j) * 1000003) ^ this.k) * 1000003) ^ (this.l ? 1231 : 1237)) * 1000003);
    }

    @Override // defpackage.b8x0
    public final r1s i() {
        return null;
    }

    @Override // defpackage.b8x0
    public final Matrix j() {
        return this.h;
    }

    @Override // defpackage.b8x0
    public final List k() {
        return this.m;
    }

    @Override // defpackage.b8x0
    public final boolean m() {
        return this.l;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TakePictureRequest{appExecutor=");
        sb.append(this.c);
        sb.append(", inMemoryCallback=");
        sb.append(this.d);
        sb.append(", onDiskCallback=");
        sb.append(this.e);
        sb.append(", outputFileOptions=");
        sb.append(this.f);
        sb.append(", secondaryOutputFileOptions=null, cropRect=");
        sb.append(this.g);
        sb.append(", sensorToBufferTransform=");
        sb.append(this.h);
        sb.append(", rotationDegrees=");
        sb.append(this.i);
        sb.append(", jpegQuality=");
        sb.append(this.j);
        sb.append(", captureMode=");
        sb.append(this.k);
        sb.append(", simultaneousCapture=");
        sb.append(this.l);
        sb.append(", sessionConfigCameraCaptureCallbacks=");
        return ly3.s(sb, this.m, "}");
    }
}
