package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.yandex.messenger.websdk.api.MessengerAnalytics;
import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.concert.info.screen.block.place.ConcertMapDto;
import com.yandex.music.shared.concert.info.screen.block.place.ConcertPlaceBlockApi;
import com.yandex.music.shared.concert.info.screen.block.place.ConcertPlaceDto;
import com.yandex.music.shared.dto.concert.ConcertDto;
import io.appmetrica.analytics.IReporterYandex;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import retrofit2.Call;
import ru.yandex.music.R;
import ru.yandex.music.kids.KidsCatalogActivity;
import ru.yandex.music.novelties.podcasts.PodcastsActivity;
import ru.yandex.music.novelties.podcasts.catalog.PodcastsCatalogActivity;
import ru.yandex.music.url.ui.StubActivity;

/* loaded from: classes5.dex */
public final class o implements tft, MessengerAnalytics {
    public final jyr a;

    public o(int i) {
        switch (i) {
            case 6:
                this.a = l18.b.b(hag.I(zxq.class), true);
                break;
            case 7:
            default:
                this.a = btf.b(new ym4(16));
                break;
            case 8:
                this.a = l18.b.b(hag.I(nuv.class), true);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(uvn uvnVar, boolean z, cg6 cg6Var) {
        my5 my5Var;
        int i;
        bii biiVar;
        zx5 zx5Var;
        ArrayList arrayList;
        ly5 ly5Var;
        String mapUrl;
        String title;
        if (cg6Var instanceof my5) {
            my5Var = (my5) cg6Var;
            int i2 = my5Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                my5Var.l = i2 - Integer.MIN_VALUE;
                Object obj = my5Var.j;
                nm6 nm6Var = nm6.a;
                i = my5Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<ConcertPlaceDto>> a = ((ConcertPlaceBlockApi) this.a.getValue()).a(uvnVar.e().a, men.G(uvnVar.a()), z ? "no-cache" : null);
                    my5Var.l = 1;
                    obj = swf.N(a, my5Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                biiVar = (bii) obj;
                if (biiVar instanceof aii) {
                    if (biiVar instanceof xhi) {
                        xhi xhiVar = (xhi) biiVar;
                        MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                        int i3 = xhiVar.b;
                        String name = musicBackendInvocationError.getName();
                        String str = name == null ? "" : name;
                        String message = musicBackendInvocationError.getMessage();
                        return new kj6(i3, musicBackendInvocationError.getDetails(), str, message == null ? "" : message, xhiVar.a);
                    }
                    if (biiVar instanceof yhi) {
                        yhi yhiVar = (yhi) biiVar;
                        return new lj6(yhiVar.b, yhiVar.c, yhiVar.a);
                    }
                    if (biiVar instanceof zhi) {
                        return uwf.J((zhi) biiVar);
                    }
                    b6e.s();
                    return null;
                }
                ConcertPlaceDto concertPlaceDto = (ConcertPlaceDto) ((aii) biiVar).a;
                String place = concertPlaceDto.getPlace();
                if (place != null) {
                    String city = concertPlaceDto.getCity();
                    String address = concertPlaceDto.getAddress();
                    List<ConcertDto.MetroStationDto> metroStations = concertPlaceDto.getMetroStations();
                    if (metroStations != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (ConcertDto.MetroStationDto metroStationDto : metroStations) {
                            f5i f5iVar = (metroStationDto == null || (title = metroStationDto.getTitle()) == null) ? null : new f5i(title, y2x.D(metroStationDto.getLineColor()));
                            if (f5iVar != null) {
                                arrayList2.add(f5iVar);
                            }
                        }
                        arrayList = arrayList2;
                    } else {
                        arrayList = null;
                    }
                    ConcertMapDto map = concertPlaceDto.getMap();
                    if (map != null) {
                        String imageUrl = map.getImageUrl();
                        ly5Var = (imageUrl == null || (mapUrl = map.getMapUrl()) == null) ? null : new ly5(imageUrl, mapUrl);
                    }
                    zx5Var = new zx5(place, city, address, arrayList, ly5Var);
                    return zx5Var != null ? new nj6(null) : new qj6(zx5Var);
                }
                zx5Var = null;
                if (zx5Var != null) {
                }
            }
        }
        my5Var = new my5(this, cg6Var);
        Object obj2 = my5Var.j;
        nm6 nm6Var2 = nm6.a;
        i = my5Var.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (biiVar instanceof aii) {
        }
    }

    public void b() {
        ((vfb) this.a.getValue()).getClass();
        l18 l18Var = l18.b;
        bdt I = hag.I(Context.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        hag.x((Context) qdcVar.C(I), R.string.playback_impossible, 0);
    }

    @Override // com.yandex.messenger.websdk.api.MessengerAnalytics
    public void l(String str, Throwable th) {
        ssg.a(7, null, str, th);
    }

    @Override // defpackage.tft
    public Intent p(Context context, Intent intent, kqt kqtVar) {
        kqtVar.getClass();
        if (kqtVar.c != 1) {
            Intent t = w1g.t(context, intent, kqtVar);
            if (t != null) {
                return t;
            }
            Intent z = StubActivity.z(context, rpt.NOT_FOUND);
            z.getClass();
            return z;
        }
        hc5 hc5Var = (hc5) kqtVar.a;
        String a = hc5Var.a(2);
        m94 b = hc5Var.b();
        if (a == null || StringsKt.U(a)) {
            int ordinal = b.ordinal();
            if (ordinal == 0) {
                jyr jyrVar = PodcastsCatalogActivity.Y;
                return new Intent(context, (Class<?>) PodcastsCatalogActivity.class);
            }
            if (ordinal == 1) {
                jyr jyrVar2 = KidsCatalogActivity.Y;
                return new Intent(context, (Class<?>) KidsCatalogActivity.class);
            }
            b6e.s();
            return null;
        }
        if (hc5Var.a(3) != null) {
            int ordinal2 = b.ordinal();
            if (ordinal2 == 0) {
                int i = PodcastsActivity.Y;
                return zdg.z(context, kem.a, lem.a, a);
            }
            if (ordinal2 == 1) {
                int i2 = PodcastsActivity.Y;
                return zdg.z(context, kem.b, lem.a, a);
            }
            b6e.s();
            return null;
        }
        vqq vqqVar = vqq.YANDEXMUSIC;
        wqq wqqVar = (wqq) new lim(vqqVar).a(String.format(vqqVar.b, Arrays.copyOf(new Object[]{hrg.r("category_", b.a, "_", a)}, 1)), true);
        ipj ipjVar = (ipj) this.a.getValue();
        String uri = hc5Var.m().toString();
        uri.getClass();
        ipjVar.getClass();
        it0 it0Var = it0.a;
        Pair pair = new Pair("url", uri);
        String g = jhp.g(jhp.e(new o7t(ghp.c(jhp.e(new o7t(CollectionsKt.F(frc.a.d), new m2j(28))), new d0p(24)), new m2j(29))), ", ", new hpj(0), 30);
        String str = StringsKt.U(g) ? null : g;
        if (str == null) {
            str = "cold_app_start";
        }
        it0Var.a("OLD_CATALOG_DEEPLINK_NAVIGATION", uah.e(pair, new Pair("app_screen", str)));
        return new Intent("android.intent.action.VIEW", wqqVar.m());
    }

    @Override // com.yandex.messenger.websdk.api.MessengerAnalytics
    public void sendEvent(String str, Map map) {
        map.getClass();
        ((IReporterYandex) this.a.getValue()).reportEvent(str, (Map<String, Object>) map);
    }

    public o(Activity activity) {
        activity.getClass();
        this.a = btf.b(new jz3(activity, 1));
    }

    public o(upq upqVar) {
        e0j c = upqVar.c();
        c.getClass();
        this.a = btf.b(new w2(c, 22));
    }

    public o(Context context) {
        this.a = btf.b(new vw1(context, 23));
    }

    public /* synthetic */ o(jyr jyrVar) {
        this.a = jyrVar;
    }
}
