package defpackage;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class xw1 extends aur implements Function2 {
    public final /* synthetic */ cx1 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xw1(cx1 cx1Var, Continuation continuation) {
        super(2, continuation);
        this.j = cx1Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new xw1(this.j, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((xw1) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        cx1 cx1Var = this.j;
        AudioManager c = cx1Var.c();
        AudioFocusRequest audioFocusRequest = cx1Var.e;
        audioFocusRequest.getClass();
        return new Integer(c.abandonAudioFocusRequest(audioFocusRequest));
    }
}
