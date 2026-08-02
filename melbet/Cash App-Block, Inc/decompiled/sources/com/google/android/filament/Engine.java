package com.google.android.filament;

import android.view.Surface;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import net.idrnd.misnap.iad.IadFrame;

/* loaded from: classes6.dex */
public class Engine {
    public final LightManager mLightManager;
    public long mNativeObject;
    public final TransformManager mTransformManager;

    static {
        CameraSelector$$ExternalSyntheticOutline0.values(6);
        CameraSelector$$ExternalSyntheticOutline0.values(4);
    }

    public Engine(long j) {
        this.mNativeObject = j;
        long nGetTransformManager = nGetTransformManager(j);
        TransformManager transformManager = new TransformManager();
        transformManager.mNativeObject = nGetTransformManager;
        this.mTransformManager = transformManager;
        long nGetLightManager = nGetLightManager(j);
        LightManager lightManager = new LightManager();
        lightManager.mNativeObject = nGetLightManager;
        this.mLightManager = lightManager;
        nGetRenderableManager(j);
        new EntityManager(nGetEntityManager(j));
    }

    public static void assertDestroy(boolean z) {
        if (z) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Object couldn't be destroyed (double destroy()?)");
    }

    public static Engine create() {
        long nCreateBuilder = nCreateBuilder();
        new IadFrame(nCreateBuilder, 5);
        nSetBuilderBackend(nCreateBuilder, CameraSelector$$ExternalSyntheticOutline0.ordinal(2));
        long nBuilderBuild = nBuilderBuild(nCreateBuilder);
        if (nBuilderBuild != 0) {
            return new Engine(nBuilderBuild);
        }
        a$$ExternalSyntheticBUOutline0.m$1("Couldn't create Engine");
        return null;
    }

    private static native long nBuilderBuild(long j);

    private static native long nCreateBuilder();

    private static native long nCreateCamera(long j, int i);

    private static native long nCreateRenderer(long j);

    private static native long nCreateScene(long j);

    private static native long nCreateSwapChain(long j, Object obj, long j2);

