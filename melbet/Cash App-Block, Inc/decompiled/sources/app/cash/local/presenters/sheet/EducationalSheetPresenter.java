package app.cash.local.presenters.sheet;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.local.navigation.launcher.RealLocalLauncher;
import app.cash.local.screens.app.LocalEducationalSheet;
import app.cash.local.screens.app.LocalShortlinkSheet;
import app.cash.local.viewmodels.sheet.EducationalButtonAction;
import app.cash.local.viewmodels.sheet.EducationalSheetModel;
import app.cash.local.viewmodels.sheet.EducationalSheetModelList;
import app.cash.local.viewmodels.sheet.LocalShortlinkViewModel;
import coil3.RealImageLoader$execute$result$1;
import com.datadog.android.ndk.internal.NdkCrashLog;
import com.google.android.gms.internal.mlkit_vision_barcode.zztj;
import com.google.android.gms.internal.mlkit_vision_common.zzhs;
import com.google.android.gms.internal.mlkit_vision_common.zzhu;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.screens.Finish;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.protos.cash.local.client.v1.EducationalSheet;
import com.squareup.protos.cash.local.client.v1.EducationalSheetButton;
import com.squareup.protos.cash.local.client.v1.EducationalSheetButton$Action$PaginatedSheet;
import com.squareup.protos.cash.local.client.v1.EducationalSheetContent;
import com.squareup.protos.cash.local.client.v1.EducationalSheetContent$Content$Image;
import com.squareup.protos.cash.local.client.v1.EducationalSheetImage;
import com.squareup.protos.cash.local.client.v1.EducationalSheetImage$Image$FullBleedHeroImage;
import com.squareup.protos.cash.local.client.v1.PaginatedSheet;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import okio.ByteString;

