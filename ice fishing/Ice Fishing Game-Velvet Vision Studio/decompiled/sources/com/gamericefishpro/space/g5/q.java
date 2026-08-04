package com.gamericefishpro.space.g5;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.i9.d5;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Context e;

    public /* synthetic */ q(Context context, int i) {
        this.d = i;
        this.e = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return d5.t(this.e);
            case 1:
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.TEXT", "Check out Ice Fishing - a cool Match 3 game! https://play.google.com/store/apps/details?id=com.gamericefishpro.space");
                this.e.startActivity(Intent.createChooser(intent, "Share Ice Fishing"));
                return Unit.a;
            default:
                Context context = this.e;
                try {
                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.gamericefishpro.space")));
                    break;
                } catch (Exception unused) {
                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.gamericefishpro.space")));
                }
                return Unit.a;
        }
    }
}
