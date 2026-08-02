package defpackage;

import com.yandex.music.shared.playback.api.commands.PlayCommand;
import com.yandex.music.shared.playback.api.commands.VolumeMuteCommand;
import com.yandex.music.shared.playback.api.commands.VolumeUnmuteCommand;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import ru.yandex.music.common.media.context.c;

/* loaded from: classes4.dex */
public final class lvq implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ nvq b;

    public /* synthetic */ lvq(nvq nvqVar, int i) {
        this.a = i;
        this.b = nvqVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                m3r m3rVar = (m3r) obj;
                boolean z = m3rVar.a;
                zsq zsqVar = m3rVar.b;
                nvq nvqVar = this.b;
                nvqVar.C(zsqVar, new ivq(nvqVar, zsqVar, !z));
                jyr jyrVar = (jyr) nvqVar.f.c;
                a3t a3tVar = a3t.a;
                if (z) {
                    ((k1l) ((e3q) ((vyk) jyrVar.getValue())).i.getValue()).a(VolumeUnmuteCommand.INSTANCE, a3tVar);
                } else {
                    ((k1l) ((e3q) ((vyk) jyrVar.getValue())).i.getValue()).a(VolumeMuteCommand.INSTANCE, a3tVar);
                }
                return Unit.a;
            default:
                o5t o5tVar = (o5t) obj;
                nvq nvqVar2 = this.b;
                tao taoVar = nvqVar2.f;
                if (o5tVar instanceof m5t) {
                    m5t m5tVar = (m5t) o5tVar;
                    List list = m5tVar.c;
                    boolean z2 = m5tVar.d;
                    zsq zsqVar2 = m5tVar.b;
                    List list2 = list;
                    if (list2 != null && !list2.isEmpty()) {
                        jyr jyrVar2 = (jyr) taoVar.e;
                        jyr jyrVar3 = (jyr) taoVar.d;
                        list.getClass();
                        d6l x = p6g.x((e6l) ((oq7) jyrVar3.getValue()).a.d.getValue());
                        n7q n7qVar = x != null ? x.a : null;
                        if (n7qVar == null || !((Boolean) wdg.A(n7qVar, new ift(new zga(list, 6)))).booleanValue()) {
                            String t = weo.t();
                            z5l z5lVar = (z5l) jyrVar2.getValue();
                            c cVar = c.d;
                            cVar.getClass();
                            List list3 = list;
                            ArrayList arrayList = new ArrayList(v75.o(list3, 10));
                            Iterator it = list3.iterator();
                            while (it.hasNext()) {
                                arrayList.add((mqs) ((h0r) it.next()).d.getValue());
                            }
                            qe5 h = l3l.h(cVar, arrayList, ((kxi) taoVar.b).a(t));
                            h.d(2);
                            h.i = hyn.e;
                            h.k = true;
                            z5lVar.f(h.b(), z2 ? uyk.b : uyk.a);
                            nvqVar2.C(zsqVar2, new jvq(nvqVar2, zsqVar2, t, 0));
                        } else {
                            e6l e6lVar = (e6l) ((oq7) jyrVar3.getValue()).a.d.getValue();
                            boolean A = p6g.A(e6lVar);
                            a3t a3tVar2 = a3t.a;
                            if (z2 != A) {
                                jyr jyrVar4 = (jyr) taoVar.c;
                                if (z2) {
                                    ((k1l) ((e3q) ((vyk) jyrVar4.getValue())).i.getValue()).a(VolumeMuteCommand.INSTANCE, a3tVar2);
                                } else {
                                    ((k1l) ((e3q) ((vyk) jyrVar4.getValue())).i.getValue()).a(VolumeUnmuteCommand.INSTANCE, a3tVar2);
                                }
                            }
                            if (!p6g.C(e6lVar)) {
                                ((k1l) ((e3q) ((z5l) jyrVar2.getValue()).a()).i.getValue()).a(new PlayCommand(true), a3tVar2);
                            }
                        }
                    }
                } else {
                    if (!(o5tVar instanceof n5t)) {
                        b6e.s();
                        return null;
                    }
                    ((q7l) ((z5l) ((jyr) taoVar.e).getValue()).f.getValue()).b();
                }
                return Unit.a;
        }
    }
}
