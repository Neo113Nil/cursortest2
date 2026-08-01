package com.anythink.expressad.video.signal.a;

import android.content.res.Configuration;
import java.util.Objects;

/* loaded from: classes.dex */
public class d implements com.anythink.expressad.video.signal.e, com.anythink.expressad.video.signal.h {

    /* renamed from: j, reason: collision with root package name */
    protected static final String f21797j = "DefaultJSContainerModule";

    @Override // com.anythink.expressad.video.signal.e
    public void configurationChanged(int i, int i6, int i9) {
    }

    @Override // com.anythink.expressad.video.signal.e
    public boolean endCardShowing() {
        return true;
    }

    @Override // com.anythink.expressad.video.signal.e, com.anythink.expressad.video.signal.h
    public void handlerPlayableException(String str) {
    }

    @Override // com.anythink.expressad.video.signal.e
    public void hideAlertWebview() {
    }

    @Override // com.anythink.expressad.video.signal.h
    public void install(com.anythink.expressad.foundation.d.d dVar) {
        Objects.toString(dVar);
    }

    @Override // com.anythink.expressad.video.signal.e
    public void ivRewardAdsWithoutVideo(String str) {
    }

    @Override // com.anythink.expressad.video.signal.e
    public boolean miniCardLoaded() {
        return false;
    }

    @Override // com.anythink.expressad.video.signal.e
    public boolean miniCardShowing() {
        return false;
    }

    @Override // com.anythink.expressad.video.signal.h
    public void notifyCloseBtn(int i) {
    }

    @Override // com.anythink.expressad.video.signal.h
    public void orientation(Configuration configuration) {
        Objects.toString(configuration);
    }

    @Override // com.anythink.expressad.video.signal.f
    public void preLoadData(com.anythink.expressad.video.signal.factory.b bVar) {
    }

    @Override // com.anythink.expressad.video.signal.e, com.anythink.expressad.video.signal.h
    public void readyStatus(int i) {
    }

    @Override // com.anythink.expressad.video.signal.e
    public void resizeMiniCard(int i, int i6, int i9) {
    }

    @Override // com.anythink.expressad.video.signal.e
    public boolean showAlertWebView() {
        return false;
    }

    @Override // com.anythink.expressad.video.signal.e
    public void showEndcard(int i) {
    }

    @Override // com.anythink.expressad.video.signal.e
    public void showMiniCard(int i, int i6, int i9, int i10, int i11) {
    }

    @Override // com.anythink.expressad.video.signal.e
    public void showPlayableView() {
    }

    @Override // com.anythink.expressad.video.signal.e
    public void showVideoClickView(int i) {
    }

    @Override // com.anythink.expressad.video.signal.e
    public void showVideoEndCover() {
    }

    @Override // com.anythink.expressad.video.signal.h
    public void toggleCloseBtn(int i) {
    }

    @Override // com.anythink.expressad.video.signal.h
    public void webviewshow() {
    }
}
