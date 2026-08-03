package com.onesignal.user.internal.operations.impl.executors;

import bc.z;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class g {
    public static final g INSTANCE = new g();

    private g() {
    }

    public final gb.f createPropertiesFromOperation(kb.k kVar, gb.f fVar) {
        pc.j.e(kVar, "operation");
        pc.j.e(fVar, "propertiesObject");
        Map<String, String> tags = fVar.getTags();
        LinkedHashMap S = tags != null ? z.S(tags) : null;
        if (S == null) {
            S = new LinkedHashMap();
        }
        LinkedHashMap linkedHashMap = S;
        linkedHashMap.put(kVar.getKey(), kVar.getValue());
        return new gb.f(linkedHashMap, fVar.getLanguage(), fVar.getTimezoneId(), fVar.getCountry(), fVar.getLatitude(), fVar.getLongitude());
    }

    public final gb.f createPropertiesFromOperation(kb.d dVar, gb.f fVar) {
        pc.j.e(dVar, "operation");
        pc.j.e(fVar, "propertiesObject");
        Map<String, String> tags = fVar.getTags();
        LinkedHashMap S = tags != null ? z.S(tags) : null;
        if (S == null) {
            S = new LinkedHashMap();
        }
        LinkedHashMap linkedHashMap = S;
        linkedHashMap.put(dVar.getKey(), null);
        return new gb.f(linkedHashMap, fVar.getLanguage(), fVar.getTimezoneId(), fVar.getCountry(), fVar.getLatitude(), fVar.getLongitude());
    }

    public final gb.f createPropertiesFromOperation(kb.j jVar, gb.f fVar) {
        String obj;
        String obj2;
        pc.j.e(jVar, "operation");
        pc.j.e(fVar, "propertiesObject");
        String property = jVar.getProperty();
        Double d10 = null;
        r2 = null;
        Double d11 = null;
        d10 = null;
        if (pc.j.a(property, "language")) {
            Map<String, String> tags = fVar.getTags();
            Object value = jVar.getValue();
            return new gb.f(tags, value != null ? value.toString() : null, fVar.getTimezoneId(), fVar.getCountry(), fVar.getLatitude(), fVar.getLongitude());
        }
        if (pc.j.a(property, "timezone")) {
            Map<String, String> tags2 = fVar.getTags();
            String language = fVar.getLanguage();
            Object value2 = jVar.getValue();
            return new gb.f(tags2, language, value2 != null ? value2.toString() : null, fVar.getCountry(), fVar.getLatitude(), fVar.getLongitude());
        }
        if (pc.j.a(property, "country")) {
            Map<String, String> tags3 = fVar.getTags();
            String language2 = fVar.getLanguage();
            String timezoneId = fVar.getTimezoneId();
            Object value3 = jVar.getValue();
            return new gb.f(tags3, language2, timezoneId, value3 != null ? value3.toString() : null, fVar.getLatitude(), fVar.getLongitude());
        }
        if (pc.j.a(property, "locationLatitude")) {
            Map<String, String> tags4 = fVar.getTags();
            String language3 = fVar.getLanguage();
            String timezoneId2 = fVar.getTimezoneId();
            String country = fVar.getCountry();
            Object value4 = jVar.getValue();
            if (value4 != null && (obj2 = value4.toString()) != null) {
                d11 = Double.valueOf(Double.parseDouble(obj2));
            }
            return new gb.f(tags4, language3, timezoneId2, country, d11, fVar.getLongitude());
        }
        if (pc.j.a(property, "locationLongitude")) {
            Map<String, String> tags5 = fVar.getTags();
            String language4 = fVar.getLanguage();
            String timezoneId3 = fVar.getTimezoneId();
            String country2 = fVar.getCountry();
            Double latitude = fVar.getLatitude();
            Object value5 = jVar.getValue();
            if (value5 != null && (obj = value5.toString()) != null) {
                d10 = Double.valueOf(Double.parseDouble(obj));
            }
            return new gb.f(tags5, language4, timezoneId3, country2, latitude, d10);
        }
        return new gb.f(fVar.getTags(), fVar.getLanguage(), fVar.getTimezoneId(), fVar.getCountry(), fVar.getLatitude(), fVar.getLongitude());
    }
}
