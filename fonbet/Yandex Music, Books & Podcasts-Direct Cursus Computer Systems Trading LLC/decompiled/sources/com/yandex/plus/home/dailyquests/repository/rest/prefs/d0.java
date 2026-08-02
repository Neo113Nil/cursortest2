package com.yandex.plus.home.dailyquests.repository.rest.prefs;

import android.content.Context;
import android.content.SharedPreferences;
import defpackage.cg6;
import defpackage.jyr;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.wis;
import defpackage.x97;
import defpackage.xq0;
import defpackage.z01;
import defpackage.z7o;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class d0 {
    public final kotlinx.coroutines.a a;
    public final kotlinx.coroutines.a b;
    public final SharedPreferences c;

    public d0(Context context, kotlinx.coroutines.a aVar, kotlinx.coroutines.a aVar2) {
        aVar.getClass();
        aVar2.getClass();
        this.a = aVar;
        this.b = aVar2;
        this.c = context.getSharedPreferences("daily_quests_preferences", 0);
    }

    public static final String a(d0 d0Var, Long l) {
        d0Var.getClass();
        return "quest_" + l;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:20|21))(3:22|23|(1:25))|12|13|(1:15)|16|17))|33|6|7|(0)(0)|12|13|(0)|16|17|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x002e, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        r0 = defpackage.z7o.b;
        r0 = new defpackage.t7o(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005a, code lost:
    
        r8 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x002c, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005c, code lost:
    
        throw r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x002a, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0053, code lost:
    
        r0 = defpackage.z7o.b;
        r0 = new defpackage.t7o(r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Long l, cg6 cg6Var) {
        z zVar;
        int i;
        Throwable a;
        if (cg6Var instanceof z) {
            zVar = (z) cg6Var;
            int i2 = zVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zVar.m = i2 - Integer.MIN_VALUE;
                Object obj = zVar.k;
                nm6 nm6Var = nm6.a;
                i = zVar.m;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    r7o r7oVar = z7o.b;
                    kotlinx.coroutines.a aVar = this.b;
                    a0 a0Var = new a0(this, l, continuation, 0);
                    zVar.j = l;
                    zVar.m = 1;
                    if (x97.V(aVar, a0Var, zVar) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    l = zVar.j;
                    qgg.h0(obj);
                }
                Object obj2 = Unit.a;
                r7o r7oVar2 = z7o.b;
                a = z7o.a(obj2);
                if (a != null) {
                    jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
                    com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.e, com.yandex.plus.core.analytics.logging.b.a, "PreferencesDailyQuestsStorage.clearQuest(userId=" + l + ") error", a);
                }
                return Unit.a;
            }
        }
        zVar = new z(this, cg6Var);
        Object obj3 = zVar.k;
        nm6 nm6Var2 = nm6.a;
        i = zVar.m;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        Object obj22 = Unit.a;
        r7o r7oVar22 = z7o.b;
        a = z7o.a(obj22);
        if (a != null) {
        }
        return Unit.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(1:(3:12|13|(1:18)(2:15|16))(2:19|20))(9:21|22|23|24|25|26|(1:28)|13|(0)(0)))(4:32|33|34|35))(3:50|51|(2:53|30)(1:54))|36|(9:38|(2:40|30)|23|24|25|26|(0)|13|(0)(0))(7:41|24|25|26|(0)|13|(0)(0))))|59|6|7|(0)(0)|36|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f7, code lost:
    
        if (b(r13, r0) == r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0049, code lost:
    
        r13 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0043, code lost:
    
        r13 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0090 A[Catch: all -> 0x0043, CancellationException -> 0x0046, wis -> 0x0049, TryCatch #4 {CancellationException -> 0x0046, blocks: (B:22:0x003e, B:23:0x00aa, B:24:0x00ae, B:34:0x0058, B:36:0x008c, B:38:0x0090, B:51:0x006b), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Long l, cg6 cg6Var) {
        b0 b0Var;
        int i;
        t7o t7oVar;
        Long l2;
        Object obj;
        Throwable a;
        d0 d0Var;
        Object obj2;
        int i2;
        int i3;
        String str;
        y yVar;
        try {
            if (cg6Var instanceof b0) {
                b0Var = (b0) cg6Var;
                int i4 = b0Var.q;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    b0Var.q = i4 - Integer.MIN_VALUE;
                    Object obj3 = b0Var.o;
                    nm6 nm6Var = nm6.a;
                    i = b0Var.q;
                    int i5 = 2;
                    int i6 = 1;
                    Continuation continuation = null;
                    if (i != 0) {
                        qgg.h0(obj3);
                        r7o r7oVar = z7o.b;
                        kotlinx.coroutines.a aVar = this.b;
                        a0 a0Var = new a0(this, l, continuation, i6);
                        b0Var.j = l;
                        b0Var.k = null;
                        b0Var.l = this;
                        b0Var.m = 0;
                        b0Var.n = 0;
                        b0Var.q = 1;
                        Object V = x97.V(aVar, a0Var, b0Var);
                        if (V == nm6Var) {
                            return nm6Var;
                        }
                        d0Var = this;
                        obj2 = V;
                        i2 = 0;
                        i3 = 0;
                    } else if (i == 1) {
                        int i7 = b0Var.n;
                        int i8 = b0Var.m;
                        d0 d0Var2 = b0Var.l;
                        Long l3 = b0Var.j;
                        try {
                            qgg.h0(obj3);
                            i2 = i7;
                            l = l3;
                            d0Var = d0Var2;
                            i3 = i8;
                            obj2 = obj3;
                        } catch (wis e) {
                            e = e;
                            l = l3;
                            r7o r7oVar2 = z7o.b;
                            t7oVar = new t7o(e);
                            l2 = l;
                            obj = t7oVar;
                            a = z7o.a(obj);
                            if (a != null) {
                            }
                            r7o r7oVar3 = z7o.b;
                            if (obj instanceof t7o) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            l = l3;
                            r7o r7oVar4 = z7o.b;
                            t7oVar = new t7o(th);
                            l2 = l;
                            obj = t7oVar;
                            a = z7o.a(obj);
                            if (a != null) {
                            }
                            r7o r7oVar32 = z7o.b;
                            if (obj instanceof t7o) {
                            }
                        }
                    } else {
                        if (i != 2) {
                            if (i != 3) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            obj = b0Var.k;
                            qgg.h0(obj3);
                            r7o r7oVar322 = z7o.b;
                            if (obj instanceof t7o) {
                                return obj;
                            }
                            return null;
                        }
                        l = b0Var.j;
                        qgg.h0(obj3);
                        yVar = (y) obj3;
                        r7o r7oVar5 = z7o.b;
                        y yVar2 = yVar;
                        l2 = l;
                        obj = yVar2;
                        a = z7o.a(obj);
                        if (a != null) {
                            jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
                            com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.e, com.yandex.plus.core.analytics.logging.b.a, "PreferencesDailyQuestsStorage.getQuest(userId=" + l2 + ") error", a);
                            b0Var.j = null;
                            b0Var.k = obj;
                            b0Var.l = null;
                            b0Var.m = 0;
                            b0Var.q = 3;
                        }
                        r7o r7oVar3222 = z7o.b;
                        if (obj instanceof t7o) {
                        }
                    }
                    str = (String) obj2;
                    if (str == null) {
                        kotlinx.coroutines.a aVar2 = d0Var.a;
                        z01 z01Var = new z01(str, continuation, i5);
                        b0Var.j = l;
                        b0Var.k = null;
                        b0Var.l = null;
                        b0Var.m = i3;
                        b0Var.n = i2;
                        b0Var.q = 2;
                        obj3 = x97.V(aVar2, z01Var, b0Var);
                        if (obj3 == nm6Var) {
                            return nm6Var;
                        }
                        yVar = (y) obj3;
                        r7o r7oVar52 = z7o.b;
                        y yVar22 = yVar;
                        l2 = l;
                        obj = yVar22;
                        a = z7o.a(obj);
                        if (a != null) {
                        }
                        r7o r7oVar32222 = z7o.b;
                        if (obj instanceof t7o) {
                        }
                    } else {
                        yVar = null;
                        r7o r7oVar522 = z7o.b;
                        y yVar222 = yVar;
                        l2 = l;
                        obj = yVar222;
                        a = z7o.a(obj);
                        if (a != null) {
                        }
                        r7o r7oVar322222 = z7o.b;
                        if (obj instanceof t7o) {
                        }
                    }
                }
            }
            if (i != 0) {
            }
            str = (String) obj2;
            if (str == null) {
            }
        } catch (CancellationException e2) {
            throw e2;
        }
        b0Var = new b0(this, cg6Var);
        Object obj32 = b0Var.o;
        nm6 nm6Var2 = nm6.a;
        i = b0Var.q;
        int i52 = 2;
        int i62 = 1;
        Continuation continuation2 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Long l, y yVar, cg6 cg6Var) {
        c0 c0Var;
        int i;
        Throwable th;
        wis wisVar;
        t7o t7oVar;
        Object obj;
        Throwable a;
        try {
            if (cg6Var instanceof c0) {
                c0Var = (c0) cg6Var;
                int i2 = c0Var.n;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c0Var.n = i2 - Integer.MIN_VALUE;
                    Object obj2 = c0Var.l;
                    nm6 nm6Var = nm6.a;
                    i = c0Var.n;
                    if (i != 0) {
                        qgg.h0(obj2);
                        try {
                            r7o r7oVar = z7o.b;
                            kotlinx.coroutines.a aVar = this.b;
                            try {
                                com.yandex.plus.experiments.impl.cache.b bVar = new com.yandex.plus.experiments.impl.cache.b(this, l, yVar, null, 2);
                                c0Var.j = l;
                                c0Var.k = yVar;
                                c0Var.n = 1;
                                if (x97.V(aVar, bVar, c0Var) == nm6Var) {
                                    return nm6Var;
                                }
                                l = l;
                                yVar = yVar;
                            } catch (wis e) {
                                wisVar = e;
                                l = l;
                                yVar = yVar;
                                r7o r7oVar2 = z7o.b;
                                t7oVar = new t7o(wisVar);
                                obj = t7oVar;
                                a = z7o.a(obj);
                                if (a != null) {
                                }
                                return Unit.a;
                            } catch (Throwable th2) {
                                th = th2;
                                l = l;
                                yVar = yVar;
                                r7o r7oVar3 = z7o.b;
                                t7oVar = new t7o(th);
                                obj = t7oVar;
                                a = z7o.a(obj);
                                if (a != null) {
                                }
                                return Unit.a;
                            }
                        } catch (wis e2) {
                            e = e2;
                            wisVar = e;
                            r7o r7oVar22 = z7o.b;
                            t7oVar = new t7o(wisVar);
                            obj = t7oVar;
                            a = z7o.a(obj);
                            if (a != null) {
                            }
                            return Unit.a;
                        } catch (Throwable th3) {
                            th = th3;
                            th = th;
                            r7o r7oVar32 = z7o.b;
                            t7oVar = new t7o(th);
                            obj = t7oVar;
                            a = z7o.a(obj);
                            if (a != null) {
                            }
                            return Unit.a;
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        yVar = c0Var.k;
                        l = c0Var.j;
                        try {
                            qgg.h0(obj2);
                        } catch (wis e3) {
                            e = e3;
                            wisVar = e;
                            r7o r7oVar222 = z7o.b;
                            t7oVar = new t7o(wisVar);
                            obj = t7oVar;
                            a = z7o.a(obj);
                            if (a != null) {
                            }
                            return Unit.a;
                        } catch (Throwable th4) {
                            th = th4;
                            th = th;
                            r7o r7oVar322 = z7o.b;
                            t7oVar = new t7o(th);
                            obj = t7oVar;
                            a = z7o.a(obj);
                            if (a != null) {
                            }
                            return Unit.a;
                        }
                    }
                    obj = Unit.a;
                    r7o r7oVar4 = z7o.b;
                    a = z7o.a(obj);
                    if (a != null) {
                        com.yandex.plus.core.analytics.logging.b bVar2 = com.yandex.plus.core.analytics.logging.b.a;
                        String str = "PreferencesDailyQuestsStorage.saveQuest(userId=" + l + ", quest=" + yVar + ") error";
                        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
                        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.e, bVar2, str, a);
                    }
                    return Unit.a;
                }
            }
            if (i != 0) {
            }
            obj = Unit.a;
            r7o r7oVar42 = z7o.b;
            a = z7o.a(obj);
            if (a != null) {
            }
            return Unit.a;
        } catch (CancellationException e4) {
            throw e4;
        }
        c0Var = new c0(this, cg6Var);
        Object obj22 = c0Var.l;
        nm6 nm6Var2 = nm6.a;
        i = c0Var.n;
    }
}
