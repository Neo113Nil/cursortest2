package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.service.media.MediaBrowserService;

/* loaded from: classes.dex */
public final class ohh extends mhh {
    public final /* synthetic */ qhh d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ohh(qhh qhhVar, Context context) {
        super(qhhVar, context);
        this.d = qhhVar;
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadChildren(String str, MediaBrowserService.Result result, Bundle bundle) {
        nsh.g(bundle);
        nuh nuhVar = this.d.j;
        jhh jhhVar = nuhVar.c;
        qzc qzcVar = new qzc(12, result);
        nuhVar.f = jhhVar;
        qzcVar.C(null);
        nuhVar.f = null;
        nuhVar.f = null;
    }
}
