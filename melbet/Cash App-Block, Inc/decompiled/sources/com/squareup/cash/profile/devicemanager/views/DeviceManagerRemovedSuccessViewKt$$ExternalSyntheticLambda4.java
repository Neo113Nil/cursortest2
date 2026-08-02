package com.squareup.cash.profile.devicemanager.views;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import coil3.size.DimensionKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.pdf.view.PdfPreviewViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.profile.devicemanager.viewmodels.DeviceManagerRemovedSuccessViewModel;
import com.squareup.cash.profile.views.ErrorViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes7.dex */
public final /* synthetic */ class DeviceManagerRemovedSuccessViewKt$$ExternalSyntheticLambda4 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ DeviceManagerRemovedSuccessViewModel f$1;

    public /* synthetic */ DeviceManagerRemovedSuccessViewKt$$ExternalSyntheticLambda4(Function1 function1, DeviceManagerRemovedSuccessViewModel deviceManagerRemovedSuccessViewModel, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = deviceManagerRemovedSuccessViewModel;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        DeviceManagerRemovedSuccessViewModel deviceManagerRemovedSuccessViewModel = this.f$1;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new ErrorViewKt$$ExternalSyntheticLambda4(15, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    SheetKt.Sheet((Function0) rememberedValue, null, null, null, null, false, null, Expect_jvmKt.rememberComposableLambda(601558070, new DeviceManagerRemovedSuccessViewKt$$ExternalSyntheticLambda9(deviceManagerRemovedSuccessViewModel, function1), gapComposer), gapComposer, 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    long j = Strings.getColors(gapComposer2).semantic.background.f1047app;
                    RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier fillMaxHeight = SizeKt.fillMaxHeight(ImageKt.m177backgroundbw27NRU(companion, j, rectangleShapeKt$RectangleShape$1), 1.0f);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, fillMaxHeight);
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
                    NavigationType navigationType = NavigationType.CLOSE;
                    boolean changed2 = gapComposer2.changed(function1);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new ErrorViewKt$$ExternalSyntheticLambda4(9, function1);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    DBUtil.TitleBarSub((String) null, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue2, (Modifier) null, (Function3) null, gapComposer2, 54, 108);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer2, null);
                    Countries.PageHeader(Room.stringResource(gapComposer2, R.string.device_removal_success_title), (Modifier) null, DeviceManagerListViewKt.lambda$1076051874, deviceManagerRemovedSuccessViewModel.message, gapComposer2, MLKEMEngine.KyberPolyBytes, 2);
                    SpacerKt.Spacer(gapComposer2, new LayoutWeightElement(1.0f, true));
                    Strings.getSizes(gapComposer2).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                    Strings.getSizes(gapComposer2).getClass();
                    Object obj3 = DefaultSizes.border.annotationsMap;
                    long j2 = Strings.getColors(gapComposer2).semantic.border.subtle;
                    Strings.getSizes(gapComposer2).getClass();
                    Modifier m178borderxT4_qwU = ImageKt.m178borderxT4_qwU(m300paddingVpY3zN4$default, 1.0f, j2, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f));
                    DeviceManagerRemovedSuccessViewModel.SecurityOption securityOption = deviceManagerRemovedSuccessViewModel.securityOption;
                    ModalKt.InlineMessage(m178borderxT4_qwU, securityOption.title, securityOption.description, Expect_jvmKt.rememberComposableLambda(-1965502987, new DeviceManagerRemovedSuccessViewKt$$ExternalSyntheticLambda9(function1, deviceManagerRemovedSuccessViewModel, 1), gapComposer2), (Function3) null, (Function3) null, gapComposer2, 3072, 48);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer2, null);
                    DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(-386576167, new PdfPreviewViewKt$$ExternalSyntheticLambda4(21, function1), gapComposer2), gapComposer2, 24576, 15);
                    gapComposer2.end(true);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
