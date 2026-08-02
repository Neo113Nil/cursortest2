package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.service.media.MediaBrowserService;

/* loaded from: classes.dex */
public final class phh extends mhh {
    public final /* synthetic */ rhh d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public phh(rhh rhhVar, Context context) {
        super(rhhVar, context);
        this.d = rhhVar;
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadChildren(String str, MediaBrowserService.Result result, Bundle bundle) {
        osh.C(bundle);
        rhh rhhVar = this.d;
        bih bihVar = rhhVar.h;
        nhh nhhVar = new nhh(rhhVar, str, new oxa(14, result), bundle);
        nhhVar.d = 1;
        bihVar.c(str, nhhVar);
    }
}
