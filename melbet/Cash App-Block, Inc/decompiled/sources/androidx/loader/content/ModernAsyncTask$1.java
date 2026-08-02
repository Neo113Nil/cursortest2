package androidx.loader.content;

import android.os.Binder;
import android.os.Process;
import com.bumptech.glide.disklrucache.DiskLruCache;
import com.google.android.gms.common.internal.LibraryVersion;
import com.google.android.gms.internal.measurement.zzk;
import com.google.android.gms.internal.mlkit_common.zzsh;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwp;
import com.google.android.gms.internal.mlkit_vision_common.zzmj;
import com.google.android.gms.internal.mlkit_vision_face.zzoc;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuc;
import com.google.android.gms.measurement.internal.zzbh;
import com.google.android.gms.measurement.internal.zzgz;
import com.google.android.gms.measurement.internal.zzht;
import com.google.android.gms.measurement.internal.zzjd;
import com.google.android.gms.measurement.internal.zzpg;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class ModernAsyncTask$1 implements Callable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object this$0;

    public ModernAsyncTask$1(zzjd zzjdVar, zzbh zzbhVar, String str) {
        this.$r8$classId = 9;
        this.this$0 = zzjdVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$r8$classId) {
            case 0:
                AsyncTaskLoader$LoadTask asyncTaskLoader$LoadTask = (AsyncTaskLoader$LoadTask) this.this$0;
                asyncTaskLoader$LoadTask.mTaskInvoked.set(true);
                try {
                    Process.setThreadPriority(10);
                    asyncTaskLoader$LoadTask.doInBackground();
                    Binder.flushPendingCommands();
                    return null;
                } finally {
                }
            case 1:
                ((Runnable) this.this$0).run();
                return null;
            case 2:
                synchronized (((DiskLruCache) this.this$0)) {
                    try {
                        DiskLruCache diskLruCache = (DiskLruCache) this.this$0;
                        if (diskLruCache.journalWriter != null) {
                            diskLruCache.trimToSize();
                            if (((DiskLruCache) this.this$0).journalRebuildRequired()) {
                                ((DiskLruCache) this.this$0).rebuildJournal();
                                ((DiskLruCache) this.this$0).redundantOpCount = 0;
                            }
                        }
                    } finally {
                    }
                }
                return null;
            case 3:
                return LibraryVersion.zzb.getVersion(((zzsh) this.this$0).zzi);
            case 4:
                return LibraryVersion.zzb.getVersion(((zzwp) this.this$0).zzi);
            case 5:
                return LibraryVersion.zzb.getVersion(((zzmj) this.this$0).zzi);
            case 6:
                return LibraryVersion.zzb.getVersion(((zzoc) this.this$0).zzi);
            case 7:
                return LibraryVersion.zzb.getVersion(((zzuc) this.this$0).zzi);
            case 8:
                return new zzk(((zzht) this.this$0).zzf);
            case 9:
                zzjd zzjdVar = (zzjd) this.this$0;
                zzjdVar.zza.zzaa$1();
                zzgz zzgzVar = zzjdVar.zza.zzj;
                zzpg.zzaT(zzgzVar);
                zzgzVar.zzg();
                throw new IllegalStateException("Unexpected call on client side");
            default:
                synchronized (((com.jakewharton.disklrucache.DiskLruCache) this.this$0)) {
                    try {
                        com.jakewharton.disklrucache.DiskLruCache diskLruCache2 = (com.jakewharton.disklrucache.DiskLruCache) this.this$0;
                        if (diskLruCache2.journalWriter != null) {
                            diskLruCache2.trimToSize();
                            if (((com.jakewharton.disklrucache.DiskLruCache) this.this$0).journalRebuildRequired()) {
                                ((com.jakewharton.disklrucache.DiskLruCache) this.this$0).rebuildJournal();
                                ((com.jakewharton.disklrucache.DiskLruCache) this.this$0).redundantOpCount = 0;
                            }
                        }
                    } finally {
                    }
                }
                return null;
        }
    }

    public /* synthetic */ ModernAsyncTask$1(Object obj, int i) {
        this.$r8$classId = i;
        this.this$0 = obj;
    }
}
