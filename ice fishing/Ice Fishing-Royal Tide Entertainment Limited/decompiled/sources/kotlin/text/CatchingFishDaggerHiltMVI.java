package kotlin.text;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class CatchingFishDaggerHiltMVI {
    public final LinkedHashMap CatchingFishParcelableFAB;
    public final CatchingFishServiceHilt CatchingFishSnackbar;

    public CatchingFishDaggerHiltMVI(LinkedHashMap linkedHashMap, boolean z) {
        this.CatchingFishParcelableFAB = linkedHashMap;
        this.CatchingFishSnackbar = new CatchingFishServiceHilt(z);
    }

    public final void CatchingFishCoroutine(CatchingFishXMLLayoutRedux catchingFishXMLLayoutRedux) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishXMLLayoutRedux, "key");
        CatchingFishSnackbar();
        this.CatchingFishParcelableFAB.remove(catchingFishXMLLayoutRedux);
    }

    public final void CatchingFishDaggerWebsocket(CatchingFishXMLLayoutRedux catchingFishXMLLayoutRedux, Object obj) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishXMLLayoutRedux, "key");
        CatchingFishSnackbar();
        if (obj == null) {
            CatchingFishCoroutine(catchingFishXMLLayoutRedux);
            return;
        }
        boolean z = obj instanceof Set;
        LinkedHashMap linkedHashMap = this.CatchingFishParcelableFAB;
        if (z) {
            Set unmodifiableSet = Collections.unmodifiableSet(CatchingFishCameraXCameraX.CatchingFishCustomViewJUnit((Set) obj));
            CatchingFishFirebaseDagger.CatchingFishRoomDatabase(unmodifiableSet, "unmodifiableSet(set.toSet())");
            linkedHashMap.put(catchingFishXMLLayoutRedux, unmodifiableSet);
        } else {
            if (!(obj instanceof byte[])) {
                linkedHashMap.put(catchingFishXMLLayoutRedux, obj);
                return;
            }
            byte[] bArr = (byte[]) obj;
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            CatchingFishFirebaseDagger.CatchingFishRoomDatabase(copyOf, "copyOf(this, size)");
            linkedHashMap.put(catchingFishXMLLayoutRedux, copyOf);
        }
    }

    public final Map CatchingFishParcelableFAB() {
        CatchingFishGsonWorkManager catchingFishGsonWorkManager;
        Set<Map.Entry> entrySet = this.CatchingFishParcelableFAB.entrySet();
        int CatchingFishStateFlow = CatchingFishPicassoGlide.CatchingFishStateFlow(CatchingFishLayoutToast.CatchingFishParcelable(entrySet));
        if (CatchingFishStateFlow < 16) {
            CatchingFishStateFlow = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(CatchingFishStateFlow);
        for (Map.Entry entry : entrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                CatchingFishFirebaseDagger.CatchingFishRoomDatabase(copyOf, "copyOf(this, size)");
                catchingFishGsonWorkManager = new CatchingFishGsonWorkManager(key, copyOf);
            } else {
                catchingFishGsonWorkManager = new CatchingFishGsonWorkManager(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(catchingFishGsonWorkManager.CatchingFishReduxKtor, catchingFishGsonWorkManager.CatchingFishDaggerWebsocket);
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(unmodifiableMap, "unmodifiableMap(map)");
        return unmodifiableMap;
    }

    public final void CatchingFishReduxKtor(CatchingFishXMLLayoutRedux catchingFishXMLLayoutRedux, Object obj) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishXMLLayoutRedux, "key");
        CatchingFishDaggerWebsocket(catchingFishXMLLayoutRedux, obj);
    }

    public final void CatchingFishSnackbar() {
        if (((AtomicBoolean) this.CatchingFishSnackbar.CatchingFishDaggerWebsocket).get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0062 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[LOOP:0: B:10:0x002c->B:24:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z;
        if (obj instanceof CatchingFishDaggerHiltMVI) {
            CatchingFishDaggerHiltMVI catchingFishDaggerHiltMVI = (CatchingFishDaggerHiltMVI) obj;
            LinkedHashMap linkedHashMap = catchingFishDaggerHiltMVI.CatchingFishParcelableFAB;
            LinkedHashMap linkedHashMap2 = this.CatchingFishParcelableFAB;
            if (linkedHashMap != linkedHashMap2) {
                if (linkedHashMap.size() == linkedHashMap2.size()) {
                    LinkedHashMap linkedHashMap3 = catchingFishDaggerHiltMVI.CatchingFishParcelableFAB;
                    if (!linkedHashMap3.isEmpty()) {
                        for (Map.Entry entry : linkedHashMap3.entrySet()) {
                            Object obj2 = linkedHashMap2.get(entry.getKey());
                            if (obj2 != null) {
                                Object value = entry.getValue();
                                if (!(value instanceof byte[])) {
                                    z = CatchingFishFirebaseDagger.CatchingFishOkHttp(value, obj2);
                                } else if ((obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2)) {
                                    z = true;
                                }
                                if (z) {
                                }
                            }
                            z = false;
                            if (z) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = this.CatchingFishParcelableFAB.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            i += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return i;
    }

    public final String toString() {
        return CatchingFishCameraXCameraX.CatchingFishMVVMAppCompat(this.CatchingFishParcelableFAB.entrySet(), ",\n", "{\n", "\n}", CatchingFishMVI.CatchingFishParcelableFlux, 24);
    }

    public /* synthetic */ CatchingFishDaggerHiltMVI(boolean z) {
        this(new LinkedHashMap(), z);
    }
}
