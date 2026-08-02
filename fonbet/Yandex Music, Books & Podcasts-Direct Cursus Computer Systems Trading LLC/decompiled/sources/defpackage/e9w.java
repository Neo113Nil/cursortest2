package defpackage;

import kotlin.jvm.functions.Function0;
import ru.yandex.video.m3.player.PlaybackException;

/* loaded from: classes4.dex */
public final class e9w implements r9g {
    public final /* synthetic */ Function0 a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Function0 c;

    public e9w(Function0 function0, Function0 function02, Function0 function03) {
        this.a = function0;
        this.b = function02;
        this.c = function03;
    }

    @Override // defpackage.r9g
    public final void P(PlaybackException playbackException) {
        this.b.invoke();
    }

    @Override // defpackage.r9g
    public final void e() {
        this.a.invoke();
    }

    @Override // defpackage.r9g
    public final void v() {
        this.c.invoke();
    }
}
