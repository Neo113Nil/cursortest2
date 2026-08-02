package ru.yandex.taxi.stories.data.caching;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import androidx.media3.database.StandaloneDatabaseProvider;
import com.yandex.go.image.domain.requests.g;
import defpackage.a9y;
import defpackage.b64;
import defpackage.bhe;
import defpackage.bvf0;
import defpackage.cvu0;
import defpackage.cvw;
import defpackage.dai0;
import defpackage.db7;
import defpackage.eb7;
import defpackage.eds0;
import defpackage.eou0;
import defpackage.fou0;
import defpackage.fuc;
import defpackage.gbv;
import defpackage.ike;
import defpackage.j63;
import defpackage.jl40;
import defpackage.l9h;
import defpackage.mdh;
import defpackage.npg;
import defpackage.ny61;
import defpackage.och;
import defpackage.pav;
import defpackage.qhw0;
import defpackage.rby;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.vby;
import defpackage.xby;
import defpackage.zy11;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.widget.d;

/* loaded from: classes10.dex */
public final class a {
    public final Context a;
    public final pav b;
    public final d c;
    public final fuc d;
    public final ike e;
    public final j63 f;
    public List g;
    public final eou0 h;
    public final eds0 i;
    public final ArrayList j;
    public final CopyOnWriteArrayList k;
    public final db7 l;

