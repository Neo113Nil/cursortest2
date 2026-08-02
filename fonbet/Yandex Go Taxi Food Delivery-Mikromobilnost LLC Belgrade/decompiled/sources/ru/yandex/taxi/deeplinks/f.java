package ru.yandex.taxi.deeplinks;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import defpackage.alj;
import defpackage.evu0;
import defpackage.h1h;
import defpackage.jfb;
import defpackage.jst;
import defpackage.m6i0;
import defpackage.og21;
import defpackage.q0h;
import defpackage.v770;
import defpackage.y72;
import java.util.Arrays;
import java.util.UUID;
import ru.yandex.taxi.activity.AndroidComponentRepository$Component;
import ru.yandex.taxi.deeplinks.ExternalSchemesInteractor;

/* loaded from: classes9.dex */
public final class f {
    public final m6i0 a;
    public final q0h b;
    public final h1h c;
    public final y72 d;
    public final ExternalSchemesInteractor e;
    public final jfb f;

    public f(m6i0 m6i0Var, q0h q0hVar, h1h h1hVar, y72 y72Var, ExternalSchemesInteractor externalSchemesInteractor, jfb jfbVar) {
        this.a = m6i0Var;
        this.b = q0hVar;
        this.c = h1hVar;
        this.d = y72Var;
        this.e = externalSchemesInteractor;
        this.f = jfbVar;
    }

    public final Uri a(Uri uri) {
        Uri.Builder buildUpon = uri.buildUpon();
        this.a.getClass();
        return buildUpon.appendQueryParameter("_fake_uuid_", UUID.randomUUID().toString()).build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(Activity activity, String str, v770 v770Var) {
        Uri parse = Uri.parse(str);
        h1h h1hVar = this.c;
        Intent b = h1hVar.b(activity, parse, v770Var);
        if (activity instanceof alj) {
            if (!og21.b(parse)) {
                this.e.getClass();
                if (!ExternalSchemesInteractor.ExternalScheme.BANK.a(parse)) {
                    if (h1hVar.a(parse)) {
                        if (new ComponentName(activity, (Class<?>) this.d.a(AndroidComponentRepository$Component.MAIN_ACTIVITY)).equals(b.resolveActivity(activity.getPackageManager()))) {
                            ((alj) activity).handleNewIntent(b);
                            return;
                        }
                    }
                }
            }
            ((alj) activity).handleNewIntent(b);
            return;
        }
        try {
            activity.startActivity(b);
        } catch (ActivityNotFoundException e) {
            jst.e.k(e, String.format("Error to start activity with deeplink %s", Arrays.copyOf(new Object[]{str}, 1)));
        }
    }

    public final boolean c(Uri uri) {
        if (og21.b(uri)) {
            return true;
        }
        this.f.getClass();
        String authority = uri.getAuthority();
        return ((authority == null || evu0.J(authority)) && uri.isHierarchical() && uri.getQueryParameterNames().contains("ref")) || this.b.a(uri) != null;
    }
}
