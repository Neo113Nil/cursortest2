package com.google.android.libraries.places.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;

/* loaded from: classes4.dex */
public final class zzlw {
    public final Gson zza = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();

    public final Object zza(Class cls, String str) {
        try {
            return this.zza.fromJson(str, cls);
        } catch (JsonSyntaxException unused) {
            String name = cls.getName();
            throw new zzlv(Recorder$$ExternalSyntheticOutline2.m(new StringBuilder(name.length() + 55), "Could not convert JSON string to ", name, " due to syntax errors."));
        }
    }
}
