package com.squareup.cash.family.requestsponsorship.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import coil3.compose.LocalImageLoaderKt;
import com.squareup.cash.family.requestsponsorship.viewmodels.SelectContactMethodViewModel;
import com.squareup.cash.p2pblocking.views.P2PListView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class SelectContactMethodView$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ P2PListView f$0;
    public final /* synthetic */ SelectContactMethodViewModel f$1;
    public final /* synthetic */ Function1 f$2;

    public /* synthetic */ SelectContactMethodView$$ExternalSyntheticLambda0(P2PListView p2PListView, SelectContactMethodViewModel selectContactMethodViewModel, Function1 function1) {
        this.$r8$classId = 1;
        this.f$0 = p2PListView;
        this.f$1 = selectContactMethodViewModel;
        this.f$2 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$2;
        SelectContactMethodViewModel selectContactMethodViewModel = this.f$1;
        P2PListView p2PListView = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                p2PListView.Content(selectContactMethodViewModel, function1, composer, Updater.updateChangedFlags(1));
                break;
            case 1:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(p2PListView.imageLoader), Expect_jvmKt.rememberComposableLambda(1170859923, new SelectContactMethodView$$ExternalSyntheticLambda3(selectContactMethodViewModel, function1), gapComposer), gapComposer, 56);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                num.getClass();
                p2PListView.Content(selectContactMethodViewModel, function1, composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SelectContactMethodView$$ExternalSyntheticLambda0(P2PListView p2PListView, SelectContactMethodViewModel selectContactMethodViewModel, Function1 function1, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = p2PListView;
        this.f$1 = selectContactMethodViewModel;
        this.f$2 = function1;
    }
}
