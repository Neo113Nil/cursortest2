package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;

/* loaded from: classes.dex */
public final class bbx extends dbx {
    public final char[] e;

    public bbx(abx abxVar) {
        super(abxVar, (Character) null);
        this.e = new char[RemoteCameraConfig.Mic.BUFFER_SIZE];
        char[] cArr = abxVar.b;
        if (cArr.length != 16) {
            e7o.e();
            throw null;
        }
        for (int i = 0; i < 256; i++) {
            char[] cArr2 = this.e;
            cArr2[i] = cArr[i >>> 4];
            cArr2[i | 256] = cArr[i & 15];
        }
    }

    @Override // defpackage.dbx
    public final void a(StringBuilder sb, byte[] bArr, int i) {
        gdg.R(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & 255;
            char[] cArr = this.e;
            sb.append(cArr[i3]);
            sb.append(cArr[i3 | 256]);
        }
    }
}
