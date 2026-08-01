package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class Iw extends AbstractC3376ix {

    /* renamed from: c, reason: collision with root package name */
    public final long f25619c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f25620d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f25621e;

    public Iw(int i, long j6) {
        super(i, 0);
        this.f25619c = j6;
        this.f25620d = new ArrayList();
        this.f25621e = new ArrayList();
    }

    public final Zw i(int i) {
        ArrayList arrayList = this.f25620d;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            Zw zw = (Zw) arrayList.get(i6);
            if (zw.f31138b == i) {
                return zw;
            }
        }
        return null;
    }

    public final Iw j(int i) {
        ArrayList arrayList = this.f25621e;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            Iw iw = (Iw) arrayList.get(i6);
            if (iw.f31138b == i) {
                return iw;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3376ix
    public final String toString() {
        ArrayList arrayList = this.f25620d;
        String g4 = AbstractC3376ix.g(this.f31138b);
        String arrays = Arrays.toString(arrayList.toArray());
        String arrays2 = Arrays.toString(this.f25621e.toArray());
        int length = g4.length();
        StringBuilder sb = new StringBuilder(length + 9 + String.valueOf(arrays).length() + 13 + String.valueOf(arrays2).length());
        u1.h.i(sb, g4, " leaves: ", arrays, " containers: ");
        sb.append(arrays2);
        return sb.toString();
    }
}
