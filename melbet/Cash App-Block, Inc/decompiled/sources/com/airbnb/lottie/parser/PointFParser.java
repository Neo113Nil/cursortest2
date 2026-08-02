package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;

/* loaded from: classes3.dex */
public class PointFParser implements ValueParser<PointF> {
    public static final PointFParser INSTANCE = new PointFParser();

    private PointFParser() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.airbnb.lottie.parser.ValueParser
    public PointF parse(JsonReader jsonReader, float f) {
        JsonReader.Token peek = jsonReader.peek();
        if (peek != JsonReader.Token.BEGIN_ARRAY && peek != JsonReader.Token.BEGIN_OBJECT) {
            if (peek != JsonReader.Token.NUMBER) {
                OptionalProvider$$ExternalSyntheticLambda0.m((Object) peek, "Cannot convert json to point. Next token is ");
                return null;
            }
            PointF pointF = new PointF(((float) jsonReader.nextDouble()) * f, ((float) jsonReader.nextDouble()) * f);
            while (jsonReader.hasNext()) {
                jsonReader.skipValue();
            }
            return pointF;
        }
        return JsonUtils.jsonToPoint(jsonReader, f);
    }
}
