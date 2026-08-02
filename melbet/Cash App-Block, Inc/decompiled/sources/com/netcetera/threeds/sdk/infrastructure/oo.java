package com.netcetera.threeds.sdk.infrastructure;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public abstract class oo {
    private final int ThreeDS2Service;
    private final int ThreeDS2ServiceInstance;
    protected final byte get = 61;
    protected final int getWarnings;
    private final int initialize;

    public static class get {
        long ThreeDS2Service;
        int ThreeDS2ServiceInstance;
        int cleanup;
        byte[] get;
        int getSDKInfo;
        boolean getSDKVersion;
        int getWarnings;
        int initialize;

        public String toString() {
            String simpleName = getClass().getSimpleName();
            String arrays = Arrays.toString(this.get);
            int i = this.getSDKInfo;
            boolean z = this.getSDKVersion;
            int i2 = this.ThreeDS2ServiceInstance;
            long j = this.ThreeDS2Service;
            int i3 = this.cleanup;
            int i4 = this.initialize;
            int i5 = this.getWarnings;
            StringBuilder sb = new StringBuilder();
            sb.append(simpleName);
            sb.append("[buffer=");
            sb.append(arrays);
            sb.append(", currentLinePos=");
            sb.append(i);
            sb.append(", eof=");
            sb.append(z);
            sb.append(", ibitWorkArea=");
            sb.append(i2);
            Boxes$$ExternalSyntheticOutline1.m1151m(j, ", lbitWorkArea=", ", modulus=", sb);
            Recorder$$ExternalSyntheticOutline1.m105m(i3, i4, ", pos=", ", readPos=", sb);
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i5, "]", sb);
        }
    }

    public oo(int i, int i2, int i3, int i4) {
        this.ThreeDS2ServiceInstance = i;
        this.initialize = i2;
        this.getWarnings = (i3 <= 0 || i4 <= 0) ? 0 : (i3 / i2) * i2;
        this.ThreeDS2Service = i4;
    }

    private byte[] getWarnings(get getVar) {
        byte[] bArr = getVar.get;
        if (bArr == null) {
            getVar.get = new byte[initialize()];
            getVar.initialize = 0;
            getVar.getWarnings = 0;
        } else {
            byte[] bArr2 = new byte[bArr.length * 2];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            getVar.get = bArr2;
        }
        return getVar.get;
    }

    public int ThreeDS2Service(get getVar) {
        if (getVar.get != null) {
            return getVar.initialize - getVar.getWarnings;
        }
        return 0;
    }

    public abstract boolean ThreeDS2Service(byte b);

    public boolean ThreeDS2ServiceInstance(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        for (byte b : bArr) {
            if (61 == b || ThreeDS2Service(b)) {
                return true;
            }
        }
        return false;
    }

    public abstract void get(byte[] bArr, int i, int i2, get getVar);

    public byte[] get(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        get getVar = new get();
        getWarnings(bArr, 0, bArr.length, getVar);
        getWarnings(bArr, 0, -1, getVar);
        int i = getVar.initialize;
        byte[] bArr2 = new byte[i];
        initialize(bArr2, 0, i, getVar);
        return bArr2;
    }

    public abstract void getWarnings(byte[] bArr, int i, int i2, get getVar);

    public int initialize(byte[] bArr, int i, int i2, get getVar) {
        if (getVar.get == null) {
            return getVar.getSDKVersion ? -1 : 0;
        }
        int min = Math.min(ThreeDS2Service(getVar), i2);
        System.arraycopy(getVar.get, getVar.getWarnings, bArr, i, min);
        int i3 = getVar.getWarnings + min;
        getVar.getWarnings = i3;
        if (i3 >= getVar.initialize) {
            getVar.get = null;
        }
        return min;
    }

    public String ThreeDS2Service(byte[] bArr) {
        return rr.initialize(initialize(bArr));
    }

    public byte[] ThreeDS2ServiceInstance(String str) {
        return get(rr.ThreeDS2Service(str));
    }

    public byte[] initialize(int i, get getVar) {
        byte[] bArr = getVar.get;
        return (bArr == null || bArr.length < getVar.initialize + i) ? getWarnings(getVar) : bArr;
    }

    public int initialize() {
        return PKIFailureInfo.certRevoked;
    }

    public byte[] initialize(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        get getVar = new get();
        get(bArr, 0, bArr.length, getVar);
        get(bArr, 0, -1, getVar);
        int i = getVar.initialize - getVar.getWarnings;
        byte[] bArr2 = new byte[i];
        initialize(bArr2, 0, i, getVar);
        return bArr2;
    }
}
