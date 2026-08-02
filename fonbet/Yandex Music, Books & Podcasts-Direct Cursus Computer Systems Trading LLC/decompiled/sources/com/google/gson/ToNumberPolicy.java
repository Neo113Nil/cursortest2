package com.google.gson;

import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.internal.NumberLimits;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.MalformedJsonException;
import defpackage.ouj;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public abstract class ToNumberPolicy implements ToNumberStrategy {
    public static final ToNumberPolicy a;
    public static final ToNumberPolicy b;
    public static final /* synthetic */ ToNumberPolicy[] c;

    static {
        ToNumberPolicy toNumberPolicy = new ToNumberPolicy() { // from class: com.google.gson.ToNumberPolicy.1
            @Override // com.google.gson.ToNumberStrategy
            public final Number a(JsonReader jsonReader) {
                return Double.valueOf(jsonReader.nextDouble());
            }
        };
        a = toNumberPolicy;
        ToNumberPolicy toNumberPolicy2 = new ToNumberPolicy() { // from class: com.google.gson.ToNumberPolicy.2
            @Override // com.google.gson.ToNumberStrategy
            public final Number a(JsonReader jsonReader) {
                return new LazilyParsedNumber(jsonReader.f0());
            }
        };
        b = toNumberPolicy2;
        c = new ToNumberPolicy[]{toNumberPolicy, toNumberPolicy2, new ToNumberPolicy() { // from class: com.google.gson.ToNumberPolicy.3
            public static Double b(JsonReader jsonReader, String str) {
                try {
                    Double valueOf = Double.valueOf(str);
                    if (!valueOf.isInfinite()) {
                        if (valueOf.isNaN()) {
                        }
                        return valueOf;
                    }
                    if (!jsonReader.X()) {
                        throw new MalformedJsonException("JSON forbids NaN and infinities: " + valueOf + "; at path " + jsonReader.R());
                    }
                    return valueOf;
                } catch (NumberFormatException e) {
                    StringBuilder u = ouj.u("Cannot parse ", str, "; at path ");
                    u.append(jsonReader.R());
                    throw new JsonParseException(u.toString(), e);
                }
            }

            @Override // com.google.gson.ToNumberStrategy
            public final Number a(JsonReader jsonReader) {
                String f0 = jsonReader.f0();
                if (f0.indexOf(46) >= 0) {
                    return b(jsonReader, f0);
                }
                try {
                    return Long.valueOf(Long.parseLong(f0));
                } catch (NumberFormatException unused) {
                    return b(jsonReader, f0);
                }
            }
        }, new ToNumberPolicy() { // from class: com.google.gson.ToNumberPolicy.4
            @Override // com.google.gson.ToNumberStrategy
            public final Number a(JsonReader jsonReader) {
                String f0 = jsonReader.f0();
                try {
                    return NumberLimits.b(f0);
                } catch (NumberFormatException e) {
                    StringBuilder u = ouj.u("Cannot parse ", f0, "; at path ");
                    u.append(jsonReader.R());
                    throw new JsonParseException(u.toString(), e);
                }
            }
        }};
    }

    public static ToNumberPolicy valueOf(String str) {
        return (ToNumberPolicy) Enum.valueOf(ToNumberPolicy.class, str);
    }

    public static ToNumberPolicy[] values() {
        return (ToNumberPolicy[]) c.clone();
    }
}
