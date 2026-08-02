package defpackage;

import android.content.SharedPreferences;

/* loaded from: classes4.dex */
public final class xp2 implements rzm {
    public final /* synthetic */ int a = 1;
    public final szm b;
    public final szm c;
    public final szm d;
    public final rzm e;

    public xp2(l48 l48Var, rzm rzmVar, rzm rzmVar2, toe toeVar, rzm rzmVar3) {
        this.b = rzmVar;
        this.c = rzmVar2;
        this.d = toeVar;
        this.e = rzmVar3;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                l9i l9iVar = (l9i) this.b.get();
                jeq jeqVar = (jeq) this.c.get();
                vfk vfkVar = (vfk) this.e.get();
                g0c g0cVar = (g0c) this.d.get();
                l9iVar.getClass();
                jeqVar.getClass();
                vfkVar.getClass();
                g0cVar.getClass();
                return new fjn(l9iVar, jeqVar, g0cVar, vfkVar);
            default:
                n23 n23Var = (n23) this.b.get();
                t23 t23Var = (t23) this.c.get();
                gek gekVar = (gek) this.d.get();
                SharedPreferences sharedPreferences = (SharedPreferences) this.e.get();
                n23Var.getClass();
                t23Var.getClass();
                gekVar.getClass();
                sharedPreferences.getClass();
                return new w03(n23Var, t23Var, gekVar, sharedPreferences);
        }
    }

    public xp2(mvn mvnVar, rzm rzmVar, toe toeVar, rzm rzmVar2, toe toeVar2) {
        this.b = rzmVar;
        this.c = toeVar;
        this.e = rzmVar2;
        this.d = toeVar2;
    }
}
