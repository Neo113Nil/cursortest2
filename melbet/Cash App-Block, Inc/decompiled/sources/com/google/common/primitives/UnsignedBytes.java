package com.google.common.primitives;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidImageBitmap;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.unit.Density;
import androidx.recyclerview.widget.RecyclerView;
import androidx.tracing.Trace;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import com.fillr.e;
import com.google.common.hash.AbstractHashFunction;
import com.google.common.primitives.UnsignedBytes;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda5;
import com.squareup.cash.graphics.backend.engine.EntityStateImpl;
import com.squareup.cash.graphics.backend.engine.LightStateImpl;
import com.squareup.cash.graphics.backend.engine.TextureType;
import com.squareup.cash.graphics.backend.gl.GLSceneScope;
import com.squareup.cash.graphics.backend.gl.core.PBRMaterial;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.graphics.views.AnimationsKt;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda33;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import io.reactivex.rxjava3.exceptions.QueueOverflowException;
import io.reactivex.rxjava3.exceptions.UndeliverableException;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.io.InputStream;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public abstract class UnsignedBytes {
    public static final void GlitterEffect(final Modifier modifier, final Bitmap bitmap, final MutableState mutableState, final MutableState mutableState2, final MutableState mutableState3, final MutableState mutableState4, final MutableState mutableState5, final MutableState mutableState6, final MutableState mutableState7, Composer composer, final int i) {
        Modifier modifier2;
        RecomposeScopeImpl endRestartGroup;
        Function2 function2;
        bitmap.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-171089757);
        int i2 = i | (gapComposer.changedInstance(bitmap) ? 32 : 16) | (gapComposer.changed(mutableState) ? 256 : 128) | (gapComposer.changed(mutableState2) ? 2048 : 1024) | (gapComposer.changed(mutableState3) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changed(mutableState4) ? PKIFailureInfo.unsupportedVersion : 65536) | (gapComposer.changed(mutableState5) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted) | (gapComposer.changed(mutableState6) ? 8388608 : 4194304) | (gapComposer.changed(mutableState7) ? 67108864 : 33554432);
        if (gapComposer.shouldExecute(i2 & 1, (38347923 & i2) != 38347922)) {
            final Context context = (Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext);
            final float density = ((Density) gapComposer.consume(CompositionLocalsKt.LocalDensity)).getDensity();
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m(1024.0f, gapComposer);
            }
            final MutableFloatState mutableFloatState = (MutableFloatState) rememberedValue;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState8 = (MutableState) rememberedValue2;
            if (((Boolean) mutableState8.getValue()).booleanValue()) {
                gapComposer.startReplaceGroup(1191701201);
                gapComposer.startReplaceGroup(1191714159);
                Modifier fillMaxSize = SizeKt.fillMaxSize(modifier, 1.0f);
                boolean changed = gapComposer.changed(bitmap);
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (changed || rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new BitmapPainter(new AndroidImageBitmap(bitmap));
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                ImageKt.Image((BitmapPainter) rememberedValue3, null, fillMaxSize, null, ContentScale.Companion.Crop, RecyclerView.DECELERATION_RATE, null, gapComposer, 24632, 104);
                gapComposer.end(false);
                gapComposer.end(false);
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i3 = 0;
                    function2 = new Function2(modifier, bitmap, mutableState, mutableState2, mutableState3, mutableState4, mutableState5, mutableState6, mutableState7, i, i3) { // from class: com.squareup.cash.graphics.views.effect.GlitterEffectKt$$ExternalSyntheticLambda0
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ Modifier f$0;
                        public final /* synthetic */ Bitmap f$1;
                        public final /* synthetic */ MutableState f$2;
                        public final /* synthetic */ MutableState f$3;
                        public final /* synthetic */ MutableState f$4;
                        public final /* synthetic */ MutableState f$5;
                        public final /* synthetic */ MutableState f$6;
                        public final /* synthetic */ MutableState f$7;
                        public final /* synthetic */ MutableState f$8;

                        {
                            this.$r8$classId = i3;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            switch (this.$r8$classId) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int updateChangedFlags = Updater.updateChangedFlags(7);
                                    UnsignedBytes.GlitterEffect(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, (Composer) obj, updateChangedFlags);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int updateChangedFlags2 = Updater.updateChangedFlags(7);
                                    UnsignedBytes.GlitterEffect(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, (Composer) obj, updateChangedFlags2);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    endRestartGroup.block = function2;
                }
                return;
            }
            modifier2 = modifier;
            gapComposer.startReplaceGroup(1191960671);
            gapComposer.end(false);
            if (((Boolean) gapComposer.consume(InspectionModeKt.LocalInspectionMode)).booleanValue()) {
                gapComposer = gapComposer;
                gapComposer.startReplaceGroup(1195164831);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1192097319);
                Object rememberedValue4 = gapComposer.rememberedValue();
                int i4 = 19;
                if (rememberedValue4 == neverEqualPolicy) {
                    rememberedValue4 = new HeroCardViewKt$$ExternalSyntheticLambda33(mutableFloatState, i4);
                    gapComposer.updateRememberedValue(rememberedValue4);
                }
                Modifier onPlaced = RulerKt.onPlaced(modifier2, (Function1) rememberedValue4);
                e eVar = new e();
                Object rememberedValue5 = gapComposer.rememberedValue();
                if (rememberedValue5 == neverEqualPolicy) {
                    rememberedValue5 = new CaptureCheckFaceKt$$ExternalSyntheticLambda5(i4, mutableState8);
                    gapComposer.updateRememberedValue(rememberedValue5);
                }
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(936320171, new Function3() { // from class: com.squareup.cash.graphics.views.effect.GlitterEffectKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i5;
                        EntityStateImpl entityStateImpl;
                        GLSceneScope gLSceneScope = (GLSceneScope) obj;
                        int intValue = ((Integer) obj3).intValue();
                        gLSceneScope.getClass();
                        GapComposer gapComposer2 = (GapComposer) ((Composer) obj2);
                        Object rememberedValue6 = gapComposer2.rememberedValue();
                        NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
                        if (rememberedValue6 == neverEqualPolicy2) {
                            rememberedValue6 = Updater.mutableStateOf$default(new Quat((float) Math.toRadians(-90.0d), new float[]{1.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE}));
                            gapComposer2.updateRememberedValue(rememberedValue6);
                        }
                        EntityStateImpl rememberEntityState = AbstractHashFunction.rememberEntityState((MutableState) rememberedValue6, null, Updater.rememberUpdatedState(Float.valueOf(1.0f), gapComposer2), gapComposer2, 2);
                        int i6 = (intValue << 3) & 112;
                        MutableState rememberMaterialInstance = gLSceneScope.rememberMaterialInstance(gLSceneScope.rememberMaterial("pbr", gapComposer2, i6 | 6), gapComposer2);
                        Object rememberedValue7 = gapComposer2.rememberedValue();
                        if (rememberedValue7 == neverEqualPolicy2) {
                            InputStream open = context.getAssets().open("glitter_normal.png");
                            open.getClass();
                            rememberedValue7 = BitmapFactory.decodeStream(open);
                            gapComposer2.updateRememberedValue(rememberedValue7);
                        }
                        Bitmap bitmap2 = (Bitmap) rememberedValue7;
                        MutableState rememberUpdatedState = Updater.rememberUpdatedState(Float.valueOf((((ParcelableSnapshotMutableFloatState) mutableFloatState).getFloatValue() * (1.0f / (((Number) MutableState.this.getValue()).floatValue() + 1.0f))) / ((bitmap2.getWidth() * density) / 2.625f)), gapComposer2);
                        TextureType textureType = TextureType.COLOR;
                        Object rememberedValue8 = gapComposer2.rememberedValue();
                        if (rememberedValue8 == neverEqualPolicy2) {
                            rememberedValue8 = new AppLockMonitor$special$$inlined$map$2(bitmap, 19);
                            gapComposer2.updateRememberedValue(rememberedValue8);
                        }
                        int i7 = ((intValue << 6) & 896) | 6;
                        MutableState produceTexture = gLSceneScope.produceTexture(textureType, (Flow) rememberedValue8, gapComposer2, i7);
                        TextureType textureType2 = TextureType.NORMAL;
                        Object rememberedValue9 = gapComposer2.rememberedValue();
                        if (rememberedValue9 == neverEqualPolicy2) {
                            Bitmap createBitmap = Bitmap.createBitmap(bitmap2.getWidth(), bitmap2.getHeight(), Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(createBitmap);
                            i5 = intValue;
                            canvas.drawColor(Color.rgb(127, 127, 255));
                            canvas.drawBitmap(bitmap2, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, new Paint());
                            rememberedValue9 = new AppLockMonitor$special$$inlined$map$2(createBitmap, 19);
                            gapComposer2.updateRememberedValue(rememberedValue9);
                        } else {
                            i5 = intValue;
                        }
                        MutableState produceTexture2 = gLSceneScope.produceTexture(textureType2, (Flow) rememberedValue9, gapComposer2, i7);
                        MutableState mutableState9 = mutableState;
                        float floatValue = ((Number) mutableState9.getValue()).floatValue();
                        MutableState mutableState10 = mutableState3;
                        float floatValue2 = ((Number) mutableState10.getValue()).floatValue();
                        MutableState mutableState11 = mutableState4;
                        boolean changed2 = gapComposer2.changed(floatValue2) | gapComposer2.changed(floatValue) | gapComposer2.changed(((Number) mutableState11.getValue()).floatValue());
                        Object rememberedValue10 = gapComposer2.rememberedValue();
                        if (changed2 || rememberedValue10 == neverEqualPolicy2) {
                            Bitmap createBitmap2 = Bitmap.createBitmap(bitmap2.getWidth(), bitmap2.getHeight(), Bitmap.Config.ARGB_8888);
                            Canvas canvas2 = new Canvas(createBitmap2);
                            canvas2.drawBitmap(bitmap2, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, new Paint());
                            entityStateImpl = rememberEntityState;
                            canvas2.drawColor(Color.argb(255, (int) (((Number) mutableState9.getValue()).floatValue() * 255.0f), (int) (((Number) mutableState10.getValue()).floatValue() * 255.0f), (int) (255.0f * ((Number) mutableState11.getValue()).floatValue())), PorterDuff.Mode.SRC_ATOP);
                            rememberedValue10 = new AppLockMonitor$special$$inlined$map$2(createBitmap2, 19);
                            gapComposer2.updateRememberedValue(rememberedValue10);
                        } else {
                            entityStateImpl = rememberEntityState;
                        }
                        MutableState produceTexture3 = gLSceneScope.produceTexture(textureType2, (Flow) rememberedValue10, gapComposer2, i7);
                        PBRMaterial.PBRMaterialInstance pBRMaterialInstance = (PBRMaterial.PBRMaterialInstance) rememberMaterialInstance.getValue();
                        if (pBRMaterialInstance == null) {
                            gapComposer2.startReplaceGroup(-1896036540);
                            gapComposer2.end(false);
                        } else {
                            gapComposer2.startReplaceGroup(-1896036539);
                            pBRMaterialInstance.bindTexture("albedoMap", produceTexture, gapComposer2, 6);
                            pBRMaterialInstance.bindTexture("normalMap", produceTexture2, gapComposer2, 6);
                            pBRMaterialInstance.bindTexture("metalRoughnessAoMap", produceTexture3, gapComposer2, 6);
                            pBRMaterialInstance.bindFloat("roughnessScale", mutableState2, gapComposer2, 6);
                            pBRMaterialInstance.bindFloat("exposure", mutableState5, gapComposer2, 6);
                            pBRMaterialInstance.bindFloat("normalScale", rememberUpdatedState, gapComposer2, 6);
                            gapComposer2.end(false);
                        }
                        gapComposer2.startReplaceGroup(-2139359283);
                        Iterator it = ((Iterable) mutableState7.getValue()).iterator();
                        while (it.hasNext()) {
                            gLSceneScope.Light((LightStateImpl) it.next(), gapComposer2, i6);
                        }
                        gapComposer2.end(false);
                        gLSceneScope.rememberMesh(rememberMaterialInstance, entityStateImpl, gapComposer2, ((i5 << 9) & 7168) | 6);
                        return Unit.INSTANCE;
                    }
                }, gapComposer);
                gapComposer = gapComposer;
                AnimationsKt.CashEngineTextureView(onPlaced, "GlitterEffect", eVar, (Function1) rememberedValue5, rememberComposableLambda, gapComposer, 27696);
                gapComposer.end(false);
            }
        } else {
            modifier2 = modifier;
            gapComposer.skipToGroupEnd();
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            final int i5 = 1;
            final Modifier modifier3 = modifier2;
            function2 = new Function2(modifier3, bitmap, mutableState, mutableState2, mutableState3, mutableState4, mutableState5, mutableState6, mutableState7, i, i5) { // from class: com.squareup.cash.graphics.views.effect.GlitterEffectKt$$ExternalSyntheticLambda0
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ Modifier f$0;
                public final /* synthetic */ Bitmap f$1;
                public final /* synthetic */ MutableState f$2;
                public final /* synthetic */ MutableState f$3;
                public final /* synthetic */ MutableState f$4;
                public final /* synthetic */ MutableState f$5;
                public final /* synthetic */ MutableState f$6;
                public final /* synthetic */ MutableState f$7;
                public final /* synthetic */ MutableState f$8;

                {
                    this.$r8$classId = i5;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (this.$r8$classId) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int updateChangedFlags = Updater.updateChangedFlags(7);
                            UnsignedBytes.GlitterEffect(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, (Composer) obj, updateChangedFlags);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int updateChangedFlags2 = Updater.updateChangedFlags(7);
                            UnsignedBytes.GlitterEffect(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, (Composer) obj, updateChangedFlags2);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            endRestartGroup.block = function2;
        }
    }

    public static byte checkedCast(long j) {
        Trace.checkArgument(j, "out of range: %s", (j >> 8) == 0);
        return (byte) j;
    }

    public static void onError(Throwable th) {
        if (th == null) {
            th = ExceptionHelper.createNullPointerException("onError called with a null Throwable.");
        } else if (!(th instanceof OnErrorNotImplementedException) && !(th instanceof MissingBackpressureException) && !(th instanceof QueueOverflowException) && !(th instanceof IllegalStateException) && !(th instanceof NullPointerException) && !(th instanceof IllegalArgumentException) && !(th instanceof CompositeException)) {
            th = new UndeliverableException("The exception could not be delivered to the consumer because it has already canceled/disposed the flow or the exception has nowhere to go to begin with. Further reading: https://github.com/ReactiveX/RxJava/wiki/What's-different-in-2.0#error-handling | " + th, th);
        }
        th.printStackTrace();
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }
}
