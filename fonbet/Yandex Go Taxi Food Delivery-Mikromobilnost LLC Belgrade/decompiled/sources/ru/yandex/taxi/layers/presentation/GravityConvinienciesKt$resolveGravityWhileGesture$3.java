package ru.yandex.taxi.layers.presentation;

import com.yandex.go.layers.api.model.MapObjectComponentType;
import defpackage.dn00;
import defpackage.f4c0;
import defpackage.lm00;
import defpackage.lz2;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.pp60;
import defpackage.tse;
import defpackage.wls;
import defpackage.ym00;
import defpackage.ym91;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.presentation.GravityConvinienciesKt$resolveGravityWhileGesture$3", f = "GravityConviniencies.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class GravityConvinienciesKt$resolveGravityWhileGesture$3 extends SuspendLambda implements wls {
    final /* synthetic */ lm00 $alreadyGravitational;
    final /* synthetic */ lm00 $newGravitational;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GravityConvinienciesKt$resolveGravityWhileGesture$3(lm00 lm00Var, lm00 lm00Var2, Continuation continuation) {
        super(2, continuation);
        this.$alreadyGravitational = lm00Var;
        this.$newGravitational = lm00Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GravityConvinienciesKt$resolveGravityWhileGesture$3(this.$alreadyGravitational, this.$newGravitational, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        GravityConvinienciesKt$resolveGravityWhileGesture$3 gravityConvinienciesKt$resolveGravityWhileGesture$3 = (GravityConvinienciesKt$resolveGravityWhileGesture$3) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        gravityConvinienciesKt$resolveGravityWhileGesture$3.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        lm00 lm00Var = this.$alreadyGravitational;
        if (lm00Var != null) {
            ym00 b = dn00.b(lm00Var, MapObjectComponentType.BODY);
            f4c0 g = b != null ? b.g() : null;
            if (g != null) {
                Object obj2 = g.d;
                if (!(obj2 instanceof pp60)) {
                    obj2 = null;
                }
                pp60 pp60Var = (pp60) obj2;
                if (pp60Var == null) {
                    pp60Var = oyr.c(g);
                }
                pp60Var.c = GravityState.DOWN;
            }
            if (g != null) {
                ym91.a(g, ((lz2) kotlin.collections.a.O(b.a())).k);
            }
        }
        lm00 lm00Var2 = this.$newGravitational;
        if (lm00Var2 != null && !lm00Var2.g) {
            ym00 b2 = dn00.b(lm00Var2, MapObjectComponentType.BODY);
            f4c0 g2 = b2 != null ? b2.g() : null;
            if (g2 != null) {
                Object obj3 = g2.d;
                pp60 pp60Var2 = (pp60) (obj3 instanceof pp60 ? obj3 : null);
                if (pp60Var2 == null) {
                    pp60Var2 = oyr.c(g2);
                }
                pp60Var2.c = GravityState.UP;
            }
            if (g2 != null) {
                ym91.a(g2, this.$newGravitational.d.b * ((lz2) kotlin.collections.a.O(b2.a())).k);
            }
        }
        return zy11.a;
    }
}
