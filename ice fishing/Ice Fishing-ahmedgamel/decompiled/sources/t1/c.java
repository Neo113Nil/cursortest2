package t1;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.j;
import com.bumptech.glide.load.data.h;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import y1.z;

/* loaded from: classes.dex */
public final class c implements com.bumptech.glide.load.data.d {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f40792n;

    /* renamed from: u, reason: collision with root package name */
    public final Comparable f40793u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f40794v;

    /* renamed from: w, reason: collision with root package name */
    public Object f40795w;

    public /* synthetic */ c(Comparable comparable, Object obj, int i) {
        this.f40792n = i;
        this.f40793u = comparable;
        this.f40794v = obj;
    }

    public static c c(Context context, Uri uri, d dVar) {
        return new c(uri, new e(com.bumptech.glide.c.a(context).f23374v.a().e(), dVar, com.bumptech.glide.c.a(context).f23375w, context.getContentResolver()), 0);
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class a() {
        switch (this.f40792n) {
            case 0:
                return InputStream.class;
            case 1:
                ((z) this.f40794v).getClass();
                return InputStream.class;
            default:
                return ((z) this.f40794v).b();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        switch (this.f40792n) {
            case 0:
                InputStream inputStream = (InputStream) this.f40795w;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                        break;
                    } catch (IOException unused) {
                        return;
                    }
                }
                break;
            case 1:
                try {
                    ((ByteArrayInputStream) this.f40795w).close();
                    break;
                } catch (IOException unused2) {
                    return;
                }
            default:
                Object obj = this.f40795w;
                if (obj != null) {
                    try {
                        switch (((z) this.f40794v).f41845n) {
                            case 8:
                                ((ParcelFileDescriptor) obj).close();
                                break;
                            default:
                                ((InputStream) obj).close();
                                break;
                        }
                        break;
                    } catch (IOException unused3) {
                        return;
                    }
                }
                break;
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
        int i = this.f40792n;
    }

    @Override // com.bumptech.glide.load.data.d
    public final int d() {
        switch (this.f40792n) {
        }
        return 1;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(j jVar, com.bumptech.glide.load.data.c cVar) {
        Object open;
        switch (this.f40792n) {
            case 0:
                try {
                    InputStream i = i();
                    this.f40795w = i;
                    cVar.f(i);
                    break;
                } catch (FileNotFoundException e9) {
                    if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                        Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e9);
                    }
                    cVar.c(e9);
                    return;
                }
            case 1:
                try {
                    ByteArrayInputStream a9 = z.a((String) this.f40793u);
                    this.f40795w = a9;
                    cVar.f(a9);
                    break;
                } catch (IllegalArgumentException e10) {
                    cVar.c(e10);
                }
            default:
                try {
                    z zVar = (z) this.f40794v;
                    File file = (File) this.f40793u;
                    switch (zVar.f41845n) {
                        case 8:
                            open = ParcelFileDescriptor.open(file, 268435456);
                            break;
                        default:
                            open = new FileInputStream(file);
                            break;
                    }
                    this.f40795w = open;
                    cVar.f(open);
                    break;
                } catch (FileNotFoundException e11) {
                    if (Log.isLoggable("FileLoader", 3)) {
                        Log.d("FileLoader", "Failed to open file", e11);
                    }
                    cVar.c(e11);
                    return;
                }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x002b, code lost:
    
        if (r6 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x004c, code lost:
    
        if (r6 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002d, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0030, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0026: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:39), block:B:68:0x0026 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e3  */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.IOException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InputStream i() {
        Cursor cursor;
        ?? r62;
        InputStream openInputStream;
        int i;
        Uri uri = (Uri) this.f40793u;
        e eVar = (e) this.f40794v;
        ?? r52 = 0;
        InputStream inputStream = null;
        try {
            try {
                cursor = eVar.f40796a.a(uri);
            } catch (Throwable th) {
                th = th;
                r52 = r62;
                if (r52 != 0) {
                    r52.close();
                }
                throw th;
            }
        } catch (SecurityException e9) {
            e = e9;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (r52 != 0) {
            }
            throw th;
        }
        if (cursor != null) {
            try {
            } catch (SecurityException e10) {
                e = e10;
                if (Log.isLoggable("ThumbStreamOpener", 3)) {
                    Log.d("ThumbStreamOpener", "Failed to query for thumbnail for Uri: " + uri, e);
                }
            }
            if (cursor.moveToFirst()) {
                String str = cursor.getString(0);
                cursor.close();
                boolean isEmpty = TextUtils.isEmpty(str);
                ContentResolver contentResolver = eVar.f40798c;
                if (!isEmpty) {
                    File file = new File(str);
                    if (file.exists() && 0 < file.length()) {
                        Uri fromFile = Uri.fromFile(file);
                        try {
                            openInputStream = contentResolver.openInputStream(fromFile);
                            if (openInputStream != null) {
                                try {
                                    try {
                                        inputStream = contentResolver.openInputStream(uri);
                                        i = com.bumptech.glide.e.d(eVar.f40799d, inputStream, eVar.f40797b);
                                        if (inputStream != null) {
                                            try {
                                                inputStream.close();
                                            } catch (IOException unused) {
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        if (0 != 0) {
                                            try {
                                                r52.close();
                                            } catch (IOException unused2) {
                                            }
                                        }
                                        throw th3;
                                    }
                                } catch (IOException | NullPointerException e11) {
                                    if (Log.isLoggable("ThumbStreamOpener", 3)) {
                                        Log.d("ThumbStreamOpener", "Failed to open uri: " + uri, e11);
                                    }
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (IOException unused3) {
                                        }
                                    }
                                }
                                return i != -1 ? new h(openInputStream, i) : openInputStream;
                            }
                            i = -1;
                            if (i != -1) {
                            }
                        } catch (NullPointerException e12) {
                            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + fromFile).initCause(e12));
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
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void h() {
    }
}
