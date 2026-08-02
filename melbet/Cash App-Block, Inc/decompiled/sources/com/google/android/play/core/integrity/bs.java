package com.google.android.play.core.integrity;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.ae;
import com.google.android.play.integrity.internal.d;
import com.google.android.play.integrity.internal.s;
import com.google.mlkit.common.internal.zza;
import com.google.mlkit.common.internal.zzd;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class bs {
    public final ae a;
    public final s b;
    public final String c;
    public final TaskCompletionSource d;
    public final zza f;

    public bs(Context context, s sVar, zza zzaVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.d = taskCompletionSource;
        this.c = context.getPackageName();
        this.b = sVar;
        this.f = zzaVar;
        ae aeVar = new ae(context, sVar, "ExpressIntegrityService", bt.a, new zzd(7));
        this.a = aeVar;
        aeVar.c().post(new bj(this, taskCompletionSource, context));
    }

    public static /* bridge */ /* synthetic */ Bundle a(bs bsVar, q qVar, long j, long j2) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", bsVar.c);
        bundle.putLong("cloud.prj", j);
        bundle.putString("nonce", qVar.requestHash());
        bundle.putLong("warm.up.sid", j2);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 6);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        bundle.putIntegerArrayList("request.verdict.opt.out", new ArrayList<>(qVar.verdictOptOut()));
        ArrayList arrayList = new ArrayList();
        d.b(5, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(d.a(arrayList)));
        return bundle;
    }

    public static /* bridge */ /* synthetic */ Bundle b(bs bsVar, long j) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", bsVar.c);
        bundle.putLong("cloud.prj", j);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 6);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        d.b(4, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(d.a(arrayList)));
        return bundle;
    }

    public static boolean l(bs bsVar) {
        TaskCompletionSource taskCompletionSource = bsVar.d;
        return taskCompletionSource.zza.isSuccessful() && ((Integer) taskCompletionSource.zza.getResult()).intValue() < 83420000;
    }

    public static boolean m(bs bsVar) {
        TaskCompletionSource taskCompletionSource = bsVar.d;
        return taskCompletionSource.zza.isSuccessful() && ((Integer) taskCompletionSource.zza.getResult()).intValue() == 0;
    }
}
