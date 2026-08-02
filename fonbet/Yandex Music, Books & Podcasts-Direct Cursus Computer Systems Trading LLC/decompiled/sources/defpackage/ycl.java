package defpackage;

import android.animation.ObjectAnimator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import ru.yandex.music.player.a;

/* loaded from: classes3.dex */
public final class ycl extends aur implements Function2 {
    public /* synthetic */ float j;
    public final /* synthetic */ ja0 k;
    public final /* synthetic */ adl l;
    public final /* synthetic */ float m;
    public final /* synthetic */ float n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ycl(ja0 ja0Var, adl adlVar, float f, float f2, Continuation continuation) {
        super(2, continuation);
        this.k = ja0Var;
        this.l = adlVar;
        this.m = f;
        this.n = f2;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        ycl yclVar = new ycl(this.k, this.l, this.m, this.n, continuation);
        yclVar.j = ((Number) obj).floatValue();
        return yclVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ycl) create(Float.valueOf(((Number) obj).floatValue()), (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        float f = this.j;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        float D = zc4.D(this.k);
        adl adlVar = this.l;
        cjl cjlVar = adlVar.p;
        float f2 = this.m;
        float f3 = this.n;
        aal aalVar = f == f2 ? aal.b : (f <= f2 || f >= f3) ? f == f3 ? aal.c : aal.a : aal.d;
        xdr xdrVar = cjlVar.b;
        xdrVar.getClass();
        xdrVar.m(null, aalVar);
        xdr xdrVar2 = cjlVar.c;
        Float valueOf = Float.valueOf(D);
        xdrVar2.getClass();
        xdrVar2.m(null, valueOf);
        int ordinal = aalVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
                b6e.s();
                return null;
            }
            int d = yhn.d(eeh.b(f3 - f), 0, (int) f3);
            ssd l = adlVar.l();
            mjl mjlVar = l instanceof mjl ? (mjl) l : null;
            if (mjlVar != null) {
                ((a) mjlVar).E(d, D);
            }
            if (D > 0.0f) {
                ObjectAnimator objectAnimator = adlVar.r;
                if (objectAnimator != null) {
                    objectAnimator.cancel();
                }
                adlVar.r = null;
            }
        }
        return Unit.a;
    }
}
