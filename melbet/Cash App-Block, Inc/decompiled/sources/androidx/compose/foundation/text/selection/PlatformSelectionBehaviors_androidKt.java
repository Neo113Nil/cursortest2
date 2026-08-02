package androidx.compose.foundation.text.selection;

import android.app.RemoteAction;
import android.content.Context;
import android.view.textclassifier.TextClassification;
import androidx.compose.foundation.text.contextmenu.ProcessTextApi23Impl;
import androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.room.InvalidationTracker$$ExternalSyntheticLambda0;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.storage.RealStorageLinkerKt$$ExternalSyntheticLambda2;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.MutexImpl;

/* loaded from: classes.dex */
public abstract class PlatformSelectionBehaviors_androidKt {
    public static final StaticProvidableCompositionLocal LocalTextClassifierCoroutineContext = new StaticProvidableCompositionLocal(new InvalidationTracker$$ExternalSyntheticLambda0(11));
    public static final RealStorageLinkerKt$$ExternalSyntheticLambda2 PlatformSelectionBehaviorsFactory = new RealStorageLinkerKt$$ExternalSyntheticLambda2(1);

    /* renamed from: addPlatformTextContextMenuItems-71BSaZU, reason: not valid java name */
    public static final void m440addPlatformTextContextMenuItems71BSaZU(TextContextMenuBuilderScope textContextMenuBuilderScope, Context context, boolean z, CharSequence charSequence, TextRange textRange, PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl, Function1 function1) {
        if (charSequence == null || textRange == null || platformSelectionBehaviorsImpl == null || !(platformSelectionBehaviorsImpl instanceof PlatformSelectionBehaviorsImpl)) {
            function1.invoke(textContextMenuBuilderScope);
            if (charSequence == null || textRange == null) {
                return;
            }
            ProcessTextApi23Impl.m373addProcessedTextContextMenuItemsUAq72N0(textContextMenuBuilderScope, context, z, charSequence, textRange.packedValue);
            return;
        }
        long j = textRange.packedValue;
        Object obj = platformSelectionBehaviorsImpl.AssistantItemKey;
        MutexImpl mutexImpl = platformSelectionBehaviorsImpl.mutex;
        TextClassification textClassification = null;
        if (mutexImpl.tryLock(null)) {
            TextClassificationResult textClassificationResult = (TextClassificationResult) platformSelectionBehaviorsImpl.textClassificationResult$delegate.getValue();
            TextClassification textClassification2 = (textClassificationResult != null && TextRange.m986equalsimpl0(j, textClassificationResult.m452getSelectiond9O1mEE()) && Intrinsics.areEqual(charSequence, textClassificationResult.getText())) ? textClassificationResult.getTextClassification() : null;
            mutexImpl.unlock(null);
            textClassification = textClassification2;
        }
        if (textClassification == null) {
            function1.invoke(textContextMenuBuilderScope);
        } else {
            if (!textClassification.getActions().isEmpty()) {
                MooncakeTheme.textClassificationItem(textContextMenuBuilderScope, obj, textClassification, 0);
            } else if (SimpleLayoutKt.hasLegacyAssistItem$foundation(textClassification)) {
                MooncakeTheme.textClassificationItem(textContextMenuBuilderScope, obj, textClassification, -1);
            }
            function1.invoke(textContextMenuBuilderScope);
            List<RemoteAction> actions = textClassification.getActions();
            int size = actions.size();
            for (int i = 0; i < size; i++) {
                actions.get(i);
                if (i > 0) {
                    MooncakeTheme.textClassificationItem(textContextMenuBuilderScope, obj, textClassification, i);
                }
            }
        }
        ProcessTextApi23Impl.m373addProcessedTextContextMenuItemsUAq72N0(textContextMenuBuilderScope, context, z, charSequence, textRange.packedValue);
    }

    public static final PlatformSelectionBehaviorsImpl rememberPlatformSelectionBehaviors(SelectedTextType selectedTextType, LocaleList localeList, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(430530635);
        Context context = (Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext);
        CoroutineContext coroutineContext = (CoroutineContext) gapComposer.consume(LocalTextClassifierCoroutineContext);
        boolean changed = ((((i & 112) ^ 48) > 32 && gapComposer.changed(localeList)) || (i & 48) == 32) | gapComposer.changed(coroutineContext) | gapComposer.changed(context);
        Object rememberedValue = gapComposer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.Empty) {
            PlatformSelectionBehaviorsFactory.getClass();
            rememberedValue = new PlatformSelectionBehaviorsImpl(coroutineContext, context, selectedTextType, localeList);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl = (PlatformSelectionBehaviorsImpl) rememberedValue;
        gapComposer.end(false);
        return platformSelectionBehaviorsImpl;
    }
}
