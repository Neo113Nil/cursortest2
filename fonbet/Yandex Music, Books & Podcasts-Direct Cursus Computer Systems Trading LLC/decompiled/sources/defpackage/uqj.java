package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public final /* synthetic */ class uqj extends ezc implements pyc {
    public static final uqj a = new uqj(3, vqj.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        vqj vqjVar = (vqj) obj;
        acp acpVar = (acp) obj2;
        long j = vqjVar.a;
        if (j <= 0) {
            acpVar.e = Unit.a;
        } else {
            zvh zvhVar = new zvh(9, acpVar, vqjVar);
            acpVar.getClass();
            CoroutineContext coroutineContext = acpVar.a;
            acpVar.c = y2x.v(coroutineContext).S(j, zvhVar, coroutineContext);
        }
        return Unit.a;
    }
}
