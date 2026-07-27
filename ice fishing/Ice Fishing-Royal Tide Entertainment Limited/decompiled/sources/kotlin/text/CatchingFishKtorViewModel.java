package kotlin.text;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class CatchingFishKtorViewModel {
    public static Boolean CatchingFishCoroutine = null;
    public static String CatchingFishParcelableFAB = null;
    public static boolean CatchingFishReduxKtor = true;
    public static int CatchingFishSnackbar;

    public static String CatchingFish(String str, Object... objArr) {
        int indexOf;
        String str2;
        int i = 0;
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Object obj = objArr[i2];
            if (obj == null) {
                str2 = "null";
            } else {
                try {
                    str2 = obj.toString();
                } catch (Exception e) {
                    String str3 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str3, (Throwable) e);
                    str2 = "<" + str3 + " threw " + e.getClass().getName() + ">";
                }
            }
            objArr[i2] = str2;
        }
        StringBuilder sb = new StringBuilder((objArr.length * 16) + str.length());
        int i3 = 0;
        while (i < objArr.length && (indexOf = str.indexOf("%s", i3)) != -1) {
            sb.append((CharSequence) str, i3, indexOf);
            sb.append(objArr[i]);
            i3 = indexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static final Bundle CatchingFishAnimationMockk(String str, Bundle bundle) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(str, "key");
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        throw new IllegalArgumentException(CatchingFishMVPLiveData.CatchingFishOkHttp("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }

    public static void CatchingFishCardViewRealm(View view, CatchingFishContextGraphQL catchingFishContextGraphQL) {
        CatchingFishPayPalAdMob catchingFishPayPalAdMob = catchingFishContextGraphQL.CatchingFishDaggerWebsocket.CatchingFishCoroutine;
        if (catchingFishPayPalAdMob == null || !catchingFishPayPalAdMob.CatchingFishParcelableFAB) {
            return;
        }
        float f = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f += ((View) parent).getElevation();
        }
        CatchingFishMVPEspressoRoom catchingFishMVPEspressoRoom = catchingFishContextGraphQL.CatchingFishDaggerWebsocket;
        if (catchingFishMVPEspressoRoom.CatchingFishOkHttp != f) {
            catchingFishMVPEspressoRoom.CatchingFishOkHttp = f;
            catchingFishContextGraphQL.CatchingFish();
        }
    }

    public static final CatchingFishFluxExoPlayer CatchingFishCardViewView(Rect rect) {
        return new CatchingFishFluxExoPlayer(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static String CatchingFishCloudMessaging(CatchingFishCameraXRealm catchingFishCameraXRealm) {
        StringBuilder sb = new StringBuilder(catchingFishCameraXRealm.size());
        for (int i = 0; i < catchingFishCameraXRealm.size(); i++) {
            byte CatchingFishParcelableFAB2 = catchingFishCameraXRealm.CatchingFishParcelableFAB(i);
            if (CatchingFishParcelableFAB2 == 34) {
                sb.append("\\\"");
            } else if (CatchingFishParcelableFAB2 == 39) {
                sb.append("\\'");
            } else if (CatchingFishParcelableFAB2 != 92) {
                switch (CatchingFishParcelableFAB2) {
                    case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
                        sb.append("\\a");
                        break;
                    case CatchingFishMoshiSpannable.BYTES_FIELD_NUMBER /* 8 */:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (CatchingFishParcelableFAB2 < 32 || CatchingFishParcelableFAB2 > 126) {
                            sb.append('\\');
                            sb.append((char) (((CatchingFishParcelableFAB2 >>> 6) & 3) + 48));
                            sb.append((char) (((CatchingFishParcelableFAB2 >>> 3) & 7) + 48));
                            sb.append((char) ((CatchingFishParcelableFAB2 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) CatchingFishParcelableFAB2);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static String CatchingFishCoroutine(int i) {
        if (i < 1000 || i >= 5000) {
            return CatchingFishMVPLiveData.CatchingFishCloudMessaging("Code must be in range [1000,5000): ", i);
        }
        if ((i < 1004 || i > 1006) && (i < 1012 || i > 2999)) {
            return null;
        }
        return "Code " + i + " is reserved and may not be used.";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.lang.Object[]] */
    public static final boolean CatchingFishCoroutineFlow(CatchingFishAppCompatWidget catchingFishAppCompatWidget, CatchingFishMVPBiometric catchingFishMVPBiometric) {
        CatchingFishAppCompatWidget[] catchingFishAppCompatWidgetArr = new CatchingFishAppCompatWidget[16];
        if (!catchingFishAppCompatWidget.CatchingFishReduxKtor.CatchingFishRoomDatabase) {
            CatchingFishFluxGradle.CatchingFishSnackbar("visitChildren called on an unattached node");
        }
        CatchingFishFABToast catchingFishFABToast = new CatchingFishFABToast(new CatchingFishFABStripeAPIFAB[16]);
        CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB = catchingFishAppCompatWidget.CatchingFishReduxKtor;
        CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB2 = catchingFishFABStripeAPIFAB.CatchingFishLayout;
        if (catchingFishFABStripeAPIFAB2 == null) {
            CatchingFishXMLLayoutGlide.CatchingFishWorkManager(catchingFishFABToast, catchingFishFABStripeAPIFAB);
        } else {
            catchingFishFABToast.CatchingFishSnackbar(catchingFishFABStripeAPIFAB2);
        }
        int i = 0;
        while (true) {
            int i2 = catchingFishFABToast.CatchingFishWorkManager;
            if (i2 == 0) {
                break;
            }
            CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB3 = (CatchingFishFABStripeAPIFAB) catchingFishFABToast.CatchingFishFragmentHandler(i2 - 1);
            if ((catchingFishFABStripeAPIFAB3.CatchingFishViewModelScope & 1024) == 0) {
                CatchingFishXMLLayoutGlide.CatchingFishWorkManager(catchingFishFABToast, catchingFishFABStripeAPIFAB3);
            } else {
                while (true) {
                    if (catchingFishFABStripeAPIFAB3 == null) {
                        break;
                    }
                    if ((catchingFishFABStripeAPIFAB3.CatchingFishWorkManager & 1024) != 0) {
                        while (catchingFishFABStripeAPIFAB3 != null) {
                            if (catchingFishFABStripeAPIFAB3 instanceof CatchingFishAppCompatWidget) {
                                CatchingFishAppCompatWidget catchingFishAppCompatWidget2 = (CatchingFishAppCompatWidget) catchingFishFABStripeAPIFAB3;
                                int i3 = i + 1;
                                if (catchingFishAppCompatWidgetArr.length < i3) {
                                    int length = catchingFishAppCompatWidgetArr.length;
                                    ?? r6 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(catchingFishAppCompatWidgetArr, 0, r6, 0, length);
                                    catchingFishAppCompatWidgetArr = r6;
                                }
                                catchingFishAppCompatWidgetArr[i] = catchingFishAppCompatWidget2;
                                i = i3;
                            }
                            catchingFishFABStripeAPIFAB3 = null;
                        }
                    } else {
                        catchingFishFABStripeAPIFAB3 = catchingFishFABStripeAPIFAB3.CatchingFishLayout;
                    }
                }
            }
        }
        CatchingFishMVVMHilt.CatchingFishAndroidX(catchingFishAppCompatWidgetArr, CatchingFishMVVMCoroutine.CatchingFishSnackbar, 0, i);
        int i4 = i - 1;
        if (i4 < catchingFishAppCompatWidgetArr.length) {
            while (i4 >= 0) {
                CatchingFishAppCompatWidget catchingFishAppCompatWidget3 = catchingFishAppCompatWidgetArr[i4];
                if (CatchingFishGsonCardView.CatchingFishCustomView(catchingFishAppCompatWidget3) && CatchingFishSnackbar(catchingFishAppCompatWidget3, catchingFishMVPBiometric)) {
                    return true;
                }
                i4--;
            }
        }
        return false;
    }

    public static String CatchingFishCustomView(String str, Object... objArr) {
        int length;
        int indexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i >= length || (indexOf = str.indexOf("%s", i2)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i2, indexOf);
            sb.append(CatchingFishFragmentFactory(objArr[i]));
            i2 = indexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i2, str.length());
        if (i < length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb.append(str2);
                sb.append(CatchingFishFragmentFactory(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.lang.Object[]] */
    public static final boolean CatchingFishDaggerHiltFAB(CatchingFishAppCompatWidget catchingFishAppCompatWidget, CatchingFishMVPBiometric catchingFishMVPBiometric) {
        CatchingFishAppCompatWidget[] catchingFishAppCompatWidgetArr = new CatchingFishAppCompatWidget[16];
        if (!catchingFishAppCompatWidget.CatchingFishReduxKtor.CatchingFishRoomDatabase) {
            CatchingFishFluxGradle.CatchingFishSnackbar("visitChildren called on an unattached node");
        }
        CatchingFishFABToast catchingFishFABToast = new CatchingFishFABToast(new CatchingFishFABStripeAPIFAB[16]);
        CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB = catchingFishAppCompatWidget.CatchingFishReduxKtor;
        CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB2 = catchingFishFABStripeAPIFAB.CatchingFishLayout;
        if (catchingFishFABStripeAPIFAB2 == null) {
            CatchingFishXMLLayoutGlide.CatchingFishWorkManager(catchingFishFABToast, catchingFishFABStripeAPIFAB);
        } else {
            catchingFishFABToast.CatchingFishSnackbar(catchingFishFABStripeAPIFAB2);
        }
        int i = 0;
        while (true) {
            int i2 = catchingFishFABToast.CatchingFishWorkManager;
            if (i2 == 0) {
                break;
            }
            CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB3 = (CatchingFishFABStripeAPIFAB) catchingFishFABToast.CatchingFishFragmentHandler(i2 - 1);
            if ((catchingFishFABStripeAPIFAB3.CatchingFishViewModelScope & 1024) == 0) {
                CatchingFishXMLLayoutGlide.CatchingFishWorkManager(catchingFishFABToast, catchingFishFABStripeAPIFAB3);
            } else {
                while (true) {
                    if (catchingFishFABStripeAPIFAB3 == null) {
                        break;
                    }
                    if ((catchingFishFABStripeAPIFAB3.CatchingFishWorkManager & 1024) != 0) {
                        while (catchingFishFABStripeAPIFAB3 != null) {
                            if (catchingFishFABStripeAPIFAB3 instanceof CatchingFishAppCompatWidget) {
                                CatchingFishAppCompatWidget catchingFishAppCompatWidget2 = (CatchingFishAppCompatWidget) catchingFishFABStripeAPIFAB3;
                                int i3 = i + 1;
                                if (catchingFishAppCompatWidgetArr.length < i3) {
                                    int length = catchingFishAppCompatWidgetArr.length;
                                    ?? r6 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(catchingFishAppCompatWidgetArr, 0, r6, 0, length);
                                    catchingFishAppCompatWidgetArr = r6;
                                }
                                catchingFishAppCompatWidgetArr[i] = catchingFishAppCompatWidget2;
                                i = i3;
                            }
                            catchingFishFABStripeAPIFAB3 = null;
                        }
                    } else {
                        catchingFishFABStripeAPIFAB3 = catchingFishFABStripeAPIFAB3.CatchingFishLayout;
                    }
                }
            }
        }
        CatchingFishMVVMHilt.CatchingFishAndroidX(catchingFishAppCompatWidgetArr, CatchingFishMVVMCoroutine.CatchingFishSnackbar, 0, i);
        for (int i4 = 0; i4 < i; i4++) {
            CatchingFishAppCompatWidget catchingFishAppCompatWidget3 = catchingFishAppCompatWidgetArr[i4];
            if (CatchingFishGsonCardView.CatchingFishCustomView(catchingFishAppCompatWidget3) && CatchingFishEspressoTesting(catchingFishAppCompatWidget3, catchingFishMVPBiometric)) {
                return true;
            }
        }
        return false;
    }

    public static float[] CatchingFishDaggerWebsocket(float[] fArr, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int min = Math.min(i, length);
        float[] fArr2 = new float[i];
        System.arraycopy(fArr, 0, fArr2, 0, min);
        return fArr2;
    }

    public static final boolean CatchingFishEspressoTesting(CatchingFishAppCompatWidget catchingFishAppCompatWidget, CatchingFishMVPBiometric catchingFishMVPBiometric) {
        int ordinal = catchingFishAppCompatWidget.CatchingFishMVPRobolectric().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                CatchingFishAppCompatWidget CatchingFishDaggerHiltFAB = CatchingFishGsonCardView.CatchingFishDaggerHiltFAB(catchingFishAppCompatWidget);
                if (CatchingFishDaggerHiltFAB != null) {
                    return CatchingFishEspressoTesting(CatchingFishDaggerHiltFAB, catchingFishMVPBiometric) || CatchingFishOkHttp(catchingFishAppCompatWidget, CatchingFishDaggerHiltFAB, 1, catchingFishMVPBiometric);
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return catchingFishAppCompatWidget.CatchingFishCardViewView().CatchingFishParcelableFAB ? ((Boolean) catchingFishMVPBiometric.CatchingFishFragmentHandler(catchingFishAppCompatWidget)).booleanValue() : CatchingFishDaggerHiltFAB(catchingFishAppCompatWidget, catchingFishMVPBiometric);
                }
                throw new CatchingFishBiometricView();
            }
        }
        return CatchingFishDaggerHiltFAB(catchingFishAppCompatWidget, catchingFishMVPBiometric);
    }

    public static String CatchingFishFragmentFactory(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            StringBuilder sb = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
            sb.append(name);
            sb.append("@");
            sb.append(hexString);
            String sb2 = sb.toString();
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(sb2), (Throwable) e);
            String name2 = e.getClass().getName();
            StringBuilder sb3 = new StringBuilder(sb2.length() + 8 + name2.length() + 1);
            sb3.append("<");
            sb3.append(sb2);
            sb3.append(" threw ");
            sb3.append(name2);
            sb3.append(">");
            return sb3.toString();
        }
    }

    public static CatchingFishPayPalFragment[] CatchingFishFragmentHandler(CatchingFishPayPalFragment[] catchingFishPayPalFragmentArr) {
        CatchingFishPayPalFragment[] catchingFishPayPalFragmentArr2 = new CatchingFishPayPalFragment[catchingFishPayPalFragmentArr.length];
        for (int i = 0; i < catchingFishPayPalFragmentArr.length; i++) {
            catchingFishPayPalFragmentArr2[i] = new CatchingFishPayPalFragment(catchingFishPayPalFragmentArr[i]);
        }
        return catchingFishPayPalFragmentArr2;
    }

    public static final CatchingFishHiltBundle CatchingFishGsonAppCompat(CatchingFishGlideService catchingFishGlideService, int i) {
        Object obj;
        Iterator<T> it = catchingFishGlideService.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((CatchingFishBiometricRoom) ((Map.Entry) obj).getKey()).CatchingFishDaggerWebsocket == i) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            return (CatchingFishHiltBundle) entry.getValue();
        }
        return null;
    }

    public static MappedByteBuffer CatchingFishJetpackCompose(Uri uri, Context context) {
        ParcelFileDescriptor openFileDescriptor;
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (openFileDescriptor == null) {
            if (openFileDescriptor != null) {
                openFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                openFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096 A[Catch: NumberFormatException -> 0x00aa, LOOP:3: B:25:0x0068->B:35:0x0096, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static CatchingFishPayPalFragment[] CatchingFishLayout(String str) {
        int i;
        String trim;
        float[] fArr;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i4 < str.length()) {
            while (i4 < str.length()) {
                char charAt = str.charAt(i4);
                if ((charAt - 'Z') * (charAt - 'A') > 0) {
                    if ((charAt - 'z') * (charAt - 'a') > 0) {
                        continue;
                        i4++;
                    }
                }
                if (charAt != 'e' && charAt != 'E') {
                    trim = str.substring(i3, i4).trim();
                    if (!trim.isEmpty()) {
                        if (trim.charAt(i2) == 'z' || trim.charAt(i2) == 'Z') {
                            fArr = new float[i2];
                        } else {
                            try {
                                float[] fArr2 = new float[trim.length()];
                                int length = trim.length();
                                int i5 = i2;
                                int i6 = 1;
                                while (i6 < length) {
                                    int i7 = i2;
                                    int i8 = i7;
                                    int i9 = i8;
                                    int i10 = i9;
                                    for (int i11 = i6; i11 < trim.length(); i11++) {
                                        char charAt2 = trim.charAt(i11);
                                        if (charAt2 != ' ') {
                                            if (charAt2 != 'E' && charAt2 != 'e') {
                                                switch (charAt2) {
                                                    case ',':
                                                        break;
                                                    case '-':
                                                        if (i11 != i6 && i7 == 0) {
                                                            i7 = 0;
                                                            i9 = 1;
                                                            i10 = 1;
                                                            break;
                                                        }
                                                        i7 = 0;
                                                        break;
                                                    case '.':
                                                        if (i8 == 0) {
                                                            i7 = 0;
                                                            i8 = 1;
                                                            break;
                                                        }
                                                        i7 = 0;
                                                        i9 = 1;
                                                        i10 = 1;
                                                        break;
                                                    default:
                                                        i7 = 0;
                                                        break;
                                                }
                                            } else {
                                                i7 = 1;
                                            }
                                            if (i9 == 0) {
                                                if (i6 < i11) {
                                                    fArr2[i5] = Float.parseFloat(trim.substring(i6, i11));
                                                    i5++;
                                                }
                                                i6 = i10 == 0 ? i11 : i11 + 1;
                                                i2 = 0;
                                            }
                                        }
                                        i7 = 0;
                                        i9 = 1;
                                        if (i9 == 0) {
                                        }
                                    }
                                    if (i6 < i11) {
                                    }
                                    if (i10 == 0) {
                                    }
                                    i2 = 0;
                                }
                                fArr = CatchingFishDaggerWebsocket(fArr2, i5);
                                i2 = 0;
                            } catch (NumberFormatException e) {
                                throw new RuntimeException(CatchingFishMVPLiveData.CatchingFishOkHttp("error in parsing \"", trim, "\""), e);
                            }
                        }
                        arrayList.add(new CatchingFishPayPalFragment(trim.charAt(i2), fArr));
                    }
                    i3 = i4;
                    i4++;
                    i2 = 0;
                }
                i4++;
            }
            trim = str.substring(i3, i4).trim();
            if (!trim.isEmpty()) {
            }
            i3 = i4;
            i4++;
            i2 = 0;
        }
        if (i4 - i3 != 1 || i3 >= str.length()) {
            i = 0;
        } else {
            i = 0;
            arrayList.add(new CatchingFishPayPalFragment(str.charAt(i3), new float[0]));
        }
        return (CatchingFishPayPalFragment[]) arrayList.toArray(new CatchingFishPayPalFragment[i]);
    }

    public static void CatchingFishMVPRobolectric(CatchingFishPicassoToolbar catchingFishPicassoToolbar, byte[] bArr) {
        long j;
        int length = bArr.length;
        int i = 0;
        do {
            byte[] bArr2 = catchingFishPicassoToolbar.CatchingFishViewModelFAB;
            int i2 = catchingFishPicassoToolbar.CatchingFishLayout;
            int i3 = catchingFishPicassoToolbar.CatchingFishFragmentHandler;
            while (i2 < i3) {
                int i4 = i % length;
                bArr2[i2] = (byte) (bArr2[i2] ^ bArr[i4]);
                i2++;
                i = i4 + 1;
            }
            long j2 = catchingFishPicassoToolbar.CatchingFishViewModelScope;
            CatchingFishWidgetGradle catchingFishWidgetGradle = catchingFishPicassoToolbar.CatchingFishReduxKtor;
            CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishWidgetGradle);
            if (j2 == catchingFishWidgetGradle.CatchingFishDaggerWebsocket) {
                throw new IllegalStateException("no more bytes");
            }
            j = catchingFishPicassoToolbar.CatchingFishViewModelScope;
        } while (catchingFishPicassoToolbar.CatchingFishSnackbar(j == -1 ? 0L : j + (catchingFishPicassoToolbar.CatchingFishFragmentHandler - catchingFishPicassoToolbar.CatchingFishLayout)) != -1);
    }

    public static final int CatchingFishNavigation(int i, int i2) {
        return (i >> i2) & 31;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0121 A[EDGE_INSN: B:98:0x0121->B:80:0x0121 BREAK  A[LOOP:4: B:67:0x00ec->B:93:0x00ec], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean CatchingFishOkHttp(CatchingFishAppCompatWidget catchingFishAppCompatWidget, CatchingFishAppCompatWidget catchingFishAppCompatWidget2, int i, CatchingFishMVPBiometric catchingFishMVPBiometric) {
        CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB;
        CatchingFishBiometricRoom CatchingFishJobScheduler;
        CatchingFishExoPlayerBundle catchingFishExoPlayerBundle;
        CatchingFishFABBiometric CatchingFishMVPRobolectric = catchingFishAppCompatWidget.CatchingFishMVPRobolectric();
        CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB2 = catchingFishAppCompatWidget.CatchingFishReduxKtor;
        if (CatchingFishMVPRobolectric != CatchingFishFABBiometric.CatchingFishDaggerWebsocket) {
            throw new IllegalStateException("This function should only be used within a parent that has focus.");
        }
        CatchingFishAppCompatWidget[] catchingFishAppCompatWidgetArr = new CatchingFishAppCompatWidget[16];
        if (!catchingFishFABStripeAPIFAB2.CatchingFishRoomDatabase) {
            CatchingFishFluxGradle.CatchingFishSnackbar("visitChildren called on an unattached node");
        }
        CatchingFishFABToast catchingFishFABToast = new CatchingFishFABToast(new CatchingFishFABStripeAPIFAB[16]);
        CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB3 = catchingFishFABStripeAPIFAB2.CatchingFishLayout;
        boolean z = false;
        if (catchingFishFABStripeAPIFAB3 == null) {
            CatchingFishXMLLayoutGlide.CatchingFishWorkManager(catchingFishFABToast, catchingFishFABStripeAPIFAB2);
        } else {
            catchingFishFABToast.CatchingFishSnackbar(catchingFishFABStripeAPIFAB3);
        }
        int i2 = 0;
        while (true) {
            int i3 = catchingFishFABToast.CatchingFishWorkManager;
            catchingFishFABStripeAPIFAB = null;
            if (i3 == 0) {
                break;
            }
            CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB4 = (CatchingFishFABStripeAPIFAB) catchingFishFABToast.CatchingFishFragmentHandler(i3 - 1);
            if ((catchingFishFABStripeAPIFAB4.CatchingFishViewModelScope & 1024) == 0) {
                CatchingFishXMLLayoutGlide.CatchingFishWorkManager(catchingFishFABToast, catchingFishFABStripeAPIFAB4);
            } else {
                while (true) {
                    if (catchingFishFABStripeAPIFAB4 == null) {
                        break;
                    }
                    if ((catchingFishFABStripeAPIFAB4.CatchingFishWorkManager & 1024) != 0) {
                        while (catchingFishFABStripeAPIFAB4 != null) {
                            if (catchingFishFABStripeAPIFAB4 instanceof CatchingFishAppCompatWidget) {
                                CatchingFishAppCompatWidget catchingFishAppCompatWidget3 = (CatchingFishAppCompatWidget) catchingFishFABStripeAPIFAB4;
                                int i4 = i2 + 1;
                                if (catchingFishAppCompatWidgetArr.length < i4) {
                                    int length = catchingFishAppCompatWidgetArr.length;
                                    ?? r9 = new Object[Math.max(i4, length * 2)];
                                    System.arraycopy(catchingFishAppCompatWidgetArr, 0, r9, 0, length);
                                    catchingFishAppCompatWidgetArr = r9;
                                }
                                catchingFishAppCompatWidgetArr[i2] = catchingFishAppCompatWidget3;
                                i2 = i4;
                            }
                            catchingFishFABStripeAPIFAB4 = null;
                        }
                    } else {
                        catchingFishFABStripeAPIFAB4 = catchingFishFABStripeAPIFAB4.CatchingFishLayout;
                    }
                }
            }
        }
        CatchingFishMVVMHilt.CatchingFishAndroidX(catchingFishAppCompatWidgetArr, CatchingFishMVVMCoroutine.CatchingFishSnackbar, 0, i2);
        if (i == 1) {
            CatchingFishLifecycleMoshi CatchingFishMoshiDaggerHilt = CatchingFishOkHttpFAB.CatchingFishMoshiDaggerHilt(0, i2);
            int i5 = CatchingFishMoshiDaggerHilt.CatchingFishReduxKtor;
            int i6 = CatchingFishMoshiDaggerHilt.CatchingFishDaggerWebsocket;
            if (i5 <= i6) {
                boolean z2 = false;
                while (true) {
                    if (z2) {
                        CatchingFishAppCompatWidget catchingFishAppCompatWidget4 = catchingFishAppCompatWidgetArr[i5];
                        if (CatchingFishGsonCardView.CatchingFishCustomView(catchingFishAppCompatWidget4) && CatchingFishEspressoTesting(catchingFishAppCompatWidget4, catchingFishMVPBiometric)) {
                            break;
                        }
                    }
                    if (CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishAppCompatWidgetArr[i5], catchingFishAppCompatWidget2)) {
                        z2 = true;
                    }
                    if (i5 == i6) {
                        break;
                    }
                    i5++;
                }
            }
            if (i != 1 && catchingFishAppCompatWidget.CatchingFishCardViewView().CatchingFishParcelableFAB) {
                if (!catchingFishFABStripeAPIFAB2.CatchingFishRoomDatabase) {
                    CatchingFishFluxGradle.CatchingFishSnackbar("visitAncestors called on an unattached node");
                }
                CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB5 = catchingFishFABStripeAPIFAB2.CatchingFishViewModelFAB;
                CatchingFishJobScheduler = CatchingFishXMLLayoutGlide.CatchingFishJobScheduler(catchingFishAppCompatWidget);
                loop4: while (true) {
                    if (CatchingFishJobScheduler == null) {
                        break;
                    }
                    if ((((CatchingFishFABStripeAPIFAB) CatchingFishJobScheduler.CatchingFishJobScheduler.CatchingFishFragmentHandler).CatchingFishViewModelScope & 1024) != 0) {
                        while (catchingFishFABStripeAPIFAB5 != null) {
                            if ((catchingFishFABStripeAPIFAB5.CatchingFishWorkManager & 1024) != 0) {
                                for (CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB6 = catchingFishFABStripeAPIFAB5; catchingFishFABStripeAPIFAB6 != null; catchingFishFABStripeAPIFAB6 = null) {
                                    if (catchingFishFABStripeAPIFAB6 instanceof CatchingFishAppCompatWidget) {
                                        catchingFishFABStripeAPIFAB = catchingFishFABStripeAPIFAB6;
                                        break loop4;
                                    }
                                }
                            }
                            catchingFishFABStripeAPIFAB5 = catchingFishFABStripeAPIFAB5.CatchingFishViewModelFAB;
                        }
                    }
                    CatchingFishJobScheduler = CatchingFishJobScheduler.CatchingFishRoomDatabase();
                    catchingFishFABStripeAPIFAB5 = (CatchingFishJobScheduler == null || (catchingFishExoPlayerBundle = CatchingFishJobScheduler.CatchingFishJobScheduler) == null) ? null : (CatchingFishNavigationToast) catchingFishExoPlayerBundle.CatchingFishLayout;
                }
                if (catchingFishFABStripeAPIFAB != null) {
                    z = ((Boolean) catchingFishMVPBiometric.CatchingFishFragmentHandler(catchingFishAppCompatWidget)).booleanValue();
                }
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("This function should only be used for 1-D focus search");
            }
            CatchingFishLifecycleMoshi CatchingFishMoshiDaggerHilt2 = CatchingFishOkHttpFAB.CatchingFishMoshiDaggerHilt(0, i2);
            int i7 = CatchingFishMoshiDaggerHilt2.CatchingFishReduxKtor;
            int i8 = CatchingFishMoshiDaggerHilt2.CatchingFishDaggerWebsocket;
            if (i7 <= i8) {
                boolean z3 = false;
                while (true) {
                    if (z3) {
                        CatchingFishAppCompatWidget catchingFishAppCompatWidget5 = catchingFishAppCompatWidgetArr[i8];
                        if (CatchingFishGsonCardView.CatchingFishCustomView(catchingFishAppCompatWidget5) && CatchingFishSnackbar(catchingFishAppCompatWidget5, catchingFishMVPBiometric)) {
                            break;
                        }
                    }
                    if (CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishAppCompatWidgetArr[i8], catchingFishAppCompatWidget2)) {
                        z3 = true;
                    }
                    if (i8 == i7) {
                        break;
                    }
                    i8--;
                }
                z = true;
            }
            if (i != 1) {
                if (!catchingFishFABStripeAPIFAB2.CatchingFishRoomDatabase) {
                }
                CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB52 = catchingFishFABStripeAPIFAB2.CatchingFishViewModelFAB;
                CatchingFishJobScheduler = CatchingFishXMLLayoutGlide.CatchingFishJobScheduler(catchingFishAppCompatWidget);
                loop4: while (true) {
                    if (CatchingFishJobScheduler == null) {
                    }
                }
                if (catchingFishFABStripeAPIFAB != null) {
                }
            }
        }
        if (z) {
            return true;
        }
        CatchingFishAppCompatWidget catchingFishAppCompatWidget6 = ((CatchingFishExoPlayerOkHttp) ((CatchingFishGradleCameraX) CatchingFishXMLLayoutGlide.CatchingFishPayPalService(catchingFishAppCompatWidget)).getFocusOwner()).CatchingFishViewModelFAB;
        CatchingFishFirebaseDagger.CatchingFishLayoutInflater(catchingFishAppCompatWidget);
        return false;
    }

    public static float CatchingFishParcelableFAB(float[] fArr) {
        if (fArr.length < 6) {
            return 0.0f;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = (((((f3 * f6) + ((f2 * f5) + (f * f4))) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
        return f7 < 0.0f ? -f7 : f7;
    }

    public static CatchingFishBundleRoom CatchingFishParcelableFlux(MappedByteBuffer mappedByteBuffer) {
        long j;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i = duplicate.getShort() & 65535;
        if (i > 100) {
            throw new IOException("Cannot read metadata.");
        }
        duplicate.position(duplicate.position() + 6);
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                j = -1;
                break;
            }
            int i3 = duplicate.getInt();
            duplicate.position(duplicate.position() + 4);
            j = duplicate.getInt() & 4294967295L;
            duplicate.position(duplicate.position() + 4);
            if (1835365473 == i3) {
                break;
            }
            i2++;
        }
        if (j != -1) {
            duplicate.position(duplicate.position() + ((int) (j - duplicate.position())));
            duplicate.position(duplicate.position() + 12);
            long j2 = duplicate.getInt() & 4294967295L;
            for (int i4 = 0; i4 < j2; i4++) {
                int i5 = duplicate.getInt();
                long j3 = duplicate.getInt() & 4294967295L;
                duplicate.getInt();
                if (1164798569 == i5 || 1701669481 == i5) {
                    duplicate.position((int) (j3 + j));
                    CatchingFishBundleRoom catchingFishBundleRoom = new CatchingFishBundleRoom();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int position = duplicate.position() + duplicate.getInt(duplicate.position());
                    catchingFishBundleRoom.CatchingFishViewModelScope = duplicate;
                    catchingFishBundleRoom.CatchingFishReduxKtor = position;
                    int i6 = position - duplicate.getInt(position);
                    catchingFishBundleRoom.CatchingFishDaggerWebsocket = i6;
                    catchingFishBundleRoom.CatchingFishWorkManager = ((ByteBuffer) catchingFishBundleRoom.CatchingFishViewModelScope).getShort(i6);
                    return catchingFishBundleRoom;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static void CatchingFishPayPal(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            CatchingFishToastEspresso.CatchingFishSnackbar(viewGroup, z);
        } else if (CatchingFishReduxKtor) {
            try {
                CatchingFishToastEspresso.CatchingFishSnackbar(viewGroup, z);
            } catch (NoSuchMethodError unused) {
                CatchingFishReduxKtor = false;
            }
        }
    }

    public static final int CatchingFishReduxKtor(float f) {
        return ((int) (f >= 0.0f ? Math.ceil(f) : Math.floor(f))) * (-1);
    }

    public static final void CatchingFishRoomDatabase(CatchingFishMVPMotionLayout catchingFishMVPMotionLayout) {
        CatchingFishServiceHandler catchingFishServiceHandler;
        ArrayList arrayList = new ArrayList();
        Object CatchingFishViewModelScope = catchingFishMVPMotionLayout.CatchingFishReduxKtor.CatchingFishViewModelScope(CatchingFishViewStripeAPI.CatchingFishParcelableFAB);
        if (CatchingFishViewModelScope == null) {
            CatchingFishViewModelScope = null;
        }
        CatchingFishSnackbarToast catchingFishSnackbarToast = (CatchingFishSnackbarToast) CatchingFishViewModelScope;
        if (catchingFishSnackbarToast != null && (catchingFishServiceHandler = (CatchingFishServiceHandler) catchingFishSnackbarToast.CatchingFishSnackbar) != null && ((Boolean) catchingFishServiceHandler.CatchingFishFragmentHandler(arrayList)).booleanValue() && arrayList.get(0) != null) {
            throw new ClassCastException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean CatchingFishSnackbar(CatchingFishAppCompatWidget catchingFishAppCompatWidget, CatchingFishMVPBiometric catchingFishMVPBiometric) {
        int ordinal = catchingFishAppCompatWidget.CatchingFishMVPRobolectric().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                CatchingFishAppCompatWidget CatchingFishDaggerHiltFAB = CatchingFishGsonCardView.CatchingFishDaggerHiltFAB(catchingFishAppCompatWidget);
                if (CatchingFishDaggerHiltFAB == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                int ordinal2 = CatchingFishDaggerHiltFAB.CatchingFishMVPRobolectric().ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        if (ordinal2 != 2) {
                            if (ordinal2 != 3) {
                                throw new CatchingFishBiometricView();
                            }
                            throw new IllegalStateException("ActiveParent must have a focusedChild");
                        }
                    } else if (CatchingFishSnackbar(CatchingFishDaggerHiltFAB, catchingFishMVPBiometric) || CatchingFishOkHttp(catchingFishAppCompatWidget, CatchingFishDaggerHiltFAB, 2, catchingFishMVPBiometric) || (CatchingFishDaggerHiltFAB.CatchingFishCardViewView().CatchingFishParcelableFAB && ((Boolean) catchingFishMVPBiometric.CatchingFishFragmentHandler(CatchingFishDaggerHiltFAB)).booleanValue())) {
                        return true;
                    }
                }
                return CatchingFishOkHttp(catchingFishAppCompatWidget, CatchingFishDaggerHiltFAB, 2, catchingFishMVPBiometric);
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    throw new CatchingFishBiometricView();
                }
                if (!CatchingFishCoroutineFlow(catchingFishAppCompatWidget, catchingFishMVPBiometric)) {
                    if (!(catchingFishAppCompatWidget.CatchingFishCardViewView().CatchingFishParcelableFAB ? ((Boolean) catchingFishMVPBiometric.CatchingFishFragmentHandler(catchingFishAppCompatWidget)).booleanValue() : false)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return CatchingFishCoroutineFlow(catchingFishAppCompatWidget, catchingFishMVPBiometric);
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:197:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CatchingFishSpannableWidget(ViewStructure viewStructure, CatchingFishBiometricRoom catchingFishBiometricRoom, AutofillId autofillId, String str, CatchingFishPayPalGradle catchingFishPayPalGradle) {
        int i;
        long j;
        long j2;
        char c;
        long j3;
        CatchingFishBundleEspresso catchingFishBundleEspresso;
        CatchingFishWebsocketDagger catchingFishWebsocketDagger;
        CatchingFishExoPlayerHilt catchingFishExoPlayerHilt;
        boolean z;
        CatchingFishMVPRobolectric catchingFishMVPRobolectric;
        Boolean bool;
        CatchingFishToastToastRoom catchingFishToastToastRoom;
        boolean z2;
        Integer num;
        Integer num2;
        List list;
        Integer valueOf;
        String[] CatchingFishNavigation;
        boolean z3;
        boolean z4;
        boolean z5;
        AutofillValue forText;
        String[] CatchingFishNavigation2;
        String[] CatchingFishNavigation3;
        CatchingFishPayPalService catchingFishPayPalService;
        long[] jArr;
        Integer num3;
        long[] jArr2;
        CatchingFishPayPalService catchingFishPayPalService2;
        CatchingFishBundleEspresso catchingFishBundleEspresso2;
        CatchingFishWebsocketDagger catchingFishWebsocketDagger2;
        int i2;
        Integer num4 = 1;
        CatchingFishGraphQLLayout catchingFishGraphQLLayout = CatchingFishServiceMVI.CatchingFishParcelableFAB;
        CatchingFishGraphQLLayout catchingFishGraphQLLayout2 = CatchingFishViewStripeAPI.CatchingFishParcelableFAB;
        CatchingFishMVPMotionLayout CatchingFish = catchingFishBiometricRoom.CatchingFish();
        int i3 = 8;
        if (CatchingFish == null || (catchingFishPayPalService2 = CatchingFish.CatchingFishReduxKtor) == null) {
            i = 2;
            j = 128;
            j2 = 255;
            c = 7;
            j3 = -9187201950435737472L;
            catchingFishBundleEspresso = null;
            catchingFishWebsocketDagger = null;
            catchingFishExoPlayerHilt = null;
            z = false;
            catchingFishMVPRobolectric = null;
            bool = null;
            catchingFishToastToastRoom = null;
            z2 = false;
            num = null;
        } else {
            j = 128;
            Object[] objArr = catchingFishPayPalService2.CatchingFishSnackbar;
            Object[] objArr2 = catchingFishPayPalService2.CatchingFishCoroutine;
            long[] jArr3 = catchingFishPayPalService2.CatchingFishParcelableFAB;
            j2 = 255;
            int length = jArr3.length - 2;
            i = 2;
            if (length >= 0) {
                int i4 = 0;
                catchingFishExoPlayerHilt = null;
                z = false;
                catchingFishBundleEspresso2 = null;
                catchingFishMVPRobolectric = null;
                bool = null;
                catchingFishToastToastRoom = null;
                z2 = false;
                num = null;
                catchingFishWebsocketDagger2 = null;
                c = 7;
                while (true) {
                    long j4 = jArr3[i4];
                    j3 = -9187201950435737472L;
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j4 & 255) < 128) {
                                int i7 = (i4 << 3) + i6;
                                Object obj = objArr[i7];
                                Object obj2 = objArr2[i7];
                                CatchingFishGraphQLLayout catchingFishGraphQLLayout3 = (CatchingFishGraphQLLayout) obj;
                                i2 = i3;
                                if (CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishGraphQLLayout3, CatchingFishServiceMVI.CatchingFishRoomDatabase)) {
                                    CatchingFishFirebaseDagger.CatchingFishStateLiveData(obj2, "null cannot be cast to non-null type androidx.compose.ui.autofill.ContentDataType");
                                    catchingFishExoPlayerHilt = (CatchingFishExoPlayerHilt) obj2;
                                } else if (CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishGraphQLLayout3, CatchingFishServiceMVI.CatchingFishParcelableFAB)) {
                                    CatchingFishFirebaseDagger.CatchingFishStateLiveData(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                                    CharSequence charSequence = (String) CatchingFishCameraXCameraX.CatchingFishJUnitRealm((List) obj2);
                                    if (charSequence != null) {
                                        viewStructure.setContentDescription(charSequence);
                                    }
                                } else if (CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishGraphQLLayout3, CatchingFishServiceMVI.CatchingFishStateLiveData)) {
                                    CatchingFishFirebaseDagger.CatchingFishStateLiveData(obj2, "null cannot be cast to non-null type androidx.compose.ui.autofill.ContentType");
                                    catchingFishMVPRobolectric = (CatchingFishMVPRobolectric) obj2;
                                } else if (CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishGraphQLLayout3, CatchingFishServiceMVI.CatchingFishPayPal)) {
                                    CatchingFishFirebaseDagger.CatchingFishStateLiveData(obj2, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString");
                                    catchingFishWebsocketDagger2 = (CatchingFishWebsocketDagger) obj2;
                                } else if (CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishGraphQLLayout3, CatchingFishServiceMVI.CatchingFishCloudMessaging)) {
                                    CatchingFishFirebaseDagger.CatchingFishStateLiveData(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                                    viewStructure.setFocused(((Boolean) obj2).booleanValue());
                                } else if (CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishGraphQLLayout3, CatchingFishServiceMVI.CatchingFishPayPalService)) {
                                    CatchingFishFirebaseDagger.CatchingFishStateLiveData(obj2, "null cannot be cast to non-null type kotlin.Int");
                                    num = (Integer) obj2;
                                } else if (CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishGraphQLLayout3, CatchingFishServiceMVI.CatchingFishFragmentFactory)) {
                                    z2 = true;
                                } else if (CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishGraphQLLayout3, CatchingFishServiceMVI.CatchingFishCoroutineFlow)) {
                                    CatchingFishFirebaseDagger.CatchingFishStateLiveData(obj2, "null cannot be cast to non-null type androidx.compose.ui.semantics.Role");
                                    catchingFishToastToastRoom = (CatchingFishToastToastRoom) obj2;
                                } else if (CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishGraphQLLayout3, CatchingFishServiceMVI.CatchingFishMVPRobolectric)) {
                                    CatchingFishFirebaseDagger.CatchingFishStateLiveData(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                                    bool = (Boolean) obj2;
                                } else if (CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishGraphQLLayout3, CatchingFishServiceMVI.CatchingFishCustomView)) {
                                    CatchingFishFirebaseDagger.CatchingFishStateLiveData(obj2, "null cannot be cast to non-null type androidx.compose.ui.state.ToggleableState");
                                    catchingFishBundleEspresso2 = (CatchingFishBundleEspresso) obj2;
                                } else if (CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishGraphQLLayout3, CatchingFishViewStripeAPI.CatchingFishSnackbar)) {
                                    viewStructure.setClickable(true);
                                } else if (CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishGraphQLLayout3, CatchingFishViewStripeAPI.CatchingFishCoroutine)) {
                                    viewStructure.setLongClickable(true);
                                } else if (CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishGraphQLLayout3, CatchingFishViewStripeAPI.CatchingFishJetpackCompose)) {
                                    viewStructure.setFocusable(true);
                                } else if (CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishGraphQLLayout3, CatchingFishViewStripeAPI.CatchingFishLayout)) {
                                    z = true;
                                }
                            } else {
                                i2 = i3;
                            }
                            j4 >>= i2;
                            i6++;
                            i3 = i2;
                        }
                        if (i5 != i3) {
                            break;
                        }
                    }
                    if (i4 == length) {
                        break;
                    }
                    i4++;
                    i3 = 8;
                }
            } else {
                c = 7;
                j3 = -9187201950435737472L;
                catchingFishExoPlayerHilt = null;
                z = false;
                catchingFishBundleEspresso2 = null;
                catchingFishMVPRobolectric = null;
                bool = null;
                catchingFishToastToastRoom = null;
                z2 = false;
                num = null;
                catchingFishWebsocketDagger2 = null;
            }
            catchingFishBundleEspresso = catchingFishBundleEspresso2;
            catchingFishWebsocketDagger = catchingFishWebsocketDagger2;
        }
        CatchingFishMVPMotionLayout CatchingFish2 = catchingFishBiometricRoom.CatchingFish();
        if (CatchingFish2 != null && CatchingFish2.CatchingFishWorkManager && !CatchingFish2.CatchingFishViewModelScope) {
            CatchingFish2 = CatchingFish2.CatchingFishParcelableFAB();
            CatchingFishBundleGradle catchingFishBundleGradle = new CatchingFishBundleGradle(((CatchingFishFABFirebase) catchingFishBiometricRoom.CatchingFishCloudMessaging()).CatchingFishReduxKtor.CatchingFishWorkManager);
            catchingFishBundleGradle.CatchingFishSnackbar(catchingFishBiometricRoom.CatchingFishCloudMessaging());
            while (catchingFishBundleGradle.CatchingFishViewModelFAB()) {
                CatchingFishBiometricRoom catchingFishBiometricRoom2 = (CatchingFishBiometricRoom) catchingFishBundleGradle.CatchingFishFragmentHandler(catchingFishBundleGradle.CatchingFishSnackbar - 1);
                CatchingFishMVPMotionLayout CatchingFish3 = catchingFishBiometricRoom2.CatchingFish();
                if (CatchingFish3 != null && !CatchingFish3.CatchingFishWorkManager) {
                    CatchingFish2.CatchingFishCoroutine(CatchingFish3);
                    if (!CatchingFish3.CatchingFishViewModelScope) {
                        catchingFishBundleGradle.CatchingFishSnackbar(catchingFishBiometricRoom2.CatchingFishCloudMessaging());
                    }
                }
            }
        }
        if (CatchingFish2 != null && (catchingFishPayPalService = CatchingFish2.CatchingFishReduxKtor) != null) {
            Object[] objArr3 = catchingFishPayPalService.CatchingFishSnackbar;
            Object[] objArr4 = catchingFishPayPalService.CatchingFishCoroutine;
            long[] jArr4 = catchingFishPayPalService.CatchingFishParcelableFAB;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                int i8 = 0;
                list = null;
                while (true) {
                    long j5 = jArr4[i8];
                    if ((((~j5) << c) & j5 & j3) != j3) {
                        int i9 = 8 - ((~(i8 - length2)) >>> 31);
                        int i10 = 0;
                        while (i10 < i9) {
                            if ((j5 & j2) < j) {
                                int i11 = (i8 << 3) + i10;
                                Object obj3 = objArr3[i11];
                                Object obj4 = objArr4[i11];
                                num3 = num4;
                                CatchingFishGraphQLLayout catchingFishGraphQLLayout4 = (CatchingFishGraphQLLayout) obj3;
                                jArr2 = jArr4;
                                if (CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishGraphQLLayout4, CatchingFishServiceMVI.CatchingFishLayout)) {
                                    viewStructure.setEnabled(false);
                                } else if (CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishGraphQLLayout4, CatchingFishServiceMVI.CatchingFishParcelableFlux)) {
                                    CatchingFishFirebaseDagger.CatchingFishStateLiveData(obj4, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString>");
                                    list = (List) obj4;
                                }
                            } else {
                                num3 = num4;
                                jArr2 = jArr4;
                            }
                            j5 >>= 8;
                            i10++;
                            jArr4 = jArr2;
                            num4 = num3;
                        }
                        num2 = num4;
                        jArr = jArr4;
                        if (i9 != 8) {
                            break;
                        }
                    } else {
                        num2 = num4;
                        jArr = jArr4;
                    }
                    if (i8 == length2) {
                        break;
                    }
                    i8++;
                    jArr4 = jArr;
                    num4 = num2;
                }
                Integer valueOf2 = Integer.valueOf(catchingFishBiometricRoom.CatchingFishDaggerWebsocket);
                if (catchingFishBiometricRoom.CatchingFishRoomDatabase() == null) {
                    valueOf2 = null;
                }
                int intValue = valueOf2 == null ? valueOf2.intValue() : -1;
                viewStructure.setAutofillId(autofillId, intValue);
                viewStructure.setId(intValue, str, null, null);
                valueOf = (catchingFishExoPlayerHilt == null && !z) ? catchingFishBundleEspresso == null ? Integer.valueOf(i) : null : num2;
                if (valueOf != null) {
                    viewStructure.setAutofillType(valueOf.intValue());
                }
                if (catchingFishMVPRobolectric != null && (CatchingFishNavigation3 = CatchingFishBiometricBundle.CatchingFishNavigation(catchingFishMVPRobolectric)) != null) {
                    viewStructure.setAutofillHints(CatchingFishNavigation3);
                }
                catchingFishPayPalGradle.CatchingFishParcelableFAB.CatchingFishViewModelFAB(catchingFishBiometricRoom.CatchingFishDaggerWebsocket, new CatchingFishToolbarFirebase(viewStructure));
                if (bool != null) {
                    viewStructure.setSelected(bool.booleanValue());
                }
                if (catchingFishBundleEspresso != null) {
                    viewStructure.setCheckable(true);
                    viewStructure.setChecked(catchingFishBundleEspresso == CatchingFishBundleEspresso.CatchingFishReduxKtor);
                } else if (bool != null) {
                    viewStructure.setCheckable(true);
                    viewStructure.setChecked(bool.booleanValue());
                }
                CatchingFishMVPRobolectric.CatchingFishParcelableFAB.getClass();
                CatchingFishNavigation = CatchingFishBiometricBundle.CatchingFishNavigation(CatchingFishAnimationOkHttp.CatchingFishSnackbar);
                CatchingFishFirebaseDagger.CatchingFishNavigation(CatchingFishNavigation, "<this>");
                if (CatchingFishNavigation.length == 0) {
                    throw new NoSuchElementException("Array is empty.");
                }
                String str2 = CatchingFishNavigation[0];
                if (catchingFishMVPRobolectric == null || (CatchingFishNavigation2 = CatchingFishBiometricBundle.CatchingFishNavigation(catchingFishMVPRobolectric)) == null) {
                    z3 = true;
                } else {
                    boolean CatchingFishMotionLayout = CatchingFishMVVMHilt.CatchingFishMotionLayout(CatchingFishNavigation2, str2);
                    z3 = true;
                    if (CatchingFishMotionLayout) {
                        z4 = true;
                        z5 = (!z2 || z4) ? z3 : false;
                        if (z5) {
                            viewStructure.setDataIsSensitive(true);
                        }
                        viewStructure.setVisibility(!((CatchingFishDaggerToolbar) catchingFishBiometricRoom.CatchingFishJobScheduler.CatchingFishViewModelFAB).CatchingFishDaggerAppCompat() ? 4 : 0);
                        if (list != null) {
                            int size = list.size();
                            String str3 = "";
                            for (int i12 = 0; i12 < size; i12++) {
                                str3 = str3 + ((CatchingFishWebsocketDagger) list.get(i12)).CatchingFishDaggerWebsocket + '\n';
                            }
                            viewStructure.setText(str3);
                            viewStructure.setClassName("android.widget.TextView");
                        }
                        if (((CatchingFishFABFirebase) catchingFishBiometricRoom.CatchingFishCloudMessaging()).isEmpty() && catchingFishToastToastRoom != null) {
                            viewStructure.setClassName("android.widget.ImageView");
                        }
                        if (z) {
                            return;
                        }
                        viewStructure.setClassName("android.widget.EditText");
                        if (Build.VERSION.SDK_INT >= 28 && num != null) {
                            viewStructure.setMaxTextLength(num.intValue());
                        }
                        if (catchingFishWebsocketDagger != null) {
                            forText = AutofillValue.forText(catchingFishWebsocketDagger.CatchingFishDaggerWebsocket);
                            viewStructure.setAutofillValue(forText);
                        }
                        if (z5) {
                            viewStructure.setInputType(129);
                            return;
                        }
                        return;
                    }
                }
                z4 = false;
                if (z2) {
                }
                if (z5) {
                }
                viewStructure.setVisibility(!((CatchingFishDaggerToolbar) catchingFishBiometricRoom.CatchingFishJobScheduler.CatchingFishViewModelFAB).CatchingFishDaggerAppCompat() ? 4 : 0);
                if (list != null) {
                }
                if (((CatchingFishFABFirebase) catchingFishBiometricRoom.CatchingFishCloudMessaging()).isEmpty()) {
                    viewStructure.setClassName("android.widget.ImageView");
                }
                if (z) {
                }
            }
        }
        num2 = num4;
        list = null;
        Integer valueOf22 = Integer.valueOf(catchingFishBiometricRoom.CatchingFishDaggerWebsocket);
        if (catchingFishBiometricRoom.CatchingFishRoomDatabase() == null) {
        }
        if (valueOf22 == null) {
        }
        viewStructure.setAutofillId(autofillId, intValue);
        viewStructure.setId(intValue, str, null, null);
        if (catchingFishExoPlayerHilt == null) {
            if (valueOf != null) {
            }
            if (catchingFishMVPRobolectric != null) {
                viewStructure.setAutofillHints(CatchingFishNavigation3);
            }
            catchingFishPayPalGradle.CatchingFishParcelableFAB.CatchingFishViewModelFAB(catchingFishBiometricRoom.CatchingFishDaggerWebsocket, new CatchingFishToolbarFirebase(viewStructure));
            if (bool != null) {
            }
            if (catchingFishBundleEspresso != null) {
            }
            CatchingFishMVPRobolectric.CatchingFishParcelableFAB.getClass();
            CatchingFishNavigation = CatchingFishBiometricBundle.CatchingFishNavigation(CatchingFishAnimationOkHttp.CatchingFishSnackbar);
            CatchingFishFirebaseDagger.CatchingFishNavigation(CatchingFishNavigation, "<this>");
            if (CatchingFishNavigation.length == 0) {
            }
        }
        if (valueOf != null) {
        }
        if (catchingFishMVPRobolectric != null) {
        }
        catchingFishPayPalGradle.CatchingFishParcelableFAB.CatchingFishViewModelFAB(catchingFishBiometricRoom.CatchingFishDaggerWebsocket, new CatchingFishToolbarFirebase(viewStructure));
        if (bool != null) {
        }
        if (catchingFishBundleEspresso != null) {
        }
        CatchingFishMVPRobolectric.CatchingFishParcelableFAB.getClass();
        CatchingFishNavigation = CatchingFishBiometricBundle.CatchingFishNavigation(CatchingFishAnimationOkHttp.CatchingFishSnackbar);
        CatchingFishFirebaseDagger.CatchingFishNavigation(CatchingFishNavigation, "<this>");
        if (CatchingFishNavigation.length == 0) {
        }
    }

    public static File CatchingFishStateLiveData(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, str + i);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0070, code lost:
    
        if (r2 == null) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String CatchingFishUnitTesting() {
        BufferedReader bufferedReader;
        String processName;
        if (CatchingFishParcelableFAB == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                processName = Application.getProcessName();
                CatchingFishParcelableFAB = processName;
            } else {
                int i = CatchingFishSnackbar;
                if (i == 0) {
                    i = Process.myPid();
                    CatchingFishSnackbar = i;
                }
                String str = null;
                str = null;
                str = null;
                BufferedReader bufferedReader2 = null;
                if (i > 0) {
                    try {
                        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 14);
                        sb.append("/proc/");
                        sb.append(i);
                        sb.append("/cmdline");
                        String sb2 = sb.toString();
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            bufferedReader = new BufferedReader(new FileReader(sb2));
                        } finally {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                        }
                    } catch (IOException unused) {
                        bufferedReader = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        String readLine = bufferedReader.readLine();
                        CatchingFishToastHiltBundle.CatchingFishAnimationMockk(readLine);
                        str = readLine.trim();
                    } catch (IOException unused2) {
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader2 = bufferedReader;
                        if (bufferedReader2 != null) {
                            try {
                                bufferedReader2.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th;
                    }
                    try {
                        bufferedReader.close();
                    } catch (IOException unused4) {
                    }
                }
                CatchingFishParcelableFAB = str;
            }
        }
        return CatchingFishParcelableFAB;
    }

    public static CatchingFishLayoutRoomFAB CatchingFishViewModelFAB(int i) {
        return i != 0 ? i != 1 ? new CatchingFishLayoutKtor() : new CatchingFishReduxHandler() : new CatchingFishLayoutKtor();
    }

    public static boolean CatchingFishViewModelScope(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    try {
                        break;
                    } catch (IOException unused) {
                    }
                }
            }
            fileOutputStream.close();
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return true;
        } catch (IOException e2) {
            e = e2;
            fileOutputStream2 = fileOutputStream;
            e.getMessage();
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused2) {
                }
            }
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
            }
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    public static boolean CatchingFishWorkManager(File file, Resources resources, int i) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i);
        } catch (Throwable th) {
            th = th;
            inputStream = null;
        }
        try {
            boolean CatchingFishViewModelScope = CatchingFishViewModelScope(file, inputStream);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
            return CatchingFishViewModelScope;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }
}
