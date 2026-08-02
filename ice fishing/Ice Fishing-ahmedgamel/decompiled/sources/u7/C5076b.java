package u7;

import z7.C5246j;
import z7.InterfaceC5240d;
import z7.InterfaceC5245i;

/* renamed from: u7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5076b implements InterfaceC5240d {

    /* renamed from: n, reason: collision with root package name */
    public g8.n f41044n;

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC5240d f41045u;

    /* renamed from: v, reason: collision with root package name */
    public Object f41046v;

    @Override // z7.InterfaceC5240d
    public final InterfaceC5245i getContext() {
        return C5246j.f42241n;
    }

    @Override // z7.InterfaceC5240d
    public final void resumeWith(Object obj) {
        this.f41045u = null;
        this.f41046v = obj;
    }
}
