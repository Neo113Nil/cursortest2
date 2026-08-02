package com.netcetera.threeds.sdk.infrastructure;

import java.io.Reader;
import java.math.BigInteger;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
class oz {
    private static final String[] cleanup;
    private static final int[] getSDKInfo;
    private static final int[] initialize;
    private int ConfigParameters;
    private boolean ConfigurationBuilder;
    private int apiKey;
    private int createTransaction;
    private int getParamValue;
    private Reader getSDKVersion;
    private int onCompleted;
    private int onError;
    private int removeParam;
    private int restrictedParameters;
    private static final int[] getWarnings = {0, 0, 1, 1};
    private static final char[] get = ThreeDS2ServiceInstance("\t\u0000\u0001\u0007\u0001\u0007\u0002\u0000\u0001\u0007\u0012\u0000\u0001\u0007\u0001\u0000\u0001\t\b\u0000\u0001\u0006\u0001\u0019\u0001\u0002\u0001\u0004\u0001\n\n\u0003\u0001\u001a\u0006\u0000\u0004\u0001\u0001\u0005\u0001\u0001\u0014\u0000\u0001\u0017\u0001\b\u0001\u0018\u0003\u0000\u0001\u0012\u0001\u000b\u0002\u0001\u0001\u0011\u0001\f\u0005\u0000\u0001\u0013\u0001\u0000\u0001\r\u0003\u0000\u0001\u000e\u0001\u0014\u0001\u000f\u0001\u0010\u0005\u0000\u0001\u0015\u0001\u0000\u0001\u0016ﾂ\u0000");
    private static final int[] ThreeDS2ServiceInstance = getWarnings();
    private static final int[] ThreeDS2Service = ThreeDS2Service();
    private int ThreeDS2ServiceInitializationCallback = 0;
    private char[] addParam = new char[16384];
    private boolean configureScheme = true;
    private StringBuilder SchemeConfiguration = new StringBuilder();

    static {
        int[] iArr = new int[675];
        ByteBuffer.wrap("\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u0004\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0005\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0006\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0007\u0000\u0000\u0000\b\u0000\u0000\u0000\u0002\u0000\u0000\u0000\t\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0002\u0000\u0000\u0000\n\u0000\u0000\u0000\u000b\u0000\u0000\u0000\f\u0000\u0000\u0000\r\u0000\u0000\u0000\u000e\u0000\u0000\u0000\u000f\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0011\u0000\u0000\u0000\u0012\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000\u0004ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000\u0004\u0000\u0000\u0000\u0013\u0000\u0000\u0000\u0014ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000\u0014ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000\u0005ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000\u0015ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000\u0016ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000\u0017ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010ÿÿÿÿÿÿÿÿ\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000\u0018\u0000\u0000\u0000\u0019\u0000\u0000\u0000\u001a\u0000\u0000\u0000\u001b\u0000\u0000\u0000\u001c\u0000\u0000\u0000\u001d\u0000\u0000\u0000\u001e\u0000\u0000\u0000\u001f\u0000\u0000\u0000 ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000!ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000\"\u0000\u0000\u0000#ÿÿÿÿÿÿÿÿ\u0000\u0000\u0000\"ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000$ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000%ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000&ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000'ÿÿÿÿ\u0000\u0000\u0000'ÿÿÿÿ\u0000\u0000\u0000'ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000'\u0000\u0000\u0000'ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000'\u0000\u0000\u0000'ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000!ÿÿÿÿ\u0000\u0000\u0000\u0014ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000\u0014ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000#ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000&ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000(ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000)ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000*ÿÿÿÿ\u0000\u0000\u0000*ÿÿÿÿ\u0000\u0000\u0000*ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000*\u0000\u0000\u0000*ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000*\u0000\u0000\u0000*ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000+ÿÿÿÿ\u0000\u0000\u0000+ÿÿÿÿ\u0000\u0000\u0000+ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000+\u0000\u0000\u0000+ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000+\u0000\u0000\u0000+ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000,ÿÿÿÿ\u0000\u0000\u0000,ÿÿÿÿ\u0000\u0000\u0000,ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000,\u0000\u0000\u0000,ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000,\u0000\u0000\u0000,ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ".getBytes("ISO-8859-1")).asIntBuffer().get(iArr, 0, 675);
        initialize = iArr;
        cleanup = new String[]{"Unkown internal scanner error", "Error: could not match input", "Error: pushback value was too large"};
        getSDKInfo = ThreeDS2ServiceInitializationCallback();
    }

    public oz(Reader reader) {
        this.getSDKVersion = reader;
    }

