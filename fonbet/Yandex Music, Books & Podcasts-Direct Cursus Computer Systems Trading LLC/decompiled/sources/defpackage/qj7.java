package defpackage;

import com.yandex.pulse.mvi.tracker.TimeToInteractiveTracker;

/* loaded from: classes.dex */
public final /* synthetic */ class qj7 implements ycg, zqr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;

    public /* synthetic */ qj7(eai eaiVar, long j, long j2, fai faiVar) {
        this.a = 2;
        this.b = eaiVar;
        this.d = j;
        this.e = j2;
        this.c = faiVar;
    }

    @Override // defpackage.zqr
    public Object get() {
        eai eaiVar = (eai) this.b;
        fai faiVar = (fai) this.c;
        bai baiVar = new bai(eaiVar, 5);
        pwg pwgVar = eaiVar.g;
        boolean z = eaiVar.h;
        faiVar.getClass();
        return new TimeToInteractiveTracker(baiVar, pwgVar, this.d, this.e, z);
    }

    @Override // defpackage.ycg
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                c80 c80Var = (c80) this.b;
                String str = (String) this.c;
                d80 d80Var = (d80) obj;
                d80Var.getClass();
                d80Var.L(c80Var, str, this.e, this.d);
                break;
            default:
                c80 c80Var2 = (c80) this.b;
                String str2 = (String) this.c;
                d80 d80Var2 = (d80) obj;
                d80Var2.getClass();
                d80Var2.Q(c80Var2, str2, this.e, this.d);
                break;
        }
    }

    public /* synthetic */ qj7(c80 c80Var, String str, long j, long j2, int i) {
        this.a = i;
        this.b = c80Var;
        this.c = str;
        this.d = j;
        this.e = j2;
    }
}
