package androidx.activity;

import D.AbstractC0287g;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import f.AbstractC4485a;
import g1.C4524d;

/* loaded from: classes.dex */
public final class n extends e.i {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p f4573h;

    public n(p pVar) {
        this.f4573h = pVar;
    }

    @Override // e.i
    public final void b(int i, AbstractC4485a abstractC4485a, Parcelable parcelable) {
        Bundle bundle;
        int i4;
        p pVar = this.f4573h;
        C4524d b9 = abstractC4485a.b(pVar, parcelable);
        if (b9 != null) {
            new Handler(Looper.getMainLooper()).post(new m(i, 0, this, b9));
            return;
        }
        Intent a9 = abstractC4485a.a(pVar, parcelable);
        if (a9.getExtras() != null) {
            Bundle extras = a9.getExtras();
            kotlin.jvm.internal.h.b(extras);
            if (extras.getClassLoader() == null) {
                a9.setExtrasClassLoader(pVar.getClassLoader());
            }
        }
        if (a9.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundle = a9.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            a9.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a9.getAction())) {
            String[] stringArrayExtra = a9.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            AbstractC0287g.d(pVar, stringArrayExtra, i);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a9.getAction())) {
            pVar.startActivityForResult(a9, i, bundle2);
            return;
        }
        e.j jVar = (e.j) a9.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            kotlin.jvm.internal.h.b(jVar);
            i4 = i;
        } catch (IntentSender.SendIntentException e6) {
            e = e6;
            i4 = i;
        }
        try {
            pVar.startIntentSenderForResult(jVar.f37229n, i4, jVar.f37230u, jVar.f37231v, jVar.f37232w, 0, bundle2);
        } catch (IntentSender.SendIntentException e9) {
            e = e9;
            new Handler(Looper.getMainLooper()).post(new m(i4, 1, this, e));
        }
    }
}
