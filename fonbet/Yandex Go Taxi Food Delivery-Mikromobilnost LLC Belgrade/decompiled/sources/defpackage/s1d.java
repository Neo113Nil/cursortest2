package defpackage;

import android.net.Uri;
import androidx.compose.runtime.internal.a;
import com.yandex.go.image.api.domain.models.ImageLoadPriority;

/* loaded from: classes.dex */
public final /* synthetic */ class s1d implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ s1d(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.w = obj2;
        this.b = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        String queryParameter;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.b;
        Object obj3 = this.w;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((a) obj4).e(obj3, (fid) obj, vng.O(i2) | 1);
                break;
            case 1:
                ((Integer) obj2).intValue();
                sb2.b((vvf0) obj4, (wls) obj3, (fid) obj, vng.O(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                sb2.c((vvf0[]) obj4, (wls) obj3, (fid) obj, vng.O(i2 | 1));
                break;
            case 3:
                Uri uri = (Uri) obj;
                ltk ltkVar = new ltk((btk) obj4);
                g16 d = ((mtk) obj3).a.b().i((tbv) obj2).d(i2 != -1 ? i2 != 0 ? ImageLoadPriority.NORMAL : ImageLoadPriority.IMMEDIATE : ImageLoadPriority.NORMAL);
                boolean isOpaque = uri.isOpaque();
                if (!isOpaque) {
                    if (isOpaque) {
                        w511.b();
                        break;
                    } else {
                        queryParameter = uri.getQueryParameter("cache_type");
                    }
                } else {
                    queryParameter = null;
                }
                break;
            case 4:
                ((Integer) obj2).getClass();
                vqy0.a((ety0) obj4, (wls) obj3, (fid) obj, vng.O(i2 | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                ((zx01) obj4).a(obj3, (fid) obj, vng.O(i2 | 1));
                break;
        }
        return zy11Var;
    }
}
