package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import ru.yandex.music.glagol.legacy.StartLegacyGlagolQueueBasicCommand;

/* loaded from: classes5.dex */
public final class ban extends aur implements Function2 {
    public /* synthetic */ Object j;
    public final /* synthetic */ dan k;
    public final /* synthetic */ uid l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ban(dan danVar, uid uidVar, Continuation continuation) {
        super(2, continuation);
        this.k = danVar;
        this.l = uidVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        ban banVar = new ban(this.k, this.l, continuation);
        banVar.j = obj;
        return banVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ban) create((v9n) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        v9n v9nVar = (v9n) this.j;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        return new StartLegacyGlagolQueueBasicCommand(new z1q(this.l), v9nVar.a, v9nVar.c, v9nVar.d, v9nVar.e);
    }
}
