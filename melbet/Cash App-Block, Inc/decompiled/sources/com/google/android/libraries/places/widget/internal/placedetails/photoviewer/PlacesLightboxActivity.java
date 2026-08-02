package com.google.android.libraries.places.widget.internal.placedetails.photoviewer;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.media3.extractor.mkv.Sniffer;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.CompositeOnPageChangeCallback;
import androidx.viewpager2.widget.ViewPager2;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$None;
import com.google.android.filament.Renderer;
import com.google.android.libraries.places.R$styleable;
import com.google.android.libraries.places.internal.zzpo;
import com.google.android.libraries.places.internal.zzqi;
import com.google.android.libraries.places.widget.internal.placedetails.zzb;
import com.squareup.cash.R;
import com.squareup.cash.androidsvg.SVGAndroidRenderer;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.NotNullVar;
import kotlin.reflect.KProperty;

/* loaded from: classes4.dex */
public final class PlacesLightboxActivity extends AppCompatActivity {
    public static final /* synthetic */ KProperty[] zza = {Reflection.factory.mutableProperty1(new MutablePropertyReference1Impl(PlacesLightboxActivity.class, "themeResId", "getThemeResId()I", 0))};
    public ViewPager2 zzc;
    public ImageView zzd;
    public TextView zze;
    public ArrayList zzf;
    public zzb zzg;
    public int zzh;
    public int zzi = -1;
    public final NotNullVar zzj;
    public Sniffer zzk;

