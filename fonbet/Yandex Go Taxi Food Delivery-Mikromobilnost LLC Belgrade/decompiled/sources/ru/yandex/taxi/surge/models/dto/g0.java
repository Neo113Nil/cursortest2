package ru.yandex.taxi.surge.models.dto;

import defpackage.bhw0;
import defpackage.gsq0;
import defpackage.i3y;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes6.dex */
public final class g0 extends h0 {
    public static final g0 INSTANCE = new g0();
    public static final /* synthetic */ i3y a = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new bhw0(9));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof g0);
    }

    public final int hashCode() {
        return -1458447056;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "UnknownAction";
    }
}
