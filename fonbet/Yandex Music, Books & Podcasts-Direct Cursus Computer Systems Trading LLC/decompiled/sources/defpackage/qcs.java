package defpackage;

import android.graphics.PointF;

/* loaded from: classes.dex */
public final class qcs extends szg {
    public final /* synthetic */ gzg c;
    public final /* synthetic */ szg d;
    public final /* synthetic */ c3a e;

    public qcs(gzg gzgVar, szg szgVar, c3a c3aVar) {
        this.c = gzgVar;
        this.d = szgVar;
        this.e = c3aVar;
    }

    @Override // defpackage.szg
    public final Object a(gzg gzgVar) {
        float f = gzgVar.a;
        float f2 = gzgVar.b;
        String str = ((c3a) gzgVar.c).a;
        String str2 = ((c3a) gzgVar.d).a;
        float f3 = gzgVar.e;
        float f4 = gzgVar.f;
        float f5 = gzgVar.g;
        gzg gzgVar2 = this.c;
        gzgVar2.a = f;
        gzgVar2.b = f2;
        gzgVar2.c = str;
        gzgVar2.d = str2;
        gzgVar2.e = f3;
        gzgVar2.f = f4;
        gzgVar2.g = f5;
        String str3 = (String) this.d.a(gzgVar2);
        c3a c3aVar = (c3a) (gzgVar.f == 1.0f ? gzgVar.d : gzgVar.c);
        String str4 = c3aVar.b;
        float f6 = c3aVar.c;
        int i = c3aVar.d;
        int i2 = c3aVar.e;
        float f7 = c3aVar.f;
        float f8 = c3aVar.g;
        int i3 = c3aVar.h;
        int i4 = c3aVar.i;
        float f9 = c3aVar.j;
        boolean z = c3aVar.k;
        PointF pointF = c3aVar.l;
        PointF pointF2 = c3aVar.m;
        c3a c3aVar2 = this.e;
        c3aVar2.a = str3;
        c3aVar2.b = str4;
        c3aVar2.c = f6;
        c3aVar2.d = i;
        c3aVar2.e = i2;
        c3aVar2.f = f7;
        c3aVar2.g = f8;
        c3aVar2.h = i3;
        c3aVar2.i = i4;
        c3aVar2.j = f9;
        c3aVar2.k = z;
        c3aVar2.l = pointF;
        c3aVar2.m = pointF2;
        return c3aVar2;
    }
}
