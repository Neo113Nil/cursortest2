package com.squareup.cash.family.requestsponsorship.views;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.foundation.text.KeyMappingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt;
import com.squareup.cash.blockers.views.SetPinViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.dialog.ArcadeModal2Kt$$ExternalSyntheticLambda0;
import com.squareup.cash.family.familyhub.views.FamilyHomeSectionsKt$$ExternalSyntheticLambda6;
import com.squareup.cash.family.fixtures.FamilyActivityFixtures$$ExternalSyntheticLambda0;
import com.squareup.cash.family.requestsponsorship.viewmodels.ContactMethod;
import com.squareup.cash.family.requestsponsorship.viewmodels.ContactPermissionDialogViewModel;
import com.squareup.cash.family.requestsponsorship.viewmodels.SelectContactMethodViewModel;
import com.squareup.cash.family.requestsponsorship.viewmodels.SelectSponsorErrorViewModel;
import com.squareup.cash.family.requestsponsorship.viewmodels.SponsorRowViewModel;
import com.squareup.cash.family.safetyhub.views.SafetyHubViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.family.safetyhub.views.SafetyHubViewKt$$ExternalSyntheticLambda9;
import com.squareup.cash.favorites.components.AddFavoritesViewKt$$ExternalSyntheticLambda15;
import com.squareup.cash.formview.components.FormCashtag$8$$ExternalSyntheticLambda0;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda10;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda2;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda4;
import com.squareup.cash.money.views.ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda5;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.profile.views.BadgeTitleKt$$ExternalSyntheticLambda0;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public abstract class SponsorRowViewKt {
    public static final ComposableLambdaImpl lambda$1375668170;
    public static final ComposableLambdaImpl lambda$182395138 = new ComposableLambdaImpl(new ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda5(16), false, 182395138);
    public static final ComposableLambdaImpl lambda$821008033;

    static {
        new ComposableLambdaImpl(new FamilyHomeSectionsKt$$ExternalSyntheticLambda6(16), false, 583347485);
        lambda$821008033 = new ComposableLambdaImpl(new AddFavoritesViewKt$$ExternalSyntheticLambda15(16), false, 821008033);
        lambda$1375668170 = new ComposableLambdaImpl(new AddFavoritesViewKt$$ExternalSyntheticLambda15(17), false, 1375668170);
    }

    public static final void ContactMethodRow(final ContactMethod contactMethod, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1877109538);
        final int i2 = 2;
        int i3 = (gapComposer.changedInstance(contactMethod) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        final int i4 = 1;
        int i5 = 6;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            CellDefaultAccessory.Push push = CellDefaultAccessory.Push.INSTANCE;
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-503951668, new Function2() { // from class: com.squareup.cash.family.requestsponsorship.views.SelectContactMethodViewKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Icons icons;
                    int i6 = r2;
                    ContactMethod contactMethod2 = contactMethod;
                    switch (i6) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                int ordinal = contactMethod2.f1130type.ordinal();
                                if (ordinal == 0) {
                                    icons = Icons.CommEmail32;
                                } else if (ordinal != 1) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    break;
                                } else {
                                    icons = Icons.CommSms32;
                                }
                                Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, 0L, gapComposer2, 48, 12);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        case 1:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                String str = contactMethod2.title;
                                TextStyle textStyle = ((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                                Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                if (colors == null) {
                                    colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                } else {
                                    gapComposer3.startReplaceGroup(-1762997739);
                                    gapComposer3.end(false);
                                }
                                Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4018, colors.semantic.text.standard, (Composer) gapComposer3, (Modifier) null, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer4 = (Composer) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer4;
                            if (gapComposer4.shouldExecute(1 & intValue3, (intValue3 & 3) != 2)) {
                                String str2 = contactMethod2.subtitle;
                                TextStyle textStyle2 = ((Typography) gapComposer4.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
                                Colors colors2 = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                                if (colors2 == null) {
                                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                                } else {
                                    gapComposer4.startReplaceGroup(-1762997739);
                                    gapComposer4.end(false);
                                }
                                Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4018, colors2.semantic.text.subtle, (Composer) gapComposer4, (Modifier) null, textStyle2, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer);
            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-254673267, new Function2() { // from class: com.squareup.cash.family.requestsponsorship.views.SelectContactMethodViewKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Icons icons;
                    int i6 = i4;
                    ContactMethod contactMethod2 = contactMethod;
                    switch (i6) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                int ordinal = contactMethod2.f1130type.ordinal();
                                if (ordinal == 0) {
                                    icons = Icons.CommEmail32;
                                } else if (ordinal != 1) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    break;
                                } else {
                                    icons = Icons.CommSms32;
                                }
                                Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, 0L, gapComposer2, 48, 12);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        case 1:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                String str = contactMethod2.title;
                                TextStyle textStyle = ((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                                Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                if (colors == null) {
                                    colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                } else {
                                    gapComposer3.startReplaceGroup(-1762997739);
                                    gapComposer3.end(false);
                                }
                                Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4018, colors.semantic.text.standard, (Composer) gapComposer3, (Modifier) null, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer4 = (Composer) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer4;
                            if (gapComposer4.shouldExecute(1 & intValue3, (intValue3 & 3) != 2)) {
                                String str2 = contactMethod2.subtitle;
                                TextStyle textStyle2 = ((Typography) gapComposer4.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
                                Colors colors2 = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                                if (colors2 == null) {
                                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                                } else {
                                    gapComposer4.startReplaceGroup(-1762997739);
                                    gapComposer4.end(false);
                                }
                                Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4018, colors2.semantic.text.subtle, (Composer) gapComposer4, (Modifier) null, textStyle2, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer);
            int i6 = (gapComposer.changedInstance(contactMethod) ? 1 : 0) | ((i3 & 112) == 32 ? 1 : 0);
            Object rememberedValue = gapComposer.rememberedValue();
            if (i6 != 0 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new GLSceneScope$$ExternalSyntheticLambda4(i5, function1, contactMethod);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(rememberComposableLambda, rememberComposableLambda2, null, (Function0) rememberedValue, false, true, Expect_jvmKt.rememberComposableLambda(1240997139, new Function2() { // from class: com.squareup.cash.family.requestsponsorship.views.SelectContactMethodViewKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Icons icons;
                    int i62 = i2;
                    ContactMethod contactMethod2 = contactMethod;
                    switch (i62) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                int ordinal = contactMethod2.f1130type.ordinal();
                                if (ordinal == 0) {
                                    icons = Icons.CommEmail32;
                                } else if (ordinal != 1) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    break;
                                } else {
                                    icons = Icons.CommSms32;
                                }
                                Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, 0L, gapComposer2, 48, 12);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        case 1:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                String str = contactMethod2.title;
                                TextStyle textStyle = ((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                                Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                if (colors == null) {
                                    colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                } else {
                                    gapComposer3.startReplaceGroup(-1762997739);
                                    gapComposer3.end(false);
                                }
                                Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4018, colors.semantic.text.standard, (Composer) gapComposer3, (Modifier) null, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer4 = (Composer) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer4;
                            if (gapComposer4.shouldExecute(1 & intValue3, (intValue3 & 3) != 2)) {
                                String str2 = contactMethod2.subtitle;
                                TextStyle textStyle2 = ((Typography) gapComposer4.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
                                Colors colors2 = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                                if (colors2 == null) {
                                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                                } else {
                                    gapComposer4.startReplaceGroup(-1762997739);
                                    gapComposer4.end(false);
                                }
                                Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4018, colors2.semantic.text.subtle, (Composer) gapComposer4, (Modifier) null, textStyle2, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), null, push, 0L, gapComposer, 819462198, 3380);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FormCashtag$8$$ExternalSyntheticLambda0(contactMethod, function1, i, 6);
        }
    }

    public static final void ContactPermissionDialog(ContactPermissionDialogViewModel contactPermissionDialogViewModel, Function1 function1, Composer composer, int i) {
        contactPermissionDialogViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-184099995);
        int i2 = (gapComposer.changedInstance(contactPermissionDialogViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ModalKt.Dimmer(null, null, null, Expect_jvmKt.rememberComposableLambda(691705438, new ContactPermissionDialogKt$$ExternalSyntheticLambda0(contactPermissionDialogViewModel, function1), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ContactPermissionDialog$$ExternalSyntheticLambda1(i, contactPermissionDialogViewModel, function1);
        }
    }

    public static final void SelectContactMethod(SelectContactMethodViewModel selectContactMethodViewModel, Function1 function1, Composer composer, int i) {
        SelectContactMethodViewModel selectContactMethodViewModel2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1519598322);
        int i2 = (gapComposer.changedInstance(selectContactMethodViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier fillMaxSize = SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f);
            boolean z = selectContactMethodViewModel instanceof SelectContactMethodViewModel.Loading;
            Object rememberedValue = gapComposer.rememberedValue();
            int i3 = 14;
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new FamilyActivityFixtures$$ExternalSyntheticLambda0(i3);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            selectContactMethodViewModel2 = selectContactMethodViewModel;
            Strings.LoadableFullScreenContent(selectContactMethodViewModel2, z, fillMaxSize, (Function1) rememberedValue, null, Expect_jvmKt.rememberComposableLambda(-877590545, new SetPinViewKt$$ExternalSyntheticLambda4(29, function1), gapComposer), gapComposer, (i2 & 14) | 200064, 16);
        } else {
            selectContactMethodViewModel2 = selectContactMethodViewModel;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SelectContactMethodView$$ExternalSyntheticLambda3(selectContactMethodViewModel2, function1, i);
        }
    }

    public static final void SelectContactMethodContent(SelectContactMethodViewModel.Content content, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1389186155);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(content) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(SpacerKt.systemBarsPadding(companion), 1.0f);
            Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m177backgroundbw27NRU);
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
            int i3 = i2;
            String str = content.title;
            NavigationType navigationType = NavigationType.CLOSE;
            int i4 = i3 & 112;
            boolean z = i4 == 32;
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new SafetyHubViewKt$$ExternalSyntheticLambda9(11, function1);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            DBUtil.TitleBarSub(str, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer2, 48, 108);
            Modifier m = Request$Priority$EnumUnboxingLocalUtility.m(1.0f, SizeKt.fillMaxWidth(companion, 1.0f), true);
            boolean changedInstance = gapComposer2.changedInstance(content) | (i4 == 32);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new GLSceneScope$$ExternalSyntheticLambda10(3, content, function1);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            LazyDslKt.LazyColumn(m, null, null, null, null, null, false, null, (Function1) rememberedValue2, gapComposer2, 0, 510);
            gapComposer = gapComposer2;
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SafetyHubViewKt$$ExternalSyntheticLambda0(content, function1, i, 10);
        }
    }

    public static final void SelectSponsorErrorDialog(SelectSponsorErrorViewModel selectSponsorErrorViewModel, Function1 function1, Composer composer, int i) {
        selectSponsorErrorViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(203042441);
        int i2 = (gapComposer.changedInstance(selectSponsorErrorViewModel) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ModalKt.Dimmer(null, null, null, Expect_jvmKt.rememberComposableLambda(844741616, new ArcadeModal2Kt$$ExternalSyntheticLambda0(17, selectSponsorErrorViewModel, function1), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SafetyHubViewKt$$ExternalSyntheticLambda0(selectSponsorErrorViewModel, function1, i, 11);
        }
    }

    public static final void SponsorRow(final SponsorRowViewModel sponsorRowViewModel, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer;
        sponsorRowViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1867831061);
        final int i2 = 2;
        int i3 = (gapComposer2.changedInstance(sponsorRowViewModel) ? 4 : 2) | i | (gapComposer2.changedInstance(function1) ? 32 : 16);
        final int i4 = 1;
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) gapComposer2.consume(CompositionLocalsKt.LocalSoftwareKeyboardController);
            CellDefaultAccessory.Push push = CellDefaultAccessory.Push.INSTANCE;
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(882370697, new Function2() { // from class: com.squareup.cash.family.requestsponsorship.views.SponsorRowViewKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = r2;
                    SponsorRowViewModel sponsorRowViewModel2 = sponsorRowViewModel;
                    switch (i5) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer2;
                            if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                TextViewKt.Avatar(AvatarSize.Size48, AvatarsKt.toAvatarEntry(StackedAvatarViewModel.Avatar.copy$default(sponsorRowViewModel2.avatar.avatar, null, null, 131067), null, new AddFavoritesViewKt$$ExternalSyntheticLambda15(18), gapComposer3, 8, 1), null, false, gapComposer3, 6, 28);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                        case 1:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer3;
                            if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, sponsorRowViewModel2.title, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer4 = (Composer) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            GapComposer gapComposer5 = (GapComposer) composer4;
                            if (gapComposer5.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                long sp = Room.getSp(28);
                                long sp2 = Room.getSp(20);
                                AnnotatedString.Builder builder = new AnnotatedString.Builder();
                                if (sponsorRowViewModel2.showCashLogo) {
                                    KeyMappingKt.appendInlineContent(builder, "logo", "�");
                                }
                                builder.append(sponsorRowViewModel2.subtitle);
                                Room.m1164Text25TpFw(0, 0, 0, 0, 0, 0, 2046, 0L, (Composer) gapComposer5, (Modifier) null, builder.toAnnotatedString(), (TextStyle) null, (TextLineBalancing) null, MapsKt__MapsJVMKt.mapOf(new Pair("logo", new InlineTextContent(new Placeholder(4, sp, sp2), Expect_jvmKt.rememberComposableLambda(986881798, new BadgeTitleKt$$ExternalSyntheticLambda0(1, sp, sp2), gapComposer5)))), (Function1) null, false);
                            } else {
                                gapComposer5.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer2);
            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(576736168, new Function2() { // from class: com.squareup.cash.family.requestsponsorship.views.SponsorRowViewKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i4;
                    SponsorRowViewModel sponsorRowViewModel2 = sponsorRowViewModel;
                    switch (i5) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer2;
                            if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                TextViewKt.Avatar(AvatarSize.Size48, AvatarsKt.toAvatarEntry(StackedAvatarViewModel.Avatar.copy$default(sponsorRowViewModel2.avatar.avatar, null, null, 131067), null, new AddFavoritesViewKt$$ExternalSyntheticLambda15(18), gapComposer3, 8, 1), null, false, gapComposer3, 6, 28);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                        case 1:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer3;
                            if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, sponsorRowViewModel2.title, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer4 = (Composer) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            GapComposer gapComposer5 = (GapComposer) composer4;
                            if (gapComposer5.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                long sp = Room.getSp(28);
                                long sp2 = Room.getSp(20);
                                AnnotatedString.Builder builder = new AnnotatedString.Builder();
                                if (sponsorRowViewModel2.showCashLogo) {
                                    KeyMappingKt.appendInlineContent(builder, "logo", "�");
                                }
                                builder.append(sponsorRowViewModel2.subtitle);
                                Room.m1164Text25TpFw(0, 0, 0, 0, 0, 0, 2046, 0L, (Composer) gapComposer5, (Modifier) null, builder.toAnnotatedString(), (TextStyle) null, (TextLineBalancing) null, MapsKt__MapsJVMKt.mapOf(new Pair("logo", new InlineTextContent(new Placeholder(4, sp, sp2), Expect_jvmKt.rememberComposableLambda(986881798, new BadgeTitleKt$$ExternalSyntheticLambda0(1, sp, sp2), gapComposer5)))), (Function1) null, false);
                            } else {
                                gapComposer5.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer2);
            int i5 = (gapComposer2.changed(delegatingSoftwareKeyboardController) ? 1 : 0) | ((i3 & 112) == 32 ? 1 : 0) | (gapComposer2.changedInstance(sponsorRowViewModel) ? 1 : 0);
            Object rememberedValue = gapComposer2.rememberedValue();
            if (i5 != 0 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new GLSceneScope$$ExternalSyntheticLambda2(9, delegatingSoftwareKeyboardController, function1, sponsorRowViewModel);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            gapComposer = gapComposer2;
            CellDefaultKt.m3392CellDefaultLargeIconygcbOzY(rememberComposableLambda, rememberComposableLambda2, null, (Function0) rememberedValue, null, false, false, Expect_jvmKt.rememberComposableLambda(-1257071006, new Function2() { // from class: com.squareup.cash.family.requestsponsorship.views.SponsorRowViewKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i52 = i2;
                    SponsorRowViewModel sponsorRowViewModel2 = sponsorRowViewModel;
                    switch (i52) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer2;
                            if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                TextViewKt.Avatar(AvatarSize.Size48, AvatarsKt.toAvatarEntry(StackedAvatarViewModel.Avatar.copy$default(sponsorRowViewModel2.avatar.avatar, null, null, 131067), null, new AddFavoritesViewKt$$ExternalSyntheticLambda15(18), gapComposer3, 8, 1), null, false, gapComposer3, 6, 28);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                        case 1:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer3;
                            if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, sponsorRowViewModel2.title, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer4 = (Composer) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            GapComposer gapComposer5 = (GapComposer) composer4;
                            if (gapComposer5.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                long sp = Room.getSp(28);
                                long sp2 = Room.getSp(20);
                                AnnotatedString.Builder builder = new AnnotatedString.Builder();
                                if (sponsorRowViewModel2.showCashLogo) {
                                    KeyMappingKt.appendInlineContent(builder, "logo", "�");
                                }
                                builder.append(sponsorRowViewModel2.subtitle);
                                Room.m1164Text25TpFw(0, 0, 0, 0, 0, 0, 2046, 0L, (Composer) gapComposer5, (Modifier) null, builder.toAnnotatedString(), (TextStyle) null, (TextLineBalancing) null, MapsKt__MapsJVMKt.mapOf(new Pair("logo", new InlineTextContent(new Placeholder(4, sp, sp2), Expect_jvmKt.rememberComposableLambda(986881798, new BadgeTitleKt$$ExternalSyntheticLambda0(1, sp, sp2), gapComposer5)))), (Function1) null, false);
                            } else {
                                gapComposer5.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer2), null, push, 0L, null, gapComposer, 817889334, 0, 3444);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FormCashtag$8$$ExternalSyntheticLambda0(sponsorRowViewModel, function1, i, 8);
        }
    }
}
