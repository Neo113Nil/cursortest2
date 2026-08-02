package com.squareup.cash.card.onboarding.core;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import androidx.compose.ui.text.android.LayoutCompat_androidKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.mlkit.vision.text.internal.zzr;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.card.onboarding.EquatableBitmap;
import com.squareup.cash.graphics.swampgl.GLLauncher;
import com.squareup.cash.graphics.swampgl.components.Material;
import com.squareup.cash.graphics.swampgl.gl.TextureType;
import com.squareup.protos.franklin.cards.CardTheme;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class SingleCardMaterialPlugin extends BaseCardMaterialPlugin {
    public final Lazy _programSource$delegate;
    public final CardAssetProvider assetManager;
    public TextureSet current;
    public EquatableBitmap currentCustomizationOverride;
    public final GLLauncher glLauncher;
    public final HeatMaskProvider heatMaskProvider;
    public Bitmap iconBitmap;
    public final CardModelView.ViewModel initialViewModel;
    public final CardMaterial$$ExternalSyntheticLambda0 onParametersChanged;
    public final CardMaterial$$ExternalSyntheticLambda0 onReady;
    public final MutexImpl textureMutex;

    /* renamed from: com.squareup.cash.card.onboarding.core.SingleCardMaterialPlugin$2, reason: invalid class name */
    public final class AnonymousClass2 extends SuspendLambda implements Function1 {
        public int I$0;
        public long J$0;
        public long J$3;
        public Mutex L$0;
        public SingleCardMaterialPlugin L$1;
        public CardTextureKeys L$2;
        public int label;

        public AnonymousClass2(Continuation continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return SingleCardMaterialPlugin.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return ((AnonymousClass2) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v5, types: [kotlinx.coroutines.sync.Mutex] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MutexImpl mutexImpl;
            int i;
            SingleCardMaterialPlugin singleCardMaterialPlugin;
            Mutex mutex;
            CardTextureKeys cardTextureKeys;
            long j;
            long j2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.label;
            try {
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SingleCardMaterialPlugin singleCardMaterialPlugin2 = SingleCardMaterialPlugin.this;
                    mutexImpl = singleCardMaterialPlugin2.textureMutex;
                    this.L$0 = mutexImpl;
                    this.L$1 = singleCardMaterialPlugin2;
                    i = 0;
                    this.I$0 = 0;
                    this.label = 1;
                    if (mutexImpl.lock(this) != coroutineSingletons) {
                        singleCardMaterialPlugin = singleCardMaterialPlugin2;
                    }
                    return coroutineSingletons;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j2 = this.J$3;
                    j = this.J$0;
                    cardTextureKeys = this.L$2;
                    singleCardMaterialPlugin = this.L$1;
                    mutex = this.L$0;
                    try {
                        SafeTrace.throwOnFailure(obj);
                        Pair pair = (Pair) obj;
                        CardTextureIds cardTextureIds = (CardTextureIds) pair.first;
                        Map map = (Map) pair.second;
                        long currentTimeMillis = System.currentTimeMillis() - j2;
                        singleCardMaterialPlugin.current = new TextureSet(cardTextureKeys, cardTextureIds);
                        long currentTimeMillis2 = System.currentTimeMillis() - j;
                        CardTheme.Identifier identifier = singleCardMaterialPlugin.initialViewModel.id;
                        map.getClass();
                        Timber.Forest forest = Timber.Forest;
                        forest.tag("SingleCardMaterialPlugin");
                        forest.d("Initial load: %dms total, %dms textures (card=%s)", new Long(currentTimeMillis2), new Long(currentTimeMillis), identifier);
                        singleCardMaterialPlugin.onReady.invoke();
                        mutex.unlock(null);
                        return Unit.INSTANCE;
                    } catch (Throwable th) {
                        th = th;
                        mutex.unlock(null);
                        throw th;
                    }
                }
                int i3 = this.I$0;
                SingleCardMaterialPlugin singleCardMaterialPlugin3 = this.L$1;
                ?? r5 = this.L$0;
                SafeTrace.throwOnFailure(obj);
                i = i3;
                mutexImpl = r5;
                singleCardMaterialPlugin = singleCardMaterialPlugin3;
                if (singleCardMaterialPlugin.current != null) {
                    Unit unit = Unit.INSTANCE;
                    mutexImpl.unlock(null);
                    return unit;
                }
                long currentTimeMillis3 = System.currentTimeMillis();
                System.currentTimeMillis();
                CardTextureKeys createTextureKeys = SingleCardMaterialPlugin.createTextureKeys(singleCardMaterialPlugin.initialViewModel, singleCardMaterialPlugin.currentCustomizationOverride);
                System.currentTimeMillis();
                long currentTimeMillis4 = System.currentTimeMillis();
                this.L$0 = mutexImpl;
                this.L$1 = singleCardMaterialPlugin;
                this.L$2 = createTextureKeys;
                this.I$0 = i;
                this.J$0 = currentTimeMillis3;
                this.J$3 = currentTimeMillis4;
                this.label = 2;
                try {
                    Object coroutineScope = JobKt.coroutineScope(new SingleCardMaterialPlugin$acquireAllTexturesWithTiming$2(singleCardMaterialPlugin, createTextureKeys, null), this);
                    if (coroutineScope != coroutineSingletons) {
                        cardTextureKeys = createTextureKeys;
                        j = currentTimeMillis3;
                        obj = coroutineScope;
                        mutex = mutexImpl;
                        j2 = currentTimeMillis4;
                        Pair pair2 = (Pair) obj;
                        CardTextureIds cardTextureIds2 = (CardTextureIds) pair2.first;
                        Map map2 = (Map) pair2.second;
                        long currentTimeMillis5 = System.currentTimeMillis() - j2;
                        singleCardMaterialPlugin.current = new TextureSet(cardTextureKeys, cardTextureIds2);
                        long currentTimeMillis22 = System.currentTimeMillis() - j;
                        CardTheme.Identifier identifier2 = singleCardMaterialPlugin.initialViewModel.id;
                        map2.getClass();
                        Timber.Forest forest2 = Timber.Forest;
                        forest2.tag("SingleCardMaterialPlugin");
                        forest2.d("Initial load: %dms total, %dms textures (card=%s)", new Long(currentTimeMillis22), new Long(currentTimeMillis5), identifier2);
                        singleCardMaterialPlugin.onReady.invoke();
                        mutex.unlock(null);
                        return Unit.INSTANCE;
                    }
                    return coroutineSingletons;
                } catch (Throwable th2) {
                    th = th2;
                    mutex = mutexImpl;
                    mutex.unlock(null);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public final class TextureSet {
        public final CardTextureIds ids;
        public final CardTextureKeys keys;

        public TextureSet(CardTextureKeys cardTextureKeys, CardTextureIds cardTextureIds) {
            cardTextureKeys.getClass();
            cardTextureIds.getClass();
            this.keys = cardTextureKeys;
            this.ids = cardTextureIds;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TextureSet)) {
                return false;
            }
            TextureSet textureSet = (TextureSet) obj;
            return Intrinsics.areEqual(this.keys, textureSet.keys) && Intrinsics.areEqual(this.ids, textureSet.ids);
        }

        public final int hashCode() {
            return this.ids.hashCode() + (this.keys.hashCode() * 31);
        }

        public final String toString() {
            return "TextureSet(keys=" + this.keys + ", ids=" + this.ids + ")";
        }
    }

    public SingleCardMaterialPlugin(CardModelView.ViewModel viewModel, CardAssetProvider cardAssetProvider, GLLauncher gLLauncher, CardMaterial$$ExternalSyntheticLambda0 cardMaterial$$ExternalSyntheticLambda0, CardMaterial$$ExternalSyntheticLambda0 cardMaterial$$ExternalSyntheticLambda02, zzr zzrVar, EquatableBitmap equatableBitmap) {
        viewModel.getClass();
        cardAssetProvider.getClass();
        gLLauncher.getClass();
        this.baseColor = -1;
        this.baseOpacity = 1.0f;
        this.roughness = 0.4f;
        this.metallic = 1.0f;
        this.inkColor = -16777216;
        this.backInkColor = -16777216;
        this.magStripeColor = -12303292;
        this.backMagStripeColor = -12303292;
        this.inkRoughness = 0.8f;
        this.metallicRoughness = 0.1f;
        this.metallicClearCoat = 1.0f;
        this.shimmerScale = 1.0f;
        this.indicatorRadius = 0.4f;
        this.holoOffsetScale = 1.0f;
        this.initialViewModel = viewModel;
        this.assetManager = cardAssetProvider;
        this.glLauncher = gLLauncher;
        this.onReady = cardMaterial$$ExternalSyntheticLambda0;
        this.onParametersChanged = cardMaterial$$ExternalSyntheticLambda02;
        this.heatMaskProvider = zzrVar;
        this._programSource$delegate = LazyKt.lazy(new CardScene$$ExternalSyntheticLambda1(this));
        this.textureMutex = new MutexImpl();
        this.currentCustomizationOverride = equatableBitmap;
        updateParameters(viewModel);
        gLLauncher.launch(new AnonymousClass2(null));
    }

    public static CardTextureKeys createTextureKeys(CardModelView.ViewModel viewModel, EquatableBitmap equatableBitmap) {
        CardTheme.Identifier identifier = viewModel.id;
        CardTheme.BackgroundImage backgroundImage = viewModel.backgroundImage;
        LayoutCompat_androidKt layoutCompat_androidKt = CardAssetManager$AssetKey$Placeholder.INSTANCE;
        if (identifier == null) {
            return new CardTextureKeys(layoutCompat_androidKt, layoutCompat_androidKt, layoutCompat_androidKt, layoutCompat_androidKt, layoutCompat_androidKt, layoutCompat_androidKt, layoutCompat_androidKt, layoutCompat_androidKt);
        }
        if (backgroundImage == CardTheme.BackgroundImage.MOOD) {
            layoutCompat_androidKt = CardAssetManager$AssetKey$SnakeSkin.INSTANCE;
        }
        Paint paint = CardModelView.REMOVE_PAINT;
        CardModelView.CardFront copy$default = CardModelView.CardFront.copy$default(CardModelView.Companion.toCardFront(viewModel), equatableBitmap);
        CardAssetManager$AssetKey$Albedo cardAssetManager$AssetKey$Albedo = new CardAssetManager$AssetKey$Albedo(identifier, viewModel.color, viewModel.backgroundImage, viewModel.backInkColor, viewModel.magStripColor, CardModelView.Companion.toCardBack(viewModel), (int) (viewModel.opacity * 255.0f));
        CardAssetManager$AssetKey$Normal cardAssetManager$AssetKey$Normal = new CardAssetManager$AssetKey$Normal(backgroundImage);
        CardAssetManager$AssetKey$InkMetalHeat cardAssetManager$AssetKey$InkMetalHeat = new CardAssetManager$AssetKey$InkMetalHeat(copy$default, CardModelView.Companion.toCardBack(viewModel));
        CardAssetManager$AssetKey$HeatColors cardAssetManager$AssetKey$HeatColors = new CardAssetManager$AssetKey$HeatColors(backgroundImage);
        CardAssetManager$AssetKey$HoloBase cardAssetManager$AssetKey$HoloBase = new CardAssetManager$AssetKey$HoloBase(identifier);
        CardAssetManager$AssetKey$HoloReflect cardAssetManager$AssetKey$HoloReflect = new CardAssetManager$AssetKey$HoloReflect(identifier);
        return new CardTextureKeys(cardAssetManager$AssetKey$Albedo, cardAssetManager$AssetKey$Normal, cardAssetManager$AssetKey$InkMetalHeat, cardAssetManager$AssetKey$HeatColors, CardAssetManager$AssetKey$Shimmer.INSTANCE, cardAssetManager$AssetKey$HoloBase, cardAssetManager$AssetKey$HoloReflect, layoutCompat_androidKt);
    }

    @Override // com.squareup.cash.graphics.swampgl.components.MaterialPlugin
    public final void dispose() {
        TextureSet textureSet = this.current;
        if (textureSet != null) {
            releaseAllTextures(textureSet.keys);
        }
        this.current = null;
    }

    @Override // com.squareup.cash.graphics.swampgl.components.MaterialPlugin
    public final Material.ProgramSource getProgramSource() {
        return (Material.ProgramSource) this._programSource$delegate.getValue();
    }

    public final void releaseAllTextures(CardTextureKeys cardTextureKeys) {
        LayoutCompat_androidKt layoutCompat_androidKt = cardTextureKeys.albedo;
        CardAssetManager cardAssetManager = (CardAssetManager) this.assetManager;
        cardAssetManager.release(layoutCompat_androidKt);
        cardAssetManager.release(cardTextureKeys.normal);
        cardAssetManager.release(cardTextureKeys.inkMetalHeat);
        cardAssetManager.release(cardTextureKeys.heatColors);
        CardAssetManager$AssetKey$Placeholder cardAssetManager$AssetKey$Placeholder = CardAssetManager$AssetKey$Placeholder.INSTANCE;
        cardAssetManager.release(cardAssetManager$AssetKey$Placeholder);
        cardAssetManager.release(cardTextureKeys.shimmer);
        cardAssetManager.release(cardTextureKeys.holoBase);
        cardAssetManager.release(cardTextureKeys.holoReflect);
        cardAssetManager.release(cardAssetManager$AssetKey$Placeholder);
        cardAssetManager.release(cardTextureKeys.snakeSkin);
    }

    public final void uploadIconBitmap() {
        TextureSet textureSet;
        CardTextureIds cardTextureIds;
        int i;
        Bitmap bitmap = this.iconBitmap;
        if (bitmap == null || (textureSet = this.current) == null || (cardTextureIds = textureSet.ids) == null) {
            return;
        }
        int i2 = cardTextureIds.icon;
        int ordinal = TextureType.COLOR.ordinal();
        if (ordinal == 0) {
            i = 9729;
        } else {
            if (ordinal != 1 && ordinal != 2) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            i = 9728;
        }
        GLES20.glActiveTexture(34000);
        GLES20.glBindTexture(3553, i2);
        GLES20.glTexParameteri(3553, 10241, i);
        GLES20.glTexParameteri(3553, 10240, i);
        GLUtils.texImage2D(3553, 0, bitmap, 0);
        CompositeException.WrappedPrintStream.checkGlError("texImage2D");
    }
}
