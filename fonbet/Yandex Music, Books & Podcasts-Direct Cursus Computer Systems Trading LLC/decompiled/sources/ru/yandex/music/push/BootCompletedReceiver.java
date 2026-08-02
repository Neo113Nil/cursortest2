package ru.yandex.music.push;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import defpackage.bdt;
import defpackage.f1d;
import defpackage.fmg;
import defpackage.hag;
import defpackage.l18;
import defpackage.qdc;
import defpackage.su4;
import defpackage.vz1;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.data.sql.YMContentProvider;

/* loaded from: classes6.dex */
public final class BootCompletedReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        if (!Intrinsics.d(intent.getAction(), "android.intent.action.BOOT_COMPLETED")) {
            su4.s(2, null, f1d.g("Incorrect action in Boot Receiver: ", intent.getAction()), null);
            return;
        }
        try {
            l18 l18Var = l18.b;
            bdt I = hag.I(fmg.class);
            qdc qdcVar = l18Var.a;
            qdcVar.getClass();
            fmg fmgVar = (fmg) qdcVar.C(I);
            fmg.e.u(fmgVar.a);
            fmgVar.a();
        } catch (NullPointerException e) {
            throw new IllegalStateException(vz1.p("Di not initialized in Boot Receiver. Process=", Build.VERSION.SDK_INT >= 28 ? Application.getProcessName() : "unknown", "; isMainProcess=", YMContentProvider.a), e);
        }
    }
}
