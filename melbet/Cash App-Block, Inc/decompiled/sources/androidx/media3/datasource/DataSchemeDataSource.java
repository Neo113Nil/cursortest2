package androidx.media3.datasource;

import android.net.Uri;
import android.util.Base64;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Util;
import androidx.tracing.Trace;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* loaded from: classes3.dex */
public final class DataSchemeDataSource extends BaseDataSource {
    public int bytesRemaining;
    public byte[] data;
    public DataSpec dataSpec;
    public int readPosition;

    @Override // androidx.media3.datasource.DataSource
    public final void close() {
        if (this.data != null) {
            this.data = null;
            transferEnded();
        }
        this.dataSpec = null;
    }

    @Override // androidx.media3.datasource.DataSource
    public final Uri getUri() {
        DataSpec dataSpec = this.dataSpec;
        if (dataSpec != null) {
            return dataSpec.uri;
        }
        return null;
    }

    @Override // androidx.media3.datasource.DataSource
    public final long open(DataSpec dataSpec) {
        transferInitializing();
        this.dataSpec = dataSpec;
        Uri uri = dataSpec.uri;
        long j = dataSpec.length;
        Uri normalizeScheme = uri.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        Trace.checkArgument("Unsupported scheme: %s", scheme, "data".equals(scheme));
        String schemeSpecificPart = normalizeScheme.getSchemeSpecificPart();
        String str = Util.DEVICE_DEBUG_INFO;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length != 2) {
            throw new ParserException(CameraState$Type$EnumUnboxingLocalUtility.m(normalizeScheme, "Unexpected URI format: "), null, true, 0);
        }
        String str2 = split[1];
        if (split[0].contains(";base64")) {
            try {
                this.data = Base64.decode(str2, 0);
            } catch (IllegalArgumentException e) {
                throw new ParserException(Recorder$$ExternalSyntheticOutline2.m("Error while parsing Base64 encoded string: ", str2), e, true, 0);
            }
        } else {
            this.data = URLDecoder.decode(str2, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
        }
        long j2 = dataSpec.position;
        byte[] bArr = this.data;
        if (j2 > bArr.length) {
            this.data = null;
            throw new DataSourceException(2008);
        }
        int i = (int) j2;
        this.readPosition = i;
        int length = bArr.length - i;
        this.bytesRemaining = length;
        if (j != -1) {
            this.bytesRemaining = (int) Math.min(length, j);
        }
        transferStarted(dataSpec);
        return j != -1 ? j : this.bytesRemaining;
    }

    @Override // androidx.media3.common.DataReader
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.bytesRemaining;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        byte[] bArr2 = this.data;
        String str = Util.DEVICE_DEBUG_INFO;
        System.arraycopy(bArr2, this.readPosition, bArr, i, min);
        this.readPosition += min;
        this.bytesRemaining -= min;
        bytesTransferred(min);
        return min;
    }
}
