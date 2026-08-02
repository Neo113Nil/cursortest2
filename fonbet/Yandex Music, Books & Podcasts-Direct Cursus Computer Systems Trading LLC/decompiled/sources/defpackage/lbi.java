package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class lbi extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ bci s;
    public final /* synthetic */ mm6 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lbi(bci bciVar, mm6 mm6Var, int i) {
        super(0);
        this.r = i;
        this.s = bciVar;
        this.t = mm6Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                bci bciVar = this.s;
                if (((Boolean) bciVar.b.d.invoke(cci.a)).booleanValue()) {
                    x97.y(this.t, null, null, new dbi(bciVar, null, 1), 3);
                }
                break;
            case 1:
                bci bciVar2 = this.s;
                if (((Boolean) bciVar2.b.d.invoke(cci.a)).booleanValue()) {
                    x97.y(this.t, null, null, new dbi(bciVar2, null, 2), 3);
                }
                break;
            case 2:
                bci bciVar3 = this.s;
                if (((Boolean) bciVar3.b.d.invoke(cci.b)).booleanValue()) {
                    x97.y(this.t, null, null, new dbi(bciVar3, null, 3), 3);
                }
                break;
            default:
                bci bciVar4 = this.s;
                if (((Boolean) bciVar4.b.d.invoke(cci.c)).booleanValue()) {
                    x97.y(this.t, null, null, new dbi(bciVar4, null, 4), 3);
                }
                break;
        }
        return Boolean.TRUE;
    }
}
