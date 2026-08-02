package defpackage;

/* loaded from: classes3.dex */
public final class fp4 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ fp4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final ia a(x1u x1uVar) {
        int i = this.a;
        x1uVar.getClass();
        switch (i) {
            case 0:
                int ordinal = ((yyb) ((ezb) ((wyb) this.b)).d.a.getValue()).ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        b6e.s();
                        return null;
                    }
                    if (x1uVar.i) {
                        return ga.a;
                    }
                }
                return ea.a;
            default:
                return ((z66) ((jyr) this.b).getValue()).g() ? ea.a : new fa(new IllegalStateException("Network is unavailable for videoclip play"));
        }
    }
}
