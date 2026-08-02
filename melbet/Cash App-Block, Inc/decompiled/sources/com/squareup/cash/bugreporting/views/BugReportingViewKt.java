package com.squareup.cash.bugreporting.views;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import androidx.activity.ComponentActivity;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.compose.ViewfinderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.input.TextFieldLineLimits;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.TextFieldStateKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.LinkInteractionListener;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLinkStyles;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.local.views.sheet.EducationalSheetKt$$ExternalSyntheticLambda10;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda16;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.AsyncImageKt;
import coil3.compose.LocalImageLoaderKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.activity.views.receipts.ReceiptUiKt$$ExternalSyntheticLambda47;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.CheckboxKt;
import com.squareup.cash.arcade.components.CopyCodeKt$$ExternalSyntheticLambda4;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.input.InputAreaKt;
import com.squareup.cash.arcade.components.input.InputFieldKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.banking.views.BenefitsLeafletViewKt$$ExternalSyntheticLambda25;
import com.squareup.cash.blockers.views.PlaidLinkView;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.borrow.views.BorrowHomeKt$$ExternalSyntheticLambda3;
import com.squareup.cash.borrow.views.BulletinTileKt$$ExternalSyntheticLambda2;
import com.squareup.cash.borrow.views.BulletinTileKt$$ExternalSyntheticLambda6;
import com.squareup.cash.borrow.views.BulletinTileKt$$ExternalSyntheticLambda9;
import com.squareup.cash.borrow.views.LoanDetailsSheetKt$$ExternalSyntheticLambda14;
import com.squareup.cash.bugreporting.viewmodels.BugReportingViewModel;
import com.squareup.cash.bugreporting.viewmodels.DeviceMetrics;
import com.squareup.cash.bugreporting.viewmodels.DiagnosticAttachments;
import com.squareup.cash.bugreporting.viewmodels.DiagnosticContext;
import com.squareup.cash.bugreporting.viewmodels.Screenshot;
import com.squareup.cash.card.onboarding.CardStudioViewV2Kt$$ExternalSyntheticLambda47;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda15;
import com.squareup.cash.checks.CheckDepositAmountKt$$ExternalSyntheticLambda1;
import com.squareup.cash.checks.CheckDepositAmountKt$$ExternalSyntheticLambda6;
import com.squareup.cash.checks.ConfirmBackOfCheckKt$$ExternalSyntheticLambda6;
import com.squareup.cash.common.composeui.TooltipShape;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.filepicker.RealFilePicker;
import com.squareup.cash.filepicker.RealFilePicker$Factory$Impl;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda38;
import com.squareup.cash.music.views.MusicViewKt$LoadedMusicContent$1$1;
import com.squareup.cash.sheet.RealSheetState;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.cash.sheet.SheetStateKt;
import com.squareup.cash.work.data.real.RealPayDataLoader$fetchData$1;
import com.squareup.util.Strings;
import com.stripe.android.uicore.elements.TextFieldUIKt$$ExternalSyntheticLambda14;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.text.StringsKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public abstract class BugReportingViewKt {

    /* renamed from: lambda$-1051350147, reason: not valid java name */
    public static final ComposableLambdaImpl f326lambda$1051350147 = new ComposableLambdaImpl(new CardStudioViewV2Kt$$ExternalSyntheticLambda47(6), false, -1051350147);

    /* renamed from: lambda$-1171520649, reason: not valid java name */
    public static final ComposableLambdaImpl f327lambda$1171520649 = new ComposableLambdaImpl(new LoanDetailsSheetKt$$ExternalSyntheticLambda14(25), false, -1171520649);

    /* renamed from: lambda$-91978602, reason: not valid java name */
    public static final ComposableLambdaImpl f332lambda$91978602 = new ComposableLambdaImpl(new LoanDetailsSheetKt$$ExternalSyntheticLambda14(26), false, -91978602);

    /* renamed from: lambda$-2051899598, reason: not valid java name */
    public static final ComposableLambdaImpl f328lambda$2051899598 = new ComposableLambdaImpl(new CardStudioViewV2Kt$$ExternalSyntheticLambda47(7), false, -2051899598);
    public static final ComposableLambdaImpl lambda$1257663270 = new ComposableLambdaImpl(new CardStudioViewV2Kt$$ExternalSyntheticLambda47(8), false, 1257663270);

    /* renamed from: lambda$-504806239, reason: not valid java name */
    public static final ComposableLambdaImpl f329lambda$504806239 = new ComposableLambdaImpl(new CardStudioViewV2Kt$$ExternalSyntheticLambda47(9), false, -504806239);
    public static final ComposableLambdaImpl lambda$1849060133 = new ComposableLambdaImpl(new LoanDetailsSheetKt$$ExternalSyntheticLambda14(27), false, 1849060133);
    public static final ComposableLambdaImpl lambda$405592220 = new ComposableLambdaImpl(new LoanDetailsSheetKt$$ExternalSyntheticLambda14(19), false, 405592220);

    /* renamed from: lambda$-552067136, reason: not valid java name */
    public static final ComposableLambdaImpl f330lambda$552067136 = new ComposableLambdaImpl(new LoanDetailsSheetKt$$ExternalSyntheticLambda14(20), false, -552067136);
    public static final ComposableLambdaImpl lambda$669289245 = new ComposableLambdaImpl(new LoanDetailsSheetKt$$ExternalSyntheticLambda14(21), false, 669289245);
    public static final ComposableLambdaImpl lambda$932986270 = new ComposableLambdaImpl(new LoanDetailsSheetKt$$ExternalSyntheticLambda14(22), false, 932986270);

    /* renamed from: lambda$-680275337, reason: not valid java name */
    public static final ComposableLambdaImpl f331lambda$680275337 = new ComposableLambdaImpl(new LoanDetailsSheetKt$$ExternalSyntheticLambda14(23), false, -680275337);
    public static final ComposableLambdaImpl lambda$1196683295 = new ComposableLambdaImpl(new LoanDetailsSheetKt$$ExternalSyntheticLambda14(24), false, 1196683295);

    public static final void AddMoreSection(RealFilePicker realFilePicker, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(222387493);
        int i2 = (gapComposer.changedInstance(realFilePicker) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer);
            }
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) rememberedValue;
            Integer valueOf = Integer.valueOf(parcelableSnapshotMutableIntState.getIntValue());
            boolean changedInstance = gapComposer.changedInstance(realFilePicker) | ((i2 & 112) == 32);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new PlaidLinkView.AnonymousClass2(realFilePicker, function1, (Continuation) null, 13);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Updater.LaunchedEffect(gapComposer, valueOf, (Function2) rememberedValue2);
            boolean changedInstance2 = gapComposer.changedInstance(realFilePicker);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new CaptureCheckFaceKt$$ExternalSyntheticLambda15(9, realFilePicker, parcelableSnapshotMutableIntState);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(f327lambda$1171520649, f332lambda$91978602, null, (Function0) rememberedValue3, false, false, null, null, null, 0L, gapComposer, 54, 4084);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CheckDepositAmountKt$$ExternalSyntheticLambda1(realFilePicker, function1, i, 10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    public static final void BugReportingContent(RealFilePicker realFilePicker, BugReportingViewModel.Ready ready, Function1 function1, Composer composer, int i) {
        BugReportingViewModel.Ready ready2;
        GapComposer gapComposer;
        Activity activity;
        ?? r1;
        int i2;
        Modifier.Companion companion;
        float f;
        GapComposer gapComposer2;
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(1661415138);
        Applier applier = gapComposer3.applier;
        int i3 = i | (gapComposer3.changedInstance(realFilePicker) ? 4 : 2) | (gapComposer3.changedInstance(ready) ? 32 : 16) | (gapComposer3.changedInstance(function1) ? 256 : 128);
        if (gapComposer3.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Resources resources = (Resources) gapComposer3.consume(AndroidCompositionLocals_androidKt.LocalResources);
            Context context = (Context) gapComposer3.consume(AndroidCompositionLocals_androidKt.LocalContext);
            boolean changed = gapComposer3.changed(resources);
            Object rememberedValue = gapComposer3.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            Object obj = rememberedValue;
            if (changed || rememberedValue == neverEqualPolicy) {
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                DeviceMetrics deviceMetrics = new DeviceMetrics(displayMetrics.widthPixels, displayMetrics.heightPixels, displayMetrics.densityDpi);
                gapComposer3.updateRememberedValue(deviceMetrics);
                obj = deviceMetrics;
            }
            DeviceMetrics deviceMetrics2 = (DeviceMetrics) obj;
            boolean changed2 = gapComposer3.changed(context);
            Object rememberedValue2 = gapComposer3.rememberedValue();
            if (changed2 || rememberedValue2 == neverEqualPolicy) {
                while (true) {
                    if (!(context instanceof Activity)) {
                        if (!(context instanceof ContextWrapper)) {
                            activity = null;
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                            context.getClass();
                        }
                    } else {
                        activity = (Activity) context;
                        break;
                    }
                }
                rememberedValue2 = activity != null ? new DiagnosticContext(activity, activity.findViewById(R.id.content)) : null;
                gapComposer3.updateRememberedValue(rememberedValue2);
            }
            DiagnosticContext diagnosticContext = (DiagnosticContext) rememberedValue2;
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion2, 1.0f);
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer3, 0);
            int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, fillMaxSize);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer3.startReusableNode();
            if (gapComposer3.inserting) {
                gapComposer3.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer3.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer3, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer3, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer3, materializeModifier, composeUiNode$Companion$SetModifier$14);
            String stringResource = Room.stringResource(gapComposer3, com.squareup.cash.R.string.bug_reporting_title);
            NavigationType navigationType = NavigationType.CLOSE;
            int i4 = i3 & 896;
            boolean z = i4 == 256;
            Object rememberedValue3 = gapComposer3.rememberedValue();
            Object obj2 = rememberedValue3;
            if (z || rememberedValue3 == neverEqualPolicy) {
                BorrowHomeKt$$ExternalSyntheticLambda3 borrowHomeKt$$ExternalSyntheticLambda3 = new BorrowHomeKt$$ExternalSyntheticLambda3(24, function1);
                gapComposer3.updateRememberedValue(borrowHomeKt$$ExternalSyntheticLambda3);
                obj2 = borrowHomeKt$$ExternalSyntheticLambda3;
            }
            DBUtil.TitleBarSub(stringResource, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) obj2, (Modifier) null, (Function3) null, gapComposer3, 48, 108);
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(new LayoutWeightElement(1.0f, true), ImageKt.rememberScrollState(gapComposer3), false, 14);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer3, 0);
            int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, verticalScroll$default);
            gapComposer3.startReusableNode();
            if (gapComposer3.inserting) {
                gapComposer3.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer3.useNode();
            }
            Updater.m576setimpl(gapComposer3, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer3, composeUiNode$Companion$SetModifier$13, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer3, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer3, null);
            ProblemSection(ready.title, ready.description, ready.isGeneratingTitle, ready.titleGenerationFailed, function1, gapComposer3, (i3 << 6) & 57344);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer3, null);
            int i5 = i3 >> 3;
            int i6 = i5 & 112;
            ScreenshotsSection(ready.screenshots, function1, gapComposer3, i6);
            AddMoreSection(realFilePicker, function1, gapComposer3, (i3 & 14) | i6);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer3, null);
            EmailSection(ready.email, gapComposer3, 0);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer3, null);
            DiagnosticAttachmentsSection(ready, function1, gapComposer3, i5 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer3, null);
            gapComposer3.end(true);
            String str = ready.submitError;
            if (str == null) {
                gapComposer3.startReplaceGroup(-1791421204);
                gapComposer3.end(false);
                f = 1.0f;
                i2 = 0;
                r1 = 1;
                companion = companion2;
                gapComposer2 = gapComposer3;
            } else {
                gapComposer3.startReplaceGroup(-1791421203);
                Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                } else {
                    gapComposer3.startReplaceGroup(-1762997739);
                    gapComposer3.end(false);
                }
                long j = colors.semantic.text.danger;
                TextStyle textStyle = ((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion2, 1.0f);
                ((DefaultSizes) gapComposer3.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                r1 = 1;
                i2 = 0;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, j, (Composer) gapComposer3, SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2), textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                GapComposer gapComposer4 = gapComposer3;
                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer4, null);
                gapComposer4.end(false);
                companion = companion2;
                f = 1.0f;
                gapComposer2 = gapComposer4;
            }
            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, f);
            ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth2, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
            ready2 = ready;
            boolean z2 = ready2.primaryButtonEnabled;
            int i7 = (gapComposer2.changedInstance(deviceMetrics2) ? 1 : 0) | (i4 == 256 ? r1 : i2) | (gapComposer2.changedInstance(diagnosticContext) ? 1 : 0);
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (i7 != 0 || rememberedValue4 == neverEqualPolicy) {
                CopyCodeKt$$ExternalSyntheticLambda4 copyCodeKt$$ExternalSyntheticLambda4 = new CopyCodeKt$$ExternalSyntheticLambda4(function1, deviceMetrics2, diagnosticContext, false, 16);
                gapComposer2.updateRememberedValue(copyCodeKt$$ExternalSyntheticLambda4);
                rememberedValue4 = copyCodeKt$$ExternalSyntheticLambda4;
            }
            GapComposer gapComposer5 = gapComposer2;
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue4, m300paddingVpY3zN4$default, buttonProminence, false, z2, null, f326lambda$1051350147, gapComposer5, 1573248, 40);
            GapComposer gapComposer6 = gapComposer5;
            DBUtil.SpacerBetweenSectionLarge(i2, r1, gapComposer6, null);
            gapComposer6.end(r1);
            gapComposer = gapComposer6;
        } else {
            ready2 = ready;
            gapComposer3.skipToGroupEnd();
            gapComposer = gapComposer3;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BulletinTileKt$$ExternalSyntheticLambda9((Object) realFilePicker, (Object) ready2, function1, i, 26);
        }
    }

    public static final void BugReportingSuccess(BugReportingViewModel.Success success, Function1 function1, Composer composer, int i) {
        Function1 function12;
        AnnotatedString annotatedString;
        NeverEqualPolicy neverEqualPolicy;
        NeverEqualPolicy neverEqualPolicy2;
        boolean z;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-5795036);
        int i2 = i | (gapComposer.changedInstance(success) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            SpanStyle spanStyle = new SpanStyle(Strings.getColors(gapComposer).semantic.text.link, 0L, FontWeight.Medium, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.Underline, (Shadow) null, 61434);
            String str = success.identifier;
            String str2 = success.message;
            String str3 = success.url;
            NeverEqualPolicy neverEqualPolicy3 = Composer.Companion.Empty;
            if (str == null || StringsKt.isBlank(str) || str3 == null || StringsKt.isBlank(str3)) {
                gapComposer.startReplaceGroup(-840087438);
                gapComposer.end(false);
                annotatedString = new AnnotatedString(str2);
            } else {
                gapComposer.startReplaceGroup(-840811660);
                String str4 = success.identifier;
                if (str4 == null) {
                    str4 = "";
                }
                int indexOf$default = StringsKt.indexOf$default((CharSequence) str2, str4, 0, false, 6);
                if (indexOf$default >= 0) {
                    gapComposer.startReplaceGroup(-840634588);
                    StringBuilder sb = new StringBuilder(16);
                    new ArrayList();
                    ArrayList arrayList = new ArrayList();
                    new ArrayList();
                    sb.append(str2);
                    int length = str4.length() + indexOf$default;
                    arrayList.add(new AnnotatedString.Builder.MutableRange(spanStyle, indexOf$default, length, 8));
                    TextLinkStyles textLinkStyles = new TextLinkStyles(spanStyle, (SpanStyle) null, (SpanStyle) null, 14);
                    boolean changed = ((i2 & 112) == 32) | gapComposer.changed(str3);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy3) {
                        rememberedValue = new ReceiptUiKt$$ExternalSyntheticLambda47(function1, str3, 1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    arrayList.add(new AnnotatedString.Builder.MutableRange(new LinkAnnotation.Url(str3, textLinkStyles, (LinkInteractionListener) rememberedValue), indexOf$default, length, 8));
                    String sb2 = sb.toString();
                    ArrayList arrayList2 = new ArrayList(arrayList.size());
                    int size = arrayList.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        arrayList2.add(((AnnotatedString.Builder.MutableRange) arrayList.get(i3)).toRange(sb.length()));
                    }
                    annotatedString = new AnnotatedString(sb2, (List) arrayList2);
                    z = false;
                    gapComposer.end(false);
                } else {
                    z = false;
                    gapComposer.startReplaceGroup(-840141068);
                    gapComposer.end(false);
                    annotatedString = new AnnotatedString(str2);
                }
                gapComposer.end(z);
            }
            AnnotatedString annotatedString2 = annotatedString;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier systemBarsPadding = SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxSize(companion, 1.0f), Strings.getColors(gapComposer).semantic.background.f1047app, ColorKt.RectangleShape));
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, systemBarsPadding);
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
            DBUtil.TitleBarSub((String) null, NavigationType.NONE, (Modifier) null, (DynamicColorConfiguration) null, (Function0) null, (Modifier) null, (Function3) null, gapComposer, 54, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
            DBUtil.SpacerBetweenSectionXLarge(0, 1, gapComposer, null);
            Trace.m1191Iconww6aTOc(Icons.CheckFill24, "Success", SizeKt.m285size3ABfNKs(companion, 128.0f), Strings.getColors(gapComposer).semantic.icon.success, gapComposer, 438, 0);
            gapComposer = gapComposer;
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            ViewfinderKt.HeroHeader(Expect_jvmKt.rememberComposableLambda(-1172421190, new BulletinTileKt$$ExternalSyntheticLambda6(success, 8), gapComposer), (Modifier) null, Expect_jvmKt.rememberComposableLambda(1774412536, new BenefitsLeafletViewKt$$ExternalSyntheticLambda25(annotatedString2, 5), gapComposer), (TextStyle) null, gapComposer, 390, 10);
            SpacerKt.Spacer(gapComposer, new LayoutWeightElement(1.0f, true));
            if (str3 == null || StringsKt.isBlank(str3)) {
                neverEqualPolicy = neverEqualPolicy3;
                gapComposer.startReplaceGroup(-471157068);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-471503028);
                ButtonProminence buttonProminence = ButtonProminence.STANDARD;
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                Strings.getSizes(gapComposer).getClass();
                DefaultSizes.spacing.getClass();
                Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                boolean z2 = (i2 & 112) == 32;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (z2) {
                    neverEqualPolicy2 = neverEqualPolicy3;
                } else {
                    neverEqualPolicy2 = neverEqualPolicy3;
                    if (rememberedValue2 != neverEqualPolicy2) {
                        neverEqualPolicy = neverEqualPolicy2;
                        coil3.size.SizeKt.Button((Function0) rememberedValue2, m300paddingVpY3zN4$default, buttonProminence, false, false, null, lambda$1257663270, gapComposer, 1573248, 56);
                        DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
                        gapComposer.end(false);
                    }
                }
                rememberedValue2 = new BorrowHomeKt$$ExternalSyntheticLambda3(26, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
                neverEqualPolicy = neverEqualPolicy2;
                coil3.size.SizeKt.Button((Function0) rememberedValue2, m300paddingVpY3zN4$default, buttonProminence, false, false, null, lambda$1257663270, gapComposer, 1573248, 56);
                DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
                gapComposer.end(false);
            }
            ButtonProminence buttonProminence2 = ButtonProminence.PROMINENT;
            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default2 = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth2, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            boolean z3 = (i2 & 112) == 32;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (z3 || rememberedValue3 == neverEqualPolicy) {
                function12 = function1;
                rememberedValue3 = new BorrowHomeKt$$ExternalSyntheticLambda3(27, function12);
                gapComposer.updateRememberedValue(rememberedValue3);
            } else {
                function12 = function1;
            }
            coil3.size.SizeKt.Button((Function0) rememberedValue3, m300paddingVpY3zN4$default2, buttonProminence2, false, false, null, f329lambda$504806239, gapComposer, 1573248, 56);
            gapComposer.end(true);
        } else {
            function12 = function1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BulletinTileKt$$ExternalSyntheticLambda2(success, function12, i, 13);
        }
    }

    public static final void BugReportingView(RealFilePicker$Factory$Impl realFilePicker$Factory$Impl, BugReportingViewModel bugReportingViewModel, Function1 function1, Composer composer, int i) {
        bugReportingViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1520422157);
        int i2 = (gapComposer.changedInstance(realFilePicker$Factory$Impl) ? 4 : 2) | i | (gapComposer.changedInstance(bugReportingViewModel) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                ComponentActivity componentActivity = (ComponentActivity) realFilePicker$Factory$Impl.delegateFactory.activity.value;
                componentActivity.getClass();
                RealFilePicker realFilePicker = new RealFilePicker(componentActivity, "bug_reporting_view");
                gapComposer.updateRememberedValue(realFilePicker);
                rememberedValue = realFilePicker;
            }
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(507140952, new BulletinTileKt$$ExternalSyntheticLambda9(bugReportingViewModel, (RealFilePicker) rememberedValue, function1, 24), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BulletinTileKt$$ExternalSyntheticLambda9((Object) realFilePicker$Factory$Impl, (Object) bugReportingViewModel, function1, i, 25);
        }
    }

    public static final void DiagnosticAttachmentsContent(BugReportingViewModel.Ready ready, Function1 function1, Composer composer, int i) {
        Function1 function12;
        NeverEqualPolicy neverEqualPolicy;
        boolean z;
        NeverEqualPolicy neverEqualPolicy2;
        boolean z2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1969928159);
        int i2 = i | (gapComposer.changedInstance(ready) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, Modifier.Companion.$$INSTANCE);
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
            DiagnosticAttachments diagnosticAttachments = ready.diagnosticAttachments;
            CellDefaultAccessory.Checkbox checkbox = new CellDefaultAccessory.Checkbox(diagnosticAttachments.includeViewHierarchy);
            int i3 = i2 & 112;
            boolean z3 = i3 == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy3 = Composer.Companion.Empty;
            if (z3 || rememberedValue == neverEqualPolicy3) {
                rememberedValue = new BorrowHomeKt$$ExternalSyntheticLambda3(17, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(lambda$1849060133, null, (Function0) rememberedValue, false, false, null, null, 0L, checkbox, null, gapComposer, 6, 1530);
            CellDefaultAccessory.Checkbox checkbox2 = new CellDefaultAccessory.Checkbox(diagnosticAttachments.includeBackStack);
            boolean z4 = i3 == 32;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z4 || rememberedValue2 == neverEqualPolicy3) {
                rememberedValue2 = new BorrowHomeKt$$ExternalSyntheticLambda3(18, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(lambda$405592220, null, (Function0) rememberedValue2, false, false, null, null, 0L, checkbox2, null, gapComposer, 6, 1530);
            if (diagnosticAttachments.logsAvailable) {
                gapComposer.startReplaceGroup(1231843685);
                CellDefaultAccessory.Checkbox checkbox3 = new CellDefaultAccessory.Checkbox(diagnosticAttachments.includeLogs);
                boolean z5 = i3 == 32;
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (z5 || rememberedValue3 == neverEqualPolicy3) {
                    rememberedValue3 = new BorrowHomeKt$$ExternalSyntheticLambda3(19, function1);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                neverEqualPolicy = neverEqualPolicy3;
                CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(f330lambda$552067136, null, (Function0) rememberedValue3, false, false, null, null, 0L, checkbox3, null, gapComposer, 6, 1530);
                z = false;
                gapComposer.end(false);
            } else {
                neverEqualPolicy = neverEqualPolicy3;
                z = false;
                gapComposer.startReplaceGroup(1232162923);
                gapComposer.end(false);
            }
            CellDefaultAccessory.Checkbox checkbox4 = new CellDefaultAccessory.Checkbox(diagnosticAttachments.includeDatabase);
            boolean z6 = i3 == 32 ? true : z;
            Object rememberedValue4 = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy4 = neverEqualPolicy;
            if (z6 || rememberedValue4 == neverEqualPolicy4) {
                rememberedValue4 = new BorrowHomeKt$$ExternalSyntheticLambda3(20, function1);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(lambda$669289245, null, (Function0) rememberedValue4, false, false, null, null, 0L, checkbox4, null, gapComposer, 6, 1530);
            CellDefaultAccessory.Checkbox checkbox5 = new CellDefaultAccessory.Checkbox(diagnosticAttachments.includePreferences);
            boolean z7 = i3 == 32;
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (z7 || rememberedValue5 == neverEqualPolicy4) {
                rememberedValue5 = new BorrowHomeKt$$ExternalSyntheticLambda3(21, function1);
                gapComposer.updateRememberedValue(rememberedValue5);
            }
            CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(lambda$932986270, null, (Function0) rememberedValue5, false, false, null, null, 0L, checkbox5, null, gapComposer, 6, 1530);
            if (diagnosticAttachments.debugPreferencesAvailable) {
                gapComposer.startReplaceGroup(1232915262);
                CellDefaultAccessory.Checkbox checkbox6 = new CellDefaultAccessory.Checkbox(diagnosticAttachments.includeDebugPreferences);
                boolean z8 = i3 == 32;
                Object rememberedValue6 = gapComposer.rememberedValue();
                if (z8 || rememberedValue6 == neverEqualPolicy4) {
                    rememberedValue6 = new BorrowHomeKt$$ExternalSyntheticLambda3(22, function1);
                    gapComposer.updateRememberedValue(rememberedValue6);
                }
                neverEqualPolicy2 = neverEqualPolicy4;
                CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(f331lambda$680275337, null, (Function0) rememberedValue6, false, false, null, null, 0L, checkbox6, null, gapComposer, 6, 1530);
                z2 = false;
                gapComposer.end(false);
            } else {
                neverEqualPolicy2 = neverEqualPolicy4;
                z2 = false;
                gapComposer.startReplaceGroup(1233302731);
                gapComposer.end(false);
            }
            CellDefaultAccessory.Checkbox checkbox7 = new CellDefaultAccessory.Checkbox(diagnosticAttachments.includeSamEligibility);
            boolean z9 = i3 == 32 ? true : z2;
            Object rememberedValue7 = gapComposer.rememberedValue();
            if (z9 || rememberedValue7 == neverEqualPolicy2) {
                function12 = function1;
                rememberedValue7 = new BorrowHomeKt$$ExternalSyntheticLambda3(23, function12);
                gapComposer.updateRememberedValue(rememberedValue7);
            } else {
                function12 = function1;
            }
            CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(lambda$1196683295, null, (Function0) rememberedValue7, false, false, null, null, 0L, checkbox7, null, gapComposer, 6, 1530);
            gapComposer.end(true);
        } else {
            function12 = function1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BulletinTileKt$$ExternalSyntheticLambda2(ready, function12, i, 14);
        }
    }

    public static final void DiagnosticAttachmentsRow(BugReportingViewModel.Ready ready, Function1 function1, Composer composer, int i) {
        int i2;
        Function1 function12;
        int i3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1341211424);
        if ((i & 6) == 0) {
            i2 = i | (gapComposer.changedInstance(ready) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            int i4 = i2 & 112;
            boolean z = i4 == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new BorrowHomeKt$$ExternalSyntheticLambda3(25, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(fillMaxWidth, false, null, null, (Function0) rememberedValue, 15);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Strings.getSizes(gapComposer).getClass();
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(m183clickableoSLSa3U$default, 16.0f, 8.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m299paddingVpY3zN4);
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
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Trace.m1191Iconww6aTOc(Icons.ExpandCentered24, "Open diagnostic attachments", SizeKt.m285size3ABfNKs(companion, 24.0f), Strings.getColors(gapComposer).semantic.icon.standard, gapComposer, 438, 0);
            SpacerKt.Spacer(gapComposer, SizeKt.m285size3ABfNKs(companion, 8.0f));
            i3 = 1;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).labelMedium, (TextLineBalancing) null, Room.stringResource(gapComposer, com.squareup.cash.R.string.bug_reporting_diagnostic_attachments_title), (Map) null, (Function1) null, false);
            gapComposer = gapComposer;
            SpacerKt.Spacer(gapComposer, new LayoutWeightElement(1.0f, true));
            boolean z2 = ready.diagnosticAttachments.includeAll;
            boolean z3 = i4 == 32;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z3 || rememberedValue2 == neverEqualPolicy) {
                function12 = function1;
                rememberedValue2 = new SsnViewKt$$ExternalSyntheticLambda1(13, function12);
                gapComposer.updateRememberedValue(rememberedValue2);
            } else {
                function12 = function1;
            }
            CheckboxKt.UnlabeledCheckbox(z2, (Function1) rememberedValue2, SpacerKt.m302paddingqDBjuR0$default(companion, 8.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), null, false, gapComposer, MLKEMEngine.KyberPolyBytes, 24);
            gapComposer.end(true);
        } else {
            function12 = function1;
            i3 = 1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BugReportingViewKt$$ExternalSyntheticLambda13(ready, function12, i, i3);
        }
    }

    public static final void DiagnosticAttachmentsSection(BugReportingViewModel.Ready ready, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(300377141);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(ready) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            RealSheetState rememberSheetState = SheetStateKt.rememberSheetState(null, gapComposer, 0, 1);
            Boolean valueOf = Boolean.valueOf(ready.diagnosticAttachmentsExpanded);
            boolean changedInstance = gapComposer.changedInstance(ready) | gapComposer.changed(rememberSheetState);
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == obj) {
                rememberedValue = new PlaidLinkView.AnonymousClass2(ready, rememberSheetState, (Continuation) null, 14);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer, valueOf, (Function2) rememberedValue);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, Modifier.Companion.$$INSTANCE);
            ComposeUiNode.Companion.getClass();
            Function0 function0 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(function0);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            int i3 = i2 & 112;
            DiagnosticAttachmentsRow(ready, function1, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
            if (ready.diagnosticAttachmentsExpanded) {
                gapComposer.startReplaceGroup(-1248576272);
                boolean z = i3 == 32;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (z || rememberedValue2 == obj) {
                    rememberedValue2 = new BorrowHomeKt$$ExternalSyntheticLambda3(16, function1);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                SheetKt.Sheet((Function0) rememberedValue2, null, rememberSheetState, null, null, false, null, Expect_jvmKt.rememberComposableLambda(-185533937, new CheckDepositAmountKt$$ExternalSyntheticLambda6(6, (Object) ready, (Object) function1), gapComposer), gapComposer, 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1247831497);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BugReportingViewKt$$ExternalSyntheticLambda13(ready, function1, i, 0);
        }
    }

    public static final void EmailSection(String str, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1332985093);
        int i2 = i | (gapComposer.changed(str) ? 4 : 2);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
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
            String stringResource = Room.stringResource(gapComposer, com.squareup.cash.R.string.bug_reporting_email_title);
            TextStyle textStyle = Strings.getTypography(gapComposer).labelMedium;
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4088, 0L, (Composer) gapComposer, SpacerKt.m298padding3ABfNKs(companion, 16.0f), textStyle, (TextLineBalancing) null, stringResource, (Map) null, (Function1) null, false);
            Strings.getSizes(gapComposer).getClass();
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(companion, 16.0f);
            TextStyle textStyle2 = Strings.getTypography(gapComposer).bodyMedium;
            long j = Strings.getColors(gapComposer).semantic.text.subtle;
            gapComposer = gapComposer;
            Room.m1165Text25TpFw(0, 0, 0, 0, i2 & 14, 0, 4080, j, (Composer) gapComposer, m298padding3ABfNKs, textStyle2, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ConfirmBackOfCheckKt$$ExternalSyntheticLambda6(str, i, 16);
        }
    }

    public static final void ProblemSection(String str, String str2, boolean z, boolean z2, Function1 function1, Composer composer, int i) {
        int i2;
        boolean z3;
        Arrangement$End$1 arrangement$End$1 = SpacerKt.Start;
        BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
        BiasAlignment biasAlignment = Alignment.Companion.CenterEnd;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2081000662);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(str2) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            int i3 = i2;
            TextFieldState m382rememberTextFieldStateLepunE = TextFieldStateKt.m382rememberTextFieldStateLepunE(str, 0L, gapComposer, 0, 2);
            TextFieldState m382rememberTextFieldStateLepunE2 = TextFieldStateKt.m382rememberTextFieldStateLepunE(str2, 0L, gapComposer, (i3 >> 3) & 14, 2);
            boolean changed = ((i3 & 14) == 4) | gapComposer.changed(m382rememberTextFieldStateLepunE);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = new BugReportingViewKt$ProblemSection$1$1(str, m382rememberTextFieldStateLepunE, (Continuation) null);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer, str, (Function2) rememberedValue);
            CharSequence charSequence = m382rememberTextFieldStateLepunE.getValue$foundation().text;
            int i4 = i3 & 57344;
            boolean changed2 = (i4 == 16384) | gapComposer.changed(m382rememberTextFieldStateLepunE);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new MusicViewKt$LoadedMusicContent$1$1(function1, m382rememberTextFieldStateLepunE, (Continuation) null, 4);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Updater.LaunchedEffect(gapComposer, charSequence, (Function2) rememberedValue2);
            CharSequence charSequence2 = m382rememberTextFieldStateLepunE2.getValue$foundation().text;
            boolean changed3 = (i4 == 16384) | gapComposer.changed(m382rememberTextFieldStateLepunE2);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changed3 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new MusicViewKt$LoadedMusicContent$1$1(function1, m382rememberTextFieldStateLepunE2, (Continuation) null, 5);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Updater.LaunchedEffect(gapComposer, charSequence2, (Function2) rememberedValue3);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
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
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            InputAreaKt.InputArea(m382rememberTextFieldStateLepunE2, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), false, false, false, null, null, Room.stringResource(gapComposer, com.squareup.cash.R.string.bug_reporting_problem_description_placeholder), null, null, new TextFieldLineLimits.MultiLine(4, 2, 0), null, null, null, null, gapComposer, 0, 6, 31612);
            DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, companion);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            Strings.getSizes(gapComposer).getClass();
            InputFieldKt.InputField(m382rememberTextFieldStateLepunE, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), false, false, false, null, null, null, null, Room.stringResource(gapComposer, com.squareup.cash.R.string.bug_reporting_problem_title_placeholder), null, null, null, null, null, null, gapComposer, 0, 0, 65020);
            gapComposer = gapComposer;
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (z) {
                gapComposer.startReplaceGroup(2088552553);
                Modifier align = boxScopeInstance.align(companion, biasAlignment);
                Strings.getSizes(gapComposer).getClass();
                Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(align, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 28.0f, RecyclerView.DECELERATION_RATE, 11);
                RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$End$1, vertical, gapComposer, 48);
                int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                ProgressCircularKt.ProgressCircular(6, 0, gapComposer, SizeKt.m285size3ABfNKs(companion, 16.0f));
                SpacerKt.Spacer(gapComposer, SizeKt.m285size3ABfNKs(companion, 4.0f));
                Room.m1165Text25TpFw(0, 0, 0, 0, 6, 0, 4082, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodySmall, (TextLineBalancing) null, "Generating...", (Map) null, (Function1) null, false);
                gapComposer.end(true);
                gapComposer.end(false);
                z3 = true;
            } else if (z2) {
                gapComposer.startReplaceGroup(2089117249);
                Modifier align2 = boxScopeInstance.align(companion, biasAlignment);
                Strings.getSizes(gapComposer).getClass();
                Modifier m302paddingqDBjuR0$default2 = SpacerKt.m302paddingqDBjuR0$default(align2, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 28.0f, RecyclerView.DECELERATION_RATE, 11);
                RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement$End$1, vertical, gapComposer, 48);
                int hashCode4 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default2);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, rowMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode4, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer, materializeModifier4, composeUiNode$Companion$SetModifier$14);
                Trace.m1191Iconww6aTOc(Icons.AlertFill24, "Error", SizeKt.m285size3ABfNKs(companion, 16.0f), Strings.getColors(gapComposer).semantic.icon.danger, gapComposer, 438, 0);
                SpacerKt.Spacer(gapComposer, SizeKt.m285size3ABfNKs(companion, 4.0f));
                Room.m1165Text25TpFw(0, 0, 0, 0, 6, 0, 4082, Strings.getColors(gapComposer).semantic.text.danger, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodySmall, (TextLineBalancing) null, "Title couldn't be generated", (Map) null, (Function1) null, false);
                z3 = true;
                gapComposer.end(true);
                gapComposer.end(false);
            } else {
                z3 = true;
                gapComposer.startReplaceGroup(2089788988);
                gapComposer.end(false);
            }
            gapComposer.end(z3);
            gapComposer.end(z3);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new EducationalSheetKt$$ExternalSyntheticLambda10(str, str2, z, z2, function1, i);
        }
    }

    public static final void ScreenshotRow(final Screenshot screenshot, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-596966670);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(screenshot) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        final int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            CellDefaultAccessory.ButtonCompact buttonCompact = new CellDefaultAccessory.ButtonCompact(null, null, false, f328lambda$2051899598, 15);
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(189352544, new Function2() { // from class: com.squareup.cash.bugreporting.views.BugReportingViewKt$$ExternalSyntheticLambda27
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i4 = r2;
                    Screenshot screenshot2 = screenshot;
                    switch (i4) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                BugReportingViewKt.Thumbnail(screenshot2.uri, screenshot2.isVideo, gapComposer2, 0);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                String str = screenshot2.fileName;
                                if (str == null) {
                                    str = "";
                                }
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer);
            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(224176481, new Function2() { // from class: com.squareup.cash.bugreporting.views.BugReportingViewKt$$ExternalSyntheticLambda27
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i4 = i3;
                    Screenshot screenshot2 = screenshot;
                    switch (i4) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                BugReportingViewKt.Thumbnail(screenshot2.uri, screenshot2.isVideo, gapComposer2, 0);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                String str = screenshot2.fileName;
                                if (str == null) {
                                    str = "";
                                }
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer);
            int i4 = (gapComposer.changedInstance(screenshot) ? 1 : 0) | ((i2 & 112) == 32 ? 1 : 0);
            Object rememberedValue = gapComposer.rememberedValue();
            if (i4 != 0 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new CaptureCheckFaceKt$$ExternalSyntheticLambda15(10, (Object) screenshot, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(rememberComposableLambda, rememberComposableLambda2, null, (Function0) rememberedValue, false, true, null, null, buttonCompact, 0L, gapComposer, 1572918, 3508);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CheckDepositAmountKt$$ExternalSyntheticLambda1(screenshot, function1, i, 11);
        }
    }

    public static final void ScreenshotsSection(List list, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1536582630);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
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
            String stringResource = Room.stringResource(gapComposer, com.squareup.cash.R.string.bug_reporting_screenshots_videos_title);
            TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4088, 0L, (Composer) gapComposer, SpacerKt.m298padding3ABfNKs(companion, 16.0f), textStyle, (TextLineBalancing) null, stringResource, (Map) null, (Function1) null, false);
            gapComposer.startReplaceGroup(36255264);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ScreenshotRow((Screenshot) it.next(), function1, gapComposer, i3 & 112);
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TabContentViewKt$$ExternalSyntheticLambda16(list, function1, i, 4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v9 */
    public static final void Thumbnail(String str, boolean z, Composer composer, int i) {
        Object realPayDataLoader$fetchData$1;
        MutableState mutableState;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        Object obj;
        boolean z2;
        ?? r7;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(545062544);
        Applier applier = gapComposer.applier;
        int i2 = (gapComposer.changed(str) ? 4 : 2) | i | (gapComposer.changed(z) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext);
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj2 = Composer.Companion.Empty;
            if (rememberedValue == obj2) {
                rememberedValue = Updater.mutableStateOf$default(null);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState2 = (MutableState) rememberedValue;
            Boolean valueOf = Boolean.valueOf(z);
            boolean changedInstance = ((i2 & 14) == 4) | ((i2 & 112) == 32) | gapComposer.changedInstance(context);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == obj2) {
                mutableState = mutableState2;
                realPayDataLoader$fetchData$1 = new RealPayDataLoader$fetchData$1(z, str, context, mutableState, (Continuation) null);
                gapComposer.updateRememberedValue(realPayDataLoader$fetchData$1);
            } else {
                realPayDataLoader$fetchData$1 = rememberedValue2;
                mutableState = mutableState2;
            }
            Updater.LaunchedEffect(str, valueOf, (Function2) realPayDataLoader$fetchData$1, gapComposer);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier clip = ClipKt.clip(SizeKt.m289sizeInqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 48.0f, 64.0f, 3), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(8.0f));
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, clip);
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
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$12);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$13);
            Integer valueOf2 = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf2, composeUiNode$Companion$SetModifier$14);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$15);
            if (!z || ((Bitmap) mutableState.getValue()) == null) {
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$12;
                obj = str;
            } else {
                obj = (Bitmap) mutableState.getValue();
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$12;
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = composeUiNode$Companion$SetModifier$1;
            AsyncImageKt.m1443SubcomposeAsyncImageQgsmV_s(obj, z ? "Video thumbnail" : "Image thumbnail", (RealImageLoader) gapComposer.consume(LocalImageLoaderKt.LocalImageLoader), SizeKt.fillMaxSize(companion, 1.0f), null, null, Expect_jvmKt.rememberComposableLambda(1409623096, new MoneyTabUIKt$$ExternalSyntheticLambda38(z, 4), gapComposer), gapComposer, 3072, 4080);
            if (z) {
                gapComposer.startReplaceGroup(-1092579342);
                Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    r7 = 0;
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    r7 = 0;
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxSize, Color.m675copywmQWz5c$default(0.4f, colors.semantic.background.standard, 14), ColorKt.RectangleShape);
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, r7);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$16);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$13);
                Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$14, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$15);
                TriangleShape(gapComposer, r7);
                z2 = true;
                gapComposer.end(true);
                gapComposer.end(r7);
            } else {
                z2 = true;
                gapComposer.startReplaceGroup(-1092339092);
                gapComposer.end(false);
            }
            gapComposer.end(z2);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TextFieldUIKt$$ExternalSyntheticLambda14(str, z, i);
        }
    }

    public static final void TriangleShape(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1401463094);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, 24.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            BoxKt.Box(ImageKt.m177backgroundbw27NRU(m285size3ABfNKs, colors.semantic.icon.inverse, new TooltipShape(1)), gapComposer, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LoanDetailsSheetKt$$ExternalSyntheticLambda14(i, 18);
        }
    }
}
