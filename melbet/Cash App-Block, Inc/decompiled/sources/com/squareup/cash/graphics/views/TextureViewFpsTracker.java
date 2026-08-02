package com.squareup.cash.graphics.views;

import android.graphics.SurfaceTexture;
import android.os.SystemClock;
import android.view.TextureView;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class TextureViewFpsTracker implements TextureView.SurfaceTextureListener {
    public final ArrayList historicalFrames = new ArrayList();
    public long lastFrame = SystemClock.elapsedRealtime();
    public TextureView.SurfaceTextureListener parent;

    public final int getAverageFps() {
        ArrayList arrayList = this.historicalFrames;
        arrayList.getClass();
        Iterator it = arrayList.iterator();
        double d = 0.0d;
        int i = 0;
        while (it.hasNext()) {
            d += ((Number) it.next()).longValue();
            i++;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwCountOverflow();
                throw null;
            }
        }
        return (int) (1000.0d / (i == 0 ? Double.NaN : d / i));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        surfaceTexture.getClass();
        TextureView.SurfaceTextureListener surfaceTextureListener = this.parent;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureAvailable(surfaceTexture, i, i2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        surfaceTexture.getClass();
        TextureView.SurfaceTextureListener surfaceTextureListener = this.parent;
        if (surfaceTextureListener != null) {
            return surfaceTextureListener.onSurfaceTextureDestroyed(surfaceTexture);
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        surfaceTexture.getClass();
        TextureView.SurfaceTextureListener surfaceTextureListener = this.parent;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        surfaceTexture.getClass();
        TextureView.SurfaceTextureListener surfaceTextureListener = this.parent;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureUpdated(surfaceTexture);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.lastFrame;
        ArrayList arrayList = this.historicalFrames;
        if (1 <= elapsedRealtime && elapsedRealtime < 100) {
            arrayList.add(Long.valueOf(elapsedRealtime));
        }
        if (arrayList.size() > 1000) {
            arrayList.remove(0);
        }
        this.lastFrame = SystemClock.elapsedRealtime();
    }
}
