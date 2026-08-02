package com.fillr;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.room.Room;
import androidx.viewpager2.widget.ViewPager2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.we$$ExternalSyntheticLambda0;
import coil3.memory.RealMemoryCache;
import coil3.memory.RealStrongMemoryCache;
import coil3.memory.RealWeakMemoryCache;
import com.alexvasilkov.gestures.views.GestureImageView;
import com.bugsnag.android.Client;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.FileDescriptorLocalUriFetcher;
import com.bumptech.glide.load.model.ModelCache$1;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.MultiModelLoaderFactory;
import com.bumptech.glide.load.model.UriLoader;
import com.caverock.androidsvg.SVG;
import com.datadog.android.trace.internal.compat.function.Function;
import com.datadog.trace.api.normalize.AntPathMatcher;
import com.datadog.trace.api.normalize.AntPatternHttpPathNormalizer;
import com.fillr.analytics.AnalyticsEvent;
import com.fillr.browsersdk.Fillr;
import com.fillr.core.utilities.AppPreferenceStore;
import com.fillr.embedded.profile.UserGeneratedProfile;
import com.google.android.datatransport.runtime.TransportImpl$$ExternalSyntheticLambda0;
import com.google.android.filament.Box;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.zabk;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.dynamic.zah;
import com.google.android.gms.internal.appset.zzl;
import com.google.android.gms.internal.appset.zzr;
import com.google.android.gms.internal.location.zzc;
import com.google.android.gms.internal.location.zzde;
import com.google.android.gms.internal.location.zzdz;
import com.google.android.gms.internal.location.zzu;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.maps.internal.zzbu;
import com.google.android.gms.maps.model.VisibleRegion;
import com.google.android.gms.maps.zzah;
import com.google.android.gms.maps.zzai;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.OnTokenCanceledListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.zzb;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.google.android.gms.wallet.internal.WalletClientImpl;
import com.google.android.gms.wallet.internal.zza;
import com.google.android.gms.wallet.internal.zze;
import com.google.android.material.appbar.AppBarLayout;
import dev.chrisbanes.haze.Pool;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.Vector;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import net.idrnd.misnap.iad.Payload;
import net.oneformapp.PopEncryptorV2_;
import net.oneformapp.ProfileStore_;
import net.oneformapp.encryptionlib.AES256JNCryptor;
import net.oneformapp.encryptionlib.CryptorException;
import okio.ByteString;
import org.androidannotations.api.sharedpreferences.SharedPreferencesCompat;
import org.bouncycastle.pkcs.PKCS10CertificationRequest;
import org.json.JSONObject;
import org.slf4j.Marker;

/* loaded from: classes4.dex */
public final class m1 implements AccessibilityViewCommand, ModelLoaderFactory, UriLoader.LocalUriFetcherFactory, Function, OnCompleteListener, Continuation, RemoteCall, OnTokenCanceledListener, OnSuccessListener, OnApplyWindowInsetsListener {
    public static m1 mInstance;
    public final /* synthetic */ int $r8$classId;
    public Object a;

    public m1(int i) {
        this.$r8$classId = i;
        switch (i) {
            case 9:
                this.a = new ModelCache$1(500L);
                break;
            case 10:
            default:
                this.a = new Vector();
                break;
            case 11:
                this.a = new WeakHashMap();
                break;
        }
    }

    public static m1 getInstance() {
        if (mInstance == null) {
            mInstance = new m1(13, false);
        }
        return mInstance;
    }

    public static void maxSizePercent$default(m1 m1Var, Context context) {
        double d = 0.2d;
        try {
            Object systemService = context.getSystemService((Class<Object>) ActivityManager.class);
            systemService.getClass();
            if (((ActivityManager) systemService).isLowRamDevice()) {
                d = 0.15d;
            }
        } catch (Exception unused) {
        }
        if (0.0d > d || d > 1.0d) {
            a$$ExternalSyntheticBUOutline0.m$3("percent must be in the range [0.0, 1.0].");
        } else {
            m1Var.a = new we$$ExternalSyntheticLambda0(d, context, 1);
        }
    }

