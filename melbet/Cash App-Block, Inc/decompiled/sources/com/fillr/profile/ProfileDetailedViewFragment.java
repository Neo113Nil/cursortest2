package com.fillr.profile;

import android.app.AlertDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.biometric.FingerprintDialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.bugsnag.android.Client;
import com.fillr.analytics.AnalyticsEvent;
import com.fillr.browsersdk.adapters.FillrBaseAdapter$2;
import com.fillr.core.BaseFragment;
import com.fillr.core.analytics.FillrAnalyticsServiceBuilder;
import com.fillr.core.utilities.AppPreferenceStore;
import com.fillr.embedded.profile.FEMainActivity;
import com.fillr.m1;
import com.fillr.profile.ProfileDetailedViewFragment;
import com.fillr.profile.adapter.ProfileAdapter;
import com.google.android.gms.dynamic.zae;
import com.google.android.gms.tasks.zzb;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.squareup.cash.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import net.oneformapp.ProfileStore_;
import net.oneformapp.helper.DialogUtil$1;
import net.oneformapp.schema.Element;
import net.oneformapp.schema.Schema_;

/* loaded from: classes4.dex */
public class ProfileDetailedViewFragment extends BaseFragment {
    public List allElements;
    public AppPreferenceStore mAppPreferenceStore;
    public String mElementPath;
    public Toolbar.AnonymousClass1 profileManager;
    public Schema_ schema;
    public boolean isParentArray = false;
    public Element parent = null;
    public Element root = null;
    public ProfileStore_ profile = null;
    public LinearLayout parentContainer = null;
    public ProfileAdapter viewCreator = null;
    public final FingerprintDialogFragment.AnonymousClass2 onDontShowClickedCreditCardSecurityPrompt = new FingerprintDialogFragment.AnonymousClass2(this, 2);
    public final DialogUtil$1 onOkClickedCreditCardSecurityPrompt = new DialogUtil$1(1);
    public FloatingActionButton btnAddArray = null;
    public final Toolbar.AnonymousClass4 onArrayClicked = new Toolbar.AnonymousClass4(this, 6);
    public final m1 onArrayFunctions = new m1(this, 16);

    public final void cleanupEmptyElements() {
        Element element = this.root;
        if (element == null || !element.actingElement().isFieldArray) {
            return;
        }
        ArrayList readAllArrayElemetsForNameSpace = this.profileManager.readAllArrayElemetsForNameSpace((this.root.actingElement().isArrayType && this.root.getChildrenCount() == 1) ? this.root.getFirstChildElement() : this.root);
        if (readAllArrayElemetsForNameSpace.size() <= 0 || readAllArrayElemetsForNameSpace.size() <= 0 || this.profileManager == null || this.profile == null) {
            return;
        }
        for (int i = 0; i < readAllArrayElemetsForNameSpace.size(); i++) {
            Element element2 = (Element) readAllArrayElemetsForNameSpace.get(i);
            Toolbar.AnonymousClass1 anonymousClass1 = this.profileManager;
            ProfileStore_ profileStore_ = this.profile;
            anonymousClass1.getClass();
            if (!Toolbar.AnonymousClass1.arrayHasData(profileStore_, element2) && element2 != null) {
                this.profileManager.removeProfileData(this.schema.getElement(element2.actingElement().parentPathKey), element2, getActivity());
            }
        }
    }

