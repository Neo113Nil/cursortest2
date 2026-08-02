package com.yandex.plus.home.feature.panel.internal.shortcuts.lite.statusandfamily;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import defpackage.y2x;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class a {
    public final ImageView a;
    public final Function0 b;
    public final com.yandex.plus.core.imageloader.b c;

    public a(ImageView imageView, Function0 function0, com.yandex.plus.core.imageloader.b bVar) {
        imageView.getClass();
        function0.getClass();
        this.a = imageView;
        this.b = function0;
        this.c = bVar;
    }

    public final void a(String str, boolean z, boolean z2) {
        ImageView imageView = this.a;
        if (z2) {
            ((com.yandex.plus.coil.b) this.c).b(str).i(imageView);
            return;
        }
        int i = !((Boolean) this.b.invoke()).booleanValue() ? z ? R.color.plus_sdk_family_full_avatar_color_light : R.color.plus_sdk_family_avatar_color_light : z ? R.color.plus_sdk_family_full_avatar_color_dark : R.color.plus_sdk_family_avatar_color_dark;
        Drawable w = y2x.w(imageView.getContext(), R.drawable.plus_sdk_ic_family_not_accepted_new);
        if (w != null) {
            w.setTint(r1.i(i, imageView));
        } else {
            w = null;
        }
        imageView.setImageDrawable(w);
    }
}
