package com.fillr.browsersdk.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.appcompat.widget.SearchView;
import androidx.emoji2.text.MetadataRepo;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.appsflyer.AdRevenueScheme;
import com.bugsnag.android.Client;
import com.fillr.analytics.AnalyticsEvent;
import com.fillr.browsersdk.adapters.PlaceAutocompleteAdapter;
import com.fillr.core.BaseFragment;
import com.fillr.core.analytics.FillrAnalyticsServiceBuilder;
import com.fillr.core.apiclientv2.ConsumerAPIClientListener;
import com.fillr.core.apiclientv2.Repository;
import com.fillr.core.model.FillrAddressComponent;
import com.fillr.core.model.FillrAddressComponentList;
import com.fillr.core.model.ModelBase;
import com.fillr.e0;
import com.fillr.embedded.profile.FEMainActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.squareup.cash.R;
import java.util.HashMap;
import java.util.Iterator;
import net.oneformapp.ProfileStore_;
import net.oneformapp.schema.Element;
import net.oneformapp.schema.Schema_;

/* loaded from: classes4.dex */
public class AddressSelectionDialog extends DialogFragment implements ConsumerAPIClientListener {
    public MetadataRepo addressSelectionDialogListener;
    public Element element;
    public boolean inProgress;
    public PlaceAutocompleteAdapter mAdapter;
    public e0 mAddressUtil;
    public final SearchView.AnonymousClass8 mAutocompleteClickListener = new SearchView.AnonymousClass8(this, 2);
    public AutoCompleteTextView mAutocompleteView;
    public Dialog mDialog;
    public ProgressBar mPlaceProgress;
    public Repository repository;
    public View viewBlank;

    @Override // com.fillr.core.apiclientv2.ConsumerAPIClientListener
    public final boolean onBeforeAPICallback() {
        return true;
    }

    @Override // com.fillr.core.apiclientv2.ConsumerAPIClientListener
    public final void onConsumerAPICallProgressStart(String str) {
        this.inProgress = true;
    }

