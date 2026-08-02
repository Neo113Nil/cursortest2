package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class q2q implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cr b;

    public /* synthetic */ q2q(cr crVar, int i) {
        this.a = i;
        this.b = crVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new f4i(((Number) ((ozi) this.b.b).d.invoke()).intValue());
            default:
                return new dkn((xpi) ((lxf) this.b.c).b.getValue());
        }
    }
}
