package com.squareup.cash.profile.views.notifications;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import coil3.compose.LocalImageLoaderKt;
import com.squareup.cash.p2pblocking.views.P2PListView;
import com.squareup.cash.profile.viewmodels.CategoryListViewModel;
import com.squareup.cash.profile.views.ErrorView$$ExternalSyntheticLambda0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class CategoryListView$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ P2PListView f$0;
    public final /* synthetic */ CategoryListViewModel f$1;
    public final /* synthetic */ Function1 f$2;

    public /* synthetic */ CategoryListView$$ExternalSyntheticLambda0(P2PListView p2PListView, CategoryListViewModel categoryListViewModel, Function1 function1) {
        this.f$0 = p2PListView;
        this.f$1 = categoryListViewModel;
        this.f$2 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$2;
        CategoryListViewModel categoryListViewModel = this.f$1;
        P2PListView p2PListView = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(p2PListView.imageLoader), Expect_jvmKt.rememberComposableLambda(-488276680, new ErrorView$$ExternalSyntheticLambda0(19, (Object) categoryListViewModel, (Object) function1), gapComposer), gapComposer, 56);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                num.getClass();
                p2PListView.Content(categoryListViewModel, function1, composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ CategoryListView$$ExternalSyntheticLambda0(P2PListView p2PListView, CategoryListViewModel categoryListViewModel, Function1 function1, int i) {
        this.f$0 = p2PListView;
        this.f$1 = categoryListViewModel;
        this.f$2 = function1;
    }
}
