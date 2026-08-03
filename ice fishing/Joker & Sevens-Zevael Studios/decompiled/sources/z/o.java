package z;

import java.util.List;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class o extends pc.k implements oc.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v1.j0[] f8995g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ List f8996h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ x1.o0 f8997i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ pc.q f8998j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ pc.q f8999k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f9000l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(v1.j0[] j0VarArr, List list, x1.o0 o0Var, pc.q qVar, pc.q qVar2, p pVar) {
        super(1);
        this.f8995g = j0VarArr;
        this.f8996h = list;
        this.f8997i = o0Var;
        this.f8998j = qVar;
        this.f8999k = qVar2;
        this.f9000l = pVar;
    }

    @Override // oc.c
    public final Object invoke(Object obj) {
        v1.i0 i0Var = (v1.i0) obj;
        v1.j0[] j0VarArr = this.f8995g;
        int length = j0VarArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i11 < length) {
            int i12 = i10;
            v1.j0 j0Var = j0VarArr[i11];
            pc.j.c(j0Var, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
            m.b(i0Var, j0Var, (v1.d0) this.f8996h.get(i12), this.f8997i.getLayoutDirection(), this.f8998j.f5681g, this.f8999k.f5681g, this.f9000l.f9001a);
            i11++;
            i10 = i12 + 1;
        }
        return ac.o.f277a;
    }
}
