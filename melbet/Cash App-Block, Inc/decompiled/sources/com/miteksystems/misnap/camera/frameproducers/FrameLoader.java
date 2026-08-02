package com.miteksystems.misnap.camera.frameproducers;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.camera.core.MeteringPoint;
import androidx.camera.core.Preview;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.lifecycle.MutableLiveData;
import com.google.mlkit.common.sdkinternal.zzb;
import com.miteksystems.misnap.camera.frameproducers.FrameProducer;
import com.miteksystems.misnap.camera.requirements.CameraSelectorFilter;
import com.miteksystems.misnap.core.LiveDataUtil;
import com.miteksystems.misnap.core.MiSnapCameraInfo;
import com.miteksystems.misnap.core.MiSnapSettings;
import com.withpersona.sdk2.camera.camera2.Camera2Manager$start$1;
import java.io.InputStream;
import kotlin.Unit;
import kotlin.io.ByteStreamsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import net.idrnd.face.iad.capture.internal.e3;

/* loaded from: classes4.dex */
public final class FrameLoader implements FrameProducer {
    public final MiSnapSettings.Camera.Advanced.FrameInjection a;
    public final MutableLiveData b;
    public final MutableLiveData c;
    public final MutableLiveData d;
    public final MutableLiveData e;
    public final MutableLiveData f;
    public final MutableLiveData g;
    public final Handler i;
    public final byte[] j;
    public Bitmap l;
    public final MiSnapCameraInfo m;
    public boolean n;
    public final a o;
    public boolean p;

    public final class d extends Lambda implements Function0 {
        public static final d a = new d(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Object invoke() {
            return Unit.INSTANCE;
        }
    }

    public FrameLoader(Context context, MiSnapSettings.Camera.Advanced.FrameInjection frameInjection) {
        context.getClass();
        frameInjection.getClass();
        this.a = frameInjection;
        this.b = new MutableLiveData();
        this.c = new MutableLiveData();
        this.d = new MutableLiveData();
        this.e = new MutableLiveData();
        this.f = new MutableLiveData();
        this.g = new MutableLiveData();
        this.i = new Handler(Looper.getMainLooper());
        InputStream openRawResource = context.getResources().openRawResource(frameInjection.a);
        openRawResource.getClass();
        byte[] readBytes = ByteStreamsKt.readBytes(openRawResource);
        this.j = readBytes;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(readBytes, 0, readBytes.length);
        decodeByteArray.getClass();
        MiSnapCameraInfo miSnapCameraInfo = frameInjection.c;
        this.m = miSnapCameraInfo == null ? new MiSnapCameraInfo(true, true, true, new Size(decodeByteArray.getWidth(), decodeByteArray.getHeight()), new Size(decodeByteArray.getWidth(), decodeByteArray.getHeight()), new Size(decodeByteArray.getWidth(), decodeByteArray.getHeight()), "LEVEL_3", "BACK", new Size(decodeByteArray.getWidth(), decodeByteArray.getHeight()), new Size(decodeByteArray.getWidth(), decodeByteArray.getHeight())) : miSnapCameraInfo;
        this.n = true;
        this.o = a(new e3(this, 2));
        Matrix matrix = new Matrix();
        matrix.postRotate(frameInjection.b);
        Bitmap createBitmap = Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, false);
        createBitmap.getClass();
        this.l = createBitmap;
    }

    public final a a(Function0 function0) {
        MiSnapCameraInfo miSnapCameraInfo = this.m;
        return new a(new Size(miSnapCameraInfo.e.getWidth(), miSnapCameraInfo.e.getHeight()), this.a.b, this.j, function0);
    }

    public final void a$1() {
        if (this.p) {
            return;
        }
        FrameProducer.Event.CameraReady cameraReady = FrameProducer.Event.CameraReady.INSTANCE;
        MutableLiveData mutableLiveData = this.b;
        if (Recorder$$ExternalSyntheticOutline1.m(mutableLiveData)) {
            mutableLiveData.setValue(cameraReady);
        } else {
            mutableLiveData.postValue(cameraReady);
        }
        this.p = true;
    }

    @Override // com.miteksystems.misnap.camera.frameproducers.FrameProducer
    public final MutableLiveData getFocusingEvents() {
        return this.c;
    }

    @Override // com.miteksystems.misnap.camera.frameproducers.FrameProducer
    public final MutableLiveData getFrameProducerEvents() {
        return this.b;
    }

    @Override // com.miteksystems.misnap.camera.frameproducers.FrameProducer
    public final MutableLiveData getPictureFrames() {
        return this.f;
    }

    @Override // com.miteksystems.misnap.camera.frameproducers.FrameProducer
    public final MutableLiveData getPreviewFrames() {
        return this.e;
    }

