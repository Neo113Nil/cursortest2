package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.util.Size;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.exifinterface.media.a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/* loaded from: classes11.dex */
public abstract class y8b1 {
    public static byte[] a(Context context, Uri uri, int i) {
        byte[] byteArray;
        int i2 = (i & 8) != 0 ? 524288 : 204800;
        Bitmap c = c(context, uri, null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        c.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        byte[] R = rzo.R(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
        if (R.length <= i2) {
            return R;
        }
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(R, 0, R.length);
        int width = decodeByteArray.getWidth();
        int height = decodeByteArray.getHeight();
        int i3 = 90;
        do {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            decodeByteArray.compress(Bitmap.CompressFormat.JPEG, i3, byteArrayOutputStream2);
            byteArray = byteArrayOutputStream2.toByteArray();
            i3 -= 10;
            if (byteArray.length <= i2) {
                break;
            }
        } while (i3 >= 70);
        Bitmap bitmap = decodeByteArray;
        while (byteArray.length > i2 && width > 512 && height > 512) {
            width = (int) (width * 0.9d);
            height = (int) (height * 0.9d);
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, width, height, true);
            if (bitmap != decodeByteArray) {
                bitmap.recycle();
            }
            int i4 = 90;
            do {
                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, i4, byteArrayOutputStream3);
                byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
                i4 -= 10;
                if (byteArray2.length > i2) {
                }
                bitmap = createScaledBitmap;
                byteArray = byteArray2;
            } while (i4 >= 70);
            bitmap = createScaledBitmap;
            byteArray = byteArray2;
        }
        bitmap.recycle();
        if (bitmap != decodeByteArray) {
            decodeByteArray.recycle();
        }
        return byteArray;
    }

    public static final int b(BitmapFactory.Options options, Size size) {
        int i = options.outHeight;
        if (options.outWidth > size.getWidth() || i > size.getHeight()) {
            return Math.max((int) Math.ceil(i / size.getHeight()), (int) Math.ceil(r2 / size.getWidth()));
        }
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Bitmap c(Context context, Uri uri, Size size) {
        Bitmap decodeByteArray;
        Matrix matrix;
        Matrix matrix2;
        Matrix matrix3;
        Bitmap createBitmap;
        InputStream openInputStream = context.getContentResolver().openInputStream(uri);
        if (openInputStream == null) {
            ny61.v("Failed to open input stream");
            return null;
        }
        byte[] R = rzo.R(openInputStream);
        int d = new a(new ByteArrayInputStream(R)).d(1, "Orientation");
        if (size != null) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(uri.getPath(), options);
            options.inJustDecodeBounds = false;
            options.inSampleSize = b(options, size);
            decodeByteArray = BitmapFactory.decodeByteArray(R, 0, R.length, options);
        } else {
            decodeByteArray = BitmapFactory.decodeByteArray(R, 0, R.length);
        }
        Bitmap bitmap = decodeByteArray;
        switch (d) {
            case 2:
                matrix = new Matrix();
                matrix.setScale(-1.0f, 1.0f);
                matrix3 = matrix;
                createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix3, true);
                if (!jl40.l(createBitmap, bitmap)) {
                    bitmap.recycle();
                }
                return createBitmap;
            case 3:
                matrix = new Matrix();
                matrix.setRotate(180.0f);
                matrix3 = matrix;
                createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix3, true);
                if (!jl40.l(createBitmap, bitmap)) {
                }
                return createBitmap;
            case 4:
                matrix = new Matrix();
                matrix.setScale(1.0f, -1.0f);
                matrix3 = matrix;
                createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix3, true);
                if (!jl40.l(createBitmap, bitmap)) {
                }
                return createBitmap;
            case 5:
                matrix2 = new Matrix();
                matrix2.setRotate(90.0f);
                matrix2.postScale(-1.0f, 1.0f);
                matrix3 = matrix2;
                createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix3, true);
                if (!jl40.l(createBitmap, bitmap)) {
                }
                return createBitmap;
            case 6:
                matrix2 = new Matrix();
                matrix2.setRotate(90.0f);
                matrix3 = matrix2;
                createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix3, true);
                if (!jl40.l(createBitmap, bitmap)) {
                }
                return createBitmap;
            case 7:
                matrix = new Matrix();
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                matrix3 = matrix;
                createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix3, true);
                if (!jl40.l(createBitmap, bitmap)) {
                }
                return createBitmap;
            case 8:
                matrix = new Matrix();
                matrix.setRotate(-90.0f);
                matrix3 = matrix;
                createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix3, true);
                if (!jl40.l(createBitmap, bitmap)) {
                }
                return createBitmap;
            default:
                return bitmap;
        }
    }

    public static final ResolvedTextDirection d(dry0 dry0Var, int i) {
        cry0 cry0Var = dry0Var.a;
        hm40 hm40Var = dry0Var.b;
        if (cry0Var.a.b.length() != 0) {
            int d = hm40Var.d(i);
            if ((i != 0 && d == hm40Var.d(i - 1)) || (i != dry0Var.a.a.b.length() && d == hm40Var.d(i + 1))) {
                return dry0Var.a(i);
            }
        }
        return dry0Var.l(i);
    }
}
