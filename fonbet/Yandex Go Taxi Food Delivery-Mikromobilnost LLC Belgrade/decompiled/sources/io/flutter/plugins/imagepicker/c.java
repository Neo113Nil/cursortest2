package io.flutter.plugins.imagepicker;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.core.content.FileProvider;
import defpackage.a40;
import defpackage.abe;
import defpackage.lx10;
import defpackage.m501;
import defpackage.ny61;
import defpackage.nzc0;
import defpackage.ol3;
import defpackage.ozc0;
import defpackage.qx10;
import defpackage.xcv;
import io.flutter.plugins.imagepicker.Messages;
import io.flutter.plugins.imagepicker.b;
import io.flutter.plugins.imagepicker.c;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes4.dex */
public final class c implements nzc0, ozc0 {
    public final ExecutorService A;
    public ImagePickerDelegate$CameraDevice B;
    public Uri C;
    public b D;
    public final Object E;
    public final String a;
    public final Activity b;
    public final abe c;
    public final a w;
    public final ol3 x;
    public final a40 y;
    public final m501 z;

    public c(Activity activity, abe abeVar, a aVar) {
        ol3 ol3Var = new ol3(activity);
        a40 a40Var = new a40(activity);
        m501 m501Var = new m501(25);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.E = new Object();
        this.b = activity;
        this.c = abeVar;
        this.a = activity.getPackageName() + ".flutter.image_provider";
        this.x = ol3Var;
        this.y = a40Var;
        this.z = m501Var;
        this.w = aVar;
        this.A = newSingleThreadExecutor;
    }

    public static void a(qx10 qx10Var) {
        qx10Var.g(new Messages.FlutterError("already_active", "Image picker is already active"));
    }

