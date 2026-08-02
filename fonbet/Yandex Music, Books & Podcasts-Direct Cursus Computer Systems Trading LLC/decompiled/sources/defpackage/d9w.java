package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.media3.extractor.flac.FlacExtractor;
import com.google.gson.GsonBuilder;
import com.yandex.media.ynison.service.f;
import com.yandex.music.shared.dto.universalentities.UniversalEntityDto;
import com.yandex.music.shared.dto.universalentities.UniversalEntityJsonAdapter;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.R;
import ru.yandex.music.common.media.queue.YnisonSecondaryQueuePassiveLaunchException;
import ru.yandex.music.network.response.eventdata.EventDataDto;
import ru.yandex.music.nonmusic.shelf.data.MyShelfBlockElementDto;
import ru.yandex.music.nonmusic.shelf.data.MyShelfBlockElementJsonAdapter;
import ru.yandex.music.nonmusic.shelf.data.MyShelfBlockPlayedItemDto;
import ru.yandex.music.nonmusic.shelf.data.MyShelfBlockPlayedItemJsonAdapter;
import ru.yandex.music.novelties.podcasts.catalog.data.PodcastsBlockDto;
import ru.yandex.music.novelties.podcasts.catalog.data.PodcastsCatalogBlocksDeserialization;
import ru.yandex.music.novelties.podcasts.catalog.data.PodcastsCatalogEntitiesDeserialization;
import ru.yandex.music.novelties.podcasts.catalog.data.dto.PodcastsEntityDto;
import ru.yandex.music.radio.store.RadioMenuDataJsonAdapter;
import ru.yandex.video.m3.ui.ListYandexPlayerView;

