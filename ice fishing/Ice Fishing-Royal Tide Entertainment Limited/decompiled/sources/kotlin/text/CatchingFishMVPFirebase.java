package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class CatchingFishMVPFirebase extends CatchingFishJUnitSharedFlow {
    private static final CatchingFishMVPFirebase DEFAULT_INSTANCE;
    private static volatile CatchingFishFirebaseAdMob PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private CatchingFishManifestRedux strings_ = CatchingFishViewPagerLayout.CatchingFishViewModelScope;

    static {
        CatchingFishMVPFirebase catchingFishMVPFirebase = new CatchingFishMVPFirebase();
        DEFAULT_INSTANCE = catchingFishMVPFirebase;
        CatchingFishJUnitSharedFlow.CatchingFishFragmentHandler(CatchingFishMVPFirebase.class, catchingFishMVPFirebase);
    }

    public static CatchingFishJUnitNavigation CatchingFishAnimationMockk() {
        return (CatchingFishJUnitNavigation) ((CatchingFishNavigationFlux) DEFAULT_INSTANCE.CatchingFishCoroutine(5));
    }

    public static void CatchingFishEspressoTesting(CatchingFishMVPFirebase catchingFishMVPFirebase, Iterable iterable) {
        CatchingFishManifestRedux catchingFishManifestRedux = catchingFishMVPFirebase.strings_;
        if (!((CatchingFishNavigation) catchingFishManifestRedux).CatchingFishReduxKtor) {
            CatchingFishViewPagerLayout catchingFishViewPagerLayout = (CatchingFishViewPagerLayout) catchingFishManifestRedux;
            int i = catchingFishViewPagerLayout.CatchingFishWorkManager;
            catchingFishMVPFirebase.strings_ = catchingFishViewPagerLayout.CatchingFishCoroutine(i == 0 ? 10 : i * 2);
        }
        RandomAccess randomAccess = catchingFishMVPFirebase.strings_;
        Charset charset = CatchingFishFirebaseBundle.CatchingFishParcelableFAB;
        iterable.getClass();
        if (iterable instanceof CatchingFishGsonJUnitMockk) {
            List CatchingFishReduxKtor = ((CatchingFishGsonJUnitMockk) iterable).CatchingFishReduxKtor();
            if (randomAccess != null) {
                throw new ClassCastException();
            }
            ((CatchingFishViewPagerLayout) randomAccess).getClass();
            Iterator it = CatchingFishReduxKtor.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                if (next instanceof CatchingFishCameraXRealm) {
                    throw null;
                }
                if (!(next instanceof byte[])) {
                    throw null;
                }
                byte[] bArr = (byte[]) next;
                CatchingFishCameraXRealm.CatchingFishCoroutine(bArr, 0, bArr.length);
                throw null;
            }
            return;
        }
        if (iterable instanceof CatchingFishGlideHiltMockk) {
            ((CatchingFishNavigation) randomAccess).addAll((Collection) iterable);
            return;
        }
        if ((randomAccess instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) randomAccess).ensureCapacity(((Collection) iterable).size() + ((CatchingFishViewPagerLayout) randomAccess).CatchingFishWorkManager);
        }
        CatchingFishViewPagerLayout catchingFishViewPagerLayout2 = (CatchingFishViewPagerLayout) randomAccess;
        int i2 = catchingFishViewPagerLayout2.CatchingFishWorkManager;
        for (Object obj : iterable) {
            if (obj == null) {
                String str = "Element at index " + (catchingFishViewPagerLayout2.CatchingFishWorkManager - i2) + " is null.";
                for (int i3 = catchingFishViewPagerLayout2.CatchingFishWorkManager - 1; i3 >= i2; i3--) {
                    catchingFishViewPagerLayout2.remove(i3);
                }
                throw new NullPointerException(str);
            }
            catchingFishViewPagerLayout2.add(obj);
        }
    }

    public static CatchingFishMVPFirebase CatchingFishOkHttp() {
        return DEFAULT_INSTANCE;
    }

    @Override // kotlin.text.CatchingFishJUnitSharedFlow
    public final Object CatchingFishCoroutine(int i) {
        CatchingFishFirebaseAdMob catchingFishFirebaseAdMob;
        switch (CatchingFishMVPLiveData.CatchingFishParcelableFlux(i)) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new CatchingFishAndroidXContext(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new CatchingFishMVPFirebase();
            case 4:
                return new CatchingFishJUnitNavigation(DEFAULT_INSTANCE);
            case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                CatchingFishFirebaseAdMob catchingFishFirebaseAdMob2 = PARSER;
                if (catchingFishFirebaseAdMob2 != null) {
                    return catchingFishFirebaseAdMob2;
                }
                synchronized (CatchingFishMVPFirebase.class) {
                    try {
                        catchingFishFirebaseAdMob = PARSER;
                        if (catchingFishFirebaseAdMob == null) {
                            catchingFishFirebaseAdMob = new CatchingFishFirebaseView();
                            PARSER = catchingFishFirebaseAdMob;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return catchingFishFirebaseAdMob;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final CatchingFishManifestRedux CatchingFishUnitTesting() {
        return this.strings_;
    }
}
