package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.tG, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3948tG {

    /* renamed from: b, reason: collision with root package name */
    public static final C3791qK f34388b = C3791qK.a(new byte[0]);

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f34389a;

    public final Iterable a(byte[] bArr) {
        List list;
        HashMap hashMap = this.f34389a;
        List list2 = (List) hashMap.get(f34388b);
        if (bArr.length >= 5) {
            int length = bArr.length;
            list = (List) hashMap.get(new C3791qK(bArr, 5 > length ? length : 5));
        } else {
            list = null;
        }
        return (list2 == null && list == null) ? new ArrayList() : list2 == null ? list : list == null ? list2 : new C3840rG(this, list, list2);
    }
}
