package ru.yandex.taxi.communications.api.dto;

import defpackage.bmu0;
import defpackage.dqu0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.qje;
import kotlin.LazyThreadSafetyMode;
import ru.yandex.taxi.communications.api.dto.StoryWidgets;

@gsq0
/* loaded from: classes5.dex */
public final class q0 {
    public static final dqu0 Companion = new dqu0();
    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new bmu0(11)), null};
    public final StoryWidgets.ActionType a;
    public final StoryWidgets.a b;

    public /* synthetic */ q0(int i, StoryWidgets.ActionType actionType, StoryWidgets.a aVar) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, p0.a.getDescriptor());
            throw null;
        }
        this.a = actionType;
        this.b = aVar;
    }

    public q0(StoryWidgets.ActionType actionType, StoryWidgets.a aVar) {
        this.a = actionType;
        this.b = aVar;
    }
}
