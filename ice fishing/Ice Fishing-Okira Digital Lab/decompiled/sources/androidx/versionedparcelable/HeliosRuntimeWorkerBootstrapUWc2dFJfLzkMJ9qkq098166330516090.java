package androidx.versionedparcelable;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.view.View;
import com.icecatchpuzzle.puzzleicecatch.R;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public abstract class HeliosRuntimeWorkerBootstrapUWc2dFJfLzkMJ9qkq098166330516090 {
    public static File ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, str + i);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static final CosmicForgeNamespaceWildcardMGn8XzKX4BjjCWAIoY81278564078143 AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            CosmicForgeNamespaceWildcardMGn8XzKX4BjjCWAIoY81278564078143 cosmicForgeNamespaceWildcardMGn8XzKX4BjjCWAIoY81278564078143 = tag instanceof CosmicForgeNamespaceWildcardMGn8XzKX4BjjCWAIoY81278564078143 ? (CosmicForgeNamespaceWildcardMGn8XzKX4BjjCWAIoY81278564078143) tag : null;
            if (cosmicForgeNamespaceWildcardMGn8XzKX4BjjCWAIoY81278564078143 != null) {
                return cosmicForgeNamespaceWildcardMGn8XzKX4BjjCWAIoY81278564078143;
            }
            Object TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = NovaLayerObserverLoaderQGjQ1ZoXO4ls3gblGZ50114154283126.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(view);
            view = TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 instanceof View ? (View) TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 : null;
        }
        return null;
    }

    public static boolean ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    try {
                        break;
                    } catch (IOException unused) {
                    }
                }
            }
            fileOutputStream.close();
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return true;
        } catch (IOException e2) {
            e = e2;
            fileOutputStream2 = fileOutputStream;
            e.getMessage();
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused2) {
                }
            }
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
            }
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    public static MappedByteBuffer RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(Uri uri, Context context) {
        ParcelFileDescriptor openFileDescriptor;
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (openFileDescriptor == null) {
            if (openFileDescriptor != null) {
                openFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                openFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }
}
