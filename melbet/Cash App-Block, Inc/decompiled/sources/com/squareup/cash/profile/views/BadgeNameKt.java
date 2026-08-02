package com.squareup.cash.profile.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.foundation.text.KeyMappingKt;
import androidx.compose.material.SwipeToDismissKt$$ExternalSyntheticLambda3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.TextUnit;
import androidx.constraintlayout.motion.widget.Debug;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.TransactorKt;
import androidx.room.util.DBUtil;
import app.cash.local.views.cart.CreateCartErrorBannerKt$$ExternalSyntheticLambda3;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda34;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.AsyncImageKt;
import coil3.size.DimensionKt;
import com.squareup.cash.R;
import com.squareup.cash.account.settings.viewmodels.ConfirmReplaceInfoViewModel;
import com.squareup.cash.account.settings.viewmodels.ErrorViewModel;
import com.squareup.cash.account.settings.viewmodels.IncomingRequestsViewModel;
import com.squareup.cash.account.settings.viewmodels.ProfilePasscodeSectionViewModel;
import com.squareup.cash.account.settings.viewmodels.ProfilePasswordDialogViewModel$MessageDialog;
import com.squareup.cash.account.settings.viewmodels.ProfilePrivacyReadyViewModel$SearchPrivacySectionViewModel;
import com.squareup.cash.account.settings.viewmodels.SearchPrivacySectionViewEvent;
import com.squareup.cash.account.settings.viewmodels.TaxesPasswordViewModel;
import com.squareup.cash.account.settings.viewmodels.UnsupportedSettingViewModel;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.list.ListUnorderedKt;
import com.squareup.cash.arcade.components.list.ListUnorderedProminence;
import com.squareup.cash.arcade.components.list.ListUnorderedSize;
import com.squareup.cash.arcade.components.list.ListUnorderedState;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.blockers.views.PasscodeKt$$ExternalSyntheticLambda2;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.data.profile.Badge;
import com.squareup.cash.favorites.components.AddFavoritesViewKt;
import com.squareup.cash.history.payments.viewmodels.ProfilePaymentHistoryViewModel;
import com.squareup.cash.history.payments.views.PaymentHistoryWidgetKt;
import com.squareup.cash.moneybot.views.chat.EmptyChatKt;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.mooncake.compose_ui.components.LoadingIndicatorPosition;
import com.squareup.cash.pdf.view.ComposableSingletons$PdfPreviewViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.pdf.view.PdfPreviewViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.pdf.view.PdfPreviewViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.pools.views.PoolDetailsViewKt$$ExternalSyntheticLambda47;
import com.squareup.cash.pools.views.PoolListSectionKt$$ExternalSyntheticLambda2;
import com.squareup.cash.presenters.AliasFormatter;
import com.squareup.cash.profile.viewmodels.AccountSwitchInfoDialogViewModel;
import com.squareup.cash.profile.viewmodels.GenericProfileElementViewModel;
import com.squareup.cash.profile.viewmodels.GenericProfileElementsViewModel$Error;
import com.squareup.cash.profile.viewmodels.GenericProfileElementsViewModel$Loading;
import com.squareup.cash.profile.viewmodels.GenericProfileElementsViewModel$Success;
import com.squareup.cash.profile.viewmodels.OpenSourceViewModel;
import com.squareup.cash.profile.viewmodels.ProfileConfirmRemoveAliasViewModel;
import com.squareup.cash.profile.viewmodels.ProfileConfirmSignOutViewModel;
import com.squareup.cash.profile.viewmodels.ProfileHeaderMenuViewModel;
import com.squareup.cash.profile.viewmodels.ProfileHeaderViewModel;
import com.squareup.cash.score.views.InfoSectionKt$$ExternalSyntheticLambda6;
import com.squareup.cash.score.views.InfoSectionKt$$ExternalSyntheticLambda7;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda9;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda10;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import com.squareup.protos.cash.ui.Image;
import com.squareup.util.Strings;
import com.squareup.util.android.PhoneNumbers;
import com.squareup.util.cash.Countries;
import com.squareup.wire.GrpcStatus;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes7.dex */
public abstract class BadgeNameKt {

    /* renamed from: lambda$-1541872554, reason: not valid java name */
    public static final ComposableLambdaImpl f585lambda$1541872554;

    /* renamed from: lambda$-1625547461, reason: not valid java name */
    public static final ComposableLambdaImpl f587lambda$1625547461;

    /* renamed from: lambda$-1790826007, reason: not valid java name */
    public static final ComposableLambdaImpl f589lambda$1790826007;

    /* renamed from: lambda$-219794344, reason: not valid java name */
    public static final ComposableLambdaImpl f591lambda$219794344;

    /* renamed from: lambda$-302814757, reason: not valid java name */
    public static final ComposableLambdaImpl f593lambda$302814757;
    public static final ComposableLambdaImpl lambda$1549296059;
    public static final ComposableLambdaImpl lambda$2072434502;
    public static final ComposableLambdaImpl lambda$290178986;
    public static final ComposableLambdaImpl lambda$403942179;

    /* renamed from: lambda$-175527992, reason: not valid java name */
    public static final ComposableLambdaImpl f588lambda$175527992 = new ComposableLambdaImpl(new PoolDetailsViewKt$$ExternalSyntheticLambda47(29), false, -175527992);
    public static final ComposableLambdaImpl lambda$1614831592 = new ComposableLambdaImpl(new ProfileHeaderKt$$ExternalSyntheticLambda0(1), false, 1614831592);

    /* renamed from: lambda$-656254315, reason: not valid java name */
    public static final ComposableLambdaImpl f595lambda$656254315 = new ComposableLambdaImpl(new ProfileHeaderKt$$ExternalSyntheticLambda0(2), false, -656254315);
    public static final ComposableLambdaImpl lambda$808694203 = new ComposableLambdaImpl(new ProfileHeaderKt$$ExternalSyntheticLambda0(3), false, 808694203);
    public static final ComposableLambdaImpl lambda$1120632772 = new ComposableLambdaImpl(new ComposableSingletons$ProfileKt$$ExternalSyntheticLambda0(12), false, 1120632772);

    /* renamed from: lambda$-845025819, reason: not valid java name */
    public static final ComposableLambdaImpl f597lambda$845025819 = new ComposableLambdaImpl(new ComposableSingletons$ProfileKt$$ExternalSyntheticLambda0(13), false, -845025819);

    /* renamed from: lambda$-2047310898, reason: not valid java name */
    public static final ComposableLambdaImpl f590lambda$2047310898 = new ComposableLambdaImpl(new ComposableSingletons$ProfileKt$$ExternalSyntheticLambda0(14), false, -2047310898);

    /* renamed from: lambda$-1095479059, reason: not valid java name */
    public static final ComposableLambdaImpl f584lambda$1095479059 = new ComposableLambdaImpl(new ComposableSingletons$ProfileKt$$ExternalSyntheticLambda0(15), false, -1095479059);

    /* renamed from: lambda$-835749766, reason: not valid java name */
    public static final ComposableLambdaImpl f596lambda$835749766 = new ComposableLambdaImpl(new ProfileHeaderKt$$ExternalSyntheticLambda0(4), false, -835749766);

