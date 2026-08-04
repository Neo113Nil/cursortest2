package com.gamericefishpro.space.d;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class j {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();
    public final transient LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();
    public final Bundle g = new Bundle();
    public final /* synthetic */ k h;

    public j(k kVar) {
        this.h = kVar;
    }

    public final boolean a(int i, int i2, Intent intent) {
        String str = (String) this.a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        com.gamericefishpro.space.h.c cVar = (com.gamericefishpro.space.h.c) this.e.get(str);
        if ((cVar != null ? cVar.a : null) != null) {
            ArrayList arrayList = this.d;
            if (arrayList.contains(str)) {
                cVar.a.f(cVar.b.D(i2, intent));
                arrayList.remove(str);
                return true;
            }
        }
        this.f.remove(str);
        this.g.putParcelable(str, new com.gamericefishpro.space.h.b(i2, intent));
        return true;
    }

    public final void b(int i, com.gamericefishpro.space.i.a contract, Object obj) {
        com.gamericefishpro.space.vb.c cVar;
        Intent input;
        int i2;
        Intrinsics.checkNotNullParameter(contract, "contract");
        int i3 = contract.a;
        Bundle bundleExtra = null;
        k context = this.h;
        switch (i3) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                String input2 = (String) obj;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(input2, "input");
                cVar = com.gamericefishpro.space.s3.a.a(context, input2) != 0 ? null : new com.gamericefishpro.space.vb.c(21, Boolean.TRUE);
                break;
            default:
                Intrinsics.checkNotNullParameter(context, "context");
                break;
        }
        int i4 = 0;
        if (cVar != null) {
            new Handler(Looper.getMainLooper()).post(new i(i, i4, this, cVar));
            return;
        }
        switch (contract.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                String input3 = (String) obj;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(input3, "input");
                String[] input4 = {input3};
                Intrinsics.checkNotNullParameter(input4, "input");
                input = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", input4);
                Intrinsics.checkNotNullExpressionValue(input, "putExtra(...)");
                break;
            default:
                input = (Intent) obj;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(input, "input");
                break;
        }
        if (input.getExtras() != null) {
            Bundle extras = input.getExtras();
            Intrinsics.b(extras);
            if (extras.getClassLoader() == null) {
                input.setExtrasClassLoader(context.getClassLoader());
            }
        }
        if (input.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundleExtra = input.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            input.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        }
        Bundle bundle = bundleExtra;
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(input.getAction())) {
            String[] stringArrayExtra = input.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            com.gamericefishpro.space.r3.a.d(context, stringArrayExtra, i);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(input.getAction())) {
            context.startActivityForResult(input, i, bundle);
            return;
        }
        com.gamericefishpro.space.h.f fVar = (com.gamericefishpro.space.h.f) input.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            Intrinsics.b(fVar);
            i2 = i;
            try {
                context.startIntentSenderForResult(fVar.d, i2, fVar.e, fVar.i, fVar.v, 0, bundle);
                Unit unit = Unit.a;
            } catch (IntentSender.SendIntentException e) {
                e = e;
                new Handler(Looper.getMainLooper()).post(new i(i2, 1, this, e));
            }
        } catch (IntentSender.SendIntentException e2) {
            e = e2;
            i2 = i;
        }
    }
}
