package com.fillr.embedded.profile;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import com.fillr.home.HomeFragment;
import com.squareup.cash.R;

/* loaded from: classes4.dex */
public class FEProfileFragment extends HomeFragment {
    @Override // com.fillr.home.HomeFragment, com.fillr.core.BaseFragment
    public final void onBackStackChanged() {
        String string2 = getString(R.string.fillr_profile_details);
        FEMainActivity mainActivity = getMainActivity();
        if (mainActivity != null) {
            mainActivity.setTitle(string2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
    }

    @Override // com.fillr.core.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        SharedPreferences sharedPreferences = this.mPreferenceStore.mPreferences;
        if (sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean("F_FEEDBACK_FORM", false);
            edit.apply();
        }
    }
}
