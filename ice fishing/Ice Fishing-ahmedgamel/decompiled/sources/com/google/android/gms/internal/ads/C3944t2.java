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
public final class C3944t2 implements H2, VG {

    /* renamed from: w, reason: collision with root package name */
    public static final long[] f34974w = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: x, reason: collision with root package name */
    public static final byte[] f34975x = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, com.anythink.core.common.s.a.c.f17103a, -69, 0, 0, 0, 0, 0};

    /* renamed from: y, reason: collision with root package name */
    public static final byte[] f34976y = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: n, reason: collision with root package name */
    public int f34977n;

    /* renamed from: u, reason: collision with root package name */
    public int f34978u;

    /* renamed from: v, reason: collision with root package name */
    public Object f34979v;

    public C3944t2(int i) {
        switch (i) {
            case 6:
                this.f34979v = new S0.l(24);
                this.f34977n = 8000;
                this.f34978u = 8000;
                break;
            default:
                this.f34979v = new byte[8];
                break;
        }
    }

    public static final void e(ByteBuffer byteBuffer, long j6, int i, int i4, boolean z6) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(true != z6 ? (byte) 0 : (byte) 2);
        byteBuffer.putLong(j6);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i);
        byteBuffer.putInt(0);
        byteBuffer.put(WC.a(i4));
    }

    public static long g(int i, boolean z6, byte[] bArr) {
        long j6 = bArr[0] & 255;
        if (z6) {
            j6 &= ~f34974w[i - 1];
        }
        for (int i4 = 1; i4 < i; i4++) {
            j6 = (j6 << 8) | (bArr[i4] & 255);
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
        boolean z6;
        boolean z9;
        boolean z10;
        boolean z11 = true;
        Collections.sort(arrayList2, new C3027c(17));
        HashSet hashSet = new HashSet();
        int i = 0;
        loop0: while (i < arrayList2.size()) {
            String[] split = Normalizer.normalize((CharSequence) arrayList.get(((E8) arrayList2.get(i)).f25311e), Normalizer.Form.NFKC).toLowerCase(Locale.US).split("\n");
            if (split.length != 0) {
                int i4 = 0;
                while (i4 < split.length) {
                    String str = split[i4];
                    if (str.contains("'")) {
                        StringBuilder sb = new StringBuilder(str);
                        ?? r12 = z11;
                        boolean z12 = false;
                        while (true) {
                            int i6 = (r12 == true ? 1 : 0) + 2;
                            if (i6 > sb.length()) {
                                break;
                            }
                            if (sb.charAt(r12 == true ? 1 : 0) == '\'') {
                                if (sb.charAt((r12 == true ? 1 : 0) - 1) != ' ') {
                                    int i9 = (r12 == true ? 1 : 0) + 1;
                                    z10 = z11;
                                    if ((sb.charAt(i9) == 's' || sb.charAt(i9) == 'S') && (i6 == sb.length() || sb.charAt(i6) == ' ')) {
                                        sb.insert(r12 == true ? 1 : 0, ' ');
                                        r12 = i6;
                                        z12 = z10;
                                    }
                                } else {
                                    z10 = z11;
                                }
                                sb.setCharAt(r12 == true ? 1 : 0, ' ');
                                r12 = r12;
                                z12 = z10;
                            } else {
                                z10 = z11;
                            }
                            z11 = z10;
                            r12++;
                        }
                        z6 = z11;
                        String sb2 = z12 ? sb.toString() : null;
                        if (sb2 != null) {
                            str = sb2;
                        }
                    } else {
                        z6 = z11;
                    }
                    String[] v9 = SK.v(str, z6);
                    int length = v9.length;
                    int i10 = this.f34978u;
                    if (length >= i10) {
                        int i11 = 0;
                        while (true) {
                            int length2 = v9.length;
                            int i12 = this.f34977n;
                            if (i11 >= length2) {
                                break;
                            }
                            String str2 = "";
                            for (int i13 = 0; i13 < i10; i13++) {
                                int i14 = i11 + i13;
                                if (i14 >= v9.length) {
                                    break;
                                }
                                if (i13 > 0) {
                                    str2 = str2.concat(" ");
                                }
                                str2 = str2.concat(String.valueOf(v9[i14]));
                            }
                            hashSet.add(str2);
                            if (hashSet.size() >= i12) {
                                break loop0;
                            }
                            i11++;
                        }
                    } else {
                        z9 = true;
                    }
                    i4++;
                    z11 = z9;
                }
            }
            i++;
            z11 = z11;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4096);
        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 10);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            try {
                base64OutputStream.write(((H8) this.f34979v).R1((String) it.next()));
            } catch (IOException e9) {
                int i15 = w2.z.f41712b;
                x2.i.d("Error while writing hash to byteStream", e9);
            }
        }
        try {
            base64OutputStream.close();
        } catch (IOException e10) {
            int i16 = w2.z.f41712b;
            x2.i.d("HashManager: Unable to convert to Base64.", e10);
        }
        try {
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toString();
        } catch (IOException e11) {
            int i17 = w2.z.f41712b;
            x2.i.d("HashManager: Unable to convert to Base64.", e11);
            return "";
        }
    }

    public void b(C4019uN c4019uN, List list) {
        int i;
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2 = c4019uN.f35302e;
        byteBuffer2.getClass();
        if (byteBuffer2.limit() - c4019uN.f35302e.position() == 0) {
            return;
        }
        byte[] bArr = null;
        if (this.f34977n == 2 && (list.size() == 1 || list.size() == 3)) {
            bArr = (byte[]) list.get(0);
        }
        ByteBuffer byteBuffer3 = c4019uN.f35302e;
        int position = byteBuffer3.position();
        int limit = byteBuffer3.limit();
        int i4 = limit - position;
        int i6 = this.f34977n;
        int i9 = (i4 + com.anythink.basead.exoplayer.k.p.f9259b) / com.anythink.basead.exoplayer.k.p.f9259b;
        int i10 = i9 + 27 + i4;
        if (i6 == 2) {
            i = bArr != null ? bArr.length + 28 : 47;
            i10 += i + 44;
        } else {
            i = 0;
        }
        if (((ByteBuffer) this.f34979v).capacity() < i10) {
            this.f34979v = ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            ((ByteBuffer) this.f34979v).clear();
        }
        ByteBuffer byteBuffer4 = (ByteBuffer) this.f34979v;
        if (this.f34977n == 2) {
            if (bArr != null) {
                byteBuffer = byteBuffer4;
                e(byteBuffer, 0L, 0, 1, true);
                int length = bArr.length;
                byteBuffer.put(WC.a(length));
                byteBuffer.put(bArr);
                int i11 = length + 28;
                byteBuffer.putInt(22, AbstractC3182eu.h(byteBuffer.arrayOffset(), i11, 0, byteBuffer.array()));
                byteBuffer.position(i11);
            } else {
                byteBuffer = byteBuffer4;
                byteBuffer.put(f34975x);
            }
            byteBuffer.put(f34976y);
        } else {
            byteBuffer = byteBuffer4;
        }
        int F8 = this.f34978u + ((int) ((AbstractC3066cl.F(byteBuffer3.get(0), byteBuffer3.limit() > 1 ? byteBuffer3.get(1) : (byte) 0) * 48000) / 1000000));
        this.f34978u = F8;
        ByteBuffer byteBuffer5 = byteBuffer;
        e(byteBuffer5, F8, this.f34977n, i9, false);
        for (int i12 = 0; i12 < i9; i12++) {
            if (i4 >= 255) {
                byteBuffer5.put((byte) -1);
                i4 -= 255;
            } else {
                byteBuffer5.put((byte) i4);
                i4 = 0;
            }
        }
        while (position < limit) {
            byteBuffer5.put(byteBuffer3.get(position));
            position++;
        }
        byteBuffer3.position(byteBuffer3.limit());
        byteBuffer5.flip();
        if (this.f34977n == 2) {
            byteBuffer5.putInt(i + 66, AbstractC3182eu.h(byteBuffer5.arrayOffset() + i + 44, byteBuffer5.limit() - byteBuffer5.position(), 0, byteBuffer5.array()));
        } else {
            byteBuffer5.putInt(22, AbstractC3182eu.h(byteBuffer5.arrayOffset(), byteBuffer5.limit() - byteBuffer5.position(), 0, byteBuffer5.array()));
        }
        this.f34977n++;
        this.f34979v = byteBuffer5;
        c4019uN.i();
        c4019uN.j(((ByteBuffer) this.f34979v).remaining());
        c4019uN.f35302e.put((ByteBuffer) this.f34979v);
        c4019uN.l();
    }

    @Override // com.google.android.gms.internal.ads.H2
    public int c() {
        return this.f34978u;
    }

    public long d(K0 k02, boolean z6, boolean z9, int i) {
        int i4;
        int i6 = this.f34977n;
        byte[] bArr = (byte[]) this.f34979v;
        if (i6 == 0) {
            if (!k02.A(bArr, 0, 1, z6)) {
                return -1L;
            }
            int i9 = bArr[0] & 255;
            int i10 = 0;
            while (true) {
                if (i10 >= 8) {
                    i4 = -1;
                    break;
                }
                i4 = i10 + 1;
                if ((f34974w[i10] & i9) != 0) {
                    break;
                }
                i10 = i4;
            }
            this.f34978u = i4;
            if (i4 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f34977n = 1;
        }
        int i11 = this.f34978u;
        if (i11 > i) {
            this.f34977n = 0;
            return -2L;
        }
        if (i11 != 1) {
            k02.A(bArr, 1, i11 - 1, false);
        }
        this.f34977n = 0;
        return g(this.f34978u, z9, bArr);
    }

    @Override // com.google.android.gms.internal.ads.H2
    public int f() {
        return this.f34977n;
    }

    @Override // com.google.android.gms.internal.ads.H2
    public int i() {
        int i = this.f34977n;
        return i == -1 ? ((Cr) this.f34979v).h() : i;
    }

    @Override // com.google.android.gms.internal.ads.VG
    /* renamed from: c, reason: collision with other method in class */
    public InterfaceC3636nH mo13c() {
        return new C3962tK(null, this.f34977n, this.f34978u, false, (S0.l) this.f34979v);
    }

    public /* synthetic */ C3944t2(int i, int i4, Object obj) {
        this.f34977n = i;
        this.f34978u = i4;
        this.f34979v = obj;
    }
}
