package androidx.glance.appwidget;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.glance.Applier;
import androidx.glance.Emittable;
import androidx.glance.EmittableWithChildren;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.clientroutes.ClientRoute;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public abstract class IgnoreResultKt {
    public static final void IgnoreResult(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1257244356);
        if (i == 0 && gapComposer.getSkipping()) {
            gapComposer.skipToGroupEnd();
        } else {
            int i2 = IgnoreResultKt$IgnoreResult$1.$r8$clinit;
            gapComposer.startReplaceableGroup(-1115894518);
            gapComposer.startReplaceableGroup(1886828752);
            if (!(gapComposer.applier instanceof Applier)) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(new CompositionLocalsKt$LocalAppWidgetOptions$1(0, 1));
            } else {
                gapComposer.useNode();
            }
            Boxes$$ExternalSyntheticOutline1.m(gapComposer, true, false, false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SizeBoxKt$SizeBox$1$2$1(i);
        }
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.SessionReplayRecord.deepLinkSpecs;
    }

    public static final boolean shouldIgnoreResult(Emittable emittable) {
        if (emittable instanceof EmittableIgnoreResult) {
            return true;
        }
        if (!(emittable instanceof EmittableWithChildren)) {
            return false;
        }
        ArrayList arrayList = ((EmittableWithChildren) emittable).children;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (shouldIgnoreResult((Emittable) it.next())) {
                return true;
            }
        }
        return false;
    }
}
