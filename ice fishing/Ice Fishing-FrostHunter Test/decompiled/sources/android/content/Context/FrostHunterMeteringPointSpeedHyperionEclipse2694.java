package android.content.Context;

import java.text.CharacterIterator;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterMeteringPointSpeedHyperionEclipse2694 implements CharacterIterator {
    public int FrostHunterAlertDialogAuroraDelta3200 = 0;
    public final CharSequence FrostHunterCameraXPixelTurboCosmos9814;
    public final int FrostHunterFlowMaxDragonHero5809;

    public FrostHunterMeteringPointSpeedHyperionEclipse2694(CharSequence charSequence, int i) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = charSequence;
        this.FrostHunterFlowMaxDragonHero5809 = i;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i = this.FrostHunterAlertDialogAuroraDelta3200;
        if (i == this.FrostHunterFlowMaxDragonHero5809) {
            return (char) 65535;
        }
        return this.FrostHunterCameraXPixelTurboCosmos9814.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.FrostHunterAlertDialogAuroraDelta3200 = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.FrostHunterFlowMaxDragonHero5809;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.FrostHunterAlertDialogAuroraDelta3200;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i = this.FrostHunterFlowMaxDragonHero5809;
        if (i == 0) {
            this.FrostHunterAlertDialogAuroraDelta3200 = i;
            return (char) 65535;
        }
        int i2 = i - 1;
        this.FrostHunterAlertDialogAuroraDelta3200 = i2;
        return this.FrostHunterCameraXPixelTurboCosmos9814.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i = this.FrostHunterAlertDialogAuroraDelta3200 + 1;
        this.FrostHunterAlertDialogAuroraDelta3200 = i;
        int i2 = this.FrostHunterFlowMaxDragonHero5809;
        if (i < i2) {
            return this.FrostHunterCameraXPixelTurboCosmos9814.charAt(i);
        }
        this.FrostHunterAlertDialogAuroraDelta3200 = i2;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i = this.FrostHunterAlertDialogAuroraDelta3200;
        if (i <= 0) {
            return (char) 65535;
        }
        int i2 = i - 1;
        this.FrostHunterAlertDialogAuroraDelta3200 = i2;
        return this.FrostHunterCameraXPixelTurboCosmos9814.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i) {
        if (i > this.FrostHunterFlowMaxDragonHero5809 || i < 0) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("invalid position");
            return (char) 0;
        }
        this.FrostHunterAlertDialogAuroraDelta3200 = i;
        return current();
    }
}
