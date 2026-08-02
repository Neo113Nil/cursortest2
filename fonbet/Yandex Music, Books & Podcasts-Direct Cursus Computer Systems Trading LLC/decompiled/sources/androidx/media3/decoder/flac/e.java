package androidx.media3.decoder.flac;

import androidx.media3.extractor.FlacStreamMetadata;
import defpackage.au1;
import defpackage.azs;
import defpackage.b6e;
import defpackage.bq0;
import defpackage.bsc;
import defpackage.ci0;
import defpackage.d7k;
import defpackage.dvt;
import defpackage.eta;
import defpackage.fap;
import defpackage.gm7;
import defpackage.l5i;
import defpackage.o03;
import defpackage.qgc;
import defpackage.qwp;
import defpackage.r2c;
import defpackage.rgc;
import defpackage.s2c;
import defpackage.t2c;
import defpackage.u2i;
import defpackage.zg2;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class e implements r2c {
    public static final /* synthetic */ int k = 0;
    public final d7k a = new d7k();
    public final boolean b;
    public FlacDecoderJni c;
    public t2c d;
    public azs e;
    public boolean f;
    public FlacStreamMetadata g;
    public au1 h;
    public u2i i;
    public b j;

    public e(int i) {
        this.b = (i & 1) != 0;
    }

    @Override // defpackage.r2c
    public final void a() {
        this.j = null;
        FlacDecoderJni flacDecoderJni = this.c;
        if (flacDecoderJni != null) {
            flacDecoderJni.release();
            this.c = null;
        }
    }

    @Override // defpackage.r2c
    public final void b(long j, long j2) {
        if (j == 0) {
            this.f = false;
        }
        FlacDecoderJni flacDecoderJni = this.c;
        if (flacDecoderJni != null) {
            flacDecoderJni.reset(j);
        }
        b bVar = this.j;
        if (bVar != null) {
            bVar.B(j2);
        }
    }

    public final void c(s2c s2cVar) {
        fap zg2Var;
        if (this.f) {
            return;
        }
        FlacDecoderJni flacDecoderJni = this.c;
        try {
            FlacStreamMetadata decodeStreamMetadata = flacDecoderJni.decodeStreamMetadata();
            this.f = true;
            if (this.g == null) {
                this.g = decodeStreamMetadata;
                int maxDecodedFrameSize = decodeStreamMetadata.getMaxDecodedFrameSize();
                d7k d7kVar = this.a;
                d7kVar.E(maxDecodedFrameSize);
                this.h = new au1(ByteBuffer.wrap(d7kVar.a));
                long length = s2cVar.getLength();
                t2c t2cVar = this.d;
                au1 au1Var = this.h;
                b bVar = null;
                if (flacDecoderJni.getSeekPoints(0L) != null) {
                    zg2Var = new d(decodeStreamMetadata.getDurationUs(), flacDecoderJni);
                } else if (length == -1 || decodeStreamMetadata.totalSamples <= 0) {
                    zg2Var = new zg2(decodeStreamMetadata.getDurationUs());
                } else {
                    bVar = new b(decodeStreamMetadata, flacDecoderJni.getDecodePosition(), length, flacDecoderJni, au1Var);
                    zg2Var = (o03) bVar.c;
                }
                t2cVar.E(zg2Var);
                this.j = bVar;
                u2i metadataCopyWithAppendedEntriesFrom = decodeStreamMetadata.getMetadataCopyWithAppendedEntriesFrom(this.i);
                azs azsVar = this.e;
                bsc bscVar = new bsc();
                bscVar.l = l5i.p("audio/flac");
                bscVar.m = l5i.p("audio/raw");
                bscVar.h = decodeStreamMetadata.getDecodedBitrate();
                bscVar.i = decodeStreamMetadata.getDecodedBitrate();
                bscVar.n = decodeStreamMetadata.getMaxDecodedFrameSize();
                bscVar.C = decodeStreamMetadata.channels;
                bscVar.D = decodeStreamMetadata.sampleRate;
                bscVar.E = dvt.I(decodeStreamMetadata.bitsPerSample);
                bscVar.k = metadataCopyWithAppendedEntriesFrom;
                eta.o(bscVar, azsVar);
                azs azsVar2 = this.e;
                decodeStreamMetadata.getDurationUs();
                azsVar2.getClass();
            }
        } catch (IOException e) {
            flacDecoderJni.reset(0L);
            s2cVar.m(0L, e);
            throw e;
        }
    }

    @Override // defpackage.r2c
    public final boolean d(s2c s2cVar) {
        this.i = qwp.j0(s2cVar, !this.b);
        d7k d7kVar = new d7k(4);
        ((gm7) s2cVar).l(d7kVar.a, 0, 4, false);
        return d7kVar.x() == 1716281667;
    }

    @Override // defpackage.r2c
    public final int h(s2c s2cVar, ci0 ci0Var) {
        boolean z = true;
        if (s2cVar.getPosition() == 0 && !this.b && this.i == null) {
            this.i = qwp.j0(s2cVar, true);
        }
        FlacDecoderJni flacDecoderJni = this.c;
        flacDecoderJni.getClass();
        flacDecoderJni.setData(s2cVar);
        try {
            c(s2cVar);
            b bVar = this.j;
            d7k d7kVar = this.a;
            if (bVar != null) {
                if (((bq0) bVar.e) == null) {
                    z = false;
                }
                if (z) {
                    au1 au1Var = this.h;
                    azs azsVar = this.e;
                    int t = bVar.t(s2cVar, ci0Var);
                    ByteBuffer byteBuffer = (ByteBuffer) au1Var.c;
                    if (t == 0 && byteBuffer.limit() > 0) {
                        int limit = byteBuffer.limit();
                        long j = au1Var.b;
                        d7kVar.H(0);
                        azsVar.b(d7kVar, limit, 0);
                        azsVar.a(j, 1, limit, 0, null);
                    }
                    return t;
                }
            }
            ByteBuffer byteBuffer2 = (ByteBuffer) this.h.c;
            long decodePosition = flacDecoderJni.getDecodePosition();
            try {
                flacDecoderJni.decodeSampleWithBacktrackPosition(byteBuffer2, decodePosition);
                int limit2 = byteBuffer2.limit();
                if (limit2 == 0) {
                    return -1;
                }
                long lastFrameTimestamp = flacDecoderJni.getLastFrameTimestamp();
                azs azsVar2 = this.e;
                d7kVar.H(0);
                azsVar2.b(d7kVar, limit2, 0);
                azsVar2.a(lastFrameTimestamp, 1, limit2, 0, null);
                return flacDecoderJni.isEndOfData() ? -1 : 0;
            } catch (rgc e) {
                throw new IOException("Cannot read frame at position " + decodePosition, e);
            }
        } finally {
            flacDecoderJni.clearData();
        }
    }

    @Override // defpackage.r2c
    public final void l(t2c t2cVar) {
        this.d = t2cVar;
        this.e = t2cVar.M(0, 1);
        this.d.K();
        try {
            this.c = new FlacDecoderJni();
        } catch (qgc e) {
            b6e.q(e);
        }
    }
}
