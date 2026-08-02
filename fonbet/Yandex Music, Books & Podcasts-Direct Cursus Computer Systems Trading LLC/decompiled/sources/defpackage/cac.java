package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class cac implements ca7 {
    public final /* synthetic */ int a;
    public final Comparable b;
    public final Object c;
    public Object d;

    public /* synthetic */ cac(int i, Comparable comparable, Object obj) {
        this.a = i;
        this.b = comparable;
        this.c = obj;
    }

    public static cac c(Context context, Uri uri, igs igsVar) {
        return new cac(1, uri, new kkp(a.a(context).c.a().e(), igsVar, a.a(context).d, context.getContentResolver(), 5));
    }

    @Override // defpackage.ca7
    public final Class a() {
        switch (this.a) {
            case 0:
                return ((dac) this.c).a();
            default:
                return InputStream.class;
        }
    }

    @Override // defpackage.ca7
    public final void b() {
        switch (this.a) {
            case 0:
                Object obj = this.d;
                if (obj != null) {
                    try {
                        ((dac) this.c).l(obj);
                        break;
                    } catch (IOException unused) {
                        return;
                    }
                }
                break;
            default:
                InputStream inputStream = (InputStream) this.d;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                        break;
                    } catch (IOException unused2) {
                        return;
                    }
                }
                break;
        }
    }

    @Override // defpackage.ca7
    public final void cancel() {
        int i = this.a;
    }

    @Override // defpackage.ca7
    public final void d(nsm nsmVar, ba7 ba7Var) {
        switch (this.a) {
            case 0:
                try {
                    Object K = ((dac) this.c).K((File) this.b);
                    this.d = K;
                    ba7Var.g(K);
                    break;
                } catch (FileNotFoundException e) {
                    if (Log.isLoggable("FileLoader", 3)) {
                        Log.d("FileLoader", "Failed to open file", e);
                    }
                    ba7Var.c(e);
                    return;
                }
            default:
                try {
                    InputStream h = h();
                    this.d = h;
                    ba7Var.g(h);
                    break;
                } catch (FileNotFoundException e2) {
                    if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                        Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e2);
                    }
                    ba7Var.c(e2);
                }
        }
    }

    @Override // defpackage.ca7
    public final int e() {
        switch (this.a) {
        }
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0056, code lost:
    
        if (r7 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0031, code lost:
    
        if (r7 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0033, code lost:
    
        r7.close();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x002c: MOVE (r6 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]) (LINE:45), block:B:80:0x002c */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0047 A[Catch: all -> 0x002b, TRY_LEAVE, TryCatch #8 {all -> 0x002b, blocks: (B:59:0x001c, B:61:0x0022, B:65:0x0041, B:67:0x0047), top: B:2:0x0012 }] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.NullPointerException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InputStream h() {
        ?? r7;
        SecurityException e;
        Cursor cursor;
        InputStream openInputStream;
        int i;
        kkp kkpVar = (kkp) this.c;
        ContentResolver contentResolver = (ContentResolver) kkpVar.d;
        Uri uri = (Uri) this.b;
        ?? r6 = 0;
        InputStream inputStream = null;
        try {
            try {
                try {
                    try {
                        cursor = ((igs) kkpVar.b).q(uri);
                    } catch (SecurityException e2) {
                        e = e2;
                        cursor = null;
                        if (Log.isLoggable("ThumbStreamOpener", 3)) {
                            Log.d("ThumbStreamOpener", "Failed to query for thumbnail for Uri: " + uri, e);
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    if (r6 != 0) {
                        r6.close();
                    }
                    throw th;
                }
            } catch (SecurityException e3) {
                e = e3;
            }
            if (cursor != null) {
                try {
                } catch (SecurityException e4) {
                    e = e4;
                    if (Log.isLoggable("ThumbStreamOpener", 3)) {
                    }
                }
                if (cursor.moveToFirst()) {
                    String str = cursor.getString(0);
                    cursor.close();
                    if (!TextUtils.isEmpty(str)) {
                        File file = new File(str);
                        if (file.exists() && 0 < file.length()) {
                            Uri fromFile = Uri.fromFile(file);
                            try {
                                openInputStream = contentResolver.openInputStream(fromFile);
                                if (openInputStream != null) {
                                    try {
                                        try {
                                            inputStream = contentResolver.openInputStream(uri);
                                            i = lxe.r((ArrayList) kkpVar.e, inputStream, (z98) kkpVar.c);
                                            if (inputStream != null) {
                                                try {
                                                    inputStream.close();
                                                } catch (IOException unused) {
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            if (0 != 0) {
                                                try {
                                                    r6.close();
                                                } catch (IOException unused2) {
                                                }
                                            }
                                            throw th2;
                                        }
                                    } catch (IOException | NullPointerException e5) {
                                        if (Log.isLoggable("ThumbStreamOpener", 3)) {
                                            Log.d("ThumbStreamOpener", "Failed to open uri: " + uri, e5);
                                        }
                                        if (inputStream != null) {
                                            try {
                                                inputStream.close();
                                            } catch (IOException unused3) {
                                            }
                                        }
                                    }
                                    return i != -1 ? new jpb(i, openInputStream) : openInputStream;
                                }
                                i = -1;
                                if (i != -1) {
                                }
                            } catch (NullPointerException e6) {
                                throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + fromFile).initCause(e6));
                            }
                        }
                    }
                    openInputStream = null;
                    if (openInputStream != null) {
                    }
                    i = -1;
                    if (i != -1) {
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            r6 = r7;
        }
    }

    private final void f() {
    }

    private final void g() {
    }
}
