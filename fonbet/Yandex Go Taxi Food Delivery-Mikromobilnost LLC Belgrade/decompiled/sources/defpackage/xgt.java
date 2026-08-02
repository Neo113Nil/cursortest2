package defpackage;

import android.util.Log;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* loaded from: classes15.dex */
public class xgt {
    public ByteBuffer b;
    public vgt c;
    public final byte[] a = new byte[256];
    public int d = 0;

    public final boolean a() {
        return this.c.b != 0;
    }

    public final vgt b(ByteBuffer byteBuffer) {
        this.b = null;
        byte[] bArr = this.a;
        Arrays.fill(bArr, (byte) 0);
        this.c = new vgt();
        this.d = 0;
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.b = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.b.order(ByteOrder.LITTLE_ENDIAN);
        if (this.b == null) {
            ny61.r("You must call setData() before parseHeader()");
            return null;
        }
        if (a()) {
            return this.c;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) c());
        }
        boolean startsWith = sb.toString().startsWith("GIF");
        vgt vgtVar = this.c;
        if (startsWith) {
            vgtVar.f = this.b.getShort();
            this.c.g = this.b.getShort();
            int c = c();
            vgt vgtVar2 = this.c;
            vgtVar2.h = (c & 128) != 0;
            vgtVar2.i = (int) Math.pow(2.0d, (c & 7) + 1);
            this.c.j = c();
            vgt vgtVar3 = this.c;
            c();
            vgtVar3.getClass();
            if (this.c.h && !a()) {
                vgt vgtVar4 = this.c;
                vgtVar4.a = e(vgtVar4.i);
                vgt vgtVar5 = this.c;
                vgtVar5.k = vgtVar5.a[vgtVar5.j];
            }
        } else {
            vgtVar.b = 1;
        }
        if (!a()) {
            boolean z = false;
            while (!z && !a() && this.c.c <= Integer.MAX_VALUE) {
                int c2 = c();
                if (c2 == 33) {
                    int c3 = c();
                    if (c3 == 1) {
                        f();
                    } else if (c3 == 249) {
                        this.c.d = new rgt();
                        c();
                        int c4 = c();
                        rgt rgtVar = this.c.d;
                        int i2 = (c4 & 28) >> 2;
                        rgtVar.g = i2;
                        if (i2 == 0) {
                            rgtVar.g = 1;
                        }
                        rgtVar.f = (c4 & 1) != 0;
                        short s = this.b.getShort();
                        if (s < 2) {
                            s = 10;
                        }
                        rgt rgtVar2 = this.c.d;
                        rgtVar2.i = s * 10;
                        rgtVar2.h = c();
                        c();
                    } else if (c3 == 254) {
                        f();
                    } else if (c3 != 255) {
                        f();
                    } else {
                        d();
                        StringBuilder sb2 = new StringBuilder();
                        for (int i3 = 0; i3 < 11; i3++) {
                            sb2.append((char) bArr[i3]);
                        }
                        if (sb2.toString().equals("NETSCAPE2.0")) {
                            do {
                                d();
                                if (bArr[0] == 1) {
                                    byte b = bArr[1];
                                    byte b2 = bArr[2];
                                    this.c.getClass();
                                }
                                if (this.d > 0) {
                                }
                            } while (!a());
                        } else {
                            f();
                        }
                    }
                } else if (c2 == 44) {
                    vgt vgtVar6 = this.c;
                    if (vgtVar6.d == null) {
                        vgtVar6.d = new rgt();
                    }
                    vgtVar6.d.a = this.b.getShort();
                    this.c.d.b = this.b.getShort();
                    this.c.d.c = this.b.getShort();
                    this.c.d.d = this.b.getShort();
                    int c5 = c();
                    boolean z2 = (c5 & 128) != 0;
                    int pow = (int) Math.pow(2.0d, (c5 & 7) + 1);
                    rgt rgtVar3 = this.c.d;
                    rgtVar3.e = (c5 & 64) != 0;
                    if (z2) {
                        rgtVar3.k = e(pow);
                    } else {
                        rgtVar3.k = null;
                    }
                    this.c.d.j = this.b.position();
                    c();
                    f();
                    if (!a()) {
                        vgt vgtVar7 = this.c;
                        vgtVar7.c++;
                        vgtVar7.e.add(vgtVar7.d);
                    }
                } else if (c2 != 59) {
                    this.c.b = 1;
                } else {
                    z = true;
                }
            }
            vgt vgtVar8 = this.c;
            if (vgtVar8.c < 0) {
                vgtVar8.b = 1;
            }
        }
        return this.c;
    }

    public final int c() {
        try {
            return this.b.get() & 255;
        } catch (Exception unused) {
            this.c.b = 1;
            return 0;
        }
    }

    public final void d() {
        int c = c();
        this.d = c;
        if (c <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            try {
                int i2 = this.d;
                if (i >= i2) {
                    return;
                }
                int i3 = i2 - i;
                this.b.get(this.a, i, i3);
                i += i3;
            } catch (Exception unused) {
                Log.isLoggable("GifHeaderParser", 3);
                this.c.b = 1;
                return;
            }
        }
    }

    public final int[] e(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.b.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = bArr[i3] & 255;
                int i5 = i3 + 2;
                int i6 = bArr[i3 + 1] & 255;
                i3 += 3;
                int i7 = i2 + 1;
                iArr[i2] = (i6 << 8) | (i4 << 16) | ModalContentViewContainer.BASE_SHADOW_COLOR | (bArr[i5] & 255);
                i2 = i7;
            }
            return iArr;
        } catch (BufferUnderflowException unused) {
            Log.isLoggable("GifHeaderParser", 3);
            this.c.b = 1;
            return iArr;
        }
    }

    public final void f() {
        int c;
        do {
            c = c();
            this.b.position(Math.min(this.b.position() + c, this.b.limit()));
        } while (c > 0);
    }
}
