package com.fillr.embedded.profile;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.ArrayMap;
import androidx.collection.IndexBasedArrayIterator;
import androidx.fragment.app.BackStackRecord;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import com.fillr.analytics.AnalyticsEvent;
import com.fillr.analytics.metrics.FillrAPI;
import com.fillr.core.BaseFragment;
import com.fillr.core.analytics.FillrAnalyticsServiceBuilder;
import com.fillr.core.apiclientv2.ConsumerAPIClientListener;
import com.fillr.core.model.ModelBase;
import com.fillr.core.utilities.AppPreferenceStore;
import com.fillr.embedded.settings.FESettingsFragment;
import com.fillr.profile.ProfileDetailedViewFragment;
import com.google.android.filament.Box;
import com.google.android.gms.auth.api.signin.internal.zbe;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.zaaz;
import com.google.android.gms.common.api.internal.zaj;
import com.google.android.gms.common.api.internal.zak;
import com.google.android.gms.common.api.internal.zam;
import com.google.android.gms.common.api.internal.zas;
import com.google.android.gms.common.api.internal.zzd;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.location.places.Places;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.zaa;
import com.google.android.gms.signin.zad;
import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.boost.db.Reward$Adapter;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes4.dex */
public class FEMainActivity extends AppCompatActivity implements FragmentManager.OnBackStackChangedListener, GoogleApiClient.OnConnectionFailedListener, ConsumerAPIClientListener {
    public View mCustomAB;
    public AppPreferenceStore preferenceStore = null;
    public zaaz mGoogleApiClient = null;
    public boolean mbIsActive = false;
    public FragmentManager fragmentManager = null;
    public ActionBar mActionbar = null;
    public TextView txtTitle = null;
    public ImageView imgLogo = null;
    public ImageButton imbButton = null;
    public Box mAnalytics = null;
    public final Toolbar.AnonymousClass4 onMenuToggleClicked = new Toolbar.AnonymousClass4(this, 4);

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.mbIsActive = true;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        BaseFragment baseFragment = (BaseFragment) getSupportFragmentManager().findFragmentByTag("profile_detailed_view_2");
        if (baseFragment instanceof ProfileDetailedViewFragment) {
            ProfileDetailedViewFragment profileDetailedViewFragment = (ProfileDetailedViewFragment) baseFragment;
            if (profileDetailedViewFragment.isAdded() && profileDetailedViewFragment.isVisible() && profileDetailedViewFragment.isChildElementCollapsed()) {
                return;
            }
        }
        super.onBackPressed();
    }

    @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
    public final void onBackStackChanged() {
        Object obj;
        FragmentManager fragmentManager = this.fragmentManager;
        if (fragmentManager != null) {
            int backStackEntryCount = fragmentManager.getBackStackEntryCount();
            if (backStackEntryCount <= 0) {
                setTitle(getString(R.string.fillr_autofill_settings));
                return;
            }
            FragmentManager fragmentManager2 = this.fragmentManager;
            int i = backStackEntryCount - 1;
            if (i == fragmentManager2.mBackStack.size()) {
                obj = fragmentManager2.mTransitioningOp;
                if (obj == null) {
                    JWK$$ExternalSyntheticBUOutline0.m2173m();
                    return;
                }
            } else {
                obj = (FragmentManager.BackStackEntry) fragmentManager2.mBackStack.get(i);
            }
            if (obj != null) {
                Fragment findFragmentByTag = this.fragmentManager.findFragmentByTag(((BackStackRecord) obj).mName);
                if (findFragmentByTag instanceof BaseFragment) {
                    ((BaseFragment) findFragmentByTag).onBackStackChanged();
                }
            }
        }
    }

    @Override // com.fillr.core.apiclientv2.ConsumerAPIClientListener
    public final boolean onBeforeAPICallback() {
        return this.mbIsActive;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
    }

    @Override // com.fillr.core.apiclientv2.ConsumerAPIClientListener
    public final void onConsumerAPICallProgressStart(String str) {
        Log.d("com.fillr", str);
    }

    @Override // com.fillr.core.apiclientv2.ConsumerAPIClientListener
    public final void onConsumerAPIData(int i, ModelBase modelBase) {
    }

    @Override // com.fillr.core.apiclientv2.ConsumerAPIClientListener
    public final void onConsumerAPIError(int i) {
    }

    @Override // com.fillr.core.apiclientv2.ConsumerAPIClientListener
    public final void onConsumerAPILog(String str) {
        Log.d("com.fillr", str);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        zaaz zaazVar;
        FEMainActivity fEMainActivity = this;
        super.onCreate(bundle);
        boolean z = true;
        fEMainActivity.mbIsActive = true;
        fEMainActivity.preferenceStore = new AppPreferenceStore(fEMainActivity);
        if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(fEMainActivity) != 0) {
            zaazVar = null;
        } else {
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            ArrayMap arrayMap = new ArrayMap(0);
            ArrayMap arrayMap2 = new ArrayMap(0);
            GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
            zaa zaaVar = zad.zac;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Looper mainLooper = fEMainActivity.getMainLooper();
            String packageName = fEMainActivity.getPackageName();
            String name = fEMainActivity.getClass().getName();
            Api api = Places.GEO_DATA_API;
            zzae.checkNotNull(api, "Api must not be null");
            arrayMap2.put(api, null);
            DimensionKt dimensionKt = api.zaa;
            zzae.checkNotNull(dimensionKt, "Base client builder must not be null");
            List impliedScopes = dimensionKt.getImpliedScopes();
            hashSet2.addAll(impliedScopes);
            hashSet.addAll(impliedScopes);
            zzae.checkArgument("must call addApi() to add at least one API", !arrayMap2.isEmpty());
            SignInOptions signInOptions = SignInOptions.zaa;
            Api api2 = zad.zag;
            if (arrayMap2.containsKey(api2)) {
                signInOptions = (SignInOptions) arrayMap2.get(api2);
            }
            Reward$Adapter reward$Adapter = new Reward$Adapter(hashSet, arrayMap, packageName, name, signInOptions);
            Map map = (Map) reward$Adapter.boost_detail_bottom_upsellAdapter;
            ArrayMap arrayMap3 = new ArrayMap(0);
            ArrayMap arrayMap4 = new ArrayMap(0);
            ArrayList arrayList3 = new ArrayList();
            Iterator it = ((ArrayMap.KeySet) arrayMap2.keySet()).iterator();
            Api api3 = null;
            while (true) {
                IndexBasedArrayIterator indexBasedArrayIterator = (IndexBasedArrayIterator) it;
                if (indexBasedArrayIterator.hasNext()) {
                    Api api4 = (Api) indexBasedArrayIterator.next();
                    Object obj = arrayMap2.get(api4);
                    boolean z2 = map.get(api4) != null ? z : false;
                    arrayMap3.put(api4, Boolean.valueOf(z2));
                    ArrayMap arrayMap5 = arrayMap4;
                    zas zasVar = new zas(api4, z2);
                    arrayList3.add(zasVar);
                    Map map2 = map;
                    Reward$Adapter reward$Adapter2 = reward$Adapter;
                    Looper looper = mainLooper;
                    DimensionKt dimensionKt2 = api4.zaa;
                    zzae.checkNotNull(dimensionKt2);
                    Api api5 = api3;
                    ArrayMap arrayMap6 = arrayMap3;
                    ArrayMap arrayMap7 = arrayMap2;
                    GmsClient buildClient = dimensionKt2.buildClient(fEMainActivity, looper, reward$Adapter2, obj, zasVar, zasVar);
                    arrayMap5.put(api4.zab, buildClient);
                    GmsClient gmsClient = buildClient;
                    gmsClient.getClass();
                    if (!(gmsClient instanceof zbe)) {
                        mainLooper = looper;
                        reward$Adapter = reward$Adapter2;
                        arrayMap4 = arrayMap5;
                        map = map2;
                        api3 = api5;
                    } else if (api5 != null) {
                        String str = api4.zac;
                        String str2 = api5.zac;
                        a$$ExternalSyntheticBUOutline0.m$1(Recorder$$ExternalSyntheticOutline2.m(new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length()), str, " cannot be used with ", str2));
                        return;
                    } else {
                        mainLooper = looper;
                        reward$Adapter = reward$Adapter2;
                        arrayMap4 = arrayMap5;
                        map = map2;
                        api3 = api4;
                    }
                    arrayMap3 = arrayMap6;
                    arrayMap2 = arrayMap7;
                    z = true;
                    fEMainActivity = this;
                } else {
                    Reward$Adapter reward$Adapter3 = reward$Adapter;
                    ArrayMap arrayMap8 = arrayMap3;
                    ArrayMap arrayMap9 = arrayMap4;
                    Api api6 = api3;
                    Looper looper2 = mainLooper;
                    if (api6 != null) {
                        boolean equals = hashSet.equals(hashSet2);
                        String str3 = api6.zac;
                        if (!equals) {
                            a$$ExternalSyntheticBUOutline0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Must not set scopes in GoogleApiClient.Builder when using ", str3, ". Set account in GoogleSignInOptions.Builder instead."));
                            return;
                        }
                    }
                    fEMainActivity = this;
                    zaazVar = new zaaz(fEMainActivity, new ReentrantLock(), looper2, reward$Adapter3, googleApiAvailability, arrayMap8, arrayList, arrayList2, arrayMap9, zaaz.zaf(arrayMap9.values(), true), arrayList3);
                    Set set = GoogleApiClient.zaa;
                    synchronized (set) {
                        set.add(zaazVar);
                    }
                    zzd zza = zzd.zza(fEMainActivity);
                    zak zakVar = (zak) zza.getCallbackOrNull(zak.class, "AutoManageHelper");
                    if (zakVar == null) {
                        zakVar = new zak(zza);
                    }
                    SparseArray sparseArray = zakVar.zad;
                    int indexOfKey = sparseArray.indexOfKey(1);
                    StringBuilder sb = new StringBuilder(String.valueOf(1).length() + 43);
                    sb.append("Already managing a GoogleApiClient with id 1");
                    zzae.checkState(sb.toString(), indexOfKey < 0);
                    zam zamVar = (zam) zakVar.zab.get();
                    boolean z3 = zakVar.zaa;
                    String valueOf = String.valueOf(zamVar);
                    StringBuilder sb2 = new StringBuilder(JsonLogicResult$Success$$ExternalSyntheticOutline0.m$1(String.valueOf(1).length(), 32, String.valueOf(z3).length(), 1) + valueOf.length());
                    sb2.append("starting AutoManage for client 1 ");
                    sb2.append(z3);
                    sb2.append(" ");
                    sb2.append(valueOf);
                    Log.d("AutoManageHelper", sb2.toString());
                    zaj zajVar = new zaj(zakVar, zaazVar, fEMainActivity);
                    zaazVar.zak.zai(zajVar);
                    sparseArray.put(1, zajVar);
                    if (zakVar.zaa && zamVar == null) {
                        Log.d("AutoManageHelper", "connecting ".concat(zaazVar.toString()));
                        zaazVar.connect();
                    }
                }
            }
        }
        fEMainActivity.mGoogleApiClient = zaazVar;
        fEMainActivity.fragmentManager = fEMainActivity.getSupportFragmentManager();
        fEMainActivity.mAnalytics = FillrAnalyticsServiceBuilder.build();
        fEMainActivity.setContentView(R.layout.fe_embedded_settings_activity);
        View inflate = LayoutInflater.from(fEMainActivity).inflate(R.layout.f_layout_actionbar, (ViewGroup) null);
        fEMainActivity.mCustomAB = inflate;
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R.id.f_menu_burger);
        Toolbar.AnonymousClass4 anonymousClass4 = fEMainActivity.onMenuToggleClicked;
        relativeLayout.setOnClickListener(anonymousClass4);
        fEMainActivity.txtTitle = (TextView) inflate.findViewById(R.id.f_txt_title);
        fEMainActivity.imgLogo = (ImageView) inflate.findViewById(R.id.f_logo);
        fEMainActivity.imbButton = (ImageButton) inflate.findViewById(R.id.f_menu_burger_image);
        fEMainActivity.imgLogo.setOnClickListener(anonymousClass4);
        fEMainActivity.imbButton.setOnClickListener(anonymousClass4);
        fEMainActivity.setSupportActionBar((Toolbar) fEMainActivity.findViewById(R.id.fillr_settings_toolbar));
        ActionBar supportActionBar = fEMainActivity.getSupportActionBar();
        fEMainActivity.mActionbar = supportActionBar;
        if (supportActionBar != null) {
            supportActionBar.setCustomView(inflate);
            fEMainActivity.mActionbar.setDisplayShowCustomEnabled();
            fEMainActivity.mActionbar.setDisplayShowHomeEnabled();
            fEMainActivity.mActionbar.setTitle("");
        }
        fEMainActivity.imgLogo.setVisibility(8);
        fEMainActivity.imbButton.setVisibility(0);
        fEMainActivity.imbButton.setImageResource(R.drawable.f_back_button);
        fEMainActivity.txtTitle.setTextColor(fEMainActivity.getResources().getColor(R.color.com_fillr_browsersdk_dashboard_bg));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(15);
        layoutParams.setMargins((int) ((56.0f * fEMainActivity.getResources().getDisplayMetrics().density) + 0.5f), 0, 0, 0);
        fEMainActivity.txtTitle.setLayoutParams(layoutParams);
        fEMainActivity.setTitle(fEMainActivity.getString(R.string.fillr_autofill_profile));
        FragmentManager fragmentManager = fEMainActivity.fragmentManager;
        if (fragmentManager != null) {
            fragmentManager.mBackStackChangeListeners.add(fEMainActivity);
        }
        fEMainActivity.mActionbar.setBackgroundDrawable(new ColorDrawable(fEMainActivity.getResources().getColor(R.color.gray_bg)));
        fEMainActivity.mActionbar.setStackedBackgroundDrawable(new ColorDrawable(fEMainActivity.getResources().getColor(R.color.gray_bg)));
        FESettingsFragment fESettingsFragment = new FESettingsFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("FESettingsFragment.SHOW_PROFILE", false);
        fESettingsFragment.setArguments(bundle2);
        FragmentManager fragmentManager2 = fEMainActivity.fragmentManager;
        if (fragmentManager2 != null) {
            BackStackRecord backStackRecord = new BackStackRecord(fragmentManager2);
            backStackRecord.replace(R.id.fragment_container, "FESettingsFragment", fESettingsFragment);
            backStackRecord.commit();
        }
        FillrAnalyticsServiceBuilder.build().sendEvent(fEMainActivity, new AnalyticsEvent());
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        zaaz zaazVar = this.mGoogleApiClient;
        if (zaazVar != null) {
            zaazVar.disconnect();
            this.mGoogleApiClient.unregisterConnectionFailedListener(this);
            this.mGoogleApiClient = null;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        onPause$com$fillr$core$BaseActionbarActivity();
    }

    public final void onPause$com$fillr$core$BaseActionbarActivity() {
        super.onPause();
        this.mbIsActive = false;
        Box box = this.mAnalytics;
        if (box != null) {
            FillrAPI.getInstance(this, (String) box.mCenter).flush();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        onResume$com$fillr$core$BaseActionbarActivity();
    }

    public final void onResume$com$fillr$core$BaseActionbarActivity() {
        super.onResume();
        this.mbIsActive = true;
    }

    public final void pushFragmentOntoStack(BaseFragment baseFragment, String str) {
        FragmentManager fragmentManager = this.fragmentManager;
        if (fragmentManager == null) {
            if (fragmentManager == null) {
                finish();
            }
        } else {
            BackStackRecord backStackRecord = new BackStackRecord(fragmentManager);
            backStackRecord.doAddOp(R.id.fragment_container, baseFragment, str, 1);
            backStackRecord.addToBackStack(str);
            backStackRecord.commit();
        }
    }

    public final void setTitle(String str) {
        if (str == null || str.trim().isEmpty() || this.imgLogo == null) {
            return;
        }
        this.txtTitle.setVisibility(0);
        this.txtTitle.setText(str);
        this.imgLogo.setVisibility(8);
    }
}