    /* renamed from: lambda$-422843559, reason: not valid java name */
    public static final ComposableLambdaImpl f594lambda$422843559 = new ComposableLambdaImpl(new ProfileHeaderKt$$ExternalSyntheticLambda0(5), false, -422843559);

    /* renamed from: lambda$-261596534, reason: not valid java name */
    public static final ComposableLambdaImpl f592lambda$261596534 = new ComposableLambdaImpl(new ProfileHeaderKt$$ExternalSyntheticLambda0(6), false, -261596534);

    /* renamed from: lambda$-911593955, reason: not valid java name */
    public static final ComposableLambdaImpl f598lambda$911593955 = new ComposableLambdaImpl(new ProfileHeaderKt$$ExternalSyntheticLambda0(7), false, -911593955);

    /* renamed from: lambda$-1549555830, reason: not valid java name */
    public static final ComposableLambdaImpl f586lambda$1549555830 = new ComposableLambdaImpl(new ComposableSingletons$ProfileKt$$ExternalSyntheticLambda0(0), false, -1549555830);
    public static final ComposableLambdaImpl lambda$2004763253 = new ComposableLambdaImpl(new ProfileHeaderKt$$ExternalSyntheticLambda0(8), false, 2004763253);

    static {
        new ComposableLambdaImpl(new ComposableSingletons$ProfileKt$$ExternalSyntheticLambda0(16), false, -1670935824);
        new ComposableLambdaImpl(new ComposableSingletons$ProfileKt$$ExternalSyntheticLambda0(17), false, 1104101459);
        lambda$2072434502 = new ComposableLambdaImpl(new ComposableSingletons$PdfPreviewViewKt$$ExternalSyntheticLambda1(12), false, 2072434502);
        lambda$290178986 = new ComposableLambdaImpl(new ComposableSingletons$PdfPreviewViewKt$$ExternalSyntheticLambda1(13), false, 290178986);
        lambda$1549296059 = new ComposableLambdaImpl(new ProfileHeaderKt$$ExternalSyntheticLambda0(9), false, 1549296059);
        f593lambda$302814757 = new ComposableLambdaImpl(new ProfileHeaderKt$$ExternalSyntheticLambda0(10), false, -302814757);
        f589lambda$1790826007 = new ComposableLambdaImpl(new ComposableSingletons$ProfileKt$$ExternalSyntheticLambda0(18), false, -1790826007);
        lambda$403942179 = new ComposableLambdaImpl(new ComposableSingletons$ProfileKt$$ExternalSyntheticLambda0(19), false, 403942179);
        f591lambda$219794344 = new ComposableLambdaImpl(new ProfileHeaderKt$$ExternalSyntheticLambda0(11), false, -219794344);
        f585lambda$1541872554 = new ComposableLambdaImpl(new ComposableSingletons$ProfileKt$$ExternalSyntheticLambda0(20), false, -1541872554);
        f587lambda$1625547461 = new ComposableLambdaImpl(new ProfileHeaderKt$$ExternalSyntheticLambda0(12), false, -1625547461);
    }

