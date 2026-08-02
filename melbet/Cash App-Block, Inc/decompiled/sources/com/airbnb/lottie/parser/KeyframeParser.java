package com.airbnb.lottie.parser;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import androidx.collection.SieveCacheKt;
import androidx.collection.SparseArrayCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.L;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.Keyframe;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
class KeyframeParser {
    private static final float MAX_CP_VALUE = 100.0f;
    private static SparseArrayCompat pathInterpolatorCache;
    private static final Interpolator LINEAR_INTERPOLATOR = new LinearInterpolator();
    static JsonReader.Options NAMES = JsonReader.Options.of("t", "s", "e", "o", "i", "h", "to", "ti");
    static JsonReader.Options INTERPOLATOR_NAMES = JsonReader.Options.of("x", "y");

    private static WeakReference<Interpolator> getInterpolator(int i) {
        WeakReference<Interpolator> weakReference;
        synchronized (KeyframeParser.class) {
            SparseArrayCompat pathInterpolatorCache2 = pathInterpolatorCache();
            pathInterpolatorCache2.getClass();
            weakReference = (WeakReference) SieveCacheKt.commonGet(pathInterpolatorCache2, i);
        }
        return weakReference;
    }

    private static Interpolator interpolatorFor(PointF pointF, PointF pointF2) {
        Interpolator pathInterpolator;
        pointF.x = MiscUtils.clamp(pointF.x, -1.0f, 1.0f);
        pointF.y = MiscUtils.clamp(pointF.y, -100.0f, MAX_CP_VALUE);
        pointF2.x = MiscUtils.clamp(pointF2.x, -1.0f, 1.0f);
        float clamp = MiscUtils.clamp(pointF2.y, -100.0f, MAX_CP_VALUE);
        pointF2.y = clamp;
        int hashFor = Utils.hashFor(pointF.x, pointF.y, pointF2.x, clamp);
        WeakReference<Interpolator> interpolator = L.getDisablePathInterpolatorCache() ? null : getInterpolator(hashFor);
        Interpolator interpolator2 = interpolator != null ? interpolator.get() : null;
        if (interpolator != null && interpolator2 != null) {
            return interpolator2;
        }
        try {
            pathInterpolator = new PathInterpolator(pointF.x, pointF.y, pointF2.x, pointF2.y);
        } catch (IllegalArgumentException e) {
            pathInterpolator = "The Path cannot loop back on itself.".equals(e.getMessage()) ? new PathInterpolator(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, RecyclerView.DECELERATION_RATE), pointF2.y) : new LinearInterpolator();
        }
        if (!L.getDisablePathInterpolatorCache()) {
            try {
                putInterpolator(hashFor, new WeakReference(pathInterpolator));
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return pathInterpolator;
    }

    public static <T> Keyframe<T> parse(JsonReader jsonReader, LottieComposition lottieComposition, float f, ValueParser<T> valueParser, boolean z, boolean z2) {
        return (z && z2) ? parseMultiDimensionalKeyframe(lottieComposition, jsonReader, f, valueParser) : z ? parseKeyframe(lottieComposition, jsonReader, f, valueParser) : parseStaticValue(jsonReader, f, valueParser);
    }

    private static <T> Keyframe<T> parseKeyframe(LottieComposition lottieComposition, JsonReader jsonReader, float f, ValueParser<T> valueParser) {
        Interpolator interpolatorFor;
        T t;
        jsonReader.beginObject();
        PointF pointF = null;
        T t2 = null;
        T t3 = null;
        PointF pointF2 = null;
        PointF pointF3 = null;
        float f2 = 0.0f;
        boolean z = false;
        PointF pointF4 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(NAMES)) {
                case 0:
                    f2 = (float) jsonReader.nextDouble();
                    break;
                case 1:
                    t3 = valueParser.parse(jsonReader, f);
                    break;
                case 2:
                    t2 = valueParser.parse(jsonReader, f);
                    break;
                case 3:
                    pointF = JsonUtils.jsonToPoint(jsonReader, 1.0f);
                    break;
                case 4:
                    pointF4 = JsonUtils.jsonToPoint(jsonReader, 1.0f);
                    break;
                case 5:
                    if (jsonReader.nextInt() != 1) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                case 6:
                    pointF2 = JsonUtils.jsonToPoint(jsonReader, f);
                    break;
                case 7:
                    pointF3 = JsonUtils.jsonToPoint(jsonReader, f);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (z) {
            interpolatorFor = LINEAR_INTERPOLATOR;
            t = t3;
        } else {
            interpolatorFor = (pointF == null || pointF4 == null) ? LINEAR_INTERPOLATOR : interpolatorFor(pointF, pointF4);
            t = t2;
        }
        Keyframe<T> keyframe = new Keyframe<>(lottieComposition, t3, t, interpolatorFor, f2, null);
        keyframe.pathCp1 = pointF2;
        keyframe.pathCp2 = pointF3;
        return keyframe;
    }

    private static <T> Keyframe<T> parseMultiDimensionalKeyframe(LottieComposition lottieComposition, JsonReader jsonReader, float f, ValueParser<T> valueParser) {
        Interpolator interpolator;
        Interpolator interpolatorFor;
        Interpolator interpolatorFor2;
        T t;
        Interpolator interpolator2;
        PointF pointF;
        PointF pointF2;
        Keyframe<T> keyframe;
        PointF pointF3;
        boolean z;
        float f2;
        jsonReader.beginObject();
        boolean z2 = false;
        PointF pointF4 = null;
        PointF pointF5 = null;
        PointF pointF6 = null;
        T t2 = null;
        PointF pointF7 = null;
        PointF pointF8 = null;
        PointF pointF9 = null;
        PointF pointF10 = null;
        PointF pointF11 = null;
        float f3 = RecyclerView.DECELERATION_RATE;
        T t3 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(NAMES)) {
                case 0:
                    f3 = (float) jsonReader.nextDouble();
                    break;
                case 1:
                    t2 = valueParser.parse(jsonReader, f);
                    break;
                case 2:
                    t3 = valueParser.parse(jsonReader, f);
                    break;
                case 3:
                    boolean z3 = z2;
                    if (jsonReader.peek() == JsonReader.Token.BEGIN_OBJECT) {
                        jsonReader.beginObject();
                        float f4 = RecyclerView.DECELERATION_RATE;
                        float f5 = RecyclerView.DECELERATION_RATE;
                        float f6 = RecyclerView.DECELERATION_RATE;
                        float f7 = RecyclerView.DECELERATION_RATE;
                        while (jsonReader.hasNext()) {
                            int selectName = jsonReader.selectName(INTERPOLATOR_NAMES);
                            if (selectName == 0) {
                                pointF3 = pointF8;
                                JsonReader.Token peek = jsonReader.peek();
                                JsonReader.Token token = JsonReader.Token.NUMBER;
                                if (peek == token) {
                                    f6 = (float) jsonReader.nextDouble();
                                    f4 = f6;
                                } else {
                                    jsonReader.beginArray();
                                    f4 = (float) jsonReader.nextDouble();
                                    f6 = jsonReader.peek() == token ? (float) jsonReader.nextDouble() : f4;
                                    jsonReader.endArray();
                                }
                            } else if (selectName != 1) {
                                jsonReader.skipValue();
                            } else {
                                JsonReader.Token peek2 = jsonReader.peek();
                                JsonReader.Token token2 = JsonReader.Token.NUMBER;
                                if (peek2 == token2) {
                                    pointF3 = pointF8;
                                    f7 = (float) jsonReader.nextDouble();
                                    f5 = f7;
                                } else {
                                    pointF3 = pointF8;
                                    jsonReader.beginArray();
                                    f5 = (float) jsonReader.nextDouble();
                                    f7 = jsonReader.peek() == token2 ? (float) jsonReader.nextDouble() : f5;
                                    jsonReader.endArray();
                                }
                            }
                            pointF8 = pointF3;
                        }
                        pointF6 = new PointF(f4, f5);
                        pointF7 = new PointF(f6, f7);
                        jsonReader.endObject();
                    } else {
                        pointF4 = JsonUtils.jsonToPoint(jsonReader, f);
                    }
                    z2 = z3;
                    break;
                case 4:
                    if (jsonReader.peek() != JsonReader.Token.BEGIN_OBJECT) {
                        pointF5 = JsonUtils.jsonToPoint(jsonReader, f);
                        break;
                    } else {
                        jsonReader.beginObject();
                        float f8 = RecyclerView.DECELERATION_RATE;
                        float f9 = RecyclerView.DECELERATION_RATE;
                        float f10 = RecyclerView.DECELERATION_RATE;
                        float f11 = RecyclerView.DECELERATION_RATE;
                        while (jsonReader.hasNext()) {
                            int selectName2 = jsonReader.selectName(INTERPOLATOR_NAMES);
                            if (selectName2 != 0) {
                                z = z2;
                                if (selectName2 != 1) {
                                    jsonReader.skipValue();
                                } else {
                                    JsonReader.Token peek3 = jsonReader.peek();
                                    JsonReader.Token token3 = JsonReader.Token.NUMBER;
                                    if (peek3 == token3) {
                                        f11 = (float) jsonReader.nextDouble();
                                        f9 = f11;
                                    } else {
                                        jsonReader.beginArray();
                                        PointF pointF12 = pointF10;
                                        float nextDouble = (float) jsonReader.nextDouble();
                                        f11 = jsonReader.peek() == token3 ? (float) jsonReader.nextDouble() : nextDouble;
                                        jsonReader.endArray();
                                        pointF10 = pointF12;
                                        f9 = nextDouble;
                                    }
                                }
                            } else {
                                z = z2;
                                PointF pointF13 = pointF10;
                                JsonReader.Token peek4 = jsonReader.peek();
                                JsonReader.Token token4 = JsonReader.Token.NUMBER;
                                if (peek4 == token4) {
                                    pointF10 = pointF13;
                                    f10 = (float) jsonReader.nextDouble();
                                    f8 = f10;
                                } else {
                                    pointF10 = pointF13;
                                    jsonReader.beginArray();
                                    float nextDouble2 = (float) jsonReader.nextDouble();
                                    if (jsonReader.peek() == token4) {
                                        f2 = nextDouble2;
                                        f10 = (float) jsonReader.nextDouble();
                                    } else {
                                        f2 = nextDouble2;
                                        f10 = f2;
                                    }
                                    jsonReader.endArray();
                                    f8 = f2;
                                }
                            }
                            z2 = z;
                        }
                        PointF pointF14 = new PointF(f8, f9);
                        PointF pointF15 = new PointF(f10, f11);
                        jsonReader.endObject();
                        pointF9 = pointF15;
                        pointF8 = pointF14;
                        break;
                    }
                case 5:
                    if (jsonReader.nextInt() != 1) {
                        z2 = false;
                        break;
                    } else {
                        z2 = true;
                        break;
                    }
                case 6:
                    pointF10 = JsonUtils.jsonToPoint(jsonReader, f);
                    break;
                case 7:
                    pointF11 = JsonUtils.jsonToPoint(jsonReader, f);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        boolean z4 = z2;
        PointF pointF16 = pointF8;
        jsonReader.endObject();
        if (z4) {
            interpolator2 = LINEAR_INTERPOLATOR;
            t = t2;
        } else {
            if (pointF4 != null && pointF5 != null) {
                interpolator = interpolatorFor(pointF4, pointF5);
            } else {
                if (pointF6 != null && pointF7 != null && pointF16 != null && pointF9 != null) {
                    interpolatorFor = interpolatorFor(pointF6, pointF16);
                    interpolatorFor2 = interpolatorFor(pointF7, pointF9);
                    t = t3;
                    interpolator2 = null;
                    if (interpolatorFor != null || interpolatorFor2 == null) {
                        pointF = pointF10;
                        pointF2 = pointF11;
                        keyframe = new Keyframe<>(lottieComposition, t2, t, interpolator2, f3, null);
                    } else {
                        pointF2 = pointF11;
                        pointF = pointF10;
                        keyframe = new Keyframe<>(lottieComposition, t2, t, interpolatorFor, interpolatorFor2, f3, null);
                    }
                    keyframe.pathCp1 = pointF;
                    keyframe.pathCp2 = pointF2;
                    return keyframe;
                }
                interpolator = LINEAR_INTERPOLATOR;
            }
            interpolator2 = interpolator;
            t = t3;
        }
        interpolatorFor = null;
        interpolatorFor2 = null;
        if (interpolatorFor != null) {
        }
        pointF = pointF10;
        pointF2 = pointF11;
        keyframe = new Keyframe<>(lottieComposition, t2, t, interpolator2, f3, null);
        keyframe.pathCp1 = pointF;
        keyframe.pathCp2 = pointF2;
        return keyframe;
    }

    private static <T> Keyframe<T> parseStaticValue(JsonReader jsonReader, float f, ValueParser<T> valueParser) {
        return new Keyframe<>(valueParser.parse(jsonReader, f));
    }

    private static SparseArrayCompat pathInterpolatorCache() {
        if (pathInterpolatorCache == null) {
            pathInterpolatorCache = new SparseArrayCompat((Object) null);
        }
        return pathInterpolatorCache;
    }

    private static void putInterpolator(int i, WeakReference<Interpolator> weakReference) {
        synchronized (KeyframeParser.class) {
            pathInterpolatorCache.put(i, weakReference);
        }
    }
}
