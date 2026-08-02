package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.o1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3674o1 {

    /* renamed from: a, reason: collision with root package name */
    public static final RC f33620a = new RC(new int[]{0, 2, 1}, 3);

    /* renamed from: b, reason: collision with root package name */
    public static final RC f33621b = new RC(new int[]{0, 2, 1, 3, 4}, 5);

    /* renamed from: c, reason: collision with root package name */
    public static final RC f33622c = new RC(new int[]{0, 2, 1, 5, 3, 4}, 6);

    /* renamed from: d, reason: collision with root package name */
    public static final RC f33623d;

    /* renamed from: e, reason: collision with root package name */
    public static final RC f33624e;

    static {
        int[] iArr = new int[7];
        iArr[0] = 0;
        System.arraycopy(new int[]{2, 1, 6, 5, 3, 4}, 0, iArr, 1, 6);
        f33623d = new RC(iArr, 7);
        int[] iArr2 = new int[8];
        iArr2[0] = 0;
        System.arraycopy(new int[]{2, 1, 7, 5, 6, 3, 4}, 0, iArr2, 1, 7);
        f33624e = new RC(iArr2, 8);
    }

    public static O3 a(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            String str2 = AbstractC3182eu.f30782a;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                AbstractC2991bG.y("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(S1.b(new Cr(Base64.decode(split[1], 0))));
                } catch (RuntimeException e9) {
                    AbstractC2991bG.C("VorbisUtil", "Failed to parse vorbis picture", e9);
                }
            } else {
                arrayList.add(new C3513l2(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new O3(arrayList);
    }
}
