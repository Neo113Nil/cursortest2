package com.google.crypto.tink.subtle;

import androidx.lifecycle.LifecycleOwner;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.history.views.SkipPaymentView$$ExternalSyntheticLambda1;
import com.squareup.cash.incentives.finishsetup.applets.presenters.FinishSetupAppletTilePresenter$Factory$Impl;
import com.squareup.cash.incentives.finishsetup.applets.presenters.RealFinishSetupAppletTileRepository;
import com.squareup.cash.money.applets.viewmodels.Applet;
import com.squareup.cash.money.core.ids.AppletId;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public abstract class Bytes {
    public static byte[] concat(byte[]... bArr) {
        int i = 0;
        for (byte[] bArr2 : bArr) {
            if (i > Integer.MAX_VALUE - bArr2.length) {
                a$$ExternalSyntheticBUOutline0.m$6("exceeded size limit");
                return null;
            }
            i += bArr2.length;
        }
        byte[] bArr3 = new byte[i];
        int i2 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, i2, bArr4.length);
            i2 += bArr4.length;
        }
        return bArr3;
    }

    public static Applet finishSetupApplet(RealFinishSetupAppletTileRepository realFinishSetupAppletTileRepository, FinishSetupAppletTilePresenter$Factory$Impl finishSetupAppletTilePresenter$Factory$Impl, LifecycleOwner lifecycleOwner) {
        return new Applet(AppletId.FINISH_SETUP, realFinishSetupAppletTileRepository.availabilityState, new SkipPaymentView$$ExternalSyntheticLambda1(4, finishSetupAppletTilePresenter$Factory$Impl, lifecycleOwner));
    }

    public static final void xor(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        if (i < 0 || byteBuffer2.remaining() < i || byteBuffer3.remaining() < i || byteBuffer.remaining() < i) {
            a$$ExternalSyntheticBUOutline0.m$3("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public abstract String asString();

    public static final byte[] xor(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (i2 >= 0 && bArr.length - i2 >= i && bArr2.length - i2 >= 0) {
            byte[] bArr3 = new byte[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                bArr3[i3] = (byte) (bArr[i3 + i] ^ bArr2[i3]);
            }
            return bArr3;
        }
        a$$ExternalSyntheticBUOutline0.m$3("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        return null;
    }

    public static final byte[] xor(byte[] bArr, byte[] bArr2) {
        if (bArr.length == bArr2.length) {
            return xor(bArr, 0, bArr2, bArr.length);
        }
        a$$ExternalSyntheticBUOutline0.m$3("The lengths of x and y should match.");
        return null;
    }
}
