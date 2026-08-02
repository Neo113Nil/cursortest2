package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class l5q extends aur implements Function2 {
    public final /* synthetic */ int j;
    public final /* synthetic */ n5q k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l5q(n5q n5qVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.k = n5qVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new l5q(this.k, continuation, 0);
            default:
                return new l5q(this.k, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((l5q) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                n5q n5qVar = this.k;
                g7q g7qVar = n5qVar.a.n;
                pjc b0 = zsd.b0(zsd.Q(g7qVar.d, g7qVar.e, g7qVar.f, new b60(4, n5qVar, n5q.class, "createPlaybackEvent", "createPlaybackEvent(Lcom/yandex/music/shared/player/api/player/SharedPlayer$State;ZZ)Lcom/yandex/music/shared/playback/core/api/model/PlaybackEvent;", 4, 5)));
                tf6 tf6Var = n5qVar.e;
                ox6.B(b0, tf6Var, new k5q(n5qVar, 0));
                ox6.B(n5qVar.a.p.f, tf6Var, new k5q(n5qVar, 1));
                knn knnVar = n5qVar.d;
                tf6Var.getClass();
                pre preVar = ((u5q) knnVar.b).b;
                return Unit.a;
            default:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                return this.k.a.n.e.getValue();
        }
    }
}
