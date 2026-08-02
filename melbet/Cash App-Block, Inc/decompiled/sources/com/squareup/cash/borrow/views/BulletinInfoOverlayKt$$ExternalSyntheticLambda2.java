package com.squareup.cash.borrow.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.impl.Transformations;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.AsyncImageKt;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarOverlay;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.borrow.viewmodels.BorrowHomeOverlayViewModel;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.moneybot.genie.TextViewKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class BulletinInfoOverlayKt$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BorrowHomeOverlayViewModel.InfoSheet f$0;

    public /* synthetic */ BulletinInfoOverlayKt$$ExternalSyntheticLambda2(BorrowHomeOverlayViewModel.InfoSheet infoSheet, int i) {
        this.$r8$classId = i;
        this.f$0 = infoSheet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Modifier wrapContentHeight;
        int i;
        int i2;
        int i3 = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        ComposableLambdaImpl composableLambdaImpl = null;
        BorrowHomeOverlayViewModel.InfoSheet infoSheet = this.f$0;
        int i4 = 2;
        Object[] objArr = 0;
        final int i5 = 1;
        switch (i3) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    wrapContentHeight = SizeKt.wrapContentHeight(companion, Alignment.Companion.CenterVertically, (r2 & 2) == 0);
                    final BorrowHomeOverlayViewModel.InfoSheet.InfoSheetAsset infoSheetAsset = infoSheet.asset;
                    if (infoSheetAsset instanceof BorrowHomeOverlayViewModel.InfoSheet.InfoSheetAsset.IconAsset) {
                        gapComposer.startReplaceGroup(1439547686);
                        final Object[] objArr2 = objArr == true ? 1 : 0;
                        composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(2022915305, new Function2() { // from class: com.squareup.cash.borrow.views.BulletinInfoOverlayKt$$ExternalSyntheticLambda13
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Icons icons;
                                int i6 = objArr2;
                                BorrowHomeOverlayViewModel.InfoSheet.InfoSheetAsset infoSheetAsset2 = infoSheetAsset;
                                switch (i6) {
                                    case 0:
                                        Composer composer2 = (Composer) obj3;
                                        int intValue2 = ((Integer) obj4).intValue();
                                        GapComposer gapComposer2 = (GapComposer) composer2;
                                        if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                            int ordinal = ((BorrowHomeOverlayViewModel.InfoSheet.InfoSheetAsset.IconAsset) infoSheetAsset2).icon.ordinal();
                                            if (ordinal == 0) {
                                                icons = Icons.LimitsFill32;
                                            } else if (ordinal == 1) {
                                                icons = Icons.Alert32;
                                            } else if (ordinal == 2) {
                                                icons = Icons.TickerDown24;
                                            } else if (ordinal != 3) {
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                break;
                                            } else {
                                                icons = Icons.Borrow32;
                                            }
                                            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                                            Colors colors = (Colors) gapComposer2.consume(staticProvidableCompositionLocal);
                                            if (colors == null) {
                                                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                                            } else {
                                                gapComposer2.startReplaceGroup(-1762997739);
                                                gapComposer2.end(false);
                                            }
                                            AvatarImage.LocalIcon localIcon = new AvatarImage.LocalIcon(icons, colors.component.avatar.text, 4);
                                            AvatarSize avatarSize = AvatarSize.Size64;
                                            Colors colors2 = (Colors) gapComposer2.consume(staticProvidableCompositionLocal);
                                            if (colors2 == null) {
                                                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                                            } else {
                                                gapComposer2.startReplaceGroup(-1762997739);
                                                gapComposer2.end(false);
                                            }
                                            TextViewKt.m3613AvatarB_rZmmc(avatarSize, "", colors2.semantic.background.brand, (String) null, (Modifier) null, (AvatarImage) localIcon, (Function2) null, (AvatarOverlay) null, false, 0L, (Composer) gapComposer2, 3126, 0, 2000);
                                        } else {
                                            gapComposer2.skipToGroupEnd();
                                        }
                                        break;
                                    default:
                                        Composer composer3 = (Composer) obj3;
                                        int intValue3 = ((Integer) obj4).intValue();
                                        GapComposer gapComposer3 = (GapComposer) composer3;
                                        if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                            AsyncImageKt.m1438AsyncImage10Xjiaw(ThemablesKt.urlForTheme(((BorrowHomeOverlayViewModel.InfoSheet.InfoSheetAsset.ImageAsset) infoSheetAsset2).image, gapComposer3), null, SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(new HorizontalAlignElement(Alignment.Companion.CenterHorizontally), 0.4f), RecyclerView.DECELERATION_RATE, 8.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), null, ContentScale.Companion.Inside, null, gapComposer3, 1572912, 1976);
                                            SpacerKt.Spacer(gapComposer3, SizeKt.m277height3ABfNKs(Modifier.Companion.$$INSTANCE, 4.0f));
                                        } else {
                                            gapComposer3.skipToGroupEnd();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer);
                        gapComposer.end(false);
                    } else if (infoSheetAsset instanceof BorrowHomeOverlayViewModel.InfoSheet.InfoSheetAsset.ImageAsset) {
                        gapComposer.startReplaceGroup(1440116629);
                        composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(1044854674, new Function2() { // from class: com.squareup.cash.borrow.views.BulletinInfoOverlayKt$$ExternalSyntheticLambda13
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Icons icons;
                                int i6 = i5;
                                BorrowHomeOverlayViewModel.InfoSheet.InfoSheetAsset infoSheetAsset2 = infoSheetAsset;
                                switch (i6) {
                                    case 0:
                                        Composer composer2 = (Composer) obj3;
                                        int intValue2 = ((Integer) obj4).intValue();
                                        GapComposer gapComposer2 = (GapComposer) composer2;
                                        if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                            int ordinal = ((BorrowHomeOverlayViewModel.InfoSheet.InfoSheetAsset.IconAsset) infoSheetAsset2).icon.ordinal();
                                            if (ordinal == 0) {
                                                icons = Icons.LimitsFill32;
                                            } else if (ordinal == 1) {
                                                icons = Icons.Alert32;
                                            } else if (ordinal == 2) {
                                                icons = Icons.TickerDown24;
                                            } else if (ordinal != 3) {
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                break;
                                            } else {
                                                icons = Icons.Borrow32;
                                            }
                                            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                                            Colors colors = (Colors) gapComposer2.consume(staticProvidableCompositionLocal);
                                            if (colors == null) {
                                                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                                            } else {
                                                gapComposer2.startReplaceGroup(-1762997739);
                                                gapComposer2.end(false);
                                            }
                                            AvatarImage.LocalIcon localIcon = new AvatarImage.LocalIcon(icons, colors.component.avatar.text, 4);
                                            AvatarSize avatarSize = AvatarSize.Size64;
                                            Colors colors2 = (Colors) gapComposer2.consume(staticProvidableCompositionLocal);
                                            if (colors2 == null) {
                                                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                                            } else {
                                                gapComposer2.startReplaceGroup(-1762997739);
                                                gapComposer2.end(false);
                                            }
                                            TextViewKt.m3613AvatarB_rZmmc(avatarSize, "", colors2.semantic.background.brand, (String) null, (Modifier) null, (AvatarImage) localIcon, (Function2) null, (AvatarOverlay) null, false, 0L, (Composer) gapComposer2, 3126, 0, 2000);
                                        } else {
                                            gapComposer2.skipToGroupEnd();
                                        }
                                        break;
                                    default:
                                        Composer composer3 = (Composer) obj3;
                                        int intValue3 = ((Integer) obj4).intValue();
                                        GapComposer gapComposer3 = (GapComposer) composer3;
                                        if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                            AsyncImageKt.m1438AsyncImage10Xjiaw(ThemablesKt.urlForTheme(((BorrowHomeOverlayViewModel.InfoSheet.InfoSheetAsset.ImageAsset) infoSheetAsset2).image, gapComposer3), null, SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(new HorizontalAlignElement(Alignment.Companion.CenterHorizontally), 0.4f), RecyclerView.DECELERATION_RATE, 8.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), null, ContentScale.Companion.Inside, null, gapComposer3, 1572912, 1976);
                                            SpacerKt.Spacer(gapComposer3, SizeKt.m277height3ABfNKs(Modifier.Companion.$$INSTANCE, 4.0f));
                                        } else {
                                            gapComposer3.skipToGroupEnd();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer);
                        gapComposer.end(false);
                    } else {
                        if (infoSheetAsset != null) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 2124645214, false);
                        }
                        gapComposer.startReplaceGroup(1440601778);
                        gapComposer.end(false);
                    }
                    Transformations.SheetHeader(Expect_jvmKt.rememberComposableLambda(1387009228, new BulletinInfoOverlayKt$$ExternalSyntheticLambda2(infoSheet, i5), gapComposer), wrapContentHeight, composableLambdaImpl, Expect_jvmKt.rememberComposableLambda(874490857, new BulletinInfoOverlayKt$$ExternalSyntheticLambda2(infoSheet, i4), gapComposer), gapComposer, 3126, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    String str = infoSheet.primaryText;
                    int ordinal = infoSheet.primaryTextAlignment.ordinal();
                    if (ordinal == 0) {
                        i = 5;
                    } else {
                        if (ordinal != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        i = 3;
                    }
                    Room.m1165Text25TpFw(0, 2, 0, i, 1572912, 0, 3772, 0L, (Composer) gapComposer2, fillMaxWidth, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    String str2 = infoSheet.detailText;
                    if (str2 == null) {
                        gapComposer3.startReplaceGroup(-1314458797);
                        gapComposer3.end(false);
                    } else {
                        gapComposer3.startReplaceGroup(-1314458796);
                        TextStyle textStyle = ((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                        Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                        } else {
                            gapComposer3.startReplaceGroup(-1762997739);
                            gapComposer3.end(false);
                        }
                        long j = colors.semantic.text.subtle;
                        int ordinal2 = infoSheet.detailTextAlignment.ordinal();
                        if (ordinal2 == 0) {
                            i2 = 5;
                        } else {
                            if (ordinal2 != 1) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            i2 = 3;
                        }
                        Room.m1165Text25TpFw(0, 0, 0, i2, 0, 0, 3826, j, (Composer) gapComposer3, (Modifier) null, textStyle, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                        gapComposer3.end(false);
                    }
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
