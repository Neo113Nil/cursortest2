package com.anythink.expressad.video.dynview.i.a;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.foundation.h.h;
import com.anythink.expressad.foundation.h.s;
import com.anythink.expressad.video.dynview.c;
import com.anythink.expressad.video.dynview.g.a;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    private static volatile a f21999b;

    /* renamed from: a, reason: collision with root package name */
    private final String f22000a = "ChoiceOneDrawBitBg";

    /* renamed from: c, reason: collision with root package name */
    private View f22001c;

    /* renamed from: d, reason: collision with root package name */
    private Bitmap f22002d;

    /* renamed from: e, reason: collision with root package name */
    private Bitmap f22003e;

    private a() {
    }

    public final void b() {
        if (this.f22001c != null) {
            this.f22001c = null;
        }
        Bitmap bitmap = this.f22002d;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f22002d.recycle();
            this.f22002d = null;
        }
        Bitmap bitmap2 = this.f22003e;
        if (bitmap2 == null || bitmap2.isRecycled()) {
            return;
        }
        this.f22003e.recycle();
        this.f22003e = null;
    }

    public static a a() {
        a aVar;
        if (f21999b != null) {
            return f21999b;
        }
        synchronized (a.class) {
            try {
                if (f21999b == null) {
                    f21999b = new a();
                }
                aVar = f21999b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    public final void a(Map<String, Bitmap> map, c cVar, View view) {
        if (view == null || cVar == null || map == null || map.size() == 0 || map.size() < 2 || cVar.g() == null || cVar.g().size() < 2) {
            return;
        }
        this.f22001c = view;
        int e9 = cVar.e();
        float d9 = cVar.d();
        float c9 = cVar.c();
        try {
            List<d> g9 = cVar.g();
            String a9 = g9.get(0) != null ? s.a(g9.get(0).bm()) : "";
            String a10 = g9.get(1) != null ? s.a(g9.get(1).bm()) : "";
            Bitmap bitmap = null;
            Bitmap bitmap2 = (TextUtils.isEmpty(a9) || !map.containsKey(a9)) ? null : map.get(a9);
            if (!TextUtils.isEmpty(a10) && map.containsKey(a10)) {
                bitmap = map.get(a10);
            }
            if (bitmap2 == null || bitmap2.isRecycled() || bitmap == null || bitmap.isRecycled()) {
                return;
            }
            a(e9, d9, c9, bitmap2);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private synchronized void a(final int i, final float f2, final float f9, final Bitmap bitmap) {
        try {
            try {
                try {
                    com.anythink.expressad.foundation.g.i.a.b().execute(new Runnable() { // from class: com.anythink.expressad.video.dynview.i.a.a.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                Bitmap a9 = h.a(bitmap);
                                Bitmap a10 = h.a(bitmap);
                                final a.C0136a a11 = com.anythink.expressad.video.dynview.g.a.a();
                                a11.a(i).a(a9).b(a10);
                                if (i == 2) {
                                    float f10 = f2;
                                    float f11 = f9;
                                    if (f10 > f11) {
                                        a11.a(f10).b(f9);
                                    } else {
                                        a11.a(f11).b(f2);
                                    }
                                } else {
                                    a11.a(f2).b(f9);
                                }
                                if (a.this.f22001c != null) {
                                    a.this.f22001c.post(new Runnable() { // from class: com.anythink.expressad.video.dynview.i.a.a.1.1
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            if (a.this.f22001c != null) {
                                                a11.b();
                                                a.this.f22001c.setBackgroundDrawable(a11.b());
                                            }
                                        }
                                    });
                                }
                            } catch (Exception e9) {
                                e9.getMessage();
                            }
                        }
                    });
                } catch (Exception e9) {
                    e = e9;
                    e.getMessage();
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Exception e10) {
            e = e10;
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }
}
