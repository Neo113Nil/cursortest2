package _COROUTINE;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.concurrent.futures.CallbackToFutureAdapter$Resolver;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.address.typeahead.backend.real.RealGooglePlacesClient;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.google.pay.GooglePayPresenter$$ExternalSyntheticLambda0;
import com.squareup.cash.google.pay.RealGooglePayer$$ExternalSyntheticLambda0;
import com.squareup.cash.instruments.views.InstrumentCellKt$$ExternalSyntheticLambda11;
import com.squareup.cash.investingcrypto.viewmodels.news.InvestingCryptoNewsArticleViewModel;
import com.squareup.cash.money.views.MoneyTabSectionUIKt$$ExternalSyntheticLambda6;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.util.Strings;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt__StringNumberConversionsJVMKt;
import kotlin.text.StringsKt___StringsKt;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import type.JsonLogicList;
import utils.AnyUtilsKt;

/* loaded from: classes3.dex */
public abstract class ArtificialStackFrames implements CallbackToFutureAdapter$Resolver {
    public static final void HeaderInfo(InvestingCryptoNewsArticleViewModel investingCryptoNewsArticleViewModel, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1137731341);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = i | (gapComposer.changedInstance(investingCryptoNewsArticleViewModel) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
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
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, companion);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            TextViewKt.Avatar(AvatarSize.Size48, new AvatarEntry(String.valueOf(StringsKt___StringsKt.first(investingCryptoNewsArticleViewModel.provider)), Strings.getColors(gapComposer).semantic.icon.extraSubtle, null, new AvatarImage.Remote.Image(ThemablesKt.urlForTheme(investingCryptoNewsArticleViewModel.avatar, gapComposer), false, null, 0L, new InstrumentCellKt$$ExternalSyntheticLambda11(25), 62), null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE), null, false, gapComposer, 6, 28);
            gapComposer.end(true);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
            String str = investingCryptoNewsArticleViewModel.provider;
            TextStyle textStyle = Strings.getTypography(gapComposer).labelMedium;
            long j = Strings.getColors(gapComposer).semantic.text.standard;
            gapComposer = gapComposer;
            Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4018, j, (Composer) gapComposer, (Modifier) null, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            String str2 = investingCryptoNewsArticleViewModel.timestamp;
            if (str2 == null) {
                gapComposer.startReplaceGroup(-1637584829);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1637584828);
                String lowerCase = str2.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4018, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodySmall, (TextLineBalancing) null, lowerCase, (Map) null, (Function1) null, false);
                gapComposer.end(false);
            }
            gapComposer.end(true);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new GooglePayPresenter$$ExternalSyntheticLambda0(investingCryptoNewsArticleViewModel, modifier2, i, 26);
        }
    }

    public static final void InvestingCryptoNewsArticleOutline(InvestingCryptoNewsArticleViewModel investingCryptoNewsArticleViewModel, Function0 function0, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        investingCryptoNewsArticleViewModel.getClass();
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1443771957);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changedInstance(investingCryptoNewsArticleViewModel) ? 4 : 2) | (gapComposer.changedInstance(function0) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Strings.getSizes(gapComposer).getClass();
            Object obj = DefaultSizes.border.entries;
            RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(ClipKt.clip(OffsetKt.height(SizeKt.m290width3ABfNKs(companion, 264.0f), IntrinsicSize.Max), m340RoundedCornerShape0680j_4), Strings.getColors(gapComposer).semantic.background.f1047app, ColorKt.RectangleShape);
            Strings.getSizes(gapComposer).getClass();
            Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(ImageKt.m178borderxT4_qwU(m177backgroundbw27NRU, 1.0f, Strings.getColors(gapComposer).semantic.border.subtle, m340RoundedCornerShape0680j_4), false, null, null, function0, 15);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(m183clickableoSLSa3U$default, 16.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m298padding3ABfNKs);
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
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, companion);
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
            HeaderInfo(investingCryptoNewsArticleViewModel, null, gapComposer, i2 & 14);
            Strings.getSizes(gapComposer).getClass();
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 16.0f));
            Room.m1165Text25TpFw(0, 3, 3, 0, 14155776, 0, 3888, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, SizeKt.m277height3ABfNKs(companion, ((Density) gapComposer.consume(CompositionLocalsKt.LocalDensity)).mo231toDpGaN1DYA(Strings.getTypography(gapComposer).bodyMedium.paragraphStyle.lineHeight) * 3.0f), Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, investingCryptoNewsArticleViewModel.headline, (Map) null, (Function1) null, false);
            gapComposer.end(true);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MoneyTabSectionUIKt$$ExternalSyntheticLambda6(i, 15, modifier2, investingCryptoNewsArticleViewModel, function0);
        }
    }

    public static void coroutineBoundary() {
        StackTraceElement stackTraceElement = new Exception().getStackTrace()[0];
        new StackTraceElement("_COROUTINE._BOUNDARY", "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }

    public static RealGooglePlacesClient create(Context context, RealGooglePayer$$ExternalSyntheticLambda0 realGooglePayer$$ExternalSyntheticLambda0) {
        String packageName = context.getPackageName();
        ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(packageName, 128);
        applicationInfo.getClass();
        String string2 = applicationInfo.metaData.getString("com.google.android.geo.API_KEY");
        if (string2 != null) {
            return new RealGooglePlacesClient(context, string2, realGooglePayer$$ExternalSyntheticLambda0);
        }
        Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Google Places API key not found in ", packageName, " Manifest."));
        return null;
    }

    public static ArrayList unwrapValue(Object obj) {
        Double valueOf;
        JsonLogicList asList = AnyUtilsKt.getAsList(obj);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(asList, 10));
        Iterator it = asList.items.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            while (true) {
                if (!(next instanceof Number)) {
                    if (!(next instanceof String)) {
                        if (!(next instanceof List)) {
                            valueOf = null;
                            break;
                        }
                        next = CollectionsKt.firstOrNull((List<? extends Object>) next);
                    } else {
                        valueOf = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull((String) next);
                        break;
                    }
                } else {
                    valueOf = Double.valueOf(((Number) next).doubleValue());
                    break;
                }
            }
            arrayList.add(valueOf);
        }
        return arrayList;
    }
}
