package ru.CryptoPro.JCSP.tools.common.window;

/* loaded from: classes4.dex */
public class ReaderItem {
    private final int appletIndex;
    private final String commonDescription;
    private final int readerIndex;

    public ReaderItem(String str, int i, int i2) {
        this.commonDescription = str;
        this.readerIndex = i;
        this.appletIndex = i2;
    }

    public int getAppletIndex() {
        return this.appletIndex;
    }

    public String getCommonDescription() {
        return this.commonDescription;
    }

    public int getReaderIndex() {
        return this.readerIndex;
    }

    public String toString() {
        return this.commonDescription;
    }
}
