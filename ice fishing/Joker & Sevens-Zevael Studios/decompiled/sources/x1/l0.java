package x1;

import java.util.Arrays;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class l0 implements s2.c {

    /* renamed from: g, reason: collision with root package name */
    public boolean f8105g;

    /* renamed from: h, reason: collision with root package name */
    public long f8106h = 9223372034707292159L;

    /* renamed from: i, reason: collision with root package name */
    public long f8107i = 0;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o0 f8108j;

    public l0(o0 o0Var) {
        this.f8108j = o0Var;
    }

    public final void a(v1.m mVar, float f10) {
        o0 o0Var = this.f8108j;
        m.n nVar = o0Var.f8128s;
        if (nVar == null) {
            nVar = new m.n();
            o0Var.f8128s = nVar;
        }
        int Z = bc.l.Z((v1.m[]) nVar.f4389b, mVar);
        if (Z >= 0) {
            float[] fArr = (float[]) nVar.f4390c;
            if (fArr[Z] != f10) {
                fArr[Z] = f10;
                ((byte[]) nVar.f4391d)[Z] = 1;
                return;
            } else {
                byte[] bArr = (byte[]) nVar.f4391d;
                if (bArr[Z] == 2) {
                    bArr[Z] = 0;
                    return;
                }
                return;
            }
        }
        int i10 = nVar.f4388a;
        v1.m[] mVarArr = (v1.m[]) nVar.f4389b;
        if (i10 == mVarArr.length) {
            int i11 = i10 * 2;
            Object[] copyOf = Arrays.copyOf(mVarArr, i11);
            pc.j.d(copyOf, "copyOf(...)");
            nVar.f4389b = (v1.m[]) copyOf;
            float[] copyOf2 = Arrays.copyOf((float[]) nVar.f4390c, i11);
            pc.j.d(copyOf2, "copyOf(...)");
            nVar.f4390c = copyOf2;
            byte[] copyOf3 = Arrays.copyOf((byte[]) nVar.f4391d, i11);
            pc.j.d(copyOf3, "copyOf(...)");
            nVar.f4391d = copyOf3;
        }
        ((v1.m[]) nVar.f4389b)[i10] = mVar;
        ((byte[]) nVar.f4391d)[i10] = 3;
        ((float[]) nVar.f4390c)[i10] = f10;
        nVar.f4388a++;
    }

    @Override // s2.c
    public final float c() {
        return this.f8108j.c();
    }

    @Override // s2.c
    public final float m() {
        return this.f8108j.m();
    }
}
