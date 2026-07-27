package com.instagram.common.viewpoint.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class AQ implements InterfaceC2335pF {
    public static String[] A04 = {"fHQEiP1zlTMmcDhuRJvCUYhlqM3A1WdS", "0xjR5o24wRXCnK6P48nvJnLVp1A7yIdC", "SqWyKblZmsOi3mnFjBlOyIvINI4fuoz1", "GUT90kd8g0iIA", "yfLAFjbfQv", "f1jCtkpjn8LmH02gI7EE0X95Og8KENXi", "pIy67q2NMZ", "VUF0F4IbO37j7MJUWX75PYUeN7L9nYYd"};
    public int A00;
    public C06595i A01;
    public final ArrayList<InterfaceC06705t> A02 = new ArrayList<>(1);
    public final boolean A03;

    @Override // com.instagram.common.viewpoint.core.InterfaceC2335pF
    public /* synthetic */ Map A8t() {
        return C5X.A00(this);
    }

    public AQ(boolean z8) {
        this.A03 = z8;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0005 */
    @MetaExoPlayerCustomization
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void A0D(C06595i c06595i, boolean z8) {
        this.A01 = c06595i;
        for (int i = 0; i < i; i++) {
            this.A02.get(i).AGH(this, c06595i, this.A03, z8);
        }
    }

    public final void A0E() {
        C06595i c06595i = (C06595i) C5C.A0f(this.A01);
        for (int i = 0; i < this.A00; i++) {
            this.A02.get(i).AGG(this, c06595i, this.A03);
        }
        this.A01 = null;
    }

    public final void A0F(int i) {
        C06595i c06595i = (C06595i) C5C.A0f(this.A01);
        for (int i4 = 0; i4 < this.A00; i4++) {
            this.A02.get(i4).ADK(this, c06595i, this.A03, i);
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0003 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A0G(C06595i c06595i) {
        for (int i = 0; i < i; i++) {
            this.A02.get(i);
            if (A04[7].charAt(14) == 'P') {
                throw new RuntimeException();
            }
            A04[2] = "KcnUkvSyZAFqCmq9nk7LLPyjKQRUe1pa";
        }
    }

    public final void A0H(C06595i c06595i) {
        A0D(c06595i, false);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2335pF
    public final void A43(InterfaceC06705t interfaceC06705t) {
        AbstractC06233y.A01(interfaceC06705t);
        if (!this.A02.contains(interfaceC06705t)) {
            this.A02.add(interfaceC06705t);
            this.A00++;
        }
    }
}
