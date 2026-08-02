package coil3.request;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ScrollView;
import androidx.core.view.ScrollingView;
import androidx.credentials.CredentialProviderFactory;
import androidx.room.Room;
import com.bumptech.glide.gifdecoder.GifHeaderParser;
import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.engine.Engine;
import com.bumptech.glide.load.engine.EngineJob;
import com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool;
import com.bumptech.glide.load.engine.executor.GlideExecutor;
import com.bumptech.glide.load.model.AssetUriLoader;
import com.bumptech.glide.load.model.ByteBufferEncoder;
import com.bumptech.glide.load.model.FileLoader;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.MultiModelLoaderFactory;
import com.bumptech.glide.load.model.stream.HttpGlideUrlLoader;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import com.bumptech.glide.util.pool.FactoryPools;
import com.caverock.androidsvg.SVG;
import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.rum.RumSessionListener;
import com.datadog.android.rum.tracking.ActionTrackingStrategy;
import com.datadog.android.rum.tracking.ViewTarget;
import com.fillr.m1;
import com.fillr.service.AddressMappingService;
import com.fillr.service.CaptureFieldsMappingService;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.zaaz;
import com.google.android.gms.common.api.internal.zabv;
import com.google.android.gms.common.internal.service.zab;
import com.google.android.gms.common.internal.service.zaj;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.identitycredentials.internal.IIdentityCredentialService;
import com.google.android.gms.identitycredentials.internal.IdentityCredentialClientImpl;
import com.google.android.gms.identitycredentials.internal.InternalIdentityCredentialClient$getCredential$1$callback$1;
import com.google.android.gms.internal.base.zac;
import com.google.android.gms.internal.identity_credentials.zzc;
import com.google.android.gms.internal.tapandpay.zzai;
import com.google.android.gms.internal.tapandpay.zzaj;
import com.google.android.gms.internal.tapandpay.zzd;
import com.google.android.gms.internal.time.zzag;
import com.google.android.gms.internal.time.zzcw;
import com.google.android.gms.internal.time.zzk;
import com.google.android.gms.measurement.internal.zzji;
import com.google.android.gms.measurement.internal.zzjl;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.zzb;
import com.google.android.gms.tasks.zzw;
import com.google.android.material.internal.MaterialCheckable$OnCheckedChangeListener;
import com.squareup.workflow1.internal.SubtreeManager;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executors;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptySet;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.DeferredCoroutine;
import net.oneformapp.schema.Element;
import okhttp3.HttpUrl;
import org.slf4j.Marker;

/* loaded from: classes3.dex */
public final class OneShotDisposable implements Disposable, FactoryPools.Factory, ModelLoaderFactory, Encoder, DefaultImageHeaderParser.Reader, RumSessionListener, ActionTrackingStrategy, RemoteCall, Continuation, MaterialCheckable$OnCheckedChangeListener {
    public final /* synthetic */ int $r8$classId;
    public Object job;

    public OneShotDisposable(int i) {
        this.$r8$classId = i;
        switch (i) {
            case 7:
                this.job = new m1(9);
                break;
            case 9:
                this.job = new ArrayDeque(0);
                break;
            case 11:
                this.job = new CopyOnWriteArraySet();
                break;
            case 13:
                this.job = new int[2];
                break;
            case 14:
                this.job = Executors.newSingleThreadExecutor();
                break;
            case 25:
                this.job = new zzb(0);
                break;
            default:
                this.job = new ByteBufferEncoder(7);
                break;
        }
    }

    public static boolean hitTest(View view, float f, float f2, int[] iArr) {
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        return f >= ((float) i) && f <= ((float) (i + view.getWidth())) && f2 >= ((float) i2) && f2 <= ((float) (i2 + view.getHeight()));
    }

    public static OneShotDisposable zzc(String str) {
        return new OneShotDisposable((TextUtils.isEmpty(str) || str.length() > 1) ? zzji.UNINITIALIZED : zzjl.zzj(str.charAt(0)), 24);
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public void accept(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 18:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                zaj zajVar = (zaj) ((zab) obj).getService();
                com.google.android.gms.common.internal.zab zabVar = (com.google.android.gms.common.internal.zab) this.job;
                Parcel zaa = zajVar.zaa();
                zac.zab(zaa, zabVar);
                try {
                    zajVar.zaa.transact(1, zaa, null, 1);
                    zaa.recycle();
                    taskCompletionSource.setResult(null);
                    return;
                } catch (Throwable th) {
                    zaa.recycle();
                    throw th;
                }
            case 19:
                GetCredentialRequest getCredentialRequest = (GetCredentialRequest) this.job;
                InternalIdentityCredentialClient$getCredential$1$callback$1 internalIdentityCredentialClient$getCredential$1$callback$1 = new InternalIdentityCredentialClient$getCredential$1$callback$1(0, (TaskCompletionSource) obj2);
                IIdentityCredentialService iIdentityCredentialService = (IIdentityCredentialService) ((IdentityCredentialClientImpl) obj).getService();
                ApiMetadata apiMetadata = new ApiMetadata(new ComplianceOptions(-1, -1, true, 0), false);
                apiMetadata.zze = false;
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i = zzc.$r8$clinit;
                obtain.writeStrongBinder(internalIdentityCredentialClient$getCredential$1$callback$1);
                zzc.zzb(obtain, getCredentialRequest);
                zzc.zzb(obtain, apiMetadata);
                ((IIdentityCredentialService.Stub.Proxy) iIdentityCredentialService).transactAndReadExceptionReturnVoid(obtain, 1);
                return;
            default:
                Activity activity = (Activity) this.job;
                zzd zzdVar = (zzd) ((zzaj) obj).getService();
                zzai zzaiVar = new zzai(4, activity);
                Parcel zza = zzdVar.zza();
                int i2 = com.google.android.gms.internal.tapandpay.zzc.$r8$clinit;
                zza.writeStrongBinder(zzaiVar);
                zzdVar.zzb(zza, 29);
                return;
        }
    }

