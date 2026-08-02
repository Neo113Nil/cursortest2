package com.fillr;

import android.content.Context;
import android.graphics.Rect;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;
import android.view.TextureView;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import app.cash.broadway.screen.Screen;
import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.rum.tracking.ViewTrackingStrategy;
import com.datadog.android.trace.api.propagation.DatadogPropagation;
import com.datadog.android.trace.api.span.DatadogSpanContext;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.fido.fido2.zzf;
import com.google.android.gms.internal.appset.zzc;
import com.google.android.gms.internal.appset.zzd;
import com.google.android.gms.internal.appset.zzg;
import com.google.android.gms.internal.mlkit_vision_text_common.zzbi;
import com.google.android.gms.internal.mlkit_vision_text_common.zzbk;
import com.google.android.gms.internal.mlkit_vision_text_common.zzce;
import com.google.android.gms.internal.mlkit_vision_text_common.zzr;
import com.google.android.gms.internal.mlkit_vision_text_common.zzu;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.m;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.mlkit.vision.text.Text;
import com.google.mlkit.vision.text.internal.zzk;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.Writer;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.oned.Code128Writer;
import com.squareup.cash.arcade.Emojis;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda4;
import com.squareup.cash.backstack.api.BackStack$ScreenEntry;
import com.squareup.cash.banking.viewmodels.TransfersViewModel$Companion$TransfersTab;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import com.squareup.cash.graphics.backend.gl.GLSceneScope;
import com.squareup.cash.graphics.swampgl.GLThread$start$2;
import com.squareup.cash.history.presenters.CheckStatusPresenter;
import com.squareup.cash.lynx.api.v1_0.model.AvsResultCode;
import com.squareup.cash.lynx.api.v1_0.model.UnlinkedReason;
import com.squareup.cash.ui.MainActivity;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda33;
import com.withpersona.sdk2.camera.CameraPropertiesKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.ArrayIterator;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import okhttp3.Request;
import okio.ByteString;
import okio.RealBufferedSink;

/* loaded from: classes4.dex */
public final class e implements ViewTrackingStrategy, DatadogPropagation, RemoteCall, com.google.android.play.integrity.internal.z, OnFailureListener, zzu, Writer {
    public static TransfersViewModel$Companion$TransfersTab fromId(int i) {
        EnumEntriesList enumEntriesList = TransfersViewModel$Companion$TransfersTab.$ENTRIES;
        ArrayIterator m = CameraState$Type$EnumUnboxingLocalUtility.m(enumEntriesList, enumEntriesList);
        while (m.hasNext()) {
            TransfersViewModel$Companion$TransfersTab transfersViewModel$Companion$TransfersTab = (TransfersViewModel$Companion$TransfersTab) m.next();
            if (transfersViewModel$Companion$TransfersTab.id == i) {
                return transfersViewModel$Companion$TransfersTab;
            }
        }
        OptionalProvider$$ExternalSyntheticLambda0.m("Collection contains no element matching the predicate.");
        return null;
    }

    /* renamed from: fromValue, reason: collision with other method in class */
    public static UnlinkedReason m1941fromValue(int i) {
        switch (i) {
            case 0:
                return UnlinkedReason.UNKNOWN_REASON;
            case 1:
                return UnlinkedReason.UNLINK;
            case 2:
                return UnlinkedReason.REPLACE;
            case 3:
                return UnlinkedReason.COMPLIANCE;
            case 4:
                return UnlinkedReason.FRAUD;
            case 5:
                return UnlinkedReason.RTAU;
            case 6:
                return UnlinkedReason.RTAU_UNLINKED;
            case 7:
                return UnlinkedReason.CUSTOMER_ACCOUNT_DEACTIVATED;
            case 8:
                return UnlinkedReason.PUSH_FAILURE;
            case 9:
                return UnlinkedReason.PLAID_USER_PERMISSION_REVOKED;
            case 10:
                return UnlinkedReason.PLAID_USER_ACCOUNT_REVOKED;
            case 11:
                return UnlinkedReason.NETWORK_TOKEN_UPDATE;
            case 12:
                return UnlinkedReason.BANKLIN_SYNC;
            case 13:
                return UnlinkedReason.MULTI_LINK_CLEAN_UP;
            case 14:
                return UnlinkedReason.P2P_POOL_CLOSED;
            case 15:
                return UnlinkedReason.ASYNC_ACCOUNT_UPDATE;
            default:
                return null;
        }
    }

