package com.anythink.core.common;

import android.text.TextUtils;
import com.anythink.core.api.AdError;
import com.anythink.core.common.e.m;
import com.anythink.core.common.h.bd;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    public static final String f16249a = "s";

    /* renamed from: b, reason: collision with root package name */
    private static volatile s f16250b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, bd> f16251c;

    /* renamed from: d, reason: collision with root package name */
    private List<bd> f16252d;

    /* renamed from: f, reason: collision with root package name */
    private final int f16254f = 5;

    /* renamed from: g, reason: collision with root package name */
    private final int f16255g = 500;

    /* renamed from: e, reason: collision with root package name */
    private List<String> f16253e = Collections.synchronizedList(new ArrayList(8));

    private s() {
    }

    public static boolean a(int i) {
        boolean z3;
        switch (i) {
            case com.anythink.core.common.m.o.f14694d /* -1003 */:
            case com.anythink.core.common.m.o.f14693c /* -1002 */:
            case com.anythink.core.common.m.o.f14692b /* -1001 */:
            case -1000:
                z3 = true;
                break;
            default:
                z3 = false;
                break;
        }
        if (z3 || ((i < -99 || i >= 200) && i < 400)) {
            return z3;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:9:0x002a, B:11:0x002e, B:12:0x0038, B:14:0x003c, B:24:0x0027, B:3:0x0001, B:5:0x0005, B:7:0x0009), top: B:2:0x0001, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:9:0x002a, B:11:0x002e, B:12:0x0038, B:14:0x003c, B:24:0x0027, B:3:0x0001, B:5:0x0005, B:7:0x0009), top: B:2:0x0001, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private synchronized void c() {
        try {
            try {
                if (this.f16251c == null && this.f16252d == null) {
                    m.a a9 = com.anythink.core.common.e.m.a(com.anythink.core.common.e.e.a(com.anythink.core.common.d.t.b().g())).a();
                    this.f16251c = a9.f13044b;
                    this.f16252d = a9.f13043a;
                }
            } finally {
                if (this.f16251c == null) {
                }
                if (this.f16252d == null) {
                }
            }
            if (this.f16251c == null) {
                this.f16251c = new ConcurrentHashMap();
            }
            if (this.f16252d == null) {
                this.f16252d = Collections.synchronizedList(new ArrayList());
            }
        } catch (Throwable th) {
        }
    }

    public final synchronized void b() {
        try {
            c();
            List<bd> synchronizedList = this.f16252d != null ? Collections.synchronizedList(new ArrayList(this.f16252d)) : null;
            if (synchronizedList != null && synchronizedList.size() > 0) {
                for (bd bdVar : synchronizedList) {
                    bdVar.a();
                    a(bdVar, true);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static s a() {
        if (f16250b == null) {
            synchronized (s.class) {
                try {
                    if (f16250b == null) {
                        f16250b = new s();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f16250b;
    }

    public final synchronized void a(String str, String str2, long j6) {
        bd bdVar = new bd();
        bdVar.f13616b = 2;
        bdVar.f13618d = str;
        bdVar.f13617c = str2;
        bdVar.f13620f = j6;
        bdVar.a();
        a(bdVar, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b(bd bdVar) {
        try {
            if (TextUtils.isEmpty(bdVar.f13615a) && this.f16251c != null && this.f16252d != null) {
                bdVar.f13619e = System.currentTimeMillis();
                String a9 = com.anythink.core.common.v.o.a(bdVar.f13618d + bdVar.f13619e);
                bdVar.f13615a = a9;
                this.f16251c.put(a9, bdVar);
                this.f16252d.add(bdVar);
            }
            bdVar.a();
            com.anythink.core.common.e.m.a(com.anythink.core.common.e.e.a(com.anythink.core.common.d.t.b().g())).a(bdVar);
            List<bd> list = this.f16252d;
            if (list != null && list.size() > 500) {
                bd bdVar2 = this.f16252d.get(0);
                bdVar.a();
                this.f16253e.remove(bdVar.f13615a);
                a(bdVar2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void a(final bd bdVar, final boolean z3) {
        if (System.currentTimeMillis() > bdVar.f13620f) {
            bdVar.a();
            this.f16253e.remove(bdVar.f13615a);
            if (z3) {
                a(bdVar);
            }
            return;
        }
        if (this.f16253e.contains(bdVar.f13615a)) {
            bdVar.a();
            return;
        }
        this.f16253e.add(bdVar.f13615a);
        if (z3) {
            int i = bdVar.f13621g + 1;
            bdVar.f13621g = i;
            if (i >= 5) {
                bdVar.a();
                a(bdVar);
            } else {
                b(bdVar);
            }
        } else {
            int i6 = bdVar.f13621g + 1;
            bdVar.f13621g = i6;
            if (i6 >= 5) {
                bdVar.a();
                this.f16253e.remove(bdVar.f13615a);
                return;
            }
        }
        bdVar.a();
        new com.anythink.core.common.m.t(bdVar).a(0, new com.anythink.core.common.m.q() { // from class: com.anythink.core.common.s.1
            @Override // com.anythink.core.common.m.q
            public final void onLoadCanceled(int i9) {
                synchronized (s.this) {
                    s.this.f16253e.remove(bdVar.f13615a);
                }
            }

            @Override // com.anythink.core.common.m.q
            public final void onLoadError(int i9, String str, AdError adError) {
                bdVar.a();
                synchronized (s.this) {
                    try {
                        s.this.f16253e.remove(bdVar.f13615a);
                        if (!z3) {
                            s.this.b(bdVar);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }

            @Override // com.anythink.core.common.m.q
            public final void onLoadFinish(int i9, Object obj) {
                bdVar.a();
                synchronized (s.this) {
                    try {
                        s.this.f16253e.remove(bdVar.f13615a);
                        if (z3) {
                            s.this.a(bdVar);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }

            @Override // com.anythink.core.common.m.q
            public final void onLoadStart(int i9) {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(bd bdVar) {
        try {
            bdVar.a();
            Map<String, bd> map = this.f16251c;
            if (map != null) {
                map.remove(bdVar.f13615a);
            }
            List<bd> list = this.f16252d;
            if (list != null) {
                list.remove(bdVar);
            }
            com.anythink.core.common.e.m.a(com.anythink.core.common.e.e.a(com.anythink.core.common.d.t.b().g())).b(bdVar);
        } catch (Throwable th) {
            throw th;
        }
    }
}
