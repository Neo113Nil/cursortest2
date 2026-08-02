package com.google.maps.android.compose;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaveableHolder;
import androidx.compose.ui.Modifier;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.local.viewmodels.marketingmessages.MarketingMessageViewModel;
import app.cash.local.viewmodels.marketingmessages.MarketingMessagesSamples;
import app.cash.local.viewmodels.marketingmessages.MarketingMessagesViewModel;
import app.cash.local.views.home.LocalHomeGeoClusterItem;
import app.cash.local.views.internal.LocalMapKt;
import app.cash.local.views.internal.LocalMapKt$$ExternalSyntheticLambda3;
import app.cash.local.views.internal.LocalViewsKt;
import app.cash.local.views.map.LocationClusterItem;
import app.cash.local.views.marketingmessages.MarketingMessageKt;
import app.cash.redwood.yoga.internal.Yoga$$ExternalSyntheticLambda0;
import bo.app.b$$ExternalSyntheticLambda3;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.integration.analytics.UtilsKt;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.util.Strings;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes4.dex */
public final /* synthetic */ class MarkerKt$$ExternalSyntheticLambda10 implements Function2 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ MarkerKt$$ExternalSyntheticLambda10(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        switch (i) {
            case 0:
                MarkerNode markerNode = (MarkerNode) obj;
                markerNode.getClass();
                markerNode.marker.setIcon((BitmapDescriptor) obj2);
                break;
            case 1:
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                ((LocalHomeGeoClusterItem) obj).getClass();
                if (!booleanValue) {
                    break;
                } else {
                    break;
                }
            case 2:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    LocalMapKt.DefaultBulletSeparator(gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 3:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 6, 0, 4082, Strings.getColors(gapComposer2).semantic.text.prominent, (Composer) gapComposer2, (Modifier) null, Strings.getTypography(gapComposer2).labelMedium, (TextLineBalancing) null, "$18.95", (Map) null, (Function1) null, false);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 6, 0, 4082, Strings.getColors(gapComposer2).semantic.text.standard, (Composer) gapComposer2, (Modifier) null, Strings.getTypography(gapComposer2).bodyMedium, (TextLineBalancing) null, "103 Cal", (Map) null, (Function1) null, false);
                    LocalMapKt.LocalDiscountText(null, "Buy 1 get 1 free", Strings.getTypography(gapComposer2).labelMedium, null, gapComposer2, 48, 9);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 6, 0, 4082, Strings.getColors(gapComposer2).semantic.text.subtle, (Composer) gapComposer2, (Modifier) null, Strings.getTypography(gapComposer2).bodyMedium, (TextLineBalancing) null, "Hello!", (Map) null, (Function1) null, false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 4:
                ((Integer) obj2).getClass();
                LocalMapKt.DefaultBulletSeparator((Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                LocalViewsKt.LocalImagePlaceholder((Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 6:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    ProgressCircularKt.ProgressCircular(6, 0, gapComposer3, SizeKt.m285size3ABfNKs(companion, 24.0f));
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
            case 7:
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                ((LocationClusterItem) obj).getClass();
                if (!booleanValue2) {
                    break;
                } else {
                    break;
                }
            case 8:
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, 24.0f);
                    Icons icons = Icons.Share24;
                    Colors colors = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                    } else {
                        gapComposer4.startReplaceGroup(-1762997739);
                        gapComposer4.end(false);
                    }
                    Trace.m1191Iconww6aTOc(icons, (String) null, m285size3ABfNKs, colors.semantic.icon.inverse, gapComposer4, 438, 0);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                break;
            case 9:
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    Modifier m285size3ABfNKs2 = SizeKt.m285size3ABfNKs(companion, 24.0f);
                    Icons icons2 = Icons.NavigationMore;
                    Colors colors2 = (Colors) gapComposer5.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer5, -1762997026, gapComposer5, false);
                    } else {
                        gapComposer5.startReplaceGroup(-1762997739);
                        gapComposer5.end(false);
                    }
                    Trace.m1191Iconww6aTOc(icons2, (String) null, m285size3ABfNKs2, colors2.semantic.icon.inverse, gapComposer5, 438, 0);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                break;
            case 10:
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    MarketingMessageViewModel.OfferPreview.SheetDetails sheetDetails = new MarketingMessageViewModel.OfferPreview.SheetDetails("Free Batch Brew", "Code: THANKS2025", "All items", "Valid through August 31, 2024", "Redeem online or show code to Cashier to redeem in-store.", "No cash value. Non transferable. May be canceled at any time. Redemption limits apply. Item exclusions may apply.", "Up to $6 off.");
                    LocalColor localColor = new LocalColor("#0013BF", "#0013BF");
                    LocalColor localColor2 = new LocalColor("#ffffff", "#ffffff");
                    LocalImage localImage = new LocalImage("fake:///rangoon_bistro.png", "fake:///rangoon_bistro.png", (Long) 64L, (Long) 64L, (LocalColor) null, 32);
                    Object rememberedValue = gapComposer6.rememberedValue();
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = new LocalMapKt$$ExternalSyntheticLambda3(29);
                        gapComposer6.updateRememberedValue(rememberedValue);
                    }
                    Function0 function0 = (Function0) rememberedValue;
                    Object rememberedValue2 = gapComposer6.rememberedValue();
                    if (rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new b$$ExternalSyntheticLambda3(1);
                        gapComposer6.updateRememberedValue(rememberedValue2);
                    }
                    MarketingMessageKt.MarketingMessageOfferSheetContent(null, sheetDetails, localColor, localColor2, localImage, "AA", function0, (Function0) rememberedValue2, gapComposer6, 14352384, 1);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                break;
            case 11:
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    MarketingMessageKt.MarketingMessageProfileLogo(SizeKt.m287sizeVpY3zN4(companion, 32.0f, 40.0f), new LocalImage("fake:///rangoon_bistro.png", "fake:///rangoon_bistro.png", (Long) 64L, (Long) 64L, new LocalColor("#0013BF", "#0013BF"), 32), new LocalColor("#0013BF", "#0013BF"), new LocalColor("#ffffff", "#ffffff"), "rr", gapComposer7, 24576);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                break;
            case 12:
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                    MarketingMessageKt.MarketingMessageProfileLogo(SizeKt.m287sizeVpY3zN4(companion, 32.0f, 40.0f), null, new LocalColor("#0013BF", "#0013BF"), new LocalColor("#ffffff", "#ffffff"), "SR", gapComposer8, 24624);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                break;
            case 13:
                Composer composer9 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                    MarketingMessagesViewModel marketingMessagesViewModel = MarketingMessagesSamples.Populated;
                    Object rememberedValue3 = gapComposer9.rememberedValue();
                    if (rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new Yoga$$ExternalSyntheticLambda0(13);
                        gapComposer9.updateRememberedValue(rememberedValue3);
                    }
                    MarketingMessageKt.MarketingMessages(null, marketingMessagesViewModel, (Function1) rememberedValue3, gapComposer9, MLKEMEngine.KyberPolyBytes, 1);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                break;
            case 14:
                Composer composer10 = (Composer) obj;
                int intValue10 = ((Integer) obj2).intValue();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                    MarketingMessagesViewModel marketingMessagesViewModel2 = MarketingMessagesSamples.LongCopy;
                    Object rememberedValue4 = gapComposer10.rememberedValue();
                    if (rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new Yoga$$ExternalSyntheticLambda0(14);
                        gapComposer10.updateRememberedValue(rememberedValue4);
                    }
                    MarketingMessageKt.MarketingMessages(null, marketingMessagesViewModel2, (Function1) rememberedValue4, gapComposer10, MLKEMEngine.KyberPolyBytes, 1);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                break;
            case 15:
                Composer composer11 = (Composer) obj;
                int intValue11 = ((Integer) obj2).intValue();
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                    MarketingMessagesViewModel marketingMessagesViewModel3 = MarketingMessagesSamples.Empty;
                    Object rememberedValue5 = gapComposer11.rememberedValue();
                    if (rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new Yoga$$ExternalSyntheticLambda0(12);
                        gapComposer11.updateRememberedValue(rememberedValue5);
                    }
                    MarketingMessageKt.MarketingMessages(null, marketingMessagesViewModel3, (Function1) rememberedValue5, gapComposer11, MLKEMEngine.KyberPolyBytes, 1);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                break;
            case 16:
                Composer composer12 = (Composer) obj;
                int intValue12 = ((Integer) obj2).intValue();
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                    MarketingMessagesViewModel marketingMessagesViewModel4 = MarketingMessagesSamples.Loading;
                    Object rememberedValue6 = gapComposer12.rememberedValue();
                    if (rememberedValue6 == neverEqualPolicy) {
                        rememberedValue6 = new Yoga$$ExternalSyntheticLambda0(11);
                        gapComposer12.updateRememberedValue(rememberedValue6);
                    }
                    MarketingMessageKt.MarketingMessages(null, marketingMessagesViewModel4, (Function1) rememberedValue6, gapComposer12, MLKEMEngine.KyberPolyBytes, 1);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                break;
            case 17:
                CameraPositionState cameraPositionState = (CameraPositionState) obj2;
                ((SaveableHolder) obj).getClass();
                cameraPositionState.getClass();
                break;
            case 18:
                InputHandlerNode inputHandlerNode = (InputHandlerNode) obj;
                inputHandlerNode.getClass();
                inputHandlerNode.onInfoWindowClose$delegate.setValue((Function1) obj2);
                break;
            case 19:
                InputHandlerNode inputHandlerNode2 = (InputHandlerNode) obj;
                inputHandlerNode2.getClass();
                inputHandlerNode2.onInfoWindowLongClick$delegate.setValue((Function1) obj2);
                break;
            case 20:
                InputHandlerNode inputHandlerNode3 = (InputHandlerNode) obj;
                inputHandlerNode3.getClass();
                inputHandlerNode3.onMarkerDrag$delegate.setValue((Function1) obj2);
                break;
            case 21:
                InputHandlerNode inputHandlerNode4 = (InputHandlerNode) obj;
                inputHandlerNode4.getClass();
                inputHandlerNode4.onMarkerDragEnd$delegate.setValue((Function1) obj2);
                break;
            case 22:
                InputHandlerNode inputHandlerNode5 = (InputHandlerNode) obj;
                inputHandlerNode5.getClass();
                inputHandlerNode5.onMarkerDragStart$delegate.setValue((Function1) obj2);
                break;
            case 23:
                InputHandlerNode inputHandlerNode6 = (InputHandlerNode) obj;
                inputHandlerNode6.getClass();
                inputHandlerNode6.onCircleClick$delegate.setValue((Function1) obj2);
                break;
            case 24:
                InputHandlerNode inputHandlerNode7 = (InputHandlerNode) obj;
                inputHandlerNode7.getClass();
                inputHandlerNode7.onGroundOverlayClick$delegate.setValue((Function1) obj2);
                break;
            case 25:
                InputHandlerNode inputHandlerNode8 = (InputHandlerNode) obj;
                inputHandlerNode8.getClass();
                inputHandlerNode8.onPolygonClick$delegate.setValue((Function1) obj2);
                break;
            case 26:
                InputHandlerNode inputHandlerNode9 = (InputHandlerNode) obj;
                inputHandlerNode9.getClass();
                inputHandlerNode9.onPolylineClick$delegate.setValue((Function1) obj2);
                break;
            case 27:
                InputHandlerNode inputHandlerNode10 = (InputHandlerNode) obj;
                inputHandlerNode10.getClass();
                inputHandlerNode10.onMarkerClick$delegate.setValue((Function1) obj2);
                break;
            case 28:
                InputHandlerNode inputHandlerNode11 = (InputHandlerNode) obj;
                inputHandlerNode11.getClass();
                inputHandlerNode11.onInfoWindowClick$delegate.setValue((Function1) obj2);
                break;
            default:
                ((Integer) obj2).getClass();
                UtilsKt.MapClickListenerUpdater((Composer) obj, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ MarkerKt$$ExternalSyntheticLambda10(int i, int i2) {
        this.$r8$classId = i2;
    }
}
