package com.gamericefishpro.space.u3;

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
import com.gamericefishpro.space.c8.p;
import com.gamericefishpro.space.r5.s0;
import com.gamericefishpro.space.t.r0;
import com.gamericefishpro.space.tb.u;
import com.gamericefishpro.space.u6.l;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static final com.gamericefishpro.space.a.a a;
    public static final s0 b;
    public static Paint c;

    static {
        com.gamericefishpro.space.u6.f.k("TypefaceCompat static init");
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            a = new j();
        } else if (i >= 29) {
            a = new i();
        } else if (i >= 28) {
            a = new h();
        } else {
            a = new g();
        }
        b = new s0(16);
        c = null;
        Trace.endSection();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Typeface a(Context context, com.gamericefishpro.space.t3.d dVar, Resources resources, int i, String str, int i2, int i3, com.gamericefishpro.space.t3.b bVar, boolean z) {
        Typeface typefaceG;
        Typeface typefaceBuild;
        FontFamily fontFamilyBuild;
        int i4 = 12;
        int i5 = -3;
        if (dVar instanceof com.gamericefishpro.space.t3.g) {
            com.gamericefishpro.space.t3.g gVar = (com.gamericefishpro.space.t3.g) dVar;
            String str2 = gVar.d;
            typefaceG = null;
            int i6 = 1;
            boolean z2 = false;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            if (TextUtils.isEmpty(str2) || (typefaceBuild = c(str2)) == null) {
                ArrayList arrayList = gVar.a;
                if (arrayList.size() != 1) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        int i7 = 0;
                        while (true) {
                            if (i7 >= arrayList.size()) {
                                Typeface.CustomFallbackBuilder customFallbackBuilderB = null;
                                int i8 = 0;
                                while (true) {
                                    if (i8 < arrayList.size()) {
                                        com.gamericefishpro.space.z3.c cVar = (com.gamericefishpro.space.z3.c) arrayList.get(i8);
                                        if (i8 == arrayList.size() - 1 && TextUtils.isEmpty(cVar.f)) {
                                            customFallbackBuilderB.setSystemFallback(cVar.e);
                                        } else {
                                            String str3 = cVar.e;
                                            String str4 = cVar.f;
                                            Font fontD = d(c(str3));
                                            if (fontD == null) {
                                                Log.w("TypefaceCompat", "Unable identify the primary font for " + cVar.e + ". Falling back to provider font.");
                                            } else {
                                                if (TextUtils.isEmpty(str4)) {
                                                    try {
                                                        com.gamericefishpro.space.r1.f.h();
                                                        com.gamericefishpro.space.r1.f.w();
                                                        fontFamilyBuild = com.gamericefishpro.space.r1.f.e(com.gamericefishpro.space.p6.a.c(fontD).setFontVariationSettings(str4).build()).build();
                                                    } catch (IOException unused) {
                                                        Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                                                    }
                                                } else {
                                                    fontFamilyBuild = com.gamericefishpro.space.r1.f.e(fontD).build();
                                                }
                                                if (customFallbackBuilderB == null) {
                                                    customFallbackBuilderB = com.gamericefishpro.space.r1.f.b(fontFamilyBuild);
                                                } else {
                                                    customFallbackBuilderB.addCustomFallback(fontFamilyBuild);
                                                }
                                                i8++;
                                            }
                                        }
                                    }
                                    typefaceBuild = customFallbackBuilderB.build();
                                    break;
                                }
                            }
                            if (c(((com.gamericefishpro.space.z3.c) arrayList.get(i7)).e) != null) {
                                i7++;
                            }
                            typefaceBuild = null;
                            break;
                        }
                    }
                    typefaceBuild = null;
                    break;
                }
                typefaceBuild = c(((com.gamericefishpro.space.z3.c) arrayList.get(0)).e);
            }
            if (typefaceBuild != null) {
                if (bVar != null) {
                    new Handler(Looper.getMainLooper()).post(new com.gamericefishpro.space.bb.h(i4, bVar, typefaceBuild));
                }
                b.g(b(resources, i, str, i2, i3), typefaceBuild);
                return typefaceBuild;
            }
            Object[] objArr4 = !z ? bVar != null : gVar.c != 0;
            int i9 = z ? gVar.b : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            u uVar = new u(4, z2);
            uVar.e = bVar;
            ArrayList arrayList2 = gVar.a;
            p pVar = new p(4, handler);
            l lVar = new l(uVar, pVar);
            int i10 = 10;
            if (objArr4 != true) {
                String strA = com.gamericefishpro.space.z3.g.a(i3, arrayList2);
                Typeface typeface = (Typeface) com.gamericefishpro.space.z3.g.a.d(strA);
                if (typeface != null) {
                    pVar.execute(new com.gamericefishpro.space.r9.l(i10, uVar, typeface, objArr2 == true ? 1 : 0));
                    typefaceG = typeface;
                } else {
                    com.gamericefishpro.space.z3.e eVar = new com.gamericefishpro.space.z3.e(objArr == true ? 1 : 0, lVar);
                    synchronized (com.gamericefishpro.space.z3.g.c) {
                        try {
                            r0 r0Var = com.gamericefishpro.space.z3.g.d;
                            ArrayList arrayList3 = (ArrayList) r0Var.get(strA);
                            if (arrayList3 != null) {
                                arrayList3.add(eVar);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(eVar);
                                r0Var.put(strA, arrayList4);
                                com.gamericefishpro.space.z3.d dVar2 = new com.gamericefishpro.space.z3.d(strA, context, arrayList2, i3, 1);
                                ThreadPoolExecutor threadPoolExecutor = com.gamericefishpro.space.z3.g.b;
                                com.gamericefishpro.space.z3.e eVar2 = new com.gamericefishpro.space.z3.e(i6, strA);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                com.gamericefishpro.space.m6.e eVar3 = new com.gamericefishpro.space.m6.e(13);
                                eVar3.e = dVar2;
                                eVar3.i = eVar2;
                                eVar3.v = handler2;
                                threadPoolExecutor.execute(eVar3);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } else {
                if (arrayList2.size() > 1) {
                    throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
                }
                com.gamericefishpro.space.z3.c cVar2 = (com.gamericefishpro.space.z3.c) arrayList2.get(0);
                s0 s0Var = com.gamericefishpro.space.z3.g.a;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj = new Object[]{cVar2}[0];
                Objects.requireNonNull(obj);
                arrayList5.add(obj);
                String strA2 = com.gamericefishpro.space.z3.g.a(i3, Collections.unmodifiableList(arrayList5));
                Typeface typeface2 = (Typeface) com.gamericefishpro.space.z3.g.a.d(strA2);
                if (typeface2 != null) {
                    pVar.execute(new com.gamericefishpro.space.r9.l(i10, uVar, typeface2, objArr3 == true ? 1 : 0));
                    typefaceG = typeface2;
                } else if (i9 == -1) {
                    Object[] objArr5 = {cVar2};
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj2 = objArr5[0];
                    Objects.requireNonNull(obj2);
                    arrayList6.add(obj2);
                    com.gamericefishpro.space.z3.f fVarB = com.gamericefishpro.space.z3.g.b(strA2, context, Collections.unmodifiableList(arrayList6), i3);
                    lVar.m(fVarB);
                    typefaceG = fVarB.a;
                } else {
                    try {
                        try {
                            try {
                                com.gamericefishpro.space.z3.f fVar = (com.gamericefishpro.space.z3.f) com.gamericefishpro.space.z3.g.b.submit(new com.gamericefishpro.space.z3.d(strA2, context, cVar2, i3, 0)).get(i9, TimeUnit.MILLISECONDS);
                                lVar.m(fVar);
                                typefaceG = fVar.a;
                            } catch (InterruptedException e) {
                                throw e;
                            }
                        } catch (ExecutionException e2) {
                            throw new RuntimeException(e2);
                        } catch (TimeoutException unused2) {
                            throw new InterruptedException("timeout");
                        }
                    } catch (InterruptedException unused3) {
                        ((p) lVar.e).execute(new com.gamericefishpro.space.s4.i(i5, 3, (u) lVar.d));
                    }
                }
            }
        } else {
            typefaceG = a.g(context, (com.gamericefishpro.space.t3.e) dVar, resources, i3);
            if (bVar != null) {
                if (typefaceG != null) {
                    new Handler(Looper.getMainLooper()).post(new com.gamericefishpro.space.bb.h(i4, bVar, typefaceG));
                } else {
                    bVar.a(-3);
                }
            }
        }
        if (typefaceG != null) {
            b.g(b(resources, i, str, i2, i3), typefaceG);
        }
        return typefaceG;
    }

    public static String b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    public static Typeface c(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                return typefaceCreate;
            }
        }
        return null;
    }

    public static Font d(Typeface typeface) {
        if (c == null) {
            c = new Paint();
        }
        c.setTextSize(10.0f);
        c.setTypeface(typeface);
        PositionedGlyphs positionedGlyphsShapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, c);
        if (positionedGlyphsShapeTextRun.glyphCount() == 0) {
            return null;
        }
        return positionedGlyphsShapeTextRun.getFont(0);
    }
}
