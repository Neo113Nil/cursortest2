package com.google.android.gms.internal.ads;

import D.C0299s;
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
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.icefishing.icefishinglive2.C5275R;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import p2.C4835j;
import s2.C4971a;
import t2.BinderC5036d;

/* renamed from: com.google.android.gms.internal.ads.Yp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC2880Yp extends AbstractBinderC3336i8 implements InterfaceC3251ge {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f28742A = 0;

    /* renamed from: n, reason: collision with root package name */
    public final HashMap f28743n;

    /* renamed from: u, reason: collision with root package name */
    public final Context f28744u;

    /* renamed from: v, reason: collision with root package name */
    public final C3153eo f28745v;

    /* renamed from: w, reason: collision with root package name */
    public final v2.l f28746w;

    /* renamed from: x, reason: collision with root package name */
    public final C2800Tp f28747x;

    /* renamed from: y, reason: collision with root package name */
    public String f28748y;

    /* renamed from: z, reason: collision with root package name */
    public String f28749z;

    public BinderC2880Yp(Context context, C2800Tp c2800Tp, v2.l lVar, C3153eo c3153eo) {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        this.f28743n = new HashMap();
        this.f28744u = context;
        this.f28745v = c3153eo;
        this.f28746w = lVar;
        this.f28747x = c2800Tp;
    }

    public static void V3(Context context, C3153eo c3153eo, C2800Tp c2800Tp, String str, String str2, Map map) {
        String str3;
        C4835j c4835j = C4835j.f39730C;
        String str4 = true != c4835j.f39740h.i(context) ? "offline" : "online";
        if (c3153eo != null) {
            S0.e a9 = c3153eo.a();
            a9.v("gqi", str);
            a9.v(NativeAdvancedJsUtils.f17906p, str2);
            a9.v("device_connectivity", str4);
            c4835j.f39742k.getClass();
            a9.v("event_timestamp", String.valueOf(System.currentTimeMillis()));
            for (Map.Entry entry : map.entrySet()) {
                a9.v((String) entry.getKey(), (String) entry.getValue());
            }
            str3 = ((C3153eo) a9.f2782v).f29975a.f30945f.a((ConcurrentHashMap) a9.f2781u);
        } else {
            str3 = "";
        }
        String str5 = str3;
        C4835j.f39730C.f39742k.getClass();
        C3709p5 c3709p5 = new C3709p5(str, str5, 2, System.currentTimeMillis());
        c2800Tp.getClass();
        c2800Tp.a(new S0.l(14, c2800Tp, c3709p5));
    }

    public static final PendingIntent W3(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str3);
        if (Build.VERSION.SDK_INT < 29 || !str.equals("offline_notification_clicked")) {
            intent.setClassName(context, "com.google.android.gms.ads.AdService");
            return PendingIntent.getService(context, 0, AbstractC4037vA.a(1140850688, intent), 1140850688);
        }
        intent.setClassName(context, "com.google.android.gms.ads.NotificationHandlerActivity");
        return PendingIntent.getActivity(context, 0, AbstractC4037vA.a(201326592, intent), 201326592);
    }

    public static String b4(int i, String str) {
        Resources c9 = C4835j.f39730C.f39740h.c();
        if (c9 != null) {
            try {
                return c9.getString(i);
            } catch (Resources.NotFoundException unused) {
            }
        }
        return str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3251ge
    public final void I2(String[] strArr, int[] iArr, W2.a aVar) {
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals("android.permission.POST_NOTIFICATIONS")) {
                C2767Rp c2767Rp = (C2767Rp) W2.b.F0(aVar);
                Activity activity = c2767Rp.f27333a;
                HashMap hashMap = new HashMap();
                int i6 = iArr[i];
                BinderC5036d binderC5036d = c2767Rp.f27334b;
                if (i6 == 0) {
                    hashMap.put("dialog_action", "confirm");
                    Y3();
                    Z3(activity, binderC5036d);
                } else {
                    hashMap.put("dialog_action", "dismiss");
                    if (binderC5036d != null) {
                        binderC5036d.t();
                    }
                }
                a4(this.f28748y, "asnpdc", hashMap);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3336i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                Intent intent = (Intent) AbstractC3388j8.b(parcel, Intent.CREATOR);
                AbstractC3388j8.f(parcel);
                m0(intent);
                break;
            case 2:
                W2.a w02 = W2.b.w0(parcel.readStrongBinder());
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                AbstractC3388j8.f(parcel);
                W1(w02, new C4971a(readString, readString2, ""));
                break;
            case 3:
                h();
                break;
            case 4:
                W2.a w03 = W2.b.w0(parcel.readStrongBinder());
                AbstractC3388j8.f(parcel);
                Y(w03);
                break;
            case 5:
                String[] createStringArray = parcel.createStringArray();
                int[] createIntArray = parcel.createIntArray();
                W2.a w04 = W2.b.w0(parcel.readStrongBinder());
                AbstractC3388j8.f(parcel);
                I2(createStringArray, createIntArray, w04);
                break;
            case 6:
                W2.a w05 = W2.b.w0(parcel.readStrongBinder());
                C4971a c4971a = (C4971a) AbstractC3388j8.b(parcel, C4971a.CREATOR);
                AbstractC3388j8.f(parcel);
                W1(w05, c4971a);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    public final void U3(String str, C4012um c4012um) {
        InterfaceC3839rb interfaceC3839rb;
        String f3 = c4012um.f();
        String a9 = c4012um.a();
        String str2 = "";
        if (TextUtils.isEmpty(f3)) {
            f3 = a9 != null ? a9 : "";
        }
        InterfaceC3839rb b9 = c4012um.b();
        if (b9 != null) {
            try {
                str2 = b9.f().toString();
            } catch (RemoteException unused) {
            }
        }
        synchronized (c4012um) {
            interfaceC3839rb = c4012um.f34581s;
        }
        Drawable drawable = null;
        if (interfaceC3839rb != null) {
            try {
                W2.a c9 = interfaceC3839rb.c();
                if (c9 != null) {
                    drawable = (Drawable) W2.b.F0(c9);
                }
            } catch (RemoteException unused2) {
            }
        }
        this.f28743n.put(str, new C2750Qp(f3, str2, drawable));
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
    @Override // com.google.android.gms.internal.ads.InterfaceC3251ge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W1(W2.a aVar, C4971a c4971a) {
        Bitmap bitmap;
        Context context = (Context) W2.b.F0(aVar);
        String str = c4971a.f40457n;
        C2750Qp c2750Qp = (C2750Qp) this.f28743n.get(this.f28748y);
        String str2 = c2750Qp == null ? "" : c2750Qp.f27103a;
        C4835j.f39730C.f39738f.s(context);
        String str3 = c4971a.f40458u;
        PendingIntent W32 = W3(context, "offline_notification_clicked", str3, str);
        PendingIntent W33 = W3(context, "offline_notification_dismissed", str3, str);
        D.v vVar = new D.v(context, "offline_notification_channel");
        if (TextUtils.isEmpty(str2)) {
            vVar.f498e = D.v.b(b4(C5275R.string.offline_notification_title, "You are back online! Let's pick up where we left off"));
        } else {
            vVar.f498e = D.v.b(String.format(b4(C5275R.string.offline_notification_title_with_advertiser, "You are back online! Continue learning about %s"), str2));
        }
        vVar.d(16, true);
        vVar.f514v.deleteIntent = W33;
        vVar.f500g = W32;
        vVar.f514v.icon = context.getApplicationInfo().icon;
        C3301ha c3301ha = AbstractC3569ma.G9;
        q2.r rVar = q2.r.f40204e;
        vVar.f502j = ((Integer) rVar.f40207c.a(c3301ha)).intValue();
        if (((Boolean) rVar.f40207c.a(AbstractC3569ma.I9)).booleanValue()) {
            String str4 = c4971a.f40459v;
            if (!str4.isEmpty()) {
                try {
                    bitmap = BitmapFactory.decodeStream(new URL(str4).openConnection().getInputStream());
                } catch (IOException unused) {
                }
                if (bitmap != null) {
                    try {
                        vVar.e(bitmap);
                        C0299s c0299s = new C0299s();
                        IconCompat iconCompat = new IconCompat(1);
                        iconCompat.f4690b = bitmap;
                        c0299s.f489e = iconCompat;
                        c0299s.f490f = null;
                        c0299s.f491g = true;
                        vVar.g(c0299s);
                    } catch (Resources.NotFoundException unused2) {
                    }
                }
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                HashMap hashMap = new HashMap();
                notificationManager.notify(str3, 54321, vVar.a());
                String str5 = "offline_notification_impression";
                a4(str3, str5, hashMap);
            }
        }
        bitmap = null;
        if (bitmap != null) {
        }
        NotificationManager notificationManager2 = (NotificationManager) context.getSystemService("notification");
        HashMap hashMap2 = new HashMap();
        notificationManager2.notify(str3, 54321, vVar.a());
        String str52 = "offline_notification_impression";
        a4(str3, str52, hashMap2);
    }

    public final void X3(Activity activity, BinderC5036d binderC5036d) {
        u2.D d2 = C4835j.f39730C.f39735c;
        if (D.I.a(new D.N(activity).f461b)) {
            Y3();
            Z3(activity, binderC5036d);
            return;
        }
        int i = Build.VERSION.SDK_INT;
        C3770qC c3770qC = C3770qC.f33209z;
        if (i >= 33) {
            activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 12345);
            a4(this.f28748y, "asnpdi", c3770qC);
        } else {
            AlertDialog.Builder k9 = u2.D.k(activity);
            k9.setTitle(b4(C5275R.string.notifications_permission_title, "Allow app to send you notifications?")).setPositiveButton(b4(C5275R.string.notifications_permission_confirm, "Allow"), new DialogInterfaceOnClickListenerC2864Xp(this, activity, binderC5036d, 0)).setNegativeButton(b4(C5275R.string.notifications_permission_decline, "Don't allow"), new DialogInterfaceOnClickListenerC2832Vp(this, binderC5036d, 1)).setOnCancelListener(new DialogInterfaceOnCancelListenerC2848Wp(this, binderC5036d, 1));
            k9.create().show();
            a4(this.f28748y, "rtsdi", c3770qC);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3251ge
    public final void Y(W2.a aVar) {
        C2767Rp c2767Rp = (C2767Rp) W2.b.F0(aVar);
        Activity activity = c2767Rp.f27333a;
        this.f28748y = c2767Rp.f27335c;
        this.f28749z = c2767Rp.f27336d;
        boolean booleanValue = ((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.F9)).booleanValue();
        BinderC5036d binderC5036d = c2767Rp.f27334b;
        if (booleanValue) {
            X3(activity, binderC5036d);
            return;
        }
        a4(this.f28748y, "dialog_impression", C3770qC.f33209z);
        u2.D d2 = C4835j.f39730C.f39735c;
        AlertDialog.Builder k9 = u2.D.k(activity);
        k9.setTitle(b4(C5275R.string.offline_opt_in_title, "Open ad when you're back online.")).setMessage(b4(C5275R.string.offline_opt_in_message, "We'll send you a notification with a link to the advertiser site.")).setPositiveButton(b4(C5275R.string.offline_opt_in_confirm, "OK"), new DialogInterfaceOnClickListenerC2864Xp(this, activity, binderC5036d, 1)).setNegativeButton(b4(C5275R.string.offline_opt_in_decline, "No thanks"), new DialogInterfaceOnClickListenerC2832Vp(this, binderC5036d, 0)).setOnCancelListener(new DialogInterfaceOnCancelListenerC2848Wp(this, binderC5036d, 0));
        k9.create().show();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Y3() {
        boolean z3;
        boolean z6;
        try {
            u2.D d2 = C4835j.f39730C.f39735c;
            Context context = this.f28744u;
            u2.t b9 = u2.D.b(context);
            W2.b bVar = new W2.b(context);
            String str = this.f28749z;
            String str2 = this.f28748y;
            C2750Qp c2750Qp = (C2750Qp) this.f28743n.get(str2);
            z3 = b9.zzg(bVar, new C4971a(str, str2, c2750Qp == null ? "" : c2750Qp.f27104b));
            if (z3) {
                z6 = true;
            } else {
                try {
                    z6 = b9.zze(new W2.b(context), this.f28749z, this.f28748y);
                } catch (RemoteException e9) {
                    e = e9;
                    int i = u2.z.f41319b;
                    v2.i.d("Failed to schedule offline notification poster.", e);
                    z6 = z3;
                    if (z6) {
                    }
                }
            }
        } catch (RemoteException e10) {
            e = e10;
            z3 = false;
        }
        if (z6) {
            this.f28747x.i(this.f28748y);
            a4(this.f28748y, "offline_notification_worker_not_scheduled", C3770qC.f33209z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0037 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z3(Activity activity, BinderC5036d binderC5036d) {
        XmlResourceParser layout;
        AlertDialog create;
        C4835j c4835j = C4835j.f39730C;
        u2.D d2 = c4835j.f39735c;
        AlertDialog.Builder onCancelListener = u2.D.k(activity).setOnCancelListener(new DialogInterfaceOnCancelListenerC3792qh(2, binderC5036d));
        Resources c9 = c4835j.f39740h.c();
        if (c9 != null) {
            try {
                layout = c9.getLayout(C5275R.layout.offline_ads_dialog);
            } catch (Resources.NotFoundException unused) {
            }
            if (layout != null) {
                onCancelListener.setMessage(b4(C5275R.string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you're back online."));
                create = onCancelListener.create();
            } else {
                try {
                    View inflate = activity.getLayoutInflater().inflate(layout, (ViewGroup) null);
                    onCancelListener.setView(inflate);
                    HashMap hashMap = this.f28743n;
                    C2750Qp c2750Qp = (C2750Qp) hashMap.get(this.f28748y);
                    String str = c2750Qp == null ? "" : c2750Qp.f27103a;
                    if (!TextUtils.isEmpty(str)) {
                        TextView textView = (TextView) inflate.findViewById(C5275R.id.offline_dialog_advertiser_name);
                        textView.setVisibility(0);
                        textView.setText(str);
                    }
                    C2750Qp c2750Qp2 = (C2750Qp) hashMap.get(this.f28748y);
                    Drawable drawable = c2750Qp2 != null ? c2750Qp2.f27105c : null;
                    if (drawable != null) {
                        ((ImageView) inflate.findViewById(C5275R.id.offline_dialog_image)).setImageDrawable(drawable);
                    }
                    create = onCancelListener.create();
                    create.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                } catch (Resources.NotFoundException unused2) {
                    onCancelListener.setMessage(b4(C5275R.string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you're back online."));
                    create = onCancelListener.create();
                }
            }
            create.show();
            Timer timer = new Timer();
            timer.schedule(new C2816Up(this, create, timer, binderC5036d), com.anythink.expressad.video.module.a.a.m.ai);
        }
        layout = null;
        if (layout != null) {
        }
        create.show();
        Timer timer2 = new Timer();
        timer2.schedule(new C2816Up(this, create, timer2, binderC5036d), com.anythink.expressad.video.module.a.a.m.ai);
    }

    public final void a4(String str, String str2, Map map) {
        V3(this.f28744u, this.f28745v, this.f28747x, str, str2, map);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3251ge
    public final void h() {
        this.f28747x.a(new Qx(29, this.f28746w));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3251ge
    public final void m0(Intent intent) {
        C2800Tp c2800Tp = this.f28747x;
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra != null) {
            if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
                String stringExtra2 = intent.getStringExtra("gws_query_id");
                String stringExtra3 = intent.getStringExtra("uri");
                C3038cg c3038cg = C4835j.f39730C.f39740h;
                Context context = this.f28744u;
                boolean i = c3038cg.i(context);
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
                    SQLiteDatabase writableDatabase = c2800Tp.getWritableDatabase();
                    if (r10 == 1) {
                        c2800Tp.f27797u.execute(new RunnableC3865s0(7, writableDatabase, stringExtra2, this.f28746w));
                    } else {
                        writableDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{stringExtra2, Integer.toString(0)});
                    }
                } catch (SQLiteException e9) {
                    String concat = "Failed to get writable offline buffering database: ".concat(e9.toString());
                    int i6 = u2.z.f41319b;
                    v2.i.c(concat);
                }
            }
        }
    }
}
