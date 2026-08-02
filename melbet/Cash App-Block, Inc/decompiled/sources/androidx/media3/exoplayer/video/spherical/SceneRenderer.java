package androidx.media3.exoplayer.video.spherical;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import androidx.media3.common.Format;
import androidx.media3.common.util.GlUtil$GlException;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimedValueQueue;
import androidx.media3.exoplayer.video.VideoFrameMetadataListener;
import androidx.media3.exoplayer.video.spherical.Projection;
import com.android.volley.Response;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class SceneRenderer implements VideoFrameMetadataListener, CameraMotionListener {
    public byte[] lastProjectionData;
    public SurfaceTexture surfaceTexture;
    public int textureId;
    public final AtomicBoolean frameAvailable = new AtomicBoolean();
    public final AtomicBoolean resetRotationAtNextFrame = new AtomicBoolean(true);
    public final ProjectionRenderer projectionRenderer = new ProjectionRenderer();
    public final Response frameRotationQueue = new Response(3);
    public final TimedValueQueue sampleTimestampQueue = new TimedValueQueue((byte) 0, 0);
    public final TimedValueQueue projectionQueue = new TimedValueQueue((byte) 0, 0);
    public final float[] rotationMatrix = new float[16];
    public final float[] tempMatrix = new float[16];
    public volatile int defaultStereoMode = 0;
    public int lastStereoMode = -1;

    public final SurfaceTexture init() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            Log.checkGlError();
            this.projectionRenderer.init();
            Log.checkGlError();
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            Log.checkGlError();
            int i = iArr[0];
            Log.bindTexture(36197, i);
            this.textureId = i;
        } catch (GlUtil$GlException e) {
            Log.e("SceneRenderer", "Failed to initialize the renderer", e);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.textureId);
        this.surfaceTexture = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: androidx.media3.exoplayer.video.spherical.SceneRenderer$$ExternalSyntheticLambda0
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                SceneRenderer.this.frameAvailable.set(true);
            }
        });
        return this.surfaceTexture;
    }

    @Override // androidx.media3.exoplayer.video.spherical.CameraMotionListener
    public final void onCameraMotion(long j, float[] fArr) {
        ((TimedValueQueue) this.frameRotationQueue.error).add(fArr, j);
    }

    @Override // androidx.media3.exoplayer.video.spherical.CameraMotionListener
    public final void onCameraMotionReset() {
        this.sampleTimestampQueue.clear();
        Response response = this.frameRotationQueue;
        ((TimedValueQueue) response.error).clear();
        response.intermediate = false;
        this.resetRotationAtNextFrame.set(true);
    }

    @Override // androidx.media3.exoplayer.video.VideoFrameMetadataListener
    public final void onVideoFrameAboutToBeRendered(long j, long j2, Format format2, MediaFormat mediaFormat) {
        int i;
        ArrayList arrayList;
        int readInt;
        this.sampleTimestampQueue.add(Long.valueOf(j), j2);
        byte[] bArr = format2.projectionData;
        int i2 = format2.stereoMode;
        byte[] bArr2 = this.lastProjectionData;
        int i3 = this.lastStereoMode;
        this.lastProjectionData = bArr;
        if (i2 == -1) {
            i2 = this.defaultStereoMode;
        }
        this.lastStereoMode = i2;
        if (i3 == i2 && Arrays.equals(bArr2, this.lastProjectionData)) {
            return;
        }
        byte[] bArr3 = this.lastProjectionData;
        Projection projection = null;
        if (bArr3 != null) {
            int i4 = this.lastStereoMode;
            ParsableByteArray parsableByteArray = new ParsableByteArray(bArr3);
            try {
                parsableByteArray.skipBytes(4);
                readInt = parsableByteArray.readInt();
                parsableByteArray.setPosition(0);
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            if (readInt == 1886547818) {
                parsableByteArray.skipBytes(8);
                int i5 = parsableByteArray.position;
                int i6 = parsableByteArray.limit;
                while (i5 < i6) {
                    int readInt2 = parsableByteArray.readInt() + i5;
                    if (readInt2 <= i5 || readInt2 > i6) {
                        break;
                    }
                    int readInt3 = parsableByteArray.readInt();
                    if (readInt3 != 2037673328 && readInt3 != 1836279920) {
                        parsableByteArray.setPosition(readInt2);
                        i5 = readInt2;
                    }
                    parsableByteArray.setLimit(readInt2);
                    arrayList = zzpf.parseMshp(parsableByteArray);
                    break;
                }
                arrayList = null;
            } else {
                arrayList = zzpf.parseMshp(parsableByteArray);
            }
            if (arrayList != null) {
                int size = arrayList.size();
                if (size == 1) {
                    Projection.Mesh mesh = (Projection.Mesh) arrayList.get(0);
                    projection = new Projection(mesh, mesh, i4);
                } else if (size == 2) {
                    projection = new Projection((Projection.Mesh) arrayList.get(0), (Projection.Mesh) arrayList.get(1), i4);
                }
            }
        }
        if (projection == null || !ProjectionRenderer.isSupported(projection)) {
            int i7 = this.lastStereoMode;
            float radians = (float) Math.toRadians(180.0d);
            float radians2 = (float) Math.toRadians(360.0d);
            float f = radians / 36.0f;
            float f2 = radians2 / 72.0f;
            float[] fArr = new float[15984];
            float[] fArr2 = new float[10656];
            int i8 = 0;
            int i9 = 0;
            for (int i10 = 0; i10 < 36; i10 = i) {
                float f3 = radians / 2.0f;
                float f4 = (i10 * f) - f3;
                i = i10 + 1;
                float f5 = (i * f) - f3;
                int i11 = 0;
                while (i11 < 73) {
                    int i12 = i;
                    int i13 = 0;
                    int i14 = 2;
                    while (i13 < i14) {
                        float f6 = radians;
                        float f7 = i11 * f2;
                        float f8 = radians2;
                        double d = (f7 + 3.1415927f) - (radians2 / 2.0f);
                        double d2 = i13 == 0 ? f4 : f5;
                        fArr[i8] = -((float) (Math.cos(d2) * Math.sin(d) * 50.0d));
                        fArr[i8 + 1] = (float) (Math.sin(d2) * 50.0d);
                        int i15 = i8 + 3;
                        float f9 = f;
                        fArr[i8 + 2] = (float) (Math.cos(d2) * Math.cos(d) * 50.0d);
                        fArr2[i9] = f7 / f8;
                        int i16 = i9 + 2;
                        fArr2[i9 + 1] = ((i10 + i13) * f9) / f6;
                        if ((i11 == 0 && i13 == 0) || (i11 == 72 && i13 == 1)) {
                            System.arraycopy(fArr, i8, fArr, i15, 3);
                            i8 += 6;
                            i14 = 2;
                            System.arraycopy(fArr2, i9, fArr2, i16, 2);
                            i9 += 4;
                        } else {
                            i14 = 2;
                            i8 = i15;
                            i9 = i16;
                        }
                        i13++;
                        radians = f6;
                        f = f9;
                        radians2 = f8;
                    }
                    i11++;
                    i = i12;
                }
            }
            Projection.Mesh mesh2 = new Projection.Mesh(new TimedValueQueue(0, 1, fArr, fArr2));
            projection = new Projection(mesh2, mesh2, i7);
        }
        this.projectionQueue.add(projection, j2);
    }
}
