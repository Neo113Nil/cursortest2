package defpackage;

import android.content.SharedPreferences;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z1h {
    public final n3h a;
    public final zzp b;
    public final jyr d;
    public final xdr f;
    public final xdr g;
    public final jyr c = btf.b(new w8a("lyrics_storage", 2));
    public volatile boolean e = true;

    public z1h(n3h n3hVar, zzp zzpVar, jyr jyrVar) {
        this.a = n3hVar;
        this.b = zzpVar;
        this.d = jyrVar;
        xdr a = ydr.a(Boolean.valueOf(b() != p2h.b));
        this.f = a;
        this.g = a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(boolean z) {
        nsa nsaVar;
        Long e;
        long j;
        l18 l18Var = l18.b;
        bdt I = hag.I(byb.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        if (Intrinsics.d(((o2h) ((byb) qdcVar.C(I)).c(ern.a(o2h.class))).b(), "on")) {
            ssg.a(3, "LyricsCenter", "check it need to disable lyrics", null);
            if (this.e) {
                ssg.a(3, "LyricsCenter", "try this session = true", null);
                if (!z) {
                    this.e = false;
                    ssg.a(3, "LyricsCenter", "do not disable - currently disabled", null);
                    ssg.a(3, "LyricsCenter", "do not try to disable this session anymore", null);
                    return false;
                }
                ssg.a(3, "LyricsCenter", "currently enabled", null);
                bdt I2 = hag.I(byb.class);
                qdc qdcVar2 = l18Var.a;
                qdcVar2.getClass();
                if (Intrinsics.d(((o2h) ((byb) qdcVar2.C(I2)).c(ern.a(o2h.class))).b(), "on")) {
                    long j2 = ((SharedPreferences) this.c.getValue()).getLong("EXPLICIT_LYRICS_ENABLE_TIME_MS", -1L);
                    Long valueOf = Long.valueOf(j2);
                    if (j2 == -1) {
                        valueOf = null;
                    }
                    if (valueOf != null) {
                        long longValue = valueOf.longValue();
                        msa msaVar = nsa.b;
                        nsaVar = new nsa(yd5.N(this.b.b() - longValue, ssa.MILLISECONDS));
                        bdt I3 = hag.I(byb.class);
                        qdc qdcVar3 = l18Var.a;
                        qdcVar3.getClass();
                        e = ((o2h) ((byb) qdcVar3.C(I3)).c(ern.a(o2h.class))).a().e("timeout");
                        if (e == null) {
                            msa msaVar2 = nsa.b;
                            j = yd5.N(e.longValue(), ssa.MINUTES);
                        } else {
                            nsa.b.getClass();
                            j = nsa.c;
                        }
                        ssg.a(3, "LyricsCenter", "since last explicit enable - " + nsaVar, null);
                        ssg.a(3, "LyricsCenter", "timeout - ".concat(nsa.t(j)), null);
                        if (nsaVar != null || nsa.c(nsaVar.a, j) >= 0) {
                            ssg.a(3, "LyricsCenter", "disable lyrics", null);
                            return true;
                        }
                        ssg.a(3, "LyricsCenter", "lyrics were enabled less than timeout ago, do not try to disable this session anymore", null);
                        this.e = false;
                        return false;
                    }
                }
                nsaVar = null;
                bdt I32 = hag.I(byb.class);
                qdc qdcVar32 = l18Var.a;
                qdcVar32.getClass();
                e = ((o2h) ((byb) qdcVar32.C(I32)).c(ern.a(o2h.class))).a().e("timeout");
                if (e == null) {
                }
                ssg.a(3, "LyricsCenter", "since last explicit enable - " + nsaVar, null);
                ssg.a(3, "LyricsCenter", "timeout - ".concat(nsa.t(j)), null);
                if (nsaVar != null) {
                }
                ssg.a(3, "LyricsCenter", "disable lyrics", null);
                return true;
            }
            ssg.a(3, "LyricsCenter", "do not disable - try this session = false", null);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        if (r0.equals("WITH_CONTROLS") != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
    
        return defpackage.p2h.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0052, code lost:
    
        if (r0.equals("FULL_SCREEN") == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final p2h b() {
        if (((lwc) this.d.getValue()).a()) {
            return p2h.b;
        }
        String string = ((SharedPreferences) this.c.getValue()).getString("lyrics_mode", "");
        if (string != null) {
            int hashCode = string.hashCode();
            if (hashCode != -520198116) {
                if (hashCode != -501072369) {
                    if (hashCode == 2130809258 && string.equals("HIDDEN")) {
                        return p2h.b;
                    }
                }
            }
        }
        return p2h.b;
    }

    public final void c(p2h p2hVar) {
        SharedPreferences.Editor edit = ((SharedPreferences) this.c.getValue()).edit();
        edit.putString("lyrics_mode", p2hVar.name());
        edit.apply();
        v3w.n(b() != p2h.b, this.f, null);
    }

    public final void d() {
        l18 l18Var = l18.b;
        bdt I = hag.I(byb.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        if (Intrinsics.d(((o2h) ((byb) qdcVar.C(I)).c(ern.a(o2h.class))).b(), "on")) {
            this.e = false;
            long b = this.b.b();
            SharedPreferences.Editor edit = ((SharedPreferences) this.c.getValue()).edit();
            edit.putLong("EXPLICIT_LYRICS_ENABLE_TIME_MS", b);
            edit.apply();
            ssg.a(3, "LyricsCenter", "saving explicit lyrics enable time - " + new Date(b), null);
            ssg.a(3, "LyricsCenter", "do not try to disable this session anymore", null);
        }
    }
}
