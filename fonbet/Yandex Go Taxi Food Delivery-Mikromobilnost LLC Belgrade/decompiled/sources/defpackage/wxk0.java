package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.net.Uri;
import android.provider.ContactsContract;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Iterator;

/* loaded from: classes15.dex */
public final class wxk0 extends zn50 {
    public static final String[] c = {"contact_id", "photo_thumb_uri"};
    public final Context b;

    public wxk0(Context context, y9v y9vVar) {
        this.a = y9vVar;
        this.b = context;
    }

    @Override // defpackage.zn50
    public final boolean a(xn50 xn50Var) {
        return "avatar".equalsIgnoreCase(xn50Var.b.getScheme());
    }

    @Override // defpackage.zn50
    public final ht10 c(xn50 xn50Var) {
        byte[] byteArray;
        Uri uri = xn50Var.b;
        Context context = this.b;
        ContentResolver contentResolver = context.getContentResolver();
        String queryParameter = uri.getQueryParameter("fallback_url");
        if (contentResolver == null || qke.h(context, "android.permission.READ_CONTACTS") != 0) {
            return f(queryParameter);
        }
        Cursor query = contentResolver.query(ContactsContract.Data.CONTENT_URI, c, "contact_id = ?", new String[]{uri.getQueryParameter("id")}, null);
        if (query == null || !query.moveToFirst()) {
            return f(queryParameter);
        }
        do {
            String string = query.getString(query.getColumnIndex("photo_thumb_uri"));
            if (string == null) {
                return f(queryParameter);
            }
            InputStream openInputStream = contentResolver.openInputStream(Uri.parse(string));
            if (openInputStream == null) {
                byteArray = null;
            } else {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[2048];
                while (true) {
                    int read = openInputStream.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                byteArray = byteArrayOutputStream.toByteArray();
            }
            if (byteArray != null) {
                break;
            }
        } while (query.moveToNext());
        query.close();
        if (byteArray == null || byteArray.length == 0) {
            return f(queryParameter);
        }
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, null);
        Bitmap createBitmap = Bitmap.createBitmap(decodeByteArray.getWidth(), decodeByteArray.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(1);
        paint.setColor(ModalContentViewContainer.BASE_SHADOW_COLOR);
        canvas.drawCircle(r0 >> 1, r1 >> 1, Math.min(r0, r1) >> 1, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(decodeByteArray, 0.0f, 0.0f, paint);
        canvas.setBitmap(null);
        decodeByteArray.recycle();
        return new ht10(createBitmap, (byte[]) null);
    }

    public final ht10 f(String str) {
        y9v y9vVar = this.a;
        if (y9vVar == null) {
            z83.j(null);
            return null;
        }
        xn50 xn50Var = new xn50(str);
        Iterator it = y9vVar.a.iterator();
        while (it.hasNext()) {
            zn50 zn50Var = (zn50) it.next();
            if (zn50Var.a(xn50Var)) {
                return zn50Var.c(xn50Var);
            }
        }
        z83.i();
        y9v.b.c(xn50Var);
        throw null;
    }
}
