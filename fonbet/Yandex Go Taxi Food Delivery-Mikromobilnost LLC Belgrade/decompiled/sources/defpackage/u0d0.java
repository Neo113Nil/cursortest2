package defpackage;

import kotlin.a;
import ru.yandex.taxi.network.api.models.GoApiName;
import ru.yandex.taxi.plus.api.PlusApi;

/* loaded from: classes9.dex */
public final class u0d0 {
    public final on2 a;
    public final i3y b;

    public u0d0(on2 on2Var, zv60 zv60Var) {
        this.a = on2Var;
        this.b = a.a(new t9a0(17, zv60Var));
    }

    public final PlusApi a() {
        GoApiName goApiName = GoApiName.Plus;
        gn2 gn2Var = new gn2(2, this);
        on2 on2Var = this.a;
        return (PlusApi) ((apt) on2Var.e.get()).a(goApiName, PlusApi.class, gn2Var, new fn2(on2Var, 0));
    }
}
