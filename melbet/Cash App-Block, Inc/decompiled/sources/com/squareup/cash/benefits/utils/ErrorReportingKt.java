package com.squareup.cash.benefits.utils;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.composer.gapbuffer.SlotTable;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.banking.observability.ProtoParsingError;
import com.squareup.cash.nearby.views.DotGridKt;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.protovalidation.ProtoValidationScope;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt___RangesKt;
import org.bouncycastle.asn1.cmc.BodyPartID;
import squareup.cash.bankingbenefits.ui.CashGreenV1;
import squareup.cash.bankingbenefits.ui.PathProgress;
import squareup.cash.bankingbenefits.ui.PathProgress$Progress$Spend;
import squareup.cash.bankingbenefits.ui.SpendPathProgress;

/* loaded from: classes5.dex */
public abstract class ErrorReportingKt {
    /* JADX WARN: Removed duplicated region for block: B:30:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0185 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x021a A[LOOP:1: B:8:0x004f->B:40:0x021a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x023c A[EDGE_INSN: B:41:0x023c->B:42:0x023c BREAK  A[LOOP:1: B:8:0x004f->B:40:0x021a], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x014d  */
    /* renamed from: drawDotGridNuxPulse-S3DtmDA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3413drawDotGridNuxPulseS3DtmDA(DrawScope drawScope, float f, float f2, float f3, float f4, long j, long j2, float f5, float f6) {
        float f7;
        char c;
        float f8;
        float f9;
        long j3;
        float f10;
        boolean z;
        float f11;
        float f12;
        float f13;
        float f14;
        float lerp;
        float m$1;
        long floatToRawIntBits;
        float f15;
        float f16;
        float f17;
        drawScope.getClass();
        char c2 = ' ';
        float intBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32));
        long mo753getSizeNHjbRc = drawScope.mo753getSizeNHjbRc();
        long j4 = BodyPartID.bodyIdMax;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (mo753getSizeNHjbRc & BodyPartID.bodyIdMax));
        float f18 = intBitsToFloat / 2.0f;
        float f19 = intBitsToFloat2 / 2.0f;
        float gridSpacing = DotGridKt.gridSpacing(intBitsToFloat, intBitsToFloat2, 20);
        int i = ((int) (f18 / gridSpacing)) + 1;
        int i2 = ((int) (f19 / gridSpacing)) + 1;
        float f20 = 3.0f;
        boolean z2 = false;
        if (f5 < 2.0f) {
            f7 = RecyclerView.DECELERATION_RATE;
        } else {
            f7 = (f5 - 2.0f) % 3.6667f;
            z2 = f7 < 3.0f;
        }
        int i3 = -i2;
        if (i3 > i2) {
            return;
        }
        while (true) {
            int i4 = -i;
            if (i4 <= i) {
                while (true) {
                    c = c2;
                    j3 = j4;
                    long noiseDrift = DotGridKt.noiseDrift(f, f4, f3, i4, i3);
                    f10 = f20;
                    z = z2;
                    float intBitsToFloat3 = Float.intBitsToFloat((int) (noiseDrift >> c)) + (i4 * gridSpacing) + f18;
                    float intBitsToFloat4 = Float.intBitsToFloat((int) (noiseDrift & j3)) + (i3 * gridSpacing) + f19;
                    if (z) {
                        f11 = intBitsToFloat4;
                        float sqrt = (float) Math.sqrt((i3 * i3) + (i4 * i4));
                        float f21 = sqrt < 0.1f ? 1.0f : sqrt < 1.2f ? 0.65f : sqrt < 2.2f ? 0.45f : sqrt < 3.2f ? 0.25f : 0.0f;
                        if (f21 > RecyclerView.DECELERATION_RATE) {
                            float f22 = f7 - (sqrt * 0.09f);
                            if (f22 > RecyclerView.DECELERATION_RATE) {
                                if (f22 <= RecyclerView.DECELERATION_RATE || f22 > 1.0f) {
                                    f15 = 0.0f;
                                } else {
                                    if (f22 < 0.3f) {
                                        f16 = f22 / 0.3f;
                                    } else if (f22 < 0.6f) {
                                        f17 = 1.0f;
                                        f15 = f21 * f17;
                                    } else {
                                        float f23 = ((f22 - 0.3f) - 0.3f) / 0.4f;
                                        if (f23 > 1.0f) {
                                            f23 = 1.0f;
                                        }
                                        f16 = 1.0f - f23;
                                    }
                                    f17 = f16 * f16 * f16;
                                    f15 = f21 * f17;
                                }
                                f13 = ((float) Math.sin(3.1415927f * RangesKt___RangesKt.coerceIn(f22 / 1.0f, RecyclerView.DECELERATION_RATE, 1.0f))) * 0.32f * gridSpacing;
                                f12 = f15;
                                if (f13 <= RecyclerView.DECELERATION_RATE) {
                                    float f24 = intBitsToFloat3 - f18;
                                    float f25 = f11 - f19;
                                    f8 = f7;
                                    float sqrt2 = (float) Math.sqrt((f25 * f25) + (f24 * f24));
                                    if (sqrt2 > 0.001f) {
                                        intBitsToFloat3 += (f24 / sqrt2) * f13;
                                        f14 = ((f25 / sqrt2) * f13) + f11;
                                        lerp = DotGridKt.lerp(Color.m677getAlphaimpl(j), 1.0f, f12);
                                        m$1 = Recorder$$ExternalSyntheticOutline2.m$1(f12, 1.5f, 1.0f, f2);
                                        f9 = f18;
                                        float f26 = f14;
                                        long m689lerpjxsXWHM = ColorKt.m689lerpjxsXWHM(f12, j, j2);
                                        floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat3) << c) | (Float.floatToRawIntBits(f26) & j3);
                                        if (i3 == 0 || i4 != 0 || f12 <= 0.05f) {
                                            DrawScope.m738drawCircleVaOC9Bg$default(drawScope, Color.m675copywmQWz5c$default(lerp, m689lerpjxsXWHM, 14), m$1, floatToRawIntBits, null, 0, 120);
                                        } else {
                                            float f27 = f12 * f10 * f6;
                                            float f28 = lerp * f12;
                                            int i5 = (int) (floatToRawIntBits >> c);
                                            int i6 = (int) (floatToRawIntBits & j3);
                                            DrawScope.m738drawCircleVaOC9Bg$default(drawScope, Color.m675copywmQWz5c$default(f28, ColorKt.Color(4294929205L), 14), m$1, (Float.floatToRawIntBits(Float.intBitsToFloat(i5) - f27) << c) | (Float.floatToRawIntBits(Float.intBitsToFloat(i6)) & j3), null, 0, 120);
                                            DrawScope.m738drawCircleVaOC9Bg$default(drawScope, Color.m675copywmQWz5c$default(f28, Color.White, 14), m$1, floatToRawIntBits, null, 0, 120);
                                            DrawScope.m738drawCircleVaOC9Bg$default(drawScope, Color.m675copywmQWz5c$default(f28, ColorKt.Color(4278236376L), 14), m$1, (Float.floatToRawIntBits(Float.intBitsToFloat(i5) + f27) << c) | (Float.floatToRawIntBits(Float.intBitsToFloat(i6)) & j3), null, 0, 120);
                                        }
                                        if (i4 == i) {
                                            break;
                                        }
                                        i4++;
                                        z2 = z;
                                        c2 = c;
                                        j4 = j3;
                                        f18 = f9;
                                        f20 = f10;
                                        f7 = f8;
                                    }
                                } else {
                                    f8 = f7;
                                }
                                f14 = f11;
                                lerp = DotGridKt.lerp(Color.m677getAlphaimpl(j), 1.0f, f12);
                                m$1 = Recorder$$ExternalSyntheticOutline2.m$1(f12, 1.5f, 1.0f, f2);
                                f9 = f18;
                                float f262 = f14;
                                long m689lerpjxsXWHM2 = ColorKt.m689lerpjxsXWHM(f12, j, j2);
                                floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat3) << c) | (Float.floatToRawIntBits(f262) & j3);
                                if (i3 == 0) {
                                }
                                DrawScope.m738drawCircleVaOC9Bg$default(drawScope, Color.m675copywmQWz5c$default(lerp, m689lerpjxsXWHM2, 14), m$1, floatToRawIntBits, null, 0, 120);
                                if (i4 == i) {
                                }
                            }
                        }
                    } else {
                        f11 = intBitsToFloat4;
                    }
                    f12 = RecyclerView.DECELERATION_RATE;
                    f13 = RecyclerView.DECELERATION_RATE;
                    if (f13 <= RecyclerView.DECELERATION_RATE) {
                    }
                    f14 = f11;
                    lerp = DotGridKt.lerp(Color.m677getAlphaimpl(j), 1.0f, f12);
                    m$1 = Recorder$$ExternalSyntheticOutline2.m$1(f12, 1.5f, 1.0f, f2);
                    f9 = f18;
                    float f2622 = f14;
                    long m689lerpjxsXWHM22 = ColorKt.m689lerpjxsXWHM(f12, j, j2);
                    floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat3) << c) | (Float.floatToRawIntBits(f2622) & j3);
                    if (i3 == 0) {
                    }
                    DrawScope.m738drawCircleVaOC9Bg$default(drawScope, Color.m675copywmQWz5c$default(lerp, m689lerpjxsXWHM22, 14), m$1, floatToRawIntBits, null, 0, 120);
                    if (i4 == i) {
                    }
                }
            } else {
                c = c2;
                f8 = f7;
                f9 = f18;
                j3 = j4;
                f10 = f20;
                z = z2;
            }
            if (i3 == i2) {
                return;
            }
            i3++;
            z2 = z;
            c2 = c;
            j4 = j3;
            f18 = f9;
            f20 = f10;
            f7 = f8;
        }
    }

    public static final SpendPathProgress spendPath(HasObservability hasObservability, CashGreenV1 cashGreenV1) {
        PathProgress pathProgress = (PathProgress) CollectionsKt.firstOrNull(cashGreenV1.path_progresses);
        PathProgress$Progress$Spend pathProgress$Progress$Spend = pathProgress != null ? pathProgress.progress : null;
        if (pathProgress$Progress$Spend == null) {
            pathProgress$Progress$Spend = null;
        }
        SpendPathProgress spendPathProgress = pathProgress$Progress$Spend != null ? pathProgress$Progress$Spend.value : null;
        try {
            BankingBenefitsProtoParsingErrorFactory bankingBenefitsProtoParsingErrorFactory = BankingBenefitsProtoParsingErrorFactory.INSTANCE;
            try {
                ProtoValidationScope.required(spendPathProgress, "spend_path");
                ProtoValidationScope.required(spendPathProgress.current_aggregated_amount, "current_aggregated_amount");
                ProtoValidationScope.required(spendPathProgress.threshold_amount, "threshold_amount");
                ProtoValidationScope.required(spendPathProgress.remaining_amount, "remaining_amount");
                ProtoValidationScope.required(spendPathProgress.percent_complete, "percent_complete");
                ProtoValidationScope.required(spendPathProgress.period_start_at, "period_start_at");
                ProtoValidationScope.required(spendPathProgress.period_end_at, "period_end_at");
                return spendPathProgress;
            } catch (Exception e) {
                throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(CashGreenV1.class), bankingBenefitsProtoParsingErrorFactory, null);
            }
        } catch (ProtoParsingError e2) {
            hasObservability.getErrorReporter().report(e2, hasObservability.getOneErrorPerAppSessionStrategy());
            return null;
        }
    }

    public abstract Object getIdentity(SlotTable slotTable);
}
