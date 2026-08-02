package com.anythink.basead;

import android.content.Context;
import com.anythink.core.api.IExHandlerBaseAd;
import com.anythink.core.common.d.s;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.w;

/* loaded from: classes.dex */
public class b implements IExHandlerBaseAd {

    /* renamed from: a, reason: collision with root package name */
    private static volatile b f6474a;

    /* renamed from: b, reason: collision with root package name */
    private IExHandlerBaseAd f6475b;

    public static abstract class a implements IExHandlerBaseAd.DataFetchListener {

        /* renamed from: a, reason: collision with root package name */
        private w f6476a;

        public a(w wVar) {
            this.f6476a = wVar;
        }

        @Override // com.anythink.core.api.IExHandlerBaseAd.DataFetchListener
        public w getBaseAdContent() {
            return this.f6476a;
        }
    }

    private b() {
        s c9 = t.b().c();
        if (c9 != null) {
            this.f6475b = c9.getBaseAdHandler();
        }
    }

    public static b a() {
        if (f6474a == null) {
            synchronized (b.class) {
                try {
                    if (f6474a == null) {
                        f6474a = new b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f6474a;
    }

    @Override // com.anythink.core.api.IExHandlerBaseAd
    public void addDataFetchListener(IExHandlerBaseAd.DataFetchListener dataFetchListener) {
        IExHandlerBaseAd iExHandlerBaseAd = this.f6475b;
        if (iExHandlerBaseAd == null || dataFetchListener == null) {
            return;
        }
        iExHandlerBaseAd.addDataFetchListener(dataFetchListener);
    }

    @Override // com.anythink.core.api.IExHandlerBaseAd
    public void onAdxAdDestroy(Context context) {
        IExHandlerBaseAd iExHandlerBaseAd = this.f6475b;
        if (iExHandlerBaseAd != null) {
            iExHandlerBaseAd.onAdxAdDestroy(context);
        }
    }

    @Override // com.anythink.core.api.IExHandlerBaseAd
    public void pause(w wVar) {
        IExHandlerBaseAd iExHandlerBaseAd = this.f6475b;
        if (iExHandlerBaseAd == null || wVar == null) {
            return;
        }
        iExHandlerBaseAd.pause(wVar);
    }

    @Override // com.anythink.core.api.IExHandlerBaseAd
    public void removeDataFetchListener(IExHandlerBaseAd.DataFetchListener dataFetchListener) {
        IExHandlerBaseAd iExHandlerBaseAd = this.f6475b;
        if (iExHandlerBaseAd == null || dataFetchListener == null) {
            return;
        }
        iExHandlerBaseAd.removeDataFetchListener(dataFetchListener);
    }

    @Override // com.anythink.core.api.IExHandlerBaseAd
    public void updateOfferInfoWithDataInfo(w wVar) {
        IExHandlerBaseAd iExHandlerBaseAd = this.f6475b;
        if (iExHandlerBaseAd == null || wVar == null) {
            return;
        }
        iExHandlerBaseAd.updateOfferInfoWithDataInfo(wVar);
    }
}
