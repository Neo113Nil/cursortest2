package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;
import java.util.HashMap;
import p2.C4835j;
import t2.BinderC5036d;

/* renamed from: com.google.android.gms.internal.ads.Xp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC2864Xp implements DialogInterface.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f28577n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f28578u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f28579v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f28580w;

    public /* synthetic */ DialogInterfaceOnClickListenerC2864Xp(BinderC2880Yp binderC2880Yp, Activity activity, BinderC5036d binderC5036d, int i) {
        this.f28577n = i;
        this.f28578u = binderC2880Yp;
        this.f28579v = activity;
        this.f28580w = binderC5036d;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f28577n) {
            case 0:
                BinderC2880Yp binderC2880Yp = (BinderC2880Yp) this.f28578u;
                binderC2880Yp.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("dialog_action", "confirm");
                binderC2880Yp.a4(binderC2880Yp.f28748y, "rtsdc", hashMap);
                a4.e eVar = C4835j.f39730C.f39738f;
                Activity activity = (Activity) this.f28579v;
                activity.startActivity(eVar.u(activity));
                binderC2880Yp.Y3();
                BinderC5036d binderC5036d = (BinderC5036d) this.f28580w;
                if (binderC5036d != null) {
                    binderC5036d.t();
                    break;
                }
                break;
            case 1:
                BinderC2880Yp binderC2880Yp2 = (BinderC2880Yp) this.f28578u;
                binderC2880Yp2.getClass();
                HashMap hashMap2 = new HashMap();
                hashMap2.put("dialog_action", "confirm");
                binderC2880Yp2.a4(binderC2880Yp2.f28748y, "dialog_click", hashMap2);
                binderC2880Yp2.X3((Activity) this.f28579v, (BinderC5036d) this.f28580w);
                break;
            default:
                C2983be c2983be = (C2983be) this.f28580w;
                DownloadManager downloadManager = (DownloadManager) c2983be.f29298w.getSystemService("download");
                try {
                    String str = (String) this.f28578u;
                    String str2 = (String) this.f28579v;
                    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
                    request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
                    u2.D d2 = C4835j.f39730C.f39735c;
                    request.allowScanningByMediaScanner();
                    request.setNotificationVisibility(1);
                    downloadManager.enqueue(request);
                    break;
                } catch (IllegalStateException unused) {
                    c2983be.y("Could not store picture.");
                }
        }
    }

    public DialogInterfaceOnClickListenerC2864Xp(C2983be c2983be, String str, String str2) {
        this.f28577n = 2;
        this.f28578u = str;
        this.f28579v = str2;
        this.f28580w = c2983be;
    }
}
