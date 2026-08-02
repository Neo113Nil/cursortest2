package com.squareup.cash.card.onboarding;

import com.google.android.filament.Engine;
import com.google.android.filament.Texture;
import kotlin.Pair;

/* loaded from: classes6.dex */
public final class CardTextureState {
    public Pair albedoTexture;
    public Pair contouredTextTexture;
    public Pair copyPanTexture;
    public final Engine engine;
    public Pair heatMaskTexture;
    public Pair heatTexture;
    public Pair holoTextures;
    public Pair iconTexture;
    public Pair inkTexture;
    public Pair normalTexture;
    public Texture shimmerTexture;

    public CardTextureState(Engine engine, int i) {
        engine = (i & 1) != 0 ? Engine.create() : engine;
        engine.getClass();
        this.engine = engine;
        this.albedoTexture = null;
        this.normalTexture = null;
        this.inkTexture = null;
        this.copyPanTexture = null;
        this.heatTexture = null;
        this.heatMaskTexture = null;
        this.shimmerTexture = null;
        this.iconTexture = null;
        this.holoTextures = null;
        this.contouredTextTexture = null;
    }

    public final void destroyTextures() {
        Pair pair;
        Texture texture;
        Texture texture2;
        Texture texture3;
        Texture texture4;
        Texture texture5;
        Texture texture6;
        Texture texture7;
        Texture texture8;
        Pair pair2 = this.albedoTexture;
        Engine engine = this.engine;
        if (pair2 != null && (texture8 = (Texture) pair2.second) != null) {
            engine.destroyTexture(texture8);
        }
        Pair pair3 = this.normalTexture;
        if (pair3 != null && (texture7 = (Texture) pair3.second) != null) {
            engine.destroyTexture(texture7);
        }
        Pair pair4 = this.inkTexture;
        if (pair4 != null && (texture6 = (Texture) pair4.second) != null) {
            engine.destroyTexture(texture6);
        }
        Pair pair5 = this.copyPanTexture;
        if (pair5 != null && (texture5 = (Texture) pair5.second) != null) {
            engine.destroyTexture(texture5);
        }
        Pair pair6 = this.heatMaskTexture;
        if (pair6 != null && (texture4 = (Texture) pair6.second) != null) {
            engine.destroyTexture(texture4);
        }
        Texture texture9 = this.shimmerTexture;
        if (texture9 != null) {
            engine.destroyTexture(texture9);
        }
        Pair pair7 = this.iconTexture;
        if (pair7 != null && (texture3 = (Texture) pair7.second) != null) {
            engine.destroyTexture(texture3);
        }
        Pair pair8 = this.heatTexture;
        if (pair8 != null && (texture2 = (Texture) pair8.second) != null) {
            engine.destroyTexture(texture2);
        }
        Pair pair9 = this.contouredTextTexture;
        if (pair9 != null && (texture = (Texture) pair9.second) != null) {
            engine.destroyTexture(texture);
        }
        Pair pair10 = this.holoTextures;
        if (pair10 != null && (pair = (Pair) pair10.second) != null) {
            Texture texture10 = (Texture) pair.first;
            Texture texture11 = (Texture) pair.second;
            engine.destroyTexture(texture10);
            engine.destroyTexture(texture11);
        }
        this.albedoTexture = null;
        this.normalTexture = null;
        this.inkTexture = null;
        this.copyPanTexture = null;
        this.heatMaskTexture = null;
        this.shimmerTexture = null;
        this.iconTexture = null;
        this.heatTexture = null;
        this.contouredTextTexture = null;
        this.holoTextures = null;
    }
}
