package ru.CryptoPro.JCSP.api.bio.event;

/* loaded from: classes4.dex */
public class CspBioChangeMaxEvent implements CspBioEvent {
    private final int max;

    public CspBioChangeMaxEvent(int i) {
        this.max = i;
    }

    public int getMax() {
        return this.max;
    }
}
