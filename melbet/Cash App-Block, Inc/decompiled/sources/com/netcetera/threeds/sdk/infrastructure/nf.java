package com.netcetera.threeds.sdk.infrastructure;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* loaded from: classes5.dex */
public final class nf {
    private static int ThreeDS2Service = 0;
    private static int ThreeDS2ServiceInstance = 1;

    public static <T> T ThreeDS2ServiceInstance(T t) {
        return (T) initialize(new Object[]{t}, -2036394939, 2036394939, (int) System.currentTimeMillis());
    }

    private static /* synthetic */ Object get(Object[] objArr) {
        Object obj = objArr[0];
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new ObjectOutputStream(byteArrayOutputStream).writeObject(obj);
            Object readObject = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray())).readObject();
            int i = ThreeDS2Service;
            ThreeDS2ServiceInstance = (((i & (-54)) | ((~i) & 53)) + ((i & 53) << 1)) % 128;
            return readObject;
        } catch (IOException | ClassNotFoundException e) {
            throw setTextAlignment.ThreeDS2ServiceInstance.initialize(obj, e);
        }
    }

    public static /* synthetic */ Object initialize(Object[] objArr, int i, int i2, int i3) {
        return get(objArr);
    }
}
