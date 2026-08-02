package defpackage;

import android.app.Activity;
import android.os.Parcelable;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class h7h {
    public final jyr a;
    public final jyr b;
    public final jyr c;

    public h7h(jyr jyrVar, jyr jyrVar2, jyr jyrVar3) {
        this.a = jyrVar3;
        this.b = jyrVar;
        this.c = jyrVar2;
    }

    public static zh5 b(rf3 rf3Var) {
        int ordinal = rf3Var.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal == 2) {
                Parcelable.Creator<zh5> creator = zh5.CREATOR;
                return (zh5) zh5.d.get("music-concert-tab");
            }
            if (ordinal == 3) {
                Parcelable.Creator<zh5> creator2 = zh5.CREATOR;
                return (zh5) zh5.d.get("music-kids-tab");
            }
            if (ordinal == 4) {
                Parcelable.Creator<zh5> creator3 = zh5.CREATOR;
                return (zh5) zh5.d.get("music-collection-tab");
            }
            if (ordinal != 5) {
                b6e.s();
                return null;
            }
        }
        return null;
    }

    public final xj5 a() {
        return (xj5) this.b.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Activity activity, cg6 cg6Var) {
        f7h f7hVar;
        int i;
        try {
            if (cg6Var instanceof f7h) {
                f7hVar = (f7h) cg6Var;
                int i2 = f7hVar.l;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    f7hVar.l = i2 - Integer.MIN_VALUE;
                    Object obj = f7hVar.j;
                    nm6 nm6Var = nm6.a;
                    i = f7hVar.l;
                    if (i != 0) {
                        qgg.h0(obj);
                        Parcelable.Creator<zh5> creator = zh5.CREATOR;
                        zh5 zh5Var = (zh5) zh5.d.get("music-launch");
                        if (zh5Var == null) {
                            e();
                            return Unit.a;
                        }
                        ssg.a(3, "MainScreenCommunicationTriggerProcessor", "try to open trigger on launch", null);
                        xj5 a = a();
                        f7hVar.l = 1;
                        if (xv7.D(a, zh5Var, activity, null, f7hVar) == nm6Var) {
                            return nm6Var;
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                    }
                    e();
                    return Unit.a;
                }
            }
            if (i != 0) {
            }
            e();
            return Unit.a;
        } catch (Throwable th) {
            e();
            throw th;
        }
        f7hVar = new f7h(this, cg6Var);
        Object obj2 = f7hVar.j;
        nm6 nm6Var2 = nm6.a;
        i = f7hVar.l;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c0, code lost:
    
        if (defpackage.xv7.D(r1, r11, r10, null, r6) == r0) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Activity activity, cg6 cg6Var) {
        g7h g7hVar;
        Object obj;
        int i;
        Activity activity2;
        if (cg6Var instanceof g7h) {
            g7hVar = (g7h) cg6Var;
            int i2 = g7hVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g7hVar.m = i2 - Integer.MIN_VALUE;
                g7h g7hVar2 = g7hVar;
                obj = g7hVar2.k;
                nm6 nm6Var = nm6.a;
                i = g7hVar2.m;
                if (i != 0) {
                    qgg.h0(obj);
                    Parcelable.Creator<zh5> creator = zh5.CREATOR;
                    zh5 zh5Var = (zh5) zh5.d.get("music-book-tab");
                    if (zh5Var == null) {
                        return Unit.a;
                    }
                    xj5 a = a();
                    l18 l18Var = l18.b;
                    bdt I = hag.I(byb.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    boolean h = ((yg5) ((byb) qdcVar.C(I)).c(ern.a(yg5.class))).h();
                    g7hVar2.j = activity;
                    g7hVar2.m = 1;
                    obj = a.e(zh5Var, activity, h, null, g7hVar2);
                    if (obj != nm6Var) {
                        activity2 = activity;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i == 2) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                activity2 = g7hVar2.j;
                qgg.h0(obj);
                if (!((Boolean) obj).booleanValue()) {
                    return Unit.a;
                }
                Parcelable.Creator<zh5> creator2 = zh5.CREATOR;
                zh5 zh5Var2 = (zh5) zh5.d.get("music-podcast-tab");
                if (zh5Var2 == null) {
                    return Unit.a;
                }
                ssg.a(3, "MainScreenCommunicationTriggerProcessor", "try to open trigger on tab " + zh5Var2, null);
                xj5 a2 = a();
                g7hVar2.j = null;
                g7hVar2.m = 2;
            }
        }
        g7hVar = new g7h(this, cg6Var);
        g7h g7hVar22 = g7hVar;
        obj = g7hVar22.k;
        nm6 nm6Var2 = nm6.a;
        i = g7hVar22.m;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    public final void e() {
        xdr xdrVar = ((ze2) ((we2) this.a.getValue())).a;
        Boolean bool = Boolean.FALSE;
        xdrVar.getClass();
        xdrVar.m(null, bool);
    }
}
