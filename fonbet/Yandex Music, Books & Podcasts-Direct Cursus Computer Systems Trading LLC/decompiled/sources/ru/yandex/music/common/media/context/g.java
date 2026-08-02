package ru.yandex.music.common.media.context;

import defpackage.nyk;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.utils.Assertions;

/* loaded from: classes5.dex */
public final class g extends PlaybackScope {
    public final String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Page page, String str) {
        super(page, PlaybackScope.Type.SIMPLE_PAGE);
        page.getClass();
        str.getClass();
        this.b = str;
    }

    @Override // ru.yandex.music.common.media.context.PlaybackScope
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!g.class.equals(obj != null ? obj.getClass() : null) || !super.equals(obj)) {
            return false;
        }
        obj.getClass();
        return Intrinsics.d(this.b, ((g) obj).b);
    }

    @Override // ru.yandex.music.common.media.context.PlaybackScope
    public final c h() {
        c cVar = c.d;
        nyk nykVar = new nyk(PlaybackContextName.SEARCH, null, this.b);
        String str = Card.TRACK.name;
        Assertions.assertNonNull(this, "build(): scope is not set");
        Assertions.assertNonNull(nykVar, "build(): info is not set");
        Assertions.assertNonNull(str, "build(): card is not set");
        if (str == null) {
            str = "";
        }
        return new c(this, nykVar, str);
    }

    @Override // ru.yandex.music.common.media.context.PlaybackScope
    public final int hashCode() {
        return this.b.hashCode() + (super.hashCode() * 31);
    }
}
