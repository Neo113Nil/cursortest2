package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationState;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacp;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$FloatRef;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class SnapFlingBehaviorKt$animateWithTarget$1 extends ContinuationImpl {
    public float F$0;
    public float F$1;
    public AnimationState L$0;
    public Ref$FloatRef L$1;
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return zzacp.access$animateWithTarget(null, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, null, null, null, this);
    }
}
