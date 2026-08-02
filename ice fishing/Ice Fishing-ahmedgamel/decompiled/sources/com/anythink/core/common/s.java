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
    public static final String f17036a = "s";

    /* renamed from: b, reason: collision with root package name */
    private static volatile s f17037b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, bd> f17038c;

    /* renamed from: d, reason: collision with root package name */
    private List<bd> f17039d;

    /* renamed from: f, reason: collision with root package name */
    private final int f17041f = 5;

    /* renamed from: g, reason: collision with root package name */
    private final int f17042g = 500;

    /* renamed from: e, reason: collision with root package name */
    private List<String> f17040e = Collections.synchronizedList(new ArrayList(8));

    private s() {
    }

    public static boolean a(int i) {
        boolean z6;
        switch (i) {
            case com.anythink.core.common.m.o.f15480d /* -1003 */:
            case com.anythink.core.common.m.o.f15479c /* -1002 */:
            case com.anythink.core.common.m.o.f15478b /* -1001 */:
            case -1000:
                z6 = true;
                break;
            default:
                z6 = false;
                break;
        }
        if (z6 || ((i < -99 || i >= 200) && i < 400)) {
            return z6;
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
                if (this.f17038c == null && this.f17039d == null) {
                    m.a a9 = com.anythink.core.common.e.m.a(com.anythink.core.common.e.e.a(com.anythink.core.common.d.t.b().g())).a();
                    this.f17038c = a9.f13830b;
                    this.f17039d = a9.f13829a;
                }
            } finally {
                if (this.f17038c == null) {
                }
                if (this.f17039d == null) {
                }
            }
            if (this.f17038c == null) {
                this.f17038c = new ConcurrentHashMap();
            }
            if (this.f17039d == null) {
                this.f17039d = Collections.synchronizedList(new ArrayList());
            }
        } catch (Throwable th) {
        }
    }

    public final synchronized void b() {
        try {
            c();
            List<bd> synchronizedList = this.f17039d != null ? Collections.synchronizedList(new ArrayList(this.f17039d)) : null;
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
        if (f17037b == null) {
            synchronized (s.class) {
                try {
                    if (f17037b == null) {
                        f17037b = new s();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f17037b;
    }

    public final synchronized void a(String str, String str2, long j6) {
        bd bdVar = new bd();
        bdVar.f14402b = 2;
        bdVar.f14404d = str;
        bdVar.f14403c = str2;
        bdVar.f14406f = j6;
        bdVar.a();
        a(bdVar, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b(bd bdVar) {
        try {
            if (TextUtils.isEmpty(bdVar.f14401a) && this.f17038c != null && this.f17039d != null) {
                bdVar.f14405e = System.currentTimeMillis();
                String a9 = com.anythink.core.common.v.o.a(bdVar.f14404d + bdVar.f14405e);
                bdVar.f14401a = a9;
                this.f17038c.put(a9, bdVar);
                this.f17039d.add(bdVar);
            }
            bdVar.a();
            com.anythink.core.common.e.m.a(com.anythink.core.common.e.e.a(com.anythink.core.common.d.t.b().g())).a(bdVar);
            List<bd> list = this.f17039d;
            if (list != null && list.size() > 500) {
                bd bdVar2 = this.f17039d.get(0);
                bdVar.a();
                this.f17040e.remove(bdVar.f14401a);
                a(bdVar2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void a(final bd bdVar, final boolean z6) {
        if (System.currentTimeMillis() > bdVar.f14406f) {
            bdVar.a();
            this.f17040e.remove(bdVar.f14401a);
            if (z6) {
                a(bdVar);
            }
            return;
        }
        if (this.f17040e.contains(bdVar.f14401a)) {
            bdVar.a();
            return;
        }
        this.f17040e.add(bdVar.f14401a);
        if (z6) {
            int i = bdVar.f14407g + 1;
            bdVar.f14407g = i;
            if (i >= 5) {
                bdVar.a();
                a(bdVar);
            } else {
                b(bdVar);
            }
        } else {
            int i4 = bdVar.f14407g + 1;
            bdVar.f14407g = i4;
            if (i4 >= 5) {
                bdVar.a();
                this.f17040e.remove(bdVar.f14401a);
                return;
            }
        }
        bdVar.a();
        new com.anythink.core.common.m.t(bdVar).a(0, new com.anythink.core.common.m.q() { // from class: com.anythink.core.common.s.1
            @Override // com.anythink.core.common.m.q
            public final void onLoadCanceled(int i6) {
                synchronized (s.this) {
                    s.this.f17040e.remove(bdVar.f14401a);
                }
            }

            @Override // com.anythink.core.common.m.q
            public final void onLoadError(int i6, String str, AdError adError) {
                bdVar.a();
                synchronized (s.this) {
                    try {
                        s.this.f17040e.remove(bdVar.f14401a);
                        if (!z6) {
                            s.this.b(bdVar);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }

            @Override // com.anythink.core.common.m.q
            public final void onLoadFinish(int i6, Object obj) {
                bdVar.a();
                synchronized (s.this) {
                    try {
                        s.this.f17040e.remove(bdVar.f14401a);
                        if (z6) {
                            s.this.a(bdVar);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }

            @Override // com.anythink.core.common.m.q
            public final void onLoadStart(int i6) {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(bd bdVar) {
        try {
            bdVar.a();
            Map<String, bd> map = this.f17038c;
            if (map != null) {
                map.remove(bdVar.f14401a);
            }
            List<bd> list = this.f17039d;
            if (list != null) {
                list.remove(bdVar);
            }
            com.anythink.core.common.e.m.a(com.anythink.core.common.e.e.a(com.anythink.core.common.d.t.b().g())).b(bdVar);
        } catch (Throwable th) {
            throw th;
        }
    }
}
