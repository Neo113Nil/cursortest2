package defpackage;

/* loaded from: classes.dex */
public final class i3 extends defpackage.ce1 implements defpackage.k00 {
    public final /* synthetic */ int riuEU0zW4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i3(int i, defpackage.ej ejVar, int i2) {
        super(i, ejVar);
        this.riuEU0zW4 = i2;
    }

    @Override // defpackage.v7
    public final java.lang.Object SyNS6RMn(java.lang.Object obj) {
        int i = this.riuEU0zW4;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        switch (i) {
            case 0:
                defpackage.f70.nBH8hAHy(obj);
                break;
            case 1:
                defpackage.f70.nBH8hAHy(obj);
                break;
            default:
                defpackage.f70.nBH8hAHy(obj);
                break;
        }
        return ok1Var;
    }

    @Override // defpackage.k00
    public final java.lang.Object adDC3e2L(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.riuEU0zW4;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        switch (i) {
            case 0:
                break;
            case 1:
                ((defpackage.i3) ez2rX8ReCYw((defpackage.ej) obj2, (defpackage.hw) obj)).SyNS6RMn(ok1Var);
                break;
            default:
                ((defpackage.i3) ez2rX8ReCYw((defpackage.ej) obj2, (defpackage.iw) obj)).SyNS6RMn(ok1Var);
                break;
        }
        return ok1Var;
    }

    @Override // defpackage.v7
    public final defpackage.ej ez2rX8ReCYw(defpackage.ej ejVar, java.lang.Object obj) {
        switch (this.riuEU0zW4) {
            case 0:
                return new defpackage.i3(2, ejVar, 0);
            case 1:
                return new defpackage.i3(2, ejVar, 1);
            default:
                return new defpackage.i3(2, ejVar, 2);
        }
    }
}
