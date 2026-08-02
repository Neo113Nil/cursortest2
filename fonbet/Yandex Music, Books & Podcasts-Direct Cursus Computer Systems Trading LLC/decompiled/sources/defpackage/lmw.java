package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class lmw implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ nmw b;

    public /* synthetic */ lmw(nmw nmwVar, int i) {
        this.a = i;
        this.b = nmwVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return Long.valueOf(((qmw) this.b.y().b().f.getValue()).b);
            case 1:
                return (qfw) this.b.a.g.getValue();
            case 2:
                nmw nmwVar = this.b;
                wlw wlwVar = nmwVar.a;
                return new epw(wlwVar.b(), (qfw) wlwVar.g.getValue(), nmwVar.b);
            default:
                return Long.valueOf(((qmw) this.b.y().b().f.getValue()).a);
        }
    }
}
