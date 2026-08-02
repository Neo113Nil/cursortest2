package com.squareup.cash.activity.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.video.internal.config.AudioConfigUtil;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.AlertDialogKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.local.views.LocalViewFactory$$ExternalSyntheticLambda4;
import app.cash.local.views.map.BrandSheetViewKt$$ExternalSyntheticLambda1;
import app.cash.local.views.map.BrandSheetViewKt$$ExternalSyntheticLambda6;
import app.cash.local.views.sheet.MenuPickerSheetKt$$ExternalSyntheticLambda4;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import bo.app.y0$$ExternalSyntheticLambda0;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import coil3.compose.SubcomposeAsyncImageKt$$ExternalSyntheticLambda0;
import coil3.compose.SubcomposeAsyncImageKt$$ExternalSyntheticLambda1;
import com.mikepenz.markdown.compose.MarkdownKt$$ExternalSyntheticLambda2;
import com.squareup.cash.R;
import com.squareup.cash.account.components.AccountAvatarKt$$ExternalSyntheticLambda1;
import com.squareup.cash.activity.viewmodels.ActivityEmbeddedViewModel;
import com.squareup.cash.activity.viewmodels.ActivityFeedEntry;
import com.squareup.cash.activity.viewmodels.ActivityItemViewModel;
import com.squareup.cash.activity.viewmodels.BalanceFeedViewModel;
import com.squareup.cash.activity.viewmodels.FullScreenActivityViewModel;
import com.squareup.cash.activity.viewmodels.ReactionsState;
import com.squareup.cash.afterpayapplet.views.AfterpaySearchViewKt$$ExternalSyntheticLambda16;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ToastKt$$ExternalSyntheticLambda3;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.avatar.DiagonalAvatarValues;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.theme.RippleKt;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda3;
import com.squareup.cash.borrow.views.FirstTimeBorrowKt$$ExternalSyntheticLambda2;
import com.squareup.cash.common.composeui.LocalCashVibratorKt;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.common.viewmodels.AvatarBadgeViewModel;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.overlays.OverlayKt;
import com.squareup.cash.sheet.BasicShieetKt$$ExternalSyntheticLambda0;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda3;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.cash.work.views.shift.ShiftNoteViewKt$$ExternalSyntheticLambda10;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import com.stripe.android.uicore.image.StripeImageKt$$ExternalSyntheticLambda3;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Reflection;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public abstract class AvatarsKt {

    /* renamed from: lambda$-350699550, reason: not valid java name */
    public static final ComposableLambdaImpl f120lambda$350699550 = new ComposableLambdaImpl(new AccountAvatarKt$$ExternalSyntheticLambda1(24), false, -350699550);

    /* renamed from: lambda$-1346904508, reason: not valid java name */
    public static final ComposableLambdaImpl f117lambda$1346904508 = new ComposableLambdaImpl(new AccountAvatarKt$$ExternalSyntheticLambda1(25), false, -1346904508);

    /* renamed from: lambda$-519082066, reason: not valid java name */
    public static final ComposableLambdaImpl f121lambda$519082066 = new ComposableLambdaImpl(new AccountAvatarKt$$ExternalSyntheticLambda1(26), false, -519082066);

    /* renamed from: lambda$-565801818, reason: not valid java name */
    public static final ComposableLambdaImpl f122lambda$565801818 = new ComposableLambdaImpl(new AccountAvatarKt$$ExternalSyntheticLambda1(27), false, -565801818);
    public static final ComposableLambdaImpl lambda$1290246991 = new ComposableLambdaImpl(new AccountAvatarKt$$ExternalSyntheticLambda1(28), false, 1290246991);

    /* renamed from: lambda$-885628514, reason: not valid java name */
    public static final ComposableLambdaImpl f123lambda$885628514 = new ComposableLambdaImpl(new AccountAvatarKt$$ExternalSyntheticLambda1(29), false, -885628514);
    public static final ComposableLambdaImpl lambda$753129536 = new ComposableLambdaImpl(new ErrorActivityItemKt$$ExternalSyntheticLambda0(17), false, 753129536);
    public static final ComposableLambdaImpl lambda$1218088259 = new ComposableLambdaImpl(new AfterpaySearchViewKt$$ExternalSyntheticLambda16(1), false, 1218088259);

    /* renamed from: lambda$-1110818500, reason: not valid java name */
    public static final ComposableLambdaImpl f115lambda$1110818500 = new ComposableLambdaImpl(new ErrorActivityItemKt$$ExternalSyntheticLambda0(18), false, -1110818500);

    /* renamed from: lambda$-287972667, reason: not valid java name */
    public static final ComposableLambdaImpl f119lambda$287972667 = new ComposableLambdaImpl(new AfterpaySearchViewKt$$ExternalSyntheticLambda16(2), false, -287972667);

    /* renamed from: lambda$-2080850944, reason: not valid java name */
    public static final ComposableLambdaImpl f118lambda$2080850944 = new ComposableLambdaImpl(new ErrorActivityItemKt$$ExternalSyntheticLambda0(19), false, -2080850944);

    /* renamed from: lambda$-1345117277, reason: not valid java name */
    public static final ComposableLambdaImpl f116lambda$1345117277 = new ComposableLambdaImpl(new ErrorActivityItemKt$$ExternalSyntheticLambda0(20), false, -1345117277);
    public static final ComposableLambdaImpl lambda$629644126 = new ComposableLambdaImpl(new AfterpaySearchViewKt$$ExternalSyntheticLambda16(3), false, 629644126);

    /* renamed from: lambda$-966776805, reason: not valid java name */
    public static final ComposableLambdaImpl f124lambda$966776805 = new ComposableLambdaImpl(new ErrorActivityItemKt$$ExternalSyntheticLambda0(21), false, -966776805);
    public static final ComposableLambdaImpl lambda$115031482 = new ComposableLambdaImpl(new ErrorActivityItemKt$$ExternalSyntheticLambda0(22), false, 115031482);
    public static final ComposableLambdaImpl lambda$1328290514 = new ComposableLambdaImpl(new AfterpaySearchViewKt$$ExternalSyntheticLambda16(4), false, 1328290514);
    public static final ComposableLambdaImpl lambda$847525855 = new ComposableLambdaImpl(new AfterpaySearchViewKt$$ExternalSyntheticLambda16(5), false, 847525855);

    public static final void ActivityAvatar(Modifier modifier, StackedAvatarViewModel stackedAvatarViewModel, AvatarBadgeViewModel avatarBadgeViewModel, AvatarSize avatarSize, Function0 function0, Composer composer, int i, int i2) {
        Modifier modifier2;
        AvatarSize avatarSize2;
        Modifier modifier3;
        boolean z;
        Modifier modifier4;
        stackedAvatarViewModel.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1956409386);
        int i3 = i | 6 | (gapComposer.changed(stackedAvatarViewModel) ? 32 : 16) | (gapComposer.changed(avatarBadgeViewModel) ? 256 : 128);
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= gapComposer.changed(avatarSize == null ? -1 : avatarSize.ordinal()) ? 2048 : 1024;
        }
        int i5 = i3 | (gapComposer.changedInstance(function0) ? 16384 : PKIFailureInfo.certRevoked);
        if (gapComposer.shouldExecute(i5 & 1, (i5 & 9363) != 9362)) {
            AvatarSize avatarSize3 = i4 != 0 ? AvatarSize.Size48 : avatarSize;
            boolean z2 = stackedAvatarViewModel instanceof StackedAvatarViewModel.Single;
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (z2) {
                gapComposer.startReplaceGroup(-685539083);
                gapComposer.startReplaceGroup(1086265826);
                if (function0 != null) {
                    z = (i5 & 57344) == 16384;
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (z || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new y0$$ExternalSyntheticLambda0(15, function0);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    modifier4 = RippleKt.clickableWithUnboundedRipple(companion, (Function0) rememberedValue, gapComposer);
                } else {
                    modifier4 = companion;
                }
                gapComposer.end(false);
                TextViewKt.Avatar(avatarSize3, com.squareup.cash.arcade.util.AvatarsKt.toAvatarEntry(((StackedAvatarViewModel.Single) stackedAvatarViewModel).avatar, avatarBadgeViewModel, null, gapComposer, 8 | ((i5 >> 3) & 112), 2), modifier4, false, gapComposer, (i5 >> 9) & 14, 24);
                gapComposer = gapComposer;
                gapComposer.end(false);
            } else if (stackedAvatarViewModel instanceof StackedAvatarViewModel.Duo) {
                gapComposer.startReplaceGroup(-685232741);
                gapComposer.startReplaceGroup(1086275938);
                if (function0 != null) {
                    z = (i5 & 57344) == 16384;
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (z || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new y0$$ExternalSyntheticLambda0(16, function0);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    modifier3 = RippleKt.clickableWithUnboundedRipple(companion, (Function0) rememberedValue2, gapComposer);
                } else {
                    modifier3 = companion;
                }
                gapComposer.end(false);
                int ordinal = avatarSize3.ordinal();
                StackedAvatarViewModel.Duo duo = (StackedAvatarViewModel.Duo) stackedAvatarViewModel;
                AudioConfigUtil.DiagonalStackedAvatars(ordinal != 3 ? ordinal != 4 ? DiagonalAvatarValues.Size48 : DiagonalAvatarValues.Size96 : DiagonalAvatarValues.Size64, com.squareup.cash.arcade.util.AvatarsKt.toAvatarEntry(duo.backAvatar, null, null, gapComposer, 8, 3), com.squareup.cash.arcade.util.AvatarsKt.toAvatarEntry(duo.frontAvatar, null, null, gapComposer, 8, 3), modifier3, gapComposer, 0, 0);
                gapComposer = gapComposer;
                gapComposer.end(false);
            } else {
                if (!(stackedAvatarViewModel instanceof StackedAvatarViewModel.Trio)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1086263209, false);
                }
                gapComposer.startReplaceGroup(-684677593);
                gapComposer.end(false);
            }
            avatarSize2 = avatarSize3;
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
            avatarSize2 = avatarSize;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AvatarsKt$$ExternalSyntheticLambda3(modifier2, stackedAvatarViewModel, avatarBadgeViewModel, avatarSize2, function0, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ActivityEmbeddedView(ActivityEmbeddedViewModel activityEmbeddedViewModel, Function1 function1, Modifier modifier, Function3 function3, Function2 function2, Modifier modifier2, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier3;
        int i4;
        Function2 function22;
        int i5;
        Modifier modifier4;
        int i6;
        Modifier modifier5;
        Function2 function23;
        Modifier modifier6;
        RecomposeScopeImpl endRestartGroup;
        Modifier m177backgroundbw27NRU;
        activityEmbeddedViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(806759828);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changedInstance(activityEmbeddedViewModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            modifier3 = modifier;
            i3 |= gapComposer.changed(modifier3) ? 256 : 128;
            if ((i & 3072) == 0) {
                i3 |= gapComposer.changedInstance(function3) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                function22 = function2;
                i3 |= gapComposer.changedInstance(function22) ? 16384 : PKIFailureInfo.certRevoked;
                if ((i2 & 32) != 0) {
                    i3 |= 196608;
                } else if ((i & 196608) == 0) {
                    i3 |= gapComposer.changedInstance(null) ? PKIFailureInfo.unsupportedVersion : 65536;
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i3 |= gapComposer.changedInstance(null) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                }
                if ((i2 & 128) != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i3 |= gapComposer.changedInstance(null) ? 8388608 : 4194304;
                }
                i5 = i2 & 256;
                if (i5 != 0) {
                    i3 |= 100663296;
                } else if ((100663296 & i) == 0) {
                    modifier4 = modifier2;
                    i3 |= gapComposer.changed(modifier4) ? 67108864 : 33554432;
                    i6 = i3;
                    if (gapComposer.shouldExecute(i6 & 1, (38347923 & i6) == 38347922)) {
                        gapComposer.skipToGroupEnd();
                        modifier5 = modifier3;
                        function23 = function22;
                        modifier6 = modifier4;
                    } else {
                        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                        Modifier modifier7 = i7 != 0 ? companion : modifier3;
                        Function2 function24 = i4 != 0 ? null : function22;
                        if (i5 != 0) {
                            modifier4 = companion;
                        }
                        if (activityEmbeddedViewModel.compact) {
                            gapComposer.startReplaceGroup(-454385352);
                            gapComposer.end(false);
                            m177backgroundbw27NRU = modifier7;
                        } else {
                            gapComposer.startReplaceGroup(-454355871);
                            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                            if (colors == null) {
                                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                            } else {
                                gapComposer.startReplaceGroup(-1762997739);
                                gapComposer.end(false);
                            }
                            m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(modifier7, colors.semantic.background.f1047app, ColorKt.RectangleShape);
                            gapComposer.end(false);
                        }
                        ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
                        int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
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
                        gapComposer.startReplaceGroup(1765763334);
                        Iterator it = activityEmbeddedViewModel.feedEntries.iterator();
                        while (it.hasNext()) {
                            GapComposer gapComposer2 = gapComposer;
                            int i8 = i6 >> 3;
                            int i9 = i6 >> 6;
                            EntryContent(companion, (ActivityFeedEntry) it.next(), function3, function24, null, null, function1, activityEmbeddedViewModel.compact, gapComposer2, (i8 & 7168) | (i8 & 896) | 6 | (57344 & i9) | (i9 & 458752) | ((i6 << 15) & 3670016));
                            modifier4 = modifier4;
                            gapComposer = gapComposer2;
                        }
                        Function2 function25 = function24;
                        Modifier modifier8 = modifier4;
                        gapComposer.end(false);
                        AnimatedContentKt.AnimatedContent(activityEmbeddedViewModel.loadingError, null, null, null, null, null, Expect_jvmKt.rememberComposableLambda(-1179099441, new FirstTimeBorrowKt$$ExternalSyntheticLambda2((Function2) null, function1, modifier8), gapComposer), gapComposer, 1572864, 62);
                        AnimatedContentKt.AnimatedVisibility(ColumnScopeInstance.INSTANCE, activityEmbeddedViewModel.showLoadingIndicator && activityEmbeddedViewModel.isRefreshing && !activityEmbeddedViewModel.getHasLoadingError(), null, EnterExitTransitionKt.fadeIn$default(null, 3), null, null, f120lambda$350699550, gapComposer, 1575942, 26);
                        gapComposer.end(true);
                        modifier6 = modifier8;
                        modifier5 = modifier7;
                        function23 = function25;
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.block = new SubcomposeAsyncImageKt$$ExternalSyntheticLambda1(activityEmbeddedViewModel, function1, modifier5, function3, function23, modifier6, i, i2, 5);
                        return;
                    }
                    return;
                }
                modifier4 = modifier2;
                i6 = i3;
                if (gapComposer.shouldExecute(i6 & 1, (38347923 & i6) == 38347922)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function22 = function2;
            if ((i2 & 32) != 0) {
            }
            if ((i2 & 64) != 0) {
            }
            if ((i2 & 128) != 0) {
            }
            i5 = i2 & 256;
            if (i5 != 0) {
            }
            modifier4 = modifier2;
            i6 = i3;
            if (gapComposer.shouldExecute(i6 & 1, (38347923 & i6) == 38347922)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier3 = modifier;
        if ((i & 3072) == 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        function22 = function2;
        if ((i2 & 32) != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        i5 = i2 & 256;
        if (i5 != 0) {
        }
        modifier4 = modifier2;
        i6 = i3;
        if (gapComposer.shouldExecute(i6 & 1, (38347923 & i6) == 38347922)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void ActivityScrollableEmbeddedView(ActivityEmbeddedViewModel activityEmbeddedViewModel, Function1 function1, Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, Function3 function3, Function2 function2, Function3 function32, Composer composer, int i) {
        int i2;
        LazyListState lazyListState2;
        PaddingValues paddingValues2;
        Function3 function33;
        Function2 function22;
        GapComposer gapComposer;
        activityEmbeddedViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1051832284);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(activityEmbeddedViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changed(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            lazyListState2 = lazyListState;
            i2 |= gapComposer2.changed(lazyListState2) ? 2048 : 1024;
        } else {
            lazyListState2 = lazyListState;
        }
        if ((i & 24576) == 0) {
            paddingValues2 = paddingValues;
            i2 |= gapComposer2.changed(paddingValues2) ? 16384 : PKIFailureInfo.certRevoked;
        } else {
            paddingValues2 = paddingValues;
        }
        if ((196608 & i) == 0) {
            function33 = function3;
            i2 |= gapComposer2.changedInstance(function33) ? PKIFailureInfo.unsupportedVersion : 65536;
        } else {
            function33 = function3;
        }
        if ((1572864 & i) == 0) {
            i2 |= gapComposer2.changedInstance(null) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i) == 0) {
            i2 |= gapComposer2.changedInstance(null) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            function22 = function2;
            i2 |= gapComposer2.changedInstance(function22) ? 67108864 : 33554432;
        } else {
            function22 = function2;
        }
        if ((805306368 & i) == 0) {
            i2 |= gapComposer2.changedInstance(function32) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (306783379 & i2) != 306783378)) {
            gapComposer2.startDefaults();
            if ((i & 1) != 0 && !gapComposer2.getDefaultsInvalid()) {
                gapComposer2.skipToGroupEnd();
            }
            gapComposer2.endDefaults();
            Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(modifier, colors.semantic.background.f1047app, ColorKt.RectangleShape);
            boolean z = activityEmbeddedViewModel.isRefreshing;
            String stringResource = Room.stringResource(gapComposer2, R.string.activity_pull_to_refresh_label);
            boolean z2 = (i2 & 112) == 32;
            Object rememberedValue = gapComposer2.rememberedValue();
            if (z2 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BalanceFeedKt$$ExternalSyntheticLambda4(9, function1);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            gapComposer = gapComposer2;
            VisibleKt.PullToRefresh(196608, 8, gapComposer, Expect_jvmKt.rememberComposableLambda(464154289, new BasicShieetKt$$ExternalSyntheticLambda0(lazyListState2, paddingValues2, activityEmbeddedViewModel, function1, function33, function22, function32, 1), gapComposer2), m177backgroundbw27NRU, stringResource, (Function0) rememberedValue, z, false);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new StripeImageKt$$ExternalSyntheticLambda3(activityEmbeddedViewModel, function1, modifier, lazyListState, paddingValues, function3, function2, function32, i);
        }
    }

    public static final void BalanceFeed(RealImageLoader realImageLoader, BalanceFeedViewModel balanceFeedViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        balanceFeedViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1325045396);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(realImageLoader) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(balanceFeedViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), Expect_jvmKt.rememberComposableLambda(-2122839596, new BalanceFeedKt$$ExternalSyntheticLambda1(balanceFeedViewModel, function1, i3), gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MarkdownKt$$ExternalSyntheticLambda2(realImageLoader, balanceFeedViewModel, function1, i, 26);
        }
    }

    public static final void EntryContent(Modifier modifier, ActivityFeedEntry activityFeedEntry, Function3 function3, Function2 function2, Function2 function22, Function3 function32, Function1 function1, boolean z, Composer composer, int i) {
        int i2;
        boolean z2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(460571721);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(activityFeedEntry) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(function2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changedInstance(function22) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer.changedInstance(function32) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 1048576 : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i) == 0) {
            i2 |= gapComposer.changed(z) ? 8388608 : 4194304;
        }
        if (gapComposer.shouldExecute(i2 & 1, (4793491 & i2) != 4793490)) {
            boolean z3 = activityFeedEntry instanceof ActivityFeedEntry.EmbeddedHeader;
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z3) {
                gapComposer.startReplaceGroup(-1527895549);
                boolean z4 = ((ActivityFeedEntry.EmbeddedHeader) activityFeedEntry).hasMore;
                boolean changed = gapComposer.changed(z4);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changed || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new EmbeddedHeaderScope(z4);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                EmbeddedHeaderScope embeddedHeaderScope = (EmbeddedHeaderScope) rememberedValue;
                if (function3 != null) {
                    gapComposer.startReplaceGroup(227811774);
                    function3.invoke(embeddedHeaderScope, gapComposer, Integer.valueOf((i2 >> 3) & 112));
                    gapComposer.end(false);
                } else if (z) {
                    gapComposer.startReplaceGroup(227813325);
                    boolean z5 = (i2 & 3670016) == 1048576;
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (z5 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new BalanceFeedKt$$ExternalSyntheticLambda4(6, function1);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    embeddedHeaderScope.CompactHeader((Function0) rememberedValue2, gapComposer, 0);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(227816656);
                    String stringResource = Room.stringResource(gapComposer, R.string.activity_title);
                    boolean z6 = (i2 & 3670016) == 1048576;
                    Object rememberedValue3 = gapComposer.rememberedValue();
                    if (z6 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new BalanceFeedKt$$ExternalSyntheticLambda4(7, function1);
                        gapComposer.updateRememberedValue(rememberedValue3);
                    }
                    z2 = false;
                    embeddedHeaderScope.DefaultHeader(0, 2, gapComposer, stringResource, null, (Function0) rememberedValue3);
                    gapComposer.end(false);
                    gapComposer.end(z2);
                }
                z2 = false;
                gapComposer.end(z2);
            } else if (activityFeedEntry instanceof ActivityFeedEntry.Item) {
                gapComposer.startReplaceGroup(-1527398061);
                UiCallbackModel uiCallbackModel = ((ActivityFeedEntry.Item) activityFeedEntry).activityItem;
                ActivityItemViewKt.m2972ActivityItemViewww6aTOc(ActivityItemViewModel.copy$default((ActivityItemViewModel) uiCallbackModel.model, null, null, z, 4095), uiCallbackModel.onEvent, modifier, 0L, gapComposer, (i2 << 6) & 896, 8);
                gapComposer = gapComposer;
                gapComposer.end(false);
            } else if (activityFeedEntry instanceof ActivityFeedEntry.ErrorItem) {
                gapComposer.startReplaceGroup(227830204);
                ErrorActivityItem(gapComposer, 0);
                gapComposer.end(false);
            } else {
                boolean z7 = activityFeedEntry instanceof ActivityFeedEntry.EmptyItem;
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                if (z7) {
                    gapComposer.startReplaceGroup(227832616);
                    if (function2 != null) {
                        gapComposer.startReplaceGroup(-1527101453);
                        Recorder$$ExternalSyntheticOutline1.m((i2 >> 9) & 14, function2, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1527041096);
                        Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(companion, 1.0f), 16.0f, RecyclerView.DECELERATION_RATE, 16.0f, 16.0f, 2);
                        String str = ((ActivityFeedEntry.EmptyItem) activityFeedEntry).message;
                        Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, colors.semantic.text.subtle, (Composer) gapComposer, m302paddingqDBjuR0$default, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyMedium, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                        gapComposer = gapComposer;
                        gapComposer.end(false);
                    }
                    gapComposer.end(false);
                } else if (activityFeedEntry instanceof ActivityFeedEntry.Header) {
                    re$$ExternalSyntheticOutline0.m(gapComposer, -1526739931, companion, 32.0f, gapComposer);
                    boolean changed2 = gapComposer.changed(activityFeedEntry);
                    Object rememberedValue4 = gapComposer.rememberedValue();
                    if (changed2 || rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new SectionHeaderScope((ActivityFeedEntry.Header) activityFeedEntry, false);
                        gapComposer.updateRememberedValue(rememberedValue4);
                    }
                    SectionHeaderScope sectionHeaderScope = (SectionHeaderScope) rememberedValue4;
                    if (function32 == null) {
                        gapComposer.startReplaceGroup(-1526544910);
                        sectionHeaderScope.DefaultHeader(0, 1, gapComposer, null);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-1526499867);
                        function32.invoke(sectionHeaderScope, gapComposer, Integer.valueOf((i2 >> 12) & 112));
                        gapComposer.end(false);
                    }
                    gapComposer.end(false);
                } else {
                    if (!(activityFeedEntry instanceof ActivityFeedEntry.EmbeddedFooter)) {
                        gapComposer.startReplaceGroup(227858114);
                        gapComposer.end(false);
                        throw new UnsupportedOperationException("Entry type " + Reflection.factory.getOrCreateKotlinClass(activityFeedEntry.getClass()) + " not supported in embedded Activity feed");
                    }
                    gapComposer.startReplaceGroup(-1526370287);
                    if (function22 == null) {
                        gapComposer.startReplaceGroup(-1526370288);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(227856913);
                        Recorder$$ExternalSyntheticOutline1.m((i2 >> 12) & 14, function22, gapComposer, false);
                    }
                    gapComposer.end(false);
                }
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SheetKt$$ExternalSyntheticLambda3(modifier, activityFeedEntry, function3, function2, function22, function32, function1, z, i);
        }
    }

    public static final void ErrorActivityItem(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1162574529);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            CellDefaultKt.m3388CellActivity6RhP_wg(f119lambda$287972667, f118lambda$2080850944, lambda$629644126, null, null, null, f124lambda$966776805, lambda$115031482, false, 0L, gapComposer, 14159286, 816);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ErrorActivityItemKt$$ExternalSyntheticLambda0(i, 0);
        }
    }

    public static final void FullScreenActivity(FullScreenActivityViewModel fullScreenActivityViewModel, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1333966923);
        int i2 = (gapComposer.changedInstance(fullScreenActivityViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
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
            Modifier fillMaxSize = SizeKt.fillMaxSize(ImageKt.m177backgroundbw27NRU(companion, j, rectangleShapeKt$RectangleShape$1), 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxSize);
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
            String str = fullScreenActivityViewModel.title;
            NavigationType navigationType = NavigationType.BACK;
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BalanceFeedKt$$ExternalSyntheticLambda4(25, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.TitleBarSub(str, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer, 48, 108);
            Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion, 1.0f);
            UiCallbackModel uiCallbackModel = fullScreenActivityViewModel.activityEmbeddedViewModel;
            WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
            ActivityScrollableEmbeddedView(uiCallbackModel, fillMaxSize2, (LazyListState) null, SpacerKt.asPaddingValues(Arrangement$End$1.current(gapComposer).navigationBars, gapComposer), (Function3) null, (Function2) null, (Function3) null, gapComposer, 48, 500);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FullScreenActivityViewKt$$ExternalSyntheticLambda0(fullScreenActivityViewModel, function1, i);
        }
    }

    public static final void FullScreenActivityView(FullScreenActivityViewModel fullScreenActivityViewModel, Function1 function1, RealImageLoader realImageLoader, RealCashVibrator realCashVibrator, Composer composer, int i) {
        int i2;
        function1.getClass();
        realImageLoader.getClass();
        realCashVibrator.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-371111448);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(fullScreenActivityViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(realImageLoader) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(realCashVibrator) ? 2048 : 1024;
        }
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (fullScreenActivityViewModel == null) {
                a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
                return;
            }
            Updater.CompositionLocalProvider(new ProvidedValue[]{LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), LocalCashVibratorKt.LocalCashVibrator.defaultProvidedValue$runtime(realCashVibrator)}, Expect_jvmKt.rememberComposableLambda(1698344232, new FullScreenActivityViewKt$$ExternalSyntheticLambda0(fullScreenActivityViewModel, function1), gapComposer), gapComposer, 56);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AlertDialogKt$$ExternalSyntheticLambda0(fullScreenActivityViewModel, i, function1, realImageLoader, realCashVibrator, 19);
        }
    }

    public static final void InfoSheet(Modifier modifier, BalanceFeedViewModel.InfoSheet infoSheet, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(335923268);
        int i2 = (gapComposer.changed(modifier) ? 4 : 2) | i | (gapComposer.changedInstance(infoSheet) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
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
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Countries.PageHeader(infoSheet.title, SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 4.0f, 7), (Function2) null, (String) null, gapComposer, 0, 12);
            Strings.getSizes(gapComposer).getClass();
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, infoSheet.body, (Map) null, (Function1) null, false);
            Strings.getSizes(gapComposer).getClass();
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 16.0f));
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MenuPickerSheetKt$$ExternalSyntheticLambda4(modifier, infoSheet, i, 22);
        }
    }

    public static final void LoadingError(ActivityEmbeddedViewModel.LoadingError loadingError, Function0 function0, Modifier modifier, Composer composer, int i) {
        int i2;
        Function0 function02;
        GapComposer gapComposer;
        loadingError.getClass();
        function0.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1104146346);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(loadingError) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            function02 = function0;
            i2 |= gapComposer2.changedInstance(function02) ? 32 : 16;
        } else {
            function02 = function0;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changed(modifier) ? 256 : 128;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(modifier, 1.0f), RecyclerView.DECELERATION_RATE, 32.0f, 1);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.CenterHorizontally, gapComposer2, 54);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m300paddingVpY3zN4$default);
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
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, loadingError.message, (Map) null, (Function1) null, false);
            coil3.size.SizeKt.ButtonCompact(function02, null, null, false, false, null, f117lambda$1346904508, gapComposer2, ((i2 >> 3) & 14) | 1572864, 62);
            gapComposer = gapComposer2;
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MarkdownKt$$ExternalSyntheticLambda2(loadingError, function0, modifier, i, 24);
        }
    }

    public static final void MessageDismissModal(Function0 function0, Function0 function02, Composer composer, int i) {
        int i2;
        function0.getClass();
        function02.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-806121941);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function02) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            OverlayKt.Overlay(function02, Expect_jvmKt.rememberComposableLambda(474685423, new ActivityTabViewKt$$ExternalSyntheticLambda19(function0, function02, i3), gapComposer), gapComposer, ((i2 >> 3) & 14) | 48);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ShiftNoteViewKt$$ExternalSyntheticLambda10(function0, function02, i, 1);
        }
    }

    public static final void activityEmbeddedItems(LazyListScope lazyListScope, ActivityEmbeddedViewModel activityEmbeddedViewModel, Function1 function1, Function3 function3, Function2 function2, Function3 function32) {
        for (ActivityFeedEntry activityFeedEntry : activityEmbeddedViewModel.feedEntries) {
            if (activityFeedEntry instanceof ActivityFeedEntry.Header) {
                ActivityFeedEntry.Header header = (ActivityFeedEntry.Header) activityFeedEntry;
                String str = header.key;
                LazyListScope.item$default(lazyListScope, Recorder$$ExternalSyntheticOutline2.m$1(str, " spacer"), null, f121lambda$519082066, 2);
                lazyListScope.stickyHeader(str, Reflection.factory.getOrCreateKotlinClass(ActivityFeedEntry.Header.class), new ComposableLambdaImpl(new LocalViewFactory$$ExternalSyntheticLambda4(14, header, function32), true, -1953423430));
            } else {
                lazyListScope.item(activityFeedEntry.getKey(), Reflection.factory.getOrCreateKotlinClass(activityFeedEntry.getClass()), new ComposableLambdaImpl(new SubcomposeAsyncImageKt$$ExternalSyntheticLambda0(activityFeedEntry, function3, function2, function32, function1, activityEmbeddedViewModel, 2), true, -1098385043));
            }
        }
        ActivityEmbeddedViewModel.LoadingError loadingError = activityEmbeddedViewModel.loadingError;
        if (loadingError != null) {
            LazyListScope.item$default(lazyListScope, "loading error", null, new ComposableLambdaImpl(new BrandSheetViewKt$$ExternalSyntheticLambda1(12, (Object) loadingError, (Object) function1), true, -1855316421), 2);
        }
        if (!activityEmbeddedViewModel.hasMore || activityEmbeddedViewModel.getHasLoadingError()) {
            return;
        }
        LazyListScope.item$default(lazyListScope, "has more", null, new ComposableLambdaImpl(new BrandSheetViewKt$$ExternalSyntheticLambda6(11, function1), true, -1737074527), 2);
    }

    public static final Modifier reactionsAnchor(Modifier modifier, ReactionsState reactionsState, Function1 function1) {
        modifier.getClass();
        reactionsState.getClass();
        function1.getClass();
        return modifier.then(new ReactionsElement(reactionsState, function1));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ActivityScrollableEmbeddedView(UiCallbackModel uiCallbackModel, Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, Function3 function3, Function2 function2, Function3 function32, Composer composer, int i, int i2) {
        LazyListState lazyListState2;
        int i3;
        int i4;
        PaddingValues paddingValues2;
        int i5;
        int i6;
        Function3 function33;
        int i7;
        int i8;
        int i9;
        Function3 function34;
        GapComposer gapComposer;
        Modifier modifier2;
        Function2 function22;
        LazyListState lazyListState3;
        PaddingValues paddingValues3;
        Function3 function35;
        Function3 function36;
        RecomposeScopeImpl endRestartGroup;
        LazyListState lazyListState4;
        Modifier modifier3;
        int i10;
        LazyListState lazyListState5;
        Function2 function23;
        PaddingValues paddingValues4;
        Function3 function37;
        uiCallbackModel.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1850921100);
        int i11 = (gapComposer2.changed(uiCallbackModel) ? 4 : 2) | i;
        int i12 = i2 & 2;
        if (i12 != 0) {
            i11 |= 48;
        } else if ((i & 48) == 0) {
            i11 |= gapComposer2.changed(modifier) ? 32 : 16;
            if ((i2 & 4) != 0) {
                lazyListState2 = lazyListState;
                if (gapComposer2.changed(lazyListState2)) {
                    i3 = 256;
                    int i13 = i11 | i3;
                    i4 = i2 & 8;
                    if (i4 != 0) {
                        i5 = i13 | 3072;
                        paddingValues2 = paddingValues;
                    } else {
                        paddingValues2 = paddingValues;
                        i5 = i13 | (gapComposer2.changed(paddingValues2) ? 2048 : 1024);
                    }
                    i6 = i2 & 16;
                    if (i6 != 0) {
                        i5 |= 24576;
                    } else if ((i & 24576) == 0) {
                        function33 = function3;
                        i5 |= gapComposer2.changedInstance(function33) ? 16384 : PKIFailureInfo.certRevoked;
                        i7 = 1769472 | i5;
                        i8 = i2 & 128;
                        if (i8 == 0) {
                            i7 = 14352384 | i5;
                        } else if ((12582912 & i) == 0) {
                            i7 |= gapComposer2.changedInstance(function2) ? 8388608 : 4194304;
                            i9 = i2 & 256;
                            if (i9 != 0) {
                                i7 |= 100663296;
                            } else if ((100663296 & i) == 0) {
                                function34 = function32;
                                i7 |= gapComposer2.changedInstance(function34) ? 67108864 : 33554432;
                                if (!gapComposer2.shouldExecute(i7 & 1, (i7 & 38347923) == 38347922)) {
                                    gapComposer2.startDefaults();
                                    if ((i & 1) != 0 && !gapComposer2.getDefaultsInvalid()) {
                                        gapComposer2.skipToGroupEnd();
                                        if ((i2 & 4) != 0) {
                                            i7 &= -897;
                                        }
                                        function23 = function2;
                                        lazyListState5 = lazyListState2;
                                        paddingValues4 = paddingValues2;
                                        i10 = i7;
                                        function37 = function34;
                                        modifier3 = modifier;
                                    } else {
                                        Modifier modifier4 = i12 != 0 ? Modifier.Companion.$$INSTANCE : modifier;
                                        if ((i2 & 4) != 0) {
                                            lazyListState4 = LazyListStateKt.rememberLazyListState(0, 3, gapComposer2);
                                            i7 &= -897;
                                        } else {
                                            lazyListState4 = lazyListState2;
                                        }
                                        if (i4 != 0) {
                                            paddingValues2 = new PaddingValuesImpl(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
                                        }
                                        if (i6 != 0) {
                                            function33 = null;
                                        }
                                        Function2 function24 = i8 != 0 ? null : function2;
                                        int i14 = i7;
                                        modifier3 = modifier4;
                                        i10 = i14;
                                        lazyListState5 = lazyListState4;
                                        if (i9 != 0) {
                                            function37 = null;
                                            function23 = function24;
                                            paddingValues4 = paddingValues2;
                                        } else {
                                            function23 = function24;
                                            paddingValues4 = paddingValues2;
                                            function37 = function34;
                                        }
                                    }
                                    Function3 function38 = function33;
                                    gapComposer2.endDefaults();
                                    gapComposer = gapComposer2;
                                    ActivityScrollableEmbeddedView((ActivityEmbeddedViewModel) uiCallbackModel.model, uiCallbackModel.onEvent, modifier3, lazyListState5, paddingValues4, function38, function23, function37, gapComposer, (i10 << 3) & 2147483520);
                                    modifier2 = modifier3;
                                    lazyListState3 = lazyListState5;
                                    paddingValues3 = paddingValues4;
                                    function35 = function38;
                                    function22 = function23;
                                    function36 = function37;
                                } else {
                                    gapComposer = gapComposer2;
                                    gapComposer.skipToGroupEnd();
                                    modifier2 = modifier;
                                    function22 = function2;
                                    lazyListState3 = lazyListState2;
                                    paddingValues3 = paddingValues2;
                                    function35 = function33;
                                    function36 = function34;
                                }
                                endRestartGroup = gapComposer.endRestartGroup();
                                if (endRestartGroup == null) {
                                    endRestartGroup.block = new ToastKt$$ExternalSyntheticLambda3(uiCallbackModel, modifier2, lazyListState3, paddingValues3, function35, function22, function36, i, i2);
                                    return;
                                }
                                return;
                            }
                            function34 = function32;
                            if (!gapComposer2.shouldExecute(i7 & 1, (i7 & 38347923) == 38347922)) {
                            }
                            endRestartGroup = gapComposer.endRestartGroup();
                            if (endRestartGroup == null) {
                            }
                        }
                        i9 = i2 & 256;
                        if (i9 != 0) {
                        }
                        function34 = function32;
                        if (!gapComposer2.shouldExecute(i7 & 1, (i7 & 38347923) == 38347922)) {
                        }
                        endRestartGroup = gapComposer.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    function33 = function3;
                    i7 = 1769472 | i5;
                    i8 = i2 & 128;
                    if (i8 == 0) {
                    }
                    i9 = i2 & 256;
                    if (i9 != 0) {
                    }
                    function34 = function32;
                    if (!gapComposer2.shouldExecute(i7 & 1, (i7 & 38347923) == 38347922)) {
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
            } else {
                lazyListState2 = lazyListState;
            }
            i3 = 128;
            int i132 = i11 | i3;
            i4 = i2 & 8;
            if (i4 != 0) {
            }
            i6 = i2 & 16;
            if (i6 != 0) {
            }
            function33 = function3;
            i7 = 1769472 | i5;
            i8 = i2 & 128;
            if (i8 == 0) {
            }
            i9 = i2 & 256;
            if (i9 != 0) {
            }
            function34 = function32;
            if (!gapComposer2.shouldExecute(i7 & 1, (i7 & 38347923) == 38347922)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i2 & 4) != 0) {
        }
        i3 = 128;
        int i1322 = i11 | i3;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        i6 = i2 & 16;
        if (i6 != 0) {
        }
        function33 = function3;
        i7 = 1769472 | i5;
        i8 = i2 & 128;
        if (i8 == 0) {
        }
        i9 = i2 & 256;
        if (i9 != 0) {
        }
        function34 = function32;
        if (!gapComposer2.shouldExecute(i7 & 1, (i7 & 38347923) == 38347922)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ActivityEmbeddedView(UiCallbackModel uiCallbackModel, Modifier modifier, Function3 function3, Function2 function2, Modifier modifier2, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier3;
        int i4;
        Function3 function32;
        int i5;
        Function2 function22;
        int i6;
        int i7;
        Modifier modifier4;
        Modifier modifier5;
        Function3 function33;
        Function2 function23;
        Modifier modifier6;
        RecomposeScopeImpl endRestartGroup;
        int i8;
        Modifier modifier7;
        int i9;
        Function3 function34;
        Modifier.Companion companion;
        Function2 function24;
        uiCallbackModel.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(857718396);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? gapComposer.changed(uiCallbackModel) : gapComposer.changedInstance(uiCallbackModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier3 = modifier;
            i3 |= gapComposer.changed(modifier3) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= MLKEMEngine.KyberPolyBytes;
            } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                function32 = function3;
                i3 |= gapComposer.changedInstance(function32) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    function22 = function2;
                    i3 |= gapComposer.changedInstance(function22) ? 2048 : 1024;
                    i6 = 1794048 | i3;
                    i7 = i2 & 128;
                    if (i7 == 0) {
                        i6 = 14376960 | i3;
                    } else if ((12582912 & i) == 0) {
                        modifier4 = modifier2;
                        i6 |= gapComposer.changed(modifier4) ? 8388608 : 4194304;
                        if (gapComposer.shouldExecute(i6 & 1, (4793491 & i6) != 4793490)) {
                            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                            if (i10 != 0) {
                                i8 = i6;
                                modifier7 = companion2;
                            } else {
                                i8 = i6;
                                modifier7 = modifier3;
                            }
                            if (i4 != 0) {
                                i9 = i7;
                                function34 = null;
                            } else {
                                i9 = i7;
                                function34 = function32;
                            }
                            if (i5 != 0) {
                                function24 = null;
                                companion = companion2;
                            } else {
                                companion = companion2;
                                function24 = function22;
                            }
                            Modifier modifier8 = i9 != 0 ? companion : modifier4;
                            ActivityEmbeddedView((ActivityEmbeddedViewModel) uiCallbackModel.model, uiCallbackModel.onEvent, modifier7, function34, function24, modifier8, gapComposer, (i8 << 3) & 268435328, 0);
                            modifier5 = modifier7;
                            function33 = function34;
                            function23 = function24;
                            modifier6 = modifier8;
                        } else {
                            gapComposer.skipToGroupEnd();
                            modifier5 = modifier3;
                            function33 = function32;
                            function23 = function22;
                            modifier6 = modifier4;
                        }
                        endRestartGroup = gapComposer.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.block = new AvatarsKt$$ExternalSyntheticLambda3(uiCallbackModel, modifier5, function33, function23, modifier6, i, i2);
                            return;
                        }
                        return;
                    }
                    modifier4 = modifier2;
                    if (gapComposer.shouldExecute(i6 & 1, (4793491 & i6) != 4793490)) {
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function22 = function2;
                i6 = 1794048 | i3;
                i7 = i2 & 128;
                if (i7 == 0) {
                }
                modifier4 = modifier2;
                if (gapComposer.shouldExecute(i6 & 1, (4793491 & i6) != 4793490)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            function32 = function3;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function22 = function2;
            i6 = 1794048 | i3;
            i7 = i2 & 128;
            if (i7 == 0) {
            }
            modifier4 = modifier2;
            if (gapComposer.shouldExecute(i6 & 1, (4793491 & i6) != 4793490)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier3 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function32 = function3;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function22 = function2;
        i6 = 1794048 | i3;
        i7 = i2 & 128;
        if (i7 == 0) {
        }
        modifier4 = modifier2;
        if (gapComposer.shouldExecute(i6 & 1, (4793491 & i6) != 4793490)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
