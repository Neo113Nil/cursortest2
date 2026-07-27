package kotlin.text;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Comparator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class CatchingFishMVVMCoroutine implements Comparator {
    public final /* synthetic */ int CatchingFishParcelableFAB;
    public static final CatchingFishMVVMCoroutine CatchingFishSnackbar = new CatchingFishMVVMCoroutine(0);
    public static final CatchingFishMVVMCoroutine CatchingFishCoroutine = new CatchingFishMVVMCoroutine(1);
    public static final CatchingFishMVVMCoroutine CatchingFishReduxKtor = new CatchingFishMVVMCoroutine(2);
    public static final CatchingFishMVVMCoroutine CatchingFishDaggerWebsocket = new CatchingFishMVVMCoroutine(3);
    public static final CatchingFishMVVMCoroutine CatchingFishWorkManager = new CatchingFishMVVMCoroutine(4);

    public /* synthetic */ CatchingFishMVVMCoroutine(int i) {
        this.CatchingFishParcelableFAB = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, java.lang.Object[]] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = 0;
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishAppCompatWidget catchingFishAppCompatWidget = (CatchingFishAppCompatWidget) obj;
                CatchingFishAppCompatWidget catchingFishAppCompatWidget2 = (CatchingFishAppCompatWidget) obj2;
                if (CatchingFishGsonCardView.CatchingFishCustomView(catchingFishAppCompatWidget) && CatchingFishGsonCardView.CatchingFishCustomView(catchingFishAppCompatWidget2)) {
                    CatchingFishBiometricRoom CatchingFishJobScheduler = CatchingFishXMLLayoutGlide.CatchingFishJobScheduler(catchingFishAppCompatWidget);
                    CatchingFishBiometricRoom CatchingFishJobScheduler2 = CatchingFishXMLLayoutGlide.CatchingFishJobScheduler(catchingFishAppCompatWidget2);
                    if (!CatchingFishFirebaseDagger.CatchingFishOkHttp(CatchingFishJobScheduler, CatchingFishJobScheduler2)) {
                        CatchingFishBiometricRoom[] catchingFishBiometricRoomArr = new CatchingFishBiometricRoom[16];
                        int i2 = 0;
                        while (CatchingFishJobScheduler != null) {
                            int i3 = i2 + 1;
                            if (catchingFishBiometricRoomArr.length < i3) {
                                int length = catchingFishBiometricRoomArr.length;
                                ?? r5 = new Object[Math.max(i3, length * 2)];
                                System.arraycopy(catchingFishBiometricRoomArr, 0, r5, 0, length);
                                catchingFishBiometricRoomArr = r5;
                            }
                            if (i2 != 0) {
                                System.arraycopy(catchingFishBiometricRoomArr, 0, catchingFishBiometricRoomArr, 0 + 1, i2 + 0);
                            }
                            catchingFishBiometricRoomArr[0] = CatchingFishJobScheduler;
                            i2++;
                            CatchingFishJobScheduler = CatchingFishJobScheduler.CatchingFishRoomDatabase();
                        }
                        CatchingFishBiometricRoom[] catchingFishBiometricRoomArr2 = new CatchingFishBiometricRoom[16];
                        int i4 = 0;
                        while (CatchingFishJobScheduler2 != null) {
                            int i5 = i4 + 1;
                            if (catchingFishBiometricRoomArr2.length < i5) {
                                int length2 = catchingFishBiometricRoomArr2.length;
                                ?? r52 = new Object[Math.max(i5, length2 * 2)];
                                System.arraycopy(catchingFishBiometricRoomArr2, 0, r52, 0, length2);
                                catchingFishBiometricRoomArr2 = r52;
                            }
                            if (i4 != 0) {
                                System.arraycopy(catchingFishBiometricRoomArr2, 0, catchingFishBiometricRoomArr2, 0 + 1, i4 + 0);
                            }
                            catchingFishBiometricRoomArr2[0] = CatchingFishJobScheduler2;
                            i4++;
                            CatchingFishJobScheduler2 = CatchingFishJobScheduler2.CatchingFishRoomDatabase();
                        }
                        int min = Math.min(i2 - 1, i4 - 1);
                        if (min >= 0) {
                            while (CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishBiometricRoomArr[i], catchingFishBiometricRoomArr2[i])) {
                                if (i != min) {
                                    i++;
                                }
                            }
                            return CatchingFishFirebaseDagger.CatchingFishJetpackCompose(catchingFishBiometricRoomArr[i].CatchingFishNavigation(), catchingFishBiometricRoomArr2[i].CatchingFishNavigation());
                        }
                        throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
                    }
                } else {
                    if (CatchingFishGsonCardView.CatchingFishCustomView(catchingFishAppCompatWidget)) {
                        return -1;
                    }
                    if (CatchingFishGsonCardView.CatchingFishCustomView(catchingFishAppCompatWidget2)) {
                        return 1;
                    }
                }
                return 0;
            case 1:
                CatchingFishFluxExoPlayer CatchingFishViewModelFAB = ((CatchingFishMVIGraphQLHilt) obj).CatchingFishViewModelFAB();
                CatchingFishFluxExoPlayer CatchingFishViewModelFAB2 = ((CatchingFishMVIGraphQLHilt) obj2).CatchingFishViewModelFAB();
                int compare = Float.compare(CatchingFishViewModelFAB.CatchingFishParcelableFAB, CatchingFishViewModelFAB2.CatchingFishParcelableFAB);
                if (compare != 0) {
                    return compare;
                }
                int compare2 = Float.compare(CatchingFishViewModelFAB.CatchingFishSnackbar, CatchingFishViewModelFAB2.CatchingFishSnackbar);
                if (compare2 != 0) {
                    return compare2;
                }
                int compare3 = Float.compare(CatchingFishViewModelFAB.CatchingFishReduxKtor, CatchingFishViewModelFAB2.CatchingFishReduxKtor);
                return compare3 != 0 ? compare3 : Float.compare(CatchingFishViewModelFAB.CatchingFishCoroutine, CatchingFishViewModelFAB2.CatchingFishCoroutine);
            case 2:
                CatchingFishBiometricRoom catchingFishBiometricRoom = (CatchingFishBiometricRoom) obj;
                CatchingFishBiometricRoom catchingFishBiometricRoom2 = (CatchingFishBiometricRoom) obj2;
                int CatchingFishJetpackCompose = CatchingFishFirebaseDagger.CatchingFishJetpackCompose(catchingFishBiometricRoom2.CatchingFishNavigation, catchingFishBiometricRoom.CatchingFishNavigation);
                return CatchingFishJetpackCompose != 0 ? CatchingFishJetpackCompose : CatchingFishFirebaseDagger.CatchingFishJetpackCompose(catchingFishBiometricRoom.hashCode(), catchingFishBiometricRoom2.hashCode());
            case 3:
                CatchingFishFluxExoPlayer CatchingFishViewModelFAB3 = ((CatchingFishMVIGraphQLHilt) obj).CatchingFishViewModelFAB();
                CatchingFishFluxExoPlayer CatchingFishViewModelFAB4 = ((CatchingFishMVIGraphQLHilt) obj2).CatchingFishViewModelFAB();
                int compare4 = Float.compare(CatchingFishViewModelFAB4.CatchingFishCoroutine, CatchingFishViewModelFAB3.CatchingFishCoroutine);
                if (compare4 != 0) {
                    return compare4;
                }
                int compare5 = Float.compare(CatchingFishViewModelFAB3.CatchingFishSnackbar, CatchingFishViewModelFAB4.CatchingFishSnackbar);
                if (compare5 != 0) {
                    return compare5;
                }
                int compare6 = Float.compare(CatchingFishViewModelFAB3.CatchingFishReduxKtor, CatchingFishViewModelFAB4.CatchingFishReduxKtor);
                return compare6 != 0 ? compare6 : Float.compare(CatchingFishViewModelFAB4.CatchingFishParcelableFAB, CatchingFishViewModelFAB3.CatchingFishParcelableFAB);
            case 4:
                CatchingFishGsonWorkManager catchingFishGsonWorkManager = (CatchingFishGsonWorkManager) obj;
                CatchingFishGsonWorkManager catchingFishGsonWorkManager2 = (CatchingFishGsonWorkManager) obj2;
                int compare7 = Float.compare(((CatchingFishFluxExoPlayer) catchingFishGsonWorkManager.CatchingFishReduxKtor).CatchingFishSnackbar, ((CatchingFishFluxExoPlayer) catchingFishGsonWorkManager2.CatchingFishReduxKtor).CatchingFishSnackbar);
                return compare7 != 0 ? compare7 : Float.compare(((CatchingFishFluxExoPlayer) catchingFishGsonWorkManager.CatchingFishReduxKtor).CatchingFishReduxKtor, ((CatchingFishFluxExoPlayer) catchingFishGsonWorkManager2.CatchingFishReduxKtor).CatchingFishReduxKtor);
            case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                return CatchingFishAdMobFAB.CatchingFishRoomDatabase(Integer.valueOf(((CatchingFishFluxNavigation) obj).CatchingFishSnackbar), Integer.valueOf(((CatchingFishFluxNavigation) obj2).CatchingFishSnackbar));
            case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
                float z = ((View) obj).getZ();
                float z2 = ((View) obj2).getZ();
                if (z > z2) {
                    return -1;
                }
                return z < z2 ? 1 : 0;
            case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
                CatchingFishBiometricRoom catchingFishBiometricRoom3 = (CatchingFishBiometricRoom) obj;
                CatchingFishBiometricRoom catchingFishBiometricRoom4 = (CatchingFishBiometricRoom) obj2;
                int CatchingFishJetpackCompose2 = CatchingFishFirebaseDagger.CatchingFishJetpackCompose(catchingFishBiometricRoom3.CatchingFishNavigation, catchingFishBiometricRoom4.CatchingFishNavigation);
                return CatchingFishJetpackCompose2 != 0 ? CatchingFishJetpackCompose2 : CatchingFishFirebaseDagger.CatchingFishJetpackCompose(catchingFishBiometricRoom3.hashCode(), catchingFishBiometricRoom4.hashCode());
            case CatchingFishMoshiSpannable.BYTES_FIELD_NUMBER /* 8 */:
                CatchingFishIntentHandler catchingFishIntentHandler = (CatchingFishIntentHandler) obj;
                CatchingFishIntentHandler catchingFishIntentHandler2 = (CatchingFishIntentHandler) obj2;
                RecyclerView recyclerView = catchingFishIntentHandler.CatchingFishReduxKtor;
                if ((recyclerView == null) == (catchingFishIntentHandler2.CatchingFishReduxKtor == null)) {
                    boolean z3 = catchingFishIntentHandler.CatchingFishParcelableFAB;
                    if (z3 == catchingFishIntentHandler2.CatchingFishParcelableFAB) {
                        int i6 = catchingFishIntentHandler2.CatchingFishSnackbar - catchingFishIntentHandler.CatchingFishSnackbar;
                        if (i6 != 0) {
                            return i6;
                        }
                        int i7 = catchingFishIntentHandler.CatchingFishCoroutine - catchingFishIntentHandler2.CatchingFishCoroutine;
                        if (i7 != 0) {
                            return i7;
                        }
                        return 0;
                    }
                    if (!z3) {
                        return 1;
                    }
                } else if (recyclerView == null) {
                    return 1;
                }
                return -1;
            case 9:
                return ((CatchingFishHandlerGson) obj).CatchingFishDaggerWebsocket - ((CatchingFishHandlerGson) obj2).CatchingFishDaggerWebsocket;
            default:
                return ((View) obj).getTop() - ((View) obj2).getTop();
        }
    }
}
