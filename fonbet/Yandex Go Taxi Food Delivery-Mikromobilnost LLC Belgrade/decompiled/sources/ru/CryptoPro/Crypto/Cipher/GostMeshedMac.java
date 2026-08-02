package ru.CryptoPro.Crypto.Cipher;

import android.support.v4.media.session.PlaybackStateCompat;
import java.security.InvalidKeyException;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class GostMeshedMac extends GostMac {
    public final void a() {
        try {
            this.key.changeKey(this.param);
        } catch (InvalidKeyException e) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(GostMac.resource.getString(ErrorStrings.ERR_CHANGE));
            illegalArgumentException.initCause(e);
            JCPLogger.warning(illegalArgumentException);
            throw illegalArgumentException;
        }
    }

    @Override // ru.CryptoPro.Crypto.Cipher.GostMac
    public final boolean allowAdditionalKb() {
        return false;
    }

    @Override // ru.CryptoPro.Crypto.Cipher.GostMac, javax.crypto.MacSpi
    public final Object clone() {
        return new GostMeshedMac(this);
    }

    @Override // ru.CryptoPro.Crypto.Cipher.GostMac, javax.crypto.MacSpi
    public final void engineUpdate(byte[] bArr, int i, int i2) {
        try {
            long j = this.count & 1023;
            if (j != 0) {
                long j2 = PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID - j;
                long j3 = i2;
                if (j2 > j3) {
                    j2 = j3;
                }
                super.engineUpdate(bArr, i, (int) j2);
                i = (int) (i + j2);
                i2 = (int) (j3 - j2);
                if (this.count % PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID == 0) {
                    a();
                }
            }
            while (true) {
                long j4 = i2;
                if (j4 < PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
                    break;
                }
                super.engineUpdate(bArr, i, 1024);
                i = (int) (i + PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID);
                i2 = (int) (j4 - PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID);
                a();
            }
            if (i2 != 0) {
                super.engineUpdate(bArr, i, i2);
                if (this.count % PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID == 0) {
                    a();
                }
            }
        } catch (Error e) {
            clearKey();
            engineReset();
            throw e;
        } catch (RuntimeException e2) {
            clearKey();
            engineReset();
            throw e2;
        }
    }
}
