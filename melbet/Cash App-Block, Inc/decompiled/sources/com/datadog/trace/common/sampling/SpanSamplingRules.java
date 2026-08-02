package com.datadog.trace.common.sampling;

import com.datadog.trace.core.util.JsonObjectUtils;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;
import com.google.mlkit.vision.text.zzc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class SpanSamplingRules {
    public static final SpanSamplingRules EMPTY = new SpanSamplingRules(Collections.EMPTY_LIST);
    public static final zzc log = new zzc(4);
    public final List rules;

    public final class Rule implements com.datadog.trace.api.sampling.SamplingRule {
    }

    public SpanSamplingRules(List list) {
        this.rules = Collections.unmodifiableList(list);
    }

    public static List deserializeRules(JsonReader jsonReader) {
        double parseDouble;
        double parseDouble2;
        JsonArray asJsonArray = JsonParser.parseReader(jsonReader).getAsJsonArray();
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
            String asString5 = JsonObjectUtils.getAsString(asJsonObject, "max_per_second");
            HashMap safeGetAsMap = JsonObjectUtils.safeGetAsMap(asJsonObject);
            com.datadog.trace.api.sampling.SamplingRule.normalizeGlob(asString4);
            com.datadog.trace.api.sampling.SamplingRule.normalizeGlob(asString);
            com.datadog.trace.api.sampling.SamplingRule.normalizeGlob(asString2);
            if (safeGetAsMap == null) {
                Map map = Collections.EMPTY_MAP;
            }
            zzc zzcVar = log;
            Rule rule = null;
            if (asString3 != null) {
                try {
                    parseDouble = Double.parseDouble(asString3);
                } catch (NumberFormatException unused) {
                    zzcVar.getClass();
                }
                if (parseDouble < 0.0d || parseDouble > 1.0d) {
                    zzcVar.getClass();
                    linkedList.add(rule);
                }
            }
            if (asString5 != null) {
                try {
                    parseDouble2 = Double.parseDouble(asString5);
                } catch (NumberFormatException unused2) {
                    zzcVar.getClass();
                }
                if (parseDouble2 <= 0.0d) {
                    zzcVar.getClass();
                    linkedList.add(rule);
                } else {
                    Math.max((int) parseDouble2, 1);
                }
            }
            rule = new Rule();
            linkedList.add(rule);
        }
        return linkedList;
    }

    public static SpanSamplingRules filterOutNullRules(List list) {
        SpanSamplingRules spanSamplingRules = EMPTY;
        if (list == null || list.isEmpty()) {
            return spanSamplingRules;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Rule rule = (Rule) it.next();
            if (rule != null) {
                arrayList.add(rule);
            }
        }
        return arrayList.isEmpty() ? spanSamplingRules : new SpanSamplingRules(arrayList);
    }
}
