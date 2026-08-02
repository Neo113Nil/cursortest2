package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.OutputTransformation;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.runtime.DerivedSnapshotState;
import androidx.compose.runtime.IntStack;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.text.TextRange;
import androidx.work.impl.WorkerWrapperKt$awaitWithin$2$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.ComponentRegistry$Builder$$ExternalSyntheticLambda3;
import coil3.size.SizeKt;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.mooncake.resources.ImageResourcesKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class TransformedTextFieldState {
    public final SingleLineCodepointTransformation codepointTransformation;
    public final DerivedSnapshotState codepointTransformedText;
    public InputTransformation inputTransformation;
    public final OutputTransformation outputTransformation;
    public final DerivedSnapshotState outputTransformedText;
    public final ParcelableSnapshotMutableState selectionWedgeAffinity$delegate;
    public final TextFieldState textFieldState;

    public final class TransformedText {
        public final IntStack offsetMapping;
        public final TextFieldCharSequence text;

        public TransformedText(TextFieldCharSequence textFieldCharSequence, IntStack intStack) {
            this.text = textFieldCharSequence;
            this.offsetMapping = intStack;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof TransformedText) {
                TransformedText transformedText = (TransformedText) obj;
                return this.text.equals(transformedText.text) && this.offsetMapping == transformedText.offsetMapping;
            }
            return false;
        }

        public final int hashCode() {
            return this.offsetMapping.hashCode() + (this.text.hashCode() * 31);
        }

        public final String toString() {
            return "TransformedText(text=" + ((Object) this.text) + ", offsetMapping=" + this.offsetMapping + ')';
        }
    }

    public TransformedTextFieldState(TextFieldState textFieldState, InputTransformation inputTransformation, SingleLineCodepointTransformation singleLineCodepointTransformation, OutputTransformation outputTransformation) {
        this.textFieldState = textFieldState;
        this.inputTransformation = inputTransformation;
        this.codepointTransformation = singleLineCodepointTransformation;
        this.outputTransformation = outputTransformation;
        this.outputTransformedText = outputTransformation != null ? Updater.derivedStateOf(new ComponentRegistry$Builder$$ExternalSyntheticLambda3(6, this, outputTransformation)) : null;
        this.codepointTransformedText = singleLineCodepointTransformation != null ? Updater.derivedStateOf(new ComponentRegistry$Builder$$ExternalSyntheticLambda3(7, this, singleLineCodepointTransformation)) : null;
        WedgeAffinity wedgeAffinity = WedgeAffinity.Start;
        this.selectionWedgeAffinity$delegate = Updater.mutableStateOf$default(new SelectionWedgeAffinity(wedgeAffinity, wedgeAffinity));
    }

    public static void replaceSelectedText$default(TransformedTextFieldState transformedTextFieldState, CharSequence charSequence, boolean z, int i) {
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.NeverMerge;
        boolean z2 = (i & 2) == 0;
        if ((i & 4) != 0) {
            textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        }
        if ((i & 8) != 0) {
            z = true;
        }
        TextFieldState textFieldState = transformedTextFieldState.textFieldState;
        InputTransformation inputTransformation = transformedTextFieldState.inputTransformation;
        textFieldState.mainBuffer.getChangeTracker$foundation().clearChanges();
        TextFieldBuffer textFieldBuffer = textFieldState.mainBuffer;
        if (z2) {
            textFieldBuffer.m378setCompositionOEnZFl4(null);
        }
        long j = textFieldBuffer.selectionInChars;
        textFieldBuffer.replace(TextRange.m990getMinimpl(j), TextRange.m989getMaximpl(j), charSequence);
        ImageResourcesKt.setSelectionCoerced(textFieldBuffer, charSequence.length() + TextRange.m990getMinimpl(j), r9);
        transformedTextFieldState.updateWedgeAffinity(textFieldBuffer);
        TextFieldState.access$commitEditAsUser(textFieldState, inputTransformation, z, textFieldEditUndoBehavior);
        textFieldState.setUserCommit(true);
    }

    /* renamed from: replaceText-M8tDOmk$default, reason: not valid java name */
    public static void m412replaceTextM8tDOmk$default(TransformedTextFieldState transformedTextFieldState, String str, long j, boolean z, int i) {
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        if ((i & 8) != 0) {
            z = true;
        }
        TextFieldState textFieldState = transformedTextFieldState.textFieldState;
        InputTransformation inputTransformation = transformedTextFieldState.inputTransformation;
        textFieldState.mainBuffer.getChangeTracker$foundation().clearChanges();
        TextFieldBuffer textFieldBuffer = textFieldState.mainBuffer;
        long m414mapFromTransformedGEjPoXI = transformedTextFieldState.m414mapFromTransformedGEjPoXI(j);
        textFieldBuffer.replace(TextRange.m990getMinimpl(m414mapFromTransformedGEjPoXI), TextRange.m989getMaximpl(m414mapFromTransformedGEjPoXI), str);
        ImageResourcesKt.setSelectionCoerced(textFieldBuffer, str.length() + TextRange.m990getMinimpl(m414mapFromTransformedGEjPoXI), r7);
        transformedTextFieldState.updateWedgeAffinity(textFieldBuffer);
        TextFieldState.access$commitEditAsUser(textFieldState, inputTransformation, z, textFieldEditUndoBehavior);
        textFieldState.setUserCommit(true);
    }

    public final void collapseSelectionToMax() {
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        TextFieldState textFieldState = this.textFieldState;
        textFieldState.mainBuffer.getChangeTracker$foundation().clearChanges();
        TextFieldBuffer textFieldBuffer = textFieldState.mainBuffer;
        ImageResourcesKt.setSelectionCoerced(textFieldBuffer, TextRange.m989getMaximpl(textFieldBuffer.selectionInChars), r3);
        TextFieldState.access$commitEditAsUser(textFieldState, inputTransformation, true, textFieldEditUndoBehavior);
        textFieldState.setUserCommit(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r6v4, types: [androidx.compose.foundation.text.input.internal.TransformedTextFieldState$$ExternalSyntheticLambda2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void collectImeNotifications(final AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$1$$ExternalSyntheticLambda0 androidTextInputSession_androidKt$platformSpecificTextInputSession$3$1$$ExternalSyntheticLambda0, ContinuationImpl continuationImpl) {
        TransformedTextFieldState$collectImeNotifications$1 transformedTextFieldState$collectImeNotifications$1;
        int i;
        if (continuationImpl instanceof TransformedTextFieldState$collectImeNotifications$1) {
            transformedTextFieldState$collectImeNotifications$1 = (TransformedTextFieldState$collectImeNotifications$1) continuationImpl;
            int i2 = transformedTextFieldState$collectImeNotifications$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                transformedTextFieldState$collectImeNotifications$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = transformedTextFieldState$collectImeNotifications$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transformedTextFieldState$collectImeNotifications$1.label;
                int i3 = 1;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (this.outputTransformation != null) {
                        androidTextInputSession_androidKt$platformSpecificTextInputSession$3$1$$ExternalSyntheticLambda0 = new TextFieldState.NotifyImeListener() { // from class: androidx.compose.foundation.text.input.internal.TransformedTextFieldState$$ExternalSyntheticLambda2
                            @Override // androidx.compose.foundation.text.input.TextFieldState.NotifyImeListener
                            public final void onChange(TextFieldCharSequence textFieldCharSequence, TextFieldCharSequence textFieldCharSequence2, boolean z) {
                                TransformedTextFieldState transformedTextFieldState = this;
                                TransformedTextFieldState.TransformedText access$calculateTransformedText = SingleLineCodepointTransformation.access$calculateTransformedText(textFieldCharSequence, transformedTextFieldState.outputTransformation, transformedTextFieldState.getSelectionWedgeAffinity());
                                if (access$calculateTransformedText != null) {
                                    textFieldCharSequence = access$calculateTransformedText.text;
                                }
                                TextFieldState.NotifyImeListener.this.onChange(textFieldCharSequence, transformedTextFieldState.getVisualText(), z);
                            }
                        };
                    }
                    transformedTextFieldState$collectImeNotifications$1.label = 1;
                    CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(transformedTextFieldState$collectImeNotifications$1));
                    cancellableContinuationImpl.initCancellability();
                    this.textFieldState.notifyImeListeners.add(androidTextInputSession_androidKt$platformSpecificTextInputSession$3$1$$ExternalSyntheticLambda0);
                    cancellableContinuationImpl.invokeOnCancellation(new WorkerWrapperKt$awaitWithin$2$1(i3, this, androidTextInputSession_androidKt$platformSpecificTextInputSession$3$1$$ExternalSyntheticLambda0));
                    if (cancellableContinuationImpl.getResult() == coroutineSingletons) {
                        return;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                OptionalProvider$$ExternalSyntheticLambda0.m$1();
            }
        }
        transformedTextFieldState$collectImeNotifications$1 = new TransformedTextFieldState$collectImeNotifications$1(this, continuationImpl);
        Object obj2 = transformedTextFieldState$collectImeNotifications$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transformedTextFieldState$collectImeNotifications$1.label;
        int i32 = 1;
        if (i != 0) {
        }
        OptionalProvider$$ExternalSyntheticLambda0.m$1();
    }

    public final void deleteSelectedText() {
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.NeverMerge;
        TextFieldState textFieldState = this.textFieldState;
        textFieldState.mainBuffer.getChangeTracker$foundation().clearChanges();
        TextFieldBuffer textFieldBuffer = textFieldState.mainBuffer;
        ImageResourcesKt.delete(textFieldBuffer, TextRange.m990getMinimpl(textFieldBuffer.selectionInChars), TextRange.m989getMaximpl(textFieldBuffer.selectionInChars));
        ImageResourcesKt.setSelectionCoerced(textFieldBuffer, TextRange.m990getMinimpl(textFieldBuffer.selectionInChars), r4);
        updateWedgeAffinity(textFieldBuffer);
        TextFieldState.access$commitEditAsUser(textFieldState, inputTransformation, true, textFieldEditUndoBehavior);
        textFieldState.setUserCommit(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransformedTextFieldState)) {
            return false;
        }
        TransformedTextFieldState transformedTextFieldState = (TransformedTextFieldState) obj;
        if (Intrinsics.areEqual(this.textFieldState, transformedTextFieldState.textFieldState) && Intrinsics.areEqual(this.codepointTransformation, transformedTextFieldState.codepointTransformation)) {
            return Intrinsics.areEqual(this.outputTransformation, transformedTextFieldState.outputTransformation);
        }
        return false;
    }

    public final TextFieldCharSequence getOutputText() {
        TransformedText transformedText;
        DerivedSnapshotState derivedSnapshotState = this.outputTransformedText;
        return (derivedSnapshotState == null || (transformedText = (TransformedText) derivedSnapshotState.getValue()) == null) ? this.textFieldState.getValue$foundation() : transformedText.text;
    }

    public final SelectionWedgeAffinity getSelectionWedgeAffinity() {
        return (SelectionWedgeAffinity) this.selectionWedgeAffinity$delegate.getValue();
    }

    public final TextFieldCharSequence getVisualText() {
        TransformedText transformedText;
        DerivedSnapshotState derivedSnapshotState = this.codepointTransformedText;
        return (derivedSnapshotState == null || (transformedText = (TransformedText) derivedSnapshotState.getValue()) == null) ? getOutputText() : transformedText.text;
    }

    public final int hashCode() {
        int hashCode = this.textFieldState.hashCode() * 31;
        SingleLineCodepointTransformation singleLineCodepointTransformation = this.codepointTransformation;
        int hashCode2 = (hashCode + (singleLineCodepointTransformation != null ? singleLineCodepointTransformation.hashCode() : 0)) * 31;
        OutputTransformation outputTransformation = this.outputTransformation;
        return hashCode2 + (outputTransformation != null ? outputTransformation.hashCode() : 0);
    }

    /* renamed from: mapFromTransformed--jx7JFs, reason: not valid java name */
    public final long m413mapFromTransformedjx7JFs(int i) {
        TransformedText transformedText;
        TransformedText transformedText2;
        IntStack intStack = null;
        DerivedSnapshotState derivedSnapshotState = this.outputTransformedText;
        IntStack intStack2 = (derivedSnapshotState == null || (transformedText2 = (TransformedText) derivedSnapshotState.getValue()) == null) ? null : transformedText2.offsetMapping;
        DerivedSnapshotState derivedSnapshotState2 = this.codepointTransformedText;
        if (derivedSnapshotState2 != null && (transformedText = (TransformedText) derivedSnapshotState2.getValue()) != null) {
            intStack = transformedText.offsetMapping;
        }
        long m573mapfzxv0v0 = intStack != null ? intStack.m573mapfzxv0v0(i, false) : SizeKt.TextRange(i, i);
        return intStack2 != null ? SingleLineCodepointTransformation.m404access$mapFromTransformedxdX6G0(m573mapfzxv0v0, intStack2) : m573mapfzxv0v0;
    }

    /* renamed from: mapFromTransformed-GEjPoXI, reason: not valid java name */
    public final long m414mapFromTransformedGEjPoXI(long j) {
        TransformedText transformedText;
        TransformedText transformedText2;
        IntStack intStack = null;
        DerivedSnapshotState derivedSnapshotState = this.outputTransformedText;
        IntStack intStack2 = (derivedSnapshotState == null || (transformedText2 = (TransformedText) derivedSnapshotState.getValue()) == null) ? null : transformedText2.offsetMapping;
        DerivedSnapshotState derivedSnapshotState2 = this.codepointTransformedText;
        if (derivedSnapshotState2 != null && (transformedText = (TransformedText) derivedSnapshotState2.getValue()) != null) {
            intStack = transformedText.offsetMapping;
        }
        if (intStack != null) {
            j = SingleLineCodepointTransformation.m404access$mapFromTransformedxdX6G0(j, intStack);
        }
        return intStack2 != null ? SingleLineCodepointTransformation.m404access$mapFromTransformedxdX6G0(j, intStack2) : j;
    }

    /* renamed from: mapToTransformed-GEjPoXI, reason: not valid java name */
    public final long m415mapToTransformedGEjPoXI(long j) {
        TransformedText transformedText;
        TransformedText transformedText2;
        DerivedSnapshotState derivedSnapshotState = this.outputTransformedText;
        IntStack intStack = (derivedSnapshotState == null || (transformedText2 = (TransformedText) derivedSnapshotState.getValue()) == null) ? null : transformedText2.offsetMapping;
        DerivedSnapshotState derivedSnapshotState2 = this.codepointTransformedText;
        IntStack intStack2 = (derivedSnapshotState2 == null || (transformedText = (TransformedText) derivedSnapshotState2.getValue()) == null) ? null : transformedText.offsetMapping;
        if (intStack != null) {
            j = SingleLineCodepointTransformation.m405mapToTransformedXGyztTk(j, intStack, null);
        }
        return intStack2 != null ? SingleLineCodepointTransformation.m405mapToTransformedXGyztTk(j, intStack2, getSelectionWedgeAffinity()) : j;
    }

    public final void replaceAll(CharSequence charSequence) {
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        TextFieldState textFieldState = this.textFieldState;
        textFieldState.mainBuffer.getChangeTracker$foundation().clearChanges();
        TextFieldBuffer textFieldBuffer = textFieldState.mainBuffer;
        ImageResourcesKt.delete(textFieldBuffer, 0, textFieldBuffer.buffer.length());
        textFieldBuffer.append(charSequence.toString());
        updateWedgeAffinity(textFieldBuffer);
        TextFieldState.access$commitEditAsUser(textFieldState, inputTransformation, true, textFieldEditUndoBehavior);
        textFieldState.setUserCommit(true);
    }

    /* renamed from: selectCharsIn-5zc-tL8, reason: not valid java name */
    public final void m416selectCharsIn5zctL8(long j) {
        m417selectUntransformedCharsIn5zctL8(m414mapFromTransformedGEjPoXI(j));
    }

    /* renamed from: selectUntransformedCharsIn-5zc-tL8, reason: not valid java name */
    public final void m417selectUntransformedCharsIn5zctL8(long j) {
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        TextFieldState textFieldState = this.textFieldState;
        textFieldState.mainBuffer.getChangeTracker$foundation().clearChanges();
        TextFieldBuffer textFieldBuffer = textFieldState.mainBuffer;
        int i = TextRange.$r8$clinit;
        ImageResourcesKt.setSelectionCoerced(textFieldBuffer, (int) (j >> 32), (int) (j & BodyPartID.bodyIdMax));
        TextFieldState.access$commitEditAsUser(textFieldState, inputTransformation, true, textFieldEditUndoBehavior);
        textFieldState.setUserCommit(true);
    }

    public final String toString() {
        return "TransformedTextFieldState(textFieldState=" + this.textFieldState + ", outputTransformation=" + this.outputTransformation + ", outputTransformedText=" + this.outputTransformedText + ", codepointTransformation=" + this.codepointTransformation + ", codepointTransformedText=" + this.codepointTransformedText + ", outputText=\"" + ((Object) getOutputText()) + "\", visualText=\"" + ((Object) getVisualText()) + "\")";
    }

    public final void updateWedgeAffinity(TextFieldBuffer textFieldBuffer) {
        if (((MutableVector) textFieldBuffer.getChangeTracker$foundation().processor).size <= 0 || !TextRange.m987getCollapsedimpl(textFieldBuffer.selectionInChars)) {
            return;
        }
        WedgeAffinity wedgeAffinity = WedgeAffinity.Start;
        this.selectionWedgeAffinity$delegate.setValue(new SelectionWedgeAffinity(wedgeAffinity, wedgeAffinity));
    }
}
