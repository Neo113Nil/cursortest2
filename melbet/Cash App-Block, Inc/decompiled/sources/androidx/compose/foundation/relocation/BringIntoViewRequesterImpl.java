package androidx.compose.foundation.relocation;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.geometry.Rect;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.ImageLoader$Builder$$ExternalSyntheticLambda1;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class BringIntoViewRequesterImpl {
    public final MutableVector nodes = new MutableVector(0, new BringIntoViewRequesterNode[16]);

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005f -> B:10:0x0062). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object bringIntoView(Rect rect, ContinuationImpl continuationImpl) {
        BringIntoViewRequesterImpl$bringIntoView$1 bringIntoViewRequesterImpl$bringIntoView$1;
        int i;
        int i2;
        Rect rect2;
        int i3;
        Object[] objArr;
        if (continuationImpl instanceof BringIntoViewRequesterImpl$bringIntoView$1) {
            bringIntoViewRequesterImpl$bringIntoView$1 = (BringIntoViewRequesterImpl$bringIntoView$1) continuationImpl;
            int i4 = bringIntoViewRequesterImpl$bringIntoView$1.label;
            if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                bringIntoViewRequesterImpl$bringIntoView$1.label = i4 - PKIFailureInfo.systemUnavail;
                Object obj = bringIntoViewRequesterImpl$bringIntoView$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bringIntoViewRequesterImpl$bringIntoView$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    MutableVector mutableVector = this.nodes;
                    Object[] objArr2 = mutableVector.content;
                    i2 = mutableVector.size;
                    rect2 = rect;
                    i3 = 0;
                    objArr = objArr2;
                    if (i3 < i2) {
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = bringIntoViewRequesterImpl$bringIntoView$1.I$1;
                    i3 = bringIntoViewRequesterImpl$bringIntoView$1.I$0;
                    objArr = bringIntoViewRequesterImpl$bringIntoView$1.L$1;
                    Rect rect3 = bringIntoViewRequesterImpl$bringIntoView$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    rect2 = rect3;
                    i3++;
                    if (i3 < i2) {
                        BringIntoViewRequesterNode bringIntoViewRequesterNode = (BringIntoViewRequesterNode) objArr[i3];
                        ImageLoader$Builder$$ExternalSyntheticLambda1 imageLoader$Builder$$ExternalSyntheticLambda1 = new ImageLoader$Builder$$ExternalSyntheticLambda1(rect2, 4);
                        bringIntoViewRequesterImpl$bringIntoView$1.L$0 = rect2;
                        bringIntoViewRequesterImpl$bringIntoView$1.L$1 = objArr;
                        bringIntoViewRequesterImpl$bringIntoView$1.I$0 = i3;
                        bringIntoViewRequesterImpl$bringIntoView$1.I$1 = i2;
                        bringIntoViewRequesterImpl$bringIntoView$1.label = 1;
                        if (PlatformKt.bringIntoView(bringIntoViewRequesterNode, imageLoader$Builder$$ExternalSyntheticLambda1, bringIntoViewRequesterImpl$bringIntoView$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        i3++;
                        if (i3 < i2) {
                            return Unit.INSTANCE;
                        }
                    }
                }
            }
        }
        bringIntoViewRequesterImpl$bringIntoView$1 = new BringIntoViewRequesterImpl$bringIntoView$1(this, continuationImpl);
        Object obj2 = bringIntoViewRequesterImpl$bringIntoView$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bringIntoViewRequesterImpl$bringIntoView$1.label;
        if (i != 0) {
        }
    }
}
