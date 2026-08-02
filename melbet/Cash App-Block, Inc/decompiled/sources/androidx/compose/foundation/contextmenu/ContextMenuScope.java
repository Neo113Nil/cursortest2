package androidx.compose.foundation.contextmenu;

import androidx.compose.material3.TextKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda12;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes3.dex */
public final class ContextMenuScope {
    public final SnapshotStateList composables = new SnapshotStateList();

    public static void item$default(ContextMenuScope contextMenuScope, Function2 function2, ComposableLambdaImpl composableLambdaImpl, Function0 function0, int i) {
        if ((i & 8) != 0) {
            composableLambdaImpl = null;
        }
        contextMenuScope.composables.add(new ComposableLambdaImpl(new ComposeDialogKt$$ExternalSyntheticLambda12(function2, contextMenuScope, composableLambdaImpl, function0), true, -1789283891));
    }

    public final void Content$foundation(ContextMenuColors contextMenuColors, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-798501095);
        int i2 = 2;
        int i3 = (gapComposer.changed(contextMenuColors) ? 4 : 2) | i | (gapComposer.changed(this) ? 32 : 16);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            SnapshotStateList snapshotStateList = this.composables;
            int size = snapshotStateList.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((Function3) snapshotStateList.get(i4)).invoke(contextMenuColors, gapComposer, Integer.valueOf(i3 & 14));
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TextKt$$ExternalSyntheticLambda0(this, contextMenuColors, i, i2);
        }
    }
}
