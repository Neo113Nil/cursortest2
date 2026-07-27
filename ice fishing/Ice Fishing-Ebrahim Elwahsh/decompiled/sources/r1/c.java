package r1;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import t0.AbstractC5051n;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public ByteBuffer f40256b;

    /* renamed from: c, reason: collision with root package name */
    public b f40257c;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f40255a = new byte[256];

    /* renamed from: d, reason: collision with root package name */
    public int f40258d = 0;

    public final boolean a() {
        return this.f40257c.f40246b != 0;
    }

    public final b b() {
        byte[] bArr;
        if (this.f40256b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (a()) {
            return this.f40257c;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) c());
        }
        if (sb.toString().startsWith("GIF")) {
            this.f40257c.f40250f = this.f40256b.getShort();
            this.f40257c.f40251g = this.f40256b.getShort();
            int c4 = c();
            b bVar = this.f40257c;
            bVar.f40252h = (c4 & 128) != 0;
            bVar.i = (int) Math.pow(2.0d, (c4 & 7) + 1);
            this.f40257c.f40253j = c();
            b bVar2 = this.f40257c;
            c();
            bVar2.getClass();
            if (this.f40257c.f40252h && !a()) {
                b bVar3 = this.f40257c;
                bVar3.f40245a = e(bVar3.i);
                b bVar4 = this.f40257c;
                bVar4.f40254k = bVar4.f40245a[bVar4.f40253j];
            }
        } else {
            this.f40257c.f40246b = 1;
        }
        if (!a()) {
            boolean z8 = false;
            while (!z8 && !a() && this.f40257c.f40247c <= Integer.MAX_VALUE) {
                int c9 = c();
                if (c9 == 33) {
                    int c10 = c();
                    if (c10 == 1) {
                        f();
                    } else if (c10 == 249) {
                        this.f40257c.f40248d = new C4956a();
                        c();
                        int c11 = c();
                        C4956a c4956a = this.f40257c.f40248d;
                        int i4 = (c11 & 28) >> 2;
                        c4956a.f40241g = i4;
                        if (i4 == 0) {
                            c4956a.f40241g = 1;
                        }
                        c4956a.f40240f = (c11 & 1) != 0;
                        short s3 = this.f40256b.getShort();
                        if (s3 < 2) {
                            s3 = 10;
                        }
                        C4956a c4956a2 = this.f40257c.f40248d;
                        c4956a2.i = s3 * 10;
                        c4956a2.f40242h = c();
                        c();
                    } else if (c10 == 254) {
                        f();
                    } else if (c10 != 255) {
                        f();
                    } else {
                        d();
                        StringBuilder sb2 = new StringBuilder();
                        int i9 = 0;
                        while (true) {
                            bArr = this.f40255a;
                            if (i9 >= 11) {
                                break;
                            }
                            sb2.append((char) bArr[i9]);
                            i9++;
                        }
                        if (sb2.toString().equals("NETSCAPE2.0")) {
                            do {
                                d();
                                if (bArr[0] == 1) {
                                    byte b9 = bArr[1];
                                    byte b10 = bArr[2];
                                    this.f40257c.getClass();
                                }
                                if (this.f40258d > 0) {
                                }
                            } while (!a());
                        } else {
                            f();
                        }
                    }
                } else if (c9 == 44) {
                    b bVar5 = this.f40257c;
                    if (bVar5.f40248d == null) {
                        bVar5.f40248d = new C4956a();
                    }
                    bVar5.f40248d.f40235a = this.f40256b.getShort();
                    this.f40257c.f40248d.f40236b = this.f40256b.getShort();
                    this.f40257c.f40248d.f40237c = this.f40256b.getShort();
                    this.f40257c.f40248d.f40238d = this.f40256b.getShort();
                    int c12 = c();
                    boolean z9 = (c12 & 128) != 0;
                    int pow = (int) Math.pow(2.0d, (c12 & 7) + 1);
                    C4956a c4956a3 = this.f40257c.f40248d;
                    c4956a3.f40239e = (c12 & 64) != 0;
                    if (z9) {
                        c4956a3.f40244k = e(pow);
                    } else {
                        c4956a3.f40244k = null;
                    }
                    this.f40257c.f40248d.f40243j = this.f40256b.position();
                    c();
                    f();
                    if (!a()) {
                        b bVar6 = this.f40257c;
                        bVar6.f40247c++;
                        bVar6.f40249e.add(bVar6.f40248d);
                    }
                } else if (c9 != 59) {
                    this.f40257c.f40246b = 1;
                } else {
                    z8 = true;
                }
            }
            b bVar7 = this.f40257c;
            if (bVar7.f40247c < 0) {
                bVar7.f40246b = 1;
            }
        }
        return this.f40257c;
    }

    public final int c() {
        try {
            return this.f40256b.get() & 255;
        } catch (Exception unused) {
            this.f40257c.f40246b = 1;
            return 0;
        }
    }

    public final void d() {
        int c4 = c();
        this.f40258d = c4;
        if (c4 <= 0) {
            return;
        }
        int i = 0;
        int i4 = 0;
        while (true) {
            try {
                i4 = this.f40258d;
                if (i >= i4) {
                    return;
                }
                i4 -= i;
                this.f40256b.get(this.f40255a, i, i4);
                i += i4;
            } catch (Exception e6) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    StringBuilder h9 = AbstractC5051n.h(i, i4, "Error Reading Block n: ", " count: ", " blockSize: ");
                    h9.append(this.f40258d);
                    Log.d("GifHeaderParser", h9.toString(), e6);
                }
                this.f40257c.f40246b = 1;
                return;
            }
        }
    }

    public final int[] e(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.f40256b.get(bArr);
            iArr = new int[256];
            int i4 = 0;
            int i9 = 0;
            while (i4 < i) {
                int i10 = bArr[i9] & 255;
                int i11 = i9 + 2;
                int i12 = bArr[i9 + 1] & 255;
                i9 += 3;
                int i13 = i4 + 1;
                iArr[i4] = (i12 << 8) | (i10 << 16) | (-16777216) | (bArr[i11] & 255);
                i4 = i13;
            }
            return iArr;
        } catch (BufferUnderflowException e6) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e6);
            }
            this.f40257c.f40246b = 1;
            return iArr;
        }
    }

    public final void f() {
        int c4;
        do {
            c4 = c();
            this.f40256b.position(Math.min(this.f40256b.position() + c4, this.f40256b.limit()));
        } while (c4 > 0);
    }
}
