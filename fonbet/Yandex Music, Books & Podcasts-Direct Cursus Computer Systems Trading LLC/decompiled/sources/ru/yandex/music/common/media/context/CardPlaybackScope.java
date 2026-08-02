package ru.yandex.music.common.media.context;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import defpackage.c01;
import defpackage.cvl;
import defpackage.eul;
import defpackage.lt;
import defpackage.nyk;
import defpackage.oq;
import defpackage.oyk;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.utils.Assertions;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\b¨\u0006\t"}, d2 = {"Lru/yandex/music/common/media/context/CardPlaybackScope;", "Lru/yandex/music/common/media/context/PlaybackScope;", "Lru/yandex/music/common/media/context/Page;", Constants.KEY_PAGE, "", "card", "<init>", "(Lru/yandex/music/common/media/context/Page;Ljava/lang/String;)V", "Ljava/lang/String;", "yandexmusic"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final class CardPlaybackScope extends PlaybackScope {
    private static final long serialVersionUID = 1;

    @SerializedName("card")
    @NotNull
    private final String card;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardPlaybackScope(@NotNull Page page, @NotNull String str) {
        super(page, PlaybackScope.Type.CARD);
        page.getClass();
        str.getClass();
        this.card = str;
    }

    @Override // ru.yandex.music.common.media.context.PlaybackScope
    public final c b(oq oqVar) {
        oqVar.getClass();
        nyk nykVar = oyk.a;
        return n(oyk.a(oqVar.a, oqVar.b));
    }

    @Override // ru.yandex.music.common.media.context.PlaybackScope
    public final c c(lt ltVar) {
        ltVar.getClass();
        nyk nykVar = oyk.a;
        return n(oyk.a(ltVar.a, ltVar.c));
    }

    @Override // ru.yandex.music.common.media.context.PlaybackScope
    public final c d(c01 c01Var) {
        c01Var.getClass();
        return n(oyk.b(c01Var));
    }

    @Override // ru.yandex.music.common.media.context.PlaybackScope
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof CardPlaybackScope) && super.equals(obj)) {
            return Intrinsics.d(this.card, ((CardPlaybackScope) obj).card);
        }
        return false;
    }

    @Override // ru.yandex.music.common.media.context.PlaybackScope
    public final c f(eul eulVar) {
        eulVar.getClass();
        nyk nykVar = oyk.a;
        return n(new nyk(PlaybackContextName.PLAYLIST, eulVar.f, eulVar.c));
    }

    @Override // ru.yandex.music.common.media.context.PlaybackScope
    public final c g(cvl cvlVar, boolean z) {
        cvlVar.getClass();
        return n(oyk.c(cvlVar));
    }

    @Override // ru.yandex.music.common.media.context.PlaybackScope
    public final c h() {
        nyk nykVar = oyk.a;
        nykVar.getClass();
        return n(nykVar);
    }

    @Override // ru.yandex.music.common.media.context.PlaybackScope
    public final int hashCode() {
        return this.card.hashCode() + (super.hashCode() * 31);
    }

    public final c n(nyk nykVar) {
        c cVar = c.d;
        String str = this.card;
        Assertions.assertNonNull(this, "build(): scope is not set");
        Assertions.assertNonNull(nykVar, "build(): info is not set");
        Assertions.assertNonNull(str, "build(): card is not set");
        if (nykVar == null) {
            nykVar = nyk.d;
        }
        if (str == null) {
            str = "";
        }
        return new c(this, nykVar, str);
    }
}
