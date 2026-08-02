package com.anythink.core.common.n.a;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.IDN;

/* loaded from: classes.dex */
final class b extends a {
    private final int i;

    /* renamed from: j, reason: collision with root package name */
    private final String f15572j;

    public b(short s9, int i, String str) {
        this(s9, i, str, (byte) 0);
    }

    private String c() {
        return this.f15572j;
    }

    public final int a() {
        return this.i;
    }

    public final byte[] b() {
        String str = this.f15572j;
        if (str == null || str.length() == 0) {
            throw new IOException("host can not empty");
        }
        int i = this.f15569f;
        if (i != 0 && i != 1 && i != 2 && i != 5) {
            throw new IOException("opCode is not valid");
        }
        int i4 = this.f15570g;
        if (i4 != 0 && i4 != 1) {
            throw new IOException("rd is not valid");
        }
        int i6 = this.i;
        if (i6 != 1 && i6 != 28 && i6 != 5 && i6 != 16) {
            throw new IOException("recordType is not valid");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeShort(this.f15568e);
        dataOutputStream.writeByte((this.f15569f << 3) + this.f15570g);
        dataOutputStream.writeByte(0);
        dataOutputStream.writeByte(0);
        dataOutputStream.writeByte(1);
        dataOutputStream.writeByte(0);
        dataOutputStream.writeByte(0);
        dataOutputStream.writeByte(0);
        dataOutputStream.writeByte(0);
        dataOutputStream.writeByte(0);
        dataOutputStream.writeByte(0);
        for (String str2 : this.f15572j.split("[.。．｡]")) {
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

    private b(short s9, int i, String str, byte b9) {
        this.f15568e = s9;
        this.f15569f = 0;
        this.f15570g = 1;
        this.i = i;
        this.f15572j = str;
    }
}
