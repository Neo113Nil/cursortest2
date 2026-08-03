package q3;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class j implements androidx.lifecycle.f {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.w f5768g;

    public j(EmojiCompatInitializer emojiCompatInitializer, androidx.lifecycle.w wVar) {
        this.f5768g = wVar;
    }

    @Override // androidx.lifecycle.f
    public final void a(androidx.lifecycle.u uVar) {
        (Build.VERSION.SDK_INT >= 28 ? b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new m(), 500L);
        this.f5768g.f(this);
    }
}
