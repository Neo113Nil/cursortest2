package ru.yandex.video.m3.offline;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Environment;
import defpackage.c2k;
import defpackage.ixn;
import defpackage.j73;
import defpackage.jl40;
import defpackage.qrq0;
import defpackage.s5r;
import defpackage.sls;
import defpackage.tcc;
import defpackage.tls;
import defpackage.yw01;
import defpackage.zy11;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.b;
import ru.yandex.video.m3.data.Offline;
import ru.yandex.video.m3.offline.DownloadDirectoryException;
import ru.yandex.video.m3.player.utils.FutureExtensions;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\b\b\u0007\u0018\u0000 )2\u00020\u0001:\u0003)*+B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010 R\u0018\u0010\"\u001a\u00060!R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00180$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0011\u0010'\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lru/yandex/video/m3/offline/DownloadDirectoryManager;", "", "Landroid/content/Context;", "context", "", "downloadSubPath", "Lru/yandex/video/m3/offline/DownloadStorage;", "downloadStorage", "Lru/yandex/video/m3/offline/DownloadDirectoryStorage;", "downloadDirectoryStorage", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lru/yandex/video/m3/offline/DownloadStorage;Lru/yandex/video/m3/offline/DownloadDirectoryStorage;)V", "Lzy11;", "onStorageStateChanged", "()V", "", "Lru/yandex/video/m3/offline/DownloadDirectory;", "getDownloadDirectories", "()Ljava/util/List;", "", "downloadToExternal", "Ljava/util/concurrent/Future;", "changeDownloadDirectory", "(Z)Ljava/util/concurrent/Future;", "Lru/yandex/video/m3/offline/DownloadDirectoryManager$DownloadDirectoryListener;", "listener", "registerListener", "(Lru/yandex/video/m3/offline/DownloadDirectoryManager$DownloadDirectoryListener;)V", "unregisterListener", "Landroid/content/Context;", "Ljava/lang/String;", "Lru/yandex/video/m3/offline/DownloadStorage;", "Lru/yandex/video/m3/offline/DownloadDirectoryStorage;", "Lru/yandex/video/m3/offline/DownloadDirectoryManager$ExternalStorageStateChangeReceiver;", "receiver", "Lru/yandex/video/m3/offline/DownloadDirectoryManager$ExternalStorageStateChangeReceiver;", "", "listeners", "Ljava/util/Set;", "isDownloadToExternal", "()Z", "Companion", "DownloadDirectoryListener", "ExternalStorageStateChangeReceiver", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DownloadDirectoryManager {
    private final Context context;
    private final DownloadDirectoryStorage downloadDirectoryStorage;
    private final DownloadStorage downloadStorage;
    private final String downloadSubPath;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private final ExternalStorageStateChangeReceiver receiver = new ExternalStorageStateChangeReceiver();
    private final Set<DownloadDirectoryListener> listeners = new LinkedHashSet();

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/offline/DownloadDirectoryManager$DownloadDirectoryListener;", "", "", "Lru/yandex/video/m3/offline/DownloadDirectory;", "downloadDirectories", "Lzy11;", "onChanged", "(Ljava/util/List;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface DownloadDirectoryListener {
        void onChanged(List<DownloadDirectory> downloadDirectories);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/yandex/video/m3/offline/DownloadDirectoryManager$ExternalStorageStateChangeReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "(Lru/yandex/video/m3/offline/DownloadDirectoryManager;)V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Lzy11;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class ExternalStorageStateChangeReceiver extends BroadcastReceiver {
        public ExternalStorageStateChangeReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            DownloadDirectoryManager.this.onStorageStateChanged();
        }
    }

    public DownloadDirectoryManager(Context context, String str, DownloadStorage downloadStorage, DownloadDirectoryStorage downloadDirectoryStorage) {
        this.context = context;
        this.downloadSubPath = str;
        this.downloadStorage = downloadStorage;
        this.downloadDirectoryStorage = downloadDirectoryStorage;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onStorageStateChanged() {
        Set N0;
        List<DownloadDirectory> downloadDirectories = getDownloadDirectories();
        synchronized (this) {
            N0 = kotlin.collections.a.N0(this.listeners);
        }
        Iterator it = N0.iterator();
        while (it.hasNext()) {
            ((DownloadDirectoryListener) it.next()).onChanged(downloadDirectories);
        }
    }

    public final Future<?> changeDownloadDirectory(final boolean downloadToExternal) {
        return FutureExtensions.future(new sls() { // from class: ru.yandex.video.m3.offline.DownloadDirectoryManager$changeDownloadDirectory$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m757invoke() {
                DownloadStorage downloadStorage;
                zy11 zy11Var;
                Object obj;
                DownloadDirectoryStorage downloadDirectoryStorage;
                DownloadDirectoryStorage downloadDirectoryStorage2;
                downloadStorage = DownloadDirectoryManager.this.downloadStorage;
                List<Offline.DownloadItem> list = downloadStorage.getAll().get();
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (Offline.DownloadItem downloadItem : list) {
                        if (downloadItem.getPercentDownloaded() > 0.0f && downloadItem.getPercentDownloaded() < 100.0f) {
                            throw new DownloadDirectoryException.StorageChangeAtDownloadingException();
                        }
                    }
                }
                List<DownloadDirectory> downloadDirectories = DownloadDirectoryManager.this.getDownloadDirectories();
                boolean z = downloadToExternal;
                Iterator<T> it = downloadDirectories.iterator();
                while (true) {
                    zy11Var = null;
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((DownloadDirectory) obj).getIsExternal() == z) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                DownloadDirectory downloadDirectory = (DownloadDirectory) obj;
                if (downloadDirectory != null) {
                    DownloadDirectoryManager downloadDirectoryManager = DownloadDirectoryManager.this;
                    boolean z2 = downloadToExternal;
                    downloadDirectoryStorage = downloadDirectoryManager.downloadDirectoryStorage;
                    downloadDirectoryStorage.setDownloadToExternal(z2);
                    downloadDirectoryStorage2 = downloadDirectoryManager.downloadDirectoryStorage;
                    downloadDirectoryStorage2.setActiveDownloadDirectory(downloadDirectory.getFile().getAbsolutePath());
                    zy11Var = zy11.a;
                }
                if (zy11Var == null) {
                    throw new DownloadDirectoryException.StorageMountedException();
                }
            }

            @Override // defpackage.sls
            public /* bridge */ /* synthetic */ Object invoke() {
                m757invoke();
                return zy11.a;
            }
        });
    }

    public final List<DownloadDirectory> getDownloadDirectories() {
        List list;
        String str;
        Object failure;
        Object obj;
        String activeDownloadDirectory = this.downloadDirectoryStorage.getActiveDownloadDirectory();
        c2k c2kVar = new c2k(new s5r(b.p(kotlin.sequences.a.e(new yw01(b.i(j73.v(this.context.getExternalFilesDirs(null))), new tls() { // from class: ru.yandex.video.m3.offline.DownloadDirectoryManager$getDownloadDirectories$availableDirectories$1
            {
                super(1);
            }

            @Override // defpackage.tls
            public final File invoke(File file) {
                String str2;
                str2 = DownloadDirectoryManager.this.downloadSubPath;
                return new File(file, str2);
            }
        }), new sls() { // from class: ru.yandex.video.m3.offline.DownloadDirectoryManager$getDownloadDirectories$availableDirectories$2
            {
                super(0);
            }

            @Override // defpackage.sls
            public final qrq0 invoke() {
                Context context;
                String str2;
                context = DownloadDirectoryManager.this.context;
                File filesDir = context.getFilesDir();
                str2 = DownloadDirectoryManager.this.downloadSubPath;
                return j73.v(new File[]{new File(filesDir, str2)});
            }
        }), activeDownloadDirectory != null ? j73.v(new File[]{new File(activeDownloadDirectory)}) : ixn.a)), new tls() { // from class: ru.yandex.video.m3.offline.DownloadDirectoryManager$getDownloadDirectories$availableDirectories$4
            @Override // defpackage.tls
            public final String invoke(File file) {
                return file.getAbsolutePath();
            }
        });
        if (c2kVar.hasNext()) {
            Object next = c2kVar.next();
            if (c2kVar.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (c2kVar.hasNext()) {
                    arrayList.add(c2kVar.next());
                }
                list = arrayList;
            } else {
                list = Collections.singletonList(next);
            }
        } else {
            list = EmptyList.a;
        }
        if (activeDownloadDirectory == null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((File) obj).exists()) {
                    break;
                }
            }
            File file = (File) obj;
            str = file != null ? file.getAbsolutePath() : null;
            if (str == null) {
                str = ((File) kotlin.collections.a.P(list)).getAbsolutePath();
            }
        } else {
            str = activeDownloadDirectory;
        }
        List<File> list2 = list;
        ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
        for (File file2 : list2) {
            boolean l = jl40.l(file2.getAbsolutePath(), str);
            try {
                failure = Boolean.valueOf(Companion.isExternalStorageRemovable(file2));
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Object obj2 = Boolean.FALSE;
            if (failure instanceof Result.Failure) {
                failure = obj2;
            }
            arrayList2.add(DownloadDirectoryKt.DownloadDirectory$default(l, ((Boolean) failure).booleanValue(), file2.exists() || jl40.l(file2.getAbsolutePath(), activeDownloadDirectory), file2, null, 16, null));
        }
        return arrayList2;
    }

    public final boolean isDownloadToExternal() {
        return this.downloadDirectoryStorage.isDownloadToExternal();
    }

    public final synchronized void registerListener(DownloadDirectoryListener listener) {
        this.listeners.add(listener);
        if (this.listeners.size() == 1) {
            Context context = this.context;
            ExternalStorageStateChangeReceiver externalStorageStateChangeReceiver = this.receiver;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.MEDIA_REMOVED");
            intentFilter.addAction("android.intent.action.MEDIA_EJECT");
            intentFilter.addAction("android.intent.action.MEDIA_MOUNTED");
            intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTED");
            context.registerReceiver(externalStorageStateChangeReceiver, intentFilter);
        }
    }

    public final synchronized void unregisterListener(DownloadDirectoryListener listener) {
        this.listeners.remove(listener);
        if (this.listeners.isEmpty()) {
            this.context.unregisterReceiver(this.receiver);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/video/m3/offline/DownloadDirectoryManager$Companion;", "", "()V", "isExternalStorageRemovable", "", "Ljava/io/File;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isExternalStorageRemovable(File file) {
            return Environment.isExternalStorageRemovable(file);
        }

        private Companion() {
        }
    }
}
