package defpackage;

/* loaded from: classes.dex */
public final class bl extends defpackage.ce1 implements defpackage.g00 {
    public int riuEU0zW4;

    @Override // defpackage.g00
    public final java.lang.Object AARZUJiTa(java.lang.Object obj) {
        defpackage.bl blVar = new defpackage.bl(1, (defpackage.ej) obj);
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        blVar.SyNS6RMn(ok1Var);
        return ok1Var;
    }

    @Override // defpackage.v7
    public final java.lang.Object SyNS6RMn(java.lang.Object obj) {
        int i = this.riuEU0zW4;
        if (i == 0) {
            defpackage.f70.nBH8hAHy(obj);
            this.riuEU0zW4 = 1;
            throw null;
        }
        if (i == 1) {
            defpackage.f70.nBH8hAHy(obj);
            return defpackage.ok1.IHQe1A4L2xu;
        }
        defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
