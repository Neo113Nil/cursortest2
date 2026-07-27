package com.instagram.common.viewpoint.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class AQ implements InterfaceC2336pF {
    public static String[] A04 = {"fHQEiP1zlTMmcDhuRJvCUYhlqM3A1WdS", "0xjR5o24wRXCnK6P48nvJnLVp1A7yIdC", "SqWyKblZmsOi3mnFjBlOyIvINI4fuoz1", "GUT90kd8g0iIA", "yfLAFjbfQv", "f1jCtkpjn8LmH02gI7EE0X95Og8KENXi", "pIy67q2NMZ", "VUF0F4IbO37j7MJUWX75PYUeN7L9nYYd"};
    public int A00;
    public C06605i A01;
    public final ArrayList<InterfaceC06715t> A02 = new ArrayList<>(1);
    public final boolean A03;

    @Override // com.instagram.common.viewpoint.core.InterfaceC2336pF
    public /* synthetic */ Map A8t() {
        return C5X.A00(this);
    }

    public AQ(boolean z3) {
        this.A03 = z3;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0005 */
    @MetaExoPlayerCustomization
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void A0D(C06605i c06605i, boolean z3) {
        this.A01 = c06605i;
        for (int i = 0; i < i; i++) {
            this.A02.get(i).AGH(this, c06605i, this.A03, z3);
        }
    }

    public final void A0E() {
        C06605i c06605i = (C06605i) C5C.A0f(this.A01);
        for (int i = 0; i < this.A00; i++) {
            this.A02.get(i).AGG(this, c06605i, this.A03);
        }
        this.A01 = null;
    }

    public final void A0F(int i) {
        C06605i c06605i = (C06605i) C5C.A0f(this.A01);
        for (int i6 = 0; i6 < this.A00; i6++) {
            this.A02.get(i6).ADK(this, c06605i, this.A03, i);
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0003 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A0G(C06605i c06605i) {
        for (int i = 0; i < i; i++) {
            this.A02.get(i);
            if (A04[7].charAt(14) == 'P') {
                throw new RuntimeException();
            }
            A04[2] = "KcnUkvSyZAFqCmq9nk7LLPyjKQRUe1pa";
        }
    }

    public final void A0H(C06605i c06605i) {
        A0D(c06605i, false);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2336pF
    public final void A43(InterfaceC06715t interfaceC06715t) {
        AbstractC06243y.A01(interfaceC06715t);
        if (!this.A02.contains(interfaceC06715t)) {
            this.A02.add(interfaceC06715t);
            this.A00++;
        }
    }
}
