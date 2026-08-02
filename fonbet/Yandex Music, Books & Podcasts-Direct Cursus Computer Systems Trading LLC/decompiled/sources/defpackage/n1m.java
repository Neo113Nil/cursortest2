package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class n1m implements Function1 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;

    public /* synthetic */ n1m(int i, long j) {
        this.b = i;
        this.c = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        cko D0;
        switch (this.a) {
            case 0:
                long j = this.c;
                int i = this.b;
                xjo xjoVar = (xjo) obj;
                xjoVar.getClass();
                D0 = xjoVar.D0("UPDATE playlist_track SET position = position - 1 WHERE playlist_id = ? AND position > ?");
                try {
                    D0.bindLong(1, j);
                    D0.bindLong(2, i);
                    D0.q();
                    D0.close();
                    return Unit.a;
                } finally {
                }
            default:
                int i2 = this.b;
                long j2 = this.c;
                xjo xjoVar2 = (xjo) obj;
                xjoVar2.getClass();
                D0 = xjoVar2.D0("UPDATE playlist SET sync=? WHERE _id=?");
                try {
                    D0.bindLong(1, i2);
                    D0.bindLong(2, j2);
                    D0.q();
                    D0.close();
                    return Unit.a;
                } finally {
                }
        }
    }

    public /* synthetic */ n1m(long j, int i) {
        this.c = j;
        this.b = i;
    }
}
