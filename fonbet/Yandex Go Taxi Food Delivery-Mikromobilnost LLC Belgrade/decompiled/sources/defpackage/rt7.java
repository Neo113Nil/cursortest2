package defpackage;

import android.content.ClipData;
import android.hardware.camera2.params.MultiResolutionStreamInfo;
import android.view.ContentInfo;
import android.view.ScrollCaptureSession;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class rt7 {
    public static /* bridge */ /* synthetic */ ContentInfo A(Object obj) {
        return (ContentInfo) obj;
    }

    public static /* synthetic */ void D() {
    }

    public static /* synthetic */ MultiResolutionStreamInfo d(int i, int i2, String str) {
        return new MultiResolutionStreamInfo(i, i2, str);
    }

    public static /* synthetic */ ContentInfo.Builder g(ClipData clipData, int i) {
        return new ContentInfo.Builder(clipData, i);
    }

    public static /* synthetic */ ContentInfo.Builder h(ContentInfo contentInfo) {
        return new ContentInfo.Builder(contentInfo);
    }

    public static /* bridge */ /* synthetic */ ContentInfo j(Object obj) {
        return (ContentInfo) obj;
    }

    public static /* bridge */ /* synthetic */ ScrollCaptureSession k(Object obj) {
        return (ScrollCaptureSession) obj;
    }

    public static /* synthetic */ void n() {
    }
}
