package com.squareup.cash.sharesheet;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.impl.Transformations;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.pdf.view.ComposableSingletons$PdfPreviewViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda0;
import com.squareup.cash.sharesheet.ShareSheetViewModel;
import com.squareup.cash.sharesheet.ShareTarget;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda1;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda6;
import com.squareup.cash.tax.views.TaxAuthorizationView$Content$1$1;
import com.squareup.util.cash.Countries;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes7.dex */
public abstract class ShareSheetViewKt {

    /* renamed from: lambda$-1501910899, reason: not valid java name */
    public static final ComposableLambdaImpl f657lambda$1501910899 = new ComposableLambdaImpl(new ComposableSingletons$PdfPreviewViewKt$$ExternalSyntheticLambda1(26), false, -1501910899);

    public static final void Render(ShareIcon shareIcon, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-243137203);
        int i2 = (gapComposer.changed(shareIcon.ordinal()) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            int ordinal = shareIcon.ordinal();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (ordinal == 0) {
                gapComposer.startReplaceGroup(-1985476294);
                Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(SizeKt.m285size3ABfNKs(companion, 24.0f), 2.0f);
                Painter painterResource = Countries.painterResource(R.drawable.social_x, 0, gapComposer);
                String stringResource = Room.stringResource(gapComposer, R.string.social_x);
                long j = ((Color) gapComposer.consume(ArcadeThemeKt.LocalIconColor)).value;
                ImageKt.Image(painterResource, stringResource, m298padding3ABfNKs, null, null, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer, Painter.$stable | MLKEMEngine.KyberPolyBytes, 56);
                gapComposer = gapComposer;
                gapComposer.end(false);
            } else if (ordinal == 1) {
                gapComposer.startReplaceGroup(-1985158358);
                Modifier m298padding3ABfNKs2 = SpacerKt.m298padding3ABfNKs(SizeKt.m285size3ABfNKs(companion, 24.0f), 2.0f);
                Painter painterResource2 = Countries.painterResource(R.drawable.social_instagram, 0, gapComposer);
                String stringResource2 = Room.stringResource(gapComposer, R.string.social_instagram);
                long j2 = ((Color) gapComposer.consume(ArcadeThemeKt.LocalIconColor)).value;
                ImageKt.Image(painterResource2, stringResource2, m298padding3ABfNKs2, null, null, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j2, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j2), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer, Painter.$stable | MLKEMEngine.KyberPolyBytes, 56);
                gapComposer = gapComposer;
                gapComposer.end(false);
            } else if (ordinal == 2) {
                gapComposer.startReplaceGroup(-1984846932);
                Trace.m1191Iconww6aTOc(Icons.CommSms24, (String) null, (Modifier) null, 0L, gapComposer, 54, 12);
                gapComposer.end(false);
            } else if (ordinal == 3) {
                gapComposer.startReplaceGroup(-1984775601);
                Trace.m1191Iconww6aTOc(Icons.Copy24, (String) null, (Modifier) null, 0L, gapComposer, 54, 12);
                gapComposer.end(false);
            } else if (ordinal == 4) {
                gapComposer.startReplaceGroup(-1984710005);
                Trace.m1191Iconww6aTOc(Icons.Download24, (String) null, (Modifier) null, 0L, gapComposer, 54, 12);
                gapComposer.end(false);
            } else {
                if (ordinal != 5) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1726616117, false);
                }
                gapComposer.startReplaceGroup(-1984650361);
                Trace.m1191Iconww6aTOc(Icons.NavigationMore, (String) null, (Modifier) null, 0L, gapComposer, 54, 12);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SheetKt$$ExternalSyntheticLambda6(shareIcon, i, 11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v1, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.GapComposer] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6, types: [com.squareup.cash.sharesheet.ShareSheetViewKt$$ExternalSyntheticLambda5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7 */
    public static final void ShareSheet(ShareSheetViewModel shareSheetViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        ?? r15 = (GapComposer) composer;
        r15.startRestartGroup(-1757221201);
        int i2 = 32;
        int i3 = i | (r15.changedInstance(shareSheetViewModel) ? 4 : 2) | (r15.changedInstance(function1) ? 32 : 16) | (r15.changed(modifier) ? 256 : 128);
        final int i4 = 0;
        final int i5 = 1;
        if (r15.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, r15, 0);
            int hashCode = Long.hashCode(r15.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = r15.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(r15, modifier);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (r15.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            r15.startReusableNode();
            if (r15.inserting) {
                r15.createNode(layoutNode$Companion$Constructor$1);
            } else {
                r15.useNode();
            }
            Updater.m576setimpl(r15, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(r15, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(r15, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(r15, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(r15, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Transformations.SheetHeader(shareSheetViewModel.headerText, (Modifier) null, (Function2) null, (String) null, (Composer) r15, 0, 14);
            DBUtil.SpacerWithinSectionMedium(0, 1, r15, null);
            r15.startReplaceGroup(2088782485);
            for (final ShareSheetViewModel.SharingOption sharingOption : shareSheetViewModel.sharingOptions) {
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(897961521, new Function2() { // from class: com.squareup.cash.sharesheet.ShareSheetViewKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i6 = i4;
                        ShareSheetViewModel.SharingOption sharingOption2 = sharingOption;
                        switch (i6) {
                            case 0:
                                Composer composer2 = (Composer) obj;
                                int intValue = ((Integer) obj2).intValue();
                                GapComposer gapComposer = (GapComposer) composer2;
                                if (gapComposer.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                    ShareSheetViewKt.Render(sharingOption2.icon, gapComposer, 0);
                                } else {
                                    gapComposer.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            default:
                                Composer composer3 = (Composer) obj;
                                int intValue2 = ((Integer) obj2).intValue();
                                GapComposer gapComposer2 = (GapComposer) composer3;
                                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.SpaceBetween, Alignment.Companion.CenterVertically, gapComposer2, 54);
                                    int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
                                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth);
                                    ComposeUiNode.Companion.getClass();
                                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                                    if (gapComposer2.applier == null) {
                                        Updater.invalidApplier();
                                        throw null;
                                    }
                                    gapComposer2.startReusableNode();
                                    if (gapComposer2.inserting) {
                                        gapComposer2.createNode(layoutNode$Companion$Constructor$12);
                                    } else {
                                        gapComposer2.useNode();
                                    }
                                    Updater.m576setimpl(gapComposer2, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                    Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                                    Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                    Updater.m576setimpl(gapComposer2, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, sharingOption2.title, (Map) null, (Function1) null, false);
                                    if (sharingOption2.loading) {
                                        gapComposer2.startReplaceGroup(-1296076633);
                                        ProgressCircularKt.ProgressCircular(6, 0, gapComposer2, SizeKt.m285size3ABfNKs(companion, 24.0f));
                                        gapComposer2.end(false);
                                    } else {
                                        gapComposer2.startReplaceGroup(-1296000714);
                                        gapComposer2.end(false);
                                    }
                                    gapComposer2.end(true);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                        }
                    }
                }, r15);
                ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-1599555312, new Function2() { // from class: com.squareup.cash.sharesheet.ShareSheetViewKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i6 = i5;
                        ShareSheetViewModel.SharingOption sharingOption2 = sharingOption;
                        switch (i6) {
                            case 0:
                                Composer composer2 = (Composer) obj;
                                int intValue = ((Integer) obj2).intValue();
                                GapComposer gapComposer = (GapComposer) composer2;
                                if (gapComposer.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                    ShareSheetViewKt.Render(sharingOption2.icon, gapComposer, 0);
                                } else {
                                    gapComposer.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            default:
                                Composer composer3 = (Composer) obj;
                                int intValue2 = ((Integer) obj2).intValue();
                                GapComposer gapComposer2 = (GapComposer) composer3;
                                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.SpaceBetween, Alignment.Companion.CenterVertically, gapComposer2, 54);
                                    int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
                                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth);
                                    ComposeUiNode.Companion.getClass();
                                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                                    if (gapComposer2.applier == null) {
                                        Updater.invalidApplier();
                                        throw null;
                                    }
                                    gapComposer2.startReusableNode();
                                    if (gapComposer2.inserting) {
                                        gapComposer2.createNode(layoutNode$Companion$Constructor$12);
                                    } else {
                                        gapComposer2.useNode();
                                    }
                                    Updater.m576setimpl(gapComposer2, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                    Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                                    Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                    Updater.m576setimpl(gapComposer2, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, sharingOption2.title, (Map) null, (Function1) null, false);
                                    if (sharingOption2.loading) {
                                        gapComposer2.startReplaceGroup(-1296076633);
                                        ProgressCircularKt.ProgressCircular(6, 0, gapComposer2, SizeKt.m285size3ABfNKs(companion, 24.0f));
                                        gapComposer2.end(false);
                                    } else {
                                        gapComposer2.startReplaceGroup(-1296000714);
                                        gapComposer2.end(false);
                                    }
                                    gapComposer2.end(true);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                        }
                    }
                }, r15);
                int i6 = ((i3 & 112) == i2 ? i5 : i4) | (r15.changedInstance(sharingOption) ? 1 : 0);
                Function0 rememberedValue = r15.rememberedValue();
                if (i6 != 0 || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new ShareSheetViewKt$$ExternalSyntheticLambda5(i4, function1, sharingOption);
                    r15.updateRememberedValue(rememberedValue);
                }
                CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(rememberComposableLambda, rememberComposableLambda2, null, rememberedValue, false, true, null, null, null, 0L, r15, 1572918, 4020);
                i4 = i4;
                i2 = i2;
                i5 = 1;
                i3 = i3;
            }
            r15.end(i4);
            r15.end(true);
        } else {
            r15.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = r15.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BasicShieetScope$$ExternalSyntheticLambda1(shareSheetViewModel, function1, modifier, i, 9);
        }
    }

    public static final void ShareSheetView(ShareSheetViewModel shareSheetViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-317878273);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(shareSheetViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = 0;
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (shareSheetViewModel == null) {
                a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                return;
            }
            Context context = (Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext);
            String str = shareSheetViewModel.failedToShareMessage;
            Object obj = Composer.Companion.Empty;
            if (str == null) {
                gapComposer.startReplaceGroup(491440165);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(491440166);
                Unit unit = Unit.INSTANCE;
                boolean changedInstance = gapComposer.changedInstance(context) | gapComposer.changed(str);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == obj) {
                    rememberedValue = new ShareSheetViewKt$ShareSheetView$1$1$1(context, str, null, 0);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
                gapComposer.end(false);
            }
            String str2 = shareSheetViewModel.sharingSucceededMessage;
            if (str2 == null) {
                gapComposer.startReplaceGroup(491567141);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(491567142);
                Unit unit2 = Unit.INSTANCE;
                boolean changedInstance2 = gapComposer.changedInstance(context) | gapComposer.changed(str2);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changedInstance2 || rememberedValue2 == obj) {
                    rememberedValue2 = new ShareSheetViewKt$ShareSheetView$1$1$1(context, str2, null, 2);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                Updater.LaunchedEffect(gapComposer, unit2, (Function2) rememberedValue2);
                gapComposer.end(false);
            }
            if (shareSheetViewModel.sharingSucceeded) {
                gapComposer.startReplaceGroup(491689995);
                Unit unit3 = Unit.INSTANCE;
                boolean z = (i2 & 112) == 32;
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (z || rememberedValue3 == obj) {
                    rememberedValue3 = new TaxAuthorizationView$Content$1$1(function1, (Continuation) null, 11);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                Updater.LaunchedEffect(gapComposer, unit3, (Function2) rememberedValue3);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(491743811);
                gapComposer.end(false);
            }
            boolean z2 = (i2 & 112) == 32;
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (z2 || rememberedValue4 == obj) {
                rememberedValue4 = new ScoreHomeKt$$ExternalSyntheticLambda0(10, function1);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            SheetKt.Sheet((Function0) rememberedValue4, null, null, null, null, false, null, Expect_jvmKt.rememberComposableLambda(849658312, new ShareSheetViewKt$$ExternalSyntheticLambda1(i3, (Object) shareSheetViewModel, (Object) function1), gapComposer), gapComposer, 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ShareSheetViewKt$$ExternalSyntheticLambda2(shareSheetViewModel, function1, i, i3);
        }
    }

    public static final ShareIcon toIcon(ShareTarget.Id id) {
        id.getClass();
        int ordinal = id.ordinal();
        if (ordinal == 0) {
            return ShareIcon.X_ICON;
        }
        if (ordinal == 1) {
            return ShareIcon.INSTAGRAM_ICON;
        }
        if (ordinal == 2) {
            return ShareIcon.SMS_ICON;
        }
        if (ordinal == 3) {
            return ShareIcon.COPY_TO_CLIPBOARD_ICON;
        }
        if (ordinal == 4) {
            return ShareIcon.SAVE_TO_PHOTOS_ICON;
        }
        if (ordinal == 5) {
            return ShareIcon.MORE_ICON;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }
}
