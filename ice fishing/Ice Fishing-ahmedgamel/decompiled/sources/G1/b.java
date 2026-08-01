package G1;

import B1.C0262d;
import android.content.res.Resources;
import s1.h;
import u1.x;
import y1.C5202A;
import y1.C5207b;
import y1.InterfaceC5223r;
import y1.InterfaceC5224s;

/* loaded from: classes.dex */
public final class b implements c, InterfaceC5224s {

    /* renamed from: n, reason: collision with root package name */
    public final Resources f1052n;

    public /* synthetic */ b(Resources resources) {
        this.f1052n = resources;
    }

    @Override // G1.c
    public x g(x xVar, h hVar) {
        if (xVar == null) {
            return null;
        }
        return new C0262d(this.f1052n, xVar);
    }

    @Override // y1.InterfaceC5224s
    public InterfaceC5223r i(y1.x xVar) {
        return new C5207b(this.f1052n, C5202A.f41779b);
    }
}
