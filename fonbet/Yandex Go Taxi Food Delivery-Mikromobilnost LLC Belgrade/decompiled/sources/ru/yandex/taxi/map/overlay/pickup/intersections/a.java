package ru.yandex.taxi.map.overlay.pickup.intersections;

import defpackage.lp00;
import defpackage.ouw;
import defpackage.tje;
import defpackage.tse;
import ru.yandex.taxi.map_common.map.intersection.Participant;
import ru.yandex.taxi.map_common.map.intersection.ParticipantRelationsMode;

/* loaded from: classes6.dex */
public final class a implements ouw {
    public final lp00 a;
    public final ru.yandex.taxi.favorites.address.api.experiment.a b;
    public final tse c;

    public a(lp00 lp00Var, ru.yandex.taxi.favorites.address.api.experiment.a aVar, tse tseVar) {
        this.a = lp00Var;
        this.b = aVar;
        this.c = tseVar;
    }

    @Override // defpackage.ouw
    public final void a() {
        Participant participant = Participant.ONLY_STEM_OF_PIN;
        Participant participant2 = Participant.PICKUP_POINT_LABELS_COLLECTION;
        ParticipantRelationsMode participantRelationsMode = ParticipantRelationsMode.ONE_TO_MANY;
        ru.yandex.taxi.map_common.map.intersection.a aVar = (ru.yandex.taxi.map_common.map.intersection.a) this.a;
        aVar.h(participant, participant2, participantRelationsMode);
        Participant participant3 = Participant.BODIES;
        Participant participant4 = Participant.PICKUP_POINT_DOTS_COLLECTION;
        ParticipantRelationsMode participantRelationsMode2 = ParticipantRelationsMode.MANY_TO_MANY;
        aVar.h(participant3, participant4, participantRelationsMode2);
        aVar.h(participant3, participant2, participantRelationsMode2);
        aVar.h(Participant.LABELS, participant2, participantRelationsMode2);
        aVar.h(Participant.BUBBLES, participant2, participantRelationsMode2);
        tje.N(this.c, null, null, new LayersIntersectionRules$registerIntersections$1(this, null), 3);
        Participant participant5 = Participant.PICKUP_POINT_MULTIEXIT_LABELS_COLLECTION;
        aVar.h(participant5, participant5, participantRelationsMode2);
        Participant participant6 = Participant.PICKUP_POINT_BUBBLES_COLLECTION;
        aVar.h(participant6, participant6, participantRelationsMode2);
        aVar.h(participant6, Participant.CLARIFY_POINT_BUBBLE, ParticipantRelationsMode.MANY_TO_ONE);
    }

    @Override // defpackage.ouw
    public final void b() {
        Participant participant = Participant.ONLY_STEM_OF_PIN;
        Participant participant2 = Participant.PICKUP_POINT_LABELS_COLLECTION;
        ru.yandex.taxi.map_common.map.intersection.a aVar = (ru.yandex.taxi.map_common.map.intersection.a) this.a;
        aVar.l(participant, participant2);
        Participant participant3 = Participant.BODIES;
        aVar.l(participant3, Participant.PICKUP_POINT_DOTS_COLLECTION);
        aVar.l(participant3, participant2);
        aVar.l(Participant.LABELS, participant2);
        aVar.l(Participant.BUBBLES, participant2);
        tje.N(this.c, null, null, new LayersIntersectionRules$unregisterIntersections$1(this, null), 3);
        Participant participant4 = Participant.PICKUP_POINT_MULTIEXIT_LABELS_COLLECTION;
        aVar.l(participant4, participant4);
        Participant participant5 = Participant.PICKUP_POINT_BUBBLES_COLLECTION;
        aVar.l(participant5, participant5);
        aVar.l(participant5, Participant.CLARIFY_POINT_BUBBLE);
    }

    @Override // defpackage.ouw
    public final void c() {
        Participant participant = Participant.ONLY_STEM_OF_PIN;
        Participant participant2 = Participant.PICKUP_POINT_LABELS_COLLECTION;
        ru.yandex.taxi.map_common.map.intersection.a aVar = (ru.yandex.taxi.map_common.map.intersection.a) this.a;
        aVar.b(participant, participant2);
        Participant participant3 = Participant.BODIES;
        aVar.b(participant3, Participant.PICKUP_POINT_DOTS_COLLECTION);
        aVar.b(participant3, participant2);
        aVar.b(Participant.LABELS, participant2);
        aVar.b(Participant.BUBBLES, participant2);
        tje.N(this.c, null, null, new LayersIntersectionRules$checkIntersections$1(this, null), 3);
        Participant participant4 = Participant.PICKUP_POINT_MULTIEXIT_LABELS_COLLECTION;
        aVar.b(participant4, participant4);
        Participant participant5 = Participant.PICKUP_POINT_BUBBLES_COLLECTION;
        aVar.b(participant5, participant5);
        aVar.b(participant5, Participant.CLARIFY_POINT_BUBBLE);
    }
}
