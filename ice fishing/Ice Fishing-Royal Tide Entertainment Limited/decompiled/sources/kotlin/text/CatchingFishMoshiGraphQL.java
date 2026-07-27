package kotlin.text;

import android.animation.Animator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.catchingfish.fishcatcherpro.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class CatchingFishMoshiGraphQL {
    public final ViewGroup CatchingFishParcelableFAB;
    public final ArrayList CatchingFishSnackbar = new ArrayList();
    public final ArrayList CatchingFishCoroutine = new ArrayList();
    public boolean CatchingFishReduxKtor = false;
    public boolean CatchingFishDaggerWebsocket = false;

    public CatchingFishMoshiGraphQL(ViewGroup viewGroup) {
        this.CatchingFishParcelableFAB = viewGroup;
    }

    public static CatchingFishMoshiGraphQL CatchingFishWorkManager(ViewGroup viewGroup, CatchingFishGradleMVVM catchingFishGradleMVVM) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof CatchingFishMoshiGraphQL) {
            return (CatchingFishMoshiGraphQL) tag;
        }
        catchingFishGradleMVVM.getClass();
        CatchingFishMoshiGraphQL catchingFishMoshiGraphQL = new CatchingFishMoshiGraphQL(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, catchingFishMoshiGraphQL);
        return catchingFishMoshiGraphQL;
    }

    public final void CatchingFishCoroutine() {
        if (this.CatchingFishDaggerWebsocket) {
            return;
        }
        ViewGroup viewGroup = this.CatchingFishParcelableFAB;
        WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
        if (!viewGroup.isAttachedToWindow()) {
            CatchingFishDaggerWebsocket();
            this.CatchingFishReduxKtor = false;
            return;
        }
        synchronized (this.CatchingFishSnackbar) {
            try {
                if (!this.CatchingFishSnackbar.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.CatchingFishCoroutine);
                    this.CatchingFishCoroutine.clear();
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        CatchingFishMVPDatabinding catchingFishMVPDatabinding = (CatchingFishMVPDatabinding) obj;
                        if (CatchingFishToastSharedFlow.CatchingFishFragmentFactory(2)) {
                            Objects.toString(catchingFishMVPDatabinding);
                        }
                        catchingFishMVPDatabinding.CatchingFishParcelableFAB();
                        if (!catchingFishMVPDatabinding.CatchingFishViewModelScope) {
                            this.CatchingFishCoroutine.add(catchingFishMVPDatabinding);
                        }
                    }
                    CatchingFishViewModelScope();
                    ArrayList arrayList2 = new ArrayList(this.CatchingFishSnackbar);
                    this.CatchingFishSnackbar.clear();
                    this.CatchingFishCoroutine.addAll(arrayList2);
                    int size2 = arrayList2.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj2 = arrayList2.get(i2);
                        i2++;
                        ((CatchingFishMVPDatabinding) obj2).CatchingFishReduxKtor();
                    }
                    CatchingFishSnackbar(arrayList2, this.CatchingFishReduxKtor);
                    this.CatchingFishReduxKtor = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void CatchingFishDaggerWebsocket() {
        ViewGroup viewGroup = this.CatchingFishParcelableFAB;
        WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
        boolean isAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.CatchingFishSnackbar) {
            try {
                CatchingFishViewModelScope();
                ArrayList arrayList = this.CatchingFishSnackbar;
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((CatchingFishMVPDatabinding) obj).CatchingFishReduxKtor();
                }
                ArrayList arrayList2 = new ArrayList(this.CatchingFishCoroutine);
                int size2 = arrayList2.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = arrayList2.get(i3);
                    i3++;
                    CatchingFishMVPDatabinding catchingFishMVPDatabinding = (CatchingFishMVPDatabinding) obj2;
                    if (CatchingFishToastSharedFlow.CatchingFishFragmentFactory(2)) {
                        if (!isAttachedToWindow) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Container ");
                            sb.append(this.CatchingFishParcelableFAB);
                            sb.append(" is not attached to window. ");
                        }
                        Objects.toString(catchingFishMVPDatabinding);
                    }
                    catchingFishMVPDatabinding.CatchingFishParcelableFAB();
                }
                ArrayList arrayList3 = new ArrayList(this.CatchingFishSnackbar);
                int size3 = arrayList3.size();
                while (i < size3) {
                    Object obj3 = arrayList3.get(i);
                    i++;
                    CatchingFishMVPDatabinding catchingFishMVPDatabinding2 = (CatchingFishMVPDatabinding) obj3;
                    if (CatchingFishToastSharedFlow.CatchingFishFragmentFactory(2)) {
                        if (!isAttachedToWindow) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Container ");
                            sb2.append(this.CatchingFishParcelableFAB);
                            sb2.append(" is not attached to window. ");
                        }
                        Objects.toString(catchingFishMVPDatabinding2);
                    }
                    catchingFishMVPDatabinding2.CatchingFishParcelableFAB();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void CatchingFishParcelableFAB(int i, int i2, CatchingFishStateFlowMockk catchingFishStateFlowMockk) {
        synchronized (this.CatchingFishSnackbar) {
            try {
                CatchingFishGraphQLMoshi catchingFishGraphQLMoshi = new CatchingFishGraphQLMoshi();
                CatchingFishMVPDatabinding CatchingFishReduxKtor = CatchingFishReduxKtor(catchingFishStateFlowMockk.CatchingFishCoroutine);
                if (CatchingFishReduxKtor != null) {
                    CatchingFishReduxKtor.CatchingFishCoroutine(i, i2);
                    return;
                }
                CatchingFishMVPDatabinding catchingFishMVPDatabinding = new CatchingFishMVPDatabinding(i, i2, catchingFishStateFlowMockk, catchingFishGraphQLMoshi);
                this.CatchingFishSnackbar.add(catchingFishMVPDatabinding);
                catchingFishMVPDatabinding.CatchingFishReduxKtor.add(new CatchingFishRealmMoshi(this, catchingFishMVPDatabinding, 0));
                catchingFishMVPDatabinding.CatchingFishReduxKtor.add(new CatchingFishRealmMoshi(this, catchingFishMVPDatabinding, 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final CatchingFishMVPDatabinding CatchingFishReduxKtor(CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi) {
        ArrayList arrayList = this.CatchingFishSnackbar;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            CatchingFishMVPDatabinding catchingFishMVPDatabinding = (CatchingFishMVPDatabinding) obj;
            if (catchingFishMVPDatabinding.CatchingFishCoroutine.equals(catchingFishGoogleMapsMoshi) && !catchingFishMVPDatabinding.CatchingFishWorkManager) {
                return catchingFishMVPDatabinding;
            }
        }
        return null;
    }

    public final void CatchingFishSnackbar(ArrayList arrayList, boolean z) {
        boolean z2;
        ArrayList arrayList2;
        ViewGroup viewGroup;
        int size = arrayList.size();
        boolean z3 = false;
        CatchingFishMVPDatabinding catchingFishMVPDatabinding = null;
        int i = 0;
        CatchingFishMVPDatabinding catchingFishMVPDatabinding2 = null;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            CatchingFishMVPDatabinding catchingFishMVPDatabinding3 = (CatchingFishMVPDatabinding) obj;
            int CatchingFishCoroutine = CatchingFishMVPLiveData.CatchingFishCoroutine(catchingFishMVPDatabinding3.CatchingFishCoroutine.CatchingFishPayPalService);
            int CatchingFishParcelableFlux = CatchingFishMVPLiveData.CatchingFishParcelableFlux(catchingFishMVPDatabinding3.CatchingFishParcelableFAB);
            if (CatchingFishParcelableFlux != 0) {
                if (CatchingFishParcelableFlux != 1) {
                    if (CatchingFishParcelableFlux != 2 && CatchingFishParcelableFlux != 3) {
                    }
                } else if (CatchingFishCoroutine != 2) {
                    catchingFishMVPDatabinding2 = catchingFishMVPDatabinding3;
                }
            }
            if (CatchingFishCoroutine == 2 && catchingFishMVPDatabinding == null) {
                catchingFishMVPDatabinding = catchingFishMVPDatabinding3;
            }
        }
        if (CatchingFishToastSharedFlow.CatchingFishFragmentFactory(2)) {
            Objects.toString(catchingFishMVPDatabinding);
            Objects.toString(catchingFishMVPDatabinding2);
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList(arrayList);
        CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi = ((CatchingFishMVPDatabinding) arrayList.get(arrayList.size() - 1)).CatchingFishCoroutine;
        int size2 = arrayList.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList.get(i2);
            i2++;
            CatchingFishGradleEspresso catchingFishGradleEspresso = ((CatchingFishMVPDatabinding) obj2).CatchingFishCoroutine.CatchingFishDagger;
            CatchingFishGradleEspresso catchingFishGradleEspresso2 = catchingFishGoogleMapsMoshi.CatchingFishDagger;
            catchingFishGradleEspresso.CatchingFishSnackbar = catchingFishGradleEspresso2.CatchingFishSnackbar;
            catchingFishGradleEspresso.CatchingFishCoroutine = catchingFishGradleEspresso2.CatchingFishCoroutine;
            catchingFishGradleEspresso.CatchingFishReduxKtor = catchingFishGradleEspresso2.CatchingFishReduxKtor;
            catchingFishGradleEspresso.CatchingFishDaggerWebsocket = catchingFishGradleEspresso2.CatchingFishDaggerWebsocket;
        }
        int size3 = arrayList.size();
        int i3 = 0;
        while (i3 < size3) {
            Object obj3 = arrayList.get(i3);
            i3++;
            CatchingFishMVPDatabinding catchingFishMVPDatabinding4 = (CatchingFishMVPDatabinding) obj3;
            CatchingFishGraphQLMoshi catchingFishGraphQLMoshi = new CatchingFishGraphQLMoshi();
            catchingFishMVPDatabinding4.CatchingFishReduxKtor();
            HashSet hashSet = catchingFishMVPDatabinding4.CatchingFishDaggerWebsocket;
            hashSet.add(catchingFishGraphQLMoshi);
            CatchingFishOkHttpPayPal catchingFishOkHttpPayPal = new CatchingFishOkHttpPayPal(catchingFishMVPDatabinding4, catchingFishGraphQLMoshi);
            catchingFishOkHttpPayPal.CatchingFishReduxKtor = z3;
            catchingFishOkHttpPayPal.CatchingFishCoroutine = z;
            arrayList3.add(catchingFishOkHttpPayPal);
            CatchingFishGraphQLMoshi catchingFishGraphQLMoshi2 = new CatchingFishGraphQLMoshi();
            catchingFishMVPDatabinding4.CatchingFishReduxKtor();
            hashSet.add(catchingFishGraphQLMoshi2);
            boolean z4 = (!z ? catchingFishMVPDatabinding4 == catchingFishMVPDatabinding2 : catchingFishMVPDatabinding4 == catchingFishMVPDatabinding) ? z3 : true;
            CatchingFishToastFABFAB catchingFishToastFABFAB = new CatchingFishToastFABFAB(catchingFishMVPDatabinding4, catchingFishGraphQLMoshi2);
            int i4 = catchingFishMVPDatabinding4.CatchingFishParcelableFAB;
            CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi2 = catchingFishMVPDatabinding4.CatchingFishCoroutine;
            if (i4 == 2) {
                if (z) {
                    CatchingFishGradleEspresso catchingFishGradleEspresso3 = catchingFishGoogleMapsMoshi2.CatchingFishDagger;
                } else {
                    catchingFishGoogleMapsMoshi2.getClass();
                }
                if (z) {
                    CatchingFishGradleEspresso catchingFishGradleEspresso4 = catchingFishGoogleMapsMoshi2.CatchingFishDagger;
                } else {
                    CatchingFishGradleEspresso catchingFishGradleEspresso5 = catchingFishGoogleMapsMoshi2.CatchingFishDagger;
                }
            } else if (z) {
                CatchingFishGradleEspresso catchingFishGradleEspresso6 = catchingFishGoogleMapsMoshi2.CatchingFishDagger;
            } else {
                catchingFishGoogleMapsMoshi2.getClass();
            }
            if (z4) {
                if (z) {
                    CatchingFishGradleEspresso catchingFishGradleEspresso7 = catchingFishGoogleMapsMoshi2.CatchingFishDagger;
                } else {
                    catchingFishGoogleMapsMoshi2.getClass();
                }
            }
            arrayList4.add(catchingFishToastFABFAB);
            catchingFishMVPDatabinding4.CatchingFishReduxKtor.add(new CatchingFishService(this, arrayList5, catchingFishMVPDatabinding4));
            z3 = false;
        }
        HashMap hashMap = new HashMap();
        int size4 = arrayList4.size();
        int i5 = 0;
        while (i5 < size4) {
            Object obj4 = arrayList4.get(i5);
            i5++;
            CatchingFishMVPDatabinding catchingFishMVPDatabinding5 = (CatchingFishMVPDatabinding) ((CatchingFishToastFABFAB) obj4).CatchingFishParcelableFAB;
            CatchingFishMVPLiveData.CatchingFishCoroutine(catchingFishMVPDatabinding5.CatchingFishCoroutine.CatchingFishPayPalService);
            int i6 = catchingFishMVPDatabinding5.CatchingFishParcelableFAB;
        }
        int size5 = arrayList4.size();
        int i7 = 0;
        while (i7 < size5) {
            Object obj5 = arrayList4.get(i7);
            i7++;
            CatchingFishToastFABFAB catchingFishToastFABFAB2 = (CatchingFishToastFABFAB) obj5;
            hashMap.put((CatchingFishMVPDatabinding) catchingFishToastFABFAB2.CatchingFishParcelableFAB, Boolean.FALSE);
            catchingFishToastFABFAB2.CatchingFishCoroutine();
        }
        boolean containsValue = hashMap.containsValue(Boolean.TRUE);
        ViewGroup viewGroup2 = this.CatchingFishParcelableFAB;
        Context context = viewGroup2.getContext();
        ArrayList arrayList6 = new ArrayList();
        int size6 = arrayList3.size();
        boolean z5 = false;
        int i8 = 0;
        while (i8 < size6) {
            Object obj6 = arrayList3.get(i8);
            i8++;
            CatchingFishOkHttpPayPal catchingFishOkHttpPayPal2 = (CatchingFishOkHttpPayPal) obj6;
            CatchingFishMVPDatabinding catchingFishMVPDatabinding6 = (CatchingFishMVPDatabinding) catchingFishOkHttpPayPal2.CatchingFishParcelableFAB;
            int CatchingFishCoroutine2 = CatchingFishMVPLiveData.CatchingFishCoroutine(catchingFishMVPDatabinding6.CatchingFishCoroutine.CatchingFishPayPalService);
            int i9 = catchingFishMVPDatabinding6.CatchingFishParcelableFAB;
            if (CatchingFishCoroutine2 == i9 || !(CatchingFishCoroutine2 == 2 || i9 == 2)) {
                z2 = containsValue;
                arrayList2 = arrayList3;
                viewGroup = viewGroup2;
                catchingFishOkHttpPayPal2.CatchingFishCoroutine();
            } else {
                CatchingFishBundleGlide CatchingFishLayout = catchingFishOkHttpPayPal2.CatchingFishLayout(context);
                if (CatchingFishLayout == null) {
                    catchingFishOkHttpPayPal2.CatchingFishCoroutine();
                } else {
                    Animator animator = (Animator) CatchingFishLayout.CatchingFishWorkManager;
                    if (animator == null) {
                        arrayList6.add(catchingFishOkHttpPayPal2);
                    } else {
                        CatchingFishMVPDatabinding catchingFishMVPDatabinding7 = (CatchingFishMVPDatabinding) catchingFishOkHttpPayPal2.CatchingFishParcelableFAB;
                        CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi3 = catchingFishMVPDatabinding7.CatchingFishCoroutine;
                        z2 = containsValue;
                        arrayList2 = arrayList3;
                        if (Boolean.TRUE.equals(hashMap.get(catchingFishMVPDatabinding7))) {
                            if (CatchingFishToastSharedFlow.CatchingFishFragmentFactory(2)) {
                                Objects.toString(catchingFishGoogleMapsMoshi3);
                            }
                            catchingFishOkHttpPayPal2.CatchingFishCoroutine();
                            viewGroup = viewGroup2;
                        } else {
                            boolean z6 = catchingFishMVPDatabinding7.CatchingFishParcelableFAB == 3;
                            if (z6) {
                                arrayList5.remove(catchingFishMVPDatabinding7);
                            }
                            View view = catchingFishGoogleMapsMoshi3.CatchingFishPayPalService;
                            viewGroup2.startViewTransition(view);
                            ViewGroup viewGroup3 = viewGroup2;
                            animator.addListener(new CatchingFishToastPicasso(viewGroup3, view, z6, catchingFishMVPDatabinding7, catchingFishOkHttpPayPal2));
                            animator.setTarget(view);
                            animator.start();
                            if (CatchingFishToastSharedFlow.CatchingFishFragmentFactory(2)) {
                                catchingFishMVPDatabinding7.toString();
                            }
                            ((CatchingFishGraphQLMoshi) catchingFishOkHttpPayPal2.CatchingFishSnackbar).CatchingFishParcelableFAB(new CatchingFishBundleGlide(17, animator, catchingFishMVPDatabinding7));
                            containsValue = z2;
                            viewGroup2 = viewGroup3;
                            arrayList3 = arrayList2;
                            z5 = true;
                        }
                    }
                }
                z2 = containsValue;
                arrayList2 = arrayList3;
                viewGroup = viewGroup2;
            }
            containsValue = z2;
            viewGroup2 = viewGroup;
            arrayList3 = arrayList2;
        }
        boolean z7 = containsValue;
        ViewGroup viewGroup4 = viewGroup2;
        int size7 = arrayList6.size();
        int i10 = 0;
        while (i10 < size7) {
            Object obj7 = arrayList6.get(i10);
            i10++;
            CatchingFishOkHttpPayPal catchingFishOkHttpPayPal3 = (CatchingFishOkHttpPayPal) obj7;
            CatchingFishMVPDatabinding catchingFishMVPDatabinding8 = (CatchingFishMVPDatabinding) catchingFishOkHttpPayPal3.CatchingFishParcelableFAB;
            CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi4 = catchingFishMVPDatabinding8.CatchingFishCoroutine;
            if (z7) {
                if (CatchingFishToastSharedFlow.CatchingFishFragmentFactory(2)) {
                    Objects.toString(catchingFishGoogleMapsMoshi4);
                }
                catchingFishOkHttpPayPal3.CatchingFishCoroutine();
            } else if (z5) {
                if (CatchingFishToastSharedFlow.CatchingFishFragmentFactory(2)) {
                    Objects.toString(catchingFishGoogleMapsMoshi4);
                }
                catchingFishOkHttpPayPal3.CatchingFishCoroutine();
            } else {
                View view2 = catchingFishGoogleMapsMoshi4.CatchingFishPayPalService;
                CatchingFishBundleGlide CatchingFishLayout2 = catchingFishOkHttpPayPal3.CatchingFishLayout(context);
                CatchingFishLayout2.getClass();
                Animation animation = (Animation) CatchingFishLayout2.CatchingFishDaggerWebsocket;
                animation.getClass();
                if (catchingFishMVPDatabinding8.CatchingFishParcelableFAB != 1) {
                    view2.startAnimation(animation);
                    catchingFishOkHttpPayPal3.CatchingFishCoroutine();
                } else {
                    viewGroup4.startViewTransition(view2);
                    CatchingFishBundleMVP catchingFishBundleMVP = new CatchingFishBundleMVP(animation, viewGroup4, view2);
                    catchingFishBundleMVP.setAnimationListener(new CatchingFishMVIHilt(catchingFishMVPDatabinding8, viewGroup4, view2, catchingFishOkHttpPayPal3));
                    view2.startAnimation(catchingFishBundleMVP);
                    if (CatchingFishToastSharedFlow.CatchingFishFragmentFactory(2)) {
                        catchingFishMVPDatabinding8.toString();
                    }
                }
                ((CatchingFishGraphQLMoshi) catchingFishOkHttpPayPal3.CatchingFishSnackbar).CatchingFishParcelableFAB(new CatchingFishFluxFluxBundle(view2, viewGroup4, catchingFishOkHttpPayPal3, catchingFishMVPDatabinding8));
            }
        }
        int size8 = arrayList5.size();
        int i11 = 0;
        while (i11 < size8) {
            Object obj8 = arrayList5.get(i11);
            i11++;
            CatchingFishMVPDatabinding catchingFishMVPDatabinding9 = (CatchingFishMVPDatabinding) obj8;
            CatchingFishMVPLiveData.CatchingFishParcelableFAB(catchingFishMVPDatabinding9.CatchingFishCoroutine.CatchingFishPayPalService, catchingFishMVPDatabinding9.CatchingFishParcelableFAB);
        }
        arrayList5.clear();
        if (CatchingFishToastSharedFlow.CatchingFishFragmentFactory(2)) {
            Objects.toString(catchingFishMVPDatabinding);
            Objects.toString(catchingFishMVPDatabinding2);
        }
    }

    public final void CatchingFishViewModelScope() {
        ArrayList arrayList = this.CatchingFishSnackbar;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            CatchingFishMVPDatabinding catchingFishMVPDatabinding = (CatchingFishMVPDatabinding) obj;
            if (catchingFishMVPDatabinding.CatchingFishSnackbar == 2) {
                catchingFishMVPDatabinding.CatchingFishCoroutine(CatchingFishMVPLiveData.CatchingFishSnackbar(catchingFishMVPDatabinding.CatchingFishCoroutine.CatchingFishMVPRobolectric().getVisibility()), 1);
            }
        }
    }
}
