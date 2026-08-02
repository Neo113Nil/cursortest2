package com.google.android.libraries.places.internal;

import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.common.collect.RegularImmutableList;
import com.squareup.cash.R;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;

/* loaded from: classes4.dex */
public final class zzqg extends Dialog {
    public static final Uri zzd = Uri.parse("https://support.google.com/contributionpolicy/answer/7422880");
    public static final Uri zze = Uri.parse("https://support.google.com/maps/answer/3092445");
    public static final Uri zzf = Uri.parse("https://support.google.com/maps/contact/14718793");
    public static final Uri zzg = Uri.parse("https://policies.google.com/privacy");
    public static final Uri zzh = Uri.parse("https://www.google.com/help/terms_maps/");
    public final Context zza;
    public final int zzb;
    public final List zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzqg(Context context, int i, RegularImmutableList regularImmutableList) {
        super(context, i);
        context.getClass();
        regularImmutableList.getClass();
        this.zza = context;
        this.zzb = i;
        this.zzc = regularImmutableList;
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.legal_disclosures_dialog);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setLayout(-1, -2);
            window.setFlags(2, 2);
            window.setDimAmount(0.6f);
        }
        setTitle(R.string.place_widgets_legal_disclosures_icon_a11y_label);
        TextView textView = (TextView) findViewById(R.id.view_terms_link_text);
        int lineHeight = textView != null ? textView.getLineHeight() : (int) this.zza.getResources().getDimension(R.dimen.gmp_sys_measurement_icon_size_small);
        Iterator it = ((ArrayList) ArraysKt___ArraysKt.filterNotNull(new ImageView[]{(ImageView) findViewById(R.id.reviews_disclosure_learn_more_link_icon), (ImageView) findViewById(R.id.about_these_results_link_icon), (ImageView) findViewById(R.id.view_terms_link_icon), (ImageView) findViewById(R.id.view_privacy_link_icon), (ImageView) findViewById(R.id.report_business_conduct_link_icon)})).iterator();
        while (it.hasNext()) {
            ImageView imageView = (ImageView) it.next();
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.getClass();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.height = lineHeight;
            marginLayoutParams.width = lineHeight;
            imageView.setLayoutParams(marginLayoutParams);
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.reviews_disclosure_learn_more_link);
        if (linearLayout != null) {
            zzib.zzb(linearLayout);
            linearLayout.setOnClickListener(new zzpz(this, 5));
        }
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.about_these_results_link);
        if (linearLayout2 != null) {
            zzib.zzb(linearLayout2);
            linearLayout2.setOnClickListener(new zzpz(this, 0));
        }
        LinearLayout linearLayout3 = (LinearLayout) findViewById(R.id.view_terms_link);
        if (linearLayout3 != null) {
            zzib.zzb(linearLayout3);
            linearLayout3.setOnClickListener(new zzpz(this, 1));
        }
        LinearLayout linearLayout4 = (LinearLayout) findViewById(R.id.view_privacy_link);
        if (linearLayout4 != null) {
            zzib.zzb(linearLayout4);
            linearLayout4.setOnClickListener(new zzpz(this, 2));
        }
        LinearLayout linearLayout5 = (LinearLayout) findViewById(R.id.report_business_conduct_link);
        if (linearLayout5 != null) {
            zzib.zzb(linearLayout5);
            linearLayout5.setOnClickListener(new zzpz(this, 3));
        }
        ((Button) findViewById(R.id.legal_disclosures_ok)).setOnClickListener(new zzpz(this, 4));
        for (zzqf zzqfVar : this.zzc) {
            zzqf[] zzqfVarArr = zzqf.zze;
            int ordinal = zzqfVar.ordinal();
            if (ordinal == 0) {
                LinearLayout linearLayout6 = (LinearLayout) findViewById(R.id.reviews_disclosure_container);
                if (linearLayout6 != null) {
                    linearLayout6.setVisibility(0);
                }
            } else if (ordinal == 1) {
                LinearLayout linearLayout7 = (LinearLayout) findViewById(R.id.about_these_results_container);
                if (linearLayout7 != null) {
                    linearLayout7.setVisibility(0);
                }
            } else if (ordinal == 2) {
                LinearLayout linearLayout8 = (LinearLayout) findViewById(R.id.review_ordering_container);
                if (linearLayout8 != null) {
                    linearLayout8.setVisibility(0);
                }
            } else if (ordinal != 3) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            } else {
                LinearLayout linearLayout9 = (LinearLayout) findViewById(R.id.report_business_conduct_container);
                if (linearLayout9 != null) {
                    linearLayout9.setVisibility(0);
                }
            }
        }
    }

    public final void zzg(Uri uri) {
        Context context = this.zza;
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", uri));
        } catch (ActivityNotFoundException unused) {
            context.getClass();
            new zzqi(context, this.zzb).show();
        }
    }
}
