package defpackage;

import com.ybsdk.core.utils.c;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes2.dex */
public abstract class w2y extends yr31 implements d6v {
    public final /* synthetic */ c b = new c();
    public final ev31 c;
    public final r0 w;
    public final fzw x;
    public final n0 y;

    public w2y(ghk ghkVar, hhk hhkVar) {
        this.c = hhkVar;
        r0 c = bvf0.c(ghkVar);
        this.w = c;
        n0 c2 = ffx.c(0, 16, BufferOverflow.DROP_OLDEST, 1);
        this.x = new fzw(3, c, this);
        this.y = c2;
    }

    @Override // defpackage.d6v
    public final Object B(Object obj, sls slsVar, tls tlsVar, wls wlsVar, ContinuationImpl continuationImpl) {
        Object B = this.b.B(obj, slsVar, tlsVar, wlsVar, continuationImpl);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return B;
    }

    @Override // defpackage.d6v
    public final Object O(wls wlsVar, Object obj, Continuation continuation) {
        Object O = this.b.O(wlsVar, obj, continuation);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return O;
    }

    @Override // defpackage.d6v
    public final String i(String str) {
        return this.b.i(str);
    }
}
