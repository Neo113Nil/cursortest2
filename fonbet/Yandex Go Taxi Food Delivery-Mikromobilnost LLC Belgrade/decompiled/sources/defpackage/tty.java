package defpackage;

import com.yandex.go.feed_video.actions.ListVideoPlayerChangeVisibilityAction;
import com.yandex.go.feed_video.actions.ListVideoPlayerUpdateItemsAction;
import com.yandex.go.feed_video.actions.models.MediaItemDto;
import com.yandex.go.feed_video.domain.manager.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.b;
import ru.yandex.video.m3.list_player_manager.model.MediaData;

/* loaded from: classes.dex */
public final class tty implements dw {
    public final /* synthetic */ int a;
    public final a b;

    public /* synthetic */ tty(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // defpackage.dw
    public final void handle(kr krVar, n6u n6uVar) {
        List list;
        int i = this.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                List list2 = ((ListVideoPlayerUpdateItemsAction) krVar).a;
                ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(nkb1.c((MediaItemDto) it.next()));
                }
                id10 id10Var = aVar.c;
                ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(aw00.a((ee10) it2.next()));
                }
                id10Var.getClass();
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    MediaData mediaData = (MediaData) it3.next();
                    ArrayList arrayList3 = id10Var.a;
                    if (!arrayList3.contains(mediaData)) {
                        arrayList3.add(mediaData);
                        HashMap hashMap = id10Var.b;
                        hashMap.put(mediaData, Integer.valueOf(hashMap.size()));
                    }
                }
                aVar.a(id10Var);
                break;
            default:
                ListVideoPlayerChangeVisibilityAction listVideoPlayerChangeVisibilityAction = (ListVideoPlayerChangeVisibilityAction) krVar;
                ee10 c = nkb1.c(listVideoPlayerChangeVisibilityAction.a);
                String str = listVideoPlayerChangeVisibilityAction.b;
                boolean z = listVideoPlayerChangeVisibilityAction.c;
                if (!aVar.e) {
                    aVar.d = str;
                    aVar.e = true;
                }
                if (str == null || evu0.J(str) || !str.equals(aVar.d)) {
                    aVar.d = str;
                    EmptyList emptyList = EmptyList.a;
                    aVar.f = emptyList;
                    aVar.g = emptyList;
                    aVar.c = new id10();
                }
                id10 id10Var2 = aVar.c;
                MediaData a = aw00.a(c);
                int i2 = id10Var2.d;
                HashMap hashMap2 = id10Var2.b;
                ArrayList arrayList4 = id10Var2.a;
                if (!arrayList4.contains(a)) {
                    arrayList4.add(a);
                    hashMap2.put(a, Integer.valueOf(hashMap2.size()));
                }
                int intValue = ((Number) b.g(a, hashMap2)).intValue();
                List list3 = id10Var2.c;
                if (!z) {
                    ArrayList arrayList5 = new ArrayList(list3);
                    arrayList5.remove(Integer.valueOf(intValue));
                    list = arrayList5;
                } else if (!list3.isEmpty()) {
                    if (!id10Var2.c.contains(Integer.valueOf(intValue))) {
                        int intValue2 = ((Number) kotlin.collections.a.P(id10Var2.c)).intValue();
                        List list4 = id10Var2.c;
                        list = intValue > intValue2 ? kotlin.collections.a.J0(new d6w(Math.max(((Number) kotlin.collections.a.P(list4)).intValue(), (intValue - i2) + 1), intValue, 1)) : kotlin.collections.a.J0(new d6w(intValue, Math.min(((Number) kotlin.collections.a.Z(list4)).intValue(), (i2 + intValue) - 1), 1));
                    }
                    aVar.a(id10Var2);
                    break;
                } else {
                    list = Collections.singletonList(Integer.valueOf(intValue));
                }
                id10Var2.c = list;
                aVar.a(id10Var2);
                break;
        }
    }
}
