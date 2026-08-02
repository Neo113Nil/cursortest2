package defpackage;

import android.content.Context;
import com.yandex.go.navigator.analitycs.Screen;
import com.yandex.go.navigator.favorites.building_card.a;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes12.dex */
public final class qs6 extends pgd {
    public final Context F;
    public final w030 G;
    public final ah00 H;
    public final eb50 I;
    public final mu5 J;

    public qs6(bt6 bt6Var, zs6 zs6Var, Context context, w030 w030Var, ah00 ah00Var, eb50 eb50Var) {
        super(0);
        this.F = context;
        this.G = w030Var;
        this.H = ah00Var;
        this.I = eb50Var;
        this.J = new mu5(new a(this, bt6Var, zs6Var));
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        this.I.a = null;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        this.I.a = Screen.BuildingCard;
        dh00.a(this.H, cwa1.d(((ct6) obj).a), 0.0f, null, null, HProv.PP_DELETE_SAVED_PASSWD);
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.J;
    }

    @Override // defpackage.pgd
    public final Context Q() {
        return this.F;
    }

    @Override // defpackage.pgd
    public final w030 S() {
        return this.G;
    }
}
