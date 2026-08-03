package d6;

import android.content.Context;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class k implements y5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1707a;

    /* renamed from: b, reason: collision with root package name */
    public final zb.a f1708b;

    /* renamed from: c, reason: collision with root package name */
    public final zb.a f1709c;

    public /* synthetic */ k(zb.a aVar, zb.a aVar2, int i10) {
        this.f1707a = i10;
        this.f1708b = aVar;
        this.f1709c = aVar2;
    }

    @Override // zb.a
    public final Object get() {
        switch (this.f1707a) {
            case 0:
                return new j(new p6.i(), new m6.i(6), a.f1685f, (m) this.f1708b.get(), this.f1709c);
            default:
                return new x5.e((Context) ((x5.d) this.f1708b).f8365b, (a5.c) ((x5.d) this.f1709c).get());
        }
    }
}
