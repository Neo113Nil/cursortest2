package androidx.core.view;

import android.content.Context;
import android.view.View;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda17;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import app.cash.arcade.values.ButtonProminence;
import app.cash.arcade.values.button.ArcadeButtonProminences;
import coil3.size.SizeKt;
import com.squareup.cash.R;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.marketing.components.CardUpsellIllustration;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.text.StringsKt__StringsKt$lineSequence$$inlined$Sequence$1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import squareup.cash.savings.bespoke_elements.CardImage;

/* loaded from: classes3.dex */
public abstract class ViewKt {
    public static final void ArcadeButtonDefault(ButtonProminence.Id id, Modifier modifier, boolean z, Function0 function0, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i, int i2) {
        int i3;
        boolean z2;
        boolean z3;
        id.getClass();
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1032556499);
        int i4 = i | (gapComposer.changedInstance(id) ? 4 : 2);
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | MLKEMEngine.KyberPolyBytes;
        } else {
            i3 = i4 | (gapComposer.changed(z) ? 256 : 128);
        }
        int i6 = i3 | (gapComposer.changedInstance(function0) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i6 & 1, (i6 & 9363) != 9362)) {
            boolean z4 = i5 != 0 ? true : z;
            ButtonProminence.Id id2 = ArcadeButtonProminences.destructiveProminent;
            com.squareup.cash.arcade.components.button.ButtonProminence buttonProminence = (id.equals(id2) || id.equals(ArcadeButtonProminences.prominent)) ? com.squareup.cash.arcade.components.button.ButtonProminence.PROMINENT : (id.equals(ArcadeButtonProminences.destructiveSubtle) || id.equals(ArcadeButtonProminences.subtle)) ? com.squareup.cash.arcade.components.button.ButtonProminence.SUBTLE : (id.equals(ArcadeButtonProminences.destructiveStandard) || id.equals(ArcadeButtonProminences.standard)) ? com.squareup.cash.arcade.components.button.ButtonProminence.STANDARD : com.squareup.cash.arcade.components.button.ButtonProminence.STANDARD;
            if (id.equals(id2) || id.equals(ArcadeButtonProminences.destructiveSubtle) || id.equals(ArcadeButtonProminences.destructiveStandard)) {
                z3 = true;
            } else {
                if (!id.equals(ArcadeButtonProminences.prominent) && !id.equals(ArcadeButtonProminences.subtle)) {
                    ButtonProminence.Id id3 = ArcadeButtonProminences.standard;
                }
                z3 = false;
            }
            SizeKt.Button(function0, modifier, buttonProminence, z3, z4, null, composableLambdaImpl, gapComposer, ((i6 << 6) & 57344) | ((i6 >> 9) & 14) | 48 | 1572864, 32);
            z2 = z4;
        } else {
            gapComposer.skipToGroupEnd();
            z2 = z;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerKt$$ExternalSyntheticLambda17(id, modifier, z2, function0, composableLambdaImpl, i, i2);
        }
    }

    public static final Integer arcadeResource(CardImage cardImage, boolean z) {
        cardImage.getClass();
        int ordinal = cardImage.ordinal();
        if (ordinal == 0) {
            return null;
        }
        if (ordinal == 1) {
            return 2131232756;
        }
        if (ordinal == 2) {
            return Integer.valueOf(R.drawable.icon_upsell_savings_yield);
        }
        if (ordinal == 3) {
            return Integer.valueOf(z ? R.drawable.icon_upsell_rake_light : R.drawable.icon_upsell_rake_dark);
        }
        if (ordinal == 4) {
            return Integer.valueOf(R.drawable.icon_upsell_keys);
        }
        if (ordinal != 5) {
            return null;
        }
        return Integer.valueOf(R.drawable.icon_upsell_propogation);
    }

    public static final CardUpsellIllustration fromDrawableRes(Context context, int i, int i2, int i3, int i4) {
        return new CardUpsellIllustration("android.resource://" + context.getPackageName() + "/" + i, i4, i3, "android.resource://" + context.getPackageName() + "/" + i2);
    }

    public static final StringsKt__StringsKt$lineSequence$$inlined$Sequence$1 getAllViews(View view) {
        return new StringsKt__StringsKt$lineSequence$$inlined$Sequence$1(new ViewKt$allViews$1(view, null), 2);
    }

    public static final Sequence getAncestors(View view) {
        return SequencesKt__SequencesKt.generateSequence(ViewKt$ancestors$1.INSTANCE, view.getParent());
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.DeviceLocationConsent.deepLinkSpecs;
    }
}
