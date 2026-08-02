package defpackage;

import kotlin.KotlinVersion;

/* loaded from: classes5.dex */
public final class sz6 extends z {
    public static sz6 D(Object obj) {
        if (obj == null || (obj instanceof sz6)) {
            return (sz6) obj;
        }
        if (obj instanceof z) {
            return (sz6) ((z) obj).z();
        }
        if (!(obj instanceof byte[])) {
            xq0.x("illegal object in getInstance: ".concat(obj.getClass().getName()));
            return null;
        }
        try {
            return (sz6) ((z) s0.y((byte[]) obj)).z();
        } catch (Exception e) {
            tiu.h(e, "encoding error in getInstance: ");
            return null;
        }
    }

    @Override // defpackage.s0
    public final void u(qxp qxpVar, boolean z) {
        byte[] bArr = this.a;
        int i = bArr[0] & 255;
        int length = bArr.length;
        int i2 = length - 1;
        byte b = bArr[i2];
        byte b2 = (byte) ((KotlinVersion.MAX_COMPONENT_VALUE << i) & b);
        if (b == b2) {
            qxpVar.v(3, z, bArr);
            return;
        }
        qxpVar.A(3, z);
        qxpVar.t(length);
        qxpVar.s(bArr, 0, i2);
        qxpVar.q(b2);
    }

    @Override // defpackage.s0
    public final boolean v() {
        return false;
    }

    @Override // defpackage.s0
    public final int w(boolean z) {
        return qxp.n(this.a.length, z);
    }

    @Override // defpackage.z, defpackage.s0
    public final s0 A() {
        return this;
    }

    @Override // defpackage.z, defpackage.s0
    public final s0 z() {
        return this;
    }
}
