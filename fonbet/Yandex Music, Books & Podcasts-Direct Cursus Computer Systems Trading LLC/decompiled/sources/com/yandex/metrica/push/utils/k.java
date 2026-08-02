package com.yandex.metrica.push.utils;

import defpackage.hrg;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class k {
    private final Map<String, a> a = new HashMap();

    public interface a {
        String a(String str);

        List<String> a();
    }

    public k(String str, String str2) {
    }

    public String a(String str) {
        for (Map.Entry<String, a> entry : this.a.entrySet()) {
            String q = hrg.q("[{]", entry.getKey(), "[}]");
            if (str.matches(".*" + q + ".*")) {
                str = str.replaceAll(q, entry.getValue().a(entry.getKey()));
            }
        }
        return str;
    }

    public k a(a aVar) {
        Iterator<String> it = aVar.a().iterator();
        while (it.hasNext()) {
            this.a.put(it.next(), aVar);
        }
        return this;
    }
}
