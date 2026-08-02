package androidx.glance.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.glance.Applier;
import androidx.glance.GlanceModifier;
import androidx.glance.ImageKt$Image$3;
import com.squareup.cash.clientroutes.ClientRoute;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public abstract class BoxKt {
    public static final void Box(GlanceModifier glanceModifier, Alignment alignment, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1959221577);
        if ((((gapComposer.changed(glanceModifier) ? 4 : 2) | i | (gapComposer.changed(alignment) ? 32 : 16)) & 147) == 146 && gapComposer.getSkipping()) {
            gapComposer.skipToGroupEnd();
        } else {
            BoxKt$Box$1 boxKt$Box$1 = BoxKt$Box$1.INSTANCE;
            gapComposer.startReplaceableGroup(578571862);
            gapComposer.startReplaceableGroup(-548224868);
            if (!(gapComposer.applier instanceof Applier)) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(boxKt$Box$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, glanceModifier, BoxKt$Box$2$1.INSTANCE);
            Updater.m576setimpl(gapComposer, alignment, BoxKt$Box$2$1.INSTANCE$1);
            composableLambdaImpl.invoke((Object) gapComposer, (Object) 6);
            gapComposer.end(true);
            gapComposer.end(false);
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ImageKt$Image$3(glanceModifier, alignment, composableLambdaImpl, i);
        }
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.UpdateAfterpayApplet.deepLinkSpecs;
    }
}