/* loaded from: classes4.dex */
public final /* synthetic */ class d9w implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ d9w(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = -1;
        int i2 = 17;
        int i3 = 16;
        switch (this.a) {
            case 0:
                Context context = (Context) obj;
                context.getClass();
                View inflate = LayoutInflater.from(context).inflate(R.layout.list_yandex_player_view, (ViewGroup) null, false);
                inflate.getClass();
                ListYandexPlayerView listYandexPlayerView = (ListYandexPlayerView) inflate;
                listYandexPlayerView.setFirstFrameUntilPlay(true);
                listYandexPlayerView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                return listYandexPlayerView;
            case 1:
                ListYandexPlayerView listYandexPlayerView2 = (ListYandexPlayerView) obj;
                listYandexPlayerView2.getClass();
                listYandexPlayerView2.b();
                return Unit.a;
            case 2:
                ListYandexPlayerView listYandexPlayerView3 = (ListYandexPlayerView) obj;
                listYandexPlayerView3.getClass();
                listYandexPlayerView3.b();
                return Unit.a;
            case 3:
                String str = (String) obj;
                str.getClass();
                return new YnisonSecondaryQueuePassiveLaunchException(str, null);
            case 4:
                GsonBuilder gsonBuilder = (GsonBuilder) obj;
                gsonBuilder.getClass();
                gsonBuilder.b(EventDataDto.class, new EventDataDto.GsonDeserializer());
                gsonBuilder.b(vfn.class, new RadioMenuDataJsonAdapter());
                gsonBuilder.b(PodcastsBlockDto.class, new PodcastsCatalogBlocksDeserialization());
                gsonBuilder.b(PodcastsEntityDto.class, new PodcastsCatalogEntitiesDeserialization());
                gsonBuilder.b(MyShelfBlockElementDto.class, new MyShelfBlockElementJsonAdapter());
                gsonBuilder.b(MyShelfBlockPlayedItemDto.class, new MyShelfBlockPlayedItemJsonAdapter());
                gsonBuilder.b(UniversalEntityDto.class, new UniversalEntityJsonAdapter());
                return Unit.a;
            case 5:
                r2c r2cVar = (r2c) obj;
                r2cVar.getClass();
                if (r2cVar instanceof jvc) {
                    i = -3;
                } else if (r2cVar instanceof xfi) {
                    i = -2;
                } else if (!(r2cVar instanceof sfi)) {
                    i = 0;
                }
                return Integer.valueOf(i);
            case 6:
                r2c r2cVar2 = (r2c) obj;
                r2cVar2.getClass();
                if (r2cVar2 instanceof jvc) {
                    i = -5;
                } else if (r2cVar2 instanceof xfi) {
                    i = -4;
                } else if (r2cVar2.getClass().equals((Class) sgc.a.getValue())) {
                    i = -3;
                } else if (r2cVar2 instanceof FlacExtractor) {
                    i = -2;
                } else if (!(r2cVar2 instanceof sfi)) {
                    i = 0;
                }
                return Integer.valueOf(i);
            case 7:
                wvh wvhVar = (wvh) obj;
                wvhVar.getClass();
                return wvhVar;
            case 8:
                wvh wvhVar2 = (wvh) obj;
                wvhVar2.getClass();
                return wvhVar2;
            case 9:
                gow gowVar = (gow) obj;
                gowVar.getClass();
                return gowVar.a;
            case 10:
                return Long.valueOf(!((Boolean) obj).booleanValue() ? 3500L : 0L);
            case 11:
                xqw xqwVar = (xqw) obj;
                xqwVar.getClass();
                return new Pair(Boolean.valueOf(xqwVar.a), Boolean.valueOf(xqwVar.a()));
            case 12:
                List list = (List) obj;
                list.getClass();
                List list2 = list;
                ArrayList arrayList = new ArrayList(v75.o(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((gow) it.next()).a);
                }
                return CollectionsKt.A0(arrayList);
            case 13:
                o18 o18Var = (o18) obj;
                vz1.e(o18Var, zfw.class).E(new d9w(18));
                o18Var.b(hag.I(afw.class)).E(new d9w(22));
                o18Var.b(hag.I(xfw.class)).E(new d9w(23));
                o18Var.b(hag.I(jqw.class)).E(new d9w(24));
                o18Var.b(hag.I(fiw.class)).E(new d9w(25));
                o18Var.b(hag.I(hhw.class)).E(new d9w(26));
                o18Var.b(hag.I(tiw.class)).E(new d9w(14));
                o18Var.b(hag.I(hew.class)).E(new d9w(15));
                o18Var.b(hag.I(ciw.class)).E(new d9w(i3));
                o18Var.b(hag.I(eew.class)).E(new d9w(i2));
                o18Var.b(hag.I(jwd.class)).E(new d9w(19));
                o18Var.b(hag.I(fw1.class)).E(new d9w(20));
                o18Var.b(hag.I(nwd.class)).E(new d9w(21));
                return Unit.a;
            case 14:
                ((l13) obj).getClass();
                return new tiw();
            case 15:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                return new hew(btf.b(new h4d(l13Var, i3)), btf.b(new h4d(l13Var, i2)));
            case 16:
                ((l13) obj).getClass();
                return new ciw();
            case 17:
                ((l13) obj).getClass();
                return new eew();
            case 18:
                ((l13) obj).getClass();
                return new zfw();
            case 19:
                l13 l13Var2 = (l13) obj;
                l13Var2.getClass();
                return new jwd((Context) l13Var2.a.D(hag.I(Context.class), l13Var2, l13Var2.b));
            case 20:
                l13 l13Var3 = (l13) obj;
                l13Var3.getClass();
                return (fw1) ((jwd) l13Var3.a.D(hag.I(jwd.class), l13Var3, l13Var3.b)).a.getValue();
            case 21:
                l13 l13Var4 = (l13) obj;
                l13Var4.getClass();
                bdt I = hag.I(afw.class);
                qdc qdcVar = l13Var4.a;
                Set set = l13Var4.b;
                return new nwd((afw) qdcVar.D(I, l13Var4, set), (fw1) qdcVar.D(hag.I(fw1.class), l13Var4, set));
            case 22:
                ((l13) obj).getClass();
                return new afw();
            case 23:
                ((l13) obj).getClass();
                return new xfw();
            case 24:
                ((l13) obj).getClass();
                return new oqw();
            case 25:
                ((l13) obj).getClass();
                return new fiw();
            case 26:
                ((l13) obj).getClass();
                return new hhw();
            case 27:
                f fVar = (f) obj;
                return ouj.o(fVar.t(), " - ", fVar.w());
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                t9n t9nVar = (t9n) obj;
                t9nVar.getClass();
                return t9nVar.a.a;
            default:
                iiw iiwVar = (iiw) obj;
                iiwVar.getClass();
                return iiwVar.a();
        }
    }
}