    public final void constructViews() {
        final ProfileAdapter profileAdapter = this.viewCreator;
        List list = this.allElements;
        LinearLayout linearLayout = this.parentContainer;
        LayoutInflater layoutInflater = profileAdapter.mLayoutInflater;
        SparseArray sparseArray = profileAdapter.allTitleViews;
        sparseArray.clear();
        profileAdapter.allChildViews.clear();
        profileAdapter.groupElements = list;
        linearLayout.removeAllViews();
        for (int i = 0; i < profileAdapter.groupElements.size(); i++) {
            Element element = (Element) profileAdapter.groupElements.get(i);
            if (element != null) {
                if (element.actingElement().isArrayType) {
                    int i2 = 2;
                    if (profileAdapter.viewCreatorType == 2) {
                        View inflate = layoutInflater.inflate(R.layout.f_layout_array_add, (ViewGroup) null);
                        ((TextView) inflate.findViewById(R.id.f_txtArrayAddLabel)).setText("+ Add New " + element.getDisplayName());
                        linearLayout.addView(inflate);
                        inflate.setTag(Integer.valueOf(i));
                        sparseArray.put(i, inflate);
                        inflate.setOnClickListener(new zae(i2, profileAdapter, element));
                    }
                }
                if (!element.hasChildElements() || element.isNonRecursiveType()) {
                    profileAdapter.addChildViewToParentContainer(linearLayout, element, i, -1);
                } else {
                    ViewGroup viewGroup = (ViewGroup) layoutInflater.inflate(R.layout.profile_view_row_title, (ViewGroup) null);
                    viewGroup.setTag(Integer.valueOf(i));
                    linearLayout.addView(viewGroup);
                    profileAdapter.setTitleValue(viewGroup, element);
                    sparseArray.put(i, viewGroup);
                    viewGroup.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.fillr.profile.adapter.ProfileAdapter.5
                        public AnonymousClass5() {
                        }

                        @Override // android.view.View.OnLongClickListener
                        public final boolean onLongClick(View view) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            ProfileAdapter profileAdapter2 = ProfileAdapter.this;
                            if (profileAdapter2.arrayFunctions != null && intValue < profileAdapter2.groupElements.size()) {
                                m1 m1Var = profileAdapter2.arrayFunctions;
                                Element element2 = (Element) profileAdapter2.groupElements.get(intValue);
                                ProfileDetailedViewFragment profileDetailedViewFragment = (ProfileDetailedViewFragment) m1Var.a;
                                Element element3 = profileDetailedViewFragment.schema.getElement(element2.actingElement().parentPathKey);
                                if (element3 != null && element3.actingElement().isArrayType && element2.actingElement().isFieldArray) {
                                    FragmentActivity activity = profileDetailedViewFragment.getActivity();
                                    String string2 = profileDetailedViewFragment.getString(R.string.remove_array, element2.getDisplayName());
                                    String string3 = profileDetailedViewFragment.getString(R.string.array_delete_confirmation);
                                    FillrBaseAdapter$2 fillrBaseAdapter$2 = new FillrBaseAdapter$2(m1Var, element2, 1);
                                    ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(activity, R.style.cust_dialog);
                                    AlertDialog.Builder builder = new AlertDialog.Builder(contextThemeWrapper);
                                    builder.setTitle(string2);
                                    builder.setPositiveButton(contextThemeWrapper.getString(R.string.dialog_btn_yes), fillrBaseAdapter$2);
                                    builder.setNegativeButton(contextThemeWrapper.getString(R.string.dialog_btn_no), new DialogUtil$1(0));
                                    builder.setMessage(string3);
                                    AlertDialog create = builder.create();
                                    create.show();
                                    Button button = create.getButton(-1);
                                    if (button != null) {
                                        button.setTextColor(-1);
                                    }
                                    Button button2 = create.getButton(-2);
                                    if (button2 != null) {
                                        button2.setTextColor(-1);
                                    }
                                }
                            }
                            return false;
                        }
                    });
                    viewGroup.setOnClickListener(profileAdapter.onGroupClicked);
                }
            }
        }
        this.viewCreator.textChangeListener = new zzb(this, 13);
        boolean z = this.isParentArray;
        FloatingActionButton floatingActionButton = this.btnAddArray;
        if (z) {
            floatingActionButton.show(null, true);
        } else {
            floatingActionButton.hide(null, true);
        }
    }

    public final boolean isChildElementCollapsed() {
        ProfileAdapter profileAdapter = this.viewCreator;
        for (Map.Entry entry : profileAdapter.isExpanded.entrySet()) {
            boolean booleanValue = ((Boolean) entry.getValue()).booleanValue();
            View view = (View) profileAdapter.allTitleViews.get(((Integer) entry.getKey()).intValue());
            if (booleanValue) {
                profileAdapter.expandOrContractElements(view, ((Integer) entry.getKey()).intValue());
                return true;
            }
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 0) {
            new Handler().postDelayed(new Client.AnonymousClass4(this, intent, false, 16), 300L);
        }
    }

    @Override // com.fillr.core.BaseFragment
    public final void onBackStackChanged() {
        constructViews();
        FEMainActivity mainActivity = getMainActivity();
        if (this.mElementPath == null || mainActivity == null) {
            return;
        }
        mainActivity.setTitle(this.root.getDisplayName());
    }

    @Override // com.fillr.core.BaseFragment, com.fillr.core.apiclientv2.ConsumerAPIClientListener
    public final boolean onBeforeAPICallback() {
        return true;
    }

    @Override // com.fillr.core.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.mElementPath = getArguments().getString("elementpath");
            this.isParentArray = getArguments().getBoolean("is_parent_array");
        }
        setHasOptionsMenu(true);
        this.viewCreator = new ProfileAdapter(getActivity(), this, this.onArrayFunctions);
        this.schema = Schema_.getInstance_(getActivity());
        ProfileStore_ instance_ = ProfileStore_.getInstance_(getActivity());
        this.profile = instance_;
        this.profileManager = new Toolbar.AnonymousClass1(instance_);
        FragmentActivity activity = getActivity();
        new AppPreferenceStore(activity);
        Schema_.getInstance_(activity);
        this.viewCreator.getClass();
        this.root = this.schema.getElement(this.mElementPath);
        cleanupEmptyElements();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f_fragment_profile_detailed2, viewGroup, false);
        this.parentContainer = (LinearLayout) inflate.findViewById(R.id.main_container);
        FloatingActionButton floatingActionButton = (FloatingActionButton) inflate.findViewById(R.id.btnAddArray);
        this.btnAddArray = floatingActionButton;
        floatingActionButton.setOnClickListener(this.onArrayClicked);
        AnalyticsEvent analyticsEvent = new AnalyticsEvent();
        analyticsEvent.action = "SELECT";
        this.profile.getProfileCompletePercentage(this.schema);
        SharedPreferences sharedPreferences = this.mPreferenceStore.mPreferences;
        if (sharedPreferences != null) {
            sharedPreferences.getInt("F_NUMBER_OF_FORMS_FILLED", 0);
        }
        FillrAnalyticsServiceBuilder.build().sendEvent(getActivity(), analyticsEvent);
        FEMainActivity mainActivity = getMainActivity();
        if (this.mElementPath != null && mainActivity != null) {
            mainActivity.setTitle(this.root.getDisplayName());
        }
        refreshData();
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        cleanupEmptyElements();
    }

    @Override // com.fillr.core.BaseFragment
    public final void onManualEntry(Element element) {
        if (element != null) {
            ProfileAdapter profileAdapter = this.viewCreator;
            String str = element.actingElement().pathKey;
            for (int i = 0; i < profileAdapter.groupElements.size(); i++) {
                Element element2 = (Element) profileAdapter.groupElements.get(i);
                if (str != null && str.equals(element2.actingElement().pathKey)) {
                    SparseArray sparseArray = profileAdapter.allTitleViews;
                    if (i < 0 || i >= sparseArray.size()) {
                        return;
                    }
                    profileAdapter.onGroupClicked.onClick((View) sparseArray.get(i));
                    return;
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        AppPreferenceStore appPreferenceStore;
        super.onViewCreated(view, bundle);
        FEMainActivity mainActivity = getMainActivity();
        if (mainActivity != null) {
            this.mAppPreferenceStore = mainActivity.preferenceStore;
        }
        if (isAdded() && this.isParentArray && this.parent != null && getString(R.string.schema_creditcard).contains(this.parent.actingElement().pathKey) && (appPreferenceStore = this.mAppPreferenceStore) != null) {
            SharedPreferences sharedPreferences = appPreferenceStore.mPreferences;
            if (sharedPreferences != null ? sharedPreferences.getBoolean("F_HAS_CREDIT_CARD_SECURITY_PROMPT", true) : true) {
                FragmentActivity activity = getActivity();
                String string2 = getString(R.string.creditcard_security_dialog_title);
                String string3 = getString(R.string.fillr_ok);
                String string4 = getString(R.string.creditcard_security_dialog_negative);
                AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper(activity, R.style.cust_dialog));
                builder.setTitle(string2);
                builder.setPositiveButton(string3, this.onOkClickedCreditCardSecurityPrompt);
                FingerprintDialogFragment.AnonymousClass2 anonymousClass2 = this.onDontShowClickedCreditCardSecurityPrompt;
                if (anonymousClass2 == null) {
                    builder.setNegativeButton(string4, new DialogUtil$1(2));
                } else {
                    builder.setNegativeButton(string4, anonymousClass2);
                }
                builder.setMessage("All autofill data is stored securely using 256-bit AES encryption.");
                builder.create().show();
            }
        }
        new Handler().postDelayed(new Client.AnonymousClass7(this, 20), 300L);
    }

    public final int readAllArrayElements() {
        Element element = this.parent;
        if (this.root.isAddress()) {
            refreshData();
            return 0;
        }
        if (element == null) {
            return 0;
        }
        int size = this.profileManager.readAllArrayElemetsForNameSpace(element.getFirstChildElement()).size();
        this.parentContainer.removeAllViews();
        refreshData();
        return size;
    }

    public final void refreshData() {
        Element element = this.schema.getElement(this.root.actingElement().parentPathKey);
        this.parent = element;
        Element element2 = this.root;
        if (element2 != null) {
            if (element == null && element2.actingElement().isArrayType && this.root.getChildrenCount() == 1) {
                Element element3 = this.root;
                this.parent = element3;
                this.root = element3.getFirstChildElement();
            }
            if (this.root.actingElement().isFieldArray) {
                this.allElements = this.profileManager.readAllArrayElemetsForNameSpace(this.root);
            } else if (this.root.isAddress()) {
                Toolbar.AnonymousClass1 anonymousClass1 = this.profileManager;
                Element element4 = this.root;
                anonymousClass1.getClass();
                ArrayList arrayList = new ArrayList();
                if (element4 != null && element4.actingElement().isArrayType && element4.isAddress()) {
                    for (Element element5 : element4.actingElement().children) {
                        if (element5 != null) {
                            break;
                        }
                    }
                }
                element5 = null;
                if (element5 != null) {
                    arrayList.addAll(anonymousClass1.readAllArrayElemetsForNameSpace(element5));
                }
                this.allElements = arrayList;
            } else {
                this.allElements = this.root.actingElement().children;
            }
            constructViews();
        }
    }

    @Override // com.fillr.core.BaseFragment
    public final void refreshView() {
        refreshData();
    }
}
