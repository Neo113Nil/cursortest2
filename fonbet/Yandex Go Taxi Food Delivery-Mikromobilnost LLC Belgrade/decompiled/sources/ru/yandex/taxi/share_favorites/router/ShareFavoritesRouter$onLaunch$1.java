package ru.yandex.taxi.share_favorites.router;

import defpackage.ljr0;
import defpackage.m950;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ojr0;
import defpackage.qu;
import defpackage.tjr0;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.yio0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.share_favorites.router.ShareFavoritesRouter$onLaunch$1", f = "ShareFavoritesRouter.kt", l = {22}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ShareFavoritesRouter$onLaunch$1 extends SuspendLambda implements wls {
    final /* synthetic */ tjr0 $payload;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareFavoritesRouter$onLaunch$1(a aVar, tjr0 tjr0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$payload = tjr0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShareFavoritesRouter$onLaunch$1(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ShareFavoritesRouter$onLaunch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            tpr tprVar = (tpr) this.this$0.E.b;
            this.label = 1;
            obj = e.A(tprVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        ljr0 ljr0Var = (ljr0) obj;
        if (ljr0Var == null || !ljr0Var.b) {
            a aVar = this.this$0;
            if (aVar.u()) {
                aVar.r(new qu(9));
            } else {
                aVar.i();
            }
        } else {
            a aVar2 = this.this$0;
            m950 m950Var = (m950) aVar2.D.get();
            tjr0 tjr0Var = this.$payload;
            aVar2.A(m950Var, new ojr0(tjr0Var.a, tjr0Var.b, ljr0Var), new yio0(2, this.this$0));
        }
        return zy11.a;
    }
}
