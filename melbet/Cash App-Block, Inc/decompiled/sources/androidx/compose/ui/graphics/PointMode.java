package androidx.compose.ui.graphics;

import androidx.compose.foundation.ImageKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.PointMode;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarOverlay;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.banking.views.BankingDialog$$ExternalSyntheticLambda1;
import com.squareup.cash.bitcoin.views.BitcoinUiFactory$$ExternalSyntheticLambda12;
import com.squareup.cash.blockers.views.SetPinViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.checks.ConfirmBackOfCheckKt$$ExternalSyntheticLambda6;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoAvatarContentModel$Icon;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoAvatarContentModel$Image;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoAvatarContentModel$ImageWithBackground;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoRecurringPurchaseTileViewModel;
import com.squareup.cash.moneybot.genie.TextViewKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.commonmark.internal.util.LinkScanner;

/* loaded from: classes3.dex */
public abstract class PointMode {
    public static final void BitcoinRecurringPurchaseTileView(InvestingCryptoRecurringPurchaseTileViewModel investingCryptoRecurringPurchaseTileViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(602399789);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(investingCryptoRecurringPurchaseTileViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(modifier) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-2005124296, new BankingDialog$$ExternalSyntheticLambda1(27, investingCryptoRecurringPurchaseTileViewModel, modifier, function1), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SetPinViewKt$$ExternalSyntheticLambda3((Object) investingCryptoRecurringPurchaseTileViewModel, function1, (Object) modifier, i, 1);
        }
    }

