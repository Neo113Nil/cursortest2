package kotlin.text;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.catchingfish.fishcatcherpro.R;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final class CatchingFishViewWorkManager implements CatchingFishFABJUnit {
    public Object CatchingFishDaggerWebsocket;
    public Object CatchingFishLayout;
    public Object CatchingFishReduxKtor;
    public Object CatchingFishViewModelFAB;
    public Object CatchingFishViewModelScope;
    public Object CatchingFishWorkManager;

    public CatchingFishViewWorkManager(Set set, String str, String str2) {
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.CatchingFishReduxKtor = unmodifiableSet;
        Map map = Collections.EMPTY_MAP;
        this.CatchingFishWorkManager = str;
        this.CatchingFishViewModelScope = str2;
        this.CatchingFishViewModelFAB = CatchingFishMVIGradleRealm.CatchingFishSnackbar;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        this.CatchingFishDaggerWebsocket = Collections.unmodifiableSet(hashSet);
    }

    public static ColorStateList CatchingFishEspressoTesting(Context context, int i) {
        int CatchingFishCoroutine = CatchingFishKtorWorkManager.CatchingFishCoroutine(context, R.attr.colorControlHighlight);
        int CatchingFishSnackbar = CatchingFishKtorWorkManager.CatchingFishSnackbar(context, R.attr.colorButtonNormal);
        int[] iArr = CatchingFishKtorWorkManager.CatchingFishSnackbar;
        int[] iArr2 = CatchingFishKtorWorkManager.CatchingFishReduxKtor;
        int CatchingFishSnackbar2 = CatchingFishLiveDataAdMob.CatchingFishSnackbar(CatchingFishCoroutine, i);
        return new ColorStateList(new int[][]{iArr, iArr2, CatchingFishKtorWorkManager.CatchingFishCoroutine, CatchingFishKtorWorkManager.CatchingFishWorkManager}, new int[]{CatchingFishSnackbar, CatchingFishSnackbar2, CatchingFishLiveDataAdMob.CatchingFishSnackbar(CatchingFishCoroutine, i), i});
    }

    public static boolean CatchingFishFragmentHandler(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static void CatchingFishRoomDatabase(Drawable drawable, int i, PorterDuff.Mode mode) {
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = CatchingFishPicassoMVPJUnit.CatchingFishSnackbar;
        }
        mutate.setColorFilter(CatchingFishPicassoMVPJUnit.CatchingFishCoroutine(i, mode));
    }

    public static LayerDrawable CatchingFishUnitTesting(CatchingFishCoroutineRedux catchingFishCoroutineRedux, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable CatchingFishCoroutine = catchingFishCoroutineRedux.CatchingFishCoroutine(context, R.drawable.abc_star_black_48dp);
        Drawable CatchingFishCoroutine2 = catchingFishCoroutineRedux.CatchingFishCoroutine(context, R.drawable.abc_star_half_black_48dp);
        if ((CatchingFishCoroutine instanceof BitmapDrawable) && CatchingFishCoroutine.getIntrinsicWidth() == dimensionPixelSize && CatchingFishCoroutine.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) CatchingFishCoroutine;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            CatchingFishCoroutine.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            CatchingFishCoroutine.draw(canvas);
            bitmapDrawable = new BitmapDrawable(createBitmap);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((CatchingFishCoroutine2 instanceof BitmapDrawable) && CatchingFishCoroutine2.getIntrinsicWidth() == dimensionPixelSize && CatchingFishCoroutine2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) CatchingFishCoroutine2;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            CatchingFishCoroutine2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            CatchingFishCoroutine2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public ColorStateList CatchingFishAnimationMockk(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            return CatchingFishGsonCardView.CatchingFishSpannableWidget(context, R.color.abc_tint_edittext);
        }
        if (i == 2131165291) {
            return CatchingFishGsonCardView.CatchingFishSpannableWidget(context, R.color.abc_tint_switch_track);
        }
        if (i != R.drawable.abc_switch_thumb_material) {
            if (i == R.drawable.abc_btn_default_mtrl_shape) {
                return CatchingFishEspressoTesting(context, CatchingFishKtorWorkManager.CatchingFishCoroutine(context, R.attr.colorButtonNormal));
            }
            if (i == R.drawable.abc_btn_borderless_material) {
                return CatchingFishEspressoTesting(context, 0);
            }
            if (i == R.drawable.abc_btn_colored_material) {
                return CatchingFishEspressoTesting(context, CatchingFishKtorWorkManager.CatchingFishCoroutine(context, R.attr.colorAccent));
            }
            if (i == 2131165286 || i == R.drawable.abc_spinner_textfield_background_material) {
                return CatchingFishGsonCardView.CatchingFishSpannableWidget(context, R.color.abc_tint_spinner);
            }
            if (CatchingFishFragmentHandler((int[]) this.CatchingFishDaggerWebsocket, i)) {
                return CatchingFishKtorWorkManager.CatchingFishReduxKtor(context, R.attr.colorControlNormal);
            }
            if (CatchingFishFragmentHandler((int[]) this.CatchingFishViewModelFAB, i)) {
                return CatchingFishGsonCardView.CatchingFishSpannableWidget(context, R.color.abc_tint_default);
            }
            if (CatchingFishFragmentHandler((int[]) this.CatchingFishLayout, i)) {
                return CatchingFishGsonCardView.CatchingFishSpannableWidget(context, R.color.abc_tint_btn_checkable);
            }
            if (i == R.drawable.abc_seekbar_thumb_material) {
                return CatchingFishGsonCardView.CatchingFishSpannableWidget(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList CatchingFishReduxKtor = CatchingFishKtorWorkManager.CatchingFishReduxKtor(context, R.attr.colorSwitchThumbNormal);
        if (CatchingFishReduxKtor == null || !CatchingFishReduxKtor.isStateful()) {
            iArr[0] = CatchingFishKtorWorkManager.CatchingFishSnackbar;
            iArr2[0] = CatchingFishKtorWorkManager.CatchingFishSnackbar(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = CatchingFishKtorWorkManager.CatchingFishDaggerWebsocket;
            iArr2[1] = CatchingFishKtorWorkManager.CatchingFishCoroutine(context, R.attr.colorControlActivated);
            iArr[2] = CatchingFishKtorWorkManager.CatchingFishWorkManager;
            iArr2[2] = CatchingFishKtorWorkManager.CatchingFishCoroutine(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = CatchingFishKtorWorkManager.CatchingFishSnackbar;
            iArr[0] = iArr3;
            iArr2[0] = CatchingFishReduxKtor.getColorForState(iArr3, 0);
            iArr[1] = CatchingFishKtorWorkManager.CatchingFishDaggerWebsocket;
            iArr2[1] = CatchingFishKtorWorkManager.CatchingFishCoroutine(context, R.attr.colorControlActivated);
            iArr[2] = CatchingFishKtorWorkManager.CatchingFishWorkManager;
            iArr2[2] = CatchingFishReduxKtor.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public CatchingFishSpannableView CatchingFishCloudMessaging() {
        String str = ((String) this.CatchingFishReduxKtor) == null ? " transportName" : "";
        if (((CatchingFishManifestBundle) this.CatchingFishWorkManager) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.CatchingFishViewModelScope) == null) {
            str = CatchingFishMVPLiveData.CatchingFishEspressoTesting(str, " eventMillis");
        }
        if (((Long) this.CatchingFishViewModelFAB) == null) {
            str = CatchingFishMVPLiveData.CatchingFishEspressoTesting(str, " uptimeMillis");
        }
        if (((HashMap) this.CatchingFishLayout) == null) {
            str = CatchingFishMVPLiveData.CatchingFishEspressoTesting(str, " autoMetadata");
        }
        if (str.isEmpty()) {
            return new CatchingFishSpannableView((String) this.CatchingFishReduxKtor, (Integer) this.CatchingFishDaggerWebsocket, (CatchingFishManifestBundle) this.CatchingFishWorkManager, ((Long) this.CatchingFishViewModelScope).longValue(), ((Long) this.CatchingFishViewModelFAB).longValue(), (HashMap) this.CatchingFishLayout);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    @Override // kotlin.text.CatchingFishFABJUnit
    public CatchingFishLiveDataHandler CatchingFishCoroutine(CatchingFishFABDagger catchingFishFABDagger) {
        if (((Set) this.CatchingFishViewModelFAB).contains(catchingFishFABDagger)) {
            return ((CatchingFishFABJUnit) this.CatchingFishLayout).CatchingFishCoroutine(catchingFishFABDagger);
        }
        throw new CatchingFishBiometricView("Attempting to request an undeclared dependency Provider<Set<" + catchingFishFABDagger + ">>.");
    }

    @Override // kotlin.text.CatchingFishFABJUnit
    public CatchingFishFABWebSocket CatchingFishDaggerWebsocket(CatchingFishFABDagger catchingFishFABDagger) {
        if (((Set) this.CatchingFishWorkManager).contains(catchingFishFABDagger)) {
            return ((CatchingFishFABJUnit) this.CatchingFishLayout).CatchingFishDaggerWebsocket(catchingFishFABDagger);
        }
        throw new CatchingFishBiometricView("Attempting to request an undeclared dependency Deferred<" + catchingFishFABDagger + ">.");
    }

    public void CatchingFishLayout(String str, String str2) {
        HashMap hashMap = (HashMap) this.CatchingFishLayout;
        if (hashMap == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap.put(str, str2);
    }

    public CatchingFishWorkManagerMVP CatchingFishNavigation(String str, String str2, Bundle bundle) {
        int i;
        try {
            CatchingFishStateLiveData(str, str2, bundle);
            CatchingFishGlideAdMobMVI catchingFishGlideAdMobMVI = (CatchingFishGlideAdMobMVI) this.CatchingFishWorkManager;
            CatchingFishToastGraphQLMVP catchingFishToastGraphQLMVP = CatchingFishToastGraphQLMVP.CatchingFishWorkManager;
            CatchingFishMVIContext catchingFishMVIContext = catchingFishGlideAdMobMVI.CatchingFishCoroutine;
            if (catchingFishMVIContext.CatchingFishParcelableFAB() >= 12000000) {
                CatchingFishFluxFirebase CatchingFishViewModelFAB = CatchingFishFluxFirebase.CatchingFishViewModelFAB(catchingFishGlideAdMobMVI.CatchingFishSnackbar);
                synchronized (CatchingFishViewModelFAB) {
                    i = CatchingFishViewModelFAB.CatchingFishParcelableFAB;
                    CatchingFishViewModelFAB.CatchingFishParcelableFAB = i + 1;
                }
                return CatchingFishViewModelFAB.CatchingFishLayout(new CatchingFishFluxKtor(i, 1, bundle, 1)).CatchingFishCoroutine(catchingFishToastGraphQLMVP, CatchingFishMVPExoPlayer.CatchingFishOkHttp);
            }
            if (catchingFishMVIContext.CatchingFishReduxKtor() != 0) {
                return catchingFishGlideAdMobMVI.CatchingFishParcelableFAB(bundle).CatchingFishReduxKtor(catchingFishToastGraphQLMVP, new CatchingFishContextPicasso(catchingFishGlideAdMobMVI, bundle));
            }
            IOException iOException = new IOException("MISSING_INSTANCEID_SERVICE");
            CatchingFishWorkManagerMVP catchingFishWorkManagerMVP = new CatchingFishWorkManagerMVP();
            catchingFishWorkManagerMVP.CatchingFishCloudMessaging(iOException);
            return catchingFishWorkManagerMVP;
        } catch (InterruptedException | ExecutionException e) {
            CatchingFishWorkManagerMVP catchingFishWorkManagerMVP2 = new CatchingFishWorkManagerMVP();
            catchingFishWorkManagerMVP2.CatchingFishCloudMessaging(e);
            return catchingFishWorkManagerMVP2;
        }
    }

    public CatchingFishWorkManagerMVP CatchingFishOkHttp(CatchingFishWorkManagerMVP catchingFishWorkManagerMVP) {
        return catchingFishWorkManagerMVP.CatchingFishCoroutine(new CatchingFishExoPlayerRealm(), new CatchingFishLayoutLayout(28, this));
    }

    @Override // kotlin.text.CatchingFishFABJUnit
    public Object CatchingFishParcelableFAB(Class cls) {
        if (!((Set) this.CatchingFishReduxKtor).contains(CatchingFishFABDagger.CatchingFishParcelableFAB(cls))) {
            throw new CatchingFishBiometricView("Attempting to request an undeclared dependency " + cls + ".");
        }
        Object CatchingFishParcelableFAB = ((CatchingFishFABJUnit) this.CatchingFishLayout).CatchingFishParcelableFAB(cls);
        if (!cls.equals(CatchingFishMoshiRedux.class)) {
            return CatchingFishParcelableFAB;
        }
        return new CatchingFishGraphQLRedux();
    }

    @Override // kotlin.text.CatchingFishFABJUnit
    public CatchingFishLiveDataHandler CatchingFishReduxKtor(Class cls) {
        return CatchingFishViewModelFAB(CatchingFishFABDagger.CatchingFishParcelableFAB(cls));
    }

    @Override // kotlin.text.CatchingFishFABJUnit
    public Set CatchingFishSnackbar(CatchingFishFABDagger catchingFishFABDagger) {
        if (((Set) this.CatchingFishViewModelScope).contains(catchingFishFABDagger)) {
            return ((CatchingFishFABJUnit) this.CatchingFishLayout).CatchingFishSnackbar(catchingFishFABDagger);
        }
        throw new CatchingFishBiometricView("Attempting to request an undeclared dependency Set<" + catchingFishFABDagger + ">.");
    }

    public void CatchingFishStateLiveData(String str, String str2, Bundle bundle) {
        int i;
        String str3;
        String str4;
        boolean CatchingFishDaggerWebsocket;
        int i2;
        PackageInfo packageInfo;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        com.google.firebase.CatchingFishPagingLibrary catchingFishPagingLibrary = (com.google.firebase.CatchingFishPagingLibrary) this.CatchingFishReduxKtor;
        catchingFishPagingLibrary.CatchingFishParcelableFAB();
        bundle.putString("gmp_app_id", catchingFishPagingLibrary.CatchingFishCoroutine.CatchingFishSnackbar);
        CatchingFishAdMobToast catchingFishAdMobToast = (CatchingFishAdMobToast) this.CatchingFishDaggerWebsocket;
        synchronized (catchingFishAdMobToast) {
            try {
                if (catchingFishAdMobToast.CatchingFishParcelableFAB == 0) {
                    try {
                        packageInfo = ((Context) catchingFishAdMobToast.CatchingFishCoroutine).getPackageManager().getPackageInfo("com.google.android.gms", 0);
                    } catch (PackageManager.NameNotFoundException e) {
                        e.toString();
                        packageInfo = null;
                    }
                    if (packageInfo != null) {
                        catchingFishAdMobToast.CatchingFishParcelableFAB = packageInfo.versionCode;
                    }
                }
                i = catchingFishAdMobToast.CatchingFishParcelableFAB;
            } finally {
            }
        }
        bundle.putString("gmsv", Integer.toString(i));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((CatchingFishAdMobToast) this.CatchingFishDaggerWebsocket).CatchingFishSnackbar());
        CatchingFishAdMobToast catchingFishAdMobToast2 = (CatchingFishAdMobToast) this.CatchingFishDaggerWebsocket;
        synchronized (catchingFishAdMobToast2) {
            try {
                if (((String) catchingFishAdMobToast2.CatchingFishDaggerWebsocket) == null) {
                    catchingFishAdMobToast2.CatchingFishDaggerWebsocket();
                }
                str3 = (String) catchingFishAdMobToast2.CatchingFishDaggerWebsocket;
            } finally {
            }
        }
        bundle.putString("app_ver_name", str3);
        com.google.firebase.CatchingFishPagingLibrary catchingFishPagingLibrary2 = (com.google.firebase.CatchingFishPagingLibrary) this.CatchingFishReduxKtor;
        catchingFishPagingLibrary2.CatchingFishParcelableFAB();
        try {
            str4 = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(catchingFishPagingLibrary2.CatchingFishSnackbar.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            str4 = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", str4);
        try {
            String str5 = ((CatchingFishViewModelMVI) CatchingFishViewMVIMVVM.CatchingFishSnackbar(((CatchingFishLayoutService) ((CatchingFishToolbarPayPal) this.CatchingFishLayout)).CatchingFishReduxKtor())).CatchingFishParcelableFAB;
            if (!TextUtils.isEmpty(str5)) {
                bundle.putString("Goog-Firebase-Installations-Auth", str5);
            }
        } catch (InterruptedException | ExecutionException unused2) {
        }
        bundle.putString("appid", (String) CatchingFishViewMVIMVVM.CatchingFishSnackbar(((CatchingFishLayoutService) ((CatchingFishToolbarPayPal) this.CatchingFishLayout)).CatchingFishCoroutine()));
        bundle.putString("cliv", "fcm-25.0.1");
        CatchingFishGlideGsonWidget catchingFishGlideGsonWidget = (CatchingFishGlideGsonWidget) ((CatchingFishLiveDataHandler) this.CatchingFishViewModelFAB).get();
        CatchingFishStripeAPIMVPMVI catchingFishStripeAPIMVPMVI = (CatchingFishStripeAPIMVPMVI) ((CatchingFishLiveDataHandler) this.CatchingFishViewModelScope).get();
        if (catchingFishGlideGsonWidget == null || catchingFishStripeAPIMVPMVI == null) {
            return;
        }
        CatchingFishXMLLayoutAdMob catchingFishXMLLayoutAdMob = (CatchingFishXMLLayoutAdMob) catchingFishGlideGsonWidget;
        synchronized (catchingFishXMLLayoutAdMob) {
            long currentTimeMillis = System.currentTimeMillis();
            CatchingFishCameraXAndroidX catchingFishCameraXAndroidX = (CatchingFishCameraXAndroidX) catchingFishXMLLayoutAdMob.CatchingFishParcelableFAB.get();
            synchronized (catchingFishCameraXAndroidX) {
                CatchingFishDaggerWebsocket = catchingFishCameraXAndroidX.CatchingFishDaggerWebsocket(CatchingFishCameraXAndroidX.CatchingFishSnackbar, currentTimeMillis);
            }
            if (CatchingFishDaggerWebsocket) {
                synchronized (catchingFishCameraXAndroidX) {
                    catchingFishCameraXAndroidX.CatchingFishParcelableFAB.CatchingFishParcelableFAB(new CatchingFishKtorBundleKtor(1, catchingFishCameraXAndroidX, catchingFishCameraXAndroidX.CatchingFishSnackbar(System.currentTimeMillis())));
                }
                i2 = 3;
            } else {
                i2 = 1;
            }
        }
        if (i2 != 1) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(CatchingFishMVPLiveData.CatchingFishParcelableFlux(i2)));
            bundle.putString("Firebase-Client", catchingFishStripeAPIMVPMVI.CatchingFishParcelableFAB());
        }
    }

    @Override // kotlin.text.CatchingFishFABJUnit
    public CatchingFishLiveDataHandler CatchingFishViewModelFAB(CatchingFishFABDagger catchingFishFABDagger) {
        if (((Set) this.CatchingFishDaggerWebsocket).contains(catchingFishFABDagger)) {
            return ((CatchingFishFABJUnit) this.CatchingFishLayout).CatchingFishViewModelFAB(catchingFishFABDagger);
        }
        throw new CatchingFishBiometricView("Attempting to request an undeclared dependency Provider<" + catchingFishFABDagger + ">.");
    }

    @Override // kotlin.text.CatchingFishFABJUnit
    public CatchingFishFABWebSocket CatchingFishViewModelScope(Class cls) {
        return CatchingFishDaggerWebsocket(CatchingFishFABDagger.CatchingFishParcelableFAB(cls));
    }

    @Override // kotlin.text.CatchingFishFABJUnit
    public Object CatchingFishWorkManager(CatchingFishFABDagger catchingFishFABDagger) {
        if (((Set) this.CatchingFishReduxKtor).contains(catchingFishFABDagger)) {
            return ((CatchingFishFABJUnit) this.CatchingFishLayout).CatchingFishWorkManager(catchingFishFABDagger);
        }
        throw new CatchingFishBiometricView("Attempting to request an undeclared dependency " + catchingFishFABDagger + ".");
    }
}
