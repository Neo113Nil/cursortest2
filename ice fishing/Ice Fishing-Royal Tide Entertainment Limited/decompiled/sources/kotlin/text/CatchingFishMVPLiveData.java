package kotlin.text;

import android.view.View;
import android.view.ViewGroup;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract /* synthetic */ class CatchingFishMVPLiveData {
    public static final /* synthetic */ int[] CatchingFishParcelableFAB = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48};

    public static CatchingFishBiometricView CatchingFish(String str) {
        CatchingFishFluxGradle.CatchingFishCoroutine(str);
        return new CatchingFishBiometricView();
    }

    public static String CatchingFishAnimationMockk(StringBuilder sb, int i, char c) {
        sb.append(i);
        sb.append(c);
        return sb.toString();
    }

    public static String CatchingFishCloudMessaging(String str, int i) {
        return str + i;
    }

    public static int CatchingFishCoroutine(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        return CatchingFishSnackbar(view.getVisibility());
    }

    public static void CatchingFishCoroutineFlow(long j, StringBuilder sb, String str) {
        sb.append((Object) CatchingFishToastFragment.CatchingFishViewModelFAB(j));
        sb.append(str);
    }

    public static /* synthetic */ void CatchingFishDaggerHiltFAB(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ int CatchingFishDaggerWebsocket(int i) {
        switch (i) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                return 7;
            case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                return 8;
            case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
                return 9;
            case CatchingFishMoshiSpannable.BYTES_FIELD_NUMBER /* 8 */:
                return 10;
            case 9:
                return 11;
            case 10:
                return 12;
            case 11:
                return 13;
            default:
                throw null;
        }
    }

    public static String CatchingFishEspressoTesting(String str, String str2) {
        return str + str2;
    }

    public static String CatchingFishFragmentHandler(int i, int i2, String str, String str2) {
        return str + i + str2 + i2;
    }

    public static /* synthetic */ int[] CatchingFishGsonAppCompat(int i) {
        int[] iArr = new int[i];
        System.arraycopy(CatchingFishParcelableFAB, 0, iArr, 0, i);
        return iArr;
    }

    public static void CatchingFishJetpackCompose(int i, int i2, int i3, int i4, int i5) {
        CatchingFishGsonCardView.CatchingFishCoroutine(i);
        CatchingFishGsonCardView.CatchingFishCoroutine(i2);
        CatchingFishGsonCardView.CatchingFishCoroutine(i3);
        CatchingFishGsonCardView.CatchingFishCoroutine(i4);
        CatchingFishGsonCardView.CatchingFishCoroutine(i5);
    }

    public static ClassCastException CatchingFishLayout(Object obj) {
        obj.getClass();
        return new ClassCastException();
    }

    public static Map CatchingFishNavigation(HashMap hashMap) {
        return Collections.unmodifiableMap(new HashMap(hashMap));
    }

    public static String CatchingFishOkHttp(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static final void CatchingFishParcelableFAB(View view, int i) {
        int CatchingFishParcelableFlux = CatchingFishParcelableFlux(i);
        if (CatchingFishParcelableFlux == 0) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                if (CatchingFishToastSharedFlow.CatchingFishFragmentFactory(2)) {
                    view.toString();
                    viewGroup.toString();
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        if (CatchingFishParcelableFlux == 1) {
            if (CatchingFishToastSharedFlow.CatchingFishFragmentFactory(2)) {
                Objects.toString(view);
            }
            view.setVisibility(0);
        } else if (CatchingFishParcelableFlux == 2) {
            if (CatchingFishToastSharedFlow.CatchingFishFragmentFactory(2)) {
                Objects.toString(view);
            }
            view.setVisibility(8);
        } else {
            if (CatchingFishParcelableFlux != 3) {
                return;
            }
            if (CatchingFishToastSharedFlow.CatchingFishFragmentFactory(2)) {
                Objects.toString(view);
            }
            view.setVisibility(4);
        }
    }

    public static /* synthetic */ int CatchingFishParcelableFlux(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    public static /* synthetic */ boolean CatchingFishReduxKtor(int i, int i2) {
        if (i != 0) {
            return i == i2;
        }
        throw null;
    }

    public static HashMap CatchingFishRoomDatabase(Class cls, CatchingFishViewModelKtor catchingFishViewModelKtor) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, catchingFishViewModelKtor);
        return hashMap;
    }

    public static int CatchingFishSnackbar(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 4) {
            return 4;
        }
        if (i == 8) {
            return 3;
        }
        throw new IllegalArgumentException(CatchingFishCloudMessaging("Unknown visibility ", i));
    }

    public static /* synthetic */ String CatchingFishSpannableWidget(int i) {
        switch (i) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                return "BOTTOM";
            case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                return "BASELINE";
            case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
                return "CENTER";
            case CatchingFishMoshiSpannable.BYTES_FIELD_NUMBER /* 8 */:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }

    public static String CatchingFishStateLiveData(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static String CatchingFishUnitTesting(StringBuilder sb, float f, char c) {
        sb.append(f);
        sb.append(c);
        return sb.toString();
    }

    public static int CatchingFishViewModelFAB(int i, int i2, long j) {
        return (Long.hashCode(j) + i) * i2;
    }

    public static int CatchingFishViewModelScope(int i, int i2, int i3) {
        return (Integer.hashCode(i) + i2) * i3;
    }

    public static int CatchingFishWorkManager(float f, int i, int i2) {
        return (Float.hashCode(f) + i) * i2;
    }
}
