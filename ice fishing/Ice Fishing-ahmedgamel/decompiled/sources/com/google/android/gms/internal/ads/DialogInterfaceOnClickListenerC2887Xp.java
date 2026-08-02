package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;
import java.util.HashMap;
import r2.C4906k;
import v2.BinderC5100d;

/* renamed from: com.google.android.gms.internal.ads.Xp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC2887Xp implements DialogInterface.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f29358n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f29359u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f29360v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f29361w;

    public /* synthetic */ DialogInterfaceOnClickListenerC2887Xp(BinderC2903Yp binderC2903Yp, Activity activity, BinderC5100d binderC5100d, int i) {
        this.f29358n = i;
        this.f29359u = binderC2903Yp;
        this.f29360v = activity;
        this.f29361w = binderC5100d;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f29358n) {
            case 0:
                BinderC2903Yp binderC2903Yp = (BinderC2903Yp) this.f29359u;
                binderC2903Yp.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("dialog_action", "confirm");
                binderC2903Yp.a4(binderC2903Yp.f29527y, "rtsdc", hashMap);
                O2.i iVar = C4906k.f40186C.f40194f;
                Activity activity = (Activity) this.f29360v;
                activity.startActivity(iVar.x(activity));
                binderC2903Yp.Y3();
                BinderC5100d binderC5100d = (BinderC5100d) this.f29361w;
                if (binderC5100d != null) {
                    binderC5100d.t();
                    break;
                }
                break;
            case 1:
                BinderC2903Yp binderC2903Yp2 = (BinderC2903Yp) this.f29359u;
                binderC2903Yp2.getClass();
                HashMap hashMap2 = new HashMap();
                hashMap2.put("dialog_action", "confirm");
                binderC2903Yp2.a4(binderC2903Yp2.f29527y, "dialog_click", hashMap2);
                binderC2903Yp2.X3((Activity) this.f29360v, (BinderC5100d) this.f29361w);
                break;
            default:
                C3006be c3006be = (C3006be) this.f29361w;
                DownloadManager downloadManager = (DownloadManager) c3006be.f30087w.getSystemService("download");
                try {
                    String str = (String) this.f29359u;
                    String str2 = (String) this.f29360v;
                    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
                    request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
                    w2.D d9 = C4906k.f40186C.f40191c;
                    request.allowScanningByMediaScanner();
                    request.setNotificationVisibility(1);
                    downloadManager.enqueue(request);
                    break;
                } catch (IllegalStateException unused) {
                    c3006be.x("Could not store picture.");
                }
        }
    }

    public DialogInterfaceOnClickListenerC2887Xp(C3006be c3006be, String str, String str2) {
        this.f29358n = 2;
        this.f29359u = str;
        this.f29360v = str2;
        this.f29361w = c3006be;
    }
}