    @Override // com.fillr.core.apiclientv2.ConsumerAPIClientListener
    public final void onConsumerAPIData(int i, ModelBase modelBase) {
        boolean z;
        Element findLeafElementWithSuffix;
        Element findLeafElementWithSuffix2;
        this.inProgress = false;
        if (modelBase instanceof FillrAddressComponentList) {
            FillrAddressComponentList fillrAddressComponentList = (FillrAddressComponentList) modelBase;
            e0 e0Var = this.mAddressUtil;
            Context context = (Context) e0Var.b;
            Element element = fillrAddressComponentList.mSelectedAddress;
            Iterator it = fillrAddressComponentList.mComponentList.iterator();
            ProfileStore_ profileStore_ = (ProfileStore_) e0Var.a;
            if (element == null) {
                z = false;
            } else {
                for (Element element2 : element.actingElement().children) {
                    element2.setElementValue("");
                    profileStore_.setData(element2.actingElement().pathKey, "");
                }
                Element element3 = ((Schema_) e0Var.h).getElement(element.getFormattedPathKey());
                element3.actingElement().pathKey = element.actingElement().pathKey;
                HashMap hashMap = new HashMap();
                hashMap.put("subpremise", "UnitNumber");
                hashMap.put("street_number", "StreetNumber");
                hashMap.put("route", "StreetName");
                hashMap.put("locality", "Suburb");
                hashMap.put("postal_town", "Suburb");
                hashMap.put("administrative_area_level_1", "AdministrativeArea");
                hashMap.put(AdRevenueScheme.COUNTRY, "Country");
                hashMap.put("postal_code", "PostalCode");
                z = false;
                while (it.hasNext()) {
                    FillrAddressComponent fillrAddressComponent = (FillrAddressComponent) it.next();
                    String longName = fillrAddressComponent.getLongName();
                    Iterator it2 = fillrAddressComponent.getTypes().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            String str = (String) it2.next();
                            if (hashMap.containsKey(str) && (findLeafElementWithSuffix = Element.findLeafElementWithSuffix((String) hashMap.get(str), element3)) != null) {
                                if (str.equals("route") && (findLeafElementWithSuffix2 = Element.findLeafElementWithSuffix("StreetType", element3)) != null) {
                                    profileStore_.setData(element3.getAppendablePathKey() + "StreetType", e0Var.getTypeFromStreetName(longName, findLeafElementWithSuffix2));
                                    if (longName != null) {
                                        String[] split = longName.split(" ");
                                        if (split.length > 1) {
                                            StringBuilder sb = new StringBuilder();
                                            for (int i2 = 0; i2 < split.length - 1; i2++) {
                                                if (i2 == 0) {
                                                    sb.append(split[i2]);
                                                } else {
                                                    sb.append(" ");
                                                    sb.append(split[i2]);
                                                }
                                            }
                                            longName = sb.toString();
                                        }
                                    }
                                }
                                profileStore_.setData(element3.getAppendablePathKey() + findLeafElementWithSuffix.actingElement().elementName, longName);
                                element3.getAppendablePathKey();
                                String str2 = findLeafElementWithSuffix.actingElement().elementName;
                                AnalyticsEvent analyticsEvent = new AnalyticsEvent();
                                analyticsEvent.action = "SAVE NEW DATA";
                                FillrAnalyticsServiceBuilder.build().sendEvent(context, analyticsEvent);
                                z = true;
                            }
                        }
                    }
                }
            }
            profileStore_.store();
            BaseFragment baseFragment = (BaseFragment) e0Var.c;
            if (baseFragment != null) {
                baseFragment.refreshView();
            }
            if (!z && context != null) {
                Toast.makeText(context, context.getString(R.string.address_error), 0).show();
            }
            dismiss();
        }
    }

    @Override // com.fillr.core.apiclientv2.ConsumerAPIClientListener
    public final void onConsumerAPIError(int i) {
        this.inProgress = false;
    }

    @Override // com.fillr.core.apiclientv2.ConsumerAPIClientListener
    public final void onConsumerAPILog(String str) {
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.element = (Element) arguments.getSerializable("element");
        }
        this.repository = new Repository(new Repository(this));
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        View inflate = ((LayoutInflater) getActivity().getSystemService("layout_inflater")).inflate(R.layout.com_fillr_address_autocomplete_fragment, (ViewGroup) null);
        Dialog dialog = new Dialog(getActivity(), R.style.transparent_dialog_fullscreen);
        this.mDialog = dialog;
        dialog.setContentView(inflate);
        this.mDialog.setCancelable(true);
        return this.mDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        final int i = 0;
        View inflate = layoutInflater.inflate(R.layout.com_fillr_address_autocomplete_fragment, viewGroup, false);
        e0 e0Var = new e0(getActivity(), ProfileStore_.getInstance_(getActivity()));
        this.mAddressUtil = e0Var;
        e0Var.i = this.element;
        Fragment targetFragment = getTargetFragment();
        if (targetFragment != null) {
            this.mAddressUtil.c = (BaseFragment) targetFragment;
        }
        this.mAutocompleteView = (AutoCompleteTextView) inflate.findViewById(R.id.autocomplete_places);
        this.mPlaceProgress = (ProgressBar) inflate.findViewById(R.id.place_progress);
        View findViewById = inflate.findViewById(R.id.btnBack);
        this.viewBlank = inflate.findViewById(R.id.viewBlank);
        findViewById.setOnClickListener(new View.OnClickListener(this) { // from class: com.fillr.browsersdk.dialog.AddressSelectionDialog.2
            public final /* synthetic */ AddressSelectionDialog this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseFragment baseFragment;
                int i2 = i;
                AddressSelectionDialog addressSelectionDialog = this.this$0;
                switch (i2) {
                    case 0:
                        addressSelectionDialog.dismiss();
                        break;
                    case 1:
                        addressSelectionDialog.dismiss();
                        break;
                    default:
                        e0 e0Var2 = addressSelectionDialog.mAddressUtil;
                        if (e0Var2 != null && (baseFragment = (BaseFragment) e0Var2.c) != null) {
                            baseFragment.onManualEntry((Element) e0Var2.i);
                        }
                        addressSelectionDialog.dismiss();
                        break;
                }
            }
        });
        final int i2 = 1;
        this.viewBlank.setOnClickListener(new View.OnClickListener(this) { // from class: com.fillr.browsersdk.dialog.AddressSelectionDialog.2
            public final /* synthetic */ AddressSelectionDialog this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseFragment baseFragment;
                int i22 = i2;
                AddressSelectionDialog addressSelectionDialog = this.this$0;
                switch (i22) {
                    case 0:
                        addressSelectionDialog.dismiss();
                        break;
                    case 1:
                        addressSelectionDialog.dismiss();
                        break;
                    default:
                        e0 e0Var2 = addressSelectionDialog.mAddressUtil;
                        if (e0Var2 != null && (baseFragment = (BaseFragment) e0Var2.c) != null) {
                            baseFragment.onManualEntry((Element) e0Var2.i);
                        }
                        addressSelectionDialog.dismiss();
                        break;
                }
            }
        });
        View findViewById2 = inflate.findViewById(R.id.txtEnterManual);
        if (findViewById2 instanceof FloatingActionButton) {
            ((FloatingActionButton) findViewById2).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FFFFFF")));
        }
        final int i3 = 2;
        findViewById2.setOnClickListener(new View.OnClickListener(this) { // from class: com.fillr.browsersdk.dialog.AddressSelectionDialog.2
            public final /* synthetic */ AddressSelectionDialog this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseFragment baseFragment;
                int i22 = i3;
                AddressSelectionDialog addressSelectionDialog = this.this$0;
                switch (i22) {
                    case 0:
                        addressSelectionDialog.dismiss();
                        break;
                    case 1:
                        addressSelectionDialog.dismiss();
                        break;
                    default:
                        e0 e0Var2 = addressSelectionDialog.mAddressUtil;
                        if (e0Var2 != null && (baseFragment = (BaseFragment) e0Var2.c) != null) {
                            baseFragment.onManualEntry((Element) e0Var2.i);
                        }
                        addressSelectionDialog.dismiss();
                        break;
                }
            }
        });
        FEMainActivity fEMainActivity = (FEMainActivity) getActivity();
        if (fEMainActivity.mGoogleApiClient == null) {
            dismiss();
            return inflate;
        }
        MetadataRepo metadataRepo = this.addressSelectionDialogListener;
        PlaceAutocompleteAdapter placeAutocompleteAdapter = new PlaceAutocompleteAdapter(fEMainActivity, android.R.layout.simple_expandable_list_item_2, android.R.id.text1);
        placeAutocompleteAdapter.mAutocompleteClient = new PlaceAutocompleteAdapter.AddressAutocompletionClient();
        placeAutocompleteAdapter.mAddressSelectionDialogListener = metadataRepo;
        this.mAdapter = placeAutocompleteAdapter;
        this.mAutocompleteView.setAdapter(placeAutocompleteAdapter);
        this.mAutocompleteView.setOnItemClickListener(this.mAutocompleteClickListener);
        FragmentActivity activity = getActivity();
        AutoCompleteTextView autoCompleteTextView = this.mAutocompleteView;
        autoCompleteTextView.postDelayed(new Client.AnonymousClass4(14, activity, autoCompleteTextView), 200L);
        return inflate;
    }
}
