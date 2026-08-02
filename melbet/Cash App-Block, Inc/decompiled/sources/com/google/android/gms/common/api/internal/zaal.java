package com.google.android.gms.common.api.internal;

import android.content.Context;
import androidx.work.impl.WorkLauncherImpl;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.signin.internal.SignInClientImpl;
import com.squareup.cash.boost.db.Reward$Adapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public final class zaal extends zaaq {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ zaar zaa;
    public final Object zac;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zaal(zaar zaarVar, Object obj, int i) {
        super(zaarVar, 0);
        this.$r8$classId = i;
        this.zaa = zaarVar;
        this.zac = obj;
    }

    @Override // com.google.android.gms.common.api.internal.zaaq
    public final void zaa() {
        SignInClientImpl signInClientImpl;
        Set set;
        int i = this.$r8$classId;
        int i2 = 0;
        Object obj = this.zac;
        zaar zaarVar = this.zaa;
        switch (i) {
            case 0:
                GoogleApiAvailabilityLight googleApiAvailabilityLight = zaarVar.zad;
                zabd zabdVar = zaarVar.zaa;
                Context context = zaarVar.zac;
                WorkLauncherImpl workLauncherImpl = new WorkLauncherImpl(googleApiAvailabilityLight);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                HashMap hashMap = (HashMap) obj;
                for (GmsClient gmsClient : hashMap.keySet()) {
                    gmsClient.getClass();
                    if (((zaai) hashMap.get(gmsClient)).zac) {
                        arrayList2.add(gmsClient);
                    } else {
                        arrayList.add(gmsClient);
                    }
                }
                int i3 = -1;
                if (arrayList.isEmpty()) {
                    int size = arrayList2.size();
                    while (i2 < size) {
                        i3 = workLauncherImpl.zaa(context, (GmsClient) arrayList2.get(i2));
                        i2++;
                        if (i3 == 0) {
                        }
                    }
                } else {
                    int size2 = arrayList.size();
                    while (i2 < size2) {
                        i3 = workLauncherImpl.zaa(context, (GmsClient) arrayList.get(i2));
                        i2++;
                        if (i3 != 0) {
                        }
                    }
                }
                if (i3 != 0) {
                    zaaj zaajVar = new zaaj(this, zaarVar, new ConnectionResult(i3, null, null));
                    zaax zaaxVar = zabdVar.zam;
                    zaaxVar.sendMessage(zaaxVar.obtainMessage(1, zaajVar));
                    break;
                } else {
                    if (zaarVar.zam && (signInClientImpl = zaarVar.zak) != null) {
                        signInClientImpl.zad();
                    }
                    for (GmsClient gmsClient2 : hashMap.keySet()) {
                        BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks = (BaseGmsClient.ConnectionProgressReportCallbacks) hashMap.get(gmsClient2);
                        gmsClient2.getClass();
                        if (workLauncherImpl.zaa(context, gmsClient2) != 0) {
                            zaae zaaeVar = new zaae(this, zaarVar, connectionProgressReportCallbacks);
                            zaax zaaxVar2 = zabdVar.zam;
                            zaaxVar2.sendMessage(zaaxVar2.obtainMessage(1, zaaeVar));
                        } else {
                            gmsClient2.connect(connectionProgressReportCallbacks);
                        }
                    }
                    break;
                }
            default:
                zabd zabdVar2 = zaarVar.zaa;
                zaaz zaazVar = zabdVar2.zag;
                Reward$Adapter reward$Adapter = zaarVar.zar;
                if (reward$Adapter == null) {
                    set = Collections.EMPTY_SET;
                } else {
                    HashSet hashSet = new HashSet((Set) reward$Adapter.avatarsAdapter);
                    Map map = (Map) reward$Adapter.boost_detail_bottom_upsellAdapter;
                    for (Api api : map.keySet()) {
                        if (!zabdVar2.zab.containsKey(api.zab)) {
                            map.get(api).getClass();
                            a$$ExternalSyntheticBUOutline0.m$1();
                            break;
                        }
                    }
                    set = hashSet;
                }
                zaazVar.zad = set;
                ArrayList arrayList3 = (ArrayList) obj;
                int size3 = arrayList3.size();
                while (i2 < size3) {
                    ((GmsClient) arrayList3.get(i2)).getRemoteService(zaarVar.zao, zabdVar2.zag.zad);
                    i2++;
                }
                break;
        }
    }
}