    @Override // com.bumptech.glide.load.model.ModelLoaderFactory
    public ModelLoader build(MultiModelLoaderFactory multiModelLoaderFactory) {
        switch (this.$r8$classId) {
            case 4:
                return new FileLoader((ByteBufferEncoder) this.job, 2);
            case 5:
                return new AssetUriLoader((Resources) this.job, multiModelLoaderFactory.build(Uri.class, InputStream.class));
            default:
                return new HttpGlideUrlLoader((m1) this.job);
        }
    }

    public void cancel() {
        ((zzw) ((zzb) this.job).zza).zzb(null);
    }

    public void convertQueryToAddress(String str, String str2, String str3, Element element) {
        CaptureFieldsMappingService captureFieldsMappingService = (CaptureFieldsMappingService) this.job;
        if (str2.length() > 0) {
            Intent intent = new Intent(captureFieldsMappingService, (Class<?>) AddressMappingService.class);
            intent.putExtra("group_parent", str);
            intent.putExtra("query", str2);
            intent.putExtra("profile_element", (Serializable) element);
            intent.putExtra("com.fillr.devkey", captureFieldsMappingService.mDevKey);
            intent.putExtra("com.fillr.secretkey", captureFieldsMappingService.mSecretKey);
            intent.putExtra("com.fillr.sdkversion", captureFieldsMappingService.mSdkVersion);
            intent.putExtra("com.fillr.domain", str3);
            captureFieldsMappingService.startService(intent);
        }
    }

    @Override // com.bumptech.glide.util.pool.FactoryPools.Factory
    public Object create() {
        SubtreeManager subtreeManager = (SubtreeManager) this.job;
        return new EngineJob((GlideExecutor) subtreeManager.snapshotCache, (GlideExecutor) subtreeManager.contextForChildren, (GlideExecutor) subtreeManager.emitActionToParent, (GlideExecutor) subtreeManager.workflowSession, (Engine) subtreeManager.interceptor, (Engine) subtreeManager.idCounter, (SVG) subtreeManager.children);
    }

    @Override // coil3.request.Disposable
    public void dispose() {
        DeferredCoroutine deferredCoroutine = (DeferredCoroutine) this.job;
        if (deferredCoroutine.isActive()) {
            deferredCoroutine.cancel(null);
        }
    }

