package androidx.compose.foundation.layout;

import x1.y0;
import y0.m;
import z.z;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class LayoutWeightElement extends y0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f526a;

    public LayoutWeightElement(float f10) {
        this.f526a = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        LayoutWeightElement layoutWeightElement = obj instanceof LayoutWeightElement ? (LayoutWeightElement) obj : null;
        return layoutWeightElement != null && this.f526a == layoutWeightElement.f526a;
    }

    @Override // x1.y0
    public final m f() {
        z zVar = new z();
        zVar.f9046u = this.f526a;
        zVar.f9047v = true;
        return zVar;
    }

    @Override // x1.y0
    public final void g(m mVar) {
        z zVar = (z) mVar;
        zVar.f9046u = this.f526a;
        zVar.f9047v = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (Float.hashCode(this.f526a) * 31);
    }
}
