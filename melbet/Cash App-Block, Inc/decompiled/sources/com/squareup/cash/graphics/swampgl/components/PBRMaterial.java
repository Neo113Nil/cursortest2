package com.squareup.cash.graphics.swampgl.components;

import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.graphics.swampgl.GLLauncher;
import com.squareup.cash.graphics.swampgl.components.Material;
import kotlin.Unit;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes6.dex */
public abstract class PBRMaterial implements Material {
    public final SharedFlowImpl _dirty;
    public final StateFlowImpl _ready;
    public Material.ProgramSource cachedProgramSource;
    public MaterialPlugin cachedProgramSourcePlugin;
    public final SharedFlowImpl dirty;
    public final MaterialInput materialInput;
    public MaterialPlugin plugin;
    public final ReadonlyStateFlow ready;

    public PBRMaterial(GLLauncher gLLauncher) {
        gLLauncher.getClass();
        StateFlowImpl MutableStateFlow = FlowKt.MutableStateFlow(Boolean.FALSE);
        this._ready = MutableStateFlow;
        this.ready = FlowKt.asStateFlow(MutableStateFlow);
        SharedFlowImpl MutableSharedFlow$default = FlowKt.MutableSharedFlow$default(1, 1, null, 4);
        this._dirty = MutableSharedFlow$default;
        this.dirty = MutableSharedFlow$default;
        MaterialInput materialInput = new MaterialInput();
        materialInput.baseColor = -1;
        materialInput.opacity = 1.0f;
        materialInput.roughness = 0.4f;
        materialInput.metallic = RecyclerView.DECELERATION_RATE;
        materialInput.clearCoat = RecyclerView.DECELERATION_RATE;
        materialInput.clearCoatRoughness = RecyclerView.DECELERATION_RATE;
        materialInput.dimmer = RecyclerView.DECELERATION_RATE;
        materialInput.saturation = 1.0f;
        materialInput.crossfadeMultiplier = 1.0f;
        this.materialInput = materialInput;
    }

    @Override // com.squareup.cash.graphics.swampgl.components.Material
    public void bind(RealUniformBinder realUniformBinder) {
        MaterialPlugin materialPlugin = this.plugin;
        if (materialPlugin == null) {
            return;
        }
        MaterialInput materialInput = this.materialInput;
        materialPlugin.prepareMaterialInput(materialInput);
        realUniformBinder.setFloat("uOpacity", materialInput.opacity);
        realUniformBinder.setFloat("uDimmer", materialInput.dimmer);
        realUniformBinder.setFloat("uSaturation", materialInput.saturation);
        realUniformBinder.setFloat("uCrossfadeMultiplier", materialInput.crossfadeMultiplier);
        realUniformBinder.setColorRGB(materialInput.baseColor, "uBaseColor");
        realUniformBinder.setFloat("uRoughness", materialInput.roughness);
        realUniformBinder.setFloat("uMetallic", materialInput.metallic);
        realUniformBinder.setFloat("uClearCoat", materialInput.clearCoat);
        realUniformBinder.setFloat("uClearCoatRoughness", materialInput.clearCoatRoughness);
        realUniformBinder.setColorRGB(-16777216, "uEmissive");
        realUniformBinder.setFloat("uDiffuseIBL", RecyclerView.DECELERATION_RATE);
        materialPlugin.bindCustomUniforms(realUniformBinder);
    }

    public abstract MaterialPlugin createPlugin();

    @Override // com.squareup.cash.graphics.swampgl.components.Material
    public final Flow getDirty() {
        return this.dirty;
    }

    @Override // com.squareup.cash.graphics.swampgl.components.Material
    public final Material.ProgramSource getProgramSource() {
        MaterialPlugin materialPlugin = this.plugin;
        if (materialPlugin == null) {
            a$$ExternalSyntheticBUOutline0.m$1("Plugin not initialized - call ensurePluginInitialized() in subclass init");
            return null;
        }
        if (this.cachedProgramSourcePlugin != materialPlugin) {
            this.cachedProgramSource = materialPlugin.getProgramSource();
            this.cachedProgramSourcePlugin = materialPlugin;
        }
        Material.ProgramSource programSource = this.cachedProgramSource;
        programSource.getClass();
        return programSource;
    }

    @Override // com.squareup.cash.graphics.swampgl.components.Material
    public final StateFlow getReady() {
        return this.ready;
    }

    public final void markDirty$1() {
        this._dirty.tryEmit(Unit.INSTANCE);
    }

    public final void markReady() {
        Boolean bool = Boolean.TRUE;
        StateFlowImpl stateFlowImpl = this._ready;
        stateFlowImpl.getClass();
        stateFlowImpl.updateState(null, bool);
    }
}
