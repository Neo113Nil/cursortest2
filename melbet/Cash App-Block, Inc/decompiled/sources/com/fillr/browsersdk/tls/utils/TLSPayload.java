package com.fillr.browsersdk.tls.utils;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.caverock.androidsvg.SVG;
import com.fillr.browsersdk.Fillr;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class TLSPayload {
    public static final byte[] CANNED_EXTENSION_INFO = {0, 21, -1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 11, 0, 4, 3, 0, 1, 2, 0, 5, 0, 0};
    public final byte[] content;
    public final byte payloadType;
    public final int protocolType;

    public TLSPayload(ByteArrayInputStream byteArrayInputStream, int i, int i2) {
        this.protocolType = i;
        byte read = (byte) (byteArrayInputStream.read() & 255);
        this.payloadType = read;
        int i3 = 1;
        if (read != 1) {
            SVG svg = Fillr.getInstance().fillrConfig;
            return;
        }
        if (i == 22) {
            i3 = TLSUtils.readUint24(byteArrayInputStream);
        } else if (i != 21) {
            i3 = 0;
            if (i != 20) {
                SVG svg2 = Fillr.getInstance().fillrConfig;
            }
        }
        try {
            this.content = TLSUtils.readBytes(byteArrayInputStream, i3);
        } catch (IOException unused) {
            this.content = new byte[i3];
        }
    }

    public final byte[] toBytes() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(this.payloadType);
        byte[] bArr = this.content;
        int i = this.protocolType;
        if (i == 22) {
            TLSUtils.writeRLEByteArray(byteArrayOutputStream, bArr, 16777215);
        } else if (i == 21) {
            byteArrayOutputStream.write(bArr);
        } else if (i != 20) {
            a$$ExternalSyntheticBUOutline0.m$4(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Unsupported protocol for TLS payload; protocolType="));
            return null;
        }
        return byteArrayOutputStream.toByteArray();
    }

    public TLSPayload(ByteArrayInputStream byteArrayInputStream, int i) {
        int i2;
        this.protocolType = i;
        this.payloadType = (byte) (byteArrayInputStream.read() & 255);
        if (i == 22) {
            i2 = TLSUtils.readUint24(byteArrayInputStream);
        } else if (i == 21) {
            i2 = 1;
        } else {
            if (i != 20) {
                SVG svg = Fillr.getInstance().fillrConfig;
            }
            i2 = 0;
        }
        try {
            this.content = TLSUtils.readBytes(byteArrayInputStream, i2);
        } catch (IOException unused) {
            this.content = new byte[i2];
        }
    }

    public TLSPayload(byte[] bArr, byte b) {
        this.protocolType = 22;
        this.payloadType = b;
        this.content = bArr;
    }
}
