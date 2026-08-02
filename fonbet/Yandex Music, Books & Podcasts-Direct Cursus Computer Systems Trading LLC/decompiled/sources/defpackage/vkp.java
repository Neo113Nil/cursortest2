package defpackage;

import com.yandex.music.shared.playback.api.commands.SeekToPositionCommand;
import com.yandex.music.shared.playback.utils.api.commands.NoopCallbackCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class vkp extends aur implements Function2 {
    public long j;
    public int k;
    public final /* synthetic */ wkp l;
    public final /* synthetic */ long m;
    public final /* synthetic */ NoopCallbackCommand n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vkp(wkp wkpVar, long j, NoopCallbackCommand noopCallbackCommand, Continuation continuation) {
        super(2, continuation);
        this.l = wkpVar;
        this.m = j;
        this.n = noopCallbackCommand;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new vkp(this.l, this.m, this.n, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((vkp) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
    
        if (r13 == r2) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        if (r13 == r2) goto L15;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long longValue;
        wkp wkpVar = this.l;
        uol uolVar = wkpVar.c;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            this.k = 1;
            obj = uolVar.f(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                long j = this.j;
                qgg.h0(obj);
                longValue = j;
                wkpVar.d.b(new eyk(u75.h(new SeekToPositionCommand(yhn.f(longValue, 0L, ((Number) obj).longValue())), this.n)), new b3t("core_seek"));
                return wkpVar.f;
            }
            qgg.h0(obj);
        }
        longValue = ((Number) obj).longValue() + this.m;
        this.j = longValue;
        this.k = 2;
        obj = uolVar.a(this);
    }
}
