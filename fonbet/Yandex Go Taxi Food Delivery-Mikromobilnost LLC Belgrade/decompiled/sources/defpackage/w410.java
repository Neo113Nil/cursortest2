package defpackage;

import com.yandex.go.feed_video.actions.models.MediaItemDto;
import com.yandex.go.feed_video.actions.models.MediaStreamDto;
import com.yandex.go.feed_video.actions.models.MediaStreamDto$$serializer;
import com.yandex.go.feed_video.actions.models.StreamTypeDto;
import com.yandex.go.feed_video.actions.models.a;
import com.yandex.go.feed_video.actions.models.b;
import com.yandex.go.masstransit.sdk.core.design.slot.dto.MasstransitSlotItemDto$$serializer;
import com.yandex.go.masstransit.sdk.core.design.slot.dto.MasstransitSlotItemLineDto;
import com.yandex.go.masstransit.sdk.core.design.slot.dto.MasstransitSlotItemSizeDto;
import com.yandex.go.masstransit.sdk.core.design.slot.dto.MasstransitSlotItemTrailDto$ButtonDto;
import com.yandex.go.masstransit.sdk.core.design.slot.dto.MasstransitSlotItemTrailDto$IconSpotDto;
import com.yandex.go.masstransit.sdk.core.design.slot.dto.n;
import com.yandex.go.masstransit.sdk.core.design.slot.dto.p;
import com.yandex.go.masstransit.sdk.core.design.slot.dto.s;
import com.yandex.go.masstransit.sdk.order.impl.orders.MasstransitTicketDto;
import com.yandex.go.masstransit.sdk.order.impl.orders.l;
import com.yandex.go.payments.shared.data.model.Member;
import com.yandex.go.payments.shared.data.model.i;
import com.yandex.go.places.models.data.entities.network.a0;
import com.yandex.go.taxi.order.chat.api.data.model.Message;
import com.yandex.go.taxi.order.chat.api.data.model.c;
import com.yandex.mapkit.geometry.geo.Projections;
import com.yandex.messaging.div.DivPlugin;
import flex.trim.memory.MemoryPriority;
import java.lang.annotation.Annotation;
import ru.yandex.taxi.gopayments.dto.MemberRole;
import ru.yandex.taxi.settings.api.dto.settings.types.MenuItemElementType;
import ru.yandex.taxi.settings.api.dto.settings.types.SectionItemActionType;

/* loaded from: classes12.dex */
public final /* synthetic */ class w410 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ w410(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = 0;
        switch (this.a) {
            case 0:
                return vez0.g("com.yandex.go.masstransit.sdk.core.design.slot.dto.MasstransitSlotItemLineDto.Ellipsis", MasstransitSlotItemLineDto.Ellipsis.values(), new String[]{"center", "end"}, new Annotation[][]{null, null});
            case 1:
                return vez0.g("com.yandex.go.masstransit.sdk.core.design.slot.dto.MasstransitSlotItemSizeDto", MasstransitSlotItemSizeDto.values(), new String[]{"xs", "s", "m", "l"}, new Annotation[][]{null, null, null, null});
            case 2:
                n nVar = MasstransitSlotItemTrailDto$ButtonDto.Companion;
                return MasstransitSlotItemTrailDto$ButtonDto.Style.Companion.serializer();
            case 3:
                return vez0.g("com.yandex.go.masstransit.sdk.core.design.slot.dto.MasstransitSlotItemTrailDto.ButtonDto.Style", MasstransitSlotItemTrailDto$ButtonDto.Style.values(), new String[]{"main", "outline", "action"}, new Annotation[][]{null, null, null});
            case 4:
                p pVar = MasstransitSlotItemTrailDto$IconSpotDto.Companion;
                return MasstransitSlotItemTrailDto$IconSpotDto.SpotType.Companion.serializer();
            case 5:
                p pVar2 = MasstransitSlotItemTrailDto$IconSpotDto.Companion;
                return MasstransitSlotItemTrailDto$IconSpotDto.Size.Companion.serializer();
            case 6:
                return vez0.g("com.yandex.go.masstransit.sdk.core.design.slot.dto.MasstransitSlotItemTrailDto.IconSpotDto.Size", MasstransitSlotItemTrailDto$IconSpotDto.Size.values(), new String[]{"m"}, new Annotation[][]{null});
            case 7:
                return vez0.g("com.yandex.go.masstransit.sdk.core.design.slot.dto.MasstransitSlotItemTrailDto.IconSpotDto.SpotType", MasstransitSlotItemTrailDto$IconSpotDto.SpotType.values(), new String[]{"fill"}, new Annotation[][]{null});
            case 8:
                return new o4o("com.yandex.go.masstransit.sdk.core.design.slot.dto.MasstransitSlotItemTrailDto.Unknown", s.INSTANCE, new Annotation[0]);
            case 9:
                l lVar = MasstransitTicketDto.Companion;
                return new p53(MasstransitSlotItemDto$$serializer.INSTANCE, 0);
            case 10:
                return new o4o("com.yandex.go.places.models.data.entities.network.MediaDto.Unknown", a0.INSTANCE, new Annotation[0]);
            case 11:
                a aVar = MediaItemDto.Companion;
                return new p53(MediaStreamDto$$serializer.INSTANCE, 0);
            case 12:
                b bVar = MediaStreamDto.Companion;
                return StreamTypeDto.Companion.serializer();
            case 13:
                i iVar = Member.Companion;
                return MemberRole.Companion.serializer();
            case 14:
                return vez0.g("ru.yandex.taxi.gopayments.dto.MemberRole", MemberRole.values(), new String[]{"owner", "user", null}, new Annotation[][]{null, null, null});
            case 15:
                return new o4o("flex.trim.memory.MemoryPriority", (Enum[]) MemoryPriority.values());
            case 16:
                lk10 lk10Var = nk10.Companion;
                return new p53(x0q0.a, 0);
            case 17:
                hl10 hl10Var = il10.Companion;
                return SectionItemActionType.Companion.serializer();
            case 18:
                ql10 ql10Var = rl10.Companion;
                return MenuItemElementType.Companion.serializer();
            case 19:
                return vez0.g("ru.yandex.taxi.settings.api.dto.settings.types.MenuItemElementType", MenuItemElementType.values(), new String[]{"default", "switch", "nav", null}, new Annotation[][]{null, null, null, null});
            case 20:
                return Projections.getWgs84Mercator();
            case 21:
                return new gq10(i);
            case 22:
                return new pq10(null, null);
            case 23:
                return new er10(i);
            case 24:
                c cVar = Message.Companion;
                return Message.Action.Companion.serializer();
            case 25:
                return vez0.g("com.yandex.go.taxi.order.chat.api.data.model.Message.Action", Message.Action.values(), new String[]{"driving", "i_am_coming", "waiting", "user_ready"}, new Annotation[][]{null, null, null, null});
            case 26:
                return "Failed to update data";
            case 27:
                return d320.d();
            case 28:
                return e320.d();
            default:
                return qoi0.a(DivPlugin.class);
        }
    }
}
