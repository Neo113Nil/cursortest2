package com.fillr.embedded.settings;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.fillr.core.BaseFragment;
import com.fillr.embedded.profile.FEMainActivity;
import com.fillr.embedded.profile.FEProfileFragment;
import com.fillr.embedded.settings.adapter.SettingsAdapter;
import com.fillr.m1;
import com.fillr.service.DownloadSchemaService;
import com.squareup.cash.R;
import java.util.ArrayList;
import net.oneformapp.ProfileStore_;

/* loaded from: classes4.dex */
public class FESettingsFragment extends BaseFragment {
    public SettingsAdapter adapter;
    public RecyclerView menuList;
    public boolean mbShowProfile = false;
    public final m1 onMenuClicked = new m1(this, 15);

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 19 && i2 == -1) {
            getMainActivity().pushFragmentOntoStack(new FEProfileFragment(), "FEProfileFragment");
        }
    }

    @Override // com.fillr.core.BaseFragment
    public final void onBackStackChanged() {
    }

    @Override // com.fillr.core.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.mbShowProfile = arguments.getBoolean("FESettingsFragment.SHOW_PROFILE", false);
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.startService(new Intent(activity, (Class<?>) DownloadSchemaService.class));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fe_menu_fragment, viewGroup, false);
        this.menuList = (RecyclerView) inflate.findViewById(R.id.id_menu_list);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        String string2 = getString(R.string.fillr_autofill_settings);
        FEMainActivity mainActivity = getMainActivity();
        if (mainActivity != null) {
            mainActivity.setTitle(string2);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new SettingsAdapter.MenuListItem(1, getString(R.string.fillr_settings_menu_autofill_profile)));
        arrayList.add(new SettingsAdapter.MenuListItem(2, getString(R.string.fillr_settings_menu_about_fillr)));
        this.menuList.setLayoutManager(new LinearLayoutManager(getActivity()));
        SettingsAdapter settingsAdapter = new SettingsAdapter();
        settingsAdapter.menuItems = arrayList;
        settingsAdapter.mMenuListClickedlistener = this.onMenuClicked;
        this.adapter = settingsAdapter;
        this.menuList.setAdapter(settingsAdapter);
        this.adapter.notifyDataSetChanged();
        if (this.mbShowProfile) {
            showProfile();
        }
    }

    public final void showProfile() {
        SharedPreferences sharedPreferences = this.mPreferenceStore.mPreferences;
        if (sharedPreferences != null ? sharedPreferences.getBoolean("F_CREATED_DEFAULT_PIN", false) : true) {
            ProfileStore_.getInstance_(getContext()).loadStoredPin();
            getMainActivity().pushFragmentOntoStack(new FEProfileFragment(), "FEProfileFragment");
        }
    }
}
