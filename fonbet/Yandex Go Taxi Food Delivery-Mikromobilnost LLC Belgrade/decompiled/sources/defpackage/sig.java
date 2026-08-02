package defpackage;

import android.content.Context;
import com.yandex.go.address.models.Address;
import com.yandex.go.navigator.incidents.dashboard.a;
import com.yandex.mapkit.geometry.Point;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class sig extends ad5 {
    public final a A;
    public final apv B;
    public final gpv C;
    public final ah00 D;
    public final com.yandex.go.navigator.a E;
    public final tjg F;
    public final vxr G;
    public xm00 H;
    public final Context x;
    public final xjg y;
    public final wjg z;

    public sig(Context context, xjg xjgVar, wjg wjgVar, a aVar, apv apvVar, gpv gpvVar, ah00 ah00Var, com.yandex.go.navigator.a aVar2, tjg tjgVar, vxr vxrVar) {
        super(vjg.class);
        this.x = context;
        this.y = xjgVar;
        this.z = wjgVar;
        this.A = aVar;
        this.B = apvVar;
        this.C = gpvVar;
        this.D = ah00Var;
        this.E = aVar2;
        this.F = tjgVar;
        this.G = vxrVar;
        this.H = new xm00();
        Point point = wjgVar.a;
        Address address = wjgVar.b;
        String D1 = address != null ? address.D1() : null;
        r0 r0Var = aVar.c;
        ekg ekgVar = new ekg(D1, point);
        r0Var.getClass();
        r0Var.m(null, ekgVar);
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        this.G.e.b();
        super.Cg();
        ((gh00) this.D).i.o(this.H);
        this.H.m();
    }
}
