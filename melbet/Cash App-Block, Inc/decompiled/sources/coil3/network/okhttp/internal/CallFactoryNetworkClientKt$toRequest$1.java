package coil3.network.okhttp.internal;

import com.google.android.gms.internal.mlkit_vision_common.zzbc;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class CallFactoryNetworkClientKt$toRequest$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return zzbc.access$toRequest(null, this);
    }
}
