package com.google.android.libraries.places.widget.internal.autocomplete.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.google.android.libraries.places.internal.zzex;
import com.google.android.libraries.places.internal.zznv;
import com.google.android.libraries.places.internal.zzok;
import com.google.android.libraries.places.internal.zzqr;
import com.squareup.cash.R;

/* loaded from: classes4.dex */
public final class AutocompleteImplFragment extends Fragment {
    public EditText zzh;
    public View zzj;
    public View zzk;
    public View zzl;
    public View zzm;
    public View zzn;
    public View zzo;
    public View zzp;
    public View zzq;
    public final SearchView.AnonymousClass10 zzu;

    public AutocompleteImplFragment(int i, PlacesClient placesClient, zzok zzokVar, zzqr zzqrVar, zzex zzexVar) {
        super(i);
        this.zzu = new SearchView.AnonymousClass10(this, 3);
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
    public final void onDestroy() {
        super.onDestroy();
        throw null;
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
    public final void onViewCreated(View view, Bundle bundle) {
        try {
            this.zzh = (EditText) view.findViewById(R.id.places_autocomplete_search_bar);
            this.zzj = view.findViewById(R.id.places_autocomplete_back_button);
            this.zzk = view.findViewById(R.id.places_autocomplete_clear_button);
            this.zzl = view.findViewById(R.id.places_autocomplete_search_bar_separator);
            this.zzm = view.findViewById(R.id.places_autocomplete_progress);
            this.zzn = view.findViewById(R.id.places_autocomplete_try_again_progress);
            this.zzo = view.findViewById(R.id.places_autocomplete_powered_by_google);
            this.zzp = view.findViewById(R.id.places_autocomplete_powered_by_google_separator);
            this.zzq = view.findViewById(R.id.places_autocomplete_sad_cloud);
            this.zzh.addTextChangedListener(this.zzu);
            this.zzh.setOnFocusChangeListener(new zzl(0));
            throw null;
        } catch (Error | RuntimeException e) {
            zznv.zzb(e);
            throw e;
        }
    }

    public /* synthetic */ AutocompleteImplFragment(int i, PlacesClient placesClient, zzok zzokVar, zzqr zzqrVar, zzex zzexVar, byte[] bArr) {
        this(i, placesClient, zzokVar, zzqrVar, zzexVar);
    }
}
