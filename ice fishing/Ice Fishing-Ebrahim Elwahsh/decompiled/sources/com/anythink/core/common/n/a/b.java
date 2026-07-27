package com.anythink.core.common.n.a;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.IDN;

/* loaded from: classes.dex */
final class b extends a {
    private final int i;

    /* renamed from: j, reason: collision with root package name */
    private final String f14943j;

    public b(short s3, int i, String str) {
        this(s3, i, str, (byte) 0);
    }

    private String c() {
        return this.f14943j;
    }

    public final int a() {
        return this.i;
    }

    public final byte[] b() {
        String str = this.f14943j;
        if (str == null || str.length() == 0) {
            throw new IOException("host can not empty");
        }
        int i = this.f14940f;
        if (i != 0 && i != 1 && i != 2 && i != 5) {
            throw new IOException("opCode is not valid");
        }
        int i4 = this.f14941g;
        if (i4 != 0 && i4 != 1) {
            throw new IOException("rd is not valid");
        }
        int i9 = this.i;
        if (i9 != 1 && i9 != 28 && i9 != 5 && i9 != 16) {
            throw new IOException("recordType is not valid");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeShort(this.f14939e);
        dataOutputStream.writeByte((this.f14940f << 3) + this.f14941g);
        dataOutputStream.writeByte(0);
        dataOutputStream.writeByte(0);
        dataOutputStream.writeByte(1);
        dataOutputStream.writeByte(0);
        dataOutputStream.writeByte(0);
        dataOutputStream.writeByte(0);
        dataOutputStream.writeByte(0);
        dataOutputStream.writeByte(0);
        dataOutputStream.writeByte(0);
        for (String str2 : this.f14943j.split("[.。．｡]")) {
            if (str2.length() > 63) {
                throw new IOException("host part is too long");
            }
            byte[] bytes = IDN.toASCII(str2).getBytes();
            dataOutputStream.write(bytes.length);
            dataOutputStream.write(bytes, 0, bytes.length);
        }
        dataOutputStream.writeByte(0);
        dataOutputStream.writeByte(0);
        dataOutputStream.writeByte(this.i);
        dataOutputStream.writeByte(0);
        dataOutputStream.writeByte(1);
        return byteArrayOutputStream.toByteArray();
    }

    private b(short s3, int i, String str, byte b9) {
        this.f14939e = s3;
        this.f14940f = 0;
        this.f14941g = 1;
        this.i = i;
        this.f14943j = str;
    }
}
