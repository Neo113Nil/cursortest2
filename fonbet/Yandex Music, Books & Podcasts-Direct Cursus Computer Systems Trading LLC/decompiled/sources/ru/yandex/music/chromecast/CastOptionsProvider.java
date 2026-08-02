package ru.yandex.music.chromecast;

import android.content.Context;
import androidx.annotation.Keep;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.b1x;
import defpackage.g74;
import defpackage.jj4;
import defpackage.k74;
import defpackage.lfj;
import defpackage.mnf;
import defpackage.swj;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/yandex/music/chromecast/CastOptionsProvider;", "Lswj;", "<init>", "()V", "Landroid/content/Context;", "context", "Lk74;", "getCastOptions", "(Landroid/content/Context;)Lk74;", "", "Lb1x;", "getAdditionalSessionProviders", "(Landroid/content/Context;)Ljava/util/List;", "yandexmusic"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final class CastOptionsProvider implements swj {
    @Override // defpackage.swj
    public List<b1x> getAdditionalSessionProviders(@NotNull Context context) {
        context.getClass();
        return null;
    }

    @Override // defpackage.swj
    @NotNull
    public k74 getCastOptions(@NotNull Context context) {
        context.getClass();
        ArrayList arrayList = new ArrayList();
        mnf mnfVar = new mnf();
        ArrayList arrayList2 = new ArrayList();
        new lfj().a();
        g74 g74Var = new g74("com.google.android.gms.cast.framework.media.MediaIntentReceiver", null, null, null, false, true);
        if (k74.s != null) {
            return new k74("F3514B38", arrayList, false, mnfVar, true, g74Var, true, 0.05000000074505806d, false, false, false, arrayList2, true, false, k74.q, k74.r);
        }
        jj4.j("use Optional.orNull() instead of Optional.or(null)");
        return null;
    }
}
