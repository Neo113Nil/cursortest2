package kotlin.text;

import com.adjust.sdk.Constants;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class CatchingFishAndroidXGson implements CatchingFishSnackbarWidget {
    public final HashMap CatchingFishCoroutine;
    public final CatchingFishServiceAndroidX CatchingFishDaggerWebsocket = new CatchingFishServiceAndroidX(this);
    public OutputStream CatchingFishParcelableFAB;
    public final CatchingFishMVPStripeAPI CatchingFishReduxKtor;
    public final HashMap CatchingFishSnackbar;
    public static final Charset CatchingFishWorkManager = Charset.forName(Constants.ENCODING);
    public static final CatchingFishViewPagerJUnit CatchingFishViewModelScope = new CatchingFishViewPagerJUnit("key", CatchingFishMVPLiveData.CatchingFishNavigation(CatchingFishMVPLiveData.CatchingFishRoomDatabase(CatchingFishGradleHilt.class, new CatchingFishViewModelKtor(1))));
    public static final CatchingFishViewPagerJUnit CatchingFishViewModelFAB = new CatchingFishViewPagerJUnit("value", CatchingFishMVPLiveData.CatchingFishNavigation(CatchingFishMVPLiveData.CatchingFishRoomDatabase(CatchingFishGradleHilt.class, new CatchingFishViewModelKtor(2))));
    public static final CatchingFishCoroutineBundle CatchingFishLayout = new CatchingFishCoroutineBundle(1);

    public CatchingFishAndroidXGson(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, CatchingFishMVPStripeAPI catchingFishMVPStripeAPI) {
        this.CatchingFishParcelableFAB = byteArrayOutputStream;
        this.CatchingFishSnackbar = hashMap;
        this.CatchingFishCoroutine = hashMap2;
        this.CatchingFishReduxKtor = catchingFishMVPStripeAPI;
    }

    public static int CatchingFishViewModelScope(CatchingFishViewPagerJUnit catchingFishViewPagerJUnit) {
        CatchingFishGradleHilt catchingFishGradleHilt = (CatchingFishGradleHilt) ((Annotation) catchingFishViewPagerJUnit.CatchingFishSnackbar.get(CatchingFishGradleHilt.class));
        if (catchingFishGradleHilt != null) {
            return ((CatchingFishViewModelKtor) catchingFishGradleHilt).CatchingFishParcelableFAB;
        }
        throw new CatchingFishStripeAPIWidget("Field has no @Protobuf config");
    }

    @Override // kotlin.text.CatchingFishSnackbarWidget
    public final CatchingFishSnackbarWidget CatchingFishCoroutine(CatchingFishViewPagerJUnit catchingFishViewPagerJUnit, int i) {
        CatchingFishParcelableFAB(catchingFishViewPagerJUnit, i, true);
        return this;
    }

    @Override // kotlin.text.CatchingFishSnackbarWidget
    public final CatchingFishSnackbarWidget CatchingFishDaggerWebsocket(CatchingFishViewPagerJUnit catchingFishViewPagerJUnit, Object obj) {
        CatchingFishSnackbar(catchingFishViewPagerJUnit, obj, true);
        return this;
    }

    public final void CatchingFishLayout(long j) {
        while (((-128) & j) != 0) {
            this.CatchingFishParcelableFAB.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.CatchingFishParcelableFAB.write(((int) j) & 127);
    }

    public final void CatchingFishParcelableFAB(CatchingFishViewPagerJUnit catchingFishViewPagerJUnit, int i, boolean z) {
        if (z && i == 0) {
            return;
        }
        CatchingFishGradleHilt catchingFishGradleHilt = (CatchingFishGradleHilt) ((Annotation) catchingFishViewPagerJUnit.CatchingFishSnackbar.get(CatchingFishGradleHilt.class));
        if (catchingFishGradleHilt == null) {
            throw new CatchingFishStripeAPIWidget("Field has no @Protobuf config");
        }
        CatchingFishViewModelFAB(((CatchingFishViewModelKtor) catchingFishGradleHilt).CatchingFishParcelableFAB << 3);
        CatchingFishViewModelFAB(i);
    }

    @Override // kotlin.text.CatchingFishSnackbarWidget
    public final CatchingFishSnackbarWidget CatchingFishReduxKtor(CatchingFishViewPagerJUnit catchingFishViewPagerJUnit, long j) {
        if (j == 0) {
            return this;
        }
        CatchingFishGradleHilt catchingFishGradleHilt = (CatchingFishGradleHilt) ((Annotation) catchingFishViewPagerJUnit.CatchingFishSnackbar.get(CatchingFishGradleHilt.class));
        if (catchingFishGradleHilt == null) {
            throw new CatchingFishStripeAPIWidget("Field has no @Protobuf config");
        }
        CatchingFishViewModelFAB(((CatchingFishViewModelKtor) catchingFishGradleHilt).CatchingFishParcelableFAB << 3);
        CatchingFishLayout(j);
        return this;
    }

    public final void CatchingFishSnackbar(CatchingFishViewPagerJUnit catchingFishViewPagerJUnit, Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            CatchingFishViewModelFAB((CatchingFishViewModelScope(catchingFishViewPagerJUnit) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(CatchingFishWorkManager);
            CatchingFishViewModelFAB(bytes.length);
            this.CatchingFishParcelableFAB.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                CatchingFishSnackbar(catchingFishViewPagerJUnit, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                CatchingFishWorkManager(CatchingFishLayout, catchingFishViewPagerJUnit, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (z && doubleValue == 0.0d) {
                return;
            }
            CatchingFishViewModelFAB((CatchingFishViewModelScope(catchingFishViewPagerJUnit) << 3) | 1);
            this.CatchingFishParcelableFAB.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(doubleValue).array());
            return;
        }
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (z && floatValue == 0.0f) {
                return;
            }
            CatchingFishViewModelFAB((CatchingFishViewModelScope(catchingFishViewPagerJUnit) << 3) | 5);
            this.CatchingFishParcelableFAB.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
            return;
        }
        if (obj instanceof Number) {
            long longValue = ((Number) obj).longValue();
            if (z && longValue == 0) {
                return;
            }
            CatchingFishGradleHilt catchingFishGradleHilt = (CatchingFishGradleHilt) ((Annotation) catchingFishViewPagerJUnit.CatchingFishSnackbar.get(CatchingFishGradleHilt.class));
            if (catchingFishGradleHilt == null) {
                throw new CatchingFishStripeAPIWidget("Field has no @Protobuf config");
            }
            CatchingFishViewModelFAB(((CatchingFishViewModelKtor) catchingFishGradleHilt).CatchingFishParcelableFAB << 3);
            CatchingFishLayout(longValue);
            return;
        }
        if (obj instanceof Boolean) {
            CatchingFishParcelableFAB(catchingFishViewPagerJUnit, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            CatchingFishViewModelFAB((CatchingFishViewModelScope(catchingFishViewPagerJUnit) << 3) | 2);
            CatchingFishViewModelFAB(bArr.length);
            this.CatchingFishParcelableFAB.write(bArr);
            return;
        }
        CatchingFishMVPStripeAPI catchingFishMVPStripeAPI = (CatchingFishMVPStripeAPI) this.CatchingFishSnackbar.get(obj.getClass());
        if (catchingFishMVPStripeAPI != null) {
            CatchingFishWorkManager(catchingFishMVPStripeAPI, catchingFishViewPagerJUnit, obj, z);
            return;
        }
        CatchingFishContextRealmMVI catchingFishContextRealmMVI = (CatchingFishContextRealmMVI) this.CatchingFishCoroutine.get(obj.getClass());
        if (catchingFishContextRealmMVI != null) {
            CatchingFishServiceAndroidX catchingFishServiceAndroidX = this.CatchingFishDaggerWebsocket;
            catchingFishServiceAndroidX.CatchingFishParcelableFAB = false;
            catchingFishServiceAndroidX.CatchingFishCoroutine = catchingFishViewPagerJUnit;
            catchingFishServiceAndroidX.CatchingFishSnackbar = z;
            catchingFishContextRealmMVI.CatchingFishParcelableFAB(obj, catchingFishServiceAndroidX);
            return;
        }
        if (obj instanceof CatchingFishBundleAdMob) {
            CatchingFishParcelableFAB(catchingFishViewPagerJUnit, ((CatchingFishBundleAdMob) obj).CatchingFishParcelableFAB(), true);
        } else if (obj instanceof Enum) {
            CatchingFishParcelableFAB(catchingFishViewPagerJUnit, ((Enum) obj).ordinal(), true);
        } else {
            CatchingFishWorkManager(this.CatchingFishReduxKtor, catchingFishViewPagerJUnit, obj, z);
        }
    }

    public final void CatchingFishViewModelFAB(int i) {
        while ((i & (-128)) != 0) {
            this.CatchingFishParcelableFAB.write((i & 127) | 128);
            i >>>= 7;
        }
        this.CatchingFishParcelableFAB.write(i & 127);
    }

    public final void CatchingFishWorkManager(CatchingFishMVPStripeAPI catchingFishMVPStripeAPI, CatchingFishViewPagerJUnit catchingFishViewPagerJUnit, Object obj, boolean z) {
        CatchingFishViewModelPayPal catchingFishViewModelPayPal = new CatchingFishViewModelPayPal();
        catchingFishViewModelPayPal.CatchingFishReduxKtor = 0L;
        try {
            OutputStream outputStream = this.CatchingFishParcelableFAB;
            this.CatchingFishParcelableFAB = catchingFishViewModelPayPal;
            try {
                catchingFishMVPStripeAPI.CatchingFishParcelableFAB(obj, this);
                this.CatchingFishParcelableFAB = outputStream;
                long j = catchingFishViewModelPayPal.CatchingFishReduxKtor;
                catchingFishViewModelPayPal.close();
                if (z && j == 0) {
                    return;
                }
                CatchingFishViewModelFAB((CatchingFishViewModelScope(catchingFishViewPagerJUnit) << 3) | 2);
                CatchingFishLayout(j);
                catchingFishMVPStripeAPI.CatchingFishParcelableFAB(obj, this);
            } catch (Throwable th) {
                this.CatchingFishParcelableFAB = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                catchingFishViewModelPayPal.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
