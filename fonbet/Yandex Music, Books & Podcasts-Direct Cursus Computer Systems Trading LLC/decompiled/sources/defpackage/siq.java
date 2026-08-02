package defpackage;

import androidx.media3.decoder.flac.c;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class siq extends rg7 {
    public final g3a j;
    public ByteBuffer k;

    public siq(g3a g3aVar) {
        super(1);
        this.j = g3aVar;
    }

    @Override // defpackage.rg7
    public final void A() {
        ((c) this.j.b).n(this);
    }

    @Override // defpackage.rg7
    public final void z() {
        this.b = 0;
        this.g = 0L;
        this.h = 0;
        this.i = false;
        ByteBuffer byteBuffer = this.k;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }
}
