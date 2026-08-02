package androidx.media3.extractor;

import androidx.camera.core.internal.compat.quirk.DeviceQuirks;
import androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk;
import com.datadog.trace.api.Config;
import com.datadog.trace.api.naming.NamingSchema;
import com.google.android.gms.internal.measurement.zzacv;
import com.google.android.gms.internal.measurement.zzlf;
import com.google.android.gms.internal.measurement.zznd;
import com.google.android.gms.internal.measurement.zzrt;
import com.google.android.gms.internal.measurement.zzsf;
import com.google.android.gms.internal.measurement.zzzm;
import java.io.InputStream;
import java.util.Collection;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.DFS;
import okio.Utf8;

/* loaded from: classes3.dex */
public final class VorbisUtil$Mode implements NamingSchema, zzrt, DFS.Neighbors {
    public boolean blockFlag;

    public VorbisUtil$Mode(int i) {
        switch (i) {
            case 5:
                Config config = Config.INSTANCE;
                this.blockFlag = true ^ config.removeIntegrationServiceNamesEnabled;
                if (config.peerServiceDefaultsEnabled) {
                    break;
                }
                break;
            default:
                this.blockFlag = DeviceQuirks.sQuirks.get(SurfaceOrderQuirk.class) != null;
                break;
        }
    }

    @Override // com.datadog.trace.api.naming.NamingSchema
    public boolean allowInferredServices() {
        return this.blockFlag;
    }

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    public Iterable getNeighbors(Object obj) {
        Collection<? extends CallableMemberDescriptor> overriddenDescriptors;
        boolean z = this.blockFlag;
        CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) obj;
        int i = DescriptorUtilsKt.$r8$clinit;
        if (z) {
            callableMemberDescriptor = callableMemberDescriptor != null ? callableMemberDescriptor.getOriginal() : null;
        }
        return (callableMemberDescriptor == null || (overriddenDescriptors = callableMemberDescriptor.getOverriddenDescriptors()) == null) ? EmptyList.INSTANCE : overriddenDescriptors;
    }

    public boolean reportViewed(Function0 function0) {
        function0.getClass();
        if (this.blockFlag) {
            return false;
        }
        function0.invoke();
        this.blockFlag = true;
        return true;
    }

    public void setStayAwake(boolean z) {
        if (this.blockFlag == z) {
            return;
        }
        this.blockFlag = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzrt
    public /* bridge */ /* synthetic */ Object zza(zzzm zzzmVar) {
        zznd zzb;
        InputStream zzc = zzlf.zzc(zzzmVar);
        try {
            int i = 4096;
            if (this.blockFlag) {
                if (zzc instanceof zzsf) {
                    long length = ((zzsf) zzc).zza().length();
                    if (length == 0) {
                        i = 512;
                    } else if (length < 4096) {
                        i = (int) length;
                    }
                }
                zzb = zznd.zzb(zzacv.zzM(zzc, i), true);
            } else {
                zzb = zznd.zzb(zzacv.zzM(zzc, 4096), false);
            }
            Utf8.closeFinally(zzc, null);
            return zzb;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                Utf8.closeFinally(zzc, th);
                throw th2;
            }
        }
    }

    public /* synthetic */ VorbisUtil$Mode(boolean z, boolean z2) {
        this.blockFlag = z;
    }
}
