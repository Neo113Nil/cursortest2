package com.instagram.common.viewpoint.core;

import com.anythink.basead.exoplayer.k.p;
import com.google.common.collect.ElementTypesAreNonnullByDefault;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
/* loaded from: assets/audience_network/classes2.dex */
public final class B9<K, V> extends AbstractC2292oX<K, V> {
    public static String[] A03 = {"BLd", "8EKeVjTJIU6MDNPM6ZTo", "HWbOsw9VtzWta1ewMSd8SFleZB3uycJV", "4g", "oHZcZe8PYtJP7zuLK1jInYJjmOVWCxEe", "hqSXyAZ2zuGNDHd4PkKakj6NBzhfvhom", "1gwnz8jAk7EqAxYvZHDnpar6edM6d04", "wfrdBhaNwCqY"};
    public static final AbstractC2292oX<Object, Object> A04 = new B9(null, new Object[0], 0);
    public static final long serialVersionUID = 0;
    public final transient Object[] A00;
    public final transient int A01;

    @CheckForNull
    public final transient Object A02;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static <K, V> B9<K, V> A00(int n9, Object[] alternatingKeysAndValues, C2290oV<K, V> builder) {
        Object obj;
        if (n9 == 0) {
            return (B9) A04;
        }
        if (n9 == 1) {
            AbstractC2217nJ.A03(Objects.requireNonNull(alternatingKeysAndValues[0]), Objects.requireNonNull(alternatingKeysAndValues[1]));
            return new B9<>(null, alternatingKeysAndValues, 1);
        }
        AbstractC2070ki.A01(n9, alternatingKeysAndValues.length >> 1);
        Object A02 = A02(alternatingKeysAndValues, n9, BO.A03(n9), 0);
        if (A02 instanceof Object[]) {
            Object[] objArr = (Object[]) A02;
            C2289oU c2289oU = (C2289oU) objArr[2];
            if (builder == null) {
                throw c2289oU.A02();
            }
            builder.A01 = c2289oU;
            obj = objArr[0];
            n9 = ((Integer) objArr[1]).intValue();
            alternatingKeysAndValues = Arrays.copyOf(alternatingKeysAndValues, n9 * 2);
        } else {
            obj = A02;
        }
        return new B9<>(obj, alternatingKeysAndValues, n9);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.B9 != com.google.common.collect.RegularImmutableMap<K, V> */
    public B9(@CheckForNull Object hashTable, Object[] alternatingKeysAndValues, int size) {
        this.A02 = hashTable;
        this.A00 = alternatingKeysAndValues;
        this.A01 = size;
    }

    @CheckForNull
    public static Object A01(@CheckForNull Object hashTableObject, @CheckForNull Object[] alternatingKeysAndValues, int size, int keyOffset, Object key) {
        int keyIndex;
        if (key == null) {
            return null;
        }
        if (size == 1) {
            if (!Objects.requireNonNull(alternatingKeysAndValues[keyOffset]).equals(key)) {
                return null;
            }
            Object obj = alternatingKeysAndValues[keyOffset ^ 1];
            if (A03[3].length() == 2) {
                String[] strArr = A03;
                strArr[4] = "QVSrtcZKARogVSSTsDMErisHHhx3s08I";
                strArr[2] = "AM5zanCyyloF9oZfJSoNtkvSUtakyhf1";
                return Objects.requireNonNull(obj);
            }
        } else {
            if (hashTableObject == null) {
                return null;
            }
            if (hashTableObject instanceof byte[]) {
                String[] strArr2 = A03;
                if (strArr2[4].charAt(30) != strArr2[2].charAt(30)) {
                    String[] strArr3 = A03;
                    strArr3[0] = "33E";
                    strArr3[7] = "0IVWz8DDpNA7";
                    byte[] bArr = (byte[]) hashTableObject;
                    int mask = bArr.length - 1;
                    int A00 = AbstractC2277oI.A00(key.hashCode());
                    while (true) {
                        int i = A00 & mask;
                        int i6 = bArr[i];
                        String[] strArr4 = A03;
                        if (strArr4[0].length() == strArr4[7].length()) {
                            throw new RuntimeException();
                        }
                        String[] strArr5 = A03;
                        strArr5[4] = "Av4xGd01JYXCpVUXSFBX5Q3qG21nzo21";
                        strArr5[2] = "UuPO1t2w2j7pNt6wRWMrea5HC47YMJTH";
                        keyIndex = i6 & p.f8473b;
                        if (keyIndex == 255) {
                            return null;
                        }
                        boolean equals = key.equals(alternatingKeysAndValues[keyIndex]);
                        String[] strArr6 = A03;
                        if (strArr6[0].length() != strArr6[7].length()) {
                            A03[6] = "uEfKnUldtWRHisqrfIDf4ni9PGEoRP0";
                            if (equals) {
                                break;
                            }
                            A00 = i + 1;
                        } else {
                            A03[1] = "rg32th7lbb1pJpYlIRnh";
                            if (equals) {
                                break;
                            }
                            A00 = i + 1;
                        }
                    }
                    Object obj2 = alternatingKeysAndValues[keyIndex ^ 1];
                    if (A03[1].length() != 20) {
                        return obj2;
                    }
                    A03[1] = "OPXdJDLfRI5AGRwdD0N1";
                    return obj2;
                }
            } else if (hashTableObject instanceof short[]) {
                short[] sArr = (short[]) hashTableObject;
                int mask2 = sArr.length - 1;
                int A002 = AbstractC2277oI.A00(key.hashCode());
                while (true) {
                    int i9 = A002 & mask2;
                    int h9 = sArr[i9] & 65535;
                    if (h9 == 65535) {
                        return null;
                    }
                    if (key.equals(alternatingKeysAndValues[h9])) {
                        return alternatingKeysAndValues[h9 ^ 1];
                    }
                    A002 = i9 + 1;
                }
            } else {
                int[] iArr = (int[]) hashTableObject;
                int mask3 = iArr.length - 1;
                int A003 = AbstractC2277oI.A00(key.hashCode());
                while (true) {
                    int i10 = A003 & mask3;
                    int h10 = iArr[i10];
                    if (h10 == -1) {
                        return null;
                    }
                    if (key.equals(alternatingKeysAndValues[h10])) {
                        return alternatingKeysAndValues[h10 ^ 1];
                    }
                    A003 = i10 + 1;
                }
            }
        }
        throw new RuntimeException();
    }

    @CheckForNull
    public static Object A02(Object[] alternatingKeysAndValues, int n9, int tableSize, int keyOffset) {
        if (n9 == 1) {
            AbstractC2217nJ.A03(Objects.requireNonNull(alternatingKeysAndValues[keyOffset]), Objects.requireNonNull(alternatingKeysAndValues[keyOffset ^ 1]));
            return null;
        }
        int h9 = tableSize - 1;
        C2289oU c2289oU = null;
        int i = -1;
        if (tableSize > 128) {
            if (tableSize <= 32768) {
                short[] hashTable = new short[tableSize];
                Arrays.fill(hashTable, (short) -1);
                int keyIndex = 0;
                for (int i6 = 0; i6 < n9; i6++) {
                    int i9 = (i6 * 2) + keyOffset;
                    int h10 = (keyIndex * 2) + keyOffset;
                    Object value = Objects.requireNonNull(alternatingKeysAndValues[i9]);
                    Object requireNonNull = Objects.requireNonNull(alternatingKeysAndValues[i9 ^ 1]);
                    AbstractC2217nJ.A03(value, requireNonNull);
                    int A00 = AbstractC2277oI.A00(value.hashCode());
                    while (true) {
                        int i10 = A00 & h9;
                        int i11 = hashTable[i10] & 65535;
                        if (i11 == 65535) {
                            hashTable[i10] = (short) h10;
                            if (keyIndex < i6) {
                                alternatingKeysAndValues[h10] = value;
                                alternatingKeysAndValues[h10 ^ 1] = requireNonNull;
                            }
                            keyIndex++;
                        } else {
                            boolean equals = value.equals(alternatingKeysAndValues[i11]);
                            if (A03[5].charAt(16) != 'P') {
                                throw new RuntimeException();
                            }
                            A03[5] = "XeR3XdSVagosh0VhP9e0zQ2n8NaTx8OB";
                            if (equals) {
                                c2289oU = new C2289oU(value, requireNonNull, Objects.requireNonNull(alternatingKeysAndValues[i11 ^ 1]));
                                alternatingKeysAndValues[i11 ^ 1] = requireNonNull;
                                break;
                            }
                            A00 = i10 + 1;
                        }
                    }
                }
                return keyIndex == n9 ? hashTable : new Object[]{hashTable, Integer.valueOf(keyIndex), c2289oU};
            }
            int[] hashTable2 = new int[tableSize];
            Arrays.fill(hashTable2, -1);
            int i12 = 0;
            int i13 = 0;
            while (i13 < n9) {
                int i14 = (i13 * 2) + keyOffset;
                int i15 = (i12 * 2) + keyOffset;
                Object requireNonNull2 = Objects.requireNonNull(alternatingKeysAndValues[i14]);
                Object requireNonNull3 = Objects.requireNonNull(alternatingKeysAndValues[i14 ^ 1]);
                AbstractC2217nJ.A03(requireNonNull2, requireNonNull3);
                int outKeyIndex = AbstractC2277oI.A00(requireNonNull2.hashCode());
                while (true) {
                    int outKeyIndex2 = outKeyIndex & h9;
                    int i16 = hashTable2[outKeyIndex2];
                    if (i16 == i) {
                        hashTable2[outKeyIndex2] = i15;
                        if (i12 < i13) {
                            alternatingKeysAndValues[i15] = requireNonNull2;
                            alternatingKeysAndValues[i15 ^ 1] = requireNonNull3;
                        }
                        i12++;
                    } else {
                        if (requireNonNull2.equals(alternatingKeysAndValues[i16])) {
                            c2289oU = new C2289oU(requireNonNull2, requireNonNull3, Objects.requireNonNull(alternatingKeysAndValues[i16 ^ 1]));
                            alternatingKeysAndValues[i16 ^ 1] = requireNonNull3;
                            break;
                        }
                        outKeyIndex = outKeyIndex2 + 1;
                        i = -1;
                    }
                }
                i13++;
                i = -1;
            }
            return i12 == n9 ? hashTable2 : new Object[]{hashTable2, Integer.valueOf(i12), c2289oU};
        }
        byte[] bArr = new byte[tableSize];
        Arrays.fill(bArr, (byte) -1);
        int i17 = 0;
        for (int i18 = 0; i18 < n9; i18++) {
            int i19 = (i18 * 2) + keyOffset;
            int i20 = (i17 * 2) + keyOffset;
            Object requireNonNull4 = Objects.requireNonNull(alternatingKeysAndValues[i19]);
            Object requireNonNull5 = Objects.requireNonNull(alternatingKeysAndValues[i19 ^ 1]);
            AbstractC2217nJ.A03(requireNonNull4, requireNonNull5);
            int keyIndex2 = AbstractC2277oI.A00(requireNonNull4.hashCode());
            while (true) {
                int keyIndex3 = keyIndex2 & h9;
                int previousKeyIndex = bArr[keyIndex3] & p.f8473b;
                if (previousKeyIndex == 255) {
                    bArr[keyIndex3] = (byte) i20;
                    if (i17 < i18) {
                        alternatingKeysAndValues[i20] = requireNonNull4;
                        alternatingKeysAndValues[i20 ^ 1] = requireNonNull5;
                    }
                    i17++;
                } else {
                    if (requireNonNull4.equals(alternatingKeysAndValues[previousKeyIndex])) {
                        c2289oU = new C2289oU(requireNonNull4, requireNonNull5, Objects.requireNonNull(alternatingKeysAndValues[previousKeyIndex ^ 1]));
                        alternatingKeysAndValues[previousKeyIndex ^ 1] = requireNonNull5;
                        break;
                    }
                    keyIndex2 = keyIndex3 + 1;
                }
            }
        }
        return i17 == n9 ? bArr : new Object[]{bArr, Integer.valueOf(i17), c2289oU};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.B9 != com.google.common.collect.RegularImmutableMap<K, V> */
    @Override // com.instagram.common.viewpoint.core.AbstractC2292oX
    public final AbstractC2283oO<V> A0A() {
        return new C2A(this.A00, 1, this.A01);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.B9 != com.google.common.collect.RegularImmutableMap<K, V> */
    @Override // com.instagram.common.viewpoint.core.AbstractC2292oX
    public final BO<Map.Entry<K, V>> A0D() {
        return new C2C(this, this.A00, 0, this.A01);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.B9 != com.google.common.collect.RegularImmutableMap<K, V> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<K> */
    @Override // com.instagram.common.viewpoint.core.AbstractC2292oX
    public final BO<K> A0E() {
        final C2A c2a = new C2A(this.A00, 0, this.A01);
        return new BO<K>(this, c2a) { // from class: com.facebook.ads.redexgen.X.2B
            public final transient BP<K> A00;
            public final transient AbstractC2292oX<K, ?> A01;

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2B != com.google.common.collect.RegularImmutableMap$KeySet<K> */
            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<K> */
            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oX != com.google.common.collect.ImmutableMap<K, ?> */
            {
                this.A01 = this;
                this.A00 = c2a;
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2B != com.google.common.collect.RegularImmutableMap$KeySet<K> */
            @Override // com.instagram.common.viewpoint.core.AbstractC2283oO
            public final int A0I(Object[] dst, int offset) {
                return A0J().A0I(dst, offset);
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2B != com.google.common.collect.RegularImmutableMap$KeySet<K> */
            @Override // com.instagram.common.viewpoint.core.BO, com.instagram.common.viewpoint.core.AbstractC2283oO
            public final BP<K> A0J() {
                return this.A00;
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2B != com.google.common.collect.RegularImmutableMap$KeySet<K> */
            @Override // com.instagram.common.viewpoint.core.AbstractC2283oO
            public final boolean A0K() {
                return true;
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2B != com.google.common.collect.RegularImmutableMap$KeySet<K> */
            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            /* renamed from: A0N */
            public final C4C<K> iterator() {
                return A0J().iterator();
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2B != com.google.common.collect.RegularImmutableMap$KeySet<K> */
            @Override // com.instagram.common.viewpoint.core.AbstractC2283oO, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(@CheckForNull Object object) {
                return this.A01.get(object) != null;
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2B != com.google.common.collect.RegularImmutableMap$KeySet<K> */
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final int size() {
                return this.A01.size();
            }
        };
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.B9 != com.google.common.collect.RegularImmutableMap<K, V> */
    @Override // com.instagram.common.viewpoint.core.AbstractC2292oX
    public final boolean A0F() {
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.B9 != com.google.common.collect.RegularImmutableMap<K, V> */
    @Override // com.instagram.common.viewpoint.core.AbstractC2292oX, java.util.Map
    @CheckForNull
    public final V get(@CheckForNull Object obj) {
        V v9 = (V) A01(this.A02, this.A00, this.A01, 0, obj);
        if (v9 == null) {
            return null;
        }
        return v9;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.B9 != com.google.common.collect.RegularImmutableMap<K, V> */
    @Override // java.util.Map
    public final int size() {
        return this.A01;
    }
}
