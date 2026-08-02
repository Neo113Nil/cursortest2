package com.squareup.cash.filament;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Choreographer;
import android.view.TextureView;
import android.widget.FrameLayout;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.media3.common.FlagSet;
import androidx.media3.common.util.WakeLockManager;
import androidx.media3.extractor.mkv.Sniffer;
import androidx.paging.PagingConfig;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.filament.Box;
import com.google.android.filament.Camera;
import com.google.android.filament.ColorGrading;
import com.google.android.filament.Engine;
import com.google.android.filament.EntityManager;
import com.google.android.filament.Filament;
import com.google.android.filament.IndexBuffer;
import com.google.android.filament.Material;
import com.google.android.filament.MaterialInstance;
import com.google.android.filament.RenderableManager;
import com.google.android.filament.Renderer;
import com.google.android.filament.Scene;
import com.google.android.filament.SwapChain;
import com.google.android.filament.Texture;
import com.google.android.filament.ToneMapper;
import com.google.android.filament.VertexBuffer;
import com.google.android.filament.View;
import com.google.android.filament.android.TextureHelper;
import com.google.android.filament.android.UiHelper$TextureViewHandler;
import com.knotapi.knot.webview.KnotView$$ExternalSyntheticLambda1;
import com.squareup.cash.filament.engine.FilamentDisplayHelper;
import com.squareup.cash.filament.util.Mesh;
import com.squareup.cash.filament.util.Part;
import com.squareup.cash.graphics.backend.engine.TextureType;
import com.squareup.cash.graphics.views.TextureViewFpsTracker;
import com.stripe.android.utils.MapUtilsKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.io.ByteStreamsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import net.idrnd.misnap.iad.IadFrame;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes6.dex */
public class BaseModelView extends FrameLayout {
    public static final Companion Companion = new Companion();
    public static final View.FogOptions DEFAULT_FOG_OPTIONS;
    public Camera camera;
    public Integer cameraEntity;
    public double cameraFov;
    public Camera.Fov cameraFovDirection;
    public final Choreographer choreographer;
    public float contrast;
    public final FilamentDisplayHelper displayHelper;
    public Engine engine;
    public final EntityManager entityManager;
    public final double[] eyePos;
    public View.FogOptions fogOptions;
    public TextureViewFpsTracker fpsTracker;
    public FrameCallback frameScheduler;
    public Function0 onFirstFrame;
    public boolean persistEngine;
    public final PagingConfig renderSessionTracker;
    public Renderer renderer;
    public float saturation;
    public Scene scene;
    public SwapChain swapChain;
    public final double[] target;
    public final TextureView textureView;
    public final WakeLockManager uiHelper;
    public final double[] upward;
    public float vibrance;
    public View view;

    public final class Companion {
    }

    public final class FrameCallback implements Choreographer.FrameCallback {
        public boolean firstFrame = true;
        public final int sessionGeneration;

        public FrameCallback(int i) {
            this.sessionGeneration = i;
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            int i = this.sessionGeneration;
            BaseModelView baseModelView = BaseModelView.this;
            if (BaseModelView.access$isActiveRenderSession(baseModelView, i)) {
                if (!baseModelView.uiHelper.enabled) {
                    baseModelView.scheduleRedraw();
                    return;
                }
                SwapChain swapChain = baseModelView.swapChain;
                if (swapChain == null) {
                    return;
                }
                Camera camera = baseModelView.getCamera();
                double[] dArr = baseModelView.eyePos;
                double d = dArr[0];
                double d2 = dArr[1];
                double d3 = dArr[2];
                double[] dArr2 = baseModelView.target;
                double d4 = dArr2[0];
                double d5 = dArr2[1];
                double d6 = dArr2[2];
                double[] dArr3 = baseModelView.upward;
                camera.lookAt(d, d2, d3, d4, d5, d6, dArr3[0], dArr3[1], dArr3[2]);
                Renderer renderer = baseModelView.renderer;
                if (renderer == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("renderer");
                    throw null;
                }
                if (!renderer.beginFrame(swapChain, j)) {
                    baseModelView.scheduleRedraw();
                    return;
                }
                Renderer renderer2 = baseModelView.renderer;
                if (renderer2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("renderer");
                    throw null;
                }
                View view = baseModelView.view;
                if (view == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("view");
                    throw null;
                }
                renderer2.render(view);
                Renderer renderer3 = baseModelView.renderer;
                if (renderer3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("renderer");
                    throw null;
                }
                renderer3.endFrame();
                if (this.firstFrame && baseModelView.sceneInitialized()) {
                    this.firstFrame = false;
                    baseModelView.post(new KnotView$$ExternalSyntheticLambda1(baseModelView, 24));
                }
            }
        }
    }

