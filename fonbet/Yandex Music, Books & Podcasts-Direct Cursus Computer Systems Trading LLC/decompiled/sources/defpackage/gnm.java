package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.preload_manager.PreloadException;

/* loaded from: classes6.dex */
public final class gnm extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ nnm s;
    public final /* synthetic */ PreloadException t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gnm(nnm nnmVar, PreloadException preloadException, int i) {
        super(1);
        this.r = i;
        this.s = nnmVar;
        this.t = preloadException;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                xbu xbuVar = (xbu) obj;
                xbuVar.getClass();
                VideoData videoData = this.s.a;
                videoData.getClass();
                PreloadException preloadException = this.t;
                preloadException.getClass();
                imh imhVar = ((wbu) videoData).a;
                xbuVar.c.H("VideoPreloadManager", "onCancel", "preload " + imhVar.d + " ex=" + preloadException, new Object[0]);
                ecg ecgVar = xbuVar.i;
                if (ecgVar != null) {
                    ecgVar.d(imhVar);
                }
                break;
            default:
                xbu xbuVar2 = (xbu) obj;
                xbuVar2.getClass();
                VideoData videoData2 = this.s.a;
                videoData2.getClass();
                PreloadException preloadException2 = this.t;
                preloadException2.getClass();
                imh imhVar2 = ((wbu) videoData2).a;
                xbuVar2.c.M("VideoPreloadManager", "onError", "preload " + imhVar2.d, preloadException2, new Object[0]);
                ecg ecgVar2 = xbuVar2.i;
                if (ecgVar2 != null) {
                    ecgVar2.e(imhVar2);
                }
                String str = imhVar2.d;
                if (str != null) {
                    rp7 rp7Var = xbuVar2.g;
                    if (xz0.u(rp7.b, rp7.A(0, preloadException2))) {
                        xiu xiuVar = (xiu) rp7Var.a;
                        ((p1d) xiuVar.b).a.remove(str);
                        ((ConcurrentHashMap) xiuVar.c).remove(str);
                    }
                }
                break;
        }
        return Unit.a;
    }
}
