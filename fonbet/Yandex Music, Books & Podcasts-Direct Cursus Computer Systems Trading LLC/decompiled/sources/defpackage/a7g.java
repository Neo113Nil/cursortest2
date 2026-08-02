package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public final class a7g {
    public final t6k a;
    public final t6k b;
    public final ArrayList c;
    public final t6k d;
    public final v6k e;
    public float f;
    public long g;
    public boolean h;
    public float i;
    public boolean j;
    public float k;
    public long l;

    public a7g(float f) {
        t6k t6kVar = new t6k(yhn.c(f, 0.0f, 1.0f));
        this.a = t6kVar;
        this.b = t6kVar;
        this.c = new ArrayList();
        this.d = new t6k(t6kVar.e());
        v6k v6kVar = new v6k(SystemClock.uptimeMillis());
        this.e = v6kVar;
        this.f = t6kVar.e();
        this.g = v6kVar.h();
        this.h = true;
        this.i = 1.0f;
        this.j = true;
        this.k = 1.0f;
        this.l = v6kVar.h();
        a(t6kVar.e());
    }

    public final void a(float f) {
        ArrayList arrayList = this.c;
        arrayList.clear();
        for (int i = 0; i < 15; i++) {
            arrayList.add(Float.valueOf(f));
            if (arrayList.size() > 15) {
                arrayList.remove(0);
            }
            this.a.h(!arrayList.isEmpty() ? (float) CollectionsKt.G(arrayList) : f);
            this.l = SystemClock.uptimeMillis();
        }
    }

    public final float b(float f, long j, long j2, boolean z) {
        t6k t6kVar = this.d;
        if (j2 <= 0 || !z) {
            return t6kVar.e();
        }
        return yhn.c(t6kVar.e() + (((j - this.e.h() >= 0 ? r8 : 0L) * f) / j2), 0.0f, 1.0f);
    }
}
