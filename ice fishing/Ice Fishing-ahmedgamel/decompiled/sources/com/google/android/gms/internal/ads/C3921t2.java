package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.ads.t2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3921t2 implements H2, VG {

    /* renamed from: w, reason: collision with root package name */
    public static final long[] f34188w = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: x, reason: collision with root package name */
    public static final byte[] f34189x = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, com.anythink.core.common.s.a.c.f16316a, -69, 0, 0, 0, 0, 0};

    /* renamed from: y, reason: collision with root package name */
    public static final byte[] f34190y = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: n, reason: collision with root package name */
    public int f34191n;

    /* renamed from: u, reason: collision with root package name */
    public int f34192u;

    /* renamed from: v, reason: collision with root package name */
    public Object f34193v;

    public C3921t2(int i) {
        switch (i) {
            case 6:
                this.f34193v = new S0.l(21);
                this.f34191n = 8000;
                this.f34192u = 8000;
                break;
            default:
                this.f34193v = new byte[8];
                break;
        }
    }

    public static final void e(ByteBuffer byteBuffer, long j6, int i, int i6, boolean z3) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(true != z3 ? (byte) 0 : (byte) 2);
        byteBuffer.putLong(j6);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i);
        byteBuffer.putInt(0);
        byteBuffer.put(WC.a(i6));
    }

    public static long g(int i, boolean z3, byte[] bArr) {
        long j6 = bArr[0] & 255;
        if (z3) {
            j6 &= ~f34188w[i - 1];
        }
        for (int i6 = 1; i6 < i; i6++) {
            j6 = (j6 << 8) | (bArr[i6] & 255);
        }
        return j6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d8, code lost:
    
        r16 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0104, code lost:
    
        if (r3.size() < r12) goto L98;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [int] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String a(ArrayList arrayList, ArrayList arrayList2) {
        boolean z3;
        boolean z6;
        boolean z9;
        boolean z10 = true;
        Collections.sort(arrayList2, new C3004c(17));
        HashSet hashSet = new HashSet();
        int i = 0;
        loop0: while (i < arrayList2.size()) {
            String[] split = Normalizer.normalize((CharSequence) arrayList.get(((E8) arrayList2.get(i)).f24550e), Normalizer.Form.NFKC).toLowerCase(Locale.US).split("\n");
            if (split.length != 0) {
                int i6 = 0;
                while (i6 < split.length) {
                    String str = split[i6];
                    if (str.contains("'")) {
                        StringBuilder sb = new StringBuilder(str);
                        ?? r12 = z10;
                        boolean z11 = false;
                        while (true) {
                            int i9 = (r12 == true ? 1 : 0) + 2;
                            if (i9 > sb.length()) {
                                break;
                            }
                            if (sb.charAt(r12 == true ? 1 : 0) == '\'') {
                                if (sb.charAt((r12 == true ? 1 : 0) - 1) != ' ') {
                                    int i10 = (r12 == true ? 1 : 0) + 1;
                                    z9 = z10;
                                    if ((sb.charAt(i10) == 's' || sb.charAt(i10) == 'S') && (i9 == sb.length() || sb.charAt(i9) == ' ')) {
                                        sb.insert(r12 == true ? 1 : 0, ' ');
                                        r12 = i9;
                                        z11 = z9;
                                    }
                                } else {
                                    z9 = z10;
                                }
                                sb.setCharAt(r12 == true ? 1 : 0, ' ');
                                r12 = r12;
                                z11 = z9;
                            } else {
                                z9 = z10;
                            }
                            z10 = z9;
                            r12++;
                        }
                        z3 = z10;
                        String sb2 = z11 ? sb.toString() : null;
                        if (sb2 != null) {
                            str = sb2;
                        }
                    } else {
                        z3 = z10;
                    }
                    String[] v9 = SK.v(str, z3);
                    int length = v9.length;
                    int i11 = this.f34192u;
                    if (length >= i11) {
                        int i12 = 0;
                        while (true) {
                            int length2 = v9.length;
                            int i13 = this.f34191n;
                            if (i12 >= length2) {
                                break;
                            }
                            String str2 = "";
                            for (int i14 = 0; i14 < i11; i14++) {
                                int i15 = i12 + i14;
                                if (i15 >= v9.length) {
                                    break;
                                }
                                if (i14 > 0) {
                                    str2 = str2.concat(" ");
                                }
                                str2 = str2.concat(String.valueOf(v9[i15]));
                            }
                            hashSet.add(str2);
                            if (hashSet.size() >= i13) {
                                break loop0;
                            }
                            i12++;
                        }
                    } else {
                        z6 = true;
                    }
                    i6++;
                    z10 = z6;
                }
            }
            i++;
            z10 = z10;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4096);
        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 10);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            try {
                base64OutputStream.write(((H8) this.f34193v).Q1((String) it.next()));
            } catch (IOException e9) {
                int i16 = u2.z.f41322b;
                v2.i.d("Error while writing hash to byteStream", e9);
            }
        }
        try {
            base64OutputStream.close();
        } catch (IOException e10) {
            int i17 = u2.z.f41322b;
            v2.i.d("HashManager: Unable to convert to Base64.", e10);
        }
        try {
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toString();
        } catch (IOException e11) {
            int i18 = u2.z.f41322b;
            v2.i.d("HashManager: Unable to convert to Base64.", e11);
            return "";
        }
    }

    public void b(C3996uN c3996uN, List list) {
        int i;
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2 = c3996uN.f34528e;
        byteBuffer2.getClass();
        if (byteBuffer2.limit() - c3996uN.f34528e.position() == 0) {
            return;
        }
        byte[] bArr = null;
        if (this.f34191n == 2 && (list.size() == 1 || list.size() == 3)) {
            bArr = (byte[]) list.get(0);
        }
        ByteBuffer byteBuffer3 = c3996uN.f34528e;
        int position = byteBuffer3.position();
        int limit = byteBuffer3.limit();
        int i6 = limit - position;
        int i9 = this.f34191n;
        int i10 = (i6 + com.anythink.basead.exoplayer.k.p.f8473b) / com.anythink.basead.exoplayer.k.p.f8473b;
        int i11 = i10 + 27 + i6;
        if (i9 == 2) {
            i = bArr != null ? bArr.length + 28 : 47;
            i11 += i + 44;
        } else {
            i = 0;
        }
        if (((ByteBuffer) this.f34193v).capacity() < i11) {
            this.f34193v = ByteBuffer.allocate(i11).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            ((ByteBuffer) this.f34193v).clear();
        }
        ByteBuffer byteBuffer4 = (ByteBuffer) this.f34193v;
        if (this.f34191n == 2) {
            if (bArr != null) {
                byteBuffer = byteBuffer4;
                e(byteBuffer, 0L, 0, 1, true);
                int length = bArr.length;
                byteBuffer.put(WC.a(length));
                byteBuffer.put(bArr);
                int i12 = length + 28;
                byteBuffer.putInt(22, AbstractC3159eu.h(byteBuffer.arrayOffset(), i12, 0, byteBuffer.array()));
                byteBuffer.position(i12);
            } else {
                byteBuffer = byteBuffer4;
                byteBuffer.put(f34189x);
            }
            byteBuffer.put(f34190y);
        } else {
            byteBuffer = byteBuffer4;
        }
        int F8 = this.f34192u + ((int) ((AbstractC3043cl.F(byteBuffer3.get(0), byteBuffer3.limit() > 1 ? byteBuffer3.get(1) : (byte) 0) * 48000) / 1000000));
        this.f34192u = F8;
        ByteBuffer byteBuffer5 = byteBuffer;
        e(byteBuffer5, F8, this.f34191n, i10, false);
        for (int i13 = 0; i13 < i10; i13++) {
            if (i6 >= 255) {
                byteBuffer5.put((byte) -1);
                i6 -= 255;
            } else {
                byteBuffer5.put((byte) i6);
                i6 = 0;
            }
        }
        while (position < limit) {
            byteBuffer5.put(byteBuffer3.get(position));
            position++;
        }
        byteBuffer3.position(byteBuffer3.limit());
        byteBuffer5.flip();
        if (this.f34191n == 2) {
            byteBuffer5.putInt(i + 66, AbstractC3159eu.h(byteBuffer5.arrayOffset() + i + 44, byteBuffer5.limit() - byteBuffer5.position(), 0, byteBuffer5.array()));
        } else {
            byteBuffer5.putInt(22, AbstractC3159eu.h(byteBuffer5.arrayOffset(), byteBuffer5.limit() - byteBuffer5.position(), 0, byteBuffer5.array()));
        }
        this.f34191n++;
        this.f34193v = byteBuffer5;
        c3996uN.i();
        c3996uN.j(((ByteBuffer) this.f34193v).remaining());
        c3996uN.f34528e.put((ByteBuffer) this.f34193v);
        c3996uN.l();
    }

    @Override // com.google.android.gms.internal.ads.H2
    public int c() {
        return this.f34192u;
    }

    public long d(K0 k02, boolean z3, boolean z6, int i) {
        int i6;
        int i9 = this.f34191n;
        byte[] bArr = (byte[]) this.f34193v;
        if (i9 == 0) {
            if (!k02.z(bArr, 0, 1, z3)) {
                return -1L;
            }
            int i10 = bArr[0] & 255;
            int i11 = 0;
            while (true) {
                if (i11 >= 8) {
                    i6 = -1;
                    break;
                }
                i6 = i11 + 1;
                if ((f34188w[i11] & i10) != 0) {
                    break;
                }
                i11 = i6;
            }
            this.f34192u = i6;
            if (i6 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f34191n = 1;
        }
        int i12 = this.f34192u;
        if (i12 > i) {
            this.f34191n = 0;
            return -2L;
        }
        if (i12 != 1) {
            k02.z(bArr, 1, i12 - 1, false);
        }
        this.f34191n = 0;
        return g(this.f34192u, z6, bArr);
    }

    @Override // com.google.android.gms.internal.ads.H2
    public int f() {
        return this.f34191n;
    }

    @Override // com.google.android.gms.internal.ads.H2
    public int i() {
        int i = this.f34191n;
        return i == -1 ? ((Cr) this.f34193v).h() : i;
    }

    @Override // com.google.android.gms.internal.ads.VG
    /* renamed from: c, reason: collision with other method in class */
    public InterfaceC3613nH mo14c() {
        return new C3939tK(null, this.f34191n, this.f34192u, false, (S0.l) this.f34193v);
    }

    public /* synthetic */ C3921t2(int i, int i6, Object obj) {
        this.f34191n = i;
        this.f34192u = i6;
        this.f34193v = obj;
    }
}
