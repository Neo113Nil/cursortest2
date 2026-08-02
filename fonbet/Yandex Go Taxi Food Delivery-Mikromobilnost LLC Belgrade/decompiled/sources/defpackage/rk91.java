package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Process;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.util.Log;
import android.webkit.MimeTypeMap;
import androidx.camera.video.h;
import io.flutter.plugins.camerax.CameraXError;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes11.dex */
public abstract class rk91 {
    public static final String[] a = {"_size"};
    public static final String[] b = {"_display_name"};
    public static au2 c;

    public static final o641 a(ListBuilder listBuilder) {
        return new o641(listBuilder);
    }

    public static long b(Context context, Uri uri) {
        File file = new File(uri.getPath());
        if (file.exists()) {
            return file.length();
        }
        Cursor query = context.getContentResolver().query(uri, a, null, null, null, null);
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    long j = query.getLong(query.getColumnIndex("_size"));
                    query.close();
                    long j2 = 0;
                    if (j > 0) {
                        return j;
                    }
                    InputStream openInputStream = context.getContentResolver().openInputStream(uri);
                    try {
                        if (openInputStream == null) {
                            throw new FileNotFoundException("Unable to open input stream for uri" + uri);
                        }
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int read = openInputStream.read(bArr);
                            if (read <= 0) {
                                openInputStream.close();
                                return j2;
                            }
                            j2 += read;
                        }
                    } finally {
                    }
                }
            } finally {
            }
        }
        throw new FileNotFoundException("Unable to get size from cursor: " + query);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String c(Context context, Uri uri) {
        String str;
        String[] strArr;
        Uri uri2;
        String e;
        File file = new File(uri.getPath());
        if (file.exists()) {
            return file.getName();
        }
        if (!DocumentsContract.isDocumentUri(context, uri)) {
            String d = d(context, uri);
            if (d != null) {
                return d;
            }
            String lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment != null) {
                return lastPathSegment;
            }
            throw new FileNotFoundException("Unable to get display name from cursor or from uri as string.");
        }
        String documentId = DocumentsContract.getDocumentId(uri);
        if (context.checkPermission("android.permission.READ_EXTERNAL_STORAGE", Process.myPid(), Process.myUid()) == 0) {
            if (documentId.contains("image")) {
                strArr = new String[]{"_data"};
                uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                e = e(documentId);
            } else if (documentId.contains(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                strArr = new String[]{"_data"};
                uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                e = e(documentId);
            } else if (documentId.contains(MediaStreamTrack.AUDIO_TRACK_KIND)) {
                strArr = new String[]{"_data"};
                uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                e = e(documentId);
            }
            String[] strArr2 = strArr;
            Cursor query = context.getContentResolver().query(uri2, strArr2, "_id = ?", new String[]{e}, null);
            if (query != null) {
                try {
                    if (query.moveToFirst() && !query.isNull(0)) {
                        str = new File(query.getString(query.getColumnIndex(strArr2[0]))).getName();
                        query.close();
                        if (str == null) {
                            return str;
                        }
                        String name = "raw".equals(Uri.parse(documentId).getScheme()) ? new File(documentId).getName() : null;
                        if (name != null) {
                            return name;
                        }
                        String d2 = d(context, uri);
                        return d2 != null ? d2 : documentId.replaceAll("[^a-zA-Z0-9.\\-]", "_");
                    }
                } finally {
                }
            }
            if (query != null) {
                query.close();
            }
        }
        str = null;
        if (str == null) {
        }
    }

    public static String d(Context context, Uri uri) {
        try {
            Cursor query = context.getContentResolver().query(uri, b, null, null, null);
            if (query != null) {
                try {
                    if (query.moveToFirst() && !query.isNull(0)) {
                        String string = query.getString(0);
                        query.close();
                        return string;
                    }
                } finally {
                }
            }
            if (query != null) {
                query.close();
            }
        } catch (SecurityException unused) {
        }
        return null;
    }

    public static String e(String str) {
        String[] split = str.split(":");
        if (split.length == 1) {
            return split[0];
        }
        if (split.length == 2) {
            return split[1];
        }
        ny61.r("Invalidate document id ".concat(str));
        return null;
    }

    public static String f(Context context, Uri uri) {
        int lastIndexOf;
        String type;
        if ("content".equals(uri.getScheme()) && (type = context.getContentResolver().getType(uri)) != null) {
            return type;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment != null && (lastIndexOf = lastPathSegment.lastIndexOf(46)) >= 0) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(lastPathSegment.substring(lastIndexOf + 1));
        }
        return null;
    }

    public static void g(tt5 tt5Var, final sm7 sm7Var) {
        rs10 j = sm7Var != null ? sm7Var.a.j() : new bu7();
        Object obj = null;
        m2v m2vVar = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.Recording.close", j, obj);
        if (sm7Var != null) {
            final int i = 0;
            m2vVar.G(new ee5() { // from class: vsb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    int i2 = i;
                    sm7 sm7Var2 = sm7Var;
                    switch (i2) {
                        case 0:
                            h hVar = (h) ((List) obj2).get(0);
                            try {
                                sm7Var2.getClass();
                                hVar.close();
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                if (th instanceof CameraXError) {
                                    CameraXError cameraXError = th;
                                    g = scc.g(cameraXError.getCode(), cameraXError.getMessage(), cameraXError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            h hVar2 = (h) ((List) obj2).get(0);
                            try {
                                sm7Var2.getClass();
                                hVar2.a();
                                g2 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof CameraXError) {
                                    CameraXError cameraXError2 = th2;
                                    g2 = scc.g(cameraXError2.getCode(), cameraXError2.getMessage(), cameraXError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            break;
                        case 2:
                            h hVar3 = (h) ((List) obj2).get(0);
                            try {
                                sm7Var2.getClass();
                                hVar3.c();
                                g3 = Collections.singletonList(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof CameraXError) {
                                    CameraXError cameraXError3 = th3;
                                    g3 = scc.g(cameraXError3.getCode(), cameraXError3.getMessage(), cameraXError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            break;
                        default:
                            h hVar4 = (h) ((List) obj2).get(0);
                            try {
                                sm7Var2.getClass();
                                hVar4.close();
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof CameraXError) {
                                    CameraXError cameraXError4 = th4;
                                    g4 = scc.g(cameraXError4.getCode(), cameraXError4.getMessage(), cameraXError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            break;
                    }
                }
            });
        } else {
            m2vVar.G(null);
        }
        m2v m2vVar2 = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.Recording.pause", j, obj);
        if (sm7Var != null) {
            final int i2 = 1;
            m2vVar2.G(new ee5() { // from class: vsb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    int i22 = i2;
                    sm7 sm7Var2 = sm7Var;
                    switch (i22) {
                        case 0:
                            h hVar = (h) ((List) obj2).get(0);
                            try {
                                sm7Var2.getClass();
                                hVar.close();
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                if (th instanceof CameraXError) {
                                    CameraXError cameraXError = th;
                                    g = scc.g(cameraXError.getCode(), cameraXError.getMessage(), cameraXError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            h hVar2 = (h) ((List) obj2).get(0);
                            try {
                                sm7Var2.getClass();
                                hVar2.a();
                                g2 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof CameraXError) {
                                    CameraXError cameraXError2 = th2;
                                    g2 = scc.g(cameraXError2.getCode(), cameraXError2.getMessage(), cameraXError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            break;
                        case 2:
                            h hVar3 = (h) ((List) obj2).get(0);
                            try {
                                sm7Var2.getClass();
                                hVar3.c();
                                g3 = Collections.singletonList(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof CameraXError) {
                                    CameraXError cameraXError3 = th3;
                                    g3 = scc.g(cameraXError3.getCode(), cameraXError3.getMessage(), cameraXError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            break;
                        default:
                            h hVar4 = (h) ((List) obj2).get(0);
                            try {
                                sm7Var2.getClass();
                                hVar4.close();
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof CameraXError) {
                                    CameraXError cameraXError4 = th4;
                                    g4 = scc.g(cameraXError4.getCode(), cameraXError4.getMessage(), cameraXError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            break;
                    }
                }
            });
        } else {
            m2vVar2.G(null);
        }
        m2v m2vVar3 = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.Recording.resume", j, obj);
        if (sm7Var != null) {
            final int i3 = 2;
            m2vVar3.G(new ee5() { // from class: vsb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    int i22 = i3;
                    sm7 sm7Var2 = sm7Var;
                    switch (i22) {
                        case 0:
                            h hVar = (h) ((List) obj2).get(0);
                            try {
                                sm7Var2.getClass();
                                hVar.close();
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                if (th instanceof CameraXError) {
                                    CameraXError cameraXError = th;
                                    g = scc.g(cameraXError.getCode(), cameraXError.getMessage(), cameraXError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            h hVar2 = (h) ((List) obj2).get(0);
                            try {
                                sm7Var2.getClass();
                                hVar2.a();
                                g2 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof CameraXError) {
                                    CameraXError cameraXError2 = th2;
                                    g2 = scc.g(cameraXError2.getCode(), cameraXError2.getMessage(), cameraXError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            break;
                        case 2:
                            h hVar3 = (h) ((List) obj2).get(0);
                            try {
                                sm7Var2.getClass();
                                hVar3.c();
                                g3 = Collections.singletonList(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof CameraXError) {
                                    CameraXError cameraXError3 = th3;
                                    g3 = scc.g(cameraXError3.getCode(), cameraXError3.getMessage(), cameraXError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            break;
                        default:
                            h hVar4 = (h) ((List) obj2).get(0);
                            try {
                                sm7Var2.getClass();
                                hVar4.close();
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof CameraXError) {
                                    CameraXError cameraXError4 = th4;
                                    g4 = scc.g(cameraXError4.getCode(), cameraXError4.getMessage(), cameraXError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            break;
                    }
                }
            });
        } else {
            m2vVar3.G(null);
        }
        m2v m2vVar4 = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.Recording.stop", j, obj);
        if (sm7Var == null) {
            m2vVar4.G(null);
        } else {
            final int i4 = 3;
            m2vVar4.G(new ee5() { // from class: vsb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    int i22 = i4;
                    sm7 sm7Var2 = sm7Var;
                    switch (i22) {
                        case 0:
                            h hVar = (h) ((List) obj2).get(0);
                            try {
                                sm7Var2.getClass();
                                hVar.close();
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                if (th instanceof CameraXError) {
                                    CameraXError cameraXError = th;
                                    g = scc.g(cameraXError.getCode(), cameraXError.getMessage(), cameraXError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            h hVar2 = (h) ((List) obj2).get(0);
                            try {
                                sm7Var2.getClass();
                                hVar2.a();
                                g2 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof CameraXError) {
                                    CameraXError cameraXError2 = th2;
                                    g2 = scc.g(cameraXError2.getCode(), cameraXError2.getMessage(), cameraXError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            break;
                        case 2:
                            h hVar3 = (h) ((List) obj2).get(0);
                            try {
                                sm7Var2.getClass();
                                hVar3.c();
                                g3 = Collections.singletonList(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof CameraXError) {
                                    CameraXError cameraXError3 = th3;
                                    g3 = scc.g(cameraXError3.getCode(), cameraXError3.getMessage(), cameraXError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            break;
                        default:
                            h hVar4 = (h) ((List) obj2).get(0);
                            try {
                                sm7Var2.getClass();
                                hVar4.close();
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof CameraXError) {
                                    CameraXError cameraXError4 = th4;
                                    g4 = scc.g(cameraXError4.getCode(), cameraXError4.getMessage(), cameraXError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            break;
                    }
                }
            });
        }
    }
}
