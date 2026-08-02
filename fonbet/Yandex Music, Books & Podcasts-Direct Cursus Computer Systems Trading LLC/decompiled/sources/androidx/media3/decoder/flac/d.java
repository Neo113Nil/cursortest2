package androidx.media3.decoder.flac;

import defpackage.eap;
import defpackage.fap;
import defpackage.iap;

/* loaded from: classes.dex */
public final class d implements fap {
    public final long a;
    public final FlacDecoderJni b;

    public d(long j, FlacDecoderJni flacDecoderJni) {
        this.a = j;
        this.b = flacDecoderJni;
    }

    @Override // defpackage.fap
    public final eap e(long j) {
        eap seekPoints = this.b.getSeekPoints(j);
        if (seekPoints != null) {
            return seekPoints;
        }
        iap iapVar = iap.c;
        return new eap(iapVar, iapVar);
    }

    @Override // defpackage.fap
    public final boolean g() {
        return true;
    }

    @Override // defpackage.fap
    public final long k() {
        return this.a;
    }
}
