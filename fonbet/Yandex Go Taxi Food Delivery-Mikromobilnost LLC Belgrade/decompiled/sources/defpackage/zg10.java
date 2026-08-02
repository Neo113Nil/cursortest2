package defpackage;

import com.yandex.messaging.core.net.entities.BackendConfig;
import com.yandex.messaging.internal.backendconfig.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes15.dex */
public final class zg10 {
    public final s320 a;
    public final a b;
    public final i3y c = kotlin.a.a(new xyz(18, this));

    public zg10(s320 s320Var, a aVar) {
        this.a = s320Var;
        this.b = aVar;
    }

    public final boolean a(j3b j3bVar, String str, int i) {
        BackendConfig.SourceExtensions sourceExtensions;
        Set<String> extensions;
        if (!((Boolean) this.c.getValue()).booleanValue() || !okb1.b(j3bVar).j()) {
            return false;
        }
        BackendConfig.DocViewerConfig docViewer = this.b.a().getDocViewer();
        if (!xf4.b(docViewer.getRestrictions(), j3bVar) || (sourceExtensions = docViewer.getSupportedFilesBySource().get(String.valueOf(i))) == null || (extensions = sourceExtensions.getExtensions()) == null) {
            return false;
        }
        Set<String> set = extensions;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            if (cvu0.t((String) it.next(), str, true)) {
                return true;
            }
        }
        return false;
    }

    public final boolean b(j3b j3bVar, String str, int i) {
        BackendConfig.SourceExtensions sourceExtensions;
        Set<String> extensions;
        if (!((Boolean) this.c.getValue()).booleanValue() || !okb1.b(j3bVar).j()) {
            return false;
        }
        BackendConfig.VideoPlayerConfig videoPlayer = this.b.a().getVideoPlayer();
        if (!xf4.b(videoPlayer.getRestrictions(), j3bVar) || (sourceExtensions = videoPlayer.getSupportedFilesBySource().get(String.valueOf(i))) == null || (extensions = sourceExtensions.getExtensions()) == null) {
            return false;
        }
        Set<String> set = extensions;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            if (cvu0.t((String) it.next(), str, true)) {
                return true;
            }
        }
        return false;
    }

    public final boolean c(j3b j3bVar, String str, Integer num) {
        boolean z;
        Set<String> extensions;
        if (j3bVar != null && str != null && num != null) {
            BackendConfig.FilePreviewsConfig filePreviews = this.b.a().getFilePreviews();
            if (xf4.b(filePreviews.getRestrictions(), j3bVar)) {
                boolean z2 = a(j3bVar, str, num.intValue()) || b(j3bVar, str, num.intValue());
                BackendConfig.SourceExtensions sourceExtensions = filePreviews.getSupportedFilesBySource().get(num.toString());
                if (sourceExtensions != null && (extensions = sourceExtensions.getExtensions()) != null) {
                    Set<String> set = extensions;
                    if (!(set instanceof Collection) || !set.isEmpty()) {
                        Iterator<T> it = set.iterator();
                        while (it.hasNext()) {
                            if (cvu0.t((String) it.next(), str, true)) {
                                z = true;
                                break;
                            }
                        }
                    }
                }
                z = false;
                if (z2 && z) {
                    return true;
                }
            }
        }
        return false;
    }
}
