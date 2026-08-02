package com.google.android.libraries.places.internal;

import android.content.Context;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import com.google.common.base.Joiner;
import com.squareup.cash.R;
import java.util.ArrayList;
import java.util.Iterator;
import net.oneformapp.schema.Schema;

/* loaded from: classes4.dex */
public abstract class zzjn {

    /* renamed from: zzb, reason: collision with other field name */
    public static volatile Schema f73zzb;
    public static volatile Schema zzc;
    public static volatile Schema zzd;
    public static volatile Schema zze;
    public static final zzboq zza = new zzboq("io.grpc.internal.GrpcAttributes.securityLevel", 0);
    public static final zzboq zzb = new zzboq("io.grpc.internal.GrpcAttributes.clientEagAttrs", 0);

    /* renamed from: zza, reason: collision with other field name */
    public static final zzez f72zza = new zzez(4);

    /* renamed from: zzc, reason: collision with other field name */
    public static final int[] f74zzc = {R.attr.placesColorSurface, R.attr.placesColorOutlineDecorative, R.attr.placesColorPrimary, R.attr.placesColorOnSurface, R.attr.placesColorOnSurfaceVariant, R.attr.placesColorSecondaryContainer, R.attr.placesColorOnSecondaryContainer, R.attr.placesColorNeutralContainer, R.attr.placesColorOnNeutralContainer, R.attr.placesColorOnNeutralContainerVariant, R.attr.placesColorPositiveContainer, R.attr.placesColorOnPositiveContainer, R.attr.placesColorPositive, R.attr.placesColorNegative, R.attr.placesColorInfo, R.attr.placesColorButtonBorder, R.attr.placesColorButtonPrimaryBorder, R.attr.placesColorPrimaryContainer, R.attr.placesColorOnPrimaryContainer, R.attr.placesColorStarRating, R.attr.placesColorDisabledSurface};

    /* renamed from: zzd, reason: collision with other field name */
    public static final int[] f75zzd = {R.attr.placesTextAppearanceBodySmall, R.attr.placesTextAppearanceBodyMedium, R.attr.placesTextAppearanceLabelMedium, R.attr.placesTextAppearanceLabelLarge, R.attr.placesTextAppearanceHeadlineMedium, R.attr.placesTextAppearanceDisplaySmall, R.attr.placesTextAppearanceTitleSmall, R.attr.placesTextAppearanceTitleMedium, R.attr.placesTextAppearanceTitleLarge};

    /* renamed from: zze, reason: collision with other field name */
    public static final int[] f76zze = {R.attr.placesSpacingExtraSmall, R.attr.placesSpacingSmall, R.attr.placesSpacingMedium, R.attr.placesSpacingLarge, R.attr.placesSpacingExtraLarge, R.attr.placesSpacingTwoExtraLarge};
    public static final int[] zzf = {R.attr.placesBorderWidth, R.attr.placesBorderWidthButton, R.attr.placesBorderWidthButtonPrimary};
    public static final int[] zzg = {R.attr.placesCornerRadius, R.attr.placesCornerRadiusButton, R.attr.placesCornerRadiusButtonPrimary, R.attr.placesCornerRadiusThumbnail, R.attr.placesCornerRadiusCollageOuter, R.attr.placesCornerRadiusCard, R.attr.placesCornerRadiusDialog};
    public static final int[] zzh = {R.attr.placesColorAttributionLightTheme, R.attr.placesColorAttributionDarkTheme};

    public static /* synthetic */ String zza(int i) {
        return i != 1 ? "OUTBOUND" : "INBOUND";
    }

    public static String zzc(ArrayList arrayList, boolean z, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return "";
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (z) {
                str = "places.".concat(String.valueOf(str));
            }
            arrayList3.add(str);
        }
        if (!arrayList.contains("attributions")) {
            arrayList3.add(true == z ? "places.attributions" : "attributions");
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((zzhv) it2.next()).toString());
        }
        return new Joiner(",").join(arrayList3.iterator());
    }

    public static boolean zze(byte b) {
        return b > -65;
    }

    public static final boolean zzg(Context context, int i, int[] iArr) {
        if (i != R.style.PlacesMaterialTheme) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, R.style.PlacesMaterialTheme);
            ContextThemeWrapper contextThemeWrapper2 = new ContextThemeWrapper(context, i);
            TypedValue typedValue = new TypedValue();
            TypedValue typedValue2 = new TypedValue();
            for (int i2 : iArr) {
                contextThemeWrapper.getTheme().resolveAttribute(i2, typedValue, true);
                if (!contextThemeWrapper2.getTheme().resolveAttribute(i2, typedValue2, true)) {
                    break;
                }
                if (typedValue.data != typedValue2.data) {
                    return true;
                }
            }
        }
        return false;
    }
}