    static {
        View.FogOptions fogOptions = new View.FogOptions();
        fogOptions.enabled = true;
        fogOptions.height = RecyclerView.DECELERATION_RATE;
        fogOptions.color = new float[]{RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE};
        fogOptions.maximumOpacity = RecyclerView.DECELERATION_RATE;
        DEFAULT_FOG_OPTIONS = fogOptions;
        try {
            int i = Filament.$r8$clinit;
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseModelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.choreographer = Choreographer.getInstance();
        this.renderSessionTracker = new PagingConfig();
        TextureView textureView = new TextureView(context);
        addView(textureView);
        this.textureView = textureView;
        this.displayHelper = new FilamentDisplayHelper(context);
        WakeLockManager wakeLockManager = new WakeLockManager();
        wakeLockManager.stayAwake = false;
        this.uiHelper = wakeLockManager;
        this.eyePos = new double[]{0.0d, 0.0d, 4.0d};
        this.target = new double[]{0.0d, 0.0d, 0.0d};
        this.upward = new double[]{0.0d, 1.0d, 0.0d};
        EntityManager entityManager = EntityManager.Holder.INSTANCE;
        entityManager.getClass();
        this.entityManager = entityManager;
        this.cameraFovDirection = Camera.Fov.HORIZONTAL;
        this.cameraFov = 45.0d;
        this.fogOptions = DEFAULT_FOG_OPTIONS;
        this.contrast = 1.0f;
        this.vibrance = 1.0f;
        this.saturation = 1.0f;
        setBackgroundColor(0);
    }

    public static final boolean access$isActiveRenderSession(BaseModelView baseModelView, int i) {
        if (baseModelView.engine == null || !baseModelView.getEngine().isValid()) {
            return false;
        }
        PagingConfig pagingConfig = baseModelView.renderSessionTracker;
        if (i != 0) {
            return pagingConfig.prefetchDistance == i;
        }
        pagingConfig.getClass();
        return false;
    }

    public static /* synthetic */ void setCameraPosition$default(BaseModelView baseModelView, double d, double d2, double d3, int i, Object obj) {
        if (obj != null) {
            a$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: setCameraPosition");
            return;
        }
        if ((i & 1) != 0) {
            d = baseModelView.eyePos[0];
        }
        double d4 = d;
        if ((i & 2) != 0) {
            d2 = baseModelView.eyePos[1];
        }
        double d5 = d2;
        if ((i & 4) != 0) {
            d3 = baseModelView.eyePos[2];
        }
        baseModelView.setCameraPosition(d4, d5, d3);
    }

    public final Material createMaterial(ByteBuffer byteBuffer) {
        long nBuilderBuild;
        byteBuffer.getClass();
        nBuilderBuild = Material.nBuilderBuild(getEngine().getNativeObject(), byteBuffer, byteBuffer.remaining(), 0, 1, 0);
        if (nBuilderBuild != 0) {
            return new Material(nBuilderBuild);
        }
        a$$ExternalSyntheticBUOutline0.m$1("Couldn't create Material");
        return null;
    }

    public final Mesh createMesh(InputStream inputStream, MaterialInstance materialInstance) {
        long readUIntLE;
        long readUIntLE2;
        long readUIntLE3;
        Map map;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        Box box;
        long j6;
        long j7;
        long j8;
        long j9;
        long readUIntLE4;
        Object obj;
        long j10;
        long j11;
        long j12;
        String str;
        long j13;
        long nCreateBuilder;
        long nBuilderBuild;
        long nCreateBuilder2;
        Mesh mesh;
        long nBuilderBuild2;
        long nCreateBuilder3;
        long j14;
        boolean nBuilderBuild3;
        Object obj2;
        inputStream.getClass();
        materialInstance.getClass();
        Map mapOf = MapsKt__MapsJVMKt.mapOf(new Pair("DefaultMaterial", materialInstance));
        Engine engine = getEngine();
        mapOf.getClass();
        Box box2 = new Box();
        byte[] bArr = new byte[8];
        inputStream.read(bArr);
        Charset forName = Charset.forName("UTF-8");
        forName.getClass();
        if (new String(bArr, forName).equals("FILAMESH")) {
            MapUtilsKt.readUIntLE(inputStream);
            readUIntLE = MapUtilsKt.readUIntLE(inputStream);
            Box box3 = new Box(MapUtilsKt.readFloat32LE(inputStream), MapUtilsKt.readFloat32LE(inputStream), MapUtilsKt.readFloat32LE(inputStream), MapUtilsKt.readFloat32LE(inputStream), MapUtilsKt.readFloat32LE(inputStream), MapUtilsKt.readFloat32LE(inputStream));
            long readUIntLE5 = MapUtilsKt.readUIntLE(inputStream);
            readUIntLE2 = MapUtilsKt.readUIntLE(inputStream);
            long readUIntLE6 = MapUtilsKt.readUIntLE(inputStream);
            long readUIntLE7 = MapUtilsKt.readUIntLE(inputStream);
            long readUIntLE8 = MapUtilsKt.readUIntLE(inputStream);
            long readUIntLE9 = MapUtilsKt.readUIntLE(inputStream);
            long readUIntLE10 = MapUtilsKt.readUIntLE(inputStream);
            long readUIntLE11 = MapUtilsKt.readUIntLE(inputStream);
            long readUIntLE12 = MapUtilsKt.readUIntLE(inputStream);
            long readUIntLE13 = MapUtilsKt.readUIntLE(inputStream);
            long readUIntLE14 = MapUtilsKt.readUIntLE(inputStream);
            long readUIntLE15 = MapUtilsKt.readUIntLE(inputStream);
            long readUIntLE16 = MapUtilsKt.readUIntLE(inputStream);
            readUIntLE3 = MapUtilsKt.readUIntLE(inputStream);
            long readUIntLE17 = MapUtilsKt.readUIntLE(inputStream);
            map = mapOf;
            j = readUIntLE10;
            j2 = readUIntLE11;
            j3 = readUIntLE12;
            j4 = readUIntLE13;
            j5 = readUIntLE14;
            box = box3;
            j6 = readUIntLE6;
            j7 = readUIntLE7;
            j8 = readUIntLE8;
            j9 = readUIntLE9;
            readUIntLE4 = MapUtilsKt.readUIntLE(inputStream);
            obj = "DefaultMaterial";
            j10 = readUIntLE5;
            j11 = readUIntLE15;
            j12 = readUIntLE16;
            str = "UTF-8";
            j13 = readUIntLE17;
        } else {
            Log.e("Filament", "Invalid filamesh file.");
            map = mapOf;
            obj = "DefaultMaterial";
            box = box2;
            str = "UTF-8";
            j11 = 0;
            readUIntLE = 0;
            j13 = 0;
            j12 = 0;
            readUIntLE2 = 0;
            readUIntLE4 = 0;
            j10 = 0;
            j9 = 0;
            j8 = 0;
            j7 = 0;
            j6 = 0;
            readUIntLE3 = 0;
            j = 0;
            j2 = 0;
            j3 = 0;
            j4 = 0;
            j5 = 0;
        }
        ReadableByteChannel newChannel = Channels.newChannel(inputStream);
        newChannel.getClass();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect((int) j12);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        allocateDirect.order(byteOrder);
        newChannel.read(allocateDirect);
        allocateDirect.flip();
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect((int) readUIntLE4);
        allocateDirect2.order(byteOrder);
        newChannel.read(allocateDirect2);
        allocateDirect2.flip();
        int i = (int) readUIntLE;
        ArrayList arrayList = new ArrayList(i);
        int i2 = 0;
        while (i2 < i) {
            Part part = new Part();
            part.offset = MapUtilsKt.readUIntLE(inputStream);
            part.indexCount = MapUtilsKt.readUIntLE(inputStream);
            part.minIndex = MapUtilsKt.readUIntLE(inputStream);
            part.maxIndex = MapUtilsKt.readUIntLE(inputStream);
            part.materialID = MapUtilsKt.readUIntLE(inputStream);
            new Box(MapUtilsKt.readFloat32LE(inputStream), MapUtilsKt.readFloat32LE(inputStream), MapUtilsKt.readFloat32LE(inputStream), MapUtilsKt.readFloat32LE(inputStream), MapUtilsKt.readFloat32LE(inputStream), MapUtilsKt.readFloat32LE(inputStream));
            arrayList.add(part);
            i2++;
            allocateDirect = allocateDirect;
        }
        ByteBuffer byteBuffer = allocateDirect;
        int readUIntLE18 = (int) MapUtilsKt.readUIntLE(inputStream);
        ArrayList arrayList2 = new ArrayList(readUIntLE18);
        int i3 = 0;
        while (i3 < readUIntLE18) {
            int i4 = i3;
            String str2 = str;
            byte[] bArr2 = new byte[(int) MapUtilsKt.readUIntLE(inputStream)];
            inputStream.read(bArr2);
            int i5 = i;
            inputStream.skip(1L);
            Charset forName2 = Charset.forName(str2);
            forName2.getClass();
            arrayList2.add(new String(bArr2, forName2));
            i3 = i4 + 1;
            i = i5;
            str = str2;
            arrayList = arrayList;
        }
        int i6 = i;
        ArrayList arrayList3 = arrayList;
        int i7 = readUIntLE3 != 0 ? 1 : 2;
        nCreateBuilder = IndexBuffer.nCreateBuilder();
        new IadFrame(nCreateBuilder, 6);
        IndexBuffer.nBuilderBufferType(nCreateBuilder, CameraSelector$$ExternalSyntheticOutline0.ordinal(i7));
        IndexBuffer.nBuilderIndexCount(nCreateBuilder, (int) j13);
        nBuilderBuild = IndexBuffer.nBuilderBuild(nCreateBuilder, engine.getNativeObject());
        if (nBuilderBuild == 0) {
            a$$ExternalSyntheticBUOutline0.m$1("Couldn't create IndexBuffer");
            return null;
        }
        IndexBuffer indexBuffer = new IndexBuffer();
        indexBuffer.mNativeObject = nBuilderBuild;
        indexBuffer.setBuffer(engine, allocateDirect2);
        long j15 = j10 & 2;
        int i8 = j15 != 0 ? 10 : 24;
        nCreateBuilder2 = VertexBuffer.nCreateBuilder();
        new IadFrame(nCreateBuilder2, 12);
        VertexBuffer.nBuilderBufferCount(nCreateBuilder2, 1);
        VertexBuffer.nBuilderVertexCount(nCreateBuilder2, (int) j11);
        VertexBuffer.nBuilderNormalized(nCreateBuilder2, 2, true);
        VertexBuffer.nBuilderNormalized(nCreateBuilder2, 1, true);
        VertexBuffer.nBuilderAttribute(nCreateBuilder2, 0, 0, 25, (int) readUIntLE2, (int) j6);
        VertexBuffer.nBuilderAttribute(nCreateBuilder2, 1, 0, 11, (int) j7, (int) j8);
        VertexBuffer.nBuilderAttribute(nCreateBuilder2, 2, 0, 7, (int) j9, (int) j);
        VertexBuffer.nBuilderAttribute(nCreateBuilder2, 3, 0, CameraSelector$$ExternalSyntheticOutline0.ordinal(i8), (int) j2, (int) j3);
        VertexBuffer.nBuilderNormalized(nCreateBuilder2, 3, j15 != 0);
        long j16 = j4;
        if (j16 != BodyPartID.bodyIdMax) {
            long j17 = j5;
            mesh = null;
            if (j17 != BodyPartID.bodyIdMax) {
                VertexBuffer.nBuilderAttribute(nCreateBuilder2, 4, 0, CameraSelector$$ExternalSyntheticOutline0.ordinal(i8), (int) j16, (int) j17);
                VertexBuffer.nBuilderNormalized(nCreateBuilder2, 4, j15 != 0);
            }
        } else {
            mesh = null;
        }
        nBuilderBuild2 = VertexBuffer.nBuilderBuild(nCreateBuilder2, engine.getNativeObject());
        if (nBuilderBuild2 == 0) {
            a$$ExternalSyntheticBUOutline0.m$1("Couldn't create VertexBuffer");
            return mesh;
        }
        VertexBuffer vertexBuffer = new VertexBuffer();
        vertexBuffer.mNativeObject = nBuilderBuild2;
        vertexBuffer.setBufferAt(engine, byteBuffer);
        nCreateBuilder3 = RenderableManager.nCreateBuilder(i6);
        new IadFrame(nCreateBuilder3, 9);
        Box box4 = box;
        float[] fArr = (float[]) box4.mCenter;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float[] fArr2 = (float[]) box4.mHalfExtent;
        RenderableManager.nBuilderBoundingBox(nCreateBuilder3, f, f2, f3, fArr2[0], fArr2[1], fArr2[2]);
        int i9 = 0;
        while (true) {
            j14 = nCreateBuilder3;
            if (i9 >= i6) {
                break;
            }
            ArrayList arrayList4 = arrayList3;
            int i10 = i9;
            RenderableManager.nBuilderGeometry(j14, i10, 4, vertexBuffer.getNativeObject(), indexBuffer.getNativeObject(), (int) ((Part) arrayList4.get(i9)).offset, (int) ((Part) arrayList4.get(i9)).minIndex, (int) ((Part) arrayList4.get(i9)).maxIndex, (int) ((Part) arrayList4.get(i9)).indexCount);
            nCreateBuilder3 = j14;
            Map map2 = map;
            MaterialInstance materialInstance2 = (MaterialInstance) map2.get(arrayList2.get((int) ((Part) arrayList4.get(i10)).materialID));
            if (materialInstance2 != null) {
                RenderableManager.nBuilderMaterial(nCreateBuilder3, i10, materialInstance2.getNativeObject());
                obj2 = obj;
            } else {
                obj2 = obj;
                Object obj3 = map2.get(obj2);
                obj3.getClass();
                RenderableManager.nBuilderMaterial(nCreateBuilder3, i10, ((MaterialInstance) obj3).getNativeObject());
            }
            i9 = i10 + 1;
            arrayList3 = arrayList4;
            obj = obj2;
            map = map2;
        }
        int create = EntityManager.Holder.INSTANCE.create();
        nBuilderBuild3 = RenderableManager.nBuilderBuild(j14, engine.getNativeObject(), create);
        if (!nBuilderBuild3) {
            a$$ExternalSyntheticBUOutline0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(create, "Couldn't create Renderable component for entity ", ", see log."));
            return mesh;
        }
        Mesh mesh2 = new Mesh(create, indexBuffer, vertexBuffer, box4);
        getScene().addEntity(create);
        return mesh2;
    }

