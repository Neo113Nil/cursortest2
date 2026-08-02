package com.squareup.cash.p2pblocking.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import coil3.compose.LocalImageLoaderKt;
import com.squareup.cash.overlays.FakeOverlayLayerKt$$ExternalSyntheticLambda0;
import com.squareup.cash.p2pblocking.viewmodels.P2PListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class P2PListView$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ P2PListView f$0;
    public final /* synthetic */ P2PListViewModel f$1;
    public final /* synthetic */ Function1 f$2;

    public /* synthetic */ P2PListView$$ExternalSyntheticLambda0(P2PListView p2PListView, P2PListViewModel p2PListViewModel, Function1 function1) {
        this.f$0 = p2PListView;
        this.f$1 = p2PListViewModel;
        this.f$2 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$2;
        P2PListViewModel p2PListViewModel = this.f$1;
        P2PListView p2PListView = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(p2PListView.imageLoader), Expect_jvmKt.rememberComposableLambda(-2001583956, new FakeOverlayLayerKt$$ExternalSyntheticLambda0(29, p2PListViewModel, function1), gapComposer), gapComposer, 56);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                num.getClass();
                p2PListView.Content(p2PListViewModel, function1, composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ P2PListView$$ExternalSyntheticLambda0(P2PListView p2PListView, P2PListViewModel p2PListViewModel, Function1 function1, int i) {
        this.f$0 = p2PListView;
        this.f$1 = p2PListViewModel;
        this.f$2 = function1;
    }
}
