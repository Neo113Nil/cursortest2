package ru.yandex.taxi.logistics.sdk.tracking.domain.impl.data;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import com.yandex.delivery.mapper.model.PointType;
import com.yandex.delivery.mapper.model.policies.ShowPolicy$LimitedCount$Lifetime;
import defpackage.a460;
import defpackage.a9n;
import defpackage.ac80;
import defpackage.an2;
import defpackage.aqi;
import defpackage.ari;
import defpackage.b460;
import defpackage.b4u0;
import defpackage.bqi;
import defpackage.bri;
import defpackage.c1x0;
import defpackage.c460;
import defpackage.cbz0;
import defpackage.cqi;
import defpackage.d460;
import defpackage.dfe0;
import defpackage.doe;
import defpackage.dqi;
import defpackage.dri;
import defpackage.ds0;
import defpackage.e460;
import defpackage.efe0;
import defpackage.eqi;
import defpackage.eri;
import defpackage.f460;
import defpackage.fa90;
import defpackage.ffe0;
import defpackage.fqi;
import defpackage.fri;
import defpackage.g8e;
import defpackage.gd3;
import defpackage.gfe0;
import defpackage.go2;
import defpackage.gqi;
import defpackage.gri;
import defpackage.gw00;
import defpackage.h3y;
import defpackage.ho2;
import defpackage.hqi;
import defpackage.hxb0;
import defpackage.i5v;
import defpackage.io2;
import defpackage.iqi;
import defpackage.j5v;
import defpackage.jgz;
import defpackage.jl40;
import defpackage.jqi;
import defpackage.kez0;
import defpackage.kqi;
import defpackage.kus0;
import defpackage.l460;
import defpackage.l8s0;
import defpackage.lqi;
import defpackage.ls50;
import defpackage.m460;
import defpackage.mm91;
import defpackage.mqi;
import defpackage.mus0;
import defpackage.n360;
import defpackage.n460;
import defpackage.nqi;
import defpackage.ny61;
import defpackage.oki;
import defpackage.oqi;
import defpackage.ow;
import defpackage.p460;
import defpackage.p6i;
import defpackage.pki;
import defpackage.pqi;
import defpackage.ps50;
import defpackage.pxy0;
import defpackage.q360;
import defpackage.qa91;
import defpackage.qqi;
import defpackage.qv10;
import defpackage.r360;
import defpackage.r6i;
import defpackage.rqi;
import defpackage.rz50;
import defpackage.s701;
import defpackage.sa91;
import defpackage.scc;
import defpackage.sqi;
import defpackage.tcc;
import defpackage.tls;
import defpackage.tpi;
import defpackage.tqi;
import defpackage.upi;
import defpackage.uqi;
import defpackage.uzc;
import defpackage.vee0;
import defpackage.vng;
import defpackage.vpi;
import defpackage.vqi;
import defpackage.vzc;
import defpackage.w511;
import defpackage.wee0;
import defpackage.wpi;
import defpackage.wqi;
import defpackage.x8n;
import defpackage.xpi;
import defpackage.xwa0;
import defpackage.y8n;
import defpackage.ycc;
import defpackage.ypi;
import defpackage.yqi;
import defpackage.yri;
import defpackage.z260;
import defpackage.z8n;
import defpackage.zb80;
import defpackage.zcz0;
import defpackage.zpi;
import defpackage.zqi;
import defpackage.zri;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.delivery.state.DeliveryState$Poll$Question$AnswersAlignment;
import ru.yandex.taxi.logistics.sdk.delivery.state.DeliveryState$Poll$Question$ChoicesType;
import ru.yandex.taxi.logistics.sdk.delivery.state.NeuroPostcardButton$Size;
import ru.yandex.taxi.logistics.sdk.delivery.state.NeuroPostcardButton$Style;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.ContactDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.DeliveryIconStrategyDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.PhotoInfoDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.PointPinDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.PointVisitStatusDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.PollUserAnswerChoiceDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.PostcardConsumerInfoDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.AccentButtonActionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.AccentStateButtonDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.AdsBannerDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.AdsBannerSettingsDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.AnotherOrderPointDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.CompletedStateButtonsDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.CostDetailsComponentDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.CostDetailsDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.DeliveryStateContextDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.DeliveryStateDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.DynamicSearchStatusDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.DynamicSearchTimelineAnimatableDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.DynamicSearchTimelineDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.DynamicSearchTimelineIconDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.DynamicSearchTimelineIdleDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.DynamicSearchTimelineStageDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.LimitedCountShowPolicyDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.MapAnimationDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.ObjectsOverMapSettingsDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.OnFirstLoadActionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.OrderPointDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.PaidWaitingInfoDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.PerformerDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.PerformerRouteDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.PerformerRoutePointDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.PollDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.PollQuestionAnswerDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.PollQuestionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.PopupSettingsDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.ShowPolicyDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.StateButtonDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.StatePointDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.SubpollDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.TrackingPopupDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.UrbanAdsSettingsDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ActionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ActionOpenFormDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateorderingcontrol.DetailFormButtonLayoutDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateorderingcontrol.DetailFormHeaderLayoutDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateorderingcontrol.DetailFormLayoutDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateorderingcontrol.DetailFormRoutePointFieldLayoutDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateorderingcontrol.DetailFormRoutePointLayoutDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateorderingcontrol.OrderingControlDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateorderingcontrol.PhotocommentsConfigDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateorderingcontrol.PostOrderDetailFormDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateorderingcontrol.VerticalBarDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.details.ContentItemTypeDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1deliverystate.DeliveryStateRequestDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1deliverystate.Responses$DeliveryStateResponseDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.neuropostcard.NeuroPostcardActionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.neuropostcard.NeuroPostcardButtonDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.neuropostcard.NeuroPostcardDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.neuropostcard.NeuroPostcardLabelsDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.neuropostcard.NeuroPostcardLottieDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.neuropostcard.NeuroPostcardStageDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.slot.SlotDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.timeline.TimelineDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.topaccentbar.InfoTopAccentBarDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.topaccentbar.TimerDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.topaccentbar.TimerTopAccentBarDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.topaccentbar.TopAccentBarDto;

/* loaded from: classes5.dex */
public final class d {
    public final h3y a;
    public final zri b;
    public final ds0 c;
    public final List d = Arrays.asList(ContentItemTypeDto.values());

