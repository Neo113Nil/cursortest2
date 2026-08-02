package com.squareup.cash.card.onboarding.core.instancing;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.glance.session.SessionWorkerKt$runSession$5;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.paging.Pager$pageFetcher$2;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.material.internal.ViewUtils;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.card.onboarding.core.HeatMaskRenderer;
import com.squareup.cash.graphics.swampgl.Engine;
import com.squareup.cash.graphics.swampgl.components.Entity;
import com.squareup.cash.graphics.swampgl.components.MeshGeometry;
import com.squareup.cash.graphics.swampgl.components.Transform;
import com.squareup.protos.franklin.cards.CardTheme;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.IndexedValue;
import kotlin.collections.IndexingIterable;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.ArrayIterator;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class InstancedCardBatch {
    public static final Set DOUBLE_SIDED_CARD_IDS = ArraysKt___ArraysKt.toSet(new CardTheme.Identifier[]{CardTheme.Identifier.HOLO_ID, CardTheme.Identifier.GLITTER_ID, CardTheme.Identifier.TORTOISE_ID});
    public final StateFlowImpl _dirty;
    public final StateFlowImpl _loadedCardIndices;
    public final StateFlowImpl _ready;
    public final StateFlowImpl _texturesReady;
    public final ArrayList activeUploadJobs;
    public final ViewUtils.RelativePadding albedoArray;
    public final FloatBuffer cachedUboBuffer;
    public final float[] cachedUboData;
    public final FloatBuffer cachedVboBuffer;
    public final float[] cachedVboData;
    public List cardMetadata;
    public List cardNeedsDoubleSided;
    public final Context context;
    public final float crossfadeMultiplier;
    public int culledInstanceCount;
    public List currentTextureIndices;
    public final Engine engine;
    public final Lazy entity$delegate;
    public boolean hasMoodCards;
    public int heatColorsTextureId;
    public final float heatIntensity;
    public HeatMaskRenderer heatMaskRenderer;
    public final ViewUtils.RelativePadding holoBaseArray;
    public final ViewUtils.RelativePadding holoReflectArray;
    public float holoReflectionDirOffsetX;
    public float holoReflectionDirOffsetY;
    public float iblIntensity;
    public final ViewUtils.RelativePadding inkMetalHeatArray;
    public int instanceVboId;
    public final ViewUtils.RelativePadding normalArray;
    public List perCardLayerIndices;
    public int placeholderTextureId;
    public final float roughnessMultiplier;
    public MeshGeometry sharedGeometry;
    public long sharedTextureMemoryBytes;
    public int shimmerTextureId;
    public int snakeSkinTextureId;
    public final float textureScaleFactor;
    public int uboId;

    public final class AlbedoKey {
        public final int backInkColor;
        public final CardTheme.BackgroundImage background;
        public final int color;
        public final CardTheme.Identifier id;
        public final int magStripColor;
        public final int opacity;

        public AlbedoKey(CardTheme.Identifier identifier, CardTheme.BackgroundImage backgroundImage, int i, int i2, int i3, int i4) {
            this.id = identifier;
            this.background = backgroundImage;
            this.color = i;
            this.backInkColor = i2;
            this.magStripColor = i3;
            this.opacity = i4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AlbedoKey)) {
                return false;
            }
            AlbedoKey albedoKey = (AlbedoKey) obj;
            return this.id == albedoKey.id && this.background == albedoKey.background && this.color == albedoKey.color && this.backInkColor == albedoKey.backInkColor && this.magStripColor == albedoKey.magStripColor && this.opacity == albedoKey.opacity;
        }

        public final int hashCode() {
            CardTheme.Identifier identifier = this.id;
            int hashCode = (identifier == null ? 0 : identifier.hashCode()) * 31;
            CardTheme.BackgroundImage backgroundImage = this.background;
            return Integer.hashCode(this.opacity) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.magStripColor, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.backInkColor, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.color, (hashCode + (backgroundImage != null ? backgroundImage.hashCode() : 0)) * 31, 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AlbedoKey(id=");
            sb.append(this.id);
            sb.append(", background=");
            sb.append(this.background);
            sb.append(", color=");
            Recorder$$ExternalSyntheticOutline1.m105m(this.color, this.backInkColor, ", backInkColor=", ", magStripColor=", sb);
            return Recorder$$ExternalSyntheticOutline1.m(this.magStripColor, this.opacity, ", opacity=", ")", sb);
        }
    }

    public final class CardInstanceData {
        public final float backInkColorB;
        public final float backInkColorG;
        public final float backInkColorR;
        public final float baseColorB;
        public final float baseColorG;
        public final float baseColorR;
        public final float clearCoat;
        public final float clearCoatRoughness;
        public final float hasSnakeSkin;
        public final float inkClearCoat;
        public final float inkClearCoatRoughness;
        public final float inkColorB;
        public final float inkColorG;
        public final float inkColorR;
        public final float inkRoughness;
        public final float isHolo;
        public final float isMood;
        public final float magStripeColorB;
        public final float magStripeColorG;
        public final float magStripeColorR;
        public final float metallic;
        public final float metallicClearCoat;
        public final float metallicClearCoatRoughness;
        public final float metallicRoughness;
        public final float opacity;
        public final float roughness;

        public CardInstanceData(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, float f23, float f24, float f25, float f26) {
            this.isHolo = f;
            this.isMood = f2;
            this.hasSnakeSkin = f3;
            this.baseColorR = f4;
            this.baseColorG = f5;
            this.baseColorB = f6;
            this.opacity = f7;
            this.inkColorR = f8;
            this.inkColorG = f9;
            this.inkColorB = f10;
            this.backInkColorR = f11;
            this.backInkColorG = f12;
            this.backInkColorB = f13;
            this.magStripeColorR = f14;
            this.magStripeColorG = f15;
            this.magStripeColorB = f16;
            this.roughness = f17;
            this.metallic = f18;
            this.clearCoat = f19;
            this.clearCoatRoughness = f20;
            this.inkRoughness = f21;
            this.inkClearCoat = f22;
            this.inkClearCoatRoughness = f23;
            this.metallicRoughness = f24;
            this.metallicClearCoat = f25;
            this.metallicClearCoatRoughness = f26;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CardInstanceData)) {
                return false;
            }
            CardInstanceData cardInstanceData = (CardInstanceData) obj;
            return Float.compare(this.isHolo, cardInstanceData.isHolo) == 0 && Float.compare(this.isMood, cardInstanceData.isMood) == 0 && Float.compare(this.hasSnakeSkin, cardInstanceData.hasSnakeSkin) == 0 && Float.compare(this.baseColorR, cardInstanceData.baseColorR) == 0 && Float.compare(this.baseColorG, cardInstanceData.baseColorG) == 0 && Float.compare(this.baseColorB, cardInstanceData.baseColorB) == 0 && Float.compare(this.opacity, cardInstanceData.opacity) == 0 && Float.compare(this.inkColorR, cardInstanceData.inkColorR) == 0 && Float.compare(this.inkColorG, cardInstanceData.inkColorG) == 0 && Float.compare(this.inkColorB, cardInstanceData.inkColorB) == 0 && Float.compare(this.backInkColorR, cardInstanceData.backInkColorR) == 0 && Float.compare(this.backInkColorG, cardInstanceData.backInkColorG) == 0 && Float.compare(this.backInkColorB, cardInstanceData.backInkColorB) == 0 && Float.compare(this.magStripeColorR, cardInstanceData.magStripeColorR) == 0 && Float.compare(this.magStripeColorG, cardInstanceData.magStripeColorG) == 0 && Float.compare(this.magStripeColorB, cardInstanceData.magStripeColorB) == 0 && Float.compare(this.roughness, cardInstanceData.roughness) == 0 && Float.compare(this.metallic, cardInstanceData.metallic) == 0 && Float.compare(this.clearCoat, cardInstanceData.clearCoat) == 0 && Float.compare(this.clearCoatRoughness, cardInstanceData.clearCoatRoughness) == 0 && Float.compare(this.inkRoughness, cardInstanceData.inkRoughness) == 0 && Float.compare(this.inkClearCoat, cardInstanceData.inkClearCoat) == 0 && Float.compare(this.inkClearCoatRoughness, cardInstanceData.inkClearCoatRoughness) == 0 && Float.compare(this.metallicRoughness, cardInstanceData.metallicRoughness) == 0 && Float.compare(this.metallicClearCoat, cardInstanceData.metallicClearCoat) == 0 && Float.compare(this.metallicClearCoatRoughness, cardInstanceData.metallicClearCoatRoughness) == 0 && Float.compare(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(RecyclerView.DECELERATION_RATE) + CameraState$Type$EnumUnboxingLocalUtility.m(this.metallicClearCoatRoughness, CameraState$Type$EnumUnboxingLocalUtility.m(this.metallicClearCoat, CameraState$Type$EnumUnboxingLocalUtility.m(this.metallicRoughness, CameraState$Type$EnumUnboxingLocalUtility.m(this.inkClearCoatRoughness, CameraState$Type$EnumUnboxingLocalUtility.m(this.inkClearCoat, CameraState$Type$EnumUnboxingLocalUtility.m(this.inkRoughness, CameraState$Type$EnumUnboxingLocalUtility.m(this.clearCoatRoughness, CameraState$Type$EnumUnboxingLocalUtility.m(this.clearCoat, CameraState$Type$EnumUnboxingLocalUtility.m(this.metallic, CameraState$Type$EnumUnboxingLocalUtility.m(this.roughness, CameraState$Type$EnumUnboxingLocalUtility.m(this.magStripeColorB, CameraState$Type$EnumUnboxingLocalUtility.m(this.magStripeColorG, CameraState$Type$EnumUnboxingLocalUtility.m(this.magStripeColorR, CameraState$Type$EnumUnboxingLocalUtility.m(this.backInkColorB, CameraState$Type$EnumUnboxingLocalUtility.m(this.backInkColorG, CameraState$Type$EnumUnboxingLocalUtility.m(this.backInkColorR, CameraState$Type$EnumUnboxingLocalUtility.m(this.inkColorB, CameraState$Type$EnumUnboxingLocalUtility.m(this.inkColorG, CameraState$Type$EnumUnboxingLocalUtility.m(this.inkColorR, CameraState$Type$EnumUnboxingLocalUtility.m(this.opacity, CameraState$Type$EnumUnboxingLocalUtility.m(this.baseColorB, CameraState$Type$EnumUnboxingLocalUtility.m(this.baseColorG, CameraState$Type$EnumUnboxingLocalUtility.m(this.baseColorR, CameraState$Type$EnumUnboxingLocalUtility.m(this.hasSnakeSkin, CameraState$Type$EnumUnboxingLocalUtility.m(this.isMood, Float.hashCode(this.isHolo) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CardInstanceData(isHolo=", this.isHolo, ", isMood=", this.isMood, ", hasSnakeSkin=");
            Request$Priority$EnumUnboxingLocalUtility.m(m, this.hasSnakeSkin, ", baseColorR=", this.baseColorR, ", baseColorG=");
            Request$Priority$EnumUnboxingLocalUtility.m(m, this.baseColorG, ", baseColorB=", this.baseColorB, ", opacity=");
            Request$Priority$EnumUnboxingLocalUtility.m(m, this.opacity, ", inkColorR=", this.inkColorR, ", inkColorG=");
            Request$Priority$EnumUnboxingLocalUtility.m(m, this.inkColorG, ", inkColorB=", this.inkColorB, ", backInkColorR=");
            Request$Priority$EnumUnboxingLocalUtility.m(m, this.backInkColorR, ", backInkColorG=", this.backInkColorG, ", backInkColorB=");
            Request$Priority$EnumUnboxingLocalUtility.m(m, this.backInkColorB, ", magStripeColorR=", this.magStripeColorR, ", magStripeColorG=");
            Request$Priority$EnumUnboxingLocalUtility.m(m, this.magStripeColorG, ", magStripeColorB=", this.magStripeColorB, ", roughness=");
            Request$Priority$EnumUnboxingLocalUtility.m(m, this.roughness, ", metallic=", this.metallic, ", clearCoat=");
            Request$Priority$EnumUnboxingLocalUtility.m(m, this.clearCoat, ", clearCoatRoughness=", this.clearCoatRoughness, ", inkRoughness=");
            Request$Priority$EnumUnboxingLocalUtility.m(m, this.inkRoughness, ", inkClearCoat=", this.inkClearCoat, ", inkClearCoatRoughness=");
            Request$Priority$EnumUnboxingLocalUtility.m(m, this.inkClearCoatRoughness, ", metallicRoughness=", this.metallicRoughness, ", metallicClearCoat=");
            m.append(this.metallicClearCoat);
            m.append(", metallicClearCoatRoughness=");
            m.append(this.metallicClearCoatRoughness);
            m.append(", glitterRoughness=0.0)");
            return m.toString();
        }
    }

    public final class HoloKey {
        public final boolean isHolo;

        public HoloKey(boolean z) {
            this.isHolo = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HoloKey) && this.isHolo == ((HoloKey) obj).isHolo;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isHolo);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("HoloKey(isHolo=", ")", this.isHolo);
        }
    }

    public final class InkMetalHeatKey {
        public final boolean hasCashtag;
        public final boolean hasCustomization;

        /* renamed from: type, reason: collision with root package name */
        public final InkMetalHeatType f1064type;

        public InkMetalHeatKey(InkMetalHeatType inkMetalHeatType, boolean z, boolean z2) {
            this.f1064type = inkMetalHeatType;
            this.hasCustomization = z;
            this.hasCashtag = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InkMetalHeatKey)) {
                return false;
            }
            InkMetalHeatKey inkMetalHeatKey = (InkMetalHeatKey) obj;
            return this.f1064type == inkMetalHeatKey.f1064type && this.hasCustomization == inkMetalHeatKey.hasCustomization && this.hasCashtag == inkMetalHeatKey.hasCashtag;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.hasCashtag) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.f1064type.hashCode() * 31, 31, this.hasCustomization);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InkMetalHeatKey(type=");
            sb.append(this.f1064type);
            sb.append(", hasCustomization=");
            sb.append(this.hasCustomization);
            sb.append(", hasCashtag=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.hasCashtag, ")");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class InkMetalHeatType {
        public static final /* synthetic */ InkMetalHeatType[] $VALUES;
        public static final InkMetalHeatType DEFAULT;
        public static final InkMetalHeatType DREAM;
        public static final InkMetalHeatType GLITTER;
        public static final InkMetalHeatType METAL;
        public static final InkMetalHeatType MOOD;
        public static final InkMetalHeatType SHANTELL_MARTIN;
        public static final InkMetalHeatType TORTOISE;

        static {
            InkMetalHeatType inkMetalHeatType = new InkMetalHeatType("DEFAULT", 0);
            DEFAULT = inkMetalHeatType;
            InkMetalHeatType inkMetalHeatType2 = new InkMetalHeatType("GLITTER", 1);
            GLITTER = inkMetalHeatType2;
            InkMetalHeatType inkMetalHeatType3 = new InkMetalHeatType("TORTOISE", 2);
            TORTOISE = inkMetalHeatType3;
            InkMetalHeatType inkMetalHeatType4 = new InkMetalHeatType("MOOD", 3);
            MOOD = inkMetalHeatType4;
            InkMetalHeatType inkMetalHeatType5 = new InkMetalHeatType("SHANTELL_MARTIN", 4);
            SHANTELL_MARTIN = inkMetalHeatType5;
            InkMetalHeatType inkMetalHeatType6 = new InkMetalHeatType("DREAM", 5);
            DREAM = inkMetalHeatType6;
            InkMetalHeatType inkMetalHeatType7 = new InkMetalHeatType("METAL", 6);
            METAL = inkMetalHeatType7;
            $VALUES = new InkMetalHeatType[]{inkMetalHeatType, inkMetalHeatType2, inkMetalHeatType3, inkMetalHeatType4, inkMetalHeatType5, inkMetalHeatType6, inkMetalHeatType7};
        }

        public static InkMetalHeatType valueOf(String str) {
            return (InkMetalHeatType) Enum.valueOf(InkMetalHeatType.class, str);
        }

        public static InkMetalHeatType[] values() {
            return (InkMetalHeatType[]) $VALUES.clone();
        }
    }

    public final class NormalKey {

        /* renamed from: type, reason: collision with root package name */
        public final NormalType f1065type;

        public NormalKey(NormalType normalType) {
            this.f1065type = normalType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NormalKey) && this.f1065type == ((NormalKey) obj).f1065type;
        }

        public final int hashCode() {
            return this.f1065type.hashCode();
        }

        public final String toString() {
            return "NormalKey(type=" + this.f1065type + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class NormalType {
        public static final /* synthetic */ NormalType[] $VALUES;
        public static final NormalType FLAT;
        public static final NormalType GLITTER;
        public static final NormalType MOOD;
        public static final NormalType TORTOISE;

        static {
            NormalType normalType = new NormalType("FLAT", 0);
            FLAT = normalType;
            NormalType normalType2 = new NormalType("GLITTER", 1);
            GLITTER = normalType2;
            NormalType normalType3 = new NormalType("TORTOISE", 2);
            TORTOISE = normalType3;
            NormalType normalType4 = new NormalType("MOOD", 3);
            MOOD = normalType4;
            $VALUES = new NormalType[]{normalType, normalType2, normalType3, normalType4};
        }

        public static NormalType valueOf(String str) {
            return (NormalType) Enum.valueOf(NormalType.class, str);
        }

        public static NormalType[] values() {
            return (NormalType[]) $VALUES.clone();
        }
    }

    public final class TextureLayerIndices {
        public final int albedoLayer;
        public final int holoBaseLayer;
        public final int holoReflectLayer;
        public final int inkMetalHeatLayer;
        public final int normalLayer;

        public TextureLayerIndices(int i, int i2, int i3, int i4, int i5) {
            this.albedoLayer = i;
            this.normalLayer = i2;
            this.inkMetalHeatLayer = i3;
            this.holoBaseLayer = i4;
            this.holoReflectLayer = i5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TextureLayerIndices)) {
                return false;
            }
            TextureLayerIndices textureLayerIndices = (TextureLayerIndices) obj;
            return this.albedoLayer == textureLayerIndices.albedoLayer && this.normalLayer == textureLayerIndices.normalLayer && this.inkMetalHeatLayer == textureLayerIndices.inkMetalHeatLayer && this.holoBaseLayer == textureLayerIndices.holoBaseLayer && this.holoReflectLayer == textureLayerIndices.holoReflectLayer;
        }

        public final int hashCode() {
            return Integer.hashCode(this.holoReflectLayer) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.holoBaseLayer, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.inkMetalHeatLayer, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.normalLayer, Integer.hashCode(this.albedoLayer) * 31, 31), 31), 31);
        }

        public final String toString() {
            StringBuilder m107m = Recorder$$ExternalSyntheticOutline2.m107m(this.albedoLayer, this.normalLayer, "TextureLayerIndices(albedoLayer=", ", normalLayer=", ", inkMetalHeatLayer=");
            Recorder$$ExternalSyntheticOutline1.m105m(this.inkMetalHeatLayer, this.holoBaseLayer, ", holoBaseLayer=", ", holoReflectLayer=", m107m);
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.holoReflectLayer, ")", m107m);
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CardTheme.BackgroundImage.values().length];
            try {
                iArr[CardTheme.BackgroundImage.GLITTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CardTheme.BackgroundImage.TORTOISE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CardTheme.BackgroundImage.MOOD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CardTheme.BackgroundImage.SHANTELL_MARTIN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CardTheme.BackgroundImage.DREAM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CardTheme.BackgroundImage.METAL_BLACK.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CardTheme.BackgroundImage.METAL_OIL_SLICK.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public InstancedCardBatch(Context context, Engine engine) {
        context.getClass();
        engine.getClass();
        this.context = context;
        this.engine = engine;
        Object systemService = context.getSystemService("activity");
        systemService.getClass();
        ActivityManager activityManager = (ActivityManager) systemService;
        int memoryClass = activityManager.getMemoryClass();
        int largeMemoryClass = activityManager.getLargeMemoryClass();
        int i = 0;
        boolean z = memoryClass < 192;
        float f = z ? 0.5f : 1.0f;
        Timber.Forest.i("[CardTextureScale] selected=%.2fx tier=%s memoryClass=%dMB largeMemoryClass=%dMB threshold=<%dMB", Float.valueOf(f), z ? "LOW" : "NORMAL", Integer.valueOf(memoryClass), Integer.valueOf(largeMemoryClass), 192);
        this.textureScaleFactor = f;
        this.heatIntensity = 1.0f;
        this.crossfadeMultiplier = 1.0f;
        this.roughnessMultiplier = 1.0f;
        this.iblIntensity = 1.6f;
        this.albedoArray = new ViewUtils.RelativePadding();
        this.normalArray = new ViewUtils.RelativePadding();
        this.inkMetalHeatArray = new ViewUtils.RelativePadding();
        this.holoBaseArray = new ViewUtils.RelativePadding();
        this.holoReflectArray = new ViewUtils.RelativePadding();
        this.activeUploadJobs = new ArrayList();
        EmptyList emptyList = EmptyList.INSTANCE;
        this.cardMetadata = emptyList;
        this.cardNeedsDoubleSided = emptyList;
        this.perCardLayerIndices = emptyList;
        this.cachedVboData = new float[2000];
        this.cachedUboData = new float[4000];
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(8000).order(ByteOrder.nativeOrder()).asFloatBuffer();
        asFloatBuffer.getClass();
        this.cachedVboBuffer = asFloatBuffer;
        FloatBuffer asFloatBuffer2 = ByteBuffer.allocateDirect(16000).order(ByteOrder.nativeOrder()).asFloatBuffer();
        asFloatBuffer2.getClass();
        this.cachedUboBuffer = asFloatBuffer2;
        Boolean bool = Boolean.FALSE;
        this._ready = FlowKt.MutableStateFlow(bool);
        this._texturesReady = FlowKt.MutableStateFlow(bool);
        this._dirty = FlowKt.MutableStateFlow(Unit.INSTANCE);
        this._loadedCardIndices = FlowKt.MutableStateFlow(EmptySet.INSTANCE);
        this.entity$delegate = LazyKt.lazy(new InstancedCardBatch$$ExternalSyntheticLambda0(this, i));
    }

    public static final Bitmap access$scaleBitmapIfNeeded(InstancedCardBatch instancedCardBatch, Bitmap bitmap) {
        float f = instancedCardBatch.textureScaleFactor;
        if (f >= 1.0f) {
            Timber.Forest.d(Recorder$$ExternalSyntheticOutline2.m("[CardTextureScale] skip (factor=1.0) ", bitmap.getWidth(), bitmap.getHeight(), "x"), new Object[0]);
            return bitmap;
        }
        if (bitmap.getWidth() < 2 && bitmap.getHeight() < 2) {
            Timber.Forest.d(Recorder$$ExternalSyntheticOutline2.m("[CardTextureScale] skip (too small) ", bitmap.getWidth(), bitmap.getHeight(), "x"), new Object[0]);
            return bitmap;
        }
        int width = (int) (bitmap.getWidth() * f);
        if (width < 1) {
            width = 1;
        }
        int height = (int) (bitmap.getHeight() * f);
        if (height < 1) {
            height = 1;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, width, height, true);
        createScaledBitmap.getClass();
        Timber.Forest.d("[CardTextureScale] scaled %dx%d -> %dx%d (factor=%.2f)", Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), Integer.valueOf(createScaledBitmap.getWidth()), Integer.valueOf(createScaledBitmap.getHeight()), Float.valueOf(f));
        if (createScaledBitmap != bitmap) {
            bitmap.recycle();
        }
        return createScaledBitmap;
    }

    public final void dispose() {
        ArrayList arrayList = this.activeUploadJobs;
        Iterator it = arrayList.iterator();
        while (true) {
            Continuation continuation = null;
            if (!it.hasNext()) {
                arrayList.clear();
                this.engine.launch(new Pager$pageFetcher$2(this, continuation, 8));
                return;
            }
            ((Job) it.next()).cancel(null);
        }
    }

    public final Entity getEntity() {
        return (Entity) this.entity$delegate.getValue();
    }

    public final void recomputeReady() {
        Boolean valueOf = Boolean.valueOf(((Boolean) this._texturesReady.getValue()).booleanValue() && this.culledInstanceCount > 0);
        StateFlowImpl stateFlowImpl = this._ready;
        stateFlowImpl.getClass();
        stateFlowImpl.updateState(null, valueOf);
        this._dirty.setValue(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x06c3, code lost:
    
        if (((kotlinx.coroutines.JobSupport) r0).join(r9) != r10) goto L192;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0682  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /* JADX WARN: Type inference failed for: r24v0, types: [java.lang.Throwable, kotlin.coroutines.Continuation] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object setUniqueCards(List list, ContinuationImpl continuationImpl) {
        InstancedCardBatch$setUniqueCards$1 instancedCardBatch$setUniqueCards$1;
        int i;
        ArrayList arrayList;
        Engine engine;
        InstancedCardBatch$setUniqueCards$1 instancedCardBatch$setUniqueCards$12;
        boolean z;
        CoroutineSingletons coroutineSingletons;
        List list2;
        int i2;
        int i3;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        InkMetalHeatType inkMetalHeatType;
        List list3;
        Iterator it;
        InstancedCardBatch$setUniqueCards$7 instancedCardBatch$setUniqueCards$7;
        List list4;
        int i4;
        int i5;
        long j;
        ArrayList arrayList6;
        InstancedCardBatch instancedCardBatch = this;
        if (continuationImpl instanceof InstancedCardBatch$setUniqueCards$1) {
            instancedCardBatch$setUniqueCards$1 = (InstancedCardBatch$setUniqueCards$1) continuationImpl;
            int i6 = instancedCardBatch$setUniqueCards$1.label;
            if ((i6 & PKIFailureInfo.systemUnavail) != 0) {
                instancedCardBatch$setUniqueCards$1.label = i6 - PKIFailureInfo.systemUnavail;
                InstancedCardBatch$setUniqueCards$1 instancedCardBatch$setUniqueCards$13 = instancedCardBatch$setUniqueCards$1;
                Object obj = instancedCardBatch$setUniqueCards$13.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = instancedCardBatch$setUniqueCards$13.label;
                Engine engine2 = instancedCardBatch.engine;
                ArrayList arrayList7 = instancedCardBatch.activeUploadJobs;
                Object obj2 = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Boolean bool = Boolean.FALSE;
                    StateFlowImpl stateFlowImpl = instancedCardBatch._texturesReady;
                    stateFlowImpl.getClass();
                    stateFlowImpl.updateState(null, bool);
                    if (list.isEmpty()) {
                        instancedCardBatch.perCardLayerIndices = EmptyList.INSTANCE;
                        return Unit.INSTANCE;
                    }
                    Timber.Forest forest = Timber.Forest;
                    forest.d("=== KEY-BASED TEXTURE DEDUPLICATION ===", new Object[0]);
                    forest.d(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(list.size(), "Input cards: "), new Object[0]);
                    List<CardModelView.ViewModel> list5 = list;
                    ArrayList arrayList8 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list5, 10));
                    for (CardModelView.ViewModel viewModel : list5) {
                        arrayList8.add(new AlbedoKey(viewModel.id, viewModel.backgroundImage, viewModel.color, viewModel.backInkColor, viewModel.magStripColor, (int) (viewModel.opacity * 255.0f)));
                        obj2 = obj2;
                    }
                    ?? r24 = obj2;
                    ArrayList arrayList9 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list5, 10));
                    Iterator it2 = list5.iterator();
                    while (it2.hasNext()) {
                        CardTheme.BackgroundImage backgroundImage = ((CardModelView.ViewModel) it2.next()).backgroundImage;
                        int i7 = backgroundImage == null ? -1 : WhenMappings.$EnumSwitchMapping$0[backgroundImage.ordinal()];
                        arrayList9.add(new NormalKey(i7 != 1 ? i7 != 2 ? i7 != 3 ? NormalType.FLAT : NormalType.MOOD : NormalType.TORTOISE : NormalType.GLITTER));
                    }
                    ArrayList arrayList10 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list5, 10));
                    for (CardModelView.ViewModel viewModel2 : list5) {
                        CardTheme.BackgroundImage backgroundImage2 = viewModel2.backgroundImage;
                        switch (backgroundImage2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[backgroundImage2.ordinal()]) {
                            case 1:
                                inkMetalHeatType = InkMetalHeatType.GLITTER;
                                break;
                            case 2:
                                inkMetalHeatType = InkMetalHeatType.TORTOISE;
                                break;
                            case 3:
                                inkMetalHeatType = InkMetalHeatType.MOOD;
                                break;
                            case 4:
                                inkMetalHeatType = InkMetalHeatType.SHANTELL_MARTIN;
                                break;
                            case 5:
                                inkMetalHeatType = InkMetalHeatType.DREAM;
                                break;
                            case 6:
                            case 7:
                                inkMetalHeatType = InkMetalHeatType.METAL;
                                break;
                            default:
                                inkMetalHeatType = InkMetalHeatType.DEFAULT;
                                break;
                        }
                        arrayList10.add(new InkMetalHeatKey(inkMetalHeatType, viewModel2.customizationDetails != null, viewModel2.cashtag != null));
                    }
                    ArrayList arrayList11 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list5, 10));
                    Iterator it3 = list5.iterator();
                    while (it3.hasNext()) {
                        arrayList11.add(new HoloKey(((CardModelView.ViewModel) it3.next()).id == CardTheme.Identifier.HOLO_ID));
                    }
                    IndexingIterable withIndex = CollectionsKt.withIndex(arrayList8);
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList12 = new ArrayList();
                    Iterator it4 = withIndex.iterator();
                    while (true) {
                        ArrayIterator arrayIterator = (ArrayIterator) it4;
                        if (((Iterator) arrayIterator.f1520array).hasNext()) {
                            Object next = arrayIterator.next();
                            if (hashSet.add((AlbedoKey) ((IndexedValue) next).value)) {
                                arrayList12.add(next);
                            }
                        } else {
                            IndexingIterable withIndex2 = CollectionsKt.withIndex(arrayList9);
                            HashSet hashSet2 = new HashSet();
                            ArrayList arrayList13 = new ArrayList();
                            Iterator it5 = withIndex2.iterator();
                            while (true) {
                                ArrayIterator arrayIterator2 = (ArrayIterator) it5;
                                Iterator it6 = it5;
                                if (((Iterator) arrayIterator2.f1520array).hasNext()) {
                                    Object next2 = arrayIterator2.next();
                                    if (hashSet2.add((NormalKey) ((IndexedValue) next2).value)) {
                                        arrayList13.add(next2);
                                    }
                                    it5 = it6;
                                } else {
                                    IndexingIterable withIndex3 = CollectionsKt.withIndex(arrayList10);
                                    HashSet hashSet3 = new HashSet();
                                    ArrayList arrayList14 = new ArrayList();
                                    Iterator it7 = withIndex3.iterator();
                                    while (true) {
                                        ArrayIterator arrayIterator3 = (ArrayIterator) it7;
                                        arrayList = arrayList7;
                                        if (((Iterator) arrayIterator3.f1520array).hasNext()) {
                                            Object next3 = arrayIterator3.next();
                                            if (hashSet3.add((InkMetalHeatKey) ((IndexedValue) next3).value)) {
                                                arrayList14.add(next3);
                                            }
                                            arrayList7 = arrayList;
                                        } else {
                                            IndexingIterable withIndex4 = CollectionsKt.withIndex(arrayList11);
                                            HashSet hashSet4 = new HashSet();
                                            ArrayList arrayList15 = new ArrayList();
                                            Iterator it8 = withIndex4.iterator();
                                            while (true) {
                                                ArrayIterator arrayIterator4 = (ArrayIterator) it8;
                                                CoroutineSingletons coroutineSingletons3 = coroutineSingletons2;
                                                if (!((Iterator) arrayIterator4.f1520array).hasNext()) {
                                                    Timber.Forest forest2 = Timber.Forest;
                                                    forest2.d(Recorder$$ExternalSyntheticOutline2.m(arrayList12.size(), list.size(), "Unique albedo keys: ", " (was ", ")"), new Object[0]);
                                                    forest2.d(Recorder$$ExternalSyntheticOutline2.m(arrayList13.size(), list.size(), "Unique normal keys: ", " (was ", ")"), new Object[0]);
                                                    forest2.d(Recorder$$ExternalSyntheticOutline2.m(arrayList14.size(), list.size(), "Unique inkMetalHeat keys: ", " (was ", ")"), new Object[0]);
                                                    forest2.d(Recorder$$ExternalSyntheticOutline2.m(arrayList15.size(), list.size(), "Unique holo keys: ", " (was ", ")"), new Object[0]);
                                                    ArrayList arrayList16 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList12, 10));
                                                    Iterator it9 = arrayList12.iterator();
                                                    int i8 = 0;
                                                    while (it9.hasNext()) {
                                                        Object next4 = it9.next();
                                                        int i9 = i8 + 1;
                                                        if (i8 < 0) {
                                                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                                                            throw r24;
                                                        }
                                                        arrayList16.add(new Pair((AlbedoKey) ((IndexedValue) next4).value, new Integer(i8)));
                                                        i8 = i9;
                                                    }
                                                    Map map = MapsKt__MapsKt.toMap(arrayList16);
                                                    ArrayList arrayList17 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList13, 10));
                                                    Iterator it10 = arrayList13.iterator();
                                                    int i10 = 0;
                                                    while (it10.hasNext()) {
                                                        Object next5 = it10.next();
                                                        int i11 = i10 + 1;
                                                        if (i10 < 0) {
                                                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                                                            throw r24;
                                                        }
                                                        arrayList17.add(new Pair((NormalKey) ((IndexedValue) next5).value, new Integer(i10)));
                                                        i10 = i11;
                                                    }
                                                    Map map2 = MapsKt__MapsKt.toMap(arrayList17);
                                                    ArrayList arrayList18 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList14, 10));
                                                    int i12 = 0;
                                                    for (Iterator it11 = arrayList14.iterator(); it11.hasNext(); it11 = it11) {
                                                        Object next6 = it11.next();
                                                        int i13 = i12 + 1;
                                                        if (i12 < 0) {
                                                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                                                            throw r24;
                                                        }
                                                        arrayList18.add(new Pair((InkMetalHeatKey) ((IndexedValue) next6).value, new Integer(i12)));
                                                        i12 = i13;
                                                    }
                                                    Map map3 = MapsKt__MapsKt.toMap(arrayList18);
                                                    ArrayList arrayList19 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList15, 10));
                                                    int i14 = 0;
                                                    for (Iterator it12 = arrayList15.iterator(); it12.hasNext(); it12 = it12) {
                                                        Object next7 = it12.next();
                                                        int i15 = i14 + 1;
                                                        if (i14 < 0) {
                                                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                                                            throw r24;
                                                        }
                                                        arrayList19.add(new Pair((HoloKey) ((IndexedValue) next7).value, new Integer(i14)));
                                                        i14 = i15;
                                                    }
                                                    Map map4 = MapsKt__MapsKt.toMap(arrayList19);
                                                    IntRange indices = CollectionsKt__CollectionsKt.getIndices(list);
                                                    ArrayList arrayList20 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(indices, 10));
                                                    IntProgressionIterator it13 = indices.iterator();
                                                    while (it13.hasNext) {
                                                        int nextInt = it13.nextInt();
                                                        Object obj3 = map.get(arrayList8.get(nextInt));
                                                        obj3.getClass();
                                                        int intValue = ((Number) obj3).intValue();
                                                        Object obj4 = map2.get(arrayList9.get(nextInt));
                                                        obj4.getClass();
                                                        int intValue2 = ((Number) obj4).intValue();
                                                        Object obj5 = map3.get(arrayList10.get(nextInt));
                                                        obj5.getClass();
                                                        int intValue3 = ((Number) obj5).intValue();
                                                        Object obj6 = map4.get(arrayList11.get(nextInt));
                                                        obj6.getClass();
                                                        int intValue4 = ((Number) obj6).intValue();
                                                        Object obj7 = map4.get(arrayList11.get(nextInt));
                                                        obj7.getClass();
                                                        arrayList20.add(new TextureLayerIndices(intValue, intValue2, intValue3, intValue4, ((Number) obj7).intValue()));
                                                    }
                                                    instancedCardBatch.perCardLayerIndices = arrayList20;
                                                    arrayList12.size();
                                                    ArrayList arrayList21 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list5, 10));
                                                    for (Iterator it14 = list5.iterator(); it14.hasNext(); it14 = it14) {
                                                        CardModelView.ViewModel viewModel3 = (CardModelView.ViewModel) it14.next();
                                                        boolean z2 = viewModel3.id == CardTheme.Identifier.HOLO_ID;
                                                        CardTheme.BackgroundImage backgroundImage3 = viewModel3.backgroundImage;
                                                        CardTheme.BackgroundImage backgroundImage4 = CardTheme.BackgroundImage.MOOD;
                                                        boolean z3 = backgroundImage3 == backgroundImage4;
                                                        float f = z2 ? 1.0f : 0.0f;
                                                        float f2 = z3 ? 1.0f : 0.0f;
                                                        float f3 = backgroundImage3 == backgroundImage4 ? 1.0f : 0.0f;
                                                        int i16 = viewModel3.color;
                                                        float f4 = ((i16 >> 16) & 255) / 255.0f;
                                                        float f5 = ((i16 >> 8) & 255) / 255.0f;
                                                        float f6 = (i16 & 255) / 255.0f;
                                                        float f7 = viewModel3.opacity;
                                                        int i17 = viewModel3.inkColor;
                                                        float f8 = ((i17 >> 16) & 255) / 255.0f;
                                                        float f9 = ((i17 >> 8) & 255) / 255.0f;
                                                        float f10 = (i17 & 255) / 255.0f;
                                                        int i18 = viewModel3.backInkColor;
                                                        float f11 = ((i18 >> 16) & 255) / 255.0f;
                                                        float f12 = ((i18 >> 8) & 255) / 255.0f;
                                                        float f13 = (i18 & 255) / 255.0f;
                                                        int i19 = viewModel3.magStripColor;
                                                        arrayList21.add(new CardInstanceData(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, ((i19 >> 16) & 255) / 255.0f, ((i19 >> 8) & 255) / 255.0f, (i19 & 255) / 255.0f, viewModel3.roughness, viewModel3.metallic, viewModel3.clearCoat, viewModel3.clearCoatRoughness, viewModel3.inkRoughness, viewModel3.inkClearCoat, viewModel3.inkClearCoatRoughness, viewModel3.metallicRoughness, viewModel3.metallicClearCoat, viewModel3.metallicClearCoatRoughness));
                                                    }
                                                    instancedCardBatch.cardMetadata = arrayList21;
                                                    ArrayList arrayList22 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list5, 10));
                                                    Iterator it15 = list5.iterator();
                                                    while (it15.hasNext()) {
                                                        arrayList22.add(Boolean.valueOf(CollectionsKt.contains(DOUBLE_SIDED_CARD_IDS, ((CardModelView.ViewModel) it15.next()).id)));
                                                    }
                                                    instancedCardBatch.cardNeedsDoubleSided = arrayList22;
                                                    int size = (arrayList15.size() * 2) + arrayList14.size() + arrayList13.size() + arrayList12.size();
                                                    int size2 = list.size() * 5;
                                                    Timber.Forest forest3 = Timber.Forest;
                                                    forest3.d("=== DEDUPLICATION RESULTS ===", new Object[0]);
                                                    forest3.d(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(list.size(), "Input cards: "), new Object[0]);
                                                    forest3.d(Recorder$$ExternalSyntheticOutline2.m(size, size2 - size, "Bitmaps generated: ", " (saved ", " generations!)"), new Object[0]);
                                                    if (instancedCardBatch.sharedGeometry == null) {
                                                        engine = engine2;
                                                        instancedCardBatch.sharedGeometry = new MeshGeometry(instancedCardBatch.context, engine, "credit_card.cashmesh");
                                                    } else {
                                                        engine = engine2;
                                                    }
                                                    MeshGeometry meshGeometry = instancedCardBatch.sharedGeometry;
                                                    meshGeometry.getClass();
                                                    ReadonlyStateFlow readonlyStateFlow = meshGeometry.ready;
                                                    SessionWorkerKt$runSession$5 sessionWorkerKt$runSession$5 = new SessionWorkerKt$runSession$5(2, r24, 6);
                                                    instancedCardBatch$setUniqueCards$12 = instancedCardBatch$setUniqueCards$13;
                                                    instancedCardBatch$setUniqueCards$12.L$0 = list;
                                                    instancedCardBatch$setUniqueCards$12.L$5 = arrayList12;
                                                    instancedCardBatch$setUniqueCards$12.L$6 = arrayList13;
                                                    instancedCardBatch$setUniqueCards$12.L$7 = arrayList14;
                                                    instancedCardBatch$setUniqueCards$12.L$8 = arrayList15;
                                                    instancedCardBatch$setUniqueCards$12.I$0 = size;
                                                    instancedCardBatch$setUniqueCards$12.I$1 = size2;
                                                    z = true;
                                                    instancedCardBatch$setUniqueCards$12.label = 1;
                                                    coroutineSingletons = coroutineSingletons3;
                                                    if (FlowKt.first(readonlyStateFlow, sessionWorkerKt$runSession$5, instancedCardBatch$setUniqueCards$12) != coroutineSingletons) {
                                                        list2 = list;
                                                        i2 = size2;
                                                        i3 = size;
                                                        arrayList2 = arrayList15;
                                                        arrayList3 = arrayList13;
                                                        arrayList4 = arrayList12;
                                                        arrayList5 = arrayList14;
                                                    }
                                                    return coroutineSingletons;
                                                }
                                                Object next8 = arrayIterator4.next();
                                                if (hashSet4.add((HoloKey) ((IndexedValue) next8).value)) {
                                                    arrayList15.add(next8);
                                                }
                                                coroutineSingletons2 = coroutineSingletons3;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (i == 1) {
                    int i20 = instancedCardBatch$setUniqueCards$13.I$1;
                    int i21 = instancedCardBatch$setUniqueCards$13.I$0;
                    ArrayList arrayList23 = instancedCardBatch$setUniqueCards$13.L$8;
                    ArrayList arrayList24 = instancedCardBatch$setUniqueCards$13.L$7;
                    ArrayList arrayList25 = instancedCardBatch$setUniqueCards$13.L$6;
                    ArrayList arrayList26 = instancedCardBatch$setUniqueCards$13.L$5;
                    List list6 = instancedCardBatch$setUniqueCards$13.L$0;
                    SafeTrace.throwOnFailure(obj);
                    arrayList2 = arrayList23;
                    arrayList5 = arrayList24;
                    instancedCardBatch$setUniqueCards$12 = instancedCardBatch$setUniqueCards$13;
                    engine = engine2;
                    coroutineSingletons = coroutineSingletons2;
                    arrayList = arrayList7;
                    i2 = i20;
                    arrayList4 = arrayList26;
                    i3 = i21;
                    arrayList3 = arrayList25;
                    z = true;
                    list2 = list6;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        List list7 = instancedCardBatch$setUniqueCards$13.L$0;
                        SafeTrace.throwOnFailure(obj);
                        arrayList6 = arrayList7;
                        arrayList6.clear();
                        return Unit.INSTANCE;
                    }
                    j = instancedCardBatch$setUniqueCards$13.J$0;
                    i4 = instancedCardBatch$setUniqueCards$13.I$1;
                    i5 = instancedCardBatch$setUniqueCards$13.I$0;
                    list4 = instancedCardBatch$setUniqueCards$13.L$0;
                    SafeTrace.throwOnFailure(obj);
                    instancedCardBatch$setUniqueCards$12 = instancedCardBatch$setUniqueCards$13;
                    engine = engine2;
                    coroutineSingletons = coroutineSingletons2;
                    arrayList = arrayList7;
                    Timber.Forest.d(Boxes$$ExternalSyntheticOutline1.m(System.currentTimeMillis() - j, "Pipeline: total pipelined load took ", "ms"), new Object[0]);
                    Job launch = engine.launch(new InstancedCardBatch$setUniqueCards$8(instancedCardBatch, list4, null, 0));
                    arrayList6 = arrayList;
                    arrayList6.add(launch);
                    instancedCardBatch$setUniqueCards$12.L$0 = null;
                    instancedCardBatch$setUniqueCards$12.L$5 = null;
                    instancedCardBatch$setUniqueCards$12.L$6 = null;
                    instancedCardBatch$setUniqueCards$12.L$7 = null;
                    instancedCardBatch$setUniqueCards$12.L$8 = null;
                    instancedCardBatch$setUniqueCards$12.I$0 = i5;
                    instancedCardBatch$setUniqueCards$12.I$1 = i4;
                    instancedCardBatch$setUniqueCards$12.J$0 = j;
                    instancedCardBatch$setUniqueCards$12.label = 3;
                }
                list3 = list2;
                if ((list3 instanceof Collection) || !list3.isEmpty()) {
                    it = list3.iterator();
                    while (it.hasNext()) {
                        if (((CardModelView.ViewModel) it.next()).backgroundImage == CardTheme.BackgroundImage.MOOD) {
                            instancedCardBatch.hasMoodCards = z;
                            long currentTimeMillis = System.currentTimeMillis();
                            Timber.Forest.d("Pipeline: starting pipelined texture load", new Object[0]);
                            instancedCardBatch = this;
                            instancedCardBatch$setUniqueCards$7 = new InstancedCardBatch$setUniqueCards$7(instancedCardBatch, arrayList4, list2, arrayList3, arrayList5, arrayList2, null);
                            instancedCardBatch$setUniqueCards$12.L$0 = list2;
                            instancedCardBatch$setUniqueCards$12.L$5 = null;
                            instancedCardBatch$setUniqueCards$12.L$6 = null;
                            instancedCardBatch$setUniqueCards$12.L$7 = null;
                            instancedCardBatch$setUniqueCards$12.L$8 = null;
                            instancedCardBatch$setUniqueCards$12.I$0 = i3;
                            instancedCardBatch$setUniqueCards$12.I$1 = i2;
                            instancedCardBatch$setUniqueCards$12.J$0 = currentTimeMillis;
                            instancedCardBatch$setUniqueCards$12.label = 2;
                            if (JobKt.coroutineScope(instancedCardBatch$setUniqueCards$7, instancedCardBatch$setUniqueCards$12) != coroutineSingletons) {
                                list4 = list2;
                                i4 = i2;
                                i5 = i3;
                                j = currentTimeMillis;
                                Timber.Forest.d(Boxes$$ExternalSyntheticOutline1.m(System.currentTimeMillis() - j, "Pipeline: total pipelined load took ", "ms"), new Object[0]);
                                Job launch2 = engine.launch(new InstancedCardBatch$setUniqueCards$8(instancedCardBatch, list4, null, 0));
                                arrayList6 = arrayList;
                                arrayList6.add(launch2);
                                instancedCardBatch$setUniqueCards$12.L$0 = null;
                                instancedCardBatch$setUniqueCards$12.L$5 = null;
                                instancedCardBatch$setUniqueCards$12.L$6 = null;
                                instancedCardBatch$setUniqueCards$12.L$7 = null;
                                instancedCardBatch$setUniqueCards$12.L$8 = null;
                                instancedCardBatch$setUniqueCards$12.I$0 = i5;
                                instancedCardBatch$setUniqueCards$12.I$1 = i4;
                                instancedCardBatch$setUniqueCards$12.J$0 = j;
                                instancedCardBatch$setUniqueCards$12.label = 3;
                            }
                            return coroutineSingletons;
                        }
                    }
                }
                z = false;
                instancedCardBatch.hasMoodCards = z;
                long currentTimeMillis2 = System.currentTimeMillis();
                Timber.Forest.d("Pipeline: starting pipelined texture load", new Object[0]);
                instancedCardBatch = this;
                instancedCardBatch$setUniqueCards$7 = new InstancedCardBatch$setUniqueCards$7(instancedCardBatch, arrayList4, list2, arrayList3, arrayList5, arrayList2, null);
                instancedCardBatch$setUniqueCards$12.L$0 = list2;
                instancedCardBatch$setUniqueCards$12.L$5 = null;
                instancedCardBatch$setUniqueCards$12.L$6 = null;
                instancedCardBatch$setUniqueCards$12.L$7 = null;
                instancedCardBatch$setUniqueCards$12.L$8 = null;
                instancedCardBatch$setUniqueCards$12.I$0 = i3;
                instancedCardBatch$setUniqueCards$12.I$1 = i2;
                instancedCardBatch$setUniqueCards$12.J$0 = currentTimeMillis2;
                instancedCardBatch$setUniqueCards$12.label = 2;
                if (JobKt.coroutineScope(instancedCardBatch$setUniqueCards$7, instancedCardBatch$setUniqueCards$12) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
        }
        instancedCardBatch$setUniqueCards$1 = new InstancedCardBatch$setUniqueCards$1(instancedCardBatch, continuationImpl);
        InstancedCardBatch$setUniqueCards$1 instancedCardBatch$setUniqueCards$132 = instancedCardBatch$setUniqueCards$1;
        Object obj8 = instancedCardBatch$setUniqueCards$132.result;
        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = instancedCardBatch$setUniqueCards$132.label;
        Engine engine22 = instancedCardBatch.engine;
        ArrayList arrayList72 = instancedCardBatch.activeUploadJobs;
        Object obj22 = null;
        if (i != 0) {
        }
        list3 = list2;
        if (list3 instanceof Collection) {
        }
        it = list3.iterator();
        while (it.hasNext()) {
        }
        z = false;
        instancedCardBatch.hasMoodCards = z;
        long currentTimeMillis22 = System.currentTimeMillis();
        Timber.Forest.d("Pipeline: starting pipelined texture load", new Object[0]);
        instancedCardBatch = this;
        instancedCardBatch$setUniqueCards$7 = new InstancedCardBatch$setUniqueCards$7(instancedCardBatch, arrayList4, list2, arrayList3, arrayList5, arrayList2, null);
        instancedCardBatch$setUniqueCards$12.L$0 = list2;
        instancedCardBatch$setUniqueCards$12.L$5 = null;
        instancedCardBatch$setUniqueCards$12.L$6 = null;
        instancedCardBatch$setUniqueCards$12.L$7 = null;
        instancedCardBatch$setUniqueCards$12.L$8 = null;
        instancedCardBatch$setUniqueCards$12.I$0 = i3;
        instancedCardBatch$setUniqueCards$12.I$1 = i2;
        instancedCardBatch$setUniqueCards$12.J$0 = currentTimeMillis22;
        instancedCardBatch$setUniqueCards$12.label = 2;
        if (JobKt.coroutineScope(instancedCardBatch$setUniqueCards$7, instancedCardBatch$setUniqueCards$12) != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    public final void updateInstanceBuffer(ArrayList arrayList, List list, ArrayList arrayList2) {
        float f;
        boolean z;
        boolean z2;
        arrayList.getClass();
        list.getClass();
        arrayList2.getClass();
        if (arrayList.size() != list.size()) {
            a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
            return;
        }
        this.currentTextureIndices = list;
        arrayList.size();
        List take = CollectionsKt.take(CollectionsKt__CollectionsKt.getIndices(arrayList), 100);
        this.culledInstanceCount = take.size();
        if (take.isEmpty()) {
            z = false;
            z2 = true;
            f = 1.0f;
        } else {
            if (arrayList.size() > 100) {
                Timber.Forest.w(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(arrayList.size(), "Instance count ", " exceeds MAX_INSTANCES (100), clamping"), new Object[0]);
            }
            int size = take.size();
            int i = size * 20;
            List list2 = take;
            Iterator it = list2.iterator();
            int i2 = 0;
            while (true) {
                boolean hasNext = it.hasNext();
                Throwable th = null;
                float[] fArr = this.cachedVboData;
                if (hasNext) {
                    Object next = it.next();
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                    int i4 = i2 * 20;
                    System.arraycopy(((Transform) arrayList.get(((Number) next).intValue())).computeModelMatrix(), 0, fArr, i4, 16);
                    fArr[i4 + 16] = i2;
                    fArr[i4 + 17] = 0.0f;
                    fArr[i4 + 18] = 0.0f;
                    fArr[i4 + 19] = 0.0f;
                    i2 = i3;
                } else {
                    f = 1.0f;
                    int size2 = take.size() * 40;
                    Iterator it2 = list2.iterator();
                    int i5 = 0;
                    while (true) {
                        boolean hasNext2 = it2.hasNext();
                        float[] fArr2 = this.cachedUboData;
                        if (hasNext2) {
                            Object next2 = it2.next();
                            int i6 = i5 + 1;
                            if (i5 < 0) {
                                Throwable th2 = th;
                                CollectionsKt__CollectionsKt.throwIndexOverflow();
                                throw th2;
                            }
                            int intValue = ((Number) next2).intValue();
                            int intValue2 = ((Number) list.get(intValue)).intValue();
                            int i7 = i5 * 40;
                            TextureLayerIndices textureLayerIndices = (TextureLayerIndices) this.perCardLayerIndices.get(intValue2);
                            Throwable th3 = th;
                            CardInstanceData cardInstanceData = (CardInstanceData) this.cardMetadata.get(intValue2);
                            fArr2[i7] = cardInstanceData.baseColorR;
                            fArr2[i7 + 1] = cardInstanceData.baseColorG;
                            fArr2[i7 + 2] = cardInstanceData.baseColorB;
                            fArr2[i7 + 3] = 0.0f;
                            fArr2[i7 + 4] = cardInstanceData.inkColorR;
                            fArr2[i7 + 5] = cardInstanceData.inkColorG;
                            fArr2[i7 + 6] = cardInstanceData.inkColorB;
                            fArr2[i7 + 7] = 0.0f;
                            fArr2[i7 + 8] = cardInstanceData.backInkColorR;
                            fArr2[i7 + 9] = cardInstanceData.backInkColorG;
                            fArr2[i7 + 10] = cardInstanceData.backInkColorB;
                            fArr2[i7 + 11] = 0.0f;
                            fArr2[i7 + 12] = cardInstanceData.magStripeColorR;
                            fArr2[i7 + 13] = cardInstanceData.magStripeColorG;
                            fArr2[i7 + 14] = cardInstanceData.magStripeColorB;
                            fArr2[i7 + 15] = 0.0f;
                            fArr2[i7 + 16] = textureLayerIndices.albedoLayer;
                            fArr2[i7 + 17] = textureLayerIndices.normalLayer;
                            fArr2[i7 + 18] = textureLayerIndices.inkMetalHeatLayer;
                            fArr2[i7 + 19] = ((Number) ((intValue < 0 || intValue >= arrayList2.size()) ? Float.valueOf(1.0f) : arrayList2.get(intValue))).floatValue();
                            fArr2[i7 + 20] = textureLayerIndices.holoBaseLayer;
                            fArr2[i7 + 21] = textureLayerIndices.holoReflectLayer;
                            fArr2[i7 + 22] = 0.0f;
                            fArr2[i7 + 23] = 0.0f;
                            fArr2[i7 + 24] = cardInstanceData.roughness;
                            fArr2[i7 + 25] = cardInstanceData.metallic;
                            fArr2[i7 + 26] = cardInstanceData.clearCoat;
                            fArr2[i7 + 27] = cardInstanceData.clearCoatRoughness;
                            fArr2[i7 + 28] = cardInstanceData.inkRoughness;
                            fArr2[i7 + 29] = cardInstanceData.inkClearCoat;
                            fArr2[i7 + 30] = cardInstanceData.inkClearCoatRoughness;
                            fArr2[i7 + 31] = cardInstanceData.metallicRoughness;
                            fArr2[i7 + 32] = cardInstanceData.metallicClearCoat;
                            fArr2[i7 + 33] = cardInstanceData.metallicClearCoatRoughness;
                            fArr2[i7 + 34] = 0.0f;
                            fArr2[i7 + 35] = cardInstanceData.opacity;
                            fArr2[i7 + 36] = cardInstanceData.isHolo;
                            fArr2[i7 + 37] = cardInstanceData.isMood;
                            fArr2[i7 + 38] = cardInstanceData.hasSnakeSkin;
                            List list3 = this.cardNeedsDoubleSided;
                            fArr2[i7 + 39] = ((Boolean) ((intValue2 < 0 || intValue2 >= list3.size()) ? Boolean.FALSE : list3.get(intValue2))).booleanValue() ? 1.0f : 0.0f;
                            i5 = i6;
                            th = th3;
                        } else {
                            if (this.instanceVboId == 0) {
                                int[] iArr = new int[1];
                                z = false;
                                GLES20.glGenBuffers(1, iArr, 0);
                                this.instanceVboId = iArr[0];
                            } else {
                                z = false;
                            }
                            FloatBuffer floatBuffer = this.cachedVboBuffer;
                            floatBuffer.clear();
                            floatBuffer.put(fArr, z ? 1 : 0, i);
                            floatBuffer.position(z ? 1 : 0);
                            floatBuffer.limit(i);
                            GLES20.glBindBuffer(34962, this.instanceVboId);
                            GLES20.glBufferData(34962, size * 80, floatBuffer, 35048);
                            GLES20.glBindBuffer(34962, z ? 1 : 0);
                            if (this.uboId == 0) {
                                z2 = true;
                                int[] iArr2 = new int[1];
                                GLES20.glGenBuffers(1, iArr2, z ? 1 : 0);
                                this.uboId = iArr2[z ? 1 : 0];
                            } else {
                                z2 = true;
                            }
                            FloatBuffer floatBuffer2 = this.cachedUboBuffer;
                            floatBuffer2.clear();
                            floatBuffer2.put(fArr2, z ? 1 : 0, size2);
                            floatBuffer2.position(z ? 1 : 0);
                            GLES20.glBindBuffer(35345, this.uboId);
                            GLES20.glBufferData(35345, 16000, floatBuffer2, 35048);
                            GLES20.glBindBuffer(35345, z ? 1 : 0);
                        }
                    }
                }
            }
        }
        getEntity().setNeedsDoubleSidedRendering(this.crossfadeMultiplier >= f ? z2 : z);
        recomputeReady();
    }

    public final int uploadTexture2D(Bitmap bitmap) {
        this.sharedTextureMemoryBytes = (bitmap.getWidth() * bitmap.getHeight() * 4) + this.sharedTextureMemoryBytes;
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLUtils.texImage2D(3553, 0, bitmap, 0);
        GLES20.glBindTexture(3553, 0);
        bitmap.recycle();
        return iArr[0];
    }
}
