package androidx.compose.material3;

import androidx.compose.foundation.interaction.Interaction;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class FloatingActionButtonElevationAnimatable$animateElevation$1 extends ContinuationImpl {
    public Interaction L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ FloatingActionButtonElevationAnimatable this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingActionButtonElevationAnimatable$animateElevation$1(FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = floatingActionButtonElevationAnimatable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.animateElevation(null, this);
    }
}
