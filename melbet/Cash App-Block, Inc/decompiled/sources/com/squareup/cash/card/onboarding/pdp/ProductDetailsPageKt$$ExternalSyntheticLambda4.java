package com.squareup.cash.card.onboarding.pdp;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import com.squareup.cash.card.onboarding.ProductDetailsPageViewModel;
import com.squareup.cash.money.applets.common.views.LoadingAppletTileLayoutConfig;
import com.squareup.cash.money.applets.common.views.SharedUIKt;
import com.squareup.cash.money.viewmodels.InstalledAppletTileHeaderModel;
import com.squareup.util.Strings;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class ProductDetailsPageKt$$ExternalSyntheticLambda4 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ boolean f$2;
    public final /* synthetic */ float f$3;
    public final /* synthetic */ Function f$4;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ int f$6;
    public final /* synthetic */ int f$7;

    public /* synthetic */ ProductDetailsPageKt$$ExternalSyntheticLambda4(ProductDetailsPageViewModel productDetailsPageViewModel, Modifier modifier, boolean z, float f, Function1 function1, Function1 function12, int i, int i2) {
        this.f$0 = productDetailsPageViewModel;
        this.f$1 = modifier;
        this.f$2 = z;
        this.f$3 = f;
        this.f$4 = function1;
        this.f$5 = function12;
        this.f$6 = i;
        this.f$7 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Object obj3 = this.f$0;
        int i2 = this.f$6;
        Object obj4 = this.f$5;
        Function function = this.f$4;
        Object obj5 = this.f$1;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                HeroSectionKt.m3444ProductDetailsPageContentjIwJxvA((ProductDetailsPageViewModel) obj3, (Modifier) obj5, this.f$2, this.f$3, (Function1) function, (Function1) obj4, (Composer) obj, updateChangedFlags, this.f$7);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(i2 | 1);
                Strings.m3984LoadableSheetContentosbwsH8(this.f$0, this.f$2, this.f$3, (Modifier) obj5, (Function1) function, (ComposableLambdaImpl) obj4, (Composer) obj, updateChangedFlags2, this.f$7);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags3 = Updater.updateChangedFlags(i2 | 1);
                SharedUIKt.m3605LoadingAppletTileWHejsw((InstalledAppletTileHeaderModel) obj3, (ComposableLambdaImpl) obj5, (Function0) function, this.f$2, this.f$3, (LoadingAppletTileLayoutConfig) obj4, (Composer) obj, updateChangedFlags3, this.f$7);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ProductDetailsPageKt$$ExternalSyntheticLambda4(InstalledAppletTileHeaderModel installedAppletTileHeaderModel, ComposableLambdaImpl composableLambdaImpl, Function0 function0, boolean z, float f, LoadingAppletTileLayoutConfig loadingAppletTileLayoutConfig, int i, int i2) {
        this.f$0 = installedAppletTileHeaderModel;
        this.f$1 = composableLambdaImpl;
        this.f$4 = function0;
        this.f$2 = z;
        this.f$3 = f;
        this.f$5 = loadingAppletTileLayoutConfig;
        this.f$6 = i;
        this.f$7 = i2;
    }

    public /* synthetic */ ProductDetailsPageKt$$ExternalSyntheticLambda4(Object obj, boolean z, float f, Modifier modifier, Function1 function1, ComposableLambdaImpl composableLambdaImpl, int i, int i2) {
        this.f$0 = obj;
        this.f$2 = z;
        this.f$3 = f;
        this.f$1 = modifier;
        this.f$4 = function1;
        this.f$5 = composableLambdaImpl;
        this.f$6 = i;
        this.f$7 = i2;
    }
}
