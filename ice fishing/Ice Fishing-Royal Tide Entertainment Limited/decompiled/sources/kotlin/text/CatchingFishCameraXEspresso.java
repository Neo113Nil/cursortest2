package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public final class CatchingFishCameraXEspresso implements CatchingFishReduxView {
    public boolean CatchingFishAnimationMockk;
    public int CatchingFishCloudMessaging;
    public int CatchingFishCoroutine;
    public int CatchingFishDaggerWebsocket;
    public CharSequence CatchingFishEspressoTesting;
    public CharSequence CatchingFishFragmentHandler;
    public int CatchingFishLayout;
    public int CatchingFishNavigation;
    public ArrayList CatchingFishOkHttp;
    public final ArrayList CatchingFishParcelableFAB;
    public int CatchingFishReduxKtor;
    public boolean CatchingFishRoomDatabase;
    public int CatchingFishSnackbar;
    public final CatchingFishToastSharedFlow CatchingFishStateLiveData;
    public ArrayList CatchingFishUnitTesting;
    public String CatchingFishViewModelFAB;
    public boolean CatchingFishViewModelScope;
    public int CatchingFishWorkManager;

    public CatchingFishCameraXEspresso(CatchingFishToastSharedFlow catchingFishToastSharedFlow) {
        catchingFishToastSharedFlow.CatchingFishMVPRobolectric();
        CatchingFishMVIPicasso catchingFishMVIPicasso = catchingFishToastSharedFlow.CatchingFishJetpackCompose;
        if (catchingFishMVIPicasso != null) {
            catchingFishMVIPicasso.CatchingFishCoroutineFlow.getClassLoader();
        }
        this.CatchingFishParcelableFAB = new ArrayList();
        this.CatchingFishAnimationMockk = false;
        this.CatchingFishNavigation = -1;
        this.CatchingFishStateLiveData = catchingFishToastSharedFlow;
    }

    public final void CatchingFishCoroutine(int i) {
        if (this.CatchingFishViewModelScope) {
            if (CatchingFishToastSharedFlow.CatchingFishFragmentFactory(2)) {
                toString();
            }
            ArrayList arrayList = this.CatchingFishParcelableFAB;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                CatchingFishPicassoFAB catchingFishPicassoFAB = (CatchingFishPicassoFAB) arrayList.get(i2);
                CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi = catchingFishPicassoFAB.CatchingFishSnackbar;
                if (catchingFishGoogleMapsMoshi != null) {
                    catchingFishGoogleMapsMoshi.CatchingFishJetpackCompose += i;
                    if (CatchingFishToastSharedFlow.CatchingFishFragmentFactory(2)) {
                        Objects.toString(catchingFishPicassoFAB.CatchingFishSnackbar);
                        int i3 = catchingFishPicassoFAB.CatchingFishSnackbar.CatchingFishJetpackCompose;
                    }
                }
            }
        }
    }

    public final void CatchingFishDaggerWebsocket(int i, CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi, String str, int i2) {
        String str2 = catchingFishGoogleMapsMoshi.CatchingFishPayPalLiveData;
        if (str2 != null) {
            CatchingFishCoroutineGlide.CatchingFishSnackbar(catchingFishGoogleMapsMoshi, str2);
        }
        Class<?> cls = catchingFishGoogleMapsMoshi.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = catchingFishGoogleMapsMoshi.CatchingFishPayPal;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + catchingFishGoogleMapsMoshi + ": was " + catchingFishGoogleMapsMoshi.CatchingFishPayPal + " now " + str);
            }
            catchingFishGoogleMapsMoshi.CatchingFishPayPal = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + catchingFishGoogleMapsMoshi + " with tag " + str + " to container view with no id");
            }
            int i3 = catchingFishGoogleMapsMoshi.CatchingFishGsonAppCompat;
            if (i3 != 0 && i3 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + catchingFishGoogleMapsMoshi + ": was " + catchingFishGoogleMapsMoshi.CatchingFishGsonAppCompat + " now " + i);
            }
            catchingFishGoogleMapsMoshi.CatchingFishGsonAppCompat = i;
            catchingFishGoogleMapsMoshi.CatchingFishCardViewRealm = i;
        }
        CatchingFishSnackbar(new CatchingFishPicassoFAB(i2, catchingFishGoogleMapsMoshi));
        catchingFishGoogleMapsMoshi.CatchingFishCoroutineFlow = this.CatchingFishStateLiveData;
    }

    @Override // kotlin.text.CatchingFishReduxView
    public final boolean CatchingFishParcelableFAB(ArrayList arrayList, ArrayList arrayList2) {
        if (CatchingFishToastSharedFlow.CatchingFishFragmentFactory(2)) {
            toString();
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.CatchingFishViewModelScope) {
            return true;
        }
        CatchingFishToastSharedFlow catchingFishToastSharedFlow = this.CatchingFishStateLiveData;
        if (catchingFishToastSharedFlow.CatchingFishReduxKtor == null) {
            catchingFishToastSharedFlow.CatchingFishReduxKtor = new ArrayList();
        }
        catchingFishToastSharedFlow.CatchingFishReduxKtor.add(this);
        return true;
    }

    public final int CatchingFishReduxKtor(boolean z) {
        if (this.CatchingFishRoomDatabase) {
            throw new IllegalStateException("commit already called");
        }
        if (CatchingFishToastSharedFlow.CatchingFishFragmentFactory(2)) {
            toString();
            PrintWriter printWriter = new PrintWriter(new CatchingFishViewPagerMVP());
            CatchingFishWorkManager("  ", printWriter, true);
            printWriter.close();
        }
        this.CatchingFishRoomDatabase = true;
        boolean z2 = this.CatchingFishViewModelScope;
        CatchingFishToastSharedFlow catchingFishToastSharedFlow = this.CatchingFishStateLiveData;
        if (z2) {
            this.CatchingFishNavigation = catchingFishToastSharedFlow.CatchingFishLayout.getAndIncrement();
        } else {
            this.CatchingFishNavigation = -1;
        }
        catchingFishToastSharedFlow.CatchingFishSpannableWidget(this, z);
        return this.CatchingFishNavigation;
    }

    public final void CatchingFishSnackbar(CatchingFishPicassoFAB catchingFishPicassoFAB) {
        this.CatchingFishParcelableFAB.add(catchingFishPicassoFAB);
        catchingFishPicassoFAB.CatchingFishReduxKtor = this.CatchingFishSnackbar;
        catchingFishPicassoFAB.CatchingFishDaggerWebsocket = this.CatchingFishCoroutine;
        catchingFishPicassoFAB.CatchingFishWorkManager = this.CatchingFishReduxKtor;
        catchingFishPicassoFAB.CatchingFishViewModelScope = this.CatchingFishDaggerWebsocket;
    }

    public final void CatchingFishWorkManager(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.CatchingFishViewModelFAB);
            printWriter.print(" mIndex=");
            printWriter.print(this.CatchingFishNavigation);
            printWriter.print(" mCommitted=");
            printWriter.println(this.CatchingFishRoomDatabase);
            if (this.CatchingFishWorkManager != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.CatchingFishWorkManager));
            }
            if (this.CatchingFishSnackbar != 0 || this.CatchingFishCoroutine != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.CatchingFishSnackbar));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.CatchingFishCoroutine));
            }
            if (this.CatchingFishReduxKtor != 0 || this.CatchingFishDaggerWebsocket != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.CatchingFishReduxKtor));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.CatchingFishDaggerWebsocket));
            }
            if (this.CatchingFishLayout != 0 || this.CatchingFishFragmentHandler != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.CatchingFishLayout));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.CatchingFishFragmentHandler);
            }
            if (this.CatchingFishCloudMessaging != 0 || this.CatchingFishEspressoTesting != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.CatchingFishCloudMessaging));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.CatchingFishEspressoTesting);
            }
        }
        ArrayList arrayList = this.CatchingFishParcelableFAB;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            CatchingFishPicassoFAB catchingFishPicassoFAB = (CatchingFishPicassoFAB) arrayList.get(i);
            switch (catchingFishPicassoFAB.CatchingFishParcelableFAB) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                    str2 = "SHOW";
                    break;
                case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                    str2 = "DETACH";
                    break;
                case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
                    str2 = "ATTACH";
                    break;
                case CatchingFishMoshiSpannable.BYTES_FIELD_NUMBER /* 8 */:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + catchingFishPicassoFAB.CatchingFishParcelableFAB;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(catchingFishPicassoFAB.CatchingFishSnackbar);
            if (z) {
                if (catchingFishPicassoFAB.CatchingFishReduxKtor != 0 || catchingFishPicassoFAB.CatchingFishDaggerWebsocket != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(catchingFishPicassoFAB.CatchingFishReduxKtor));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(catchingFishPicassoFAB.CatchingFishDaggerWebsocket));
                }
                if (catchingFishPicassoFAB.CatchingFishWorkManager != 0 || catchingFishPicassoFAB.CatchingFishViewModelScope != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(catchingFishPicassoFAB.CatchingFishWorkManager));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(catchingFishPicassoFAB.CatchingFishViewModelScope));
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.CatchingFishNavigation >= 0) {
            sb.append(" #");
            sb.append(this.CatchingFishNavigation);
        }
        if (this.CatchingFishViewModelFAB != null) {
            sb.append(" ");
            sb.append(this.CatchingFishViewModelFAB);
        }
        sb.append("}");
        return sb.toString();
    }
}
