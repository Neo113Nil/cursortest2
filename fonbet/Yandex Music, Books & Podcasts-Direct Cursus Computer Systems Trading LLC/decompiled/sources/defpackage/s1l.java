package defpackage;

import com.yandex.music.shared.playback.utils.api.commands.SeekBackwardByLongTapCommand;
import com.yandex.music.shared.playback.utils.api.commands.SeekForwardByLongTapCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class s1l extends aur implements Function2 {
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ t1f l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1l(t1f t1fVar, Continuation continuation) {
        super(2, continuation);
        this.l = t1fVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        s1l s1lVar = new s1l(this.l, continuation);
        s1lVar.k = obj;
        return s1lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s1l) create((v1l) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        dyk dykVar;
        v1l v1lVar = (v1l) this.k;
        nm6 nm6Var = nm6.a;
        int i = this.j;
        if (i == 0) {
            qgg.h0(obj);
            if (!(v1lVar instanceof t1l)) {
                if (Intrinsics.d(v1lVar, u1l.a)) {
                    return Unit.a;
                }
                b6e.s();
                return null;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        do {
            int ordinal = ((t1l) v1lVar).a.ordinal();
            if (ordinal == 0) {
                dykVar = SeekForwardByLongTapCommand.INSTANCE;
            } else {
                if (ordinal != 1) {
                    b6e.s();
                    return null;
                }
                dykVar = SeekBackwardByLongTapCommand.INSTANCE;
            }
            ((k1l) this.l.b).a(dykVar, new b3t("core_seek"));
            this.k = v1lVar;
            this.j = 1;
        } while (y2x.o(100L, this) != nm6Var);
        return nm6Var;
    }
}
