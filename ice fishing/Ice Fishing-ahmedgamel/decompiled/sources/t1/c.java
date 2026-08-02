package t1;

import android.util.Log;
import com.google.android.gms.internal.ads.Wv;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public ByteBuffer f40858b;

    /* renamed from: c, reason: collision with root package name */
    public b f40859c;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f40857a = new byte[256];

    /* renamed from: d, reason: collision with root package name */
    public int f40860d = 0;

    public final boolean a() {
        return this.f40859c.f40848b != 0;
    }

    public final b b() {
        byte[] bArr;
        if (this.f40858b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (a()) {
            return this.f40859c;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) c());
        }
        if (sb.toString().startsWith("GIF")) {
            this.f40859c.f40852f = this.f40858b.getShort();
            this.f40859c.f40853g = this.f40858b.getShort();
            int c9 = c();
            b bVar = this.f40859c;
            bVar.f40854h = (c9 & 128) != 0;
            bVar.i = (int) Math.pow(2.0d, (c9 & 7) + 1);
            this.f40859c.f40855j = c();
            b bVar2 = this.f40859c;
            c();
            bVar2.getClass();
            if (this.f40859c.f40854h && !a()) {
                b bVar3 = this.f40859c;
                bVar3.f40847a = e(bVar3.i);
                b bVar4 = this.f40859c;
                bVar4.f40856k = bVar4.f40847a[bVar4.f40855j];
            }
        } else {
            this.f40859c.f40848b = 1;
        }
        if (!a()) {
            boolean z6 = false;
            while (!z6 && !a() && this.f40859c.f40849c <= Integer.MAX_VALUE) {
                int c10 = c();
                if (c10 == 33) {
                    int c11 = c();
                    if (c11 == 1) {
                        f();
                    } else if (c11 == 249) {
                        this.f40859c.f40850d = new C5031a();
                        c();
                        int c12 = c();
                        C5031a c5031a = this.f40859c.f40850d;
                        int i4 = (c12 & 28) >> 2;
                        c5031a.f40843g = i4;
                        if (i4 == 0) {
                            c5031a.f40843g = 1;
                        }
                        c5031a.f40842f = (c12 & 1) != 0;
                        short s9 = this.f40858b.getShort();
                        if (s9 < 2) {
                            s9 = 10;
                        }
                        C5031a c5031a2 = this.f40859c.f40850d;
                        c5031a2.i = s9 * 10;
                        c5031a2.f40844h = c();
                        c();
                    } else if (c11 == 254) {
                        f();
                    } else if (c11 != 255) {
                        f();
                    } else {
                        d();
                        StringBuilder sb2 = new StringBuilder();
                        int i6 = 0;
                        while (true) {
                            bArr = this.f40857a;
                            if (i6 >= 11) {
                                break;
                            }
                            sb2.append((char) bArr[i6]);
                            i6++;
                        }
                        if (sb2.toString().equals("NETSCAPE2.0")) {
                            do {
                                d();
                                if (bArr[0] == 1) {
                                    byte b9 = bArr[1];
                                    byte b10 = bArr[2];
                                    this.f40859c.getClass();
                                }
                                if (this.f40860d > 0) {
                                }
                            } while (!a());
                        } else {
                            f();
                        }
                    }
                } else if (c10 == 44) {
                    b bVar5 = this.f40859c;
                    if (bVar5.f40850d == null) {
                        bVar5.f40850d = new C5031a();
                    }
                    bVar5.f40850d.f40837a = this.f40858b.getShort();
                    this.f40859c.f40850d.f40838b = this.f40858b.getShort();
                    this.f40859c.f40850d.f40839c = this.f40858b.getShort();
                    this.f40859c.f40850d.f40840d = this.f40858b.getShort();
                    int c13 = c();
                    boolean z9 = (c13 & 128) != 0;
                    int pow = (int) Math.pow(2.0d, (c13 & 7) + 1);
                    C5031a c5031a3 = this.f40859c.f40850d;
                    c5031a3.f40841e = (c13 & 64) != 0;
                    if (z9) {
                        c5031a3.f40846k = e(pow);
                    } else {
                        c5031a3.f40846k = null;
                    }
                    this.f40859c.f40850d.f40845j = this.f40858b.position();
                    c();
                    f();
                    if (!a()) {
                        b bVar6 = this.f40859c;
                        bVar6.f40849c++;
                        bVar6.f40851e.add(bVar6.f40850d);
                    }
                } else if (c10 != 59) {
                    this.f40859c.f40848b = 1;
                } else {
                    z6 = true;
                }
            }
            b bVar7 = this.f40859c;
            if (bVar7.f40849c < 0) {
                bVar7.f40848b = 1;
            }
        }
        return this.f40859c;
    }

    public final int c() {
        try {
            return this.f40858b.get() & 255;
        } catch (Exception unused) {
            this.f40859c.f40848b = 1;
            return 0;
        }
    }

    public final void d() {
        int c9 = c();
        this.f40860d = c9;
        if (c9 <= 0) {
            return;
        }
        int i = 0;
        int i4 = 0;
        while (true) {
            try {
                i4 = this.f40860d;
                if (i >= i4) {
                    return;
                }
                i4 -= i;
                this.f40858b.get(this.f40857a, i, i4);
                i += i4;
            } catch (Exception e9) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    StringBuilder j6 = Wv.j(i, i4, "Error Reading Block n: ", " count: ", " blockSize: ");
                    j6.append(this.f40860d);
                    Log.d("GifHeaderParser", j6.toString(), e9);
                }
                this.f40859c.f40848b = 1;
                return;
            }
        }
    }

    public final int[] e(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.f40858b.get(bArr);
            iArr = new int[256];
            int i4 = 0;
            int i6 = 0;
            while (i4 < i) {
                int i9 = bArr[i6] & 255;
                int i10 = i6 + 2;
                int i11 = bArr[i6 + 1] & 255;
                i6 += 3;
                int i12 = i4 + 1;
                iArr[i4] = (i11 << 8) | (i9 << 16) | (-16777216) | (bArr[i10] & 255);
                i4 = i12;
            }
            return iArr;
        } catch (BufferUnderflowException e9) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e9);
            }
            this.f40859c.f40848b = 1;
            return iArr;
        }
    }

    public final void f() {
        int c9;
        do {
            c9 = c();
            this.f40858b.position(Math.min(this.f40858b.position() + c9, this.f40858b.limit()));
        } while (c9 > 0);
    }
}
