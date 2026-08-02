package io.flutter.embedding.engine.renderer;

import android.hardware.SyncFence;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.view.Surface;
import defpackage.jif;
import defpackage.vuy0;
import defpackage.wuy0;
import defpackage.xsr;
import io.flutter.view.TextureRegistry$ImageConsumer;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes4.dex */
final class FlutterRenderer$ImageReaderSurfaceProducer implements TextureRegistry$SurfaceProducer, TextureRegistry$ImageConsumer, vuy0 {
    private static final boolean CLEANUP_ON_MEMORY_PRESSURE = true;
    private static final int MAX_DEQUEUED_IMAGES = 2;
    private static final int MAX_IMAGES = 6;
    private static final String TAG = "ImageReaderSurfaceProducer";
    private static final boolean VERBOSE_LOGS = false;
    private static final boolean trimOnMemoryPressure = true;
    private final long id;
    private boolean released;
    final /* synthetic */ f this$0;
    private boolean ignoringFence = false;
    private int requestedWidth = 1;
    private int requestedHeight = 1;
    private boolean createNewReader = true;
    private boolean notifiedDestroy = false;
    private long lastDequeueTime = 0;
    private long lastQueueTime = 0;
    private long lastScheduleTime = 0;
    private int numTrims = 0;
    private final Object lock = new Object();
    private final ArrayDeque<e> imageReaderQueue = new ArrayDeque<>();
    private final HashMap<ImageReader, e> perImageReaders = new HashMap<>();
    private ArrayList<c> lastDequeuedImage = new ArrayList<>();
    private e lastReaderDequeuedFrom = null;
    private wuy0 callback = null;

    public FlutterRenderer$ImageReaderSurfaceProducer(f fVar, long j) {
        this.this$0 = fVar;
        this.id = j;
    }

