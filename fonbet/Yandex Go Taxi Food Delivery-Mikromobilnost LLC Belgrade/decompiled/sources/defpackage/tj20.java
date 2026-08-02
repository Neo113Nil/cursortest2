package defpackage;

import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.ColorDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.missions.MissionProgressDto;

/* loaded from: classes5.dex */
public final class tj20 {
    public final m4v a;
    public final vdc b;
    public final bh4 c;

    public tj20(m4v m4vVar, vdc vdcVar, bh4 bh4Var) {
        this.a = m4vVar;
        this.b = vdcVar;
        this.c = bh4Var;
    }

    public final ek20 a(MissionProgressDto missionProgressDto) {
        w4v a = this.a.a(missionProgressDto.getIcon());
        MissionProgressDto.BadgeDto badge = missionProgressDto.getBadge();
        ColorDto backgroundColor = badge.getBackgroundColor();
        this.b.getClass();
        mhf0 mhf0Var = new mhf0(vdc.a(backgroundColor), vdc.a(badge.getTextColor()), badge.getText());
        MissionProgressDto.ProgressIndicatorDto progressIndicator = missionProgressDto.getProgressIndicator();
        return new ek20(a, mhf0Var, new djf0(progressIndicator.getProgress(), vdc.a(progressIndicator.getFillColor()), vdc.a(progressIndicator.getTrackColor())));
    }
}
