package com.squareup.cash.card.onboarding.core;

import android.graphics.Bitmap;
import android.graphics.RectF;
import androidx.paging.Pager$pageFetcher$2;
import com.google.mlkit.vision.text.internal.zzr;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.card.onboarding.EquatableBitmap;
import com.squareup.cash.graphics.swampgl.GLLauncher;
import com.squareup.cash.graphics.swampgl.components.MaterialPlugin;
import com.squareup.cash.graphics.swampgl.components.PBRMaterial;
import com.squareup.cash.graphics.swampgl.components.RealUniformBinder;

/* loaded from: classes6.dex */
public final class CardMaterial extends PBRMaterial {
    public final CardAssetProvider assetManager;
    public SingleCardMaterialPlugin cardPlugin;
    public float crossfadeMultiplier;
    public final EquatableBitmap customizationOverride;
    public final GLLauncher glLauncher;
    public final zzr heatMaskProvider;
    public final CardModelView.ViewModel initialViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardMaterial(CardModelView.ViewModel viewModel, CardAssetProvider cardAssetProvider, GLLauncher gLLauncher, EquatableBitmap equatableBitmap, zzr zzrVar) {
        super(gLLauncher);
        viewModel.getClass();
        cardAssetProvider.getClass();
        gLLauncher.getClass();
        this.initialViewModel = viewModel;
        this.assetManager = cardAssetProvider;
        this.glLauncher = gLLauncher;
        this.customizationOverride = equatableBitmap;
        this.heatMaskProvider = zzrVar;
        gLLauncher.launch(new Pager$pageFetcher$2(this, null, 10));
        this.crossfadeMultiplier = 1.0f;
    }

    @Override // com.squareup.cash.graphics.swampgl.components.PBRMaterial, com.squareup.cash.graphics.swampgl.components.Material
    public final void bind(RealUniformBinder realUniformBinder) {
        this.materialInput.crossfadeMultiplier = this.crossfadeMultiplier;
        super.bind(realUniformBinder);
    }

    @Override // com.squareup.cash.graphics.swampgl.components.PBRMaterial
    public final MaterialPlugin createPlugin() {
        SingleCardMaterialPlugin singleCardMaterialPlugin = new SingleCardMaterialPlugin(this.initialViewModel, this.assetManager, this.glLauncher, new CardMaterial$$ExternalSyntheticLambda0(this, 0), new CardMaterial$$ExternalSyntheticLambda0(this, 1), this.heatMaskProvider, this.customizationOverride);
        this.cardPlugin = singleCardMaterialPlugin;
        return singleCardMaterialPlugin;
    }

    public final void dispose() {
        MaterialPlugin materialPlugin = this.plugin;
        if (materialPlugin != null) {
            materialPlugin.dispose();
        }
    }

    public final void setIcon(Bitmap bitmap, RectF rectF, float f) {
        bitmap.getClass();
        rectF.getClass();
        SingleCardMaterialPlugin singleCardMaterialPlugin = this.cardPlugin;
        if (singleCardMaterialPlugin != null) {
            singleCardMaterialPlugin.iconBitmap = bitmap;
            singleCardMaterialPlugin.uploadIconBitmap();
            singleCardMaterialPlugin.iconRectLeft = rectF.left;
            singleCardMaterialPlugin.iconRectTop = rectF.top;
            singleCardMaterialPlugin.iconRectWidth = rectF.width();
            singleCardMaterialPlugin.iconRectHeight = rectF.height();
            singleCardMaterialPlugin.indicatorColor = 1291845632;
            singleCardMaterialPlugin.indicatorRadius = f;
            singleCardMaterialPlugin.onParametersChanged.invoke();
        }
    }
}
