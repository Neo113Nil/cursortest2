package defpackage;

import com.yandex.music.shared.generative.api.commands.StartGenerativeQueueCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes5.dex */
public final class aan extends aur implements Function2 {
    public /* synthetic */ Object j;
    public final /* synthetic */ dan k;
    public final /* synthetic */ u4d l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aan(dan danVar, u4d u4dVar, Continuation continuation) {
        super(2, continuation);
        this.k = danVar;
        this.l = u4dVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        aan aanVar = new aan(this.k, this.l, continuation);
        aanVar.j = obj;
        return aanVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((aan) create((v9n) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        v9n v9nVar = (v9n) this.j;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        u4d u4dVar = this.l;
        StationId stationId = u4dVar.d.a;
        stationId.getClass();
        String p = stationId.p();
        p.getClass();
        String n = stationId.n();
        n.getClass();
        return new StartGenerativeQueueCommand(new x9n(u4dVar, null), new c5d(new w3d(new d5d(p, n)), new v80(u4dVar.c.a(), u4dVar.e, null)), v9nVar.a, v9nVar.c, v9nVar.d, v9nVar.e);
    }
}
