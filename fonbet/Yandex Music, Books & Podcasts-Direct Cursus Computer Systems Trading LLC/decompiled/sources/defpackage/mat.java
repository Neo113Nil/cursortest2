package defpackage;

import com.connectsdk.service.command.ServiceCommand;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class mat {
    public static final String[] l = {"INSERT", "UPDATE", ServiceCommand.TYPE_DEL};
    public final ueo a;
    public final HashMap b;
    public final HashMap c;
    public final boolean d;
    public final aub e;
    public final String[] g;
    public final tjj h;
    public final oxa i;
    public final AtomicBoolean j = new AtomicBoolean(false);
    public Function0 k = new x6s(26);
    public final LinkedHashMap f = new LinkedHashMap();

    public mat(ueo ueoVar, HashMap hashMap, HashMap hashMap2, String[] strArr, boolean z, aub aubVar) {
        String str;
        this.a = ueoVar;
        this.b = hashMap;
        this.c = hashMap2;
        this.d = z;
        this.e = aubVar;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArr[i];
            Locale locale = Locale.ROOT;
            String lowerCase = str2.toLowerCase(locale);
            lowerCase.getClass();
            this.f.put(lowerCase, Integer.valueOf(i));
            String str3 = (String) this.b.get(strArr[i]);
            if (str3 != null) {
                str = str3.toLowerCase(locale);
                str.getClass();
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr2[i] = lowerCase;
        }
        this.g = strArr2;
        for (Map.Entry entry : this.b.entrySet()) {
            String str4 = (String) entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase2 = str4.toLowerCase(locale2);
            lowerCase2.getClass();
            if (this.f.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                lowerCase3.getClass();
                LinkedHashMap linkedHashMap = this.f;
                linkedHashMap.put(lowerCase3, uah.c(lowerCase2, linkedHashMap));
            }
        }
        this.h = new tjj(this.g.length);
        this.i = new oxa(this.g.length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r4 == r6) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(mat matVar, tgm tgmVar, cg6 cg6Var) {
        fat fatVar;
        int i;
        Set set;
        if (cg6Var instanceof fat) {
            fatVar = (fat) cg6Var;
            int i2 = fatVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fatVar.m = i2 - Integer.MIN_VALUE;
                Object obj = fatVar.k;
                nm6 nm6Var = nm6.a;
                i = fatVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    h4t h4tVar = new h4t(13);
                    fatVar.j = tgmVar;
                    fatVar.m = 1;
                    obj = tgmVar.b("SELECT * FROM room_table_modification_log WHERE invalidated = 1", h4tVar, fatVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Set set2 = (Set) fatVar.j;
                        qgg.h0(obj);
                        return set2;
                    }
                    tgmVar = (tgm) fatVar.j;
                    qgg.h0(obj);
                }
                set = (Set) obj;
                if (!set.isEmpty()) {
                    fatVar.j = set;
                    fatVar.m = 2;
                    if (o5g.y(tgmVar, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1", fatVar) == nm6Var) {
                        return nm6Var;
                    }
                }
                return set;
            }
        }
        fatVar = new fat(matVar, cg6Var);
        Object obj2 = fatVar.k;
        nm6 nm6Var2 = nm6.a;
        i = fatVar.m;
        if (i != 0) {
        }
        set = (Set) obj2;
        if (!set.isEmpty()) {
        }
        return set;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0087 A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:11:0x0028, B:12:0x007c, B:14:0x0087, B:17:0x00c2, B:19:0x0096, B:20:0x009a, B:22:0x00a7, B:24:0x00b1, B:26:0x00b7, B:27:0x00b5, B:30:0x00bc), top: B:10:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(mat matVar, cg6 cg6Var) {
        hat hatVar;
        int i;
        yfx yfxVar;
        Set set;
        Object value;
        int[] iArr;
        ueo ueoVar = matVar.a;
        if (cg6Var instanceof hat) {
            hatVar = (hat) cg6Var;
            int i2 = hatVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hatVar.m = i2 - Integer.MIN_VALUE;
                Object obj = hatVar.k;
                nm6 nm6Var = nm6.a;
                i = hatVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    yfx yfxVar2 = ueoVar.h;
                    if (!yfxVar2.g()) {
                        return q5b.a;
                    }
                    try {
                        if (!matVar.j.compareAndSet(true, false)) {
                            q5b q5bVar = q5b.a;
                            yfxVar2.y();
                            return q5bVar;
                        }
                        if (!((Boolean) matVar.k.invoke()).booleanValue()) {
                            q5b q5bVar2 = q5b.a;
                            yfxVar2.y();
                            return q5bVar2;
                        }
                        iat iatVar = new iat(matVar, null, 1);
                        hatVar.j = yfxVar2;
                        hatVar.m = 1;
                        Object u = ueoVar.u(false, iatVar, hatVar);
                        if (u == nm6Var) {
                            return nm6Var;
                        }
                        yfxVar = yfxVar2;
                        obj = u;
                    } catch (Throwable th) {
                        th = th;
                        yfxVar = yfxVar2;
                        yfxVar.y();
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    yfxVar = hatVar.j;
                    try {
                        qgg.h0(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        yfxVar.y();
                        throw th;
                    }
                }
                set = (Set) obj;
                if (!set.isEmpty()) {
                    oxa oxaVar = matVar.i;
                    oxaVar.getClass();
                    set.getClass();
                    if (!set.isEmpty()) {
                        xdr xdrVar = (xdr) oxaVar.b;
                        do {
                            value = xdrVar.getValue();
                            int[] iArr2 = (int[]) value;
                            int length = iArr2.length;
                            iArr = new int[length];
                            for (int i3 = 0; i3 < length; i3++) {
                                iArr[i3] = set.contains(Integer.valueOf(i3)) ? iArr2[i3] + 1 : iArr2[i3];
                            }
                        } while (!xdrVar.k(value, iArr));
                    }
                    matVar.e.invoke(set);
                }
                yfxVar.y();
                return set;
            }
        }
        hatVar = new hat(matVar, cg6Var);
        Object obj2 = hatVar.k;
        nm6 nm6Var2 = nm6.a;
        i = hatVar.m;
        if (i != 0) {
        }
        set = (Set) obj2;
        if (!set.isEmpty()) {
        }
        yfxVar.y();
        return set;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00d8, code lost:
    
        if (defpackage.o5g.y(r11, r3, r4) == r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00da, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0078, code lost:
    
        if (defpackage.o5g.y(r1, r3, r4) == r5) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Type inference failed for: r2v6, types: [tgm] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00d8 -> B:11:0x00db). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(mat matVar, r6t r6tVar, int i, cg6 cg6Var) {
        jat jatVar;
        int i2;
        int i3;
        int i4;
        String[] strArr;
        tgm tgmVar;
        int i5;
        String str;
        r6t r6tVar2 = r6tVar;
        int i6 = i;
        matVar.getClass();
        if (cg6Var instanceof jat) {
            jatVar = (jat) cg6Var;
            int i7 = jatVar.r;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                jatVar.r = i7 - Integer.MIN_VALUE;
                Object obj = jatVar.p;
                nm6 nm6Var = nm6.a;
                i2 = jatVar.r;
                boolean z = true;
                if (i2 != 0) {
                    qgg.h0(obj);
                    String str2 = "INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i6 + ", 0)";
                    jatVar.j = r6tVar2;
                    jatVar.m = i6;
                    jatVar.r = 1;
                } else if (i2 == 1) {
                    int i8 = jatVar.m;
                    ?? r2 = jatVar.j;
                    qgg.h0(obj);
                    i6 = i8;
                    r6tVar2 = r2;
                } else {
                    if (i2 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i5 = jatVar.o;
                    i4 = jatVar.n;
                    i3 = jatVar.m;
                    strArr = jatVar.l;
                    str = jatVar.k;
                    tgmVar = jatVar.j;
                    qgg.h0(obj);
                    boolean z2 = true;
                    i4++;
                    z = z2;
                    if (i4 >= i5) {
                        return Unit.a;
                    }
                    String str3 = strArr[i4];
                    z2 = z;
                    StringBuilder m = f1d.m("CREATE ", matVar.d ? "TEMP" : "", " TRIGGER IF NOT EXISTS `", "room_table_modification_trigger_" + str + '_' + str3, "` AFTER ");
                    su4.v(m, str3, " ON `", str, "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = ");
                    String i9 = f1d.i(m, i3, " AND invalidated = 0; END");
                    jatVar.j = tgmVar;
                    jatVar.k = str;
                    jatVar.l = strArr;
                    jatVar.m = i3;
                    jatVar.n = i4;
                    jatVar.o = i5;
                    jatVar.r = 2;
                }
                String str4 = matVar.g[i6];
                i3 = i6;
                i4 = 0;
                strArr = l;
                tgmVar = r6tVar2;
                i5 = 3;
                str = str4;
                if (i4 >= i5) {
                }
            }
        }
        jatVar = new jat(matVar, cg6Var);
        Object obj2 = jatVar.p;
        nm6 nm6Var2 = nm6.a;
        i2 = jatVar.r;
        boolean z3 = true;
        if (i2 != 0) {
        }
        String str42 = matVar.g[i6];
        i3 = i6;
        i4 = 0;
        strArr = l;
        tgmVar = r6tVar2;
        i5 = 3;
        str = str42;
        if (i4 >= i5) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r4v4, types: [tgm] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0081 -> B:10:0x0084). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(mat matVar, r6t r6tVar, int i, cg6 cg6Var) {
        kat katVar;
        int i2;
        String str;
        int i3;
        r6t r6tVar2;
        int i4;
        String[] strArr;
        matVar.getClass();
        if (cg6Var instanceof kat) {
            katVar = (kat) cg6Var;
            int i5 = katVar.q;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                katVar.q = i5 - Integer.MIN_VALUE;
                Object obj = katVar.o;
                nm6 nm6Var = nm6.a;
                i2 = katVar.q;
                if (i2 != 0) {
                    qgg.h0(obj);
                    str = matVar.g[i];
                    i3 = 3;
                    r6tVar2 = r6tVar;
                    i4 = 0;
                    strArr = l;
                    if (i4 < i3) {
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = katVar.n;
                    i4 = katVar.m;
                    String[] strArr2 = katVar.l;
                    str = katVar.k;
                    ?? r4 = katVar.j;
                    qgg.h0(obj);
                    strArr = strArr2;
                    r6tVar2 = r4;
                    i4++;
                    if (i4 < i3) {
                        String k = ouj.k('`', "DROP TRIGGER IF EXISTS `", "room_table_modification_trigger_" + str + '_' + strArr[i4]);
                        katVar.j = r6tVar2;
                        katVar.k = str;
                        katVar.l = strArr;
                        katVar.m = i4;
                        katVar.n = i3;
                        katVar.q = 1;
                        if (o5g.y(r6tVar2, k, katVar) == nm6Var) {
                            return nm6Var;
                        }
                        i4++;
                        if (i4 < i3) {
                            return Unit.a;
                        }
                    }
                }
            }
        }
        katVar = new kat(matVar, cg6Var);
        Object obj2 = katVar.o;
        nm6 nm6Var2 = nm6.a;
        i2 = katVar.q;
        if (i2 != 0) {
        }
    }

    public final void e(Function0 function0, Function0 function02) {
        function0.getClass();
        function02.getClass();
        if (this.j.compareAndSet(false, true)) {
            function0.invoke();
            tf6 tf6Var = this.a.b;
            Continuation continuation = null;
            if (tf6Var != null) {
                x97.y(tf6Var, new im6("Room Invalidation Tracker Refresh"), null, new v0r(this, function02, continuation, 28), 2);
            } else {
                Intrinsics.j("coroutineScope");
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(cg6 cg6Var) {
        lat latVar;
        int i;
        yfx yfxVar;
        if (cg6Var instanceof lat) {
            latVar = (lat) cg6Var;
            int i2 = latVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                latVar.m = i2 - Integer.MIN_VALUE;
                Object obj = latVar.k;
                nm6 nm6Var = nm6.a;
                i = latVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    ueo ueoVar = this.a;
                    yfx yfxVar2 = ueoVar.h;
                    if (yfxVar2.g()) {
                        try {
                            h0t h0tVar = new h0t(this, null, 2);
                            latVar.j = yfxVar2;
                            latVar.m = 1;
                            if (ueoVar.u(false, h0tVar, latVar) == nm6Var) {
                                return nm6Var;
                            }
                            yfxVar = yfxVar2;
                        } catch (Throwable th) {
                            th = th;
                            yfxVar = yfxVar2;
                            yfxVar.y();
                            throw th;
                        }
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                yfxVar = latVar.j;
                try {
                    qgg.h0(obj);
                } catch (Throwable th2) {
                    th = th2;
                    yfxVar.y();
                    throw th;
                }
                yfxVar.y();
                return Unit.a;
            }
        }
        latVar = new lat(this, cg6Var);
        Object obj2 = latVar.k;
        nm6 nm6Var2 = nm6.a;
        i = latVar.m;
        if (i != 0) {
        }
        yfxVar.y();
        return Unit.a;
    }
}
