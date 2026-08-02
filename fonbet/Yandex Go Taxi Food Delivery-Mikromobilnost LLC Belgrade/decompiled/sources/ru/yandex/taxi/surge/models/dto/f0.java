package ru.yandex.taxi.surge.models.dto;

import defpackage.bhw0;
import defpackage.gsq0;
import defpackage.i3y;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes6.dex */
public final class f0 extends h0 {
    public static final f0 INSTANCE = new f0();
    public static final /* synthetic */ i3y a = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new bhw0(8));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof f0);
    }

    public final int hashCode() {
        return -1932431587;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "SendFeedback";
    }
}
