package com.anythink.core.common.s.a;

import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
final class k implements com.anythink.core.common.s.a.a.b<Set<String>> {

    /* renamed from: a, reason: collision with root package name */
    static final k f17157a = new k();

    private k() {
    }

    private static Set<String> b(byte[] bArr, int i, int i4) {
        int i6;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (i4 > 0) {
            f fVar = new f(bArr, i);
            int i9 = i + i4;
            while (true) {
                i6 = fVar.f17122b;
                if (i6 >= i9) {
                    break;
                }
                byte[] bArr2 = fVar.f17121a;
                int i10 = i6 + 1;
                fVar.f17122b = i10;
                int i11 = bArr2[i6];
                if ((i11 >> 7) != 0) {
                    int i12 = i11 & com.anythink.expressad.video.module.a.a.f22515R;
                    int i13 = i6 + 2;
                    fVar.f17122b = i13;
                    i11 = i12 | (bArr2[i10] << 7);
                    if ((i11 >> 14) != 0) {
                        int i14 = i11 & 16383;
                        int i15 = i6 + 3;
                        fVar.f17122b = i15;
                        int i16 = i14 | (bArr2[i13] << 14);
                        if ((i16 >> 21) == 0) {
                            i11 = i16;
                        } else {
                            int i17 = i6 + 4;
                            fVar.f17122b = i17;
                            i11 = (bArr2[i15] << 21) | (i16 & 2097151);
                            if ((i11 >> 28) != 0) {
                                fVar.f17122b = i6 + 5;
                                i11 = (268435455 & i11) | (bArr2[i17] << 28);
                            }
                        }
                    }
                }
                linkedHashSet.add(fVar.d(i11));
            }
            if (i6 != i9) {
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
        int i4 = 0;
        for (String str : set2) {
            if (str == null) {
                i += 5;
                iArr[i4] = -1;
            } else {
                int b9 = f.b(str);
                strArr[i4] = str;
                iArr[i4] = b9;
                i = ((b9 >> 7) == 0 ? 1 : (b9 >> 14) == 0 ? 2 : (b9 >> 21) == 0 ? 3 : (b9 >> 28) == 0 ? 4 : 5) + b9 + i;
            }
            i4++;
        }
        f fVar = new f(i);
        for (int i6 = 0; i6 < size; i6++) {
            int i9 = iArr[i6];
            int i10 = fVar.f17122b;
            int i11 = i9;
            while ((i11 & (-128)) != 0) {
                fVar.f17121a[i10] = (byte) ((i11 & com.anythink.expressad.video.module.a.a.f22515R) | 128);
                i11 >>>= 7;
                i10++;
            }
            fVar.f17121a[i10] = (byte) i11;
            fVar.f17122b = i10 + 1;
            if (i9 >= 0) {
                fVar.a(strArr[i6]);
            }
        }
        return fVar.f17121a;
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
        int i4 = 0;
        for (String str : set) {
            if (str == null) {
                i += 5;
                iArr[i4] = -1;
            } else {
                int b9 = f.b(str);
                strArr[i4] = str;
                iArr[i4] = b9;
                i = ((b9 >> 7) == 0 ? 1 : (b9 >> 14) == 0 ? 2 : (b9 >> 21) == 0 ? 3 : (b9 >> 28) == 0 ? 4 : 5) + b9 + i;
            }
            i4++;
        }
        f fVar = new f(i);
        for (int i6 = 0; i6 < size; i6++) {
            int i9 = iArr[i6];
            int i10 = fVar.f17122b;
            int i11 = i9;
            while ((i11 & (-128)) != 0) {
                fVar.f17121a[i10] = (byte) ((i11 & com.anythink.expressad.video.module.a.a.f22515R) | 128);
                i11 >>>= 7;
                i10++;
            }
            fVar.f17121a[i10] = (byte) i11;
            fVar.f17122b = i10 + 1;
            if (i9 >= 0) {
                fVar.a(strArr[i6]);
            }
        }
        return fVar.f17121a;
    }

    @Override // com.anythink.core.common.s.a.a.b
    public final /* synthetic */ Set<String> a(byte[] bArr, int i, int i4) {
        int i6;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (i4 > 0) {
            f fVar = new f(bArr, i);
            int i9 = i + i4;
            while (true) {
                i6 = fVar.f17122b;
                if (i6 >= i9) {
                    break;
                }
                byte[] bArr2 = fVar.f17121a;
                int i10 = i6 + 1;
                fVar.f17122b = i10;
                int i11 = bArr2[i6];
                if ((i11 >> 7) != 0) {
                    int i12 = i11 & com.anythink.expressad.video.module.a.a.f22515R;
                    int i13 = i6 + 2;
                    fVar.f17122b = i13;
                    i11 = i12 | (bArr2[i10] << 7);
                    if ((i11 >> 14) != 0) {
                        int i14 = i11 & 16383;
                        int i15 = i6 + 3;
                        fVar.f17122b = i15;
                        int i16 = i14 | (bArr2[i13] << 14);
                        if ((i16 >> 21) == 0) {
                            i11 = i16;
                        } else {
                            int i17 = i6 + 4;
                            fVar.f17122b = i17;
                            i11 = (bArr2[i15] << 21) | (i16 & 2097151);
                            if ((i11 >> 28) != 0) {
                                fVar.f17122b = i6 + 5;
                                i11 = (268435455 & i11) | (bArr2[i17] << 28);
                            }
                        }
                    }
                }
                linkedHashSet.add(fVar.d(i11));
            }
            if (i6 != i9) {
                throw new IllegalArgumentException("Invalid String set");
            }
        }
        return linkedHashSet;
    }
}
