package coil3.decode;

import android.content.res.AssetFileDescriptor;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import coil3.decode.ImageSource;
import coil3.request.Options;
import com.squareup.cash.clientroutes.ClientRoute;
import java.util.List;
import okio.FileSystem;
import okio.Path;

/* loaded from: classes3.dex */
public abstract class StaticImageDecoderKt {
    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewInitiateBitcoinDepositReversal.deepLinkSpecs;
    }

    public static final ImageDecoder.Source toImageDecoderSourceOrNull(ImageSource imageSource, Options options, boolean z) {
        Path fileOrNull;
        if (imageSource.getFileSystem() == FileSystem.SYSTEM && (fileOrNull = imageSource.fileOrNull()) != null) {
            return ImageDecoder.createSource(fileOrNull.toFile());
        }
        ImageSource.Metadata metadata = imageSource.getMetadata();
        if (metadata instanceof AssetMetadata) {
            return ImageDecoder.createSource(options.context.getAssets(), ((AssetMetadata) metadata).filePath);
        }
        if (metadata instanceof ContentMetadata) {
            try {
                AssetFileDescriptor assetFileDescriptor = ((ContentMetadata) metadata).assetFileDescriptor;
                Os.lseek(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), OsConstants.SEEK_SET);
                return ImageDecoder.createSource(new StaticImageDecoderKt$$ExternalSyntheticLambda0(assetFileDescriptor, 0));
            } catch (ErrnoException unused) {
                return null;
            }
        }
        if (metadata instanceof ResourceMetadata) {
            ResourceMetadata resourceMetadata = (ResourceMetadata) metadata;
            if (resourceMetadata.packageName.equals(options.context.getPackageName())) {
                return ImageDecoder.createSource(options.context.getResources(), resourceMetadata.resId);
            }
        }
        if (!(metadata instanceof ByteBufferMetadata)) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 30 || !z || ((ByteBufferMetadata) metadata).byteBuffer.isDirect()) {
            return ImageDecoder.createSource(((ByteBufferMetadata) metadata).byteBuffer);
        }
        return null;
    }
}
