package com.squareup.cash.shopping.views.search;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.DateInputKt$DateInputTextField$3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.directoryui.viewmodels.DirectoryAnalyticsData;
import app.cash.directoryui.viewmodels.DirectoryListItem;
import app.cash.molecule.PlatformKt;
import coil3.RealImageLoader;
import coil3.compose.AsyncImageKt;
import coil3.compose.FixedSizeColorPainter;
import com.mikepenz.markdown.model.MarkdownAnimationsKt;
import com.squareup.cash.avatar.components.BadgedAvatarKt;
import com.squareup.cash.card.onboarding.CardModelView$1$3$4$2;
import com.squareup.cash.common.viewmodels.AvatarViewModel;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.investing.viewmodels.categories.InvestingCategoryTileContentModel;
import com.squareup.cash.mooncake.compose_ui.ComposeUtilsKt;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.protos.cash.discover.api.app.v1.model.Text;
import com.squareup.protos.cash.ui.Image;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;

/* loaded from: classes6.dex */
public final class ShopHubResultsListKt$CardAvatarSectionView$lambda$0$0$$inlined$itemsIndexed$default$3 implements Function4 {
    public final /* synthetic */ RealImageLoader $imageLoader$inlined;
    public final /* synthetic */ ArrayList $items;
    public final /* synthetic */ Function1 $onEvent$inlined;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ ShopHubResultsListKt$CardAvatarSectionView$lambda$0$0$$inlined$itemsIndexed$default$3(ArrayList arrayList, Function1 function1, RealImageLoader realImageLoader, int i) {
        this.$r8$classId = i;
        this.$items = arrayList;
        this.$onEvent$inlined = function1;
        this.$imageLoader$inlined = realImageLoader;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        Text text;
        String str;
        Text text2;
        String str2;
        int i2;
        int i3 = this.$r8$classId;
        Function1 function1 = this.$onEvent$inlined;
        ArrayList arrayList = this.$items;
        switch (i3) {
            case 0:
                LazyItemScopeImpl lazyItemScopeImpl = (LazyItemScopeImpl) obj;
                int intValue = ((Number) obj2).intValue();
                Composer composer = (Composer) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    i = intValue2 | (((GapComposer) composer).changed(lazyItemScopeImpl) ? 4 : 2);
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= ((GapComposer) composer).changed(intValue) ? 32 : 16;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(i & 1, (i & 147) != 146)) {
                    DirectoryListItem.ItemViewModel itemViewModel = (DirectoryListItem.ItemViewModel) arrayList.get(intValue);
                    gapComposer.startReplaceGroup(662637316);
                    DirectoryAnalyticsData directoryAnalyticsData = itemViewModel.analyticsData;
                    AvatarViewModel avatarViewModel = itemViewModel.avatar;
                    String str3 = null;
                    DirectoryAnalyticsData copy$default = DirectoryAnalyticsData.copy$default(directoryAnalyticsData, DirectoryAnalyticsData.ItemAnalyticsData.copy$default(directoryAnalyticsData.item, Integer.valueOf(intValue)), null, null, 509);
                    boolean changed = gapComposer.changed(function1) | gapComposer.changedInstance(copy$default);
                    Object rememberedValue = gapComposer.rememberedValue();
                    Object obj5 = Composer.Companion.Empty;
                    if (changed || rememberedValue == obj5) {
                        rememberedValue = new ShopHubResultsListKt$CardAvatarSectionView$1$1$1$1$1(function1, copy$default, 0);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Function0 function0 = (Function0) rememberedValue;
                    function0.getClass();
                    itemViewModel.$$delegate_0.reportViewed(function0);
                    BiasAlignment.Horizontal horizontal = Alignment.Companion.CenterHorizontally;
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier m290width3ABfNKs = SizeKt.m290width3ABfNKs(companion, 104.0f);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (rememberedValue2 == obj5) {
                        rememberedValue2 = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
                    }
                    MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue2;
                    boolean changed2 = gapComposer.changed(function1) | gapComposer.changedInstance(itemViewModel);
                    Object rememberedValue3 = gapComposer.rememberedValue();
                    if (changed2 || rememberedValue3 == obj5) {
                        rememberedValue3 = new CardModelView$1$3$4$2(22, function1, itemViewModel);
                        gapComposer.updateRememberedValue(rememberedValue3);
                    }
                    Modifier m182clickableO2vRcR0$default = ImageKt.m182clickableO2vRcR0$default(m290width3ABfNKs, mutableInteractionSourceImpl, null, false, null, null, (Function0) rememberedValue3, 28);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, horizontal, gapComposer, 48);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m182clickableO2vRcR0$default);
                    ComposeUiNode.Companion.getClass();
                    Function0 function02 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(function02);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    boolean z = avatarViewModel != null;
                    if (z) {
                        gapComposer.startReplaceGroup(1087157360);
                        Context context = (Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext);
                        avatarViewModel.getClass();
                        BadgedAvatarKt.m3409BadgedAvatarRYf9XWw(null, ComposeUtilsKt.getThemedUrl(avatarViewModel.photoImage, gapComposer), null, null, null, 0L, null, null, 0L, null, 104.0f, RecyclerView.DECELERATION_RATE, this.$imageLoader$inlined, 0L, Expect_jvmKt.rememberComposableLambda(-1891313523, new DateInputKt$DateInputTextField$3(context, 9), gapComposer), null, null, null, gapComposer, 0, 1576320, 0, 2002941);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(1088057538);
                        Image image = itemViewModel.picture;
                        if (image == null) {
                            gapComposer.startReplaceGroup(1088086026);
                        } else {
                            gapComposer.startReplaceGroup(1974762199);
                            str3 = ComposeUtilsKt.getThemedUrl(image, gapComposer);
                        }
                        gapComposer.end(false);
                        AsyncImageKt.m1440AsyncImagenc27qi8(str3, this.$imageLoader$inlined, ImageKt.m177backgroundbw27NRU(SizeKt.m285size3ABfNKs(ClipKt.clip(companion, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f)), 104.0f), MooncakeTheme.getColors(gapComposer).placeholderBackground, ColorKt.RectangleShape), new FixedSizeColorPainter(MooncakeTheme.getColors(gapComposer).placeholderBackground), null, null, null, null, ContentScale.Companion.Crop, gapComposer, (FixedSizeColorPainter.$stable << 12) | 48, 48, 63456);
                        gapComposer.end(false);
                    }
                    SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 8.0f));
                    int i4 = z ? 3 : 5;
                    DirectoryListItem.ItemViewModel.Text text3 = itemViewModel.title;
                    KeypadKt.m3651TextPdH14aY(1, 0, i4, 0, 196656, 0, 3792, MooncakeTheme.getColors(gapComposer).secondaryLabel, (Composer) gapComposer, SizeKt.fillMaxWidth(companion, 1.0f), TextStyle.m994copyp1EtxEg$default(MooncakeTheme.getTypography(gapComposer).caption, 0L, Room.getSp(12), null, null, 0L, null, 0L, null, null, null, 0, Room.getSp(18), null, null, 0, 16646141), (TextLineBalancing) null, (text3 == null || (text2 = text3.text) == null || (str2 = text2.text) == null) ? "" : str2, (Map) null, (Function1) null, false);
                    DirectoryListItem.ItemViewModel.Text text4 = itemViewModel.subtitle;
                    KeypadKt.m3651TextPdH14aY(2, 0, i4, 0, 196656, 0, 3792, MooncakeTheme.getColors(gapComposer).label, (Composer) gapComposer, SizeKt.fillMaxWidth(companion, 1.0f), TextStyle.m994copyp1EtxEg$default(MooncakeTheme.getTypography(gapComposer).strongCaption, 0L, Room.getSp(12), null, null, 0L, null, 0L, null, null, null, 0, Room.getSp(18), null, null, 0, 16646141), (TextLineBalancing) null, (text4 == null || (text = text4.text) == null || (str = text.text) == null) ? "" : str, (Map) null, (Function1) null, false);
                    gapComposer.end(true);
                    gapComposer.end(false);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                LazyItemScopeImpl lazyItemScopeImpl2 = (LazyItemScopeImpl) obj;
                int intValue3 = ((Number) obj2).intValue();
                Composer composer2 = (Composer) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    i2 = intValue4 | (((GapComposer) composer2).changed(lazyItemScopeImpl2) ? 4 : 2);
                } else {
                    i2 = intValue4;
                }
                if ((48 & intValue4) == 0) {
                    i2 |= ((GapComposer) composer2).changed(intValue3) ? 32 : 16;
                }
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
                    InvestingCategoryTileContentModel investingCategoryTileContentModel = (InvestingCategoryTileContentModel) arrayList.get(intValue3);
                    gapComposer2.startReplaceGroup(-1241776802);
                    MarkdownAnimationsKt.InvestingCategoryCarouselCard(investingCategoryTileContentModel, function1, this.$imageLoader$inlined, gapComposer2, 8);
                    gapComposer2.end(false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
