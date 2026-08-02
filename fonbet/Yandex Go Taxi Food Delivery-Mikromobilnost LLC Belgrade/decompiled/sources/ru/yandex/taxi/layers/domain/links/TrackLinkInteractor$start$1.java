package ru.yandex.taxi.layers.domain.links;

import defpackage.a001;
import defpackage.b001;
import defpackage.c001;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.w511;
import defpackage.zls;
import defpackage.zy11;
import java.util.Set;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "visitedUrls", "Lc001;", "queueCommand", "<anonymous>", "(Ljava/util/Set;Lc001;)Ljava/util/Set;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.domain.links.TrackLinkInteractor$start$1", f = "TrackLinkInteractor.kt", l = {35}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class TrackLinkInteractor$start$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackLinkInteractor$start$1(a aVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = aVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        TrackLinkInteractor$start$1 trackLinkInteractor$start$1 = new TrackLinkInteractor$start$1(this.this$0, (Continuation) obj3);
        trackLinkInteractor$start$1.L$0 = (Set) obj;
        trackLinkInteractor$start$1.L$1 = (c001) obj2;
        return trackLinkInteractor$start$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Set set = (Set) this.L$0;
        c001 c001Var = (c001) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            if (!(c001Var instanceof a001)) {
                if (!(c001Var instanceof b001)) {
                    w511.b();
                    return null;
                }
                a aVar = this.this$0;
                String a = ((b001) c001Var).a();
                aVar.getClass();
                set.remove(a);
                return set;
            }
            a aVar2 = this.this$0;
            String a2 = ((a001) c001Var).a();
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            obj = a.a(aVar2, set, a2, this);
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
        return (Set) obj;
    }
}
