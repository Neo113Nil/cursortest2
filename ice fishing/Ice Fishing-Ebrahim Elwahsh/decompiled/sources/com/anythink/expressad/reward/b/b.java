package com.anythink.expressad.reward.b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.reward.b.a;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class b extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private final String f20550a;

    /* renamed from: b, reason: collision with root package name */
    private final a f20551b;

    public b(a aVar) {
        super(Looper.getMainLooper());
        this.f20550a = "b";
        this.f20551b = aVar;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        int i = message.what;
        Object obj = message.obj;
        CopyOnWriteArrayList<d> j9 = this.f20551b.j();
        List<d> k6 = this.f20551b.k();
        com.anythink.expressad.reward.a.d l9 = this.f20551b.l();
        boolean c4 = this.f20551b.c();
        String e6 = this.f20551b.e();
        String d2 = this.f20551b.d();
        a.c i4 = this.f20551b.i();
        com.anythink.expressad.videocommon.d.a h9 = this.f20551b.h();
        this.f20551b.g();
        this.f20551b.f();
        com.anythink.expressad.videocommon.e.d b9 = this.f20551b.b();
        if (i == 8) {
            if (j9 == null || j9.size() <= 0) {
                return;
            }
            boolean z8 = (k6 == null || k6.size() <= 0) ? false : !TextUtils.isEmpty(k6.get(0).at());
            int ar = j9.get(0).ar();
            if (l9 != null && l9.a(j9, z8, ar)) {
                if (i4 == null || !c4) {
                    return;
                }
                i4.a(e6, d2);
                return;
            }
            if (i4 == null || !c4) {
                return;
            }
            com.anythink.expressad.videocommon.a.c(d2);
            com.anythink.expressad.videocommon.a.b();
            i4.a("load timeout");
            return;
        }
        if (i == 9) {
            if (h9 == null || !c4) {
                return;
            }
            try {
                h9.b();
                return;
            } catch (Throwable th) {
                if (com.anythink.expressad.a.f17776a) {
                    th.printStackTrace();
                    return;
                }
                return;
            }
        }
        if (i != 1001002) {
            switch (i) {
                case 16:
                case 18:
                    if (h9 != null && c4) {
                        String obj2 = obj instanceof String ? obj.toString() : "";
                        com.anythink.expressad.videocommon.a.c(d2);
                        com.anythink.expressad.videocommon.a.b();
                        try {
                            h9.a(obj2);
                            break;
                        } catch (Throwable th2) {
                            if (com.anythink.expressad.a.f17776a) {
                                th2.printStackTrace();
                                return;
                            }
                            return;
                        }
                    }
                    break;
            }
            return;
        }
        if (b9 != null) {
            b9.S();
        }
        if (l9 != null) {
            if (l9.c()) {
                if (i4 != null) {
                    try {
                        CopyOnWriteArrayList<d> f6 = l9.f();
                        if (f6 != null) {
                            f6.size();
                        }
                    } catch (Throwable th3) {
                        th3.getMessage();
                    }
                    i4.b(e6, d2);
                    return;
                }
                return;
            }
            if (!l9.f(false)) {
                if (l9.f(true)) {
                    if (!l9.c()) {
                        l9.e(true);
                        return;
                    }
                    if (i4 != null) {
                        l9.d(true);
                        try {
                            CopyOnWriteArrayList<d> f9 = l9.f();
                            if (f9 != null) {
                                f9.size();
                            }
                        } catch (Throwable th4) {
                            th4.getMessage();
                        }
                        i4.b(e6, d2);
                        return;
                    }
                    return;
                }
                return;
            }
            if (l9.c()) {
                if (i4 != null) {
                    l9.d(false);
                    try {
                        CopyOnWriteArrayList<d> f10 = l9.f();
                        if (f10 != null) {
                            f10.size();
                        }
                    } catch (Throwable th5) {
                        th5.getMessage();
                    }
                    i4.b(e6, d2);
                    return;
                }
                return;
            }
            l9.e(false);
            if (l9.f(true)) {
                if (!l9.c()) {
                    l9.e(true);
                    return;
                }
                if (i4 != null) {
                    l9.d(true);
                    try {
                        CopyOnWriteArrayList<d> f11 = l9.f();
                        if (f11 != null) {
                            f11.size();
                        }
                    } catch (Throwable th6) {
                        th6.getMessage();
                    }
                    i4.b(e6, d2);
                }
            }
        }
    }
}
