package com.braze.configuration;

import android.content.Context;
import android.content.res.Resources;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import bo.app.h3;
import bo.app.i3;
import bo.app.ld$$ExternalSyntheticLambda5;
import bo.app.n$$ExternalSyntheticLambda1;
import com.braze.BrazeUser$$ExternalSyntheticLambda9;
import com.braze.support.BrazeLogger;
import com.braze.support.PackageUtils;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\"\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010%\n\u0002\b\t\b\u0017\u0018\u0000 <2\u00020\u0001:\u0002\f=B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000f\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0013\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0013\u001a\u00020\nH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ-\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u001d2\u0006\u0010\u0013\u001a\u00020\n2\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010 \u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u000eH\u0004¢\u0006\u0004\b \u0010\u001aJ+\u0010\"\u001a\u0004\u0018\u00010\u00012\u0006\u0010!\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0004¢\u0006\u0004\b\"\u0010#J+\u0010$\u001a\u0004\u0018\u00010\u00012\u0006\u0010!\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0004¢\u0006\u0004\b$\u0010#J+\u0010%\u001a\u0004\u0018\u00010\u00012\u0006\u0010!\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b%\u0010#J+\u0010&\u001a\u0004\u0018\u00010\u00012\u0006\u0010!\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b&\u0010#J\u001f\u0010(\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\f2\u0006\u0010'\u001a\u00020\u000eH\u0007¢\u0006\u0004\b(\u0010)J\u000f\u0010-\u001a\u00020*H\u0000¢\u0006\u0004\b+\u0010,R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010.R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010/R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R%\u00106\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001058\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0014\u0010:\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006>"}, d2 = {"Lcom/braze/configuration/CachedConfigurationProvider;", "", "Landroid/content/Context;", "context", "", "shouldUseConfigurationCache", "Lcom/braze/configuration/RuntimeAppConfigurationProvider;", "runtimeAppConfigurationProvider", "<init>", "(Landroid/content/Context;ZLcom/braze/configuration/RuntimeAppConfigurationProvider;)V", "", "key", "Lbo/app/i3;", "resourceType", "", "getResourceIdentifier", "(Ljava/lang/String;Lbo/app/i3;)I", "getFallbackConfigKey", "(Ljava/lang/String;)Ljava/lang/String;", "primaryKey", "defaultValue", "getBooleanValue", "(Ljava/lang/String;Z)Z", "getStringValue", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "getIntValue", "(Ljava/lang/String;I)I", "getColorValue", "(Ljava/lang/String;)Ljava/lang/Integer;", "", "getStringSetValue", "(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;", "getDrawableValue", "type", "getRuntimeConfigurationValue", "(Lbo/app/i3;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "getResourceConfigurationValue", "getConfigurationValue", "readResourceValue", "resourceId", "getValueFromResources", "(Lbo/app/i3;I)Ljava/lang/Object;", "", "resetCache$android_sdk_base_release", "()V", "resetCache", "Landroid/content/Context;", "Z", "Lcom/braze/configuration/RuntimeAppConfigurationProvider;", "getRuntimeAppConfigurationProvider", "()Lcom/braze/configuration/RuntimeAppConfigurationProvider;", "setRuntimeAppConfigurationProvider", "(Lcom/braze/configuration/RuntimeAppConfigurationProvider;)V", "", "configurationCache", "Ljava/util/Map;", "getConfigurationCache", "()Ljava/util/Map;", "resourcePackageName", "Ljava/lang/String;", "Companion", "bo/app/h3", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class CachedConfigurationProvider {
    public static final h3 Companion = new h3();
    private final Map<String, Object> configurationCache;
    private Context context;
    private final String resourcePackageName;
    private RuntimeAppConfigurationProvider runtimeAppConfigurationProvider;
    private boolean shouldUseConfigurationCache;

    public CachedConfigurationProvider(Context context, boolean z, RuntimeAppConfigurationProvider runtimeAppConfigurationProvider) {
        context.getClass();
        runtimeAppConfigurationProvider.getClass();
        this.context = context;
        this.shouldUseConfigurationCache = z;
        this.runtimeAppConfigurationProvider = runtimeAppConfigurationProvider;
        Map<String, Object> synchronizedMap = Collections.synchronizedMap(new HashMap());
        synchronizedMap.getClass();
        this.configurationCache = synchronizedMap;
        this.resourcePackageName = PackageUtils.getResourcePackageName(this.context);
    }

    private final String getFallbackConfigKey(String key) {
        if (StringsKt.contains((CharSequence) key, (CharSequence) "braze", false)) {
            return StringsKt__StringsJVMKt.replace$default(key, "braze", "appboy");
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getResourceConfigurationValue$lambda$0(String str, Object obj) {
        return "Using resources value for key: '" + str + "' and value: '" + obj + "'";
    }

    private final int getResourceIdentifier(String key, i3 resourceType) {
        if (key == null) {
            return 0;
        }
        return this.context.getResources().getIdentifier(key, resourceType.a, this.resourcePackageName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getRuntimeConfigurationValue$lambda$0(String str, Object obj) {
        return "Using runtime override value for key: '" + str + "' and value: '" + obj + "'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String readResourceValue$lambda$0(String str, Object obj) {
        return "Primary key '" + str + "' had no identifier. No secondary key to read resource value. Returning default value: '" + obj + "'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String readResourceValue$lambda$1() {
        return "Caught exception retrieving resource value";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String readResourceValue$lambda$2(i3 i3Var, String str, Object obj) {
        StringBuilder sb = new StringBuilder("Unable to find the xml ");
        sb.append(i3Var);
        sb.append(" configuration value with primary key '");
        sb.append(str);
        sb.append("'. Using default value '");
        return Recorder$$ExternalSyntheticOutline1.m(sb, obj, "'.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String resetCache$lambda$0() {
        return "Resetting cached configuration";
    }

    public final boolean getBooleanValue(String primaryKey, boolean defaultValue) {
        primaryKey.getClass();
        Object configurationValue = getConfigurationValue(i3.BOOLEAN, primaryKey, Boolean.valueOf(defaultValue));
        configurationValue.getClass();
        return ((Boolean) configurationValue).booleanValue();
    }

    public final Integer getColorValue(String primaryKey) {
        primaryKey.getClass();
        return (Integer) getConfigurationValue(i3.COLOR, primaryKey, null);
    }

    public final Map<String, Object> getConfigurationCache() {
        return this.configurationCache;
    }

    public final Object getConfigurationValue(i3 type2, String key, Object defaultValue) {
        type2.getClass();
        key.getClass();
        return (this.shouldUseConfigurationCache && this.configurationCache.containsKey(key)) ? this.configurationCache.get(key) : this.runtimeAppConfigurationProvider.containsKey(key) ? getRuntimeConfigurationValue(type2, key, defaultValue) : getResourceConfigurationValue(type2, key, defaultValue);
    }

    public final int getDrawableValue(String primaryKey, int defaultValue) {
        primaryKey.getClass();
        Object configurationValue = getConfigurationValue(i3.DRAWABLE_IDENTIFIER, primaryKey, Integer.valueOf(defaultValue));
        configurationValue.getClass();
        return ((Integer) configurationValue).intValue();
    }

    public final int getIntValue(String primaryKey, int defaultValue) {
        primaryKey.getClass();
        Object configurationValue = getConfigurationValue(i3.INTEGER, primaryKey, Integer.valueOf(defaultValue));
        configurationValue.getClass();
        return ((Integer) configurationValue).intValue();
    }

    public final Object getResourceConfigurationValue(i3 type2, String key, Object defaultValue) {
        type2.getClass();
        key.getClass();
        Object readResourceValue = readResourceValue(type2, key, defaultValue);
        this.configurationCache.put(key, readResourceValue);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new ld$$ExternalSyntheticLambda5(key, 6, readResourceValue), 7, (Object) null);
        return readResourceValue;
    }

    public final RuntimeAppConfigurationProvider getRuntimeAppConfigurationProvider() {
        return this.runtimeAppConfigurationProvider;
    }

    public final Object getRuntimeConfigurationValue(i3 type2, String key, Object defaultValue) {
        Object valueOf;
        type2.getClass();
        key.getClass();
        int ordinal = type2.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            RuntimeAppConfigurationProvider runtimeAppConfigurationProvider = this.runtimeAppConfigurationProvider;
            valueOf = Integer.valueOf(defaultValue == null ? runtimeAppConfigurationProvider.getIntValue(key, 0) : runtimeAppConfigurationProvider.getIntValue(key, ((Integer) defaultValue).intValue()));
        } else if (ordinal == 2) {
            RuntimeAppConfigurationProvider runtimeAppConfigurationProvider2 = this.runtimeAppConfigurationProvider;
            defaultValue.getClass();
            valueOf = Boolean.valueOf(runtimeAppConfigurationProvider2.getBooleanValue(key, ((Boolean) defaultValue).booleanValue()));
        } else if (ordinal == 3) {
            valueOf = this.runtimeAppConfigurationProvider.getStringValue(key, (String) defaultValue);
        } else if (ordinal == 4) {
            valueOf = Integer.valueOf(getResourceIdentifier(this.runtimeAppConfigurationProvider.getStringValue(key, ""), i3.DRAWABLE_IDENTIFIER));
        } else {
            if (ordinal != 5) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            valueOf = this.runtimeAppConfigurationProvider.getStringSetValue(key);
        }
        this.configurationCache.put(key, valueOf);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new ld$$ExternalSyntheticLambda5(key, 7, valueOf), 7, (Object) null);
        return valueOf;
    }

    public final Set<String> getStringSetValue(String primaryKey, Set<String> defaultValue) {
        primaryKey.getClass();
        Object configurationValue = getConfigurationValue(i3.STRING_ARRAY, primaryKey, defaultValue);
        return configurationValue == null ? defaultValue : (Set) configurationValue;
    }

    public final String getStringValue(String primaryKey, String defaultValue) {
        primaryKey.getClass();
        return (String) getConfigurationValue(i3.STRING, primaryKey, defaultValue);
    }

    public final Object getValueFromResources(i3 type2, int resourceId) {
        type2.getClass();
        Resources resources = this.context.getResources();
        int ordinal = type2.ordinal();
        if (ordinal == 0) {
            return Integer.valueOf(resources.getInteger(resourceId));
        }
        if (ordinal == 1) {
            return Integer.valueOf(resources.getColor(resourceId));
        }
        if (ordinal == 2) {
            return Boolean.valueOf(resources.getBoolean(resourceId));
        }
        if (ordinal == 3) {
            String string2 = resources.getString(resourceId);
            string2.getClass();
            return string2;
        }
        if (ordinal == 4) {
            return Integer.valueOf(resourceId);
        }
        if (ordinal != 5) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        String[] stringArray = resources.getStringArray(resourceId);
        stringArray.getClass();
        return new HashSet(CollectionsKt__CollectionsKt.listOf(Arrays.copyOf(stringArray, stringArray.length)));
    }

    public final Object readResourceValue(i3 type2, String key, Object defaultValue) {
        int resourceIdentifier;
        type2.getClass();
        key.getClass();
        try {
            resourceIdentifier = getResourceIdentifier(key, type2);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new BrazeUser$$ExternalSyntheticLambda9(17), 4, (Object) null);
        }
        if (resourceIdentifier != 0) {
            return getValueFromResources(type2, resourceIdentifier);
        }
        String fallbackConfigKey = getFallbackConfigKey(key);
        if (fallbackConfigKey == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new ld$$ExternalSyntheticLambda5(key, 8, defaultValue), 7, (Object) null);
            return defaultValue;
        }
        int resourceIdentifier2 = getResourceIdentifier(fallbackConfigKey, type2);
        if (resourceIdentifier2 != 0) {
            return getValueFromResources(type2, resourceIdentifier2);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new n$$ExternalSyntheticLambda1(25, type2, key, defaultValue), 7, (Object) null);
        return defaultValue;
    }

    public final void resetCache$android_sdk_base_release() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeUser$$ExternalSyntheticLambda9(18), 7, (Object) null);
        this.configurationCache.clear();
    }

    public /* synthetic */ CachedConfigurationProvider(Context context, boolean z, RuntimeAppConfigurationProvider runtimeAppConfigurationProvider, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? true : z, (i & 4) != 0 ? new RuntimeAppConfigurationProvider(context) : runtimeAppConfigurationProvider);
    }
}
