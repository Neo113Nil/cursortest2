package defpackage;

/* loaded from: classes3.dex */
public final class o5i {
    public final fci a;
    public final int b;
    public final int c;
    public final int d;
    public final o5i e;
    public final int f;

    public o5i(q5i q5iVar, fci fciVar, int i, int i2, int i3, o5i o5iVar, q0u q0uVar) {
        this.a = fciVar;
        this.b = i;
        fci fciVar2 = fci.BYTE;
        int i4 = (fciVar == fciVar2 || o5iVar == null) ? i2 : o5iVar.c;
        this.c = i4;
        this.d = i3;
        this.e = o5iVar;
        boolean z = false;
        int i5 = o5iVar != null ? o5iVar.f : 0;
        if ((fciVar == fciVar2 && o5iVar == null && i4 != 0) || (o5iVar != null && i4 != o5iVar.c)) {
            z = true;
        }
        i5 = (o5iVar == null || fciVar != o5iVar.a || z) ? i5 + fciVar.a(q0uVar) + 4 : i5;
        int ordinal = fciVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                i5 += i3 != 1 ? 11 : 6;
            } else if (ordinal == 4) {
                i5 += ((String) q5iVar.c).substring(i, i3 + i).getBytes(((eya) q5iVar.d).a[i2].charset()).length * 8;
                if (z) {
                    i5 += 12;
                }
            } else if (ordinal == 6) {
                i5 += 13;
            }
        } else {
            i5 += i3 != 1 ? i3 == 2 ? 7 : 10 : 4;
        }
        this.f = i5;
    }
}
