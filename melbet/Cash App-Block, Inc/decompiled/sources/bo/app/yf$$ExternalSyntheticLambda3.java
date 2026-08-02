package bo.app;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeImageUtils;
import com.withpersona.sdk2.inquiry.shared.image.RealImageHelper;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.math.MathKt__MathJVMKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class yf$$ExternalSyntheticLambda3 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ File f$0;

    public /* synthetic */ yf$$ExternalSyntheticLambda3(RealImageHelper realImageHelper, File file) {
        this.$r8$classId = 3;
        this.f$0 = file;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object failure;
        String deleteFileOrDirectory$lambda$0;
        String localBitmap$lambda$2;
        int i = this.$r8$classId;
        File file = this.f$0;
        switch (i) {
            case 0:
                return yf.b(file);
            case 1:
                deleteFileOrDirectory$lambda$0 = BrazeFileUtils.deleteFileOrDirectory$lambda$0(file);
                return deleteFileOrDirectory$lambda$0;
            case 2:
                localBitmap$lambda$2 = BrazeImageUtils.getLocalBitmap$lambda$2(file);
                return localBitmap$lambda$2;
            default:
                try {
                    Result.Companion companion = Result.Companion;
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(file.getAbsolutePath(), options);
                    Map extractExifData = RealImageHelper.extractExifData(file);
                    String absolutePath = file.getAbsolutePath();
                    BitmapFactory.Options options2 = new BitmapFactory.Options();
                    int i2 = options.outHeight;
                    int i3 = options.outWidth;
                    options2.inSampleSize = (i2 > 2000 || i3 > 2000) ? Math.min(MathKt__MathJVMKt.roundToInt(i2 / 2000.0f), MathKt__MathJVMKt.roundToInt(i3 / 2000.0f)) : 1;
                    Bitmap decodeFile = BitmapFactory.decodeFile(absolutePath, options2);
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    if (decodeFile != null) {
                        try {
                            decodeFile.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream);
                        } finally {
                        }
                    }
                    fileOutputStream.close();
                    if (decodeFile != null) {
                        decodeFile.recycle();
                    }
                    RealImageHelper.writeExifData(file, extractExifData);
                    failure = Unit.INSTANCE;
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    failure = new Result.Failure(th);
                }
                return new Result(failure);
        }
    }

    public /* synthetic */ yf$$ExternalSyntheticLambda3(File file, int i) {
        this.$r8$classId = i;
        this.f$0 = file;
    }
}
