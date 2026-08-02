package androidx.glance.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.glance.Applier;
import androidx.glance.GlanceModifier;
import com.miteksystems.misnap.workflow.view.MiSnapView;
import com.squareup.cash.clientroutes.ClientRoute;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class SpacerKt {
    public static final void Spacer(GlanceModifier glanceModifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1380468206);
        int i2 = 0;
        if ((((gapComposer.changed(glanceModifier) ? 4 : 2) | i) & 3) == 2 && gapComposer.getSkipping()) {
            gapComposer.skipToGroupEnd();
        } else {
            SpacerKt$Spacer$1 spacerKt$Spacer$1 = SpacerKt$Spacer$1.INSTANCE;
            gapComposer.startReplaceableGroup(-1115894518);
            gapComposer.startReplaceableGroup(1886828752);
            if (!(gapComposer.applier instanceof Applier)) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startNode();
            int i3 = 1;
            if (gapComposer.inserting) {
                gapComposer.createNode(new MiSnapView.j(i3, spacerKt$Spacer$1));
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, glanceModifier, BoxKt$Box$2$1.INSTANCE$5);
            gapComposer.end(true);
            gapComposer.end(false);
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SpacerKt$Spacer$3(glanceModifier, i, i2);
        }
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.VerifyPlaidOauth.deepLinkSpecs;
    }
}
