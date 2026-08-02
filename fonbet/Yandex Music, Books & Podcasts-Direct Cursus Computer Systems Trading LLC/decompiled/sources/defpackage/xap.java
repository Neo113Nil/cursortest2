package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;

/* loaded from: classes5.dex */
public final class xap {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public xap f;
    public xap g;

    public xap(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        bArr.getClass();
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
    }

    public final xap a() {
        xap xapVar = this.f;
        if (xapVar == this) {
            xapVar = null;
        }
        xap xapVar2 = this.g;
        xapVar2.getClass();
        xapVar2.f = this.f;
        xap xapVar3 = this.f;
        xapVar3.getClass();
        xapVar3.g = this.g;
        this.f = null;
        this.g = null;
        return xapVar;
    }

    public final void b(xap xapVar) {
        xapVar.getClass();
        xapVar.g = this;
        xapVar.f = this.f;
        xap xapVar2 = this.f;
        xapVar2.getClass();
        xapVar2.g = xapVar;
        this.f = xapVar;
    }

    public final xap c() {
        this.d = true;
        return new xap(this.a, this.b, this.c, true, false);
    }

    public final void d(xap xapVar, int i) {
        xapVar.getClass();
        byte[] bArr = xapVar.a;
        if (!xapVar.e) {
            xq0.q("only owner can write");
            return;
        }
        int i2 = xapVar.c;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (xapVar.d) {
                e7o.e();
                return;
            }
            int i4 = xapVar.b;
            if (i3 - i4 > 8192) {
                e7o.e();
                return;
            } else {
                uz0.d(0, i4, i2, bArr, bArr);
                xapVar.c -= xapVar.b;
                xapVar.b = 0;
            }
        }
        int i5 = xapVar.c;
        int i6 = this.b;
        uz0.d(i5, i6, i6 + i, this.a, bArr);
        xapVar.c += i;
        this.b += i;
    }

    public xap() {
        this.a = new byte[RemoteCameraConfig.Notification.ID];
        this.e = true;
        this.d = false;
    }
}
