package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.pG, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3720pG {

    /* renamed from: b, reason: collision with root package name */
    public static final C3240gK f33054b = C3240gK.a(new byte[0]);

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f33055a;

    public final Iterable a(byte[] bArr) {
        List list;
        HashMap hashMap = this.f33055a;
        List list2 = (List) hashMap.get(f33054b);
        if (bArr.length >= 5) {
            int length = bArr.length;
            list = (List) hashMap.get(new C3240gK(bArr, 5 > length ? length : 5));
        } else {
            list = null;
        }
        return (list2 == null && list == null) ? new ArrayList() : list2 == null ? list : list == null ? list2 : new C3612nG(this, list, list2);
    }
}
