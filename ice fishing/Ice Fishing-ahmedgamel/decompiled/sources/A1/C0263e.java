package A1;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: A1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0263e implements com.bumptech.glide.load.data.d {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f51n;

    /* renamed from: u, reason: collision with root package name */
    public final Comparable f52u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f53v;

    /* renamed from: w, reason: collision with root package name */
    public Object f54w;

    public /* synthetic */ C0263e(Comparable comparable, Object obj, int i) {
        this.f51n = i;
        this.f52u = comparable;
        this.f53v = obj;
    }

    public static C0263e c(Context context, Uri uri, v1.c cVar) {
        return new C0263e(uri, new v1.d(com.bumptech.glide.c.a(context).f24161v.a().e(), cVar, com.bumptech.glide.c.a(context).f24162w, context.getContentResolver()), 2);
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class a() {
        switch (this.f51n) {
            case 0:
                ((H) this.f53v).getClass();
                return InputStream.class;
            case 1:
                return ((H) this.f53v).d();
            default:
                return InputStream.class;
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        switch (this.f51n) {
            case 0:
                try {
                    ((ByteArrayInputStream) this.f54w).close();
                    break;
                } catch (IOException unused) {
                    return;
                }
            case 1:
                Object obj = this.f54w;
                if (obj != null) {
                    try {
                        switch (((H) this.f53v).f34n) {
                            case 8:
                                ((ParcelFileDescriptor) obj).close();
                                break;
                            default:
                                ((InputStream) obj).close();
                                break;
                        }
                        break;
                    } catch (IOException unused2) {
                        return;
                    }
                }
                break;
            default:
                InputStream inputStream = (InputStream) this.f54w;
                if (inputStream != null) {
                    try {
                        inputStream.close();
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
        int i = this.f51n;
    }

    @Override // com.bumptech.glide.load.data.d
    public final int d() {
        switch (this.f51n) {
        }
        return 1;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(com.bumptech.glide.j jVar, com.bumptech.glide.load.data.c cVar) {
        Object open;
        switch (this.f51n) {
            case 0:
                try {
                    ByteArrayInputStream a9 = H.a((String) this.f52u);
                    this.f54w = a9;
                    cVar.f(a9);
                    break;
                } catch (IllegalArgumentException e9) {
                    cVar.c(e9);
                }
            case 1:
                try {
                    H h3 = (H) this.f53v;
                    File file = (File) this.f52u;
                    switch (h3.f34n) {
                        case 8:
                            open = ParcelFileDescriptor.open(file, 268435456);
                            break;
                        default:
                            open = new FileInputStream(file);
                            break;
                    }
                    this.f54w = open;
                    cVar.f(open);
                    break;
                } catch (FileNotFoundException e10) {
                    if (Log.isLoggable("FileLoader", 3)) {
                        Log.d("FileLoader", "Failed to open file", e10);
                    }
                    cVar.c(e10);
                    return;
                }
            default:
                try {
                    InputStream i = i();
                    this.f54w = i;
                    cVar.f(i);
                    break;
                } catch (FileNotFoundException e11) {
                    if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                        Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e11);
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
        Uri uri = (Uri) this.f52u;
        v1.d dVar = (v1.d) this.f53v;
        ?? r52 = 0;
        InputStream inputStream = null;
        try {
            try {
                cursor = dVar.f41084a.a(uri);
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
                ContentResolver contentResolver = dVar.f41086c;
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
                                        i = t8.g.i(dVar.f41087d, inputStream, dVar.f41085b);
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
                                return i != -1 ? new com.bumptech.glide.load.data.h(openInputStream, i) : openInputStream;
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
