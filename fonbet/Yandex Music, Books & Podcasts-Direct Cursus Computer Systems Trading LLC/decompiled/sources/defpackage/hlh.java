package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class hlh implements qlh {
    public final /* synthetic */ int a;
    public final /* synthetic */ ulh b;
    public final /* synthetic */ List c;

    public /* synthetic */ hlh(ulh ulhVar, List list, int i) {
        this.a = i;
        this.b = ulhVar;
        this.c = list;
    }

    @Override // defpackage.qlh
    public final void b(c9e c9eVar, int i) {
        switch (this.a) {
            case 0:
                gmh gmhVar = this.b.c;
                tde u = yde.u();
                int i2 = 0;
                while (true) {
                    List list = this.c;
                    if (i2 >= list.size()) {
                        c9eVar.j0(gmhVar, i, new vk3(u.f()), true);
                        break;
                    } else {
                        u.a(((onh) list.get(i2)).e(true));
                        i2++;
                    }
                }
            default:
                gmh gmhVar2 = this.b.c;
                tde u2 = yde.u();
                int i3 = 0;
                while (true) {
                    List list2 = this.c;
                    if (i3 >= list2.size()) {
                        c9eVar.o0(gmhVar2, i, new vk3(u2.f()));
                        break;
                    } else {
                        u2.a(((onh) list2.get(i3)).e(true));
                        i3++;
                    }
                }
        }
    }
}
