package coil3.memory;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.opengl.GLES20;
import android.os.SystemClock;
import android.util.Log;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.core.impl.CameraCaptureMetaData$AeState;
import androidx.camera.core.impl.CameraCaptureMetaData$AfState;
import androidx.camera.core.impl.CameraCaptureMetaData$AwbState;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.TagBundle;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.input.pointer.util.VelocityTracker1D;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.Image;
import com.fillr.e0;
import com.google.android.gms.auth.api.zbc;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.internal.measurement.zzhr;
import com.google.android.gms.internal.measurement.zzhs;
import com.google.android.gms.measurement.internal.zzat;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzpk;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.auth.zzd;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.net.zzn;
import com.google.android.libraries.places.api.net.zzo;
import com.google.android.libraries.places.internal.zzatp;
import com.google.android.libraries.places.internal.zzatw;
import com.google.android.libraries.places.internal.zzauh;
import com.google.android.libraries.places.internal.zzauj;
import com.google.android.libraries.places.internal.zzavb;
import com.google.android.libraries.places.internal.zzavc;
import com.google.android.libraries.places.internal.zzex;
import com.google.android.libraries.places.internal.zzey;
import com.google.android.libraries.places.internal.zzfa;
import com.google.android.libraries.places.internal.zzgb;
import com.google.android.libraries.places.internal.zzmq;
import com.google.android.libraries.places.internal.zznq;
import com.google.android.libraries.places.internal.zzns;
import com.google.android.play.core.splitcompat.zzb;
import com.google.common.collect.RegularImmutableMap;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.squareup.cash.beacondetection.real.BeaconThrottler$1;
import com.squareup.cash.fileupload.api.FileError;
import com.squareup.cash.fileupload.api.FileMetadata;
import com.squareup.cash.fileupload.api.FileValidator$Result;
import com.squareup.cash.fileupload.real.RealAndroidFileParser;
import com.squareup.cash.fileupload.real.RealFileValidator$validate$1;
import com.squareup.cash.graphics.swampgl.components.Entity;
import com.squareup.cash.graphics.swampgl.components.Material;
import com.squareup.cash.history.presenters.CheckStatusPresenter;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.text.Regex;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes3.dex */
public final class RealStrongMemoryCache implements CameraCaptureResult, Continuation {
    public Object cache;
    public long initialMaxSize;
    public final Object weakMemoryCache;

    public final class InternalValue {
        public final Map extras;
        public final Image image;
        public final long size;

        public InternalValue(Image image, Map map, long j) {
            this.image = image;
            this.extras = map;
            this.size = j;
        }
    }

    public RealStrongMemoryCache(int i) {
        switch (i) {
            case 7:
                BeaconThrottler$1 beaconThrottler$1 = BeaconThrottler$1.INSTANCE;
                this.initialMaxSize = 300000L;
                this.weakMemoryCache = beaconThrottler$1;
                this.cache = new ConcurrentHashMap();
                break;
            case 8:
            default:
                VelocityTracker1D.Strategy strategy = VelocityTracker1D.Strategy.Lsq2;
                this.weakMemoryCache = new VelocityTracker1D();
                this.cache = new VelocityTracker1D();
                break;
            case 9:
                this.weakMemoryCache = new LinkedHashMap();
                this.cache = new LinkedHashMap();
                break;
        }
    }

    public static int compileShader(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        OptionalProvider$$ExternalSyntheticLambda0.m$1(CameraSelector$$ExternalSyntheticOutline0.m("Failed to compile ", i == 35633 ? "vertex" : BreadcrumbHelper.Category.FRAGMENT, " shader: ", glGetShaderInfoLog));
        return 0;
    }

