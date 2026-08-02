package ru.yandex.taxi.summary.requirements.list.interactors;

import defpackage.dj3;
import defpackage.h3y;
import defpackage.mi31;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pai;
import defpackage.pex0;
import defpackage.vfx0;
import defpackage.z5s0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lmi31;", "verticalTariff", "", "commentChanged", "Lf6v;", "Lufx0;", "Lz5s0;", "<anonymous>", "(Lmi31;Ljava/lang/String;)Lf6v;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.requirements.list.interactors.CommentStateInteractor$commentStateFlow$1", f = "CommentStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class CommentStateInteractor$commentStateFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentStateInteractor$commentStateFlow$1(a aVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = aVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        CommentStateInteractor$commentStateFlow$1 commentStateInteractor$commentStateFlow$1 = new CommentStateInteractor$commentStateFlow$1(this.this$0, (Continuation) obj3);
        commentStateInteractor$commentStateFlow$1.L$0 = (mi31) obj;
        commentStateInteractor$commentStateFlow$1.L$1 = (String) obj2;
        return commentStateInteractor$commentStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        mi31 mi31Var = (mi31) this.L$0;
        String str = (String) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        dj3 dj3Var = this.this$0.b;
        pex0 pex0Var = mi31Var.a;
        h3y h3yVar = dj3Var.a;
        boolean z = pex0Var.B;
        String str2 = pex0Var.b;
        boolean z2 = z ? true : ((pai) h3yVar.get()).a.g(str2) ? ((pai) h3yVar.get()).a.e(str2).l : false;
        String str3 = z2 ? "" : this.this$0.c.a;
        if (z2) {
            str = "";
        }
        z5s0 z5s0Var = new z5s0(str3, str);
        this.this$0.f.getClass();
        return ru.yandex.taxi.requirements.utils.c.b(z5s0Var, vfx0.a(mi31Var));
    }
}
