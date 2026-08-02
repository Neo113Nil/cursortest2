package defpackage;

import com.yandex.plus.home.internal.di.b;

/* loaded from: classes2.dex */
public final /* synthetic */ class r42 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ r42(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        b bVar = this.b;
        switch (i) {
            case 0:
                nkd0 nkd0Var = bVar.a.s;
                nkd0Var.getClass();
                Boolean bool = (Boolean) ((lkd0) nkd0Var).t.getValue();
                return Boolean.valueOf(bool != null ? bool.booleanValue() : true);
            default:
                return Boolean.valueOf(bVar.b.h.getValue() instanceof hj);
        }
    }
}
