package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import ru.yandex.music.R;
import ru.yandex.music.data.audio.WarningContent;

/* loaded from: classes4.dex */
public final class d20 {
    public final o8q a;

    public d20(c20 c20Var, o8q o8qVar) {
        this.a = o8qVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006d, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r6, kotlin.collections.CollectionsKt.A0(r8)) == false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final f20 a(mqs mqsVar, int i, List list, boolean z) {
        String L;
        mqsVar.getClass();
        list.getClass();
        k10 k10Var = mqsVar.d;
        List list2 = mqsVar.f;
        boolean z2 = k10Var.g;
        String j = mqsVar.j();
        if (!z) {
            if (mqsVar.k()) {
                List list3 = list2;
                ArrayList arrayList = new ArrayList(v75.o(list3, 10));
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    arrayList.add(((zp2) it.next()).a);
                }
                Set A0 = CollectionsKt.A0(arrayList);
                List list4 = list;
                ArrayList arrayList2 = new ArrayList(v75.o(list4, 10));
                Iterator it2 = list4.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((zp2) it2.next()).a);
                }
            }
            L = null;
            return new f20(i, z2, j, L, mqsVar.m == WarningContent.EXPLICIT, mqsVar.i(), mqsVar.o());
        }
        if (!z) {
            List list5 = list2;
            ArrayList arrayList3 = new ArrayList(v75.o(list5, 10));
            Iterator it3 = list5.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((zp2) it3.next()).a);
            }
            List list6 = list;
            ArrayList arrayList4 = new ArrayList(v75.o(list6, 10));
            Iterator it4 = list6.iterator();
            while (it4.hasNext()) {
                arrayList4.add(((zp2) it4.next()).a);
            }
            if (arrayList3.containsAll(arrayList4)) {
                L = this.a.a.d(R.string.artist_ft, Arrays.copyOf(new Object[]{xp3.L(list2, list)}, 1));
                return new f20(i, z2, j, L, mqsVar.m == WarningContent.EXPLICIT, mqsVar.i(), mqsVar.o());
            }
        }
        L = xp3.L(list2, c5b.a);
        return new f20(i, z2, j, L, mqsVar.m == WarningContent.EXPLICIT, mqsVar.i(), mqsVar.o());
    }
}
