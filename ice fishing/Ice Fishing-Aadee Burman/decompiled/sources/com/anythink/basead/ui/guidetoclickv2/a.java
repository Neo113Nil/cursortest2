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
    Queue<b> f11005a;

    /* renamed from: b, reason: collision with root package name */
    Map<String, Object> f11006b;

    /* renamed from: c, reason: collision with root package name */
    BaseG2CV2View.b f11007c = new BaseG2CV2View.b() { // from class: com.anythink.basead.ui.guidetoclickv2.a.1
        @Override // com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View.b
        public final void a() {
            a.this.f();
        }

        @Override // com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View.b
        public final void b() {
            Object obj;
            Map<String, Object> map = a.this.f11006b;
            if (map != null && (obj = map.get(g.a.f11168c)) != null && (obj instanceof f)) {
                ((f) obj).onATImproveClickViewRenderFail(2);
            }
            a.this.c();
        }
    };

    /* renamed from: d, reason: collision with root package name */
    private Context f11008d;

    /* renamed from: e, reason: collision with root package name */
    private w f11009e;

    /* renamed from: f, reason: collision with root package name */
    private x f11010f;

    /* renamed from: g, reason: collision with root package name */
    private RelativeLayout f11011g;

    /* renamed from: h, reason: collision with root package name */
    private int f11012h;
    private View i;

    /* renamed from: j, reason: collision with root package name */
    private b f11013j;

    /* renamed from: k, reason: collision with root package name */
    private c.a f11014k;

    /* renamed from: com.anythink.basead.ui.guidetoclickv2.a$a, reason: collision with other inner class name */
    public static class C0060a {

        /* renamed from: a, reason: collision with root package name */
        public static int f11016a = 180;

        /* renamed from: b, reason: collision with root package name */
        public static int f11017b = 50;
    }

    public a(Context context, w wVar, x xVar, int i, RelativeLayout relativeLayout, View view, c.a aVar) {
        this.f11008d = context;
        this.f11009e = wVar;
        this.f11010f = xVar;
        this.f11012h = i;
        this.f11011g = relativeLayout;
        this.i = view;
        this.f11014k = aVar;
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
        this.f11005a = new ConcurrentLinkedQueue();
        y yVar = this.f11010f.f14168o;
        int C8 = this.f11012h == 3 ? yVar.C() : m.f(this.f11008d);
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
                    boolean z3 = true;
                    switch (optInt) {
                        case 1:
                        case 6:
                        case 7:
                        case 11:
                        case 12:
                            if (optInt == 6) {
                                break;
                            }
                            z3 = false;
                            break;
                        case 2:
                            if (!e.a(this.f11009e, this.f11010f)) {
                                int i6 = this.f11012h;
                                if (i6 != 1) {
                                    if (i6 == 3) {
                                    }
                                }
                                z3 = false;
                                break;
                            }
                            break;
                        case 3:
                            int i9 = this.f11012h;
                            if (i9 != 1) {
                                if (i9 == 3) {
                                }
                            }
                            z3 = false;
                            break;
                        case 4:
                        case 5:
                            int i10 = this.f11012h;
                            if (i10 != 1) {
                                if (i10 != 2) {
                                }
                            }
                            if (this.i == null) {
                                break;
                            }
                            z3 = false;
                            break;
                        case 8:
                        case 9:
                        case 10:
                            boolean z6 = (this.f11010f.f14163j == 1 && C8 == 1) ? false : true;
                            if (!z6) {
                                if (optInt == 9 && !com.anythink.core.common.v.g.a().b(b.d.f12121f)) {
                                    z6 = true;
                                }
                                if ((optInt == 8 || optInt == 10) && !com.anythink.core.common.v.g.a().b(b.d.f12125k)) {
                                    z6 = true;
                                }
                                if (optInt == 10 && !com.anythink.core.common.v.g.a().b(b.d.f12126l)) {
                                    z6 = true;
                                }
                                if (optInt == 8 && !com.anythink.core.common.v.g.a().b(b.d.f12127m)) {
                                    break;
                                }
                            }
                            z3 = z6;
                            break;
                        case 13:
                            int i11 = this.f11010f.f14163j;
                            if (i11 != 4) {
                            }
                            break;
                    }
                    if (!z3) {
                        long optLong = optJSONObject.optLong("cgf_st", -1L);
                        if (optInt > 0 && optLong >= 0) {
                            this.f11005a.add(new b(this.f11008d, this.f11009e, this.f11010f, this.f11012h, new b.a(i + 1, optInt, av, optLong, yVar.ax(), C8), this.f11011g, this.i, this.f11014k, this.f11007c));
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    private void e() {
        b bVar = this.f11013j;
        if (bVar != null) {
            bVar.a();
        } else {
            f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        g();
        if (this.f11005a.size() > 0) {
            this.f11013j = this.f11005a.poll();
            e();
        }
    }

    private void g() {
        b bVar = this.f11013j;
        if (bVar != null) {
            bVar.c();
            this.f11013j = null;
        }
    }

    public final void b() {
        b bVar = this.f11013j;
        if (bVar != null) {
            bVar.b();
        }
    }

    public final void c() {
        b bVar = this.f11013j;
        if (bVar != null) {
            bVar.b();
        }
        g();
        Queue<b> queue = this.f11005a;
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
    private boolean a(int i, int i6) {
        int i9;
        switch (i) {
            case 1:
            case 6:
            case 7:
            case 11:
            case 12:
                return i == 6 && !com.anythink.core.common.v.g.a().b(b.d.i);
            case 2:
                return e.a(this.f11009e, this.f11010f) || !((i9 = this.f11012h) == 1 || i9 == 3);
            case 3:
                int i10 = this.f11012h;
                if (i10 == 1 || i10 == 3) {
                    return false;
                }
            case 4:
            case 5:
                int i11 = this.f11012h;
                return !(i11 == 1 || i11 == 2 || i11 == 3) || this.i == null;
            case 8:
            case 9:
            case 10:
                boolean z3 = (this.f11010f.f14163j == 1 && i6 == 1) ? false : true;
                if (!z3) {
                    if (i == 9 && !com.anythink.core.common.v.g.a().b(b.d.f12121f)) {
                        z3 = true;
                    }
                    if ((i == 8 || i == 10) && !com.anythink.core.common.v.g.a().b(b.d.f12125k)) {
                        z3 = true;
                    }
                    if (i == 10 && !com.anythink.core.common.v.g.a().b(b.d.f12126l)) {
                        z3 = true;
                    }
                    if (i == 8 && !com.anythink.core.common.v.g.a().b(b.d.f12127m)) {
                        return true;
                    }
                }
                return z3;
            case 13:
                int i12 = this.f11010f.f14163j;
                if ((i12 == 4 || i12 == 3) && i6 == 1) {
                    return false;
                }
        }
    }

    public final void a(Map<String, Object> map) {
        this.f11006b = map;
    }
}
