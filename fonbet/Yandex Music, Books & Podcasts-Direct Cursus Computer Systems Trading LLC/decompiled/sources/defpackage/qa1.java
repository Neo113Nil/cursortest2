package defpackage;

import android.app.Activity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.yandex.music.data.stores.WebPath$Storage;
import ru.yandex.music.gallery.GalleryWidgetActivity;

/* loaded from: classes3.dex */
public final class qa1 implements xzc {
    public final /* synthetic */ ybf a;
    public final /* synthetic */ oa1 b;

    public qa1(ybf ybfVar, oa1 oa1Var) {
        this.a = ybfVar;
        this.b = oa1Var;
    }

    @Override // defpackage.xzc
    public final void a(int i) {
        n01 n01Var;
        Object value = ((nb1) this.a.getValue()).l.getValue();
        qd1 qd1Var = value instanceof qd1 ? (qd1) value : null;
        if (qd1Var == null || (n01Var = (n01) qd1Var.a) == null) {
            return;
        }
        List list = n01Var.f;
        ArrayList arrayList = new ArrayList(v75.o(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(kg5.M((u9b) it.next(), WebPath$Storage.AVATARS_NO_CROP));
        }
        u9b u9bVar = n01Var.a.c;
        g1d g1dVar = new g1d(i, u9bVar != null ? u9bVar.c : null, arrayList, false, true);
        int i2 = GalleryWidgetActivity.y;
        Activity activity = this.b.a;
        activity.startActivity(bow.o(activity, g1dVar));
    }
}
