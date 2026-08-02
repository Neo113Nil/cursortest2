package ru.yandex.taxi.deeplinks;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import androidx.lifecycle.Lifecycle;
import com.adjust.sdk.Constants;
import defpackage.bcr;
import defpackage.cne0;
import defpackage.dne0;
import defpackage.evu0;
import defpackage.jl40;
import defpackage.jst;
import defpackage.jy60;
import defpackage.tje;
import defpackage.tse;
import defpackage.unr0;
import defpackage.xby;
import ru.yandex.taxi.deeplinks.h;

/* loaded from: classes9.dex */
public final class h implements jy60 {
    public final Activity a;
    public final tse b;
    public final Lifecycle c;
    public final cne0 d;
    public final bcr e = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: bcr
        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            h.this.d(sharedPreferences, str);
        }
    };

    /* JADX WARN: Type inference failed for: r1v2, types: [bcr] */
    public h(dne0 dne0Var, Activity activity, tse tseVar, Lifecycle lifecycle) {
        this.a = activity;
        this.b = tseVar;
        this.c = lifecycle;
        this.d = dne0Var.a("google.analytics.deferred.deeplink.prefs");
    }

    public final boolean d(SharedPreferences sharedPreferences, String str) {
        String string;
        if (!jl40.l(str, Constants.DEEPLINK) || (string = sharedPreferences.getString(Constants.DEEPLINK, "")) == null || evu0.J(string)) {
            return false;
        }
        sharedPreferences.edit().remove(Constants.DEEPLINK).apply();
        Uri parse = Uri.parse(string);
        Intent intent = new Intent("android.intent.action.VIEW", parse);
        intent.putExtra("KEY_OPEN_REASON", "firebase_deeplink");
        Activity activity = this.a;
        intent.setPackage(activity.getApplicationContext().getPackageName());
        try {
            activity.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException e) {
            xby.l(jst.e, "DeferredDeeplink.TargetNotFound", null, e, unr0.n(parse, "Can not start activity with uri: "), 2);
            return true;
        }
    }

    @Override // defpackage.s150
    public final String getName() {
        return "FirebaseDeferredDeeplinkInteractor";
    }

    @Override // defpackage.jy60
    public final void h() {
        tje.N(this.b, null, null, new FirebaseDeferredDeeplinkInteractor$onFirstContentfulPaint$1(this, null), 3);
    }
}
