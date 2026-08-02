package com.fillr.core;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.fillr.analytics.metrics.FillrAPI;
import com.fillr.core.analytics.FillrAnalyticsServiceBuilder;
import com.fillr.core.apiclientv2.ConsumerAPIClientListener;
import com.fillr.core.model.ModelBase;
import com.fillr.core.utilities.AppPreferenceStore;
import com.fillr.embedded.profile.FEMainActivity;
import com.google.android.filament.Box;
import net.oneformapp.schema.Element;

/* loaded from: classes4.dex */
public abstract class BaseFragment extends Fragment implements ConsumerAPIClientListener {
    public Box mAnalytics = null;
    public AppPreferenceStore mPreferenceStore = null;

    public final FEMainActivity getMainActivity() {
        FragmentActivity activity = getActivity();
        if (activity instanceof FEMainActivity) {
            return (FEMainActivity) activity;
        }
        return null;
    }

    public abstract void onBackStackChanged();

    @Override // com.fillr.core.apiclientv2.ConsumerAPIClientListener
    public boolean onBeforeAPICallback() {
        return isAdded() && isVisible();
    }

    @Override // com.fillr.core.apiclientv2.ConsumerAPIClientListener
    public final void onConsumerAPICallProgressStart(String str) {
    }

    @Override // com.fillr.core.apiclientv2.ConsumerAPIClientListener
    public final void onConsumerAPIData(int i, ModelBase modelBase) {
    }

    @Override // com.fillr.core.apiclientv2.ConsumerAPIClientListener
    public final void onConsumerAPIError(int i) {
    }

    @Override // com.fillr.core.apiclientv2.ConsumerAPIClientListener
    public final void onConsumerAPILog(String str) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        this.mAnalytics = FillrAnalyticsServiceBuilder.build();
        this.mPreferenceStore = new AppPreferenceStore(getContext());
    }

    public void onManualEntry(Element element) {
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        Box box = this.mAnalytics;
        if (box != null) {
            FillrAPI.getInstance(getContext(), (String) box.mCenter).flush();
        }
    }

    public void refreshView() {
    }
}
