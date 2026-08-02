package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.i;
import com.facebook.FacebookActivity;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Date;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public class b08 extends i {
    public View g;
    public TextView h;
    public TextView i;
    public c08 j;
    public volatile pod l;
    public volatile ScheduledFuture m;
    public volatile a08 n;
    public final AtomicBoolean k = new AtomicBoolean();
    public boolean o = false;
    public boolean p = false;
    public atg q = null;

    public static void y(b08 b08Var, String str, Long l, Long l2) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,permissions,name");
        Date date = l.longValue() != 0 ? new Date((l.longValue() * 1000) + new Date().getTime()) : null;
        Date date2 = l2.longValue() != 0 ? new Date(l2.longValue() * 1000) : null;
        new ood(new ja(str, j3c.c(), CommonUrlParts.Values.FALSE_INTEGER, null, null, null, null, date, null, date2), "me", bundle, z6e.a, new pa(b08Var, str, date, date2), 0).d();
    }

    public static void z(b08 b08Var, String str, gqt gqtVar, String str2, Date date, Date date2) {
        c08 c08Var = b08Var.j;
        String c = j3c.c();
        ArrayList arrayList = gqtVar.a;
        ArrayList arrayList2 = gqtVar.b;
        ArrayList arrayList3 = gqtVar.c;
        c08Var.getClass();
        c08Var.i().f(new btg(c08Var.i().g, 1, new ja(str2, c, str, arrayList, arrayList2, arrayList3, ra.DEVICE_AUTH, date, null, date2), null, null, null));
        b08Var.getDialog().dismiss();
    }

    public final View A(boolean z) {
        View inflate = l().getLayoutInflater().inflate(z ? R.layout.com_facebook_smart_device_dialog_fragment : R.layout.com_facebook_device_auth_dialog_fragment, (ViewGroup) null);
        this.g = inflate.findViewById(R.id.progress_bar);
        this.h = (TextView) inflate.findViewById(R.id.confirmation_code);
        ((Button) inflate.findViewById(R.id.cancel_button)).setOnClickListener(new je(3, this));
        TextView textView = (TextView) inflate.findViewById(R.id.com_facebook_device_auth_instructions);
        this.i = textView;
        textView.setText(Html.fromHtml(getString(R.string.com_facebook_device_auth_instructions)));
        return inflate;
    }

    public final void B() {
        if (this.k.compareAndSet(false, true)) {
            if (this.n != null) {
                h18.a(this.n.b);
            }
            c08 c08Var = this.j;
            if (c08Var != null) {
                c08Var.i().f(btg.a(c08Var.i().g, "User canceled log in."));
            }
            getDialog().dismiss();
        }
    }

    public final void D(c3c c3cVar) {
        if (this.k.compareAndSet(false, true)) {
            if (this.n != null) {
                h18.a(this.n.b);
            }
            c08 c08Var = this.j;
            c08Var.i().f(btg.b(c08Var.i().g, null, c3cVar.getMessage(), null));
            getDialog().dismiss();
        }
    }

    public final void E() {
        this.n.e = new Date().getTime();
        Bundle bundle = new Bundle();
        bundle.putString("code", this.n.c);
        this.l = new ood(null, "device/login_status", bundle, z6e.b, new xz7(this, 1), 0).d();
    }

    public final void F() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        synchronized (c08.class) {
            try {
                if (c08.c == null) {
                    c08.c = new ScheduledThreadPoolExecutor(1);
                }
                scheduledThreadPoolExecutor = c08.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.m = scheduledThreadPoolExecutor.schedule(new q9(18, this), this.n.d, TimeUnit.SECONDS);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G(a08 a08Var) {
        Bitmap createBitmap;
        boolean d;
        this.n = a08Var;
        this.h.setText(a08Var.b);
        String str = a08Var.a;
        HashMap hashMap = h18.a;
        boolean z = false;
        if (!bp6.a.contains(h18.class)) {
            try {
                EnumMap enumMap = new EnumMap(g6b.class);
                enumMap.put((EnumMap) g6b.c, (g6b) 2);
                try {
                    x23 b = new wul().b(str, zo2.a, 200, 200, enumMap);
                    int i = b.b;
                    int i2 = b.a;
                    int[] iArr = new int[i * i2];
                    for (int i3 = 0; i3 < i; i3++) {
                        int i4 = i3 * i2;
                        for (int i5 = 0; i5 < i2; i5++) {
                            iArr[i4 + i5] = b.b(i5, i3) ? -16777216 : -1;
                        }
                    }
                    createBitmap = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
                    try {
                        createBitmap.setPixels(iArr, 0, i2, 0, 0, i2, i);
                    } catch (k6w unused) {
                    }
                } catch (k6w unused2) {
                }
            } catch (Throwable th) {
                bp6.a(h18.class, th);
            }
            this.i.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, new BitmapDrawable(getResources(), createBitmap), (Drawable) null, (Drawable) null);
            this.h.setVisibility(0);
            this.g.setVisibility(8);
            if (!this.p) {
                String str2 = a08Var.b;
                if (!bp6.a.contains(h18.class)) {
                    try {
                    } catch (Throwable th2) {
                        bp6.a(h18.class, th2);
                    }
                    if (h18.c()) {
                        d = h18.d(str2);
                        if (d) {
                            pt0 pt0Var = new pt0(getContext(), (String) null);
                            HashSet hashSet = j3c.a;
                            if (gtt.c()) {
                                pt0Var.z(null, "fb_smart_login_service");
                            }
                        }
                    }
                }
                d = false;
                if (d) {
                }
            }
            if (a08Var.e != 0 && (new Date().getTime() - a08Var.e) - (a08Var.d * 1000) < 0) {
                z = true;
            }
            if (z) {
                E();
                return;
            } else {
                F();
                return;
            }
        }
        createBitmap = null;
        this.i.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, new BitmapDrawable(getResources(), createBitmap), (Drawable) null, (Drawable) null);
        this.h.setVisibility(0);
        this.g.setVisibility(8);
        if (!this.p) {
        }
        if (a08Var.e != 0) {
            z = true;
        }
        if (z) {
        }
    }

    public final void H(atg atgVar) {
        this.q = atgVar;
        Bundle bundle = new Bundle();
        bundle.putString("scope", TextUtils.join(StringUtils.COMMA, atgVar.b));
        String str = atgVar.g;
        if (str != null) {
            bundle.putString("redirect_uri", str);
        }
        String str2 = atgVar.i;
        if (str2 != null) {
            bundle.putString("target_user_id", str2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(j3c.c());
        sb.append("|");
        wxf.J();
        String str3 = j3c.e;
        if (str3 == null) {
            xq0.q("No Client Token found, please set the Client Token.");
            return;
        }
        sb.append(str3);
        bundle.putString("access_token", sb.toString());
        bundle.putString("device_info", h18.b());
        new ood(null, "device/login", bundle, z6e.b, new xz7(this, 0), 0).d();
    }

    @Override // androidx.fragment.app.i
    public final Dialog onCreateDialog(Bundle bundle) {
        wz7 wz7Var = new wz7(l(), R.style.com_facebook_auth_dialog);
        wz7Var.setContentView(A(h18.c() && !this.p));
        return wz7Var;
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        a08 a08Var;
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.j = (c08) ((ftg) ((FacebookActivity) l()).a).h.g();
        if (bundle != null && (a08Var = (a08) bundle.getParcelable("request_state")) != null) {
            G(a08Var);
        }
        return onCreateView;
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    public final void onDestroyView() {
        this.o = true;
        this.k.set(true);
        super.onDestroyView();
        if (this.l != null) {
            this.l.cancel(true);
        }
        if (this.m != null) {
            this.m.cancel(true);
        }
        this.g = null;
        this.h = null;
        this.i = null;
    }

    @Override // androidx.fragment.app.i, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.o) {
            return;
        }
        B();
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.n != null) {
            bundle.putParcelable("request_state", this.n);
        }
    }
}
