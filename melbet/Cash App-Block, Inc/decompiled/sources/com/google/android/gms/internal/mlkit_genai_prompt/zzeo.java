package com.google.android.gms.internal.mlkit_genai_prompt;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.mlkit.genai.common.GenAiException;
import com.nimbusds.jose.JWECryptoParts;
import com.squareup.workflow1.internal.SubtreeManager;

/* loaded from: classes4.dex */
public final class zzeo implements zzajc, zzamp, zzke {
    public static final zzzx zza = new zzzx(8);

    /* renamed from: zza, reason: collision with other field name */
    public Object f67zza;

    public /* synthetic */ zzeo(Object obj) {
        this.f67zza = obj;
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzajc
    public void zza(GenAiException genAiException) {
        zzabz zzabzVar;
        zzajh zzajhVar = (zzajh) this.f67zza;
        zzct zzctVar = zzajhVar.zzd;
        int i = zzctVar != null ? zzctVar.zzf : -1;
        zzlq zzlqVar = zzajhVar.zzc;
        int i2 = genAiException.zza;
        if (i2 == 28) {
            i2 = 9;
        }
        JWECryptoParts jWECryptoParts = new JWECryptoParts();
        zzlq zzlqVar2 = new zzlq(2);
        zzlqVar2.zzc = (zzagc) zzlqVar.zzd;
        SubtreeManager subtreeManager = new SubtreeManager();
        subtreeManager.snapshotCache = Integer.valueOf(i);
        if (i2 == 27) {
            zzabzVar = zzabz.SAPI_PER_APP_BATTERY_USE_QUOTA_EXCEEDED;
        } else if (i2 == 28) {
            zzabzVar = zzabz.SAPI_PER_DEVICE_BATTERY_USE_QUOTA_EXCEEDED;
        } else if (i2 == 30) {
            zzabzVar = zzabz.SAPI_BACKGROUND_USE_BLOCKED;
        } else if (i2 != 501) {
            switch (i2) {
                case -102:
                    zzabzVar = zzabz.SAPI_INVALID_INPUT_IMAGE;
                    break;
                case -101:
                    zzabzVar = zzabz.SAPI_AICORE_INCOMPATIBLE;
                    break;
                case -100:
                    zzabzVar = zzabz.SAPI_REQUEST_TOO_SMALL;
                    break;
                default:
                    switch (i2) {
                        case 2:
                            zzabzVar = zzabz.SAPI_BAD_DATA;
                            break;
                        case 3:
                            zzabzVar = zzabz.SAPI_BAD_REQUEST;
                            break;
                        case 4:
                            zzabzVar = zzabz.SAPI_REQUEST_PROCESSING_ERROR;
                            break;
                        case 5:
                            zzabzVar = zzabz.SAPI_COMPUTE_ERROR;
                            break;
                        case 6:
                            zzabzVar = zzabz.SAPI_IPC_ERROR;
                            break;
                        case 7:
                            zzabzVar = zzabz.SAPI_CANCELLED;
                            break;
                        case 8:
                            zzabzVar = zzabz.SAPI_NOT_AVAILABLE;
                            break;
                        case 9:
                            zzabzVar = zzabz.SAPI_BUSY;
                            break;
                        case 10:
                            zzabzVar = zzabz.SAPI_SERVICE_PROCESSING_ERROR;
                            break;
                        case 11:
                            zzabzVar = zzabz.SAPI_RESPONSE_PROCESSING_ERROR;
                            break;
                        case 12:
                            zzabzVar = zzabz.SAPI_REQUEST_TOO_LARGE;
                            break;
                        case 13:
                            zzabzVar = zzabz.SAPI_SUSPENDED;
                            break;
                        case 14:
                            zzabzVar = zzabz.SAPI_INTERNAL_ERROR;
                            break;
                        case 15:
                            zzabzVar = zzabz.SAPI_RESPONSE_GENERATION_ERROR;
                            break;
                        case 16:
                            zzabzVar = zzabz.SAPI_NOT_SUPPORTED;
                            break;
                        case 17:
                            zzabzVar = zzabz.SAPI_SUSPENDED_STATELESS;
                            break;
                        case 18:
                            zzabzVar = zzabz.SAPI_INTERNAL_ERROR_DOUBLE_MODEL_LOAD_ATTEMPT;
                            break;
                        default:
                            switch (i2) {
                                case 601:
                                    zzabzVar = zzabz.SAPI_BINDING_FAILURE;
                                    break;
                                case 602:
                                    zzabzVar = zzabz.SAPI_SERVICE_DISCONNECTED;
                                    break;
                                case 603:
                                    zzabzVar = zzabz.SAPI_BINDING_DIED;
                                    break;
                                case 604:
                                    zzabzVar = zzabz.SAPI_NEEDS_SYSTEM_UPDATE;
                                    break;
                                case 605:
                                    zzabzVar = zzabz.SAPI_NULL_BINDING;
                                    break;
                                case 606:
                                    zzabzVar = zzabz.SAPI_FEATURE_NOT_FOUND;
                                    break;
                                case 607:
                                    zzabzVar = zzabz.SAPI_APK_SERVING_GROUP_MISMATCH;
                                    break;
                                default:
                                    zzabzVar = zzabz.UNKNOWN_ERROR;
                                    break;
                            }
                    }
            }
        } else {
            zzabzVar = zzabz.SAPI_NOT_ENOUGH_DISK_SPACE;
        }
        subtreeManager.contextForChildren = zzabzVar;
        zzlqVar2.zze = new zzagi(subtreeManager);
        jWECryptoParts.iv = new zzafv(zzlqVar2);
        ((zzajt) zzlqVar.zze).zzc(new zzfr(jWECryptoParts), zzlq.zzh((zzpb) zzlqVar.zzc, zznl.zzb));
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzamp
    public zzana zzb(Class cls) {
        for (int i = 0; i < 2; i++) {
            zzamp zzampVar = ((zzamp[]) this.f67zza)[i];
            if (zzampVar.zzc(cls)) {
                return zzampVar.zzb(cls);
            }
        }
        a$$ExternalSyntheticBUOutline0.m("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzamp
    public boolean zzc(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((zzamp[]) this.f67zza)[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzke
    public /* bridge */ /* synthetic */ void zzb(Object obj) {
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzke
    public void zza(Throwable th) {
        zzer zzerVar = (zzer) this.f67zza;
        synchronized (zzerVar.zzh) {
            zzerVar.zzk = null;
        }
    }
}
