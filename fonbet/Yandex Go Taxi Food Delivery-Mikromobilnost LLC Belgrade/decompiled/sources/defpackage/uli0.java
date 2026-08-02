package defpackage;

import kotlin.coroutines.Continuation;
import ru.yandex.taxi.common_models.net.map_object.d0;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

/* loaded from: classes6.dex */
public final class uli0 implements xsd0 {
    public final rft0 a;
    public final c9l0 b;
    public final ng9 c;
    public final biv0 d;

    public uli0(rft0 rft0Var, c9l0 c9l0Var, ng9 ng9Var, biv0 biv0Var) {
        this.a = rft0Var;
        this.b = c9l0Var;
        this.c = ng9Var;
        this.d = biv0Var;
    }

    @Override // defpackage.xsd0
    public final Object a(wsd0 wsd0Var, Continuation continuation) {
        d0 d0Var = (d0) wsd0Var.getAction();
        SelectionOrigin selectionOrigin = SelectionOrigin.REDIRECT;
        boolean z = true;
        d82 d82Var = new d82(1);
        qa0 qa0Var = new qa0(20, this);
        jpv0 b = this.d.b();
        b.getClass();
        if ((b instanceof fpv0) && !this.b.b()) {
            z = false;
        }
        this.c.a(d0Var, selectionOrigin, d82Var, qa0Var, z);
        return zy11.a;
    }
}
