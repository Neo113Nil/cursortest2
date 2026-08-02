package androidx.core.graphics;

import android.graphics.BlendMode;
import android.graphics.Paint;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.core.content.ContextCompat$Api33Impl;
import androidx.core.graphics.PaintCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.avatar.components.BadgedAvatarKt;
import com.squareup.cash.clientroutes.ClientRoute;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public abstract class PaintCompat {
    /* renamed from: RecipientAvatarView-_hDl4AY, reason: not valid java name */
    public static final void m1090RecipientAvatarView_hDl4AY(Modifier modifier, final Character ch, final String str, String str2, final long j, float f, float f2, final boolean z, float f3, final Function0 function0, Composer composer, final int i) {
        GapComposer gapComposer;
        final Modifier modifier2;
        final String str3;
        final float f4;
        final float f5;
        final float f6;
        final float f7;
        Modifier modifier3;
        int i2;
        String str4;
        final float f8;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1517290958);
        int i3 = i | 6 | (gapComposer2.changed(ch) ? 32 : 16) | (gapComposer2.changed(str) ? 256 : 128) | 3072 | (gapComposer2.changed(j) ? 16384 : PKIFailureInfo.certRevoked) | 907739136;
        int i4 = gapComposer2.changedInstance(function0) ? 4 : 2;
        if (gapComposer2.shouldExecute(i3 & 1, ((306783379 & i3) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            gapComposer2.startDefaults();
            if ((i & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                f7 = 22.0f;
                modifier3 = Modifier.Companion.$$INSTANCE;
                f6 = 48.0f;
                i2 = i4;
                str4 = "";
                f8 = 22.0f;
            } else {
                gapComposer2.skipToGroupEnd();
                modifier3 = modifier;
                f7 = f;
                f8 = f2;
                f6 = f3;
                i2 = i4;
                str4 = str2;
            }
            gapComposer2.endDefaults();
            BiasAlignment biasAlignment = Alignment.Companion.TopStart;
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(495832277, new Function2(f7, f8, z) { // from class: com.squareup.cash.recipients.components.RecipientAvatarViewKt$$ExternalSyntheticLambda0
                public final /* synthetic */ boolean f$0;
                public final /* synthetic */ float f$1;

                {
                    this.f$0 = z;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    int intValue = ((Integer) obj2).intValue();
                    GapComposer gapComposer3 = (GapComposer) composer2;
                    if (!gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                        gapComposer3.skipToGroupEnd();
                    } else if (this.f$0) {
                        gapComposer3.startReplaceGroup(946866056);
                        ContextCompat$Api33Impl.m1089MooncakeFavoriteBadgeViewrAjV9yQ(this.f$1, 0, gapComposer3, null);
                        gapComposer3.end(false);
                    } else {
                        gapComposer3.startReplaceGroup(947018669);
                        gapComposer3.end(false);
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer2);
            int i5 = ((i3 >> 3) & 112) | 390 | ((i3 << 15) & 3670016);
            int i6 = ((i3 << 3) & 458752) | 805306752 | ((i2 << 21) & 29360128);
            float f9 = f7;
            gapComposer = gapComposer2;
            Modifier modifier4 = modifier3;
            float f10 = f8;
            BadgedAvatarKt.m3409BadgedAvatarRYf9XWw(modifier4, str, str4, null, null, 0L, ch, null, 0L, null, f6, RecyclerView.DECELERATION_RATE, null, j, null, function0, rememberComposableLambda, biasAlignment, gapComposer, i5, i6, 6, 356280);
            modifier2 = modifier4;
            str3 = str4;
            f4 = f9;
            f5 = f10;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
            str3 = str2;
            f4 = f;
            f5 = f2;
            f6 = f3;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2(ch, str, str3, j, f4, f5, z, f6, function0, i) { // from class: com.squareup.cash.recipients.components.RecipientAvatarViewKt$$ExternalSyntheticLambda1
                public final /* synthetic */ Character f$1;
                public final /* synthetic */ Function0 f$10;
                public final /* synthetic */ String f$2;
                public final /* synthetic */ String f$3;
                public final /* synthetic */ long f$4;
                public final /* synthetic */ float f$5;
                public final /* synthetic */ float f$6;
                public final /* synthetic */ boolean f$7;
                public final /* synthetic */ float f$9;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(12582913);
                    PaintCompat.m1090RecipientAvatarView_hDl4AY(Modifier.this, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$9, this.f$10, (Composer) obj, updateChangedFlags);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.DeprecatedViewLoyaltyReward.deepLinkSpecs;
    }

    public static void setBlendMode(Paint paint, BlendModeCompat blendModeCompat) {
        BlendMode blendMode = null;
        if (blendModeCompat != null) {
            switch (BlendModeUtils$1.$SwitchMap$androidx$core$graphics$BlendModeCompat[blendModeCompat.ordinal()]) {
                case 1:
                    blendMode = BlendMode.CLEAR;
                    break;
                case 2:
                    blendMode = BlendMode.SRC;
                    break;
                case 3:
                    blendMode = BlendMode.DST;
                    break;
                case 4:
                    blendMode = BlendMode.SRC_OVER;
                    break;
                case 5:
                    blendMode = BlendMode.DST_OVER;
                    break;
                case 6:
                    blendMode = BlendMode.SRC_IN;
                    break;
                case 7:
                    blendMode = BlendMode.DST_IN;
                    break;
                case 8:
                    blendMode = BlendMode.SRC_OUT;
                    break;
                case 9:
                    blendMode = BlendMode.DST_OUT;
                    break;
                case 10:
                    blendMode = BlendMode.SRC_ATOP;
                    break;
                case 11:
                    blendMode = BlendMode.DST_ATOP;
                    break;
                case 12:
                    blendMode = BlendMode.XOR;
                    break;
                case 13:
                    blendMode = BlendMode.PLUS;
                    break;
                case 14:
                    blendMode = BlendMode.MODULATE;
                    break;
                case 15:
                    blendMode = BlendMode.SCREEN;
                    break;
                case 16:
                    blendMode = BlendMode.OVERLAY;
                    break;
                case 17:
                    blendMode = BlendMode.DARKEN;
                    break;
                case 18:
                    blendMode = BlendMode.LIGHTEN;
                    break;
                case 19:
                    blendMode = BlendMode.COLOR_DODGE;
                    break;
                case 20:
                    blendMode = BlendMode.COLOR_BURN;
                    break;
                case 21:
                    blendMode = BlendMode.HARD_LIGHT;
                    break;
                case 22:
                    blendMode = BlendMode.SOFT_LIGHT;
                    break;
                case 23:
                    blendMode = BlendMode.DIFFERENCE;
                    break;
                case 24:
                    blendMode = BlendMode.EXCLUSION;
                    break;
                case 25:
                    blendMode = BlendMode.MULTIPLY;
                    break;
                case 26:
                    blendMode = BlendMode.HUE;
                    break;
                case 27:
                    blendMode = BlendMode.SATURATION;
                    break;
                case 28:
                    blendMode = BlendMode.COLOR;
                    break;
                case 29:
                    blendMode = BlendMode.LUMINOSITY;
                    break;
            }
        }
        paint.setBlendMode(blendMode);
    }
}
