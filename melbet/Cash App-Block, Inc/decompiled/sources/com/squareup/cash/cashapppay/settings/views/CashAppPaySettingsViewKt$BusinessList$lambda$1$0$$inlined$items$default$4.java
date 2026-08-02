package com.squareup.cash.cashapppay.settings.views;

import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import coil3.RealImageLoader;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.mikepenz.markdown.model.MarkdownAnimationsKt;
import com.squareup.cash.cashapppay.settings.viewmodels.CashAppPaySettingsRowViewModel$BusinessViewModel;
import com.squareup.cash.investing.components.ArcadeBordersKt;
import com.squareup.cash.investing.components.categories.InvestingCategoryDetailKt;
import com.squareup.cash.investing.viewmodels.search.CategoryTile$CategoryCarousel;
import com.squareup.cash.investing.viewmodels.search.DisclosureModel;
import com.squareup.cash.investing.viewmodels.search.InvestingFilterResultViewModel;
import com.squareup.cash.investing.viewmodels.search.InvestingSearchRow;
import com.squareup.cash.investing.viewmodels.search.SearchResult;
import com.squareup.cash.investing.viewmodels.search.SearchRowHeader;
import com.squareup.cash.investing.viewmodels.search.SecurityCarousel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import net.idrnd.face.iad.capture.internal.b0;
import net.idrnd.face.iad.capture.internal.e4;
import net.idrnd.face.iad.capture.internal.m4;

/* loaded from: classes6.dex */
public final class CashAppPaySettingsViewKt$BusinessList$lambda$1$0$$inlined$items$default$4 implements Function4 {
    public final /* synthetic */ RealImageLoader $imageLoader$inlined;
    public final /* synthetic */ List $items;
    public final /* synthetic */ Function1 $onEvent$inlined;
    public final /* synthetic */ int $r8$classId = 0;

    public CashAppPaySettingsViewKt$BusinessList$lambda$1$0$$inlined$items$default$4(List list, RealImageLoader realImageLoader, Function1 function1) {
        this.$items = list;
        this.$imageLoader$inlined = realImageLoader;
        this.$onEvent$inlined = function1;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3 = this.$r8$classId;
        List list = this.$items;
        Function1 function1 = this.$onEvent$inlined;
        RealImageLoader realImageLoader = this.$imageLoader$inlined;
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
                    CashAppPaySettingsRowViewModel$BusinessViewModel cashAppPaySettingsRowViewModel$BusinessViewModel = (CashAppPaySettingsRowViewModel$BusinessViewModel) list.get(intValue);
                    gapComposer.startReplaceGroup(1402797321);
                    UnlinkResultViewKt.LinkedBusinessRow(cashAppPaySettingsRowViewModel$BusinessViewModel, realImageLoader, function1, gapComposer, 0);
                    gapComposer.end(false);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
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
                if ((intValue4 & 48) == 0) {
                    i2 |= ((GapComposer) composer2).changed(intValue3) ? 32 : 16;
                }
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
                    InvestingSearchRow investingSearchRow = (InvestingSearchRow) list.get(intValue3);
                    gapComposer2.startReplaceGroup(278803789);
                    if (!(investingSearchRow instanceof InvestingFilterResultViewModel)) {
                        if (!(investingSearchRow instanceof SearchResult)) {
                            if (!(investingSearchRow instanceof SearchRowHeader)) {
                                if (!(investingSearchRow instanceof SecurityCarousel)) {
                                    if (!(investingSearchRow instanceof CategoryTile$CategoryCarousel)) {
                                        if (!(investingSearchRow instanceof DisclosureModel)) {
                                            gapComposer2.startReplaceGroup(-545179081);
                                            gapComposer2.end(false);
                                            OptionalProvider$$ExternalSyntheticLambda0.m$1(investingSearchRow, "Unexpected searchRow type ");
                                            break;
                                        } else {
                                            gapComposer2.startReplaceGroup(-545181087);
                                            b0.InvestingSearchDisclosure((DisclosureModel) investingSearchRow, function1, gapComposer2, 0);
                                            gapComposer2.end(false);
                                        }
                                    } else {
                                        gapComposer2.startReplaceGroup(-545184108);
                                        MarkdownAnimationsKt.InvestingSearchCategoryCarousel((CategoryTile$CategoryCarousel) investingSearchRow, function1, realImageLoader, gapComposer2, 0);
                                        gapComposer2.end(false);
                                    }
                                } else {
                                    gapComposer2.startReplaceGroup(-545187180);
                                    m4.InvestingSearchSecurityCarousel((SecurityCarousel) investingSearchRow, function1, realImageLoader, gapComposer2, 0);
                                    gapComposer2.end(false);
                                }
                            } else {
                                gapComposer2.startReplaceGroup(-545189384);
                                e4.InvestingSearchHeaderView((SearchRowHeader) investingSearchRow, gapComposer2, 0);
                                gapComposer2.end(false);
                            }
                        } else {
                            gapComposer2.startReplaceGroup(-545192148);
                            ArcadeBordersKt.InvestingSearchStockRow((SearchResult) investingSearchRow, function1, realImageLoader, gapComposer2, 0);
                            gapComposer2.end(false);
                        }
                    } else {
                        gapComposer2.startReplaceGroup(-545194185);
                        InvestingCategoryDetailKt.FilterResultRow((InvestingFilterResultViewModel) investingSearchRow, function1, gapComposer2, 0);
                        gapComposer2.end(false);
                    }
                    gapComposer2.end(false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public CashAppPaySettingsViewKt$BusinessList$lambda$1$0$$inlined$items$default$4(List list, Function1 function1, RealImageLoader realImageLoader) {
        this.$items = list;
        this.$onEvent$inlined = function1;
        this.$imageLoader$inlined = realImageLoader;
    }
}
