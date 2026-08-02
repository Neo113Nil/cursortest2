package com.google.android.gms.internal.time;

import android.app.Dialog;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.PowerManager;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.core.processing.Edge;
import androidx.core.os.CancellationSignal;
import androidx.lifecycle.DispatchQueue$$ExternalSyntheticLambda0;
import androidx.media3.exoplayer.audio.AudioCapabilities;
import androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.android.volley.NetworkResponse;
import com.datadog.android.rum.internal.domain.battery.DefaultBatteryInfoProvider;
import com.fillr.browsersdk.Fillr;
import com.fillr.browsersdk.utilities.FillrCaptureSensitiveDataDialogManager$BoardResponseReceiver$3;
import com.fillr.browsersdk.utilities.Obfuscator;
import com.fillr.core.utilities.AppPreferenceStore;
import com.fillr.e0;
import com.fillr.n;
import com.fillr.service.CaptureFieldsMappingService;
import com.google.android.gms.dynamic.zae;
import com.google.android.gms.internal.measurement.zzaif;
import com.google.android.gms.measurement.internal.zzhz;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.stats.zza;
import com.google.android.libraries.places.widget.internal.autocomplete.ui.zzz;
import com.google.android.play.core.splitcompat.SplitCompat;
import com.google.mlkit.vision.text.Text;
import com.squareup.cash.R;
import com.stripe.android.financialconnections.utils.ErrorsKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import kotlinx.coroutines.channels.ProducerCoroutine;
import kotlinx.coroutines.channels.ProducerScope;

/* loaded from: classes4.dex */
public final class zzbq extends BroadcastReceiver {
    public final /* synthetic */ int $r8$classId;
    public final Object zza;

