package com.squareup.cash.family.safetyhub.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ScreenScaffoldKt;
import com.squareup.cash.arcade.components.ScrollingScaffoldContentScope;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.booklet.ui.BookletGridKt;
import com.squareup.cash.db2.recipients.RecipientQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.family.safetyhub.viewmodels.SafetyHubViewEvent;
import com.squareup.cash.family.safetyhub.viewmodels.SafetyHubViewModel;
import com.squareup.cash.family.safetyhub.views.SafetyHubViewKt;
import com.squareup.cash.history.views.ErrorView$$ExternalSyntheticLambda3;
import com.squareup.cash.nfc.views.NfcNotAvailableKt$$ExternalSyntheticLambda1;
import com.squareup.protos.cash.aegis.core.SafetyEducationHubTile;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.money.elements.BookletTile;
import com.squareup.protos.cash.ui.Image;
import com.squareup.util.cash.StringsKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public abstract class SafetyHubViewKt {

    /* loaded from: classes7.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BookletTile.ContentType.values().length];
            try {
                iArr[BookletTile.ContentType.CONTENT_TYPE_STATIC_CONTENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BookletTile.ContentType.CONTENT_TYPE_GRID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BookletTile.ContentType.CONTENT_TYPE_UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void SafetyHubLoadedView(final SafetyHubViewModel.Loaded loaded, final Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-675087878);
        int i2 = (gapComposer.changedInstance(loaded) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        final int i3 = 0;
        final int i4 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier fillMaxSize = SizeKt.fillMaxSize(SpacerKt.systemBarsPadding(Modifier.Companion.$$INSTANCE), 1.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            ScreenScaffoldKt.ScreenScaffoldColumn(ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape), null, null, Expect_jvmKt.rememberComposableLambda(532707106, new Function3() { // from class: com.squareup.cash.family.safetyhub.views.SafetyHubViewKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5 = i3;
                    Object obj4 = Composer.Companion.Empty;
                    final Function1 function12 = function1;
                    SafetyHubViewModel.Loaded loaded2 = loaded;
                    final int i6 = 1;
                    final int i7 = 0;
                    switch (i5) {
                        case 0:
                            Composer composer2 = (Composer) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            ((ColumnScope) obj).getClass();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                LocalizedString localizedString = loaded2.hub.navigation_title;
                                String translated = localizedString != null ? StringsKt.translated(localizedString) : null;
                                NavigationType navigationType = NavigationType.CLOSE;
                                boolean changed = gapComposer2.changed(function12);
                                Object rememberedValue = gapComposer2.rememberedValue();
                                if (changed || rememberedValue == obj4) {
                                    rememberedValue = new SafetyHubViewKt$$ExternalSyntheticLambda9(0, function12);
                                    gapComposer2.updateRememberedValue(rememberedValue);
                                }
                                DBUtil.TitleBarSub(translated, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer2, 48, 108);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        default:
                            Composer composer3 = (Composer) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            ((ScrollingScaffoldContentScope) obj).getClass();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                ((DefaultSizes) gapComposer3.consume(ArcadeThemeKt.LocalSizes)).getClass();
                                DefaultSizes.spacing.getClass();
                                Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(Modifier.Companion.$$INSTANCE, 16.0f);
                                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer3, 0);
                                int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, m298padding3ABfNKs);
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
                                DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer3, null);
                                MultiColorPageTitleKt.MultiColorPageTitle(0, gapComposer3, loaded2.hub.colored_title_segments);
                                DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer3, null);
                                gapComposer3.startReplaceGroup(-1882949001);
                                int i8 = 0;
                                for (Object obj5 : loaded2.hub.tiles) {
                                    int i9 = i8 + 1;
                                    if (i8 < 0) {
                                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                                        throw null;
                                    }
                                    final SafetyEducationHubTile safetyEducationHubTile = (SafetyEducationHubTile) obj5;
                                    if (i8 > 0) {
                                        gapComposer3.startReplaceGroup(-2007859303);
                                        DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer3, null);
                                        gapComposer3.end(false);
                                    } else {
                                        gapComposer3.startReplaceGroup(-2007812214);
                                        gapComposer3.end(false);
                                    }
                                    BookletTile bookletTile = safetyEducationHubTile.tile;
                                    BookletTile.ContentType contentType = bookletTile != null ? bookletTile.content_type : null;
                                    int i10 = contentType == null ? -1 : SafetyHubViewKt.WhenMappings.$EnumSwitchMapping$0[contentType.ordinal()];
                                    if (i10 != -1) {
                                        if (i10 == 1) {
                                            gapComposer3.startReplaceGroup(-2007647418);
                                            BookletTile.StaticContent staticContent = bookletTile.static_content;
                                            if (staticContent == null) {
                                                gapComposer3.startReplaceGroup(-2007647419);
                                                gapComposer3.end(false);
                                            } else {
                                                gapComposer3.startReplaceGroup(-2007647418);
                                                LocalizedString localizedString2 = staticContent.title_text;
                                                localizedString2.getClass();
                                                String translated2 = StringsKt.translated(localizedString2);
                                                LocalizedString localizedString3 = staticContent.detail_text;
                                                localizedString3.getClass();
                                                String translated3 = StringsKt.translated(localizedString3);
                                                Image image = staticContent.hero_image;
                                                image.getClass();
                                                boolean changed2 = gapComposer3.changed(function12) | gapComposer3.changedInstance(safetyEducationHubTile);
                                                Object rememberedValue2 = gapComposer3.rememberedValue();
                                                if (changed2 || rememberedValue2 == obj4) {
                                                    rememberedValue2 = new Function0() { // from class: com.squareup.cash.family.safetyhub.views.SafetyHubViewKt$$ExternalSyntheticLambda6
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            int i11 = i7;
                                                            SafetyEducationHubTile safetyEducationHubTile2 = safetyEducationHubTile;
                                                            Function1 function13 = function12;
                                                            switch (i11) {
                                                                case 0:
                                                                    String str = safetyEducationHubTile2.id;
                                                                    str.getClass();
                                                                    function13.invoke(new SafetyHubViewEvent.TapTile(str));
                                                                    break;
                                                                default:
                                                                    String str2 = safetyEducationHubTile2.id;
                                                                    str2.getClass();
                                                                    function13.invoke(new SafetyHubViewEvent.TapTile(str2));
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    gapComposer3.updateRememberedValue(rememberedValue2);
                                                }
                                                GapComposer gapComposer4 = gapComposer3;
                                                BookletGridKt.m3424BookletTileeHTjO5g(null, translated2, translated3, image, RecyclerView.DECELERATION_RATE, (Function0) rememberedValue2, null, gapComposer4, 24576, EnumC0170g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE);
                                                gapComposer3 = gapComposer4;
                                                gapComposer3.end(false);
                                            }
                                            gapComposer3.end(false);
                                        } else if (i10 == 2) {
                                            gapComposer3.startReplaceGroup(-2007244542);
                                            BookletTile.GridContent gridContent = bookletTile.grid_content;
                                            if (gridContent == null) {
                                                gapComposer3.startReplaceGroup(-2007244543);
                                                gapComposer3.end(false);
                                            } else {
                                                gapComposer3.startReplaceGroup(-2007244542);
                                                LocalizedString localizedString4 = gridContent.title_text;
                                                localizedString4.getClass();
                                                String translated4 = StringsKt.translated(localizedString4);
                                                boolean changed3 = gapComposer3.changed(function12) | gapComposer3.changedInstance(safetyEducationHubTile);
                                                Object rememberedValue3 = gapComposer3.rememberedValue();
                                                if (changed3 || rememberedValue3 == obj4) {
                                                    rememberedValue3 = new Function0() { // from class: com.squareup.cash.family.safetyhub.views.SafetyHubViewKt$$ExternalSyntheticLambda6
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            int i11 = i6;
                                                            SafetyEducationHubTile safetyEducationHubTile2 = safetyEducationHubTile;
                                                            Function1 function13 = function12;
                                                            switch (i11) {
                                                                case 0:
                                                                    String str = safetyEducationHubTile2.id;
                                                                    str.getClass();
                                                                    function13.invoke(new SafetyHubViewEvent.TapTile(str));
                                                                    break;
                                                                default:
                                                                    String str2 = safetyEducationHubTile2.id;
                                                                    str2.getClass();
                                                                    function13.invoke(new SafetyHubViewEvent.TapTile(str2));
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    gapComposer3.updateRememberedValue(rememberedValue3);
                                                }
                                                Function0 function0 = (Function0) rememberedValue3;
                                                boolean changedInstance = gapComposer3.changedInstance(gridContent);
                                                Object rememberedValue4 = gapComposer3.rememberedValue();
                                                if (changedInstance || rememberedValue4 == obj4) {
                                                    rememberedValue4 = new RecipientQueries$$ExternalSyntheticLambda0(gridContent, 27);
                                                    gapComposer3.updateRememberedValue(rememberedValue4);
                                                }
                                                BookletGridKt.BookletGrid(null, translated4, function0, (Function1) rememberedValue4, gapComposer3, 0, 1);
                                                gapComposer3.end(false);
                                            }
                                            gapComposer3.end(false);
                                        } else if (i10 != 3) {
                                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer3, -64765680, false);
                                        }
                                        i8 = i9;
                                    }
                                    gapComposer3.startReplaceGroup(-2006681211);
                                    gapComposer3.end(false);
                                    i8 = i9;
                                }
                                gapComposer3.end(false);
                                gapComposer3.end(true);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                    }
                }
            }, gapComposer), null, Expect_jvmKt.rememberComposableLambda(341798904, new Function3() { // from class: com.squareup.cash.family.safetyhub.views.SafetyHubViewKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5 = i4;
                    Object obj4 = Composer.Companion.Empty;
                    final Function1 function12 = function1;
                    SafetyHubViewModel.Loaded loaded2 = loaded;
                    final int i6 = 1;
                    final int i7 = 0;
                    switch (i5) {
                        case 0:
                            Composer composer2 = (Composer) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            ((ColumnScope) obj).getClass();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                LocalizedString localizedString = loaded2.hub.navigation_title;
                                String translated = localizedString != null ? StringsKt.translated(localizedString) : null;
                                NavigationType navigationType = NavigationType.CLOSE;
                                boolean changed = gapComposer2.changed(function12);
                                Object rememberedValue = gapComposer2.rememberedValue();
                                if (changed || rememberedValue == obj4) {
                                    rememberedValue = new SafetyHubViewKt$$ExternalSyntheticLambda9(0, function12);
                                    gapComposer2.updateRememberedValue(rememberedValue);
                                }
                                DBUtil.TitleBarSub(translated, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer2, 48, 108);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        default:
                            Composer composer3 = (Composer) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            ((ScrollingScaffoldContentScope) obj).getClass();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                ((DefaultSizes) gapComposer3.consume(ArcadeThemeKt.LocalSizes)).getClass();
                                DefaultSizes.spacing.getClass();
                                Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(Modifier.Companion.$$INSTANCE, 16.0f);
                                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer3, 0);
                                int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, m298padding3ABfNKs);
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
                                DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer3, null);
                                MultiColorPageTitleKt.MultiColorPageTitle(0, gapComposer3, loaded2.hub.colored_title_segments);
                                DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer3, null);
                                gapComposer3.startReplaceGroup(-1882949001);
                                int i8 = 0;
                                for (Object obj5 : loaded2.hub.tiles) {
                                    int i9 = i8 + 1;
                                    if (i8 < 0) {
                                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                                        throw null;
                                    }
                                    final SafetyEducationHubTile safetyEducationHubTile = (SafetyEducationHubTile) obj5;
                                    if (i8 > 0) {
                                        gapComposer3.startReplaceGroup(-2007859303);
                                        DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer3, null);
                                        gapComposer3.end(false);
                                    } else {
                                        gapComposer3.startReplaceGroup(-2007812214);
                                        gapComposer3.end(false);
                                    }
                                    BookletTile bookletTile = safetyEducationHubTile.tile;
                                    BookletTile.ContentType contentType = bookletTile != null ? bookletTile.content_type : null;
                                    int i10 = contentType == null ? -1 : SafetyHubViewKt.WhenMappings.$EnumSwitchMapping$0[contentType.ordinal()];
                                    if (i10 != -1) {
                                        if (i10 == 1) {
                                            gapComposer3.startReplaceGroup(-2007647418);
                                            BookletTile.StaticContent staticContent = bookletTile.static_content;
                                            if (staticContent == null) {
                                                gapComposer3.startReplaceGroup(-2007647419);
                                                gapComposer3.end(false);
                                            } else {
                                                gapComposer3.startReplaceGroup(-2007647418);
                                                LocalizedString localizedString2 = staticContent.title_text;
                                                localizedString2.getClass();
                                                String translated2 = StringsKt.translated(localizedString2);
                                                LocalizedString localizedString3 = staticContent.detail_text;
                                                localizedString3.getClass();
                                                String translated3 = StringsKt.translated(localizedString3);
                                                Image image = staticContent.hero_image;
                                                image.getClass();
                                                boolean changed2 = gapComposer3.changed(function12) | gapComposer3.changedInstance(safetyEducationHubTile);
                                                Object rememberedValue2 = gapComposer3.rememberedValue();
                                                if (changed2 || rememberedValue2 == obj4) {
                                                    rememberedValue2 = new Function0() { // from class: com.squareup.cash.family.safetyhub.views.SafetyHubViewKt$$ExternalSyntheticLambda6
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            int i11 = i7;
                                                            SafetyEducationHubTile safetyEducationHubTile2 = safetyEducationHubTile;
                                                            Function1 function13 = function12;
                                                            switch (i11) {
                                                                case 0:
                                                                    String str = safetyEducationHubTile2.id;
                                                                    str.getClass();
                                                                    function13.invoke(new SafetyHubViewEvent.TapTile(str));
                                                                    break;
                                                                default:
                                                                    String str2 = safetyEducationHubTile2.id;
                                                                    str2.getClass();
                                                                    function13.invoke(new SafetyHubViewEvent.TapTile(str2));
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    gapComposer3.updateRememberedValue(rememberedValue2);
                                                }
                                                GapComposer gapComposer4 = gapComposer3;
                                                BookletGridKt.m3424BookletTileeHTjO5g(null, translated2, translated3, image, RecyclerView.DECELERATION_RATE, (Function0) rememberedValue2, null, gapComposer4, 24576, EnumC0170g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE);
                                                gapComposer3 = gapComposer4;
                                                gapComposer3.end(false);
                                            }
                                            gapComposer3.end(false);
                                        } else if (i10 == 2) {
                                            gapComposer3.startReplaceGroup(-2007244542);
                                            BookletTile.GridContent gridContent = bookletTile.grid_content;
                                            if (gridContent == null) {
                                                gapComposer3.startReplaceGroup(-2007244543);
                                                gapComposer3.end(false);
                                            } else {
                                                gapComposer3.startReplaceGroup(-2007244542);
                                                LocalizedString localizedString4 = gridContent.title_text;
                                                localizedString4.getClass();
                                                String translated4 = StringsKt.translated(localizedString4);
                                                boolean changed3 = gapComposer3.changed(function12) | gapComposer3.changedInstance(safetyEducationHubTile);
                                                Object rememberedValue3 = gapComposer3.rememberedValue();
                                                if (changed3 || rememberedValue3 == obj4) {
                                                    rememberedValue3 = new Function0() { // from class: com.squareup.cash.family.safetyhub.views.SafetyHubViewKt$$ExternalSyntheticLambda6
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            int i11 = i6;
                                                            SafetyEducationHubTile safetyEducationHubTile2 = safetyEducationHubTile;
                                                            Function1 function13 = function12;
                                                            switch (i11) {
                                                                case 0:
                                                                    String str = safetyEducationHubTile2.id;
                                                                    str.getClass();
                                                                    function13.invoke(new SafetyHubViewEvent.TapTile(str));
                                                                    break;
                                                                default:
                                                                    String str2 = safetyEducationHubTile2.id;
                                                                    str2.getClass();
                                                                    function13.invoke(new SafetyHubViewEvent.TapTile(str2));
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    gapComposer3.updateRememberedValue(rememberedValue3);
                                                }
                                                Function0 function0 = (Function0) rememberedValue3;
                                                boolean changedInstance = gapComposer3.changedInstance(gridContent);
                                                Object rememberedValue4 = gapComposer3.rememberedValue();
                                                if (changedInstance || rememberedValue4 == obj4) {
                                                    rememberedValue4 = new RecipientQueries$$ExternalSyntheticLambda0(gridContent, 27);
                                                    gapComposer3.updateRememberedValue(rememberedValue4);
                                                }
                                                BookletGridKt.BookletGrid(null, translated4, function0, (Function1) rememberedValue4, gapComposer3, 0, 1);
                                                gapComposer3.end(false);
                                            }
                                            gapComposer3.end(false);
                                        } else if (i10 != 3) {
                                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer3, -64765680, false);
                                        }
                                        i8 = i9;
                                    }
                                    gapComposer3.startReplaceGroup(-2006681211);
                                    gapComposer3.end(false);
                                    i8 = i9;
                                }
                                gapComposer3.end(false);
                                gapComposer3.end(true);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                    }
                }
            }, gapComposer), gapComposer, 199680, 22);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SafetyHubViewKt$$ExternalSyntheticLambda0(loaded, function1, i, 12);
        }
    }

    public static final void SafetyHubLoadingView(Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2100226428);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Modifier fillMaxSize = SizeKt.fillMaxSize(SpacerKt.systemBarsPadding(Modifier.Companion.$$INSTANCE), 1.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            ScreenScaffoldKt.ScreenScaffoldColumn(ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape), null, null, Expect_jvmKt.rememberComposableLambda(-71605084, new ErrorView$$ExternalSyntheticLambda3(15, function1), gapComposer), null, MultiColorPageTitleKt.f418lambda$1377618438, gapComposer, 199680, 22);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NfcNotAvailableKt$$ExternalSyntheticLambda1(function1, i, 17, false);
        }
    }

    public static final void SafetyHubView(SafetyHubViewModel safetyHubViewModel, Function1 function1, Composer composer, int i) {
        safetyHubViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1485685189);
        int i2 = (gapComposer.changedInstance(safetyHubViewModel) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = 0;
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else if (safetyHubViewModel instanceof SafetyHubViewModel.Loading) {
            gapComposer.startReplaceGroup(-1814320446);
            SafetyHubLoadingView(function1, gapComposer, (i2 >> 3) & 14);
            gapComposer.end(false);
        } else {
            if (!(safetyHubViewModel instanceof SafetyHubViewModel.Loaded)) {
                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1814321394, false);
            }
            gapComposer.startReplaceGroup(-1814318608);
            SafetyHubLoadedView((SafetyHubViewModel.Loaded) safetyHubViewModel, function1, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SafetyHubViewKt$$ExternalSyntheticLambda0(safetyHubViewModel, function1, i, i3);
        }
    }
}
