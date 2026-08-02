package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.graphics.drawable.IconCompat;
import com.IceFishing.LiveIceFishing.C5248R;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import r2.C4906k;
import u2.C5067a;
import v2.BinderC5100d;

/* renamed from: com.google.android.gms.internal.ads.Yp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC2903Yp extends AbstractBinderC3359i8 implements InterfaceC3274ge {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f29521A = 0;

    /* renamed from: n, reason: collision with root package name */
    public final HashMap f29522n;

    /* renamed from: u, reason: collision with root package name */
    public final Context f29523u;

    /* renamed from: v, reason: collision with root package name */
    public final C3230fo f29524v;

    /* renamed from: w, reason: collision with root package name */
    public final x2.l f29525w;

    /* renamed from: x, reason: collision with root package name */
    public final C2821Tp f29526x;

    /* renamed from: y, reason: collision with root package name */
    public String f29527y;

    /* renamed from: z, reason: collision with root package name */
    public String f29528z;

    public BinderC2903Yp(Context context, C2821Tp c2821Tp, x2.l lVar, C3230fo c3230fo) {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        this.f29522n = new HashMap();
        this.f29523u = context;
        this.f29524v = c3230fo;
        this.f29525w = lVar;
        this.f29526x = c2821Tp;
    }

    public static void V3(Context context, C3230fo c3230fo, C2821Tp c2821Tp, String str, String str2, Map map) {
        String str3;
        C4906k c4906k = C4906k.f40186C;
        String str4 = true != c4906k.f40196h.i(context) ? "offline" : "online";
        if (c3230fo != null) {
            S0.e a9 = c3230fo.a();
            a9.M("gqi", str);
            a9.M(NativeAdvancedJsUtils.f18693p, str2);
            a9.M("device_connectivity", str4);
            c4906k.f40198k.getClass();
            a9.M("event_timestamp", String.valueOf(System.currentTimeMillis()));
            for (Map.Entry entry : map.entrySet()) {
                a9.M((String) entry.getKey(), (String) entry.getValue());
            }
            str3 = ((C3230fo) a9.f2909v).f31215a.f31902f.a((ConcurrentHashMap) a9.f2908u);
        } else {
            str3 = "";
        }
        String str5 = str3;
        C4906k.f40186C.f40198k.getClass();
        C3732p5 c3732p5 = new C3732p5(str, str5, 2, System.currentTimeMillis());
        c2821Tp.getClass();
        c2821Tp.a(new S0.l(17, c2821Tp, c3732p5));
    }

    public static final PendingIntent W3(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str3);
        if (Build.VERSION.SDK_INT < 29 || !str.equals("offline_notification_clicked")) {
            intent.setClassName(context, "com.google.android.gms.ads.AdService");
            return PendingIntent.getService(context, 0, AbstractC4060vA.a(1140850688, intent), 1140850688);
        }
        intent.setClassName(context, "com.google.android.gms.ads.NotificationHandlerActivity");
        return PendingIntent.getActivity(context, 0, AbstractC4060vA.a(201326592, intent), 201326592);
    }

    public static String b4(int i, String str) {
        Resources c9 = C4906k.f40186C.f40196h.c();
        if (c9 != null) {
            try {
                return c9.getString(i);
            } catch (Resources.NotFoundException unused) {
            }
        }
        return str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3274ge
    public final void B1(String[] strArr, int[] iArr, Y2.a aVar) {
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals("android.permission.POST_NOTIFICATIONS")) {
                C2787Rp c2787Rp = (C2787Rp) Y2.b.D0(aVar);
                Activity activity = c2787Rp.f28047a;
                HashMap hashMap = new HashMap();
                int i4 = iArr[i];
                BinderC5100d binderC5100d = c2787Rp.f28048b;
                if (i4 == 0) {
                    hashMap.put("dialog_action", "confirm");
                    Y3();
                    Z3(activity, binderC5100d);
                } else {
                    hashMap.put("dialog_action", "dismiss");
                    if (binderC5100d != null) {
                        binderC5100d.t();
                    }
                }
                a4(this.f29527y, "asnpdc", hashMap);
                return;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(1:3)(1:32)|4|(1:6)(1:31)|7|(2:9|(9:11|12|(2:24|25)|14|15|16|17|18|19))|30|(0)|14|15|16|17|18|19) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ea, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00eb, code lost:
    
        r9.put("notification_not_shown_reason", r8.getMessage());
        r8 = "offline_notification_failed";
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.InterfaceC3274ge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J0(Y2.a aVar, C5067a c5067a) {
        Bitmap bitmap;
        Context context = (Context) Y2.b.D0(aVar);
        String str = c5067a.f41014n;
        C2770Qp c2770Qp = (C2770Qp) this.f29522n.get(this.f29527y);
        String str2 = c2770Qp == null ? "" : c2770Qp.f27859a;
        C4906k.f40186C.f40194f.v(context);
        String str3 = c5067a.f41015u;
        PendingIntent W3 = W3(context, "offline_notification_clicked", str3, str);
        PendingIntent W32 = W3(context, "offline_notification_dismissed", str3, str);
        D.u uVar = new D.u(context, "offline_notification_channel");
        if (TextUtils.isEmpty(str2)) {
            uVar.f393e = D.u.b(b4(C5248R.string.offline_notification_title, "You are back online! Let's pick up where we left off"));
        } else {
            uVar.f393e = D.u.b(String.format(b4(C5248R.string.offline_notification_title_with_advertiser, "You are back online! Continue learning about %s"), str2));
        }
        uVar.d(16, true);
        uVar.f409v.deleteIntent = W32;
        uVar.f395g = W3;
        uVar.f409v.icon = context.getApplicationInfo().icon;
        C3324ha c3324ha = AbstractC3592ma.G9;
        s2.r rVar = s2.r.f40506e;
        uVar.f397j = ((Integer) rVar.f40509c.a(c3324ha)).intValue();
        if (((Boolean) rVar.f40509c.a(AbstractC3592ma.I9)).booleanValue()) {
            String str4 = c5067a.f41016v;
            if (!str4.isEmpty()) {
                try {
                    bitmap = BitmapFactory.decodeStream(new URL(str4).openConnection().getInputStream());
                } catch (IOException unused) {
                }
                if (bitmap != null) {
                    try {
                        uVar.e(bitmap);
                        D.r rVar2 = new D.r();
                        IconCompat iconCompat = new IconCompat(1);
                        iconCompat.f4658b = bitmap;
                        rVar2.f384e = iconCompat;
                        rVar2.f385f = null;
                        rVar2.f386g = true;
                        uVar.g(rVar2);
                    } catch (Resources.NotFoundException unused2) {
                    }
                }
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                HashMap hashMap = new HashMap();
                notificationManager.notify(str3, 54321, uVar.a());
                String str5 = "offline_notification_impression";
                a4(str3, str5, hashMap);
            }
        }
        bitmap = null;
        if (bitmap != null) {
        }
        NotificationManager notificationManager2 = (NotificationManager) context.getSystemService("notification");
        HashMap hashMap2 = new HashMap();
        notificationManager2.notify(str3, 54321, uVar.a());
        String str52 = "offline_notification_impression";
        a4(str3, str52, hashMap2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3359i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                Intent intent = (Intent) AbstractC3411j8.b(parcel, Intent.CREATOR);
                AbstractC3411j8.f(parcel);
                m0(intent);
                break;
            case 2:
                Y2.a t02 = Y2.b.t0(parcel.readStrongBinder());
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                AbstractC3411j8.f(parcel);
                J0(t02, new C5067a(readString, readString2, ""));
                break;
            case 3:
                h();
                break;
            case 4:
                Y2.a t03 = Y2.b.t0(parcel.readStrongBinder());
                AbstractC3411j8.f(parcel);
                f0(t03);
                break;
            case 5:
                String[] createStringArray = parcel.createStringArray();
                int[] createIntArray = parcel.createIntArray();
                Y2.a t04 = Y2.b.t0(parcel.readStrongBinder());
                AbstractC3411j8.f(parcel);
                B1(createStringArray, createIntArray, t04);
                break;
            case 6:
                Y2.a t05 = Y2.b.t0(parcel.readStrongBinder());
                C5067a c5067a = (C5067a) AbstractC3411j8.b(parcel, C5067a.CREATOR);
                AbstractC3411j8.f(parcel);
                J0(t05, c5067a);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    public final void U3(String str, C4089vm c4089vm) {
        InterfaceC3862rb interfaceC3862rb;
        String f2 = c4089vm.f();
        String a9 = c4089vm.a();
        String str2 = "";
        if (TextUtils.isEmpty(f2)) {
            f2 = a9 != null ? a9 : "";
        }
        InterfaceC3862rb b9 = c4089vm.b();
        if (b9 != null) {
            try {
                str2 = b9.f().toString();
            } catch (RemoteException unused) {
            }
        }
        synchronized (c4089vm) {
            interfaceC3862rb = c4089vm.f35502s;
        }
        Drawable drawable = null;
        if (interfaceC3862rb != null) {
            try {
                Y2.a c9 = interfaceC3862rb.c();
                if (c9 != null) {
                    drawable = (Drawable) Y2.b.D0(c9);
                }
            } catch (RemoteException unused2) {
            }
        }
        this.f29522n.put(str, new C2770Qp(f2, str2, drawable));
    }

    public final void X3(Activity activity, BinderC5100d binderC5100d) {
        w2.D d9 = C4906k.f40186C.f40191c;
        if (D.H.a(new D.M(activity).f358b)) {
            Y3();
            Z3(activity, binderC5100d);
            return;
        }
        int i = Build.VERSION.SDK_INT;
        C3793qC c3793qC = C3793qC.f33993z;
        if (i >= 33) {
            activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 12345);
            a4(this.f29527y, "asnpdi", c3793qC);
        } else {
            AlertDialog.Builder k9 = w2.D.k(activity);
            k9.setTitle(b4(C5248R.string.notifications_permission_title, "Allow app to send you notifications?")).setPositiveButton(b4(C5248R.string.notifications_permission_confirm, "Allow"), new DialogInterfaceOnClickListenerC2887Xp(this, activity, binderC5100d, 0)).setNegativeButton(b4(C5248R.string.notifications_permission_decline, "Don't allow"), new DialogInterfaceOnClickListenerC2855Vp(this, binderC5100d, 1)).setOnCancelListener(new DialogInterfaceOnCancelListenerC2871Wp(this, binderC5100d, 1));
            k9.create().show();
            a4(this.f29527y, "rtsdi", c3793qC);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Y3() {
        boolean z6;
        boolean z9;
        try {
            w2.D d9 = C4906k.f40186C.f40191c;
            Context context = this.f29523u;
            w2.t b9 = w2.D.b(context);
            Y2.b bVar = new Y2.b(context);
            String str = this.f29528z;
            String str2 = this.f29527y;
            C2770Qp c2770Qp = (C2770Qp) this.f29522n.get(str2);
            z6 = b9.zzg(bVar, new C5067a(str, str2, c2770Qp == null ? "" : c2770Qp.f27860b));
            if (z6) {
                z9 = true;
            } else {
                try {
                    z9 = b9.zze(new Y2.b(context), this.f29528z, this.f29527y);
                } catch (RemoteException e9) {
                    e = e9;
                    int i = w2.z.f41712b;
                    x2.i.d("Failed to schedule offline notification poster.", e);
                    z9 = z6;
                    if (z9) {
                    }
                }
            }
        } catch (RemoteException e10) {
            e = e10;
            z6 = false;
        }
        if (z9) {
            this.f29526x.i(this.f29527y);
            a4(this.f29527y, "offline_notification_worker_not_scheduled", C3793qC.f33993z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0037 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z3(Activity activity, BinderC5100d binderC5100d) {
        XmlResourceParser layout;
        AlertDialog create;
        C4906k c4906k = C4906k.f40186C;
        w2.D d9 = c4906k.f40191c;
        AlertDialog.Builder onCancelListener = w2.D.k(activity).setOnCancelListener(new DialogInterfaceOnCancelListenerC3815qh(2, binderC5100d));
        Resources c9 = c4906k.f40196h.c();
        if (c9 != null) {
            try {
                layout = c9.getLayout(C5248R.layout.offline_ads_dialog);
            } catch (Resources.NotFoundException unused) {
            }
            if (layout != null) {
                onCancelListener.setMessage(b4(C5248R.string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you're back online."));
                create = onCancelListener.create();
            } else {
                try {
                    View inflate = activity.getLayoutInflater().inflate(layout, (ViewGroup) null);
                    onCancelListener.setView(inflate);
                    HashMap hashMap = this.f29522n;
                    C2770Qp c2770Qp = (C2770Qp) hashMap.get(this.f29527y);
                    String str = c2770Qp == null ? "" : c2770Qp.f27859a;
                    if (!TextUtils.isEmpty(str)) {
                        TextView textView = (TextView) inflate.findViewById(C5248R.id.offline_dialog_advertiser_name);
                        textView.setVisibility(0);
                        textView.setText(str);
                    }
                    C2770Qp c2770Qp2 = (C2770Qp) hashMap.get(this.f29527y);
                    Drawable drawable = c2770Qp2 != null ? c2770Qp2.f27861c : null;
                    if (drawable != null) {
                        ((ImageView) inflate.findViewById(C5248R.id.offline_dialog_image)).setImageDrawable(drawable);
                    }
                    create = onCancelListener.create();
                    create.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                } catch (Resources.NotFoundException unused2) {
                    onCancelListener.setMessage(b4(C5248R.string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you're back online."));
                    create = onCancelListener.create();
                }
            }
            create.show();
            Timer timer = new Timer();
            timer.schedule(new C2838Up(this, create, timer, binderC5100d), com.anythink.expressad.video.module.a.a.m.ai);
        }
        layout = null;
        if (layout != null) {
        }
        create.show();
        Timer timer2 = new Timer();
        timer2.schedule(new C2838Up(this, create, timer2, binderC5100d), com.anythink.expressad.video.module.a.a.m.ai);
    }

    public final void a4(String str, String str2, Map map) {
        V3(this.f29523u, this.f29524v, this.f29526x, str, str2, map);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3274ge
    public final void f0(Y2.a aVar) {
        C2787Rp c2787Rp = (C2787Rp) Y2.b.D0(aVar);
        Activity activity = c2787Rp.f28047a;
        this.f29527y = c2787Rp.f28049c;
        this.f29528z = c2787Rp.f28050d;
        boolean booleanValue = ((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.F9)).booleanValue();
        BinderC5100d binderC5100d = c2787Rp.f28048b;
        if (booleanValue) {
            X3(activity, binderC5100d);
            return;
        }
        a4(this.f29527y, "dialog_impression", C3793qC.f33993z);
        w2.D d9 = C4906k.f40186C.f40191c;
        AlertDialog.Builder k9 = w2.D.k(activity);
        k9.setTitle(b4(C5248R.string.offline_opt_in_title, "Open ad when you're back online.")).setMessage(b4(C5248R.string.offline_opt_in_message, "We'll send you a notification with a link to the advertiser site.")).setPositiveButton(b4(C5248R.string.offline_opt_in_confirm, "OK"), new DialogInterfaceOnClickListenerC2887Xp(this, activity, binderC5100d, 1)).setNegativeButton(b4(C5248R.string.offline_opt_in_decline, "No thanks"), new DialogInterfaceOnClickListenerC2855Vp(this, binderC5100d, 0)).setOnCancelListener(new DialogInterfaceOnCancelListenerC2871Wp(this, binderC5100d, 0));
        k9.create().show();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3274ge
    public final void h() {
        this.f29526x.a(new Qx(29, this.f29525w));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3274ge
    public final void m0(Intent intent) {
        C2821Tp c2821Tp = this.f29526x;
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra != null) {
            if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
                String stringExtra2 = intent.getStringExtra("gws_query_id");
                String stringExtra3 = intent.getStringExtra("uri");
                C3061cg c3061cg = C4906k.f40186C.f40196h;
                Context context = this.f29523u;
                boolean i = c3061cg.i(context);
                HashMap hashMap = new HashMap();
                if (stringExtra.equals("offline_notification_clicked")) {
                    hashMap.put("offline_notification_action", "offline_notification_clicked");
                    r10 = true == i ? (char) 1 : (char) 2;
                    hashMap.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                    hashMap.put("olaih", String.valueOf(stringExtra3.startsWith("http")));
                    try {
                        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                        if (launchIntentForPackage == null) {
                            launchIntentForPackage = new Intent("android.intent.action.VIEW");
                            launchIntentForPackage.setData(Uri.parse(stringExtra3));
                        }
                        launchIntentForPackage.addFlags(268435456);
                        context.startActivity(launchIntentForPackage);
                        hashMap.put("olaa", "olas");
                    } catch (ActivityNotFoundException unused) {
                        hashMap.put("olaa", "olaf");
                    }
                } else {
                    hashMap.put("offline_notification_action", "offline_notification_dismissed");
                }
                a4(stringExtra2, "offline_notification_action", hashMap);
                try {
                    SQLiteDatabase writableDatabase = c2821Tp.getWritableDatabase();
                    if (r10 == 1) {
                        c2821Tp.f28594u.execute(new RunnableC3888s0(7, writableDatabase, stringExtra2, this.f29525w));
                    } else {
                        writableDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{stringExtra2, Integer.toString(0)});
                    }
                } catch (SQLiteException e9) {
                    String concat = "Failed to get writable offline buffering database: ".concat(e9.toString());
                    int i4 = w2.z.f41712b;
                    x2.i.c(concat);
                }
            }
        }
    }
}
