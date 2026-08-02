package defpackage;

import com.yandex.music.shared.wave.domain.commands.d;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.ranges.IntRange;

/* loaded from: classes3.dex */
public final class zkj implements o7q {
    public final k1l a;
    public final uaa b;
    public final s7l c;
    public final arf d;

    public zkj(k1l k1lVar, uaa uaaVar, s7l s7lVar, arf arfVar) {
        uaaVar.getClass();
        arfVar.getClass();
        this.a = k1lVar;
        this.b = uaaVar;
        this.c = s7lVar;
        this.d = arfVar;
    }

    @Override // defpackage.o7q
    public final Object c() {
        return Unit.a;
    }

    @Override // defpackage.o7q
    public final Object m(ioc iocVar) {
        this.c.a();
        return Unit.a;
    }

    @Override // defpackage.o7q
    public final Object n(szu szuVar) {
        s9p i0 = hdg.i0(szuVar.a);
        arf arfVar = this.d;
        if (((vuu) arfVar.getValue()).a && wxf.m((vuu) arfVar.getValue(), i0)) {
            ssg.a(3, "OfflineModePlaybackPlugin", "current wave in offline mode is fully supported; continue as offline wave", null);
            return Unit.a;
        }
        Set set = ((lja) ((e6q) this.b).e.getValue()).a;
        IntRange f = u75.f(szuVar.k());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        boolean contains = set.contains(szuVar.l.a.a);
        int i = szuVar.i();
        int i2 = szuVar.m.b.b;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (Object obj : (List) szuVar.b.a.a.d.getValue()) {
            int i6 = i3 + 1;
            if (i3 < 0) {
                u75.n();
                throw null;
            }
            jzs jzsVar = (jzs) obj;
            if (!set.contains(jzsVar.a.a)) {
                if (i3 - i4 <= i) {
                    i--;
                    i4++;
                }
                if (i3 - i5 <= i2) {
                    i2--;
                    i5++;
                }
            } else if (i3 > f.b || i3 < 0) {
                arrayList2.add(jzsVar);
            } else {
                arrayList.add(jzsVar);
            }
            i3 = i6;
        }
        if (arrayList.isEmpty() && arrayList2.isEmpty()) {
            ssg.a(3, "OfflineModePlaybackPlugin", "no cached playables, stopping queue", null);
            this.c.a();
            return Unit.a;
        }
        int d = contains ? yhn.d(i, 0, arrayList.size()) : 0;
        int d2 = yhn.d(i2, d, arrayList.size());
        k9q.d.getClass();
        this.a.a(d.a.j(arrayList, dyu.a, arrayList2, d, d2), a3t.a);
        return Unit.a;
    }

    @Override // defpackage.o7q
    public final Object q(y4d y4dVar) {
        this.c.a();
        return Unit.a;
    }

    @Override // defpackage.o7q
    public final Object t(t1q t1qVar) {
        return Unit.a;
    }

    @Override // defpackage.o7q
    public final Object u(u7u u7uVar) {
        this.c.a();
        return Unit.a;
    }
}
