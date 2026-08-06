package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.va, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0817va extends C2 {

    /* renamed from: b, reason: collision with root package name */
    public final C0739sa f7056b;

    /* renamed from: c, reason: collision with root package name */
    public final C0739sa f7057c;

    /* renamed from: d, reason: collision with root package name */
    public final C0791ua f7058d;

    public C0817va(int i2, int i3, int i4) {
        this(i2, new C0739sa(i3), new C0739sa(i4));
    }

    public C0817va(int i2, C0739sa c0739sa, C0739sa c0739sa2) {
        super(i2);
        this.f7058d = new C0791ua();
        this.f7056b = c0739sa;
        this.f7057c = c0739sa2;
    }

    @Override // io.appmetrica.analytics.impl.C2, io.appmetrica.analytics.impl.InterfaceC0765ta
    public final Mn a(Map<String, String> map) {
        HashMap hashMap;
        int i2;
        int i3 = 0;
        if (map != null) {
            hashMap = new HashMap();
            Set<Map.Entry<String, String>> entrySet = map.entrySet();
            Map.Entry[] entryArr = (Map.Entry[]) entrySet.toArray(new Map.Entry[entrySet.size()]);
            Arrays.sort(entryArr, this.f7058d);
            int length = entryArr.length;
            i2 = 0;
            int i4 = 0;
            boolean z2 = false;
            int i5 = 0;
            while (i3 < length) {
                Map.Entry entry = entryArr[i3];
                Mn a2 = this.f7056b.a((String) entry.getKey());
                Mn a3 = this.f7057c.a((String) entry.getValue());
                int utf8BytesLength = StringUtils.getUtf8BytesLength((String) entry.getValue()) + StringUtils.getUtf8BytesLength((String) entry.getKey());
                int utf8BytesLength2 = StringUtils.getUtf8BytesLength((String) a3.f4785a) + StringUtils.getUtf8BytesLength((String) a2.f4785a);
                if (z2 || utf8BytesLength2 + i5 > this.f4253a) {
                    i4++;
                    i2 += utf8BytesLength;
                    z2 = true;
                } else {
                    i2 = a3.f4786b.getBytesTruncated() + a2.f4786b.getBytesTruncated() + i2;
                    int utf8BytesLength3 = StringUtils.getUtf8BytesLength((String) a3.f4785a) + StringUtils.getUtf8BytesLength((String) a2.f4785a) + i5;
                    hashMap.put((String) a2.f4785a, (String) a3.f4785a);
                    i5 = utf8BytesLength3;
                }
                i3++;
            }
            i3 = i4;
        } else {
            hashMap = null;
            i2 = 0;
        }
        return new Mn(hashMap, new C0604n4(i3, i2));
    }
}
