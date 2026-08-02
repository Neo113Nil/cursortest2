package ru.yandex.taxi.requirements.models.net;

import defpackage.i3y;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.requirements.models.net.CompoundSelectDto;

/* loaded from: classes9.dex */
public final class b {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = CompoundSelectDto.CompoundSelectItemTypeDto.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
