package com.squareup.cash.globalsearch.views;

import androidx.compose.foundation.GestureNodeKt$$ExternalSyntheticLambda0;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.material.DrawerKt$$ExternalSyntheticLambda1;
import androidx.compose.material3.DateInputKt$$ExternalSyntheticLambda5;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.Worker$$ExternalSyntheticLambda0;
import app.cash.broadway.ui.compose.UiScope;
import app.cash.local.viewmodels.LocalBrandLocationMenuViewModel;
import app.cash.local.viewmodels.internal.MenuSelectorOption;
import app.cash.local.views.brand.menu.LocalCaloriesTextKt;
import bo.app.l2$$ExternalSyntheticLambda7;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import com.squareup.cash.arcade.components.SearchBarKeyboardState;
import com.squareup.cash.collapsingtoolbar.views.CollapsingToolbarScaffoldState;
import com.squareup.cash.collapsingtoolbar.views.CollapsingToolbarScopeInstance;
import com.squareup.cash.common.composeui.LocalCashVibratorKt;
import com.squareup.cash.globalsearch.viewmodels.GlobalSearchViewModel;
import com.squareup.cash.ui.util.RealCashVibrator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes6.dex */
public final /* synthetic */ class GlobalSearchViewKt$$ExternalSyntheticLambda0 implements Function3 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ Object f$6;
    public final /* synthetic */ Function1 f$7;
    public final /* synthetic */ LazyListState f$8;

    public /* synthetic */ GlobalSearchViewKt$$ExternalSyntheticLambda0(RealImageLoader realImageLoader, RealCashVibrator realCashVibrator, GlobalSearchViewModel globalSearchViewModel, FocusRequester focusRequester, TextFieldState textFieldState, SearchBarKeyboardState searchBarKeyboardState, Function1 function1, LazyListState lazyListState) {
        this.f$0 = realImageLoader;
        this.f$1 = realCashVibrator;
        this.f$3 = globalSearchViewModel;
        this.f$4 = focusRequester;
        this.f$5 = textFieldState;
        this.f$6 = searchBarKeyboardState;
        this.f$7 = function1;
        this.f$8 = lazyListState;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        Object obj4 = this.f$6;
        Object obj5 = this.f$5;
        Object obj6 = this.f$4;
        Object obj7 = this.f$3;
        Object obj8 = this.f$1;
        Object obj9 = this.f$0;
        switch (i) {
            case 0:
                RealImageLoader realImageLoader = (RealImageLoader) obj9;
                RealCashVibrator realCashVibrator = (RealCashVibrator) obj8;
                GlobalSearchViewModel globalSearchViewModel = (GlobalSearchViewModel) obj7;
                FocusRequester focusRequester = (FocusRequester) obj6;
                TextFieldState textFieldState = (TextFieldState) obj5;
                SearchBarKeyboardState searchBarKeyboardState = (SearchBarKeyboardState) obj4;
                UiScope uiScope = (UiScope) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                uiScope.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(uiScope) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    Updater.CompositionLocalProvider(new ProvidedValue[]{LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), LocalCashVibratorKt.LocalCashVibrator.defaultProvidedValue$runtime(realCashVibrator)}, Expect_jvmKt.rememberComposableLambda(1467301566, new GlobalSearchViewKt$$ExternalSyntheticLambda2(globalSearchViewModel, uiScope, focusRequester, textFieldState, searchBarKeyboardState, this.f$7, this.f$8, 0), gapComposer), gapComposer, 56);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Object obj10 = (CollapsingToolbarScaffoldState) obj9;
                LocalBrandLocationMenuViewModel localBrandLocationMenuViewModel = (LocalBrandLocationMenuViewModel) obj8;
                Object obj11 = (CoroutineScope) obj7;
                Object obj12 = (LazyGridState) obj6;
                MutableState mutableState = (MutableState) obj5;
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) obj4;
                CollapsingToolbarScopeInstance collapsingToolbarScopeInstance = (CollapsingToolbarScopeInstance) obj;
                int intValue2 = ((Integer) obj3).intValue();
                collapsingToolbarScopeInstance.getClass();
                GapComposer gapComposer2 = (GapComposer) ((Composer) obj2);
                boolean changed = gapComposer2.changed(obj10);
                Object rememberedValue = gapComposer2.rememberedValue();
                Object obj13 = Composer.Companion.Empty;
                if (changed || rememberedValue == obj13) {
                    rememberedValue = new Worker$$ExternalSyntheticLambda0(obj10, 25);
                    gapComposer2.updateRememberedValue(rememberedValue);
                }
                Function0 function0 = (Function0) rememberedValue;
                boolean z = localBrandLocationMenuViewModel.isSearching;
                Function1 function1 = this.f$7;
                if (z) {
                    gapComposer2.startReplaceGroup(646629584);
                    boolean changed2 = gapComposer2.changed(function1);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (changed2 || rememberedValue2 == obj13) {
                        rememberedValue2 = new GestureNodeKt$$ExternalSyntheticLambda0(22, function1);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    Function1 function12 = (Function1) rememberedValue2;
                    boolean changedInstance = gapComposer2.changedInstance(obj11) | gapComposer2.changed(obj12) | gapComposer2.changed(obj10) | gapComposer2.changed(function1);
                    Object rememberedValue3 = gapComposer2.rememberedValue();
                    if (changedInstance || rememberedValue3 == obj13) {
                        Object l2__externalsyntheticlambda7 = new l2$$ExternalSyntheticLambda7(obj11, function1, obj12, obj10, 9);
                        gapComposer2.updateRememberedValue(l2__externalsyntheticlambda7);
                        rememberedValue3 = l2__externalsyntheticlambda7;
                    }
                    LocalCaloriesTextKt.CategorySearchBar(collapsingToolbarScopeInstance, function12, (Function0) rememberedValue3, gapComposer2, intValue2 & 14);
                    gapComposer2.end(false);
                } else {
                    gapComposer2.startReplaceGroup(647049045);
                    int intValue3 = parcelableSnapshotMutableIntState.getIntValue();
                    List list = localBrandLocationMenuViewModel.menuCategories;
                    boolean changed3 = gapComposer2.changed(mutableState);
                    Object rememberedValue4 = gapComposer2.rememberedValue();
                    int i2 = 16;
                    if (changed3 || rememberedValue4 == obj13) {
                        rememberedValue4 = new DateInputKt$$ExternalSyntheticLambda5(i2, mutableState);
                        gapComposer2.updateRememberedValue(rememberedValue4);
                    }
                    LocalCaloriesTextKt.CategoryChipsHeader(collapsingToolbarScopeInstance, function0, intValue3, this.f$8, list, (Function1) rememberedValue4, gapComposer2, intValue2 & 14);
                    List list2 = localBrandLocationMenuViewModel.menuOptions;
                    MenuSelectorOption menuSelectorOption = localBrandLocationMenuViewModel.selectedMenuOption;
                    float floatValue = ((Number) function0.invoke()).floatValue() < 0.1f ? RecyclerView.DECELERATION_RATE : ((Number) function0.invoke()).floatValue();
                    boolean changed4 = gapComposer2.changed(function1);
                    Object rememberedValue5 = gapComposer2.rememberedValue();
                    if (changed4 || rememberedValue5 == obj13) {
                        rememberedValue5 = new DrawerKt$$ExternalSyntheticLambda1(function1, false, 15);
                        gapComposer2.updateRememberedValue(rememberedValue5);
                    }
                    Function0 function02 = (Function0) rememberedValue5;
                    boolean changed5 = gapComposer2.changed(function1);
                    Object rememberedValue6 = gapComposer2.rememberedValue();
                    if (changed5 || rememberedValue6 == obj13) {
                        rememberedValue6 = new DrawerKt$$ExternalSyntheticLambda1(function1, false, 16);
                        gapComposer2.updateRememberedValue(rememberedValue6);
                    }
                    Function0 function03 = (Function0) rememberedValue6;
                    boolean changed6 = gapComposer2.changed(function1);
                    Object rememberedValue7 = gapComposer2.rememberedValue();
                    if (changed6 || rememberedValue7 == obj13) {
                        rememberedValue7 = new DrawerKt$$ExternalSyntheticLambda1(function1, false, 17);
                        gapComposer2.updateRememberedValue(rememberedValue7);
                    }
                    LocalCaloriesTextKt.ToolbarWithMenuSelector(list2, menuSelectorOption, floatValue, function02, function03, (Function0) rememberedValue7, gapComposer2, 0);
                    gapComposer2.end(false);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ GlobalSearchViewKt$$ExternalSyntheticLambda0(CollapsingToolbarScaffoldState collapsingToolbarScaffoldState, LocalBrandLocationMenuViewModel localBrandLocationMenuViewModel, Function1 function1, CoroutineScope coroutineScope, LazyGridState lazyGridState, LazyListState lazyListState, MutableState mutableState, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState) {
        this.f$0 = collapsingToolbarScaffoldState;
        this.f$1 = localBrandLocationMenuViewModel;
        this.f$7 = function1;
        this.f$3 = coroutineScope;
        this.f$4 = lazyGridState;
        this.f$8 = lazyListState;
        this.f$5 = mutableState;
        this.f$6 = parcelableSnapshotMutableIntState;
    }
}
