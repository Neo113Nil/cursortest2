package defpackage;

import android.os.SystemClock;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public final class coj extends jib {
    public final aub b;
    public aoj c;

    public coj(aub aubVar) {
        this.b = aubVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047 A[EDGE_INSN: B:12:0x0047->B:13:0x0047 BREAK  A[LOOP:0: B:2:0x001f->B:16:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[LOOP:0: B:2:0x001f->B:16:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boj u(u7e u7eVar) {
        Object obj;
        boolean z;
        ArrayList arrayList = u7eVar.f;
        String str = (String) CollectionsKt.Q(arrayList);
        String str2 = (String) CollectionsKt.Y(arrayList);
        boj.d.getClass();
        str.getClass();
        str2.getClass();
        Iterator it = boj.f.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            boj bojVar = (boj) obj;
            if (bojVar.b.equals(str)) {
                String str3 = bojVar.c;
                z = true;
                if (str3 != null ? str3.equals(str2) : true) {
                    if (!z) {
                        break;
                    }
                }
            }
            z = false;
            if (!z) {
            }
        }
        return (boj) obj;
    }

    @Override // defpackage.jib
    public final void a(mkn mknVar) {
        String str = mknVar.b.a.i;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        aoj aojVar = this.c;
        if (aojVar instanceof znj) {
            znj znjVar = (znj) aojVar;
            if (!znjVar.a.equals(str)) {
                aojVar = null;
            }
            if (((znj) aojVar) != null) {
                long j = znjVar.d;
                Long valueOf = Long.valueOf(j);
                if (j == Long.MIN_VALUE) {
                    valueOf = null;
                }
                long longValue = valueOf != null ? valueOf.longValue() : 0L;
                long j2 = elapsedRealtime - znjVar.e;
                long j3 = znjVar.f;
                Long valueOf2 = Long.valueOf(j3);
                if (j3 == Long.MIN_VALUE) {
                    valueOf2 = null;
                }
                this.b.invoke(new t9l(elapsedRealtime - znjVar.c, (valueOf2 != null ? valueOf2.longValue() : 0L) + longValue, j2, str, znjVar.b.a));
            }
        } else if (aojVar instanceof ynj) {
            ssg.a(7, "OkHttpAnalyticsEventListener", "Illegal state=" + aojVar + " on callEnd, url=" + str + ", elapse " + elapsedRealtime, null);
        } else if (aojVar != null) {
            b6e.s();
            return;
        }
        this.c = null;
    }

    @Override // defpackage.jib
    public final void b(mkn mknVar, IOException iOException) {
        this.c = null;
    }

    @Override // defpackage.jib
    public final void g(es3 es3Var, okn oknVar) {
        oknVar.getClass();
        u7e u7eVar = es3Var.a().a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        aoj aojVar = this.c;
        if (aojVar instanceof ynj) {
            String str = u7eVar.i;
            ynj ynjVar = (ynj) aojVar;
            String str2 = ynjVar.a;
            if (!str.equals(str2)) {
                u7eVar = null;
            }
            if (u7eVar != null) {
                boj bojVar = ynjVar.b;
                long j = ynjVar.d;
                this.c = new znj(str2, bojVar, j, elapsedRealtime - j, elapsedRealtime, Long.MIN_VALUE);
                return;
            }
            return;
        }
        if (aojVar instanceof znj) {
            znj znjVar = (znj) aojVar;
            if ((u7eVar.i.equals(znjVar.a) ? u7eVar : null) != null) {
                String str3 = u7eVar.i;
                boj bojVar2 = znjVar.b;
                long j2 = znjVar.c;
                this.c = new znj(str3, bojVar2, j2, Long.MIN_VALUE, elapsedRealtime, elapsedRealtime - j2);
                return;
            }
            return;
        }
        if (aojVar != null) {
            b6e.s();
            return;
        }
        boj u = u(u7eVar);
        if (u != null) {
            this.c = new znj(u7eVar.i, u, elapsedRealtime, Long.MIN_VALUE, elapsedRealtime, Long.MIN_VALUE);
        }
    }

    @Override // defpackage.jib
    public final void j(es3 es3Var, String str) {
        u7e u7eVar = es3Var.a().a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.c == null) {
            boj u = u(u7eVar);
            this.c = u != null ? new ynj(u7eVar.i, u, elapsedRealtime, elapsedRealtime) : null;
        }
    }
}
