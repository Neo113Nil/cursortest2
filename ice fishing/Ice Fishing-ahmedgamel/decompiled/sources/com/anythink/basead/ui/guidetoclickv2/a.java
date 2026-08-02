package com.anythink.basead.ui.guidetoclickv2;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout;
import com.anythink.basead.b.e;
import com.anythink.basead.g.f;
import com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View;
import com.anythink.basead.ui.guidetoclickv2.b;
import com.anythink.basead.ui.improveclick.c;
import com.anythink.basead.ui.improveclick.g;
import com.anythink.core.common.a.b;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.h.y;
import com.anythink.core.common.v.m;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    Queue<b> f11791a;

    /* renamed from: b, reason: collision with root package name */
    Map<String, Object> f11792b;

    /* renamed from: c, reason: collision with root package name */
    BaseG2CV2View.b f11793c = new BaseG2CV2View.b() { // from class: com.anythink.basead.ui.guidetoclickv2.a.1
        @Override // com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View.b
        public final void a() {
            a.this.f();
        }

        @Override // com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View.b
        public final void b() {
            Object obj;
            Map<String, Object> map = a.this.f11792b;
            if (map != null && (obj = map.get(g.a.f11954c)) != null && (obj instanceof f)) {
                ((f) obj).onATImproveClickViewRenderFail(2);
            }
            a.this.c();
        }
    };

    /* renamed from: d, reason: collision with root package name */
    private Context f11794d;

    /* renamed from: e, reason: collision with root package name */
    private w f11795e;

    /* renamed from: f, reason: collision with root package name */
    private x f11796f;

    /* renamed from: g, reason: collision with root package name */
    private RelativeLayout f11797g;

    /* renamed from: h, reason: collision with root package name */
    private int f11798h;
    private View i;

    /* renamed from: j, reason: collision with root package name */
    private b f11799j;

    /* renamed from: k, reason: collision with root package name */
    private c.a f11800k;

    /* renamed from: com.anythink.basead.ui.guidetoclickv2.a$a, reason: collision with other inner class name */
    public static class C0060a {

        /* renamed from: a, reason: collision with root package name */
        public static int f11802a = 180;

        /* renamed from: b, reason: collision with root package name */
        public static int f11803b = 50;
    }

    public a(Context context, w wVar, x xVar, int i, RelativeLayout relativeLayout, View view, c.a aVar) {
        this.f11794d = context;
        this.f11795e = wVar;
        this.f11796f = xVar;
        this.f11798h = i;
        this.f11797g = relativeLayout;
        this.i = view;
        this.f11800k = aVar;
        d();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0057, code lost:
    
        if (r9 != 3) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0059, code lost:
    
        if (r12 != 1) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b8, code lost:
    
        if (r2 != 3) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00e4, code lost:
    
        if (com.anythink.core.common.v.g.a().b(com.anythink.core.common.a.b.d.i) == false) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void d() {
        this.f11791a = new ConcurrentLinkedQueue();
        y yVar = this.f11796f.f14954o;
        int C8 = this.f11798h == 3 ? yVar.C() : m.f(this.f11794d);
        long av = yVar.av();
        String aw = yVar.aw();
        if (TextUtils.isEmpty(aw)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(aw);
            if (jSONArray.length() > 0) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    int optInt = optJSONObject.optInt("cgf_type", -1);
                    boolean z6 = true;
                    switch (optInt) {
                        case 1:
                        case 6:
                        case 7:
                        case 11:
                        case 12:
                            if (optInt == 6) {
                                break;
                            }
                            z6 = false;
                            break;
                        case 2:
                            if (!e.a(this.f11795e, this.f11796f)) {
                                int i4 = this.f11798h;
                                if (i4 != 1) {
                                    if (i4 == 3) {
                                    }
                                }
                                z6 = false;
                                break;
                            }
                            break;
                        case 3:
                            int i6 = this.f11798h;
                            if (i6 != 1) {
                                if (i6 == 3) {
                                }
                            }
                            z6 = false;
                            break;
                        case 4:
                        case 5:
                            int i9 = this.f11798h;
                            if (i9 != 1) {
                                if (i9 != 2) {
                                }
                            }
                            if (this.i == null) {
                                break;
                            }
                            z6 = false;
                            break;
                        case 8:
                        case 9:
                        case 10:
                            boolean z9 = (this.f11796f.f14949j == 1 && C8 == 1) ? false : true;
                            if (!z9) {
                                if (optInt == 9 && !com.anythink.core.common.v.g.a().b(b.d.f12907f)) {
                                    z9 = true;
                                }
                                if ((optInt == 8 || optInt == 10) && !com.anythink.core.common.v.g.a().b(b.d.f12911k)) {
                                    z9 = true;
                                }
                                if (optInt == 10 && !com.anythink.core.common.v.g.a().b(b.d.f12912l)) {
                                    z9 = true;
                                }
                                if (optInt == 8 && !com.anythink.core.common.v.g.a().b(b.d.f12913m)) {
                                    break;
                                }
                            }
                            z6 = z9;
                            break;
                        case 13:
                            int i10 = this.f11796f.f14949j;
                            if (i10 != 4) {
                            }
                            break;
                    }
                    if (!z6) {
                        long optLong = optJSONObject.optLong("cgf_st", -1L);
                        if (optInt > 0 && optLong >= 0) {
                            this.f11791a.add(new b(this.f11794d, this.f11795e, this.f11796f, this.f11798h, new b.a(i + 1, optInt, av, optLong, yVar.ax(), C8), this.f11797g, this.i, this.f11800k, this.f11793c));
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    private void e() {
        b bVar = this.f11799j;
        if (bVar != null) {
            bVar.a();
        } else {
            f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        g();
        if (this.f11791a.size() > 0) {
            this.f11799j = this.f11791a.poll();
            e();
        }
    }

    private void g() {
        b bVar = this.f11799j;
        if (bVar != null) {
            bVar.c();
            this.f11799j = null;
        }
    }

    public final void b() {
        b bVar = this.f11799j;
        if (bVar != null) {
            bVar.b();
        }
    }

    public final void c() {
        b bVar = this.f11799j;
        if (bVar != null) {
            bVar.b();
        }
        g();
        Queue<b> queue = this.f11791a;
        if (queue != null) {
            queue.clear();
        }
    }

    public final void a() {
        e();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:59:0x008c A[ADDED_TO_REGION, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x008c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean a(int i, int i4) {
        int i6;
        switch (i) {
            case 1:
            case 6:
            case 7:
            case 11:
            case 12:
                return i == 6 && !com.anythink.core.common.v.g.a().b(b.d.i);
            case 2:
                return e.a(this.f11795e, this.f11796f) || !((i6 = this.f11798h) == 1 || i6 == 3);
            case 3:
                int i9 = this.f11798h;
                if (i9 == 1 || i9 == 3) {
                    return false;
                }
            case 4:
            case 5:
                int i10 = this.f11798h;
                return !(i10 == 1 || i10 == 2 || i10 == 3) || this.i == null;
            case 8:
            case 9:
            case 10:
                boolean z6 = (this.f11796f.f14949j == 1 && i4 == 1) ? false : true;
                if (!z6) {
                    if (i == 9 && !com.anythink.core.common.v.g.a().b(b.d.f12907f)) {
                        z6 = true;
                    }
                    if ((i == 8 || i == 10) && !com.anythink.core.common.v.g.a().b(b.d.f12911k)) {
                        z6 = true;
                    }
                    if (i == 10 && !com.anythink.core.common.v.g.a().b(b.d.f12912l)) {
                        z6 = true;
                    }
                    if (i == 8 && !com.anythink.core.common.v.g.a().b(b.d.f12913m)) {
                        return true;
                    }
                }
                return z6;
            case 13:
                int i11 = this.f11796f.f14949j;
                if ((i11 == 4 || i11 == 3) && i4 == 1) {
                    return false;
                }
        }
    }

    public final void a(Map<String, Object> map) {
        this.f11792b = map;
    }
}
