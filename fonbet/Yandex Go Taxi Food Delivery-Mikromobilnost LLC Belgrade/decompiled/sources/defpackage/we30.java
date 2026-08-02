package defpackage;

import ru.yandex.taxi.masstransit.paymentcards.TransportCardAction;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class we30 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TransportCardAction.values().length];
        try {
            iArr[TransportCardAction.ADD_TRANSPORT_CARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TransportCardAction.OPEN_TRANSPORT_CARDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
