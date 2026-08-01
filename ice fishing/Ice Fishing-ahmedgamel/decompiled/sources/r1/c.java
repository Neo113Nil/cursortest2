package r1;

import android.util.Log;
import com.icefishinggame.icefishinggamemultigames.AbstractC4404f;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public ByteBuffer f40354b;

    /* renamed from: c, reason: collision with root package name */
    public b f40355c;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f40353a = new byte[256];

    /* renamed from: d, reason: collision with root package name */
    public int f40356d = 0;

    public final boolean a() {
        return this.f40355c.f40344b != 0;
    }

    public final b b() {
        byte[] bArr;
        if (this.f40354b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (a()) {
            return this.f40355c;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) c());
        }
        if (sb.toString().startsWith("GIF")) {
            this.f40355c.f40348f = this.f40354b.getShort();
            this.f40355c.f40349g = this.f40354b.getShort();
            int c9 = c();
            b bVar = this.f40355c;
            bVar.f40350h = (c9 & 128) != 0;
            bVar.i = (int) Math.pow(2.0d, (c9 & 7) + 1);
            this.f40355c.f40351j = c();
            b bVar2 = this.f40355c;
            c();
            bVar2.getClass();
            if (this.f40355c.f40350h && !a()) {
                b bVar3 = this.f40355c;
                bVar3.f40343a = e(bVar3.i);
                b bVar4 = this.f40355c;
                bVar4.f40352k = bVar4.f40343a[bVar4.f40351j];
            }
        } else {
            this.f40355c.f40344b = 1;
        }
        if (!a()) {
            boolean z3 = false;
            while (!z3 && !a() && this.f40355c.f40345c <= Integer.MAX_VALUE) {
                int c10 = c();
                if (c10 == 33) {
                    int c11 = c();
                    if (c11 == 1) {
                        f();
                    } else if (c11 == 249) {
                        this.f40355c.f40346d = new C4947a();
                        c();
                        int c12 = c();
                        C4947a c4947a = this.f40355c.f40346d;
                        int i6 = (c12 & 28) >> 2;
                        c4947a.f40339g = i6;
                        if (i6 == 0) {
                            c4947a.f40339g = 1;
                        }
                        c4947a.f40338f = (c12 & 1) != 0;
                        short s9 = this.f40354b.getShort();
                        if (s9 < 2) {
                            s9 = 10;
                        }
                        C4947a c4947a2 = this.f40355c.f40346d;
                        c4947a2.i = s9 * 10;
                        c4947a2.f40340h = c();
                        c();
                    } else if (c11 == 254) {
                        f();
                    } else if (c11 != 255) {
                        f();
                    } else {
                        d();
                        StringBuilder sb2 = new StringBuilder();
                        int i9 = 0;
                        while (true) {
                            bArr = this.f40353a;
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
                                    this.f40355c.getClass();
                                }
                                if (this.f40356d > 0) {
                                }
                            } while (!a());
                        } else {
                            f();
                        }
                    }
                } else if (c10 == 44) {
                    b bVar5 = this.f40355c;
                    if (bVar5.f40346d == null) {
                        bVar5.f40346d = new C4947a();
                    }
                    bVar5.f40346d.f40333a = this.f40354b.getShort();
                    this.f40355c.f40346d.f40334b = this.f40354b.getShort();
                    this.f40355c.f40346d.f40335c = this.f40354b.getShort();
                    this.f40355c.f40346d.f40336d = this.f40354b.getShort();
                    int c13 = c();
                    boolean z6 = (c13 & 128) != 0;
                    int pow = (int) Math.pow(2.0d, (c13 & 7) + 1);
                    C4947a c4947a3 = this.f40355c.f40346d;
                    c4947a3.f40337e = (c13 & 64) != 0;
                    if (z6) {
                        c4947a3.f40342k = e(pow);
                    } else {
                        c4947a3.f40342k = null;
                    }
                    this.f40355c.f40346d.f40341j = this.f40354b.position();
                    c();
                    f();
                    if (!a()) {
                        b bVar6 = this.f40355c;
                        bVar6.f40345c++;
                        bVar6.f40347e.add(bVar6.f40346d);
                    }
                } else if (c10 != 59) {
                    this.f40355c.f40344b = 1;
                } else {
                    z3 = true;
                }
            }
            b bVar7 = this.f40355c;
            if (bVar7.f40345c < 0) {
                bVar7.f40344b = 1;
            }
        }
        return this.f40355c;
    }

    public final int c() {
        try {
            return this.f40354b.get() & 255;
        } catch (Exception unused) {
            this.f40355c.f40344b = 1;
            return 0;
        }
    }

    public final void d() {
        int c9 = c();
        this.f40356d = c9;
        if (c9 <= 0) {
            return;
        }
        int i = 0;
        int i6 = 0;
        while (true) {
            try {
                i6 = this.f40356d;
                if (i >= i6) {
                    return;
                }
                i6 -= i;
                this.f40354b.get(this.f40353a, i, i6);
                i += i6;
            } catch (Exception e9) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    StringBuilder h9 = AbstractC4404f.h(i, i6, "Error Reading Block n: ", " count: ", " blockSize: ");
                    h9.append(this.f40356d);
                    Log.d("GifHeaderParser", h9.toString(), e9);
                }
                this.f40355c.f40344b = 1;
                return;
            }
        }
    }

    public final int[] e(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.f40354b.get(bArr);
            iArr = new int[256];
            int i6 = 0;
            int i9 = 0;
            while (i6 < i) {
                int i10 = bArr[i9] & 255;
                int i11 = i9 + 2;
                int i12 = bArr[i9 + 1] & 255;
                i9 += 3;
                int i13 = i6 + 1;
                iArr[i6] = (i12 << 8) | (i10 << 16) | (-16777216) | (bArr[i11] & 255);
                i6 = i13;
            }
            return iArr;
        } catch (BufferUnderflowException e9) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e9);
            }
            this.f40355c.f40344b = 1;
            return iArr;
        }
    }

    public final void f() {
        int c9;
        do {
            c9 = c();
            this.f40354b.position(Math.min(this.f40354b.position() + c9, this.f40354b.limit()));
        } while (c9 > 0);
    }
}
