package androidx.compose.ui.text.android;

import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.text.MeasuredText;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.bitcoin.capability.BTCxCapability;
import com.squareup.cash.capability.CapabilityProvider$availableCapabilities$1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public abstract class CanvasCompatQ {
    public static void disableZ(Canvas canvas) {
        canvas.disableZ();
    }

    public static void drawColor(Canvas canvas, long j) {
        canvas.drawColor(j);
    }

    public static void drawDoubleRoundRect(Canvas canvas, RectF rectF, float f, float f2, RectF rectF2, float f3, float f4, Paint paint) {
        canvas.drawDoubleRoundRect(rectF, f, f2, rectF2, f3, f4, paint);
    }

    public static void drawRenderNode(Canvas canvas, RenderNode renderNode) {
        canvas.drawRenderNode(renderNode);
    }

    public static void drawTextRun(Canvas canvas, MeasuredText measuredText, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        canvas.drawTextRun(measuredText, i, i2, i3, i4, f, f2, z, paint);
    }

    public static void enableZ(Canvas canvas) {
        canvas.enableZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0077 -> B:10:0x007a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object availableCapabilities(ContinuationImpl continuationImpl) {
        CapabilityProvider$availableCapabilities$1 capabilityProvider$availableCapabilities$1;
        int i;
        int i2;
        Iterator it;
        Collection collection;
        int i3;
        if (continuationImpl instanceof CapabilityProvider$availableCapabilities$1) {
            capabilityProvider$availableCapabilities$1 = (CapabilityProvider$availableCapabilities$1) continuationImpl;
            int i4 = capabilityProvider$availableCapabilities$1.label;
            if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                capabilityProvider$availableCapabilities$1.label = i4 - PKIFailureInfo.systemUnavail;
                Object obj = capabilityProvider$availableCapabilities$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = capabilityProvider$availableCapabilities$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    List capabilities = getCapabilities();
                    ArrayList arrayList = new ArrayList();
                    i2 = 0;
                    it = capabilities.iterator();
                    collection = arrayList;
                    i3 = 0;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = capabilityProvider$availableCapabilities$1.I$1;
                    i2 = capabilityProvider$availableCapabilities$1.I$0;
                    Object next = capabilityProvider$availableCapabilities$1.L$4;
                    it = capabilityProvider$availableCapabilities$1.L$3;
                    collection = capabilityProvider$availableCapabilities$1.L$2;
                    SafeTrace.throwOnFailure(obj);
                    if (((Boolean) obj).booleanValue()) {
                        collection.add(next);
                    }
                    if (it.hasNext()) {
                        next = it.next();
                        BTCxCapability bTCxCapability = (BTCxCapability) next;
                        capabilityProvider$availableCapabilities$1.L$2 = collection;
                        capabilityProvider$availableCapabilities$1.L$3 = it;
                        capabilityProvider$availableCapabilities$1.L$4 = next;
                        capabilityProvider$availableCapabilities$1.I$0 = i2;
                        capabilityProvider$availableCapabilities$1.I$1 = i3;
                        capabilityProvider$availableCapabilities$1.label = 1;
                        bTCxCapability.getBitcoinCapabilityProvider().getClass();
                        obj = bTCxCapability.checkAdditionalIsAvailable(capabilityProvider$availableCapabilities$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        if (((Boolean) obj).booleanValue()) {
                        }
                        if (it.hasNext()) {
                            return (List) collection;
                        }
                    }
                }
            }
        }
        capabilityProvider$availableCapabilities$1 = new CapabilityProvider$availableCapabilities$1(this, continuationImpl);
        Object obj2 = capabilityProvider$availableCapabilities$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = capabilityProvider$availableCapabilities$1.label;
        if (i != 0) {
        }
    }

    public abstract List getCapabilities();

    public static void drawColor(Canvas canvas, int i, BlendMode blendMode) {
        canvas.drawColor(i, blendMode);
    }

    public static void drawDoubleRoundRect(Canvas canvas, RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        canvas.drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
    }

    public static void drawColor(Canvas canvas, long j, BlendMode blendMode) {
        canvas.drawColor(j, blendMode);
    }
}
