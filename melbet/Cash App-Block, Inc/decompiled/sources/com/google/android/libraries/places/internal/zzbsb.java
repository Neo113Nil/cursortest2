package com.google.android.libraries.places.internal;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.google.common.collect.ImmutableList;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes4.dex */
public final class zzbsb {
    public final String zzb;
    public final ImmutableList zzc;
    public final ImmutableList zzd;

    public zzbsb(int i, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.zzb = str;
        this.zzc = ImmutableList.copyOf((Collection) arrayList);
        this.zzd = ImmutableList.copyOf((Collection) arrayList2);
    }

    public final String toString() {
        String name = getClass().getName();
        int length = name.length() + 1;
        String str = this.zzb;
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder(Boxes$$ExternalSyntheticOutline1.m(length, 1, str)), name, "(", str, ")");
    }
}
