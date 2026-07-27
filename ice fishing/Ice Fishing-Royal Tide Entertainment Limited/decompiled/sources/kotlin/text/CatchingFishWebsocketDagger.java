package kotlin.text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class CatchingFishWebsocketDagger implements CharSequence {
    public final String CatchingFishDaggerWebsocket;
    public final List CatchingFishReduxKtor;
    public final ArrayList CatchingFishWorkManager;

    static {
        CatchingFishViewModelIntent catchingFishViewModelIntent = CatchingFishParcelableFlux.CatchingFishParcelableFAB;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d2, code lost:
    
        r2.CatchingFishParcelableFAB(r3.CatchingFishCoroutine);
        r10 = r10 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CatchingFishWebsocketDagger(String str, List list) {
        ArrayList arrayList;
        ArrayList arrayList2;
        List list2;
        this.CatchingFishReduxKtor = list;
        this.CatchingFishDaggerWebsocket = str;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i = 0; i < size; i++) {
                CatchingFishFluxNavigation catchingFishFluxNavigation = (CatchingFishFluxNavigation) list.get(i);
                Object obj = catchingFishFluxNavigation.CatchingFishParcelableFAB;
                if (obj instanceof CatchingFishContextLayout) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(catchingFishFluxNavigation);
                } else if (obj instanceof CatchingFishCameraXMVP) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(catchingFishFluxNavigation);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.CatchingFishWorkManager = arrayList;
        int i2 = 1;
        if (arrayList2 != null) {
            CatchingFishMVVMCoroutine catchingFishMVVMCoroutine = new CatchingFishMVVMCoroutine(5);
            if (arrayList2.size() <= 1) {
                list2 = CatchingFishCameraXCameraX.CatchingFishRedux(arrayList2);
            } else {
                Object[] array = arrayList2.toArray(new Object[0]);
                CatchingFishFirebaseDagger.CatchingFishNavigation(array, "<this>");
                if (array.length > 1) {
                    Arrays.sort(array, catchingFishMVVMCoroutine);
                }
                list2 = Arrays.asList(array);
                CatchingFishFirebaseDagger.CatchingFishRoomDatabase(list2, "asList(...)");
            }
        } else {
            list2 = null;
        }
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        int i3 = ((CatchingFishFluxNavigation) CatchingFishCameraXCameraX.CatchingFishStateFlow(list2)).CatchingFishCoroutine;
        int i4 = CatchingFishRealmCameraX.CatchingFishParcelableFAB;
        CatchingFishGsonLayout catchingFishGsonLayout = new CatchingFishGsonLayout(1);
        catchingFishGsonLayout.CatchingFishParcelableFAB(i3);
        int size2 = list2.size();
        while (i2 < size2) {
            CatchingFishFluxNavigation catchingFishFluxNavigation2 = (CatchingFishFluxNavigation) list2.get(i2);
            while (true) {
                int i5 = catchingFishGsonLayout.CatchingFishSnackbar;
                if (i5 == 0) {
                    break;
                }
                if (i5 == 0) {
                    CatchingFishHiltMVPToast.CatchingFishMotionLayout("IntList is empty.");
                    throw null;
                }
                int i6 = catchingFishGsonLayout.CatchingFishParcelableFAB[i5 - 1];
                int i7 = catchingFishFluxNavigation2.CatchingFishSnackbar;
                int i8 = catchingFishFluxNavigation2.CatchingFishCoroutine;
                if (i7 >= i6) {
                    catchingFishGsonLayout.CatchingFishCoroutine(i5 - 1);
                } else if (i8 > i6) {
                    CatchingFishReduxAsyncTask.CatchingFishParcelableFAB("Paragraph overlap not allowed, end " + i8 + " should be less than or equal to " + i6);
                }
            }
        }
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.CatchingFishDaggerWebsocket.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatchingFishWebsocketDagger)) {
            return false;
        }
        CatchingFishWebsocketDagger catchingFishWebsocketDagger = (CatchingFishWebsocketDagger) obj;
        return CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishDaggerWebsocket, catchingFishWebsocketDagger.CatchingFishDaggerWebsocket) && CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishReduxKtor, catchingFishWebsocketDagger.CatchingFishReduxKtor);
    }

    public final int hashCode() {
        int hashCode = this.CatchingFishDaggerWebsocket.hashCode() * 31;
        List list = this.CatchingFishReduxKtor;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.CatchingFishDaggerWebsocket.length();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0098, code lost:
    
        if (r1.isEmpty() != false) goto L26;
     */
    @Override // java.lang.CharSequence
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence subSequence(int i, int i2) {
        ArrayList arrayList;
        if (i > i2) {
            CatchingFishReduxAsyncTask.CatchingFishParcelableFAB("start (" + i + ") should be less or equal to end (" + i2 + ')');
        }
        String str = this.CatchingFishDaggerWebsocket;
        if (i == 0 && i2 == str.length()) {
            return this;
        }
        String substring = str.substring(i, i2);
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(substring, "substring(...)");
        int i3 = CatchingFishGsonBundle.CatchingFishParcelableFAB;
        if (i > i2) {
            CatchingFishReduxAsyncTask.CatchingFishParcelableFAB("start (" + i + ") should be less than or equal to end (" + i2 + ')');
        }
        List list = this.CatchingFishReduxKtor;
        if (list != null) {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                CatchingFishFluxNavigation catchingFishFluxNavigation = (CatchingFishFluxNavigation) list.get(i4);
                int i5 = catchingFishFluxNavigation.CatchingFishSnackbar;
                int i6 = catchingFishFluxNavigation.CatchingFishCoroutine;
                if (CatchingFishGsonBundle.CatchingFishParcelableFAB(i, i2, i5, i6)) {
                    arrayList.add(new CatchingFishFluxNavigation(catchingFishFluxNavigation.CatchingFishParcelableFAB, Math.max(i, catchingFishFluxNavigation.CatchingFishSnackbar) - i, Math.min(i2, i6) - i, catchingFishFluxNavigation.CatchingFishReduxKtor));
                }
            }
        }
        arrayList = null;
        return new CatchingFishWebsocketDagger(substring, arrayList);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.CatchingFishDaggerWebsocket;
    }
}
