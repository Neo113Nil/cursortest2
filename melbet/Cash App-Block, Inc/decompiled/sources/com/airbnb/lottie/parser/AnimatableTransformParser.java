package com.airbnb.lottie.parser;

import android.graphics.PointF;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.animatable.AnimatablePathValue;
import com.airbnb.lottie.model.animatable.AnimatableScaleValue;
import com.airbnb.lottie.model.animatable.AnimatableSplitDimensionPathValue;
import com.airbnb.lottie.model.animatable.AnimatableTransform;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.ScaleXY;

/* loaded from: classes3.dex */
public class AnimatableTransformParser {
    private static final JsonReader.Options NAMES = JsonReader.Options.of("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa", "rx", "ry");
    private static final JsonReader.Options ANIMATABLE_NAMES = JsonReader.Options.of("k");

    private AnimatableTransformParser() {
    }

    private static void ensureValidRotationKeyframes(AnimatableFloatValue animatableFloatValue, LottieComposition lottieComposition) {
        Float valueOf = Float.valueOf(RecyclerView.DECELERATION_RATE);
        if (animatableFloatValue.getKeyframes().isEmpty()) {
            animatableFloatValue.getKeyframes().add(new Keyframe(lottieComposition, valueOf, valueOf, null, RecyclerView.DECELERATION_RATE, Float.valueOf(lottieComposition.getEndFrame())));
        } else if (((Keyframe) animatableFloatValue.getKeyframes().get(0)).startValue == 0) {
            animatableFloatValue.getKeyframes().set(0, new Keyframe(lottieComposition, valueOf, valueOf, null, RecyclerView.DECELERATION_RATE, Float.valueOf(lottieComposition.getEndFrame())));
        }
    }

    private static boolean isAnchorPointIdentity(AnimatablePathValue animatablePathValue) {
        if (animatablePathValue != null) {
            return animatablePathValue.isStatic() && animatablePathValue.getKeyframes().get(0).startValue.equals(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
        }
        return true;
    }

    private static boolean isPositionIdentity(AnimatableValue<PointF, PointF> animatableValue) {
        if (animatableValue != null) {
            return !(animatableValue instanceof AnimatableSplitDimensionPathValue) && animatableValue.isStatic() && animatableValue.getKeyframes().get(0).startValue.equals(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean isRotationIdentity(AnimatableFloatValue animatableFloatValue) {
        if (animatableFloatValue != null) {
            return animatableFloatValue.isStatic() && ((Float) ((Keyframe) animatableFloatValue.getKeyframes().get(0)).startValue).floatValue() == RecyclerView.DECELERATION_RATE;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean isScaleIdentity(AnimatableScaleValue animatableScaleValue) {
        if (animatableScaleValue != null) {
            return animatableScaleValue.isStatic() && ((ScaleXY) ((Keyframe) animatableScaleValue.getKeyframes().get(0)).startValue).equals(1.0f, 1.0f);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean isSkewAngleIdentity(AnimatableFloatValue animatableFloatValue) {
        if (animatableFloatValue != null) {
            return animatableFloatValue.isStatic() && ((Float) ((Keyframe) animatableFloatValue.getKeyframes().get(0)).startValue).floatValue() == RecyclerView.DECELERATION_RATE;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean isSkewIdentity(AnimatableFloatValue animatableFloatValue) {
        if (animatableFloatValue != null) {
            return animatableFloatValue.isStatic() && ((Float) ((Keyframe) animatableFloatValue.getKeyframes().get(0)).startValue).floatValue() == RecyclerView.DECELERATION_RATE;
        }
        return true;
    }

    public static AnimatableTransform parse(JsonReader jsonReader, LottieComposition lottieComposition) {
        boolean z = jsonReader.peek() == JsonReader.Token.BEGIN_OBJECT;
        if (z) {
            jsonReader.beginObject();
        }
        AnimatablePathValue animatablePathValue = null;
        AnimatableValue<PointF, PointF> animatableValue = null;
        AnimatableFloatValue animatableFloatValue = null;
        AnimatableScaleValue animatableScaleValue = null;
        AnimatableFloatValue animatableFloatValue2 = null;
        AnimatableFloatValue animatableFloatValue3 = null;
        AnimatableFloatValue animatableFloatValue4 = null;
        AnimatableFloatValue animatableFloatValue5 = null;
        AnimatableFloatValue animatableFloatValue6 = null;
        AnimatableIntegerValue animatableIntegerValue = null;
        AnimatableFloatValue animatableFloatValue7 = null;
        AnimatableFloatValue animatableFloatValue8 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(NAMES)) {
                case 0:
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        if (jsonReader.selectName(ANIMATABLE_NAMES) != 0) {
                            jsonReader.skipName();
                            jsonReader.skipValue();
                        } else {
                            animatablePathValue = AnimatablePathValueParser.parse(jsonReader, lottieComposition);
                        }
                    }
                    jsonReader.endObject();
                    break;
                case 1:
                    animatableValue = AnimatablePathValueParser.parseSplitPath(jsonReader, lottieComposition);
                    break;
                case 2:
                    animatableScaleValue = AnimatableValueParser.parseScale(jsonReader, lottieComposition);
                    break;
                case 3:
                    animatableFloatValue6 = AnimatableValueParser.parseFloat(jsonReader, lottieComposition, false);
                    ensureValidRotationKeyframes(animatableFloatValue6, lottieComposition);
                    break;
                case 4:
                    animatableFloatValue = AnimatableValueParser.parseFloat(jsonReader, lottieComposition, false);
                    ensureValidRotationKeyframes(animatableFloatValue, lottieComposition);
                    break;
                case 5:
                    animatableIntegerValue = AnimatableValueParser.parseInteger(jsonReader, lottieComposition);
                    break;
                case 6:
                    animatableFloatValue7 = AnimatableValueParser.parseFloat(jsonReader, lottieComposition, false);
                    break;
                case 7:
                    animatableFloatValue8 = AnimatableValueParser.parseFloat(jsonReader, lottieComposition, false);
                    break;
                case 8:
                    animatableFloatValue2 = AnimatableValueParser.parseFloat(jsonReader, lottieComposition, false);
                    break;
                case 9:
                    animatableFloatValue3 = AnimatableValueParser.parseFloat(jsonReader, lottieComposition, false);
                    break;
                case 10:
                    animatableFloatValue4 = AnimatableValueParser.parseFloat(jsonReader, lottieComposition, false);
                    ensureValidRotationKeyframes(animatableFloatValue4, lottieComposition);
                    break;
                case 11:
                    animatableFloatValue5 = AnimatableValueParser.parseFloat(jsonReader, lottieComposition, false);
                    ensureValidRotationKeyframes(animatableFloatValue5, lottieComposition);
                    break;
                default:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
            }
        }
        if (z) {
            jsonReader.endObject();
        }
        return new AnimatableTransform(isAnchorPointIdentity(animatablePathValue) ? null : animatablePathValue, isPositionIdentity(animatableValue) ? null : animatableValue, isScaleIdentity(animatableScaleValue) ? null : animatableScaleValue, isRotationIdentity(animatableFloatValue) ? null : animatableFloatValue, animatableIntegerValue, animatableFloatValue7, animatableFloatValue8, isSkewIdentity(animatableFloatValue2) ? null : animatableFloatValue2, isSkewAngleIdentity(animatableFloatValue3) ? null : animatableFloatValue3, isRotationIdentity(animatableFloatValue4) ? null : animatableFloatValue4, isRotationIdentity(animatableFloatValue5) ? null : animatableFloatValue5, isRotationIdentity(animatableFloatValue6) ? null : animatableFloatValue6);
    }
}