    public static final void AccountSwitchInfoDialog(AccountSwitchInfoDialogViewModel accountSwitchInfoDialogViewModel, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1596954504);
        int i2 = 4;
        int i3 = (gapComposer.changedInstance(accountSwitchInfoDialogViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        int i4 = 0;
        int i5 = 1;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            ModalKt.Modal((Modifier) null, Expect_jvmKt.rememberComposableLambda(118141513, new AccountSwitchInfoDialogViewKt$$ExternalSyntheticLambda0(accountSwitchInfoDialogViewModel, i4), gapComposer), Expect_jvmKt.rememberComposableLambda(-274857432, new AccountSwitchInfoDialogViewKt$$ExternalSyntheticLambda0(accountSwitchInfoDialogViewModel, i5), gapComposer), Expect_jvmKt.rememberComposableLambda(-1823104556, new ProfileKt$$ExternalSyntheticLambda1(29, (Object) accountSwitchInfoDialogViewModel, function1), gapComposer), (Function3) null, (Function3) null, gapComposer, 3504, 49);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ErrorView$$ExternalSyntheticLambda0(accountSwitchInfoDialogViewModel, function1, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x006e  */
    /* renamed from: BadgeName-6ERogkM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3726BadgeName6ERogkM(String str, Badge badge, Modifier modifier, int i, Composer composer, int i2, int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        int i6;
        Modifier modifier3;
        int i7;
        RecomposeScopeImpl endRestartGroup;
        Modifier modifier4;
        int i8;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1187791613);
        if ((i2 & 6) == 0) {
            i4 = (gapComposer.changed(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= gapComposer.changed(badge == null ? -1 : badge.ordinal()) ? 32 : 16;
        }
        int i9 = i3 & 4;
        if (i9 != 0) {
            i4 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            modifier2 = modifier;
            i4 |= gapComposer.changed(modifier2) ? 256 : 128;
            i5 = i4 | 3072;
            if ((i2 & 24576) != 0) {
                if ((i3 & 16) == 0) {
                    i6 = i;
                    if (gapComposer.changed(i6)) {
                        i8 = 16384;
                        i5 |= i8;
                    }
                } else {
                    i6 = i;
                }
                i8 = PKIFailureInfo.certRevoked;
                i5 |= i8;
            } else {
                i6 = i;
            }
            int i10 = 0;
            if (gapComposer.shouldExecute(i5 & 1, (i5 & 9363) == 9362)) {
                gapComposer.skipToGroupEnd();
                modifier3 = modifier2;
                i7 = i6;
            } else {
                gapComposer.startDefaults();
                if ((i2 & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                    Modifier modifier5 = i9 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                    if ((i3 & 16) != 0) {
                        i5 &= -57345;
                        modifier4 = modifier5;
                        i6 = 5;
                    } else {
                        modifier4 = modifier5;
                    }
                } else {
                    gapComposer.skipToGroupEnd();
                    if ((i3 & 16) != 0) {
                        i5 &= -57345;
                    }
                    modifier4 = modifier2;
                }
                gapComposer.endDefaults();
                AnnotatedString.Builder builder = new AnnotatedString.Builder();
                builder.append(str);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (badge == null) {
                    gapComposer.startReplaceGroup(-735293125);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-735293124);
                    builder.append(" ");
                    KeyMappingKt.appendInlineContent(builder, "badge", "�");
                    linkedHashMap.put("badge", new InlineTextContent(new Placeholder(7, Room.getSp(24), Room.getSp(24)), Expect_jvmKt.rememberComposableLambda(1371505345, new BadgeNameKt$$ExternalSyntheticLambda0(badge, i10), gapComposer)));
                    gapComposer.end(false);
                }
                int i11 = i6;
                Room.m1164Text25TpFw(0, 0, 0, i11, ((i5 >> 3) & 112) | ((i5 << 12) & 234881024), 0, 1784, 0L, (Composer) gapComposer, modifier4, builder.toAnnotatedString(), ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).header, (TextLineBalancing) null, (Map) linkedHashMap, (Function1) null, false);
                i7 = i11;
                modifier3 = modifier4;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new BadgeNameKt$$ExternalSyntheticLambda1(str, badge, modifier3, i7, i2, i3);
                return;
            }
            return;
        }
        modifier2 = modifier;
        i5 = i4 | 3072;
        if ((i2 & 24576) != 0) {
        }
        int i102 = 0;
        if (gapComposer.shouldExecute(i5 & 1, (i5 & 9363) == 9362)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: BadgeTitle-fjcvTT8, reason: not valid java name */
    public static final void m3727BadgeTitlefjcvTT8(Modifier modifier, final String str, final boolean z, long j, TextStyle textStyle, long j2, final long j3, Composer composer, final int i) {
        final Modifier modifier2;
        final long j4;
        final TextStyle textStyle2;
        final long j5;
        long j6;
        TextStyle textStyle3;
        Modifier modifier3;
        long j7;
        long j8;
        long j9;
        str.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1801708984);
        int i2 = i | 6 | (gapComposer.changed(str) ? 32 : 16) | (gapComposer.changed(z) ? 256 : 128) | 1647616 | (gapComposer.changed(j3) ? 8388608 : 4194304);
        if (gapComposer.shouldExecute(i2 & 1, (4793491 & i2) != 4793490)) {
            gapComposer.startDefaults();
            if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                gapComposer.startReplaceGroup(1044898235);
                long j10 = ((Color) gapComposer.consume(ArcadeThemeKt.LocalTextColor)).value;
                if (j10 == 16) {
                    j10 = Strings.getColors(gapComposer).semantic.text.standard;
                }
                gapComposer.end(false);
                TextStyle textStyle4 = (TextStyle) gapComposer.consume(ArcadeThemeKt.LocalTextStyle);
                if (textStyle4 == null) {
                    gapComposer.startReplaceGroup(-1100573765);
                    textStyle4 = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                } else {
                    gapComposer.startReplaceGroup(-1100574912);
                }
                gapComposer.end(false);
                long sp = Room.getSp(4);
                j6 = j10;
                textStyle3 = textStyle4;
                modifier3 = Modifier.Companion.$$INSTANCE;
                j7 = sp;
            } else {
                gapComposer.skipToGroupEnd();
                modifier3 = modifier;
                j6 = j;
                textStyle3 = textStyle;
                j7 = j2;
            }
            gapComposer.endDefaults();
            AnnotatedString.Builder builder = new AnnotatedString.Builder();
            builder.append(str);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (z) {
                gapComposer.startReplaceGroup(-505556507);
                builder.append(" ");
                KeyMappingKt.appendInlineContent(builder, "badge", "�");
                j9 = j6;
                float m1059getValueimpl = TextUnit.m1059getValueimpl(textStyle3.spanStyle.fontSize);
                j8 = j7;
                linkedHashMap.put("badge", new InlineTextContent(new Placeholder(7, Room.pack(4294967296L, TextUnit.m1059getValueimpl(j7) + m1059getValueimpl), Room.pack(4294967296L, m1059getValueimpl + 1.0f)), Expect_jvmKt.rememberComposableLambda(-832219953, new BadgeTitleKt$$ExternalSyntheticLambda0(0, j7, j3), gapComposer)));
                gapComposer.end(false);
            } else {
                j8 = j7;
                j9 = j6;
                gapComposer.startReplaceGroup(-504675270);
                gapComposer.end(false);
            }
            long j11 = j9;
            TextStyle textStyle5 = textStyle3;
            Room.m1164Text25TpFw(0, 0, 0, 0, 48, 0, 1776, j11, (Composer) gapComposer, modifier3, builder.toAnnotatedString(), textStyle5, (TextLineBalancing) null, (Map) linkedHashMap, (Function1) null, false);
            j4 = j11;
            modifier2 = modifier3;
            textStyle2 = textStyle5;
            j5 = j8;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
            j4 = j;
            textStyle2 = textStyle;
            j5 = j2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2(str, z, j4, textStyle2, j5, j3, i) { // from class: com.squareup.cash.profile.views.BadgeTitleKt$$ExternalSyntheticLambda1
                public final /* synthetic */ String f$1;
                public final /* synthetic */ boolean f$2;
                public final /* synthetic */ long f$3;
                public final /* synthetic */ TextStyle f$4;
                public final /* synthetic */ long f$6;
                public final /* synthetic */ long f$7;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(1);
                    BadgeNameKt.m3727BadgeTitlefjcvTT8(Modifier.this, this.f$1, this.f$2, this.f$3, this.f$4, this.f$6, this.f$7, (Composer) obj, updateChangedFlags);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void BlankDividerView(Modifier modifier, GenericProfileElementViewModel.BlankDivider blankDivider, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1689107907);
        int i2 = i | 6 | (gapComposer.changedInstance(blankDivider) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            GenericProfileElementViewModel.BlankDivider.Size size = GenericProfileElementViewModel.BlankDivider.Size.SMALL;
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(fillMaxWidth, 32.0f));
            modifier = companion;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ErrorView$$ExternalSyntheticLambda0(modifier, blankDivider, i, 7);
        }
    }

    public static final void ButtonWidgetView(final GenericProfileElementViewModel.ButtonWidget buttonWidget, Function1 function1, Modifier modifier, boolean z, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        boolean z2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-549058320);
        if ((i & 6) == 0) {
            i2 = i | (gapComposer.changedInstance(buttonWidget) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | 3456;
        final int i4 = 0;
        final int i5 = 1;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            boolean changedInstance = ((i3 & 112) == 32) | gapComposer.changedInstance(buttonWidget);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new GenericProfileElementsViewKt$$ExternalSyntheticLambda5(buttonWidget, function1, 0);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function0 function0 = (Function0) rememberedValue;
            GenericProfileElement.ButtonElement.TertiaryStyle.TitleStyle titleStyle = buttonWidget.titleStyle;
            if (titleStyle == null) {
                titleStyle = GenericProfileElement.ButtonElement.TertiaryStyle.TitleStyle.DEFAULT;
            }
            int ordinal = titleStyle.ordinal();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (ordinal == 0) {
                gapComposer.startReplaceGroup(-1760559768);
                coil3.size.SizeKt.ButtonCta(function0, SizeKt.fillMaxWidth(companion, 1.0f), null, false, false, null, Expect_jvmKt.rememberComposableLambda(-1459199053, new Function3() { // from class: com.squareup.cash.profile.views.GenericProfileElementsViewKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i6 = i4;
                        GenericProfileElementViewModel.ButtonWidget buttonWidget2 = buttonWidget;
                        switch (i6) {
                            case 0:
                                Composer composer2 = (Composer) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                ((RowScope) obj).getClass();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                    String str = buttonWidget2.title;
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str == null ? "" : str, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer3 = (Composer) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                ((RowScope) obj).getClass();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                    String str2 = buttonWidget2.title;
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2 == null ? "" : str2, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer), gapComposer, 1572864, 60);
                gapComposer.end(false);
            } else {
                if (ordinal != 1) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 635943233, false);
                }
                gapComposer.startReplaceGroup(-1760424360);
                gapComposer.startReplaceGroup(-1760393360);
                coil3.size.SizeKt.ButtonCta(function0, SizeKt.fillMaxWidth(companion, 1.0f), null, true, false, null, Expect_jvmKt.rememberComposableLambda(-560683857, new Function3() { // from class: com.squareup.cash.profile.views.GenericProfileElementsViewKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i6 = i5;
                        GenericProfileElementViewModel.ButtonWidget buttonWidget2 = buttonWidget;
                        switch (i6) {
                            case 0:
                                Composer composer2 = (Composer) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                ((RowScope) obj).getClass();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                    String str = buttonWidget2.title;
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str == null ? "" : str, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer3 = (Composer) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                ((RowScope) obj).getClass();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                    String str2 = buttonWidget2.title;
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2 == null ? "" : str2, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer), gapComposer, 1575936, 52);
                gapComposer.end(false);
                gapComposer.end(false);
            }
            z2 = true;
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
            z2 = z;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeGeoViewKt$$ExternalSyntheticLambda34(buttonWidget, function1, modifier2, z2, i);
        }
    }

    public static final void CellAction(GenericProfileElementViewModel.ButtonWidget buttonWidget, Function1 function1, Composer composer, int i) {
        int i2;
        buttonWidget.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(410583608);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(buttonWidget) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = 18;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ComposableLambdaImpl composableLambdaImpl = null;
            Icons icons = buttonWidget.block != null ? Icons.Block24 : buttonWidget.report != null ? Icons.AlertReportedFill24 : null;
            if (icons == null) {
                gapComposer.startReplaceGroup(-370336740);
            } else {
                gapComposer.startReplaceGroup(-370336739);
                composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(132921314, new InfoSectionKt$$ExternalSyntheticLambda6(icons, 22), gapComposer);
            }
            gapComposer.end(false);
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1841047257, new PdfPreviewViewKt$$ExternalSyntheticLambda2(buttonWidget, i3), gapComposer);
            boolean changedInstance = gapComposer.changedInstance(buttonWidget) | ((i2 & 112) == 32);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new GenericProfileElementsViewKt$$ExternalSyntheticLambda5(buttonWidget, function1, 1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(composableLambdaImpl, rememberComposableLambda, null, (Function0) rememberedValue, false, false, null, null, CellDefaultAccessory.Push.INSTANCE, 0L, gapComposer, 805306416, 3572);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OpenSourceKt$$ExternalSyntheticLambda1(buttonWidget, function1, i, 25);
        }
    }

    public static final void ConfirmReplaceInfo(Modifier modifier, ConfirmReplaceInfoViewModel confirmReplaceInfoViewModel, Function1 function1, Composer composer, int i) {
        Modifier modifier2;
        confirmReplaceInfoViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-463078932);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(confirmReplaceInfoViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
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
            KeypadKt.m3651TextPdH14aY(0, 0, 3, 0, 0, 0, 3832, 0L, (Composer) gapComposer, SpacerKt.m299paddingVpY3zN4(SizeKt.fillMaxWidth(companion, 1.0f), 16.0f, 32.0f), MooncakeTheme.getTypography(gapComposer).mainTitle, (TextLineBalancing) null, confirmReplaceInfoViewModel.infoText, (Map) null, (Function1) null, false);
            KeypadKt.m3642DivideraMcp0Q(SizeKt.fillMaxWidth(companion, 1.0f), 0L, RecyclerView.DECELERATION_RATE, gapComposer, 6, 6);
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new ErrorViewKt$$ExternalSyntheticLambda4(25, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            KeypadKt.m3651TextPdH14aY(0, 0, 3, 0, 0, 0, 3832, 0L, (Composer) gapComposer, SpacerKt.m298padding3ABfNKs(SizeKt.fillMaxWidth(ImageKt.m183clickableoSLSa3U$default(companion, false, null, null, (Function0) rememberedValue, 15), 1.0f), 16.0f), MooncakeTheme.getTypography(gapComposer).mainBody, (TextLineBalancing) null, confirmReplaceInfoViewModel.primaryButtonText, (Map) null, (Function1) null, false);
            KeypadKt.m3642DivideraMcp0Q(SizeKt.fillMaxWidth(companion, 1.0f), 0L, RecyclerView.DECELERATION_RATE, gapComposer, 6, 6);
            boolean z2 = i3 == 256;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new ErrorViewKt$$ExternalSyntheticLambda4(26, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            KeypadKt.m3651TextPdH14aY(0, 0, 3, 0, 0, 0, 3832, 0L, (Composer) gapComposer, SpacerKt.m298padding3ABfNKs(SizeKt.fillMaxWidth(ImageKt.m183clickableoSLSa3U$default(companion, false, null, null, (Function0) rememberedValue2, 15), 1.0f), 16.0f), MooncakeTheme.getTypography(gapComposer).mainTitle, (TextLineBalancing) null, confirmReplaceInfoViewModel.secondaryButtonText, (Map) null, (Function1) null, false);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScoreHomeKt$$ExternalSyntheticLambda9(i, 11, modifier2, confirmReplaceInfoViewModel, function1);
        }
    }

    public static final void ErrorDialog(final ErrorViewModel errorViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1027165556);
        int i2 = i | (gapComposer.changedInstance(errorViewModel) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        final int i4 = 0;
        final int i5 = 1;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-911254053, new Function3() { // from class: com.squareup.cash.profile.views.ErrorViewKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i6 = i4;
                    ErrorViewModel errorViewModel2 = errorViewModel;
                    switch (i6) {
                        case 0:
                            Composer composer2 = (Composer) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            ((ColumnScope) obj).getClass();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                String str = errorViewModel2.title;
                                if (str == null) {
                                    gapComposer2.startReplaceGroup(1318800470);
                                } else {
                                    gapComposer2.startReplaceGroup(1318800471);
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                }
                                gapComposer2.end(false);
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
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, errorViewModel2.message, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer);
            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(1480253148, new Function3() { // from class: com.squareup.cash.profile.views.ErrorViewKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i6 = i5;
                    ErrorViewModel errorViewModel2 = errorViewModel;
                    switch (i6) {
                        case 0:
                            Composer composer2 = (Composer) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            ((ColumnScope) obj).getClass();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                String str = errorViewModel2.title;
                                if (str == null) {
                                    gapComposer2.startReplaceGroup(1318800470);
                                } else {
                                    gapComposer2.startReplaceGroup(1318800471);
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                }
                                gapComposer2.end(false);
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
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, errorViewModel2.message, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer);
            ComposableLambdaImpl rememberComposableLambda3 = Expect_jvmKt.rememberComposableLambda(-1597990736, new PdfPreviewViewKt$$ExternalSyntheticLambda4(27, function1), gapComposer);
            modifier2 = Modifier.Companion.$$INSTANCE;
            ModalKt.Modal(modifier2, rememberComposableLambda, rememberComposableLambda2, rememberComposableLambda3, (Function3) null, (Function3) null, gapComposer, 3510, 48);
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScoreHomeKt$$ExternalSyntheticLambda9(errorViewModel, function1, modifier2, i, 13);
        }
    }

    public static final void FavoritesListWidgetView(int i, Composer composer, Modifier modifier, ArrayList arrayList, Function1 function1) {
        Modifier modifier2;
        Modifier wrapContentHeight;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1599148933);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(arrayList) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            modifier2 = Modifier.Companion.$$INSTANCE;
            wrapContentHeight = SizeKt.wrapContentHeight(SizeKt.fillMaxWidth(modifier2, 1.0f), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(wrapContentHeight, 16.0f, RecyclerView.DECELERATION_RATE, 16.0f, 12.0f, 2);
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new ProfileKt$$ExternalSyntheticLambda3(18, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function1 function12 = (Function1) rememberedValue;
            boolean z2 = i3 == 256;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new ErrorViewKt$$ExternalSyntheticLambda4(29, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Function0 function0 = (Function0) rememberedValue2;
            boolean z3 = i3 == 256;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (z3 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new ProfileKt$$ExternalSyntheticLambda0(1, function1);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            AddFavoritesViewKt.ListFavoritesCard(m302paddingqDBjuR0$default, arrayList, function12, function0, (Function0) rememberedValue3, gapComposer, i2 & 112);
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new GenericProfileElementsViewKt$$ExternalSyntheticLambda12(modifier2, arrayList, function1, i);
        }
    }

    public static final void GenericProfileElements(Modifier modifier, Debug debug, Function1 function1, Composer composer, int i) {
        Modifier modifier2;
        debug.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1363035383);
        int i2 = i | 6 | (gapComposer.changedInstance(debug) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            modifier2 = Modifier.Companion.$$INSTANCE;
            Modifier m276defaultMinSizeVpY3zN4$default = SizeKt.m276defaultMinSizeVpY3zN4$default(modifier2, RecyclerView.DECELERATION_RATE, 120.0f, 1);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m276defaultMinSizeVpY3zN4$default);
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
            if (debug instanceof GenericProfileElementsViewModel$Loading) {
                gapComposer.startReplaceGroup(1570049334);
                TransactorKt.LoadingPlaceholder(SizeKt.fillMaxWidth(modifier2, 1.0f), LoadingIndicatorPosition.CENTER, gapComposer, 54, 0);
                gapComposer.end(false);
            } else if (debug instanceof GenericProfileElementsViewModel$Success) {
                gapComposer.startReplaceGroup(1426997848);
                SuccessView(function1, null, (GenericProfileElementsViewModel$Success) debug, gapComposer, ((i2 << 3) & 896) | ((i2 >> 6) & 14));
                gapComposer.end(false);
            } else {
                if (!(debug instanceof GenericProfileElementsViewModel$Error)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1570048108, false);
                }
                gapComposer.startReplaceGroup(1570055201);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ErrorView$$ExternalSyntheticLambda1(modifier2, debug, function1, i, 20);
        }
    }

    public static final void GenericProfilePaymentHistoryWidgetView(GenericProfileElementViewModel.PaymentHistoryWidget paymentHistoryWidget, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1505454595);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(paymentHistoryWidget) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            boolean changed = gapComposer.changed(paymentHistoryWidget);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.mutableStateOf$default(paymentHistoryWidget.viewModel);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, Modifier.Companion.$$INSTANCE);
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
            DBUtil.SpacerBetweenSectionXLargeBelowCell(0, 1, gapComposer, null);
            ProfilePaymentHistoryViewModel profilePaymentHistoryViewModel = (ProfilePaymentHistoryViewModel) mutableState.getValue();
            boolean z = (i2 & 112) == 32;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new ProfileKt$$ExternalSyntheticLambda3(17, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            PaymentHistoryWidgetKt.PaymentHistoryWidgetView(profilePaymentHistoryViewModel, (Function1) rememberedValue2, null, gapComposer, 0, 4);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OpenSourceKt$$ExternalSyntheticLambda1(paymentHistoryWidget, function1, i, 26);
        }
    }

    public static final void GroupedButtonsWidget(int i, Composer composer, Modifier modifier, List list, Function1 function1) {
        int i2;
        function1.getClass();
        list.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(885983366);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(list) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
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
            DBUtil.SpacerBetweenSectionXLargeBelowCell(0, 1, gapComposer, null);
            ViewfinderDefaults.SectionHeader(Room.stringResource(gapComposer, R.string.profile_section_title_what_you_can_do), (Modifier) null, (String) null, (Function0) null, (String) null, gapComposer, 0, 30);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            gapComposer.startReplaceGroup(-934845307);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                CellAction((GenericProfileElementViewModel.ButtonWidget) it.next(), function1, gapComposer, i2 & 112);
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CreateCartErrorBannerKt$$ExternalSyntheticLambda3(modifier, function1, list, i);
        }
    }

    public static final void IconWidgetView(Modifier modifier, GenericProfileElementViewModel.IconTextWidget iconTextWidget, Composer composer, int i) {
        Modifier modifier2;
        Modifier.Companion companion;
        boolean z;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(862235255);
        int i2 = i | 6 | (gapComposer.changedInstance(iconTextWidget) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(companion2, 16.0f, 16.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.CenterVertically, gapComposer, 54);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m299paddingVpY3zN4);
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
            Image image = iconTextWidget.icon;
            if (image == null) {
                gapComposer.startReplaceGroup(-426676148);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-426676147);
                String urlForTheme = ThemablesKt.urlForTheme(image, gapComposer);
                Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion2, 24.0f);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                long j = colors.semantic.icon.standard;
                AsyncImageKt.m1438AsyncImage10Xjiaw(urlForTheme, null, m285size3ABfNKs, null, null, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer, 432, 1784);
                gapComposer.end(false);
            }
            String str = iconTextWidget.title;
            if (str == null) {
                gapComposer.startReplaceGroup(-426415531);
                gapComposer.end(false);
                z = true;
                companion = companion2;
            } else {
                gapComposer.startReplaceGroup(-426415530);
                companion = companion2;
                z = true;
                KeypadKt.m3651TextPdH14aY(2, 0, 0, 0, 196608, 0, 4058, 0L, (Composer) gapComposer, (Modifier) null, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelMedium, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                gapComposer = gapComposer;
                gapComposer.end(false);
            }
            gapComposer.end(z);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ErrorView$$ExternalSyntheticLambda0(modifier2, iconTextWidget, i, 10);
        }
    }

    public static final void IncomingRequests(IncomingRequestsViewModel incomingRequestsViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2019425890);
        int i2 = (gapComposer.changedInstance(incomingRequestsViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1016696215, new ErrorView$$ExternalSyntheticLambda0(function1, incomingRequestsViewModel.policy), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ErrorView$$ExternalSyntheticLambda1((Object) incomingRequestsViewModel, function1, (Object) modifier2, i, 22);
        }
    }

    public static final void OpenSource(OpenSourceViewModel openSourceViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        openSourceViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(913867827);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(openSourceViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-2002665272, new ErrorView$$ExternalSyntheticLambda0(9, (Object) openSourceViewModel, function1), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OpenSourceKt$$ExternalSyntheticLambda1(openSourceViewModel, function1, i, 0);
        }
    }

    public static final void ProfileConfirmRemoveAlias(ProfileConfirmRemoveAliasViewModel profileConfirmRemoveAliasViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(315774762);
        int i2 = (gapComposer.changedInstance(profileConfirmRemoveAliasViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            String displayText = AliasFormatter.getDisplayText((String) profileConfirmRemoveAliasViewModel.text.getValue(), profileConfirmRemoveAliasViewModel.f1191type, PhoneNumbers.Format.NATIONAL);
            if (displayText == null) {
                displayText = "";
            }
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(831520319, new ErrorView$$ExternalSyntheticLambda1(profileConfirmRemoveAliasViewModel, displayText, function1), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ErrorView$$ExternalSyntheticLambda1((Object) profileConfirmRemoveAliasViewModel, function1, (Object) modifier2, i, 25);
        }
    }

    public static final void ProfileHeader(Modifier modifier, ProfileHeaderViewModel profileHeaderViewModel, Function0 function0, Composer composer, int i) {
        Modifier modifier2;
        GapComposer gapComposer;
        Color m;
        AvatarImage.Remote.Image image;
        Color m2;
        ProfileHeaderViewModel profileHeaderViewModel2;
        ComposableLambdaImpl composableLambdaImpl;
        ComposableLambdaImpl composableLambdaImpl2;
        profileHeaderViewModel.getClass();
        StackedAvatarViewModel.Single single = profileHeaderViewModel.avatarViewModel;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1431446008);
        int i2 = i | (gapComposer2.changedInstance(profileHeaderViewModel) ? 32 : 16) | (gapComposer2.changedInstance(function0) ? 256 : 128);
        int i3 = 0;
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            StackedAvatarViewModel.Avatar avatar = single != null ? single.avatar : null;
            Image image2 = avatar != null ? avatar.remoteImage : null;
            if (image2 == null) {
                gapComposer2.startReplaceGroup(522504045);
                gapComposer2.end(false);
                image = null;
            } else {
                gapComposer2.startReplaceGroup(522504046);
                String urlForTheme = ThemablesKt.urlForTheme(image2, gapComposer2);
                ColorModel colorModel = avatar.transformTintColor;
                if (colorModel == null) {
                    gapComposer2.startReplaceGroup(-263792921);
                    gapComposer2.end(false);
                    m = null;
                } else {
                    m = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer2, -978340774, colorModel, gapComposer2, false);
                }
                AvatarImage.Remote.Image image3 = new AvatarImage.Remote.Image(urlForTheme, avatar.transformTintColor != null, null, m != null ? m.value : Color.Unspecified, new ProfileHeaderKt$$ExternalSyntheticLambda0(i3), 44);
                gapComposer2.end(false);
                image = image3;
            }
            ColorModel colorModel2 = avatar != null ? avatar.backgroundColor : null;
            if (colorModel2 == null) {
                gapComposer2.startReplaceGroup(522852175);
                gapComposer2.end(false);
                m2 = null;
            } else {
                m2 = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer2, -1230059790, colorModel2, gapComposer2, false);
            }
            String str = profileHeaderViewModel.badgeName.name;
            Character monogram = str != null ? GrpcStatus.Companion.monogram(str) : null;
            Object rememberedValue = gapComposer2.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer2);
            }
            MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            modifier2 = modifier;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, modifier2);
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
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer2, null);
            if (single != null) {
                gapComposer2.startReplaceGroup(320579119);
                profileHeaderViewModel2 = profileHeaderViewModel;
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(984675921, new SwipeToDismissKt$$ExternalSyntheticLambda3(mutableInteractionSourceImpl, profileHeaderViewModel, function0, monogram, m2, image, 20), gapComposer2);
                gapComposer2.end(false);
                composableLambdaImpl = rememberComposableLambda;
            } else {
                profileHeaderViewModel2 = profileHeaderViewModel;
                gapComposer2.startReplaceGroup(321294134);
                gapComposer2.end(false);
                composableLambdaImpl = null;
            }
            String str2 = profileHeaderViewModel2.subtitle;
            if (str2 == null) {
                gapComposer2.startReplaceGroup(321668148);
                gapComposer2.end(false);
                composableLambdaImpl2 = null;
            } else {
                gapComposer2.startReplaceGroup(321668149);
                ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-1969650865, new InfoSectionKt$$ExternalSyntheticLambda7(str2, 2), gapComposer2);
                gapComposer2.end(false);
                composableLambdaImpl2 = rememberComposableLambda2;
            }
            gapComposer = gapComposer2;
            EmptyChatKt.ProfileHeader(Expect_jvmKt.rememberComposableLambda(-657720185, new PdfPreviewViewKt$$ExternalSyntheticLambda2(profileHeaderViewModel2, 20), gapComposer2), (Modifier) null, composableLambdaImpl, composableLambdaImpl2, gapComposer, 6, 2);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            gapComposer.end(true);
        } else {
            modifier2 = modifier;
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ErrorView$$ExternalSyntheticLambda1(modifier2, profileHeaderViewModel, function0, i, 26);
        }
    }

    public static final void ProfileHeaderBottomSheet(ProfileHeaderMenuViewModel profileHeaderMenuViewModel, Function1 function1, Composer composer, int i) {
        profileHeaderMenuViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(484586543);
        int i2 = (gapComposer.changedInstance(profileHeaderMenuViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(Modifier.Companion.$$INSTANCE, colors.semantic.background.f1047app, ColorKt.RectangleShape);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
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
            String stringResource = Room.stringResource(gapComposer, R.string.profile_avatar_existing_photo);
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new ProfileKt$$ExternalSyntheticLambda0(7, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            SheetEntry(stringResource, (Function0) rememberedValue, false, gapComposer, 0, 4);
            ModalKt.HorizontalDivider(0, 1, gapComposer, null);
            String stringResource2 = Room.stringResource(gapComposer, R.string.profile_avatar_take_photo);
            boolean z2 = i3 == 32;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new ProfileKt$$ExternalSyntheticLambda0(8, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            SheetEntry(stringResource2, (Function0) rememberedValue2, false, gapComposer, 0, 4);
            if (profileHeaderMenuViewModel.showClear) {
                gapComposer.startReplaceGroup(671486715);
                ModalKt.HorizontalDivider(0, 1, gapComposer, null);
                String stringResource3 = Room.stringResource(gapComposer, R.string.profile_avatar_clear_photo);
                boolean z3 = i3 == 32;
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (z3 || rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new ProfileKt$$ExternalSyntheticLambda0(9, function1);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                SheetEntry(stringResource3, (Function0) rememberedValue3, true, gapComposer, MLKEMEngine.KyberPolyBytes, 0);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(671796157);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ProfileHeaderMenuSheet$$ExternalSyntheticLambda0(profileHeaderMenuViewModel, function1, i);
        }
    }

    public static final void SearchVisibility(ProfilePrivacyReadyViewModel$SearchPrivacySectionViewModel.Content content, Function1 function1, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1028140287);
        int i2 = (gapComposer.changedInstance(content) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-417936758, new ErrorView$$ExternalSyntheticLambda0(function1, content), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SecurityLockView$$ExternalSyntheticLambda1(modifier2, (Object) content, function1, i, 1);
        }
    }

    public static final void SearchVisibilityToggle(ProfilePrivacyReadyViewModel$SearchPrivacySectionViewModel.Content.PrivacySetting privacySetting, SearchPrivacySectionViewEvent.SearchSettingType searchSettingType, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1600350777);
        int i2 = i | (gapComposer.changedInstance(privacySetting) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            boolean z = false;
            boolean z2 = privacySetting.isEnabled;
            CellDefaultAccessory.Toggle toggle = new CellDefaultAccessory.Toggle(privacySetting.isChecked);
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-727437753, new PdfPreviewViewKt$$ExternalSyntheticLambda2(searchSettingType, 21), gapComposer);
            if ((i2 & 896) == 256) {
                z = true;
            }
            boolean changedInstance = gapComposer.changedInstance(privacySetting) | z;
            Object rememberedValue = gapComposer.rememberedValue();
            int i3 = 12;
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BasicShieetScope$$ExternalSyntheticLambda10(12, function1, searchSettingType, privacySetting);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(rememberComposableLambda, null, (Function0) rememberedValue, z2, false, Expect_jvmKt.rememberComposableLambda(-1606295423, new ErrorView$$ExternalSyntheticLambda0(i3, privacySetting, searchSettingType), gapComposer), null, 0L, toggle, null, gapComposer, 1572870, 1450);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SecurityLockView$$ExternalSyntheticLambda1(privacySetting, searchSettingType, function1, i, 2);
        }
    }

    public static final void SecurityLock(int i, Composer composer, Modifier modifier, ProfilePasscodeSectionViewModel profilePasscodeSectionViewModel, Function1 function1) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2015369648);
        int i2 = (gapComposer.changedInstance(profilePasscodeSectionViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1085259461, new ErrorView$$ExternalSyntheticLambda0(function1, profilePasscodeSectionViewModel), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SecurityLockViewKt$$ExternalSyntheticLambda1(profilePasscodeSectionViewModel, function1, modifier2, i, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SheetEntry(String str, Function0 function0, boolean z, Composer composer, int i, int i2) {
        boolean z2;
        boolean z3;
        RecomposeScopeImpl endRestartGroup;
        long j;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-294654089);
        int i3 = (gapComposer.changed(str) ? 4 : 2) | i | (gapComposer.changedInstance(function0) ? 32 : 16);
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            z2 = z;
            i3 |= gapComposer.changed(z2) ? 256 : 128;
            if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) == 146)) {
                gapComposer.skipToGroupEnd();
                z3 = z2;
            } else {
                z3 = i4 != 0 ? false : z2;
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(SizeKt.m279heightInVpY3zN4$default(SpacerKt.m298padding3ABfNKs(ImageKt.m183clickableoSLSa3U$default(Modifier.Companion.$$INSTANCE, false, null, new Role(0), function0, 11), 4.0f), 56.0f, RecyclerView.DECELERATION_RATE, 2), 1.0f);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
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
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                TextStyle textStyle = Strings.getTypography(gapComposer).button;
                if (z3) {
                    gapComposer.startReplaceGroup(1344120714);
                    j = Strings.getColors(gapComposer).component.button.destructive.standard.text.f156default;
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(1344216504);
                    j = Strings.getColors(gapComposer).component.button.subtle.text.f168default;
                    gapComposer.end(false);
                }
                Room.m1165Text25TpFw(0, 0, 0, 0, i3 & 14, 0, 4082, j, (Composer) gapComposer, (Modifier) null, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                gapComposer.end(true);
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new PasscodeKt$$ExternalSyntheticLambda2(str, function0, z3, i, i2, 5);
                return;
            }
            return;
        }
        z2 = z;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) == 146)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void SignOutDialog(ProfileConfirmSignOutViewModel profileConfirmSignOutViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(663059639);
        int i2 = i | (gapComposer.changedInstance(profileConfirmSignOutViewModel) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            int i4 = 26;
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1510371943, new PoolListSectionKt$$ExternalSyntheticLambda2(profileConfirmSignOutViewModel, i4), gapComposer);
            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-1834649325, new PdfPreviewViewKt$$ExternalSyntheticLambda4(25, function1), gapComposer);
            ComposableLambdaImpl rememberComposableLambda3 = Expect_jvmKt.rememberComposableLambda(-148749390, new PdfPreviewViewKt$$ExternalSyntheticLambda4(i4, function1), gapComposer);
            modifier2 = Modifier.Companion.$$INSTANCE;
            ModalKt.Modal(modifier2, f588lambda$175527992, rememberComposableLambda, rememberComposableLambda2, rememberComposableLambda3, (Function3) null, gapComposer, 28086, 32);
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScoreHomeKt$$ExternalSyntheticLambda9(profileConfirmSignOutViewModel, function1, modifier2, i, 12);
        }
    }

    public static final void SuccessView(Function1 function1, Modifier modifier, GenericProfileElementsViewModel$Success genericProfileElementsViewModel$Success, Composer composer, int i) {
        Modifier modifier2;
        Modifier wrapContentHeight;
        int i2;
        boolean z;
        boolean z2;
        Modifier.Companion companion;
        float f;
        Modifier modifier3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1421374018);
        int i3 = ((i & 6) == 0 ? (gapComposer.changedInstance(function1) ? 4 : 2) | i : i) | 48;
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changedInstance(genericProfileElementsViewModel$Success) ? 256 : 128;
        }
        int i4 = i3;
        boolean z3 = true;
        boolean z4 = false;
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 147) != 146)) {
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            float f2 = 1.0f;
            wrapContentHeight = SizeKt.wrapContentHeight(SizeKt.fillMaxWidth(companion2, 1.0f), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, wrapContentHeight);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            Modifier modifier4 = null;
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
            gapComposer.startReplaceGroup(-1136411659);
            for (GenericProfileElementViewModel genericProfileElementViewModel : genericProfileElementsViewModel$Success.elements) {
                if (genericProfileElementViewModel instanceof GenericProfileElementViewModel.GroupedButtonsWidget) {
                    gapComposer.startReplaceGroup(508562558);
                    GroupedButtonsWidget(((i4 << 3) & 112) | 6, gapComposer, SizeKt.fillMaxWidth(companion2, f2), ((GenericProfileElementViewModel.GroupedButtonsWidget) genericProfileElementViewModel).models, function1);
                    gapComposer.end(z4);
                } else if (genericProfileElementViewModel instanceof GenericProfileElementViewModel.ButtonWidget) {
                    gapComposer.startReplaceGroup(293505380);
                    ButtonWidgetView((GenericProfileElementViewModel.ButtonWidget) genericProfileElementViewModel, function1, null, false, gapComposer, (i4 << 3) & 112);
                    gapComposer.end(z4);
                } else {
                    if (genericProfileElementViewModel instanceof GenericProfileElementViewModel.TrustIndicatorsWidget) {
                        gapComposer.startReplaceGroup(293509405);
                        boolean z5 = z4;
                        i2 = i4;
                        z = z3;
                        companion = companion2;
                        f = f2;
                        modifier3 = modifier4;
                        ListUnorderedKt.ListUnordered((Modifier) null, (ListUnorderedState) null, ListUnorderedProminence.Subtle, (ListUnorderedSize) null, RecyclerView.DECELERATION_RATE, Expect_jvmKt.rememberComposableLambda(-1544706387, new PoolListSectionKt$$ExternalSyntheticLambda2((GenericProfileElementViewModel.TrustIndicatorsWidget) genericProfileElementViewModel, 27), gapComposer), gapComposer, 196992, 27);
                        gapComposer.end(z5);
                        z2 = z5;
                    } else {
                        i2 = i4;
                        z = z3;
                        z2 = z4;
                        companion = companion2;
                        f = f2;
                        modifier3 = modifier4;
                        if (genericProfileElementViewModel instanceof GenericProfileElementViewModel.IconTextWidget) {
                            gapComposer.startReplaceGroup(293541487);
                            IconWidgetView(modifier3, (GenericProfileElementViewModel.IconTextWidget) genericProfileElementViewModel, gapComposer, z2 ? 1 : 0);
                            gapComposer.end(z2);
                        } else if (genericProfileElementViewModel instanceof GenericProfileElementViewModel.TextWidget) {
                            gapComposer.startReplaceGroup(293543215);
                            TextWidgetView(modifier3, (GenericProfileElementViewModel.TextWidget) genericProfileElementViewModel, gapComposer, z2 ? 1 : 0);
                            gapComposer.end(z2);
                        } else if (genericProfileElementViewModel instanceof GenericProfileElementViewModel.BlankDivider) {
                            gapComposer.startReplaceGroup(293545009);
                            BlankDividerView(modifier3, (GenericProfileElementViewModel.BlankDivider) genericProfileElementViewModel, gapComposer, z2 ? 1 : 0);
                            gapComposer.end(z2);
                        } else if (genericProfileElementViewModel instanceof GenericProfileElementViewModel.PaymentHistoryWidget) {
                            gapComposer.startReplaceGroup(293549274);
                            GenericProfilePaymentHistoryWidgetView((GenericProfileElementViewModel.PaymentHistoryWidget) genericProfileElementViewModel, function1, gapComposer, (i2 << 3) & 112);
                            gapComposer.end(z2);
                        } else if (genericProfileElementViewModel instanceof GenericProfileElementViewModel.FavoritesListWidget) {
                            gapComposer.startReplaceGroup(510199885);
                            FavoritesListWidgetView((i2 << 6) & 896, gapComposer, modifier3, ((GenericProfileElementViewModel.FavoritesListWidget) genericProfileElementViewModel).viewModel.favorites, function1);
                            gapComposer.end(z2);
                        } else {
                            if (!(genericProfileElementViewModel instanceof GenericProfileElementViewModel.AddOrRemoveAsFavoriteButtonWidget)) {
                                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 293499838, z2);
                            }
                            gapComposer.startReplaceGroup(510346639);
                            gapComposer.end(z2);
                        }
                    }
                    modifier4 = modifier3;
                    z3 = z;
                    companion2 = companion;
                    z4 = z2;
                    f2 = f;
                    i4 = i2;
                }
                i2 = i4;
                z = z3;
                z2 = z4;
                companion = companion2;
                f = f2;
                modifier3 = modifier4;
                modifier4 = modifier3;
                z3 = z;
                companion2 = companion;
                z4 = z2;
                f2 = f;
                i4 = i2;
            }
            gapComposer.end(z4);
            gapComposer.end(z3);
            modifier2 = companion2;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScoreHomeKt$$ExternalSyntheticLambda9(function1, modifier2, (Object) genericProfileElementsViewModel$Success, i, 14);
        }
    }

    public static final void TaxesPassword(ProfilePasswordDialogViewModel$MessageDialog profilePasswordDialogViewModel$MessageDialog, Function1 function1, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(36840341);
        int i2 = (gapComposer.changedInstance(profilePasswordDialogViewModel$MessageDialog) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1056689194, new ErrorView$$ExternalSyntheticLambda0(profilePasswordDialogViewModel$MessageDialog, function1), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SecurityLockView$$ExternalSyntheticLambda1(modifier2, (Object) profilePasswordDialogViewModel$MessageDialog, function1, i, 4);
        }
    }

    public static final void TextWidgetView(Modifier modifier, GenericProfileElementViewModel.TextWidget textWidget, Composer composer, int i) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1087301547);
        int i2 = i | 6 | (gapComposer.changedInstance(textWidget) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            String str = textWidget.title;
            TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m301paddingqDBjuR0 = SpacerKt.m301paddingqDBjuR0(companion, 24.0f, 8.0f, 32.0f, 16.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, colors.semantic.text.standard, (Composer) gapComposer, m301paddingqDBjuR0, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ErrorView$$ExternalSyntheticLambda0(modifier2, textWidget, i, 6);
        }
    }

    public static final void UnsupportedSettingContent(Function1 function1, UnsupportedSettingViewModel unsupportedSettingViewModel, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer;
        Modifier modifier2;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1882561222);
        int i2 = i | (gapComposer2.changedInstance(function1) ? 4 : 2) | (gapComposer2.changedInstance(unsupportedSettingViewModel) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            Modifier systemBarsPadding = SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape));
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, systemBarsPadding);
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
            NavigationType navigationType = NavigationType.BACK;
            boolean z = (i2 & 14) == 4;
            Object rememberedValue = gapComposer2.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ProfileKt$$ExternalSyntheticLambda0(23, function1);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            DBUtil.TitleBarSub(f585lambda$1541872554, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer2, 54, 108);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer2, null);
            Countries.PageHeader(unsupportedSettingViewModel.title, (Modifier) null, Expect_jvmKt.rememberComposableLambda(1830410597, new PdfPreviewViewKt$$ExternalSyntheticLambda2(unsupportedSettingViewModel, 22), gapComposer2), unsupportedSettingViewModel.message, gapComposer2, MLKEMEngine.KyberPolyBytes, 2);
            gapComposer = gapComposer2;
            SpacerKt.Spacer(gapComposer, new LayoutWeightElement(1.0f, true));
            DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(-1752369074, new TaxesPasswordViewKt$$ExternalSyntheticLambda4(2, function1), gapComposer), gapComposer, 24576, 15);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SecurityLockView$$ExternalSyntheticLambda1(function1, (Object) unsupportedSettingViewModel, (Object) modifier2, i, 8);
        }
    }

    public static final void TaxesPassword(TaxesPasswordViewModel taxesPasswordViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(683627024);
        int i2 = (gapComposer.changedInstance(taxesPasswordViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1425129701, new ErrorView$$ExternalSyntheticLambda0(function1, taxesPasswordViewModel), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SecurityLockView$$ExternalSyntheticLambda1(modifier2, (Object) taxesPasswordViewModel, function1, i, 6);
        }
    }
}
