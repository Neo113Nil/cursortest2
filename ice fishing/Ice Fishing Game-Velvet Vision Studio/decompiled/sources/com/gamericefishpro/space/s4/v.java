package com.gamericefishpro.space.s4;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class v {
    public static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final com.gamericefishpro.space.tb.s b;
    public volatile int c = 0;

    public v(com.gamericefishpro.space.tb.s sVar, int i) {
        this.b = sVar;
        this.a = i;
    }

    public final int a(int i) {
        com.gamericefishpro.space.t4.a aVarB = b();
        int iA = aVarB.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) aVarB.v;
        int i2 = iA + aVarB.d;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final com.gamericefishpro.space.t4.a b() {
        ThreadLocal threadLocal = d;
        com.gamericefishpro.space.t4.a aVar = (com.gamericefishpro.space.t4.a) threadLocal.get();
        if (aVar == null) {
            aVar = new com.gamericefishpro.space.t4.a();
            threadLocal.set(aVar);
        }
        com.gamericefishpro.space.t4.b bVar = (com.gamericefishpro.space.t4.b) this.b.d;
        int iA = bVar.a(6);
        if (iA != 0) {
            int i = iA + bVar.d;
            int i2 = (this.a * 4) + ((ByteBuffer) bVar.v).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) bVar.v).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) bVar.v;
            aVar.v = byteBuffer;
            if (byteBuffer != null) {
                aVar.d = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                aVar.e = i4;
                aVar.i = ((ByteBuffer) aVar.v).getShort(i4);
                return aVar;
            }
            aVar.d = 0;
            aVar.e = 0;
            aVar.i = 0;
        }
        return aVar;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        com.gamericefishpro.space.t4.a aVarB = b();
        int iA = aVarB.a(4);
        sb.append(Integer.toHexString(iA != 0 ? ((ByteBuffer) aVarB.v).getInt(iA + aVarB.d) : 0));
        sb.append(", codepoints:");
        com.gamericefishpro.space.t4.a aVarB2 = b();
        int iA2 = aVarB2.a(16);
        if (iA2 != 0) {
            int i2 = iA2 + aVarB2.d;
            i = ((ByteBuffer) aVarB2.v).getInt(((ByteBuffer) aVarB2.v).getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(a(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
