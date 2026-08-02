package androidx.compose.ui.node;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import app.cash.onboarding.global.countries.CountryOnboardingConfig;
import app.cash.onboarding.global.countries.RealCountryOnboardingConfigRepo;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.mlkit_genai_prompt.zzagn;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.input.InputChipKt$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt;
import com.squareup.cash.banking.views.BalanceHomeViewKt$$ExternalSyntheticLambda12;
import com.squareup.cash.bitcoin.views.map.BitcoinMapViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.blockers.actions.viewevents.BlockerActionConfirmSheetViewModel;
import com.squareup.cash.blockers.views.AtmPickerAmountBlockerKt$$ExternalSyntheticLambda3;
import com.squareup.cash.blockers.views.SetPinViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.checks.VerifyCheckDepositKt$$ExternalSyntheticLambda14;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.mooncake.compose_ui.components.SplitButtonEntry;
import com.squareup.cash.onboarding.backend.OnboardableCountries;
import com.squareup.cash.tax.views.TaxTooltipView$Content$1$1$1;
import com.squareup.protos.franklin.ui.UiAvatar;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class MeasureScopeWithLayoutNodeKt {
    public static final void BlockerActionConfirmSheet(BlockerActionConfirmSheetViewModel blockerActionConfirmSheetViewModel, Function1 function1, RealImageLoader realImageLoader, Composer composer, int i) {
        int i2;
        RealImageLoader realImageLoader2;
        Function1 function12 = function1;
        blockerActionConfirmSheetViewModel.getClass();
        function12.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1249071794);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(blockerActionConfirmSheetViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function12) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            realImageLoader2 = realImageLoader;
            i2 |= gapComposer.changedInstance(realImageLoader2) ? 256 : 128;
        } else {
            realImageLoader2 = realImageLoader;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            int i4 = i2 & 112;
            boolean z = i4 == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new TaxTooltipView$Content$1$1$1(i3, function12);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            VerifyCheckDepositKt$$ExternalSyntheticLambda14 verifyCheckDepositKt$$ExternalSyntheticLambda14 = new VerifyCheckDepositKt$$ExternalSyntheticLambda14(realImageLoader2, blockerActionConfirmSheetViewModel, SuspendingPointerInputFilterKt.pointerInput(Modifier.Companion.$$INSTANCE, null, (PointerInputEventHandler) rememberedValue), function12, 2);
            function12 = function12;
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(788174343, verifyCheckDepositKt$$ExternalSyntheticLambda14, gapComposer), gapComposer, 3072, 7);
            boolean z2 = i4 == 32;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new AtmPickerAmountBlockerKt$$ExternalSyntheticLambda3(14, function12);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue2, gapComposer, 0, 1);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SetPinViewKt$$ExternalSyntheticLambda3((Object) blockerActionConfirmSheetViewModel, function12, (Object) realImageLoader, i, 19);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bb  */
    /* renamed from: ConfirmationSheetBody-8iNrtrE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m888ConfirmationSheetBody8iNrtrE(String str, Function1 function1, int i, Composer composer, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        boolean z;
        Object rememberedValue;
        Colors colors;
        int i7;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-591459557);
        if ((i2 & 6) == 0) {
            i4 = (gapComposer.changed(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            if ((i3 & 4) == 0) {
                i5 = i;
                if (gapComposer.changed(i5)) {
                    i7 = 256;
                    i4 |= i7;
                }
            } else {
                i5 = i;
            }
            i7 = 128;
            i4 |= i7;
        } else {
            i5 = i;
        }
        boolean z2 = false;
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 147) != 146)) {
            gapComposer.startDefaults();
            if ((i2 & 1) != 0 && !gapComposer.getDefaultsInvalid()) {
                gapComposer.skipToGroupEnd();
                if ((i3 & 4) != 0) {
                    i4 &= -897;
                }
            } else if ((i3 & 4) != 0) {
                i4 &= -897;
                i6 = 0;
                gapComposer.endDefaults();
                z = (i4 & 112) == 32;
                rememberedValue = gapComposer.rememberedValue();
                if (!z || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new BalanceHomeViewKt$$ExternalSyntheticLambda12(function1, z2, 26);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Function2 function2 = (Function2) rememberedValue;
                TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors != null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                LazyDslKt.m305MultiblockMarkdown1kVgcOc(str, function2, null, textStyle, colors.semantic.text.standard, null, i6, null, gapComposer, (i4 & 14) | ((i4 << 12) & 3670016), EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE);
                i5 = i6;
            }
            i6 = i5;
            gapComposer.endDefaults();
            if ((i4 & 112) == 32) {
            }
            rememberedValue = gapComposer.rememberedValue();
            if (!z) {
            }
            rememberedValue = new BalanceHomeViewKt$$ExternalSyntheticLambda12(function1, z2, 26);
            gapComposer.updateRememberedValue(rememberedValue);
            Function2 function22 = (Function2) rememberedValue;
            TextStyle textStyle2 = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
            colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors != null) {
            }
            LazyDslKt.m305MultiblockMarkdown1kVgcOc(str, function22, null, textStyle2, colors.semantic.text.standard, null, i6, null, gapComposer, (i4 & 14) | ((i4 << 12) & 3670016), EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE);
            i5 = i6;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InputChipKt$$ExternalSyntheticLambda1(str, function1, i5, i2, i3);
        }
    }

    public static final void Main(Modifier modifier, BlockerActionConfirmSheetViewModel.Main.Original original, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer;
        Function1 function12;
        Modifier wrapContentHeight;
        boolean z;
        Modifier.Companion companion;
        SplitButtonEntry splitButtonEntry;
        boolean z2;
        char c;
        char c2;
        GapComposer gapComposer2;
        int i2;
        SplitButtonEntry splitButtonEntry2;
        SplitButtonEntry splitButtonEntry3;
        original.getClass();
        function1.getClass();
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(-439005575);
        Applier applier = gapComposer3.applier;
        int i3 = i | (gapComposer3.changed(modifier) ? 4 : 2) | (gapComposer3.changedInstance(original) ? 32 : 16) | (gapComposer3.changedInstance(function1) ? 256 : 128);
        if (gapComposer3.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            wrapContentHeight = SizeKt.wrapContentHeight(modifier, Alignment.Companion.CenterVertically, (r2 & 2) == 0);
            Modifier nestedScroll = NestedScrollModifierKt.nestedScroll(SizeKt.fillMaxWidth(wrapContentHeight, 1.0f), zzagn.rememberNestedScrollInteropConnection(gapComposer3), null);
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, Alignment.Companion.Start, gapComposer3, 0);
            int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, nestedScroll);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer3.startReusableNode();
            if (gapComposer3.inserting) {
                gapComposer3.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer3.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer3, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer3, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer3, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(SpacerKt.m300paddingVpY3zN4$default(Request$Priority$EnumUnboxingLocalUtility.m(1.0f, SizeKt.fillMaxWidth(companion2, 1.0f), false), 16.0f, RecyclerView.DECELERATION_RATE, 2), ImageKt.rememberScrollState(gapComposer3), false, 14);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, Alignment.Companion.CenterHorizontally, gapComposer3, 48);
            int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, verticalScroll$default);
            gapComposer3.startReusableNode();
            if (gapComposer3.inserting) {
                gapComposer3.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer3.useNode();
            }
            Updater.m576setimpl(gapComposer3, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer3, composeUiNode$Companion$SetModifier$13, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer3, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            SpacerKt.Spacer(gapComposer3, SizeKt.m285size3ABfNKs(companion2, 27.0f));
            UiAvatar uiAvatar = original.avatar;
            if (uiAvatar == null) {
                gapComposer3.startReplaceGroup(-1651085208);
                z = false;
                gapComposer3.end(false);
                companion = companion2;
                gapComposer2 = gapComposer3;
                splitButtonEntry = null;
                c = 0;
                z2 = true;
                c2 = 0;
            } else {
                z = false;
                gapComposer3.startReplaceGroup(-1651085207);
                companion = companion2;
                AvatarSize avatarSize = AvatarSize.Size48;
                AvatarEntry avatarEntry = AvatarsKt.toAvatarEntry(uiAvatar, null, gapComposer3, 1);
                splitButtonEntry = null;
                z2 = true;
                c = 0;
                c2 = 0;
                TextViewKt.Avatar(avatarSize, avatarEntry, null, false, gapComposer3, 6, 28);
                gapComposer2 = gapComposer3;
                gapComposer2.end(false);
            }
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, 12.0f, RecyclerView.DECELERATION_RATE, 12.0f, 5);
            String str = original.title;
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTypography;
            GapComposer gapComposer4 = gapComposer2;
            Modifier.Companion companion3 = companion;
            SplitButtonEntry splitButtonEntry4 = splitButtonEntry;
            Room.m1165Text25TpFw(0, 0, 0, 3, 48, 0, 3832, 0L, (Composer) gapComposer4, m302paddingqDBjuR0$default, ((Typography) gapComposer2.consume(staticProvidableCompositionLocal)).sectionTitle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            String str2 = original.subtitle;
            if (str2 == null) {
                gapComposer4.startReplaceGroup(-1650749416);
                gapComposer4.end(z);
            } else {
                gapComposer4.startReplaceGroup(-1650749415);
                TextStyle textStyle = ((Typography) gapComposer4.consume(staticProvidableCompositionLocal)).bodyMedium;
                Colors colors = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, z);
                } else {
                    gapComposer4.startReplaceGroup(-1762997739);
                    gapComposer4.end(z);
                }
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors.semantic.text.subtle, (Composer) gapComposer4, (Modifier) null, textStyle, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                gapComposer4.end(z);
            }
            SpacerKt.Spacer(gapComposer4, SizeKt.m285size3ABfNKs(companion3, 24.0f));
            m888ConfirmationSheetBody8iNrtrE(original.message, function1, 3, gapComposer4, (i3 >> 3) & 112, 0);
            function12 = function1;
            Request$Priority$EnumUnboxingLocalUtility.m(gapComposer4, true, companion3, 24.0f, gapComposer4);
            String str3 = original.confirmButtonText;
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (str3 == null) {
                gapComposer4.startReplaceGroup(-1543806044);
                gapComposer4.end(z);
                splitButtonEntry2 = splitButtonEntry4;
                i2 = 256;
            } else {
                gapComposer4.startReplaceGroup(-1543806043);
                i2 = 256;
                boolean z3 = (i3 & 896) == 256 ? true : z;
                Object rememberedValue = gapComposer4.rememberedValue();
                if (z3 || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new AtmPickerAmountBlockerKt$$ExternalSyntheticLambda3(18, function12);
                    gapComposer4.updateRememberedValue(rememberedValue);
                }
                splitButtonEntry2 = new SplitButtonEntry(str3, (Function0) rememberedValue);
                gapComposer4.end(z);
            }
            String str4 = original.returnButtonText;
            if (str4 == null) {
                gapComposer4.startReplaceGroup(-1543594779);
                gapComposer4.end(z);
                splitButtonEntry3 = splitButtonEntry4;
            } else {
                gapComposer4.startReplaceGroup(-1543594778);
                boolean z4 = (i3 & 896) == i2 ? true : z;
                Object rememberedValue2 = gapComposer4.rememberedValue();
                if (z4 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new AtmPickerAmountBlockerKt$$ExternalSyntheticLambda3(19, function12);
                    gapComposer4.updateRememberedValue(rememberedValue2);
                }
                splitButtonEntry3 = new SplitButtonEntry(str4, (Function0) rememberedValue2);
                gapComposer4.end(z);
            }
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion3, 1.0f), 16.0f, RecyclerView.DECELERATION_RATE, 2);
            boolean z5 = original.invertButtonTreatment;
            KeypadKt.m3649SplitButtonsnbWgWpA(m300paddingVpY3zN4$default, null, null, z5 ? splitButtonEntry3 : splitButtonEntry2, z5 ? splitButtonEntry2 : splitButtonEntry3, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, gapComposer4, 36870);
            gapComposer = gapComposer4;
            re$$ExternalSyntheticOutline0.m(companion3, 28.0f, gapComposer, true);
        } else {
            gapComposer = gapComposer3;
            function12 = function1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BitcoinMapViewKt$$ExternalSyntheticLambda0((Object) modifier, (Object) original, function12, i, 26);
        }
    }

    public static final void VariantA(Modifier modifier, BlockerActionConfirmSheetViewModel.Main.VariantA variantA, Function1 function1, Composer composer, int i) {
        Function1 function12;
        Modifier wrapContentHeight;
        boolean z;
        Modifier.Companion companion;
        SplitButtonEntry splitButtonEntry;
        char c;
        int i2;
        SplitButtonEntry splitButtonEntry2;
        boolean z2;
        SplitButtonEntry splitButtonEntry3;
        variantA.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-241888921);
        Applier applier = gapComposer.applier;
        int i3 = i | (gapComposer.changed(modifier) ? 4 : 2) | (gapComposer.changedInstance(variantA) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            wrapContentHeight = SizeKt.wrapContentHeight(modifier, Alignment.Companion.CenterVertically, (r2 & 2) == 0);
            Modifier nestedScroll = NestedScrollModifierKt.nestedScroll(SizeKt.fillMaxWidth(wrapContentHeight, 1.0f), zzagn.rememberNestedScrollInteropConnection(gapComposer), null);
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, nestedScroll);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(SpacerKt.m300paddingVpY3zN4$default(Request$Priority$EnumUnboxingLocalUtility.m(1.0f, SizeKt.fillMaxWidth(companion2, 1.0f), false), 16.0f, RecyclerView.DECELERATION_RATE, 2), ImageKt.rememberScrollState(gapComposer), false, 14);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, Alignment.Companion.CenterHorizontally, gapComposer, 48);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, verticalScroll$default);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            SpacerKt.Spacer(gapComposer, SizeKt.m285size3ABfNKs(companion2, 38.0f));
            UiAvatar uiAvatar = variantA.avatar;
            if (uiAvatar == null) {
                gapComposer.startReplaceGroup(-2053289798);
                gapComposer.end(false);
                companion = companion2;
                c = 0;
                z = true;
                splitButtonEntry = null;
            } else {
                gapComposer.startReplaceGroup(-2053289797);
                z = true;
                companion = companion2;
                splitButtonEntry = null;
                c = 0;
                TextViewKt.Avatar(AvatarSize.Size48, AvatarsKt.toAvatarEntry(uiAvatar, null, gapComposer, 1), null, false, gapComposer, 6, 28);
                gapComposer.end(false);
            }
            SpacerKt.Spacer(gapComposer, SizeKt.m285size3ABfNKs(companion, 24.0f));
            Modifier.Companion companion3 = companion;
            Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3834, 0L, (Composer) gapComposer, (Modifier) null, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).header, (TextLineBalancing) null, variantA.title, (Map) null, (Function1) null, false);
            SpacerKt.Spacer(gapComposer, SizeKt.m285size3ABfNKs(companion3, 48.0f));
            m888ConfirmationSheetBody8iNrtrE(variantA.message, function1, 3, gapComposer, (i3 >> 3) & 112, 0);
            function12 = function1;
            Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, true, companion3, 48.0f, gapComposer);
            String str = variantA.confirmButtonText;
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (str == null) {
                gapComposer.startReplaceGroup(171020470);
                z2 = false;
                gapComposer.end(false);
                splitButtonEntry2 = splitButtonEntry;
                i2 = 256;
            } else {
                gapComposer.startReplaceGroup(171020471);
                i2 = 256;
                boolean z3 = (i3 & 896) == 256;
                Object rememberedValue = gapComposer.rememberedValue();
                if (z3 || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new AtmPickerAmountBlockerKt$$ExternalSyntheticLambda3(16, function12);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                splitButtonEntry2 = new SplitButtonEntry(str, (Function0) rememberedValue);
                z2 = false;
                gapComposer.end(false);
            }
            String str2 = variantA.returnButtonText;
            if (str2 == null) {
                gapComposer.startReplaceGroup(171231735);
                gapComposer.end(z2);
                splitButtonEntry3 = splitButtonEntry;
            } else {
                gapComposer.startReplaceGroup(171231736);
                boolean z4 = (i3 & 896) == i2;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (z4 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new AtmPickerAmountBlockerKt$$ExternalSyntheticLambda3(17, function12);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                splitButtonEntry3 = new SplitButtonEntry(str2, (Function0) rememberedValue2);
                gapComposer.end(false);
            }
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion3, 1.0f), 16.0f, RecyclerView.DECELERATION_RATE, 2);
            boolean z5 = variantA.invertButtonTreatment;
            KeypadKt.m3649SplitButtonsnbWgWpA(m300paddingVpY3zN4$default, null, null, z5 ? splitButtonEntry3 : splitButtonEntry2, z5 ? splitButtonEntry2 : splitButtonEntry3, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, gapComposer, 36870);
            re$$ExternalSyntheticOutline0.m(companion3, 28.0f, gapComposer, true);
        } else {
            function12 = function1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BitcoinMapViewKt$$ExternalSyntheticLambda0((Object) modifier, (Object) variantA, function12, i, 29);
        }
    }

    public static final void VariantC(Modifier modifier, BlockerActionConfirmSheetViewModel.Main.VariantC variantC, Function1 function1, Composer composer, int i) {
        Function1 function12;
        Modifier wrapContentHeight;
        boolean z;
        SplitButtonEntry splitButtonEntry;
        boolean z2;
        Modifier.Companion companion;
        GapComposer gapComposer;
        int i2;
        int i3;
        SplitButtonEntry splitButtonEntry2;
        boolean z3;
        SplitButtonEntry splitButtonEntry3;
        variantC.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1458326037);
        Applier applier = gapComposer2.applier;
        int i4 = i | (gapComposer2.changed(modifier) ? 4 : 2) | (gapComposer2.changedInstance(variantC) ? 32 : 16) | (gapComposer2.changedInstance(function1) ? 256 : 128);
        if (gapComposer2.shouldExecute(i4 & 1, (i4 & 147) != 146)) {
            wrapContentHeight = SizeKt.wrapContentHeight(modifier, Alignment.Companion.CenterVertically, (r2 & 2) == 0);
            Modifier nestedScroll = NestedScrollModifierKt.nestedScroll(SizeKt.fillMaxWidth(wrapContentHeight, 1.0f), zzagn.rememberNestedScrollInteropConnection(gapComposer2), null);
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, nestedScroll);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(SpacerKt.m300paddingVpY3zN4$default(Request$Priority$EnumUnboxingLocalUtility.m(1.0f, SizeKt.fillMaxWidth(companion2, 1.0f), false), 16.0f, RecyclerView.DECELERATION_RATE, 2), ImageKt.rememberScrollState(gapComposer2), false, 14);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, 0);
            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, verticalScroll$default);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            SpacerKt.Spacer(gapComposer2, SizeKt.m285size3ABfNKs(companion2, 24.0f));
            UiAvatar uiAvatar = variantC.avatar;
            if (uiAvatar == null) {
                gapComposer2.startReplaceGroup(2631094);
                z = false;
                gapComposer2.end(false);
                gapComposer = gapComposer2;
                splitButtonEntry = null;
                z2 = true;
                companion = companion2;
            } else {
                z = false;
                gapComposer2.startReplaceGroup(2631095);
                AvatarSize avatarSize = AvatarSize.Size64;
                AvatarEntry avatarEntry = AvatarsKt.toAvatarEntry(uiAvatar, null, gapComposer2, 1);
                splitButtonEntry = null;
                z2 = true;
                companion = companion2;
                TextViewKt.Avatar(avatarSize, avatarEntry, null, false, gapComposer2, 6, 28);
                gapComposer = gapComposer2;
                gapComposer.end(false);
            }
            SpacerKt.Spacer(gapComposer, SizeKt.m285size3ABfNKs(companion, 16.0f));
            Modifier.Companion companion3 = companion;
            gapComposer2 = gapComposer;
            SplitButtonEntry splitButtonEntry4 = splitButtonEntry;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer2, (Modifier) null, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).header, (TextLineBalancing) null, variantC.title, (Map) null, (Function1) null, false);
            SpacerKt.Spacer(gapComposer2, SizeKt.m285size3ABfNKs(companion3, 16.0f));
            m888ConfirmationSheetBody8iNrtrE(variantC.message, function1, 0, gapComposer2, (i4 >> 3) & 112, 4);
            function12 = function1;
            Request$Priority$EnumUnboxingLocalUtility.m(gapComposer2, true, companion3, 32.0f, gapComposer2);
            String str = variantC.confirmButtonText;
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (str == null) {
                gapComposer2.startReplaceGroup(-2068143982);
                z3 = false;
                gapComposer2.end(false);
                splitButtonEntry2 = splitButtonEntry4;
                i2 = i4;
                i3 = 256;
            } else {
                gapComposer2.startReplaceGroup(-2068143981);
                i2 = i4;
                i3 = 256;
                boolean z4 = (i2 & 896) == 256;
                Object rememberedValue = gapComposer2.rememberedValue();
                if (z4 || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new AtmPickerAmountBlockerKt$$ExternalSyntheticLambda3(12, function12);
                    gapComposer2.updateRememberedValue(rememberedValue);
                }
                splitButtonEntry2 = new SplitButtonEntry(str, (Function0) rememberedValue);
                z3 = false;
                gapComposer2.end(false);
            }
            String str2 = variantC.returnButtonText;
            if (str2 == null) {
                gapComposer2.startReplaceGroup(-2067932717);
                gapComposer2.end(z3);
                splitButtonEntry3 = splitButtonEntry4;
            } else {
                gapComposer2.startReplaceGroup(-2067932716);
                boolean z5 = (i2 & 896) == i3;
                Object rememberedValue2 = gapComposer2.rememberedValue();
                if (z5 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new AtmPickerAmountBlockerKt$$ExternalSyntheticLambda3(13, function12);
                    gapComposer2.updateRememberedValue(rememberedValue2);
                }
                splitButtonEntry3 = new SplitButtonEntry(str2, (Function0) rememberedValue2);
                gapComposer2.end(false);
            }
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion3, 1.0f), 16.0f, RecyclerView.DECELERATION_RATE, 2);
            boolean z6 = variantC.invertButtonTreatment;
            KeypadKt.m3649SplitButtonsnbWgWpA(m300paddingVpY3zN4$default, null, null, z6 ? splitButtonEntry3 : splitButtonEntry2, z6 ? splitButtonEntry2 : splitButtonEntry3, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, gapComposer2, 36870);
            re$$ExternalSyntheticOutline0.m(companion3, 28.0f, gapComposer2, true);
        } else {
            function12 = function1;
            gapComposer2.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BitcoinMapViewKt$$ExternalSyntheticLambda0((Object) modifier, (Object) variantC, function12, i, 27);
        }
    }

    public static final ArrayList getChildrenOfVirtualChildren(IntrinsicMeasureScope intrinsicMeasureScope) {
        intrinsicMeasureScope.getClass();
        LayoutNode layoutNode = ((LookaheadCapablePlaceable) intrinsicMeasureScope).getLayoutNode();
        boolean isInLookaheadPass = isInLookaheadPass(layoutNode);
        List foldedChildren$ui = layoutNode.getFoldedChildren$ui();
        MutableVector.MutableVectorList mutableVectorList = (MutableVector.MutableVectorList) foldedChildren$ui;
        ArrayList arrayList = new ArrayList(mutableVectorList.vector.size);
        int size = foldedChildren$ui.size();
        for (int i = 0; i < size; i++) {
            LayoutNode layoutNode2 = (LayoutNode) mutableVectorList.get(i);
            arrayList.add(isInLookaheadPass ? layoutNode2.getChildLookaheadMeasurables$ui() : layoutNode2.getChildMeasurables$ui());
        }
        return arrayList;
    }

    public static final boolean isInLookaheadPass(LayoutNode layoutNode) {
        int ordinal = layoutNode.layoutDelegate.layoutState.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return false;
                        }
                        LayoutNode parent$ui = layoutNode.getParent$ui();
                        if (parent$ui != null) {
                            return isInLookaheadPass(parent$ui);
                        }
                        a$$ExternalSyntheticBUOutline0.m$3("no parent for idle node");
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static OnboardableCountries provideOnboardableCountries(RealCountryOnboardingConfigRepo realCountryOnboardingConfigRepo) {
        LinkedHashSet linkedHashSet = realCountryOnboardingConfigRepo.allProductionOnboardableCountries;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(linkedHashSet, 10));
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((CountryOnboardingConfig) it.next()).countryConfig.getCountry());
        }
        return new OnboardableCountries(CollectionsKt.toSet(arrayList));
    }
}
