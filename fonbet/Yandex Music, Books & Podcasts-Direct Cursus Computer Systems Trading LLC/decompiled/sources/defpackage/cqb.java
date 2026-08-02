package defpackage;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.SurfaceView;
import android.view.View;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.PlayerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class cqb extends af9 {
    public static final Object d = new Object();
    public static boolean e;
    public static AttributeSet f;
    public PlayerView a;
    public se9 b;
    public boolean c;

    public cqb(@NotNull Context context) {
        super(context, null, 0, 6, null);
        PlayerView playerView = new PlayerView(context, getAttributeSet());
        playerView.setUseController(false);
        playerView.setShutterBackgroundColor(0);
        View videoSurfaceView = playerView.getVideoSurfaceView();
        SurfaceView surfaceView = videoSurfaceView instanceof SurfaceView ? (SurfaceView) videoSurfaceView : null;
        if (surfaceView != null) {
            surfaceView.setZOrderOnTop(false);
            surfaceView.setBackgroundColor(0);
            surfaceView.getHolder().setFormat(-2);
        }
        addView(playerView);
        this.a = playerView;
    }

    private final AttributeSet getAttributeSet() {
        AttributeSet attributeSet;
        AttributeSet attributeSet2 = null;
        if (e) {
            this.c = true;
            return null;
        }
        AttributeSet attributeSet3 = f;
        if (attributeSet3 == null) {
            synchronized (d) {
                attributeSet = f;
            }
            attributeSet3 = attributeSet;
        }
        if (attributeSet3 != null) {
            return attributeSet3;
        }
        synchronized (d) {
            try {
                XmlResourceParser layout = getResources().getLayout(R.layout.zoom_player_view);
                while (true) {
                    int next = layout.next();
                    if (Intrinsics.d(layout.getName(), "androidx.media3.ui.PlayerView")) {
                        attributeSet2 = Xml.asAttributeSet(layout);
                        break;
                    }
                    if (next == 1) {
                        break;
                    }
                }
                if (attributeSet2 == null) {
                    int i = i9f.a;
                    this.c = true;
                }
                f = attributeSet2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return attributeSet2;
    }

    @Override // defpackage.af9
    public final void a(se9 se9Var) {
        b();
        aqb aqbVar = (aqb) se9Var;
        this.a.setPlayer(aqbVar.i());
        this.b = se9Var;
        aqbVar.j = getHeight() * getWidth();
        aqbVar.c();
    }

    @Override // defpackage.af9
    public final void b() {
        i8l player = this.a.getPlayer();
        if (player != null) {
            player.a();
        }
        this.a.setPlayer(null);
        this.b = null;
    }

    @Override // defpackage.af9
    public se9 getAttachedPlayer() {
        return this.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        ExoPlayer i;
        if (!this.c && !isHardwareAccelerated()) {
            e = true;
            this.c = true;
            int i2 = i9f.a;
            se9 attachedPlayer = getAttachedPlayer();
            aqb aqbVar = attachedPlayer instanceof aqb ? (aqb) attachedPlayer : null;
            if (aqbVar == null || (i = aqbVar.i()) == null) {
                return;
            }
            this.a.setPlayer(null);
            removeView(this.a);
            PlayerView playerView = new PlayerView(getContext());
            playerView.setUseController(false);
            playerView.setShutterBackgroundColor(0);
            View videoSurfaceView = playerView.getVideoSurfaceView();
            SurfaceView surfaceView = videoSurfaceView instanceof SurfaceView ? (SurfaceView) videoSurfaceView : null;
            if (surfaceView != null) {
                surfaceView.setZOrderOnTop(false);
                surfaceView.setBackgroundColor(0);
                surfaceView.getHolder().setFormat(-2);
            }
            addView(playerView);
            playerView.setPlayer(i);
            this.a = playerView;
        }
        super.onAttachedToWindow();
    }

    @Override // defpackage.af9
    public void setScale(@NotNull a0a a0aVar) {
        int i;
        if (this.c && a0aVar == a0a.FILL) {
            int i2 = i9f.a;
        }
        PlayerView playerView = this.a;
        int ordinal = a0aVar.ordinal();
        if (ordinal != 0) {
            i = 0;
            if (ordinal != 1 && ordinal != 2) {
                b6e.s();
                return;
            }
        } else {
            i = 4;
        }
        playerView.setResizeMode(i);
    }

    @Override // defpackage.af9
    public /* bridge */ /* synthetic */ void setVisibleOnScreen(boolean z) {
        super.setVisibleOnScreen(z);
    }
}
