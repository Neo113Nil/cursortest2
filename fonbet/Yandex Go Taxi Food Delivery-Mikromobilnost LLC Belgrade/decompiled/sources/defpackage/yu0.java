package defpackage;

import android.content.Context;
import com.yandex.go.taxi.order.chat.data.b;
import com.yandex.mapkit.map.CameraPosition;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.MSCAPI.ProviderFeatures;
import ru.CryptoPro.JCSP.MSCAPI.cl_7;
import ru.yandex.taxi.banners.model.a;
import ru.yandex.taxi.banners.model.f;

/* loaded from: classes14.dex */
public final /* synthetic */ class yu0 implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yu0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        ProviderFeatures a;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return (lz40) ((p0) obj2).invoke(obj);
            case 1:
                return (ConcurrentHashMap) ((at3) obj2).invoke(obj);
            case 2:
                return (noh) ((a) obj2).invoke(obj);
            case 3:
                return (com.yandex.go.image.domain.requests.a) ((vz8) obj2).invoke(obj);
            case 4:
                return (String) ((jv8) obj2).invoke(obj);
            case 5:
                return ((k0a0) obj2).a((Context) obj);
            case 6:
                return (CameraPosition) ((wth) obj2).invoke((CameraPosition) obj);
            case 7:
                return (oim) ((zvi) obj2).invoke(obj);
            case 8:
                return (UUID) ((t8j) obj2).invoke(obj);
            case 9:
                return (l8x) ((f) obj2).invoke(obj);
            case 10:
                a = ((HProv) obj2).a((cl_7) obj);
                return a;
            case 11:
                return ((k200) obj2).invoke(obj);
            case 12:
                return (noh) ((com.yandex.go.taxi.order.cancel.v2.data.a) obj2).invoke(obj);
            case 13:
                return (Float) ((mn70) obj2).invoke(obj);
            case 14:
                return (Integer) ((mn70) obj2).invoke(obj);
            case 15:
                return (Integer) ((mn70) obj2).invoke(obj);
            case 16:
                return (List) ((fd60) obj2).invoke(obj);
            case 17:
                return (h5g) ((bd90) obj2).invoke(obj);
            case 18:
                return oe91.d(((fl8) obj2).e).a((Context) obj);
            case 19:
                return (Set) ((nqi0) obj2).invoke(obj);
            case 20:
                return (Set) ((nqi0) obj2).invoke(obj);
            case 21:
                return (pz40) ((iin0) obj2).invoke(obj);
            case 22:
                return (noh) ((ru.yandex.taxi.stories.data.repositories.items.a) obj2).invoke(obj);
            case 23:
                return (b6w0) ((lzu0) obj2).invoke(obj);
            case 24:
                return (b) ((lzu0) obj2).invoke(obj);
            case 25:
                return (g050) ((f0z0) obj2).invoke(obj);
            case 26:
                return (ru.yandex.taxi.messenger.unreadcount.a) ((dl01) obj2).invoke(obj);
            case 27:
                return (pz40) ((nit) obj2).invoke(obj);
            case 28:
                return (lz40) ((of11) obj2).invoke(obj);
            default:
                return (pz40) ((wx11) obj2).invoke(obj);
        }
    }
}