    public a(Context context, pav pavVar, d dVar, ru.yandex.taxi.communications.common.repository.a aVar, tt2 tt2Var, String str) {
        this.a = context;
        this.b = pavVar;
        this.c = dVar;
        this.d = aVar;
        qhw0 a = jl40.a();
        tt2Var.getClass();
        sjh sjhVar = uyj.a;
        this.e = bvf0.a(cvw.U(a, mdh.b).plus(new rby("Unexpected exception caught while caching stories", 1)));
        this.f = new j63(0);
        this.g = EmptyList.a;
        this.h = new eou0();
        this.j = new ArrayList();
        this.k = new CopyOnWriteArrayList();
        och ochVar = new och();
        ochVar.b = str;
        l9h l9hVar = new l9h(context, ochVar);
        eds0 eds0Var = new eds0(new File(context.getCacheDir(), "player_cache"), new a9y(52428800L), new StandaloneDatabaseProvider(context), false);
        this.i = eds0Var;
        db7 db7Var = new db7();
        db7Var.a = eds0Var;
        db7Var.y = l9hVar;
        db7Var.B = 1;
        this.l = db7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v8, types: [xby] */
    public static final Object a(a aVar, String str, SuspendLambda suspendLambda) {
        Bitmap frameAtTime;
        ?? r2;
        ?? r1;
        if (aVar.d(str).exists()) {
            Object f = aVar.f(str, suspendLambda);
            return f == CoroutineSingletons.COROUTINE_SUSPENDED ? f : zy11.a;
        }
        File file = new File(aVar.a.getFilesDir(), "story_temp_video_file.mp4");
        try {
            try {
                aVar.h(file, str);
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
                frameAtTime = mediaMetadataRetriever.getFrameAtTime(0L);
            } catch (Exception e) {
                if (!(e instanceof IOException)) {
                    throw new IOException(e);
                }
                if (!file.delete() && file.exists()) {
                    xby.d.j(new IllegalStateException("Failed to delete file: story_temp_video_file.mp4"));
                }
            }
            if (frameAtTime == null) {
                vby vbyVar = xby.d;
                vbyVar.getClass();
                boolean delete = file.delete();
                file = file;
                if (!delete) {
                    boolean exists = file.exists();
                    file = exists;
                    if (exists) {
                        r1 = new IllegalStateException("Failed to delete file: story_temp_video_file.mp4");
                        r2 = vbyVar;
                        r2.j(r1);
                        file = r1;
                    }
                }
                return aVar.f(str, suspendLambda);
            }
            aVar.g(frameAtTime, str);
            vby vbyVar2 = xby.d;
            vbyVar2.getClass();
            boolean delete2 = file.delete();
            file = file;
            if (!delete2) {
                boolean exists2 = file.exists();
                file = exists2;
                if (exists2) {
                    r1 = new IllegalStateException("Failed to delete file: story_temp_video_file.mp4");
                    r2 = vbyVar2;
                    r2.j(r1);
                    file = r1;
                }
            }
            return aVar.f(str, suspendLambda);
        } catch (Throwable th) {
            if (!file.delete() && file.exists()) {
                xby.d.j(new IllegalStateException("Failed to delete file: story_temp_video_file.mp4"));
            }
            throw th;
        }
    }

    public final void b(String str) {
        if (cvu0.x(str, "file://", false)) {
            xby.d.getClass();
            return;
        }
        tje.N(this.e, new rby("Error while caching video", 1), null, new StoryCaching$cache$1(this, str, null), 2);
    }

    public final void c(String str) {
        tje.N(this.e, new rby("Error while caching first frame", 1), null, new StoryCaching$cacheFirstFrameIfVideoCached$1(this, str, null), 2);
    }

    public final File d(String str) {
        return new File(new File(this.a.getFilesDir(), "stories_video_frames"), b64.j(dai0.A(str), ".png"));
    }

    public final boolean e(String str) {
        npg npgVar = new npg(Uri.parse(str));
        String buildCacheKey = this.h.buildCacheKey(npgVar);
        eds0 eds0Var = this.i;
        long a = bhe.a(eds0Var.getContentMetadata(buildCacheKey));
        long j = npgVar.g;
        if (j == -1 && a != -1) {
            j = a - npgVar.f;
        }
        return j == eds0Var.getCachedBytes(buildCacheKey, npgVar.f, a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|3e|(2:31|32)(2:33|(1:35)))|12|13|14))|49|6|7|(0)(0)|12|13|14|(1:(1:46))) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0031, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008e, code lost:
    
        defpackage.xby.d.k(r9, "Error preloading first frame");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0097, code lost:
    
        monitor-enter(r7.j);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0098, code lost:
    
        r7.j.remove(r8);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r7v10 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(String str, ContinuationImpl continuationImpl) {
        StoryCaching$preloadFirstFrame$1 storyCaching$preloadFirstFrame$1;
        int i;
        String str2;
        if (continuationImpl instanceof StoryCaching$preloadFirstFrame$1) {
            storyCaching$preloadFirstFrame$1 = (StoryCaching$preloadFirstFrame$1) continuationImpl;
            int i2 = storyCaching$preloadFirstFrame$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                storyCaching$preloadFirstFrame$1.label = i2 - Integer.MIN_VALUE;
                Object obj = storyCaching$preloadFirstFrame$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = storyCaching$preloadFirstFrame$1.label;
                if (i != 0) {
                    b.b(obj);
                    synchronized (this.j) {
                        if (!this.j.contains(str)) {
                            File d = d(str);
                            str2 = d.exists() ? d.getAbsolutePath() : null;
                            if (str2 != null) {
                                this.j.add(str);
                            }
                        }
                        str2 = null;
                    }
                    if (str2 == null) {
                        return zy11.a;
                    }
                    g gVar = (g) this.b.e();
                    gVar.b(new gbv(Uri.fromFile(new File(str2))));
                    storyCaching$preloadFirstFrame$1.L$0 = str;
                    storyCaching$preloadFirstFrame$1.L$1 = null;
                    storyCaching$preloadFirstFrame$1.label = 1;
                    Object a = gVar.a(storyCaching$preloadFirstFrame$1);
                    this = a;
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) storyCaching$preloadFirstFrame$1.L$0;
                    b.b(obj);
                    this = this;
                }
                return zy11.a;
            }
        }
        storyCaching$preloadFirstFrame$1 = new StoryCaching$preloadFirstFrame$1(this, continuationImpl);
        Object obj2 = storyCaching$preloadFirstFrame$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = storyCaching$preloadFirstFrame$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    public final void g(Bitmap bitmap, String str) {
        File file = new File(this.a.getFilesDir(), "stories_video_frames");
        if (!file.exists() && !file.mkdirs()) {
            ny61.r("Couldn't create images folder");
            return;
        }
        FileOutputStream fileOutputStream = new FileOutputStream(d(str));
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
        try {
            fileOutputStream.close();
        } catch (IOException e) {
            xby.d.k(e, "Error closing output stream");
        }
    }

    public final void h(File file, String str) {
        FileOutputStream fileOutputStream;
        int read;
        eb7 createDataSource = this.l.createDataSource();
        FileOutputStream fileOutputStream2 = null;
        try {
            createDataSource.open(new npg(Uri.parse(str)));
            fileOutputStream = new FileOutputStream(file);
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[4096];
            do {
                read = createDataSource.read(bArr, 0, 4096);
                if (read > 0) {
                    fileOutputStream.write(bArr, 0, read);
                }
            } while (read > 0);
            xby.d.getClass();
            try {
                createDataSource.close();
            } catch (IOException e) {
                xby.d.k(e, "Error closing data source");
            }
            try {
                fileOutputStream.close();
            } catch (IOException e2) {
                xby.d.k(e2, "Error closing stream");
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            try {
                createDataSource.close();
            } catch (IOException e3) {
                xby.d.k(e3, "Error closing data source");
            }
            if (fileOutputStream2 == null) {
                throw th;
            }
            try {
                fileOutputStream2.close();
                throw th;
            } catch (IOException e4) {
                xby.d.k(e4, "Error closing stream");
                throw th;
            }
        }
    }

    public final void i() {
        xby.d.getClass();
        kotlinx.coroutines.a.g(this.e.a, null);
    }

    public final void j() {
        this.k.add(new StoryCaching$subscribe$1(this));
        this.c.b.add(new fou0(this, 0));
    }

    public final void k() {
        this.k.remove(new StoryCaching$unsubscribe$1(this));
        this.c.b.remove(new fou0(this, 1));
    }

    public final void l() {
        tje.N(this.e, new rby("Error while updating cache info", 1), null, new StoryCaching$updateInfo$1(this, null), 2);
    }
}
