package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.exifinterface.media.a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/* loaded from: classes10.dex */
public final class tlo {
    public static final List b = Arrays.asList("FNumber", "ExposureTime", "ISOSpeedRatings", "GPSAltitude", "GPSAltitudeRef", "FocalLength", "GPSDateStamp", "WhiteBalance", "GPSProcessingMethod", "GPSTimeStamp", "DateTime", "Flash", "GPSLatitude", "GPSLatitudeRef", "GPSLongitude", "GPSLongitudeRef", "Make", "Model");
    public final a a;

    public tlo(byte[] bArr) {
        this.a = new a(new ByteArrayInputStream(bArr));
    }

    public final ByteArrayOutputStream a(Context context, ByteArrayOutputStream byteArrayOutputStream) {
        FileOutputStream fileOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            String uuid = UUID.randomUUID().toString();
            File file = new File(context.getCacheDir(), uuid + ".jpg");
            fileOutputStream = new FileOutputStream(file);
            try {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                int i = i3v.a;
                if (byteArray != null) {
                    fileOutputStream.write(byteArray);
                }
                fileOutputStream.close();
                a aVar = new a(file.getAbsolutePath());
                a aVar2 = this.a;
                for (String str : b) {
                    if (aVar2.c(str) != null) {
                        aVar.I(str, aVar2.c(str));
                    }
                }
                try {
                    aVar.E();
                } catch (IOException unused) {
                }
                aVar.E();
                fileOutputStream.close();
                byteArrayOutputStream2 = new ByteArrayOutputStream();
                fileInputStream = new FileInputStream(file);
            } catch (Exception e) {
                e = e;
            }
        } catch (Exception e2) {
            e = e2;
            fileOutputStream = null;
        }
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (-1 == read) {
                    fileInputStream.close();
                    return byteArrayOutputStream2;
                }
                byteArrayOutputStream2.write(bArr, 0, read);
            }
        } catch (Exception e3) {
            e = e3;
            fileInputStream2 = fileInputStream;
            Log.e("ExifDataCopier", "Error preserving Exif data on selected image: " + e);
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (IOException unused2) {
                }
            }
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused3) {
                }
            }
            return byteArrayOutputStream;
        }
    }

    public tlo(String str) {
        this.a = new a(str);
    }
}
