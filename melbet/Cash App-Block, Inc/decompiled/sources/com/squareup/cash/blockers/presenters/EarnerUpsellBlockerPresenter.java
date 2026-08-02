package com.squareup.cash.blockers.presenters;

import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.flow.RealMultiBlockerFacilitator;
import com.squareup.cash.blockers.flow.api.MultiBlockerFacilitator$Resolver;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.EarnerUpsellBlockerViewModel;
import com.squareup.cash.card.onboarding.InteractiveCardView$flingTo$1;
import com.squareup.cash.common.messaging.screens.FailureMessageBlockerScreen;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.money.elements.BookletTile;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.app.SubmitFormRequest;
import com.squareup.protos.franklin.blockers.EarnerUpsellBlocker;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.util.cash.StringsKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class EarnerUpsellBlockerPresenter implements MoleculePresenter {
    public final BlockersScreens.EarnerUpsellBlockerScreenArgs args;
    public final BlockersDataNavigator blockersDataNavigator;
    public final EarnerOnboardingAnalytics earnerOnboardingAnalytics;
    public final BetterNavigator.ScreenNavigator navigator;
    public final MultiBlockerFacilitator$Resolver resolver;

    /* loaded from: classes7.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BookletTile.ContentType.values().length];
            try {
                iArr[BookletTile.ContentType.CONTENT_TYPE_GRID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BookletTile.ContentType.CONTENT_TYPE_STATIC_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BookletTile.ContentType.CONTENT_TYPE_UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public EarnerUpsellBlockerPresenter(BlockersDataNavigator blockersDataNavigator, RealMultiBlockerFacilitator realMultiBlockerFacilitator, EarnerOnboardingAnalytics earnerOnboardingAnalytics, BlockersScreens.EarnerUpsellBlockerScreenArgs earnerUpsellBlockerScreenArgs, BetterNavigator.ScreenNavigator screenNavigator) {
        this.blockersDataNavigator = blockersDataNavigator;
        this.earnerOnboardingAnalytics = earnerOnboardingAnalytics;
        this.args = earnerUpsellBlockerScreenArgs;
        this.navigator = screenNavigator;
        this.resolver = realMultiBlockerFacilitator.getResolver(screenNavigator, earnerUpsellBlockerScreenArgs);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$submitUpsellAndAdvance(EarnerUpsellBlockerPresenter earnerUpsellBlockerPresenter, ContinuationImpl continuationImpl) {
        EarnerUpsellBlockerPresenter$submitUpsellAndAdvance$1 earnerUpsellBlockerPresenter$submitUpsellAndAdvance$1;
        int i;
        ApiResult apiResult;
        BetterNavigator.ScreenNavigator screenNavigator = earnerUpsellBlockerPresenter.navigator;
        BlockersScreens.EarnerUpsellBlockerScreenArgs earnerUpsellBlockerScreenArgs = earnerUpsellBlockerPresenter.args;
        if (continuationImpl instanceof EarnerUpsellBlockerPresenter$submitUpsellAndAdvance$1) {
            earnerUpsellBlockerPresenter$submitUpsellAndAdvance$1 = (EarnerUpsellBlockerPresenter$submitUpsellAndAdvance$1) continuationImpl;
            int i2 = earnerUpsellBlockerPresenter$submitUpsellAndAdvance$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                earnerUpsellBlockerPresenter$submitUpsellAndAdvance$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = earnerUpsellBlockerPresenter$submitUpsellAndAdvance$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = earnerUpsellBlockerPresenter$submitUpsellAndAdvance$1.label;
                String str = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    MultiBlockerFacilitator$Resolver multiBlockerFacilitator$Resolver = earnerUpsellBlockerPresenter.resolver;
                    SubmitFormRequest submitFormRequest = new SubmitFormRequest(earnerUpsellBlockerScreenArgs.getBlockersData().requestContext, earnerUpsellBlockerScreenArgs.getBlockersData().requestContext.blocker_descriptor_id, EmptyList.INSTANCE, 8);
                    earnerUpsellBlockerPresenter$submitUpsellAndAdvance$1.label = 1;
                    obj = multiBlockerFacilitator$Resolver.resolve(submitFormRequest, earnerUpsellBlockerPresenter$submitUpsellAndAdvance$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (apiResult != null) {
                    if (apiResult instanceof ApiResult.Success) {
                        BlockersData blockersData = earnerUpsellBlockerScreenArgs.getBlockersData();
                        ResponseContext responseContext = (ResponseContext) ((ApiResult.Success) apiResult).response;
                        Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                        screenNavigator.goTo(earnerUpsellBlockerPresenter.blockersDataNavigator.getNext(earnerUpsellBlockerScreenArgs, blockersData.updateFromResponseContext(responseContext, false)));
                    } else {
                        if (!(apiResult instanceof ApiResult.Failure)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        screenNavigator.goTo(new FailureMessageBlockerScreen(earnerUpsellBlockerScreenArgs.getBlockersData(), str, str, 6));
                    }
                }
                return Unit.INSTANCE;
            }
        }
        earnerUpsellBlockerPresenter$submitUpsellAndAdvance$1 = new EarnerUpsellBlockerPresenter$submitUpsellAndAdvance$1(earnerUpsellBlockerPresenter, continuationImpl);
        Object obj2 = earnerUpsellBlockerPresenter$submitUpsellAndAdvance$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = earnerUpsellBlockerPresenter$submitUpsellAndAdvance$1.label;
        String str2 = null;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult != null) {
        }
        return Unit.INSTANCE;
    }

    public static EarnerUpsellBlockerViewModel.BookletTileContent.Grid toTileContent(BookletTile.GridContent gridContent) {
        LocalizedString localizedString = gridContent.title_text;
        String translated = localizedString != null ? StringsKt.translated(localizedString) : null;
        if (translated == null) {
            translated = "";
        }
        List<BookletTile.GridContent.GridItem> list = gridContent.grid_items;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (BookletTile.GridContent.GridItem gridItem : list) {
            LocalizedString localizedString2 = gridItem.title_text;
            String translated2 = localizedString2 != null ? StringsKt.translated(localizedString2) : null;
            if (translated2 == null) {
                translated2 = "";
            }
            LocalizedString localizedString3 = gridItem.detail_text;
            String translated3 = localizedString3 != null ? StringsKt.translated(localizedString3) : null;
            if (translated3 == null) {
                translated3 = "";
            }
            arrayList.add(new EarnerUpsellBlockerViewModel.BookletTileContent.Grid.Item(gridItem.icon, translated2, translated3));
        }
        return new EarnerUpsellBlockerViewModel.BookletTileContent.Grid(translated, arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00e4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008e A[SYNTHETIC] */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        EarnerUpsellBlockerViewModel.BookletTileContent tileContent;
        EarnerUpsellBlockerViewModel.BookletTileContent tileContent2;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(137528154);
        BlockersScreens.EarnerUpsellBlockerScreenArgs earnerUpsellBlockerScreenArgs = this.args;
        String str = earnerUpsellBlockerScreenArgs.getBlockersData().flowToken;
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this) | gapComposer.changed(str);
        Object rememberedValue = gapComposer.rememberedValue();
        Continuation continuation = null;
        if (changedInstance || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new InteractiveCardView$flingTo$1.AnonymousClass2(this, str, continuation, 7);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
        Updater.LaunchedEffect(gapComposer, flow, new SetNamePresenter$models$1$1$1(flow, continuation, this, str, 15));
        EarnerUpsellBlocker blocker = earnerUpsellBlockerScreenArgs.getBlocker();
        Image image = blocker.image;
        String str2 = blocker.title;
        String str3 = str2 == null ? "" : str2;
        List<EarnerUpsellBlocker.BulletPoint> list = blocker.bullet_points;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (EarnerUpsellBlocker.BulletPoint bulletPoint : list) {
            Icon icon = bulletPoint.arcade_icon;
            String str4 = bulletPoint.title;
            if (str4 == null) {
                str4 = "";
            }
            arrayList.add(new EarnerUpsellBlockerViewModel.SummaryItem(icon, str4));
        }
        List<BookletTile> list2 = blocker.tiles;
        ArrayList arrayList2 = new ArrayList();
        for (BookletTile bookletTile : list2) {
            BookletTile.ContentType contentType = bookletTile.content_type;
            int i2 = contentType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[contentType.ordinal()];
            if (i2 != -1) {
                if (i2 == 1) {
                    BookletTile.GridContent gridContent = bookletTile.grid_content;
                    if (gridContent != null) {
                        tileContent = toTileContent(gridContent);
                    }
                    tileContent = null;
                } else if (i2 == 2) {
                    BookletTile.StaticContent staticContent = bookletTile.static_content;
                    if (staticContent != null) {
                        tileContent = toTileContent(staticContent);
                    }
                    tileContent = null;
                } else if (i2 != 3) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                if (tileContent == null) {
                    arrayList2.add(tileContent);
                }
            }
            BookletTile.StaticContent staticContent2 = bookletTile.static_content;
            if (staticContent2 == null || (tileContent2 = toTileContent(staticContent2)) == null) {
                BookletTile.GridContent gridContent2 = bookletTile.grid_content;
                if (gridContent2 != null) {
                    tileContent = toTileContent(gridContent2);
                }
                tileContent = null;
            } else {
                tileContent = tileContent2;
            }
            if (tileContent == null) {
            }
        }
        String str5 = blocker.primary_button_text;
        EarnerUpsellBlockerViewModel earnerUpsellBlockerViewModel = new EarnerUpsellBlockerViewModel(image, str3, arrayList, arrayList2, str5 == null ? "" : str5);
        gapComposer.end(false);
        return earnerUpsellBlockerViewModel;
    }

    public static EarnerUpsellBlockerViewModel.BookletTileContent.Tile toTileContent(BookletTile.StaticContent staticContent) {
        Image image = staticContent.hero_image;
        if (image == null) {
            return null;
        }
        LocalizedString localizedString = staticContent.title_text;
        String translated = localizedString != null ? StringsKt.translated(localizedString) : null;
        if (translated == null) {
            translated = "";
        }
        LocalizedString localizedString2 = staticContent.detail_text;
        String translated2 = localizedString2 != null ? StringsKt.translated(localizedString2) : null;
        return new EarnerUpsellBlockerViewModel.BookletTileContent.Tile(image, translated, translated2 != null ? translated2 : "");
    }
}
