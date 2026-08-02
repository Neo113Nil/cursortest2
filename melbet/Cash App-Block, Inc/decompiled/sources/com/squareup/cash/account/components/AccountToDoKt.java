package com.squareup.cash.account.components;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.icu.text.MessageFormat;
import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.collection.ArrayMap;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.material.IconButtonKt$$ExternalSyntheticLambda0;
import androidx.compose.material.ModalBottomSheetKt$$ExternalSyntheticLambda6;
import androidx.compose.material.SliderKt$$ExternalSyntheticLambda8;
import androidx.compose.material.SwipeToDismissKt$$ExternalSyntheticLambda4;
import androidx.compose.material.TextKt$$ExternalSyntheticLambda1;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda17;
import androidx.compose.material3.SliderDefaults$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
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
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.tooling.PreviewActivity$$ExternalSyntheticLambda1;
import androidx.compose.ui.unit.Density;
import androidx.constraintlayout.motion.widget.Debug;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.local.views.LocalViewFactory$$ExternalSyntheticLambda6;
import app.cash.local.views.brand.checkout.CheckoutTipSectionKt$$ExternalSyntheticLambda13;
import app.cash.local.views.internal.DismissableToastKt$$ExternalSyntheticLambda4;
import app.cash.local.views.internal.LocalMapKt$$ExternalSyntheticLambda10;
import app.cash.local.views.map.BrandSheetViewKt$$ExternalSyntheticLambda1;
import app.cash.local.views.sheet.MenuPickerSheetKt$$ExternalSyntheticLambda4;
import app.cash.local.views.wallet.LocalHomeViewKt$$ExternalSyntheticLambda0;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda6;
import app.cash.molecule.PlatformKt;
import app.cash.passcode.views.ComposableSingletons$PasscodeViewFactoryKt$$ExternalSyntheticLambda1;
import app.cash.redwood.CombinedModifier$$ExternalSyntheticLambda0;
import app.cash.redwood.yoga.internal.Yoga$$ExternalSyntheticLambda7;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import bo.app.y0$$ExternalSyntheticLambda0;
import coil3.compose.UtilsKt$$ExternalSyntheticLambda1;
import coil3.size.DimensionKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda2;
import com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda5;
import com.google.mlkit.common.internal.zzd;
import com.mikepenz.markdown.compose.MarkdownKt$$ExternalSyntheticLambda2;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.account.settings.viewmodels.AccountAvatarViewModel;
import com.squareup.cash.account.settings.viewmodels.AccountCardViewModel;
import com.squareup.cash.account.settings.viewmodels.AccountCardViewModel$AccountCardBusinessModel$ProfileRowViewModel;
import com.squareup.cash.account.settings.viewmodels.AccountFooterViewModel;
import com.squareup.cash.account.settings.viewmodels.AccountInviteButton;
import com.squareup.cash.account.settings.viewmodels.AccountViewModel;
import com.squareup.cash.account.settings.viewmodels.EditProfileViewModel$DialogModel;
import com.squareup.cash.account.settings.viewmodels.EditProfileViewModel$EditCustomerProfileViewModel;
import com.squareup.cash.account.settings.viewmodels.PreviewTrustIndicatorViewModel;
import com.squareup.cash.account.settings.viewmodels.ProfileUpsellViewModel;
import com.squareup.cash.account.settings.viewmodels.documents.AccountDocumentsDownloadOptionsViewModel;
import com.squareup.cash.account.settings.viewmodels.documents.AccountDocumentsDownloaderViewModel;
import com.squareup.cash.account.settings.viewmodels.documents.AccountDocumentsViewModel;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticLambda5;
import com.squareup.cash.activity.views.ErrorActivityItemKt$$ExternalSyntheticLambda0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.ColorsLightKt;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.MotionKt$$ExternalSyntheticLambda0;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.Badge;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.ToastKt$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarOverlay;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.avatar.AvatarSizeOverride;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.cell.RealCellActivityAvatarScope;
import com.squareup.cash.arcade.components.list.ListUnorderedKt;
import com.squareup.cash.arcade.components.list.ListUnorderedProminence;
import com.squareup.cash.arcade.components.list.ListUnorderedSize;
import com.squareup.cash.arcade.components.list.ListUnorderedState;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.theme.RippleKt;
import com.squareup.cash.arcade.theme.RippleNodeFactory;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda5;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.composeUi.foundation.text.MarkdownSpanValues;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.moneybot.views.chat.EmptyChatKt;
import com.squareup.cash.moneybot.widgets.ComposerKt$$ExternalSyntheticLambda14;
import com.squareup.cash.profile.viewmodels.GenericProfileElementViewModel;
import com.squareup.cash.profile.viewmodels.GenericProfileElementsViewModel$Success;
import com.squareup.cash.profile.viewmodels.ProfileHeaderViewModel;
import com.squareup.cash.profile.viewmodels.ProfileViewModel;
import com.squareup.cash.profile.viewmodels.ProfileViewModel$Loaded$ProfileBody$Loaded;
import com.squareup.cash.profile.viewmodels.TrustElementWidget;
import com.squareup.cash.profile.views.BadgeNameKt;
import com.squareup.cash.profile.views.ProfileKt$$ExternalSyntheticLambda5;
import com.squareup.cash.profile.views.ProfileUiViewKt;
import com.squareup.cash.score.views.InfoSectionKt$$ExternalSyntheticLambda6;
import com.squareup.cash.wallet.views.Hero3DCardViewKt$InteractiveCard$11$1;
import com.squareup.protos.franklin.investing.resources.StatementType;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import com.stripe.android.uicore.elements.FormLabelKt$$ExternalSyntheticLambda0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.text.StringsKt;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public abstract class AccountToDoKt {
    public static final ComposableLambdaImpl lambda$1757263940 = new ComposableLambdaImpl(new AccountAvatarKt$$ExternalSyntheticLambda1(14), false, 1757263940);
    public static final ComposableLambdaImpl lambda$533089984 = new ComposableLambdaImpl(new AccountAvatarKt$$ExternalSyntheticLambda1(15), false, 533089984);

    /* renamed from: lambda$-2077673889, reason: not valid java name */
    public static final ComposableLambdaImpl f108lambda$2077673889 = new ComposableLambdaImpl(new AccountAvatarKt$$ExternalSyntheticLambda1(16), false, -2077673889);
    public static final ComposableLambdaImpl lambda$667925245 = new ComposableLambdaImpl(new AccountAvatarKt$$ExternalSyntheticLambda1(17), false, 667925245);

    /* renamed from: lambda$-2040587354, reason: not valid java name */
    public static final ComposableLambdaImpl f107lambda$2040587354 = new ComposableLambdaImpl(new AccountAvatarKt$$ExternalSyntheticLambda1(18), false, -2040587354);

    /* renamed from: lambda$-1973947464, reason: not valid java name */
    public static final ComposableLambdaImpl f105lambda$1973947464 = new ComposableLambdaImpl(new AccountAvatarKt$$ExternalSyntheticLambda1(19), false, -1973947464);
    public static final ComposableLambdaImpl lambda$1449070589 = new ComposableLambdaImpl(new MarkerKt$$ExternalSyntheticLambda5(25), false, 1449070589);
    public static final ComposableLambdaImpl lambda$2067942415 = new ComposableLambdaImpl(new ComposableSingletons$PasscodeViewFactoryKt$$ExternalSyntheticLambda1(5), false, 2067942415);

    /* renamed from: lambda$-464594160, reason: not valid java name */
    public static final ComposableLambdaImpl f110lambda$464594160 = new ComposableLambdaImpl(new MarkerKt$$ExternalSyntheticLambda5(26), false, -464594160);

    /* renamed from: lambda$-1155215751, reason: not valid java name */
    public static final ComposableLambdaImpl f100lambda$1155215751 = new ComposableLambdaImpl(new MarkerKt$$ExternalSyntheticLambda5(27), false, -1155215751);

    /* renamed from: lambda$-1205309351, reason: not valid java name */
    public static final ComposableLambdaImpl f101lambda$1205309351 = new ComposableLambdaImpl(new AccountAvatarKt$$ExternalSyntheticLambda1(20), false, -1205309351);

    /* renamed from: lambda$-371947618, reason: not valid java name */
    public static final ComposableLambdaImpl f109lambda$371947618 = new ComposableLambdaImpl(new AccountAvatarKt$$ExternalSyntheticLambda1(21), false, -371947618);

    /* renamed from: lambda$-1702758716, reason: not valid java name */
    public static final ComposableLambdaImpl f103lambda$1702758716 = new ComposableLambdaImpl(new ComposableSingletons$PasscodeViewFactoryKt$$ExternalSyntheticLambda1(6), false, -1702758716);

    /* renamed from: lambda$-1807757544, reason: not valid java name */
    public static final ComposableLambdaImpl f104lambda$1807757544 = new ComposableLambdaImpl(new AccountAvatarKt$$ExternalSyntheticLambda1(22), false, -1807757544);
    public static final ComposableLambdaImpl lambda$141152320 = new ComposableLambdaImpl(new MarkerKt$$ExternalSyntheticLambda5(28), false, 141152320);
    public static final ComposableLambdaImpl lambda$658460023 = new ComposableLambdaImpl(new MarkerKt$$ExternalSyntheticLambda5(29), false, 658460023);
    public static final ComposableLambdaImpl lambda$442302124 = new ComposableLambdaImpl(new ErrorActivityItemKt$$ExternalSyntheticLambda0(1), false, 442302124);
    public static final ComposableLambdaImpl lambda$791297763 = new ComposableLambdaImpl(new ErrorActivityItemKt$$ExternalSyntheticLambda0(2), false, 791297763);

    /* renamed from: lambda$-1294545052, reason: not valid java name */
    public static final ComposableLambdaImpl f102lambda$1294545052 = new ComposableLambdaImpl(new ErrorActivityItemKt$$ExternalSyntheticLambda0(3), false, -1294545052);

    /* renamed from: lambda$-1978615717, reason: not valid java name */
    public static final ComposableLambdaImpl f106lambda$1978615717 = new ComposableLambdaImpl(new ErrorActivityItemKt$$ExternalSyntheticLambda0(4), false, -1978615717);

    public static final void AccountAvatar(AccountAvatarViewModel accountAvatarViewModel, Function0 function0, Modifier modifier, AvatarSize avatarSize, Icons icons, boolean z, boolean z2, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        AvatarSize avatarSize2;
        Modifier modifier3;
        boolean z5;
        boolean z6;
        Icons icons2;
        String str;
        int i6;
        AvatarImage.Remote.Image image;
        Icons icons3;
        String str2;
        AvatarOverlay.LocalIcon localIcon;
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1076732642);
        int i7 = (gapComposer.changedInstance(accountAvatarViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function0) ? 32 : 16);
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 = i7 | MLKEMEngine.KyberPolyBytes;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = i7 | (gapComposer.changed(modifier2) ? 256 : 128);
        }
        int i9 = i2 & 8;
        if (i9 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= gapComposer.changed(avatarSize == null ? -1 : avatarSize.ordinal()) ? 2048 : 1024;
        }
        int i10 = i2 & 16;
        if (i10 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= gapComposer.changed(icons != null ? icons.ordinal() : -1) ? 16384 : PKIFailureInfo.certRevoked;
        }
        int i11 = i2 & 32;
        if (i11 != 0) {
            i4 = i3 | 196608;
            z3 = z;
        } else {
            z3 = z;
            i4 = i3 | (gapComposer.changed(z3) ? PKIFailureInfo.unsupportedVersion : 65536);
        }
        int i12 = i2 & 64;
        if (i12 != 0) {
            i5 = i4 | 1572864;
            z4 = z2;
        } else {
            z4 = z2;
            i5 = i4 | (gapComposer.changed(z4) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted);
        }
        if (gapComposer.shouldExecute(i5 & 1, (599187 & i5) != 599186)) {
            Modifier modifier4 = Modifier.Companion.$$INSTANCE;
            if (i8 != 0) {
                modifier2 = modifier4;
            }
            AvatarSize avatarSize3 = i9 != 0 ? AvatarSize.Size64 : avatarSize;
            Icons icons4 = i10 != 0 ? Icons.CameraFill16 : icons;
            boolean z7 = i11 != 0 ? true : z3;
            boolean z8 = i12 != 0 ? true : z4;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
            }
            MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue;
            if (z7) {
                gapComposer.startReplaceGroup(2126764593);
                RippleNodeFactory m3400rippleYJYuY3k = RippleKt.m3400rippleYJYuY3k(0L, false, 48.0f, null, gapComposer, 432, 9);
                boolean z9 = (i5 & 112) == 32;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (z9 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new y0$$ExternalSyntheticLambda0(11, function0);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                modifier4 = ImageKt.m182clickableO2vRcR0$default(modifier4, mutableInteractionSourceImpl, m3400rippleYJYuY3k, false, null, null, (Function0) rememberedValue2, 28);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(2126970402);
                gapComposer.end(false);
            }
            Modifier then = modifier2.then(modifier4);
            Character ch = accountAvatarViewModel.monogram;
            if (ch == null || (str = String.valueOf(ch.charValue())) == null) {
                str = "";
            }
            String str3 = str;
            Color forTheme = ThemablesKt.forTheme(accountAvatarViewModel.backgroundColor, gapComposer);
            forTheme.getClass();
            long j = forTheme.value;
            String str4 = accountAvatarViewModel.photoUrl;
            if (str4 != null) {
                i6 = i5;
                image = new AvatarImage.Remote.Image(str4, false, null, 0L, new AccountAvatarKt$$ExternalSyntheticLambda1(0), 62);
            } else {
                i6 = i5;
                image = null;
            }
            if (z8) {
                gapComposer.startReplaceGroup(2127334373);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                str2 = str3;
                icons3 = icons4;
                AvatarOverlay.LocalIcon localIcon2 = new AvatarOverlay.LocalIcon(4, colors.semantic.background.subtle, 0L, icons3);
                gapComposer.end(false);
                localIcon = localIcon2;
            } else {
                icons3 = icons4;
                str2 = str3;
                gapComposer.startReplaceGroup(2127520714);
                gapComposer.end(false);
                localIcon = null;
            }
            AvatarSize avatarSize4 = avatarSize3;
            TextViewKt.m3613AvatarB_rZmmc(avatarSize4, str2, j, accountAvatarViewModel.accessibilityText, then, (AvatarImage) image, (Function2) null, (AvatarOverlay) localIcon, false, 0L, (Composer) gapComposer, (i6 >> 9) & 14, 0, 1856);
            gapComposer = gapComposer;
            modifier3 = modifier2;
            z5 = z7;
            avatarSize2 = avatarSize4;
            icons2 = icons3;
            z6 = z8;
        } else {
            gapComposer.skipToGroupEnd();
            avatarSize2 = avatarSize;
            modifier3 = modifier2;
            z5 = z3;
            z6 = z4;
            icons2 = icons;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AccountAvatarKt$$ExternalSyntheticLambda2(accountAvatarViewModel, function0, modifier3, avatarSize2, icons2, z5, z6, i, i2);
        }
    }

    public static final void AccountDocumentDownloaderDialog(AccountDocumentsDownloaderViewModel accountDocumentsDownloaderViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1285528350);
        int i2 = (gapComposer.changedInstance(accountDocumentsDownloaderViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1088522189, new MenuPickerSheetKt$$ExternalSyntheticLambda4(accountDocumentsDownloaderViewModel, function1), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Yoga$$ExternalSyntheticLambda7((Object) accountDocumentsDownloaderViewModel, function1, (Object) modifier2, i, 14);
        }
    }

    public static final void AccountDocumentsDownloadOptions(AccountDocumentsDownloadOptionsViewModel accountDocumentsDownloadOptionsViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1400120743);
        int i2 = (gapComposer.changedInstance(accountDocumentsDownloadOptionsViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(42806706, new MenuPickerSheetKt$$ExternalSyntheticLambda4(accountDocumentsDownloadOptionsViewModel, function1), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Yoga$$ExternalSyntheticLambda7((Object) accountDocumentsDownloadOptionsViewModel, function1, (Object) modifier2, i, 16);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x01d6, code lost:
    
        if (r10 == r1) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0350  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AccountFooter(Modifier modifier, AccountFooterViewModel accountFooterViewModel, Function1 function1, Composer composer, int i) {
        Function1 function12;
        Modifier modifier2;
        MutableInteractionSourceImpl mutableInteractionSourceImpl;
        String str;
        float f;
        int i2;
        Object obj;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12;
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1;
        Modifier.Companion companion;
        Object obj2;
        Object obj3;
        MarkdownSpanValues markdownSpanValues;
        Modifier.Companion companion2;
        GapComposer gapComposer;
        boolean z;
        Object rememberedValue;
        boolean z2;
        Object rememberedValue2;
        boolean z3;
        Object rememberedValue3;
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(2139534669);
        Applier applier = gapComposer2.applier;
        int i3 = i | 6;
        if ((i & 48) == 0) {
            i3 |= gapComposer2.changedInstance(accountFooterViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer2.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Object rememberedValue4 = gapComposer2.rememberedValue();
            Object obj4 = Composer.Companion.Empty;
            if (rememberedValue4 == obj4) {
                rememberedValue4 = Recorder$$ExternalSyntheticOutline2.m(gapComposer2);
            }
            MutableInteractionSourceImpl mutableInteractionSourceImpl2 = (MutableInteractionSourceImpl) rememberedValue4;
            Object rememberedValue5 = gapComposer2.rememberedValue();
            if (rememberedValue5 == obj4) {
                rememberedValue5 = Recorder$$ExternalSyntheticOutline2.m(gapComposer2);
            }
            MutableInteractionSourceImpl mutableInteractionSourceImpl3 = (MutableInteractionSourceImpl) rememberedValue5;
            Modifier.Companion companion3 = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion3, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer2, 48);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$12);
            } else {
                gapComposer2.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$13);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$14);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$15);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$16);
            DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(-1504251195, new BrandSheetViewKt$$ExternalSyntheticLambda1(10, (Object) accountFooterViewModel, (Object) function1), gapComposer2), gapComposer2, 24576, 15);
            String str2 = accountFooterViewModel.disclosureText;
            if (str2 == null) {
                gapComposer2.startReplaceGroup(-1761630533);
                gapComposer2.end(false);
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$13;
                mutableInteractionSourceImpl = mutableInteractionSourceImpl2;
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$16;
                companion = companion3;
                obj = obj4;
            } else {
                gapComposer2.startReplaceGroup(-1761630532);
                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer2, null);
                if (accountFooterViewModel.showDisclosureIcon) {
                    gapComposer2.startReplaceGroup(1015135540);
                    Icons icons = Icons.Fdic32;
                    Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    str = str2;
                    mutableInteractionSourceImpl = mutableInteractionSourceImpl2;
                    f = 0.0f;
                    i2 = 2;
                    Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, colors.semantic.icon.extraSubtle, gapComposer2, 54, 4);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer2, null);
                    gapComposer2.end(false);
                } else {
                    mutableInteractionSourceImpl = mutableInteractionSourceImpl2;
                    str = str2;
                    f = RecyclerView.DECELERATION_RATE;
                    i2 = 2;
                    gapComposer2.startReplaceGroup(1015328701);
                    gapComposer2.end(false);
                }
                Strings.getSizes(gapComposer2).getClass();
                DefaultSizes.spacing.getClass();
                Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion3, 16.0f, f, i2);
                TextStyle textStyle = Strings.getTypography(gapComposer2).bodyXSmall;
                long j = Strings.getColors(gapComposer2).semantic.text.subtle;
                MarkdownSpanValues markdownSpanValues2 = new MarkdownSpanValues(SpanStyle.m973copyGSF8kmg$default(Strings.getTypography(gapComposer2).linkXSmall.spanStyle, Strings.getColors(gapComposer2).semantic.text.link, null, 0L, JpegConstants.COM_MARKER), i2);
                i3 = i3;
                boolean z4 = (i3 & 896) == 256;
                Object rememberedValue6 = gapComposer2.rememberedValue();
                if (z4) {
                    obj = obj4;
                } else {
                    obj = obj4;
                }
                rememberedValue6 = new SwipeToDismissKt$$ExternalSyntheticLambda4(10, function1);
                gapComposer2.updateRememberedValue(rememberedValue6);
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$13;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$16;
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                companion = companion3;
                LazyDslKt.m304MarkdownTextpCuZGqc(str, (Function2) rememberedValue6, m300paddingVpY3zN4$default, textStyle, j, markdownSpanValues2, null, new TextLineBalancing(1), 0, 0, 3, gapComposer2, 0, 832);
                gapComposer2 = gapComposer2;
                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer2, null);
                gapComposer2.end(false);
            }
            String stringResource = Room.stringResource(gapComposer2, R.string.account_privacy);
            String stringResource2 = Room.stringResource(gapComposer2, R.string.account_terms);
            String stringResource3 = Room.stringResource(gapComposer2, R.string.account_open_source);
            String m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("[", stringResource, "](ignored)");
            String m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("[", stringResource2, "](ignored)");
            String m3 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("[", stringResource3, "](ignored)");
            ArrayMap arrayMap = new ArrayMap(3);
            arrayMap.put("privacy", m);
            arrayMap.put("oss", m3);
            arrayMap.put("terms", m2);
            String format2 = new MessageFormat(Room.stringResource(gapComposer2, R.string.account_footer_text)).format(arrayMap);
            format2.getClass();
            SpacerKt.Spacer(gapComposer2, SizeKt.m285size3ABfNKs(companion, 16.0f));
            Strings.getSizes(gapComposer2).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default2 = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            TextStyle textStyle2 = Strings.getTypography(gapComposer2).bodyXSmall;
            long j2 = Strings.getColors(gapComposer2).semantic.text.subtle;
            Object obj5 = obj;
            MarkdownSpanValues markdownSpanValues3 = new MarkdownSpanValues(SpanStyle.m973copyGSF8kmg$default(Strings.getTypography(gapComposer2).linkXSmall.spanStyle, Strings.getColors(gapComposer2).semantic.text.link, null, 0L, JpegConstants.COM_MARKER), 2);
            int i4 = i3 & 896;
            boolean changed = gapComposer2.changed(stringResource) | (i4 == 256) | gapComposer2.changed(stringResource2) | gapComposer2.changed(stringResource3);
            Object rememberedValue7 = gapComposer2.rememberedValue();
            if (changed) {
                obj2 = obj5;
            } else {
                obj2 = obj5;
                if (rememberedValue7 != obj2) {
                    companion2 = companion;
                    obj3 = rememberedValue7;
                    markdownSpanValues = markdownSpanValues3;
                    gapComposer = gapComposer2;
                    MarkdownSpanValues markdownSpanValues4 = markdownSpanValues;
                    function12 = function1;
                    LazyDslKt.m304MarkdownTextpCuZGqc(format2, (Function2) obj3, m300paddingVpY3zN4$default2, textStyle2, j2, markdownSpanValues4, null, new TextLineBalancing(1), 0, 0, 3, gapComposer, 0, 832);
                    SpacerKt.Spacer(gapComposer, SizeKt.m285size3ABfNKs(companion2, 24.0f));
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer, 0);
                    int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, companion2);
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.useNode();
                    } else {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    }
                    Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$14);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$15, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$12);
                    Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion2, 24.0f);
                    RippleNodeFactory m3400rippleYJYuY3k = RippleKt.m3400rippleYJYuY3k(0L, false, RecyclerView.DECELERATION_RATE, null, gapComposer, 48, 13);
                    z = i4 != 256;
                    rememberedValue = gapComposer.rememberedValue();
                    if (!z || rememberedValue == obj2) {
                        rememberedValue = new TabContentViewKt$$ExternalSyntheticLambda6(7, function12);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Modifier m182clickableO2vRcR0$default = ImageKt.m182clickableO2vRcR0$default(m285size3ABfNKs, mutableInteractionSourceImpl3, m3400rippleYJYuY3k, false, null, null, (Function0) rememberedValue, 28);
                    Painter painterResource = Countries.painterResource(R.drawable.social_instagram, 0, gapComposer);
                    String stringResource4 = Room.stringResource(gapComposer, R.string.social_instagram);
                    DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = ArcadeThemeKt.LocalIconColor;
                    long j3 = ((Color) gapComposer.consume(dynamicProvidableCompositionLocal)).value;
                    BlendModeColorFilter blendModeColorFilter = new BlendModeColorFilter(j3, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j3), ColorKt.m693toAndroidBlendModes9anfk8(5)));
                    int i5 = Painter.$stable;
                    ImageKt.Image(painterResource, stringResource4, m182clickableO2vRcR0$default, null, null, RecyclerView.DECELERATION_RATE, blendModeColorFilter, gapComposer, i5, 56);
                    SpacerKt.Spacer(gapComposer, SizeKt.m285size3ABfNKs(companion2, 24.0f));
                    Modifier m285size3ABfNKs2 = SizeKt.m285size3ABfNKs(companion2, 24.0f);
                    RippleNodeFactory m3400rippleYJYuY3k2 = RippleKt.m3400rippleYJYuY3k(0L, false, RecyclerView.DECELERATION_RATE, null, gapComposer, 48, 13);
                    z2 = i4 != 256;
                    rememberedValue2 = gapComposer.rememberedValue();
                    if (!z2 || rememberedValue2 == obj2) {
                        rememberedValue2 = new TabContentViewKt$$ExternalSyntheticLambda6(8, function12);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    Modifier m182clickableO2vRcR0$default2 = ImageKt.m182clickableO2vRcR0$default(m285size3ABfNKs2, mutableInteractionSourceImpl, m3400rippleYJYuY3k2, false, null, null, (Function0) rememberedValue2, 28);
                    Painter painterResource2 = Countries.painterResource(R.drawable.social_x, 0, gapComposer);
                    String stringResource5 = Room.stringResource(gapComposer, R.string.social_x);
                    long j4 = ((Color) gapComposer.consume(dynamicProvidableCompositionLocal)).value;
                    ImageKt.Image(painterResource2, stringResource5, m182clickableO2vRcR0$default2, null, null, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j4, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j4), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer, i5, 56);
                    gapComposer.end(true);
                    SpacerKt.Spacer(gapComposer, SizeKt.m285size3ABfNKs(companion2, 24.0f));
                    z3 = i4 != 256;
                    rememberedValue3 = gapComposer.rememberedValue();
                    if (!z3 || rememberedValue3 == obj2) {
                        rememberedValue3 = new TabContentViewKt$$ExternalSyntheticLambda6(9, function12);
                        gapComposer.updateRememberedValue(rememberedValue3);
                    }
                    Modifier.Companion companion4 = companion2;
                    modifier2 = companion4;
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, ImageKt.m183clickableoSLSa3U$default(companion4, false, null, null, (Function0) rememberedValue3, 15), Strings.getTypography(gapComposer).bodyXSmall, (TextLineBalancing) null, accountFooterViewModel.appVersion, (Map) null, (Function1) null, false);
                    gapComposer2 = gapComposer;
                    gapComposer2.end(true);
                }
            }
            markdownSpanValues = markdownSpanValues3;
            companion2 = companion;
            obj3 = new DismissableToastKt$$ExternalSyntheticLambda4(stringResource, function1, stringResource2, stringResource3, 6);
            gapComposer2.updateRememberedValue(obj3);
            gapComposer = gapComposer2;
            MarkdownSpanValues markdownSpanValues42 = markdownSpanValues;
            function12 = function1;
            LazyDslKt.m304MarkdownTextpCuZGqc(format2, (Function2) obj3, m300paddingVpY3zN4$default2, textStyle2, j2, markdownSpanValues42, null, new TextLineBalancing(1), 0, 0, 3, gapComposer, 0, 832);
            SpacerKt.Spacer(gapComposer, SizeKt.m285size3ABfNKs(companion2, 24.0f));
            RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer, 0);
            int hashCode22 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope22 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier22 = PlatformKt.materializeModifier(gapComposer, companion2);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope22, composeUiNode$Companion$SetModifier$14);
            Recorder$$ExternalSyntheticOutline2.m(hashCode22, gapComposer, composeUiNode$Companion$SetModifier$15, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier22, composeUiNode$Companion$SetModifier$12);
            Modifier m285size3ABfNKs3 = SizeKt.m285size3ABfNKs(companion2, 24.0f);
            RippleNodeFactory m3400rippleYJYuY3k3 = RippleKt.m3400rippleYJYuY3k(0L, false, RecyclerView.DECELERATION_RATE, null, gapComposer, 48, 13);
            if (i4 != 256) {
            }
            rememberedValue = gapComposer.rememberedValue();
            if (!z) {
            }
            rememberedValue = new TabContentViewKt$$ExternalSyntheticLambda6(7, function12);
            gapComposer.updateRememberedValue(rememberedValue);
            Modifier m182clickableO2vRcR0$default3 = ImageKt.m182clickableO2vRcR0$default(m285size3ABfNKs3, mutableInteractionSourceImpl3, m3400rippleYJYuY3k3, false, null, null, (Function0) rememberedValue, 28);
            Painter painterResource3 = Countries.painterResource(R.drawable.social_instagram, 0, gapComposer);
            String stringResource42 = Room.stringResource(gapComposer, R.string.social_instagram);
            DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal2 = ArcadeThemeKt.LocalIconColor;
            long j32 = ((Color) gapComposer.consume(dynamicProvidableCompositionLocal2)).value;
            BlendModeColorFilter blendModeColorFilter2 = new BlendModeColorFilter(j32, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j32), ColorKt.m693toAndroidBlendModes9anfk8(5)));
            int i52 = Painter.$stable;
            ImageKt.Image(painterResource3, stringResource42, m182clickableO2vRcR0$default3, null, null, RecyclerView.DECELERATION_RATE, blendModeColorFilter2, gapComposer, i52, 56);
            SpacerKt.Spacer(gapComposer, SizeKt.m285size3ABfNKs(companion2, 24.0f));
            Modifier m285size3ABfNKs22 = SizeKt.m285size3ABfNKs(companion2, 24.0f);
            RippleNodeFactory m3400rippleYJYuY3k22 = RippleKt.m3400rippleYJYuY3k(0L, false, RecyclerView.DECELERATION_RATE, null, gapComposer, 48, 13);
            if (i4 != 256) {
            }
            rememberedValue2 = gapComposer.rememberedValue();
            if (!z2) {
            }
            rememberedValue2 = new TabContentViewKt$$ExternalSyntheticLambda6(8, function12);
            gapComposer.updateRememberedValue(rememberedValue2);
            Modifier m182clickableO2vRcR0$default22 = ImageKt.m182clickableO2vRcR0$default(m285size3ABfNKs22, mutableInteractionSourceImpl, m3400rippleYJYuY3k22, false, null, null, (Function0) rememberedValue2, 28);
            Painter painterResource22 = Countries.painterResource(R.drawable.social_x, 0, gapComposer);
            String stringResource52 = Room.stringResource(gapComposer, R.string.social_x);
            long j42 = ((Color) gapComposer.consume(dynamicProvidableCompositionLocal2)).value;
            ImageKt.Image(painterResource22, stringResource52, m182clickableO2vRcR0$default22, null, null, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j42, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j42), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer, i52, 56);
            gapComposer.end(true);
            SpacerKt.Spacer(gapComposer, SizeKt.m285size3ABfNKs(companion2, 24.0f));
            if (i4 != 256) {
            }
            rememberedValue3 = gapComposer.rememberedValue();
            if (!z3) {
            }
            rememberedValue3 = new TabContentViewKt$$ExternalSyntheticLambda6(9, function12);
            gapComposer.updateRememberedValue(rememberedValue3);
            Modifier.Companion companion42 = companion2;
            modifier2 = companion42;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, ImageKt.m183clickableoSLSa3U$default(companion42, false, null, null, (Function0) rememberedValue3, 15), Strings.getTypography(gapComposer).bodyXSmall, (TextLineBalancing) null, accountFooterViewModel.appVersion, (Map) null, (Function1) null, false);
            gapComposer2 = gapComposer;
            gapComposer2.end(true);
        } else {
            function12 = function1;
            gapComposer2.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MarkdownKt$$ExternalSyntheticLambda2(i, 19, modifier2, accountFooterViewModel, function12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AccountHeader(AccountCardViewModel accountCardViewModel, Modifier modifier, boolean z, boolean z2, Function1 function1, Composer composer, int i, int i2) {
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        Modifier modifier2;
        boolean z5;
        RecomposeScopeImpl endRestartGroup;
        Modifier modifier3;
        ComposableLambdaImpl composableLambdaImpl;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1841036816);
        int i5 = 4;
        if ((i & 6) == 0) {
            i3 = (gapComposer.changedInstance(accountCardViewModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i3 | 48;
        int i7 = i2 & 4;
        if (i7 != 0) {
            i6 = i3 | 432;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            z3 = z;
            i6 |= gapComposer.changed(z3) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i6 |= 3072;
            } else if ((i & 3072) == 0) {
                z4 = z2;
                i6 |= gapComposer.changed(z4) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    i6 |= gapComposer.changedInstance(function1) ? 16384 : PKIFailureInfo.certRevoked;
                }
                if (gapComposer.shouldExecute(i6 & 1, (i6 & 9363) != 9362)) {
                    if (i7 != 0) {
                        z3 = true;
                    }
                    z5 = i4 != 0 ? false : z4;
                    Resources resources = (Resources) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalResources);
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    if (z3) {
                        gapComposer.startReplaceGroup(-404286583);
                        boolean changedInstance = ((i6 & 57344) == 16384) | gapComposer.changedInstance(resources);
                        Object rememberedValue = gapComposer.rememberedValue();
                        if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                            rememberedValue = new CombinedModifier$$ExternalSyntheticLambda0(16, resources, function1);
                            gapComposer.updateRememberedValue(rememberedValue);
                        }
                        Modifier semantics = SemanticsModifierKt.semantics(companion, true, (Function1) rememberedValue);
                        gapComposer.end(false);
                        modifier3 = semantics;
                    } else {
                        gapComposer.startReplaceGroup(-404055912);
                        gapComposer.end(false);
                        modifier3 = companion;
                    }
                    if (z3) {
                        gapComposer.startReplaceGroup(-403991122);
                        composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(1676331825, new MenuPickerSheetKt$$ExternalSyntheticLambda4(13, accountCardViewModel, function1), gapComposer);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-403888388);
                        gapComposer.end(false);
                        composableLambdaImpl = null;
                    }
                    EmptyChatKt.ProfileHeader(Expect_jvmKt.rememberComposableLambda(1312411195, new SliderDefaults$$ExternalSyntheticLambda0(z5, accountCardViewModel, i5), gapComposer), modifier3, composableLambdaImpl, (Function2) null, gapComposer, 6, 8);
                    modifier2 = companion;
                } else {
                    gapComposer.skipToGroupEnd();
                    modifier2 = modifier;
                    z5 = z4;
                }
                boolean z6 = z3;
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new ProfileKt$$ExternalSyntheticLambda5(accountCardViewModel, modifier2, z6, z5, function1, i, i2);
                    return;
                }
                return;
            }
            z4 = z2;
            if ((i & 24576) == 0) {
            }
            if (gapComposer.shouldExecute(i6 & 1, (i6 & 9363) != 9362)) {
            }
            boolean z62 = z3;
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        z3 = z;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z4 = z2;
        if ((i & 24576) == 0) {
        }
        if (gapComposer.shouldExecute(i6 & 1, (i6 & 9363) != 9362)) {
        }
        boolean z622 = z3;
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AccountProfileActions(AccountViewModel accountViewModel, Function1 function1, ElementBoundsRegistry elementBoundsRegistry, boolean z, Composer composer, int i, int i2) {
        int i3;
        boolean z2;
        boolean z3;
        RecomposeScopeImpl endRestartGroup;
        Arrangement$SpacedAligned arrangement$SpacedAligned;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(71118870);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changedInstance(accountViewModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = 16;
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changedInstance(elementBoundsRegistry) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            z2 = z;
            i3 |= gapComposer.changed(z2) ? 2048 : 1024;
            if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) == 1170)) {
                gapComposer.skipToGroupEnd();
                z3 = z2;
            } else {
                boolean z4 = i5 != 0 ? false : z2;
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                DefaultSizes.spacing.getClass();
                Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                if (z4) {
                    gapComposer.startReplaceGroup(1283743494);
                    ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                    arrangement$SpacedAligned = new Arrangement$SpacedAligned(16.0f, true, new OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0(Alignment.Companion.CenterHorizontally, 1));
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(1283849700);
                    ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                    arrangement$SpacedAligned = new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
                    gapComposer.end(false);
                }
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                OffsetKt.FlowRow(m300paddingVpY3zN4$default, arrangement$SpacedAligned, new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), null, 0, 0, Expect_jvmKt.rememberComposableLambda(-1804113839, new LocalViewFactory$$ExternalSyntheticLambda6(elementBoundsRegistry, function1, accountViewModel, i4), gapComposer), gapComposer, 1572864, 56);
                z3 = z4;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new IconButtonKt$$ExternalSyntheticLambda0(accountViewModel, function1, elementBoundsRegistry, z3, i, i2, 8);
                return;
            }
            return;
        }
        z2 = z;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) == 1170)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void AccountSectionHeader(int i, Composer composer, Modifier modifier, String str) {
        int i2;
        str.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1243080051);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(str) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).sectionTitle;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Room.m1165Text25TpFw(0, 0, 0, 0, ((i2 >> 3) & 14) | ((i2 << 3) & 112), 0, 4080, colors.semantic.text.subtle, (Composer) gapComposer, modifier, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FormLabelKt$$ExternalSyntheticLambda0(i, modifier, str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AccountSectionRow(Modifier modifier, Icons icons, String str, String str2, boolean z, Function0 function0, Composer composer, int i, int i2) {
        int i3;
        boolean z2;
        GapComposer gapComposer;
        String str3;
        RecomposeScopeImpl endRestartGroup;
        icons.getClass();
        str.getClass();
        function0.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1438416077);
        if ((i & 48) == 0) {
            i3 = (gapComposer2.changed(modifier) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer2.changed(icons.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer2.changed(str) ? 2048 : 1024;
        }
        int i4 = 221184 | i3;
        int i5 = i2 & 32;
        if (i5 != 0) {
            i4 = 1794048 | i3;
        } else if ((1572864 & i) == 0) {
            z2 = z;
            i4 |= gapComposer2.changed(z2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
            if ((12582912 & i) == 0) {
                i4 |= gapComposer2.changedInstance(function0) ? 8388608 : 4194304;
            }
            int i6 = 1;
            if (gapComposer2.shouldExecute(i4 & 1, (4793489 & i4) == 4793488)) {
                gapComposer = gapComposer2;
                gapComposer.skipToGroupEnd();
                str3 = str2;
            } else {
                if (i5 != 0) {
                    z2 = false;
                }
                gapComposer = gapComposer2;
                CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(Expect_jvmKt.rememberComposableLambda(1298662917, new InfoSectionKt$$ExternalSyntheticLambda6(icons, i6), gapComposer2), Expect_jvmKt.rememberComposableLambda(-742012188, new ToastKt$$ExternalSyntheticLambda1(str, 4), gapComposer2), modifier, function0, false, true, null, z2 ? Badge.Small.INSTANCE : null, CellDefaultAccessory.Push.INSTANCE, 0L, gapComposer, ((i4 << 3) & 896) | 806879286 | ((i4 >> 12) & 7168), 3248);
                str3 = "";
            }
            boolean z3 = z2;
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new androidx.compose.material3.IconButtonKt$$ExternalSyntheticLambda0(modifier, icons, str, str3, z3, function0, i, i2);
                return;
            }
            return;
        }
        z2 = z;
        if ((12582912 & i) == 0) {
        }
        int i62 = 1;
        if (gapComposer2.shouldExecute(i4 & 1, (4793489 & i4) == 4793488)) {
        }
        boolean z32 = z2;
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void AccountSectionRowNoIcon(int i, int i2, Composer composer, Modifier modifier, String str, String str2, Function0 function0) {
        String str3;
        int i3;
        GapComposer gapComposer;
        Modifier modifier2;
        String str4;
        str.getClass();
        function0.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1931146389);
        int i4 = i | 48;
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 |= gapComposer2.changed(str) ? 256 : 128;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | 3072;
            str3 = str2;
        } else {
            str3 = str2;
            i3 = i4 | (gapComposer2.changed(str3) ? 2048 : 1024);
        }
        int i6 = i3 | 221184 | (gapComposer2.changedInstance(function0) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted);
        int i7 = 1;
        if (gapComposer2.shouldExecute(i6 & 1, (599185 & i6) != 599184)) {
            str4 = i5 != 0 ? "" : str3;
            CellDefaultAccessory.Push push = CellDefaultAccessory.Push.INSTANCE;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            gapComposer = gapComposer2;
            CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(Expect_jvmKt.rememberComposableLambda(1770619165, new PreviewActivity$$ExternalSyntheticLambda1(str, str4, i7), gapComposer2), companion, function0, false, true, null, null, 0L, push, null, gapComposer, 805503030 | ((i6 >> 12) & 896), 1368);
            modifier2 = companion;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
            str4 = str3;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AvatarsKt$$ExternalSyntheticLambda5(modifier2, str, str4, function0, i, i2, 4);
        }
    }

    public static final void AccountToDos(AccountViewModel accountViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        Function1 function12;
        int i3;
        boolean z;
        boolean z2;
        AccountInviteButton accountInviteButton;
        NeverEqualPolicy neverEqualPolicy;
        AccountCardViewModel accountCardViewModel;
        int i4;
        int i5;
        NeverEqualPolicy neverEqualPolicy2;
        int i6;
        NeverEqualPolicy neverEqualPolicy3;
        int i7;
        int i8;
        NeverEqualPolicy neverEqualPolicy4;
        accountViewModel.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(540209472);
        if ((i & 48) == 0) {
            i2 = (gapComposer.changedInstance(accountViewModel) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) != 144)) {
            AccountCardViewModel accountCardViewModel2 = accountViewModel.headerViewModel;
            AccountInviteButton accountInviteButton2 = accountViewModel.accountInviteButton;
            AccountCardViewModel$AccountCardBusinessModel$ProfileRowViewModel accountCardViewModel$AccountCardBusinessModel$ProfileRowViewModel = accountCardViewModel2.rewardStatusRow;
            NeverEqualPolicy neverEqualPolicy5 = Composer.Companion.Empty;
            if (accountCardViewModel$AccountCardBusinessModel$ProfileRowViewModel == null) {
                gapComposer.startReplaceGroup(138070731);
                gapComposer.end(false);
                i3 = i2;
                accountCardViewModel = accountCardViewModel2;
                accountInviteButton = accountInviteButton2;
                z2 = false;
                neverEqualPolicy = neverEqualPolicy5;
                i4 = -1762997026;
            } else {
                gapComposer.startReplaceGroup(138070732);
                Icons icons = accountCardViewModel$AccountCardBusinessModel$ProfileRowViewModel.icon;
                String str = accountCardViewModel$AccountCardBusinessModel$ProfileRowViewModel.title;
                String str2 = accountCardViewModel$AccountCardBusinessModel$ProfileRowViewModel.subtitle;
                String str3 = accountCardViewModel$AccountCardBusinessModel$ProfileRowViewModel.accessoryLabel;
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                Colors colors = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                long j = colors.semantic.icon.inverse;
                Colors colors2 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                long j2 = colors2.semantic.background.brand;
                boolean z3 = accountCardViewModel$AccountCardBusinessModel$ProfileRowViewModel.showBadge;
                i3 = i2;
                boolean z4 = (i2 & 896) == 256;
                Object rememberedValue = gapComposer.rememberedValue();
                if (z4 || rememberedValue == neverEqualPolicy5) {
                    z = false;
                    rememberedValue = new AccountToDoKt$$ExternalSyntheticLambda0(0, function1);
                    gapComposer.updateRememberedValue(rememberedValue);
                } else {
                    z = false;
                }
                z2 = z;
                accountInviteButton = accountInviteButton2;
                neverEqualPolicy = neverEqualPolicy5;
                accountCardViewModel = accountCardViewModel2;
                i4 = -1762997026;
                m2969ActionableToDowqdebIU(icons, str, str2, str3, z3, null, j, j2, (Function0) rememberedValue, gapComposer, 0);
                gapComposer = gapComposer;
                gapComposer.end(z2);
            }
            gapComposer.startReplaceGroup(138464214);
            gapComposer.end(z2);
            accountCardViewModel.profileUpsells.Show(lambda$2067942415, gapComposer, 6);
            if (accountCardViewModel.showPhotoToDo) {
                gapComposer.startReplaceGroup(139755923);
                Icons icons2 = Icons.CameraFill24;
                StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ArcadeThemeKt.LocalColors;
                Colors colors3 = (Colors) gapComposer.consume(staticProvidableCompositionLocal2);
                if (colors3 == null) {
                    colors3 = re$$ExternalSyntheticOutline0.m(gapComposer, i4, gapComposer, z2);
                    i8 = -1762997739;
                } else {
                    i8 = -1762997739;
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(z2);
                }
                long j3 = colors3.semantic.icon.subtle;
                Colors colors4 = (Colors) gapComposer.consume(staticProvidableCompositionLocal2);
                if (colors4 == null) {
                    colors4 = re$$ExternalSyntheticOutline0.m(gapComposer, i4, gapComposer, z2);
                } else {
                    gapComposer.startReplaceGroup(i8);
                    gapComposer.end(z2);
                }
                long j4 = colors4.semantic.background.subtle;
                String stringResource = Room.stringResource(gapComposer, R.string.account_header_add_a_profile_photo);
                String stringResource2 = Room.stringResource(gapComposer, R.string.account_header_help_people_find_you);
                i5 = i3;
                i6 = 256;
                boolean z5 = (i5 & 896) == 256 ? true : z2;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (z5) {
                    neverEqualPolicy4 = neverEqualPolicy;
                } else {
                    neverEqualPolicy4 = neverEqualPolicy;
                    if (rememberedValue2 != neverEqualPolicy4) {
                        neverEqualPolicy2 = neverEqualPolicy4;
                        m2970ToDoWMdw5o4(6, 16, j3, j4, gapComposer, null, icons2, stringResource, stringResource2, (Function0) rememberedValue2);
                        gapComposer.end(z2);
                    }
                }
                rememberedValue2 = new AccountToDoKt$$ExternalSyntheticLambda0(3, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
                neverEqualPolicy2 = neverEqualPolicy4;
                m2970ToDoWMdw5o4(6, 16, j3, j4, gapComposer, null, icons2, stringResource, stringResource2, (Function0) rememberedValue2);
                gapComposer.end(z2);
            } else {
                i5 = i3;
                neverEqualPolicy2 = neverEqualPolicy;
                i6 = 256;
                gapComposer.startReplaceGroup(140112578);
                gapComposer.end(z2);
            }
            if (accountViewModel.securityHubRow.isVisible) {
                gapComposer.startReplaceGroup(140170176);
                Icons icons3 = Icons.SecurityCheckOutline24;
                StaticProvidableCompositionLocal staticProvidableCompositionLocal3 = ArcadeThemeKt.LocalColors;
                Colors colors5 = (Colors) gapComposer.consume(staticProvidableCompositionLocal3);
                if (colors5 == null) {
                    colors5 = re$$ExternalSyntheticOutline0.m(gapComposer, i4, gapComposer, z2);
                    i7 = -1762997739;
                } else {
                    i7 = -1762997739;
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(z2);
                }
                long j5 = colors5.semantic.icon.subtle;
                Colors colors6 = (Colors) gapComposer.consume(staticProvidableCompositionLocal3);
                if (colors6 == null) {
                    colors6 = re$$ExternalSyntheticOutline0.m(gapComposer, i4, gapComposer, z2);
                } else {
                    gapComposer.startReplaceGroup(i7);
                    gapComposer.end(z2);
                }
                long j6 = colors6.semantic.background.subtle;
                String stringResource3 = Room.stringResource(gapComposer, R.string.account_settings_security_hub);
                String stringResource4 = Room.stringResource(gapComposer, R.string.account_security_hub_subtitle);
                boolean z6 = (i5 & 896) == i6 ? true : z2;
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (z6) {
                    neverEqualPolicy3 = neverEqualPolicy2;
                } else {
                    neverEqualPolicy3 = neverEqualPolicy2;
                    if (rememberedValue3 != neverEqualPolicy3) {
                        m2970ToDoWMdw5o4(6, 16, j5, j6, gapComposer, null, icons3, stringResource3, stringResource4, (Function0) rememberedValue3);
                        gapComposer.end(z2);
                    }
                }
                rememberedValue3 = new AccountToDoKt$$ExternalSyntheticLambda0(4, function1);
                gapComposer.updateRememberedValue(rememberedValue3);
                m2970ToDoWMdw5o4(6, 16, j5, j6, gapComposer, null, icons3, stringResource3, stringResource4, (Function0) rememberedValue3);
                gapComposer.end(z2);
            } else {
                neverEqualPolicy3 = neverEqualPolicy2;
                gapComposer.startReplaceGroup(140545090);
                gapComposer.end(z2);
            }
            AccountInviteButton accountInviteButton3 = accountInviteButton;
            if (accountInviteButton3.isVisible) {
                gapComposer.startReplaceGroup(140596271);
                Icons icons4 = Icons.Add24;
                String str4 = accountInviteButton3.title;
                String str5 = accountInviteButton3.subtitle;
                boolean z7 = (i5 & 896) != i6 ? z2 : true;
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (z7 || rememberedValue4 == neverEqualPolicy3) {
                    function12 = function1;
                    rememberedValue4 = new AccountToDoKt$$ExternalSyntheticLambda0(5, function12);
                    gapComposer.updateRememberedValue(rememberedValue4);
                } else {
                    function12 = function1;
                }
                m2970ToDoWMdw5o4(6, 112, 0L, 0L, gapComposer, null, icons4, str4, str5, (Function0) rememberedValue4);
                gapComposer.end(z2);
            } else {
                function12 = function1;
                gapComposer.startReplaceGroup(140799042);
                gapComposer.end(z2);
            }
        } else {
            function12 = function1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TextKt$$ExternalSyntheticLambda1(accountViewModel, function12, i, 29);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AccountToolbar(Modifier modifier, Function0 function0, Function0 function02, Function0 function03, Function0 function04, boolean z, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Function0 function05;
        int i4;
        boolean z2;
        Function0 function06;
        boolean z3;
        RecomposeScopeImpl endRestartGroup;
        Function0 function07;
        function0.getClass();
        function02.getClass();
        function03.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1204538964);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = (gapComposer.changed(modifier2) ? 4 : 2) | i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(function0) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changedInstance(function02) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer.changedInstance(function03) ? 2048 : 1024;
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            i4 = i3 | 24576;
            function05 = function04;
        } else {
            function05 = function04;
            i4 = i3 | (gapComposer.changedInstance(function05) ? 16384 : PKIFailureInfo.certRevoked);
        }
        int i7 = i2 & 32;
        if (i7 != 0) {
            i4 |= 196608;
        } else if ((196608 & i) == 0) {
            z2 = z;
            i4 |= gapComposer.changed(z2) ? PKIFailureInfo.unsupportedVersion : 65536;
            byte b = 0;
            if (gapComposer.shouldExecute(i4 & 1, (74899 & i4) == 74898)) {
                gapComposer.skipToGroupEnd();
                function06 = function05;
                z3 = z2;
            } else {
                Modifier modifier3 = i5 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                if (i6 != 0) {
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new MotionKt$$ExternalSyntheticLambda0(7);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    function07 = (Function0) rememberedValue;
                } else {
                    function07 = function05;
                }
                boolean z4 = i7 != 0 ? false : z2;
                DBUtil.TitleBarSub(Expect_jvmKt.rememberComposableLambda(1499590770, new AccountToolbarKt$$ExternalSyntheticLambda1(z4, function07, b, b), gapComposer), NavigationType.CLOSE, modifier3, (DynamicColorConfiguration) null, function0, (Modifier) null, Expect_jvmKt.rememberComposableLambda(-294539315, new AccountToolbarKt$$ExternalSyntheticLambda2(z4, function02, function03), gapComposer), gapComposer, ((i4 << 6) & 896) | 1572918 | ((i4 << 9) & 57344), 40);
                function06 = function07;
                z3 = z4;
                modifier2 = modifier3;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new androidx.compose.material3.IconButtonKt$$ExternalSyntheticLambda0(modifier2, function0, function02, function03, function06, z3, i, i2, 2);
                return;
            }
            return;
        }
        z2 = z;
        byte b2 = 0;
        if (gapComposer.shouldExecute(i4 & 1, (74899 & i4) == 74898)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v5 */
    public static final void AccountView(AccountViewModel accountViewModel, Function1 function1, ElementBoundsRegistry elementBoundsRegistry, Composer composer, int i) {
        GapComposer gapComposer;
        Modifier wrapContentHeight;
        Modifier.Companion companion;
        AccountCardViewModel accountCardViewModel;
        int i2;
        Modifier modifier;
        ?? r11;
        ?? r13;
        AccountViewModel accountViewModel2;
        GapComposer gapComposer2;
        Function1 function12 = function1;
        accountViewModel.getClass();
        AccountCardViewModel accountCardViewModel2 = accountViewModel.headerViewModel;
        function12.getClass();
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(-1330292471);
        Applier applier = gapComposer3.applier;
        int i3 = i | (gapComposer3.changedInstance(accountViewModel) ? 4 : 2) | (gapComposer3.changedInstance(function12) ? 32 : 16) | (gapComposer3.changedInstance(elementBoundsRegistry) ? 256 : 128);
        if (gapComposer3.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
            } else {
                gapComposer3.startReplaceGroup(-1762997739);
                gapComposer3.end(false);
            }
            long j = colors.semantic.background.f1047app;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(ImageKt.m177backgroundbw27NRU(companion2, j, rectangleShapeKt$RectangleShape$1), 1.0f);
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer3, 0);
            int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, fillMaxWidth);
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
            int i4 = i3 & 112;
            boolean z = i4 == 32;
            Object rememberedValue = gapComposer3.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new AccountToDoKt$$ExternalSyntheticLambda0(6, function12);
                gapComposer3.updateRememberedValue(rememberedValue);
            }
            Function0 function0 = (Function0) rememberedValue;
            boolean z2 = i4 == 32;
            Object rememberedValue2 = gapComposer3.rememberedValue();
            if (z2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new AccountToDoKt$$ExternalSyntheticLambda0(11, function12);
                gapComposer3.updateRememberedValue(rememberedValue2);
            }
            Function0 function02 = (Function0) rememberedValue2;
            boolean z3 = i4 == 32;
            Object rememberedValue3 = gapComposer3.rememberedValue();
            if (z3 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new AccountToDoKt$$ExternalSyntheticLambda0(12, function12);
                gapComposer3.updateRememberedValue(rememberedValue3);
            }
            Function0 function03 = (Function0) rememberedValue3;
            boolean z4 = i4 == 32;
            Object rememberedValue4 = gapComposer3.rememberedValue();
            if (z4 || rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = new AccountToDoKt$$ExternalSyntheticLambda0(13, function12);
                gapComposer3.updateRememberedValue(rememberedValue4);
            }
            AccountToolbar(null, function0, function02, function03, (Function0) rememberedValue4, accountViewModel.showQrCode, gapComposer3, 0, 1);
            wrapContentHeight = SizeKt.wrapContentHeight(companion2, Alignment.Companion.CenterVertically, (r2 & 2) == 0);
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(wrapContentHeight, ImageKt.rememberScrollState(gapComposer3), false, 14);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer3, 0);
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
            if (accountViewModel.showQrCode) {
                gapComposer3.startReplaceGroup(-1443805311);
                r11 = 1;
                r13 = 0;
                DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer3, null);
                accountCardViewModel = accountCardViewModel2;
                i2 = i3;
                modifier = null;
                QrCode(accountViewModel.qrCodeBitmap, accountCardViewModel.avatar, accountViewModel.qrCodeError, function1, null, gapComposer3, (i3 << 6) & 7168);
                DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer3, null);
                AccountHeader(accountCardViewModel, null, false, true, function1, gapComposer3, ((i2 << 9) & 57344) | 3456, 2);
                GapComposer gapComposer4 = gapComposer3;
                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer4, null);
                companion = companion2;
                function12 = function1;
                AccountProfileActions(accountViewModel, function12, elementBoundsRegistry, true, gapComposer4, (i2 & 14) | 3072 | i4 | (i2 & 896), 0);
                gapComposer4.end(false);
                accountViewModel2 = accountViewModel;
                gapComposer2 = gapComposer4;
            } else {
                companion = companion2;
                accountCardViewModel = accountCardViewModel2;
                i2 = i3;
                modifier = null;
                r11 = 1;
                r13 = 0;
                gapComposer3.startReplaceGroup(-1443170896);
                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer3, null);
                AccountHeader(accountCardViewModel, null, false, false, function1, gapComposer3, (i2 << 9) & 57344, 14);
                GapComposer gapComposer5 = gapComposer3;
                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer5, null);
                accountViewModel2 = accountViewModel;
                function12 = function1;
                AccountProfileActions(accountViewModel2, function12, elementBoundsRegistry, false, gapComposer5, i2 & IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO, 8);
                gapComposer5.end(false);
                gapComposer2 = gapComposer5;
            }
            if (accountCardViewModel.showPhotoToDo || accountViewModel2.accountInviteButton.isVisible || accountViewModel2.securityHubRow.isVisible || !((ProfileUpsellViewModel) accountCardViewModel.profileUpsells.model).upsells.isEmpty()) {
                gapComposer2.startReplaceGroup(-1442543053);
                DBUtil.SpacerWithinSectionMedium(r13, r11, gapComposer2, modifier);
                int i5 = i2 << 3;
                AccountToDos(accountViewModel2, function12, gapComposer2, (i5 & 896) | 6 | (i5 & 112));
                gapComposer2.end(r13);
            } else {
                gapComposer2.startReplaceGroup(-1442464251);
                gapComposer2.end(r13);
            }
            ModalKt.HorizontalDivider(r13, r13, gapComposer2, SpacerKt.m301paddingqDBjuR0(companion, 16.0f, 16.0f, 16.0f, 44.0f));
            AccountSettingsKt.AccountSettings(modifier, accountViewModel2.settingsViewModel, function12, gapComposer2, 6 | ((i2 << 6) & 7168));
            DBUtil.SpacerWithinSectionMedium(r13, r11, gapComposer2, modifier);
            AccountFooter(modifier, accountViewModel2.accountFooterViewModel, function12, gapComposer2, (i2 << 3) & 896);
            DBUtil.SpacerBetweenSectionXLarge(r13, r11, gapComposer2, modifier);
            SpacerKt.Spacer(gapComposer2, SpacerKt.navigationBarsPadding(companion));
            gapComposer2.end(r11);
            gapComposer2.end(r11);
            gapComposer = gapComposer2;
        } else {
            gapComposer3.skipToGroupEnd();
            gapComposer = gapComposer3;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Yoga$$ExternalSyntheticLambda7((Object) accountViewModel, function12, (Object) elementBoundsRegistry, i, 22);
        }
    }

    /* renamed from: ActionableToDo-wqdebIU, reason: not valid java name */
    public static final void m2969ActionableToDowqdebIU(final Icons icons, final String str, final String str2, final String str3, final boolean z, Modifier modifier, final long j, final long j2, final Function0 function0, Composer composer, final int i) {
        GapComposer gapComposer;
        final Modifier modifier2;
        Modifier modifier3;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(788822092);
        int i2 = i | (gapComposer2.changed(icons.ordinal()) ? 4 : 2) | (gapComposer2.changed(str) ? 32 : 16) | (gapComposer2.changed(str2) ? 256 : 128) | (gapComposer2.changed(str3) ? 2048 : 1024) | (gapComposer2.changed(z) ? 16384 : PKIFailureInfo.certRevoked) | 196608 | (gapComposer2.changed(j) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted) | (gapComposer2.changed(j2) ? 8388608 : 4194304) | (gapComposer2.changedInstance(function0) ? 67108864 : 33554432);
        if (gapComposer2.shouldExecute(i2 & 1, (38347923 & i2) != 38347922)) {
            gapComposer2.startDefaults();
            if ((i & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                modifier3 = Modifier.Companion.$$INSTANCE;
            } else {
                gapComposer2.skipToGroupEnd();
                modifier3 = modifier;
            }
            gapComposer2.endDefaults();
            Badge.Small small = z ? Badge.Small.INSTANCE : null;
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1753635026, new Function3() { // from class: com.squareup.cash.account.components.AccountToDoKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Composer composer2 = (Composer) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    ((RealCellActivityAvatarScope) obj).getClass();
                    GapComposer gapComposer3 = (GapComposer) composer2;
                    if (gapComposer3.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                        TextViewKt.m3613AvatarB_rZmmc(AvatarSize.Size48, "", j2, (String) null, (Modifier) null, (AvatarImage) new AvatarImage.LocalIcon(Icons.this, j, 4), (Function2) null, (AvatarOverlay) null, false, 0L, (Composer) gapComposer3, 3126, 0, 2000);
                    } else {
                        gapComposer3.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer2);
            boolean z2 = ((234881024 & i2) == 67108864) | ((i2 & 7168) == 2048);
            Object rememberedValue = gapComposer2.rememberedValue();
            if (z2 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ModalBottomSheetKt$$ExternalSyntheticLambda6(function0, str3);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            gapComposer = gapComposer2;
            Modifier modifier4 = modifier3;
            CellDefaultKt.m3389CellActivityGZm5OLo(rememberComposableLambda, str, (Function1) rememberedValue, function0, modifier4, small, str2, null, false, 0, 0L, gapComposer, (i2 & 112) | 6 | ((i2 >> 15) & 7168) | 24576 | ((i2 << 12) & 3670016), 1920);
            modifier2 = modifier4;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2(str, str2, str3, z, modifier2, j, j2, function0, i) { // from class: com.squareup.cash.account.components.AccountToDoKt$$ExternalSyntheticLambda7
                public final /* synthetic */ String f$1;
                public final /* synthetic */ String f$2;
                public final /* synthetic */ String f$3;
                public final /* synthetic */ boolean f$4;
                public final /* synthetic */ Modifier f$5;
                public final /* synthetic */ long f$6;
                public final /* synthetic */ long f$7;
                public final /* synthetic */ Function0 f$8;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(1);
                    AccountToDoKt.m2969ActionableToDowqdebIU(Icons.this, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, (Composer) obj, updateChangedFlags);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void CustomerProfilePreview(final ProfileViewModel profileViewModel, final AccountAvatarViewModel accountAvatarViewModel, final String str, final String str2, final boolean z, final boolean z2, final List list, final Modifier modifier, Composer composer, final int i) {
        GapComposer gapComposer;
        RecomposeScopeImpl endRestartGroup;
        Function2 function2;
        String stringResource;
        AccountAvatarViewModel accountAvatarViewModel2;
        List arrayList;
        PreviewTrustIndicator previewTrustIndicator;
        String str3;
        accountAvatarViewModel.getClass();
        list.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(28425351);
        int i2 = i | (gapComposer2.changedInstance(profileViewModel) ? 4 : 2) | (gapComposer2.changedInstance(accountAvatarViewModel) ? 32 : 16) | (gapComposer2.changed(str) ? 256 : 128) | (gapComposer2.changed(str2) ? 2048 : 1024) | (gapComposer2.changed(z) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer2.changed(z2) ? PKIFailureInfo.unsupportedVersion : 65536) | (gapComposer2.changedInstance(list) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted);
        if (gapComposer2.shouldExecute(i2 & 1, (4793491 & i2) != 4793490)) {
            if (profileViewModel == null) {
                endRestartGroup = gapComposer2.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                final int i3 = 0;
                function2 = new Function2(profileViewModel, accountAvatarViewModel, str, str2, z, z2, list, modifier, i, i3) { // from class: com.squareup.cash.account.components.ProfilePreviewKt$$ExternalSyntheticLambda0
                    public final /* synthetic */ int $r8$classId;
                    public final /* synthetic */ ProfileViewModel f$0;
                    public final /* synthetic */ AccountAvatarViewModel f$1;
                    public final /* synthetic */ String f$2;
                    public final /* synthetic */ String f$3;
                    public final /* synthetic */ boolean f$4;
                    public final /* synthetic */ boolean f$5;
                    public final /* synthetic */ List f$6;
                    public final /* synthetic */ Modifier f$7;

                    {
                        this.$r8$classId = i3;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        switch (this.$r8$classId) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int updateChangedFlags = Updater.updateChangedFlags(12582913);
                                AccountToDoKt.CustomerProfilePreview(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, (Composer) obj, updateChangedFlags);
                                break;
                            case 1:
                                ((Integer) obj2).getClass();
                                int updateChangedFlags2 = Updater.updateChangedFlags(12582913);
                                AccountToDoKt.CustomerProfilePreview(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, (Composer) obj, updateChangedFlags2);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int updateChangedFlags3 = Updater.updateChangedFlags(12582913);
                                AccountToDoKt.CustomerProfilePreview(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, (Composer) obj, updateChangedFlags3);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            } else if (profileViewModel instanceof ProfileViewModel.Loaded) {
                gapComposer2.startReplaceGroup(711605051);
                gapComposer2.end(false);
                ProfileViewModel.Loaded loaded = (ProfileViewModel.Loaded) profileViewModel;
                ProfileHeaderViewModel profileHeaderViewModel = loaded.header.headerViewModel;
                String str4 = (str == null || StringsKt.isBlank(str)) ? null : str;
                if (str4 == null && (str4 = profileHeaderViewModel.badgeName.name) == null) {
                    str4 = "";
                }
                String str5 = str4;
                String str6 = (str2 == null || StringsKt.isBlank(str2)) ? null : str2;
                if (str6 == null) {
                    str6 = profileHeaderViewModel.subtitle;
                }
                String str7 = str6;
                String substringBefore$default = StringsKt.substringBefore$default(str5, ' ');
                if (StringsKt.isBlank(substringBefore$default)) {
                    substringBefore$default = null;
                }
                if (substringBefore$default == null) {
                    gapComposer2.startReplaceGroup(711947724);
                    gapComposer2.end(false);
                    stringResource = null;
                } else {
                    gapComposer2.startReplaceGroup(711947725);
                    stringResource = Room.stringResource(R.string.edit_profile_preview_activity_body, new Object[]{substringBefore$default}, gapComposer2);
                    gapComposer2.end(false);
                }
                if (stringResource == null) {
                    stringResource = re$$ExternalSyntheticOutline0.m(gapComposer2, 1546990314, R.string.edit_profile_preview_visitors_history, gapComposer2, false);
                } else {
                    gapComposer2.startReplaceGroup(1546984455);
                    gapComposer2.end(false);
                }
                String str8 = stringResource;
                Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                } else {
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(false);
                }
                Modifier verticalScroll$default = ImageKt.verticalScroll$default(ImageKt.m177backgroundbw27NRU(modifier, colors.semantic.background.f1047app, ColorKt.RectangleShape), ImageKt.rememberScrollState(gapComposer2), false, 14);
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
                int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, verticalScroll$default);
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
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                SpacerKt.Spacer(gapComposer2, SizeKt.m277height3ABfNKs(companion, 44.0f));
                if (!z || z2 || accountAvatarViewModel.photoUrl == null) {
                    accountAvatarViewModel2 = accountAvatarViewModel;
                } else {
                    Character ch = accountAvatarViewModel.monogram;
                    ColorModel colorModel = accountAvatarViewModel.backgroundColor;
                    String str9 = accountAvatarViewModel.accessibilityText;
                    colorModel.getClass();
                    accountAvatarViewModel2 = new AccountAvatarViewModel(null, ch, colorModel, str9);
                }
                PreviewProfileHeader(accountAvatarViewModel2, str5, str7, profileHeaderViewModel, gapComposer2, 0);
                NotificationCompat notificationCompat = loaded.body;
                ProfileViewModel$Loaded$ProfileBody$Loaded profileViewModel$Loaded$ProfileBody$Loaded = notificationCompat instanceof ProfileViewModel$Loaded$ProfileBody$Loaded ? (ProfileViewModel$Loaded$ProfileBody$Loaded) notificationCompat : null;
                if (profileViewModel$Loaded$ProfileBody$Loaded == null) {
                    arrayList = EmptyList.INSTANCE;
                } else {
                    Debug debug = profileViewModel$Loaded$ProfileBody$Loaded.genericProfileElements;
                    if (debug instanceof GenericProfileElementsViewModel$Success) {
                        List list2 = ((GenericProfileElementsViewModel$Success) debug).elements;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : list2) {
                            if (obj instanceof GenericProfileElementViewModel.TrustIndicatorsWidget) {
                                arrayList2.add(obj);
                            }
                        }
                        arrayList = new ArrayList();
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            List<TrustElementWidget> list3 = ((GenericProfileElementViewModel.TrustIndicatorsWidget) it.next()).trustIndicators;
                            ArrayList arrayList3 = new ArrayList();
                            for (TrustElementWidget trustElementWidget : list3) {
                                String str10 = trustElementWidget.title;
                                PreviewTrustIndicator previewTrustIndicator2 = str10 != null ? new PreviewTrustIndicator(str10, trustElementWidget.arcadeIconId, trustElementWidget.icon) : null;
                                if (previewTrustIndicator2 != null) {
                                    arrayList3.add(previewTrustIndicator2);
                                }
                            }
                            CollectionsKt__MutableCollectionsKt.addAll(arrayList3, arrayList);
                        }
                    } else {
                        arrayList = EmptyList.INSTANCE;
                    }
                }
                arrayList.getClass();
                List<PreviewTrustIndicatorViewModel> list4 = list;
                int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity >= 16 ? mapCapacity : 16);
                for (PreviewTrustIndicatorViewModel previewTrustIndicatorViewModel : list4) {
                    PreviewTrustIndicatorViewModel.Type type2 = previewTrustIndicatorViewModel.f1040type;
                    int ordinal = type2.ordinal();
                    if (ordinal == 0) {
                        zzd zzdVar = Icons.Companion;
                        str3 = "z0zjeQ";
                    } else if (ordinal == 1) {
                        zzd zzdVar2 = Icons.Companion;
                        str3 = "KfLRUr";
                    } else if (ordinal != 2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    } else {
                        zzd zzdVar3 = Icons.Companion;
                        str3 = "FpDJiD";
                    }
                    linkedHashMap.put(type2, new PreviewTrustIndicator(previewTrustIndicatorViewModel.title, str3, null));
                }
                List<PreviewTrustIndicator> list5 = arrayList;
                ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list5, 10));
                for (PreviewTrustIndicator previewTrustIndicator3 : list5) {
                    if (StringsKt.contains((CharSequence) previewTrustIndicator3.title, (CharSequence) "%1$s", false) && (previewTrustIndicator = (PreviewTrustIndicator) linkedHashMap.get(PreviewTrustIndicatorViewModel.Type.JOINED)) != null) {
                        previewTrustIndicator3 = previewTrustIndicator;
                    }
                    arrayList4.add(previewTrustIndicator3);
                }
                ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList4, 10));
                Iterator it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    arrayList5.add(((PreviewTrustIndicator) it2.next()).title);
                }
                Set set = CollectionsKt.toSet(arrayList5);
                ArrayList filterNotNull = CollectionsKt.filterNotNull(linkedHashMap.values());
                ArrayList arrayList6 = new ArrayList();
                Iterator it3 = filterNotNull.iterator();
                while (it3.hasNext()) {
                    Object next = it3.next();
                    if (!set.contains(((PreviewTrustIndicator) next).title)) {
                        arrayList6.add(next);
                    }
                }
                ListUnorderedKt.ListUnordered((Modifier) null, (ListUnorderedState) null, ListUnorderedProminence.Subtle, (ListUnorderedSize) null, RecyclerView.DECELERATION_RATE, Expect_jvmKt.rememberComposableLambda(-1882133865, new ProfilePreviewKt$$ExternalSyntheticLambda3(0, CollectionsKt.plus((Iterable) arrayList6, (Collection) arrayList4)), gapComposer2), gapComposer2, 196992, 27);
                gapComposer = gapComposer2;
                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                ModalKt.HorizontalDivider(0, 0, gapComposer, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2));
                DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
                ViewfinderDefaults.SectionHeader(Room.stringResource(gapComposer, R.string.edit_profile_preview_activity_title), (Modifier) null, (String) null, (Function0) null, str8, gapComposer, 0, 14);
                gapComposer.end(true);
            } else {
                gapComposer2.startReplaceGroup(711428227);
                Object rememberedValue = gapComposer2.rememberedValue();
                if (rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new MarkerKt$$ExternalSyntheticLambda2(23);
                    gapComposer2.updateRememberedValue(rememberedValue);
                }
                ProfileUiViewKt.ProfileView(modifier, profileViewModel, (Function1) rememberedValue, false, false, gapComposer2, 28038 | ((i2 << 3) & 112), 0);
                gapComposer2.end(false);
                endRestartGroup = gapComposer2.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                final int i4 = 1;
                function2 = new Function2(profileViewModel, accountAvatarViewModel, str, str2, z, z2, list, modifier, i, i4) { // from class: com.squareup.cash.account.components.ProfilePreviewKt$$ExternalSyntheticLambda0
                    public final /* synthetic */ int $r8$classId;
                    public final /* synthetic */ ProfileViewModel f$0;
                    public final /* synthetic */ AccountAvatarViewModel f$1;
                    public final /* synthetic */ String f$2;
                    public final /* synthetic */ String f$3;
                    public final /* synthetic */ boolean f$4;
                    public final /* synthetic */ boolean f$5;
                    public final /* synthetic */ List f$6;
                    public final /* synthetic */ Modifier f$7;

                    {
                        this.$r8$classId = i4;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj22) {
                        switch (this.$r8$classId) {
                            case 0:
                                ((Integer) obj22).getClass();
                                int updateChangedFlags = Updater.updateChangedFlags(12582913);
                                AccountToDoKt.CustomerProfilePreview(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, (Composer) obj2, updateChangedFlags);
                                break;
                            case 1:
                                ((Integer) obj22).getClass();
                                int updateChangedFlags2 = Updater.updateChangedFlags(12582913);
                                AccountToDoKt.CustomerProfilePreview(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, (Composer) obj2, updateChangedFlags2);
                                break;
                            default:
                                ((Integer) obj22).getClass();
                                int updateChangedFlags3 = Updater.updateChangedFlags(12582913);
                                AccountToDoKt.CustomerProfilePreview(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, (Composer) obj2, updateChangedFlags3);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            }
            endRestartGroup.block = function2;
        }
        gapComposer = gapComposer2;
        gapComposer.skipToGroupEnd();
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            final int i5 = 2;
            function2 = new Function2(profileViewModel, accountAvatarViewModel, str, str2, z, z2, list, modifier, i, i5) { // from class: com.squareup.cash.account.components.ProfilePreviewKt$$ExternalSyntheticLambda0
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ ProfileViewModel f$0;
                public final /* synthetic */ AccountAvatarViewModel f$1;
                public final /* synthetic */ String f$2;
                public final /* synthetic */ String f$3;
                public final /* synthetic */ boolean f$4;
                public final /* synthetic */ boolean f$5;
                public final /* synthetic */ List f$6;
                public final /* synthetic */ Modifier f$7;

                {
                    this.$r8$classId = i5;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj22) {
                    switch (this.$r8$classId) {
                        case 0:
                            ((Integer) obj22).getClass();
                            int updateChangedFlags = Updater.updateChangedFlags(12582913);
                            AccountToDoKt.CustomerProfilePreview(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, (Composer) obj2, updateChangedFlags);
                            break;
                        case 1:
                            ((Integer) obj22).getClass();
                            int updateChangedFlags2 = Updater.updateChangedFlags(12582913);
                            AccountToDoKt.CustomerProfilePreview(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, (Composer) obj2, updateChangedFlags2);
                            break;
                        default:
                            ((Integer) obj22).getClass();
                            int updateChangedFlags3 = Updater.updateChangedFlags(12582913);
                            AccountToDoKt.CustomerProfilePreview(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, (Composer) obj2, updateChangedFlags3);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            endRestartGroup.block = function2;
        }
    }

    public static final void Disclosure(Modifier modifier, AccountDocumentsViewModel.DocumentModel.DisclosureModel disclosureModel, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer;
        Modifier modifier2;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(939174968);
        int i2 = i | 6 | (gapComposer2.changedInstance(disclosureModel) ? 32 : 16) | (gapComposer2.changedInstance(function1) ? 256 : 128);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Strings.getSizes(gapComposer2).getClass();
            DefaultSizes.spacing.getClass();
            Strings.getSizes(gapComposer2).getClass();
            Strings.getSizes(gapComposer2).getClass();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 16.0f, 16.0f, 2);
            String str = disclosureModel.markdownContent;
            TextStyle textStyle = Strings.getTypography(gapComposer2).bodyXSmall;
            long j = Strings.getColors(gapComposer2).semantic.text.subtle;
            boolean z = (i2 & 896) == 256;
            Object rememberedValue = gapComposer2.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new SwipeToDismissKt$$ExternalSyntheticLambda4(9, function1);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            gapComposer = gapComposer2;
            LazyDslKt.m304MarkdownTextpCuZGqc(str, (Function2) rememberedValue, m302paddingqDBjuR0$default, textStyle, j, null, null, new TextLineBalancing(1), 2, 0, 0, gapComposer, 100663296, 1632);
            modifier2 = companion;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Yoga$$ExternalSyntheticLambda7((Object) modifier2, (Object) disclosureModel, function1, i, 19);
        }
    }

    public static final void EditProfileView(int i, Composer composer, Modifier modifier, EditProfileViewModel$EditCustomerProfileViewModel editProfileViewModel$EditCustomerProfileViewModel, Function1 function1) {
        GapComposer gapComposer;
        editProfileViewModel$EditCustomerProfileViewModel.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(2084517894);
        Applier applier = gapComposer2.applier;
        int i2 = i | (gapComposer2.changedInstance(editProfileViewModel$EditCustomerProfileViewModel) ? 4 : 2) | (gapComposer2.changed(modifier) ? 32 : 16) | (gapComposer2.changedInstance(function1) ? 256 : 128);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, fillMaxSize);
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
            Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Modifier fillMaxSize2 = SizeKt.fillMaxSize(SpacerKt.systemBarsPadding(modifier), 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer2, 48);
            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, fillMaxSize2);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            String stringResource = Room.stringResource(gapComposer2, R.string.edit_profile_toolbar_title);
            NavigationType navigationType = NavigationType.BACK;
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new AccountToDoKt$$ExternalSyntheticLambda0(14, function1);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            DBUtil.TitleBarSub(stringResource, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer2, 48, 108);
            SpacerKt.Spacer(gapComposer2, SizeKt.m277height3ABfNKs(companion, 24.0f));
            int ordinal = editProfileViewModel$EditCustomerProfileViewModel.viewMode.ordinal();
            boolean z2 = i3 == 256;
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (z2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new UtilsKt$$ExternalSyntheticLambda1(9, function1);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            Function1 function12 = (Function1) rememberedValue2;
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new MarkerKt$$ExternalSyntheticLambda2(22);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            ModalKt.SegmentedControl(ordinal, function12, null, (Function1) rememberedValue3, gapComposer2, 3072, 4);
            SpacerKt.Spacer(gapComposer2, SizeKt.m277height3ABfNKs(companion, 16.0f));
            CrossfadeKt.Crossfade(editProfileViewModel$EditCustomerProfileViewModel.viewMode, new LayoutWeightElement(1.0f, true), (FiniteAnimationSpec) null, "EditProfileCrossfade", Expect_jvmKt.rememberComposableLambda(1787518039, new EditProfileUiViewKt$$ExternalSyntheticLambda3(editProfileViewModel$EditCustomerProfileViewModel, function1, 0), gapComposer2), gapComposer2, 27648, 4);
            gapComposer = gapComposer2;
            gapComposer.end(true);
            EditProfileViewModel$DialogModel editProfileViewModel$DialogModel = editProfileViewModel$EditCustomerProfileViewModel.dialogModel;
            if (editProfileViewModel$DialogModel == null) {
                gapComposer.startReplaceGroup(-397613070);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-397613069);
                ModalKt.Dimmer(null, null, null, Expect_jvmKt.rememberComposableLambda(-548423455, new EditProfileUiViewKt$$ExternalSyntheticLambda4(editProfileViewModel$DialogModel, function1), gapComposer), gapComposer, 3072, 7);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new EditProfileUiViewKt$$ExternalSyntheticLambda5(editProfileViewModel$EditCustomerProfileViewModel, modifier, function1, i);
        }
    }

    public static final void Footer(Modifier modifier, AccountDocumentsViewModel.DocumentModel.FooterModel footerModel, Function1 function1, Composer composer, int i) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-602798188);
        int i2 = i | 6 | (gapComposer.changedInstance(footerModel) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodyXSmall, (TextLineBalancing) null, footerModel.label, (Map) null, (Function1) null, false);
            Strings.getSizes(gapComposer).getClass();
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, 12.0f, RecyclerView.DECELERATION_RATE, 32.0f, 5);
            boolean changedInstance = gapComposer.changedInstance(footerModel) | ((i2 & 896) == 256);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BalanceFeedKt$$ExternalSyntheticLambda5(2, function1, footerModel);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer).semantic.text.link, (Composer) gapComposer, ImageKt.m183clickableoSLSa3U$default(m302paddingqDBjuR0$default, false, null, null, (Function0) rememberedValue, 15), Strings.getTypography(gapComposer).linkXSmall, (TextLineBalancing) null, footerModel.buttonLabel, (Map) null, (Function1) null, false);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Yoga$$ExternalSyntheticLambda7((Object) modifier2, (Object) footerModel, function1, i, 20);
        }
    }

    public static final void NoDocument(AccountDocumentsViewModel accountDocumentsViewModel, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        boolean z;
        int i2;
        int i3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-118083119);
        int i4 = i | (gapComposer.changedInstance(accountDocumentsViewModel) ? 4 : 2) | 48;
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 19) != 18)) {
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            Modifier.Companion companion2 = companion;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).labelMedium, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.account_no_document_title), (Map) null, (Function1) null, false);
            Request$Priority$EnumUnboxingLocalUtility.m(Strings.getSizes(gapComposer), companion2, 4.0f, gapComposer);
            String str = accountDocumentsViewModel.emptyStateDescription;
            if (str == null) {
                gapComposer.startReplaceGroup(-907756491);
                StatementType statementType = accountDocumentsViewModel.statementType;
                if ((statementType == null ? -1 : AccountDocumentsViewKt$WhenMappings.$EnumSwitchMapping$1[statementType.ordinal()]) == 1) {
                    i2 = 524908539;
                    i3 = R.string.account_no_bitcoin_document_description;
                    z = false;
                } else {
                    z = false;
                    i2 = 524911251;
                    i3 = R.string.account_no_document_description;
                }
                str = re$$ExternalSyntheticOutline0.m(gapComposer, i2, i3, gapComposer, z);
                gapComposer.end(z);
            } else {
                gapComposer.startReplaceGroup(524905590);
                gapComposer.end(false);
            }
            Room.m1165Text25TpFw(3, 0, 0, 3, 196608, 0, 2770, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodyMedium, new TextLineBalancing(1), str, (Map) null, (Function1) null, false);
            gapComposer.end(true);
            modifier2 = companion2;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MenuPickerSheetKt$$ExternalSyntheticLambda4(accountDocumentsViewModel, modifier2, i, 12);
        }
    }

    public static final void PinkThemeSparkles(Modifier modifier, boolean z, float f, Composer composer, int i) {
        boolean z2;
        float f2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(985695230);
        int i2 = 2;
        int i3 = i | (gapComposer.changed(modifier) ? 4 : 2) | 432;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Object obj = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj2 = Composer.Companion.Empty;
            if (rememberedValue == obj2) {
                rememberedValue = Updater.mutableStateOf$default(EmptyList.INSTANCE);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == obj2) {
                rememberedValue2 = AnimatableKt.Animatable(RecyclerView.DECELERATION_RATE, 0.01f);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Animatable animatable = (Animatable) rememberedValue2;
            boolean changedInstance = gapComposer.changedInstance(animatable);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue3 == obj2) {
                rememberedValue3 = new Hero3DCardViewKt$InteractiveCard$11$1(animatable, mutableState, null, i2);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Updater.LaunchedEffect((Composer) gapComposer, (Object) true, (Function2) rememberedValue3);
            boolean changed = gapComposer.changed(obj) | gapComposer.changedInstance(animatable);
            Object rememberedValue4 = gapComposer.rememberedValue();
            float f3 = 1.0f;
            if (changed || rememberedValue4 == obj2) {
                Object sliderKt$$ExternalSyntheticLambda8 = new SliderKt$$ExternalSyntheticLambda8(f3, mutableState, obj, animatable, 2);
                gapComposer.updateRememberedValue(sliderKt$$ExternalSyntheticLambda8);
                rememberedValue4 = sliderKt$$ExternalSyntheticLambda8;
            }
            CanvasKt.Canvas(i3 & 14, gapComposer, modifier, (Function1) rememberedValue4);
            z2 = true;
            f2 = 1.0f;
        } else {
            gapComposer.skipToGroupEnd();
            z2 = z;
            f2 = f;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PinkThemeSparklesKt$$ExternalSyntheticLambda1(modifier, z2, f2, i, 0);
        }
    }

    public static final void PreviewProfileHeader(AccountAvatarViewModel accountAvatarViewModel, String str, String str2, ProfileHeaderViewModel profileHeaderViewModel, Composer composer, int i) {
        long j;
        Modifier.Companion companion;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-748209734);
        int i2 = i | (gapComposer.changedInstance(accountAvatarViewModel) ? 4 : 2) | (gapComposer.changed(str) ? 32 : 16) | (gapComposer.changed(str2) ? 256 : 128) | (gapComposer.changedInstance(profileHeaderViewModel) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            ProfileHeaderViewModel.BadgeName badgeName = profileHeaderViewModel.badgeName;
            com.squareup.cash.data.profile.Badge badge = badgeName.isVerified ? com.squareup.cash.data.profile.Badge.VERIFIED : badgeName.isBusiness ? com.squareup.cash.data.profile.Badge.BUSINESS : null;
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion2, 1.0f);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            AvatarSize avatarSize = AvatarSize.Size96;
            Character ch = accountAvatarViewModel.monogram;
            String valueOf = ch != null ? String.valueOf(ch.charValue()) : null;
            if (valueOf == null) {
                valueOf = "";
            }
            String str3 = valueOf;
            Color forTheme = ThemablesKt.forTheme(accountAvatarViewModel.backgroundColor, gapComposer);
            if (forTheme == null) {
                gapComposer.startReplaceGroup(-996793800);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors.semantic.background.standard;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-996796156);
                gapComposer.end(false);
                j = forTheme.value;
            }
            long j2 = j;
            String str4 = accountAvatarViewModel.photoUrl;
            TextViewKt.m3613AvatarB_rZmmc(avatarSize, str3, j2, accountAvatarViewModel.accessibilityText, (Modifier) null, (AvatarImage) (str4 != null ? new AvatarImage.Remote.Image(str4, false, null, 0L, new AccountAvatarKt$$ExternalSyntheticLambda1(23), 62) : null), (Function2) null, (AvatarOverlay) null, false, 0L, (Composer) gapComposer, 6, 0, 2000);
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion2, 20.0f));
            BadgeNameKt.m3726BadgeName6ERogkM(str, badge, null, 0, gapComposer, (i2 >> 3) & 14, 28);
            if (str2 == null) {
                gapComposer.startReplaceGroup(-835496657);
                gapComposer.end(false);
                companion = companion2;
            } else {
                gapComposer.startReplaceGroup(-835496656);
                companion = companion2;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer, (Modifier) null, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyMedium, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                gapComposer.end(false);
            }
            re$$ExternalSyntheticOutline0.m(companion, 32.0f, gapComposer, true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DismissableToastKt$$ExternalSyntheticLambda4(accountAvatarViewModel, i, str, str2, profileHeaderViewModel, 7);
        }
    }

    public static final void ProfileDocuments(AccountDocumentsViewModel accountDocumentsViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1682182577);
        int i2 = (gapComposer.changedInstance(accountDocumentsViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1546479558, new MenuPickerSheetKt$$ExternalSyntheticLambda4(accountDocumentsViewModel, function1), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Yoga$$ExternalSyntheticLambda7((Object) accountDocumentsViewModel, function1, (Object) modifier2, i, 21);
        }
    }

    public static final void ProfileQrAvatar(AccountAvatarViewModel accountAvatarViewModel, Modifier modifier, Composer composer, int i) {
        long j;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(569906641);
        int i2 = i | (gapComposer.changedInstance(accountAvatarViewModel) ? 4 : 2) | (gapComposer.changed(modifier) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            AvatarSizeOverride avatarSizeOverride = new AvatarSizeOverride(90.0f, 45.0f, 56, Room.getSp(45));
            Character ch = accountAvatarViewModel.monogram;
            String valueOf = ch != null ? String.valueOf(ch.charValue()) : null;
            if (valueOf == null) {
                valueOf = "";
            }
            Color forTheme = ThemablesKt.forTheme(accountAvatarViewModel.backgroundColor, gapComposer);
            if (forTheme == null) {
                gapComposer.startReplaceGroup(-2075520199);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors.semantic.background.standard;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-2075522555);
                gapComposer.end(false);
                j = forTheme.value;
            }
            String str = accountAvatarViewModel.photoUrl;
            AvatarImage.Remote.Image image = str != null ? new AvatarImage.Remote.Image(str, false, null, 0L, new AccountAvatarKt$$ExternalSyntheticLambda1(13), 62) : null;
            Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors2 == null) {
                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            TextViewKt.m3615AvatarB_rZmmc(avatarSizeOverride, valueOf, j, (String) null, modifier, (AvatarImage) image, (AvatarOverlay) null, false, colors2.semantic.border.standard, false, (Composer) gapComposer, ((i2 << 9) & 57344) | 3078, 0, 1472);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MenuPickerSheetKt$$ExternalSyntheticLambda4(accountAvatarViewModel, modifier, i, 14);
        }
    }

    public static final void QrCode(Bitmap bitmap, AccountAvatarViewModel accountAvatarViewModel, boolean z, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-543824470);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(bitmap) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(accountAvatarViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            ArcadeThemeKt.ArcadeTheme(ColorsLightKt.colorsLight, null, null, Expect_jvmKt.rememberComposableLambda(458905205, new LocalHomeViewKt$$ExternalSyntheticLambda0(function1, z, bitmap, accountAvatarViewModel), gapComposer), gapComposer, 3072, 6);
            modifier2 = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerKt$$ExternalSyntheticLambda17(bitmap, accountAvatarViewModel, z, function1, modifier2, i);
        }
    }

    public static final void QrCodeError(int i, Composer composer, Modifier modifier, Function0 function0) {
        Function0 function02;
        GapComposer gapComposer;
        Modifier modifier2;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1392955706);
        int i2 = i | (gapComposer2.changedInstance(function0) ? 4 : 2) | 48;
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Center, Alignment.Companion.CenterHorizontally, gapComposer2, 54);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, fillMaxSize);
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
            gapComposer = gapComposer2;
            Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3834, 0L, (Composer) gapComposer, (Modifier) null, ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).labelMedium, (TextLineBalancing) null, Room.stringResource(gapComposer2, R.string.qr_code_error_message), (Map) null, (Function1) null, false);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            coil3.size.SizeKt.ButtonCompact(function0, null, null, false, false, null, f104lambda$1807757544, gapComposer, (i2 & 14) | 1572864, 62);
            function02 = function0;
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            function02 = function0;
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ComposerKt$$ExternalSyntheticLambda14(function02, modifier2, i, 2);
        }
    }

    public static final void QrModeToggle(int i, Composer composer, Modifier modifier, Function0 function0) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1368184590);
        int i2 = (gapComposer.changedInstance(function0) ? 4 : 2) | i;
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(modifier, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            boolean z = (i2 & 14) == 4;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new LocalMapKt$$ExternalSyntheticLambda10(12, function0);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function1 function1 = (Function1) rememberedValue;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new MarkerKt$$ExternalSyntheticLambda2(20);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            ModalKt.SegmentedControl(0, function1, m300paddingVpY3zN4$default, (Function1) rememberedValue2, gapComposer, 3078, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ComposerKt$$ExternalSyntheticLambda14(function0, modifier, i, i3);
        }
    }

    public static final void SwitchBusinessProfile(int i, Composer composer, Modifier modifier, String str, Function1 function1) {
        Modifier modifier2;
        Modifier wrapContentHeight;
        str.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(409583926);
        int i2 = i | 48 | (gapComposer.changed(str) ? 2048 : 1024) | (gapComposer.changedInstance(function1) ? 16384 : PKIFailureInfo.certRevoked);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9361) != 9360)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), 20.0f));
            wrapContentHeight = SizeKt.wrapContentHeight(SizeKt.fillMaxWidth(companion, 1.0f), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(ImageKt.m177backgroundbw27NRU(wrapContentHeight, colors.semantic.background.standard, ColorKt.RectangleShape), 16.0f, 20.0f);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
            }
            MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue;
            RippleNodeFactory m3400rippleYJYuY3k = RippleKt.m3400rippleYJYuY3k(0L, true, RecyclerView.DECELERATION_RATE, null, gapComposer, 48, 13);
            boolean z = (57344 & i2) == 16384;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new AccountToDoKt$$ExternalSyntheticLambda0(16, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Modifier m182clickableO2vRcR0$default = ImageKt.m182clickableO2vRcR0$default(m299paddingVpY3zN4, mutableInteractionSourceImpl, m3400rippleYJYuY3k, false, null, null, (Function0) rememberedValue2, 28);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Color forTheme = ThemablesKt.forTheme(ColorModel.CashGreen.INSTANCE, gapComposer);
            if (forTheme == null) {
                a$$ExternalSyntheticBUOutline0.m$3("CashGreen should always resolve.");
                return;
            }
            Room.m1165Text25TpFw(0, 0, 0, 3, ((i2 >> 9) & 14) | 48, 0, 3824, forTheme.value, (Composer) gapComposer, SizeKt.fillMaxWidth(companion, 1.0f), ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelMedium, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            gapComposer = gapComposer;
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CheckoutTipSectionKt$$ExternalSyntheticLambda13(i, 1, modifier2, str, function1);
        }
    }

    /* renamed from: ToDo-WMdw5o4, reason: not valid java name */
    public static final void m2970ToDoWMdw5o4(int i, int i2, long j, long j2, Composer composer, Modifier modifier, Icons icons, String str, String str2, Function0 function0) {
        int i3;
        long j3;
        int i4;
        GapComposer gapComposer;
        Modifier modifier2;
        long j4;
        long j5;
        long j6;
        Modifier modifier3;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1785398673);
        if ((i & 6) == 0) {
            i3 = i | (gapComposer2.changed(icons.ordinal()) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i5 = i3 | (gapComposer2.changed(str) ? 32 : 16) | (gapComposer2.changed(str2) ? 256 : 128) | (gapComposer2.changedInstance(function0) ? 2048 : 1024);
        int i6 = i5 | 24576;
        int i7 = i2 & 32;
        if (i7 != 0) {
            i4 = i5 | 221184;
            j3 = j;
        } else {
            j3 = j;
            i4 = (gapComposer2.changed(j3) ? PKIFailureInfo.unsupportedVersion : 65536) | i6;
        }
        long j7 = j2;
        int i8 = i4 | (((i2 & 64) == 0 && gapComposer2.changed(j7)) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted);
        if (gapComposer2.shouldExecute(i8 & 1, (599187 & i8) != 599186)) {
            gapComposer2.startDefaults();
            if ((i & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                long j8 = i7 != 0 ? Color.Unspecified : j3;
                int i9 = i2 & 64;
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                if (i9 != 0) {
                    Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    j7 = colors.semantic.background.brand;
                    i8 &= -3670017;
                }
                j6 = j8;
                modifier3 = companion;
            } else {
                gapComposer2.skipToGroupEnd();
                if ((i2 & 64) != 0) {
                    i8 &= -3670017;
                }
                modifier3 = modifier;
                j6 = j3;
            }
            long j9 = j7;
            gapComposer2.endDefaults();
            gapComposer = gapComposer2;
            CellDefaultKt.m3392CellDefaultLargeIconygcbOzY(Expect_jvmKt.rememberComposableLambda(-2143757773, new AccountToDoKt$$ExternalSyntheticLambda8(0, j9, j6, icons), gapComposer2), Expect_jvmKt.rememberComposableLambda(1448613684, new ToastKt$$ExternalSyntheticLambda1(str, 6), gapComposer2), modifier3, function0, null, false, true, Expect_jvmKt.rememberComposableLambda(1528005946, new ToastKt$$ExternalSyntheticLambda1(str2, 5), gapComposer2), null, CellDefaultAccessory.Push.INSTANCE, 0L, null, gapComposer, 819462582 | (i8 & 7168), 0, 3376);
            modifier2 = modifier3;
            j4 = j6;
            j5 = j9;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
            j4 = j3;
            j5 = j7;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AccountToDoKt$$ExternalSyntheticLambda11(icons, str, str2, function0, modifier2, j4, j5, i, i2);
        }
    }
}
