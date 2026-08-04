package com.gamericefishpro.space.ed;

import android.content.DialogInterface;
import com.android.installreferrer.api.InstallReferrerClient;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements DialogInterface.OnClickListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                d.show$lambda$0((c) this.e, dialogInterface, i);
                break;
            case 1:
                d.show$lambda$1((c) this.e, dialogInterface, i);
                break;
            default:
                com.gamericefishpro.space.fg.a.b.invokeSuspend$lambda$1((com.gamericefishpro.space.fg.a) this.e, dialogInterface, i);
                break;
        }
    }
}
