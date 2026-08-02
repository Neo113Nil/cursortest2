package com.squareup.cash.investing.components.search;

import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.focus.FocusRequester;
import coil3.RealImageLoader;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda5;
import com.squareup.cash.investing.viewmodels.search.InvestingSearchViewModel;
import com.squareup.cash.p2pblocking.views.P2PListView;
import com.squareup.cash.shopping.views.BrandsSearchView$$ExternalSyntheticLambda4;
import com.squareup.cash.shopping.views.BrandsSearchView$$ExternalSyntheticLambda9;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import net.idrnd.face.iad.capture.internal.s2;

/* loaded from: classes6.dex */
public final /* synthetic */ class InvestingSearchView$$ExternalSyntheticLambda3 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ InvestingSearchViewModel f$0;
    public final /* synthetic */ P2PListView f$1;
    public final /* synthetic */ Function1 f$2;
    public final /* synthetic */ MutableState f$3;
    public final /* synthetic */ View f$4;
    public final /* synthetic */ FocusRequester f$5;

    public /* synthetic */ InvestingSearchView$$ExternalSyntheticLambda3(InvestingSearchViewModel investingSearchViewModel, P2PListView p2PListView, Function1 function1, MutableState mutableState, View view, FocusRequester focusRequester, int i) {
        this.$r8$classId = i;
        this.f$0 = investingSearchViewModel;
        this.f$1 = p2PListView;
        this.f$2 = function1;
        this.f$3 = mutableState;
        this.f$4 = view;
        this.f$5 = focusRequester;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                    Updater.CompositionLocalProvider(new ProvidedValue[0], Expect_jvmKt.rememberComposableLambda(2014283553, new InvestingSearchView$$ExternalSyntheticLambda3(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, 1), gapComposer), gapComposer, 48);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    MutableState mutableState = this.f$3;
                    String str = (String) mutableState.getValue();
                    RealImageLoader realImageLoader = this.f$1.imageLoader;
                    boolean changed = gapComposer2.changed(mutableState);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    Object obj3 = Composer.Companion.Empty;
                    if (changed || rememberedValue == obj3) {
                        rememberedValue = new CaptureCheckFaceKt$$ExternalSyntheticLambda5(28, mutableState);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    Function1 function1 = (Function1) rememberedValue;
                    View view = this.f$4;
                    boolean changedInstance = gapComposer2.changedInstance(view);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (changedInstance || rememberedValue2 == obj3) {
                        rememberedValue2 = new BrandsSearchView$$ExternalSyntheticLambda9(view, 1);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    Function0 function0 = (Function0) rememberedValue2;
                    boolean changedInstance2 = gapComposer2.changedInstance(view);
                    Object rememberedValue3 = gapComposer2.rememberedValue();
                    if (changedInstance2 || rememberedValue3 == obj3) {
                        rememberedValue3 = new BrandsSearchView$$ExternalSyntheticLambda4(view, 3);
                        gapComposer2.updateRememberedValue(rememberedValue3);
                    }
                    s2.InvestingSearch(str, this.f$0, this.f$2, function1, realImageLoader, function0, (Function1) rememberedValue3, this.f$5, gapComposer2, 12582976);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
