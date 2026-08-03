package b0;

import m0.l1;
import m0.w2;
import m0.z0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class y implements w2 {

    /* renamed from: g, reason: collision with root package name */
    public final l1 f930g;

    /* renamed from: h, reason: collision with root package name */
    public int f931h;

    public y(int i10) {
        int i11 = (i10 / 30) * 30;
        this.f930g = new l1(uc.e.q(Math.max(i11 - 100, 0), i11 + 130), z0.f4844l);
        this.f931h = i10;
    }

    @Override // m0.w2
    public final Object getValue() {
        return (uc.d) this.f930g.getValue();
    }
}
