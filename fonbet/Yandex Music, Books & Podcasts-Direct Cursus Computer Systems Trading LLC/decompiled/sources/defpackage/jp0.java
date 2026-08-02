package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.media3.exoplayer.dash.DashMediaSource$Factory;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory;
import androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class jp0 implements xjn {
    public boolean a;
    public final Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    public jp0(Context context, mm6 mm6Var, w4i w4iVar) {
        context.getClass();
        mm6Var.getClass();
        this.b = mm6Var;
        this.c = w4iVar;
        this.d = new LinkedList();
        this.e = rqi.a();
        Object systemService = context.getSystemService("connectivity");
        systemService.getClass();
        this.f = (ConnectivityManager) systemService;
        this.g = new xd0(7, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006d, code lost:
    
        if (defpackage.zsd.h0(r7, r8, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
    
        if (defpackage.zsd.h0(r8, r2, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(jp0 jp0Var, cg6 cg6Var) {
        hiq hiqVar;
        int i;
        jp0Var.getClass();
        if (cg6Var instanceof hiq) {
            hiqVar = (hiq) cg6Var;
            int i2 = hiqVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hiqVar.l = i2 - Integer.MIN_VALUE;
                Object obj = hiqVar.j;
                nm6 nm6Var = nm6.a;
                i = hiqVar.l;
                Continuation continuation = null;
                int i3 = 2;
                if (i != 0) {
                    qgg.h0(obj);
                    eno s0 = szf.s0(new eiq(jp0Var, 1));
                    lf2 lf2Var = new lf2(i3, 12, continuation);
                    hiqVar.l = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                eno s02 = szf.s0(new eiq(jp0Var, 2));
                lf2 lf2Var2 = new lf2(i3, 13, continuation);
                hiqVar.l = 2;
            }
        }
        hiqVar = new hiq(jp0Var, cg6Var);
        Object obj2 = hiqVar.j;
        nm6 nm6Var2 = nm6.a;
        i = hiqVar.l;
        Continuation continuation2 = null;
        int i32 = 2;
        if (i != 0) {
        }
        eno s022 = szf.s0(new eiq(jp0Var, 2));
        lf2 lf2Var22 = new lf2(i32, 13, continuation2);
        hiqVar.l = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0056, code lost:
    
        if (r8.a(r0) == r1) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063 A[Catch: all -> 0x0069, TRY_LEAVE, TryCatch #1 {all -> 0x0069, blocks: (B:25:0x0059, B:27:0x0063, B:30:0x006e), top: B:24:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006e A[Catch: all -> 0x0069, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0069, blocks: (B:25:0x0059, B:27:0x0063, B:30:0x006e), top: B:24:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r7v10, types: [oqi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(jp0 jp0Var, cg6 cg6Var) {
        hmt hmtVar;
        int i;
        qqi qqiVar;
        Throwable th;
        oqi oqiVar;
        jp0 jp0Var2;
        jp0Var.getClass();
        try {
            if (cg6Var instanceof hmt) {
                hmtVar = (hmt) cg6Var;
                int i2 = hmtVar.n;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    hmtVar.n = i2 - Integer.MIN_VALUE;
                    Object obj = hmtVar.l;
                    nm6 nm6Var = nm6.a;
                    i = hmtVar.n;
                    if (i != 0) {
                        qgg.h0(obj);
                        qqiVar = (qqi) jp0Var.e;
                        hmtVar.j = jp0Var;
                        hmtVar.k = qqiVar;
                        hmtVar.n = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            oqiVar = hmtVar.k;
                            jp0Var2 = hmtVar.j;
                            try {
                                qgg.h0(obj);
                                ((LinkedList) jp0Var2.d).clear();
                                oqiVar.b(null);
                                return Unit.a;
                            } catch (Throwable th2) {
                                th = th2;
                                oqiVar.b(null);
                                throw th;
                            }
                        }
                        ?? r7 = hmtVar.k;
                        jp0 jp0Var3 = hmtVar.j;
                        qgg.h0(obj);
                        qqiVar = r7;
                        jp0Var = jp0Var3;
                    }
                    if (!((LinkedList) jp0Var.d).isEmpty()) {
                        Unit unit = Unit.a;
                        qqiVar.b(null);
                        return unit;
                    }
                    w4i w4iVar = (w4i) jp0Var.c;
                    List w0 = CollectionsKt.w0((LinkedList) jp0Var.d);
                    hmtVar.j = jp0Var;
                    hmtVar.k = qqiVar;
                    hmtVar.n = 2;
                    if (w4iVar.invoke(w0, hmtVar) != nm6Var) {
                        jp0Var2 = jp0Var;
                        oqiVar = qqiVar;
                        ((LinkedList) jp0Var2.d).clear();
                        oqiVar.b(null);
                        return Unit.a;
                    }
                    return nm6Var;
                }
            }
            if (!((LinkedList) jp0Var.d).isEmpty()) {
            }
        } catch (Throwable th3) {
            qqi qqiVar2 = qqiVar;
            th = th3;
            oqiVar = qqiVar2;
            oqiVar.b(null);
            throw th;
        }
        hmtVar = new hmt(jp0Var, cg6Var);
        Object obj2 = hmtVar.l;
        nm6 nm6Var2 = nm6.a;
        i = hmtVar.n;
        if (i != 0) {
        }
    }

    public kp0 c() {
        nuj nujVar = (nuj) this.b;
        UUID uuid = (UUID) this.c;
        jtj jtjVar = (jtj) this.d;
        pob pobVar = (pob) this.e;
        Map map = (Map) this.g;
        if (map == null) {
            map = e5b.a;
            map.getClass();
        }
        return new kp0(uuid, nujVar, jtjVar, (List) this.f, map, pobVar, this.a);
    }

    public gk7 d() {
        vq1.A(!this.a);
        this.a = true;
        if (((es6) this.d) == null) {
            this.d = new es6(new vx1[0]);
        }
        if (((qne) this.g) == null) {
            this.g = new qne((Context) this.b);
        }
        return new gk7(this);
    }

    public void e() {
        if (this.a) {
            return;
        }
        this.a = true;
        mm6 mm6Var = (mm6) this.d;
        osh oshVar = (osh) this.g;
        if (oshVar != null) {
            oshVar.Z();
        }
        if (mm6Var != null) {
            x97.y(mm6Var, null, null, new iiq(this, null, 0), 3);
            return;
        }
        h();
        Function0 function0 = (Function0) this.b;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public tvh f(int i) {
        yqr yqrVar;
        yqr qo7Var;
        HashMap hashMap = (HashMap) this.d;
        tvh tvhVar = (tvh) hashMap.get(Integer.valueOf(i));
        if (tvhVar != null) {
            return tvhVar;
        }
        HashMap hashMap2 = (HashMap) this.c;
        yqr yqrVar2 = (yqr) hashMap2.get(Integer.valueOf(i));
        if (yqrVar2 == null) {
            final va7 va7Var = (va7) this.e;
            va7Var.getClass();
            if (i == 0) {
                final Class asSubclass = DashMediaSource$Factory.class.asSubclass(tvh.class);
                final int i2 = 0;
                yqrVar = new yqr() { // from class: po7
                    @Override // defpackage.yqr
                    public final Object get() {
                        switch (i2) {
                            case 0:
                                return to7.f((Class) asSubclass, va7Var);
                            case 1:
                                return to7.f((Class) asSubclass, va7Var);
                            case 2:
                                return to7.f((Class) asSubclass, va7Var);
                            default:
                                return new wvm(va7Var, (u2c) ((jp0) asSubclass).b);
                        }
                    }
                };
            } else if (i == 1) {
                final Class asSubclass2 = SsMediaSource$Factory.class.asSubclass(tvh.class);
                final int i3 = 1;
                yqrVar = new yqr() { // from class: po7
                    @Override // defpackage.yqr
                    public final Object get() {
                        switch (i3) {
                            case 0:
                                return to7.f((Class) asSubclass2, va7Var);
                            case 1:
                                return to7.f((Class) asSubclass2, va7Var);
                            case 2:
                                return to7.f((Class) asSubclass2, va7Var);
                            default:
                                return new wvm(va7Var, (u2c) ((jp0) asSubclass2).b);
                        }
                    }
                };
            } else if (i != 2) {
                if (i == 3) {
                    qo7Var = new qo7(0, RtspMediaSource$Factory.class.asSubclass(tvh.class));
                } else if (i == 4) {
                    final int i4 = 3;
                    qo7Var = new yqr() { // from class: po7
                        @Override // defpackage.yqr
                        public final Object get() {
                            switch (i4) {
                                case 0:
                                    return to7.f((Class) this, va7Var);
                                case 1:
                                    return to7.f((Class) this, va7Var);
                                case 2:
                                    return to7.f((Class) this, va7Var);
                                default:
                                    return new wvm(va7Var, (u2c) ((jp0) this).b);
                            }
                        }
                    };
                } else {
                    xq0.x(k5r.i(i, "Unrecognized contentType: "));
                    yqrVar2 = null;
                }
                yqrVar2 = qo7Var;
                hashMap2.put(Integer.valueOf(i), yqrVar2);
            } else {
                final Class asSubclass3 = HlsMediaSource$Factory.class.asSubclass(tvh.class);
                final int i5 = 2;
                yqrVar = new yqr() { // from class: po7
                    @Override // defpackage.yqr
                    public final Object get() {
                        switch (i5) {
                            case 0:
                                return to7.f((Class) asSubclass3, va7Var);
                            case 1:
                                return to7.f((Class) asSubclass3, va7Var);
                            case 2:
                                return to7.f((Class) asSubclass3, va7Var);
                            default:
                                return new wvm(va7Var, (u2c) ((jp0) asSubclass3).b);
                        }
                    }
                };
            }
            yqrVar2 = yqrVar;
            hashMap2.put(Integer.valueOf(i), yqrVar2);
        }
        tvh tvhVar2 = (tvh) yqrVar2.get();
        hra hraVar = (hra) this.g;
        if (hraVar != null) {
            tvhVar2.e(hraVar);
        }
        tvhVar2.a((mvt) this.f);
        tvhVar2.c(this.a);
        tvhVar2.b();
        hashMap.put(Integer.valueOf(i), tvhVar2);
        return tvhVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object g(byte[] bArr, Continuation continuation) {
        gmt gmtVar;
        int i;
        qqi qqiVar;
        jp0 jp0Var;
        try {
            if (continuation instanceof gmt) {
                gmtVar = (gmt) continuation;
                int i2 = gmtVar.o;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    gmtVar.o = i2 - Integer.MIN_VALUE;
                    Object obj = gmtVar.m;
                    nm6 nm6Var = nm6.a;
                    i = gmtVar.o;
                    if (i != 0) {
                        qgg.h0(obj);
                        qqiVar = (qqi) this.e;
                        gmtVar.j = this;
                        gmtVar.k = bArr;
                        gmtVar.l = qqiVar;
                        gmtVar.o = 1;
                        if (qqiVar.a(gmtVar) == nm6Var) {
                            return nm6Var;
                        }
                        jp0Var = this;
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qqi qqiVar2 = gmtVar.l;
                        byte[] bArr2 = gmtVar.k;
                        jp0Var = gmtVar.j;
                        qgg.h0(obj);
                        qqiVar = qqiVar2;
                        bArr = bArr2;
                    }
                    ((LinkedList) jp0Var.d).offer(bArr);
                    qqiVar.b(null);
                    return Unit.a;
                }
            }
            ((LinkedList) jp0Var.d).offer(bArr);
            qqiVar.b(null);
            return Unit.a;
        } catch (Throwable th) {
            qqiVar.b(null);
            throw th;
        }
        gmtVar = new gmt(this, continuation);
        Object obj2 = gmtVar.m;
        nm6 nm6Var2 = nm6.a;
        i = gmtVar.o;
        if (i != 0) {
        }
    }

    @Override // defpackage.sjn
    public Object getValue(Object obj, s9f s9fVar) {
        s9fVar.getClass();
        Object obj2 = this.g;
        if (obj2 != null) {
            return obj2;
        }
        String string = ((SharedPreferences) this.b).getString((String) this.d, null);
        Object invoke = string != null ? ((Function1) this.e).invoke(string) : null;
        this.g = invoke;
        return invoke == null ? this.c : invoke;
    }

    public void h() {
        this.a = true;
        ViewGroup viewGroup = (ViewGroup) this.e;
        if (viewGroup != null) {
            viewGroup.removeView((ComposeView) this.f);
        }
    }

    @Override // defpackage.xjn
    public void setValue(Object obj, s9f s9fVar, Object obj2) {
        s9fVar.getClass();
        this.g = obj2;
        String str = (String) this.d;
        SharedPreferences sharedPreferences = (SharedPreferences) this.b;
        boolean z = this.a;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (obj2 != null) {
            edit.putString(str, (String) ((Function1) this.f).invoke(obj2));
        } else {
            edit.remove(str);
        }
        if (z) {
            edit.commit();
        } else {
            edit.apply();
        }
    }

    public jp0(String str, gst gstVar, voj vojVar, boolean z, c5b c5bVar, c5b c5bVar2, String str2) {
        c5bVar.getClass();
        c5bVar2.getClass();
        str2.getClass();
        this.b = str;
        this.c = gstVar;
        this.d = vojVar;
        this.a = z;
        this.f = c5bVar;
        this.e = c5bVar2;
        this.g = str2;
    }

    public jp0(String str, boolean z, sv4 sv4Var, String str2, rs6 rs6Var, String str3, rf7 rf7Var) {
        this.b = str;
        this.a = z;
        this.c = sv4Var;
        this.d = str2;
        this.e = rs6Var;
        this.f = str3;
        this.g = rf7Var;
    }

    public jp0(Function0 function0, lx7 lx7Var) {
        this.b = function0;
        this.c = new bci(cci.a, lx7Var, k9i.E, kai.b, true);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public jp0(Function0 function0) {
        this(function0, ff7.i((Context) r0.C(r1)));
        l18 l18Var = l18.b;
        bdt I = hag.I(Context.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
    }

    public jp0(nuj nujVar, UUID uuid, jtj jtjVar) {
        nujVar.getClass();
        uuid.getClass();
        this.b = nujVar;
        this.c = uuid;
        this.d = jtjVar;
        this.e = x4b.a;
    }

    public jp0(SharedPreferences sharedPreferences, c5b c5bVar, String str, boolean z, Function1 function1, Function1 function12) {
        sharedPreferences.getClass();
        this.b = sharedPreferences;
        this.c = c5bVar;
        this.d = str;
        this.a = z;
        this.e = function1;
        this.f = function12;
    }

    public jp0() {
        this.b = null;
        this.c = yv1.c;
        this.e = imp.d;
        this.f = xj7.a;
    }

    public jp0(Context context) {
        this.b = context;
        this.c = yv1.c;
        this.e = imp.d;
        this.f = xj7.a;
    }

    public jp0(u2c u2cVar, mvt mvtVar) {
        this.b = u2cVar;
        this.f = mvtVar;
        this.c = new HashMap();
        this.d = new HashMap();
        this.a = true;
    }
}
