package defpackage;

import android.util.Log;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public class ygt {
    public ByteBuffer b;
    public wgt c;
    public final byte[] a = new byte[256];
    public int d = 0;

    public final boolean a() {
        return this.c.b != 0;
    }

    public final wgt b() {
        byte[] bArr;
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
        wgt wgtVar = this.c;
        if (startsWith) {
            wgtVar.f = this.b.getShort();
            this.c.g = this.b.getShort();
            int c = c();
            wgt wgtVar2 = this.c;
            wgtVar2.h = (c & 128) != 0;
            wgtVar2.i = (int) Math.pow(2.0d, (c & 7) + 1);
            this.c.j = c();
            wgt wgtVar3 = this.c;
            c();
            wgtVar3.getClass();
            if (this.c.h && !a()) {
                wgt wgtVar4 = this.c;
                wgtVar4.a = e(wgtVar4.i);
                wgt wgtVar5 = this.c;
                wgtVar5.k = wgtVar5.a[wgtVar5.j];
            }
        } else {
            wgtVar.b = 1;
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
                        this.c.d = new sgt();
                        c();
                        int c4 = c();
                        sgt sgtVar = this.c.d;
                        int i2 = (c4 & 28) >> 2;
                        sgtVar.g = i2;
                        if (i2 == 0) {
                            sgtVar.g = 1;
                        }
                        sgtVar.f = (c4 & 1) != 0;
                        short s = this.b.getShort();
                        if (s < 2) {
                            s = 10;
                        }
                        sgt sgtVar2 = this.c.d;
                        sgtVar2.i = s * 10;
                        sgtVar2.h = c();
                        c();
                    } else if (c3 == 254) {
                        f();
                    } else if (c3 != 255) {
                        f();
                    } else {
                        d();
                        StringBuilder sb2 = new StringBuilder();
                        int i3 = 0;
                        while (true) {
                            bArr = this.a;
                            if (i3 >= 11) {
                                break;
                            }
                            sb2.append((char) bArr[i3]);
                            i3++;
                        }
                        if (sb2.toString().equals("NETSCAPE2.0")) {
                            do {
                                d();
                                if (bArr[0] == 1) {
                                    this.c.l = (bArr[1] & 255) | ((bArr[2] & 255) << 8);
                                }
                                if (this.d > 0) {
                                }
                            } while (!a());
                        } else {
                            f();
                        }
                    }
                } else if (c2 == 44) {
                    wgt wgtVar6 = this.c;
                    if (wgtVar6.d == null) {
                        wgtVar6.d = new sgt();
                    }
                    wgtVar6.d.a = this.b.getShort();
                    this.c.d.b = this.b.getShort();
                    this.c.d.c = this.b.getShort();
                    this.c.d.d = this.b.getShort();
                    int c5 = c();
                    boolean z2 = (c5 & 128) != 0;
                    int pow = (int) Math.pow(2.0d, (c5 & 7) + 1);
                    sgt sgtVar3 = this.c.d;
                    sgtVar3.e = (c5 & 64) != 0;
                    if (z2) {
                        sgtVar3.k = e(pow);
                    } else {
                        sgtVar3.k = null;
                    }
                    this.c.d.j = this.b.position();
                    c();
                    f();
                    if (!a()) {
                        wgt wgtVar7 = this.c;
                        wgtVar7.c++;
                        wgtVar7.e.add(wgtVar7.d);
                    }
                } else if (c2 != 59) {
                    this.c.b = 1;
                } else {
                    z = true;
                }
            }
            wgt wgtVar8 = this.c;
            if (wgtVar8.c < 0) {
                wgtVar8.b = 1;
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
