package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class fv4 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fnb b;
    public final /* synthetic */ cvo c;

    public /* synthetic */ fv4(yz4 yz4Var, fnb fnbVar, cvo cvoVar) {
        this.a = 1;
        this.b = fnbVar;
        this.c = cvoVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 1:
                yz4.G();
                cvo cvoVar = this.c;
                cvoVar.getClass();
                break;
        }
        return new tnb(this.c, this.b, null, 28);
    }

    public /* synthetic */ fv4(int i, fnb fnbVar, cvo cvoVar) {
        this.a = i;
        this.c = cvoVar;
        this.b = fnbVar;
    }
}
