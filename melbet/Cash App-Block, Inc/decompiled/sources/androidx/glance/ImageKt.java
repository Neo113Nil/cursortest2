package androidx.glance;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.glance.layout.ContentScale;
import androidx.glance.semantics.SemanticsConfiguration;
import androidx.glance.semantics.SemanticsModifier;
import androidx.glance.semantics.SemanticsProperties;
import androidx.room.Room;
import com.miteksystems.misnap.workflow.view.MiSnapView;
import com.squareup.cash.R;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.shopping.sup.screens.CheckoutScreenType;
import com.squareup.cash.shopping.sup.views.CartTotalDiscrepancy;
import com.squareup.cash.shopping.sup.views.SingleUsePaymentAddCardSheetKt;
import com.squareup.cash.shopping.views.ActionPillKt$$ExternalSyntheticLambda1;
import com.squareup.cash.shopping.views.BrandsSearchView$$ExternalSyntheticLambda6;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public abstract class ImageKt {
    /* renamed from: Image-GCr5PR4, reason: not valid java name */
    public static final void m1115ImageGCr5PR4(BitmapImageProvider bitmapImageProvider, String str, GlanceModifier glanceModifier, Composer composer, int i) {
        GlanceModifier glanceModifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(491792371);
        if ((((gapComposer.changed(bitmapImageProvider) ? 4 : 2) | i | (gapComposer.changed(str) ? 32 : 16) | (gapComposer.changed(glanceModifier) ? 256 : 128) | (gapComposer.changed(1) ? 2048 : 1024) | 24576) & 9363) == 9362 && gapComposer.getSkipping()) {
            gapComposer.skipToGroupEnd();
        } else {
            gapComposer.startReplaceableGroup(135631275);
            if (str != null) {
                gapComposer.startReplaceableGroup(135633130);
                boolean changed = gapComposer.changed(str);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new ImageKt$Image$finalModifier$1$1(str, 0);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                gapComposer.end(false);
                SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
                ((Function1) rememberedValue).invoke(semanticsConfiguration);
                glanceModifier2 = glanceModifier.then(new SemanticsModifier(semanticsConfiguration));
            } else {
                glanceModifier2 = glanceModifier;
            }
            gapComposer.end(false);
            ImageKt$Image$1 imageKt$Image$1 = ImageKt$Image$1.INSTANCE;
            gapComposer.startReplaceableGroup(-1115894518);
            gapComposer.startReplaceableGroup(1886828752);
            if (!(gapComposer.applier instanceof Applier)) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(new MiSnapView.j(1, imageKt$Image$1));
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, bitmapImageProvider, ImageKt$Image$2$1.INSTANCE);
            Updater.m576setimpl(gapComposer, glanceModifier2, ImageKt$Image$2$1.INSTANCE$2);
            Updater.m576setimpl(gapComposer, new ContentScale(), ImageKt$Image$2$1.INSTANCE$3);
            Updater.m576setimpl(gapComposer, null, ImageKt$Image$2$1.INSTANCE$4);
            gapComposer.end(true);
            gapComposer.end(false);
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ImageKt$Image$3(bitmapImageProvider, str, glanceModifier, i, 0);
        }
    }

    public static final void MinimumSpendRestrictionContent(CheckoutScreenType.MinimumSpendRestrictedWarning minimumSpendRestrictedWarning, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(602570626);
        int i2 = (gapComposer.changedInstance(minimumSpendRestrictedWarning) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            String stringResource = Room.stringResource(gapComposer, R.string.sup_minimum_spend_warning_header);
            String stringResource2 = Room.stringResource(gapComposer, R.string.sup_minimum_spend_warning_message);
            String stringResource3 = Room.stringResource(gapComposer, R.string.ok);
            ButtonProminence buttonProminence = ButtonProminence.STANDARD;
            boolean z = true;
            CartTotalDiscrepancy cartTotalDiscrepancy = new CartTotalDiscrepancy(minimumSpendRestrictedWarning.cartTotal, null, minimumSpendRestrictedWarning.cartMinimum, 2);
            if ((i2 & 112) != 32) {
                z = false;
            }
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BrandsSearchView$$ExternalSyntheticLambda6(11, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            SingleUsePaymentAddCardSheetKt.SingleUsePaymentHalfSheetContent(stringResource, stringResource2, stringResource3, buttonProminence, true, cartTotalDiscrepancy, (Function0) rememberedValue, gapComposer, 27648, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ActionPillKt$$ExternalSyntheticLambda1(minimumSpendRestrictedWarning, function1, i, 3);
        }
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.RemoveApplePayCard.deepLinkSpecs;
    }

    public static final boolean isDecorative(EmittableImage emittableImage) {
        String str = null;
        SemanticsModifier semanticsModifier = (SemanticsModifier) emittableImage.modifier.foldIn(null, ImageKt$Image$2$1.INSTANCE$5);
        SemanticsConfiguration semanticsConfiguration = semanticsModifier != null ? semanticsModifier.configuration : null;
        if (semanticsConfiguration != null) {
            Object obj = semanticsConfiguration.props.get(SemanticsProperties.ContentDescription);
            if (obj == null) {
                obj = null;
            }
            List list = (List) obj;
            if (list != null) {
                str = (String) list.get(0);
            }
        }
        return str == null || str.length() == 0;
    }
}
