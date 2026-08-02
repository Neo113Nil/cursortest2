package ru.yandex.taxi.eatskit.internal;

import defpackage.ccn;
import kotlin.Pair;

/* loaded from: classes5.dex */
public final class a extends ccn {
    public a(boolean z) {
        super("cardState", Boolean.valueOf(z), true, EatsEvent$CardStateUpdate$1.b, true);
    }

    @Override // defpackage.ccn
    public final Pair a() {
        return new Pair("superappIsOpen", String.valueOf(((Boolean) this.b).booleanValue()));
    }
}
