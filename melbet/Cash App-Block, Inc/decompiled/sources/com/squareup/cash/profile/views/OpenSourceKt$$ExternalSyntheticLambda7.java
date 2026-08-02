package com.squareup.cash.profile.views;

import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.pager.PagerScopeImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda16;
import app.cash.local.views.wallet.WalletWidgetKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.offers.views.home.OffersHomeV2Kt$$ExternalSyntheticLambda7;
import com.squareup.cash.p2pblocking.viewmodels.P2PListRowModel;
import com.squareup.cash.p2pblocking.viewmodels.P2PListRowTapButtonEvent;
import com.squareup.cash.p2pblocking.views.P2PListRowKt;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda17;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.pdf.view.PdfPreviewViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.profile.viewmodels.OpenSourceViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;

/* loaded from: classes6.dex */
public final /* synthetic */ class OpenSourceKt$$ExternalSyntheticLambda7 implements Function4 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ List f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ OpenSourceKt$$ExternalSyntheticLambda7(int i, Function1 function1, List list) {
        this.$r8$classId = i;
        this.f$0 = list;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        CellDefaultAccessory cellDefaultAccessory;
        CellDefaultAccessory label;
        Function0 function0;
        int i = this.$r8$classId;
        Object obj5 = Composer.Companion.Empty;
        Function1 function1 = this.f$1;
        List list = this.f$0;
        switch (i) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                Composer composer = (Composer) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                if ((intValue2 & 48) == 0) {
                    intValue2 |= ((GapComposer) composer).changed(intValue) ? 32 : 16;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue2 & 1, (intValue2 & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) != 144)) {
                    OpenSourceViewModel.ArtifactViewModel artifactViewModel = (OpenSourceViewModel.ArtifactViewModel) list.get(intValue);
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1536494211, new PdfPreviewViewKt$$ExternalSyntheticLambda2(artifactViewModel, 19), gapComposer);
                    boolean changedInstance = gapComposer.changedInstance(artifactViewModel) | gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue == obj5) {
                        rememberedValue = new ProfileKt$$ExternalSyntheticLambda11(17, (Object) artifactViewModel, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Function0 function02 = (Function0) rememberedValue;
                    ArrayList arrayList = artifactViewModel.spdxLicenses;
                    if (arrayList != null) {
                        cellDefaultAccessory = new CellDefaultAccessory.Label((String) arrayList.get(0), 2);
                    } else {
                        ArrayList arrayList2 = artifactViewModel.unknownLicenses;
                        if (arrayList2 != null) {
                            label = new CellDefaultAccessory.Label((String) arrayList2.get(0), 2);
                            CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(rememberComposableLambda, null, function02, false, false, null, null, 0L, label, null, gapComposer, 6, 1530);
                        } else {
                            cellDefaultAccessory = CellDefaultAccessory.Push.INSTANCE;
                        }
                    }
                    label = cellDefaultAccessory;
                    CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(rememberComposableLambda, null, function02, false, false, null, null, 0L, label, null, gapComposer, 6, 1530);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                int intValue3 = ((Integer) obj2).intValue();
                Composer composer2 = (Composer) obj3;
                ((Integer) obj4).getClass();
                ((PagerScopeImpl) obj).getClass();
                Updater.CompositionLocalProvider(WalletWidgetKt.LocalWalletWidgetBorderVisible.defaultProvidedValue$runtime(Boolean.FALSE), Expect_jvmKt.rememberComposableLambda(-1607181520, new TabContentViewKt$$ExternalSyntheticLambda16(list, intValue3, function1), composer2), composer2, 56);
                break;
            default:
                int intValue4 = ((Integer) obj2).intValue();
                Composer composer3 = (Composer) obj3;
                int intValue5 = ((Integer) obj4).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                if ((intValue5 & 48) == 0) {
                    intValue5 |= ((GapComposer) composer3).changed(intValue4) ? 32 : 16;
                }
                GapComposer gapComposer2 = (GapComposer) composer3;
                if (gapComposer2.shouldExecute(intValue5 & 1, (intValue5 & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) != 144)) {
                    P2PListRowModel p2PListRowModel = (P2PListRowModel) list.get(intValue4);
                    P2PListRowTapButtonEvent p2PListRowTapButtonEvent = p2PListRowModel.onTapButtonEvent;
                    if (p2PListRowTapButtonEvent == null) {
                        gapComposer2.startReplaceGroup(-207730744);
                        gapComposer2.end(false);
                        function0 = null;
                    } else {
                        gapComposer2.startReplaceGroup(-207730743);
                        boolean changed = gapComposer2.changed(function1) | gapComposer2.changedInstance(p2PListRowTapButtonEvent);
                        Object rememberedValue2 = gapComposer2.rememberedValue();
                        if (changed || rememberedValue2 == obj5) {
                            rememberedValue2 = new OffersHomeV2Kt$$ExternalSyntheticLambda7(12, function1, p2PListRowTapButtonEvent);
                            gapComposer2.updateRememberedValue(rememberedValue2);
                        }
                        function0 = (Function0) rememberedValue2;
                        gapComposer2.end(false);
                    }
                    if (function0 == null) {
                        gapComposer2.startReplaceGroup(-207691156);
                        Object rememberedValue3 = gapComposer2.rememberedValue();
                        if (rememberedValue3 == obj5) {
                            rememberedValue3 = new P2PListViewKt$$ExternalSyntheticLambda2(18);
                            gapComposer2.updateRememberedValue(rememberedValue3);
                        }
                        function0 = (Function0) rememberedValue3;
                    } else {
                        gapComposer2.startReplaceGroup(824582170);
                    }
                    gapComposer2.end(false);
                    boolean changed2 = gapComposer2.changed(function1) | gapComposer2.changedInstance(p2PListRowModel);
                    Object rememberedValue4 = gapComposer2.rememberedValue();
                    if (changed2 || rememberedValue4 == obj5) {
                        rememberedValue4 = new P2PListViewKt$$ExternalSyntheticLambda17(function1, p2PListRowModel, 0);
                        gapComposer2.updateRememberedValue(rememberedValue4);
                    }
                    P2PListRowKt.P2PListRow(p2PListRowModel, function0, (Function0) rememberedValue4, gapComposer2, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
