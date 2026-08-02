package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ade {
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final long f;
    public final int g;
    public final boolean h;
    public final ArrayList i;
    public final zce j;
    public boolean k;

    public ade(String str, float f, float f2, float f3, float f4, long j, int i, boolean z, int i2) {
        str = (i2 & 1) != 0 ? "" : str;
        long j2 = (i2 & 32) != 0 ? d85.n : j;
        int i3 = (i2 & 64) != 0 ? 5 : i;
        boolean z2 = (i2 & 128) != 0 ? false : z;
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = j2;
        this.g = i3;
        this.h = z2;
        ArrayList arrayList = new ArrayList();
        this.i = arrayList;
        zce zceVar = new zce(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
        this.j = zceVar;
        arrayList.add(zceVar);
    }

    public static void a(ade adeVar, ArrayList arrayList, int i, f3r f3rVar, int i2) {
        if (adeVar.k) {
            sme.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        ((zce) vz1.m(adeVar.i, 1)).j.add(new qzt("", arrayList, i, f3rVar, 1.0f, null, 1.0f, 1.0f, 0, i2, 1.0f, 0.0f, 1.0f, 0.0f));
    }

    public final bde b() {
        if (this.k) {
            sme.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        while (true) {
            ArrayList arrayList = this.i;
            if (arrayList.size() <= 1) {
                zce zceVar = this.j;
                bde bdeVar = new bde(this.a, this.b, this.c, this.d, this.e, new mzt(zceVar.a, zceVar.b, zceVar.c, zceVar.d, zceVar.e, zceVar.f, zceVar.g, zceVar.h, zceVar.i, zceVar.j), this.f, this.g, this.h);
                this.k = true;
                return bdeVar;
            }
            if (this.k) {
                sme.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            zce zceVar2 = (zce) arrayList.remove(arrayList.size() - 1);
            ((zce) vz1.m(arrayList, 1)).j.add(new mzt(zceVar2.a, zceVar2.b, zceVar2.c, zceVar2.d, zceVar2.e, zceVar2.f, zceVar2.g, zceVar2.h, zceVar2.i, zceVar2.j));
        }
    }
}
