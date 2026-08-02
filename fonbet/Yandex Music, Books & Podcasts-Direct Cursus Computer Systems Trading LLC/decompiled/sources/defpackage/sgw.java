package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class sgw implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ghw b;

    public /* synthetic */ sgw(ghw ghwVar, int i) {
        this.a = i;
        this.b = ghwVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                this.b.h.invoke();
                break;
            default:
                this.b.h.invoke();
                break;
        }
        return Unit.a;
    }
}
