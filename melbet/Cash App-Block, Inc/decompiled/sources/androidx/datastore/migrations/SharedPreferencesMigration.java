package androidx.datastore.migrations;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.paging.CachedPagingDataKt$cachedIn$4;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.datadog.android.Datadog$getInstance$1$1;
import com.squareup.cash.ui.gcm.RealGcmRegistrar$unregister$2;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class SharedPreferencesMigration {
    public final Context context;
    public final LinkedHashSet keySet;
    public final Function3 migrate;
    public final String name;
    public final Lazy sharedPrefs$delegate;
    public final Function2 shouldRunMigration;

    /* loaded from: classes3.dex */
    public abstract class Api24Impl {
        public static final boolean deleteSharedPreferences(Context context, String str) {
            context.getClass();
            str.getClass();
            return context.deleteSharedPreferences(str);
        }
    }

    public SharedPreferencesMigration(Context context, String str, Set set, Function2 function2, Function3 function3) {
        context.getClass();
        set.getClass();
        function2.getClass();
        Datadog$getInstance$1$1 datadog$getInstance$1$1 = new Datadog$getInstance$1$1(context, str);
        this.shouldRunMigration = function2;
        this.migrate = function3;
        this.context = context;
        this.name = str;
        this.sharedPrefs$delegate = LazyKt.lazy(datadog$getInstance$1$1);
        this.keySet = set == SharedPreferencesMigration_androidKt.MIGRATE_ALL_KEYS ? null : CollectionsKt.toMutableSet(set);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        if (r4.isEmpty() == false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object shouldMigrate(Object obj, ContinuationImpl continuationImpl) {
        SharedPreferencesMigration$shouldMigrate$1 sharedPreferencesMigration$shouldMigrate$1;
        Object obj2;
        int i;
        if (continuationImpl instanceof SharedPreferencesMigration$shouldMigrate$1) {
            sharedPreferencesMigration$shouldMigrate$1 = (SharedPreferencesMigration$shouldMigrate$1) continuationImpl;
            int i2 = sharedPreferencesMigration$shouldMigrate$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                sharedPreferencesMigration$shouldMigrate$1.label = i2 - PKIFailureInfo.systemUnavail;
                obj2 = sharedPreferencesMigration$shouldMigrate$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sharedPreferencesMigration$shouldMigrate$1.label;
                boolean z = true;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    sharedPreferencesMigration$shouldMigrate$1.L$0 = this;
                    sharedPreferencesMigration$shouldMigrate$1.label = 1;
                    obj2 = this.shouldRunMigration.invoke(obj, sharedPreferencesMigration$shouldMigrate$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = sharedPreferencesMigration$shouldMigrate$1.L$0;
                    SafeTrace.throwOnFailure(obj2);
                }
                if (((Boolean) obj2).booleanValue()) {
                    return Boolean.FALSE;
                }
                LinkedHashSet linkedHashSet = this.keySet;
                Lazy lazy = this.sharedPrefs$delegate;
                if (linkedHashSet != null) {
                    SharedPreferences sharedPreferences = (SharedPreferences) lazy.getValue();
                    if (!linkedHashSet.isEmpty()) {
                        Iterator it = linkedHashSet.iterator();
                        while (it.hasNext()) {
                            if (sharedPreferences.contains((String) it.next())) {
                                break;
                            }
                        }
                    }
                    z = false;
                    return Boolean.valueOf(z);
                }
                Map<String, ?> all = ((SharedPreferences) lazy.getValue()).getAll();
                all.getClass();
            }
        }
        sharedPreferencesMigration$shouldMigrate$1 = new SharedPreferencesMigration$shouldMigrate$1(this, continuationImpl);
        obj2 = sharedPreferencesMigration$shouldMigrate$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sharedPreferencesMigration$shouldMigrate$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
        if (((Boolean) obj2).booleanValue()) {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SharedPreferencesMigration(Context context, String str, RealGcmRegistrar$unregister$2 realGcmRegistrar$unregister$2, Function3 function3, int i) {
        this(context, str, r5, r6, r7);
        Function3 function32;
        Function2 function2;
        LinkedHashSet linkedHashSet = SharedPreferencesMigration_androidKt.MIGRATE_ALL_KEYS;
        if ((i & 8) != 0) {
            function32 = function3;
            function2 = new CachedPagingDataKt$cachedIn$4(4);
        } else {
            function32 = function3;
            function2 = realGcmRegistrar$unregister$2;
        }
    }
}