    public zzbq(zzic zzicVar) {
        this.$r8$classId = 7;
        this.zza = zzicVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean z = false;
        int i = 3;
        int i2 = 1;
        switch (this.$r8$classId) {
            case 0:
                AtomicInteger atomicInteger = zzbr.zzb;
                Parcelable.Creator<zzq> creator = zzq.CREATOR;
                byte[] byteArrayExtra = intent.getByteArrayExtra("om.google.android.gms.time.TIME_SIGNAL_RESULT");
                zzq zzqVar = (zzq) (byteArrayExtra != null ? ErrorsKt.deserializeFromBytes(byteArrayExtra, creator) : null);
                if (zzqVar != null) {
                    Edge edge = (Edge) this.zza;
                    zze zzeVar = zzaj.zza;
                    zzeVar.getClass();
                    zzeVar.zza(Level.FINE).zzn("Intent received=%s containing time signal=%s", intent, zzqVar);
                    edge.accept(zzqVar);
                    break;
                } else {
                    zze zzeVar2 = zzaj.zza;
                    zzeVar2.getClass();
                    zzeVar2.zza(Level.WARNING).zzm(intent, "Intent received=%s contains unexpectedly null time signal");
                    break;
                }
            case 1:
                ((Text.TextBase) this.zza).onChange();
                break;
            case 2:
                ((Executor) ((NetworkResponse) this.zza).data).execute(new DispatchQueue$$ExternalSyntheticLambda0(14, this, context));
                break;
            case 3:
                AudioCapabilitiesReceiver audioCapabilitiesReceiver = (AudioCapabilitiesReceiver) this.zza;
                if (!isInitialStickyBroadcast()) {
                    audioCapabilitiesReceiver.onNewAudioCapabilities(AudioCapabilities.getCapabilitiesInternal(context, intent, audioCapabilitiesReceiver.audioAttributes, audioCapabilitiesReceiver.routedDevice, audioCapabilitiesReceiver.getSpatializerChannelMasks()));
                    break;
                }
                break;
            case 4:
                context.getClass();
                intent.getClass();
                PowerManager powerManager = ((DefaultBatteryInfoProvider) this.zza).powerManager;
                Boolean valueOf = powerManager != null ? Boolean.valueOf(powerManager.isPowerSaveMode()) : null;
                if (valueOf != null) {
                    ((DefaultBatteryInfoProvider) this.zza).lowPowerMode = valueOf;
                    break;
                }
                break;
            case 5:
                e0 e0Var = (e0) this.zza;
                AppPreferenceStore appPreferenceStore = (AppPreferenceStore) e0Var.f;
                boolean z2 = intent.getExtras().getBoolean("save_to_profile");
                boolean z3 = intent.getExtras().getBoolean("is_password");
                if (z3) {
                    e0.shouldShowPasswordPrompt = false;
                } else {
                    e0.shouldShowCreditCardPrompt = false;
                }
                if (z2) {
                    if (z3) {
                        e0.shouldCapturePasswordValue = true;
                        HashMap hashMap = (HashMap) e0Var.b;
                        n.b bVar = (n.b) e0Var.a;
                        if (bVar != null) {
                            CaptureFieldsMappingService captureFieldsMappingService = (CaptureFieldsMappingService) bVar.b;
                            captureFieldsMappingService.mProfileStore.setData(hashMap);
                            captureFieldsMappingService.mProfileStore.store();
                        }
                        if (hashMap != null) {
                            hashMap.clear();
                        }
                    } else {
                        e0.shouldCaptureCreditCardValue = true;
                        HashMap hashMap2 = (HashMap) e0Var.c;
                        n.b bVar2 = (n.b) e0Var.a;
                        if (bVar2 != null) {
                            CaptureFieldsMappingService captureFieldsMappingService2 = (CaptureFieldsMappingService) bVar2.b;
                            captureFieldsMappingService2.mProfileStore.setData(hashMap2);
                            captureFieldsMappingService2.mProfileStore.store();
                        }
                        if (hashMap2 != null) {
                            hashMap2.clear();
                        }
                    }
                } else if (z3) {
                    e0.shouldCapturePasswordValue = false;
                } else {
                    e0.shouldCaptureCreditCardValue = false;
                }
                if (intent.getExtras().getBoolean("do_not_ask_again")) {
                    if (z3) {
                        SharedPreferences sharedPreferences = appPreferenceStore.mPreferences;
                        if (sharedPreferences != null) {
                            SharedPreferences.Editor edit = sharedPreferences.edit();
                            edit.putBoolean("F_SHOW_PASSWORD_PROMPT", false);
                            edit.apply();
                        }
                    } else {
                        SharedPreferences sharedPreferences2 = appPreferenceStore.mPreferences;
                        if (sharedPreferences2 != null) {
                            SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                            edit2.putBoolean("F_SHOW_CREDIT_CARD_PROMPT", false);
                            edit2.apply();
                        }
                    }
                    if (!z2) {
                        if (!z3) {
                            SharedPreferences sharedPreferences3 = appPreferenceStore.mPreferences;
                            if (sharedPreferences3 != null) {
                                SharedPreferences.Editor edit3 = sharedPreferences3.edit();
                                edit3.putBoolean("F_CAPTURE_CREDIT_CARD", false);
                                edit3.apply();
                                break;
                            }
                        } else {
                            SharedPreferences sharedPreferences4 = appPreferenceStore.mPreferences;
                            if (sharedPreferences4 != null) {
                                SharedPreferences.Editor edit4 = sharedPreferences4.edit();
                                edit4.putBoolean("F_CAPTURE_PASSWORD", false);
                                edit4.apply();
                                break;
                            }
                        }
                    }
                }
                break;
            case 6:
                CancellationSignal cancellationSignal = (CancellationSignal) this.zza;
                Fillr fillr = (Fillr) cancellationSignal.mOnCancelListener;
                if (!cancellationSignal.mIsCanceled) {
                    cancellationSignal.mIsCanceled = true;
                    View inflate = ((LayoutInflater) fillr.parentActivity.getSystemService("layout_inflater")).inflate(R.layout.f_dialog_capture_password, (ViewGroup) null);
                    Dialog dialog = new Dialog(new ContextThemeWrapper(fillr.parentActivity, R.style.com_fillr_browser_sdk_transparent_dialog), R.style.f_dialog);
                    dialog.setContentView(inflate);
                    Bundle extras = intent.getExtras();
                    if (extras != null && extras.getBoolean("is_password")) {
                        z = true;
                    }
                    ((TextView) inflate.findViewById(R.id.title_textview)).setText(fillr.parentActivity.getResources().getString(z ? R.string.capture_value_prompt_save_password : R.string.capture_value_prompt_save_credit_card));
                    ((TextView) inflate.findViewById(R.id.details_textview)).setText(fillr.parentActivity.getResources().getString(z ? R.string.capture_value_prompt_save_password_details : R.string.capture_value_prompt_save_credit_card_details));
                    inflate.findViewById(R.id.crose_button).setOnClickListener(new Toolbar.AnonymousClass4(dialog, i));
                    inflate.findViewById(R.id.dont_ask_again_view).setOnClickListener(new zae(i2, this, (ImageView) inflate.findViewById(R.id.dont_ask_again_checkbox)));
                    ((Button) inflate.findViewById(R.id.no_thanks_button)).setOnClickListener(new FillrCaptureSensitiveDataDialogManager$BoardResponseReceiver$3(this, z, dialog));
                    ((Button) inflate.findViewById(R.id.save_button)).setOnClickListener(new FillrCaptureSensitiveDataDialogManager$BoardResponseReceiver$3(this, dialog, z));
                    dialog.setOnDismissListener(new zzz(this, 1));
                    dialog.show();
                    break;
                }
                break;
            case 7:
                zzic zzicVar = (zzic) this.zza;
                if (intent != null) {
                    String action = intent.getAction();
                    if (action != null) {
                        int hashCode = action.hashCode();
                        if (hashCode == -1928239649) {
                            if (action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
                                zzaif.zza();
                                if (zzicVar.zzg.zzp(null, com.google.android.gms.measurement.internal.zzfy.zzaP)) {
                                    com.google.android.gms.measurement.internal.zzgu zzguVar = zzicVar.zzi;
                                    zzic.zzP(zzguVar);
                                    zzguVar.zzl.zza("App receiver notified triggers are available");
                                    zzhz zzhzVar = zzicVar.zzj;
                                    zzic.zzP(zzhzVar);
                                    zzhzVar.zzj(new zza(zzicVar, 7));
                                    break;
                                }
                            }
                        } else if (hashCode == 1279883384 && action.equals("com.google.android.gms.measurement.BATCHES_AVAILABLE")) {
                            com.google.android.gms.measurement.internal.zzgu zzguVar2 = zzicVar.zzi;
                            zzic.zzP(zzguVar2);
                            zzguVar2.zzl.zza("[sgtm] App Receiver notified batches are available");
                            zzhz zzhzVar2 = zzicVar.zzj;
                            zzic.zzP(zzhzVar2);
                            zzhzVar2.zzj(new zza(this, 6));
                            break;
                        }
                        com.google.android.gms.measurement.internal.zzgu zzguVar3 = zzicVar.zzi;
                        zzic.zzP(zzguVar3);
                        zzguVar3.zzg.zza("App receiver called with unknown action");
                        break;
                    } else {
                        com.google.android.gms.measurement.internal.zzgu zzguVar4 = zzicVar.zzi;
                        zzic.zzP(zzguVar4);
                        zzguVar4.zzg.zza("App receiver called with null action");
                        break;
                    }
                } else {
                    com.google.android.gms.measurement.internal.zzgu zzguVar5 = zzicVar.zzi;
                    zzic.zzP(zzguVar5);
                    zzguVar5.zzg.zza("App receiver called with null intent");
                    break;
                }
            case 8:
                com.google.android.play.core.splitinstall.zzx zzxVar = (com.google.android.play.core.splitinstall.zzx) this.zza;
                Bundle bundleExtra = intent.getBundleExtra("session_state");
                if (bundleExtra != null) {
                    int i3 = bundleExtra.getInt("session_id");
                    int i4 = bundleExtra.getInt("status");
                    int i5 = bundleExtra.getInt("error_code");
                    long j = bundleExtra.getLong("bytes_downloaded");
                    long j2 = bundleExtra.getLong("total_bytes_to_download");
                    ArrayList<String> stringArrayList = bundleExtra.getStringArrayList("module_names");
                    ArrayList<String> stringArrayList2 = bundleExtra.getStringArrayList("languages");
                    PendingIntent pendingIntent = (PendingIntent) bundleExtra.getParcelable("user_confirmation_intent");
                    ArrayList parcelableArrayList = bundleExtra.getParcelableArrayList("split_file_intents");
                    com.google.android.play.core.splitinstall.zza zzaVar = new com.google.android.play.core.splitinstall.zza(i3, i4, i5, j, j2, stringArrayList, stringArrayList2, pendingIntent, parcelableArrayList);
                    Obfuscator obfuscator = zzxVar.zza;
                    Object[] objArr = {zzaVar};
                    obfuscator.getClass();
                    if (Log.isLoggable("PlayCore", 3)) {
                        Log.d("PlayCore", Obfuscator.zzf$1(obfuscator.salt, "ListenerRegistryBroadcastReceiver.onReceive: %s", objArr));
                    }
                    zzxVar.zze.getClass();
                    com.google.android.play.core.splitinstall.internal.zzak zzakVar = (com.google.android.play.core.splitinstall.internal.zzak) com.google.android.play.core.splitinstall.zzo.zzb.get();
                    if (i4 == 3 && zzakVar != null) {
                        n nVar = new n(zzxVar, zzaVar, intent, context, false);
                        if (SplitCompat.zzb.get() == null) {
                            a$$ExternalSyntheticBUOutline0.m$1("Ingestion should only be called in SplitCompat mode.");
                            break;
                        } else {
                            zzakVar.zzd.execute(new Fillr.AnonymousClass2(zzakVar, parcelableArrayList, nVar, false, 28));
                            break;
                        }
                    } else {
                        zzxVar.zzk();
                        break;
                    }
                }
                break;
            default:
                Long valueOf2 = intent != null ? Long.valueOf(intent.getLongExtra("extra_download_id", -1L)) : null;
                if (valueOf2 == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
                    break;
                } else {
                    ((ProducerCoroutine) ((ProducerScope) this.zza)).mo1159trySendJP2dKIU(Long.valueOf(valueOf2.longValue()));
                    break;
                }
        }
    }

    public /* synthetic */ zzbq(Object obj, int i) {
        this.$r8$classId = i;
        this.zza = obj;
    }
}
