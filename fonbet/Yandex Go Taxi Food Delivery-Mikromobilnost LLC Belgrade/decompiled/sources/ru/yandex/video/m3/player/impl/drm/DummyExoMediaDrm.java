package ru.yandex.video.m3.player.impl.drm;

import android.media.MediaDrmException;
import android.os.PersistableBundle;
import androidx.media3.common.DrmInitData;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;
import defpackage.gno;
import defpackage.hno;
import defpackage.ino;
import defpackage.jno;
import defpackage.lno;
import defpackage.mno;
import defpackage.rcf;
import defpackage.tw21;
import defpackage.vyc0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import ru.yandex.video.m3.player.PlaybackException;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJW\u0010&\u001a\u00020%2\u0006\u0010\u001b\u001a\u00020\u00152\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c2\u0006\u0010 \u001a\u00020\u001f2&\u0010$\u001a\"\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"\u0018\u00010!j\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"\u0018\u0001`#H\u0016¢\u0006\u0004\b&\u0010'J!\u0010)\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\u0015H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\f2\u0006\u0010(\u001a\u00020\u0015H\u0016¢\u0006\u0004\b.\u0010\u001aJ#\u00100\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"0/2\u0006\u0010\u0018\u001a\u00020\u0015H\u0016¢\u0006\u0004\b0\u00101J\u001f\u00104\u001a\u0002032\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u00102\u001a\u00020\"H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\fH\u0016¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\fH\u0016¢\u0006\u0004\b8\u00107J\u001f\u0010:\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u00109\u001a\u00020\u0015H\u0016¢\u0006\u0004\b:\u0010;J\u0011\u0010=\u001a\u0004\u0018\u00010<H\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u00020\"2\u0006\u0010?\u001a\u00020\"H\u0016¢\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\u00020\u00152\u0006\u0010?\u001a\u00020\"H\u0016¢\u0006\u0004\bB\u0010CJ\u001f\u0010E\u001a\u00020\f2\u0006\u0010?\u001a\u00020\"2\u0006\u0010D\u001a\u00020\"H\u0016¢\u0006\u0004\bE\u0010FJ\u001f\u0010G\u001a\u00020\f2\u0006\u0010?\u001a\u00020\"2\u0006\u0010D\u001a\u00020\u0015H\u0016¢\u0006\u0004\bG\u0010HJ\u0017\u0010J\u001a\u00020I2\u0006\u0010\u0018\u001a\u00020\u0015H\u0016¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020\u001fH\u0016¢\u0006\u0004\bL\u0010MR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010N\u001a\u0004\bO\u0010P¨\u0006Q"}, d2 = {"Lru/yandex/video/m3/player/impl/drm/DummyExoMediaDrm;", "Lmno;", "", "throwable", "<init>", "(Ljava/lang/Throwable;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "throwException", "()Ljava/lang/Exception;", "Lhno;", "listener", "Lzy11;", "setOnEventListener", "(Lhno;)V", "Ljno;", "setOnKeyStatusChangeListener", "(Ljno;)V", "Lino;", "setOnExpirationUpdateListener", "(Lino;)V", "", "openSession", "()[B", "sessionId", "closeSession", "([B)V", "scope", "", "Landroidx/media3/common/DrmInitData$SchemeData;", "schemeDatas", "", "keyType", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "optionalParameters", "Lgno;", "getKeyRequest", "([BLjava/util/List;ILjava/util/HashMap;)Lgno;", "response", "provideKeyResponse", "([B[B)[B", "Llno;", "getProvisionRequest", "()Llno;", "provideProvisionResponse", "", "queryKeyStatus", "([B)Ljava/util/Map;", "mimeType", "", "requiresSecureDecoder", "([BLjava/lang/String;)Z", "acquire", "()V", "release", "keySetId", "restoreKeys", "([B[B)V", "Landroid/os/PersistableBundle;", "getMetrics", "()Landroid/os/PersistableBundle;", "propertyName", "getPropertyString", "(Ljava/lang/String;)Ljava/lang/String;", "getPropertyByteArray", "(Ljava/lang/String;)[B", "value", "setPropertyString", "(Ljava/lang/String;Ljava/lang/String;)V", "setPropertyByteArray", "(Ljava/lang/String;[B)V", "Lrcf;", "createCryptoConfig", "([B)Lrcf;", "getCryptoType", "()I", "Ljava/lang/Throwable;", "getThrowable", "()Ljava/lang/Throwable;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
final class DummyExoMediaDrm implements mno {
    private final Throwable throwable;

    public DummyExoMediaDrm(Throwable th) {
        this.throwable = th;
    }

    private final Exception throwException() {
        Throwable th = this.throwable;
        return th instanceof UnsupportedDrmException ? ((UnsupportedDrmException) th).reason == 1 ? new PlaybackException.DrmThrowable.ErrorDrmUnsupportedScheme(this.throwable) : new PlaybackException.DrmThrowable.ErrorDrmNotSupported(this.throwable) : new PlaybackException.DrmThrowable.ErrorDrmUnknown(this.throwable);
    }

    public void acquire() {
    }

    @Override // defpackage.mno
    public void closeSession(byte[] sessionId) {
    }

    @Override // defpackage.mno
    public rcf createCryptoConfig(byte[] sessionId) {
        throw new IllegalStateException();
    }

    @Override // defpackage.mno
    public int getCryptoType() {
        return 1;
    }

    @Override // defpackage.mno
    public gno getKeyRequest(byte[] scope, List<DrmInitData.SchemeData> schemeDatas, int keyType, HashMap<String, String> optionalParameters) {
        throw throwException();
    }

    public PersistableBundle getMetrics() {
        return null;
    }

    public List getOfflineLicenseKeySetIds() {
        throw new UnsupportedOperationException();
    }

    public byte[] getPropertyByteArray(String propertyName) {
        return tw21.c;
    }

    public String getPropertyString(String propertyName) {
        return "";
    }

    @Override // defpackage.mno
    public lno getProvisionRequest() {
        throw throwException();
    }

    public final Throwable getThrowable() {
        return this.throwable;
    }

    @Override // defpackage.mno
    public byte[] openSession() throws MediaDrmException {
        throw throwException();
    }

    @Override // defpackage.mno
    public byte[] provideKeyResponse(byte[] scope, byte[] response) {
        throw throwException();
    }

    @Override // defpackage.mno
    public void provideProvisionResponse(byte[] response) {
        throw throwException();
    }

    @Override // defpackage.mno
    public Map<String, String> queryKeyStatus(byte[] sessionId) {
        throw throwException();
    }

    @Override // defpackage.mno
    public void release() {
    }

    public void removeOfflineLicense(byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.mno
    public boolean requiresSecureDecoder(byte[] sessionId, String mimeType) {
        throw new IllegalStateException();
    }

    @Override // defpackage.mno
    public void restoreKeys(byte[] sessionId, byte[] keySetId) {
        throw throwException();
    }

    @Override // defpackage.mno
    public void setOnEventListener(hno listener) {
    }

    public void setOnExpirationUpdateListener(ino listener) {
    }

    public void setOnKeyStatusChangeListener(jno listener) {
    }

    @Override // defpackage.mno
    public /* bridge */ /* synthetic */ void setPlayerIdForSession(byte[] bArr, vyc0 vyc0Var) {
    }

    public void setPropertyByteArray(String propertyName, byte[] value) {
    }

    public void setPropertyString(String propertyName, String value) {
    }
}
