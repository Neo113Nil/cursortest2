package io.flutter.plugins.pathprovider;

import io.flutter.plugins.pathprovider.Messages;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class c {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Messages.StorageDirectory.values().length];
        a = iArr;
        try {
            iArr[Messages.StorageDirectory.ROOT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[Messages.StorageDirectory.MUSIC.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[Messages.StorageDirectory.PODCASTS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[Messages.StorageDirectory.RINGTONES.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[Messages.StorageDirectory.ALARMS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[Messages.StorageDirectory.NOTIFICATIONS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            a[Messages.StorageDirectory.PICTURES.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            a[Messages.StorageDirectory.MOVIES.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            a[Messages.StorageDirectory.DOWNLOADS.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            a[Messages.StorageDirectory.DCIM.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            a[Messages.StorageDirectory.DOCUMENTS.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
    }
}
