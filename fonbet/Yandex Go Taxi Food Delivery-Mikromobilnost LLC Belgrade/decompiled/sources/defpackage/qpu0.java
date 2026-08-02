package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.communications.api.dto.Story;
import ru.yandex.taxi.stories.domain.a;
import ru.yandex.taxi.stories.presentation.story.g;

/* loaded from: classes6.dex */
public final class qpu0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ g b;

    public /* synthetic */ qpu0(g gVar, int i) {
        this.a = i;
        this.b = gVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        g gVar = this.b;
        switch (i) {
            case 0:
                a aVar = gVar.h;
                Story d = aVar.d();
                if (d != null) {
                    klf0 klf0Var = aVar.c;
                    String str = aVar.f.a;
                    int i2 = aVar.i;
                    int size = d.i.d.size();
                    int i3 = aVar.j;
                    long j = aVar.n;
                    i a = ((n9y0) klf0Var).a("Promotion.Widgets.TookScreenshot", d, i3, Long.valueOf(j), aVar.c(), false);
                    LinkedHashMap linkedHashMap = a.a;
                    linkedHashMap.put("open_reason", str);
                    a.b(size, "page_number_total_count");
                    linkedHashMap.put("story_position", String.valueOf(i2 + 1));
                    a.i();
                    a.m();
                    break;
                }
                break;
            default:
                gVar.t(gVar.f.e, (List) obj);
                break;
        }
        return zy11Var;
    }
}
