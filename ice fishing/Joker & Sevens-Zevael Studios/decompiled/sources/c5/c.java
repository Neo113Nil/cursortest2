package c5;

import g5.j;
import java.util.Arrays;
import java.util.Set;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: b, reason: collision with root package name */
    public final int f1228b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f1229c;

    /* renamed from: d, reason: collision with root package name */
    public final j f1230d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1231e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1232f;

    /* renamed from: g, reason: collision with root package name */
    public final String f1233g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i10, String[] strArr, j jVar, String str, String str2, oc.c cVar) {
        super(cVar);
        pc.j.e(jVar, "driver");
        this.f1228b = i10;
        this.f1229c = strArr;
        this.f1230d = jVar;
        this.f1231e = "GameDatabase.sq";
        this.f1232f = str;
        this.f1233g = str2;
    }

    @Override // c5.b
    public final f5.d a(oc.c cVar) {
        return this.f1230d.d(Integer.valueOf(this.f1228b), this.f1233g, cVar, 0, null);
    }

    public final void b(e5.a aVar) {
        pc.j.e(aVar, "listener");
        j jVar = this.f1230d;
        String[] strArr = this.f1229c;
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        jVar.getClass();
        pc.j.e(strArr2, "queryKeys");
        pc.j.e(aVar, "listener");
        synchronized (jVar.f2534k) {
            for (String str : strArr2) {
                Set set = (Set) jVar.f2534k.get(str);
                if (set != null) {
                    set.remove(aVar);
                }
            }
        }
    }

    public final String toString() {
        return this.f1231e + ':' + this.f1232f;
    }
}
