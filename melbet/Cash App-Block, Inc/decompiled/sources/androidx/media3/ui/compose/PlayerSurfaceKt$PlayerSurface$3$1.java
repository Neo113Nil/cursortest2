package androidx.media3.ui.compose;

import android.content.Context;
import android.view.TextureView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes3.dex */
public final /* synthetic */ class PlayerSurfaceKt$PlayerSurface$3$1 extends FunctionReferenceImpl implements Function1 {
    public static final PlayerSurfaceKt$PlayerSurface$3$1 INSTANCE = new PlayerSurfaceKt$PlayerSurface$3$1(1, TextureView.class, "<init>", "<init>(Landroid/content/Context;)V", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context context = (Context) obj;
        context.getClass();
        return new TextureView(context);
    }
}
