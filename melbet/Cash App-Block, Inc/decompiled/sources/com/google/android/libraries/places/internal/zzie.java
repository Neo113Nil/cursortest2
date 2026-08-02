package com.google.android.libraries.places.internal;

import com.android.volley.AuthFailureError;
import com.android.volley.NetworkError;
import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes4.dex */
public abstract class zzie {

    /* renamed from: zza, reason: collision with other field name */
    public static Thread f71zza;
    public static final zzboq zza = new zzboq("io.grpc.Grpc.TRANSPORT_ATTR_REMOTE_ADDR", 0);
    public static final zzboq zzb = new zzboq("io.grpc.Grpc.TRANSPORT_ATTR_LOCAL_ADDR", 0);
    public static final zzboq zzc = new zzboq("io.grpc.Grpc.TRANSPORT_ATTR_SSL_SESSION", 0);

    /* renamed from: zza, reason: collision with other field name */
    public static final zzez f70zza = new zzez(3);
    public static final zzez zza$1 = new zzez(9);

    public static String zza(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length);
        for (byte b : bArr) {
            if (b == 34) {
                sb.append("\\\"");
            } else if (b == 39) {
                sb.append("\\'");
            } else if (b != 92) {
                switch (b) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (b < 32 || b > 126) {
                            sb.append('\\');
                            sb.append((char) (((b >>> 6) & 3) + 48));
                            sb.append((char) (((b >>> 3) & 7) + 48));
                            sb.append((char) ((b & 7) + 48));
                            break;
                        } else {
                            sb.append((char) b);
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static ApiException zzb(zzbua zzbuaVar) {
        zzbtx zzb2 = zzbtx.zzb(zzbuaVar);
        zzbtu zzbtuVar = zzbtu.OK;
        zzbtu zzbtuVar2 = zzb2.zzn;
        String str = zzb2.zzo;
        int ordinal = zzbtuVar2.ordinal();
        return ordinal != 3 ? ordinal != 4 ? ordinal != 5 ? ordinal != 7 ? ordinal != 13 ? ordinal != 14 ? new ApiException(new Status(13, str, null, null)) : new ApiException(new Status(7, str, null, null)) : new ApiException(new Status(8, str, null, null)) : new ApiException(new Status(9011, str, null, null)) : new ApiException(new Status(9013, str, null, null)) : new ApiException(new Status(15, str, null, null)) : new ApiException(new Status(9012, str, null, null));
    }

    public abstract boolean zza(zzcfw zzcfwVar);

    public abstract void zzb(zzcfw zzcfwVar);

    public static ApiException zza(VolleyError volleyError) {
        int i;
        if (volleyError instanceof NetworkError) {
            i = 7;
        } else if (volleyError instanceof TimeoutError) {
            i = 15;
        } else if ((volleyError instanceof ServerError) || (volleyError instanceof ParseError)) {
            i = 8;
        } else {
            i = volleyError instanceof AuthFailureError ? 9011 : 13;
        }
        NetworkResponse networkResponse = volleyError.networkResponse;
        return new ApiException(new Status(i, String.format("Unexpected server error (HTTP Code: %s. Message: %s.)", networkResponse == null ? "N/A" : String.valueOf(networkResponse.statusCode), volleyError), null, null));
    }
}
