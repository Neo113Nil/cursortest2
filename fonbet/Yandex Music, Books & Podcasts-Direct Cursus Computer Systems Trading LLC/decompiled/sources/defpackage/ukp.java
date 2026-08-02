package defpackage;

import com.yandex.music.shared.playback.utils.api.commands.NoopCallbackCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class ukp extends aur implements Function1 {
    public NoopCallbackCommand j;
    public Object k;
    public int l;
    public final /* synthetic */ wkp m;
    public final /* synthetic */ wkp n;
    public final /* synthetic */ long o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ukp(wkp wkpVar, Continuation continuation, wkp wkpVar2, long j) {
        super(1, continuation);
        this.m = wkpVar;
        this.n = wkpVar2;
        this.o = j;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        return new ukp(this.m, continuation, this.n, this.o);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((ukp) create((Continuation) obj)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        NoopCallbackCommand noopCallbackCommand;
        nm6 nm6Var = nm6.a;
        int i = this.l;
        if (i == 0) {
            qgg.h0(obj);
            NoopCallbackCommand noopCallbackCommand2 = new NoopCallbackCommand();
            vkp vkpVar = new vkp(this.n, this.o, noopCallbackCommand2, null);
            bsd b = dm6.b();
            this.j = noopCallbackCommand2;
            this.k = null;
            this.l = 1;
            obj = x97.V(b, vkpVar, this);
            if (obj != nm6Var) {
                noopCallbackCommand = noopCallbackCommand2;
            }
        }
        if (i != 1) {
            if (i != 2) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Object obj2 = this.k;
            qgg.h0(obj);
            return obj2;
        }
        noopCallbackCommand = this.j;
        qgg.h0(obj);
        this.j = null;
        this.k = obj;
        this.l = 2;
        return wkp.a(this.m, noopCallbackCommand, this) == nm6Var ? nm6Var : obj;
    }
}
