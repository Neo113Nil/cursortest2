package b6;

import android.content.Context;
import c6.l;
import c6.m;
import c6.n;
import d8.s;
import p6.i;
import w5.o;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class g implements y5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1037a;

    /* renamed from: b, reason: collision with root package name */
    public final zb.a f1038b;

    /* renamed from: c, reason: collision with root package name */
    public final zb.a f1039c;

    /* renamed from: d, reason: collision with root package name */
    public final y5.b f1040d;

    public /* synthetic */ g(zb.a aVar, zb.a aVar2, y5.b bVar, int i10) {
        this.f1037a = i10;
        this.f1038b = aVar;
        this.f1039c = aVar2;
        this.f1040d = bVar;
    }

    @Override // zb.a
    public final Object get() {
        switch (this.f1037a) {
            case 0:
                return new a5.c((Context) this.f1038b.get(), (d6.d) this.f1039c.get(), (c6.b) ((f) this.f1040d).get());
            default:
                return new o(new i(), new m6.i(6), (e) ((d) this.f1038b).get(), (l) ((m) this.f1039c).get(), (s) ((n) this.f1040d).get());
        }
    }
}
