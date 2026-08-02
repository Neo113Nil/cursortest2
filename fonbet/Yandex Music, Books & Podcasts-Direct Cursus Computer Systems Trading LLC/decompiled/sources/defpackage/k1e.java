package defpackage;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.yandex.music.common.media.context.Page;
import ru.yandex.music.common.media.context.h;

/* loaded from: classes3.dex */
public final /* synthetic */ class k1e implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ u1e b;

    public /* synthetic */ k1e(u1e u1eVar, int i) {
        this.a = i;
        this.b = u1eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        u1e u1eVar = this.b;
        switch (i) {
            case 0:
                List list = (List) obj;
                String str = (String) obj2;
                list.getClass();
                str.getClass();
                u1eVar.a.a(list, false, null, str);
                break;
            default:
                String str2 = (String) obj;
                String str3 = (String) obj2;
                str3.getClass();
                if (str2 != null && str2.length() != 0) {
                    tnb b = u1eVar.b.b();
                    wjb wjbVar = wjb.ForYouScreen;
                    cvo cvoVar = b.a;
                    if (b.d) {
                        CopyOnWriteArrayList copyOnWriteArrayList = ssg.a;
                    } else {
                        ssg.a(3, "EvGenScreenReporter", ((Object) hrg.q("Navigated(url=", str2, ")")) + "" + " on ".concat(zwf.J(cvoVar)), null);
                    }
                    nmb a = b.a();
                    if (a != null) {
                        String G = b.b.G();
                        ilb ilbVar = cvoVar.g;
                        glb glbVar = cvoVar.c;
                        String str4 = cvoVar.d.a;
                        wjb wjbVar2 = wjb.Link;
                        qkb qkbVar = qkb.Actions;
                        nmb.y(a, qkbVar, qkbVar, G, wjbVar, ilbVar, glbVar, str4, null, null, wjbVar, wjbVar2, str2, 3968);
                    }
                    x1e x1eVar = u1eVar.a;
                    x1eVar.getClass();
                    new yfx(x1eVar.c, new h(Page.LANDING)).u(str2, str3);
                }
                break;
        }
        return Unit.a;
    }
}
