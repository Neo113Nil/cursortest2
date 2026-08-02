package defpackage;

import com.yandex.go.suggest.impl.view.error.a;

/* loaded from: classes.dex */
public final /* synthetic */ class wn5 implements ujm0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wn5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ujm0
    public final pjm0 get(l1o l1oVar, mjm0 mjm0Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return (pjm0) ((xn5) obj).b.get();
            case 1:
                return (pjm0) ((xn5) obj).b.get();
            case 2:
                a aVar = (a) obj;
                aVar.getClass();
                return new kfw0(aVar);
            case 3:
                hyi hyiVar = (hyi) obj;
                return new b201(l1oVar.d, hyiVar.a, hyiVar.b, l1oVar.c, l1oVar.a);
            default:
                return (pjm0) ((x7y0) ((xn5) obj).b).get();
        }
    }
}
