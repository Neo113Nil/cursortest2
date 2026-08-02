package androidx.media3.ui.compose.state;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.paging.PageFetcher$flow$1;
import coil3.disk.DiskLruCache$launchCleanup$1;
import com.squareup.cash.clientroutes.ClientRoute;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public abstract class PresentationStateKt {
    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewAtmWithdrawalMap.deepLinkSpecs;
    }

    public static final PresentationState rememberPresentationState(ExoPlayer exoPlayer, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1006141136);
        gapComposer.startReplaceGroup(2097651363);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = new PresentationState();
            gapComposer.updateRememberedValue(rememberedValue);
        }
        PresentationState presentationState = (PresentationState) rememberedValue;
        gapComposer.end(false);
        gapComposer.startReplaceGroup(2097653782);
        boolean changedInstance = gapComposer.changedInstance(presentationState) | gapComposer.changedInstance(exoPlayer);
        Object rememberedValue2 = gapComposer.rememberedValue();
        Continuation continuation = null;
        if (changedInstance || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new PageFetcher$flow$1(presentationState, exoPlayer, continuation, 22);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        gapComposer.end(false);
        Updater.LaunchedEffect(gapComposer, exoPlayer, (Function2) rememberedValue2);
        gapComposer.startReplaceGroup(2097656206);
        boolean changedInstance2 = ((((i & 112) ^ 48) > 32 && gapComposer.changed(false)) || (i & 48) == 32) | gapComposer.changedInstance(presentationState);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (changedInstance2 || rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = new DiskLruCache$launchCleanup$1(presentationState, continuation, 11);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        gapComposer.end(false);
        Updater.LaunchedEffect((Composer) gapComposer, (Object) false, (Function2) rememberedValue3);
        gapComposer.end(false);
        return presentationState;
    }
}
