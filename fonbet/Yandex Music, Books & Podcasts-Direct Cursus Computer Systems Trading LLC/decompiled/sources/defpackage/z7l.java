package defpackage;

import android.content.res.AssetFileDescriptor;
import android.graphics.Path;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class z7l implements b8l, y7e, mbq, mau {
    public final /* synthetic */ int a;

    public /* synthetic */ z7l(int i) {
        this.a = i;
    }

    public static final yj0 e(int i, String str) {
        WeakHashMap weakHashMap = rqv.w;
        return new yj0(i, str);
    }

    public static final wwt g(int i, String str) {
        WeakHashMap weakHashMap = rqv.w;
        return new wwt(new ioe(0, 0, 0, 0), str);
    }

    public static rqv h(hq5 hq5Var) {
        rqv rqvVar;
        oq5 oq5Var = (oq5) hq5Var;
        View view = (View) oq5Var.j(AndroidCompositionLocals_androidKt.f);
        WeakHashMap weakHashMap = rqv.w;
        synchronized (weakHashMap) {
            try {
                Object obj = weakHashMap.get(view);
                if (obj == null) {
                    obj = new rqv(view);
                    weakHashMap.put(view, obj);
                }
                rqvVar = (rqv) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        boolean h = oq5Var.h(rqvVar) | oq5Var.h(view);
        Object K = oq5Var.K();
        if (h || K == gq5.a) {
            K = new qqv(0, rqvVar, view);
            oq5Var.k0(K);
        }
        gld.k(rqvVar, (Function1) K, oq5Var);
        return rqvVar;
    }

    public static Path i(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        return path;
    }

    @Override // defpackage.mbq
    public pjc a(wor worVar) {
        return new eno(new v0r(worVar, null, 7));
    }

    @Override // defpackage.mau
    public void c(MediaExtractor mediaExtractor, Object obj) {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
        mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }

    @Override // defpackage.mau
    public void d(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
        mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }

    @Override // defpackage.y7e
    public Object f(Map map) {
        return new vz7((Map) map.get("device"));
    }

    public String toString() {
        switch (this.a) {
            case 4:
                return "SharingStarted.Lazily";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.b8l
    public void b(Throwable th) {
    }
}