    public static final void Icon(final LinkScanner linkScanner, final RealImageLoader realImageLoader, Composer composer, final int i) {
        final RealImageLoader realImageLoader2;
        String str;
        String str2;
        Icons icons;
        boolean z;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(3489368);
        final int i2 = 2;
        int i3 = (gapComposer.changed(linkScanner) ? 4 : 2) | i | (gapComposer.changedInstance(realImageLoader) ? 32 : 16);
        final int i4 = 0;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            int i5 = 3;
            if (linkScanner instanceof InvestingCryptoAvatarContentModel$Icon) {
                gapComposer.startReplaceGroup(872762374);
                int ordinal = ((InvestingCryptoAvatarContentModel$Icon) linkScanner).image.ordinal();
                if (ordinal == 0) {
                    icons = Icons.CurrencyBtc32;
                } else {
                    if (ordinal != 1 && ordinal != 2 && ordinal != 3 && ordinal != 4) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    icons = null;
                }
                if (icons == null) {
                    gapComposer.startReplaceGroup(872952465);
                    gapComposer.end(false);
                    z = false;
                } else {
                    gapComposer.startReplaceGroup(872952466);
                    AvatarSize avatarSize = AvatarSize.Size48;
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    z = false;
                    TextViewKt.m3613AvatarB_rZmmc(avatarSize, "", colors.semantic.icon.brand, (String) null, (Modifier) null, (AvatarImage) new AvatarImage.LocalIcon(icons, 0L, 6), (Function2) null, (AvatarOverlay) null, false, 0L, (Composer) gapComposer, 3126, 0, 2000);
                    gapComposer.end(false);
                }
                gapComposer.end(z);
                realImageLoader2 = realImageLoader;
            } else {
                String str3 = "";
                if (linkScanner instanceof InvestingCryptoAvatarContentModel$Image) {
                    gapComposer.startReplaceGroup(873231652);
                    if (realImageLoader == null) {
                        gapComposer.end(false);
                        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.block = new Function2(linkScanner, realImageLoader, i, i4) { // from class: com.squareup.cash.bitcoin.views.applet.autoinvest.BitcoinRecurringPurchaseTileKt$$ExternalSyntheticLambda6
                                public final /* synthetic */ int $r8$classId;
                                public final /* synthetic */ LinkScanner f$0;
                                public final /* synthetic */ RealImageLoader f$1;

                                {
                                    this.$r8$classId = i4;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    int i6 = this.$r8$classId;
                                    Composer composer2 = (Composer) obj;
                                    ((Integer) obj2).getClass();
                                    switch (i6) {
                                        case 0:
                                            PointMode.Icon(this.f$0, this.f$1, composer2, Updater.updateChangedFlags(1));
                                            break;
                                        case 1:
                                            PointMode.Icon(this.f$0, this.f$1, composer2, Updater.updateChangedFlags(1));
                                            break;
                                        default:
                                            PointMode.Icon(this.f$0, this.f$1, composer2, Updater.updateChangedFlags(1));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    realImageLoader2 = realImageLoader;
                    if (!ImageKt.isSystemInDarkTheme(gapComposer) ? (str2 = ((InvestingCryptoAvatarContentModel$Image) linkScanner).image.light_url) != null : (str2 = ((InvestingCryptoAvatarContentModel$Image) linkScanner).image.dark_url) != null) {
                        str3 = str2;
                    }
                    Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader2), Expect_jvmKt.rememberComposableLambda(732852055, new ConfirmBackOfCheckKt$$ExternalSyntheticLambda6(str3, i5), gapComposer), gapComposer, 56);
                    gapComposer.end(false);
                } else {
                    realImageLoader2 = realImageLoader;
                    if (linkScanner instanceof InvestingCryptoAvatarContentModel$ImageWithBackground) {
                        gapComposer.startReplaceGroup(873840306);
                        if (realImageLoader2 == null) {
                            gapComposer.end(false);
                            RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
                            if (endRestartGroup2 != null) {
                                endRestartGroup2.block = new Function2(linkScanner, realImageLoader2, i, i2) { // from class: com.squareup.cash.bitcoin.views.applet.autoinvest.BitcoinRecurringPurchaseTileKt$$ExternalSyntheticLambda6
                                    public final /* synthetic */ int $r8$classId;
                                    public final /* synthetic */ LinkScanner f$0;
                                    public final /* synthetic */ RealImageLoader f$1;

                                    {
                                        this.$r8$classId = i2;
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        int i6 = this.$r8$classId;
                                        Composer composer2 = (Composer) obj;
                                        ((Integer) obj2).getClass();
                                        switch (i6) {
                                            case 0:
                                                PointMode.Icon(this.f$0, this.f$1, composer2, Updater.updateChangedFlags(1));
                                                break;
                                            case 1:
                                                PointMode.Icon(this.f$0, this.f$1, composer2, Updater.updateChangedFlags(1));
                                                break;
                                            default:
                                                PointMode.Icon(this.f$0, this.f$1, composer2, Updater.updateChangedFlags(1));
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                return;
                            }
                            return;
                        }
                        if (!ImageKt.isSystemInDarkTheme(gapComposer) ? (str = ((InvestingCryptoAvatarContentModel$ImageWithBackground) linkScanner).image.light_url) != null : (str = ((InvestingCryptoAvatarContentModel$ImageWithBackground) linkScanner).image.dark_url) != null) {
                            str3 = str;
                        }
                        Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader2), Expect_jvmKt.rememberComposableLambda(905266136, new BitcoinUiFactory$$ExternalSyntheticLambda12(10, linkScanner, str3), gapComposer), gapComposer, 56);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(874430484);
                        gapComposer.end(false);
                    }
                }
            }
        } else {
            realImageLoader2 = realImageLoader;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup3 = gapComposer.endRestartGroup();
        if (endRestartGroup3 != null) {
            final int i6 = 1;
            endRestartGroup3.block = new Function2(linkScanner, realImageLoader2, i, i6) { // from class: com.squareup.cash.bitcoin.views.applet.autoinvest.BitcoinRecurringPurchaseTileKt$$ExternalSyntheticLambda6
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ LinkScanner f$0;
                public final /* synthetic */ RealImageLoader f$1;

                {
                    this.$r8$classId = i6;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i62 = this.$r8$classId;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i62) {
                        case 0:
                            PointMode.Icon(this.f$0, this.f$1, composer2, Updater.updateChangedFlags(1));
                            break;
                        case 1:
                            PointMode.Icon(this.f$0, this.f$1, composer2, Updater.updateChangedFlags(1));
                            break;
                        default:
                            PointMode.Icon(this.f$0, this.f$1, composer2, Updater.updateChangedFlags(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m707equalsimpl0(int i) {
        return i == 0;
    }
}
