package com.anythink.core.common.s.a;

import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
final class k implements com.anythink.core.common.s.a.a.b<Set<String>> {

    /* renamed from: a, reason: collision with root package name */
    static final k f16370a = new k();

    private k() {
    }

    private static Set<String> b(byte[] bArr, int i, int i6) {
        int i9;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (i6 > 0) {
            f fVar = new f(bArr, i);
            int i10 = i + i6;
            while (true) {
                i9 = fVar.f16335b;
                if (i9 >= i10) {
                    break;
                }
                byte[] bArr2 = fVar.f16334a;
                int i11 = i9 + 1;
                fVar.f16335b = i11;
                int i12 = bArr2[i9];
                if ((i12 >> 7) != 0) {
                    int i13 = i12 & com.anythink.expressad.video.module.a.a.f21728R;
                    int i14 = i9 + 2;
                    fVar.f16335b = i14;
                    i12 = i13 | (bArr2[i11] << 7);
                    if ((i12 >> 14) != 0) {
                        int i15 = i12 & 16383;
                        int i16 = i9 + 3;
                        fVar.f16335b = i16;
                        int i17 = i15 | (bArr2[i14] << 14);
                        if ((i17 >> 21) == 0) {
                            i12 = i17;
                        } else {
                            int i18 = i9 + 4;
                            fVar.f16335b = i18;
                            i12 = (bArr2[i16] << 21) | (i17 & 2097151);
                            if ((i12 >> 28) != 0) {
                                fVar.f16335b = i9 + 5;
                                i12 = (268435455 & i12) | (bArr2[i18] << 28);
                            }
                        }
                    }
                }
                linkedHashSet.add(fVar.d(i12));
            }
            if (i9 != i10) {
                throw new IllegalArgumentException("Invalid String set");
            }
        }
        return linkedHashSet;
    }

    @Override // com.anythink.core.common.s.a.a.b
    public final /* synthetic */ byte[] a(Set<String> set) {
        Set<String> set2 = set;
        if (set2.isEmpty()) {
            return new byte[0];
        }
        int size = set2.size();
        int[] iArr = new int[size];
        String[] strArr = new String[size];
        int i = 0;
        int i6 = 0;
        for (String str : set2) {
            if (str == null) {
                i += 5;
                iArr[i6] = -1;
            } else {
                int b9 = f.b(str);
                strArr[i6] = str;
                iArr[i6] = b9;
                i = ((b9 >> 7) == 0 ? 1 : (b9 >> 14) == 0 ? 2 : (b9 >> 21) == 0 ? 3 : (b9 >> 28) == 0 ? 4 : 5) + b9 + i;
            }
            i6++;
        }
        f fVar = new f(i);
        for (int i9 = 0; i9 < size; i9++) {
            int i10 = iArr[i9];
            int i11 = fVar.f16335b;
            int i12 = i10;
            while ((i12 & (-128)) != 0) {
                fVar.f16334a[i11] = (byte) ((i12 & com.anythink.expressad.video.module.a.a.f21728R) | 128);
                i12 >>>= 7;
                i11++;
            }
            fVar.f16334a[i11] = (byte) i12;
            fVar.f16335b = i11 + 1;
            if (i10 >= 0) {
                fVar.a(strArr[i9]);
            }
        }
        return fVar.f16334a;
    }

    @Override // com.anythink.core.common.s.a.a.b
    public final String a() {
        return "StringSet";
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private static byte[] a2(Set<String> set) {
        if (set.isEmpty()) {
            return new byte[0];
        }
        int size = set.size();
        int[] iArr = new int[size];
        String[] strArr = new String[size];
        int i = 0;
        int i6 = 0;
        for (String str : set) {
            if (str == null) {
                i += 5;
                iArr[i6] = -1;
            } else {
                int b9 = f.b(str);
                strArr[i6] = str;
                iArr[i6] = b9;
                i = ((b9 >> 7) == 0 ? 1 : (b9 >> 14) == 0 ? 2 : (b9 >> 21) == 0 ? 3 : (b9 >> 28) == 0 ? 4 : 5) + b9 + i;
            }
            i6++;
        }
        f fVar = new f(i);
        for (int i9 = 0; i9 < size; i9++) {
            int i10 = iArr[i9];
            int i11 = fVar.f16335b;
            int i12 = i10;
            while ((i12 & (-128)) != 0) {
                fVar.f16334a[i11] = (byte) ((i12 & com.anythink.expressad.video.module.a.a.f21728R) | 128);
                i12 >>>= 7;
                i11++;
            }
            fVar.f16334a[i11] = (byte) i12;
            fVar.f16335b = i11 + 1;
            if (i10 >= 0) {
                fVar.a(strArr[i9]);
            }
        }
        return fVar.f16334a;
    }

    @Override // com.anythink.core.common.s.a.a.b
    public final /* synthetic */ Set<String> a(byte[] bArr, int i, int i6) {
        int i9;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (i6 > 0) {
            f fVar = new f(bArr, i);
            int i10 = i + i6;
            while (true) {
                i9 = fVar.f16335b;
                if (i9 >= i10) {
                    break;
                }
                byte[] bArr2 = fVar.f16334a;
                int i11 = i9 + 1;
                fVar.f16335b = i11;
                int i12 = bArr2[i9];
                if ((i12 >> 7) != 0) {
                    int i13 = i12 & com.anythink.expressad.video.module.a.a.f21728R;
                    int i14 = i9 + 2;
                    fVar.f16335b = i14;
                    i12 = i13 | (bArr2[i11] << 7);
                    if ((i12 >> 14) != 0) {
                        int i15 = i12 & 16383;
                        int i16 = i9 + 3;
                        fVar.f16335b = i16;
                        int i17 = i15 | (bArr2[i14] << 14);
                        if ((i17 >> 21) == 0) {
                            i12 = i17;
                        } else {
                            int i18 = i9 + 4;
                            fVar.f16335b = i18;
                            i12 = (bArr2[i16] << 21) | (i17 & 2097151);
                            if ((i12 >> 28) != 0) {
                                fVar.f16335b = i9 + 5;
                                i12 = (268435455 & i12) | (bArr2[i18] << 28);
                            }
                        }
                    }
                }
                linkedHashSet.add(fVar.d(i12));
            }
            if (i9 != i10) {
                throw new IllegalArgumentException("Invalid String set");
            }
        }
        return linkedHashSet;
    }
}
