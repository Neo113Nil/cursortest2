package ru.CryptoPro.JCSP.api.bio.event;

/* loaded from: classes4.dex */
public class CspBioChangeProgressEvent implements CspBioEvent {
    private final int progress;

    public CspBioChangeProgressEvent(int i) {
        this.progress = i;
    }

    public int getProgress() {
        return this.progress;
    }
}
