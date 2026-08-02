package com.google.android.gms.internal.time;

import android.os.Parcel;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.collection.ArrayMap;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdk;
import com.google.android.gms.internal.mlkit_vision_common.zzad;
import com.google.android.gms.internal.mlkit_vision_text_common.zzcs;
import com.google.android.libraries.places.internal.zzbiv;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class zzel$EnumUnboxingLocalUtility {
    public static final int _getCode(int i) {
        return CameraSelector$$ExternalSyntheticOutline0.ordinal(i);
    }

    public static int[] _values() {
        return CameraSelector$$ExternalSyntheticOutline0.values(5);
    }

    public static /* bridge */ /* synthetic */ int _zza(Object obj) {
        if (obj instanceof String) {
            return 2;
        }
        if (obj instanceof Boolean) {
            return 1;
        }
        if (obj instanceof Long) {
            return 3;
        }
        if (obj instanceof Double) {
            return 4;
        }
        a$$ExternalSyntheticBUOutline0.m$1((Object) "invalid tag type: ".concat(String.valueOf(obj.getClass())));
        return 0;
    }

    public static zzad m(HashMap hashMap, int i) {
        Collections.unmodifiableMap(new HashMap(hashMap));
        return new zzad(i);
    }

    public static int m$1(int i, int i2, int i3, int i4) {
        return zzbiv.zzG(i) + i2 + i3 + i4;
    }

    public static /* synthetic */ String name$4(int i) {
        switch (i) {
            case 1:
                return "WIDGET_TYPE_UNSPECIFIED";
            case 2:
                return "PLACE_DETAILS";
            case 3:
                return "PLACE_LIST";
            case 4:
                return "PLACE_AUTOCOMPLETE";
            case 5:
                return "ELEVATION";
            case 6:
                return "ADVANCED_PLACE_DETAILS";
            case 7:
                return "ADVANCED_PLACE_SEARCH";
            case 8:
                return "ADVANCED_PLACE_LIST";
            case 9:
                return "INTERNAL_PLACE_DETAILS";
            case 10:
                return "INTERNAL_PLACE_DETAILS_EMBED";
            case 11:
                return "UNRECOGNIZED";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String stringValueOf$10(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "UNSPECIFIED" : "FROM_DEFAULT_COUNTRY" : "FROM_NUMBER_WITHOUT_PLUS_SIGN" : "FROM_NUMBER_WITH_IDD" : "FROM_NUMBER_WITH_PLUS_SIGN";
    }

    public static /* synthetic */ String stringValueOf$5(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE";
    }

    public static /* synthetic */ String stringValueOf$6(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "REGISTER_ERROR" : "REGISTERED" : "UNREGISTERED" : "NOT_GENERATED" : "ATTEMPT_MIGRATION";
    }

    public static /* synthetic */ String stringValueOf$9(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "TOO_LONG" : "TOO_SHORT_NSN" : "TOO_SHORT_AFTER_IDD" : "NOT_A_NUMBER" : "INVALID_COUNTRY_CODE";
    }

    public static int m(int i, int i2, int i3, int i4) {
        return zzdk.zzA(i) + i2 + i3 + i4;
    }

    public static ArrayMap m(int i, String str, String str2) {
        ArrayMap arrayMap = new ArrayMap(i);
        arrayMap.put(str, str2);
        return arrayMap;
    }

    public static int m(int i, int i2, int i3) {
        return zzbiv.zzG(i) + i2 + i3;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static com.google.android.gms.internal.mlkit_vision_face.zzcp m2028m(HashMap hashMap, int i) {
        Collections.unmodifiableMap(new HashMap(hashMap));
        return new com.google.android.gms.internal.mlkit_vision_face.zzcp(i);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static zzcs m2029m(HashMap hashMap, int i) {
        Collections.unmodifiableMap(new HashMap(hashMap));
        return new zzcs(i);
    }

    public static UnsupportedOperationException m(Parcel parcel) {
        com.google.android.gms.internal.tapandpay.zzc.zzb(parcel);
        return new UnsupportedOperationException();
    }

    public static HashMap m(Class cls, zzad zzadVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, zzadVar);
        return hashMap;
    }

    public static HashMap m(Class cls, com.google.android.gms.internal.mlkit_vision_face.zzcp zzcpVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, zzcpVar);
        return hashMap;
    }

    public static HashMap m(Class cls, zzcs zzcsVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, zzcsVar);
        return hashMap;
    }
}
