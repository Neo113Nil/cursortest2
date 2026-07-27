package kotlin.text;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Editable;
import android.text.Selection;
import androidx.recyclerview.widget.RecyclerView;
import com.adjust.sdk.Constants;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class CatchingFishMoshiFluxMoshi implements CatchingFishGlidePayPal, CatchingFishMockkAsyncTask, CatchingFishDaggerAdMob, CatchingFishFluxToolbar, CatchingFishAdMobLayout, CatchingFishMVVMView, CatchingFishMockkService, CatchingFishMVIGoogleMaps {
    public static CatchingFishMoshiFluxMoshi CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;
    public static final CatchingFishMoshiFluxMoshi CatchingFishWorkManager = new CatchingFishMoshiFluxMoshi(1);
    public static final /* synthetic */ CatchingFishMoshiFluxMoshi CatchingFishViewModelScope = new CatchingFishMoshiFluxMoshi(2);
    public static final CatchingFishMoshiFluxMoshi CatchingFishViewModelFAB = new CatchingFishMoshiFluxMoshi(3);
    public static final CatchingFishMoshiFluxMoshi CatchingFishLayout = new CatchingFishMoshiFluxMoshi(4);
    public static final /* synthetic */ CatchingFishMoshiFluxMoshi CatchingFishFragmentHandler = new CatchingFishMoshiFluxMoshi(5);
    public static final CatchingFishMoshiFluxMoshi CatchingFishCloudMessaging = new CatchingFishMoshiFluxMoshi(6);
    public static final CatchingFishMoshiFluxMoshi CatchingFishEspressoTesting = new CatchingFishMoshiFluxMoshi(7);
    public static final CatchingFishMoshiFluxMoshi CatchingFishOkHttp = new CatchingFishMoshiFluxMoshi(8);
    public static final CatchingFishKtorKtorOkHttp CatchingFishUnitTesting = new CatchingFishKtorKtorOkHttp();

    public /* synthetic */ CatchingFishMoshiFluxMoshi(int i) {
        this.CatchingFishReduxKtor = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0075, code lost:
    
        if (r11 != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00a2, code lost:
    
        if (r10 != (-1)) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean CatchingFishEspressoTesting(CatchingFishJUnitViewModel catchingFishJUnitViewModel, Editable editable, int i, int i2, boolean z) {
        int min;
        if (editable != null && i >= 0 && i2 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z) {
                    int max = Math.max(i, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && max >= 0) {
                        loop0: while (true) {
                            boolean z2 = false;
                            while (true) {
                                if (max == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart >= 0) {
                                    char charAt = editable.charAt(selectionStart);
                                    if (z2) {
                                        break;
                                    }
                                    if (!Character.isSurrogate(charAt)) {
                                        max--;
                                    } else {
                                        if (Character.isHighSurrogate(charAt)) {
                                            break loop0;
                                        }
                                        z2 = true;
                                    }
                                } else if (!z2) {
                                    selectionStart = 0;
                                }
                            }
                            max--;
                        }
                    }
                    selectionStart = -1;
                    int max2 = Math.max(i2, 0);
                    min = editable.length();
                    if (selectionEnd >= 0 && min >= selectionEnd && max2 >= 0) {
                        loop2: while (true) {
                            boolean z3 = false;
                            while (true) {
                                if (max2 == 0) {
                                    min = selectionEnd;
                                    break loop2;
                                }
                                if (selectionEnd < min) {
                                    char charAt2 = editable.charAt(selectionEnd);
                                    if (z3) {
                                        break;
                                    }
                                    if (!Character.isSurrogate(charAt2)) {
                                        max2--;
                                        selectionEnd++;
                                    } else {
                                        if (Character.isLowSurrogate(charAt2)) {
                                            break loop2;
                                        }
                                        selectionEnd++;
                                        z3 = true;
                                    }
                                }
                            }
                            max2--;
                            selectionEnd++;
                        }
                    }
                    min = -1;
                    if (selectionStart != -1) {
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i, 0);
                    min = Math.min(selectionEnd + i2, editable.length());
                }
                CatchingFishDaggerRealm[] catchingFishDaggerRealmArr = (CatchingFishDaggerRealm[]) editable.getSpans(selectionStart, min, CatchingFishDaggerRealm.class);
                if (catchingFishDaggerRealmArr != null && catchingFishDaggerRealmArr.length > 0) {
                    for (CatchingFishDaggerRealm catchingFishDaggerRealm : catchingFishDaggerRealmArr) {
                        int spanStart = editable.getSpanStart(catchingFishDaggerRealm);
                        int spanEnd = editable.getSpanEnd(catchingFishDaggerRealm);
                        selectionStart = Math.min(spanStart, selectionStart);
                        min = Math.max(spanEnd, min);
                    }
                    int max3 = Math.max(selectionStart, 0);
                    int min2 = Math.min(min, editable.length());
                    catchingFishJUnitViewModel.beginBatchEdit();
                    editable.delete(max3, min2);
                    catchingFishJUnitViewModel.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        if (r1 == 0) goto L7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.text.CatchingFishLiveDataToolbar] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String CatchingFishFragmentHandler(String str) {
        String str2;
        try {
            int CatchingFishPayPalService = CatchingFishRoomMVVMWidget.CatchingFishPayPalService(str, "#__WA__=", 0, false);
            if (CatchingFishPayPalService >= 0) {
                String substring = str.substring(CatchingFishPayPalService + 8);
                CatchingFishFirebaseDagger.CatchingFishRoomDatabase(substring, "substring(...)");
                String optString = new JSONObject(URLDecoder.decode(substring, Constants.ENCODING)).optString("returnUrl");
                int length = optString.length();
                str2 = optString;
            }
            str2 = str;
        } catch (Throwable th) {
            str2 = CatchingFishDaggerBiometric.CatchingFishViewModelFAB(th);
        }
        if (!(str2 instanceof CatchingFishLiveDataToolbar)) {
            str = str2;
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f7, code lost:
    
        r6 = r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean CatchingFishOkHttp(PackageInfo packageInfo) {
        ApplicationInfo applicationInfo;
        CatchingFishNavigationMVVM catchingFishNavigationMVVM;
        SigningInfo signingInfo;
        CatchingFishNavigationMVVM catchingFishNavigationMVVM2;
        boolean hasMultipleSigners;
        Signature[] signingCertificateHistory;
        Signature[] signingCertificateHistory2;
        int i;
        if (packageInfo != null) {
            boolean z = (("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) && ((applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 129) == 0)) ? false : true;
            try {
                catchingFishNavigationMVVM = z ? CatchingFishMVVMGradle.CatchingFishCoroutine : CatchingFishMVVMGradle.CatchingFishSnackbar;
                int i2 = Build.VERSION.SDK_INT;
                if (i2 < 28) {
                    Signature[] signatureArr = packageInfo.signatures;
                    byte[] bArr = null;
                    if (signatureArr != null && signatureArr.length == 1) {
                        bArr = signatureArr[0].toByteArray();
                    }
                    if (bArr != null) {
                        CatchingFishMoshiParcelable catchingFishMoshiParcelable = CatchingFishFragmentRedux.CatchingFishDaggerWebsocket;
                        Object[] objArr = {bArr};
                        CatchingFishViewMVIMVVM.CatchingFishFragmentFactory(1, objArr);
                        catchingFishNavigationMVVM2 = new CatchingFishNavigationMVVM(1, objArr);
                    } else {
                        CatchingFishMoshiParcelable catchingFishMoshiParcelable2 = CatchingFishFragmentRedux.CatchingFishDaggerWebsocket;
                        catchingFishNavigationMVVM2 = CatchingFishNavigationMVVM.CatchingFishViewModelFAB;
                    }
                } else {
                    if (i2 < 28) {
                        throw new IllegalStateException();
                    }
                    signingInfo = packageInfo.signingInfo;
                    if (signingInfo != null) {
                        hasMultipleSigners = signingInfo.hasMultipleSigners();
                        if (!hasMultipleSigners) {
                            signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                            if (signingCertificateHistory != null) {
                                CatchingFishMoshiParcelable catchingFishMoshiParcelable3 = CatchingFishFragmentRedux.CatchingFishDaggerWebsocket;
                                Object[] objArr2 = new Object[4];
                                signingCertificateHistory2 = signingInfo.getSigningCertificateHistory();
                                int length = signingCertificateHistory2.length;
                                int i3 = 0;
                                int i4 = 0;
                                while (i3 < length) {
                                    byte[] byteArray = signingCertificateHistory2[i3].toByteArray();
                                    byteArray.getClass();
                                    int length2 = objArr2.length;
                                    int i5 = i4 + 1;
                                    if (i5 < 0) {
                                        throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
                                    }
                                    if (i5 <= length2) {
                                        i = length2;
                                    } else {
                                        i = (length2 >> 1) + length2 + 1;
                                        if (i < i5) {
                                            int highestOneBit = Integer.highestOneBit(i4);
                                            i = highestOneBit + highestOneBit;
                                        }
                                        if (i < 0) {
                                            i = Integer.MAX_VALUE;
                                        }
                                    }
                                    if (i > length2) {
                                        objArr2 = Arrays.copyOf(objArr2, i);
                                    }
                                    objArr2[i4] = byteArray;
                                    i3++;
                                    i4 = i5;
                                }
                                catchingFishNavigationMVVM2 = i4 == 0 ? CatchingFishNavigationMVVM.CatchingFishViewModelFAB : new CatchingFishNavigationMVVM(i4, objArr2);
                            }
                        }
                    }
                    CatchingFishMoshiParcelable catchingFishMoshiParcelable4 = CatchingFishFragmentRedux.CatchingFishDaggerWebsocket;
                    catchingFishNavigationMVVM2 = CatchingFishNavigationMVVM.CatchingFishViewModelFAB;
                }
            } catch (IllegalArgumentException unused) {
                if ((z ? CatchingFishUnitTesting(packageInfo, CatchingFishMVVMGradle.CatchingFishParcelableFAB) : CatchingFishUnitTesting(packageInfo, CatchingFishMVVMGradle.CatchingFishParcelableFAB[0])) != null) {
                }
            }
            if (catchingFishNavigationMVVM2.isEmpty()) {
                throw new IllegalArgumentException("Unable to obtain package certificate history.");
            }
            CatchingFishFragmentRedux CatchingFishWorkManager2 = catchingFishNavigationMVVM2.CatchingFishWorkManager();
            int size = CatchingFishWorkManager2.size();
            int i6 = 0;
            while (i6 < size) {
                byte[] bArr2 = (byte[]) CatchingFishWorkManager2.get(i6);
                CatchingFishMoshiParcelable listIterator = catchingFishNavigationMVVM.listIterator(0);
                do {
                    int i7 = i6 + 1;
                    if (listIterator.hasNext()) {
                    }
                } while (!Arrays.equals(bArr2, (byte[]) listIterator.next()));
                return true;
            }
        }
        return false;
    }

    public static CatchingFishMoshiHilt CatchingFishUnitTesting(PackageInfo packageInfo, CatchingFishMoshiHilt... catchingFishMoshiHiltArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null || signatureArr.length != 1) {
            return null;
        }
        CatchingFishLayoutGson catchingFishLayoutGson = new CatchingFishLayoutGson(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < catchingFishMoshiHiltArr.length; i++) {
            if (catchingFishMoshiHiltArr[i].equals(catchingFishLayoutGson)) {
                return catchingFishMoshiHiltArr[i];
            }
        }
        return null;
    }

    @Override // kotlin.text.CatchingFishMVVMView
    public void CatchingFishCloudMessaging(CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB) {
        while (catchingFishFABStripeAPIFAB != null) {
            if (catchingFishFABStripeAPIFAB instanceof CatchingFishAdMobPicasso) {
                CatchingFishJUnitLayout catchingFishJUnitLayout = ((CatchingFishAdMobPicasso) catchingFishFABStripeAPIFAB).CatchingFishNavigation;
                CatchingFishFirebaseDagger.CatchingFishStateLiveData(catchingFishJUnitLayout, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
                ((CatchingFishRealmStateFlow) catchingFishJUnitLayout).CatchingFishReduxKtor.getClass();
            }
            catchingFishFABStripeAPIFAB = null;
        }
    }

    @Override // kotlin.text.CatchingFishAdMobLayout
    public long CatchingFishCoroutine(long j, long j2) {
        if (Float.intBitsToFloat((int) (j >> 32)) <= Float.intBitsToFloat((int) (j2 >> 32)) && Float.intBitsToFloat((int) (j & 4294967295L)) <= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            long floatToRawIntBits = (Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L);
            int i = CatchingFishPicassoAndroidX.CatchingFishParcelableFAB;
            return floatToRawIntBits;
        }
        float CatchingFishViewModelScope2 = CatchingFishXMLLayoutGlide.CatchingFishViewModelScope(j, j2);
        long floatToRawIntBits2 = (Float.floatToRawIntBits(CatchingFishViewModelScope2) << 32) | (Float.floatToRawIntBits(CatchingFishViewModelScope2) & 4294967295L);
        int i2 = CatchingFishPicassoAndroidX.CatchingFishParcelableFAB;
        return floatToRawIntBits2;
    }

    @Override // kotlin.text.CatchingFishMockkService
    public Typeface CatchingFishDaggerWebsocket(CatchingFishFragmentToolbar catchingFishFragmentToolbar, int i) {
        Typeface create;
        if (i == 0 && CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishFragmentToolbar, CatchingFishFragmentToolbar.CatchingFishWorkManager)) {
            return Typeface.DEFAULT;
        }
        create = Typeface.create(Typeface.DEFAULT, catchingFishFragmentToolbar.CatchingFishReduxKtor, i == 1);
        return create;
    }

    @Override // kotlin.text.CatchingFishMVVMView
    public void CatchingFishLayout(CatchingFishBiometricRoom catchingFishBiometricRoom, long j, CatchingFishStripeAPIOkHttp catchingFishStripeAPIOkHttp, int i, boolean z) {
        catchingFishBiometricRoom.CatchingFishDaggerHiltFAB(j, catchingFishStripeAPIOkHttp, i, z);
    }

    @Override // kotlin.text.CatchingFishFluxToolbar
    public byte[] CatchingFishParcelableFAB(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    @Override // kotlin.text.CatchingFishMVVMView
    public int CatchingFishReduxKtor() {
        return 16;
    }

    @Override // kotlin.text.CatchingFishMVVMView
    public boolean CatchingFishViewModelFAB(CatchingFishBiometricRoom catchingFishBiometricRoom) {
        return true;
    }

    @Override // kotlin.text.CatchingFishDaggerAdMob
    public boolean CatchingFishViewModelScope(CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob) {
        return false;
    }

    @Override // kotlin.text.CatchingFishMockkAsyncTask
    public Object CatchingFishWorkManager(CatchingFishViewWorkManager catchingFishViewWorkManager) {
        Object CatchingFishWorkManager2 = catchingFishViewWorkManager.CatchingFishWorkManager(new CatchingFishFABDagger(CatchingFishPayPalMoshi.class, Executor.class));
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(CatchingFishWorkManager2, "get(...)");
        return new CatchingFishGradleMVP((Executor) CatchingFishWorkManager2);
    }

    @Override // kotlin.text.CatchingFishHandlerMVP
    public Object get() {
        CatchingFishMoshiGson catchingFishMoshiGson = new CatchingFishMoshiGson();
        HashMap hashMap = new HashMap();
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        hashMap.put(CatchingFishContextMVI.CatchingFishReduxKtor, new CatchingFishWorkManagerView(30000L, 86400000L, set));
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        hashMap.put(CatchingFishContextMVI.CatchingFishWorkManager, new CatchingFishWorkManagerView(1000L, 86400000L, set));
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(CatchingFishPicassoGraphQL.CatchingFishDaggerWebsocket)));
        if (unmodifiableSet == null) {
            throw new NullPointerException("Null flags");
        }
        hashMap.put(CatchingFishContextMVI.CatchingFishDaggerWebsocket, new CatchingFishWorkManagerView(86400000L, 86400000L, unmodifiableSet));
        if (hashMap.keySet().size() < CatchingFishContextMVI.values().length) {
            throw new IllegalStateException("Not all priorities have been configured");
        }
        new HashMap();
        return new CatchingFishKtorAsyncTask(catchingFishMoshiGson, hashMap);
    }

    public String toString() {
        switch (this.CatchingFishReduxKtor) {
            case 16:
                return "CompositionErrorContext";
            case 28:
                return "SharingStarted.Eagerly";
            default:
                return super.toString();
        }
    }

    public CatchingFishMoshiFluxMoshi(RecyclerView recyclerView) {
        this.CatchingFishReduxKtor = 26;
    }

    @Override // kotlin.text.CatchingFishDaggerAdMob
    public void CatchingFishSnackbar(CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob, boolean z) {
    }
}
