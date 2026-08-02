package com.google.android.libraries.places.widget;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.tracing.Trace;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.internal.zznv;
import com.squareup.cash.R;

/* loaded from: classes4.dex */
public class AutocompleteActivity extends AppCompatActivity {
    public AutocompleteActivity() {
        super(R.layout.places_autocomplete_activity);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        try {
            Trace.checkState("Places must be initialized.", Places.isInitialized());
            Trace.checkState("Cannot find caller. startActivityForResult should be used.", getCallingActivity() != null);
            getIntent().getParcelableExtra("places/AutocompleteOptions").getClass();
            throw new ClassCastException();
        } catch (Error | RuntimeException e) {
            zznv.zzb(e);
            throw e;
        }
    }
}
