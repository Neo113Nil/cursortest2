package a3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import e3.i;
import e3.n;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import m.s;
import s.q;
import s.q0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final v6.a f199a;

    /* renamed from: b, reason: collision with root package name */
    public static final q f200b;

    /* renamed from: c, reason: collision with root package name */
    public static Paint f201c;

    static {
        x4.f.y("TypefaceCompat static init");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            f199a = new h();
        } else if (i10 >= 29) {
            f199a = new g();
        } else if (i10 >= 28) {
            f199a = new f();
        } else {
            f199a = new e();
        }
        f200b = new q(16);
        f201c = null;
        Trace.endSection();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Typeface a(Context context, z2.d dVar, Resources resources, int i10, String str, int i11, int i12, s sVar, boolean z10) {
        Typeface t3;
        Typeface build;
        Font.Builder fontVariationSettings;
        Font build2;
        FontFamily build3;
        int i13 = 14;
        int i14 = -3;
        if (dVar instanceof z2.g) {
            z2.g gVar = (z2.g) dVar;
            String str2 = gVar.f9086d;
            t3 = null;
            int i15 = 1;
            boolean z11 = false;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            Object[] objArr5 = 0;
            if (TextUtils.isEmpty(str2) || (build = c(str2)) == null) {
                ArrayList arrayList = gVar.f9083a;
                if (arrayList.size() == 1) {
                    build = c(((e3.e) arrayList.get(0)).f2074e);
                } else {
                    if (Build.VERSION.SDK_INT >= 31) {
                        int i16 = 0;
                        while (true) {
                            if (i16 >= arrayList.size()) {
                                Typeface.CustomFallbackBuilder customFallbackBuilder = null;
                                int i17 = 0;
                                while (true) {
                                    if (i17 >= arrayList.size()) {
                                        break;
                                    }
                                    e3.e eVar = (e3.e) arrayList.get(i17);
                                    if (i17 == arrayList.size() - 1 && TextUtils.isEmpty(eVar.f2075f)) {
                                        customFallbackBuilder.setSystemFallback(eVar.f2074e);
                                        break;
                                    }
                                    String str3 = eVar.f2074e;
                                    String str4 = eVar.f2075f;
                                    Font d10 = d(c(str3));
                                    if (d10 == null) {
                                        Log.w("TypefaceCompat", "Unable identify the primary font for " + eVar.f2074e + ". Falling back to provider font.");
                                        break;
                                    }
                                    if (TextUtils.isEmpty(str4)) {
                                        try {
                                            a2.a.l();
                                            a2.a.s();
                                            fontVariationSettings = a1.c.c(d10).setFontVariationSettings(str4);
                                            build2 = fontVariationSettings.build();
                                            build3 = a2.a.g(build2).build();
                                        } catch (IOException unused) {
                                            Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                                        }
                                    } else {
                                        build3 = a2.a.g(d10).build();
                                    }
                                    if (customFallbackBuilder == null) {
                                        customFallbackBuilder = a2.a.c(build3);
                                    } else {
                                        customFallbackBuilder.addCustomFallback(build3);
                                    }
                                    i17++;
                                }
                                build = customFallbackBuilder.build();
                            } else {
                                if (c(((e3.e) arrayList.get(i16)).f2074e) == null) {
                                    break;
                                }
                                i16++;
                            }
                        }
                    }
                    build = null;
                }
            }
            if (build != null) {
                if (sVar != null) {
                    new Handler(Looper.getMainLooper()).post(new a1.d(i13, sVar, build));
                }
                f200b.b(b(resources, i10, str, i11, i12), build);
                return build;
            }
            Object[] objArr6 = !z10 ? sVar != null : gVar.f9085c != 0;
            int i18 = z10 ? gVar.f9084b : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            f8.c cVar = new f8.c(3, z11);
            cVar.f2340h = sVar;
            ArrayList arrayList2 = gVar.f9083a;
            a5.b bVar = new a5.b(1, handler);
            x4.e eVar2 = new x4.e(cVar, bVar);
            if (objArr6 != true) {
                String a6 = i.a(i12, arrayList2);
                Typeface typeface = (Typeface) i.f2086a.a(a6);
                if (typeface != null) {
                    bVar.execute(new dd.i(i15, cVar, typeface, objArr3 == true ? 1 : 0));
                    t3 = typeface;
                } else {
                    e3.g gVar2 = new e3.g(objArr2 == true ? 1 : 0, eVar2);
                    synchronized (i.f2088c) {
                        try {
                            q0 q0Var = i.f2089d;
                            ArrayList arrayList3 = (ArrayList) q0Var.get(a6);
                            if (arrayList3 != null) {
                                arrayList3.add(gVar2);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(gVar2);
                                q0Var.put(a6, arrayList4);
                                e3.f fVar = new e3.f(a6, context, arrayList2, i12, 1);
                                ThreadPoolExecutor threadPoolExecutor = i.f2087b;
                                e3.g gVar3 = new e3.g(i15, a6);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                n nVar = new n(objArr == true ? 1 : 0);
                                nVar.f2101h = fVar;
                                nVar.f2102i = gVar3;
                                nVar.f2103j = handler2;
                                threadPoolExecutor.execute(nVar);
                            }
                        } finally {
                        }
                    }
                }
            } else {
                if (arrayList2.size() > 1) {
                    throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
                }
                e3.e eVar3 = (e3.e) arrayList2.get(0);
                q qVar = i.f2086a;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj = new Object[]{eVar3}[0];
                Objects.requireNonNull(obj);
                arrayList5.add(obj);
                String a8 = i.a(i12, Collections.unmodifiableList(arrayList5));
                Typeface typeface2 = (Typeface) i.f2086a.a(a8);
                if (typeface2 != null) {
                    bVar.execute(new dd.i(i15, cVar, typeface2, objArr5 == true ? 1 : 0));
                    t3 = typeface2;
                } else if (i18 == -1) {
                    Object[] objArr7 = {eVar3};
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj2 = objArr7[0];
                    Objects.requireNonNull(obj2);
                    arrayList6.add(obj2);
                    e3.h b2 = i.b(a8, context, Collections.unmodifiableList(arrayList6), i12);
                    eVar2.h(b2);
                    t3 = b2.f2084a;
                } else {
                    try {
                        try {
                            try {
                                e3.h hVar = (e3.h) i.f2087b.submit(new e3.f(a8, context, eVar3, i12, 0)).get(i18, TimeUnit.MILLISECONDS);
                                eVar2.h(hVar);
                                t3 = hVar.f2084a;
                            } catch (InterruptedException e10) {
                                throw e10;
                            }
                        } catch (ExecutionException e11) {
                            throw new RuntimeException(e11);
                        } catch (TimeoutException unused2) {
                            throw new InterruptedException("timeout");
                        }
                    } catch (InterruptedException unused3) {
                        ((a5.b) eVar2.f8295h).execute(new e3.a(i14, (int) (objArr4 == true ? 1 : 0), eVar2.f8294g));
                    }
                }
            }
        } else {
            t3 = f199a.t(context, (z2.e) dVar, resources, i12);
            if (sVar != null) {
                if (t3 != null) {
                    new Handler(Looper.getMainLooper()).post(new a1.d(i13, sVar, t3));
                } else {
                    sVar.a(-3);
                }
            }
        }
        if (t3 != null) {
            f200b.b(b(resources, i10, str, i11, i12), t3);
        }
        return t3;
    }

    public static String b(Resources resources, int i10, String str, int i11, int i12) {
        return resources.getResourcePackageName(i10) + '-' + str + '-' + i11 + '-' + i10 + '-' + i12;
    }

    public static Typeface c(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface create = Typeface.create(str, 0);
            Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
            if (create != null && !create.equals(create2)) {
                return create;
            }
        }
        return null;
    }

    public static Font d(Typeface typeface) {
        PositionedGlyphs shapeTextRun;
        int glyphCount;
        Font font;
        if (f201c == null) {
            f201c = new Paint();
        }
        f201c.setTextSize(10.0f);
        f201c.setTypeface(typeface);
        shapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, f201c);
        glyphCount = shapeTextRun.glyphCount();
        if (glyphCount == 0) {
            return null;
        }
        font = shapeTextRun.getFont(0);
        return font;
    }
}
