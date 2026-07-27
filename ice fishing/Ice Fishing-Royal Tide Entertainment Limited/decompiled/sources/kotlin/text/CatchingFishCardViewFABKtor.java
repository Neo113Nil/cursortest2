package kotlin.text;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class CatchingFishCardViewFABKtor {
    public static final Comparator[] CatchingFishParcelableFAB;
    public static final CatchingFishLiveDataRoom CatchingFishSnackbar;

    static {
        Comparator[] comparatorArr = new Comparator[2];
        int i = 0;
        while (i < 2) {
            comparatorArr[i] = new CatchingFishCustomViewFAB(new CatchingFishCustomViewFAB(i == 0 ? CatchingFishMVVMCoroutine.CatchingFishDaggerWebsocket : CatchingFishMVVMCoroutine.CatchingFishCoroutine));
            i++;
        }
        CatchingFishParcelableFAB = comparatorArr;
        CatchingFishSnackbar = CatchingFishLiveDataRoom.CatchingFishSensorManager;
    }

    public static final void CatchingFishParcelableFAB(CatchingFishMVIGraphQLHilt catchingFishMVIGraphQLHilt, ArrayList arrayList, CatchingFishMVVM catchingFishMVVM, CatchingFishMVVM catchingFishMVVM2, CatchingFishLayoutGsonRoom catchingFishLayoutGsonRoom) {
        CatchingFishMVPMotionLayout catchingFishMVPMotionLayout = catchingFishMVIGraphQLHilt.CatchingFishReduxKtor;
        Object CatchingFishViewModelScope = catchingFishMVPMotionLayout.CatchingFishReduxKtor.CatchingFishViewModelScope(CatchingFishServiceMVI.CatchingFishEspressoTesting);
        if (CatchingFishViewModelScope == null) {
            CatchingFishViewModelScope = Boolean.FALSE;
        }
        boolean booleanValue = ((Boolean) CatchingFishViewModelScope).booleanValue();
        if ((booleanValue || ((Boolean) catchingFishMVVM2.CatchingFishFragmentHandler(catchingFishMVIGraphQLHilt)).booleanValue()) && ((Boolean) catchingFishMVVM.CatchingFishFragmentHandler(catchingFishMVIGraphQLHilt)).booleanValue()) {
            arrayList.add(catchingFishMVIGraphQLHilt);
        }
        if (booleanValue) {
            catchingFishLayoutGsonRoom.CatchingFishViewModelFAB(catchingFishMVIGraphQLHilt.CatchingFishViewModelScope, CatchingFishSnackbar(catchingFishMVIGraphQLHilt, catchingFishMVVM, catchingFishMVVM2, CatchingFishMVIGraphQLHilt.CatchingFishFragmentHandler(7, catchingFishMVIGraphQLHilt)));
            return;
        }
        List CatchingFishFragmentHandler = CatchingFishMVIGraphQLHilt.CatchingFishFragmentHandler(7, catchingFishMVIGraphQLHilt);
        int size = CatchingFishFragmentHandler.size();
        for (int i = 0; i < size; i++) {
            CatchingFishParcelableFAB((CatchingFishMVIGraphQLHilt) CatchingFishFragmentHandler.get(i), arrayList, catchingFishMVVM, catchingFishMVVM2, catchingFishLayoutGsonRoom);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ee A[LOOP:1: B:11:0x0044->B:29:0x00ee, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f3 A[EDGE_INSN: B:30:0x00f3->B:37:0x00f3 BREAK  A[LOOP:1: B:11:0x0044->B:29:0x00ee], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ArrayList CatchingFishSnackbar(CatchingFishMVIGraphQLHilt catchingFishMVIGraphQLHilt, CatchingFishMVVM catchingFishMVVM, CatchingFishMVVM catchingFishMVVM2, List list) {
        CatchingFishLayoutGsonRoom catchingFishLayoutGsonRoom = CatchingFishFluxCardView.CatchingFishParcelableFAB;
        CatchingFishLayoutGsonRoom catchingFishLayoutGsonRoom2 = new CatchingFishLayoutGsonRoom();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            CatchingFishParcelableFAB((CatchingFishMVIGraphQLHilt) list.get(i), arrayList, catchingFishMVVM, catchingFishMVVM2, catchingFishLayoutGsonRoom2);
        }
        char c = catchingFishMVIGraphQLHilt.CatchingFishCoroutine.CatchingFishPayPal == CatchingFishGradleMVPKtor.CatchingFishDaggerWebsocket ? (char) 1 : (char) 0;
        ArrayList arrayList2 = new ArrayList(arrayList.size() / 2);
        int CatchingFishMotionLayout = CatchingFishToastCustomView.CatchingFishMotionLayout(arrayList);
        if (CatchingFishMotionLayout >= 0) {
            int i2 = 0;
            while (true) {
                CatchingFishMVIGraphQLHilt catchingFishMVIGraphQLHilt2 = (CatchingFishMVIGraphQLHilt) arrayList.get(i2);
                if (i2 != 0) {
                    float f = catchingFishMVIGraphQLHilt2.CatchingFishViewModelFAB().CatchingFishSnackbar;
                    float f2 = catchingFishMVIGraphQLHilt2.CatchingFishViewModelFAB().CatchingFishReduxKtor;
                    boolean z = f >= f2;
                    int CatchingFishMotionLayout2 = CatchingFishToastCustomView.CatchingFishMotionLayout(arrayList2);
                    if (CatchingFishMotionLayout2 >= 0) {
                        int i3 = 0;
                        while (true) {
                            CatchingFishFluxExoPlayer catchingFishFluxExoPlayer = (CatchingFishFluxExoPlayer) ((CatchingFishGsonWorkManager) arrayList2.get(i3)).CatchingFishReduxKtor;
                            float f3 = catchingFishFluxExoPlayer.CatchingFishSnackbar;
                            float f4 = catchingFishFluxExoPlayer.CatchingFishReduxKtor;
                            boolean z2 = f3 >= f4;
                            if (!z && !z2 && Math.max(f, f3) < Math.min(f2, f4)) {
                                arrayList2.set(i3, new CatchingFishGsonWorkManager(new CatchingFishFluxExoPlayer(Math.max(catchingFishFluxExoPlayer.CatchingFishParcelableFAB, 0.0f), Math.max(catchingFishFluxExoPlayer.CatchingFishSnackbar, f), Math.min(catchingFishFluxExoPlayer.CatchingFishCoroutine, Float.POSITIVE_INFINITY), Math.min(f4, f2)), ((CatchingFishGsonWorkManager) arrayList2.get(i3)).CatchingFishDaggerWebsocket));
                                ((List) ((CatchingFishGsonWorkManager) arrayList2.get(i3)).CatchingFishDaggerWebsocket).add(catchingFishMVIGraphQLHilt2);
                                break;
                            }
                            if (i3 == CatchingFishMotionLayout2) {
                                break;
                            }
                            i3++;
                        }
                        if (i2 != CatchingFishMotionLayout) {
                            break;
                        }
                        i2++;
                    }
                }
                arrayList2.add(new CatchingFishGsonWorkManager(catchingFishMVIGraphQLHilt2.CatchingFishViewModelFAB(), new ArrayList(new CatchingFishLiveDataCameraX(new CatchingFishMVIGraphQLHilt[]{catchingFishMVIGraphQLHilt2}, true))));
                if (i2 != CatchingFishMotionLayout) {
                }
            }
        }
        CatchingFishHiltRoom.CatchingFishRecyclerView(arrayList2, CatchingFishMVVMCoroutine.CatchingFishWorkManager);
        ArrayList arrayList3 = new ArrayList();
        Comparator comparator = CatchingFishParcelableFAB[c ^ 1];
        int size2 = arrayList2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            CatchingFishGsonWorkManager catchingFishGsonWorkManager = (CatchingFishGsonWorkManager) arrayList2.get(i4);
            CatchingFishHiltRoom.CatchingFishRecyclerView((List) catchingFishGsonWorkManager.CatchingFishDaggerWebsocket, comparator);
            arrayList3.addAll((Collection) catchingFishGsonWorkManager.CatchingFishDaggerWebsocket);
        }
        CatchingFishHiltRoom.CatchingFishRecyclerView(arrayList3, new CatchingFishGradleExoPlayer(2, CatchingFishSnackbar));
        int i5 = 0;
        while (i5 <= CatchingFishToastCustomView.CatchingFishMotionLayout(arrayList3)) {
            List list2 = (List) catchingFishLayoutGsonRoom2.CatchingFishSnackbar(((CatchingFishMVIGraphQLHilt) arrayList3.get(i5)).CatchingFishViewModelScope);
            if (list2 != null) {
                if (((Boolean) catchingFishMVVM2.CatchingFishFragmentHandler(arrayList3.get(i5))).booleanValue()) {
                    i5++;
                } else {
                    arrayList3.remove(i5);
                }
                arrayList3.addAll(i5, list2);
                i5 += list2.size();
            } else {
                i5++;
            }
        }
        return arrayList3;
    }
}
