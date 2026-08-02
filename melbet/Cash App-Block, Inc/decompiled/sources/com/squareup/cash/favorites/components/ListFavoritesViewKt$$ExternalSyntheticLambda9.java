package com.squareup.cash.favorites.components;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.card.onboarding.CardModelView$1$3$4$2;
import com.squareup.cash.directory_ui.views.SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$3;
import com.squareup.cash.favorites.components.AddFavoritesViewKt;
import com.squareup.cash.favorites.viewmodels.FavoritePersonViewModel;
import com.squareup.cash.music.views.MusicViewKt$LoadedMusicContent$lambda$1$0$0$0$$inlined$items$default$3;
import com.squareup.cash.support.viewmodels.SupportSearchViewModel;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;

/* loaded from: classes7.dex */
public final /* synthetic */ class ListFavoritesViewKt$$ExternalSyntheticLambda9 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ List f$0;
    public final /* synthetic */ Function1 f$1;
    public final /* synthetic */ Function1 f$2;

    public /* synthetic */ ListFavoritesViewKt$$ExternalSyntheticLambda9(List list, Function1 function1, Function1 function12, int i) {
        this.$r8$classId = i;
        this.f$0 = list;
        this.f$1 = function1;
        this.f$2 = function12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        final Function1 function1 = this.f$2;
        final Function1 function12 = this.f$1;
        final List list = this.f$0;
        final int i2 = 1;
        LazyListScope lazyListScope = (LazyListScope) obj;
        switch (i) {
            case 0:
                lazyListScope.getClass();
                lazyListScope.items(list.size(), null, new SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$3(list, 20), new ComposableLambdaImpl(new Function4() { // from class: com.squareup.cash.support.views.search.SupportSearchViewKt$Results$lambda$1$0$$inlined$items$default$4
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i3;
                        int i4;
                        int i5 = i2;
                        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                        List list2 = list;
                        final Function1 function13 = function12;
                        Object obj6 = Composer.Companion.Empty;
                        final Function1 function14 = function1;
                        final int i6 = 1;
                        final int i7 = 0;
                        switch (i5) {
                            case 0:
                                LazyItemScopeImpl lazyItemScopeImpl = (LazyItemScopeImpl) obj2;
                                int intValue = ((Number) obj3).intValue();
                                Composer composer = (Composer) obj4;
                                int intValue2 = ((Number) obj5).intValue();
                                if ((intValue2 & 6) == 0) {
                                    i3 = intValue2 | (((GapComposer) composer).changed(lazyItemScopeImpl) ? 4 : 2);
                                } else {
                                    i3 = intValue2;
                                }
                                if ((intValue2 & 48) == 0) {
                                    i3 |= ((GapComposer) composer).changed(intValue) ? 32 : 16;
                                }
                                GapComposer gapComposer = (GapComposer) composer;
                                if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
                                    SupportSearchViewModel.SearchResultViewModel searchResultViewModel = (SupportSearchViewModel.SearchResultViewModel) list2.get(intValue);
                                    gapComposer.startReplaceGroup(-1045435018);
                                    if (searchResultViewModel instanceof SupportSearchViewModel.SearchResultViewModel.Header) {
                                        gapComposer.startReplaceGroup(-726459825);
                                        SupportSearchViewKt.HeaderRow(48, gapComposer, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), ((SupportSearchViewModel.SearchResultViewModel.Header) searchResultViewModel).header);
                                        gapComposer.end(false);
                                    } else if (searchResultViewModel instanceof SupportSearchViewModel.SearchResultViewModel.Item) {
                                        gapComposer.startReplaceGroup(-1045309810);
                                        SupportSearchViewModel.SearchResultViewModel.Item item = (SupportSearchViewModel.SearchResultViewModel.Item) searchResultViewModel;
                                        SupportSearchViewModel.HighlightedString highlightedString = item.title;
                                        SupportSearchViewModel.HighlightedString highlightedString2 = item.previewText;
                                        SupportSearchViewModel.Icon icon = item.icon;
                                        Icons arcadeIcon = icon != null ? SupportSearchViewKt.getArcadeIcon(icon) : null;
                                        boolean changedInstance = gapComposer.changedInstance(searchResultViewModel) | gapComposer.changed(function13);
                                        Object rememberedValue = gapComposer.rememberedValue();
                                        if (changedInstance || rememberedValue == obj6) {
                                            rememberedValue = new CardModelView$1$3$4$2(23, function13, item);
                                            gapComposer.updateRememberedValue(rememberedValue);
                                        }
                                        SupportSearchViewKt.ItemRow(highlightedString, highlightedString2, arcadeIcon, false, (Function0) rememberedValue, gapComposer, 0, 8);
                                        gapComposer.end(false);
                                    } else if (searchResultViewModel instanceof SupportSearchViewModel.SearchResultViewModel.ContactOption) {
                                        gapComposer.startReplaceGroup(-726449866);
                                        SupportSearchViewModel.SearchResultViewModel.ContactOption contactOption = (SupportSearchViewModel.SearchResultViewModel.ContactOption) searchResultViewModel;
                                        boolean changedInstance2 = gapComposer.changedInstance(searchResultViewModel) | gapComposer.changed(function14);
                                        Object rememberedValue2 = gapComposer.rememberedValue();
                                        if (changedInstance2 || rememberedValue2 == obj6) {
                                            rememberedValue2 = new CardModelView$1$3$4$2(24, function14, contactOption);
                                            gapComposer.updateRememberedValue(rememberedValue2);
                                        }
                                        SupportSearchViewKt.ContactOption(contactOption, (Function0) rememberedValue2, gapComposer, 0);
                                        gapComposer.end(false);
                                    } else {
                                        if (!(searchResultViewModel instanceof SupportSearchViewModel.SearchResultViewModel.Divider)) {
                                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -726460371, false);
                                        }
                                        gapComposer.startReplaceGroup(-726446398);
                                        ModalKt.HorizontalDivider(0, 0, gapComposer, SpacerKt.m301paddingqDBjuR0(companion, 16.0f, 16.0f, 16.0f, 32.0f));
                                        gapComposer.end(false);
                                    }
                                    gapComposer.end(false);
                                } else {
                                    gapComposer.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            default:
                                LazyItemScopeImpl lazyItemScopeImpl2 = (LazyItemScopeImpl) obj2;
                                int intValue3 = ((Number) obj3).intValue();
                                Composer composer2 = (Composer) obj4;
                                int intValue4 = ((Number) obj5).intValue();
                                if ((intValue4 & 6) == 0) {
                                    i4 = intValue4 | (((GapComposer) composer2).changed(lazyItemScopeImpl2) ? 4 : 2);
                                } else {
                                    i4 = intValue4;
                                }
                                if ((intValue4 & 48) == 0) {
                                    i4 |= ((GapComposer) composer2).changed(intValue3) ? 32 : 16;
                                }
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(i4 & 1, (i4 & 147) != 146)) {
                                    final FavoritePersonViewModel favoritePersonViewModel = (FavoritePersonViewModel) list2.get(intValue3);
                                    gapComposer2.startReplaceGroup(742618036);
                                    Modifier animateItem$default = LazyItemScopeImpl.animateItem$default(lazyItemScopeImpl2, companion);
                                    Color color = favoritePersonViewModel.accentColor;
                                    Image image = favoritePersonViewModel.photoImage;
                                    String str = favoritePersonViewModel.title;
                                    String str2 = favoritePersonViewModel.subtitle;
                                    String str3 = favoritePersonViewModel.monogram;
                                    Icons icons = favoritePersonViewModel.badgeIcon;
                                    boolean z = favoritePersonViewModel.isRequestInFlight;
                                    boolean changed = gapComposer2.changed(function13) | gapComposer2.changedInstance(favoritePersonViewModel);
                                    Object rememberedValue3 = gapComposer2.rememberedValue();
                                    if (changed || rememberedValue3 == obj6) {
                                        rememberedValue3 = new Function0() { // from class: com.squareup.cash.favorites.components.ListFavoritesViewKt$FavoritesList$1$1$1$1$1$1
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i8 = i7;
                                                FavoritePersonViewModel favoritePersonViewModel2 = favoritePersonViewModel;
                                                Function1 function15 = function13;
                                                switch (i8) {
                                                    case 0:
                                                        function15.invoke(favoritePersonViewModel2);
                                                        break;
                                                    default:
                                                        function15.invoke(favoritePersonViewModel2);
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        gapComposer2.updateRememberedValue(rememberedValue3);
                                    }
                                    Function0 function0 = (Function0) rememberedValue3;
                                    boolean changed2 = gapComposer2.changed(function14) | gapComposer2.changedInstance(favoritePersonViewModel);
                                    Object rememberedValue4 = gapComposer2.rememberedValue();
                                    if (changed2 || rememberedValue4 == obj6) {
                                        rememberedValue4 = new Function0() { // from class: com.squareup.cash.favorites.components.ListFavoritesViewKt$FavoritesList$1$1$1$1$1$1
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i8 = i6;
                                                FavoritePersonViewModel favoritePersonViewModel2 = favoritePersonViewModel;
                                                Function1 function15 = function14;
                                                switch (i8) {
                                                    case 0:
                                                        function15.invoke(favoritePersonViewModel2);
                                                        break;
                                                    default:
                                                        function15.invoke(favoritePersonViewModel2);
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        gapComposer2.updateRememberedValue(rememberedValue4);
                                    }
                                    AddFavoritesViewKt.FavoritePersonRowItem(function0, (Function0) rememberedValue4, animateItem$default, color, image, str, str2, str3, icons, z, gapComposer2, 0);
                                    gapComposer2.end(false);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                        }
                    }
                }, true, 802480018));
                break;
            default:
                lazyListScope.getClass();
                final int i3 = 0;
                lazyListScope.items(list.size(), null, new MusicViewKt$LoadedMusicContent$lambda$1$0$0$0$$inlined$items$default$3(list, 14), new ComposableLambdaImpl(new Function4() { // from class: com.squareup.cash.support.views.search.SupportSearchViewKt$Results$lambda$1$0$$inlined$items$default$4
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i32;
                        int i4;
                        int i5 = i3;
                        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                        List list2 = list;
                        final Function1 function13 = function12;
                        Object obj6 = Composer.Companion.Empty;
                        final Function1 function14 = function1;
                        final int i6 = 1;
                        final int i7 = 0;
                        switch (i5) {
                            case 0:
                                LazyItemScopeImpl lazyItemScopeImpl = (LazyItemScopeImpl) obj2;
                                int intValue = ((Number) obj3).intValue();
                                Composer composer = (Composer) obj4;
                                int intValue2 = ((Number) obj5).intValue();
                                if ((intValue2 & 6) == 0) {
                                    i32 = intValue2 | (((GapComposer) composer).changed(lazyItemScopeImpl) ? 4 : 2);
                                } else {
                                    i32 = intValue2;
                                }
                                if ((intValue2 & 48) == 0) {
                                    i32 |= ((GapComposer) composer).changed(intValue) ? 32 : 16;
                                }
                                GapComposer gapComposer = (GapComposer) composer;
                                if (gapComposer.shouldExecute(i32 & 1, (i32 & 147) != 146)) {
                                    SupportSearchViewModel.SearchResultViewModel searchResultViewModel = (SupportSearchViewModel.SearchResultViewModel) list2.get(intValue);
                                    gapComposer.startReplaceGroup(-1045435018);
                                    if (searchResultViewModel instanceof SupportSearchViewModel.SearchResultViewModel.Header) {
                                        gapComposer.startReplaceGroup(-726459825);
                                        SupportSearchViewKt.HeaderRow(48, gapComposer, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), ((SupportSearchViewModel.SearchResultViewModel.Header) searchResultViewModel).header);
                                        gapComposer.end(false);
                                    } else if (searchResultViewModel instanceof SupportSearchViewModel.SearchResultViewModel.Item) {
                                        gapComposer.startReplaceGroup(-1045309810);
                                        SupportSearchViewModel.SearchResultViewModel.Item item = (SupportSearchViewModel.SearchResultViewModel.Item) searchResultViewModel;
                                        SupportSearchViewModel.HighlightedString highlightedString = item.title;
                                        SupportSearchViewModel.HighlightedString highlightedString2 = item.previewText;
                                        SupportSearchViewModel.Icon icon = item.icon;
                                        Icons arcadeIcon = icon != null ? SupportSearchViewKt.getArcadeIcon(icon) : null;
                                        boolean changedInstance = gapComposer.changedInstance(searchResultViewModel) | gapComposer.changed(function13);
                                        Object rememberedValue = gapComposer.rememberedValue();
                                        if (changedInstance || rememberedValue == obj6) {
                                            rememberedValue = new CardModelView$1$3$4$2(23, function13, item);
                                            gapComposer.updateRememberedValue(rememberedValue);
                                        }
                                        SupportSearchViewKt.ItemRow(highlightedString, highlightedString2, arcadeIcon, false, (Function0) rememberedValue, gapComposer, 0, 8);
                                        gapComposer.end(false);
                                    } else if (searchResultViewModel instanceof SupportSearchViewModel.SearchResultViewModel.ContactOption) {
                                        gapComposer.startReplaceGroup(-726449866);
                                        SupportSearchViewModel.SearchResultViewModel.ContactOption contactOption = (SupportSearchViewModel.SearchResultViewModel.ContactOption) searchResultViewModel;
                                        boolean changedInstance2 = gapComposer.changedInstance(searchResultViewModel) | gapComposer.changed(function14);
                                        Object rememberedValue2 = gapComposer.rememberedValue();
                                        if (changedInstance2 || rememberedValue2 == obj6) {
                                            rememberedValue2 = new CardModelView$1$3$4$2(24, function14, contactOption);
                                            gapComposer.updateRememberedValue(rememberedValue2);
                                        }
                                        SupportSearchViewKt.ContactOption(contactOption, (Function0) rememberedValue2, gapComposer, 0);
                                        gapComposer.end(false);
                                    } else {
                                        if (!(searchResultViewModel instanceof SupportSearchViewModel.SearchResultViewModel.Divider)) {
                                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -726460371, false);
                                        }
                                        gapComposer.startReplaceGroup(-726446398);
                                        ModalKt.HorizontalDivider(0, 0, gapComposer, SpacerKt.m301paddingqDBjuR0(companion, 16.0f, 16.0f, 16.0f, 32.0f));
                                        gapComposer.end(false);
                                    }
                                    gapComposer.end(false);
                                } else {
                                    gapComposer.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            default:
                                LazyItemScopeImpl lazyItemScopeImpl2 = (LazyItemScopeImpl) obj2;
                                int intValue3 = ((Number) obj3).intValue();
                                Composer composer2 = (Composer) obj4;
                                int intValue4 = ((Number) obj5).intValue();
                                if ((intValue4 & 6) == 0) {
                                    i4 = intValue4 | (((GapComposer) composer2).changed(lazyItemScopeImpl2) ? 4 : 2);
                                } else {
                                    i4 = intValue4;
                                }
                                if ((intValue4 & 48) == 0) {
                                    i4 |= ((GapComposer) composer2).changed(intValue3) ? 32 : 16;
                                }
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(i4 & 1, (i4 & 147) != 146)) {
                                    final FavoritePersonViewModel favoritePersonViewModel = (FavoritePersonViewModel) list2.get(intValue3);
                                    gapComposer2.startReplaceGroup(742618036);
                                    Modifier animateItem$default = LazyItemScopeImpl.animateItem$default(lazyItemScopeImpl2, companion);
                                    Color color = favoritePersonViewModel.accentColor;
                                    Image image = favoritePersonViewModel.photoImage;
                                    String str = favoritePersonViewModel.title;
                                    String str2 = favoritePersonViewModel.subtitle;
                                    String str3 = favoritePersonViewModel.monogram;
                                    Icons icons = favoritePersonViewModel.badgeIcon;
                                    boolean z = favoritePersonViewModel.isRequestInFlight;
                                    boolean changed = gapComposer2.changed(function13) | gapComposer2.changedInstance(favoritePersonViewModel);
                                    Object rememberedValue3 = gapComposer2.rememberedValue();
                                    if (changed || rememberedValue3 == obj6) {
                                        rememberedValue3 = new Function0() { // from class: com.squareup.cash.favorites.components.ListFavoritesViewKt$FavoritesList$1$1$1$1$1$1
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i8 = i7;
                                                FavoritePersonViewModel favoritePersonViewModel2 = favoritePersonViewModel;
                                                Function1 function15 = function13;
                                                switch (i8) {
                                                    case 0:
                                                        function15.invoke(favoritePersonViewModel2);
                                                        break;
                                                    default:
                                                        function15.invoke(favoritePersonViewModel2);
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        gapComposer2.updateRememberedValue(rememberedValue3);
                                    }
                                    Function0 function0 = (Function0) rememberedValue3;
                                    boolean changed2 = gapComposer2.changed(function14) | gapComposer2.changedInstance(favoritePersonViewModel);
                                    Object rememberedValue4 = gapComposer2.rememberedValue();
                                    if (changed2 || rememberedValue4 == obj6) {
                                        rememberedValue4 = new Function0() { // from class: com.squareup.cash.favorites.components.ListFavoritesViewKt$FavoritesList$1$1$1$1$1$1
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i8 = i6;
                                                FavoritePersonViewModel favoritePersonViewModel2 = favoritePersonViewModel;
                                                Function1 function15 = function14;
                                                switch (i8) {
                                                    case 0:
                                                        function15.invoke(favoritePersonViewModel2);
                                                        break;
                                                    default:
                                                        function15.invoke(favoritePersonViewModel2);
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        gapComposer2.updateRememberedValue(rememberedValue4);
                                    }
                                    AddFavoritesViewKt.FavoritePersonRowItem(function0, (Function0) rememberedValue4, animateItem$default, color, image, str, str2, str3, icons, z, gapComposer2, 0);
                                    gapComposer2.end(false);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                        }
                    }
                }, true, 802480018));
                break;
        }
        return Unit.INSTANCE;
    }
}
