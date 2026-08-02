package com.squareup.cash.profile.views.personal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.foundation.CanvasKt$$ExternalSyntheticLambda0;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
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
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzabx;
import com.squareup.cash.R;
import com.squareup.cash.account.settings.viewmodels.AliasesSectionViewModel;
import com.squareup.cash.account.settings.viewmodels.ContactInfoSectionViewModel;
import com.squareup.cash.account.settings.viewmodels.IdentityVerificationSectionViewModel;
import com.squareup.cash.account.settings.viewmodels.PersonalInfoConfirmationViewModel;
import com.squareup.cash.account.settings.viewmodels.PersonalInfoRow;
import com.squareup.cash.account.settings.viewmodels.PersonalInfoSectionViewModel;
import com.squareup.cash.account.settings.viewmodels.PersonalScreenViewModel;
import com.squareup.cash.account.settings.viewmodels.RatePlanButtonTreatment;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.db.profile.ProfileAlias;
import com.squareup.cash.instruments.views.InstrumentCellKt$$ExternalSyntheticLambda9;
import com.squareup.cash.pdf.view.PdfPreviewViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.presenters.AliasFormatter;
import com.squareup.cash.profile.views.ComposableSingletons$ProfileKt$$ExternalSyntheticLambda0;
import com.squareup.cash.profile.views.ProfileKt$$ExternalSyntheticLambda11;
import com.squareup.cash.profile.views.ProfileKt$$ExternalSyntheticLambda3;
import com.squareup.cash.profile.views.SecurityLockView$$ExternalSyntheticLambda1;
import com.squareup.cash.profile.views.TaxesPasswordViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.profile.views.security.ComposableSingletons$CashPinSectionKt$$ExternalSyntheticLambda0;
import com.squareup.cash.profile.views.security.WebSectionKt;
import com.squareup.cash.retro.views.PaymentPlanSummaryKt$$ExternalSyntheticLambda11;
import com.squareup.cash.savings.views.ButtonGroupKt$$ExternalSyntheticLambda11;
import com.squareup.cash.score.views.InfoSectionKt$$ExternalSyntheticLambda6;
import com.squareup.cash.score.views.InfoSectionKt$$ExternalSyntheticLambda7;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda8;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.util.Strings;
import com.squareup.util.android.PhoneNumbers;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes7.dex */
public abstract class RatePlanSectionKt {

    /* renamed from: lambda$-490427156, reason: not valid java name */
    public static final ComposableLambdaImpl f615lambda$490427156 = new ComposableLambdaImpl(new ComposableSingletons$ProfileKt$$ExternalSyntheticLambda0(28), false, -490427156);
    public static final ComposableLambdaImpl lambda$1603817899 = new ComposableLambdaImpl(new ComposableSingletons$ProfileKt$$ExternalSyntheticLambda0(29), false, 1603817899);
    public static final ComposableLambdaImpl lambda$1078450993 = new ComposableLambdaImpl(new ComposableSingletons$CashPinSectionKt$$ExternalSyntheticLambda0(1), false, 1078450993);

    /* renamed from: lambda$-2119229786, reason: not valid java name */
    public static final ComposableLambdaImpl f612lambda$2119229786 = new ComposableLambdaImpl(new PaymentPlanSummaryKt$$ExternalSyntheticLambda11(3), false, -2119229786);
    public static final ComposableLambdaImpl lambda$1254838493 = new ComposableLambdaImpl(new PaymentPlanSummaryKt$$ExternalSyntheticLambda11(4), false, 1254838493);

    /* renamed from: lambda$-452439020, reason: not valid java name */
    public static final ComposableLambdaImpl f614lambda$452439020 = new ComposableLambdaImpl(new PaymentPlanSummaryKt$$ExternalSyntheticLambda11(5), false, -452439020);
    public static final ComposableLambdaImpl lambda$714663957 = new ComposableLambdaImpl(new PaymentPlanSummaryKt$$ExternalSyntheticLambda11(6), false, 714663957);
    public static final ComposableLambdaImpl lambda$1917801282 = new ComposableLambdaImpl(new PaymentPlanSummaryKt$$ExternalSyntheticLambda11(7), false, 1917801282);
    public static final ComposableLambdaImpl lambda$1678790647 = new ComposableLambdaImpl(new ComposableSingletons$CashPinSectionKt$$ExternalSyntheticLambda0(2), false, 1678790647);

