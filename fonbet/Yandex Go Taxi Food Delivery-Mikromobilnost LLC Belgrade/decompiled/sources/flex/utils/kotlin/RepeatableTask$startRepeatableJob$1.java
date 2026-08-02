package flex.utils.kotlin;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "flex.utils.kotlin.RepeatableTask", f = "RepeatableTask.kt", l = {HProv.ALG_SID_SHA3_256, 80, 83, MSException.ERROR_INVALID_PASSWORD, HProv.ALG_SID_KECCAK_256}, m = "startRepeatableJob")
/* loaded from: classes9.dex */
final class RepeatableTask$startRepeatableJob$1<T> extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepeatableTask$startRepeatableJob$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.a(this.this$0, null, null, null, null, null, this);
    }
}
