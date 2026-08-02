package com.anythink.core.common.l.e;

import android.content.Context;
import android.view.View;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATNetworkConfirmInfo;
import com.anythink.core.common.h.c;
import com.anythink.core.common.l.e.a.b;

/* loaded from: classes.dex */
public abstract class a implements b {
    private c adCacheInfo;
    private int clickedArea;

    public a() {
    }

    public int getClickedArea() {
        return this.clickedArea;
    }

    @Override // com.anythink.core.common.l.e.a.b
    public void onAdClicked(View view) {
        ATBaseAdAdapter e9;
        c cVar = this.adCacheInfo;
        if (cVar == null || (e9 = cVar.e()) == null || e9.getTrackingInfo() == null) {
            return;
        }
        e9.getTrackingInfo().P(getClickedArea());
    }

    @Override // com.anythink.core.common.l.e.a.b
    public void onAdDislikeButtonClick() {
    }

    @Override // com.anythink.core.common.l.e.a.b
    public void onAdImpressed() {
    }

    @Override // com.anythink.core.common.l.e.a.b
    public void onAdVideoEnd() {
    }

    @Override // com.anythink.core.common.l.e.a.b
    public void onAdVideoProgress(int i) {
    }

    @Override // com.anythink.core.common.l.e.a.b
    public void onAdVideoStart() {
    }

    @Override // com.anythink.core.common.l.e.a.b
    public void onClose() {
    }

    @Override // com.anythink.core.common.l.e.a.b
    public void onDeeplinkCallback(boolean z6) {
    }

    @Override // com.anythink.core.common.l.e.a.b
    public void onDownloadConfirmCallback(Context context, View view, ATNetworkConfirmInfo aTNetworkConfirmInfo) {
    }

    @Override // com.anythink.core.common.l.e.a.b
    public void onVideoError(String str, String str2) {
    }

    public void setClickedArea(int i) {
        this.clickedArea = i;
    }

    public a(c cVar) {
        this.adCacheInfo = cVar;
    }
}
