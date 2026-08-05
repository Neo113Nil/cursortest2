package defpackage;

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
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class me0 {
    public static Paint MdtA4re8;
    public static final mq NCTxEWno;
    public static final e50 qoPGr6Ce;

    static {
        f50.wxUZMvaN("TypefaceCompat static init");
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            qoPGr6Ce = new se0();
        } else if (i >= 29) {
            qoPGr6Ce = new re0();
        } else if (i >= 28) {
            qoPGr6Ce = new qe0();
        } else if (i >= 26) {
            qoPGr6Ce = new pe0();
        } else {
            Method method = oe0.P7K7Inc8;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                qoPGr6Ce = new oe0();
            } else {
                qoPGr6Ce = new ne0();
            }
        }
        NCTxEWno = new mq(16);
        MdtA4re8 = null;
        Trace.endSection();
    }

    public static Typeface MdtA4re8(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface create = Typeface.create(str, 0);
            Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
            if (create != null && !create.equals(create2)) {
                return create;
            }
        }
        return null;
    }

    public static String NCTxEWno(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Typeface qoPGr6Ce(Context context, ai aiVar, Resources resources, int i, String str, int i2, int i3, ej0 ej0Var, boolean z) {
        Typeface VgvYg0wo;
        Typeface build;
        FontFamily build2;
        int i4 = -3;
        if (aiVar instanceof di) {
            di diVar = (di) aiVar;
            String str2 = diVar.wxUZMvaN;
            VgvYg0wo = null;
            int i5 = 1;
            boolean z2 = false;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            if (TextUtils.isEmpty(str2) || (build = MdtA4re8(str2)) == null) {
                ArrayList arrayList = diVar.qoPGr6Ce;
                if (arrayList.size() == 1) {
                    build = MdtA4re8(((th) arrayList.get(0)).VgvYg0wo);
                } else {
                    if (Build.VERSION.SDK_INT >= 31) {
                        int i6 = 0;
                        while (true) {
                            if (i6 >= arrayList.size()) {
                                Typeface.CustomFallbackBuilder customFallbackBuilder = null;
                                int i7 = 0;
                                while (true) {
                                    if (i7 >= arrayList.size()) {
                                        break;
                                    }
                                    th thVar = (th) arrayList.get(i7);
                                    if (i7 == arrayList.size() - 1 && TextUtils.isEmpty(thVar.P7K7Inc8)) {
                                        customFallbackBuilder.setSystemFallback(thVar.VgvYg0wo);
                                        break;
                                    }
                                    String str3 = thVar.VgvYg0wo;
                                    String str4 = thVar.P7K7Inc8;
                                    Font wxUZMvaN = wxUZMvaN(MdtA4re8(str3));
                                    if (wxUZMvaN == null) {
                                        Log.w("TypefaceCompat", "Unable identify the primary font for " + thVar.VgvYg0wo + ". Falling back to provider font.");
                                        break;
                                    }
                                    if (TextUtils.isEmpty(str4)) {
                                        build2 = new FontFamily.Builder(wxUZMvaN).build();
                                    } else {
                                        try {
                                            build2 = new FontFamily.Builder(y8.b2ZJblxo(wxUZMvaN).setFontVariationSettings(str4).build()).build();
                                        } catch (IOException unused) {
                                            Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                                        }
                                    }
                                    if (customFallbackBuilder == null) {
                                        customFallbackBuilder = new Typeface.CustomFallbackBuilder(build2);
                                    } else {
                                        customFallbackBuilder.addCustomFallback(build2);
                                    }
                                    i7++;
                                }
                                build = customFallbackBuilder.build();
                            } else {
                                if (MdtA4re8(((th) arrayList.get(i6)).VgvYg0wo) == null) {
                                    break;
                                }
                                i6++;
                            }
                        }
                    }
                    build = null;
                }
            }
            if (build != null) {
                if (ej0Var != null) {
                    new Handler(Looper.getMainLooper()).post(new a1GxQO7H(ej0Var, 2, build));
                }
                NCTxEWno.ow5vqvCr(NCTxEWno(resources, i, str, i2, i3), build);
                return build;
            }
            Object[] objArr5 = !z ? ej0Var != null : diVar.MdtA4re8 != 0;
            int i8 = z ? diVar.NCTxEWno : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            ya0 ya0Var = new ya0();
            ya0Var.MdtA4re8 = ej0Var;
            ArrayList arrayList2 = diVar.qoPGr6Ce;
            d1 d1Var = new d1(handler);
            mcXgUFR8 mcxgufr8 = new mcXgUFR8(ya0Var, d1Var, 9, z2);
            int i9 = 5;
            if (objArr5 != true) {
                String qoPGr6Ce2 = zh.qoPGr6Ce(arrayList2, i3);
                Typeface typeface = (Typeface) zh.qoPGr6Ce.Qr9iLBAD(qoPGr6Ce2);
                if (typeface != null) {
                    d1Var.execute(new XrPeKzBk(ya0Var, typeface, i9, objArr2 == true ? 1 : 0));
                    VgvYg0wo = typeface;
                } else {
                    xh xhVar = new xh(objArr == true ? 1 : 0, mcxgufr8);
                    synchronized (zh.MdtA4re8) {
                        try {
                            p70 p70Var = zh.wxUZMvaN;
                            ArrayList arrayList3 = (ArrayList) p70Var.get(qoPGr6Ce2);
                            if (arrayList3 != null) {
                                arrayList3.add(xhVar);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(xhVar);
                                p70Var.put(qoPGr6Ce2, arrayList4);
                                wh whVar = new wh(qoPGr6Ce2, context, arrayList2, i3, 1);
                                ThreadPoolExecutor threadPoolExecutor = zh.NCTxEWno;
                                xh xhVar2 = new xh(i5, qoPGr6Ce2);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                a30 a30Var = new a30();
                                a30Var.MdtA4re8 = whVar;
                                a30Var.wxUZMvaN = xhVar2;
                                a30Var.VgvYg0wo = handler2;
                                threadPoolExecutor.execute(a30Var);
                            }
                        } finally {
                        }
                    }
                }
            } else {
                if (arrayList2.size() > 1) {
                    m1.sjUBp5pO("Fallbacks with blocking fetches are not supported for performance reasons");
                    return null;
                }
                th thVar2 = (th) arrayList2.get(0);
                mq mqVar = zh.qoPGr6Ce;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj = new Object[]{thVar2}[0];
                Objects.requireNonNull(obj);
                arrayList5.add(obj);
                String qoPGr6Ce3 = zh.qoPGr6Ce(Collections.unmodifiableList(arrayList5), i3);
                Typeface typeface2 = (Typeface) zh.qoPGr6Ce.Qr9iLBAD(qoPGr6Ce3);
                if (typeface2 != null) {
                    d1Var.execute(new XrPeKzBk(ya0Var, typeface2, i9, objArr4 == true ? 1 : 0));
                    VgvYg0wo = typeface2;
                } else if (i8 == -1) {
                    Object[] objArr6 = {thVar2};
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj2 = objArr6[0];
                    Objects.requireNonNull(obj2);
                    arrayList6.add(obj2);
                    yh NCTxEWno2 = zh.NCTxEWno(qoPGr6Ce3, context, Collections.unmodifiableList(arrayList6), i3);
                    mcxgufr8.SgZGMMPL(NCTxEWno2);
                    VgvYg0wo = NCTxEWno2.qoPGr6Ce;
                } else {
                    try {
                        try {
                            try {
                                yh yhVar = (yh) zh.NCTxEWno.submit(new wh(qoPGr6Ce3, context, thVar2, i3, 0)).get(i8, TimeUnit.MILLISECONDS);
                                mcxgufr8.SgZGMMPL(yhVar);
                                VgvYg0wo = yhVar.qoPGr6Ce;
                            } catch (InterruptedException e) {
                                throw e;
                            }
                        } catch (ExecutionException e2) {
                            throw new RuntimeException(e2);
                        } catch (TimeoutException unused2) {
                            throw new InterruptedException("timeout");
                        }
                    } catch (InterruptedException unused3) {
                        ((d1) mcxgufr8.wxUZMvaN).execute(new g3(i4, (int) (objArr3 == true ? 1 : 0), mcxgufr8.MdtA4re8));
                    }
                }
            }
        } else {
            VgvYg0wo = qoPGr6Ce.VgvYg0wo(context, (bi) aiVar, resources, i3);
            if (ej0Var != null) {
                if (VgvYg0wo != null) {
                    new Handler(Looper.getMainLooper()).post(new a1GxQO7H(ej0Var, 2, VgvYg0wo));
                } else {
                    ej0Var.wxUZMvaN(-3);
                }
            }
        }
        if (VgvYg0wo != null) {
            NCTxEWno.ow5vqvCr(NCTxEWno(resources, i, str, i2, i3), VgvYg0wo);
        }
        return VgvYg0wo;
    }

    public static Font wxUZMvaN(Typeface typeface) {
        PositionedGlyphs shapeTextRun;
        int glyphCount;
        Font font;
        Paint paint = MdtA4re8;
        if (paint == null) {
            paint = new Paint();
            MdtA4re8 = paint;
        }
        paint.setTextSize(10.0f);
        MdtA4re8.setTypeface(typeface);
        shapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, MdtA4re8);
        glyphCount = shapeTextRun.glyphCount();
        if (glyphCount == 0) {
            return null;
        }
        font = shapeTextRun.getFont(0);
        return font;
    }
}
