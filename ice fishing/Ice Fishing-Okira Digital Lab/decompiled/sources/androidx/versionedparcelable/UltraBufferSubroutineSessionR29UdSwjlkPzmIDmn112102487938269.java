package androidx.versionedparcelable;

import android.app.Notification;
import android.content.Context;
import android.graphics.Path;
import android.view.DisplayCutout;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public abstract class UltraBufferSubroutineSessionR29UdSwjlkPzmIDmn112102487938269 {
    public static float ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public static Path AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(DisplayCutout displayCutout) {
        return displayCutout.getCutoutPath();
    }

    public static void LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(Notification.Action.Builder builder) {
        builder.setAuthenticationRequired(false);
    }

    public static EdgeEffect ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(Context context) {
        try {
            return new EdgeEffect(context, null);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public static float RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(EdgeEffect edgeEffect, float f, float f2) {
        try {
            return edgeEffect.onPullDistance(f, f2);
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f2);
            return 0.0f;
        }
    }
}
