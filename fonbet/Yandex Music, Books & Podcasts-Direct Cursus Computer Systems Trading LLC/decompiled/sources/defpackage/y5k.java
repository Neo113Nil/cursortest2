package defpackage;

/* loaded from: classes.dex */
public abstract class y5k {
    public static final long a;
    public static final /* synthetic */ int b = 0;

    static {
        les[] lesVarArr = kes.b;
        a = kes.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0024, code lost:
    
        if (r1 == r18.a) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final x5k a(x5k x5kVar, int i, int i2, long j, fcs fcsVar, duk dukVar, h6g h6gVar, int i3, int i4, lds ldsVar) {
        long j2;
        int i5 = i;
        int i6 = i2;
        long j3 = j;
        fcs fcsVar2 = fcsVar;
        duk dukVar2 = dukVar;
        h6g h6gVar2 = h6gVar;
        int i7 = i3;
        int i8 = i4;
        lds ldsVar2 = ldsVar;
        if (i5 == Integer.MIN_VALUE) {
            j2 = 0;
        } else {
            j2 = 0;
        }
        les[] lesVarArr = kes.b;
        if (((j3 & 1095216660480L) == j2 || kes.a(j3, x5kVar.c)) && ((fcsVar2 == null || fcsVar2.equals(x5kVar.d)) && ((i6 == Integer.MIN_VALUE || i6 == x5kVar.b) && ((dukVar2 == null || dukVar2.equals(x5kVar.e)) && (h6gVar2 == null || h6gVar2.equals(x5kVar.f)))))) {
            int i9 = u5g.b;
            if ((i7 == 0 || i7 == x5kVar.g) && ((i8 == Integer.MIN_VALUE || i8 == x5kVar.h) && (ldsVar2 == null || ldsVar2.equals(x5kVar.i)))) {
                return x5kVar;
            }
        }
        les[] lesVarArr2 = kes.b;
        if ((j3 & 1095216660480L) == j2) {
            j3 = x5kVar.c;
        }
        if (fcsVar2 == null) {
            fcsVar2 = x5kVar.d;
        }
        if (i5 == Integer.MIN_VALUE) {
            i5 = x5kVar.a;
        }
        if (i6 == Integer.MIN_VALUE) {
            i6 = x5kVar.b;
        }
        duk dukVar3 = x5kVar.e;
        if (dukVar3 != null && dukVar2 == null) {
            dukVar2 = dukVar3;
        }
        if (h6gVar2 == null) {
            h6gVar2 = x5kVar.f;
        }
        int i10 = u5g.b;
        if (i7 == 0) {
            i7 = x5kVar.g;
        }
        if (i8 == Integer.MIN_VALUE) {
            i8 = x5kVar.h;
        }
        if (ldsVar2 == null) {
            ldsVar2 = x5kVar.i;
        }
        return new x5k(i5, i6, j3, fcsVar2, dukVar2, h6gVar2, i7, i8, ldsVar2);
    }
}
