package com.google.android.gms.internal.mlkit_genai_prompt;

import androidx.camera.video.Recorder;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.composer.gapbuffer.GapAnchor;
import androidx.compose.runtime.composer.gapbuffer.SlotWriter;
import androidx.compose.runtime.composer.gapbuffer.changelist.OperationErrorContext;
import androidx.compose.runtime.tooling.SourceInformationKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import bo.app.n$$ExternalSyntheticLambda1;
import com.squareup.cash.biometrics.BiometricsStore$Status;
import com.squareup.cash.nearby.views.DotGridKt;
import com.squareup.cash.nearby.views.RadialGridDot;
import com.squareup.cash.nearby.views.RadialLayoutCache;
import com.squareup.cash.nearby.views.RadialSlot;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes6.dex */
public abstract class zzadt {
    public static final Throwable access$attachComposeStackTrace(Throwable th, OperationErrorContext operationErrorContext, SlotWriter slotWriter, GapAnchor gapAnchor) {
        if (operationErrorContext == null) {
            return th;
        }
        SourceInformationKt.tryAttachComposeStackTrace(th, new n$$ExternalSyntheticLambda1(6, gapAnchor, slotWriter, operationErrorContext));
        return th;
    }

    public static final Recorder.AnonymousClass1 access$withCurrentStackTrace(OperationErrorContext operationErrorContext, SlotWriter slotWriter) {
        return new Recorder.AnonymousClass1(18, operationErrorContext, slotWriter);
    }

    /* renamed from: drawDotGridRadialTransition-V-9fs2A, reason: not valid java name */
    public static final void m2017drawDotGridRadialTransitionV9fs2A(DrawScope drawScope, float f, float f2, float f3, float f4, long j, float f5, RadialLayoutCache radialLayoutCache, float f6) {
        float f7;
        drawScope.getClass();
        ArrayList arrayList = radialLayoutCache.radialSlots;
        List list = radialLayoutCache.gridDots;
        float f8 = 3.1415927f;
        double d = f5 * 3.1415927f;
        float cos = (1.0f - ((float) Math.cos(d))) * 0.5f;
        float sin = (float) Math.sin(d);
        float f9 = (1.0f - cos) * f3;
        int size = list.size();
        int i = 0;
        while (i < size) {
            RadialGridDot radialGridDot = (RadialGridDot) list.get(i);
            int i2 = radialGridDot.col;
            int i3 = radialGridDot.row;
            float f10 = i2 * f;
            float f11 = i3 * f;
            float simplex3D = DotGridKt.simplex3D(f10, f11, f4) * f9;
            float simplex3D2 = DotGridKt.simplex3D(f10, f11, 100.0f + f4) * f9;
            float f12 = radialGridDot.restX + simplex3D;
            float f13 = radialGridDot.restY + simplex3D2;
            if (i < arrayList.size()) {
                RadialSlot radialSlot = (RadialSlot) arrayList.get(i);
                float lerp = DotGridKt.lerp(f12, radialSlot.x, cos);
                float lerp2 = DotGridKt.lerp(f13, radialSlot.y, cos);
                float dotRandom = DotGridKt.dotRandom(i3, i2) * 2.0f * f8;
                float dotRandom2 = ((DotGridKt.dotRandom(i2, i3) * 40.0f) + 20.0f) * f6 * sin;
                double d2 = dotRandom;
                f7 = sin;
                float cos2 = (((float) Math.cos(d2)) * dotRandom2) + lerp;
                float sin2 = (((float) Math.sin(d2)) * dotRandom2) + lerp2;
                float lerp3 = DotGridKt.lerp(Color.m677getAlphaimpl(j), Color.m677getAlphaimpl(j) * radialSlot.opacity, cos);
                if (lerp3 > 0.01f) {
                    DrawScope.m738drawCircleVaOC9Bg$default(drawScope, Color.m675copywmQWz5c$default(lerp3, j, 14), f2, (Float.floatToRawIntBits(cos2) << 32) | (Float.floatToRawIntBits(sin2) & BodyPartID.bodyIdMax), null, 0, 120);
                }
            } else {
                f7 = sin;
            }
            i++;
            sin = f7;
            f8 = 3.1415927f;
        }
    }

    public static BiometricsStore$Status getReady() {
        return BiometricsStore$Status.Ready;
    }

    public static final void positionToParentOf(SlotWriter slotWriter, Applier applier, int i) {
        while (true) {
            int i2 = slotWriter.parent;
            if (i > i2 && i < slotWriter.currentGroupEnd) {
                return;
            }
            if (i2 == 0 && i == 0) {
                return;
            }
            slotWriter.skipToGroupEnd();
            if (slotWriter.isNode(slotWriter.parent)) {
                applier.up();
            }
            slotWriter.endGroup();
        }
    }
}
