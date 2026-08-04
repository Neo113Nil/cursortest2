package com.gamericefishpro.space.s4;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import com.gamericefishpro.space.n9.c0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements com.gamericefishpro.space.z4.f {
    public final /* synthetic */ com.gamericefishpro.space.z4.w d;

    public l(EmojiCompatInitializer emojiCompatInitializer, com.gamericefishpro.space.z4.w wVar) {
        this.d = wVar;
    }

    @Override // com.gamericefishpro.space.z4.f
    public final void b(com.gamericefishpro.space.z4.u uVar) {
        (Build.VERSION.SDK_INT >= 28 ? a.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new c0(1), 500L);
        this.d.f(this);
    }
}
