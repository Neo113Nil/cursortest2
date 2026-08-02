package com.squareup.cash.benefits.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.compose.ViewfinderKt;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda10;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.Dp;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.local.views.cart.CreateCartErrorBannerKt$$ExternalSyntheticLambda3;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda16;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.fillr.e;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacg;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacp;
import com.google.mlkit.common.internal.zzd;
import com.google.mlkit.vision.text.zza;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.BadgeKt$$ExternalSyntheticLambda2;
import com.squareup.cash.arcade.components.CopyCodeKt$$ExternalSyntheticLambda10;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda5;
import com.squareup.cash.banking.viewmodels.BenefitDetailsViewModel;
import com.squareup.cash.banking.views.BalanceHomeViewKt$$ExternalSyntheticLambda11;
import com.squareup.cash.banking.views.BalanceHomeViewKt$$ExternalSyntheticLambda12;
import com.squareup.cash.banking.views.BankingDialog$$ExternalSyntheticLambda1;
import com.squareup.cash.banking.views.BankingDialogKt$$ExternalSyntheticLambda2;
import com.squareup.cash.banking.views.BankingDialogKt$$ExternalSyntheticLambda5;
import com.squareup.cash.bankingbenefits.api.v1_0.app.Prominence;
import com.squareup.cash.bankingbenefits.api.v1_0.core.ui.elements.ButtonRow;
import com.squareup.cash.bankingbenefits.api.v1_0.core.ui.elements.RowAction;
import com.squareup.cash.bankingbenefits.api.v1_0.core.ui.elements.TintedIcon;
import com.squareup.cash.benefits.viewmodels.BenefitsHubViewModel;
import com.squareup.cash.blockers.views.CashtagViewKt$$ExternalSyntheticLambda10;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda10;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda6;
import com.squareup.cash.wallet.views.WalletHomeViewKt$WalletHome$2$2$1;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.util.Strings;
import com.squareup.util.cash.ColorsKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public abstract class BenefitsHubViewKt {
    public static final BenefitsHubViewModel.Loaded pdsaActive;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Prominence.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                zza zzaVar = Prominence.Companion;
                iArr[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                zza zzaVar2 = Prominence.Companion;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                zza zzaVar3 = Prominence.Companion;
                iArr[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ButtonRow.Prominence.values().length];
            try {
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                e eVar = ButtonRow.Prominence.Companion;
                iArr2[3] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                e eVar2 = ButtonRow.Prominence.Companion;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                e eVar3 = ButtonRow.Prominence.Companion;
                iArr2[0] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    static {
        List take;
        UiAvatar uiAvatar = new UiAvatar(null, null, null, null, null, null, null, IptcConstants.IPTC_NON_EXTENDED_RECORD_MAXIMUM_SIZE);
        EmptyList emptyList = EmptyList.INSTANCE;
        BenefitDetailsViewModel benefitDetailsViewModel = new BenefitDetailsViewModel(uiAvatar, "", emptyList, emptyList);
        zzd zzdVar = Icons.Companion;
        BenefitsHubViewModel.Loaded.PageHeaderViewModel pageHeaderViewModel = new BenefitsHubViewModel.Loaded.PageHeaderViewModel(new TintedIcon(new Icon("pfbkAI"), ColorsKt.toColor("#33B843"), 4), "Start using your paycheck benefits", "Active through 9/30");
        Prominence prominence = Prominence.PROMINENT;
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new BenefitsHubViewModel.Loaded.Insight[]{new BenefitsHubViewModel.Loaded.Insight("$112", "Estimated savings on overdraft fees this year", prominence, benefitDetailsViewModel), new BenefitsHubViewModel.Loaded.Insight("$320", "Total saved in ATM and deposit fees this year", prominence, benefitDetailsViewModel), new BenefitsHubViewModel.Loaded.Insight("$34", "Total savings interest earned this year", prominence, benefitDetailsViewModel)});
        pdsaActive = new BenefitsHubViewModel.Loaded(pageHeaderViewModel, listOf, new BenefitsHubViewModel.Loaded.BenefitsViewModel(CollectionsKt__CollectionsKt.listOf((Object[]) new BenefitsHubViewModel.Loaded.BenefitsViewModel.BenefitsRow[]{new BenefitsHubViewModel.Loaded.BenefitsViewModel.BenefitsRow(new TintedIcon(new Icon("0WpBiM"), (Color) null, 6), "Free overdraft coverage", "**$200** in coverage available", false, RowAction.ID.OVERDRAFT_COVERAGE, "Start", ""), new BenefitsHubViewModel.Loaded.BenefitsViewModel.BenefitsRow(new TintedIcon(new Icon("vwT7d5"), (Color) null, 6), "Up to 4.5% interest", "Save and earn our highest interest rate", false, RowAction.ID.SAVINGS, null, null)}), "Learn more about these benefits", null), new BenefitsHubViewModel.Loaded.DefaultPerksViewModel("Take Control of your Cash", CollectionsKt__CollectionsKt.listOf((Object[]) new List[]{CollectionsKt__CollectionsKt.listOf((Object[]) new BenefitsHubViewModel.Loaded.DefaultPerk[]{new BenefitsHubViewModel.Loaded.DefaultPerk(new TintedIcon(new Icon("qgR1hM"), (Color) null, 6), "FDIC Insurance", "Your balance is covered up to $250,000."), new BenefitsHubViewModel.Loaded.DefaultPerk(new TintedIcon(new Icon("Racp5N"), (Color) null, 6), "Security", "Enjoy 24/7 fraud monitoring and alerts.")}), CollectionsKt__CollectionsKt.listOf((Object[]) new BenefitsHubViewModel.Loaded.DefaultPerk[]{new BenefitsHubViewModel.Loaded.DefaultPerk(new TintedIcon(new Icon("niaC9A"), (Color) null, 6), "Save or invest", "Save your money"), new BenefitsHubViewModel.Loaded.DefaultPerk(new TintedIcon(new Icon("1pViqo"), (Color) null, 6), "Early Payday", "Get paid earlier. Seriously. So early that this text may become incredibly long just so you know how early you can get paid. Two whole days. Wow.")})})), new BenefitsHubViewModel.Loaded.CommonQuestionsViewModel("Common questions", CollectionsKt__CollectionsKt.listOf((Object[]) new BenefitsHubViewModel.Loaded.CommonQuestionsViewModel.QuestionAndAnswer[]{new BenefitsHubViewModel.Loaded.CommonQuestionsViewModel.QuestionAndAnswer("How does it work?", "When you directly deposit $300 or more in paychecks each month, you unlock benefits that help you get more out of every paycheck. [Learn more](https://cash.app/help)."), new BenefitsHubViewModel.Loaded.CommonQuestionsViewModel.QuestionAndAnswer("Why are some benefits not available to me?", "Free overdraft coverage, lending benefits, and interest savings are not available for **sponsored accounts**.")})), new BenefitsHubViewModel.Loaded.CallToActionViewModel(RowAction.ID.SETUP_DIRECT_DEPOSIT, "Do Something", ButtonRow.Prominence.PROMINENT, ""), CollectionsKt__CollectionsJVMKt.listOf(new BenefitsHubViewModel.Loaded.Disclosure(new TintedIcon(new Icon("QyvFl9"), (Color) null, 6), "Your balance is eligible for FDIC pass-through insurance through our partner banks, Wells Fargo Bank, N.A. and Sutton Bank, Members FDIC, for up to $250,000 per customer when aggregated with all other deposits held in the same legal capacity at each partner bank.\n\nCash App is a financial services platform, and not an FDIC-insured bank. Prepaid debit cards issued by Sutton Bank. See [terms and conditions](https://cash.app).")));
        new TintedIcon(new Icon("ZUJTka"), ColorsKt.toColor("#959595"), 4);
        if (listOf != null && (take = CollectionsKt.take(listOf, 1)) != null) {
            List<BenefitsHubViewModel.Loaded.Insight> list = take;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            for (BenefitsHubViewModel.Loaded.Insight insight : list) {
                Prominence prominence2 = Prominence.SUBTLE;
                String str = insight.hero;
                String str2 = insight.label;
                BenefitDetailsViewModel benefitDetailsViewModel2 = insight.details;
                str.getClass();
                str2.getClass();
                arrayList.add(new BenefitsHubViewModel.Loaded.Insight(str, str2, prominence2, benefitDetailsViewModel2));
            }
        }
        List<BenefitsHubViewModel.Loaded.BenefitsViewModel.BenefitsRow> list2 = pdsaActive.benefits.rows;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        for (BenefitsHubViewModel.Loaded.BenefitsViewModel.BenefitsRow benefitsRow : list2) {
            TintedIcon tintedIcon = benefitsRow.icon;
            String str3 = benefitsRow.title;
            String str4 = benefitsRow.subtitle;
            RowAction.ID id = benefitsRow.actionId;
            String str5 = benefitsRow.clientRoute;
            tintedIcon.getClass();
            str3.getClass();
            str4.getClass();
            arrayList2.add(new BenefitsHubViewModel.Loaded.BenefitsViewModel.BenefitsRow(tintedIcon, str3, str4, true, id, null, str5));
        }
        ColorsKt.toColor("#959595");
        BenefitsHubViewModel.Loaded loaded = pdsaActive;
        BenefitsHubViewModel.Loaded.DefaultPerksViewModel defaultPerksViewModel = loaded.defaultPerks;
        loaded.disclosures.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v17 */
    public static final void BenefitsHub(BenefitsHubViewModel.Loaded loaded, Function1 function1, Composer composer, int i) {
        int i2;
        BenefitsHubViewModel.Loaded loaded2;
        Function1 function12;
        GapComposer gapComposer;
        ?? r5;
        int i3;
        loaded.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1138057573);
        Applier applier = gapComposer2.applier;
        if ((i & 6) == 0) {
            i2 = i | (gapComposer2.changedInstance(loaded) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ScrollState rememberScrollState = ImageKt.rememberScrollState(gapComposer2);
            Unit unit = Unit.INSTANCE;
            int i4 = i2 & 112;
            boolean changed = gapComposer2.changed(rememberScrollState) | (i4 == 32);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = new WalletHomeViewKt$WalletHome$2$2$1(rememberScrollState, function1, null, 1);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer2, unit, (Function2) rememberedValue);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape);
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m177backgroundbw27NRU);
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
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            NavigationType navigationType = NavigationType.CLOSE;
            boolean z = i4 == 32;
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (z || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new BenefitsHubViewKt$$ExternalSyntheticLambda4(9, function1);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            GapComposer gapComposer3 = gapComposer2;
            DBUtil.TitleBarSub((String) null, navigationType, fillMaxWidth, (DynamicColorConfiguration) null, (Function0) rememberedValue2, (Modifier) null, (Function3) null, gapComposer3, 438, 104);
            Modifier navigationBarsPadding = SpacerKt.navigationBarsPadding(ImageKt.verticalScroll$default(companion, rememberScrollState, false, 14));
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer3, 0);
            int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, navigationBarsPadding);
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
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer3, null);
            loaded2 = loaded;
            ViewfinderKt.HeroHeader(Expect_jvmKt.rememberComposableLambda(2075356155, new CashtagViewKt$$ExternalSyntheticLambda10(loaded2, 14), gapComposer3), (Modifier) null, (Function2) null, (TextStyle) null, gapComposer3, 6, 14);
            BenefitsStatus(loaded2.header, null, gapComposer3, 0);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer3.consume(staticProvidableCompositionLocal)).getClass();
            Request$Priority$EnumUnboxingLocalUtility.m(DefaultSizes.spacing, companion, 64.0f, gapComposer3);
            List list = loaded2.insights;
            if (list == null) {
                gapComposer3.startReplaceGroup(711379070);
                r5 = 0;
                gapComposer3.end(false);
                function12 = function1;
                i3 = i4;
            } else {
                r5 = 0;
                gapComposer3.startReplaceGroup(711379071);
                function12 = function1;
                i3 = i4;
                InsightsCarousel(i3, gapComposer3, null, list, function12);
                ((DefaultSizes) gapComposer3.consume(staticProvidableCompositionLocal)).getClass();
                SpacerKt.Spacer(gapComposer3, SizeKt.m277height3ABfNKs(companion, 32.0f));
                gapComposer3.end(false);
            }
            BenefitsList(loaded2.benefits, function12, null, gapComposer3, i3);
            DBUtil.SpacerBetweenSectionXLarge(r5, 1, gapComposer3, null);
            DefaultPerks(loaded2.defaultPerks, null, gapComposer3, r5);
            DBUtil.SpacerBetweenSectionXLarge(r5, 1, gapComposer3, null);
            CommonQuestions(loaded2.commonQuestions, function12, gapComposer3, i3);
            BenefitsHubViewModel.Loaded.CallToActionViewModel callToActionViewModel = loaded2.callToAction;
            if (callToActionViewModel == null) {
                gapComposer3.startReplaceGroup(711746327);
                gapComposer3.end(r5);
            } else {
                gapComposer3.startReplaceGroup(711746328);
                DBUtil.SpacerBetweenSectionLarge(r5, 1, gapComposer3, null);
                CallToAction(callToActionViewModel, function12, gapComposer3, i3);
                gapComposer3.end(r5);
            }
            DBUtil.SpacerBetweenSectionLarge(r5, 1, gapComposer3, null);
            Disclosures(loaded2.disclosures, function12, gapComposer3, i3);
            gapComposer3.end(true);
            gapComposer3.end(true);
            gapComposer = gapComposer3;
        } else {
            loaded2 = loaded;
            function12 = function1;
            GapComposer gapComposer4 = gapComposer2;
            gapComposer4.skipToGroupEnd();
            gapComposer = gapComposer4;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BalanceHomeViewKt$$ExternalSyntheticLambda11(loaded2, function12, i, 23);
        }
    }

    public static final void BenefitsHubView(BenefitsHubViewModel benefitsHubViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        benefitsHubViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1492099356);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(benefitsHubViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1029809713, new BadgeKt$$ExternalSyntheticLambda2(24, benefitsHubViewModel, function1), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BalanceHomeViewKt$$ExternalSyntheticLambda11(benefitsHubViewModel, function1, i, 22);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v10 */
    public static final void BenefitsList(BenefitsHubViewModel.Loaded.BenefitsViewModel benefitsViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        GapComposer gapComposer;
        NeverEqualPolicy neverEqualPolicy;
        long j;
        Icons icons;
        androidx.compose.ui.graphics.Color m;
        ComposableLambdaImpl rememberComposableLambda;
        Function0 function0;
        String str;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-916236230);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = i | (gapComposer2.changedInstance(benefitsViewModel) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 32 : 16;
        }
        int i4 = i2 | MLKEMEngine.KyberPolyBytes;
        final int i5 = 1;
        final boolean z = 0;
        if (gapComposer2.shouldExecute(i4 & 1, (i4 & 147) != 146)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, companion);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            androidx.compose.ui.graphics.Color color = null;
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
            gapComposer2.startReplaceGroup(-974624409);
            Iterator it = benefitsViewModel.rows.iterator();
            GapComposer gapComposer3 = gapComposer2;
            while (true) {
                boolean hasNext = it.hasNext();
                neverEqualPolicy = Composer.Companion.Empty;
                if (!hasNext) {
                    break;
                }
                final BenefitsHubViewModel.Loaded.BenefitsViewModel.BenefitsRow benefitsRow = (BenefitsHubViewModel.Loaded.BenefitsViewModel.BenefitsRow) it.next();
                Icon icon = benefitsRow.icon.icon;
                if (icon == null || (str = icon.arcade_id) == null) {
                    icons = null;
                } else {
                    Icons.Companion.getClass();
                    icons = zzd.get(str);
                }
                Color color2 = benefitsRow.icon.tint_color;
                if (color2 == null) {
                    gapComposer3.startReplaceGroup(101607680);
                    gapComposer3.end(z);
                    m = null;
                } else {
                    m = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer3, 2081487649, color2, gapComposer3, z);
                }
                if (icons == null) {
                    gapComposer3.startReplaceGroup(101689737);
                    gapComposer3.end(z);
                    rememberComposableLambda = null;
                } else {
                    gapComposer3.startReplaceGroup(101689738);
                    rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1425293268, new BankingDialog$$ExternalSyntheticLambda1(17, icons, m, benefitsRow), gapComposer3);
                    gapComposer3.end(z);
                }
                String str2 = benefitsRow.actionText;
                CellDefaultAccessory.Label label = str2 != null ? new CellDefaultAccessory.Label(str2, i3) : null;
                RowAction.ID id = benefitsRow.actionId;
                if (id == null) {
                    gapComposer3.startReplaceGroup(102331716);
                    gapComposer3.end(z);
                    function0 = null;
                } else {
                    gapComposer3.startReplaceGroup(102331717);
                    int i6 = (gapComposer3.changed(id.ordinal()) ? 1 : 0) | ((i4 & 112) == 32 ? i5 : z);
                    Object rememberedValue = gapComposer3.rememberedValue();
                    Object obj = rememberedValue;
                    if (i6 != 0 || rememberedValue == neverEqualPolicy) {
                        BankingDialogKt$$ExternalSyntheticLambda5 bankingDialogKt$$ExternalSyntheticLambda5 = new BankingDialogKt$$ExternalSyntheticLambda5(23, function1, id);
                        gapComposer3.updateRememberedValue(bankingDialogKt$$ExternalSyntheticLambda5);
                        obj = bankingDialogKt$$ExternalSyntheticLambda5;
                    }
                    gapComposer3.end(z);
                    function0 = (Function0) obj;
                }
                GapComposer gapComposer4 = gapComposer3;
                CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(rememberComposableLambda, Expect_jvmKt.rememberComposableLambda(1988491782, new Function2() { // from class: com.squareup.cash.benefits.views.BenefitsHubViewKt$$ExternalSyntheticLambda24
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        int i7 = z;
                        BenefitsHubViewModel.Loaded.BenefitsViewModel.BenefitsRow benefitsRow2 = benefitsRow;
                        switch (i7) {
                            case 0:
                                Composer composer2 = (Composer) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                GapComposer gapComposer5 = (GapComposer) composer2;
                                if (gapComposer5.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, benefitsRow2.title, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer5.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer3 = (Composer) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                GapComposer gapComposer6 = (GapComposer) composer3;
                                if (gapComposer6.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    LazyDslKt.m304MarkdownTextpCuZGqc(benefitsRow2.subtitle, null, null, null, 0L, null, null, null, 0, 0, 0, gapComposer6, 48, 2044);
                                } else {
                                    gapComposer6.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer3), null, function0, (benefitsRow.disabled ? 1 : 0) ^ i5, false, Expect_jvmKt.rememberComposableLambda(-254593396, new Function2() { // from class: com.squareup.cash.benefits.views.BenefitsHubViewKt$$ExternalSyntheticLambda24
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        int i7 = i5;
                        BenefitsHubViewModel.Loaded.BenefitsViewModel.BenefitsRow benefitsRow2 = benefitsRow;
                        switch (i7) {
                            case 0:
                                Composer composer2 = (Composer) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                GapComposer gapComposer5 = (GapComposer) composer2;
                                if (gapComposer5.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, benefitsRow2.title, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer5.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer3 = (Composer) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                GapComposer gapComposer6 = (GapComposer) composer3;
                                if (gapComposer6.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    LazyDslKt.m304MarkdownTextpCuZGqc(benefitsRow2.subtitle, null, null, null, 0L, null, null, null, 0, 0, 0, gapComposer6, 48, 2044);
                                } else {
                                    gapComposer6.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer3), null, label, 0L, gapComposer4, 12582960, 3412);
                z = z;
                gapComposer3 = gapComposer4;
                companion = companion;
                i3 = 2;
                i5 = 1;
            }
            boolean z2 = z;
            Modifier.Companion companion2 = companion;
            gapComposer3.end(z2);
            String str3 = benefitsViewModel.openExplanationText;
            if (str3 == null) {
                gapComposer3.startReplaceGroup(-147614035);
                gapComposer3.end(z2);
                modifier2 = companion2;
            } else {
                gapComposer3.startReplaceGroup(-147614034);
                gapComposer3.startReplaceGroup(-974592378);
                AnnotatedString.Builder builder = new AnnotatedString.Builder();
                Color color3 = benefitsViewModel.openExplanationTextColor;
                if (color3 == null) {
                    gapComposer3.startReplaceGroup(247397682);
                    gapComposer3.end(z2);
                } else {
                    color = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer3, 700717231, color3, gapComposer3, z2);
                }
                androidx.compose.ui.graphics.Color color4 = color;
                if (color4 == null) {
                    gapComposer3.startReplaceGroup(700719305);
                    Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, z2);
                    } else {
                        gapComposer3.startReplaceGroup(-1762997739);
                        gapComposer3.end(z2);
                    }
                    j = colors.semantic.text.link;
                    gapComposer3.end(z2);
                } else {
                    gapComposer3.startReplaceGroup(700716205);
                    gapComposer3.end(z2);
                    j = color4.value;
                }
                int pushStyle = builder.pushStyle(new SpanStyle(j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.Underline, (Shadow) null, 61438));
                try {
                    builder.append(str3);
                    builder.pop(pushStyle);
                    AnnotatedString annotatedString = builder.toAnnotatedString();
                    gapComposer3.end(z2);
                    TextStyle textStyle = ((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).linkXSmall;
                    Role role = new Role(z2 ? 1 : 0);
                    boolean z3 = (i4 & 112) == 32 ? true : z2 ? 1 : 0;
                    Object rememberedValue2 = gapComposer3.rememberedValue();
                    Object obj2 = rememberedValue2;
                    if (z3 || rememberedValue2 == neverEqualPolicy) {
                        BenefitsHubViewKt$$ExternalSyntheticLambda4 benefitsHubViewKt$$ExternalSyntheticLambda4 = new BenefitsHubViewKt$$ExternalSyntheticLambda4(7, function1);
                        gapComposer3.updateRememberedValue(benefitsHubViewKt$$ExternalSyntheticLambda4);
                        obj2 = benefitsHubViewKt$$ExternalSyntheticLambda4;
                    }
                    Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(companion2, false, null, role, (Function0) obj2, 11);
                    modifier2 = companion2;
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                    ((DefaultSizes) gapComposer3.consume(staticProvidableCompositionLocal)).getClass();
                    DefaultSizes.spacing.getClass();
                    ((DefaultSizes) gapComposer3.consume(staticProvidableCompositionLocal)).getClass();
                    Room.m1164Text25TpFw(0, 0, 0, 5, 0, 0, 3832, 0L, (Composer) gapComposer3, SpacerKt.m299paddingVpY3zN4(m183clickableoSLSa3U$default, 16.0f, 16.0f), annotatedString, textStyle, (TextLineBalancing) null, (Map) null, (Function1) null, false);
                    gapComposer3.end(z2);
                } catch (Throwable th) {
                    builder.pop(pushStyle);
                    throw th;
                }
            }
            gapComposer3.end(true);
            gapComposer = gapComposer3;
        } else {
            gapComposer2.skipToGroupEnd();
            modifier2 = modifier;
            gapComposer = gapComposer2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CopyCodeKt$$ExternalSyntheticLambda10(i, 23, modifier2, benefitsViewModel, function1);
        }
    }

    public static final void BenefitsStatus(BenefitsHubViewModel.Loaded.PageHeaderViewModel pageHeaderViewModel, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        Icons icons;
        String str;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-733549357);
        int i2 = (gapComposer.changedInstance(pageHeaderViewModel) ? 4 : 2) | i | 48;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Icon icon = pageHeaderViewModel.icon.icon;
            ComposableLambdaImpl composableLambdaImpl = null;
            if (icon == null || (str = icon.arcade_id) == null) {
                icons = null;
            } else {
                Icons.Companion.getClass();
                icons = zzd.get(str);
            }
            if (icons == null) {
                gapComposer.startReplaceGroup(-375062163);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-375062162);
                composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(-321470093, new BadgeKt$$ExternalSyntheticLambda2(26, icons, pageHeaderViewModel), gapComposer);
                gapComposer.end(false);
            }
            ComposableLambdaImpl composableLambdaImpl2 = composableLambdaImpl;
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1309787074, new CashtagViewKt$$ExternalSyntheticLambda10(pageHeaderViewModel, 12), gapComposer);
            modifier2 = Modifier.Companion.$$INSTANCE;
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(composableLambdaImpl2, rememberComposableLambda, modifier2, null, false, false, null, null, null, 0L, gapComposer, 432, 4088);
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BadgeKt$$ExternalSyntheticLambda2(pageHeaderViewModel, modifier2, i, 27);
        }
    }

    public static final void CallToAction(BenefitsHubViewModel.Loaded.CallToActionViewModel callToActionViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1494798019);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(callToActionViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(-1242584575, new BankingDialogKt$$ExternalSyntheticLambda2(18, function1, callToActionViewModel), gapComposer), gapComposer, 24576, 15);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BalanceHomeViewKt$$ExternalSyntheticLambda11(callToActionViewModel, function1, i, 20);
        }
    }

    public static final void CommonQuestions(BenefitsHubViewModel.Loaded.CommonQuestionsViewModel commonQuestionsViewModel, Function1 function1, Composer composer, int i) {
        Function1 function12 = function1;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(530217839);
        int i2 = 2;
        int i3 = (i & 6) == 0 ? (gapComposer.changedInstance(commonQuestionsViewModel) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(function12) ? 32 : 16;
        }
        boolean z = true;
        boolean z2 = false;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
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
            ViewfinderDefaults.SectionHeader(commonQuestionsViewModel.title, (Modifier) null, (String) null, (Function0) null, (String) null, gapComposer, 0, 30);
            gapComposer.startReplaceGroup(-634035795);
            for (BenefitsHubViewModel.Loaded.CommonQuestionsViewModel.QuestionAndAnswer questionAndAnswer : commonQuestionsViewModel.questions) {
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-420514349, new CashtagViewKt$$ExternalSyntheticLambda10(questionAndAnswer, 11), gapComposer);
                ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-945881255, new BadgeKt$$ExternalSyntheticLambda2(25, questionAndAnswer, function12), gapComposer);
                Modifier.Companion companion2 = companion;
                int i4 = i2;
                CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(rememberComposableLambda, null, null, false, false, rememberComposableLambda2, null, 0L, null, null, gapComposer, 1572870, 1982);
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                ModalKt.HorizontalDivider(0, 0, gapComposer, SpacerKt.m300paddingVpY3zN4$default(companion2, 16.0f, RecyclerView.DECELERATION_RATE, i4));
                z = true;
                companion = companion2;
                i2 = i4;
                z2 = false;
                function12 = function1;
            }
            gapComposer.end(z2);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BalanceHomeViewKt$$ExternalSyntheticLambda11(commonQuestionsViewModel, function1, i, 21);
        }
    }

    public static final void DefaultPerkItem(BenefitsHubViewModel.Loaded.DefaultPerk defaultPerk, Modifier modifier, Composer composer, int i) {
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        Icons icons;
        Modifier.Companion companion;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13;
        GapComposer gapComposer;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15;
        Arrangement$Top$1 arrangement$Top$1;
        float f;
        String str;
        BenefitsHubViewModel.Loaded.DefaultPerk defaultPerk2 = defaultPerk;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1512281228);
        Applier applier = gapComposer2.applier;
        int i2 = i | (gapComposer2.changedInstance(defaultPerk2) ? 4 : 2) | (gapComposer2.changed(modifier) ? 32 : 16);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            BiasAlignment.Horizontal horizontal = Alignment.Companion.CenterHorizontally;
            Object rememberedValue = gapComposer2.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BenefitsHubViewKt$$ExternalSyntheticLambda2(12);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Modifier outlined = outlined(1, gapComposer2, SizeKt.m279heightInVpY3zN4$default(SemanticsModifierKt.semantics(modifier, false, (Function1) rememberedValue), 170.0f, RecyclerView.DECELERATION_RATE, 2), null);
            Arrangement$Top$1 arrangement$Top$12 = SpacerKt.Top;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$12, horizontal, gapComposer2, 48);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, outlined);
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
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$16);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$17);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$18);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$12);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$19 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$19);
            Icon icon = defaultPerk2.icon.icon;
            if (icon == null || (str = icon.arcade_id) == null) {
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$16;
                icons = null;
            } else {
                Icons.Companion.getClass();
                Icons icons2 = zzd.get(str);
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$16;
                icons = icons2;
            }
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            if (icons == null) {
                gapComposer2.startReplaceGroup(-1513236659);
                gapComposer2.end(false);
                composeUiNode$Companion$SetModifier$15 = composeUiNode$Companion$SetModifier$1;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$18;
                composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$17;
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$19;
                gapComposer = gapComposer2;
                companion = companion2;
                f = RecyclerView.DECELERATION_RATE;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                arrangement$Top$1 = arrangement$Top$12;
            } else {
                gapComposer2.startReplaceGroup(-1513236658);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                ((DefaultSizes) gapComposer2.consume(staticProvidableCompositionLocal)).getClass();
                DefaultSizes.spacing.getClass();
                ((DefaultSizes) gapComposer2.consume(staticProvidableCompositionLocal)).getClass();
                Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion2, RecyclerView.DECELERATION_RATE, 32.0f, RecyclerView.DECELERATION_RATE, 16.0f, 5);
                companion = companion2;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$18;
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$19;
                gapComposer = gapComposer2;
                composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$17;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                composeUiNode$Companion$SetModifier$15 = composeUiNode$Companion$SetModifier$1;
                arrangement$Top$1 = arrangement$Top$12;
                f = RecyclerView.DECELERATION_RATE;
                Trace.m1191Iconww6aTOc(icons, (String) null, m302paddingqDBjuR0$default, 0L, gapComposer, 48, 8);
                gapComposer.end(false);
            }
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier.Companion companion3 = companion;
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion3, 16.0f, f, 2);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 48);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$15);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$14);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$12, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$13);
            defaultPerk2 = defaultPerk;
            gapComposer2 = gapComposer;
            Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3834, 0L, (Composer) gapComposer2, (Modifier) null, Strings.getTypography(gapComposer).labelMedium, (TextLineBalancing) null, defaultPerk2.title, (Map) null, (Function1) null, false);
            String str2 = defaultPerk2.subtitle;
            TextStyle textStyle = Strings.getTypography(gapComposer2).bodyXSmall;
            long j = Strings.getColors(gapComposer2).semantic.text.subtle;
            Strings.getSizes(gapComposer2).getClass();
            Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3824, j, (Composer) gapComposer2, SpacerKt.m302paddingqDBjuR0$default(companion3, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 8.0f, 7), textStyle, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
            gapComposer2.end(true);
            gapComposer2.end(true);
        } else {
            gapComposer2.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BadgeKt$$ExternalSyntheticLambda2(defaultPerk2, modifier, i, 29);
        }
    }

    public static final void DefaultPerks(BenefitsHubViewModel.Loaded.DefaultPerksViewModel defaultPerksViewModel, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(407282917);
        Applier applier = gapComposer.applier;
        int i2 = (gapComposer.changedInstance(defaultPerksViewModel) ? 4 : 2) | i | 48;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            modifier2 = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier2);
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
            ViewfinderDefaults.SectionHeader(defaultPerksViewModel.title, (Modifier) null, (String) null, (Function0) null, (String) null, gapComposer, 0, 30);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(modifier2, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), horizontal, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
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
            gapComposer.startReplaceGroup(-1588782982);
            for (List list : defaultPerksViewModel.perks) {
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
                Modifier height = OffsetKt.height(modifier2, IntrinsicSize.Max);
                RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$SpacedAligned, Alignment.Companion.Top, gapComposer, 0);
                int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, height);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$12);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                gapComposer.startReplaceGroup(-1860954569);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    DefaultPerkItem((BenefitsHubViewModel.Loaded.DefaultPerk) it.next(), SizeKt.fillMaxSize(new LayoutWeightElement(1.0f, true), 1.0f), gapComposer, 0);
                }
                gapComposer.end(false);
                gapComposer.end(true);
            }
            Boxes$$ExternalSyntheticOutline1.m(gapComposer, false, true, true);
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BadgeKt$$ExternalSyntheticLambda2(defaultPerksViewModel, modifier2, i, 28);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [androidx.compose.ui.Modifier] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r15v3, types: [androidx.compose.runtime.GapComposer] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r16v1, types: [androidx.compose.ui.Modifier] */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [com.squareup.protos.cash.ui.Color] */
    /* JADX WARN: Type inference failed for: r7v8, types: [androidx.compose.ui.graphics.Color] */
    /* JADX WARN: Type inference failed for: r8v4, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.GapComposer] */
    /* JADX WARN: Type inference failed for: r8v5, types: [androidx.compose.runtime.GapComposer] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    public static final void Disclosures(List list, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        Icons icons;
        ?? r7;
        long j;
        int i3;
        BenefitsHubViewModel.Loaded.Disclosure disclosure;
        Icons icons2;
        ?? r8;
        char c;
        Icon icon;
        String str;
        Function1 function12 = function1;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(2013583623);
        if ((i & 6) == 0) {
            i2 = i | (gapComposer2.changedInstance(list) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(function12) ? 32 : 16;
        }
        int i4 = i2;
        int i5 = 1;
        boolean z = 0;
        if (gapComposer2.shouldExecute(i4 & 1, (i4 & 19) != 18)) {
            ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(Modifier.Companion.$$INSTANCE, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer2, 48);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m300paddingVpY3zN4$default);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            Icons icons3 = null;
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
            gapComposer2.startReplaceGroup(-1521912924);
            Iterator it = list.iterator();
            ?? r15 = gapComposer2;
            while (it.hasNext()) {
                BenefitsHubViewModel.Loaded.Disclosure disclosure2 = (BenefitsHubViewModel.Loaded.Disclosure) it.next();
                TintedIcon tintedIcon = disclosure2.icon;
                if (tintedIcon == null || (icon = tintedIcon.icon) == null || (str = icon.arcade_id) == null) {
                    icons = icons3;
                } else {
                    Icons.Companion.getClass();
                    icons = zzd.get(str);
                }
                if (icons == null) {
                    r15.startReplaceGroup(-1835451744);
                    r15.end(z);
                    i3 = -1762997026;
                    icons2 = icons3;
                    r8 = r15;
                    disclosure = disclosure2;
                } else {
                    r15.startReplaceGroup(-1835451743);
                    TintedIcon tintedIcon2 = disclosure2.icon;
                    ?? r72 = tintedIcon2 != null ? tintedIcon2.tint_color : icons3;
                    if (r72 == 0) {
                        r15.startReplaceGroup(2093628541);
                        r15.end(z);
                        r7 = icons3;
                    } else {
                        r7 = BalanceFeedKt$$ExternalSyntheticOutline0.m((GapComposer) r15, -486652924, (Color) r72, (GapComposer) r15, z);
                    }
                    if (r7 == 0) {
                        r15.startReplaceGroup(-486651419);
                        Colors colors = (Colors) r15.consume(ArcadeThemeKt.LocalColors);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m((GapComposer) r15, -1762997026, (GapComposer) r15, z);
                        } else {
                            r15.startReplaceGroup(-1762997739);
                            r15.end(z);
                        }
                        j = colors.semantic.icon.extraSubtle;
                        r15.end(z);
                    } else {
                        r15.startReplaceGroup(-486653775);
                        r15.end(z);
                        j = r7.value;
                    }
                    i3 = -1762997026;
                    ?? r82 = r15;
                    ?? r11 = icons3;
                    disclosure = disclosure2;
                    Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, j, (Composer) r82, 48, 4);
                    DBUtil.SpacerWithinSectionMedium(z, i5, r82, r11);
                    r82.end(z);
                    r8 = r82;
                    icons2 = r11;
                }
                String str2 = disclosure.markdown;
                TextStyle textStyle = ((Typography) r8.consume(ArcadeThemeKt.LocalTypography)).bodyXSmall;
                Colors colors2 = (Colors) r8.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m((GapComposer) r8, i3, (GapComposer) r8, z);
                } else {
                    r8.startReplaceGroup(-1762997739);
                    r8.end(z);
                }
                long j2 = colors2.semantic.text.subtle;
                int i6 = (i4 & 112) == 32 ? i5 : z;
                Object rememberedValue = r8.rememberedValue();
                if (i6 != 0 || rememberedValue == Composer.Companion.Empty) {
                    c = 16;
                    rememberedValue = new BalanceHomeViewKt$$ExternalSyntheticLambda12(function12, z, 16);
                    r8.updateRememberedValue(rememberedValue);
                } else {
                    c = 16;
                }
                ?? r16 = icons2;
                GapComposer gapComposer3 = r8;
                int i7 = i5;
                int i8 = z;
                LazyDslKt.m304MarkdownTextpCuZGqc(str2, (Function2) rememberedValue, null, textStyle, j2, null, null, new TextLineBalancing(i5), 0, 0, 3, gapComposer3, 0, 868);
                DBUtil.SpacerWithinSectionMedium(i8, i7, gapComposer3, r16);
                icons3 = r16;
                i5 = i7;
                z = i8;
                function12 = function1;
                r15 = gapComposer3;
            }
            r15.end(z);
            r15.end(i5);
            gapComposer = r15;
        } else {
            gapComposer2.skipToGroupEnd();
            gapComposer = gapComposer2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TabContentViewKt$$ExternalSyntheticLambda16(list, function1, i, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0069  */
    /* renamed from: InsightCard-IColEu4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3414InsightCardIColEu4(BenefitsHubViewModel.Loaded.Insight insight, Function1 function1, Modifier modifier, Dp dp, Composer composer, int i, int i2) {
        int i3;
        Dp dp2;
        Dp dp3;
        RecomposeScopeImpl endRestartGroup;
        Function0 function0;
        long j;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1386568808);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i3 = (gapComposer.changedInstance(insight) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changed(modifier) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            dp2 = dp;
            i3 |= gapComposer.changed(dp2) ? 2048 : 1024;
            if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) == 1170)) {
                gapComposer.skipToGroupEnd();
                dp3 = dp2;
            } else {
                Dp dp4 = i4 != 0 ? null : dp2;
                Modifier fillMaxHeight = SizeKt.fillMaxHeight(modifier, 1.0f);
                if (insight.details == null) {
                    gapComposer.startReplaceGroup(1724361672);
                    gapComposer.end(false);
                    function0 = null;
                } else {
                    gapComposer.startReplaceGroup(1724361673);
                    boolean changedInstance = ((i3 & 112) == 32) | gapComposer.changedInstance(insight);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new BankingDialogKt$$ExternalSyntheticLambda5(25, function1, insight);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    function0 = (Function0) rememberedValue;
                    gapComposer.end(false);
                }
                Modifier outlined = outlined(0, gapComposer, fillMaxHeight, function0);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, outlined);
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
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                Integer valueOf = Integer.valueOf(hashCode);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
                OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
                Strings.getSizes(gapComposer).getClass();
                DefaultSizes.spacing.getClass();
                Strings.getSizes(gapComposer).getClass();
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                Modifier then = SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, 32.0f, RecyclerView.DECELERATION_RATE, 16.0f, 5).then(dp4 != null ? SizeKt.m290width3ABfNKs(companion, dp4.value) : SizeKt.fillMaxWidth(companion, 1.0f));
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, then);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                Dp dp5 = dp4;
                zzacg.m2009HeroNumericsHeadertv5qRRQ(Expect_jvmKt.rememberComposableLambda(-1343875986, new CashtagViewKt$$ExternalSyntheticLambda10(insight, 13), gapComposer), (Modifier) null, 0, (Function2) null, (Function3) null, (Function3) null, (Function2) null, gapComposer, 6, EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                Strings.getSizes(gapComposer).getClass();
                Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                String str = insight.label;
                Painter painter = Icons.InformationOutline16.painter(gapComposer);
                long j2 = Strings.getColors(gapComposer).semantic.icon.extraSubtle;
                if (insight.prominence == Prominence.SUBTLE) {
                    gapComposer.startReplaceGroup(-124896531);
                    j = Strings.getColors(gapComposer).semantic.text.subtle;
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-124826037);
                    j = Strings.getColors(gapComposer).semantic.text.standard;
                    gapComposer.end(false);
                }
                zzacp.m2014InlineIconTextQqsJerU(str, painter, m300paddingVpY3zN4$default, j2, null, null, j, null, 0, 0, 0, 0, false, RecyclerView.DECELERATION_RATE, gapComposer, Painter.$stable << 3, 0, 32688);
                gapComposer = gapComposer;
                gapComposer.end(true);
                gapComposer.end(true);
                dp3 = dp5;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new AvatarsKt$$ExternalSyntheticLambda5(insight, function1, modifier, dp3, i, i2, 14);
                return;
            }
            return;
        }
        dp2 = dp;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) == 1170)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void InsightsCarousel(int i, Composer composer, Modifier modifier, List list, Function1 function1) {
        Modifier modifier2;
        Function1 function12 = function1;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1559416805);
        int i2 = (i & 6) == 0 ? (gapComposer.changedInstance(list) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function12) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            int size = list.size();
            modifier2 = Modifier.Companion.$$INSTANCE;
            if (size == 1) {
                gapComposer.startReplaceGroup(-2075038434);
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                m3414InsightCardIColEu4((BenefitsHubViewModel.Loaded.Insight) CollectionsKt.first(list), function12, SpacerKt.m300paddingVpY3zN4$default(modifier2, 16.0f, RecyclerView.DECELERATION_RATE, 2), null, gapComposer, i3 & 112, 8);
                gapComposer.end(false);
                function12 = function1;
            } else {
                gapComposer.startReplaceGroup(-2074849303);
                boolean changedInstance = gapComposer.changedInstance(list);
                Object rememberedValue = gapComposer.rememberedValue();
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (changedInstance || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new OpenSourceKt$$ExternalSyntheticLambda6(list, 3);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Modifier height = OffsetKt.height(ImageKt.scroll$default(SemanticsModifierKt.semantics(modifier2, false, (Function1) rememberedValue), ImageKt.rememberScrollState(gapComposer), true, false), IntrinsicSize.Max);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                DefaultSizes.spacing.getClass();
                Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(height, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Top, gapComposer, 0);
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
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
                Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                gapComposer.startReplaceGroup(-824504795);
                int i4 = 0;
                for (Object obj : list) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                    BenefitsHubViewModel.Loaded.Insight insight = (BenefitsHubViewModel.Loaded.Insight) obj;
                    boolean changed = gapComposer.changed(i4);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changed || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new DatePickerKt$$ExternalSyntheticLambda10(i4, 5);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    m3414InsightCardIColEu4(insight, function1, SemanticsModifierKt.semantics(modifier2, false, (Function1) rememberedValue2), new Dp(280.0f), gapComposer, (i3 & 112) | 3072, 0);
                    i4 = i5;
                }
                function12 = function1;
                Boxes$$ExternalSyntheticOutline1.m(gapComposer, false, true, false);
            }
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CreateCartErrorBannerKt$$ExternalSyntheticLambda3(list, function12, modifier2, i);
        }
    }

    public static final Modifier outlined(int i, Composer composer, Modifier modifier, Function0 function0) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        Modifier modifier2 = Modifier.Companion.$$INSTANCE;
        if (function0 == null) {
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startReplaceGroup(-450864044);
            gapComposer.end(false);
        } else {
            GapComposer gapComposer2 = (GapComposer) composer;
            gapComposer2.startReplaceGroup(-450744384);
            ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
            Object obj = DefaultSizes.border.entries;
            Modifier clip = ClipKt.clip(modifier2, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f));
            String stringResource = Room.stringResource(gapComposer2, R.string.benefits_hub_insight_content_description);
            Role role = new Role(0);
            boolean changed = gapComposer2.changed(function0);
            Object rememberedValue = gapComposer2.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ComposeDialogKt$$ExternalSyntheticLambda10(4, function0);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            modifier2 = ImageKt.m183clickableoSLSa3U$default(clip, false, stringResource, role, (Function0) rememberedValue, 9);
            gapComposer2.end(false);
        }
        Modifier then = modifier.then(modifier2);
        StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
        GapComposer gapComposer3 = (GapComposer) composer;
        ((DefaultSizes) gapComposer3.consume(staticProvidableCompositionLocal)).getClass();
        Object obj2 = DefaultSizes.border.annotationsMap;
        Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
        if (colors == null) {
            colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
        } else {
            gapComposer3.startReplaceGroup(-1762997739);
            gapComposer3.end(false);
        }
        long j = colors.semantic.border.subtle;
        ((DefaultSizes) gapComposer3.consume(staticProvidableCompositionLocal)).getClass();
        return ImageKt.m178borderxT4_qwU(then, 1.0f, j, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f));
    }
}
