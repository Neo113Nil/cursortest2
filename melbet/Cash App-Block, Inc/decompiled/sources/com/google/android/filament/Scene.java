package com.google.android.filament;

import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes6.dex */
public class Scene {
    public IndirectLight mIndirectLight;
    public long mNativeObject;
    public Skybox mSkybox;

    private static native void nAddEntity(long j, int i);

    private static native int nGetRenderableCount(long j);

    private static native void nRemoveEntities(long j, int[] iArr);

    private static native void nSetIndirectLight(long j, long j2);

    private static native void nSetSkybox(long j, long j2);

    public final void addEntity(int i) {
        nAddEntity(getNativeObject(), i);
    }

    public final long getNativeObject() {
        long j = this.mNativeObject;
        if (j != 0) {
            return j;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Calling method on destroyed Scene");
        return 0L;
    }

    public final int getRenderableCount() {
        return nGetRenderableCount(getNativeObject());
    }

    public final void removeEntities(int[] iArr) {
        nRemoveEntities(getNativeObject(), iArr);
    }

    public final void setIndirectLight(IndirectLight indirectLight) {
        this.mIndirectLight = indirectLight;
        long nativeObject = getNativeObject();
        IndirectLight indirectLight2 = this.mIndirectLight;
        long j = 0;
        if (indirectLight2 != null) {
            long j2 = indirectLight2.mNativeObject;
            if (j2 == 0) {
                a$$ExternalSyntheticBUOutline0.m$1("Calling method on destroyed IndirectLight");
                return;
            }
            j = j2;
        }
        nSetIndirectLight(nativeObject, j);
    }

    public final void setSkybox(Skybox skybox) {
        this.mSkybox = skybox;
        long nativeObject = getNativeObject();
        Skybox skybox2 = this.mSkybox;
        long j = 0;
        if (skybox2 != null) {
            long j2 = skybox2.mNativeObject;
            if (j2 == 0) {
                a$$ExternalSyntheticBUOutline0.m$1("Calling method on destroyed Skybox");
                return;
            }
            j = j2;
        }
        nSetSkybox(nativeObject, j);
    }
}
