package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.pG, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3743pG {

    /* renamed from: b, reason: collision with root package name */
    public static final C3263gK f33844b = C3263gK.a(new byte[0]);

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f33845a;

    public final Iterable a(byte[] bArr) {
        List list;
        HashMap hashMap = this.f33845a;
        List list2 = (List) hashMap.get(f33844b);
        if (bArr.length >= 5) {
            int length = bArr.length;
            list = (List) hashMap.get(new C3263gK(bArr, 5 > length ? length : 5));
        } else {
            list = null;
        }
        return (list2 == null && list == null) ? new ArrayList() : list2 == null ? list : list == null ? list2 : new C3635nG(this, list, list2);
    }
}
