package android.content.Context;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.BufferedWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterItemDecorationNovaXHero4428 implements FrostHunterGestureDetectorNovaXStormSpark6209, FrostHunterTextRecognitionNovaXPrimeVision1102 {
    public final boolean FrostHunterAlphaAnimationNeoCosmos5761 = true;
    public final Map FrostHunterBundlePulseFusionHero2475;
    public final JsonWriter FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public final boolean FrostHunterLevelListDrawableFusionDragonHero2232;
    public final FrostHunterPagingDataBetaGammaSolar8478 FrostHunterLifecycleBlazeGammaElite2889;
    public final Map FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterItemDecorationNovaXHero4428(BufferedWriter bufferedWriter, HashMap hashMap, HashMap hashMap2, FrostHunterTextInputEditTextStormThunder9998 frostHunterTextInputEditTextStormThunder9998, boolean z) {
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = new JsonWriter(bufferedWriter);
        this.FrostHunterBundlePulseFusionHero2475 = hashMap;
        this.FrostHunterServiceEliteCelestialThunder1757 = hashMap2;
        this.FrostHunterLifecycleBlazeGammaElite2889 = frostHunterTextInputEditTextStormThunder9998;
        this.FrostHunterLevelListDrawableFusionDragonHero2232 = z;
    }

    @Override // android.content.Context.FrostHunterGestureDetectorNovaXStormSpark6209
    public final FrostHunterGestureDetectorNovaXStormSpark6209 FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterPaintFlagsDrawFilterUltraTurboEclipse9896 frostHunterPaintFlagsDrawFilterUltraTurboEclipse9896, Object obj) {
        FrostHunterRemoteConfigSpeedSpeed8566(obj, frostHunterPaintFlagsDrawFilterUltraTurboEclipse9896.FrostHunterAlphaAnimationNeoCosmos5761);
        return this;
    }

    @Override // android.content.Context.FrostHunterTextRecognitionNovaXPrimeVision1102
    public final FrostHunterTextRecognitionNovaXPrimeVision1102 FrostHunterBundlePulseFusionHero2475(String str) {
        FrostHunterCameraXPixelTurboCosmos9814();
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633.value(str);
        return this;
    }

    public final void FrostHunterCameraXPixelTurboCosmos9814() {
        if (this.FrostHunterAlphaAnimationNeoCosmos5761) {
            return;
        }
        FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("Parent context used since this context was created. Cannot use this context anymore.");
    }

    @Override // android.content.Context.FrostHunterGestureDetectorNovaXStormSpark6209
    public final FrostHunterGestureDetectorNovaXStormSpark6209 FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterPaintFlagsDrawFilterUltraTurboEclipse9896 frostHunterPaintFlagsDrawFilterUltraTurboEclipse9896, long j) {
        String str = frostHunterPaintFlagsDrawFilterUltraTurboEclipse9896.FrostHunterAlphaAnimationNeoCosmos5761;
        FrostHunterCameraXPixelTurboCosmos9814();
        JsonWriter jsonWriter = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        jsonWriter.name(str);
        FrostHunterCameraXPixelTurboCosmos9814();
        jsonWriter.value(j);
        return this;
    }

    public final FrostHunterItemDecorationNovaXHero4428 FrostHunterLevelListDrawableFusionDragonHero2232(Object obj) {
        JsonWriter jsonWriter = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                jsonWriter.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    FrostHunterLevelListDrawableFusionDragonHero2232(it.next());
                }
                jsonWriter.endArray();
                return this;
            }
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        FrostHunterRemoteConfigSpeedSpeed8566(entry.getValue(), (String) key);
                    } catch (ClassCastException e) {
                        throw new FrostHunterOnItemLongClickListenerPhoenixShadowDelta1361(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            FrostHunterPagingDataBetaGammaSolar8478 frostHunterPagingDataBetaGammaSolar8478 = (FrostHunterPagingDataBetaGammaSolar8478) this.FrostHunterBundlePulseFusionHero2475.get(obj.getClass());
            if (frostHunterPagingDataBetaGammaSolar8478 != null) {
                jsonWriter.beginObject();
                frostHunterPagingDataBetaGammaSolar8478.FrostHunterAlphaAnimationNeoCosmos5761(obj, this);
                jsonWriter.endObject();
                return this;
            }
            FrostHunterDigitalInkRecognitionCosmosHyperion3394 frostHunterDigitalInkRecognitionCosmosHyperion3394 = (FrostHunterDigitalInkRecognitionCosmosHyperion3394) this.FrostHunterServiceEliteCelestialThunder1757.get(obj.getClass());
            if (frostHunterDigitalInkRecognitionCosmosHyperion3394 != null) {
                frostHunterDigitalInkRecognitionCosmosHyperion3394.FrostHunterAlphaAnimationNeoCosmos5761(obj, this);
                return this;
            }
            if (obj instanceof Enum) {
                String name = ((Enum) obj).name();
                FrostHunterCameraXPixelTurboCosmos9814();
                jsonWriter.value(name);
                return this;
            }
            jsonWriter.beginObject();
            this.FrostHunterLifecycleBlazeGammaElite2889.FrostHunterAlphaAnimationNeoCosmos5761(obj, this);
            jsonWriter.endObject();
            return this;
        }
        if (obj instanceof byte[]) {
            FrostHunterCameraXPixelTurboCosmos9814();
            jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
            return this;
        }
        jsonWriter.beginArray();
        int i = 0;
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i < length) {
                jsonWriter.value(r6[i]);
                i++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i < length2) {
                long j = jArr[i];
                FrostHunterCameraXPixelTurboCosmos9814();
                jsonWriter.value(j);
                i++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i < length3) {
                jsonWriter.value(dArr[i]);
                i++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i < length4) {
                jsonWriter.value(zArr[i]);
                i++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i < length5) {
                FrostHunterLevelListDrawableFusionDragonHero2232(numberArr[i]);
                i++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i < length6) {
                FrostHunterLevelListDrawableFusionDragonHero2232(objArr[i]);
                i++;
            }
        }
        jsonWriter.endArray();
        return this;
    }

    @Override // android.content.Context.FrostHunterTextRecognitionNovaXPrimeVision1102
    public final FrostHunterTextRecognitionNovaXPrimeVision1102 FrostHunterLifecycleBlazeGammaElite2889(boolean z) {
        FrostHunterCameraXPixelTurboCosmos9814();
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633.value(z);
        return this;
    }

    public final FrostHunterItemDecorationNovaXHero4428 FrostHunterRemoteConfigSpeedSpeed8566(Object obj, String str) {
        boolean z = this.FrostHunterLevelListDrawableFusionDragonHero2232;
        JsonWriter jsonWriter = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        if (z) {
            if (obj == null) {
                return this;
            }
            FrostHunterCameraXPixelTurboCosmos9814();
            jsonWriter.name(str);
            FrostHunterLevelListDrawableFusionDragonHero2232(obj);
            return this;
        }
        FrostHunterCameraXPixelTurboCosmos9814();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        FrostHunterLevelListDrawableFusionDragonHero2232(obj);
        return this;
    }

    @Override // android.content.Context.FrostHunterGestureDetectorNovaXStormSpark6209
    public final FrostHunterGestureDetectorNovaXStormSpark6209 FrostHunterServiceEliteCelestialThunder1757(FrostHunterPaintFlagsDrawFilterUltraTurboEclipse9896 frostHunterPaintFlagsDrawFilterUltraTurboEclipse9896, int i) {
        String str = frostHunterPaintFlagsDrawFilterUltraTurboEclipse9896.FrostHunterAlphaAnimationNeoCosmos5761;
        FrostHunterCameraXPixelTurboCosmos9814();
        JsonWriter jsonWriter = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        jsonWriter.name(str);
        FrostHunterCameraXPixelTurboCosmos9814();
        jsonWriter.value(i);
        return this;
    }
}
