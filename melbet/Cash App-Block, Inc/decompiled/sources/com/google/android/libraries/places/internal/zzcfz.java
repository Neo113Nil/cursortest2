package com.google.android.libraries.places.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.google.common.base.Ascii;
import com.google.common.base.VerifyException;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public final class zzcfz {
    private zzcfz() {
    }

    public static Set zzc(String str, Map map) {
        zzbtu zzbtuVar;
        List zza = zzwr.zza(str, map);
        if (zza == null) {
            return null;
        }
        EnumSet noneOf = EnumSet.noneOf(zzbtu.class);
        for (Object obj : zza) {
            if (obj instanceof Double) {
                Double d = (Double) obj;
                int intValue = d.intValue();
                Ascii.verify("Status code %s is not integral", obj, ((double) intValue) == d.doubleValue());
                zzbtuVar = zzbtx.zza(intValue).zzn;
                Ascii.verify("Status code %s is not valid", obj, zzbtuVar.zzr == d.intValue());
            } else {
                if (!(obj instanceof String)) {
                    String valueOf = String.valueOf(obj);
                    String valueOf2 = String.valueOf(obj.getClass());
                    throw new VerifyException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder(valueOf.length() + 65 + valueOf2.length()), "Can not convert status code ", valueOf, " to Status.Code, because its type is ", valueOf2));
                }
                try {
                    zzbtu zzbtuVar2 = zzbtu.OK;
                    zzbtuVar = (zzbtu) Enum.valueOf(zzbtu.class, (String) obj);
                } catch (IllegalArgumentException e) {
                    String valueOf3 = String.valueOf(obj);
                    throw new VerifyException(Recorder$$ExternalSyntheticOutline2.m(new StringBuilder(valueOf3.length() + 25), "Status code ", valueOf3, " is not valid"), e);
                }
            }
            noneOf.add(zzbtuVar);
        }
        return Collections.unmodifiableSet(noneOf);
    }
}