    public final Texture createTexture(int i, Bitmap bitmap, TextureType textureType) {
        long nCreateBuilder;
        int i2;
        long nBuilderBuild;
        bitmap.getClass();
        Engine engine = getEngine();
        nCreateBuilder = Texture.nCreateBuilder();
        new IadFrame(nCreateBuilder, 11);
        Texture.nBuilderWidth(nCreateBuilder, bitmap.getWidth());
        Texture.nBuilderHeight(nCreateBuilder, bitmap.getHeight());
        Texture.nBuilderSampler(nCreateBuilder, 0);
        int ordinal = textureType.ordinal();
        if (ordinal != 0) {
            i2 = 31;
            if (ordinal != 1 && ordinal != 2) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        } else {
            i2 = 32;
        }
        Texture.nBuilderFormat(nCreateBuilder, CameraSelector$$ExternalSyntheticOutline0.ordinal(i2));
        Texture.nBuilderLevels(nCreateBuilder, i);
        Texture.nBuilderUsage(nCreateBuilder, 536);
        nBuilderBuild = Texture.nBuilderBuild(nCreateBuilder, engine.getNativeObject());
        if (nBuilderBuild == 0) {
            a$$ExternalSyntheticBUOutline0.m$1("Couldn't create Texture");
            return null;
        }
        Texture texture = new Texture();
        texture.mNativeObject = nBuilderBuild;
        TextureHelper.setBitmap(engine, texture, bitmap);
        texture.generateMipmaps(engine);
        return texture;
    }

