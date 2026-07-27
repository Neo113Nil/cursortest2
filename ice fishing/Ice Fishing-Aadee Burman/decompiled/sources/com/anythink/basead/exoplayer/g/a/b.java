package com.anythink.basead.exoplayer.g.a;

import com.anythink.basead.exoplayer.g.e;
import com.anythink.basead.exoplayer.k.af;
import com.anythink.basead.exoplayer.k.s;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b implements com.anythink.basead.exoplayer.g.b {
    @Override // com.anythink.basead.exoplayer.g.b
    public final com.anythink.basead.exoplayer.g.a a(e eVar) {
        ByteBuffer byteBuffer = eVar.f6742e;
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        s sVar = new s(array, limit);
        String p9 = sVar.p();
        String p10 = sVar.p();
        long h9 = sVar.h();
        return new com.anythink.basead.exoplayer.g.a(new a(p9, p10, af.a(sVar.h(), 1000L, h9), sVar.h(), Arrays.copyOfRange(array, sVar.c(), limit), af.a(sVar.h(), 1000000L, h9)));
    }
}
