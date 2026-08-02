package defpackage;

import com.yandex.go.payments.acceptance.domain.c;

/* loaded from: classes13.dex */
public final /* synthetic */ class rd implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;
    public final /* synthetic */ String c;

    public /* synthetic */ rd(c cVar, String str, int i) {
        this.a = i;
        this.b = cVar;
        this.c = str;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        String str = this.c;
        c cVar = this.b;
        switch (i) {
            case 0:
                String l = cVar.e.d().l(ff.h(str), null);
                if (l != null) {
                    cVar.g(l);
                    break;
                }
                break;
            case 1:
                cVar.b(str);
                break;
            case 2:
                String l2 = cVar.e.d().l(ff.h(str), null);
                if (l2 != null) {
                    cVar.g(l2);
                    break;
                }
                break;
            case 3:
                String l3 = cVar.e.d().l(ff.h(str), null);
                if (l3 != null) {
                    cVar.g(l3);
                    break;
                }
                break;
            case 4:
                cVar.b(str);
                break;
            default:
                String l4 = cVar.e.d().l(ff.h(str), null);
                if (l4 != null) {
                    cVar.g(l4);
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