    @Override // com.miteksystems.misnap.camera.frameproducers.FrameProducer
    public final MutableLiveData getTorchEvents() {
        return this.d;
    }

    @Override // com.miteksystems.misnap.camera.frameproducers.FrameProducer
    public final MutableLiveData getVideoRecordings() {
        return this.g;
    }

    @Override // com.miteksystems.misnap.camera.frameproducers.FrameProducer
    public final void openCameraInstance(CameraSelectorFilter cameraSelectorFilter) {
        FrameProducer.Event.CameraInitialized cameraInitialized = new FrameProducer.Event.CameraInitialized(this.m);
        MutableLiveData mutableLiveData = this.b;
        if (Recorder$$ExternalSyntheticOutline1.m(mutableLiveData)) {
            mutableLiveData.setValue(cameraInitialized);
        } else {
            mutableLiveData.postValue(cameraInitialized);
        }
    }

    @Override // com.miteksystems.misnap.camera.frameproducers.FrameProducer
    public final void release() {
        this.i.removeCallbacksAndMessages(null);
        this.p = false;
        LiveDataUtil.updateValue(this.b, null);
        Boolean bool = Boolean.FALSE;
        LiveDataUtil.updateValue(this.c, bool);
        LiveDataUtil.updateValue(this.f, null);
        LiveDataUtil.updateValue(this.e, null);
        LiveDataUtil.updateValue(this.d, bool);
    }

    @Override // com.miteksystems.misnap.camera.frameproducers.FrameProducer
    public final void requestAutoFocus(MeteringPoint meteringPoint) {
        Boolean bool = Boolean.TRUE;
        MutableLiveData mutableLiveData = this.c;
        if (Recorder$$ExternalSyntheticOutline1.m(mutableLiveData)) {
            mutableLiveData.setValue(bool);
        } else {
            mutableLiveData.postValue(bool);
        }
        Boolean bool2 = Boolean.FALSE;
        if (Looper.getMainLooper().isCurrentThread()) {
            mutableLiveData.setValue(bool2);
        } else {
            mutableLiveData.postValue(bool2);
        }
    }

    @Override // com.miteksystems.misnap.camera.frameproducers.FrameProducer
    public final void setTorchEnabled(boolean z, Function1 function1) {
        Boolean valueOf = Boolean.valueOf(z);
        MutableLiveData mutableLiveData = this.d;
        if (Recorder$$ExternalSyntheticOutline1.m(mutableLiveData)) {
            mutableLiveData.setValue(valueOf);
        } else {
            mutableLiveData.postValue(valueOf);
        }
        if (function1 != null) {
            function1.invoke(Boolean.TRUE);
        }
    }

    @Override // com.miteksystems.misnap.camera.frameproducers.FrameProducer
    public final void startPreview(SurfaceHolder surfaceHolder, boolean z) {
        surfaceHolder.getClass();
        a$1();
        int i = 2;
        if (surfaceHolder.getSurface() == null || !surfaceHolder.getSurface().isValid()) {
            surfaceHolder.addCallback(new Camera2Manager$start$1(this, i));
            return;
        }
        Surface surface = surfaceHolder.getSurface();
        surface.getClass();
        FrameProducer.DefaultImpls.startPreview$default((FrameProducer) this, surface, false, 2, (Object) null);
    }

    @Override // com.miteksystems.misnap.camera.frameproducers.FrameProducer
    public final void startVideoRecording() {
    }

    @Override // com.miteksystems.misnap.camera.frameproducers.FrameProducer
    public final void stopVideoRecording() {
        byte[] bArr = {0};
        MutableLiveData mutableLiveData = this.g;
        if (Recorder$$ExternalSyntheticOutline1.m(mutableLiveData)) {
            mutableLiveData.setValue(bArr);
        } else {
            mutableLiveData.postValue(bArr);
        }
    }

    @Override // com.miteksystems.misnap.camera.frameproducers.FrameProducer
    public final void takePicture() {
        a a = a(d.a);
        MutableLiveData mutableLiveData = this.f;
        if (Recorder$$ExternalSyntheticOutline1.m(mutableLiveData)) {
            mutableLiveData.setValue(a);
        } else {
            mutableLiveData.postValue(a);
        }
    }

    @Override // com.miteksystems.misnap.camera.frameproducers.FrameProducer
    public final void startPreview(Surface surface, boolean z) {
        surface.getClass();
        a$1();
        this.i.postDelayed(new zzb(this, surface, false, 20), 500L);
    }

    @Override // com.miteksystems.misnap.camera.frameproducers.FrameProducer
    public final void startPreview(Preview.SurfaceProvider surfaceProvider, boolean z) {
        surfaceProvider.getClass();
    }
}
