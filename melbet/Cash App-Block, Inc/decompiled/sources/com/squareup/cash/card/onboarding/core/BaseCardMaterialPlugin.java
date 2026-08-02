package com.squareup.cash.card.onboarding.core;

import android.graphics.Color;
import android.opengl.GLES20;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.card.onboarding.core.SingleCardMaterialPlugin;
import com.squareup.cash.graphics.swampgl.components.MaterialInput;
import com.squareup.cash.graphics.swampgl.components.MaterialPlugin;
import com.squareup.cash.graphics.swampgl.components.RealUniformBinder;
import com.squareup.protos.franklin.cards.CardTheme;

/* loaded from: classes6.dex */
public abstract class BaseCardMaterialPlugin implements MaterialPlugin {
    public int backInkColor;
    public int backMagStripeColor;
    public int baseColor;
    public float baseOpacity;
    public float clearCoat;
    public float clearCoatRoughness;
    public boolean hasSnakeSkin;
    public float holoOffsetScale;
    public float holoOffsetX;
    public float holoOffsetY;
    public float iconRectHeight;
    public float iconRectLeft;
    public float iconRectTop;
    public float iconRectWidth;
    public int indicatorColor;
    public float indicatorRadius;
    public float inkClearCoat;
    public float inkClearCoatRoughness;
    public int inkColor;
    public float inkRoughness;
    public boolean isHolo;
    public boolean isMood;
    public int magStripeColor;
    public float metallic;
    public float metallicClearCoat;
    public float metallicClearCoatRoughness;
    public float metallicRoughness;
    public float roughness;
    public float shimmerOffset;
    public float shimmerScale;

    @Override // com.squareup.cash.graphics.swampgl.components.MaterialPlugin
    public final void bindCustomUniforms(RealUniformBinder realUniformBinder) {
        CardTextureIds cardTextureIds;
        SingleCardMaterialPlugin singleCardMaterialPlugin = (SingleCardMaterialPlugin) this;
        SingleCardMaterialPlugin.TextureSet textureSet = singleCardMaterialPlugin.current;
        if (textureSet != null) {
            if (textureSet != null && (cardTextureIds = textureSet.ids) != null) {
                realUniformBinder.bindTexture(cardTextureIds.albedo, "uAlbedoTexture");
                realUniformBinder.bindTexture(cardTextureIds.normal, "uNormalTexture");
                realUniformBinder.bindTexture(cardTextureIds.inkMetalHeat, "uInkMetalHeatTexture");
                realUniformBinder.bindTexture(cardTextureIds.heatColors, "uHeatColorsTexture");
                HeatMaskProvider heatMaskProvider = singleCardMaterialPlugin.heatMaskProvider;
                realUniformBinder.bindTexture((heatMaskProvider == null || !heatMaskProvider.isReady()) ? cardTextureIds.heatMask : heatMaskProvider.getTextureId(), "uHeatMaskTexture");
                if (heatMaskProvider != null && heatMaskProvider.isReady()) {
                    GLES20.glFlush();
                }
                realUniformBinder.bindTexture(cardTextureIds.shimmer, "uShimmerGradientTexture");
                realUniformBinder.bindTexture(cardTextureIds.holoBase, "uHoloBaseTexture");
                realUniformBinder.bindTexture(cardTextureIds.holoReflect, "uHoloReflectTexture");
                realUniformBinder.bindTexture(cardTextureIds.icon, "uIconTexture");
                realUniformBinder.bindTexture(cardTextureIds.snakeSkin, "uSnakeSkinTexture");
            }
            realUniformBinder.setColorRGB(this.inkColor, "uInkColor");
            realUniformBinder.setColorRGB(this.backInkColor, "uBackInkColor");
            realUniformBinder.setColorRGB(this.magStripeColor, "uMagStripeColor");
            realUniformBinder.setColorRGB(this.backMagStripeColor, "uBackMagStripeColor");
            int i = this.indicatorColor;
            realUniformBinder.setFloat4("uIndicatorColor", Color.red(i) / 255.0f, Color.green(i) / 255.0f, Color.blue(i) / 255.0f, Color.alpha(i) / 255.0f);
            realUniformBinder.setFloat("uInkRoughness", this.inkRoughness);
            realUniformBinder.setFloat("uInkClearCoat", this.inkClearCoat);
            realUniformBinder.setFloat("uInkClearCoatRoughness", this.inkClearCoatRoughness);
            realUniformBinder.setFloat("uMetallicRoughness", this.metallicRoughness);
            realUniformBinder.setFloat("uMetallicClearCoat", this.metallicClearCoat);
            realUniformBinder.setFloat("uMetallicClearCoatRoughness", this.metallicClearCoatRoughness);
            float f = RecyclerView.DECELERATION_RATE;
            realUniformBinder.setFloat("uGlitterRoughness", RecyclerView.DECELERATION_RATE);
            realUniformBinder.setFloat("uShimmerOffset", this.shimmerOffset);
            realUniformBinder.setFloat("uShimmerScale", this.shimmerScale);
            realUniformBinder.setFloat("uIndicatorRadius", this.indicatorRadius);
            realUniformBinder.setFloat("uMaterialFade", 1.0f);
            realUniformBinder.setFloat("uIsHolo", this.isHolo ? 1.0f : 0.0f);
            realUniformBinder.setFloat("uHoloOffsetScale", this.holoOffsetScale);
            realUniformBinder.setFloat("uHoloOffsetX", this.holoOffsetX);
            realUniformBinder.setFloat("uHoloOffsetY", this.holoOffsetY);
            realUniformBinder.setFloat("uHoloReflectionDirOffsetX", RecyclerView.DECELERATION_RATE);
            realUniformBinder.setFloat("uHoloReflectionDirOffsetY", RecyclerView.DECELERATION_RATE);
            realUniformBinder.setFloat("uIsMood", this.isMood ? 1.0f : 0.0f);
            if (this.hasSnakeSkin) {
                f = 1.0f;
            }
            realUniformBinder.setFloat("uHasSnakeSkin", f);
            realUniformBinder.setFloat4("uIconRect", this.iconRectLeft, this.iconRectTop, this.iconRectWidth, this.iconRectHeight);
        }
    }

