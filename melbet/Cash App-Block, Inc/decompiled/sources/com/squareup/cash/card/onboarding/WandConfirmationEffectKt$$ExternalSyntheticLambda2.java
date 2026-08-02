package com.squareup.cash.card.onboarding;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.Modifier;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.card.onboarding.graphics.FlowsKt;
import com.squareup.cash.card.onboarding.graphics.HeartEdition;
import com.squareup.cash.card.onboarding.graphics.MiniCardEdition;
import com.squareup.cash.card.onboarding.graphics.WandEdition;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.graphics.backend.math.Vector3;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function8;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public final /* synthetic */ class WandConfirmationEffectKt$$ExternalSyntheticLambda2 implements Function8 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Enum f$0;

    public /* synthetic */ WandConfirmationEffectKt$$ExternalSyntheticLambda2(Enum r1, int i) {
        this.$r8$classId = i;
        this.f$0 = r1;
    }

    @Override // kotlin.jvm.functions.Function8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Serializable serializable) {
        int i;
        int i2;
        int i3;
        int i4 = this.$r8$classId;
        Enum r0 = this.f$0;
        switch (i4) {
            case 0:
                WandEdition wandEdition = (WandEdition) r0;
                Modifier modifier = (Modifier) obj;
                float floatValue = ((Float) obj2).floatValue();
                Quat quat = (Quat) obj3;
                Vector3 vector3 = (Vector3) obj4;
                float floatValue2 = ((Float) obj5).floatValue();
                Function1 function1 = (Function1) obj6;
                Composer composer = (Composer) obj7;
                int intValue = ((Integer) serializable).intValue();
                modifier.getClass();
                quat.getClass();
                vector3.getClass();
                function1.getClass();
                if ((intValue & 6) == 0) {
                    i = intValue | (((GapComposer) composer).changed(modifier) ? 4 : 2);
                } else {
                    i = intValue;
                }
                if ((intValue & 48) == 0) {
                    i |= ((GapComposer) composer).changed(floatValue) ? 32 : 16;
                }
                if ((intValue & MLKEMEngine.KyberPolyBytes) == 0) {
                    i |= (intValue & 512) == 0 ? ((GapComposer) composer).changed(quat) : ((GapComposer) composer).changedInstance(quat) ? 256 : 128;
                }
                if ((intValue & 3072) == 0) {
                    i |= (intValue & 4096) == 0 ? ((GapComposer) composer).changed(vector3) : ((GapComposer) composer).changedInstance(vector3) ? 2048 : 1024;
                }
                if ((intValue & 24576) == 0) {
                    i |= ((GapComposer) composer).changed(floatValue2) ? 16384 : PKIFailureInfo.certRevoked;
                }
                if ((intValue & 196608) == 0) {
                    i |= ((GapComposer) composer).changedInstance(function1) ? PKIFailureInfo.unsupportedVersion : 65536;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(i & 1, (599187 & i) != 599186)) {
                    FlowsKt.m3443WandEffect37dI38Q(modifier, floatValue, quat, vector3, floatValue2, null, 0L, false, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, wandEdition, null, null, null, function1, gapComposer, (i & 14) | 12582912 | (i & 112) | 512 | (i & 896) | (i & 7168) | (57344 & i), (i << 3) & 3670016, 63328);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                HeartEdition heartEdition = (HeartEdition) r0;
                Modifier modifier2 = (Modifier) obj;
                float floatValue3 = ((Float) obj2).floatValue();
                Quat quat2 = (Quat) obj3;
                Vector3 vector32 = (Vector3) obj4;
                float floatValue4 = ((Float) obj5).floatValue();
                Function1 function12 = (Function1) obj6;
                Composer composer2 = (Composer) obj7;
                int intValue2 = ((Integer) serializable).intValue();
                modifier2.getClass();
                quat2.getClass();
                vector32.getClass();
                function12.getClass();
                if ((intValue2 & 6) == 0) {
                    i2 = intValue2 | (((GapComposer) composer2).changed(modifier2) ? 4 : 2);
                } else {
                    i2 = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i2 |= ((GapComposer) composer2).changed(floatValue3) ? 32 : 16;
                }
                if ((intValue2 & MLKEMEngine.KyberPolyBytes) == 0) {
                    i2 |= (intValue2 & 512) == 0 ? ((GapComposer) composer2).changed(quat2) : ((GapComposer) composer2).changedInstance(quat2) ? 256 : 128;
                }
                if ((intValue2 & 3072) == 0) {
                    i2 |= (intValue2 & 4096) == 0 ? ((GapComposer) composer2).changed(vector32) : ((GapComposer) composer2).changedInstance(vector32) ? 2048 : 1024;
                }
                if ((intValue2 & 24576) == 0) {
                    i2 |= ((GapComposer) composer2).changed(floatValue4) ? 16384 : PKIFailureInfo.certRevoked;
                }
                if ((intValue2 & 196608) == 0) {
                    i2 |= ((GapComposer) composer2).changedInstance(function12) ? PKIFailureInfo.unsupportedVersion : 65536;
                }
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(i2 & 1, (599187 & i2) != 599186)) {
                    FlowsKt.m3441HeartEffect37dI38Q(modifier2, floatValue3, quat2, vector32, floatValue4, null, 0L, false, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, heartEdition, null, null, null, function12, gapComposer2, (i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | 512 | (i2 & 896) | (i2 & 7168) | (57344 & i2), (i2 << 3) & 3670016, 63456);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            default:
                MiniCardEdition miniCardEdition = (MiniCardEdition) r0;
                Modifier modifier3 = (Modifier) obj;
                float floatValue5 = ((Float) obj2).floatValue();
                Quat quat3 = (Quat) obj3;
                Vector3 vector33 = (Vector3) obj4;
                float floatValue6 = ((Float) obj5).floatValue();
                Function1 function13 = (Function1) obj6;
                Composer composer3 = (Composer) obj7;
                int intValue3 = ((Integer) serializable).intValue();
                modifier3.getClass();
                quat3.getClass();
                vector33.getClass();
                function13.getClass();
                if ((intValue3 & 6) == 0) {
                    i3 = intValue3 | (((GapComposer) composer3).changed(modifier3) ? 4 : 2);
                } else {
                    i3 = intValue3;
                }
                if ((intValue3 & 48) == 0) {
                    i3 |= ((GapComposer) composer3).changed(floatValue5) ? 32 : 16;
                }
                if ((intValue3 & MLKEMEngine.KyberPolyBytes) == 0) {
                    i3 |= (intValue3 & 512) == 0 ? ((GapComposer) composer3).changed(quat3) : ((GapComposer) composer3).changedInstance(quat3) ? 256 : 128;
                }
                if ((intValue3 & 3072) == 0) {
                    i3 |= (intValue3 & 4096) == 0 ? ((GapComposer) composer3).changed(vector33) : ((GapComposer) composer3).changedInstance(vector33) ? 2048 : 1024;
                }
                if ((intValue3 & 24576) == 0) {
                    i3 |= ((GapComposer) composer3).changed(floatValue6) ? 16384 : PKIFailureInfo.certRevoked;
                }
                if ((intValue3 & 196608) == 0) {
                    i3 |= ((GapComposer) composer3).changedInstance(function13) ? PKIFailureInfo.unsupportedVersion : 65536;
                }
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(i3 & 1, (599187 & i3) != 599186)) {
                    FlowsKt.m3442MiniCardEffect37dI38Q(modifier3, floatValue5, quat3, vector33, floatValue6, null, 0L, false, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, miniCardEdition, null, null, null, function13, gapComposer3, (i3 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | 512 | (i3 & 896) | (i3 & 7168) | (57344 & i3), (i3 << 3) & 3670016, 63456);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
