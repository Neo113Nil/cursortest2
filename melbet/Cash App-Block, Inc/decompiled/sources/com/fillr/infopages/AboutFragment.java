package com.fillr.infopages;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.view.PreviewView;
import androidx.datastore.core.SimpleActor;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.analytics.AnalyticsEvent;
import com.fillr.core.analytics.FillrAnalyticsServiceBuilder;
import com.fillr.embedded.profile.FEMainActivity;
import com.miteksystems.misnap.camera.frameproducers.CameraWrapper;
import com.squareup.cash.R;
import com.withpersona.sdk2.camera.CameraState;
import com.withpersona.sdk2.camera.CameraXController;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.coroutines.flow.StateFlowImpl;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class AboutFragment extends BaseInfoFragment {
    public static final String[] SECTIONS = {"about.json", "privacy.json", "terms.json", "partner_privacy.json"};
    public AboutViewModel aboutViewModel;
    public LinearLayout layoutContainer;

    /* renamed from: com.fillr.infopages.AboutFragment$1, reason: invalid class name */
    public final class AnonymousClass1 implements Observer {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ Object this$0;

        public /* synthetic */ AnonymousClass1(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            String str;
            PackageInfo packageInfo;
            int i = this.$r8$classId;
            boolean z = false;
            Object obj2 = this.this$0;
            switch (i) {
                case 0:
                    AboutFragment aboutFragment = (AboutFragment) obj2;
                    LayoutInflater from = LayoutInflater.from(aboutFragment.getContext());
                    for (AboutSectionModel aboutSectionModel : (List) obj) {
                        View inflate = from.inflate(R.layout.row_info_pages, (ViewGroup) null);
                        TextView textView = (TextView) inflate.findViewById(R.id.f_info_pages_title);
                        TextView textView2 = (TextView) inflate.findViewById(R.id.f_info_pages_subtext);
                        TextView textView3 = (TextView) inflate.findViewById(R.id.f_info_pages_url);
                        textView.setText(aboutSectionModel.title);
                        textView2.setText(aboutSectionModel.subtitle);
                        textView3.setText(aboutSectionModel.url);
                        aboutFragment.layoutContainer.addView(inflate);
                    }
                    FEMainActivity mainActivity = aboutFragment.getMainActivity();
                    if (mainActivity != null) {
                        mainActivity.setTitle(aboutFragment.getString(R.string.f_info_page_about));
                    }
                    TextView textView4 = new TextView(aboutFragment.getActivity());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.setMargins((int) ((16.0f * aboutFragment.getResources().getDisplayMetrics().density) + 0.5f), 0, 0, (int) ((32.0f * aboutFragment.getResources().getDisplayMetrics().density) + 0.5f));
                    textView4.setLayoutParams(layoutParams);
                    FragmentActivity activity = aboutFragment.getActivity();
                    try {
                        packageInfo = activity.getPackageManager().getPackageInfo(activity.getPackageName(), 0);
                    } catch (PackageManager.NameNotFoundException e) {
                        e.printStackTrace();
                        str = "";
                    }
                    if (!"com.fillr".equals(packageInfo.packageName) && !"com.fillr.dolphin".equals(packageInfo.packageName)) {
                        str = "Fillr Embedded Version: 11.2.0";
                        textView4.setText(str);
                        aboutFragment.layoutContainer.addView(textView4);
                        break;
                    }
                    str = "Fillr App Version: " + packageInfo.versionName + ", Fillr Embedded Version: 11.2.0";
                    textView4.setText(str);
                    aboutFragment.layoutContainer.addView(textView4);
                    break;
                case 1:
                    Integer num = (Integer) obj;
                    MutableLiveData mutableLiveData = ((CameraWrapper) obj2).O;
                    if (num != null && num.intValue() == 1) {
                        z = true;
                    }
                    Boolean valueOf = Boolean.valueOf(z);
                    if (Recorder$$ExternalSyntheticOutline1.m(mutableLiveData)) {
                        mutableLiveData.setValue(valueOf);
                        break;
                    } else {
                        mutableLiveData.postValue(valueOf);
                        break;
                    }
                default:
                    PreviewView.StreamState streamState = (PreviewView.StreamState) obj;
                    CameraXController cameraXController = (CameraXController) obj2;
                    streamState.getClass();
                    if (streamState == PreviewView.StreamState.STREAMING) {
                        StateFlowImpl stateFlowImpl = cameraXController._previewState;
                        CameraState.Error error = CameraState.Error.INSTANCE$3;
                        stateFlowImpl.getClass();
                        stateFlowImpl.updateState(null, error);
                        cameraXController.previewView.mPreviewStreamStateLiveData.removeObserver(this);
                        break;
                    }
                    break;
            }
        }
    }

    @Override // com.fillr.infopages.BaseInfoFragment, com.fillr.core.BaseFragment
    public final void onBackStackChanged() {
    }

    @Override // com.fillr.core.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewModelStore viewModelStore = getViewModelStore();
        ViewModelProvider$Factory defaultViewModelProviderFactory = getDefaultViewModelProviderFactory();
        CreationExtras defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelProviderFactory.getClass();
        defaultViewModelCreationExtras.getClass();
        SimpleActor simpleActor = new SimpleActor(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
        KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(AboutViewModel.class);
        String qualifiedName = orCreateKotlinClass.getQualifiedName();
        if (qualifiedName != null) {
            this.aboutViewModel = (AboutViewModel) simpleActor.getViewModel$lifecycle_viewmodel("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(qualifiedName), orCreateKotlinClass);
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("Local and anonymous classes can not be ViewModels");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 0;
        View inflate = layoutInflater.inflate(R.layout.f_fragment_about, viewGroup, false);
        this.layoutContainer = (LinearLayout) inflate.findViewById(R.id.f_info_page_container);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this, i);
        AboutViewModel aboutViewModel = this.aboutViewModel;
        if (aboutViewModel.infoPage == null) {
            aboutViewModel.infoPage = new MutableLiveData();
        }
        aboutViewModel.infoPage.observe(getViewLifecycleOwner(), anonymousClass1);
        AboutViewModel aboutViewModel2 = this.aboutViewModel;
        Context context = getContext();
        aboutViewModel2.getClass();
        FillrAnalyticsServiceBuilder.build().sendEvent(context, new AnalyticsEvent());
        AboutViewModel aboutViewModel3 = this.aboutViewModel;
        Context context2 = getContext();
        aboutViewModel3.getClass();
        ArrayList arrayList = new ArrayList();
        while (i < 4) {
            String str = SECTIONS[i];
            String string2 = "about.json".equals(str) ? context2.getString(R.string.about_json) : "privacy.json".equals(str) ? context2.getString(R.string.privacy_json) : "terms.json".equals(str) ? context2.getString(R.string.terms_json) : "security.json".equals(str) ? context2.getString(R.string.security_json) : "partner_privacy.json".equals(str) ? context2.getString(R.string.partner_privacy_policy) : null;
            if (string2 != null && string2.trim().length() > 0) {
                try {
                    JSONObject jSONObject = new JSONObject(string2);
                    String string3 = jSONObject.getString("Title");
                    String string4 = jSONObject.getString("Content");
                    String string5 = jSONObject.getString("Url");
                    AboutSectionModel aboutSectionModel = new AboutSectionModel();
                    aboutSectionModel.title = string3;
                    aboutSectionModel.subtitle = string4;
                    aboutSectionModel.url = string5;
                    arrayList.add(aboutSectionModel);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            i++;
        }
        if (aboutViewModel3.infoPage == null) {
            aboutViewModel3.infoPage = new MutableLiveData();
        }
        aboutViewModel3.infoPage.setValue(arrayList);
        return inflate;
    }
}