    public final void destroySwapChain(boolean z) {
        if (this.engine == null || !getEngine().isValid()) {
            this.swapChain = null;
            return;
        }
        SwapChain swapChain = this.swapChain;
        if (swapChain != null) {
            getEngine().destroySwapChain(swapChain);
            if (z) {
                getEngine().flushAndWait();
            }
            this.swapChain = null;
        }
    }

    public final Camera getCamera() {
        Camera camera = this.camera;
        if (camera != null) {
            return camera;
        }
        Intrinsics.throwUninitializedPropertyAccessException("camera");
        throw null;
    }

    public final Engine getEngine() {
        Engine engine = this.engine;
        if (engine != null) {
            return engine;
        }
        Intrinsics.throwUninitializedPropertyAccessException("engine");
        throw null;
    }

    public final Scene getScene() {
        Scene scene = this.scene;
        if (scene != null) {
            return scene;
        }
        Intrinsics.throwUninitializedPropertyAccessException("scene");
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.engine == null) {
            setEngine(Engine.create());
        }
        onEngineAttached();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.engine != null) {
            onEngineDetached();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onEngineAttached() {
        TextureViewFpsTracker textureViewFpsTracker;
        Renderer createRenderer = getEngine().createRenderer();
        if (createRenderer.mClearOptions == null) {
            FlagSet.Builder builder = new FlagSet.Builder(6);
            builder.flags = new float[]{RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE};
            builder.buildCalled = false;
            createRenderer.mClearOptions = builder;
        }
        FlagSet.Builder builder2 = createRenderer.mClearOptions;
        builder2.buildCalled = true;
        createRenderer.setClearOptions(builder2);
        this.renderer = createRenderer;
        setScene(getEngine().createScene());
        int create = this.entityManager.create();
        Integer valueOf = Integer.valueOf(create);
        Camera createCamera = getEngine().createCamera(create);
        createCamera.setExposure();
        setCamera(createCamera);
        this.cameraEntity = valueOf;
        View createView = getEngine().createView();
        this.view = createView;
        createView.setCamera(getCamera());
        View view = this.view;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
            throw null;
        }
        view.setScene(getScene());
        View view2 = this.view;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
            throw null;
        }
        view2.setFogOptions(this.fogOptions);
        View view3 = this.view;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
            throw null;
        }
        updateColorGrading(view3);
        PagingConfig pagingConfig = this.renderSessionTracker;
        pagingConfig.initialLoadSize = 0;
        int i = pagingConfig.pageSize + 1;
        pagingConfig.pageSize = i;
        pagingConfig.prefetchDistance = i;
        this.frameScheduler = new FrameCallback(i);
        Sniffer sniffer = new Sniffer(this, i, 26);
        WakeLockManager wakeLockManager = this.uiHelper;
        wakeLockManager.wakeLockHandler = sniffer;
        TextureView textureView = (TextureView) wakeLockManager.wakeLockManagerInternal;
        TextureView textureView2 = this.textureView;
        if (textureView != null) {
            if (textureView != textureView2) {
                UiHelper$TextureViewHandler uiHelper$TextureViewHandler = (UiHelper$TextureViewHandler) wakeLockManager.mainHandler;
                if (uiHelper$TextureViewHandler != null) {
                    uiHelper$TextureViewHandler.mTextureView.setSurfaceTextureListener(null);
                    wakeLockManager.mainHandler = null;
                }
                wakeLockManager.destroySwapChain();
            }
            textureViewFpsTracker = this.fpsTracker;
            if (textureViewFpsTracker == null) {
                textureView2.getClass();
                textureViewFpsTracker.parent = textureView2.getSurfaceTextureListener();
                textureView2.setSurfaceTextureListener(textureViewFpsTracker);
                return;
            }
            return;
        }
        wakeLockManager.wakeLockManagerInternal = textureView2;
        textureView2.setOpaque(wakeLockManager.stayAwake);
        wakeLockManager.mainHandler = new UiHelper$TextureViewHandler(wakeLockManager, textureView2);
        textureViewFpsTracker = this.fpsTracker;
        if (textureViewFpsTracker == null) {
        }
    }

    public void onEngineDetached() {
        FrameCallback frameCallback = this.frameScheduler;
        if (frameCallback != null) {
            Choreographer choreographer = this.choreographer;
            choreographer.getClass();
            choreographer.removeFrameCallback(frameCallback);
        }
        PagingConfig pagingConfig = this.renderSessionTracker;
        int i = pagingConfig.prefetchDistance;
        pagingConfig.prefetchDistance = 0;
        pagingConfig.initialLoadSize = i;
        WakeLockManager wakeLockManager = this.uiHelper;
        UiHelper$TextureViewHandler uiHelper$TextureViewHandler = (UiHelper$TextureViewHandler) wakeLockManager.mainHandler;
        if (uiHelper$TextureViewHandler != null) {
            uiHelper$TextureViewHandler.mTextureView.setSurfaceTextureListener(null);
        }
        wakeLockManager.destroySwapChain();
        wakeLockManager.wakeLockManagerInternal = null;
        wakeLockManager.mainHandler = null;
        destroySwapChain(true);
        View view = this.view;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
            throw null;
        }
        ColorGrading colorGrading = view.mColorGrading;
        if (colorGrading != null) {
            getEngine().destroyColorGrading(colorGrading);
        }
        Engine engine = getEngine();
        Renderer renderer = this.renderer;
        if (renderer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("renderer");
            throw null;
        }
        engine.destroyRenderer(renderer);
        Engine engine2 = getEngine();
        View view2 = this.view;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
            throw null;
        }
        engine2.destroyView(view2);
        getEngine().destroyScene(getScene());
        Integer num = this.cameraEntity;
        if (num != null) {
            getEngine().destroyCameraComponent(num.intValue());
        }
        Integer num2 = this.cameraEntity;
        if (num2 != null) {
            this.entityManager.destroy(num2.intValue());
        }
        this.cameraEntity = null;
        this.frameScheduler = null;
        if (pagingConfig.initialLoadSize == i) {
            pagingConfig.initialLoadSize = 0;
        }
        if (this.persistEngine) {
            return;
        }
        getEngine().destroy();
    }

    public final ByteBuffer readMaterial(String str) {
        InputStream open = getContext().getAssets().open(str.concat(".filamat"));
        try {
            open.getClass();
            ByteBuffer wrap = ByteBuffer.wrap(ByteStreamsKt.readBytes(open));
            wrap.getClass();
            open.close();
            return wrap;
        } finally {
        }
    }

    public final InputStream readMesh(String str) {
        InputStream open = getContext().getAssets().open(str.concat(".filamesh"));
        open.getClass();
        return open;
    }

    public boolean sceneInitialized() {
        return getScene().getRenderableCount() > 0;
    }

    public final void scheduleRedraw() {
        FrameCallback frameCallback;
        if (this.engine == null || !getEngine().isValid() || this.renderSessionTracker.prefetchDistance == 0 || (frameCallback = this.frameScheduler) == null) {
            return;
        }
        Choreographer choreographer = this.choreographer;
        choreographer.removeFrameCallback(frameCallback);
        choreographer.postFrameCallback(frameCallback);
    }

    public final void setCamera(Camera camera) {
        camera.getClass();
        this.camera = camera;
    }

    public final void setCameraFov(double d) {
        this.cameraFov = d;
    }

    public final void setCameraFovDirection(Camera.Fov fov) {
        fov.getClass();
        this.cameraFovDirection = fov;
    }

    public final void setCameraPosition(double d, double d2, double d3) {
        double[] dArr = this.eyePos;
        dArr[0] = d;
        dArr[1] = d2;
        dArr[2] = d3;
    }

    public final void setEngine(Engine engine) {
        engine.getClass();
        this.engine = engine;
    }

    public final void setFogOptions(View.FogOptions fogOptions) {
        View view;
        fogOptions.getClass();
        this.fogOptions = fogOptions;
        if (this.engine == null || !getEngine().isValid() || this.renderSessionTracker.prefetchDistance == 0 || (view = this.view) == null) {
            return;
        }
        if (view != null) {
            view.setFogOptions(this.fogOptions);
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("view");
            throw null;
        }
    }

    public final void setFpsTracker(TextureViewFpsTracker textureViewFpsTracker) {
        this.fpsTracker = textureViewFpsTracker;
    }

    public final void setOnFirstFrame(Function0<Unit> function0) {
        this.onFirstFrame = function0;
    }

    public final void setScene(Scene scene) {
        scene.getClass();
        this.scene = scene;
    }

    public final void updateColorGrading(View view) {
        long nCreateBuilder;
        long nCreateLinearToneMapper;
        long nBuilderBuild;
        ColorGrading colorGrading = view.mColorGrading;
        if (colorGrading != null) {
            getEngine().destroyColorGrading(colorGrading);
        }
        nCreateBuilder = ColorGrading.nCreateBuilder();
        new IadFrame(nCreateBuilder, 4);
        nCreateLinearToneMapper = ToneMapper.nCreateLinearToneMapper();
        long j = new ToneMapper.Linear(nCreateLinearToneMapper).mNativeObject;
        if (j == 0) {
            a$$ExternalSyntheticBUOutline0.m$1("Calling method on destroyed ToneMapper");
            return;
        }
        ColorGrading.nBuilderToneMapper(nCreateBuilder, j);
        ColorGrading.nBuilderVibrance(nCreateBuilder, this.vibrance);
        ColorGrading.nBuilderContrast(nCreateBuilder, this.contrast);
        ColorGrading.nBuilderSaturation(nCreateBuilder, this.saturation);
        nBuilderBuild = ColorGrading.nBuilderBuild(nCreateBuilder, getEngine().getNativeObject());
        if (nBuilderBuild == 0) {
            a$$ExternalSyntheticBUOutline0.m$1("Couldn't create ColorGrading");
            return;
        }
        ColorGrading colorGrading2 = new ColorGrading();
        colorGrading2.mNativeObject = nBuilderBuild;
        view.setColorGrading(colorGrading2);
    }

    public final void updateTransform(int i, float[] fArr) {
        fArr.getClass();
        getEngine().mTransformManager.setTransform(getEngine().mTransformManager.getInstance(i), fArr);
        scheduleRedraw();
    }
}
