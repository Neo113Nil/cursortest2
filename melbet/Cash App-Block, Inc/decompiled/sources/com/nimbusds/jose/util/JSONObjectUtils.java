package com.nimbusds.jose.util;

import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;
import com.nimbusds.jose.shaded.gson.Gson;
import com.nimbusds.jose.shaded.gson.GsonBuilder;
import com.nimbusds.jose.shaded.gson.JsonIOException;
import com.nimbusds.jose.shaded.gson.internal.GsonTypes;
import com.nimbusds.jose.shaded.gson.stream.JsonWriter;
import com.squareup.cash.work.webview.views.WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes5.dex */
public abstract class JSONObjectUtils {
    public static final Gson GSON;

    static {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.strictness = 3;
        gsonBuilder.serializeNulls = true;
        gsonBuilder.objectToNumberStrategy = 3;
        gsonBuilder.escapeHtmlChars = false;
        GSON = gsonBuilder.create();
    }

    public static Base64URL getBase64URL(String str, Map map) {
        String string2 = getString(str, map);
        if (string2 == null) {
            return null;
        }
        return new Base64URL(string2);
    }

    public static Date getEpochSecondAsDate(String str, Map map) {
        Number number = (Number) getGeneric(map, str, Number.class);
        if (number == null) {
            return null;
        }
        return new Date(number.longValue() * 1000);
    }

    public static Object getGeneric(Map map, String str, Class cls) {
        if (map.get(str) == null) {
            return null;
        }
        Object obj = map.get(str);
        if (cls.isAssignableFrom(obj.getClass())) {
            return obj;
        }
        JWK$$ExternalSyntheticBUOutline0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Unexpected type of JSON object member ", str, ""));
        return null;
    }

    public static Map getJSONObject(String str, Map map) {
        Map map2 = (Map) getGeneric(map, str, Map.class);
        if (map2 == null) {
            return null;
        }
        Iterator it = map2.keySet().iterator();
        while (it.hasNext()) {
            if (!(it.next() instanceof String)) {
                JWK$$ExternalSyntheticBUOutline0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("JSON object member ", str, " not a JSON object"));
                return null;
            }
        }
        return map2;
    }

    public static long getLong(String str, Map map) {
        Number number = (Number) getGeneric(map, str, Number.class);
        if (number != null) {
            return number.longValue();
        }
        JWK$$ExternalSyntheticBUOutline0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("JSON object member ", str, " is missing or null"));
        return 0L;
    }

    public static String getString(String str, Map map) {
        return (String) getGeneric(map, str, String.class);
    }

    public static List getStringList(String str, Map map) {
        String[] strArr;
        List list = (List) getGeneric(map, str, List.class);
        if (list == null) {
            strArr = null;
        } else {
            try {
                strArr = (String[]) list.toArray(new String[0]);
            } catch (ArrayStoreException unused) {
                JWK$$ExternalSyntheticBUOutline0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("JSON object member ", str, " is not an array of strings"));
                return null;
            }
        }
        if (strArr == null) {
            return null;
        }
        return Arrays.asList(strArr);
    }

    public static URI getURI(String str, Map map) {
        String string2 = getString(str, map);
        if (string2 == null) {
            return null;
        }
        try {
            return new URI(string2);
        } catch (URISyntaxException e) {
            JWK$$ExternalSyntheticBUOutline0.m$1(e.getMessage());
            return null;
        }
    }

    public static Map parse(int i, String str) {
        if (str == null) {
            JWK$$ExternalSyntheticBUOutline0.m$1("The JSON object string must not be null");
            return null;
        }
        if (str.trim().isEmpty()) {
            JWK$$ExternalSyntheticBUOutline0.m$1("Invalid JSON object");
            return null;
        }
        if (i >= 0 && str.length() > i) {
            JWK$$ExternalSyntheticBUOutline0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "The parsed string is longer than the max accepted size of ", " characters"));
            return null;
        }
        Type[] typeArr = {String.class, Object.class};
        TypeVariable[] typeParameters = Map.class.getTypeParameters();
        int length = typeParameters.length;
        if (2 != length) {
            WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m(length, Map.class.getName(), " requires ", " type arguments, but got 2");
            return null;
        }
        if (!Modifier.isStatic(Map.class.getModifiers()) && Map.class.getDeclaringClass() != null) {
            a$$ExternalSyntheticBUOutline0.m$3(re$$ExternalSyntheticOutline0.m(Map.class, new StringBuilder("Raw type "), " is not supported because it requires specifying an owner type"));
            return null;
        }
        for (int i2 = 0; i2 < length; i2++) {
            Type type2 = typeArr[i2];
            Objects.requireNonNull(type2, "Type argument must not be null");
            Class<?> rawType = GsonTypes.getRawType(type2);
            TypeVariable typeVariable = typeParameters[i2];
            for (Type type3 : typeVariable.getBounds()) {
                if (!GsonTypes.getRawType(type3).isAssignableFrom(rawType)) {
                    AesGcmSiv$$ExternalSyntheticLambda0.m("Type argument ", type2, " does not satisfy bounds for type variable ", typeVariable, " declared by ", Map.class);
                    return null;
                }
            }
        }
        Type canonicalize = GsonTypes.canonicalize(new GsonTypes.ParameterizedTypeImpl(null, Map.class, typeArr));
        GsonTypes.getRawType(canonicalize);
        canonicalize.hashCode();
        try {
            return (Map) GSON.fromJson(str, canonicalize);
        } catch (Exception unused) {
            JWK$$ExternalSyntheticBUOutline0.m$1("Invalid JSON object");
            return null;
        } catch (StackOverflowError unused2) {
            JWK$$ExternalSyntheticBUOutline0.m$1("Excessive JSON object and / or array nesting");
            return null;
        }
    }

    public static String toJSONString(Map map) {
        Objects.requireNonNull(map);
        Gson gson = GSON;
        gson.getClass();
        Class<?> cls = map.getClass();
        StringWriter stringWriter = new StringWriter();
        try {
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            jsonWriter.setFormattingStyle(gson.formattingStyle);
            jsonWriter.htmlSafe = gson.htmlSafe;
            int i = gson.strictness;
            if (i == 0) {
                i = 2;
            }
            jsonWriter.setStrictness(i);
            jsonWriter.serializeNulls = gson.serializeNulls;
            gson.toJson(map, cls, jsonWriter);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new JsonIOException(e);
        }
    }
}
