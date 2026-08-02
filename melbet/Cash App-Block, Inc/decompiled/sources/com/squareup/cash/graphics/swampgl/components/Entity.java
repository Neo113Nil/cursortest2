package com.squareup.cash.graphics.swampgl.components;

import com.squareup.util.coroutines.FlowExtensionsKt$doOnFirst$$inlined$map$1;
import kotlinx.coroutines.flow.ChannelFlowBuilder;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes6.dex */
public final class Entity {
    public final StateFlowImpl _needsDoubleSidedRendering;
    public final StateFlowImpl _visible;
    public volatile boolean castsShadow;
    public volatile boolean castsShadowFromBackFacesOnly;
    public boolean depthWrite;
    public final ChannelFlowBuilder dirty;
    public final Geometry geometry;
    public final String id;
    public final Material material;
    public volatile boolean receivesShadows;
    public final Transform transform;

    public Entity(String str, Geometry geometry, Material material, Transform transform) {
        geometry.getClass();
        material.getClass();
        transform.getClass();
        this.id = str;
        this.geometry = geometry;
        this.material = material;
        this.transform = transform;
        StateFlowImpl MutableStateFlow = FlowKt.MutableStateFlow(Boolean.TRUE);
        this._visible = MutableStateFlow;
        StateFlowImpl MutableStateFlow2 = FlowKt.MutableStateFlow(Boolean.FALSE);
        this._needsDoubleSidedRendering = MutableStateFlow2;
        this.depthWrite = true;
        new Entity$ready$1(4, null);
        this.dirty = FlowKt.merge(new FlowExtensionsKt$doOnFirst$$inlined$map$1(FlowKt.drop(geometry.getReady(), 1), 1), new FlowExtensionsKt$doOnFirst$$inlined$map$1(FlowKt.drop(material.getReady(), 1), 2), material.getDirty(), transform.dirty, new FlowExtensionsKt$doOnFirst$$inlined$map$1(FlowKt.drop(MutableStateFlow, 1), 3), new FlowExtensionsKt$doOnFirst$$inlined$map$1(FlowKt.drop(MutableStateFlow2, 1), 4));
    }

    public final boolean getNeedsDoubleSidedRendering() {
        return ((Boolean) this._needsDoubleSidedRendering.getValue()).booleanValue();
    }

    public final boolean getVisible() {
        return ((Boolean) this._visible.getValue()).booleanValue();
    }

    public final void setNeedsDoubleSidedRendering(boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        StateFlowImpl stateFlowImpl = this._needsDoubleSidedRendering;
        stateFlowImpl.getClass();
        stateFlowImpl.updateState(null, valueOf);
    }

    public final void setVisible(boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        StateFlowImpl stateFlowImpl = this._visible;
        stateFlowImpl.getClass();
        stateFlowImpl.updateState(null, valueOf);
    }
}
