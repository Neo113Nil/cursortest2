package com.squareup.cash.arcade.components;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.datastore.core.SimpleActor;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.broadway.ui.compose.ToolbarConfig;
import app.cash.local.views.internal.LocalMapKt;
import com.squareup.cash.activity.views.AvatarsKt;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.core.navigationcontainer.UiContainerKt;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.paychecks.viewmodels.DistributionWheelViewModel;
import com.squareup.cash.paychecks.views.HelpSheetViewKt;
import com.squareup.cash.paychecks.views.PaycheckDistributionWheel$PlacementConfig;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewModel;
import com.squareup.cash.tabs.views.MoneybotToolbarSharedElementConfig;
import com.squareup.cash.tabs.views.SharedToolbarSwipeScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.time.Duration;

/* loaded from: classes5.dex */
public final /* synthetic */ class ToastKt$$ExternalSyntheticLambda3 implements Function2 {
    public final /* synthetic */ int $r8$classId = 3;
    public final /* synthetic */ Modifier f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ int f$10;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Object f$6;
    public final /* synthetic */ Object f$7;
    public final /* synthetic */ int f$9;

    public /* synthetic */ ToastKt$$ExternalSyntheticLambda3(ComposableLambdaImpl composableLambdaImpl, Function2 function2, String str, Modifier modifier, Icons icons, CopyCodeState copyCodeState, Function1 function1, int i, int i2) {
        this.f$1 = composableLambdaImpl;
        this.f$4 = function2;
        this.f$2 = str;
        this.f$0 = modifier;
        this.f$3 = icons;
        this.f$6 = copyCodeState;
        this.f$7 = function1;
        this.f$9 = i;
        this.f$10 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Object obj3 = this.f$1;
        int i2 = this.f$9;
        Object obj4 = this.f$7;
        Object obj5 = this.f$6;
        Object obj6 = this.f$3;
        Object obj7 = this.f$4;
        Object obj8 = this.f$2;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                ModalKt.m3381ToastBAHpl2s(this.f$0, this.f$1, (String) obj8, (Function3) obj6, (String) obj7, (Function0) obj5, (Duration) obj4, (Composer) obj, updateChangedFlags, this.f$10);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(i2 | 1);
                LocalMapKt.LocalAsyncImage(this.f$0, (Modifier) obj3, (String) obj8, (ContentScale) obj5, (Alignment) obj4, (String) obj7, (Function3) obj6, (Composer) obj, updateChangedFlags2, this.f$10);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int updateChangedFlags3 = Updater.updateChangedFlags(i2 | 1);
                AvatarsKt.ActivityScrollableEmbeddedView((UiCallbackModel) obj3, this.f$0, (LazyListState) obj8, (PaddingValues) obj7, (Function3) obj6, (Function2) obj5, (Function3) obj4, (Composer) obj, updateChangedFlags3, this.f$10);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int updateChangedFlags4 = Updater.updateChangedFlags(i2 | 1);
                CopyCodeKt.CopyCode((ComposableLambdaImpl) obj3, (Function2) obj7, (String) obj8, this.f$0, (Icons) obj6, (CopyCodeState) obj5, (Function1) obj4, (Composer) obj, updateChangedFlags4, this.f$10);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int updateChangedFlags5 = Updater.updateChangedFlags(i2 | 1);
                UiContainerKt.ContainerTabToolbar((ToolbarConfig) obj3, (TabToolbarInternalViewModel) obj8, (ElementBoundsRegistry) obj7, (MoneybotToolbarSharedElementConfig) obj6, (SimpleActor) obj5, this.f$0, (SharedToolbarSwipeScope) obj4, (Composer) obj, updateChangedFlags5, this.f$10);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags6 = Updater.updateChangedFlags(i2 | 1);
                HelpSheetViewKt.PaycheckDistributionWheel((DistributionWheelViewModel) obj3, (PaycheckDistributionWheel$PlacementConfig) obj8, this.f$0, (Function1) obj7, (Function2) obj6, (Function2) obj5, (Function2) obj4, (Composer) obj, updateChangedFlags6, this.f$10);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ToastKt$$ExternalSyntheticLambda3(Modifier modifier, Modifier modifier2, String str, ContentScale contentScale, Alignment alignment, String str2, Function3 function3, int i, int i2) {
        this.f$0 = modifier;
        this.f$1 = modifier2;
        this.f$2 = str;
        this.f$6 = contentScale;
        this.f$7 = alignment;
        this.f$4 = str2;
        this.f$3 = function3;
        this.f$9 = i;
        this.f$10 = i2;
    }

    public /* synthetic */ ToastKt$$ExternalSyntheticLambda3(Modifier modifier, Object obj, String str, Function3 function3, String str2, Function0 function0, Duration duration, int i, int i2) {
        this.f$0 = modifier;
        this.f$1 = obj;
        this.f$2 = str;
        this.f$3 = function3;
        this.f$4 = str2;
        this.f$6 = function0;
        this.f$7 = duration;
        this.f$9 = i;
        this.f$10 = i2;
    }

    public /* synthetic */ ToastKt$$ExternalSyntheticLambda3(UiCallbackModel uiCallbackModel, Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, Function3 function3, Function2 function2, Function3 function32, int i, int i2) {
        this.f$1 = uiCallbackModel;
        this.f$0 = modifier;
        this.f$2 = lazyListState;
        this.f$4 = paddingValues;
        this.f$3 = function3;
        this.f$6 = function2;
        this.f$7 = function32;
        this.f$9 = i;
        this.f$10 = i2;
    }

    public /* synthetic */ ToastKt$$ExternalSyntheticLambda3(ToolbarConfig toolbarConfig, TabToolbarInternalViewModel tabToolbarInternalViewModel, ElementBoundsRegistry elementBoundsRegistry, MoneybotToolbarSharedElementConfig moneybotToolbarSharedElementConfig, SimpleActor simpleActor, Modifier modifier, SharedToolbarSwipeScope sharedToolbarSwipeScope, int i, int i2) {
        this.f$1 = toolbarConfig;
        this.f$2 = tabToolbarInternalViewModel;
        this.f$4 = elementBoundsRegistry;
        this.f$3 = moneybotToolbarSharedElementConfig;
        this.f$6 = simpleActor;
        this.f$0 = modifier;
        this.f$7 = sharedToolbarSwipeScope;
        this.f$9 = i;
        this.f$10 = i2;
    }

    public /* synthetic */ ToastKt$$ExternalSyntheticLambda3(DistributionWheelViewModel distributionWheelViewModel, PaycheckDistributionWheel$PlacementConfig paycheckDistributionWheel$PlacementConfig, Modifier modifier, Function1 function1, Function2 function2, Function2 function22, Function2 function23, int i, int i2) {
        this.f$1 = distributionWheelViewModel;
        this.f$2 = paycheckDistributionWheel$PlacementConfig;
        this.f$0 = modifier;
        this.f$4 = function1;
        this.f$3 = function2;
        this.f$6 = function22;
        this.f$7 = function23;
        this.f$9 = i;
        this.f$10 = i2;
    }
}
