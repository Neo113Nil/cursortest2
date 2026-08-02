package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class vow implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ epw b;

    public /* synthetic */ vow(epw epwVar, int i) {
        this.a = i;
        this.b = epwVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new wow(false, this.b.a().b());
            case 1:
                return (faq) this.b.k.getValue();
            default:
                return new wow(true, this.b.a().b());
        }
    }
}
