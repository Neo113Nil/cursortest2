package com.anythink.core.a;

import android.text.TextUtils;
import android.util.Pair;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.common.e.a;
import com.anythink.core.common.h.bv;
import com.anythink.core.common.h.f;
import com.anythink.core.common.h.k;
import com.anythink.core.common.h.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final String f11583a = "AdSourceFltRuleHandler";

    /* renamed from: b, reason: collision with root package name */
    private final com.anythink.core.common.e.a f11584b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, Long> f11585c = new ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    private final Map<String, Pair<Integer, Long>> f11587e = new ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Set<String> f11586d = new CopyOnWriteArraySet();

    public e(com.anythink.core.common.e.a aVar) {
        this.f11584b = aVar;
    }

    public final void a(bv bvVar) {
        try {
            l bv = bvVar.bv();
            int a9 = bv.a();
            if (a9 != 3) {
                return;
            }
            String z3 = bvVar.z();
            if (TextUtils.isEmpty(z3)) {
                return;
            }
            f a10 = a("3", z3, a9);
            int i = 1;
            boolean z6 = a10 != null;
            long currentTimeMillis = System.currentTimeMillis();
            if (z6) {
                long i6 = a10.i();
                if (currentTimeMillis < bv.d() + i6) {
                    i = 1 + a10.f13944a;
                    currentTimeMillis = i6;
                }
            } else {
                a10 = new f("3");
                a10.a(z3);
                a10.a(a9);
            }
            a10.a(currentTimeMillis);
            a10.f13944a = i;
            this.f11587e.put(z3, new Pair<>(Integer.valueOf(i), Long.valueOf(currentTimeMillis)));
            this.f11584b.a(a10, z6);
        } catch (Throwable unused) {
        }
    }

    public final k b(bv bvVar) {
        String z3;
        int a9;
        f a10;
        try {
            z3 = bvVar.z();
            a9 = bvVar.bv().a();
        } catch (Throwable unused) {
        }
        if (TextUtils.isEmpty(z3)) {
            return null;
        }
        Long l9 = this.f11585c.get(z3);
        boolean z6 = false;
        if (l9 == null ? !((a10 = a("4", z3, a9)) == null || a10.n() <= System.currentTimeMillis()) : l9.longValue() > System.currentTimeMillis()) {
            z6 = true;
        }
        if (z6) {
            if (a9 == 1) {
                return new k(32, ErrorCode.getErrorCode(ErrorCode.noFillNcError, "", ""));
            }
            if (a9 == 2) {
                return new k(33, ErrorCode.getErrorCode(ErrorCode.noFillSError, "", ""));
            }
            if (a9 != 3) {
                return null;
            }
            return new k(34, ErrorCode.getErrorCode(ErrorCode.noFillSrError, "", ""));
        }
        return null;
    }

    public final void c(bv bvVar) {
        try {
            l bv = bvVar.bv();
            if (bv == null) {
                return;
            }
            int a9 = bv.a();
            String z3 = bvVar.z();
            if (a9 == 1 && !TextUtils.isEmpty(z3)) {
                List<Pair<String, String>> b9 = b("4", z3, a9);
                if (this.f11586d.contains(z3)) {
                    return;
                }
                this.f11586d.add(z3);
                this.f11585c.remove(z3);
                this.f11584b.a(b9);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00be A[Catch: all -> 0x0172, TryCatch #0 {all -> 0x0172, blocks: (B:3:0x0006, B:8:0x001e, B:10:0x002b, B:14:0x003f, B:15:0x005d, B:16:0x008d, B:18:0x0093, B:21:0x00a5, B:36:0x00be, B:44:0x0130, B:45:0x0133, B:47:0x0150, B:50:0x0159, B:51:0x0160, B:54:0x00db, B:56:0x00e5, B:59:0x00ee, B:61:0x00f2, B:64:0x00f9, B:66:0x0102, B:67:0x0106, B:68:0x0108, B:70:0x0112, B:71:0x0116, B:73:0x011c, B:74:0x0121, B:76:0x0127, B:77:0x013b, B:79:0x00b1), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0150 A[Catch: all -> 0x0172, TryCatch #0 {all -> 0x0172, blocks: (B:3:0x0006, B:8:0x001e, B:10:0x002b, B:14:0x003f, B:15:0x005d, B:16:0x008d, B:18:0x0093, B:21:0x00a5, B:36:0x00be, B:44:0x0130, B:45:0x0133, B:47:0x0150, B:50:0x0159, B:51:0x0160, B:54:0x00db, B:56:0x00e5, B:59:0x00ee, B:61:0x00f2, B:64:0x00f9, B:66:0x0102, B:67:0x0106, B:68:0x0108, B:70:0x0112, B:71:0x0116, B:73:0x011c, B:74:0x0121, B:76:0x0127, B:77:0x013b, B:79:0x00b1), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013b A[Catch: all -> 0x0172, TryCatch #0 {all -> 0x0172, blocks: (B:3:0x0006, B:8:0x001e, B:10:0x002b, B:14:0x003f, B:15:0x005d, B:16:0x008d, B:18:0x0093, B:21:0x00a5, B:36:0x00be, B:44:0x0130, B:45:0x0133, B:47:0x0150, B:50:0x0159, B:51:0x0160, B:54:0x00db, B:56:0x00e5, B:59:0x00ee, B:61:0x00f2, B:64:0x00f9, B:66:0x0102, B:67:0x0106, B:68:0x0108, B:70:0x0112, B:71:0x0116, B:73:0x011c, B:74:0x0121, B:76:0x0127, B:77:0x013b, B:79:0x00b1), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(bv bvVar) {
        f a9;
        boolean z3;
        long f3;
        long j6;
        try {
            l bv = bvVar.bv();
            long currentTimeMillis = System.currentTimeMillis();
            int a10 = bv.a();
            String z6 = bvVar.z();
            if (TextUtils.isEmpty(z6)) {
                return;
            }
            bvVar.z();
            f fVar = new f("4");
            f fVar2 = null;
            if (a10 == 3) {
                boolean containsKey = this.f11587e.containsKey(z6);
                Pair<Integer, Long> pair = this.f11587e.get(z6);
                if (!containsKey || pair == null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new Pair(a(a.C0077a.f12910h, "="), z6));
                    arrayList.add(new Pair(a(a.C0077a.f12916o, "="), String.valueOf(a10)));
                    a9 = null;
                    for (f fVar3 : this.f11584b.a(arrayList, 2)) {
                        if ("4".equals(fVar3.a())) {
                            a9 = fVar3;
                        } else if ("3".equals(fVar3.a())) {
                            fVar2 = fVar3;
                        }
                    }
                    z3 = a9 == null;
                    if (z3) {
                        fVar.a(z6);
                        fVar.a(a10);
                        fVar.a(currentTimeMillis);
                        fVar.b(1);
                        fVar.b(0L);
                    } else {
                        a9.e();
                        int m4 = a9.m() + 1;
                        long i = a9.i();
                        long currentTimeMillis2 = System.currentTimeMillis();
                        int a11 = bv.a();
                        if (a11 == 1) {
                            if (m4 >= bv.b()) {
                                f3 = bv.f();
                                j6 = currentTimeMillis2 + f3;
                            }
                            j6 = 0;
                        } else if (a11 != 2) {
                            if (a11 == 3) {
                                if (currentTimeMillis2 >= i + bv.d()) {
                                    a9.a(currentTimeMillis2);
                                    m4 = 1;
                                } else {
                                    int i6 = fVar2 != null ? fVar2.f13944a : 0;
                                    if (i6 > 0 && i6 >= bv.g() && (m4 * 100) / i6 >= bv.e()) {
                                        f3 = bv.f();
                                        j6 = currentTimeMillis2 + f3;
                                    }
                                }
                            }
                            j6 = 0;
                        } else if (currentTimeMillis2 >= i + bv.d()) {
                            a9.a(currentTimeMillis2);
                            m4 = 1;
                            j6 = 0;
                        } else {
                            if (m4 >= bv.c()) {
                                f3 = bv.f();
                                j6 = currentTimeMillis2 + f3;
                            }
                            j6 = 0;
                        }
                        if (j6 > 0) {
                            bv.a();
                        }
                        a9.b(j6);
                        a9.b(m4);
                        fVar = a9;
                    }
                    if (a10 == 1) {
                        this.f11586d.remove(z6);
                    }
                    if (a10 == 3 && fVar2 != null) {
                        fVar.a(fVar2.i());
                    }
                    this.f11585c.put(z6, Long.valueOf(fVar.n()));
                    this.f11584b.a(fVar, z3);
                }
                int intValue = ((Integer) pair.first).intValue();
                long longValue = ((Long) pair.second).longValue();
                fVar2 = new f("3");
                fVar2.f13944a = intValue;
                fVar2.a(longValue);
                fVar2.a(3);
            }
            a9 = a("4", z6, a10);
            if (a9 == null) {
            }
            if (z3) {
            }
            if (a10 == 1) {
            }
            if (a10 == 3) {
                fVar.a(fVar2.i());
            }
            this.f11585c.put(z6, Long.valueOf(fVar.n()));
            this.f11584b.a(fVar, z3);
        } catch (Throwable unused) {
        }
    }

    private static List<Pair<String, String>> b(String str, String str2, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair(a(a.C0077a.f12904b, "="), str));
        arrayList.add(new Pair(a(a.C0077a.f12910h, "="), str2));
        arrayList.add(new Pair(a(a.C0077a.f12916o, "="), String.valueOf(i)));
        return arrayList;
    }

    private static f a(l lVar, f fVar, f fVar2) {
        long f3;
        long j6;
        fVar2.e();
        int m4 = fVar2.m() + 1;
        long i = fVar2.i();
        long currentTimeMillis = System.currentTimeMillis();
        int a9 = lVar.a();
        if (a9 == 1) {
            if (m4 >= lVar.b()) {
                f3 = lVar.f();
                j6 = f3 + currentTimeMillis;
            }
            j6 = 0;
        } else if (a9 != 2) {
            if (a9 == 3) {
                if (currentTimeMillis >= lVar.d() + i) {
                    fVar2.a(currentTimeMillis);
                    m4 = 1;
                } else {
                    int i6 = fVar != null ? fVar.f13944a : 0;
                    if (i6 > 0 && i6 >= lVar.g() && (m4 * 100) / i6 >= lVar.e()) {
                        f3 = lVar.f();
                        j6 = f3 + currentTimeMillis;
                    }
                }
            }
            j6 = 0;
        } else if (currentTimeMillis >= lVar.d() + i) {
            fVar2.a(currentTimeMillis);
            m4 = 1;
            j6 = 0;
        } else {
            if (m4 >= lVar.c()) {
                f3 = lVar.f();
                j6 = f3 + currentTimeMillis;
            }
            j6 = 0;
        }
        if (j6 > 0) {
            lVar.a();
        }
        fVar2.b(j6);
        fVar2.b(m4);
        return fVar2;
    }

    private static k a(int i) {
        if (i == 1) {
            return new k(32, ErrorCode.getErrorCode(ErrorCode.noFillNcError, "", ""));
        }
        if (i == 2) {
            return new k(33, ErrorCode.getErrorCode(ErrorCode.noFillSError, "", ""));
        }
        if (i != 3) {
            return null;
        }
        return new k(34, ErrorCode.getErrorCode(ErrorCode.noFillSrError, "", ""));
    }

    private static String a(String str) {
        return a(str, "=");
    }

    private static String a(String str, String str2) {
        return str + " " + str2 + " ?";
    }

    private f a(String str, String str2, int i) {
        List<f> a9 = this.f11584b.a(b(str, str2, i), 1);
        if (a9.isEmpty()) {
            return null;
        }
        return a9.get(0);
    }

    private List<f> a(String str, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair(a(a.C0077a.f12910h, "="), str));
        arrayList.add(new Pair(a(a.C0077a.f12916o, "="), String.valueOf(i)));
        return this.f11584b.a(arrayList, 2);
    }
}
