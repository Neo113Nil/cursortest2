package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.PhotoInfoDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.DynamicSearchTimelineIconDto;

/* loaded from: classes5.dex */
public final class zri {
    public final ow a;
    public final xwa0 b;
    public final j5v c;
    public final s701 d;
    public final hxb0 e;
    public final pki f;
    public final ga90 g;
    public final r6i h;
    public final vzc i;
    public final ac80 j;
    public final r360 k;
    public final c1x0 l;

    public zri(ow owVar, xwa0 xwa0Var, j5v j5vVar, s701 s701Var, hxb0 hxb0Var, pki pkiVar, ga90 ga90Var, r6i r6iVar, vzc vzcVar, ac80 ac80Var, r360 r360Var, c1x0 c1x0Var) {
        this.a = owVar;
        this.b = xwa0Var;
        this.c = j5vVar;
        this.d = s701Var;
        this.e = hxb0Var;
        this.f = pkiVar;
        this.g = ga90Var;
        this.h = r6iVar;
        this.i = vzcVar;
        this.j = ac80Var;
        this.k = r360Var;
        this.l = c1x0Var;
    }

    public static dqb1 a(DynamicSearchTimelineIconDto dynamicSearchTimelineIconDto) {
        if (dynamicSearchTimelineIconDto instanceof DynamicSearchTimelineIconDto.DynamicSearchTimelineIcon_TagDto) {
            return new obz0(((DynamicSearchTimelineIconDto.DynamicSearchTimelineIcon_TagDto) dynamicSearchTimelineIconDto).b.getImageTag());
        }
        if (dynamicSearchTimelineIconDto instanceof DynamicSearchTimelineIconDto.DynamicSearchTimelineIcon_LottieDto) {
            return new nbz0(((DynamicSearchTimelineIconDto.DynamicSearchTimelineIcon_LottieDto) dynamicSearchTimelineIconDto).b.getName());
        }
        return null;
    }

    public static ArrayList b(List list) {
        List<PhotoInfoDto> list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (PhotoInfoDto photoInfoDto : list2) {
            arrayList.add(new nkb0(photoInfoDto.getPath(), photoInfoDto.getDownloadUrl()));
        }
        return arrayList;
    }
}
