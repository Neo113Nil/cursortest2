package com.google.android.gms.internal.mlkit_genai_prompt;

import bo.app.re$$ExternalSyntheticOutline0;

/* loaded from: classes4.dex */
public final class zzcm extends Exception {
    public final int zza;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzcm(int i, int i2, String str, Throwable th) {
        super(r6.toString(), th);
        String str2 = "UNKNOWN";
        String str3 = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "UNKNOWN" : "CONNECTION_ERROR" : "PREPARATION_ERROR" : "INFERENCE_ERROR" : "DOWNLOAD_ERROR";
        if (i2 != 18 && i2 != 20) {
            if (i2 == 501) {
                str2 = "NOT_ENOUGH_DISK_SPACE";
            } else if (i2 != 29) {
                if (i2 != 30) {
                    switch (i2) {
                        case 2:
                            str2 = "BAD_DATA";
                            break;
                        case 3:
                            str2 = "BAD_REQUEST";
                            break;
                        case 4:
                            str2 = "REQUEST_PROCESSING_ERROR";
                            break;
                        case 5:
                            str2 = "COMPUTE_ERROR";
                            break;
                        case 6:
                            str2 = "IPC_ERROR";
                            break;
                        case 7:
                            str2 = "CANCELLED";
                            break;
                        case 8:
                            str2 = "NOT_AVAILABLE";
                            break;
                        case 9:
                            str2 = "BUSY";
                            break;
                        case 10:
                            str2 = "SERVICE_PROCESSING_ERROR";
                            break;
                        case 11:
                            str2 = "RESPONSE_PROCESSING_ERROR";
                            break;
                        case 12:
                            str2 = "REQUEST_TOO_LARGE";
                            break;
                        default:
                            switch (i2) {
                                case 14:
                                    break;
                                case 15:
                                    str2 = "RESPONSE_GENERATION_ERROR";
                                    break;
                                case 16:
                                    str2 = "NOT_SUPPORTED";
                                    break;
                                default:
                                    switch (i2) {
                                        case 601:
                                            str2 = "BINDING_FAILURE";
                                            break;
                                        case 602:
                                            str2 = "SERVICE_DISCONNECTED";
                                            break;
                                        case 603:
                                            str2 = "BINDING_DIED";
                                            break;
                                        case 604:
                                            str2 = "NEEDS_SYSTEM_UPDATE";
                                            break;
                                        case 605:
                                            str2 = "NULL_BINDING";
                                            break;
                                        case 606:
                                            str2 = "FEATURE_NOT_FOUND";
                                            break;
                                    }
                            }
                    }
                } else {
                    str2 = "BACKGROUND_USE_BLOCKED";
                }
            }
            StringBuilder m = re$$ExternalSyntheticOutline0.m("AICore failed with error type ", i, "-", str3, " and error code ");
            m.append(i2);
            m.append("-");
            m.append(str2);
            m.append(": ");
            m.append(str);
            this.zza = i2;
        }
        str2 = "INTERNAL_ERROR";
        StringBuilder m2 = re$$ExternalSyntheticOutline0.m("AICore failed with error type ", i, "-", str3, " and error code ");
        m2.append(i2);
        m2.append("-");
        m2.append(str2);
        m2.append(": ");
        m2.append(str);
        this.zza = i2;
    }

    public static zzcm zzb(int i, String str, Throwable th) {
        return new zzcm(4, i, str, th);
    }

    public static zzcm zzc(int i, Exception exc, String str) {
        return new zzcm(1, i, str, exc);
    }
}
