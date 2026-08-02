package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.navigator.main_screen.o;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes12.dex */
public final class vb00 implements pf50 {
    public final /* synthetic */ o a;

    public vb00(o oVar) {
        this.a = oVar;
    }

    @Override // defpackage.pf50
    public final void V() {
    }

    @Override // defpackage.sy60
    public final void a() {
        this.a.R(false);
    }

    @Override // defpackage.pf50
    public final void p0(pv0 pv0Var) {
        Address address = pv0Var.a;
        o oVar = this.a;
        oVar.P.e = true;
        oVar.E.b(new oe50(address));
        dh00.a(oVar.U, cwa1.d(address.getAddress().a), 0.0f, null, null, HProv.PP_DELETE_SAVED_PASSWD);
        oVar.R(false);
    }
}
