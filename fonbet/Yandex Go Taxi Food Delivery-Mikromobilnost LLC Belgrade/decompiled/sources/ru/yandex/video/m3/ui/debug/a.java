package ru.yandex.video.m3.ui.debug;

import ru.yandex.video.m3.ui.debug.ListYandexPlayerManagerDebugView;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ListYandexPlayerManagerDebugView b;
    public final /* synthetic */ ListYandexPlayerManagerDebugView.DebugDataPlayerObserver c;

    public /* synthetic */ a(ListYandexPlayerManagerDebugView listYandexPlayerManagerDebugView, ListYandexPlayerManagerDebugView.DebugDataPlayerObserver debugDataPlayerObserver, int i) {
        this.a = i;
        this.b = listYandexPlayerManagerDebugView;
        this.c = debugDataPlayerObserver;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ListYandexPlayerManagerDebugView.DebugDataPlayerObserver debugDataPlayerObserver = this.c;
        ListYandexPlayerManagerDebugView listYandexPlayerManagerDebugView = this.b;
        switch (i) {
            case 0:
                ListYandexPlayerManagerDebugView.DebugDataPlayerObserver.onReadyForFirstPlayback$lambda$2(listYandexPlayerManagerDebugView, debugDataPlayerObserver);
                break;
            default:
                ListYandexPlayerManagerDebugView.DebugDataPlayerObserver.onPlaybackError$lambda$0(listYandexPlayerManagerDebugView, debugDataPlayerObserver);
                break;
        }
    }
}
