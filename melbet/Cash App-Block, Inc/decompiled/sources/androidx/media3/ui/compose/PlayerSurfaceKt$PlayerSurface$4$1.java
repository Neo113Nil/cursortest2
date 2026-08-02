package androidx.media3.ui.compose;

import android.view.TextureView;
import androidx.media3.common.Player;
import androidx.media3.exoplayer.ExoPlayerImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes3.dex */
public final /* synthetic */ class PlayerSurfaceKt$PlayerSurface$4$1 extends FunctionReferenceImpl implements Function2 {
    public static final PlayerSurfaceKt$PlayerSurface$4$1 INSTANCE = new PlayerSurfaceKt$PlayerSurface$4$1(2, Player.class, "setVideoTextureView", "setVideoTextureView(Landroid/view/TextureView;)V", 0);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Player player = (Player) obj;
        player.getClass();
        ((ExoPlayerImpl) player).setVideoTextureView((TextureView) obj2);
        return Unit.INSTANCE;
    }
}
