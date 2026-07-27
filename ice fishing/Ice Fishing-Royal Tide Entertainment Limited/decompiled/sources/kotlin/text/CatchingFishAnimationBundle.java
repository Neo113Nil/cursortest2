package kotlin.text;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.android.installreferrer.api.InstallReferrerClient;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class CatchingFishAnimationBundle {
    public static final SparseIntArray CatchingFishDaggerWebsocket;
    public static final int[] CatchingFishReduxKtor = {0, 4, 8};
    public static final SparseIntArray CatchingFishWorkManager;
    public final HashMap CatchingFishParcelableFAB = new HashMap();
    public final boolean CatchingFishSnackbar = true;
    public final HashMap CatchingFishCoroutine = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        CatchingFishDaggerWebsocket = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        CatchingFishWorkManager = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    public static int[] CatchingFishCoroutine(CatchingFishHiltXMLLayout catchingFishHiltXMLLayout, String str) {
        int i;
        String[] split = str.split(",");
        Context context = catchingFishHiltXMLLayout.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            Object obj = null;
            try {
                i = CatchingFishMVIDataStore.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && catchingFishHiltXMLLayout.isInEditMode() && (catchingFishHiltXMLLayout.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) catchingFishHiltXMLLayout.getParent();
                if (trim != null) {
                    HashMap hashMap = constraintLayout.CatchingFishStateLiveData;
                    if (hashMap != null && hashMap.containsKey(trim)) {
                        obj = constraintLayout.CatchingFishStateLiveData.get(trim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    i = ((Integer) obj).intValue();
                }
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        return i3 != split.length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static CatchingFishMoshiPicasso CatchingFishReduxKtor(Context context, AttributeSet attributeSet, boolean z) {
        CatchingFishMoshiPicasso catchingFishMoshiPicasso = new CatchingFishMoshiPicasso();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? CatchingFishFluxAndroidX.CatchingFishCoroutine : CatchingFishFluxAndroidX.CatchingFishParcelableFAB);
        String[] strArr = CatchingFishAdMobFAB.CatchingFishDaggerWebsocket;
        CatchingFishBundleService catchingFishBundleService = catchingFishMoshiPicasso.CatchingFishSnackbar;
        CatchingFishGradleDataStore catchingFishGradleDataStore = catchingFishMoshiPicasso.CatchingFishDaggerWebsocket;
        CatchingFishAsyncTaskRoom catchingFishAsyncTaskRoom = catchingFishMoshiPicasso.CatchingFishCoroutine;
        CatchingFishDatabindingGson catchingFishDatabindingGson = catchingFishMoshiPicasso.CatchingFishReduxKtor;
        int[] iArr = CatchingFishReduxKtor;
        SparseIntArray sparseIntArray = CatchingFishDaggerWebsocket;
        int i = 3;
        if (z) {
            int indexCount = obtainStyledAttributes.getIndexCount();
            CatchingFishCameraXToast catchingFishCameraXToast = new CatchingFishCameraXToast();
            catchingFishCameraXToast.CatchingFishParcelableFAB = new int[10];
            catchingFishCameraXToast.CatchingFishSnackbar = new int[10];
            catchingFishCameraXToast.CatchingFishCoroutine = 0;
            catchingFishCameraXToast.CatchingFishReduxKtor = new int[10];
            catchingFishCameraXToast.CatchingFishDaggerWebsocket = new float[10];
            catchingFishCameraXToast.CatchingFishWorkManager = 0;
            catchingFishCameraXToast.CatchingFishViewModelScope = new int[5];
            catchingFishCameraXToast.CatchingFishViewModelFAB = new String[5];
            catchingFishCameraXToast.CatchingFishLayout = 0;
            catchingFishCameraXToast.CatchingFishFragmentHandler = new int[4];
            catchingFishCameraXToast.CatchingFishCloudMessaging = new boolean[4];
            catchingFishCameraXToast.CatchingFishEspressoTesting = 0;
            catchingFishAsyncTaskRoom.getClass();
            catchingFishDatabindingGson.getClass();
            catchingFishGradleDataStore.getClass();
            int i2 = 0;
            while (i2 < indexCount) {
                int index = obtainStyledAttributes.getIndex(i2);
                switch (CatchingFishWorkManager.get(index)) {
                    case 2:
                        catchingFishCameraXToast.CatchingFishSnackbar(2, obtainStyledAttributes.getDimensionPixelSize(index, catchingFishDatabindingGson.CatchingFishSensorManager));
                        continue;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case 32:
                    case 33:
                    case 35:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        Integer.toHexString(index);
                        sparseIntArray.get(index);
                        break;
                    case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                        catchingFishCameraXToast.CatchingFishReduxKtor(obtainStyledAttributes.getString(index), 5);
                        continue;
                    case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                        catchingFishCameraXToast.CatchingFishSnackbar(6, obtainStyledAttributes.getDimensionPixelOffset(index, catchingFishDatabindingGson.CatchingFishMVPRobolectric));
                        break;
                    case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
                        catchingFishCameraXToast.CatchingFishSnackbar(7, obtainStyledAttributes.getDimensionPixelOffset(index, catchingFishDatabindingGson.CatchingFishCustomView));
                        break;
                    case CatchingFishMoshiSpannable.BYTES_FIELD_NUMBER /* 8 */:
                        catchingFishCameraXToast.CatchingFishSnackbar(8, obtainStyledAttributes.getDimensionPixelSize(index, catchingFishDatabindingGson.CatchingFishEspressoMockk));
                        break;
                    case 11:
                        catchingFishCameraXToast.CatchingFishSnackbar(11, obtainStyledAttributes.getDimensionPixelSize(index, catchingFishDatabindingGson.CatchingFishMotionLayout));
                        break;
                    case 12:
                        catchingFishCameraXToast.CatchingFishSnackbar(12, obtainStyledAttributes.getDimensionPixelSize(index, catchingFishDatabindingGson.CatchingFishLayoutInflater));
                        break;
                    case 13:
                        catchingFishCameraXToast.CatchingFishSnackbar(13, obtainStyledAttributes.getDimensionPixelSize(index, catchingFishDatabindingGson.CatchingFishHandler));
                        break;
                    case 14:
                        catchingFishCameraXToast.CatchingFishSnackbar(14, obtainStyledAttributes.getDimensionPixelSize(index, catchingFishDatabindingGson.CatchingFishGradleManifest));
                        break;
                    case 15:
                        catchingFishCameraXToast.CatchingFishSnackbar(15, obtainStyledAttributes.getDimensionPixelSize(index, catchingFishDatabindingGson.CatchingFishParcelable));
                        break;
                    case 16:
                        catchingFishCameraXToast.CatchingFishSnackbar(16, obtainStyledAttributes.getDimensionPixelSize(index, catchingFishDatabindingGson.CatchingFishPayPalLiveData));
                        break;
                    case 17:
                        catchingFishCameraXToast.CatchingFishSnackbar(17, obtainStyledAttributes.getDimensionPixelOffset(index, catchingFishDatabindingGson.CatchingFishReduxKtor));
                        break;
                    case 18:
                        catchingFishCameraXToast.CatchingFishSnackbar(18, obtainStyledAttributes.getDimensionPixelOffset(index, catchingFishDatabindingGson.CatchingFishDaggerWebsocket));
                        break;
                    case 19:
                        catchingFishCameraXToast.CatchingFishParcelableFAB(19, obtainStyledAttributes.getFloat(index, catchingFishDatabindingGson.CatchingFishWorkManager));
                        break;
                    case 20:
                        catchingFishCameraXToast.CatchingFishParcelableFAB(20, obtainStyledAttributes.getFloat(index, catchingFishDatabindingGson.CatchingFishSpannableWidget));
                        break;
                    case 21:
                        catchingFishCameraXToast.CatchingFishSnackbar(21, obtainStyledAttributes.getLayoutDimension(index, catchingFishDatabindingGson.CatchingFishCoroutine));
                        break;
                    case 22:
                        catchingFishCameraXToast.CatchingFishSnackbar(22, iArr[obtainStyledAttributes.getInt(index, catchingFishBundleService.CatchingFishParcelableFAB)]);
                        break;
                    case 23:
                        catchingFishCameraXToast.CatchingFishSnackbar(23, obtainStyledAttributes.getLayoutDimension(index, catchingFishDatabindingGson.CatchingFishSnackbar));
                        break;
                    case 24:
                        catchingFishCameraXToast.CatchingFishSnackbar(24, obtainStyledAttributes.getDimensionPixelSize(index, catchingFishDatabindingGson.CatchingFishMutableLiveData));
                        break;
                    case 27:
                        catchingFishCameraXToast.CatchingFishSnackbar(27, obtainStyledAttributes.getInt(index, catchingFishDatabindingGson.CatchingFishFragmentFactory));
                        break;
                    case 28:
                        catchingFishCameraXToast.CatchingFishSnackbar(28, obtainStyledAttributes.getDimensionPixelSize(index, catchingFishDatabindingGson.CatchingFishJobScheduler));
                        break;
                    case 31:
                        catchingFishCameraXToast.CatchingFishSnackbar(31, obtainStyledAttributes.getDimensionPixelSize(index, catchingFishDatabindingGson.CatchingFishDagger));
                        break;
                    case 34:
                        catchingFishCameraXToast.CatchingFishSnackbar(34, obtainStyledAttributes.getDimensionPixelSize(index, catchingFishDatabindingGson.CatchingFishPayPalService));
                        break;
                    case 37:
                        catchingFishCameraXToast.CatchingFishParcelableFAB(37, obtainStyledAttributes.getFloat(index, catchingFishDatabindingGson.CatchingFishParcelableFlux));
                        break;
                    case 38:
                        int resourceId = obtainStyledAttributes.getResourceId(index, catchingFishMoshiPicasso.CatchingFishParcelableFAB);
                        catchingFishMoshiPicasso.CatchingFishParcelableFAB = resourceId;
                        catchingFishCameraXToast.CatchingFishSnackbar(38, resourceId);
                        break;
                    case 39:
                        catchingFishCameraXToast.CatchingFishParcelableFAB(39, obtainStyledAttributes.getFloat(index, catchingFishDatabindingGson.CatchingFishDataStoreIntent));
                        break;
                    case 40:
                        catchingFishCameraXToast.CatchingFishParcelableFAB(40, obtainStyledAttributes.getFloat(index, catchingFishDatabindingGson.CatchingFishAppCompat));
                        break;
                    case 41:
                        catchingFishCameraXToast.CatchingFishSnackbar(41, obtainStyledAttributes.getInt(index, catchingFishDatabindingGson.CatchingFishStateFlow));
                        break;
                    case 42:
                        catchingFishCameraXToast.CatchingFishSnackbar(42, obtainStyledAttributes.getInt(index, catchingFishDatabindingGson.CatchingFishJUnitRealm));
                        break;
                    case 43:
                        catchingFishCameraXToast.CatchingFishParcelableFAB(43, obtainStyledAttributes.getFloat(index, catchingFishBundleService.CatchingFishCoroutine));
                        break;
                    case 44:
                        catchingFishCameraXToast.CatchingFishCoroutine(44, true);
                        catchingFishCameraXToast.CatchingFishParcelableFAB(44, obtainStyledAttributes.getDimension(index, catchingFishGradleDataStore.CatchingFishOkHttp));
                        break;
                    case 45:
                        catchingFishCameraXToast.CatchingFishParcelableFAB(45, obtainStyledAttributes.getFloat(index, catchingFishGradleDataStore.CatchingFishSnackbar));
                        break;
                    case 46:
                        catchingFishCameraXToast.CatchingFishParcelableFAB(46, obtainStyledAttributes.getFloat(index, catchingFishGradleDataStore.CatchingFishCoroutine));
                        break;
                    case 47:
                        catchingFishCameraXToast.CatchingFishParcelableFAB(47, obtainStyledAttributes.getFloat(index, catchingFishGradleDataStore.CatchingFishReduxKtor));
                        break;
                    case 48:
                        catchingFishCameraXToast.CatchingFishParcelableFAB(48, obtainStyledAttributes.getFloat(index, catchingFishGradleDataStore.CatchingFishDaggerWebsocket));
                        break;
                    case 49:
                        catchingFishCameraXToast.CatchingFishParcelableFAB(49, obtainStyledAttributes.getDimension(index, catchingFishGradleDataStore.CatchingFishWorkManager));
                        break;
                    case 50:
                        catchingFishCameraXToast.CatchingFishParcelableFAB(50, obtainStyledAttributes.getDimension(index, catchingFishGradleDataStore.CatchingFishViewModelScope));
                        break;
                    case 51:
                        catchingFishCameraXToast.CatchingFishParcelableFAB(51, obtainStyledAttributes.getDimension(index, catchingFishGradleDataStore.CatchingFishLayout));
                        break;
                    case 52:
                        catchingFishCameraXToast.CatchingFishParcelableFAB(52, obtainStyledAttributes.getDimension(index, catchingFishGradleDataStore.CatchingFishFragmentHandler));
                        break;
                    case 53:
                        catchingFishCameraXToast.CatchingFishParcelableFAB(53, obtainStyledAttributes.getDimension(index, catchingFishGradleDataStore.CatchingFishCloudMessaging));
                        break;
                    case 54:
                        catchingFishCameraXToast.CatchingFishSnackbar(54, obtainStyledAttributes.getInt(index, catchingFishDatabindingGson.CatchingFishAnimation));
                        break;
                    case 55:
                        catchingFishCameraXToast.CatchingFishSnackbar(55, obtainStyledAttributes.getInt(index, catchingFishDatabindingGson.CatchingFishMVVMAppCompat));
                        break;
                    case 56:
                        catchingFishCameraXToast.CatchingFishSnackbar(56, obtainStyledAttributes.getDimensionPixelSize(index, catchingFishDatabindingGson.CatchingFishStripeAPI));
                        break;
                    case 57:
                        catchingFishCameraXToast.CatchingFishSnackbar(57, obtainStyledAttributes.getDimensionPixelSize(index, catchingFishDatabindingGson.CatchingFishMoshiDaggerHilt));
                        break;
                    case 58:
                        catchingFishCameraXToast.CatchingFishSnackbar(58, obtainStyledAttributes.getDimensionPixelSize(index, catchingFishDatabindingGson.CatchingFishAndroidX));
                        break;
                    case 59:
                        catchingFishCameraXToast.CatchingFishSnackbar(59, obtainStyledAttributes.getDimensionPixelSize(index, catchingFishDatabindingGson.CatchingFishNavigationGson));
                        break;
                    case 60:
                        catchingFishCameraXToast.CatchingFishParcelableFAB(60, obtainStyledAttributes.getFloat(index, catchingFishGradleDataStore.CatchingFishParcelableFAB));
                        break;
                    case 62:
                        catchingFishCameraXToast.CatchingFishSnackbar(62, obtainStyledAttributes.getDimensionPixelSize(index, catchingFishDatabindingGson.CatchingFishPayPal));
                        break;
                    case 63:
                        catchingFishCameraXToast.CatchingFishParcelableFAB(63, obtainStyledAttributes.getFloat(index, catchingFishDatabindingGson.CatchingFishCardViewView));
                        break;
                    case 64:
                        catchingFishCameraXToast.CatchingFishSnackbar(64, CatchingFishWorkManager(obtainStyledAttributes, index, catchingFishAsyncTaskRoom.CatchingFishParcelableFAB));
                        break;
                    case 65:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            catchingFishCameraXToast.CatchingFishReduxKtor(obtainStyledAttributes.getString(index), 65);
                            break;
                        } else {
                            catchingFishCameraXToast.CatchingFishReduxKtor(strArr[obtainStyledAttributes.getInteger(index, 0)], 65);
                            break;
                        }
                    case 66:
                        catchingFishCameraXToast.CatchingFishSnackbar(66, obtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        catchingFishCameraXToast.CatchingFishParcelableFAB(67, obtainStyledAttributes.getFloat(index, catchingFishAsyncTaskRoom.CatchingFishDaggerWebsocket));
                        break;
                    case 68:
                        catchingFishCameraXToast.CatchingFishParcelableFAB(68, obtainStyledAttributes.getFloat(index, catchingFishBundleService.CatchingFishReduxKtor));
                        break;
                    case 69:
                        catchingFishCameraXToast.CatchingFishParcelableFAB(69, obtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 70:
                        catchingFishCameraXToast.CatchingFishParcelableFAB(70, obtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 71:
                        break;
                    case 72:
                        catchingFishCameraXToast.CatchingFishSnackbar(72, obtainStyledAttributes.getInt(index, catchingFishDatabindingGson.CatchingFishDaggerMVVM));
                        break;
                    case 73:
                        catchingFishCameraXToast.CatchingFishSnackbar(73, obtainStyledAttributes.getDimensionPixelSize(index, catchingFishDatabindingGson.CatchingFishMockkOkHttp));
                        break;
                    case 74:
                        catchingFishCameraXToast.CatchingFishReduxKtor(obtainStyledAttributes.getString(index), 74);
                        break;
                    case 75:
                        catchingFishCameraXToast.CatchingFishCoroutine(75, obtainStyledAttributes.getBoolean(index, catchingFishDatabindingGson.CatchingFishView));
                        break;
                    case 76:
                        catchingFishCameraXToast.CatchingFishSnackbar(76, obtainStyledAttributes.getInt(index, catchingFishAsyncTaskRoom.CatchingFishCoroutine));
                        break;
                    case 77:
                        catchingFishCameraXToast.CatchingFishReduxKtor(obtainStyledAttributes.getString(index), 77);
                        break;
                    case 78:
                        catchingFishCameraXToast.CatchingFishSnackbar(78, obtainStyledAttributes.getInt(index, catchingFishBundleService.CatchingFishSnackbar));
                        break;
                    case 79:
                        catchingFishCameraXToast.CatchingFishParcelableFAB(79, obtainStyledAttributes.getFloat(index, catchingFishAsyncTaskRoom.CatchingFishReduxKtor));
                        break;
                    case 80:
                        catchingFishCameraXToast.CatchingFishCoroutine(80, obtainStyledAttributes.getBoolean(index, catchingFishDatabindingGson.CatchingFishGradleLiveData));
                        break;
                    case 81:
                        catchingFishCameraXToast.CatchingFishCoroutine(81, obtainStyledAttributes.getBoolean(index, catchingFishDatabindingGson.CatchingFishRetrofit));
                        break;
                    case 82:
                        catchingFishCameraXToast.CatchingFishSnackbar(82, obtainStyledAttributes.getInteger(index, catchingFishAsyncTaskRoom.CatchingFishSnackbar));
                        break;
                    case 83:
                        catchingFishCameraXToast.CatchingFishSnackbar(83, CatchingFishWorkManager(obtainStyledAttributes, index, catchingFishGradleDataStore.CatchingFishViewModelFAB));
                        break;
                    case 84:
                        catchingFishCameraXToast.CatchingFishSnackbar(84, obtainStyledAttributes.getInteger(index, catchingFishAsyncTaskRoom.CatchingFishViewModelScope));
                        break;
                    case 85:
                        catchingFishCameraXToast.CatchingFishParcelableFAB(85, obtainStyledAttributes.getFloat(index, catchingFishAsyncTaskRoom.CatchingFishWorkManager));
                        break;
                    case 86:
                        int i3 = obtainStyledAttributes.peekValue(index).type;
                        if (i3 == 1) {
                            int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                            catchingFishAsyncTaskRoom.CatchingFishLayout = resourceId2;
                            catchingFishCameraXToast.CatchingFishSnackbar(89, resourceId2);
                            if (catchingFishAsyncTaskRoom.CatchingFishLayout != -1) {
                                catchingFishCameraXToast.CatchingFishSnackbar(88, -2);
                                break;
                            }
                        } else if (i3 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            catchingFishAsyncTaskRoom.CatchingFishViewModelFAB = string;
                            catchingFishCameraXToast.CatchingFishReduxKtor(string, 90);
                            if (catchingFishAsyncTaskRoom.CatchingFishViewModelFAB.indexOf("/") > 0) {
                                int resourceId3 = obtainStyledAttributes.getResourceId(index, -1);
                                catchingFishAsyncTaskRoom.CatchingFishLayout = resourceId3;
                                catchingFishCameraXToast.CatchingFishSnackbar(89, resourceId3);
                                catchingFishCameraXToast.CatchingFishSnackbar(88, -2);
                                break;
                            } else {
                                catchingFishCameraXToast.CatchingFishSnackbar(88, -1);
                                break;
                            }
                        } else {
                            catchingFishCameraXToast.CatchingFishSnackbar(88, obtainStyledAttributes.getInteger(index, catchingFishAsyncTaskRoom.CatchingFishLayout));
                            break;
                        }
                        break;
                    case 87:
                        Integer.toHexString(index);
                        sparseIntArray.get(index);
                        break;
                    case 93:
                        catchingFishCameraXToast.CatchingFishSnackbar(93, obtainStyledAttributes.getDimensionPixelSize(index, catchingFishDatabindingGson.CatchingFishCameraXIntent));
                        break;
                    case 94:
                        catchingFishCameraXToast.CatchingFishSnackbar(94, obtainStyledAttributes.getDimensionPixelSize(index, catchingFishDatabindingGson.CatchingFishRecyclerView));
                        break;
                    case 95:
                        CatchingFishViewModelScope(catchingFishCameraXToast, obtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        CatchingFishViewModelScope(catchingFishCameraXToast, obtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        catchingFishCameraXToast.CatchingFishSnackbar(97, obtainStyledAttributes.getInt(index, catchingFishDatabindingGson.CatchingFishServiceMVIJUnit));
                        break;
                    case 98:
                        int i4 = CatchingFishFirebaseWidget.CatchingFishJetpackCompose;
                        if (obtainStyledAttributes.peekValue(index).type == i) {
                            obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            catchingFishMoshiPicasso.CatchingFishParcelableFAB = obtainStyledAttributes.getResourceId(index, catchingFishMoshiPicasso.CatchingFishParcelableFAB);
                            break;
                        }
                    case 99:
                        catchingFishCameraXToast.CatchingFishCoroutine(99, obtainStyledAttributes.getBoolean(index, catchingFishDatabindingGson.CatchingFishViewModelScope));
                        break;
                }
                i2++;
                i = 3;
            }
        } else {
            int indexCount2 = obtainStyledAttributes.getIndexCount();
            for (int i5 = 0; i5 < indexCount2; i5++) {
                int index2 = obtainStyledAttributes.getIndex(i5);
                if (index2 != 1 && 23 != index2 && 24 != index2) {
                    catchingFishAsyncTaskRoom.getClass();
                    catchingFishDatabindingGson.getClass();
                    catchingFishGradleDataStore.getClass();
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        catchingFishDatabindingGson.CatchingFishStateLiveData = CatchingFishWorkManager(obtainStyledAttributes, index2, catchingFishDatabindingGson.CatchingFishStateLiveData);
                        break;
                    case 2:
                        catchingFishDatabindingGson.CatchingFishSensorManager = obtainStyledAttributes.getDimensionPixelSize(index2, catchingFishDatabindingGson.CatchingFishSensorManager);
                        break;
                    case 3:
                        catchingFishDatabindingGson.CatchingFishAnimationMockk = CatchingFishWorkManager(obtainStyledAttributes, index2, catchingFishDatabindingGson.CatchingFishAnimationMockk);
                        break;
                    case 4:
                        catchingFishDatabindingGson.CatchingFishUnitTesting = CatchingFishWorkManager(obtainStyledAttributes, index2, catchingFishDatabindingGson.CatchingFishUnitTesting);
                        break;
                    case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                        catchingFishDatabindingGson.CatchingFishGsonAppCompat = obtainStyledAttributes.getString(index2);
                        break;
                    case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                        catchingFishDatabindingGson.CatchingFishMVPRobolectric = obtainStyledAttributes.getDimensionPixelOffset(index2, catchingFishDatabindingGson.CatchingFishMVPRobolectric);
                        break;
                    case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
                        catchingFishDatabindingGson.CatchingFishCustomView = obtainStyledAttributes.getDimensionPixelOffset(index2, catchingFishDatabindingGson.CatchingFishCustomView);
                        break;
                    case CatchingFishMoshiSpannable.BYTES_FIELD_NUMBER /* 8 */:
                        catchingFishDatabindingGson.CatchingFishEspressoMockk = obtainStyledAttributes.getDimensionPixelSize(index2, catchingFishDatabindingGson.CatchingFishEspressoMockk);
                        break;
                    case 9:
                        catchingFishDatabindingGson.CatchingFishDaggerHiltFAB = CatchingFishWorkManager(obtainStyledAttributes, index2, catchingFishDatabindingGson.CatchingFishDaggerHiltFAB);
                        break;
                    case 10:
                        catchingFishDatabindingGson.CatchingFishCoroutineFlow = CatchingFishWorkManager(obtainStyledAttributes, index2, catchingFishDatabindingGson.CatchingFishCoroutineFlow);
                        break;
                    case 11:
                        catchingFishDatabindingGson.CatchingFishMotionLayout = obtainStyledAttributes.getDimensionPixelSize(index2, catchingFishDatabindingGson.CatchingFishMotionLayout);
                        break;
                    case 12:
                        catchingFishDatabindingGson.CatchingFishLayoutInflater = obtainStyledAttributes.getDimensionPixelSize(index2, catchingFishDatabindingGson.CatchingFishLayoutInflater);
                        break;
                    case 13:
                        catchingFishDatabindingGson.CatchingFishHandler = obtainStyledAttributes.getDimensionPixelSize(index2, catchingFishDatabindingGson.CatchingFishHandler);
                        break;
                    case 14:
                        catchingFishDatabindingGson.CatchingFishGradleManifest = obtainStyledAttributes.getDimensionPixelSize(index2, catchingFishDatabindingGson.CatchingFishGradleManifest);
                        break;
                    case 15:
                        catchingFishDatabindingGson.CatchingFishParcelable = obtainStyledAttributes.getDimensionPixelSize(index2, catchingFishDatabindingGson.CatchingFishParcelable);
                        break;
                    case 16:
                        catchingFishDatabindingGson.CatchingFishPayPalLiveData = obtainStyledAttributes.getDimensionPixelSize(index2, catchingFishDatabindingGson.CatchingFishPayPalLiveData);
                        break;
                    case 17:
                        catchingFishDatabindingGson.CatchingFishReduxKtor = obtainStyledAttributes.getDimensionPixelOffset(index2, catchingFishDatabindingGson.CatchingFishReduxKtor);
                        break;
                    case 18:
                        catchingFishDatabindingGson.CatchingFishDaggerWebsocket = obtainStyledAttributes.getDimensionPixelOffset(index2, catchingFishDatabindingGson.CatchingFishDaggerWebsocket);
                        break;
                    case 19:
                        catchingFishDatabindingGson.CatchingFishWorkManager = obtainStyledAttributes.getFloat(index2, catchingFishDatabindingGson.CatchingFishWorkManager);
                        break;
                    case 20:
                        catchingFishDatabindingGson.CatchingFishSpannableWidget = obtainStyledAttributes.getFloat(index2, catchingFishDatabindingGson.CatchingFishSpannableWidget);
                        break;
                    case 21:
                        catchingFishDatabindingGson.CatchingFishCoroutine = obtainStyledAttributes.getLayoutDimension(index2, catchingFishDatabindingGson.CatchingFishCoroutine);
                        break;
                    case 22:
                        int i6 = obtainStyledAttributes.getInt(index2, catchingFishBundleService.CatchingFishParcelableFAB);
                        catchingFishBundleService.CatchingFishParcelableFAB = i6;
                        catchingFishBundleService.CatchingFishParcelableFAB = iArr[i6];
                        break;
                    case 23:
                        catchingFishDatabindingGson.CatchingFishSnackbar = obtainStyledAttributes.getLayoutDimension(index2, catchingFishDatabindingGson.CatchingFishSnackbar);
                        break;
                    case 24:
                        catchingFishDatabindingGson.CatchingFishMutableLiveData = obtainStyledAttributes.getDimensionPixelSize(index2, catchingFishDatabindingGson.CatchingFishMutableLiveData);
                        break;
                    case 25:
                        catchingFishDatabindingGson.CatchingFishViewModelFAB = CatchingFishWorkManager(obtainStyledAttributes, index2, catchingFishDatabindingGson.CatchingFishViewModelFAB);
                        break;
                    case 26:
                        catchingFishDatabindingGson.CatchingFishLayout = CatchingFishWorkManager(obtainStyledAttributes, index2, catchingFishDatabindingGson.CatchingFishLayout);
                        break;
                    case 27:
                        catchingFishDatabindingGson.CatchingFishFragmentFactory = obtainStyledAttributes.getInt(index2, catchingFishDatabindingGson.CatchingFishFragmentFactory);
                        break;
                    case 28:
                        catchingFishDatabindingGson.CatchingFishJobScheduler = obtainStyledAttributes.getDimensionPixelSize(index2, catchingFishDatabindingGson.CatchingFishJobScheduler);
                        break;
                    case 29:
                        catchingFishDatabindingGson.CatchingFishFragmentHandler = CatchingFishWorkManager(obtainStyledAttributes, index2, catchingFishDatabindingGson.CatchingFishFragmentHandler);
                        break;
                    case 30:
                        catchingFishDatabindingGson.CatchingFishCloudMessaging = CatchingFishWorkManager(obtainStyledAttributes, index2, catchingFishDatabindingGson.CatchingFishCloudMessaging);
                        break;
                    case 31:
                        catchingFishDatabindingGson.CatchingFishDagger = obtainStyledAttributes.getDimensionPixelSize(index2, catchingFishDatabindingGson.CatchingFishDagger);
                        break;
                    case 32:
                        catchingFishDatabindingGson.CatchingFish = CatchingFishWorkManager(obtainStyledAttributes, index2, catchingFishDatabindingGson.CatchingFish);
                        break;
                    case 33:
                        catchingFishDatabindingGson.CatchingFishJetpackCompose = CatchingFishWorkManager(obtainStyledAttributes, index2, catchingFishDatabindingGson.CatchingFishJetpackCompose);
                        break;
                    case 34:
                        catchingFishDatabindingGson.CatchingFishPayPalService = obtainStyledAttributes.getDimensionPixelSize(index2, catchingFishDatabindingGson.CatchingFishPayPalService);
                        break;
                    case 35:
                        catchingFishDatabindingGson.CatchingFishOkHttp = CatchingFishWorkManager(obtainStyledAttributes, index2, catchingFishDatabindingGson.CatchingFishOkHttp);
                        break;
                    case 36:
                        catchingFishDatabindingGson.CatchingFishEspressoTesting = CatchingFishWorkManager(obtainStyledAttributes, index2, catchingFishDatabindingGson.CatchingFishEspressoTesting);
                        break;
                    case 37:
                        catchingFishDatabindingGson.CatchingFishParcelableFlux = obtainStyledAttributes.getFloat(index2, catchingFishDatabindingGson.CatchingFishParcelableFlux);
                        break;
                    case 38:
                        catchingFishMoshiPicasso.CatchingFishParcelableFAB = obtainStyledAttributes.getResourceId(index2, catchingFishMoshiPicasso.CatchingFishParcelableFAB);
                        break;
                    case 39:
                        catchingFishDatabindingGson.CatchingFishDataStoreIntent = obtainStyledAttributes.getFloat(index2, catchingFishDatabindingGson.CatchingFishDataStoreIntent);
                        break;
                    case 40:
                        catchingFishDatabindingGson.CatchingFishAppCompat = obtainStyledAttributes.getFloat(index2, catchingFishDatabindingGson.CatchingFishAppCompat);
                        break;
                    case 41:
                        catchingFishDatabindingGson.CatchingFishStateFlow = obtainStyledAttributes.getInt(index2, catchingFishDatabindingGson.CatchingFishStateFlow);
                        break;
                    case 42:
                        catchingFishDatabindingGson.CatchingFishJUnitRealm = obtainStyledAttributes.getInt(index2, catchingFishDatabindingGson.CatchingFishJUnitRealm);
                        break;
                    case 43:
                        catchingFishBundleService.CatchingFishCoroutine = obtainStyledAttributes.getFloat(index2, catchingFishBundleService.CatchingFishCoroutine);
                        break;
                    case 44:
                        catchingFishGradleDataStore.CatchingFishEspressoTesting = true;
                        catchingFishGradleDataStore.CatchingFishOkHttp = obtainStyledAttributes.getDimension(index2, catchingFishGradleDataStore.CatchingFishOkHttp);
                        break;
                    case 45:
                        catchingFishGradleDataStore.CatchingFishSnackbar = obtainStyledAttributes.getFloat(index2, catchingFishGradleDataStore.CatchingFishSnackbar);
                        break;
                    case 46:
                        catchingFishGradleDataStore.CatchingFishCoroutine = obtainStyledAttributes.getFloat(index2, catchingFishGradleDataStore.CatchingFishCoroutine);
                        break;
                    case 47:
                        catchingFishGradleDataStore.CatchingFishReduxKtor = obtainStyledAttributes.getFloat(index2, catchingFishGradleDataStore.CatchingFishReduxKtor);
                        break;
                    case 48:
                        catchingFishGradleDataStore.CatchingFishDaggerWebsocket = obtainStyledAttributes.getFloat(index2, catchingFishGradleDataStore.CatchingFishDaggerWebsocket);
                        break;
                    case 49:
                        catchingFishGradleDataStore.CatchingFishWorkManager = obtainStyledAttributes.getDimension(index2, catchingFishGradleDataStore.CatchingFishWorkManager);
                        break;
                    case 50:
                        catchingFishGradleDataStore.CatchingFishViewModelScope = obtainStyledAttributes.getDimension(index2, catchingFishGradleDataStore.CatchingFishViewModelScope);
                        break;
                    case 51:
                        catchingFishGradleDataStore.CatchingFishLayout = obtainStyledAttributes.getDimension(index2, catchingFishGradleDataStore.CatchingFishLayout);
                        break;
                    case 52:
                        catchingFishGradleDataStore.CatchingFishFragmentHandler = obtainStyledAttributes.getDimension(index2, catchingFishGradleDataStore.CatchingFishFragmentHandler);
                        break;
                    case 53:
                        catchingFishGradleDataStore.CatchingFishCloudMessaging = obtainStyledAttributes.getDimension(index2, catchingFishGradleDataStore.CatchingFishCloudMessaging);
                        break;
                    case 54:
                        catchingFishDatabindingGson.CatchingFishAnimation = obtainStyledAttributes.getInt(index2, catchingFishDatabindingGson.CatchingFishAnimation);
                        break;
                    case 55:
                        catchingFishDatabindingGson.CatchingFishMVVMAppCompat = obtainStyledAttributes.getInt(index2, catchingFishDatabindingGson.CatchingFishMVVMAppCompat);
                        break;
                    case 56:
                        catchingFishDatabindingGson.CatchingFishStripeAPI = obtainStyledAttributes.getDimensionPixelSize(index2, catchingFishDatabindingGson.CatchingFishStripeAPI);
                        break;
                    case 57:
                        catchingFishDatabindingGson.CatchingFishMoshiDaggerHilt = obtainStyledAttributes.getDimensionPixelSize(index2, catchingFishDatabindingGson.CatchingFishMoshiDaggerHilt);
                        break;
                    case 58:
                        catchingFishDatabindingGson.CatchingFishAndroidX = obtainStyledAttributes.getDimensionPixelSize(index2, catchingFishDatabindingGson.CatchingFishAndroidX);
                        break;
                    case 59:
                        catchingFishDatabindingGson.CatchingFishNavigationGson = obtainStyledAttributes.getDimensionPixelSize(index2, catchingFishDatabindingGson.CatchingFishNavigationGson);
                        break;
                    case 60:
                        catchingFishGradleDataStore.CatchingFishParcelableFAB = obtainStyledAttributes.getFloat(index2, catchingFishGradleDataStore.CatchingFishParcelableFAB);
                        break;
                    case 61:
                        catchingFishDatabindingGson.CatchingFishCardViewRealm = CatchingFishWorkManager(obtainStyledAttributes, index2, catchingFishDatabindingGson.CatchingFishCardViewRealm);
                        break;
                    case 62:
                        catchingFishDatabindingGson.CatchingFishPayPal = obtainStyledAttributes.getDimensionPixelSize(index2, catchingFishDatabindingGson.CatchingFishPayPal);
                        break;
                    case 63:
                        catchingFishDatabindingGson.CatchingFishCardViewView = obtainStyledAttributes.getFloat(index2, catchingFishDatabindingGson.CatchingFishCardViewView);
                        break;
                    case 64:
                        catchingFishAsyncTaskRoom.CatchingFishParcelableFAB = CatchingFishWorkManager(obtainStyledAttributes, index2, catchingFishAsyncTaskRoom.CatchingFishParcelableFAB);
                        break;
                    case 65:
                        if (obtainStyledAttributes.peekValue(index2).type == 3) {
                            obtainStyledAttributes.getString(index2);
                            catchingFishAsyncTaskRoom.getClass();
                            break;
                        } else {
                            String str = strArr[obtainStyledAttributes.getInteger(index2, 0)];
                            catchingFishAsyncTaskRoom.getClass();
                            break;
                        }
                    case 66:
                        obtainStyledAttributes.getInt(index2, 0);
                        catchingFishAsyncTaskRoom.getClass();
                        break;
                    case 67:
                        catchingFishAsyncTaskRoom.CatchingFishDaggerWebsocket = obtainStyledAttributes.getFloat(index2, catchingFishAsyncTaskRoom.CatchingFishDaggerWebsocket);
                        break;
                    case 68:
                        catchingFishBundleService.CatchingFishReduxKtor = obtainStyledAttributes.getFloat(index2, catchingFishBundleService.CatchingFishReduxKtor);
                        break;
                    case 69:
                        catchingFishDatabindingGson.CatchingFishRedux = obtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        catchingFishDatabindingGson.CatchingFishCustomViewJUnit = obtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        break;
                    case 72:
                        catchingFishDatabindingGson.CatchingFishDaggerMVVM = obtainStyledAttributes.getInt(index2, catchingFishDatabindingGson.CatchingFishDaggerMVVM);
                        break;
                    case 73:
                        catchingFishDatabindingGson.CatchingFishMockkOkHttp = obtainStyledAttributes.getDimensionPixelSize(index2, catchingFishDatabindingGson.CatchingFishMockkOkHttp);
                        break;
                    case 74:
                        catchingFishDatabindingGson.CatchingFishFirebase = obtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        catchingFishDatabindingGson.CatchingFishView = obtainStyledAttributes.getBoolean(index2, catchingFishDatabindingGson.CatchingFishView);
                        break;
                    case 76:
                        catchingFishAsyncTaskRoom.CatchingFishCoroutine = obtainStyledAttributes.getInt(index2, catchingFishAsyncTaskRoom.CatchingFishCoroutine);
                        break;
                    case 77:
                        catchingFishDatabindingGson.CatchingFishRetrofitMVI = obtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        catchingFishBundleService.CatchingFishSnackbar = obtainStyledAttributes.getInt(index2, catchingFishBundleService.CatchingFishSnackbar);
                        break;
                    case 79:
                        catchingFishAsyncTaskRoom.CatchingFishReduxKtor = obtainStyledAttributes.getFloat(index2, catchingFishAsyncTaskRoom.CatchingFishReduxKtor);
                        break;
                    case 80:
                        catchingFishDatabindingGson.CatchingFishGradleLiveData = obtainStyledAttributes.getBoolean(index2, catchingFishDatabindingGson.CatchingFishGradleLiveData);
                        break;
                    case 81:
                        catchingFishDatabindingGson.CatchingFishRetrofit = obtainStyledAttributes.getBoolean(index2, catchingFishDatabindingGson.CatchingFishRetrofit);
                        break;
                    case 82:
                        catchingFishAsyncTaskRoom.CatchingFishSnackbar = obtainStyledAttributes.getInteger(index2, catchingFishAsyncTaskRoom.CatchingFishSnackbar);
                        break;
                    case 83:
                        catchingFishGradleDataStore.CatchingFishViewModelFAB = CatchingFishWorkManager(obtainStyledAttributes, index2, catchingFishGradleDataStore.CatchingFishViewModelFAB);
                        break;
                    case 84:
                        catchingFishAsyncTaskRoom.CatchingFishViewModelScope = obtainStyledAttributes.getInteger(index2, catchingFishAsyncTaskRoom.CatchingFishViewModelScope);
                        break;
                    case 85:
                        catchingFishAsyncTaskRoom.CatchingFishWorkManager = obtainStyledAttributes.getFloat(index2, catchingFishAsyncTaskRoom.CatchingFishWorkManager);
                        break;
                    case 86:
                        int i7 = obtainStyledAttributes.peekValue(index2).type;
                        if (i7 == 1) {
                            catchingFishAsyncTaskRoom.CatchingFishLayout = obtainStyledAttributes.getResourceId(index2, -1);
                        } else if (i7 == 3) {
                            String string2 = obtainStyledAttributes.getString(index2);
                            catchingFishAsyncTaskRoom.CatchingFishViewModelFAB = string2;
                            if (string2.indexOf("/") > 0) {
                                catchingFishAsyncTaskRoom.CatchingFishLayout = obtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            obtainStyledAttributes.getInteger(index2, catchingFishAsyncTaskRoom.CatchingFishLayout);
                        }
                        break;
                    case 87:
                        Integer.toHexString(index2);
                        sparseIntArray.get(index2);
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        Integer.toHexString(index2);
                        sparseIntArray.get(index2);
                        break;
                    case 91:
                        catchingFishDatabindingGson.CatchingFishRoomDatabase = CatchingFishWorkManager(obtainStyledAttributes, index2, catchingFishDatabindingGson.CatchingFishRoomDatabase);
                        break;
                    case 92:
                        catchingFishDatabindingGson.CatchingFishNavigation = CatchingFishWorkManager(obtainStyledAttributes, index2, catchingFishDatabindingGson.CatchingFishNavigation);
                        break;
                    case 93:
                        catchingFishDatabindingGson.CatchingFishCameraXIntent = obtainStyledAttributes.getDimensionPixelSize(index2, catchingFishDatabindingGson.CatchingFishCameraXIntent);
                        break;
                    case 94:
                        catchingFishDatabindingGson.CatchingFishRecyclerView = obtainStyledAttributes.getDimensionPixelSize(index2, catchingFishDatabindingGson.CatchingFishRecyclerView);
                        break;
                    case 95:
                        CatchingFishViewModelScope(catchingFishDatabindingGson, obtainStyledAttributes, index2, 0);
                        break;
                    case 96:
                        CatchingFishViewModelScope(catchingFishDatabindingGson, obtainStyledAttributes, index2, 1);
                        break;
                    case 97:
                        catchingFishDatabindingGson.CatchingFishServiceMVIJUnit = obtainStyledAttributes.getInt(index2, catchingFishDatabindingGson.CatchingFishServiceMVIJUnit);
                        break;
                }
            }
            if (catchingFishDatabindingGson.CatchingFishFirebase != null) {
                catchingFishDatabindingGson.CatchingFishPicasso = null;
            }
        }
        obtainStyledAttributes.recycle();
        return catchingFishMoshiPicasso;
    }

    public static void CatchingFishViewModelFAB(CatchingFishGraphQLBundle catchingFishGraphQLBundle, String str) {
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i = -1;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                i = substring.equalsIgnoreCase("W") ? 0 : substring.equalsIgnoreCase("H") ? 1 : -1;
                r2 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 < 0 || indexOf2 >= length - 1) {
                    String substring2 = str.substring(r2);
                    if (substring2.length() > 0) {
                        Float.parseFloat(substring2);
                    }
                } else {
                    String substring3 = str.substring(r2, indexOf2);
                    String substring4 = str.substring(indexOf2 + 1);
                    if (substring3.length() > 0 && substring4.length() > 0) {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            if (i == 1) {
                                Math.abs(parseFloat2 / parseFloat);
                            } else {
                                Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        catchingFishGraphQLBundle.CatchingFishJobScheduler = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void CatchingFishViewModelScope(Object obj, TypedArray typedArray, int i, int i2) {
        int dimensionPixelSize;
        if (obj == null) {
            return;
        }
        int i3 = typedArray.peekValue(i).type;
        boolean z = true;
        int i4 = 0;
        if (i3 == 3) {
            String string = typedArray.getString(i);
            if (string == null) {
                return;
            }
            int indexOf = string.indexOf(61);
            int length = string.length();
            if (indexOf <= 0 || indexOf >= length - 1) {
                return;
            }
            String substring = string.substring(0, indexOf);
            String substring2 = string.substring(indexOf + 1);
            if (substring2.length() > 0) {
                String trim = substring.trim();
                String trim2 = substring2.trim();
                if ("ratio".equalsIgnoreCase(trim)) {
                    if (obj instanceof CatchingFishGraphQLBundle) {
                        CatchingFishGraphQLBundle catchingFishGraphQLBundle = (CatchingFishGraphQLBundle) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) catchingFishGraphQLBundle).width = 0;
                        } else {
                            ((ViewGroup.MarginLayoutParams) catchingFishGraphQLBundle).height = 0;
                        }
                        CatchingFishViewModelFAB(catchingFishGraphQLBundle, trim2);
                        return;
                    }
                    if (obj instanceof CatchingFishDatabindingGson) {
                        ((CatchingFishDatabindingGson) obj).CatchingFishGsonAppCompat = trim2;
                        return;
                    } else {
                        if (obj instanceof CatchingFishCameraXToast) {
                            ((CatchingFishCameraXToast) obj).CatchingFishReduxKtor(trim2, 5);
                            return;
                        }
                        return;
                    }
                }
                try {
                    if ("weight".equalsIgnoreCase(trim)) {
                        float parseFloat = Float.parseFloat(trim2);
                        if (obj instanceof CatchingFishGraphQLBundle) {
                            CatchingFishGraphQLBundle catchingFishGraphQLBundle2 = (CatchingFishGraphQLBundle) obj;
                            if (i2 == 0) {
                                ((ViewGroup.MarginLayoutParams) catchingFishGraphQLBundle2).width = 0;
                                catchingFishGraphQLBundle2.CatchingFishPayPalService = parseFloat;
                                return;
                            } else {
                                ((ViewGroup.MarginLayoutParams) catchingFishGraphQLBundle2).height = 0;
                                catchingFishGraphQLBundle2.CatchingFishSensorManager = parseFloat;
                                return;
                            }
                        }
                        if (obj instanceof CatchingFishDatabindingGson) {
                            CatchingFishDatabindingGson catchingFishDatabindingGson = (CatchingFishDatabindingGson) obj;
                            if (i2 == 0) {
                                catchingFishDatabindingGson.CatchingFishSnackbar = 0;
                                catchingFishDatabindingGson.CatchingFishDataStoreIntent = parseFloat;
                                return;
                            } else {
                                catchingFishDatabindingGson.CatchingFishCoroutine = 0;
                                catchingFishDatabindingGson.CatchingFishAppCompat = parseFloat;
                                return;
                            }
                        }
                        if (obj instanceof CatchingFishCameraXToast) {
                            CatchingFishCameraXToast catchingFishCameraXToast = (CatchingFishCameraXToast) obj;
                            if (i2 == 0) {
                                catchingFishCameraXToast.CatchingFishSnackbar(23, 0);
                                catchingFishCameraXToast.CatchingFishParcelableFAB(39, parseFloat);
                                return;
                            } else {
                                catchingFishCameraXToast.CatchingFishSnackbar(21, 0);
                                catchingFishCameraXToast.CatchingFishParcelableFAB(40, parseFloat);
                                return;
                            }
                        }
                        return;
                    }
                    if ("parent".equalsIgnoreCase(trim)) {
                        float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                        if (obj instanceof CatchingFishGraphQLBundle) {
                            CatchingFishGraphQLBundle catchingFishGraphQLBundle3 = (CatchingFishGraphQLBundle) obj;
                            if (i2 == 0) {
                                ((ViewGroup.MarginLayoutParams) catchingFishGraphQLBundle3).width = 0;
                                catchingFishGraphQLBundle3.CatchingFishParcelable = max;
                                catchingFishGraphQLBundle3.CatchingFishCameraXIntent = 2;
                                return;
                            } else {
                                ((ViewGroup.MarginLayoutParams) catchingFishGraphQLBundle3).height = 0;
                                catchingFishGraphQLBundle3.CatchingFishRecyclerView = max;
                                catchingFishGraphQLBundle3.CatchingFishHandler = 2;
                                return;
                            }
                        }
                        if (obj instanceof CatchingFishDatabindingGson) {
                            CatchingFishDatabindingGson catchingFishDatabindingGson2 = (CatchingFishDatabindingGson) obj;
                            if (i2 == 0) {
                                catchingFishDatabindingGson2.CatchingFishSnackbar = 0;
                                catchingFishDatabindingGson2.CatchingFishRedux = max;
                                catchingFishDatabindingGson2.CatchingFishAnimation = 2;
                                return;
                            } else {
                                catchingFishDatabindingGson2.CatchingFishCoroutine = 0;
                                catchingFishDatabindingGson2.CatchingFishCustomViewJUnit = max;
                                catchingFishDatabindingGson2.CatchingFishMVVMAppCompat = 2;
                                return;
                            }
                        }
                        if (obj instanceof CatchingFishCameraXToast) {
                            CatchingFishCameraXToast catchingFishCameraXToast2 = (CatchingFishCameraXToast) obj;
                            if (i2 == 0) {
                                catchingFishCameraXToast2.CatchingFishSnackbar(23, 0);
                                catchingFishCameraXToast2.CatchingFishSnackbar(54, 2);
                                return;
                            } else {
                                catchingFishCameraXToast2.CatchingFishSnackbar(21, 0);
                                catchingFishCameraXToast2.CatchingFishSnackbar(55, 2);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                } catch (NumberFormatException unused) {
                    return;
                }
            }
            return;
        }
        if (i3 != 5) {
            dimensionPixelSize = typedArray.getInt(i, 0);
            if (dimensionPixelSize == -4) {
                i4 = -2;
            } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                z = false;
            }
            if (!(obj instanceof CatchingFishGraphQLBundle)) {
                CatchingFishGraphQLBundle catchingFishGraphQLBundle4 = (CatchingFishGraphQLBundle) obj;
                if (i2 == 0) {
                    ((ViewGroup.MarginLayoutParams) catchingFishGraphQLBundle4).width = i4;
                    catchingFishGraphQLBundle4.CatchingFishJUnitRealm = z;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) catchingFishGraphQLBundle4).height = i4;
                    catchingFishGraphQLBundle4.CatchingFishAnimation = z;
                    return;
                }
            }
            if (obj instanceof CatchingFishDatabindingGson) {
                CatchingFishDatabindingGson catchingFishDatabindingGson3 = (CatchingFishDatabindingGson) obj;
                if (i2 == 0) {
                    catchingFishDatabindingGson3.CatchingFishSnackbar = i4;
                    catchingFishDatabindingGson3.CatchingFishGradleLiveData = z;
                    return;
                } else {
                    catchingFishDatabindingGson3.CatchingFishCoroutine = i4;
                    catchingFishDatabindingGson3.CatchingFishRetrofit = z;
                    return;
                }
            }
            if (obj instanceof CatchingFishCameraXToast) {
                CatchingFishCameraXToast catchingFishCameraXToast3 = (CatchingFishCameraXToast) obj;
                if (i2 == 0) {
                    catchingFishCameraXToast3.CatchingFishSnackbar(23, i4);
                    catchingFishCameraXToast3.CatchingFishCoroutine(80, z);
                    return;
                } else {
                    catchingFishCameraXToast3.CatchingFishSnackbar(21, i4);
                    catchingFishCameraXToast3.CatchingFishCoroutine(81, z);
                    return;
                }
            }
            return;
        }
        dimensionPixelSize = typedArray.getDimensionPixelSize(i, 0);
        z = false;
        i4 = dimensionPixelSize;
        if (!(obj instanceof CatchingFishGraphQLBundle)) {
        }
    }

    public static int CatchingFishWorkManager(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    public final void CatchingFishDaggerWebsocket(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    CatchingFishMoshiPicasso CatchingFishReduxKtor2 = CatchingFishReduxKtor(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        CatchingFishReduxKtor2.CatchingFishReduxKtor.CatchingFishParcelableFAB = true;
                    }
                    this.CatchingFishCoroutine.put(Integer.valueOf(CatchingFishReduxKtor2.CatchingFishParcelableFAB), CatchingFishReduxKtor2);
                }
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }

    public final void CatchingFishParcelableFAB(ConstraintLayout constraintLayout) {
        CatchingFishAnimationBundle catchingFishAnimationBundle = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap = catchingFishAnimationBundle.CatchingFishCoroutine;
        HashSet hashSet = new HashSet(hashMap.keySet());
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                try {
                    childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                }
            } else {
                if (catchingFishAnimationBundle.CatchingFishSnackbar && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1 && hashMap.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    CatchingFishMoshiPicasso catchingFishMoshiPicasso = (CatchingFishMoshiPicasso) hashMap.get(Integer.valueOf(id));
                    if (catchingFishMoshiPicasso != null) {
                        CatchingFishBundleService catchingFishBundleService = catchingFishMoshiPicasso.CatchingFishSnackbar;
                        CatchingFishDatabindingGson catchingFishDatabindingGson = catchingFishMoshiPicasso.CatchingFishReduxKtor;
                        CatchingFishGradleDataStore catchingFishGradleDataStore = catchingFishMoshiPicasso.CatchingFishDaggerWebsocket;
                        if (childAt instanceof CatchingFishHiltXMLLayout) {
                            catchingFishDatabindingGson.CatchingFishReduxMoshi = 1;
                            CatchingFishHiltXMLLayout catchingFishHiltXMLLayout = (CatchingFishHiltXMLLayout) childAt;
                            catchingFishHiltXMLLayout.setId(id);
                            catchingFishHiltXMLLayout.setType(catchingFishDatabindingGson.CatchingFishDaggerMVVM);
                            catchingFishHiltXMLLayout.setMargin(catchingFishDatabindingGson.CatchingFishMockkOkHttp);
                            catchingFishHiltXMLLayout.setAllowsGoneWidget(catchingFishDatabindingGson.CatchingFishView);
                            int[] iArr = catchingFishDatabindingGson.CatchingFishPicasso;
                            if (iArr != null) {
                                catchingFishHiltXMLLayout.setReferencedIds(iArr);
                            } else {
                                String str = catchingFishDatabindingGson.CatchingFishFirebase;
                                if (str != null) {
                                    int[] CatchingFishCoroutine = CatchingFishCoroutine(catchingFishHiltXMLLayout, str);
                                    catchingFishDatabindingGson.CatchingFishPicasso = CatchingFishCoroutine;
                                    catchingFishHiltXMLLayout.setReferencedIds(CatchingFishCoroutine);
                                }
                            }
                        }
                        CatchingFishGraphQLBundle catchingFishGraphQLBundle = (CatchingFishGraphQLBundle) childAt.getLayoutParams();
                        catchingFishGraphQLBundle.CatchingFishParcelableFAB();
                        catchingFishMoshiPicasso.CatchingFishParcelableFAB(catchingFishGraphQLBundle);
                        HashMap hashMap2 = catchingFishMoshiPicasso.CatchingFishWorkManager;
                        Class<?> cls = childAt.getClass();
                        for (String str2 : hashMap2.keySet()) {
                            CatchingFishViewModelBundle catchingFishViewModelBundle = (CatchingFishViewModelBundle) hashMap2.get(str2);
                            if (!catchingFishViewModelBundle.CatchingFishParcelableFAB) {
                                str2 = "set" + str2;
                            }
                            try {
                                int CatchingFishParcelableFlux = CatchingFishMVPLiveData.CatchingFishParcelableFlux(catchingFishViewModelBundle.CatchingFishSnackbar);
                                Class cls2 = Float.TYPE;
                                Class cls3 = Integer.TYPE;
                                switch (CatchingFishParcelableFlux) {
                                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                        cls.getMethod(str2, cls3).invoke(childAt, Integer.valueOf(catchingFishViewModelBundle.CatchingFishCoroutine));
                                        break;
                                    case 1:
                                        cls.getMethod(str2, cls2).invoke(childAt, Float.valueOf(catchingFishViewModelBundle.CatchingFishReduxKtor));
                                        break;
                                    case 2:
                                        cls.getMethod(str2, cls3).invoke(childAt, Integer.valueOf(catchingFishViewModelBundle.CatchingFishViewModelScope));
                                        break;
                                    case 3:
                                        Method method = cls.getMethod(str2, Drawable.class);
                                        ColorDrawable colorDrawable = new ColorDrawable();
                                        colorDrawable.setColor(catchingFishViewModelBundle.CatchingFishViewModelScope);
                                        method.invoke(childAt, colorDrawable);
                                        break;
                                    case 4:
                                        cls.getMethod(str2, CharSequence.class).invoke(childAt, catchingFishViewModelBundle.CatchingFishDaggerWebsocket);
                                        break;
                                    case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                                        cls.getMethod(str2, Boolean.TYPE).invoke(childAt, Boolean.valueOf(catchingFishViewModelBundle.CatchingFishWorkManager));
                                        break;
                                    case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                                        cls.getMethod(str2, cls2).invoke(childAt, Float.valueOf(catchingFishViewModelBundle.CatchingFishReduxKtor));
                                        break;
                                    case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
                                        cls.getMethod(str2, cls3).invoke(childAt, Integer.valueOf(catchingFishViewModelBundle.CatchingFishCoroutine));
                                        break;
                                }
                            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                            }
                        }
                        childAt.setLayoutParams(catchingFishGraphQLBundle);
                        if (catchingFishBundleService.CatchingFishSnackbar == 0) {
                            childAt.setVisibility(catchingFishBundleService.CatchingFishParcelableFAB);
                        }
                        childAt.setAlpha(catchingFishBundleService.CatchingFishCoroutine);
                        childAt.setRotation(catchingFishGradleDataStore.CatchingFishParcelableFAB);
                        childAt.setRotationX(catchingFishGradleDataStore.CatchingFishSnackbar);
                        childAt.setRotationY(catchingFishGradleDataStore.CatchingFishCoroutine);
                        childAt.setScaleX(catchingFishGradleDataStore.CatchingFishReduxKtor);
                        childAt.setScaleY(catchingFishGradleDataStore.CatchingFishDaggerWebsocket);
                        if (catchingFishGradleDataStore.CatchingFishViewModelFAB != -1) {
                            if (((View) childAt.getParent()).findViewById(catchingFishGradleDataStore.CatchingFishViewModelFAB) != null) {
                                float bottom = (r0.getBottom() + r0.getTop()) / 2.0f;
                                float right = (r0.getRight() + r0.getLeft()) / 2.0f;
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    childAt.setPivotX(right - childAt.getLeft());
                                    childAt.setPivotY(bottom - childAt.getTop());
                                }
                            }
                        } else {
                            if (!Float.isNaN(catchingFishGradleDataStore.CatchingFishWorkManager)) {
                                childAt.setPivotX(catchingFishGradleDataStore.CatchingFishWorkManager);
                            }
                            if (!Float.isNaN(catchingFishGradleDataStore.CatchingFishViewModelScope)) {
                                childAt.setPivotY(catchingFishGradleDataStore.CatchingFishViewModelScope);
                            }
                        }
                        childAt.setTranslationX(catchingFishGradleDataStore.CatchingFishLayout);
                        childAt.setTranslationY(catchingFishGradleDataStore.CatchingFishFragmentHandler);
                        childAt.setTranslationZ(catchingFishGradleDataStore.CatchingFishCloudMessaging);
                        if (catchingFishGradleDataStore.CatchingFishEspressoTesting) {
                            childAt.setElevation(catchingFishGradleDataStore.CatchingFishOkHttp);
                        }
                    }
                }
            }
            i++;
            catchingFishAnimationBundle = this;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            CatchingFishMoshiPicasso catchingFishMoshiPicasso2 = (CatchingFishMoshiPicasso) hashMap.get(num);
            if (catchingFishMoshiPicasso2 != null) {
                CatchingFishDatabindingGson catchingFishDatabindingGson2 = catchingFishMoshiPicasso2.CatchingFishReduxKtor;
                if (catchingFishDatabindingGson2.CatchingFishReduxMoshi == 1) {
                    Context context = constraintLayout.getContext();
                    CatchingFishHiltXMLLayout catchingFishHiltXMLLayout2 = new CatchingFishHiltXMLLayout(context);
                    catchingFishHiltXMLLayout2.CatchingFishReduxKtor = new int[32];
                    catchingFishHiltXMLLayout2.CatchingFishFragmentHandler = new HashMap();
                    catchingFishHiltXMLLayout2.CatchingFishWorkManager = context;
                    CatchingFishAnimationMVVM catchingFishAnimationMVVM = new CatchingFishAnimationMVVM();
                    catchingFishAnimationMVVM.CatchingFishStateFlowIntent = 0;
                    catchingFishAnimationMVVM.CatchingFishWidget = true;
                    catchingFishAnimationMVVM.CatchingFishKtorService = 0;
                    catchingFishAnimationMVVM.CatchingFishWebSocketMockk = false;
                    catchingFishHiltXMLLayout2.CatchingFishOkHttp = catchingFishAnimationMVVM;
                    catchingFishHiltXMLLayout2.CatchingFishViewModelScope = catchingFishAnimationMVVM;
                    catchingFishHiltXMLLayout2.CatchingFishLayout();
                    catchingFishHiltXMLLayout2.setVisibility(8);
                    catchingFishHiltXMLLayout2.setId(num.intValue());
                    int[] iArr2 = catchingFishDatabindingGson2.CatchingFishPicasso;
                    if (iArr2 != null) {
                        catchingFishHiltXMLLayout2.setReferencedIds(iArr2);
                    } else {
                        String str3 = catchingFishDatabindingGson2.CatchingFishFirebase;
                        if (str3 != null) {
                            int[] CatchingFishCoroutine2 = CatchingFishCoroutine(catchingFishHiltXMLLayout2, str3);
                            catchingFishDatabindingGson2.CatchingFishPicasso = CatchingFishCoroutine2;
                            catchingFishHiltXMLLayout2.setReferencedIds(CatchingFishCoroutine2);
                        }
                    }
                    catchingFishHiltXMLLayout2.setType(catchingFishDatabindingGson2.CatchingFishDaggerMVVM);
                    catchingFishHiltXMLLayout2.setMargin(catchingFishDatabindingGson2.CatchingFishMockkOkHttp);
                    CatchingFishGraphQLBundle CatchingFishReduxKtor2 = ConstraintLayout.CatchingFishReduxKtor();
                    catchingFishHiltXMLLayout2.CatchingFishLayout();
                    catchingFishMoshiPicasso2.CatchingFishParcelableFAB(CatchingFishReduxKtor2);
                    constraintLayout.addView(catchingFishHiltXMLLayout2, CatchingFishReduxKtor2);
                }
                if (catchingFishDatabindingGson2.CatchingFishParcelableFAB) {
                    View catchingFishGradleKtor = new CatchingFishGradleKtor(constraintLayout.getContext());
                    catchingFishGradleKtor.setId(num.intValue());
                    CatchingFishGraphQLBundle CatchingFishReduxKtor3 = ConstraintLayout.CatchingFishReduxKtor();
                    catchingFishMoshiPicasso2.CatchingFishParcelableFAB(CatchingFishReduxKtor3);
                    constraintLayout.addView(catchingFishGradleKtor, CatchingFishReduxKtor3);
                }
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt2 = constraintLayout.getChildAt(i2);
            if (childAt2 instanceof CatchingFishKtorContext) {
                ((CatchingFishKtorContext) childAt2).CatchingFishDaggerWebsocket(constraintLayout);
            }
        }
    }

    public final void CatchingFishSnackbar(ConstraintLayout constraintLayout) {
        int i;
        HashMap hashMap;
        int i2;
        int i3;
        CatchingFishAnimationBundle catchingFishAnimationBundle = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap2 = catchingFishAnimationBundle.CatchingFishCoroutine;
        hashMap2.clear();
        int i4 = 0;
        while (i4 < childCount) {
            View childAt = constraintLayout.getChildAt(i4);
            CatchingFishGraphQLBundle catchingFishGraphQLBundle = (CatchingFishGraphQLBundle) childAt.getLayoutParams();
            int id = childAt.getId();
            if (catchingFishAnimationBundle.CatchingFishSnackbar && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap2.containsKey(Integer.valueOf(id))) {
                hashMap2.put(Integer.valueOf(id), new CatchingFishMoshiPicasso());
            }
            CatchingFishMoshiPicasso catchingFishMoshiPicasso = (CatchingFishMoshiPicasso) hashMap2.get(Integer.valueOf(id));
            if (catchingFishMoshiPicasso == null) {
                i = childCount;
                hashMap = hashMap2;
                i2 = i4;
            } else {
                CatchingFishBundleService catchingFishBundleService = catchingFishMoshiPicasso.CatchingFishSnackbar;
                CatchingFishDatabindingGson catchingFishDatabindingGson = catchingFishMoshiPicasso.CatchingFishReduxKtor;
                CatchingFishGradleDataStore catchingFishGradleDataStore = catchingFishMoshiPicasso.CatchingFishDaggerWebsocket;
                HashMap hashMap3 = new HashMap();
                Class<?> cls = childAt.getClass();
                HashMap hashMap4 = catchingFishAnimationBundle.CatchingFishParcelableFAB;
                for (String str : hashMap4.keySet()) {
                    int i5 = childCount;
                    CatchingFishViewModelBundle catchingFishViewModelBundle = (CatchingFishViewModelBundle) hashMap4.get(str);
                    HashMap hashMap5 = hashMap2;
                    try {
                        if (str.equals("BackgroundColor")) {
                            i3 = i4;
                            try {
                                hashMap3.put(str, new CatchingFishViewModelBundle(catchingFishViewModelBundle, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                            }
                        } else {
                            i3 = i4;
                            hashMap3.put(str, new CatchingFishViewModelBundle(catchingFishViewModelBundle, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                        i3 = i4;
                    }
                    hashMap2 = hashMap5;
                    childCount = i5;
                    i4 = i3;
                }
                i = childCount;
                hashMap = hashMap2;
                i2 = i4;
                catchingFishMoshiPicasso.CatchingFishWorkManager = hashMap3;
                catchingFishMoshiPicasso.CatchingFishParcelableFAB = id;
                catchingFishDatabindingGson.CatchingFishViewModelFAB = catchingFishGraphQLBundle.CatchingFishDaggerWebsocket;
                catchingFishDatabindingGson.CatchingFishLayout = catchingFishGraphQLBundle.CatchingFishWorkManager;
                catchingFishDatabindingGson.CatchingFishFragmentHandler = catchingFishGraphQLBundle.CatchingFishViewModelScope;
                catchingFishDatabindingGson.CatchingFishCloudMessaging = catchingFishGraphQLBundle.CatchingFishViewModelFAB;
                catchingFishDatabindingGson.CatchingFishEspressoTesting = catchingFishGraphQLBundle.CatchingFishLayout;
                catchingFishDatabindingGson.CatchingFishOkHttp = catchingFishGraphQLBundle.CatchingFishFragmentHandler;
                catchingFishDatabindingGson.CatchingFishUnitTesting = catchingFishGraphQLBundle.CatchingFishCloudMessaging;
                catchingFishDatabindingGson.CatchingFishAnimationMockk = catchingFishGraphQLBundle.CatchingFishEspressoTesting;
                catchingFishDatabindingGson.CatchingFishStateLiveData = catchingFishGraphQLBundle.CatchingFishOkHttp;
                catchingFishDatabindingGson.CatchingFishRoomDatabase = catchingFishGraphQLBundle.CatchingFishUnitTesting;
                catchingFishDatabindingGson.CatchingFishNavigation = catchingFishGraphQLBundle.CatchingFishAnimationMockk;
                catchingFishDatabindingGson.CatchingFish = catchingFishGraphQLBundle.CatchingFish;
                catchingFishDatabindingGson.CatchingFishJetpackCompose = catchingFishGraphQLBundle.CatchingFishJetpackCompose;
                catchingFishDatabindingGson.CatchingFishCoroutineFlow = catchingFishGraphQLBundle.CatchingFishCoroutineFlow;
                catchingFishDatabindingGson.CatchingFishDaggerHiltFAB = catchingFishGraphQLBundle.CatchingFishDaggerHiltFAB;
                catchingFishDatabindingGson.CatchingFishSpannableWidget = catchingFishGraphQLBundle.CatchingFishFragmentFactory;
                catchingFishDatabindingGson.CatchingFishParcelableFlux = catchingFishGraphQLBundle.CatchingFishMutableLiveData;
                catchingFishDatabindingGson.CatchingFishGsonAppCompat = catchingFishGraphQLBundle.CatchingFishJobScheduler;
                catchingFishDatabindingGson.CatchingFishCardViewRealm = catchingFishGraphQLBundle.CatchingFishStateLiveData;
                catchingFishDatabindingGson.CatchingFishPayPal = catchingFishGraphQLBundle.CatchingFishRoomDatabase;
                catchingFishDatabindingGson.CatchingFishCardViewView = catchingFishGraphQLBundle.CatchingFishNavigation;
                catchingFishDatabindingGson.CatchingFishMVPRobolectric = catchingFishGraphQLBundle.CatchingFishAppCompat;
                catchingFishDatabindingGson.CatchingFishCustomView = catchingFishGraphQLBundle.CatchingFishDataStoreIntent;
                catchingFishDatabindingGson.CatchingFishFragmentFactory = catchingFishGraphQLBundle.CatchingFishStateFlow;
                catchingFishDatabindingGson.CatchingFishWorkManager = catchingFishGraphQLBundle.CatchingFishCoroutine;
                catchingFishDatabindingGson.CatchingFishReduxKtor = catchingFishGraphQLBundle.CatchingFishParcelableFAB;
                catchingFishDatabindingGson.CatchingFishDaggerWebsocket = catchingFishGraphQLBundle.CatchingFishSnackbar;
                catchingFishDatabindingGson.CatchingFishSnackbar = ((ViewGroup.MarginLayoutParams) catchingFishGraphQLBundle).width;
                catchingFishDatabindingGson.CatchingFishCoroutine = ((ViewGroup.MarginLayoutParams) catchingFishGraphQLBundle).height;
                catchingFishDatabindingGson.CatchingFishMutableLiveData = ((ViewGroup.MarginLayoutParams) catchingFishGraphQLBundle).leftMargin;
                catchingFishDatabindingGson.CatchingFishJobScheduler = ((ViewGroup.MarginLayoutParams) catchingFishGraphQLBundle).rightMargin;
                catchingFishDatabindingGson.CatchingFishPayPalService = ((ViewGroup.MarginLayoutParams) catchingFishGraphQLBundle).topMargin;
                catchingFishDatabindingGson.CatchingFishSensorManager = ((ViewGroup.MarginLayoutParams) catchingFishGraphQLBundle).bottomMargin;
                catchingFishDatabindingGson.CatchingFishCameraXIntent = catchingFishGraphQLBundle.CatchingFishCustomView;
                catchingFishDatabindingGson.CatchingFishAppCompat = catchingFishGraphQLBundle.CatchingFishSensorManager;
                catchingFishDatabindingGson.CatchingFishDataStoreIntent = catchingFishGraphQLBundle.CatchingFishPayPalService;
                catchingFishDatabindingGson.CatchingFishJUnitRealm = catchingFishGraphQLBundle.CatchingFishDagger;
                catchingFishDatabindingGson.CatchingFishStateFlow = catchingFishGraphQLBundle.CatchingFishEspressoMockk;
                catchingFishDatabindingGson.CatchingFishGradleLiveData = catchingFishGraphQLBundle.CatchingFishJUnitRealm;
                catchingFishDatabindingGson.CatchingFishRetrofit = catchingFishGraphQLBundle.CatchingFishAnimation;
                catchingFishDatabindingGson.CatchingFishAnimation = catchingFishGraphQLBundle.CatchingFishCameraXIntent;
                catchingFishDatabindingGson.CatchingFishMVVMAppCompat = catchingFishGraphQLBundle.CatchingFishHandler;
                catchingFishDatabindingGson.CatchingFishStripeAPI = catchingFishGraphQLBundle.CatchingFishMotionLayout;
                catchingFishDatabindingGson.CatchingFishMoshiDaggerHilt = catchingFishGraphQLBundle.CatchingFishLayoutInflater;
                catchingFishDatabindingGson.CatchingFishAndroidX = catchingFishGraphQLBundle.CatchingFishPayPalLiveData;
                catchingFishDatabindingGson.CatchingFishNavigationGson = catchingFishGraphQLBundle.CatchingFishGradleManifest;
                catchingFishDatabindingGson.CatchingFishRedux = catchingFishGraphQLBundle.CatchingFishParcelable;
                catchingFishDatabindingGson.CatchingFishCustomViewJUnit = catchingFishGraphQLBundle.CatchingFishRecyclerView;
                catchingFishDatabindingGson.CatchingFishRetrofitMVI = catchingFishGraphQLBundle.CatchingFishMVVMAppCompat;
                catchingFishDatabindingGson.CatchingFishPayPalLiveData = catchingFishGraphQLBundle.CatchingFishParcelableFlux;
                catchingFishDatabindingGson.CatchingFishMotionLayout = catchingFishGraphQLBundle.CatchingFishCardViewRealm;
                catchingFishDatabindingGson.CatchingFishHandler = catchingFishGraphQLBundle.CatchingFishSpannableWidget;
                catchingFishDatabindingGson.CatchingFishGradleManifest = catchingFishGraphQLBundle.CatchingFishGsonAppCompat;
                catchingFishDatabindingGson.CatchingFishParcelable = catchingFishGraphQLBundle.CatchingFishPayPal;
                catchingFishDatabindingGson.CatchingFishLayoutInflater = catchingFishGraphQLBundle.CatchingFishCardViewView;
                catchingFishDatabindingGson.CatchingFishRecyclerView = catchingFishGraphQLBundle.CatchingFishMVPRobolectric;
                catchingFishDatabindingGson.CatchingFishServiceMVIJUnit = catchingFishGraphQLBundle.CatchingFishStripeAPI;
                catchingFishDatabindingGson.CatchingFishEspressoMockk = catchingFishGraphQLBundle.getMarginEnd();
                catchingFishDatabindingGson.CatchingFishDagger = catchingFishGraphQLBundle.getMarginStart();
                catchingFishBundleService.CatchingFishParcelableFAB = childAt.getVisibility();
                catchingFishBundleService.CatchingFishCoroutine = childAt.getAlpha();
                catchingFishGradleDataStore.CatchingFishParcelableFAB = childAt.getRotation();
                catchingFishGradleDataStore.CatchingFishSnackbar = childAt.getRotationX();
                catchingFishGradleDataStore.CatchingFishCoroutine = childAt.getRotationY();
                catchingFishGradleDataStore.CatchingFishReduxKtor = childAt.getScaleX();
                catchingFishGradleDataStore.CatchingFishDaggerWebsocket = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    catchingFishGradleDataStore.CatchingFishWorkManager = pivotX;
                    catchingFishGradleDataStore.CatchingFishViewModelScope = pivotY;
                }
                catchingFishGradleDataStore.CatchingFishLayout = childAt.getTranslationX();
                catchingFishGradleDataStore.CatchingFishFragmentHandler = childAt.getTranslationY();
                catchingFishGradleDataStore.CatchingFishCloudMessaging = childAt.getTranslationZ();
                if (catchingFishGradleDataStore.CatchingFishEspressoTesting) {
                    catchingFishGradleDataStore.CatchingFishOkHttp = childAt.getElevation();
                }
                if (childAt instanceof CatchingFishHiltXMLLayout) {
                    CatchingFishHiltXMLLayout catchingFishHiltXMLLayout = (CatchingFishHiltXMLLayout) childAt;
                    catchingFishDatabindingGson.CatchingFishView = catchingFishHiltXMLLayout.getAllowsGoneWidget();
                    catchingFishDatabindingGson.CatchingFishPicasso = catchingFishHiltXMLLayout.getReferencedIds();
                    catchingFishDatabindingGson.CatchingFishDaggerMVVM = catchingFishHiltXMLLayout.getType();
                    catchingFishDatabindingGson.CatchingFishMockkOkHttp = catchingFishHiltXMLLayout.getMargin();
                }
            }
            i4 = i2 + 1;
            catchingFishAnimationBundle = this;
            hashMap2 = hashMap;
            childCount = i;
        }
    }
}
