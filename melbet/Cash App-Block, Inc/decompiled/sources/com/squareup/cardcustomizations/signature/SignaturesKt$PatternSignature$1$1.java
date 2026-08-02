package com.squareup.cardcustomizations.signature;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import com.squareup.cardcustomizations.signature.Point;
import com.squareup.cardcustomizations.signature.Signature;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmc.BodyPartID;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class SignaturesKt$PatternSignature$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $boxHeight;
    public final /* synthetic */ int $boxWidth;
    public final /* synthetic */ MutableFloatState $lastBoxHeight$delegate;
    public final /* synthetic */ MutableFloatState $lastBoxWidth$delegate;
    public final /* synthetic */ SignatureState $signatureState;
    public final /* synthetic */ int $strokeColor;
    public final /* synthetic */ float $strokeWidth;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignaturesKt$PatternSignature$1$1(SignatureState signatureState, int i, int i2, float f, int i3, MutableFloatState mutableFloatState, MutableFloatState mutableFloatState2, Continuation continuation) {
        super(2, continuation);
        this.$signatureState = signatureState;
        this.$boxHeight = i;
        this.$boxWidth = i2;
        this.$strokeWidth = f;
        this.$strokeColor = i3;
        this.$lastBoxWidth$delegate = mutableFloatState;
        this.$lastBoxHeight$delegate = mutableFloatState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SignaturesKt$PatternSignature$1$1(this.$signatureState, this.$boxHeight, this.$boxWidth, this.$strokeWidth, this.$strokeColor, this.$lastBoxWidth$delegate, this.$lastBoxHeight$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SignaturesKt$PatternSignature$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        SignatureState signatureState = this.$signatureState;
        Signature signature$customizations = signatureState.getSignature$customizations();
        MutableFloatState mutableFloatState = this.$lastBoxHeight$delegate;
        MutableFloatState mutableFloatState2 = this.$lastBoxWidth$delegate;
        int i = this.$boxHeight;
        int i2 = this.$boxWidth;
        if (signature$customizations != null) {
            float f = i2;
            float floatValue = f / ((ParcelableSnapshotMutableFloatState) mutableFloatState2).getFloatValue();
            float f2 = i;
            float floatValue2 = f2 / ((ParcelableSnapshotMutableFloatState) mutableFloatState).getFloatValue();
            Signature signature = new Signature(signature$customizations.width, signature$customizations.height, this.$strokeWidth, this.$strokeColor, new SignaturesKt$sam$com_squareup_cardcustomizations_signature_Signature_PainterProvider$0(SignaturesKt$PatternSignature$1$1$1$newSignature$2.INSTANCE));
            signature.isPatternEnabled = true;
            signature.boxWidth = f;
            signature.boxHeight = f2;
            for (Signature.Glyph glyph : signature$customizations.userDrawnGlyphs()) {
                signature.startGlyph();
                for (Point.Timestamped timestamped : glyph.painter.points()) {
                    signature.extendGlyph(Float.intBitsToFloat((int) (signatureState.m2966getSignatureOffsetF1C5BW0$customizations() >> 32)) + ((timestamped.x - Float.intBitsToFloat((int) (signatureState.m2966getSignatureOffsetF1C5BW0$customizations() >> 32))) * floatValue), Float.intBitsToFloat((int) (signatureState.m2966getSignatureOffsetF1C5BW0$customizations() & BodyPartID.bodyIdMax)) + ((timestamped.y - Float.intBitsToFloat((int) (signatureState.m2966getSignatureOffsetF1C5BW0$customizations() & BodyPartID.bodyIdMax))) * floatValue2), timestamped.time);
                }
                signature.finishGlyph();
            }
            signatureState.signature$delegate.setValue(signature);
        }
        ((ParcelableSnapshotMutableFloatState) mutableFloatState).setFloatValue(i);
        ((ParcelableSnapshotMutableFloatState) mutableFloatState2).setFloatValue(i2);
        return Unit.INSTANCE;
    }
}
