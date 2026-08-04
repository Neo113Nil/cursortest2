package com.gamericefishpro.space.eh;

import com.appsflyer.AdRevenueScheme;
import com.gamericefishpro.space.ph.m0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class i {
    public static final i INSTANCE = new i();

    private i() {
    }

    public final com.gamericefishpro.space.vg.f createPropertiesFromOperation(com.gamericefishpro.space.dh.k operation, com.gamericefishpro.space.vg.f propertiesObject) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        Intrinsics.checkNotNullParameter(propertiesObject, "propertiesObject");
        Map<String, String> tags = propertiesObject.getTags();
        LinkedHashMap linkedHashMapI = tags != null ? m0.i(tags) : null;
        if (linkedHashMapI == null) {
            linkedHashMapI = new LinkedHashMap();
        }
        LinkedHashMap linkedHashMap = linkedHashMapI;
        linkedHashMap.put(operation.getKey(), operation.getValue());
        return new com.gamericefishpro.space.vg.f(linkedHashMap, propertiesObject.getLanguage(), propertiesObject.getTimezoneId(), propertiesObject.getCountry(), propertiesObject.getLatitude(), propertiesObject.getLongitude());
    }

    public final com.gamericefishpro.space.vg.f createPropertiesFromOperation(com.gamericefishpro.space.dh.d operation, com.gamericefishpro.space.vg.f propertiesObject) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        Intrinsics.checkNotNullParameter(propertiesObject, "propertiesObject");
        Map<String, String> tags = propertiesObject.getTags();
        LinkedHashMap linkedHashMapI = tags != null ? m0.i(tags) : null;
        if (linkedHashMapI == null) {
            linkedHashMapI = new LinkedHashMap();
        }
        LinkedHashMap linkedHashMap = linkedHashMapI;
        linkedHashMap.put(operation.getKey(), null);
        return new com.gamericefishpro.space.vg.f(linkedHashMap, propertiesObject.getLanguage(), propertiesObject.getTimezoneId(), propertiesObject.getCountry(), propertiesObject.getLatitude(), propertiesObject.getLongitude());
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    public final com.gamericefishpro.space.vg.f createPropertiesFromOperation(com.gamericefishpro.space.dh.j operation, com.gamericefishpro.space.vg.f propertiesObject) {
        String string;
        String string2;
        Intrinsics.checkNotNullParameter(operation, "operation");
        Intrinsics.checkNotNullParameter(propertiesObject, "propertiesObject");
        String property = operation.getProperty();
        Object objValueOf = null;
        switch (property.hashCode()) {
            case -2076227591:
                if (property.equals("timezone")) {
                    Map<String, String> tags = propertiesObject.getTags();
                    String language = propertiesObject.getLanguage();
                    Object value = operation.getValue();
                    return new com.gamericefishpro.space.vg.f(tags, language, value != null ? value.toString() : null, propertiesObject.getCountry(), propertiesObject.getLatitude(), propertiesObject.getLongitude());
                }
                break;
            case -1613589672:
                if (property.equals("language")) {
                    Map<String, String> tags2 = propertiesObject.getTags();
                    Object value2 = operation.getValue();
                    return new com.gamericefishpro.space.vg.f(tags2, value2 != null ? value2.toString() : null, propertiesObject.getTimezoneId(), propertiesObject.getCountry(), propertiesObject.getLatitude(), propertiesObject.getLongitude());
                }
                break;
            case -1247204543:
                if (property.equals("locationLatitude")) {
                    Map<String, String> tags3 = propertiesObject.getTags();
                    String language2 = propertiesObject.getLanguage();
                    String timezoneId = propertiesObject.getTimezoneId();
                    String country = propertiesObject.getCountry();
                    Object value3 = operation.getValue();
                    if (value3 != null && (string = value3.toString()) != null) {
                        objValueOf = Double.valueOf(Double.parseDouble(string));
                    }
                    return new com.gamericefishpro.space.vg.f(tags3, language2, timezoneId, country, objValueOf, propertiesObject.getLongitude());
                }
                break;
            case 957831062:
                if (property.equals(AdRevenueScheme.COUNTRY)) {
                    Map<String, String> tags4 = propertiesObject.getTags();
                    String language3 = propertiesObject.getLanguage();
                    String timezoneId2 = propertiesObject.getTimezoneId();
                    Object value4 = operation.getValue();
                    return new com.gamericefishpro.space.vg.f(tags4, language3, timezoneId2, value4 != null ? value4.toString() : null, propertiesObject.getLatitude(), propertiesObject.getLongitude());
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
                    if (value5 != null && (string2 = value5.toString()) != null) {
                        objValueOf = Double.valueOf(Double.parseDouble(string2));
                    }
                    return new com.gamericefishpro.space.vg.f(tags5, language4, timezoneId3, country2, latitude, objValueOf);
                }
                break;
        }
        return new com.gamericefishpro.space.vg.f(propertiesObject.getTags(), propertiesObject.getLanguage(), propertiesObject.getTimezoneId(), propertiesObject.getCountry(), propertiesObject.getLatitude(), propertiesObject.getLongitude());
    }
}
