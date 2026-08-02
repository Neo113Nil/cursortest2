package defpackage;

import androidx.media3.extractor.FlacStreamMetadata;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ugc extends rjr {
    public FlacStreamMetadata n;
    public yg3 o;

    @Override // defpackage.rjr
    public final long b(d7k d7kVar) {
        byte[] bArr = d7kVar.a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i = (bArr[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            d7kVar.I(4);
            d7kVar.C();
        }
        int n0 = bkp.n0(i, d7kVar);
        d7kVar.H(0);
        return n0;
    }

    @Override // defpackage.rjr
    public final boolean c(d7k d7kVar, long j, aqd aqdVar) {
        byte[] bArr = d7kVar.a;
        FlacStreamMetadata flacStreamMetadata = this.n;
        if (flacStreamMetadata == null) {
            FlacStreamMetadata flacStreamMetadata2 = new FlacStreamMetadata(bArr, 17);
            this.n = flacStreamMetadata2;
            bsc a = flacStreamMetadata2.getFormat(Arrays.copyOfRange(bArr, 9, d7kVar.c), null).a();
            a.l = l5i.p("audio/ogg");
            aqdVar.b = new dsc(a);
            return true;
        }
        byte b = bArr[0];
        if ((b & Byte.MAX_VALUE) != 3) {
            if (b != -1) {
                return true;
            }
            yg3 yg3Var = this.o;
            if (yg3Var != null) {
                yg3Var.a = j;
                aqdVar.c = yg3Var;
            }
            ((dsc) aqdVar.b).getClass();
            return false;
        }
        vgc m0 = qwp.m0(d7kVar);
        FlacStreamMetadata copyWithSeekTable = flacStreamMetadata.copyWithSeekTable(m0);
        this.n = copyWithSeekTable;
        yg3 yg3Var2 = new yg3();
        yg3Var2.c = copyWithSeekTable;
        yg3Var2.d = m0;
        yg3Var2.a = -1L;
        yg3Var2.b = -1L;
        this.o = yg3Var2;
        return true;
    }

    @Override // defpackage.rjr
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = null;
            this.o = null;
        }
    }
}
