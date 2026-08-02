package androidx.compose.material3;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentScopeImpl;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.grid.GridItemSpan;
import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import androidx.compose.material3.internal.Icons$Filled;
import androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$labelScope$1$1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Latch$await$2$2;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.compose.ComposeNavigator;
import androidx.navigation.compose.DialogNavigator;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda5;
import com.squareup.cash.R;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarOverlay;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.borrow.viewmodels.BorrowHomeOverlayViewModel;
import com.squareup.cash.borrow.views.BorrowHomeKt;
import com.squareup.cash.borrow.views.BorrowHomeOverlayKt$BorrowHomeOverlay$1$1$3;
import com.squareup.cash.borrow.views.BulletinInfoOverlayKt;
import com.squareup.cash.borrow.views.LoanDetailsSheetKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda3;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.offers.viewmodels.itemviewmodels.LegacyOffersAvatarViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.OffersCommonOfferRowViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.OffersRowViewModel;
import com.squareup.cash.offers.views.collection.OffersCollectionListingKt$OffersCollectionListing$1$1$2$1$2$1$1;
import com.squareup.cash.payments.views.QuickPayViewKt$QuickPay$1$1$1$2$1$2$1$1;
import com.squareup.cash.payments.views.QuickPayViewKt$QuickPay$1$1$1$2$2$1$1;
import com.squareup.cash.shopping.views.search.ShopHubResultsListKt$$ExternalSyntheticLambda14;
import com.squareup.cash.ui.CashInsetsListenerKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public final class ButtonKt$Button$2 implements Function2 {
    public final /* synthetic */ Function2 $content;
    public final /* synthetic */ long $contentColor;
    public final /* synthetic */ Object $contentPadding;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ ButtonKt$Button$2(long j, Object obj, Function2 function2, int i) {
        this.$r8$classId = i;
        this.$contentColor = j;
        this.$contentPadding = obj;
        this.$content = function2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Object obj3 = this.$contentPadding;
        Object[] objArr = 0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Number) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Icons$Filled.m567ProvideContentColorTextStyle3JVO9M(this.$contentColor, ((Typography) gapComposer.consume(TypographyKt.LocalTypography)).labelLarge, Expect_jvmKt.rememberComposableLambda(417635459, new AnonymousClass1((int) (objArr == true ? 1 : 0), obj3, this.$content), gapComposer), gapComposer, MLKEMEngine.KyberPolyBytes);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Number) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Icons$Filled.m566Decoration3JVO9M(this.$contentColor, (TextStyle) obj3, this.$content, gapComposer2, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: androidx.compose.material3.ButtonKt$Button$2$1, reason: invalid class name */
    public final class AnonymousClass1 implements Function2 {
        public final Object $content;
        public final Object $contentPadding;
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ AnonymousClass1(int i, Object obj, Object obj2) {
            this.$r8$classId = i;
            this.$contentPadding = obj;
            this.$content = obj2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            Color m;
            long j;
            int i = this.$r8$classId;
            int i2 = 7;
            int i3 = 6;
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Object obj3 = this.$content;
            Object obj4 = this.$contentPadding;
            switch (i) {
                case 0:
                    Composer composer = (Composer) obj;
                    int intValue = ((Number) obj2).intValue();
                    GapComposer gapComposer = (GapComposer) composer;
                    if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                        Modifier padding = SpacerKt.padding(SizeKt.m275defaultMinSizeVpY3zN4(companion, ButtonDefaults.MinWidth, ButtonDefaults.MinHeight), (PaddingValues) obj4);
                        ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) obj3;
                        RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Center, Alignment.Companion.CenterVertically, gapComposer, 54);
                        int currentCompositeKeyHash = Updater.getCurrentCompositeKeyHash(gapComposer);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, padding);
                        ComposeUiNode.Companion.getClass();
                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                        if (gapComposer.applier == null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        gapComposer.startReusableNode();
                        if (gapComposer.inserting) {
                            gapComposer.createNode(layoutNode$Companion$Constructor$1);
                        } else {
                            gapComposer.useNode();
                        }
                        Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                        Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetCompositeKeyHash;
                        if (gapComposer.inserting || !Intrinsics.areEqual(gapComposer.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash, gapComposer, currentCompositeKeyHash, composeUiNode$Companion$SetModifier$1);
                        }
                        Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                        composableLambdaImpl.invoke((Object) RowScopeInstance.INSTANCE, (Object) gapComposer, (Object) 6);
                        gapComposer.end(true);
                    } else {
                        gapComposer.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                case 1:
                    Composer composer2 = (Composer) obj;
                    int intValue2 = ((Number) obj2).intValue();
                    String str = (String) obj3;
                    GapComposer gapComposer2 = (GapComposer) composer2;
                    if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                        String str2 = (String) obj4;
                        boolean changed = gapComposer2.changed(str2) | gapComposer2.changed(str);
                        String str3 = (String) obj4;
                        Object rememberedValue = gapComposer2.rememberedValue();
                        Object obj5 = rememberedValue;
                        if (changed || rememberedValue == neverEqualPolicy) {
                            UserJavascriptInterfaceBase$$ExternalSyntheticLambda5 userJavascriptInterfaceBase$$ExternalSyntheticLambda5 = new UserJavascriptInterfaceBase$$ExternalSyntheticLambda5(str3, str, true ? 1 : 0);
                            gapComposer2.updateRememberedValue(userJavascriptInterfaceBase$$ExternalSyntheticLambda5);
                            obj5 = userJavascriptInterfaceBase$$ExternalSyntheticLambda5;
                        }
                        TextKt.m561TextNvy7gAk(str2, SemanticsModifierKt.semantics(companion, false, (Function1) obj5), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, gapComposer2, 0, 0, 262140);
                    } else {
                        gapComposer2.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                case 2:
                    Composer composer3 = (Composer) obj;
                    int intValue3 = ((Number) obj2).intValue();
                    GapComposer gapComposer3 = (GapComposer) composer3;
                    if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                        IconKt.m534Iconww6aTOc((ImageVector) obj4, (String) obj3, null, 0L, gapComposer3, 0, 12);
                    } else {
                        gapComposer3.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                case 3:
                    String str4 = (String) obj4;
                    Composer composer4 = (Composer) obj;
                    int intValue4 = ((Number) obj2).intValue();
                    GapComposer gapComposer4 = (GapComposer) composer4;
                    if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                        boolean changed2 = gapComposer4.changed(str4);
                        Object rememberedValue2 = gapComposer4.rememberedValue();
                        if (changed2 || rememberedValue2 == neverEqualPolicy) {
                            rememberedValue2 = new androidx.compose.material.IconKt$$ExternalSyntheticLambda0(str4, i3);
                            gapComposer4.updateRememberedValue(rememberedValue2);
                        }
                        TextKt.m561TextNvy7gAk(str4, SemanticsModifierKt.semantics(companion, false, (Function1) rememberedValue2), ((DatePickerColors) obj3).navigationContentColor, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, gapComposer4, 0, 0, 262136);
                    } else {
                        gapComposer4.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                case 4:
                    Composer composer5 = (Composer) obj;
                    int intValue5 = ((Number) obj2).intValue();
                    GapComposer gapComposer5 = (GapComposer) composer5;
                    if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                        ComposableLambdaImpl composableLambdaImpl2 = (ComposableLambdaImpl) obj3;
                        ScaffoldKt$ScaffoldLayout$contentPadding$1$1 scaffoldKt$ScaffoldLayout$contentPadding$1$1 = (ScaffoldKt$ScaffoldLayout$contentPadding$1$1) obj4;
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                        int currentCompositeKeyHash2 = Updater.getCurrentCompositeKeyHash(gapComposer5);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer5.currentCompositionLocalScope();
                        Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer5, companion);
                        ComposeUiNode.Companion.getClass();
                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                        if (gapComposer5.applier == null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        gapComposer5.startReusableNode();
                        if (gapComposer5.inserting) {
                            gapComposer5.createNode(layoutNode$Companion$Constructor$12);
                        } else {
                            gapComposer5.useNode();
                        }
                        Updater.m576setimpl(gapComposer5, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                        Updater.m576setimpl(gapComposer5, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetCompositeKeyHash;
                        if (gapComposer5.inserting || !Intrinsics.areEqual(gapComposer5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash2, gapComposer5, currentCompositeKeyHash2, composeUiNode$Companion$SetModifier$12);
                        }
                        Updater.m576setimpl(gapComposer5, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                        composableLambdaImpl2.invoke((Object) scaffoldKt$ScaffoldLayout$contentPadding$1$1, (Object) gapComposer5, (Object) 6);
                        gapComposer5.end(true);
                    } else {
                        gapComposer5.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                case 5:
                    Composer composer6 = (Composer) obj;
                    int intValue6 = ((Number) obj2).intValue();
                    GapComposer gapComposer6 = (GapComposer) composer6;
                    if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                        MutableState mutableState = (MutableState) obj4;
                        Object rememberedValue3 = gapComposer6.rememberedValue();
                        if (rememberedValue3 == neverEqualPolicy) {
                            rememberedValue3 = new DateInputKt$$ExternalSyntheticLambda5(i2, mutableState);
                            gapComposer6.updateRememberedValue(rememberedValue3);
                        }
                        Modifier onGloballyPositioned = ValueInsets.onGloballyPositioned(companion, (Function1) rememberedValue3);
                        ComposableLambdaImpl composableLambdaImpl3 = (ComposableLambdaImpl) obj3;
                        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                        int currentCompositeKeyHash3 = Updater.getCurrentCompositeKeyHash(gapComposer6);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer6.currentCompositionLocalScope();
                        Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer6, onGloballyPositioned);
                        ComposeUiNode.Companion.getClass();
                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                        if (gapComposer6.applier == null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        gapComposer6.startReusableNode();
                        if (gapComposer6.inserting) {
                            gapComposer6.createNode(layoutNode$Companion$Constructor$13);
                        } else {
                            gapComposer6.useNode();
                        }
                        Updater.m576setimpl(gapComposer6, maybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                        Updater.m576setimpl(gapComposer6, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                        if (gapComposer6.inserting || !Intrinsics.areEqual(gapComposer6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash3, gapComposer6, currentCompositeKeyHash3, composeUiNode$Companion$SetModifier$13);
                        }
                        Updater.m576setimpl(gapComposer6, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                        Recorder$$ExternalSyntheticOutline2.m(0, composableLambdaImpl3, gapComposer6, true);
                    } else {
                        gapComposer6.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                case 6:
                    Composer composer7 = (Composer) obj;
                    int intValue7 = ((Number) obj2).intValue();
                    String str5 = (String) obj4;
                    GapComposer gapComposer7 = (GapComposer) composer7;
                    if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                        boolean changed3 = gapComposer7.changed(str5);
                        Object rememberedValue4 = gapComposer7.rememberedValue();
                        if (changed3 || rememberedValue4 == neverEqualPolicy) {
                            rememberedValue4 = new androidx.compose.material.IconKt$$ExternalSyntheticLambda0(str5, 9);
                            gapComposer7.updateRememberedValue(rememberedValue4);
                        }
                        Modifier semantics = SemanticsModifierKt.semantics(companion, false, (Function1) rememberedValue4);
                        ComposableLambdaImpl composableLambdaImpl4 = (ComposableLambdaImpl) obj3;
                        MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                        int currentCompositeKeyHash4 = Updater.getCurrentCompositeKeyHash(gapComposer7);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer7.currentCompositionLocalScope();
                        Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer7, semantics);
                        ComposeUiNode.Companion.getClass();
                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$14 = ComposeUiNode.Companion.Constructor;
                        if (gapComposer7.applier == null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        gapComposer7.startReusableNode();
                        if (gapComposer7.inserting) {
                            gapComposer7.createNode(layoutNode$Companion$Constructor$14);
                        } else {
                            gapComposer7.useNode();
                        }
                        Updater.m576setimpl(gapComposer7, maybeCachedBoxMeasurePolicy3, ComposeUiNode.Companion.SetMeasurePolicy);
                        Updater.m576setimpl(gapComposer7, currentCompositionLocalScope4, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetCompositeKeyHash;
                        if (gapComposer7.inserting || !Intrinsics.areEqual(gapComposer7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                            Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash4, gapComposer7, currentCompositeKeyHash4, composeUiNode$Companion$SetModifier$14);
                        }
                        Updater.m576setimpl(gapComposer7, materializeModifier4, ComposeUiNode.Companion.SetModifier);
                        Recorder$$ExternalSyntheticOutline2.m(0, composableLambdaImpl4, gapComposer7, true);
                    } else {
                        gapComposer7.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                case 7:
                    Composer composer8 = (Composer) obj;
                    int intValue8 = ((Number) obj2).intValue();
                    GapComposer gapComposer8 = (GapComposer) composer8;
                    if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                        ((Function3) obj4).invoke((TextFieldImplKt$CommonDecorationBox$3$labelScope$1$1) obj3, gapComposer8, 6);
                    } else {
                        gapComposer8.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                case 8:
                    Composer composer9 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2) {
                        GapComposer gapComposer9 = (GapComposer) composer9;
                        if (gapComposer9.getSkipping()) {
                            gapComposer9.skipToGroupEnd();
                            return Unit.INSTANCE;
                        }
                    }
                    ((DialogNavigator.Destination) obj4).content.invoke(obj3, (Object) composer9, (Object) 0);
                    return Unit.INSTANCE;
                case 9:
                    Composer composer10 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2) {
                        GapComposer gapComposer10 = (GapComposer) composer10;
                        if (gapComposer10.getSkipping()) {
                            gapComposer10.skipToGroupEnd();
                            return Unit.INSTANCE;
                        }
                    }
                    CashInsetsListenerKt.SaveableStateProvider((SaveableStateHolder) obj4, (ComposableLambdaImpl) obj3, composer10, 0);
                    return Unit.INSTANCE;
                case 10:
                    Composer composer11 = (Composer) obj;
                    NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj4;
                    if ((((Number) obj2).intValue() & 3) == 2) {
                        GapComposer gapComposer11 = (GapComposer) composer11;
                        if (gapComposer11.getSkipping()) {
                            gapComposer11.skipToGroupEnd();
                            return Unit.INSTANCE;
                        }
                    }
                    NavDestination navDestination = navBackStackEntry.destination;
                    navDestination.getClass();
                    ((ComposeNavigator.Destination) navDestination).content.invoke((AnimatedContentScopeImpl) obj3, navBackStackEntry, composer11, 0);
                    return Unit.INSTANCE;
                case 11:
                    Composer composer12 = (Composer) obj;
                    int intValue9 = ((Number) obj2).intValue();
                    Function1 function1 = (Function1) obj3;
                    BorrowHomeOverlayViewModel borrowHomeOverlayViewModel = (BorrowHomeOverlayViewModel) obj4;
                    GapComposer gapComposer12 = (GapComposer) composer12;
                    if (!gapComposer12.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                        gapComposer12.skipToGroupEnd();
                    } else if (borrowHomeOverlayViewModel instanceof BorrowHomeOverlayViewModel.BulletinInfo) {
                        gapComposer12.startReplaceGroup(-1763797473);
                        BulletinInfoOverlayKt.BulletinInfoOverlay((BorrowHomeOverlayViewModel.BulletinInfo) borrowHomeOverlayViewModel, new Latch$await$2$2(28, borrowHomeOverlayViewModel, function1), new QuickPayViewKt$QuickPay$1$1$1$2$2$1$1(2, function1), new BorrowHomeOverlayKt$BorrowHomeOverlay$1$1$3(false ? 1 : 0, function1), null, gapComposer12, 0);
                        gapComposer12.end(false);
                    } else if (borrowHomeOverlayViewModel instanceof BorrowHomeOverlayViewModel.LoanRepaymentSelection) {
                        gapComposer12.startReplaceGroup(-1763769799);
                        BorrowHomeKt.RepaymentSelectionSheet((BorrowHomeOverlayViewModel.LoanRepaymentSelection) borrowHomeOverlayViewModel, new BorrowHomeOverlayKt$BorrowHomeOverlay$1$1$3(i3, function1), null, gapComposer12, 0);
                        gapComposer12.end(false);
                    } else {
                        if (!(borrowHomeOverlayViewModel instanceof BorrowHomeOverlayViewModel.LoanDetails)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer12, -1763798937, false);
                        }
                        gapComposer12.startReplaceGroup(-1763766798);
                        LoanDetailsSheetKt.LoanDetailsSheet((BorrowHomeOverlayViewModel.LoanDetails) borrowHomeOverlayViewModel, new BorrowHomeOverlayKt$BorrowHomeOverlay$1$1$3(i2, function1), null, gapComposer12, 0);
                        gapComposer12.end(false);
                    }
                    return Unit.INSTANCE;
                case 12:
                    Composer composer13 = (Composer) obj;
                    int intValue10 = ((Number) obj2).intValue();
                    GapComposer gapComposer13 = (GapComposer) composer13;
                    if (gapComposer13.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                        ((ComposableLambdaImpl) obj3).invoke(obj4, (Object) gapComposer13, (Object) 0);
                    } else {
                        gapComposer13.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                case 13:
                    ((MutableState) obj4).setValue((String) obj);
                    ((MutableState) obj3).setValue((String) obj2);
                    return Unit.INSTANCE;
                case 14:
                    int intValue11 = ((Number) obj2).intValue();
                    return new GridItemSpan(((GridItemSpan) ((ArcadeModal$$ExternalSyntheticLambda3) obj4).invoke((LazyGridSpanLayoutProvider.LazyGridItemSpanScopeImpl) obj, Integer.valueOf(intValue11), ((List) obj3).get(intValue11))).packedValue);
                case 15:
                    Composer composer14 = (Composer) obj;
                    int intValue12 = ((Number) obj2).intValue();
                    GapComposer gapComposer14 = (GapComposer) composer14;
                    if (gapComposer14.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                        OffersRowViewModel offersRowViewModel = ((OffersCommonOfferRowViewModel) obj4).rowViewModel;
                        LegacyOffersAvatarViewModel legacyOffersAvatarViewModel = offersRowViewModel.avatar;
                        String str6 = (String) obj3;
                        AvatarSize avatarSize = AvatarSize.Size48;
                        Character ch = legacyOffersAvatarViewModel.monogram;
                        String valueOf = ch != null ? String.valueOf(ch.charValue()) : null;
                        if (valueOf == null) {
                            valueOf = "";
                        }
                        com.squareup.protos.cash.ui.Color color = legacyOffersAvatarViewModel.backgroundColor;
                        if (color == null) {
                            gapComposer14.startReplaceGroup(-1921901859);
                            gapComposer14.end(false);
                            m = null;
                        } else {
                            m = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer14, -2001659484, color, gapComposer14, false);
                        }
                        if (m == null) {
                            gapComposer14.startReplaceGroup(-2001657792);
                            Colors colors = (Colors) gapComposer14.consume(ArcadeThemeKt.LocalColors);
                            if (colors == null) {
                                colors = re$$ExternalSyntheticOutline0.m(gapComposer14, -1762997026, gapComposer14, false);
                            } else {
                                gapComposer14.startReplaceGroup(-1762997739);
                                gapComposer14.end(false);
                            }
                            j = colors.semantic.background.subtle;
                            gapComposer14.end(false);
                        } else {
                            gapComposer14.startReplaceGroup(-2001659962);
                            gapComposer14.end(false);
                            j = m.value;
                        }
                        long j2 = j;
                        AvatarImage.Remote.Image image = new AvatarImage.Remote.Image(str6, legacyOffersAvatarViewModel.colorizeImage, null, 0L, OffersCollectionListingKt$OffersCollectionListing$1$1$2$1$2$1$1.INSTANCE, 60);
                        Icons icons = Icons.Check16;
                        StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                        Colors colors2 = (Colors) gapComposer14.consume(staticProvidableCompositionLocal);
                        if (colors2 == null) {
                            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer14, -1762997026, gapComposer14, false);
                        } else {
                            gapComposer14.startReplaceGroup(-1762997739);
                            gapComposer14.end(false);
                        }
                        long j3 = colors2.semantic.background.subtle;
                        Colors colors3 = (Colors) gapComposer14.consume(staticProvidableCompositionLocal);
                        if (colors3 == null) {
                            colors3 = re$$ExternalSyntheticOutline0.m(gapComposer14, -1762997026, gapComposer14, false);
                        } else {
                            gapComposer14.startReplaceGroup(-1762997739);
                            gapComposer14.end(false);
                        }
                        TextViewKt.m3613AvatarB_rZmmc(avatarSize, valueOf, j2, (String) null, (Modifier) Modifier.Companion.$$INSTANCE, (AvatarImage) image, (Function2) null, (AvatarOverlay) (offersRowViewModel.showActiveBoostAvatarBadge ? new AvatarOverlay.LocalIcon(8, j3, colors3.semantic.icon.standard, icons) : null), false, 0L, (Composer) gapComposer14, 27654, 0, 1856);
                    } else {
                        gapComposer14.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                case 16:
                    Composer composer15 = (Composer) obj;
                    int intValue13 = ((Number) obj2).intValue();
                    Function1 function12 = (Function1) obj3;
                    DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) obj4;
                    GapComposer gapComposer15 = (GapComposer) composer15;
                    if (gapComposer15.shouldExecute(intValue13 & 1, (intValue13 & 3) != 2)) {
                        boolean changed4 = gapComposer15.changed(delegatingSoftwareKeyboardController) | gapComposer15.changed(function12);
                        Object rememberedValue5 = gapComposer15.rememberedValue();
                        if (changed4 || rememberedValue5 == neverEqualPolicy) {
                            rememberedValue5 = new QuickPayViewKt$QuickPay$1$1$1$2$1$2$1$1(delegatingSoftwareKeyboardController, function12, 1);
                            gapComposer15.updateRememberedValue(rememberedValue5);
                        }
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4088, 0L, (Composer) gapComposer15, ImageKt.m183clickableoSLSa3U$default(Modifier.Companion.$$INSTANCE, false, null, null, (Function0) rememberedValue5, 15), ((com.squareup.cash.arcade.Typography) gapComposer15.consume(ArcadeThemeKt.LocalTypography)).labelMedium, (TextLineBalancing) null, Room.stringResource(gapComposer15, R.string.personalize_payment_tooltip), (Map) null, (Function1) null, false);
                    } else {
                        gapComposer15.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                case 17:
                    int intValue14 = ((Number) obj2).intValue();
                    return new GridItemSpan(((GridItemSpan) ((ShopHubResultsListKt$$ExternalSyntheticLambda14) obj4).invoke((LazyGridSpanLayoutProvider.LazyGridItemSpanScopeImpl) obj, Integer.valueOf(intValue14), ((ArrayList) obj3).get(intValue14))).packedValue);
                default:
                    return Boolean.valueOf(Intrinsics.areEqual((DeclarationDescriptor) obj, (CallableDescriptor) obj4) && Intrinsics.areEqual((DeclarationDescriptor) obj2, (CallableDescriptor) obj3));
            }
        }

        public /* synthetic */ AnonymousClass1(ComposableLambdaImpl composableLambdaImpl, Object obj, int i) {
            this.$r8$classId = i;
            this.$content = composableLambdaImpl;
            this.$contentPadding = obj;
        }
    }
}
