package defpackage;

import java.util.Iterator;
import kotlin.collections.a;
import ru.yandex.video.m3.list_player_manager.ListPlayerObserver;
import ru.yandex.video.m3.list_player_manager.ListYandexPlayer;
import ru.yandex.video.m3.player.PlaybackException;

/* loaded from: classes7.dex */
public final class wty implements ListPlayerObserver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wty(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // ru.yandex.video.m3.list_player_manager.ListPlayerObserver
    public final void onLoadingStart() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Iterator it = a.J0(((zty) obj).e).iterator();
                while (it.hasNext()) {
                    ((q4l) it.next()).f();
                }
                break;
            default:
                Iterator it2 = a.J0(((zf21) obj).b).iterator();
                while (it2.hasNext()) {
                    Iterator it3 = a.J0(((ef21) it2.next()).a.c).iterator();
                    while (it3.hasNext()) {
                        ((q4l) it3.next()).f();
                    }
                }
                break;
        }
    }

    @Override // ru.yandex.video.m3.list_player_manager.ListPlayerObserver
    public final void onPausePlayback() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Iterator it = a.J0(((zty) obj).e).iterator();
                while (it.hasNext()) {
                    ((q4l) it.next()).onPause();
                }
                break;
            default:
                Iterator it2 = a.J0(((zf21) obj).b).iterator();
                while (it2.hasNext()) {
                    Iterator it3 = a.J0(((ef21) it2.next()).a.c).iterator();
                    while (it3.hasNext()) {
                        ((q4l) it3.next()).onPause();
                    }
                }
                break;
        }
    }

    @Override // ru.yandex.video.m3.list_player_manager.ListPlayerObserver
    public final void onPlaybackEnded() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Iterator it = a.J0(((zty) obj).e).iterator();
                while (it.hasNext()) {
                    ((q4l) it.next()).e();
                }
                break;
            default:
                Iterator it2 = a.J0(((zf21) obj).b).iterator();
                while (it2.hasNext()) {
                    Iterator it3 = a.J0(((ef21) it2.next()).a.c).iterator();
                    while (it3.hasNext()) {
                        ((q4l) it3.next()).e();
                    }
                }
                break;
        }
    }

    @Override // ru.yandex.video.m3.list_player_manager.ListPlayerObserver
    public final void onPlaybackError(PlaybackException playbackException) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Iterator it = a.J0(((zty) obj).e).iterator();
                while (it.hasNext()) {
                    ((q4l) it.next()).g();
                }
                break;
            default:
                Iterator it2 = a.J0(((zf21) obj).b).iterator();
                while (it2.hasNext()) {
                    Iterator it3 = a.J0(((ef21) it2.next()).a.c).iterator();
                    while (it3.hasNext()) {
                        ((q4l) it3.next()).g();
                    }
                }
                break;
        }
    }

    @Override // ru.yandex.video.m3.list_player_manager.ListPlayerObserver
    public final void onPlaybackProgress(long j) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Iterator it = a.J0(((zty) obj).e).iterator();
                while (it.hasNext()) {
                    ((q4l) it.next()).d(j);
                }
                break;
            default:
                Iterator it2 = a.J0(((zf21) obj).b).iterator();
                while (it2.hasNext()) {
                    Iterator it3 = a.J0(((ef21) it2.next()).a.c).iterator();
                    while (it3.hasNext()) {
                        ((q4l) it3.next()).d(j);
                    }
                }
                break;
        }
    }

    @Override // ru.yandex.video.m3.list_player_manager.ListPlayerObserver
    public final void onReadyForFirstPlayback() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ListYandexPlayer listYandexPlayer = ((zty) obj).a;
                listYandexPlayer.setMuted(listYandexPlayer.isMuted());
                break;
            default:
                Iterator it = a.J0(((zf21) obj).b).iterator();
                while (it.hasNext()) {
                    Iterator it2 = a.J0(((ef21) it.next()).a.c).iterator();
                    while (it2.hasNext()) {
                        ((q4l) it2.next()).b();
                    }
                }
                break;
        }
    }

    @Override // ru.yandex.video.m3.list_player_manager.ListPlayerObserver
    public final void onResumePlayback() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Iterator it = a.J0(((zty) obj).e).iterator();
                while (it.hasNext()) {
                    ((q4l) it.next()).c();
                }
                break;
            default:
                Iterator it2 = a.J0(((zf21) obj).b).iterator();
                while (it2.hasNext()) {
                    Iterator it3 = a.J0(((ef21) it2.next()).a.c).iterator();
                    while (it3.hasNext()) {
                        ((q4l) it3.next()).c();
                    }
                }
                break;
        }
    }
}
