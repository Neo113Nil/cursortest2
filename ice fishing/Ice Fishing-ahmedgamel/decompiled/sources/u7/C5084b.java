package u7;

import z7.C5273j;
import z7.InterfaceC5267d;
import z7.InterfaceC5272i;

/* renamed from: u7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5084b implements InterfaceC5267d {

    /* renamed from: n, reason: collision with root package name */
    public g8.n f41324n;

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC5267d f41325u;

    /* renamed from: v, reason: collision with root package name */
    public Object f41326v;

    @Override // z7.InterfaceC5267d
    public final InterfaceC5272i getContext() {
        return C5273j.f42272n;
    }

    @Override // z7.InterfaceC5267d
    public final void resumeWith(Object obj) {
        this.f41325u = null;
        this.f41326v = obj;
    }
}
