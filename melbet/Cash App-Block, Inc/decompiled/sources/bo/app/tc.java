package bo.app;

import android.content.Context;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class tc implements p9 {
    public final BrazeConfigurationProvider a;
    public final uc b;

    public tc(Context context, BrazeConfigurationProvider brazeConfigurationProvider) {
        context.getClass();
        brazeConfigurationProvider.getClass();
        this.a = brazeConfigurationProvider;
        this.b = new uc(context);
    }

    public final synchronized void a(String str) {
        if (str == null) {
            throw new NullPointerException("Provided push token is null. Cannot set null push token.");
        }
        this.b.writeData(DataStoreKey.PUSH_REGISTRATION_ID_KEY, str);
        this.b.writeData(DataStoreKey.PUSH_REGISTRATION_VERSION_CODE, Integer.valueOf(this.a.getVersionCode()));
        this.b.writeData(DataStoreKey.PUSH_REGISTRATION_PERSISTENT_DEVICE_ID, String.valueOf(722989291));
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0039, code lost:
    
        if (r0 != r2.intValue()) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x005b A[Catch: all -> 0x0013, TryCatch #0 {all -> 0x0013, blocks: (B:3:0x0001, B:5:0x000a, B:8:0x0051, B:10:0x005b, B:12:0x0070, B:16:0x0085, B:19:0x0016, B:21:0x0020, B:24:0x003b, B:27:0x0035), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized String b() {
        uc ucVar;
        DataStoreKey dataStoreKey;
        try {
            if (!this.a.isFirebaseCloudMessagingRegistrationEnabled()) {
                if (this.a.isAdmMessagingRegistrationEnabled()) {
                }
                ucVar = this.b;
                dataStoreKey = DataStoreKey.PUSH_REGISTRATION_PERSISTENT_DEVICE_ID;
                if (ucVar.contains(dataStoreKey)) {
                    if (!Intrinsics.areEqual(String.valueOf(722989291), this.b.readString(dataStoreKey, ""))) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new w$$ExternalSyntheticLambda0(9), 6, (Object) null);
                        return null;
                    }
                }
                return this.b.readString(DataStoreKey.PUSH_REGISTRATION_ID_KEY, null);
            }
            uc ucVar2 = this.b;
            DataStoreKey dataStoreKey2 = DataStoreKey.PUSH_REGISTRATION_VERSION_CODE;
            if (ucVar2.contains(dataStoreKey2)) {
                int versionCode = this.a.getVersionCode();
                Integer readInt = this.b.readInt(dataStoreKey2, Integer.valueOf(PKIFailureInfo.systemUnavail));
                if (readInt != null) {
                }
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new q2$$ExternalSyntheticLambda8(readInt, versionCode, 4), 6, (Object) null);
                return null;
            }
            ucVar = this.b;
            dataStoreKey = DataStoreKey.PUSH_REGISTRATION_PERSISTENT_DEVICE_ID;
            if (ucVar.contains(dataStoreKey)) {
            }
            return this.b.readString(DataStoreKey.PUSH_REGISTRATION_ID_KEY, null);
        } catch (Throwable th) {
            throw th;
        }
    }

    public static final String a() {
        return "Device identifier differs from saved device identifier. Returning null token.";
    }

    public static final String a(Integer num, int i) {
        return "Stored push registration ID version code " + num + " does not match live version code " + i + ". Not returning saved registration ID.";
    }
}
