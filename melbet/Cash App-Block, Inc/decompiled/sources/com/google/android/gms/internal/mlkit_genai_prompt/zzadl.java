package com.google.android.gms.internal.mlkit_genai_prompt;

import androidx.compose.foundation.text.input.internal.IndexTransformationType;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.WedgeAffinity;
import androidx.compose.ui.text.TextRange;
import com.squareup.cash.beacondetection.api.BeaconProximity;
import com.squareup.cash.beacondetection.api.DetectionContext;
import com.squareup.cash.beacondetection.api.LocationPermissionLevel;
import com.squareup.cash.beacondetection.real.IBeaconParser;
import com.squareup.cash.cdf.beacondetection.BeaconDetectionDetectBeaconFound;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.LinkedHashMap;
import java.util.Map;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes6.dex */
public abstract class zzadl {
    public static final BeaconDetectionDetectBeaconFound.Proximity access$toCdf(BeaconProximity beaconProximity) {
        int ordinal = beaconProximity.ordinal();
        if (ordinal == 0) {
            return BeaconDetectionDetectBeaconFound.Proximity.IMMEDIATE;
        }
        if (ordinal == 1) {
            return BeaconDetectionDetectBeaconFound.Proximity.NEAR;
        }
        if (ordinal == 2) {
            return BeaconDetectionDetectBeaconFound.Proximity.FAR;
        }
        if (ordinal == 3) {
            return BeaconDetectionDetectBeaconFound.Proximity.UNKNOWN;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static final void addParameters(StringBuilder sb, LinkedHashMap linkedHashMap) {
        if (linkedHashMap.isEmpty()) {
            return;
        }
        sb.append("?");
        boolean z = true;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (!z) {
                sb.append("&");
            }
            sb.append(str + "=" + str2);
            z = false;
        }
    }

    public static final long calculateNextCursorPositionAndWedgeAffinity(int i, int i2, TransformedTextFieldState transformedTextFieldState) {
        if (i == -1) {
            return (i2 << 32) | BodyPartID.bodyIdMax;
        }
        boolean z = i > i2;
        long m413mapFromTransformedjx7JFs = transformedTextFieldState.m413mapFromTransformedjx7JFs(i);
        long m415mapToTransformedGEjPoXI = transformedTextFieldState.m415mapToTransformedGEjPoXI(m413mapFromTransformedjx7JFs);
        int ordinal = ((TextRange.m987getCollapsedimpl(m413mapFromTransformedjx7JFs) && TextRange.m987getCollapsedimpl(m415mapToTransformedGEjPoXI)) ? IndexTransformationType.Untransformed : (TextRange.m987getCollapsedimpl(m413mapFromTransformedjx7JFs) || TextRange.m987getCollapsedimpl(m415mapToTransformedGEjPoXI)) ? (!TextRange.m987getCollapsedimpl(m413mapFromTransformedjx7JFs) || TextRange.m987getCollapsedimpl(m415mapToTransformedGEjPoXI)) ? IndexTransformationType.Deletion : IndexTransformationType.Insertion : IndexTransformationType.Replacement).ordinal();
        if (ordinal == 0) {
            return IBeaconParser.m3412constructorimpl(i, z ? WedgeAffinity.Start : WedgeAffinity.End);
        }
        if (ordinal == 1) {
            return z ? i == ((int) (m415mapToTransformedGEjPoXI >> 32)) ? IBeaconParser.m3412constructorimpl(i, WedgeAffinity.Start) : IBeaconParser.m3412constructorimpl((int) (m415mapToTransformedGEjPoXI & BodyPartID.bodyIdMax), WedgeAffinity.End) : i == ((int) (m415mapToTransformedGEjPoXI & BodyPartID.bodyIdMax)) ? IBeaconParser.m3412constructorimpl(i, WedgeAffinity.End) : IBeaconParser.m3412constructorimpl((int) (m415mapToTransformedGEjPoXI >> 32), WedgeAffinity.Start);
        }
        if (ordinal == 2) {
            return z ? IBeaconParser.m3412constructorimpl((int) (m415mapToTransformedGEjPoXI & BodyPartID.bodyIdMax), WedgeAffinity.Start) : IBeaconParser.m3412constructorimpl((int) (m415mapToTransformedGEjPoXI >> 32), WedgeAffinity.End);
        }
        if (ordinal == 3) {
            return (i << 32) | BodyPartID.bodyIdMax;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0L;
    }

    public static final BeaconDetectionDetectBeaconFound.DetectionContext access$toCdf(DetectionContext detectionContext) {
        int ordinal = detectionContext.ordinal();
        if (ordinal == 0) {
            return BeaconDetectionDetectBeaconFound.DetectionContext.FOREGROUND_RANGING;
        }
        if (ordinal == 1) {
            return BeaconDetectionDetectBeaconFound.DetectionContext.BACKGROUND_REGION_ENTRY;
        }
        if (ordinal == 2) {
            return BeaconDetectionDetectBeaconFound.DetectionContext.BACKGROUND_REGION_EXIT;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static final BeaconDetectionDetectBeaconFound.LocationPermissionLevel access$toCdf(LocationPermissionLevel locationPermissionLevel) {
        int ordinal = locationPermissionLevel.ordinal();
        if (ordinal == 0) {
            return BeaconDetectionDetectBeaconFound.LocationPermissionLevel.ALWAYS;
        }
        if (ordinal == 1) {
            return BeaconDetectionDetectBeaconFound.LocationPermissionLevel.WHEN_IN_USE;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }
}
