package com.datadog.trace.common.sampling;

import com.datadog.trace.core.util.JsonObjectUtils;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.mlkit.vision.text.zzc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class TraceSamplingRules {
    public static final TraceSamplingRules EMPTY = new TraceSamplingRules(Collections.EMPTY_LIST);
    public static final zzc log = new zzc(4);
    public final List rules;

    public final class Rule implements com.datadog.trace.api.sampling.SamplingRule {
        public final String name;
        public final String resource;
        public final double sampleRate;
        public final String service;
        public final Map tags;

        public Rule(String str, String str2, String str3, Map map, double d) {
            this.service = str;
            this.name = str2;
            this.resource = str3;
            this.tags = map;
            this.sampleRate = d;
        }
    }

    public TraceSamplingRules(List list) {
        this.rules = Collections.unmodifiableList(list);
    }

    public static TraceSamplingRules deserialize(String str) {
        TraceSamplingRules traceSamplingRules = EMPTY;
        try {
            List<Rule> deserializeRules = deserializeRules(str);
            if (deserializeRules != null && !deserializeRules.isEmpty()) {
                ArrayList arrayList = new ArrayList(deserializeRules.size());
                for (Rule rule : deserializeRules) {
                    if (rule != null) {
                        arrayList.add(rule);
                    }
                }
                if (!arrayList.isEmpty()) {
                    return new TraceSamplingRules(arrayList);
                }
            }
            return traceSamplingRules;
        } catch (Throwable unused) {
            log.getClass();
            return traceSamplingRules;
        }
    }

    public static List deserializeRules(String str) {
        double d;
        Rule rule;
        double parseDouble;
        zzc zzcVar = log;
        JsonArray asJsonArray = JsonParser.parseString(str).getAsJsonArray();
        if (asJsonArray == null || asJsonArray.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < asJsonArray.size(); i++) {
            JsonObject asJsonObject = asJsonArray.get(i).getAsJsonObject();
            String asString = JsonObjectUtils.getAsString(asJsonObject, "name");
            String asString2 = JsonObjectUtils.getAsString(asJsonObject, "resource");
            String asString3 = JsonObjectUtils.getAsString(asJsonObject, "sample_rate");
            String asString4 = JsonObjectUtils.getAsString(asJsonObject, "service");
            JsonObjectUtils.getAsString(asJsonObject, "target_span");
            Map safeGetAsMap = JsonObjectUtils.safeGetAsMap(asJsonObject);
            String normalizeGlob = com.datadog.trace.api.sampling.SamplingRule.normalizeGlob(asString4);
            String normalizeGlob2 = com.datadog.trace.api.sampling.SamplingRule.normalizeGlob(asString);
            String normalizeGlob3 = com.datadog.trace.api.sampling.SamplingRule.normalizeGlob(asString2);
            if (safeGetAsMap == null) {
                safeGetAsMap = Collections.EMPTY_MAP;
            }
            Map map = safeGetAsMap;
            if (asString3 != null) {
                rule = null;
                try {
                    parseDouble = Double.parseDouble(asString3);
                } catch (NumberFormatException unused) {
                    zzcVar.getClass();
                }
                if (parseDouble < 0.0d || parseDouble > 1.0d) {
                    zzcVar.getClass();
                    linkedList.add(rule);
                } else {
                    d = parseDouble;
                }
            } else {
                d = 1.0d;
            }
            rule = new Rule(normalizeGlob, normalizeGlob2, normalizeGlob3, map, d);
            linkedList.add(rule);
        }
        return linkedList;
    }
}
