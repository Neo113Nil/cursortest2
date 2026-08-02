package ru.yandex.logistics.cargo_form.send_event.impl.data;

import defpackage.f6s;
import defpackage.g6s;
import defpackage.h6s;
import defpackage.i6s;
import defpackage.w511;
import java.util.Map;
import kotlin.collections.b;
import kotlin.coroutines.Continuation;
import ru.yandex.logistics.sdk.cargo_form.core.api.models.FormEventType;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formsendevent.FormAppEnteredBackgroundPayloadDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formsendevent.FormClosedPayloadDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formsendevent.FormEventPayloadDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formsendevent.V2FormSendEventRequestDto;
import ru.yandex.taxi.logistics.sdk.network.c;

/* loaded from: classes5.dex */
public final class a extends c {
    public static final /* synthetic */ int k = 0;
    public final FormSendEventApi i;
    public final i6s j;

    public a(FormSendEventApi formSendEventApi, i6s i6sVar) {
        super(new g6s(0), 0L, 14);
        this.i = formSendEventApi;
        this.j = i6sVar;
    }

    public final Object b(String str, String str2, String str3, FormEventType formEventType, String str4, Continuation continuation) {
        FormEventPayloadDto formEventPayload_AppEnteredBackgroundDto;
        f6s f6sVar = this.j.a;
        Map map = (Map) f6sVar.b.fromJson(str3);
        if (map == null) {
            map = b.f();
        }
        Map map2 = map;
        Map map3 = str4 != null ? (Map) f6sVar.b.fromJson(str4) : null;
        int i = h6s.a[formEventType.ordinal()];
        if (i == 1) {
            formEventPayload_AppEnteredBackgroundDto = new FormEventPayloadDto.FormEventPayload_AppEnteredBackgroundDto(new FormAppEnteredBackgroundPayloadDto());
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            formEventPayload_AppEnteredBackgroundDto = new FormEventPayloadDto.FormEventPayload_ClosedDto(new FormClosedPayloadDto());
        }
        return a(new FormSendEventRequestInteractor$launchSendEvent$2(this, new V2FormSendEventRequestDto(str, str2, map2, formEventPayload_AppEnteredBackgroundDto, map3), null), continuation);
    }
}