    /* renamed from: lambda$-36807944, reason: not valid java name */
    public static final ComposableLambdaImpl f613lambda$36807944 = new ComposableLambdaImpl(new ComposableSingletons$CashPinSectionKt$$ExternalSyntheticLambda0(3), false, -36807944);
    public static final ComposableLambdaImpl lambda$1509308896 = new ComposableLambdaImpl(new ComposableSingletons$CashPinSectionKt$$ExternalSyntheticLambda0(4), false, 1509308896);
    public static final ComposableLambdaImpl lambda$2086504609 = new ComposableLambdaImpl(new ComposableSingletons$CashPinSectionKt$$ExternalSyntheticLambda0(5), false, 2086504609);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v35, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r9v6, types: [kotlin.jvm.functions.Function2] */
    public static final void ContactInfoSection(ContactInfoSectionViewModel contactInfoSectionViewModel, Function1 function1, Modifier modifier, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        int i4;
        GapComposer gapComposer;
        int i5;
        boolean z;
        boolean z2;
        Modifier modifier4;
        String m;
        Object obj;
        Object obj2;
        contactInfoSectionViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(2063286360);
        int i6 = i | (gapComposer2.changedInstance(contactInfoSectionViewModel) ? 4 : 2);
        int i7 = 32;
        if ((i & 48) == 0) {
            i6 |= gapComposer2.changedInstance(function1) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 = i6 | MLKEMEngine.KyberPolyBytes;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = i6 | (gapComposer2.changed(modifier2) ? 256 : 128);
        }
        boolean z3 = true;
        boolean z4 = false;
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Modifier modifier5 = i8 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, modifier5);
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
            String stringResource = Room.stringResource(gapComposer2, R.string.profile_personal_contact_info_title);
            String stringResource2 = Room.stringResource(gapComposer2, R.string.profile_personal_contact_info_subtitle);
            Icons icons = null;
            GapComposer gapComposer3 = gapComposer2;
            ViewfinderDefaults.SectionHeader(stringResource, (Modifier) null, (String) null, (Function0) null, stringResource2, gapComposer3, 0, 14);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer3, null);
            gapComposer3.startReplaceGroup(-1212857886);
            for (Map.Entry entry : contactInfoSectionViewModel.aliasSection.aliases.entrySet()) {
                ProfileAlias profileAlias = (ProfileAlias) entry.getKey();
                if (((AliasesSectionViewModel.AliasState) entry.getValue()) == AliasesSectionViewModel.AliasState.DISPLAYED) {
                    gapComposer3.startReplaceGroup(-1053850484);
                    UiAlias.Type type2 = profileAlias.f1121type;
                    UiAlias.Type type3 = profileAlias.f1121type;
                    int ordinal = type2.ordinal();
                    Icons icons2 = ordinal != 0 ? ordinal != z3 ? icons : Icons.CommEmail24 : Icons.DeviceMobile24;
                    int ordinal2 = type3.ordinal();
                    if (ordinal2 == 0) {
                        m = re$$ExternalSyntheticOutline0.m(gapComposer3, -1142366734, R.string.profile_edit_phone, gapComposer3, z4);
                    } else if (ordinal2 != z3) {
                        gapComposer3.startReplaceGroup(-1053503689);
                        gapComposer3.end(z4);
                        m = "";
                    } else {
                        m = re$$ExternalSyntheticOutline0.m(gapComposer3, -1142364654, R.string.profile_edit_email, gapComposer3, z4);
                    }
                    String displayText = AliasFormatter.getDisplayText(profileAlias.canonical_text, type3, PhoneNumbers.Format.NATIONAL);
                    if (icons2 == null) {
                        gapComposer3.startReplaceGroup(-1053353276);
                        gapComposer3.end(z4);
                        obj = icons;
                    } else {
                        gapComposer3.startReplaceGroup(-1053353275);
                        Object rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-405679347, new InfoSectionKt$$ExternalSyntheticLambda6(icons2, 25), gapComposer3);
                        gapComposer3.end(z4);
                        obj = rememberComposableLambda;
                    }
                    if (displayText == null) {
                        gapComposer3.startReplaceGroup(-1053234298);
                        gapComposer3.end(z4);
                        obj2 = icons;
                    } else {
                        gapComposer3.startReplaceGroup(-1053234297);
                        Object rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(2073868460, new InfoSectionKt$$ExternalSyntheticLambda7(displayText, 7), gapComposer3);
                        gapComposer3.end(z4);
                        obj2 = rememberComposableLambda2;
                    }
                    CellDefaultAccessory.ButtonCompact buttonCompact = new CellDefaultAccessory.ButtonCompact(null, null, true, f612lambda$2119229786, 11);
                    ComposableLambdaImpl rememberComposableLambda3 = Expect_jvmKt.rememberComposableLambda(-382910051, new InfoSectionKt$$ExternalSyntheticLambda7(m, 8), gapComposer3);
                    boolean changedInstance = ((i3 & 112) == i7 ? z3 : z4) | gapComposer3.changedInstance(profileAlias);
                    Object rememberedValue = gapComposer3.rememberedValue();
                    if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new ProfileKt$$ExternalSyntheticLambda11(24, function1, profileAlias);
                        gapComposer3.updateRememberedValue(rememberedValue);
                    }
                    gapComposer = gapComposer3;
                    modifier4 = modifier5;
                    i5 = i7;
                    i4 = i3;
                    z = z3;
                    z2 = z4;
                    CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(obj, rememberComposableLambda3, null, (Function0) rememberedValue, false, false, obj2, null, buttonCompact, 0L, gapComposer, 48, 3444);
                    gapComposer.end(z2);
                } else {
                    i4 = i3;
                    gapComposer = gapComposer3;
                    i5 = i7;
                    z = z3;
                    z2 = z4;
                    modifier4 = modifier5;
                    gapComposer.startReplaceGroup(-1052944261);
                    gapComposer.end(z2);
                }
                z4 = z2;
                z3 = z;
                gapComposer3 = gapComposer;
                i7 = i5;
                i3 = i4;
                modifier5 = modifier4;
                icons = null;
            }
            gapComposer2 = gapComposer3;
            boolean z5 = z3;
            boolean z6 = z4;
            gapComposer2.end(z6);
            DBUtil.SpacerWithinSectionSmall(z6 ? 1 : 0, z5 ? 1 : 0, gapComposer2, null);
            zzabx.ButtonDefaultGroupHorizontal(null, Expect_jvmKt.rememberComposableLambda(-444258448, new TaxesPasswordViewKt$$ExternalSyntheticLambda4(6, function1), gapComposer2), gapComposer2, 48, z5 ? 1 : 0);
            gapComposer2.end(z5);
            modifier3 = modifier5;
        } else {
            gapComposer2.skipToGroupEnd();
            modifier3 = modifier2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InstrumentCellKt$$ExternalSyntheticLambda9((Object) contactInfoSectionViewModel, function1, modifier3, i, i2, 12);
        }
    }

    public static final void PersonalInfo(PersonalScreenViewModel personalScreenViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(152439934);
        int i2 = (gapComposer.changedInstance(personalScreenViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1477781933, new PersonalInfoView$$ExternalSyntheticLambda2(function1, personalScreenViewModel), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SecurityLockView$$ExternalSyntheticLambda1(modifier2, (Object) personalScreenViewModel, function1, i, 21);
        }
    }

    public static final void PersonalInfoConfirmation(int i, Composer composer, Modifier modifier, Function1 function1) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1054319055);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(2074167908, new ScoreHomeKt$$ExternalSyntheticLambda8(14, function1), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CanvasKt$$ExternalSyntheticLambda0(function1, modifier, i, 6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PersonalInfoSection(PersonalInfoSectionViewModel personalInfoSectionViewModel, Function1 function1, Modifier modifier, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        GapComposer gapComposer;
        Modifier modifier3;
        RecomposeScopeImpl endRestartGroup;
        boolean z;
        int i4;
        boolean z2;
        Modifier.Companion companion;
        personalInfoSectionViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-983328698);
        Applier applier = gapComposer2.applier;
        char c = 2;
        if ((i & 6) == 0) {
            i3 = (gapComposer2.changedInstance(personalInfoSectionViewModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer2.changedInstance(function1) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer2.changed(modifier2) ? 256 : 128;
            if (gapComposer2.shouldExecute(i3 & 1, (i3 & 147) == 146)) {
                gapComposer = gapComposer2;
                gapComposer.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                Modifier modifier4 = i5 != 0 ? companion2 : modifier2;
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
                int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, modifier4);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                Object obj = null;
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
                Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                String stringResource = Room.stringResource(gapComposer2, R.string.profile_personal_title);
                String stringResource2 = Room.stringResource(gapComposer2, R.string.profile_personal_info_subtitle);
                Modifier.Companion companion3 = companion2;
                boolean z3 = false;
                gapComposer = gapComposer2;
                Modifier modifier5 = modifier4;
                boolean z4 = true;
                ViewfinderDefaults.SectionHeader(stringResource, (Modifier) null, (String) null, (Function0) null, stringResource2, gapComposer, 0, 14);
                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                gapComposer.startReplaceGroup(1123646627);
                Iterator it = personalInfoSectionViewModel.rows.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (hasNext) {
                        PersonalInfoRow personalInfoRow = (PersonalInfoRow) it.next();
                        if (personalInfoRow instanceof PersonalInfoRow.LegalName) {
                            gapComposer.startReplaceGroup(-848833701);
                            CellDefaultAccessory.Push push = CellDefaultAccessory.Push.INSTANCE;
                            boolean z5 = (i3 & 112) == 32 ? z4 : z3;
                            Object rememberedValue = gapComposer.rememberedValue();
                            if (z5 || rememberedValue == neverEqualPolicy) {
                                rememberedValue = new PersonalInfoView$$ExternalSyntheticLambda0(20, function1);
                                gapComposer.updateRememberedValue(rememberedValue);
                            }
                            GapComposer gapComposer3 = gapComposer;
                            companion = companion3;
                            i4 = i3;
                            z2 = z3;
                            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(lambda$1678790647, f613lambda$36807944, null, (Function0) rememberedValue, false, false, Expect_jvmKt.rememberComposableLambda(-1740464898, new PdfPreviewViewKt$$ExternalSyntheticLambda2((PersonalInfoRow.LegalName) personalInfoRow, 24), gapComposer), null, push, 0L, gapComposer3, 817889334, 3444);
                            gapComposer = gapComposer3;
                            gapComposer.end(z2);
                        } else {
                            i4 = i3;
                            z2 = z3;
                            companion = companion3;
                            if (personalInfoRow instanceof PersonalInfoRow.Address) {
                                gapComposer.startReplaceGroup(-848353852);
                                CellDefaultAccessory.Push push2 = CellDefaultAccessory.Push.INSTANCE;
                                boolean z6 = (i4 & 112) == 32 ? true : z2;
                                Object rememberedValue2 = gapComposer.rememberedValue();
                                if (z6 || rememberedValue2 == neverEqualPolicy) {
                                    rememberedValue2 = new PersonalInfoView$$ExternalSyntheticLambda0(21, function1);
                                    gapComposer.updateRememberedValue(rememberedValue2);
                                }
                                GapComposer gapComposer4 = gapComposer;
                                CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(lambda$1509308896, lambda$2086504609, null, (Function0) rememberedValue2, false, false, Expect_jvmKt.rememberComposableLambda(1254711591, new PdfPreviewViewKt$$ExternalSyntheticLambda2((PersonalInfoRow.Address) personalInfoRow, 25), gapComposer), null, push2, 0L, gapComposer4, 817889334, 3444);
                                gapComposer = gapComposer4;
                                gapComposer.end(z2);
                            } else {
                                if (!(personalInfoRow instanceof PersonalInfoRow.IdentityVerification)) {
                                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -720119166, z2);
                                }
                                gapComposer.startReplaceGroup(-847889224);
                                IdentityVerificationSectionViewModel.Content content = ((PersonalInfoRow.IdentityVerification) personalInfoRow).content;
                                boolean z7 = (i4 & 112) == 32 ? true : z2;
                                Object rememberedValue3 = gapComposer.rememberedValue();
                                if (z7 || rememberedValue3 == neverEqualPolicy) {
                                    rememberedValue3 = new ProfileKt$$ExternalSyntheticLambda3(23, function1);
                                    gapComposer.updateRememberedValue(rememberedValue3);
                                }
                                GapComposer gapComposer5 = gapComposer;
                                WebSectionKt.IdentityVerificationSection(content, (Function1) rememberedValue3, null, gapComposer5, 0, 4);
                                gapComposer = gapComposer5;
                                gapComposer.end(z2);
                            }
                        }
                        companion3 = companion;
                        z3 = z2;
                        i3 = i4;
                        z4 = true;
                        c = 2;
                        obj = null;
                    } else {
                        int i6 = i3;
                        boolean z8 = z3;
                        Modifier.Companion companion4 = companion3;
                        gapComposer.end(z8);
                        PersonalInfoConfirmationViewModel personalInfoConfirmationViewModel = personalInfoSectionViewModel.confirmationViewModel;
                        if (personalInfoConfirmationViewModel == null) {
                            gapComposer.startReplaceGroup(474556711);
                            gapComposer.end(z8);
                            z = true;
                        } else {
                            gapComposer.startReplaceGroup(474556712);
                            Strings.getSizes(gapComposer).getClass();
                            DefaultSizes.spacing.getClass();
                            Modifier fillMaxWidth = SizeKt.fillMaxWidth(SpacerKt.m300paddingVpY3zN4$default(companion4, 16.0f, RecyclerView.DECELERATION_RATE, 2), 1.0f);
                            Strings.getSizes(gapComposer).getClass();
                            Object obj2 = DefaultSizes.border.annotationsMap;
                            long j = Strings.getColors(gapComposer).semantic.border.subtle;
                            Strings.getSizes(gapComposer).getClass();
                            Modifier m178borderxT4_qwU = ImageKt.m178borderxT4_qwU(fillMaxWidth, 1.0f, j, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f));
                            Strings.getSizes(gapComposer).getClass();
                            Modifier clip = ClipKt.clip(m178borderxT4_qwU, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f));
                            Strings.getSizes(gapComposer).getClass();
                            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(clip, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(4.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.CenterHorizontally, gapComposer, 54);
                            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
                            ComposeUiNode.Companion.getClass();
                            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                            gapComposer.startReusableNode();
                            if (gapComposer.inserting) {
                                gapComposer.createNode(layoutNode$Companion$Constructor$12);
                            } else {
                                gapComposer.useNode();
                            }
                            Updater.m576setimpl(gapComposer, columnMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                            Updater.m576setimpl(gapComposer, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                            DBUtil.SpacerWithinSectionMedium(z8 ? 1 : 0, 1, gapComposer, null);
                            GapComposer gapComposer6 = gapComposer;
                            Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3826, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer6, (Modifier) null, Strings.getTypography(gapComposer).labelMedium, (TextLineBalancing) null, personalInfoConfirmationViewModel.title, (Map) null, (Function1) null, false);
                            Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3826, Strings.getColors(gapComposer6).semantic.text.subtle, (Composer) gapComposer6, (Modifier) null, Strings.getTypography(gapComposer6).bodyMedium, (TextLineBalancing) null, personalInfoConfirmationViewModel.subtitle, (Map) null, (Function1) null, false);
                            ButtonProminence buttonProminence = ButtonProminence.SUBTLE;
                            boolean z9 = (i6 & 112) == 32;
                            Object rememberedValue4 = gapComposer6.rememberedValue();
                            if (z9 || rememberedValue4 == neverEqualPolicy) {
                                rememberedValue4 = new PersonalInfoView$$ExternalSyntheticLambda0(22, function1);
                                gapComposer6.updateRememberedValue(rememberedValue4);
                            }
                            coil3.size.SizeKt.Button((Function0) rememberedValue4, null, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(-1711881381, new ButtonGroupKt$$ExternalSyntheticLambda11(personalInfoConfirmationViewModel, 5), gapComposer6), gapComposer6, 1573248, 58);
                            gapComposer = gapComposer6;
                            z = true;
                            DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
                            gapComposer.end(true);
                            gapComposer.end(false);
                        }
                        gapComposer.end(z);
                        modifier3 = modifier5;
                    }
                }
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new InstrumentCellKt$$ExternalSyntheticLambda9((Object) personalInfoSectionViewModel, function1, modifier3, i, i2, 13);
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 147) == 146)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void RatePlanSection(final RatePlanButtonTreatment ratePlanButtonTreatment, final Function1 function1, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-380013334);
        int i2 = i | (gapComposer.changedInstance(ratePlanButtonTreatment) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        final int i3 = 1;
        final int i4 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
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
            if (ratePlanButtonTreatment instanceof RatePlanButtonTreatment.Upgrade) {
                gapComposer.startReplaceGroup(132552881);
                ViewfinderDefaults.SectionHeader(Room.stringResource(gapComposer, R.string.profile_business_upgrade_title), (Modifier) null, (String) null, (Function0) null, Room.stringResource(gapComposer, R.string.profile_business_upgrade_description), gapComposer, 0, 14);
                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                zzabx.ButtonDefaultGroupVertical(null, Expect_jvmKt.rememberComposableLambda(-77694472, new Function3() { // from class: com.squareup.cash.profile.views.personal.RatePlanSectionKt$$ExternalSyntheticLambda0
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i5 = i4;
                        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                        Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                        final RatePlanButtonTreatment ratePlanButtonTreatment2 = ratePlanButtonTreatment;
                        Function1 function12 = function1;
                        Object[] objArr = 0;
                        final int i6 = 1;
                        switch (i5) {
                            case 0:
                                Composer composer2 = (Composer) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                ((ColumnScope) obj).getClass();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion2, 1.0f);
                                    boolean changed = gapComposer2.changed(function12);
                                    Object rememberedValue = gapComposer2.rememberedValue();
                                    if (changed || rememberedValue == neverEqualPolicy) {
                                        rememberedValue = new PersonalInfoView$$ExternalSyntheticLambda0(24, function12);
                                        gapComposer2.updateRememberedValue(rememberedValue);
                                    }
                                    final Object[] objArr2 = objArr == true ? 1 : 0;
                                    coil3.size.SizeKt.Button((Function0) rememberedValue, fillMaxWidth, null, false, false, null, Expect_jvmKt.rememberComposableLambda(1477599531, new Function3() { // from class: com.squareup.cash.profile.views.personal.RatePlanSectionKt$$ExternalSyntheticLambda4
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                            int i7 = objArr2;
                                            RatePlanButtonTreatment ratePlanButtonTreatment3 = ratePlanButtonTreatment2;
                                            switch (i7) {
                                                case 0:
                                                    Composer composer3 = (Composer) obj5;
                                                    int intValue2 = ((Integer) obj6).intValue();
                                                    ((RowScope) obj4).getClass();
                                                    GapComposer gapComposer3 = (GapComposer) composer3;
                                                    if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((RatePlanButtonTreatment.Upgrade) ratePlanButtonTreatment3).upgradeText, (Map) null, (Function1) null, false);
                                                    } else {
                                                        gapComposer3.skipToGroupEnd();
                                                    }
                                                    break;
                                                default:
                                                    Composer composer4 = (Composer) obj5;
                                                    int intValue3 = ((Integer) obj6).intValue();
                                                    ((RowScope) obj4).getClass();
                                                    GapComposer gapComposer4 = (GapComposer) composer4;
                                                    if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((RatePlanButtonTreatment.Downgrade) ratePlanButtonTreatment3).downgradeText, (Map) null, (Function1) null, false);
                                                    } else {
                                                        gapComposer4.skipToGroupEnd();
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, gapComposer2), gapComposer2, 1572912, 60);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer3 = (Composer) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                ((ColumnScope) obj).getClass();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion2, 1.0f);
                                    boolean changed2 = gapComposer3.changed(function12);
                                    Object rememberedValue2 = gapComposer3.rememberedValue();
                                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                                        rememberedValue2 = new PersonalInfoView$$ExternalSyntheticLambda0(25, function12);
                                        gapComposer3.updateRememberedValue(rememberedValue2);
                                    }
                                    coil3.size.SizeKt.Button((Function0) rememberedValue2, fillMaxWidth2, null, false, false, null, Expect_jvmKt.rememberComposableLambda(-1162932638, new Function3() { // from class: com.squareup.cash.profile.views.personal.RatePlanSectionKt$$ExternalSyntheticLambda4
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                            int i7 = i6;
                                            RatePlanButtonTreatment ratePlanButtonTreatment3 = ratePlanButtonTreatment2;
                                            switch (i7) {
                                                case 0:
                                                    Composer composer32 = (Composer) obj5;
                                                    int intValue22 = ((Integer) obj6).intValue();
                                                    ((RowScope) obj4).getClass();
                                                    GapComposer gapComposer32 = (GapComposer) composer32;
                                                    if (gapComposer32.shouldExecute(intValue22 & 1, (intValue22 & 17) != 16)) {
                                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer32, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((RatePlanButtonTreatment.Upgrade) ratePlanButtonTreatment3).upgradeText, (Map) null, (Function1) null, false);
                                                    } else {
                                                        gapComposer32.skipToGroupEnd();
                                                    }
                                                    break;
                                                default:
                                                    Composer composer4 = (Composer) obj5;
                                                    int intValue3 = ((Integer) obj6).intValue();
                                                    ((RowScope) obj4).getClass();
                                                    GapComposer gapComposer4 = (GapComposer) composer4;
                                                    if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((RatePlanButtonTreatment.Downgrade) ratePlanButtonTreatment3).downgradeText, (Map) null, (Function1) null, false);
                                                    } else {
                                                        gapComposer4.skipToGroupEnd();
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, gapComposer3), gapComposer3, 1572912, 60);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer), gapComposer, 48, 1);
                gapComposer.end(false);
            } else if (ratePlanButtonTreatment instanceof RatePlanButtonTreatment.Downgrade) {
                gapComposer.startReplaceGroup(133009356);
                ViewfinderDefaults.SectionHeader(Room.stringResource(gapComposer, R.string.profile_business_downgrade_title), (Modifier) null, (String) null, (Function0) null, Room.stringResource(gapComposer, R.string.profile_business_downgrade_description), gapComposer, 0, 14);
                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                zzabx.ButtonDefaultGroupVertical(null, Expect_jvmKt.rememberComposableLambda(-1151850513, new Function3() { // from class: com.squareup.cash.profile.views.personal.RatePlanSectionKt$$ExternalSyntheticLambda0
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i5 = i3;
                        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                        Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                        final RatePlanButtonTreatment ratePlanButtonTreatment2 = ratePlanButtonTreatment;
                        Function1 function12 = function1;
                        Object[] objArr = 0;
                        final int i6 = 1;
                        switch (i5) {
                            case 0:
                                Composer composer2 = (Composer) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                ((ColumnScope) obj).getClass();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion2, 1.0f);
                                    boolean changed = gapComposer2.changed(function12);
                                    Object rememberedValue = gapComposer2.rememberedValue();
                                    if (changed || rememberedValue == neverEqualPolicy) {
                                        rememberedValue = new PersonalInfoView$$ExternalSyntheticLambda0(24, function12);
                                        gapComposer2.updateRememberedValue(rememberedValue);
                                    }
                                    final int objArr2 = objArr == true ? 1 : 0;
                                    coil3.size.SizeKt.Button((Function0) rememberedValue, fillMaxWidth, null, false, false, null, Expect_jvmKt.rememberComposableLambda(1477599531, new Function3() { // from class: com.squareup.cash.profile.views.personal.RatePlanSectionKt$$ExternalSyntheticLambda4
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                            int i7 = objArr2;
                                            RatePlanButtonTreatment ratePlanButtonTreatment3 = ratePlanButtonTreatment2;
                                            switch (i7) {
                                                case 0:
                                                    Composer composer32 = (Composer) obj5;
                                                    int intValue22 = ((Integer) obj6).intValue();
                                                    ((RowScope) obj4).getClass();
                                                    GapComposer gapComposer32 = (GapComposer) composer32;
                                                    if (gapComposer32.shouldExecute(intValue22 & 1, (intValue22 & 17) != 16)) {
                                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer32, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((RatePlanButtonTreatment.Upgrade) ratePlanButtonTreatment3).upgradeText, (Map) null, (Function1) null, false);
                                                    } else {
                                                        gapComposer32.skipToGroupEnd();
                                                    }
                                                    break;
                                                default:
                                                    Composer composer4 = (Composer) obj5;
                                                    int intValue3 = ((Integer) obj6).intValue();
                                                    ((RowScope) obj4).getClass();
                                                    GapComposer gapComposer4 = (GapComposer) composer4;
                                                    if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((RatePlanButtonTreatment.Downgrade) ratePlanButtonTreatment3).downgradeText, (Map) null, (Function1) null, false);
                                                    } else {
                                                        gapComposer4.skipToGroupEnd();
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, gapComposer2), gapComposer2, 1572912, 60);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer3 = (Composer) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                ((ColumnScope) obj).getClass();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion2, 1.0f);
                                    boolean changed2 = gapComposer3.changed(function12);
                                    Object rememberedValue2 = gapComposer3.rememberedValue();
                                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                                        rememberedValue2 = new PersonalInfoView$$ExternalSyntheticLambda0(25, function12);
                                        gapComposer3.updateRememberedValue(rememberedValue2);
                                    }
                                    coil3.size.SizeKt.Button((Function0) rememberedValue2, fillMaxWidth2, null, false, false, null, Expect_jvmKt.rememberComposableLambda(-1162932638, new Function3() { // from class: com.squareup.cash.profile.views.personal.RatePlanSectionKt$$ExternalSyntheticLambda4
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                            int i7 = i6;
                                            RatePlanButtonTreatment ratePlanButtonTreatment3 = ratePlanButtonTreatment2;
                                            switch (i7) {
                                                case 0:
                                                    Composer composer32 = (Composer) obj5;
                                                    int intValue22 = ((Integer) obj6).intValue();
                                                    ((RowScope) obj4).getClass();
                                                    GapComposer gapComposer32 = (GapComposer) composer32;
                                                    if (gapComposer32.shouldExecute(intValue22 & 1, (intValue22 & 17) != 16)) {
                                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer32, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((RatePlanButtonTreatment.Upgrade) ratePlanButtonTreatment3).upgradeText, (Map) null, (Function1) null, false);
                                                    } else {
                                                        gapComposer32.skipToGroupEnd();
                                                    }
                                                    break;
                                                default:
                                                    Composer composer4 = (Composer) obj5;
                                                    int intValue3 = ((Integer) obj6).intValue();
                                                    ((RowScope) obj4).getClass();
                                                    GapComposer gapComposer4 = (GapComposer) composer4;
                                                    if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((RatePlanButtonTreatment.Downgrade) ratePlanButtonTreatment3).downgradeText, (Map) null, (Function1) null, false);
                                                    } else {
                                                        gapComposer4.skipToGroupEnd();
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, gapComposer3), gapComposer3, 1572912, 60);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer), gapComposer, 48, 1);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1805419384);
                gapComposer.end(false);
            }
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SecurityLockView$$ExternalSyntheticLambda1(modifier2, (Object) ratePlanButtonTreatment, function1, i, 22);
        }
    }
}
