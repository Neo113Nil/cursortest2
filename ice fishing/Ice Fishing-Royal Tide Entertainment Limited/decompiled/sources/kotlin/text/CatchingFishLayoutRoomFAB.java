package kotlin.text;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import com.adjust.sdk.Constants;
import com.catchingfish.fishcatcherpro.R;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class CatchingFishLayoutRoomFAB implements CatchingFishGsonFlux {
    public static final CatchingFishViewModelIntent CatchingFishFragmentHandler;
    public static final CatchingFishViewModelIntent CatchingFishLayout;
    public static final CatchingFishViewModelIntent CatchingFishViewModelFAB;
    public static final CatchingFishMoshiFluxMoshi CatchingFishParcelableFAB = new CatchingFishMoshiFluxMoshi(13);
    public static final CatchingFishFluxWorkManager CatchingFishSnackbar = new CatchingFishFluxWorkManager("CLOSED", 1);
    public static final CatchingFishMockkWebSocket CatchingFishCoroutine = new CatchingFishMockkWebSocket(1.0f, 1.0f);
    public static final int[] CatchingFishReduxKtor = new int[2];
    public static final CatchingFishFluxWorkManager CatchingFishDaggerWebsocket = new CatchingFishFluxWorkManager("NO_OWNER", 1);
    public static final byte[] CatchingFishWorkManager = {112, 114, 111, 0};
    public static final byte[] CatchingFishViewModelScope = {112, 114, 109, 0};
    public static final int[] CatchingFishCloudMessaging = {R.attr.colorPrimary};
    public static final int[] CatchingFishEspressoTesting = {R.attr.colorPrimaryVariant};

    static {
        byte b = 0;
        int i = 15;
        CatchingFishViewModelFAB = new CatchingFishViewModelIntent(i, new CatchingFishRealmCustomView(29, b), new CatchingFishPayPalOkHttp(25));
        CatchingFishLayout = new CatchingFishViewModelIntent(i, new CatchingFishKtorBiometric(b), new CatchingFishPayPalOkHttp(26));
        CatchingFishFragmentHandler = new CatchingFishViewModelIntent(i, new CatchingFishKtorBiometric(1), new CatchingFishPayPalOkHttp(27));
    }

    public static final boolean CatchingFish(CatchingFishRealmMVPKtor catchingFishRealmMVPKtor, CatchingFishRealmMVPKtor catchingFishRealmMVPKtor2) {
        if (catchingFishRealmMVPKtor == catchingFishRealmMVPKtor2) {
            return true;
        }
        return Math.abs(catchingFishRealmMVPKtor.CatchingFishParcelableFAB - catchingFishRealmMVPKtor2.CatchingFishParcelableFAB) < 0.001f && Math.abs(catchingFishRealmMVPKtor.CatchingFishSnackbar - catchingFishRealmMVPKtor2.CatchingFishSnackbar) < 0.001f;
    }

    public static void CatchingFishAndroidX(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
        CatchingFishFirebaseDagger.CatchingFishMotionLayout(classCastException, CatchingFishLayoutRoomFAB.class.getName());
        throw classCastException;
    }

    public static final void CatchingFishAnimation(Object[] objArr, int i, int i2) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(objArr, "<this>");
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (r0.getResourceId(0, -1) != (-1)) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void CatchingFishAnimationMockk(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, CatchingFishSnackbarPicasso.CatchingFishFragmentFactory, i, i2);
        boolean z = false;
        if (!obtainStyledAttributes.getBoolean(2, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2.length != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
            for (int i3 : iArr2) {
                if (obtainStyledAttributes2.getResourceId(i3, -1) == -1) {
                    obtainStyledAttributes2.recycle();
                    break;
                }
            }
            obtainStyledAttributes2.recycle();
            z = true;
            obtainStyledAttributes.recycle();
            if (!z) {
                throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
            }
        }
    }

    public static CatchingFishGlideGraphQL[] CatchingFishAppCompat(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, CatchingFishGlideGraphQL[] catchingFishGlideGraphQLArr) {
        if (byteArrayInputStream.available() == 0) {
            return new CatchingFishGlideGraphQL[0];
        }
        if (i != catchingFishGlideGraphQLArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i2 = 0; i2 < i; i2++) {
            CatchingFishStateFlow(byteArrayInputStream, 2);
            String str = new String(CatchingFishPayPalLiveData(byteArrayInputStream, (int) CatchingFishStateFlow(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long CatchingFishStateFlow = CatchingFishStateFlow(byteArrayInputStream, 4);
            int CatchingFishStateFlow2 = (int) CatchingFishStateFlow(byteArrayInputStream, 2);
            CatchingFishGlideGraphQL catchingFishGlideGraphQL = null;
            if (catchingFishGlideGraphQLArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(":");
                }
                String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                int i3 = 0;
                while (true) {
                    if (i3 >= catchingFishGlideGraphQLArr.length) {
                        break;
                    }
                    if (catchingFishGlideGraphQLArr[i3].CatchingFishSnackbar.equals(substring)) {
                        catchingFishGlideGraphQL = catchingFishGlideGraphQLArr[i3];
                        break;
                    }
                    i3++;
                }
            }
            if (catchingFishGlideGraphQL == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            catchingFishGlideGraphQL.CatchingFishReduxKtor = CatchingFishStateFlow;
            int[] CatchingFishMotionLayout = CatchingFishMotionLayout(byteArrayInputStream, CatchingFishStateFlow2);
            if (Arrays.equals(bArr, CatchingFishAdMobFAB.CatchingFishEspressoTesting)) {
                catchingFishGlideGraphQL.CatchingFishDaggerWebsocket = CatchingFishStateFlow2;
                catchingFishGlideGraphQL.CatchingFishViewModelFAB = CatchingFishMotionLayout;
            }
        }
        return catchingFishGlideGraphQLArr;
    }

    public static TypedArray CatchingFishCameraXIntent(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        CatchingFishOkHttp(context, attributeSet, i, i2);
        CatchingFishAnimationMockk(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    public static final View CatchingFishCardViewRealm(View view, CatchingFishServiceHandler catchingFishServiceHandler, View view2) {
        View CatchingFishCardViewRealm;
        if (((Boolean) catchingFishServiceHandler.CatchingFishFragmentHandler(view)).booleanValue()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != view2 && (CatchingFishCardViewRealm = CatchingFishCardViewRealm(childAt, catchingFishServiceHandler, view2)) != null) {
                return CatchingFishCardViewRealm;
            }
        }
        return null;
    }

    public static ColorStateList CatchingFishCardViewView(Drawable drawable) {
        ColorStateList colorStateList;
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !CatchingFishLifecycle.CatchingFish(drawable)) {
            return null;
        }
        colorStateList = CatchingFishLifecycle.CatchingFishDaggerWebsocket(drawable).getColorStateList();
        return colorStateList;
    }

    public static final CatchingFishFluxExoPlayer CatchingFishCloudMessaging(CatchingFishMockkCoroutine catchingFishMockkCoroutine) {
        CatchingFishMockkCoroutine CatchingFishEspressoTesting2 = catchingFishMockkCoroutine.CatchingFishEspressoTesting();
        return CatchingFishEspressoTesting2 != null ? CatchingFishEspressoTesting2.CatchingFishStateLiveData(catchingFishMockkCoroutine, true) : new CatchingFishFluxExoPlayer(0.0f, 0.0f, (int) (catchingFishMockkCoroutine.CatchingFishSensorManager() >> 32), (int) (catchingFishMockkCoroutine.CatchingFishSensorManager() & 4294967295L));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005c, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final View CatchingFishCoroutine(View view, View view2, int i) {
        int nextFocusForwardId;
        View CatchingFishCardViewRealm;
        if (i != 1) {
            if (i == 2 && (nextFocusForwardId = view.getNextFocusForwardId()) != -1) {
                CatchingFishExoPlayerKtor catchingFishExoPlayerKtor = new CatchingFishExoPlayerKtor(nextFocusForwardId, 1);
                View view3 = null;
                while (true) {
                    CatchingFishCardViewRealm = CatchingFishCardViewRealm(view, catchingFishExoPlayerKtor, view3);
                    if (CatchingFishCardViewRealm != null || view == view2) {
                        break;
                    }
                    Object parent = view.getParent();
                    if (parent == null || !(parent instanceof View)) {
                        break;
                    }
                    View view4 = (View) parent;
                    view3 = view;
                    view = view4;
                }
                return CatchingFishCardViewRealm;
            }
        } else if (view.getId() != -1) {
            CatchingFishOkHttpRedux catchingFishOkHttpRedux = new CatchingFishOkHttpRedux(5, view2, view);
            View view5 = null;
            while (true) {
                View CatchingFishCardViewRealm2 = CatchingFishCardViewRealm(view, catchingFishOkHttpRedux, view5);
                if (CatchingFishCardViewRealm2 != null || view == view2) {
                    break;
                }
                Object parent2 = view.getParent();
                if (parent2 == null || !(parent2 instanceof View)) {
                    break;
                }
                View view6 = (View) parent2;
                view5 = view;
                view = view6;
            }
            return null;
        }
        return null;
    }

    public static byte[] CatchingFishCoroutineFlow(CatchingFishGlideGraphQL[] catchingFishGlideGraphQLArr, byte[] bArr) {
        int i = 0;
        int i2 = 0;
        for (CatchingFishGlideGraphQL catchingFishGlideGraphQL : catchingFishGlideGraphQLArr) {
            i2 += ((((catchingFishGlideGraphQL.CatchingFishViewModelScope * 2) + 7) & (-8)) / 8) + (catchingFishGlideGraphQL.CatchingFishDaggerWebsocket * 2) + CatchingFishPayPal(catchingFishGlideGraphQL.CatchingFishParcelableFAB, catchingFishGlideGraphQL.CatchingFishSnackbar, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + catchingFishGlideGraphQL.CatchingFishWorkManager;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i2);
        if (Arrays.equals(bArr, CatchingFishAdMobFAB.CatchingFishFragmentHandler)) {
            int length = catchingFishGlideGraphQLArr.length;
            while (i < length) {
                CatchingFishGlideGraphQL catchingFishGlideGraphQL2 = catchingFishGlideGraphQLArr[i];
                CatchingFishMockkOkHttp(byteArrayOutputStream, catchingFishGlideGraphQL2, CatchingFishPayPal(catchingFishGlideGraphQL2.CatchingFishParcelableFAB, catchingFishGlideGraphQL2.CatchingFishSnackbar, bArr));
                CatchingFishDaggerMVVM(byteArrayOutputStream, catchingFishGlideGraphQL2);
                i++;
            }
        } else {
            for (CatchingFishGlideGraphQL catchingFishGlideGraphQL3 : catchingFishGlideGraphQLArr) {
                CatchingFishMockkOkHttp(byteArrayOutputStream, catchingFishGlideGraphQL3, CatchingFishPayPal(catchingFishGlideGraphQL3.CatchingFishParcelableFAB, catchingFishGlideGraphQL3.CatchingFishSnackbar, bArr));
            }
            int length2 = catchingFishGlideGraphQLArr.length;
            while (i < length2) {
                CatchingFishDaggerMVVM(byteArrayOutputStream, catchingFishGlideGraphQLArr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == i2) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i2);
    }

    public static Drawable CatchingFishCustomView(Context context, int i) {
        return CatchingFishCoroutineRedux.CatchingFishSnackbar().CatchingFishCoroutine(context, i);
    }

    public static final Object CatchingFishCustomViewJUnit(CatchingFishManifestMockk catchingFishManifestMockk, Object obj, Object obj2, CatchingFishMockkView catchingFishMockkView, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        Object CatchingFishDaggerWebsocket2;
        Object CatchingFishRecyclerView = CatchingFishAdMobFAB.CatchingFishRecyclerView(catchingFishManifestMockk, obj2);
        try {
            CatchingFishContextFirebase catchingFishContextFirebase = new CatchingFishContextFirebase(catchingFishWebsocketGradle, catchingFishManifestMockk);
            if (catchingFishMockkView == null) {
                CatchingFishDaggerWebsocket2 = CatchingFishBiometricBundle.CatchingFishParcelable(catchingFishMockkView, obj, catchingFishContextFirebase);
            } else {
                CatchingFishFragmentHandler(2, catchingFishMockkView);
                CatchingFishDaggerWebsocket2 = catchingFishMockkView.CatchingFishDaggerWebsocket(obj, catchingFishContextFirebase);
            }
            CatchingFishAdMobFAB.CatchingFishEspressoMockk(catchingFishManifestMockk, CatchingFishRecyclerView);
            if (CatchingFishDaggerWebsocket2 == CatchingFishXMLLayoutMockk.CatchingFishReduxKtor) {
                CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishWebsocketGradle, "frame");
            }
            return CatchingFishDaggerWebsocket2;
        } catch (Throwable th) {
            CatchingFishAdMobFAB.CatchingFishEspressoMockk(catchingFishManifestMockk, CatchingFishRecyclerView);
            throw th;
        }
    }

    public static final float[] CatchingFishDagger(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f = fArr2[0];
        float f2 = fArr2[1];
        float f3 = fArr2[2];
        fArr2[0] = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        fArr2[1] = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        fArr2[2] = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        return fArr2;
    }

    public static final CatchingFishServiceFAB CatchingFishDaggerHiltFAB(CatchingFishEspressoHilt catchingFishEspressoHilt, CatchingFishEspressoHilt catchingFishEspressoHilt2) {
        if (catchingFishEspressoHilt == catchingFishEspressoHilt2) {
            return new CatchingFishAnimationMockk(catchingFishEspressoHilt, catchingFishEspressoHilt, 1);
        }
        long j = catchingFishEspressoHilt.CatchingFishSnackbar;
        long j2 = CatchingFishMockkSharedFlow.CatchingFishParcelableFAB;
        return (CatchingFishMockkSharedFlow.CatchingFishParcelableFAB(j, j2) && CatchingFishMockkSharedFlow.CatchingFishParcelableFAB(catchingFishEspressoHilt2.CatchingFishSnackbar, j2)) ? new CatchingFishMVPCardViewKtor((CatchingFishMVIFragment) catchingFishEspressoHilt, (CatchingFishMVIFragment) catchingFishEspressoHilt2) : new CatchingFishServiceFAB(catchingFishEspressoHilt, catchingFishEspressoHilt2, 0);
    }

    public static void CatchingFishDaggerMVVM(ByteArrayOutputStream byteArrayOutputStream, CatchingFishGlideGraphQL catchingFishGlideGraphQL) {
        CatchingFishPicasso(byteArrayOutputStream, catchingFishGlideGraphQL);
        int i = catchingFishGlideGraphQL.CatchingFishViewModelScope;
        int[] iArr = catchingFishGlideGraphQL.CatchingFishViewModelFAB;
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            CatchingFishRetrofitMVI(byteArrayOutputStream, i4 - i3);
            i2++;
            i3 = i4;
        }
        byte[] bArr = new byte[(((i * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : catchingFishGlideGraphQL.CatchingFishLayout.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i5 = intValue / 8;
                bArr[i5] = (byte) (bArr[i5] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i6 = intValue + i;
                int i7 = i6 / 8;
                bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0082 -> B:13:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0085 -> B:13:0x0065). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object CatchingFishDaggerWebsocket(List list, CatchingFishAdMobWebSocket catchingFishAdMobWebSocket, CatchingFishStateFlowGson catchingFishStateFlowGson) {
        CatchingFishCustomViewMVI catchingFishCustomViewMVI;
        int i;
        List list2;
        CatchingFishRoomGoogleMaps catchingFishRoomGoogleMaps;
        Iterator it;
        Throwable th;
        if (catchingFishStateFlowGson instanceof CatchingFishCustomViewMVI) {
            catchingFishCustomViewMVI = (CatchingFishCustomViewMVI) catchingFishStateFlowGson;
            int i2 = catchingFishCustomViewMVI.CatchingFishFragmentHandler;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                catchingFishCustomViewMVI.CatchingFishFragmentHandler = i2 - Integer.MIN_VALUE;
                Object obj = catchingFishCustomViewMVI.CatchingFishLayout;
                i = catchingFishCustomViewMVI.CatchingFishFragmentHandler;
                Object obj2 = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
                if (i != 0) {
                    CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                    ArrayList arrayList = new ArrayList();
                    CatchingFishOkHttpMoshi catchingFishOkHttpMoshi = new CatchingFishOkHttpMoshi(list, arrayList, null);
                    catchingFishCustomViewMVI.CatchingFishViewModelScope = arrayList;
                    catchingFishCustomViewMVI.CatchingFishFragmentHandler = 1;
                    if (catchingFishAdMobWebSocket.CatchingFishParcelableFAB(catchingFishOkHttpMoshi, catchingFishCustomViewMVI) == obj2) {
                        return obj2;
                    }
                    list2 = arrayList;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = catchingFishCustomViewMVI.CatchingFishViewModelFAB;
                        catchingFishRoomGoogleMaps = (CatchingFishRoomGoogleMaps) catchingFishCustomViewMVI.CatchingFishViewModelScope;
                        try {
                            CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                        } catch (Throwable th2) {
                            Object obj3 = catchingFishRoomGoogleMaps.CatchingFishReduxKtor;
                            if (obj3 == null) {
                                catchingFishRoomGoogleMaps.CatchingFishReduxKtor = th2;
                            } else {
                                CatchingFishAdMobFAB.CatchingFishViewModelFAB((Throwable) obj3, th2);
                            }
                        }
                        while (it.hasNext()) {
                            CatchingFishServiceHandler catchingFishServiceHandler = (CatchingFishServiceHandler) it.next();
                            catchingFishCustomViewMVI.CatchingFishViewModelScope = catchingFishRoomGoogleMaps;
                            catchingFishCustomViewMVI.CatchingFishViewModelFAB = it;
                            catchingFishCustomViewMVI.CatchingFishFragmentHandler = 2;
                            if (catchingFishServiceHandler.CatchingFishFragmentHandler(catchingFishCustomViewMVI) == obj2) {
                                return obj2;
                            }
                        }
                        th = (Throwable) catchingFishRoomGoogleMaps.CatchingFishReduxKtor;
                        if (th == null) {
                            return CatchingFishRealmContext.CatchingFishParcelableFAB;
                        }
                        throw th;
                    }
                    list2 = (List) catchingFishCustomViewMVI.CatchingFishViewModelScope;
                    CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                }
                catchingFishRoomGoogleMaps = new CatchingFishRoomGoogleMaps();
                it = list2.iterator();
                while (it.hasNext()) {
                }
                th = (Throwable) catchingFishRoomGoogleMaps.CatchingFishReduxKtor;
                if (th == null) {
                }
            }
        }
        catchingFishCustomViewMVI = new CatchingFishCustomViewMVI(catchingFishStateFlowGson);
        Object obj4 = catchingFishCustomViewMVI.CatchingFishLayout;
        i = catchingFishCustomViewMVI.CatchingFishFragmentHandler;
        Object obj22 = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
        if (i != 0) {
        }
        catchingFishRoomGoogleMaps = new CatchingFishRoomGoogleMaps();
        it = list2.iterator();
        while (it.hasNext()) {
        }
        th = (Throwable) catchingFishRoomGoogleMaps.CatchingFishReduxKtor;
        if (th == null) {
        }
    }

    public static CatchingFishGlideGraphQL[] CatchingFishDataStoreIntent(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, CatchingFishAdMobFAB.CatchingFishLayout)) {
            throw new IllegalStateException("Unsupported version");
        }
        int CatchingFishStateFlow = (int) CatchingFishStateFlow(fileInputStream, 1);
        byte[] CatchingFishLayoutInflater = CatchingFishLayoutInflater(fileInputStream, (int) CatchingFishStateFlow(fileInputStream, 4), (int) CatchingFishStateFlow(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(CatchingFishLayoutInflater);
        try {
            CatchingFishGlideGraphQL[] CatchingFishJUnitRealm = CatchingFishJUnitRealm(byteArrayInputStream, str, CatchingFishStateFlow);
            byteArrayInputStream.close();
            return CatchingFishJUnitRealm;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static final float[] CatchingFishEspressoMockk(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f = fArr[0] * fArr2[0];
        float f2 = fArr[3];
        float f3 = fArr2[1];
        float f4 = fArr[6];
        float f5 = fArr2[2];
        fArr3[0] = (f4 * f5) + (f2 * f3) + f;
        float f6 = fArr[1];
        float f7 = fArr2[0];
        float f8 = fArr[4];
        float f9 = fArr[7];
        float f10 = f9 * f5;
        fArr3[1] = f10 + (f3 * f8) + (f6 * f7);
        float f11 = fArr[2] * f7;
        float f12 = fArr[5];
        float f13 = (fArr2[1] * f12) + f11;
        float f14 = fArr[8];
        fArr3[2] = (f5 * f14) + f13;
        float f15 = fArr[0];
        float f16 = fArr2[3] * f15;
        float f17 = fArr2[4];
        float f18 = (f2 * f17) + f16;
        float f19 = fArr2[5];
        fArr3[3] = (f4 * f19) + f18;
        float f20 = fArr[1];
        float f21 = fArr2[3];
        float f22 = f8 * f17;
        fArr3[4] = (f9 * f19) + f22 + (f20 * f21);
        float f23 = fArr[2];
        float f24 = f19 * f14;
        fArr3[5] = f24 + (f12 * fArr2[4]) + (f21 * f23);
        float f25 = f15 * fArr2[6];
        float f26 = fArr[3];
        float f27 = fArr2[7];
        float f28 = (f26 * f27) + f25;
        float f29 = fArr2[8];
        fArr3[6] = (f4 * f29) + f28;
        float f30 = fArr2[6];
        float f31 = f9 * f29;
        fArr3[7] = f31 + (fArr[4] * f27) + (f20 * f30);
        float f32 = f14 * f29;
        fArr3[8] = f32 + (fArr[5] * fArr2[7]) + (f23 * f30);
        return fArr3;
    }

    public static final CatchingFishFluxExoPlayer CatchingFishEspressoTesting(CatchingFishDaggerToolbar catchingFishDaggerToolbar) {
        CatchingFishMockkCoroutine CatchingFishParcelableFlux = CatchingFishParcelableFlux(catchingFishDaggerToolbar);
        float CatchingFishSensorManager = (int) (CatchingFishParcelableFlux.CatchingFishSensorManager() >> 32);
        float CatchingFishSensorManager2 = (int) (CatchingFishParcelableFlux.CatchingFishSensorManager() & 4294967295L);
        CatchingFishFluxExoPlayer CatchingFishStateLiveData = CatchingFishParcelableFlux.CatchingFishStateLiveData(catchingFishDaggerToolbar, true);
        float f = CatchingFishStateLiveData.CatchingFishParcelableFAB;
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > CatchingFishSensorManager) {
            f = CatchingFishSensorManager;
        }
        float f2 = CatchingFishStateLiveData.CatchingFishSnackbar;
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > CatchingFishSensorManager2) {
            f2 = CatchingFishSensorManager2;
        }
        float f3 = CatchingFishStateLiveData.CatchingFishCoroutine;
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f3 <= CatchingFishSensorManager) {
            CatchingFishSensorManager = f3;
        }
        float f4 = CatchingFishStateLiveData.CatchingFishReduxKtor;
        float f5 = f4 >= 0.0f ? f4 : 0.0f;
        if (f5 <= CatchingFishSensorManager2) {
            CatchingFishSensorManager2 = f5;
        }
        if (f == CatchingFishSensorManager || f2 == CatchingFishSensorManager2) {
            return CatchingFishFluxExoPlayer.CatchingFishDaggerWebsocket;
        }
        long CatchingFishViewModelFAB2 = CatchingFishParcelableFlux.CatchingFishViewModelFAB((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
        long CatchingFishViewModelFAB3 = CatchingFishParcelableFlux.CatchingFishViewModelFAB((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(CatchingFishSensorManager) << 32));
        long CatchingFishViewModelFAB4 = CatchingFishParcelableFlux.CatchingFishViewModelFAB((Float.floatToRawIntBits(CatchingFishSensorManager) << 32) | (Float.floatToRawIntBits(CatchingFishSensorManager2) & 4294967295L));
        long CatchingFishViewModelFAB5 = CatchingFishParcelableFlux.CatchingFishViewModelFAB((Float.floatToRawIntBits(CatchingFishSensorManager2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
        float intBitsToFloat = Float.intBitsToFloat((int) (CatchingFishViewModelFAB2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (CatchingFishViewModelFAB3 >> 32));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (CatchingFishViewModelFAB5 >> 32));
        float intBitsToFloat4 = Float.intBitsToFloat((int) (CatchingFishViewModelFAB4 >> 32));
        float min = Math.min(intBitsToFloat, Math.min(intBitsToFloat2, Math.min(intBitsToFloat3, intBitsToFloat4)));
        float max = Math.max(intBitsToFloat, Math.max(intBitsToFloat2, Math.max(intBitsToFloat3, intBitsToFloat4)));
        float intBitsToFloat5 = Float.intBitsToFloat((int) (CatchingFishViewModelFAB2 & 4294967295L));
        float intBitsToFloat6 = Float.intBitsToFloat((int) (CatchingFishViewModelFAB3 & 4294967295L));
        float intBitsToFloat7 = Float.intBitsToFloat((int) (CatchingFishViewModelFAB5 & 4294967295L));
        float intBitsToFloat8 = Float.intBitsToFloat((int) (CatchingFishViewModelFAB4 & 4294967295L));
        return new CatchingFishFluxExoPlayer(min, Math.min(intBitsToFloat5, Math.min(intBitsToFloat6, Math.min(intBitsToFloat7, intBitsToFloat8))), max, Math.max(intBitsToFloat5, Math.max(intBitsToFloat6, Math.max(intBitsToFloat7, intBitsToFloat8))));
    }

    public static void CatchingFishFirebase(ByteArrayOutputStream byteArrayOutputStream, long j, int i) {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static final float[] CatchingFishFragmentFactory(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[3];
        float f3 = fArr[6];
        float f4 = fArr[1];
        float f5 = fArr[4];
        float f6 = fArr[7];
        float f7 = fArr[2];
        float f8 = fArr[5];
        float f9 = fArr[8];
        float f10 = (f5 * f9) - (f6 * f8);
        float f11 = (f6 * f7) - (f4 * f9);
        float f12 = (f4 * f8) - (f5 * f7);
        float f13 = (f3 * f12) + (f2 * f11) + (f * f10);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f10 / f13;
        fArr2[1] = f11 / f13;
        fArr2[2] = f12 / f13;
        fArr2[3] = ((f3 * f8) - (f2 * f9)) / f13;
        fArr2[4] = ((f9 * f) - (f3 * f7)) / f13;
        fArr2[5] = ((f7 * f2) - (f8 * f)) / f13;
        fArr2[6] = ((f2 * f6) - (f3 * f5)) / f13;
        fArr2[7] = ((f3 * f4) - (f6 * f)) / f13;
        fArr2[8] = ((f * f5) - (f2 * f4)) / f13;
        return fArr2;
    }

    public static void CatchingFishFragmentHandler(int i, Object obj) {
        if (obj == null || CatchingFishJobScheduler(i, obj)) {
            return;
        }
        CatchingFishAndroidX(obj, "kotlin.jvm.functions.Function" + i);
        throw null;
    }

    public static final int CatchingFishGradleLiveData(float f, float[] fArr, int i) {
        float f2 = f >= 0.0f ? f : 0.0f;
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (Math.abs(f2 - f) > 1.05E-6f) {
            f2 = Float.NaN;
        }
        fArr[i] = f2;
        return !Float.isNaN(f2) ? 1 : 0;
    }

    public static List CatchingFishGradleManifest(Resources resources, int i) {
        if (i == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (obtainTypedArray.getType(0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static final Object CatchingFishGsonAppCompat(CatchingFishFluxSnackbar catchingFishFluxSnackbar, long j, CatchingFishMockkView catchingFishMockkView) {
        while (true) {
            if (catchingFishFluxSnackbar.CatchingFishCoroutine >= j && !catchingFishFluxSnackbar.CatchingFishCoroutine()) {
                return catchingFishFluxSnackbar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = CatchingFishJUnitLifecycle.CatchingFishParcelableFAB;
            Object obj = atomicReferenceFieldUpdater.get(catchingFishFluxSnackbar);
            CatchingFishFluxWorkManager catchingFishFluxWorkManager = CatchingFishSnackbar;
            if (obj == catchingFishFluxWorkManager) {
                return catchingFishFluxWorkManager;
            }
            CatchingFishFluxSnackbar catchingFishFluxSnackbar2 = (CatchingFishFluxSnackbar) ((CatchingFishJUnitLifecycle) obj);
            if (catchingFishFluxSnackbar2 == null) {
                catchingFishFluxSnackbar2 = (CatchingFishFluxSnackbar) catchingFishMockkView.CatchingFishDaggerWebsocket(Long.valueOf(catchingFishFluxSnackbar.CatchingFishCoroutine + 1), catchingFishFluxSnackbar);
                while (!atomicReferenceFieldUpdater.compareAndSet(catchingFishFluxSnackbar, null, catchingFishFluxSnackbar2)) {
                    if (atomicReferenceFieldUpdater.get(catchingFishFluxSnackbar) != null) {
                        break;
                    }
                }
                if (catchingFishFluxSnackbar.CatchingFishCoroutine()) {
                    catchingFishFluxSnackbar.CatchingFishReduxKtor();
                }
            }
            catchingFishFluxSnackbar = catchingFishFluxSnackbar2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0117 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static CatchingFishGsonHiltMoshi CatchingFishHandler(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        int i;
        int i2;
        String str;
        String str2;
        ?? r3;
        long j;
        Throwable th;
        TypedArray typedArray;
        boolean isTerminated;
        do {
            next = xmlResourceParser.next();
            i = 2;
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            CatchingFishMoshiDaggerHilt(xmlResourceParser);
            return null;
        }
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), CatchingFishToolbarKtor.CatchingFishSnackbar);
        int i3 = 0;
        String string = obtainAttributes.getString(0);
        String string2 = obtainAttributes.getString(5);
        String string3 = obtainAttributes.getString(6);
        String string4 = obtainAttributes.getString(2);
        int resourceId = obtainAttributes.getResourceId(1, 0);
        int i4 = 3;
        int integer = obtainAttributes.getInteger(3, 1);
        int integer2 = obtainAttributes.getInteger(4, 500);
        String string5 = obtainAttributes.getString(7);
        obtainAttributes.recycle();
        if (string == null || string2 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), CatchingFishToolbarKtor.CatchingFishCoroutine);
                        int i5 = obtainAttributes2.getInt(obtainAttributes2.hasValue(8) ? 8 : 1, Constants.MINIMAL_ERROR_STATUS_CODE);
                        boolean z = 1 == obtainAttributes2.getInt(obtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i6 = obtainAttributes2.hasValue(9) ? 9 : 3;
                        String string6 = obtainAttributes2.getString(obtainAttributes2.hasValue(7) ? 7 : 4);
                        int i7 = obtainAttributes2.getInt(i6, 0);
                        int i8 = obtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = obtainAttributes2.getResourceId(i8, 0);
                        String string7 = obtainAttributes2.getString(i8);
                        obtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            CatchingFishMoshiDaggerHilt(xmlResourceParser);
                        }
                        arrayList.add(new CatchingFishFirebaseFAB(string7, i5, z, string6, i7, resourceId2));
                    } else {
                        CatchingFishMoshiDaggerHilt(xmlResourceParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new CatchingFishFABSnackbarMVVM((CatchingFishFirebaseFAB[]) arrayList.toArray(new CatchingFishFirebaseFAB[0]));
        }
        List CatchingFishGradleManifest = CatchingFishGradleManifest(resources, resourceId);
        ArrayList arrayList2 = new ArrayList();
        while (xmlResourceParser.next() != i4) {
            if (xmlResourceParser.getEventType() == i) {
                if (xmlResourceParser.getName().equals("fallback")) {
                    TypedArray obtainAttributes3 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), CatchingFishToolbarKtor.CatchingFishReduxKtor);
                    int i9 = integer;
                    try {
                        String string8 = obtainAttributes3.getString(i3);
                        String string9 = obtainAttributes3.getString(1);
                        String string10 = obtainAttributes3.getString(i);
                        if (string8 == null) {
                            r3 = obtainAttributes3;
                            j = 1;
                            throw new XmlPullParserException("query attribute must be set in fallback element");
                        }
                        while (xmlResourceParser.next() != 3) {
                            try {
                                CatchingFishMoshiDaggerHilt(xmlResourceParser);
                            } catch (Throwable th2) {
                                th = th2;
                                typedArray = obtainAttributes3;
                                j = 1;
                            }
                        }
                        try {
                            r3 = obtainAttributes3;
                            str2 = string4;
                            i2 = i9;
                            str = string3;
                            j = 1;
                            try {
                                CatchingFishViewAsyncTask catchingFishViewAsyncTask = new CatchingFishViewAsyncTask(string, string2, string8, CatchingFishGradleManifest, string9, string10);
                                if (r3 instanceof AutoCloseable) {
                                    ((AutoCloseable) r3).close();
                                } else if (r3 instanceof ExecutorService) {
                                    ExecutorService executorService = (ExecutorService) r3;
                                    if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                                        executorService.shutdown();
                                        boolean z2 = false;
                                        while (!isTerminated) {
                                            try {
                                                isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                                            } catch (InterruptedException unused) {
                                                if (!z2) {
                                                    executorService.shutdownNow();
                                                    z2 = true;
                                                }
                                            }
                                        }
                                        if (z2) {
                                            Thread.currentThread().interrupt();
                                        }
                                    }
                                } else {
                                    r3.recycle();
                                }
                                arrayList2.add(catchingFishViewAsyncTask);
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            r3 = obtainAttributes3;
                            j = 1;
                            th = th;
                            typedArray = r3;
                            if (typedArray != null) {
                            }
                        }
                        th = th3;
                    } catch (Throwable th5) {
                        th = th5;
                        r3 = obtainAttributes3;
                    }
                    th = th;
                    typedArray = r3;
                    if (typedArray != null) {
                        throw th;
                    }
                    try {
                        if (typedArray instanceof AutoCloseable) {
                            typedArray.close();
                            throw th;
                        }
                        if (!(typedArray instanceof ExecutorService)) {
                            typedArray.recycle();
                            throw th;
                        }
                        ExecutorService executorService2 = (ExecutorService) typedArray;
                        if (executorService2 == ForkJoinPool.commonPool()) {
                            throw th;
                        }
                        boolean isTerminated2 = executorService2.isTerminated();
                        if (isTerminated2) {
                            throw th;
                        }
                        executorService2.shutdown();
                        boolean z3 = false;
                        while (!isTerminated2) {
                            try {
                                isTerminated2 = executorService2.awaitTermination(j, TimeUnit.DAYS);
                            } catch (InterruptedException unused2) {
                                if (!z3) {
                                    executorService2.shutdownNow();
                                    z3 = true;
                                }
                            }
                        }
                        if (!z3) {
                            throw th;
                        }
                        Thread.currentThread().interrupt();
                        throw th;
                    } catch (Throwable th6) {
                        th.addSuppressed(th6);
                        throw th;
                    }
                }
                i2 = integer;
                str = string3;
                str2 = string4;
                CatchingFishMoshiDaggerHilt(xmlResourceParser);
                integer = i2;
                string3 = str;
                string4 = str2;
                i = 2;
                i3 = 0;
                i4 = 3;
            }
        }
        int i10 = integer;
        String str3 = string3;
        String str4 = string4;
        if (!arrayList2.isEmpty()) {
            return new CatchingFishKtorWebsocket(arrayList2, i10, integer2, string5);
        }
        if (str3 == null) {
            throw new IllegalArgumentException("The provider font XML requires query attribute or fallback children.");
        }
        arrayList2.add(new CatchingFishViewAsyncTask(string, string2, str3, CatchingFishGradleManifest, null, null));
        if (str4 != null) {
            arrayList2.add(new CatchingFishViewAsyncTask(string, string2, str4, CatchingFishGradleManifest, null, null));
        }
        return new CatchingFishKtorWebsocket(arrayList2, i10, integer2, string5);
    }

    public static CatchingFishGlideGraphQL[] CatchingFishJUnitRealm(ByteArrayInputStream byteArrayInputStream, String str, int i) {
        int i2 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new CatchingFishGlideGraphQL[0];
        }
        CatchingFishGlideGraphQL[] catchingFishGlideGraphQLArr = new CatchingFishGlideGraphQL[i];
        for (int i3 = 0; i3 < i; i3++) {
            int CatchingFishStateFlow = (int) CatchingFishStateFlow(byteArrayInputStream, 2);
            int CatchingFishStateFlow2 = (int) CatchingFishStateFlow(byteArrayInputStream, 2);
            catchingFishGlideGraphQLArr[i3] = new CatchingFishGlideGraphQL(str, new String(CatchingFishPayPalLiveData(byteArrayInputStream, CatchingFishStateFlow), StandardCharsets.UTF_8), CatchingFishStateFlow(byteArrayInputStream, 4), CatchingFishStateFlow2, (int) CatchingFishStateFlow(byteArrayInputStream, 4), (int) CatchingFishStateFlow(byteArrayInputStream, 4), new int[CatchingFishStateFlow2], new TreeMap());
        }
        int i4 = 0;
        while (i4 < i) {
            CatchingFishGlideGraphQL catchingFishGlideGraphQL = catchingFishGlideGraphQLArr[i4];
            int available = byteArrayInputStream.available();
            int i5 = catchingFishGlideGraphQL.CatchingFishWorkManager;
            int i6 = catchingFishGlideGraphQL.CatchingFishViewModelScope;
            TreeMap treeMap = catchingFishGlideGraphQL.CatchingFishLayout;
            int i7 = available - i5;
            int i8 = i2;
            while (byteArrayInputStream.available() > i7) {
                i8 += (int) CatchingFishStateFlow(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i8), 1);
                int CatchingFishStateFlow3 = (int) CatchingFishStateFlow(byteArrayInputStream, 2);
                while (CatchingFishStateFlow3 > 0) {
                    CatchingFishStateFlow(byteArrayInputStream, 2);
                    int CatchingFishStateFlow4 = (int) CatchingFishStateFlow(byteArrayInputStream, 1);
                    if (CatchingFishStateFlow4 != 6 && CatchingFishStateFlow4 != 7) {
                        while (CatchingFishStateFlow4 > 0) {
                            CatchingFishStateFlow(byteArrayInputStream, 1);
                            int i9 = i2;
                            int i10 = i4;
                            for (int CatchingFishStateFlow5 = (int) CatchingFishStateFlow(byteArrayInputStream, 1); CatchingFishStateFlow5 > 0; CatchingFishStateFlow5--) {
                                CatchingFishStateFlow(byteArrayInputStream, 2);
                            }
                            CatchingFishStateFlow4--;
                            i2 = i9;
                            i4 = i10;
                        }
                    }
                    CatchingFishStateFlow3--;
                    i2 = i2;
                    i4 = i4;
                }
            }
            int i11 = i2;
            int i12 = i4;
            if (byteArrayInputStream.available() != i7) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            catchingFishGlideGraphQL.CatchingFishViewModelFAB = CatchingFishMotionLayout(byteArrayInputStream, catchingFishGlideGraphQL.CatchingFishDaggerWebsocket);
            BitSet valueOf = BitSet.valueOf(CatchingFishPayPalLiveData(byteArrayInputStream, (((i6 * 2) + 7) & (-8)) / 8));
            for (int i13 = i11; i13 < i6; i13++) {
                int i14 = valueOf.get(i13) ? 2 : i11;
                if (valueOf.get(i13 + i6)) {
                    i14 |= 4;
                }
                if (i14 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i13));
                    if (num == null) {
                        num = Integer.valueOf(i11);
                    }
                    treeMap.put(Integer.valueOf(i13), Integer.valueOf(i14 | num.intValue()));
                }
            }
            i4 = i12 + 1;
            i2 = i11;
        }
        return catchingFishGlideGraphQLArr;
    }

    public static byte[] CatchingFishJetpackCompose(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static boolean CatchingFishJobScheduler(int i, Object obj) {
        int i2;
        if (obj instanceof CatchingFishIntentAnimation) {
            if (obj instanceof CatchingFishDaggerStateFlow) {
                i2 = ((CatchingFishDaggerStateFlow) obj).CatchingFishSnackbar();
            } else if (obj instanceof CatchingFishJUnitGlide) {
                i2 = 0;
            } else if (obj instanceof CatchingFishServiceHandler) {
                i2 = 1;
            } else if (obj instanceof CatchingFishMockkView) {
                i2 = 2;
            } else if (obj instanceof CatchingFishJobSchedulerMVP) {
                i2 = 3;
            } else if (obj instanceof CatchingFishCameraXGlide) {
                i2 = 4;
            } else {
                boolean z = obj instanceof CatchingFishFluxOkHttp;
                i2 = z ? 5 : z ? 6 : z ? 7 : z ? 8 : z ? 9 : z ? 10 : z ? 11 : z ? 13 : z ? 14 : z ? 15 : z ? 16 : z ? 17 : z ? 18 : z ? 19 : z ? 20 : z ? 21 : -1;
            }
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static Map CatchingFishLayout(Object obj) {
        if ((obj instanceof CatchingFishCardViewFAB) && !(obj instanceof CatchingFishSnackbarMVP)) {
            CatchingFishAndroidX(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            CatchingFishFirebaseDagger.CatchingFishMotionLayout(e, CatchingFishLayoutRoomFAB.class.getName());
            throw e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r0.finished() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] CatchingFishLayoutInflater(FileInputStream fileInputStream, int i, int i2) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int i4 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int read = fileInputStream.read(bArr2);
                if (read < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
                inflater.setInput(bArr2, 0, read);
                try {
                    i4 += inflater.inflate(bArr, i4, i2 - i4);
                    i3 += read;
                } catch (DataFormatException e) {
                    throw new IllegalStateException(e.getMessage());
                }
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
        } finally {
            inflater.end();
        }
    }

    public static final void CatchingFishMVVMAppCompat(CatchingFishKtorMockk catchingFishKtorMockk, CatchingFishWebsocketGradle catchingFishWebsocketGradle, boolean z) {
        Object obj = CatchingFishKtorMockk.CatchingFishFragmentHandler.get(catchingFishKtorMockk);
        Throwable CatchingFishReduxKtor2 = catchingFishKtorMockk.CatchingFishReduxKtor(obj);
        Object CatchingFishViewModelFAB2 = CatchingFishReduxKtor2 != null ? CatchingFishDaggerBiometric.CatchingFishViewModelFAB(CatchingFishReduxKtor2) : catchingFishKtorMockk.CatchingFishDaggerWebsocket(obj);
        if (!z) {
            catchingFishWebsocketGradle.CatchingFishViewModelFAB(CatchingFishViewModelFAB2);
            return;
        }
        CatchingFishFirebaseDagger.CatchingFishStateLiveData(catchingFishWebsocketGradle, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        CatchingFishPayPalRoom catchingFishPayPalRoom = (CatchingFishPayPalRoom) catchingFishWebsocketGradle;
        CatchingFishStateFlowGson catchingFishStateFlowGson = catchingFishPayPalRoom.CatchingFishViewModelFAB;
        Object obj2 = catchingFishPayPalRoom.CatchingFishFragmentHandler;
        CatchingFishManifestMockk context = catchingFishStateFlowGson.getContext();
        Object CatchingFishRecyclerView = CatchingFishAdMobFAB.CatchingFishRecyclerView(context, obj2);
        CatchingFishToastIntent CatchingFishAnimation = CatchingFishRecyclerView != CatchingFishAdMobFAB.CatchingFishStateLiveData ? CatchingFishRobolectricHilt.CatchingFishAnimation(catchingFishStateFlowGson, context, CatchingFishRecyclerView) : null;
        try {
            catchingFishStateFlowGson.CatchingFishViewModelFAB(CatchingFishViewModelFAB2);
            if (CatchingFishAnimation == null || CatchingFishAnimation.CatchingFishDaggerMVVM()) {
                CatchingFishAdMobFAB.CatchingFishEspressoMockk(context, CatchingFishRecyclerView);
            }
        } catch (Throwable th) {
            if (CatchingFishAnimation == null || CatchingFishAnimation.CatchingFishDaggerMVVM()) {
                CatchingFishAdMobFAB.CatchingFishEspressoMockk(context, CatchingFishRecyclerView);
            }
            throw th;
        }
    }

    public static void CatchingFishMockkOkHttp(ByteArrayOutputStream byteArrayOutputStream, CatchingFishGlideGraphQL catchingFishGlideGraphQL, String str) {
        Charset charset = StandardCharsets.UTF_8;
        CatchingFishRetrofitMVI(byteArrayOutputStream, str.getBytes(charset).length);
        CatchingFishRetrofitMVI(byteArrayOutputStream, catchingFishGlideGraphQL.CatchingFishDaggerWebsocket);
        CatchingFishFirebase(byteArrayOutputStream, catchingFishGlideGraphQL.CatchingFishWorkManager, 4);
        CatchingFishFirebase(byteArrayOutputStream, catchingFishGlideGraphQL.CatchingFishCoroutine, 4);
        CatchingFishFirebase(byteArrayOutputStream, catchingFishGlideGraphQL.CatchingFishViewModelScope, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void CatchingFishMoshiDaggerHilt(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public static int[] CatchingFishMotionLayout(ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += (int) CatchingFishStateFlow(byteArrayInputStream, 2);
            iArr[i3] = i2;
        }
        return iArr;
    }

    public static final CatchingFishStripeAPIBundle CatchingFishMutableLiveData(CatchingFishRoomViewGson catchingFishRoomViewGson, boolean z, CatchingFishSnackbarRoom catchingFishSnackbarRoom) {
        if (catchingFishRoomViewGson instanceof CatchingFishPicassoView) {
            return ((CatchingFishPicassoView) catchingFishRoomViewGson).CatchingFishPayPalLiveData(z, catchingFishSnackbarRoom);
        }
        return catchingFishRoomViewGson.CatchingFishCardViewRealm(catchingFishSnackbarRoom.CatchingFishCloudMessaging(), z, new CatchingFishPayPalToast(1, catchingFishSnackbarRoom, CatchingFishSnackbarRoom.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 0, 1));
    }

    public static byte[] CatchingFishNavigation(ArrayDeque arrayDeque, int i) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i) {
            return bArr;
        }
        int length = i - bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, i);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int min = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i - length, min);
            length -= min;
        }
        return copyOf;
    }

    public static byte[] CatchingFishNavigationGson(CatchingFishRobolectricMVP catchingFishRobolectricMVP) {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i = 0;
        while (i < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i2 = 0;
            while (i2 < min2) {
                int read = catchingFishRobolectricMVP.read(bArr, i2, min2 - i2);
                if (read == -1) {
                    return CatchingFishNavigation(arrayDeque, i);
                }
                i2 += read;
                i += read;
            }
            long j = min * (min < 4096 ? 4 : 2);
            min = j > 2147483647L ? Integer.MAX_VALUE : j < -2147483648L ? Integer.MIN_VALUE : (int) j;
        }
        if (catchingFishRobolectricMVP.read() == -1) {
            return CatchingFishNavigation(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static void CatchingFishOkHttp(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, CatchingFishSnackbarPicasso.CatchingFishFragmentFactory, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                CatchingFishStateLiveData(context, CatchingFishEspressoTesting, "Theme.MaterialComponents");
            }
        }
        CatchingFishStateLiveData(context, CatchingFishCloudMessaging, "Theme.AppCompat");
    }

    public static CatchingFishGlideGraphQL[] CatchingFishParcelable(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, CatchingFishGlideGraphQL[] catchingFishGlideGraphQLArr) {
        byte[] bArr3 = CatchingFishAdMobFAB.CatchingFishOkHttp;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, CatchingFishAdMobFAB.CatchingFishUnitTesting)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int CatchingFishStateFlow = (int) CatchingFishStateFlow(fileInputStream, 2);
            byte[] CatchingFishLayoutInflater = CatchingFishLayoutInflater(fileInputStream, (int) CatchingFishStateFlow(fileInputStream, 4), (int) CatchingFishStateFlow(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(CatchingFishLayoutInflater);
            try {
                CatchingFishGlideGraphQL[] CatchingFishAppCompat = CatchingFishAppCompat(byteArrayInputStream, bArr2, CatchingFishStateFlow, catchingFishGlideGraphQLArr);
                byteArrayInputStream.close();
                return CatchingFishAppCompat;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(CatchingFishAdMobFAB.CatchingFishViewModelFAB, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int CatchingFishStateFlow2 = (int) CatchingFishStateFlow(fileInputStream, 1);
        byte[] CatchingFishLayoutInflater2 = CatchingFishLayoutInflater(fileInputStream, (int) CatchingFishStateFlow(fileInputStream, 4), (int) CatchingFishStateFlow(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(CatchingFishLayoutInflater2);
        try {
            CatchingFishGlideGraphQL[] CatchingFishRecyclerView = CatchingFishRecyclerView(byteArrayInputStream2, CatchingFishStateFlow2, catchingFishGlideGraphQLArr);
            byteArrayInputStream2.close();
            return CatchingFishRecyclerView;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static final CatchingFishLayoutSnackbar CatchingFishParcelableFAB(Context context) {
        float f = context.getResources().getConfiguration().fontScale;
        float f2 = context.getResources().getDisplayMetrics().density;
        CatchingFishToolbarOkHttp CatchingFishParcelableFAB2 = CatchingFishKtorLayoutRealm.CatchingFishParcelableFAB(f);
        if (CatchingFishParcelableFAB2 == null) {
            CatchingFishParcelableFAB2 = new CatchingFishDataStoreGson(f);
        }
        return new CatchingFishLayoutSnackbar(f2, f, CatchingFishParcelableFAB2);
    }

    public static final CatchingFishMockkCoroutine CatchingFishParcelableFlux(CatchingFishMockkCoroutine catchingFishMockkCoroutine) {
        CatchingFishMockkCoroutine catchingFishMockkCoroutine2;
        CatchingFishMockkCoroutine CatchingFishEspressoTesting2 = catchingFishMockkCoroutine.CatchingFishEspressoTesting();
        while (true) {
            CatchingFishMockkCoroutine catchingFishMockkCoroutine3 = CatchingFishEspressoTesting2;
            catchingFishMockkCoroutine2 = catchingFishMockkCoroutine;
            catchingFishMockkCoroutine = catchingFishMockkCoroutine3;
            if (catchingFishMockkCoroutine == null) {
                break;
            }
            CatchingFishEspressoTesting2 = catchingFishMockkCoroutine.CatchingFishEspressoTesting();
        }
        CatchingFishDaggerToolbar catchingFishDaggerToolbar = catchingFishMockkCoroutine2 instanceof CatchingFishDaggerToolbar ? (CatchingFishDaggerToolbar) catchingFishMockkCoroutine2 : null;
        if (catchingFishDaggerToolbar == null) {
            return catchingFishMockkCoroutine2;
        }
        CatchingFishDaggerToolbar catchingFishDaggerToolbar2 = catchingFishDaggerToolbar.CatchingFish;
        while (true) {
            CatchingFishDaggerToolbar catchingFishDaggerToolbar3 = catchingFishDaggerToolbar2;
            CatchingFishDaggerToolbar catchingFishDaggerToolbar4 = catchingFishDaggerToolbar;
            catchingFishDaggerToolbar = catchingFishDaggerToolbar3;
            if (catchingFishDaggerToolbar == null) {
                return catchingFishDaggerToolbar4;
            }
            catchingFishDaggerToolbar2 = catchingFishDaggerToolbar.CatchingFish;
        }
    }

    public static String CatchingFishPayPal(String str, String str2, byte[] bArr) {
        byte[] bArr2 = CatchingFishAdMobFAB.CatchingFishCloudMessaging;
        byte[] bArr3 = CatchingFishAdMobFAB.CatchingFishEspressoTesting;
        String str3 = (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(str3)) {
                return str2.replace(":", "!");
            }
            if (":".equals(str3)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(str3)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(str3)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                return CatchingFishMVPLiveData.CatchingFishStateLiveData(sb, (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    public static byte[] CatchingFishPayPalLiveData(InputStream inputStream, int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read < 0) {
                throw new IllegalStateException(CatchingFishMVPLiveData.CatchingFishCloudMessaging("Not enough bytes to read: ", i));
            }
            i2 += read;
        }
        return bArr;
    }

    public static final CatchingFishBundleAnimation CatchingFishPayPalService(CatchingFishSharedFlowMVI catchingFishSharedFlowMVI, CatchingFishBundleAnimation catchingFishBundleAnimation) {
        if (catchingFishBundleAnimation.CatchingFishSnackbar(CatchingFishMVI.CatchingFishStateLiveData)) {
            return catchingFishBundleAnimation;
        }
        catchingFishSharedFlowMVI.CatchingFishGradleManifest(1219399079, null, 0, null);
        CatchingFishBundleAnimation catchingFishBundleAnimation2 = (CatchingFishBundleAnimation) catchingFishBundleAnimation.CatchingFishParcelableFAB(CatchingFishMoshiDagger.CatchingFishParcelableFAB, new CatchingFishView(2, catchingFishSharedFlowMVI));
        catchingFishSharedFlowMVI.CatchingFishStateLiveData(false);
        return catchingFishBundleAnimation2;
    }

    public static void CatchingFishPicasso(ByteArrayOutputStream byteArrayOutputStream, CatchingFishGlideGraphQL catchingFishGlideGraphQL) {
        int i = 0;
        for (Map.Entry entry : catchingFishGlideGraphQL.CatchingFishLayout.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                CatchingFishRetrofitMVI(byteArrayOutputStream, intValue - i);
                CatchingFishRetrofitMVI(byteArrayOutputStream, 0);
                i = intValue;
            }
        }
    }

    public static CatchingFishGlideGraphQL[] CatchingFishRecyclerView(ByteArrayInputStream byteArrayInputStream, int i, CatchingFishGlideGraphQL[] catchingFishGlideGraphQLArr) {
        if (byteArrayInputStream.available() == 0) {
            return new CatchingFishGlideGraphQL[0];
        }
        if (i != catchingFishGlideGraphQLArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int CatchingFishStateFlow = (int) CatchingFishStateFlow(byteArrayInputStream, 2);
            iArr[i2] = (int) CatchingFishStateFlow(byteArrayInputStream, 2);
            strArr[i2] = new String(CatchingFishPayPalLiveData(byteArrayInputStream, CatchingFishStateFlow), StandardCharsets.UTF_8);
        }
        for (int i3 = 0; i3 < i; i3++) {
            CatchingFishGlideGraphQL catchingFishGlideGraphQL = catchingFishGlideGraphQLArr[i3];
            if (!catchingFishGlideGraphQL.CatchingFishSnackbar.equals(strArr[i3])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i4 = iArr[i3];
            catchingFishGlideGraphQL.CatchingFishDaggerWebsocket = i4;
            catchingFishGlideGraphQL.CatchingFishViewModelFAB = CatchingFishMotionLayout(byteArrayInputStream, i4);
        }
        return catchingFishGlideGraphQLArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean CatchingFishRedux(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, CatchingFishGlideGraphQL[] catchingFishGlideGraphQLArr) {
        long j;
        int length;
        byte[] bArr2 = CatchingFishAdMobFAB.CatchingFishEspressoTesting;
        byte[] bArr3 = CatchingFishAdMobFAB.CatchingFishCloudMessaging;
        byte[] bArr4 = CatchingFishAdMobFAB.CatchingFishViewModelFAB;
        int i = 0;
        if (Arrays.equals(bArr, bArr4)) {
            ArrayList arrayList = new ArrayList(3);
            ArrayList arrayList2 = new ArrayList(3);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                CatchingFishRetrofitMVI(byteArrayOutputStream2, catchingFishGlideGraphQLArr.length);
                int i2 = 2;
                int i3 = 2;
                for (CatchingFishGlideGraphQL catchingFishGlideGraphQL : catchingFishGlideGraphQLArr) {
                    CatchingFishFirebase(byteArrayOutputStream2, catchingFishGlideGraphQL.CatchingFishCoroutine, 4);
                    CatchingFishFirebase(byteArrayOutputStream2, catchingFishGlideGraphQL.CatchingFishReduxKtor, 4);
                    CatchingFishFirebase(byteArrayOutputStream2, catchingFishGlideGraphQL.CatchingFishViewModelScope, 4);
                    String CatchingFishPayPal = CatchingFishPayPal(catchingFishGlideGraphQL.CatchingFishParcelableFAB, catchingFishGlideGraphQL.CatchingFishSnackbar, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    int length2 = CatchingFishPayPal.getBytes(charset).length;
                    CatchingFishRetrofitMVI(byteArrayOutputStream2, length2);
                    i3 = i3 + 14 + length2;
                    byteArrayOutputStream2.write(CatchingFishPayPal.getBytes(charset));
                }
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                if (i3 != byteArray.length) {
                    throw new IllegalStateException("Expected size " + i3 + ", does not match actual size " + byteArray.length);
                }
                CatchingFishReduxRoomMockk catchingFishReduxRoomMockk = new CatchingFishReduxRoomMockk(1, byteArray, false);
                byteArrayOutputStream2.close();
                arrayList.add(catchingFishReduxRoomMockk);
                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                int i4 = 0;
                int i5 = 0;
                while (i4 < catchingFishGlideGraphQLArr.length) {
                    try {
                        CatchingFishGlideGraphQL catchingFishGlideGraphQL2 = catchingFishGlideGraphQLArr[i4];
                        CatchingFishRetrofitMVI(byteArrayOutputStream3, i4);
                        CatchingFishRetrofitMVI(byteArrayOutputStream3, catchingFishGlideGraphQL2.CatchingFishDaggerWebsocket);
                        i5 = i5 + 4 + (catchingFishGlideGraphQL2.CatchingFishDaggerWebsocket * i2);
                        int[] iArr = catchingFishGlideGraphQL2.CatchingFishViewModelFAB;
                        int length3 = iArr.length;
                        int i6 = i;
                        int i7 = i2;
                        int i8 = i6;
                        while (i8 < length3) {
                            int i9 = iArr[i8];
                            CatchingFishRetrofitMVI(byteArrayOutputStream3, i9 - i6);
                            i8++;
                            i6 = i9;
                        }
                        i4++;
                        i2 = i7;
                        i = 0;
                    } catch (Throwable th) {
                    }
                }
                byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
                if (i5 != byteArray2.length) {
                    throw new IllegalStateException("Expected size " + i5 + ", does not match actual size " + byteArray2.length);
                }
                CatchingFishReduxRoomMockk catchingFishReduxRoomMockk2 = new CatchingFishReduxRoomMockk(3, byteArray2, true);
                byteArrayOutputStream3.close();
                arrayList.add(catchingFishReduxRoomMockk2);
                byteArrayOutputStream3 = new ByteArrayOutputStream();
                int i10 = 0;
                int i11 = 0;
                while (i10 < catchingFishGlideGraphQLArr.length) {
                    try {
                        CatchingFishGlideGraphQL catchingFishGlideGraphQL3 = catchingFishGlideGraphQLArr[i10];
                        Iterator it = catchingFishGlideGraphQL3.CatchingFishLayout.entrySet().iterator();
                        int i12 = 0;
                        while (it.hasNext()) {
                            i12 |= ((Integer) ((Map.Entry) it.next()).getValue()).intValue();
                        }
                        ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            CatchingFishReduxMoshi(byteArrayOutputStream4, i12, catchingFishGlideGraphQL3);
                            byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            byteArrayOutputStream4 = new ByteArrayOutputStream();
                            try {
                                CatchingFishPicasso(byteArrayOutputStream4, catchingFishGlideGraphQL3);
                                byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                                byteArrayOutputStream4.close();
                                CatchingFishRetrofitMVI(byteArrayOutputStream3, i10);
                                int length4 = byteArray3.length + 2 + byteArray4.length;
                                int i13 = i11 + 6;
                                int i14 = i10;
                                CatchingFishFirebase(byteArrayOutputStream3, length4, 4);
                                CatchingFishRetrofitMVI(byteArrayOutputStream3, i12);
                                byteArrayOutputStream3.write(byteArray3);
                                byteArrayOutputStream3.write(byteArray4);
                                i11 = i13 + length4;
                                i10 = i14 + 1;
                            } finally {
                            }
                        } finally {
                        }
                    } finally {
                        try {
                            byteArrayOutputStream3.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                }
                byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
                if (i11 != byteArray5.length) {
                    throw new IllegalStateException("Expected size " + i11 + ", does not match actual size " + byteArray5.length);
                }
                CatchingFishReduxRoomMockk catchingFishReduxRoomMockk3 = new CatchingFishReduxRoomMockk(4, byteArray5, true);
                byteArrayOutputStream3.close();
                arrayList.add(catchingFishReduxRoomMockk3);
                long j2 = 4;
                long size = j2 + j2 + 4 + (arrayList.size() * 16);
                CatchingFishFirebase(byteArrayOutputStream, arrayList.size(), 4);
                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                    CatchingFishReduxRoomMockk catchingFishReduxRoomMockk4 = (CatchingFishReduxRoomMockk) arrayList.get(i15);
                    int i16 = catchingFishReduxRoomMockk4.CatchingFishParcelableFAB;
                    byte[] bArr5 = catchingFishReduxRoomMockk4.CatchingFishSnackbar;
                    if (i16 == 1) {
                        j = 0;
                    } else if (i16 == 2) {
                        j = 1;
                    } else if (i16 == 3) {
                        j = 2;
                    } else if (i16 == 4) {
                        j = 3;
                    } else {
                        if (i16 != 5) {
                            throw null;
                        }
                        j = 4;
                    }
                    CatchingFishFirebase(byteArrayOutputStream, j, 4);
                    CatchingFishFirebase(byteArrayOutputStream, size, 4);
                    if (catchingFishReduxRoomMockk4.CatchingFishCoroutine) {
                        long length5 = bArr5.length;
                        byte[] CatchingFishJetpackCompose = CatchingFishJetpackCompose(bArr5);
                        arrayList2.add(CatchingFishJetpackCompose);
                        CatchingFishFirebase(byteArrayOutputStream, CatchingFishJetpackCompose.length, 4);
                        CatchingFishFirebase(byteArrayOutputStream, length5, 4);
                        length = CatchingFishJetpackCompose.length;
                    } else {
                        arrayList2.add(bArr5);
                        CatchingFishFirebase(byteArrayOutputStream, bArr5.length, 4);
                        CatchingFishFirebase(byteArrayOutputStream, 0L, 4);
                        length = bArr5.length;
                    }
                    size += length;
                }
                for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                    byteArrayOutputStream.write((byte[]) arrayList2.get(i17));
                }
            } catch (Throwable th3) {
                try {
                    byteArrayOutputStream2.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } else {
            byte[] bArr6 = CatchingFishAdMobFAB.CatchingFishLayout;
            if (Arrays.equals(bArr, bArr6)) {
                byte[] CatchingFishCoroutineFlow = CatchingFishCoroutineFlow(catchingFishGlideGraphQLArr, bArr6);
                CatchingFishFirebase(byteArrayOutputStream, catchingFishGlideGraphQLArr.length, 1);
                CatchingFishFirebase(byteArrayOutputStream, CatchingFishCoroutineFlow.length, 4);
                byte[] CatchingFishJetpackCompose2 = CatchingFishJetpackCompose(CatchingFishCoroutineFlow);
                CatchingFishFirebase(byteArrayOutputStream, CatchingFishJetpackCompose2.length, 4);
                byteArrayOutputStream.write(CatchingFishJetpackCompose2);
                return true;
            }
            if (Arrays.equals(bArr, bArr3)) {
                CatchingFishFirebase(byteArrayOutputStream, catchingFishGlideGraphQLArr.length, 1);
                for (CatchingFishGlideGraphQL catchingFishGlideGraphQL4 : catchingFishGlideGraphQLArr) {
                    int size2 = catchingFishGlideGraphQL4.CatchingFishLayout.size() * 4;
                    String CatchingFishPayPal2 = CatchingFishPayPal(catchingFishGlideGraphQL4.CatchingFishParcelableFAB, catchingFishGlideGraphQL4.CatchingFishSnackbar, bArr3);
                    Charset charset2 = StandardCharsets.UTF_8;
                    CatchingFishRetrofitMVI(byteArrayOutputStream, CatchingFishPayPal2.getBytes(charset2).length);
                    CatchingFishRetrofitMVI(byteArrayOutputStream, catchingFishGlideGraphQL4.CatchingFishViewModelFAB.length);
                    CatchingFishFirebase(byteArrayOutputStream, size2, 4);
                    CatchingFishFirebase(byteArrayOutputStream, catchingFishGlideGraphQL4.CatchingFishCoroutine, 4);
                    byteArrayOutputStream.write(CatchingFishPayPal2.getBytes(charset2));
                    Iterator it2 = catchingFishGlideGraphQL4.CatchingFishLayout.keySet().iterator();
                    while (it2.hasNext()) {
                        CatchingFishRetrofitMVI(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                        CatchingFishRetrofitMVI(byteArrayOutputStream, 0);
                    }
                    for (int i18 : catchingFishGlideGraphQL4.CatchingFishViewModelFAB) {
                        CatchingFishRetrofitMVI(byteArrayOutputStream, i18);
                    }
                }
            } else {
                byte[] bArr7 = CatchingFishAdMobFAB.CatchingFishFragmentHandler;
                if (Arrays.equals(bArr, bArr7)) {
                    byte[] CatchingFishCoroutineFlow2 = CatchingFishCoroutineFlow(catchingFishGlideGraphQLArr, bArr7);
                    CatchingFishFirebase(byteArrayOutputStream, catchingFishGlideGraphQLArr.length, 1);
                    CatchingFishFirebase(byteArrayOutputStream, CatchingFishCoroutineFlow2.length, 4);
                    byte[] CatchingFishJetpackCompose3 = CatchingFishJetpackCompose(CatchingFishCoroutineFlow2);
                    CatchingFishFirebase(byteArrayOutputStream, CatchingFishJetpackCompose3.length, 4);
                    byteArrayOutputStream.write(CatchingFishJetpackCompose3);
                    return true;
                }
                if (!Arrays.equals(bArr, bArr2)) {
                    return false;
                }
                CatchingFishRetrofitMVI(byteArrayOutputStream, catchingFishGlideGraphQLArr.length);
                for (CatchingFishGlideGraphQL catchingFishGlideGraphQL5 : catchingFishGlideGraphQLArr) {
                    String str = catchingFishGlideGraphQL5.CatchingFishParcelableFAB;
                    TreeMap treeMap = catchingFishGlideGraphQL5.CatchingFishLayout;
                    String CatchingFishPayPal3 = CatchingFishPayPal(str, catchingFishGlideGraphQL5.CatchingFishSnackbar, bArr2);
                    Charset charset3 = StandardCharsets.UTF_8;
                    CatchingFishRetrofitMVI(byteArrayOutputStream, CatchingFishPayPal3.getBytes(charset3).length);
                    CatchingFishRetrofitMVI(byteArrayOutputStream, treeMap.size());
                    CatchingFishRetrofitMVI(byteArrayOutputStream, catchingFishGlideGraphQL5.CatchingFishViewModelFAB.length);
                    CatchingFishFirebase(byteArrayOutputStream, catchingFishGlideGraphQL5.CatchingFishCoroutine, 4);
                    byteArrayOutputStream.write(CatchingFishPayPal3.getBytes(charset3));
                    Iterator it3 = treeMap.keySet().iterator();
                    while (it3.hasNext()) {
                        CatchingFishRetrofitMVI(byteArrayOutputStream, ((Integer) it3.next()).intValue());
                    }
                    for (int i19 : catchingFishGlideGraphQL5.CatchingFishViewModelFAB) {
                        CatchingFishRetrofitMVI(byteArrayOutputStream, i19);
                    }
                }
            }
        }
        return true;
    }

    public static final void CatchingFishReduxKtor(CatchingFishReduxRetrofit catchingFishReduxRetrofit, CatchingFishBiometricRoom catchingFishBiometricRoom) {
        long CatchingFishEspressoMockk = ((CatchingFishGlideHandler) catchingFishBiometricRoom.CatchingFishJobScheduler.CatchingFishViewModelScope).CatchingFishEspressoMockk(0L);
        int round = Math.round(Float.intBitsToFloat((int) (CatchingFishEspressoMockk >> 32)));
        int round2 = Math.round(Float.intBitsToFloat((int) (CatchingFishEspressoMockk & 4294967295L)));
        catchingFishReduxRetrofit.layout(round, round2, catchingFishReduxRetrofit.getMeasuredWidth() + round, catchingFishReduxRetrofit.getMeasuredHeight() + round2);
    }

    public static void CatchingFishReduxMoshi(ByteArrayOutputStream byteArrayOutputStream, int i, CatchingFishGlideGraphQL catchingFishGlideGraphQL) {
        int i2 = catchingFishGlideGraphQL.CatchingFishViewModelScope;
        byte[] bArr = new byte[(((Integer.bitCount(i & (-2)) * i2) + 7) & (-8)) / 8];
        for (Map.Entry entry : catchingFishGlideGraphQL.CatchingFishLayout.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            int i3 = 0;
            for (int i4 = 1; i4 <= 4; i4 <<= 1) {
                if (i4 != 1 && (i4 & i) != 0) {
                    if ((i4 & intValue2) == i4) {
                        int i5 = (i3 * i2) + intValue;
                        int i6 = i5 / 8;
                        bArr[i6] = (byte) ((1 << (i5 % 8)) | bArr[i6]);
                    }
                    i3++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void CatchingFishRetrofitMVI(ByteArrayOutputStream byteArrayOutputStream, int i) {
        CatchingFishFirebase(byteArrayOutputStream, i, 2);
    }

    public static final float[] CatchingFishRoomDatabase(float[] fArr, float[] fArr2, float[] fArr3) {
        CatchingFishDagger(fArr, fArr2);
        CatchingFishDagger(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] CatchingFishFragmentFactory = CatchingFishFragmentFactory(fArr);
        float f = fArr4[0];
        float f2 = fArr[0] * f;
        float f3 = fArr4[1];
        float f4 = fArr[1] * f3;
        float f5 = fArr4[2];
        return CatchingFishEspressoMockk(CatchingFishFragmentFactory, new float[]{f2, f4, fArr[2] * f5, fArr[3] * f, fArr[4] * f3, fArr[5] * f5, f * fArr[6], f3 * fArr[7], f5 * fArr[8]});
    }

    public static final CatchingFishBundleAnimation CatchingFishSensorManager(CatchingFishSharedFlowMVI catchingFishSharedFlowMVI, CatchingFishBundleAnimation catchingFishBundleAnimation) {
        catchingFishSharedFlowMVI.CatchingFishParcelable(439770924);
        CatchingFishBundleAnimation CatchingFishPayPalService = CatchingFishPayPalService(catchingFishSharedFlowMVI, catchingFishBundleAnimation);
        catchingFishSharedFlowMVI.CatchingFishStateLiveData(false);
        return CatchingFishPayPalService;
    }

    public static final long CatchingFishSnackbar(float f, boolean z, boolean z2) {
        return (((z ? 1L : 0L) | (z2 ? 2L : 0L)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final void CatchingFishSpannableWidget(CatchingFishManifestMockk catchingFishManifestMockk) {
        CatchingFishRoomViewGson catchingFishRoomViewGson = (CatchingFishRoomViewGson) catchingFishManifestMockk.CatchingFishCoroutineFlow(CatchingFishMVPExoPlayer.CatchingFishLayout);
        if (catchingFishRoomViewGson != null && !catchingFishRoomViewGson.CatchingFishSnackbar()) {
            throw catchingFishRoomViewGson.CatchingFishNavigation();
        }
    }

    public static long CatchingFishStateFlow(InputStream inputStream, int i) {
        byte[] CatchingFishPayPalLiveData = CatchingFishPayPalLiveData(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += (CatchingFishPayPalLiveData[i2] & 255) << (i2 * 8);
        }
        return j;
    }

    public static void CatchingFishStateLiveData(Context context, int[] iArr, String str) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!obtainStyledAttributes.hasValue(i)) {
                obtainStyledAttributes.recycle();
                throw new IllegalArgumentException(CatchingFishMVPLiveData.CatchingFishOkHttp("The style on this component requires your app theme to be ", str, " (or a descendant)."));
            }
        }
        obtainStyledAttributes.recycle();
    }

    public static final long CatchingFishStripeAPI(long j) {
        return (Math.round(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (j >> 32))) << 32);
    }

    public static void CatchingFishUnitTesting(int i, int i2, int i3) {
        if (i >= 0 && i2 <= i3) {
            if (i > i2) {
                throw new IllegalArgumentException(CatchingFishMVPLiveData.CatchingFishFragmentHandler(i, i2, "fromIndex: ", " > toIndex: "));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
    }

    public static final void CatchingFishViewModelFAB(View view, ArrayList arrayList, boolean z) {
        int i;
        boolean z2 = view.getVisibility() == 0 && view.isFocusable() && view.isEnabled() && view.getWidth() > 0 && view.getHeight() > 0 && (!z || view.isFocusableInTouchMode());
        if (!(view instanceof ViewGroup)) {
            if (z2) {
                arrayList.add(view);
                return;
            }
            return;
        }
        int size = arrayList.size();
        ViewGroup viewGroup = (ViewGroup) view;
        boolean z3 = viewGroup.getDescendantFocusability() == 131072;
        if (z2 && z3) {
            arrayList.add(view);
        }
        if (viewGroup.getDescendantFocusability() != 393216) {
            int childCount = viewGroup.getChildCount();
            View[] viewArr = new View[childCount];
            for (int i2 = 0; i2 < childCount; i2++) {
                viewArr[i2] = viewGroup.getChildAt(i2);
            }
            CatchingFishBundleGradle catchingFishBundleGradle = CatchingFishGraphQLPicasso.CatchingFishParcelableFAB;
            boolean z4 = viewGroup.getLayoutDirection() == 1;
            CatchingFishToolbarRedux catchingFishToolbarRedux = CatchingFishGraphQLPicasso.CatchingFishWorkManager;
            CatchingFishBundleGradle catchingFishBundleGradle2 = CatchingFishGraphQLPicasso.CatchingFishParcelableFAB;
            CatchingFishPayPalService catchingFishPayPalService = CatchingFishGraphQLPicasso.CatchingFishReduxKtor;
            if (childCount < 2) {
                i = 0;
            } else {
                int i3 = childCount - catchingFishBundleGradle2.CatchingFishSnackbar;
                i = 0;
                for (int i4 = 0; i4 < i3; i4++) {
                    catchingFishBundleGradle2.CatchingFishParcelableFAB(new Rect());
                }
                for (int i5 = 0; i5 < childCount; i5++) {
                    View view2 = viewArr[i5];
                    int i6 = CatchingFishGraphQLPicasso.CatchingFishSnackbar;
                    CatchingFishGraphQLPicasso.CatchingFishSnackbar = i6 + 1;
                    Rect rect = (Rect) catchingFishBundleGradle2.CatchingFishDaggerWebsocket(i6);
                    view2.getDrawingRect(rect);
                    viewGroup.offsetDescendantRectToMyCoords(view2, rect);
                    catchingFishPayPalService.CatchingFishOkHttp(view2, rect);
                }
                CatchingFishToolbarRedux catchingFishToolbarRedux2 = CatchingFishGraphQLPicasso.CatchingFishDaggerWebsocket;
                CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishToolbarRedux2, "comparator");
                if (childCount > 1) {
                    Arrays.sort(viewArr, catchingFishToolbarRedux2);
                }
                Object CatchingFishViewModelScope2 = catchingFishPayPalService.CatchingFishViewModelScope(viewArr[0]);
                CatchingFishFirebaseDagger.CatchingFishAnimationMockk(CatchingFishViewModelScope2);
                int i7 = ((Rect) CatchingFishViewModelScope2).bottom;
                CatchingFishGraphQLPicasso.CatchingFishCoroutine = z4 ? -1 : 1;
                int i8 = 0;
                for (int i9 = 0; i9 < childCount; i9++) {
                    Object CatchingFishViewModelScope3 = catchingFishPayPalService.CatchingFishViewModelScope(viewArr[i9]);
                    CatchingFishFirebaseDagger.CatchingFishAnimationMockk(CatchingFishViewModelScope3);
                    Rect rect2 = (Rect) CatchingFishViewModelScope3;
                    if (rect2.top >= i7) {
                        if (i9 - i8 > 1) {
                            CatchingFishMVVMHilt.CatchingFishAndroidX(viewArr, catchingFishToolbarRedux, i8, i9);
                        }
                        i7 = rect2.bottom;
                        i8 = i9;
                    } else {
                        i7 = Math.max(i7, rect2.bottom);
                    }
                }
                if (childCount - i8 > 1) {
                    CatchingFishMVVMHilt.CatchingFishAndroidX(viewArr, catchingFishToolbarRedux, i8, childCount);
                }
                CatchingFishGraphQLPicasso.CatchingFishSnackbar = 0;
                catchingFishPayPalService.CatchingFishParcelableFAB();
            }
            for (int i10 = i; i10 < childCount; i10++) {
                CatchingFishViewModelFAB(viewArr[i10], arrayList, z);
            }
        }
        if (z2 && !z3 && size == arrayList.size()) {
            arrayList.add(view);
        }
    }

    public static CatchingFishEspressoHilt CatchingFishViewModelScope(CatchingFishEspressoHilt catchingFishEspressoHilt) {
        CatchingFishRealmMVPKtor catchingFishRealmMVPKtor = CatchingFishRobolectricHilt.CatchingFishEspressoTesting;
        if (CatchingFishMockkSharedFlow.CatchingFishParcelableFAB(catchingFishEspressoHilt.CatchingFishSnackbar, CatchingFishMockkSharedFlow.CatchingFishParcelableFAB)) {
            CatchingFishMVIFragment catchingFishMVIFragment = (CatchingFishMVIFragment) catchingFishEspressoHilt;
            CatchingFishRealmMVPKtor catchingFishRealmMVPKtor2 = catchingFishMVIFragment.CatchingFishReduxKtor;
            if (!CatchingFish(catchingFishRealmMVPKtor2, catchingFishRealmMVPKtor)) {
                return new CatchingFishMVIFragment(catchingFishMVIFragment.CatchingFishParcelableFAB, catchingFishMVIFragment.CatchingFishViewModelFAB, catchingFishRealmMVPKtor, CatchingFishEspressoMockk(CatchingFishRoomDatabase(CatchingFishOkHttpViewPager.CatchingFishCoroutine.CatchingFishSnackbar, catchingFishRealmMVPKtor2.CatchingFishParcelableFAB(), catchingFishRealmMVPKtor.CatchingFishParcelableFAB()), catchingFishMVIFragment.CatchingFishLayout), catchingFishMVIFragment.CatchingFishCloudMessaging, catchingFishMVIFragment.CatchingFishUnitTesting, catchingFishMVIFragment.CatchingFishDaggerWebsocket, catchingFishMVIFragment.CatchingFishWorkManager, catchingFishMVIFragment.CatchingFishViewModelScope, -1);
            }
        }
        return catchingFishEspressoHilt;
    }

    public static final String CatchingFishWorkManager(Object[] objArr, int i, int i2, CatchingFishKtorViewPager catchingFishKtorViewPager) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == catchingFishKtorViewPager) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String sb2 = sb.toString();
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(sb2, "toString(...)");
        return sb2;
    }

    public abstract void CatchingFishMVPRobolectric(CatchingFishGradleBiometric catchingFishGradleBiometric, float f, float f2);
}
