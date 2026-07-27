package androidx.versionedparcelable;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class JadeCircuitRepositoryHandlerFd8aOaRu4KfBwsZfSU11883101491413 extends FilterInputStream {
    public long LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public long RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;

    public JadeCircuitRepositoryHandlerFd8aOaRu4KfBwsZfSU11883101491413(InputStream inputStream) {
        super(inputStream);
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = -1L;
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = 1048577L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return (int) Math.min(((FilterInputStream) this).in.available(), this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        ((FilterInputStream) this).in.mark(i);
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        long j = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        if (j == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read(bArr, i, (int) Math.min(i2, j));
        if (read != -1) {
            this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 -= read;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        long skip = ((FilterInputStream) this).in.skip(Math.min(j, this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867));
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 -= skip;
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867--;
        }
        return read;
    }
}
