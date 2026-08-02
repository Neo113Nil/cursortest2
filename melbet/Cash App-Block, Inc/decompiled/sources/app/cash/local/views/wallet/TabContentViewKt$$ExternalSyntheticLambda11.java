package app.cash.local.views.wallet;

import androidx.biometric.KeyguardUtils;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.GestureNodeKt$$ExternalSyntheticLambda0;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.local.views.brand.checkout.LocalBrandLocationCheckoutViewKt;
import app.cash.local.views.map.BrandSheetViewKt$$ExternalSyntheticLambda0;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.AsyncImagePainter;
import coil3.compose.RealSubcomposeAsyncImageScope;
import com.google.android.gms.internal.mlkit_vision_barcode.zzuv;
import com.squareup.cash.account.components.AccountToDoKt$$ExternalSyntheticLambda0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.InlineMessageButtonScope;
import com.squareup.cash.arcade.components.ModalButtonScope;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.components.titlebar.TitleBarActionScope;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.banking.views.BalanceHomeViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.banking.views.BalanceHomeViewKt$$ExternalSyntheticLambda12;
import com.squareup.cash.benefits.views.BenefitsHomeViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.bitcoin.views.map.BitcoinMapViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.bitcoin.views.paidinbitcoin.PainInBitcoinUpsellViewKt;
import com.squareup.cash.blockers.views.AtmPickerAmountBlockerKt$$ExternalSyntheticLambda3;
import com.squareup.cash.blockers.views.CashtagViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.blockers.views.ConfirmableOptionView;
import com.squareup.cash.blockers.views.SetPinViewKt$$ExternalSyntheticLambda7;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda12;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda2;
import com.squareup.cash.checks.VerifyCheckDialogView;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.composeUi.foundation.text.MarkdownSpanValues;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda4;
import com.squareup.cash.globalsearch.views.GlobalSearchFeedKt$$ExternalSyntheticLambda17;
import com.squareup.cash.initialscreenloader.views.AppUpgradeViewKt$$ExternalSyntheticLambda7;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.money.views.MoneyTabToolbarKt$$ExternalSyntheticLambda1;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.nfc.views.NfcNotAvailableKt$$ExternalSyntheticLambda0;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda13;
import com.squareup.cash.paymentpad.views.HomeViewKt$$ExternalSyntheticLambda8;
import com.squareup.cash.payments.views.WarningDialogViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda8;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda8;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.StateFlow;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public final /* synthetic */ class TabContentViewKt$$ExternalSyntheticLambda11 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ TabContentViewKt$$ExternalSyntheticLambda11(String str, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$1 = str;
        this.f$0 = function1;
    }

    private final Object invoke$com$squareup$cash$initialscreenloader$views$AppUpgradeViewKt$$ExternalSyntheticLambda6(Object obj, Object obj2, Object obj3) {
        ModalButtonScope modalButtonScope = (ModalButtonScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        modalButtonScope.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(modalButtonScope) ? 4 : 2;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            String str = this.f$1;
            if (str != null) {
                gapComposer.startReplaceGroup(1347209582);
                Function1 function1 = this.f$0;
                boolean changed = gapComposer.changed(function1);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new AppUpgradeViewKt$$ExternalSyntheticLambda7(0, function1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                modalButtonScope.PrimaryModalButton((Function0) rememberedValue, null, false, Expect_jvmKt.rememberComposableLambda(1828870662, new GlobalSearchFeedKt$$ExternalSyntheticLambda17(str, 28), gapComposer), gapComposer, ((intValue << 12) & 57344) | 3072, 6);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1347299916);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$limits$views$arcade$LimitsInlineMessageKt$$ExternalSyntheticLambda3(Object obj, Object obj2, Object obj3) {
        InlineMessageButtonScope inlineMessageButtonScope = (InlineMessageButtonScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        inlineMessageButtonScope.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(inlineMessageButtonScope) ? 4 : 2;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            Function1 function1 = this.f$0;
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new CashMapViewKt$$ExternalSyntheticLambda4(2, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            inlineMessageButtonScope.SecondaryButton(((intValue << 12) & 57344) | 3072, gapComposer, Expect_jvmKt.rememberComposableLambda(-951220542, new MoneyTabToolbarKt$$ExternalSyntheticLambda1(this.f$1, 8), gapComposer), null, (Function0) rememberedValue, false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$offers$views$details$OfferDetailsSheetKt$$ExternalSyntheticLambda2(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((ColumnScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            Function1 function1 = this.f$0;
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new NfcNotAvailableKt$$ExternalSyntheticLambda0(23, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            LazyDslKt.m304MarkdownTextpCuZGqc(this.f$1, (Function2) rememberedValue, null, null, 0L, null, null, null, 0, 0, 0, gapComposer, 0, 2044);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$p2pblocking$views$SelectCustomerViewKt$$ExternalSyntheticLambda2(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((AdaptiveStackScope) obj).getClass();
        int i = 16;
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            Function1 function1 = this.f$0;
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new P2PListViewKt$$ExternalSyntheticLambda0(25, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, fillMaxWidth, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(416285666, new MoneyTabToolbarKt$$ExternalSyntheticLambda1(this.f$1, i), gapComposer), gapComposer, 1573296, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$payments$views$ConfirmDuplicateDialogKt$$ExternalSyntheticLambda5(Object obj, Object obj2, Object obj3) {
        ModalButtonScope modalButtonScope = (ModalButtonScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        modalButtonScope.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(modalButtonScope) ? 4 : 2;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            Function1 function1 = this.f$0;
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new HomeViewKt$$ExternalSyntheticLambda8(12, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            modalButtonScope.SecondaryModalButton((Function0) rememberedValue, null, false, Expect_jvmKt.rememberComposableLambda(-250655861, new MoneyTabToolbarKt$$ExternalSyntheticLambda1(this.f$1, 26), gapComposer), gapComposer, (57344 & (intValue << 12)) | 3072, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$payments$views$composer$ReviewPaymentKt$$ExternalSyntheticLambda15(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((ColumnScope) obj).getClass();
        boolean z = false;
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            String str = this.f$1;
            if (StringsKt.contains((CharSequence) str, (CharSequence) "](", false)) {
                gapComposer.startReplaceGroup(1000697349);
                Function1 function1 = this.f$0;
                boolean changed = gapComposer.changed(function1);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new ScoreHomeKt$$ExternalSyntheticLambda8(function1, z, 5);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                LazyDslKt.m304MarkdownTextpCuZGqc(str, (Function2) rememberedValue, null, null, 0L, null, null, null, 0, 0, 0, gapComposer, 0, 2044);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1000892494);
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$payments$views$nearby$NearbyPayRequestViewKt$$ExternalSyntheticLambda13(Object obj, Object obj2, Object obj3) {
        AdaptiveStackScope adaptiveStackScope = (AdaptiveStackScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        adaptiveStackScope.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(adaptiveStackScope) ? 4 : 2;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
            Modifier horizontalWeight = adaptiveStackScope.horizontalWeight(Modifier.Companion.$$INSTANCE, 1.0f);
            Function1 function1 = this.f$0;
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new WarningDialogViewKt$$ExternalSyntheticLambda5(29, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, horizontalWeight, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(-1086601414, new SheetKt$$ExternalSyntheticLambda8(this.f$1, 6), gapComposer), gapComposer, 1573248, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$prepurchasecashcard$views$PrepurchasePlanningSheetHomeKt$$ExternalSyntheticLambda3(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((ColumnScope) obj).getClass();
        boolean z = false;
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            Function1 function1 = this.f$0;
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ScoreHomeKt$$ExternalSyntheticLambda8(function1, z, 12);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            LazyDslKt.m304MarkdownTextpCuZGqc(this.f$1, (Function2) rememberedValue, null, null, 0L, null, null, null, 0, 0, 5, gapComposer, 0, IptcConstants.IMAGE_RESOURCE_BLOCK_OBSOLETE_PHOTOSHOP_TAG1);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        int i2;
        int i3 = this.$r8$classId;
        int i4 = 3;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        int i5 = 16;
        int i6 = 12;
        int i7 = 18;
        String str = this.f$1;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Function1 function1 = this.f$0;
        switch (i3) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    Modifier clip = ClipKt.clip(SizeKt.m285size3ABfNKs(companion, 28.0f), RoundedCornerShapeKt.CircleShape);
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new BrandSheetViewKt$$ExternalSyntheticLambda0(23, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Trace.m1191Iconww6aTOc(Icons.NavigationDiscover, this.f$1, ImageKt.m183clickableoSLSa3U$default(clip, false, null, null, PlatformKt.withHaptics((Function0) rememberedValue, null, gapComposer, 0, 1), 15), 0L, gapComposer, 6, 8);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    TextStyle textStyle = ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
                    boolean changed2 = gapComposer2.changed(function1);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new GestureNodeKt$$ExternalSyntheticLambda0(15, function1);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    AnnotatedString createHtmlAnnotatedString = zzuv.createHtmlAnnotatedString(str, textStyle, (Function1) rememberedValue2, gapComposer2);
                    if (StringsKt.isBlank(createHtmlAnnotatedString.text)) {
                        gapComposer2.startReplaceGroup(-30606429);
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(-30881275);
                        ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
                        int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, companion);
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
                        ModalKt.HorizontalDivider(0, 1, gapComposer2, null);
                        LocalBrandLocationCheckoutViewKt.StorePolicies(LocalBrandLocationCheckoutViewKt.SectionItemModifier, createHtmlAnnotatedString, gapComposer2, 6);
                        gapComposer2.end(true);
                        gapComposer2.end(false);
                    }
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((TitleBarActionScope) obj).getClass();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(1 & intValue3, (intValue3 & 17) != 16)) {
                    Role role = new Role(0);
                    boolean changed3 = gapComposer3.changed(function1);
                    Object rememberedValue3 = gapComposer3.rememberedValue();
                    if (changed3 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new AccountToDoKt$$ExternalSyntheticLambda0(20, function1);
                        gapComposer3.updateRememberedValue(rememberedValue3);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4092, 0L, (Composer) gapComposer3, SpacerKt.m302paddingqDBjuR0$default(ImageKt.m183clickableoSLSa3U$default(Modifier.Companion.$$INSTANCE, false, null, role, (Function0) rememberedValue3, 11), RecyclerView.DECELERATION_RATE, 12.0f, 12.0f, RecyclerView.DECELERATION_RATE, 9), (TextStyle) null, (TextLineBalancing) null, this.f$1, (Map) null, (Function1) null, false);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                ModalButtonScope modalButtonScope = (ModalButtonScope) obj;
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                modalButtonScope.getClass();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((GapComposer) composer4).changed(modalButtonScope) ? 4 : 2;
                }
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 19) != 18)) {
                    boolean changed4 = gapComposer4.changed(function1);
                    Object rememberedValue4 = gapComposer4.rememberedValue();
                    if (changed4 || rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new BalanceHomeViewKt$$ExternalSyntheticLambda1(15, function1);
                        gapComposer4.updateRememberedValue(rememberedValue4);
                    }
                    modalButtonScope.PrimaryModalButton((Function0) rememberedValue4, null, false, Expect_jvmKt.rememberComposableLambda(775416682, new LocalHomeViewKt$$ExternalSyntheticLambda1(str, i7), gapComposer4), gapComposer4, ((intValue4 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                ModalButtonScope modalButtonScope2 = (ModalButtonScope) obj;
                Composer composer5 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                modalButtonScope2.getClass();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((GapComposer) composer5).changed(modalButtonScope2) ? 4 : 2;
                }
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 19) != 18)) {
                    boolean changed5 = gapComposer5.changed(function1);
                    Object rememberedValue5 = gapComposer5.rememberedValue();
                    if (changed5 || rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new BalanceHomeViewKt$$ExternalSyntheticLambda1(16, function1);
                        gapComposer5.updateRememberedValue(rememberedValue5);
                    }
                    modalButtonScope2.SecondaryModalButton((Function0) rememberedValue5, null, false, Expect_jvmKt.rememberComposableLambda(2021056535, new LocalHomeViewKt$$ExternalSyntheticLambda1(str, 19), gapComposer5), gapComposer5, ((intValue5 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                Composer composer6 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(1 & intValue6, (intValue6 & 17) != 16)) {
                    boolean changed6 = gapComposer6.changed(function1);
                    Object rememberedValue6 = gapComposer6.rememberedValue();
                    if (changed6 || rememberedValue6 == neverEqualPolicy) {
                        rememberedValue6 = new BalanceHomeViewKt$$ExternalSyntheticLambda12(function1, r13, i4);
                        gapComposer6.updateRememberedValue(rememberedValue6);
                    }
                    LazyDslKt.m304MarkdownTextpCuZGqc(this.f$1, (Function2) rememberedValue6, null, null, 0L, null, null, null, 0, 0, 0, gapComposer6, 0, 2044);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                InlineMessageButtonScope inlineMessageButtonScope = (InlineMessageButtonScope) obj;
                Composer composer7 = (Composer) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                inlineMessageButtonScope.getClass();
                if ((intValue7 & 6) == 0) {
                    intValue7 |= ((GapComposer) composer7).changed(inlineMessageButtonScope) ? 4 : 2;
                }
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 19) != 18)) {
                    boolean changed7 = gapComposer7.changed(function1);
                    Object rememberedValue7 = gapComposer7.rememberedValue();
                    if (changed7 || rememberedValue7 == neverEqualPolicy) {
                        i = 21;
                        rememberedValue7 = new BalanceHomeViewKt$$ExternalSyntheticLambda1(21, function1);
                        gapComposer7.updateRememberedValue(rememberedValue7);
                    } else {
                        i = 21;
                    }
                    inlineMessageButtonScope.SecondaryButton(((intValue7 << 12) & 57344) | 3072, gapComposer7, Expect_jvmKt.rememberComposableLambda(1789866409, new LocalHomeViewKt$$ExternalSyntheticLambda1(str, i), gapComposer7), null, (Function0) rememberedValue7, false);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                InlineMessageButtonScope inlineMessageButtonScope2 = (InlineMessageButtonScope) obj;
                Composer composer8 = (Composer) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                inlineMessageButtonScope2.getClass();
                if ((intValue8 & 6) == 0) {
                    intValue8 |= ((GapComposer) composer8).changed(inlineMessageButtonScope2) ? 4 : 2;
                }
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 19) != 18)) {
                    boolean changed8 = gapComposer8.changed(function1);
                    Object rememberedValue8 = gapComposer8.rememberedValue();
                    if (changed8 || rememberedValue8 == neverEqualPolicy) {
                        i2 = 20;
                        rememberedValue8 = new BalanceHomeViewKt$$ExternalSyntheticLambda1(20, function1);
                        gapComposer8.updateRememberedValue(rememberedValue8);
                    } else {
                        i2 = 20;
                    }
                    inlineMessageButtonScope2.PrimaryButton(((intValue8 << 12) & 57344) | 3072, 2, gapComposer8, Expect_jvmKt.rememberComposableLambda(-1714237141, new LocalHomeViewKt$$ExternalSyntheticLambda1(str, i2), gapComposer8), null, (Function0) rememberedValue8, !StringsKt.isBlank(str));
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                ModalButtonScope modalButtonScope3 = (ModalButtonScope) obj;
                Composer composer9 = (Composer) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                modalButtonScope3.getClass();
                if ((intValue9 & 6) == 0) {
                    intValue9 |= ((GapComposer) composer9).changed(modalButtonScope3) ? 4 : 2;
                }
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 19) != 18)) {
                    boolean changed9 = gapComposer9.changed(function1);
                    Object rememberedValue9 = gapComposer9.rememberedValue();
                    if (changed9 || rememberedValue9 == neverEqualPolicy) {
                        rememberedValue9 = new BitcoinMapViewKt$$ExternalSyntheticLambda6(1, function1);
                        gapComposer9.updateRememberedValue(rememberedValue9);
                    }
                    modalButtonScope3.SecondaryModalButton((Function0) rememberedValue9, null, false, Expect_jvmKt.rememberComposableLambda(2126374240, new BenefitsHomeViewKt$$ExternalSyntheticLambda5(str, 21), gapComposer9), gapComposer9, ((intValue9 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                Composer composer10 = (Composer) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 17) != 16)) {
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean changed10 = gapComposer10.changed(function1);
                    Object rememberedValue10 = gapComposer10.rememberedValue();
                    if (changed10 || rememberedValue10 == neverEqualPolicy) {
                        rememberedValue10 = new BitcoinMapViewKt$$ExternalSyntheticLambda6(8, function1);
                        gapComposer10.updateRememberedValue(rememberedValue10);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue10, fillMaxWidth, null, false, false, null, PainInBitcoinUpsellViewKt.f270lambda$803991023, gapComposer10, 1572912, 60);
                    ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean changed11 = gapComposer10.changed(function1);
                    Object rememberedValue11 = gapComposer10.rememberedValue();
                    if (changed11 || rememberedValue11 == neverEqualPolicy) {
                        rememberedValue11 = new BitcoinMapViewKt$$ExternalSyntheticLambda6(9, function1);
                        gapComposer10.updateRememberedValue(rememberedValue11);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue11, fillMaxWidth2, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(1364313082, new BenefitsHomeViewKt$$ExternalSyntheticLambda5(str, 22), gapComposer10), gapComposer10, 1573296, 56);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                ModalButtonScope modalButtonScope4 = (ModalButtonScope) obj;
                Composer composer11 = (Composer) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                modalButtonScope4.getClass();
                if ((intValue11 & 6) == 0) {
                    intValue11 |= ((GapComposer) composer11).changed(modalButtonScope4) ? 4 : 2;
                }
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (!gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 19) != 18)) {
                    gapComposer11.skipToGroupEnd();
                } else if (str != null) {
                    gapComposer11.startReplaceGroup(-553803918);
                    boolean changed12 = gapComposer11.changed(function1);
                    Object rememberedValue12 = gapComposer11.rememberedValue();
                    if (changed12 || rememberedValue12 == neverEqualPolicy) {
                        rememberedValue12 = new AtmPickerAmountBlockerKt$$ExternalSyntheticLambda3(10, function1);
                        gapComposer11.updateRememberedValue(rememberedValue12);
                    }
                    modalButtonScope4.PrimaryModalButton((Function0) rememberedValue12, null, false, Expect_jvmKt.rememberComposableLambda(4871760, new BenefitsHomeViewKt$$ExternalSyntheticLambda5(str, 26), gapComposer11), gapComposer11, ((intValue11 << 12) & 57344) | 3072, 6);
                    gapComposer11.end(false);
                } else {
                    gapComposer11.startReplaceGroup(-553665534);
                    gapComposer11.end(false);
                }
                return Unit.INSTANCE;
            case 11:
                ModalButtonScope modalButtonScope5 = (ModalButtonScope) obj;
                Composer composer12 = (Composer) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                modalButtonScope5.getClass();
                if ((intValue12 & 6) == 0) {
                    intValue12 |= ((GapComposer) composer12).changed(modalButtonScope5) ? 4 : 2;
                }
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (!gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 19) != 18)) {
                    gapComposer12.skipToGroupEnd();
                } else if (str != null) {
                    gapComposer12.startReplaceGroup(-1822471920);
                    boolean changed13 = gapComposer12.changed(function1);
                    Object rememberedValue13 = gapComposer12.rememberedValue();
                    if (changed13 || rememberedValue13 == neverEqualPolicy) {
                        rememberedValue13 = new AtmPickerAmountBlockerKt$$ExternalSyntheticLambda3(11, function1);
                        gapComposer12.updateRememberedValue(rememberedValue13);
                    }
                    modalButtonScope5.SecondaryModalButton((Function0) rememberedValue13, null, false, Expect_jvmKt.rememberComposableLambda(-1031683587, new BenefitsHomeViewKt$$ExternalSyntheticLambda5(str, 27), gapComposer12), gapComposer12, ((intValue12 << 12) & 57344) | 3072, 6);
                    gapComposer12.end(false);
                } else {
                    gapComposer12.startReplaceGroup(-1822330653);
                    gapComposer12.end(false);
                }
                return Unit.INSTANCE;
            case 12:
                ModalButtonScope modalButtonScope6 = (ModalButtonScope) obj;
                Composer composer13 = (Composer) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                int i8 = ConfirmableOptionView.$r8$clinit;
                modalButtonScope6.getClass();
                if ((intValue13 & 6) == 0) {
                    intValue13 |= ((GapComposer) composer13).changed(modalButtonScope6) ? 4 : 2;
                }
                GapComposer gapComposer13 = (GapComposer) composer13;
                if (gapComposer13.shouldExecute(intValue13 & 1, (intValue13 & 19) != 18)) {
                    boolean changed14 = gapComposer13.changed(function1);
                    Object rememberedValue14 = gapComposer13.rememberedValue();
                    if (changed14 || rememberedValue14 == neverEqualPolicy) {
                        rememberedValue14 = new CashtagViewKt$$ExternalSyntheticLambda6(5, function1);
                        gapComposer13.updateRememberedValue(rememberedValue14);
                    }
                    modalButtonScope6.SecondaryModalButton((Function0) rememberedValue14, null, false, Expect_jvmKt.rememberComposableLambda(-2117166661, new SetPinViewKt$$ExternalSyntheticLambda7(str, 7), gapComposer13), gapComposer13, ((intValue13 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                Composer composer14 = (Composer) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer14 = (GapComposer) composer14;
                if (gapComposer14.shouldExecute(1 & intValue14, (intValue14 & 17) != 16)) {
                    String str2 = this.f$1;
                    if (str2 == null) {
                        gapComposer14.startReplaceGroup(650525348);
                        gapComposer14.end(false);
                    } else {
                        gapComposer14.startReplaceGroup(650525349);
                        boolean changed15 = gapComposer14.changed(function1);
                        Object rememberedValue15 = gapComposer14.rememberedValue();
                        if (changed15 || rememberedValue15 == neverEqualPolicy) {
                            rememberedValue15 = new SsnViewKt$$ExternalSyntheticLambda12(i4, function1);
                            gapComposer14.updateRememberedValue(rememberedValue15);
                        }
                        Function2 function2 = (Function2) rememberedValue15;
                        SpanStyle spanStyle = ((Typography) gapComposer14.consume(ArcadeThemeKt.LocalTypography)).linkXSmall.spanStyle;
                        Colors colors = (Colors) gapComposer14.consume(ArcadeThemeKt.LocalColors);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer14, -1762997026, gapComposer14, false);
                        } else {
                            gapComposer14.startReplaceGroup(-1762997739);
                            gapComposer14.end(false);
                        }
                        LazyDslKt.m304MarkdownTextpCuZGqc(str2, function2, null, null, 0L, new MarkdownSpanValues(SpanStyle.m973copyGSF8kmg$default(spanStyle, colors.semantic.text.link, null, 0L, JpegConstants.COM_MARKER), 2), null, null, 0, 0, 0, gapComposer14, 0, 2012);
                        gapComposer14.end(false);
                    }
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                Composer composer15 = (Composer) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer15 = (GapComposer) composer15;
                if (gapComposer15.shouldExecute(intValue15 & 1, (intValue15 & 17) != 16)) {
                    boolean changed16 = gapComposer15.changed(function1);
                    Object rememberedValue16 = gapComposer15.rememberedValue();
                    if (changed16 || rememberedValue16 == neverEqualPolicy) {
                        rememberedValue16 = new SsnViewKt$$ExternalSyntheticLambda12(i6, function1);
                        gapComposer15.updateRememberedValue(rememberedValue16);
                    }
                    LazyDslKt.m304MarkdownTextpCuZGqc(this.f$1, (Function2) rememberedValue16, null, null, 0L, null, null, null, 0, 0, 0, gapComposer15, 0, 2044);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                Composer composer16 = (Composer) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer16 = (GapComposer) composer16;
                if (gapComposer16.shouldExecute(intValue16 & 1, (intValue16 & 17) != 16)) {
                    boolean changed17 = gapComposer16.changed(function1);
                    Object rememberedValue17 = gapComposer16.rememberedValue();
                    if (changed17 || rememberedValue17 == neverEqualPolicy) {
                        rememberedValue17 = new SsnViewKt$$ExternalSyntheticLambda12(13, function1);
                        gapComposer16.updateRememberedValue(rememberedValue17);
                    }
                    LazyDslKt.m304MarkdownTextpCuZGqc(this.f$1, (Function2) rememberedValue17, null, null, 0L, null, null, null, 0, 0, 0, gapComposer16, 0, 2044);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                Composer composer17 = (Composer) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer17 = (GapComposer) composer17;
                if (gapComposer17.shouldExecute(intValue17 & 1, (intValue17 & 17) != 16)) {
                    Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), 24.0f);
                    TextStyle textStyle2 = MooncakeTheme.getTypography(gapComposer17).smallBody;
                    long j = MooncakeTheme.getColors(gapComposer17).secondaryLabel;
                    boolean changed18 = gapComposer17.changed(function1);
                    Object rememberedValue18 = gapComposer17.rememberedValue();
                    if (changed18 || rememberedValue18 == neverEqualPolicy) {
                        rememberedValue18 = new SsnViewKt$$ExternalSyntheticLambda12(i5, function1);
                        gapComposer17.updateRememberedValue(rememberedValue18);
                    }
                    KeyguardUtils.m14MarkdownTextnvClB8o(this.f$1, (Function2) rememberedValue18, m298padding3ABfNKs, textStyle2, j, null, null, 0, 3, null, 0, gapComposer17, MLKEMEngine.KyberPolyBytes, 1760);
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                ModalButtonScope modalButtonScope7 = (ModalButtonScope) obj;
                Composer composer18 = (Composer) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                int i9 = VerifyCheckDialogView.$r8$clinit;
                modalButtonScope7.getClass();
                if ((intValue18 & 6) == 0) {
                    intValue18 |= ((GapComposer) composer18).changed(modalButtonScope7) ? 4 : 2;
                }
                GapComposer gapComposer18 = (GapComposer) composer18;
                if (gapComposer18.shouldExecute(intValue18 & 1, (intValue18 & 19) != 18)) {
                    boolean changed19 = gapComposer18.changed(function1);
                    Object rememberedValue19 = gapComposer18.rememberedValue();
                    if (changed19 || rememberedValue19 == neverEqualPolicy) {
                        rememberedValue19 = new CaptureCheckFaceKt$$ExternalSyntheticLambda2(i5, function1);
                        gapComposer18.updateRememberedValue(rememberedValue19);
                    }
                    modalButtonScope7.SecondaryModalButton((Function0) rememberedValue19, null, false, Expect_jvmKt.rememberComposableLambda(57569659, new SetPinViewKt$$ExternalSyntheticLambda7(str, 23), gapComposer18), gapComposer18, ((intValue18 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer18.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                ModalButtonScope modalButtonScope8 = (ModalButtonScope) obj;
                Composer composer19 = (Composer) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                modalButtonScope8.getClass();
                if ((intValue19 & 6) == 0) {
                    intValue19 |= ((GapComposer) composer19).changed(modalButtonScope8) ? 4 : 2;
                }
                GapComposer gapComposer19 = (GapComposer) composer19;
                if (gapComposer19.shouldExecute(intValue19 & 1, (intValue19 & 19) != 18)) {
                    boolean changed20 = gapComposer19.changed(function1);
                    Object rememberedValue20 = gapComposer19.rememberedValue();
                    if (changed20 || rememberedValue20 == neverEqualPolicy) {
                        rememberedValue20 = new ComposeDialogKt$$ExternalSyntheticLambda4(11, function1);
                        gapComposer19.updateRememberedValue(rememberedValue20);
                    }
                    modalButtonScope8.SecondaryModalButton((Function0) rememberedValue20, null, false, Expect_jvmKt.rememberComposableLambda(-783279770, new SetPinViewKt$$ExternalSyntheticLambda7(str, 29), gapComposer19), gapComposer19, ((intValue19 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer19.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                ModalButtonScope modalButtonScope9 = (ModalButtonScope) obj;
                Composer composer20 = (Composer) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                modalButtonScope9.getClass();
                if ((intValue20 & 6) == 0) {
                    intValue20 |= ((GapComposer) composer20).changed(modalButtonScope9) ? 4 : 2;
                }
                GapComposer gapComposer20 = (GapComposer) composer20;
                if (gapComposer20.shouldExecute(intValue20 & 1, (intValue20 & 19) != 18)) {
                    boolean changed21 = gapComposer20.changed(function1);
                    Object rememberedValue21 = gapComposer20.rememberedValue();
                    if (changed21 || rememberedValue21 == neverEqualPolicy) {
                        rememberedValue21 = new AppUpgradeViewKt$$ExternalSyntheticLambda7(4, function1);
                        gapComposer20.updateRememberedValue(rememberedValue21);
                    }
                    modalButtonScope9.PrimaryModalButton((Function0) rememberedValue21, null, false, Expect_jvmKt.rememberComposableLambda(2000692684, new GlobalSearchFeedKt$$ExternalSyntheticLambda17(str, 25), gapComposer20), gapComposer20, ((intValue20 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer20.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                return invoke$com$squareup$cash$initialscreenloader$views$AppUpgradeViewKt$$ExternalSyntheticLambda6(obj, obj2, obj3);
            case 21:
                return invoke$com$squareup$cash$limits$views$arcade$LimitsInlineMessageKt$$ExternalSyntheticLambda3(obj, obj2, obj3);
            case 22:
                return invoke$com$squareup$cash$offers$views$details$OfferDetailsSheetKt$$ExternalSyntheticLambda2(obj, obj2, obj3);
            case 23:
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                GapComposer gapComposer21 = (GapComposer) ((Composer) obj2);
                Colors colors2 = (Colors) gapComposer21.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer21, -1762997026, gapComposer21, false);
                } else {
                    gapComposer21.startReplaceGroup(-1762997739);
                    gapComposer21.end(false);
                }
                Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(companion, colors2.semantic.background.f1047app, ColorKt.RectangleShape);
                NavigationType navigationType = NavigationType.BACK;
                boolean changed22 = gapComposer21.changed(function1);
                Object rememberedValue22 = gapComposer21.rememberedValue();
                if (changed22 || rememberedValue22 == neverEqualPolicy) {
                    rememberedValue22 = new P2PListViewKt$$ExternalSyntheticLambda0(4, function1);
                    gapComposer21.updateRememberedValue(rememberedValue22);
                }
                DBUtil.TitleBarSub(this.f$1, navigationType, m177backgroundbw27NRU, (DynamicColorConfiguration) null, (Function0) rememberedValue22, (Modifier) null, (Function3) null, gapComposer21, 48, 104);
                return Unit.INSTANCE;
            case 24:
                return invoke$com$squareup$cash$p2pblocking$views$SelectCustomerViewKt$$ExternalSyntheticLambda2(obj, obj2, obj3);
            case 25:
                return invoke$com$squareup$cash$payments$views$ConfirmDuplicateDialogKt$$ExternalSyntheticLambda5(obj, obj2, obj3);
            case 26:
                return invoke$com$squareup$cash$payments$views$composer$ReviewPaymentKt$$ExternalSyntheticLambda15(obj, obj2, obj3);
            case 27:
                return invoke$com$squareup$cash$payments$views$nearby$NearbyPayRequestViewKt$$ExternalSyntheticLambda13(obj, obj2, obj3);
            case 28:
                return invoke$com$squareup$cash$prepurchasecashcard$views$PrepurchasePlanningSheetHomeKt$$ExternalSyntheticLambda3(obj, obj2, obj3);
            default:
                RealSubcomposeAsyncImageScope realSubcomposeAsyncImageScope = (RealSubcomposeAsyncImageScope) obj;
                Composer composer21 = (Composer) obj2;
                int intValue21 = ((Integer) obj3).intValue();
                realSubcomposeAsyncImageScope.getClass();
                AsyncImagePainter asyncImagePainter = realSubcomposeAsyncImageScope.painter;
                if ((intValue21 & 6) == 0) {
                    intValue21 |= ((GapComposer) composer21).changed(realSubcomposeAsyncImageScope) ? 4 : 2;
                }
                GapComposer gapComposer22 = (GapComposer) composer21;
                if (gapComposer22.shouldExecute(intValue21 & 1, (intValue21 & 19) != 18)) {
                    Object rememberedValue23 = gapComposer22.rememberedValue();
                    if (rememberedValue23 == neverEqualPolicy) {
                        rememberedValue23 = asyncImagePainter.state;
                        gapComposer22.updateRememberedValue(rememberedValue23);
                    }
                    AsyncImagePainter.State state = (AsyncImagePainter.State) Updater.collectAsState((StateFlow) rememberedValue23, null, gapComposer22, 1).getValue();
                    if (Intrinsics.areEqual(state, AsyncImagePainter.State.Empty.INSTANCE) || (state instanceof AsyncImagePainter.State.Error)) {
                        gapComposer22.startReplaceGroup(1942949500);
                        Trace.m1191Iconww6aTOc(Icons.Document32, (String) null, SizeKt.wrapContentSize$default(companion, null, 3), 0L, gapComposer22, 438, 8);
                        gapComposer22.end(false);
                    } else if (state instanceof AsyncImagePainter.State.Loading) {
                        gapComposer22.startReplaceGroup(1943110018);
                        gapComposer22.end(false);
                    } else {
                        if (!(state instanceof AsyncImagePainter.State.Success)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer22, -214421190, false);
                        }
                        gapComposer22.startReplaceGroup(1943142754);
                        Modifier clip2 = ClipKt.clip(SizeKt.fillMaxSize(companion, 1.0f), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(8.0f));
                        boolean changed23 = gapComposer22.changed(str) | gapComposer22.changed(function1);
                        Object rememberedValue24 = gapComposer22.rememberedValue();
                        if (changed23 || rememberedValue24 == neverEqualPolicy) {
                            rememberedValue24 = new P2PListViewKt$$ExternalSyntheticLambda13(str, function1);
                            gapComposer22.updateRememberedValue(rememberedValue24);
                        }
                        ImageKt.Image(asyncImagePainter, null, ImageKt.m183clickableoSLSa3U$default(clip2, false, null, null, (Function0) rememberedValue24, 15), null, ContentScale.Companion.Crop, RecyclerView.DECELERATION_RATE, null, gapComposer22, 24624, 104);
                        gapComposer22.end(false);
                    }
                } else {
                    gapComposer22.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ TabContentViewKt$$ExternalSyntheticLambda11(Function1 function1, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = str;
    }
}
