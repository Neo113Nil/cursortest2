package androidx.compose.foundation.text.input.internal;

import android.os.Bundle;
import android.view.inputmethod.InputContentInfo;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.foundation.text.input.OutputTransformation;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.internal.TextFieldLayoutStateCache;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.runtime.IntStack;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.unit.Constraints;
import androidx.core.view.inputmethod.InputConnectionCompat$OnCommitContentListener;
import coil3.size.SizeKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class SingleLineCodepointTransformation implements InputConnectionCompat$OnCommitContentListener, SnapshotMutationPolicy {
    public static final SingleLineCodepointTransformation INSTANCE = new SingleLineCodepointTransformation(0);
    public final /* synthetic */ int $r8$classId;

    public SingleLineCodepointTransformation(StatelessInputConnection statelessInputConnection) {
        this.$r8$classId = 1;
    }

    public static final TransformedTextFieldState.TransformedText access$calculateTransformedText(TextFieldCharSequence textFieldCharSequence, OutputTransformation outputTransformation, SelectionWedgeAffinity selectionWedgeAffinity) {
        IntStack intStack = new IntStack(1, false);
        TextFieldBuffer textFieldBuffer = new TextFieldBuffer(textFieldCharSequence, null, null, intStack, 6);
        outputTransformation.transformOutput(textFieldBuffer);
        if (((MutableVector) textFieldBuffer.getChangeTracker$foundation().processor).size == 0) {
            return null;
        }
        long m405mapToTransformedXGyztTk = m405mapToTransformedXGyztTk(textFieldCharSequence.selection, intStack, selectionWedgeAffinity);
        TextRange textRange = textFieldCharSequence.composition;
        return new TransformedTextFieldState.TransformedText(TextFieldBuffer.m377toTextFieldCharSequencewFTz33Y$foundation$default(textFieldBuffer, m405mapToTransformedXGyztTk, textRange != null ? new TextRange(m405mapToTransformedXGyztTk(textRange.packedValue, intStack, selectionWedgeAffinity)) : null, 4), intStack);
    }

    /* renamed from: access$mapFromTransformed-xdX6-G0, reason: not valid java name */
    public static final long m404access$mapFromTransformedxdX6G0(long j, IntStack intStack) {
        int i = TextRange.$r8$clinit;
        long m573mapfzxv0v0 = intStack.m573mapfzxv0v0((int) (j >> 32), false);
        long m573mapfzxv0v02 = TextRange.m987getCollapsedimpl(j) ? m573mapfzxv0v0 : intStack.m573mapfzxv0v0((int) (BodyPartID.bodyIdMax & j), false);
        int min = Math.min(TextRange.m990getMinimpl(m573mapfzxv0v0), TextRange.m990getMinimpl(m573mapfzxv0v02));
        int max = Math.max(TextRange.m989getMaximpl(m573mapfzxv0v0), TextRange.m989getMaximpl(m573mapfzxv0v02));
        return TextRange.m991getReversedimpl(j) ? SizeKt.TextRange(max, min) : SizeKt.TextRange(min, max);
    }

    /* renamed from: mapToTransformed-XGyztTk, reason: not valid java name */
    public static long m405mapToTransformedXGyztTk(long j, IntStack intStack, SelectionWedgeAffinity selectionWedgeAffinity) {
        long TextRange;
        int i = TextRange.$r8$clinit;
        long m573mapfzxv0v0 = intStack.m573mapfzxv0v0((int) (j >> 32), true);
        long m573mapfzxv0v02 = TextRange.m987getCollapsedimpl(j) ? m573mapfzxv0v0 : intStack.m573mapfzxv0v0((int) (j & BodyPartID.bodyIdMax), true);
        WedgeAffinity wedgeAffinity = null;
        WedgeAffinity wedgeAffinity2 = selectionWedgeAffinity != null ? selectionWedgeAffinity.startAffinity : null;
        if (TextRange.m987getCollapsedimpl(j)) {
            wedgeAffinity = wedgeAffinity2;
        } else if (selectionWedgeAffinity != null) {
            wedgeAffinity = selectionWedgeAffinity.endAffinity;
        }
        if (wedgeAffinity2 != null && !TextRange.m987getCollapsedimpl(m573mapfzxv0v0)) {
            int ordinal = wedgeAffinity2.ordinal();
            if (ordinal == 0) {
                int i2 = (int) (m573mapfzxv0v0 >> 32);
                m573mapfzxv0v0 = SizeKt.TextRange(i2, i2);
            } else {
                if (ordinal != 1) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0L;
                }
                int i3 = (int) (m573mapfzxv0v0 & BodyPartID.bodyIdMax);
                m573mapfzxv0v0 = SizeKt.TextRange(i3, i3);
            }
        }
        if (wedgeAffinity != null && !TextRange.m987getCollapsedimpl(m573mapfzxv0v02)) {
            int ordinal2 = wedgeAffinity.ordinal();
            if (ordinal2 == 0) {
                int i4 = (int) (m573mapfzxv0v02 >> 32);
                TextRange = SizeKt.TextRange(i4, i4);
            } else {
                if (ordinal2 != 1) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0L;
                }
                int i5 = (int) (m573mapfzxv0v02 & BodyPartID.bodyIdMax);
                TextRange = SizeKt.TextRange(i5, i5);
            }
            m573mapfzxv0v02 = TextRange;
        }
        int min = Math.min(TextRange.m990getMinimpl(m573mapfzxv0v0), TextRange.m990getMinimpl(m573mapfzxv0v02));
        int max = Math.max(TextRange.m989getMaximpl(m573mapfzxv0v0), TextRange.m989getMaximpl(m573mapfzxv0v02));
        return TextRange.m991getReversedimpl(j) ? SizeKt.TextRange(max, min) : SizeKt.TextRange(min, max);
    }

    @Override // androidx.compose.runtime.SnapshotMutationPolicy
    public boolean equivalent(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 2:
                TextFieldLayoutStateCache.MeasureInputs measureInputs = (TextFieldLayoutStateCache.MeasureInputs) obj;
                TextFieldLayoutStateCache.MeasureInputs measureInputs2 = (TextFieldLayoutStateCache.MeasureInputs) obj2;
                if (measureInputs == null || measureInputs2 == null) {
                    if (!((measureInputs == null) ^ (measureInputs2 == null))) {
                    }
                } else if (measureInputs.densityValue == measureInputs2.densityValue && measureInputs.fontScale == measureInputs2.fontScale && measureInputs.layoutDirection == measureInputs2.layoutDirection && Intrinsics.areEqual(measureInputs.fontFamilyResolver, measureInputs2.fontFamilyResolver) && Constraints.m1019equalsimpl0(measureInputs.constraints, measureInputs2.constraints)) {
                }
                break;
            default:
                TextFieldLayoutStateCache.NonMeasureInputs nonMeasureInputs = (TextFieldLayoutStateCache.NonMeasureInputs) obj;
                TextFieldLayoutStateCache.NonMeasureInputs nonMeasureInputs2 = (TextFieldLayoutStateCache.NonMeasureInputs) obj2;
                if (nonMeasureInputs == null || nonMeasureInputs2 == null) {
                    if (!((nonMeasureInputs == null) ^ (nonMeasureInputs2 == null))) {
                    }
                } else if (nonMeasureInputs.textFieldState == nonMeasureInputs2.textFieldState && Intrinsics.areEqual(nonMeasureInputs.textStyle, nonMeasureInputs2.textStyle) && nonMeasureInputs.singleLine == nonMeasureInputs2.singleLine && nonMeasureInputs.softWrap == nonMeasureInputs2.softWrap && nonMeasureInputs.isKeyboardTypePhone == nonMeasureInputs2.isKeyboardTypePhone) {
                }
                break;
        }
        return false;
    }

    @Override // androidx.core.view.inputmethod.InputConnectionCompat$OnCommitContentListener
    public boolean onCommitContent(Toolbar.AnonymousClass1 anonymousClass1, int i, Bundle bundle) {
        if ((i & 1) != 0) {
            try {
                anonymousClass1.requestPermission();
                InputContentInfo unwrap2 = anonymousClass1.unwrap();
                unwrap2.getClass();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("EXTRA_INPUT_CONTENT_INFO", unwrap2);
            } catch (Exception e) {
                e.toString();
                return false;
            }
        }
        MathUtilsKt.toTransferableContent(anonymousClass1, bundle);
        return false;
    }

    public String toString() {
        switch (this.$r8$classId) {
            case 0:
                return "SingleLineCodepointTransformation";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ SingleLineCodepointTransformation(int i) {
        this.$r8$classId = i;
    }
}
