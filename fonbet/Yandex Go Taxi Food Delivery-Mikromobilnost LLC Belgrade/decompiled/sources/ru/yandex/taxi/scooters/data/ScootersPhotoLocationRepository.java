package ru.yandex.taxi.scooters.data;

import android.content.Context;
import android.net.Uri;
import defpackage.gho0;
import defpackage.k4o;
import defpackage.oyr;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.Metadata;
import kotlin.Pair;

/* loaded from: classes6.dex */
public final class ScootersPhotoLocationRepository {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/yandex/taxi/scooters/data/ScootersPhotoLocationRepository$Format;", "", "", "extension", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "mimeType", "getMimeType", "JPEG", "PNG", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Format {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Format[] $VALUES;
        public static final Format JPEG;
        public static final Format PNG;
        private final String extension;
        private final String mimeType;

        static {
            Format format = new Format("JPEG", 0, ".jpg", "image/jpeg");
            JPEG = format;
            Format format2 = new Format("PNG", 1, ".png", "image/png");
            PNG = format2;
            Format[] formatArr = {format, format2};
            $VALUES = formatArr;
            $ENTRIES = kotlin.enums.a.a(formatArr);
        }

        public Format(String str, int i, String str2, String str3) {
            this.extension = str2;
            this.mimeType = str3;
        }

        public static Format valueOf(String str) {
            return (Format) Enum.valueOf(Format.class, str);
        }

        public static Format[] values() {
            return (Format[]) $VALUES.clone();
        }

        /* renamed from: a, reason: from getter */
        public final String getExtension() {
            return this.extension;
        }
    }

    public static Pair a(Context context, Format format) {
        File file = new File(context.getCacheDir(), oyr.p("IMG_", gho0.a.format(Long.valueOf(System.currentTimeMillis())), format.getExtension()));
        return new Pair(Uri.fromFile(file), new FileOutputStream(file));
    }
}
