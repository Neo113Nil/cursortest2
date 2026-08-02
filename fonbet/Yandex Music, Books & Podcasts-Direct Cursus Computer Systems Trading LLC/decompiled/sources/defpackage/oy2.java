package defpackage;

import com.yandex.music.shared.bdui.core.api.data.DivException;
import com.yandex.music.shared.bdui.core.impl.a;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class oy2 {
    public final a a;
    public final mm6 b;
    public final zv8 c;
    public final py2 d;
    public final ConcurrentHashMap e;
    public final ConcurrentHashMap f;
    public final qqi g;

    public oy2(fy2 fy2Var, a aVar, sv8 sv8Var, zv8 zv8Var, py2 py2Var) {
        tf6 e = gld.e(dm6.b);
        this.a = aVar;
        this.b = e;
        this.c = zv8Var;
        this.d = py2Var;
        this.e = new ConcurrentHashMap(5);
        this.f = new ConcurrentHashMap();
        this.g = rqi.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(oy2 oy2Var, String str, cg6 cg6Var) {
        ly2 ly2Var;
        Object obj;
        nm6 nm6Var;
        int i;
        u7e u7eVar;
        xyo xyoVar;
        a aVar = oy2Var.a;
        if (cg6Var instanceof ly2) {
            ly2Var = (ly2) cg6Var;
            int i2 = ly2Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ly2Var.m = i2 - Integer.MIN_VALUE;
                obj = ly2Var.k;
                nm6Var = nm6.a;
                i = ly2Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    str.getClass();
                    try {
                        s7e s7eVar = new s7e();
                        s7eVar.h(null, str);
                        u7eVar = s7eVar.e();
                    } catch (IllegalArgumentException unused) {
                        u7eVar = null;
                    }
                    if (u7eVar != null) {
                        String str2 = u7eVar.i;
                        ly2Var.j = str;
                        ly2Var.m = 1;
                        obj = aVar.b(str2, ly2Var);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                    }
                    ly2Var.j = null;
                    ly2Var.m = 2;
                    obj = aVar.a(str, ly2Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                    return (xyo) obj;
                }
                if (i != 1) {
                    if (i == 2) {
                        qgg.h0(obj);
                        return (xyo) obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = ly2Var.j;
                qgg.h0(obj);
                xyoVar = (xyo) obj;
                if (xyoVar != null) {
                    return xyoVar;
                }
                ly2Var.j = null;
                ly2Var.m = 2;
                obj = aVar.a(str, ly2Var);
                if (obj == nm6Var) {
                }
                return (xyo) obj;
            }
        }
        ly2Var = new ly2(oy2Var, cg6Var);
        obj = ly2Var.k;
        nm6Var = nm6.a;
        i = ly2Var.m;
        if (i != 0) {
        }
        xyoVar = (xyo) obj;
        if (xyoVar != null) {
        }
        ly2Var.j = null;
        ly2Var.m = 2;
        obj = aVar.a(str, ly2Var);
        if (obj == nm6Var) {
        }
        return (xyo) obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(oy2 oy2Var, rv8 rv8Var, String str, cg6 cg6Var) {
        my2 my2Var;
        int i;
        xyo xyoVar;
        py2 py2Var = oy2Var.d;
        if (cg6Var instanceof my2) {
            my2Var = (my2) cg6Var;
            int i2 = my2Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                my2Var.n = i2 - Integer.MIN_VALUE;
                Object obj = my2Var.l;
                nm6 nm6Var = nm6.a;
                i = my2Var.n;
                if (i != 0) {
                    qgg.h0(obj);
                    zv8 zv8Var = oy2Var.c;
                    my2Var.j = rv8Var;
                    my2Var.k = str;
                    my2Var.n = 1;
                    obj = zv8Var.a(str, rv8Var, my2Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = my2Var.k;
                    rv8Var = my2Var.j;
                    qgg.h0(obj);
                }
                xyoVar = (xyo) obj;
                if (!(xyoVar instanceof vyo)) {
                    String str2 = ((vyo) xyoVar).b;
                    ssg.a(6, "BduiDivRepositoryImpl", hrg.r("failed preload data for ", str, ", urls: ", str2), null);
                    String str3 = str2 == null ? "No urls" : str2;
                    py2Var.getClass();
                    cy2 cy2Var = py2Var.a;
                    str.getClass();
                    cy2Var.a("DivRepository.LoadingResourceFailure", uah.g(new Pair("screenIdOrUrl", str), new Pair(Constants.KEY_MESSAGE, str3)));
                    if (str2 == null) {
                        str2 = "No urls";
                    }
                    cy2Var.a("DivResourceLoad.Failure", uah.g(new Pair("screenIdOrUrl", str), new Pair("urls", str2)));
                } else {
                    if (!(xyoVar instanceof wyo)) {
                        b6e.s();
                        return null;
                    }
                    py2Var.getClass();
                    str.getClass();
                    py2Var.a.a("DivRepository.LoadingSuccess", uah.g(new Pair("screenIdOrUrl", str)));
                    oy2Var.e.put(str, rv8Var);
                }
                return Unit.a;
            }
        }
        my2Var = new my2(oy2Var, cg6Var);
        Object obj2 = my2Var.l;
        nm6 nm6Var2 = nm6.a;
        i = my2Var.n;
        if (i != 0) {
        }
        xyoVar = (xyo) obj2;
        if (!(xyoVar instanceof vyo)) {
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
    
        if (r11 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
    
        if (r11.j0(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, long j, cg6 cg6Var) {
        jy2 jy2Var;
        int i;
        if (cg6Var instanceof jy2) {
            jy2Var = (jy2) cg6Var;
            int i2 = jy2Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jy2Var.n = i2 - Integer.MIN_VALUE;
                Object obj = jy2Var.l;
                nm6 nm6Var = nm6.a;
                i = jy2Var.n;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    str.getClass();
                    rar y = x97.y(this.b, null, null, new ov(this, str, continuation, 4), 3);
                    jy2Var.j = str;
                    jy2Var.k = j;
                    jy2Var.n = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        xyo xyoVar = (xyo) obj;
                        if (xyoVar != null) {
                            return xyoVar;
                        }
                        vyo vyoVar = new vyo(null, new DivException("load timer has expired"));
                        ssg.a(5, "BduiDivRepositoryImpl", String.valueOf((Object) null), null);
                        return vyoVar;
                    }
                    j = jy2Var.k;
                    str = jy2Var.j;
                    qgg.h0(obj);
                }
                ky2 ky2Var = new ky2(this, str, continuation, 0);
                jy2Var.j = null;
                jy2Var.k = j;
                jy2Var.n = 2;
                obj = tyf.M(j, ky2Var, jy2Var);
            }
        }
        jy2Var = new jy2(this, cg6Var);
        Object obj2 = jy2Var.l;
        nm6 nm6Var2 = nm6.a;
        i = jy2Var.n;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        ky2 ky2Var2 = new ky2(this, str, continuation2, 0);
        jy2Var.j = null;
        jy2Var.k = j;
        jy2Var.n = 2;
        obj2 = tyf.M(j, ky2Var2, jy2Var);
    }
}
