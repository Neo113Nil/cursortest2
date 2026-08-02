package defpackage;

import com.yandex.music.shared.playback.utils.api.commands.SeekBackwardByLongTapCommand;
import com.yandex.music.shared.playback.utils.api.commands.SeekForwardByLongTapCommand;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class f2l extends aur implements Function2 {
    public h2l j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ ime m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2l(ime imeVar, Continuation continuation) {
        super(2, continuation);
        this.m = imeVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        f2l f2lVar = new f2l(this.m, continuation);
        f2lVar.l = obj;
        return f2lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f2l) create((Pair) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        h2l h2lVar;
        dyk dykVar;
        Pair pair = (Pair) this.l;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            zug zugVar = (zug) pair.a;
            h2lVar = (h2l) pair.b;
            if (zugVar != zug.a) {
                return Unit.a;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            h2lVar = this.j;
            qgg.h0(obj);
        }
        do {
            int ordinal = h2lVar.ordinal();
            if (ordinal == 0) {
                dykVar = SeekForwardByLongTapCommand.INSTANCE;
            } else {
                if (ordinal != 1) {
                    b6e.s();
                    return null;
                }
                dykVar = SeekBackwardByLongTapCommand.INSTANCE;
            }
            ((k1l) this.m.b).a(dykVar, new b3t("core_seek"));
            this.l = null;
            this.j = h2lVar;
            this.k = 1;
        } while (y2x.o(100L, this) != nm6Var);
        return nm6Var;
    }
}
