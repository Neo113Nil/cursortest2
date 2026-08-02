package com.squareup.cash.invitations;

import androidx.camera.core.AspectRatio;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransitionImpl;
import androidx.compose.animation.ExitTransitionImpl;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.EasingFunctionsKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.SliderDefaults$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusTraversalKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.local.views.internal.DismissableToastKt$$ExternalSyntheticLambda3;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.AsyncImageKt;
import coil3.compose.LocalImageLoaderKt;
import coil3.compose.SubcomposeAsyncImageKt$$ExternalSyntheticLambda1;
import coil3.svg.SvgDecoder$$ExternalSyntheticLambda0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.SearchBarKeyboardState;
import com.squareup.cash.arcade.components.SearchBarKt;
import com.squareup.cash.arcade.components.list.ListOrderedKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.blockers.views.SetNameViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.collapsingtoolbar.views.CollapsingToolbarKt;
import com.squareup.cash.collapsingtoolbar.views.CollapsingToolbarScaffoldScopeInstance;
import com.squareup.cash.collapsingtoolbar.views.CollapsingToolbarScaffoldState;
import com.squareup.cash.collapsingtoolbar.views.CollapsingToolbarState;
import com.squareup.cash.collapsingtoolbar.views.ScrollStrategy;
import com.squareup.cash.common.composeui.ArcadeInfoBlockerKt$$ExternalSyntheticLambda0;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.contacts.components.SyncContactsRowKt;
import com.squareup.cash.dialog.ArcadeModal2Kt;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda10;
import com.squareup.cash.featureflags.JsonFeatureFlags$SmsInviteConsentPhoneNumbers;
import com.squareup.cash.google.pay.GooglePayPresenter$$ExternalSyntheticLambda0;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda3;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda2;
import com.squareup.cash.instruments.views.InstrumentCellKt$$ExternalSyntheticLambda11;
import com.squareup.cash.invitations.InviteContactsReferralHeaderModel;
import com.squareup.cash.invitations.InviteContactsViewModel;
import com.squareup.cash.launcher.IntentLauncher$$ExternalSyntheticLambda0;
import com.squareup.cash.maps.presenter.CashMapPresenter$models$3$1;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.maps.views.ComposableSingletons$CashMapViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.marketing.components.CardUpsellIllustration;
import com.squareup.cash.marketing.components.CardUpsellKt;
import com.squareup.cash.money.booklet.MoneyTabBookletKt$$ExternalSyntheticLambda4;
import com.squareup.cash.money.views.ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda5;
import com.squareup.cash.money.views.HypeWelcomeUIKt$$ExternalSyntheticLambda0;
import com.squareup.cash.money.views.HypeWelcomeUIKt$$ExternalSyntheticLambda5;
import com.squareup.cash.money.views.MoneyTabSectionUIKt$$ExternalSyntheticLambda6;
import com.squareup.cash.money.views.MoneyTabToolbarKt$$ExternalSyntheticLambda1;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda9;
import com.squareup.cash.music.presenters.MusicPresenter$models$1$1;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda7;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda0;
import com.squareup.cash.pools.views.PoolCreateViewKt$$ExternalSyntheticLambda5;
import com.squareup.util.cash.Countries;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.Tags;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class InviteErrorDialogKt {

    /* renamed from: lambda$-1367428897, reason: not valid java name */
    public static final ComposableLambdaImpl f456lambda$1367428897;

    /* renamed from: lambda$-279826781, reason: not valid java name */
    public static final ComposableLambdaImpl f460lambda$279826781;
    public static final ComposableLambdaImpl lambda$1763567871;

    /* renamed from: lambda$-1629652393, reason: not valid java name */
    public static final ComposableLambdaImpl f458lambda$1629652393 = new ComposableLambdaImpl(new InstrumentCellKt$$ExternalSyntheticLambda11(26), false, -1629652393);
    public static final ComposableLambdaImpl lambda$1145761081 = new ComposableLambdaImpl(new CashMapViewKt$$ExternalSyntheticLambda1(21), false, 1145761081);
    public static final ComposableLambdaImpl lambda$865192275 = new ComposableLambdaImpl(new InstrumentCellKt$$ExternalSyntheticLambda11(27), false, 865192275);
    public static final ComposableLambdaImpl lambda$407103781 = new ComposableLambdaImpl(new InstrumentCellKt$$ExternalSyntheticLambda11(28), false, 407103781);

    /* renamed from: lambda$-1942506276, reason: not valid java name */
    public static final ComposableLambdaImpl f459lambda$1942506276 = new ComposableLambdaImpl(new InstrumentCellKt$$ExternalSyntheticLambda11(29), false, -1942506276);

    /* renamed from: lambda$-1439697370, reason: not valid java name */
    public static final ComposableLambdaImpl f457lambda$1439697370 = new ComposableLambdaImpl(new ComposableSingletons$CashMapViewKt$$ExternalSyntheticLambda0(1), false, -1439697370);

    static {
        new ComposableLambdaImpl(new CashMapViewKt$$ExternalSyntheticLambda1(22), false, 395237052);
        new ComposableLambdaImpl(new CashMapViewKt$$ExternalSyntheticLambda1(23), false, 961065641);
        f460lambda$279826781 = new ComposableLambdaImpl(new ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda5(28), false, -279826781);
        f456lambda$1367428897 = new ComposableLambdaImpl(new ComposableSingletons$CashMapViewKt$$ExternalSyntheticLambda0(2), false, -1367428897);
        lambda$1763567871 = new ComposableLambdaImpl(new ComposableSingletons$CashMapViewKt$$ExternalSyntheticLambda0(3), false, 1763567871);
    }

    public static final void ErrorModal(int i, Composer composer, Modifier modifier, String str, Function0 function0) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(89260494);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(str) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-141183106, new MoneyTabToolbarKt$$ExternalSyntheticLambda1(str, 6), gapComposer);
            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(1402629674, new DismissableToastKt$$ExternalSyntheticLambda3(17, function0), gapComposer);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            ModalKt.Modal(companion, f456lambda$1367428897, rememberComposableLambda, rememberComposableLambda2, (Function3) null, (Function3) null, gapComposer, 3510, 48);
            modifier = companion;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InviteErrorDialogKt$$ExternalSyntheticLambda4(function0, str, modifier, i);
        }
    }

    public static final void InviteConsentDialog(Modifier modifier, Function0 function0, Function0 function02, String str, String str2, String str3, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        function0.getClass();
        function02.getClass();
        str.getClass();
        str3.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(625244537);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = (gapComposer.changed(modifier2) ? 4 : 2) | i;
        }
        int i5 = 16;
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(function0) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changedInstance(function02) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer.changed(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= gapComposer.changed(str2) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i3 |= gapComposer.changed(str3) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        int i6 = 1;
        if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
            Modifier modifier3 = i4 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1956590635, new ArcadeInfoBlockerKt$$ExternalSyntheticLambda0(function0, str3, i6), gapComposer);
            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-1671454732, new DismissableToastKt$$ExternalSyntheticLambda3(i5, function02), gapComposer);
            int i7 = (i3 & 14) | 27648;
            int i8 = i3 >> 6;
            Modifier modifier4 = modifier3;
            ModalKt.Modal(modifier4, str, str2, rememberComposableLambda, rememberComposableLambda2, (Function3) null, gapComposer, i7 | (i8 & 112) | (i8 & 896), 32);
            modifier2 = modifier4;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SubcomposeAsyncImageKt$$ExternalSyntheticLambda1(modifier2, function0, function02, str, str2, str3, i, i2, 19);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.GapComposer] */
    /* JADX WARN: Type inference failed for: r26v0, types: [java.lang.Throwable] */
    public static final void InviteContactsBody(Modifier modifier, final Function1 function1, final String str, final Function1 function12, final String str2, final InviteContactsHeaderViewModel inviteContactsHeaderViewModel, final boolean z, final String str3, final ImmutableList immutableList, final ImmutableList immutableList2, final boolean z2, final Function0 function0, final String str4, final String str5, InviteContactsViewModel.PromotionUpsellViewModel promotionUpsellViewModel, boolean z3, Function1 function13, Composer composer, final int i, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        GapComposer gapComposer;
        final InviteContactsViewModel.PromotionUpsellViewModel promotionUpsellViewModel2;
        final boolean z4;
        final Function1 function14;
        final Modifier modifier3;
        Function1 function15;
        SearchBarKeyboardState searchBarKeyboardState;
        LazyListState lazyListState;
        final CollapsingToolbarScaffoldState collapsingToolbarScaffoldState;
        Object obj;
        Continuation continuation;
        boolean z5;
        function1.getClass();
        function12.getClass();
        str2.getClass();
        inviteContactsHeaderViewModel.getClass();
        immutableList.getClass();
        immutableList2.getClass();
        function0.getClass();
        ?? r11 = (GapComposer) composer;
        r11.startRestartGroup(695233676);
        int i10 = i3 & 1;
        if (i10 != 0) {
            i4 = i | 6;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i4 = (r11.changed(modifier2) ? 4 : 2) | i;
        }
        if ((i & 48) == 0) {
            i4 |= r11.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 |= r11.changed(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= r11.changedInstance(function12) ? 2048 : 1024;
        }
        int i11 = i & 24576;
        int i12 = PKIFailureInfo.certRevoked;
        if (i11 == 0) {
            i4 |= r11.changed(str2) ? 16384 : 8192;
        }
        boolean changedInstance = r11.changedInstance(inviteContactsHeaderViewModel);
        int i13 = PKIFailureInfo.unsupportedVersion;
        int i14 = i4 | (changedInstance ? 131072 : 65536);
        int i15 = i & 1572864;
        int i16 = PKIFailureInfo.signerNotTrusted;
        if (i15 == 0) {
            i14 |= r11.changed(z) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i14 |= r11.changed(str3) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i14 |= r11.changedInstance(immutableList) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i14 |= r11.changed(immutableList2) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if ((i2 & 6) == 0) {
            i5 = i2 | (r11.changed(z2) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= r11.changedInstance(function0) ? 32 : 16;
        }
        int i17 = i5;
        int i18 = i3 & 16384;
        if (i18 != 0) {
            i7 = i17 | 24576;
            i6 = i18;
        } else {
            i6 = i18;
            if (r11.changedInstance(promotionUpsellViewModel)) {
                i12 = 16384;
            }
            i7 = i17 | i12;
        }
        int i19 = i3 & 32768;
        if (i19 != 0) {
            i8 = i7 | 196608;
        } else {
            if (!r11.changed(z3)) {
                i13 = 65536;
            }
            i8 = i7 | i13;
        }
        int i20 = i3 & 65536;
        if (i20 != 0) {
            i9 = i8 | 1572864;
        } else {
            if (r11.changedInstance(function13)) {
                i16 = 1048576;
            }
            i9 = i8 | i16;
        }
        if (r11.shouldExecute(i14 & 1, ((i14 & 306783379) == 306783378 && (598035 & i9) == 598034) ? false : true)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier modifier4 = i10 != 0 ? companion : modifier2;
            final InviteContactsViewModel.PromotionUpsellViewModel promotionUpsellViewModel3 = i6 != 0 ? null : promotionUpsellViewModel;
            boolean z6 = i19 != 0 ? false : z3;
            Object obj2 = Composer.Companion.Empty;
            if (i20 != 0) {
                Object rememberedValue = r11.rememberedValue();
                if (rememberedValue == obj2) {
                    rememberedValue = new CashMapViewKt$$ExternalSyntheticLambda0(2);
                    r11.updateRememberedValue(rememberedValue);
                }
                function15 = (Function1) rememberedValue;
            } else {
                function15 = function13;
            }
            CollapsingToolbarScaffoldState rememberCollapsingToolbarScaffoldState = CollapsingToolbarKt.rememberCollapsingToolbarScaffoldState(r11);
            Object rememberedValue2 = r11.rememberedValue();
            if (rememberedValue2 == obj2) {
                rememberedValue2 = Recorder$$ExternalSyntheticOutline2.m106m((GapComposer) r11);
            }
            final FocusRequester focusRequester = (FocusRequester) rememberedValue2;
            SearchBarKeyboardState rememberSearchBarKeyboardState = SearchBarKt.rememberSearchBarKeyboardState(false, r11);
            LazyListState rememberLazyListState = LazyListStateKt.rememberLazyListState(0, 3, r11);
            MutableState rememberUpdatedState = Updater.rememberUpdatedState(str, r11);
            Unit unit = Unit.INSTANCE;
            boolean changed = r11.changed(rememberUpdatedState) | r11.changed(rememberCollapsingToolbarScaffoldState) | r11.changed(rememberLazyListState) | r11.changed(rememberSearchBarKeyboardState);
            Object rememberedValue3 = r11.rememberedValue();
            if (changed || rememberedValue3 == obj2) {
                searchBarKeyboardState = rememberSearchBarKeyboardState;
                lazyListState = rememberLazyListState;
                rememberedValue3 = new MusicPresenter$models$1$1(rememberCollapsingToolbarScaffoldState, lazyListState, rememberUpdatedState, searchBarKeyboardState, null, 2);
                collapsingToolbarScaffoldState = rememberCollapsingToolbarScaffoldState;
                r11.updateRememberedValue(rememberedValue3);
            } else {
                searchBarKeyboardState = rememberSearchBarKeyboardState;
                collapsingToolbarScaffoldState = rememberCollapsingToolbarScaffoldState;
                lazyListState = rememberLazyListState;
            }
            Updater.LaunchedEffect((Composer) r11, unit, (Function2) rememberedValue3);
            Object rememberedValue4 = r11.rememberedValue();
            if (rememberedValue4 == obj2) {
                rememberedValue4 = Updater.mutableStateOf$default(Boolean.valueOf(immutableList.isEmpty()));
                r11.updateRememberedValue(rememberedValue4);
            }
            MutableState mutableState = (MutableState) rememberedValue4;
            Boolean valueOf = Boolean.valueOf(immutableList.isEmpty());
            boolean changedInstance2 = r11.changedInstance(immutableList) | r11.changed(collapsingToolbarScaffoldState);
            Object rememberedValue5 = r11.rememberedValue();
            if (changedInstance2 || rememberedValue5 == obj2) {
                CollapsingToolbarScaffoldState collapsingToolbarScaffoldState2 = collapsingToolbarScaffoldState;
                obj = obj2;
                continuation = null;
                z5 = false;
                CashMapPresenter$models$3$1 cashMapPresenter$models$3$1 = new CashMapPresenter$models$3$1(1, mutableState, immutableList, collapsingToolbarScaffoldState2, continuation);
                collapsingToolbarScaffoldState = collapsingToolbarScaffoldState2;
                r11.updateRememberedValue(cashMapPresenter$models$3$1);
                rememberedValue5 = cashMapPresenter$models$3$1;
            } else {
                obj = obj2;
                continuation = null;
                z5 = false;
            }
            Updater.LaunchedEffect((Composer) r11, valueOf, (Function2) rememberedValue5);
            Object rememberedValue6 = r11.rememberedValue();
            if (rememberedValue6 == obj) {
                rememberedValue6 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, r11);
                r11.updateRememberedValue(rememberedValue6);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) rememberedValue6;
            MutableState rememberUpdatedState2 = Updater.rememberUpdatedState(function12, r11);
            Object rememberedValue7 = r11.rememberedValue();
            if (rememberedValue7 == obj) {
                rememberedValue7 = new MoneyTabUIKt$$ExternalSyntheticLambda9(2, rememberUpdatedState2);
                r11.updateRememberedValue(rememberedValue7);
            }
            final Function1 function16 = (Function1) rememberedValue7;
            Modifier fillMaxSize = SizeKt.fillMaxSize(modifier4, 1.0f);
            Colors colors = (Colors) r11.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m((GapComposer) r11, -1762997026, (GapComposer) r11, z5);
            } else {
                r11.startReplaceGroup(-1762997739);
                r11.end(z5);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, z5);
            int hashCode = Long.hashCode(r11.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = r11.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(r11, m177backgroundbw27NRU);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            ?? r26 = continuation;
            if (r11.applier == null) {
                Updater.invalidApplier();
                throw r26;
            }
            r11.startReusableNode();
            if (r11.inserting) {
                r11.createNode(layoutNode$Companion$Constructor$1);
            } else {
                r11.useNode();
            }
            Updater.m576setimpl(r11, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(r11, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(r11, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(r11, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(r11, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(ClipKt.clipToBounds(companion), RecyclerView.DECELERATION_RATE, 8.0f, 1);
            ScrollStrategy[] scrollStrategyArr = ScrollStrategy.$VALUES;
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1847999432, new MoneyTabBookletKt$$ExternalSyntheticLambda4(22, collapsingToolbarScaffoldState, inviteContactsHeaderViewModel), r11);
            final Function1 function17 = function15;
            final LazyListState lazyListState2 = lazyListState;
            Modifier modifier5 = modifier4;
            final boolean z7 = z6;
            final SearchBarKeyboardState searchBarKeyboardState2 = searchBarKeyboardState;
            CollapsingToolbarKt.CollapsingToolbarScaffold(m300paddingVpY3zN4$default, collapsingToolbarScaffoldState, false, null, rememberComposableLambda, Expect_jvmKt.rememberComposableLambda(-2020262803, new Function3() { // from class: com.squareup.cash.invitations.InviteContactsBodyKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
                    GapComposer gapComposer2;
                    boolean z8;
                    Modifier.Companion companion2;
                    Composer composer2 = (Composer) obj4;
                    ((Integer) obj5).getClass();
                    ((CollapsingToolbarScaffoldScopeInstance) obj3).getClass();
                    Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
                    BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, composer2, 0);
                    GapComposer gapComposer3 = (GapComposer) composer2;
                    int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
                    Modifier.Companion companion3 = Modifier.Companion.$$INSTANCE;
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(composer2, companion3);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    GapComposer gapComposer4 = (GapComposer) composer2;
                    if (gapComposer4.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer4.startReusableNode();
                    if (gapComposer4.inserting) {
                        gapComposer4.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer4.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(composer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$12);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(composer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$13);
                    Integer valueOf2 = Integer.valueOf(hashCode2);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(composer2, valueOf2, composeUiNode$Companion$SetModifier$14);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(composer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(composer2, materializeModifier2, composeUiNode$Companion$SetModifier$15);
                    Modifier m300paddingVpY3zN4$default2 = SpacerKt.m300paddingVpY3zN4$default(FocusTraversalKt.focusRequester(companion3, FocusRequester.this), 6.0f, RecyclerView.DECELERATION_RATE, 2);
                    Function1 function18 = function1;
                    boolean changed2 = gapComposer4.changed(function18);
                    Object rememberedValue8 = gapComposer4.rememberedValue();
                    Object obj6 = Composer.Companion.Empty;
                    if (changed2 || rememberedValue8 == obj6) {
                        composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$13;
                        rememberedValue8 = new InviteContactsBodyKt$$ExternalSyntheticLambda5(0, function18);
                        gapComposer4.updateRememberedValue(rememberedValue8);
                    } else {
                        composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$13;
                    }
                    Function1 function19 = (Function1) rememberedValue8;
                    Function1 function110 = function17;
                    boolean changed3 = gapComposer4.changed(function110);
                    CoroutineScope coroutineScope2 = coroutineScope;
                    boolean changedInstance3 = changed3 | gapComposer4.changedInstance(coroutineScope2);
                    CollapsingToolbarScaffoldState collapsingToolbarScaffoldState3 = collapsingToolbarScaffoldState;
                    boolean changed4 = changedInstance3 | gapComposer4.changed(collapsingToolbarScaffoldState3);
                    Object rememberedValue9 = gapComposer4.rememberedValue();
                    if (changed4 || rememberedValue9 == obj6) {
                        rememberedValue9 = new GpsConfigQueries$$ExternalSyntheticLambda3(28, function110, coroutineScope2, collapsingToolbarScaffoldState3);
                        gapComposer4.updateRememberedValue(rememberedValue9);
                    }
                    Function1 function111 = (Function1) rememberedValue9;
                    boolean changed5 = gapComposer4.changed(collapsingToolbarScaffoldState3) | gapComposer4.changedInstance(coroutineScope2);
                    SearchBarKeyboardState searchBarKeyboardState3 = searchBarKeyboardState2;
                    boolean changed6 = changed5 | gapComposer4.changed(searchBarKeyboardState3);
                    Object rememberedValue10 = gapComposer4.rememberedValue();
                    int i21 = 24;
                    if (changed6 || rememberedValue10 == obj6) {
                        rememberedValue10 = new GLSceneScope$$ExternalSyntheticLambda2(i21, collapsingToolbarScaffoldState3, coroutineScope2, searchBarKeyboardState3);
                        gapComposer4.updateRememberedValue(rememberedValue10);
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = composeUiNode$Companion$SetModifier$1;
                    AspectRatio.ContactInput(m300paddingVpY3zN4$default2, function19, function111, (Function0) rememberedValue10, str2, searchBarKeyboardState3, str, composer2, 0);
                    SpacerKt.Spacer(composer2, SizeKt.m277height3ABfNKs(companion3, 8.0f));
                    ModalKt.HorizontalDivider(0, 0, composer2, AlphaKt.alpha(companion3, Math.abs(collapsingToolbarScaffoldState3.toolbarState.getProgress() - 1.0f)));
                    boolean z9 = z;
                    boolean z10 = z7;
                    InviteContactsViewModel.PromotionUpsellViewModel promotionUpsellViewModel4 = promotionUpsellViewModel3;
                    if (z9) {
                        gapComposer4.startReplaceGroup(-1578308763);
                        ImmutableList immutableList3 = immutableList;
                        boolean changed7 = gapComposer4.changed(immutableList3);
                        Object rememberedValue11 = gapComposer4.rememberedValue();
                        Object obj7 = rememberedValue11;
                        if (changed7 || rememberedValue11 == obj6) {
                            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(immutableList3, 10));
                            Iterator<E> it = immutableList3.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((InviteContactsViewModel.RecommendedContact) it.next()).contact);
                            }
                            gapComposer4.updateRememberedValue(arrayList);
                            obj7 = arrayList;
                        }
                        List list = (List) obj7;
                        boolean changed8 = gapComposer4.changed(z10) | gapComposer4.changedInstance(promotionUpsellViewModel4) | gapComposer4.changed(function110) | gapComposer4.changedInstance(immutableList3) | gapComposer4.changedInstance(list);
                        String str6 = str3;
                        boolean changed9 = changed8 | gapComposer4.changed(str6);
                        ImmutableList immutableList4 = immutableList2;
                        boolean changed10 = changed9 | gapComposer4.changed(immutableList4);
                        Object rememberedValue12 = gapComposer4.rememberedValue();
                        if (changed10 || rememberedValue12 == obj6) {
                            rememberedValue12 = new InviteContactsBodyKt$$ExternalSyntheticLambda8(z10, promotionUpsellViewModel4, immutableList3, list, immutableList4, function110, function16, str6);
                            gapComposer4.updateRememberedValue(rememberedValue12);
                        }
                        LazyDslKt.LazyColumn(companion3, lazyListState2, null, null, null, null, false, null, (Function1) rememberedValue12, composer2, 6, 508);
                        gapComposer4.end(false);
                        gapComposer2 = gapComposer4;
                        z8 = true;
                    } else if (z2) {
                        gapComposer4.startReplaceGroup(-1575833165);
                        Modifier verticalScroll$default = ImageKt.verticalScroll$default(companion3, ImageKt.rememberScrollState(composer2), false, 14);
                        ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, composer2, 0);
                        int hashCode3 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer4.currentCompositionLocalScope();
                        Modifier materializeModifier3 = PlatformKt.materializeModifier(composer2, verticalScroll$default);
                        gapComposer4.startReusableNode();
                        if (gapComposer4.inserting) {
                            gapComposer4.createNode(layoutNode$Companion$Constructor$12);
                        } else {
                            gapComposer4.useNode();
                        }
                        Updater.m576setimpl(composer2, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$12);
                        Updater.m576setimpl(composer2, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$16);
                        Request$Priority$EnumUnboxingLocalUtility.m(hashCode3, composer2, composeUiNode$Companion$SetModifier$14, composer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        Updater.m576setimpl(composer2, materializeModifier3, composeUiNode$Companion$SetModifier$15);
                        if (promotionUpsellViewModel4 == null) {
                            gapComposer4.startReplaceGroup(647199592);
                            gapComposer4.end(false);
                            companion2 = companion3;
                        } else {
                            gapComposer4.startReplaceGroup(647199593);
                            companion2 = companion3;
                            AnimatedContentKt.AnimatedVisibility(ColumnScopeInstance.INSTANCE, !z10, null, EnterExitTransitionKt.fadeIn$default(null, 3), EnterExitTransitionKt.fadeOut$default(null, 3), null, Expect_jvmKt.rememberComposableLambda(-762938774, new InviteContactsBodyKt$$ExternalSyntheticLambda9(promotionUpsellViewModel4, function110, 0), composer2), composer2, 1600518, 18);
                            gapComposer4.end(false);
                        }
                        gapComposer2 = gapComposer4;
                        Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion2, RecyclerView.DECELERATION_RATE, (promotionUpsellViewModel4 == null || z10) ? 16.0f : RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                        Function0 function02 = function0;
                        boolean changed11 = gapComposer2.changed(function02);
                        Object rememberedValue13 = gapComposer2.rememberedValue();
                        if (changed11 || rememberedValue13 == obj6) {
                            rememberedValue13 = new ComposeDialogKt$$ExternalSyntheticLambda10(24, function02);
                            gapComposer2.updateRememberedValue(rememberedValue13);
                        }
                        SyncContactsRowKt.SyncContactsCard(0, 12, composer2, m302paddingqDBjuR0$default, null, null, (Function0) rememberedValue13);
                        z8 = true;
                        gapComposer2.end(true);
                        gapComposer2.end(false);
                    } else {
                        gapComposer2 = gapComposer4;
                        z8 = true;
                        gapComposer2.startReplaceGroup(-1575206593);
                        gapComposer2.end(false);
                    }
                    gapComposer2.end(z8);
                    return Unit.INSTANCE;
                }
            }, r11), r11, 1769862);
            gapComposer = r11;
            gapComposer.end(true);
            function14 = function17;
            z4 = z7;
            promotionUpsellViewModel2 = promotionUpsellViewModel3;
            modifier3 = modifier5;
        } else {
            gapComposer = r11;
            gapComposer.skipToGroupEnd();
            promotionUpsellViewModel2 = promotionUpsellViewModel;
            z4 = z3;
            function14 = function13;
            modifier3 = modifier2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2() { // from class: com.squareup.cash.invitations.InviteContactsBodyKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(i | 1);
                    int updateChangedFlags2 = Updater.updateChangedFlags(i2);
                    InviteErrorDialogKt.InviteContactsBody(Modifier.this, function1, str, function12, str2, inviteContactsHeaderViewModel, z, str3, immutableList, immutableList2, z2, function0, str4, str5, promotionUpsellViewModel2, z4, function14, (Composer) obj3, updateChangedFlags, updateChangedFlags2, i3);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void InviteContactsReferralRules(Modifier modifier, InviteContactsReferralRulesViewModel inviteContactsReferralRulesViewModel, RealImageLoader realImageLoader, Composer composer, int i) {
        List list;
        Modifier modifier2;
        Modifier.Companion companion;
        float f;
        inviteContactsReferralRulesViewModel.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-398899948);
        int i2 = i | (gapComposer.changed(modifier) ? 4 : 2) | (gapComposer.changedInstance(inviteContactsReferralRulesViewModel) ? 32 : 16) | (gapComposer.changedInstance(realImageLoader) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(modifier, RecyclerView.DECELERATION_RATE, 24.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
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
            InviteContactsReferralHeaderModel inviteContactsReferralHeaderModel = inviteContactsReferralRulesViewModel.headerImage;
            List list2 = inviteContactsReferralRulesViewModel.enableReferralTextSteps;
            boolean z = inviteContactsReferralHeaderModel instanceof InviteContactsReferralHeaderModel.Default;
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            if (z) {
                gapComposer.startReplaceGroup(1371068953);
                list = list2;
                ImageKt.Image(Countries.painterResource(R.drawable.hand_money, 0, gapComposer), null, SizeKt.fillMaxWidth(companion2, 1.0f), null, null, RecyclerView.DECELERATION_RATE, null, gapComposer, Painter.$stable | 432, 120);
                gapComposer.end(false);
                f = 24.0f;
                modifier2 = null;
                companion = companion2;
            } else {
                list = list2;
                if (!(inviteContactsReferralHeaderModel instanceof InviteContactsReferralHeaderModel.Remote)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1756890289, false);
                }
                gapComposer.startReplaceGroup(1371302197);
                Modifier aspectRatio = OffsetKt.aspectRatio(r1.imageWidth / r1.imageHeight, SizeKt.fillMaxWidth(companion2, 1.0f), false);
                String urlForTheme = ThemablesKt.urlForTheme(((InviteContactsReferralHeaderModel.Remote) inviteContactsReferralHeaderModel).image, gapComposer);
                int i3 = (i2 & 896) | 48;
                modifier2 = null;
                companion = companion2;
                f = 24.0f;
                AsyncImageKt.m1441AsyncImagesKDTAoQ(urlForTheme, null, realImageLoader, aspectRatio, null, null, null, gapComposer, i3, 0, 4080);
                gapComposer.end(false);
            }
            String str = inviteContactsReferralRulesViewModel.enableReferralTextTitle;
            if (str == null) {
                gapComposer.startReplaceGroup(1371641677);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1371641678);
                SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, f));
                Countries.PageHeader(Expect_jvmKt.rememberComposableLambda(-89782694, new PoolCreateViewKt$$ExternalSyntheticLambda5(str, 6), gapComposer), (Modifier) null, (Function2) null, Expect_jvmKt.rememberComposableLambda(-1364706249, new CashMapViewKt$$ExternalSyntheticLambda5(inviteContactsReferralRulesViewModel, 12), gapComposer), gapComposer, 3078, 6);
                gapComposer.end(false);
            }
            if (list.isEmpty()) {
                gapComposer.startReplaceGroup(1372146296);
                gapComposer.end(false);
            } else {
                re$$ExternalSyntheticOutline0.m(gapComposer, 1372015600, companion, f, gapComposer);
                ListOrderedKt.ListOrderedSubtle(modifier2, Tags.toImmutableList(list), gapComposer, 0);
                gapComposer.end(false);
            }
            String str2 = inviteContactsReferralRulesViewModel.enableReferralTextFooter;
            if (str2 == null) {
                gapComposer.startReplaceGroup(1372191338);
                gapComposer.end(false);
            } else {
                re$$ExternalSyntheticOutline0.m(gapComposer, 1372191339, companion, f, gapComposer);
                Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyXSmall;
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, colors.semantic.text.subtle, (Composer) gapComposer, m300paddingVpY3zN4$default, textStyle, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                gapComposer = gapComposer;
                gapComposer.end(false);
            }
            re$$ExternalSyntheticOutline0.m(companion, 40.0f, gapComposer, true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MoneyTabSectionUIKt$$ExternalSyntheticLambda6(modifier, inviteContactsReferralRulesViewModel, realImageLoader, i, 16);
        }
    }

    public static final void InviteContactsReferralRulesSheet(RealImageLoader realImageLoader, InviteContactsReferralRulesViewModel inviteContactsReferralRulesViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        inviteContactsReferralRulesViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1941691783);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(realImageLoader) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(inviteContactsReferralRulesViewModel) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1239067716, new HypeWelcomeUIKt$$ExternalSyntheticLambda0(12, inviteContactsReferralRulesViewModel, realImageLoader), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InviteContactsBodyKt$$ExternalSyntheticLambda18(realImageLoader, inviteContactsReferralRulesViewModel, function1, i, 20);
        }
    }

    public static final void InviteContactsView(RealImageLoader realImageLoader, InviteContactsViewModel inviteContactsViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        InviteContactsViewModel inviteContactsViewModel2;
        Modifier modifier2;
        int i3;
        boolean z;
        String str;
        String str2;
        inviteContactsViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1866975020);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(realImageLoader) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(inviteContactsViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        int i4 = i2 | 3072;
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 1171) != 1170)) {
            DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) gapComposer.consume(CompositionLocalsKt.LocalSoftwareKeyboardController);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier systemBarsPadding = SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape));
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, systemBarsPadding);
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, fillMaxSize2);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            NavigationType navigationType = NavigationType.CLOSE;
            int i5 = i4 & 896;
            boolean changed = gapComposer.changed(delegatingSoftwareKeyboardController) | (i5 == 256);
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (changed || rememberedValue == obj) {
                rememberedValue = new SetNameViewKt$$ExternalSyntheticLambda6(delegatingSoftwareKeyboardController, function1, 6);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function0 function0 = (Function0) rememberedValue;
            inviteContactsViewModel2 = inviteContactsViewModel;
            int i6 = 2;
            DBUtil.TitleBarSub("", navigationType, (Modifier) null, (DynamicColorConfiguration) null, function0, (Modifier) null, Expect_jvmKt.rememberComposableLambda(992861647, new InviteContactsViewKt$$ExternalSyntheticLambda1(inviteContactsViewModel2, delegatingSoftwareKeyboardController, function1, 0), gapComposer), gapComposer, 1572918, 44);
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), Expect_jvmKt.rememberComposableLambda(-973045616, new HypeWelcomeUIKt$$ExternalSyntheticLambda0(13, (Object) inviteContactsViewModel2, function1), gapComposer), gapComposer, 56);
            VerticalSlideAnimation((!(inviteContactsViewModel2.state instanceof InviteContactsViewModel$State$ShowInvite) || (str2 = inviteContactsViewModel2.sendInviteButtonText) == null || StringsKt.isBlank(str2)) ? false : true, Expect_jvmKt.rememberComposableLambda(996117112, new InviteContactsViewKt$$ExternalSyntheticLambda1(inviteContactsViewModel2, delegatingSoftwareKeyboardController, function1, i6), gapComposer), gapComposer, 48);
            String str3 = inviteContactsViewModel2.shareReferralLinkButtonText;
            VerticalSlideAnimation((str3 == null || StringsKt.isBlank(str3) || ((str = inviteContactsViewModel2.formattedText) != null && str.length() != 0)) ? false : true, Expect_jvmKt.rememberComposableLambda(97758255, new InviteContactsViewKt$$ExternalSyntheticLambda1(delegatingSoftwareKeyboardController, function1, inviteContactsViewModel2, 3), gapComposer), gapComposer, 48);
            gapComposer.end(true);
            InvitationSuccessToastViewModel invitationSuccessToastViewModel = (InvitationSuccessToastViewModel) inviteContactsViewModel2.invitationSuccessToastViewModel.value;
            int i7 = 9;
            if (invitationSuccessToastViewModel == null) {
                gapComposer.startReplaceGroup(730487157);
                z = false;
                gapComposer.end(false);
                i3 = 9;
            } else {
                gapComposer.startReplaceGroup(730487158);
                boolean z2 = (invitationSuccessToastViewModel.dismiss || invitationSuccessToastViewModel.delayPresentation) ? false : true;
                Modifier align = BoxScopeInstance.INSTANCE.align(SpacerKt.imePadding(companion), Alignment.Companion.BottomCenter);
                EnterTransitionImpl fadeIn$default = EnterExitTransitionKt.fadeIn$default(null, 3);
                ExitTransitionImpl fadeOut$default = EnterExitTransitionKt.fadeOut$default(null, 3);
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1433230196, new HypeWelcomeUIKt$$ExternalSyntheticLambda5(invitationSuccessToastViewModel, i7), gapComposer);
                i3 = 9;
                AnimatedContentKt.AnimatedVisibility(z2, align, fadeIn$default, fadeOut$default, (String) null, (Function3) rememberComposableLambda, (Composer) gapComposer, 200064, 16);
                gapComposer = gapComposer;
                z = false;
                gapComposer.end(false);
            }
            gapComposer.end(true);
            Object obj2 = inviteContactsViewModel2.inviteConsentBottomSheetModel.value;
            boolean z3 = i5 == 256 ? true : z;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z3 || rememberedValue2 == obj) {
                rememberedValue2 = new InviteErrorDialogKt$$ExternalSyntheticLambda0(25, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Function0 function02 = (Function0) rememberedValue2;
            boolean z4 = i5 == 256 ? true : z;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (z4 || rememberedValue3 == obj) {
                rememberedValue3 = new InviteErrorDialogKt$$ExternalSyntheticLambda0(26, function1);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            ArcadeModal2Kt.Modal(null, obj2, function02, (Function0) rememberedValue3, false, false, Expect_jvmKt.rememberComposableLambda(-1746456133, new MusicViewKt$$ExternalSyntheticLambda7(i3, function1), gapComposer), gapComposer, 1572864, 49);
            modifier2 = companion;
        } else {
            inviteContactsViewModel2 = inviteContactsViewModel;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda2(i, 20, realImageLoader, inviteContactsViewModel2, function1, modifier2, false);
        }
    }

    public static final void InviteErrorDialog(InviteErrorViewModel inviteErrorViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        inviteErrorViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1923764406);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(inviteErrorViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new InviteErrorDialogKt$$ExternalSyntheticLambda0(i3, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            ErrorModal(0, gapComposer, null, inviteErrorViewModel.message, (Function0) rememberedValue);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new GooglePayPresenter$$ExternalSyntheticLambda0(inviteErrorViewModel, function1, i, 27);
        }
    }

    public static final void PromotionUpsell(Modifier modifier, final InviteContactsViewModel.PromotionUpsellViewModel promotionUpsellViewModel, Function1 function1, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        Integer num;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1259259714);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = i | (gapComposer.changed(modifier2) ? 4 : 2);
        }
        int i5 = i3 | (gapComposer.changedInstance(promotionUpsellViewModel) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128);
        final int i6 = 1;
        if (gapComposer.shouldExecute(i5 & 1, (i5 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier modifier4 = i4 != 0 ? companion : modifier2;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier4, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            CardUpsellIllustration cardUpsellIllustration = null;
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
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            InviteContactsViewModel.PromotionUpsellViewModel.PromotionIllustration promotionIllustration = promotionUpsellViewModel.promotionIllustration;
            String str = promotionIllustration.imageUrlLight;
            if (str != null && (num = promotionIllustration.imageHeight) != null) {
                int intValue = num.intValue();
                Integer num2 = promotionIllustration.imageWidth;
                if (num2 != null) {
                    int intValue2 = num2.intValue();
                    String str2 = promotionIllustration.imageUrlDark;
                    if (str2 == null) {
                        str2 = str;
                    }
                    cardUpsellIllustration = new CardUpsellIllustration(str, intValue, intValue2, str2);
                }
            }
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1385157047, new Function2() { // from class: com.squareup.cash.invitations.InviteContactsBodyKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i7 = r2;
                    InviteContactsViewModel.PromotionUpsellViewModel promotionUpsellViewModel2 = promotionUpsellViewModel;
                    switch (i7) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, promotionUpsellViewModel2.title, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue4 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, promotionUpsellViewModel2.body, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer);
            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-1020315026, new HypeWelcomeUIKt$$ExternalSyntheticLambda5(promotionUpsellViewModel, 8), gapComposer);
            int i7 = (gapComposer.changedInstance(promotionUpsellViewModel) ? 1 : 0) | ((i5 & 896) == 256 ? 1 : 0);
            Object rememberedValue = gapComposer.rememberedValue();
            if (i7 != 0 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new IntentLauncher$$ExternalSyntheticLambda0(20, promotionUpsellViewModel, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            CardUpsellKt.CardUpsellSmall(rememberComposableLambda, rememberComposableLambda2, (Function0) rememberedValue, m300paddingVpY3zN4$default, Expect_jvmKt.rememberComposableLambda(-350697677, new Function2() { // from class: com.squareup.cash.invitations.InviteContactsBodyKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i72 = i6;
                    InviteContactsViewModel.PromotionUpsellViewModel promotionUpsellViewModel2 = promotionUpsellViewModel;
                    switch (i72) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, promotionUpsellViewModel2.title, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue4 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, promotionUpsellViewModel2.body, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), cardUpsellIllustration, gapComposer, 27702, 0);
            re$$ExternalSyntheticOutline0.m(companion, 32.0f, gapComposer, true);
            modifier3 = modifier4;
        } else {
            gapComposer.skipToGroupEnd();
            modifier3 = modifier2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InviteContactsBodyKt$$ExternalSyntheticLambda18(modifier3, promotionUpsellViewModel, function1, i, i2);
        }
    }

    public static final void VerticalSlideAnimation(boolean z, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        boolean z2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(189100998);
        int i2 = (gapComposer.changed(z) ? 4 : 2) | i;
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            TweenSpec tween$default = AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, 0, EasingFunctionsKt.EaseOut, 2);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new SvgDecoder$$ExternalSyntheticLambda0(i3);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            EnterTransitionImpl slideInVertically = EnterExitTransitionKt.slideInVertically(tween$default, (Function1) rememberedValue);
            TweenSpec tween$default2 = AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, 0, EasingFunctionsKt.EaseIn, 2);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new SvgDecoder$$ExternalSyntheticLambda0(i3);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            z2 = z;
            AnimatedContentKt.AnimatedVisibility(z2, (Modifier) null, slideInVertically, EnterExitTransitionKt.slideOutVertically(tween$default2, (Function1) rememberedValue2), (String) null, (Function3) Expect_jvmKt.rememberComposableLambda(704314350, new OverlayKt$$ExternalSyntheticLambda0(composableLambdaImpl, 15), gapComposer), (Composer) gapComposer, (i2 & 14) | 196608, 18);
        } else {
            z2 = z;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SliderDefaults$$ExternalSyntheticLambda0(z2, composableLambdaImpl, i, 8);
        }
    }

    public static final AreaCodeStates getAreaCodeState(String str, JsonFeatureFlags$SmsInviteConsentPhoneNumbers.SmsInviteConsentPhoneNumbersOptions smsInviteConsentPhoneNumbersOptions) {
        smsInviteConsentPhoneNumbersOptions.getClass();
        if (str == null) {
            return null;
        }
        if (smsInviteConsentPhoneNumbersOptions.FL.contains(str)) {
            return AreaCodeStates.FL;
        }
        if (smsInviteConsentPhoneNumbersOptions.OK.contains(str)) {
            return AreaCodeStates.OK;
        }
        if (smsInviteConsentPhoneNumbersOptions.WA.contains(str)) {
            return AreaCodeStates.WA;
        }
        return null;
    }

    public static final boolean isExpanded(CollapsingToolbarState collapsingToolbarState) {
        return collapsingToolbarState.getProgress() == 1.0f;
    }
}
