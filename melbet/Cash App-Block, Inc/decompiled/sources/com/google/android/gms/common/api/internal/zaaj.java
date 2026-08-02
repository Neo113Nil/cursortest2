package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.zzae;

/* loaded from: classes4.dex */
public final class zaaj extends zabb {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Object zaa;
    public final /* synthetic */ Object zab;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zaaj(zaal zaalVar, zaba zabaVar, ConnectionResult connectionResult) {
        super(zabaVar);
        this.zaa = connectionResult;
        this.zab = zaalVar;
    }

    @Override // com.google.android.gms.common.api.internal.zabb
    public final void zaa() {
        int i = this.$r8$classId;
        Object obj = this.zab;
        Object obj2 = this.zaa;
        switch (i) {
            case 0:
                ((zaal) obj).zaa.zaF((ConnectionResult) obj2);
                break;
            default:
                zaar zaarVar = (zaar) obj2;
                com.google.android.gms.signin.internal.zak zakVar = (com.google.android.gms.signin.internal.zak) obj;
                if (zaarVar.zaI(0)) {
                    ConnectionResult connectionResult = zakVar.zab;
                    if (!connectionResult.isSuccess()) {
                        if (zaarVar.zal && !connectionResult.hasResolution()) {
                            zaarVar.zaD();
                            zaarVar.zaA();
                            break;
                        } else {
                            zaarVar.zaF(connectionResult);
                            break;
                        }
                    } else {
                        com.google.android.gms.common.internal.zay zayVar = zakVar.zac;
                        zzae.checkNotNull(zayVar);
                        ConnectionResult connectionResult2 = zayVar.zac;
                        if (!connectionResult2.isSuccess()) {
                            String valueOf = String.valueOf(connectionResult2);
                            Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                            zaarVar.zaF(connectionResult2);
                            break;
                        } else {
                            zaarVar.zan = true;
                            IAccountAccessor zaa = zayVar.zaa();
                            zzae.checkNotNull(zaa);
                            zaarVar.zao = zaa;
                            zaarVar.zap = zayVar.zad;
                            zaarVar.zaq = zayVar.zae;
                            zaarVar.zaA();
                            break;
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zaaj(zaao zaaoVar, zaar zaarVar, zaar zaarVar2, com.google.android.gms.signin.internal.zak zakVar) {
        super(zaarVar);
        this.zaa = zaarVar2;
        this.zab = zakVar;
    }
}
