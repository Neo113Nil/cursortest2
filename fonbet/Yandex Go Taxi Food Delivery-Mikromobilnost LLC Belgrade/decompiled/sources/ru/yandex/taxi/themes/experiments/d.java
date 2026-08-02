package ru.yandex.taxi.themes.experiments;

import defpackage.i3y;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.themes.experiments.DarkThemeSwitchExperiment;

/* loaded from: classes10.dex */
public final class d {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = DarkThemeSwitchExperiment.ThemeDefaultSetting.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
