package defpackage;

import com.yandex.go.permission.b;
import ru.yandex.taxi.superapp.u;
import ru.yandex.taxi.systemrequeirements.location.f;

/* loaded from: classes6.dex */
public final class zdn implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ u b;

    public /* synthetic */ zdn(u uVar, int i) {
        this.a = i;
        this.b = uVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        u uVar = this.b;
        switch (i) {
            case 0:
                gcn gcnVar = (gcn) obj2;
                f fVar = uVar.d;
                if (((b) fVar.a.a).a(15) && !fVar.b.c()) {
                    gcnVar.a(u.f);
                    break;
                } else {
                    gcnVar.a(u.g);
                    break;
                }
                break;
            case 1:
                uVar.b((gcn) obj2);
                break;
            default:
                ((a60) uVar.c).d();
                ((gcn) obj2).a(new ck7(zy11Var, null));
                break;
        }
        return zy11Var;
    }
}