    private static int ThreeDS2Service(String str, int i, int[] iArr) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            int charAt = str.charAt(i2) << 16;
            i2 += 2;
            iArr[i] = str.charAt(i3) | charAt;
            i++;
        }
        return i;
    }

    private static int[] ThreeDS2ServiceInitializationCallback() {
        int[] iArr = new int[45];
        getWarnings("\u0002\u0000\u0001\t\u0003\u0001\u0001\t\u0003\u0001\u0006\t\u0002\u0001\u0001\t\u0005\u0000\b\t\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0004\u0000\u0002\t\u0002\u0000\u0001\t", 0, iArr);
        return iArr;
    }

    private static char[] ThreeDS2ServiceInstance(String str) {
        char[] cArr = new char[65536];
        int i = 0;
        int i2 = 0;
        while (i < 90) {
            int i3 = i + 1;
            int charAt = str.charAt(i);
            i += 2;
            char charAt2 = str.charAt(i3);
            do {
                cArr[i2] = charAt2;
                charAt--;
                i2++;
            } while (charAt > 0);
        }
        return cArr;
    }

    private boolean getSDKInfo() {
        int read;
        int i = this.onCompleted;
        if (i > 0) {
            char[] cArr = this.addParam;
            System.arraycopy(cArr, i, cArr, 0, this.getParamValue - i);
            int i2 = this.getParamValue;
            int i3 = this.onCompleted;
            this.getParamValue = i2 - i3;
            this.ConfigParameters -= i3;
            this.onError -= i3;
            this.onCompleted = 0;
        }
        int i4 = this.ConfigParameters;
        char[] cArr2 = this.addParam;
        if (i4 >= cArr2.length) {
            char[] cArr3 = new char[i4 * 2];
            System.arraycopy(cArr2, 0, cArr3, 0, cArr2.length);
            this.addParam = cArr3;
        }
        Reader reader = this.getSDKVersion;
        char[] cArr4 = this.addParam;
        int i5 = this.getParamValue;
        int read2 = reader.read(cArr4, i5, cArr4.length - i5);
        if (read2 > 0) {
            this.getParamValue += read2;
            return false;
        }
        if (read2 != 0 || (read = this.getSDKVersion.read()) == -1) {
            return true;
        }
        char[] cArr5 = this.addParam;
        int i6 = this.getParamValue;
        this.getParamValue = i6 + 1;
        cArr5[i6] = (char) read;
        return false;
    }

    private static int getWarnings(String str, int i, int[] iArr) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            int charAt = str.charAt(i2);
            i2 += 2;
            char charAt2 = str.charAt(i3);
            do {
                iArr[i] = charAt2;
                charAt--;
                i++;
            } while (charAt > 0);
        }
        return i;
    }

    public pf get() {
        char c;
        int i;
        int i2 = this.getParamValue;
        char[] cArr = this.addParam;
        char[] cArr2 = get;
        int[] iArr = initialize;
        int[] iArr2 = ThreeDS2Service;
        int[] iArr3 = getSDKInfo;
        while (true) {
            int i3 = this.onError;
            this.removeParam = (i3 - this.onCompleted) + this.removeParam;
            this.onCompleted = i3;
            this.ConfigParameters = i3;
            this.createTransaction = getWarnings[this.ThreeDS2ServiceInitializationCallback];
            char c2 = 65535;
            int i4 = i3;
            int i5 = -1;
            while (true) {
                if (i3 < i2) {
                    i = i3 + 1;
                    c = cArr[i3];
                } else if (this.ConfigurationBuilder) {
                    c = c2;
                } else {
                    this.ConfigParameters = i3;
                    this.onError = i4;
                    boolean sDKInfo = getSDKInfo();
                    int i6 = this.ConfigParameters;
                    i4 = this.onError;
                    char[] cArr3 = this.addParam;
                    int i7 = this.getParamValue;
                    if (sDKInfo) {
                        cArr = cArr3;
                        c = c2;
                        i2 = i7;
                    } else {
                        i = i6 + 1;
                        i2 = i7;
                        c = cArr3[i6];
                        cArr = cArr3;
                    }
                }
                int i8 = iArr[iArr2[this.createTransaction] + cArr2[c]];
                if (i8 != c2) {
                    this.createTransaction = i8;
                    int i9 = iArr3[i8];
                    if ((i9 & 1) == 1) {
                        i4 = i;
                        i5 = i8;
                        if ((i9 & 8) == 8) {
                        }
                    }
                    i3 = i;
                    c2 = 65535;
                }
            }
            this.onError = i4;
            if (i5 >= 0) {
                i5 = ThreeDS2ServiceInstance[i5];
            }
            switch (i5) {
                case 1:
                    throw new oy(this.removeParam, 0, new Character(ThreeDS2Service(0)));
                case 2:
                    String initialize2 = initialize();
                    try {
                        return new pf(0, Long.valueOf(initialize2));
                    } catch (NumberFormatException unused) {
                        return new pf(0, new BigInteger(initialize2));
                    }
                case 3:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                    break;
                case 4:
                    this.SchemeConfiguration = null;
                    this.SchemeConfiguration = new StringBuilder();
                    getWarnings(2);
                    break;
                case 5:
                    return new pf(1, null);
                case 6:
                    return new pf(2, null);
                case 7:
                    return new pf(3, null);
                case 8:
                    return new pf(4, null);
                case 9:
                    return new pf(5, null);
                case 10:
                    return new pf(6, null);
                case 11:
                    this.SchemeConfiguration.append(initialize());
                    break;
                case 12:
                    this.SchemeConfiguration.append('\\');
                    break;
                case 13:
                    getWarnings(0);
                    return new pf(0, this.SchemeConfiguration.toString());
                case 14:
                    this.SchemeConfiguration.append('\"');
                    break;
                case 15:
                    this.SchemeConfiguration.append('/');
                    break;
                case 16:
                    this.SchemeConfiguration.append('\b');
                    break;
                case 17:
                    this.SchemeConfiguration.append('\f');
                    break;
                case 18:
                    this.SchemeConfiguration.append('\n');
                    break;
                case 19:
                    this.SchemeConfiguration.append('\r');
                    break;
                case 20:
                    this.SchemeConfiguration.append('\t');
                    break;
                case 21:
                    return new pf(0, Double.valueOf(initialize()));
                case 22:
                    return new pf(0, null);
                case 23:
                    return new pf(0, Boolean.valueOf(initialize()));
                case 24:
                    try {
                        this.SchemeConfiguration.append((char) Integer.parseInt(initialize().substring(2), 16));
                        break;
                    } catch (Exception e) {
                        throw new oy(this.removeParam, 2, e);
                    }
                default:
                    if (c != 65535 || this.onCompleted != this.ConfigParameters) {
                        initialize(1);
                        break;
                    } else {
                        this.ConfigurationBuilder = true;
                        return null;
                    }
                    break;
            }
        }
    }

    public final void initialize(Reader reader) {
        this.getSDKVersion = reader;
        this.configureScheme = true;
        this.ConfigurationBuilder = false;
        this.onCompleted = 0;
        this.getParamValue = 0;
        this.onError = 0;
        this.ConfigParameters = 0;
        this.restrictedParameters = 0;
        this.removeParam = 0;
        this.apiKey = 0;
        this.ThreeDS2ServiceInitializationCallback = 0;
    }

    public final String initialize() {
        char[] cArr = this.addParam;
        int i = this.onCompleted;
        return new String(cArr, i, this.onError - i);
    }

    private void initialize(int i) {
        String str;
        try {
            str = cleanup[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            str = cleanup[0];
        }
        throw new Error(str);
    }

    private static int[] ThreeDS2Service() {
        int[] iArr = new int[45];
        ThreeDS2Service("\u0000\u0000\u0000\u001b\u00006\u0000Q\u0000l\u0000\u0087\u00006\u0000¢\u0000½\u0000Ø\u00006\u00006\u00006\u00006\u00006\u00006\u0000ó\u0000Ď\u00006\u0000ĩ\u0000ń\u0000ş\u0000ź\u0000ƕ\u00006\u00006\u00006\u00006\u00006\u00006\u00006\u00006\u0000ư\u0000ǋ\u0000Ǧ\u0000Ǧ\u0000ȁ\u0000Ȝ\u0000ȷ\u0000ɒ\u00006\u00006\u0000ɭ\u0000ʈ\u00006", 0, iArr);
        return iArr;
    }

    private static int[] getWarnings() {
        int[] iArr = new int[45];
        ThreeDS2ServiceInstance("\u0002\u0000\u0002\u0001\u0001\u0002\u0001\u0003\u0001\u0004\u0003\u0001\u0001\u0005\u0001\u0006\u0001\u0007\u0001\b\u0001\t\u0001\n\u0001\u000b\u0001\f\u0001\r\u0005\u0000\u0001\f\u0001\u000e\u0001\u000f\u0001\u0010\u0001\u0011\u0001\u0012\u0001\u0013\u0001\u0014\u0001\u0000\u0001\u0015\u0001\u0000\u0001\u0015\u0004\u0000\u0001\u0016\u0001\u0017\u0002\u0000\u0001\u0018", 0, iArr);
        return iArr;
    }

    public final char ThreeDS2Service(int i) {
        return this.addParam[this.onCompleted + i];
    }

    public final void getWarnings(int i) {
        this.ThreeDS2ServiceInitializationCallback = i;
    }

    public int ThreeDS2ServiceInstance() {
        return this.removeParam;
    }

    private static int ThreeDS2ServiceInstance(String str, int i, int[] iArr) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            int charAt = str.charAt(i2);
            i2 += 2;
            char charAt2 = str.charAt(i3);
            do {
                iArr[i] = charAt2;
                charAt--;
                i++;
            } while (charAt > 0);
        }
        return i;
    }
}
