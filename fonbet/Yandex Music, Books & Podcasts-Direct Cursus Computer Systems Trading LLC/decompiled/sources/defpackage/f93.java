package defpackage;

import com.yandex.passport.sloth.ui.dependencies.m;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.data.audio.Album$AlbumType;

/* loaded from: classes3.dex */
public final /* synthetic */ class f93 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ va3 b;
    public final /* synthetic */ u0s c;
    public final /* synthetic */ jab d;

    public /* synthetic */ f93(va3 va3Var, u0s u0sVar, jab jabVar) {
        this.a = 1;
        this.b = va3Var;
        this.c = u0sVar;
        this.d = jabVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.a.i(this.d, this.c);
                break;
            case 1:
                va3 va3Var = this.b;
                va3Var.getClass();
                rmb.j(va3Var.f.a(this.d, this.c), wjb.ArtistListScreen, va3Var.h, null, 12);
                qbj qbjVar = va3Var.c;
                mt mtVar = va3Var.e;
                List list = mtVar.b;
                Album$AlbumType d = mtVar.a.d();
                qbjVar.getClass();
                list.getClass();
                d.getClass();
                List list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        if (((c01) it.next()).c) {
                            break;
                        }
                    }
                }
                new m(qbjVar.b, new s9j(4), qbjVar.a, qbjVar.c, null, 48).y(list, hld.N(d));
                break;
            default:
                va3 va3Var2 = this.b;
                va3Var2.getClass();
                rmb.a(va3Var2.f.a(this.d, this.c), sjb.Refresh, null, null, 14);
                va3Var2.b.N();
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ f93(va3 va3Var, jab jabVar, u0s u0sVar, int i) {
        this.a = i;
        this.b = va3Var;
        this.d = jabVar;
        this.c = u0sVar;
    }
}
