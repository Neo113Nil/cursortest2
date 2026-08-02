package ru.yandex.taxi.activity;

import defpackage.tje;
import defpackage.tse;
import java.util.Stack;

/* loaded from: classes9.dex */
public final class h {
    public final Stack a = new Stack();
    public final Stack b = new Stack();

    public h(tse tseVar) {
        tje.N(tseVar, null, null, new BackPressTracker$1(this, null), 3);
    }
}
