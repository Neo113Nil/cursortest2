package ru.CryptoPro.JCSP.tools.common.window.elements;

/* loaded from: classes4.dex */
public abstract class CspBioProgressController implements ICSPBioProgressController {
    private int max;
    private int progress;

    public int getMax() {
        return this.max;
    }

    public int getProgress() {
        return this.progress;
    }

    public void installMax(int i) {
        this.max = i;
        setMax(i);
    }

    public void installProgress(int i) {
        this.progress = i;
        setProgress(i);
    }

    @Override // ru.CryptoPro.JCSP.tools.common.window.elements.ICSPBioProgressController
    public abstract /* synthetic */ void setMax(int i);

    @Override // ru.CryptoPro.JCSP.tools.common.window.elements.ICSPBioProgressController
    public abstract /* synthetic */ void setProgress(int i);
}
