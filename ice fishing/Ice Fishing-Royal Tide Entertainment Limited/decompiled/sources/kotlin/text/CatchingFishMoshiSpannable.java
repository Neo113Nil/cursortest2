package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final class CatchingFishMoshiSpannable extends CatchingFishJUnitSharedFlow {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final CatchingFishMoshiSpannable DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile CatchingFishFirebaseAdMob PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    static {
        CatchingFishMoshiSpannable catchingFishMoshiSpannable = new CatchingFishMoshiSpannable();
        DEFAULT_INSTANCE = catchingFishMoshiSpannable;
        CatchingFishJUnitSharedFlow.CatchingFishFragmentHandler(CatchingFishMoshiSpannable.class, catchingFishMoshiSpannable);
    }

    public static void CatchingFish(CatchingFishMoshiSpannable catchingFishMoshiSpannable, int i) {
        catchingFishMoshiSpannable.valueCase_ = 3;
        catchingFishMoshiSpannable.value_ = Integer.valueOf(i);
    }

    public static void CatchingFishAnimationMockk(CatchingFishMoshiSpannable catchingFishMoshiSpannable, double d) {
        catchingFishMoshiSpannable.valueCase_ = 7;
        catchingFishMoshiSpannable.value_ = Double.valueOf(d);
    }

    public static CatchingFishRealmGson CatchingFishCustomView() {
        return (CatchingFishRealmGson) ((CatchingFishNavigationFlux) DEFAULT_INSTANCE.CatchingFishCoroutine(5));
    }

    public static CatchingFishMoshiSpannable CatchingFishDaggerHiltFAB() {
        return DEFAULT_INSTANCE;
    }

    public static void CatchingFishEspressoTesting(CatchingFishMoshiSpannable catchingFishMoshiSpannable, long j) {
        catchingFishMoshiSpannable.valueCase_ = 4;
        catchingFishMoshiSpannable.value_ = Long.valueOf(j);
    }

    public static void CatchingFishNavigation(CatchingFishMoshiSpannable catchingFishMoshiSpannable, float f) {
        catchingFishMoshiSpannable.valueCase_ = 2;
        catchingFishMoshiSpannable.value_ = Float.valueOf(f);
    }

    public static void CatchingFishOkHttp(CatchingFishMoshiSpannable catchingFishMoshiSpannable, String str) {
        catchingFishMoshiSpannable.getClass();
        str.getClass();
        catchingFishMoshiSpannable.valueCase_ = 5;
        catchingFishMoshiSpannable.value_ = str;
    }

    public static void CatchingFishRoomDatabase(CatchingFishMoshiSpannable catchingFishMoshiSpannable, boolean z) {
        catchingFishMoshiSpannable.valueCase_ = 1;
        catchingFishMoshiSpannable.value_ = Boolean.valueOf(z);
    }

    public static void CatchingFishStateLiveData(CatchingFishMoshiSpannable catchingFishMoshiSpannable, CatchingFishCameraXRealm catchingFishCameraXRealm) {
        catchingFishMoshiSpannable.getClass();
        catchingFishMoshiSpannable.valueCase_ = 8;
        catchingFishMoshiSpannable.value_ = catchingFishCameraXRealm;
    }

    public static void CatchingFishUnitTesting(CatchingFishMoshiSpannable catchingFishMoshiSpannable, CatchingFishMVPFirebase catchingFishMVPFirebase) {
        catchingFishMoshiSpannable.getClass();
        catchingFishMoshiSpannable.value_ = catchingFishMVPFirebase;
        catchingFishMoshiSpannable.valueCase_ = 6;
    }

    public final long CatchingFishCardViewRealm() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public final CatchingFishMVPFirebase CatchingFishCardViewView() {
        return this.valueCase_ == 6 ? (CatchingFishMVPFirebase) this.value_ : CatchingFishMVPFirebase.CatchingFishOkHttp();
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
                return new CatchingFishAndroidXContext(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", CatchingFishMVPFirebase.class});
            case 3:
                return new CatchingFishMoshiSpannable();
            case 4:
                return new CatchingFishRealmGson(DEFAULT_INSTANCE);
            case STRING_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case STRING_SET_FIELD_NUMBER /* 6 */:
                CatchingFishFirebaseAdMob catchingFishFirebaseAdMob2 = PARSER;
                if (catchingFishFirebaseAdMob2 != null) {
                    return catchingFishFirebaseAdMob2;
                }
                synchronized (CatchingFishMoshiSpannable.class) {
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

    public final CatchingFishCameraXRealm CatchingFishCoroutineFlow() {
        return this.valueCase_ == 8 ? (CatchingFishCameraXRealm) this.value_ : CatchingFishCameraXRealm.CatchingFishWorkManager;
    }

    public final int CatchingFishGsonAppCompat() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public final boolean CatchingFishJetpackCompose() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final int CatchingFishMVPRobolectric() {
        switch (this.valueCase_) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return 9;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case STRING_FIELD_NUMBER /* 5 */:
                return 5;
            case STRING_SET_FIELD_NUMBER /* 6 */:
                return 6;
            case DOUBLE_FIELD_NUMBER /* 7 */:
                return 7;
            case BYTES_FIELD_NUMBER /* 8 */:
                return 8;
            default:
                return 0;
        }
    }

    public final float CatchingFishParcelableFlux() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public final String CatchingFishPayPal() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public final double CatchingFishSpannableWidget() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }
}
