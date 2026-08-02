package com.squareup.cash.cdf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class NotificationType {
    public static final /* synthetic */ NotificationType[] $VALUES;
    public static final NotificationType APP_MESSAGE_ACTION;
    public static final NotificationType CLIENT_ROUTE;
    public static final NotificationType CLIENT_ROUTE_BACKGROUND;
    public static final NotificationType CLIENT_ROUTE_CLIENT_SCENARIO;
    public static final NotificationType DEVICE_CHALLENGE;
    public static final NotificationType GET_PROFILE;
    public static final NotificationType GET_REWARDS;
    public static final NotificationType HOME;
    public static final NotificationType NEW_CHAT_MESSAGE;
    public static final NotificationType OTHER;
    public static final NotificationType PASSCODE_CHANGE;
    public static final NotificationType PAYMENT;
    public static final NotificationType URL;

    static {
        NotificationType notificationType = new NotificationType("HOME", 0);
        HOME = notificationType;
        NotificationType notificationType2 = new NotificationType("APP_MESSAGE_ACTION", 1);
        APP_MESSAGE_ACTION = notificationType2;
        NotificationType notificationType3 = new NotificationType("URL", 2);
        URL = notificationType3;
        NotificationType notificationType4 = new NotificationType("CLIENT_ROUTE", 3);
        CLIENT_ROUTE = notificationType4;
        NotificationType notificationType5 = new NotificationType("CLIENT_ROUTE_BACKGROUND", 4);
        CLIENT_ROUTE_BACKGROUND = notificationType5;
        NotificationType notificationType6 = new NotificationType("CLIENT_ROUTE_CLIENT_SCENARIO", 5);
        CLIENT_ROUTE_CLIENT_SCENARIO = notificationType6;
        NotificationType notificationType7 = new NotificationType("NEW_CHAT_MESSAGE", 6);
        NEW_CHAT_MESSAGE = notificationType7;
        NotificationType notificationType8 = new NotificationType("PAYMENT", 7);
        PAYMENT = notificationType8;
        NotificationType notificationType9 = new NotificationType("DEVICE_CHALLENGE", 8);
        DEVICE_CHALLENGE = notificationType9;
        NotificationType notificationType10 = new NotificationType("GET_PROFILE", 9);
        GET_PROFILE = notificationType10;
        NotificationType notificationType11 = new NotificationType("INSTRUMENT_UPDATE", 10);
        NotificationType notificationType12 = new NotificationType("GET_REWARDS", 11);
        GET_REWARDS = notificationType12;
        NotificationType notificationType13 = new NotificationType("PASSCODE_CHANGE", 12);
        PASSCODE_CHANGE = notificationType13;
        NotificationType notificationType14 = new NotificationType("OTHER", 13);
        OTHER = notificationType14;
        $VALUES = new NotificationType[]{notificationType, notificationType2, notificationType3, notificationType4, notificationType5, notificationType6, notificationType7, notificationType8, notificationType9, notificationType10, notificationType11, notificationType12, notificationType13, notificationType14};
    }

    public static NotificationType valueOf(String str) {
        return (NotificationType) Enum.valueOf(NotificationType.class, str);
    }

    public static NotificationType[] values() {
        return (NotificationType[]) $VALUES.clone();
    }
}
