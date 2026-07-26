package android.content.Context;

import android.content.res.AssetFileDescriptor;
import android.util.Base64OutputStream;
import com.adjust.sdk.Constants;
import com.android.installreferrer.api.InstallReferrerClient;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final /* synthetic */ class FrostHunterButtonStormVision4803 implements Callable {
    public final /* synthetic */ int FrostHunterAlphaAnimationNeoCosmos5761;
    public final /* synthetic */ Object FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public /* synthetic */ FrostHunterButtonStormVision4803(int i, Object obj) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = i;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String byteArrayOutputStream;
        int i = this.FrostHunterAlphaAnimationNeoCosmos5761;
        Object obj = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                FrostHunterObjectDetectionOlympianOlympian2873 frostHunterObjectDetectionOlympianOlympian2873 = (FrostHunterObjectDetectionOlympianOlympian2873) obj;
                synchronized (frostHunterObjectDetectionOlympianOlympian2873) {
                    try {
                        FrostHunterHandlerUltraTitan9621 frostHunterHandlerUltraTitan9621 = (FrostHunterHandlerUltraTitan9621) frostHunterObjectDetectionOlympianOlympian2873.FrostHunterAlphaAnimationNeoCosmos5761.get();
                        ArrayList FrostHunterBundlePulseFusionHero2475 = frostHunterHandlerUltraTitan9621.FrostHunterBundlePulseFusionHero2475();
                        frostHunterHandlerUltraTitan9621.FrostHunterConstraintSetCloneMasterUltraRogue2633();
                        JSONArray jSONArray = new JSONArray();
                        for (int i2 = 0; i2 < FrostHunterBundlePulseFusionHero2475.size(); i2++) {
                            FrostHunterMediaPlayerBlazeForceNovaX4223 frostHunterMediaPlayerBlazeForceNovaX4223 = (FrostHunterMediaPlayerBlazeForceNovaX4223) FrostHunterBundlePulseFusionHero2475.get(i2);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", frostHunterMediaPlayerBlazeForceNovaX4223.FrostHunterAlphaAnimationNeoCosmos5761);
                            jSONObject.put("dates", new JSONArray((Collection) frostHunterMediaPlayerBlazeForceNovaX4223.FrostHunterConstraintSetCloneMasterUltraRogue2633));
                            jSONArray.put(jSONObject);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("heartbeats", jSONArray);
                        jSONObject2.put("version", "2");
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                            try {
                                gZIPOutputStream.write(jSONObject2.toString().getBytes(Constants.ENCODING));
                                gZIPOutputStream.close();
                                base64OutputStream.close();
                                byteArrayOutputStream = byteArrayOutputStream2.toString(Constants.ENCODING);
                            } finally {
                            }
                        } finally {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return byteArrayOutputStream;
            case 1:
                FrostHunterObjectDetectionOlympianOlympian2873 frostHunterObjectDetectionOlympianOlympian28732 = (FrostHunterObjectDetectionOlympianOlympian2873) obj;
                synchronized (frostHunterObjectDetectionOlympianOlympian28732) {
                    ((FrostHunterHandlerUltraTitan9621) frostHunterObjectDetectionOlympianOlympian28732.FrostHunterAlphaAnimationNeoCosmos5761.get()).FrostHunterCameraXPixelTurboCosmos9814(((FrostHunterShapeDrawablePhantomCosmos4573) frostHunterObjectDetectionOlympianOlympian28732.FrostHunterBundlePulseFusionHero2475.get()).FrostHunterAlphaAnimationNeoCosmos5761(), System.currentTimeMillis());
                }
                return null;
            default:
                return (AssetFileDescriptor) obj;
        }
    }
}
