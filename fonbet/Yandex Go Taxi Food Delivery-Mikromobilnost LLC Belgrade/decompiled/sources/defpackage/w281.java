package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import yads.nm0;

/* loaded from: classes7.dex */
public final class w281 {
    public final ByteArrayOutputStream a;
    public final DataOutputStream b;

    public w281() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.a = byteArrayOutputStream;
        this.b = new DataOutputStream(byteArrayOutputStream);
    }

    public final byte[] a(nm0 nm0Var) {
        DataOutputStream dataOutputStream = this.b;
        ByteArrayOutputStream byteArrayOutputStream = this.a;
        byteArrayOutputStream.reset();
        try {
            dataOutputStream.writeBytes(nm0Var.b);
            dataOutputStream.writeByte(0);
            String str = nm0Var.c;
            if (str == null) {
                str = "";
            }
            dataOutputStream.writeBytes(str);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(nm0Var.d);
            dataOutputStream.writeLong(nm0Var.e);
            dataOutputStream.write(nm0Var.f);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            ny61.j(e);
            return null;
        }
    }
}
