package com.google.android.libraries.places.widget.internal.autocomplete.ui;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageButton;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.google.android.libraries.places.internal.zzex;
import com.google.android.libraries.places.internal.zznv;
import com.google.android.libraries.places.internal.zzok;
import com.google.android.libraries.places.internal.zzqr;
import com.google.android.libraries.places.internal.zzwr;
import com.squareup.cash.R;

/* loaded from: classes4.dex */
public final class BaseAutocompleteImplFragment extends Fragment {
    public EditText zzj;
    public View zzl;
    public View zzm;
    public View zzn;
    public final SearchView.AnonymousClass10 zzt;
    public boolean zzu;
    public final int zzv;

    public BaseAutocompleteImplFragment(int i, PlacesClient placesClient, zzok zzokVar, zzqr zzqrVar, zzex zzexVar, int i2) {
        super(i);
        this.zzt = new SearchView.AnonymousClass10(this, 2);
        this.zzu = false;
        this.zzv = i2;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            throw null;
        } catch (RuntimeException e) {
            zznv.zzb(e);
            throw e;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("arg-show-legal-disclosures", this.zzu);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ActionBar supportActionBar;
        try {
            FragmentActivity requireActivity = requireActivity();
            Window window = requireActivity.getWindow();
            if ((requireActivity instanceof AppCompatActivity) && (supportActionBar = ((AppCompatActivity) requireActivity).getSupportActionBar()) != null) {
                supportActionBar.hide();
            }
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(requireActivity, this.zzv);
            TypedValue typedValue = new TypedValue();
            if (contextThemeWrapper.getTheme().resolveAttribute(R.attr.placesColorSurface, typedValue, true)) {
                window.setBackgroundDrawable(new ColorDrawable(typedValue.data));
            }
            this.zzj = (EditText) view.findViewById(R.id.autocomplete_search_bar_edit_text);
            this.zzl = view.findViewById(R.id.autocomplete_back_image_button);
            this.zzm = view.findViewById(R.id.autocomplete_clear_image_button);
            this.zzn = view.findViewById(R.id.autocomplete_google_maps_attribution_image_separator);
            ((ImageButton) view.findViewById(R.id.autocomplete_disclosure_icon)).setOnClickListener(new Toolbar.AnonymousClass4(this, 7));
            zzwr.zze(requireContext(), R.string.autocomplete_no_matching_results_for_query);
            this.zzj.addTextChangedListener(this.zzt);
            this.zzj.setOnFocusChangeListener(new zzl(1));
            throw null;
        } catch (Error | RuntimeException e) {
            zznv.zzb(e);
            throw e;
        }
    }

    public /* synthetic */ BaseAutocompleteImplFragment(int i, PlacesClient placesClient, zzok zzokVar, zzqr zzqrVar, zzex zzexVar, int i2, byte[] bArr) {
        this(i, placesClient, zzokVar, zzqrVar, zzexVar, i2);
    }
}
