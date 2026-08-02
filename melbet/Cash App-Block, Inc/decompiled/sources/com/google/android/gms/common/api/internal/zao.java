package com.google.android.gms.common.api.internal;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.util.Log;
import android.widget.ProgressBar;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.zzae;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes4.dex */
public final class zao implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object zaa;
    public final Object zab;

    public /* synthetic */ zao(ListenerHolder listenerHolder, ListenerHolder.Notifier notifier) {
        this.$r8$classId = 2;
        this.zab = listenerHolder;
        this.zaa = notifier;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IAccountAccessor iAccountAccessor;
        switch (this.$r8$classId) {
            case 0:
                zap zapVar = (zap) this.zaa;
                if (zapVar.zaa) {
                    zam zamVar = (zam) this.zab;
                    ConnectionResult connectionResult = zamVar.zab;
                    if (!connectionResult.hasResolution()) {
                        Activity activity = zapVar.getActivity();
                        int i = connectionResult.zzb;
                        GoogleApiAvailability googleApiAvailability = zapVar.zac;
                        if (googleApiAvailability.getErrorResolutionIntent(activity, i, null) == null) {
                            if (connectionResult.zzb != 18) {
                                int i2 = zamVar.zaa;
                                zapVar.zab.set(null);
                                zapVar.zad(connectionResult, i2);
                                break;
                            } else {
                                Activity activity2 = zapVar.getActivity();
                                ProgressBar progressBar = new ProgressBar(activity2, null, R.attr.progressBarStyleLarge);
                                progressBar.setIndeterminate(true);
                                progressBar.setVisibility(0);
                                AlertDialog.Builder builder = new AlertDialog.Builder(activity2);
                                builder.setView(progressBar);
                                builder.setMessage(com.google.android.gms.common.internal.zaf.zac(activity2, 18));
                                builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
                                AlertDialog create = builder.create();
                                GoogleApiAvailability.zah(activity2, create, "GooglePlayServicesUpdatingDialog", zapVar);
                                GoogleApiAvailability.zag(zapVar.getActivity().getApplicationContext(), new zan(this, create));
                                break;
                            }
                        } else {
                            googleApiAvailability.zab(zapVar.getActivity(), zapVar.mLifecycleFragment, connectionResult.zzb, zapVar);
                            break;
                        }
                    } else {
                        LifecycleFragment lifecycleFragment = zapVar.mLifecycleFragment;
                        Activity activity3 = zapVar.getActivity();
                        PendingIntent pendingIntent = connectionResult.zzc;
                        zzae.checkNotNull(pendingIntent);
                        lifecycleFragment.startActivityForResult(GoogleApiActivity.zaa(activity3, pendingIntent, zamVar.zaa, false), 1);
                        break;
                    }
                }
                break;
            case 1:
                ConnectionResult connectionResult2 = (ConnectionResult) this.zab;
                zabn zabnVar = (zabn) this.zaa;
                GoogleApiManager googleApiManager = zabnVar.zaa;
                GmsClient gmsClient = zabnVar.zab;
                zabk zabkVar = (zabk) googleApiManager.zao.get(zabnVar.zac);
                if (zabkVar != null) {
                    if (!connectionResult2.isSuccess()) {
                        zabkVar.zac(connectionResult2, null);
                        break;
                    } else {
                        zabnVar.zaf = true;
                        if (!gmsClient.requiresSignIn()) {
                            try {
                                gmsClient.getRemoteService(null, gmsClient.requiresSignIn() ? gmsClient.zac : Collections.EMPTY_SET);
                                break;
                            } catch (SecurityException e) {
                                Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
                                gmsClient.disconnect("Failed to get service from broker.");
                                zabkVar.zac(new ConnectionResult(10, null, null), null);
                                return;
                            }
                        } else if (zabnVar.zaf && (iAccountAccessor = zabnVar.zad) != null) {
                            gmsClient.getRemoteService(iAccountAccessor, zabnVar.zae);
                            break;
                        }
                    }
                }
                break;
            case 2:
                ListenerHolder listenerHolder = (ListenerHolder) this.zab;
                ListenerHolder.Notifier notifier = (ListenerHolder.Notifier) this.zaa;
                ListenerHolder.ListenerKey listenerKey = listenerHolder.zab;
                if (listenerKey != null) {
                    notifier.notifyListener(listenerKey.zaa);
                    break;
                }
                break;
            default:
                zacm zacmVar = (zacm) this.zaa;
                com.google.android.gms.signin.internal.zak zakVar = (com.google.android.gms.signin.internal.zak) this.zab;
                zacmVar.getClass();
                ConnectionResult connectionResult3 = zakVar.zab;
                if (connectionResult3.isSuccess()) {
                    com.google.android.gms.common.internal.zay zayVar = zakVar.zac;
                    zzae.checkNotNull(zayVar);
                    ConnectionResult connectionResult4 = zayVar.zac;
                    if (!connectionResult4.isSuccess()) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(connectionResult4)), new Exception());
                        zacmVar.zah.zaa(connectionResult4);
                        zacmVar.zag.disconnect();
                        break;
                    } else {
                        zabn zabnVar2 = zacmVar.zah;
                        IAccountAccessor zaa = zayVar.zaa();
                        Set set = zacmVar.zae;
                        zabnVar2.getClass();
                        if (zaa == null || set == null) {
                            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                            zabnVar2.zaa(new ConnectionResult(4, null, null));
                        } else {
                            zabnVar2.zad = zaa;
                            zabnVar2.zae = set;
                            if (zabnVar2.zaf) {
                                zabnVar2.zab.getRemoteService(zaa, set);
                            }
                        }
                    }
                } else {
                    zacmVar.zah.zaa(connectionResult3);
                }
                zacmVar.zag.disconnect();
                break;
        }
    }

    public /* synthetic */ zao(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.zab = obj2;
        this.zaa = obj;
    }
}