    public d(h3y h3yVar, zri zriVar, ds0 ds0Var) {
        this.a = h3yVar;
        this.b = zriVar;
        this.c = ds0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0c9a  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0cdc  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0cee  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0d00  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0da1  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0da8  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0d99  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0cf8  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0ce6  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0caa  */
    /* JADX WARN: Removed duplicated region for block: B:552:0x0e6c  */
    /* JADX WARN: Removed duplicated region for block: B:568:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [kus0] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v33, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v34, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v46 */
    /* JADX WARN: Type inference failed for: r10v47, types: [l8s0] */
    /* JADX WARN: Type inference failed for: r10v61 */
    /* JADX WARN: Type inference failed for: r11v39 */
    /* JADX WARN: Type inference failed for: r11v40, types: [eri] */
    /* JADX WARN: Type inference failed for: r11v53 */
    /* JADX WARN: Type inference failed for: r11v54, types: [dqb1] */
    /* JADX WARN: Type inference failed for: r11v60 */
    /* JADX WARN: Type inference failed for: r11v61 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2, types: [vwa0] */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v5, types: [b9n] */
    /* JADX WARN: Type inference failed for: r19v8 */
    /* JADX WARN: Type inference failed for: r1v101 */
    /* JADX WARN: Type inference failed for: r1v102, types: [efe0] */
    /* JADX WARN: Type inference failed for: r1v104 */
    /* JADX WARN: Type inference failed for: r1v182 */
    /* JADX WARN: Type inference failed for: r1v183, types: [dqb1] */
    /* JADX WARN: Type inference failed for: r1v201 */
    /* JADX WARN: Type inference failed for: r1v88, types: [ps50] */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v2, types: [kqi] */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [dri] */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1, types: [ypi] */
    /* JADX WARN: Type inference failed for: r22v9 */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1, types: [iqi] */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Type inference failed for: r23v5, types: [tqi] */
    /* JADX WARN: Type inference failed for: r23v6 */
    /* JADX WARN: Type inference failed for: r23v9 */
    /* JADX WARN: Type inference failed for: r24v1, types: [ncz0] */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r25v3, types: [eqi] */
    /* JADX WARN: Type inference failed for: r25v4 */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1, types: [uzc] */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r27v0 */
    /* JADX WARN: Type inference failed for: r27v1, types: [xpi] */
    /* JADX WARN: Type inference failed for: r27v2 */
    /* JADX WARN: Type inference failed for: r28v1 */
    /* JADX WARN: Type inference failed for: r28v2, types: [pqi] */
    /* JADX WARN: Type inference failed for: r28v3 */
    /* JADX WARN: Type inference failed for: r29v1 */
    /* JADX WARN: Type inference failed for: r29v2, types: [fa90] */
    /* JADX WARN: Type inference failed for: r29v3 */
    /* JADX WARN: Type inference failed for: r30v5 */
    /* JADX WARN: Type inference failed for: r30v6, types: [zb80] */
    /* JADX WARN: Type inference failed for: r30v7 */
    /* JADX WARN: Type inference failed for: r31v4, types: [p460] */
    /* JADX WARN: Type inference failed for: r32v1 */
    /* JADX WARN: Type inference failed for: r32v2, types: [cri] */
    /* JADX WARN: Type inference failed for: r32v3 */
    /* JADX WARN: Type inference failed for: r33v4, types: [wqi] */
    /* JADX WARN: Type inference failed for: r33v5, types: [wqi] */
    /* JADX WARN: Type inference failed for: r33v7, types: [wqi] */
    /* JADX WARN: Type inference failed for: r35v1 */
    /* JADX WARN: Type inference failed for: r35v2, types: [com.yandex.delivery.attrbutedtext.api.FormattedText] */
    /* JADX WARN: Type inference failed for: r35v3 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22, types: [gfe0] */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r43v3 */
    /* JADX WARN: Type inference failed for: r43v4, types: [wee0] */
    /* JADX WARN: Type inference failed for: r43v5 */
    /* JADX WARN: Type inference failed for: r44v0 */
    /* JADX WARN: Type inference failed for: r44v1 */
    /* JADX WARN: Type inference failed for: r44v2, types: [o460] */
    /* JADX WARN: Type inference failed for: r44v3 */
    /* JADX WARN: Type inference failed for: r44v4 */
    /* JADX WARN: Type inference failed for: r44v5, types: [cfe0] */
    /* JADX WARN: Type inference failed for: r44v6 */
    /* JADX WARN: Type inference failed for: r45v0 */
    /* JADX WARN: Type inference failed for: r45v1, types: [com.yandex.delivery.attrbutedtext.api.FormattedText] */
    /* JADX WARN: Type inference failed for: r45v2 */
    /* JADX WARN: Type inference failed for: r45v3 */
    /* JADX WARN: Type inference failed for: r45v4, types: [cfe0] */
    /* JADX WARN: Type inference failed for: r45v5 */
    /* JADX WARN: Type inference failed for: r46v0 */
    /* JADX WARN: Type inference failed for: r46v1, types: [com.yandex.delivery.attrbutedtext.api.FormattedText] */
    /* JADX WARN: Type inference failed for: r46v2 */
    /* JADX WARN: Type inference failed for: r46v3 */
    /* JADX WARN: Type inference failed for: r46v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r46v5 */
    /* JADX WARN: Type inference failed for: r47v0 */
    /* JADX WARN: Type inference failed for: r47v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r47v10, types: [cqi] */
    /* JADX WARN: Type inference failed for: r47v11 */
    /* JADX WARN: Type inference failed for: r47v12 */
    /* JADX WARN: Type inference failed for: r47v13, types: [cqi] */
    /* JADX WARN: Type inference failed for: r47v14 */
    /* JADX WARN: Type inference failed for: r47v2 */
    /* JADX WARN: Type inference failed for: r47v3 */
    /* JADX WARN: Type inference failed for: r47v4, types: [vee0] */
    /* JADX WARN: Type inference failed for: r47v5 */
    /* JADX WARN: Type inference failed for: r47v6 */
    /* JADX WARN: Type inference failed for: r47v7, types: [cqi] */
    /* JADX WARN: Type inference failed for: r47v8 */
    /* JADX WARN: Type inference failed for: r47v9 */
    /* JADX WARN: Type inference failed for: r48v0 */
    /* JADX WARN: Type inference failed for: r48v1, types: [s260] */
    /* JADX WARN: Type inference failed for: r48v2 */
    /* JADX WARN: Type inference failed for: r48v3 */
    /* JADX WARN: Type inference failed for: r48v4, types: [ffe0] */
    /* JADX WARN: Type inference failed for: r48v5 */
    /* JADX WARN: Type inference failed for: r49v1 */
    /* JADX WARN: Type inference failed for: r49v2, types: [dfe0] */
    /* JADX WARN: Type inference failed for: r49v3 */
    /* JADX WARN: Type inference failed for: r5v115 */
    /* JADX WARN: Type inference failed for: r5v116 */
    /* JADX WARN: Type inference failed for: r5v117 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48, types: [h360] */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v54, types: [h360] */
    /* JADX WARN: Type inference failed for: r5v59 */
    /* JADX WARN: Type inference failed for: r5v60, types: [h360] */
    /* JADX WARN: Type inference failed for: r6v86 */
    /* JADX WARN: Type inference failed for: r6v87 */
    /* JADX WARN: Type inference failed for: r6v88, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r8v40 */
    /* JADX WARN: Type inference failed for: r8v41, types: [b4u0] */
    /* JADX WARN: Type inference failed for: r8v57 */
    /* JADX WARN: Type inference failed for: r8v58, types: [eri] */
    /* JADX WARN: Type inference failed for: r8v68 */
    /* JADX WARN: Type inference failed for: r8v69 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, pxy0 pxy0Var, ContinuationImpl continuationImpl) {
        TrackingStateNetworkSource$getDeliveryState$1 trackingStateNetworkSource$getDeliveryState$1;
        int i;
        String str2;
        tls tlsVar;
        io2 io2Var;
        int i2;
        gri griVar;
        DeliveryStateDto deliveryStateDto;
        List list;
        Throwable th;
        boolean z;
        lqi lqiVar;
        ?? r21;
        ?? r22;
        ?? r19;
        ?? r18;
        dqi dqiVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        String str3;
        ?? r20;
        ArrayList arrayList4;
        ?? r23;
        p6i p6iVar;
        List list2;
        ?? r25;
        ?? r26;
        ?? r27;
        p6i p6iVar2;
        ArrayList arrayList5;
        Object obj;
        ArrayList arrayList6;
        ?? pqiVar;
        ?? r29;
        dqi dqiVar2;
        p6i p6iVar3;
        ?? r30;
        f460 f460Var;
        f460 a460Var;
        f460 f460Var2;
        NeuroPostcardDto.ImageDto image;
        ?? r44;
        Object l460Var;
        AttributedTextDto title;
        ?? r45;
        AttributedTextDto subtitle;
        ?? r46;
        List<NeuroPostcardButtonDto> buttons;
        ?? r47;
        NeuroPostcardButton$Style neuroPostcardButton$Style;
        NeuroPostcardButton$Size neuroPostcardButton$Size;
        Object obj2;
        ?? r32;
        Object obj3;
        ?? r3;
        ?? r1;
        ?? r462;
        qa91 qa91Var;
        qa91 vpiVar;
        ?? r10;
        Object obj4;
        Iterator it;
        int i3;
        String str4;
        dqi dqiVar3;
        vqi vqiVar;
        vqi vqiVar2;
        bqi bqiVar;
        sqi sqiVar;
        ?? r102;
        ShowPolicy$LimitedCount$Lifetime showPolicy$LimitedCount$Lifetime;
        Long l;
        List list3;
        ?? r192;
        DeliveryStateContextDto.PerformerSearchDto performerSearchDto;
        sa91 sa91Var;
        DeliveryStateContextDto.PerformerSearchDto performerSearchDto2;
        Object obj5;
        if (continuationImpl instanceof TrackingStateNetworkSource$getDeliveryState$1) {
            trackingStateNetworkSource$getDeliveryState$1 = (TrackingStateNetworkSource$getDeliveryState$1) continuationImpl;
            int i4 = trackingStateNetworkSource$getDeliveryState$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                trackingStateNetworkSource$getDeliveryState$1.label = i4 - Integer.MIN_VALUE;
                Object obj6 = trackingStateNetworkSource$getDeliveryState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = trackingStateNetworkSource$getDeliveryState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj6);
                    an2<Responses$DeliveryStateResponseDto> a = ((DeliveryStateApi) this.a.get()).a(new DeliveryStateRequestDto(str, this.d));
                    trackingStateNetworkSource$getDeliveryState$1.L$0 = str;
                    trackingStateNetworkSource$getDeliveryState$1.L$1 = pxy0Var;
                    trackingStateNetworkSource$getDeliveryState$1.L$2 = null;
                    trackingStateNetworkSource$getDeliveryState$1.label = 1;
                    ru.yandex.taxi.logistics.sdk.network.b bVar = (ru.yandex.taxi.logistics.sdk.network.b) a;
                    obj6 = bVar.e(bVar.a, trackingStateNetworkSource$getDeliveryState$1);
                    if (obj6 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str2 = str;
                    tlsVar = pxy0Var;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tlsVar = (tls) trackingStateNetworkSource$getDeliveryState$1.L$1;
                    String str5 = (String) trackingStateNetworkSource$getDeliveryState$1.L$0;
                    kotlin.b.b(obj6);
                    str2 = str5;
                }
                io2Var = (io2) obj6;
                jgz jgzVar = jgz.a;
                jgzVar.h("DeliveryTrackingSource");
                jgz.a("Delivery state request for " + str2, new Object[0]);
                tlsVar.invoke(io2Var.a());
                if (io2Var instanceof ho2) {
                    if (!(io2Var instanceof go2)) {
                        w511.b();
                        return null;
                    }
                    ps50 ps50Var = ((go2) io2Var).a;
                    jgzVar.h("DeliveryTrackingSource");
                    jgz.a("Delivery state error for " + str2 + Extension.FIX_SPACE + ps50Var, new Object[0]);
                    ds0 ds0Var = this.c;
                    ds0Var.getClass();
                    if ((ps50Var instanceof ls50) && 400 <= (i2 = ((ls50) ps50Var).a) && i2 < 500) {
                        LinkedHashMap x = g8e.x("endpoint", "v1/delivery/state");
                        x.put("http_status_code", Integer.valueOf(i2));
                        x.put("order_id", str2);
                        griVar = null;
                        ds0Var.a.a.o("DeliveryNetworkEndpointError", null, x);
                    } else {
                        griVar = null;
                    }
                    return new rz50(griVar, ps50Var, 1);
                }
                Responses$DeliveryStateResponseDto responses$DeliveryStateResponseDto = (Responses$DeliveryStateResponseDto) ((ho2) io2Var).a;
                responses$DeliveryStateResponseDto.getEtag();
                DeliveryStateDto state = responses$DeliveryStateResponseDto.getState();
                if (state == null) {
                    return null;
                }
                zri zriVar = this.b;
                r6i r6iVar = zriVar.h;
                ow owVar = zriVar.a;
                Boolean promotionBannersEnabled = state.getContext().getPromotionBannersEnabled();
                boolean booleanValue = promotionBannersEnabled != null ? promotionBannersEnabled.booleanValue() : true;
                Boolean isPerformerPositionAvailable = state.getContext().isPerformerPositionAvailable();
                Boolean bool = Boolean.TRUE;
                boolean l2 = jl40.l(isPerformerPositionAvailable, bool);
                boolean l3 = jl40.l(state.getContext().getPresentAsCompleted(), bool);
                DeliveryStateContextDto.PerformerSearchDto performerSearch = state.getContext().getPerformerSearch();
                List list4 = EmptyList.a;
                if (performerSearch != null) {
                    boolean isInProgress = performerSearch.isInProgress();
                    s701 s701Var = zriVar.d;
                    if (isInProgress) {
                        l = Long.valueOf(s701Var.a(str2));
                    } else {
                        s701Var.b(str2);
                        l = null;
                    }
                    Long estimate = performerSearch.getEstimate();
                    Long valueOf = estimate != null ? Long.valueOf(estimate.longValue() * 1000) : null;
                    List<DynamicSearchStatusDto> dynamicSearchStatuses = performerSearch.getDynamicSearchStatuses();
                    if (dynamicSearchStatuses != null) {
                        List<DynamicSearchStatusDto> list5 = dynamicSearchStatuses;
                        th = null;
                        list3 = new ArrayList(tcc.n(list5, 10));
                        for (DynamicSearchStatusDto dynamicSearchStatusDto : list5) {
                            list3.add(new y8n((int) dynamicSearchStatusDto.getStatusDisplayTime(), dynamicSearchStatusDto.getDynamicSummary(), dynamicSearchStatusDto.getDynamicDescription()));
                            booleanValue = booleanValue;
                        }
                    } else {
                        th = null;
                        list3 = list4;
                    }
                    z = booleanValue;
                    DynamicSearchTimelineDto dynamicSearchTimeline = performerSearch.getDynamicSearchTimeline();
                    if (dynamicSearchTimeline != null) {
                        if (dynamicSearchTimeline instanceof DynamicSearchTimelineDto.DynamicSearchTimeline_AnimatablesDto) {
                            List<DynamicSearchTimelineAnimatableDto> timelines = ((DynamicSearchTimelineDto.DynamicSearchTimeline_AnimatablesDto) dynamicSearchTimeline).b.getTimelines();
                            int i5 = 10;
                            ArrayList arrayList7 = new ArrayList(tcc.n(timelines, 10));
                            Iterator it2 = timelines.iterator();
                            while (it2.hasNext()) {
                                List<DynamicSearchTimelineStageDto> stages = ((DynamicSearchTimelineAnimatableDto) it2.next()).getStages();
                                DeliveryStateDto deliveryStateDto2 = state;
                                ArrayList arrayList8 = new ArrayList(tcc.n(stages, i5));
                                Iterator it3 = stages.iterator();
                                while (it3.hasNext()) {
                                    DynamicSearchTimelineStageDto dynamicSearchTimelineStageDto = (DynamicSearchTimelineStageDto) it3.next();
                                    DeliveryStateContextDto.PerformerSearchDto performerSearchDto3 = performerSearch;
                                    List list6 = list4;
                                    long displayDuration = dynamicSearchTimelineStageDto.getDisplayDuration() * 1000;
                                    String dynamicDescription = dynamicSearchTimelineStageDto.getDynamicDescription();
                                    DynamicSearchTimelineIconDto icon = dynamicSearchTimelineStageDto.getIcon();
                                    Iterator it4 = it3;
                                    arrayList8.add(new zcz0(displayDuration, dynamicDescription, icon != null ? zri.a(icon) : th));
                                    performerSearch = performerSearchDto3;
                                    it3 = it4;
                                    list4 = list6;
                                }
                                arrayList7.add(new x8n(arrayList8));
                                state = deliveryStateDto2;
                                i5 = 10;
                            }
                            deliveryStateDto = state;
                            performerSearchDto2 = performerSearch;
                            list = list4;
                            obj5 = new z8n(arrayList7);
                        } else {
                            deliveryStateDto = state;
                            performerSearchDto2 = performerSearch;
                            list = list4;
                            if (dynamicSearchTimeline instanceof DynamicSearchTimelineDto.DynamicSearchTimeline_IdleDto) {
                                DynamicSearchTimelineIdleDto dynamicSearchTimelineIdleDto = ((DynamicSearchTimelineDto.DynamicSearchTimeline_IdleDto) dynamicSearchTimeline).b;
                                int stages2 = dynamicSearchTimelineIdleDto.getStages();
                                DynamicSearchTimelineIconDto icon2 = dynamicSearchTimelineIdleDto.getIcon();
                                obj5 = new a9n(stages2, icon2 != null ? zri.a(icon2) : th);
                            } else {
                                if (!(dynamicSearchTimeline instanceof DynamicSearchTimelineDto.Unknown_DynamicSearchTimelineDto)) {
                                    w511.b();
                                    return th;
                                }
                                obj5 = th;
                            }
                        }
                        DeliveryStateContextDto.PerformerSearchDto performerSearchDto4 = performerSearchDto2;
                        r192 = obj5;
                        performerSearchDto = performerSearchDto4;
                    } else {
                        deliveryStateDto = state;
                        list = list4;
                        r192 = th;
                        performerSearchDto = performerSearch;
                    }
                    MapAnimationDto mapAnimation = performerSearchDto.getMapAnimation();
                    if (mapAnimation instanceof MapAnimationDto.MapAnimation_CirclesPulsarDto) {
                        sa91Var = gqi.a;
                    } else {
                        if (!(mapAnimation instanceof MapAnimationDto.Unknown_MapAnimationDto) && mapAnimation != null) {
                            w511.b();
                            return th;
                        }
                        sa91Var = hqi.a;
                    }
                    lqiVar = new lqi(l, valueOf, list3, r192, sa91Var);
                } else {
                    deliveryStateDto = state;
                    list = list4;
                    th = null;
                    z = booleanValue;
                    lqiVar = null;
                }
                Boolean shimmering = deliveryStateDto.getContext().getShimmering();
                boolean booleanValue2 = shimmering != null ? shimmering.booleanValue() : false;
                String providerStatus = deliveryStateDto.getContext().getProviderStatus();
                String providerTariffClass = deliveryStateDto.getContext().getProviderTariffClass();
                String role = deliveryStateDto.getContext().getRole();
                Long serverTime = deliveryStateDto.getContext().getServerTime();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                long I = serverTime != null ? vng.I() - timeUnit.toMillis(serverTime.longValue()) : 0L;
                TrackingPopupDto trackingPopup = deliveryStateDto.getContext().getTrackingPopup();
                if (trackingPopup != null) {
                    PopupSettingsDto popupSettings = trackingPopup.getPopupSettings();
                    if (popupSettings instanceof PopupSettingsDto.PopupSettings_UrbanAdsDto) {
                        UrbanAdsSettingsDto urbanAdsSettingsDto = ((PopupSettingsDto.PopupSettings_UrbanAdsDto) popupSettings).b;
                        String page = urbanAdsSettingsDto.getPage();
                        UrbanAdsSettingsDto.OverridesDto overrides = urbanAdsSettingsDto.getOverrides();
                        sqiVar = new rqi(new fri(page, overrides != null ? new eri(overrides.getPath(), overrides.getExperiments()) : th));
                    } else {
                        if (!(popupSettings instanceof PopupSettingsDto.Unknown_PopupSettingsDto)) {
                            w511.b();
                            return th;
                        }
                        sqiVar = qqi.a;
                    }
                    ShowPolicyDto showPolicy = trackingPopup.getShowPolicy();
                    if (showPolicy instanceof ShowPolicyDto.ShowPolicy_LimitedDto) {
                        LimitedCountShowPolicyDto limitedCountShowPolicyDto = ((ShowPolicyDto.ShowPolicy_LimitedDto) showPolicy).b;
                        int maxShowCount = limitedCountShowPolicyDto.getMaxShowCount();
                        String cacheKey = limitedCountShowPolicyDto.getCacheKey();
                        int i6 = yri.a[limitedCountShowPolicyDto.getPolicyLifetime().ordinal()];
                        if (i6 == 1) {
                            showPolicy$LimitedCount$Lifetime = ShowPolicy$LimitedCount$Lifetime.PERSISTENT;
                        } else {
                            if (i6 != 2) {
                                w511.b();
                                return th;
                            }
                            showPolicy$LimitedCount$Lifetime = ShowPolicy$LimitedCount$Lifetime.SESSION;
                        }
                        r102 = new l8s0(cacheKey, maxShowCount, showPolicy$LimitedCount$Lifetime);
                    } else {
                        if (!(showPolicy instanceof ShowPolicyDto.Unknown_ShowPolicyDto)) {
                            w511.b();
                            return th;
                        }
                        r102 = th;
                    }
                    r21 = new dri(sqiVar, r102);
                } else {
                    r21 = th;
                }
                AdsBannerDto adsBanner = deliveryStateDto.getContext().getAdsBanner();
                if (adsBanner != null) {
                    AdsBannerSettingsDto adsBannerSettings = adsBanner.getAdsBannerSettings();
                    if (adsBannerSettings instanceof AdsBannerSettingsDto.AdsBannerSettings_UrbanAdsDto) {
                        UrbanAdsSettingsDto urbanAdsSettingsDto2 = ((AdsBannerSettingsDto.AdsBannerSettings_UrbanAdsDto) adsBannerSettings).b;
                        String page2 = urbanAdsSettingsDto2.getPage();
                        UrbanAdsSettingsDto.OverridesDto overrides2 = urbanAdsSettingsDto2.getOverrides();
                        bqiVar = new aqi(new fri(page2, overrides2 != null ? new eri(overrides2.getPath(), overrides2.getExperiments()) : th));
                    } else {
                        if (!(adsBannerSettings instanceof AdsBannerSettingsDto.Unknown_AdsBannerSettingsDto)) {
                            w511.b();
                            return th;
                        }
                        bqiVar = zpi.a;
                    }
                    r22 = new ypi(bqiVar);
                } else {
                    r22 = th;
                }
                ObjectsOverMapSettingsDto objectsOverMapSettings = deliveryStateDto.getContext().getObjectsOverMapSettings();
                dqi dqiVar4 = new dqi(z, l2, l3, lqiVar, booleanValue2, providerStatus, providerTariffClass, role, I, r21, r22, objectsOverMapSettings != null ? new iqi(objectsOverMapSettings.getScreen()) : th);
                List<StatePointDto> sortedRoutePoints = deliveryStateDto.getSortedRoutePoints();
                ArrayList arrayList9 = new ArrayList(tcc.n(sortedRoutePoints, 10));
                Iterator it5 = sortedRoutePoints.iterator();
                int i7 = 0;
                while (it5.hasNext()) {
                    Object next = it5.next();
                    int i8 = i7 + 1;
                    if (i7 < 0) {
                        scc.m();
                        throw th;
                    }
                    StatePointDto statePointDto = (StatePointDto) next;
                    long j = i7;
                    Set N0 = kotlin.collections.a.N0(deliveryStateDto.getActiveRoutePoints());
                    hxb0 hxb0Var = zriVar.e;
                    if (statePointDto instanceof StatePointDto.StatePoint_AnotherOrderPointDto) {
                        AnotherOrderPointDto anotherOrderPointDto = ((StatePointDto.StatePoint_AnotherOrderPointDto) statePointDto).b;
                        it = it5;
                        i3 = i8;
                        str4 = str2;
                        dqiVar3 = dqiVar4;
                        vqiVar = new vqi(new doe(anotherOrderPointDto.getCoordinates().get(1).doubleValue(), anotherOrderPointDto.getCoordinates().get(0).doubleValue()), N0.contains(Long.valueOf(j)));
                    } else {
                        it = it5;
                        i3 = i8;
                        str4 = str2;
                        dqiVar3 = dqiVar4;
                        if (statePointDto instanceof StatePointDto.StatePoint_DestinationDto) {
                            OrderPointDto orderPointDto = ((StatePointDto.StatePoint_DestinationDto) statePointDto).b;
                            String pointId = orderPointDto.getPointId();
                            boolean contains = N0.contains(Long.valueOf(j));
                            PointVisitStatusDto visitStatus = orderPointDto.getVisitStatus();
                            PointType pointType = PointType.DESTINATION;
                            String uri = orderPointDto.getUri();
                            doe doeVar = new doe(orderPointDto.getCoordinates().get(1).doubleValue(), orderPointDto.getCoordinates().get(0).doubleValue());
                            String fullText = orderPointDto.getFullText();
                            String shortText = orderPointDto.getShortText();
                            String areaDescription = orderPointDto.getAreaDescription();
                            String entrance = orderPointDto.getEntrance();
                            String floor = orderPointDto.getFloor();
                            String room = orderPointDto.getRoom();
                            String code = orderPointDto.getCode();
                            ContactDto contact = orderPointDto.getContact();
                            ?? cqiVar = contact != null ? new cqi(contact.getName(), contact.getPhone()) : th;
                            String comment = orderPointDto.getComment();
                            PointPinDto pin = orderPointDto.getPin();
                            hxb0Var.getClass();
                            mm91 a2 = hxb0.a(pin);
                            List<PhotoInfoDto> commentImages = orderPointDto.getCommentImages();
                            vqiVar2 = new wqi(pointId, contains, visitStatus, pointType, uri, doeVar, fullText, shortText, areaDescription, entrance, floor, room, code, cqiVar, comment, a2, commentImages != null ? zri.b(commentImages) : list);
                        } else if (statePointDto instanceof StatePointDto.StatePoint_ReturnDto) {
                            OrderPointDto orderPointDto2 = ((StatePointDto.StatePoint_ReturnDto) statePointDto).b;
                            String pointId2 = orderPointDto2.getPointId();
                            boolean contains2 = N0.contains(Long.valueOf(j));
                            PointVisitStatusDto visitStatus2 = orderPointDto2.getVisitStatus();
                            PointType pointType2 = PointType.RETURN;
                            String uri2 = orderPointDto2.getUri();
                            doe doeVar2 = new doe(orderPointDto2.getCoordinates().get(1).doubleValue(), orderPointDto2.getCoordinates().get(0).doubleValue());
                            String fullText2 = orderPointDto2.getFullText();
                            String shortText2 = orderPointDto2.getShortText();
                            String areaDescription2 = orderPointDto2.getAreaDescription();
                            String entrance2 = orderPointDto2.getEntrance();
                            String floor2 = orderPointDto2.getFloor();
                            String room2 = orderPointDto2.getRoom();
                            String code2 = orderPointDto2.getCode();
                            ContactDto contact2 = orderPointDto2.getContact();
                            ?? cqiVar2 = contact2 != null ? new cqi(contact2.getName(), contact2.getPhone()) : th;
                            String comment2 = orderPointDto2.getComment();
                            PointPinDto pin2 = orderPointDto2.getPin();
                            hxb0Var.getClass();
                            mm91 a3 = hxb0.a(pin2);
                            List<PhotoInfoDto> commentImages2 = orderPointDto2.getCommentImages();
                            vqiVar2 = new wqi(pointId2, contains2, visitStatus2, pointType2, uri2, doeVar2, fullText2, shortText2, areaDescription2, entrance2, floor2, room2, code2, cqiVar2, comment2, a3, commentImages2 != null ? zri.b(commentImages2) : list);
                        } else if (statePointDto instanceof StatePointDto.StatePoint_SourceDto) {
                            OrderPointDto orderPointDto3 = ((StatePointDto.StatePoint_SourceDto) statePointDto).b;
                            String pointId3 = orderPointDto3.getPointId();
                            boolean contains3 = N0.contains(Long.valueOf(j));
                            PointVisitStatusDto visitStatus3 = orderPointDto3.getVisitStatus();
                            PointType pointType3 = PointType.SOURCE;
                            String uri3 = orderPointDto3.getUri();
                            doe doeVar3 = new doe(orderPointDto3.getCoordinates().get(1).doubleValue(), orderPointDto3.getCoordinates().get(0).doubleValue());
                            String fullText3 = orderPointDto3.getFullText();
                            String shortText3 = orderPointDto3.getShortText();
                            String areaDescription3 = orderPointDto3.getAreaDescription();
                            String entrance3 = orderPointDto3.getEntrance();
                            String floor3 = orderPointDto3.getFloor();
                            String room3 = orderPointDto3.getRoom();
                            String code3 = orderPointDto3.getCode();
                            ContactDto contact3 = orderPointDto3.getContact();
                            ?? cqiVar3 = contact3 != null ? new cqi(contact3.getName(), contact3.getPhone()) : th;
                            String comment3 = orderPointDto3.getComment();
                            PointPinDto pin3 = orderPointDto3.getPin();
                            hxb0Var.getClass();
                            mm91 a4 = hxb0.a(pin3);
                            List<PhotoInfoDto> commentImages3 = orderPointDto3.getCommentImages();
                            vqiVar2 = new wqi(pointId3, contains3, visitStatus3, pointType3, uri3, doeVar3, fullText3, shortText3, areaDescription3, entrance3, floor3, room3, code3, cqiVar3, comment3, a4, commentImages3 != null ? zri.b(commentImages3) : list);
                        } else {
                            if (!(statePointDto instanceof StatePointDto.Unknown_StatePointDto)) {
                                w511.b();
                                return th;
                            }
                            vqiVar = new vqi(new doe(0.0d, 0.0d), N0.contains(Long.valueOf(j)));
                        }
                        vqiVar = vqiVar2;
                    }
                    arrayList9.add(vqiVar);
                    str2 = str4;
                    i7 = i3;
                    dqiVar4 = dqiVar3;
                    it5 = it;
                }
                String str6 = str2;
                dqi dqiVar5 = dqiVar4;
                List<ActionDto> primaryActions = deliveryStateDto.getPrimaryActions();
                ArrayList arrayList10 = new ArrayList(tcc.n(primaryActions, 10));
                Iterator it6 = primaryActions.iterator();
                while (it6.hasNext()) {
                    arrayList10.add(owVar.h((ActionDto) it6.next()));
                }
                List<ActionDto> secondaryActions = deliveryStateDto.getSecondaryActions();
                ArrayList arrayList11 = new ArrayList(tcc.n(secondaryActions, 10));
                Iterator it7 = secondaryActions.iterator();
                while (it7.hasNext()) {
                    arrayList11.add(owVar.h((ActionDto) it7.next()));
                }
                String summary = deliveryStateDto.getSummary();
                String description = deliveryStateDto.getDescription();
                j5v j5vVar = zriVar.c;
                DeliveryIconStrategyDto iconStrategy = deliveryStateDto.getIconStrategy();
                j5vVar.getClass();
                i5v a5 = j5v.a(iconStrategy);
                PerformerDto performer = deliveryStateDto.getPerformer();
                if (performer != null) {
                    zriVar.b.getClass();
                    r19 = xwa0.a(performer);
                } else {
                    r19 = th;
                }
                dqi dqiVar6 = dqiVar5;
                Object meta = deliveryStateDto.getMeta();
                List<OnFirstLoadActionDto> onFirstLoadActions = deliveryStateDto.getOnFirstLoadActions();
                if (onFirstLoadActions != null) {
                    ArrayList arrayList12 = new ArrayList();
                    Iterator it8 = onFirstLoadActions.iterator();
                    while (it8.hasNext()) {
                        OnFirstLoadActionDto.ActionDto action = ((OnFirstLoadActionDto) it8.next()).getAction();
                        if (action instanceof ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.a) {
                            ActionOpenFormDto actionOpenFormDto = ((ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.a) action).a;
                            owVar.getClass();
                            obj4 = ow.a(actionOpenFormDto);
                        } else {
                            if (!jl40.l(action, ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.b.a)) {
                                w511.b();
                                return th;
                            }
                            obj4 = th;
                        }
                        if (obj4 != null) {
                            arrayList12.add(obj4);
                        }
                    }
                    r18 = arrayList12;
                } else {
                    r18 = th;
                }
                PerformerRouteDto performerRoute = deliveryStateDto.getPerformerRoute();
                if (performerRoute != null) {
                    List<PerformerRoutePointDto> sortedRoutePoints2 = performerRoute.getSortedRoutePoints();
                    ArrayList arrayList13 = new ArrayList(tcc.n(sortedRoutePoints2, 10));
                    Iterator it9 = sortedRoutePoints2.iterator();
                    while (it9.hasNext()) {
                        PerformerRoutePointDto performerRoutePointDto = (PerformerRoutePointDto) it9.next();
                        arrayList13.add(new jqi(new doe(performerRoutePointDto.getCoordinates().get(1).doubleValue(), performerRoutePointDto.getCoordinates().get(0).doubleValue())));
                        it9 = it9;
                        arrayList9 = arrayList9;
                        arrayList10 = arrayList10;
                        str6 = str6;
                        dqiVar6 = dqiVar6;
                        arrayList11 = arrayList11;
                    }
                    String str7 = str6;
                    dqiVar = dqiVar6;
                    arrayList = arrayList9;
                    arrayList2 = arrayList10;
                    arrayList3 = arrayList11;
                    str3 = str7;
                    r20 = new kqi(arrayList13);
                } else {
                    dqiVar = dqiVar6;
                    arrayList = arrayList9;
                    arrayList2 = arrayList10;
                    arrayList3 = arrayList11;
                    str3 = str6;
                    r20 = th;
                }
                PostcardConsumerInfoDto postcard = deliveryStateDto.getPostcard();
                if (postcard != null) {
                    arrayList4 = arrayList3;
                    r23 = new tqi(new uqi(postcard.getContent().getUrl()), postcard.getCellTitle(), postcard.getUserMessage(), postcard.getSummaryPostcard());
                } else {
                    arrayList4 = arrayList3;
                    r23 = th;
                }
                p6i a6 = r6iVar.a(deliveryStateDto.getContentSections());
                p6i a7 = r6iVar.a(deliveryStateDto.getBottomContentSections());
                TimelineDto timeline = deliveryStateDto.getTimeline();
                Object b = timeline != null ? cbz0.b(timeline) : th;
                CostDetailsDto costDetails = deliveryStateDto.getCostDetails();
                if (costDetails != null) {
                    List<CostDetailsComponentDto> components = costDetails.getComponents();
                    if (components != null) {
                        List<CostDetailsComponentDto> list7 = components;
                        r10 = new ArrayList(tcc.n(list7, 10));
                        for (CostDetailsComponentDto costDetailsComponentDto : list7) {
                            r10.add(new fqi(costDetailsComponentDto.getTitle(), costDetailsComponentDto.getValue()));
                            a6 = a6;
                        }
                    } else {
                        r10 = list;
                    }
                    p6iVar = a6;
                    List list8 = list;
                    r25 = new eqi(r10);
                    list2 = list8;
                } else {
                    p6iVar = a6;
                    list2 = list;
                    r25 = th;
                }
                CompletedStateButtonsDto completedStateButtons = deliveryStateDto.getCompletedStateButtons();
                if (completedStateButtons != null) {
                    vzc vzcVar = zriVar.i;
                    Boolean restorePreorder = deliveryStateDto.getContext().getRestorePreorder();
                    boolean booleanValue3 = restorePreorder != null ? restorePreorder.booleanValue() : false;
                    vzcVar.getClass();
                    b4u0 a8 = vzc.a(completedStateButtons.getPrimary(), booleanValue3);
                    StateButtonDto secondary = completedStateButtons.getSecondary();
                    r26 = new uzc(a8, secondary != null ? vzc.a(secondary, booleanValue3) : th);
                } else {
                    r26 = th;
                }
                AccentStateButtonDto accentStateButton = deliveryStateDto.getAccentStateButton();
                if (accentStateButton != null) {
                    String backgroundColor = accentStateButton.getBackgroundColor();
                    String title2 = accentStateButton.getTitle();
                    String titleColor = accentStateButton.getTitleColor();
                    String subtitle2 = accentStateButton.getSubtitle();
                    String subtitleColor = accentStateButton.getSubtitleColor();
                    String leadIconTag = accentStateButton.getLeadIconTag();
                    AccentButtonActionDto action2 = accentStateButton.getAction();
                    if (action2 instanceof AccentButtonActionDto.AccentButtonAction_DeeplinkDto) {
                        qa91Var = new tpi(((AccentButtonActionDto.AccentButtonAction_DeeplinkDto) action2).b.getDeeplink());
                    } else if (action2 instanceof AccentButtonActionDto.AccentButtonAction_EmptyActionDto) {
                        qa91Var = upi.b;
                    } else if (action2 instanceof AccentButtonActionDto.AccentButtonAction_OrderStateActionDto) {
                        vpiVar = new vpi(owVar.h(((AccentButtonActionDto.AccentButtonAction_OrderStateActionDto) action2).b.getAction()));
                        r27 = new xpi(backgroundColor, title2, titleColor, subtitle2, subtitleColor, leadIconTag, vpiVar, accentStateButton.getMetricaLabel());
                    } else {
                        if (!(action2 instanceof AccentButtonActionDto.Unknown_AccentButtonActionDto)) {
                            w511.b();
                            return th;
                        }
                        qa91Var = wpi.b;
                    }
                    vpiVar = qa91Var;
                    r27 = new xpi(backgroundColor, title2, titleColor, subtitle2, subtitleColor, leadIconTag, vpiVar, accentStateButton.getMetricaLabel());
                } else {
                    r27 = th;
                }
                pki pkiVar = zriVar.f;
                PollDto poll = deliveryStateDto.getPoll();
                pkiVar.getClass();
                if (poll == null) {
                    pqiVar = th;
                    p6iVar2 = a7;
                    arrayList5 = arrayList;
                    obj = b;
                    arrayList6 = arrayList2;
                } else {
                    List list9 = list2;
                    nqi nqiVar = new nqi(poll.getHeader().getTitleDefault(), poll.getHeader().getTitleCompleted(), poll.getHeader().getCompletedEmojiImageTag(), poll.getHeader().getImageTag());
                    List<SubpollDto> subpolls = poll.getSubpolls();
                    ArrayList arrayList14 = new ArrayList();
                    Iterator it10 = subpolls.iterator();
                    while (it10.hasNext()) {
                        ycc.r(((SubpollDto) it10.next()).getQuestions(), arrayList14);
                    }
                    int d = gw00.d(tcc.n(arrayList14, 10));
                    if (d < 16) {
                        d = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                    Iterator it11 = arrayList14.iterator();
                    Object obj7 = b;
                    while (it11.hasNext()) {
                        PollQuestionDto pollQuestionDto = (PollQuestionDto) it11.next();
                        String id = pollQuestionDto.getId();
                        String id2 = pollQuestionDto.getId();
                        String text = pollQuestionDto.getText();
                        Iterator it12 = it11;
                        p6i p6iVar4 = a7;
                        DeliveryState$Poll$Question$ChoicesType deliveryState$Poll$Question$ChoicesType = oki.a[pollQuestionDto.getChoicesType().ordinal()] == 1 ? DeliveryState$Poll$Question$ChoicesType.MULTI : DeliveryState$Poll$Question$ChoicesType.SINGLE;
                        DeliveryState$Poll$Question$AnswersAlignment deliveryState$Poll$Question$AnswersAlignment = oki.b[pollQuestionDto.getAnswersAlignment().ordinal()] == 1 ? DeliveryState$Poll$Question$AnswersAlignment.TRAIL : DeliveryState$Poll$Question$AnswersAlignment.BOTTOM;
                        List<PollQuestionAnswerDto> answers = pollQuestionDto.getAnswers();
                        ArrayList arrayList15 = arrayList;
                        Object obj8 = obj7;
                        ArrayList arrayList16 = new ArrayList(tcc.n(answers, 10));
                        Iterator it13 = answers.iterator();
                        while (it13.hasNext()) {
                            PollQuestionAnswerDto pollQuestionAnswerDto = (PollQuestionAnswerDto) it13.next();
                            Iterator it14 = it13;
                            String id3 = pollQuestionAnswerDto.getId();
                            String text2 = pollQuestionAnswerDto.getText();
                            Long emojiDecimalCode = pollQuestionAnswerDto.getEmojiDecimalCode();
                            ArrayList arrayList17 = arrayList2;
                            PollDto pollDto = poll;
                            arrayList16.add(new mqi(id3, text2, emojiDecimalCode != null ? Integer.valueOf((int) emojiDecimalCode.longValue()) : th));
                            it13 = it14;
                            arrayList2 = arrayList17;
                            poll = pollDto;
                        }
                        ArrayList arrayList18 = arrayList2;
                        PollDto pollDto2 = poll;
                        List<PollQuestionAnswerDto> answers2 = pollQuestionDto.getAnswers();
                        int d2 = gw00.d(tcc.n(answers2, 10));
                        if (d2 < 16) {
                            d2 = 16;
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(d2);
                        for (PollQuestionAnswerDto pollQuestionAnswerDto2 : answers2) {
                            linkedHashMap2.put(pollQuestionAnswerDto2.getId(), pollQuestionAnswerDto2.getNextQuestionId());
                        }
                        linkedHashMap.put(id, new oqi(id2, text, deliveryState$Poll$Question$ChoicesType, arrayList16, linkedHashMap2, deliveryState$Poll$Question$AnswersAlignment));
                        a7 = p6iVar4;
                        arrayList = arrayList15;
                        it11 = it12;
                        obj7 = obj8;
                        arrayList2 = arrayList18;
                        poll = pollDto2;
                    }
                    p6iVar2 = a7;
                    arrayList5 = arrayList;
                    obj = obj7;
                    arrayList6 = arrayList2;
                    PollDto pollDto3 = poll;
                    List<SubpollDto> subpolls2 = pollDto3.getSubpolls();
                    ArrayList arrayList19 = new ArrayList(tcc.n(subpolls2, 10));
                    Iterator it15 = subpolls2.iterator();
                    while (it15.hasNext()) {
                        arrayList19.add(((SubpollDto) it15.next()).getRootQuestionId());
                    }
                    List<SubpollDto> subpolls3 = pollDto3.getSubpolls();
                    ArrayList arrayList20 = new ArrayList();
                    Iterator it16 = subpolls3.iterator();
                    while (it16.hasNext()) {
                        List userChoices = ((SubpollDto) it16.next()).getUserChoices();
                        if (userChoices == null) {
                            userChoices = list9;
                        }
                        ycc.r(userChoices, arrayList20);
                    }
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    Iterator it17 = arrayList20.iterator();
                    while (it17.hasNext()) {
                        PollUserAnswerChoiceDto pollUserAnswerChoiceDto = (PollUserAnswerChoiceDto) it17.next();
                        String questionId = pollUserAnswerChoiceDto.getQuestionId();
                        Object obj9 = linkedHashMap3.get(questionId);
                        if (obj9 == null) {
                            obj9 = qv10.w(questionId, linkedHashMap3);
                        }
                        ((List) obj9).add(pollUserAnswerChoiceDto.getAnswersIds());
                    }
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap(gw00.d(linkedHashMap3.size()));
                    for (Map.Entry entry : linkedHashMap3.entrySet()) {
                        linkedHashMap4.put(entry.getKey(), kotlin.collections.a.N0(tcc.o((List) entry.getValue())));
                    }
                    pqiVar = new pqi(nqiVar, linkedHashMap, arrayList19, linkedHashMap4);
                }
                PaidWaitingInfoDto paidWaitingInfo = deliveryStateDto.getPaidWaitingInfo();
                if (paidWaitingInfo != null) {
                    zriVar.g.getClass();
                    r29 = new fa90(paidWaitingInfo.getFreeWaitingUntil(), paidWaitingInfo.getPaidWaitingTitle(), paidWaitingInfo.getWaitingPrice());
                } else {
                    r29 = th;
                }
                OrderingControlDto orderingControl = deliveryStateDto.getOrderingControl();
                if (orderingControl != null) {
                    zriVar.j.getClass();
                    PostOrderDetailFormDto detailForm = orderingControl.getDetailForm();
                    if (detailForm != null) {
                        boolean isForced = detailForm.isForced();
                        Integer forcedDisplayDelay = detailForm.getForcedDisplayDelay();
                        int intValue = forcedDisplayDelay != null ? forcedDisplayDelay.intValue() : 0;
                        DetailFormLayoutDto layout = detailForm.getLayout();
                        if (layout != null) {
                            DetailFormHeaderLayoutDto header = layout.getHeader();
                            ?? wee0Var = header != null ? new wee0(header.getHeadline(), header.getDescription()) : th;
                            DetailFormRoutePointLayoutDto source = layout.getSource();
                            ?? b2 = source != null ? ac80.b(source) : th;
                            DetailFormRoutePointLayoutDto destination = layout.getDestination();
                            ?? b3 = destination != null ? ac80.b(destination) : th;
                            List<DetailFormRoutePointFieldLayoutDto> extraFields = layout.getExtraFields();
                            if (extraFields != null) {
                                List<DetailFormRoutePointFieldLayoutDto> list10 = extraFields;
                                ArrayList arrayList21 = new ArrayList(tcc.n(list10, 10));
                                Iterator it18 = list10.iterator();
                                while (it18.hasNext()) {
                                    arrayList21.add(ac80.a((DetailFormRoutePointFieldLayoutDto) it18.next()));
                                }
                                r462 = arrayList21;
                            } else {
                                r462 = th;
                            }
                            DetailFormButtonLayoutDto button = layout.getButton();
                            ?? vee0Var = button != null ? new vee0(button.getTitle()) : th;
                            PhotocommentsConfigDto photocomments = layout.getPhotocomments();
                            ?? ffe0Var = photocomments != null ? new ffe0(photocomments.getMaxPhotoWidth(), photocomments.getMaxPhotoHeight(), photocomments.getMaxPointPhotocomments()) : th;
                            VerticalBarDto verticalBar = layout.getVerticalBar();
                            r1 = new efe0(wee0Var, b2, b3, r462, vee0Var, ffe0Var, verticalBar != null ? new dfe0(verticalBar.getColor(), verticalBar.getWidth()) : th);
                        } else {
                            r1 = th;
                        }
                        r3 = new gfe0(isForced, intValue, r1);
                    } else {
                        r3 = th;
                    }
                    dqiVar2 = dqiVar;
                    p6iVar3 = p6iVar2;
                    r30 = new zb80(r3);
                } else {
                    dqiVar2 = dqiVar;
                    p6iVar3 = p6iVar2;
                    r30 = th;
                }
                r360 r360Var = zriVar.k;
                NeuroPostcardDto neuroPostcard = deliveryStateDto.getNeuroPostcard();
                gd3 gd3Var = r360Var.a;
                if (neuroPostcard == null) {
                    obj2 = th;
                } else {
                    NeuroPostcardStageDto stage = neuroPostcard.getStage();
                    if (stage instanceof NeuroPostcardStageDto.NeuroPostcardStage_InitialStageDto) {
                        f460Var = c460.a;
                    } else {
                        if (stage instanceof NeuroPostcardStageDto.NeuroPostcardStage_EditingStageDto) {
                            NeuroPostcardLabelsDto labels = ((NeuroPostcardStageDto.NeuroPostcardStage_EditingStageDto) stage).b.getLabels();
                            a460Var = new b460(labels != null ? r360Var.b(labels) : th);
                        } else if (stage instanceof NeuroPostcardStageDto.NeuroPostcardStage_SendingStageDto) {
                            NeuroPostcardLabelsDto labels2 = ((NeuroPostcardStageDto.NeuroPostcardStage_SendingStageDto) stage).b.getLabels();
                            a460Var = new d460(labels2 != null ? r360Var.b(labels2) : th);
                        } else if (stage instanceof NeuroPostcardStageDto.NeuroPostcardStage_CompletedStageDto) {
                            NeuroPostcardLabelsDto labels3 = ((NeuroPostcardStageDto.NeuroPostcardStage_CompletedStageDto) stage).b.getLabels();
                            a460Var = new a460(labels3 != null ? r360Var.b(labels3) : th);
                        } else {
                            if (!(stage instanceof NeuroPostcardStageDto.Unknown_NeuroPostcardStageDto)) {
                                Throwable th2 = th;
                                w511.b();
                                return th2;
                            }
                            f460Var = e460.a;
                        }
                        f460Var2 = a460Var;
                        image = neuroPostcard.getImage();
                        if (!(image instanceof NeuroPostcardDto.ImageDto.Image_ImageDto)) {
                            l460Var = new m460(r360.c(((NeuroPostcardDto.ImageDto.Image_ImageDto) image).b));
                        } else if (image instanceof NeuroPostcardDto.ImageDto.Image_LottieDto) {
                            NeuroPostcardLottieDto neuroPostcardLottieDto = ((NeuroPostcardDto.ImageDto.Image_LottieDto) image).b;
                            l460Var = new l460(new n360(neuroPostcardLottieDto.getUrl(), neuroPostcardLottieDto.getWidth(), neuroPostcardLottieDto.getHeight()));
                        } else {
                            if (image instanceof NeuroPostcardDto.ImageDto.Unknown_ImageDto) {
                                r44 = n460.a;
                            } else {
                                if (image != null) {
                                    Throwable th3 = th;
                                    w511.b();
                                    return th3;
                                }
                                r44 = th;
                            }
                            title = neuroPostcard.getTitle();
                            if (title != null) {
                                gd3Var.getClass();
                                r45 = gd3.b(title);
                            } else {
                                r45 = th;
                            }
                            subtitle = neuroPostcard.getSubtitle();
                            if (subtitle != null) {
                                gd3Var.getClass();
                                r46 = gd3.b(subtitle);
                            } else {
                                r46 = th;
                            }
                            buttons = neuroPostcard.getButtons();
                            if (buttons != null) {
                                List<NeuroPostcardButtonDto> list11 = buttons;
                                ArrayList arrayList22 = new ArrayList(tcc.n(list11, 10));
                                for (NeuroPostcardButtonDto neuroPostcardButtonDto : list11) {
                                    AttributedTextDto title3 = neuroPostcardButtonDto.getTitle();
                                    gd3Var.getClass();
                                    FormattedText b4 = gd3.b(title3);
                                    AttributedTextDto subtitle3 = neuroPostcardButtonDto.getSubtitle();
                                    ?? b5 = subtitle3 != null ? gd3.b(subtitle3) : th;
                                    int i9 = q360.a[neuroPostcardButtonDto.getStyle().ordinal()];
                                    if (i9 == 1) {
                                        neuroPostcardButton$Style = NeuroPostcardButton$Style.MAIN;
                                    } else if (i9 == 2) {
                                        neuroPostcardButton$Style = NeuroPostcardButton$Style.FLOATING;
                                    } else {
                                        if (i9 != 3) {
                                            w511.b();
                                            return th;
                                        }
                                        neuroPostcardButton$Style = NeuroPostcardButton$Style.MINOR;
                                    }
                                    NeuroPostcardButton$Style neuroPostcardButton$Style2 = neuroPostcardButton$Style;
                                    int i10 = q360.b[neuroPostcardButtonDto.getSize().ordinal()];
                                    if (i10 == 1) {
                                        neuroPostcardButton$Size = NeuroPostcardButton$Size.S;
                                    } else if (i10 == 2) {
                                        neuroPostcardButton$Size = NeuroPostcardButton$Size.M;
                                    } else {
                                        if (i10 != 3) {
                                            w511.b();
                                            return th;
                                        }
                                        neuroPostcardButton$Size = NeuroPostcardButton$Size.L;
                                    }
                                    arrayList22.add(new z260(b4, b5, neuroPostcardButton$Style2, neuroPostcardButton$Size, r360Var.a(neuroPostcardButtonDto.getAction()), neuroPostcardButtonDto.getMetricaLabel()));
                                }
                                r47 = arrayList22;
                            } else {
                                r47 = th;
                            }
                            NeuroPostcardActionDto action3 = neuroPostcard.getAction();
                            obj2 = new p460(f460Var2, r44, r45, r46, r47, action3 != null ? r360Var.a(action3) : th, neuroPostcard.getMetricaLabel());
                        }
                        r44 = l460Var;
                        title = neuroPostcard.getTitle();
                        if (title != null) {
                        }
                        subtitle = neuroPostcard.getSubtitle();
                        if (subtitle != null) {
                        }
                        buttons = neuroPostcard.getButtons();
                        if (buttons != null) {
                        }
                        NeuroPostcardActionDto action32 = neuroPostcard.getAction();
                        obj2 = new p460(f460Var2, r44, r45, r46, r47, action32 != null ? r360Var.a(action32) : th, neuroPostcard.getMetricaLabel());
                    }
                    f460Var2 = f460Var;
                    image = neuroPostcard.getImage();
                    if (!(image instanceof NeuroPostcardDto.ImageDto.Image_ImageDto)) {
                    }
                    r44 = l460Var;
                    title = neuroPostcard.getTitle();
                    if (title != null) {
                    }
                    subtitle = neuroPostcard.getSubtitle();
                    if (subtitle != null) {
                    }
                    buttons = neuroPostcard.getButtons();
                    if (buttons != null) {
                    }
                    NeuroPostcardActionDto action322 = neuroPostcard.getAction();
                    obj2 = new p460(f460Var2, r44, r45, r46, r47, action322 != null ? r360Var.a(action322) : th, neuroPostcard.getMetricaLabel());
                }
                TopAccentBarDto topAccentBar = deliveryStateDto.getTopAccentBar();
                if (topAccentBar != null) {
                    c1x0 c1x0Var = zriVar.l;
                    if (topAccentBar instanceof TopAccentBarDto.TopAccentBar_InfoDto) {
                        InfoTopAccentBarDto infoTopAccentBarDto = ((TopAccentBarDto.TopAccentBar_InfoDto) topAccentBar).b;
                        obj3 = new yqi(mus0.a((mus0) c1x0Var.a, infoTopAccentBarDto.getSlot()), infoTopAccentBarDto.getBackgroundColor(), infoTopAccentBarDto.getMetricaLabel());
                    } else if (topAccentBar instanceof TopAccentBarDto.TopAccentBar_TimerDto) {
                        TimerTopAccentBarDto timerTopAccentBarDto = ((TopAccentBarDto.TopAccentBar_TimerDto) topAccentBar).b;
                        String backgroundColor2 = timerTopAccentBarDto.getBackgroundColor();
                        kus0 a9 = mus0.a((mus0) c1x0Var.a, timerTopAccentBarDto.getContent().getSince());
                        SlotDto until = timerTopAccentBarDto.getContent().getUntil();
                        ?? a10 = until != null ? mus0.a((mus0) c1x0Var.a, until) : th;
                        TimerDto timer = timerTopAccentBarDto.getContent().getTimer();
                        obj3 = new ari(new zqi(a9, a10, new kez0(timer.getFormat(), timeUnit.toMillis(timer.getTimestamp()), timer.getPlaceholder())), backgroundColor2);
                    } else {
                        if (!(topAccentBar instanceof TopAccentBarDto.Unknown_TopAccentBarDto)) {
                            w511.b();
                            return th;
                        }
                        obj3 = bri.a;
                    }
                    r32 = obj3;
                } else {
                    r32 = th;
                }
                return new rz50(new gri(str3, dqiVar2, arrayList5, arrayList6, arrayList4, summary, description, a5, meta, r18, r19, r20, p6iVar, p6iVar3, r23, obj, r25, r26, r27, pqiVar, r29, r30, obj2, r32), th, 2);
            }
        }
        trackingStateNetworkSource$getDeliveryState$1 = new TrackingStateNetworkSource$getDeliveryState$1(this, continuationImpl);
        Object obj62 = trackingStateNetworkSource$getDeliveryState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = trackingStateNetworkSource$getDeliveryState$1.label;
        if (i != 0) {
        }
        io2Var = (io2) obj62;
        jgz jgzVar2 = jgz.a;
        jgzVar2.h("DeliveryTrackingSource");
        jgz.a("Delivery state request for " + str2, new Object[0]);
        tlsVar.invoke(io2Var.a());
        if (io2Var instanceof ho2) {
        }
    }
}
