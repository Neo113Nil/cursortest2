package defpackage;

import androidx.media3.extractor.FlacStreamMetadata;

/* loaded from: classes.dex */
public class zg2 implements fap {
    public final /* synthetic */ int a;
    public final long b;
    public final Object c;

    public zg2(long j, long j2) {
        this.a = 2;
        this.b = j;
        iap iapVar = j2 == 0 ? iap.c : new iap(0L, j2);
        this.c = new eap(iapVar, iapVar);
    }

    @Override // defpackage.fap
    public final eap e(long j) {
        switch (this.a) {
            case 0:
                ah2 ah2Var = (ah2) this.c;
                eap b = ah2Var.i[0].b(j);
                int i = 1;
                while (true) {
                    uk4[] uk4VarArr = ah2Var.i;
                    if (i >= uk4VarArr.length) {
                        return b;
                    }
                    eap b2 = uk4VarArr[i].b(j);
                    if (b2.a.b < b.a.b) {
                        b = b2;
                    }
                    i++;
                }
            case 1:
                FlacStreamMetadata flacStreamMetadata = (FlacStreamMetadata) this.c;
                vq1.B(flacStreamMetadata.seekTable);
                vgc vgcVar = flacStreamMetadata.seekTable;
                long[] jArr = vgcVar.a;
                long[] jArr2 = vgcVar.b;
                int e = dvt.e(jArr, flacStreamMetadata.getSampleNumber(j), false);
                long j2 = e == -1 ? 0L : jArr[e];
                long j3 = e != -1 ? jArr2[e] : 0L;
                int i2 = flacStreamMetadata.sampleRate;
                long j4 = (j2 * 1000000) / i2;
                long j5 = this.b;
                iap iapVar = new iap(j4, j3 + j5);
                if (j4 == j || e == jArr.length - 1) {
                    return new eap(iapVar, iapVar);
                }
                int i3 = e + 1;
                return new eap(iapVar, new iap((jArr[i3] * 1000000) / i2, j5 + jArr2[i3]));
            default:
                return (eap) this.c;
        }
    }

    @Override // defpackage.fap
    public final boolean g() {
        switch (this.a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.fap
    public final long k() {
        switch (this.a) {
            case 0:
                return this.b;
            case 1:
                return ((FlacStreamMetadata) this.c).getDurationUs();
            default:
                return this.b;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public zg2(long j) {
        this(j, 0L);
        this.a = 2;
    }

    public /* synthetic */ zg2(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }
}
