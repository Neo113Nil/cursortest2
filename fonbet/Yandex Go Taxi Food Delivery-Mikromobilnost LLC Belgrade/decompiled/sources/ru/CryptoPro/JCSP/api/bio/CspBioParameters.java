package ru.CryptoPro.JCSP.api.bio;

import ru.CryptoPro.JCSP.api.CspParameters;

/* loaded from: classes4.dex */
public class CspBioParameters implements CspParameters {
    private int max;
    private int progress;

    public int getMax() {
        return this.max;
    }

    public int getProgress() {
        return this.progress;
    }

    public void setMax(int i) {
        this.max = i;
    }

    public void setProgress(int i) {
        this.progress = i;
    }
}
