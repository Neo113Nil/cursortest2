package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class jpq implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ npq b;

    public /* synthetic */ jpq(npq npqVar, int i) {
        this.a = i;
        this.b = npqVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                uoq uoqVar = (uoq) this.b.d.getValue();
                lnq lnqVar = new lnq();
                uoqVar.getClass();
                return new gpq(uoqVar, lnqVar);
            case 1:
                return Float.valueOf(this.b.k.e());
            default:
                return Boolean.valueOf(this.b.n.c());
        }
    }
}
