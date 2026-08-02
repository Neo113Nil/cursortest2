package defpackage;

import com.yandex.music.shared.player.download2.exo.a;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class sco implements va7 {
    public final oco a;
    public final g7q b;
    public final obo c;
    public final List d;
    public final dpt e;
    public final ywd f;
    public final Function0 g;

    public sco(oco ocoVar, g7q g7qVar, va7 va7Var, obo oboVar, List list, dpt dptVar, ywd ywdVar) {
        rln rlnVar = new rln(6, ywdVar, va7Var);
        list.getClass();
        this.a = ocoVar;
        this.b = g7qVar;
        this.c = oboVar;
        this.d = list;
        this.e = dptVar;
        this.f = ywdVar;
        this.g = rlnVar;
    }

    @Override // defpackage.va7
    public final db7 a() {
        xwd xwdVar = (xwd) this.g.invoke();
        db7 db7Var = xwdVar.d;
        if (db7Var == null) {
            db7Var = xwdVar.b.a();
            db7Var.getClass();
            xwdVar.d = db7Var;
        }
        return new a(this.a, this.b, db7Var, this.c, this.d, this.e, this.f, xwdVar);
    }
}
