package defpackage;

import androidx.compose.foundation.gestures.a;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class kxo extends aur implements Function2 {
    public int j;
    public final /* synthetic */ lxo k;
    public final /* synthetic */ float l;
    public final /* synthetic */ float m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kxo(lxo lxoVar, float f, float f2, Continuation continuation) {
        super(2, continuation);
        this.k = lxoVar;
        this.l = f;
        this.m = f2;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new kxo(this.k, this.l, this.m, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((kxo) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.j;
        if (i == 0) {
            qgg.h0(obj);
            iyo iyoVar = this.k.D;
            long floatToRawIntBits = (Float.floatToRawIntBits(this.l) << 32) | (Float.floatToRawIntBits(this.m) & 4294967295L);
            this.j = 1;
            if (a.a(iyoVar, floatToRawIntBits, this) == nm6Var) {
                return nm6Var;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        return Unit.a;
    }
}