    public final void b(String str, String str2) {
        qx10 qx10Var;
        synchronized (this.E) {
            try {
                b bVar = this.D;
                qx10Var = bVar != null ? bVar.c : null;
                this.D = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (qx10Var == null) {
            this.w.a(str, str2, null);
        } else {
            qx10Var.g(new Messages.FlutterError(str, str2));
        }
    }

    public final void c(ArrayList arrayList) {
        qx10 qx10Var;
        synchronized (this.E) {
            try {
                b bVar = this.D;
                qx10Var = bVar != null ? bVar.c : null;
                this.D = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (qx10Var == null) {
            this.w.a(null, null, arrayList);
        } else {
            qx10Var.c(arrayList);
        }
    }

    public final void d(String str) {
        qx10 qx10Var;
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            arrayList.add(str);
        }
        synchronized (this.E) {
            try {
                b bVar = this.D;
                qx10Var = bVar != null ? bVar.c : null;
                this.D = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (qx10Var != null) {
            qx10Var.c(arrayList);
        } else {
            if (arrayList.isEmpty()) {
                return;
            }
            this.w.a(null, null, arrayList);
        }
    }

    public final ArrayList e(Intent intent, boolean z) {
        ArrayList arrayList = new ArrayList();
        Uri data = intent.getData();
        m501 m501Var = this.z;
        Activity activity = this.b;
        if (data != null) {
            m501Var.getClass();
            String B = m501.B(activity, data);
            if (B != null) {
                arrayList.add(new xcv(B, null));
                return arrayList;
            }
        } else if (intent.getClipData() != null) {
            for (int i = 0; i < intent.getClipData().getItemCount(); i++) {
                Uri uri = intent.getClipData().getItemAt(i).getUri();
                if (uri != null) {
                    m501Var.getClass();
                    String B2 = m501.B(activity, uri);
                    if (B2 != null) {
                        arrayList.add(new xcv(B2, z ? activity.getContentResolver().getType(uri) : null));
                    }
                }
            }
            return arrayList;
        }
        return null;
    }

    public final void f(Intent intent, Uri uri) {
        List<ResolveInfo> queryIntentActivities;
        PackageManager.ResolveInfoFlags of;
        Activity activity = this.b;
        PackageManager packageManager = activity.getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            of = PackageManager.ResolveInfoFlags.of(PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH);
            queryIntentActivities = packageManager.queryIntentActivities(intent, of);
        } else {
            queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        }
        Iterator<ResolveInfo> it = queryIntentActivities.iterator();
        while (it.hasNext()) {
            activity.grantUriPermission(it.next().activityInfo.packageName, uri, 3);
        }
    }

    public final void g(ArrayList arrayList) {
        lx10 lx10Var;
        synchronized (this.E) {
            try {
                b bVar = this.D;
                lx10Var = bVar != null ? bVar.a : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        if (lx10Var == null) {
            while (i < arrayList.size()) {
                arrayList2.add(((xcv) arrayList.get(i)).a);
                i++;
            }
            c(arrayList2);
            return;
        }
        while (i < arrayList.size()) {
            xcv xcvVar = (xcv) arrayList.get(i);
            String str = xcvVar.a;
            String str2 = xcvVar.b;
            if (str2 == null || !str2.startsWith("video/")) {
                str = this.c.i(xcvVar.a, lx10Var.a, lx10Var.b, lx10Var.c.intValue());
            }
            arrayList2.add(str);
            i++;
        }
        c(arrayList2);
    }

    public final void h() {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        if (this.B == ImagePickerDelegate$CameraDevice.FRONT) {
            intent.putExtra("android.intent.extras.CAMERA_FACING", 0);
            intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
        }
        String uuid = UUID.randomUUID().toString();
        Activity activity = this.b;
        File cacheDir = activity.getCacheDir();
        try {
            cacheDir.mkdirs();
            File createTempFile = File.createTempFile(uuid, ".jpg", cacheDir);
            this.C = Uri.parse("file:" + createTempFile.getAbsolutePath());
            Uri uriForFile = FileProvider.getUriForFile(this.y.a, this.a, createTempFile);
            intent.putExtra("output", uriForFile);
            f(intent, uriForFile);
            try {
                try {
                    activity.startActivityForResult(intent, 2343);
                } catch (SecurityException unused) {
                    b("no_available_camera", "No cameras available for taking pictures.");
                }
            } catch (ActivityNotFoundException unused2) {
                createTempFile.delete();
                b("no_available_camera", "No cameras available for taking pictures.");
            }
        } catch (IOException e) {
            ny61.j(e);
        }
    }

    public final void i() {
        Messages.a aVar;
        Long l;
        Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
        synchronized (this.E) {
            try {
                b bVar = this.D;
                aVar = bVar != null ? bVar.b : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar != null && (l = aVar.a) != null) {
            intent.putExtra("android.intent.extra.durationLimit", l.intValue());
        }
        if (this.B == ImagePickerDelegate$CameraDevice.FRONT) {
            intent.putExtra("android.intent.extras.CAMERA_FACING", 0);
            intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
        }
        String uuid = UUID.randomUUID().toString();
        File cacheDir = this.b.getCacheDir();
        try {
            cacheDir.mkdirs();
            File createTempFile = File.createTempFile(uuid, ".mp4", cacheDir);
            this.C = Uri.parse("file:" + createTempFile.getAbsolutePath());
            Uri uriForFile = FileProvider.getUriForFile(this.y.a, this.a, createTempFile);
            intent.putExtra("output", uriForFile);
            f(intent, uriForFile);
            try {
                try {
                    this.b.startActivityForResult(intent, 2353);
                } catch (SecurityException unused) {
                    b("no_available_camera", "No cameras available for taking pictures.");
                }
            } catch (ActivityNotFoundException unused2) {
                createTempFile.delete();
                b("no_available_camera", "No cameras available for taking pictures.");
            }
        } catch (IOException e) {
            ny61.j(e);
        }
    }

    public final boolean j() {
        PackageInfo packageInfo;
        PackageManager.PackageInfoFlags of;
        ol3 ol3Var = this.x;
        if (ol3Var == null) {
            return false;
        }
        Activity activity = ol3Var.a;
        try {
            PackageManager packageManager = activity.getPackageManager();
            if (Build.VERSION.SDK_INT >= 33) {
                String packageName = activity.getPackageName();
                of = PackageManager.PackageInfoFlags.of(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
                packageInfo = packageManager.getPackageInfo(packageName, of);
            } else {
                packageInfo = packageManager.getPackageInfo(activity.getPackageName(), 4096);
            }
            return Arrays.asList(packageInfo.requestedPermissions).contains("android.permission.CAMERA");
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public final boolean k(lx10 lx10Var, Messages.a aVar, qx10 qx10Var) {
        synchronized (this.E) {
            try {
                if (this.D != null) {
                    return false;
                }
                this.D = new b(lx10Var, aVar, qx10Var);
                this.w.a.getSharedPreferences("flutter_image_picker_shared_preference", 0).edit().clear().apply();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.nzc0
    public final boolean onActivityResult(int i, final int i2, final Intent intent) {
        Runnable runnable;
        if (i == 2342) {
            final int i3 = 0;
            runnable = new Runnable(this) { // from class: ucv
                public final /* synthetic */ c b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i4 = i3;
                    Intent intent2 = intent;
                    int i5 = i2;
                    c cVar = this.b;
                    switch (i4) {
                        case 0:
                            if (i5 == -1 && intent2 != null) {
                                ArrayList e = cVar.e(intent2, false);
                                if (e != null) {
                                    cVar.g(e);
                                    break;
                                } else {
                                    cVar.b("no_valid_image_uri", "Cannot find the selected image.");
                                    break;
                                }
                            } else {
                                cVar.d(null);
                                break;
                            }
                        case 1:
                            if (i5 == -1 && intent2 != null) {
                                ArrayList e2 = cVar.e(intent2, false);
                                if (e2 != null) {
                                    cVar.g(e2);
                                    break;
                                } else {
                                    cVar.b("missing_valid_image_uri", "Cannot find at least one of the selected images.");
                                    break;
                                }
                            } else {
                                cVar.d(null);
                                break;
                            }
                        case 2:
                            if (i5 == -1 && intent2 != null) {
                                ArrayList e3 = cVar.e(intent2, false);
                                if (e3 != null) {
                                    cVar.g(e3);
                                    break;
                                } else {
                                    cVar.b("missing_valid_video_uri", "Cannot find at least one of the selected videos.");
                                    break;
                                }
                            } else {
                                cVar.d(null);
                                break;
                            }
                        case 3:
                            if (i5 == -1 && intent2 != null) {
                                ArrayList e4 = cVar.e(intent2, true);
                                if (e4 != null) {
                                    cVar.g(e4);
                                    break;
                                } else {
                                    cVar.b("no_valid_media_uri", "Cannot find the selected media.");
                                    break;
                                }
                            } else {
                                cVar.d(null);
                                break;
                            }
                        default:
                            if (i5 == -1 && intent2 != null) {
                                ArrayList e5 = cVar.e(intent2, false);
                                if (e5 != null && e5.size() >= 1) {
                                    cVar.d(((xcv) e5.get(0)).a);
                                    break;
                                } else {
                                    cVar.b("no_valid_video_uri", "Cannot find the selected video.");
                                    break;
                                }
                            } else {
                                cVar.d(null);
                                break;
                            }
                            break;
                    }
                }
            };
        } else if (i == 2343) {
            final int i4 = 0;
            runnable = new Runnable(this) { // from class: vcv
                public final /* synthetic */ c b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i5 = i4;
                    int i6 = i2;
                    c cVar = this.b;
                    int i7 = 0;
                    switch (i5) {
                        case 0:
                            if (i6 != -1) {
                                cVar.d(null);
                                break;
                            } else {
                                Uri uri = cVar.C;
                                a40 a40Var = cVar.y;
                                if (uri == null) {
                                    uri = Uri.parse(cVar.w.a.getSharedPreferences("flutter_image_picker_shared_preference", 0).getString("flutter_image_picker_pending_image_uri", ""));
                                }
                                final tcv tcvVar = new tcv(cVar, 1);
                                MediaScannerConnection.scanFile(a40Var.a, new String[]{uri != null ? uri.getPath() : ""}, null, new MediaScannerConnection.OnScanCompletedListener() { // from class: wcv
                                    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                                    public final void onScanCompleted(String str, Uri uri2) {
                                        lx10 lx10Var;
                                        tcv tcvVar2 = tcv.this;
                                        int i8 = tcvVar2.a;
                                        c cVar2 = tcvVar2.b;
                                        switch (i8) {
                                            case 0:
                                                cVar2.d(str);
                                                return;
                                            default:
                                                synchronized (cVar2.E) {
                                                    try {
                                                        b bVar = cVar2.D;
                                                        lx10Var = bVar != null ? bVar.a : null;
                                                    } catch (Throwable th) {
                                                        throw th;
                                                    }
                                                }
                                                if (lx10Var == null) {
                                                    cVar2.d(str);
                                                    return;
                                                }
                                                String i9 = cVar2.c.i(str, lx10Var.a, lx10Var.b, lx10Var.c.intValue());
                                                if (i9 != null && !i9.equals(str)) {
                                                    new File(str).delete();
                                                }
                                                cVar2.d(i9);
                                                return;
                                        }
                                    }
                                });
                                break;
                            }
                        default:
                            if (i6 != -1) {
                                cVar.d(null);
                                break;
                            } else {
                                Uri uri2 = cVar.C;
                                a40 a40Var2 = cVar.y;
                                if (uri2 == null) {
                                    uri2 = Uri.parse(cVar.w.a.getSharedPreferences("flutter_image_picker_shared_preference", 0).getString("flutter_image_picker_pending_image_uri", ""));
                                }
                                final tcv tcvVar2 = new tcv(cVar, i7);
                                MediaScannerConnection.scanFile(a40Var2.a, new String[]{uri2 != null ? uri2.getPath() : ""}, null, new MediaScannerConnection.OnScanCompletedListener() { // from class: wcv
                                    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                                    public final void onScanCompleted(String str, Uri uri22) {
                                        lx10 lx10Var;
                                        tcv tcvVar22 = tcv.this;
                                        int i8 = tcvVar22.a;
                                        c cVar2 = tcvVar22.b;
                                        switch (i8) {
                                            case 0:
                                                cVar2.d(str);
                                                return;
                                            default:
                                                synchronized (cVar2.E) {
                                                    try {
                                                        b bVar = cVar2.D;
                                                        lx10Var = bVar != null ? bVar.a : null;
                                                    } catch (Throwable th) {
                                                        throw th;
                                                    }
                                                }
                                                if (lx10Var == null) {
                                                    cVar2.d(str);
                                                    return;
                                                }
                                                String i9 = cVar2.c.i(str, lx10Var.a, lx10Var.b, lx10Var.c.intValue());
                                                if (i9 != null && !i9.equals(str)) {
                                                    new File(str).delete();
                                                }
                                                cVar2.d(i9);
                                                return;
                                        }
                                    }
                                });
                                break;
                            }
                    }
                }
            };
        } else if (i == 2352) {
            final int i5 = 4;
            runnable = new Runnable(this) { // from class: ucv
                public final /* synthetic */ c b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i42 = i5;
                    Intent intent2 = intent;
                    int i52 = i2;
                    c cVar = this.b;
                    switch (i42) {
                        case 0:
                            if (i52 == -1 && intent2 != null) {
                                ArrayList e = cVar.e(intent2, false);
                                if (e != null) {
                                    cVar.g(e);
                                    break;
                                } else {
                                    cVar.b("no_valid_image_uri", "Cannot find the selected image.");
                                    break;
                                }
                            } else {
                                cVar.d(null);
                                break;
                            }
                        case 1:
                            if (i52 == -1 && intent2 != null) {
                                ArrayList e2 = cVar.e(intent2, false);
                                if (e2 != null) {
                                    cVar.g(e2);
                                    break;
                                } else {
                                    cVar.b("missing_valid_image_uri", "Cannot find at least one of the selected images.");
                                    break;
                                }
                            } else {
                                cVar.d(null);
                                break;
                            }
                        case 2:
                            if (i52 == -1 && intent2 != null) {
                                ArrayList e3 = cVar.e(intent2, false);
                                if (e3 != null) {
                                    cVar.g(e3);
                                    break;
                                } else {
                                    cVar.b("missing_valid_video_uri", "Cannot find at least one of the selected videos.");
                                    break;
                                }
                            } else {
                                cVar.d(null);
                                break;
                            }
                        case 3:
                            if (i52 == -1 && intent2 != null) {
                                ArrayList e4 = cVar.e(intent2, true);
                                if (e4 != null) {
                                    cVar.g(e4);
                                    break;
                                } else {
                                    cVar.b("no_valid_media_uri", "Cannot find the selected media.");
                                    break;
                                }
                            } else {
                                cVar.d(null);
                                break;
                            }
                        default:
                            if (i52 == -1 && intent2 != null) {
                                ArrayList e5 = cVar.e(intent2, false);
                                if (e5 != null && e5.size() >= 1) {
                                    cVar.d(((xcv) e5.get(0)).a);
                                    break;
                                } else {
                                    cVar.b("no_valid_video_uri", "Cannot find the selected video.");
                                    break;
                                }
                            } else {
                                cVar.d(null);
                                break;
                            }
                            break;
                    }
                }
            };
        } else if (i != 2353) {
            switch (i) {
                case 2346:
                    final int i6 = 1;
                    runnable = new Runnable(this) { // from class: ucv
                        public final /* synthetic */ c b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i42 = i6;
                            Intent intent2 = intent;
                            int i52 = i2;
                            c cVar = this.b;
                            switch (i42) {
                                case 0:
                                    if (i52 == -1 && intent2 != null) {
                                        ArrayList e = cVar.e(intent2, false);
                                        if (e != null) {
                                            cVar.g(e);
                                            break;
                                        } else {
                                            cVar.b("no_valid_image_uri", "Cannot find the selected image.");
                                            break;
                                        }
                                    } else {
                                        cVar.d(null);
                                        break;
                                    }
                                case 1:
                                    if (i52 == -1 && intent2 != null) {
                                        ArrayList e2 = cVar.e(intent2, false);
                                        if (e2 != null) {
                                            cVar.g(e2);
                                            break;
                                        } else {
                                            cVar.b("missing_valid_image_uri", "Cannot find at least one of the selected images.");
                                            break;
                                        }
                                    } else {
                                        cVar.d(null);
                                        break;
                                    }
                                case 2:
                                    if (i52 == -1 && intent2 != null) {
                                        ArrayList e3 = cVar.e(intent2, false);
                                        if (e3 != null) {
                                            cVar.g(e3);
                                            break;
                                        } else {
                                            cVar.b("missing_valid_video_uri", "Cannot find at least one of the selected videos.");
                                            break;
                                        }
                                    } else {
                                        cVar.d(null);
                                        break;
                                    }
                                case 3:
                                    if (i52 == -1 && intent2 != null) {
                                        ArrayList e4 = cVar.e(intent2, true);
                                        if (e4 != null) {
                                            cVar.g(e4);
                                            break;
                                        } else {
                                            cVar.b("no_valid_media_uri", "Cannot find the selected media.");
                                            break;
                                        }
                                    } else {
                                        cVar.d(null);
                                        break;
                                    }
                                default:
                                    if (i52 == -1 && intent2 != null) {
                                        ArrayList e5 = cVar.e(intent2, false);
                                        if (e5 != null && e5.size() >= 1) {
                                            cVar.d(((xcv) e5.get(0)).a);
                                            break;
                                        } else {
                                            cVar.b("no_valid_video_uri", "Cannot find the selected video.");
                                            break;
                                        }
                                    } else {
                                        cVar.d(null);
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    break;
                case 2347:
                    final int i7 = 3;
                    runnable = new Runnable(this) { // from class: ucv
                        public final /* synthetic */ c b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i42 = i7;
                            Intent intent2 = intent;
                            int i52 = i2;
                            c cVar = this.b;
                            switch (i42) {
                                case 0:
                                    if (i52 == -1 && intent2 != null) {
                                        ArrayList e = cVar.e(intent2, false);
                                        if (e != null) {
                                            cVar.g(e);
                                            break;
                                        } else {
                                            cVar.b("no_valid_image_uri", "Cannot find the selected image.");
                                            break;
                                        }
                                    } else {
                                        cVar.d(null);
                                        break;
                                    }
                                case 1:
                                    if (i52 == -1 && intent2 != null) {
                                        ArrayList e2 = cVar.e(intent2, false);
                                        if (e2 != null) {
                                            cVar.g(e2);
                                            break;
                                        } else {
                                            cVar.b("missing_valid_image_uri", "Cannot find at least one of the selected images.");
                                            break;
                                        }
                                    } else {
                                        cVar.d(null);
                                        break;
                                    }
                                case 2:
                                    if (i52 == -1 && intent2 != null) {
                                        ArrayList e3 = cVar.e(intent2, false);
                                        if (e3 != null) {
                                            cVar.g(e3);
                                            break;
                                        } else {
                                            cVar.b("missing_valid_video_uri", "Cannot find at least one of the selected videos.");
                                            break;
                                        }
                                    } else {
                                        cVar.d(null);
                                        break;
                                    }
                                case 3:
                                    if (i52 == -1 && intent2 != null) {
                                        ArrayList e4 = cVar.e(intent2, true);
                                        if (e4 != null) {
                                            cVar.g(e4);
                                            break;
                                        } else {
                                            cVar.b("no_valid_media_uri", "Cannot find the selected media.");
                                            break;
                                        }
                                    } else {
                                        cVar.d(null);
                                        break;
                                    }
                                default:
                                    if (i52 == -1 && intent2 != null) {
                                        ArrayList e5 = cVar.e(intent2, false);
                                        if (e5 != null && e5.size() >= 1) {
                                            cVar.d(((xcv) e5.get(0)).a);
                                            break;
                                        } else {
                                            cVar.b("no_valid_video_uri", "Cannot find the selected video.");
                                            break;
                                        }
                                    } else {
                                        cVar.d(null);
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    break;
                case 2348:
                    final int i8 = 2;
                    runnable = new Runnable(this) { // from class: ucv
                        public final /* synthetic */ c b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i42 = i8;
                            Intent intent2 = intent;
                            int i52 = i2;
                            c cVar = this.b;
                            switch (i42) {
                                case 0:
                                    if (i52 == -1 && intent2 != null) {
                                        ArrayList e = cVar.e(intent2, false);
                                        if (e != null) {
                                            cVar.g(e);
                                            break;
                                        } else {
                                            cVar.b("no_valid_image_uri", "Cannot find the selected image.");
                                            break;
                                        }
                                    } else {
                                        cVar.d(null);
                                        break;
                                    }
                                case 1:
                                    if (i52 == -1 && intent2 != null) {
                                        ArrayList e2 = cVar.e(intent2, false);
                                        if (e2 != null) {
                                            cVar.g(e2);
                                            break;
                                        } else {
                                            cVar.b("missing_valid_image_uri", "Cannot find at least one of the selected images.");
                                            break;
                                        }
                                    } else {
                                        cVar.d(null);
                                        break;
                                    }
                                case 2:
                                    if (i52 == -1 && intent2 != null) {
                                        ArrayList e3 = cVar.e(intent2, false);
                                        if (e3 != null) {
                                            cVar.g(e3);
                                            break;
                                        } else {
                                            cVar.b("missing_valid_video_uri", "Cannot find at least one of the selected videos.");
                                            break;
                                        }
                                    } else {
                                        cVar.d(null);
                                        break;
                                    }
                                case 3:
                                    if (i52 == -1 && intent2 != null) {
                                        ArrayList e4 = cVar.e(intent2, true);
                                        if (e4 != null) {
                                            cVar.g(e4);
                                            break;
                                        } else {
                                            cVar.b("no_valid_media_uri", "Cannot find the selected media.");
                                            break;
                                        }
                                    } else {
                                        cVar.d(null);
                                        break;
                                    }
                                default:
                                    if (i52 == -1 && intent2 != null) {
                                        ArrayList e5 = cVar.e(intent2, false);
                                        if (e5 != null && e5.size() >= 1) {
                                            cVar.d(((xcv) e5.get(0)).a);
                                            break;
                                        } else {
                                            cVar.b("no_valid_video_uri", "Cannot find the selected video.");
                                            break;
                                        }
                                    } else {
                                        cVar.d(null);
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    break;
                default:
                    return false;
            }
        } else {
            final int i9 = 1;
            runnable = new Runnable(this) { // from class: vcv
                public final /* synthetic */ c b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i52 = i9;
                    int i62 = i2;
                    c cVar = this.b;
                    int i72 = 0;
                    switch (i52) {
                        case 0:
                            if (i62 != -1) {
                                cVar.d(null);
                                break;
                            } else {
                                Uri uri = cVar.C;
                                a40 a40Var = cVar.y;
                                if (uri == null) {
                                    uri = Uri.parse(cVar.w.a.getSharedPreferences("flutter_image_picker_shared_preference", 0).getString("flutter_image_picker_pending_image_uri", ""));
                                }
                                final tcv tcvVar = new tcv(cVar, 1);
                                MediaScannerConnection.scanFile(a40Var.a, new String[]{uri != null ? uri.getPath() : ""}, null, new MediaScannerConnection.OnScanCompletedListener() { // from class: wcv
                                    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                                    public final void onScanCompleted(String str, Uri uri22) {
                                        lx10 lx10Var;
                                        tcv tcvVar22 = tcv.this;
                                        int i82 = tcvVar22.a;
                                        c cVar2 = tcvVar22.b;
                                        switch (i82) {
                                            case 0:
                                                cVar2.d(str);
                                                return;
                                            default:
                                                synchronized (cVar2.E) {
                                                    try {
                                                        b bVar = cVar2.D;
                                                        lx10Var = bVar != null ? bVar.a : null;
                                                    } catch (Throwable th) {
                                                        throw th;
                                                    }
                                                }
                                                if (lx10Var == null) {
                                                    cVar2.d(str);
                                                    return;
                                                }
                                                String i92 = cVar2.c.i(str, lx10Var.a, lx10Var.b, lx10Var.c.intValue());
                                                if (i92 != null && !i92.equals(str)) {
                                                    new File(str).delete();
                                                }
                                                cVar2.d(i92);
                                                return;
                                        }
                                    }
                                });
                                break;
                            }
                        default:
                            if (i62 != -1) {
                                cVar.d(null);
                                break;
                            } else {
                                Uri uri2 = cVar.C;
                                a40 a40Var2 = cVar.y;
                                if (uri2 == null) {
                                    uri2 = Uri.parse(cVar.w.a.getSharedPreferences("flutter_image_picker_shared_preference", 0).getString("flutter_image_picker_pending_image_uri", ""));
                                }
                                final tcv tcvVar2 = new tcv(cVar, i72);
                                MediaScannerConnection.scanFile(a40Var2.a, new String[]{uri2 != null ? uri2.getPath() : ""}, null, new MediaScannerConnection.OnScanCompletedListener() { // from class: wcv
                                    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                                    public final void onScanCompleted(String str, Uri uri22) {
                                        lx10 lx10Var;
                                        tcv tcvVar22 = tcv.this;
                                        int i82 = tcvVar22.a;
                                        c cVar2 = tcvVar22.b;
                                        switch (i82) {
                                            case 0:
                                                cVar2.d(str);
                                                return;
                                            default:
                                                synchronized (cVar2.E) {
                                                    try {
                                                        b bVar = cVar2.D;
                                                        lx10Var = bVar != null ? bVar.a : null;
                                                    } catch (Throwable th) {
                                                        throw th;
                                                    }
                                                }
                                                if (lx10Var == null) {
                                                    cVar2.d(str);
                                                    return;
                                                }
                                                String i92 = cVar2.c.i(str, lx10Var.a, lx10Var.b, lx10Var.c.intValue());
                                                if (i92 != null && !i92.equals(str)) {
                                                    new File(str).delete();
                                                }
                                                cVar2.d(i92);
                                                return;
                                        }
                                    }
                                });
                                break;
                            }
                    }
                }
            };
        }
        this.A.execute(runnable);
        return true;
    }

    @Override // defpackage.ozc0
    public final boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        boolean z = iArr.length > 0 && iArr[0] == 0;
        if (i != 2345) {
            if (i != 2355) {
                return false;
            }
            if (z) {
                i();
            }
        } else if (z) {
            h();
        }
        if (!z && (i == 2345 || i == 2355)) {
            b("camera_access_denied", "The user did not allow camera access.");
        }
        return true;
    }
}
