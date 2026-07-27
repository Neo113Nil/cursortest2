package kotlin.text;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.BufferedWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class CatchingFishMVIRoomView implements CatchingFishSnackbarWidget, CatchingFishManifestGlide {
    public final Map CatchingFishCoroutine;
    public final CatchingFishMVPStripeAPI CatchingFishDaggerWebsocket;
    public final boolean CatchingFishParcelableFAB = true;
    public final Map CatchingFishReduxKtor;
    public final JsonWriter CatchingFishSnackbar;
    public final boolean CatchingFishWorkManager;

    public CatchingFishMVIRoomView(BufferedWriter bufferedWriter, HashMap hashMap, HashMap hashMap2, CatchingFishCoroutineBundle catchingFishCoroutineBundle, boolean z) {
        this.CatchingFishSnackbar = new JsonWriter(bufferedWriter);
        this.CatchingFishCoroutine = hashMap;
        this.CatchingFishReduxKtor = hashMap2;
        this.CatchingFishDaggerWebsocket = catchingFishCoroutineBundle;
        this.CatchingFishWorkManager = z;
    }

    @Override // kotlin.text.CatchingFishSnackbarWidget
    public final CatchingFishSnackbarWidget CatchingFishCoroutine(CatchingFishViewPagerJUnit catchingFishViewPagerJUnit, int i) {
        String str = catchingFishViewPagerJUnit.CatchingFishParcelableFAB;
        CatchingFishViewModelFAB();
        JsonWriter jsonWriter = this.CatchingFishSnackbar;
        jsonWriter.name(str);
        CatchingFishViewModelFAB();
        jsonWriter.value(i);
        return this;
    }

    @Override // kotlin.text.CatchingFishSnackbarWidget
    public final CatchingFishSnackbarWidget CatchingFishDaggerWebsocket(CatchingFishViewPagerJUnit catchingFishViewPagerJUnit, Object obj) {
        CatchingFishViewModelScope(obj, catchingFishViewPagerJUnit.CatchingFishParcelableFAB);
        return this;
    }

    @Override // kotlin.text.CatchingFishManifestGlide
    public final CatchingFishManifestGlide CatchingFishParcelableFAB(String str) {
        CatchingFishViewModelFAB();
        this.CatchingFishSnackbar.value(str);
        return this;
    }

    @Override // kotlin.text.CatchingFishSnackbarWidget
    public final CatchingFishSnackbarWidget CatchingFishReduxKtor(CatchingFishViewPagerJUnit catchingFishViewPagerJUnit, long j) {
        String str = catchingFishViewPagerJUnit.CatchingFishParcelableFAB;
        CatchingFishViewModelFAB();
        JsonWriter jsonWriter = this.CatchingFishSnackbar;
        jsonWriter.name(str);
        CatchingFishViewModelFAB();
        jsonWriter.value(j);
        return this;
    }

    @Override // kotlin.text.CatchingFishManifestGlide
    public final CatchingFishManifestGlide CatchingFishSnackbar(boolean z) {
        CatchingFishViewModelFAB();
        this.CatchingFishSnackbar.value(z);
        return this;
    }

    public final void CatchingFishViewModelFAB() {
        if (!this.CatchingFishParcelableFAB) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }

    public final CatchingFishMVIRoomView CatchingFishViewModelScope(Object obj, String str) {
        boolean z = this.CatchingFishWorkManager;
        JsonWriter jsonWriter = this.CatchingFishSnackbar;
        if (z) {
            if (obj == null) {
                return this;
            }
            CatchingFishViewModelFAB();
            jsonWriter.name(str);
            CatchingFishWorkManager(obj);
            return this;
        }
        CatchingFishViewModelFAB();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        CatchingFishWorkManager(obj);
        return this;
    }

    public final CatchingFishMVIRoomView CatchingFishWorkManager(Object obj) {
        JsonWriter jsonWriter = this.CatchingFishSnackbar;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                jsonWriter.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    CatchingFishWorkManager(it.next());
                }
                jsonWriter.endArray();
                return this;
            }
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        CatchingFishViewModelScope(entry.getValue(), (String) key);
                    } catch (ClassCastException e) {
                        throw new CatchingFishStripeAPIWidget(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            CatchingFishMVPStripeAPI catchingFishMVPStripeAPI = (CatchingFishMVPStripeAPI) this.CatchingFishCoroutine.get(obj.getClass());
            if (catchingFishMVPStripeAPI != null) {
                jsonWriter.beginObject();
                catchingFishMVPStripeAPI.CatchingFishParcelableFAB(obj, this);
                jsonWriter.endObject();
                return this;
            }
            CatchingFishContextRealmMVI catchingFishContextRealmMVI = (CatchingFishContextRealmMVI) this.CatchingFishReduxKtor.get(obj.getClass());
            if (catchingFishContextRealmMVI != null) {
                catchingFishContextRealmMVI.CatchingFishParcelableFAB(obj, this);
                return this;
            }
            if (obj instanceof Enum) {
                String name = ((Enum) obj).name();
                CatchingFishViewModelFAB();
                jsonWriter.value(name);
                return this;
            }
            jsonWriter.beginObject();
            this.CatchingFishDaggerWebsocket.CatchingFishParcelableFAB(obj, this);
            jsonWriter.endObject();
            return this;
        }
        if (obj instanceof byte[]) {
            CatchingFishViewModelFAB();
            jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
            return this;
        }
        jsonWriter.beginArray();
        int i = 0;
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i < length) {
                jsonWriter.value(r6[i]);
                i++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i < length2) {
                long j = jArr[i];
                CatchingFishViewModelFAB();
                jsonWriter.value(j);
                i++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i < length3) {
                jsonWriter.value(dArr[i]);
                i++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i < length4) {
                jsonWriter.value(zArr[i]);
                i++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i < length5) {
                CatchingFishWorkManager(numberArr[i]);
                i++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i < length6) {
                CatchingFishWorkManager(objArr[i]);
                i++;
            }
        }
        jsonWriter.endArray();
        return this;
    }
}
