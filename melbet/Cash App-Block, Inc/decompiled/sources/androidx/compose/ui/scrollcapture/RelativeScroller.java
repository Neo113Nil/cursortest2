package androidx.compose.ui.scrollcapture;

import androidx.compose.material.SwipeableKt$swipeable$3$4$1;
import androidx.compose.ui.text.android.LayoutCompat_androidKt;
import androidx.compose.ui.text.android.TextLayout;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class RelativeScroller {
    public float scrollAmount;
    public final Object scrollBy;
    public int viewportSize;

    public RelativeScroller(TextLayout textLayout) {
        this.scrollBy = textLayout;
        this.viewportSize = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public float get(int i, boolean z, boolean z2, boolean z3) {
        boolean z4;
        int i2;
        TextLayout textLayout = (TextLayout) this.scrollBy;
        int i3 = 1;
        if (z) {
            int lineForOffset = LayoutCompat_androidKt.getLineForOffset(textLayout.layout, i, z);
            int lineStart = textLayout.layout.getLineStart(lineForOffset);
            int lineEnd = textLayout.getLineEnd(lineForOffset);
            if (i == lineStart || i == lineEnd) {
                z4 = true;
                int i4 = i * 4;
                if (z3) {
                    i3 = z4 ? 2 : 3;
                } else if (z4) {
                    i3 = 0;
                }
                i2 = i4 + i3;
                if (this.viewportSize != i2) {
                    return this.scrollAmount;
                }
                float primaryHorizontal = z3 ? textLayout.getPrimaryHorizontal(i, z) : textLayout.getSecondaryHorizontal(i, z);
                if (z2) {
                    this.viewportSize = i2;
                    this.scrollAmount = primaryHorizontal;
                }
                return primaryHorizontal;
            }
        }
        z4 = false;
        int i42 = i * 4;
        if (z3) {
        }
        i2 = i42 + i3;
        if (this.viewportSize != i2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object scrollBy(float f, ContinuationImpl continuationImpl) {
        RelativeScroller$scrollBy$1 relativeScroller$scrollBy$1;
        int i;
        if (continuationImpl instanceof RelativeScroller$scrollBy$1) {
            relativeScroller$scrollBy$1 = (RelativeScroller$scrollBy$1) continuationImpl;
            int i2 = relativeScroller$scrollBy$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                relativeScroller$scrollBy$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = relativeScroller$scrollBy$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = relativeScroller$scrollBy$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    SwipeableKt$swipeable$3$4$1.AnonymousClass1 anonymousClass1 = (SwipeableKt$swipeable$3$4$1.AnonymousClass1) this.scrollBy;
                    Float f2 = new Float(f);
                    relativeScroller$scrollBy$1.label = 1;
                    obj = anonymousClass1.invoke(f2, relativeScroller$scrollBy$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                this.scrollAmount += ((Number) obj).floatValue();
                return Unit.INSTANCE;
            }
        }
        relativeScroller$scrollBy$1 = new RelativeScroller$scrollBy$1(this, continuationImpl);
        Object obj2 = relativeScroller$scrollBy$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = relativeScroller$scrollBy$1.label;
        if (i != 0) {
        }
        this.scrollAmount += ((Number) obj2).floatValue();
        return Unit.INSTANCE;
    }

    public RelativeScroller(int i, SwipeableKt$swipeable$3$4$1.AnonymousClass1 anonymousClass1) {
        this.viewportSize = i;
        this.scrollBy = anonymousClass1;
    }
}
