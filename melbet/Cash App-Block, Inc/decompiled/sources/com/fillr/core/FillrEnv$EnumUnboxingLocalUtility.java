package com.fillr.core;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.browsersdk.Fillr;
import com.google.android.gms.common.api.internal.zam;
import com.google.android.gms.internal.measurement.zzada;
import com.google.android.gms.internal.measurement.zzaef;
import com.google.android.gms.internal.measurement.zznz;
import com.google.android.gms.internal.mlkit_genai_prompt.zzlh;
import com.google.android.gms.internal.mlkit_vision_barcode.zzez;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdk;
import com.google.firebase.encoders.proto.AtProtobuf$ProtobufImpl;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class FillrEnv$EnumUnboxingLocalUtility {
    public static String _getBaseUrl$1() {
        if (Fillr.getInstance() == null) {
            return "https://api.fillr.com";
        }
        Fillr.getInstance().getClass();
        return "https://api.fillr.com";
    }

    public static /* synthetic */ int _zza(Object obj) {
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

    public static int _zzb(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            default:
                switch (i) {
                    case 20:
                        return 10;
                    case 21:
                        return 11;
                    case 22:
                        return 12;
                    default:
                        return 0;
                }
        }
    }

    public static /* synthetic */ String getMTableName(int i) {
        if (i == 1) {
            return "events";
        }
        if (i == 2) {
            return "people";
        }
        throw null;
    }

    public static /* synthetic */ int getZzm(int i) {
        switch (i) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 20;
            case 11:
                return 21;
            case 12:
                return 22;
            default:
                throw null;
        }
    }

    public static /* synthetic */ boolean m(AtomicReferenceArray atomicReferenceArray, zznz zznzVar) {
        while (!atomicReferenceArray.compareAndSet(2, null, zznzVar)) {
            if (atomicReferenceArray.get(2) != null) {
                return false;
            }
        }
        return true;
    }

    public static int m$1(int i, int i2, int i3) {
        int i4 = i / i2;
        return i4 + i4 + i3;
    }

    public static int m$2(int i, int i2, int i3) {
        return zzdk.zzA(i) + i2 + i3;
    }

    public static /* synthetic */ String name(int i) {
        switch (i) {
            case 1:
                return "CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN";
            case 2:
                return "CLIENT_UPLOAD_ELIGIBLE";
            case 3:
                return "MEASUREMENT_SERVICE_NOT_ENABLED";
            case 4:
                return "ANDROID_TOO_OLD";
            case 5:
                return "NON_PLAY_MODE";
            case 6:
                return "SDK_TOO_OLD";
            case 7:
                return "MISSING_JOB_SCHEDULER";
            case 8:
                return "NOT_ENABLED_IN_MANIFEST";
            case 9:
                return "CLIENT_FLAG_OFF";
            case 10:
                return "SERVICE_FLAG_OFF";
            case 11:
                return "PINNED_TO_SERVICE_UPLOAD";
            case 12:
                return "MISSING_SGTM_SERVER_URL";
            default:
                throw null;
        }
    }

    public static int m(int i, int i2, int i3, int i4) {
        return zzada.zzE(i) + i2 + i3 + i4;
    }

    public static zzaef m(zzaef zzaefVar) {
        int size = zzaefVar.size();
        return zzaefVar.zzg(size + size);
    }

    public static zzlh m(HashMap hashMap, int i) {
        Collections.unmodifiableMap(new HashMap(hashMap));
        return new zzlh(i);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static zzez m1939m(HashMap hashMap, int i) {
        Collections.unmodifiableMap(new HashMap(hashMap));
        return new zzez(i);
    }

    public static HashMap m(Class cls, zzlh zzlhVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, zzlhVar);
        return hashMap;
    }

    public static HashMap m(Class cls, zzez zzezVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, zzezVar);
        return hashMap;
    }

    public static HashMap m(Class cls, AtProtobuf$ProtobufImpl atProtobuf$ProtobufImpl) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, atProtobuf$ProtobufImpl);
        return hashMap;
    }

    public static Map m(HashMap hashMap) {
        return Collections.unmodifiableMap(new HashMap(hashMap));
    }

    /* renamed from: m, reason: collision with other method in class */
    public static void m1940m(HashMap hashMap) {
        Collections.unmodifiableMap(new HashMap(hashMap));
    }

    public static /* synthetic */ boolean m(AtomicReference atomicReference, zam zamVar) {
        while (!atomicReference.compareAndSet(null, zamVar)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }

    public static int m(int i, int i2, int i3) {
        return zzada.zzE(i) + i2 + i3;
    }

    public static /* synthetic */ void m(int i) {
        if (i != 0) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$2("null reference");
    }
}
