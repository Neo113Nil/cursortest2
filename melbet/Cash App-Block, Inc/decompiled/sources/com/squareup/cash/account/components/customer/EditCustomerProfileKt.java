package com.squareup.cash.account.components.customer;

import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
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
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.squareup.cash.R;
import com.squareup.cash.account.components.AccountToDoKt;
import com.squareup.cash.account.components.EditProfileUiViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.account.components.EditProfileUiViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.account.settings.viewmodels.AccountAvatarViewModel;
import com.squareup.cash.account.settings.viewmodels.EditProfileViewModel$EditCustomerProfileViewModel;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticLambda4;
import com.squareup.cash.activity.views.ErrorActivityItemKt$$ExternalSyntheticLambda0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.util.compose.ResourcesKt;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public abstract class EditCustomerProfileKt {
    public static final ComposableLambdaImpl lambda$1441894747 = new ComposableLambdaImpl(new ErrorActivityItemKt$$ExternalSyntheticLambda0(11), false, 1441894747);
    public static final ComposableLambdaImpl lambda$527973810 = new ComposableLambdaImpl(new ErrorActivityItemKt$$ExternalSyntheticLambda0(12), false, 527973810);

    public static final void EditCustomerProfile(int i, Composer composer, Modifier modifier, final EditProfileViewModel$EditCustomerProfileViewModel editProfileViewModel$EditCustomerProfileViewModel, Function1 function1) {
        Function1 function12;
        final EditProfileViewModel$EditCustomerProfileViewModel editProfileViewModel$EditCustomerProfileViewModel2;
        NeverEqualPolicy neverEqualPolicy;
        int i2;
        boolean z;
        editProfileViewModel$EditCustomerProfileViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1041745242);
        int i3 = i | (gapComposer.changedInstance(editProfileViewModel$EditCustomerProfileViewModel) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(modifier, ImageKt.rememberScrollState(gapComposer), false, 14);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(verticalScroll$default, colors.semantic.background.f1047app, ColorKt.RectangleShape);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 44.0f));
            AccountAvatarViewModel accountAvatarViewModel = editProfileViewModel$EditCustomerProfileViewModel.avatar;
            AvatarSize avatarSize = AvatarSize.Size96;
            Icons icons = Icons.CameraFill24;
            boolean z2 = editProfileViewModel$EditCustomerProfileViewModel.canEditPhoto;
            HorizontalAlignElement horizontalAlignElement = new HorizontalAlignElement(Alignment.Companion.Start);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(horizontalAlignElement, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14);
            int i4 = i3 & 112;
            boolean z3 = i4 == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (z3 || rememberedValue == neverEqualPolicy2) {
                rememberedValue = new BalanceFeedKt$$ExternalSyntheticLambda4(1, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            AccountToDoKt.AccountAvatar(accountAvatarViewModel, (Function0) rememberedValue, m302paddingqDBjuR0$default, avatarSize, icons, z2, z2, gapComposer, 27648, 0);
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 44.0f));
            ViewfinderDefaults.SectionHeader(Room.stringResource(gapComposer, R.string.edit_profile_basic_info_title), (Modifier) null, (String) null, (Function0) null, editProfileViewModel$EditCustomerProfileViewModel.basicInfoDescription, gapComposer, 0, 14);
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 24.0f));
            if (editProfileViewModel$EditCustomerProfileViewModel.isBusiness) {
                gapComposer.startReplaceGroup(-770019405);
                CellDefaultAccessory.Push push = CellDefaultAccessory.Push.INSTANCE;
                boolean z4 = i4 == 32;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (z4 || rememberedValue2 == neverEqualPolicy2) {
                    rememberedValue2 = new BalanceFeedKt$$ExternalSyntheticLambda4(2, function1);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                Function0 function0 = (Function0) rememberedValue2;
                final int i5 = 0;
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(243375457, new Function2() { // from class: com.squareup.cash.account.components.customer.EditCustomerProfileKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i6 = i5;
                        String str = null;
                        EditProfileViewModel$EditCustomerProfileViewModel editProfileViewModel$EditCustomerProfileViewModel3 = editProfileViewModel$EditCustomerProfileViewModel;
                        switch (i6) {
                            case 0:
                                Composer composer2 = (Composer) obj;
                                int intValue = ((Integer) obj2).intValue();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                    String str2 = editProfileViewModel$EditCustomerProfileViewModel3.fullname;
                                    if (str2 != null && !StringsKt.isBlank(str2)) {
                                        str = str2;
                                    }
                                    if (str == null) {
                                        str = re$$ExternalSyntheticOutline0.m(gapComposer2, 1955583965, R.string.edit_profile_business_name_hinttext, gapComposer2, false);
                                    } else {
                                        gapComposer2.startReplaceGroup(1955581950);
                                        gapComposer2.end(false);
                                    }
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            case 1:
                                Composer composer3 = (Composer) obj;
                                int intValue2 = ((Integer) obj2).intValue();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                    String str3 = editProfileViewModel$EditCustomerProfileViewModel3.fullname;
                                    if (str3 != null && !StringsKt.isBlank(str3)) {
                                        str = str3;
                                    }
                                    if (str == null) {
                                        str = re$$ExternalSyntheticOutline0.m(gapComposer3, -621825041, R.string.edit_profile_fullname_hinttext, gapComposer3, false);
                                    } else {
                                        gapComposer3.startReplaceGroup(-621827056);
                                        gapComposer3.end(false);
                                    }
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                            case 2:
                                Composer composer4 = (Composer) obj;
                                int intValue3 = ((Integer) obj2).intValue();
                                GapComposer gapComposer4 = (GapComposer) composer4;
                                if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ResourcesKt.icuStringResource(R.string.edit_profile_cashtag_title, new Object[]{editProfileViewModel$EditCustomerProfileViewModel3.cashtagSymbol}, gapComposer4), (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer4.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer5 = (Composer) obj;
                                int intValue4 = ((Integer) obj2).intValue();
                                GapComposer gapComposer5 = (GapComposer) composer5;
                                if (gapComposer5.shouldExecute(1 & intValue4, (intValue4 & 3) != 2)) {
                                    String str4 = editProfileViewModel$EditCustomerProfileViewModel3.cashtag;
                                    if (str4 != null && !StringsKt.isBlank(str4)) {
                                        str = str4;
                                    }
                                    if (str == null) {
                                        gapComposer5.startReplaceGroup(-1586067958);
                                        str = ResourcesKt.icuStringResource(R.string.edit_profile_cashtag_hinttext, new Object[]{editProfileViewModel$EditCustomerProfileViewModel3.cashtagSymbol}, gapComposer5);
                                    } else {
                                        gapComposer5.startReplaceGroup(-1586069880);
                                    }
                                    gapComposer5.end(false);
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer5.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer);
                gapComposer = gapComposer;
                i2 = i4;
                neverEqualPolicy = neverEqualPolicy2;
                z = false;
                CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(lambda$1441894747, null, function0, false, false, rememberComposableLambda, null, 0L, push, null, gapComposer, 806879238, 1466);
                gapComposer.end(false);
                editProfileViewModel$EditCustomerProfileViewModel2 = editProfileViewModel$EditCustomerProfileViewModel;
            } else {
                neverEqualPolicy = neverEqualPolicy2;
                i2 = i4;
                z = false;
                gapComposer = gapComposer;
                gapComposer.startReplaceGroup(-769576384);
                CellDefaultAccessory.Push push2 = CellDefaultAccessory.Push.INSTANCE;
                boolean z5 = i2 == 32;
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (z5 || rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new BalanceFeedKt$$ExternalSyntheticLambda4(3, function1);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                final int i6 = 1;
                editProfileViewModel$EditCustomerProfileViewModel2 = editProfileViewModel$EditCustomerProfileViewModel;
                CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(lambda$527973810, null, (Function0) rememberedValue3, false, false, Expect_jvmKt.rememberComposableLambda(1585943352, new Function2() { // from class: com.squareup.cash.account.components.customer.EditCustomerProfileKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i62 = i6;
                        String str = null;
                        EditProfileViewModel$EditCustomerProfileViewModel editProfileViewModel$EditCustomerProfileViewModel3 = editProfileViewModel$EditCustomerProfileViewModel;
                        switch (i62) {
                            case 0:
                                Composer composer2 = (Composer) obj;
                                int intValue = ((Integer) obj2).intValue();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                    String str2 = editProfileViewModel$EditCustomerProfileViewModel3.fullname;
                                    if (str2 != null && !StringsKt.isBlank(str2)) {
                                        str = str2;
                                    }
                                    if (str == null) {
                                        str = re$$ExternalSyntheticOutline0.m(gapComposer2, 1955583965, R.string.edit_profile_business_name_hinttext, gapComposer2, false);
                                    } else {
                                        gapComposer2.startReplaceGroup(1955581950);
                                        gapComposer2.end(false);
                                    }
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            case 1:
                                Composer composer3 = (Composer) obj;
                                int intValue2 = ((Integer) obj2).intValue();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                    String str3 = editProfileViewModel$EditCustomerProfileViewModel3.fullname;
                                    if (str3 != null && !StringsKt.isBlank(str3)) {
                                        str = str3;
                                    }
                                    if (str == null) {
                                        str = re$$ExternalSyntheticOutline0.m(gapComposer3, -621825041, R.string.edit_profile_fullname_hinttext, gapComposer3, false);
                                    } else {
                                        gapComposer3.startReplaceGroup(-621827056);
                                        gapComposer3.end(false);
                                    }
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                            case 2:
                                Composer composer4 = (Composer) obj;
                                int intValue3 = ((Integer) obj2).intValue();
                                GapComposer gapComposer4 = (GapComposer) composer4;
                                if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ResourcesKt.icuStringResource(R.string.edit_profile_cashtag_title, new Object[]{editProfileViewModel$EditCustomerProfileViewModel3.cashtagSymbol}, gapComposer4), (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer4.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer5 = (Composer) obj;
                                int intValue4 = ((Integer) obj2).intValue();
                                GapComposer gapComposer5 = (GapComposer) composer5;
                                if (gapComposer5.shouldExecute(1 & intValue4, (intValue4 & 3) != 2)) {
                                    String str4 = editProfileViewModel$EditCustomerProfileViewModel3.cashtag;
                                    if (str4 != null && !StringsKt.isBlank(str4)) {
                                        str = str4;
                                    }
                                    if (str == null) {
                                        gapComposer5.startReplaceGroup(-1586067958);
                                        str = ResourcesKt.icuStringResource(R.string.edit_profile_cashtag_hinttext, new Object[]{editProfileViewModel$EditCustomerProfileViewModel3.cashtagSymbol}, gapComposer5);
                                    } else {
                                        gapComposer5.startReplaceGroup(-1586069880);
                                    }
                                    gapComposer5.end(false);
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer5.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer), null, 0L, push2, null, gapComposer, 806879238, 1466);
                gapComposer.end(false);
            }
            CellDefaultAccessory.Push push3 = CellDefaultAccessory.Push.INSTANCE;
            final int i7 = 2;
            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(1686676438, new Function2() { // from class: com.squareup.cash.account.components.customer.EditCustomerProfileKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i62 = i7;
                    String str = null;
                    EditProfileViewModel$EditCustomerProfileViewModel editProfileViewModel$EditCustomerProfileViewModel3 = editProfileViewModel$EditCustomerProfileViewModel2;
                    switch (i62) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                String str2 = editProfileViewModel$EditCustomerProfileViewModel3.fullname;
                                if (str2 != null && !StringsKt.isBlank(str2)) {
                                    str = str2;
                                }
                                if (str == null) {
                                    str = re$$ExternalSyntheticOutline0.m(gapComposer2, 1955583965, R.string.edit_profile_business_name_hinttext, gapComposer2, false);
                                } else {
                                    gapComposer2.startReplaceGroup(1955581950);
                                    gapComposer2.end(false);
                                }
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        case 1:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                String str3 = editProfileViewModel$EditCustomerProfileViewModel3.fullname;
                                if (str3 != null && !StringsKt.isBlank(str3)) {
                                    str = str3;
                                }
                                if (str == null) {
                                    str = re$$ExternalSyntheticOutline0.m(gapComposer3, -621825041, R.string.edit_profile_fullname_hinttext, gapComposer3, false);
                                } else {
                                    gapComposer3.startReplaceGroup(-621827056);
                                    gapComposer3.end(false);
                                }
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                        case 2:
                            Composer composer4 = (Composer) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer4;
                            if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ResourcesKt.icuStringResource(R.string.edit_profile_cashtag_title, new Object[]{editProfileViewModel$EditCustomerProfileViewModel3.cashtagSymbol}, gapComposer4), (Map) null, (Function1) null, false);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer5 = (Composer) obj;
                            int intValue4 = ((Integer) obj2).intValue();
                            GapComposer gapComposer5 = (GapComposer) composer5;
                            if (gapComposer5.shouldExecute(1 & intValue4, (intValue4 & 3) != 2)) {
                                String str4 = editProfileViewModel$EditCustomerProfileViewModel3.cashtag;
                                if (str4 != null && !StringsKt.isBlank(str4)) {
                                    str = str4;
                                }
                                if (str == null) {
                                    gapComposer5.startReplaceGroup(-1586067958);
                                    str = ResourcesKt.icuStringResource(R.string.edit_profile_cashtag_hinttext, new Object[]{editProfileViewModel$EditCustomerProfileViewModel3.cashtagSymbol}, gapComposer5);
                                } else {
                                    gapComposer5.startReplaceGroup(-1586069880);
                                }
                                gapComposer5.end(false);
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer5.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer);
            boolean z6 = i2 == 32 ? true : z;
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (z6 || rememberedValue4 == neverEqualPolicy) {
                function12 = function1;
                rememberedValue4 = new BalanceFeedKt$$ExternalSyntheticLambda4(4, function12);
                gapComposer.updateRememberedValue(rememberedValue4);
            } else {
                function12 = function1;
            }
            final int i8 = 3;
            CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(rememberComposableLambda2, null, (Function0) rememberedValue4, false, false, Expect_jvmKt.rememberComposableLambda(1781587804, new Function2() { // from class: com.squareup.cash.account.components.customer.EditCustomerProfileKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i62 = i8;
                    String str = null;
                    EditProfileViewModel$EditCustomerProfileViewModel editProfileViewModel$EditCustomerProfileViewModel3 = editProfileViewModel$EditCustomerProfileViewModel2;
                    switch (i62) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                String str2 = editProfileViewModel$EditCustomerProfileViewModel3.fullname;
                                if (str2 != null && !StringsKt.isBlank(str2)) {
                                    str = str2;
                                }
                                if (str == null) {
                                    str = re$$ExternalSyntheticOutline0.m(gapComposer2, 1955583965, R.string.edit_profile_business_name_hinttext, gapComposer2, false);
                                } else {
                                    gapComposer2.startReplaceGroup(1955581950);
                                    gapComposer2.end(false);
                                }
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        case 1:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                String str3 = editProfileViewModel$EditCustomerProfileViewModel3.fullname;
                                if (str3 != null && !StringsKt.isBlank(str3)) {
                                    str = str3;
                                }
                                if (str == null) {
                                    str = re$$ExternalSyntheticOutline0.m(gapComposer3, -621825041, R.string.edit_profile_fullname_hinttext, gapComposer3, false);
                                } else {
                                    gapComposer3.startReplaceGroup(-621827056);
                                    gapComposer3.end(false);
                                }
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                        case 2:
                            Composer composer4 = (Composer) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer4;
                            if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ResourcesKt.icuStringResource(R.string.edit_profile_cashtag_title, new Object[]{editProfileViewModel$EditCustomerProfileViewModel3.cashtagSymbol}, gapComposer4), (Map) null, (Function1) null, false);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer5 = (Composer) obj;
                            int intValue4 = ((Integer) obj2).intValue();
                            GapComposer gapComposer5 = (GapComposer) composer5;
                            if (gapComposer5.shouldExecute(1 & intValue4, (intValue4 & 3) != 2)) {
                                String str4 = editProfileViewModel$EditCustomerProfileViewModel3.cashtag;
                                if (str4 != null && !StringsKt.isBlank(str4)) {
                                    str = str4;
                                }
                                if (str == null) {
                                    gapComposer5.startReplaceGroup(-1586067958);
                                    str = ResourcesKt.icuStringResource(R.string.edit_profile_cashtag_hinttext, new Object[]{editProfileViewModel$EditCustomerProfileViewModel3.cashtagSymbol}, gapComposer5);
                                } else {
                                    gapComposer5.startReplaceGroup(-1586069880);
                                }
                                gapComposer5.end(false);
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer5.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), null, 0L, push3, null, gapComposer, 806879238, 1466);
            DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(100981986, new EditProfileUiViewKt$$ExternalSyntheticLambda3(editProfileViewModel$EditCustomerProfileViewModel2, function12, 1), gapComposer), gapComposer, 24576, 15);
            gapComposer.end(true);
        } else {
            function12 = function1;
            editProfileViewModel$EditCustomerProfileViewModel2 = editProfileViewModel$EditCustomerProfileViewModel;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new EditProfileUiViewKt$$ExternalSyntheticLambda5(editProfileViewModel$EditCustomerProfileViewModel2, function12, modifier, i);
        }
    }
}
