package com.netcetera.threeds.sdk.infrastructure;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class ou {
    private static final pa initialize = new pa() { // from class: com.netcetera.threeds.sdk.infrastructure.ou.4
        @Override // com.netcetera.threeds.sdk.infrastructure.pa
        public Map getWarnings() {
            return new get();
        }

        @Override // com.netcetera.threeds.sdk.infrastructure.pa
        public List initialize() {
            return new ArrayList();
        }
    };

    public static class get extends LinkedHashMap<String, Object> {
        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        /* renamed from: initialize, reason: merged with bridge method [inline-methods] */
        public Object put(String str, Object obj) {
            if (!containsKey(str)) {
                return super.put(str, obj);
            }
            a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("An entry for '", str, "' already exists. Names must be unique."));
            return null;
        }
    }

    public static Map<String, Object> get(String str) {
        try {
            return (get) new ox().get(str, initialize);
        } catch (oy | IllegalArgumentException e) {
            throw new ro(Boxes$$ExternalSyntheticOutline1.m(e, "Parsing error: "), e);
        }
    }

    public static String get(Map<String, ?> map) {
        return pb.initialize(map);
    }
}
