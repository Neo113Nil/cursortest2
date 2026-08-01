package com.onesignal.user.internal.operations.impl.executors;

import java.util.LinkedHashMap;
import java.util.Map;
import v7.t;

/* loaded from: classes2.dex */
public final class k {
    public static final k INSTANCE = new k();

    private k() {
    }

    public final Q5.f createPropertiesFromOperation(V5.k operation, Q5.f propertiesObject) {
        kotlin.jvm.internal.h.e(operation, "operation");
        kotlin.jvm.internal.h.e(propertiesObject, "propertiesObject");
        Map<String, String> tags = propertiesObject.getTags();
        LinkedHashMap V8 = tags != null ? t.V(tags) : null;
        if (V8 == null) {
            V8 = new LinkedHashMap();
        }
        LinkedHashMap linkedHashMap = V8;
        linkedHashMap.put(operation.getKey(), operation.getValue());
        return new Q5.f(linkedHashMap, propertiesObject.getLanguage(), propertiesObject.getTimezoneId(), propertiesObject.getCountry(), propertiesObject.getLatitude(), propertiesObject.getLongitude());
    }

    public final Q5.f createPropertiesFromOperation(V5.d operation, Q5.f propertiesObject) {
        kotlin.jvm.internal.h.e(operation, "operation");
        kotlin.jvm.internal.h.e(propertiesObject, "propertiesObject");
        Map<String, String> tags = propertiesObject.getTags();
        LinkedHashMap V8 = tags != null ? t.V(tags) : null;
        if (V8 == null) {
            V8 = new LinkedHashMap();
        }
        LinkedHashMap linkedHashMap = V8;
        linkedHashMap.put(operation.getKey(), null);
        return new Q5.f(linkedHashMap, propertiesObject.getLanguage(), propertiesObject.getTimezoneId(), propertiesObject.getCountry(), propertiesObject.getLatitude(), propertiesObject.getLongitude());
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final Q5.f createPropertiesFromOperation(V5.j operation, Q5.f propertiesObject) {
        String obj;
        String obj2;
        kotlin.jvm.internal.h.e(operation, "operation");
        kotlin.jvm.internal.h.e(propertiesObject, "propertiesObject");
        String property = operation.getProperty();
        r2 = null;
        Double d2 = null;
        r2 = null;
        Double d9 = null;
        switch (property.hashCode()) {
            case -2076227591:
                if (property.equals("timezone")) {
                    Map<String, String> tags = propertiesObject.getTags();
                    String language = propertiesObject.getLanguage();
                    Object value = operation.getValue();
                    return new Q5.f(tags, language, value != null ? value.toString() : null, propertiesObject.getCountry(), propertiesObject.getLatitude(), propertiesObject.getLongitude());
                }
                break;
            case -1613589672:
                if (property.equals("language")) {
                    Map<String, String> tags2 = propertiesObject.getTags();
                    Object value2 = operation.getValue();
                    return new Q5.f(tags2, value2 != null ? value2.toString() : null, propertiesObject.getTimezoneId(), propertiesObject.getCountry(), propertiesObject.getLatitude(), propertiesObject.getLongitude());
                }
                break;
            case -1247204543:
                if (property.equals("locationLatitude")) {
                    Map<String, String> tags3 = propertiesObject.getTags();
                    String language2 = propertiesObject.getLanguage();
                    String timezoneId = propertiesObject.getTimezoneId();
                    String country = propertiesObject.getCountry();
                    Object value3 = operation.getValue();
                    if (value3 != null && (obj = value3.toString()) != null) {
                        d9 = Double.valueOf(Double.parseDouble(obj));
                    }
                    return new Q5.f(tags3, language2, timezoneId, country, d9, propertiesObject.getLongitude());
                }
                break;
            case 957831062:
                if (property.equals("country")) {
                    Map<String, String> tags4 = propertiesObject.getTags();
                    String language3 = propertiesObject.getLanguage();
                    String timezoneId2 = propertiesObject.getTimezoneId();
                    Object value4 = operation.getValue();
                    return new Q5.f(tags4, language3, timezoneId2, value4 != null ? value4.toString() : null, propertiesObject.getLatitude(), propertiesObject.getLongitude());
                }
                break;
            case 1818387834:
                if (property.equals("locationLongitude")) {
                    Map<String, String> tags5 = propertiesObject.getTags();
                    String language4 = propertiesObject.getLanguage();
                    String timezoneId3 = propertiesObject.getTimezoneId();
                    String country2 = propertiesObject.getCountry();
                    Double latitude = propertiesObject.getLatitude();
                    Object value5 = operation.getValue();
                    if (value5 != null && (obj2 = value5.toString()) != null) {
                        d2 = Double.valueOf(Double.parseDouble(obj2));
                    }
                    return new Q5.f(tags5, language4, timezoneId3, country2, latitude, d2);
                }
                break;
        }
        return new Q5.f(propertiesObject.getTags(), propertiesObject.getLanguage(), propertiesObject.getTimezoneId(), propertiesObject.getCountry(), propertiesObject.getLatitude(), propertiesObject.getLongitude());
    }
}
