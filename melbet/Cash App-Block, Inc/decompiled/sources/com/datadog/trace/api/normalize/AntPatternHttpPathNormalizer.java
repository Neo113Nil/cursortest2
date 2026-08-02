package com.datadog.trace.api.normalize;

import androidx.media3.extractor.mkv.Sniffer;
import com.fillr.m1;
import com.stripe.android.core.utils.CreationExtrasKtxKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class AntPatternHttpPathNormalizer extends CreationExtrasKtxKt {
    public final Sniffer cache = new Sniffer(512, 11);
    public final m1 cacheLoader = new m1(this, 12);
    public final Map resourceNameMatchers;

    public AntPatternHttpPathNormalizer(LinkedHashMap linkedHashMap) {
        this.resourceNameMatchers = linkedHashMap;
        ArrayList arrayList = new ArrayList(linkedHashMap.keySet().size());
        for (String str : linkedHashMap.keySet()) {
            if (str.indexOf(42) == -1 && str.indexOf(63) == -1) {
                arrayList.add(str);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.resourceNameMatchers.remove((String) it.next());
        }
    }

    public final String normalize(String str) {
        return (String) this.cache.computeIfAbsent(str, this.cacheLoader);
    }
}
