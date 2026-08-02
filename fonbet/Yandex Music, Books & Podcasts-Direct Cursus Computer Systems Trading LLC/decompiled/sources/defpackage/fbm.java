package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class fbm implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ jbm b;

    public /* synthetic */ fbm(jbm jbmVar, int i) {
        this.a = i;
        this.b = jbmVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                jbm jbmVar = this.b;
                jbmVar.b.a((oq) obj, jbmVar.c.g, new bml(1, jbmVar.d.b(), tnb.class, "reportDomainObjectDeeplinkStarted", "reportDomainObjectDeeplinkStarted(Ljava/lang/String;)V", 0, 9));
                break;
            case 1:
                final jbm jbmVar2 = this.b;
                final int i = 0;
                final int i2 = 1;
                jbmVar2.b.c((oq) obj, new Function0() { // from class: gbm
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i) {
                            case 0:
                                jbmVar2.a.K(true);
                                break;
                            default:
                                jbmVar2.a.K(false);
                                break;
                        }
                        return Unit.a;
                    }
                }, new Function0() { // from class: gbm
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i2) {
                            case 0:
                                jbmVar2.a.K(true);
                                break;
                            default:
                                jbmVar2.a.K(false);
                                break;
                        }
                        return Unit.a;
                    }
                });
                break;
            default:
                this.b.b.a.finish();
                break;
        }
        return Unit.a;
    }
}
