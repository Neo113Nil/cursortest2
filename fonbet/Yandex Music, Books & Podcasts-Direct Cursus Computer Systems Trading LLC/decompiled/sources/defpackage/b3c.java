package defpackage;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.i;
import androidx.fragment.app.t;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lb3c;", "Landroidx/fragment/app/i;", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class b3c extends i {
    public Dialog g;

    @Override // androidx.fragment.app.o, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        if ((this.g instanceof lbv) && isResumed()) {
            Dialog dialog = this.g;
            if (dialog != null) {
                ((lbv) dialog).c();
            } else {
                jj4.j("null cannot be cast to non-null type com.facebook.internal.WebDialog");
            }
        }
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    public final void onCreate(Bundle bundle) {
        t l;
        lbv n3cVar;
        super.onCreate(bundle);
        if (this.g == null && (l = l()) != null) {
            Intent intent = l.getIntent();
            intent.getClass();
            Bundle i = xwi.i(intent);
            if (i != null ? i.getBoolean("is_fallback", false) : false) {
                r3 = i != null ? i.getString("url") : null;
                if (gvt.D(r3)) {
                    HashSet hashSet = j3c.a;
                    l.finish();
                    return;
                }
                String format = String.format("fb%s://bridge/", Arrays.copyOf(new Object[]{j3c.c()}, 1));
                int i2 = n3c.o;
                if (r3 == null) {
                    jj4.j("null cannot be cast to non-null type kotlin.String");
                    return;
                }
                int i3 = lbv.m;
                ivf.G(l);
                wxf.J();
                int i4 = lbv.m;
                if (i4 == 0) {
                    wxf.J();
                    i4 = lbv.m;
                }
                n3cVar = new n3c(l, i4);
                n3cVar.a = r3;
                n3cVar.b = format;
                n3cVar.c = new mka(this);
            } else {
                String string = i != null ? i.getString(Constants.KEY_ACTION) : null;
                Bundle bundle2 = i != null ? i.getBundle("params") : null;
                if (gvt.D(string)) {
                    HashSet hashSet2 = j3c.a;
                    l.finish();
                    return;
                }
                if (string == null) {
                    jj4.j("null cannot be cast to non-null type kotlin.String");
                    return;
                }
                Date date = ja.l;
                ja N = n7w.N();
                if (!n7w.P()) {
                    wxf.H(l, "context");
                    r3 = j3c.c();
                }
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                }
                n7b n7bVar = new n7b(this);
                if (N != null) {
                    bundle2.putString(CommonUrlParts.APP_ID, N.h);
                    bundle2.putString("access_token", N.e);
                } else {
                    bundle2.putString(CommonUrlParts.APP_ID, r3);
                }
                int i5 = lbv.m;
                ivf.G(l);
                n3cVar = new lbv(l, string, bundle2, 1, n7bVar);
            }
            this.g = n3cVar;
        }
    }

    @Override // androidx.fragment.app.i
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.g;
        if (dialog != null) {
            return dialog;
        }
        t l = l();
        if (l != null) {
            Intent intent = l.getIntent();
            intent.getClass();
            l.setResult(-1, xwi.e(intent, null, null));
            l.finish();
        }
        setShowsDialog(false);
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.getClass();
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    public final void onDestroyView() {
        Dialog dialog = getDialog();
        if (dialog != null && getRetainInstance()) {
            dialog.setDismissMessage(null);
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.o
    public final void onResume() {
        super.onResume();
        Dialog dialog = this.g;
        if (dialog instanceof lbv) {
            if (dialog != null) {
                ((lbv) dialog).c();
            } else {
                jj4.j("null cannot be cast to non-null type com.facebook.internal.WebDialog");
            }
        }
    }
}
