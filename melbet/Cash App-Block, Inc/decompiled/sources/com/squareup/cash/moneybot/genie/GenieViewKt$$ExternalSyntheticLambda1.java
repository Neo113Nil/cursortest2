package com.squareup.cash.moneybot.genie;

import androidx.camera.core.impl.utils.MatrixExt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.Modifier;
import com.squareup.cash.moneybot.genie.protos.ComposePlatform;
import com.squareup.cash.moneybot.genie.protos.ForEach;
import com.squareup.cash.moneybot.genie.protos.MoneybotScaffold;
import com.squareup.cash.moneybot.genie.protos.Node;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xyz.block.genie.state.StateBindingsKt;

/* loaded from: classes6.dex */
public final /* synthetic */ class GenieViewKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Node f$0;
    public final /* synthetic */ Modifier f$1;

    public /* synthetic */ GenieViewKt$$ExternalSyntheticLambda1(Node node, Modifier modifier, int i) {
        this.$r8$classId = i;
        this.f$0 = node;
        this.f$1 = modifier;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Modifier modifier = this.f$1;
        Node node = this.f$0;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                GapComposer gapComposer = (GapComposer) composer;
                if (!gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    gapComposer.skipToGroupEnd();
                } else if (node != null) {
                    gapComposer.startReplaceGroup(-1230814223);
                    MatrixExt.GenieNodeView(node, modifier, gapComposer, 0);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-1230751758);
                    gapComposer.end(false);
                }
                break;
            default:
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ForEach forEach = node.for_each;
                    ComposePlatform composePlatform = node.compose_platform;
                    MoneybotScaffold moneybotScaffold = node.moneybot_scaffold;
                    if (forEach != null) {
                        gapComposer2.startReplaceGroup(-975051704);
                        ForEach forEach2 = node.for_each;
                        forEach2.getClass();
                        GenieForEachViewKt.GenieForEachView(forEach2, modifier, gapComposer2, 0);
                        gapComposer2.end(false);
                    } else if (moneybotScaffold != null) {
                        gapComposer2.startReplaceGroup(-975048291);
                        MoneybotScaffoldViewKt.MoneybotScaffoldView(moneybotScaffold, modifier, gapComposer2, 0);
                        gapComposer2.end(false);
                    } else if (composePlatform != null) {
                        gapComposer2.startReplaceGroup(-975044273);
                        StateBindingsKt.ComposePlatformView(composePlatform, modifier, gapComposer2, 0);
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(-975041557);
                        gapComposer2.end(false);
                    }
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
