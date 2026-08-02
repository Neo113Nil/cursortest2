package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.a;
import androidx.fragment.app.i;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import java.util.HashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import ru.yandex.music.R;

@Deprecated
/* loaded from: classes.dex */
public class j18 extends i {
    public static ScheduledThreadPoolExecutor m;
    public ProgressBar g;
    public TextView h;
    public Dialog i;
    public volatile i18 j;
    public volatile ScheduledFuture k;
    public zvp l;

    public final void A(i18 i18Var) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        this.j = i18Var;
        this.h.setText(i18Var.a);
        this.h.setVisibility(0);
        this.g.setVisibility(8);
        synchronized (j18.class) {
            try {
                if (m == null) {
                    m = new ScheduledThreadPoolExecutor(1);
                }
                scheduledThreadPoolExecutor = m;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.k = scheduledThreadPoolExecutor.schedule(new q9(19, this), i18Var.b, TimeUnit.SECONDS);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0102  */
    @Override // androidx.fragment.app.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Dialog onCreateDialog(Bundle bundle) {
        Bundle bundle2;
        Bundle bundle3;
        String str;
        this.i = new Dialog(l(), R.style.com_facebook_auth_dialog);
        String str2 = null;
        View inflate = l().getLayoutInflater().inflate(R.layout.com_facebook_device_auth_dialog_fragment, (ViewGroup) null);
        this.g = (ProgressBar) inflate.findViewById(R.id.progress_bar);
        this.h = (TextView) inflate.findViewById(R.id.confirmation_code);
        ((Button) inflate.findViewById(R.id.cancel_button)).setOnClickListener(new je(4, this));
        ((TextView) inflate.findViewById(R.id.com_facebook_device_auth_instructions)).setText(Html.fromHtml(getString(R.string.com_facebook_device_auth_instructions)));
        this.i.setContentView(inflate);
        zvp zvpVar = this.l;
        if (zvpVar != null) {
            if (zvpVar instanceof oxp) {
                oxp oxpVar = (oxp) zvpVar;
                bundle2 = new Bundle();
                cwp cwpVar = oxpVar.f;
                if (cwpVar != null) {
                    gvt.M("hashtag", cwpVar.a, bundle2);
                }
                Uri uri = oxpVar.a;
                if (uri != null) {
                    gvt.M("href", uri.toString(), bundle2);
                }
                gvt.M("quote", oxpVar.j, bundle2);
            } else if (zvpVar instanceof sxp) {
                sxp sxpVar = (sxp) zvpVar;
                bundle2 = new Bundle();
                cwp cwpVar2 = sxpVar.f;
                if (cwpVar2 != null) {
                    gvt.M("hashtag", cwpVar2.a, bundle2);
                }
                gvt.M("action_type", sxpVar.g.a.getString("og:type"), bundle2);
                try {
                    JSONObject o0 = qwp.o0(qwp.s0(sxpVar), false);
                    if (o0 != null) {
                        gvt.M("action_properties", o0.toString(), bundle2);
                    }
                } catch (JSONException e) {
                    throw new c3c("Unable to serialize the ShareOpenGraphContent to JSON", e);
                }
            }
            bundle3 = bundle2;
            if (bundle3 != null || bundle3.size() == 0) {
                z(new g3c(0, "", "Failed to get share content"));
            }
            StringBuilder sb = new StringBuilder();
            sb.append(j3c.c());
            sb.append("|");
            wxf.J();
            str = j3c.e;
            if (str != null) {
                xq0.q("No Client Token found, please set the Client Token.");
                return null;
            }
            sb.append(str);
            bundle3.putString("access_token", sb.toString());
            HashMap hashMap = h18.a;
            if (!bp6.a.contains(h18.class)) {
                try {
                    str2 = h18.b();
                } catch (Throwable th) {
                    bp6.a(h18.class, th);
                }
            }
            bundle3.putString("device_info", str2);
            new ood(null, "device/share", bundle3, z6e.b, new qa(1, this), 0).d();
            return this.i;
        }
        bundle3 = null;
        if (bundle3 != null) {
        }
        z(new g3c(0, "", "Failed to get share content"));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j3c.c());
        sb2.append("|");
        wxf.J();
        str = j3c.e;
        if (str != null) {
        }
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        i18 i18Var;
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (bundle != null && (i18Var = (i18) bundle.getParcelable("request_state")) != null) {
            A(i18Var);
        }
        return onCreateView;
    }

    @Override // androidx.fragment.app.i, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.k != null) {
            this.k.cancel(true);
        }
        y(new Intent());
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.j != null) {
            bundle.putParcelable("request_state", this.j);
        }
    }

    public final void y(Intent intent) {
        if (this.j != null) {
            h18.a(this.j.a);
        }
        g3c g3cVar = (g3c) intent.getParcelableExtra("error");
        if (g3cVar != null) {
            Toast.makeText(getContext(), g3cVar.d(), 0).show();
        }
        if (isAdded()) {
            t l = l();
            l.setResult(-1, intent);
            l.finish();
        }
    }

    public final void z(g3c g3cVar) {
        if (isAdded()) {
            y fragmentManager = getFragmentManager();
            fragmentManager.getClass();
            a aVar = new a(fragmentManager);
            aVar.m(this);
            aVar.j();
        }
        Intent intent = new Intent();
        intent.putExtra("error", g3cVar);
        y(intent);
    }
}