    private void cleanup() {
        synchronized (this.lock) {
            try {
                for (e eVar : this.perImageReaders.values()) {
                    if (this.lastReaderDequeuedFrom == eVar) {
                        this.lastReaderDequeuedFrom = null;
                    }
                    eVar.c = true;
                    eVar.a.close();
                    eVar.b.clear();
                }
                this.perImageReaders.clear();
                if (this.lastDequeuedImage.size() > 0) {
                    Iterator<c> it = this.lastDequeuedImage.iterator();
                    while (it.hasNext()) {
                        it.next().a.close();
                    }
                    this.lastDequeuedImage.clear();
                }
                e eVar2 = this.lastReaderDequeuedFrom;
                if (eVar2 != null) {
                    eVar2.c = true;
                    eVar2.a.close();
                    eVar2.b.clear();
                    this.lastReaderDequeuedFrom = null;
                }
                this.imageReaderQueue.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private ImageReader createImageReader29() {
        return ImageReader.newInstance(this.requestedWidth, this.requestedHeight, 34, 6, 256L);
    }

    private ImageReader createImageReader33() {
        ImageReader build;
        jif.s();
        ImageReader.Builder i = jif.i(this.requestedWidth, this.requestedHeight);
        i.setMaxImages(6);
        i.setImageFormat(34);
        i.setUsage(256L);
        build = i.build();
        return build;
    }

    private e getActiveReader() {
        synchronized (this.lock) {
            try {
                if (!this.createNewReader) {
                    e peekLast = this.imageReaderQueue.peekLast();
                    if (peekLast.a.getSurface().isValid()) {
                        return peekLast;
                    }
                }
                this.createNewReader = false;
                return getOrCreatePerImageReader(createImageReader());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private e getOrCreatePerImageReader(ImageReader imageReader) {
        e eVar = this.perImageReaders.get(imageReader);
        if (eVar != null) {
            return eVar;
        }
        e createPerImageReader = createPerImageReader(imageReader);
        this.perImageReaders.put(imageReader, createPerImageReader);
        this.imageReaderQueue.add(createPerImageReader);
        return createPerImageReader;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$dequeueImage$0() {
        if (this.released) {
            return;
        }
        this.this$0.a.scheduleFrame();
    }

    private void maybeWaitOnFence(Image image) {
        if (image == null || this.ignoringFence) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            waitOnFence(image);
        } else {
            this.ignoringFence = true;
        }
    }

    private void releaseInternal() {
        cleanup();
        this.released = true;
        this.this$0.e(this);
        this.this$0.g.remove(this);
    }

    private void waitOnFence(Image image) {
        SyncFence fence;
        try {
            fence = image.getFence();
            fence.awaitForever();
        } catch (IOException unused) {
        }
    }

    @Override // io.flutter.view.TextureRegistry$ImageConsumer
    public Image acquireLatestImage() {
        c dequeueImage = dequeueImage();
        if (dequeueImage == null) {
            return null;
        }
        Image image = dequeueImage.a;
        maybeWaitOnFence(image);
        return image;
    }

    public ImageReader createImageReader() {
        return Build.VERSION.SDK_INT >= 33 ? createImageReader33() : createImageReader29();
    }

    public e createPerImageReader(ImageReader imageReader) {
        return new e(this, imageReader);
    }

    public double deltaMillis(long j) {
        return j / 1000000.0d;
    }

    public c dequeueImage() {
        c cVar;
        boolean z;
        ArrayList<c> arrayList;
        synchronized (this.lock) {
            try {
                Iterator<e> it = this.imageReaderQueue.iterator();
                cVar = null;
                while (true) {
                    z = false;
                    if (!it.hasNext()) {
                        break;
                    }
                    e next = it.next();
                    ArrayDeque arrayDeque = next.b;
                    c cVar2 = arrayDeque.isEmpty() ? null : (c) arrayDeque.removeFirst();
                    if (cVar2 == null) {
                        cVar = cVar2;
                    } else {
                        while (true) {
                            int size = this.lastDequeuedImage.size();
                            arrayList = this.lastDequeuedImage;
                            if (size <= 2) {
                                break;
                            }
                            arrayList.remove(0).a.close();
                        }
                        arrayList.add(cVar2);
                        this.lastReaderDequeuedFrom = next;
                        cVar = cVar2;
                    }
                }
                pruneImageReaderQueue();
                Iterator<e> it2 = this.imageReaderQueue.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (!it2.next().b.isEmpty()) {
                        z = true;
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            this.this$0.e.post(new Runnable() { // from class: io.flutter.embedding.engine.renderer.b
                @Override // java.lang.Runnable
                public final void run() {
                    FlutterRenderer$ImageReaderSurfaceProducer.this.lambda$dequeueImage$0();
                }
            });
        }
        return cVar;
    }

    public void disableFenceForTest() {
        this.ignoringFence = true;
    }

    public void finalize() throws Throwable {
        try {
            if (this.released) {
                return;
            }
            releaseInternal();
            f fVar = this.this$0;
            fVar.e.post(new xsr(this.id, fVar.a, 0));
        } finally {
            super.finalize();
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public Surface getForcedNewSurface() {
        this.createNewReader = true;
        return getSurface();
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public int getHeight() {
        return this.requestedHeight;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public Surface getSurface() {
        return getActiveReader().a.getSurface();
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public int getWidth() {
        return this.requestedWidth;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public boolean handlesCropAndRotation() {
        return false;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public long id() {
        return this.id;
    }

    public int numImageReaders() {
        int size;
        synchronized (this.lock) {
            size = this.imageReaderQueue.size();
        }
        return size;
    }

    public int numImages() {
        int i;
        synchronized (this.lock) {
            try {
                Iterator<e> it = this.imageReaderQueue.iterator();
                i = 0;
                while (it.hasNext()) {
                    i += it.next().b.size();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    public int numTrims() {
        int i;
        synchronized (this.lock) {
            i = this.numTrims;
        }
        return i;
    }

    public void onImage(ImageReader imageReader, Image image) {
        c cVar;
        synchronized (this.lock) {
            e orCreatePerImageReader = getOrCreatePerImageReader(imageReader);
            ArrayDeque arrayDeque = orCreatePerImageReader.b;
            if (orCreatePerImageReader.c) {
                cVar = null;
            } else {
                FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer = orCreatePerImageReader.d;
                System.nanoTime();
                c cVar2 = new c(flutterRenderer$ImageReaderSurfaceProducer, image);
                arrayDeque.add(cVar2);
                while (arrayDeque.size() > 2) {
                    ((c) arrayDeque.removeFirst()).a.close();
                }
                cVar = cVar2;
            }
        }
        if (cVar == null) {
            return;
        }
        this.this$0.a.scheduleFrame();
    }

    @Override // defpackage.vuy0
    public void onTrimMemory(int i) {
        if (i < 40) {
            return;
        }
        synchronized (this.lock) {
            this.numTrims++;
        }
        wuy0 wuy0Var = this.callback;
        if (wuy0Var != null) {
            this.notifiedDestroy = true;
            wuy0Var.onSurfaceCleanup();
        }
        cleanup();
        this.createNewReader = true;
    }

    public int pendingDequeuedImages() {
        return this.lastDequeuedImage.size();
    }

    public void pruneImageReaderQueue() {
        e peekFirst;
        while (this.imageReaderQueue.size() > 1 && (peekFirst = this.imageReaderQueue.peekFirst()) != null) {
            ImageReader imageReader = peekFirst.a;
            ArrayDeque arrayDeque = peekFirst.b;
            if (!arrayDeque.isEmpty() || peekFirst.d.lastReaderDequeuedFrom == peekFirst) {
                return;
            }
            this.imageReaderQueue.removeFirst();
            this.perImageReaders.remove(imageReader);
            peekFirst.c = true;
            imageReader.close();
            arrayDeque.clear();
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public void release() {
        if (this.released) {
            return;
        }
        releaseInternal();
        f fVar = this.this$0;
        fVar.a.unregisterTexture(this.id);
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public void scheduleFrame() {
        this.this$0.a.scheduleFrame();
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public void setCallback(wuy0 wuy0Var) {
        this.callback = wuy0Var;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public void setSize(int i, int i2) {
        int max = Math.max(1, i);
        int max2 = Math.max(1, i2);
        if (this.requestedWidth == max && this.requestedHeight == max2) {
            return;
        }
        this.createNewReader = true;
        this.requestedHeight = max2;
        this.requestedWidth = max;
    }
}
