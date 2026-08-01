package com.anythink.expressad.video.dynview.i;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.anythink.core.common.v.m;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.foundation.h.k;
import java.util.List;

/* loaded from: classes.dex */
public final class c {
    private static boolean a(List<d> list) {
        d dVar;
        if (list == null || list.size() <= 0 || (dVar = list.get(0)) == null) {
            return false;
        }
        return dVar.j();
    }

    private static int b(d dVar) {
        if (dVar == null || dVar.N() == null) {
            return 1;
        }
        return dVar.N().c();
    }

    private static void a(d dVar, Activity activity) {
        if (dVar == null || dVar.N() == null) {
            return;
        }
        int c9 = dVar.N().c();
        if (activity == null || activity.isFinishing()) {
            return;
        }
        if (c9 == 1) {
            activity.setRequestedOrientation(7);
            return;
        }
        if (c9 != 2) {
            if (a((Context) activity)) {
                activity.setRequestedOrientation(6);
                return;
            } else {
                activity.setRequestedOrientation(7);
                return;
            }
        }
        activity.setRequestedOrientation(6);
    }

    private static void a(Activity activity) {
        if (a((Context) activity)) {
            activity.setRequestedOrientation(6);
        } else {
            activity.setRequestedOrientation(7);
        }
    }

    public static boolean a(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private static String a(long j6, Context context) {
        String e9 = m.e(context);
        if (!e9.startsWith(com.anythink.expressad.video.dynview.a.a.f21096S) && !e9.startsWith(com.anythink.expressad.video.dynview.a.a.f21097T)) {
            if (e9.startsWith(com.anythink.expressad.video.dynview.a.a.f21098U)) {
                return com.anythink.expressad.video.dynview.a.a.f21087I + j6 + " Sekunden";
            }
            if (e9.startsWith(com.anythink.expressad.video.dynview.a.a.f21099V)) {
                return j6 + com.anythink.expressad.video.dynview.a.a.J;
            }
            if (e9.startsWith(com.anythink.expressad.video.dynview.a.a.f21100W)) {
                return com.anythink.expressad.video.dynview.a.a.f21088K + j6 + " secondes";
            }
            if (e9.startsWith(com.anythink.expressad.video.dynview.a.a.f21101X)) {
                return " ثوان" + j6 + com.anythink.expressad.video.dynview.a.a.f21089L;
            }
            if (e9.startsWith(com.anythink.expressad.video.dynview.a.a.Y)) {
                return com.anythink.expressad.video.dynview.a.a.f21090M + j6 + " секунд";
            }
            return com.anythink.expressad.video.dynview.a.a.f21086H + j6 + " s";
        }
        return j6 + " " + context.getString(k.a(context, "anythink_cm_video_auto_play_after", k.f19636g));
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                String queryParameter = parse.getQueryParameter("alecfc");
                if (!TextUtils.isEmpty(queryParameter)) {
                    if (queryParameter.equals("1")) {
                        return true;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static String a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                String queryParameter = parse.getQueryParameter(str2);
                if (!TextUtils.isEmpty(queryParameter)) {
                    return queryParameter;
                }
            }
            return "";
        } catch (Exception e9) {
            if (com.anythink.expressad.a.f17618a) {
                e9.printStackTrace();
            }
            return "";
        }
    }

    public static int a(d dVar) {
        if (dVar == null || dVar.N() == null) {
            return 100;
        }
        int b9 = dVar.N().b();
        if (b9 != 302 && b9 != 802 && b9 != 902) {
            if (b9 != 904) {
                return 100;
            }
            if (!a(dVar.N().e())) {
                return -1;
            }
        }
        return -3;
    }
}
