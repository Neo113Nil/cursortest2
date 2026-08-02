package defpackage;

import android.content.Context;
import com.yandex.div.core.player.DivPlayerView;
import com.yandex.div2.DivVideoScale;
import defpackage.r4l;
import java.util.List;

/* loaded from: classes.dex */
public final class t4l implements u4l {
    @Override // defpackage.u4l
    public final DivPlayerView a(final Context context) {
        return new DivPlayerView(context) { // from class: com.yandex.div.core.player.DivPlayerFactory$Companion$STUB$1$makePlayerView$1
            @Override // com.yandex.div.core.player.DivPlayerView
            public /* bridge */ /* synthetic */ void attach(r4l r4lVar) {
                super.attach(r4lVar);
            }

            @Override // com.yandex.div.core.player.DivPlayerView
            public /* bridge */ /* synthetic */ void detach() {
                super.detach();
            }

            @Override // com.yandex.div.core.player.DivPlayerView
            public /* bridge */ /* synthetic */ r4l getAttachedPlayer() {
                return super.getAttachedPlayer();
            }

            @Override // com.yandex.div.core.player.DivPlayerView
            public /* bridge */ /* synthetic */ void setScale(DivVideoScale divVideoScale) {
                super.setScale(divVideoScale);
            }

            @Override // com.yandex.div.core.player.DivPlayerView
            public /* bridge */ /* synthetic */ void setVisibleOnScreen(boolean z) {
                super.setVisibleOnScreen(z);
            }
        };
    }

    @Override // defpackage.u4l
    public final r4l b(List list, v4l v4lVar) {
        return new s4l();
    }
}
