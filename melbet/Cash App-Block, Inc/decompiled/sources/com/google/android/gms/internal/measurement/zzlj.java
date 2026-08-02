package com.google.android.gms.internal.measurement;

import android.accounts.Account;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.util.Log;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.ResourceManagerInternal;
import androidx.appcompat.widget.ThemeUtils;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.internal.Lock;
import androidx.core.graphics.ColorUtils;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.room.TransactorKt;
import app.cash.broadway.screen.Screen;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.svg.internal.AndroidSvg;
import com.datadog.android.Datadog;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.core.internal.DatadogCore;
import com.datadog.android.core.internal.SdkFeature;
import com.datadog.android.core.internal.logger.SdkInternalLogger$1;
import com.datadog.android.internal.telemetry.InternalTelemetryEvent;
import com.google.android.gms.internal.mlkit_vision_face.zzjr;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.RegularImmutableList;
import com.google.crypto.tink.KeysetHandle;
import com.google.crypto.tink.Parameters;
import com.google.crypto.tink.aead.AesCtrHmacAeadParameters;
import com.google.crypto.tink.aead.AesEaxParameters;
import com.google.crypto.tink.aead.XAesGcmKey$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.hybrid.EciesParameters;
import com.google.crypto.tink.util.Bytes;
import com.google.firebase.DataCollectionDefaultChange;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.DependencyException;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.firebase.components.Qualified;
import com.google.firebase.events.Event;
import com.google.firebase.events.Publisher;
import com.google.firebase.inject.Provider;
import com.squareup.cash.R;
import com.squareup.cash.cdf.clientroute.ClientRouteInteractFailCheck;
import com.squareup.cash.cdf.clientroute.ClientRouteInteractRoute;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientroutes.RealClientRouteFormatter;
import com.squareup.cash.clientrouting.ClientRouteRouter;
import com.squareup.cash.clientrouting.RealClientRouteRouter$route$1;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.clientrouting.validation.ValidationUtilsKt;
import com.squareup.cash.clientrouting.validation.Validator;
import com.squareup.cash.clientrouting.validation.ValidatorResult;
import com.squareup.cash.clientsync.SyncRangeQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.internal.ContextScope;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class zzlj implements InternalLogger, ComponentContainer, ClientRouteRouter {
    public Object zza;
    public Object zzb;
    public Object zzc;
    public Object zzd;
    public Object zze;
    public Object zzf;

    public /* synthetic */ zzlj(Context context) {
        this.zzb = "files";
        this.zzc = "common";
        this.zze = zzsa.zza;
        this.zzd = "";
        this.zzf = ImmutableList.builder();
        zzky.zza(context != null, "Context cannot be null", new Object[0]);
        this.zza = context.getPackageName();
    }

    public static boolean arrayContains(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList createButtonColorStateList(Context context, int i) {
        int themeAttrColor = ThemeUtils.getThemeAttrColor(context, R.attr.colorControlHighlight);
        int disabledThemeAttrColor = ThemeUtils.getDisabledThemeAttrColor(context, R.attr.colorButtonNormal);
        int[] iArr = ThemeUtils.DISABLED_STATE_SET;
        int[] iArr2 = ThemeUtils.PRESSED_STATE_SET;
        int compositeColors = ColorUtils.compositeColors(themeAttrColor, i);
        return new ColorStateList(new int[][]{iArr, iArr2, ThemeUtils.FOCUSED_STATE_SET, ThemeUtils.EMPTY_STATE_SET}, new int[]{disabledThemeAttrColor, compositeColors, ColorUtils.compositeColors(themeAttrColor, i), i});
    }

    public static LayerDrawable getRatingBarLayerDrawable(ResourceManagerInternal resourceManagerInternal, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable drawable = resourceManagerInternal.getDrawable(context, R.drawable.abc_star_black_48dp);
        Drawable drawable2 = resourceManagerInternal.getDrawable(context, R.drawable.abc_star_half_black_48dp);
        if ((drawable instanceof BitmapDrawable) && drawable.getIntrinsicWidth() == dimensionPixelSize && drawable.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawable;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawable.draw(canvas);
            bitmapDrawable = new BitmapDrawable(createBitmap);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawable2 instanceof BitmapDrawable) && drawable2.getIntrinsicWidth() == dimensionPixelSize && drawable2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawable2;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            drawable2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawable2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static void setPorterDuffColorFilter(Drawable drawable, int i, PorterDuff.Mode mode) {
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = AppCompatDrawableManager.DEFAULT_MODE;
        }
        mutate.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(i, mode));
    }

    public static int toLogLevel(int i) {
        int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(i);
        if (ordinal == 0) {
            return 2;
        }
        if (ordinal == 1) {
            return 3;
        }
        if (ordinal == 2) {
            return 4;
        }
        if (ordinal == 3) {
            return 5;
        }
        if (ordinal == 4) {
            return 6;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    public AesCtrHmacAeadParameters build() {
        if (((Integer) this.zza) == null) {
            a$$ExternalSyntheticBUOutline0.m$6("AES key size is not set");
            return null;
        }
        if (((Integer) this.zzb) == null) {
            a$$ExternalSyntheticBUOutline0.m$6("HMAC key size is not set");
            return null;
        }
        if (((Integer) this.zzc) == null) {
            a$$ExternalSyntheticBUOutline0.m$6("iv size is not set");
            return null;
        }
        Integer num = (Integer) this.zze;
        if (num == null) {
            a$$ExternalSyntheticBUOutline0.m$6("tag size is not set");
            return null;
        }
        if (((AesEaxParameters.Variant) this.zzd) == null) {
            a$$ExternalSyntheticBUOutline0.m$6("hash type is not set");
            return null;
        }
        if (((AesEaxParameters.Variant) this.zzf) == null) {
            a$$ExternalSyntheticBUOutline0.m$6("variant is not set");
            return null;
        }
        int intValue = num.intValue();
        AesEaxParameters.Variant variant = (AesEaxParameters.Variant) this.zzd;
        if (variant == AesEaxParameters.Variant.SHA1) {
            if (intValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num));
            }
        } else if (variant == AesEaxParameters.Variant.SHA224) {
            if (intValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num));
            }
        } else if (variant == AesEaxParameters.Variant.SHA256) {
            if (intValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num));
            }
        } else if (variant == AesEaxParameters.Variant.SHA384) {
            if (intValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num));
            }
        } else {
            if (variant != AesEaxParameters.Variant.SHA512) {
                a$$ExternalSyntheticBUOutline0.m$6("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
                return null;
            }
            if (intValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num));
            }
        }
        return new AesCtrHmacAeadParameters(((Integer) this.zza).intValue(), ((Integer) this.zzb).intValue(), ((Integer) this.zzc).intValue(), ((Integer) this.zze).intValue(), (AesEaxParameters.Variant) this.zzf, (AesEaxParameters.Variant) this.zzd);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public Object get(Class cls) {
        if (!((Set) this.zza).contains(Qualified.unqualified(cls))) {
            throw new DependencyException(Boxes$$ExternalSyntheticOutline1.m(cls, "Attempting to request an undeclared dependency ", "."));
        }
        Object obj = ((ComponentContainer) this.zzf).get(cls);
        if (!cls.equals(Publisher.class)) {
            return obj;
        }
        final Set set = (Set) this.zzd;
        final Publisher publisher = (Publisher) obj;
        return new Publisher(set, publisher) { // from class: com.google.firebase.components.RestrictedComponentContainer$RestrictedPublisher
            public final Set allowedPublishedEvents;
            public final Publisher delegate;

            {
                this.allowedPublishedEvents = set;
                this.delegate = publisher;
            }

            @Override // com.google.firebase.events.Publisher
            public final void publish(Event event) {
                if (this.allowedPublishedEvents.contains(DataCollectionDefaultChange.class)) {
                    this.delegate.publish(event);
                    return;
                }
                throw new DependencyException("Attempting to publish an undeclared event " + event + ".");
            }
        };
    }

    @Override // com.google.firebase.components.ComponentContainer
    public Provider getProvider(Qualified qualified) {
        if (((Set) this.zzb).contains(qualified)) {
            return ((ComponentContainer) this.zzf).getProvider(qualified);
        }
        OptionalProvider$$ExternalSyntheticLambda0.m("Attempting to request an undeclared dependency Provider<", qualified, ">.");
        return null;
    }

    public ColorStateList getTintListForDrawableRes(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            return Strings.getColorStateList(context, R.color.abc_tint_edittext);
        }
        if (i == 2131230977) {
            return Strings.getColorStateList(context, R.color.abc_tint_switch_track);
        }
        if (i != R.drawable.abc_switch_thumb_material) {
            if (i == R.drawable.abc_btn_default_mtrl_shape) {
                return createButtonColorStateList(context, ThemeUtils.getThemeAttrColor(context, R.attr.colorButtonNormal));
            }
            if (i == R.drawable.abc_btn_borderless_material) {
                return createButtonColorStateList(context, 0);
            }
            if (i == R.drawable.abc_btn_colored_material) {
                return createButtonColorStateList(context, ThemeUtils.getThemeAttrColor(context, R.attr.colorAccent));
            }
            if (i == 2131230972 || i == R.drawable.abc_spinner_textfield_background_material) {
                return Strings.getColorStateList(context, R.color.abc_tint_spinner);
            }
            if (arrayContains(i, (int[]) this.zzb)) {
                return ThemeUtils.getThemeAttrColorStateList(context, R.attr.colorControlNormal);
            }
            if (arrayContains(i, (int[]) this.zzd)) {
                return Strings.getColorStateList(context, R.color.abc_tint_default);
            }
            if (arrayContains(i, (int[]) this.zzf)) {
                return Strings.getColorStateList(context, R.color.abc_tint_btn_checkable);
            }
            if (i == R.drawable.abc_seekbar_thumb_material) {
                return Strings.getColorStateList(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList themeAttrColorStateList = ThemeUtils.getThemeAttrColorStateList(context, R.attr.colorSwitchThumbNormal);
        if (themeAttrColorStateList == null || !themeAttrColorStateList.isStateful()) {
            iArr[0] = ThemeUtils.DISABLED_STATE_SET;
            iArr2[0] = ThemeUtils.getDisabledThemeAttrColor(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = ThemeUtils.CHECKED_STATE_SET;
            iArr2[1] = ThemeUtils.getThemeAttrColor(context, R.attr.colorControlActivated);
            iArr[2] = ThemeUtils.EMPTY_STATE_SET;
            iArr2[2] = ThemeUtils.getThemeAttrColor(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = ThemeUtils.DISABLED_STATE_SET;
            iArr[0] = iArr3;
            iArr2[0] = themeAttrColorStateList.getColorForState(iArr3, 0);
            iArr[1] = ThemeUtils.CHECKED_STATE_SET;
            iArr2[1] = ThemeUtils.getThemeAttrColor(context, R.attr.colorControlActivated);
            iArr[2] = ThemeUtils.EMPTY_STATE_SET;
            iArr2[2] = themeAttrColorStateList.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public void log(int i, InternalLogger.Target target, Function0 function0, Throwable th, boolean z, Map map) {
        SdkFeature feature;
        CameraSelector$$ExternalSyntheticOutline0.checkNotZero(i);
        target.getClass();
        function0.getClass();
        int ordinal = target.ordinal();
        if (ordinal == 0) {
            sendToLogHandler((Lock) this.zzb, i, function0, th, z, (LinkedHashSet) this.zze);
            return;
        }
        if (ordinal == 1) {
            Lock lock = (Lock) this.zzc;
            if (lock != null) {
                sendToLogHandler(lock, i, function0, th, z, (LinkedHashSet) this.zzd);
                return;
            }
            return;
        }
        if (ordinal != 2) {
            return;
        }
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.zzf;
        InternalSdkCore internalSdkCore = (InternalSdkCore) this.zza;
        if (internalSdkCore == null || (feature = internalSdkCore.getFeature("rum")) == null) {
            return;
        }
        String str = (String) function0.invoke();
        if (z) {
            if (linkedHashSet.contains(str)) {
                return;
            } else {
                linkedHashSet.add(str);
            }
        }
        feature.sendEvent((i == 5 || i == 4 || th != null) ? new InternalTelemetryEvent.Log.Error(str, th, map) : new InternalTelemetryEvent.Log.Debug(str, map));
    }

    public void logMetric(Function0 function0, Map map, float f, Float f2) {
        SdkFeature feature;
        map.getClass();
        InternalSdkCore internalSdkCore = (InternalSdkCore) this.zza;
        DatadogCore datadogCore = internalSdkCore instanceof DatadogCore ? (DatadogCore) internalSdkCore : null;
        if (datadogCore != null) {
            datadogCore.getCoreFeature$dd_sdk_android_core_release();
        }
        if (!new AndroidSvg(f).sample(Unit.INSTANCE) || internalSdkCore == null || (feature = internalSdkCore.getFeature("rum")) == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        com.google.android.gms.internal.mlkit_vision_common.zzhs.enrichWithNonNullAttribute(linkedHashMap, 1, f2);
        com.google.android.gms.internal.mlkit_vision_common.zzhs.enrichWithNonNullAttribute(linkedHashMap, 2, Float.valueOf(f));
        feature.sendEvent(new InternalTelemetryEvent.Metric((String) function0.invoke(), linkedHashMap));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.squareup.cash.clientrouting.ClientRouteRouter
    public boolean route(ClientRoute clientRoute, RoutingParams routingParams) {
        boolean z;
        clientRoute.getClass();
        routingParams.getClass();
        Screen origin = routingParams.getOrigin();
        String simpleName = origin != null ? origin.getClass().getSimpleName() : null;
        int i = 0;
        int i2 = 1;
        boolean z2 = routingParams.getDeepLinkMetadata() != null;
        KeysetHandle keysetHandle = (KeysetHandle) this.zza;
        List list = (List) keysetHandle.entries;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Validator) it.next()).validate(clientRoute, routingParams));
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ValidatorResult validatorResult = (ValidatorResult) it2.next();
                if (validatorResult instanceof ValidatorResult.NotAllowed) {
                    ValidatorResult.NotAllowed notAllowed = (ValidatorResult.NotAllowed) validatorResult;
                    Timber.Forest.i("Route " + clientRoute + " not allowed for reason: " + notAllowed.getReason(), new Object[i]);
                    Analytics analytics = (Analytics) keysetHandle.annotationsMap;
                    Screen origin2 = routingParams.getOrigin();
                    z = i;
                    analytics.track(new ClientRouteInteractFailCheck(origin2 != null ? origin2.getClass().getSimpleName() : null, Boolean.valueOf(routingParams.getDeepLinkMetadata() != null ? 1 : i), clientRoute.getSpec().getName(), clientRoute.getSpec().getPathFormat(), CollectionsKt.joinToString$default(clientRoute.getLoggableParameters().entrySet(), null, null, null, 0, null, new SyncRangeQueries$$ExternalSyntheticLambda1(i2), 31), ValidationUtilsKt.toCdfReason(notAllowed.getReason())), null);
                } else {
                    z = i;
                }
                if (!Intrinsics.areEqual(validatorResult, ValidatorResult.Allowed.INSTANCE)) {
                    return z;
                }
                i = z;
            }
        }
        Analytics analytics2 = (Analytics) this.zzc;
        Boolean valueOf = Boolean.valueOf(z2);
        String name = clientRoute.getSpec().getName();
        String pathFormat = clientRoute.getSpec().getPathFormat();
        String formatForLogging = zzjr.formatForLogging((RealClientRouteFormatter) this.zzb, clientRoute);
        analytics2.track(new ClientRouteInteractRoute(valueOf, simpleName, name, pathFormat, formatForLogging != null ? TransactorKt.redactUrl(formatForLogging) : null), null);
        JobKt.launch$default((ContextScope) this.zzf, null, null, new RealClientRouteRouter$route$1(this, clientRoute, routingParams, null), 3);
        return true;
    }

    public void sendToLogHandler(Lock lock, int i, Function0 function0, Throwable th, boolean z, LinkedHashSet linkedHashSet) {
        int logLevel = toLogLevel(i);
        lock.getClass();
        if (logLevel >= Datadog.libraryVerbosity) {
            String str = (String) function0.invoke();
            InternalSdkCore internalSdkCore = (InternalSdkCore) this.zza;
            String name = internalSdkCore != null ? internalSdkCore.getName() : null;
            if (name != null) {
                str = CameraSelector$$ExternalSyntheticOutline0.m("[", name, "]: ", str);
            }
            if (z) {
                if (linkedHashSet.contains(str)) {
                    return;
                } else {
                    linkedHashSet.add(str);
                }
            }
            int logLevel2 = toLogLevel(i);
            str.getClass();
            if (logLevel2 >= Datadog.libraryVerbosity) {
                Log.println(logLevel2, "Datadog", str);
                if (th != null) {
                    Log.println(logLevel2, "Datadog", Log.getStackTraceString(th));
                }
            }
        }
    }

    public void setAesKeySizeBytes(int i) {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.zza = Integer.valueOf(i);
    }

    public void setDemParameters(Parameters parameters) {
        if (EciesParameters.acceptedDemParameters.contains(parameters)) {
            this.zze = parameters;
        } else {
            XAesGcmKey$$ExternalSyntheticBUOutline0.m("Invalid DEM parameters ", parameters, "; only AES128_GCM_RAW, AES256_GCM_RAW, AES128_CTR_HMAC_SHA256_RAW, AES256_CTR_HMAC_SHA256_RAW XCHACHA20_POLY1305_RAW and AES256_SIV_RAW are currently supported.");
        }
    }

    public void setHmacKeySizeBytes(int i) {
        if (i < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(i)));
        }
        this.zzb = Integer.valueOf(i);
    }

    public void setIvSizeBytes(int i) {
        if (i < 12 || i > 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", Integer.valueOf(i)));
        }
        this.zzc = Integer.valueOf(i);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public Set setOf(Qualified qualified) {
        if (((Set) this.zzc).contains(qualified)) {
            return ((ComponentContainer) this.zzf).setOf(qualified);
        }
        OptionalProvider$$ExternalSyntheticLambda0.m("Attempting to request an undeclared dependency Set<", qualified, ">.");
        return null;
    }

    @Override // com.google.firebase.components.ComponentContainer
    public Provider setOfProvider(Qualified qualified) {
        if (((Set) this.zze).contains(qualified)) {
            return ((ComponentContainer) this.zzf).setOfProvider(qualified);
        }
        OptionalProvider$$ExternalSyntheticLambda0.m("Attempting to request an undeclared dependency Provider<Set<", qualified, ">>.");
        return null;
    }

    public void setTagSizeBytes(int i) {
        if (i < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i)));
        }
        this.zze = Integer.valueOf(i);
    }

    public void zzb(String str) {
        zzky.zza(zzsa.zzc.matcher(str).matches(), "Module must match [a-z]+(_[a-z]+)*: %s", str);
        zzky.zza(!zzsa.zzd.contains(str), "Module name is reserved and cannot be used: %s", str);
        this.zzc = str;
    }

    public void zzc(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        Pattern pattern = zzsa.zzc;
        this.zzd = str;
    }

    public Uri zzd() {
        String m;
        String str = (String) this.zzb;
        String str2 = (String) this.zzc;
        Account account = zzrv.zza;
        Account account2 = (Account) this.zze;
        zzky.zza(account2.type.indexOf(58) == -1, "Account type contains ':'.", new Object[0]);
        zzky.zza(account2.type.indexOf(47) == -1, "Account type contains '/'.", new Object[0]);
        zzky.zza(account2.name.indexOf(47) == -1, "Account name contains '/'.", new Object[0]);
        if (zzrv.zza.equals(account2)) {
            m = "shared";
        } else {
            String str3 = account2.type;
            String str4 = account2.name;
            m = Recorder$$ExternalSyntheticOutline2.m(new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length()), str3, ":", str4);
        }
        String str5 = (String) this.zzd;
        StringBuilder sb = new StringBuilder(Boxes$$ExternalSyntheticOutline1.m(Boxes$$ExternalSyntheticOutline1.m(str.length() + 2, 1, str2), 1, m) + String.valueOf(str5).length());
        Boxes$$ExternalSyntheticOutline1.m(sb, "/", str, "/", str2);
        String m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, "/", m, "/", str5);
        RegularImmutableList build = ((ImmutableList.Builder) this.zzf).build();
        Pattern pattern = zzsp.zza;
        return new Uri.Builder().scheme("android").authority((String) this.zza).path(m2).encodedFragment(build.isEmpty() ? null : "transform=".concat(Joiner.on().join(build))).build();
    }

    @Override // com.google.firebase.components.ComponentContainer
    public Provider getProvider(Class cls) {
        return getProvider(Qualified.unqualified(cls));
    }

    public /* synthetic */ zzlj(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = obj3;
        this.zze = obj4;
        this.zzd = obj5;
        this.zzf = obj6;
    }

    public zzlj(InternalSdkCore internalSdkCore) {
        this.zza = internalSdkCore;
        this.zzb = (Lock) SdkInternalLogger$1.INSTANCE.invoke();
        this.zzc = null;
        this.zze = new LinkedHashSet();
        this.zzd = new LinkedHashSet();
        this.zzf = new LinkedHashSet();
    }

    @Override // com.google.firebase.components.ComponentContainer
    public Object get(Qualified qualified) {
        if (((Set) this.zza).contains(qualified)) {
            return ((ComponentContainer) this.zzf).get(qualified);
        }
        OptionalProvider$$ExternalSyntheticLambda0.m("Attempting to request an undeclared dependency ", qualified, ".");
        return null;
    }

    public void log(int i, List list, Function0 function0, Throwable th, boolean z, Map map) {
        CameraSelector$$ExternalSyntheticOutline0.checkNotZero(i);
        list.getClass();
        function0.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            log(i, (InternalLogger.Target) it.next(), function0, th, z, map);
        }
    }

    /* renamed from: build, reason: collision with other method in class */
    public EciesParameters m2008build() {
        EciesParameters.CurveType curveType = (EciesParameters.CurveType) this.zza;
        if (curveType != null) {
            if (((EciesParameters.HashType) this.zzb) != null) {
                if (((Parameters) this.zze) != null) {
                    if (((EciesParameters.Variant) this.zzd) != null) {
                        EciesParameters.CurveType curveType2 = EciesParameters.CurveType.X25519;
                        if (curveType != curveType2 && ((EciesParameters.PointFormat) this.zzc) == null) {
                            a$$ExternalSyntheticBUOutline0.m$6("Point format is not set");
                            return null;
                        }
                        if (curveType == curveType2 && ((EciesParameters.PointFormat) this.zzc) != null) {
                            a$$ExternalSyntheticBUOutline0.m$6("For Curve25519 point format must not be set");
                            return null;
                        }
                        return new EciesParameters((EciesParameters.CurveType) this.zza, (EciesParameters.HashType) this.zzb, (EciesParameters.PointFormat) this.zzc, (Parameters) this.zze, (EciesParameters.Variant) this.zzd, (Bytes) this.zzf);
                    }
                    a$$ExternalSyntheticBUOutline0.m$6("Variant is not set");
                    return null;
                }
                a$$ExternalSyntheticBUOutline0.m$6("DEM parameters are not set");
                return null;
            }
            a$$ExternalSyntheticBUOutline0.m$6("Hash type is not set");
            return null;
        }
        a$$ExternalSyntheticBUOutline0.m$6("Elliptic curve type is not set");
        return null;
    }
}
