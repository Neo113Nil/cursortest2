package androidx.media3.decoder.flac;

import androidx.media3.extractor.FlacStreamMetadata;
import defpackage.dvt;
import defpackage.g3a;
import defpackage.og7;
import defpackage.qg7;
import defpackage.qgc;
import defpackage.r7k;
import defpackage.rg7;
import defpackage.rgc;
import defpackage.riq;
import defpackage.siq;
import defpackage.vq1;
import defpackage.wvs;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

/* loaded from: classes.dex */
public final class c extends riq {
    public final FlacStreamMetadata o;
    public final FlacDecoderJni p;

    public c(List list, int i) {
        super(new qg7[16], new siq[16]);
        if (list.size() != 1) {
            throw new qgc("Initialization data must be of length 1");
        }
        FlacDecoderJni flacDecoderJni = new FlacDecoderJni();
        this.p = flacDecoderJni;
        flacDecoderJni.setData(ByteBuffer.wrap((byte[]) list.get(0)));
        try {
            FlacStreamMetadata decodeStreamMetadata = flacDecoderJni.decodeStreamMetadata();
            this.o = decodeStreamMetadata;
            i = i == -1 ? decodeStreamMetadata.maxFrameSize : i;
            int i2 = this.g;
            qg7[] qg7VarArr = this.e;
            vq1.A(i2 == qg7VarArr.length);
            for (qg7 qg7Var : qg7VarArr) {
                qg7Var.B(i);
            }
        } catch (r7k e) {
            throw new qgc("Failed to decode StreamInfo", e);
        } catch (IOException e2) {
            wvs.m(e2);
            throw null;
        }
    }

    @Override // defpackage.riq, defpackage.fg7
    public final void a() {
        super.a();
        this.p.release();
    }

    @Override // defpackage.riq
    public final qg7 c() {
        return new qg7(1);
    }

    @Override // defpackage.riq
    public final rg7 d() {
        return new siq(new g3a(16, this));
    }

    @Override // defpackage.riq
    public final og7 e(Throwable th) {
        return new qgc("Unexpected decode error", th);
    }

    @Override // defpackage.riq
    public final og7 j(qg7 qg7Var, rg7 rg7Var, boolean z) {
        siq siqVar = (siq) rg7Var;
        FlacDecoderJni flacDecoderJni = this.p;
        if (z) {
            flacDecoderJni.flush();
        }
        ByteBuffer byteBuffer = qg7Var.i;
        int i = dvt.a;
        flacDecoderJni.setData(byteBuffer);
        long j = qg7Var.k;
        int maxDecodedFrameSize = this.o.getMaxDecodedFrameSize();
        siqVar.g = j;
        ByteBuffer byteBuffer2 = siqVar.k;
        if (byteBuffer2 == null || byteBuffer2.capacity() < maxDecodedFrameSize) {
            siqVar.k = ByteBuffer.allocateDirect(maxDecodedFrameSize).order(ByteOrder.nativeOrder());
        }
        siqVar.k.position(0);
        siqVar.k.limit(maxDecodedFrameSize);
        try {
            flacDecoderJni.decodeSample(siqVar.k);
            return null;
        } catch (IOException e) {
            wvs.m(e);
            return null;
        } catch (rgc e2) {
            return new qgc("Frame decoding failed", e2);
        }
    }
}
