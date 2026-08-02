package com.google.android.gms.internal.mlkit_genai_prompt;

import java.util.Locale;
import java.util.function.Function;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzbk implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        zzhb zzhbVar = (zzhb) obj;
        return String.format(Locale.getDefault(), "(%d, %d)", Integer.valueOf(zzhbVar.zzc()), Integer.valueOf(zzhbVar.zza()));
    }
}