    public void a(l1 l1Var) {
        ((Vector) this.a).addElement(l1Var);
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public void accept(Object obj, Object obj2) {
        char c = 1;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        switch (this.$r8$classId) {
            case 22:
                zzdz zzdzVar = (zzdz) obj;
                LocationSettingsRequest locationSettingsRequest = (LocationSettingsRequest) this.a;
                zzae.checkArgument("locationSettingsRequest can't be null", locationSettingsRequest != null);
                zzu zzuVar = (zzu) zzdzVar.getService();
                zzde zzdeVar = new zzde(0, taskCompletionSource);
                Parcel zza = zzuVar.zza();
                zzc.zzb(zza, locationSettingsRequest);
                zza.writeStrongBinder(zzdeVar);
                zza.writeString(null);
                zzuVar.zzc(zza, 63);
                return;
            default:
                WalletClientImpl walletClientImpl = (WalletClientImpl) obj;
                PaymentDataRequest paymentDataRequest = (PaymentDataRequest) this.a;
                Bundle zzp = walletClientImpl.zzp();
                zzp.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
                zze zzeVar = new zze(c == true ? 1 : 0, taskCompletionSource);
                try {
                    zza zzaVar = (zza) walletClientImpl.getService();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    com.google.android.gms.internal.wallet.zzc.zzc(obtain, paymentDataRequest);
                    com.google.android.gms.internal.wallet.zzc.zzc(obtain, zzp);
                    obtain.writeStrongBinder(zzeVar);
                    try {
                        zzaVar.zza.transact(19, obtain, null, 1);
                        obtain.recycle();
                        return;
                    } catch (Throwable th) {
                        obtain.recycle();
                        throw th;
                    }
                } catch (RemoteException e) {
                    Log.e("WalletClientImpl", "RemoteException getting payment data", e);
                    Bundle bundle = Bundle.EMPTY;
                    zzeVar.onPaymentDataLoaded(Status.RESULT_INTERNAL_ERROR, null);
                    return;
                }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0149 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x014a  */
    @Override // com.datadog.android.trace.internal.compat.function.Function
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object apply(Object obj) {
        String str;
        Iterator it;
        int i;
        String str2;
        Iterator it2;
        String str3 = (String) obj;
        Iterator it3 = ((AntPatternHttpPathNormalizer) this.a).resourceNameMatchers.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            String str4 = (String) entry.getKey();
            if (str3 != null && str3.startsWith("/") == str4.startsWith("/")) {
                String[] strArr = AntPathMatcher.tokenizeToStringArray(str4);
                String[] strArr2 = AntPathMatcher.tokenizeToStringArray(str3);
                int length = strArr.length - 1;
                int length2 = strArr2.length - 1;
                int i2 = 0;
                int i3 = 0;
                while (i2 <= length && i3 <= length2) {
                    String str5 = strArr[i2];
                    if ("**".equals(str5)) {
                        break;
                    }
                    if (!AntPathMatcher.matchStrings(str5, strArr2[i3])) {
                        break;
                    }
                    i2++;
                    i3++;
                }
                if (i3 > length2) {
                    if (i2 <= length) {
                        if (i2 != length || !strArr[i2].equals(Marker.ANY_MARKER) || !str3.endsWith("/")) {
                            while (i2 <= length) {
                                if (strArr[i2].equals("**")) {
                                    i2++;
                                }
                            }
                        }
                        str = str3;
                        if (!Marker.ANY_MARKER.equals(entry.getValue())) {
                        }
                    } else if (str4.endsWith("/") == str3.endsWith("/")) {
                        str = str3;
                        return !Marker.ANY_MARKER.equals(entry.getValue()) ? str : (String) entry.getValue();
                    }
                } else if (i2 <= length) {
                    while (i2 <= length && i3 <= length2) {
                        String str6 = strArr[length];
                        if (str6.equals("**")) {
                            break;
                        }
                        if (!AntPathMatcher.matchStrings(str6, strArr2[length2])) {
                            break;
                        }
                        length--;
                        length2--;
                    }
                    if (i3 > length2) {
                        while (i2 <= length) {
                            if (strArr[i2].equals("**")) {
                                i2++;
                            }
                        }
                        str = str3;
                        if (!Marker.ANY_MARKER.equals(entry.getValue())) {
                        }
                    } else {
                        while (i2 != length && i3 <= length2) {
                            int i4 = i2 + 1;
                            int i5 = i4;
                            while (true) {
                                if (i5 > length) {
                                    i5 = -1;
                                    break;
                                }
                                if (strArr[i5].equals("**")) {
                                    break;
                                }
                                i5++;
                            }
                            if (i5 == i4) {
                                i2 = i4;
                            } else {
                                int i6 = (i5 - i2) - 1;
                                int i7 = (length2 - i3) + 1;
                                int i8 = 0;
                                while (true) {
                                    if (i8 > i7 - i6) {
                                        str = str3;
                                        it = it3;
                                        i = -1;
                                        break;
                                    }
                                    int i9 = 0;
                                    while (i9 < i6) {
                                        str2 = str3;
                                        it2 = it3;
                                        if (!AntPathMatcher.matchStrings(strArr[i2 + i9 + 1], strArr2[i3 + i8 + i9])) {
                                            break;
                                        }
                                        i9++;
                                        str3 = str2;
                                        it3 = it2;
                                    }
                                    str = str3;
                                    it = it3;
                                    i = i3 + i8;
                                    break;
                                    i8++;
                                    str3 = str2;
                                    it3 = it2;
                                }
                                if (i == -1) {
                                    break;
                                }
                                i3 = i + i6;
                                i2 = i5;
                                str3 = str;
                                it3 = it;
                            }
                        }
                        str = str3;
                        it = it3;
                        while (i2 <= length) {
                            if (!strArr[i2].equals("**")) {
                                break;
                            }
                            i2++;
                        }
                        if (!Marker.ANY_MARKER.equals(entry.getValue())) {
                        }
                    }
                }
            }
            str = str3;
            it = it3;
            str3 = str;
            it3 = it;
        }
        return null;
    }

    public RealMemoryCache build() {
        RealWeakMemoryCache realWeakMemoryCache = new RealWeakMemoryCache(0);
        we$$ExternalSyntheticLambda0 we__externalsyntheticlambda0 = (we$$ExternalSyntheticLambda0) this.a;
        if (we__externalsyntheticlambda0 != null) {
            return new RealMemoryCache(new RealStrongMemoryCache(((Number) we__externalsyntheticlambda0.invoke()).longValue(), realWeakMemoryCache), realWeakMemoryCache);
        }
        a$$ExternalSyntheticBUOutline0.m$1("maxSizeBytesFactory == null");
        return null;
    }

    public void createEvent(JSONObject jSONObject) {
        String str;
        SVG svg = (SVG) this.a;
        if (svg == null) {
            SVG svg2 = Fillr.getInstance().fillrConfig;
            return;
        }
        AnalyticsEvent createEvent = svg.createEvent();
        String.valueOf(jSONObject.optInt("pop_id", 0));
        if (!jSONObject.has("successfully_filled")) {
            if (jSONObject.optBoolean("mapped_but_no_value")) {
                str = "Mapped But No Value";
            }
            str = null;
        } else if (jSONObject.optBoolean("successfully_filled")) {
            str = "Successful";
        } else {
            if (!jSONObject.optBoolean("successfully_filled")) {
                str = "Error";
            }
            str = null;
        }
        if (str == null) {
            return;
        }
        jSONObject.optString("param");
        createEvent.action = str;
        ((Box) svg.idToElementMap).sendEvent((Context) svg.cssRules, createEvent);
    }

    public PopEncryptorV2_ getPopEncryptor(Context context, char[] cArr) {
        byte[] decode;
        byte[] decode2;
        if (((PopEncryptorV2_) this.a) == null) {
            this.a = PopEncryptorV2_.getInstance_(context);
        }
        PopEncryptorV2_ popEncryptorV2_ = (PopEncryptorV2_) this.a;
        if (!popEncryptorV2_.isInit) {
            try {
                popEncryptorV2_.cryptor = new AES256JNCryptor();
                if (((Pool) popEncryptorV2_.authStore).getEncryptionSalt() == null && ((Pool) popEncryptorV2_.authStore).getEncryptionhmac() == null) {
                    decode = new byte[8];
                    SecureRandom secureRandom = AES256JNCryptor.SECURE_RANDOM;
                    secureRandom.nextBytes(decode);
                    decode2 = new byte[8];
                    secureRandom.nextBytes(decode2);
                    Pool pool = (Pool) popEncryptorV2_.authStore;
                    String encodeToString = Base64.encodeToString(decode, 2);
                    SharedPreferences.Editor edit = ((SharedPreferences) ((Payload) pool.pool).a).edit();
                    edit.putString("encryptionSalt", encodeToString);
                    SharedPreferencesCompat.apply(edit);
                    Pool pool2 = (Pool) popEncryptorV2_.authStore;
                    String encodeToString2 = Base64.encodeToString(decode2, 2);
                    SharedPreferences.Editor edit2 = ((SharedPreferences) ((Payload) pool2.pool).a).edit();
                    edit2.putString("encryptionhmac", encodeToString2);
                    SharedPreferencesCompat.apply(edit2);
                } else {
                    decode = Base64.decode(((Pool) popEncryptorV2_.authStore).getEncryptionSalt(), 2);
                    decode2 = Base64.decode(((Pool) popEncryptorV2_.authStore).getEncryptionhmac(), 2);
                }
                popEncryptorV2_.encryptionKey = ((AES256JNCryptor) popEncryptorV2_.cryptor).keyForPassword(cArr, decode);
                popEncryptorV2_.hmacKey = ((AES256JNCryptor) popEncryptorV2_.cryptor).keyForPassword(cArr, decode2);
                popEncryptorV2_.isInit = true;
            } catch (Exception e) {
                popEncryptorV2_.encryptionKey = null;
                popEncryptorV2_.hmacKey = null;
                e.printStackTrace();
            }
        }
        return (PopEncryptorV2_) this.a;
    }

    public VisibleRegion getVisibleRegion() {
        try {
            zzbu zzbuVar = (zzbu) this.a;
            Parcel zzJ = zzbuVar.zzJ(zzbuVar.zza(), 3);
            VisibleRegion visibleRegion = (VisibleRegion) com.google.android.gms.internal.maps.zzc.zza(zzJ, VisibleRegion.CREATOR);
            zzJ.recycle();
            return visibleRegion;
        } catch (RemoteException e) {
            TransportImpl$$ExternalSyntheticLambda0.m(e);
            return null;
        }
    }

    public void init(Context context) {
        this.a = PopEncryptorV2_.getInstance_(context);
        UserGeneratedProfile userGeneratedProfile = new UserGeneratedProfile();
        userGeneratedProfile.preferenceStore = null;
        userGeneratedProfile.profileStore = ProfileStore_.getInstance_(context);
        Pool pool = new Pool();
        pool.pool = new Payload(context);
        userGeneratedProfile.authStore = pool;
        AppPreferenceStore appPreferenceStore = new AppPreferenceStore(context);
        userGeneratedProfile.preferenceStore = appPreferenceStore;
        synchronized (UserGeneratedProfile.mutex) {
            SharedPreferences sharedPreferences = appPreferenceStore.mPreferences;
            if (!(sharedPreferences != null ? sharedPreferences.getBoolean("F_HAS_PASSCODE", false) : false)) {
                try {
                    userGeneratedProfile.setUpProfile();
                } catch (CryptorException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        AppBarLayout appBarLayout = (AppBarLayout) this.a;
        WindowInsetsCompat windowInsetsCompat2 = appBarLayout.getFitsSystemWindows() ? windowInsetsCompat : null;
        if (!Objects.equals(appBarLayout.lastInsets, windowInsetsCompat2)) {
            appBarLayout.lastInsets = windowInsetsCompat2;
            appBarLayout.setWillNotDraw(!(appBarLayout.statusBarForeground != null && appBarLayout.getTopInset() > 0));
            appBarLayout.requestLayout();
        }
        return windowInsetsCompat;
    }

    @Override // com.google.android.gms.tasks.OnTokenCanceledListener
    public void onCanceled() {
        try {
            com.google.android.gms.common.internal.zzu zzuVar = (com.google.android.gms.common.internal.zzu) ((ICancelToken) this.a);
            Parcel zza = zzuVar.zza();
            try {
                zzuVar.zaa.transact(2, zza, null, 1);
            } finally {
                zza.recycle();
            }
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((CountDownLatch) this.a).countDown();
    }

    public void onDelegateCreated(zzah zzahVar) {
        zzai zzaiVar = (zzai) this.a;
        zzaiVar.zaa = zzahVar;
        Iterator it = ((LinkedList) zzaiVar.zac).iterator();
        while (it.hasNext()) {
            ((zah) it.next()).zab();
        }
        ((LinkedList) zzaiVar.zac).clear();
        zzaiVar.zab = null;
    }

    public void onPreDraw(Canvas canvas) {
    }

    public void onSignOutComplete() {
        ((zabk) this.a).zaa.zas.post(new Client.AnonymousClass7(this, 24));
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        ((OnTokenCanceledListener) this.a).onCanceled();
    }

    @Override // androidx.core.view.accessibility.AccessibilityViewCommand
    public boolean perform(View view) {
        n nVar = (n) this.a;
        int i = ((ViewPager2) view).mCurrentItem - 1;
        ViewPager2 viewPager2 = (ViewPager2) nVar.d;
        if (viewPager2.mUserInputEnabled) {
            viewPager2.setCurrentItemInternal(i, true);
        }
        return true;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        zzr zzrVar = (zzr) this.a;
        if (!task.isSuccessful() && !task.isCanceled()) {
            Exception exception = task.getException();
            if (exception instanceof ApiException) {
                int i = ((ApiException) exception).mStatus.zza;
                if (i == 43001 || i == 43002 || i == 43003 || i == 17) {
                    final zzl zzlVar = zzrVar.zzb;
                    zzlVar.getClass();
                    final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                    zzlVar.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.appset.zzh
                        @Override // java.lang.Runnable
                        public final void run() {
                            Context context = zzl.this.zzb;
                            String string2 = zzl.zzf(context).getString("app_set_id", null);
                            long j = zzl.zzf(context).getLong("app_set_id_last_used_time", -1L);
                            long j2 = j != -1 ? j + 33696000000L : -1L;
                            TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                            if (string2 == null || System.currentTimeMillis() > j2) {
                                string2 = UUID.randomUUID().toString();
                                try {
                                    if (!context.getSharedPreferences("app_set_id_storage", 0).edit().putString("app_set_id", string2).commit()) {
                                        String valueOf = String.valueOf(context.getPackageName());
                                        Log.e("AppSet", valueOf.length() != 0 ? "Failed to store app set ID generated for App ".concat(valueOf) : new String("Failed to store app set ID generated for App "));
                                        throw new zzk("Failed to store the app set ID.");
                                    }
                                    zzl.zzg(context);
                                    if (!context.getSharedPreferences("app_set_id_storage", 0).edit().putLong("app_set_id_creation_time", System.currentTimeMillis()).commit()) {
                                        String valueOf2 = String.valueOf(context.getPackageName());
                                        Log.e("AppSet", valueOf2.length() != 0 ? "Failed to store app set ID creation time for App ".concat(valueOf2) : new String("Failed to store app set ID creation time for App "));
                                        throw new zzk("Failed to store the app set ID creation time.");
                                    }
                                } catch (zzk e) {
                                    taskCompletionSource2.setException(e);
                                    return;
                                }
                            } else {
                                try {
                                    zzl.zzg(context);
                                } catch (zzk e2) {
                                    taskCompletionSource2.setException(e2);
                                    return;
                                }
                            }
                            taskCompletionSource2.setResult(new AppSetIdInfo(string2, 1));
                        }
                    });
                    return taskCompletionSource.zza;
                }
                if (i == 43000) {
                    return Room.forException(new Exception("Failed to get app set ID due to an internal error. Please try again later."));
                }
                if (i == 15) {
                    return Room.forException(new Exception("The operation to get app set ID timed out. Please try again later."));
                }
            }
        }
        return task;
    }

    public /* synthetic */ m1(Object obj, int i) {
        this.$r8$classId = i;
        this.a = obj;
    }

    @Override // com.bumptech.glide.load.model.UriLoader.LocalUriFetcherFactory
    public DataFetcher build(Uri uri) {
        return new FileDescriptorLocalUriFetcher((ContentResolver) this.a, uri, 1);
    }

    public /* synthetic */ m1(int i, boolean z) {
        this.$r8$classId = i;
    }

    public m1(zzb zzbVar, OnTokenCanceledListener onTokenCanceledListener) {
        this.$r8$classId = 27;
        this.a = onTokenCanceledListener;
    }

    @Override // com.bumptech.glide.load.model.ModelLoaderFactory
    public ModelLoader build(MultiModelLoaderFactory multiModelLoaderFactory) {
        return new UriLoader(this);
    }

    public m1(ByteString byteString) {
        this.$r8$classId = 4;
        this.a = new PKCS10CertificationRequest(byteString.toByteArray());
    }

    public m1(n1 n1Var) {
        this.$r8$classId = 7;
        this.a = Collections.unmodifiableMap(new HashMap(n1Var.a));
    }

    public m1(GestureImageView gestureImageView) {
        this.$r8$classId = 6;
        this.a = new RectF();
    }
}
