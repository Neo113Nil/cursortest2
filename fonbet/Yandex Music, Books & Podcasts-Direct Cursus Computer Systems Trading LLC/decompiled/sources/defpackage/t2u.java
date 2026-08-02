package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class t2u implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ ArrayList d;

    public /* synthetic */ t2u(int i, String str, String str2, ArrayList arrayList) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = arrayList;
    }

    /* JADX WARN: Finally extract failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        Integer valueOf;
        switch (this.a) {
            case 0:
                String str2 = this.c;
                ArrayList arrayList = this.d;
                xjo xjoVar = (xjo) obj;
                xjoVar.getClass();
                cko D0 = xjoVar.D0(this.b);
                try {
                    D0.E(1, str2);
                    Iterator it = arrayList.iterator();
                    int i = 2;
                    while (it.hasNext()) {
                        D0.E(i, (String) it.next());
                        i++;
                    }
                    D0.q();
                    D0.close();
                    return Unit.a;
                } catch (Throwable th) {
                    D0.close();
                    throw th;
                }
            default:
                String str3 = this.c;
                ArrayList arrayList2 = this.d;
                xjo xjoVar2 = (xjo) obj;
                xjoVar2.getClass();
                cko D02 = xjoVar2.D0(this.b);
                try {
                    D02.E(1, str3);
                    Iterator it2 = arrayList2.iterator();
                    int i2 = 2;
                    while (it2.hasNext()) {
                        D02.bindLong(i2, ((Number) it2.next()).intValue());
                        i2++;
                    }
                    int v = s7g.v(D02, "video_clip_id");
                    int v2 = s7g.v(D02, "title");
                    int v3 = s7g.v(D02, "name_surrogate");
                    int v4 = s7g.v(D02, "playerId");
                    int v5 = s7g.v(D02, "thumbnail");
                    int v6 = s7g.v(D02, "previewUrl");
                    int v7 = s7g.v(D02, "duration");
                    int v8 = s7g.v(D02, "disclaimers");
                    int v9 = s7g.v(D02, "like_status");
                    int v10 = s7g.v(D02, "timestamp");
                    ArrayList arrayList3 = new ArrayList();
                    while (D02.q()) {
                        String x0 = D02.x0(v);
                        String x02 = D02.x0(v2);
                        String x03 = D02.x0(v3);
                        String x04 = D02.x0(v4);
                        String x05 = D02.x0(v5);
                        String x06 = D02.isNull(v6) ? null : D02.x0(v6);
                        long j = D02.getLong(v7);
                        String x07 = D02.x0(v8);
                        if (D02.isNull(v9)) {
                            str = x0;
                            valueOf = null;
                        } else {
                            str = x0;
                            valueOf = Integer.valueOf((int) D02.getLong(v9));
                        }
                        arrayList3.add(new c4u(str, x02, x03, x04, x05, x06, j, x07, valueOf, D02.isNull(v10) ? null : D02.x0(v10)));
                    }
                    D02.close();
                    return arrayList3;
                } catch (Throwable th2) {
                    D02.close();
                    throw th2;
                }
        }
    }
}
