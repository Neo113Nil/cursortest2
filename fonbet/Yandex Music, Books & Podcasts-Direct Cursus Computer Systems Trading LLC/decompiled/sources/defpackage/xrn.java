package defpackage;

import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueBound;
import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueLaunch;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class xrn extends aur implements Function2 {
    public int j;
    public final /* synthetic */ dyk k;
    public final /* synthetic */ bsn l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xrn(dyk dykVar, bsn bsnVar, Continuation continuation) {
        super(2, continuation);
        this.k = dykVar;
        this.l = bsnVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new xrn(this.k, this.l, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((xrn) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003d, code lost:
    
        if (r8 == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        if (r8 == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0069, code lost:
    
        if (r8 == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007f, code lost:
    
        if (r8 == r0) goto L37;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean booleanValue;
        nm6 nm6Var = nm6.a;
        int i = this.j;
        if (i == 0) {
            qgg.h0(obj);
            dyk dykVar = this.k;
            boolean z = dykVar instanceof PlaybackCommand$QueueBound.Basic;
            bsn bsnVar = this.l;
            if (z) {
                this.j = 1;
                obj = bsnVar.c((PlaybackCommand$QueueBound.Basic) dykVar, this);
            } else if (dykVar instanceof PlaybackCommand$QueueLaunch.Basic) {
                this.j = 2;
                obj = bsn.a(bsnVar, (PlaybackCommand$QueueLaunch.Basic) dykVar, this);
            } else if (dykVar instanceof PlaybackCommand$QueueBound.Substituting) {
                this.j = 3;
                obj = bsnVar.d((PlaybackCommand$QueueBound.Substituting) dykVar, this);
            } else {
                if (!(dykVar instanceof PlaybackCommand$QueueLaunch.Substituting)) {
                    b6e.s();
                    return null;
                }
                this.j = 4;
                obj = bsn.b(bsnVar, (PlaybackCommand$QueueLaunch.Substituting) dykVar, this);
            }
            return nm6Var;
        }
        if (i == 1) {
            qgg.h0(obj);
            booleanValue = ((Boolean) obj).booleanValue();
        } else if (i == 2) {
            qgg.h0(obj);
            booleanValue = ((Boolean) obj).booleanValue();
        } else if (i == 3) {
            qgg.h0(obj);
            booleanValue = ((Boolean) obj).booleanValue();
        } else {
            if (i != 4) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
            booleanValue = ((Boolean) obj).booleanValue();
        }
        return Boolean.valueOf(booleanValue);
    }
}
