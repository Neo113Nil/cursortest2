package defpackage;

import com.yandex.music.shared.modernfit.MethodHandler;
import java.lang.reflect.Type;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class n3i extends cg6 {
    public Object[] j;
    public String k;
    public Type l;
    public /* synthetic */ Object m;
    public final /* synthetic */ MethodHandler n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3i(MethodHandler methodHandler, Continuation continuation) {
        super(continuation);
        this.n = methodHandler;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        Object suspendInvoke;
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        suspendInvoke = this.n.suspendInvoke(null, this);
        return suspendInvoke;
    }
}
