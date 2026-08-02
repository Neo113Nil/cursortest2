package ru.yandex.logistics.sdk.cargo_form.impl.model.widget;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"ru/yandex/logistics/sdk/cargo_form/impl/model/widget/BubbleToggleModel$Size", "", "Lru/yandex/logistics/sdk/cargo_form/impl/model/widget/BubbleToggleModel$Size;", "", "value", CA20Status.STATUS_USER_I, "a", "()I", "XS", "S", "M", "L", "sdk-delivery-cargo-form"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BubbleToggleModel$Size {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BubbleToggleModel$Size[] $VALUES;
    public static final BubbleToggleModel$Size L;
    public static final BubbleToggleModel$Size M;
    public static final BubbleToggleModel$Size S;
    public static final BubbleToggleModel$Size XS;
    private final int value;

    static {
        BubbleToggleModel$Size bubbleToggleModel$Size = new BubbleToggleModel$Size("XS", 0, 32);
        XS = bubbleToggleModel$Size;
        BubbleToggleModel$Size bubbleToggleModel$Size2 = new BubbleToggleModel$Size("S", 1, 40);
        S = bubbleToggleModel$Size2;
        BubbleToggleModel$Size bubbleToggleModel$Size3 = new BubbleToggleModel$Size("M", 2, 48);
        M = bubbleToggleModel$Size3;
        BubbleToggleModel$Size bubbleToggleModel$Size4 = new BubbleToggleModel$Size("L", 3, 56);
        L = bubbleToggleModel$Size4;
        BubbleToggleModel$Size[] bubbleToggleModel$SizeArr = {bubbleToggleModel$Size, bubbleToggleModel$Size2, bubbleToggleModel$Size3, bubbleToggleModel$Size4};
        $VALUES = bubbleToggleModel$SizeArr;
        $ENTRIES = a.a(bubbleToggleModel$SizeArr);
    }

    public BubbleToggleModel$Size(String str, int i, int i2) {
        this.value = i2;
    }

    public static BubbleToggleModel$Size valueOf(String str) {
        return (BubbleToggleModel$Size) Enum.valueOf(BubbleToggleModel$Size.class, str);
    }

    public static BubbleToggleModel$Size[] values() {
        return (BubbleToggleModel$Size[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getValue() {
        return this.value;
    }
}
