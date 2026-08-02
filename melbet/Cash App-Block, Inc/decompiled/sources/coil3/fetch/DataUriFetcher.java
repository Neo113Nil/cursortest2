package coil3.fetch;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.webkit.MimeTypeMap;
import androidx.core.content.res.ResourcesCompat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.ExtrasKt;
import coil3.Image_androidKt;
import coil3.Uri;
import coil3.UriKt;
import coil3.decode.AssetMetadata;
import coil3.decode.ContentMetadata;
import coil3.decode.DataSource;
import coil3.decode.FileImageSource;
import coil3.decode.ImageSourceKt;
import coil3.decode.ResourceMetadata;
import coil3.decode.SourceImageSource;
import coil3.intercept.EngineInterceptor$fetch$1;
import coil3.request.ImageRequestsKt;
import coil3.request.ImageRequests_androidKt;
import coil3.request.Options;
import coil3.size.Dimension;
import coil3.size.DimensionKt;
import coil3.size.Precision;
import coil3.size.Size;
import coil3.util.DrawableUtils;
import coil3.util.MimeTypesKt;
import coil3.util.Utils_androidKt;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.Buffer;
import okio.FileSystem;
import okio.Okio;
import okio.Path;
import okio.Path$$ExternalSyntheticBUOutline0;
import okio.RealBufferedSource;
import okio.internal.ZipFilesKt;
import okio.internal.ZipFilesKt$$ExternalSyntheticLambda4;
import org.xmlpull.v1.XmlPullParserException;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class DataUriFetcher implements Fetcher {
    public final /* synthetic */ int $r8$classId;
    public final Options options;
    public final Uri uri;

    public /* synthetic */ DataUriFetcher(Uri uri, Options options, int i) {
        this.$r8$classId = i;
        this.uri = uri;
        this.options = options;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0149  */
    @Override // coil3.fetch.Fetcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetch(EngineInterceptor$fetch$1 engineInterceptor$fetch$1) {
        AssetFileDescriptor openAssetFileDescriptor;
        List pathSegments;
        int size;
        Bundle bundle;
        Integer intOrNull;
        String str;
        Drawable drawable;
        int i = this.$r8$classId;
        int i2 = 0;
        Uri uri = this.uri;
        Options options = this.options;
        String str2 = null;
        switch (i) {
            case 0:
                String str3 = uri.data;
                String str4 = uri.data;
                int indexOf$default = StringsKt.indexOf$default((CharSequence) str3, ";base64,", 0, false, 6);
                if (indexOf$default == -1) {
                    Handlers$$ExternalSyntheticBUOutline0.m(uri, "invalid data uri: ");
                    return null;
                }
                int indexOf$default2 = StringsKt.indexOf$default((CharSequence) str4, ':', 0, false, 6);
                if (indexOf$default2 == -1) {
                    Handlers$$ExternalSyntheticBUOutline0.m(uri, "invalid data uri: ");
                    return null;
                }
                String substring = str4.substring(indexOf$default2 + 1, indexOf$default);
                byte[] decode$default = Base64.decode$default(Base64.Default, str4, indexOf$default + 8, 4);
                Buffer buffer = new Buffer();
                buffer.write(decode$default, 0, decode$default.length);
                return new SourceFetchResult(ImageSourceKt.ImageSource$default(buffer, options.fileSystem), substring, DataSource.MEMORY);
            case 1:
                String joinToString$default = CollectionsKt.joinToString$default(CollectionsKt.drop(UriKt.getPathSegments(uri), 1), "/", null, null, 0, null, null, 62);
                SourceImageSource sourceImageSource = new SourceImageSource(new RealBufferedSource(Okio.source(options.context.getAssets().open(joinToString$default))), options.fileSystem, new AssetMetadata(joinToString$default));
                if (!StringsKt.isBlank(joinToString$default)) {
                    String substringBeforeLast$default = StringsKt.substringBeforeLast$default(StringsKt.substringBeforeLast$default(joinToString$default, '#'), '?');
                    String substringAfterLast = StringsKt.substringAfterLast('.', StringsKt.substringAfterLast('/', substringBeforeLast$default, substringBeforeLast$default), "");
                    if (!StringsKt.isBlank(substringAfterLast)) {
                        String lowerCase = substringAfterLast.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        str2 = (String) MimeTypesKt.mimeTypeData.get(lowerCase);
                        if (str2 == null) {
                            str2 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase);
                        }
                    }
                }
                return new SourceFetchResult(sourceImageSource, str2, DataSource.DISK);
            case 2:
                android.net.Uri parse = android.net.Uri.parse(uri.data);
                ContentResolver contentResolver = options.context.getContentResolver();
                String str5 = uri.authority;
                if (Intrinsics.areEqual(str5, "com.android.contacts") && Intrinsics.areEqual(CollectionsKt.lastOrNull(UriKt.getPathSegments(uri)), "display_photo")) {
                    openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(parse, "r");
                    if (openAssetFileDescriptor == null) {
                        Handlers$$ExternalSyntheticBUOutline0.m("Unable to find a contact photo associated with '", parse, "'.");
                        return null;
                    }
                } else if (Intrinsics.areEqual(str5, "media") && (size = (pathSegments = UriKt.getPathSegments(uri)).size()) >= 3 && Intrinsics.areEqual(pathSegments.get(size - 3), "audio") && Intrinsics.areEqual(pathSegments.get(size - 2), "albums")) {
                    Size size2 = options.size;
                    Dimension dimension = size2.width;
                    Dimension.Pixels pixels = dimension instanceof Dimension.Pixels ? (Dimension.Pixels) dimension : null;
                    if (pixels != null) {
                        int i3 = pixels.px;
                        Dimension dimension2 = size2.height;
                        Dimension.Pixels pixels2 = dimension2 instanceof Dimension.Pixels ? (Dimension.Pixels) dimension2 : null;
                        if (pixels2 != null) {
                            int i4 = pixels2.px;
                            bundle = new Bundle(1);
                            bundle.putParcelable("android.content.extra.SIZE", new Point(i3, i4));
                            openAssetFileDescriptor = contentResolver.openTypedAssetFile(parse, "image/*", bundle, null);
                            if (openAssetFileDescriptor == null) {
                                Handlers$$ExternalSyntheticBUOutline0.m("Unable to find a music thumbnail associated with '", parse, "'.");
                                return null;
                            }
                        }
                    }
                    bundle = null;
                    openAssetFileDescriptor = contentResolver.openTypedAssetFile(parse, "image/*", bundle, null);
                    if (openAssetFileDescriptor == null) {
                    }
                } else {
                    openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(parse, "r");
                    if (openAssetFileDescriptor == null) {
                        Handlers$$ExternalSyntheticBUOutline0.m("Unable to open '", parse, "'.");
                        return null;
                    }
                }
                return new SourceFetchResult(new SourceImageSource(new RealBufferedSource(Okio.source(openAssetFileDescriptor.createInputStream())), options.fileSystem, new ContentMetadata(openAssetFileDescriptor)), contentResolver.getType(parse), DataSource.DISK);
            case 3:
                String str6 = Path.DIRECTORY_SEPARATOR;
                String filePath = UriKt.getFilePath(uri);
                if (filePath == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("filePath == null");
                    return null;
                }
                Path path = Path.Companion.get(filePath, false);
                FileImageSource ImageSource$default = ImageSourceKt.ImageSource$default(path, options.fileSystem, null, null, 28);
                String substringAfterLast2 = StringsKt.substringAfterLast('.', path.name(), "");
                if (!StringsKt.isBlank(substringAfterLast2)) {
                    String lowerCase2 = substringAfterLast2.toLowerCase(Locale.ROOT);
                    lowerCase2.getClass();
                    str2 = (String) MimeTypesKt.mimeTypeData.get(lowerCase2);
                    if (str2 == null) {
                        str2 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase2);
                    }
                }
                return new SourceFetchResult(ImageSource$default, str2, DataSource.DISK);
            case 4:
                String str7 = uri.path;
                if (str7 == null) {
                    str7 = "";
                }
                int indexOf$default3 = StringsKt.indexOf$default((CharSequence) str7, '!', 0, false, 6);
                if (indexOf$default3 == -1) {
                    Handlers$$ExternalSyntheticBUOutline0.m(uri, "Invalid jar:file URI: ");
                    return null;
                }
                String str8 = Path.DIRECTORY_SEPARATOR;
                Path path2 = Path.Companion.get(str7.substring(0, indexOf$default3), false);
                Path path3 = Path.Companion.get(str7.substring(indexOf$default3 + 1, str7.length()), false);
                FileSystem fileSystem = options.fileSystem;
                fileSystem.getClass();
                FileImageSource ImageSource$default2 = ImageSourceKt.ImageSource$default(path3, ZipFilesKt.openZip(path2, fileSystem, new ZipFilesKt$$ExternalSyntheticLambda4(i2)), null, null, 28);
                String substringAfterLast3 = StringsKt.substringAfterLast('.', path3.name(), "");
                if (!StringsKt.isBlank(substringAfterLast3)) {
                    String lowerCase3 = substringAfterLast3.toLowerCase(Locale.ROOT);
                    lowerCase3.getClass();
                    str2 = (String) MimeTypesKt.mimeTypeData.get(lowerCase3);
                    if (str2 == null) {
                        str2 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase3);
                    }
                }
                return new SourceFetchResult(ImageSource$default2, str2, DataSource.DISK);
            default:
                String str9 = uri.authority;
                if (str9 != null) {
                    if (StringsKt.isBlank(str9)) {
                        str9 = null;
                    }
                    if (str9 != null) {
                        String str10 = (String) CollectionsKt.lastOrNull(UriKt.getPathSegments(uri));
                        if (str10 == null || (intOrNull = StringsKt.toIntOrNull(str10)) == null) {
                            OptionalProvider$$ExternalSyntheticLambda0.m$1(uri, "Invalid android.resource URI: ");
                            return null;
                        }
                        int intValue = intOrNull.intValue();
                        Context context = options.context;
                        Resources resources = str9.equals(context.getPackageName()) ? context.getResources() : context.getPackageManager().getResourcesForApplication(str9);
                        TypedValue typedValue = new TypedValue();
                        resources.getValue(intValue, typedValue, true);
                        String obj = typedValue.string.toString();
                        if (!StringsKt.isBlank(obj)) {
                            String substringBeforeLast$default2 = StringsKt.substringBeforeLast$default(StringsKt.substringBeforeLast$default(obj, '#'), '?');
                            String substringAfterLast4 = StringsKt.substringAfterLast('.', StringsKt.substringAfterLast('/', substringBeforeLast$default2, substringBeforeLast$default2), "");
                            if (!StringsKt.isBlank(substringAfterLast4)) {
                                String lowerCase4 = substringAfterLast4.toLowerCase(Locale.ROOT);
                                lowerCase4.getClass();
                                str = (String) MimeTypesKt.mimeTypeData.get(lowerCase4);
                                if (str == null) {
                                    str = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase4);
                                }
                                if (Intrinsics.areEqual(str, "text/xml")) {
                                    return new SourceFetchResult(new SourceImageSource(new RealBufferedSource(Okio.source(resources.openRawResource(intValue, new TypedValue()))), options.fileSystem, new ResourceMetadata(str9, intValue)), str, DataSource.DISK);
                                }
                                if (str9.equals(context.getPackageName())) {
                                    drawable = DimensionKt.getDrawable(context, intValue);
                                    if (drawable == null) {
                                        Path$$ExternalSyntheticBUOutline0.m((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(intValue, "Invalid resource ID: "));
                                        return null;
                                    }
                                } else {
                                    XmlResourceParser xml = resources.getXml(intValue);
                                    int next = xml.next();
                                    while (next != 2 && next != 1) {
                                        next = xml.next();
                                    }
                                    if (next != 2) {
                                        throw new XmlPullParserException("No start tag found.");
                                    }
                                    drawable = ResourcesCompat.getDrawable(resources, intValue, context.getTheme());
                                    if (drawable == null) {
                                        Path$$ExternalSyntheticBUOutline0.m((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(intValue, "Invalid resource ID: "));
                                        return null;
                                    }
                                }
                                Drawable drawable2 = drawable;
                                Bitmap.Config[] configArr = Utils_androidKt.VALID_TRANSFORMATION_CONFIGS;
                                boolean z = (drawable2 instanceof VectorDrawable) || (drawable2 instanceof VectorDrawableCompat);
                                if (z) {
                                    drawable2 = new BitmapDrawable(context.getResources(), DrawableUtils.convertToBitmap(drawable2, (Bitmap.Config) ExtrasKt.getExtra(options, ImageRequests_androidKt.bitmapConfigKey), options.size, options.scale, (Size) ExtrasKt.getExtra(options, ImageRequestsKt.maxBitmapSizeKey), options.precision == Precision.INEXACT));
                                }
                                return new ImageFetchResult(Image_androidKt.asImage(drawable2), z, DataSource.DISK);
                            }
                        }
                        str = null;
                        if (Intrinsics.areEqual(str, "text/xml")) {
                        }
                    }
                }
                OptionalProvider$$ExternalSyntheticLambda0.m$1(uri, "Invalid android.resource URI: ");
                return null;
        }
    }
}
