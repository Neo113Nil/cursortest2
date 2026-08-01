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
    private final String f20392a;

    /* renamed from: b, reason: collision with root package name */
    private final a f20393b;

    public b(a aVar) {
        super(Looper.getMainLooper());
        this.f20392a = "b";
        this.f20393b = aVar;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        int i = message.what;
        Object obj = message.obj;
        CopyOnWriteArrayList<d> j6 = this.f20393b.j();
        List<d> k9 = this.f20393b.k();
        com.anythink.expressad.reward.a.d l9 = this.f20393b.l();
        boolean c9 = this.f20393b.c();
        String e9 = this.f20393b.e();
        String d2 = this.f20393b.d();
        a.c i6 = this.f20393b.i();
        com.anythink.expressad.videocommon.d.a h9 = this.f20393b.h();
        this.f20393b.g();
        this.f20393b.f();
        com.anythink.expressad.videocommon.e.d b9 = this.f20393b.b();
        if (i == 8) {
            if (j6 == null || j6.size() <= 0) {
                return;
            }
            boolean z3 = (k9 == null || k9.size() <= 0) ? false : !TextUtils.isEmpty(k9.get(0).at());
            int ar = j6.get(0).ar();
            if (l9 != null && l9.a(j6, z3, ar)) {
                if (i6 == null || !c9) {
                    return;
                }
                i6.a(e9, d2);
                return;
            }
            if (i6 == null || !c9) {
                return;
            }
            com.anythink.expressad.videocommon.a.c(d2);
            com.anythink.expressad.videocommon.a.b();
            i6.a("load timeout");
            return;
        }
        if (i == 9) {
            if (h9 == null || !c9) {
                return;
            }
            try {
                h9.b();
                return;
            } catch (Throwable th) {
                if (com.anythink.expressad.a.f17618a) {
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
                    if (h9 != null && c9) {
                        String obj2 = obj instanceof String ? obj.toString() : "";
                        com.anythink.expressad.videocommon.a.c(d2);
                        com.anythink.expressad.videocommon.a.b();
                        try {
                            h9.a(obj2);
                            break;
                        } catch (Throwable th2) {
                            if (com.anythink.expressad.a.f17618a) {
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
                if (i6 != null) {
                    try {
                        CopyOnWriteArrayList<d> f3 = l9.f();
                        if (f3 != null) {
                            f3.size();
                        }
                    } catch (Throwable th3) {
                        th3.getMessage();
                    }
                    i6.b(e9, d2);
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
                    if (i6 != null) {
                        l9.d(true);
                        try {
                            CopyOnWriteArrayList<d> f9 = l9.f();
                            if (f9 != null) {
                                f9.size();
                            }
                        } catch (Throwable th4) {
                            th4.getMessage();
                        }
                        i6.b(e9, d2);
                        return;
                    }
                    return;
                }
                return;
            }
            if (l9.c()) {
                if (i6 != null) {
                    l9.d(false);
                    try {
                        CopyOnWriteArrayList<d> f10 = l9.f();
                        if (f10 != null) {
                            f10.size();
                        }
                    } catch (Throwable th5) {
                        th5.getMessage();
                    }
                    i6.b(e9, d2);
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
                if (i6 != null) {
                    l9.d(true);
                    try {
                        CopyOnWriteArrayList<d> f11 = l9.f();
                        if (f11 != null) {
                            f11.size();
                        }
                    } catch (Throwable th6) {
                        th6.getMessage();
                    }
                    i6.b(e9, d2);
                }
            }
        }
    }
}
