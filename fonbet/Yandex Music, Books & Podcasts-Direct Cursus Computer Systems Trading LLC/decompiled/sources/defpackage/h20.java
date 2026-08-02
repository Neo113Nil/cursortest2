package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class h20 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Collection c;

    public /* synthetic */ h20(String str, Collection collection, int i) {
        this.a = i;
        this.b = str;
        this.c = collection;
    }

    /* JADX WARN: Finally extract failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        Integer valueOf;
        switch (this.a) {
            case 0:
                Collection collection = this.c;
                xjo xjoVar = (xjo) obj;
                xjoVar.getClass();
                cko D0 = xjoVar.D0(this.b);
                try {
                    Iterator it = collection.iterator();
                    int i = 1;
                    while (it.hasNext()) {
                        D0.E(i, (String) it.next());
                        i++;
                    }
                    int v = s7g.v(D0, "album_id");
                    int v2 = s7g.v(D0, "album_name");
                    int v3 = s7g.v(D0, "track_id");
                    int v4 = s7g.v(D0, "vol");
                    int v5 = s7g.v(D0, "position");
                    ArrayList arrayList = new ArrayList();
                    while (D0.q()) {
                        arrayList.add(new l10(D0.x0(v), (int) D0.getLong(v4), (int) D0.getLong(v5), D0.x0(v2), D0.x0(v3)));
                    }
                    D0.close();
                    return arrayList;
                } catch (Throwable th) {
                    D0.close();
                    throw th;
                }
            default:
                Collection collection2 = this.c;
                xjo xjoVar2 = (xjo) obj;
                xjoVar2.getClass();
                cko D02 = xjoVar2.D0(this.b);
                try {
                    Iterator it2 = collection2.iterator();
                    int i2 = 1;
                    while (it2.hasNext()) {
                        D02.E(i2, (String) it2.next());
                        i2++;
                    }
                    int v6 = s7g.v(D02, "video_clip_id");
                    int v7 = s7g.v(D02, "title");
                    int v8 = s7g.v(D02, "name_surrogate");
                    int v9 = s7g.v(D02, "playerId");
                    int v10 = s7g.v(D02, "thumbnail");
                    int v11 = s7g.v(D02, "previewUrl");
                    int v12 = s7g.v(D02, "duration");
                    int v13 = s7g.v(D02, "disclaimers");
                    int v14 = s7g.v(D02, "like_status");
                    int v15 = s7g.v(D02, "timestamp");
                    ArrayList arrayList2 = new ArrayList();
                    while (D02.q()) {
                        String x0 = D02.x0(v6);
                        String x02 = D02.x0(v7);
                        String x03 = D02.x0(v8);
                        String x04 = D02.x0(v9);
                        String x05 = D02.x0(v10);
                        String x06 = D02.isNull(v11) ? null : D02.x0(v11);
                        long j = D02.getLong(v12);
                        String x07 = D02.x0(v13);
                        if (D02.isNull(v14)) {
                            str = x0;
                            valueOf = null;
                        } else {
                            str = x0;
                            valueOf = Integer.valueOf((int) D02.getLong(v14));
                        }
                        arrayList2.add(new c4u(str, x02, x03, x04, x05, x06, j, x07, valueOf, D02.isNull(v15) ? null : D02.x0(v15)));
                    }
                    D02.close();
                    return arrayList2;
                } catch (Throwable th2) {
                    D02.close();
                    throw th2;
                }
        }
    }
}
