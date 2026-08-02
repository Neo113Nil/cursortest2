package com.airbnb.lottie.parser;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.animatable.AnimatableShapeValue;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.Logger;

/* loaded from: classes3.dex */
class MaskParser {
    private MaskParser() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006f, code lost:
    
        if (r0.equals("s") == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Mask parse(JsonReader jsonReader, LottieComposition lottieComposition) {
        boolean z;
        jsonReader.beginObject();
        Mask.MaskMode maskMode = null;
        AnimatableShapeValue animatableShapeValue = null;
        AnimatableIntegerValue animatableIntegerValue = null;
        boolean z2 = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c = 3;
            switch (nextName.hashCode()) {
                case 111:
                    if (nextName.equals("o")) {
                        z = false;
                        break;
                    }
                    z = -1;
                    break;
                case 3588:
                    if (nextName.equals("pt")) {
                        z = true;
                        break;
                    }
                    z = -1;
                    break;
                case 104433:
                    if (nextName.equals("inv")) {
                        z = 2;
                        break;
                    }
                    z = -1;
                    break;
                case 3357091:
                    if (nextName.equals("mode")) {
                        z = 3;
                        break;
                    }
                    z = -1;
                    break;
                default:
                    z = -1;
                    break;
            }
            switch (z) {
                case false:
                    animatableIntegerValue = AnimatableValueParser.parseInteger(jsonReader, lottieComposition);
                    break;
                case true:
                    animatableShapeValue = AnimatableValueParser.parseShapeData(jsonReader, lottieComposition);
                    break;
                case true:
                    z2 = jsonReader.nextBoolean();
                    break;
                case true:
                    String nextString = jsonReader.nextString();
                    nextString.getClass();
                    switch (nextString.hashCode()) {
                        case 97:
                            if (nextString.equals("a")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 105:
                            if (nextString.equals("i")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 110:
                            if (nextString.equals("n")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 115:
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        case 0:
                            maskMode = Mask.MaskMode.MASK_MODE_ADD;
                            break;
                        case 1:
                            lottieComposition.addWarning("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                            maskMode = Mask.MaskMode.MASK_MODE_INTERSECT;
                            break;
                        case 2:
                            maskMode = Mask.MaskMode.MASK_MODE_NONE;
                            break;
                        case 3:
                            maskMode = Mask.MaskMode.MASK_MODE_SUBTRACT;
                            break;
                        default:
                            Logger.warning("Unknown mask mode " + nextName + ". Defaulting to Add.");
                            maskMode = Mask.MaskMode.MASK_MODE_ADD;
                            break;
                    }
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new Mask(maskMode, animatableShapeValue, animatableIntegerValue, z2);
    }
}
