package com.anythink.basead.exoplayer.e;

import com.anythink.basead.exoplayer.e.m;
import com.anythink.basead.exoplayer.k.s;
import java.io.EOFException;

/* loaded from: classes.dex */
public final class d implements m {
    @Override // com.anythink.basead.exoplayer.e.m
    public final void a(long j6, int i, int i4, int i6, m.a aVar) {
    }

    @Override // com.anythink.basead.exoplayer.e.m
    public final void a(com.anythink.basead.exoplayer.m mVar) {
    }

    @Override // com.anythink.basead.exoplayer.e.m
    public final int a(f fVar, int i, boolean z6) {
        int a9 = fVar.a(i);
        if (a9 != -1) {
            return a9;
        }
        if (z6) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.anythink.basead.exoplayer.e.m
    public final void a(s sVar, int i) {
        sVar.d(i);
    }
}
