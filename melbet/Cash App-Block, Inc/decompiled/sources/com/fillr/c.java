package com.fillr;

import java.util.HashMap;
import java.util.Map;
import javax.xml.namespace.QName;
import org.w3c.dom.Node;

/* loaded from: classes4.dex */
public final class c {
    public static void a(l1 l1Var, QName qName, Node node) {
        Map map;
        Map map2;
        Map map3 = l1Var.d;
        if (map3 == null) {
            map3 = new HashMap();
        }
        if (node.getNodeType() == 2) {
            if (map3.containsKey("EXTERNAL_ATTRIBUTES")) {
                map2 = (Map) map3.get("EXTERNAL_ATTRIBUTES");
            } else {
                HashMap hashMap = new HashMap();
                map3.put("EXTERNAL_ATTRIBUTES", hashMap);
                map2 = hashMap;
            }
            map2.put(qName, node);
        } else if (node.getNodeType() == 1) {
            if (map3.containsKey("EXTERNAL_ELEMENTS")) {
                map = (Map) map3.get("EXTERNAL_ELEMENTS");
            } else {
                HashMap hashMap2 = new HashMap();
                map3.put("EXTERNAL_ELEMENTS", hashMap2);
                map = hashMap2;
            }
            map.put(qName, node);
        }
        if (map3.isEmpty()) {
            return;
        }
        Map map4 = l1Var.d;
        if (map4 == null) {
            l1Var.d = map3;
        } else {
            map4.putAll(map3);
        }
    }
}
