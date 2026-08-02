package androidx.activity;

import D.AbstractC0276f;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import f.AbstractC4511a;
import i1.C4586c;

/* loaded from: classes.dex */
public final class n extends e.i {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p f4426h;

    public n(p pVar) {
        this.f4426h = pVar;
    }

    @Override // e.i
    public final void b(int i, AbstractC4511a abstractC4511a, Parcelable parcelable) {
        Bundle bundle;
        int i4;
        p pVar = this.f4426h;
        C4586c b9 = abstractC4511a.b(pVar, parcelable);
        if (b9 != null) {
            new Handler(Looper.getMainLooper()).post(new m(i, 0, this, b9));
            return;
        }
        Intent a9 = abstractC4511a.a(pVar, parcelable);
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
            AbstractC0276f.d(pVar, stringArrayExtra, i);
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
        } catch (IntentSender.SendIntentException e9) {
            e = e9;
            i4 = i;
        }
        try {
            pVar.startIntentSenderForResult(jVar.f37206n, i4, jVar.f37207u, jVar.f37208v, jVar.f37209w, 0, bundle2);
        } catch (IntentSender.SendIntentException e10) {
            e = e10;
            new Handler(Looper.getMainLooper()).post(new m(i4, 1, this, e));
        }
    }
}
