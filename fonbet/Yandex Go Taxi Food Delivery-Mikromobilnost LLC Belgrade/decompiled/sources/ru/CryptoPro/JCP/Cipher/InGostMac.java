package ru.CryptoPro.JCP.Cipher;

import android.support.v4.media.session.PlaybackStateCompat;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import defpackage.ny61;
import java.security.InvalidKeyException;
import java.security.spec.KeySpec;
import java.util.Arrays;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.JCP.Key.SecretKeySpec;
import ru.CryptoPro.JCP.params.CryptParamsInterface;

/* loaded from: classes4.dex */
public final class InGostMac {
    public final SecretKeySpec c;
    public final CryptParamsInterface d;
    public final boolean g;
    public final byte[] a = new byte[8];
    public int b = 0;
    public final int[] e = new int[2];
    public long f = 0;

    public InGostMac(KeySpec keySpec, boolean z) {
        if (!(keySpec instanceof SecretKeySpec)) {
            ny61.g("InGostMac.ctor");
            throw null;
        }
        SecretKeySpec secretKeySpec = (SecretKeySpec) keySpec;
        this.c = secretKeySpec;
        this.d = (CryptParamsInterface) secretKeySpec.getParams();
        this.g = z;
        reset();
    }

    public static int countImitaBig(byte[] bArr, int i, int i2, int[] iArr, int i3, int[] iArr2, int i4, int[] iArr3) {
        int[] iArr4 = new int[2];
        byte[] bArr2 = new byte[8];
        for (int i5 = 0; i5 < i2; i5 += 8) {
            for (int i6 = 0; i6 < 8; i6++) {
                if (i5 + i6 < i2) {
                    bArr2[i6] = bArr[i + i5 + i6];
                } else {
                    bArr2[i6] = 0;
                }
            }
            iArr4[0] = iArr4[0] ^ (((((bArr2[3] << 24) & ModalContentViewContainer.BASE_SHADOW_COLOR) | ((bArr2[2] << PKIBody._CKUANN) & 16711680)) | ((bArr2[1] << 8) & 65280)) | (bArr2[0] & 255));
            iArr4[1] = iArr4[1] ^ (((((bArr2[7] << 24) & ModalContentViewContainer.BASE_SHADOW_COLOR) | ((bArr2[6] << PKIBody._CKUANN) & 16711680)) | ((bArr2[5] << 8) & 65280)) | (bArr2[4] & 255));
            InGostCipher.imita(iArr4, iArr, i3, iArr2, i4, iArr3);
        }
        return iArr4[0];
    }

    public final void a() {
        int[] iArr = this.e;
        int i = iArr[0];
        byte[] bArr = this.a;
        iArr[0] = i ^ (((((bArr[3] << 24) & ModalContentViewContainer.BASE_SHADOW_COLOR) | ((bArr[2] << PKIBody._CKUANN) & 16711680)) | ((bArr[1] << 8) & 65280)) | (bArr[0] & 255));
        iArr[1] = iArr[1] ^ (((((bArr[7] << 24) & ModalContentViewContainer.BASE_SHADOW_COLOR) | ((bArr[6] << PKIBody._CKUANN) & 16711680)) | ((bArr[5] << 8) & 65280)) | (bArr[4] & 255));
        long j = this.f + 8;
        this.f = j;
        CryptParamsInterface cryptParamsInterface = this.d;
        SecretKeySpec secretKeySpec = this.c;
        boolean z = this.g;
        if (z && j == PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            secretKeySpec.changeKey(cryptParamsInterface);
            this.f = 0L;
        }
        secretKeySpec.imita(iArr, cryptParamsInterface, z);
    }

    public int get() throws InvalidKeyException {
        int i = this.b;
        if (i != 0) {
            while (i < 8) {
                this.a[i] = 0;
                i++;
            }
            a();
        }
        int i2 = this.e[0];
        reset();
        return i2;
    }

    public void reset() {
        this.b = 0;
        this.f = 0L;
        int[] iArr = this.e;
        iArr[1] = 0;
        iArr[0] = 0;
        Arrays.fill(this.a, (byte) 0);
    }

    public void update(byte b) throws InvalidKeyException {
        int i = this.b;
        this.a[i] = b;
        int i2 = i + 1;
        this.b = i2;
        if (i2 == 8) {
            a();
            this.b = 0;
        }
    }

    public void update(byte[] bArr) throws InvalidKeyException {
        for (byte b : bArr) {
            update(b);
        }
    }
}
