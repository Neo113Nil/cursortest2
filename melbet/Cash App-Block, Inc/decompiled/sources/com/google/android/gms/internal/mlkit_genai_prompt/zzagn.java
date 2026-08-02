package com.google.android.gms.internal.mlkit_genai_prompt;

import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.NestedScrollInteropConnection;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.borrow.viewmodels.BorrowLimitHubViewModel;
import com.squareup.cash.money.applets.viewmodels.Applet;
import com.squareup.cash.money.core.ids.AppletId;
import com.squareup.cash.paychecks.applets.presenters.PaychecksAppletTilePresenter$Factory$Impl;
import com.squareup.cash.paychecks.applets.presenters.RealPaychecksAppletTileRepository;
import com.squareup.cash.paychecks.views.PaycheckCirclesKt$$ExternalSyntheticLambda3;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.lending.sync_values.BorrowLimitHubData;
import kotlin.math.MathKt__MathJVMKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes6.dex */
public abstract class zzagn {
    /* renamed from: access$getScrollAxes-k-4lQ0M, reason: not valid java name */
    public static final int m2018access$getScrollAxesk4lQ0M(long j) {
        int i = Math.abs(Float.intBitsToFloat((int) (j >> 32))) >= 0.5f ? 1 : 0;
        return Math.abs(Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax))) >= 0.5f ? i | 2 : i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004a, code lost:
    
        if (r0 > r14) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
    
        r0 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0071, code lost:
    
        if (r10 > r11) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0073, code lost:
    
        r10 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0080, code lost:
    
        if (r10 < r11) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        if (r0 < r14) goto L14;
     */
    /* renamed from: access$toOffset-moWRBKg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long m2019access$toOffsetmoWRBKg(int i, long j, int[] iArr, int i2) {
        float f;
        float intBitsToFloat;
        float f2;
        float intBitsToFloat2;
        float intBitsToFloat3 = Math.abs(iArr[0]) == 0 ? 0.0f : Float.intBitsToFloat((int) (j >> 32)) - (i * (-1.0f));
        float intBitsToFloat4 = Math.abs(iArr[1]) == 0 ? 0.0f : Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)) - (i2 * (-1.0f));
        int i3 = (int) (j >> 32);
        if (Float.intBitsToFloat(i3) >= RecyclerView.DECELERATION_RATE) {
            f = (iArr[0] * (-1.0f)) + intBitsToFloat3;
            intBitsToFloat = Float.intBitsToFloat(i3);
        } else {
            f = (iArr[0] * (-1.0f)) + intBitsToFloat3;
            intBitsToFloat = Float.intBitsToFloat(i3);
        }
        int i4 = (int) (j & BodyPartID.bodyIdMax);
        if (Float.intBitsToFloat(i4) >= RecyclerView.DECELERATION_RATE) {
            f2 = (iArr[1] * (-1.0f)) + intBitsToFloat4;
            intBitsToFloat2 = Float.intBitsToFloat(i4);
        } else {
            f2 = (iArr[1] * (-1.0f)) + intBitsToFloat4;
            intBitsToFloat2 = Float.intBitsToFloat(i4);
        }
        return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & BodyPartID.bodyIdMax);
    }

    public static final int composeToViewOffset(float f) {
        return MathKt__MathJVMKt.roundToInt(f) * (-1);
    }

    public static Applet paychecksApplet(RealPaychecksAppletTileRepository realPaychecksAppletTileRepository, PaychecksAppletTilePresenter$Factory$Impl paychecksAppletTilePresenter$Factory$Impl, LifecycleOwner lifecycleOwner) {
        return new Applet(AppletId.PAYCHECKS, realPaychecksAppletTileRepository.availabilityState, new PaycheckCirclesKt$$ExternalSyntheticLambda3(3, paychecksAppletTilePresenter$Factory$Impl, lifecycleOwner));
    }

    public static final NestedScrollInteropConnection rememberNestedScrollInteropConnection(Composer composer) {
        View view = (View) ((GapComposer) composer).consume(AndroidCompositionLocals_androidKt.LocalView);
        GapComposer gapComposer = (GapComposer) composer;
        ViewConfiguration viewConfiguration = (ViewConfiguration) gapComposer.consume(CompositionLocalsKt.LocalViewConfiguration);
        boolean changed = gapComposer.changed(view) | gapComposer.changed(viewConfiguration);
        Object rememberedValue = gapComposer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.Empty) {
            viewConfiguration.getMinimumFlingVelocity();
            rememberedValue = new NestedScrollInteropConnection(view);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        return (NestedScrollInteropConnection) rememberedValue;
    }

    public static final BorrowLimitHubViewModel.TextStack toViewModel(BorrowLimitHubData.LimitProgressSection.TextStack textStack) {
        LocalizedString localizedString = textStack.label_text;
        String str = localizedString != null ? localizedString.translated_value : null;
        if (str == null) {
            str = "";
        }
        LocalizedString localizedString2 = textStack.value_text;
        String str2 = localizedString2 != null ? localizedString2.translated_value : null;
        return new BorrowLimitHubViewModel.TextStack(str, str2 != null ? str2 : "", textStack.label_color, textStack.value_color);
    }
}
