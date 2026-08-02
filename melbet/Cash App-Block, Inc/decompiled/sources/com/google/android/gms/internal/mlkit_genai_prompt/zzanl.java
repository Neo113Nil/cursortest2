package com.google.android.gms.internal.mlkit_genai_prompt;

import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.protos.cash.activity.api.v1.ActivityScope;
import com.squareup.protos.cash.activity.api.v1.ActivityToken;
import com.squareup.protos.cash.activity.api.v1.ActivityTokenType;
import com.stripe.android.core.model.parsers.ModelJsonParser;

/* loaded from: classes5.dex */
public abstract class zzanl implements ModelJsonParser {
    public static ActivitiesManager.ActivityContext earningsActivityContext$default(int i, String str, String str2) {
        ActivitiesManager.ActivityPageHandler activityPageHandler = null;
        if ((i & 2) != 0) {
            str2 = null;
        }
        int i2 = 8;
        return new ActivitiesManager.ActivityContext(new ActivityToken(str2 != null ? ActivityTokenType.CUSTOMER_TOKEN_EARNINGS_INCOME_STREAM : ActivityTokenType.CUSTOMER_TOKEN_EARNINGS, str, str2, i2), ActivityScope.MY_ACTIVITY, activityPageHandler, i2);
    }

    public static String zza(zzaks zzaksVar) {
        StringBuilder sb = new StringBuilder(zzaksVar.zzd());
        for (int i = 0; i < zzaksVar.zzd(); i++) {
            byte zza = zzaksVar.zza(i);
            if (zza == 34) {
                sb.append("\\\"");
            } else if (zza == 39) {
                sb.append("\\'");
            } else if (zza != 92) {
                switch (zza) {
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
                        if (zza < 32 || zza > 126) {
                            sb.append('\\');
                            sb.append((char) (((zza >>> 6) & 3) + 48));
                            sb.append((char) (((zza >>> 3) & 7) + 48));
                            sb.append((char) ((zza & 7) + 48));
                            break;
                        } else {
                            sb.append((char) zza);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
