package com.google.gson;

import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.internal.NumberLimits;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.MalformedJsonException;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.math.BigDecimal;

/* loaded from: classes4.dex */
public enum ToNumberPolicy implements ToNumberStrategy {
    DOUBLE { // from class: com.google.gson.ToNumberPolicy.1
        @Override // com.google.gson.ToNumberStrategy
        public Double readNumber(JsonReader jsonReader) {
            return Double.valueOf(jsonReader.nextDouble());
        }
    },
    LAZILY_PARSED_NUMBER { // from class: com.google.gson.ToNumberPolicy.2
        @Override // com.google.gson.ToNumberStrategy
        public Number readNumber(JsonReader jsonReader) {
            return new LazilyParsedNumber(jsonReader.nextString());
        }
    },
    LONG_OR_DOUBLE { // from class: com.google.gson.ToNumberPolicy.3
        private Number parseAsDouble(String str, JsonReader jsonReader) {
            try {
                Double valueOf = Double.valueOf(str);
                if (!valueOf.isInfinite()) {
                    if (valueOf.isNaN()) {
                    }
                    return valueOf;
                }
                if (!jsonReader.isLenient()) {
                    throw new MalformedJsonException("JSON forbids NaN and infinities: " + valueOf + "; at path " + jsonReader.getPreviousPath());
                }
                return valueOf;
            } catch (NumberFormatException e) {
                StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("Cannot parse ", str, "; at path ");
                m3m.append(jsonReader.getPreviousPath());
                throw new JsonParseException(m3m.toString(), e);
            }
        }

        @Override // com.google.gson.ToNumberStrategy
        public Number readNumber(JsonReader jsonReader) {
            String nextString = jsonReader.nextString();
            if (nextString.indexOf(46) >= 0) {
                return parseAsDouble(nextString, jsonReader);
            }
            try {
                return Long.valueOf(Long.parseLong(nextString));
            } catch (NumberFormatException unused) {
                return this.parseAsDouble(nextString, jsonReader);
            }
        }
    },
    BIG_DECIMAL { // from class: com.google.gson.ToNumberPolicy.4
        @Override // com.google.gson.ToNumberStrategy
        public BigDecimal readNumber(JsonReader jsonReader) {
            String nextString = jsonReader.nextString();
            try {
                return NumberLimits.parseBigDecimal(nextString);
            } catch (NumberFormatException e) {
                StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("Cannot parse ", nextString, "; at path ");
                m3m.append(jsonReader.getPreviousPath());
                throw new JsonParseException(m3m.toString(), e);
            }
        }
    }
}
