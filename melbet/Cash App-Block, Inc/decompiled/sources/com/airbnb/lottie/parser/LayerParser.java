package com.airbnb.lottie.parser;

import android.graphics.Color;
import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableTextFrame;
import com.airbnb.lottie.model.animatable.AnimatableTextProperties;
import com.airbnb.lottie.model.animatable.AnimatableTransform;
import com.airbnb.lottie.model.content.BlurEffect;
import com.airbnb.lottie.model.content.ContentModel;
import com.airbnb.lottie.model.content.LBlendMode;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.Keyframe;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public class LayerParser {
    private static final JsonReader.Options NAMES = JsonReader.Options.of("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd", "ao", "bm");
    private static final JsonReader.Options TEXT_NAMES = JsonReader.Options.of("d", "a");
    private static final JsonReader.Options EFFECTS_NAMES = JsonReader.Options.of("ty", "nm");

    /* renamed from: com.airbnb.lottie.parser.LayerParser$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$airbnb$lottie$model$layer$Layer$MatteType;

        static {
            int[] iArr = new int[Layer.MatteType.values().length];
            $SwitchMap$com$airbnb$lottie$model$layer$Layer$MatteType = iArr;
            try {
                iArr[Layer.MatteType.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$model$layer$Layer$MatteType[Layer.MatteType.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private LayerParser() {
    }

    public static Layer parse(JsonReader jsonReader, LottieComposition lottieComposition) {
        Float f;
        boolean z;
        float f2;
        Float valueOf = Float.valueOf(RecyclerView.DECELERATION_RATE);
        Float valueOf2 = Float.valueOf(1.0f);
        Layer.MatteType matteType = Layer.MatteType.NONE;
        LBlendMode lBlendMode = LBlendMode.NORMAL;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        jsonReader.beginObject();
        boolean z2 = false;
        Layer.MatteType matteType2 = matteType;
        LBlendMode lBlendMode2 = lBlendMode;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        String str = null;
        AnimatableTextFrame animatableTextFrame = null;
        AnimatableTextProperties animatableTextProperties = null;
        AnimatableFloatValue animatableFloatValue = null;
        BlurEffect blurEffect = null;
        DropShadowEffect dropShadowEffect = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z3 = false;
        long j2 = -1;
        float f8 = 1.0f;
        String str2 = "UNSET";
        String str3 = null;
        AnimatableTransform animatableTransform = null;
        Layer.LayerType layerType = null;
        boolean z4 = false;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(NAMES)) {
                case 0:
                    str2 = jsonReader.nextString();
                    z2 = false;
                    break;
                case 1:
                    j = jsonReader.nextInt();
                    z2 = false;
                    break;
                case 2:
                    str = jsonReader.nextString();
                    z2 = false;
                    break;
                case 3:
                    f2 = f8;
                    int nextInt = jsonReader.nextInt();
                    layerType = Layer.LayerType.UNKNOWN;
                    if (nextInt < layerType.ordinal()) {
                        layerType = Layer.LayerType.values()[nextInt];
                    }
                    f8 = f2;
                    z2 = false;
                    break;
                case 4:
                    j2 = jsonReader.nextInt();
                    z2 = false;
                    break;
                case 5:
                    i = (int) (Utils.dpScale() * jsonReader.nextInt());
                    z2 = false;
                    break;
                case 6:
                    i2 = (int) (Utils.dpScale() * jsonReader.nextInt());
                    z2 = false;
                    break;
                case 7:
                    i3 = Color.parseColor(jsonReader.nextString());
                    z2 = false;
                    break;
                case 8:
                    animatableTransform = AnimatableTransformParser.parse(jsonReader, lottieComposition);
                    z2 = false;
                    break;
                case 9:
                    f2 = f8;
                    int nextInt2 = jsonReader.nextInt();
                    if (nextInt2 >= Layer.MatteType.values().length) {
                        lottieComposition.addWarning("Unsupported matte type: " + nextInt2);
                    } else {
                        matteType2 = Layer.MatteType.values()[nextInt2];
                        int i4 = AnonymousClass1.$SwitchMap$com$airbnb$lottie$model$layer$Layer$MatteType[matteType2.ordinal()];
                        if (i4 == 1) {
                            lottieComposition.addWarning("Unsupported matte type: Luma");
                        } else if (i4 == 2) {
                            lottieComposition.addWarning("Unsupported matte type: Luma Inverted");
                        }
                        lottieComposition.incrementMatteOrMaskCount(1);
                    }
                    f8 = f2;
                    z2 = false;
                    break;
                case 10:
                    f2 = f8;
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        arrayList.add(MaskParser.parse(jsonReader, lottieComposition));
                    }
                    lottieComposition.incrementMatteOrMaskCount(arrayList.size());
                    jsonReader.endArray();
                    f8 = f2;
                    z2 = false;
                    break;
                case 11:
                    f2 = f8;
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        ContentModel parse = ContentModelParser.parse(jsonReader, lottieComposition);
                        if (parse != null) {
                            arrayList2.add(parse);
                        }
                    }
                    jsonReader.endArray();
                    f8 = f2;
                    z2 = false;
                    break;
                case 12:
                    f2 = f8;
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        int selectName = jsonReader.selectName(TEXT_NAMES);
                        if (selectName == 0) {
                            animatableTextFrame = AnimatableValueParser.parseDocumentData(jsonReader, lottieComposition);
                        } else if (selectName != 1) {
                            jsonReader.skipName();
                            jsonReader.skipValue();
                        } else {
                            jsonReader.beginArray();
                            if (jsonReader.hasNext()) {
                                animatableTextProperties = AnimatableTextPropertiesParser.parse(jsonReader, lottieComposition);
                            }
                            while (jsonReader.hasNext()) {
                                jsonReader.skipValue();
                            }
                            jsonReader.endArray();
                        }
                    }
                    jsonReader.endObject();
                    f8 = f2;
                    z2 = false;
                    break;
                case 13:
                    f2 = f8;
                    jsonReader.beginArray();
                    ArrayList arrayList3 = new ArrayList();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            int selectName2 = jsonReader.selectName(EFFECTS_NAMES);
                            if (selectName2 == 0) {
                                int nextInt3 = jsonReader.nextInt();
                                if (nextInt3 == 29) {
                                    blurEffect = BlurEffectParser.parse(jsonReader, lottieComposition);
                                } else if (nextInt3 == 25) {
                                    dropShadowEffect = new DropShadowEffectParser().parse(jsonReader, lottieComposition);
                                }
                            } else if (selectName2 != 1) {
                                jsonReader.skipName();
                                jsonReader.skipValue();
                            } else {
                                arrayList3.add(jsonReader.nextString());
                            }
                        }
                        jsonReader.endObject();
                    }
                    jsonReader.endArray();
                    lottieComposition.addWarning("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList3);
                    f8 = f2;
                    z2 = false;
                    break;
                case 14:
                    f8 = (float) jsonReader.nextDouble();
                    z2 = false;
                    break;
                case 15:
                    f7 = (float) jsonReader.nextDouble();
                    z2 = false;
                    break;
                case 16:
                    f2 = f8;
                    f5 = (float) (jsonReader.nextDouble() * Utils.dpScale());
                    f8 = f2;
                    z2 = false;
                    break;
                case 17:
                    f2 = f8;
                    f6 = (float) (jsonReader.nextDouble() * Utils.dpScale());
                    f8 = f2;
                    z2 = false;
                    break;
                case 18:
                    f3 = (float) jsonReader.nextDouble();
                    break;
                case 19:
                    f4 = (float) jsonReader.nextDouble();
                    break;
                case 20:
                    animatableFloatValue = AnimatableValueParser.parseFloat(jsonReader, lottieComposition, z2);
                    break;
                case 21:
                    str3 = jsonReader.nextString();
                    break;
                case 22:
                    z3 = jsonReader.nextBoolean();
                    break;
                case 23:
                    if (jsonReader.nextInt() != 1) {
                        z4 = z2;
                        break;
                    } else {
                        z4 = true;
                        break;
                    }
                case 24:
                    int nextInt4 = jsonReader.nextInt();
                    if (nextInt4 < LBlendMode.values().length) {
                        lBlendMode2 = LBlendMode.values()[nextInt4];
                        break;
                    } else {
                        lottieComposition.addWarning("Unsupported Blend Mode: " + nextInt4);
                        lBlendMode2 = LBlendMode.NORMAL;
                        break;
                    }
                default:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    f2 = f8;
                    f8 = f2;
                    z2 = false;
                    break;
            }
        }
        float f9 = f8;
        jsonReader.endObject();
        ArrayList arrayList4 = new ArrayList();
        if (f3 > RecyclerView.DECELERATION_RATE) {
            z = z4;
            f = valueOf;
            arrayList4.add(new Keyframe(lottieComposition, valueOf, valueOf, null, RecyclerView.DECELERATION_RATE, Float.valueOf(f3)));
        } else {
            f = valueOf;
            z = z4;
        }
        if (f4 <= RecyclerView.DECELERATION_RATE) {
            f4 = lottieComposition.getEndFrame();
        }
        arrayList4.add(new Keyframe(lottieComposition, valueOf2, valueOf2, null, f3, Float.valueOf(f4)));
        arrayList4.add(new Keyframe(lottieComposition, f, f, null, f4, Float.valueOf(Float.MAX_VALUE)));
        if (str2.endsWith(".ai") || "ai".equals(str3)) {
            lottieComposition.addWarning("Convert your Illustrator layers to shape layers.");
        }
        if (z) {
            if (animatableTransform == null) {
                animatableTransform = new AnimatableTransform();
            }
            animatableTransform.setAutoOrient(z);
        }
        return new Layer(arrayList2, lottieComposition, str2, j, layerType, j2, str, arrayList, animatableTransform, i, i2, i3, f9, f7, f5, f6, animatableTextFrame, animatableTextProperties, arrayList4, matteType2, animatableFloatValue, z3, blurEffect, dropShadowEffect, lBlendMode2);
    }

    public static Layer parse(LottieComposition lottieComposition) {
        Rect bounds = lottieComposition.getBounds();
        List list = Collections.EMPTY_LIST;
        return new Layer(list, lottieComposition, "__container", -1L, Layer.LayerType.PRE_COMP, -1L, null, list, new AnimatableTransform(), 0, 0, 0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, bounds.width(), bounds.height(), null, null, list, Layer.MatteType.NONE, null, false, null, null, LBlendMode.NORMAL);
    }
}