    public static Emojis get(String str) {
        str.getClass();
        return (Emojis) Emojis.emojisById.get(str);
    }

    public static void printBackStack(MainActivity mainActivity, RealBufferedSink realBufferedSink) {
        StringBuilder sb = new StringBuilder();
        Collection dumpBackStack = mainActivity.dumpBackStack();
        if (dumpBackStack.isEmpty()) {
            sb.append("[no entries]\n");
        }
        Collection collection = dumpBackStack;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((BackStack$ScreenEntry) it.next()).args);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Screen screen = (Screen) it2.next();
            sb.append(screen.getClass() + "@" + screen.hashCode() + "\n");
        }
        sb.append("---\n");
        sb.append(mainActivity.getClass() + "\n\n");
        String sb2 = sb.toString();
        ByteString.Companion companion = ByteString.Companion;
        realBufferedSink.write(ByteString.Companion.encodeUtf8(sb2));
    }

    public void SceneScope(TextureView textureView, CoroutineScope coroutineScope, CoroutineScope coroutineScope2, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        textureView.getClass();
        coroutineScope.getClass();
        coroutineScope2.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1897941869);
        int i2 = i | (gapComposer.changedInstance(textureView) ? 4 : 2) | (gapComposer.changedInstance(coroutineScope2) ? 256 : 128) | (gapComposer.changedInstance(composableLambdaImpl) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1155) != 1154)) {
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (rememberedValue == obj) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m(1.0f, gapComposer);
            }
            MutableFloatState mutableFloatState = (MutableFloatState) rememberedValue;
            Float valueOf = Float.valueOf(((ParcelableSnapshotMutableFloatState) mutableFloatState).getFloatValue());
            boolean changedInstance = gapComposer.changedInstance(textureView);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == obj) {
                rememberedValue2 = new CheckStatusPresenter.AnonymousClass1.C00611(textureView, mutableFloatState, null, 21);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Updater.LaunchedEffect(gapComposer, valueOf, (Function2) rememberedValue2);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (rememberedValue3 == obj) {
                rememberedValue3 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            CoroutineScope coroutineScope3 = (CoroutineScope) rememberedValue3;
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (rememberedValue4 == obj) {
                Context context = textureView.getContext();
                context.getClass();
                HeroCardViewKt$$ExternalSyntheticLambda33 heroCardViewKt$$ExternalSyntheticLambda33 = new HeroCardViewKt$$ExternalSyntheticLambda33(mutableFloatState, 18);
                DefaultScheduler defaultScheduler = Dispatchers.Default;
                rememberedValue4 = new GLSceneScope(context, coroutineScope3, heroCardViewKt$$ExternalSyntheticLambda33, DefaultIoScheduler.INSTANCE);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            GLSceneScope gLSceneScope = (GLSceneScope) rememberedValue4;
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (rememberedValue5 == obj) {
                rememberedValue5 = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer.updateRememberedValue(rememberedValue5);
            }
            MutableState mutableState = (MutableState) rememberedValue5;
            Unit unit = Unit.INSTANCE;
            boolean changedInstance2 = gapComposer.changedInstance(coroutineScope2) | gapComposer.changedInstance(textureView) | gapComposer.changedInstance(gLSceneScope);
            Object rememberedValue6 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue6 == obj) {
                Object gLThread$start$2 = new GLThread$start$2(coroutineScope2, textureView, gLSceneScope, mutableState, null, 2);
                gapComposer.updateRememberedValue(gLThread$start$2);
                rememberedValue6 = gLThread$start$2;
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue6);
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                gapComposer.startReplaceGroup(-1989308111);
                gLSceneScope.FrameRenderer(gapComposer, 8);
                composableLambdaImpl.invoke(gLSceneScope, gapComposer, Integer.valueOf(8 | ((i2 >> 6) & 112)));
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1989259100);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AvatarsKt$$ExternalSyntheticLambda4(this, textureView, coroutineScope, coroutineScope2, composableLambdaImpl, i, 29);
        }
    }

    @Override // com.google.android.play.integrity.internal.z
    public Object a(IBinder iBinder) {
        int i = m.$r8$clinit;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
        return queryLocalInterface instanceof com.google.android.play.integrity.internal.n ? (com.google.android.play.integrity.internal.n) queryLocalInterface : new com.google.android.play.integrity.internal.l(iBinder, "com.google.android.play.core.integrity.protocol.IIntegrityService", 10);
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public void accept(Object obj, Object obj2) {
        zzg zzgVar = (zzg) ((zzd) obj).getService();
        zzf zzfVar = new zzf(1, (TaskCompletionSource) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.appset.internal.IAppSetService");
        int i = zzc.$r8$clinit;
        obtain.writeInt(1);
        MooncakeHeaderViewKt.zzc(obtain, MooncakeHeaderViewKt.zzb(obtain, 20293));
        obtain.writeStrongBinder(zzfVar);
        Parcel obtain2 = Parcel.obtain();
        try {
            zzgVar.zza.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override // com.google.zxing.Writer
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i, int i2, Map map) {
        return new Code128Writer().encode(str, BarcodeFormat.CODE_128, i, i2, map);
    }

    @Override // com.datadog.android.trace.api.propagation.DatadogPropagation
    public DatadogSpanContext extract(Request request) {
        return null;
    }

    @Override // com.datadog.android.trace.api.propagation.DatadogPropagation
    public void inject(DatadogSpanContext datadogSpanContext, Request.Builder builder, Function3 function3) {
        datadogSpanContext.getClass();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to check feature availability", exc);
    }

    @Override // com.datadog.android.rum.tracking.TrackingStrategy
    public void register(InternalSdkCore internalSdkCore, Context context) {
        internalSdkCore.getClass();
        context.getClass();
    }

    @Override // com.datadog.android.rum.tracking.TrackingStrategy
    public void unregister(Context context) {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
    public Object zza(Object obj) {
        zzr zzrVar = (zzr) obj;
        com.google.android.gms.internal.mlkit_vision_text_common.zzf zzfVar = zzrVar.zzb;
        String str = zzrVar.zzf;
        List zzb = zzk.zzb(zzfVar);
        String str2 = zzrVar.zzd;
        if (CameraPropertiesKt.zzb(str2)) {
            str2 = "";
        }
        Rect zza = zzk.zza(zzb);
        if (CameraPropertiesKt.zzb(str)) {
            str = "und";
        }
        float f = zzrVar.zzb.zze;
        zzbi zzbiVar = zzbk.zza;
        zzce zzceVar = zzce.zza;
        return new Text.Symbol(str2, zza, zzb, str);
    }

    public static AvsResultCode fromValue(int i) {
        if (i == 0) {
            return AvsResultCode.UNKNOWN_AVS_RESULT;
        }
        if (i == 1) {
            return AvsResultCode.AVS_MATCH;
        }
        if (i == 2) {
            return AvsResultCode.AVS_NO_MATCH;
        }
        if (i == 3) {
            return AvsResultCode.AVS_SKIPPED;
        }
        if (i != 4) {
            return null;
        }
        return AvsResultCode.AVS_UNAVAILABLE;
    }
}
