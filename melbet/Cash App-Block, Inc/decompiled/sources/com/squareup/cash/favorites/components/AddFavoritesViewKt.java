package com.squareup.cash.favorites.components;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.core.TransitionKt$$ExternalSyntheticLambda9;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$Center$1;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.TextFieldStateKt;
import androidx.compose.material.SwipeToDismissKt$$ExternalSyntheticLambda3;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.broadway.ui.compose.DialogEventHandlerKt;
import app.cash.inputfieldtext.InputFieldText;
import app.cash.inputfieldtext.composeui.TextFieldStateInputFieldText;
import app.cash.local.views.internal.DismissableToastKt$$ExternalSyntheticLambda3;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.R;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.SearchBarKeyboardState;
import com.squareup.cash.arcade.components.SearchBarKt;
import com.squareup.cash.arcade.components.ShowNavigationBack;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda4;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.contacts.components.SyncContactsRowKt;
import com.squareup.cash.dialog.ArcadeModal2Kt$$ExternalSyntheticLambda0;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda3;
import com.squareup.cash.earnings.views.home.EarningsHeaderKt$$ExternalSyntheticLambda9;
import com.squareup.cash.earnings.views.home.EarningsHomeKt$$ExternalSyntheticLambda9;
import com.squareup.cash.family.familyhub.views.FamilyHomeSectionsKt$$ExternalSyntheticLambda6;
import com.squareup.cash.family.familyhub.views.FamilyMemberRowKt$$ExternalSyntheticLambda5;
import com.squareup.cash.family.safetyhub.views.SafetyHubViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.family.safetyhub.views.SafetyHubViewKt$$ExternalSyntheticLambda9;
import com.squareup.cash.favorites.viewmodels.AddFavoritesViewModel;
import com.squareup.cash.favorites.viewmodels.FavoriteAddedViewModel;
import com.squareup.cash.favorites.viewmodels.FavoriteAvatar;
import com.squareup.cash.favorites.viewmodels.FavoritesMessageViewModel;
import com.squareup.cash.favorites.viewmodels.ListFavoritesViewModel;
import com.squareup.cash.formview.components.FormCashtag$8$$ExternalSyntheticLambda0;
import com.squareup.cash.formview.components.FormRemoteImageKt$$ExternalSyntheticLambda0;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda10;
import com.squareup.cash.history.views.ErrorView$$ExternalSyntheticLambda3;
import com.squareup.cash.money.views.ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda5;
import com.squareup.cash.money.views.MoneyUiFactory$$ExternalSyntheticLambda1;
import com.squareup.cash.moneybot.widgets.ComposerKt$$ExternalSyntheticLambda14;
import com.squareup.cash.mooncake.components.MooncakePillButton;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.music.views.MusicViewKt$LoadedMusicContent$1$1;
import com.squareup.cash.pools.views.PoolInvitePeopleListViewKt$$ExternalSyntheticLambda19;
import com.squareup.cash.profile.views.GenericProfileElementsViewKt$$ExternalSyntheticLambda12;
import com.squareup.cash.sheet.BasicShieetKt$$ExternalSyntheticLambda0;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.Region;
import com.squareup.util.cash.Countries;
import com.stripe.android.uicore.elements.TextFieldUIKt$$ExternalSyntheticLambda14;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class AddFavoritesViewKt {
    public static final ComposableLambdaImpl lambda$1087698175 = new ComposableLambdaImpl(new AddFavoritesViewKt$$ExternalSyntheticLambda15(20), false, 1087698175);
    public static final ComposableLambdaImpl lambda$1745929000 = new ComposableLambdaImpl(new AddFavoritesViewKt$$ExternalSyntheticLambda15(21), false, 1745929000);
    public static final ComposableLambdaImpl lambda$1500795592 = new ComposableLambdaImpl(new AddFavoritesViewKt$$ExternalSyntheticLambda15(22), false, 1500795592);
    public static final ComposableLambdaImpl lambda$1842087485 = new ComposableLambdaImpl(new AddFavoritesViewKt$$ExternalSyntheticLambda15(23), false, 1842087485);

    /* renamed from: lambda$-411493287, reason: not valid java name */
    public static final ComposableLambdaImpl f421lambda$411493287 = new ComposableLambdaImpl(new AddFavoritesViewKt$$ExternalSyntheticLambda15(24), false, -411493287);
    public static final ComposableLambdaImpl lambda$171959064 = new ComposableLambdaImpl(new AddFavoritesViewKt$$ExternalSyntheticLambda15(25), false, 171959064);

    /* renamed from: lambda$-1586617614, reason: not valid java name */
    public static final ComposableLambdaImpl f420lambda$1586617614 = new ComposableLambdaImpl(new ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda5(17), false, -1586617614);
    public static final ComposableLambdaImpl lambda$1976177665 = new ComposableLambdaImpl(new AddFavoritesViewKt$$ExternalSyntheticLambda15(26), false, 1976177665);

    /* renamed from: lambda$-1294107366, reason: not valid java name */
    public static final ComposableLambdaImpl f419lambda$1294107366 = new ComposableLambdaImpl(new AddFavoritesViewKt$$ExternalSyntheticLambda15(27), false, -1294107366);
    public static final ComposableLambdaImpl lambda$2083666863 = new ComposableLambdaImpl(new FamilyHomeSectionsKt$$ExternalSyntheticLambda6(18), false, 2083666863);
    public static final ComposableLambdaImpl lambda$811657249 = new ComposableLambdaImpl(new AddFavoritesViewKt$$ExternalSyntheticLambda15(28), false, 811657249);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v8 */
    public static final void AddFavorites(AddFavoritesViewModel addFavoritesViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        AddFavoritesViewModel addFavoritesViewModel2;
        Function1 function12;
        Modifier modifier2;
        GapComposer gapComposer;
        TextFieldState m382rememberTextFieldStateLepunE;
        int i2;
        Object obj;
        float f;
        ?? r10;
        Object obj2;
        addFavoritesViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1607870548);
        Applier applier = gapComposer2.applier;
        int i3 = i | (gapComposer2.changedInstance(addFavoritesViewModel) ? 4 : 2) | (gapComposer2.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            InputFieldText inputFieldText = addFavoritesViewModel.searchQuery;
            List list = addFavoritesViewModel.sections;
            if (inputFieldText instanceof TextFieldStateInputFieldText) {
                gapComposer2.startReplaceGroup(1024637850);
                gapComposer2.end(false);
                m382rememberTextFieldStateLepunE = ((TextFieldStateInputFieldText) inputFieldText).textFieldState;
            } else {
                gapComposer2.startReplaceGroup(1693581558);
                gapComposer2.startMovableGroup(1024638837, inputFieldText);
                m382rememberTextFieldStateLepunE = TextFieldStateKt.m382rememberTextFieldStateLepunE(inputFieldText.getValue().toString(), 0L, gapComposer2, 0, 2);
                gapComposer2.end(false);
                gapComposer2.end(false);
            }
            SearchBarKeyboardState rememberSearchBarKeyboardState = SearchBarKt.rememberSearchBarKeyboardState(false, gapComposer2);
            int i4 = i3 & 112;
            boolean z = i4 == 32;
            Object rememberedValue = gapComposer2.rememberedValue();
            Object obj3 = Composer.Companion.Empty;
            if (z || rememberedValue == obj3) {
                rememberedValue = new ComposeDialogKt$$ExternalSyntheticLambda3(22, function1);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            DialogEventHandlerKt.DialogEventHandler((Function1) rememberedValue, gapComposer2, 0);
            CharSequence charSequence = m382rememberTextFieldStateLepunE.getValue$foundation().text;
            boolean changed = (i4 == 32) | gapComposer2.changed(m382rememberTextFieldStateLepunE);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (changed || rememberedValue2 == obj3) {
                rememberedValue2 = new MusicViewKt$LoadedMusicContent$1$1(function1, m382rememberTextFieldStateLepunE, (Continuation) null, 8);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            Updater.LaunchedEffect(gapComposer2, charSequence, (Function2) rememberedValue2);
            Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            long j = colors.semantic.background.f1047app;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m = BalanceFeedKt$$ExternalSyntheticOutline0.m(companion, j, rectangleShapeKt$RectangleShape$1, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
            String str = addFavoritesViewModel.toolbar.title;
            NavigationType navigationType = NavigationType.CLOSE;
            boolean changed2 = gapComposer2.changed(rememberSearchBarKeyboardState) | (i4 == 32);
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (changed2 || rememberedValue3 == obj3) {
                rememberedValue3 = new AddFavoritesViewKt$$ExternalSyntheticLambda1(rememberSearchBarKeyboardState, function1, 0);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            DBUtil.TitleBarSub(str, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue3, (Modifier) null, (Function3) null, gapComposer2, 48, 108);
            DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer2, null);
            SearchBarKt.SearchBar(m382rememberTextFieldStateLepunE, Room.stringResource(gapComposer2, R.string.search_hint), rememberSearchBarKeyboardState, null, null, ShowNavigationBack.Never, null, null, null, null, false, null, gapComposer2, 196608, 0, 8152);
            GapComposer gapComposer3 = gapComposer2;
            boolean isEmpty = list.isEmpty();
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            if (isEmpty) {
                i2 = i4;
                obj = obj3;
                f = 1.0f;
                r10 = 0;
                gapComposer3.startReplaceGroup(184796876);
                gapComposer3.end(false);
            } else {
                gapComposer3.startReplaceGroup(182882564);
                Modifier weight = columnScopeInstance.weight(1.0f, companion, true);
                boolean changedInstance = gapComposer3.changedInstance(addFavoritesViewModel) | (i4 == 32);
                Object rememberedValue4 = gapComposer3.rememberedValue();
                if (changedInstance) {
                    obj2 = obj3;
                } else {
                    obj2 = obj3;
                    if (rememberedValue4 != obj2) {
                        i2 = i4;
                        f = 1.0f;
                        obj = obj2;
                        LazyDslKt.LazyColumn(weight, null, null, null, null, null, false, null, (Function1) rememberedValue4, gapComposer3, 0, 510);
                        r10 = 0;
                        gapComposer3.end(false);
                    }
                }
                rememberedValue4 = new GLSceneScope$$ExternalSyntheticLambda10(5, addFavoritesViewModel, function1);
                gapComposer3.updateRememberedValue(rememberedValue4);
                i2 = i4;
                f = 1.0f;
                obj = obj2;
                LazyDslKt.LazyColumn(weight, null, null, null, null, null, false, null, (Function1) rememberedValue4, gapComposer3, 0, 510);
                r10 = 0;
                gapComposer3.end(false);
            }
            if (inputFieldText.getValue().length() <= 0 || !list.isEmpty()) {
                addFavoritesViewModel2 = addFavoritesViewModel;
                gapComposer3.startReplaceGroup(185017100);
                gapComposer3.end(r10);
            } else {
                gapComposer3.startReplaceGroup(184875833);
                addFavoritesViewModel2 = addFavoritesViewModel;
                NoResults(columnScopeInstance.weight(f, companion, true), addFavoritesViewModel2.region, addFavoritesViewModel2.customEmptyMessage, gapComposer3, r10);
                gapComposer3.end(r10);
            }
            if (inputFieldText.getValue().length() == 0 && !addFavoritesViewModel2.contactsPermissionGranted && list.isEmpty()) {
                gapComposer3.startReplaceGroup(185158460);
                Modifier weight2 = columnScopeInstance.weight(f, companion, true);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.BottomCenter, r10);
                int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, weight2);
                gapComposer3.startReusableNode();
                if (gapComposer3.inserting) {
                    gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer3.useNode();
                }
                Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer3, composeUiNode$Companion$SetModifier$13, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer3, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                boolean z2 = i2 == 32 ? true : r10;
                Object rememberedValue5 = gapComposer3.rememberedValue();
                if (z2 || rememberedValue5 == obj) {
                    function12 = function1;
                    rememberedValue5 = new SafetyHubViewKt$$ExternalSyntheticLambda9(18, function12);
                    gapComposer3.updateRememberedValue(rememberedValue5);
                } else {
                    function12 = function1;
                }
                SyncContactsRowKt.SyncContactsCard(0, 14, gapComposer3, null, null, null, (Function0) rememberedValue5);
                Request$Priority$EnumUnboxingLocalUtility.m(gapComposer3, true, companion, 32.0f, gapComposer3);
                gapComposer3.end(r10);
            } else {
                function12 = function1;
                gapComposer3.startReplaceGroup(185358348);
                gapComposer3.end(r10);
            }
            gapComposer3.end(true);
            modifier2 = companion;
            gapComposer = gapComposer3;
        } else {
            addFavoritesViewModel2 = addFavoritesViewModel;
            function12 = function1;
            gapComposer2.skipToGroupEnd();
            modifier2 = modifier;
            gapComposer = gapComposer2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FormRemoteImageKt$$ExternalSyntheticLambda0(addFavoritesViewModel2, function12, modifier2, i, 5);
        }
    }

    public static final void EmptyFavoritesBody(int i, Composer composer, Modifier modifier, Function0 function0) {
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1477957662);
        int i2 = i | (gapComposer.changedInstance(function0) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.CenterHorizontally, gapComposer, 54);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            long j = MooncakeTheme.getColors(gapComposer).disabledIcon;
            RoundedCornerShape roundedCornerShape = RoundedCornerShapeKt.CircleShape;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(ImageKt.m177backgroundbw27NRU(companion, j, roundedCornerShape), 8.0f);
            Painter painterResource = Countries.painterResource(R.drawable.ic_star_filled, 0, gapComposer);
            long j2 = MooncakeTheme.getColors(gapComposer).background;
            ImageKt.Image(painterResource, null, m298padding3ABfNKs, null, null, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j2, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j2), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer, Painter.$stable | 48, 56);
            gapComposer = gapComposer;
            KeypadKt.m3651TextPdH14aY(0, 0, 3, 0, 0, 0, 3826, MooncakeTheme.getColors(gapComposer).secondaryLabel, (Composer) gapComposer, (Modifier) null, MooncakeTheme.getTypography(gapComposer).mainTitle, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.create_favorite_list), (Map) null, (Function1) null, false);
            KeypadKt.m3651TextPdH14aY(0, 0, 3, 0, 0, 0, 3826, MooncakeTheme.getColors(gapComposer).secondaryLabel, (Composer) gapComposer, (Modifier) null, MooncakeTheme.getTypography(gapComposer).smallBody, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.view_favorites_explanation), (Map) null, (Function1) null, false);
            KeypadKt.m3640ButtonGFipHI0(Room.stringResource(gapComposer, R.string.add_favorites), function0, SpacerKt.m300paddingVpY3zN4$default(companion, RecyclerView.DECELERATION_RATE, 16.0f, 1), null, MooncakePillButton.Size.SMALL, null, null, false, 0, null, null, gapComposer, (i2 & 112) | 24960, 0, 4072);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ComposerKt$$ExternalSyntheticLambda14(modifier, function0, i, 5);
        }
    }

    public static final void EmptyFavoritesList(int i, Composer composer, Modifier modifier, Function0 function0, Function0 function02) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2026228882);
        int i2 = i | (gapComposer.changedInstance(function0) ? 4 : 2) | (gapComposer.changedInstance(function02) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            DBUtil.TitleBarSub("", NavigationType.BACK, (Modifier) null, (DynamicColorConfiguration) null, function0, (Modifier) null, (Function3) null, gapComposer, ((i2 << 12) & 57344) | 54, 108);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            Countries.PageHeader(Room.stringResource(gapComposer, R.string.create_favorite_list), (Modifier) null, lambda$2083666863, Room.stringResource(gapComposer, R.string.arcade_empty_favorites_message), gapComposer, MLKEMEngine.KyberPolyBytes, 2);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            SpacerKt.Spacer(gapComposer, new LayoutWeightElement(1.0f, true));
            DimensionKt.ButtonCtaGroup(SizeKt.fillMaxWidth(companion, 1.0f), false, null, null, Expect_jvmKt.rememberComposableLambda(1969975014, new DismissableToastKt$$ExternalSyntheticLambda3(14, function02), gapComposer), gapComposer, 24582, 14);
            gapComposer = gapComposer;
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PoolInvitePeopleListViewKt$$ExternalSyntheticLambda19(function0, function02, modifier2, i, 1);
        }
    }

    public static final void FavoriteAdded(FavoriteAddedViewModel favoriteAddedViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        ComposableLambdaImpl composableLambdaImpl;
        favoriteAddedViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1071890614);
        int i2 = i | (gapComposer.changedInstance(favoriteAddedViewModel) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            String stringResource = Room.stringResource(R.string.favorite_added, new Object[]{favoriteAddedViewModel.name}, gapComposer);
            String str = favoriteAddedViewModel.message;
            if (str == null) {
                str = re$$ExternalSyntheticOutline0.m(gapComposer, -705262578, R.string.view_favorites_explanation, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-705263105);
                gapComposer.end(false);
            }
            String str2 = str;
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1598573330, new ArcadeModal2Kt$$ExternalSyntheticLambda0(20, favoriteAddedViewModel, function1), gapComposer);
            if (favoriteAddedViewModel.showViewFavorites) {
                gapComposer.startReplaceGroup(-387674787);
                composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(-1535444042, new ErrorView$$ExternalSyntheticLambda3(17, function1), gapComposer);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-387469226);
                gapComposer.end(false);
                composableLambdaImpl = null;
            }
            ComposableLambdaImpl composableLambdaImpl2 = composableLambdaImpl;
            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(1825957059, new FavoriteAddedViewKt$$ExternalSyntheticLambda2(favoriteAddedViewModel, i3), gapComposer);
            modifier2 = Modifier.Companion.$$INSTANCE;
            ModalKt.Modal(modifier2, stringResource, str2, rememberComposableLambda, composableLambdaImpl2, rememberComposableLambda2, gapComposer, 199686, 0);
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FormRemoteImageKt$$ExternalSyntheticLambda0(favoriteAddedViewModel, function1, modifier2, i, 6);
        }
    }

    public static final void FavoriteCardItem(Modifier modifier, Function0 function0, FavoriteAvatar favoriteAvatar, Composer composer, int i) {
        function0.getClass();
        favoriteAvatar.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1581987344);
        int i2 = i | 6 | (gapComposer.changedInstance(function0) ? 32 : 16) | (gapComposer.changedInstance(favoriteAvatar) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(-154047829, new FormCashtag$8$$ExternalSyntheticLambda0(favoriteAvatar, function0), gapComposer), gapComposer, 6);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FormRemoteImageKt$$ExternalSyntheticLambda0(i, 7, modifier2, function0, favoriteAvatar);
        }
    }

    public static final void FavoriteItems(int i, Composer composer, Modifier modifier, ArrayList arrayList, Function1 function1) {
        int i2;
        Modifier modifier2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(73335489);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(arrayList) ? 256 : 128;
        }
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            modifier2 = modifier;
            OffsetKt.BoxWithConstraints(modifier2, null, false, Expect_jvmKt.rememberComposableLambda(-197634153, new EarningsHomeKt$$ExternalSyntheticLambda9(arrayList, function1, i3), gapComposer), gapComposer, (i2 & 14) | 3072, 6);
        } else {
            modifier2 = modifier;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new GenericProfileElementsViewKt$$ExternalSyntheticLambda12(modifier2, function1, arrayList, i);
        }
    }

    public static final void FavoritePersonRowItem(Function0 function0, Function0 function02, Modifier modifier, Color color, Image image, String str, String str2, String str3, Icons icons, boolean z, Composer composer, int i) {
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1879950203);
        int i2 = i | (gapComposer2.changedInstance(function0) ? 4 : 2) | (gapComposer2.changedInstance(function02) ? 32 : 16) | (gapComposer2.changed(modifier) ? 256 : 128) | (gapComposer2.changedInstance(color) ? 2048 : 1024) | (gapComposer2.changedInstance(image) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer2.changed(str) ? PKIFailureInfo.unsupportedVersion : 65536) | (gapComposer2.changed(str2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted) | (gapComposer2.changed(str3) ? 8388608 : 4194304) | (gapComposer2.changed(icons == null ? -1 : icons.ordinal()) ? 67108864 : 33554432) | (gapComposer2.changed(z) ? 536870912 : 268435456);
        if (gapComposer2.shouldExecute(i2 & 1, (306783379 & i2) != 306783378)) {
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-2100200839, new SwipeToDismissKt$$ExternalSyntheticLambda3(str, function0, color, image, icons, str3, 13), gapComposer2);
            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(189275578, new FamilyMemberRowKt$$ExternalSyntheticLambda5(str, 12), gapComposer2);
            ComposableLambdaImpl rememberComposableLambda3 = Expect_jvmKt.rememberComposableLambda(-1532229763, new FamilyMemberRowKt$$ExternalSyntheticLambda5(str2, 13), gapComposer2);
            boolean z2 = ((i2 & 112) == 32) | ((1879048192 & i2) == 536870912);
            Object rememberedValue = gapComposer2.rememberedValue();
            if (z2 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new EarningsHeaderKt$$ExternalSyntheticLambda9(function02, z);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            gapComposer = gapComposer2;
            CellDefaultKt.CellSearchResult(rememberComposableLambda, rememberComposableLambda2, modifier, (Function0) null, rememberComposableLambda3, (Function1) rememberedValue, gapComposer, (i2 & 896) | 24630, 8);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ListFavoritesViewKt$$ExternalSyntheticLambda16(function0, function02, modifier, color, image, str, str2, str3, icons, z, i);
        }
    }

    public static final void FavoritesBody(Modifier modifier, Function1 function1, Function0 function0, ArrayList arrayList, Composer composer, int i) {
        function1.getClass();
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1530398390);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(function0) ? 256 : 128) | (gapComposer.changedInstance(arrayList) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Arrangement$Center$1 arrangement$Center$1 = SpacerKt.SpaceBetween;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Center$1, Alignment.Companion.CenterHorizontally, gapComposer, 54);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$Center$1, Alignment.Companion.Top, gapComposer, 6);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, 0, 0, 4080, MooncakeTheme.getColors(gapComposer).label, (Composer) gapComposer, (Modifier) Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14, 1.0f, true), MooncakeTheme.getTypography(gapComposer).header4, (TextLineBalancing) null, Room.stringResource(R.string.favorites_with_count, new Object[]{Integer.valueOf(arrayList.size())}, gapComposer), (Map) null, (Function1) null, false);
            int i3 = i2 >> 3;
            KeypadKt.m3640ButtonGFipHI0(Room.stringResource(gapComposer, R.string.manage), function0, null, null, MooncakePillButton.Size.SMALL, MooncakePillButton.Style.SECONDARY, null, false, 0, null, null, gapComposer, (i3 & 112) | 221184, 0, 4044);
            gapComposer = gapComposer;
            gapComposer.end(true);
            FavoriteItems((i3 & 896) | (i2 & 112) | 6, gapComposer, SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, 18.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), arrayList, function1);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MoneyUiFactory$$ExternalSyntheticLambda1(modifier, function1, function0, arrayList, i, 2);
        }
    }

    public static final void FavoritesList(Modifier modifier, Function1 function1, Function1 function12, Function0 function0, Function0 function02, String str, List list, Composer composer, int i) {
        GapComposer gapComposer;
        Modifier modifier2;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1264132244);
        int i2 = i | 6 | (gapComposer2.changedInstance(function1) ? 32 : 16) | (gapComposer2.changedInstance(function12) ? 256 : 128) | (gapComposer2.changedInstance(function0) ? 2048 : 1024) | (gapComposer2.changedInstance(function02) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer2.changed(str) ? PKIFailureInfo.unsupportedVersion : 65536) | (gapComposer2.changedInstance(list) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted);
        if (gapComposer2.shouldExecute(i2 & 1, (599187 & i2) != 599186)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, companion);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer2.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            DBUtil.TitleBarSub(str, NavigationType.BACK, (Modifier) null, (DynamicColorConfiguration) null, function02, (Modifier) null, (Function3) null, gapComposer2, ((i2 >> 15) & 14) | 48 | (57344 & i2), 108);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer2, null);
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            boolean changedInstance = gapComposer2.changedInstance(list) | ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object rememberedValue = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ListFavoritesViewKt$$ExternalSyntheticLambda9(list, function1, function12, 0);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            LazyDslKt.LazyColumn(layoutWeightElement, null, null, null, null, null, false, null, (Function1) rememberedValue, gapComposer2, 0, 510);
            DimensionKt.ButtonCtaGroup(SizeKt.fillMaxWidth(companion, 1.0f), false, null, null, Expect_jvmKt.rememberComposableLambda(355891740, new DismissableToastKt$$ExternalSyntheticLambda3(13, function0), gapComposer2), gapComposer2, 24582, 14);
            gapComposer = gapComposer2;
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BasicShieetKt$$ExternalSyntheticLambda0(modifier2, function1, function12, function0, function02, str, list, i, 7);
        }
    }

    public static final void FavoritesMessage(FavoritesMessageViewModel favoritesMessageViewModel, Function1 function1, Composer composer, int i) {
        favoritesMessageViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-176570521);
        int i2 = (gapComposer.changedInstance(favoritesMessageViewModel) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = 18;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ModalKt.Modal((Modifier) null, favoritesMessageViewModel.title, favoritesMessageViewModel.message, Expect_jvmKt.rememberComposableLambda(350112195, new ErrorView$$ExternalSyntheticLambda3(i3, function1), gapComposer), (Function3) null, (Function3) null, gapComposer, 3072, 49);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SafetyHubViewKt$$ExternalSyntheticLambda0(favoritesMessageViewModel, function1, i, 13);
        }
    }

    public static final void ListFavoritesCard(Modifier modifier, ArrayList arrayList, Function1 function1, Function0 function0, Function0 function02, Composer composer, int i) {
        int i2;
        function1.getClass();
        function0.getClass();
        function02.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1705755672);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(arrayList) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changedInstance(function02) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(-1389432707, new AvatarsKt$$ExternalSyntheticLambda4(modifier, (Serializable) arrayList, (Object) function0, (Object) function1, (Object) function02, 25), gapComposer), gapComposer, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TransitionKt$$ExternalSyntheticLambda9(modifier, arrayList, function1, function0, function02, i, 25);
        }
    }

    public static final void ListFavoritesView(ListFavoritesViewModel listFavoritesViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        listFavoritesViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1112840752);
        int i2 = i | (gapComposer.changedInstance(listFavoritesViewModel) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.semantic.background.f1047app;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m = BalanceFeedKt$$ExternalSyntheticOutline0.m(companion, j, rectangleShapeKt$RectangleShape$1, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            boolean isEmpty = listFavoritesViewModel.favorites.isEmpty();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (isEmpty) {
                gapComposer.startReplaceGroup(-475359225);
                int i3 = i2 & 112;
                boolean z = i3 == 32;
                Object rememberedValue = gapComposer.rememberedValue();
                if (z || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new SafetyHubViewKt$$ExternalSyntheticLambda9(22, function1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Function0 function0 = (Function0) rememberedValue;
                boolean z2 = i3 == 32;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (z2 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new SafetyHubViewKt$$ExternalSyntheticLambda9(23, function1);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                EmptyFavoritesList(0, gapComposer, null, function0, (Function0) rememberedValue2);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-475198924);
                int i4 = i2 & 112;
                boolean z3 = i4 == 32;
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (z3 || rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new ComposeDialogKt$$ExternalSyntheticLambda3(23, function1);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                Function1 function12 = (Function1) rememberedValue3;
                boolean z4 = i4 == 32;
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (z4 || rememberedValue4 == neverEqualPolicy) {
                    rememberedValue4 = new ComposeDialogKt$$ExternalSyntheticLambda3(24, function1);
                    gapComposer.updateRememberedValue(rememberedValue4);
                }
                Function1 function13 = (Function1) rememberedValue4;
                boolean z5 = i4 == 32;
                Object rememberedValue5 = gapComposer.rememberedValue();
                if (z5 || rememberedValue5 == neverEqualPolicy) {
                    rememberedValue5 = new SafetyHubViewKt$$ExternalSyntheticLambda9(24, function1);
                    gapComposer.updateRememberedValue(rememberedValue5);
                }
                Function0 function02 = (Function0) rememberedValue5;
                boolean z6 = i4 == 32;
                Object rememberedValue6 = gapComposer.rememberedValue();
                if (z6 || rememberedValue6 == neverEqualPolicy) {
                    rememberedValue6 = new SafetyHubViewKt$$ExternalSyntheticLambda9(25, function1);
                    gapComposer.updateRememberedValue(rememberedValue6);
                }
                FavoritesList(null, function12, function13, function02, (Function0) rememberedValue6, listFavoritesViewModel.toolbar.title, listFavoritesViewModel.favorites, gapComposer, 0);
                gapComposer.end(false);
            }
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FormRemoteImageKt$$ExternalSyntheticLambda0(listFavoritesViewModel, function1, modifier2, i, 8);
        }
    }

    public static final void NoResults(Modifier modifier, Region region, String str, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2130070819);
        int i2 = (gapComposer.changed(modifier) ? 4 : 2) | i | (gapComposer.changed(region == null ? -1 : region.ordinal()) ? 32 : 16) | (gapComposer.changed(str) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(2138351022, new AddFavoritesViewKt$$ExternalSyntheticLambda5(modifier, str, region), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AddFavoritesViewKt$$ExternalSyntheticLambda5(modifier, region, str, i);
        }
    }

    public static final void PersonRowItem(final Function0 function0, final Function0 function02, Modifier modifier, final boolean z, final String str, final String str2, final String str3, final Color color, final Image image, final Icons icons, final boolean z2, final boolean z3, Composer composer, final int i) {
        GapComposer gapComposer;
        final Modifier modifier2;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(109126440);
        int i2 = i | (gapComposer2.changedInstance(function0) ? 4 : 2) | (gapComposer2.changedInstance(function02) ? 32 : 16) | MLKEMEngine.KyberPolyBytes | (gapComposer2.changed(z) ? 2048 : 1024) | (gapComposer2.changed(str) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer2.changed(str2) ? PKIFailureInfo.unsupportedVersion : 65536) | (gapComposer2.changed(str3) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted) | (gapComposer2.changedInstance(color) ? 8388608 : 4194304) | (gapComposer2.changedInstance(image) ? 67108864 : 33554432) | (gapComposer2.changed(icons == null ? -1 : icons.ordinal()) ? PKIFailureInfo.duplicateCertReq : 268435456);
        byte b = 0;
        if (gapComposer2.shouldExecute(i2 & 1, ((306783379 & i2) == 306783378 && (((gapComposer2.changed(z2) ? (char) 4 : (char) 2) | (gapComposer2.changed(z3) ? ' ' : (char) 16)) & 19) == 18) ? false : true)) {
            boolean z4 = (z || z2) ? false : true;
            CellDefaultAccessory.ButtonCompact buttonCompact = z ? new CellDefaultAccessory.ButtonCompact(null, null, false, lambda$1087698175, 15) : z2 ? new CellDefaultAccessory.ButtonCompact(null, null, false, lambda$1745929000, 15) : new CellDefaultAccessory.ButtonCompact(null, ButtonProminence.PROMINENT, false, lambda$1500795592, 13);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            gapComposer = gapComposer2;
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(Expect_jvmKt.rememberComposableLambda(1392887674, new AvatarsKt$$ExternalSyntheticLambda4(function02, color, image, icons, str3, 24), gapComposer2), Expect_jvmKt.rememberComposableLambda(355877273, new TextFieldUIKt$$ExternalSyntheticLambda14(str, z3, 3, b), gapComposer2), companion, function0, z4, false, Expect_jvmKt.rememberComposableLambda(-1571217837, new FamilyMemberRowKt$$ExternalSyntheticLambda5(str2, 11), gapComposer2), null, buttonCompact, 0L, gapComposer, 12583350 | ((i2 << 9) & 7168), 3408);
            modifier2 = companion;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2(function02, modifier2, z, str, str2, str3, color, image, icons, z2, z3, i) { // from class: com.squareup.cash.favorites.components.AddFavoritesViewKt$$ExternalSyntheticLambda13
                public final /* synthetic */ Function0 f$1;
                public final /* synthetic */ boolean f$10;
                public final /* synthetic */ boolean f$11;
                public final /* synthetic */ Modifier f$2;
                public final /* synthetic */ boolean f$3;
                public final /* synthetic */ String f$4;
                public final /* synthetic */ String f$5;
                public final /* synthetic */ String f$6;
                public final /* synthetic */ Color f$7;
                public final /* synthetic */ Image f$8;
                public final /* synthetic */ Icons f$9;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(1);
                    AddFavoritesViewKt.PersonRowItem(Function0.this, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9, this.f$10, this.f$11, (Composer) obj, updateChangedFlags);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
