package com.squareup.cash.card.onboarding.core;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.text.android.LayoutCompat_androidKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.card.onboarding.InteractiveCardView$flingTo$1;
import com.squareup.cash.graphics.swampgl.Engine;
import com.squareup.protos.franklin.cards.CardTheme;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class CardAssetManager implements CardAssetProvider {
    public final LinkedHashMap assets;
    public final Context context;
    public final Engine core;
    public int fallbackTextureId;

    public final class Asset {
        public int refCount = 1;
        public final int textureId;

        public Asset(int i) {
            this.textureId = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Asset)) {
                return false;
            }
            Asset asset = (Asset) obj;
            return this.textureId == asset.textureId && this.refCount == asset.refCount;
        }

        public final int hashCode() {
            return Integer.hashCode(this.refCount) + (Integer.hashCode(this.textureId) * 31);
        }

        public final String toString() {
            return Recorder$$ExternalSyntheticOutline2.m(this.textureId, this.refCount, "Asset(textureId=", ", refCount=", ")");
        }
    }

    public CardAssetManager(Context context, Engine engine) {
        context.getClass();
        engine.getClass();
        this.context = context;
        this.core = engine;
        this.assets = new LinkedHashMap();
    }

    public static Bitmap loadHoloTexture(Context context, CardTheme.Identifier identifier, boolean z) {
        if (identifier == CardTheme.Identifier.HOLO_ID) {
            Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), z ? R.drawable.holo_base_gradient : R.drawable.holo_reflect_env);
            decodeResource.getClass();
            return decodeResource;
        }
        Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(-16777216);
        return createBitmap;
    }

    public static int uploadTexture(Bitmap bitmap, int i, boolean z) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glActiveTexture(34000);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glPixelStorei(3317, 1);
        GLUtils.texImage2D(3553, 0, bitmap, 0);
        int i2 = z ? 9729 : 9728;
        int i3 = z ? 9729 : 9728;
        GLES20.glTexParameteri(3553, 10241, i2);
        GLES20.glTexParameteri(3553, 10240, i3);
        GLES20.glTexParameteri(3553, 10242, i);
        GLES20.glTexParameteri(3553, 10243, i);
        return iArr[0];
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object acquire(LayoutCompat_androidKt layoutCompat_androidKt, Continuation continuation) {
        CardAssetManager$acquire$1 cardAssetManager$acquire$1;
        int i;
        int uploadTexture;
        if (continuation instanceof CardAssetManager$acquire$1) {
            cardAssetManager$acquire$1 = (CardAssetManager$acquire$1) continuation;
            int i2 = cardAssetManager$acquire$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                cardAssetManager$acquire$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = cardAssetManager$acquire$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cardAssetManager$acquire$1.label;
                Continuation continuation2 = null;
                LinkedHashMap linkedHashMap = this.assets;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Asset asset = (Asset) linkedHashMap.get(layoutCompat_androidKt);
                    if (asset != null) {
                        asset.refCount++;
                        Timber.Forest forest = Timber.Forest;
                        forest.tag("CardAssetManager");
                        forest.d(Recorder$$ExternalSyntheticOutline1.m("Cache HIT: ", asset.refCount, Reflection.factory.getOrCreateKotlinClass(layoutCompat_androidKt.getClass()).getSimpleName(), " (refCount=", ")"), new Object[0]);
                        return new Integer(asset.textureId);
                    }
                    DefaultScheduler defaultScheduler = Dispatchers.Default;
                    DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
                    InteractiveCardView$flingTo$1.AnonymousClass2 anonymousClass2 = new InteractiveCardView$flingTo$1.AnonymousClass2(this, layoutCompat_androidKt, continuation2, 29);
                    cardAssetManager$acquire$1.L$0 = layoutCompat_androidKt;
                    cardAssetManager$acquire$1.label = 1;
                    obj = JobKt.withContext(defaultIoScheduler, anonymousClass2, cardAssetManager$acquire$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    layoutCompat_androidKt = cardAssetManager$acquire$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                boolean z = layoutCompat_androidKt instanceof CardAssetManager$AssetKey$HoloReflect;
                uploadTexture = uploadTexture((Bitmap) obj, (!z || (layoutCompat_androidKt instanceof CardAssetManager$AssetKey$ContouredText)) ? 10497 : 33071, !(layoutCompat_androidKt instanceof CardAssetManager$AssetKey$Albedo) || z || (layoutCompat_androidKt instanceof CardAssetManager$AssetKey$Placeholder) || (layoutCompat_androidKt instanceof CardAssetManager$AssetKey$HeatColors) || (layoutCompat_androidKt instanceof CardAssetManager$AssetKey$CopyPan) || (layoutCompat_androidKt instanceof CardAssetManager$AssetKey$ContouredText));
                if (uploadTexture <= 0) {
                    linkedHashMap.put(layoutCompat_androidKt, new Asset(uploadTexture));
                    Timber.Forest forest2 = Timber.Forest;
                    forest2.tag("CardAssetManager");
                    forest2.d(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Cache MISS: ", Reflection.factory.getOrCreateKotlinClass(layoutCompat_androidKt.getClass()).getSimpleName(), " created"), new Object[0]);
                    return new Integer(uploadTexture);
                }
                int i3 = this.fallbackTextureId;
                if (i3 <= 0 || !GLES20.glIsTexture(i3)) {
                    Bitmap createBitmap = Bitmap.createBitmap(4, 4, Bitmap.Config.ARGB_8888);
                    createBitmap.eraseColor(-16777216);
                    this.fallbackTextureId = uploadTexture(createBitmap, 33071, true);
                }
                return new Integer(this.fallbackTextureId);
            }
        }
        cardAssetManager$acquire$1 = new CardAssetManager$acquire$1(this, continuation);
        Object obj2 = cardAssetManager$acquire$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cardAssetManager$acquire$1.label;
        Continuation continuation22 = null;
        LinkedHashMap linkedHashMap2 = this.assets;
        if (i != 0) {
        }
        boolean z2 = layoutCompat_androidKt instanceof CardAssetManager$AssetKey$HoloReflect;
        uploadTexture = uploadTexture((Bitmap) obj2, (!z2 || (layoutCompat_androidKt instanceof CardAssetManager$AssetKey$ContouredText)) ? 10497 : 33071, !(layoutCompat_androidKt instanceof CardAssetManager$AssetKey$Albedo) || z2 || (layoutCompat_androidKt instanceof CardAssetManager$AssetKey$Placeholder) || (layoutCompat_androidKt instanceof CardAssetManager$AssetKey$HeatColors) || (layoutCompat_androidKt instanceof CardAssetManager$AssetKey$CopyPan) || (layoutCompat_androidKt instanceof CardAssetManager$AssetKey$ContouredText));
        if (uploadTexture <= 0) {
        }
    }

    public final void release(LayoutCompat_androidKt layoutCompat_androidKt) {
        layoutCompat_androidKt.getClass();
        LinkedHashMap linkedHashMap = this.assets;
        Asset asset = (Asset) linkedHashMap.get(layoutCompat_androidKt);
        if (asset == null) {
            return;
        }
        int i = asset.refCount - 1;
        asset.refCount = i;
        if (i > 0) {
            Timber.Forest forest = Timber.Forest;
            forest.tag("CardAssetManager");
            forest.d(Recorder$$ExternalSyntheticOutline1.m("Released: ", asset.refCount, Reflection.factory.getOrCreateKotlinClass(layoutCompat_androidKt.getClass()).getSimpleName(), " (refCount=", ")"), new Object[0]);
            return;
        }
        int i2 = asset.textureId;
        linkedHashMap.remove(layoutCompat_androidKt);
        Timber.Forest forest2 = Timber.Forest;
        forest2.tag("CardAssetManager");
        forest2.d(Recorder$$ExternalSyntheticOutline2.m("Deleted: ", Reflection.factory.getOrCreateKotlinClass(layoutCompat_androidKt.getClass()).getSimpleName()), new Object[0]);
        this.core.launch(new CardAssetManager$release$1(i2, null, 0));
    }
}