/* loaded from: classes3.dex */
public final class EducationalSheetPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final RealLocalLauncher launcher;
    public final Navigator navigator;
    public final String nextShortlinkFlowState;
    public final LocalEducationalSheet screen;
    public final SessionManager sessionManager;
    public final EducationalSheet sheet;
    public final String sheetToken;
    public final String shortlinkKey;

    public EducationalSheetPresenter(RealLocalLauncher realLocalLauncher, Analytics analytics, SessionManager sessionManager, LocalEducationalSheet localEducationalSheet, Navigator navigator) {
        localEducationalSheet.getClass();
        navigator.getClass();
        this.launcher = realLocalLauncher;
        this.analytics = analytics;
        this.sessionManager = sessionManager;
        this.screen = localEducationalSheet;
        this.navigator = navigator;
        EducationalSheet educationalSheet = localEducationalSheet.educationalSheet;
        this.sheet = educationalSheet;
        this.sheetToken = educationalSheet.token;
        this.shortlinkKey = localEducationalSheet.shortlinkKey;
        this.nextShortlinkFlowState = localEducationalSheet.nextShortlinkFlowState;
    }

    public final void handleAction(EducationalButtonAction educationalButtonAction) {
        educationalButtonAction.getClass();
        boolean z = educationalButtonAction instanceof EducationalButtonAction.ClientRoute;
        Navigator navigator = this.navigator;
        if (z) {
            this.launcher.openWeb(navigator, ((EducationalButtonAction.ClientRoute) educationalButtonAction).value);
        } else {
            if (educationalButtonAction instanceof EducationalButtonAction.Dismiss) {
                navigator.goTo(new Finish(null));
                return;
            }
            if (educationalButtonAction instanceof EducationalButtonAction.Paginate) {
                return;
            }
            if (!(educationalButtonAction instanceof EducationalButtonAction.Shortlink)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
            } else {
                EducationalButtonAction.Shortlink shortlink = (EducationalButtonAction.Shortlink) educationalButtonAction;
                navigator.goTo(new LocalShortlinkSheet(shortlink.shortlinkKey, shortlink.nextShortlinkFlowState));
            }
        }
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final LocalShortlinkViewModel models(Flow flow, Composer composer, int i) {
        EducationalSheetModel.Button.Style style;
        PaginatedSheet paginatedSheet;
        boolean z;
        EducationalSheetImage educationalSheetImage;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(133697024);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        EducationalSheet educationalSheet = this.sheet;
        if (rememberedValue == neverEqualPolicy) {
            Boolean bool = this.screen.educationalSheet.show_page_progress;
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            List list = educationalSheet.half_sheet_contents;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    NdkCrashLog.Companion companion = ((EducationalSheetContent) it.next()).content;
                    EducationalSheetContent$Content$Image educationalSheetContent$Content$Image = companion instanceof EducationalSheetContent$Content$Image ? (EducationalSheetContent$Content$Image) companion : null;
                    zzhu zzhuVar = (educationalSheetContent$Content$Image == null || (educationalSheetImage = educationalSheetContent$Content$Image.value) == null) ? null : educationalSheetImage.image;
                    if ((zzhuVar instanceof EducationalSheetImage$Image$FullBleedHeroImage ? (EducationalSheetImage$Image$FullBleedHeroImage) zzhuVar : null) != null) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            rememberedValue = Recorder$$ExternalSyntheticOutline1.m(booleanValue || z, gapComposer);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        boolean booleanValue2 = ((Boolean) mutableState.getValue()).booleanValue();
        educationalSheet.getClass();
        ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
        EducationalSheet educationalSheet2 = educationalSheet;
        while (educationalSheet2 != null) {
            EducationalSheetButton educationalSheetButton = educationalSheet2.primary_button;
            List list2 = educationalSheet2.half_sheet_contents;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(zztj.toModel((EducationalSheetContent) it2.next()));
            }
            List list3 = educationalSheet2.expanded_contents;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                arrayList2.add(zztj.toModel((EducationalSheetContent) it3.next()));
            }
            String str = educationalSheet2.expand_nudge_text;
            Boolean bool2 = educationalSheet2.requires_full_scroll;
            boolean booleanValue3 = bool2 != null ? bool2.booleanValue() : false;
            educationalSheetButton.getClass();
            boolean z2 = educationalSheet2.expand_nudge_text == null || booleanValue2;
            String str2 = educationalSheetButton.label;
            str2.getClass();
            EducationalSheetButton.Style style2 = educationalSheetButton.style;
            MutableState mutableState2 = mutableState;
            int i2 = style2 == null ? -1 : EducationalSheetPresenterKt$WhenMappings.$EnumSwitchMapping$1[style2.ordinal()];
            if (i2 == -1 || i2 == 1 || i2 == 2) {
                style = EducationalSheetModel.Button.Style.PRIMARY;
            } else {
                if (i2 != 3) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                style = EducationalSheetModel.Button.Style.SECONDARY;
            }
            EducationalSheetModel.Button button = new EducationalSheetModel.Button(str2, style, z2, zztj.toButtonAction(educationalSheetButton));
            EducationalSheetButton educationalSheetButton2 = educationalSheet2.dismiss_button;
            createListBuilder.add(new EducationalSheetModel(arrayList, arrayList2, str, booleanValue3, button, booleanValue2, educationalSheetButton2 != null ? zztj.toButtonAction(educationalSheetButton2) : null));
            zzhs zzhsVar = educationalSheetButton.action;
            EducationalSheetButton$Action$PaginatedSheet educationalSheetButton$Action$PaginatedSheet = zzhsVar instanceof EducationalSheetButton$Action$PaginatedSheet ? (EducationalSheetButton$Action$PaginatedSheet) zzhsVar : null;
            if (educationalSheetButton$Action$PaginatedSheet == null || (paginatedSheet = educationalSheetButton$Action$PaginatedSheet.value) == null) {
                educationalSheet2 = null;
            } else {
                List list4 = paginatedSheet.contents;
                EmptyList emptyList = EmptyList.INSTANCE;
                Boolean bool3 = Boolean.TRUE;
                EducationalSheetButton educationalSheetButton3 = paginatedSheet.primary_button;
                educationalSheetButton3.getClass();
                educationalSheet2 = new EducationalSheet(list4, emptyList, null, bool3, educationalSheetButton3, null, null, paginatedSheet.dismiss_button, null, ByteString.EMPTY);
            }
            mutableState = mutableState2;
        }
        MutableState mutableState3 = mutableState;
        ListBuilder build = CollectionsKt__CollectionsJVMKt.build(createListBuilder);
        Boolean bool4 = educationalSheet.show_page_progress;
        EducationalSheetModelList educationalSheetModelList = new EducationalSheetModelList(build, bool4 != null ? bool4.booleanValue() : false, false);
        Updater.LaunchedEffect(gapComposer, flow, new RealImageLoader$execute$result$1(flow, (Continuation) null, educationalSheetModelList, this, mutableState3, 17));
        LocalShortlinkViewModel localShortlinkViewModel = new LocalShortlinkViewModel(educationalSheetModelList);
        gapComposer.end(false);
        return localShortlinkViewModel;
    }
}
