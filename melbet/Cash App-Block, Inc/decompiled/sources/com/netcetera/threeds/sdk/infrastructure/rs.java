package com.netcetera.threeds.sdk.infrastructure;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

/* loaded from: classes5.dex */
public class rs implements rp {
    @Override // com.netcetera.threeds.sdk.infrastructure.rp
    public byte[] ThreeDS2ServiceInstance(byte[] bArr) {
        Deflater deflater = new Deflater(8, true);
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
                    try {
                        deflaterOutputStream.write(bArr);
                        deflaterOutputStream.finish();
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        deflaterOutputStream.close();
                        byteArrayOutputStream.close();
                        return byteArray;
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
            } catch (IOException e) {
                throw new rt("Problem compressing data.", e);
            }
        } finally {
            deflater.end();
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.rp
    public byte[] get(byte[] bArr) {
        Inflater inflater = new Inflater(true);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                InflaterInputStream inflaterInputStream = new InflaterInputStream(new ByteArrayInputStream(bArr), inflater);
                try {
                    byte[] bArr2 = new byte[256];
                    while (true) {
                        int read = inflaterInputStream.read(bArr2);
                        if (read == -1) {
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            inflaterInputStream.close();
                            return byteArray;
                        }
                        byteArrayOutputStream.write(bArr2, 0, read);
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        try {
                            inflaterInputStream.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
            } finally {
                inflater.end();
            }
        } catch (IOException e) {
            throw new ro("Problem decompressing data.", e);
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.pc
    public boolean initialize() {
        return true;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.pc
    public String ThreeDS2ServiceInstance() {
        return "DEF";
    }
}
