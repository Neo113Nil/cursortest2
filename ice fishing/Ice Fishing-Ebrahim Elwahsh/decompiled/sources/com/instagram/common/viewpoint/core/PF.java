package com.instagram.common.viewpoint.core;

import com.anythink.core.common.s.a.c;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* loaded from: assets/audience_network/classes2.dex */
public class PF<K, V> {
    public static int A03;
    public static int A04;
    public static Object[] A05;
    public static Object[] A06;
    public static byte[] A07;
    public static String[] A08 = {"8z1HmzrTIPy39LL5zlYrlacFIwKg5dSL", "BF3wuf", "SqgiIkCbsFt", "0ewbfDqWIohK", "kTJoDQcQ4hAXz", "5fxnXFw2KP9B", "f0gXGPwWqu0hk91oP6YtPFY8hQ1GOrGw", "wtH1M9"};
    public int[] A01 = P5.A01;
    public Object[] A02 = P5.A03;
    public int A00 = 0;

    public static String A03(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 97);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A07 = new byte[]{44, 112, 108, 109, 119, 36, 73, 101, 116, 45, 34, 46, c.f16476c, 57};
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
    
        if (r4 == r9.A00) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
    
        if (r10 <= 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0073, code lost:
    
        java.lang.System.arraycopy(r2, 0, r9.A01, 0, r10);
        java.lang.System.arraycopy(r1, 0, r9.A02, 0, r10 << 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0080, code lost:
    
        if (r10 >= r3) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0082, code lost:
    
        java.lang.System.arraycopy(r2, r10 + 1, r9.A01, r10, r3 - r10);
        java.lang.System.arraycopy(r1, (r10 + 1) << 1, r9.A02, r10 << 1, (r3 - r10) << 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ea, code lost:
    
        throw new java.util.ConcurrentModificationException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00aa, code lost:
    
        if (r4 == r9.A00) goto L21;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final V A0A(int i) {
        int i4;
        int[] iArr;
        Object[] objArr;
        V v6 = (V) this.A02[(i << 1) + 1];
        int i9 = this.A00;
        if (i9 <= 1) {
            A06(this.A01, this.A02, i9);
            this.A01 = P5.A01;
            this.A02 = P5.A03;
            i4 = 0;
        } else {
            i4 = i9 - 1;
            if (this.A01.length <= 8 || this.A00 >= this.A01.length / 3) {
                if (i < i4) {
                    System.arraycopy(this.A01, i + 1, this.A01, i, i4 - i);
                    System.arraycopy(this.A02, (i + 1) << 1, this.A02, i << 1, (i4 - i) << 1);
                }
                this.A02[i4 << 1] = null;
                this.A02[(i4 << 1) + 1] = null;
            } else {
                int i10 = i9 > 8 ? i9 + (i9 >> 1) : 8;
                String[] strArr = A08;
                if (strArr[3].length() != strArr[5].length()) {
                    iArr = this.A01;
                    objArr = this.A02;
                    A05(i10);
                } else {
                    A08[4] = "WH99ujY4Es6AewxBY41FF";
                    iArr = this.A01;
                    objArr = this.A02;
                    A05(i10);
                }
            }
        }
        if (i9 != this.A00) {
            throw new ConcurrentModificationException();
        }
        this.A00 = i4;
        if (A08[4].length() == 22) {
            throw new RuntimeException();
        }
        String[] strArr2 = A08;
        strArr2[3] = "hOF5xMBjbG58";
        strArr2[5] = "k56GqMXOqoxT";
        return v6;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PF) {
            PF pf = (PF) obj;
            if (size() != pf.size()) {
                return false;
            }
            for (int i = 0; i < this.A00; i++) {
                try {
                    K A09 = A09(i);
                    V A0B = A0B(i);
                    Object obj2 = pf.get(A09);
                    if (A0B == null) {
                        if (obj2 == null && pf.containsKey(A09)) {
                        }
                        return false;
                    }
                    if (!A0B.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException unused) {
                    return false;
                } catch (NullPointerException unused2) {
                    return false;
                }
            }
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (size() != map.size()) {
            return false;
        }
        for (int i4 = 0; i4 < this.A00; i4++) {
            try {
                K A092 = A09(i4);
                V A0B2 = A0B(i4);
                Object obj3 = map.get(A092);
                if (A0B2 == null) {
                    if (obj3 == null && map.containsKey(A092)) {
                    }
                    return false;
                }
                if (!A0B2.equals(obj3)) {
                    return false;
                }
            } catch (ClassCastException unused3) {
                return false;
            } catch (NullPointerException unused4) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final int hashCode() {
        int[] iArr = this.A01;
        Object[] objArr = this.A02;
        int i = 0;
        int i4 = 0;
        int i9 = 1;
        int i10 = this.A00;
        while (i4 < i10) {
            Object obj = objArr[i9];
            i += iArr[i4] ^ (obj == null ? 0 : obj.hashCode());
            i4++;
            i9 += 2;
        }
        return i;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final V put(K k6, V v6) {
        int hashCode;
        int A01;
        int i = this.A00;
        if (k6 == null) {
            hashCode = 0;
            A01 = A00();
        } else {
            hashCode = k6.hashCode();
            A01 = A01(k6, hashCode);
        }
        if (A01 >= 0) {
            int i4 = (A01 << 1) + 1;
            V v9 = (V) this.A02[i4];
            this.A02[i4] = v6;
            return v9;
        }
        int i9 = ~A01;
        if (i >= this.A01.length) {
            int i10 = 8;
            if (i >= 8) {
                i10 = (i >> 1) + i;
            } else if (i < 4) {
                i10 = 4;
            }
            int[] iArr = this.A01;
            Object[] objArr = this.A02;
            A05(i10);
            if (i != this.A00) {
                throw new ConcurrentModificationException();
            }
            if (this.A01.length > 0) {
                System.arraycopy(iArr, 0, this.A01, 0, iArr.length);
                System.arraycopy(objArr, 0, this.A02, 0, objArr.length);
            }
            A06(iArr, objArr, i);
        }
        if (i9 < i) {
            System.arraycopy(this.A01, i9, this.A01, i9 + 1, i - i9);
            System.arraycopy(this.A02, i9 << 1, this.A02, (i9 + 1) << 1, (this.A00 - i9) << 1);
        }
        if (i == this.A00) {
            int[] iArr2 = this.A01;
            if (A08[2].length() != 11) {
                throw new RuntimeException();
            }
            String[] strArr = A08;
            strArr[6] = "wNq2gfAl4zWIB1XFoKeYdvHUl0gsJJAY";
            strArr[0] = "ABvHOLLiQ2Gbe1PeIygvGpsQN2lfiJ3N";
            if (i9 < iArr2.length) {
                this.A01[i9] = hashCode;
                this.A02[i9 << 1] = k6;
                this.A02[(i9 << 1) + 1] = v6;
                this.A00++;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    static {
        A04();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.PF != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    private final int A00() {
        int i = this.A00;
        if (i == 0) {
            return -1;
        }
        int end = A02(this.A01, i, 0);
        if (end < 0) {
            return end;
        }
        int N8 = end << 1;
        if (this.A02[N8] == null) {
            return end;
        }
        int i4 = end + 1;
        while (i4 < i) {
            int N9 = this.A01[i4];
            if (N9 != 0) {
                break;
            }
            int N10 = i4 << 1;
            if (this.A02[N10] == null) {
                return i4;
            }
            i4++;
        }
        for (int i9 = end - 1; i9 >= 0; i9--) {
            int N11 = this.A01[i9];
            if (N11 != 0) {
                break;
            }
            Object[] objArr = this.A02;
            String[] strArr = A08;
            String str = strArr[3];
            String str2 = strArr[5];
            int index = str.length();
            int N12 = str2.length();
            if (index != N12) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[3] = "nljZKXIH96LM";
            strArr2[5] = "33MSJmaTT2hK";
            int N13 = i9 << 1;
            if (objArr[N13] == null) {
                return i9;
            }
        }
        int N14 = ~i4;
        return N14;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.PF != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    private final int A01(Object obj, int i) {
        int i4 = this.A00;
        if (i4 == 0) {
            return -1;
        }
        int end = A02(this.A01, i4, i);
        if (end < 0) {
            return end;
        }
        int N8 = end << 1;
        if (obj.equals(this.A02[N8])) {
            return end;
        }
        int i9 = end + 1;
        while (i9 < i4) {
            int N9 = this.A01[i9];
            if (N9 != i) {
                break;
            }
            int N10 = i9 << 1;
            if (obj.equals(this.A02[N10])) {
                return i9;
            }
            i9++;
        }
        for (int i10 = end - 1; i10 >= 0; i10--) {
            int[] iArr = this.A01;
            int index = A08[2].length();
            if (index != 11) {
                throw new RuntimeException();
            }
            A08[2] = "0KWp7g9eUEy";
            int N11 = iArr[i10];
            if (N11 != i) {
                break;
            }
            int N12 = i10 << 1;
            if (obj.equals(this.A02[N12])) {
                return i10;
            }
        }
        int N13 = ~i9;
        return N13;
    }

    public static int A02(int[] iArr, int i, int i4) {
        try {
            return P5.A02(iArr, i, i4);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.PF != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    private void A05(int i) {
        if (i == 8) {
            synchronized (C1923i7.class) {
                if (A06 != null) {
                    Object[] objArr = A06;
                    this.A02 = objArr;
                    A06 = (Object[]) objArr[0];
                    this.A01 = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    A04--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C1923i7.class) {
                if (A05 != null) {
                    Object[] objArr2 = A05;
                    this.A02 = objArr2;
                    A05 = (Object[]) objArr2[0];
                    this.A01 = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    A03--;
                    return;
                }
            }
        }
        this.A01 = new int[i];
        this.A02 = new Object[i << 1];
    }

    public static void A06(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C1923i7.class) {
                if (A04 < 10) {
                    objArr[0] = A06;
                    objArr[1] = iArr;
                    for (int i4 = (i << 1) - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    A06 = objArr;
                    A04++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C1923i7.class) {
                if (A03 < 10) {
                    objArr[0] = A05;
                    objArr[1] = iArr;
                    for (int i9 = (i << 1) - 1; i9 >= 2; i9--) {
                        objArr[i9] = null;
                    }
                    A05 = objArr;
                    A03++;
                }
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.PF != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final int A07(Object obj) {
        int i = this.A00 * 2;
        Object[] objArr = this.A02;
        if (obj == null) {
            for (int i4 = 1; i4 < i; i4 += 2) {
                if (objArr[i4] == null) {
                    int N8 = i4 >> 1;
                    return N8;
                }
            }
        } else {
            for (int i9 = 1; i9 < i; i9 += 2) {
                boolean equals = obj.equals(objArr[i9]);
                if (A08[4].length() != 22) {
                    String[] strArr = A08;
                    strArr[3] = "bt44SpsCW8by";
                    strArr[5] = "Iovdsjym1Cx2";
                    if (equals) {
                        int i10 = i9 >> 1;
                        String[] strArr2 = A08;
                        String str = strArr2[3];
                        String str2 = strArr2[5];
                        int length = str.length();
                        int N9 = str2.length();
                        if (length == N9) {
                            String[] strArr3 = A08;
                            strArr3[1] = "ZvOUY6";
                            strArr3[7] = "nVlZAl";
                            return i10;
                        }
                    }
                }
                throw new RuntimeException();
            }
        }
        String[] strArr4 = A08;
        String str3 = strArr4[6];
        String str4 = strArr4[0];
        int charAt = str3.charAt(31);
        int N10 = str4.charAt(31);
        if (charAt != N10) {
            A08[2] = "MKm6k3UubQ6";
            return -1;
        }
        String[] strArr5 = A08;
        strArr5[3] = "2Vghj6DMfX1I";
        strArr5[5] = "igqcF6KEPQ66";
        return -1;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.PF != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final int A08(Object obj) {
        return obj == null ? A00() : A01(obj, obj.hashCode());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.PF != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final K A09(int i) {
        return (K) this.A02[i << 1];
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.PF != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final V A0B(int i) {
        return (V) this.A02[(i << 1) + 1];
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.PF != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final V A0C(int i, V v6) {
        int i4 = (i << 1) + 1;
        V v9 = (V) this.A02[i4];
        this.A02[i4] = v6;
        return v9;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.PF != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final void A0D(int i) {
        int i4 = this.A00;
        int osize = this.A01.length;
        if (osize < i) {
            int[] iArr = this.A01;
            Object[] objArr = this.A02;
            A05(i);
            int osize2 = this.A00;
            if (osize2 > 0) {
                System.arraycopy(iArr, 0, this.A01, 0, i4);
                int osize3 = i4 << 1;
                System.arraycopy(objArr, 0, this.A02, 0, osize3);
            }
            A06(iArr, objArr, i4);
        }
        int osize4 = this.A00;
        if (osize4 == i4) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.PF != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final void clear() {
        if (this.A00 > 0) {
            int[] iArr = this.A01;
            String[] strArr = A08;
            if (strArr[6].charAt(31) == strArr[0].charAt(31)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[6] = "UNrHeFRST0N9gyLTBJ6FVG6osgOV0jla";
            strArr2[0] = "Uxp69fMHdnF3RanJB6hneAcQQEE567qn";
            Object[] objArr = this.A02;
            int i = this.A00;
            int[] ohashes = P5.A01;
            this.A01 = ohashes;
            this.A02 = P5.A03;
            this.A00 = 0;
            A06(iArr, objArr, i);
        }
        if (this.A00 <= 0) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.PF != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final boolean containsKey(Object obj) {
        return A08(obj) >= 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.PF != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final boolean containsValue(Object obj) {
        return A07(obj) >= 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.PF != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final V get(Object obj) {
        int A082 = A08(obj);
        if (A082 >= 0) {
            return (V) this.A02[(A082 << 1) + 1];
        }
        return null;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.PF != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final boolean isEmpty() {
        return this.A00 <= 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.PF != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final V remove(Object obj) {
        int index = A08(obj);
        if (index >= 0) {
            return A0A(index);
        }
        return null;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.PF != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final int size() {
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.PF != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final String toString() {
        if (isEmpty()) {
            return A03(12, 2, 37);
        }
        StringBuilder sb = new StringBuilder(this.A00 * 28);
        sb.append('{');
        for (int i = 0; i < this.A00; i++) {
            if (i > 0) {
                sb.append(A03(10, 2, 111));
            }
            K A09 = A09(i);
            String A032 = A03(0, 10, 101);
            if (A09 != this) {
                sb.append(A09);
            } else {
                sb.append(A032);
            }
            sb.append('=');
            V A0B = A0B(i);
            if (A0B != this) {
                sb.append(A0B);
            } else {
                sb.append(A032);
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
