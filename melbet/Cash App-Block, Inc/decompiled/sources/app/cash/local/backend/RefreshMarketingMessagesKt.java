package app.cash.local.backend;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.local.primitives.MarketingMessageData;
import app.cash.local.primitives.MessageToken;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda9;
import com.squareup.cash.R;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.money.applets.common.views.InstalledServiceAppletTileLayoutConfig;
import com.squareup.cash.money.applets.common.views.SharedUIKt;
import com.squareup.cash.money.viewmodels.InstalledAppletTileHeaderModel;
import com.squareup.cash.money.viewmodels.InstalledServiceAppletTileContentModel;
import com.squareup.cash.tax.applet.views.TaxesAppletViewsModule$$ExternalSyntheticLambda1;
import com.squareup.cash.work.applets.viewmodels.WorkAppletTileModel;
import com.squareup.cash.work.views.WorkViewFactory$$ExternalSyntheticLambda12;
import com.squareup.cash.work.views.shift.ShiftListViewKt$$ExternalSyntheticLambda12;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class RefreshMarketingMessagesKt {
    public static final void InstalledUI(WorkAppletTileModel.Installed installed, String str, TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda1, Composer composer, int i) {
        TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda12;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1089482124);
        int i2 = (gapComposer.changedInstance(installed) ? 4 : 2) | i | (gapComposer.changed(str) ? 32 : 16);
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            taxesAppletViewsModule$$ExternalSyntheticLambda12 = taxesAppletViewsModule$$ExternalSyntheticLambda1;
            i2 |= gapComposer.changedInstance(taxesAppletViewsModule$$ExternalSyntheticLambda12) ? 256 : 128;
        } else {
            taxesAppletViewsModule$$ExternalSyntheticLambda12 = taxesAppletViewsModule$$ExternalSyntheticLambda1;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ComposableLambdaImpl composableLambdaImpl = null;
            InstalledAppletTileHeaderModel installedAppletTileHeaderModel = new InstalledAppletTileHeaderModel(str, null, null, 14);
            ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
            createListBuilder.add(new InstalledServiceAppletTileContentModel(null, null, new InstalledServiceAppletTileContentModel.BriefState.Loaded(installed.primaryText), null, 11));
            String str2 = installed.secondaryText;
            if (str2 != null) {
                createListBuilder.add(new InstalledServiceAppletTileContentModel(null, null, new InstalledServiceAppletTileContentModel.BriefState.Loaded(str2), null, 11));
            }
            ListBuilder build = CollectionsKt__CollectionsJVMKt.build(createListBuilder);
            InstalledServiceAppletTileLayoutConfig shiftsTileLayoutConfig = shiftsTileLayoutConfig(gapComposer);
            ArrayList arrayList = installed.icons;
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            if (arrayList == null) {
                gapComposer.startReplaceGroup(306314228);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(306314229);
                composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(565806706, new LocalHomeGeoViewKt$$ExternalSyntheticLambda9(arrayList, 9), gapComposer);
                gapComposer.end(false);
            }
            SharedUIKt.InstalledServiceAppletTile(installedAppletTileHeaderModel, build, taxesAppletViewsModule$$ExternalSyntheticLambda12, true, null, shiftsTileLayoutConfig, composableLambdaImpl, gapComposer, 3072 | (i2 & 896), 16);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ShiftListViewKt$$ExternalSyntheticLambda12(installed, str, taxesAppletViewsModule$$ExternalSyntheticLambda1, i, 1);
        }
    }

    public static final void LoadingUI(String str, TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(687644040);
        int i2 = (gapComposer.changed(str) ? 4 : 2) | i | (gapComposer.changedInstance(taxesAppletViewsModule$$ExternalSyntheticLambda1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            SharedUIKt.InstalledServiceAppletTile(new InstalledAppletTileHeaderModel(str, null, null, 14), CollectionsKt__CollectionsJVMKt.listOf(new InstalledServiceAppletTileContentModel(null, null, InstalledServiceAppletTileContentModel.BriefState.Loading.INSTANCE, null, 11)), taxesAppletViewsModule$$ExternalSyntheticLambda1, false, null, shiftsTileLayoutConfig(gapComposer), null, gapComposer, 64 | ((i2 << 3) & 896), 88);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new WorkViewFactory$$ExternalSyntheticLambda12(str, taxesAppletViewsModule$$ExternalSyntheticLambda1, i, 24);
        }
    }

    public static final void UI(WorkAppletTileModel workAppletTileModel, TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1673042293);
        int i2 = (gapComposer.changedInstance(workAppletTileModel) ? 4 : 2) | i | (gapComposer.changedInstance(taxesAppletViewsModule$$ExternalSyntheticLambda1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            String stringResource = Room.stringResource(gapComposer, R.string.work_shifts_tile_title);
            if (workAppletTileModel instanceof WorkAppletTileModel.Installed) {
                gapComposer.startReplaceGroup(1475880855);
                InstalledUI((WorkAppletTileModel.Installed) workAppletTileModel, stringResource, taxesAppletViewsModule$$ExternalSyntheticLambda1, gapComposer, ((i2 << 3) & 896) | (i2 & 14));
                gapComposer.end(false);
            } else if (workAppletTileModel instanceof WorkAppletTileModel.Loading) {
                gapComposer.startReplaceGroup(1475883182);
                LoadingUI(stringResource, taxesAppletViewsModule$$ExternalSyntheticLambda1, gapComposer, i2 & 112);
                gapComposer.end(false);
            } else {
                if (!(workAppletTileModel instanceof WorkAppletTileModel.Failed)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1475879313, false);
                }
                gapComposer.startReplaceGroup(1475885261);
                SharedUIKt.FailedAppletTile(i2 & 112, gapComposer, stringResource, taxesAppletViewsModule$$ExternalSyntheticLambda1);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new WorkViewFactory$$ExternalSyntheticLambda12(workAppletTileModel, taxesAppletViewsModule$$ExternalSyntheticLambda1, i, 23);
        }
    }

    public static final LinkedHashSet access$unreadMessageTokens(List list) {
        if (list == null) {
            list = EmptyList.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            MarketingMessageData.Badge badge = ((MarketingMessageData) obj).badge;
            if (badge != null && !badge.isViewed) {
                arrayList.add(obj);
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(new MessageToken(((MarketingMessageData) it.next()).messageToken));
        }
        return linkedHashSet;
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewBorrowLoadCreditLimitDeprecated.deepLinkSpecs;
    }

    public static final InstalledServiceAppletTileLayoutConfig shiftsTileLayoutConfig(Composer composer) {
        StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
        GapComposer gapComposer = (GapComposer) composer;
        ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
        DefaultSizes.spacing.getClass();
        ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
        TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelSmall;
        InstalledServiceAppletTileLayoutConfig.VisualPosition visualPosition = InstalledServiceAppletTileLayoutConfig.VisualPosition.START;
        InstalledServiceAppletTileLayoutConfig.VisualPosition visualPosition2 = InstalledServiceAppletTileLayoutConfig.VisualPosition.END;
        if ((16 & 8) != 0) {
            visualPosition2 = InstalledServiceAppletTileLayoutConfig.VisualPosition.START;
        }
        textStyle.getClass();
        return new InstalledServiceAppletTileLayoutConfig(16.0f, RecyclerView.DECELERATION_RATE, textStyle, visualPosition2, Alignment.Companion.Bottom);
    }
}
