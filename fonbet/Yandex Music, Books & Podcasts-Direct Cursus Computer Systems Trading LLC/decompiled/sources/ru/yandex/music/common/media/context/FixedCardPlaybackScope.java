package ru.yandex.music.common.media.context;

import androidx.annotation.NonNull;
import com.google.gson.annotations.SerializedName;
import defpackage.c01;
import defpackage.cvl;
import defpackage.lt;
import defpackage.nyk;
import defpackage.oq;
import defpackage.oyk;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.utils.Assertions;

/* loaded from: classes5.dex */
final class FixedCardPlaybackScope extends PlaybackScope {
    private static final long serialVersionUID = 1;

    @NonNull
    @SerializedName("mCard")
    private final Card mCard;

    public FixedCardPlaybackScope(@NonNull Page page, @NonNull Card card) {
        super(page, PlaybackScope.Type.FIXED_CARD);
        this.mCard = card;
    }

    @Override // ru.yandex.music.common.media.context.PlaybackScope
    public final c b(oq oqVar) {
        nyk nykVar = oyk.a;
        return n(oyk.a(oqVar.a, oqVar.b));
    }

    @Override // ru.yandex.music.common.media.context.PlaybackScope
    public final c c(lt ltVar) {
        nyk nykVar = oyk.a;
        return n(oyk.a(ltVar.a, ltVar.c));
    }

    @Override // ru.yandex.music.common.media.context.PlaybackScope
    public final c d(c01 c01Var) {
        return n(oyk.b(c01Var));
    }

    @Override // ru.yandex.music.common.media.context.PlaybackScope
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FixedCardPlaybackScope) && super.equals(obj) && this.mCard == ((FixedCardPlaybackScope) obj).mCard;
    }

    @Override // ru.yandex.music.common.media.context.PlaybackScope
    public final c g(cvl cvlVar, boolean z) {
        return n(oyk.c(cvlVar));
    }

    @Override // ru.yandex.music.common.media.context.PlaybackScope
    public final c h() {
        return n(oyk.a);
    }

    @Override // ru.yandex.music.common.media.context.PlaybackScope
    public final int hashCode() {
        return this.mCard.hashCode() + (super.hashCode() * 31);
    }

    @Override // ru.yandex.music.common.media.context.PlaybackScope
    public final c i() {
        c cVar = c.d;
        nyk nykVar = oyk.a;
        String str = this.mCard.name;
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

    public final c n(nyk nykVar) {
        c cVar = c.d;
        String str = this.mCard.name;
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
