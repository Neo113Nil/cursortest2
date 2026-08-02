package androidx.compose.foundation.text.selection;

import android.content.Context;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.intl.PlatformLocaleKt;
import androidx.paging.FlowExtKt$simpleScan$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.util.task.RepeatOnIntervalTaskRunner$repeatOn$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.sync.MutexImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class PlatformSelectionBehaviorsImpl {
    public final Context context;
    public final CoroutineContext coroutineContext;
    public final LocaleList localeList;
    public final SelectedTextType selectedTextType;
    public TextClassifier textClassificationSession;
    public final MutexImpl mutex = new MutexImpl();
    public final ParcelableSnapshotMutableState textClassificationResult$delegate = Updater.mutableStateOf$default(null);
    public final Object AssistantItemKey = new Object();

    public PlatformSelectionBehaviorsImpl(CoroutineContext coroutineContext, Context context, SelectedTextType selectedTextType, LocaleList localeList) {
        this.coroutineContext = coroutineContext;
        this.context = context;
        this.selectedTextType = selectedTextType;
        this.localeList = localeList;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0077 A[Catch: all -> 0x0098, TryCatch #0 {all -> 0x0098, blocks: (B:24:0x006f, B:26:0x0077, B:28:0x0083, B:32:0x0092), top: B:23:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* renamed from: access$classifyText-M8tDOmk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m437access$classifyTextM8tDOmk(PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl, CharSequence charSequence, long j, TextClassifier textClassifier, ContinuationImpl continuationImpl) {
        PlatformSelectionBehaviorsImpl$classifyText$1 platformSelectionBehaviorsImpl$classifyText$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        long j2;
        CharSequence charSequence2;
        TextClassifier textClassifier2;
        MutexImpl mutexImpl;
        TextClassificationResult textClassificationResult;
        TextClassification classifyText;
        long j3;
        CharSequence charSequence3;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = platformSelectionBehaviorsImpl.textClassificationResult$delegate;
        MutexImpl mutexImpl2 = platformSelectionBehaviorsImpl.mutex;
        try {
            if (continuationImpl instanceof PlatformSelectionBehaviorsImpl$classifyText$1) {
                platformSelectionBehaviorsImpl$classifyText$1 = (PlatformSelectionBehaviorsImpl$classifyText$1) continuationImpl;
                int i2 = platformSelectionBehaviorsImpl$classifyText$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    platformSelectionBehaviorsImpl$classifyText$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = platformSelectionBehaviorsImpl$classifyText$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = platformSelectionBehaviorsImpl$classifyText$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        platformSelectionBehaviorsImpl$classifyText$1.L$0 = charSequence;
                        platformSelectionBehaviorsImpl$classifyText$1.L$1 = textClassifier;
                        platformSelectionBehaviorsImpl$classifyText$1.L$2 = mutexImpl2;
                        j2 = j;
                        platformSelectionBehaviorsImpl$classifyText$1.J$0 = j2;
                        platformSelectionBehaviorsImpl$classifyText$1.label = 1;
                        if (mutexImpl2.lock(platformSelectionBehaviorsImpl$classifyText$1) != coroutineSingletons) {
                            charSequence2 = charSequence;
                            textClassifier2 = textClassifier;
                            mutexImpl = mutexImpl2;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j3 = platformSelectionBehaviorsImpl$classifyText$1.J$0;
                        mutexImpl2 = platformSelectionBehaviorsImpl$classifyText$1.L$2;
                        classifyText = (TextClassification) platformSelectionBehaviorsImpl$classifyText$1.L$1;
                        charSequence3 = platformSelectionBehaviorsImpl$classifyText$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        try {
                            parcelableSnapshotMutableState.setValue(new TextClassificationResult(charSequence3, j3, classifyText));
                            mutexImpl.unlock(null);
                            return Unit.INSTANCE;
                        } finally {
                        }
                    }
                    j2 = platformSelectionBehaviorsImpl$classifyText$1.J$0;
                    mutexImpl = platformSelectionBehaviorsImpl$classifyText$1.L$2;
                    textClassifier2 = (TextClassifier) platformSelectionBehaviorsImpl$classifyText$1.L$1;
                    charSequence2 = platformSelectionBehaviorsImpl$classifyText$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    textClassificationResult = (TextClassificationResult) parcelableSnapshotMutableState.getValue();
                    if (textClassificationResult != null) {
                        StaticProvidableCompositionLocal staticProvidableCompositionLocal = PlatformSelectionBehaviors_androidKt.LocalTextClassifierCoroutineContext;
                        if (TextRange.m986equalsimpl0(j2, textClassificationResult.m452getSelectiond9O1mEE()) && Intrinsics.areEqual(charSequence2, textClassificationResult.getText())) {
                            return Unit.INSTANCE;
                        }
                    }
                    mutexImpl.unlock(null);
                    classifyText = textClassifier2.classifyText(new TextClassification.Request.Builder(charSequence2, TextRange.m990getMinimpl(j2), TextRange.m989getMaximpl(j2)).setDefaultLocales(platformSelectionBehaviorsImpl.getAndroidLocalList()).build());
                    platformSelectionBehaviorsImpl$classifyText$1.L$0 = charSequence2;
                    platformSelectionBehaviorsImpl$classifyText$1.L$1 = classifyText;
                    platformSelectionBehaviorsImpl$classifyText$1.L$2 = mutexImpl2;
                    platformSelectionBehaviorsImpl$classifyText$1.J$0 = j2;
                    platformSelectionBehaviorsImpl$classifyText$1.label = 2;
                    if (mutexImpl2.lock(platformSelectionBehaviorsImpl$classifyText$1) != coroutineSingletons) {
                        j3 = j2;
                        charSequence3 = charSequence2;
                        parcelableSnapshotMutableState.setValue(new TextClassificationResult(charSequence3, j3, classifyText));
                        mutexImpl.unlock(null);
                        return Unit.INSTANCE;
                    }
                    return coroutineSingletons;
                }
            }
            textClassificationResult = (TextClassificationResult) parcelableSnapshotMutableState.getValue();
            if (textClassificationResult != null) {
            }
            mutexImpl.unlock(null);
            classifyText = textClassifier2.classifyText(new TextClassification.Request.Builder(charSequence2, TextRange.m990getMinimpl(j2), TextRange.m989getMaximpl(j2)).setDefaultLocales(platformSelectionBehaviorsImpl.getAndroidLocalList()).build());
            platformSelectionBehaviorsImpl$classifyText$1.L$0 = charSequence2;
            platformSelectionBehaviorsImpl$classifyText$1.L$1 = classifyText;
            platformSelectionBehaviorsImpl$classifyText$1.L$2 = mutexImpl2;
            platformSelectionBehaviorsImpl$classifyText$1.J$0 = j2;
            platformSelectionBehaviorsImpl$classifyText$1.label = 2;
            if (mutexImpl2.lock(platformSelectionBehaviorsImpl$classifyText$1) != coroutineSingletons) {
            }
            return coroutineSingletons;
        } finally {
        }
        platformSelectionBehaviorsImpl$classifyText$1 = new PlatformSelectionBehaviorsImpl$classifyText$1(platformSelectionBehaviorsImpl, continuationImpl);
        Object obj2 = platformSelectionBehaviorsImpl$classifyText$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = platformSelectionBehaviorsImpl$classifyText$1.label;
        if (i != 0) {
        }
    }

    public final android.os.LocaleList getAndroidLocalList() {
        LocaleList localeList = this.localeList;
        return localeList != null ? SimpleLayoutKt.toAndroidLocaleList(localeList) : new android.os.LocaleList(PlatformLocaleKt.platformLocaleDelegate.getCurrent().get().platformLocale);
    }

    /* renamed from: onShowContextMenuOrSelectionToolbar-Sb-Bc2M, reason: not valid java name */
    public final Object m438onShowContextMenuOrSelectionToolbarSbBc2M(CharSequence charSequence, long j, SuspendLambda suspendLambda) {
        if (charSequence.length() == 0 || TextRange.m987getCollapsedimpl(j)) {
            return Unit.INSTANCE;
        }
        return JobKt.withContext(this.coroutineContext, new FlowExtKt$simpleScan$1(this, new RepeatOnIntervalTaskRunner$repeatOn$2(this, charSequence, j, (Continuation) null, 9), (Continuation) null, 13), suspendLambda);
    }

    /* renamed from: suggestSelectionForLongPressOrDoubleClick-pYaCw-w, reason: not valid java name */
    public final Object m439suggestSelectionForLongPressOrDoubleClickpYaCww(CharSequence charSequence, long j, SuspendLambda suspendLambda) {
        Continuation continuation = null;
        if (charSequence.length() == 0 || TextRange.m987getCollapsedimpl(j)) {
            return null;
        }
        return JobKt.withContext(this.coroutineContext, new FlowExtKt$simpleScan$1(this, new PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2(charSequence, j, this, null), continuation, 13), suspendLambda);
    }
}
