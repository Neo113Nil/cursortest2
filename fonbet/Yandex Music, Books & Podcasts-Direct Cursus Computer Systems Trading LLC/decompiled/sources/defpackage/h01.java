package defpackage;

import com.yandex.music.shared.player.download2.balancer.RebalancedException;
import com.yandex.music.shared.utils.ThrowablesKt;
import com.yandex.pulse.metrics.o;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.novelties.podcasts.catalog.data.dto.AlbumChartEntityDto;
import ru.yandex.music.novelties.podcasts.catalog.data.dto.CategoryPodcastsEntityDto;
import ru.yandex.music.novelties.podcasts.catalog.data.dto.MenuItemEntityAliasDto;
import ru.yandex.music.novelties.podcasts.catalog.data.dto.PromotionPodcastsEntityDto;
import ru.yandex.music.novelties.podcasts.catalog.data.dto.StationEntityDto;
import ru.yandex.music.novelties.podcasts.catalog.data.dto.TrackChartEntityDto;

/* loaded from: classes3.dex */
public final class h01 implements Function1 {
    public final /* synthetic */ int a;
    public static final h01 b = new h01(0);
    public static final h01 c = new h01(1);
    public static final h01 d = new h01(2);
    public static final h01 e = new h01(3);
    public static final h01 f = new h01(4);
    public static final h01 g = new h01(5);
    public static final h01 h = new h01(6);
    public static final h01 i = new h01(7);
    public static final h01 j = new h01(8);
    public static final h01 k = new h01(9);
    public static final h01 l = new h01(10);
    public static final h01 m = new h01(11);
    public static final h01 n = new h01(12);
    public static final h01 o = new h01(13);
    public static final h01 p = new h01(14);
    public static final h01 q = new h01(15);
    public static final h01 r = new h01(16);
    public static final h01 s = new h01(17);
    public static final h01 t = new h01(18);
    public static final h01 u = new h01(19);
    public static final h01 v = new h01(20);
    public static final h01 w = new h01(21);
    public static final h01 x = new h01(22);
    public static final h01 y = new h01(23);
    public static final h01 z = new h01(24);
    public static final h01 A = new h01(25);
    public static final h01 B = new h01(26);
    public static final h01 C = new h01(27);
    public static final h01 D = new h01(28);
    public static final h01 E = new h01(29);

