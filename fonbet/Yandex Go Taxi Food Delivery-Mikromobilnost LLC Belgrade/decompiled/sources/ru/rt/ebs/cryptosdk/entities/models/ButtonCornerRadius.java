package ru.rt.ebs.cryptosdk.entities.models;

import defpackage.k4o;
import defpackage.nz6;
import defpackage.owg0;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0018\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lru/rt/ebs/cryptosdk/entities/models/ButtonCornerRadius;", "", "", "dimenRes", CA20Status.STATUS_USER_I, "a", "()I", "Companion", "nz6", "DP_0", "DP_1", "DP_2", "DP_3", "DP_4", "DP_5", "DP_6", "DP_7", "DP_8", "DP_9", "DP_10", "DP_11", "DP_12", "DP_13", "DP_14", "DP_15", "DP_16", "cryptosdk_prodRelease"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes4.dex */
public final class ButtonCornerRadius {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ButtonCornerRadius[] $VALUES;
    public static final nz6 Companion;
    public static final ButtonCornerRadius DP_0;
    public static final ButtonCornerRadius DP_1;
    public static final ButtonCornerRadius DP_10;
    public static final ButtonCornerRadius DP_11;
    public static final ButtonCornerRadius DP_12;
    public static final ButtonCornerRadius DP_13;
    public static final ButtonCornerRadius DP_14;
    public static final ButtonCornerRadius DP_15;
    public static final ButtonCornerRadius DP_16;
    public static final ButtonCornerRadius DP_2;
    public static final ButtonCornerRadius DP_3;
    public static final ButtonCornerRadius DP_4;
    public static final ButtonCornerRadius DP_5;
    public static final ButtonCornerRadius DP_6;
    public static final ButtonCornerRadius DP_7;
    public static final ButtonCornerRadius DP_8;
    public static final ButtonCornerRadius DP_9;
    private final int dimenRes;

    static {
        ButtonCornerRadius buttonCornerRadius = new ButtonCornerRadius("DP_0", 0, owg0.ebssdk_button_corner_radius_0);
        DP_0 = buttonCornerRadius;
        ButtonCornerRadius buttonCornerRadius2 = new ButtonCornerRadius("DP_1", 1, owg0.ebssdk_button_corner_radius_1);
        DP_1 = buttonCornerRadius2;
        ButtonCornerRadius buttonCornerRadius3 = new ButtonCornerRadius("DP_2", 2, owg0.ebssdk_button_corner_radius_2);
        DP_2 = buttonCornerRadius3;
        ButtonCornerRadius buttonCornerRadius4 = new ButtonCornerRadius("DP_3", 3, owg0.ebssdk_button_corner_radius_3);
        DP_3 = buttonCornerRadius4;
        ButtonCornerRadius buttonCornerRadius5 = new ButtonCornerRadius("DP_4", 4, owg0.ebssdk_button_corner_radius_4);
        DP_4 = buttonCornerRadius5;
        ButtonCornerRadius buttonCornerRadius6 = new ButtonCornerRadius("DP_5", 5, owg0.ebssdk_button_corner_radius_5);
        DP_5 = buttonCornerRadius6;
        ButtonCornerRadius buttonCornerRadius7 = new ButtonCornerRadius("DP_6", 6, owg0.ebssdk_button_corner_radius_6);
        DP_6 = buttonCornerRadius7;
        ButtonCornerRadius buttonCornerRadius8 = new ButtonCornerRadius("DP_7", 7, owg0.ebssdk_button_corner_radius_7);
        DP_7 = buttonCornerRadius8;
        ButtonCornerRadius buttonCornerRadius9 = new ButtonCornerRadius("DP_8", 8, owg0.ebssdk_button_corner_radius_8);
        DP_8 = buttonCornerRadius9;
        ButtonCornerRadius buttonCornerRadius10 = new ButtonCornerRadius("DP_9", 9, owg0.ebssdk_button_corner_radius_9);
        DP_9 = buttonCornerRadius10;
        ButtonCornerRadius buttonCornerRadius11 = new ButtonCornerRadius("DP_10", 10, owg0.ebssdk_button_corner_radius_10);
        DP_10 = buttonCornerRadius11;
        ButtonCornerRadius buttonCornerRadius12 = new ButtonCornerRadius("DP_11", 11, owg0.ebssdk_button_corner_radius_11);
        DP_11 = buttonCornerRadius12;
        ButtonCornerRadius buttonCornerRadius13 = new ButtonCornerRadius("DP_12", 12, owg0.ebssdk_button_corner_radius_12);
        DP_12 = buttonCornerRadius13;
        ButtonCornerRadius buttonCornerRadius14 = new ButtonCornerRadius("DP_13", 13, owg0.ebssdk_button_corner_radius_13);
        DP_13 = buttonCornerRadius14;
        ButtonCornerRadius buttonCornerRadius15 = new ButtonCornerRadius("DP_14", 14, owg0.ebssdk_button_corner_radius_14);
        DP_14 = buttonCornerRadius15;
        ButtonCornerRadius buttonCornerRadius16 = new ButtonCornerRadius("DP_15", 15, owg0.ebssdk_button_corner_radius_15);
        DP_15 = buttonCornerRadius16;
        ButtonCornerRadius buttonCornerRadius17 = new ButtonCornerRadius("DP_16", 16, owg0.ebssdk_button_corner_radius_16);
        DP_16 = buttonCornerRadius17;
        ButtonCornerRadius[] buttonCornerRadiusArr = {buttonCornerRadius, buttonCornerRadius2, buttonCornerRadius3, buttonCornerRadius4, buttonCornerRadius5, buttonCornerRadius6, buttonCornerRadius7, buttonCornerRadius8, buttonCornerRadius9, buttonCornerRadius10, buttonCornerRadius11, buttonCornerRadius12, buttonCornerRadius13, buttonCornerRadius14, buttonCornerRadius15, buttonCornerRadius16, buttonCornerRadius17};
        $VALUES = buttonCornerRadiusArr;
        $ENTRIES = a.a(buttonCornerRadiusArr);
        Companion = new nz6();
    }

    public ButtonCornerRadius(String str, int i, int i2) {
        this.dimenRes = i2;
    }

    public static ButtonCornerRadius valueOf(String str) {
        return (ButtonCornerRadius) Enum.valueOf(ButtonCornerRadius.class, str);
    }

    public static ButtonCornerRadius[] values() {
        return (ButtonCornerRadius[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getDimenRes() {
        return this.dimenRes;
    }
}
