package com.anythink.core.common;

import D.y;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.core.common.e.b;
import com.anythink.core.common.v.aa;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    public static final String f15984a = "MsgManager";

    /* renamed from: b, reason: collision with root package name */
    private static volatile q f15985b;

    /* renamed from: c, reason: collision with root package name */
    private Context f15986c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f15987d;

    private q(Context context) {
        if (context != null) {
            this.f15986c = context.getApplicationContext();
        }
        this.f15987d = false;
    }

    public static q a(Context context) {
        if (f15985b == null) {
            synchronized (q.class) {
                try {
                    if (f15985b == null) {
                        f15985b = new q(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f15985b;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x008a A[Catch: all -> 0x010c, TryCatch #1 {all -> 0x010c, blocks: (B:2:0x0000, B:7:0x001d, B:15:0x0036, B:18:0x008a, B:20:0x0090, B:26:0x0109, B:29:0x003b, B:32:0x0046, B:34:0x004c, B:35:0x0055, B:38:0x0060, B:40:0x0066, B:41:0x006f, B:44:0x007a, B:46:0x0080), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i, com.anythink.core.common.h.o oVar, com.anythink.core.d.b bVar) {
        String str;
        try {
            System.currentTimeMillis();
        } catch (Throwable unused) {
        }
        if (com.anythink.core.d.n.a(com.anythink.core.common.d.t.b().g()).a(oVar.f14033b.aI()) == null) {
            return;
        }
        String M8 = ((com.anythink.core.common.h.n) oVar.f14033b).M();
        if (TextUtils.isEmpty(M8)) {
            return;
        }
        if (i == 4) {
            r3 = ((com.anythink.core.common.h.n) oVar.f14033b).H() == 1;
            Map<String, String> Y = bVar.Y();
            if (Y != null) {
                str = Y.get("show");
                if (r3) {
                }
                System.currentTimeMillis();
            }
            str = null;
            if (r3) {
            }
            System.currentTimeMillis();
        }
        if (i != 6) {
            switch (i) {
                case 18:
                case 19:
                case 20:
                    r3 = ((com.anythink.core.common.h.n) oVar.f14033b).l() == 1;
                    Map<String, String> Y7 = bVar.Y();
                    if (Y7 != null) {
                        str = Y7.get("dl");
                        break;
                    }
                default:
                    str = null;
                    break;
            }
            if (r3 && !TextUtils.isEmpty(str)) {
                JSONObject a9 = aa.a();
                a9.toString();
                oVar.a().toString();
                String jSONObject = a9.toString();
                String jSONObject2 = oVar.a().toString();
                com.anythink.core.common.h.n nVar = (com.anythink.core.common.h.n) oVar.f14033b;
                if (this.f15986c != null) {
                    try {
                        Intent intent = new Intent(str);
                        intent.putExtra(com.anythink.core.common.m.e.Y, jSONObject);
                        intent.putExtra("data", jSONObject2);
                        intent.putExtra("adsourceId", M8);
                        intent.putExtra("networkType", String.valueOf(nVar.Y()));
                        intent.putExtra("format", nVar.aK());
                        intent.putExtra("showid", nVar.z());
                        intent.putExtra("tktype", i);
                        intent.putExtra(b.a.f12930f, com.anythink.core.common.d.l.a(nVar, (com.anythink.core.common.d.f) null).toString());
                        intent.setPackage(this.f15986c.getPackageName());
                        com.anythink.core.common.d.n.a(this.f15986c).a(intent);
                    } catch (Throwable unused2) {
                    }
                }
            }
            System.currentTimeMillis();
        }
        r3 = ((com.anythink.core.common.h.n) oVar.f14033b).I() == 1;
        Map<String, String> Y8 = bVar.Y();
        if (Y8 != null) {
            str = Y8.get("click");
            if (r3) {
                JSONObject a92 = aa.a();
                a92.toString();
                oVar.a().toString();
                String jSONObject3 = a92.toString();
                String jSONObject22 = oVar.a().toString();
                com.anythink.core.common.h.n nVar2 = (com.anythink.core.common.h.n) oVar.f14033b;
                if (this.f15986c != null) {
                }
            }
            System.currentTimeMillis();
        }
        str = null;
        if (r3) {
        }
        System.currentTimeMillis();
    }

    public final void a(final com.anythink.core.d.b bVar) {
        com.anythink.core.common.v.b.b.a().a(new Runnable() { // from class: com.anythink.core.common.q.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    if (q.this.f15986c == null) {
                        return;
                    }
                    String packageName = q.this.f15986c.getPackageName();
                    String str = "";
                    for (int i = 0; i < 2; i++) {
                        str = str + packageName;
                    }
                    String c9 = com.anythink.core.common.v.o.c(str);
                    Intent intent = new Intent(c9);
                    intent.putExtra(c9, bVar.T());
                    intent.putExtra("data", aa.a().toString());
                    intent.putExtra("denied", com.anythink.core.common.d.t.b().f());
                    intent.putExtra("tksw", bVar.r());
                    intent.setPackage(packageName);
                    com.anythink.core.common.d.n.a(q.this.f15986c).a(intent);
                    com.anythink.core.common.u.e.a(bVar.r());
                } catch (Throwable unused) {
                }
            }
        }, 1000L);
    }

    private void a(int i, String str, String str2, String str3, String str4, com.anythink.core.common.h.n nVar) {
        if (this.f15986c == null) {
            return;
        }
        try {
            Intent intent = new Intent(str);
            intent.putExtra(com.anythink.core.common.m.e.Y, str2);
            intent.putExtra("data", str3);
            intent.putExtra("adsourceId", str4);
            intent.putExtra("networkType", String.valueOf(nVar.Y()));
            intent.putExtra("format", nVar.aK());
            intent.putExtra("showid", nVar.z());
            intent.putExtra("tktype", i);
            intent.putExtra(b.a.f12930f, com.anythink.core.common.d.l.a(nVar, (com.anythink.core.common.d.f) null).toString());
            intent.setPackage(this.f15986c.getPackageName());
            com.anythink.core.common.d.n.a(this.f15986c).a(intent);
        } catch (Throwable unused) {
        }
    }

    public final void a(boolean z3) {
        this.f15987d = z3;
    }

    public final void a(com.anythink.core.common.h.w wVar, com.anythink.core.common.h.n nVar, int i) {
        String str;
        if (this.f15987d) {
            com.anythink.core.d.b g4 = y.g(y.h());
            if (i == 4) {
                Map<String, String> Y = g4.Y();
                if (Y != null) {
                    str = Y.get("show");
                }
                str = null;
            } else if (i != 6) {
                switch (i) {
                    case 18:
                    case 19:
                    case 20:
                        Map<String, String> Y7 = g4.Y();
                        if (Y7 != null) {
                            str = Y7.get("dl");
                            break;
                        }
                    default:
                        str = null;
                        break;
                }
            } else {
                Map<String, String> Y8 = g4.Y();
                if (Y8 != null) {
                    str = Y8.get("click");
                }
                str = null;
            }
            if (this.f15986c == null) {
                return;
            }
            if (str == null) {
                if (com.anythink.core.common.d.t.b().F()) {
                    Log.d(f15984a, "sendAdxTraminiInfo: fail with empty action,businessType is ".concat(String.valueOf(i)));
                    return;
                }
                return;
            }
            try {
                Intent intent = new Intent(str);
                intent.putExtra("tktype", i);
                com.anythink.core.common.d.l a9 = com.anythink.core.common.d.l.a(nVar, (com.anythink.core.common.d.f) null);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("info_string", a9.toString());
                jSONObject.put("info_result", wVar != null);
                if (wVar != null) {
                    jSONObject.put("ad_title", wVar.x());
                    jSONObject.put("ad_desc", wVar.y());
                    jSONObject.put("ad_image_url", wVar.A());
                    jSONObject.put("ad_video_url", wVar.E());
                    jSONObject.put("ad_click_url", wVar.H());
                    jSONObject.put("ad_package_name", wVar.I());
                }
                intent.putExtra("adx_extra_info", jSONObject.toString());
                intent.setPackage(this.f15986c.getPackageName());
                com.anythink.core.common.d.n.a(this.f15986c).a(intent);
            } catch (Throwable th) {
                if (com.anythink.core.common.d.t.b().F()) {
                    Log.d(f15984a, "sendAdxTraminiInfo: fail with throwable" + th.getMessage());
                }
            }
        }
    }
}
