package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class rym extends InputStream implements cif {
    public vzh a;
    public final n7k b;
    public ByteArrayInputStream c;

    public rym(vzh vzhVar, n7k n7kVar) {
        this.a = vzhVar;
        this.b = n7kVar;
    }

    public final int a(OutputStream outputStream) {
        vzh vzhVar = this.a;
        if (vzhVar != null) {
            int serializedSize = vzhVar.getSerializedSize();
            this.a.writeTo(outputStream);
            this.a = null;
            return serializedSize;
        }
        ByteArrayInputStream byteArrayInputStream = this.c;
        if (byteArrayInputStream == null) {
            return 0;
        }
        z0c z0cVar = tym.a;
        o2g.O(outputStream, "outputStream cannot be null!");
        byte[] bArr = new byte[RemoteCameraConfig.Notification.ID];
        long j = 0;
        while (true) {
            int read = byteArrayInputStream.read(bArr);
            if (read == -1) {
                int i = (int) j;
                this.c = null;
                return i;
            }
            outputStream.write(bArr, 0, read);
            j += read;
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        vzh vzhVar = this.a;
        if (vzhVar != null) {
            return vzhVar.getSerializedSize();
        }
        ByteArrayInputStream byteArrayInputStream = this.c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.available();
        }
        return 0;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        vzh vzhVar = this.a;
        if (vzhVar != null) {
            int serializedSize = vzhVar.getSerializedSize();
            if (serializedSize == 0) {
                this.a = null;
                this.c = null;
                return -1;
            }
            if (i2 >= serializedSize) {
                Logger logger = yr4.b;
                sr4 sr4Var = new sr4(bArr, i, serializedSize);
                this.a.writeTo(sr4Var);
                if (sr4Var.D() != 0) {
                    xq0.q("Did not write as much data as expected.");
                    return 0;
                }
                this.a = null;
                this.c = null;
                return serializedSize;
            }
            this.c = new ByteArrayInputStream(this.a.toByteArray());
            this.a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read(bArr, i, i2);
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.a != null) {
            this.c = new ByteArrayInputStream(this.a.toByteArray());
            this.a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read();
        }
        return -1;
    }
}
