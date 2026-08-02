package coil3.map;

import android.content.res.Resources;
import android.net.Uri;
import coil3.UriKt;
import coil3.Uri_androidKt;
import coil3.request.Options;
import com.squareup.protos.cash.ui.Image;
import java.io.File;
import okhttp3.HttpUrl;
import okio.Path;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public final class FileMapper {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ FileMapper(int i) {
        this.$r8$classId = i;
    }

    public final Object map(Object obj, Options options) {
        switch (this.$r8$classId) {
            case 0:
                return UriKt.Uri$default(((File) obj).getPath());
            case 1:
                return Uri_androidKt.toCoilUri((Uri) obj);
            case 2:
                return UriKt.Uri$default(((Path) obj).bytes.utf8());
            case 3:
                int intValue = ((Number) obj).intValue();
                try {
                    if (options.getContext().getResources().getResourceEntryName(intValue) == null) {
                        return null;
                    }
                    return UriKt.toUri$default("android.resource://" + options.getContext().getPackageName() + "/" + intValue);
                } catch (Resources.NotFoundException unused) {
                    return null;
                }
            case 4:
                return UriKt.toUri$default((String) obj);
            case 5:
                HttpUrl httpUrl = (HttpUrl) obj;
                httpUrl.getClass();
                return httpUrl.url;
            default:
                Image image = (Image) obj;
                image.getClass();
                String str = image.dark_url;
                if ((str != null && (options.getContext().getResources().getConfiguration().uiMode & 48) == 32) || (str = image.light_url) != null) {
                    return str;
                }
                Handlers$$ExternalSyntheticBUOutline0.m(image, "invalid image proto: ");
                return null;
        }
    }
}
