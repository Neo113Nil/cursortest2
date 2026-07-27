package kotlin.text;

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
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public abstract class CatchingFishGraphQLAdMob {
    public static Paint CatchingFishCoroutine;
    public static final CatchingFishDaggerBiometric CatchingFishParcelableFAB;
    public static final CatchingFishGsonIntent CatchingFishSnackbar;

    static {
        CatchingFishDaggerBiometric.CatchingFishDaggerWebsocket("TypefaceCompat static init");
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            CatchingFishParcelableFAB = new CatchingFishFABToolbarView();
        } else if (i >= 29) {
            CatchingFishParcelableFAB = new CatchingFishMockkMVPLayout();
        } else if (i >= 28) {
            CatchingFishParcelableFAB = new CatchingFishAdMobReduxRedux();
        } else if (i >= 26) {
            CatchingFishParcelableFAB = new CatchingFishReduxOkHttpMVI();
        } else if (CatchingFishLayoutViewMockk.CatchingFishViewModelFAB != null) {
            CatchingFishParcelableFAB = new CatchingFishLayoutViewMockk();
        } else {
            CatchingFishParcelableFAB = new CatchingFishStateFlowIntent();
        }
        CatchingFishSnackbar = new CatchingFishGsonIntent(16);
        CatchingFishCoroutine = null;
        Trace.endSection();
    }

    public static Typeface CatchingFishCoroutine(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface create = Typeface.create(str, 0);
            Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
            if (create != null && !create.equals(create2)) {
                return create;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Typeface CatchingFishParcelableFAB(Context context, CatchingFishGsonHiltMoshi catchingFishGsonHiltMoshi, Resources resources, int i, String str, int i2, int i3, CatchingFishOkHttpFAB catchingFishOkHttpFAB, boolean z) {
        Typeface CatchingFishLayout;
        Typeface build;
        Font.Builder fontVariationSettings;
        Font build2;
        FontFamily build3;
        int i4 = 13;
        int i5 = -3;
        if (catchingFishGsonHiltMoshi instanceof CatchingFishKtorWebsocket) {
            CatchingFishKtorWebsocket catchingFishKtorWebsocket = (CatchingFishKtorWebsocket) catchingFishGsonHiltMoshi;
            String str2 = catchingFishKtorWebsocket.CatchingFishReduxKtor;
            Typeface typeface = null;
            int i6 = 1;
            boolean z2 = false;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            if (TextUtils.isEmpty(str2) || (build = CatchingFishCoroutine(str2)) == null) {
                ArrayList arrayList = catchingFishKtorWebsocket.CatchingFishParcelableFAB;
                if (arrayList.size() == 1) {
                    build = CatchingFishCoroutine(((CatchingFishViewAsyncTask) arrayList.get(0)).CatchingFishDaggerWebsocket);
                } else {
                    if (Build.VERSION.SDK_INT >= 31) {
                        int i7 = 0;
                        while (true) {
                            if (i7 >= arrayList.size()) {
                                Typeface.CustomFallbackBuilder customFallbackBuilder = null;
                                int i8 = 0;
                                while (true) {
                                    if (i8 >= arrayList.size()) {
                                        break;
                                    }
                                    CatchingFishViewAsyncTask catchingFishViewAsyncTask = (CatchingFishViewAsyncTask) arrayList.get(i8);
                                    if (i8 == arrayList.size() - 1 && TextUtils.isEmpty(catchingFishViewAsyncTask.CatchingFishWorkManager)) {
                                        customFallbackBuilder.setSystemFallback(catchingFishViewAsyncTask.CatchingFishDaggerWebsocket);
                                        break;
                                    }
                                    String str3 = catchingFishViewAsyncTask.CatchingFishDaggerWebsocket;
                                    String str4 = catchingFishViewAsyncTask.CatchingFishWorkManager;
                                    Font CatchingFishReduxKtor = CatchingFishReduxKtor(CatchingFishCoroutine(str3));
                                    if (CatchingFishReduxKtor == null) {
                                        break;
                                    }
                                    if (TextUtils.isEmpty(str4)) {
                                        build3 = CatchingFishRoomExoPlayer.CatchingFishViewModelFAB(CatchingFishReduxKtor).build();
                                    } else {
                                        try {
                                            CatchingFishRoomExoPlayer.CatchingFishOkHttp();
                                            CatchingFishRoomExoPlayer.CatchingFishParcelableFlux();
                                            fontVariationSettings = CatchingFishGsonGson.CatchingFishParcelableFAB(CatchingFishReduxKtor).setFontVariationSettings(str4);
                                            build2 = fontVariationSettings.build();
                                            build3 = CatchingFishRoomExoPlayer.CatchingFishViewModelFAB(build2).build();
                                        } catch (IOException unused) {
                                        }
                                    }
                                    if (customFallbackBuilder == null) {
                                        customFallbackBuilder = CatchingFishRoomExoPlayer.CatchingFishCoroutine(build3);
                                    } else {
                                        customFallbackBuilder.addCustomFallback(build3);
                                    }
                                    i8++;
                                }
                                build = customFallbackBuilder.build();
                            } else {
                                if (CatchingFishCoroutine(((CatchingFishViewAsyncTask) arrayList.get(i7)).CatchingFishDaggerWebsocket) == null) {
                                    break;
                                }
                                i7++;
                            }
                        }
                    }
                    build = null;
                }
            }
            if (build != null) {
                if (catchingFishOkHttpFAB != null) {
                    new Handler(Looper.getMainLooper()).post(new CatchingFishEspressoFlux(i4, catchingFishOkHttpFAB, build));
                }
                CatchingFishSnackbar.CatchingFishFragmentHandler(CatchingFishSnackbar(resources, i, str, i2, i3), build);
                return build;
            }
            Object[] objArr5 = !z ? catchingFishOkHttpFAB != null : catchingFishKtorWebsocket.CatchingFishCoroutine != 0;
            int i9 = z ? catchingFishKtorWebsocket.CatchingFishSnackbar : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            CatchingFishEspressoPayPal catchingFishEspressoPayPal = new CatchingFishEspressoPayPal(11, z2);
            catchingFishEspressoPayPal.CatchingFishDaggerWebsocket = catchingFishOkHttpFAB;
            ArrayList arrayList2 = catchingFishKtorWebsocket.CatchingFishParcelableFAB;
            CatchingFishLayoutOkHttp catchingFishLayoutOkHttp = new CatchingFishLayoutOkHttp(0, handler);
            CatchingFishBundleGlide catchingFishBundleGlide = new CatchingFishBundleGlide(i4, catchingFishEspressoPayPal, catchingFishLayoutOkHttp);
            int i10 = 20;
            if (objArr5 != true) {
                String CatchingFishParcelableFAB2 = CatchingFishAsyncTaskMVI.CatchingFishParcelableFAB(i3, arrayList2);
                Typeface typeface2 = (Typeface) CatchingFishAsyncTaskMVI.CatchingFishParcelableFAB.CatchingFishWorkManager(CatchingFishParcelableFAB2);
                if (typeface2 != null) {
                    catchingFishLayoutOkHttp.execute(new CatchingFishService(i10, catchingFishEspressoPayPal, typeface2, objArr2 == true ? 1 : 0));
                    typeface = typeface2;
                } else {
                    CatchingFishGraphQLEspresso catchingFishGraphQLEspresso = new CatchingFishGraphQLEspresso(objArr == true ? 1 : 0, catchingFishBundleGlide);
                    synchronized (CatchingFishAsyncTaskMVI.CatchingFishCoroutine) {
                        try {
                            CatchingFishGraphQLRealmFAB catchingFishGraphQLRealmFAB = CatchingFishAsyncTaskMVI.CatchingFishReduxKtor;
                            ArrayList arrayList3 = (ArrayList) catchingFishGraphQLRealmFAB.get(CatchingFishParcelableFAB2);
                            if (arrayList3 != null) {
                                arrayList3.add(catchingFishGraphQLEspresso);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(catchingFishGraphQLEspresso);
                                catchingFishGraphQLRealmFAB.put(CatchingFishParcelableFAB2, arrayList4);
                                CatchingFishPicassoMoshi catchingFishPicassoMoshi = new CatchingFishPicassoMoshi(CatchingFishParcelableFAB2, context, arrayList2, i3, 1);
                                ThreadPoolExecutor threadPoolExecutor = CatchingFishAsyncTaskMVI.CatchingFishSnackbar;
                                CatchingFishGraphQLEspresso catchingFishGraphQLEspresso2 = new CatchingFishGraphQLEspresso(i6, CatchingFishParcelableFAB2);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                CatchingFishViewRedux catchingFishViewRedux = new CatchingFishViewRedux();
                                catchingFishViewRedux.CatchingFishDaggerWebsocket = catchingFishPicassoMoshi;
                                catchingFishViewRedux.CatchingFishWorkManager = catchingFishGraphQLEspresso2;
                                catchingFishViewRedux.CatchingFishViewModelScope = handler2;
                                threadPoolExecutor.execute(catchingFishViewRedux);
                            }
                        } finally {
                        }
                    }
                }
            } else {
                if (arrayList2.size() > 1) {
                    throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
                }
                CatchingFishViewAsyncTask catchingFishViewAsyncTask2 = (CatchingFishViewAsyncTask) arrayList2.get(0);
                CatchingFishGsonIntent catchingFishGsonIntent = CatchingFishAsyncTaskMVI.CatchingFishParcelableFAB;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj = new Object[]{catchingFishViewAsyncTask2}[0];
                Objects.requireNonNull(obj);
                arrayList5.add(obj);
                String CatchingFishParcelableFAB3 = CatchingFishAsyncTaskMVI.CatchingFishParcelableFAB(i3, Collections.unmodifiableList(arrayList5));
                Typeface typeface3 = (Typeface) CatchingFishAsyncTaskMVI.CatchingFishParcelableFAB.CatchingFishWorkManager(CatchingFishParcelableFAB3);
                if (typeface3 != null) {
                    catchingFishLayoutOkHttp.execute(new CatchingFishService(i10, catchingFishEspressoPayPal, typeface3, objArr4 == true ? 1 : 0));
                    typeface = typeface3;
                } else if (i9 == -1) {
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj2 = new Object[]{catchingFishViewAsyncTask2}[0];
                    Objects.requireNonNull(obj2);
                    arrayList6.add(obj2);
                    CatchingFishLayoutBiometric CatchingFishSnackbar2 = CatchingFishAsyncTaskMVI.CatchingFishSnackbar(CatchingFishParcelableFAB3, context, Collections.unmodifiableList(arrayList6), i3);
                    catchingFishBundleGlide.CatchingFishCardViewView(CatchingFishSnackbar2);
                    typeface = CatchingFishSnackbar2.CatchingFishParcelableFAB;
                } else {
                    try {
                        try {
                            try {
                                CatchingFishLayoutBiometric catchingFishLayoutBiometric = (CatchingFishLayoutBiometric) CatchingFishAsyncTaskMVI.CatchingFishSnackbar.submit(new CatchingFishPicassoMoshi(CatchingFishParcelableFAB3, context, catchingFishViewAsyncTask2, i3, 0)).get(i9, TimeUnit.MILLISECONDS);
                                catchingFishBundleGlide.CatchingFishCardViewView(catchingFishLayoutBiometric);
                                typeface = catchingFishLayoutBiometric.CatchingFishParcelableFAB;
                            } catch (InterruptedException e) {
                                throw e;
                            }
                        } catch (ExecutionException e2) {
                            throw new RuntimeException(e2);
                        } catch (TimeoutException unused2) {
                            throw new InterruptedException("timeout");
                        }
                    } catch (InterruptedException unused3) {
                        ((CatchingFishLayoutOkHttp) catchingFishBundleGlide.CatchingFishWorkManager).execute(new CatchingFishServiceEspresso(i5, (int) (objArr3 == true ? 1 : 0), catchingFishBundleGlide.CatchingFishDaggerWebsocket));
                    }
                }
            }
            CatchingFishLayout = typeface;
        } else {
            CatchingFishLayout = CatchingFishParcelableFAB.CatchingFishLayout(context, (CatchingFishFABSnackbarMVVM) catchingFishGsonHiltMoshi, resources, i3);
            if (catchingFishOkHttpFAB != null) {
                if (CatchingFishLayout != null) {
                    new Handler(Looper.getMainLooper()).post(new CatchingFishEspressoFlux(i4, catchingFishOkHttpFAB, CatchingFishLayout));
                } else {
                    catchingFishOkHttpFAB.CatchingFishDaggerWebsocket(-3);
                }
            }
        }
        if (CatchingFishLayout != null) {
            CatchingFishSnackbar.CatchingFishFragmentHandler(CatchingFishSnackbar(resources, i, str, i2, i3), CatchingFishLayout);
        }
        return CatchingFishLayout;
    }

    public static Font CatchingFishReduxKtor(Typeface typeface) {
        PositionedGlyphs shapeTextRun;
        int glyphCount;
        Font font;
        if (CatchingFishCoroutine == null) {
            CatchingFishCoroutine = new Paint();
        }
        CatchingFishCoroutine.setTextSize(10.0f);
        CatchingFishCoroutine.setTypeface(typeface);
        shapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, CatchingFishCoroutine);
        glyphCount = shapeTextRun.glyphCount();
        if (glyphCount == 0) {
            return null;
        }
        font = shapeTextRun.getFont(0);
        return font;
    }

    public static String CatchingFishSnackbar(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }
}
