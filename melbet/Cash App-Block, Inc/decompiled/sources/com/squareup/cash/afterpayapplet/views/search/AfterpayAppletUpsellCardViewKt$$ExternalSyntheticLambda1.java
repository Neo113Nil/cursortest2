package com.squareup.cash.afterpayapplet.views.search;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxWithConstraintsScopeImpl;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.AsyncImageKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletUpsellCardViewModel;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.moneybot.analytics.AnalyticsMappersKt;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes5.dex */
public final /* synthetic */ class AfterpayAppletUpsellCardViewKt$$ExternalSyntheticLambda1 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AfterpayAppletUpsellCardViewModel.TrailingContent f$0;
    public final /* synthetic */ AfterpayAppletUpsellCardViewModel f$1;
    public final /* synthetic */ Function0 f$2;

    public /* synthetic */ AfterpayAppletUpsellCardViewKt$$ExternalSyntheticLambda1(AfterpayAppletUpsellCardViewModel.TrailingContent trailingContent, AfterpayAppletUpsellCardViewModel afterpayAppletUpsellCardViewModel, Function0 function0, int i) {
        this.$r8$classId = i;
        this.f$0 = trailingContent;
        this.f$1 = afterpayAppletUpsellCardViewModel;
        this.f$2 = function0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v25 */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Modifier modifier;
        ?? r10;
        GapComposer gapComposer;
        boolean z;
        boolean z2;
        int i = this.$r8$classId;
        Function0 function0 = this.f$2;
        AfterpayAppletUpsellCardViewModel afterpayAppletUpsellCardViewModel = this.f$1;
        final AfterpayAppletUpsellCardViewModel.TrailingContent trailingContent = this.f$0;
        switch (i) {
            case 0:
                boolean z3 = false;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                if ((intValue & 17) != 16) {
                    z3 = true;
                }
                int i2 = 1;
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue & 1, z3)) {
                    OffsetKt.BoxWithConstraints(null, null, false, Expect_jvmKt.rememberComposableLambda(-1697126425, new AfterpayAppletUpsellCardViewKt$$ExternalSyntheticLambda1(trailingContent, afterpayAppletUpsellCardViewModel, function0, i2), gapComposer2), gapComposer2, 3072, 7);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = (BoxWithConstraintsScopeImpl) obj;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                boxWithConstraintsScopeImpl.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer2).changed(boxWithConstraintsScopeImpl) ? 4 : 2;
                }
                GapComposer gapComposer3 = (GapComposer) composer2;
                boolean shouldExecute = gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18);
                Applier applier = gapComposer3.applier;
                if (shouldExecute) {
                    float m259getMaxWidthD9Ej5fM = boxWithConstraintsScopeImpl.m259getMaxWidthD9Ej5fM() * 0.75f;
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer3, 0);
                    int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, fillMaxWidth);
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
                    Updater.m576setimpl(gapComposer3, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer3, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer3, materializeModifier, composeUiNode$Companion$SetModifier$14);
                    boolean z4 = trailingContent instanceof AfterpayAppletUpsellCardViewModel.TrailingContent.TrailingImage;
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    if (z4) {
                        modifier = ((AfterpayAppletUpsellCardViewModel.TrailingContent.TrailingImage) trailingContent).showsBackground ? rowScopeInstance.weight(1.0f, companion, true) : SizeKt.m292widthInVpY3zN4$default(companion, RecyclerView.DECELERATION_RATE, m259getMaxWidthD9Ej5fM, 1);
                    } else if (trailingContent instanceof AfterpayAppletUpsellCardViewModel.TrailingContent.LogoStack) {
                        modifier = rowScopeInstance.weight(1.0f, companion, true);
                    } else {
                        if (trailingContent != null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        modifier = companion;
                    }
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer3, 0);
                    int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, modifier);
                    gapComposer3.startReusableNode();
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer3.useNode();
                    }
                    Updater.m576setimpl(gapComposer3, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer3, composeUiNode$Companion$SetModifier$13, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer3, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer3).semantic.text.standard, (Composer) gapComposer3, (Modifier) null, Strings.getTypography(gapComposer3).labelMedium, (TextLineBalancing) null, afterpayAppletUpsellCardViewModel.title, (Map) null, (Function1) null, false);
                    GapComposer gapComposer4 = gapComposer3;
                    String str = afterpayAppletUpsellCardViewModel.subtitle;
                    if (str == null) {
                        gapComposer4.startReplaceGroup(208722157);
                        r10 = 0;
                        gapComposer4.end(false);
                        gapComposer = gapComposer4;
                    } else {
                        gapComposer4.startReplaceGroup(208722158);
                        Strings.getSizes(gapComposer4).getClass();
                        DefaultSizes.spacing.getClass();
                        SpacerKt.Spacer(gapComposer4, SizeKt.m277height3ABfNKs(companion, 4.0f));
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer4).semantic.text.standard, (Composer) gapComposer4, (Modifier) null, Strings.getTypography(gapComposer4).bodyMedium, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                        GapComposer gapComposer5 = gapComposer4;
                        r10 = 0;
                        gapComposer5.end(false);
                        gapComposer = gapComposer5;
                    }
                    AfterpayAppletUpsellCardViewModel.CallToAction callToAction = afterpayAppletUpsellCardViewModel.callToAction;
                    if (callToAction == null) {
                        gapComposer.startReplaceGroup(209041922);
                        gapComposer.end(r10);
                    } else {
                        re$$ExternalSyntheticOutline0.m(gapComposer, 209041923, companion, 24.0f, gapComposer);
                        AnalyticsMappersKt.CallToActionView(callToAction, function0, gapComposer, r10);
                        gapComposer.end(r10);
                    }
                    gapComposer.end(true);
                    if (trailingContent == null) {
                        gapComposer.startReplaceGroup(1265244939);
                        gapComposer.end(r10);
                        z2 = true;
                    } else {
                        gapComposer.startReplaceGroup(1265244940);
                        Strings.getSizes(gapComposer).getClass();
                        Request$Priority$EnumUnboxingLocalUtility.m$1(DefaultSizes.spacing, companion, 8.0f, gapComposer);
                        if (trailingContent instanceof AfterpayAppletUpsellCardViewModel.TrailingContent.TrailingImage) {
                            gapComposer.startReplaceGroup(-840780550);
                            if (((AfterpayAppletUpsellCardViewModel.TrailingContent.TrailingImage) trailingContent).showsBackground) {
                                gapComposer.startReplaceGroup(-840734918);
                                z = false;
                                final boolean z5 = false ? 1 : 0;
                                AnalyticsMappersKt.TrailingContentBackground(Expect_jvmKt.rememberComposableLambda(42350127, new Function3() { // from class: com.squareup.cash.afterpayapplet.views.search.AfterpayAppletUpsellCardViewKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                        int i3 = z5;
                                        AfterpayAppletUpsellCardViewModel.TrailingContent trailingContent2 = trailingContent;
                                        switch (i3) {
                                            case 0:
                                                Composer composer3 = (Composer) obj5;
                                                int intValue3 = ((Integer) obj6).intValue();
                                                ((BoxScope) obj4).getClass();
                                                GapComposer gapComposer6 = (GapComposer) composer3;
                                                if (gapComposer6.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                                    AsyncImageKt.m1438AsyncImage10Xjiaw(ThemablesKt.urlForTheme(((AfterpayAppletUpsellCardViewModel.TrailingContent.TrailingImage) trailingContent2).image, gapComposer6), null, SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f), null, ContentScale.Companion.Fit, null, gapComposer6, 1573296, 1976);
                                                } else {
                                                    gapComposer6.skipToGroupEnd();
                                                }
                                                break;
                                            default:
                                                Composer composer4 = (Composer) obj5;
                                                int intValue4 = ((Integer) obj6).intValue();
                                                ((BoxScope) obj4).getClass();
                                                GapComposer gapComposer7 = (GapComposer) composer4;
                                                if (gapComposer7.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                                                    AnalyticsMappersKt.LogoStackContent((AfterpayAppletUpsellCardViewModel.TrailingContent.LogoStack) trailingContent2, gapComposer7, 0);
                                                } else {
                                                    gapComposer7.skipToGroupEnd();
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, gapComposer), gapComposer, 6);
                                gapComposer.end(false);
                            } else {
                                z = false;
                                gapComposer.startReplaceGroup(-840388896);
                                SpacerKt.Spacer(gapComposer, rowScopeInstance.weight(1.0f, companion, true));
                                gapComposer.end(false);
                            }
                            gapComposer.end(z);
                            z2 = true;
                        } else {
                            if (!(trailingContent instanceof AfterpayAppletUpsellCardViewModel.TrailingContent.LogoStack)) {
                                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1358349444, false);
                            }
                            gapComposer.startReplaceGroup(-840176515);
                            AfterpayAppletUpsellCardViewModel.TrailingContent.LogoStack logoStack = (AfterpayAppletUpsellCardViewModel.TrailingContent.LogoStack) trailingContent;
                            if (logoStack.showsBackground) {
                                gapComposer.startReplaceGroup(-840129674);
                                final int i3 = 1;
                                AnalyticsMappersKt.TrailingContentBackground(Expect_jvmKt.rememberComposableLambda(-283574682, new Function3() { // from class: com.squareup.cash.afterpayapplet.views.search.AfterpayAppletUpsellCardViewKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                        int i32 = i3;
                                        AfterpayAppletUpsellCardViewModel.TrailingContent trailingContent2 = trailingContent;
                                        switch (i32) {
                                            case 0:
                                                Composer composer3 = (Composer) obj5;
                                                int intValue3 = ((Integer) obj6).intValue();
                                                ((BoxScope) obj4).getClass();
                                                GapComposer gapComposer6 = (GapComposer) composer3;
                                                if (gapComposer6.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                                    AsyncImageKt.m1438AsyncImage10Xjiaw(ThemablesKt.urlForTheme(((AfterpayAppletUpsellCardViewModel.TrailingContent.TrailingImage) trailingContent2).image, gapComposer6), null, SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f), null, ContentScale.Companion.Fit, null, gapComposer6, 1573296, 1976);
                                                } else {
                                                    gapComposer6.skipToGroupEnd();
                                                }
                                                break;
                                            default:
                                                Composer composer4 = (Composer) obj5;
                                                int intValue4 = ((Integer) obj6).intValue();
                                                ((BoxScope) obj4).getClass();
                                                GapComposer gapComposer7 = (GapComposer) composer4;
                                                if (gapComposer7.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                                                    AnalyticsMappersKt.LogoStackContent((AfterpayAppletUpsellCardViewModel.TrailingContent.LogoStack) trailingContent2, gapComposer7, 0);
                                                } else {
                                                    gapComposer7.skipToGroupEnd();
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, gapComposer), gapComposer, 6);
                                z = false;
                                gapComposer.end(false);
                                z2 = true;
                            } else {
                                gapComposer.startReplaceGroup(-840027033);
                                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                                int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
                                PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
                                Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, companion);
                                gapComposer.startReusableNode();
                                if (gapComposer.inserting) {
                                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                                } else {
                                    gapComposer.useNode();
                                }
                                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                                Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                                Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                                Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                                z = false;
                                AnalyticsMappersKt.LogoStackContent(logoStack, gapComposer, 0);
                                z2 = true;
                                gapComposer.end(true);
                                gapComposer.end(false);
                            }
                            gapComposer.end(z);
                        }
                        gapComposer.end(z);
                    }
                    gapComposer.end(z2);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
