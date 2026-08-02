package defpackage;

import android.os.Build;

/* loaded from: classes.dex */
public final class bw2 extends jq2 {
    public final /* synthetic */ int b;
    public final int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bw2(r96 r96Var, int i) {
        super(r96Var);
        this.b = i;
        r96Var.getClass();
        switch (i) {
            case 2:
                super(r96Var);
                this.c = 7;
                break;
            case 3:
                super(r96Var);
                this.c = 7;
                break;
            case 4:
                super(r96Var);
                this.c = 9;
                break;
            default:
                this.c = 6;
                break;
        }
    }

    @Override // defpackage.q86
    public final boolean c(t4w t4wVar) {
        int i = this.b;
        t4wVar.getClass();
        switch (i) {
            case 0:
                return t4wVar.j.c;
            case 1:
                return t4wVar.j.e;
            case 2:
                return t4wVar.j.a == g2j.b;
            case 3:
                g2j g2jVar = t4wVar.j.a;
                return g2jVar == g2j.c || (Build.VERSION.SDK_INT >= 30 && g2jVar == g2j.f);
            default:
                return t4wVar.j.f;
        }
    }

    @Override // defpackage.jq2
    public final int d() {
        switch (this.b) {
        }
        return this.c;
    }

    @Override // defpackage.jq2
    public final boolean e(Object obj) {
        boolean booleanValue;
        switch (this.b) {
            case 0:
                booleanValue = ((Boolean) obj).booleanValue();
                break;
            case 1:
                booleanValue = ((Boolean) obj).booleanValue();
                break;
            case 2:
                q1j q1jVar = (q1j) obj;
                q1jVar.getClass();
                int i = Build.VERSION.SDK_INT;
                boolean z = q1jVar.a;
                return i < 26 ? !z : !(z && q1jVar.b);
            case 3:
                q1j q1jVar2 = (q1j) obj;
                q1jVar2.getClass();
                return !q1jVar2.a || q1jVar2.c;
            default:
                booleanValue = ((Boolean) obj).booleanValue();
                break;
        }
        return !booleanValue;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bw2(cw2 cw2Var) {
        super(cw2Var);
        this.b = 1;
        cw2Var.getClass();
        this.c = 5;
    }
}
