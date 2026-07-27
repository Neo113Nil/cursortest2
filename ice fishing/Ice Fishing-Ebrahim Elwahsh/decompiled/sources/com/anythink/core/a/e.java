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
    private static final String f11740a = "AdSourceFltRuleHandler";

    /* renamed from: b, reason: collision with root package name */
    private final com.anythink.core.common.e.a f11741b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, Long> f11742c = new ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    private final Map<String, Pair<Integer, Long>> f11744e = new ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Set<String> f11743d = new CopyOnWriteArraySet();

    public e(com.anythink.core.common.e.a aVar) {
        this.f11741b = aVar;
    }

    public final void a(bv bvVar) {
        try {
            l bv = bvVar.bv();
            int a9 = bv.a();
            if (a9 != 3) {
                return;
            }
            String z8 = bvVar.z();
            if (TextUtils.isEmpty(z8)) {
                return;
            }
            f a10 = a("3", z8, a9);
            int i = 1;
            boolean z9 = a10 != null;
            long currentTimeMillis = System.currentTimeMillis();
            if (z9) {
                long i4 = a10.i();
                if (currentTimeMillis < bv.d() + i4) {
                    i = 1 + a10.f14101a;
                    currentTimeMillis = i4;
                }
            } else {
                a10 = new f("3");
                a10.a(z8);
                a10.a(a9);
            }
            a10.a(currentTimeMillis);
            a10.f14101a = i;
            this.f11744e.put(z8, new Pair<>(Integer.valueOf(i), Long.valueOf(currentTimeMillis)));
            this.f11741b.a(a10, z9);
        } catch (Throwable unused) {
        }
    }

    public final k b(bv bvVar) {
        String z8;
        int a9;
        f a10;
        try {
            z8 = bvVar.z();
            a9 = bvVar.bv().a();
        } catch (Throwable unused) {
        }
        if (TextUtils.isEmpty(z8)) {
            return null;
        }
        Long l9 = this.f11742c.get(z8);
        boolean z9 = false;
        if (l9 == null ? !((a10 = a("4", z8, a9)) == null || a10.n() <= System.currentTimeMillis()) : l9.longValue() > System.currentTimeMillis()) {
            z9 = true;
        }
        if (z9) {
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
            String z8 = bvVar.z();
            if (a9 == 1 && !TextUtils.isEmpty(z8)) {
                List<Pair<String, String>> b9 = b("4", z8, a9);
                if (this.f11743d.contains(z8)) {
                    return;
                }
                this.f11743d.add(z8);
                this.f11742c.remove(z8);
                this.f11741b.a(b9);
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
        boolean z8;
        long f6;
        long j9;
        try {
            l bv = bvVar.bv();
            long currentTimeMillis = System.currentTimeMillis();
            int a10 = bv.a();
            String z9 = bvVar.z();
            if (TextUtils.isEmpty(z9)) {
                return;
            }
            bvVar.z();
            f fVar = new f("4");
            f fVar2 = null;
            if (a10 == 3) {
                boolean containsKey = this.f11744e.containsKey(z9);
                Pair<Integer, Long> pair = this.f11744e.get(z9);
                if (!containsKey || pair == null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new Pair(a(a.C0076a.f13067h, "="), z9));
                    arrayList.add(new Pair(a(a.C0076a.f13073o, "="), String.valueOf(a10)));
                    a9 = null;
                    for (f fVar3 : this.f11741b.a(arrayList, 2)) {
                        if ("4".equals(fVar3.a())) {
                            a9 = fVar3;
                        } else if ("3".equals(fVar3.a())) {
                            fVar2 = fVar3;
                        }
                    }
                    z8 = a9 == null;
                    if (z8) {
                        fVar.a(z9);
                        fVar.a(a10);
                        fVar.a(currentTimeMillis);
                        fVar.b(1);
                        fVar.b(0L);
                    } else {
                        a9.e();
                        int m8 = a9.m() + 1;
                        long i = a9.i();
                        long currentTimeMillis2 = System.currentTimeMillis();
                        int a11 = bv.a();
                        if (a11 == 1) {
                            if (m8 >= bv.b()) {
                                f6 = bv.f();
                                j9 = currentTimeMillis2 + f6;
                            }
                            j9 = 0;
                        } else if (a11 != 2) {
                            if (a11 == 3) {
                                if (currentTimeMillis2 >= i + bv.d()) {
                                    a9.a(currentTimeMillis2);
                                    m8 = 1;
                                } else {
                                    int i4 = fVar2 != null ? fVar2.f14101a : 0;
                                    if (i4 > 0 && i4 >= bv.g() && (m8 * 100) / i4 >= bv.e()) {
                                        f6 = bv.f();
                                        j9 = currentTimeMillis2 + f6;
                                    }
                                }
                            }
                            j9 = 0;
                        } else if (currentTimeMillis2 >= i + bv.d()) {
                            a9.a(currentTimeMillis2);
                            m8 = 1;
                            j9 = 0;
                        } else {
                            if (m8 >= bv.c()) {
                                f6 = bv.f();
                                j9 = currentTimeMillis2 + f6;
                            }
                            j9 = 0;
                        }
                        if (j9 > 0) {
                            bv.a();
                        }
                        a9.b(j9);
                        a9.b(m8);
                        fVar = a9;
                    }
                    if (a10 == 1) {
                        this.f11743d.remove(z9);
                    }
                    if (a10 == 3 && fVar2 != null) {
                        fVar.a(fVar2.i());
                    }
                    this.f11742c.put(z9, Long.valueOf(fVar.n()));
                    this.f11741b.a(fVar, z8);
                }
                int intValue = ((Integer) pair.first).intValue();
                long longValue = ((Long) pair.second).longValue();
                fVar2 = new f("3");
                fVar2.f14101a = intValue;
                fVar2.a(longValue);
                fVar2.a(3);
            }
            a9 = a("4", z9, a10);
            if (a9 == null) {
            }
            if (z8) {
            }
            if (a10 == 1) {
            }
            if (a10 == 3) {
                fVar.a(fVar2.i());
            }
            this.f11742c.put(z9, Long.valueOf(fVar.n()));
            this.f11741b.a(fVar, z8);
        } catch (Throwable unused) {
        }
    }

    private static List<Pair<String, String>> b(String str, String str2, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair(a(a.C0076a.f13061b, "="), str));
        arrayList.add(new Pair(a(a.C0076a.f13067h, "="), str2));
        arrayList.add(new Pair(a(a.C0076a.f13073o, "="), String.valueOf(i)));
        return arrayList;
    }

    private static f a(l lVar, f fVar, f fVar2) {
        long f6;
        long j9;
        fVar2.e();
        int m8 = fVar2.m() + 1;
        long i = fVar2.i();
        long currentTimeMillis = System.currentTimeMillis();
        int a9 = lVar.a();
        if (a9 == 1) {
            if (m8 >= lVar.b()) {
                f6 = lVar.f();
                j9 = f6 + currentTimeMillis;
            }
            j9 = 0;
        } else if (a9 != 2) {
            if (a9 == 3) {
                if (currentTimeMillis >= lVar.d() + i) {
                    fVar2.a(currentTimeMillis);
                    m8 = 1;
                } else {
                    int i4 = fVar != null ? fVar.f14101a : 0;
                    if (i4 > 0 && i4 >= lVar.g() && (m8 * 100) / i4 >= lVar.e()) {
                        f6 = lVar.f();
                        j9 = f6 + currentTimeMillis;
                    }
                }
            }
            j9 = 0;
        } else if (currentTimeMillis >= lVar.d() + i) {
            fVar2.a(currentTimeMillis);
            m8 = 1;
            j9 = 0;
        } else {
            if (m8 >= lVar.c()) {
                f6 = lVar.f();
                j9 = f6 + currentTimeMillis;
            }
            j9 = 0;
        }
        if (j9 > 0) {
            lVar.a();
        }
        fVar2.b(j9);
        fVar2.b(m8);
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
        List<f> a9 = this.f11741b.a(b(str, str2, i), 1);
        if (a9.isEmpty()) {
            return null;
        }
        return a9.get(0);
    }

    private List<f> a(String str, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair(a(a.C0076a.f13067h, "="), str));
        arrayList.add(new Pair(a(a.C0076a.f13073o, "="), String.valueOf(i)));
        return this.f11741b.a(arrayList, 2);
    }
}
