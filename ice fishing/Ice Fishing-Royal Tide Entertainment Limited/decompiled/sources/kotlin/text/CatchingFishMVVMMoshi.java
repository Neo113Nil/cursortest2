package kotlin.text;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class CatchingFishMVVMMoshi extends CatchingFishDaggerBiometric {
    public final /* synthetic */ CatchingFishJUnitToastKtor CatchingFishViewModelScope;
    public final /* synthetic */ int CatchingFishWorkManager;

    public /* synthetic */ CatchingFishMVVMMoshi(CatchingFishJUnitToastKtor catchingFishJUnitToastKtor, int i) {
        this.CatchingFishWorkManager = i;
        this.CatchingFishViewModelScope = catchingFishJUnitToastKtor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if (r0.CatchingFishParcelableFAB.CatchingFishCardViewRealm(r6) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        if (java.lang.Math.abs(r7 - r0.CatchingFishParcelableFAB.CatchingFishUnitTesting()) < java.lang.Math.abs(r7 - r0.CatchingFishParcelableFAB.CatchingFishAnimationMockk())) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0080, code lost:
    
        if (r7 > r0.CatchingFishFragmentFactory) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d0, code lost:
    
        if (java.lang.Math.abs(r6.getTop() - r0.CatchingFishParcelableFlux()) < java.lang.Math.abs(r6.getTop() - r0.CatchingFishFragmentFactory)) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x011b, code lost:
    
        if (java.lang.Math.abs(r7 - r0.CatchingFishCustomView) < java.lang.Math.abs(r7 - r0.CatchingFishJobScheduler)) goto L29;
     */
    @Override // kotlin.text.CatchingFishDaggerBiometric
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void CatchingFishEspressoMockk(View view, float f, float f2) {
        int i;
        switch (this.CatchingFishWorkManager) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.CatchingFishViewModelScope;
                int i2 = 6;
                if (f2 < 0.0f) {
                    if (!bottomSheetBehavior.CatchingFishSnackbar) {
                        int top = view.getTop();
                        SystemClock.uptimeMillis();
                        bottomSheetBehavior.getClass();
                        break;
                    }
                    i2 = 3;
                    bottomSheetBehavior.getClass();
                    bottomSheetBehavior.CatchingFishFragmentFactory(view, i2, true);
                    break;
                } else if (bottomSheetBehavior.CatchingFishSensorManager && bottomSheetBehavior.CatchingFishCustomView(view, f2)) {
                    if (Math.abs(f) >= Math.abs(f2) || f2 <= bottomSheetBehavior.CatchingFishReduxKtor) {
                        if (view.getTop() <= (bottomSheetBehavior.CatchingFishParcelableFlux() + bottomSheetBehavior.CatchingFishStateFlow) / 2) {
                            if (!bottomSheetBehavior.CatchingFishSnackbar) {
                                break;
                            }
                            i2 = 3;
                            bottomSheetBehavior.getClass();
                            bottomSheetBehavior.CatchingFishFragmentFactory(view, i2, true);
                        }
                    }
                    i2 = 5;
                    bottomSheetBehavior.getClass();
                    bottomSheetBehavior.CatchingFishFragmentFactory(view, i2, true);
                } else {
                    if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                        int top2 = view.getTop();
                        if (bottomSheetBehavior.CatchingFishSnackbar) {
                            break;
                        } else {
                            int i3 = bottomSheetBehavior.CatchingFishFragmentFactory;
                            if (top2 < i3) {
                                if (top2 >= Math.abs(top2 - bottomSheetBehavior.CatchingFishJobScheduler)) {
                                    bottomSheetBehavior.getClass();
                                }
                                i2 = 3;
                            } else {
                                if (Math.abs(top2 - i3) < Math.abs(top2 - bottomSheetBehavior.CatchingFishJobScheduler)) {
                                    bottomSheetBehavior.getClass();
                                }
                                i2 = 4;
                            }
                        }
                    } else {
                        if (!bottomSheetBehavior.CatchingFishSnackbar) {
                            int top3 = view.getTop();
                            if (Math.abs(top3 - bottomSheetBehavior.CatchingFishFragmentFactory) < Math.abs(top3 - bottomSheetBehavior.CatchingFishJobScheduler)) {
                                bottomSheetBehavior.getClass();
                            }
                        }
                        i2 = 4;
                    }
                    bottomSheetBehavior.getClass();
                    bottomSheetBehavior.CatchingFishFragmentFactory(view, i2, true);
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.CatchingFishViewModelScope;
                if (!sideSheetBehavior.CatchingFishParcelableFAB.CatchingFishParcelableFlux(f)) {
                    if (sideSheetBehavior.CatchingFishParcelableFAB.CatchingFishDagger(view, f)) {
                        if (!sideSheetBehavior.CatchingFishParcelableFAB.CatchingFishPayPal(f, f2)) {
                            break;
                        }
                        i = 5;
                    } else {
                        if (f == 0.0f || Math.abs(f) <= Math.abs(f2)) {
                            int left = view.getLeft();
                            break;
                        }
                        i = 5;
                    }
                    sideSheetBehavior.CatchingFishJetpackCompose(view, i, true);
                    break;
                }
                i = 3;
                sideSheetBehavior.CatchingFishJetpackCompose(view, i, true);
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0045, code lost:
    
        if (r6.canScrollVertically(-1) != false) goto L36;
     */
    @Override // kotlin.text.CatchingFishDaggerBiometric
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean CatchingFishParcelable(View view, int i) {
        WeakReference weakReference;
        switch (this.CatchingFishWorkManager) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.CatchingFishViewModelScope;
                int i2 = bottomSheetBehavior.CatchingFishPayPalLiveData;
                if (i2 != 1 && !bottomSheetBehavior.CatchingFishNavigationGson) {
                    if (i2 == 3 && bottomSheetBehavior.CatchingFishMoshiDaggerHilt == i) {
                        WeakReference weakReference2 = bottomSheetBehavior.CatchingFishAnimation;
                        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
                        if (view2 != null) {
                            break;
                        }
                    }
                    SystemClock.uptimeMillis();
                    WeakReference weakReference3 = bottomSheetBehavior.CatchingFishJUnitRealm;
                    if (weakReference3 != null && weakReference3.get() == view) {
                        return true;
                    }
                }
                return false;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.CatchingFishViewModelScope;
                return (sideSheetBehavior.CatchingFishViewModelFAB == 1 || (weakReference = sideSheetBehavior.CatchingFishStateLiveData) == null || weakReference.get() != view) ? false : true;
        }
    }

    @Override // kotlin.text.CatchingFishDaggerBiometric
    public int CatchingFishParcelableFlux() {
        switch (this.CatchingFishWorkManager) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.CatchingFishViewModelScope;
                return bottomSheetBehavior.CatchingFishSensorManager ? bottomSheetBehavior.CatchingFishStateFlow : bottomSheetBehavior.CatchingFishJobScheduler;
            default:
                return super.CatchingFishParcelableFlux();
        }
    }

    @Override // kotlin.text.CatchingFishDaggerBiometric
    public final void CatchingFishPayPalService(int i) {
        switch (this.CatchingFishWorkManager) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.CatchingFishViewModelScope;
                    if (bottomSheetBehavior.CatchingFishDagger) {
                        bottomSheetBehavior.CatchingFishMVPRobolectric(1);
                        break;
                    }
                }
                break;
            default:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.CatchingFishViewModelScope;
                    if (sideSheetBehavior.CatchingFishViewModelScope) {
                        sideSheetBehavior.CatchingFishNavigation(1);
                        break;
                    }
                }
                break;
        }
    }

    @Override // kotlin.text.CatchingFishDaggerBiometric
    public final void CatchingFishSensorManager(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.CatchingFishWorkManager) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((BottomSheetBehavior) this.CatchingFishViewModelScope).CatchingFishCoroutineFlow(i2);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.CatchingFishViewModelScope;
                WeakReference weakReference = sideSheetBehavior.CatchingFishRoomDatabase;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.CatchingFishParcelableFAB.CatchingFishAppCompat(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.CatchingFishCoroutineFlow;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.CatchingFishParcelableFAB.CatchingFishCoroutine(i);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                return;
        }
    }

    @Override // kotlin.text.CatchingFishDaggerBiometric
    public int CatchingFishSpannableWidget(View view) {
        switch (this.CatchingFishWorkManager) {
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.CatchingFishViewModelScope;
                return sideSheetBehavior.CatchingFishEspressoTesting + sideSheetBehavior.CatchingFishAnimationMockk;
            default:
                return super.CatchingFishSpannableWidget(view);
        }
    }

    @Override // kotlin.text.CatchingFishDaggerBiometric
    public final int CatchingFishViewModelScope(View view, int i) {
        switch (this.CatchingFishWorkManager) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return CatchingFishHiltMVPToast.CatchingFishViewModelScope(i, ((BottomSheetBehavior) this.CatchingFishViewModelScope).CatchingFishParcelableFlux(), CatchingFishParcelableFlux());
            default:
                return view.getTop();
        }
    }

    @Override // kotlin.text.CatchingFishDaggerBiometric
    public final int CatchingFishWorkManager(View view, int i) {
        switch (this.CatchingFishWorkManager) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return view.getLeft();
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.CatchingFishViewModelScope;
                return CatchingFishHiltMVPToast.CatchingFishViewModelScope(i, sideSheetBehavior.CatchingFishParcelableFAB.CatchingFishNavigation(), sideSheetBehavior.CatchingFishParcelableFAB.CatchingFishRoomDatabase());
        }
    }
}
