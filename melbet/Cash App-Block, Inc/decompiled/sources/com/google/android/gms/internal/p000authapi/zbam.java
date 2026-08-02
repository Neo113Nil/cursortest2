package com.google.android.gms.internal.p000authapi;

import android.content.Context;
import android.os.Binder;
import android.os.Looper;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.biometric.BiometricPrompt;
import app.cash.trifle.Trifle;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.RevocationBoundService;
import com.google.android.gms.auth.api.signin.internal.Storage;
import com.google.android.gms.auth.api.signin.internal.zbb;
import com.google.android.gms.auth.api.signin.internal.zbi;
import com.google.android.gms.auth.api.signin.internal.zbm;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.StatusPendingResult;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.common.api.zad;
import com.google.android.gms.common.internal.zas;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.internal.location.zzda;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.mlkit.vision.text.zzd;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import org.brotli.dec.HuffmanTreeGroup;
import org.json.JSONException;

/* loaded from: classes4.dex */
public final class zbam extends zzb {
    public final /* synthetic */ int $r8$classId = 1;
    public final Object zba;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zbam(TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback", 1);
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zba(int i, Parcel parcel, Parcel parcel2) {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResult2;
        String zab;
        int i2 = this.$r8$classId;
        Object obj = this.zba;
        switch (i2) {
            case 0:
                if (i != 1) {
                    return false;
                }
                Status status = (Status) zbc.zba(parcel, Status.CREATOR);
                BeginSignInResult beginSignInResult = (BeginSignInResult) zbc.zba(parcel, BeginSignInResult.CREATOR);
                zbc.zbb(parcel);
                TaskUtil.setResultOrApiException(status, beginSignInResult, (TaskCompletionSource) obj);
                return true;
            default:
                RevocationBoundService revocationBoundService = (RevocationBoundService) obj;
                if (i != 1) {
                    if (i != 2) {
                        return false;
                    }
                    zbd$1();
                    BiometricPrompt.zbc(revocationBoundService).zbd();
                    return true;
                }
                zbd$1();
                Storage storage = Storage.getInstance(revocationBoundService);
                GoogleSignInAccount savedDefaultGoogleSignInAccount = storage.getSavedDefaultGoogleSignInAccount();
                GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.DEFAULT_SIGN_IN;
                if (savedDefaultGoogleSignInAccount != null) {
                    String zab2 = storage.zab("defaultGoogleSignInAccount");
                    if (!TextUtils.isEmpty(zab2) && (zab = storage.zab(Storage.zae("googleSignInOptions", zab2))) != null) {
                        try {
                            googleSignInOptions = GoogleSignInOptions.zaa(zab);
                        } catch (JSONException unused) {
                        }
                    }
                    googleSignInOptions = null;
                }
                GoogleSignInOptions googleSignInOptions2 = googleSignInOptions;
                zzae.checkNotNull(googleSignInOptions2);
                zzda zzdaVar = new zzda((RevocationBoundService) obj, null, Auth.GOOGLE_SIGN_IN_API, googleSignInOptions2, new GoogleApi.Settings(new Trifle(10), Looper.getMainLooper()));
                int i3 = 6;
                Context context = zzdaVar.zab;
                zabq zabqVar = zzdaVar.zaj;
                if (savedDefaultGoogleSignInAccount == null) {
                    boolean z = zzdaVar.zba() == 3;
                    zbm.zba.d("Signing out", new Object[0]);
                    zbm.zbh(context);
                    if (z) {
                        BasePendingResult statusPendingResult = new StatusPendingResult(zabqVar);
                        statusPendingResult.setResult(Status.RESULT_SUCCESS);
                        basePendingResult = statusPendingResult;
                    } else {
                        zbi zbiVar = new zbi(zabqVar, 0);
                        zabqVar.execute(zbiVar);
                        basePendingResult = zbiVar;
                    }
                    basePendingResult.addStatusListener(new zas(basePendingResult, new TaskCompletionSource(), new zzd(i3)));
                    return true;
                }
                boolean z2 = zzdaVar.zba() == 3;
                zbm.zba.d("Revoking access", new Object[0]);
                String zab3 = Storage.getInstance(context).zab("refreshToken");
                zbm.zbh(context);
                if (!z2) {
                    zbi zbiVar2 = new zbi(zabqVar, 1);
                    zabqVar.execute(zbiVar2);
                    basePendingResult2 = zbiVar2;
                } else if (zab3 == null) {
                    HuffmanTreeGroup huffmanTreeGroup = zbb.zba;
                    Status status2 = new Status(4, null, null, null);
                    zzae.checkArgument("Status code must not be SUCCESS", !status2.isSuccess());
                    BasePendingResult zadVar = new zad(status2);
                    zadVar.setResult(status2);
                    basePendingResult2 = zadVar;
                } else {
                    zbb zbbVar = new zbb(zab3);
                    new Thread(zbbVar).start();
                    basePendingResult2 = zbbVar.zbc;
                }
                basePendingResult2.addStatusListener(new zas(basePendingResult2, new TaskCompletionSource(), new zzd(i3)));
                return true;
        }
    }

    public void zbd$1() {
        if (!Hex.isGooglePlayServicesUid((RevocationBoundService) this.zba, Binder.getCallingUid())) {
            throw new SecurityException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Binder.getCallingUid(), "Calling UID ", " is not Google Play services."));
        }
    }

    public zbam(RevocationBoundService revocationBoundService) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService", 1);
        this.zba = revocationBoundService;
    }
}
