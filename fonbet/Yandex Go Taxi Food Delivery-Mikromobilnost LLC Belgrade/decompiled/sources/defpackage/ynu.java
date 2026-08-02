package defpackage;

import android.net.Uri;
import androidx.media3.common.StreamKey;
import androidx.media3.common.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public final class ynu extends znu {
    public static final ynu l;
    public final List d;
    public final List e;
    public final List f;
    public final List g;
    public final a h;
    public final List i;
    public final Map j;
    public final List k;

    static {
        List list = Collections.EMPTY_LIST;
        l = new ynu("", list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list);
    }

    public ynu(String str, List list, List list2, List list3, List list4, List list5, List list6, a aVar, List list7, boolean z, Map map, List list8) {
        super(str, list, z);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list2.size(); i++) {
            Uri uri = ((xnu) list2.get(i)).a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        a(arrayList, list3);
        a(arrayList, list4);
        a(arrayList, list5);
        a(arrayList, list6);
        this.d = Collections.unmodifiableList(arrayList);
        this.e = Collections.unmodifiableList(list2);
        Collections.unmodifiableList(list3);
        this.f = Collections.unmodifiableList(list4);
        this.g = Collections.unmodifiableList(list5);
        Collections.unmodifiableList(list6);
        this.h = aVar;
        this.i = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.j = Collections.unmodifiableMap(map);
        this.k = Collections.unmodifiableList(list8);
    }

    public static void a(ArrayList arrayList, List list) {
        for (int i = 0; i < list.size(); i++) {
            Uri uri = ((wnu) list.get(i)).a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
    }

    public static ArrayList b(List list, List list2, int i) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2);
            int i3 = 0;
            while (true) {
                if (i3 < list2.size()) {
                    StreamKey streamKey = (StreamKey) list2.get(i3);
                    if (streamKey.groupIndex == i && streamKey.streamIndex == i2) {
                        arrayList.add(obj);
                        break;
                    }
                    i3++;
                }
            }
        }
        return arrayList;
    }

    @Override // defpackage.o5r
    public final Object copy(List list) {
        ArrayList b = b(this.e, list, 0);
        List list2 = Collections.EMPTY_LIST;
        return new ynu(this.a, this.b, b, list2, b(this.f, list, 1), b(this.g, list, 2), list2, this.h, this.i, this.c, this.j, this.k);
    }
}
