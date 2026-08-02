package androidx.activity.compose;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.room.InvalidationTracker$$ExternalSyntheticLambda0;
import androidx.tracing.Trace;

/* loaded from: classes.dex */
public abstract class LocalOnBackPressedDispatcherOwner {
    public static final DynamicProvidableCompositionLocal LocalOnBackPressedDispatcherOwner = new DynamicProvidableCompositionLocal(new InvalidationTracker$$ExternalSyntheticLambda0(3));

    public static OnBackPressedDispatcherOwner getCurrent(Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        OnBackPressedDispatcherOwner onBackPressedDispatcherOwner = (OnBackPressedDispatcherOwner) gapComposer.consume(LocalOnBackPressedDispatcherOwner);
        if (onBackPressedDispatcherOwner == null) {
            gapComposer.startReplaceGroup(1208426157);
            onBackPressedDispatcherOwner = Trace.get((View) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalView));
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(1208423708);
            gapComposer.end(false);
        }
        if (onBackPressedDispatcherOwner != null) {
            gapComposer.startReplaceGroup(1208423789);
            gapComposer.end(false);
            return onBackPressedDispatcherOwner;
        }
        gapComposer.startReplaceGroup(1208428160);
        Object obj = (Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext);
        while (true) {
            if (!(obj instanceof ContextWrapper)) {
                obj = null;
                break;
            }
            if (obj instanceof OnBackPressedDispatcherOwner) {
                break;
            }
            obj = ((ContextWrapper) obj).getBaseContext();
        }
        OnBackPressedDispatcherOwner onBackPressedDispatcherOwner2 = (OnBackPressedDispatcherOwner) obj;
        gapComposer.end(false);
        return onBackPressedDispatcherOwner2;
    }
}
