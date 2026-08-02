package bo.app;

import android.graphics.Bitmap;
import android.widget.ImageView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class p4 extends SuspendLambda implements Function2 {
    public final /* synthetic */ ImageView a;
    public final /* synthetic */ Bitmap b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(ImageView imageView, Bitmap bitmap, Continuation continuation) {
        super(2, continuation);
        this.a = imageView;
        this.b = bitmap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new p4(this.a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new p4(this.a, this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        this.a.setImageBitmap(this.b);
        return Unit.INSTANCE;
    }
}
