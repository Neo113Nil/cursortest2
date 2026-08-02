package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class dqj implements rrf {
    public final /* synthetic */ int a = 1;
    public final wn5 b;
    public final /* synthetic */ rrf c;

    public dqj(rrf rrfVar, Function1 function1, Function1 function12, Function0 function0, Function0 function02) {
        this.c = rrfVar;
        this.b = new wn5(new pli(function1, function12, function0, function02, rrfVar, 4), 906074625, true);
    }

    @Override // defpackage.rrf
    public final Function0 a() {
        switch (this.a) {
            case 0:
                return this.c.a();
            default:
                return ((g73) this.c).e;
        }
    }

    @Override // defpackage.rrf
    public final cma b() {
        switch (this.a) {
            case 0:
                return this.c.b();
            default:
                return ((g73) this.c).d;
        }
    }

    @Override // defpackage.rrf
    public final String getId() {
        switch (this.a) {
            case 0:
                return this.c.getId();
            default:
                return ((g73) this.c).a;
        }
    }

    @Override // defpackage.rrf
    public final String getType() {
        switch (this.a) {
            case 0:
                return this.c.getType();
            default:
                return ((g73) this.c).b;
        }
    }

    @Override // defpackage.rrf
    public final Function2 getUi() {
        switch (this.a) {
        }
        return this.b;
    }

    public dqj(g73 g73Var, yci yciVar, sdr sdrVar, String str, String str2, Function0 function0) {
        this.c = g73Var;
        this.b = new wn5(new pr(g73Var, yciVar, sdrVar, str, str2, function0), 16251160, true);
    }
}