    @Override // com.bumptech.glide.load.Encoder
    public boolean encode(Object obj, File file, com.bumptech.glide.load.Options options) {
        InputStream inputStream = (InputStream) obj;
        LruArrayPool lruArrayPool = (LruArrayPool) this.job;
        byte[] bArr = (byte[]) lruArrayPool.get(byte[].class, 65536);
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, read);
                    } catch (IOException e) {
                        e = e;
                        fileOutputStream = fileOutputStream2;
                        if (Log.isLoggable("StreamEncoder", 3)) {
                            Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e);
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        lruArrayPool.put(bArr);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        lruArrayPool.put(bArr);
                        throw th;
                    }
                }
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
                lruArrayPool.put(bArr);
                return true;
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // com.datadog.android.rum.tracking.ActionTrackingStrategy
    public ViewTarget findTargetForScroll(View view, float f, float f2) {
        view.getClass();
        if (hitTest(view, f, f2, (int[]) this.job) && view.getVisibility() == 0 && (ScrollingView.class.isAssignableFrom(view.getClass()) || AbsListView.class.isAssignableFrom(view.getClass()) || ScrollView.class.isAssignableFrom(view.getClass()))) {
            return new ViewTarget(new WeakReference(view));
        }
        return null;
    }

    @Override // com.datadog.android.rum.tracking.ActionTrackingStrategy
    public ViewTarget findTargetForTap(View view, float f, float f2) {
        view.getClass();
        if (hitTest(view, f, f2, (int[]) this.job) && view.isClickable() && view.getVisibility() == 0) {
            return new ViewTarget(new WeakReference(view));
        }
        return null;
    }

    @Override // coil3.request.Disposable
    public Deferred getJob() {
        return (DeferredCoroutine) this.job;
    }

    @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
    public int getUInt16() {
        return getUInt8() | (getUInt8() << 8);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
    public short getUInt8() {
        int read = ((InputStream) this.job).read();
        if (read != -1) {
            return (short) read;
        }
        throw new DefaultImageHeaderParser.Reader.EndOfFileException();
    }

    public Set headerTypesForUrl(HttpUrl httpUrl) {
        Object obj;
        httpUrl.getClass();
        String str = httpUrl.host;
        Set set = (Set) ((LinkedHashMap) this.job).get(str);
        if (set != null) {
            return set;
        }
        Iterator it = ((LinkedHashMap) this.job).entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (StringsKt__StringsJVMKt.endsWith(str, "." + ((Map.Entry) obj).getKey(), false)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        Set set2 = entry != null ? (Set) entry.getValue() : null;
        if (set2 != null) {
            return set2;
        }
        Set set3 = (Set) ((LinkedHashMap) this.job).get(Marker.ANY_MARKER);
        return set3 == null ? EmptySet.INSTANCE : set3;
    }

    public boolean isConnected() {
        zabv zabvVar = ((zaaz) this.job).zal;
        return zabvVar != null && zabvVar.zai();
    }

    public boolean isFirstPartyUrl(HttpUrl httpUrl) {
        httpUrl.getClass();
        String str = httpUrl.host;
        Set<String> keySet = ((LinkedHashMap) this.job).keySet();
        if (!(keySet instanceof Collection) || !keySet.isEmpty()) {
            for (String str2 : keySet) {
                if (Intrinsics.areEqual(str2, Marker.ANY_MARKER) || Intrinsics.areEqual(str, str2)) {
                    return true;
                }
                if (StringsKt__StringsJVMKt.endsWith(str, "." + str2, false)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.datadog.android.rum.RumSessionListener
    public void onSessionStarted(String str, boolean z) {
        str.getClass();
        RumSessionListener[] rumSessionListenerArr = (RumSessionListener[]) this.job;
        for (int i = 0; i < 2; i++) {
            rumSessionListenerArr[i].onSessionStarted(str, z);
        }
    }

    @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
    public int read(int i, byte[] bArr) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < i && (i3 = ((InputStream) this.job).read(bArr, i2, i - i2)) != -1) {
            i2 += i3;
        }
        if (i2 == 0 && i3 == -1) {
            throw new DefaultImageHeaderParser.Reader.EndOfFileException();
        }
        return i2;
    }

    @Override // com.datadog.android.rum.tracking.TrackingStrategy
    public void register(InternalSdkCore internalSdkCore, Context context) {
        internalSdkCore.getClass();
        context.getClass();
    }

    public synchronized void release(GifHeaderParser gifHeaderParser) {
        gifHeaderParser.rawData = null;
        gifHeaderParser.header = null;
        ((ArrayDeque) this.job).offer(gifHeaderParser);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
    public long skip(long j) {
        InputStream inputStream = (InputStream) this.job;
        if (j < 0) {
            return 0L;
        }
        long j2 = j;
        while (j2 > 0) {
            long skip = inputStream.skip(j2);
            if (skip <= 0) {
                if (inputStream.read() == -1) {
                    break;
                }
                skip = 1;
            }
            j2 -= skip;
        }
        return j - j2;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        zzag zzagVar = (zzag) this.job;
        if (task.isSuccessful()) {
            zzagVar.zza = (zzk) task.getResult();
            return Room.forResult(zzagVar);
        }
        zzagVar.zza();
        return zzcw.zza(task);
    }

    @Override // com.datadog.android.rum.tracking.TrackingStrategy
    public void unregister(Context context) {
    }

    public zzji zza() {
        return (zzji) this.job;
    }

    public String zzb() {
        return String.valueOf(zzjl.zzm((zzji) this.job));
    }

    public boolean isFirstPartyUrl(String str) {
        HttpUrl httpUrl = null;
        try {
            HttpUrl.Builder builder = new HttpUrl.Builder();
            builder.parse$okhttp(null, str);
            httpUrl = builder.build();
        } catch (IllegalArgumentException unused) {
        }
        if (httpUrl == null) {
            return false;
        }
        return isFirstPartyUrl(httpUrl);
    }

    public /* synthetic */ OneShotDisposable(Object obj, int i) {
        this.$r8$classId = i;
        this.job = obj;
    }

    public OneShotDisposable(IObjectWrapper iObjectWrapper) {
        this.$r8$classId = 23;
        zzae.checkNotNull(iObjectWrapper);
        this.job = iObjectWrapper;
    }

    public OneShotDisposable(Map map) {
        this.$r8$classId = 10;
        map.getClass();
        Set<Map.Entry> entrySet = map.entrySet();
        int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(entrySet, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity < 16 ? 16 : mapCapacity);
        for (Map.Entry entry : entrySet) {
            String str = (String) entry.getKey();
            Locale locale = Locale.US;
            linkedHashMap.put(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(locale, str, locale), entry.getValue());
        }
        this.job = linkedHashMap;
    }

    public OneShotDisposable(Context context) {
        this.$r8$classId = 3;
        this.job = new CredentialProviderFactory(context, 1, false);
    }

    public /* synthetic */ OneShotDisposable(int i, boolean z) {
        this.$r8$classId = i;
    }
}
