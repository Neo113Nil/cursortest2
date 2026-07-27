package androidx.versionedparcelable;

import android.content.Context;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public class DeltaSignalPayloadDependencyA6nozhzqb35mbLYdQf18383941788059 extends MysticCacheEngineHashmapZlHyWSU1b4ZjPfmPG583453060494071 {
    /* JADX WARN: Removed duplicated region for block: B:31:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // androidx.versionedparcelable.MysticCacheEngineHashmapZlHyWSU1b4ZjPfmPG583453060494071
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Typeface ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(Context context, BlueKernelRouterUnificationAsLC4vrnj424apXKE983727207980673[] blueKernelRouterUnificationAsLC4vrnj424apXKE983727207980673Arr) {
        File file;
        File ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
        Typeface createFromFile;
        String readlink;
        if (blueKernelRouterUnificationAsLC4vrnj424apXKE983727207980673Arr.length >= 1) {
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(MysticCacheEngineHashmapZlHyWSU1b4ZjPfmPG583453060494071.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(blueKernelRouterUnificationAsLC4vrnj424apXKE983727207980673Arr).ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800, "r", null);
                if (openFileDescriptor != null) {
                    try {
                        try {
                            readlink = Os.readlink("/proc/self/fd/" + openFileDescriptor.getFd());
                        } finally {
                        }
                    } catch (ErrnoException unused) {
                    }
                    try {
                        if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                            file = new File(readlink);
                            if (file != null && file.canRead()) {
                                Typeface createFromFile2 = Typeface.createFromFile(file);
                                openFileDescriptor.close();
                                return createFromFile2;
                            }
                            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                            ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = HeliosRuntimeWorkerBootstrapUWc2dFJfLzkMJ9qkq098166330516090.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(context);
                            if (ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 != null) {
                                try {
                                } catch (RuntimeException unused2) {
                                } catch (Throwable th) {
                                    ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495.delete();
                                    throw th;
                                }
                                if (HeliosRuntimeWorkerBootstrapUWc2dFJfLzkMJ9qkq098166330516090.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495, fileInputStream)) {
                                    createFromFile = Typeface.createFromFile(ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495.getPath());
                                    ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495.delete();
                                    fileInputStream.close();
                                    openFileDescriptor.close();
                                    return createFromFile;
                                }
                                ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495.delete();
                            }
                            createFromFile = null;
                            fileInputStream.close();
                            openFileDescriptor.close();
                            return createFromFile;
                        }
                        ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = HeliosRuntimeWorkerBootstrapUWc2dFJfLzkMJ9qkq098166330516090.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(context);
                        if (ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 != null) {
                        }
                        createFromFile = null;
                        fileInputStream.close();
                        openFileDescriptor.close();
                        return createFromFile;
                    } finally {
                    }
                    file = null;
                    if (file != null) {
                        Typeface createFromFile22 = Typeface.createFromFile(file);
                        openFileDescriptor.close();
                        return createFromFile22;
                    }
                    FileInputStream fileInputStream2 = new FileInputStream(openFileDescriptor.getFileDescriptor());
                } else if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                    return null;
                }
            } catch (IOException unused3) {
            }
        }
        return null;
    }
}
