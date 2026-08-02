package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import w.AbstractC5128c;

/* loaded from: classes2.dex */
public final class Iw extends AbstractC3399ix {

    /* renamed from: c, reason: collision with root package name */
    public final long f26372c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f26373d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f26374e;

    public Iw(int i, long j6) {
        super(i, 0);
        this.f26372c = j6;
        this.f26373d = new ArrayList();
        this.f26374e = new ArrayList();
    }

    public final Zw i(int i) {
        ArrayList arrayList = this.f26373d;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            Zw zw = (Zw) arrayList.get(i4);
            if (zw.f31925b == i) {
                return zw;
            }
        }
        return null;
    }

    public final Iw j(int i) {
        ArrayList arrayList = this.f26374e;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            Iw iw = (Iw) arrayList.get(i4);
            if (iw.f31925b == i) {
                return iw;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3399ix
    public final String toString() {
        ArrayList arrayList = this.f26373d;
        String g9 = AbstractC3399ix.g(this.f31925b);
        String arrays = Arrays.toString(arrayList.toArray());
        String arrays2 = Arrays.toString(this.f26374e.toArray());
        int length = g9.length();
        StringBuilder sb = new StringBuilder(length + 9 + String.valueOf(arrays).length() + 13 + String.valueOf(arrays2).length());
        AbstractC5128c.h(sb, g9, " leaves: ", arrays, " containers: ");
        sb.append(arrays2);
        return sb.toString();
    }
}