    private static native long nCreateView(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyBuilder(long j);

    private static native void nDestroyCameraComponent(long j, int i);

    private static native boolean nDestroyColorGrading(long j, long j2);

    private static native void nDestroyEngine(long j);

    private static native void nDestroyEntity(long j, int i);

    private static native boolean nDestroyIndexBuffer(long j, long j2);

    private static native boolean nDestroyIndirectLight(long j, long j2);

    private static native boolean nDestroyMaterial(long j, long j2);

    private static native boolean nDestroyMaterialInstance(long j, long j2);

    private static native boolean nDestroyRenderer(long j, long j2);

    private static native boolean nDestroyScene(long j, long j2);

    private static native boolean nDestroySkybox(long j, long j2);

    private static native boolean nDestroySwapChain(long j, long j2);

    private static native boolean nDestroyTexture(long j, long j2);

    private static native boolean nDestroyVertexBuffer(long j, long j2);

    private static native boolean nDestroyView(long j, long j2);

    private static native boolean nFlushAndWait(long j, long j2);

    private static native long nGetEntityManager(long j);

    private static native long nGetJobSystem(long j);

    private static native long nGetLightManager(long j);

    private static native long nGetRenderableManager(long j);

    private static native long nGetTransformManager(long j);

    private static native void nSetBuilderBackend(long j, long j2);

    public final Camera createCamera(int i) {
        long nCreateCamera = nCreateCamera(getNativeObject(), i);
        if (nCreateCamera == 0) {
            a$$ExternalSyntheticBUOutline0.m$1("Couldn't create Camera");
            return null;
        }
        Camera camera = new Camera();
        camera.mNativeObject = nCreateCamera;
        return camera;
    }

    public final Renderer createRenderer() {
        long nCreateRenderer = nCreateRenderer(getNativeObject());
        if (nCreateRenderer == 0) {
            a$$ExternalSyntheticBUOutline0.m$1("Couldn't create Renderer");
            return null;
        }
        Renderer renderer = new Renderer();
        renderer.mNativeObject = nCreateRenderer;
        return renderer;
    }

    public final Scene createScene() {
        long nCreateScene = nCreateScene(getNativeObject());
        if (nCreateScene == 0) {
            a$$ExternalSyntheticBUOutline0.m$1("Couldn't create Scene");
            return null;
        }
        Scene scene = new Scene();
        scene.mNativeObject = nCreateScene;
        return scene;
    }

    public final SwapChain createSwapChain(Surface surface, long j) {
        if (!Platform.get().validateSurface(surface)) {
            OptionalProvider$$ExternalSyntheticLambda0.m((Object) surface, "Invalid surface ");
            return null;
        }
        long nCreateSwapChain = nCreateSwapChain(getNativeObject(), surface, j);
        if (nCreateSwapChain != 0) {
            return new SwapChain(surface, nCreateSwapChain);
        }
        a$$ExternalSyntheticBUOutline0.m$1("Couldn't create SwapChain");
        return null;
    }

    public final View createView() {
        long nCreateView = nCreateView(getNativeObject());
        if (nCreateView == 0) {
            a$$ExternalSyntheticBUOutline0.m$1("Couldn't create View");
            return null;
        }
        View view = new View();
        int i = 0;
        view.mViewport = new Viewport(i, i);
        view.mNativeObject = nCreateView;
        return view;
    }

    public final void destroy() {
        nDestroyEngine(getNativeObject());
        this.mNativeObject = 0L;
    }

    public final void destroyCameraComponent(int i) {
        nDestroyCameraComponent(getNativeObject(), i);
    }

    public final void destroyColorGrading(ColorGrading colorGrading) {
        long nativeObject = getNativeObject();
        long j = colorGrading.mNativeObject;
        if (j == 0) {
            a$$ExternalSyntheticBUOutline0.m$1("Calling method on destroyed ColorGrading");
        } else {
            assertDestroy(nDestroyColorGrading(nativeObject, j));
            colorGrading.mNativeObject = 0L;
        }
    }

    public final void destroyEntity(int i) {
        nDestroyEntity(getNativeObject(), i);
    }

    public final void destroyIndexBuffer(IndexBuffer indexBuffer) {
        assertDestroy(nDestroyIndexBuffer(getNativeObject(), indexBuffer.getNativeObject()));
        indexBuffer.mNativeObject = 0L;
    }

    public final void destroyIndirectLight(IndirectLight indirectLight) {
        long nativeObject = getNativeObject();
        long j = indirectLight.mNativeObject;
        if (j == 0) {
            a$$ExternalSyntheticBUOutline0.m$1("Calling method on destroyed IndirectLight");
        } else {
            assertDestroy(nDestroyIndirectLight(nativeObject, j));
            indirectLight.mNativeObject = 0L;
        }
    }

    public final void destroyMaterial(Material material) {
        assertDestroy(nDestroyMaterial(getNativeObject(), material.getNativeObject()));
        material.mNativeObject = 0L;
    }

    public final void destroyMaterialInstance(MaterialInstance materialInstance) {
        assertDestroy(nDestroyMaterialInstance(getNativeObject(), materialInstance.getNativeObject()));
        materialInstance.mNativeObject = 0L;
    }

    public final void destroyRenderer(Renderer renderer) {
        assertDestroy(nDestroyRenderer(getNativeObject(), renderer.getNativeObject()));
        renderer.mNativeObject = 0L;
    }

    public final void destroyScene(Scene scene) {
        assertDestroy(nDestroyScene(getNativeObject(), scene.getNativeObject()));
        scene.mNativeObject = 0L;
    }

    public final void destroySkybox(Skybox skybox) {
        long nativeObject = getNativeObject();
        long j = skybox.mNativeObject;
        if (j == 0) {
            a$$ExternalSyntheticBUOutline0.m$1("Calling method on destroyed Skybox");
        } else {
            assertDestroy(nDestroySkybox(nativeObject, j));
            skybox.mNativeObject = 0L;
        }
    }

    public final void destroySwapChain(SwapChain swapChain) {
        long nativeObject = getNativeObject();
        long j = swapChain.mNativeObject;
        if (j == 0) {
            a$$ExternalSyntheticBUOutline0.m$1("Calling method on destroyed SwapChain");
        } else {
            assertDestroy(nDestroySwapChain(nativeObject, j));
            swapChain.mNativeObject = 0L;
        }
    }

    public final void destroyTexture(Texture texture) {
        assertDestroy(nDestroyTexture(getNativeObject(), texture.getNativeObject()));
        texture.mNativeObject = 0L;
    }

    public final void destroyVertexBuffer(VertexBuffer vertexBuffer) {
        assertDestroy(nDestroyVertexBuffer(getNativeObject(), vertexBuffer.getNativeObject()));
        vertexBuffer.mNativeObject = 0L;
    }

    public final void destroyView(View view) {
        assertDestroy(nDestroyView(getNativeObject(), view.getNativeObject()));
        view.mNativeObject = 0L;
    }

    public final void flushAndWait() {
        nFlushAndWait(getNativeObject(), -1L);
    }

    public long getNativeJobSystem() {
        if (this.mNativeObject != 0) {
            return nGetJobSystem(getNativeObject());
        }
        a$$ExternalSyntheticBUOutline0.m$1("Calling method on destroyed Engine");
        return 0L;
    }

    public long getNativeObject() {
        long j = this.mNativeObject;
        if (j != 0) {
            return j;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Calling method on destroyed Engine");
        return 0L;
    }

    public final boolean isValid() {
        return this.mNativeObject != 0;
    }
}
