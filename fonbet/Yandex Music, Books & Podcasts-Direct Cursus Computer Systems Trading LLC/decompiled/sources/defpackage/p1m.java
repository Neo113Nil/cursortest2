package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class p1m implements Function1 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ p1m(int i, String str, String str2, long j) {
        this.d = j;
        this.b = str;
        this.e = str2;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        cko D0;
        switch (this.a) {
            case 0:
                long j = this.d;
                String str = this.b;
                String str2 = (String) this.e;
                int i = this.c;
                xjo xjoVar = (xjo) obj;
                xjoVar.getClass();
                D0 = xjoVar.D0("DELETE FROM playlist_track WHERE playlist_id=? AND track_id=? AND album_id=? AND position=?");
                try {
                    D0.bindLong(1, j);
                    D0.E(2, str);
                    D0.E(3, str2);
                    D0.bindLong(4, i);
                    D0.q();
                    D0.close();
                    return Unit.a;
                } finally {
                    D0.close();
                }
            default:
                List list = (List) this.e;
                int i2 = this.c;
                long j2 = this.d;
                xjo xjoVar2 = (xjo) obj;
                xjoVar2.getClass();
                D0 = xjoVar2.D0(this.b);
                try {
                    Iterator it = list.iterator();
                    int i3 = 1;
                    while (it.hasNext()) {
                        D0.E(i3, (String) it.next());
                        i3++;
                    }
                    D0.bindLong(i2 + 1, j2);
                    D0.q();
                    int L = gut.L(xjoVar2);
                    D0.close();
                    return Integer.valueOf(L);
                } catch (Throwable th) {
                    throw th;
                }
        }
    }

    public /* synthetic */ p1m(String str, List list, int i, long j) {
        this.b = str;
        this.e = list;
        this.c = i;
        this.d = j;
    }
}
