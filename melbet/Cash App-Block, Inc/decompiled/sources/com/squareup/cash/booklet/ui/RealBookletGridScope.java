package com.squareup.cash.booklet.ui;

import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.borrow.views.BulletinTileKt$$ExternalSyntheticLambda6;
import com.squareup.cash.checks.VerifyCheckDepositKt$$ExternalSyntheticLambda14;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class RealBookletGridScope implements FlowRowScope {
    public final /* synthetic */ FlowRowScope $$delegate_0;
    public final ArrayList blocks;

    public RealBookletGridScope(FlowRowScope flowRowScope) {
        flowRowScope.getClass();
        this.$$delegate_0 = flowRowScope;
        this.blocks = new ArrayList();
    }

    public final void Content(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2137713925);
        int i2 = 4;
        int i3 = (gapComposer.changed(this) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 3) != 2)) {
            gapComposer.startReplaceGroup(1348715317);
            ArrayList arrayList = this.blocks;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Function2) it.next()).invoke(gapComposer, 0);
            }
            gapComposer.end(false);
            if (arrayList.size() % 2 != 0) {
                gapComposer.startReplaceGroup(-1139450391);
                SpacerKt.Spacer(gapComposer, weight(1.0f, Modifier.Companion.$$INSTANCE, true));
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1139400419);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BulletinTileKt$$ExternalSyntheticLambda6(this, i, i2);
        }
    }

    @Override // androidx.compose.foundation.layout.RowScope
    public final Modifier align(Modifier modifier, BiasAlignment.Vertical vertical) {
        modifier.getClass();
        return this.$$delegate_0.align(modifier, vertical);
    }

    public final void gridBlock(Icons icons, String str, String str2) {
        this.blocks.add(new ComposableLambdaImpl(new VerifyCheckDepositKt$$ExternalSyntheticLambda14(this, icons, str, str2), true, -476426335));
    }

    @Override // androidx.compose.foundation.layout.RowScope
    public final Modifier weight(float f, Modifier modifier, boolean z) {
        modifier.getClass();
        return this.$$delegate_0.weight(f, modifier, z);
    }
}