    @Override // com.squareup.cash.graphics.swampgl.components.MaterialPlugin
    public final void prepareMaterialInput(MaterialInput materialInput) {
        materialInput.getClass();
        if (((SingleCardMaterialPlugin) this).current != null) {
            materialInput.baseColor = this.baseColor;
            materialInput.opacity = this.baseOpacity;
            materialInput.roughness = this.roughness;
            materialInput.metallic = this.metallic;
            materialInput.clearCoat = this.clearCoat;
            materialInput.clearCoatRoughness = this.clearCoatRoughness;
            materialInput.dimmer = RecyclerView.DECELERATION_RATE;
        }
    }

    public final void updateParameters(CardModelView.ViewModel viewModel) {
        viewModel.getClass();
        this.baseColor = viewModel.color;
        this.baseOpacity = viewModel.opacity;
        this.roughness = viewModel.roughness;
        this.clearCoat = viewModel.clearCoat;
        this.clearCoatRoughness = viewModel.clearCoatRoughness;
        this.metallic = viewModel.metallic;
        this.inkColor = viewModel.inkColor;
        this.backInkColor = viewModel.backInkColor;
        this.magStripeColor = viewModel.magStripColor;
        this.backMagStripeColor = viewModel.backMagStripColor;
        this.inkRoughness = viewModel.inkRoughness;
        this.inkClearCoat = viewModel.inkClearCoat;
        this.inkClearCoatRoughness = viewModel.inkClearCoatRoughness;
        this.metallicRoughness = viewModel.metallicRoughness;
        this.metallicClearCoat = viewModel.metallicClearCoat;
        this.metallicClearCoatRoughness = viewModel.metallicClearCoatRoughness;
        this.shimmerOffset = viewModel.shimmerOffset;
        this.shimmerScale = viewModel.shimmerScale;
        this.isHolo = viewModel.id == CardTheme.Identifier.HOLO_ID;
        CardTheme.BackgroundImage backgroundImage = viewModel.backgroundImage;
        CardTheme.BackgroundImage backgroundImage2 = CardTheme.BackgroundImage.MOOD;
        this.hasSnakeSkin = backgroundImage == backgroundImage2;
        this.isMood = backgroundImage == backgroundImage2;
        this.holoOffsetScale = viewModel.holoOffsetScale;
        this.holoOffsetX = viewModel.holoOffsetX;
        this.holoOffsetY = viewModel.holoOffsetY;
    }
}
