package com.squareup.cash.shopping.views.search;

import androidx.camera.camera2.pipe.compat.VirtualCameraState$connect$2$1;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.grid.LazyGridStateKt;
import androidx.compose.material.SwipeToDismissKt$$ExternalSyntheticLambda3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.MultiParagraph$$ExternalSyntheticLambda1;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.directoryui.viewmodels.DirectoryListItem;
import app.cash.directoryui.viewmodels.DirectoryViewEvent;
import app.cash.directoryui.viewmodels.DirectoryViewEvent$HeaderViewEvent$HeaderButtonClick;
import app.cash.molecule.PlatformKt;
import app.cash.zipline.loader.internal.fetcher.FetcherKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.AsyncImageKt;
import com.squareup.cash.R;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.marketing.components.CardUpsellKt$SmallUpsellCardContent$2$1;
import com.squareup.cash.mooncake.components.MooncakePillButton;
import com.squareup.cash.mooncake.compose_ui.ComposeUtilsKt;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.mooncake.compose_ui.MooncakeTypography;
import com.squareup.cash.mooncake.compose_ui.MooncakeTypographyKt;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda13;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda9;
import com.squareup.cash.shopping.viewmodels.SearchResultsViewEvent;
import com.squareup.cash.wallet.views.CardTransitionKt$$ExternalSyntheticLambda4;
import com.squareup.protos.cash.discover.api.app.v1.model.Button;
import com.squareup.protos.cash.discover.api.app.v1.model.Button$Content$Text;
import com.squareup.protos.cash.discover.api.app.v1.model.Text;
import com.squareup.protos.cash.ui.Image;
import com.squareup.util.cash.Countries;
import com.squareup.util.compose.LifecycleKt$$ExternalSyntheticLambda0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public abstract class ShopMessageKt {
    public static final ComposableLambdaImpl lambda$713213791 = new ComposableLambdaImpl(new ShopHubResultsListKt$$ExternalSyntheticLambda14(11), false, 713213791);

    public static final void CardAvatarSectionView(DirectoryListItem.CardAvatarSectionViewModel cardAvatarSectionViewModel, RealImageLoader realImageLoader, Function1 function1, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1008964066);
        int i2 = i | (gapComposer.changedInstance(cardAvatarSectionViewModel) ? 4 : 2) | (gapComposer.changedInstance(realImageLoader) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            PaddingValuesImpl m295PaddingValuesYgX7TsA$default = SpacerKt.m295PaddingValuesYgX7TsA$default(16.0f, RecyclerView.DECELERATION_RATE, 2);
            boolean z = false;
            Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(12.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
            boolean changedInstance = gapComposer.changedInstance(cardAvatarSectionViewModel);
            if ((i2 & 896) == 256) {
                z = true;
            }
            boolean changedInstance2 = changedInstance | z | gapComposer.changedInstance(realImageLoader);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new CardTransitionKt$$ExternalSyntheticLambda4(11, cardAvatarSectionViewModel, function1, realImageLoader);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            LazyDslKt.LazyRow(modifier, null, m295PaddingValuesYgX7TsA$default, arrangement$SpacedAligned, null, null, false, null, (Function1) rememberedValue, gapComposer, 24966, 490);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LifecycleKt$$ExternalSyntheticLambda0(cardAvatarSectionViewModel, i, realImageLoader, function1, modifier, 5);
        }
    }

    public static final void ShopHubResultsList(Modifier modifier, List list, RealImageLoader realImageLoader, Function1 function1, Function0 function0, Function1 function12, Composer composer, int i) {
        list.getClass();
        realImageLoader.getClass();
        function1.getClass();
        function0.getClass();
        function12.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(591269597);
        int i2 = i | (gapComposer.changed(modifier) ? 4 : 2) | (gapComposer.changedInstance(list) ? 32 : 16) | (gapComposer.changedInstance(realImageLoader) ? 256 : 128) | (gapComposer.changedInstance(function0) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changedInstance(function12) ? 131072 : 65536);
        if (gapComposer.shouldExecute(i2 & 1, (74899 & i2) != 74898)) {
            LazyGridState rememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 3, gapComposer);
            MutableInteractionSourceImpl mutableInteractionSourceImpl = rememberLazyGridState.internalInteractionSource;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            boolean changed = gapComposer.changed(mutableInteractionSourceImpl);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new VirtualCameraState$connect$2$1(mutableInteractionSourceImpl, mutableState, null, 24);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Updater.LaunchedEffect(gapComposer, mutableInteractionSourceImpl, (Function2) rememberedValue2);
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                function0.invoke();
            }
            GridCells.Fixed fixed = new GridCells.Fixed(12);
            PaddingValuesImpl m297PaddingValuesa9UjIt4$default = SpacerKt.m297PaddingValuesa9UjIt4$default(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 20.0f, 7);
            boolean changedInstance = gapComposer.changedInstance(list) | ((458752 & i2) == 131072) | gapComposer.changedInstance(realImageLoader);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue3 == neverEqualPolicy) {
                OpenSourceKt$$ExternalSyntheticLambda9 openSourceKt$$ExternalSyntheticLambda9 = new OpenSourceKt$$ExternalSyntheticLambda9(list, realImageLoader, function12, function1, 6);
                gapComposer.updateRememberedValue(openSourceKt$$ExternalSyntheticLambda9);
                rememberedValue3 = openSourceKt$$ExternalSyntheticLambda9;
            }
            LazyGridDslKt.LazyVerticalGrid(fixed, modifier, rememberLazyGridState, m297PaddingValuesa9UjIt4$default, null, null, null, false, null, (Function1) rememberedValue3, gapComposer, ((i2 << 3) & 112) | 3072, IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SwipeToDismissKt$$ExternalSyntheticLambda3(i, 24, modifier, list, realImageLoader, function1, function0, function12);
        }
    }

    public static final void ShopHubResultsList$trackEvent(Function1 function1, DirectoryViewEvent directoryViewEvent, DirectoryListItem.ItemViewModel itemViewModel) {
        if (directoryViewEvent instanceof DirectoryViewEvent$HeaderViewEvent$HeaderButtonClick) {
            DirectoryViewEvent$HeaderViewEvent$HeaderButtonClick directoryViewEvent$HeaderViewEvent$HeaderButtonClick = (DirectoryViewEvent$HeaderViewEvent$HeaderButtonClick) directoryViewEvent;
            function1.invoke(new SearchResultsViewEvent.HeaderItemClick(directoryViewEvent$HeaderViewEvent$HeaderButtonClick.actionUrl, directoryViewEvent$HeaderViewEvent$HeaderButtonClick.analyticsData));
            return;
        }
        if (directoryViewEvent instanceof DirectoryViewEvent.DirectoryItemViewEvent) {
            DirectoryViewEvent.DirectoryItemViewEvent directoryItemViewEvent = (DirectoryViewEvent.DirectoryItemViewEvent) directoryViewEvent;
            if (directoryItemViewEvent instanceof DirectoryViewEvent.DirectoryItemViewEvent.ActionClick) {
                DirectoryViewEvent.DirectoryItemViewEvent.ActionClick actionClick = (DirectoryViewEvent.DirectoryItemViewEvent.ActionClick) directoryViewEvent;
                String str = actionClick.actionUrl;
                if (str != null) {
                    function1.invoke(new SearchResultsViewEvent.ItemClick(str, actionClick.analyticsData, itemViewModel));
                    return;
                } else {
                    a$$ExternalSyntheticBUOutline0.m$3("ShopHub ActionClick actionUrl must not be null");
                    return;
                }
            }
            if (directoryItemViewEvent instanceof DirectoryViewEvent.DirectoryItemViewEvent.AnalyticsEvent) {
                function1.invoke(new SearchResultsViewEvent.ViewItem(((DirectoryViewEvent.DirectoryItemViewEvent.AnalyticsEvent) directoryViewEvent).data));
                return;
            }
            if (directoryItemViewEvent instanceof DirectoryViewEvent.DirectoryItemViewEvent.SectionView) {
                function1.invoke(new SearchResultsViewEvent.ViewSection(((DirectoryViewEvent.DirectoryItemViewEvent.SectionView) directoryViewEvent).data));
            } else if (directoryItemViewEvent instanceof DirectoryViewEvent.DirectoryItemViewEvent.MissingMetadataEvent) {
                function1.invoke(new SearchResultsViewEvent.MissingMetadataEvent(((DirectoryViewEvent.DirectoryItemViewEvent.MissingMetadataEvent) directoryViewEvent).metadata));
            } else {
                Drop$$ExternalSyntheticBUOutline0.m1m();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x019b  */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ShopMessage(DirectoryListItem.MessageSectionViewModel messageSectionViewModel, RealImageLoader realImageLoader, Modifier modifier, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer;
        Modifier.Companion companion;
        ?? r3;
        String str;
        GapComposer gapComposer2;
        realImageLoader.getClass();
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(655857044);
        int i2 = i | (gapComposer3.changedInstance(messageSectionViewModel) ? 4 : 2) | (gapComposer3.changedInstance(realImageLoader) ? 32 : 16) | (gapComposer3.changedInstance(function1) ? 2048 : 1024);
        if (gapComposer3.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer3, 48);
            int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, modifier);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer3.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer3.startReusableNode();
            if (gapComposer3.inserting) {
                gapComposer3.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer3.useNode();
            }
            Updater.m576setimpl(gapComposer3, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Image image = messageSectionViewModel.image;
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            if (image == null) {
                gapComposer3.startReplaceGroup(-1540721900);
                gapComposer3.end(false);
                companion = companion2;
                r3 = 0;
            } else {
                gapComposer3.startReplaceGroup(-1540721899);
                companion = companion2;
                r3 = 0;
                AsyncImageKt.m1441AsyncImagesKDTAoQ(ComposeUtilsKt.getThemedUrl(image, gapComposer3), Room.stringResource(gapComposer3, R.string.message_section_content_description), realImageLoader, SizeKt.m277height3ABfNKs(companion2, 125.0f), null, null, null, gapComposer3, ((i2 << 3) & 896) | 3072, 0, 4080);
                re$$ExternalSyntheticOutline0.m(companion, 16.0f, gapComposer3, false);
            }
            com.squareup.cash.directory_ui.views.ComposeUtilsKt.m3521MooncakeDiscoverTextsSOGCe0(null, messageSectionViewModel.title, MooncakeTheme.getTypography(gapComposer3).mainTitle, MooncakeTheme.getColors(gapComposer3).label, null, 0, 0, 3, null, gapComposer3, 0);
            SpacerKt.Spacer(gapComposer3, SizeKt.m277height3ABfNKs(companion, 4.0f));
            com.squareup.cash.directory_ui.views.ComposeUtilsKt.m3521MooncakeDiscoverTextsSOGCe0(null, messageSectionViewModel.subtitle, MooncakeTheme.getTypography(gapComposer3).smallBody, MooncakeTheme.getColors(gapComposer3).secondaryLabel, null, 0, 0, 3, null, gapComposer3, 0);
            GapComposer gapComposer4 = gapComposer3;
            Button button = messageSectionViewModel.actionButton;
            if (button == null) {
                gapComposer4.startReplaceGroup(-1539935492);
                gapComposer4.end(r3);
                gapComposer2 = gapComposer4;
            } else {
                re$$ExternalSyntheticOutline0.m(gapComposer4, -1539935491, companion, 24.0f, gapComposer4);
                FetcherKt fetcherKt = button.content;
                if (fetcherKt != null) {
                    Button$Content$Text button$Content$Text = fetcherKt instanceof Button$Content$Text ? (Button$Content$Text) fetcherKt : null;
                    if (button$Content$Text != null) {
                        str = button$Content$Text.value;
                        if (str != null) {
                            a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                            return;
                        }
                        boolean changedInstance = gapComposer4.changedInstance(button) | ((i2 & 7168) == 2048 ? true : r3);
                        Object rememberedValue = gapComposer4.rememberedValue();
                        if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                            rememberedValue = new ShopMessageKt$$ExternalSyntheticLambda0(function1, button, r3);
                            gapComposer4.updateRememberedValue(rememberedValue);
                        }
                        KeypadKt.m3640ButtonGFipHI0(str, (Function0) rememberedValue, SizeKt.wrapContentWidth$default(companion, null, 3), null, MooncakePillButton.Size.MEDIUM, MooncakePillButton.Style.PRIMARY, null, false, 0, null, null, gapComposer4, 221568, 0, 4040);
                        GapComposer gapComposer5 = gapComposer4;
                        gapComposer5.end(r3);
                        gapComposer2 = gapComposer5;
                    }
                }
                str = null;
                if (str != null) {
                }
            }
            gapComposer2.end(true);
            gapComposer = gapComposer2;
        } else {
            gapComposer3.skipToGroupEnd();
            gapComposer = gapComposer3;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LifecycleKt$$ExternalSyntheticLambda0(messageSectionViewModel, i, realImageLoader, modifier, function1, 6);
        }
    }

    public static final void TextRowSectionItem(final DirectoryListItem.ItemViewModel itemViewModel, final Function1 function1, final RealImageLoader realImageLoader, final Modifier modifier, TextStyle textStyle, int i, Composer composer, final int i2) {
        final TextStyle textStyle2;
        final int i3;
        int i4;
        TextStyle textStyle3;
        int i5;
        Text text;
        String str;
        GapComposer gapComposer;
        String str2;
        Painter painterResource;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1354013612);
        int i6 = i2 | (gapComposer2.changedInstance(itemViewModel) ? 4 : 2) | (gapComposer2.changedInstance(function1) ? 32 : 16) | (gapComposer2.changedInstance(realImageLoader) ? 256 : 128) | 204800;
        if (gapComposer2.shouldExecute(i6 & 1, (74899 & i6) != 74898)) {
            gapComposer2.startDefaults();
            if ((i2 & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                MooncakeTypography mooncakeTypography = (MooncakeTypography) gapComposer2.consume(MooncakeTypographyKt.LocalTypography);
                if (mooncakeTypography == null) {
                    mooncakeTypography = ((Boolean) gapComposer2.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
                }
                i4 = i6 & (-57345);
                textStyle3 = mooncakeTypography.smallBody;
                i5 = 1;
            } else {
                gapComposer2.skipToGroupEnd();
                textStyle3 = textStyle;
                i4 = i6 & (-57345);
                i5 = i;
            }
            gapComposer2.endDefaults();
            if (i5 < 1) {
                a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
                return;
            }
            DirectoryListItem.ItemViewModel.Text text2 = itemViewModel.title;
            if (text2 != null && (text = text2.text) != null && (str = text.text) != null) {
                String str3 = str.length() > 0 ? str : null;
                if (str3 != null) {
                    String themedUrl = ComposeUtilsKt.getThemedUrl(itemViewModel.icon, gapComposer2);
                    if (themedUrl != null) {
                        gapComposer2.startReplaceGroup(913752154);
                        gapComposer = gapComposer2;
                        str2 = str3;
                        painterResource = AsyncImageKt.m1448rememberAsyncImagePainter5jETZwI(themedUrl, realImageLoader, null, gapComposer, (i4 >> 3) & 112, 60);
                        gapComposer.end(false);
                    } else {
                        gapComposer = gapComposer2;
                        str2 = str3;
                        gapComposer.startReplaceGroup(913844038);
                        painterResource = Countries.painterResource(R.drawable.shop_search, 0, gapComposer);
                        gapComposer.end(false);
                    }
                    int mo229roundToPxR2X_6o = ((Density) gapComposer.consume(CompositionLocalsKt.LocalDensity)).mo229roundToPxR2X_6o(textStyle3.paragraphStyle.lineHeight);
                    Object rememberedValue = gapComposer.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer);
                    }
                    ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) rememberedValue;
                    boolean changed = gapComposer.changed(str2) | ((i4 & 112) == 32);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changed || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new P2PListViewKt$$ExternalSyntheticLambda13(function1, str2, 23);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier then = ImageKt.m183clickableoSLSa3U$default(companion, false, null, null, (Function0) rememberedValue2, 15).then(modifier);
                    boolean changed2 = gapComposer.changed(mo229roundToPxR2X_6o);
                    Object rememberedValue3 = gapComposer.rememberedValue();
                    if (changed2 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new CardUpsellKt$SmallUpsellCardContent$2$1(mo229roundToPxR2X_6o, parcelableSnapshotMutableIntState);
                        gapComposer.updateRememberedValue(rememberedValue3);
                    }
                    MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue3;
                    TextStyle textStyle4 = textStyle3;
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, then);
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
                    Updater.m576setimpl(gapComposer, measurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 12.0f, RecyclerView.DECELERATION_RATE, 11), 16.0f);
                    long j = MooncakeTheme.getColors(gapComposer).tertiaryLabel;
                    String str4 = str2;
                    GapComposer gapComposer3 = gapComposer;
                    ImageKt.Image(painterResource, null, m285size3ABfNKs, null, null, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer3, Painter.$stable | 432, 56);
                    boolean changed3 = gapComposer3.changed(mo229roundToPxR2X_6o);
                    Object rememberedValue4 = gapComposer3.rememberedValue();
                    if (changed3 || rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new MultiParagraph$$ExternalSyntheticLambda1(i5, mo229roundToPxR2X_6o, parcelableSnapshotMutableIntState);
                        gapComposer3.updateRememberedValue(rememberedValue4);
                    }
                    KeypadKt.m3651TextPdH14aY(2, 0, 0, 0, 196608, 0, 4042, 0L, (Composer) gapComposer3, (Modifier) null, textStyle4, (TextLineBalancing) null, str4, (Map) null, (Function1) rememberedValue4, false);
                    gapComposer2 = gapComposer3;
                    gapComposer2.end(true);
                    i3 = i5;
                    textStyle2 = textStyle4;
                }
            }
            RecomposeScopeImpl endRestartGroup = gapComposer2.endRestartGroup();
            if (endRestartGroup != null) {
                final int i7 = i5;
                final int i8 = 0;
                final TextStyle textStyle5 = textStyle3;
                endRestartGroup.block = new Function2(itemViewModel, function1, realImageLoader, modifier, textStyle5, i7, i2, i8) { // from class: com.squareup.cash.shopping.views.search.ShopHubResultsListKt$$ExternalSyntheticLambda22
                    public final /* synthetic */ int $r8$classId;
                    public final /* synthetic */ DirectoryListItem.ItemViewModel f$0;
                    public final /* synthetic */ Function1 f$1;
                    public final /* synthetic */ RealImageLoader f$2;
                    public final /* synthetic */ Modifier f$3;
                    public final /* synthetic */ TextStyle f$4;
                    public final /* synthetic */ int f$5;

                    {
                        this.$r8$classId = i8;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        switch (this.$r8$classId) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int updateChangedFlags = Updater.updateChangedFlags(3073);
                                ShopMessageKt.TextRowSectionItem(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, (Composer) obj, updateChangedFlags);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int updateChangedFlags2 = Updater.updateChangedFlags(3073);
                                ShopMessageKt.TextRowSectionItem(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, (Composer) obj, updateChangedFlags2);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                return;
            }
            return;
        }
        gapComposer2.skipToGroupEnd();
        textStyle2 = textStyle;
        i3 = i;
        RecomposeScopeImpl endRestartGroup2 = gapComposer2.endRestartGroup();
        if (endRestartGroup2 != null) {
            final int i9 = 1;
            endRestartGroup2.block = new Function2(itemViewModel, function1, realImageLoader, modifier, textStyle2, i3, i2, i9) { // from class: com.squareup.cash.shopping.views.search.ShopHubResultsListKt$$ExternalSyntheticLambda22
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ DirectoryListItem.ItemViewModel f$0;
                public final /* synthetic */ Function1 f$1;
                public final /* synthetic */ RealImageLoader f$2;
                public final /* synthetic */ Modifier f$3;
                public final /* synthetic */ TextStyle f$4;
                public final /* synthetic */ int f$5;

                {
                    this.$r8$classId = i9;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (this.$r8$classId) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int updateChangedFlags = Updater.updateChangedFlags(3073);
                            ShopMessageKt.TextRowSectionItem(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, (Composer) obj, updateChangedFlags);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int updateChangedFlags2 = Updater.updateChangedFlags(3073);
                            ShopMessageKt.TextRowSectionItem(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, (Composer) obj, updateChangedFlags2);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
