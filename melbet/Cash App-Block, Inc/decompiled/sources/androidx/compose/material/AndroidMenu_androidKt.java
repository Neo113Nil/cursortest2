package androidx.compose.material;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupProperties;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.wallet.views.HeroTagViewKt$$ExternalSyntheticLambda12;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class AndroidMenu_androidKt {
    public static final PopupProperties DefaultMenuProperties = new PopupProperties(true);

    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0054  */
    /* renamed from: DropdownMenu-4kj-_NE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m460DropdownMenu4kj_NE(boolean z, Function0 function0, Modifier modifier, long j, ScrollState scrollState, PopupProperties popupProperties, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        ScrollState scrollState2;
        int i4;
        int i5;
        long j2;
        PopupProperties popupProperties2;
        Modifier modifier3;
        ScrollState scrollState3;
        RecomposeScopeImpl endRestartGroup;
        Modifier modifier4;
        long j3;
        PopupProperties popupProperties3;
        long j4;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1275450738);
        int i6 = i | (gapComposer.changed(z) ? 4 : 2);
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 = i6 | MLKEMEngine.KyberPolyBytes;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = i6 | (gapComposer.changed(modifier2) ? 256 : 128);
        }
        int i8 = i3 | 3072;
        if ((i2 & 16) == 0) {
            scrollState2 = scrollState;
            if (gapComposer.changed(scrollState2)) {
                i4 = 16384;
                i5 = i8 | i4 | 196608;
                if (gapComposer.shouldExecute(i5 & 1, (599187 & i5) == 599186)) {
                    gapComposer.skipToGroupEnd();
                    j2 = j;
                    popupProperties2 = popupProperties;
                    modifier3 = modifier2;
                    scrollState3 = scrollState2;
                } else {
                    gapComposer.startDefaults();
                    if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                        Modifier modifier5 = i7 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                        long floatToRawIntBits = (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32);
                        if ((i2 & 16) != 0) {
                            scrollState2 = ImageKt.rememberScrollState(gapComposer);
                        }
                        modifier4 = modifier5;
                        j3 = floatToRawIntBits;
                        popupProperties3 = DefaultMenuProperties;
                    } else {
                        gapComposer.skipToGroupEnd();
                        j3 = j;
                        modifier4 = modifier2;
                        popupProperties3 = popupProperties;
                    }
                    ScrollState scrollState4 = scrollState2;
                    gapComposer.endDefaults();
                    Object rememberedValue = gapComposer.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = new MutableTransitionState(Boolean.FALSE);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    MutableTransitionState mutableTransitionState = (MutableTransitionState) rememberedValue;
                    mutableTransitionState.setTargetState(Boolean.valueOf(z));
                    if (((Boolean) mutableTransitionState.currentState$delegate.getValue()).booleanValue() || ((Boolean) mutableTransitionState.targetState$delegate.getValue()).booleanValue()) {
                        gapComposer.startReplaceGroup(-622294666);
                        Object rememberedValue2 = gapComposer.rememberedValue();
                        if (rememberedValue2 == neverEqualPolicy) {
                            rememberedValue2 = Updater.mutableStateOf$default(new TransformOrigin(TransformOrigin.Center));
                            gapComposer.updateRememberedValue(rememberedValue2);
                        }
                        MutableState mutableState = (MutableState) rememberedValue2;
                        Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
                        Object rememberedValue3 = gapComposer.rememberedValue();
                        if (rememberedValue3 == neverEqualPolicy) {
                            rememberedValue3 = new HeroTagViewKt$$ExternalSyntheticLambda12(1, mutableState);
                            gapComposer.updateRememberedValue(rememberedValue3);
                        }
                        j4 = j3;
                        AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j3, density, (Function2) rememberedValue3), function0, popupProperties3, Expect_jvmKt.rememberComposableLambda(1788768427, new MenuKt$$ExternalSyntheticLambda2(mutableTransitionState, mutableState, scrollState4, modifier4, composableLambdaImpl), gapComposer), gapComposer, 3504, 0);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-621500880);
                        gapComposer.end(false);
                        j4 = j3;
                    }
                    popupProperties2 = popupProperties3;
                    j2 = j4;
                    scrollState3 = scrollState4;
                    modifier3 = modifier4;
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                    endRestartGroup.block = new AndroidMenu_androidKt$$ExternalSyntheticLambda2(z, function0, modifier3, j2, scrollState3, popupProperties2, composableLambdaImpl, i, i2);
                    return;
                }
                return;
            }
        } else {
            scrollState2 = scrollState;
        }
        i4 = PKIFailureInfo.certRevoked;
        i5 = i8 | i4 | 196608;
        if (gapComposer.shouldExecute(i5 & 1, (599187 & i5) == 599186)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
