package androidx.core.graphics;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.recipients.data.Recipient;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public abstract class TypefaceCompatUtil {
    public static final Icons badgeIcon(Recipient recipient, boolean z) {
        recipient.getClass();
        if (z) {
            return Icons.Block24;
        }
        if (recipient.isSponsorAllowlisted) {
            return Icons.SecurityCheckFill24;
        }
        if (recipient.isFavorited) {
            return Icons.FavoriteFill24;
        }
        return null;
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.DeprecatedViewOffersSheet.deepLinkSpecs;
    }

    public static MappedByteBuffer mmap(Context context, Uri uri) {
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
