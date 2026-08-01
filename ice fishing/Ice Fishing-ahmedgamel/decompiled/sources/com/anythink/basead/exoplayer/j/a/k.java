package com.anythink.basead.exoplayer.j.a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, Object> f8091a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final List<String> f8092b = new ArrayList();

    public final k a(String str, String str2) {
        return a(str, (Object) str2);
    }

    public final Map<String, Object> b() {
        HashMap hashMap = new HashMap(this.f8091a);
        for (Map.Entry entry : hashMap.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public final k a(String str, long j6) {
        return a(str, Long.valueOf(j6));
    }

    private k a(String str, byte[] bArr) {
        return a(str, (Object) Arrays.copyOf(bArr, bArr.length));
    }

    public final k a(String str) {
        this.f8092b.add(str);
        this.f8091a.remove(str);
        return this;
    }

    public final List<String> a() {
        return Collections.unmodifiableList(new ArrayList(this.f8092b));
    }

    private k a(String str, Object obj) {
        this.f8091a.put((String) com.anythink.basead.exoplayer.k.a.a(str), com.anythink.basead.exoplayer.k.a.a(obj));
        this.f8092b.remove(str);
        return this;
    }
}
