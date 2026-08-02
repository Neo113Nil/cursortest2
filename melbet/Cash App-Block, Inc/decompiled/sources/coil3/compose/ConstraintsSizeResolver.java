package coil3.compose;

import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.Dimension;
import coil3.size.DimensionKt;
import coil3.size.Size;
import coil3.size.SizeResolver;
import java.util.ArrayList;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class ConstraintsSizeResolver implements SizeResolver, LayoutModifier {
    public ArrayList continuations;
    public long latestConstraints;

    @Override // androidx.compose.ui.layout.LayoutModifier
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo351measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        m1451setConstraintsBRTryo0(j);
        Placeable mo833measureBRTryo0 = measurable.mo833measureBRTryo0(j);
        return MeasureScope.layout$default(measureScope, mo833measureBRTryo0.width, mo833measureBRTryo0.height, new ConstraintsSizeResolver$$ExternalSyntheticLambda0(mo833measureBRTryo0, 0));
    }

    /* renamed from: setConstraints-BRTryo0, reason: not valid java name */
    public final void m1451setConstraintsBRTryo0(long j) {
        this.latestConstraints = j;
        if (Constraints.m1028isZeroimpl(j)) {
            return;
        }
        ArrayList<Continuation> arrayList = this.continuations;
        if (arrayList.isEmpty()) {
            return;
        }
        this.continuations = new ArrayList();
        for (Continuation continuation : arrayList) {
            Result.Companion companion = Result.Companion;
            continuation.resumeWith(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // coil3.size.SizeResolver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object size(Continuation continuation) {
        ConstraintsSizeResolver$size$1 constraintsSizeResolver$size$1;
        int i;
        Ref$ObjectRef ref$ObjectRef;
        Throwable th;
        int m1025getMaxWidthimpl;
        Dimension dimension;
        int m1024getMaxHeightimpl;
        if (continuation instanceof ConstraintsSizeResolver$size$1) {
            constraintsSizeResolver$size$1 = (ConstraintsSizeResolver$size$1) continuation;
            int i2 = constraintsSizeResolver$size$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                constraintsSizeResolver$size$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = constraintsSizeResolver$size$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = constraintsSizeResolver$size$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (Constraints.m1028isZeroimpl(this.latestConstraints)) {
                        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                        try {
                            constraintsSizeResolver$size$1.L$0 = ref$ObjectRef2;
                            constraintsSizeResolver$size$1.label = 1;
                            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(constraintsSizeResolver$size$1));
                            cancellableContinuationImpl.initCancellability();
                            ref$ObjectRef2.element = cancellableContinuationImpl;
                            this.continuations.add(cancellableContinuationImpl);
                            if (cancellableContinuationImpl.getResult() == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            ref$ObjectRef = ref$ObjectRef2;
                        } catch (Throwable th2) {
                            ref$ObjectRef = ref$ObjectRef2;
                            th = th2;
                            ArrayList arrayList = this.continuations;
                            TypeIntrinsics.asMutableCollection(arrayList).remove(ref$ObjectRef.element);
                            throw th;
                        }
                    }
                    long j = this.latestConstraints;
                    m1025getMaxWidthimpl = Constraints.m1025getMaxWidthimpl(j);
                    Dimension dimension2 = Dimension.Undefined.INSTANCE;
                    if (m1025getMaxWidthimpl != Integer.MAX_VALUE) {
                        DimensionKt.Dimension(m1025getMaxWidthimpl);
                        dimension = new Dimension.Pixels(m1025getMaxWidthimpl);
                    } else {
                        dimension = dimension2;
                    }
                    m1024getMaxHeightimpl = Constraints.m1024getMaxHeightimpl(j);
                    if (m1024getMaxHeightimpl != Integer.MAX_VALUE) {
                        DimensionKt.Dimension(m1024getMaxHeightimpl);
                        dimension2 = new Dimension.Pixels(m1024getMaxHeightimpl);
                    }
                    return new Size(dimension, dimension2);
                }
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ref$ObjectRef = constraintsSizeResolver$size$1.L$0;
                try {
                    SafeTrace.throwOnFailure(obj);
                } catch (Throwable th3) {
                    th = th3;
                    ArrayList arrayList2 = this.continuations;
                    TypeIntrinsics.asMutableCollection(arrayList2).remove(ref$ObjectRef.element);
                    throw th;
                }
                ArrayList arrayList3 = this.continuations;
                TypeIntrinsics.asMutableCollection(arrayList3).remove(ref$ObjectRef.element);
                long j2 = this.latestConstraints;
                m1025getMaxWidthimpl = Constraints.m1025getMaxWidthimpl(j2);
                Dimension dimension22 = Dimension.Undefined.INSTANCE;
                if (m1025getMaxWidthimpl != Integer.MAX_VALUE) {
                }
                m1024getMaxHeightimpl = Constraints.m1024getMaxHeightimpl(j2);
                if (m1024getMaxHeightimpl != Integer.MAX_VALUE) {
                }
                return new Size(dimension, dimension22);
            }
        }
        constraintsSizeResolver$size$1 = new ConstraintsSizeResolver$size$1(this, (ContinuationImpl) continuation);
        Object obj2 = constraintsSizeResolver$size$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = constraintsSizeResolver$size$1.label;
        if (i != 0) {
        }
        ArrayList arrayList32 = this.continuations;
        TypeIntrinsics.asMutableCollection(arrayList32).remove(ref$ObjectRef.element);
        long j22 = this.latestConstraints;
        m1025getMaxWidthimpl = Constraints.m1025getMaxWidthimpl(j22);
        Dimension dimension222 = Dimension.Undefined.INSTANCE;
        if (m1025getMaxWidthimpl != Integer.MAX_VALUE) {
        }
        m1024getMaxHeightimpl = Constraints.m1024getMaxHeightimpl(j22);
        if (m1024getMaxHeightimpl != Integer.MAX_VALUE) {
        }
        return new Size(dimension, dimension222);
    }
}
