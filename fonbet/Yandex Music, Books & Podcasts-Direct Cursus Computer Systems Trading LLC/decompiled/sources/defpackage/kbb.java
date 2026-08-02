package defpackage;

import io.appmetrica.analytics.BuildConfig;
import java.io.Serializable;
import kotlin.coroutines.Continuation;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.common.media.context.e;

/* loaded from: classes4.dex */
public final class kbb implements bbb {
    public final e5l a;
    public final oq7 b;
    public final z5l c;
    public final cut d;
    public final ay e;
    public final k21 f;
    public final lum g;

    public kbb(e5l e5lVar, oq7 oq7Var, z5l z5lVar, e eVar, cut cutVar, ay ayVar, k21 k21Var, lum lumVar) {
        this.a = e5lVar;
        this.b = oq7Var;
        this.c = z5lVar;
        this.d = cutVar;
        this.e = ayVar;
        this.f = k21Var;
        this.g = lumVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable a(kbb kbbVar, String str, boolean z, cg6 cg6Var) {
        dbb dbbVar;
        int i;
        rj6 rj6Var;
        if (cg6Var instanceof dbb) {
            dbbVar = (dbb) cg6Var;
            int i2 = dbbVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dbbVar.l = i2 - Integer.MIN_VALUE;
                Object obj = dbbVar.j;
                nm6 nm6Var = nm6.a;
                i = dbbVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    ay ayVar = kbbVar.e;
                    dbbVar.l = 1;
                    obj = ayVar.d(str, z, dbbVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (!(rj6Var instanceof pj6)) {
                    return null;
                }
                if (rj6Var instanceof qj6) {
                    return (oq) ((qj6) rj6Var).a;
                }
                b6e.s();
                return null;
            }
        }
        dbbVar = new dbb(kbbVar, cg6Var);
        Object obj2 = dbbVar.j;
        nm6 nm6Var2 = nm6.a;
        i = dbbVar.l;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (!(rj6Var instanceof pj6)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(kbb kbbVar, String str, cg6 cg6Var) {
        ebb ebbVar;
        int i;
        rj6 rj6Var;
        if (cg6Var instanceof ebb) {
            ebbVar = (ebb) cg6Var;
            int i2 = ebbVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ebbVar.l = i2 - Integer.MIN_VALUE;
                Object obj = ebbVar.j;
                nm6 nm6Var = nm6.a;
                i = ebbVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    k21 k21Var = kbbVar.f;
                    ebbVar.l = 1;
                    obj = k21.b(k21Var, str, false, ebbVar, 30);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (!(rj6Var instanceof pj6)) {
                    return null;
                }
                if (rj6Var instanceof qj6) {
                    return (i21) ((qj6) rj6Var).a;
                }
                b6e.s();
                return null;
            }
        }
        ebbVar = new ebb(kbbVar, cg6Var);
        Object obj2 = ebbVar.j;
        nm6 nm6Var2 = nm6.a;
        i = ebbVar.l;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (!(rj6Var instanceof pj6)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable e(kbb kbbVar, String str, String str2, boolean z, cg6 cg6Var) {
        fbb fbbVar;
        int i;
        rj6 rj6Var;
        if (cg6Var instanceof fbb) {
            fbbVar = (fbb) cg6Var;
            int i2 = fbbVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fbbVar.l = i2 - Integer.MIN_VALUE;
                fbb fbbVar2 = fbbVar;
                Object obj = fbbVar2.j;
                nm6 nm6Var = nm6.a;
                i = fbbVar2.l;
                if (i != 0) {
                    qgg.h0(obj);
                    cut cutVar = kbbVar.d;
                    fbbVar2.l = 1;
                    obj = cut.h(cutVar, str, str2, false, z, fbbVar2, BuildConfig.API_LEVEL);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (!(rj6Var instanceof pj6)) {
                    return null;
                }
                if (rj6Var instanceof qj6) {
                    return (rrl) ((qj6) rj6Var).a;
                }
                b6e.s();
                return null;
            }
        }
        fbbVar = new fbb(kbbVar, cg6Var);
        fbb fbbVar22 = fbbVar;
        Object obj2 = fbbVar22.j;
        nm6 nm6Var2 = nm6.a;
        i = fbbVar22.l;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (!(rj6Var instanceof pj6)) {
        }
    }

    @Override // defpackage.bbb
    public final pjc c(aab aabVar) {
        aabVar.getClass();
        return zsd.b0(new ibb(this.b.a.c, aabVar, 0));
    }

    @Override // defpackage.bbb
    public final qls d(aab aabVar, w5l w5lVar, a6l a6lVar, kxi kxiVar) {
        n7q n7qVar;
        aabVar.getClass();
        PlaybackScope p = this.a.p();
        d6l x = p6g.x((e6l) this.b.a.c.getValue());
        z5l z5lVar = this.c;
        if (x != null && (n7qVar = x.a) != null && sj2.m(n7qVar, aabVar)) {
            return z5lVar.i(false) ? qls.b : qls.c;
        }
        if (aabVar instanceof lt) {
            yk3 e = z5l.e(z5lVar, new jbb(this, (lt) aabVar, p, a6lVar, (Continuation) null, 0));
            final int i = 1;
            e.k(new kd(this) { // from class: cbb
                public final /* synthetic */ kbb b;

                {
                    this.b = this;
                }

                @Override // defpackage.kd
                /* renamed from: b */
                public final void mo33b(Object obj) {
                    Throwable th = (Throwable) obj;
                    switch (i) {
                        case 0:
                            lum lumVar = this.b.g;
                            th.getClass();
                            lumVar.Q(th);
                            break;
                        case 1:
                            lum lumVar2 = this.b.g;
                            th.getClass();
                            lumVar2.Q(th);
                            break;
                        default:
                            lum lumVar3 = this.b.g;
                            th.getClass();
                            lumVar3.Q(th);
                            break;
                    }
                }
            });
        } else if (aabVar instanceof u51) {
            yk3 e2 = z5l.e(z5lVar, new jbb(this, (u51) aabVar, p, a6lVar, (Continuation) null, 1));
            final int i2 = 2;
            e2.k(new kd(this) { // from class: cbb
                public final /* synthetic */ kbb b;

                {
                    this.b = this;
                }

                @Override // defpackage.kd
                /* renamed from: b */
                public final void mo33b(Object obj) {
                    Throwable th = (Throwable) obj;
                    switch (i2) {
                        case 0:
                            lum lumVar = this.b.g;
                            th.getClass();
                            lumVar.Q(th);
                            break;
                        case 1:
                            lum lumVar2 = this.b.g;
                            th.getClass();
                            lumVar2.Q(th);
                            break;
                        default:
                            lum lumVar3 = this.b.g;
                            th.getClass();
                            lumVar3.Q(th);
                            break;
                    }
                }
            });
        } else {
            if (!(aabVar instanceof eul)) {
                b6e.s();
                return null;
            }
            yk3 e3 = z5l.e(z5lVar, new jbb(this, (eul) aabVar, p, a6lVar, (Continuation) null, 2));
            final int i3 = 0;
            e3.k(new kd(this) { // from class: cbb
                public final /* synthetic */ kbb b;

                {
                    this.b = this;
                }

                @Override // defpackage.kd
                /* renamed from: b */
                public final void mo33b(Object obj) {
                    Throwable th = (Throwable) obj;
                    switch (i3) {
                        case 0:
                            lum lumVar = this.b.g;
                            th.getClass();
                            lumVar.Q(th);
                            break;
                        case 1:
                            lum lumVar2 = this.b.g;
                            th.getClass();
                            lumVar2.Q(th);
                            break;
                        default:
                            lum lumVar3 = this.b.g;
                            th.getClass();
                            lumVar3.Q(th);
                            break;
                    }
                }
            });
        }
        return qls.a;
    }
}
