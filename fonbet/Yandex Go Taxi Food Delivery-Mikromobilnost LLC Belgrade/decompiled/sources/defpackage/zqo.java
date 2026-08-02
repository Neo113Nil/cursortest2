package defpackage;

import java.util.ArrayList;

/* loaded from: classes15.dex */
public final /* synthetic */ class zqo implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ bro b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ zqo(bro broVar, ArrayList arrayList, int i) {
        this.a = i;
        this.b = broVar;
        this.c = arrayList;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        ArrayList arrayList = this.c;
        bro broVar = this.b;
        oll0 oll0Var = (oll0) obj;
        switch (i) {
            case 0:
                broVar.b.c(oll0Var, arrayList);
                return null;
            default:
                super/*yqo*/.e(arrayList);
                return zy11.a;
        }
    }
}