    public PlacesLightboxActivity() {
        Delegates.INSTANCE.getClass();
        this.zzj = new NotNullVar();
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        zzb zzbVar = this.zzg;
        if (zzbVar != null) {
            zzbVar.zzp(this, 5, Integer.valueOf(this.zzh));
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        RecyclerView.Adapter adapter;
        Bundle extras = getIntent().getExtras();
        if (extras == null || !extras.containsKey("extra-theme-res-id") || !extras.containsKey("extra-photo-page-data-list") || !extras.containsKey("extra-analytics-reporter") || !extras.containsKey("extra-start-index")) {
            Log.e("PlacesLightboxActivity", "The activity was started without required extras. Finishing.");
            super.onCreate(bundle);
            finish();
            return;
        }
        final int i = 0;
        this.zzh = bundle != null ? bundle.getInt("extra-number-of-photos-shown-in-gallery") : 0;
        this.zzi = bundle != null ? bundle.getInt("extra-previous-photo-index") : -1;
        this.zzj.setValue(this, zza[0], Integer.valueOf(extras.getInt("extra-theme-res-id")));
        setTheme(zzn());
        super.onCreate(bundle);
        setContentView(R.layout.places_lightbox_activity);
        this.zzk = new Sniffer(this, zzn(), 20);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.hide();
        }
        EdgeToEdge.enable$default(this);
        View findViewById = findViewById(R.id.photo_pager);
        findViewById.getClass();
        this.zzc = (ViewPager2) findViewById;
        View findViewById2 = findViewById(R.id.profile_image);
        findViewById2.getClass();
        this.zzd = (ImageView) findViewById2;
        View findViewById3 = findViewById(R.id.user_name);
        findViewById3.getClass();
        this.zze = (TextView) findViewById3;
        PageSelectionIndicator pageSelectionIndicator = (PageSelectionIndicator) findViewById(R.id.selection_indicator);
        View findViewById4 = findViewById(R.id.close_button);
        View findViewById5 = findViewById(R.id.more_button);
        View findViewById6 = findViewById(R.id.user_profile_container);
        this.zzg = (zzb) zzpo.zza(extras, "extra-analytics-reporter", zzb.class);
        final int i2 = 2;
        findViewById4.setOnClickListener(new View.OnClickListener(this) { // from class: com.google.android.libraries.places.widget.internal.placedetails.photoviewer.zzq
            public final /* synthetic */ PlacesLightboxActivity zza;

            {
                this.zza = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                int i3 = i2;
                final PlacesLightboxActivity placesLightboxActivity = this.zza;
                switch (i3) {
                    case 0:
                        view.getClass();
                        PopupMenu popupMenu = new PopupMenu(placesLightboxActivity, view);
                        popupMenu.getMenuInflater().inflate(R.menu.photo_more_menu, popupMenu.getMenu());
                        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: com.google.android.libraries.places.widget.internal.placedetails.photoviewer.zzs
                            @Override // android.widget.PopupMenu.OnMenuItemClickListener
                            public final boolean onMenuItemClick(MenuItem menuItem) {
                                String str2;
                                KProperty[] kPropertyArr = PlacesLightboxActivity.zza;
                                menuItem.getClass();
                                if (menuItem.getItemId() != R.id.report_a_photo) {
                                    return false;
                                }
                                PlacesLightboxActivity placesLightboxActivity2 = PlacesLightboxActivity.this;
                                ArrayList arrayList = placesLightboxActivity2.zzf;
                                if (arrayList == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("pageDataList");
                                    throw null;
                                }
                                ViewPager2 viewPager2 = placesLightboxActivity2.zzc;
                                if (viewPager2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("viewPager");
                                    throw null;
                                }
                                zzd zzdVar = (zzd) CollectionsKt.getOrNull(viewPager2.mCurrentItem, arrayList);
                                if (zzdVar == null || (str2 = zzdVar.zzc) == null) {
                                    return true;
                                }
                                zzb zzbVar = placesLightboxActivity2.zzg;
                                if (zzbVar == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("analyticsReporter");
                                    throw null;
                                }
                                zzbVar.zzp(placesLightboxActivity2, 4, null);
                                try {
                                    placesLightboxActivity2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str2)));
                                    return true;
                                } catch (ActivityNotFoundException unused) {
                                    new zzqi(placesLightboxActivity2, placesLightboxActivity2.zzn()).show();
                                    return true;
                                }
                            }
                        });
                        popupMenu.show();
                        return;
                    case 1:
                        ArrayList arrayList = placesLightboxActivity.zzf;
                        if (arrayList == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("pageDataList");
                            throw null;
                        }
                        ViewPager2 viewPager2 = placesLightboxActivity.zzc;
                        if (viewPager2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
                            throw null;
                        }
                        zzd zzdVar = (zzd) CollectionsKt.getOrNull(viewPager2.mCurrentItem, arrayList);
                        if (zzdVar == null || (str = zzdVar.zzf) == null) {
                            return;
                        }
                        try {
                            placesLightboxActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                            return;
                        } catch (ActivityNotFoundException unused) {
                            new zzqi(placesLightboxActivity, placesLightboxActivity.zzn()).show();
                            return;
                        }
                    default:
                        zzb zzbVar = placesLightboxActivity.zzg;
                        if (zzbVar == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("analyticsReporter");
                            throw null;
                        }
                        zzbVar.zzp(placesLightboxActivity, 3, null);
                        placesLightboxActivity.finish();
                        return;
                }
            }
        });
        findViewById5.setOnClickListener(new View.OnClickListener(this) { // from class: com.google.android.libraries.places.widget.internal.placedetails.photoviewer.zzq
            public final /* synthetic */ PlacesLightboxActivity zza;

            {
                this.zza = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                int i3 = i;
                final PlacesLightboxActivity placesLightboxActivity = this.zza;
                switch (i3) {
                    case 0:
                        view.getClass();
                        PopupMenu popupMenu = new PopupMenu(placesLightboxActivity, view);
                        popupMenu.getMenuInflater().inflate(R.menu.photo_more_menu, popupMenu.getMenu());
                        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: com.google.android.libraries.places.widget.internal.placedetails.photoviewer.zzs
                            @Override // android.widget.PopupMenu.OnMenuItemClickListener
                            public final boolean onMenuItemClick(MenuItem menuItem) {
                                String str2;
                                KProperty[] kPropertyArr = PlacesLightboxActivity.zza;
                                menuItem.getClass();
                                if (menuItem.getItemId() != R.id.report_a_photo) {
                                    return false;
                                }
                                PlacesLightboxActivity placesLightboxActivity2 = PlacesLightboxActivity.this;
                                ArrayList arrayList = placesLightboxActivity2.zzf;
                                if (arrayList == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("pageDataList");
                                    throw null;
                                }
                                ViewPager2 viewPager2 = placesLightboxActivity2.zzc;
                                if (viewPager2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("viewPager");
                                    throw null;
                                }
                                zzd zzdVar = (zzd) CollectionsKt.getOrNull(viewPager2.mCurrentItem, arrayList);
                                if (zzdVar == null || (str2 = zzdVar.zzc) == null) {
                                    return true;
                                }
                                zzb zzbVar = placesLightboxActivity2.zzg;
                                if (zzbVar == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("analyticsReporter");
                                    throw null;
                                }
                                zzbVar.zzp(placesLightboxActivity2, 4, null);
                                try {
                                    placesLightboxActivity2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str2)));
                                    return true;
                                } catch (ActivityNotFoundException unused) {
                                    new zzqi(placesLightboxActivity2, placesLightboxActivity2.zzn()).show();
                                    return true;
                                }
                            }
                        });
                        popupMenu.show();
                        return;
                    case 1:
                        ArrayList arrayList = placesLightboxActivity.zzf;
                        if (arrayList == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("pageDataList");
                            throw null;
                        }
                        ViewPager2 viewPager2 = placesLightboxActivity.zzc;
                        if (viewPager2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
                            throw null;
                        }
                        zzd zzdVar = (zzd) CollectionsKt.getOrNull(viewPager2.mCurrentItem, arrayList);
                        if (zzdVar == null || (str = zzdVar.zzf) == null) {
                            return;
                        }
                        try {
                            placesLightboxActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                            return;
                        } catch (ActivityNotFoundException unused) {
                            new zzqi(placesLightboxActivity, placesLightboxActivity.zzn()).show();
                            return;
                        }
                    default:
                        zzb zzbVar = placesLightboxActivity.zzg;
                        if (zzbVar == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("analyticsReporter");
                            throw null;
                        }
                        zzbVar.zzp(placesLightboxActivity, 3, null);
                        placesLightboxActivity.finish();
                        return;
                }
            }
        });
        final int i3 = 1;
        findViewById6.setOnClickListener(new View.OnClickListener(this) { // from class: com.google.android.libraries.places.widget.internal.placedetails.photoviewer.zzq
            public final /* synthetic */ PlacesLightboxActivity zza;

            {
                this.zza = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                int i32 = i3;
                final PlacesLightboxActivity placesLightboxActivity = this.zza;
                switch (i32) {
                    case 0:
                        view.getClass();
                        PopupMenu popupMenu = new PopupMenu(placesLightboxActivity, view);
                        popupMenu.getMenuInflater().inflate(R.menu.photo_more_menu, popupMenu.getMenu());
                        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: com.google.android.libraries.places.widget.internal.placedetails.photoviewer.zzs
                            @Override // android.widget.PopupMenu.OnMenuItemClickListener
                            public final boolean onMenuItemClick(MenuItem menuItem) {
                                String str2;
                                KProperty[] kPropertyArr = PlacesLightboxActivity.zza;
                                menuItem.getClass();
                                if (menuItem.getItemId() != R.id.report_a_photo) {
                                    return false;
                                }
                                PlacesLightboxActivity placesLightboxActivity2 = PlacesLightboxActivity.this;
                                ArrayList arrayList = placesLightboxActivity2.zzf;
                                if (arrayList == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("pageDataList");
                                    throw null;
                                }
                                ViewPager2 viewPager2 = placesLightboxActivity2.zzc;
                                if (viewPager2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("viewPager");
                                    throw null;
                                }
                                zzd zzdVar = (zzd) CollectionsKt.getOrNull(viewPager2.mCurrentItem, arrayList);
                                if (zzdVar == null || (str2 = zzdVar.zzc) == null) {
                                    return true;
                                }
                                zzb zzbVar = placesLightboxActivity2.zzg;
                                if (zzbVar == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("analyticsReporter");
                                    throw null;
                                }
                                zzbVar.zzp(placesLightboxActivity2, 4, null);
                                try {
                                    placesLightboxActivity2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str2)));
                                    return true;
                                } catch (ActivityNotFoundException unused) {
                                    new zzqi(placesLightboxActivity2, placesLightboxActivity2.zzn()).show();
                                    return true;
                                }
                            }
                        });
                        popupMenu.show();
                        return;
                    case 1:
                        ArrayList arrayList = placesLightboxActivity.zzf;
                        if (arrayList == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("pageDataList");
                            throw null;
                        }
                        ViewPager2 viewPager2 = placesLightboxActivity.zzc;
                        if (viewPager2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
                            throw null;
                        }
                        zzd zzdVar = (zzd) CollectionsKt.getOrNull(viewPager2.mCurrentItem, arrayList);
                        if (zzdVar == null || (str = zzdVar.zzf) == null) {
                            return;
                        }
                        try {
                            placesLightboxActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                            return;
                        } catch (ActivityNotFoundException unused) {
                            new zzqi(placesLightboxActivity, placesLightboxActivity.zzn()).show();
                            return;
                        }
                    default:
                        zzb zzbVar = placesLightboxActivity.zzg;
                        if (zzbVar == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("analyticsReporter");
                            throw null;
                        }
                        zzbVar.zzp(placesLightboxActivity, 3, null);
                        placesLightboxActivity.finish();
                        return;
                }
            }
        });
        pageSelectionIndicator.getClass();
        Sniffer sniffer = this.zzk;
        if (sniffer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("themeDimensionHelper");
            throw null;
        }
        Renderer.DisplayInfo displayInfo = new Renderer.DisplayInfo(this, sniffer.zzc(36, R.dimen.gmp_sys_measurement_spacing_medium), 4);
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(pageSelectionIndicator, displayInfo);
        Sniffer sniffer2 = this.zzk;
        if (sniffer2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("themeDimensionHelper");
            throw null;
        }
        ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(findViewById4, new Renderer.DisplayInfo(this, sniffer2.zzc(36, R.dimen.gmp_sys_measurement_spacing_medium), 3));
        Sniffer sniffer3 = this.zzk;
        if (sniffer3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("themeDimensionHelper");
            throw null;
        }
        ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(findViewById6, new Renderer.DisplayInfo(this, sniffer3.zzc(36, R.dimen.gmp_sys_measurement_spacing_medium), 2));
        View findViewById7 = findViewById(R.id.google_maps_logo);
        findViewById7.getClass();
        TypedArray obtainStyledAttributes = obtainStyledAttributes(zzn(), R$styleable.PlacesMaterialThemeAttrs);
        Sniffer sniffer4 = this.zzk;
        if (sniffer4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("themeDimensionHelper");
            throw null;
        }
        ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(findViewById7, new SVGAndroidRenderer(findViewById7, sniffer4.zzc(35, R.dimen.gmp_sys_measurement_spacing_large)));
        obtainStyledAttributes.recycle();
        ViewPager2 viewPager2 = this.zzc;
        if (viewPager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
            throw null;
        }
        viewPager2.setOffscreenPageLimit(4);
        ViewPager2 viewPager22 = this.zzc;
        if (viewPager22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
            throw null;
        }
        viewPager22.registerOnPageChangeCallback(new CompositeOnPageChangeCallback(this, 3));
        ViewPager2 viewPager23 = this.zzc;
        if (viewPager23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
            throw null;
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        Lifecycle lifecycle = getLifecycle();
        lifecycle.getClass();
        zzm zzmVar = new zzm(supportFragmentManager, lifecycle);
        zzmVar.zza = EmptyList.INSTANCE;
        viewPager23.setAdapter(zzmVar);
        int i4 = extras.getInt("extra-start-index", 0);
        int i5 = this.zzi;
        if (i5 != -1) {
            i4 = i5;
        }
        ArrayList arrayList = ((zzp) zzpo.zza(extras, "extra-photo-page-data-list", zzp.class)).zza;
        this.zzf = arrayList;
        ViewPager2 viewPager24 = (ViewPager2) findViewById(R.id.photo_pager);
        if (viewPager24 != null && (adapter = viewPager24.mRecyclerView.mAdapter) != null && (adapter instanceof zzm)) {
            zzm zzmVar2 = (zzm) adapter;
            zzmVar2.zza = arrayList;
            zzmVar2.notifyDataSetChanged();
            ViewPager2 viewPager25 = this.zzc;
            if (viewPager25 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewPager");
                throw null;
            }
            viewPager25.setCurrentItem(i4, false);
            zzq(i4);
        }
        ViewPager2 viewPager26 = this.zzc;
        if (viewPager26 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
            throw null;
        }
        zzb zzbVar = this.zzg;
        if (zzbVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("analyticsReporter");
            throw null;
        }
        RecyclerView.Adapter adapter2 = viewPager26.mRecyclerView.mAdapter;
        Integer valueOf = adapter2 != null ? Integer.valueOf(adapter2.getItemCount()) : null;
        if (valueOf == null) {
            Context context = pageSelectionIndicator.getContext();
            context.getClass();
            zzbVar.zzp(context, 6, null);
        } else {
            pageSelectionIndicator.removeAllViews();
            int intValue = valueOf.intValue();
            for (int i6 = 0; i6 < intValue; i6++) {
                View inflate = LayoutInflater.from(pageSelectionIndicator.getContext()).inflate(R.layout.page_indicator, (ViewGroup) pageSelectionIndicator, false);
                inflate.getClass();
                pageSelectionIndicator.addView(inflate);
            }
            viewPager26.registerOnPageChangeCallback(new CompositeOnPageChangeCallback(pageSelectionIndicator, 2));
        }
        int childCount = pageSelectionIndicator.getChildCount();
        int i7 = 0;
        while (i7 < childCount) {
            pageSelectionIndicator.getChildAt(i7).setSelected(i7 == i4);
            i7++;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ViewPager2 viewPager2 = this.zzc;
        if (viewPager2 != null) {
            viewPager2.setAdapter(null);
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        bundle.putInt("extra-number-of-photos-shown-in-gallery", this.zzh);
        bundle.putInt("extra-previous-photo-index", this.zzi);
    }

    public final int zzn() {
        return ((Number) this.zzj.getValue(this, zza[0])).intValue();
    }

    public final void zzq(int i) {
        ArrayList arrayList = this.zzf;
        if (arrayList == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pageDataList");
            throw null;
        }
        zzd zzdVar = (zzd) CollectionsKt.getOrNull(i, arrayList);
        if (zzdVar != null) {
            TextView textView = this.zze;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("userName");
                throw null;
            }
            textView.setText(zzdVar.zzd);
            RequestManager requestManager = Glide.get(this).requestManagerRetriever.get((FragmentActivity) this);
            String str = zzdVar.zze;
            requestManager.getClass();
            RequestBuilder loadGeneric = new RequestBuilder(requestManager.glide, requestManager, Drawable.class, requestManager.context).loadGeneric(str);
            loadGeneric.getClass();
            DownsampleStrategy$None downsampleStrategy$None = DownsampleStrategy$None.FIT_CENTER;
            RequestBuilder requestBuilder = (RequestBuilder) loadGeneric.transform(new CircleCrop());
            ImageView imageView = this.zzd;
            if (imageView != null) {
                requestBuilder.into(imageView);
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("userProfileImageView");
                throw null;
            }
        }
    }
}
