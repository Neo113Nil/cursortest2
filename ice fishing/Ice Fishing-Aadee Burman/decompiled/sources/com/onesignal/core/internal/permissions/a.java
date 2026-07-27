package com.onesignal.core.internal.permissions;

import android.content.DialogInterface;
import com.onesignal.notifications.internal.registration.impl.a;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements DialogInterface.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f36951n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f36952u;

    public /* synthetic */ a(int i, Object obj) {
        this.f36951n = i;
        this.f36952u = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f36951n) {
            case 0:
                e.show$lambda$0((d) this.f36952u, dialogInterface, i);
                break;
            case 1:
                e.show$lambda$1((d) this.f36952u, dialogInterface, i);
                break;
            default:
                a.b.invokeSuspend$lambda$1((com.onesignal.notifications.internal.registration.impl.a) this.f36952u, dialogInterface, i);
                break;
        }
    }
}