    public /* synthetic */ h01(int i2) {
        this.a = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2;
        switch (this.a) {
            case 0:
                p85 b0 = pd.b0(jf0.g0(((d85) obj).a, Float.valueOf(0.1f), 0.0f, 6));
                int i2 = d85.o;
                long z2 = mvt.z(b0.a, yhn.c(b0.b, 0.0f, 0.3f), b0.c, 0.0f, 24);
                return y9w.U(new Pair[]{new Pair(Float.valueOf(0.0f), new d85(d85.b(z2, 0.0f, 0.0f, 0.0f, 0.0f, 14))), new Pair(Float.valueOf(0.6f), new d85(d85.b(z2, 0.5f, 0.0f, 0.0f, 0.0f, 14))), new Pair(Float.valueOf(0.8f), new d85(d85.b(z2, 0.75f, 0.0f, 0.0f, 0.0f, 14))), new Pair(Float.valueOf(1.0f), new d85(d85.b(z2, 1.0f, 0.0f, 0.0f, 0.0f, 14)))}, 14);
            case 1:
                float[] fArr = new float[3];
                aa5.h(c3x.U(((d85) obj).a), fArr);
                float f2 = fArr[1];
                fArr[1] = f2 <= 0.3f ? f2 : 0.3f;
                fArr[2] = 0.1f;
                long f3 = c3x.f(aa5.a(fArr));
                return y9w.U(new Pair[]{new Pair(Float.valueOf(0.0f), new d85(d85.b(f3, 0.3f, 0.0f, 0.0f, 0.0f, 14))), new Pair(Float.valueOf(0.2f), new d85(d85.b(f3, 0.1f, 0.0f, 0.0f, 0.0f, 14))), new Pair(Float.valueOf(0.5f), new d85(d85.b(f3, 0.3f, 0.0f, 0.0f, 0.0f, 14))), new Pair(Float.valueOf(1.0f), new d85(d85.b(f3, 0.9f, 0.0f, 0.0f, 0.0f, 14)))}, 14);
            case 2:
                List list = (List) obj;
                list.getClass();
                Object Y = CollectionsKt.Y(list);
                Y.getClass();
                throw ((Throwable) Y);
            case 3:
                String str = (String) obj;
                return hrg.A(str, "'", str, "'");
            case 4:
                String str2 = (String) obj;
                return hrg.A(str2, "'", str2, "'");
            case 5:
                ija ijaVar = (ija) obj;
                ijaVar.getClass();
                return hrg.q("'", ijaVar.a, "'");
            case 6:
                List list2 = (List) obj;
                list2.getClass();
                ArrayList arrayList = new ArrayList();
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    Iterator it2 = ThrowablesKt.meAndCauses((IOException) it.next()).iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj2 = it2.next();
                            if (((Throwable) obj2) instanceof SocketTimeoutException) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    Throwable th = (Throwable) obj2;
                    if (th != null) {
                        arrayList.add(th);
                    }
                }
                if (arrayList.size() == list2.size()) {
                    Object Y2 = CollectionsKt.Y(arrayList);
                    Y2.getClass();
                    throw new yte((SocketTimeoutException) Y2);
                }
                IOException iOException = (IOException) CollectionsKt.Y(list2);
                iOException.getClass();
                if (iOException instanceof RebalancedException) {
                    throw ((RebalancedException) iOException).a;
                }
                throw iOException;
            case 7:
                return null;
            case 8:
                return n7w.L(((d85) obj).a);
            case 9:
                return n7w.L(((d85) obj).a);
            case 10:
                Pair pair = (Pair) obj;
                pair.getClass();
                Boolean bool = (Boolean) pair.b;
                bool.booleanValue();
                return bool;
            case 11:
                med medVar = (med) obj;
                medVar.getClass();
                return medVar.name();
            case 12:
                Pair pair2 = (Pair) obj;
                pair2.getClass();
                return pair2.a + " = " + pair2.b;
            case 13:
                mqs mqsVar = (mqs) obj;
                mqsVar.getClass();
                return mqsVar.a;
            case 14:
                mqs mqsVar2 = (mqs) obj;
                mqsVar2.getClass();
                return mqsVar2.a;
            case 15:
                mqs mqsVar3 = (mqs) obj;
                mqsVar3.getClass();
                return mqsVar3.a;
            case 16:
                ((mqs) obj).getClass();
                return Boolean.valueOf(!r14.C());
            case 17:
                List list3 = (List) obj;
                list3.getClass();
                IOException iOException2 = (IOException) CollectionsKt.Y(list3);
                iOException2.getClass();
                if (iOException2 instanceof RebalancedException) {
                    throw ((RebalancedException) iOException2).a;
                }
                throw iOException2;
            case 18:
                ((Boolean) obj).getClass();
                return 100L;
            case 19:
                String str3 = (String) obj;
                return hrg.A(str3, "'", str3, "'");
            case 20:
                return Boolean.valueOf(obj instanceof PromotionPodcastsEntityDto);
            case 21:
                return Boolean.valueOf(obj instanceof t4m);
            case 22:
                return Boolean.valueOf(obj instanceof trl);
            case 23:
                return Boolean.valueOf(obj instanceof CategoryPodcastsEntityDto);
            case 24:
                return Boolean.valueOf(obj instanceof TrackChartEntityDto);
            case 25:
                return Boolean.valueOf(obj instanceof AlbumChartEntityDto);
            case 26:
                return Boolean.valueOf(obj instanceof StationEntityDto);
            case 27:
                return Boolean.valueOf(obj instanceof MenuItemEntityAliasDto);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                List list4 = (List) obj;
                list4.getClass();
                IOException iOException3 = (IOException) CollectionsKt.Y(list4);
                iOException3.getClass();
                if (iOException3 instanceof RebalancedException) {
                    throw ((RebalancedException) iOException3).a;
                }
                throw iOException3;
            default:
                gow gowVar = (gow) obj;
                gowVar.getClass();
                return gowVar.a;
        }
    }
}
