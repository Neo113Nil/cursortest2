package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class evc extends j8t {
    public final /* synthetic */ Object a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ gvc e;

    public evc(gvc gvcVar, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.e = gvcVar;
        this.a = obj;
        this.b = arrayList;
        this.c = obj2;
        this.d = arrayList2;
    }

    @Override // defpackage.j8t, defpackage.a8t
    public final void e(b8t b8tVar) {
        b8tVar.H(this);
    }

    @Override // defpackage.j8t, defpackage.a8t
    public final void f(b8t b8tVar) {
        gvc gvcVar = this.e;
        Object obj = this.a;
        if (obj != null) {
            gvcVar.z(obj, this.b, null);
        }
        Object obj2 = this.c;
        if (obj2 != null) {
            gvcVar.z(obj2, this.d, null);
        }
    }
}
