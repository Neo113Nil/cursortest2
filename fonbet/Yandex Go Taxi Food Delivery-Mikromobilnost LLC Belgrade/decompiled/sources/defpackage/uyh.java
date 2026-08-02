package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.logistics.cargo_flow.a;

/* loaded from: classes12.dex */
public final class uyh implements cai {
    public final /* synthetic */ d51 A;
    public final /* synthetic */ tls B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ bwb b;
    public final /* synthetic */ String c;
    public final /* synthetic */ lbi w;
    public final /* synthetic */ a x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ ju0 z;

    public uyh(boolean z, bwb bwbVar, String str, lbi lbiVar, a aVar, boolean z2, ju0 ju0Var, d51 d51Var, tls tlsVar, boolean z3) {
        this.a = z;
        this.b = bwbVar;
        this.c = str;
        this.w = lbiVar;
        this.x = aVar;
        this.y = z2;
        this.z = ju0Var;
        this.A = d51Var;
        this.B = tlsVar;
        this.C = z3;
    }

    @Override // defpackage.sy60
    public final void a() {
        if (this.C) {
            this.x.r(new qu(9));
        }
    }

    @Override // defpackage.cai
    public final void d(Address address) {
        if (this.y) {
            a.P(this.x, this.z, address, this.A);
        }
        this.B.invoke(address);
    }

    @Override // defpackage.cai
    public final void w() {
        if (this.a) {
            mu8 mu8Var = new mu8(this.b, this.c, this.w);
            a aVar = this.x;
            aVar.E((m950) aVar.V.get(), mu8Var, new tyh(this.y, this.x, this.z, this.A, this.B), hxx.a);
        }
    }
}