    public static void zzl(File file) {
        File[] listFiles;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                zzl(file2);
            }
        }
        if (!file.exists() || file.delete()) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$4(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failed to delete '", file.getAbsolutePath(), "'"));
    }

    public static File zzq(File file, String str) {
        File file2 = new File(file, str);
        if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
            return file2;
        }
        a$$ExternalSyntheticBUOutline0.m$3("split ID cannot be placed in target directory");
        return null;
    }

    public static void zzu(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                return;
            }
            a$$ExternalSyntheticBUOutline0.m$3("File input must be directory when it exists.");
        } else {
            file.mkdirs();
            if (file.isDirectory()) {
                return;
            }
            a$$ExternalSyntheticBUOutline0.m$4("Unable to create directory: ".concat(String.valueOf(file.getAbsolutePath())));
        }
    }

    /* renamed from: addPosition-Uv8p0NA, reason: not valid java name */
    public void m1456addPositionUv8p0NA(long j, long j2) {
        ((VelocityTracker1D) this.weakMemoryCache).addDataPoint(j, Float.intBitsToFloat((int) (j2 >> 32)));
        ((VelocityTracker1D) this.cache).addDataPoint(j, Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax)));
    }

    public void clear() {
        ((ConcurrentHashMap) this.cache).clear();
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public CameraCaptureMetaData$AeState getAeState() {
        CameraCaptureResult cameraCaptureResult = (CameraCaptureResult) this.weakMemoryCache;
        return cameraCaptureResult != null ? cameraCaptureResult.getAeState() : CameraCaptureMetaData$AeState.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public CameraCaptureMetaData$AfState getAfState() {
        CameraCaptureResult cameraCaptureResult = (CameraCaptureResult) this.weakMemoryCache;
        return cameraCaptureResult != null ? cameraCaptureResult.getAfState() : CameraCaptureMetaData$AfState.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public CameraCaptureMetaData$AwbState getAwbState() {
        CameraCaptureResult cameraCaptureResult = (CameraCaptureResult) this.weakMemoryCache;
        return cameraCaptureResult != null ? cameraCaptureResult.getAwbState() : CameraCaptureMetaData$AwbState.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public int getFlashState() {
        CameraCaptureResult cameraCaptureResult = (CameraCaptureResult) this.weakMemoryCache;
        if (cameraCaptureResult != null) {
            return cameraCaptureResult.getFlashState();
        }
        return 1;
    }

    public int getOrCompileShader(Entity entity) {
        entity.getClass();
        Material.ProgramSource programSource = entity.material.getProgramSource();
        int hashCode = programSource.hashCode();
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.weakMemoryCache;
        Integer num = (Integer) linkedHashMap.get(Integer.valueOf(hashCode));
        if (num != null) {
            return num.intValue();
        }
        Timber.Forest forest = Timber.Forest;
        forest.tag("ShaderManager");
        forest.d("Shader cache miss, compiling...", new Object[0]);
        long currentTimeMillis = System.currentTimeMillis();
        int compileShader = compileShader(35633, programSource.vertexShader);
        int compileShader2 = compileShader(35632, programSource.fragmentShader);
        int glCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(glCreateProgram, compileShader);
        GLES20.glAttachShader(glCreateProgram, compileShader2);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 0) {
            String glGetProgramInfoLog = GLES20.glGetProgramInfoLog(glCreateProgram);
            GLES20.glDeleteProgram(glCreateProgram);
            OptionalProvider$$ExternalSyntheticLambda0.m$1(Recorder$$ExternalSyntheticOutline2.m("Failed to link shader program: ", glGetProgramInfoLog));
            return 0;
        }
        GLES20.glDeleteShader(compileShader);
        GLES20.glDeleteShader(compileShader2);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        this.initialMaxSize += currentTimeMillis2;
        forest.tag("ShaderManager");
        StringBuilder sb = new StringBuilder("Compiled shader in ");
        sb.append(currentTimeMillis2);
        forest.d(re$$ExternalSyntheticOutline0.m(glCreateProgram, "ms (program=", ")", sb), new Object[0]);
        linkedHashMap.put(Integer.valueOf(hashCode), Integer.valueOf(glCreateProgram));
        return glCreateProgram;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public TagBundle getTagBundle() {
        return (TagBundle) this.cache;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public long getTimestamp() {
        CameraCaptureResult cameraCaptureResult = (CameraCaptureResult) this.weakMemoryCache;
        if (cameraCaptureResult != null) {
            return cameraCaptureResult.getTimestamp();
        }
        long j = this.initialMaxSize;
        if (j != -1) {
            return j;
        }
        a$$ExternalSyntheticBUOutline0.m$1("No timestamp is available.");
        return 0L;
    }

    public void onNewText() {
        ((AtomicLong) this.weakMemoryCache).compareAndSet(0L, SystemClock.elapsedRealtime() - this.initialMaxSize);
        ((RealStrongMemoryCache) this.cache).onNewText();
    }

    public void set(MemoryCache$Key memoryCache$Key, Image image, Map map, long j) {
        RealStrongMemoryCache$cache$1 realStrongMemoryCache$cache$1 = (RealStrongMemoryCache$cache$1) this.cache;
        long j2 = realStrongMemoryCache$cache$1.maxSize;
        LinkedHashMap linkedHashMap = (LinkedHashMap) realStrongMemoryCache$cache$1.map;
        if (j > j2) {
            Object remove = linkedHashMap.remove(memoryCache$Key);
            if (remove != null) {
                realStrongMemoryCache$cache$1.size = realStrongMemoryCache$cache$1.getSize() - realStrongMemoryCache$cache$1.safeSizeOf(memoryCache$Key, remove);
                realStrongMemoryCache$cache$1.entryRemoved(memoryCache$Key, remove, null);
            }
            ((RealWeakMemoryCache) this.weakMemoryCache).set(memoryCache$Key, image, map, j);
            return;
        }
        InternalValue internalValue = new InternalValue(image, map, j);
        Object put = linkedHashMap.put(memoryCache$Key, internalValue);
        realStrongMemoryCache$cache$1.size = realStrongMemoryCache$cache$1.safeSizeOf(memoryCache$Key, internalValue) + realStrongMemoryCache$cache$1.getSize();
        if (put != null) {
            realStrongMemoryCache$cache$1.size = realStrongMemoryCache$cache$1.getSize() - realStrongMemoryCache$cache$1.safeSizeOf(memoryCache$Key, put);
            realStrongMemoryCache$cache$1.entryRemoved(memoryCache$Key, put, internalValue);
        }
        realStrongMemoryCache$cache$1.trimToSize(realStrongMemoryCache$cache$1.maxSize);
    }

    public boolean shouldLog(int i, int i2) {
        long j = i2 | (i << 16);
        long longValue = ((Number) ((Function0) this.weakMemoryCache).invoke()).longValue();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.cache;
        Long l = (Long) concurrentHashMap.get(Long.valueOf(j));
        if (l != null && longValue - l.longValue() < this.initialMaxSize) {
            return false;
        }
        concurrentHashMap.put(Long.valueOf(j), Long.valueOf(longValue));
        return true;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        e0 e0Var = (e0) this.weakMemoryCache;
        zzn zznVar = (zzn) this.cache;
        long j = this.initialMaxSize;
        zbc zbcVar = (zbc) e0Var.i;
        ((zzfa) ((zzex) e0Var.f)).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i = true == task.isSuccessful() ? 2 : 1;
        zzauh zza$1 = zzauj.zza$1();
        zzavb zza = zzavc.zza();
        List list = zznVar.zza;
        RegularImmutableMap regularImmutableMap = zzmq.zza;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) zzmq.zza.get((Place.Field) it.next());
            if (str != null) {
                arrayList.add(str);
            }
        }
        zza.zzy();
        ((zzavc) zza.zza).zzc(arrayList);
        zzavc zzavcVar = (zzavc) zza.zzD();
        zza$1.zzy();
        ((zzauj) zza$1.zza).zzd(zzavcVar);
        zza$1.zzy();
        ((zzauj) zza$1.zza).zzc((int) (elapsedRealtime - j));
        zza$1.zzy();
        ((zzauj) zza$1.zza).zzf$1(i);
        zzauj zzaujVar = (zzauj) zza$1.zzD();
        zzatp zzb = zzey.zzb((zznq) zbcVar.zbb, 2, zzns.zzc, zzd.zza);
        zzb.zzp$2(6);
        zzb.zzy();
        ((zzatw) zzb.zza).zzf(zzaujVar);
        zzb.zzj(Places.zza.zze());
        ((zbc) zbcVar.zba).zzb(zzb);
        "FindCurrentPlace".concat("Duration");
        "FindCurrentPlace".concat("Battery");
        return (zzo) task.getResult();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: validate-8YU3vEA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m1457validate8YU3vEA(String str, ContinuationImpl continuationImpl) {
        RealFileValidator$validate$1 realFileValidator$validate$1;
        int i;
        FileMetadata fileMetadata;
        String str2 = (String) this.cache;
        if (continuationImpl instanceof RealFileValidator$validate$1) {
            realFileValidator$validate$1 = (RealFileValidator$validate$1) continuationImpl;
            int i2 = realFileValidator$validate$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realFileValidator$validate$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realFileValidator$validate$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realFileValidator$validate$1.label;
                kotlin.coroutines.Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealAndroidFileParser realAndroidFileParser = (RealAndroidFileParser) this.weakMemoryCache;
                    realFileValidator$validate$1.label = 1;
                    DefaultScheduler defaultScheduler = Dispatchers.Default;
                    obj = JobKt.withContext(DefaultIoScheduler.INSTANCE, new CheckStatusPresenter.AnonymousClass1.C00611(str, realAndroidFileParser, continuation, 10), realFileValidator$validate$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                fileMetadata = (FileMetadata) obj;
                new Regex(str2).matches(fileMetadata.mimeType);
                if (new Regex(str2).matches(fileMetadata.mimeType)) {
                    return new FileValidator$Result.Failure(FileError.UNSUPPORTED_FILE_TYPE, fileMetadata);
                }
                Long l = fileMetadata.byteCount;
                return (l != null ? l.longValue() : -1L) > this.initialMaxSize ? new FileValidator$Result.Failure(FileError.FILE_TOO_LARGE, fileMetadata) : new FileValidator$Result.Success(fileMetadata);
            }
        }
        realFileValidator$validate$1 = new RealFileValidator$validate$1(this, continuationImpl);
        Object obj2 = realFileValidator$validate$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realFileValidator$validate$1.label;
        kotlin.coroutines.Continuation continuation2 = null;
        if (i != 0) {
        }
        fileMetadata = (FileMetadata) obj2;
        new Regex(str2).matches(fileMetadata.mimeType);
        if (new Regex(str2).matches(fileMetadata.mimeType)) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    public List zza() {
        ArrayList arrayList;
        zzaw zzawVar = (zzaw) this.cache;
        ArrayList arrayList2 = new ArrayList();
        String str = (String) this.weakMemoryCache;
        Cursor cursor = null;
        try {
            try {
                cursor = zzawVar.zze().query("raw_events", new String[]{"rowid", "name", "timestamp", "metadata_fingerprint", "data", "realtime", "elapsed_time"}, "app_id = ? and rowid > ?", new String[]{str, String.valueOf(this.initialMaxSize)}, null, null, "rowid", "1000");
                if (cursor.moveToFirst()) {
                    do {
                        long j = cursor.getLong(0);
                        long j2 = cursor.getLong(3);
                        boolean z = cursor.getLong(5) == 1;
                        long j3 = cursor.getLong(6);
                        byte[] blob = cursor.getBlob(4);
                        if (j > this.initialMaxSize) {
                            this.initialMaxSize = j;
                        }
                        try {
                            zzhr zzhrVar = (zzhr) zzpk.zzw(zzhs.zzp(), blob);
                            String string2 = cursor.getString(1);
                            if (string2 == null) {
                                string2 = "";
                            }
                            zzhrVar.zzl(string2);
                            zzhrVar.zzo(cursor.getLong(2));
                            zzhrVar.zzw(j3);
                            arrayList2.add(new zzat(j, j2, z, (zzhs) zzhrVar.zzbd()));
                        } catch (IOException e) {
                            zzgu zzguVar = ((zzic) zzawVar.$$delegate_0).zzi;
                            zzic.zzP(zzguVar);
                            zzguVar.zzd.zzc("Data loss. Failed to merge raw event. appId", zzgu.zzl(str), e);
                        }
                    } while (cursor.moveToNext());
                } else {
                    arrayList = Collections.EMPTY_LIST;
                }
            } catch (SQLiteException e2) {
                zzgu zzguVar2 = ((zzic) zzawVar.$$delegate_0).zzi;
                zzic.zzP(zzguVar2);
                zzguVar2.zzd.zzc("Data loss. Error querying raw events batch. appId", zzgu.zzl(str), e2);
                arrayList = arrayList2;
            }
            return arrayList;
        } finally {
            if (0 != 0) {
                cursor.close();
            }
        }
    }

    public HashSet zzj() {
        File file = new File(zzw(), "verified-splits");
        zzu(file);
        HashSet hashSet = new HashSet();
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isFile() && file2.getName().endsWith(".apk") && !file2.canWrite()) {
                    hashSet.add(new zzb(file2, file2.getName().substring(0, r4.length() - 4)));
                }
            }
        }
        return hashSet;
    }

    public void zzk() {
        long j = this.initialMaxSize;
        File zzv = zzv();
        String[] list = zzv.list();
        if (list != null) {
            for (String str : list) {
                if (!str.equals(Long.toString(j))) {
                    File file = new File(zzv, str);
                    StringBuilder m = re$$ExternalSyntheticOutline0.m("FileStorage: removing directory for different version code (directory = ", file.toString(), ", current version code = ", j);
                    m.append(")");
                    Log.d("SplitCompat", m.toString());
                    zzl(file);
                }
            }
        }
    }

    public File zzv() {
        if (((File) this.cache) == null) {
            Context context = (Context) this.weakMemoryCache;
            if (context == null) {
                a$$ExternalSyntheticBUOutline0.m$1("context must be non-null to populate null filesDir");
                return null;
            }
            this.cache = context.getFilesDir();
        }
        File file = new File((File) this.cache, "splitcompat");
        zzu(file);
        return file;
    }

    public File zzw() {
        File file = new File(zzv(), Long.toString(this.initialMaxSize));
        zzu(file);
        return file;
    }

    public /* synthetic */ RealStrongMemoryCache(AtomicLong atomicLong, long j, RealStrongMemoryCache realStrongMemoryCache) {
        this.weakMemoryCache = atomicLong;
        this.initialMaxSize = j;
        this.cache = realStrongMemoryCache;
    }

    public RealStrongMemoryCache(Context context) {
        this.weakMemoryCache = context;
        this.initialMaxSize = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
    }

    public RealStrongMemoryCache(zzaw zzawVar, String str) {
        this.cache = zzawVar;
        zzae.checkNotEmpty(str);
        this.weakMemoryCache = str;
        this.initialMaxSize = -1L;
    }

    public RealStrongMemoryCache(zzaw zzawVar, String str, long j) {
        this.cache = zzawVar;
        zzae.checkNotEmpty(str);
        this.weakMemoryCache = str;
        this.initialMaxSize = zzawVar.zzaB("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[]{str, String.valueOf(j)}, -1L);
    }

    public RealStrongMemoryCache(RealAndroidFileParser realAndroidFileParser, long j, String str) {
        str.getClass();
        this.weakMemoryCache = realAndroidFileParser;
        this.initialMaxSize = j;
        this.cache = str;
    }

    public RealStrongMemoryCache(long j, RealWeakMemoryCache realWeakMemoryCache) {
        this.initialMaxSize = j;
        this.weakMemoryCache = realWeakMemoryCache;
        RealStrongMemoryCache$cache$1 realStrongMemoryCache$cache$1 = new RealStrongMemoryCache$cache$1();
        realStrongMemoryCache$cache$1.this$0 = this;
        realStrongMemoryCache$cache$1.map = new LinkedHashMap(0, 0.75f, true);
        realStrongMemoryCache$cache$1.maxSize = j;
        if (j > 0) {
            this.cache = realStrongMemoryCache$cache$1;
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("maxSize <= 0");
            throw null;
        }
    }

    public /* synthetic */ RealStrongMemoryCache(e0 e0Var, zzn zznVar, long j, zzgb zzgbVar) {
        this.weakMemoryCache = e0Var;
        this.cache = zznVar;
        this.initialMaxSize = j;
    }

    public RealStrongMemoryCache(CameraCaptureResult cameraCaptureResult, TagBundle tagBundle, long j) {
        this.weakMemoryCache = cameraCaptureResult;
        this.cache = tagBundle;
        this.initialMaxSize = j;
    }
}
