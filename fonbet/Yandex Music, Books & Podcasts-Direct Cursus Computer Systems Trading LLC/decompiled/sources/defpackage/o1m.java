package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class o1m implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ int f;

    public /* synthetic */ o1m(int i, long j, String str, String str2, int i2, int i3) {
        this.a = i3;
        this.b = i;
        this.c = j;
        this.d = str;
        this.e = str2;
        this.f = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        cko D0;
        switch (this.a) {
            case 0:
                int i = this.b;
                long j = this.c;
                String str = this.d;
                String str2 = this.e;
                int i2 = this.f;
                xjo xjoVar = (xjo) obj;
                xjoVar.getClass();
                D0 = xjoVar.D0("UPDATE playlist_track SET position = ? WHERE playlist_id=? AND track_id=? AND album_id=? AND position=?");
                try {
                    D0.bindLong(1, i);
                    D0.bindLong(2, j);
                    D0.E(3, str);
                    D0.E(4, str2);
                    D0.bindLong(5, i2);
                    D0.q();
                    D0.close();
                    return Unit.a;
                } finally {
                    D0.close();
                }
            default:
                int i3 = this.b;
                long j2 = this.c;
                String str3 = this.d;
                int i4 = this.f;
                xjo xjoVar2 = (xjo) obj;
                xjoVar2.getClass();
                D0 = xjoVar2.D0("UPDATE playlist_track SET position = ? WHERE playlist_id = ? AND track_id = ? AND album_id = ? AND position = ?");
                try {
                    D0.bindLong(1, i3);
                    D0.bindLong(2, j2);
                    D0.E(3, str3);
                    String str4 = this.e;
                    if (str4 == null) {
                        D0.bindNull(4);
                    } else {
                        D0.E(4, str4);
                    }
                    D0.bindLong(5, i4);
                    D0.q();
                    D0.close();
                    return Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
        }
    }
}
