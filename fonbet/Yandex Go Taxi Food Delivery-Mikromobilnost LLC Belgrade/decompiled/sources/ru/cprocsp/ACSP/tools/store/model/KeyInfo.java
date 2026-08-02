package ru.cprocsp.ACSP.tools.store.model;

/* loaded from: classes4.dex */
public class KeyInfo {
    private String keyAlgorithm;
    private int keyLength;
    private int keySpec;
    private boolean certificateIsAvailable = true;
    private boolean isExportable = false;
    private String keyPeriod = null;

    public String getKeyAlgorithm() {
        return this.keyAlgorithm;
    }

    public int getKeyLength() {
        return this.keyLength;
    }

    public String getKeyPeriod() {
        return this.keyPeriod;
    }

    public int getKeySpec() {
        return this.keySpec;
    }

    public boolean isCertificateIsAvailable() {
        return this.certificateIsAvailable;
    }

    public boolean isExportable() {
        return this.isExportable;
    }

    public void setCertificateIsAvailable(boolean z) {
        this.certificateIsAvailable = z;
    }

    public void setExportable(boolean z) {
        this.isExportable = z;
    }

    public void setKeyAlgorithm(String str) {
        this.keyAlgorithm = str;
    }

    public void setKeyLength(int i) {
        this.keyLength = i;
    }

    public void setKeyPeriod(String str) {
        this.keyPeriod = str;
    }

    public void setKeySpec(int i) {
        this.keySpec = i;
    }
}
