package h0;

import b.AbstractC0116l;
import m0.C0303k;
import m0.InterfaceC0300h;

/* loaded from: classes.dex */
public final class a extends AbstractC0116l implements InterfaceC0300h {

    /* renamed from: d, reason: collision with root package name */
    public final C0303k f3242d;

    public a(C0303k c0303k) {
        super(true);
        this.f3242d = c0303k;
        c0303k.f4092n.add(this);
    }

    @Override // b.AbstractC0116l
    public final void a() {
        this.f3242d.a();
    }
}
