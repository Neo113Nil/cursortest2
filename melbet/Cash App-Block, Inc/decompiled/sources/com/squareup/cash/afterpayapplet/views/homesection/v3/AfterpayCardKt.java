package com.squareup.cash.afterpayapplet.views.homesection.v3;

import android.content.res.Configuration;
import android.icu.text.MessageFormat;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.internal.Lock;
import androidx.compose.animation.AnimatedContentScopeImpl;
import androidx.compose.animation.BoundsTransform;
import androidx.compose.animation.RemeasureImpl;
import androidx.compose.animation.SharedBoundsNode$$ExternalSyntheticLambda0;
import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.TransitionKt$$ExternalSyntheticLambda9;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.gestures.snapping.SnapPosition$Start;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement$Center$1;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.pager.DefaultPagerState;
import androidx.compose.foundation.pager.PageSize;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerKt$$ExternalSyntheticLambda2;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.IconButtonKt$$ExternalSyntheticLambda0;
import androidx.compose.material.OutlinedTextFieldKt$$ExternalSyntheticLambda4;
import androidx.compose.material.SwipeToDismissKt$$ExternalSyntheticLambda4;
import androidx.compose.material3.AlertDialogKt$$ExternalSyntheticLambda0;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda17;
import androidx.compose.material3.SliderKt$$ExternalSyntheticLambda2;
import androidx.compose.material3.SliderKt$$ExternalSyntheticLambda5;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.draw.ShadowGraphicsLayerElement;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.platform.LazyWindowInfo;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.semantics.CustomAccessibilityAction;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.tooling.PreviewActivity$$ExternalSyntheticLambda1;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.local.views.brand.checkout.CheckoutPaymentSectionKt$$ExternalSyntheticLambda9;
import app.cash.local.views.cart.CreateCartErrorBannerKt$$ExternalSyntheticLambda3;
import app.cash.local.views.internal.DismissableToastKt$$ExternalSyntheticLambda4;
import app.cash.local.views.internal.LocalMapKt$$ExternalSyntheticLambda10;
import app.cash.local.views.wallet.LocalHomeViewKt$$ExternalSyntheticLambda0;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda26;
import app.cash.molecule.MoleculeKt$immediateClockFlow$1$1$1;
import app.cash.molecule.PlatformKt;
import app.cash.redwood.CombinedModifier$$ExternalSyntheticLambda0;
import bo.app.n$$ExternalSyntheticLambda2;
import bo.app.re$$ExternalSyntheticOutline0;
import bo.app.y0$$ExternalSyntheticLambda0;
import coil3.RealImageLoader;
import coil3.compose.AsyncImageKt;
import coil3.compose.LocalImageLoaderKt;
import coil3.compose.UtilsKt$$ExternalSyntheticLambda1;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.mlkit_genai_prompt.zzabw;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacn;
import com.google.android.gms.internal.mlkit_genai_prompt.zzmh;
import com.google.android.gms.internal.time.zzel$EnumUnboxingLocalUtility;
import com.google.mlkit.common.internal.zzc;
import com.google.mlkit.common.internal.zzd;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticLambda9;
import com.squareup.cash.activity.views.receipts.ReceiptUiKt$$ExternalSyntheticLambda4;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader;
import com.squareup.cash.afterpayapplet.viewmodels.CardThumbnailDisplayStyle;
import com.squareup.cash.afterpayapplet.viewmodels.FooterImageContent;
import com.squareup.cash.afterpayapplet.viewmodels.RemoteImage;
import com.squareup.cash.afterpayapplet.viewmodels.Tap;
import com.squareup.cash.afterpayapplet.viewmodels.TappableIcon;
import com.squareup.cash.afterpayapplet.views.AfterpaySearchViewKt$$ExternalSyntheticLambda16;
import com.squareup.cash.afterpayapplet.views.AfterpaySearchViewKt$$ExternalSyntheticLambda43;
import com.squareup.cash.afterpayapplet.views.homesection.ImageTextSectionKt$$ExternalSyntheticLambda0;
import com.squareup.cash.afterpayapplet.views.homesection.ImageTextSectionKt$$ExternalSyntheticLambda1;
import com.squareup.cash.afterpayapplet.views.homesection.RetroSectionKt$$ExternalSyntheticLambda5;
import com.squareup.cash.aiedge.MLKitTitleGenerator$prepareModel$1;
import com.squareup.cash.amountchooser.views.AtmPickerGridKt$$ExternalSyntheticLambda4;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.appmessages.views.InlineAppMessageKt$$ExternalSyntheticLambda8;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Haptics;
import com.squareup.cash.arcade.HapticsKt;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.MotionKt$$ExternalSyntheticLambda0;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.CopyCodeKt$$ExternalSyntheticLambda10;
import com.squareup.cash.arcade.components.DividerKt$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.cell.RealCellActivityAccessoryScope;
import com.squareup.cash.arcade.components.haptic.HapticVibratorKt;
import com.squareup.cash.arcade.components.haptic.RealHapticVibrator;
import com.squareup.cash.arcade.components.list.ListOrderedKt$$ExternalSyntheticLambda11;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.theme.RippleKt;
import com.squareup.cash.arcade.theme.RippleNodeFactory;
import com.squareup.cash.arcade.util.AvatarsKt;
import com.squareup.cash.banking.views.BankingDialogKt$$ExternalSyntheticLambda5;
import com.squareup.cash.banking.views.BenefitsLeafletViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.blockers.views.SetNameViewKt$SetName$2$1;
import com.squareup.cash.borrow.views.ExpandedLoanHistoryListKt$$ExternalSyntheticLambda5;
import com.squareup.cash.card.onboarding.CardContouredText;
import com.squareup.cash.card.onboarding.StyledCardViewKt;
import com.squareup.cash.card.onboarding.StyledCardViewModel;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.money.loadable.LoadableStateKt;
import com.squareup.cash.profile.views.personal.PersonalInfoViewKt$$ExternalSyntheticLambda9;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda16;
import com.squareup.cash.ui.widget.text.AnimatedAmountTextView;
import com.squareup.cash.wallet.views.Hero3DCardViewKt$InteractiveCard$13$touchInput$1$1;
import com.squareup.cash.work.views.clockin.DisclaimerTextKt$$ExternalSyntheticLambda0;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.comparisons.ComparisonsKt___ComparisonsJvmKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.Tags;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public abstract class AfterpayCardKt {

    /* renamed from: lambda$-1465337368, reason: not valid java name */
    public static final ComposableLambdaImpl f136lambda$1465337368 = new ComposableLambdaImpl(new AfterpaySearchViewKt$$ExternalSyntheticLambda16(19), false, -1465337368);

    /* renamed from: lambda$-271024524, reason: not valid java name */
    public static final ComposableLambdaImpl f137lambda$271024524;

    /* renamed from: lambda$-814953346, reason: not valid java name */
    public static final ComposableLambdaImpl f138lambda$814953346;
    public static final ComposableLambdaImpl lambda$1114729874;
    public static final ComposableLambdaImpl lambda$1596512710;
    public static final ComposableLambdaImpl lambda$1659785927;
    public static final ComposableLambdaImpl lambda$203752105;

    static {
        new ComposableLambdaImpl(new BenefitsLeafletViewKt$$ExternalSyntheticLambda5((byte) 0, 5), false, -1236640541);
        new ComposableLambdaImpl(new BenefitsLeafletViewKt$$ExternalSyntheticLambda5((byte) 0, 6), false, -2117596897);
        f137lambda$271024524 = new ComposableLambdaImpl(new BenefitsLeafletViewKt$$ExternalSyntheticLambda5((byte) 0, 7), false, -271024524);
        lambda$1596512710 = new ComposableLambdaImpl(new BenefitsLeafletViewKt$$ExternalSyntheticLambda5((byte) 0, 8), false, 1596512710);
        new ComposableLambdaImpl(new BenefitsLeafletViewKt$$ExternalSyntheticLambda5((byte) 0, 9), false, 1123170182);
        f138lambda$814953346 = new ComposableLambdaImpl(new AfterpaySearchViewKt$$ExternalSyntheticLambda16(20), false, -814953346);
        lambda$1659785927 = new ComposableLambdaImpl(new AfterpaySearchViewKt$$ExternalSyntheticLambda16(21), false, 1659785927);
        lambda$1114729874 = new ComposableLambdaImpl(new AfterpaySearchViewKt$$ExternalSyntheticLambda16(22), false, 1114729874);
        lambda$203752105 = new ComposableLambdaImpl(new AfterpaySearchViewKt$$ExternalSyntheticLambda16(23), false, 203752105);
        new ComposableLambdaImpl(new BenefitsLeafletViewKt$$ExternalSyntheticLambda5((byte) 0, 10), false, 694781757);
        new ComposableLambdaImpl(new BenefitsLeafletViewKt$$ExternalSyntheticLambda5((byte) 0, 11), false, -1226708656);
    }

    public static final void AdditionalOverduePaymentLabelRow(String str, String str2, Composer composer, int i) {
        String str3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-953195419);
        int i2 = i | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changed(str2) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
            Modifier clip = ClipKt.clip(Modifier.Companion.$$INSTANCE, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f));
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new AfterpaySearchViewKt$$ExternalSyntheticLambda43(17);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier semantics = SemanticsModifierKt.semantics(clip, true, (Function1) rememberedValue);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, vertical, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, semantics);
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
            Room.m1165Text25TpFw(0, 0, 0, 0, i2 & 14, 0, 4082, Strings.getColors(gapComposer).semantic.text.warning, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            Room.m1165Text25TpFw(0, 0, 0, 0, 6, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, " · ", (Map) null, (Function1) null, false);
            str3 = str2;
            Room.m1165Text25TpFw(0, 0, 0, 0, (i2 >> 3) & 14, 0, 4080, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) new LayoutWeightElement(1.0f, false), Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
            gapComposer.end(true);
        } else {
            str3 = str2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PreviewActivity$$ExternalSyntheticLambda1(str, i, 2, str3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0406  */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r2v36, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v68 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AfterpayAppletCalendarHeroSection(final Modifier modifier, final AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar paymentCalendar, boolean z, final AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.CalendarDate calendarDate, final List list, final AnimatedAmountTextView.Amount amount, final boolean z2, final boolean z3, Function1 function1, final Function1 function12, final Function1 function13, final Function1 function14, final Function1 function15, Function1 function16, final boolean z4, Composer composer, final int i) {
        Function1 function17;
        Function1 function18;
        final boolean z5;
        GapComposer gapComposer;
        Object setNameViewKt$SetName$2$1;
        int i2;
        List list2;
        MutableState mutableState;
        int i3;
        AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar paymentCalendar2;
        List list3;
        NeverEqualPolicy neverEqualPolicy;
        Applier applier;
        int i4;
        AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.CalendarDate calendarDate2;
        AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar paymentCalendar3;
        boolean z6;
        boolean z7;
        String str;
        boolean z8;
        String str2;
        Function0 function0;
        Modifier.Companion companion;
        boolean z9;
        ?? r15;
        int i5;
        boolean z10;
        int i6;
        float f;
        GapComposer gapComposer2;
        ?? r2;
        int i7;
        GapComposer gapComposer3;
        List list4;
        Function0 function02;
        boolean z11;
        int i8;
        List list5;
        List list6;
        AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.CalendarDate calendarDate3 = calendarDate;
        paymentCalendar.getClass();
        Tap tap = paymentCalendar.secondaryButtonTapAction;
        list.getClass();
        function1.getClass();
        function12.getClass();
        function13.getClass();
        function14.getClass();
        function15.getClass();
        function16.getClass();
        GapComposer gapComposer4 = (GapComposer) composer;
        gapComposer4.startRestartGroup(1870478896);
        Applier applier2 = gapComposer4.applier;
        int i9 = i | (gapComposer4.changed(modifier) ? 4 : 2) | (gapComposer4.changedInstance(paymentCalendar) ? 32 : 16) | MLKEMEngine.KyberPolyBytes | (gapComposer4.changedInstance(calendarDate3) ? 2048 : 1024) | (gapComposer4.changedInstance(list) ? 16384 : 8192) | (gapComposer4.changed(amount) ? PKIFailureInfo.unsupportedVersion : 65536) | (gapComposer4.changed(z2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted) | (gapComposer4.changed(z3) ? 8388608 : 4194304);
        int i10 = 438 | (gapComposer4.changedInstance(function16) ? (char) 2048 : (char) 1024) | (gapComposer4.changed(z4) ? (char) 16384 : (char) 8192);
        if (gapComposer4.shouldExecute(i9 & 1, ((i9 & 306783379) == 306783378 && (i10 & 9363) == 9362) ? false : true)) {
            List list7 = paymentCalendar.dates;
            boolean changedInstance = gapComposer4.changedInstance(calendarDate3) | gapComposer4.changedInstance(paymentCalendar);
            Object rememberedValue = gapComposer4.rememberedValue();
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            Continuation continuation = null;
            if (changedInstance || rememberedValue == neverEqualPolicy2) {
                i2 = i10;
                list2 = list7;
                setNameViewKt$SetName$2$1 = new SetNameViewKt$SetName$2$1(calendarDate3, paymentCalendar, function1, continuation, 5);
                gapComposer4.updateRememberedValue(setNameViewKt$SetName$2$1);
            } else {
                i2 = i10;
                setNameViewKt$SetName$2$1 = rememberedValue;
                list2 = list7;
            }
            Updater.LaunchedEffect(gapComposer4, list2, (Function2) setNameViewKt$SetName$2$1);
            Object rememberedValue2 = gapComposer4.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy2) {
                rememberedValue2 = Updater.mutableStateOf$default(Boolean.TRUE);
                gapComposer4.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState2 = (MutableState) rememberedValue2;
            boolean changedInstance2 = gapComposer4.changedInstance(list) | gapComposer4.changedInstance(calendarDate3);
            Object rememberedValue3 = gapComposer4.rememberedValue();
            if (changedInstance2 || rememberedValue3 == neverEqualPolicy2) {
                mutableState = mutableState2;
                i3 = i2;
                paymentCalendar2 = paymentCalendar;
                zzmh zzmhVar = new zzmh(list, function1, calendarDate3, mutableState, null, 16);
                list3 = list;
                calendarDate3 = calendarDate3;
                gapComposer4.updateRememberedValue(zzmhVar);
                rememberedValue3 = zzmhVar;
            } else {
                i3 = i2;
                list3 = list;
                mutableState = mutableState2;
                paymentCalendar2 = paymentCalendar;
            }
            Updater.LaunchedEffect(gapComposer4, list3, (Function2) rememberedValue3);
            String stringResource = Room.stringResource(gapComposer4, R.string.afterpay_applet_zero_balance);
            int i11 = i3 & 7168;
            boolean changedInstance3 = gapComposer4.changedInstance(calendarDate3) | ((i9 & 458752) == 131072) | gapComposer4.changedInstance(paymentCalendar2) | gapComposer4.changed(stringResource) | (i11 == 2048);
            Object rememberedValue4 = gapComposer4.rememberedValue();
            if (changedInstance3 || rememberedValue4 == neverEqualPolicy2) {
                AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar paymentCalendar4 = paymentCalendar2;
                neverEqualPolicy = neverEqualPolicy2;
                applier = applier2;
                i4 = 0;
                Hero3DCardViewKt$InteractiveCard$13$touchInput$1$1.AnonymousClass1 anonymousClass1 = new Hero3DCardViewKt$InteractiveCard$13$touchInput$1$1.AnonymousClass1(calendarDate3, amount, function13, function15, paymentCalendar4, stringResource, mutableState, function16, (Continuation) null);
                calendarDate2 = calendarDate3;
                paymentCalendar3 = paymentCalendar4;
                gapComposer4.updateRememberedValue(anonymousClass1);
                rememberedValue4 = anonymousClass1;
            } else {
                calendarDate2 = calendarDate3;
                applier = applier2;
                neverEqualPolicy = neverEqualPolicy2;
                paymentCalendar3 = paymentCalendar2;
                i4 = 0;
            }
            Updater.LaunchedEffect(gapComposer4, calendarDate2, (Function2) rememberedValue4);
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer4, i4);
            int hashCode = Long.hashCode(gapComposer4.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer4.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer4, fillMaxWidth);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer4.startReusableNode();
            if (gapComposer4.inserting) {
                gapComposer4.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer4.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer4, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer4, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer4, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer4, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer4, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion2, 1.0f), 16.0f, RecyclerView.DECELERATION_RATE, 2);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer4, 48);
            int hashCode2 = Long.hashCode(gapComposer4.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer4.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer4, m300paddingVpY3zN4$default);
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer4.startReusableNode();
            if (gapComposer4.inserting) {
                gapComposer4.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer4.useNode();
            }
            Updater.m576setimpl(gapComposer4, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer4, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer4, composeUiNode$Companion$SetModifier$13, gapComposer4, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer4, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            Object rememberedValue5 = gapComposer4.rememberedValue();
            NeverEqualPolicy neverEqualPolicy3 = neverEqualPolicy;
            if (rememberedValue5 == neverEqualPolicy3) {
                rememberedValue5 = new AfterpaySearchViewKt$$ExternalSyntheticLambda43(16);
                gapComposer4.updateRememberedValue(rememberedValue5);
            }
            Modifier semantics = SemanticsModifierKt.semantics(companion2, false, (Function1) rememberedValue5);
            TextStyle textStyle = ((Typography) gapComposer4.consume(ArcadeThemeKt.LocalTypography)).numeralLarge;
            Colors colors = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
            } else {
                gapComposer4.startReplaceGroup(-1762997739);
                gapComposer4.end(false);
            }
            int i12 = i9 >> 3;
            VisibleKt.m3482AnimatedAmountTextJDMA8c0(semantics, textStyle, colors.semantic.text.standard, 0, amount, null, z3, 0L, gapComposer4, i12 & 57344, EnumC0170g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE);
            GapComposer gapComposer5 = gapComposer4;
            SpacerKt.Spacer(gapComposer5, SizeKt.m277height3ABfNKs(companion2, 4.0f));
            if (calendarDate2 != null && (list6 = calendarDate2.treatments) != null) {
                List list8 = list6;
                if (!(list8 instanceof Collection) || !list8.isEmpty()) {
                    Iterator it = list8.iterator();
                    while (it.hasNext()) {
                        if (((AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.DateTreatment) it.next()) instanceof AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.DateTreatment.Overdue) {
                            z6 = true;
                            break;
                        }
                    }
                }
            }
            z6 = false;
            if (z6 && calendarDate2 != null && (list5 = calendarDate2.treatments) != null) {
                List list9 = list5;
                if (!(list9 instanceof Collection) || !list9.isEmpty()) {
                    Iterator it2 = list9.iterator();
                    while (it2.hasNext()) {
                        if (((AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.DateTreatment) it2.next()) instanceof AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.DateTreatment.PaymentDue) {
                            z7 = true;
                            break;
                        }
                    }
                }
            }
            z7 = false;
            String str3 = paymentCalendar3.secondaryButtonText;
            if (z7) {
                gapComposer5.startReplaceGroup(-48689687);
                function14.invoke(Boolean.TRUE);
                String str4 = calendarDate2.formattedTimeUntilDue;
                List list10 = calendarDate2.treatments;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list10) {
                    if (obj instanceof AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.DateTreatment.PaymentDue) {
                        arrayList.add(obj);
                    }
                }
                String str5 = ((AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.DateTreatment.PaymentDue) CollectionsKt.first((List) arrayList)).amountFormatted;
                r15 = 1;
                String format2 = new MessageFormat(Room.stringResource(gapComposer5, R.string.afterpay_applet_due_today)).format(SVG$Unit$EnumUnboxingLocalUtility.m(1, str5, "amount", str5));
                format2.getClass();
                AdditionalOverduePaymentLabelRow(str4, format2, gapComposer5, 0);
                SpacerKt.Spacer(gapComposer5, SizeKt.m277height3ABfNKs(companion2, 4.0f));
                if (tap == null) {
                    gapComposer5.startReplaceGroup(-47895530);
                    gapComposer5.end(false);
                    z11 = false;
                    i8 = i11;
                    function02 = null;
                } else {
                    gapComposer5.startReplaceGroup(-47895529);
                    int i13 = i11;
                    boolean changedInstance4 = (i13 == 2048) | gapComposer5.changedInstance(tap);
                    Object rememberedValue6 = gapComposer5.rememberedValue();
                    if (changedInstance4 || rememberedValue6 == neverEqualPolicy3) {
                        rememberedValue6 = new RetroSectionKt$$ExternalSyntheticLambda5(function16, tap, 7);
                        gapComposer5.updateRememberedValue(rememberedValue6);
                    }
                    function02 = (Function0) rememberedValue6;
                    z11 = false;
                    gapComposer5.end(false);
                    i8 = i13;
                }
                boolean z12 = z11;
                SecondaryLabelRow(null, str3, true, function02, gapComposer5, 390);
                gapComposer5.end(z12);
                companion = companion2;
                z10 = z12;
                function18 = function16;
                i5 = i8;
            } else {
                int i14 = i11;
                gapComposer5.startReplaceGroup(-47803862);
                if (calendarDate2 == null) {
                    str = re$$ExternalSyntheticOutline0.m(gapComposer5, -47657170, R.string.afterpay_applet_due_this_week, gapComposer5, false);
                    z8 = z6;
                } else {
                    gapComposer5.startReplaceGroup(-47571641);
                    gapComposer5.end(false);
                    str = calendarDate2.formattedTimeUntilDue;
                    z8 = z6;
                    if (str.length() <= 0) {
                        str2 = null;
                        if (tap != null) {
                            gapComposer5.startReplaceGroup(-47238826);
                            gapComposer5.end(false);
                            function0 = null;
                        } else {
                            gapComposer5.startReplaceGroup(-47238825);
                            boolean changedInstance5 = (i14 == 2048) | gapComposer5.changedInstance(tap);
                            Object rememberedValue7 = gapComposer5.rememberedValue();
                            if (changedInstance5 || rememberedValue7 == neverEqualPolicy3) {
                                rememberedValue7 = new RetroSectionKt$$ExternalSyntheticLambda5(function16, tap, 8);
                                gapComposer5.updateRememberedValue(rememberedValue7);
                            }
                            function0 = (Function0) rememberedValue7;
                            gapComposer5.end(false);
                        }
                        companion = companion2;
                        function18 = function16;
                        SecondaryLabelRow(str2, str3, z8, function0, gapComposer5, 0);
                        if (z2) {
                            z9 = false;
                            gapComposer5.startReplaceGroup(-46900770);
                            gapComposer5.end(false);
                        } else {
                            re$$ExternalSyntheticOutline0.m(gapComposer5, -47056452, companion, 4.0f, gapComposer5);
                            SpacerKt.Spacer(gapComposer5, SizeKt.m277height3ABfNKs(companion, TextUnit.m1059getValueimpl(((Typography) gapComposer5.consume(ArcadeThemeKt.LocalTypography)).bodyMedium.paragraphStyle.lineHeight)));
                            z9 = false;
                            gapComposer5.end(false);
                        }
                        gapComposer5.end(z9);
                        r15 = 1;
                        z10 = z9;
                        i5 = i14;
                    }
                }
                str2 = str;
                if (tap != null) {
                }
                companion = companion2;
                function18 = function16;
                SecondaryLabelRow(str2, str3, z8, function0, gapComposer5, 0);
                if (z2) {
                }
                gapComposer5.end(z9);
                r15 = 1;
                z10 = z9;
                i5 = i14;
            }
            gapComposer5.end(r15);
            if (z4) {
                function17 = function1;
                i6 = i5;
                f = 1.0f;
                gapComposer5.startReplaceGroup(1830078536);
                gapComposer5.end(z10);
                r2 = z10;
                gapComposer2 = gapComposer5;
            } else {
                gapComposer5.startReplaceGroup(1829424095);
                DBUtil.SpacerBetweenSectionLarge(z10 ? 1 : 0, r15, gapComposer5, null);
                List list11 = paymentCalendar3.dates;
                boolean z13 = paymentCalendar3.isLoadingMoreDates;
                boolean z14 = i5 == 2048;
                Object rememberedValue8 = gapComposer5.rememberedValue();
                if (z14 || rememberedValue8 == neverEqualPolicy3) {
                    function17 = function1;
                    rememberedValue8 = new PersonalInfoViewKt$$ExternalSyntheticLambda9(function17, function18, 1);
                    gapComposer5.updateRememberedValue(rememberedValue8);
                } else {
                    function17 = function1;
                }
                Function1 function19 = (Function1) rememberedValue8;
                boolean z15 = i5 == 2048;
                Object rememberedValue9 = gapComposer5.rememberedValue();
                if (z15 || rememberedValue9 == neverEqualPolicy3) {
                    rememberedValue9 = new UtilsKt$$ExternalSyntheticLambda1(23, function18);
                    gapComposer5.updateRememberedValue(rememberedValue9);
                }
                Function1 function110 = (Function1) rememberedValue9;
                Object rememberedValue10 = gapComposer5.rememberedValue();
                if (rememberedValue10 == neverEqualPolicy3) {
                    rememberedValue10 = new UtilsKt$$ExternalSyntheticLambda1(24, function12);
                    gapComposer5.updateRememberedValue(rememberedValue10);
                }
                Function1 function111 = (Function1) rememberedValue10;
                boolean z16 = i5 == 2048;
                Object rememberedValue11 = gapComposer5.rememberedValue();
                if (z16 || rememberedValue11 == neverEqualPolicy3) {
                    list4 = list11;
                    rememberedValue11 = new UtilsKt$$ExternalSyntheticLambda1(25, function18);
                    gapComposer5.updateRememberedValue(rememberedValue11);
                } else {
                    list4 = list11;
                }
                f = 1.0f;
                i6 = i5;
                AfterpayAppletCalendarRow(list4, calendarDate2, z13, function19, function110, function111, (Function1) rememberedValue11, gapComposer5, (i12 & 896) | 6);
                GapComposer gapComposer6 = gapComposer5;
                r2 = 0;
                gapComposer6.end(false);
                gapComposer2 = gapComposer6;
            }
            AfterpayAppletHomeContentViewModel.HomeSection.ButtonModel buttonModel = paymentCalendar3.primaryButton;
            if (buttonModel == null) {
                gapComposer2.startReplaceGroup(1830118556);
                gapComposer2.end(r2);
                gapComposer3 = gapComposer2;
            } else {
                gapComposer2.startReplaceGroup(1830118557);
                DBUtil.SpacerBetweenSectionLarge(r2, 1, gapComposer2, null);
                Modifier m300paddingVpY3zN4$default2 = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion, f), 16.0f, RecyclerView.DECELERATION_RATE, 2);
                ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                boolean changedInstance6 = (i6 == 2048) | gapComposer2.changedInstance(buttonModel);
                Object rememberedValue12 = gapComposer2.rememberedValue();
                if (changedInstance6 || rememberedValue12 == neverEqualPolicy3) {
                    i7 = 3;
                    rememberedValue12 = new ImageTextSectionKt$$ExternalSyntheticLambda1(function18, buttonModel, 3);
                    gapComposer2.updateRememberedValue(rememberedValue12);
                } else {
                    i7 = 3;
                }
                GapComposer gapComposer7 = gapComposer2;
                coil3.size.SizeKt.ButtonCta((Function0) rememberedValue12, m300paddingVpY3zN4$default2, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(826273219, new ImageTextSectionKt$$ExternalSyntheticLambda0(buttonModel, i7), gapComposer2), gapComposer7, 1573296, 56);
                GapComposer gapComposer8 = gapComposer7;
                gapComposer8.end(false);
                gapComposer3 = gapComposer8;
            }
            z5 = true;
            gapComposer3.end(true);
            gapComposer = gapComposer3;
        } else {
            function17 = function1;
            function18 = function16;
            GapComposer gapComposer9 = gapComposer4;
            gapComposer9.skipToGroupEnd();
            z5 = z;
            gapComposer = gapComposer9;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            final Function1 function112 = function18;
            final Function1 function113 = function17;
            endRestartGroup.block = new Function2(paymentCalendar, z5, calendarDate, list, amount, z2, z3, function113, function12, function13, function14, function15, function112, z4, i) { // from class: com.squareup.cash.afterpayapplet.views.homesection.v3.AfterpayAppletCalendarHeroSectionKt$$ExternalSyntheticLambda9
                public final /* synthetic */ AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar f$1;
                public final /* synthetic */ Function1 f$10;
                public final /* synthetic */ Function1 f$11;
                public final /* synthetic */ Function1 f$12;
                public final /* synthetic */ Function1 f$13;
                public final /* synthetic */ boolean f$14;
                public final /* synthetic */ boolean f$2;
                public final /* synthetic */ AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.CalendarDate f$3;
                public final /* synthetic */ List f$4;
                public final /* synthetic */ AnimatedAmountTextView.Amount f$5;
                public final /* synthetic */ boolean f$6;
                public final /* synthetic */ boolean f$7;
                public final /* synthetic */ Function1 f$8;
                public final /* synthetic */ Function1 f$9;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(905969665);
                    AfterpayCardKt.AfterpayAppletCalendarHeroSection(Modifier.this, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9, this.f$10, this.f$11, this.f$12, this.f$13, this.f$14, (Composer) obj2, updateChangedFlags);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void AfterpayAppletCalendarRow(List list, AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.CalendarDate calendarDate, boolean z, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Composer composer, int i) {
        int i2;
        AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.CalendarDate calendarDate2;
        GapComposer gapComposer;
        DefaultPagerState defaultPagerState;
        NeverEqualPolicy neverEqualPolicy;
        Haptics haptics;
        ArrayList arrayList;
        list.getClass();
        function1.getClass();
        function12.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(38802502);
        int i3 = i & 6;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        if (i3 == 0) {
            i2 = (gapComposer2.changed(companion) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(list) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changedInstance(calendarDate) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changed(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer2.changedInstance(function12) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= gapComposer2.changedInstance(function13) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i) == 0) {
            i2 |= gapComposer2.changedInstance(function14) ? 8388608 : 4194304;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (4793491 & i2) != 4793490)) {
            RealHapticVibrator realHapticVibrator = (RealHapticVibrator) gapComposer2.consume(HapticVibratorKt.LocalHapticVibrator);
            Haptics haptics2 = (Haptics) gapComposer2.consume(HapticsKt.LocalHaptics);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy2) {
                rememberedValue = Updater.mutableStateOf$default(null);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            int i4 = i2;
            ArrayList windowed = CollectionsKt.windowed(list, 7, 7, true);
            boolean changedInstance = gapComposer2.changedInstance(windowed);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy2) {
                rememberedValue2 = new n$$ExternalSyntheticLambda2(7, windowed);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            DefaultPagerState rememberPagerState = PagerStateKt.rememberPagerState(0, (Function0) rememberedValue2, gapComposer2, 6, 2);
            Integer valueOf = Integer.valueOf(((ParcelableSnapshotMutableIntState) rememberPagerState.scrollPosition.elementTypes).getIntValue());
            boolean changed = ((i4 & 3670016) == 1048576) | gapComposer2.changed(rememberPagerState) | gapComposer2.changedInstance(windowed) | ((i4 & 29360128) == 8388608) | ((i4 & 458752) == 131072);
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (changed || rememberedValue3 == neverEqualPolicy2) {
                defaultPagerState = rememberPagerState;
                neverEqualPolicy = neverEqualPolicy2;
                haptics = haptics2;
                arrayList = windowed;
                MoleculeKt$immediateClockFlow$1$1$1 moleculeKt$immediateClockFlow$1$1$1 = new MoleculeKt$immediateClockFlow$1$1$1(defaultPagerState, arrayList, function12, function13, function14, null, 6);
                gapComposer2.updateRememberedValue(moleculeKt$immediateClockFlow$1$1$1);
                rememberedValue3 = moleculeKt$immediateClockFlow$1$1$1;
            } else {
                defaultPagerState = rememberPagerState;
                neverEqualPolicy = neverEqualPolicy2;
                haptics = haptics2;
                arrayList = windowed;
            }
            Updater.LaunchedEffect(list, valueOf, (Function2) rememberedValue3, gapComposer2);
            boolean changedInstance2 = gapComposer2.changedInstance(calendarDate) | gapComposer2.changedInstance(realHapticVibrator) | gapComposer2.changed(haptics);
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (changedInstance2 || rememberedValue4 == neverEqualPolicy) {
                Haptics haptics3 = haptics;
                calendarDate2 = calendarDate;
                zzmh zzmhVar = new zzmh(calendarDate2, realHapticVibrator, haptics3, mutableState, null, 17);
                gapComposer2.updateRememberedValue(zzmhVar);
                rememberedValue4 = zzmhVar;
            } else {
                calendarDate2 = calendarDate;
            }
            Updater.LaunchedEffect(gapComposer2, calendarDate2, (Function2) rememberedValue4);
            gapComposer = gapComposer2;
            PagerKt.m328HorizontalPager8jOkeI(defaultPagerState, SizeKt.fillMaxWidth(companion, 1.0f), null, null, 0, RecyclerView.DECELERATION_RATE, null, null, false, null, null, null, Expect_jvmKt.rememberComposableLambda(2056552647, new ExpandedLoanHistoryListKt$$ExternalSyntheticLambda5(arrayList, z, calendarDate2, function1), gapComposer2), gapComposer, 0, 24576, 16380);
        } else {
            calendarDate2 = calendarDate;
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SliderKt$$ExternalSyntheticLambda2(list, calendarDate2, z, function1, function12, function13, function14, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [int] */
    /* JADX WARN: Type inference failed for: r3v7 */
    public static final void AfterpayAppletNoBalanceHeroSection(Modifier modifier, AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.NoBalance noBalance, Function1 function1, Composer composer, int i) {
        ?? r3;
        noBalance.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1639819234);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changed(modifier) ? 4 : 2) | (gapComposer.changedInstance(noBalance) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
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
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion, 1.0f), 16.0f, RecyclerView.DECELERATION_RATE, 2);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).numeralLarge;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                r3 = 0;
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                r3 = 0;
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors.semantic.text.standard, (Composer) gapComposer, (Modifier) null, textStyle, (TextLineBalancing) null, noBalance.balance, (Map) null, (Function1) null, false);
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 4.0f));
            String str = noBalance.firstLabel;
            String str2 = noBalance.secondLabel;
            boolean changedInstance = gapComposer.changedInstance(noBalance) | ((i2 & 896) == 256 ? true : r3);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BankingDialogKt$$ExternalSyntheticLambda5(3, function1, noBalance);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            SecondaryLabelRow(str, str2, (Function0) rememberedValue, gapComposer, r3);
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InlineAppMessageKt$$ExternalSyntheticLambda8(i, 15, modifier, noBalance, function1);
        }
    }

    public static final void AfterpayCard(Modifier modifier, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i, int i2) {
        int i3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-5500619);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            if (i4 != 0) {
                modifier = Modifier.Companion.$$INSTANCE;
            }
            Modifier clip = ClipKt.clip(modifier, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(32.0f));
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(clip, colors.semantic.background.subtle, ColorKt.RectangleShape);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Recorder$$ExternalSyntheticOutline2.m(6, composableLambdaImpl, gapComposer, true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ListOrderedKt$$ExternalSyntheticLambda11(i, i2, 5, composableLambdaImpl, modifier2);
        }
    }

    public static final void AfterpayCardPreview(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1745121066);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            AfterpayCard(null, f137lambda$271024524, gapComposer, 48, 1);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ReceiptUiKt$$ExternalSyntheticLambda4(i, 19);
        }
    }

    public static final void AfterpayCardSection(Modifier modifier, AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardSection afterpayCardSection, boolean z, Function1 function1, Composer composer, int i, int i2) {
        int i3;
        afterpayCardSection.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1049689726);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        }
        int i5 = i3 | (gapComposer.changedInstance(afterpayCardSection) ? 32 : 16);
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i5 |= gapComposer.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i5 |= gapComposer.changedInstance(function1) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i5 & 1, (i5 & 1171) != 1170)) {
            if (i4 != 0) {
                modifier = Modifier.Companion.$$INSTANCE;
            }
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            AfterpayCard(SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2), Expect_jvmKt.rememberComposableLambda(1009881544, new TabContentViewKt$$ExternalSyntheticLambda26(afterpayCardSection, z, function1, 6), gapComposer), gapComposer, 48, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new IconButtonKt$$ExternalSyntheticLambda0(modifier2, (Object) afterpayCardSection, z, (Object) function1, i, i2, 11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AfterpayHeroUpsellSection(Modifier modifier, AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayHeroUpsell afterpayHeroUpsell, Function1 function1, Function0 function0, Composer composer, int i) {
        Function0 function02;
        boolean z;
        String str;
        String str2;
        boolean z2;
        Object rememberedValue;
        boolean z3;
        Object rememberedValue2;
        modifier.getClass();
        afterpayHeroUpsell.getClass();
        function1.getClass();
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-650522942);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changed(modifier) ? 4 : 2) | (gapComposer.changedInstance(afterpayHeroUpsell) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128) | (gapComposer.changedInstance(function0) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
            int m939getContainerSizeYbymL2g = (int) (((LazyWindowInfo) ((WindowInfo) gapComposer.consume(CompositionLocalsKt.LocalWindowInfo))).m939getContainerSizeYbymL2g() & BodyPartID.bodyIdMax);
            WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
            float f = ((Dp) ComparisonsKt___ComparisonsJvmKt.maxOf(new Dp(RecyclerView.DECELERATION_RATE), new Dp(density.mo233toDpu2uoSUM(m939getContainerSizeYbymL2g - Arrangement$End$1.current(gapComposer).navigationBars.getInsets$foundation_layout().bottom) - 100.0f))).value;
            boolean z4 = Dp.m1036compareTo0680j_4(f, 550.0f) <= 0;
            float f2 = ((Dp) ComparisonsKt___ComparisonsJvmKt.maxOf(new Dp((z4 ? 0.36f : Dp.m1036compareTo0680j_4(f, 640.0f) <= 0 ? 0.4f : Dp.m1036compareTo0680j_4(f, 732.0f) <= 0 ? 0.46f : 0.54f) * f), new Dp(200.0f))).value;
            Object rememberedValue3 = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer);
            }
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) rememberedValue3;
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            MutableState mutableState = (MutableState) rememberedValue4;
            float f3 = ((Boolean) mutableState.getValue()).booleanValue() ? ((Dp) ComparisonsKt___ComparisonsJvmKt.maxOf(new Dp(RecyclerView.DECELERATION_RATE), new Dp(f - density.mo233toDpu2uoSUM(parcelableSnapshotMutableIntState.getIntValue())))).value : 0.0f;
            Object rememberedValue5 = gapComposer.rememberedValue();
            int i3 = 27;
            if (rememberedValue5 == neverEqualPolicy) {
                rememberedValue5 = new CombinedModifier$$ExternalSyntheticLambda0(i3, mutableState, parcelableSnapshotMutableIntState);
                gapComposer.updateRememberedValue(rememberedValue5);
            }
            Modifier onGloballyPositioned = ValueInsets.onGloballyPositioned(modifier, (Function1) rememberedValue5);
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            boolean z5 = z4;
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, onGloballyPositioned);
            ComposeUiNode.Companion.getClass();
            float f4 = f3;
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
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
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
            if (z5) {
                z = false;
                gapComposer.startReplaceGroup(-2082221044);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-2082264289);
                z = false;
                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                gapComposer.end(false);
            }
            Object rememberedValue6 = gapComposer.rememberedValue();
            if (rememberedValue6 == neverEqualPolicy) {
                rememberedValue6 = new AfterpaySearchViewKt$$ExternalSyntheticLambda43(25);
                gapComposer.updateRememberedValue(rememberedValue6);
            }
            Modifier semantics = SemanticsModifierKt.semantics(companion, z, (Function1) rememberedValue6);
            String str3 = afterpayHeroUpsell.title;
            RemoteImage.ImageUrl imageUrl = afterpayHeroUpsell.image.url;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, semantics, Strings.getTypography(gapComposer).headlineLarge, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodySmall, (TextLineBalancing) null, afterpayHeroUpsell.body, (Map) null, (Function1) null, false);
            gapComposer.end(true);
            if (Strings.getColors(gapComposer).isLight) {
                str2 = imageUrl.light;
            } else {
                String str4 = imageUrl.dark;
                if (StringsKt.isBlank(str4)) {
                    str4 = null;
                }
                if (str4 == null) {
                    str2 = imageUrl.light;
                } else {
                    str = str4;
                    AsyncImageKt.m1438AsyncImage10Xjiaw(str, null, SizeKt.fillMaxWidth(SizeKt.m277height3ABfNKs(companion, f2), 1.0f), null, ContentScale.Companion.Fit, null, gapComposer, 1572912, 1976);
                    if (Dp.m1036compareTo0680j_4(f4, RecyclerView.DECELERATION_RATE) <= 0) {
                        re$$ExternalSyntheticOutline0.m(gapComposer, 136508728, companion, f4, gapComposer);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(136568310);
                        gapComposer.end(false);
                    }
                    String str5 = afterpayHeroUpsell.disclaimer;
                    z2 = (i2 & 896) != 256;
                    rememberedValue = gapComposer.rememberedValue();
                    if (!z2 || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new SwipeToDismissKt$$ExternalSyntheticLambda4(27, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Strings.getSizes(gapComposer).getClass();
                    LazyDslKt.m304MarkdownTextpCuZGqc(str5, (Function2) rememberedValue, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), Strings.getTypography(gapComposer).bodyXSmall, 0L, null, null, null, 0, 0, 3, gapComposer, 0, IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                    DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
                    Strings.getSizes(gapComposer).getClass();
                    Modifier windowInsetsPadding = OffsetKt.windowInsetsPadding(SizeKt.fillMaxWidth(SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), 1.0f), Arrangement$End$1.current(gapComposer).navigationBars);
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Center, Alignment.Companion.Top, gapComposer, 6);
                    int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, windowInsetsPadding);
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.useNode();
                    } else {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    }
                    Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                    z3 = (i2 & 7168) != 2048;
                    rememberedValue2 = gapComposer.rememberedValue();
                    if (!z3 || rememberedValue2 == neverEqualPolicy) {
                        function02 = function0;
                        rememberedValue2 = new y0$$ExternalSyntheticLambda0(25, function02);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    } else {
                        function02 = function0;
                    }
                    Strings.getSizes(gapComposer).getClass();
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue2, SpacerKt.m302paddingqDBjuR0$default(SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, 7), ButtonProminence.SUBTLE, false, false, null, Expect_jvmKt.rememberComposableLambda(-1010194973, new BalanceFeedKt$$ExternalSyntheticLambda9(afterpayHeroUpsell, 20), gapComposer), gapComposer, 1573248, 56);
                    gapComposer = gapComposer;
                    gapComposer.end(true);
                    gapComposer.end(true);
                }
            }
            str = str2;
            AsyncImageKt.m1438AsyncImage10Xjiaw(str, null, SizeKt.fillMaxWidth(SizeKt.m277height3ABfNKs(companion, f2), 1.0f), null, ContentScale.Companion.Fit, null, gapComposer, 1572912, 1976);
            if (Dp.m1036compareTo0680j_4(f4, RecyclerView.DECELERATION_RATE) <= 0) {
            }
            String str52 = afterpayHeroUpsell.disclaimer;
            if ((i2 & 896) != 256) {
            }
            rememberedValue = gapComposer.rememberedValue();
            if (!z2) {
            }
            rememberedValue = new SwipeToDismissKt$$ExternalSyntheticLambda4(27, function1);
            gapComposer.updateRememberedValue(rememberedValue);
            Strings.getSizes(gapComposer).getClass();
            LazyDslKt.m304MarkdownTextpCuZGqc(str52, (Function2) rememberedValue, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), Strings.getTypography(gapComposer).bodyXSmall, 0L, null, null, null, 0, 0, 3, gapComposer, 0, IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
            DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
            Strings.getSizes(gapComposer).getClass();
            Modifier windowInsetsPadding2 = OffsetKt.windowInsetsPadding(SizeKt.fillMaxWidth(SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), 1.0f), Arrangement$End$1.current(gapComposer).navigationBars);
            RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(SpacerKt.Center, Alignment.Companion.Top, gapComposer, 6);
            int hashCode32 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope32 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier32 = PlatformKt.materializeModifier(gapComposer, windowInsetsPadding2);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope32, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode32, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier32, composeUiNode$Companion$SetModifier$14);
            if ((i2 & 7168) != 2048) {
            }
            rememberedValue2 = gapComposer.rememberedValue();
            if (z3) {
            }
            function02 = function0;
            rememberedValue2 = new y0$$ExternalSyntheticLambda0(25, function02);
            gapComposer.updateRememberedValue(rememberedValue2);
            Strings.getSizes(gapComposer).getClass();
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue2, SpacerKt.m302paddingqDBjuR0$default(SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, 7), ButtonProminence.SUBTLE, false, false, null, Expect_jvmKt.rememberComposableLambda(-1010194973, new BalanceFeedKt$$ExternalSyntheticLambda9(afterpayHeroUpsell, 20), gapComposer), gapComposer, 1573248, 56);
            gapComposer = gapComposer;
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            function02 = function0;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DismissableToastKt$$ExternalSyntheticLambda4(i, 20, modifier, afterpayHeroUpsell, function1, function02);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CalendarDateItem(Modifier modifier, AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.CalendarDate calendarDate, boolean z, boolean z2, Function0 function0, Composer composer, int i) {
        List list;
        Modifier modifier2;
        boolean isSelectable;
        int i2;
        Modifier modifier3;
        int i3;
        String str;
        long j;
        List list2;
        Iterator it;
        boolean z3;
        long j2;
        long j3;
        List list3 = calendarDate.treatments;
        BiasAlignment.Horizontal horizontal = Alignment.Companion.CenterHorizontally;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-374697903);
        Applier applier = gapComposer.applier;
        int i4 = i | (gapComposer.changed(modifier) ? 4 : 2) | (gapComposer.changedInstance(calendarDate) ? 32 : 16) | (gapComposer.changed(z) ? 256 : 128) | (gapComposer.changed(z2) ? 2048 : 1024) | (gapComposer.changedInstance(function0) ? 16384 : PKIFailureInfo.certRevoked);
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 9363) != 9362)) {
            boolean changedInstance = gapComposer.changedInstance(calendarDate) | ((i4 & 7168) == 2048);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                rememberedValue = new SliderKt$$ExternalSyntheticLambda5(calendarDate, z2, 4);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(modifier, (Function1) rememberedValue);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, clearAndSetSemantics);
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Modifier modifier4 = Modifier.Companion.$$INSTANCE;
            Modifier clip = ClipKt.clip(SizeKt.m290width3ABfNKs(modifier4, 44.0f), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f));
            if (z2) {
                List list4 = list3;
                if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                    Iterator it2 = list4.iterator();
                    while (it2.hasNext()) {
                        if (((AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.DateTreatment) it2.next()) instanceof AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.DateTreatment.Overdue) {
                            gapComposer.startReplaceGroup(1644770142);
                            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                            if (colors == null) {
                                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                            } else {
                                gapComposer.startReplaceGroup(-1762997739);
                                gapComposer.end(false);
                            }
                            modifier2 = ImageKt.m178borderxT4_qwU(modifier4, 1.0f, colors.semantic.background.warning, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f));
                            gapComposer.end(false);
                            list = list3;
                            Modifier then = clip.then(modifier2);
                            isSelectable = LoadableStateKt.isSelectable(calendarDate);
                            int i5 = calendarDate.dayOfMonth;
                            if (isSelectable) {
                                gapComposer.startReplaceGroup(1645824266);
                                Object rememberedValue2 = gapComposer.rememberedValue();
                                if (rememberedValue2 == neverEqualPolicy) {
                                    rememberedValue2 = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
                                }
                                MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue2;
                                Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                                if (colors2 == null) {
                                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                                } else {
                                    gapComposer.startReplaceGroup(-1762997739);
                                    gapComposer.end(false);
                                }
                                gapComposer = gapComposer;
                                i2 = i5;
                                RippleNodeFactory m3400rippleYJYuY3k = RippleKt.m3400rippleYJYuY3k(Color.m675copywmQWz5c$default(0.2f, colors2.semantic.background.prominent, 14), true, RecyclerView.DECELERATION_RATE, null, gapComposer, 48, 12);
                                boolean z4 = (i4 & 57344) == 16384;
                                Object rememberedValue3 = gapComposer.rememberedValue();
                                if (z4 || rememberedValue3 == neverEqualPolicy) {
                                    rememberedValue3 = new y0$$ExternalSyntheticLambda0(23, function0);
                                    gapComposer.updateRememberedValue(rememberedValue3);
                                }
                                modifier4 = ImageKt.m182clickableO2vRcR0$default(modifier4, mutableInteractionSourceImpl, m3400rippleYJYuY3k, false, null, null, (Function0) rememberedValue3, 28);
                                modifier3 = modifier4;
                                gapComposer.end(false);
                            } else {
                                i2 = i5;
                                modifier3 = modifier4;
                                gapComposer.startReplaceGroup(1646280865);
                                gapComposer.end(false);
                            }
                            Modifier then2 = then.then(modifier4);
                            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
                            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 48);
                            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, then2);
                            ComposeUiNode.Companion.getClass();
                            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                            gapComposer.startReusableNode();
                            if (gapComposer.inserting) {
                                gapComposer.createNode(layoutNode$Companion$Constructor$12);
                            } else {
                                gapComposer.useNode();
                            }
                            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                            Integer valueOf = Integer.valueOf(hashCode2);
                            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
                            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(modifier3, RecyclerView.DECELERATION_RATE, 8.0f, 1);
                            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 48);
                            int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
                            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
                            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
                            gapComposer.startReusableNode();
                            if (gapComposer.inserting) {
                                gapComposer.createNode(layoutNode$Companion$Constructor$12);
                            } else {
                                gapComposer.useNode();
                            }
                            Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                            Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                            Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                            i3 = i2;
                            if (i3 == 1) {
                                str = calendarDate.monthAbbreviation.toUpperCase(Locale.ROOT);
                                str.getClass();
                            } else {
                                str = calendarDate.dayAbbreviation;
                            }
                            String str2 = str;
                            TextStyle textStyle = Strings.getTypography(gapComposer).labelXSmall;
                            if (z) {
                                gapComposer.startReplaceGroup(699891179);
                                j = Strings.getColors(gapComposer).semantic.text.standard;
                                gapComposer.end(false);
                            } else {
                                gapComposer.startReplaceGroup(699893227);
                                j = Strings.getColors(gapComposer).semantic.text.disabled;
                                gapComposer.end(false);
                            }
                            GapComposer gapComposer2 = gapComposer;
                            Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3826, j, (Composer) gapComposer2, (Modifier) null, textStyle, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                            SpacerKt.Spacer(gapComposer2, SizeKt.m277height3ABfNKs(modifier3, 12.0f));
                            list2 = list;
                            if ((list2 instanceof Collection) || !list2.isEmpty()) {
                                it = list2.iterator();
                                while (it.hasNext()) {
                                    if (((AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.DateTreatment) it.next()) instanceof AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.DateTreatment.Disabled) {
                                        z3 = true;
                                        break;
                                    }
                                }
                            }
                            z3 = false;
                            String valueOf2 = String.valueOf(i3);
                            TextStyle textStyle2 = Strings.getTypography(gapComposer2).bodyMedium;
                            if (z) {
                                gapComposer2.startReplaceGroup(699908075);
                                j2 = Strings.getColors(gapComposer2).semantic.text.standard;
                                gapComposer2.end(false);
                            } else if (z3) {
                                gapComposer2.startReplaceGroup(699910315);
                                j2 = Strings.getColors(gapComposer2).semantic.text.disabled;
                                gapComposer2.end(false);
                            } else {
                                gapComposer2.startReplaceGroup(699912363);
                                j2 = Strings.getColors(gapComposer2).semantic.text.standard;
                                gapComposer2.end(false);
                            }
                            Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3826, j2, (Composer) gapComposer2, (Modifier) null, textStyle2, (TextLineBalancing) null, valueOf2, (Map) null, (Function1) null, false);
                            gapComposer = gapComposer2;
                            if (z) {
                                gapComposer.startReplaceGroup(699921003);
                                j3 = Strings.getColors(gapComposer).semantic.text.standard;
                                gapComposer.end(false);
                            } else {
                                gapComposer.startReplaceGroup(699921646);
                                gapComposer.end(false);
                                j3 = Color.Transparent;
                            }
                            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(modifier3, 2.0f));
                            BoxKt.Box(ImageKt.m177backgroundbw27NRU(ClipKt.clip(SizeKt.m285size3ABfNKs(modifier3, 4.0f), RoundedCornerShapeKt.CircleShape), j3, ColorKt.RectangleShape), gapComposer, 0);
                            gapComposer.end(true);
                            gapComposer.end(true);
                            gapComposer.end(true);
                        }
                    }
                }
            }
            if (z2) {
                gapComposer.startReplaceGroup(1645066688);
                Colors colors3 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors3 == null) {
                    colors3 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                modifier2 = ImageKt.m178borderxT4_qwU(modifier4, 1.0f, colors3.semantic.background.brand, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f));
                gapComposer.end(false);
                list = list3;
                Modifier then3 = clip.then(modifier2);
                isSelectable = LoadableStateKt.isSelectable(calendarDate);
                int i52 = calendarDate.dayOfMonth;
                if (isSelectable) {
                }
                Modifier then22 = then3.then(modifier4);
                Arrangement$Top$1 arrangement$Top$12 = SpacerKt.Top;
                ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement$Top$12, horizontal, gapComposer, 48);
                int hashCode22 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope22 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier22 = PlatformKt.materializeModifier(gapComposer, then22);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$122 = ComposeUiNode.Companion.Constructor;
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                }
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetMeasurePolicy;
                Updater.m576setimpl(gapComposer, columnMeasurePolicy3, composeUiNode$Companion$SetModifier$15);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$122 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope22, composeUiNode$Companion$SetModifier$122);
                Integer valueOf3 = Integer.valueOf(hashCode22);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$132 = ComposeUiNode.Companion.SetCompositeKeyHash;
                Updater.m576setimpl(gapComposer, valueOf3, composeUiNode$Companion$SetModifier$132);
                OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$12);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$142 = ComposeUiNode.Companion.SetModifier;
                Updater.m576setimpl(gapComposer, materializeModifier22, composeUiNode$Companion$SetModifier$142);
                Modifier m300paddingVpY3zN4$default2 = SpacerKt.m300paddingVpY3zN4$default(modifier3, RecyclerView.DECELERATION_RATE, 8.0f, 1);
                ColumnMeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(arrangement$Top$12, horizontal, gapComposer, 48);
                int hashCode32 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope32 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier32 = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default2);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                }
                Updater.m576setimpl(gapComposer, columnMeasurePolicy22, composeUiNode$Companion$SetModifier$15);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope32, composeUiNode$Companion$SetModifier$122);
                Recorder$$ExternalSyntheticOutline2.m(hashCode32, gapComposer, composeUiNode$Companion$SetModifier$132, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$12);
                Updater.m576setimpl(gapComposer, materializeModifier32, composeUiNode$Companion$SetModifier$142);
                i3 = i2;
                if (i3 == 1) {
                }
                String str22 = str;
                TextStyle textStyle3 = Strings.getTypography(gapComposer).labelXSmall;
                if (z) {
                }
                GapComposer gapComposer22 = gapComposer;
                Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3826, j, (Composer) gapComposer22, (Modifier) null, textStyle3, (TextLineBalancing) null, str22, (Map) null, (Function1) null, false);
                SpacerKt.Spacer(gapComposer22, SizeKt.m277height3ABfNKs(modifier3, 12.0f));
                list2 = list;
                if (list2 instanceof Collection) {
                }
                it = list2.iterator();
                while (it.hasNext()) {
                }
                z3 = false;
                String valueOf22 = String.valueOf(i3);
                TextStyle textStyle22 = Strings.getTypography(gapComposer22).bodyMedium;
                if (z) {
                }
                Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3826, j2, (Composer) gapComposer22, (Modifier) null, textStyle22, (TextLineBalancing) null, valueOf22, (Map) null, (Function1) null, false);
                gapComposer = gapComposer22;
                if (z) {
                }
                SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(modifier3, 2.0f));
                BoxKt.Box(ImageKt.m177backgroundbw27NRU(ClipKt.clip(SizeKt.m285size3ABfNKs(modifier3, 4.0f), RoundedCornerShapeKt.CircleShape), j3, ColorKt.RectangleShape), gapComposer, 0);
                gapComposer.end(true);
                gapComposer.end(true);
                gapComposer.end(true);
            } else {
                if (LoadableStateKt.isSelectable(calendarDate)) {
                    gapComposer.startReplaceGroup(1645378269);
                    Colors colors4 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors4 == null) {
                        colors4 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    list = list3;
                    modifier2 = ImageKt.m178borderxT4_qwU(modifier4, 1.0f, colors4.semantic.background.standard, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f));
                    gapComposer.end(false);
                } else {
                    list = list3;
                    gapComposer.startReplaceGroup(1645662849);
                    gapComposer.end(false);
                    modifier2 = modifier4;
                }
                Modifier then32 = clip.then(modifier2);
                isSelectable = LoadableStateKt.isSelectable(calendarDate);
                int i522 = calendarDate.dayOfMonth;
                if (isSelectable) {
                }
                Modifier then222 = then32.then(modifier4);
                Arrangement$Top$1 arrangement$Top$122 = SpacerKt.Top;
                ColumnMeasurePolicy columnMeasurePolicy32 = ColumnKt.columnMeasurePolicy(arrangement$Top$122, horizontal, gapComposer, 48);
                int hashCode222 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope222 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier222 = PlatformKt.materializeModifier(gapComposer, then222);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1222 = ComposeUiNode.Companion.Constructor;
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                }
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$152 = ComposeUiNode.Companion.SetMeasurePolicy;
                Updater.m576setimpl(gapComposer, columnMeasurePolicy32, composeUiNode$Companion$SetModifier$152);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1222 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope222, composeUiNode$Companion$SetModifier$1222);
                Integer valueOf32 = Integer.valueOf(hashCode222);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1322 = ComposeUiNode.Companion.SetCompositeKeyHash;
                Updater.m576setimpl(gapComposer, valueOf32, composeUiNode$Companion$SetModifier$1322);
                OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$122 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$122);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1422 = ComposeUiNode.Companion.SetModifier;
                Updater.m576setimpl(gapComposer, materializeModifier222, composeUiNode$Companion$SetModifier$1422);
                Modifier m300paddingVpY3zN4$default22 = SpacerKt.m300paddingVpY3zN4$default(modifier3, RecyclerView.DECELERATION_RATE, 8.0f, 1);
                ColumnMeasurePolicy columnMeasurePolicy222 = ColumnKt.columnMeasurePolicy(arrangement$Top$122, horizontal, gapComposer, 48);
                int hashCode322 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope322 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier322 = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default22);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                }
                Updater.m576setimpl(gapComposer, columnMeasurePolicy222, composeUiNode$Companion$SetModifier$152);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope322, composeUiNode$Companion$SetModifier$1222);
                Recorder$$ExternalSyntheticOutline2.m(hashCode322, gapComposer, composeUiNode$Companion$SetModifier$1322, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$122);
                Updater.m576setimpl(gapComposer, materializeModifier322, composeUiNode$Companion$SetModifier$1422);
                i3 = i2;
                if (i3 == 1) {
                }
                String str222 = str;
                TextStyle textStyle32 = Strings.getTypography(gapComposer).labelXSmall;
                if (z) {
                }
                GapComposer gapComposer222 = gapComposer;
                Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3826, j, (Composer) gapComposer222, (Modifier) null, textStyle32, (TextLineBalancing) null, str222, (Map) null, (Function1) null, false);
                SpacerKt.Spacer(gapComposer222, SizeKt.m277height3ABfNKs(modifier3, 12.0f));
                list2 = list;
                if (list2 instanceof Collection) {
                }
                it = list2.iterator();
                while (it.hasNext()) {
                }
                z3 = false;
                String valueOf222 = String.valueOf(i3);
                TextStyle textStyle222 = Strings.getTypography(gapComposer222).bodyMedium;
                if (z) {
                }
                Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3826, j2, (Composer) gapComposer222, (Modifier) null, textStyle222, (TextLineBalancing) null, valueOf222, (Map) null, (Function1) null, false);
                gapComposer = gapComposer222;
                if (z) {
                }
                SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(modifier3, 2.0f));
                BoxKt.Box(ImageKt.m177backgroundbw27NRU(ClipKt.clip(SizeKt.m285size3ABfNKs(modifier3, 4.0f), RoundedCornerShapeKt.CircleShape), j3, ColorKt.RectangleShape), gapComposer, 0);
                gapComposer.end(true);
                gapComposer.end(true);
                gapComposer.end(true);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OutlinedTextFieldKt$$ExternalSyntheticLambda4(modifier, calendarDate, z, z2, function0, i, 1);
        }
    }

    public static final void CardBodyContent(AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardContent afterpayCardContent, boolean z, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(945002321);
        int i2 = (gapComposer.changedInstance(afterpayCardContent) ? 4 : 2) | i | (gapComposer.changed(z) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else if (afterpayCardContent instanceof AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardContent.TileCarousel) {
            gapComposer.startReplaceGroup(-946244054);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            TileCarouselContent(i2 & 896, gapComposer, null, CollectionsKt.toList(((AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardContent.TileCarousel) afterpayCardContent).carouselTiles), function1);
            DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
            gapComposer.end(false);
        } else if (afterpayCardContent instanceof AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardContent.TransactionList) {
            gapComposer.startReplaceGroup(-946051451);
            TransactionListContent((AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardContent.TransactionList) afterpayCardContent, null, function1, gapComposer, i2 & 910);
            if (z) {
                gapComposer.startReplaceGroup(-945922863);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-945966108);
                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                gapComposer.end(false);
            }
            gapComposer.end(false);
        } else {
            if (!(afterpayCardContent instanceof AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardContent.ImageTextContent)) {
                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1909137678, false);
            }
            gapComposer.startReplaceGroup(-945886004);
            CardImageTextView(null, (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardContent.ImageTextContent) afterpayCardContent, function1, gapComposer, (i2 & 896) | ((i2 << 3) & 112));
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TabContentViewKt$$ExternalSyntheticLambda26(afterpayCardContent, z, function1, i, 8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [androidx.compose.ui.Modifier] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v21, types: [int] */
    /* JADX WARN: Type inference failed for: r14v30 */
    /* JADX WARN: Type inference failed for: r14v31 */
    public static final void CardFooterContent(AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.CardFooter cardFooter, Function1 function1, Composer composer, int i) {
        final AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.CardFooter cardFooter2;
        GapComposer gapComposer;
        Throwable th;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1;
        Function1 function12;
        Modifier.Companion companion;
        Modifier.Companion companion2;
        NeverEqualPolicy neverEqualPolicy;
        AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.CardFooter.TappableFooter tappableFooter;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12;
        Applier applier;
        ?? r14;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13;
        boolean z;
        Unit unit;
        GapComposer gapComposer2;
        boolean z2;
        GapComposer gapComposer3;
        GapComposer gapComposer4;
        boolean z3;
        String str;
        boolean z4;
        ButtonProminence buttonProminence;
        Function1 function13 = function1;
        Arrangement$End$1 arrangement$End$1 = SpacerKt.Start;
        Arrangement$Center$1 arrangement$Center$1 = SpacerKt.SpaceBetween;
        BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
        GapComposer gapComposer5 = (GapComposer) composer;
        gapComposer5.startRestartGroup(1560407016);
        Applier applier2 = gapComposer5.applier;
        int i2 = i | (gapComposer5.changedInstance(cardFooter) ? 4 : 2) | (gapComposer5.changedInstance(function13) ? 32 : 16);
        if (gapComposer5.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            boolean z5 = cardFooter instanceof AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.CardFooter.ButtonFooter;
            Modifier.Companion companion3 = Modifier.Companion.$$INSTANCE;
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (z5) {
                gapComposer5.startReplaceGroup(1654640021);
                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer5, null);
                ModalKt.HorizontalDivider(6, 0, gapComposer5, SpacerKt.m300paddingVpY3zN4$default(companion3, 24.0f, RecyclerView.DECELERATION_RATE, 2));
                Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(SizeKt.fillMaxWidth(companion3, 1.0f), 24.0f);
                RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$Center$1, vertical, gapComposer5, 54);
                int hashCode = Long.hashCode(gapComposer5.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer5.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer5, m298padding3ABfNKs);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                if (applier2 == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer5.startReusableNode();
                if (gapComposer5.inserting) {
                    gapComposer5.createNode(layoutNode$Companion$Constructor$12);
                } else {
                    gapComposer5.useNode();
                }
                Updater.m576setimpl(gapComposer5, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer5, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer5, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer5, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                LayoutWeightElement m = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer5, materializeModifier, ComposeUiNode.Companion.SetModifier, 1.0f, false);
                Object rememberedValue = gapComposer5.rememberedValue();
                if (rememberedValue == neverEqualPolicy2) {
                    rememberedValue = new AfterpaySearchViewKt$$ExternalSyntheticLambda43(23);
                    gapComposer5.updateRememberedValue(rememberedValue);
                }
                Modifier semantics = SemanticsModifierKt.semantics(m, false, (Function1) rememberedValue);
                AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.CardFooter.ButtonFooter buttonFooter = (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.CardFooter.ButtonFooter) cardFooter;
                String str2 = buttonFooter.titleText;
                TextStyle textStyle = ((Typography) gapComposer5.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                Colors colors = (Colors) gapComposer5.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer5, -1762997026, gapComposer5, false);
                } else {
                    gapComposer5.startReplaceGroup(-1762997739);
                    gapComposer5.end(false);
                }
                Room.m1165Text25TpFw(0, Integer.MAX_VALUE, 0, 0, 1572864, 0, 4016, colors.semantic.text.standard, (Composer) gapComposer5, semantics, textStyle, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                ((DefaultSizes) gapComposer5.consume(ArcadeThemeKt.LocalSizes)).getClass();
                Request$Priority$EnumUnboxingLocalUtility.m$1(DefaultSizes.spacing, companion3, 16.0f, gapComposer5);
                AfterpayAppletHomeContentViewModel.HomeSection.ButtonModel buttonModel = buttonFooter.button;
                if (buttonModel == null) {
                    gapComposer5.startReplaceGroup(-582594430);
                    z4 = false;
                    gapComposer5.end(false);
                } else {
                    z4 = false;
                    gapComposer5.startReplaceGroup(-582594429);
                    boolean changedInstance = gapComposer5.changedInstance(buttonModel) | ((i2 & 112) == 32);
                    Object rememberedValue2 = gapComposer5.rememberedValue();
                    if (changedInstance || rememberedValue2 == neverEqualPolicy2) {
                        rememberedValue2 = new ImageTextSectionKt$$ExternalSyntheticLambda1(function13, buttonModel, 4);
                        gapComposer5.updateRememberedValue(rememberedValue2);
                    }
                    Function0 function0 = (Function0) rememberedValue2;
                    int i3 = AfterpayCardSectionKt$WhenMappings.$EnumSwitchMapping$1[buttonModel.buttonProminence.ordinal()];
                    if (i3 == 1) {
                        buttonProminence = ButtonProminence.PROMINENT;
                    } else if (i3 == 2) {
                        buttonProminence = ButtonProminence.STANDARD;
                    } else if (i3 == 3) {
                        buttonProminence = ButtonProminence.SUBTLE;
                    } else {
                        if (i3 != 4) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return;
                        }
                        buttonProminence = ButtonProminence.STANDARD;
                    }
                    coil3.size.SizeKt.ButtonCompact(function0, null, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(-670550738, new ImageTextSectionKt$$ExternalSyntheticLambda0(buttonModel, 4), gapComposer5), gapComposer5, 1572864, 58);
                    gapComposer5 = gapComposer5;
                    gapComposer5.end(false);
                }
                gapComposer5.end(true);
                gapComposer5.end(z4);
                cardFooter2 = cardFooter;
                gapComposer = gapComposer5;
            } else {
                boolean z6 = cardFooter instanceof AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.CardFooter.TappableFooter;
                RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$12 = ColorKt.RectangleShape;
                if (z6) {
                    gapComposer5.startReplaceGroup(1656433340);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer5, null);
                    ModalKt.HorizontalDivider(6, 0, gapComposer5, SpacerKt.m300paddingVpY3zN4$default(companion3, 24.0f, RecyclerView.DECELERATION_RATE, 2));
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion3, 1.0f);
                    GapComposer gapComposer6 = gapComposer5;
                    RippleNodeFactory m3400rippleYJYuY3k = RippleKt.m3400rippleYJYuY3k(0L, false, RecyclerView.DECELERATION_RATE, null, gapComposer6, 0, 15);
                    Object rememberedValue3 = gapComposer6.rememberedValue();
                    if (rememberedValue3 == neverEqualPolicy2) {
                        rememberedValue3 = Recorder$$ExternalSyntheticOutline2.m(gapComposer6);
                    }
                    MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue3;
                    boolean changedInstance2 = gapComposer6.changedInstance(cardFooter) | ((i2 & 112) == 32);
                    Object rememberedValue4 = gapComposer6.rememberedValue();
                    if (changedInstance2 || rememberedValue4 == neverEqualPolicy2) {
                        rememberedValue4 = new BankingDialogKt$$ExternalSyntheticLambda5(4, (Object) cardFooter, function13);
                        gapComposer6.updateRememberedValue(rememberedValue4);
                    }
                    Modifier m298padding3ABfNKs2 = SpacerKt.m298padding3ABfNKs(ImageKt.m182clickableO2vRcR0$default(fillMaxWidth, mutableInteractionSourceImpl, m3400rippleYJYuY3k, false, null, null, (Function0) rememberedValue4, 28), 24.0f);
                    RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement$Center$1, vertical, gapComposer6, 54);
                    int hashCode2 = Long.hashCode(gapComposer6.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer6.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer6, m298padding3ABfNKs2);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                    if (applier2 == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer6.startReusableNode();
                    if (gapComposer6.inserting) {
                        gapComposer6.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer6.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer6, rowMeasurePolicy2, composeUiNode$Companion$SetModifier$14);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer6, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$15);
                    Integer valueOf = Integer.valueOf(hashCode2);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer6, valueOf, composeUiNode$Companion$SetModifier$16);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer6, ownerSnapshotObserver$onCommitAffectingLayout$12);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetModifier;
                    LayoutWeightElement m2 = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer6, materializeModifier2, composeUiNode$Companion$SetModifier$17, 1.0f, false);
                    RowMeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement$End$1, vertical, gapComposer6, 48);
                    int hashCode3 = Long.hashCode(gapComposer6.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer6.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer6, m2);
                    if (applier2 == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer6.startReusableNode();
                    if (gapComposer6.inserting) {
                        gapComposer6.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer6.useNode();
                    }
                    Updater.m576setimpl(gapComposer6, rowMeasurePolicy3, composeUiNode$Companion$SetModifier$14);
                    Updater.m576setimpl(gapComposer6, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$15);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer6, composeUiNode$Companion$SetModifier$16, gapComposer6, ownerSnapshotObserver$onCommitAffectingLayout$12);
                    Updater.m576setimpl(gapComposer6, materializeModifier3, composeUiNode$Companion$SetModifier$17);
                    AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.CardFooter.TappableFooter tappableFooter2 = (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.CardFooter.TappableFooter) cardFooter;
                    FooterImageContent footerImageContent = tappableFooter2.imageContent;
                    if (footerImageContent instanceof FooterImageContent.Image) {
                        gapComposer6.startReplaceGroup(-1861456053);
                        Colors colors2 = (Colors) gapComposer6.consume(ArcadeThemeKt.LocalColors);
                        if (colors2 == null) {
                            z3 = false;
                            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer6, -1762997026, gapComposer6, false);
                        } else {
                            z3 = false;
                            gapComposer6.startReplaceGroup(-1762997739);
                            gapComposer6.end(false);
                        }
                        if (colors2.isLight) {
                            str = ((FooterImageContent.Image) footerImageContent).remoteImage.url.light;
                        } else {
                            RemoteImage remoteImage = ((FooterImageContent.Image) footerImageContent).remoteImage;
                            String str3 = remoteImage.url.dark;
                            if (StringsKt.isBlank(str3)) {
                                str3 = null;
                            }
                            str = str3 == null ? remoteImage.url.light : str3;
                        }
                        neverEqualPolicy = neverEqualPolicy2;
                        boolean z7 = z3;
                        layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$13;
                        tappableFooter = tappableFooter2;
                        composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$16;
                        ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                        composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$14;
                        applier = applier2;
                        AsyncImageKt.m1438AsyncImage10Xjiaw(str, null, SizeKt.m285size3ABfNKs(companion3, 24.0f), null, null, null, gapComposer6, 432, 2040);
                        GapComposer gapComposer7 = gapComposer6;
                        ((DefaultSizes) gapComposer7.consume(ArcadeThemeKt.LocalSizes)).getClass();
                        DefaultSizes.spacing.getClass();
                        SpacerKt.Spacer(gapComposer7, SizeKt.m290width3ABfNKs(companion3, 16.0f));
                        gapComposer7.end(z7);
                        r14 = z7;
                        composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$17;
                        z = true;
                        gapComposer4 = gapComposer7;
                    } else {
                        neverEqualPolicy = neverEqualPolicy2;
                        tappableFooter = tappableFooter2;
                        ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                        composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$16;
                        layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$13;
                        composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$14;
                        applier = applier2;
                        if (footerImageContent instanceof FooterImageContent.CardThumbnail) {
                            gapComposer6.startReplaceGroup(-1860777773);
                            StyledCardViewModel styledCardViewModel = ((FooterImageContent.CardThumbnail) footerImageContent).styledCardViewModel;
                            if (styledCardViewModel == null) {
                                gapComposer6.startReplaceGroup(-1860762987);
                                gapComposer6.end(false);
                                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$17;
                                z = true;
                                unit = null;
                                gapComposer2 = gapComposer6;
                            } else {
                                gapComposer6.startReplaceGroup(-1860762986);
                                BiasAlignment biasAlignment = Alignment.Companion.Center;
                                Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion3, 38.0f);
                                int i4 = Color.$r8$clinit;
                                Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(m285size3ABfNKs, Color.Transparent, rectangleShapeKt$RectangleShape$12);
                                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                                int hashCode4 = Long.hashCode(gapComposer6.compositeKeyHashCode);
                                PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer6.currentCompositionLocalScope();
                                Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer6, m177backgroundbw27NRU);
                                if (applier == null) {
                                    Updater.invalidApplier();
                                    throw null;
                                }
                                gapComposer6.startReusableNode();
                                if (gapComposer6.inserting) {
                                    gapComposer6.createNode(layoutNode$Companion$Constructor$1);
                                } else {
                                    gapComposer6.useNode();
                                }
                                Updater.m576setimpl(gapComposer6, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$12);
                                Updater.m576setimpl(gapComposer6, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$15);
                                Recorder$$ExternalSyntheticOutline2.m(hashCode4, gapComposer6, composeUiNode$Companion$SetModifier$1, gapComposer6, ownerSnapshotObserver$onCommitAffectingLayout$1);
                                Updater.m576setimpl(gapComposer6, materializeModifier4, composeUiNode$Companion$SetModifier$17);
                                Modifier scale = ScaleKt.scale(SizeKt.m290width3ABfNKs(SizeKt.wrapContentSize$default(companion3, null, 1), 144.0f), 0.2638889f, 0.2638889f);
                                CardThumbnailDisplayStyle cardThumbnailDisplayStyle = CardThumbnailDisplayStyle.STANDARD;
                                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$17;
                                z = true;
                                StyledCardViewKt.m3439StyledCardnSlTg7c(StyledCardViewModel.copy$default(styledCardViewModel, null, null, false, null, 63487), SpacerKt.m298padding3ABfNKs(RotateKt.rotate(scale, -9.0f), 4.0f), null, 144.0f, 5.0f, false, gapComposer6, 27648, 36);
                                GapComposer gapComposer8 = gapComposer6;
                                gapComposer8.end(true);
                                ((DefaultSizes) gapComposer8.consume(ArcadeThemeKt.LocalSizes)).getClass();
                                DefaultSizes.spacing.getClass();
                                SpacerKt.Spacer(gapComposer8, SizeKt.m290width3ABfNKs(companion3, 16.0f));
                                gapComposer8.end(false);
                                unit = Unit.INSTANCE;
                                gapComposer2 = gapComposer8;
                            }
                            if (unit == null) {
                                gapComposer2.startReplaceGroup(-1859746620);
                                GapComposer gapComposer9 = gapComposer2;
                                VisibleKt.ShimmerBox(SizeKt.m285size3ABfNKs(companion3, 38.0f), false, null, ComposableSingletons$AfterpayCardSectionKt.lambda$1071613811, gapComposer9, 3078, 6);
                                GapComposer gapComposer10 = gapComposer9;
                                ((DefaultSizes) gapComposer10.consume(ArcadeThemeKt.LocalSizes)).getClass();
                                DefaultSizes.spacing.getClass();
                                SpacerKt.Spacer(gapComposer10, SizeKt.m290width3ABfNKs(companion3, 16.0f));
                                z2 = false;
                                gapComposer10.end(false);
                                gapComposer3 = gapComposer10;
                            } else {
                                z2 = false;
                                gapComposer2.startReplaceGroup(494164239);
                                gapComposer2.end(false);
                                gapComposer3 = gapComposer2;
                            }
                            gapComposer3.end(z2);
                            gapComposer4 = gapComposer3;
                            r14 = z2;
                        } else {
                            r14 = 0;
                            composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$17;
                            z = true;
                            if (footerImageContent != null) {
                                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer6, 494141179, false);
                            }
                            gapComposer6.startReplaceGroup(-1859174112);
                            gapComposer6.end(false);
                            gapComposer4 = gapComposer6;
                        }
                    }
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer4, r14);
                    int hashCode5 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer4.currentCompositionLocalScope();
                    Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer4, companion3);
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer4.startReusableNode();
                    if (gapComposer4.inserting) {
                        gapComposer4.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer4.useNode();
                    }
                    Updater.m576setimpl(gapComposer4, columnMeasurePolicy, composeUiNode$Companion$SetModifier$12);
                    Updater.m576setimpl(gapComposer4, currentCompositionLocalScope5, composeUiNode$Companion$SetModifier$15);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode5, gapComposer4, composeUiNode$Companion$SetModifier$1, gapComposer4, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer4, materializeModifier5, composeUiNode$Companion$SetModifier$13);
                    Object rememberedValue5 = gapComposer4.rememberedValue();
                    if (rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new AfterpaySearchViewKt$$ExternalSyntheticLambda43(24);
                        gapComposer4.updateRememberedValue(rememberedValue5);
                    }
                    Modifier semantics2 = SemanticsModifierKt.semantics(companion3, false, (Function1) rememberedValue5);
                    AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.CardFooter.TappableFooter tappableFooter3 = tappableFooter;
                    GapComposer gapComposer11 = gapComposer4;
                    Room.m1165Text25TpFw(0, Integer.MAX_VALUE, 0, 0, 1572864, 0, 4016, Strings.getColors(gapComposer4).semantic.text.standard, (Composer) gapComposer11, semantics2, Strings.getTypography(gapComposer4).labelMedium, (TextLineBalancing) null, tappableFooter3.titleText, (Map) null, (Function1) null, false);
                    gapComposer = gapComposer11;
                    String str4 = tappableFooter3.subtitleText;
                    if (str4 == null) {
                        gapComposer.startReplaceGroup(-1507063299);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-1507063298);
                        Room.m1165Text25TpFw(0, 2, 0, 0, 1572864, 0, 4018, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodySmall, (TextLineBalancing) null, str4, (Map) null, (Function1) null, false);
                        gapComposer = gapComposer;
                        gapComposer.end(false);
                    }
                    gapComposer.end(z);
                    gapComposer.end(z);
                    Trace.m1191Iconww6aTOc(Icons.Push24, (String) null, (Modifier) null, Strings.getColors(gapComposer).semantic.icon.standard, gapComposer, 54, 4);
                    gapComposer.end(z);
                    gapComposer.end(false);
                    cardFooter2 = cardFooter;
                    function13 = function1;
                } else {
                    cardFooter2 = cardFooter;
                    if (!(cardFooter2 instanceof AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.CardFooter.AvatarTextFooter)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer5, 607569219, false);
                    }
                    gapComposer5.startReplaceGroup(1660607831);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer5, null);
                    ModalKt.HorizontalDivider(6, 0, gapComposer5, SpacerKt.m300paddingVpY3zN4$default(companion3, 24.0f, RecyclerView.DECELERATION_RATE, 2));
                    Tap tap = ((AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.CardFooter.AvatarTextFooter) cardFooter2).tapAction;
                    if (tap == null) {
                        gapComposer5.startReplaceGroup(1660728668);
                        gapComposer5.end(false);
                        function12 = function1;
                        companion = companion3;
                        companion2 = null;
                        th = null;
                        rectangleShapeKt$RectangleShape$1 = rectangleShapeKt$RectangleShape$12;
                    } else {
                        gapComposer5.startReplaceGroup(1660728669);
                        th = null;
                        rectangleShapeKt$RectangleShape$1 = rectangleShapeKt$RectangleShape$12;
                        RippleNodeFactory m3400rippleYJYuY3k2 = RippleKt.m3400rippleYJYuY3k(0L, false, RecyclerView.DECELERATION_RATE, null, gapComposer5, 0, 15);
                        Object rememberedValue6 = gapComposer5.rememberedValue();
                        if (rememberedValue6 == neverEqualPolicy2) {
                            rememberedValue6 = Recorder$$ExternalSyntheticOutline2.m(gapComposer5);
                        }
                        MutableInteractionSourceImpl mutableInteractionSourceImpl2 = (MutableInteractionSourceImpl) rememberedValue6;
                        boolean changedInstance3 = ((i2 & 112) == 32) | gapComposer5.changedInstance(tap);
                        Object rememberedValue7 = gapComposer5.rememberedValue();
                        if (changedInstance3 || rememberedValue7 == neverEqualPolicy2) {
                            function12 = function1;
                            rememberedValue7 = new RetroSectionKt$$ExternalSyntheticLambda5(function12, tap, 11);
                            gapComposer5.updateRememberedValue(rememberedValue7);
                        } else {
                            function12 = function1;
                        }
                        companion = companion3;
                        ?? m182clickableO2vRcR0$default = ImageKt.m182clickableO2vRcR0$default(companion, mutableInteractionSourceImpl2, m3400rippleYJYuY3k2, false, null, null, (Function0) rememberedValue7, 28);
                        gapComposer5.end(false);
                        companion2 = m182clickableO2vRcR0$default;
                    }
                    if (companion2 == null) {
                        companion2 = companion;
                    }
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                    ((DefaultSizes) gapComposer5.consume(staticProvidableCompositionLocal)).getClass();
                    zzc zzcVar = DefaultSizes.spacing;
                    zzcVar.getClass();
                    ((DefaultSizes) gapComposer5.consume(staticProvidableCompositionLocal)).getClass();
                    zzcVar.getClass();
                    Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(companion2, 8.0f, 16.0f);
                    Colors colors3 = (Colors) gapComposer5.consume(ArcadeThemeKt.LocalColors);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer5, -1762997026, gapComposer5, false);
                    } else {
                        gapComposer5.startReplaceGroup(-1762997739);
                        gapComposer5.end(false);
                    }
                    Modifier m177backgroundbw27NRU2 = ImageKt.m177backgroundbw27NRU(m299paddingVpY3zN4, colors3.semantic.background.subtle, rectangleShapeKt$RectangleShape$1);
                    RowMeasurePolicy rowMeasurePolicy4 = RowKt.rowMeasurePolicy(arrangement$End$1, vertical, gapComposer5, 48);
                    int hashCode6 = Long.hashCode(gapComposer5.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope6 = gapComposer5.currentCompositionLocalScope();
                    Modifier materializeModifier6 = PlatformKt.materializeModifier(gapComposer5, m177backgroundbw27NRU2);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$14 = ComposeUiNode.Companion.Constructor;
                    if (applier2 == null) {
                        Updater.invalidApplier();
                        throw th;
                    }
                    gapComposer5.startReusableNode();
                    if (gapComposer5.inserting) {
                        gapComposer5.createNode(layoutNode$Companion$Constructor$14);
                    } else {
                        gapComposer5.useNode();
                    }
                    Updater.m576setimpl(gapComposer5, rowMeasurePolicy4, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer5, currentCompositionLocalScope6, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer5, Integer.valueOf(hashCode6), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer5, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer5, materializeModifier6, ComposeUiNode.Companion.SetModifier);
                    int i5 = Color.$r8$clinit;
                    final int i6 = 0;
                    final int i7 = 1;
                    final int i8 = 2;
                    function13 = function12;
                    CellDefaultKt.m3392CellDefaultLargeIconygcbOzY(Expect_jvmKt.rememberComposableLambda(1868585134, new Function2() { // from class: com.squareup.cash.afterpayapplet.views.homesection.v3.AfterpayCardSectionKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i9 = i6;
                            AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.CardFooter cardFooter3 = cardFooter2;
                            switch (i9) {
                                case 0:
                                    Composer composer2 = (Composer) obj;
                                    int intValue = ((Integer) obj2).intValue();
                                    GapComposer gapComposer12 = (GapComposer) composer2;
                                    if (gapComposer12.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        AvatarSize avatarSize = AvatarSize.Size48;
                                        gapComposer12.startReplaceGroup(413989045);
                                        List list = ((AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.CardFooter.AvatarTextFooter) cardFooter3).avatars;
                                        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                                        Iterator it = list.iterator();
                                        while (it.hasNext()) {
                                            arrayList.add(AvatarsKt.toAvatarEntry((UiAvatar) it.next(), new AfterpaySearchViewKt$$ExternalSyntheticLambda16(17), gapComposer12, 0));
                                        }
                                        gapComposer12.end(false);
                                        zzabw.HorizontalStackedAvatars(avatarSize, Tags.toPersistentList(arrayList), null, gapComposer12, 6, 4);
                                    } else {
                                        gapComposer12.skipToGroupEnd();
                                    }
                                    break;
                                case 1:
                                    Composer composer3 = (Composer) obj;
                                    int intValue2 = ((Integer) obj2).intValue();
                                    GapComposer gapComposer13 = (GapComposer) composer3;
                                    if (gapComposer13.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                        String str5 = ((AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.CardFooter.AvatarTextFooter) cardFooter3).titleText;
                                        TextStyle textStyle2 = ((Typography) gapComposer13.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                                        Colors colors4 = (Colors) gapComposer13.consume(ArcadeThemeKt.LocalColors);
                                        if (colors4 == null) {
                                            colors4 = re$$ExternalSyntheticOutline0.m(gapComposer13, -1762997026, gapComposer13, false);
                                        } else {
                                            gapComposer13.startReplaceGroup(-1762997739);
                                            gapComposer13.end(false);
                                        }
                                        Room.m1165Text25TpFw(0, 2, 0, 0, 1572864, 0, 4018, colors4.semantic.text.prominent, (Composer) gapComposer13, (Modifier) null, textStyle2, (TextLineBalancing) null, str5, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer13.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer4 = (Composer) obj;
                                    int intValue3 = ((Integer) obj2).intValue();
                                    GapComposer gapComposer14 = (GapComposer) composer4;
                                    if (gapComposer14.shouldExecute(1 & intValue3, (intValue3 & 3) != 2)) {
                                        String str6 = ((AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.CardFooter.AvatarTextFooter) cardFooter3).subtitleText;
                                        TextStyle textStyle3 = ((Typography) gapComposer14.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
                                        Colors colors5 = (Colors) gapComposer14.consume(ArcadeThemeKt.LocalColors);
                                        if (colors5 == null) {
                                            colors5 = re$$ExternalSyntheticOutline0.m(gapComposer14, -1762997026, gapComposer14, false);
                                        } else {
                                            gapComposer14.startReplaceGroup(-1762997739);
                                            gapComposer14.end(false);
                                        }
                                        Room.m1165Text25TpFw(0, 2, 0, 0, 1572864, 0, 4018, colors5.semantic.text.subtle, (Composer) gapComposer14, (Modifier) null, textStyle3, (TextLineBalancing) null, str6, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer14.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer5), Expect_jvmKt.rememberComposableLambda(109225263, new Function2() { // from class: com.squareup.cash.afterpayapplet.views.homesection.v3.AfterpayCardSectionKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i9 = i7;
                            AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.CardFooter cardFooter3 = cardFooter2;
                            switch (i9) {
                                case 0:
                                    Composer composer2 = (Composer) obj;
                                    int intValue = ((Integer) obj2).intValue();
                                    GapComposer gapComposer12 = (GapComposer) composer2;
                                    if (gapComposer12.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        AvatarSize avatarSize = AvatarSize.Size48;
                                        gapComposer12.startReplaceGroup(413989045);
                                        List list = ((AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.CardFooter.AvatarTextFooter) cardFooter3).avatars;
                                        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                                        Iterator it = list.iterator();
                                        while (it.hasNext()) {
                                            arrayList.add(AvatarsKt.toAvatarEntry((UiAvatar) it.next(), new AfterpaySearchViewKt$$ExternalSyntheticLambda16(17), gapComposer12, 0));
                                        }
                                        gapComposer12.end(false);
                                        zzabw.HorizontalStackedAvatars(avatarSize, Tags.toPersistentList(arrayList), null, gapComposer12, 6, 4);
                                    } else {
                                        gapComposer12.skipToGroupEnd();
                                    }
                                    break;
                                case 1:
                                    Composer composer3 = (Composer) obj;
                                    int intValue2 = ((Integer) obj2).intValue();
                                    GapComposer gapComposer13 = (GapComposer) composer3;
                                    if (gapComposer13.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                        String str5 = ((AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.CardFooter.AvatarTextFooter) cardFooter3).titleText;
                                        TextStyle textStyle2 = ((Typography) gapComposer13.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                                        Colors colors4 = (Colors) gapComposer13.consume(ArcadeThemeKt.LocalColors);
                                        if (colors4 == null) {
                                            colors4 = re$$ExternalSyntheticOutline0.m(gapComposer13, -1762997026, gapComposer13, false);
                                        } else {
                                            gapComposer13.startReplaceGroup(-1762997739);
                                            gapComposer13.end(false);
                                        }
                                        Room.m1165Text25TpFw(0, 2, 0, 0, 1572864, 0, 4018, colors4.semantic.text.prominent, (Composer) gapComposer13, (Modifier) null, textStyle2, (TextLineBalancing) null, str5, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer13.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer4 = (Composer) obj;
                                    int intValue3 = ((Integer) obj2).intValue();
                                    GapComposer gapComposer14 = (GapComposer) composer4;
                                    if (gapComposer14.shouldExecute(1 & intValue3, (intValue3 & 3) != 2)) {
                                        String str6 = ((AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.CardFooter.AvatarTextFooter) cardFooter3).subtitleText;
                                        TextStyle textStyle3 = ((Typography) gapComposer14.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
                                        Colors colors5 = (Colors) gapComposer14.consume(ArcadeThemeKt.LocalColors);
                                        if (colors5 == null) {
                                            colors5 = re$$ExternalSyntheticOutline0.m(gapComposer14, -1762997026, gapComposer14, false);
                                        } else {
                                            gapComposer14.startReplaceGroup(-1762997739);
                                            gapComposer14.end(false);
                                        }
                                        Room.m1165Text25TpFw(0, 2, 0, 0, 1572864, 0, 4018, colors5.semantic.text.subtle, (Composer) gapComposer14, (Modifier) null, textStyle3, (TextLineBalancing) null, str6, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer14.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer5), null, null, null, false, false, Expect_jvmKt.rememberComposableLambda(-1856999371, new Function2() { // from class: com.squareup.cash.afterpayapplet.views.homesection.v3.AfterpayCardSectionKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i9 = i8;
                            AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.CardFooter cardFooter3 = cardFooter2;
                            switch (i9) {
                                case 0:
                                    Composer composer2 = (Composer) obj;
                                    int intValue = ((Integer) obj2).intValue();
                                    GapComposer gapComposer12 = (GapComposer) composer2;
                                    if (gapComposer12.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        AvatarSize avatarSize = AvatarSize.Size48;
                                        gapComposer12.startReplaceGroup(413989045);
                                        List list = ((AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.CardFooter.AvatarTextFooter) cardFooter3).avatars;
                                        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                                        Iterator it = list.iterator();
                                        while (it.hasNext()) {
                                            arrayList.add(AvatarsKt.toAvatarEntry((UiAvatar) it.next(), new AfterpaySearchViewKt$$ExternalSyntheticLambda16(17), gapComposer12, 0));
                                        }
                                        gapComposer12.end(false);
                                        zzabw.HorizontalStackedAvatars(avatarSize, Tags.toPersistentList(arrayList), null, gapComposer12, 6, 4);
                                    } else {
                                        gapComposer12.skipToGroupEnd();
                                    }
                                    break;
                                case 1:
                                    Composer composer3 = (Composer) obj;
                                    int intValue2 = ((Integer) obj2).intValue();
                                    GapComposer gapComposer13 = (GapComposer) composer3;
                                    if (gapComposer13.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                        String str5 = ((AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.CardFooter.AvatarTextFooter) cardFooter3).titleText;
                                        TextStyle textStyle2 = ((Typography) gapComposer13.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                                        Colors colors4 = (Colors) gapComposer13.consume(ArcadeThemeKt.LocalColors);
                                        if (colors4 == null) {
                                            colors4 = re$$ExternalSyntheticOutline0.m(gapComposer13, -1762997026, gapComposer13, false);
                                        } else {
                                            gapComposer13.startReplaceGroup(-1762997739);
                                            gapComposer13.end(false);
                                        }
                                        Room.m1165Text25TpFw(0, 2, 0, 0, 1572864, 0, 4018, colors4.semantic.text.prominent, (Composer) gapComposer13, (Modifier) null, textStyle2, (TextLineBalancing) null, str5, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer13.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer4 = (Composer) obj;
                                    int intValue3 = ((Integer) obj2).intValue();
                                    GapComposer gapComposer14 = (GapComposer) composer4;
                                    if (gapComposer14.shouldExecute(1 & intValue3, (intValue3 & 3) != 2)) {
                                        String str6 = ((AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.CardFooter.AvatarTextFooter) cardFooter3).subtitleText;
                                        TextStyle textStyle3 = ((Typography) gapComposer14.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
                                        Colors colors5 = (Colors) gapComposer14.consume(ArcadeThemeKt.LocalColors);
                                        if (colors5 == null) {
                                            colors5 = re$$ExternalSyntheticOutline0.m(gapComposer14, -1762997026, gapComposer14, false);
                                        } else {
                                            gapComposer14.startReplaceGroup(-1762997739);
                                            gapComposer14.end(false);
                                        }
                                        Room.m1165Text25TpFw(0, 2, 0, 0, 1572864, 0, 4018, colors5.semantic.text.subtle, (Composer) gapComposer14, (Modifier) null, textStyle3, (TextLineBalancing) null, str6, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer14.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer5), null, CellDefaultAccessory.Push.INSTANCE, Color.Transparent, null, gapComposer5, 817889334, 6, 2428);
                    gapComposer = gapComposer5;
                    gapComposer.end(true);
                    gapComposer.end(false);
                }
            }
        } else {
            cardFooter2 = cardFooter;
            gapComposer = gapComposer5;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AtmPickerGridKt$$ExternalSyntheticLambda4(cardFooter2, function13, i, 18);
        }
    }

    public static final void CardHeaderContent(AfterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader afterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader, boolean z, Function1 function1, Composer composer, int i) {
        afterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(320114472);
        int i2 = (gapComposer.changedInstance(afterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader) ? 4 : 2) | i | (gapComposer.changed(z) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.startReplaceGroup(1703036975);
            if (z) {
                gapComposer.startReplaceGroup(1703065557);
                V3OptimizedStandardHeader(afterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader, function1, gapComposer, ((i2 >> 3) & 112) | (i2 & 14));
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1703139616);
                StandardHeader(afterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader, function1, gapComposer, ((i2 >> 3) & 112) | (i2 & 14));
                gapComposer.end(false);
            }
            gapComposer.end(false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TabContentViewKt$$ExternalSyntheticLambda26(afterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader, z, function1, i, 7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v11, types: [androidx.compose.runtime.GapComposer] */
    /* JADX WARN: Type inference failed for: r11v12, types: [androidx.compose.runtime.GapComposer] */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v9, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.GapComposer] */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v26 */
    public static final void CardImageTextView(Modifier modifier, AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardContent.ImageTextContent imageTextContent, Function1 function1, Composer composer, int i) {
        Modifier modifier2;
        GapComposer gapComposer;
        int i2;
        Modifier m300paddingVpY3zN4$default;
        Modifier modifier3;
        NeverEqualPolicy neverEqualPolicy;
        Modifier.Companion companion;
        boolean z;
        float f;
        float f2;
        float f3;
        Unit unit;
        boolean z2;
        GapComposer gapComposer2;
        boolean z3;
        GapComposer gapComposer3;
        Object obj;
        Modifier.Companion companion2;
        ?? r4;
        ?? r1;
        ?? r11;
        Object obj2;
        ?? r112;
        imageTextContent.getClass();
        function1.getClass();
        GapComposer gapComposer4 = (GapComposer) composer;
        gapComposer4.startRestartGroup(627784250);
        Applier applier = gapComposer4.applier;
        int i3 = i | 6;
        if ((i & 48) == 0) {
            i3 |= gapComposer4.changedInstance(imageTextContent) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer4.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer4.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Modifier.Companion companion3 = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion3, 1.0f);
            Strings.getSizes(gapComposer4).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default2 = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 8.0f, RecyclerView.DECELERATION_RATE, 2);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer4, 48);
            int hashCode = Long.hashCode(gapComposer4.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer4.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer4, m300paddingVpY3zN4$default2);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer4.startReusableNode();
            if (gapComposer4.inserting) {
                gapComposer4.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer4.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer4, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer4, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer4, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer4, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer4, materializeModifier, composeUiNode$Companion$SetModifier$14);
            AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.CashCardThumbnail cashCardThumbnail = imageTextContent.cashCard;
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (cashCardThumbnail == null) {
                gapComposer4.startReplaceGroup(1001913613);
                gapComposer4.end(false);
                i2 = i3;
                companion = companion3;
                f = 1.0f;
                neverEqualPolicy = neverEqualPolicy2;
                z2 = false;
                modifier3 = null;
                f2 = RecyclerView.DECELERATION_RATE;
                z3 = 1;
                f3 = 24.0f;
                gapComposer3 = gapComposer4;
            } else {
                CardThumbnailDisplayStyle cardThumbnailDisplayStyle = cashCardThumbnail.displayStyle;
                gapComposer4.startReplaceGroup(1001913614);
                boolean z4 = cardThumbnailDisplayStyle == CardThumbnailDisplayStyle.ROTATED_CLIPPED;
                BiasAlignment biasAlignment = Alignment.Companion.TopCenter;
                boolean z5 = z4;
                Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion3, 1.0f);
                if (z5) {
                    fillMaxWidth2 = fillMaxWidth2.then(SizeKt.m277height3ABfNKs(companion3, 200.0f));
                }
                i2 = i3;
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                int hashCode2 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer4.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer4, fillMaxWidth2);
                gapComposer4.startReusableNode();
                if (gapComposer4.inserting) {
                    gapComposer4.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer4.useNode();
                }
                Updater.m576setimpl(gapComposer4, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer4, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer4, composeUiNode$Companion$SetModifier$13, gapComposer4, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer4, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                StyledCardViewModel styledCardViewModel = cashCardThumbnail.styledCardViewModel;
                if (styledCardViewModel == null) {
                    gapComposer4.startReplaceGroup(-816865416);
                    gapComposer4.end(false);
                    neverEqualPolicy = neverEqualPolicy2;
                    companion = companion3;
                    modifier3 = null;
                    f = 1.0f;
                    unit = null;
                    f2 = RecyclerView.DECELERATION_RATE;
                    z = true;
                    f3 = 24.0f;
                } else {
                    gapComposer4.startReplaceGroup(-816865415);
                    Modifier fillMaxWidth3 = SizeKt.fillMaxWidth(companion3, 1.0f);
                    if (z5) {
                        gapComposer4.startReplaceGroup(577206610);
                        Object rememberedValue = gapComposer4.rememberedValue();
                        Object obj3 = rememberedValue;
                        if (rememberedValue == neverEqualPolicy2) {
                            AfterpaySearchViewKt$$ExternalSyntheticLambda43 afterpaySearchViewKt$$ExternalSyntheticLambda43 = new AfterpaySearchViewKt$$ExternalSyntheticLambda43(26);
                            gapComposer4.updateRememberedValue(afterpaySearchViewKt$$ExternalSyntheticLambda43);
                            obj3 = afterpaySearchViewKt$$ExternalSyntheticLambda43;
                        }
                        Modifier graphicsLayer = ColorKt.graphicsLayer(companion3, (Function1) obj3);
                        gapComposer4.end(false);
                        m300paddingVpY3zN4$default = graphicsLayer;
                    } else {
                        gapComposer4.startReplaceGroup(577310367);
                        gapComposer4.end(false);
                        m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion3, RecyclerView.DECELERATION_RATE, 24.0f, 1);
                    }
                    Modifier then = fillMaxWidth3.then(m300paddingVpY3zN4$default);
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                    int hashCode3 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer4.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer4, then);
                    gapComposer4.startReusableNode();
                    if (gapComposer4.inserting) {
                        gapComposer4.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer4.useNode();
                    }
                    Updater.m576setimpl(gapComposer4, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer4, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer4, composeUiNode$Companion$SetModifier$13, gapComposer4, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer4, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                    modifier3 = null;
                    Modifier rotate = RotateKt.rotate(SizeKt.m290width3ABfNKs(SizeKt.wrapContentSize$default(companion3, null, 1), 240.0f), cardThumbnailDisplayStyle.rotationDegrees);
                    neverEqualPolicy = neverEqualPolicy2;
                    companion = companion3;
                    z = true;
                    f = 1.0f;
                    f2 = RecyclerView.DECELERATION_RATE;
                    f3 = 24.0f;
                    StyledCardViewKt.m3439StyledCardnSlTg7c(styledCardViewModel, rotate, null, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, false, gapComposer4, 0, 60);
                    gapComposer4.end(true);
                    gapComposer4.end(false);
                    unit = Unit.INSTANCE;
                }
                if (unit == null) {
                    gapComposer4.startReplaceGroup(-816147300);
                    VisibleKt.ShimmerBox(null, false, null, f136lambda$1465337368, gapComposer4, 3072, 7);
                    GapComposer gapComposer5 = gapComposer4;
                    z2 = false;
                    gapComposer5.end(false);
                    gapComposer2 = gapComposer5;
                } else {
                    z2 = false;
                    gapComposer4.startReplaceGroup(-1827466303);
                    gapComposer4.end(false);
                    gapComposer2 = gapComposer4;
                }
                gapComposer2.end(z);
                DBUtil.SpacerWithinSectionSmall(z2 ? 1 : 0, z ? 1 : 0, gapComposer2, modifier3);
                gapComposer2.end(z2);
                gapComposer3 = gapComposer2;
                z3 = z;
            }
            RemoteImage remoteImage = imageTextContent.image;
            if (remoteImage == null) {
                gapComposer3.startReplaceGroup(1003411502);
                gapComposer3.end(z2);
            } else {
                RemoteImage.ImageUrl imageUrl = remoteImage.url;
                Object obj4 = imageUrl.light;
                gapComposer3.startReplaceGroup(1003411503);
                if (!Strings.getColors(gapComposer3).isLight) {
                    String str = imageUrl.dark;
                    boolean isBlank = StringsKt.isBlank(str);
                    Object obj5 = str;
                    if (isBlank) {
                        obj5 = modifier3;
                    }
                    if (obj5 != null) {
                        obj = obj5;
                        DBUtil.SpacerWithinSectionSmall(0, z3, gapComposer3, modifier3);
                        Modifier fillMaxWidth4 = SizeKt.fillMaxWidth(companion, f);
                        Strings.getSizes(gapComposer3).getClass();
                        Object obj6 = DefaultSizes.border.entries;
                        AsyncImageKt.m1438AsyncImage10Xjiaw(obj, null, ClipKt.clip(fillMaxWidth4, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(f3)), null, ContentScale.Companion.FillWidth, null, gapComposer3, 1572912, 1976);
                        z2 = false;
                        DBUtil.SpacerBetweenSectionLarge(0, z3, gapComposer3, modifier3);
                        gapComposer3.end(false);
                    }
                }
                obj = obj4;
                DBUtil.SpacerWithinSectionSmall(0, z3, gapComposer3, modifier3);
                Modifier fillMaxWidth42 = SizeKt.fillMaxWidth(companion, f);
                Strings.getSizes(gapComposer3).getClass();
                Object obj62 = DefaultSizes.border.entries;
                AsyncImageKt.m1438AsyncImage10Xjiaw(obj, null, ClipKt.clip(fillMaxWidth42, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(f3)), null, ContentScale.Companion.FillWidth, null, gapComposer3, 1572912, 1976);
                z2 = false;
                DBUtil.SpacerBetweenSectionLarge(0, z3, gapComposer3, modifier3);
                gapComposer3.end(false);
            }
            String str2 = imageTextContent.title;
            if (str2 == null) {
                gapComposer3.startReplaceGroup(1003947864);
                gapComposer3.end(z2);
                companion2 = companion;
                r1 = z2;
                r4 = z3;
                r11 = gapComposer3;
            } else {
                gapComposer3.startReplaceGroup(1003947865);
                Strings.getSizes(gapComposer3).getClass();
                Modifier m300paddingVpY3zN4$default3 = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, f2, 2);
                Object rememberedValue2 = gapComposer3.rememberedValue();
                Object obj7 = rememberedValue2;
                if (rememberedValue2 == neverEqualPolicy) {
                    AfterpaySearchViewKt$$ExternalSyntheticLambda43 afterpaySearchViewKt$$ExternalSyntheticLambda432 = new AfterpaySearchViewKt$$ExternalSyntheticLambda43(27);
                    gapComposer3.updateRememberedValue(afterpaySearchViewKt$$ExternalSyntheticLambda432);
                    obj7 = afterpaySearchViewKt$$ExternalSyntheticLambda432;
                }
                GapComposer gapComposer6 = gapComposer3;
                companion2 = companion;
                r4 = z3;
                r1 = 0;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer3).semantic.text.standard, (Composer) gapComposer6, SemanticsModifierKt.semantics(m300paddingVpY3zN4$default3, false, (Function1) obj7), Strings.getTypography(gapComposer3).headlineSmall, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                GapComposer gapComposer7 = gapComposer6;
                gapComposer7.end(false);
                r11 = gapComposer7;
            }
            String str3 = imageTextContent.subtitle;
            if (str3 == null) {
                r11.startReplaceGroup(1004269334);
                r11.end(r1);
                r112 = r11;
            } else {
                r11.startReplaceGroup(1004269335);
                DBUtil.SpacerWithinSectionSmall(r1, r4, r11, modifier3);
                Strings.getSizes(r11).getClass();
                Strings.getSizes(r11).getClass();
                Strings.getSizes(r11).getClass();
                Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion2, 16.0f, RecyclerView.DECELERATION_RATE, 16.0f, 32.0f, 2);
                TextStyle textStyle = Strings.getTypography(r11).bodyMedium;
                long j = Strings.getColors(r11).semantic.text.standard;
                boolean z6 = (i2 & 896) == 256 ? r4 : r1;
                Object rememberedValue3 = r11.rememberedValue();
                if (z6 || rememberedValue3 == neverEqualPolicy) {
                    SwipeToDismissKt$$ExternalSyntheticLambda4 swipeToDismissKt$$ExternalSyntheticLambda4 = new SwipeToDismissKt$$ExternalSyntheticLambda4(28, function1);
                    r11.updateRememberedValue(swipeToDismissKt$$ExternalSyntheticLambda4);
                    obj2 = swipeToDismissKt$$ExternalSyntheticLambda4;
                } else {
                    obj2 = rememberedValue3;
                }
                Composer composer2 = r11;
                LazyDslKt.m304MarkdownTextpCuZGqc(str3, (Function2) obj2, m302paddingqDBjuR0$default, textStyle, j, null, null, null, 0, 0, 0, composer2, 0, 2016);
                ?? r113 = composer2;
                r113.end(r1);
                r112 = r113;
            }
            r112.end(r4);
            modifier2 = companion2;
            gapComposer = r112;
        } else {
            gapComposer4.skipToGroupEnd();
            modifier2 = modifier;
            gapComposer = gapComposer4;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CopyCodeKt$$ExternalSyntheticLambda10(modifier2, imageTextContent, function1, i, 4);
        }
    }

    public static final void DateRow(Modifier modifier, List list, AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.CalendarDate calendarDate, Function1 function1, boolean z, Composer composer, int i) {
        Modifier modifier2;
        boolean z2;
        boolean z3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1671503363);
        Applier applier = gapComposer.applier;
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(list) ? 32 : 16;
        }
        int i3 = i2 | (gapComposer.changedInstance(calendarDate) ? 256 : 128);
        if ((i & 3072) == 0) {
            i3 |= gapComposer.changedInstance(function1) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            float f = 1.0f;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
            ComposeUiNode.Companion.getClass();
            Function0 function0 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(function0);
            } else {
                gapComposer.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            if (z) {
                gapComposer.startReplaceGroup(1604559242);
                Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion, 1.0f), RecyclerView.DECELERATION_RATE, 8.0f, 1);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(function0);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                ProgressCircularKt.ProgressCircular(0, 1, gapComposer, null);
                gapComposer.end(true);
                gapComposer.end(false);
                z2 = true;
            } else {
                gapComposer.startReplaceGroup(1604777172);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.CalendarDate calendarDate2 = (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.CalendarDate) it.next();
                    boolean z4 = true;
                    LayoutWeightElement layoutWeightElement = new LayoutWeightElement(f, true);
                    List list2 = calendarDate2.treatments;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            if (((AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.DateTreatment) it2.next()) instanceof AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.DateTreatment.Today) {
                                z3 = true;
                                break;
                            }
                        }
                    }
                    z3 = true;
                    z4 = false;
                    boolean equals = calendarDate2.equals(calendarDate);
                    boolean changedInstance = ((i3 & 7168) == 2048 ? z3 : false) | gapComposer.changedInstance(calendarDate2);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new BankingDialogKt$$ExternalSyntheticLambda5(2, function1, calendarDate2);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    CalendarDateItem(layoutWeightElement, calendarDate2, z4, equals, (Function0) rememberedValue, gapComposer, 0);
                    f = f;
                }
                z2 = true;
                gapComposer.end(false);
            }
            gapComposer.end(z2);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerKt$$ExternalSyntheticLambda17(modifier2, list, calendarDate, function1, z, i, 5);
        }
    }

    public static final void Dimmer(Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1949737127);
        int i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            BoxKt.Box(ImageKt.background$default(modifier, Lock.m132linearGradientmHitzGk(new Pair[]{new Pair(Float.valueOf(RecyclerView.DECELERATION_RATE), new Color(Color.m675copywmQWz5c$default(0.2f, Color.Black, 14))), new Pair(Float.valueOf(1.0f), new Color(Color.Transparent))}, (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) & BodyPartID.bodyIdMax), (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (BodyPartID.bodyIdMax & Float.floatToRawIntBits(Float.POSITIVE_INFINITY))), null, 6), gapComposer, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DividerKt$$ExternalSyntheticLambda1(modifier, i, 3);
        }
    }

    public static final void PrepurchaseActiveCard(StyledCardViewModel styledCardViewModel, SharedTransitionScope sharedTransitionScope, AnimatedContentScopeImpl animatedContentScopeImpl, Modifier modifier, Composer composer, int i) {
        int i2;
        AnimatedContentScopeImpl animatedContentScopeImpl2;
        GapComposer gapComposer;
        Modifier modifier2;
        StyledCardViewModel styledCardViewModel2;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1371150908);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(styledCardViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changed(sharedTransitionScope) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            animatedContentScopeImpl2 = animatedContentScopeImpl;
            i2 |= gapComposer2.changedInstance(animatedContentScopeImpl2) ? 256 : 128;
        } else {
            animatedContentScopeImpl2 = animatedContentScopeImpl;
        }
        int i3 = i2 | 3072;
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            boolean booleanValue = ((Boolean) gapComposer2.consume(InspectionModeKt.LocalInspectionMode)).booleanValue();
            Object rememberedValue = gapComposer2.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (rememberedValue == obj) {
                rememberedValue = AnimatableKt.Animatable(booleanValue ? 1.0f : 1.0666667f, 0.01f);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Animatable animatable = (Animatable) rememberedValue;
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (rememberedValue2 == obj) {
                rememberedValue2 = AnimatableKt.Animatable(booleanValue ? 1.0f : RecyclerView.DECELERATION_RATE, 0.01f);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            Animatable animatable2 = (Animatable) rememberedValue2;
            if (booleanValue) {
                gapComposer2.startReplaceGroup(-1476373114);
                gapComposer2.end(false);
            } else {
                gapComposer2.startReplaceGroup(-1476769046);
                Unit unit = Unit.INSTANCE;
                boolean changedInstance = gapComposer2.changedInstance(animatable) | gapComposer2.changedInstance(animatable2);
                Object rememberedValue3 = gapComposer2.rememberedValue();
                if (changedInstance || rememberedValue3 == obj) {
                    rememberedValue3 = new MLKitTitleGenerator$prepareModel$1(animatable, animatable2, null, 6);
                    gapComposer2.updateRememberedValue(rememberedValue3);
                }
                Updater.LaunchedEffect(gapComposer2, unit, (Function2) rememberedValue3);
                gapComposer2.end(false);
            }
            gapComposer2.startReplaceGroup(-878907282);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            SharedTransitionScope.SharedContentState rememberSharedContentState = sharedTransitionScope.rememberSharedContentState("prepurchase-card", gapComposer2, 6);
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (rememberedValue4 == obj) {
                rememberedValue4 = new SharedBoundsNode$$ExternalSyntheticLambda0(2);
                gapComposer2.updateRememberedValue(rememberedValue4);
            }
            Modifier sharedBounds$default = SharedTransitionScope.sharedBounds$default(sharedTransitionScope, fillMaxWidth, rememberSharedContentState, animatedContentScopeImpl2, null, null, (BoundsTransform) rememberedValue4, RemeasureImpl.scaleToBounds$default(SharedTransitionScope.ResizeMode.Companion, ContentScale.Companion.Fit), null, 972);
            ProvidableCompositionLocal providableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer2.consume(providableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            ((DefaultSizes) gapComposer2.consume(providableCompositionLocal)).getClass();
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(sharedBounds$default, 8.0f, 32.0f);
            gapComposer2.end(false);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m299paddingVpY3zN4);
            ComposeUiNode.Companion.getClass();
            Function0 function0 = ComposeUiNode.Companion.Constructor;
            if (gapComposer2.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(function0);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            CardContouredText cardContouredText = styledCardViewModel.contouredText;
            if (cardContouredText != null) {
                float floatValue = ((Number) animatable2.getValue()).floatValue();
                String str = cardContouredText.text;
                Integer num = cardContouredText.color;
                int i4 = cardContouredText.repeatCount;
                str.getClass();
                styledCardViewModel2 = StyledCardViewModel.copy$default(styledCardViewModel, null, null, false, new CardContouredText(str, num, floatValue, i4), 63487);
            } else {
                styledCardViewModel2 = styledCardViewModel;
            }
            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 0.75f);
            float floatValue2 = ((Number) animatable.getValue()).floatValue();
            Modifier scale = ScaleKt.scale(fillMaxWidth2, floatValue2, floatValue2);
            CardThumbnailDisplayStyle cardThumbnailDisplayStyle = CardThumbnailDisplayStyle.STANDARD;
            gapComposer = gapComposer2;
            StyledCardViewKt.m3439StyledCardnSlTg7c(styledCardViewModel2, RotateKt.rotate(scale, -9.0f), null, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, false, gapComposer, 0, 60);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AlertDialogKt$$ExternalSyntheticLambda0(styledCardViewModel, sharedTransitionScope, animatedContentScopeImpl, modifier2, i, 28);
        }
    }

    public static final void PrepurchaseToggleFooterContent(AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PrepurchaseToggleSection prepurchaseToggleSection, AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PrepurchaseToggleSection.ToggleState toggleState, SharedTransitionScope sharedTransitionScope, AnimatedContentScopeImpl animatedContentScopeImpl, Function1 function1, Composer composer, int i) {
        int i2;
        AnimatedContentScopeImpl animatedContentScopeImpl2;
        String str;
        AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PrepurchaseToggleSection.ToggleState toggleState2 = toggleState;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-672267609);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(prepurchaseToggleSection) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(toggleState2.ordinal()) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(sharedTransitionScope) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            animatedContentScopeImpl2 = animatedContentScopeImpl;
            i2 |= gapComposer.changedInstance(animatedContentScopeImpl2) ? 2048 : 1024;
        } else {
            animatedContentScopeImpl2 = animatedContentScopeImpl;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PrepurchaseToggleSection.ToggleState toggleState3 = AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PrepurchaseToggleSection.ToggleState.TURNED_ON;
            String str2 = toggleState2 == toggleState3 ? prepurchaseToggleSection.turnedOnContent.footerLabel : prepurchaseToggleSection.turnedOffContent.footerLabel;
            if (toggleState2 == toggleState3) {
                gapComposer.startReplaceGroup(-1804060649);
                StyledCardViewModel styledCardViewModel = prepurchaseToggleSection.styledCardViewModel;
                if (styledCardViewModel == null) {
                    gapComposer.startReplaceGroup(-91305270);
                    gapComposer.end(false);
                    str = str2;
                } else {
                    gapComposer.startReplaceGroup(-91305269);
                    int i3 = (i2 >> 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION;
                    str = str2;
                    PrepurchaseActiveCard(styledCardViewModel, sharedTransitionScope, animatedContentScopeImpl2, null, gapComposer, i3);
                    gapComposer.end(false);
                }
                gapComposer.end(false);
            } else {
                str = str2;
                gapComposer.startReplaceGroup(-91101413);
                gapComposer.end(false);
            }
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            ModalKt.HorizontalDivider(6, 0, gapComposer, SpacerKt.m300paddingVpY3zN4$default(companion, 24.0f, RecyclerView.DECELERATION_RATE, 2));
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, 8.0f, RecyclerView.DECELERATION_RATE, 2);
            CellDefaultAccessory.Label label = new CellDefaultAccessory.Label(Expect_jvmKt.rememberComposableLambda(-616880390, new InlineAppMessageKt$$ExternalSyntheticLambda8(16, toggleState2, function1, prepurchaseToggleSection), gapComposer), 1);
            long j = Color.Transparent;
            String str3 = str;
            DismissableToastKt$$ExternalSyntheticLambda4 dismissableToastKt$$ExternalSyntheticLambda4 = new DismissableToastKt$$ExternalSyntheticLambda4(toggleState2, prepurchaseToggleSection, sharedTransitionScope, animatedContentScopeImpl, 21);
            toggleState2 = toggleState2;
            CellDefaultKt.m3392CellDefaultLargeIconygcbOzY(Expect_jvmKt.rememberComposableLambda(-1138349627, dismissableToastKt$$ExternalSyntheticLambda4, gapComposer), Expect_jvmKt.rememberComposableLambda(659100836, new AtmPickerGridKt$$ExternalSyntheticLambda4(19, toggleState2, str3), gapComposer), m300paddingVpY3zN4$default, null, null, false, true, null, null, label, j, null, gapComposer, 1572918, 6, 2488);
            gapComposer = gapComposer;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TransitionKt$$ExternalSyntheticLambda9(prepurchaseToggleSection, toggleState2, sharedTransitionScope, animatedContentScopeImpl, function1, i, 10);
        }
    }

    public static final void PrepurchaseToggleSection(AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PrepurchaseToggleSection prepurchaseToggleSection, boolean z, Function1 function1, Modifier modifier, Composer composer, int i) {
        prepurchaseToggleSection.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2078216496);
        int i2 = i | (gapComposer.changedInstance(prepurchaseToggleSection) ? 4 : 2) | (gapComposer.changed(z) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128) | (gapComposer.changed(modifier) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PrepurchaseToggleSection.ToggleState toggleState = prepurchaseToggleSection.toggleState;
            if (toggleState == null) {
                toggleState = AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PrepurchaseToggleSection.ToggleState.TURNED_OFF;
            }
            AfterpayCard(SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(modifier, 1.0f), 24.0f, RecyclerView.DECELERATION_RATE, 2), Expect_jvmKt.rememberComposableLambda(-1995301306, new LocalHomeViewKt$$ExternalSyntheticLambda0(toggleState, prepurchaseToggleSection, z, function1, 7), gapComposer), gapComposer, 48, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeViewKt$$ExternalSyntheticLambda0(prepurchaseToggleSection, z, function1, modifier, i, 8);
        }
    }

    public static final void SecondaryLabelRow(String str, String str2, boolean z, Function0 function0, Composer composer, int i) {
        int i2;
        long j;
        RowScopeInstance rowScopeInstance;
        Modifier.Companion companion;
        boolean z2;
        boolean z3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1160957842);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (gapComposer.changed(str2) ? 32 : 16);
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changed(z) ? 256 : 128;
        }
        int i4 = i3 | (gapComposer.changedInstance(function0) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 1171) != 1170)) {
            boolean z4 = (str == null && str2 == null) ? false : true;
            boolean z5 = (str == null || str2 == null) ? false : true;
            if (z4) {
                gapComposer.startReplaceGroup(-1276123030);
                BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
                RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f);
                Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                Modifier clip = ClipKt.clip(companion2, m340RoundedCornerShape0680j_4);
                int i5 = i4 & 7168;
                boolean z6 = i5 == 2048;
                Object rememberedValue = gapComposer.rememberedValue();
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (z6 || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new LocalMapKt$$ExternalSyntheticLambda10(13, function0);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Modifier semantics = SemanticsModifierKt.semantics(clip, true, (Function1) rememberedValue);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
                }
                MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue2;
                RippleNodeFactory m3400rippleYJYuY3k = RippleKt.m3400rippleYJYuY3k(Color.m675copywmQWz5c$default(0.2f, Strings.getColors(gapComposer).semantic.background.prominent, 14), true, RecyclerView.DECELERATION_RATE, null, gapComposer, 48, 12);
                boolean z7 = i5 == 2048;
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (z7 || rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new y0$$ExternalSyntheticLambda0(22, function0);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                Modifier m182clickableO2vRcR0$default = ImageKt.m182clickableO2vRcR0$default(semantics, mutableInteractionSourceImpl, m3400rippleYJYuY3k, false, null, null, (Function0) rememberedValue3, 28);
                RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, vertical, gapComposer, 48);
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m182clickableO2vRcR0$default);
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
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                if (str == null) {
                    gapComposer.startReplaceGroup(-844844352);
                    gapComposer.end(false);
                    companion = companion2;
                    rowScopeInstance = rowScopeInstance2;
                    z2 = false;
                } else {
                    gapComposer.startReplaceGroup(-844844351);
                    Modifier weight = rowScopeInstance2.weight(1.0f, companion2, false);
                    TextStyle textStyle = Strings.getTypography(gapComposer).bodyMedium;
                    if (z) {
                        gapComposer.startReplaceGroup(-535755413);
                        j = Strings.getColors(gapComposer).semantic.text.warning;
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-535679990);
                        j = Strings.getColors(gapComposer).semantic.text.standard;
                        gapComposer.end(false);
                    }
                    rowScopeInstance = rowScopeInstance2;
                    companion = companion2;
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, j, (Composer) gapComposer, weight, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                    z2 = false;
                    gapComposer.end(false);
                }
                if (z5) {
                    gapComposer.startReplaceGroup(-844423836);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 6, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, " · ", (Map) null, (Function1) null, false);
                    z2 = false;
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-844259505);
                    gapComposer.end(z2);
                }
                if (str2 == null) {
                    gapComposer.startReplaceGroup(-844223515);
                    gapComposer.end(z2);
                    z3 = z2;
                } else {
                    gapComposer.startReplaceGroup(-844223514);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, rowScopeInstance.weight(1.0f, companion, z2), Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                    z3 = false;
                    gapComposer.end(false);
                }
                if (function0 != null) {
                    gapComposer.startReplaceGroup(-843911623);
                    Trace.m1191Iconww6aTOc(Icons.SubtlePush16, (String) null, (Modifier) null, Strings.getColors(gapComposer).semantic.icon.standard, gapComposer, 54, 4);
                    gapComposer.end(z3);
                } else {
                    gapComposer.startReplaceGroup(-843759537);
                    gapComposer.end(z3);
                }
                gapComposer.end(true);
                gapComposer.end(z3);
            } else {
                gapComposer.startReplaceGroup(-1274421936);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CheckoutPaymentSectionKt$$ExternalSyntheticLambda9(str, str2, z, function0, i, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    public static final void StandardHeader(AfterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader afterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader, Function1 function1, Composer composer, int i) {
        Function1 function12;
        int i2;
        AfterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader afterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader2;
        long j;
        long j2;
        Modifier.Companion companion;
        Object obj;
        ?? r0;
        int i3;
        AfterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader afterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader3;
        Modifier.Companion companion2;
        Object obj2;
        Function1 function13;
        Modifier m182clickableO2vRcR0$default;
        Modifier.Companion companion3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2091339265);
        int i4 = i | (gapComposer.changedInstance(afterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader) ? 4 : 2);
        if ((i & 48) == 0) {
            i4 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i5 = i4;
        if (gapComposer.shouldExecute(i5 & 1, (i5 & 19) != 18)) {
            int ordinal = afterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader.displayEffect.ordinal();
            if (ordinal == 0) {
                gapComposer.startReplaceGroup(-267652503);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors.semantic.text.standard;
                gapComposer.end(false);
            } else {
                if (ordinal != 1) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -267656036, false);
                }
                gapComposer.startReplaceGroup(-267649687);
                Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors2.semantic.text.disabled;
                gapComposer.end(false);
            }
            int ordinal2 = afterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader.displayEffect.ordinal();
            if (ordinal2 == 0) {
                gapComposer.startReplaceGroup(-267644343);
                Colors colors3 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors3 == null) {
                    colors3 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j2 = colors3.semantic.icon.standard;
                gapComposer.end(false);
            } else {
                if (ordinal2 != 1) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -267647873, false);
                }
                gapComposer.startReplaceGroup(-267641524);
                Colors colors4 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors4 == null) {
                    colors4 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j2 = colors4.semantic.icon.extraSubtle;
                gapComposer.end(false);
            }
            long j3 = j2;
            String str = afterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader.titleText;
            Modifier.Companion companion4 = Modifier.Companion.$$INSTANCE;
            Object obj3 = Composer.Companion.Empty;
            if (str == null) {
                gapComposer.startReplaceGroup(293101413);
                gapComposer.end(false);
                afterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader3 = afterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader;
                i3 = 1;
                r0 = 0;
                companion = companion4;
                obj = obj3;
            } else {
                gapComposer.startReplaceGroup(293101414);
                Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion4, 24.0f, RecyclerView.DECELERATION_RATE, 2);
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == obj3) {
                    rememberedValue = new AfterpaySearchViewKt$$ExternalSyntheticLambda43(21);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                companion = companion4;
                obj = obj3;
                r0 = 0;
                i3 = 1;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, j, (Composer) gapComposer, SemanticsModifierKt.semantics(m300paddingVpY3zN4$default, false, (Function1) rememberedValue), ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelMedium, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
                gapComposer.end(false);
                afterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader3 = afterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader;
            }
            String str2 = afterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader3.amount;
            if (str2 == null) {
                gapComposer.startReplaceGroup(293377220);
                gapComposer.end(r0);
                afterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader2 = afterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader3;
                companion2 = companion;
                obj2 = obj;
            } else {
                gapComposer.startReplaceGroup(293377221);
                Modifier.Companion companion5 = companion;
                Modifier m300paddingVpY3zN4$default2 = SpacerKt.m300paddingVpY3zN4$default(companion5, 24.0f, RecyclerView.DECELERATION_RATE, 2);
                Object rememberedValue2 = gapComposer.rememberedValue();
                Object obj4 = obj;
                if (rememberedValue2 == obj4) {
                    rememberedValue2 = new AfterpaySearchViewKt$$ExternalSyntheticLambda43(22);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                afterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader2 = afterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader;
                companion2 = companion5;
                obj2 = obj4;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, j, (Composer) gapComposer, SemanticsModifierKt.semantics(m300paddingVpY3zN4$default2, r0, (Function1) rememberedValue2), ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).numeralSmall, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                gapComposer.end(r0);
            }
            String str3 = afterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader2.amountCaption;
            if (str3 == null) {
                gapComposer.startReplaceGroup(293666698);
                gapComposer.end(r0);
                function13 = function1;
                companion3 = companion2;
            } else {
                gapComposer.startReplaceGroup(293666699);
                DBUtil.SpacerWithinSectionSmall(r0, i3, gapComposer, null);
                Modifier.Companion companion6 = companion2;
                Modifier m300paddingVpY3zN4$default3 = SpacerKt.m300paddingVpY3zN4$default(companion6, 24.0f, RecyclerView.DECELERATION_RATE, 2);
                RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Center, Alignment.Companion.CenterVertically, gapComposer, 54);
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default3);
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
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, j, (Composer) gapComposer, (Modifier) Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier, 1.0f, (boolean) r0), ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyMedium, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                Request$Priority$EnumUnboxingLocalUtility.m$1(DefaultSizes.spacing, companion6, 8.0f, gapComposer);
                TappableIcon tappableIcon = afterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader2.tapInfo;
                if (tappableIcon == null) {
                    gapComposer.startReplaceGroup(225485310);
                    gapComposer.end(r0);
                    function13 = function1;
                    companion3 = companion6;
                } else {
                    gapComposer.startReplaceGroup(225485311);
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion6, RecyclerView.DECELERATION_RATE, 2.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                    Tap tap = tappableIcon.tapAction;
                    if (tap == null) {
                        gapComposer.startReplaceGroup(-213377449);
                        gapComposer.end(r0);
                        function13 = function1;
                        companion3 = companion6;
                        m182clickableO2vRcR0$default = null;
                    } else {
                        gapComposer.startReplaceGroup(-213377448);
                        RippleNodeFactory m3400rippleYJYuY3k = RippleKt.m3400rippleYJYuY3k(0L, false, RecyclerView.DECELERATION_RATE, null, gapComposer, 0, 15);
                        Object rememberedValue3 = gapComposer.rememberedValue();
                        Object obj5 = obj2;
                        if (rememberedValue3 == obj5) {
                            rememberedValue3 = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
                        }
                        MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue3;
                        boolean changedInstance = gapComposer.changedInstance(tap) | ((i5 & 112) == 32 ? true : r0);
                        Object rememberedValue4 = gapComposer.rememberedValue();
                        if (changedInstance || rememberedValue4 == obj5) {
                            function13 = function1;
                            rememberedValue4 = new RetroSectionKt$$ExternalSyntheticLambda5(function13, tap, 10);
                            gapComposer.updateRememberedValue(rememberedValue4);
                        } else {
                            function13 = function1;
                        }
                        m182clickableO2vRcR0$default = ImageKt.m182clickableO2vRcR0$default(companion6, mutableInteractionSourceImpl, m3400rippleYJYuY3k, false, null, null, (Function0) rememberedValue4, 28);
                        companion3 = companion6;
                        gapComposer.end(r0);
                    }
                    if (m182clickableO2vRcR0$default == null) {
                        m182clickableO2vRcR0$default = companion3;
                    }
                    Modifier then = m302paddingqDBjuR0$default.then(m182clickableO2vRcR0$default);
                    zzd zzdVar = Icons.Companion;
                    String str4 = tappableIcon.arcadeIconId;
                    zzdVar.getClass();
                    Icons icons = zzd.get(str4);
                    if (icons == null) {
                        icons = Icons.InformationOutline16;
                    }
                    Trace.m1191Iconww6aTOc(icons, tappableIcon.accessibilityText, then, j3, gapComposer, 0, 0);
                    gapComposer.end(r0);
                }
                i3 = 1;
                gapComposer.end(true);
                gapComposer.end(r0);
            }
            String str5 = afterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader2.bodyText;
            if (str5 == null) {
                gapComposer.startReplaceGroup(295078159);
                gapComposer.end(r0);
                i2 = i3;
                function12 = function13;
            } else {
                gapComposer.startReplaceGroup(295078160);
                DBUtil.SpacerWithinSectionSmall(r0, i3, gapComposer, null);
                Modifier m300paddingVpY3zN4$default4 = SpacerKt.m300paddingVpY3zN4$default(companion3, 24.0f, RecyclerView.DECELERATION_RATE, 2);
                TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
                Colors colors5 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors5 == null) {
                    colors5 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, (boolean) r0);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(r0);
                }
                function12 = function13;
                Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, colors5.semantic.text.subtle, (Composer) gapComposer, m300paddingVpY3zN4$default4, textStyle, (TextLineBalancing) null, str5, (Map) null, (Function1) null, false);
                gapComposer.end(r0);
                i2 = 1;
            }
            DBUtil.SpacerWithinSectionMedium(r0, i2, gapComposer, null);
        } else {
            function12 = function1;
            i2 = 1;
            afterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader2 = afterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AfterpayCardSectionKt$$ExternalSyntheticLambda17(afterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader2, function12, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:168:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x018d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TileCarouselCard(Modifier modifier, AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardContent.CarouselTile carouselTile, float f, final float f2, final boolean z, final boolean z2, final int i, final PagerState pagerState, final CoroutineScope coroutineScope, final float f3, final Function1 function1, Composer composer, final int i2) {
        GapComposer gapComposer;
        AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardContent.CarouselTile carouselTile2;
        final Modifier modifier2;
        String str;
        String str2;
        Modifier.Companion companion;
        NeverEqualPolicy neverEqualPolicy;
        int i3;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        GapComposer gapComposer2;
        Modifier modifier3;
        final AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardContent.CarouselTile carouselTile3;
        CoroutineScope coroutineScope2;
        RoundedCornerShape roundedCornerShape;
        Modifier modifier4;
        GapComposer gapComposer3;
        boolean z3;
        String m;
        float f4 = f;
        GapComposer gapComposer4 = (GapComposer) composer;
        gapComposer4.startRestartGroup(-52927847);
        Applier applier = gapComposer4.applier;
        int i4 = i2 | 6;
        if ((i2 & 48) == 0) {
            i4 |= gapComposer4.changedInstance(carouselTile) ? 32 : 16;
        }
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 |= gapComposer4.changed(f4) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= gapComposer4.changed(f2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= gapComposer4.changed(z) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i2) == 0) {
            i4 |= gapComposer4.changed(z2) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i2) == 0) {
            i4 |= gapComposer4.changed(i) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i2) == 0) {
            i4 |= gapComposer4.changed(pagerState) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= gapComposer4.changedInstance(coroutineScope) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= gapComposer4.changed(f3) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        char c = gapComposer4.changedInstance(function1) ? (char) 4 : (char) 2;
        if (gapComposer4.shouldExecute(i4 & 1, ((i4 & 306783379) == 306783378 && (c & 3) == 2) ? false : true)) {
            final String stringResource = Room.stringResource(gapComposer4, R.string.afterpay_carousel_action_next);
            final String stringResource2 = Room.stringResource(gapComposer4, R.string.afterpay_carousel_action_previous);
            String str3 = carouselTile.name;
            String str4 = carouselTile.name;
            RemoteImage.ImageUrl imageUrl = carouselTile.image.url;
            int i5 = i4;
            final String format2 = new MessageFormat(Room.stringResource(gapComposer4, R.string.afterpay_carousel_label)).format(zzel$EnumUnboxingLocalUtility.m(1, "merchantName", str3));
            final String format3 = new MessageFormat(Room.stringResource(gapComposer4, R.string.afterpay_carousel_open_merchant)).format(SVG$Unit$EnumUnboxingLocalUtility.m(1, format2, "merchantName", str4));
            format3.getClass();
            Strings.getSizes(gapComposer4).getClass();
            Object obj = DefaultSizes.border.entries;
            RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f);
            if (Strings.getColors(gapComposer4).isLight) {
                str2 = imageUrl.light;
            } else {
                String str5 = imageUrl.dark;
                if (StringsKt.isBlank(str5)) {
                    str5 = null;
                }
                if (str5 == null) {
                    str2 = imageUrl.light;
                } else {
                    str = str5;
                    Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(ZIndexModifierKt.zIndex(companion2, f3), 1.0f);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                    int hashCode = Long.hashCode(gapComposer4.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer4.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer4, fillMaxWidth);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (applier != null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer4.startReusableNode();
                    if (gapComposer4.inserting) {
                        gapComposer4.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer4.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer4, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$12);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer4, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$13);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer4, valueOf, composeUiNode$Companion$SetModifier$14);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer4, ownerSnapshotObserver$onCommitAffectingLayout$12);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer4, materializeModifier, composeUiNode$Companion$SetModifier$15);
                    Modifier scale = ScaleKt.scale(SizeKt.m287sizeVpY3zN4(companion2, 144.0f, 208.0f), f2, f2);
                    int i6 = i5 & 29360128;
                    int i7 = i5 & 458752;
                    boolean changed = gapComposer4.changed(stringResource) | gapComposer4.changedInstance(coroutineScope) | (i6 == 8388608) | gapComposer4.changed(stringResource2) | gapComposer4.changed(format2) | gapComposer4.changed(format3) | (i7 == 131072) | gapComposer4.changedInstance(carouselTile);
                    int i8 = c & 14;
                    boolean z4 = changed | (i8 == 4);
                    int i9 = i5 & 3670016;
                    boolean z5 = z4 | (i9 == 1048576);
                    Object rememberedValue = gapComposer4.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
                    if (z5 || rememberedValue == neverEqualPolicy2) {
                        companion = companion2;
                        neverEqualPolicy = neverEqualPolicy2;
                        i3 = i7;
                        ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                        composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$12;
                        gapComposer2 = gapComposer4;
                        modifier3 = scale;
                        carouselTile3 = carouselTile;
                        Function1 function12 = new Function1() { // from class: com.squareup.cash.afterpayapplet.views.homesection.v3.TileCarouselContentKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj2;
                                semanticsPropertyReceiver.getClass();
                                CoroutineScope coroutineScope3 = coroutineScope;
                                PagerState pagerState2 = pagerState;
                                SemanticsPropertiesKt.setCustomActions(semanticsPropertyReceiver, CollectionsKt__CollectionsKt.listOf((Object[]) new CustomAccessibilityAction[]{new CustomAccessibilityAction(stringResource, new PagerKt$$ExternalSyntheticLambda2(coroutineScope3, pagerState2, 4)), new CustomAccessibilityAction(stringResource2, new PagerKt$$ExternalSyntheticLambda2(coroutineScope3, pagerState2, 5))}));
                                SemanticsPropertiesKt.m950setRolekuIjeqM(semanticsPropertyReceiver, 0);
                                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, format2);
                                SemanticsPropertiesKt.onClick(semanticsPropertyReceiver, format3, new TileCarouselContentKt$$ExternalSyntheticLambda4(z2, carouselTile3, coroutineScope3, function1, pagerState2, i, 1));
                                return Unit.INSTANCE;
                            }
                        };
                        coroutineScope2 = coroutineScope;
                        gapComposer2.updateRememberedValue(function12);
                        rememberedValue = function12;
                    } else {
                        companion = companion2;
                        coroutineScope2 = coroutineScope;
                        neverEqualPolicy = neverEqualPolicy2;
                        i3 = i7;
                        ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                        composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$12;
                        gapComposer2 = gapComposer4;
                        modifier3 = scale;
                        carouselTile3 = carouselTile;
                    }
                    Modifier semantics = SemanticsModifierKt.semantics(modifier3, true, (Function1) rememberedValue);
                    if (z) {
                        long j = Color.Black;
                        float f5 = 0.2f * f;
                        modifier4 = Dp.m1036compareTo0680j_4(6.0f, RecyclerView.DECELERATION_RATE) <= 0 ? companion : new ShadowGraphicsLayerElement(6.0f, m340RoundedCornerShape0680j_4, false, Color.m675copywmQWz5c$default(f5, j, 14), Color.m675copywmQWz5c$default(f5, j, 14));
                        roundedCornerShape = m340RoundedCornerShape0680j_4;
                    } else {
                        roundedCornerShape = m340RoundedCornerShape0680j_4;
                        modifier4 = companion;
                    }
                    Modifier then = semantics.then(modifier4);
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, then);
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer2.useNode();
                    }
                    Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$13 = ownerSnapshotObserver$onCommitAffectingLayout$1;
                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$14, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$13);
                    Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$15);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = LocalImageLoaderKt.LocalImageLoader;
                    RealImageLoader realImageLoader = (RealImageLoader) gapComposer2.consume(staticProvidableCompositionLocal);
                    Modifier.Companion companion3 = companion;
                    Modifier clip = ClipKt.clip(AlphaKt.alpha(SizeKt.m287sizeVpY3zN4(companion3, 144.0f, 208.0f), f), roundedCornerShape);
                    GapComposer gapComposer5 = gapComposer2;
                    f4 = f;
                    RippleNodeFactory m3400rippleYJYuY3k = RippleKt.m3400rippleYJYuY3k(0L, false, RecyclerView.DECELERATION_RATE, null, gapComposer5, 48, 13);
                    Object rememberedValue2 = gapComposer5.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy3 = neverEqualPolicy;
                    if (rememberedValue2 == neverEqualPolicy3) {
                        rememberedValue2 = Recorder$$ExternalSyntheticOutline2.m(gapComposer5);
                    }
                    MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue2;
                    boolean changedInstance = (i3 == 131072) | gapComposer5.changedInstance(carouselTile3) | (i8 == 4) | gapComposer5.changedInstance(coroutineScope2) | (i6 == 8388608) | (i9 == 1048576);
                    Object rememberedValue3 = gapComposer5.rememberedValue();
                    if (changedInstance || rememberedValue3 == neverEqualPolicy3) {
                        gapComposer3 = gapComposer5;
                        TileCarouselContentKt$$ExternalSyntheticLambda4 tileCarouselContentKt$$ExternalSyntheticLambda4 = new TileCarouselContentKt$$ExternalSyntheticLambda4(z2, carouselTile3, coroutineScope2, function1, pagerState, i, 0);
                        gapComposer3.updateRememberedValue(tileCarouselContentKt$$ExternalSyntheticLambda4);
                        rememberedValue3 = tileCarouselContentKt$$ExternalSyntheticLambda4;
                    } else {
                        gapComposer3 = gapComposer5;
                    }
                    gapComposer = gapComposer3;
                    carouselTile2 = carouselTile;
                    AsyncImageKt.m1443SubcomposeAsyncImageQgsmV_s(str, null, realImageLoader, ImageKt.m182clickableO2vRcR0$default(clip, mutableInteractionSourceImpl, m3400rippleYJYuY3k, false, null, null, (Function0) rememberedValue3, 28), null, null, lambda$1659785927, gapComposer, 48, 4080);
                    if (carouselTile2.showDimmer) {
                        gapComposer.startReplaceGroup(-512178231);
                        Dimmer(ClipKt.clip(AlphaKt.alpha(SizeKt.fillMaxSize(companion3, 1.0f), f4), roundedCornerShape), gapComposer, 0);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-512097507);
                        gapComposer.end(false);
                    }
                    Modifier alpha = AlphaKt.alpha(OffsetKt.m272offsetVpY3zN4(companion3, 6.0f, 6.0f), f4);
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 54);
                    int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, alpha);
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$13);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$14, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$13);
                    Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$15);
                    UiAvatar uiAvatar = carouselTile2.avatar;
                    Image image = uiAvatar != null ? uiAvatar.image : null;
                    if (image == null) {
                        gapComposer.startReplaceGroup(1180329131);
                        z3 = false;
                        gapComposer.end(false);
                        m = null;
                    } else {
                        z3 = false;
                        m = SVG$Unit$EnumUnboxingLocalUtility.m(gapComposer, 869359126, image, gapComposer, false);
                    }
                    if (m == null) {
                        gapComposer.startReplaceGroup(1180377212);
                        gapComposer.end(z3);
                    } else {
                        gapComposer.startReplaceGroup(1180377213);
                        AsyncImageKt.m1443SubcomposeAsyncImageQgsmV_s(m, null, (RealImageLoader) gapComposer.consume(staticProvidableCompositionLocal), ClipKt.clip(SizeKt.m285size3ABfNKs(companion3, 32.0f), RoundedCornerShapeKt.CircleShape), null, null, lambda$203752105, gapComposer, 48, 4080);
                        Strings.getSizes(gapComposer).getClass();
                        DefaultSizes.spacing.getClass();
                        SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(companion3, 4.0f));
                        gapComposer.end(false);
                    }
                    zzacn.m2012AutoScaleTextZLomxE(1, 0, 0, 1597488, 416, Strings.getColors(gapComposer).base.constantWhite, Room.getSp(10), gapComposer, SizeKt.fillMaxWidth(companion3, 1.0f), Strings.getTypography(gapComposer).labelSmall, str4, null);
                    Boxes$$ExternalSyntheticOutline1.m(gapComposer, true, true, true);
                    modifier2 = companion3;
                }
            }
            str = str2;
            Modifier.Companion companion22 = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(ZIndexModifierKt.zIndex(companion22, f3), 1.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode4 = Long.hashCode(gapComposer4.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer4.currentCompositionLocalScope();
            Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer4, fillMaxWidth2);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
            if (applier != null) {
            }
        } else {
            gapComposer = gapComposer4;
            carouselTile2 = carouselTile;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            final float f6 = f4;
            final AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardContent.CarouselTile carouselTile4 = carouselTile2;
            endRestartGroup.block = new Function2() { // from class: com.squareup.cash.afterpayapplet.views.homesection.v3.TileCarouselContentKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    AfterpayCardKt.TileCarouselCard(Modifier.this, carouselTile4, f6, f2, z, z2, i, pagerState, coroutineScope, f3, function1, (Composer) obj2, Updater.updateChangedFlags(i2 | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void TileCarouselContent(int i, Composer composer, Modifier modifier, List list, Function1 function1) {
        Function1 function12;
        GapComposer gapComposer;
        Modifier modifier2;
        list.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-2006862447);
        int i2 = i | 6 | (gapComposer2.changedInstance(list) ? 32 : 16);
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            function12 = function1;
            i2 |= gapComposer2.changedInstance(function12) ? 256 : 128;
        } else {
            function12 = function1;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new Dp(208.0f);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            float f = ((Dp) rememberedValue).value;
            float f2 = ((Configuration) gapComposer2.consume(AndroidCompositionLocals_androidKt.LocalConfiguration)).screenWidthDp;
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer2);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            CoroutineScope coroutineScope = (CoroutineScope) rememberedValue2;
            boolean changed = gapComposer2.changed(f2);
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (changed || rememberedValue3 == neverEqualPolicy) {
                float f3 = Dp.m1036compareTo0680j_4(f2, 352.0f) > 0 ? Dp.m1036compareTo0680j_4(f2, 448.0f) >= 0 ? -130.0f : (-155.0f) + (((f2 - 352.0f) / 96.0f) * 25.0f) : -155.0f;
                if (f3 > -110.0f) {
                    f3 = -110.0f;
                }
                rememberedValue3 = new Dp(f3);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            float f4 = ((Dp) rememberedValue3).value;
            int size = 1073741823 - (1073741823 % list.size());
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = new MotionKt$$ExternalSyntheticLambda0(20);
                gapComposer2.updateRememberedValue(rememberedValue4);
            }
            DefaultPagerState rememberPagerState = PagerStateKt.rememberPagerState(size, (Function0) rememberedValue4, gapComposer2, MLKEMEngine.KyberPolyBytes, 2);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m277height3ABfNKs);
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
            Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            modifier2 = companion;
            PagerKt.m328HorizontalPager8jOkeI(rememberPagerState, SizeKt.fillMaxWidth(companion, 1.0f), null, new PageSize.Fixed(f), 0, f4, null, null, false, null, SnapPosition$Start.INSTANCE$1, null, Expect_jvmKt.rememberComposableLambda(-304686422, new TabToolbarsKt$$ExternalSyntheticLambda16(list, rememberPagerState, coroutineScope, function12, 2), gapComposer2), gapComposer2, 48, 24960, 12244);
            gapComposer = gapComposer2;
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CreateCartErrorBannerKt$$ExternalSyntheticLambda3(modifier2, list, function1, i, 1);
        }
    }

    public static final void TransactionAccessory(RealCellActivityAccessoryScope realCellActivityAccessoryScope, AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardContent.TransactionRowViewModel transactionRowViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1570524413);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(realCellActivityAccessoryScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(transactionRowViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardContent.InlineButton inlineButton = transactionRowViewModel.inlineButton;
            if (inlineButton != null) {
                gapComposer.startReplaceGroup(1881122896);
                int i3 = (gapComposer.changedInstance(inlineButton) ? 1 : 0) | ((i2 & 896) != 256 ? 0 : 1);
                Object rememberedValue = gapComposer.rememberedValue();
                Object obj = Composer.Companion.Empty;
                Object obj2 = rememberedValue;
                if (i3 != 0 || rememberedValue == obj) {
                    Object bankingDialogKt$$ExternalSyntheticLambda5 = new BankingDialogKt$$ExternalSyntheticLambda5(5, (Object) inlineButton, function1);
                    gapComposer.updateRememberedValue(bankingDialogKt$$ExternalSyntheticLambda5);
                    obj2 = bankingDialogKt$$ExternalSyntheticLambda5;
                }
                BankingDialogKt$$ExternalSyntheticLambda5 bankingDialogKt$$ExternalSyntheticLambda52 = (Function0) obj2;
                boolean changedInstance = gapComposer.changedInstance(inlineButton);
                Object rememberedValue2 = gapComposer.rememberedValue();
                Object obj3 = rememberedValue2;
                if (changedInstance || rememberedValue2 == obj) {
                    Object transactionRowKt$$ExternalSyntheticLambda9 = new TransactionRowKt$$ExternalSyntheticLambda9(inlineButton, 0);
                    gapComposer.updateRememberedValue(transactionRowKt$$ExternalSyntheticLambda9);
                    obj3 = transactionRowKt$$ExternalSyntheticLambda9;
                }
                realCellActivityAccessoryScope.button(bankingDialogKt$$ExternalSyntheticLambda52, (Function1) obj3);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1881364200);
                realCellActivityAccessoryScope.amount(Expect_jvmKt.rememberComposableLambda(617325292, new TransactionRowKt$$ExternalSyntheticLambda4(transactionRowViewModel, r5), gapComposer));
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CopyCodeKt$$ExternalSyntheticLambda10(realCellActivityAccessoryScope, transactionRowViewModel, function1, i, 5);
        }
    }

    public static final void TransactionListContent(AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardContent.TransactionList transactionList, Modifier modifier, Function1 function1, Composer composer, int i) {
        Modifier modifier2;
        transactionList.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(948721892);
        int i2 = i | (gapComposer.changedInstance(transactionList) ? 4 : 2) | 48 | (gapComposer.changedInstance(function1) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            modifier2 = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier2, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
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
            gapComposer.startReplaceGroup(-711967319);
            ListIterator listIterator = transactionList.transactions.listIterator(0);
            while (listIterator.hasNext()) {
                TransactionRow((AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardContent.TransactionRowViewModel) listIterator.next(), null, function1, gapComposer, i2 & 896);
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InlineAppMessageKt$$ExternalSyntheticLambda8((Object) transactionList, (Object) modifier2, function1, i, 17);
        }
    }

    public static final void TransactionRow(AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardContent.TransactionRowViewModel transactionRowViewModel, Modifier modifier, Function1 function1, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        transactionRowViewModel.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1437652167);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(transactionRowViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Colors.Component component = colors.component;
            Colors.Component.Cell cell = component.cell;
            ArcadeThemeKt.ArcadeTheme(Colors.copy$default(colors, Colors.Component.copy$default(component, null, null, Colors.Component.Cell.copy$default(cell, new Colors.Component.Cell.Background(colors.semantic.background.subtle, cell.background.pressed)), null, null, null, null, 134217695), null, 55), null, null, Expect_jvmKt.rememberComposableLambda(-2144113390, new AtmPickerGridKt$$ExternalSyntheticLambda4(transactionRowViewModel, function1), gapComposer), gapComposer, 3072, 6);
            modifier2 = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CopyCodeKt$$ExternalSyntheticLambda10(transactionRowViewModel, modifier2, function1, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void V3OptimizedStandardHeader(AfterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader afterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader, Function1 function1, Composer composer, int i) {
        int i2;
        long j;
        long j2;
        boolean z;
        long j3;
        Object obj;
        Object obj2;
        Modifier m182clickableO2vRcR0$default;
        Modifier.Companion companion;
        Object obj3;
        long j4;
        Modifier.Companion companion2;
        Modifier modifier;
        int i3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-35729489);
        int i4 = i | (gapComposer.changedInstance(afterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader) ? 4 : 2);
        if ((i & 48) == 0) {
            i4 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i5 = i4;
        if (gapComposer.shouldExecute(i5 & 1, (i5 & 19) != 18)) {
            int ordinal = afterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader.displayEffect.ordinal();
            if (ordinal == 0) {
                gapComposer.startReplaceGroup(23708151);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors.semantic.text.standard;
                gapComposer.end(false);
            } else {
                if (ordinal != 1) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 23704618, false);
                }
                gapComposer.startReplaceGroup(23710967);
                Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors2.semantic.text.disabled;
                gapComposer.end(false);
            }
            int ordinal2 = afterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader.displayEffect.ordinal();
            if (ordinal2 == 0) {
                gapComposer.startReplaceGroup(23716311);
                Colors colors3 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors3 == null) {
                    colors3 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j2 = colors3.semantic.icon.standard;
                gapComposer.end(false);
            } else {
                if (ordinal2 != 1) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 23712781, false);
                }
                gapComposer.startReplaceGroup(23719130);
                Colors colors4 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors4 == null) {
                    colors4 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j2 = colors4.semantic.icon.extraSubtle;
                gapComposer.end(false);
            }
            long j5 = j2;
            String str = afterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader.amountCaption;
            Modifier.Companion companion3 = Modifier.Companion.$$INSTANCE;
            Object obj4 = Composer.Companion.Empty;
            if (str == null) {
                gapComposer.startReplaceGroup(735387674);
                gapComposer.end(false);
                z = 0;
                j3 = j;
                obj = obj4;
            } else {
                gapComposer.startReplaceGroup(735387675);
                Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion3, 24.0f, RecyclerView.DECELERATION_RATE, 2);
                RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Center, Alignment.Companion.CenterVertically, gapComposer, 54);
                long j6 = j;
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
                ComposeUiNode.Companion.getClass();
                Function0 function0 = ComposeUiNode.Companion.Constructor;
                if (gapComposer.applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(function0);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                z = 0;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, j6, (Composer) gapComposer, (Modifier) Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier, 1.0f, false), ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelMedium, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                j3 = j6;
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                Request$Priority$EnumUnboxingLocalUtility.m$1(DefaultSizes.spacing, companion3, 8.0f, gapComposer);
                TappableIcon tappableIcon = afterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader.tapInfo;
                if (tappableIcon == null) {
                    gapComposer.startReplaceGroup(27308668);
                    gapComposer.end(false);
                    companion3 = companion3;
                    obj = obj4;
                } else {
                    gapComposer.startReplaceGroup(27308669);
                    companion3 = companion3;
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion3, RecyclerView.DECELERATION_RATE, 2.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                    Tap tap = tappableIcon.tapAction;
                    if (tap == null) {
                        gapComposer.startReplaceGroup(552171575);
                        gapComposer.end(false);
                        obj = obj4;
                        m182clickableO2vRcR0$default = null;
                    } else {
                        gapComposer.startReplaceGroup(552171576);
                        RippleNodeFactory m3400rippleYJYuY3k = RippleKt.m3400rippleYJYuY3k(0L, false, RecyclerView.DECELERATION_RATE, null, gapComposer, 0, 15);
                        Object rememberedValue = gapComposer.rememberedValue();
                        obj = obj4;
                        Object obj5 = rememberedValue;
                        if (rememberedValue == obj) {
                            obj5 = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
                        }
                        MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) obj5;
                        boolean changedInstance = gapComposer.changedInstance(tap) | ((i5 & 112) == 32);
                        Object rememberedValue2 = gapComposer.rememberedValue();
                        if (changedInstance || rememberedValue2 == obj) {
                            Object retroSectionKt$$ExternalSyntheticLambda5 = new RetroSectionKt$$ExternalSyntheticLambda5(function1, tap, 9);
                            gapComposer.updateRememberedValue(retroSectionKt$$ExternalSyntheticLambda5);
                            obj2 = retroSectionKt$$ExternalSyntheticLambda5;
                        } else {
                            obj2 = rememberedValue2;
                        }
                        m182clickableO2vRcR0$default = ImageKt.m182clickableO2vRcR0$default(companion3, mutableInteractionSourceImpl, m3400rippleYJYuY3k, false, null, null, (Function0) obj2, 28);
                        gapComposer.end(false);
                    }
                    if (m182clickableO2vRcR0$default == null) {
                        m182clickableO2vRcR0$default = companion3;
                    }
                    Modifier then = m302paddingqDBjuR0$default.then(m182clickableO2vRcR0$default);
                    zzd zzdVar = Icons.Companion;
                    String str2 = tappableIcon.arcadeIconId;
                    zzdVar.getClass();
                    Icons icons = zzd.get(str2);
                    if (icons == null) {
                        icons = Icons.InformationOutline16;
                    }
                    Trace.m1191Iconww6aTOc(icons, tappableIcon.accessibilityText, then, j5, gapComposer, 0, 0);
                    gapComposer.end(false);
                }
                gapComposer.end(true);
                gapComposer.end(false);
            }
            String str3 = afterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader.amount;
            if (str3 == null) {
                gapComposer.startReplaceGroup(736766678);
                gapComposer.end(z);
                companion = companion3;
                obj3 = obj;
                j4 = j3;
            } else {
                gapComposer.startReplaceGroup(736766679);
                Modifier m300paddingVpY3zN4$default2 = SpacerKt.m300paddingVpY3zN4$default(companion3, 24.0f, RecyclerView.DECELERATION_RATE, 2);
                Object rememberedValue3 = gapComposer.rememberedValue();
                Object obj6 = rememberedValue3;
                if (rememberedValue3 == obj) {
                    Object afterpaySearchViewKt$$ExternalSyntheticLambda43 = new AfterpaySearchViewKt$$ExternalSyntheticLambda43(19);
                    gapComposer.updateRememberedValue(afterpaySearchViewKt$$ExternalSyntheticLambda43);
                    obj6 = afterpaySearchViewKt$$ExternalSyntheticLambda43;
                }
                companion = companion3;
                obj3 = obj;
                j4 = j3;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, j4, (Composer) gapComposer, SemanticsModifierKt.semantics(m300paddingVpY3zN4$default2, z, (Function1) obj6), ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).numeralSmall, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                gapComposer.end(z);
            }
            String str4 = afterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader.titleText;
            if (str4 == null) {
                gapComposer.startReplaceGroup(737016600);
                gapComposer.end(z);
                companion2 = companion;
                modifier = null;
                i3 = 1;
            } else {
                gapComposer.startReplaceGroup(737016601);
                DBUtil.SpacerWithinSectionSmall(z ? 1 : 0, 1, gapComposer, null);
                Modifier m300paddingVpY3zN4$default3 = SpacerKt.m300paddingVpY3zN4$default(companion, 24.0f, RecyclerView.DECELERATION_RATE, 2);
                Object rememberedValue4 = gapComposer.rememberedValue();
                Object obj7 = rememberedValue4;
                if (rememberedValue4 == obj3) {
                    Object afterpaySearchViewKt$$ExternalSyntheticLambda432 = new AfterpaySearchViewKt$$ExternalSyntheticLambda43(20);
                    gapComposer.updateRememberedValue(afterpaySearchViewKt$$ExternalSyntheticLambda432);
                    obj7 = afterpaySearchViewKt$$ExternalSyntheticLambda432;
                }
                companion2 = companion;
                modifier = null;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, j4, (Composer) gapComposer, SemanticsModifierKt.semantics(m300paddingVpY3zN4$default3, z, (Function1) obj7), ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelMedium, (TextLineBalancing) null, str4, (Map) null, (Function1) null, false);
                i3 = 1;
                DBUtil.SpacerBetweenSectionLarge(z ? 1 : 0, 1, gapComposer, null);
                gapComposer.end(z);
            }
            String str5 = afterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader.bodyText;
            if (str5 == null) {
                gapComposer.startReplaceGroup(737324833);
                gapComposer.end(z);
            } else {
                gapComposer.startReplaceGroup(737324834);
                DBUtil.SpacerWithinSectionSmall(z ? 1 : 0, i3, gapComposer, modifier);
                Modifier m300paddingVpY3zN4$default4 = SpacerKt.m300paddingVpY3zN4$default(companion2, 24.0f, RecyclerView.DECELERATION_RATE, 2);
                TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
                Colors colors5 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors5 == null) {
                    colors5 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, z);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(z);
                }
                Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, colors5.semantic.text.subtle, (Composer) gapComposer, m300paddingVpY3zN4$default4, textStyle, (TextLineBalancing) null, str5, (Map) null, (Function1) null, false);
                gapComposer.end(z);
                i3 = 1;
            }
            DBUtil.SpacerWithinSectionSmall(z ? 1 : 0, i3, gapComposer, modifier);
            i2 = z;
        } else {
            i2 = 0;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AfterpayCardSectionKt$$ExternalSyntheticLambda17(afterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader, function1, i, i2);
        }
    }

    public static final void SecondaryLabelRow(String str, String str2, Function0 function0, Composer composer, int i) {
        boolean z;
        boolean z2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1722261501);
        int i2 = i | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changed(str2) ? 32 : 16) | (gapComposer.changedInstance(function0) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            boolean z3 = (str == null && str2 == null) ? false : true;
            boolean z4 = (str == null || str2 == null) ? false : true;
            if (z3) {
                gapComposer.startReplaceGroup(-212707725);
                BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
                RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f);
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                Modifier clip = ClipKt.clip(companion, m340RoundedCornerShape0680j_4);
                Object rememberedValue = gapComposer.rememberedValue();
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (rememberedValue == neverEqualPolicy) {
                    rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
                }
                MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue;
                RippleNodeFactory m3400rippleYJYuY3k = RippleKt.m3400rippleYJYuY3k(Color.m675copywmQWz5c$default(0.2f, Strings.getColors(gapComposer).semantic.background.prominent, 14), true, RecyclerView.DECELERATION_RATE, null, gapComposer, 48, 12);
                gapComposer = gapComposer;
                Role role = new Role(0);
                boolean z5 = (i2 & 896) == 256;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (z5 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new y0$$ExternalSyntheticLambda0(24, function0);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                Modifier m182clickableO2vRcR0$default = ImageKt.m182clickableO2vRcR0$default(clip, mutableInteractionSourceImpl, m3400rippleYJYuY3k, false, null, role, (Function0) rememberedValue2, 12);
                RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, vertical, gapComposer, 48);
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m182clickableO2vRcR0$default);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                if (gapComposer.applier != null) {
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
                    if (str == null) {
                        gapComposer.startReplaceGroup(-1628365549);
                        gapComposer.end(false);
                        z = false;
                    } else {
                        gapComposer.startReplaceGroup(-1628365548);
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                        z = false;
                        gapComposer.end(false);
                    }
                    if (z4) {
                        gapComposer.startReplaceGroup(-1628162219);
                        Room.m1165Text25TpFw(0, 0, 0, 0, 6, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, " · ", (Map) null, (Function1) null, false);
                        z = false;
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-1627997888);
                        gapComposer.end(z);
                    }
                    if (str2 == null) {
                        gapComposer.startReplaceGroup(-1627970981);
                        gapComposer.end(z);
                        z2 = z;
                    } else {
                        gapComposer.startReplaceGroup(-1627970980);
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) new LayoutWeightElement(1.0f, z), Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                        z2 = false;
                        gapComposer.end(false);
                    }
                    Trace.m1191Iconww6aTOc(Icons.SubtlePush16, (String) null, SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, 4.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), Strings.getColors(gapComposer).semantic.icon.standard, gapComposer, 438, 0);
                    gapComposer.end(true);
                    gapComposer.end(z2);
                } else {
                    Updater.invalidApplier();
                    throw null;
                }
            } else {
                gapComposer.startReplaceGroup(-211369889);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DisclaimerTextKt$$ExternalSyntheticLambda0(i, 1, str, str2, function0);
        }
    }
}
