package defpackage;

import java.util.function.Consumer;

/* loaded from: classes6.dex */
public final /* synthetic */ class s26 implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ sls b;

    public /* synthetic */ s26(int i, sls slsVar) {
        this.a = i;
        this.b = slsVar;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.a;
        sls slsVar = this.b;
        switch (i) {
            case 0:
                slsVar.invoke();
                break;
            case 1:
                slsVar.invoke();
                break;
            default:
                slsVar.invoke();
                break;
        }
    }
}
