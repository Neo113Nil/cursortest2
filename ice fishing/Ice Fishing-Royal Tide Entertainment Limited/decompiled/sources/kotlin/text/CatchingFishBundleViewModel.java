package kotlin.text;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentContainerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class CatchingFishBundleViewModel implements LayoutInflater.Factory2 {
    public final CatchingFishToastSharedFlow CatchingFishReduxKtor;

    public CatchingFishBundleViewModel(CatchingFishToastSharedFlow catchingFishToastSharedFlow) {
        this.CatchingFishReduxKtor = catchingFishToastSharedFlow;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi;
        CatchingFishStateFlowMockk CatchingFishWorkManager;
        boolean equals = FragmentContainerView.class.getName().equals(str);
        CatchingFishToastSharedFlow catchingFishToastSharedFlow = this.CatchingFishReduxKtor;
        if (equals) {
            return new FragmentContainerView(context, attributeSet, catchingFishToastSharedFlow);
        }
        CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi2 = null;
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, CatchingFishWidgetService.CatchingFishParcelableFAB);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(0);
            }
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            String string = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    z = CatchingFishGoogleMapsMoshi.class.isAssignableFrom(CatchingFishFABStateFlow.CatchingFishSnackbar(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    z = false;
                }
                if (z) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    CatchingFishGoogleMapsMoshi CatchingFishPayPal = resourceId != -1 ? catchingFishToastSharedFlow.CatchingFishPayPal(resourceId) : null;
                    if (CatchingFishPayPal == null && string != null) {
                        CatchingFishFluxFluxBundle catchingFishFluxFluxBundle = catchingFishToastSharedFlow.CatchingFishCoroutine;
                        ArrayList arrayList = (ArrayList) catchingFishFluxFluxBundle.CatchingFishReduxKtor;
                        int size = arrayList.size() - 1;
                        while (true) {
                            if (size < 0) {
                                catchingFishGoogleMapsMoshi = catchingFishGoogleMapsMoshi2;
                                Iterator it = ((HashMap) catchingFishFluxFluxBundle.CatchingFishDaggerWebsocket).values().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        CatchingFishPayPal = catchingFishGoogleMapsMoshi;
                                        break;
                                    }
                                    CatchingFishStateFlowMockk catchingFishStateFlowMockk = (CatchingFishStateFlowMockk) it.next();
                                    if (catchingFishStateFlowMockk != null) {
                                        CatchingFishPayPal = catchingFishStateFlowMockk.CatchingFishCoroutine;
                                        if (string.equals(CatchingFishPayPal.CatchingFishPayPal)) {
                                            break;
                                        }
                                    }
                                }
                            } else {
                                CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi3 = (CatchingFishGoogleMapsMoshi) arrayList.get(size);
                                catchingFishGoogleMapsMoshi = catchingFishGoogleMapsMoshi2;
                                if (catchingFishGoogleMapsMoshi3 != null && string.equals(catchingFishGoogleMapsMoshi3.CatchingFishPayPal)) {
                                    CatchingFishPayPal = catchingFishGoogleMapsMoshi3;
                                    break;
                                }
                                size--;
                                catchingFishGoogleMapsMoshi2 = catchingFishGoogleMapsMoshi;
                            }
                        }
                    } else {
                        catchingFishGoogleMapsMoshi = null;
                    }
                    if (CatchingFishPayPal == null && id != -1) {
                        CatchingFishPayPal = catchingFishToastSharedFlow.CatchingFishPayPal(id);
                    }
                    if (CatchingFishPayPal == null) {
                        CatchingFishFABStateFlow CatchingFishMVPRobolectric = catchingFishToastSharedFlow.CatchingFishMVPRobolectric();
                        context.getClassLoader();
                        CatchingFishPayPal = CatchingFishMVPRobolectric.CatchingFishParcelableFAB(attributeValue);
                        CatchingFishPayPal.CatchingFishStateLiveData = true;
                        CatchingFishPayPal.CatchingFishGsonAppCompat = resourceId != 0 ? resourceId : id;
                        CatchingFishPayPal.CatchingFishCardViewRealm = id;
                        CatchingFishPayPal.CatchingFishPayPal = string;
                        CatchingFishPayPal.CatchingFishRoomDatabase = true;
                        CatchingFishPayPal.CatchingFishCoroutineFlow = catchingFishToastSharedFlow;
                        CatchingFishMVIPicasso catchingFishMVIPicasso = catchingFishToastSharedFlow.CatchingFishJetpackCompose;
                        CatchingFishPayPal.CatchingFishDaggerHiltFAB = catchingFishMVIPicasso;
                        FragmentActivity fragmentActivity = catchingFishMVIPicasso.CatchingFishCoroutineFlow;
                        CatchingFishPayPal.CatchingFishMutableLiveData = true;
                        if ((catchingFishMVIPicasso == null ? catchingFishGoogleMapsMoshi : catchingFishMVIPicasso.CatchingFishJetpackCompose) != null) {
                            CatchingFishPayPal.CatchingFishMutableLiveData = true;
                        }
                        CatchingFishWorkManager = catchingFishToastSharedFlow.CatchingFishParcelableFAB(CatchingFishPayPal);
                        if (CatchingFishToastSharedFlow.CatchingFishFragmentFactory(2)) {
                            CatchingFishPayPal.toString();
                            Integer.toHexString(resourceId);
                        }
                    } else {
                        if (CatchingFishPayPal.CatchingFishRoomDatabase) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        CatchingFishPayPal.CatchingFishRoomDatabase = true;
                        CatchingFishPayPal.CatchingFishCoroutineFlow = catchingFishToastSharedFlow;
                        CatchingFishMVIPicasso catchingFishMVIPicasso2 = catchingFishToastSharedFlow.CatchingFishJetpackCompose;
                        CatchingFishPayPal.CatchingFishDaggerHiltFAB = catchingFishMVIPicasso2;
                        FragmentActivity fragmentActivity2 = catchingFishMVIPicasso2.CatchingFishCoroutineFlow;
                        CatchingFishPayPal.CatchingFishMutableLiveData = true;
                        if ((catchingFishMVIPicasso2 == null ? catchingFishGoogleMapsMoshi : catchingFishMVIPicasso2.CatchingFishJetpackCompose) != null) {
                            CatchingFishPayPal.CatchingFishMutableLiveData = true;
                        }
                        CatchingFishWorkManager = catchingFishToastSharedFlow.CatchingFishWorkManager(CatchingFishPayPal);
                        if (CatchingFishToastSharedFlow.CatchingFishFragmentFactory(2)) {
                            CatchingFishPayPal.toString();
                            Integer.toHexString(resourceId);
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    CatchingFishCameraXView catchingFishCameraXView = CatchingFishCoroutineGlide.CatchingFishParcelableFAB;
                    CatchingFishMockkMVVM catchingFishMockkMVVM = new CatchingFishMockkMVVM(CatchingFishPayPal, "Attempting to use <fragment> tag to add fragment " + CatchingFishPayPal + " to container " + viewGroup);
                    if (CatchingFishToastSharedFlow.CatchingFishFragmentFactory(3)) {
                        catchingFishMockkMVVM.CatchingFishReduxKtor.getClass();
                    }
                    CatchingFishCoroutineGlide.CatchingFishParcelableFAB(CatchingFishPayPal).getClass();
                    CatchingFishPayPal.CatchingFishJobScheduler = viewGroup;
                    CatchingFishWorkManager.CatchingFishCloudMessaging();
                    CatchingFishWorkManager.CatchingFishFragmentHandler();
                    View view2 = CatchingFishPayPal.CatchingFishPayPalService;
                    if (view2 == null) {
                        throw new IllegalStateException(CatchingFishMVPLiveData.CatchingFishOkHttp("Fragment ", attributeValue, " did not create a view."));
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (CatchingFishPayPal.CatchingFishPayPalService.getTag() == null) {
                        CatchingFishPayPal.CatchingFishPayPalService.setTag(string);
                    }
                    CatchingFishPayPal.CatchingFishPayPalService.addOnAttachStateChangeListener(new CatchingFishAsyncTaskMockk(this, CatchingFishWorkManager));
                    return CatchingFishPayPal.CatchingFishPayPalService;
                }
            }
        }
        return null;
    }
}
