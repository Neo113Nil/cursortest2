package com.google.android.libraries.places.widget.internal.placedetails.photoviewer;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.util.Util;
import com.google.android.libraries.places.internal.zzje;
import com.google.android.libraries.places.internal.zzpo;
import com.squareup.cash.R;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class zzl extends Fragment {
    public PlacesLightboxActivity zza;
    public ImageView zzc;
    public ImageView zzd;
    public zzd zze;
    public FrameLayout zzf;
    public zzje zzg;
    public View zzh;
    public View zzi;

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        if (context instanceof PlacesLightboxActivity) {
            this.zza = (PlacesLightboxActivity) context;
        } else {
            Log.e("PhotoViewerFragment", "Context must implement PhotoNavigationListener");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        requireArguments.getClass();
        this.zze = (zzd) zzpo.zza(requireArguments, "page_data", zzd.class);
        if (this.zzg == null) {
            Context requireContext = requireContext();
            requireContext.getClass();
            this.zzg = new zzje(requireContext);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        final int i = 0;
        View inflate = layoutInflater.inflate(R.layout.photo_viewer_fragment, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.blurred_background_image);
        findViewById.getClass();
        this.zzd = (ImageView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.photo_viewer_image);
        findViewById2.getClass();
        this.zzc = (ImageView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.loading_failed_ui);
        findViewById3.getClass();
        this.zzf = (FrameLayout) findViewById3;
        View findViewById4 = inflate.findViewById(R.id.previous_image_button);
        findViewById4.getClass();
        this.zzh = findViewById4;
        View findViewById5 = inflate.findViewById(R.id.next_image_button);
        findViewById5.getClass();
        this.zzi = findViewById5;
        View view = this.zzh;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("previousImageButton");
            throw null;
        }
        final int i2 = 1;
        view.setOnClickListener(new View.OnClickListener(this) { // from class: com.google.android.libraries.places.widget.internal.placedetails.photoviewer.zzf
            public final /* synthetic */ zzl zza;

            {
                this.zza = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i3 = i2;
                zzl zzlVar = this.zza;
                switch (i3) {
                    case 0:
                        zzlVar.zzi(false);
                        PlacesLightboxActivity placesLightboxActivity = zzlVar.zza;
                        if (placesLightboxActivity == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("photoNavigationListener");
                            throw null;
                        }
                        ViewPager2 viewPager2 = placesLightboxActivity.zzc;
                        if (viewPager2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
                            throw null;
                        }
                        ArrayList arrayList = placesLightboxActivity.zzf;
                        if (arrayList == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("pageDataList");
                            throw null;
                        }
                        int size = arrayList.size() - 1;
                        ViewPager2 viewPager22 = placesLightboxActivity.zzc;
                        if (viewPager22 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
                            throw null;
                        }
                        viewPager2.setCurrentItem(Math.min(size, viewPager22.mCurrentItem + 1), false);
                        View view3 = zzlVar.getView();
                        if (view3 != null) {
                            view3.postDelayed(new zzg(zzlVar, 1), 300L);
                            return;
                        }
                        return;
                    default:
                        zzlVar.zzi(false);
                        PlacesLightboxActivity placesLightboxActivity2 = zzlVar.zza;
                        if (placesLightboxActivity2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("photoNavigationListener");
                            throw null;
                        }
                        ViewPager2 viewPager23 = placesLightboxActivity2.zzc;
                        if (viewPager23 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
                            throw null;
                        }
                        viewPager23.setCurrentItem(Math.max(0, viewPager23.mCurrentItem - 1), false);
                        View view4 = zzlVar.getView();
                        if (view4 != null) {
                            view4.postDelayed(new zzg(zzlVar, 1), 300L);
                            return;
                        }
                        return;
                }
            }
        });
        View view2 = this.zzi;
        if (view2 != null) {
            view2.setOnClickListener(new View.OnClickListener(this) { // from class: com.google.android.libraries.places.widget.internal.placedetails.photoviewer.zzf
                public final /* synthetic */ zzl zza;

                {
                    this.zza = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view22) {
                    int i3 = i;
                    zzl zzlVar = this.zza;
                    switch (i3) {
                        case 0:
                            zzlVar.zzi(false);
                            PlacesLightboxActivity placesLightboxActivity = zzlVar.zza;
                            if (placesLightboxActivity == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("photoNavigationListener");
                                throw null;
                            }
                            ViewPager2 viewPager2 = placesLightboxActivity.zzc;
                            if (viewPager2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("viewPager");
                                throw null;
                            }
                            ArrayList arrayList = placesLightboxActivity.zzf;
                            if (arrayList == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("pageDataList");
                                throw null;
                            }
                            int size = arrayList.size() - 1;
                            ViewPager2 viewPager22 = placesLightboxActivity.zzc;
                            if (viewPager22 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("viewPager");
                                throw null;
                            }
                            viewPager2.setCurrentItem(Math.min(size, viewPager22.mCurrentItem + 1), false);
                            View view3 = zzlVar.getView();
                            if (view3 != null) {
                                view3.postDelayed(new zzg(zzlVar, 1), 300L);
                                return;
                            }
                            return;
                        default:
                            zzlVar.zzi(false);
                            PlacesLightboxActivity placesLightboxActivity2 = zzlVar.zza;
                            if (placesLightboxActivity2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("photoNavigationListener");
                                throw null;
                            }
                            ViewPager2 viewPager23 = placesLightboxActivity2.zzc;
                            if (viewPager23 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("viewPager");
                                throw null;
                            }
                            viewPager23.setCurrentItem(Math.max(0, viewPager23.mCurrentItem - 1), false);
                            View view4 = zzlVar.getView();
                            if (view4 != null) {
                                view4.postDelayed(new zzg(zzlVar, 1), 300L);
                                return;
                            }
                            return;
                    }
                }
            });
            return inflate;
        }
        Intrinsics.throwUninitializedPropertyAccessException("nextImageButton");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        View view2 = this.zzh;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("previousImageButton");
            throw null;
        }
        int i = 0;
        view2.setVisibility(true != requireArguments().getBoolean("has_previous") ? 8 : 0);
        View view3 = this.zzi;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nextImageButton");
            throw null;
        }
        view3.setVisibility(true == requireArguments().getBoolean("has_next") ? 0 : 8);
        Context requireContext = requireContext();
        Util.checkNotNull(requireContext, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        RequestManager requestManager = Glide.get(requireContext).requestManagerRetriever.get(requireContext);
        zzd zzdVar = this.zze;
        if (zzdVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pageData");
            throw null;
        }
        String str = zzdVar.zzb;
        requestManager.getClass();
        RequestBuilder loadGeneric = new RequestBuilder(requestManager.glide, requestManager, Drawable.class, requestManager.context).loadGeneric(str);
        requireContext().getClass();
        RequestBuilder apply = loadGeneric.apply(new RequestOptions().transform(new zza(r2), true));
        ImageView imageView = this.zzd;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("blurredBackground");
            throw null;
        }
        apply.into(imageView);
        requireView().post(new zzg(this, i));
    }

    public final void zzi(boolean z) {
        View view = this.zzh;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("previousImageButton");
            throw null;
        }
        view.setEnabled(z);
        View view2 = this.zzi;
        if (view2 != null) {
            view2.setEnabled(z);
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("nextImageButton");
            throw null;
        }
    }
}
