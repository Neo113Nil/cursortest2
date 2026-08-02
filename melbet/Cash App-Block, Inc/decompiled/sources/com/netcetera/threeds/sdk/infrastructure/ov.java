package com.netcetera.threeds.sdk.infrastructure;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes5.dex */
public class ov extends ArrayList implements os, ot {
    public static void ThreeDS2Service(Object[] objArr, Writer writer) {
        if (objArr == null) {
            writer.write("null");
            return;
        }
        if (objArr.length == 0) {
            writer.write("[]");
            return;
        }
        writer.write("[");
        pb.ThreeDS2ServiceInstance(objArr[0], writer);
        for (int i = 1; i < objArr.length; i++) {
            writer.write(",");
            pb.ThreeDS2ServiceInstance(objArr[i], writer);
        }
        writer.write("]");
    }

    public static void ThreeDS2ServiceInstance(float[] fArr, Writer writer) {
        if (fArr == null) {
            writer.write("null");
            return;
        }
        if (fArr.length == 0) {
            writer.write("[]");
            return;
        }
        writer.write("[");
        writer.write(String.valueOf(fArr[0]));
        for (int i = 1; i < fArr.length; i++) {
            writer.write(",");
            writer.write(String.valueOf(fArr[i]));
        }
        writer.write("]");
    }

    public static void get(char[] cArr, Writer writer) {
        if (cArr == null) {
            writer.write("null");
            return;
        }
        if (cArr.length == 0) {
            writer.write("[]");
            return;
        }
        writer.write("[\"");
        writer.write(pb.ThreeDS2Service(String.valueOf(cArr[0])));
        for (int i = 1; i < cArr.length; i++) {
            writer.write("\",\"");
            writer.write(pb.ThreeDS2Service(String.valueOf(cArr[i])));
        }
        writer.write("\"]");
    }

    public static void getWarnings(byte[] bArr, Writer writer) {
        if (bArr == null) {
            writer.write("null");
            return;
        }
        if (bArr.length == 0) {
            writer.write("[]");
            return;
        }
        writer.write("[");
        writer.write(String.valueOf((int) bArr[0]));
        for (int i = 1; i < bArr.length; i++) {
            writer.write(",");
            writer.write(String.valueOf((int) bArr[i]));
        }
        writer.write("]");
    }

    public static void initialize(Collection collection, Writer writer) {
        if (collection == null) {
            writer.write("null");
            return;
        }
        writer.write(91);
        boolean z = true;
        for (Object obj : collection) {
            if (z) {
                z = false;
            } else {
                writer.write(44);
            }
            if (obj == null) {
                writer.write("null");
            } else {
                pb.ThreeDS2ServiceInstance(obj, writer);
            }
        }
        writer.write(93);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return initialize();
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.ot
    public String initialize() {
        return ThreeDS2ServiceInstance(this);
    }

    public static String ThreeDS2ServiceInstance(Collection collection) {
        StringWriter stringWriter = new StringWriter();
        try {
            initialize(collection, stringWriter);
            return stringWriter.toString();
        } catch (IOException e) {
            a$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        }
    }

    public static void getWarnings(long[] jArr, Writer writer) {
        if (jArr == null) {
            writer.write("null");
            return;
        }
        if (jArr.length == 0) {
            writer.write("[]");
            return;
        }
        writer.write("[");
        writer.write(String.valueOf(jArr[0]));
        for (int i = 1; i < jArr.length; i++) {
            writer.write(",");
            writer.write(String.valueOf(jArr[i]));
        }
        writer.write("]");
    }

    public static void get(short[] sArr, Writer writer) {
        if (sArr == null) {
            writer.write("null");
            return;
        }
        if (sArr.length == 0) {
            writer.write("[]");
            return;
        }
        writer.write("[");
        writer.write(String.valueOf((int) sArr[0]));
        for (int i = 1; i < sArr.length; i++) {
            writer.write(",");
            writer.write(String.valueOf((int) sArr[i]));
        }
        writer.write("]");
    }

    public static void getWarnings(double[] dArr, Writer writer) {
        if (dArr == null) {
            writer.write("null");
            return;
        }
        if (dArr.length == 0) {
            writer.write("[]");
            return;
        }
        writer.write("[");
        writer.write(String.valueOf(dArr[0]));
        for (int i = 1; i < dArr.length; i++) {
            writer.write(",");
            writer.write(String.valueOf(dArr[i]));
        }
        writer.write("]");
    }

    public static void get(int[] iArr, Writer writer) {
        if (iArr == null) {
            writer.write("null");
            return;
        }
        if (iArr.length == 0) {
            writer.write("[]");
            return;
        }
        writer.write("[");
        writer.write(String.valueOf(iArr[0]));
        for (int i = 1; i < iArr.length; i++) {
            writer.write(",");
            writer.write(String.valueOf(iArr[i]));
        }
        writer.write("]");
    }

    public static void get(boolean[] zArr, Writer writer) {
        if (zArr == null) {
            writer.write("null");
            return;
        }
        if (zArr.length == 0) {
            writer.write("[]");
            return;
        }
        writer.write("[");
        writer.write(String.valueOf(zArr[0]));
        for (int i = 1; i < zArr.length; i++) {
            writer.write(",");
            writer.write(String.valueOf(zArr[i]));
        }
        writer.write("]");
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.os
    public void get(Writer writer) {
        initialize(this, writer);
    }
}
