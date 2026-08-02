package com.squareup.cash.money.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import app.cash.broadway.ui.compose.UiScope;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.money.viewmodels.MoneyTabModel;
import com.squareup.cash.performance.RealScrollPerformanceTrackerFactory;
import com.squareup.cash.work.viewmodels.ClockInOverlayViewModel;
import com.squareup.cash.work.views.clockin.DisclaimerTextKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes6.dex */
public final /* synthetic */ class MoneyTabUIKt$$ExternalSyntheticLambda22 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ boolean f$10;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ boolean f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ int f$6;
    public final /* synthetic */ Function1 f$7;
    public final /* synthetic */ Function0 f$8;
    public final /* synthetic */ Object f$9;

    public /* synthetic */ MoneyTabUIKt$$ExternalSyntheticLambda22(UiScope uiScope, Modifier modifier, MoneyTabModel.Loaded loaded, boolean z, RealScrollPerformanceTrackerFactory realScrollPerformanceTrackerFactory, CoroutineScope coroutineScope, int i, Function1 function1, Function0 function0, ElementBoundsRegistry elementBoundsRegistry, boolean z2, int i2) {
        this.f$0 = uiScope;
        this.f$1 = modifier;
        this.f$2 = loaded;
        this.f$3 = z;
        this.f$4 = realScrollPerformanceTrackerFactory;
        this.f$5 = coroutineScope;
        this.f$6 = i;
        this.f$7 = function1;
        this.f$8 = function0;
        this.f$9 = elementBoundsRegistry;
        this.f$10 = z2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Object obj3 = this.f$9;
        Object obj4 = this.f$5;
        Object obj5 = this.f$4;
        Object obj6 = this.f$2;
        Object obj7 = this.f$1;
        Object obj8 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(49);
                MoneyTabUIKt.MoneyTabLoaded((UiScope) obj8, (Modifier) obj7, (MoneyTabModel.Loaded) obj6, this.f$3, (RealScrollPerformanceTrackerFactory) obj5, (CoroutineScope) obj4, this.f$6, this.f$7, this.f$8, (ElementBoundsRegistry) obj3, this.f$10, (Composer) obj, updateChangedFlags);
                break;
            default:
                ((Integer) obj2).intValue();
                int updateChangedFlags2 = Updater.updateChangedFlags(this.f$6 | 1);
                DisclaimerTextKt.ClockInOverlayFooter((ClockInOverlayViewModel.Loaded) obj8, this.f$3, this.f$10, this.f$8, (Function0) obj7, (Function0) obj6, (Function0) obj5, (Function0) obj4, (Function0) obj3, this.f$7, (Composer) obj, updateChangedFlags2);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ MoneyTabUIKt$$ExternalSyntheticLambda22(ClockInOverlayViewModel.Loaded loaded, boolean z, boolean z2, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function0 function06, Function1 function1, int i) {
        this.f$0 = loaded;
        this.f$3 = z;
        this.f$10 = z2;
        this.f$8 = function0;
        this.f$1 = function02;
        this.f$2 = function03;
        this.f$4 = function04;
        this.f$5 = function05;
        this.f$9 = function06;
        this.f$7 = function1;
        this.f$6 = i;
    }
}
