package defpackage;

import android.view.TextureView;
import android.view.View;
import androidx.media3.exoplayer.ExoPlayer;

/* loaded from: classes4.dex */
public final class ubu implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ExoPlayer b;
    public final /* synthetic */ bjt c;

    public /* synthetic */ ubu(ExoPlayer exoPlayer, bjt bjtVar, int i) {
        this.a = i;
        this.b = exoPlayer;
        this.c = bjtVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.a;
        view.getClass();
        switch (i) {
            case 0:
                view.removeOnAttachStateChangeListener(this);
                bjt bjtVar = this.c;
                ubu ubuVar = null;
                v3w.k("VideoPlayerView on attach ", bjtVar.hashCode(), 3, null, null);
                b7t b7tVar = (b7t) bjtVar.c;
                TextureView textureView = (TextureView) bjtVar.a;
                ExoPlayer exoPlayer = this.b;
                exoPlayer.getClass();
                b7tVar.getClass();
                exoPlayer.j0(b7tVar);
                exoPlayer.n(textureView);
                if (textureView.isAttachedToWindow()) {
                    ubuVar = new ubu(exoPlayer, bjtVar, 1);
                    textureView.addOnAttachStateChangeListener(ubuVar);
                } else {
                    v3w.k("VideoPlayerView on detach ", bjtVar.hashCode(), 3, null, null);
                    gdg.J(exoPlayer, b7tVar);
                }
                bjtVar.d = ubuVar;
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = this.a;
        view.getClass();
        switch (i) {
            case 0:
                break;
            default:
                view.removeOnAttachStateChangeListener(this);
                bjt bjtVar = this.c;
                v3w.k("VideoPlayerView on detach ", bjtVar.hashCode(), 3, null, null);
                gdg.J(this.b, (b7t) bjtVar.c);
                break;
        }
    }
}
