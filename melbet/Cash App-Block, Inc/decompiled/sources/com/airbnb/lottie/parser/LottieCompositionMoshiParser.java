package com.airbnb.lottie.parser;

import android.graphics.Rect;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieImageAsset;
import com.airbnb.lottie.model.Font;
import com.airbnb.lottie.model.FontCharacter;
import com.airbnb.lottie.model.Marker;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.Utils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class LottieCompositionMoshiParser {
    private static final JsonReader.Options NAMES = JsonReader.Options.of("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");
    static JsonReader.Options ASSETS_NAMES = JsonReader.Options.of("id", "layers", "w", "h", "p", "u");
    private static final JsonReader.Options FONT_NAMES = JsonReader.Options.of("list");
    private static final JsonReader.Options MARKER_NAMES = JsonReader.Options.of("cm", "tm", "dr");

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0045. Please report as an issue. */
    public static LottieComposition parse(JsonReader jsonReader) {
        float f;
        JsonReader jsonReader2 = jsonReader;
        float dpScale = Utils.dpScale();
        LongSparseArray longSparseArray = new LongSparseArray((Object) null);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        SparseArrayCompat sparseArrayCompat = new SparseArrayCompat((Object) null);
        LottieComposition lottieComposition = new LottieComposition();
        jsonReader2.beginObject();
        float f2 = RecyclerView.DECELERATION_RATE;
        float f3 = 0.0f;
        float f4 = 0.0f;
        int i = 0;
        int i2 = 0;
        while (jsonReader2.hasNext()) {
            switch (jsonReader2.selectName(NAMES)) {
                case 0:
                    f = dpScale;
                    i2 = (int) jsonReader.nextDouble();
                    jsonReader2 = jsonReader;
                    dpScale = f;
                    break;
                case 1:
                    f = dpScale;
                    i = (int) jsonReader.nextDouble();
                    jsonReader2 = jsonReader;
                    dpScale = f;
                    break;
                case 2:
                    f = dpScale;
                    f2 = (float) jsonReader.nextDouble();
                    jsonReader2 = jsonReader;
                    dpScale = f;
                    break;
                case 3:
                    f = dpScale;
                    f3 = ((float) jsonReader.nextDouble()) - 0.01f;
                    jsonReader2 = jsonReader;
                    dpScale = f;
                    break;
                case 4:
                    f = dpScale;
                    f4 = (float) jsonReader.nextDouble();
                    jsonReader2 = jsonReader;
                    dpScale = f;
                    break;
                case 5:
                    String[] split = jsonReader2.nextString().split("\\.");
                    if (!Utils.isAtLeastVersion(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), 4, 4, 0)) {
                        lottieComposition.addWarning("Lottie only supports bodymovin >= 4.4.0");
                    }
                    jsonReader2 = jsonReader;
                    break;
                case 6:
                    parseLayers(jsonReader2, lottieComposition, arrayList, longSparseArray);
                    jsonReader2 = jsonReader;
                    break;
                case 7:
                    parseAssets(jsonReader2, lottieComposition, hashMap, hashMap2);
                    jsonReader2 = jsonReader;
                    break;
                case 8:
                    parseFonts(jsonReader2, hashMap3);
                    jsonReader2 = jsonReader;
                    break;
                case 9:
                    parseChars(jsonReader2, lottieComposition, sparseArrayCompat);
                    jsonReader2 = jsonReader;
                    break;
                case 10:
                    parseMarkers(jsonReader2, arrayList2);
                    jsonReader2 = jsonReader;
                    break;
                default:
                    jsonReader2.skipName();
                    jsonReader2.skipValue();
                    jsonReader2 = jsonReader;
                    break;
            }
        }
        float f5 = dpScale;
        lottieComposition.init(new Rect(0, 0, (int) (i2 * f5), (int) (i * f5)), f2, f3, f4, arrayList, longSparseArray, hashMap, hashMap2, Utils.dpScale(), sparseArrayCompat, hashMap3, arrayList2, i2, i);
        return lottieComposition;
    }

    private static void parseAssets(JsonReader jsonReader, LottieComposition lottieComposition, Map<String, List<Layer>> map, Map<String, LottieImageAsset> map2) {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            ArrayList arrayList = new ArrayList();
            LongSparseArray longSparseArray = new LongSparseArray((Object) null);
            jsonReader.beginObject();
            String str = null;
            String str2 = null;
            String str3 = null;
            int i = 0;
            int i2 = 0;
            while (jsonReader.hasNext()) {
                int selectName = jsonReader.selectName(ASSETS_NAMES);
                if (selectName == 0) {
                    str = jsonReader.nextString();
                } else if (selectName == 1) {
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        Layer parse = LayerParser.parse(jsonReader, lottieComposition);
                        longSparseArray.put(parse, parse.getId());
                        arrayList.add(parse);
                    }
                    jsonReader.endArray();
                } else if (selectName == 2) {
                    i = jsonReader.nextInt();
                } else if (selectName == 3) {
                    i2 = jsonReader.nextInt();
                } else if (selectName == 4) {
                    str2 = jsonReader.nextString();
                } else if (selectName != 5) {
                    jsonReader.skipName();
                    jsonReader.skipValue();
                } else {
                    str3 = jsonReader.nextString();
                }
            }
            jsonReader.endObject();
            if (str2 != null) {
                LottieImageAsset lottieImageAsset = new LottieImageAsset(i, i2, str, str2, str3);
                map2.put(lottieImageAsset.getId(), lottieImageAsset);
            } else {
                map.put(str, arrayList);
            }
        }
        jsonReader.endArray();
    }

    private static void parseChars(JsonReader jsonReader, LottieComposition lottieComposition, SparseArrayCompat sparseArrayCompat) {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            FontCharacter parse = FontCharacterParser.parse(jsonReader, lottieComposition);
            sparseArrayCompat.put(parse.hashCode(), parse);
        }
        jsonReader.endArray();
    }

    private static void parseFonts(JsonReader jsonReader, Map<String, Font> map) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.selectName(FONT_NAMES) != 0) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    Font parse = FontParser.parse(jsonReader);
                    map.put(parse.getName(), parse);
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
    }

    private static void parseLayers(JsonReader jsonReader, LottieComposition lottieComposition, List<Layer> list, LongSparseArray longSparseArray) {
        jsonReader.beginArray();
        int i = 0;
        while (jsonReader.hasNext()) {
            Layer parse = LayerParser.parse(jsonReader, lottieComposition);
            if (parse.getLayerType() == Layer.LayerType.IMAGE) {
                i++;
            }
            list.add(parse);
            longSparseArray.put(parse, parse.getId());
            if (i > 4) {
                Logger.warning("You have " + i + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        jsonReader.endArray();
    }

    private static void parseMarkers(JsonReader jsonReader, List<Marker> list) {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            float f = RecyclerView.DECELERATION_RATE;
            String str = null;
            float f2 = 0.0f;
            while (jsonReader.hasNext()) {
                int selectName = jsonReader.selectName(MARKER_NAMES);
                if (selectName == 0) {
                    str = jsonReader.nextString();
                } else if (selectName == 1) {
                    f = (float) jsonReader.nextDouble();
                } else if (selectName != 2) {
                    jsonReader.skipName();
                    jsonReader.skipValue();
                } else {
                    f2 = (float) jsonReader.nextDouble();
                }
            }
            jsonReader.endObject();
            list.add(new Marker(str, f, f2));
        }
        jsonReader.endArray();
    }
}
