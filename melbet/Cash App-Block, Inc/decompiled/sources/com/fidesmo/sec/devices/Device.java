package com.fidesmo.sec.devices;

import io.reactivex.rxjava3.core.Observable;
import java.util.List;

/* loaded from: classes4.dex */
public interface Device {
    void close();

    String getDeviceId();

    int getMaxTransceiveLength();

    byte[] getUid();

    boolean isConnected();

    Observable<List<byte[]>> transceive(List<byte[]> list);

    Observable<byte[]> transceive(byte[] bArr);
}
