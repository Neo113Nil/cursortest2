package com.yandex.music.shared.generative.domain.commands;

import com.yandex.music.shared.generative.api.commands.StartGenerativeQueueCommand;
import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueBound;
import defpackage.ern;
import defpackage.htb;
import defpackage.iyk;
import defpackage.jyk;
import defpackage.jyr;
import defpackage.t4d;
import defpackage.uoh;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class c {
    public static final c a = new c();

    public static void a(jyk jykVar, uoh uohVar, jyr jyrVar, jyr jyrVar2, jyr jyrVar3, jyr jyrVar4, jyr jyrVar5, Function0 function0) {
        iyk.c(jykVar, ern.a(StartGenerativeQueueCommand.class), new t4d(uohVar, jyrVar, jyrVar2, jyrVar3, jyrVar4, jyrVar5, function0, 0));
        iyk.a(jykVar, ern.a(GenerativeQueueCommandsFactory$Restart.class), new htb(20));
    }

    public final PlaybackCommand$QueueBound b() {
        return GenerativeQueueCommandsFactory$Restart.INSTANCE;
    }
}
