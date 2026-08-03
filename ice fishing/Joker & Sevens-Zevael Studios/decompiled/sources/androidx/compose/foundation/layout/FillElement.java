package androidx.compose.foundation.layout;

import v.f;
import x1.y0;
import y0.m;
import z.u;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class FillElement extends y0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f524a;

    /* renamed from: b, reason: collision with root package name */
    public final float f525b;

    public FillElement(int i10, float f10) {
        this.f524a = i10;
        this.f525b = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FillElement)) {
            return false;
        }
        FillElement fillElement = (FillElement) obj;
        return this.f524a == fillElement.f524a && this.f525b == fillElement.f525b;
    }

    @Override // x1.y0
    public final m f() {
        u uVar = new u();
        uVar.f9033u = this.f524a;
        uVar.f9034v = this.f525b;
        return uVar;
    }

    @Override // x1.y0
    public final void g(m mVar) {
        u uVar = (u) mVar;
        uVar.f9033u = this.f524a;
        uVar.f9034v = this.f525b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f525b) + (f.d(this.f524a) * 31);
    }
}
