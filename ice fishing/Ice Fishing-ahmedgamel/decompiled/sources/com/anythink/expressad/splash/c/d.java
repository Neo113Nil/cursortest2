package com.anythink.expressad.splash.c;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.IceFishing.LiveIceFishing.k;
import com.anythink.expressad.foundation.h.u;
import com.anythink.expressad.foundation.h.y;
import com.anythink.expressad.splash.c.g;
import com.anythink.expressad.splash.view.ATSplashView;
import java.io.File;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static String f21328a = "ResManager";

    /* renamed from: b, reason: collision with root package name */
    private static int f21329b = 1;

    public static void a(final ATSplashView aTSplashView, com.anythink.expressad.foundation.d.d dVar, final com.anythink.expressad.splash.view.a aVar) {
        k.m().a(dVar.bm(), new com.anythink.expressad.foundation.g.d.c() { // from class: com.anythink.expressad.splash.c.d.1
            @Override // com.anythink.expressad.foundation.g.d.c
            public final void a(Bitmap bitmap, String str) {
                com.anythink.expressad.splash.view.a aVar2 = com.anythink.expressad.splash.view.a.this;
                if (aVar2 != null) {
                    aVar2.a();
                }
                ATSplashView aTSplashView2 = aTSplashView;
                if (aTSplashView2 != null) {
                    aTSplashView2.setImageReady(true);
                }
            }

            @Override // com.anythink.expressad.foundation.g.d.c
            public final void a(String str, String str2) {
                com.anythink.expressad.splash.view.a aVar2 = com.anythink.expressad.splash.view.a.this;
                if (aVar2 != null) {
                    aVar2.b();
                }
                ATSplashView aTSplashView2 = aTSplashView;
                if (aTSplashView2 != null) {
                    aTSplashView2.setImageReady(false);
                }
            }
        });
        if (TextUtils.isEmpty(dVar.bl())) {
            return;
        }
        k.m().a(dVar.bl(), new com.anythink.expressad.foundation.g.d.c() { // from class: com.anythink.expressad.splash.c.d.2
            @Override // com.anythink.expressad.foundation.g.d.c
            public final void a(Bitmap bitmap, String str) {
            }

            @Override // com.anythink.expressad.foundation.g.d.c
            public final void a(String str, String str2) {
            }
        });
    }

    private static com.anythink.expressad.foundation.d.d b(com.anythink.expressad.foundation.d.d dVar) {
        if (!TextUtils.isEmpty(dVar.b()) || (!TextUtils.isEmpty(dVar.c()) && dVar.c().contains("<MBTPLMARK>"))) {
            dVar.a(true);
            dVar.b(false);
            return dVar;
        }
        dVar.a(false);
        dVar.b(true);
        return dVar;
    }

    private static void a(ATSplashView aTSplashView, String str, com.anythink.expressad.foundation.d.d dVar, String str2, String str3, boolean z6, int i, boolean z9) {
        g.c cVar = new g.c();
        cVar.c(str3);
        cVar.b(str2);
        cVar.a(dVar);
        cVar.a(str);
        cVar.b(z6);
        cVar.a(i);
        cVar.a(z9);
        g.a.f21391a.a(aTSplashView, cVar, null);
    }

    private static String a(String str) {
        try {
            File file = new File(str);
            if (file.exists()) {
                return "file:///" + file.getAbsolutePath();
            }
            return "";
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Exception e9) {
                e9.getMessage();
                return "";
            }
        }
    }

    public static boolean a(ATSplashView aTSplashView, com.anythink.expressad.foundation.d.d dVar) {
        if (aTSplashView == null) {
            return false;
        }
        boolean isVideoReady = !TextUtils.isEmpty(dVar.T()) ? aTSplashView.isVideoReady() : true;
        if (isVideoReady && !TextUtils.isEmpty(dVar.b())) {
            isVideoReady = aTSplashView.isH5Ready();
        }
        if (isVideoReady && TextUtils.isEmpty(dVar.b()) && !TextUtils.isEmpty(dVar.c())) {
            isVideoReady = aTSplashView.isH5Ready();
        }
        if (TextUtils.isEmpty(dVar.b()) && TextUtils.isEmpty(dVar.c())) {
            isVideoReady = false;
        }
        if (!dVar.j()) {
            return isVideoReady;
        }
        if (TextUtils.isEmpty(dVar.bm())) {
            return false;
        }
        return aTSplashView.isImageReady();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(com.anythink.expressad.foundation.d.d dVar) {
        boolean z6;
        Bitmap a9;
        if (!TextUtils.isEmpty(dVar.T())) {
            com.anythink.expressad.videocommon.b.a.a();
            String a10 = com.anythink.expressad.videocommon.b.a.a(dVar.T());
            if (y.a(a10) || new File(a10).length() <= 0) {
                z6 = false;
                if (z6 && TextUtils.isEmpty(dVar.b()) && TextUtils.isEmpty(dVar.c())) {
                    z6 = false;
                }
                return !dVar.j() ? (TextUtils.isEmpty(dVar.bm()) || (a9 = com.anythink.expressad.foundation.g.d.a.a(u.a(dVar.bm()))) == null || a9.isRecycled()) ? false : true : z6;
            }
        }
        z6 = true;
        if (z6) {
            z6 = false;
        }
        if (!dVar.j()) {
        }
    }
}
