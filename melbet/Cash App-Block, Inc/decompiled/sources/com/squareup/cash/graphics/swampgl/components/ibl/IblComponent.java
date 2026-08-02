package com.squareup.cash.graphics.swampgl.components.ibl;

import android.content.Context;
import android.graphics.Bitmap;
import com.squareup.cash.graphics.swampgl.GLLauncher;
import com.squareup.cash.graphics.swampgl.components.Scene;
import com.squareup.cash.graphics.swampgl.components.Scene$iblData$1;
import com.squareup.cash.graphics.swampgl.gl.RealGlOperations;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes6.dex */
public final class IblComponent {
    public final SharedFlowImpl _dirty;
    public float _intensity;
    public final StateFlowImpl _ready;
    public final Context context;
    public IblAssetData currentAsset;
    public final SharedFlowImpl dirty;
    public final GLLauncher glLauncher;
    public final RealGlOperations glTexOps;
    public final int[] iblTextureIds;
    public boolean iblTexturesInitialized;
    public Integer lastIblAssetHash;
    public final Job loadJob;
    public final ReadonlyStateFlow ready;

    public IblComponent(Context context, GLLauncher gLLauncher) {
        RealGlOperations realGlOperations = RealGlOperations.INSTANCE$1;
        context.getClass();
        gLLauncher.getClass();
        StateFlowImpl MutableStateFlow = FlowKt.MutableStateFlow(Boolean.FALSE);
        this._ready = MutableStateFlow;
        this.ready = FlowKt.asStateFlow(MutableStateFlow);
        Continuation continuation = null;
        SharedFlowImpl MutableSharedFlow$default = FlowKt.MutableSharedFlow$default(0, 1, null, 4);
        this._dirty = MutableSharedFlow$default;
        this.dirty = MutableSharedFlow$default;
        this._intensity = 1.0f;
        this.context = context;
        this.glLauncher = gLLauncher;
        this.glTexOps = realGlOperations;
        this.iblTextureIds = new int[4];
        Job job = this.loadJob;
        if (job != null) {
            job.cancel(null);
        }
        StateFlowImpl stateFlowImpl = this._ready;
        Boolean bool = Boolean.FALSE;
        stateFlowImpl.getClass();
        stateFlowImpl.updateState(null, bool);
        disposeCurrentAsset();
        this.loadJob = gLLauncher.launch(new Scene.AnonymousClass1(this, continuation, 24));
    }

    public final void disposeCurrentAsset() {
        IblAssetData iblAssetData = this.currentAsset;
        if (iblAssetData != null) {
            Iterator it = iblAssetData.mipLevels.iterator();
            while (it.hasNext()) {
                for (Bitmap bitmap : ((IblMipLevel) it.next()).faces.values()) {
                    if (!bitmap.isRecycled()) {
                        bitmap.recycle();
                    }
                }
            }
            this.currentAsset = null;
        }
    }

    public final void release() {
        Job job = this.loadJob;
        if (job != null) {
            job.cancel(null);
        }
        this.glLauncher.launch(new Scene$iblData$1(this, null, 2));
        Boolean bool = Boolean.FALSE;
        StateFlowImpl stateFlowImpl = this._ready;
        stateFlowImpl.getClass();
        stateFlowImpl.updateState(null, bool);
    }

    public final void setIntensity(float f) {
        if (this._intensity == f) {
            return;
        }
        this._intensity = f;
        this._dirty.tryEmit(Unit.INSTANCE);
    }
}
