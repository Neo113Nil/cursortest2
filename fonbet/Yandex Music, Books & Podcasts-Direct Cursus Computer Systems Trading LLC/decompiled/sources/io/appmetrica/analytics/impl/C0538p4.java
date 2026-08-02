package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.p4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0538p4 extends W8 {
    @Override // io.appmetrica.analytics.impl.W8
    public final boolean a(@NotNull C0278g4 c0278g4, @NotNull C0278g4 c0278g42) {
        if (AbstractC0734vr.a(c0278g42.a)) {
            return true;
        }
        if (AbstractC0734vr.a(c0278g4.a)) {
            return false;
        }
        X8 x8 = c0278g4.b;
        X8 x82 = X8.c;
        C0374je c0374je = this.a;
        if (x8 == x82) {
            if (((Number) c0374je.a(x8)).intValue() >= ((Number) this.a.a(c0278g42.b)).intValue()) {
                return true;
            }
        } else if (((Number) c0374je.a(x8)).intValue() > ((Number) this.a.a(c0278g42.b)).intValue()) {
            return true;
        }
        return false;
    }
}
